import java.util.Scanner;

public class AmusementPark {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Identity: ");
            System.out.println("1. Tourist  2. Staff");
            System.out.print("Please enter your identity (1 or 2): ");
            int id = scanner.nextInt();

            if (id == 1) {
                touristProcess(scanner);
            } else if (id == 2) {
                System.out.println("Please enter your password");
                boolean isPasswordCorrect = checkPassword(scanner);
                if (isPasswordCorrect) {
                    staffProcess(scanner);
                } else {
                    System.out.println("Wrong password, you can not enter");
                }
            } else {
                System.out.println("Invalid input. Please enter 1 for Tourist or 2 for Staff.");
            }

            scanner.close();
        }

        private static void touristProcess(Scanner scanner) {
            System.out.println("********WELCOME!********");
            System.out.print("Please enter your height (cm) and weight (kg) separated by an underscore: ");
            String input = scanner.next();
            // Check if the input contains an underscore and has exactly two parts
            if (input.contains("_")) {
                String[] inputs = input.split("_");
                if (inputs.length == 2) {
                    try {
                        float height = Float.parseFloat(inputs[0]);
                        float weight = Float.parseFloat(inputs[1]);

                        if (height > 140 && weight < 100) {
                            System.out.println("You are in good physical condition.");
                        } else {
                            System.out.println("Unfortunately, you are unable to ride the roller coaster.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter valid numbers for height and weight.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter exactly two values separated by an underscore.");
                }
            } else {
                System.out.println("Invalid input. Please enter exactly two values separated by an underscore.");
            }

            System.out.print("Do you have a history of heart disease (1.Yes, 2.No)? ");
            String heartDisease = scanner.next();
            if ("1".equals(heartDisease)) {
                System.out.println("Unfortunately, you are unable to ride the roller coaster.");
            } else if ("2".equals(heartDisease)) {
                System.out.println("Thank you for your support.");
            } else {
                System.out.println("Invalid answer. Please enter 1 for Yes or 2 for No.");
            }
        }

        private static boolean checkPassword(Scanner scanner) {
            System.out.print("Enter password: ");
            String password = scanner.next();
            // Password is set to "MerryChristmas"
            return "MerryChristmas".equals(password);
        }

        private static void staffProcess(Scanner scanner) {
            System.out.println("********Work smoothly!********");
            System.out.print("How is the weather today (1.clear, 2.rainy, 3.snowy, 4.cloudy)? ");
            int weather = scanner.nextInt();
            if (weather == 1) {
                System.out.println("The weather is fine.");
            } else {
                System.out.println("The weather today is not suitable for opening roller coasters.");
            }

            System.out.print("How many days since the last maintenance? ");
            int days = scanner.nextInt();
            if (days <= 15) {
                System.out.println("The roller coaster is open today.");
            } else {
                System.out.println("Roller coasters may have hidden dangers, please conduct quality inspection as soon as possible.");
            }
        }
    }

