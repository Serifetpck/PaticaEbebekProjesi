public class Muhasebe extends Employee{
    public static void main(String[] args) {
        String name="Kemal";
        double salary=2000.0;
        int workHours=45;
        int hireYear=1985;
        Employee employee=new Employee(name, salary, workHours,hireYear);


        System.out.println(employee.toString());

    }
}
