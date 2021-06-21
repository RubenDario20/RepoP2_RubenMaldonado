/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposicionlab2_rubenmaldonado;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Ruben Dario Arias
 */
public class BarraH extends Thread {

    private JProgressBar auxiliar;
    private boolean vive;
    private boolean avanzar;
    private String name;
    private int stop;
    public int value = 0;

    public BarraH(JProgressBar auxiliar, int stop) {
        this.auxiliar = auxiliar;
        vive = true;
        avanzar = true;
        this.stop = stop;
    }

    public BarraH(String name) {
        this.name = name;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        auxiliar.setStringPainted(true);
        while (vive) {
            if (avanzar) {
                auxiliar.setValue(auxiliar.getValue() + 1);
               
            }
            if (auxiliar.getValue() == stop) {
                
                auxiliar.setValue(0);
                avanzar = false;
                vive = false;
               
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }

    }

}

