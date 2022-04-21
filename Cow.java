public class Cow {

    private String getImage;
    private String getName;

    public Cow (String cow ) { //Cow for the java file
        getName = cow;
    }

    public String getName() {

    return getName;//gets name
    }

    public String getImage(){//gets image

    return getImage;
    }

    public void setImage(String _image) {//sets image
        getImage = _image;
    }
}
