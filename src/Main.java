//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        SuperHero sh= new SuperHero();
        Hero h= new Hero();
        sh.fly();
        sh.run();//SuperHeroしかnewしていないけどextendsで継承しているからHeroクラスのメソッドを使用できる。
        sh.test();
        h.run();
        h.test();
        Weapon w = new Weapon();
    }
}
/*
宣言時にfinalがつけられていた場合オーバーライドすることができない。
*/