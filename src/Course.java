import java.util.Random;

public class Course extends Team {

    public Course(String teamName, String[] participant) {
        super(teamName, participant);
    }

    //Рандомом будем выдавать результат прохождения испытаний
    Random random = new Random();

    //Массив испытаний
    String[] exercises = {"Swim", "Run", "Jumps"};

    //счетчик пройденных испытаний для отдельного участника, используется в методе testingTeam
    int counter = 0;

    //используется для получения рандомных значений о статусе прохождения того или иного испытания
    boolean finished;


    //Метод проверки каждого спортсмена на прохождение всей дистанции, Рандомно присваивая значение True or False
    //чем меньше испытаний, тем больше шанс прохождения дистанции всеми участниками.
    void testingTeam(String[] sportsmen) {
        for (int i = 0; i < super.participant.length; i++) {
            for (int j = 0; j < exercises.length; j++) {
                finished = random.nextBoolean();
                if (finished == true) {
                    counter++;
                }
            }
            if (counter == exercises.length) {
                System.out.println("Спортсмен " + super.participant[i] + " прошел дистанцию!");
            } else {
                System.out.println("Спортсмен " + super.participant[i] + " не прошел дистанцию!");
            }
        }

    }
}

