public class mcd {
    public static void main(String[] args) {
     
        final int a = 20;
        final int b = 47;

   
        int mcd = calcularMCD(a, b);

    
        System.out.println("El máximo divisor común de " + a + " y " + b + " es: " + mcd);
    }
 
 
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp; 
        }
        return a; 

    }
}