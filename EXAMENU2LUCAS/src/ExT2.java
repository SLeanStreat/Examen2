package org.example;

import java.util.Random;
import java.util.Scanner;

public class ExT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Intentos = 0;

        Random random = new Random();
        random.nextInt(1);

        int min = 0;
        int max = 100;

        int randomNum = random.nextInt(max - min);
        System.out.println(randomNum);
        System.out.println("Escriba un número");
        int num1 = scanner.nextInt();

        while (num1 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num1 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num1 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num2 = scanner.nextInt();
        while (num2 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num2 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num2 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num3 = scanner.nextInt();
        while (num3 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num3 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num3 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num4 = scanner.nextInt();
        while (num4 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num4 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num4 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num5 = scanner.nextInt();
        while (num5 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num5 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num5 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num6 = scanner.nextInt();
        while (num6 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num6 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num6 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num7 = scanner.nextInt();
        while (num7 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num7 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num7 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num8 = scanner.nextInt();
        while (num3 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num8 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num8 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num9 = scanner.nextInt();
        while (num9 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num9 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num9 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Escriba otro número");
        int num10 = scanner.nextInt();
        while (num10 > randomNum) {
            System.out.println("Es Mayor");
            break;
        }
        while (num10 < randomNum) {
            System.out.println("Es Menor");
            break;
        }
        while (num10 == randomNum) {
            System.out.println("Acerteste");
            break;
        }
        System.out.println("Terminaste todos los intentos, fallaste");
        }
    }





