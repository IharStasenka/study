package com.training.istasenka;

import java.math.BigDecimal;

public interface Card {

    String getCardHolderName();

    BigDecimal getCardBalance();

    BigDecimal addToCardBalance(BigDecimal addedCash);

    BigDecimal withdrawFromCardBalance(BigDecimal withdrawnCash);
}