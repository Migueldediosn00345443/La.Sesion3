/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author migueldedios
 */
public class Persona2 {
    
    private PersonaDatosBasicos dataB;
    private PersonaDatosContactos dataC;
    private PersonaDatoRegistro dataR;

    public Persona2(PersonaDatosBasicos dataB, PersonaDatosContactos dataC, PersonaDatoRegistro dataA) {
        
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataA;
    }

    public PersonaDatosBasicos getDataB() {
        return dataB;
    }

    public void setDataB(PersonaDatosBasicos dataB) {
        this.dataB = dataB;
    }

    public PersonaDatosContactos getDataC() {
        return dataC;
    }

    public void setDataC(PersonaDatosContactos dataC) {
        this.dataC = dataC;
    }

    public PersonaDatoRegistro getDataA() {
        return dataR;
    }

    public void setDataA(PersonaDatoRegistro dataA) {
        this.dataR = dataA;
    }
    
}
