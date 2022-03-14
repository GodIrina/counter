package ru.netology.sqr;

public class SQRServiceCounter {
    public int counter(int startnum, int endnum) {
        int j = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= startnum & i * i <= endnum) j++;
            ///if (i * i >= startnum & i * i <= endnum)
                //System.out.println("Цифры квадрат которых попал в диапазон - " + i);
        }

        return j;
    }
}