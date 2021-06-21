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
public class normal {
    private int code;
    private int riesgo;
    private int exitosos = 0;

    public normal(int code, int riesgo) {
        this.code = code;
        this.riesgo = riesgo;
    }
    
    
    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public int getHackeosexitosos() {
        return exitosos;
    }

    public void setHackeosexitosos(int hackeosexitosos) {
        this.exitosos += hackeosexitosos;
    }

    @Override
    public String toString() {
        return ""+code;
    }
    
    
         
    
}
