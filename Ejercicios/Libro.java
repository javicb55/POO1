public class Libro
{
    //Atributos
    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    //constructor
    public Libro (String titulo, String autor, String editorial, String isbn)
    {   
        //Atributo     Argumento
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public String getIsbn()
    {
        return isbn;
    }
}

/*metodo que compruebe que un ISBN es correcto
public static boolean comprobarISBN(String isbn)
{//codigo}
*/