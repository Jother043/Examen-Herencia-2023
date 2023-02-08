package utils;

import Excepciones.InvalidValuesException;
import Interfaces.IApilables;

public class FiguraMadera extends JuguetesMadera implements IApilables {

    /*
    Atributos de la clase FiguraMadera
     */
    private String color;
    private int numLados;

    /**
     * Contructor de la clase FiguraMadera el cual hereda de la clase JugueteMadera
     * @param nombre
     * @param marca
     * @param origen
     * @param añoTala
     * @param color
     * @param numLados
     * @throws InvalidValuesException
     */
    public FiguraMadera(String nombre, String marca, String origen, int añoTala, String color, int numLados) throws InvalidValuesException {
        super(nombre, marca, origen, añoTala);
        setColor(color);
        setNumLados(numLados);
    }

    /**
     * Método setter que lo utilizamos para comprobar si el nombre es null o son espacios.
     * En caso de ser null o espacios lanzará la excepción
     * @param color
     * @throws InvalidValuesException
     */
    public void setColor(String color) throws InvalidValuesException {
        if(color == null && color.trim().isEmpty()){
            throw new InvalidValuesException("Tienes que introducir un color de figura");
        }
        this.color = color;
    }

    public void setNumLados(int numLados) throws InvalidValuesException {
        if(numLados < 1){
            throw new InvalidValuesException("La figura tiene que tener siempre algún lado.");
        }
        this.numLados = numLados;
    }

    @Override
    public void apilar(Juguetes juguetes) {
        System.out.println("Apilando figura madera " + getNombre() + " sobre: " + juguetes.getNombre());
    }
    /**
     * Método toString, para mostrar la información de la clase en el main.
     * @return devuelve un String con su información.
     */
    @Override
    public String toString() {
        return "FiguraMadera{" +
                super.toString() +
                "color='" + color + '\'' +
                ", numLados=" + numLados +
                '}';
    }
}
