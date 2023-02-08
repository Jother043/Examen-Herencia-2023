package utils;

import Excepciones.InvalidValuesException;
import Interfaces.IApilables;

import java.util.Objects;

public class PiezaLego extends JuguetesPlastico implements IApilables {

    /*
    Atributos de la clase Pieza Lego.
     */
    private TPlastico plastico;
    private int longitud;
    private String color;

    /**
     * Constructor para las piezas de lego, que hereda de la clase JuguetePlástico.
     * @param nombre
     * @param marca
     * @param plastico
     * @param longitud
     * @param color
     * @throws InvalidValuesException
     */
    public PiezaLego(String nombre, String marca, TPlastico plastico, int longitud, String color) throws InvalidValuesException {
        super(nombre, marca);
        this.longitud = longitud;
        this.color = color;
        this.plastico = JuguetesPlastico.TPlastico.valueOf("ABS");
    }


    public TPlastico getPlastico() {
        return plastico;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getColor() {
        return color;
    }

    /**
     * Método de la Interfaz IApilable.
     */
    @Override
    public void apilar(Juguetes juguetes) {
        System.out.println("apilando pieza lego " + getNombre() + " sobre: " + juguetes.getNombre());
    }

    /**
     * Método toString, para mostrar la información de la clase en el main.
     * @return devuelve un String con su información.
     */
    @Override
    public String toString() {
        return "PiezaLego{" +
                super.toString() +
                "plastico=" + plastico +
                ", longitud=" + longitud +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PiezaLego piezaLego = (PiezaLego) o;
        return longitud == piezaLego.longitud && plastico == piezaLego.plastico && color.equals(piezaLego.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plastico, longitud, color);
    }
}
