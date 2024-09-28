/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tonin
 */
public class Partita {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int getProgresso(String filePath){
        
        int progresso = 0;
        
        
        
        BufferedReader reader = null;

        try {
            // Apri il file e crea il BufferedReader
            reader = new BufferedReader(new FileReader(filePath));

            // Leggi il file riga per riga
            String line;
            while ((line = reader.readLine()) != null) {
                // Controlla se la riga contiene la parola "progresso: "
                if (line.contains("Progresso: ")) {
                    // Estrai il numero dopo "progresso: "
                    String progressoStr = line.split("Progresso: ")[1].trim();
                    try {
                        progresso = Integer.parseInt(progressoStr);
                        System.out.println("Il Progresso è: " + progresso);
                    } catch (NumberFormatException e) {
                        System.out.println("Formato non valido dopo 'Progresso: '");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Stampa l'errore se non si riesce a leggere il file
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Chiudi il reader per evitare memory leak
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        
        return progresso;
    }
    
    
    
    
    
}
