public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        friend = (friend+2)/7;
        System.out.println("Значение = " + friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var oneWeight = 78.2;
        var twoWeight = 82.7;
        var totalWeight = oneWeight + twoWeight;
        System.out.println(totalWeight);
        var differenceWeight = twoWeight - oneWeight;
        System.out.println("Разница в весе между двумя боксерами составила " + differenceWeight + " кг");
        var result = twoWeight % oneWeight;
        System.out.println(result);

        var totalTime = 640.0;
        var hoursInOneWorker = 8;
        var totalWorkers = totalTime/hoursInOneWorker;
        System.out.println("Всего работников в компании - " + totalWorkers);
        totalWorkers = totalWorkers + 94;
        System.out.println("Всего работников в компании после увеличения штата " + totalWorkers + " человека");
        var totalTimeForAllWorkers = totalWorkers*hoursInOneWorker;
        System.out.println("Если в компании работает " + totalWorkers + " человека, то всего " + totalTimeForAllWorkers + " часа работы может быть поделено между сотрудниками");




    }
}