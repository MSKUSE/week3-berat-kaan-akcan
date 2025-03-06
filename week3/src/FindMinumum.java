public class FindMinumum {
    public static void main(String[] args) {

//        int num1 = Integer.parseInt(args[0]);
//        int num2 = Integer.parseInt(args[1]);
//        int num3 = Integer.parseInt(args[2]);
//
//        boolean min_num1 = num1 < num2 && num1 < num3;
//        boolean min_num2 = num2 < num1 && num2 < num3;
//        int miniumum = min_num1 ? num1:
//                                    min_num2 ? num2 : num3;
//        System.out.println(miniumum);


        int length_of_args = args.length;
        if (length_of_args == 3 ){

            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int number3 = Integer.parseInt(args[2]);
            if (number1 < number2) {
                if (number1 < number3) {
                    System.out.println(number1);
                }
            }
            else if (number2 < number1) {
                if(number2 < number3){
                    System.out.println(number2);
                }
            else {
                    System.out.println(number3);
                }
            }
        }
        else {
            System.out.println("You should give a 2 numbers!!!");
        }


    }
}
