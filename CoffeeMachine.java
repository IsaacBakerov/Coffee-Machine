package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static Scanner sc = new Scanner(System.in);
    public static int machineWater = 400,
            machineMilk = 540,
            machineCoffee = 120,
            machineCups = 9,
            machineMoney = 550;

    public static void main(String[] args) {
        boolean end = true;
        while (end) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = sc.nextLine();

            if (action.equalsIgnoreCase("buy")) {
                actionBuy();
            } else if (action.equalsIgnoreCase("fill")) {
                actionFill();
            } else if (action.equalsIgnoreCase("take")) {
                actionTake();
            } else if (action.equalsIgnoreCase("remaining")) {
                printMachine();
            } else if (action.equalsIgnoreCase("exit")) {
                end = false;
            }

            System.out.println();
        }
    }

    private static void actionBuy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase("1")) {
            buyEspresso();
        } else if (type.equalsIgnoreCase("2")) {
            buyLatte();
        } else if (type.equalsIgnoreCase("3")) {
            buyCappuccino();
        } else if (type.equalsIgnoreCase("back")) {
            //isi yes
        }
    }

    private static void buyEspresso() {
        if (machineWater >= 250) {
            if (machineCoffee >= 16) {
                if (machineCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    machineWater -= 250;
                    machineCoffee -= 16;
                    machineCups -= 1;
                    machineMoney += 4;
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
            } else {
                System.out.println("Sorry, not enough coffee!");
            }
        } else {
            System.out.println("Sorry, not enough water!");
        }
    }

    private static void buyLatte() {
        if (machineWater >= 350) {
            if (machineMilk >= 75) {
                if (machineCoffee >= 20) {
                    if (machineCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineWater -= 350;
                        machineMilk -= 75;
                        machineCoffee -= 20;
                        machineCups -= 1;
                        machineMoney += 7;
                    } else {
                        System.out.println("Sorry, not enough cups!");
                    }
                } else {
                    System.out.println("Sorry, not enough coffee!");
                }
            } else {
                System.out.println("Sorry, not enough milk!");
            }
        } else {
            System.out.println("Sorry, not enough water!");
        }
    }

    private static void buyCappuccino() {
        if (machineWater >= 200) {
            if (machineMilk >= 100) {
                if (machineCoffee >= 12) {
                    if (machineCups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineWater -= 200;
                        machineMilk -= 100;
                        machineCoffee -= 12;
                        machineCups -= 1;
                        machineMoney += 6;
                    } else {
                        System.out.println("Sorry, not enough cups!");
                    }
                } else {
                    System.out.println("Sorry, not enough coffee!");
                }
            } else {
                System.out.println("Sorry, not enough milk!");
            }
        } else {
            System.out.println("Sorry, not enough water!");
        }
    }

    private static void actionFill() {
        System.out.println();
        System.out.println("Write how many ml of water you want to add:");
        machineWater += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        machineMilk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        machineCoffee += sc.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        machineCups += sc.nextInt();
    }

    private static void actionTake() {
        System.out.println("I gave you $" + machineMoney);
        machineMoney -= machineMoney;
    }

    private static void printMachine() {
        System.out.println("\nThe coffee machine has:\n" +
                machineWater + " ml of water\n" +
                machineMilk + " ml of milk\n" +
                machineCoffee + " g of coffee beans\n" +
                machineCups + " disposable cups\n" +
                "$" + machineMoney + " of money");
    }
}
