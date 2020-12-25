import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Patient patient1 = new Patient("Tom",  25,
                new Eye("Left Eye", "Normal", "Blue", true),
                new Eye("Right Eye", "Normal", "Blue", true),
                new Skin("Skin", "Burned"),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach", "Normal", 0));


        System.out.println("Name: " + patient1.getName());
        System.out.println("Age: " + patient1.getAge());
        int option = menu();

        while(true) {

            if (option == 1) {
                System.out.println("Name: " + patient1.getLeftEye().getName());
                System.out.println("Medical Condition: " + patient1.getLeftEye().getMedicalCondition());
                System.out.println("Color: " + patient1.getLeftEye().getColor());
                System.out.println("    1. Close the Eye");
                if (in.nextInt() == 1) {
                    patient1.getLeftEye().setOpen(false);
                }else{
                    patient1.getLeftEye().setOpen(true);
                }
                option = menu();

            } else if (option == 2) {
                System.out.println("Name: " + patient1.getRightEye().getName());
                System.out.println("Medical Condition: " + patient1.getRightEye().getMedicalCondition());
                System.out.println("Color: " + patient1.getRightEye().getColor());
                System.out.println("    1. Close the Eye");
                if (in.nextInt() == 1) {
                    patient1.getRightEye().setOpen(false);
                }else{
                    patient1.getRightEye().setOpen(true);
                }
                option = menu();

            } else if (option == 3) {
                System.out.println("Name: " + patient1.getHeart().getName());
                System.out.println("Medical Condition: " + patient1.getHeart().getMedicalCondition());
                System.out.println("Rate: " + patient1.getHeart().getRate());

                System.out.println("    1. Change the heart rate: ");
                int change = in.nextInt();
                int rate;
                if( change == 1 ){
                    System.out.println("Enter new heart rate: ");
                    rate = in.nextInt();
                    patient1.getHeart().setRate(rate);
                    System.out.println("Heart rate changed to: " + patient1.getHeart().getRate());
                }
                option = menu();

            } else if (option == 4) {
                System.out.println("Name: " + patient1.getStomach().getName());
                System.out.println("Medical Condition: " + patient1.getStomach().getMedicalCondition());
                System.out.println("Need to be fed ");
                System.out.println("    1. Digest");

                int change = in.nextInt();
                int rate;
                if( change == 1 ){
                    System.out.println();
                    rate = in.nextInt();
                    patient1.getHeart().setRate(rate);
                }
                option = menu();
            } else if (option == 5) {
                System.out.println("Name: " + patient1.getSkin().getName());
                System.out.println("Medical Condition: " + patient1.getSkin().getMedicalCondition());
                option = menu();
            } else if (option == 6) {
                System.exit(0);
            } else {
                option = menu();
            }
        }//End while loop

    }

    public static int menu (){
        System.out.println("Choose an Organ: ");
        System.out.println("    1. Left eye");
        System.out.println("    2. Right eye");
        System.out.println("    3. Heart");
        System.out.println("    4. Stomach");
        System.out.println("    5. Skin");
        System.out.println("    6. Quit");

        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
