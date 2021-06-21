/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposicionlab2_rubenmaldonado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ruben Dario Arias
 */
public class adminN {
    
    private ArrayList<normal> normales = new ArrayList();
    private File archivo = null;

    public adminN(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setNormales(ArrayList<normal> normales) {
        this.normales = normales;
    }

    public ArrayList<normal> getNormales() {
        return normales;
    }



    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (normal t : normales) {
                bw.write(t.getCode()+ ";");
                bw.write(t.getRiesgo() + ";");
                bw.write(t.getHackeosexitosos()+ ";");
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        normales = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    normales.add(new normal(sc.nextInt(),
                                    sc.nextInt()
                                    
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}

    

