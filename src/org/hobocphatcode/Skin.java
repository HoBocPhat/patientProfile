package org.hobocphatcode;

public class Skin extends Organ{
   private String color;
   private int softness;

    public Skin(String name, String meCondition, String color, int softness) {
        super(name, meCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void Record() {
        super.Record();
        System.out.println("Skin color: " + this.getColor());
        System.out.println("Softness: " + this.getSoftness());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
