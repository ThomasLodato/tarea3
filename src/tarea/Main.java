package tarea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CentroDeImpresion centro = new CentroDeImpresion();
       /* int bandera = 0;
        int seleccion = 0;
        do {
            
            System.out.println("Porfavor seleccione una opción");
            System.out.println("    1. Agregar una impresora");
            System.out.println("    2. Agregar un archivo");
            System.out.println("    3. Imprimir un archivo");
            System.out.println("    4. Mostrar ");
            
            if (seleccion >=1 && seleccion <=5)
        }while(bandera == 0);*/
        Impresora hp = new Impresora("hp");
        Impresora bn = new Impresora("bn");
        Archivo a = new Archivo("proyecto.txt", "hp");
        Archivo b = new Archivo("proyecto2.php","bn");
        Archivo c = new Archivo("proyecto3.java","bn");
        Archivo d = new Archivo("proyecto1.sql","hp");
        
        centro.Asignar(hp);
        centro.Asignar(bn);
                System.out.println("Porfavor seleccione una opción");

        centro.agregarArchivo(a);
        centro.agregarArchivo(b);
        centro.agregarArchivo(c);
        centro.agregarArchivo(d);
    }
    
}
