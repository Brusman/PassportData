public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.passport = "4444 №444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (921) 123-45-67";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = "May";
        post.birthday.years = 1975;
    }
}
