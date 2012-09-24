/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.whitepages.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kucharekm
 */
public class WhitePagesTest {

    @Test
    public void testAddPerson() {
        ws.whitepages.WhitePagesWSDLService service = new ws.whitepages.WhitePagesWSDLService();
        ws.whitepages.WhitePagesWSDLPortType port = service.getWhitePagesWSDLPort();
        // TODO initialize WS operation arguments here
        ws.whitepages.PersonType person = new ws.whitepages.PersonType();
        // TODO process result here
        java.lang.String result = port.addPerson(person);

        assertEquals("done", result);

    }
}
