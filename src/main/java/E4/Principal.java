/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        String cantante, disco;
        ListaCantantesFamosos listacantate = new ListaCantantesFamosos();
        EntradaDeTeclado entrada = new EntradaDeTeclado();

        CantanteFamoso cantante1 = new CantanteFamoso("Marcos Antonio", "Navidad sin ti");//los datos no son reales
        CantanteFamoso cantante2 = new CantanteFamoso("Enrique Iglesia", "Si tu te va");
        listacantate.AgregarCantanteFamoso(cantante1);
        listacantate.AgregarCantanteFamoso(cantante2);

        System.out.println("La lista contiene los siguientes datos: ");
        listacantate.listarCantanteFamoso();
        String continuar = new String();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            System.out.println("La lista contiene los siguientes datos: ");
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

    }

}
