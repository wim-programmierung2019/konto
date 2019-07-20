import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Main {
    
    /**
     * Kontosystem
     */
    public static void main(String[] args){
        // Legen Sie eine Klasse Konto an, die mit einem Betrag und 
        // Kontoinhaber initialisiert werden kann. Die Klasse Konto 
        // soll zudem die Anzahl getätigter Transaktionen speichern 
        // und alle Attribute durch geeignete Methoden ändern bzw. 
        // ausgeben lassen.
        // Erinnerung: Denken Sie an Kapselung!
        Konto meinKonto = new Konto(50, "Julian");
        Konto zweiKonto = new Konto(10, "Dennis");
        System.out.println(meinKonto.getSaldo());
        meinKonto.transaktion(zweiKonto, 10);
        System.out.println(meinKonto.getAnzahlTransaktion());
        System.out.println(meinKonto.getSaldo());
        System.out.println(zweiKonto.getSaldo());
        
        
        
        
        
        
        
        
        //JUnitCore junit = new JUnitCore();
        //junit.addListener(new TextListener(System.out));
        //junit.run(KontoTest.class);
    }
    
}
