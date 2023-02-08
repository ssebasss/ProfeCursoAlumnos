package Servicio;

import Entidades.Curso;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAltaVendedor {


Scanner sc = new Scanner(System.in).useDelimiter("\n");
public Curso AltaCurso(){

    Curso Ca= new Curso();

    System.out.println("ingrese nombre del curso");
    Ca.setNombreCurso(sc.next());
    System.out.println("----------------------");
    System.out.println("ingrese cantidad de horas por dia");
    Ca.setCantidadHorasPorDia(sc.nextInt());
    System.out.println("----------------------");
    System.out.println("ingrese cantidad de dias por semana");
    Ca.setcantidadDiasPorSemana(sc.nextInt());
    System.out.println("----------------------");
    System.out.println("precios por hora");
    Ca.setPrecioPorHora(sc.nextInt());
    System.out.println("----------------------");
    do {
        System.out.println("ingrese el turno del curso (M o T)");
        Ca.setTurno(sc.next().toUpperCase().charAt(0));
        System.out.println("");
    }while (Ca.getTurno()!='M' && Ca.getTurno()!='T');
    System.out.println("vos ingresaste..." +Ca.getTurno());
    System.out.println("----------------------");
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


public double calcularGananciaSemanal(Curso Ca){
double calcularGananciaSemanal= (double) Ca.getPrecioPorHora()*Ca.getAlumnos().size()*Ca.getcantidadDiasPorSemana()* Ca.getCantidadHorasPorDia();
return calcularGananciaSemanal;
}

public void mostrarDatos(Curso Ca){
    System.out.println( "nombre del curso es: "+ Ca.getNombreCurso() +" horas diarias: "+ Ca.getCantidadHorasPorDia()+ " cantidad de dias por semana: "+ Ca.getcantidadDiasPorSemana()+ " los alumnos son: "+ Ca.getAlumnos());
}








}
