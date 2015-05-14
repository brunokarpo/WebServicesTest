
package br.ufg.si.ad.webServiceTest.stubs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyConvertor", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/CurrencyConvertor.asmx?WSDL")
public class CurrencyConvertor
    extends Service
{

    private final static URL CURRENCYCONVERTOR_WSDL_LOCATION;
    private final static WebServiceException CURRENCYCONVERTOR_EXCEPTION;
    private final static QName CURRENCYCONVERTOR_QNAME = new QName("http://www.webserviceX.NET/", "CurrencyConvertor");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/CurrencyConvertor.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYCONVERTOR_WSDL_LOCATION = url;
        CURRENCYCONVERTOR_EXCEPTION = e;
    }

    public CurrencyConvertor() {
        super(__getWsdlLocation(), CURRENCYCONVERTOR_QNAME);
    }

    public CurrencyConvertor(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYCONVERTOR_QNAME, features);
    }

    public CurrencyConvertor(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYCONVERTOR_QNAME);
    }

    public CurrencyConvertor(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYCONVERTOR_QNAME, features);
    }

    public CurrencyConvertor(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyConvertor(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyConvertorSoap
     */
    @WebEndpoint(name = "CurrencyConvertorSoap")
    public CurrencyConvertorSoap getCurrencyConvertorSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "CurrencyConvertorSoap"), CurrencyConvertorSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConvertorSoap
     */
    @WebEndpoint(name = "CurrencyConvertorSoap")
    public CurrencyConvertorSoap getCurrencyConvertorSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "CurrencyConvertorSoap"), CurrencyConvertorSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYCONVERTOR_EXCEPTION!= null) {
            throw CURRENCYCONVERTOR_EXCEPTION;
        }
        return CURRENCYCONVERTOR_WSDL_LOCATION;
    }

}
