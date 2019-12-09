package creational.Factory;

public abstract class HiringManager {
    //    creational.Factory method
    abstract Interviewer makeInterviewer();

    public void takeInterviewer() {
        Interviewer ray = this.makeInterviewer();
        ray.askQuestions();
    }
}
