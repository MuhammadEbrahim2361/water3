public class Dragon extends Cow{//goes back to parent class cow

    public Dragon(String name, String image){
        super(name);
        super.setImage(image);


    }

    public boolean canBreathFire(){


        return true;
    }
}
