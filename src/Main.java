public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long add = 600;
        long bonus;
        if (add / 100 >= 10) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        long total = balance + add + bonus;
        System.out.println("Your bonus is:");
        System.out.println(bonus);
        System.out.println("Your total score is:");
        System.out.println(total);
    }
}