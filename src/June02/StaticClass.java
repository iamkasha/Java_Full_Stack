package June02;

public class StaticClass {
    static int age;

    static int displayAge(int age) {
        return age;
    }

    static {
        age = displayAge(21);
    }


}
