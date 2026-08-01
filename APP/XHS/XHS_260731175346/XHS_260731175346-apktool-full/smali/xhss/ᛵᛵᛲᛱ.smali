.class public final Lxhss/ᛵᛵᛲᛱ;
.super Landroid/view/View;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/String;

.field public final ᛷᛵᛵᲈ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lxhss/ᛵᛵᛲᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lxhss/ᛵᛵᛲᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Landroid/graphics/Paint;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-wide p2, -0x433e1b858845L

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {p2, p3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    .line 29
    .line 30
    const/high16 p2, 0x42100000    # 36.0f

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 33
    .line 34
    .line 35
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lxhss/ᛵᛵᛲᛱ;->ᛷᛵᛵᲈ:Landroid/graphics/Paint;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide v2, -0x43481b858845L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, Lxhss/ᛵᛵᛲᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, v0, Lxhss/ᛵᛵᛲᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 19
    .line 20
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Lxhss/ᛱᲀᛷᛳ;->ᲁᲁᛴᲁ([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, v0, Lxhss/ᛵᛵᛲᛱ;->ᛷᛵᛵᲈ:Landroid/graphics/Paint;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/graphics/Paint;->getFontSpacing()F

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_5

    .line 43
    .line 44
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_0

    .line 59
    .line 60
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    check-cast v7, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    mul-int/2addr v7, v5

    .line 84
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    mul-int/2addr v8, v5

    .line 93
    add-int/2addr v8, v7

    .line 94
    int-to-double v7, v8

    .line 95
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    double-to-float v5, v7

    .line 100
    const/high16 v7, 0x43480000    # 200.0f

    .line 101
    .line 102
    add-float/2addr v6, v7

    .line 103
    const/high16 v7, 0x40400000    # 3.0f

    .line 104
    .line 105
    mul-float/2addr v7, v4

    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    int-to-float v8, v8

    .line 111
    const/high16 v9, 0x40000000    # 2.0f

    .line 112
    .line 113
    div-float/2addr v8, v9

    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    int-to-float v0, v0

    .line 119
    div-float/2addr v0, v9

    .line 120
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    const/high16 v11, -0x3e100000    # -30.0f

    .line 125
    .line 126
    invoke-virtual {v1, v11, v8, v0}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 127
    .line 128
    .line 129
    neg-float v0, v5

    .line 130
    move v8, v0

    .line 131
    :goto_1
    mul-float v11, v5, v9

    .line 132
    .line 133
    cmpg-float v12, v8, v11

    .line 134
    .line 135
    if-gez v12, :cond_4

    .line 136
    .line 137
    move v12, v0

    .line 138
    :goto_2
    cmpg-float v13, v12, v11

    .line 139
    .line 140
    if-gez v13, :cond_3

    .line 141
    .line 142
    :try_start_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    const/4 v14, 0x0

    .line 147
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    if-eqz v15, :cond_2

    .line 152
    .line 153
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    add-int/lit8 v16, v14, 0x1

    .line 158
    .line 159
    if-ltz v14, :cond_1

    .line 160
    .line 161
    check-cast v15, Ljava/lang/String;

    .line 162
    .line 163
    int-to-float v14, v14

    .line 164
    mul-float/2addr v14, v4

    .line 165
    add-float/2addr v14, v8

    .line 166
    invoke-virtual {v1, v15, v12, v14, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    move/from16 v14, v16

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :catchall_0
    move-exception v0

    .line 173
    goto :goto_4

    .line 174
    :cond_1
    invoke-static {}, Lxhss/ᛱᲀᛷᛳ;->ᛳᛸᛵᲀ()V

    .line 175
    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :cond_2
    add-float/2addr v12, v6

    .line 180
    goto :goto_2

    .line 181
    :goto_4
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_3
    add-float/2addr v8, v7

    .line 186
    goto :goto_1

    .line 187
    :cond_4
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_5
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 194
    .line 195
    .line 196
    throw v0
.end method
