/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 25.05.2022
 * \* ----- group JAVA-27 -----
 * \*
 * \* Description: Домашнее задание к занятию 1.4 Коллекции для параллельной (конкурирующей) работы.
 * \*
 * \* Задача: 1.Колл-центр
 * \
 */
public class Main {
    public static final int CALLS = 60;
    public static final int SPECIALISTS = 10;

    public static void main(String[] args) {
        CallCenter center = new CallCenter();
        for (int i = 1; i <= CALLS; i++) {
            new Thread(null, center::call, "№ " + i).start();
        }
        for (int i = 1; i <= SPECIALISTS; i++) {
            new Thread(null, center::takeTheCall, "№ " + i).start();
        }
    }
}