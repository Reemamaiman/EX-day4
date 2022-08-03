package Day4;

public class EX2 {

        public static void getNumber(int number) {
            if (number % 5 != 0)
                throw new ArithmeticException("Number Is Not Divided By 5");;
        }

        public static void main(String[] args) {


            try {
                getNumber(6);
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }

    }



