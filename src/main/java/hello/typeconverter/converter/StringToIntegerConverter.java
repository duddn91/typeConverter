package hello.typeconverter.converter;

import com.sun.jdi.IntegerValue;
import org.springframework.core.convert.converter.Converter;

public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        System.out.println("convert source = " + source);
        return Integer.valueOf(source);
    }
}
