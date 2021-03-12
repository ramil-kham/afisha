package tech.itpark;

import tech.itpark.domain.Film;
import tech.itpark.manager.Afisha;


public class Main {
    public static void main(String[] args) {


        Afisha afisha = new Afisha();

        Film film1 = new Film(1,
                7.1,
                "https://afisha.yandex.ru/kazan/cinema/para-iz-budushchego?source=selection-events",
                "Есть билеты",
                "Пара из будущего",
                false,
                "https://afisha.yandex.ru/kazan/cinema/para-iz-budushchego?source=selection-events",
                7);
        afisha.add(film1);

        Film film2 = new Film(2,
                7.8,
                "https://afisha.yandex.ru/kazan/cinema/raya-i-posledniy-drakon?source=selection-events",
                "Есть билеты",
                "Райя и последний дракон",
                false,
                "https://afisha.yandex.ru/kazan/cinema/raya-i-posledniy-drakon?source=selection-events",
                7);
        afisha.add(film2);

        Film film3 = new Film(3,
                7.3,
                "https://afisha.yandex.ru/kazan/cinema/batia-2020?source=selection-events&schedule-preset=today",
                "Есть билеты",
                "Батя",
                false,
                "https://afisha.yandex.ru/kazan/cinema/batia-2020?source=selection-events&schedule-preset=today",
                7);
        afisha.add(film3);

    }
}