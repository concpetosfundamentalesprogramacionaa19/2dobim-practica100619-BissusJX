/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2bimestre;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class LeerArchivo {
    public static void leerTabula() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("dtabula-FWC_2018_Squa"
                    + "dlists_4.csv"));
            double suma = 0;
            int contador = 0;
            double promedio = 0;
            double suma2 = 0;
            double promedio2 = 0;
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("//|")));
                System.out.println(linea_partes);
                double dato = Double.parseDouble(linea_partes.get(11));
                suma = suma + dato;
                double dato2 = Double.parseDouble(linea_partes.get(9));
                suma2 = suma2 + dato2;
                
                contador = contador + 1;
                
            } // fin de while
            entrada.close();
            promedio = suma/contador;
            promedio2 = suma2/contador;
            System.out.printf("promedio Goals %.2f\n",promedio);
            System.out.printf("el promedio Height %.2f\n",promedio2);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
}
