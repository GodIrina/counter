package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceCounterTest {

    @org.junit.jupiter.api.Test
    void counterLeftBorder() {
        SQRServiceCounter service = new SQRServiceCounter();
        int startNum = 95;
        int endNum = 99;
        int expected = 0;
        int actual = service.numbersCounter(startNum, endNum);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void counterRightBorder() {
        SQRServiceCounter service = new SQRServiceCounter();
        int startNum = 9802;
        int endNum = 10000;
        int expected = 0;
        int actual = service.numbersCounter(startNum, endNum);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void counterWorkBorder() {
        SQRServiceCounter service = new SQRServiceCounter();
        int startNum = 200;
        int endNum = 600;
        int expected = 10;
        int actual = service.numbersCounter(startNum, endNum);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void counterBorder() {
        SQRServiceCounter service = new SQRServiceCounter();
        int startNum = 100;
        int endNum = 9801;
        int expected = 90;
        int actual = service.numbersCounter(startNum, endNum);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void counterWorkBorder2() {
        SQRServiceCounter service = new SQRServiceCounter();
        int startNum = 500;
        int endNum = 5000;
        int expected = 48;
        int actual = service.numbersCounter(startNum, endNum);
        assertEquals(expected, actual);
    }


}