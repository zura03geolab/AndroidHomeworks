package assign2.vashakidze.zura.homeworks.model;

/**
 * Created by Zurab Vashakidze on 29/04/2016.
 */
public class MathCompCharacters {
    private String name;
    private String description;
    private String image;

    public MathCompCharacters(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "MathCompCharacters{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
