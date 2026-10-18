public class Animal {
    // Atributos
    protected String tipo;

    // Métodos
    // Constructor
    public Animal(String tipo) {
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

    //
    public void hacerSonido() {
        System.out.println("El " + tipo + " hace un sonido.");
    }
}