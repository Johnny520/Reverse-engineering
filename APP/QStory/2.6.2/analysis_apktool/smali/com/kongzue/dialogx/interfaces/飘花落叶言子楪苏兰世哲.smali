.class public abstract Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final PARENT_FLAG:I

.field customView:Landroid/view/View;

.field private dialogHash:I

.field private fragment:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

.field private fragmentParentId:I

.field layoutResId:I

.field private parentViewHash:I

.field private supportFragment:Landroid/app/Fragment;

.field private waitBindRunnable:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, -0x6d

    .line 5
    .line 6
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->PARENT_FLAG:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->fragmentParentId:I

    .line 10
    .line 11
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    const-string p0, ">>>"

    .line 20
    .line 21
    const-string p1, "DialogX.init: \u521d\u59cb\u5316\u5f02\u5e38\uff0ccontext \u4e3a null \u6216\u672a\u521d\u59cb\u5316\uff0c\u8be6\u60c5\u8bf7\u67e5\u770b https://github.com/kongzue/DialogX/wiki"

    .line 22
    .line 23
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iput p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->layoutResId:I

    .line 28
    .line 29
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Landroid/app/Activity;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Landroid/widget/RelativeLayout;

    .line 38
    .line 39
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Landroid/app/Activity;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->customView:Landroid/view/View;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, -0x6d

    .line 55
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->PARENT_FLAG:I

    const/4 v0, -0x1

    .line 56
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->fragmentParentId:I

    .line 57
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->customView:Landroid/view/View;

    return-void
.end method

.method public static synthetic access$000(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->waitBindRunnable:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$002(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->waitBindRunnable:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$100(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->fragment:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public static access$200(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->fragmentParentId:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->fragmentParentId:I

    .line 11
    .line 12
    :cond_0
    iget p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->fragmentParentId:I

    .line 13
    .line 14
    return p0
.end method

.method public static synthetic access$300(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;)Landroid/app/Fragment;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->supportFragment:Landroid/app/Fragment;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public bindParent(Landroid/view/ViewGroup;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 183
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 184
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1, p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iput-object v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->waitBindRunnable:Ljava/lang/Runnable;

    return-void

    .line 185
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 186
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p1, :cond_1

    return-void

    .line 187
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 188
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_3

    .line 189
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 190
    :cond_3
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p1, p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public bindParent(Landroid/view/ViewGroup;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p2, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-direct {p2, p0, v0, p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->waitBindRunnable:Ljava/lang/Runnable;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eq v0, p1, :cond_8

    .line 25
    .line 26
    const/16 v0, -0x6d

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/view/ViewGroup;

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 82
    .line 83
    const/4 v1, -0x1

    .line 84
    const/4 v2, -0x2

    .line 85
    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p2, p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->onBind(Ljava/lang/Object;Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget v1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->dialogHash:I

    .line 111
    .line 112
    if-ne v0, v1, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget v1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->parentViewHash:I

    .line 119
    .line 120
    if-eq v0, v1, :cond_5

    .line 121
    .line 122
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->dialogHash:I

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    iput p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->parentViewHash:I

    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p0, p2, p1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->setEvent(Ljava/lang/Object;Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    :cond_5
    iget-object p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->fragment:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 142
    .line 143
    if-nez p1, :cond_6

    .line 144
    .line 145
    iget-object p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->supportFragment:Landroid/app/Fragment;

    .line 146
    .line 147
    if-eqz p1, :cond_8

    .line 148
    .line 149
    :cond_6
    iget-object p1, p2, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 150
    .line 151
    sget-object v0, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->VIEW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 152
    .line 153
    if-eq p1, v0, :cond_7

    .line 154
    .line 155
    invoke-virtual {p2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    const-string p1, "\u975e VIEW \u5b9e\u73b0\u6a21\u5f0f\u4e0d\u652f\u6301 fragment \u4f5c\u4e3a\u5b50\u5e03\u5c40\u663e\u793a\u3002\n\u5176\u539f\u56e0\u4e3a Window \u4e2d\u4e0d\u5b58\u5728 FragmentManager\uff0c\u65e0\u6cd5\u5bf9\u5b50\u5e03\u5c40\u4e2d\u7684 fragment \u8fdb\u884c\u7ba1\u7406\u3002"

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->getCustomView()Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    new-instance v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 174
    .line 175
    const/4 v1, 0x1

    .line 176
    invoke-direct {v0, p0, v1, p2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 180
    .line 181
    .line 182
    :cond_8
    :goto_0
    return-void
.end method

.method public clean()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->layoutResId:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->customView:Landroid/view/View;

    .line 6
    .line 7
    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->customView:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->layoutResId:I

    .line 14
    .line 15
    new-instance v2, Landroid/widget/RelativeLayout;

    .line 16
    .line 17
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Landroid/app/Activity;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {v2, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->customView:Landroid/view/View;

    .line 30
    .line 31
    :cond_0
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->customView:Landroid/view/View;

    .line 32
    .line 33
    return-object p0
.end method

.method public getLayoutResId()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->layoutResId:I

    .line 2
    .line 3
    return p0
.end method

.method public abstract onBind(Ljava/lang/Object;Landroid/view/View;)V
.end method

.method public onFragmentBind(Ljava/lang/Object;Landroid/view/View;Landroid/app/Fragment;Landroid/app/FragmentManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Landroid/view/View;",
            "Landroid/app/Fragment;",
            "Landroid/app/FragmentManager;",
            ")V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public onFragmentBind(Ljava/lang/Object;Landroid/view/View;Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Landroid/view/View;",
            "Landroidx/fragment/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "Landroidx/fragment/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u82cf\u5170\u696a;",
            ")V"
        }
    .end annotation

    .line 2
    return-void
.end method

.method public setCustomView(Landroid/view/View;)Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Lcom/kongzue/dialogx/interfaces/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->customView:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public setEvent(Ljava/lang/Object;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setLayoutResId(I)Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/kongzue/dialogx/interfaces/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;"
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;->layoutResId:I

    .line 2
    .line 3
    return-object p0
.end method
