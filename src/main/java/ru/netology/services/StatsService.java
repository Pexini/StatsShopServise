package ru.netology.services;

public class StatsService {
    public long getSum(long[] mes) {
        long sum = 0;
        for (long num : mes) {
            sum += num;
        }
        return sum;
    }

    public long getAverage(long[] mes) {
        long averageSale = getSum(mes) / mes.length;
        return averageSale;
    }

    public int getMaxSale(long[] mes) {
        int maxsale = 0;
        for (int i = 0; i < mes.length; i++) {
            if (mes[i] >= mes[maxsale])
                maxsale = i;
        }
        return maxsale + 1;
    }

    public int getMinSale(long[] mes) {
        int mixsale = 0;
        for (int i = 0; i < mes.length; i++) {
            if (mes[i] <= mes[mixsale])
                mixsale = i;
        }
        return mixsale + 1;
    }

    public int getUnderAverage(long[] mes) {
        int counter = 0;
        long underAverage = getAverage(mes);
        for (long mess : mes) {
            if (mess < underAverage)
                counter++;
        }
        return counter;
    }

    public int getBeforeAverage(long[] mes) {
        int counter = 0;
        long underAverage = getAverage(mes);
        for (long mess : mes) {
            if (mess < underAverage)
                counter++;
        }
        return counter;
    }
    public int getAfterAverage(long[] mes) {
        int counter = 0;
        long afterAverage = getAverage(mes);
        for (long mess : mes) {
            if (mess > afterAverage)
                counter++;
        }
        return counter;
    }
}

//    public int getMaxSale(int[] mes) {
//
//        int maxSale = 0;
//        for (int i = 1; i < mes.length; i++) {
//            if (mes[i] > mes[maxSale]) {
//                maxSale = i;
//            }
//        }
//        return maxSale;
//    }
//
//    public int getMinSale(int[] mes) {
//
//        int mixSale = 0;
//        for (int i = 1; i < mes.length; i++) {
//            if (mes[i] < mes[mixSale]) {
//                mixSale = i;
//            }
//        }
//        return mixSale;
//    }
//


