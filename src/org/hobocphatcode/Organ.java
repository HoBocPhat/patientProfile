package org.hobocphatcode;

public class Organ {
    private String name;
    private String meCondition;

    public Organ(String name, String meCondition) {
        this.name = name;
        this.meCondition = meCondition;
    }

    public void Record (){
        System.out.println("Name:" + this.getName());
        System.out.println("Medical Condition: " + this.getMeCondition());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeCondition() {
        return meCondition;
    }

    public void setMeCondition(String meCondition) {
        this.meCondition = meCondition;
    }
}
