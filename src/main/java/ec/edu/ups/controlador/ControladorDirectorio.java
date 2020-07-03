/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class ControladorDirectorio {
    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio(String ruta) {
        this.ruta = ruta;
    }
    
    public List<String> listarArchivos(String ruta) {
        List<String> lista = new ArrayList<>();
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        for (File elemento : archivos) {
            if (!elemento.isHidden()) {
                lista.add(elemento.getName());
            }
        }
        return lista;
    }
    
    public void crearDirectorio(String nombre){
        File ruta = new File(nombre);
        if (ruta.exists() == false) {
            ruta.mkdir();
        }
    }
}
