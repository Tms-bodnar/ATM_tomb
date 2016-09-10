/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtomb;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class AtmTomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int penz = 0;

        System.out.print("Mennyi pénz szeretnél felvenni? (A legkisebb kiadható érme az öt forintos) ");
        penz = sc.nextInt();
        int[] penzTomb = new int[11];
        
        int tizezres = penz / 10000;
        penzTomb[0] = tizezres;
        penz = penz - tizezres*10000;
        
        int otezres = penz/5000;
        penzTomb[1] = otezres;
        penz = penz - otezres*5000;
        
        int ketezres = penz / 2000;
        penzTomb[2] = ketezres;
        penz = penz - ketezres*2000; 
        
        int ezres = penz / 1000;
        penzTomb[3] = ezres;
        penz = penz - ezres*1000;
        
        int otszazas = penz / 500;
        penzTomb[4] = otszazas;
        penz = penz - otszazas*500;        
   
        int ketszazas = penz / 200;
        penzTomb[5] = ketszazas;
        penz = penz - ketszazas*200;    
        
        int szazas = penz / 100;
        penzTomb[6] = szazas;
        penz = penz - szazas*100; 
        
        int otvenes = penz / 50;
        penzTomb[7] = otvenes;
        penz = penz - otvenes*50; 
        
        int huszas = penz / 20;
        penzTomb[8] = huszas;
        penz = penz - huszas*20; 
        
        int tizes = penz / 10;
        penzTomb[9] = tizes;
        penz = penz - tizes*10; 
        
        int otos = penz / 5;
        penzTomb[10] = otos;
        penz = penz - otos*5; 
        
        System.out.println("Tízezres: " + penzTomb[0]);
        System.out.println("Öezres: " + penzTomb[1]);
        System.out.println("Kétezres: " + penzTomb[2]);
        System.out.println("Ezres: " + penzTomb[3]);
        System.out.println("Ötszázas: " + penzTomb[4]);
        System.out.println("Kétszázas: " + penzTomb[5]);
        System.out.println("Százas: " + penzTomb[6]);
        System.out.println("Ötvenes: " + penzTomb[7]);
        System.out.println("Huszas: " + penzTomb[8]);
        System.out.println("Tízes: " + penzTomb[9]);
        System.out.println("Ötös: " + penzTomb[10]);

            
    }
    
}
