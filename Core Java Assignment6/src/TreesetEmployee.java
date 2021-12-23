import java.util.Set;

import java.util.TreeSet;

public class TreesetEmployee {

public static void main(String[] args) {
Set<Employee> names =new TreeSet<Employee>();
Employee E3 = new Employee(3,"deepu","deepu@gmail.com",20000);
Employee E4 = new Employee(4,"mouni","mouni@gmail.com",30000);
Employee E6 = new Employee(6,"manju","manju@gmail.com",40000);
Employee E5 = new Employee(5,"jyothi","jyothi@gmail.com",50000);
Employee E2 = new Employee(2,"paddu","paddu@gmail.com",60000);
Employee E1 = new Employee(1,"subha","subha@gmail.com",70000);
Employee E10 = new Employee(10,"navya","navya@gmail.com",80000);
Employee E9 = new Employee(9,"divya","divya@gmail.com",90000);
Employee E7 = new Employee(7,"janu","janu@gmail.com",75000);
Employee E8 = new Employee(8,"kruthika","kruthika@gmail.com",10000);
names.add(E1);
names.add(E2);
names.add(E3);
names.add(E4);
names.add(E5);
names.add(E6);
names.add(E7);
names.add(E8);
names.add(E9);
names.add(E10);
for(Employee name:names) {
name.display();

}





}



}

