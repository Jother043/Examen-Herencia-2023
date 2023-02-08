package utils;

import Excepciones.InvalidValuesException;

public abstract class JuguetesPlastico extends Juguetes{

    public enum TPlastico{
        PVC,ABS;
    }

    public JuguetesPlastico(String nombre, String marca) throws InvalidValuesException {
        super(nombre, marca);
    }

    /**
     * Método toString, para mostrar la información de la clase en el main.
     * @return devuelve un String con su información.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
