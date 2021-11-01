package hu.petrik;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    private static double alapkamat=1.18;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos){
        super(tulajdonos);
        this.kamat=alapkamat;
    }
    public double getKamat(){
        return kamat;
    }
    public void setKamat(double kamat){
        this.kamat=kamat;
    }
    @Override
    public boolean kivesz(double osszeg) {
        boolean sikerult = true;
        if(osszeg > getEgyenleg()){
            sikerult = false;
        } else {
            setEgyenleg(getEgyenleg()-osszeg);
        }
        return sikerult;
    }
    public void kamatJovaIras(){
        setEgyenleg(getEgyenleg()*kamat);
    }
}
