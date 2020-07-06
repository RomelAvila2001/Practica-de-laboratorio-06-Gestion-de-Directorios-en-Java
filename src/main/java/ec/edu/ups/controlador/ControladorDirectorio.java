/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    
    public List<String> listarArchivosOcultos(String ruta) {
        List<String> lista = new ArrayList<>();
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        for (File elemento : archivos) {
            if (elemento.isHidden() && !elemento.isDirectory()) {
                lista.add(elemento.getName());
            }
        }
        return lista;
    }
    
    public List<String> listarDirectoriosOcultos(String ruta) {
        List<String> lista = new ArrayList<>();
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        for (File elemento : archivos) {
            if (elemento.isHidden() && elemento.isDirectory()) {
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
    
   public void eliminarDirectorio(String nombre) {
        archivo = new File(nombre);
        File[] lArchivos = archivo.listFiles();
        
        for (int i = 0; i < lArchivos.length; i++) {
            if (lArchivos[i].isDirectory()) {
                eliminarDirectorio(lArchivos[i]+"");
            } else {
               lArchivos[i].delete();
            }
        }
        archivo.delete();
    }


    
    public void renombrarDirectorio(String actual, String nuevo,String ruta) {
        archivo = new File(ruta+File.separator+ actual);
        archivo.renameTo(new File(ruta+File.separator+ nuevo));
    }
    
    public String mostrarInformacion(String nombre, String ruta){
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        String informacion="";
        for (File elemento : archivos) {
            if (elemento.getName().equals(nombre)) {
                
                String path = elemento.getAbsolutePath();
                informacion = informacion.concat("Path:"+""+path+"\n");
                
                long tamaño = elemento.length();
                informacion = informacion.concat("\nTamaño del archivo en bitez:" + " " + tamaño+"\n");
                
                String lectura="";
                if (elemento.canRead()) {
                    lectura ="Permitido";
                } else {
                    lectura ="Denegado";
                }
                informacion = informacion.concat("\nPermiso de Lectura:" + " " + lectura+"\n");
                
                String escritura="";
                if (elemento.canWrite()) {
                    escritura = "Permitido";
                } else {
                    escritura = "Denegado";
                }
                informacion = informacion.concat("\nPermiso de Escritura:" + " " + escritura+"\n");
                
                SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                informacion = informacion.concat("\nUltima Modificacion:" + " " + formatoFecha.format(elemento.lastModified())+"\n");
                
            }
        }
        return informacion;
    }
}
