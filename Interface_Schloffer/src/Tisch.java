public class Tisch implements Transportierbar {
    private final int gewicht;
    private final int laenge;
    private final int breite;
    private final int hoehe;
    private final boolean zerbrechlich;
    private final boolean stapelbar;

    public Tisch(int gewicht, int laenge, int breite, int hoehe, boolean zerbrechlich, boolean stapelbar) {
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
        this.zerbrechlich = zerbrechlich;
        this.stapelbar = stapelbar;
    }

    @Override
    public int gewichtKg() {
        return gewicht;
    }

    @Override
    public int laengeCm() {
        return laenge;
    }

    @Override
    public int breiteCm() {
        return breite;
    }

    @Override
    public int hoeheCm() {
        return hoehe;
    }

    @Override
    public boolean zerbrechlich() {
        return zerbrechlich;
    }

    @Override
    public boolean stapelbar() {
        return stapelbar;
    }

    @Override
    public String beschriftung() {
        return "Möbelstück: Tisch";
    }
}