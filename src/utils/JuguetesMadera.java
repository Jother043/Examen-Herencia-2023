package utils;

import Excepciones.InvalidValuesException;

public abstract class JuguetesMadera extends Juguetes{

    /**
     * Atributos de la clase JugueteMadera.
     */
    private String origen;
    private int añoTala;

    /**
     * Constructor de JuguetesMadera y le pasamos los setter para comprobar que son datos correctos
     * si no lo son lanzamos una excepción
     * @param nombre
     * @param marca
     * @param origen
     * @param añoTala
     * @throws InvalidValuesException
     */
    public JuguetesMadera(String nombre, String marca, String origen, int añoTala) throws InvalidValuesException {
        super(nombre, marca);
        setOrigen(origen);
        setAñoTala(añoTala);
    }

    public void setOrigen(String origen) throws InvalidValuesException {
        if(origen == null && origen.trim().isEmpty()){
            throw new InvalidValuesException("La madera tiene que tener un lugar de procedencia");
        }
        this.origen = origen;
    }

    public void setAñoTala(int añoTala) throws InvalidValuesException {
        if(añoTala <= 0){
            throw new InvalidValuesException("El Año de la madera no puede ser 0 ni menor a 0");
        }
        this.añoTala = añoTala;
    }

    /**
     * Método toString, para mostrar la información de la clase en el main.
     * @return devuelve un String con su información.
     */
    @Override
    public String toString() {
        return "JuguetesMadera{" +
                super.toString() +
                "origen='" + origen + '\'' +
                ", añoTala=" + añoTala +
                '}';
    }
}
