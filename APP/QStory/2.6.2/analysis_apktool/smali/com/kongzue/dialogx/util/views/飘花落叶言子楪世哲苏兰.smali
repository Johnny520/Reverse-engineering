.class public final Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;
.super Landroidx/core/view/飘花落叶言子苏哲世楪兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:I


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 18
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    iput-object p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;-><init>(I)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 3
    .line 4
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子苏哲世兰楪(Landroidx/core/view/飘花落叶言子哲兰世苏楪;Ljava/util/List;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;
    .locals 8

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/RectF;

    .line 15
    .line 16
    const/high16 v2, 0x3f800000    # 1.0f

    .line 17
    .line 18
    invoke-direct {v0, v2, v2, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ltz v2, :cond_5

    .line 30
    .line 31
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Landroidx/core/view/飘花落叶言子苏兰哲世楪;

    .line 36
    .line 37
    move-object v6, v1

    .line 38
    check-cast v6, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Ljava/lang/Integer;

    .line 45
    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget-object v5, v5, Landroidx/core/view/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;

    .line 53
    .line 54
    invoke-virtual {v5}, Landroidx/core/view/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰()F

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    and-int/lit8 v7, v6, 0x1

    .line 59
    .line 60
    if-eqz v7, :cond_0

    .line 61
    .line 62
    iput v5, v0, Landroid/graphics/RectF;->left:F

    .line 63
    .line 64
    :cond_0
    and-int/lit8 v7, v6, 0x2

    .line 65
    .line 66
    if-eqz v7, :cond_1

    .line 67
    .line 68
    iput v5, v0, Landroid/graphics/RectF;->top:F

    .line 69
    .line 70
    :cond_1
    and-int/lit8 v7, v6, 0x4

    .line 71
    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    iput v5, v0, Landroid/graphics/RectF;->right:F

    .line 75
    .line 76
    :cond_2
    and-int/lit8 v7, v6, 0x8

    .line 77
    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    iput v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 81
    .line 82
    :cond_3
    or-int/2addr v4, v6

    .line 83
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    const/16 p2, 0x207

    .line 87
    .line 88
    iget-object v0, p1, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 89
    .line 90
    invoke-virtual {v0, p2}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const/16 v0, 0x40

    .line 95
    .line 96
    iget-object v1, p1, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 97
    .line 98
    invoke-virtual {v1, v0}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {p2, v0}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    add-int/lit8 p2, p2, -0x1

    .line 110
    .line 111
    :goto_1
    if-ltz p2, :cond_8

    .line 112
    .line 113
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 118
    .line 119
    iget-object v1, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 120
    .line 121
    iget-object v0, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    add-int/lit8 v1, v1, -0x1

    .line 128
    .line 129
    :goto_2
    if-ltz v1, :cond_7

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    and-int v2, v3, v4

    .line 141
    .line 142
    if-nez v2, :cond_6

    .line 143
    .line 144
    add-int/lit8 v1, v1, -0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    const/4 p0, 0x0

    .line 148
    throw p0

    .line 149
    :cond_7
    add-int/lit8 p2, p2, -0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_8
    return-object p1

    .line 153
    :pswitch_0
    check-cast p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 154
    .line 155
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    sget p2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏哲楪兰:I

    .line 159
    .line 160
    new-instance p2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 161
    .line 162
    check-cast v1, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 163
    .line 164
    invoke-direct {p2, v1}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;-><init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p1, p2}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/core/view/飘花落叶言子哲兰世苏楪;Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 168
    .line 169
    .line 170
    return-object p1

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子苏哲世楪兰(Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/core/view/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/core/view/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    and-int/lit16 p1, p1, 0x207

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    sub-int/2addr p1, v1

    .line 28
    :goto_0
    if-ltz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 35
    .line 36
    iget v2, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:I

    .line 37
    .line 38
    add-int/2addr v2, v1

    .line 39
    iput v2, v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:I

    .line 40
    .line 41
    add-int/lit8 p1, p1, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_0
    check-cast p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 46
    .line 47
    iput-boolean v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子苏哲兰楪世(Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;
    .locals 5

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-object p2

    .line 7
    :pswitch_0
    iget-object v0, p1, Landroidx/core/view/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/core/view/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit16 v0, v0, 0x207

    .line 14
    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    iget-object v0, p2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    iget-object v1, p2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 24
    .line 25
    iget v2, v0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 26
    .line 27
    iget v3, v1, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 28
    .line 29
    if-eq v2, v3, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_0
    iget v3, v0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 35
    .line 36
    iget v4, v1, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 37
    .line 38
    if-eq v3, v4, :cond_1

    .line 39
    .line 40
    or-int/lit8 v2, v2, 0x2

    .line 41
    .line 42
    :cond_1
    iget v3, v0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 43
    .line 44
    iget v4, v1, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 45
    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    or-int/lit8 v2, v2, 0x4

    .line 49
    .line 50
    :cond_2
    iget v0, v0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 51
    .line 52
    iget v1, v1, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 53
    .line 54
    if-eq v0, v1, :cond_3

    .line 55
    .line 56
    or-int/lit8 v2, v2, 0x8

    .line 57
    .line 58
    :cond_3
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_4
    return-object p2

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子苏哲楪世兰(Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v2, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;

    .line 10
    .line 11
    iget-object v0, v2, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v2, p1, Landroidx/core/view/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/core/view/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世哲兰苏()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    and-int/lit16 v2, v2, 0x207

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 p1, 0x1

    .line 35
    sub-int/2addr p0, p1

    .line 36
    :goto_0
    if-ltz p0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 43
    .line 44
    iget v3, v2, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:I

    .line 45
    .line 46
    if-lez v3, :cond_0

    .line 47
    .line 48
    move v4, p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move v4, v1

    .line 51
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 52
    .line 53
    iput v3, v2, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:I

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v2}, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()V

    .line 60
    .line 61
    .line 62
    :cond_1
    add-int/lit8 p0, p0, -0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return-void

    .line 66
    :pswitch_0
    check-cast v2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 67
    .line 68
    sget p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏哲楪兰:I

    .line 69
    .line 70
    iput-boolean v1, v2, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
