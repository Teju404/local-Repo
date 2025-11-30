public class Student {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Abc {
    public static void main(String args[]) {
        Student s = new Student();
        s.setName("tejaswini");
        s.setAge(20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}