public class Konto {
    private double betrag;
    private String inhaber;
    private int anzahl;
    
    public Konto(int betrag, String inhaber){
        betrag = betrag;
        inhaber = inhaber;
        anzahl = 0;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double value) {
        betrag = value;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String value) {
        inhaber = value;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int value) {
        anzahl = value;
    }
    
    public void countAnzahl(){
        anzahl++;
    }
}