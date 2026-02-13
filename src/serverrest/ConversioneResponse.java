/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ConversioneResponse {
    private double operando;
    private String unitaMisura1;
    private String unitaMisura2;
    private double risultato;
    private String operazione;
    
    // Costruttore vuoto necessario per GSON
    public ConversioneResponse() {
    }
    
    // Costruttore con parametri
    public ConversioneResponse(String unitaMisura1, String unitaMisura2, double operando, double risultato) {
        this.operando=operando;
        this.unitaMisura1=unitaMisura1;
        this.unitaMisura2=unitaMisura2;
        this.risultato = risultato;
        this.operazione = String.format("%s %s %.2f = %.2f", 
            unitaMisura1, unitaMisura2, operando, risultato);
    }

    public double getOperando() {
        return operando;
    }

    public void setOperando(double operando) {
        this.operando = operando;
    }

    public String getUnitaMisura1() {
        return unitaMisura1;
    }

    public void setUnitaMisura1(String unitaMisura1) {
        this.unitaMisura1 = unitaMisura1;
    }

    public String getUnitaMisura2() {
        return unitaMisura2;
    }

    public void setUnitaMisura2(String unitaMisura2) {
        this.unitaMisura2 = unitaMisura2;
    }

    public double getRisultato() {
        return risultato;
    }

    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }

    public String getOperazione() {
        return operazione;
    }

    public void setOperazione(String operazione) {
        this.operazione = operazione;
    }
    
   
}