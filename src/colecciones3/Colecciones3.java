/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

import Entidades.Alumno;
import Servicios.ServicioAlumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
          Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList();
        ServicioAlumno sa = new ServicioAlumno();
        
        sa.crearAlumno(alumnos);
       
        
        System.out.println("Ingrese el nombre del alumno para calcular la nota final:");
        String nombre = leer.nextLine();
        
        Iterator<Alumno> it = alumnos.iterator();
        int indice = 0;
         while (it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(nombre)){
                
                double notafinal = sa.notaFinal(alumnos.get(indice).getNotas());
                System.out.println("El promedio del alumno " + nombre + " es " + notafinal);
            } else {
                indice++;
            }
        }       
    }}
/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/