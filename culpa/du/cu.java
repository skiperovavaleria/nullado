public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // private constructor to prevent instantiation
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
