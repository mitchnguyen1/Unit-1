
import java.util.*;

public class FindingList {
    public FindingList() throws InterruptedException {
        storingSamples();
        fossils();
        supplyList();
    }

    public static void storingSamples() throws InterruptedException {
        ArrayList<String> rock = new ArrayList<>();
        rock.add("rock");
        rock.add("weird rock");
        rock.add("smooth rock");
        rock.add("not rock");

        Thread.sleep(500);
        System.out.println("\nWelcome Back :)");
        Thread.sleep(1000);
        System.out.println("Downloading Rock Samples....");
        Thread.sleep(1500);

        System.out.println("Download complete!"
                + "\n\nHere's your list of rocks:\n"
                + rock);
        Thread.sleep(750);
        System.out.println("\nRemoving none rocks....");
        Thread.sleep(750);
        rock.remove("not rock");
        System.out.println("\nYour new list:\n" + rock);
    }

    public static void fossils() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Thread.sleep(750);
        HashMap<String,String> fossil = new HashMap<>();
        fossil.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossil.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossil.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("\nDownloading Fossil Data....");
        Thread.sleep(1000);
        System.out.println("Fossil Data Downloaded");

        System.out.println("\nWhich of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        String input = scan.nextLine();
        //capitalize the first letter to get from hashmap
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println("Description: "+fossil.get(output+" Fossil"));

    }

    public static void supplyList() throws InterruptedException {
        Thread.sleep(750);
        HashSet<String> set = new HashSet<>();
        set.add("Duct Tape");
        set.add("Radio");
        set.add("Flash Light");
        System.out.println("\nSupplies Before Expedition");
        for (String item : set) {
            System.out.println(item);
        }

        Thread.sleep(750);
        System.out.println("\nSupplies After Expedition");
        set.remove("Duct Tape");
        for (String item : set) {
            System.out.println(item);
        }
    }

}
