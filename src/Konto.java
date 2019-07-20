

//Attribute
public class Konto {
private double betrag; 
private String name;
private int transaktionen; 

//Konstruktor
public Konto (double Kontobetrag, String Kontoinhaber){
betrag = Kontobetrag;
name = Kontoinhaber; 
transaktionen = 0;      
}

//Methoden
public double getBetrag(){
return betrag; 
}

public String getName(){
return name;
}

publc int getTransaktionen(){
return transaktionen;   
}

public void setBetrag(double value){
betrag = value;    
}
 
public void setName (String value){
name = value;
}

publc int setTransaktionen(int value){
transaktionen = value;   
}
}

