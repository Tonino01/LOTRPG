/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author tonin
 */


public class Personaggio {
    
    
    protected String nome;
    
    protected String sesso;
    
    protected String razza;
    
    protected String classe;
    
    protected String abilita;
    
    protected int attacco;
    
    
    
    
    public Personaggio(String Nome, String Sesso, String Razza, String Classe,String Abilita){
    
        this.nome = Nome;
        
        this.sesso = Sesso;
        
        this.razza = Razza;
        
        this.classe = Classe;
        
        this.abilita = Abilita;
        
        
    }
    
    
    
    
    
    
    
    
    

    public String getNome() {
        return nome;
    }

    public String isSesso() {
        return sesso;
    }

    public String getRazza() {
        return razza;
    }

    public String getAbilita() {
        return abilita;
    }
    
    
    
    
    
    
}
