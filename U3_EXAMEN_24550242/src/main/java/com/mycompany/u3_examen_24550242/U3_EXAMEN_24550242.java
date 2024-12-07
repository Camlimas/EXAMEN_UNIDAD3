
package com.mycompany.u3_examen_24550242;

import java.util.Scanner;

public class U3_EXAMEN_24550242 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.print("Ingrese el número de estudiantes: ");

        int numEstudiantes = scanner.nextInt();

        double[] calificaciones = new double[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {

            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");

            calificaciones[i] = scanner.nextDouble();

        }

        double promedio = calcularPromedio(calificaciones);

        int cantidadMayores = contarCalificacionesMayores(calificaciones, promedio);

        double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);

        double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        System.out.println("El promedio de las calificaciones es: " + promedio);

        System.out.println("Cantidad de estudiantes con calificación mayor o igual al promedio: " + cantidadMayores);

        System.out.println("La calificación más alta es: " + calificacionMasAlta);

        System.out.println("La calificación más baja es: " + calificacionMasBaja);

        scanner.close();

    }

    

    public static double calcularPromedio(double[] calificaciones) {

        double suma = 0;

        for (double calificacion : calificaciones) {

            suma += calificacion;

        }

        return suma / calificaciones.length;

    }

    

    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {

        int contador = 0;

        for (double calificacion : calificaciones) {

            if (calificacion >= promedio) {

                contador++;

            }

        }

        return contador;
    }

    

    public static double obtenerCalificacionMasAlta(double[] calificaciones) {

        double max = calificaciones[0];

        for (double calificacion : calificaciones) {

            if (calificacion > max) {

                max = calificacion;

            }

        }

        return max;
    }

    

    public static double obtenerCalificacionMasBaja(double[] calificaciones) {

        double min = calificaciones[0];

        for (double calificacion : calificaciones) {

            if (calificacion < min) {

                min = calificacion;

            }

        }

        return min;

    }   
}
