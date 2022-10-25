public class Employee {


    public String name;
    public double salary;
    public  int workHours;
    public  int hireYear;


    public Employee(){

    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    public double tax() {
        double vergi=0;

        if (salary > 1000) {
            vergi = salary * 0.03;


        }

        return vergi;
    }
    public int bonus(){
        int haftalikBonus=0;
        int aylikBonus=0;
        if (workHours > 40) {
            haftalikBonus= (workHours - 40) * 30;

        }
        aylikBonus=haftalikBonus*4;
        return aylikBonus;
    }


    public  double raiseSalary() {

        double maasArtisi=0;

        int yil = 2021;
        if ((yil - hireYear) < 10) {
            maasArtisi=(salary-tax()+bonus())*0.05;



        } else if (9< (yil - hireYear) && (yil - hireYear)< 20) {

            maasArtisi=(salary-tax()+bonus())*0.10;



        }else if ((yil - hireYear) > 19){
            maasArtisi=(salary-tax()+bonus())*0.15;

        }
        return maasArtisi;
    }

    @Override
    public String toString() {

        return "Employee{"+
                " \n name='" + name +
                " \n salary=" + salary +
                " \n workHours=" + workHours +
                " \n hireYear=" + hireYear +
                " \n bonus = " + bonus() +
                " \n vergi = "+ tax() +
                "\n Maaş Artışı = "+raiseSalary()+
                "\n Vergi ve Bonuslar ile birlikte maaş ="+ (tax()+bonus()+salary) +
                "\n Toplam Maaş =" + (raiseSalary()+salary+bonus())+

                '}';

    }
}
