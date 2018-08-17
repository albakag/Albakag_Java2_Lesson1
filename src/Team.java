public class Team {

    private String teamName;
    String[] participant;

    public Team(String teamName, String[] participant) {
        this.teamName = teamName;
        this.participant = participant;
    }

    //Метод выводит название команды и всех ее участников
    void showTeam(String[] participant) {
        this.participant = participant;
        for (int i = 0; i < participant.length; i++) {
            System.out.println("Команда - " + teamName + " участник - " + participant[i]);
            ;
        }
    }
}
