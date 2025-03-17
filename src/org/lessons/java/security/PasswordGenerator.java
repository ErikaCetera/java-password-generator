package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        String nome;
        String cognome;
        String colorePreferito;
        int giornoNascita;
        int meseNascita;
        int annoNascita;

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome, cognome, colore preferito e data di nascita (gg mm aaaa): ");
        nome = input.nextLine();
        cognome = input.nextLine();
        colorePreferito = input.nextLine();
        giornoNascita = input.nextInt();
        meseNascita = input.nextInt();
        annoNascita = input.nextInt();

        int sommaData = giornoNascita + meseNascita + annoNascita;

        String pswGenerata = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaData;
        System.out.println("La password generata è: " + pswGenerata);

    }
}
