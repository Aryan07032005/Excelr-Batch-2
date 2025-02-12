public class Demo24 {
    public static void main(String[] args) {
        String[][] friends = {
            {"Srujan", "7896655441","Chinthal"},
            {"Kowshik", "9876543210", "Nagole"},
            {"Vamshi", "8976543211", "Karimnagar"}
        };

        for (String[] friend : friends) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone Number: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println("----------------------");
        }
    }
}
