package ua.step.homework;

/**
 * Задание 2
 * 
 * В переменной n хранится натуральное (целое) трехзначное число. Создайте
 * программу, вычисляющую и выводящую на экран сумму цифр числа n при любых
 * значения n.
 * 
 */
public class Task02 {
    public static void main(String[] args) {
        int n = 627,t=0;;
        // строка кода ниже нужна для тестирования (@see TestTask02.java)
        // не изменяйте и не удаляйте ее
        n = (args.length == 1) ? Integer.parseInt(args[0]) : n;
        // используй переменную с именем n в качестве входных данных
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            t += n % 10;
            n = n / 10;
        }
        System.out.println(t);
        // FIXME: Здесь будет ваш код. Удалите эту строку после выполнения задания
    }
}