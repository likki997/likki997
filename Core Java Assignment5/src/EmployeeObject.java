
	import java.util.HashSet;
	public class EmployeeObject
	{
	public static void main(String[] args) {
	HashSet<Data> set=new HashSet<Data>();
	Data d1 = new Data(201,"pavani","MCA",10000);
	Data d2 = new Data(202,"Venky","ECE",20000);
	Data d3 = new Data(203,"Radha","CSE",30000);
	set.add(d1);
	set.add(d2);
	set.add(d3);
	for(Data d:set)
	{
	System.out.println("id:" +d.id+" name:" +d.name+" salary:" +d.salary+" +department:" +d.department+" ");
	}
	}
	}class Data
	{
	String name;
	int id;
	float salary;
	String department;
	public Data(int id, String name, String department, float salary)
	{
	this.name = name;
	this.id = id;
	this.salary = salary;
	this.department = department;
	}
	}




