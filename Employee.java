public class Employee
{
private String name;
private int age=0;
private int salary=0;
public void read(String name,int age,int salary)
this.name=name;
this.age=age;
this.salary;
}
public void show()
{
 System.out.println(name+" "+age+" "+salary);
}
public static void main(String[]args)
{
 Employee e=new Employee();
 e.read("Meenakshi",22,24000);
 e.show();
}}
