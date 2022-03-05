/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datnlm.dtos;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Admin
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CakeDTO", propOrder = {
    "id",
    "name",
    "description",
    "quantity",
    "price",
    "chef",
    "firstname",
    "lastname"
})
@XmlRootElement(name = "cake")
public class CakeDTO implements Serializable {

    @XmlElement(name = "id")
    private IdDTO id;
    @XmlAttribute(name = "isAvailable")
    private String isAvailable;
    @XmlAttribute(name = "cookingTime")
    private String cookingTime;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "quantity")
    private String quantity;
    @XmlElement(name = "price")
    private String price;
    @XmlElement(name = "chef")
    private ChefDTO chef;
    @XmlElement(name = "firstname")
    private String firstname;
    @XmlElement(name = "lastname")
    private String lastname;

    public CakeDTO() {
    }

    public CakeDTO(IdDTO id, String isAvailable, String cookingTime, String name, String description, String quantity, String price, ChefDTO chef, String firstname, String lastname) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.cookingTime = cookingTime;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.chef = chef;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public IdDTO getId() {
        return id;
    }

    public void setId(IdDTO id) {
        this.id = id;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ChefDTO getChef() {
        return chef;
    }

    public void setChef(ChefDTO chef) {
        this.chef = chef;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
