package com.example.hiloscarrera;

public class Corredor extends Thread{
    private String nombre;
    private int velocidad;
    private long initialTime;

    public Corredor() {
    }

    public Corredor(String nombre, int velocidad, long initialTime) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    @Override
    public void run(){

    }
}