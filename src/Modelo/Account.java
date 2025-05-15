
package Modelo;

import java.util.ArrayList;

public class Account {
    private Customer Customer;
    private float Balance; 
    private Card Card;
    private ArrayList<TakeOut> Retiros;
    private ArrayList<Deposit> Depositos;
    

    public Account(Customer Customer, float Balance, int num,int pass) {
        this.Customer = Customer;
        this.Balance = Balance;
        this.Card = new Card(num, pass, this);
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

    public Card getCard() {
        return Card;
    }

    public void setCard(Card Card) {
        this.Card = Card;
    }

    public ArrayList<TakeOut> getRetiros() {
        return Retiros;
    }
    
    
}
