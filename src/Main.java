import Entidades.Curso;
import Servicio.ServicioAltaVendedor;

public class Main {
    public static void main(String[] args) {

        ServicioAltaVendedor serCurso = new ServicioAltaVendedor();
        Curso Ca=  serCurso.AltaCurso();
        System.out.println(serCurso.toString());
        serCurso.calcularGananciaSemanal(Ca);

            }
}