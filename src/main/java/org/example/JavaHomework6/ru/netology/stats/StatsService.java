package org.example.JavaHomework6.ru.netology.stats;

public class StatsService {
    // сумма всех продаж
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    // среднее значение продаж
    public int averageSales(int[] sales) {
        int average = sumSales(sales) / 12;
        return average;
    }

    //номер месяца, в котором был пик продаж
    public int monthMaxSales(int[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    //номер месяца, в котором был минимум продаж
    public int monthMinSales(int[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int monthLessAverageSales(int[] sales) {
        int monthLessAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSales(sales) > sales[i]) {
                monthLessAverage = monthLessAverage + 1;
            }
        }
        return monthLessAverage;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int monthMoreAverageSales(int[] sales) {
        int monthMoreAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSales(sales) < sales[i]) {
                monthMoreAverage = monthMoreAverage + 1;
            }
        }
        return monthMoreAverage;
    }
}
