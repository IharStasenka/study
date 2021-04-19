package com.training.istasenka;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class DebitCard implements Card {
    private final String cardHolderName;
    private BigDecimal cardBalance;

    public DebitCard(final String cardHolderName, BigDecimal cardBalance) {
        if (cardBalance.compareTo(BigDecimal.ZERO) >= 0) {
            this.cardHolderName = cardHolderName;
            this.cardBalance = cardBalance.setScale(2, HALF_UP);
        } else {
            throw new IllegalArgumentException(
                    "It's impossible to create a debit card with "
                    + " negative balance.");
        }
    }

    public DebitCard(final String cardHolderName) {
        this.cardHolderName = cardHolderName;
        cardBalance = BigDecimal.ZERO;
    }

    @Override
    public String getCardHolderName() {
        return cardHolderName;
    }

    @Override
    public BigDecimal getCardBalance() {
        return cardBalance;
    }

    @Override
    public BigDecimal addToCardBalance(final BigDecimal addedCash) {
        cardBalance =
                cardBalance.add(addedCash).setScale(2, HALF_UP);
        return cardBalance;
    }

    @Override
    public BigDecimal withdrawFromCardBalance(final BigDecimal withdrawnCash) {
        if (cardBalance.compareTo(withdrawnCash) >= 0) {
            cardBalance =
                    cardBalance.subtract(withdrawnCash).setScale(2, HALF_UP);
        } else {
            throw new IllegalArgumentException(
                    "There are not enough money on the card balance");
        }
        return cardBalance;
    }
}