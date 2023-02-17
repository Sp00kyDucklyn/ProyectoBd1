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
public class Cliente {
    private int id_cliente;
    private String nombre, apellido_Paterno, apellido_Materno;
    private String direccion;
    private String fecha_Nacimiento;
    private String contraseña;

    public Cliente() {
    }

    public Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente(int id_cliente, String nombre, String apellido_Paterno, String apellido_Materno, String direccion, String fecha_Nacimiento, String contraseña) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.direccion = direccion;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.contraseña = contraseña;
    }

    public Cliente(String nombre, String apellido_Paterno, String apellido_Materno, String direccion, String fecha_Nacimiento, String contraseña) {
        this.nombre = nombre;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.direccion = direccion;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.contraseña = contraseña;
    }

    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }


    public String getDireccion() {
        return direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    

    
    
}
