package soapservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Calculator {

    @WebMethod
    public int add (@WebParam(name="first") int first, @WebParam(name="second") int second){
        return first + second;
    };

    @WebMethod
    public int substract(@WebParam(name="first") int first, @WebParam(name="second") int second){
        return first - second;
    };
    
}
