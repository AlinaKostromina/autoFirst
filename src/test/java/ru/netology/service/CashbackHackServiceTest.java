package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue533() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2467;
        int actual = service.remain(amount);
        int expected = 533;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue891() {
        CashbackHackService service = new CashbackHackService();
        int amount = 109;
        int actual = service.remain(amount);
        int expected = 891;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValue1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainValueIfNegativeValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = -506;
        int actual = service.remain(amount);
        int expected = 1506;
        assertEquals(actual, expected);
    }
}
