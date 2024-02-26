package controller;

public class RecursividadeVetor {

    public RecursividadeVetor () {
        super();
    }

    public int buscaMenor (int[] vetor, int indice) {
        //Condição de parada.
        if (indice == 0){
            return vetor [0];
        }else{
            int menorValor = buscaMenor(vetor, indice - 1); //Chamada da função.
            return Math.min(vetor[indice], menorValor); //Retorno do menor valor.
        }
    }
}
