package com.campusdual.classroom;



public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("No se puede dividir por cero.");
        }else{
        return dividend / divisor;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Resultado: " + divisionWithCustomException(3, 0));
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Programa acabado.");
        }

    }
}


