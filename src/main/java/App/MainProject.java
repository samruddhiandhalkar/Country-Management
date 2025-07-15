package App;

import java.util.List;
import java.util.Scanner;

import Entity1.CountryClass;
import ShowDetails.CountryDetails;

public class MainProject
{

	public static void main(String[] args)
	{
		try (Scanner scanner = new Scanner(System.in))
		{
			CountryDetails countryDet = new CountryDetails();
			

			while (true)
			{
			    System.out.println("\n=== Country Management Menu ===");
			    System.out.println("1. Add Country");
			    System.out.println("2. Update Country Capital");
			    System.out.println("3. Delete Country");
			    System.out.println("4. Show All Countries");
			    System.out.println("5. Update Country Population");
			    System.out.println("6. Exit");
			   
			    System.out.print("Enter your choice: ");
			    int choice = scanner.nextInt();
			    scanner.nextLine(); 

			    switch (choice) 
			    {
			        case 1:
			            CountryClass c = new CountryClass();
			            System.out.print("Enter Country ID: ");
			            c.setCountry_id(scanner.nextInt());
			            scanner.nextLine(); 
			            
			            System.out.print("Enter Country Name: ");
			            c.setCountryName(scanner.nextLine());

			            System.out.print("Enter Capital: ");
			            c.setCountry_capital(scanner.nextLine());

			            System.out.print("Enter Population: ");
			            c.setPopul(scanner.nextLong());

			            countryDet.showCountry(c);
			            System.out.println("✅ Country added successfully.");
			            break;

			        case 2:
			            System.out.print("Enter Country ID to update: ");
			            int updateId = scanner.nextInt();
			            scanner.nextLine();

			            System.out.print("Enter New Capital Name: ");
			            String newCapital = scanner.nextLine();

			            countryDet.updateCountry(updateId, newCapital);
			            break;

			        case 3:
			            System.out.print("Enter Country ID to delete: ");
			            int deleteId = scanner.nextInt();

			            countryDet.delConuntry(deleteId);
			            break;

			        case 4:
			            List<CountryClass> countries = countryDet.getAll();
			            for (CountryClass country : countries) 
			            {
			                System.out.println(country);
			            }
			            break;
			            
			        case 5: 
			   
			            System.out.print("Enter Country ID to update population: ");
			            int popId = scanner.nextInt();

			            System.out.print("Enter new population: ");
			            long newPop = scanner.nextLong();

			            countryDet.updatePopulation(popId, newPop);
			            break;
					    
			        case 6:
			            System.out.println("Exiting program...");
			            break;

			        default:
			            System.out.println(" Invalid choice. Try again.");
			    }
			}
		}
	}
}
