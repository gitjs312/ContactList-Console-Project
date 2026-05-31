import java.util.Scanner;


class iFriend {

    public static String[] customerCodeArray = new String[0];
    public static String[] nameArray = new String[0];
    public static String[] phoneNumberArray = new String[0];
    public static String [] companyNameArray = new String[0];
    public static Double [] salaryArray = new Double[0];
    public static String [] birthDayArray = new String[0];

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

    } 
    catch (final Exception e) {

        e.printStackTrace();

        // Handle any exceptions
    }
}

//sort the contacts by name in alphabatical order
public static void sortByName() {
    for (int i = 0; i < nameArray.length - 1; i++) {
        for (int j = 0; j < nameArray.length - i - 1; j++) {
            if (nameArray[j].compareToIgnoreCase(nameArray[j + 1]) > 0) {
                //swap the values of the arrays
                String tempCustomerCode = customerCodeArray[j];
                String tempName = nameArray[j];
                String tempPhoneNumber = phoneNumberArray[j];
                String tempCompanyName = companyNameArray[j];
                Double tempSalary = salaryArray[j];
                String tempBirthDay = birthDayArray[j];

                customerCodeArray[j] = customerCodeArray[j + 1];
                nameArray[j] = nameArray[j + 1];
                phoneNumberArray[j] = phoneNumberArray[j + 1];
                companyNameArray[j] = companyNameArray[j + 1];
                salaryArray[j] = salaryArray[j + 1];
                birthDayArray[j] = birthDayArray[j + 1];

                customerCodeArray[j + 1] = tempCustomerCode;
                nameArray[j + 1] = tempName;
                phoneNumberArray[j + 1] = tempPhoneNumber;
                companyNameArray[j + 1] = tempCompanyName;
                salaryArray[j + 1] = tempSalary;
                birthDayArray[j + 1] = tempBirthDay;
            }
        }
    }

                //print the whole array of all contacts after sorting
                for (int k = 0; k < customerCodeArray.length; k++) {
                    System.out.println("Customer Code: " + customerCodeArray[k]);
                    System.out.println("Name: " + nameArray[k]);
                    System.out.println("Phone Number: " + phoneNumberArray[k]);
                    System.out.println("Company Name: " + companyNameArray[k]);
                    System.out.println("Salary: " + salaryArray[k]);
                    System.out.println("Birth Day: " + birthDayArray[k]);
                    System.out.println("-------------------------------------------");
                
            
        
    }
    System.out.println("Do you want to go back to the home page? (Y/N) = ");
    Scanner input = new Scanner(System.in);
    char ch = input.next().charAt(0);
    if(ch == 'Y' || ch == 'y') {
        clearConsole();
        HomePage();
    } 
    else {
        clearConsole();
        ListContacts();
    }
}

//sort by salary in ascending order
public static void sortBySalary() {
    for (int i = 0; i < salaryArray.length - 1; i++) {
        for (int j = 0; j < salaryArray.length - i - 1; j++) {
            if (salaryArray[j] > salaryArray[j + 1]) {
                //swap the values of the arrays
                String tempCustomerCode = customerCodeArray[j];
                String tempName = nameArray[j];
                String tempPhoneNumber = phoneNumberArray[j];
                String tempCompanyName = companyNameArray[j];
                Double tempSalary = salaryArray[j];
                String tempBirthDay = birthDayArray[j];

                customerCodeArray[j] = customerCodeArray[j + 1];
                nameArray[j] = nameArray[j + 1];
                phoneNumberArray[j] = phoneNumberArray[j + 1];
                companyNameArray[j] = companyNameArray[j + 1];
                salaryArray[j] = salaryArray[j + 1];
                birthDayArray[j] = birthDayArray[j + 1];

                customerCodeArray[j + 1] = tempCustomerCode;
                nameArray[j + 1] = tempName;
                phoneNumberArray[j + 1] = tempPhoneNumber;
                companyNameArray[j + 1] = tempCompanyName;
                salaryArray[j + 1] = tempSalary;
                birthDayArray[j + 1] = tempBirthDay;
            }
        }
    }
                

               //print the whole array of all contacts after sorting
                for (int k = 0; k < customerCodeArray.length; k++) {
                    System.out.println("Customer Code: " + customerCodeArray[k]);
                    System.out.println("Name: " + nameArray[k]);
                    System.out.println("Phone Number: " + phoneNumberArray[k]);
                    System.out.println("Company Name: " + companyNameArray[k]);
                    System.out.println("Salary: " + salaryArray[k]);
                    System.out.println("Birth Day: " + birthDayArray[k]);
                    System.out.println("-------------------------------------------");
                
            
          
    }
    System.out.println("Do you want to go back to the home page? (Y/N) = ");
    Scanner input = new Scanner(System.in);
    char ch = input.next().charAt(0);
    if(ch == 'Y' || ch == 'y') {
        clearConsole();
        HomePage();
    } 
    else {
        clearConsole();
        ListContacts();
    }
        
}

//sort by birth day in ascending order
public static void sortByBirthDay() {
    for (int i = 0; i < birthDayArray.length - 1; i++) {
        for (int j = 0; j < birthDayArray.length - i - 1; j++) {
            if (birthDayArray[j].compareToIgnoreCase(birthDayArray[j + 1]) > 0) {
                //swap the values of the arrays
                String tempCustomerCode = customerCodeArray[j];
                String tempName = nameArray[j];
                String tempPhoneNumber = phoneNumberArray[j];
                String tempCompanyName = companyNameArray[j];
                Double tempSalary = salaryArray[j];
                String tempBirthDay = birthDayArray[j];

                customerCodeArray[j] = customerCodeArray[j + 1];
                nameArray[j] = nameArray[j + 1];
                phoneNumberArray[j] = phoneNumberArray[j + 1];
                companyNameArray[j] = companyNameArray[j + 1];
                salaryArray[j] = salaryArray[j + 1];
                birthDayArray[j] = birthDayArray[j + 1];

                customerCodeArray[j + 1] = tempCustomerCode;
                nameArray[j + 1] = tempName;
                phoneNumberArray[j + 1] = tempPhoneNumber;
                companyNameArray[j + 1] = tempCompanyName;
                salaryArray[j + 1] = tempSalary;
                birthDayArray[j + 1] = tempBirthDay;
            }
        }
    }
                //print the whole array of all contacts after sorting
                for (int k = 0; k < customerCodeArray.length; k++) {
                    System.out.println("Customer Code: " + customerCodeArray[k]);
                    System.out.println("Name: " + nameArray[k]);
                    System.out.println("Phone Number: " + phoneNumberArray[k]);
                    System.out.println("Company Name: " + companyNameArray[k]);
                    System.out.println("Salary: " + salaryArray[k]);
                    System.out.println("Birth Day: " + birthDayArray[k]);
                    System.out.println("-------------------------------------------");
                
            
        
    }
    System.out.println("Do you want to go back to the home page? (Y/N) = ");
    Scanner input = new Scanner(System.in);
    char ch = input.next().charAt(0);
    if(ch == 'Y' || ch == 'y') {
        clearConsole();
        HomePage();
    } 
    else {
        clearConsole();
        ListContacts();
    }
}
    

//delete the contact by his name or phone number
public static void deleteContact() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the name or phone number  of the contact you want to delete = ");
    String searchValue = input.nextLine();
    for (int i = 0; i < customerCodeArray.length; i++) {
        if(nameArray[i].equalsIgnoreCase(searchValue) || phoneNumberArray[i].equalsIgnoreCase(searchValue) || customerCodeArray[i].equalsIgnoreCase(searchValue)) {
            //delete the contact by setting the values to null
            customerCodeArray[i] = null;
            nameArray[i] = null;
            phoneNumberArray[i] = null;
            companyNameArray[i] = null;
            salaryArray[i] = null;
            birthDayArray[i] = null;
            System.out.println("Contact deleted successfully!");
        }
    }
}

//updateName function's method declaration
public static void updateName() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the old name = ");
    String oldName = input.nextLine();
    for (int i = 0; i < nameArray.length; i++) {
        if(nameArray[i].equalsIgnoreCase(oldName)) {
            System.out.println("Enter the new name = ");
            String newName = input.nextLine();
            nameArray[i] = newName;
            System.out.println("Name updated successfully!");
        }
    }
    System.out.println("Do you want to update another contact? (Y/N) = ");
    char ch = input.next().charAt(0);
    if(ch == 'Y' || ch == 'y') {
        clearConsole();
        UpdateContact();
    } 
    else {
        clearConsole();
        HomePage();
    }
}
//updatePhoneNumber function's method declaration
public static void updatePhoneNumber() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the old phone number = ");
    String oldPhoneNumber = input.nextLine();
    for (int i = 0; i < phoneNumberArray.length; i++) {
        if(phoneNumberArray[i].equalsIgnoreCase(oldPhoneNumber)) {
            System.out.println("Enter the new phone number = ");
            String newPhoneNumber = input.nextLine();
            phoneNumberArray[i] = newPhoneNumber;
            System.out.println("Phone number updated successfully!");
        }
    }
    System.out.println("Do you want to update another contact? (Y/N) = ");
    char ch = input.next().charAt(0);
    if(ch == 'Y' || ch == 'y') {
        clearConsole();
        UpdateContact();
    } 
    else {
        clearConsole();
        HomePage();
    }
}

//updateCompanyName function's method declaration
public static void updateCompanyName() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the old company name = ");
    String oldCompanyName = input.nextLine();
    for (int i = 0; i < companyNameArray.length; i++) {
        if(companyNameArray[i].equalsIgnoreCase(oldCompanyName)) {
            System.out.println("Enter the new company name = ");
            String newCompanyName = input.nextLine();
            companyNameArray[i] = newCompanyName;
            System.out.println("Company name updated successfully!");
        }
    }
    System.out.println("Do you want to update another contact? (Y/N) = ");
    char ch = input.next().charAt(0);
    if(ch == 'Y' || ch == 'y') {
        clearConsole();
        UpdateContact();
    } 
    else {
        clearConsole();
        HomePage();
    }
}

//updateSalary function's method declaration
public static void updateSalary() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the old salary = ");
    Double oldSalary = input.nextDouble();
    for (int i = 0; i < salaryArray.length; i++) {
        if(salaryArray[i].equals(oldSalary)) {
            System.out.println("Enter the new salary = ");
            Double newSalary = input.nextDouble();
            salaryArray[i] = newSalary;
            System.out.println("Salary updated successfully!");
        }
    }
    System.out.println("Do you want to update another contact? (Y/N) = ");
    char ch = input.next().charAt(0);
    if(ch == 'Y' || ch == 'y') {
        clearConsole();
        UpdateContact();
    } 
    else {
        clearConsole();
        HomePage();
    }
}

//searching user by his name or phone number
public static void startSearchingContact() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the name or phone number or tha name you want to search: ");
    String searchQuery = input.nextLine();
    for(int i=0;i<customerCodeArray.length;i++) {
        if(nameArray[i].equalsIgnoreCase(searchQuery) || phoneNumberArray[i].equalsIgnoreCase(searchQuery)) {
            System.out.println("Customer Code: " + customerCodeArray[i]);
            System.out.println("Name: " + nameArray[i]);
            System.out.println("Phone Number: " + phoneNumberArray[i]);
            System.out.println("Company Name: " + companyNameArray[i]);
            System.out.println("Salary: " + salaryArray[i]);
            System.out.println("Birth Day: " + birthDayArray[i]);
            System.out.println("-------------------------------------------");
           
        }
        
    }
    
   
}

    public static void ExtendArray() {
       String [] tempCustomerCodeArray = new String[customerCodeArray.length + 1];
       String [] tempNameArray = new String[nameArray.length + 1];
       String [] tempPhoneNumberArray = new String[phoneNumberArray.length + 1];
       String [] tempCompanyNameArray = new String[companyNameArray.length + 1];
       Double [] tempSalaryArray = new Double[salaryArray.length + 1];
       String [] tempBirthDayArray = new String[birthDayArray.length + 1];

       //extend the new array by copying the old array length and extending it by 1
       for (int i = 0; i < customerCodeArray.length; i++) {
        tempCustomerCodeArray[i] = customerCodeArray[i];
        tempNameArray[i] = nameArray[i];
        tempPhoneNumberArray[i] = phoneNumberArray[i];
        tempCompanyNameArray[i] = companyNameArray[i];
        tempSalaryArray[i] = salaryArray[i];
        tempBirthDayArray[i] = birthDayArray[i];
       }

       //get the values of the tempArray to the Arrays
       customerCodeArray = tempCustomerCodeArray;
       nameArray = tempNameArray;
       phoneNumberArray = tempPhoneNumberArray;
       companyNameArray = tempCompanyNameArray;
       salaryArray = tempSalaryArray;
       birthDayArray = tempBirthDayArray;
    }



    public static void AddContact() {
        System.out.println("-----------------Add Contact-----------------");
        //generate a customer id as C0001,C0002,C0003 and so on
        String customerCode = "C" + String.format("%04d", customerCodeArray.length + 1);
        System.out.println("Customer Code: " + customerCode);
        //get name, phone number, company name, salary and birth day from user input
        Scanner input = new Scanner(System.in);

        System.out.println("Name: ");
        String name = input.nextLine();

        System.out.println("Phone Number: ");
        String phoneNumber = input.nextLine();
        //phone number should be 10 digits and start with 0
        while(phoneNumber.length() != 10 || !phoneNumber.startsWith("0")) {
            System.out.println("Invalid phone number. Please enter a valid phone number: ");
            phoneNumber = input.nextLine();
        }

        System.out.println("Company Name: ");
        String companyName = input.nextLine();

        System.out.println("Salary: ");
        Double salary = input.nextDouble();
        //salary should be a positive number
        while(salary < 0) {
            System.out.println("Invalid salary. Please enter a valid salary: ");
            salary = input.nextDouble();
        }

        System.out.println("Birth Day: ");
        String birthDay = input.next();
        //birthday should be YY-MM-DD format and it should not be a future date
        

        while (!birthDay.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.print("Invalid format. Enter YYYY-MM-DD: ");
            birthDay = input.next();
        }

       ExtendArray();
       //add the values to the arrays
       customerCodeArray[customerCodeArray.length - 1] = customerCode;
       nameArray[nameArray.length - 1] = name;
       phoneNumberArray[phoneNumberArray.length - 1] = phoneNumber;
       companyNameArray[companyNameArray.length - 1] = companyName;
       salaryArray[salaryArray.length - 1] = salary;
       birthDayArray[birthDayArray.length - 1] = birthDay;

       System.out.println("Contact added successfully!");
       System.out.println("Do you want to add another contact? (Y/N) = "); 
       char ch = input.next().charAt(0);
       if(ch == 'Y' || ch == 'y') {
        clearConsole();
        AddContact();
       } 
       else {
        clearConsole();
        HomePage();
       }

    }

    public static void displayContact() {
        System.out.println("-----------------Display Contact-----------------");
        for (int i = 0; i < customerCodeArray.length; i++) {
            System.out.println("Customer Code: " + customerCodeArray[i]);
            System.out.println("Name: " + nameArray[i]);
            System.out.println("Phone Number: " + phoneNumberArray[i]);
            System.out.println("Company Name: " + companyNameArray[i]);
            System.out.println("Salary: " + salaryArray[i]);
            System.out.println("Birth Day: " + birthDayArray[i]);
            System.out.println("-------------------------------------------");
        }
        System.out.println("Do you want to go back to the home page? (Y/N) = ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(ch == 'Y' || ch == 'y') {
            clearConsole();
            HomePage();
        } 
        else {
            clearConsole();
            displayContact();
        }
    }

    public static void UpdateContact() {

        
        System.out.println("-----------------Update Contact-----------------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("give the name or phone number of your current details = ");
        String searchValue = input.nextLine();
        boolean found = false;

        for (int i = 0; i < customerCodeArray.length; i++) {
            if(nameArray[i].equalsIgnoreCase(searchValue) || phoneNumberArray[i].equalsIgnoreCase(searchValue)) {
                found = true;
                System.out.println("Customer Code: " + customerCodeArray[i]);
                System.out.println("Name: " + nameArray[i]);
                System.out.println("Phone Number: " + phoneNumberArray[i]);
                System.out.println("Company Name: " + companyNameArray[i]);
                System.out.println("Salary: " + salaryArray[i]);
                System.out.println("Birth Day: " + birthDayArray[i]);
                System.out.println("\n-------------------------------------------\n");
               
                System.out.println("[01] Name");
                System.out.println("[02] phone Number");
                System.out.println("[03] Company Name");
                System.out.println("[04] Salary");
                System.out.println("\nwhat do you want to update = ");
                
                //use switch option to select what user want to update
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        updateName();
                        break;
                    case 2:
                        updatePhoneNumber();
                        break;
                    case 3:
                        updateCompanyName();
                        break;
                    case 4:
                        updateSalary();
                        break;
                }
            }
        }
        if(!found) {
            System.out.println("Contact not found. you try again or go to main menu...");
            System.out.println("Do you want to try again? (Y/N) = ");
            char ch = input.next().charAt(0);
            if(ch == 'Y' || ch == 'y') {
                UpdateContact();
            }
            else {
                HomePage();
            }
        }

    }
    public static void DeleteContact() {
        System.out.println("-----------------Delete Contact-----------------\n");
        startSearchingContact();
        System.out.println("Do you want to delete this contact? (Y/N) = ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(ch == 'Y' || ch == 'y') {
            deleteContact();
        }
        else {
            System.out.println("You will be redirected to the home page...");
            clearConsole();
            HomePage();
        }
       
       
        
       
    }
    public static void SearchContact() {
        System.out.println("-----------------Search Contact-----------------");
        startSearchingContact();
        System.out.print("Do you want to search another contact? (Y/N) = ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(ch == 'Y' || ch == 'y') {
            SearchContact();
        }
        else {
            clearConsole();
            HomePage();
        }
    }
    public static void ListContacts() {
        System.out.println("-----------------List Contacts / sort contacts-----------------\n");
        System.out.println("[01] Sort by Name");
        System.out.println("[02] Sort by salary");
        System.out.println("[03] Sort by birth day");
        System.out.println("how do you want to sort the contacts = ");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch(option){
            case 1:
                sortByName();
                break;
            case 2:
                sortBySalary();
                break;
            case 3:
                sortByBirthDay();
                break;
        }
           
    }
       




       

    public static void main(String[] args) {
        HomePage();
    }
    public static void HomePage() {

        Scanner input = new Scanner(System.in);

        System.out.println("\n\n\n+-------------------------------------------+");
        System.out.println("|========I FRIEND CONTACT ORGANIZER=========|");
        System.out.println("+-------------------------------------------+");
        System.out.println("[01] Add Contact");
        System.out.println("[02] Display Contact");
        System.out.println("[03] Update Contact");
        System.out.println("[04] Delete Contact");
        System.out.println("[05] Search Contacts");
        System.out.println("[06] List Contacts");
        System.out.println("[07] Exit");

        System.out.print("Enter an option to continue = ");
        int option = input.nextInt();
        clearConsole();

            switch (option) {
                case 1:
                    
                    AddContact();
                    break;
                case 2:
                    displayContact();
                    break;
                case 3:
                    UpdateContact();
                    break;
                case 4:
                    DeleteContact();
                    break;
                case 5:
                    SearchContact();
                    break;
                case 6:
                    ListContacts();
                    break;
                case 7:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
    }
}
