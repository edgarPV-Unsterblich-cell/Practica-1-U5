//By: Edgar PV

package Interpolación;

public class InterpolacionLagrange {

    // Método privado para validar que los arreglos de datos sean correctos
    private static void validarDatos(double[] x, double[] y) {
        // Verifica que los arreglos no sean nulos ni estén vacíos
        if (x == null || y == null || x.length == 0 || y.length == 0) {
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos ni estar vacios.");
        }
        // Verifica que ambos arreglos tengan la misma cantidad de elementos
        if (x.length != y.length) {
            throw new IllegalArgumentException("Los arreglos x y y deben tener el mismo tamano.");
        }
        // Verifica que no existan nodos en 'x' repetidos (lo cual causaría división entre cero)
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    throw new IllegalArgumentException("Nodos de x repetidos: " + x[i]);
                }
            }
        }
    }

    // Método principal que calcula la interpolación de Lagrange para un valor 'xEval'
    public static double interpolacionLagrange(double[] x, double[] y, double xEval) {

        // Ejecuta la validación inicial de los datos
        validarDatos(x, y);

        double resultado = 0.0; // Variable acumuladora para el valor final interpolado
        int n = x.length;       // Número total de puntos (nodos)

        // Bucle externo: recorre cada punto base para sumar los términos del polinomio P(x)
        for (int i = 0; i < n; i++) {
            double termino = y[i]; // Inicia con el valor de y[i]

            // Bucle interno: calcula la productoria del polinomio base L_i(x)
            for (int j = 0; j < n; j++) {
                if (i != j) { // Se evalúa únicamente cuando j es diferente de i

                    // CORRECCIÓN Y COMPLETADO:
                    // Se reemplazó "termino += 0.0;" por la fórmula multiplicativa de la productoria de Lagrange
                    termino *= (xEval - x[j]) / (x[i] - x[j]);
                }
            }

            // Se acumula el término calculado al resultado total
            resultado += termino;
        }

        // Retorna el valor final aproximado de la interpolación
        return resultado;
    }
}