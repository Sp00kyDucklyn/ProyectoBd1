/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author hoshi
 */
public class ClienteDAO implements IClienteDAO{
    
    //queremos un objeto que implemente esa interfaz si o si además
    //que nos permite encapsular las propiedades del objeto en cuestion
    private IConexionDAO conexionBD;

    public ClienteDAO(IConexionDAO conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Cliente agregar(Cliente cliente) {
        try {

            //ESTABLECEMOS UNA CONEXION CON MYSQL.. SI NO SE PUEDE LANZA SQLEXCEPTION
            Connection conexion = this.conexionBD.crearConexion();

            //DEFINIMOS UN OBJETO STATEMENT PARA ENVIAR COMANDOS SQL
            Statement comandoSql = conexion.createStatement();

            String codigoSQL = String.format("INSERT INTO Cliente(Nombre, Apellido_paterno, "
                    + "Apellido_materno, Direccion, Fecha_Nacimiento, Contraseña)"
                    + "VALUES ('%s','%s','%s','%s','%s','%s');",
                    cliente.getNombre(),
                    cliente.getApellido_Paterno(),
                    cliente.getApellido_Materno(),
                    cliente.getDireccion(),
                    cliente.getFecha_Nacimiento(),
                    cliente.getContraseña()
                    );
                    

            //ESTE MÉTODO SE UTILIZA PARA HACER OPERACIONES QUE ALTEREN LOS DATOS (INSERT, DELETE, UPDATE)
            int numeroRegistrosAfectados = comandoSql.executeUpdate(codigoSQL);

            //SOLICITAR CERRAR EXPLICITAMENTE LA CONEXION HACIA LA BD
            conexion.close();

            if (numeroRegistrosAfectados == 1) {
                return cliente;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return cliente;
        }
    }

    @Override
    public Cliente Login(Cliente cliente) {
        Cliente clienteE=null;
        try{
            //establecemos la conexion
            Connection conexion = this.conexionBD.crearConexion();
            //creamos el comandoSQL o query sobre el que trabajaremos
            Statement comandoSQL = conexion.createStatement();
            //Creamos la consulta que vamos a ejecutar
            String codigoSQL= "Select * From Cliente WHERE nombre ='"+cliente.getNombre()+
                    "' and contraseña='"+cliente.getContraseña()+"'";
            System.out.println(codigoSQL);
            //guardemos el resultado de la comnsulta, en este caso se va a guardar al activista
            ResultSet resultado = comandoSQL.executeQuery(codigoSQL);
            //comprobamos si hay un activista en el resultado y obtenemos sus datos
            if (resultado.next()) {
                int id = resultado.getInt("id_cliente");
                String nombre = resultado.getString("nombre");
                String apellido_paterno = resultado.getString("apellido_paterno");
                String apellido_materno = resultado.getString("apellido_materno");
                String direccion = resultado.getString("direccion");
                String fecha_Na= resultado.getString("Fecha_Nacimiento");
                String contraseña=resultado.getString("Contraseña");
                clienteE = new Cliente(id, nombre, apellido_paterno, apellido_materno, direccion, fecha_Na, contraseña);

            }

            //cerramos conexion
            conexion.close();
            //regresamos el cliente
            return clienteE;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage()); //imprimimos el mensaje de error
            return clienteE; //regresamos el activista, que en este caso seria un nulo
        }
            
       
    }
    

    
}
