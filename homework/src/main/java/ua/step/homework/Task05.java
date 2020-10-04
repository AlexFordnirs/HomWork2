package ua.step.homework;

import java.util.Scanner;

/**
 * Напишите программу, которая будет проверять является ли число введённое с
 * клавиатуры палиндромом (одинаково читающееся в обоих направлениях). Например
 * 123454321 или 221122 — палиндром. Не использовать строки. Если число
 * полиндром программа должна вывести Yes иначе No
 */
public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = scanner.nextInt();
        int HHT=value;
        int count = (value == 0) ? 1 : 0;
        while (value != 0) {
            count++;
            value /= 10;
        }
        int t=0;
        int[] b = new int[count];
        for (int i = 0; i < b.length; i++) {
            b[i]= HHT % 10;
            HHT = HHT / 10;
        }
        boolean isPolindrom = true;
        for(int i=0; i < b.length;i++) {
            if(b[i] != b[b.length-i-1]){
                isPolindrom=false;
                break;
            }
        }
        System.out.println( isPolindrom ? "yes":"no");
        // TODO: Здесь Ваш код.
        // Необходимо вывести Yes - если введенное число палиндром
        //                    No  - если введенное число НЕ палиндром


    }
}
