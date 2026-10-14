public class CarroElectrico extends Carro{
    // Atributos
    private short autonomia;
    // Métodos
    // Constructor
    public CarroElectrico(String marca, String modelo, short anho, short autonomia) {
        super(marca, modelo, anho);
        this.autonomia = autonomia;
    }
    // Getters
    public short getAutonomia() {
        return autonomia;
    }
    // Setters
    public void setAutonomia(short autonomia) {
        this.autonomia = autonomia;
    }
}
