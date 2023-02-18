package main;



import Entidades.Cliente;
import GUI.frmLogin;
import java.sql.SQLException;
import persistencia.ClienteDAO;
import persistencia.ConexionDAO;
import persistencia.IClienteDAO;
import persistencia.ConexionDAO;
import persistencia.IConexionDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoshi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        IConexionDAO conexion= new ConexionDAO();
        IClienteDAO clienteDao= new ClienteDAO(conexion);
        frmLogin log = new frmLogin(clienteDao);
        log.setVisible(true);
        
    }
    
}
