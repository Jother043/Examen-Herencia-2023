package utils;

import Excepciones.InvalidValuesException;

public class VehiculoPlastico extends JuguetesPlastico{

    /*
    Atributos de la clase VehiculoPlástico.
     */
    private int numRuedas;
    private TPlastico plastico;

    /*
    Constructor de la clase VehiculoPlastico, que crea
     */
    public VehiculoPlastico(String nombre, String marca, int numRuedas, TPlastico plastico) throws InvalidValuesException {
        super(nombre, marca);
        setNumRuedas(numRuedas);
        this.plastico = JuguetesPlastico.TPlastico.valueOf("PVC");
    }

    /**
     * Método setter, lo utilizo para comprobar que no son valores incorrectos, pasándole el setter al constructor
     * para que haga una comprobación siempre que se cree un objeto de la clase.
     * @param numRuedas
     * @throws InvalidValuesException
     */
    public void setNumRuedas(int numRuedas) throws InvalidValuesException {
        if(numRuedas <= 0){
            throw new InvalidValuesException("El coche de plastico no puede tener 0 ruedas");
        }
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public TPlastico getPlastico() {
        return plastico;
    }

    /**
     * Método toString, para mostrar la información de la clase en el main.
     * @return devuelve un String con su información.
     */
    @Override
    public String toString() {
        return "VehiculoPlastico{" +
                super.toString() +
                "numRuedas=" + numRuedas +
                ", plastico=" + plastico +
                '}';
    }
}
