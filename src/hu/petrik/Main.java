package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t1 = new Tulajdonos("Nagy Pisti");
        HitelSzamla h1 = new HitelSzamla(t1, 20000);
        Kartya k1 = h1.ujKartya("32457234-12354343-00000000");

        /*System.out.println("Tulaj neve:");
        System.out.println(k1.getTulajdonos().getNev());
        System.out.println("\n");

        System.out.println("Tulaj kártyaszáma");
        System.out.println(k1.getKartyaSzam());
        System.out.println("\n");

        System.out.println("Számla alap egyenlege: "+k1.getSzamla().getEgyenleg());
        System.out.println("\n");

        System.out.println("Befizetés 20000 FT");
        k1.getSzamla().Befizet(20000);
        System.out.println("Számla egyenlege a befizetés után: "+k1.getSzamla().getEgyenleg());
        System.out.println("\n");

        System.out.println("100000 ft-os vásárlás vásárlás : " + (k1.vasarlas(100000) ? "sikeres":"nem sikeres"));
        System.out.println("1000 ft-os vásárlás vásárlás : " + (k1.vasarlas(1000) ? "sikeres":"nem sikeres"));
        System.out.println("Számla egyenlege a vásárlás után: "+k1.getSzamla().getEgyenleg());
        System.out.println("\n");
        */

        MegtakaritasiSzamla m1 = new MegtakaritasiSzamla(t1);
        System.out.println("A megtakarítási számla kamata: "+m1.getKamat());
        System.out.println("\n");
        System.out.println("A kamat megváltoztatása 1.1-re");
        m1.setKamat(1.1);
        System.out.println("A kamat számla kamata a változtatás után: "+m1.getKamat());
        System.out.println("\n");
        System.out.println("40000 FT feltöltése ");
        m1.Befizet(40000);
        System.out.println("A megtakarítási számla egyenlege: "+m1.getEgyenleg());
        System.out.println("\n");
        System.out.println("Levon 10000 FT-ot: " + (m1.kivesz(10000) ? "sikerült" : "Nem sikerült"));
        System.out.println("A megtakarítási számla egyenlege: "+m1.getEgyenleg());
        System.out.println("Levon 60000 FT-ot: " + (m1.kivesz(60000) ? "sikerült" : "Nem sikerült"));
        System.out.println("A megtakarítási számla egyenlege: "+m1.getEgyenleg());
        System.out.println("\n");
        System.out.println("Kamat jóváírása:");
        m1.kamatJovaIras();
        System.out.println("A megtakarítási számla egyenlege: "+m1.getEgyenleg());

    }
}
