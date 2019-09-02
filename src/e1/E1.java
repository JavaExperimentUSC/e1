/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1;

import StudentInput.StudentInput;
import display.Display;
import interfaces.ListInterface;
import menu.Navigator;
import model.Student;

/**
 *
 * @author canaleske
 */
public class E1 {
    static int iChoice;
    static ListInterface list = new ListInterface();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Navigator navigator = new Navigator();
        iChoice = navigator.initialMenu();
        
        while(iChoice != 4){
            // get the second option
            int jOpt = navigator.functionMenu();
            while(jOpt != 5){
                // perform here
                if(jOpt == 1){
                    addItem();
                }
                if(jOpt == 2){
                    Display.print(list.list.iterator());
                }
               jOpt = navigator.functionMenu();
            }
            iChoice = navigator.initialMenu();
        }
    }
    
    public static void addItem(){
        if(iChoice == 1){
            // array list
            StudentInput sI = new StudentInput();
            Student student = new Student();
            student.setCode(sI.ask("Student Code"));
            student.setFirstName(sI.ask("First Name"));
            student.setLastName(sI.ask("Last Name"));
            list.add(student);
        }
    }
    
}
