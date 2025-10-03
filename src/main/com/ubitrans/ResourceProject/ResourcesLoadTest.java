package com.ubitrans.ResourcesProject;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class ResourcesLoadTest {
    public static void main(String[] args) {
        ClassLoader cl = ResourcesLoadTest.class.getClassLoader();
        String resourceName = "META-INF/spring.schemas";
        Enumeration<URL> urls = null;
        try {
            urls = cl.getResources(resourceName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int count = 0;
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url);
            count++;
        }
        System.out.println("Total: " + count);
        assert count == 3;
    }
}
