A/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs1;

/**
 *
 * @author LENOVO
 */
public class Person {
private String fName, stuId, stuStatus;
        
    public Person(String fName, String stuId, String stuStatus) {
        this.fName = fName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public String getfName() {
        return fName;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuStatus() {
        return stuStatus;
    }
    
    
}
