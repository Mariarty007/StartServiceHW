package ru.netology.stats;


public class StartService {


// 1 метод - всего sales

    public int sumSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

// 2 метод - среднее всех продаж

    public int averageSales(int[] sale) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = sumSales(sales) / sales.length;
        return result;
    }
    // 3 метод - Номер месяца, в котором был пик продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    // 4 метод - номер месяца минимальных продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    // 5 метод Кол-во месяцев, в которых продажи были ниже среднего
    public int belowAverage(int[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                months = months + 1;
            }
        }
        return months;

    }

    // 6 метод Кол-во месяцев, в которых продажи были выше среднего
    public int aboveAverage(int[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                months = months + 1;
            }
        }
        return months;
    }
}
