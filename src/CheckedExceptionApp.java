import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    public static void main(String[] args) {
        // 반드시 try를 통해서 어떤 조치를 해야 실행이 가능
        FileWriter f = null;
        try {
            f = new FileWriter("data.txt");
            f.write("Hello");
            // close 를 하기 전에 예외가 발생할 수 있기 때문에 finally 로 처리 해야한다.

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            // try 안에서만 선언된 f 이기에 실행이 불가하다. 즉 중괄호 밖에서 f 를 선언해야 한다.
            // try 에서 예외가 발생해서 코드가 실행이 안된다면 f 가 없는 상태이기 때문에 문제가 된다.
            // f 가 세팅이 되어있을때만 close 실행
            // 만약에 f 가 null 이 아니라면
            if(f != null){
                try {
                    f.close();
                } catch (IOException e){
                    e.printStackTrace();
                }

            }

        }
    }
}
