/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxycuenta;

/**
 *
 * @author Daniel
 */
public class Cuenta {
    
    private int idCuenta;
    private String usuario;
    private double saldoInicial;
    private Cuenta cuenta;
    
    public Cuenta(int idCuenta,String usuario,double saldoInicial){
        this.idCuenta=idCuenta;
        this.usuario=usuario;
        this.saldoInicial=saldoInicial;
        this.cuenta = new Cuenta();
    }
    
    public int getIdCuenta(){
        return idCuenta;
    }
    
    public void setIdCuenta(int idCuenta){
        this.idCuenta=idCuenta;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario=usuario;
        
    }
    
    public double getSaldoInicial(){
        return saldoInicial;
    }
    public void setSaldoInicial(double saldo){
        this.saldoInicial=saldo;
    }
}
