/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Pernille
 */
@Entity
public class Address implements Serializable
{
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private String additionalInfo;
    
    @OneToMany
    private ArrayList<InfoEntity> infoE = new ArrayList();
    
    @OneToMany
     private ArrayList<CityInfo> cI = new ArrayList();

    public Address()
    {
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getAdditionalInfo()
    {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo)
    {
        this.additionalInfo = additionalInfo;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
    
    
}
