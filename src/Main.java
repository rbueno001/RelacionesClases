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
    }
}
