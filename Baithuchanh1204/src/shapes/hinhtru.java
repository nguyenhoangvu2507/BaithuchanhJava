package shapes;
import java.util.Scanner;
public class hinhtru extends hinhtron {
    public float chieucao;
    public hinhtru(){
        ten="Hinh tru";
    }
    public void nhapchieucao(){
        nhapBanKinh();
        System.out.println("chieu cao= ");
        Scanner sc= new Scanner(System.in);
        chieucao= sc.nextFloat();
        sc.close();
    }
    public void tinhthetich(){
        tinhdientich();
        thetich= dientich*chieucao;
    }
}