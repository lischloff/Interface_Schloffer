//Author: Lisa Schloffer
//Project: Polymorphie_Schloffer
//13.09.2024 | Eibiswald

public class Schaf implements Transportierbar {
    private final String name;
    private final boolean zerbrechlich;
    private final float gewicht;
    private final float laenge;
    private final float breite;
    private final float hoehe;

    public Schaf(String name, boolean zerbrechlich, float gewicht, float laenge, float breite, float hoehe) {
        this.name = name;
        this.zerbrechlich = zerbrechlich;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public int gewichtKg() {
        return (int)gewicht;
    }

    @Override
    public int laengeCm() {
        return (int)laenge;
    }

    @Override
    public int breiteCm() {
        return (int)breite;
    }

    @Override
    public int hoeheCm() {
        return (int)hoehe;
    }

    @Override
    public boolean zerbrechlich() {
        return zerbrechlich;
    }

    @Override
    public boolean stapelbar() {
        return false; // Schafe sind nicht stapelbar
    }

    @Override
    public String beschriftung() {
        return "Lebewesen: Schaf " + name;
    }
}