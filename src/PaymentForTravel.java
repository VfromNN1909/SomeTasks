public class PaymentForTravel {
    public static void main(String[] args) {
        short n = Short.parseShort(System.console().readLine());
        switch (n) {
            case 28:
            case 45:
                System.out.println("5");
                break;
            case 55:
                System.out.println("6");
                break;
            default:
                System.out.println("Wrong sum!");
                break;


        }
    }
}
