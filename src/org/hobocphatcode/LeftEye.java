package org.hobocphatcode;

public class LeftEye extends Eye{
    public LeftEye(String name, String meCondition, String color, boolean isOpen) {
        super(name, meCondition, color, isOpen);
    }

    public void Closed () {
        System.out.println("Left Eye Closed");
    }
}
