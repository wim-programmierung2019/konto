
public class Konto {
    private double saldo; 
    private String inhaber; 
    private int anzahl; 

    public double getSaldo(){
        return saldo; 
    }

    public double setSaldo(double betrag){
          saldo = betrag; 
    }  
    
    public String getInhaber(){
        return inhaber; 
    }
    
    public String setInhaber(String Kunde){
        inhaber = Kunde; 
    }
    
    public int getAnzahl(){
        return anzahl; 
    }
    
    public int setAnzahl(int value) {
        anzahl = value;
    }
    
    public void countAnzahl(){
        anzahl++;
    }

}
