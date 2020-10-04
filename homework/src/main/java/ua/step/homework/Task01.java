package ua.step.homework;

import java.util.Scanner;

/**
 * Написать программу, которая предлагает пользователю ввести номер дня недели,
 * и в ответ показывает название этого дня (например, 6 – это суббота).
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели от 1 до 7, где 1 это понедельник: ");
        int i = scanner.nextInt();
  switch(i){
      case 1: {
          System.out.println("Понедельник");break;}
      case 2: {System.out.println("Вторник");break;}
      case 3: {System.out.println("Среда");break;}
      case 4: {System.out.println("Четверг");break;}
      case 5: {System.out.println("Пятница");break;}
      case 6: {System.out.println("Суббота");break;}
      case 7: {System.out.println("Воскресенье");break;}
      }
        // TODO: здесь ваш код

    }
}