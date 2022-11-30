public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var totalWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + "кг");
        var weightDifference = weightTwoBoxer % weightOneBoxer;
        System.out.println("Разница в весе " + weightDifference + "кг");

        var workHours = 640;
        var workingDay = 8;
        var worker = workHours / workingDay;
        System.out.println("Всего работников в компании " + worker + " человек");
        worker = worker + 94;
        System.out.println(worker);
        var hours = worker * workingDay;
        System.out.println("Если в компании работает " + worker + " человека, то всего " + hours +
                " часов работы может быть поделено между сотрудниками");
    }
}