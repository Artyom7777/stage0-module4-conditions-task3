package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary < 0){
            System.out.println("wrong input!");
        } else if(salary > 0 && salary <= 10000){
            salary = salary - (salary / 100 * 15);
            System.out.println(salary);
        } else if(salary > 10000 && salary <= 20000) {
            salary = salary - (salary / 100 * 18);
            System.out.println(salary);
        }  else if(salary > 20000) {
            salary = salary - (salary / 100 * 20);
            System.out.println(salary);
        }
    }
}
