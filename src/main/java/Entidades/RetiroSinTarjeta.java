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
public class RetiroSinTarjeta {
    private int id;
    private String folio;
    private String contrasenia;
    private double monto;

    public RetiroSinTarjeta() {
    }

    public RetiroSinTarjeta(int id, String folio, String contrasenia, double monto) {
        this.id = id;
        this.folio = folio;
        this.contrasenia = contrasenia;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
