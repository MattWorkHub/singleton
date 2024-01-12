public class User {
    private String name;
    private String age;
    private static User singleton;
    public static User getSingleton(){
        if(singleton == null){
            singleton = new User();
        }
        return singleton;
    }
    public void print(){
        System.out.println(name + " " +age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
