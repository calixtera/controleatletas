package controlecyberatleta;

import java.util.ArrayList;

public class ControleCyberAtleta {

    private ArrayList<CyberAtleta> listaCyberAtletas;

    public ControleCyberAtleta() {
        this.listaCyberAtletas = new ArrayList<CyberAtleta>();
    }
    
    public ArrayList<CyberAtleta> getListaCyberAtletas() {
        return listaCyberAtletas;
    }
    
    public void adicionar(CyberAtleta umCyberAtleta) {
        listaCyberAtletas.add(umCyberAtleta);
    }
    
    public void remover(CyberAtleta umCyberAtleta) {
        listaCyberAtletas.remove(umCyberAtleta);
    }
    
    public CyberAtleta pesquisar(String nome) {
        for (CyberAtleta b: listaCyberAtletas) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
