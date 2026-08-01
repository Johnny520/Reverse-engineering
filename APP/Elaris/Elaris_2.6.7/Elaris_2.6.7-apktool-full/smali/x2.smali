.class public final Lx2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljc;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx2;->a:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lx2;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lx2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    invoke-static {}, Lfc;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lfc;->j(Landroid/app/Activity;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public b(Landroid/view/View;ILjava/util/Set;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lx2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz p1, :cond_b

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-gt p2, v1, :cond_b

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x60

    .line 16
    .line 17
    if-ge v1, v2, :cond_b

    .line 18
    .line 19
    if-eqz p3, :cond_b

    .line 20
    .line 21
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const v3, 0x3c23d70a    # 0.01f

    .line 41
    .line 42
    .line 43
    cmpg-float v1, v1, v3

    .line 44
    .line 45
    if-gtz v1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-gtz v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    :cond_3
    if-gtz v3, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-gtz v1, :cond_5

    .line 73
    .line 74
    if-eqz v4, :cond_5

    .line 75
    .line 76
    iget v1, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 77
    .line 78
    :cond_5
    if-gtz v3, :cond_6

    .line 79
    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    iget v3, v4, Landroid/view/ViewGroup$LayoutParams;->height:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    :cond_6
    if-eqz v1, :cond_7

    .line 85
    .line 86
    if-eqz v3, :cond_7

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    :cond_7
    :goto_0
    :try_start_1
    instance-of v1, p1, Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    move-object v1, p1

    .line 94
    check-cast v1, Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-eqz v1, :cond_8

    .line 101
    .line 102
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 103
    .line 104
    .line 105
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    if-lez v1, :cond_8

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    :cond_8
    :try_start_2
    instance-of v1, p1, Landroid/widget/ImageView;

    .line 110
    .line 111
    if-eqz v1, :cond_9

    .line 112
    .line 113
    move-object v1, p1

    .line 114
    check-cast v1, Landroid/widget/ImageView;

    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 117
    .line 118
    .line 119
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    :goto_1
    new-instance v1, Lxb;

    .line 123
    .line 124
    invoke-direct {v1, p1}, Lxb;-><init>(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :catchall_2
    :cond_9
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 131
    .line 132
    if-nez v1, :cond_a

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_a
    check-cast p1, Landroid/view/ViewGroup;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    :try_start_3
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    const/16 v4, 0x30

    .line 143
    .line 144
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 145
    .line 146
    .line 147
    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 148
    goto :goto_2

    .line 149
    :catchall_3
    move v3, v1

    .line 150
    :goto_2
    if-ge v1, v3, :cond_b

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-ge v4, v2, :cond_b

    .line 157
    .line 158
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    add-int/lit8 v5, p2, 0x1

    .line 163
    .line 164
    invoke-virtual {p0, v4, v5, p3}, Lx2;->b(Landroid/view/View;ILjava/util/Set;)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v1, v1, 0x1

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_b
    :goto_3
    return-void
.end method
