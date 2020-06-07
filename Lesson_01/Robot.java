package Lesson_01;

public class Robot implements Participants {

    private String name;
    private float runLimit;
    private float jumpLimit;

    public Robot(String name, float runLimit, float jumpLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public String getName() {
        return name;
    }
    public boolean run(float distance){
        return(distance <= runLimit);
    }

    public boolean jumpOver(float height){
        return (height <= jumpLimit);
    }
}
