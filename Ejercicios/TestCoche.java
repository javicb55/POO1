public class TestCoche
{
    public static void main(String[] arg)
    {
        Coche c1 = new Coche();
        c1.setCapacidadDeposito(1000);
        c1.setCantidadActualDeposito(5);
        c1.setConsumoPorKm(7);
        System.out.printf("Atributos del coche1: capacidad del deposito %.2f%n,cantidad actual del deposito %.2f%n y su consumo %.2f%n ", c1.getCapacidadDeposito(), c1.getCantidadActualDeposito(), c1.getConsumoPorKm());
        double aumentoDelDeposito = Coche.aumentarCombustible(5);
        System.out.printf("Aumentamos en 5 el combustible, cantidadActualDeposito: %f ", aumentoDelDeposito);
    }
}