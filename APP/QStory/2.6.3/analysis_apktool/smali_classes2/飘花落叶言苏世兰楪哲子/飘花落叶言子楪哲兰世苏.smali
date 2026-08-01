.class public abstract L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Landroid/os/Handler;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:Landroid/os/Handler;

    .line 18
    .line 19
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/util/Map;)V
    .locals 6

    .line 1
    const/16 v0, 0xac1

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰苏哲世()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :cond_1
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-direct {v2, v3}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;-><init>(I)V

    .line 44
    .line 45
    .line 46
    new-instance v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 47
    .line 48
    invoke-direct {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 49
    .line 50
    .line 51
    const/16 v4, 0xac2

    .line 52
    .line 53
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 58
    .line 59
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 60
    .line 61
    .line 62
    new-instance v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    const/4 v5, 0x6

    .line 65
    invoke-direct {v4, v5}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    iget-boolean v5, v3, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    iget-object v5, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    new-instance v4, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲苏兰世;

    .line 80
    .line 81
    invoke-direct {v4, p0, v2, v0, v1}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪哲苏兰世;-><init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;Ljava/util/List;Ljava/util/LinkedHashSet;)V

    .line 82
    .line 83
    .line 84
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 85
    .line 86
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 87
    .line 88
    .line 89
    const/16 v0, 0xab7

    .line 90
    .line 91
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v4, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;

    .line 96
    .line 97
    const/4 v5, 0x1

    .line 98
    invoke-direct {v4, v1, v5}, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    iput-object v0, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲兰世:Ljava/lang/String;

    .line 102
    .line 103
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世哲兰楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;

    .line 104
    .line 105
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 106
    .line 107
    .line 108
    const-string v0, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u545c\u545c\u545c\u55b5\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u545c\u545c\u545c\u545c\u55b5\u545c\u55b5\u55b5"

    .line 109
    .line 110
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v4, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏哲兰世;

    .line 115
    .line 116
    invoke-direct {v4, v5, v1, v2, p0}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏哲兰世;-><init>(ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v0, v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Landroid/widget/LinearLayout;Ljava/util/List;Ljava/util/LinkedHashSet;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance p1, Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-direct {p1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    const/16 p2, 0xac3

    .line 17
    .line 18
    invoke-static {p2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    const/high16 p2, 0x41600000    # 14.0f

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 28
    .line 29
    .line 30
    const/high16 p2, 0x41400000    # 12.0f

    .line 31
    .line 32
    invoke-static {v0, p2}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Landroid/content/Context;F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    const/16 p2, 0x11

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const v3, 0x240c0072

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const/16 v3, 0x4ff

    .line 78
    .line 79
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast v2, Landroid/view/ViewGroup;

    .line 86
    .line 87
    const v3, 0x240900c0

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 95
    .line 96
    const v6, 0x24090381

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    check-cast v6, Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    new-instance v4, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 118
    .line 119
    const/4 v5, 0x6

    .line 120
    invoke-direct {v4, v3, p2, v1, v5}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    :catch_0
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()Lcom/bumptech/glide/request/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲(Landroid/widget/ImageView;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :catch_0
    return-void
.end method
