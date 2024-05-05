public class TestProgram {
    public static void main(String[] args) {
        Library library = new Library();

        LibraryResource book = new Book("Inside the Machine: An Illustrated Introduction to Microprocessors and Computer Architecture");
        LibraryResource journal = new Journal("Bright Ideas");

        library.addResource(book);
        library.addResource(journal);

        Student student = new Student("Vina");

        // Borrow a book
        LibraryResource resource = library.findResource("Inside the Machine: An Illustrated Introduction to Microprocessors and Computer Architecture");
        if (resource != null) {
            student.borrowResource(resource);
        }

        // Borrow a journal
        resource = library.findResource("Bright Ideas");
        if (resource != null) {
            student.borrowResource(resource);
        }

        // Demonstrate flexibility to add new resource types
        LibraryResource thesis = new LibraryResource() {
            private String title = "Computer Science Thesis";

            @Override
            public String getTitle() {
                return title;
            }

            @Override
            public void borrow(Student student) {
                System.out.println(student.getName() + " borrowed the thesis: " + title);
            }
        };

        library.addResource(thesis);
        resource = library.findResource("Computer Science Thesis");
        if (resource != null) {
            student.borrowResource(resource);
        }
    }
}
