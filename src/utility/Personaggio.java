

package utility;

import data.salvaPartitaSQL;
import java.nio.file.Paths;
import lotrpg.*;
import static lotrpg.Main.relativePath;

/**
 *
 * @author tonin
 */


public class Personaggio {
    
    
    
    protected String nome;
    
    protected String sesso;
    
    protected String razza;
    
    protected String classe;
    
    protected String abilita1;
    
    protected String abilita2;
    
    
    // stat personaggio
    
    protected int vita;
    
    protected int corporatura;
    
    protected int stamina;
    
    protected int attacco;
    
    protected int difesa;
    
    protected String[] inventario;
    
    protected int rumore;
    
    
    
    public Personaggio(){
    
    
    }
    
    
    
    
    public Personaggio(String Nome, String Sesso, String Razza, String Classe,String Abilita1, String Abilita2){
        
        //personaggio
    
        this.nome = Nome;
        
        this.sesso = Sesso;
        
        this.razza = Razza;
        
        this.classe = Classe;
        
        this.abilita1 = Abilita1;
        
        this.abilita2 = Abilita2;
        
        this.inventario = null;
        
        setPersonaggioStatDefault(Razza);
        
        
        
    }
    
    public Personaggio(Personaggio copy){
        
        this.nome = copy.nome;
        
        this.sesso = copy.sesso;
        
        this.razza = copy.razza;
        
        this.classe = copy.classe;
        
        this.abilita1 = copy.abilita1;
        
        this.abilita2 = copy.abilita2;
        
        this.vita = copy.vita;
        
        this.stamina = copy.stamina;
        
        this.corporatura = copy.corporatura;
        
        this.difesa = copy.difesa;
        
        this.attacco = copy.attacco;
        
        this.rumore = copy.rumore;
        
        this.inventario = copy.inventario;
        
        
        
    }
    
    
    
    public void setPersonaggioStatDefault(String razza){
        
        //stat personaggio
        
        
            
            switch (razza) {
            case "Uomo":
                
                this.vita = 100;
                
                this.corporatura = 80;
                
                this.stamina = 60;
                
                this.attacco = 10;
                
                this.difesa = this.corporatura / 40;
                
                this.rumore = 20;
                
                break;
            case "Hobbit":
                
                this.vita = 50;
                
                this.corporatura = 40;
                
                this.stamina = 70;
                
                this.attacco = 3;
                
                this.difesa = this.corporatura / 40;
                
                this.rumore = 5;
                
                break;
            case "Elfo":
                
                this.vita = 110;
                
                this.corporatura = 85;
                
                this.stamina = 80;
                
                this.attacco = 13;
                
                this.difesa = this.corporatura / 40;
                
                this.rumore = 13;
                
                break;
            case "Stregone":
                
                this.vita = 150;
                
                this.corporatura = 80;
                
                this.stamina = 90;
                
                this.attacco = 8;
                
                this.difesa = this.corporatura / 40;
                
                this.rumore = 20;
                
                break;
            case "Nano":
                
                this.vita = 90;
                
                this.corporatura = 100;
                
                this.stamina = 40;
                
                this.attacco = 14;
                
                this.difesa = this.corporatura / 40;
                
                this.rumore = 30;
                
                break;
            default:
                throw new AssertionError();
        }
            
            
            
            
    }
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    //Setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setAbilita1(String abilita1) {
        this.abilita1 = abilita1;
    }
    
    public void setAbilita2(String abilita2) {
        this.abilita2 = abilita2;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public void setCorporatura(int corporatura) {
        this.corporatura = corporatura;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }

    public void setRumore(int rumore) {
        this.rumore = rumore;
    }
    
    
    
    
    // Getter
    
    public String getNome() {
        return nome;
    }

    public String getSesso() {
        return sesso;
    }

    public String getRazza() {
        return razza;
    }

    public String getClasse() {
        return classe;
    }

    public String getAbilita1() {
        return abilita1;
    }
    
    public String getAbilita2() {
        return abilita2;
    }

    public int getVita() {
        return vita;
    }

    public int getCorporatura() {
        return corporatura;
    }

    public int getStamina() {
        return stamina;
    }

    public int getAttacco() {
        return attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public String[] getInventario() {
        return inventario;
    }

    public int getRumore() {
        return rumore;
    }
    
    
    

    
    
    
    @Override
    public String toString() {
        return "NOME: " + nome + "\nSESSO: " + sesso + "\nRAZZA: " + razza + "\nCLASSE: " + classe + "\nABILITA1: " + abilita1 + "\nABILITA2: " + abilita1 + "\nVITA: " + vita + "\nCORPORATURA: " + corporatura + "\nSTAMINA: " + stamina + "\nATTACCO: " + attacco + "\nDIFESA: " + difesa + "\nINVENTARIO: " + inventario + "\nRUMORE: " + rumore;
    }
    
    
    
    
    
    
    
    
    
    
}
