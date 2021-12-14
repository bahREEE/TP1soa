import javax.xml.ws.Endpoint;

import soapservice.Calculator;

public class Server {

    private static final String URL = "http://localhost:8085/";


    public static void main(String[] args) throws Exception {

        System.out.println("RUNNING ON " + URL);
        Endpoint.publish(URL, new Calculator());

    }
}
