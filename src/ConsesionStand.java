import java.util.Scanner;

public class ConsesionStand {
    public static void food() {
        Scanner input = new Scanner( System.in );
        System.out.println( "Welcome to the Concession stand!" );
        System.out.println( "What would you like to buy?" );
        System.out.println( "pop" );
        System.out.println( "water" );
        System.out.println( "peanuts" );
        System.out.println( "popcorn" );
        System.out.println( "churro" );
        String text = input.nextLine();
        switch (text){
            case "pop":
                wallet.setWallet( wallet.getWallet()-3 );
                System.out.print( "The pop was 3 dollars. You have " + wallet.getWallet() + " dollars left." );
                break;
            case "water":
                wallet.setWallet( wallet.getWallet() - 2 );
                System.out.println( "The water was 2 dollars, you now have "+ wallet.getWallet() + " dollars left.");
                break;
            case"popcorn":
                wallet.setWallet( wallet.getWallet() - 2 );
                System.out.println( "The popcorn was 2 dollars, you now have "+ wallet.getWallet() + " dollars left." );
                break;
            case"peanuts":
                wallet.setWallet( wallet.getWallet() - 5 );
                System.out.println( "The peanuts were 5 dollars, you now have "+ wallet.getWallet() + " dollars left." );
                break;
            case"churro":
                System.out.println( "Were fresh out of those sorry!" );
                break;
            default: System.out.println( "We dont have that sorry" );
    }
}
}
