public class Main {

    public static void main(String[] args) {

        Course course = new Course("Stars", new String[]{"Billy", "Willy", "Dilly", "Mikky"});
        course.testingTeam(course.participant);
        course.showTeam(course.participant);
    }
}
