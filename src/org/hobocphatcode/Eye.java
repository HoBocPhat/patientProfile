package org.hobocphatcode;

public class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String meCondition, String color, boolean isOpen) {
        super(name, meCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void Record() {
        super.Record();
        System.out.println("Color: " + this.getColor());
    }

    public void open(){
        this.setOpen(true);
        System.out.println(this.getName() + "is opened");
    }

    public void close() {
        this.setOpen(false);
        System.out.println(this.getName() + "is closed");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
