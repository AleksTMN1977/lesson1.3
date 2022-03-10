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



            }
        }



