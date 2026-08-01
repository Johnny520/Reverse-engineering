.class public final L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;
.super Landroid/view/View;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 5
    .line 6
    const/16 v0, 0x11

    .line 7
    .line 8
    invoke-direct {p1, p0, v0}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-lez v1, :cond_8

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_7

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    iget-object v3, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/util/Random;

    .line 26
    .line 27
    iget v4, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:F

    .line 28
    .line 29
    float-to-double v4, v4

    .line 30
    iget v6, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 31
    .line 32
    float-to-double v6, v6

    .line 33
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    .line 38
    .line 39
    mul-double/2addr v6, v8

    .line 40
    add-double/2addr v6, v4

    .line 41
    double-to-float v4, v6

    .line 42
    iput v4, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:F

    .line 43
    .line 44
    iget-boolean v4, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    const/4 v6, -0x1

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    iget v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 51
    .line 52
    float-to-double v7, v7

    .line 53
    invoke-virtual {v3}, Ljava/util/Random;->nextBoolean()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_0

    .line 58
    .line 59
    move v9, v6

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    move v9, v5

    .line 62
    :goto_1
    int-to-float v9, v9

    .line 63
    float-to-double v9, v9

    .line 64
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 65
    .line 66
    .line 67
    move-result-wide v11

    .line 68
    mul-double/2addr v11, v9

    .line 69
    const-wide v9, 0x3f647ae147ae147bL    # 0.0025

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    mul-double/2addr v11, v9

    .line 75
    add-double/2addr v11, v7

    .line 76
    double-to-float v7, v11

    .line 77
    iput v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 78
    .line 79
    :cond_1
    iget v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 80
    .line 81
    iget v8, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:F

    .line 82
    .line 83
    add-float/2addr v7, v8

    .line 84
    iput v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 85
    .line 86
    iget v8, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲:I

    .line 87
    .line 88
    int-to-float v8, v8

    .line 89
    cmpl-float v7, v7, v8

    .line 90
    .line 91
    if-gtz v7, :cond_2

    .line 92
    .line 93
    iget v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:F

    .line 94
    .line 95
    iget-object v8, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 96
    .line 97
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    neg-int v8, v8

    .line 102
    int-to-float v8, v8

    .line 103
    cmpg-float v7, v7, v8

    .line 104
    .line 105
    if-ltz v7, :cond_2

    .line 106
    .line 107
    iget v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:F

    .line 108
    .line 109
    iget v8, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:I

    .line 110
    .line 111
    iget-object v9, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 112
    .line 113
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    add-int/2addr v9, v8

    .line 118
    int-to-float v8, v9

    .line 119
    cmpl-float v7, v7, v8

    .line 120
    .line 121
    if-lez v7, :cond_6

    .line 122
    .line 123
    :cond_2
    iget v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世:F

    .line 124
    .line 125
    neg-float v7, v7

    .line 126
    iput v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 127
    .line 128
    invoke-virtual {v2}, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 129
    .line 130
    .line 131
    iget v7, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 132
    .line 133
    if-eqz v4, :cond_4

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/util/Random;->nextBoolean()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_3

    .line 140
    .line 141
    move v5, v6

    .line 142
    :cond_3
    int-to-double v3, v5

    .line 143
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    mul-double/2addr v5, v3

    .line 148
    int-to-double v3, v7

    .line 149
    mul-double/2addr v5, v3

    .line 150
    const-wide/high16 v3, 0x4049000000000000L    # 50.0

    .line 151
    .line 152
    div-double/2addr v5, v3

    .line 153
    double-to-float v3, v5

    .line 154
    iput v3, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    int-to-float v3, v7

    .line 158
    const/high16 v4, 0x42480000    # 50.0f

    .line 159
    .line 160
    div-float/2addr v3, v4

    .line 161
    iput v3, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 162
    .line 163
    :goto_2
    iget v3, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 164
    .line 165
    const v4, 0x3fc90fdb

    .line 166
    .line 167
    .line 168
    cmpl-float v5, v3, v4

    .line 169
    .line 170
    if-lez v5, :cond_5

    .line 171
    .line 172
    iput v4, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    const v4, -0x4036f025

    .line 176
    .line 177
    .line 178
    cmpg-float v3, v3, v4

    .line 179
    .line 180
    if-gez v3, :cond_6

    .line 181
    .line 182
    iput v4, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:F

    .line 183
    .line 184
    :cond_6
    :goto_3
    iget-object v3, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 185
    .line 186
    iget v4, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:F

    .line 187
    .line 188
    iget v2, v2, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 189
    .line 190
    const/4 v5, 0x0

    .line 191
    invoke-virtual {p1, v3, v4, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 192
    .line 193
    .line 194
    add-int/lit8 v1, v1, 0x1

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iget-object p0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 203
    .line 204
    const-wide/16 v0, 0xa

    .line 205
    .line 206
    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 207
    .line 208
    .line 209
    :cond_8
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/high16 v1, -0x80000000

    .line 13
    .line 14
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 v3, 0x3e8

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p2, v3

    .line 29
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne v0, v2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/16 v2, 0x258

    .line 41
    .line 42
    if-ne v0, v1, :cond_3

    .line 43
    .line 44
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    move p1, v2

    .line 50
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 51
    .line 52
    .line 53
    iput p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 54
    .line 55
    iput p2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 56
    .line 57
    return-void
.end method
