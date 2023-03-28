public class Driver {
    private String level="level 1";
    private static String name="pooya";
    public class idemtify {
        public void identifier() {

            System.out.println("non static");
            System.out.println(level);
            System.out.println(name);


        }
    }
    public static class IdentifyStatic {
        public void identifierStatic() {
            System.out.println("static");
            //System.out.println(level);
            System.out.println(name);


        }
    }



}
