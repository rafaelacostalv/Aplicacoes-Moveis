import java.util.*;

public class Exercicios{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do funcionario: ");
        string nome = input.next();
        System.out.print("Horas trabalhadas: ");
        int horas = input.nextInt();
        System.out.print("Valor pago por hora: ");
        float pagoHoras = input.nextFloat();
        int salario = horas * pagoHoras;
        System.out.print("Salario: " + salario);

    }

}
