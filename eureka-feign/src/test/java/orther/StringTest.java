package orther;

import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author: Oliver.li
 * @Description:
 * @date: 2017/8/24 11:04
 */
public class StringTest {

    @Test
    public void testDelimit(){

        String str = "aa,bb,dd,ss";

        String[] strings = StringUtils.delimitedListToStringArray(str, ",");

        System.out.println(Arrays.toString(strings));

    }

}
