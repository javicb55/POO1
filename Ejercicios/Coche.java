public class Coche
{	//Valores 
	private double cantidadDeposito;
	private double consumoPorKm;
	//Getters y setters
	public void aumentarCombustible(double combustible)
	{	
		cantidadDeposito += combustible;
	}
	public double getCantidadDeposito()
	{
		return this.cantidadDeposito;
	}
	public double setCantidadDeposito(int valor)
	{
		return this.cantidadDeposito = valor;
	}
	public double getConsumoPorKm()
	{
		return this.consumoPorKm;
	}
	public void setConsumoPorKm(int valor)
	{
		consumoPorKm = valor;
	}

	public void mostrarCantidadDeposito()
	{
		System.out.println(cantidadDeposito);
	}
	public double conocerAutonomia()
	{
		return cantidadDeposito / consumoPorKm * 100;
	}
}