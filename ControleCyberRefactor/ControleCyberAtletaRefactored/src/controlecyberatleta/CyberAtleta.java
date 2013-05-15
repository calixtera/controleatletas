package controlecyberatleta;

import java.util.ArrayList;

public class CyberAtleta extends Atleta {

    private char funcaoEquipe; // C=capitão do time M=membro do time
    private String jogo; // jogo disputado competitivamente pelo atleta
    private ArrayList<Premiacao> premiacoes;
    private String equipe; // Nome da equipe(clã)
    private int totalPartidas;
    private int totalVitorias;
    private int totalDerrotas;
    private int posicaoRanking;

    public CyberAtleta(String nome) {
        super(nome);
    }

    public char getFuncaoEquipe() {
        return funcaoEquipe;
    }

    public void setFuncaoEquipe(char funcaoEquipe) {
        this.funcaoEquipe = funcaoEquipe;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getPosicaoRanking() {
        return posicaoRanking;
    }

    public void setPosicaoRanking(int posicaoRanking) {
        this.posicaoRanking = posicaoRanking;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;

    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getTotalPartidas() {
        return totalPartidas;
    }

    public void setTotalPartidas(int numPartidas) {
        this.totalPartidas = numPartidas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int vitorias) {
        this.totalVitorias = vitorias;
    }
}