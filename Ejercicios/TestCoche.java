public class TestCoche
{
    public static void main(String[] arg)
    {
        Coche c1 = new Coche();
        Coche c2 = new Coche();
       
        c1.setCantidadDeposito(5);
        c1.setConsumoPorKm(7);
        c2.setCantidadDeposito(5);
        c2.setConsumoPorKm(7);
        System.out.printf("Atributos del coche1: cantidad deposito %.2f%n y su consumo %.2f%n y su autonomia es %.2f%n Atributo Segundo Coche: %.2f%n %.2f%n %.2f%n ",c1.getCantidadDeposito(), c1.getConsumoPorKm(), c1.conocerAutonomia(), c2.getCantidadDeposito(), c2.getConsumoPorKm(), c2.conocerAutonomia());
        c1.aumentarCombustible(5);
        c2.aumentarCombustible(10);
        System.out.printf("cantidadActualDeposito, primer coche =  %.2f%n, segundo coche = %.2f",c1.getCantidadDeposito(), c2.getCantidadDeposito());
    }
}