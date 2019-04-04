package org.demo.birds.entities;

/**
 * Bird.
 * <p>
 * Должны быть следущие свойства:
 * <p>
 * name  тип String
 * livingArea тип String
 * size – число с плавающей точкой, может быть незаполненным (Double).
 */
public class Bird {
    private String name;
    private String livingArea;
    private Double size;

    public Bird(String name, String livingArea, Double size) {
        this.name = name;
        this.livingArea = livingArea;
        this.size = size;
    }

    public Bird() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
