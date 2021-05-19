public class Box5 {
    float systemlength=39.5f,systemwidth=27.5f;
    int systemhight=23;
    boolean validate;
    float length,width;
    int height;
    public boolean validate(float length, float width, int height) {
        this.length=length;
        this.width=width;
        this.height=height;
        if (systemlength>length&&systemwidth>width&&systemhight>height){
            validate=true;
        }
        return validate;

    }
}
