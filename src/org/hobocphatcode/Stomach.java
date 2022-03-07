package org.hobocphatcode;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String meCondition, boolean isEmpty) {
        super(name, meCondition);
        this.isEmpty = isEmpty;
    }

    public void eat () {
        System.out.println("Digesting beginning ...");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public void Record() {
        super.Record();
        if(this.isEmpty()) {
            System.out.println("Need to be fed");
        } else {
            System.out.println("Stomach is full");
        }
    }


}
