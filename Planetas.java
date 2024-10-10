public class Planetas {
    private String nombre;
    private int cantidadSatelites;
    private double masa, volumen, diametro, distanciaSol;
    private boolean esObservable;

    public Planetas(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.esObservable = esObservable;
    }

    public double calcularDensidad() {
        return this.masa / this.volumen;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaSol + " km");
        System.out.println("Es observable: " + (esObservable ? "Sí" : "No"));
        System.out.println("Densidad: " + calcularDensidad() + " kg/km³");
    }

    public static void main(String[] args) {
        Planetas p1 = new Planetas("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planetas p2 = new Planetas("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
        System.out.println("Atributos del planeta 1 (Tierra):");
        p1.imprimirAtributos();
        System.out.println("\nAtributos del planeta 2 (Jupiter):");
        p2.imprimirAtributos();
    }
}
