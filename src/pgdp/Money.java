package pgdp;

public class Money extends MiniJava {

    /**
     * Keine Methode der Klasse Money darf das Objekt verändern (Javasprech:
     * “Immutable-Object”).
     */
    private int cent;

    /**
     * Des Weiteren muss die Klasse einen Konstruktor Money() haben, welcher die
     * Variable cent auf Null setzt.
     */
    public Money() {
        cent = 0;
    }

    /**
     * Ein weiterer Konstruktur Money(int cent) soll die Objektvariable cent auf
     * den Wert der Argumentvariable cent setzen.
     */
    public Money(int cent) {
        cent = this.cent;
    }

    /**
     * Die Methode getCent() liefert den Wert der Objektvariable cent zurück.
     */
    public int getCent() {
        return cent;
    }

    /**
     * Die Methode addMoney(Money m) erzeugt ein neues Objekt Money und liefert
     * dieses zurück, in dem die Cent-Beträge this.cent und m.cent addiert sind.
     * Zum Beispiel: new Money(101).addMoney(new Money(-100)) liefert ein
     * Objekt, welches äquivalent zu new Money(1) ist.
     */
    public Money addMoney(Money m) {
        Money moneyNew = new Money(m.cent);
        moneyNew.cent += this.cent;
        return moneyNew;
    }

    /**
     * Die Methode toString() liefert eine Stringrepräsentation des Objekts
     * zurück. Der Cent-Betrag soll als Euro-Betrag ausgegeben werden. Dabei
     * müssen immer zwei Nachkommastellen ausgegeben werden und mindestens eine
     * Vorkommastelle. Als Dezimalstelle dient ein Komma. DesWeiteren muss der
     * Suffix “Euro” lauten, der mit genau einem Leerzeichen auf die Zahl folgt.
     * Das Format ist also folgendes
     * <Eine-oder-mehr-Vorkommastellen>,<1te-Nachkommastelle><2te-Nachkommastelle> Euro
     * Beispiel: new Money(10010).toString() gleicht dem String "100,10 Euro".
     */
    public String toString() {
        String EuroBetrag = cent / 100 + "," + cent % 100 + " Euro";
        return EuroBetrag;
    }

    public static void main(String args[]) {
        //System.out.println("Money " + getCent());

    }
}
