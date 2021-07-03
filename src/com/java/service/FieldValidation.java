package com.java.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FieldValidation {
    public boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
