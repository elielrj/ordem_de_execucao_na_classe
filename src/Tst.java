public class Tst {
    int ini=0,fim=25;

    //4
    public void print() {
        System.out.println(ini+fim);
    }

    //1
    {
        ini = fim%7;
        fim=ini*3;
    }

    //3
    Tst(int a, int b){
        ini+=a;
        fim+=b;
    }

    //2
    {
        ini/=2;
        fim+=10;
    }
}
