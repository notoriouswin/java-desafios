import java.util.Scanner;
public class ControleDeEntradaExe {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();
        boolean maiorDeIdade = idade >= 18;
        boolean menorDeIdade = idade < 18;
        System.out.println("Você tem ingresso, digite true ou false");
        boolean temIngresso = scan.nextBoolean();
        System.out.println("Você foi convidado, digite true ou false");
        boolean foiConvidada = scan.nextBoolean();
        boolean papeladaEntrada = (temIngresso == true) || (foiConvidada == true);
        if ((maiorDeIdade == true) && (papeladaEntrada == true)){
            System.out.println("Entrada liberada");
        } else if ((maiorDeIdade == true) && (papeladaEntrada == false)){
            System.out.println("Você é de maior, mas você não tem ingresso e também não foi convidado");
        } else if ((menorDeIdade == true) && ((papeladaEntrada == false) || (papeladaEntrada == true))) {
            System.out.println("Você não pode entrar , mesmo com convite ou ingresso por você ser menor de idade");
        }
    }
}
