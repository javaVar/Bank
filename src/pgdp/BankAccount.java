package pgdp;

public class BankAccount extends MiniJava {
    private int bankaccount;
    private String firstname;
    private String surname;
    private Money balance;

    /**Der Konstruktor initialisiert alle Objektvariablen anhand der Parameter sowie
     * die Objektvariable balance auf ein Money-Objekt welches Null Cent repräsentiert.
     */
    public BankAccount(int accountnumber, String fname, String sname){
        bankaccount = accountnumber;
        firstname = fname;
        surname = sname;
        balance = null;
    }

    /**Die get’er Methoden sollen die korrespondierenden Objektvariablen zurückliefern.
     */
    public int getAccountnumber(){
        return this.bankaccount;
    }

    /**Die get’er Methoden sollen die korrespondierenden Objektvariablen zurückliefern.
     */
    public String getFirstname(){
        return this.firstname;
    }

    /**Die get’er Methoden sollen die korrespondierenden Objektvariablen zurückliefern.
     */
    public String getSurname(){
        return this.surname;
    }

    /**Die get’er Methoden sollen die korrespondierenden Objektvariablen zurückliefern.
     */
    public Money getBalance(){
        return this.balance;
    }

    /**Die Methode addMoney(Money m) addiert das Geld m auf den Kontostand balance des jeweiligen Objekts.
     */
    public void addMoney(Money m){
        this.balance.addMoney(m);
    }

    /**Die Methode toString liefert einen String zurück, der alle Werte aller Objektvariablen
     * wiederspiegelt (die exakte Formatierung ist irrelevant).
     */
    public String toString(){
        String overview =   "-------------------------------------------------" +
                            "\nName\t\t\t"      + getFirstname() + " " + getSurname() +
                            "\nKonto-Nr.:\t"    + getAccountnumber() +
                            "\nKontostand:\t"   + getBalance() +
                            "-------------------------------------------------";
        return overview;
    }

    public static void main(String args[]) {

    }
}
