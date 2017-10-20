package test.runner;

import junit.runner.SimpleTestCollector;

import java.util.Enumeration;

public class SimpleTestCollectorTest {

    public static void main(String[] args) {
        SimpleTestCollector collector = new SimpleTestCollector();
        Enumeration e = collector.collectTests();
        System.out.println("---> result:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
