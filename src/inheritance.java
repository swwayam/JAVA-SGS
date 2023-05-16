class GrandFather{
    int acresOfLand;
    double bankBal;
    int numberOfApartments;

    public GrandFather(int land, double bal, int apt){
        this.acresOfLand = land;
        this.bankBal = bal;
        this.numberOfApartments = apt;
    }
}


class Father extends GrandFather{
    int stocks = 123213;
    int crypto = 12312;

    public Father(int bankBal,int numberOfApartments , int acresOfLand){
        super(bankBal, numberOfApartments, acresOfLand);
    }
    void getPropertyData(){
        System.out.println("You father has " + this.numberOfApartments + " Apartements , " + this.acresOfLand + " Acres of land and bank balance of " + this.bankBal );
        System.out.println("You father has " + this.stocks + " Value in stocks , " + this.crypto + " in cryptos");
    }

}



public class inheritance {
    public static void main(String[] args) {
        Father father1 = new Father(234,23,234);

        System.out.println(father1.numberOfApartments);
        System.out.println(father1.acresOfLand);
        System.out.println(father1.stocks);

        father1.getPropertyData();
    }
}
