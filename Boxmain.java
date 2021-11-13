//Q3 Box
class Box {
    int w, h, d;
    int vol;

    Box(int a, int b, int c) {
        w = a;
        h = b;
        d = c;
    }

    public void volume() {
        vol = w * h * d;
        System.out.println("Volume = " + vol);
    }
}

class Boxmain {
    public static void main(String[] args) {
        Box obj = new Box(10, 20, 30);
        obj.volume();
    }
}