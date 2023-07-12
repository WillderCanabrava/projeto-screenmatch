package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtra (Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os mais bem avaliados!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("É uma ótima escolha!");
        } else {
                System.out.println("Adicione para ver depois.");
            }

        }
    }

