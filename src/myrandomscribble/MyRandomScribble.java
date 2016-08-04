/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrandomscribble;

import java.util.Random;

/**
 *
 * @author Justin
 */
public class MyRandomScribble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random(10);
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
    }
    
}
