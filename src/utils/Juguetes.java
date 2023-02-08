package utils;

import Excepciones.InvalidValuesException;

public abstract class Juguetes {

    //Atributos de la clase Juguetes.
    private String nombre;
    private String marca;

    /**
     * Constructor de la clase abstracta Juguetes
     * @param nombre
     * @param marca
     * @throws InvalidValuesException
     */
    public Juguetes(String nombre, String marca) throws InvalidValuesException {
        setNombre(nombre);
        setMarca(marca);
    }

    /**
     * Comprobamos que nombre es válido no permitiendo que sea nulo ni espacios y se lo pasamos al constructor
     * para que ates de crearse lo compruebe.
     * @param nombre
     * @throws InvalidValuesException
     */
    public void setNombre(String nombre) throws InvalidValuesException {
        if(nombre == null && nombre.trim().isEmpty()){
            throw new InvalidValuesException("El nombre no puede ser nulo o espacios.");
        }
        this.nombre = nombre;
    }

    /**
     * Comprobamos que la Marca no sea nula ni espacios como el nombre, es el mismo proceso.
     * @param marca
     * @throws InvalidValuesException
     */
    public void setMarca(String marca) throws InvalidValuesException {
        if(marca == null && marca.trim().isEmpty()){
            throw new InvalidValuesException("Tienes que introducir una marca.");
        }
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }


    /**
     * Método toString, para mostrar la información de la clase en el main.
     * @return devuelve un String con su información.
     */
    @Override
    public String toString() {
        return "Juguetes{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

}
