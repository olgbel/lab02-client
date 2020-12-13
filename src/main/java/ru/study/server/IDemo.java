package ru.study.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "IDemo", targetNamespace = "http://server.study.ru/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface IDemo {


    /**
     * @param arg0
     * @return returns server.MessageList
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.study.ru/IDemo/getAllMessageRequest", output = "http://server.study.ru/IDemo/getAllMessageResponse")
    public MessageList getAllMessage(
            @WebParam(name = "arg0", partName = "arg0")
                    String arg0);

    /**
     * @param arg1
     * @param arg0
     * @return returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.study.ru/IDemo/addRequest", output = "http://server.study.ru/IDemo/addResponse")
    public boolean add(
            @WebParam(name = "arg0", partName = "arg0")
                    String arg0,
            @WebParam(name = "arg1", partName = "arg1")
                    String arg1);

    /**
     * @param arg1
     * @param arg0
     * @return returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.study.ru/IDemo/getMessageRequest", output = "http://server.study.ru/IDemo/getMessageResponse")
    public String getMessage(
            @WebParam(name = "arg0", partName = "arg0")
                    String arg0,
            @WebParam(name = "arg1", partName = "arg1")
                    int arg1);

}