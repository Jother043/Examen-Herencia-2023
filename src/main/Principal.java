package main;
//IMPORTS
//TODO: Incluir los ficheros necesarios si están en otro paquete

import Excepciones.ApilableException;
import Excepciones.InvalidValuesException;
import Interfaces.IApilables;
import utils.*;


public class Principal {
    
    public static final int MAX_JUGUETES = 10;
    public static Juguetes[] juguetes = new Juguetes[MAX_JUGUETES];
    public static int numJuguetes = 0;

    public static void main(String[] args) {
        boolean salir = false;

        /*
        Se crea los objetos y lo metemos dentro de try catch para capturar los posibles errores que podamos cometer
        al introducir los datos.
         */
        FiguraMadera j1 = null;
        try {
            j1 = new FiguraMadera("Cubo", "Cubemax", "España", 2020, "Rojo", 6);
        } catch (InvalidValuesException e) {
            System.out.println(e.getMessage());
        }
        FiguraMadera j2 = null;
        try {
            j2 = new FiguraMadera("Dodecaedro", "Cubemax", "Camerún", 2022, "Amarillo", 12);
        } catch (InvalidValuesException e) {
            System.out.println(e.getMessage());
        }
        InstrumentoMusical j3 = null;
        try {
            j3 = new InstrumentoMusical("Xilófono", "Matel", "Brasil", 1999, 10);
        } catch (InvalidValuesException e) {
            System.out.println(e.getMessage());
        }
        VehiculoPlastico j4 = null;
        try {
            j4 = new VehiculoPlastico("Ferrari F11", "Ferrari", 4, JuguetesPlastico.TPlastico.PVC);
        } catch (InvalidValuesException e) {
            System.out.println(e.getMessage());
        }
        VehiculoPlastico j5 = null;
        try {
            j5 = new VehiculoPlastico("Camión Pegaso", "Juguematic", 8, JuguetesPlastico.TPlastico.PVC);
        } catch (InvalidValuesException e) {
            System.out.println(e.getMessage());
        }
        PiezaLego j6 = null;
        try {
            j6 = new PiezaLego("Bloque de lego", "Lego", JuguetesPlastico.TPlastico.ABS ,4, "Azul");
        } catch (InvalidValuesException e) {
            System.out.println(e.getMessage());
        }
        PiezaLego j7 = null;
        try {
            j7 = new PiezaLego("Bloque de lego", "Lego", JuguetesPlastico.TPlastico.ABS,2, "Verde");
        } catch (InvalidValuesException e) {
            System.out.println(e.getMessage());
        }
        //Llamada al método añadir Juguete.
        addJuguete(j1);
        addJuguete(j2);
        addJuguete(j3);
        addJuguete(j4);
        addJuguete(j5);
        addJuguete(j6);
        addJuguete(j7);


        
        
        do {
            System.out.println(menu());
            int opcion = UserDataCollector.getEnteroMinMax("Selecciona una opción", 1, 7);
            
            switch (opcion) {
            case 1:
                String nombre = UserDataCollector.getString("Introduce el nombre");
                String marca = UserDataCollector.getString("Introduce la marca");
                String origen = UserDataCollector.getString("Introduce el origen de la madera");
                int anoTala = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                int numLados = UserDataCollector.getEntero("Introduce el número de lados de la figura");
                String color = UserDataCollector.getString("Introduce el color de la figura");
                FiguraMadera figuraMadera = null;
                //Try Catch del new para controlar posibles errores de creación del objeto
                try {
                    figuraMadera = new FiguraMadera(nombre,marca,origen,anoTala,color,numLados);
                } catch (InvalidValuesException e) {
                    System.out.println(e.getMessage());
                }

                addJuguete(figuraMadera);
                
                break;
                
            case 2:

                String nombre_c2 = UserDataCollector.getString("Introduce el nombre");
                String marca_c2 = UserDataCollector.getString("Introduce la marca");
                String origen_c2 = UserDataCollector.getString("Introduce el origen de la madera");
                int anoTala_c2 = UserDataCollector.getEntero("Introduce el año de tala de la madera");
                int edadMin_c2 = UserDataCollector.getEntero("Introduce la edad mínima");
                InstrumentoMusical instrumentoMusical = null;
                //Try Catch del new para controlar posibles errores de creación del objeto
                try {
                    instrumentoMusical = new InstrumentoMusical(nombre_c2, marca_c2, origen_c2, anoTala_c2 , edadMin_c2);
                } catch (InvalidValuesException e) {
                    System.out.println(e.getMessage());
                }
                addJuguete(instrumentoMusical);
                
                break;
                
            case 3:
                String nombre_c3 = UserDataCollector.getString("Introduce el nombre");
                String marca_c3 = UserDataCollector.getString("Introduce la marca");
                int numRuedas_c3 = UserDataCollector.getEntero("Introduce el número de ruedas");

                VehiculoPlastico vehiculoPlastico = null;
                //Try Catch del new para controlar posibles errores de creación del objeto
                try {
                    vehiculoPlastico = new VehiculoPlastico(nombre_c3, marca_c3, numRuedas_c3, JuguetesPlastico.TPlastico.PVC );
                } catch (InvalidValuesException e) {
                    System.out.println(e.getMessage());
                }

                addJuguete(vehiculoPlastico);

                //TODO: Completar
                
                break;
                
            case 4:
                String nombre_c4 = UserDataCollector.getString("Introduce el nombre");
                String marca_c4 = UserDataCollector.getString("Introduce la marca");
                String color_c4 = UserDataCollector.getString("Introduce el color");
                int unidades_c4 = UserDataCollector.getEntero("Introduce la medida, en unidades");

                PiezaLego piezaLego = null;
                //Try Catch del new para controlar posibles errores de creación del objeto
                try {
                    piezaLego = new PiezaLego(nombre_c4, marca_c4, JuguetesPlastico.TPlastico.ABS, unidades_c4,color_c4);
                } catch (InvalidValuesException e) {
                    System.out.println(e.getMessage());
                }

                //TODO: Completar
                
                break;
                
            case 5:
                mostrarJuguetes();
                int opcion1_c5 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                Juguetes j1_c5 = juguetes[opcion1_c5 - 1];
                /*
                Compruebo que j1_c5 es instancia de IApilable, si no lo es, lanzamos una excepción.
                 */
                if(!(j1_c5 instanceof IApilables)){
                    try {
                        throw new ApilableException("No se puede apilar");
                    } catch (ApilableException e) {
                        System.out.println(e.getMessage());
                    }
                }
                //TODO: hacer comprobaciones y actuar según el enunciado
                
                System.out.println("Selecciona ahora el juguete que quieres apilar");
                mostrarJuguetes();
                int opcion2_c5 = UserDataCollector.getEnteroMinMax("Selecciona un juguete", 1, numJuguetes);
                Juguetes j2_c5 = juguetes[opcion2_c5 - 1];
                if(j2_c5.getClass() == j1_c5.getClass()) {
                    if(!(j2_c5.equals(j1_c5))) {
                        if (!(j2_c5 instanceof IApilables)) {
                            try {
                                throw new ApilableException("No se puede apilar");
                            } catch (ApilableException e) {
                                System.out.println(e.getMessage());
                            }

                        } else {
                            ((IApilables) j2_c5).apilar(j1_c5);
                        }
                    }else{
                        try {
                            throw new InvalidValuesException("No se puede apilar la misma pieza sobre si misma.");
                        } catch (InvalidValuesException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }else{
                    try {
                        throw new InvalidValuesException("No puedes apilar piezas de distinto tipo.");
                    } catch (InvalidValuesException e) {
                        System.out.println(e.getMessage());
                    }
                }

                //TODO: hacer el resto
                
                break;
                
            case 6:
                mostrarJuguetes();
                break;
                
            case 7:
                salir = true;
            }
        } while (!salir);
        
        System.out.println("Adiós");

    }

    /**
     * Método utilizado para Añadir Juguetes al Array de Juguetes.
     * siempre que haya espacio en el array.
     * @param juguete
     */
    public static void addJuguete(Juguetes juguete){
        boolean espacio = false;
        for (int i = 0; i < juguetes.length && !espacio; i++) {
            if (juguetes[i] == null) {
                espacio = true;
                juguetes[i] = juguete;
                numJuguetes++;
            }
        }
        /*
        Si no hay espacio informamos al usuario de que ya no hay más espacio disponible.
         */
        if(!(espacio)){
            try {
                throw new InvalidValuesException("No hay espacio en el almacén de Juguetes");
            } catch (InvalidValuesException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Método que nos muestra los Juguetes que tenemos creado dentro del array.
     */
    public static void mostrarJuguetes(){
        for (int i = 0; i < juguetes.length; i++) {
            if (!(juguetes[i] == null)) {
                System.out.println(juguetes[i]);
            }
        }
    }


    
    private static String menu() {
        StringBuilder sb = new StringBuilder("Menú\n");
        sb.append("1. Crear una figura de madera\n");
        sb.append("2. Crear un instrumento musical\n");
        sb.append("3. Crear un vehículo de plástico\n");
        sb.append("4. Crear una pieza de lego\n");
        sb.append("5. Apilar un juguete\n");
        sb.append("6. Mostrar todos los juguetes\n");
        sb.append("7. Salir\n");
        
        return sb.toString();
    }


}
