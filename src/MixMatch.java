public class MixMatch {
    public static void main(String[] args) {
        String sentence = "Hello World!";
        char character = 'A';
        short small = 127;
        int normal = 1000000;
        long bigger = 500000000;
        float decimal = 4.20f;
        double bigger_decimal = 3.141592653589;
        boolean bool = true;
        System.out.println(sentence + " <--String. Can store words or sentences");
        System.out.println(character + " <--char. Can store one character from the ascii table");
        System.out.println(small + " <--short. Takes up 2 bytes");
        System.out.println(normal + " <--int. Takes up 4 bytes");
        System.out.println(bigger + " <--long. Takes up 8 bytes");
        System.out.println(decimal + " <--float. Can store decimals");
        System.out.println(bigger_decimal + " <--double. Can store more precise decimals than float");
        System.out.println(bool + " <--boolean. Stores true or false");
    }
}