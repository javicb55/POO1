public class TestTriangulo
{
    public static void main(String[] arg)
    {
       Triangulo tl = new Triangulo();
       tl.setLado1(10);
       tl.setLado2(100);
       tl.setLado3(19);
       Triangulo t2 = new Triangulo(2,3,4);
       Triangulo t3 = new Triangulo(2,3);
       Triangulo t4 = new Triangulo(2);
       System.out.printf("Triangulo con los lados %d, %d y %d%n", tl.getLado1(),tl.getLado2(),tl.getLado3());
       System.out.printf("Triangulo Escaleno con los lados %d, %d y %d%n", t2.getLado1(),t2.getLado2(),t2.getLado3());
       System.out.printf("Triangulo Isoceles con los lados %d, %d y %d%n", t3.getLado1(),t3.getLado2(),t3.getLado3());
       System.out.printf("Triangulo Equilatero con los lados %d, %d y %d%n", t4.getLado1(),t4.getLado2(),t4.getLado3());
    }
}