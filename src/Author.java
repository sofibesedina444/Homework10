public class Author {
    private final String personalAuthorName;
    private final String familyAuthorName;

    public Author(String personalAuthorName, String familyAuthorName) {
        this.personalAuthorName = personalAuthorName;
        this.familyAuthorName = familyAuthorName;
    }

    public String getPersonalAuthorName() {
        return this.personalAuthorName;
    }

    public String getFamilyAuthorName() {
        return this.familyAuthorName;
    }
}

