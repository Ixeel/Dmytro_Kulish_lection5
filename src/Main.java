public class Main {
    public static void main(String[] args) {
        //Task 5.1
        checkAge(18);

        //Task 5.2
        boolean result = isPerfectSquare(121);
        System.out.println(result);

        //Task 5.3
        calculateSumUpToN(3);

        //Task 5.4
        getGrade(5);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Ви не є дорослою особою");
        } else {
            System.out.println("Ви доросла особа");
        }
    }

    public static boolean isPerfectSquare(int number) {
        int root = (int) Math.sqrt((number));
        return root * root == number;
    }

    public static void calculateSumUpToN(int number) {
        if (number < 1){
            System.out.println("Хибні вхідні параметри");
        }
        else{
            int sum = 0;
            for (int i = 1; i<number+1; i++){
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Сума чисел від 1 до "+number+" = "+sum);
        }
    }

    public static void getGrade(int number) {
        switch (number){
            case (1):
                System.out.println("Дуже Погано");
                break;
            case (2):
                System.out.println("Погано");
                break;
            case (3):
                System.out.println("Добре");
                break;
            case (4):
                System.out.println("Дуже добре");
                break;
            case (5):
                System.out.println("Відмінно");
                break;

            default:
                System.out.println("Неправильна оцінка");
        }
    }

}