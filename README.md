# study-object-oriented
オブジェクト指向の勉強
# オブジェクト指向

## オブジェクト指向とは
「複雑な問題を効率よく解決するため」に生まれた考え方です。

具体的には、、

**「作りたいもの（オブジェクト）を、一つ一つの部品に分けて作っていくこと。」**

オブジェクト指向を、「家を建てる」ことに例えてみます。
オブジェクト指向による家を建て方をすると、

- 建築士が家を設計する
- 建設会社が地面を均す
- 大工さんが家を建てる
- 水道屋さんが水を通す
- 電気屋さんが証明をつける
- ガス会社がガスを通す..

とそれぞれ会社やチームに分担させて家を住める状態にします。

つまり、「**オブジェクト指向プログラミング**」は**作業を分担して、チームで一つのものをつくったり、問題の解決を目指したプログラミング」という意味です。

反対に、オブジェクト指向によらない場合は、上記の作業を **すべて同じチームで作ります。**

どちらもそれぞれメリットデメリットがありますが、Javaはオブジェクト指向型言語と呼ばれるほど、相性がいいです。

## クラス・プロパティ・メソッドを理解する
これら３つの理解は、オブジェクト指向を理解する上で避けては通れません。

これら３つを「クルマ」で例えるとこのような考え方になります。

### [クラス]
設計書。プロパティやオブジェクトをひとまとめにしたもの。
### プロパティ
オブジェクトが持っているデータ。
例：階数、何畳、年数など
### [メソッド]
「走る」、「止まる」、「曲がる」などオブジェクトが持っている処理。

## オブジェクト指向の概念

これらをポケモンで例えてみます。
ポケモンには ピカチュウ、ケンタロス、ルージュ、、ラのようにいろいろな種類のポケモンがいます。

どのキャラも全て「ポケモン」なので、「ポケモン[クラス]」をもとに継承されています。

Pokemon.java(ポケモンクラス)

```java
package objectOriented;

public class Pokemon {

    private int number = 0; // ナンバー
    private String name = null; // なまえ
    private String category = null; // ぶんるい
    private String type1 = null; // タイプ1
    private String type2 = null; // タイプ2
    private double height = 0; // たかさ
    private double weight = 0; // おもさ
    private String description = null; // せつめい
    private String sing = null; // なきごえ
    private int vitality = 0; // たいりょく

    // 戦闘ステータス
//    private int hit_point = 0;
//    private int power_point = 0;
//    private int sp_power_point = 0;
//    private int defense_point = 0;
//    private int sp_defense_point = 0;
//    private int speed_point = 0;
//    private String condition = null;

    // 状態ステータス
    String[] status_abnomal = { "", "どく", "まひ", "やけど", "こおり", "ねむり" };

    // コンストラクタ
    public Pokemon() {
    }

    // 【START】getter setter =================
    // getter･setter(ナンバー)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // getter･setter(なまえ)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter･setter(ぶんるい)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // getter･setter(タイプ1)
    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    // getter･setter(タイプ2)
    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    // getter･setter(たかさ)
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // getter･setter(おもさ)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // getter･setter(せつめい)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // getter･setter(たいりょく)
    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    // getter･setter(なきごえ)
    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }

    // 【END】getter setter ===================

}
```

Pikachu.java(ピカチュウクラス)

```java
package objectOriented;
//ポケモンクラスを継承したクラスで、「10万ボルト」が使える。
public class Pikachu extends Pokemon {

    // コンストラクタ
    public Pikachu() {
        super.setNumber(025);
        super.setName("ピカチュウ");
        super.setCategory("ねずみ");
        super.setType1("でんき");
        super.setHeight(0.4);
        super.setHeight(6.0);
        super.setDescription("つくる　でんきが　きょうりょくな　ピカチュウほど　ほっぺの　ふくろは　やわらかく　よく　のびるぞ");
        super.setVitality(50);
        super.setSing("ピカァ！");
    }
    public void bolt_thousand_10(Pokemon target) {
        String name = super.getName();
        System.out.println(name + " の 10まんボルト！");
        target.setVitality(target.getVitality() - 50);
        System.out.println(target.getName() + " に 50 のダメージ!");
    }
}
```

kentaros.java

```java
package objectOriented;
//最強のポケモン。ポケモンクラスを継承したクラスで、「はかいこうせん」が使える。
public class Kentaros extends Pokemon {

    // コンストラクタ
    public Kentaros() {
        super.setNumber(128);
        super.setName("ケンタロス");
        super.setCategory("あばれうしポケモン");
        super.setType1("ノーマル");
        super.setHeight(1.4);
        super.setHeight(88.4);
        super.setDescription("しっぽで　じぶんの　からだを　たたきだしたら　きけんだぞ。　もうスピードで　つっこんでくる。");
        super.setSing("gyyyyoooorrrp");

    }
    // はかいこうせん メソッド
    public void destruction_beam(Pokemon target) {
        String name = super.getName();
        System.out.println(name + " の はかいこうせん！");
        target.setVitality(target.getVitality() - 50);
        System.out.println(target.getName() + " に 50 のダメージ!");
        System.out.println(name + " はこうげきのはんどうでうごけない！");
    }

}
```
Main.java(プログラムの主処理を行う)

```java
package objectOriented;

public class Main {

    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu(); // ピカチュウ オブジェクトを生成
        Kentaros kentaros = new Kentaros(); // ケンタロス オブジェクトを生成

        // 野生のケンタロスと遭遇
        System.out.println("あ！ やせいの" + kentaros.getName() + "があらわれた！");
        System.out.println("ゆけっ！" + pikachu.getName() + "!");
        printSing(pikachu);

        System.out.println();

        // ピカチュウ
        printDate(pikachu);
        pikachu.bolt_thousand_10(kentaros);// 10万ボルト

        System.out.println();
        // ケンタロス
        printDate(kentaros);
        kentaros.destruction_beam(pikachu);// はかいこうせん

    }

    // データを見る
    private static void printDate(Pokemon target) {
        System.out.println("No." + target.getNumber());
        System.out.println(target.getName());
        System.out.println(target.getCategory() + "ポケモン");
        System.out.println(target.getType1() + "タイプ");
        System.out.println(target.getType2() + "タイプ");
        System.out.println("たかさ: " + target.getHeight() + "m");
        System.out.println("おもさ: " + target.getWeight() + "kg");
        System.out.println(target.getDescription());
    }

    // 鳴き声を出力。
    public static void printSing(Pokemon target) {
        System.out.println("「" + target.getSing() + "」");
    }
}
```
実行結果

```
あ！ やせいのケンタロスがあらわれた！
ゆけっ！ピカチュウ!
「ピカァ！」

No.21
ピカチュウ
ねずみポケモン
でんきタイプ
nullタイプ
たかさ: 6.0m
おもさ: 0.0kg
つくる　でんきが　きょうりょくな　ピカチュウほど　ほっぺの　ふくろは　やわらかく　よく　のびるぞ
ピカチュウ の 10まんボルト！
ケンタロス に 50 のダメージ!

No.128
ケンタロス
あばれうしポケモンポケモン
ノーマルタイプ
nullタイプ
たかさ: 88.4m
おもさ: 0.0kg
しっぽで　じぶんの　からだを　たたきだしたら　きけんだぞ。　もうスピードで　つっこんでくる。
ケンタロス の はかいこうせん！
ピカチュウ に 50 のダメージ!
ケンタロス はこうげきのはんどうでうごけない！
```

### Pokemonクラス
こちらには、ポケモンのベースとなるステータスのの設定をしてあります。

各プロパティは公開範囲が private なので、データを参照したり変更したりするには、
**setName 、 getName といった [setter] 、 [getter] と呼ばれる[メソッド]を使う必要があります。**

### Pikachu, kentarosクラス
`extends Pokemon`でPokemon[クラス]を継承して、ポケモンが共通で持つデータをそのまま利用しています。
このように、必要最低限の**「共通する基本情報」**を用意しておくと、Pokemon[クラス]の汎用性が高まります。

はかいこうせんメソッド、１０万ボルトメソッドを
継承したポケモンの動作に加えて、それぞれ固有の攻撃メソッドを持ってます。「継承 + 独自の[メソッド]やプロパティ」を実装することで、継承した[クラス]に付加価値をつけることが出来ます。

### コンストラクタによる初期設定
各キャラクターは [コンストラクタ] により、身長、体重、体力などの初期設定が可能です。
オブジェクトを最初に生成する際に実行されるため、 初期設定 をするのに適しています。

## オブジェクト指向的に設計しない場合のデメリット

結論以下のようなことが挙げられます。

### 1. コードが見づらい
Pokemon[クラス]を継承せずに、毎回ステータスを記述しても結果は変わりませんが、コードが非常に長くなり、見づらいコードとなってしまいます。

### 2. 機能を増やすときの手間が増える
アップデートされた時にポケモンの数が大幅に追加することになッタと仮定します。
【ポケモンごとに Pokemon [メソッド]を記述していた場合】
新しいキャラクターには機能追加と Pokemon [メソッド]の記述が必要
【オブジェクト指向的な記述がされていた場合】
機能を追加するだけで完了。

### 3. 修正漏れが起きやすい。
ポケモンの基本動作に、ポケモンセンターに行くと、状態異常、体力全回復する 「休む」機能をつけるのを忘れていました。
キャラクターごとに Pokemon [メソッド]を記述していた場合、一個一個に「休む」[メソッド]を記述し修正しなければいけませんが、
オブジェクト指向的に記述していれば、Pokemon[クラス]に「寝る」という[メソッド]を一回記述すれば修正完了です。


[インスタンス]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[インスタンス化]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[アクセス修飾子]:https://qiita.com/takahirocook/items/e51b0b9d37d95ad587fe
[フィールド]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[フィールド変数]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[new演算子]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[カプセル化]:https://qiita.com/takahirocook/items/e469a7c0539a0012868e
[クラス]:https://qiita.com/takahirocook/items/50cbbdca8e21539170e9
[メソッド]:https://qiita.com/takahirocook/items/5bfe43576d87a2a4006c
[mainメソッド]:https://qiita.com/takahirocook/items/f4635915337303de338c
[メソッドの呼び出し]:https://qiita.com/takahirocook/items/f4635915337303de338c
[コンストラクタ]:https://qiita.com/takahirocook/items/fa1822f2f22c3786593e
[引数]:https://qiita.com/takahirocook/items/5e5b0ba79e869f4a592e
[戻り値]:https://qiita.com/takahirocook/items/3b6fa670a1d6dd4a9386
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[getter・setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[getter]:https://qiita.com/takahirocook/items/27828bc8477735612021

