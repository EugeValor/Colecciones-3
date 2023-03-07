/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author 54343
 */
public class ServicioAlumno {
  Scanner leer = new Scanner(System.in);
    public void crearAlumno(ArrayList<Alumno> lista){
        int opc;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String alumno = leer.next();
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese la primer nota del alumno");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la segunda nota del alumno");
            notas.add(leer.nextInt());
            System.out.println("Ingrese la tercer nota del alumno");
            notas.add(leer.nextInt());
            System.out.println("Desea continuar?1-Si/2-No");
             opc = leer.nextInt();
            Alumno a = new Alumno(alumno, notas);
            lista.add(a);
        } while (opc == 1);
    }
    
    public double notaFinal(ArrayList<Integer> notas){
       
       double notaFinal = 0;
        for (Integer nota : notas){
            notaFinal += nota;
        }
        notaFinal /= 3;
        return notaFinal;
    }
}

  
    
