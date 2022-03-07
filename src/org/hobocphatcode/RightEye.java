package org.hobocphatcode;

public class RightEye extends Eye{
    public RightEye(String name, String meCondition, String color, boolean isOpen) {
        super(name, meCondition, color, isOpen);
    }

    public void Closed () {
        System.out.println("Right Eye Closed");
    }
}
