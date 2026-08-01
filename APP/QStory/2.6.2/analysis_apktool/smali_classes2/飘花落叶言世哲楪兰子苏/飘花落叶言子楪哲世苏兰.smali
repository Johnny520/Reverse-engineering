.class public final L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;
.super Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪兰哲世苏:I

.field public static 飘花落叶言子楪兰哲苏世:Ljava/lang/String;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Landroid/widget/HorizontalScrollView;

.field public 飘花落叶言子楪兰世苏哲:Lcom/lxj/xpopup/widget/VerticalRecyclerView;

.field public 飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪兰苏哲世:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/HashSet;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance p1, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/HashSet;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public getImplLayoutId()I
    .locals 0

    .line 1
    const p0, 0x240c005b

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public getMaxHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    const v0, 0x3f333333    # 0.7f

    .line 11
    .line 12
    .line 13
    mul-float/2addr p0, v0

    .line 14
    float-to-int p0, p0

    .line 15
    return p0
.end method

.method public getPopupHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    const v0, 0x3f333333    # 0.7f

    .line 11
    .line 12
    .line 13
    mul-float/2addr p0, v0

    .line 14
    float-to-int p0, p0

    .line 15
    return p0
.end method

.method public final onCreate()V
    .locals 9

    .line 1
    const v0, 0x24090143

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroid/widget/HorizontalScrollView;

    .line 9
    .line 10
    iput-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Landroid/widget/HorizontalScrollView;

    .line 11
    .line 12
    const v0, 0x2409001a

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    new-instance v4, Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const v6, 0x24060097

    .line 59
    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 67
    .line 68
    .line 69
    const/high16 v5, 0x41c00000    # 24.0f

    .line 70
    .line 71
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 72
    .line 73
    .line 74
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 75
    .line 76
    const/4 v6, -0x2

    .line 77
    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    const/high16 v7, 0x41200000    # 10.0f

    .line 85
    .line 86
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-static {v8, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    invoke-virtual {v5, v6, v3, v7, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 105
    .line 106
    .line 107
    iget-object v3, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    new-instance v3, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;

    .line 113
    .line 114
    const/4 v5, 0x4

    .line 115
    invoke-direct {v3, p0, v5, v2}, Llin/xposed/hook/view/main/itemview/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    .line 120
    .line 121
    new-instance v3, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;

    .line 122
    .line 123
    const/4 v5, 0x1

    .line 124
    invoke-direct {v3, p0, v5, v2}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_0
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    .line 140
    .line 141
    .line 142
    const v0, 0x240902aa

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Lcom/lxj/xpopup/widget/VerticalRecyclerView;

    .line 150
    .line 151
    iput-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Lcom/lxj/xpopup/widget/VerticalRecyclerView;

    .line 152
    .line 153
    new-instance v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

    .line 154
    .line 155
    iget-object v1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;-><init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;Ljava/util/ArrayList;)V

    .line 158
    .line 159
    .line 160
    iput-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

    .line 161
    .line 162
    iget-object v1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Lcom/lxj/xpopup/widget/VerticalRecyclerView;

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 165
    .line 166
    .line 167
    sget-object v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {p0, v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Lcom/lxj/xpopup/widget/VerticalRecyclerView;

    .line 173
    .line 174
    new-instance v0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰哲世;

    .line 175
    .line 176
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/飘花落叶言子苏哲楪兰世;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public final onDismiss()V
    .locals 3

    .line 1
    iget-object p0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/View;

    .line 18
    .line 19
    sget-object v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v2, Lcom/bumptech/glide/飘花落叶言子楪哲世兰苏;

    .line 29
    .line 30
    invoke-direct {v2, v0}, Lcom/bumptech/glide/飘花落叶言子楪哲世兰苏;-><init>(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(L飘花落叶言楪世哲苏子兰/飘花落叶言子楪世兰苏哲;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;)Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Lcom/bumptech/glide/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V
    .locals 11

    .line 1
    iget-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v2, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    array-length v5, v1

    .line 38
    new-array v6, v5, [L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;

    .line 39
    .line 40
    move v7, v3

    .line 41
    :goto_0
    array-length v8, v1

    .line 42
    if-ge v7, v8, :cond_0

    .line 43
    .line 44
    new-instance v8, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;

    .line 45
    .line 46
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    aput-object v8, v6, v7

    .line 50
    .line 51
    aget-object v9, v1, v7

    .line 52
    .line 53
    iput-object v9, v8, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/io/File;

    .line 54
    .line 55
    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    .line 56
    .line 57
    .line 58
    move-result-wide v9

    .line 59
    iput-wide v9, v8, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 60
    .line 61
    add-int/lit8 v7, v7, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    new-instance v7, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;

    .line 65
    .line 66
    const/4 v8, 0x6

    .line 67
    invoke-direct {v7, v8}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v6, v7}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 71
    .line 72
    .line 73
    move v7, v3

    .line 74
    :goto_1
    if-ge v7, v5, :cond_1

    .line 75
    .line 76
    aget-object v8, v6, v7

    .line 77
    .line 78
    iget-object v8, v8, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/io/File;

    .line 79
    .line 80
    aput-object v8, v1, v7

    .line 81
    .line 82
    add-int/lit8 v7, v7, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    array-length v5, v1

    .line 86
    move v6, v3

    .line 87
    :goto_2
    if-ge v6, v5, :cond_3

    .line 88
    .line 89
    aget-object v7, v1, v6

    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_2

    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    const-wide v9, -0x36a52106051405a7L    # -2.3969734659211066E45

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-nez v8, :cond_2

    .line 115
    .line 116
    new-instance v8, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;

    .line 117
    .line 118
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput v4, v8, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:I

    .line 122
    .line 123
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    iput-object v7, v8, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    iput-object v2, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    div-int/lit8 v1, v1, 0x4

    .line 145
    .line 146
    add-int/2addr v1, v4

    .line 147
    move v2, v3

    .line 148
    :goto_3
    if-ge v2, v1, :cond_4

    .line 149
    .line 150
    new-instance v4, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_4
    :goto_4
    iget-object v1, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-ge v3, v1, :cond_5

    .line 168
    .line 169
    div-int/lit8 v1, v3, 0x4

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Ljava/util/ArrayList;

    .line 176
    .line 177
    iget-object v2, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    add-int/lit8 v3, v3, 0x1

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_5
    iget-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏兰世哲;

    .line 192
    .line 193
    invoke-virtual {v0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏()V

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Lcom/lxj/xpopup/widget/VerticalRecyclerView;

    .line 197
    .line 198
    new-instance v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 199
    .line 200
    const/16 v2, 0x11

    .line 201
    .line 202
    invoke-direct {v1, p0, v2}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    const-wide/16 v2, 0x64

    .line 206
    .line 207
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 208
    .line 209
    .line 210
    sput-object p1, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/String;

    .line 211
    .line 212
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const v3, 0x2408012f

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, v3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    move v1, v5

    .line 59
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-ge v1, v2, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    iget-object v0, p0, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Landroid/widget/HorizontalScrollView;

    .line 78
    .line 79
    new-instance v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;

    .line 80
    .line 81
    invoke-direct {v2, p0, v1, v5}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Landroid/view/View;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0, v3, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method
