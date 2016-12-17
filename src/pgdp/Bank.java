package pgdp;

public class Bank extends MiniJava {

    /**
     * In einer Liste mit dem Typen BankAccountList wollen wir alle Kunden der
     * Bank auflisten und in der Objektvariable accounts der Klasse Bank
     * speichern
     */
    private BankAccountList accounts;

    private class BankAccountList {

        public BankAccount info;
        public BankAccountList next;

        public BankAccountList (BankAccount ba, BankAccountList bal){
            info = ba;
            next = bal;
        }
    }

    /**
     * Die Methode newAccount legt ein neues Konto an, i.e., also ein neues
     * Objekt vom Typen BankAccount. Jedes Konto erhält eine eindeutige
     * Kontonummer. Jedes neu erzeugte Konto wird in die Liste accounts
     * eingefügt. Schlussendlich liefert die Methode die Kontonummer von dem neu
     * erzeugten Konto zurück.
     */
    public int newAccount(String firstname, String lastname) {
        int no = 100000000;
        if (accounts != null) {
            no = accounts.info.getAccountnumber() + 1;
        }
        BankAccount ba = new BankAccount(no, firstname, lastname);

        accounts = new BankAccountList(ba, accounts);

        return ba.getAccountnumber();
    }

    /**
     * Das Pendant zu der Methode newAccount ist die Methode removeAccount
     * welches aus der Liste accounts das Objekt mit der passenden Kontonummer
     * löscht, falls es denn existiert.
     */
//    public void removeAccount(int accountnumber) {
//        BankAccountList tmp = accounts; //accounts in tmp zwischenspeichern
//        for (int i = accountnumber; i < accounts.info; i++) {   //um vor das zu löschende Listenelement zu gelangen
//            tmp = tmp.next;
//        }
//        tmp.next = tmp.next.next;
//        accounts = tmp; //accounts mit tmp aktualisieren/anpassen
//    }

    /**
     * Die Methode getBalance(int accountnumber) liefert als Rückgabewert den
     * Kontostand des Kontos mit der Kontonummer accountnumber. Falls solch ein
     * Konto nicht in der Liste accounts existiert, wird null zurückgeliefert.
     */
//    public Money getBalance(int accountnumber) {
//        BankAccountList tmp = accounts; //accounts in tmp zwischenspeichern
//        Money result = new Money();
//        for (int i = accountnumber; i < accounts.info; i++) {   //um vor das zu löschende Listenelement zu gelangen
//            tmp = tmp.next;
//        }
//        result = tmp.next.info.getBalance();    //zu löschendes Listenelement zwischenspeichern
//        return result;
//    }

    /**
     * Die Methode depositOrWithdraw(int accountnumber, Money m) addiert das
     * Geld m auf das Konto mit der Kontonummer accountnumber. Falls solch ein
     * Konto nicht in der Liste accounts existiert wird false zurückgeliefert
     * und andernfalls true.
     */
    public boolean depositOrWithdraw(int accountnumber, Money m) {
        return true;
    }

    /**
     * Die Methode transfer(int from, int to, Money m) überweist von dem Konto
     * mit der Kontonummer from auf das Konto mit der Kontonummer to m viel
     * Geld. Sollte das Konto to oder from nicht in der Liste accounts
     * existieren, dann liefert die Methode transfer als Rückgabewert false und
     * verändert die Konten nicht. D.h. vor und nach dem Aufruf muss der
     * Kontostand gleich sein. Andernfalls, wenn die Konten existieren, dann
     * muss nach dem Aufruf gelten, dass das Konto from m viel Geld weniger hat
     * und das Konto to m viel Geld mehr hat. Die Methode liefert in diesem Fall
     * true zurück. Der Informatiker würde davon sprechen, dass die Methode
     * transfer mit der gewünschten Eigenschaft transaktional ist.
     */
    public boolean transfer(int from, int to, Money m) {
        return true;
    }

    /**
     * NEU: Die Methode prüft, ob das Konto bereits in der Liste BankAccountList
     * existiert. Sollte es noch nicht existieren, liefert die Methode false,
     * sonst true.
     */
    public boolean accountExists(int accountnumber) {
        return true;
    }

    public static void main(String args[]) {
        Bank DeutscheBank = new Bank();
        System.out.println("Deutsche Bank: " + DeutscheBank.toString());
        DeutscheBank.newAccount("Leif", "Lühmann");
        System.out.println(DeutscheBank.accounts.info.getAccountnumber() + ": " + DeutscheBank.accounts.info.getFirstname() + " " + DeutscheBank.accounts.info.getSurname());
    }

}
