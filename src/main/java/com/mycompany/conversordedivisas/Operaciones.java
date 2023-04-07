/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordedivisas;

import javax.swing.JOptionPane;

/**
 *
 * @author Mewtwo
 */
public class Operaciones {
    
    

    float peso = 18.31f;
    float dolar = 18.13f;
    float euro = 19.87f;
    float libra = 22.82f;
    float yen = .14f;
    float won = .014f;
    float dolToEu = 0.92f;
    float dolToLi = .80f;
    float dolToYen = 131.18f;
    float dolToWon = 1315.01f;
    float euToPes = 19.98f;
    float euToDol = 1.09f;
    float euToLib = .87f;
    float euToYen = 142.65f;
    float euToWon = 1436.65f;
    float libToDol = 1.25f;
    float libToEu = 1.14f;
    float libToYen = 163.03f;
    float libToWon = 1643.13f;
    float yenToDol = .0076f;
    float yenToEu = .0070f;
    float yenToLib = .0061f;
    float yenToWon = 10.08f;
    float wonToDol = .00076f;
    float wonToEu = .00069f;
    float wonToLib = .00061f;
    float wonToYen = .099f;

    float valor, resultado;
    int divisaInicial;
    int divisaFinal;
    int distanciaInicial;
    int distanciaFinal;

    public int getDistanciaInicial() {
        return distanciaInicial;
    }

    public void setDistanciaInicial(int distanciaInicial) {
        this.distanciaInicial = distanciaInicial;
    }

    public int getDistanciaFinal() {
        return distanciaFinal;
    }

    public void setDistanciaFinal(int distanciaFinal) {
        this.distanciaFinal = distanciaFinal;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public int getDivisaInicial() {
        return divisaInicial;
    }

    public void setDivisaInicial(int divisaInicial) {
        this.divisaInicial = divisaInicial;
    }

    public int getDivisaFinal() {
        return divisaFinal;
    }

    public void setDivisaFinal(int divisaFinal) {
        this.divisaFinal = divisaFinal;
    }

    

    public float convertir() {

        switch (divisaInicial) {

            case 1: {

                switch (divisaFinal) {

                    case 1 ->
                        resultado = valor;
                    case 2 ->
                        resultado = valor / dolar;
                    case 3 ->
                        resultado = valor / euro;
                    case 4 ->
                        resultado = valor / libra;
                    case 5 ->
                        resultado = valor / yen;
                    case 6 ->
                        resultado = valor / won;

                    default ->
                        JOptionPane.showMessageDialog(null, "No ha seleccionado el tipo de divisa");
                }
            }
            break;
            case 2: {

                switch (divisaFinal) {

                    case 1 ->
                        resultado = valor * peso;
                    case 2 ->
                        resultado = valor;
                    case 3 ->
                        resultado = valor * dolToEu;
                    case 4 ->
                        resultado = valor * dolToLi;
                    case 5 ->
                        resultado = valor * dolToYen;
                    case 6 ->
                        resultado = valor * dolToWon;
                }
            }
            break;
            case 3: {

                switch (divisaFinal) {

                    case 1 ->
                        resultado = valor * euToPes;
                    case 2 ->
                        resultado = valor * euToDol;
                    case 3 ->
                        resultado = valor;
                    case 4 ->
                        resultado = valor * euToLib;
                    case 5 ->
                        resultado = valor * euToYen;
                    case 6 ->
                        resultado = valor * euToWon;
                }
            }
            break;
            case 4: {
                switch (divisaFinal) {
                    case 1 ->
                        resultado = valor * libra;
                    case 2 ->
                        resultado = valor * libToDol;
                    case 3 ->
                        resultado = valor * libToEu;
                    case 4 ->
                        resultado = valor;
                    case 5 ->
                        resultado = valor * libToYen;
                    case 6 ->
                        resultado = valor * libToWon;
                }
            }
            break;
            case 5: {
                switch (divisaFinal) {
                    case 1 ->
                        resultado = valor * yen;
                    case 2 ->
                        resultado = valor * yenToDol;
                    case 3 ->
                        resultado = valor * yenToEu;
                    case 4 ->
                        resultado = valor * yenToLib;
                    case 5 ->
                        resultado = valor;
                    case 6 ->
                        resultado = valor * yenToWon;
                }
            }
            break;
            case 6: {
                switch (divisaFinal) {
                    case 1 ->
                        resultado = valor * won;
                    case 2 ->
                        resultado = valor * wonToDol;
                    case 3 ->
                        resultado = valor * wonToEu;
                    case 4 ->
                        resultado = valor * wonToLib;
                    case 5 ->
                        resultado = valor * wonToYen;
                    case 6 ->
                        resultado = valor;
                }
            }
            break;

        }
        return resultado;

    }

    public float convertirDistancia() {

        switch (distanciaInicial) {

            case 1 -> {
                switch (distanciaFinal) {

                    case 1 ->
                        resultado = valor;
                    case 2 ->
                        resultado = valor * 100f;
                    case 3 ->
                        resultado = valor * 1000000f;
                    case 4 ->
                        resultado = valor * 0.000621371f;
                    case 5 ->
                        resultado = valor * 1.09361f;
                    case 6 ->
                        resultado = valor * 3.28084f;
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una distancia");
                }
            }
            case 2 -> {
                switch (distanciaFinal) {

                    case 1 ->
                        resultado = valor * 0.01f;
                    case 2 ->
                        resultado = valor;
                    case 3 ->
                        resultado = valor * 10000f;
                    case 4 ->
                        resultado = valor * 0.00000621371f;
                    case 5 ->
                        resultado = valor * 0.0109361f;
                    case 6 ->
                        resultado = valor * 0.0328084f;
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una distancia");
                }
            }
            case 3 -> {
                switch (distanciaFinal) {

                    case 1 ->
                        resultado = valor * 0.000001f;
                    case 2 ->
                        resultado = valor * 0.0001f;
                    case 3 ->
                        resultado = valor;
                    case 4 ->
                        resultado = valor * 0.000000000621371f;
                    case 5 ->
                        resultado = valor * 0.00000109361f;
                    case 6 ->
                        resultado = valor * 0.00000328084f;
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una distancia");
                }
            }
            case 4 -> {
                switch (distanciaFinal) {

                    case 1 ->
                        resultado = valor * 1609.34f;
                    case 2 ->
                        resultado = valor * 160934f;
                    case 3 ->
                        resultado = valor * 1609340000;
                    case 4 ->
                        resultado = valor;
                    case 5 ->
                        resultado = valor * 1760f;
                    case 6 ->
                        resultado = valor * 5280f;
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una distancia");
                }
            }
            case 5 -> {
                switch (distanciaFinal) {

                    case 1 ->
                        resultado = valor * .9144f;
                    case 2 ->
                        resultado = valor * 91.44f;
                    case 3 ->
                        resultado = valor * 914400;
                    case 4 ->
                        resultado = valor * 0.000568182f;
                    case 5 ->
                        resultado = valor;
                    case 6 ->
                        resultado = valor * 3f;
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una distancia");
                }
            }

            case 6 -> {
                switch (distanciaFinal) {

                    case 1 ->
                        resultado = valor * 0.3048f;
                    case 2 ->
                        resultado = valor * 30.48f;
                    case 3 ->
                        resultado = valor * 304800f;
                    case 4 ->
                        resultado = valor * 0.000189394f;
                    case 5 ->
                        resultado = valor * 0.333333f;
                    case 6 ->
                        resultado = valor;
                    default ->
                        JOptionPane.showMessageDialog(null, "Seleccione una distancia");
                }
            }
            default -> JOptionPane.showMessageDialog(null, "Seleccione una distancia inicial");
        }

        return resultado;
    }
    
  
}
    

