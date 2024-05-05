public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed the journal: " + title);
    }
}
