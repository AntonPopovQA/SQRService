import org.example.SQRServicemvn.services.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int underLimit = 100; // начальная граница
        int overLimit = 500; // конечная граница

        int amount = service.calcSqrt(underLimit, overLimit); // количество чисел в квадрате попавших в диапазон
        System.out.println(amount);
    }
}
