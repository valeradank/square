import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class TESTsqr {
    @ParameterizedTest
    @CsvSource({
            "10,200,5",
            "100,1000,22",
            "1000,10000,68"
    })
    public void testSquare(int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(min, max);
        Assertions.assertEquals(expected, actual);


    }

}
