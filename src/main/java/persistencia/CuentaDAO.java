/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Entidades.Cuenta;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import persistencia.ConexionDAO;
/**
 *
 * @author hoshi
 */
public class CuentaDAO implements ICuentaDAO{
    
     //queremos un objeto que implemente esa interfaz si o si además
    //que nos permite encapsular las propiedades del objeto en cuestion
    private IConexionDAO conexionBD;

    public CuentaDAO(IConexionDAO conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Cuenta crearCuenta(Cuenta cuenta) {
         try {

            //ESTABLECEMOS UNA CONEXION CON MYSQL.. SI NO SE PUEDE LANZA SQLEXCEPTION
            Connection conexion = this.conexionBD.crearConexion();

            //DEFINIMOS UN OBJETO STATEMENT PARA ENVIAR COMANDOS SQL
            Statement comandoSql = conexion.createStatement();

            String codigoSQL = String.format("INSERT INTO Cuenta(Saldo)"
                    + "VALUES ('%f');",
                    cuenta.getSaldo()
                    );
                    

            //ESTE MÉTODO SE UTILIZA PARA HACER OPERACIONES QUE ALTEREN LOS DATOS (INSERT, DELETE, UPDATE)
            int numeroRegistrosAfectados = comandoSql.executeUpdate(codigoSQL);

            //SOLICITAR CERRAR EXPLICITAMENTE LA CONEXION HACIA LA BD
            conexion.close();

            if (numeroRegistrosAfectados == 1) {
                return cuenta;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return cuenta;
        }
    }

    @Override
    public Cuenta actualizarCuenta(Cuenta cuenta) {
        try {

            //ESTABLECEMOS UNA CONEXION CON MYSQL.. SI NO SE PUEDE LANZA SQLEXCEPTION
            Connection conexion = this.conexionBD.crearConexion();

            //DEFINIMOS UN OBJETO STATEMENT PARA ENVIAR COMANDOS SQL
            Statement comandoSql = conexion.createStatement();

            String codigoSQL = String.format("UPDATE cuenta SET saldo = '%f' WHERE id_cuenta= %d;",
                    cuenta.getSaldo(),
                    cuenta.getId_Cuenta()
                    );
                    

            //ESTE MÉTODO SE UTILIZA PARA HACER OPERACIONES QUE ALTEREN LOS DATOS (INSERT, DELETE, UPDATE)
            int numeroRegistrosAfectados = comandoSql.executeUpdate(codigoSQL);

            //SOLICITAR CERRAR EXPLICITAMENTE LA CONEXION HACIA LA BD
            conexion.close();

            if (numeroRegistrosAfectados == 1) {
                return cuenta;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return cuenta;
        }
    }

    @Override
    public Cuenta cancelarCuenta(Cuenta cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cuenta> listaCuentas(Cliente cliente) {
        List<Cuenta> listaCuenta = null;
        try {
            Connection conexion = this.conexionBD.crearConexion();

            Statement comandoSQL = conexion.createStatement();

            String codigoSQL = String.format("SELECT * FROM Cuenta where id_Cliente ="+ cliente.getId_cliente());

            ResultSet resultado = comandoSQL.executeQuery(codigoSQL);

            while (resultado.next()) {
                if(listaCuenta == null){
                     listaCuenta = new ArrayList<>();
                }
                
                int id_Cuenta = resultado.getInt("id_Cuenta"); 
                int numero = resultado.getInt("numero");
                String fecha_Apertura = resultado.getString("fecha_Apertura");
                double saldo = resultado.getDouble("saldo");
                int id_Cliente = resultado.getInt("id_Cliente");
                
                Cuenta cuenta = new Cuenta(id_Cuenta,numero,fecha_Apertura,saldo,id_Cliente);
//                Cliente cliente = new Cliente(id_cliente, nombre, apellido_paterno, apellido_materno, direccion);
                listaCuenta.add(cuenta);

            }

            conexion.close();
            return listaCuenta;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return listaCuenta;

        }
}
}
