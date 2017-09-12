package batalhanaval;
import java.util.Scanner;
/**
 *
 * @author Lucas Oliveira de Jesus
 */
public class PrincipalBatalhaNaval {
    /**
        * Os tipos de navios são: porta-aviões (cinco quadrados)1,
        * navios-tanque (quatro quadrados), contratorpedeiros (três quadrados) e submarinos (dois quadrados).
        * Vale notar que os quadrados que compõem um navio devem estar conectados e em fila reta. 
        * Numa das variações deste jogo, as grelhas são de dimensão 10x10, e o número de navios são: 1, 2, 3 e 4 respectivamente
    */
    public static void main(String[] args) {
        /** Source code*/
        Modulo m = new Modulo();              
        Jogador j1 = new Jogador();
        Jogador j2 = new Jogador();
        Scanner sc = new Scanner(System.in);
        /**Variaveis*/
        int opcM;
        String coordenada;
        String hv;
        boolean jogador = true;
        boolean derrota = false;
        int ars = 0;
        /**Menu*/
        m.ImprimirM();        
        opcM = Integer.parseInt(sc.nextLine());
        System.out.println("Jogador 1....Convoque sua marinha");
        /**Imprimindo o tabuleiro e solicitando dados do J1        */
        j1.imprimirTbl();
        while(ars < 10){
            System.out.println("Digite a coordenada:");           
            coordenada = sc.nextLine();               
            coordenada = m.converterCordenada(coordenada);
            System.out.println("Horizontal[h] | Vertical [v]:");
            hv = sc.nextLine();
            //Inserindo no tabuleiro Jogador 1
            if(ars <= 3 ){    
                if(!hv.equals("h")){
                    j1.inserirSubmarino(coordenada, false);
                }else{
                    j1.inserirSubmarino(coordenada, true);
                }                
            }else
            if(ars <= 6 ){    
                if(!hv.equals("h")){
                    j1.inserirContratorpedeiros(coordenada, false);
                }else{
                    j1.inserirContratorpedeiros(coordenada, true);
                }               
            }else
            if(ars <= 8 ){    
                if(!hv.equals("h")){
                    j1.inserirNaviosTanque(coordenada, false);
                }else{
                    j1.inserirNaviosTanque(coordenada, true);
                }        
            }else
            if(ars <= 9 ){    
                if(!hv.equals("h")){
                    j1.inserirPortaAvioes(coordenada, false);
                }else{
                    j1.inserirPortaAvioes(coordenada, true);
                }               
            }
           ars++;            
           j1.imprimirTbl();
        } 
        /**Inserindo no tabuleiro Jogador 2*/
        j2.imprimirTbl();
        ars = 0;
        System.out.println("Jogador 2....Convoque sua marinha");
        while(ars < 10){
            System.out.println("Digite a coordenada:");           
            coordenada = sc.nextLine();           
            coordenada = m.converterCordenada(coordenada);
            System.out.println("Horizontal[h] | Vertical [v]:");
            hv = sc.nextLine();
            /**Inserindo no tabuleiro*/
            if(ars <= 3 ){    
                if(!hv.equals("h")){
                    j2.inserirSubmarino(coordenada, false);
                }else{
                    j2.inserirSubmarino(coordenada, true);
                }                
            }else
            if(ars <= 6 ){    
                if(!hv.equals("h")){
                    j2.inserirContratorpedeiros(coordenada, false);
                }else{
                    j2.inserirContratorpedeiros(coordenada, true);
                }               
            }else
            if(ars <= 8 ){    
                if(!hv.equals("h")){
                    j2.inserirNaviosTanque(coordenada, false);
                }else{
                    j2.inserirNaviosTanque(coordenada, true);
                }        
            }else
            if(ars <= 9 ){    
                if(!hv.equals("h")){
                    j2.inserirPortaAvioes(coordenada, false);
                }else{
                    j2.inserirPortaAvioes(coordenada, true);
                }               
            }
           ars++;            
           j2.imprimirTbl();
        }
        do {            
            if (jogador){
                j1.imprimirTbl();
                System.out.println("Comandante 1 ATACAR!!");
                System.out.println("Digite a coordenada de Ataque");
                coordenada = sc.nextLine();           
                coordenada = m.converterCordenada(coordenada);
                j2.atacar(coordenada);
                jogador = false;
                derrota = j2.verificarDerrota();
            }else{
                j2.imprimirTbl();
                System.out.println("Comandante 2 ATACAR!!");
                System.out.println("Digite a coordenada de Ataque");
                coordenada = sc.nextLine();           
                coordenada = m.converterCordenada(coordenada);
                j1.atacar(coordenada);
                jogador = true; 
                derrota = j1.verificarDerrota();
            }
        } while (derrota==false);
        if(j1.verificarDerrota()==true ){
            System.out.println("Jogador 1 venceu");            
        }else{
            System.out.println("Jogador 2 venceu");
        }
    }    
}
            