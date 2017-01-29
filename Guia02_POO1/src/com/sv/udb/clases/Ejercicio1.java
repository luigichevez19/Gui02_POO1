/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import com.sv.udb.froms.FrmEjercicio1;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio1 {
 int numBase;
    int numPont;
    public int getNumBase() {
        return numBase;
    }

    public void setNumBase(int numBase) {
        this.numBase = numBase;
    }

    public int getNumPont() {
        return numPont;
    }

    public void setNumPont(int numPont) {
        this.numPont = numPont;
    }
    public int getResultado()
    {
    int resp=1;
        try 
        {
            if (numPont==0)
            {
            return 1 ;
            }
            for (int i=1; i <= numPont;i++)
            {
            resp=this.multiplicacion(resp, numBase);
            }
            JOptionPane.showMessageDialog(null, "La respuesta es: "+resp);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    return resp;
    }
    private int multiplicacion(int num1, int num2)
    {
    int resp=0;
    for (int i=0; i < num1;i++)
    {
    resp+= num2;
    }
    return resp;
    }
   
}
