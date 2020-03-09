package com.company;

import java.util.*;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);
    private CsvFile csvFile = new CsvFile();


    public void displayMenu() {
        do {
            System.out.printf("Vælg Følgende: \n" +
                    "1. Udskriv 4 kolonner: \n" +
                    "2. Udskriv en skuespiller");


            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    csvFile.readCsv();


                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        } while (true);
    }

}

