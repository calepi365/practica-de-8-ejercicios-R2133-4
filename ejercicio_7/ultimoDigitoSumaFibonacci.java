public class ultimoDigitoSumaFibonacci {
    public static void main(String[] args) {
      
        final int m = 10;
        final int n = 10;

       
        int ultimoDigito = ultimoDigitoSumafibonacci(m, n);

       
        System.out.println("El último dígito de la suma de los números de Fibonacci desde " + m + " hasta " + n + " es: " + ultimoDigito);
    }

   
    public static int ultimoDigitoSumafibonacci(int m, int n) {
      
        int fibNPlus2 = fibonacci(n + 2);
        int fibMPlus1 = fibonacci(m + 1);

      
        int sumaUltimoDigito = (fibNPlus2 - fibMPlus1 + 10) % 10;

        return sumaUltimoDigito;
    }

   
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fib1 = 0;
        int fib2 = 1; 
        int fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = (fib1 + fib2) % 10; 
            fib1 = fib2;
            fib2 = fibonacci;
        }

        return fibonacci;
    }
}