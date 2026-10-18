public class EmpleadoRH extends Empleado {

    // Atributos

    // Métodos
    // Constructor
    public EmpleadoRH(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos, puesto);
    }
    // Para contratar Empleado
    public void contratarEmpleado(Empleado empleado) {
        System.out.println("El/la empleado(a) de Recursos Humanos " + nombre + " " + apellidos +
                " contrata al empleado " + empleado.getNombre() + " " + empleado.getApellidos() +
                " para el puesto de " + empleado.getPuesto() + ".");
    }
}