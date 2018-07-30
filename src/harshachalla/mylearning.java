package harshachalla;

public class mylearning {
    public static void main(String[] args) {
        // printMyName();
        // hellowWorld();
        // myOperators();
        ifnested();
    }

    private static void hellowWorld() {
        //5. Write a simple java program to print “HELLO WORLD”
        System.out.println("Hello World!");
    }

    private static void myOperators() {
        //7. Write a simple program using all operators?
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    private static void printMyName() {
        // 8. Write a simple program using loop statements to print your name 10 times?
        int i = 1;
        while (i <= 10) {

            System.out.println("Harsha Challa");
            i++;
        }
    }

private static void ifnested()
{
 //Write a simple program using if and nested-if statements?
    int marks=65;

    if(marks<50){
        System.out.println("fail");
    }
    else if(marks>=50 && marks<60){
        System.out.println("D grade");
    }
    else if(marks>=60 && marks<70){
        System.out.println("C grade");
    }
    else if(marks>=70 && marks<80){
        System.out.println("B grade");
    }
    else if(marks>=80 && marks<90){
        System.out.println("A grade");
    }else if(marks>=90 && marks<100){
        System.out.println("A+ grade");
    }else{
        System.out.println("Invalid!");
    }
}
}

