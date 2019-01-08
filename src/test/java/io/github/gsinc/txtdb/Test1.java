package io.github.gsinc.txtdb;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test1 {

    @Test
    public void test_reads_resource() throws IOException {
        URL resource = Test1.class.getResource("data.txt");
        System.out.println(resource.toString());
        System.out.println(Resources.toString(resource, Charsets.UTF_8));
    }

    @Test
    public void test_do_processing() throws IOException {
        InputStream resourceAsStream = Test1.class.getResourceAsStream("data.txt");
        InputStreamReader irs = new InputStreamReader(resourceAsStream);
        BufferedReader bufferedReader = new BufferedReader(irs);
        Main.doProcessing(FilterField.CITY, "BARCELONA", bufferedReader);
    }
    @Test
    public void test_do_processing_2() throws IOException {
        InputStream resourceAsStream = Test1.class.getResourceAsStream("data.txt");
        InputStreamReader irs = new InputStreamReader(resourceAsStream);
        BufferedReader bufferedReader = new BufferedReader(irs);
        Main.doProcessing(FilterField.ID, "25384390A", bufferedReader);
    }

}