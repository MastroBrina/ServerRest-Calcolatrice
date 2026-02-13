/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ConversioneService {
    
    public static double calcola(String unitaMisura1, String unitaMisura2, double operando) 
            throws IllegalArgumentException {
        
        if (unitaMisura1 == null || unitaMisura1.trim().isEmpty()||unitaMisura2 == null || unitaMisura2.trim().isEmpty()) {
            throw new IllegalArgumentException("UnitaMisura non può essere vuoto");
        }
        
        // Convertiamo l'operatore in maiuscolo per gestire input case-insensitive
        String op = unitaMisura1.toUpperCase().trim();
        
        switch (op) {
            case "MT":
                return operando*1.09361;
                
            case "YD":
                return operando*0.9144;

            default:
                throw new IllegalArgumentException(
                   "UnitaMisura non valida: "+ unitaMisura1 + "UnitaMisura consentite: MT e YD"     
                );
        }
    }
}
