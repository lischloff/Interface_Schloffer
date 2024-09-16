//Author: Lisa Schloffer
//Project: Polymorphie_Schloffer
//13.09.2024 | Eibiswald

public interface Transportierbar {
    float MAX_GEWICHT_PRO_FLAECHE = 29.99f;

    int gewichtKg();
    int laengeCm();
    int breiteCm();
    int hoeheCm();
    boolean zerbrechlich();
    boolean stapelbar();
    String beschriftung();

}
