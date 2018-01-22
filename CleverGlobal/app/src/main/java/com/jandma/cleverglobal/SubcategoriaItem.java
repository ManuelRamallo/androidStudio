package com.jandma.cleverglobal;

/**
 * Created by mrdiaz on 12/01/2018.
 */

public class SubcategoriaItem {
    private int id;
    private String nombre;

    public SubcategoriaItem(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
