package ua.step.homework;

/**
 * Задание 8
 * 
 * В переменных х и y хранятся два натуральных числа. Создайте программу,
 * выводящую на консоль число, которое является минимальном значением из
 * переменных x и y.
 * 
 */
public class Task08 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        // строки ниже нужны для тестирования, не удаляйте ее и не изменяйте
        x = (args.length == 0) ? x : Integer.parseInt(args[0]);
        y = (args.length == 0) ? y : Integer.parseInt(args[1]);
        // пишите код ниже используя переменные объявленные выше, проверить
        // решение можно запустив @see TestTask08.java
        System.out.println( x<y ? x:y);
        // FIXME: Здесь будет ваш код. Удалите эту строку после выполнения задания
    }
}