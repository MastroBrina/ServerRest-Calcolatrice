/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ConversioneRequest {
    private double operando;
    private String unitaMisura1;
    private String unitaMisura2;
    
    // Costruttore vuoto necessario per GSON
    public ConversioneRequest() {
    }
    
    // Costruttore con parametri
    public ConversioneRequest(String unitaMisura1, String unitaMisura2, double operando) {
        this.operando=operando;
        this.unitaMisura1=unitaMisura1;
        this.unitaMisura2=unitaMisura2;
    }

    public double getOperando() {
        return operando;
    }

    public String getUnitaMisura1() {
        return unitaMisura1;
    }

    public String getUnitaMisura2() {
        return unitaMisura2;
    }
    
   
    
    @Override
    public String toString() {
        return "ConversioneRequest{" +
                "unita1= " + unitaMisura1 +
                ", unita2= " + unitaMisura2 +
                ", operando= " + operando + '\n' +
                '}';
    }
}