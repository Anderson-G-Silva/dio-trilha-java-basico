package br.com.dio.validator;

import br.com.dio.exceptions.ParametrosInvalidosException;

public class Validator {
     public static void validarParametros(int firstParameter, int secondParameter) throws ParametrosInvalidosException {
        if (firstParameter > secondParameter)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        if (firstParameter == secondParameter)
            throw new ParametrosInvalidosException("Os parâmetros devem ter valores diferentes");
        if (firstParameter < 0 || secondParameter < 0)
            throw new ParametrosInvalidosException("Informar um número positivo");

    }
}
