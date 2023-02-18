/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;
import Entidades.Cliente;
import Entidades.Cuenta;
import java.util.List;
/**
 *
 * @author oscar
 */
public interface ICuentaDAO {
    public Cuenta crearCuenta(Cuenta cuenta);
    public Cuenta actualizarCuenta(Cuenta cuenta);
    public Cuenta cancelarCuenta(Cuenta cuenta);
    public List<Cuenta> listaCuentas(Cliente cliente);
}
