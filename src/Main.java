public class Main {

    public static void main(String[] args) {
        // 1 task
        String firstTask = "Bob";
        System.out.println(helloName(firstTask));
        // 2 task
        String secondTask1 = "Hello";
        String secondTask2 = "Java";
        System.out.println(makeAbba(secondTask1,secondTask2));
        // 3 task
        String thirdA = "Java";
        String thirdB = "Hello";
        System.out.println(nonStart(thirdB, thirdA));
        // 4 task
        String firthTask = "badly";
        System.out.println(endsLy(firthTask));

    }
    public static String helloName(String name) {
        return "Hello " + name + "!";

    }
    public static String makeAbba (String a, String b) {
        return a + b + b + a;
    }

    public static String nonStart(String a, String b) {
        String first = a.substring(1);
        String second = b.substring(1);
        String third  = first.concat(second);
        return third;

    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }





}