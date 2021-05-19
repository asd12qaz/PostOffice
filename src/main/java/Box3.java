public class Box3 {
    float systemlength=23,systemwidth=14;
    int systemhight=13;
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


        return  validate;
    }
}
