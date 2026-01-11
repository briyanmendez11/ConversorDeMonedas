public class ConversionDeMonedas {

    public String convertir (float valor, ConversionRate conversionRate){
        float convertido = valor * conversionRate.conversion_rate();
        return "El valor: "+ valor + " ["+ conversionRate.base_code()+"] "+ "corresponde al valor final: "+ convertido + " ["+ conversionRate.target_code()+ "]";
    }

}
