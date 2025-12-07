package ws;

import java.util.Date;

public class BankAccountService {

    public double convertAmount(double amount) {
        return amount * 11;
    }

    public Account getAccount(int code) {
        return new Account(code,new Date(),11);
    }

}
