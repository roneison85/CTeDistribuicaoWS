/**
 * CteDistDFeInteresseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe;

public class CteDistDFeInteresseResponse  implements java.io.Serializable {
    private br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CteDistDFeInteresseResponseCteDistDFeInteresseResult cteDistDFeInteresseResult;

    public CteDistDFeInteresseResponse() {
    }

    public CteDistDFeInteresseResponse(
           br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CteDistDFeInteresseResponseCteDistDFeInteresseResult cteDistDFeInteresseResult) {
           this.cteDistDFeInteresseResult = cteDistDFeInteresseResult;
    }


    /**
     * Gets the cteDistDFeInteresseResult value for this CteDistDFeInteresseResponse.
     * 
     * @return cteDistDFeInteresseResult
     */
    public br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CteDistDFeInteresseResponseCteDistDFeInteresseResult getCteDistDFeInteresseResult() {
        return cteDistDFeInteresseResult;
    }


    /**
     * Sets the cteDistDFeInteresseResult value for this CteDistDFeInteresseResponse.
     * 
     * @param cteDistDFeInteresseResult
     */
    public void setCteDistDFeInteresseResult(br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CteDistDFeInteresseResponseCteDistDFeInteresseResult cteDistDFeInteresseResult) {
        this.cteDistDFeInteresseResult = cteDistDFeInteresseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CteDistDFeInteresseResponse)) return false;
        CteDistDFeInteresseResponse other = (CteDistDFeInteresseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cteDistDFeInteresseResult==null && other.getCteDistDFeInteresseResult()==null) || 
             (this.cteDistDFeInteresseResult!=null &&
              this.cteDistDFeInteresseResult.equals(other.getCteDistDFeInteresseResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCteDistDFeInteresseResult() != null) {
            _hashCode += getCteDistDFeInteresseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CteDistDFeInteresseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeDistribuicaoDFe", ">cteDistDFeInteresseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cteDistDFeInteresseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeDistribuicaoDFe", "cteDistDFeInteresseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/cte/wsdl/CTeDistribuicaoDFe", ">>cteDistDFeInteresseResponse>cteDistDFeInteresseResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
