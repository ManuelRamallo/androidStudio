package com.jandma.cleverglobal;

/**
 * Created by mrdiaz on 12/01/2018.
 */

public class CategoriaItem {
    private String nombre;
    private int icono;

    public CategoriaItem(String nombre, int icono) {
        this.nombre = nombre;
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}
