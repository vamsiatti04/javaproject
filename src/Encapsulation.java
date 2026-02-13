public class Encapsulation {

    private int age;
    private String name;
    public int getAge(){
        if(age<0){
            System.out.println("Invalid age");
        }
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        if(name ==null){
            System.out.println("name is null");
        }
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args){

        Encapsulation enc = new Encapsulation();
        enc.setAge(23);
        enc.setName("vamsi");

        System.out.println(enc.getAge());
        System.out.println(enc.getName());

    }


}
