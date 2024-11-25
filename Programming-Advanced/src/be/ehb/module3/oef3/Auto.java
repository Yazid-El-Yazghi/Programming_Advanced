package be.ehb.module3.oef3;

public class Auto {
    private double kilometerteller;
    private double brandstoftank;
    private double verbruik;
    private final int tankMax = 55;

    public Auto() {
        this.kilometerteller = 0;
        this.brandstoftank = 0;
        this.verbruik = 6.5;
    }

    public Auto(double kilometerteller, double brandstoftank, double verbruik) {
        this.kilometerteller = kilometerteller;
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
    }

    public void vulBij() {
        this.brandstoftank = this.tankMax;
    }

    public double rij(double afstand) {
        kilometerteller += afstand;
        if(afstand < 0) {
            afstand -= afstand*2;
        }

        double verbruikteBrandstof = afstand / 100 * verbruik;
        if (brandstoftank - verbruikteBrandstof < 0) {
            afstand = (brandstoftank / verbruik) * 100;
            brandstoftank = 0;
            kilometerteller += afstand;
        } else {
            brandstoftank -= verbruikteBrandstof;
            kilometerteller += afstand;
        }
        return afstand;
    }

    public void getAll() {
        System.out.println("Kilometerteller: " + kilometerteller);
        System.out.println("Brandstoftank: " + brandstoftank);
        System.out.println("Verbruik: " + verbruik);
    }

}
