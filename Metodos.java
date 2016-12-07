import java.util.Scanner;
public class Metodos

{
    public static void main(String[] arg)
    {
        //leemos por scanner dos numeros
        //llamar a un método que nos diga si es número primo o no 
        //mostramos por pantalla lo anterior
      System.out.println("Insete un numero para saber si es primo");  
      Scanner in = new Scanner (System.in);
      int numeroLeido = in.nextInt();  
      boolean numero = esPrimo(numeroLeido);
      System.out.printf("¿es primo? : %b%n" , numero);
    }
    public static boolean esPrimo(int numero)
    {
        boolean primo = true;
        //código
        for (int i = 2; i < numero/2; i++)
        {
            if (numero % i == 0)//divisible
            primo = false;
            //dejamos de comprobar 
        }
        
        return primo;
    }
}