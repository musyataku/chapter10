public class Weapon extends Item {
    // コンストラクタを追加する。
    public Weapon() {
        super("ななしの剣"); //引数1つの親クラスコンストラクタを呼び出す。ここが空白だと親クラスである（Item）において引数なしのメソッドが存在しないためエラーをはいてしまう
    }
}