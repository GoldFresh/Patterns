package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    public DataGenerator() {
    }

    public static class Registration {
        private Registration() {}

        public static RegistrationByCardInfo generateByCard(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return new RegistrationByCardInfo(
                    faker.address().cityName(),
                    faker.name().firstName() + " " + faker.name().lastName(),
                    faker.phoneNumber().phoneNumber());
        }

        public static String generateDate(int days) {
            return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }

         /*public static String generateCity(String locale) {
            List<String> cities = new ArrayList<>();
            cities.add("Москва");
            cities.add("Санкт-Петербург");
            cities.add("Воронеж");
            cities.add("Архангельск");
            cities.add("Ростов-на-Дону");
            cities.add("Пермь");
            cities.add("Екатеринбург");
            cities.add("Томск");
            cities.add("Краснодар");

            Random random = new Random();
            String city = cities.get(random.nextInt(cities.size()));
            return city;
        }*/

        /*public static String generateNumber(String locale) {
            List<String> numbers = new ArrayList<>();
            numbers.add("+79031111111");
            numbers.add("+79031111112");
            numbers.add("+79031111113");
            numbers.add("+79031111114");
            numbers.add("+79031111115");
            numbers.add("+79031111116");
            numbers.add("+79031111117");
            numbers.add("+79031111118");
            numbers.add("+79031111119");

            Random random = new Random();
            String number = numbers.get(random.nextInt(numbers.size()));
            return number;
        }*/
    }
}
