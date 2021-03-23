/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs1;

/**
 *
 * @author LENOVO
 */
public class ManagingPeople {
    
 public static void main(String[] args) {
        
        
        Person p1 = new Person("Azril Nur Rahman", "123456789", "Active");
        
        System.out.println("Student Name : " + p1.getfName());
        
        System.out.println("Student Id : " + p1.getStuId());
        
        System.out.println("Student Status : " + p1.getStuStatus());
        

        }
    }