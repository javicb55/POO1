public class TestRectangulo
{
	public static void main (String[] arg)
	{
		//Creamos objetos de tipo Triangulo
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
	//	System.out.println(r1.lado1); NO tiene accesibilidad
	//	System.out.println(r2.lado2); lado1 y lado2 son atributos private
	//cambiamos los valores por defecto del rectangulo r2
		r2.setLado1(100); //actualizo los valores del atribulo lado1
		r2.setLado2(1000);//actualizo los valores del atributo lado2
		System.out.printf("Atributos del Rectángulo1, lado1: %d, lado2:%d%n y de área %d%n", r2.getLado1(), r2.getLado2(), r2.getArea());
		System.out.printf("Atributos del Rectángulo1, lado1: %d, lado2:%d%n  de área %d%n ", r1.getLado1(), r1.getLado2(), r1.getArea());
	}
}
