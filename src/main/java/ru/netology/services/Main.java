package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long [] mes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sumResult = service.getSum(mes);
        System.out.println("Сумма всех продаж " + sumResult);

        long averageResult = service.getAverage(mes);
        System.out.println("Среднее сумма продаж в месяц " + averageResult);

        int maxSaleResult = service.getMaxSale(mes);
        System.out.println( "Максимальные продажи в месяце № " + maxSaleResult);

        int minSaleResult = service.getMinSale(mes);
        System.out.println( "Миниимальные продажи в месяце № " + minSaleResult);

        int beforeAverageResult = service.getBeforeAverage(mes);
        System.out.println( "Количество месяцев с продажами меньше среднего показателя " + beforeAverageResult + " месяцев ");

        int afterAverageResult = service.getAfterAverage(mes);
        System.out.println( "Количество месяцев с продажами выше среднего показателя " + afterAverageResult + " месяцев ");

    }

}
