public class Konto {
    
    private String name;
    private int betrag;
    private int anzahlTransaktionen;

    public Konto(String nutzerName, int startBetrag){
        name = nutzerName;
        betrag = startBetrag;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String neuerName){
        name = neuerName;
    }
    
    public int getBetrag(){
        return betrag;
    }
    
    public void setBetrag(int neuerBetrag){
        betrag = neuerBetrag;
    }
}
