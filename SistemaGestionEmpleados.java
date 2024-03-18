import java.util.Scanner;

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleados empleados = new Empleados();
        empleados.darDeAlta(new Empleado(ConstantesPantalla.TEXTO_NOMBRE, ConstantesPantalla.TEXTO_CARGO, 50000));
        empleados.darDeAlta(new Empleado(ConstantesPantalla.TEXTO_NOMBRE, ConstantesPantalla.TEXTO_CARGO, 45000));
        empleados.darDeAlta(new Empleado(ConstantesPantalla.TEXTO_NOMBRE, ConstantesPantalla.TEXTO_CARGO, 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(ConstantesPantalla.TEXTO_PORCENTAJE_SALARIO);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        
        System.out.println(ConstantesPantalla.TEXTO_LISTA_EMPLEADOS);
        empleados.mostrarLista();

        scanner.close();
    }
}