/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Luis
 */
public class Ejercicio5 {
public String num;
public String num2;
public Double nume;
public Double nume2;
public Double Memoria;
public Double Resultado;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
        setNume(Double.parseDouble(this.num));
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
        this.setNume2(Double.parseDouble(this.num2));
    }

    public Double getNume() {
        return nume;
    }

    public void setNume(Double nume) {
        this.nume = nume;
    }

    public Double getNume2() {
        return nume2;
    }

    public void setNume2(Double nume2) {
        this.nume2 = nume2;
    }

    public Double getMemoria() {
        return Memoria;
    }

    public void setMemoria(Double Memoria) {
        this.Memoria = Memoria;
    }

    public Double getResultado() {
        return Resultado;
    }

    public void setResultado(Double Resultado) {
        this.Resultado = Resultado;
    }
    
    public double Suma(double num,double num2)
    {
     this.Resultado = num + num2;
     setMemoria(Resultado);
    return 0;
    }
    public double Resta(double num,double num2)
    {
    this.Resultado = num - num2;
    setMemoria(Resultado);
    return 0;
    }
    public double Multiplicacion(double num,double num2)
    {
    this.Resultado = num * num2;
    setMemoria(Resultado);
    return 0;
    }
    public double Divicion(double num,double num2)
    {
    this.Resultado = num / num2;
        setMemoria(Resultado);
    return 0;
    }
}
