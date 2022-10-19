/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numero_Complejos;

/**
 *
 * @author Marjan Celi Salinas
 */
public class  Complejos implements Operaciones{
     private float NumeroReal;
     private float NumeroImaginario;
     public float Solucion;

    public Complejos() {
    }

    public Complejos(float NumeroReal, float NumeroImaginario) {
        this.NumeroReal = NumeroReal;
        this.NumeroImaginario = NumeroImaginario;
    }

 
     
    public float getNumeroReal() {
        return NumeroReal;
    }

    public void setNumeroReal(float NumeroReal) {
        this.NumeroReal = NumeroReal;
    }

    public float getNumeroImaginario() {
        return NumeroImaginario;
    }

    public void setNumeroImaginario(float NumeroImaginario) {
        this.NumeroImaginario = NumeroImaginario;
    }

    public float getSolucion() {
        return Solucion;
    }

    public void setSolucion(float Solucion) {
        this.Solucion = Solucion;
    }

    @Override
    public Complejos Sumas(Complejos suma) {
        float RespReal = NumeroReal + suma.NumeroReal;
        float RespImaginario = NumeroImaginario + suma.NumeroImaginario;

        return new Complejos(RespReal, RespImaginario);
    }

    @Override
    public Complejos Resta(Complejos resta) {
        float RespReal = NumeroReal - resta.NumeroReal;
        float RespImaginario = NumeroImaginario - resta.NumeroImaginario;

        return new Complejos(RespReal, RespImaginario);
    }

    @Override
    public String toFloatString() {
        return String.format("(%.2f, %.2fi)", NumeroReal, NumeroImaginario);
    }
         
}
