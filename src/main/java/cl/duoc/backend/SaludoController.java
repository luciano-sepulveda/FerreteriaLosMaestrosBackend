package cl.duoc.backend;

import java.util.Map;
import org.springframework.web.bind.annotation.*;

// Convierte los valores devueltos por los métodos a respuestas JSON.
@RestController
@RequestMapping("/api")
public class SaludoController {

    // El parámetro nombre es opcional: su valor predeterminado es estudiante.
    @GetMapping("/saludo")
    public Map<String, String> saludar(
            @RequestParam(name = "nombre", defaultValue = "estudiante") String nombre) {
        return Map.of("mensaje", "Hola, " + nombre);
    }

    // Recibe un objeto JSON y lo devuelve sin guardarlo en una base de datos.
    @PostMapping("/eco")
    public Map<String, String> eco(@RequestBody Map<String, String> cuerpo) {
        return cuerpo;
    }
}