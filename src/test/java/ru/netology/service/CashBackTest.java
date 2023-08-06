package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;
/*import org.testng.annotations.Test;
import org.testng.Assert;*/


public class CashBackTest {
    @Test
    public void ifAmountLessReturnCashBack() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void ifAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void ifAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

}
