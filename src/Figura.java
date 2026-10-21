public abstract class Figura {
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
    public abstract double calcularArea();
    // Para calcular perímetro
    public abstract double calcularPerimetro();
}