public class wallet {
    public static int wallet = 100;
    static void setWallet(int w) {
        wallet = w;
    }

    static int getWallet(){
        return wallet;
    }

    public void addWallet(int w){
        wallet = wallet + w;
    }



}
