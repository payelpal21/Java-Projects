import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];// array of questions, references

    String[] selection = new String[5];// array of answers, references

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");// initialize the questions array
                                                                                   // with Question objects
    }

    public void playQuiz() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            // System.out.println(q.getQuestion());
            // System.out.println(q);

            System.out.println("Q" + q.getId() + ": " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.print("Enter your answer: ");

            selection[i] = sc.nextLine();
            i++;
            System.out.println();

        }
        for (String s : selection) {
            System.out.println("Your answer: " + s);
        }
        sc.close();
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }

        }
        System.out.println("Your score is: " + score + "/" + questions.length);

    }
}
