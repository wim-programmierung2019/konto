
public class Konto {
    private double saldo; 
    private String inhaber; 
    private int anzahl; 

    public Konto(double betrag, String kunde){
      saldo = betrag; 
    inhaber = kunde;
    }
    
    
    public double getSaldo(){
        return saldo; 
    }

    public void setSaldo(double betrag){
          saldo = betrag; 
    }  
    
    public String getInhaber(){
        return inhaber; 
    }
    
    public void setInhaber(String Kunde){
        inhaber = Kunde; 
    }
    
    public int getAnzahl(){
        return anzahl; 
    }
    
    public void setAnzahl(int value) {
        anzahl = value;
    }
    
    public void countAnzahl(){
        anzahl++;
    }

    public void ueberweise(Konto ziel, double betrag){
        saldo = saldo - betrag; 
        ziel.setSaldo(ziel.getSaldo() + betrag);
    }
}
