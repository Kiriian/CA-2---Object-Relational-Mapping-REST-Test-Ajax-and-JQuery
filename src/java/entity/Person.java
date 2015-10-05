/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Jeanette
 */
@Entity
public class Person extends InfoEntity 
{
    @Id
    private long id;
    private String firstName;
    private String lastName;
    @ManyToMany
    private ArrayList<Hobby> hobbyList = new ArrayList();

    public Person()
    {
    }

    public Person(long id, String firstName, String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public ArrayList<Hobby> getHobbyList()
    {
        return hobbyList;
    }

    public void setHobbyList(ArrayList<Hobby> hobbyList)
    {
        this.hobbyList = hobbyList;
    }
    
    
}
