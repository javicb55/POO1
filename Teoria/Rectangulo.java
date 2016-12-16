public class Rectangulo
{
	//atributos
	private int lado1 = 2;
	private int lado2 = 1;
	//getters son publicos
	public int getLado1()
	{
		return this.lado1;
	}
	public int getLado2()
	{
		return this.lado2;
	}
	//setters
	public void setLado1(int lado1) 
	{
		this.lado1 = lado1;
	}
	public void setLado2(int lado2)
	{
		this.lado2 = lado2;
	}
	//método que devuelve el valor del area
	public int getArea()
	{
		return  this.lado1*this.lado2;
	}
	

}

