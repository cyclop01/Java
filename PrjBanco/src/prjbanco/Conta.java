
package prjbanco;

public class Conta {
    float Credito;
    int Perc;
    
    void ImprimirComprovantedeCredito(){
        System.out.println("Valor percentual creditado: "+this.Perc+" %");
        System.out.println("Valor creditado: "+this.Credito);    
    }
}
