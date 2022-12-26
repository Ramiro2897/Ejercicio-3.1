
package com.mycompany.polimorfismo;


public class VehiculoDos extends vehiculo {
    private final int nPuertas;
    
    public VehiculoDos(int nPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    
    public int getPuertas(){
        return nPuertas;
    }
    //sobreescribimos el metodo de la clase padre
    @Override
    public String mostrarDatos(){
         return "matricula : "+ matricula+"\nmarca :"+marca+ "\nmodelo :"+modelo
                 +"\nNumero de puertas :"+nPuertas;
    }
}
