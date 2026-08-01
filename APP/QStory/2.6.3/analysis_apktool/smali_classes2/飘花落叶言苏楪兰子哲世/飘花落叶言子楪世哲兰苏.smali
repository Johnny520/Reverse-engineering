.class public final L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲兰苏;
.super L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final synthetic 飘花落叶言子楪苏哲兰世:I


# instance fields
.field public final 飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    return-void
.end method

.method public static 飘花落叶言子世楪哲兰苏(Landroid/widget/TextView;Landroid/widget/LinearLayout;)V
    .locals 5

    .line 1
    new-instance v0, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x12c

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰(J)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v1, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-static {v1, v0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Landroid/view/ViewGroup;L飘花落叶言子兰世哲楪苏/飘花落叶言子楪苏兰哲世;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v2

    .line 36
    :goto_0
    const/4 v1, 0x1

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v0, v1

    .line 45
    :goto_1
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const v3, 0x7fffffff

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 61
    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    move-object v2, v3

    .line 65
    check-cast v2, Ljava/lang/Boolean;

    .line 66
    .line 67
    :cond_2
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const/4 v2, 0x2

    .line 81
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 82
    .line 83
    .line 84
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 85
    .line 86
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 87
    .line 88
    .line 89
    const/16 v2, 0x8

    .line 90
    .line 91
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_2
    xor-int/lit8 p1, v0, 0x1

    .line 95
    .line 96
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public static 飘花落叶言子世楪哲苏兰(Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 9
    .line 10
    .line 11
    iput-object p1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 14
    .line 15
    .line 16
    new-instance p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    const/16 p1, 0xc

    .line 19
    .line 20
    invoke-direct {p0, p1}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏哲兰世;

    .line 24
    .line 25
    iget-boolean p1, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    new-instance p0, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;

    .line 33
    .line 34
    const/4 p1, 0x5

    .line 35
    invoke-direct {p0, p2, p1}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    const-string p1, "\u590d\u5236"

    .line 39
    .line 40
    invoke-virtual {v0, p1, p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 41
    .line 42
    .line 43
    new-instance p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;

    .line 44
    .line 45
    const/4 p1, 0x7

    .line 46
    invoke-direct {p0, p1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const-string p1, "\u53d6\u6d88"

    .line 50
    .line 51
    iput-object p1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世哲楪兰:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;

    .line 54
    .line 55
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static 飘花落叶言子世楪苏兰哲(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "clipboard"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/content/ClipboardManager;

    .line 11
    .line 12
    const-string v0, "text"

    .line 13
    .line 14
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p0

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v0, "\u590d\u5236\u5931\u8d25\uff1a"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子世哲兰苏楪(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲苏世(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 0

    .line 1
    invoke-static {p1}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const p1, 0x240c0070

    .line 6
    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p0}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;-><init>(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    check-cast v2, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    if-eqz v2, :cond_5

    .line 12
    .line 13
    new-instance v3, L飘花落叶言子楪苏哲兰世/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    invoke-virtual {v0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const v5, 0x2413000b

    .line 20
    .line 21
    .line 22
    invoke-direct {v3, v4, v5}, L飘花落叶言子楪苏哲兰世/飘花落叶言子楪世哲兰苏;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    const v4, 0x24090285

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v4}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v6}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    new-instance v7, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v5, " v"

    .line 59
    .line 60
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    const v5, 0x24090282

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v5}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v6}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    new-instance v7, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v8, "\u4f5c\u8005: "

    .line 93
    .line 94
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    const v6, 0x24090283

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v6}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Landroid/widget/TextView;

    .line 115
    .line 116
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {v7}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    const/4 v7, 0x2

    .line 128
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 129
    .line 130
    .line 131
    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 132
    .line 133
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 134
    .line 135
    .line 136
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {v6, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰()I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    new-instance v9, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v10, "\u4e0b\u8f7d: "

    .line 148
    .line 149
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const v9, 0x2409012b

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v9, v8}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    sget v8, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 166
    .line 167
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-static {v8}, L飘花落叶言苏楪兰哲子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    const v9, 0x24090376

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v9, v8}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    const v8, 0x24090286

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v8}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    check-cast v8, Ltop/suzhelan/plugin/sdk/online/widget/CustomChipGroup;

    .line 189
    .line 190
    invoke-virtual {v8}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-virtual {v9}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    const/4 v11, 0x0

    .line 210
    if-eqz v10, :cond_0

    .line 211
    .line 212
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    check-cast v10, Ljava/lang/String;

    .line 217
    .line 218
    new-instance v12, Lcom/google/android/material/chip/Chip;

    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    invoke-direct {v12, v3, v13}, Lcom/google/android/material/chip/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v11}, Landroid/view/View;->setClickable(Z)V

    .line 228
    .line 229
    .line 230
    const v10, 0x24130294

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v10}, Lcom/google/android/material/chip/Chip;->setTextAppearance(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    goto :goto_0

    .line 240
    :cond_0
    const v3, 0x240902a2

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v3}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, Landroid/widget/LinearLayout;

    .line 248
    .line 249
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    const/4 v9, 0x1

    .line 265
    if-ne v8, v9, :cond_1

    .line 266
    .line 267
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    if-nez v8, :cond_1

    .line 284
    .line 285
    move v8, v9

    .line 286
    goto :goto_1

    .line 287
    :cond_1
    move v8, v11

    .line 288
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 289
    .line 290
    .line 291
    move-result-object v10

    .line 292
    invoke-virtual {v3, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    const-string v10, "{filename}"

    .line 296
    .line 297
    const-string v12, "{cloudId}"

    .line 298
    .line 299
    const-string v13, "https://plugin.suzhelan.top/api/plugin/images/{cloudId}/{filename}"

    .line 300
    .line 301
    if-eqz v8, :cond_3

    .line 302
    .line 303
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v15

    .line 323
    if-eqz v15, :cond_2

    .line 324
    .line 325
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v15

    .line 329
    check-cast v15, Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    invoke-static {v13, v12, v7}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    invoke-static {v7, v10, v15}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    new-instance v15, Landroid/widget/ImageView;

    .line 344
    .line 345
    iget-object v11, v1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 346
    .line 347
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    invoke-direct {v15, v11}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 352
    .line 353
    .line 354
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 355
    .line 356
    invoke-virtual {v15}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    const v14, 0x24070461

    .line 361
    .line 362
    .line 363
    invoke-virtual {v9, v14}, Landroid/content/res/Resources;->getDimension(I)F

    .line 364
    .line 365
    .line 366
    move-result v9

    .line 367
    float-to-int v9, v9

    .line 368
    const/4 v14, -0x1

    .line 369
    invoke-direct {v11, v9, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v15}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 373
    .line 374
    .line 375
    move-result-object v9

    .line 376
    const v14, 0x24070460

    .line 377
    .line 378
    .line 379
    invoke-virtual {v9, v14}, Landroid/content/res/Resources;->getDimension(I)F

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    float-to-int v9, v9

    .line 384
    invoke-virtual {v11, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v15, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 388
    .line 389
    .line 390
    sget-object v9, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 391
    .line 392
    invoke-virtual {v15, v9}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 393
    .line 394
    .line 395
    new-instance v9, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 396
    .line 397
    const/16 v11, 0xa

    .line 398
    .line 399
    invoke-direct {v9, v1, v2, v7, v11}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v15, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v15}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 406
    .line 407
    .line 408
    move-result-object v9

    .line 409
    invoke-virtual {v9, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    const v9, 0x240800b6

    .line 414
    .line 415
    .line 416
    invoke-virtual {v7, v9}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    check-cast v7, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 421
    .line 422
    const v9, 0x240800b8

    .line 423
    .line 424
    .line 425
    invoke-virtual {v7, v9}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 426
    .line 427
    .line 428
    move-result-object v7

    .line 429
    check-cast v7, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 430
    .line 431
    invoke-virtual {v7, v15}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v3, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 435
    .line 436
    .line 437
    const/4 v7, 0x2

    .line 438
    const/4 v9, 0x1

    .line 439
    const/4 v11, 0x0

    .line 440
    goto :goto_2

    .line 441
    :cond_2
    const/16 v7, 0x8

    .line 442
    .line 443
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 444
    .line 445
    .line 446
    goto :goto_3

    .line 447
    :cond_3
    const/16 v7, 0x8

    .line 448
    .line 449
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    .line 450
    .line 451
    .line 452
    :goto_3
    const v7, 0x24090284

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v7}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 456
    .line 457
    .line 458
    move-result-object v7

    .line 459
    check-cast v7, Landroid/widget/ImageView;

    .line 460
    .line 461
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    .line 466
    .line 467
    .line 468
    move-result-object v8

    .line 469
    invoke-virtual {v8}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()I

    .line 470
    .line 471
    .line 472
    move-result v8

    .line 473
    const v9, 0x240800cb

    .line 474
    .line 475
    .line 476
    const/4 v11, 0x1

    .line 477
    if-ne v8, v11, :cond_4

    .line 478
    .line 479
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    invoke-static {v13, v12, v8}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;

    .line 488
    .line 489
    .line 490
    move-result-object v11

    .line 491
    invoke-virtual {v11}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    .line 492
    .line 493
    .line 494
    move-result-object v11

    .line 495
    invoke-virtual {v11}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲$飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v11

    .line 499
    invoke-static {v8, v10, v11}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    invoke-static {v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Landroid/view/View;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    invoke-virtual {v10, v8}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    invoke-virtual {v8, v9}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(I)Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 512
    .line 513
    .line 514
    move-result-object v8

    .line 515
    check-cast v8, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 516
    .line 517
    invoke-virtual {v8, v7}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V

    .line 518
    .line 519
    .line 520
    goto :goto_4

    .line 521
    :cond_4
    invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 522
    .line 523
    .line 524
    :goto_4
    iget-object v7, v1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 525
    .line 526
    new-instance v8, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世苏兰哲;

    .line 527
    .line 528
    const/4 v9, 0x0

    .line 529
    invoke-direct {v8, v0, v6, v3, v9}, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲兰苏;Landroid/widget/TextView;Landroid/widget/LinearLayout;I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 533
    .line 534
    .line 535
    new-instance v7, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲苏兰;

    .line 536
    .line 537
    invoke-direct {v7, v0, v1, v2, v9}, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v4, v7}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 541
    .line 542
    .line 543
    new-instance v4, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲苏兰;

    .line 544
    .line 545
    const/4 v11, 0x1

    .line 546
    invoke-direct {v4, v0, v1, v2, v11}, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 550
    .line 551
    .line 552
    new-instance v4, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世苏兰哲;

    .line 553
    .line 554
    invoke-direct {v4, v0, v6, v3, v11}, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲兰苏;Landroid/widget/TextView;Landroid/widget/LinearLayout;I)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 558
    .line 559
    .line 560
    new-instance v3, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲苏兰;

    .line 561
    .line 562
    const/4 v4, 0x2

    .line 563
    invoke-direct {v3, v0, v1, v2, v4}, L飘花落叶言苏楪兰子哲世/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;I)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v6, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 567
    .line 568
    .line 569
    const v3, 0x240901a0

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v3}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    check-cast v3, Landroid/widget/TextView;

    .line 577
    .line 578
    new-instance v4, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 579
    .line 580
    const/16 v5, 0x17

    .line 581
    .line 582
    invoke-direct {v4, v2, v5, v0}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 586
    .line 587
    .line 588
    const v0, 0x240900f3

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v0}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    check-cast v0, Landroid/widget/TextView;

    .line 596
    .line 597
    invoke-virtual {v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲()I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    new-instance v4, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    const-string v5, "\u8bc4\u8bba("

    .line 604
    .line 605
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    const-string v3, ")"

    .line 612
    .line 613
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 621
    .line 622
    .line 623
    new-instance v3, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 624
    .line 625
    const/16 v4, 0x18

    .line 626
    .line 627
    invoke-direct {v3, v1, v4, v2}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 631
    .line 632
    .line 633
    return-void

    .line 634
    :cond_5
    const-string v0, "Check failed."

    .line 635
    .line 636
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    return-void
.end method
