package org.lessons.java.security;

public class PasswordGenerator {

    public static void main(String[] args){
     String nome = "Pinco";
     String cognome = "Pallo";
     String colorePreferito = "magenta";
     int giornoNascita = 12;
     int meseNascita = 5;
     int annoNascita = 1994;
     int dataNascita = giornoNascita + meseNascita + annoNascita;

     System.out.print( nome + "-" + cognome + "-" + colorePreferito + "-"  );
     System.out.print(dataNascita);
    }


}
