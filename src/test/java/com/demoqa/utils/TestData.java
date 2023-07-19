package com.demoqa.utils;

public class TestData {

    RandomUtils random = new RandomUtils();

    public String firstName = random.getRandomFirstName(),
            lastName = random.getRandomLastName(),
            userEmail = random.getRandomUserEmail(),
            gender = random.getRandomGender(),
            userNumber = random.getRandomPhone(),
            birthDay = random.getRandomDay(),
            birthMonth = random.getRandomMonth(),
            birthYear = random.getRandomYear(),
            subject_1 = random.getRandomSubject(),
            subject_2 = random.getRandomSubject(),
            hobby_1 = random.getRandomHobby(),
            hobby_2 = random.getRandomHobby(),
            picture = "Toolsqa.jpg",
            currentAddress = random.getRandomAddress(),
            state = random.getRandomState(),
            city = random.getRandomCity(state),
            modalDialogTitle = "Thanks for submitting the form";
}
