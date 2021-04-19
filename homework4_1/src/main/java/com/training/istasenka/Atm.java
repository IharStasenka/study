package com.training.istasenka;

import java.math.BigDecimal;

public class Atm {
    private  Card card;

    public void setCard(Card card) {
        this.card = card;
    }

    public void showBalance() {
        if (card != null) {
            System.out.println("Balance of the card is "
                    + card.getCardBalance());
        } else {
            throw new IllegalArgumentException("Please insert your card");
        }
    }

    public BigDecimal putOnCard(final BigDecimal cash) {

        if (card != null) {
            card.addToCardBalance(cash);
        } else {
            throw new IllegalArgumentException("Please insert your card");
        }
        return card.getCardBalance();
    }

    public BigDecimal withdrawFromCard(final BigDecimal cash) {

        if (card != null) {
            card.withdrawFromCardBalance(cash);
        } else {
            throw new IllegalArgumentException("Please insert your card");
        }
        return card.getCardBalance();
    }
}