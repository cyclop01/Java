
package prjbanco;

public class Cliente {   
    Conta c;    
    float saldoM; 
    
    void calcSaldo(int i){
        this.saldoM = 1000 /( i + 1); 
    }
    void calcCredito(){
         if(this.saldoM >= 0 && this.saldoM<=200){
                c  = new Conta();   
                this.c.Credito = 0;
                this.c.Perc = 0;
            }         
            if(this.saldoM >= 201 && this.saldoM<=400){
                c = new Conta();
                this.c.Credito =(this.saldoM / 100)*20 ;
                this.c.Perc =20 ;
            }         
            if(this.saldoM >= 401 && this.saldoM<=600){
                c = new Conta();
                this.c.Credito =(this.saldoM / 100)*30 ;
                this.c.Perc =30 ;
            }         
            if(this.saldoM >= 601 ){
                c = new Conta();
                this.c.Credito =(this.saldoM / 100)*40 ;
                this.c.Perc =40 ;
            }
    }
    void ImprimirSaldo(){
        System.out.println("Saldo medio da conta: "+this.saldoM);
    }
}
