public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        boolean passed = actual == expected;

        System.out.println(passed);




//        long BonusBeLowLimitForRegistered = service.calculate(1000_60, true);
//        System.out.println(BonusBeLowLimitForRegistered);

        long BonusOverLimitForRegistered = service.calculate(1000_000_60, true);
        System.out.println(BonusOverLimitForRegistered);

        long BonusBeLowLimitForUnRegistered = service.calculate(1000_60, false);
        System.out.println(BonusBeLowLimitForUnRegistered);

        long BonusOverLimitForUnRegistered = service.calculate(1000_000_60, false);
        System.out.println(BonusOverLimitForUnRegistered);

        }

}
