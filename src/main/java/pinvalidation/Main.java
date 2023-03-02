package pinvalidation;

public class Main {
    public static void main( String[] args )
    {
    System.out.println( "Hello there!" );
    String pin = "1234";
    ValidatePin p = new ValidatePin();
    System.out.println("pin validation returns: "+ ValidatePin.validatePin(pin));
}


}
