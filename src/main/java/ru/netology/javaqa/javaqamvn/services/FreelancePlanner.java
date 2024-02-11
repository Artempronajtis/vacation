package ru.netology.javaqa.javaqamvn.services;

public class FreelancePlanner {
    public static int calculateRestMonths(int income, int expenses, int threshold) {
        int restMonths = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                // отдыхаем
                restMonths++;
                money -= expenses;
                money -= expenses * 3; // траты на отдых
            } else {
                // работаем
                money += income;
                money -= expenses;
            }
        }

        return restMonths;

    }
}




