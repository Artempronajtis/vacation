package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FreelancePlannerTest {
    @Test
    public void calculateRestMonths_shouldReturnCorrectRestMonths() {
        FreelancePlanner planner = new FreelancePlanner();

        // задаем параметры
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        // ожидаем результат
        int expectedRestMonths = 2;

        // проверяем
        int actualRestMonths = planner.calculateRestMonths(income, expenses, threshold);

        assertEquals(expectedRestMonths, actualRestMonths);

    }
}

