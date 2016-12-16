public class Coche
{	//Valores 
	private double capacidadDeposito;
	private double cantidadActualDeposito;
	private double consumoPorKm;
	//Getters y setters
	public double getCantidadActualDeposito()
	{
		return this.cantidadActualDeposito;
	}
	public double setCantidadActualDeposito(int valor)
	{
		return this.cantidadActualDeposito = valor;
	}
	public double getCapacidadDeposito()
	{
		return this.capacidadDeposito;
	}
	public double getConsumoPorKm()
	{
		return this.consumoPorKm;
	}
	public void setCapacidadDeposito(int valor)
	{
		capacidadDeposito = valor;
	}
	public void setConsumoPorKm(int valor)
	{
		consumoPorKm = valor;
	}
	public static double aumentarCombustible(double combustible)
	{	
		return cantidadActualDeposito += combustible;
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