package view;

import controller.RecursividadeVetor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        RecursividadeVetor recursividadeVetor = new RecursividadeVetor();

        int[] vetor = {11, 34, 18, 9};
        int tam = vetor.length;

        int resultado = recursividadeVetor.buscaMenor(vetor, tam - 1);
        System.out.println("Menor valor: " +resultado);
    }
}
