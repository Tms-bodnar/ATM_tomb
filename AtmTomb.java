/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtomb;

import java.util.Scanner;

/**
 * @author bodnart
 */
public class AtmTomb {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Mennyi pénz szeretnél felvenni? (A legkisebb kiadható érme az öt forintos) ");
        int penz = sc.nextInt();
        int[] cimletTomb = {10000,5000,2000,1000,500,200,100,50,20,10,5};
        for(int szam : cimletTomb){
            if(penz/szam > 0){
                System.out.println(szam + " címletből " + (penz/szam) +"darabok kapsz.");
                penz = penz%szam;
            }
        }
    }
    
}
