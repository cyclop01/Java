
package prjpesquisa;

import java.util.Scanner;

public class Pessoa {   
    boolean sexo;
    private  cordosOlhos cO;
    private  cordosCabelos cC;
    private short idade;
    
    public enum cordosOlhos{
        azuis,
        verdes,
        castanhos
    }    
    public enum cordosCabelos{
        louros,
        castanhos,
        pretos
    }
    public boolean getSexo() {
        return sexo;
    }
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public cordosOlhos getcO() {
        return cO;
    }
    public void setcO(cordosOlhos cO) {
        this.cO = cO;
    }
    public cordosCabelos getcC() {
        return cC;
    }
    public void setcC(cordosCabelos cC) {
        this.cC = cC;
    }    
    public short getIdade() {
        return idade;
    }
    public void setIdade(short idade) {
        this.idade = idade;
    }    
    void Cadastrar(){
        Scanner scan = new Scanner(System.in);
        String cc, co;
        int idd;
        System.out.println("Mulher? s/n");
        setSexo(scan.nextLine().toUpperCase().equals("S"));
        System.out.println("Cor dos cabelos");
        imprimeCabelos();
        cc=scan.nextLine();
        switch (cc) {
            case "a":
                setcC(cordosCabelos.castanhos);
                break;
            case "b":
                setcC(cordosCabelos.louros);
                break;
            case "c":
                setcC(cordosCabelos.pretos);
                break;
            default:
                break;
        }    
        System.out.println("Cor dos olhos");
        imprimeOlhos();
        co=scan.nextLine();
        switch (co) {
            case "a":
                setcO(cordosOlhos.azuis);
                break;
            case "b":
                setcO(cordosOlhos.castanhos);
                break;
            case "c":
                setcO(cordosOlhos.verdes);
                break;        
            default:
                break;
        }
        System.out.println("Idade");        
        idd=Short.parseShort(scan.nextLine());
        setIdade((short) idd);
    }   
      void imprimeCabelos(){
        System.out.println("a - "+cordosCabelos.castanhos);
        System.out.println("b - "+cordosCabelos.louros);
        System.out.println("c - "+cordosCabelos.pretos);
    }   
    void imprimeOlhos(){
        System.out.println("a - "+cordosOlhos.azuis);
        System.out.println("b - "+cordosOlhos.castanhos);
        System.out.println("c - "+cordosOlhos.verdes);
    }    
    int CalcularMaiorIdade(Pessoa vPessoa[]){
    //Calcular a > idade
    short maiorIdade = 0 ;
        for (int i = 0; i < vPessoa.length; i++) {
            if (vPessoa[i].idade > maiorIdade){
                maiorIdade = vPessoa[i].idade;
            }
        }      
    return maiorIdade;
    }
    
    int CalcularPorcentagemdeGatas(Pessoa vPessoa[]){
    //Calcular a % de mulheres com 35>idade>18 
    // Com olhos verdes e cabelos loiros
    float porcentegem ;
    int gatas = 0;
       for  (Pessoa pessoa : vPessoa) {
            if (pessoa.idade > 18 && pessoa.idade < 35 ){
                if (pessoa.getcC()==cordosCabelos.louros && pessoa.getcO()==cordosOlhos.verdes && pessoa.sexo==true) {
                    gatas = gatas + 1;
                }
            }
        }
       porcentegem = (100/(vPessoa.length))*gatas;
    return porcentegem;
    }
    
}
