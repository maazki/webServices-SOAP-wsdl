package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWs")
public class BankAccountService {

    @WebMethod(operationName = "ConversionEuroToDh")
    public double convertAmount(@WebParam(name = "montant") double amount) {
        return amount * 11;
    }

    @WebMethod
    public Account getAccount(@WebParam(name="code") int code) {
        return new Account(code,new Date(),11);
    }

    @WebMethod
    public List<Account> listAccount(){
        return List.of(
                new ws.Account(1,new Date(),45),
                new ws.Account(2,new Date(),55),
                new ws.Account(3,new Date(),56)
        );
    }

}
