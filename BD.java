import java.util.*;


class BD {
    static Scanner in = new Scanner(System.in);
    static ArrayList<User> userList = new ArrayList<>();
    static public boolean contains() {
        System.out.println("Введите имя юзера: ");
        String name = in.nextLine();
        System.out.println("Введите ник: ");
        String nickname = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        boolean userContains = userList.contains(new User(name, nickname, age));
        return userContains;
    }
    public static User remove(){
        System.out.println("Введите индекс юзера: ");
        int t = in.nextInt();
        return userList.remove(t);
    }
    public static void main(String[] args) {
        userList.add(new User("Anastasiya", "Klimidzze", 19));
        userList.add(new User("Anya", "Vinnichka", 20));
        userList.add(new User("Kirill", "Kir_Kor", 19));
        userList.add(new User("Igor", "GreyFrut", 19));
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1.equals(list2));
        System.out.println(contains());
        System.out.println(remove());
    }
}

class User {
    String name;
    String nickname;
    int age;


    User(String name, String nickname, int age) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        User other = (User) obj;
        if (name.equals(other.name)){
            return true;}
        if (nickname.equals(other.nickname)){
            return true;}
        if (age == other.age){
            return true;}
        return false;
    }
}