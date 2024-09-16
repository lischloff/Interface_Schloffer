//Author: Lisa Schloffer
//Project: Polymorphie_Schloffer
//13.09.2024 | Eibiswald

public class Transport {

    private static final float MAX_HOEHE_CM = 500.0f;
    private static final float MAX_BREITE_CM = 500.0f;
    private static final float MAX_LAENGE_CM = 800.0f;

    public static float berechneVolumen(Transportierbar item) {
        // Volumen in m³ berechnen: Länge * Breite * Höhe (in cm) / 1.000.000
        return item.laengeCm() * item.breiteCm() * item.hoeheCm() / 1000000.0f;
    }

    public static boolean istTransportMachbar(Transportierbar item) {
        // Überprüfen, ob die Dimensionen des Objekts die maximalen Werte überschreiten
        if (item.hoeheCm() > MAX_HOEHE_CM || item.breiteCm() > MAX_BREITE_CM || item.laengeCm() > MAX_LAENGE_CM) {
            return false;
        }

        // Gewicht pro Fläche in kg/m² berechnen
        float gewichtProFlaeche = (float)item.gewichtKg() / (item.laengeCm() * item.breiteCm() / 10000.0f);

        return gewichtProFlaeche <= Transportierbar.MAX_GEWICHT_PRO_FLAECHE;
    }
}
