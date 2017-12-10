package arthur;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void join(){

        String[] array = {"1","2","3"};
        System.out.println(StringUtils.join(array, "--"));
    }
}
