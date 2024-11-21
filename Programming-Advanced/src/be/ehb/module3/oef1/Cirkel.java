package be.ehb.module3.oef1;

public class Cirkel {
    String Kleur;
    float Straal;

    public Cirkel(){
        this.Kleur = "Geel";
        this.Straal = 3;
    }

    public Cirkel(float Straal){
        this.Straal = Straal;
    }

    public Cirkel(String kleur) {
        this.Kleur = kleur;
    }

    public Cirkel(float straal, String kleur) {
        Straal = straal;
        Kleur = kleur;
    }

    public void getCirkel(){
        System.out.println(this.Kleur);
        System.out.println(this.Straal);
    }

    public String getKleur(){
        return this.Kleur;
    }

    public void getsStraal(){
        System.out.println(this.Straal);
    }

    public void setKleur(String kleur){
        this.Kleur = kleur;
    }

    public void setStraal(float straal){
        this.Straal = straal;
    }

    public void getOmtrek(){
        System.out.println(2 * Math.PI * this.Straal);
    }

    public void getOppervlakte(){
        System.out.println(Math.PI * Math.pow(this.Straal, 2));
    }

    public void getDiameter(){
        System.out.println(2 * this.Straal);
    }

}
