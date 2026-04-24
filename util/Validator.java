package util;

import exception.InvalidDataException;

public class Validator {

    public static void validateAge(int age) {
        if (age < 0) {
            throw new InvalidDataException("Invalid age");
        }
    }

    public static void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Invalid name");
        }
    }
}