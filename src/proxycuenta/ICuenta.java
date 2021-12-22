/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxycuenta;

/**
 *
 * @author Doris
 */
public interface ICuenta {
    
    Cuenta retirarDinero(Cuenta cuenta, double monto);
    Cuenta depositarDinero(Cuenta cuenta, double monto);
    void mostrarSaldo(Cuenta cuenta);
}
