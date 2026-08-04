.class public final Lyyds/ᲁᲀᛵᛴ;
.super Landroid/view/View;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᛶᛳ:Lyyds/ᛸᲀᲈ;

.field public ᛱᛳᲇ:Z

.field public ᛱᲈᲁ:F

.field public ᛲᛲᲈᲈ:Landroid/graphics/Paint;

.field public ᛲᛳᛴᛸ:Landroid/view/animation/Interpolator;

.field public ᛲᛳᛶᲁ:F

.field public ᛲᛴᛳᛲ:I

.field public ᛲᛶᛱᲈ:I

.field public ᛳᛸᛴᛶ:F

.field public ᛳᲁᲁᲇ:F

.field public ᛵᛶᛲᲀ:Landroid/graphics/RectF;

.field public ᛵᲀᛵᛸ:F

.field public ᛵᲀᲈᛴ:I

.field public ᛶᛳᛶᛵ:F

.field public ᛶᛷᛲᲁ:Lyyds/ᛲᛲᛶᛶ;

.field public ᛶᛸᲀᲁ:F

.field public ᛶᲈᛴᲈ:F

.field public ᛷᛲᲈᛱ:F

.field public ᛷᛵᲇᲀ:F

.field public ᛷᛸᲇᛶ:Ljava/lang/Runnable;

.field public ᛷᲈᲈᲁ:F

.field public ᛸᛸᛷᛱ:Z

.field public ᲀᛲᛲᲇ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᛱᛲ:F

.field public ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

.field public ᲇᲈᛵᛷ:I

.field public ᲈᲀᛲᲀ:Landroid/animation/ValueAnimator;


# virtual methods
.method public getColor()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    return p0
.end method

.method public getStatus()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    return p0
.end method

.method public getStrokeWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛲᛶᛶ;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-boolean v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

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
    iget-object v5, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

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
    iget-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

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
    iget-boolean p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛸᛸᛷᛱ:Z

    .line 23
    .line 24
    const/4 v6, 0x2

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

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
    iput v6, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛲᲇ:I

    .line 38
    .line 39
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, Lyyds/ᲁᲀᛵᛴ;->ᛲᲈᲁ(ILandroid/graphics/Canvas;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

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
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛲᲇ:I

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
    iget-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

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
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, Lyyds/ᲁᲀᛵᛴ;->ᛲᲈᲁ(ILandroid/graphics/Canvas;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    iget-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

    .line 88
    .line 89
    iget v3, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᲈᲁ:F

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
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᲈᲁ:F

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
    iput v9, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛲᲇ:I

    .line 107
    .line 108
    iget-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛸᲇᛶ:Ljava/lang/Runnable;

    .line 109
    .line 110
    if-eqz p1, :cond_8

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 113
    .line 114
    .line 115
    iput-object v8, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛸᲇᛶ:Ljava/lang/Runnable;

    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛲᲇ:I

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
    iget-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

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
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v0}, Lyyds/ᲁᲀᛵᛴ;->ᛲᲈᲁ(ILandroid/graphics/Canvas;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_7
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᲈᛴᲈ:F

    .line 141
    .line 142
    const/high16 v1, 0x40a00000    # 5.0f

    .line 143
    .line 144
    add-float v3, p1, v1

    .line 145
    .line 146
    iput v3, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᲈᛴᲈ:F

    .line 147
    .line 148
    iget-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

    .line 149
    .line 150
    iget v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᛸᛴᛶ:F

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 154
    .line 155
    .line 156
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᲈᛴᲈ:F

    .line 157
    .line 158
    iget v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛸᲀᲁ:F

    .line 159
    .line 160
    sub-float/2addr v7, v0

    .line 161
    sub-float/2addr p1, v7

    .line 162
    iget v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᛸᛴᛶ:F

    .line 163
    .line 164
    cmpl-float p1, p1, v0

    .line 165
    .line 166
    if-ltz p1, :cond_8

    .line 167
    .line 168
    iput v9, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛲᲇ:I

    .line 169
    .line 170
    iget-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛸᲇᛶ:Ljava/lang/Runnable;

    .line 171
    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 175
    .line 176
    .line 177
    iput-object v8, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛸᲇᛶ:Ljava/lang/Runnable;

    .line 178
    .line 179
    :cond_8
    :goto_0
    return-void

    .line 180
    :cond_9
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛵᲇᲀ:F

    .line 181
    .line 182
    float-to-double v1, p1

    .line 183
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛳᛶᲁ:F

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
    iget v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛵᲇᲀ:F

    .line 197
    .line 198
    add-float/2addr p1, v1

    .line 199
    iget v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛲᲈᛱ:F

    .line 200
    .line 201
    const/high16 v2, 0x40000000    # 2.0f

    .line 202
    .line 203
    div-float/2addr v1, v2

    .line 204
    add-float/2addr v1, p1

    .line 205
    iget v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᲈᲁ:F

    .line 206
    .line 207
    sub-float p1, v2, v1

    .line 208
    .line 209
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᛸᛴᛶ:F

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
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᛸᛴᛶ:F

    .line 218
    .line 219
    :cond_a
    iput v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᲈᛴᲈ:F

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
    iput v7, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛸᲀᲁ:F

    .line 229
    .line 230
    iget-object p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

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
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᲁᲁᲇ:F

    .line 12
    .line 13
    int-to-float p1, p2

    .line 14
    mul-float/2addr p1, p3

    .line 15
    div-float/2addr p1, p4

    .line 16
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᛱᛲ:F

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
    iget p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲈᛵᛷ:I

    .line 33
    .line 34
    div-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    sub-int/2addr p1, p2

    .line 37
    int-to-float p1, p1

    .line 38
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛳᛶᛵ:F

    .line 39
    .line 40
    new-instance p1, Landroid/graphics/RectF;

    .line 41
    .line 42
    iget p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᲁᲁᲇ:F

    .line 43
    .line 44
    iget p3, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛳᛶᛵ:F

    .line 45
    .line 46
    sub-float p4, p2, p3

    .line 47
    .line 48
    iget v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᛱᛲ:F

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
    iput-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᛶᛲᲀ:Landroid/graphics/RectF;

    .line 58
    .line 59
    return-void
.end method

.method public final ᛲᲈᲁ(ILandroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v5, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲇᲇᛱ:Landroid/view/animation/Interpolator;

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛳᛴᛸ:Landroid/view/animation/Interpolator;

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    iput-object v2, v0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲇᲇᛱ:Landroid/view/animation/Interpolator;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᛳᛶᛳ:Lyyds/ᛸᲀᲈ;

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
    invoke-virtual {v0}, Lyyds/ᛸᲀᲈ;->run()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᛳᛶᛳ:Lyyds/ᛸᲀᲈ;

    .line 25
    .line 26
    sget-boolean v0, Lyyds/ᛷᲁᲇᲇ;->ᲀᛲᛳᲀ:Z

    .line 27
    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    if-eq p1, v6, :cond_3

    .line 31
    .line 32
    if-eq p1, v1, :cond_2

    .line 33
    .line 34
    if-eq p1, v2, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 38
    .line 39
    .line 40
    new-instance v0, Landroid/os/Handler;

    .line 41
    .line 42
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lyyds/ᛷᛱᛷ;

    .line 50
    .line 51
    invoke-direct {v3, p0, v6}, Lyyds/ᛷᛱᛷ;-><init>(Lyyds/ᲁᲀᛵᛴ;I)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v7, 0x96

    .line 55
    .line 56
    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance v0, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    new-instance v3, Lyyds/ᛷᛱᛷ;

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v3, p0, v4}, Lyyds/ᛷᛱᛷ;-><init>(Lyyds/ᲁᲀᛵᛴ;I)V

    .line 73
    .line 74
    .line 75
    const-wide/16 v7, 0xf0

    .line 76
    .line 77
    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_0
    const/high16 v0, 0x41200000    # 10.0f

    .line 85
    .line 86
    const/high16 v7, 0x40000000    # 2.0f

    .line 87
    .line 88
    if-eq p1, v6, :cond_9

    .line 89
    .line 90
    if-eq p1, v1, :cond_7

    .line 91
    .line 92
    if-eq p1, v2, :cond_5

    .line 93
    .line 94
    return-void

    .line 95
    :cond_5
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᛱᛲ:F

    .line 96
    .line 97
    iget v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛳᛶᛵ:F

    .line 98
    .line 99
    const/high16 v2, 0x40800000    # 4.0f

    .line 100
    .line 101
    mul-float/2addr v1, v2

    .line 102
    div-float/2addr v1, v0

    .line 103
    sub-float/2addr p1, v1

    .line 104
    float-to-int p1, p1

    .line 105
    iget v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᲁᲁᲇ:F

    .line 106
    .line 107
    add-float/2addr v1, v0

    .line 108
    float-to-int v0, v1

    .line 109
    iget v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᛵᛸ:F

    .line 110
    .line 111
    const/high16 v6, 0x3f000000    # 0.5f

    .line 112
    .line 113
    cmpg-float v2, v1, v6

    .line 114
    .line 115
    if-gez v2, :cond_6

    .line 116
    .line 117
    move v2, v1

    .line 118
    int-to-float v1, p1

    .line 119
    mul-float/2addr v2, v7

    .line 120
    sub-int/2addr v0, p1

    .line 121
    int-to-float p1, v0

    .line 122
    mul-float/2addr v2, p1

    .line 123
    add-float/2addr v2, v1

    .line 124
    float-to-int p1, v2

    .line 125
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᲈᛴ:I

    .line 126
    .line 127
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛶᛱᲈ:I

    .line 128
    .line 129
    int-to-float v3, p1

    .line 130
    move v2, v1

    .line 131
    move v4, v3

    .line 132
    move-object v0, p2

    .line 133
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_6
    move v2, v0

    .line 138
    move-object v0, p2

    .line 139
    move p2, v2

    .line 140
    move v2, v1

    .line 141
    int-to-float v1, p1

    .line 142
    mul-float/2addr v2, v7

    .line 143
    sub-int p1, p2, p1

    .line 144
    .line 145
    int-to-float p1, p1

    .line 146
    mul-float/2addr v2, p1

    .line 147
    add-float/2addr v2, v1

    .line 148
    float-to-int v2, v2

    .line 149
    iput v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᲈᛴ:I

    .line 150
    .line 151
    iput v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛶᛱᲈ:I

    .line 152
    .line 153
    int-to-float v3, p2

    .line 154
    move v2, v1

    .line 155
    move v4, v3

    .line 156
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 157
    .line 158
    .line 159
    iget p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᛵᛸ:F

    .line 160
    .line 161
    sub-float/2addr p0, v6

    .line 162
    mul-float/2addr p0, v7

    .line 163
    mul-float/2addr p0, p1

    .line 164
    sub-float p1, v3, p0

    .line 165
    .line 166
    float-to-int p1, p1

    .line 167
    add-float/2addr p0, v1

    .line 168
    float-to-int p0, p0

    .line 169
    int-to-float p1, p1

    .line 170
    int-to-float v4, p0

    .line 171
    move v1, v3

    .line 172
    move v3, p1

    .line 173
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_7
    move-object v0, p2

    .line 178
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᲁᲁᲇ:F

    .line 179
    .line 180
    float-to-int p1, p1

    .line 181
    iget p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᛱᛲ:F

    .line 182
    .line 183
    iget v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛳᛶᛵ:F

    .line 184
    .line 185
    const/high16 v2, 0x3f800000    # 1.0f

    .line 186
    .line 187
    mul-float/2addr v2, v1

    .line 188
    div-float v3, v2, v7

    .line 189
    .line 190
    sub-float v3, p2, v3

    .line 191
    .line 192
    float-to-int v3, v3

    .line 193
    const/high16 v4, 0x41000000    # 8.0f

    .line 194
    .line 195
    div-float/2addr v2, v4

    .line 196
    add-float/2addr v2, p2

    .line 197
    float-to-int v2, v2

    .line 198
    const/high16 v4, 0x40400000    # 3.0f

    .line 199
    .line 200
    mul-float/2addr v1, v4

    .line 201
    const/high16 v4, 0x40e00000    # 7.0f

    .line 202
    .line 203
    div-float/2addr v1, v4

    .line 204
    add-float/2addr v1, p2

    .line 205
    float-to-int p2, v1

    .line 206
    iget p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᛵᛸ:F

    .line 207
    .line 208
    const v1, 0x3f666666    # 0.9f

    .line 209
    .line 210
    .line 211
    cmpg-float v1, p0, v1

    .line 212
    .line 213
    if-gez v1, :cond_8

    .line 214
    .line 215
    int-to-float v1, p1

    .line 216
    move v4, v2

    .line 217
    int-to-float v2, v3

    .line 218
    sub-int p1, v4, v3

    .line 219
    .line 220
    int-to-float p1, p1

    .line 221
    mul-float/2addr p1, p0

    .line 222
    add-float v4, p1, v2

    .line 223
    .line 224
    move v3, v1

    .line 225
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_8
    move v4, v2

    .line 230
    int-to-float v1, p1

    .line 231
    int-to-float v2, v3

    .line 232
    int-to-float v4, v4

    .line 233
    move v3, v1

    .line 234
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 235
    .line 236
    .line 237
    int-to-float v2, p2

    .line 238
    add-int/2addr p2, v6

    .line 239
    int-to-float v4, p2

    .line 240
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_9
    move-object p1, p2

    .line 245
    iget p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛳᛶᛵ:F

    .line 246
    .line 247
    const/high16 v1, 0x41a00000    # 20.0f

    .line 248
    .line 249
    div-float v1, p2, v1

    .line 250
    .line 251
    float-to-int v1, v1

    .line 252
    iget v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛳᲁᲁᲇ:F

    .line 253
    .line 254
    div-float v0, p2, v0

    .line 255
    .line 256
    sub-float v0, v2, v0

    .line 257
    .line 258
    int-to-float v1, v1

    .line 259
    sub-float/2addr v0, v1

    .line 260
    float-to-int v0, v0

    .line 261
    div-float/2addr p2, v7

    .line 262
    sub-float v3, v2, p2

    .line 263
    .line 264
    float-to-int v3, v3

    .line 265
    iget v4, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᛱᛲ:F

    .line 266
    .line 267
    add-float/2addr v4, v1

    .line 268
    float-to-int v1, v4

    .line 269
    add-float/2addr p2, v2

    .line 270
    float-to-int p2, p2

    .line 271
    int-to-float v2, v3

    .line 272
    sub-int/2addr p2, v3

    .line 273
    int-to-float p2, p2

    .line 274
    iget v4, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᛵᛸ:F

    .line 275
    .line 276
    mul-float/2addr p2, v4

    .line 277
    add-float/2addr p2, v2

    .line 278
    float-to-int p2, p2

    .line 279
    new-instance v4, Landroid/graphics/Path;

    .line 280
    .line 281
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 282
    .line 283
    .line 284
    int-to-float v6, v1

    .line 285
    invoke-virtual {v4, v2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 286
    .line 287
    .line 288
    if-ge p2, v0, :cond_a

    .line 289
    .line 290
    iput p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᲈᛴ:I

    .line 291
    .line 292
    sub-int v0, p2, v3

    .line 293
    .line 294
    add-int/2addr v0, v1

    .line 295
    iput v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛶᛱᲈ:I

    .line 296
    .line 297
    int-to-float p0, p2

    .line 298
    int-to-float p2, v0

    .line 299
    invoke-virtual {v4, p0, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 300
    .line 301
    .line 302
    goto :goto_1

    .line 303
    :cond_a
    iput v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᲈᛴ:I

    .line 304
    .line 305
    sub-int v2, v0, v3

    .line 306
    .line 307
    add-int/2addr v2, v1

    .line 308
    iput v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛶᛱᲈ:I

    .line 309
    .line 310
    int-to-float v0, v0

    .line 311
    int-to-float v1, v2

    .line 312
    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 313
    .line 314
    .line 315
    iget v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛶᛱᲈ:I

    .line 316
    .line 317
    iget p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᲈᛴ:I

    .line 318
    .line 319
    sub-int p0, p2, p0

    .line 320
    .line 321
    sub-int/2addr v0, p0

    .line 322
    int-to-float p0, p2

    .line 323
    int-to-float p2, v0

    .line 324
    invoke-virtual {v4, p0, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 325
    .line 326
    .line 327
    :goto_1
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 328
    .line 329
    .line 330
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 8

    .line 1
    const-class v0, Lyyds/ᲁᲀᛵᛴ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᛳᲇ:Z

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
    iput-boolean v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᛳᲇ:Z

    .line 15
    .line 16
    iget-object v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 22
    .line 23
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 29
    .line 30
    iget v3, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲈᛵᛷ:I

    .line 31
    .line 32
    int-to-float v3, v3

    .line 33
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 37
    .line 38
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛲᲈᲈ:Landroid/graphics/Paint;

    .line 44
    .line 45
    iget v3, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛴᛳᛲ:I

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
    iget v4, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᲈᲈᲁ:F

    .line 98
    .line 99
    iget v5, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛲᲈᛱ:F

    .line 100
    .line 101
    sub-float/2addr v4, v5

    .line 102
    const/high16 v5, 0x40000000    # 2.0f

    .line 103
    .line 104
    div-float/2addr v4, v5

    .line 105
    iput v4, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛵᲇᲀ:F

    .line 106
    .line 107
    const v4, 0x43b68000    # 365.0f

    .line 108
    .line 109
    .line 110
    invoke-static {v3, v4}, Lyyds/ᛲᛲᛶᛶ;->ᛲᲈᲁ(FF)Lyyds/ᛲᛲᛶᛶ;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iput-object v5, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 115
    .line 116
    const-wide/16 v6, 0x3e8

    .line 117
    .line 118
    iput-wide v6, v5, Lyyds/ᛲᛲᛶᛶ;->ᛵᛸᛸᛷ:J

    .line 119
    .line 120
    new-instance v6, Landroid/view/animation/LinearInterpolator;

    .line 121
    .line 122
    invoke-direct {v6}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v6, v5, Lyyds/ᛲᛲᛶᛶ;->ᲇᲇᲇᛱ:Landroid/view/animation/Interpolator;

    .line 126
    .line 127
    iget-object v5, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 128
    .line 129
    const/4 v6, -0x1

    .line 130
    iput v6, v5, Lyyds/ᛲᛲᛶᛶ;->ᛲᛳᛶᲁ:I

    .line 131
    .line 132
    iput v2, v5, Lyyds/ᛲᛲᛶᛶ;->ᛷᛲᲈᛱ:I

    .line 133
    .line 134
    new-instance v7, Lyyds/ᲁᲁᛶᛸ;

    .line 135
    .line 136
    invoke-direct {v7, p0, v1}, Lyyds/ᲁᲁᛶᛸ;-><init>(Lyyds/ᲁᲀᛵᛴ;I)V

    .line 137
    .line 138
    .line 139
    iput-object v7, v5, Lyyds/ᛲᛲᛶᛶ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᛶᛸ;

    .line 140
    .line 141
    invoke-static {v3, v4}, Lyyds/ᛲᛲᛶᛶ;->ᛲᲈᲁ(FF)Lyyds/ᛲᛲᛶᛶ;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iput-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛲᛶᛶ;

    .line 146
    .line 147
    const-wide/16 v3, 0x5dc

    .line 148
    .line 149
    iput-wide v3, v1, Lyyds/ᛲᛲᛶᛶ;->ᛵᛸᛸᛷ:J

    .line 150
    .line 151
    iput v2, v1, Lyyds/ᛲᛲᛶᛶ;->ᛷᛲᲈᛱ:I

    .line 152
    .line 153
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 154
    .line 155
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v2, v1, Lyyds/ᛲᛲᛶᛶ;->ᲇᲇᲇᛱ:Landroid/view/animation/Interpolator;

    .line 159
    .line 160
    iget-object v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛲᛶᛶ;

    .line 161
    .line 162
    iput v6, v1, Lyyds/ᛲᛲᛶᛶ;->ᛲᛳᛶᲁ:I

    .line 163
    .line 164
    new-instance v2, Lyyds/ᲁᲁᛶᛸ;

    .line 165
    .line 166
    const/4 v3, 0x2

    .line 167
    invoke-direct {v2, p0, v3}, Lyyds/ᲁᲁᛶᛸ;-><init>(Lyyds/ᲁᲀᛵᛴ;I)V

    .line 168
    .line 169
    .line 170
    iput-object v2, v1, Lyyds/ᛲᛲᛶᛶ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᛶᛸ;

    .line 171
    .line 172
    invoke-virtual {v1}, Lyyds/ᛲᛲᛶᛶ;->ᛵᛸᛸᛷ()V

    .line 173
    .line 174
    .line 175
    iget-object p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 176
    .line 177
    invoke-virtual {p0}, Lyyds/ᛲᛲᛶᛶ;->ᛵᛸᛸᛷ()V

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

.method public final ᲀᛲᛳᲀ(ILandroid/view/animation/Interpolator;)V
    .locals 2

    .line 1
    iput-object p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᛲᛳᛴᛸ:Landroid/view/animation/Interpolator;

    .line 2
    .line 3
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    iget p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛲᲇ:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lyyds/ᛷᛱᛷ;

    .line 10
    .line 11
    const/4 p2, 0x5

    .line 12
    invoke-direct {p1, p0, p2}, Lyyds/ᛷᛱᛷ;-><init>(Lyyds/ᲁᲀᛵᛴ;I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛷᛸᲇᛶ:Ljava/lang/Runnable;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲈᲀᛲᲀ:Landroid/animation/ValueAnimator;

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
    iput-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲈᲀᛲᲀ:Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛵᲀᛵᛸ:F

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
    iput-object p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᲈᲀᛲᲀ:Landroid/animation/ValueAnimator;

    .line 42
    .line 43
    const-wide/16 v0, 0x12c

    .line 44
    .line 45
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lyyds/ᲁᲀᛵᛴ;->ᲈᲀᛲᲀ:Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    new-instance v0, Lyyds/ᛲᛶᲁᲁ;

    .line 51
    .line 52
    invoke-direct {v0, p1, p0}, Lyyds/ᛲᛶᲁᲁ;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲈᲀᛲᲀ:Landroid/animation/ValueAnimator;

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

.method public final ᲇᲈᛵᛷ(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛶᛷᛲᲁ:Lyyds/ᛲᛲᛶᛶ;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-boolean v1, v0, Lyyds/ᛲᛲᛶᛶ;->ᲇᲈᛵᛷ:Z

    .line 13
    .line 14
    :cond_1
    iget v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᲈᲁ:F

    .line 21
    .line 22
    :cond_2
    iput-boolean v1, p0, Lyyds/ᲁᲀᛵᛴ;->ᛸᛸᛷᛱ:Z

    .line 23
    .line 24
    iput v2, p0, Lyyds/ᲁᲀᛵᛴ;->ᲀᛲᛳᲀ:I

    .line 25
    .line 26
    iget v0, p0, Lyyds/ᲁᲀᛵᛴ;->ᛱᲈᲁ:F

    .line 27
    .line 28
    const v2, 0x43b68000    # 365.0f

    .line 29
    .line 30
    .line 31
    mul-float/2addr p1, v2

    .line 32
    invoke-static {v0, p1}, Lyyds/ᛲᛲᛶᛶ;->ᛲᲈᲁ(FF)Lyyds/ᛲᛲᛶᛶ;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 37
    .line 38
    const-wide/16 v2, 0x3e8

    .line 39
    .line 40
    iput-wide v2, p1, Lyyds/ᛲᛲᛶᛶ;->ᛵᛸᛸᛷ:J

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
    iput-object v0, p1, Lyyds/ᛲᛲᛶᛶ;->ᲇᲇᲇᛱ:Landroid/view/animation/Interpolator;

    .line 50
    .line 51
    iget-object p1, p0, Lyyds/ᲁᲀᛵᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛲᛶᛶ;

    .line 52
    .line 53
    iput v1, p1, Lyyds/ᛲᛲᛶᛶ;->ᛲᛳᛶᲁ:I

    .line 54
    .line 55
    new-instance v0, Lyyds/ᲁᲁᛶᛸ;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, Lyyds/ᲁᲁᛶᛸ;-><init>(Lyyds/ᲁᲀᛵᛴ;I)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p1, Lyyds/ᛲᛲᛶᛶ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲁᛶᛸ;

    .line 61
    .line 62
    invoke-virtual {p1}, Lyyds/ᛲᛲᛶᛶ;->ᛵᛸᛸᛷ()V

    .line 63
    .line 64
    .line 65
    return-void
.end method
