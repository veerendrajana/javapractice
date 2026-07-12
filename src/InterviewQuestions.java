class StaleElementReferenceException extends RuntimeException {
    public StaleElementReferenceException(String message) {
        super(message);
    }
}

public class InterviewQuestions {
    public static void main(String[] args) {
        int a = 10;

        try {
            methodWhichThrowsException();
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (StaleElementReferenceException e) {
            System.out.println("Caught a StaleElementReferenceException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void methodWhichThrowsException() {
        // This method will throw a NullPointerException for demonstration purposes
        String str = null;
        System.out.println(str.length()); // This will throw NullPointerException
    }
}