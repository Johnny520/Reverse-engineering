.class public final Lxhss/ᛵᛲᲇᛴ;
.super Landroid/view/View;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛱᛳᲁᲈ:Landroid/view/animation/Interpolator;

.field public ᛲᛴᲀᲈ:Ljava/lang/Runnable;

.field public ᛲᛴᲇᛲ:Lxhss/ᛷᛸᲇᛸ;

.field public ᛳᛶᛷᲀ:F

.field public ᛳᲁᲇᛸ:I

.field public ᛳᲈᲈᛲ:F

.field public ᛴᲈᛱᛴ:F

.field public ᛶᲇᲈᛸ:Landroid/graphics/RectF;

.field public ᛷᛴᛷᛱ:Lxhss/ᛵᛱᛲᛶ;

.field public ᛷᛵᛵᲈ:I

.field public ᛷᲁᲁ:Z

.field public ᛸᛲᛷᛱ:F

.field public ᛸᛲᲀᛵ:F

.field public ᛸᛴᛶᛳ:F

.field public ᛸᛶᛴᲈ:I

.field public ᛸᛶᲈᛶ:F

.field public ᛸᛷᲈᲈ:F

.field public ᲀᛷᲁᲀ:F

.field public ᲀᲇᛳᲁ:F

.field public ᲁᛲᛴᛴ:I

.field public ᲁᛴᲇᛲ:Landroid/animation/ValueAnimator;

.field public ᲁᲁᛴᲁ:Z

.field public ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

.field public ᲇᛶᛴᲀ:F

.field public ᲇᛸᛳᲁ:F

.field public ᲈᛲᛵᲁ:I

.field public ᲈᛳᲀ:Landroid/graphics/Paint;


# virtual methods
.method public getColor()I
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    return p0
.end method

.method public getStatus()I
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    return p0
.end method

.method public getStrokeWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛱᛲᛶ;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-boolean v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 13
    .line 14
    :cond_1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    iget-object v5, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 10
    .line 11
    const v3, 0x43b68000    # 365.0f

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v0, p1

    .line 17
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object v0, p1

    .line 22
    iget-boolean p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᲁᛴᲁ:Z

    .line 23
    .line 24
    const/4 v6, 0x2

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 28
    .line 29
    const v3, 0x43b68000    # 365.0f

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    iput v6, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 38
    .line 39
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ(ILandroid/graphics/Canvas;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 46
    .line 47
    const/high16 v7, 0x43b40000    # 360.0f

    .line 48
    .line 49
    if-eqz p1, :cond_9

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x1

    .line 53
    if-eq p1, v9, :cond_5

    .line 54
    .line 55
    if-eq p1, v6, :cond_5

    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    if-eq p1, v1, :cond_5

    .line 59
    .line 60
    const/4 v1, 0x4

    .line 61
    if-eq p1, v1, :cond_2

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    if-eq p1, v9, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 73
    .line 74
    const/high16 v3, 0x43b40000    # 360.0f

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 79
    .line 80
    .line 81
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ(ILandroid/graphics/Canvas;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 88
    .line 89
    iget v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛶᛴᲀ:F

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 93
    .line 94
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 95
    .line 96
    .line 97
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛶᛴᲀ:F

    .line 98
    .line 99
    const v0, 0x43b68000    # 365.0f

    .line 100
    .line 101
    .line 102
    cmpl-float p1, p1, v0

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    iput v9, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 107
    .line 108
    iget-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 109
    .line 110
    if-eqz p1, :cond_8

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 113
    .line 114
    .line 115
    iput-object v8, p0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    if-eq p1, v9, :cond_6

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 126
    .line 127
    const/high16 v3, 0x43b40000    # 360.0f

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v0}, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ(ILandroid/graphics/Canvas;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_7
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛴᲈᛱᛴ:F

    .line 141
    .line 142
    const/high16 v1, 0x40a00000    # 5.0f

    .line 143
    .line 144
    add-float v3, p1, v1

    .line 145
    .line 146
    iput v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᛴᲈᛱᛴ:F

    .line 147
    .line 148
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 149
    .line 150
    iget v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛲᛷᛱ:F

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 154
    .line 155
    .line 156
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛴᲈᛱᛴ:F

    .line 157
    .line 158
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᛶᛷᲀ:F

    .line 159
    .line 160
    sub-float/2addr v7, v0

    .line 161
    sub-float/2addr p1, v7

    .line 162
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛲᛷᛱ:F

    .line 163
    .line 164
    cmpl-float p1, p1, v0

    .line 165
    .line 166
    if-ltz p1, :cond_8

    .line 167
    .line 168
    iput v9, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 169
    .line 170
    iget-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 171
    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 175
    .line 176
    .line 177
    iput-object v8, p0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 178
    .line 179
    :cond_8
    :goto_0
    return-void

    .line 180
    :cond_9
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛷᲈᲈ:F

    .line 181
    .line 182
    float-to-double v1, p1

    .line 183
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲀᲇᛳᲁ:F

    .line 184
    .line 185
    float-to-double v3, p1

    .line 186
    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    .line 187
    .line 188
    .line 189
    move-result-wide v3

    .line 190
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 191
    .line 192
    .line 193
    move-result-wide v3

    .line 194
    mul-double/2addr v3, v1

    .line 195
    double-to-float p1, v3

    .line 196
    iget v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛷᲈᲈ:F

    .line 197
    .line 198
    add-float/2addr p1, v1

    .line 199
    iget v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛲᲀᛵ:F

    .line 200
    .line 201
    const/high16 v2, 0x40000000    # 2.0f

    .line 202
    .line 203
    div-float/2addr v1, v2

    .line 204
    add-float/2addr v1, p1

    .line 205
    iget v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛶᛴᲀ:F

    .line 206
    .line 207
    sub-float p1, v2, v1

    .line 208
    .line 209
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛲᛷᛱ:F

    .line 210
    .line 211
    const/4 v3, 0x0

    .line 212
    cmpg-float v4, p1, v3

    .line 213
    .line 214
    if-gez v4, :cond_a

    .line 215
    .line 216
    add-float/2addr p1, v7

    .line 217
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛲᛷᛱ:F

    .line 218
    .line 219
    :cond_a
    iput v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛴᲈᛱᛴ:F

    .line 220
    .line 221
    cmpg-float p1, v1, v3

    .line 222
    .line 223
    if-gez p1, :cond_b

    .line 224
    .line 225
    sub-float/2addr v7, v1

    .line 226
    goto :goto_1

    .line 227
    :cond_b
    move v7, v1

    .line 228
    :goto_1
    iput v7, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᛶᛷᲀ:F

    .line 229
    .line 230
    iget-object p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 231
    .line 232
    neg-float v3, v1

    .line 233
    const/4 v4, 0x0

    .line 234
    move-object v1, p0

    .line 235
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    int-to-float p1, p1

    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    mul-float/2addr p1, p3

    .line 8
    const/high16 p4, 0x40000000    # 2.0f

    .line 9
    .line 10
    div-float/2addr p1, p4

    .line 11
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᲈᛶ:F

    .line 12
    .line 13
    int-to-float p1, p2

    .line 14
    mul-float/2addr p1, p3

    .line 15
    div-float/2addr p1, p4

    .line 16
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛸᛳᲁ:F

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    div-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    iget p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛱᛱᛲᲇ:I

    .line 33
    .line 34
    div-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    sub-int/2addr p1, p2

    .line 37
    int-to-float p1, p1

    .line 38
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᲈᲈᛲ:F

    .line 39
    .line 40
    new-instance p1, Landroid/graphics/RectF;

    .line 41
    .line 42
    iget p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᲈᛶ:F

    .line 43
    .line 44
    iget p3, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᲈᲈᛲ:F

    .line 45
    .line 46
    sub-float p4, p2, p3

    .line 47
    .line 48
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛸᛳᲁ:F

    .line 49
    .line 50
    sub-float v1, v0, p3

    .line 51
    .line 52
    add-float/2addr p2, p3

    .line 53
    add-float/2addr v0, p3

    .line 54
    invoke-direct {p1, p4, v1, p2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛶᲇᲈᛸ:Landroid/graphics/RectF;

    .line 58
    .line 59
    return-void
.end method

.method public final ᛱᛱᛲᲇ()V
    .locals 8

    .line 1
    const-class v0, Lxhss/ᛵᛲᲇᛴ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᲁᲁ:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᲁᲁ:Z

    .line 15
    .line 16
    iget-object v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 22
    .line 23
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 29
    .line 30
    iget v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᛱᛱᛲᲇ:I

    .line 31
    .line 32
    int-to-float v3, v3

    .line 33
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 37
    .line 38
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 44
    .line 45
    iget v3, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ:I

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-class v3, Landroid/view/WindowManager;

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Landroid/view/WindowManager;

    .line 67
    .line 68
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Landroid/view/Display;->getMode()Landroid/view/Display$Mode;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Landroid/view/Display$Mode;->getRefreshRate()F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/4 v3, 0x0

    .line 81
    cmpl-float v4, v2, v3

    .line 82
    .line 83
    if-lez v4, :cond_1

    .line 84
    .line 85
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    float-to-double v6, v2

    .line 91
    div-double/2addr v4, v6

    .line 92
    double-to-long v4, v4

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    const-wide/16 v4, 0x10

    .line 95
    .line 96
    :goto_0
    long-to-int v2, v4

    .line 97
    iget v4, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛴᛶᛳ:F

    .line 98
    .line 99
    iget v5, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛲᲀᛵ:F

    .line 100
    .line 101
    sub-float/2addr v4, v5

    .line 102
    const/high16 v5, 0x40000000    # 2.0f

    .line 103
    .line 104
    div-float/2addr v4, v5

    .line 105
    iput v4, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛷᲈᲈ:F

    .line 106
    .line 107
    const v4, 0x43b68000    # 365.0f

    .line 108
    .line 109
    .line 110
    invoke-static {v3, v4}, Lxhss/ᛵᛱᛲᛶ;->ᛷᛵᛵᲈ(FF)Lxhss/ᛵᛱᛲᛶ;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iput-object v5, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 115
    .line 116
    const-wide/16 v6, 0x3e8

    .line 117
    .line 118
    iput-wide v6, v5, Lxhss/ᛵᛱᛲᛶ;->ᛱᛱᛲᲇ:J

    .line 119
    .line 120
    new-instance v6, Landroid/view/animation/LinearInterpolator;

    .line 121
    .line 122
    invoke-direct {v6}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v6, v5, Lxhss/ᛵᛱᛲᛶ;->ᲇᛶᛴᲀ:Landroid/view/animation/Interpolator;

    .line 126
    .line 127
    iget-object v5, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 128
    .line 129
    const/4 v6, -0x1

    .line 130
    iput v6, v5, Lxhss/ᛵᛱᛲᛶ;->ᛸᛲᲀᛵ:I

    .line 131
    .line 132
    iput v2, v5, Lxhss/ᛵᛱᛲᛶ;->ᲈᛳᲀ:I

    .line 133
    .line 134
    new-instance v7, Lxhss/ᲇᛲᛵ;

    .line 135
    .line 136
    invoke-direct {v7, p0, v1}, Lxhss/ᲇᛲᛵ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 137
    .line 138
    .line 139
    iput-object v7, v5, Lxhss/ᛵᛱᛲᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛲᛵ;

    .line 140
    .line 141
    invoke-static {v3, v4}, Lxhss/ᛵᛱᛲᛶ;->ᛷᛵᛵᲈ(FF)Lxhss/ᛵᛱᛲᛶ;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iput-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛱᛲᛶ;

    .line 146
    .line 147
    const-wide/16 v3, 0x5dc

    .line 148
    .line 149
    iput-wide v3, v1, Lxhss/ᛵᛱᛲᛶ;->ᛱᛱᛲᲇ:J

    .line 150
    .line 151
    iput v2, v1, Lxhss/ᛵᛱᛲᛶ;->ᲈᛳᲀ:I

    .line 152
    .line 153
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 154
    .line 155
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v2, v1, Lxhss/ᛵᛱᛲᛶ;->ᲇᛶᛴᲀ:Landroid/view/animation/Interpolator;

    .line 159
    .line 160
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛱᛲᛶ;

    .line 161
    .line 162
    iput v6, v1, Lxhss/ᛵᛱᛲᛶ;->ᛸᛲᲀᛵ:I

    .line 163
    .line 164
    new-instance v2, Lxhss/ᲇᛲᛵ;

    .line 165
    .line 166
    const/4 v3, 0x2

    .line 167
    invoke-direct {v2, p0, v3}, Lxhss/ᲇᛲᛵ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 168
    .line 169
    .line 170
    iput-object v2, v1, Lxhss/ᛵᛱᛲᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛲᛵ;

    .line 171
    .line 172
    invoke-virtual {v1}, Lxhss/ᛵᛱᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 173
    .line 174
    .line 175
    iget-object p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 176
    .line 177
    invoke-virtual {p0}, Lxhss/ᛵᛱᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 178
    .line 179
    .line 180
    :cond_2
    monitor-exit v0

    .line 181
    return-void

    .line 182
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    throw p0
.end method

.method public final ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V
    .locals 2

    .line 1
    iput-object p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛱᛳᲁᲈ:Landroid/view/animation/Interpolator;

    .line 2
    .line 3
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 4
    .line 5
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᛴᲈ:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lxhss/ᲈᛵᛲᲁ;

    .line 10
    .line 11
    const/4 p2, 0x5

    .line 12
    invoke-direct {p1, p0, p2}, Lxhss/ᲈᛵᛲᲁ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲀᲈ:Ljava/lang/Runnable;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛴᲇᛲ:Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛴᲇᛲ:Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲀᛷᲁᲀ:F

    .line 30
    .line 31
    const/4 p1, 0x2

    .line 32
    new-array p2, p1, [F

    .line 33
    .line 34
    fill-array-data p2, :array_0

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iput-object p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛴᲇᛲ:Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    const-wide/16 v0, 0x12c

    .line 44
    .line 45
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛴᲇᛲ:Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    new-instance v0, Lxhss/ᛴᲇᲀᛷ;

    .line 51
    .line 52
    invoke-direct {v0, p1, p0}, Lxhss/ᛴᲇᲀᛷ;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛴᲇᛲ:Landroid/animation/ValueAnimator;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final ᛷᛵᛵᲈ(ILandroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v5, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛳᲀ:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 4
    .line 5
    iget-object v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛶᛴᲀ:Landroid/view/animation/Interpolator;

    .line 6
    .line 7
    iget-object v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛱᛳᲁᲈ:Landroid/view/animation/Interpolator;

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    iput-object v2, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛶᛴᲀ:Landroid/view/animation/Interpolator;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲇᛲ:Lxhss/ᛷᛸᲇᛸ;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    const/4 v6, 0x1

    .line 17
    const/4 v2, 0x3

    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    invoke-virtual {v0}, Lxhss/ᛷᛸᲇᛸ;->run()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛲᛴᲇᛲ:Lxhss/ᛷᛸᲇᛸ;

    .line 25
    .line 26
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 27
    .line 28
    if-eq p1, v6, :cond_3

    .line 29
    .line 30
    if-eq p1, v1, :cond_2

    .line 31
    .line 32
    if-eq p1, v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lxhss/ᲈᛵᛲᲁ;

    .line 48
    .line 49
    invoke-direct {v3, p0, v6}, Lxhss/ᲈᛵᛲᲁ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v7, 0x96

    .line 53
    .line 54
    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance v0, Landroid/os/Handler;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Lxhss/ᲈᛵᛲᲁ;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-direct {v3, p0, v4}, Lxhss/ᲈᛵᛲᲁ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 71
    .line 72
    .line 73
    const-wide/16 v7, 0xf0

    .line 74
    .line 75
    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_0
    const/high16 v0, 0x41200000    # 10.0f

    .line 83
    .line 84
    const/high16 v7, 0x40000000    # 2.0f

    .line 85
    .line 86
    if-eq p1, v6, :cond_9

    .line 87
    .line 88
    if-eq p1, v1, :cond_7

    .line 89
    .line 90
    if-eq p1, v2, :cond_5

    .line 91
    .line 92
    return-void

    .line 93
    :cond_5
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛸᛳᲁ:F

    .line 94
    .line 95
    iget v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᲈᲈᛲ:F

    .line 96
    .line 97
    const/high16 v2, 0x40800000    # 4.0f

    .line 98
    .line 99
    mul-float/2addr v1, v2

    .line 100
    div-float/2addr v1, v0

    .line 101
    sub-float/2addr p1, v1

    .line 102
    float-to-int p1, p1

    .line 103
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᲈᛶ:F

    .line 104
    .line 105
    add-float/2addr v1, v0

    .line 106
    float-to-int v0, v1

    .line 107
    iget v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲀᛷᲁᲀ:F

    .line 108
    .line 109
    const/high16 v6, 0x3f000000    # 0.5f

    .line 110
    .line 111
    cmpg-float v2, v1, v6

    .line 112
    .line 113
    if-gez v2, :cond_6

    .line 114
    .line 115
    move v2, v1

    .line 116
    int-to-float v1, p1

    .line 117
    mul-float/2addr v2, v7

    .line 118
    sub-int/2addr v0, p1

    .line 119
    int-to-float p1, v0

    .line 120
    mul-float/2addr v2, p1

    .line 121
    add-float/2addr v2, v1

    .line 122
    float-to-int p1, v2

    .line 123
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛲᛴᛴ:I

    .line 124
    .line 125
    iput p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛲᛵᲁ:I

    .line 126
    .line 127
    int-to-float v3, p1

    .line 128
    move v2, v1

    .line 129
    move v4, v3

    .line 130
    move-object v0, p2

    .line 131
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    move v2, v0

    .line 136
    move-object v0, p2

    .line 137
    move p2, v2

    .line 138
    move v2, v1

    .line 139
    int-to-float v1, p1

    .line 140
    mul-float/2addr v2, v7

    .line 141
    sub-int p1, p2, p1

    .line 142
    .line 143
    int-to-float p1, p1

    .line 144
    mul-float/2addr v2, p1

    .line 145
    add-float/2addr v2, v1

    .line 146
    float-to-int v2, v2

    .line 147
    iput v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛲᛴᛴ:I

    .line 148
    .line 149
    iput v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛲᛵᲁ:I

    .line 150
    .line 151
    int-to-float v3, p2

    .line 152
    move v2, v1

    .line 153
    move v4, v3

    .line 154
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 155
    .line 156
    .line 157
    iget p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲀᛷᲁᲀ:F

    .line 158
    .line 159
    sub-float/2addr p0, v6

    .line 160
    mul-float/2addr p0, v7

    .line 161
    mul-float/2addr p0, p1

    .line 162
    sub-float p1, v3, p0

    .line 163
    .line 164
    float-to-int p1, p1

    .line 165
    add-float/2addr p0, v1

    .line 166
    float-to-int p0, p0

    .line 167
    int-to-float p1, p1

    .line 168
    int-to-float v4, p0

    .line 169
    move v1, v3

    .line 170
    move v3, p1

    .line 171
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_7
    move-object v0, p2

    .line 176
    iget p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᲈᛶ:F

    .line 177
    .line 178
    float-to-int p1, p1

    .line 179
    iget p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛸᛳᲁ:F

    .line 180
    .line 181
    iget v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᲈᲈᛲ:F

    .line 182
    .line 183
    const/high16 v2, 0x3f800000    # 1.0f

    .line 184
    .line 185
    mul-float/2addr v2, v1

    .line 186
    div-float v3, v2, v7

    .line 187
    .line 188
    sub-float v3, p2, v3

    .line 189
    .line 190
    float-to-int v3, v3

    .line 191
    const/high16 v4, 0x41000000    # 8.0f

    .line 192
    .line 193
    div-float/2addr v2, v4

    .line 194
    add-float/2addr v2, p2

    .line 195
    float-to-int v2, v2

    .line 196
    const/high16 v4, 0x40400000    # 3.0f

    .line 197
    .line 198
    mul-float/2addr v1, v4

    .line 199
    const/high16 v4, 0x40e00000    # 7.0f

    .line 200
    .line 201
    div-float/2addr v1, v4

    .line 202
    add-float/2addr v1, p2

    .line 203
    float-to-int p2, v1

    .line 204
    iget p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲀᛷᲁᲀ:F

    .line 205
    .line 206
    const v1, 0x3f666666    # 0.9f

    .line 207
    .line 208
    .line 209
    cmpg-float v1, p0, v1

    .line 210
    .line 211
    if-gez v1, :cond_8

    .line 212
    .line 213
    int-to-float v1, p1

    .line 214
    move v4, v2

    .line 215
    int-to-float v2, v3

    .line 216
    sub-int p1, v4, v3

    .line 217
    .line 218
    int-to-float p1, p1

    .line 219
    mul-float/2addr p1, p0

    .line 220
    add-float v4, p1, v2

    .line 221
    .line 222
    move v3, v1

    .line 223
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_8
    move v4, v2

    .line 228
    int-to-float v1, p1

    .line 229
    int-to-float v2, v3

    .line 230
    int-to-float v4, v4

    .line 231
    move v3, v1

    .line 232
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 233
    .line 234
    .line 235
    int-to-float v2, p2

    .line 236
    add-int/2addr p2, v6

    .line 237
    int-to-float v4, p2

    .line 238
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :cond_9
    move-object p1, p2

    .line 243
    iget p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛳᲈᲈᛲ:F

    .line 244
    .line 245
    const/high16 v1, 0x41a00000    # 20.0f

    .line 246
    .line 247
    div-float v1, p2, v1

    .line 248
    .line 249
    float-to-int v1, v1

    .line 250
    iget v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛸᛶᲈᛶ:F

    .line 251
    .line 252
    div-float v0, p2, v0

    .line 253
    .line 254
    sub-float v0, v2, v0

    .line 255
    .line 256
    int-to-float v1, v1

    .line 257
    sub-float/2addr v0, v1

    .line 258
    float-to-int v0, v0

    .line 259
    div-float/2addr p2, v7

    .line 260
    sub-float v3, v2, p2

    .line 261
    .line 262
    float-to-int v3, v3

    .line 263
    iget v4, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛸᛳᲁ:F

    .line 264
    .line 265
    add-float/2addr v4, v1

    .line 266
    float-to-int v1, v4

    .line 267
    add-float/2addr p2, v2

    .line 268
    float-to-int p2, p2

    .line 269
    int-to-float v2, v3

    .line 270
    sub-int/2addr p2, v3

    .line 271
    int-to-float p2, p2

    .line 272
    iget v4, p0, Lxhss/ᛵᛲᲇᛴ;->ᲀᛷᲁᲀ:F

    .line 273
    .line 274
    mul-float/2addr p2, v4

    .line 275
    add-float/2addr p2, v2

    .line 276
    float-to-int p2, p2

    .line 277
    new-instance v4, Landroid/graphics/Path;

    .line 278
    .line 279
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 280
    .line 281
    .line 282
    int-to-float v6, v1

    .line 283
    invoke-virtual {v4, v2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 284
    .line 285
    .line 286
    if-ge p2, v0, :cond_a

    .line 287
    .line 288
    iput p2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛲᛴᛴ:I

    .line 289
    .line 290
    sub-int v0, p2, v3

    .line 291
    .line 292
    add-int/2addr v0, v1

    .line 293
    iput v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛲᛵᲁ:I

    .line 294
    .line 295
    int-to-float p0, p2

    .line 296
    int-to-float p2, v0

    .line 297
    invoke-virtual {v4, p0, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 298
    .line 299
    .line 300
    goto :goto_1

    .line 301
    :cond_a
    iput v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛲᛴᛴ:I

    .line 302
    .line 303
    sub-int v2, v0, v3

    .line 304
    .line 305
    add-int/2addr v2, v1

    .line 306
    iput v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛲᛵᲁ:I

    .line 307
    .line 308
    int-to-float v0, v0

    .line 309
    int-to-float v1, v2

    .line 310
    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 311
    .line 312
    .line 313
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲈᛲᛵᲁ:I

    .line 314
    .line 315
    iget p0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᛲᛴᛴ:I

    .line 316
    .line 317
    sub-int p0, p2, p0

    .line 318
    .line 319
    sub-int/2addr v0, p0

    .line 320
    int-to-float p0, p2

    .line 321
    int-to-float p2, v0

    .line 322
    invoke-virtual {v4, p0, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 323
    .line 324
    .line 325
    :goto_1
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 326
    .line 327
    .line 328
    return-void
.end method

.method public final ᲇᛴᲇᛵ(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛱᛲᛶ;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-boolean v1, v0, Lxhss/ᛵᛱᛲᛶ;->ᲇᛴᲇᛵ:Z

    .line 13
    .line 14
    :cond_1
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛶᛴᲀ:F

    .line 21
    .line 22
    :cond_2
    iput-boolean v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲁᲁᛴᲁ:Z

    .line 23
    .line 24
    iput v2, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 25
    .line 26
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛶᛴᲀ:F

    .line 27
    .line 28
    const v2, 0x43b68000    # 365.0f

    .line 29
    .line 30
    .line 31
    mul-float/2addr p1, v2

    .line 32
    invoke-static {v0, p1}, Lxhss/ᛵᛱᛲᛶ;->ᛷᛵᛵᲈ(FF)Lxhss/ᛵᛱᛲᛶ;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 37
    .line 38
    const-wide/16 v2, 0x3e8

    .line 39
    .line 40
    iput-wide v2, p1, Lxhss/ᛵᛱᛲᛶ;->ᛱᛱᛲᲇ:J

    .line 41
    .line 42
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 43
    .line 44
    const/high16 v2, 0x40000000    # 2.0f

    .line 45
    .line 46
    invoke-direct {v0, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p1, Lxhss/ᛵᛱᛲᛶ;->ᲇᛶᛴᲀ:Landroid/view/animation/Interpolator;

    .line 50
    .line 51
    iget-object p1, p0, Lxhss/ᛵᛲᲇᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛵᛱᛲᛶ;

    .line 52
    .line 53
    iput v1, p1, Lxhss/ᛵᛱᛲᛶ;->ᛸᛲᲀᛵ:I

    .line 54
    .line 55
    new-instance v0, Lxhss/ᲇᛲᛵ;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, Lxhss/ᲇᛲᛵ;-><init>(Lxhss/ᛵᛲᲇᛴ;I)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p1, Lxhss/ᛵᛱᛲᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛲᛵ;

    .line 61
    .line 62
    invoke-virtual {p1}, Lxhss/ᛵᛱᛲᛶ;->ᛱᛱᛲᲇ()V

    .line 63
    .line 64
    .line 65
    return-void
.end method
