public class Rectangulo extends Figura {

    // Atributos
    private double base;
    private double altura;

    // Métodos
    // Constructor
    public Rectangulo(double base, double altura) {
        super("rectangulo");
        this.base = base;
        this.altura = altura;
    }
    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    // Para calcular Area
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Para calcular perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}