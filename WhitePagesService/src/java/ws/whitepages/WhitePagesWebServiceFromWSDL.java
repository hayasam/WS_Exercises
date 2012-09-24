/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ws.whitepages;

import javax.jws.WebService;

/**
 *
 * @author kucharekm
 */
@WebService(serviceName = "WhitePagesWSDLService", portName = "WhitePagesWSDLPort", endpointInterface = "ws.whitepages.WhitePagesWSDLPortType", targetNamespace = "http://whitepages.ws", wsdlLocation = "WEB-INF/wsdl/WhitePagesWebServiceFromWSDL/WhitePagesWSDL.wsdl")
public class WhitePagesWebServiceFromWSDL {

    public java.lang.String addPerson(ws.whitepages.PersonType person) {
        return "done";
    }

}
