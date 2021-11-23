package com.company;

import javax.swing.*;

public class CheckNumber {

    public static void check(){
        String input = JOptionPane.showInputDialog("Wpisz liczbę:");
        if (input == null || input.length() == 0) {
            JOptionPane.showMessageDialog(null, "Musisz podac liczbe!");
        } else {
            try {
                int liczba = Integer.parseInt(input);
                if (liczba % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "Liczba " + liczba
                            + " jest parzysta!");
                } else {
                    JOptionPane.showMessageDialog(null, "Liczbaa " + liczba
                            + " nie jest parzysta!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Nie podałeś liczby naturalnej!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
