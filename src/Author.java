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

    @Override
    public String toString () {
        String separator = " ";
        return personalAuthorName + separator + familyAuthorName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author bookTwo = (Author) other;
        return familyAuthorName.equals(bookTwo.familyAuthorName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(familyAuthorName);
    }
}

