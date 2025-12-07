package ws;

import java.util.Date;


public class Account {

    private int id;
    private double balance;
    private Date createdAt;

    public Account() {
    }

    public Account(int id, Date createdAt, double balance) {
        this.id = id;
        this.createdAt = createdAt;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
