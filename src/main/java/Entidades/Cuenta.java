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
public class Cuenta {
    private int id_Cuenta;
    private String fecha_Apertura;
    private int numero;
    private double saldo;
    private int id_Cliente;

    public Cuenta() {
    }

    public Cuenta(int id_Cuenta, int numero ,String fecha_Apertura, double saldo, int id_Cliente) {
        this.id_Cuenta = id_Cuenta;
        this.numero=numero;
        this.fecha_Apertura = fecha_Apertura;
        this.saldo = saldo;
        this.id_Cliente = id_Cliente;
    }

    public Cuenta(double saldo, int id_Cliente) {
        this.saldo = saldo;
        this.id_Cliente = id_Cliente;
    }

    public int getId_Cuenta() {
        return id_Cuenta;
    }

    public void setId_Cuenta(int id_Cuenta) {
        this.id_Cuenta = id_Cuenta;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getFecha_Apertura() {
        return fecha_Apertura;
    }

    public void setFecha_Apertura(String fecha_Apertura) {
        this.fecha_Apertura = fecha_Apertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
    
    
}
