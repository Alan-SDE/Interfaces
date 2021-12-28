public class Main {

    public static void main(String[] args) {
        ITelephone alansPhone;
        alansPhone = new DeskPhone(123456);
        alansPhone.powerOn();
        alansPhone.callPhone(123456);
        alansPhone.answer();

        alansPhone = new MobilePhone(24565);
        alansPhone.powerOn();
        alansPhone.callPhone(24565);
        alansPhone.answer();


    }
}
