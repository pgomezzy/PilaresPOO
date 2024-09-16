public class Autodromo {
    public static void main(String[] args) 
    {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("08932543986");

        Moto cb3 = new Moto();
        cb3.setChassi("45987689479");
        cb3.ligar();
    }
}
