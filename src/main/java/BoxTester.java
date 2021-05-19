import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float length,width;
        int height;
        System.out.println("歡迎使用郵局便利箱系統");
        System.out.println("please enter object's length:");
        length=scanner.nextFloat();
        System.out.println("please enter object's width:");
        width=scanner.nextFloat();
        System.out.println("please enter object's height:");
        height=scanner.nextInt();
        Box3 box3=new Box3();
        Box5 box5=new Box5();
        if(box3.validate(length,width,height)){
            System.out.println("Box3");
        }else if(box5.validate(length,width,height)){
            System.out.println("Box5");
        }else {
            System.out.println("目前便利箱皆沒有符合你物品裝箱的箱子 暫不能提供服務");
        }



    }
}
