package ru.netology.javaqamid.Javaqamid75relax.services;

public class RelaxService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
