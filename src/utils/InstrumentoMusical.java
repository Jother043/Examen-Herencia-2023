package utils;

import Excepciones.InvalidValuesException;

public class InstrumentoMusical extends JuguetesMadera{

    /*
    Atributo de la
     */
    private int edadMin;

    public InstrumentoMusical(String nombre, String marca, String origen, int añoTala, int edadMin) throws InvalidValuesException {
        super(nombre, marca, origen, añoTala);
        setEdadMin(edadMin);
    }

    public void setEdadMin(int edadMin) throws InvalidValuesException {
        if(edadMin < 0){
            throw new InvalidValuesException("La edad minima no puede ser menor a 0");
        }
        this.edadMin = edadMin;
    }

    /**
     * Método toString, para mostrar la información de la clase en el main.
     * @return devuelve un String con su información.
     */
    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                super.toString() +
                "edadMin=" + edadMin +
                '}';
    }
}
