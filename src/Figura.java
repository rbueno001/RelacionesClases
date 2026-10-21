public class Figura {
    // Atributos
    protected String tipo;

    // Métodos
    // Constructor
    public Figura(String tipo) {
        this.tipo = tipo;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }
    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // Para calcular Area
    public double calcularArea() {
        return -1;
    }
    // Para calcular perímetro
    public double calcularPerimetro() {
        return -1;
    }
}