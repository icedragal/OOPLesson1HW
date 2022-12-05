public class Main {
    public static void main(String[] args) {
        Human max = new Human("Максим", -1988, "", null);
        Human anya = new Human("Аня", 1993, "Москва",  "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        System.out.println(max);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);

        Car granta = new Car("Lada", "Granta", 1.7F, "Желтый", -2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0F, "Черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0F, "Черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.7F, "Крсный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6F, "Оранжевый", 2016, "Южная Корея");
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}