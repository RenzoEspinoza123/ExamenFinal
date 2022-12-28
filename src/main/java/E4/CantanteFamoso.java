/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4;

/**
 *
 * @author LENOVO
 */
public class CantanteFamoso {
    private String nombre;
    private String discoMasVendido;

    public CantanteFamoso() {
        nombre = "";
        discoMasVendido = "";
    }

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getDiscoConMasVentas() {
        return discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }
}
