package Exercise_1_and_2;

public class Person {
    int[] age;
    String[] name;
    public Person(int[] age, String[] name){
        this.age = age;
        this.name = name;
    }

    public void less_then_25(){
        int num = 0;

        for(int i=0;i<age.length;i++){
            if(age[i] <= 25){
                num ++;
            }
        }

        System.out.println("There are " + num + " people whose age is less then 25:");
        System.out.println();

        for(int i=0;i<age.length;i++){
            if(age[i] <= 25){
                System.out.println("Name is: " + name[i]);
                System.out.println("Age is: " + age[i]);
                System.out.println();
            }
        }
    }
}
