package Exercise_1_and_2;

public class Child extends Person {
    String[] professions;
    public Child(int[] age, String[] name, String[] professions) {
        super(age, name);
        this.professions = professions;
    }

    @Override
    public void less_then_25(){
        int num = 0;

        for(int i=0;i<age.length;i++){
            if(age[i] <= 25 && professions[i].equals("programmer")){
                num ++;
            }
        }

        System.out.println("There are " + num + " people whose age is less then 25 and they are programmers:");
        System.out.println();

        for(int i=0;i<age.length;i++){
            if(age[i] <= 25 && professions[i].equals("programmer")){
                System.out.println("Name is: " + name[i]);
                System.out.println("Age is: " + age[i]);
                System.out.println("Profession is: " + professions[i]);
                System.out.println();
            }
        }
    }
}
