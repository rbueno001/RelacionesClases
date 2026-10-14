
public class Carro extends Vehiculo {

    // Atributos
    protected String marca;
    protected String modelo;
    protected short anho;

    // Métodos
    // Constructor
    public Carro(String marca, String modelo, short anho) {
        super("terrestre");
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public short getAnho() {
        return anho;
    }

    public String getModelo() {
        return modelo;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnho(short anho) {
        this.anho = anho;
    }
}
