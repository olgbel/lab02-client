package ru.study.client;

import ru.study.server.IDemo;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/lab02-1.0-SNAPSHOT/demo?wsdl");
        QName qname = new QName("http://server.study.ru/", "IDemoService");

        Service service = Service.create(url, qname);
        IDemo port = service.getPort(ru.study.server.IDemo.class);
        String user = "Anton";
        port.add(user, "message1");
        port.add(user, "message2");
        port.add(user, "message3");

        System.out.println(port.getMessage(user, 2));
        System.out.println(port.getMessage(user, 32));

        System.out.println(port.getAllMessage(user));
    }
}
