public class fibonacci {
    public static void main(String[] args) {
    
         int n = 9;

        int fibonacciNumero = fibonacci(n);

  
        System.out.println("El número de Fibonacci en la posición " + n + " es: " + fibonacciNumero);
    }

  
    public static int fibonacci(int n) {
     
        if (n <= 1) {
            return n;
        }

     
        int fib1 = 0; 
        int fib2 = 1; 
        int fibonacci = 0; 

       
        for (int i = 2; i <= n; i++) {
            fibonacci = fib1 + fib2; 
            fib1 = fib2; 
            fib2 = fibonacci; 
        }

        return fibonacci;
    }
}