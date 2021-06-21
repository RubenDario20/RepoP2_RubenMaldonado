/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposicionlab2_rubenmaldonado;

/**
 *
 * @author Ruben Dario Arias
 */
public class superh {
    private int code2;
    private int riesgo2;
    private int fallidos = 0;

    public superh(int code2, int riesgo2) {
        this.code2 = code2;
        this.riesgo2 = riesgo2;
    }
    
    

    public int getCode2() {
        return code2;
    }

    public void setCode2(int code2) {
        this.code2 = code2;
    }

    public int getRiesgo2() {
        return riesgo2;
    }

    public void setRiesgo2(int riesgo2) {
        this.riesgo2 = riesgo2;
    }

    public int getFallidos() {
        return fallidos;
    }

    public void setFallidos(int fallidos) {
        this.fallidos += fallidos;
    }

    @Override
    public String toString() {
        return ""+code2;
    }
    
    
    
    
}
