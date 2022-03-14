package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRServiceCounter service = new SQRServiceCounter();
        int amount = service.counter(200, 300);
        System.out.println("Кол-во цифр попадающих в диапазон - " + amount);

    }
}

