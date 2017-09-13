/*
* Modulo de Funcionalidades do jogo
 */
package batalhanaval;

import java.util.Scanner;

/**
 *
 * @author Lucas Oliveira de Jesus
 */
public class Modulo {
    
    void ImprimirM(){
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-------------|NOVO JOGO|-------------");
        System.out.println("-------------|press key|-------------");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");        
    }
    String converterCordenada(String x) {
    /*Converte a coordenadax em uma coordenada válida a ser trabalhada no vetor ds 2Dimen. */
    /* A, B, C.... 1,2,3*/        
        x = x.toUpperCase();
        String cooR = x;             
        
        if(x.startsWith("A")|| x.endsWith("A")){
            cooR = x.replace("A", "0");
        }        
        if(x.startsWith("B")|| x.endsWith("B")){
            cooR = x.replace("B", "1");
        }        
        if(x.startsWith("C")|| x.endsWith("C")){
            cooR = x.replace("C", "2");
        }        
        if(x.startsWith("D")|| x.endsWith("D")){
            cooR = x.replace("D", "3");
        }        
        if(x.startsWith("E")|| x.endsWith("E")){
            cooR = x.replace("E", "4");
        }        
        if(x.startsWith("F")|| x.endsWith("F")){
            cooR = x.replace("F", "5");          
        }       
        if(x.startsWith("G")|| x.endsWith("G")){
            cooR = x.replace("G", "6");          
        }       
        if(x.startsWith("H")|| x.endsWith("H")){
            cooR = x.replace("H", "7");          
        }       
        if(x.startsWith("I")|| x.endsWith("I")){
            cooR = x.replace("I", "8");          
        }       
        if(x.startsWith("J")|| x.endsWith("J")){
            cooR = x.replace("J", "9");          
        }       
        return cooR;       
    }
    void limpatela() {	 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        sc.nextLine();
    }
}
