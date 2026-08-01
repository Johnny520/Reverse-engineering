.class public final L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏;


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Landroid/view/View;)V
    .locals 3

    .line 1
    const-wide v0, -0x36a50910051405a7L    # -2.4053226340758788E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-class v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {v0, p0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-wide v0, -0x36a516be051405a7L    # -2.4005559586800502E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x0

    .line 42
    new-array v1, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    check-cast p2, Landroid/view/ViewGroup;

    .line 51
    .line 52
    const-wide v0, -0x36a516ac051405a7L    # -2.4005804590104686E45

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-class v0, Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0, p0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Landroid/app/Activity;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const v0, 0x293283

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Landroid/widget/TextView;

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    new-instance v1, Landroid/widget/TextView;

    .line 88
    .line 89
    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v0}, Landroid/view/View;->setId(I)V

    .line 93
    .line 94
    .line 95
    const v0, 0x2406047d

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x41900000    # 18.0f

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;

    .line 115
    .line 116
    const/4 v2, 0x3

    .line 117
    invoke-direct {v0, p1, v2, p0}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 121
    .line 122
    .line 123
    const-wide p0, -0x36a51696051405a7L    # -2.4006104038587576E45

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    new-instance p0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 136
    .line 137
    const/4 p1, -0x1

    .line 138
    const/4 v0, -0x2

    .line 139
    invoke-direct {p0, p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    .line 144
    .line 145
    :cond_2
    return-void
.end method
