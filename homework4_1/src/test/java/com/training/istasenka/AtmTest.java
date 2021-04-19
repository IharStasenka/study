package com.training.istasenka;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class AtmTest {
    Atm atm = new Atm();
    Card card = new CreditCard("Ihar",  new BigDecimal("100"));

    @Test (expected = IllegalArgumentException.class)
    public void testShowBalanceException() {
        atm.showBalance();
    }

    @Test
    public void testPutOnCard() {
        atm.setCard(card);
        BigDecimal addedCash = new BigDecimal("100.00");
        BigDecimal expected = new BigDecimal("200.00");
        assertEquals(expected, atm.putOnCard(addedCash));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPutOnCardException() {
        BigDecimal addedCash = new BigDecimal("100.00");
        atm.putOnCard(addedCash);
    }

    @Test
    public void testWithdrawFromCard() {
        atm.setCard(card);
        BigDecimal withdrawnCash = new BigDecimal("10.00");
        BigDecimal expected = new BigDecimal("90.00");
        assertEquals(expected, atm.withdrawFromCard(withdrawnCash));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testWithdrawFromCardException() {
        BigDecimal withdrawnCash = new BigDecimal("10.00");
        atm.putOnCard(withdrawnCash);
    }
}