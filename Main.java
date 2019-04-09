package TestExceptions;

public class Main {

    public static void main(String[] args) {
        try {
            other();
            System.out.println("main ofter method");
            throw new TestException.MyCompiletimeExc("");
        } catch (Exception ex) {    // FIXME 1
            System.out.println("main catch");
        } finally {
            System.out.println("main finally");
        }

        System.out.println("main after try-catch");
    }

    private static void other() {
        try {
            TestException.some();
        } catch (RuntimeException ex) {    // FIXME 2
            System.out.println("other catch");
        } finally {
            System.out.println("other finally");
        }

        System.out.println("other after try-catch");
    }



}