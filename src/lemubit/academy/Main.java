package lemubit.academy;

public class Main {

    public static void main(String[] args) {

        var store = new Store(77);
        var store2 = new Store(90);

        operateNum(Store::size, store2);

    }

    static void operateNum(Operation op, Store store) {
        op.execute(store);
    }

    interface Operation {
        void execute(Store store);
    }
}
