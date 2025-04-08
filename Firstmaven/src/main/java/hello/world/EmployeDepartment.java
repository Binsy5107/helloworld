package hello.world;
class Employe
{
	String name;
	int id;
	public Employe(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public void display()
	{
		System.out.println("emp name:" + name + " "  + "emp id :" + id);
	}
	
}
class Department
{
	String departname;
	Employe emp;//aggregation
	public Department(String departname ,Employe emp)
	{
		this.departname=departname;
		this.emp=emp;
	}
	public void display()
	{
		System.out.println("employee department :" + departname);
		emp.display();
	}
	
}
public class EmployeDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employe emp1=new Employe("ram",123);
Employe emp2=new Employe("seeta",234);
emp1.display();
emp2.display();

/*Department dept1=new Department("HR",emp1);
Department dept2=new Department("IT",emp2);
dept1.display();
dept2.display();*/
	}

}
