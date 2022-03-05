/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datnlm.sax;

import datnlm.dtos.CakeDTO;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author datnlm
 */
public class CakeHandler extends DefaultHandler {

    private String name, price, currentTagName, fromCookingTime, toCookingTime, firstname, lastname;
    private boolean found, foundAvailable, foundCookingTime;
    private CakeDTO cake;
    private List<CakeDTO> listCake;

    public CakeHandler(String fromCookingTime, String toCookingTime) {
        this.fromCookingTime = fromCookingTime;
        this.toCookingTime = toCookingTime;
        found = false;
        foundAvailable = false;
        foundCookingTime = false;
    }

    public List<CakeDTO> getListCake() {
        return listCake;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
        currentTagName = qName;
        if (!found) {
            if (qName.equals("id")) {
                String isAvailable = attributes.getValue("isAvailable");
                if (isAvailable.equals("true")) {
                    foundAvailable = true;
                    String cookingTime = attributes.getValue("cookingTime");
                    if (Integer.parseInt(cookingTime) >= Integer.parseInt(fromCookingTime)
                            && Integer.parseInt(cookingTime) <= Integer.parseInt(toCookingTime)) {
                        foundCookingTime = true;
                        cake = new CakeDTO();
                        cake.setCookingTime(cookingTime);
                    }
                }
            }
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        if (!found) {
            String str = new String(ch, start, length);
            if (foundAvailable) {
                if (currentTagName.equals("name")) {
                    name = str.trim();
                } else if (currentTagName.equals("price")) {
                    price = str.trim();

                } else if (currentTagName.equals("firstname")) {
                    firstname = str.trim();

                } else if (currentTagName.equals("lastname")) {
                    lastname = str.trim();
                    if (foundCookingTime) {
                        found = true;
                    }
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
        currentTagName = "";
        if (qName.equals("cake")) {
            if (found) {
                if (listCake == null) {
                    listCake = new ArrayList<>();
                }
                cake.setName(name);
                cake.setPrice(price);
                cake.setFirstname(firstname);
                cake.setLastname(lastname);
                listCake.add(cake);
            }
            found = false;
            foundAvailable = false;
            foundCookingTime = false;
            cake = null;
        }
    }
}
