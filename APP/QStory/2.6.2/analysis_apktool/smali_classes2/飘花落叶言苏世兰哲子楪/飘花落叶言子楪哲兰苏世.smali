.class public abstract L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    sput-object v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

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
    sput-object v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Landroid/os/Handler;

    .line 18
    .line 19
    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/util/Map;)V
    .locals 6

    .line 1
    const-wide v0, -0x36a5fb9a051405a7L    # -2.3208101054273945E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_1
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏楪世哲兰(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-direct {v2, v3}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;-><init>(I)V

    .line 47
    .line 48
    .line 49
    new-instance v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 50
    .line 51
    invoke-direct {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 52
    .line 53
    .line 54
    const-wide v4, -0x36a5fb8c051405a7L    # -2.320829161239942E45

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 64
    .line 65
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 66
    .line 67
    .line 68
    new-instance v4, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;

    .line 69
    .line 70
    const/4 v5, 0x6

    .line 71
    invoke-direct {v4, v5}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    iget-boolean v5, v3, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    iget-object v5, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    new-instance v4, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰世苏;

    .line 86
    .line 87
    invoke-direct {v4, p0, v2, v0, v1}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰世苏;-><init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲楪苏兰;Ljava/util/List;Ljava/util/LinkedHashSet;)V

    .line 88
    .line 89
    .line 90
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 91
    .line 92
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 93
    .line 94
    .line 95
    const-wide v4, -0x36a5fbff051405a7L    # -2.3206726313511584E45

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v4, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏世兰;

    .line 105
    .line 106
    const/4 v5, 0x0

    .line 107
    invoke-direct {v4, v1, v5}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏世兰;-><init>(Ljava/lang/Object;I)V

    .line 108
    .line 109
    .line 110
    iput-object v0, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲兰世:Ljava/lang/String;

    .line 111
    .line 112
    iput-object v4, v3, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世哲兰楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;

    .line 113
    .line 114
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 115
    .line 116
    .line 117
    const-wide v4, -0x36a52167051405a7L    # -2.3968414363627413E45

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    new-instance v4, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏哲兰世;

    .line 127
    .line 128
    const/4 v5, 0x1

    .line 129
    invoke-direct {v4, v5, v1, v2, p0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏哲兰世;-><init>(ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v0, v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(Landroid/widget/LinearLayout;Ljava/util/List;Ljava/util/LinkedHashSet;)V
    .locals 8

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
    const-wide v1, -0x36a5fb89051405a7L    # -2.320833244628345E45

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    const/high16 p2, 0x41600000    # 14.0f

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 31
    .line 32
    .line 33
    const/high16 p2, 0x41400000    # 12.0f

    .line 34
    .line 35
    invoke-static {v0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    const/16 p2, 0x11

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const v3, 0x240c0072

    .line 72
    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    invoke-virtual {v2, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const-wide v6, -0x36a57dc4051405a7L    # -2.364657530099359E45

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    check-cast v2, Landroid/view/ViewGroup;

    .line 92
    .line 93
    const v3, 0x240900c0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Ltop/suzhelan/qstory/ui/views/CustomMaterialCheckBox;

    .line 101
    .line 102
    const v6, 0x24090381

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, Landroid/widget/TextView;

    .line 110
    .line 111
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    new-instance v4, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 124
    .line 125
    const/4 v5, 0x6

    .line 126
    invoke-direct {v4, v3, p2, v1, v5}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
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
