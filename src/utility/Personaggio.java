

package utility;

import java.nio.file.Paths;
import lotrpg.Main;
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
    
    protected String abilita;
    
    
    // stat personaggio
    
    protected int vita;
    
    protected int corporatura;
    
    protected int stamina;
    
    protected int attacco;
    
    protected int difesa;
    
    protected String[] inventario;
    
    protected int rumore;
    
    
    
    
    
    public Personaggio(String Nome, String Sesso, String Razza, String Classe,String Abilita){
        
        //personaggio
    
        this.nome = Nome;
        
        this.sesso = Sesso;
        
        this.razza = Razza;
        
        this.classe = Classe;
        
        this.abilita = Abilita;
        
        //stat personaggio
        
        this.vita = 0;
        
        this.corporatura = 0;
        
        this.stamina = 0;
        
        this.attacco = 0;
        
        this.difesa = 0;
        
        this.rumore = 0;
        
        this.inventario = null;
        
        
        
    }
    
    
    public void calcolaVita(int Vita, String additivo){
        
        if(Main.partita1.getProgresso(Paths.get(relativePath).toAbsolutePath().toString()) == 0){
            
            switch (this.razza) {
            case "Uomo":
                
                this.vita = 100;
                
                this.corporatura = 80;
                
                break;
            case "Hobbit":
                
                this.vita = 50;
                
                this.corporatura = 40;
                
                break;
            case "Elfo":
                
                this.vita = 110;
                
                this.corporatura = 85;
                
                break;
            case "Stregone":
                
                this.vita = 150;
                
                this.corporatura = 80;
                
                break;
            case "Nano":
                
                this.vita = 90;
                
                this.corporatura = 100;
                
                break;
            default:
                throw new AssertionError();
        }
            
        }
        
        
        
 
        
        
        
        
    }
    
    
    
    
    
    
    
    

    @Override
    public String toString() {
        return "Personaggio{" + "nome=" + nome + ", sesso=" + sesso + ", razza=" + razza + ", classe=" + classe + ", abilita=" + abilita + ", attacco=" + attacco + '}';
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
