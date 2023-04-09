package Lesson4;

public class Test <T, V>{
    T obg;
    V obg2;

    public Test(T obg, V obg2) {
        this.obg = obg;
        this.obg2 = obg2;
    }

    T getObg (){
        return obg;
    }
    V getObg2 () {
        return obg2;
    }
}
