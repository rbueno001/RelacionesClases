public class Empleado {

    // Atributos
    protected String nombre;
    protected String apellidos;
    protected String puesto;
    protected static final int HORAS_TRABAJADAS_DIA = 8;
    protected static final double PAGO_HORA = 5000;
    // Métodos
    // Constructor
    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    // Metodo
    public void trabajar() {
        System.out.println("El/la empleado(a) " + nombre + " " + apellidos + " trabaja en el puesto de " + puesto + ".");
    }
    // Para calcular Salario
    public double calcularSalario() {
        return HORAS_TRABAJADAS_DIA * 5 * 4 * PAGO_HORA;
    }

}