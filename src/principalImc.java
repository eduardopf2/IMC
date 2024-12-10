import java.util.Scanner;

public class principalImc {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        double peso = 0.0, altura = 0.0, imc = 0.0;
        String resultado = " ", nome = " ";

        System.out.println("---------------------------------");
        System.out.println("Digite o seu nome:               ");
        nome = sc.nextLine();
        System.out.println("Digite o seu peso:               ");
        peso = sc.nextDouble();
        System.out.println("Digite a sua altura:             ");
       altura =  sc.nextDouble();

       imc = Imc.calcularImc(peso,altura);
       resultado = Imc.classificarImc(imc);

        System.out.printf(" Você %s  tem um IMC = %.2f \n",nome,imc);
        System.out.printf(" A Classificação do IMC é : %s \n",resultado);



        sc.close();
    }

    }

