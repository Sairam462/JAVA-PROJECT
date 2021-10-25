import java.util.*;
public class Project {
    public static int empId;
    public static String empName;
    public static String empSal;
    public static String empAddress;
   public static Scanner Sc = new Scanner((System.in));
    public Project(int empId,String empName,String empSal,String empAddress){
        this.empId=empId;
        this.empName=empName;
        this.empSal=empSal;
        this.empAddress=empAddress;
    }
    public static void getallEmployees(HashMap<Integer,ArrayList<String>> hm){
        for(Integer key:hm.keySet()){
            System.out.println(hm.get(key));
        }
    }
    public static void addEmployeeDetails(HashMap<Integer,ArrayList<String>> hm,ArrayList<String> b){
        empId = Sc.nextInt();
        empName = Sc.next();
        empSal = Sc.next();
        empAddress = Sc.next();
        b.add(empName);
        b.add(empSal);
        b.add(empAddress);
        hm.put(empId,b);
        System.out.print("User with Name "+empName+ " Record updated successfully");
    }
    public static ArrayList getEmployeeById(HashMap<Integer,ArrayList<String>> hm,int id){
        return hm.get(id);
    }
    public static void removeEmployees(HashMap<Integer,ArrayList<String>> hm,int id){
        hm.remove(id);
        System.out.println("The New Employees List is :: \n");
        System.out.println(hm.values());
    }
    public static void main(String args[]) {
            HashMap<Integer,ArrayList<String>> hm = new HashMap<>();
            ArrayList <String> b = new ArrayList<>();
            b.add("sai");
            b.add("1000");
            b.add("MDP");
            hm.put(1,b);
            int choice;
            do{
                System.out.println("-------- Employee Management System -----------\n");
                System.out.println("1. Show All Employee Details");
                System.out.println("2. Get Employee Details By Id");
                System.out.println("3. Add Employee Details");
                System.out.println("4. Delete an Employee Details By Id");
                choice = Sc.nextInt();
                switch(choice){
                case 1: getallEmployees(hm);
                        break;
                case 2: int id = Sc.nextInt();
                         System.out.println(getEmployeeById(hm,id));
                         break;
                case 3: addEmployeeDetails(hm,b);
                        break;
                case 4:
                        int rid = Sc.nextInt();
                        removeEmployees(hm,rid);
                        break;
            }
        }
        while(choice!=5);
    }
}