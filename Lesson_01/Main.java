package Lesson_01;

public class Main {
    public static void main(String[] args) {

        Participants[] sportsmen = {new Man("Человек", 4000, 2),
        new Cat("Кот", 6000, 5),
        new Robot("Робот", 300, 1)};

        Barrier[] barriers = {new Track(1000 ), new Wall(2)};
        for (int i = 0; i < sportsmen.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (barriers[j].height != 0) {
                    if (sportsmen[i].jumpOver(barriers[j].height))
                        System.out.println(sportsmen[i].getName() + " перепрыгнул через барьер высотой "+ barriers[j].height + " m.");
                    else break;
                }
                if (barriers[j].length != 0) {
                    if (sportsmen[i].run(barriers[j].length))
                        System.out.println(sportsmen[i].getName() + " пробежал длину  "+ barriers[j].length + " m.");
                    else break;
                }
            }
        }
    }
}
