package client.ru.study.server;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/lab02-1.0-SNAPSHOT/demo?wsdl");
        QName qname = new QName("http://server.study.ru/", "IDemoService");

        Service service = Service.create(url, qname);
        ru.study.server.IDemo converter = service.getPort(ru.study.server.IDemo.class);
        String user = "Anton";
        String message = "message1";

        System.out.println(converter.getMessage(user, 0));

    }
}
