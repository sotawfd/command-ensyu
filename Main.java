public class Main{
    public static void main(String[] args) {
        System.out.println("�g��");
        double tail=new java.util.Scanner(System.in).nextInt();
        System.out.println("�̏d");
        double weight=new java.util.Scanner(System.in).nextInt();
        double BMI=weight/(tail*tail)*10000;
        System.out.println(String.format("%.2f",BMI));
    }
}
