public class Matango {
    int hp;
    final int level = 10;//levelという変数が固定（上書きできない）されるようになる。
    char suffix;
    public void run(){
        System.out.println("お化けキノコ" + this.suffix +"は逃げ出した！");
    }
}

