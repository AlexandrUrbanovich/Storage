package ru.mail.sanches;

/**
 * Created by Александр on 17.03.2016.
 */
public class PDF implements File {
    String name;

    public PDF(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void show() {
        System.out.println("Открываем файл в Reader PDF.");
    }
}
