package be.vdab;

public class GenericUtility {
    public static void main(String[] args) {
        System.out.println(GenericUtility.isEqualTo(new Object(), new Object()));
        System.out.println(GenericUtility.isEqualTo("test", "test"));
        System.out.println(GenericUtility.isEqualTo(5, 5));
        System.out.println(GenericUtility.isEqualTo(2.5, 3.7));
        System.out.println(GenericUtility.isEqualTo("2", 2));
    }

    public static <E> boolean isEqualTo(E a, E b) {
        return a.equals(b);
    }

}