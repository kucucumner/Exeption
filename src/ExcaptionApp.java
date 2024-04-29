public class ExcaptionApp {
    public static void main(String[] args) {
        System.out.println(1);
        // 배열
        int[] scores = {10, 20 ,30 };
        // 시도했는데 0 으로 나눴기 때문에 ArithmeticException 이 발생 그러면 catch 의 코드가 실행 후 나머지 코드 실행
        try {
            System.out.println(2);
            //System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2 / 0);
            System.out.println(4);

        }catch (ArithmeticException e){
                System.out.println("Error data"+e.getMessage());
            }

         catch (Exception e){
                System.out.println("Error"+e.getMessage());
        }
    }
}
