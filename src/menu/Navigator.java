/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author canaleske
 */
public class Navigator {
    public int initialMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the ff:\n");
        System.out.println("1.List\n2.Queue\n3.Set\n4.Exit");
        System.out.println("Option: ");
        int choice = scanner.nextInt();
        return choice;
    }
    
    public int functionMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the ff:\n");
        System.out.println("1.Create\n2.Retrive\n3.Update\n4.Delete\n5.Exit");
        System.out.println("Option: ");
        int choice = scanner.nextInt();
        return choice;
    }
    
}
