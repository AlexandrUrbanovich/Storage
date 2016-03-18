package ru.mail.sanches;

/**
 * Created by Александр on 17.03.2016.
 */
public class AVI implements File {
    String name;

    public AVI(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void show() {
        System.out.println("Воспроизводим файл в KMP плеере.");
    }
}
