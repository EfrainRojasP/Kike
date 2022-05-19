/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.io.IOException;
import model.ManagerArchivo;
import model.ManagerReporte;

/**
 *
 * @author enriq
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        ManagerReporte man = new ManagerReporte();
        String formato = "C:\\Users\\efrai\\OneDrive\\Documentos\\UAM\\16°\\Patrones de Diseño de Software\\dd\\holin2.docx";
        String PA = "C:\\Users\\efrai\\OneDrive\\Documentos\\UAM\\16°\\Patrones de Diseño de Software\\dd\\holin2.pdf";
        String rutaDest = "‪‪C:\\Users\\efrai\\Escritorio";

        man.generarProceso(formato,PA,rutaDest);
      
    }
}
