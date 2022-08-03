package Day4;

    public class EX1 {

        public static void main(String[] args) {

            int[] arr = new int[7];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            arr[4] = 1;
            arr[5] = 1;
            arr[6] = 1;

            try {
                System.out.println(arr[7]);
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }

    }


