public class Main {
    public static void main(String[] args) {
        String separator = " ";
        String enter = "\n";
        Author bookOne = new Author("Виктор", "Франкл");
        Author bookTwo = new Author("Мэтт", "Ридли");

        Book one = new Book("Человек в поисках смысла", bookOne, 1946);
        Book two = new Book("Геном: автобиография вида в 23 главах", bookTwo, 1999);

        one.setPublishingYear(1997);

        System.out.println("Книга: " + one.getBookName() + separator + enter + "Автор: " + bookOne.getPersonalAuthorName() + separator + bookOne.getFamilyAuthorName() + separator + enter + "Год издания: " + one.getPublishingYear());
        System.out.println("Год переиздания: " + one.getPublishingYear() + enter);
        System.out.println("Книга: " + two.getBookName() + separator + enter + "Автор: " + bookTwo.getPersonalAuthorName() + separator + bookTwo.getFamilyAuthorName() + separator + enter + "Год издания: " + two.getPublishingYear());
    }
}
