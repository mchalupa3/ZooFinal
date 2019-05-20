import java.util.Scanner;

public class shop {
    public static void shop(){
        Scanner input = new Scanner( System.in );
        System.out.println( "Welcome to the shop!" );
        System.out.println("What would you like to buy?");
        System.out.println( "T-Shirt" );
        System.out.println( "mug" );
        System.out.println( "Postcard" );
        System.out.println( "Jah Coins" );
        System.out.println( "Monkey" );
        System.out.println( "Ruler" );
        System.out.println( "Hat" );
        System.out.println( "Sweatshirt" );
        System.out.println( "Pants" );
        System.out.println( "The entire zoo" );
        System.out.println( "Nothing" );
        String text = input.nextLine();
        switch (text){
            case "t-shirt":
                wallet.setWallet( wallet.getWallet()-15 );
                System.out.print( "The shirt cost 15 dollars. You have " + wallet.getWallet() + " dollars left." );
            break;
            case "mug":
                wallet.setWallet( wallet.getWallet() - 10 );
                System.out.println( "The mug was 10 dollars, you now have "+ wallet.getWallet() + " dollars left.");
            break;
            case"postcard":
                wallet.setWallet( wallet.getWallet() - 2 );
                System.out.println( "The post card was 2 dollars, you now have "+ wallet.getWallet() + " dollars left." );
            break;
            case"jah coins":
                wallet.setWallet( wallet.getWallet() - 10 );
                System.out.println( "The jah coins were 20 dollars, you now have "+ wallet.getWallet() + " dollars left." );
            break;
            case"monkey":
                System.out.println( "You cant actually buy a monkey silly" );
            break;
            case"ruler":
                wallet.setWallet( wallet.getWallet()-5 );
                System.out.println( "The ruler was 5 dollars, you now have "+ wallet.getWallet() + " dollars left." );
            break;
            case"hat":
                wallet.setWallet( wallet.getWallet() - 15 );
                System.out.println( "The hat was 20 dollars, you now have "+ wallet.getWallet() + " dollars left." );
            break;
            case"Sweatshirt":
                wallet.setWallet( wallet.getWallet()-35 );
                System.out.println( "The sweatshirt was 35 dollars, you now have "+ wallet.getWallet() + " dollars left." );
            break;
            case"pants":
                wallet.setWallet( wallet.getWallet()-25  );
                System.out.println( "The pants were 25 dollars, you now have "+ wallet.getWallet() + " dollars left." );
            break;
            case"the entire zoo":
                System.out.println( "you cant actually buy the zoo dummy" );
            break;
            case"nothing":
                System.out.println( "They whyd you come here???" );
            break;
            default:System.out.println("That is not a valid answer");

        }
    }
}
