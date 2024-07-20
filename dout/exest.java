public class Example {

    public static void main(String[] args) {
        Example example = new Example();
        boolean operationStatus = example.performOperation();
        System.out.println("Operation status: " + operationStatus);
    }

    public boolean performOperation() {
        boolean status;
        // Perform some operations
        try {
            // Assume some operation is performed here
            status = true;  // Operation succeeded
        } catch (Exception e) {
            status = false; // Operation failed
        }
        return status;
    }
}
