public class SimpleModule {

    int myInt;
    public SimpleModule(){
        myInt = 0;
    }
    public int twice(int test){
        myInt = test * 2;
        return myInt;
    }


    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}
