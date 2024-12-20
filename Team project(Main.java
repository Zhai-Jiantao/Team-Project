import java.util.Scanner;

public class Main{
    private Scanner input = new Scanner(System.in);
    private Student student;
    private Student[] students = new Student[35];
    private int Studentnumber = 0;
    public static void main(String []args){
        new Main();

    }
    public Main() {
        while(true) {
            System.out.println("1,input student information 2.output student information 3.quit");
            String enteredchoice = input.nextLine();
            if ("1".equals(enteredchoice)) {
                addStudent();
             }
            else if ("2".equals(enteredchoice)) {
                System.out.println("please input StudentID");
                long QuartID = input.nextLong();
                input.nextLine();
                boolean find = false;
                for (int n = 0; n < Studentnumber; n++) {
                    if (QuartID == students[n].getStudentID()) {
                        printStudent(n);
                        find = true;
                        break;
                    }
                }
                if (!find) {
                    System.out.println("Can not find this ID");
                }
            }
            else if ("3".equals(enteredchoice)) {
                        System.out.println("Exiting the program.");
                        return;
                    }

            }
        }

    private void addStudent(){
        System.out.println("ID is :");
        long enteredID = input.nextLong();
        input.nextLine();
        System.out.println("Maths is :" );
        float enteredMaths = input.nextFloat();
        input.nextLine();
        System.out.println("English is :" );
        float enteredEnglish = input.nextFloat();
        input.nextLine();
        System.out.println("History is :" );
        float enteredHistory = input.nextFloat();
        input.nextLine();
        student = new Student(enteredID,enteredMaths,enteredEnglish,enteredHistory);

        students[Studentnumber] = new Student(enteredID,enteredMaths,enteredEnglish,enteredHistory);
        Studentnumber= Studentnumber + 1;

    }
    private void printStudent(int i){
        System.out.println("Maths is:"+ students[i].getEnglish());
        System.out.println("English is:"+students[i].getMaths());
        System.out.println("History is:"+students[i].getHistory());
    }





}
