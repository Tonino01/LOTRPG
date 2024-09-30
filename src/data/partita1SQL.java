/*

 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author tonin
 */
public class partita1SQL {
    
    
    
    

    public static void main(String[] args) {
        // Creare la tabella
        createTable();

        // Inserire dati nella tabella
        
        insert("nome","gigibagigio");
        
       
    }

    private static void createTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void insert(String mario, String val) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
