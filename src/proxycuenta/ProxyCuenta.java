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
public class ProxyCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta c = new Cuenta(1,"Doris",100);
        
        ICuenta cuentaProxy= new CuentaProxy();
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c,50);
        c = cuentaProxy.retirarDinero(c,20);
        cuentaProxy.mostrarSaldo(c);
        
        
    }
    
}
