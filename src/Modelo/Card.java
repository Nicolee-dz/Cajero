
package Modelo;

public class Card {
    private int NumberCard; 
    private int Password;
    private Account Account;
    private boolean Validity; 

    public boolean isValidity() {
        return Validity;
    }

    public void setValidity(boolean Validity) {
        this.Validity = Validity;
    }

    public Card(int NumberCard, int Password, Account Account) {
        this.NumberCard = NumberCard;
        this.Password = Password;
        this.Account = Account;
    }

    public int getNumberCard() {
        return NumberCard;
    }

    public void setNumberCard(int NumberCard) {
        this.NumberCard = NumberCard;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }

    public Account getAccount() {
        return Account;
    }

    public void setAccount(Account Account) {
        this.Account = Account;
    }
    
    
    
}
