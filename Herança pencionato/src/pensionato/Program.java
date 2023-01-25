package pensionato;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
  public static void main(String[] args) {
    
    Scanner inString = new Scanner(System.in);
    Scanner inNumber = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    System.out.println("How many rooms will be rented? ");
    int n = inNumber.nextInt();
    

    List<Client> client = new ArrayList<Client>();
    Integer[] rooms = new Integer[10];
    for (int i = 0; i < n; i++) {
    System.out.println("Rent #"+(i+1));
    System.out.print("Name: ");
    String name = inString.nextLine();
    System.out.print("E-mail: ");
    String email = inString.nextLine();
    System.out.print("Room: ");
    Integer room = inNumber.nextInt();
    	if(room >= 10 ){
    		System.out.println("select an room between 0-9");
    		i = i - 1;
    	}else if (rooms[room] != null) {
    		System.out.println("This room is already taken.");
    		i = i - 1;
    	}else{
    		client.add(new Client(name, email, room));
    		rooms[room] = room;
    		System.out.println("Room is taken.");
    	}
    }
    
    System.out.println();
    
    client.sort(Comparator.comparing(Client::getRoom));
    Client[] clients = new Client[client.size()];
    client.toArray(clients);
    
    System.out.println("Busy rooms");
    
    for (int i = 0; i < clients.length; i++) {
		System.out.println(clients[i]);
	}
    
    inString.close();
    inNumber.close();
  }
}
