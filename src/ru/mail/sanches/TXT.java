package ru.mail.sanches;

/**
 * Created by Александр on 17.03.2016.
 */
public class TXT implements File {
    String name;

    public TXT(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void show() {
        System.out.println("Отккываем этот файл в Блокноте.");
    }
}
