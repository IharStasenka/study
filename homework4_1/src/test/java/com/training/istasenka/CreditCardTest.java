package com.training.istasenka;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    BigDecimal cardBalanceMock = BigDecimal.valueOf(100);
    Card card =new CreditCard("Ihar", cardBalanceMock);

    @Test
    public void addToCreditCardBalanceTest(){
        BigDecimal addedCash = new BigDecimal("100.00");
        BigDecimal expected = new BigDecimal("200.00");
        assertEquals(expected, card.addToCardBalance(addedCash));
    }

    @Test
    public void withdrawFromCardBalanceTest(){
        BigDecimal withdrawnCash = new BigDecimal("80.026");
        BigDecimal expected = new BigDecimal("19.97");
        assertEquals(expected, card.withdrawFromCardBalance(withdrawnCash));
    }
}