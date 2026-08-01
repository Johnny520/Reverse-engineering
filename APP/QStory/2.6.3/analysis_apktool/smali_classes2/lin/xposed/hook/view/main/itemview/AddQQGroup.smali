.class public Llin/xposed/hook/view/main/itemview/AddQQGroup;
.super Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private lambda$getOnClick$0(Landroid/view/View;)V
    .locals 3

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 8
    .line 9
    .line 10
    sget-object v0, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    new-instance v0, Lcom/google/gson/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/gson/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 25
    .line 26
    const/16 v2, 0x13

    .line 27
    .line 28
    invoke-direct {v1, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0xb2c

    .line 32
    .line 33
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v2, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static {v2}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Z)L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iput-object v2, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 51
    .line 52
    new-instance v2, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    invoke-direct {v2, v0}, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v1, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪兰苏哲()Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-class v1, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/16 v1, 0xb2d

    .line 75
    .line 76
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast v0, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏兰哲;

    .line 83
    .line 84
    invoke-interface {v0}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Llin/xposed/hook/view/main/itemview/AddQQGroup$1;

    .line 89
    .line 90
    invoke-direct {v1, p0, p1}, Llin/xposed/hook/view/main/itemview/AddQQGroup$1;-><init>(Llin/xposed/hook/view/main/itemview/AddQQGroup;Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v1}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method private static synthetic lambda$showDialog$1([Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z
    .locals 0

    .line 1
    aget-object p0, p0, p5

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    new-instance p1, Landroid/content/Intent;

    .line 10
    .line 11
    const/16 p3, 0xcb

    .line 12
    .line 13
    invoke-static {p3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    new-instance p4, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const/16 p5, 0xe3

    .line 23
    .line 24
    invoke-static {p5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 p0, 0xe4

    .line 35
    .line 36
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, p3, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method private showDialog(Landroid/content/Context;Ltop/suzhelan/qstory/entity/QSResult;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ltop/suzhelan/qstory/entity/QSResult;->getData()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    new-array v2, v1, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, [Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世兰哲()L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/16 v3, 0x3ff

    .line 25
    .line 26
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iput-object v3, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 31
    .line 32
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲世兰()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ltop/suzhelan/qstory/entity/QSResult;->getMsg()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iput-object p2, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 40
    .line 41
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲世兰()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲兰世([Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance p2, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;

    .line 48
    .line 49
    invoke-direct {p2, v0, p0, p1, v1}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    iput-object p2, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 53
    .line 54
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世哲苏兰(Llin/xposed/hook/view/main/itemview/AddQQGroup;Landroid/content/Context;Ltop/suzhelan/qstory/entity/QSResult;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Llin/xposed/hook/view/main/itemview/AddQQGroup;->showDialog(Landroid/content/Context;Ltop/suzhelan/qstory/entity/QSResult;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲([Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Llin/xposed/hook/view/main/itemview/AddQQGroup;->lambda$showDialog$1([Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;Ljava/lang/CharSequence;I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/view/main/itemview/AddQQGroup;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/AddQQGroup;->lambda$getOnClick$0(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getLeftText()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x3fe

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getOnClick()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
