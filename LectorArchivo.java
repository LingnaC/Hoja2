import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectorArchivo {
    public List<String> leerExpresiones(String rutaArchivo) throws FileNotFoundException {
        List<String> expresiones = new ArrayList<>();
        Scanner scanner = new Scanner(new File(rutaArchivo));
        while (scanner.hasNextLine()) {
            expresiones.add(scanner.nextLine());
        }
        scanner.close();
        return expresiones;
    }
}

