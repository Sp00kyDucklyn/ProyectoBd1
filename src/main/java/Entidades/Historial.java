/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author hoshi
 */
public class Historial {
    
    private int id;
    private String operacion;
    private double monto;
    private int id_Cuenta;

    public Historial() {
    }

    public Historial(int id, String operacion, double monto, int id_Cuenta) {
        this.id = id;
        this.operacion = operacion;
        this.monto = monto;
        this.id_Cuenta = id_Cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getId_Cuenta() {
        return id_Cuenta;
    }

    public void setId_Cuenta(int id_Cuenta) {
        this.id_Cuenta = id_Cuenta;
    }
    
    
    
}
