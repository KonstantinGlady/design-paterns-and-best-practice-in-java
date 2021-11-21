package company.chapter2.singleton;

public class Main {
    public static void main(String[] args) {

        LockFreeSingleton lockFreeSingleton = LockFreeSingleton.getInstance();
        lockFreeSingleton.doSomething();
    }
}
