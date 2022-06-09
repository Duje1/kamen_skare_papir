package com.duje.kamen_skare_papir;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int unos, odabir;
    static int igrac = 0;
    static int kompjuter = 0;


    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);


    public static final String kamen = "Kamen";
    public static final String skare = "Skare";
    public static final String papir = "Papir";

    public static void main(String[] args) {


        for (; ; ) {
            System.out.println("Igrac: " + igrac + "\t kompjuter: " + kompjuter);
            potezIgraca();

            potezKompjutera();

            provjeriRezultat();

            System.out.println("\n");

        }

    }

    private static void provjeriRezultat() {
        if (unos == odabir + 1)
            System.out.println("Izjednaceno!");
        else if (unos == 1 && odabir == 1) {
            System.out.println("Igrac je pobjedio");
            igrac++;
        } else if (unos == 2 && odabir == 2) {
            System.out.println("Igrac je pobjedio");
            igrac++;
        } else if (unos == 3 && odabir == 0) {
            System.out.println("Igrac je pobjedio");
            igrac++;
        } else {
            System.out.println("Kompjuter je pobjedio");
            kompjuter++;
        }
    }


    private static void potezKompjutera() {
        System.out.print("Kompjuter je odabrao: ");
        odabir = rand.nextInt(3);
        switch (odabir) {
            case 0:
                System.out.println(kamen);
                break;
            case 1:
                System.out.println(skare);
                break;
            case 2:
                System.out.println(papir);
                break;
            default:
        }
    }

    private static void potezIgraca() {
        System.out.print("1. Kamen\n2. Skare\n3. Papir\nUnesite (1-3):\t");
        //korisnik
        unos = sc.nextInt();
        while (unos < 1 || unos > 3) {
            System.out.print("Krivi unos!\nUnesite ponovno: ");
            unos = sc.nextInt();
        }
    }

}
