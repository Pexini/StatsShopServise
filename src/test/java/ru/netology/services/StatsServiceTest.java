package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSumMes() {
        StatsService service = new StatsService();
        long[] mes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.getSum(mes);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] mes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.getSum(mes) / mes.length;
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] mes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.getMaxSale(mes);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] mes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.getMinSale(mes);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBeforeAverage() {
        StatsService service = new StatsService();
        long[] mes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.getBeforeAverage(mes);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAfterAverage() {
        StatsService service = new StatsService();
        long[] mes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.getAfterAverage(mes);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
