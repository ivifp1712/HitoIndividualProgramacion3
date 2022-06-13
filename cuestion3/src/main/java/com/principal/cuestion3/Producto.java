package com.principal.cuestion3;

import javafx.beans.property.SimpleStringProperty;

public class Producto {

    private final SimpleStringProperty id;
    private final SimpleStringProperty nombre;

    private final SimpleStringProperty fenvasado;

    private final SimpleStringProperty unidades;
    private final SimpleStringProperty precio;
    private final SimpleStringProperty disponible;


    public Producto(String id, String nombre, String fenvasado, String unidades, String precio, String disponible) {
        this.id = new SimpleStringProperty(id);
        this.nombre = new SimpleStringProperty(nombre);
        this.fenvasado = new SimpleStringProperty(fenvasado);
        this.unidades = new SimpleStringProperty(unidades);
        this.precio = new SimpleStringProperty(precio);
        this.disponible = new SimpleStringProperty(disponible);
    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getFenvasado() {
        return fenvasado.get();
    }

    public SimpleStringProperty fenvasadoProperty() {
        return fenvasado;
    }

    public void setFenvasado(String fenvasado) {
        this.fenvasado.set(fenvasado);
    }

    public String getUnidades() {
        return unidades.get();
    }

    public SimpleStringProperty unidadesProperty() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades.set(unidades);
    }

    public String getPrecio() {
        return precio.get();
    }

    public SimpleStringProperty precioProperty() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio.set(precio);
    }

    public String getDisponible() {
        return disponible.get();
    }

    public SimpleStringProperty disponibleProperty() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible.set(disponible);
    }
}
