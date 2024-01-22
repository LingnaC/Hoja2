import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            LectorArchivo lector = new LectorArchivo();
            List<String> expresiones = lector.leerExpresiones("datos.txt");

            CalculadoraPostfix calculadora = new CalculadoraPostfix();

            for (String expresion : expresiones) {
                System.out.println("Expresión: " + expresion);
                System.out.println("Resultado: " + calculadora.evaluarExpresion(expresion));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

