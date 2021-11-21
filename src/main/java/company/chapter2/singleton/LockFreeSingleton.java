package company.chapter2.singleton;

public class LockFreeSingleton {
    private static final LockFreeSingleton instance = new LockFreeSingleton();

    private LockFreeSingleton() {
        System.out.println("Singleton is instantiated");
    }

    public static synchronized LockFreeSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("doing something");
    }
}
