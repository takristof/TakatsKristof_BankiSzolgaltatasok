package hu.petrik;

public class HitelSzamla extends Szamla {
    private final int hitelkeret;

    public HitelSzamla(Tulajdonos tulajdonos,int hitelkeret){
        super(tulajdonos);
        this.hitelkeret=hitelkeret;
    }
    public int getHitelkeret() {
        return hitelkeret;
    }
    @Override
    public boolean kivesz(double osszeg) {
        boolean sikeres = true;
        if (osszeg > getEgyenleg()+hitelkeret) {
            sikeres = false;
        } else {
            setEgyenleg(getEgyenleg()-osszeg);
        }
        return sikeres;
    }

}
