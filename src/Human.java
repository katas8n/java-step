public class Human<T, K> {
    private T password;
    private K email;

    public Human(T password , K email) {
        this.password = password;
        this.email = email;
    }

    public T getPassword() {
        return  password;
    }

    public K getEmail() {
        return email;
    }


}
