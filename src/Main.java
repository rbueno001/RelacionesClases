public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("aéreo");
        Carro miCarro = new Carro("Hyundai", "Elantra", (short) 1992);
        CarroElectrico carroNuevo = new CarroElectrico("BYD", "Seagul",
                (short) 2025, (short) 600);
        Vehiculo[] coleccionGeneral = new Vehiculo[3];
        coleccionGeneral[0] = vehiculo;
        coleccionGeneral[1] = miCarro;
        coleccionGeneral[2] = carroNuevo;

        Carro[] coleccionCarros = new Carro[3];
        coleccionCarros[0] = miCarro;
        coleccionCarros[1] = carroNuevo;
        // coleccionCarros[2] = vehiculo; (Error xq vehículo no necesariamente es Carro)

        Animal animal = new Animal("perro");
        Gato miGato = new Gato("Siames", "Gris", "Macho");

        Animal[] coleccionAnimales = new Animal[2];
        coleccionAnimales[0] = animal;
        coleccionAnimales[1] = miGato;

        animal.hacerSonido();
        miGato.hacerSonido();

        Figura figura = new Figura("figura");
        Rectangulo miRectangulo = new Rectangulo(5, 3);
        Circulo miCirculo = new Circulo(5);

        Figura[] coleccionFiguras = new Figura[3];
        coleccionFiguras[0] = figura;
        coleccionFiguras[1] = miRectangulo;
        coleccionFiguras[2] = miCirculo;

        System.out.println("Area del rectangulo: " + miRectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + miRectangulo.calcularPerimetro());
        System.out.println("Area del circulo: " + miCirculo.calcularArea());
        System.out.println("Perimetro del circulo: " + miCirculo.calcularPerimetro());

        Empleado empleado = new Empleado("Raquel", "Bueno", "analista de crédito");
        EmpleadoRH empleadoRH = new EmpleadoRH("Maria", "Casas", "Recursos Humanos");
        empleadoRH.contratarEmpleado(empleado);
        empleado.trabajar();
        System.out.println("Salario mensual de " + empleado.getNombre() + " " + empleado.getApellidos() + ": " + empleado.calcularSalario() + " colones.");
    }
}
