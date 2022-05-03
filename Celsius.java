public class Celsius {

    public static void main(String[] args) {
        
        ConversãoTemperatura t = new ConversãoTemperatura();

        float temperaturaF = t.conversaoparaFarenheit(25);
        System.out.println("A temperatura em Fahrenheit e " + temperaturaF);

        float temperaturaK = t.conversaoparaKelvin(25);
        System.out.println("A temperatura em Kelvin é " + temperaturaK);




        

        
    }



 
    
}
