public class TestLibro
{
    public static void main (String [] arg)
    {
//     Libro libro1 = new Libro(); AHORA NO FUNCIONA, ya hay un constructor
    Libro libro1 = new Libro ("El Quijote", "miguel de Cervantes", "Adeslas", "8689498465");
    System.out.printf("El titulo del libro es %s - %s",libro1.getTitulo(), libro1.getIsbn());
    }
}