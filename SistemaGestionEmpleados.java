import java.util.Scanner;
/**
 * Clase que representa un sistema de gestión de empleados.
 */
public class SistemaGestionEmpleados {
      /**
     * Método principal que inicia el sistema de gestión de empleados.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
          // Código principal del sistema de gestión de empleados
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