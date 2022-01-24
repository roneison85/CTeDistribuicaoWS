/**
 * CTeDistribuicaoDFeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe;

public class CTeDistribuicaoDFeLocator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFe {

    public CTeDistribuicaoDFeLocator() {
    }


    public CTeDistribuicaoDFeLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CTeDistribuicaoDFeLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CTeDistribuicaoDFeSoap
    private java.lang.String CTeDistribuicaoDFeSoap_address = "https://www1.cte.fazenda.gov.br/CTeDistribuicaoDFe/CTeDistribuicaoDFe.asmx";

    public java.lang.String getCTeDistribuicaoDFeSoapAddress() {
        return CTeDistribuicaoDFeSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CTeDistribuicaoDFeSoapWSDDServiceName = "CTeDistribuicaoDFeSoap";

    public java.lang.String getCTeDistribuicaoDFeSoapWSDDServiceName() {
        return CTeDistribuicaoDFeSoapWSDDServiceName;
    }

    public void setCTeDistribuicaoDFeSoapWSDDServiceName(java.lang.String name) {
        CTeDistribuicaoDFeSoapWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoap getCTeDistribuicaoDFeSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CTeDistribuicaoDFeSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCTeDistribuicaoDFeSoap(endpoint);
    }

    public br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoap getCTeDistribuicaoDFeSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoapStub _stub = new br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoapStub(portAddress, this);
            _stub.setPortName(getCTeDistribuicaoDFeSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCTeDistribuicaoDFeSoapEndpointAddress(java.lang.String address) {
        CTeDistribuicaoDFeSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoapStub _stub = new br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoapStub(new java.net.URL(CTeDistribuicaoDFeSoap_address), this);
                _stub.setPortName(getCTeDistribuicaoDFeSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CTeDistribuicaoDFeSoap".equals(inputPortName)) {
            return getCTeDistribuicaoDFeSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeDistribuicaoDFe", "CTeDistribuicaoDFe");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeDistribuicaoDFe", "CTeDistribuicaoDFeSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CTeDistribuicaoDFeSoap".equals(portName)) {
            setCTeDistribuicaoDFeSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
