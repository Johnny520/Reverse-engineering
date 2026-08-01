.class public abstract L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public static final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide v1, -0x36a50e3f051405a7L    # -2.4035164152722624E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;
    .locals 10

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 28
    :goto_1
    sget-object v1, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 31
    .line 32
    .line 33
    new-instance v6, Ljava/io/File;

    .line 34
    .line 35
    invoke-direct {v6, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {v6}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 52
    .line 53
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 54
    .line 55
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 56
    .line 57
    .line 58
    const/high16 v0, 0x41700000    # 15.0f

    .line 59
    .line 60
    invoke-virtual {v8, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 61
    .line 62
    .line 63
    const/16 v1, 0xc8

    .line 64
    .line 65
    invoke-virtual {v8, v1}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 66
    .line 67
    .line 68
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v3, 0x1d

    .line 71
    .line 72
    if-lt v2, v3, :cond_3

    .line 73
    .line 74
    invoke-static {v8}, Landroidx/core/view/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏兰哲世(Landroid/graphics/drawable/GradientDrawable;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    const v4, 0x24060483

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v4}, Landroid/content/Context;->getColor(I)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    const/4 v5, 0x2

    .line 85
    invoke-virtual {v8, v5, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 86
    .line 87
    .line 88
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 89
    .line 90
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v1}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 97
    .line 98
    .line 99
    if-lt v2, v3, :cond_4

    .line 100
    .line 101
    invoke-static {v9}, Landroidx/core/view/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏兰哲世(Landroid/graphics/drawable/GradientDrawable;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    const v0, 0x2406047e

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {v9, v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const v1, 0x240c00f2

    .line 119
    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Landroid/widget/ScrollView;

    .line 127
    .line 128
    const v1, 0x240902ee

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    move-object v5, v1

    .line 136
    check-cast v5, Landroid/widget/LinearLayout;

    .line 137
    .line 138
    new-instance v2, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;

    .line 139
    .line 140
    move-object v4, p0

    .line 141
    move-object v3, p1

    .line 142
    move-object v7, p2

    .line 143
    invoke-direct/range {v2 .. v9}, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世哲苏兰;-><init>(Landroid/content/Context;Landroid/app/Dialog;Landroid/widget/LinearLayout;Ljava/io/File;Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 147
    .line 148
    .line 149
    sget-object p0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/atomic/AtomicLong;

    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    .line 152
    .line 153
    .line 154
    move-result-wide p1

    .line 155
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 156
    .line 157
    .line 158
    return-object v0
.end method
