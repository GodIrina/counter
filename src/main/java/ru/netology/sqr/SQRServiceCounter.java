package ru.netology.sqr;

public class SQRServiceCounter {
    public int numbersCounter(int startNum, int endNum) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= startNum && i * i <= endNum) counter++;

        }

        return counter;
    }
}