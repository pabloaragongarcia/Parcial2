public class Empleados {
    
    private Empleado[] lista;

    public Empleados() {
        this.lista = new Empleado[0];
    }

    public void darDeAlta(Empleado empleado) {
        Empleado[] nuevaLista = new Empleado[lista.length + 1];
        System.arraycopy(lista, 0, nuevaLista, 0, lista.length);
        nuevaLista[lista.length] = empleado;
        lista = nuevaLista;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarLista() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}

