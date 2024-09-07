public class ultimo_dato {
    public static void main(String[] args) {

        final int n = 3;

      
        int ultimodigito = getLastDigitOfFibonacci(n);

       
        System.out.println("El último dato del número de Fibonacci en la posición " + n + " es: " + ultimodigito);
    }

   
    public static int getLastDigitOfFibonacci(int n) {

        if (n <= 1) {
            return n;
        }

     
        int fib1 = 0;
        int fib2 = 1;
        int ultimodigito = 0;
     
        for (int i = 2; i <= n; i++) {
            ultimodigito = (fib1 + fib2) % 10;
            fib1 = fib2; 
            fib2 = ultimodigito;
        }

        return ultimodigito;
    }
}