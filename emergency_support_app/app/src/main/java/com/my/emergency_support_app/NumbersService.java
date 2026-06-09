package com.my.emergency_support_app;

import java.util.ArrayList;
import java.util.List;

public class NumbersService {

    private static List<String> familyNumbers = new ArrayList<>();
    private static List<String> helpNumbers = new ArrayList<>();

    public static void addFamilyNumber(String number) {
        familyNumbers.add(number);
    }

    public static void addHelpNumber(String number) {
        helpNumbers.add(number);
    }

    public static List<String> getFamilyNumbers() {
        return new ArrayList<>(familyNumbers);
    }

    public static List<String> getHelpNumbers() {
        return new ArrayList<>(helpNumbers);
    }
}
