public class Main {
    public static void main(String[]args){
        Condutor condutor1 = new Condutor("Maria", 762369);
        Condutor condutor2 = new Condutor("Laura", 987654);
        Motor motor1 = new Motor("gasolina", 150);
        Motor motor2 = new Motor("diesel", 200);
        Carro carro1 = new Carro("fiat", "uno", "988686", motor1, condutor1);
        Carro carro2 = new Carro("porsche", "carreira", "101394", motor2);
        

        carro2.setCondutor(condutor2);

        carro1.setCondutor(condutor2);
        
        carro2.setMotor(motor1);

        carro1.setMotor(motor2);
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());

    }
}
