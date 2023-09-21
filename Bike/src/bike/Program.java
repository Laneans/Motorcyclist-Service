package bike;

import java.util.ArrayList;
import java.util.Scanner;

public class Program{

    public static ArrayList<EquipmentBase> headEquipment = new ArrayList<>();
    public static ArrayList<EquipmentBase> bodyEquipment = new ArrayList<>();
    public static ArrayList<EquipmentBase> legsEquipment = new ArrayList<>();
    static HeadEquipment eqH;
    static BodyEquipment eqB;
    static LegsEquipment eqL;


    public static void main(String[] args) {
        toMenu();
    }

    public static void toMenu() {
        System.out.println("\nMenu:");
        System.out.println("1) Add equipment to a motorcyclist");
        System.out.println("2) Remove equipment from a motorcyclist");
        System.out.println("3) View the motorcyclist's equipment");

        System.out.println("4) Find equipment by price range");
        System.out.println("5) Find the total cost of equipment");
        System.out.println("6) Sort equipment by weight");

        //choosing the element of menu
        Scanner consoleChoose = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choose = consoleChoose.nextLine();

        switch (Integer.parseInt(choose)) {
            case 1 -> addingEq();
            case 2 -> {
                if (headEquipment.size() != 0 && bodyEquipment.size() != 0 && legsEquipment.size() != 0) {
                    try {
                        deletingEq();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    System.err.println(EquipmentBase.StrValues.A);
                    toMenu();
                }
            }
            case 3 -> {
                if (headEquipment.size() != 0 && bodyEquipment.size() != 0 && legsEquipment.size() != 0) {
                    try {
                        seeingAllEq();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    System.err.println(EquipmentBase.StrValues.A);
                    toMenu();
                }
            }
            case 4 -> {
                if (headEquipment.size() != 0 && bodyEquipment.size() != 0 && legsEquipment.size() != 0) {
                    try {
                        countingByRangeOfPrice();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    System.err.println(EquipmentBase.StrValues.A);
                    toMenu();
                }
            }
            case 5 -> {
                if (headEquipment.size() != 0 && bodyEquipment.size() != 0 && legsEquipment.size() != 0) {
                    try {
                        countingCommonPrice();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    System.err.println(EquipmentBase.StrValues.A);
                    toMenu();
                }
            }
            case 6 -> {
                if (headEquipment.size() != 0 && bodyEquipment.size() != 0 && legsEquipment.size() != 0) {
                    try {
                        sortingByWeight();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                else {
                    System.err.println(EquipmentBase.StrValues.A);
                    toMenu();
                }
            }
            default -> {
                System.out.print(EquipmentBase.StrValues.B);
                toMenu();
            }
        }
    }


    //------------------------------------------------SORT BY WEIGHT
    private static void sortingByWeight() {
        //choosing the element of equipment for sorting
        System.out.println("\nWhat type of equipment should I sort by weight?");
        System.out.println(EquipmentBase.StrValues.C);
        System.out.println(EquipmentBase.StrValues.D);
        System.out.println(EquipmentBase.StrValues.E);

        Scanner consoleChooseTypeEq = new Scanner(System.in);
        System.out.print("Your choice: ");
        String chooseType = consoleChooseTypeEq.nextLine();

        switch (Integer.parseInt(chooseType)) {
            case 1 -> sortingForHead();
            case 2 -> sortingForBody();
            case 3 -> sortingForLegs();
            default -> System.out.print(EquipmentBase.StrValues.B);
        }
        toMenu();
    }

    private static void sortingForLegs() {
        // LegsEquipment equipment;
        eqL.sortByWeight();
        System.out.println("Leg equipment is sorted!\n");
        eqL.seeEquipment();
    }

    private static void sortingForBody() {
        // BodyEquipment equipment;
        eqB.sortByWeight();
        System.out.println("Body equipment is sorted!\n");
        eqB.seeEquipment();
    }

    private static void sortingForHead() {
        // HeadEquipment equipment;
        eqH.sortByWeight();
        System.out.println("Head equipment is sorted!\n");
        eqH.seeEquipment();
    }


    //------------------------------------------------COUNT COMMON PRICE
    private static void countingCommonPrice() {
        System.out.println("\nThe total price of all equipment is " + Equipmentable.countPrice());
        toMenu();
    }


    //------------------------------------------------COUNT BY RANGE OF PRICE
    private static void countingByRangeOfPrice() {
        System.out.println("\nEnter the min price");
        Scanner consoleMinPrice = new Scanner(System.in);
        String min = consoleMinPrice.nextLine();
        System.out.println("\nEnter the max price");
        Scanner consoleMaxPrice = new Scanner(System.in);
        String max = consoleMaxPrice.nextLine();

        //of Head
        eqH.findByRangeOfPrice(Double.parseDouble(String.valueOf(min)),Double.parseDouble(String.valueOf(max)));
        //of Body
        eqB.findByRangeOfPrice(Double.parseDouble(String.valueOf(min)),Double.parseDouble(String.valueOf(max)));
        //of Legs
        eqL.findByRangeOfPrice(Double.parseDouble(String.valueOf(min)),Double.parseDouble(String.valueOf(max)));
        toMenu();
    }


    //------------------------------------------------SEE ALL
    private static void seeingAllEq() {
        System.out.println(EquipmentBase.StrValues.C);
        eqH.seeEquipment();
        System.out.println(EquipmentBase.StrValues.D);
        eqB.seeEquipment();
        System.out.println(EquipmentBase.StrValues.E);
        eqL.seeEquipment();
        toMenu();
    }


    //------------------------------------------------DELETE
    private static void deletingEq() {
        //choosing the element of equipment for deleting
        System.out.println("\nWhat type of equipment should I remove?");
        System.out.println(EquipmentBase.StrValues.C);
        System.out.println(EquipmentBase.StrValues.D);
        System.out.println(EquipmentBase.StrValues.E);

        Scanner consoleChooseTypeEq = new Scanner(System.in);
        System.out.print("Your choice: ");
        String chooseType = consoleChooseTypeEq.nextLine();

        switch (Integer.parseInt(chooseType)) {
            case 1 -> deleteFromHead();
            case 2 -> deleteFromBody();
            case 3 -> deleteFromLegs();
            default -> System.out.print("Recheck the entered choice");
        }
        toMenu();
    }
    private static void deleteFromHead() {
       // HeadEquipment equipment;
        System.out.println("\nChoose the equipment to remove");
        eqH.seeEquipment();
        Scanner consoleChooseD = new Scanner(System.in);
        String choose = consoleChooseD.nextLine();
        int intChoose = Integer.parseInt(choose);  // Convert to int

        // Deleting from ArrayList
        if (intChoose <= headEquipment.size()) {
            headEquipment.remove(headEquipment.get(intChoose - 1));
        } else {
            System.out.print(EquipmentBase.StrValues.B);
            toMenu();
        }
        System.out.println("The selected equipment has been removed!\n");
    }
    private static void deleteFromBody() {
        // BodyEquipment equipment;
        System.out.println("\nChoose the equipment to remove");
        eqB.seeEquipment();
        Scanner consoleChooseD = new Scanner(System.in);
        String choose = consoleChooseD.nextLine();
        int intChoose = Integer.parseInt(choose);  // Convert to int

        // Deleting from ArrayList
        if (intChoose <= bodyEquipment.size()) {
            bodyEquipment.remove(bodyEquipment.get(intChoose - 1));
        } else {
            System.out.print(EquipmentBase.StrValues.B);
            toMenu();
        }
        System.out.println("The selected equipment has been removed!\n");
    }
    private static void deleteFromLegs() {
        // LegsEquipment equipment;
        System.out.println("\nChoose the equipment to remove");
        eqL.seeEquipment();
        Scanner consoleChooseD = new Scanner(System.in);
        String choose = consoleChooseD.nextLine();
        int intChoose = Integer.parseInt(choose);  // Convert to int

        // Deleting from ArrayList
        if (intChoose <= legsEquipment.size()) {
            legsEquipment.remove(legsEquipment.get(intChoose - 1));
        } else {
            System.out.print(EquipmentBase.StrValues.B);
            toMenu();
        }
        System.out.println("The selected equipment has been removed!\n");
    }



    //------------------------------------------------ADD
    private static void addingEq() {
        //choosing the element of equipment for adding
        System.out.println("\nWhat type of equipment to create?");
        System.out.println(EquipmentBase.StrValues.C);
        System.out.println(EquipmentBase.StrValues.D);
        System.out.println(EquipmentBase.StrValues.E);

        Scanner consoleChooseTypeEq = new Scanner(System.in);
        System.out.print("Your choice: ");
        String chooseType = consoleChooseTypeEq.nextLine();

        switch (Integer.parseInt(chooseType)) {
            case 1 -> addToHead();
            case 2 -> addToBody();
            case 3 -> addToLegs();
            default -> System.out.print("Recheck the entered choice");
        }
        toMenu();
    }
    private static void addToHead() {
        System.out.println("\n---Add new equipment for head---");
        System.out.print("Equipment name: ");

        Scanner console = new Scanner(System.in);
        String newName = console.nextLine();

        System.out.print("Equipment price: ");
        String newPrice = console.nextLine();

        System.out.print("Equipment weight: ");
        String newWeight = console.nextLine();

        eqH = new HeadEquipment(newName,Double.parseDouble(newPrice),Double.parseDouble(newWeight));
        headEquipment.add(eqH);
        System.out.println(eqH.getName() + " is now in the catalog!\n");
    }
    private static void addToBody() {
        System.out.println("\n---Add new equipment for body---");
        System.out.print("Equipment name: ");

        Scanner console = new Scanner(System.in);
        String newName = console.nextLine();

        System.out.print("Equipment price: ");
        String newPrice = console.nextLine();

        System.out.print("Equipment weight: ");
        String newWeight = console.nextLine();

        eqB = new BodyEquipment(newName,Double.parseDouble(newPrice),Double.parseDouble(newWeight));
        bodyEquipment.add(eqB);
        System.out.println(eqB.getName() + " is now in the catalog!\n");
    }
    private static void addToLegs() {
        System.out.println("\n---Add new equipment for legs---");
        System.out.print("Equipment name: ");

        Scanner console = new Scanner(System.in);
        String newName = console.nextLine();

        System.out.print("Equipment price: ");
        String newPrice = console.nextLine();

        System.out.print("Equipment weight: ");
        String newWeight = console.nextLine();

        eqL = new LegsEquipment(newName,Double.parseDouble(newPrice),Double.parseDouble(newWeight));
        legsEquipment.add(eqL);
        System.out.println(eqL.getName() + " is now in the catalog!\n");
    }
}

