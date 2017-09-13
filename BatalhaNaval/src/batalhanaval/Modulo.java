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
    String converterCordenada(String x, Jogador w, int Tipo) {
    /*Converte a coordenadax em uma coordenada válida a ser trabalhada no vetor ds 2Dimen. */
    /* A, B, C.... 1,2,3*/        
        x = x.toUpperCase();
        String cooR = x;
        boolean pass = false;
        
        if(x.startsWith("A")|| x.endsWith("A")){
            cooR = x.replace("A", "0");
            pass = true;
        }        
        if(x.startsWith("B")|| x.endsWith("B")){
            cooR = x.replace("B", "1");
            pass = true;
        }        
        if(x.startsWith("C")|| x.endsWith("C")){
            cooR = x.replace("C", "2");
            pass = true;
        }        
        if(x.startsWith("D")|| x.endsWith("D")){
            cooR = x.replace("D", "3");
            pass = true;
        }        
        if(x.startsWith("E")|| x.endsWith("E")){
            cooR = x.replace("E", "4");
            pass = true;
        }        
        if(x.startsWith("F")|| x.endsWith("F")){
            cooR = x.replace("F", "5");          
            pass = true;
        }       
        if(x.startsWith("G")|| x.endsWith("G")){
            cooR = x.replace("G", "6");          
            pass = true;
        }       
        if(x.startsWith("H")|| x.endsWith("H")){
            cooR = x.replace("H", "7");          
            pass = true;
        }       
        if(x.startsWith("I")|| x.endsWith("I")){
            cooR = x.replace("I", "8");          
            pass = true;
        }       
        if(x.startsWith("J")|| x.endsWith("J")){
            cooR = x.replace("J", "9");          
            pass = true;
        }
        if(!pass){
            validaCoor(w, Tipo);
        }
        return cooR;       
    }
    void limpaTela() {	 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        sc.nextLine();
    }
    
    void validaCoor(Jogador x, int t){
        boolean retorno;
        String coordenada;
        String hv;
        int tipo;
        Modulo m = new Modulo();              
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma coordenada válida");                       
        coordenada = sc.nextLine();           
        coordenada = m.converterCordenada(coordenada, x, t);
        System.out.println("Horizontal[h] | Vertical [v]:");
        hv = sc.nextLine();
        if(!hv.equals("h")){
            switch(t){
                case 1:
                    x.inserirSubmarino(coordenada, false);
                case 2:
                    x.inserirContratorpedeiros(coordenada, false);
                case 3:
                    x.inserirNaviosTanque(coordenada, false);
                case 4:
                    x.inserirPortaAvioes(coordenada, false);
                default:
                    break;
            }                
        }else{
            switch(t){
                case 1:
                    x.inserirSubmarino(coordenada, true);
                case 2:
                    x.inserirContratorpedeiros(coordenada, true);
                case 3:
                    x.inserirNaviosTanque(coordenada, true);
                case 4:
                    x.inserirPortaAvioes(coordenada, true);
                default:
                    break;               
            }                
        }        
    }
}
