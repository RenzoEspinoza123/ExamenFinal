/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4;

import java.util.Scanner;

public class EntradaDeTeclado {

    private String entradaTeclado;
    Scanner sc = new Scanner(System.in);

    public EntradaDeTeclado() {
        entradaTeclado = "";
    }

    public String AgregarCantante() {
        entradaTeclado = sc.nextLine();
        return entradaTeclado;
    }
    public String getEntrada() {
        return entradaTeclado;
    }

}
