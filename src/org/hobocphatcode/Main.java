package org.hobocphatcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Eye lefteye = new Eye("Left Eye", "Short Sighted", "Blue",true);
        Eye righteye = new Eye("Right Eye", "Normal", "blue", true);
        Heart heart = new Heart("Heart","Normal", 65);
        Stomach stomach = new Stomach("Stomach", "PUD", true);
        Skin skin = new Skin("Skin", "Burned","White", 40);
        Patient patient = new Patient("Tom", 25, righteye, lefteye, heart, stomach, skin);

        patient.inFor();
        int option = 0;
        while (option < 6) {
            System.out.println("Choose an Organ:");
            System.out.println("\t 1. Left Eye");
            System.out.println("\t 2. Right Eye");
            System.out.println("\t 3. Heart");
            System.out.println("\t 4. Stomach");
            System.out.println("\t 5. Skin");
            System.out.println("\t 6. Quit");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    lefteye.Record();
                    if (patient.getLefteye().isOpen()) {
                        System.out.println("\t 1.Close eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLefteye().close();
                        }
                    } else {
                        System.out.println("\t 1. Open eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLefteye().open();
                        }
                    }
                    break;}

                case 2: {
                    righteye.Record();
                    if (patient.getRighteye().isOpen()) {
                        System.out.println("\t 1.Close eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRighteye().close();
                        }
                    } else {
                        System.out.println("\t 1. Open eye");
                        if (scanner.nextInt() == 1) {
                         patient.getRighteye().open();
                        }
                    }
                    break;}

                case 3: {
                   heart.Record();
                   System.out.println("\t 1.Change heart Rate");
                   int n = scanner.nextInt();
                   if(n==1) {
                       System.out.println("Enter the new heart rate");
                       int rate = scanner.nextInt();
                       heart.changeRate(rate);
                   }
                   break;
                }

                case 4: {
                    stomach.Record();
                    if(patient.getStomach().isEmpty()){
                    System.out.println("\t 1. Digest");
                    int n = scanner.nextInt();
                    if(n==1) {
                            stomach.eat();
                        }
                    }
                    break;
                }

                case 5: {
                    skin.Record();
                    break;
                }

            }
        }
    }

}
