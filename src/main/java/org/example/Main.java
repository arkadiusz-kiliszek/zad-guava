package org.example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static String STOP_CHAR = "-";

    public static void main(String[] args) {
        final HashMultiset<String> names = HashMultiset.create();
        String firstName;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj imię (znak \"" + STOP_CHAR + "\") jezeli chcesz zakończyć \n");
            firstName = scanner.nextLine();
            if (!firstName.equals(STOP_CHAR))
                names.add(firstName.toUpperCase());
        } while (!STOP_CHAR.equals(firstName));
        System.out.println("Liczba unikalnych imion: " + names.size());
        System.out.println(names);
        System.out.println("Jakie imie chcesz zliczyc?");
        names.count(scanner.nextLine());
    }
}