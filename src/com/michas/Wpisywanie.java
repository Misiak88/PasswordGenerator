package com.michas;

import java.util.Scanner;

public class Wpisywanie {

    public static void Przywitanie (){

        System.out.println("Witaj, prosze podaj z ilu powinnien składać się twoje nowe hasło");
        System.out.println();

    }
    public static int WprowadzanieDanych(){

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
