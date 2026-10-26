/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividaderegressao.main;

/**
 * Regras (versão 1.0):
 *  - Notas P1 e P2 devem estar entre 0 e 10 (senão, IllegalArgumentException)
 *  - Frequência deve estar entre 0 e 100 (senão, IllegalArgumentException)
 *  - Média = P1 * 0.4 + P2 * 0.6
 *  - Frequência abaixo de 75%       -> REPROVADO_POR_FALTA (tem prioridade)
 *  - Média >= 7.0                   -> APROVADO
 *  - Média >= 4.0                   -> EXAME
 *  - Caso contrário                 -> REPROVADO
 */
public class AvaliacaoAluno {

    public enum Situacao { APROVADO, EXAME, REPROVADO, REPROVADO_POR_FALTA }

    public static final double MEDIA_APROVACAO = 7.0;
    public static final double MEDIA_EXAME = 4.0;
    public static final double FREQUENCIA_MINIMA = 75.0;

    public double calcularMedia(double p1, double p2) {
        validarNota(p1);
        validarNota(p2);
        return p1 * 0.4 + p2 * 0.6;
    }

    public Situacao situacao(double p1, double p2, double frequencia) {
        if (frequencia < 0 || frequencia > 100) {
            throw new IllegalArgumentException("Frequência inválida");
        }
        if (frequencia < FREQUENCIA_MINIMA) {
            return Situacao.REPROVADO_POR_FALTA;
        }
        double media = calcularMedia(p1, p2);
        if (media >= MEDIA_APROVACAO) {
            return Situacao.APROVADO;
        }
        if (media >= MEDIA_EXAME) {
            return Situacao.EXAME;
        }
        return Situacao.REPROVADO;
    }

    private void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
    }
}

/////////////////////////////SEGUE ABAIXO A VERSÃO 1.1. DESCOMENTAR APENAS QUANDO SOLICITADO/////////////////////////////////
/**
public class AvaliacaoAluno {;

    public enum Situacao { APROVADO, EXAME, REPROVADO, REPROVADO_POR_FALTA }

    public static final double MEDIA_APROVACAO = 7.0;
    public static final double MEDIA_EXAME = 4.0;
    public static final double FREQUENCIA_MINIMA = 75.0;
    public static final double BONUS_MAXIMO = 1.0;

    public double calcularMedia(double p1, double p2) {
        validarNota(p1);
        validarNota(p2);
        return p1 * 0.4 + p2 * 0.6;
    }

    public double calcularMediaComBonus(double p1, double p2, double bonus) {
        if (bonus < 0 || bonus > BONUS_MAXIMO) {
            throw new IllegalArgumentException("Bônus deve estar entre 0 e " + BONUS_MAXIMO);
        }
        return Math.min(10.0, calcularMedia(p1, p2) + bonus);
    }

    public Situacao situacao(double p1, double p2, double frequencia) {
        validarFrequencia(frequencia);
        if (reprovadoPorFalta(frequencia)) {
            return Situacao.REPROVADO_POR_FALTA;
        }
        double media = calcularMedia(p1, p2);
        if (media >= MEDIA_APROVACAO) {
            return Situacao.APROVADO;
        }
        if (media >= MEDIA_EXAME) {
            return Situacao.EXAME;
        }
        return Situacao.REPROVADO;
    }

    private void validarNota(double nota) {
        if (nota < 0 || nota >= 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
    }

    private void validarFrequencia(double frequencia) {
        if (frequencia < 0 || frequencia > 100) {
            throw new IllegalArgumentException("Frequência inválida");
        }
    }

    private boolean reprovadoPorFalta(double frequencia) {
        return frequencia <= FREQUENCIA_MINIMA;
    }
}
* */