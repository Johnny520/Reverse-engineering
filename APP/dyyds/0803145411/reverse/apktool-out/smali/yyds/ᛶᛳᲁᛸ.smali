.class public final Lyyds/ᛶᛳᲁᛸ;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Landroid/graphics/Bitmap;

.field public final ᛵᛸᛸᛷ:I

.field public final ᲀᛲᛳᲀ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;I)V
    .locals 2

    .line 1
    const-wide v0, -0x2739ae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛶᛳᲁᛸ;->ᛲᲈᲁ:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    iput p2, p0, Lyyds/ᛶᛳᲁᛸ;->ᛵᛸᛸᛷ:I

    .line 15
    .line 16
    new-instance p1, Landroid/graphics/Paint;

    .line 17
    .line 18
    const/4 p2, 0x3

    .line 19
    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lyyds/ᛶᛳᲁᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    const-wide v0, -0x273a1e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide v1, -0x273a8e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    new-instance v1, Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    new-instance v3, Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 33
    .line 34
    .line 35
    const/16 v4, 0x8

    .line 36
    .line 37
    new-array v4, v4, [F

    .line 38
    .line 39
    fill-array-data v4, :array_0

    .line 40
    .line 41
    .line 42
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 43
    .line 44
    invoke-virtual {v3, v1, v4, v5}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    const/4 v4, 0x0

    .line 52
    iget-object v5, p0, Lyyds/ᛶᛳᲁᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 53
    .line 54
    iget-object v6, p0, Lyyds/ᛶᛳᲁᛸ;->ᛲᲈᲁ:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    iget p0, p0, Lyyds/ᛶᛳᲁᛸ;->ᛵᛸᛸᛷ:I

    .line 57
    .line 58
    if-eq p0, v3, :cond_2

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    const/high16 v7, 0x40000000    # 2.0f

    .line 62
    .line 63
    if-eq p0, v3, :cond_1

    .line 64
    .line 65
    const/4 v3, 0x3

    .line 66
    if-eq p0, v3, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    int-to-float p0, p0

    .line 73
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    int-to-float v1, v1

    .line 78
    div-float/2addr p0, v1

    .line 79
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    int-to-float v1, v1

    .line 84
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    int-to-float v3, v3

    .line 89
    div-float/2addr v1, v3

    .line 90
    invoke-static {p0, v1}, Ljava/lang/Math;->max(FF)F

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    int-to-float v1, v1

    .line 99
    mul-float/2addr v1, p0

    .line 100
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    int-to-float v3, v3

    .line 105
    mul-float/2addr v3, p0

    .line 106
    iget p0, v0, Landroid/graphics/Rect;->left:I

    .line 107
    .line 108
    int-to-float p0, p0

    .line 109
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    int-to-float v8, v8

    .line 114
    sub-float/2addr v8, v1

    .line 115
    div-float/2addr v8, v7

    .line 116
    add-float/2addr v8, p0

    .line 117
    iget p0, v0, Landroid/graphics/Rect;->top:I

    .line 118
    .line 119
    int-to-float p0, p0

    .line 120
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    int-to-float v0, v0

    .line 125
    sub-float/2addr v0, v3

    .line 126
    div-float/2addr v0, v7

    .line 127
    add-float/2addr v0, p0

    .line 128
    new-instance p0, Landroid/graphics/RectF;

    .line 129
    .line 130
    add-float/2addr v1, v8

    .line 131
    add-float/2addr v3, v0

    .line 132
    invoke-direct {p0, v8, v0, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v6, v4, p0, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_0
    new-instance p0, Landroid/graphics/BitmapShader;

    .line 140
    .line 141
    sget-object v0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 142
    .line 143
    invoke-direct {p0, v6, v0, v0}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v1, v5}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    int-to-float p0, p0

    .line 161
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    int-to-float v1, v1

    .line 166
    div-float/2addr p0, v1

    .line 167
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    int-to-float v1, v1

    .line 172
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    int-to-float v3, v3

    .line 177
    div-float/2addr v1, v3

    .line 178
    invoke-static {p0, v1}, Ljava/lang/Math;->min(FF)F

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    int-to-float v1, v1

    .line 187
    mul-float/2addr v1, p0

    .line 188
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    int-to-float v3, v3

    .line 193
    mul-float/2addr v3, p0

    .line 194
    iget p0, v0, Landroid/graphics/Rect;->left:I

    .line 195
    .line 196
    int-to-float p0, p0

    .line 197
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    int-to-float v8, v8

    .line 202
    sub-float/2addr v8, v1

    .line 203
    div-float/2addr v8, v7

    .line 204
    add-float/2addr v8, p0

    .line 205
    iget p0, v0, Landroid/graphics/Rect;->top:I

    .line 206
    .line 207
    int-to-float p0, p0

    .line 208
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    int-to-float v0, v0

    .line 213
    sub-float/2addr v0, v3

    .line 214
    div-float/2addr v0, v7

    .line 215
    add-float/2addr v0, p0

    .line 216
    new-instance p0, Landroid/graphics/RectF;

    .line 217
    .line 218
    add-float/2addr v1, v8

    .line 219
    add-float/2addr v3, v0

    .line 220
    invoke-direct {p0, v8, v0, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v6, v4, p0, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 224
    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_2
    invoke-virtual {p1, v6, v4, v0, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 228
    .line 229
    .line 230
    :goto_0
    if-ltz v2, :cond_3

    .line 231
    .line 232
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 233
    .line 234
    .line 235
    :cond_3
    return-void

    .line 236
    nop

    .line 237
    :array_0
    .array-data 4
        0x42340000    # 45.0f
        0x42340000    # 45.0f
        0x42340000    # 45.0f
        0x42340000    # 45.0f
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final setAlpha(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛳᲁᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛳᲁᛸ;->ᲀᛲᛳᲀ:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    return-void
.end method
