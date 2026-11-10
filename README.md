# Práctica de Programación: Interpolación de Lagrange vs. Diferencias Divididas de Newton

**Asignatura:** Estructura de Datos y Métodos Numéricos  
**Lenguaje:** Java (JDK 17+)  
**Paquete:** `interpolacion`  

---

## 📌 Descripción del Proyecto

Este proyecto implementa dos métodos de interpolación polinomial para aproximar valores a partir de un conjunto de nodos:

1. **Método de Lagrange (`InterpolacionLagrange.java`):** Calcula el polinomio interpolador mediante una combinación lineal basada en la productoria de los polinomios base $L_i(x)$.
2. **Método de Diferencias Divididas de Newton (`InterpolacionNewton.java`):** Construye el polinomio de forma incremental utilizando una tabla de diferencias divididas.

---

## 📁 Estructura del Proyecto

```text
src/
└── interpolacion/
    ├── InterpolacionLagrange.java   # Implementación del método de Lagrange
    ├── InterpolacionNewton.java     # Implementación del método de Newton
    └── Main.java                    # Clase principal de ejecución y pruebas numéricas
