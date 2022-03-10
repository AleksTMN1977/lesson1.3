package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        System.out.println("Задача2");
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS != 0 && clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
        System.out.println("Задача3");
        int year = 2021;
        int yearV = year % 400;
        int yearC = year % 4;
        int yearS = year % 100;
        if (yearV ==0 || yearC == 0 && yearS != 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год является невисокосным");
        }
        System.out.println("Задача4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки карты составит 1 день");
        } else {
            System.out.println("Срок доставки карты составит " + (deliveryDistance / 40 + 1) + " дн.");
        }
        System.out.println("Задача5");
        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


            }
        }



