
package prjpesquisa;
/**
 *
 * @author Lucas Oliveira
 */
public class PrjPesquisaTest {

    public static void main(String[] args) {
        // Source Code
        Pessoa pessoas[] = new Pessoa[3];
        Pessoa p =  new Pessoa();
        System.out.println("PESQUISA");
        for (int i = 0; i < pessoas.length; i++) {
            p = new Pessoa();
             if(i == pessoas.length){
                pessoas[i].setIdade((short)-1);
                break;
            }
            p.Cadastrar();            
            pessoas[i] = p;
                       
            p = null;
        }
        System.out.println("Maior Idade :"+pessoas[0].CalcularMaiorIdade(pessoas));
        System.out.println(pessoas[0].CalcularPorcentagemdeGatas(pessoas)+"% sao lindas mulheres *-*");
        
    }
    
}
