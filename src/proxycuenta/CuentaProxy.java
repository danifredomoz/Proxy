/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxycuenta;

import java.util.logging.Logger;

/**
 *
 * @author Doris
 */
public class CuentaProxy implements ICuenta {
    
    private CuentaBancoAImpl cuentaReal;
    private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());
    
    @Override
    public Cuenta retirarDinero(Cuenta cuenta,double monto){
        LOGGER.info("----Cuenta Proxy - Retirar Dinero ----");
        if(cuentaReal== null){
            cuentaReal=new CuentaBancoAImpl();
            return cuentaReal.retirarDinero(cuenta, monto);
            
        }else{
            return cuentaReal.retirarDinero(cuenta, monto);
        }
        
    }
    
    @Override
    public Cuenta depositarDinero(Cuenta cuenta,double monto){
        LOGGER.info("----Cuenta Proxy - Depositar Dinero ----");
        if(cuentaReal == null){
            cuentaReal= new CuentaBancoAImpl();
            return cuentaReal.depositarDinero(cuenta, monto);
        }else{
            return cuentaReal.depositarDinero(cuenta, monto);
        }
        
    }
    
    @Override
    public void mostrarSaldo(Cuenta cuenta){
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero ----");
        if(cuentaReal == null){
            cuentaReal= new CuentaBancoAImpl();
            cuentaReal.mostrarSaldo(cuenta);
        }else{
            cuentaReal.mostrarSaldo(cuenta);
        }
        
    }
}
