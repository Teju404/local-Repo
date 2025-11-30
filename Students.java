class Abc {
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

public class Students{
    public static void main(String args[]) {
        Abc s = new Abc();
        s.setName("tejaswini");
        s.setAge(20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}