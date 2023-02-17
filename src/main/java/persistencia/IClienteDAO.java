/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import Entidades.Cliente;

/**
 *
 * @author oscar
 */
public interface IClienteDAO {
    public Cliente agregar (Cliente cliente);
     public Cliente Login (Cliente cliente);
}
