package display;


import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author canaleske
 */
public class Display {
    public static void print(Iterator itr){
        while(itr.hasNext()){
            System.out.println(itr.next());  
        } 
    }
}
