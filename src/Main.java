public class Main {

    public static void main(String[] args) {
        String firstTask = "Bob";
        System.out.println(helloName(firstTask));
        String secondTask1 = "Hello";
        String secondTask2 = "Java";
        System.out.println(makeAbba(secondTask1,secondTask2));

    }
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
    public static String makeAbba (String a, String b) {
        return a + b + b + a;
    }



}