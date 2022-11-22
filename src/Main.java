public class Main {
    public static void main(String[] args) {
        //Задание №1
        String separator = " ";
        String enter = "\n";
        Author bookOne = new Author("Виктор", "Франкл");
        Author bookTwo = new Author("Мэтт", "Ридли");

        Book one = new Book("Человек в поисках смысла", bookOne, 1946);
        Book two = new Book("Геном: автобиография вида в 23 главах", bookTwo, 1999);

        System.out.println("Книга: " + one.getBookName() + separator + enter + "Автор: " + bookOne.getPersonalAuthorName() + separator + bookOne.getFamilyAuthorName() + separator + enter + "Год издания: " + one.getPublishingYear());
        one.setPublishingYear(1997);
        System.out.println("Год переиздания: " + one.getPublishingYear() + enter);
        System.out.println("Книга: " + two.getBookName() + separator + enter + "Автор: " + bookTwo.getPersonalAuthorName() + separator + bookTwo.getFamilyAuthorName() + separator + enter + "Год издания: " + two.getPublishingYear() + enter);

        //Задание №2
        System.out.println(new Book("Человек в поисках смысла", bookOne, 1946) + enter);
        System.out.println(new Book("Геном: автобиография вида в 23 главах", bookTwo, 1999) + enter);

        System.out.println(bookOne.hashCode());
        System.out.println(bookTwo.hashCode());
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

        System.out.println(separator);

        System.out.println(bookOne.equals(bookTwo));
        System.out.println(one.equals(two));

    }
}
