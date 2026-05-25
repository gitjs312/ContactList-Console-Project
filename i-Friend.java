import java.util.Scanner;

class iFriend {

    public final static void clearConsole() {

    try {

        final String os = System.getProperty("os.name");

        if (os.contains("Windows")) {

            new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();

        } else {

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

    } catch (final Exception e) {

        e.printStackTrace();

        // Handle any exceptions
    }
}

    public static void AddContact() {
        System.out.println("-----------------Add Contact-----------------");
        Scanner input = new Scanner(System.in);
    
        System.out.println("Name: ");
        String name = input.nextLine();
    
        //phone number to be validated.should start with 0.must have 10 digits.if not dispaly message as invalid phone number and keep prompt until he enters valid number
        System.out.println("Phone Number: ");
        String phoneNumber = input.nextLine();
        
    
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+-------------------------------------------+");
        System.out.println("|========I FRIEND CONTACT ORGANIZER=========|");
        System.out.println("+-------------------------------------------+");
        System.out.println("[01] Add Contact");
        System.out.println("[02] Update Contact");
        System.out.println("[03] Delete Contact");
        System.out.println("[04] Search Contacts");
        System.out.println("[05] List Contacts");
        System.out.println("[06] Exit");

        System.out.println("Enter an option to continue = ");
        int option = input.nextInt();
        clearConsole();

            switch (option) {
                case 1:
                    
                    AddContact();
                    break;
                case 2:
                    System.out.println("Update Contact");
                    break;
                case 3:
                    System.out.println("Delete Contact");
                    break;
                case 4:
                    System.out.println("Search Contacts");
                    break;
                case 5:
                    System.out.println("List Contacts");
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
    }
}