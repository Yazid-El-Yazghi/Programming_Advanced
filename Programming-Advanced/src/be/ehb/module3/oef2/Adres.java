package be.ehb.module3.oef2;

public class Adres {
    private String straatnaam;
    private int huisnummer;
    private int postcode;
    private String woonplaats;
    private int bus;

    public Adres(String straatnaam, int huisnummer, int postcode, String woonplaats, int bus) {
        this.straatnaam = straatnaam;
        if (postcode < 0 || postcode > 9999) {
            System.out.println("Slechte postcode");
            this.postcode = 9999;
        } else{
            this.postcode = postcode;
        }
        this.huisnummer = huisnummer;
        this.woonplaats = woonplaats;
        this.bus = bus;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        if (postcode < 0 || postcode > 9999) {
            System.out.println("Slechte postcode");
            this.postcode = 9999;
        } else{
            this.postcode = postcode;
        }
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public void getAll(){
        System.out.println("Straatnaam: " + straatnaam);
        System.out.println("Huisnummer: " + huisnummer);
        System.out.println("Postcode: " + postcode);
        System.out.println("Woonplaats: " + woonplaats);
        System.out.println("Bus: " + bus);
    }
}
