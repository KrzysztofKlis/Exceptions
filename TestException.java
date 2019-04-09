package TestExceptions;

class TestException {
    static void some() {
        throw new MyRuntimeExc("this is my exception");
    }

    static class MyRuntimeExc extends RuntimeException {

        MyRuntimeExc(String message) {
            super(message);
        }

        MyRuntimeExc(String message, Throwable cause) {
            super(message, cause);
        }
    }

    static class MyCompiletimeExc extends Exception {

        MyCompiletimeExc(String message) {
            super(message);
        }

        MyCompiletimeExc(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
