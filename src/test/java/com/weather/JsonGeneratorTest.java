package com.weather;

import com.weather.field.FieldGeneratorFactory;
import com.weather.printer.FieldPrinter;
import com.weather.printer.GenericPrinter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class JsonGeneratorTest {

    FieldPrinter fieldPrinter;
    GenericPrinter genericPrinter;
    JsonGenerator generator = new StandardJsonGenerator(FieldGeneratorFactory.getFieldGenerators());

    @DisplayName("1. String Type")
    @Test
    void test1(){
        String json = generator.generate(StringType.class);

        assertThat(json).isEqualTo("{" +
                        "\"test\":\"String\"" +
                "}");
    }

    static class StringType{
        private String test;
    }

    @DisplayName("2. Integer Type")
    @Test
    void test2(){
        String json = generator.generate(IntegerType.class);

        assertThat(json).isEqualTo("{" +
                "\"test\":1" +
                "}");
    }

    static class IntegerType {
        private Integer test;
    }

    @DisplayName("3. Enum Type")
    @Test
    void test3(){
        String json = generator.generate(EnumType.class);

        assertThat(json).isEqualTo("{" +
                "\"test\":\"TYPE1\"" +
                "}");

    }

    static class EnumType{
        private TestEnum test;
    }

    static enum TestEnum{
        TYPE1,
        TYPE2;
    }

    @DisplayName("4. Collection Type")
    @Test
    void test4(){
        Field[] declaredFields = CollectionType.class.getDeclaredFields();
        Field declaredField = declaredFields[0];

    }

    static class CollectionType{
        private List<Integer> numbers;
    }
}