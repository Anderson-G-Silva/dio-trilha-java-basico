import br.com.dio.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

import static br.com.dio.validator.Validator.validarParametros;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int firstParameter = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        int secondParameter = scanner.nextInt();
        try{
            validarParametros(firstParameter, secondParameter);
        }catch (ParametrosInvalidosException ex){
            System.out.println(ex.getMessage());
            return;
        }
        int varParameter = secondParameter - firstParameter;
        for (int cont=0; cont<varParameter;cont++){
            System.out.println("imprimindo o número "+ (cont+1));
        }
        System.out.println("==========FIM==========");
    }
}
