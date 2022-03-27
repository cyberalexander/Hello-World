package src.main.java.com.einarr.maximus.helloworld;

public class CheckJavaVersion {

    public static void main(String[] args) {

        String version = System.getProperty("java.version");

        System.out.println("Java version " + version);
    }
}
