public class Empleados {
    /**
 * Clase que gestiona la lista de empleados.
 */
    private Empleado[] lista;
 /**
     * Constructor de la clase Empleados.
     */
    public Empleados() {
        this.lista = new Empleado[0];
    }
/**
     * Agrega un nuevo empleado a la lista.
     * @param empleado El empleado a agregar.
     */
    public void darDeAlta(Empleado empleado) {
        Empleado[] nuevaLista = new Empleado[lista.length + 1];
        System.arraycopy(lista, 0, nuevaLista, 0, lista.length);
        nuevaLista[lista.length] = empleado;
        lista = nuevaLista;
    }
/**
     * Aumenta el salario de todos los empleados en un cierto porcentaje.
     * @param porcentaje El porcentaje de aumento de salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
/**
     * Muestra la lista de empleados por pantalla.
     */
    public void mostrarLista() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}

