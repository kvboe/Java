package Slab1;

import java.util.Scanner;

public class Main {

   public enum Gatunki {komedia, dramat, akcji, przygodowy, familijny, thriller}

    public static void main(String[] args) {
       Aktor Zenek = new Aktor("Zenek", "Martyniuk", 3);
       Aktor Adam = new Aktor("Adam", "Sandler");

       Adam.getInfo();
       Zenek.getInfo();

        System.out.println("Wpisz liczbę Oscarow dla " + Adam.name + " " + Adam.lastname + " : ");
        Scanner scan = new Scanner(System.in);
        Adam.oscars = scan.nextInt();
        scan.nextLine();
        Adam.getInfo();

        Film film1 = new Film();

        film1.release[6] = 1990;
        System.out.println(film1.release[6]);

        Film film2 = new Film();

        System.out.println("Podaj nazwe filmu: ");
        film1.tittle = scan.nextLine();

        film1.temp_release = 1;
        film1.filmoscars = 4;
        film1.gatunek = Gatunki.komedia;

        System.out.println(film1.tittle + " - " + film1.gatunek + " " + film1.getRelease(film1.temp_release) + " i zdobył: " + film1.filmoscars + " Oscary!");


        System.out.println("Podaj nazwe kolejnego filmu: ");
        film2.tittle = scan.nextLine();

        film2.temp_release = 4;
        film2.filmoscars = 13;
        film2.gatunek = Gatunki.akcji;

        System.out.println(film2.tittle + " - " + film2.gatunek + " " + film1.getRelease(film1.temp_release) + " i zdobył: " + film2.filmoscars + " Oscary!");


        System.out.println(film1.lastYear());
        System.out.println(film1.nearYear(1988));


    }
}
