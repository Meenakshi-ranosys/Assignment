class person
{
public String name;
Public String surname;
person()
{
name=null;
surname=null;
}
person(String name,String surname)
{
parameterised constructor
this.name=name;
this.surname=surname;
}
person(person p)
name=p.name;
surname=p.surname;
}
public void show()
{
System.out.println("Name:"+name+" "+surname);
}
public void show(String name)
{
System.out.println("First name:"+name+"\n\t----");
}
}
class contactinfo extends person
{
protected String phone;
contactinfo()
{
phone=null;
}
contactinfo(contactinfo ct)
{
super(ct);
phone=ct.phone;
}
public void show()
{
super.show();
System.out.println("Phone No:"+phone);
}}
clas Employee extends contactinfo
{
protected float salary;
salary=0;
}
Employee(float salary,String phone,String name,String surname)
{
super(phone,name,surname)
this.salary=salary;
}
public void show()
{
super.show();
System.out.println("salary: "+salary+"\n");
}
}
class office
{
public static void main(String args[])
{
 Employee m1=new Employee();
 m1.show();
 Employee m2=new Employee(24000,"7891258723",Meenakshi);
 m2.show();
Employee m3=new Employee(m2);
m3.show();
Employee m4=new Employee();
m4.show('Meenakshi");
}}


