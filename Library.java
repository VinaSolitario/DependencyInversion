import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryResource> resources;

    public Library() {
        this.resources = new ArrayList<>();
    }

    public void addResource(LibraryResource resource) {
        resources.add(resource);
    }

    public LibraryResource findResource(String title) {
        for (LibraryResource resource : resources) {
            if (resource.getTitle().equalsIgnoreCase(title)) {
                return resource;
            }
        }
        return null;
    }
}
