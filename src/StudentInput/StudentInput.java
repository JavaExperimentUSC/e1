/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInput;

import java.util.Scanner;

/**
 *
 * @author canaleske
 */
public class StudentInput {
    public String ask(String label){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter " + label + " :");
        return scanner.next();
    }
}
