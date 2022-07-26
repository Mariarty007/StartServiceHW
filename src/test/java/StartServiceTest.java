import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StartService;


public class StartServiceTest {

    private int[] totalSales = {8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18};
    private int[] everySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    // 1 тест - сумма продаж
    @Test
    public void shouldSum() {
        StartService service = new StartService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSales(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(actual, expected);
    }
    // 2 тест - ср арифметическое

    @Test
    public void averageSales() {
        StartService service = new StartService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.sumSales(sales) / sales.length;
        Assertions.assertEquals(15, result);

    }

    // 3 тест максимум продаж
    @Test
    public void shouldFindMaxSales() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    // 4 тест - минимальные продажи
    @Test
    public void shouldFindMinSales() {
        StartService service = new StartService();

        int result = service.minSales(everySales);

        Assertions.assertEquals(9, result);
    }

    // 5 тест - Кол-во месяцев, в которых продажи были ниже среднего

    @Test
    public void findMonthBelowAverage() {

        StartService service = new StartService();
        int result = service.belowAverage(everySales);
        Assertions.assertEquals(5, result);
    }

// 6 тест - Кол-во месяцев, в которых продажи были выше среднего

    @Test
    public void findMonthAboveAverage() {

        StartService service = new StartService();
        int result = service.aboveAverage(everySales);
        Assertions.assertEquals(5, result);
    }
}



