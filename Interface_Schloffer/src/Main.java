public class Main {
    public static void main(String[] args) {
        Tisch tisch = new Tisch(50, 120, 100, 75, false, true);
        Schaf schaf = new Schaf("Lamm", false, 75.0f, 100.0f, 50.0f, 70.0f);

        System.out.println("\nTransportdetails für den Tisch:\n");
        System.out.println("Volumen:             " + Transport.berechneVolumen(tisch) + " m³");
        System.out.println("Transport machbar:   " + Transport.istTransportMachbar(tisch));

        System.out.println("\n\nTransportdetails für das Schaf:\n");
        System.out.println("Volumen:             " + Transport.berechneVolumen(schaf) + " m³");
        System.out.println("Transport machbar:   " + Transport.istTransportMachbar(schaf));
    }
}
