package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceCounterTest {

    @org.junit.jupiter.api.Test
    void counterLeftBorder() {
        SQRServiceCounter service = new SQRServiceCounter();
        int startnum = 95;
        int endnum = 99;
        int expected = 0;
        int actual = service.counter(startnum,endnum);
        assertEquals (expected,actual);
    }
    @org.junit.jupiter.api.Test
    void counterRightBorder(){
        SQRServiceCounter service = new SQRServiceCounter();
        int startnum = 9802;
        int endnum = 10000;
        int expected = 0;
        int actual = service.counter(startnum,endnum);
        assertEquals (expected,actual);

    }
    @org.junit.jupiter.api.Test
    void counterWorkBorder(){
        SQRServiceCounter service = new SQRServiceCounter();
        int startnum = 200;
        int endnum = 600;
        int expected = 10;
        int actual = service.counter(startnum,endnum);
        assertEquals (expected,actual);

    }
    @org.junit.jupiter.api.Test
    void counterBorder(){
        SQRServiceCounter service = new SQRServiceCounter();
        int startnum = 100;
        int endnum = 9801;
        int expected = 90;
        int actual = service.counter(startnum,endnum);
        assertEquals (expected,actual);

    }
    @org.junit.jupiter.api.Test
    void counterWorkBorder2() {
        SQRServiceCounter service = new SQRServiceCounter();
        int startnum = 500;
        int endnum = 5000;
        int expected = 48;
        int actual = service.counter(startnum, endnum);
        assertEquals(expected, actual);
    }


}