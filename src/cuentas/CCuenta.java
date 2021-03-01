package cuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usutarde
 */
public class CCuenta {
    /*ZONA DE ATRIBUTOS*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    
    
    
    public CCuenta(){
        
    }
    
    public CCuenta(String nom, String cue, double sal, double tipo )
    {
        nombre =nom;
        cuenta =cue;
        saldo =sal;
    }
    
    public double estado()
    {
       return getSaldo(); 
    }
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }   

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <=0)
            throw new Exception("No se puede reitrar una cantidad negativa");
        if (estado()< cantidad) 
            throw new Exception ("No hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
    }        
    
    
}
