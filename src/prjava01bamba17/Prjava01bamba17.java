/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava01bamba17;
/**
 *
 * @author ubu16
 */
import java.io.*;
public class Prjava01bamba17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer01bamba17.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>"); bw.newLine();
            bw.write(" <head>");bw.newLine();
            bw.write(" <title>");bw.newLine();
            bw.write(" Nova p&agrave;Gina web de Bamba17");bw.newLine();
            bw.write(" </title>");bw.newLine();
            bw.write(" </head>");bw.newLine();
            bw.write(" <body>");bw.newLine();
            bw.write(" Nova p&agrave;Gina web de Bamba17");bw.newLine();
            bw.write(" </body>");bw.newLine();
            bw.write("</html>"); bw.newLine();
            bw.close();
        }
        System.out.println("Nova página weg de Bamba17");
        System.out.println("DAW2 UF4 Práctica 2");
    }
}
        
