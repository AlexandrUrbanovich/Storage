package ru.mail.sanches;

/**
 * Created by Александр on 17.03.2016.
 */
public class Main {
    public static void main(String[] args){
        File pdf = new PDF("Thinking of Java");

        System.out.println("Имя файла " + pdf.getName());
        pdf.show();

        System.out.println();

        File avi = new AVI("Lectoin about Java.");

        System.out.println("Имя файла " + avi.getName());
        avi.show();

        System.out.println();

        File txt = new TXT("Storage");
        System.out.println("Имя файла " + txt.getName());
        txt.show();
    }
}
