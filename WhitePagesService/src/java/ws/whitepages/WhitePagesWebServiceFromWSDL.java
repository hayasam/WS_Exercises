/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ws.whitepages;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;

/**
 *
 * @author kucharekm
 */
@WebService(serviceName = "WhitePagesWSDLService", portName = "WhitePagesWSDLPort", endpointInterface = "ws.whitepages.WhitePagesWSDLPortType", targetNamespace = "http://whitepages.ws", wsdlLocation = "WEB-INF/wsdl/WhitePagesWebServiceFromWSDL/WhitePagesWSDL.wsdl")
public class WhitePagesWebServiceFromWSDL {

    private Map<String, PersonType> personMap = new HashMap<String, PersonType>();

    public java.lang.String addPerson(ws.whitepages.PersonType person) throws AddPersonFault {
        if (person == null) {
            AddPersonFaultType faultInfo = new AddPersonFaultType();
            faultInfo.setErrorMessage("Person cannot be null");

            throw new AddPersonFault("error", faultInfo);
        }

        if (person.getPhone() == null) {
            AddPersonFaultType faultInfo = new AddPersonFaultType();
            faultInfo.setErrorMessage("Phone cannot be null");
            faultInfo.setPerson(person);

            throw new AddPersonFault("error", faultInfo);
        }

        String key = person.getFirstName() + " " + person.getLastName();
        if (personMap.containsKey(key)) {

            AddPersonFaultType faultInfo = new AddPersonFaultType();
            faultInfo.setPerson(person);
            faultInfo.setErrorMessage("Person already exists");

            throw new AddPersonFault("error", faultInfo);

        } else {
            personMap.put(key, person);
            return "done";
        }
    }

}
