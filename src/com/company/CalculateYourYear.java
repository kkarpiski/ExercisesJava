package com.company;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class CalculateYourYear {

    public static void calculateYear(){
        int year, answer, yearNow;

        ZonedDateTime startDateTime  = ZonedDateTime.now();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok swojego urodzenia: ");

        year = scanner.nextInt();
        yearNow = startDateTime.getYear();

        answer = (yearNow - year);

        System.out.println("Twój wiek to: " + answer);
    }

}
