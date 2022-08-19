import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] intArr = {23,1,-9,75,34,90,23,7,3,0}; //int array
        String[] stringArr = {"this","is","a","hat"," ","56","-1"}; //string array

        Student[] arr = {new Student(23,"a","paris"),   // Object array
        new Student(23,"a","london"),
        new Student(23,"a","rome"),
        new Student(23,"a","tokyo")};


        System.out.println("Original integer array "+Arrays.toString(intArr));
        System.out.println("Original string array "+Arrays.toString(stringArr));

        Arrays.sort(intArr);  //sort
        Arrays.sort(stringArr);  //sort
        System.out.println("Sorted int array "+Arrays.toString(intArr));
        System.out.println("Sorted string array "+Arrays.toString(stringArr));

        System.out.println("Original string array " + Arrays.toString(arr));
        Arrays.sort(arr); //sort
        System.out.println("Sorted object array "+Arrays.toString(arr));
    }
}

class Student implements Comparable<Student>
{
    private int rollno;  //class members
    private String name, address;

    //constructor
    public Student(int rno, String nme, String adrs){
        this.rollno = rno;
        this.name = nme;
        this.address = adrs;
    }
    //used to print details in main()

   @Override
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }


    @Override
    public int compareTo(Student o){


        if(this.rollno!=o.getRollno()){
            System.out.println("this.rollno: "+this.rollno + "o.getRollno(): "+o.getRollno());
            System.out.println("diff: "+ (this.rollno - o.getRollno()));
            return this.rollno - o.getRollno();
        }
        else if(!this.name.equals(o.getName())){
            System.out.println("this.name: "+this.name + "  o.getName(): "+o.getName());
            System.out.println("diff: "+this.name.compareTo(o.getName()) );
            return this.name.compareTo(o.getName());
        }
        return this.address.compareTo(o.getAddress());
    }

}