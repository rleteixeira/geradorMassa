package com.massa.trancodes;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de trancodes:");
        int qtde = scan.nextInt();
        ArrayList<String> trancodesList = new ArrayList<>();

        for (int i = 0; i < qtde; i++) {
            UUID chaveUnicaDeposito = UUID.randomUUID();
            
            trancodesList.add("DEPOSITO     " + UUID.randomUUID().toString() + chaveUnicaDeposito.toString());
            trancodesList.add("LIBERACAO     " + UUID.randomUUID().toString() + chaveUnicaDeposito.toString());
        }
        System.out.println("Tamanho da lista: " + trancodesList.size());
        Collections.sort(trancodesList);

        for (String item : trancodesList) {
            System.out.println(item);
        }
    }
}
