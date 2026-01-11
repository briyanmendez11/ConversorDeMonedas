import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String[] paresMonedas = {
                "USD/ARS",
                "ARS/USD",
                "USD/BRL",
                "BRL/USD",
                "USD/COP",
                "COP/USD"
        };
        var i = 0;
        ConsultaApiConversiones consultaApiConversiones = new ConsultaApiConversiones();

        while (true){
            System.out.print("""
            ************************************************************
            Sea bienvenido/a al Conversor de Moneda =)
            
            1) Dólar ==> Peso argentino
            2) Peso argentino ==> Dólar
            3) Dólar ==> Real brasileño
            4) Real brasileño ==> Dólar
            5) Dólar ==> Peso colombiano
            6) Peso colombiano ==> Dólar
            7) Salir
            
            Elija una opción válida:
            ************************************************************
            """)
            ;


            try {
                i = Integer.parseInt(lectura.nextLine().replaceAll("\\s+", ""));
            } catch (NumberFormatException e) {
                System.out.println("Opción incorrecta: debe ingresar un número.");
                continue;
            }

            if (i < 1 || i > 7) {
                System.out.println("Opción incorrecta: seleccione un número entre 1 y 7.");
            } else if (i == 7) {
                break;
            } else {
                System.out.print("Ingrese el valor a convertir: ");

                float valor;
                try {
                    valor = Float.parseFloat(lectura.nextLine().replace(",", ".").replaceAll("\\s+", ""));
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido, debe ser numérico.");
                    continue;
                }

                ConversionRate conversionRate =
                        consultaApiConversiones.convertirMoneda(paresMonedas[i - 1]);

                ConversionDeMonedas conversionDeMonedas = new ConversionDeMonedas();
                String salidaDeConversion =
                        conversionDeMonedas.convertir(valor, conversionRate);

                System.out.println(salidaDeConversion);
            }


        }


    }
}
