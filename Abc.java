class Student {
    private int age;
    private String name;
    private float sal;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return this.sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}

public class Abc {
    public static void main(String args[]) {
        Student s = new Student();
        s.setName("Tejaswini");
        s.setAge(21);
        s.setSal(200000f);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSal());

    }
}
