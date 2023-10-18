/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio.componentes;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author luisc
 */
public class Componentes {

    public static void main(String[] args) throws IOException {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
        ArrayList<Personaje> arreglo = (ArrayList<Personaje>)FileManager.readObject("nuevopath.dat");
        String str = FileManager.readFile("texto.txt");
        System.out.println(str);
        
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i).toString());
        }
    }
}
