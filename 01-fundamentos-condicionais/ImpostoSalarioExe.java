import java.util.Scanner;

public class ImpostoSalarioExe {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o seu salario mensal:");
        double salarioBruto = scan.nextDouble();
        double porcentualImposto = 0;
        if (salarioBruto <= 2000) {
            porcentualImposto = salarioBruto * 0;
        } else if (salarioBruto <= 5000) {
            porcentualImposto = salarioBruto * 0.10;
        } else {
            porcentualImposto = salarioBruto * 0.20;
        }
        double salarioLiquido = salarioBruto - porcentualImposto;
        System.out.println("Salario Bruto: "+salarioBruto);
        System.out.println("Imposto: "+porcentualImposto);
        System.out.println("Salario Liquido: "+salarioLiquido);
    }
}
