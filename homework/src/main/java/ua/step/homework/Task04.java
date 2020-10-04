package ua.step.homework;

/**
 * Дана точка на плоскости заданная координатами x и y, определить и вывести в
 * консоль, в какой четверти находится точка. в прямоугольной системе
 * (декартовой) координат. Четверти обозначены римскими цифрами.
 * Прием x=1 y=11 Вывод I
 * Прием x=-2 y=-3 Вывод III
 *
 * См. Task04.png в папке  src/main/resources
 */
public class Task04 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        // строки ниже нужны для тестирования, не удаляйте ее и не изменяйте
        x = (args.length > 0) ? Integer.parseInt(args[0]) : x;
        y = (args.length > 1) ? Integer.parseInt(args[1]) : y;

        // пишите код ниже используя переменные объявленные выше, проверить
        // решение можно запустив @see TestTask04.java
        if(x>0&&y>0){ System.out.println("I");}
        if(x<0&&y>0){ System.out.println("II");}
        if(x<0&&y<0){ System.out.println("III");}
        if(x>0&&y<0){ System.out.println("IV");}
        // FIXME: Изменить вывод на корректный

    }
}