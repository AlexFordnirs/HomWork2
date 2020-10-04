package ua.step.homework;

import java.util.Scanner;

/**
 * Задание: Необходимо нарисовать ёлочку символом звёздочки. Каждый новый ярус должен
 * быть шире предыдущего. С клавиатуры вводится высота первого (верхнего) яруса ёлочки
 * (количество строк в ярусе) и количество ярусов,. Ёлочка должна
 * быть симметричная.
 *
 * Пример. Для a = 3, i = 3 программа выведет в консоль:
 *
 *       *
 *      ***
 *     *****
 *       *
 *      ***
 *     *****
 *    *******
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *
 *  Для a = 4, i = 2 программа выведет в коносль:
 *
 *      *
 *     ***
 *    *****
 *   *******
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 */
public class Task09 {
    public static void main(String[] args) {
        // TODO: этот код необходимо оставить неизменным для теста @see TaskTest09.java
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ярусови и высоту первого (верхнего) яруса через пробел: ");
        int a = scanner.nextInt();
        int i = scanner.nextInt();
        scanner.close();
        char imo='*';int y=1,j=a,jh=i-1;
        for (int it=0;it<i;it++)
        {
            for(int t=0;t<a;t++)
            {
                for(int h=0;h<j+jh-1;h++)
               {System.out.print(" ");}
                for(int u=0;u<y;u++){System.out.print(imo);}
                System.out.print("\n");
                y+=2;
                j--;
            }
            y=1;
            a++;
            j=a;
            --jh;

        }
        // TODO: Здесь Ваш код

    }
}
