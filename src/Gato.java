public class Gato extends Animal {

    // Atributos
    private String raza;
    private String color;
    private String sexo;

    // Métodos
    // Constructor
    public Gato(String raza, String color, String sexo) {
        super("gato");
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
    }

    // Getters
    public String getRaza() {
        return raza;
    }
    public String getColor() {
        return color;
    }
    public String getSexo() {
        return sexo;
    }


    // Setters
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Método hacerSonido
    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato maulla.");
    }
}
