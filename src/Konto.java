public class Konto {
    
    private int saldo;
    private String inhaber;
    private int anzahlTransaktion=0;
    
    public Konto (int Betrag, String Inhaber){
        saldo = Betrag;
        inhaber = Inhaber;
    }
    
    public int getSaldo(){
    return saldo;
    }
    public void setSaldo(int Betrag){
        saldo=Betrag;
    }
    public String getInhaber(){
        return inhaber;
    }
    public void setInhaber(String Inhaber){
        inhaber=Inhaber;
    }
    public int getAnzahlTransaktion(){
        return anzahlTransaktion;
    }
    public void setAnzahlTransaktion(int anzahl){
        anzahlTransaktion=anzahl;
    }
    public void transaktion(Konto ziel, int betrag){
        saldo = saldo - betrag;
        ziel.setSaldo(ziel.getSaldo() + betrag);
        anzahlTransaktion++;
        
}    
}
