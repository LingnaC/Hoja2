/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Isabella Obando 23074*/
public class CalculadoraPostfix {
    private Pila<Integer> pila;

    public CalculadoraPostfix() {
        this.pila = new PilaVector<>();
    }

    public int evaluarExpresion(String expresion) {
        for (String token : expresion.split(" ")) {
            if (token.matches("\\d")) { // Es un dígito
                pila.push(Integer.parseInt(token));
            } else {
                int operandoB = pila.pop();
                int operandoA = pila.pop();
                switch (token) {
                    case "+":
                        pila.push(operandoA + operandoB);
                        break;
                    case "-":
                        pila.push(operandoA - operandoB);
                        break;
                    case "*":
                        pila.push(operandoA * operandoB);
                        break;
                    case "/":
                        pila.push(operandoA / operandoB);
                        break;
                    default:
                        throw new IllegalArgumentException("Operador no válido: " + token);
                }
            }
        }
        return pila.pop();
    }
}

