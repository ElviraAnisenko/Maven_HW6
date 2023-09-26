package org.example.JavaHomework6.ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ShouldFindSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actuallySum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actuallySum);
    }

    @Test
    public void ShouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actuallyAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actuallyAverage);
    }

    @Test
    public void ShouldFindMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actuallyMaxMonth = service.monthMaxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actuallyMaxMonth);
    }

    @Test
    public void ShouldFindMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actuallyMinMonth = service.monthMinSales(sales);
        Assertions.assertEquals(expectedMinMonth, actuallyMinMonth);
    }

    @Test
    public void ShouldFindLessAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLessAverageMonth = 5;
        int actuallyLessAverageMonth = service.monthLessAverageSales(sales);
        Assertions.assertEquals(expectedLessAverageMonth, expectedLessAverageMonth);
    }

    @Test
    public void ShouldFindMoreAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMoreAverageMonth = 4;
        int actuallyMoreAverageMonth = service.monthMoreAverageSales(sales);
        Assertions.assertEquals(expectedMoreAverageMonth, expectedMoreAverageMonth);
    }

}
