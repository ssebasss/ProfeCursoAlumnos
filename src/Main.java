import Entidades.Curso;
import Servicio.ServicioAltaVendedor;

public class Main {
    public static void main(String[] args) {

        ServicioAltaVendedor serCurso = new ServicioAltaVendedor();
        Curso Ca=  serCurso.AltaCurso();
        //System.out.println(Ca.toString());
        System.out.println("las ganancias semanales es $ "+serCurso.calcularGananciaSemanal(Ca));

        serCurso.mostrarDatos(Ca);


            }
}