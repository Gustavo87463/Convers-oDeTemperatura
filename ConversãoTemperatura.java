public class ConversãoTemperatura {


    float conversaoparaKelvin(float tempcelcius){
        float k = tempcelcius + 273;

        return k;
        
    }

    float conversaoparaFarenheit(float tempcelcius){
        
        float f = 1.8f*tempcelcius + 32;

        return f;
    }
    
}
