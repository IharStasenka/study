package com.training.istasenka;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class CreditCard implements Card {
    private final String cardHolderName;
    private BigDecimal cardBalance;

    public CreditCard(final String cardHolderName, BigDecimal cardBalance) {
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance.setScale(2, HALF_UP);
    }

    public CreditCard(final String cardHolderName) {

        this.cardHolderName = cardHolderName;
        cardBalance = BigDecimal.ZERO;
    }

    @Override
    public String getCardHolderName() {

        return cardHolderName;
    }

    @Override
    public BigDecimal getCardBalance() {

        return cardBalance.setScale(2, HALF_UP);
    }

    @Override
    public BigDecimal addToCardBalance(final BigDecimal addedCash) {
        cardBalance =
                cardBalance.add(addedCash).setScale(2, HALF_UP);
        return cardBalance;
    }

    @Override
    public BigDecimal withdrawFromCardBalance(final BigDecimal withdrawnCash) {
        cardBalance =
                cardBalance.subtract(withdrawnCash).setScale(2, HALF_UP);
        return cardBalance;
    }
}