public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        double tax;
        if (this.salary <= 1000)
            tax = 0;
        else
            tax = this.salary * 0.03;
        return tax;
    }
    public double bonus(){
        double bonus;
        if (this.salary > 40)
            bonus = (this.workHours - 40) * 30;
        else
            bonus =  0;
        return bonus;
    }
    public double raiseSalary(){
        int currentYear = 2021;
        int workingYear = currentYear - this.hireYear;
        double raiseSalary;

        if (workingYear > 0 && workingYear <= 9)
            raiseSalary = this.salary * 0.05;
        else if(workingYear > 9 && workingYear <= 19)
            raiseSalary = this.salary * 0.1;
        else
            raiseSalary = this.salary * 0.15;

        return raiseSalary;
    }
     public void toStringg(){
        double bonus= this.salary + bonus() - tax();
        double totalSalary= this.salary + raiseSalary();
         System.out.println("Adı : "+this.name+
                            "\nMaaşı : "+this.salary+
                            "\nÇalışma Saati : "+this.workHours+
                            "\nBaşlangıç Yılı : "+this.hireYear+
                            "\nVergi : "+tax()+
                            "\nBonus : "+bonus()+
                            "\nMaaş Artışı : "+raiseSalary()+
                            "\nVergi ve Bonuslar ile birlikte maaş : "+bonus+
                            "\nToplam Maaş : "+totalSalary);
    }
}