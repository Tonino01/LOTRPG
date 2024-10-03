/*

 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author tonin
 */
public class salvaPartitaSQL {
    
    
    public static String url = "jdbc:sqlite:./src/data/databasePartite.db";
    

    public salvaPartitaSQL() {
        
        // Creare la tabella
        String sql = " CREATE TABLE IF NOT EXISTS databasePartite(\n" +
                    " Salvataggio int,\n" +
                    " NomeSave String,\n" +
                    " Progresso int,\n" +
                    " Personaggio Personaggio,\n" +
                    " Partita Object\n" +
                    "); ";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // Create a new table
            stmt.execute(sql);
            System.out.println("Table connected successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        inserisci(1, null, 0, null, null);
        
       
    }
    
    
    

    private static void inserisci(int nSalvataggio, String NomeSave, int Progresso, Object Personaggio, Object Partita) {
        
        
        String sql = "INSERT INTO DatabasePartite\n" +
                    "\n" +
                    "VALUES ("+ nSalvataggio +", "+ NomeSave +", "+ Progresso +", "+ Personaggio +", "+ Partita +")";
        
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // Create a new table
            stmt.execute(sql);
            System.out.println("Table connected successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    /**
     * Uso metodi pubblici per modificare il contenuto del database
     * @param nSalvataggio
     * @param NomeSave
     */
    
    //setter
    
    public void setNomeSave(int nSalvataggio, String NomeSave){
        
        String sql = "UPDATE DatabasePartite\n" +
                    "SET NomeSave = '"+NomeSave+"'\n" +
                    "WHERE Salvataggio = "+nSalvataggio+";";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void setProgresso(int nSalvataggio, int Progresso){
        
        String sql = "UPDATE DatabasePartite\n" +
                    "SET Progresso = '"+Progresso+"'\n" +
                    "WHERE Salvataggio = "+nSalvataggio+";";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
    public void setPersonaggio(int nSalvataggio, Object Persona){
        
        String sql = "UPDATE DatabasePartite\n" +
                    "SET Personaggio = '"+Persona+"'\n" +
                    "WHERE Salvataggio = "+nSalvataggio+";";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void setPartita(int nSalvataggio, Object Partita){
        
        String sql = "UPDATE DatabasePartite\n" +
                    "SET Partita = '"+Partita+"'\n" +
                    "WHERE Salvataggio = "+nSalvataggio+";";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
    
    //getter
            
    public String getNomeSave(int nSalvataggio){
        
        String res = null;
        
        ResultSet rs = null;
        
        String sql = " SELECT NomeSave\n" +
                    "FROM DatabasePartite\n" +
                    "WHERE Salvataggio = "+nSalvataggio+" ";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
            
            rs = stmt.executeQuery(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        try {
            res = rs.getString("NomeSave");
        } catch (SQLException ex) {
            Logger.getLogger(salvaPartitaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }
    
    
    public int getProgresso(int nSalvataggio){
        
        int res = 0;
        
        ResultSet rs = null;
        
        String sql = " SELECT Progresso\n" +
                    "FROM DatabasePartite\n" +
                    "WHERE Salvataggio = "+nSalvataggio+"";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
            
            rs = stmt.executeQuery(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        try {
            res = rs.getInt("Progresso");
        } catch (SQLException ex) {
            Logger.getLogger(salvaPartitaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
        
    }
    
    
    public Object getPersonaggio(int nSalvataggio){
        
        Object res = 0;
        
        ResultSet rs = null;
        
        String sql = " SELECT Personaggio\n" +
                    "FROM DatabasePartite\n" +
                    "WHERE Salvataggio = "+nSalvataggio+" ";
        
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
            
            rs = stmt.executeQuery(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        try {
            res = rs.getObject("Personaggio");
        } catch (SQLException ex) {
            Logger.getLogger(salvaPartitaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
        
    }
    
    public static void getPartita(){
        
        
        
    }
    
    
}
