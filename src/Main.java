public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long add = 1000;
        long bonus = add / 100;
        if (bonus >= 10) {
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