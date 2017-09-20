
package prjbanco;

public class PrjBancoTest {

    public static void main(String[] args) {
        Cliente cli[] = new Cliente[5];
        Cliente c;      
        
        for (int i = 0; i < cli.length ; i++) {
            c = new Cliente();
            c.calcSaldo(i);
            c.calcCredito();
            cli[i] = c;
            //c=null;
        }
        int i=1;
        for (Cliente cliente : cli) { 
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Cliente n°"+ i);
            cliente.ImprimirSaldo();            
            cliente.c.ImprimirComprovantedeCredito();            
            i++;
        }
    }
    
}
