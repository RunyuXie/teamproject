import java.util.Scanner;

public class AYLY {
    public static void main(String[] args) {
        System.out.println("Identity: ");
        System.out.println("1.Tourist  2.Staff");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        if (id == 1) {
            System.out.println("**********WELCOME!********");
            System.out.println("Please enter your physical information：height，weight");

            Scanner a = new Scanner(System.in);
            Scanner b = new Scanner(System.in);

            float height = a.nextFloat();//为了可以比较
            float weight = b.nextFloat();

            if (height > 1.4 && weight < 100) {
                System.out.println("You are in good physical condition.");
            } else {
                System.out.println("Unfortunately, you are unable to ride the roller coaster.");
            }
            System.out.println("May I ask if you have a history of heart disease：");
            System.out.println("1.Yes  2.No");
            Scanner c = new Scanner(System.in);
            String biS = c.nextLine();

            switch (biS) {
                case "1":
                    System.out.println("Unfortunately, you are unable to ride the roller coaster.");
                    break;
                case "2":
                    System.out.println("Thank you for you support.");
                    break;
            }


        } else {

            Scanner sc = new Scanner(System.in);


            System.out.println("*****************欢迎工作人员*******************");
            while (true) {//使可以终止
                System.out.println("How is the weather? ");
                System.out.println("1.rainy 2.snowy 3.clear 4.others");
                int choice = sc.nextInt();
                if (choice == 3) {
                    System.out.println("The weather is fine.");
                } else {
                    System.out.println("The weather today is not suitable for opening roller coasters.");
                    break;
                }


                System.out.println("how many days have passed since the last maintenance：");
                int a = sc.nextInt();

                if (a <= 15) {
                    System.out.println("The roller coaster is open today.");
                } else {
                    System.out.println("Roller coasters may have hidden dangers, please conduct quality inspection as soon as possible.");

                }
                break;

            }
        }

    }
}
