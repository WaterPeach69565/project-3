package weekFourteen;

public class recursion {

    public static void countdown(int current){
        System.out.println(current+"...");
        if (current != 1) {
            countdown(current - 1);
        }
        if(current == 1){
            System.out.println("Go!");
        }

    }
    public static void reversealphabet(char current){
        System.out.println(current);
        if (current != 'a') {
            reversealphabet((char) (current - 1));
        }

    }

}
