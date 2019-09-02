/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import model.Student;

/**
 *
 * @author canaleske
 */
public class ListInterface {
    public java.util.ArrayList<Student> list=new java.util.ArrayList<Student>();//Creating arraylist  
    public void add(Student student){
      list.add(student);
    }
}
