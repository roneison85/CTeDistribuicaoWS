package br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe;

public class CTeDistribuicaoDFeSoapProxy implements br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoap {
  private String _endpoint = null;
  private br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoap cTeDistribuicaoDFeSoap = null;
  
  public CTeDistribuicaoDFeSoapProxy() {
    _initCTeDistribuicaoDFeSoapProxy();
  }
  
  public CTeDistribuicaoDFeSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCTeDistribuicaoDFeSoapProxy();
  }
  
  private void _initCTeDistribuicaoDFeSoapProxy() {
    try {
      cTeDistribuicaoDFeSoap = (new br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeLocator()).getCTeDistribuicaoDFeSoap();
      if (cTeDistribuicaoDFeSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cTeDistribuicaoDFeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cTeDistribuicaoDFeSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cTeDistribuicaoDFeSoap != null)
      ((javax.xml.rpc.Stub)cTeDistribuicaoDFeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeSoap getCTeDistribuicaoDFeSoap() {
    if (cTeDistribuicaoDFeSoap == null)
      _initCTeDistribuicaoDFeSoapProxy();
    return cTeDistribuicaoDFeSoap;
  }
  
  public br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CteDistDFeInteresseResponseCteDistDFeInteresseResult cteDistDFeInteresse(br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CteDistDFeInteresseCteDadosMsg cteDadosMsg) throws java.rmi.RemoteException{
    if (cTeDistribuicaoDFeSoap == null)
      _initCTeDistribuicaoDFeSoapProxy();
    return cTeDistribuicaoDFeSoap.cteDistDFeInteresse(cteDadosMsg);
  }
  
  
}