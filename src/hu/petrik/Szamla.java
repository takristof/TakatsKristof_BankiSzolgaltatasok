package hu.petrik;

public abstract class Szamla extends BankiSzolgaltatas{
    private double egyenleg;

    public Szamla(Tulajdonos tulajdonos){
        super(tulajdonos);
    }
    public double getEgyenleg(){
        return egyenleg;
    }
    public void Befizet(double osszeg){
        if(osszeg>0){
            this.egyenleg+=osszeg;
        }
    }
    public abstract boolean kivesz(double osszeg);

    protected void setEgyenleg(double osszeg) {
        this.egyenleg = osszeg;
    }
}
