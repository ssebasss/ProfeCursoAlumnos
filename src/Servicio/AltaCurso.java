package Servicio;

import Entidades.Curso;

import java.util.ArrayList;
import java.util.Scanner;

public class AltaCurso {
Scanner sc = new Scanner(System.in).useDelimiter("\n");
public Curso AltaCurso(){
    Curso Ca= new Curso();

    System.out.println("ingrese nombre del curso");
    Ca.setNombreCurso(sc.next());
    System.out.println("");

    System.out.println("ingrese cantidad de horas por dia");
    Ca.setCantidadHorasPorDia(sc.nextInt());
    System.out.println("");

    System.out.println("ingrese cantidad de horas por semana");
    Ca.setcantidadDiasPorSemana(sc.nextInt());
    System.out.println("");

    System.out.println("ingrese el turno del curso");
    Ca.setTurno(sc.next().charAt(0));
    System.out.println("");

    System.out.println("precios por hora");
    Ca.setPrecioPorHora(sc.nextInt());
    System.out.println("");

    System.out.println("ingrese nombre de los 5 alumnos del curso");
    ArrayList<String>listaAlumnos =new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      System.out.println("ingrese nombre del alumno numero " + (i+1) +  "  del curso");
      String alunmnos=sc.next();
      listaAlumnos.add(alunmnos);
    }
    Ca.setAlumnos(listaAlumnos);   // aca supuestamente guarde los 5 alumnos

   return Ca;
}

public static double calcularGananciaSemanal(Curso Ca){
double calcularGananciaSemanal= (double) Ca.getCantidadHorasPorDia()*Ca.getPrecioPorHora()*Ca.getAlumnos().size()*Ca.getcantidadDiasPorSemana();
return calcularGananciaSemanal;

}








}
