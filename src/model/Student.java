/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author canaleske
 */
public class Student {
    String code;
    String firstName;
    String lastName;
    
//    public Student(String code, String firstName, String lastName) {
//        this.code = code;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    } 

    public String getCode() {
        return code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
