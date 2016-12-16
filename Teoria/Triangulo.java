public class Triangulo
{
    //atributos 
    private int lado1;
    private int lado2;
    private int lado3;
    //constructor o constructores
    public Triangulo()
    {

    }
    public Triangulo (int lado1, int lado2, int lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
    }

    public Triangulo(int lado1, int lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado2;
        System.out.println("Creando un triangulo Isóceles");
    }

     public Triangulo(int lado1)
    {
        this.lado1 = lado1;
        this.lado2 = lado1;
        this.lado3 = lado1;
        System.out.println("Creando un triangulo equilatero");
    }




    //getters y setters 
    public int getLado1()
    {
        return lado1;
    }
    public int getLado2()
    {
        return lado2;
    }
    public int getLado3()
    {
        return lado3;
    }
    public void setLado1(int lado1)
    {
        this.lado1 = lado1;
    }
     public void setLado2(int lado2)
    {
        this.lado2= lado2;
    }
     public void setLado3(int lado3)
    {
        this.lado3 = lado3;
    }
}