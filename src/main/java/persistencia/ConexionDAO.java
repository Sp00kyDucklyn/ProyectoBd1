/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hoshi
 */
public class ConexionDAO implements IConexionDAO{
    final String CADENA_CONEXION = "jdbc:mysql://localhost:3306/Banco_Proyecto";
    final String USUARIO = "root";
    final String CONTRASENA = "1234";

    @Override
    public Connection crearConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(CADENA_CONEXION,USUARIO, CONTRASENA); 
        return conexion;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
