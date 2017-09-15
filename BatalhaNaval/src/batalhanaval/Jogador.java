/**Classe com todas as operações possiveis para os jogadores*/
package batalhanaval;

import java.util.Scanner;

/**
 *
 * @author Usuário Comum
 */
public class Jogador {   
    
    int tbl[][] = new int[10][10];
    Modulo m = new Modulo();
    
    void imprimirTbl(){
        System.out.println("BTLN A B C D E F G H I J ");
        for (int i = 0; i < 10; i++) {
            System.out.print("["+(i)+"] ");
            for (int j = 0; j < 10; j++) {                                
                System.out.print(" "+tbl[i][j]);                               
            }            
            System.out.println();
        }
    }
    /**Inserindo os Objetos.*/
    void inserirSubmarino(String cooR, boolean H){
        int x,y;
        try{        
            x = Integer.parseInt(cooR.substring(0, 1));
            y = Integer.parseInt(cooR.substring(1, 2));        
            if (H == false){
                tbl[x][y] = 2;
                tbl[x+1][y] = 2;
            }else{
                tbl[x][y] = 2;
                tbl[x][y+1] = 2;
            }            
        }catch(Exception e){
            m.validaCoor(this, 1);
        }           
    }
    void inserirContratorpedeiros(String cooR, boolean H){
        int x,y;        
        try {
            x = Integer.parseInt(cooR.substring(0, 1));
            y = Integer.parseInt(cooR.substring(1, 2));
        
            if (H == false){            
                tbl[x][y] = 3;
                tbl[x+1][y] = 3;
                tbl[x+2][y] = 3;
            }else{            
                tbl[x][y] = 3;
                tbl[x][y+1] = 3;
                tbl[x][y+2] = 3;
            }
        } catch (Exception e) {
            m.validaCoor(this, 2);
        }       
    }
    void inserirNaviosTanque(String cooR, boolean H){
        int x,y;
          try {  
            x = Integer.parseInt(cooR.substring(0, 1));
            y = Integer.parseInt(cooR.substring(1, 2));                      
            if(H == false){
                tbl[x][y] = 4;
                tbl[x+1][y] = 4;
                tbl[x+2][y] = 4;
                tbl[x+3][y] = 4;
            }else{
                tbl[x][y] = 4;
                tbl[x][y+1] = 4;
                tbl[x+2][y+1] = 4;
                tbl[x+3][y+1] = 4;
            }
        } catch (Exception e) {
            m.validaCoor(this, 3);
        }
    }
    void inserirPortaAvioes(String cooR, boolean H){
        int x,y;
        try {    
            x = Integer.parseInt(cooR.substring(0, 1));
            y = Integer.parseInt(cooR.substring(1, 2));
        
            if(H==false){
                tbl[x][y] = 5;
                tbl[x+1][y] = 5;
                tbl[x+2][y] = 5;
                tbl[x+3][y] = 5;
                tbl[x+4][y] = 5;
            }else{
                tbl[x][y] = 5;
                tbl[x][y+1] = 5;
                tbl[x][y+2] = 5;
                tbl[x][y+3] = 5;
                tbl[x][y+4] = 5;
            }
        } catch (Exception e) {
           m.validaCoor(this, 4);
        }           
    } 
    
    /**Comando de Ataque*/
    void atacar(String cooR){
        int x,y;
        x = Integer.parseInt(cooR.substring(0, 1));
        y = Integer.parseInt(cooR.substring(1, 2));
        if(tbl[x][y]!=0){
            System.out.println("Parabéns, acertou");            
        }else{
            System.out.println("O alvo escapou!!!!");            
        }
        tbl[x][y]=0;
    }
    /**Verificar Derrota*/
    boolean verificarDerrota(){
        boolean x = true;             
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(tbl[i][j]!= 0){
                        x = false;
                        break;    
                    }                
                }            
            }
        return x;
    }
}
