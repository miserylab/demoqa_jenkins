package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomUtils {
    Faker faker = new Faker();

    public String getRandomFirstName() {
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomUserEmail() {
        return faker.internet().emailAddress();
    }

    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
    }

    public String getRandomPhone() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getRandomDay () {
        return String.format("%02d", faker.number().numberBetween(1, 28));
    }

    public String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(months);
    }

    public String getRandomYear () {
        return String.valueOf(faker.number().numberBetween(1900, 2000));
    }

    private final List<String> subjects = new ArrayList<>(Arrays.asList("Chemistry", "Physics", "Maths", "Commerce", "English"));

    public String getRandomSubject() {
        String subject = faker.options().option(subjects.toArray(new String[0]));
        subjects.remove(subject);
        return subject;
    }

    private final List<String> hobbies = new ArrayList<>(Arrays.asList("Sports", "Reading", "Music"));

    public String getRandomHobby() {
        String hobby = faker.options().option(hobbies.toArray(new String[0]));
        hobbies.remove(hobby);
        return hobby;
    }

    public String getRandomAddress() {
        return faker.address().fullAddress();
    }

    public String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(states);
    }

    public String getRandomCity(String state) {
        switch (state) {
            case "NCR" -> {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(city);
            }
            case "Uttar Pradesh" -> {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(city);
            }
            case "Haryana" -> {
                String[] city = {"Karnal", "Panipat"};
                return faker.options().option(city);
            }
            case "Rajasthan" -> {
                String[] city = {"Jaipur", "Jaiselmer"};
                return faker.options().option(city);
            }
        }
        return null;
    }
}
