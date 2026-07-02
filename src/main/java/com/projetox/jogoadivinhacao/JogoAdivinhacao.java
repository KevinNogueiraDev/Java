package com.projetox.jogoadivinhacao;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {

        int numberx = 0;
        int kick = 0;
        int different = 0;
        int attempt = 0;
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(System.getProperty("sun.jnu.encoding"));
        System.out.println(System.getProperty("sun.stdout.encoding"));
        System.out.println(System.getProperty("sun.stderr.encoding"));
        
        System.out.println("==========================");
        System.out.println("   JOGO DA ADIVINHAÇÃO    ");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("O objetivo do jogo é tentar adivinhar um número de 0 a 100 que eu escolher!");
        System.out.println("VALENDO! Que número de 0 a 100 eu estou pensando??");
        numberx = random.nextInt(101);
        kick = entrada.nextInt();
        attempt = attempt + 1;

        while (kick != numberx) {
            if (kick > numberx) {
                System.out.println("ERROU! O número é menor!");
                kick = entrada.nextInt();
                attempt = attempt + 1;
            } else {
                System.out.println("ERROU! O número é maior!");
                attempt = attempt + 1;
                kick = entrada.nextInt();
            }
        }
        if (kick == numberx) {
            System.out.println("Acertouuu!");
            System.out.println("Número de tentativas: " + attempt);
        }
    }

};
