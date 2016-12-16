public class Coche
{	//Valores 
	private int capacidadDeposito;
	private int consumoPorKm;
	//Getters y setters
	public int getCapacidadDeposito()
	{
		return capacidadDeposito;
	}
	public int getConsumoPorKm()
	{
		return consumoPorKm;
	}
	public void setCapacidadDeposito(int valor)
	{
		capacidadDeposito = valor;
	}
	public void setConsumoPorKm(int valor)
	{
		consumoPorKm= valor;
	}
	public double añadirCombustible(double combustible)
	{
		return capacidadDeposito += 5;
	}
	public void mostrarCantidadDeposito()
	{
		System.out.println(capacidadDeposito);
	}
	public double mostrarCantidadDeKm(double consumoPorKm)
	{
		return capacidadDeposito / consumoPorKm;
	}
}