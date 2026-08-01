.class public final Lce;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/RectF;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(IIF)V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lce;->a:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance v2, Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Lce;->b:Landroid/graphics/Paint;

    .line 18
    .line 19
    new-instance v3, Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v3, p0, Lce;->c:Landroid/graphics/Path;

    .line 25
    .line 26
    new-instance v3, Landroid/graphics/RectF;

    .line 27
    .line 28
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, Lce;->d:Landroid/graphics/RectF;

    .line 32
    .line 33
    iput p1, p0, Lce;->e:I

    .line 34
    .line 35
    const/high16 p1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    invoke-static {p1, p3}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/high16 p3, 0x42000000    # 32.0f

    .line 42
    .line 43
    mul-float/2addr p1, p3

    .line 44
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, p0, Lce;->f:I

    .line 53
    .line 54
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    .line 68
    .line 69
    sget-object p3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 70
    .line 71
    invoke-direct {p2, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, p0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gtz v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    iget v1, p0, Lce;->e:I

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iget-object v6, p0, Lce;->a:Landroid/graphics/Paint;

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    int-to-float v7, v1

    .line 41
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 50
    .line 51
    int-to-float v1, v1

    .line 52
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    int-to-float v2, v2

    .line 55
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 56
    .line 57
    int-to-float v3, v3

    .line 58
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 59
    .line 60
    int-to-float v4, v0

    .line 61
    const/4 v5, 0x0

    .line 62
    move-object v0, p1

    .line 63
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 68
    .line 69
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 70
    .line 71
    .line 72
    const v1, 0x3ec28f5c    # 0.38f

    .line 73
    .line 74
    .line 75
    mul-float/2addr v1, v7

    .line 76
    sub-float v2, v8, v1

    .line 77
    .line 78
    const v3, 0x3e8f5c29    # 0.28f

    .line 79
    .line 80
    .line 81
    mul-float/2addr v3, v7

    .line 82
    sub-float v3, v9, v3

    .line 83
    .line 84
    add-float/2addr v1, v8

    .line 85
    const v4, 0x3eb33333    # 0.35f

    .line 86
    .line 87
    .line 88
    mul-float/2addr v4, v7

    .line 89
    add-float/2addr v4, v9

    .line 90
    iget-object v5, p0, Lce;->d:Landroid/graphics/RectF;

    .line 91
    .line 92
    invoke-virtual {v5, v2, v3, v1, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 93
    .line 94
    .line 95
    const v1, 0x3e0f5c29    # 0.14f

    .line 96
    .line 97
    .line 98
    mul-float/2addr v1, v7

    .line 99
    invoke-virtual {p1, v5, v1, v1, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 103
    .line 104
    iget-object v5, p0, Lce;->b:Landroid/graphics/Paint;

    .line 105
    .line 106
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 107
    .line 108
    .line 109
    const p0, 0x3e0a3d71    # 0.135f

    .line 110
    .line 111
    .line 112
    mul-float/2addr p0, v7

    .line 113
    const v1, 0x402ccccd    # 2.7f

    .line 114
    .line 115
    .line 116
    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    invoke-virtual {v5, p0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 121
    .line 122
    .line 123
    const p0, 0x3eb851ec    # 0.36f

    .line 124
    .line 125
    .line 126
    mul-float/2addr p0, v7

    .line 127
    sub-float v2, v9, p0

    .line 128
    .line 129
    const p0, 0x3db851ec    # 0.09f

    .line 130
    .line 131
    .line 132
    mul-float/2addr p0, v7

    .line 133
    add-float v4, p0, v9

    .line 134
    .line 135
    move v3, v8

    .line 136
    move v1, v8

    .line 137
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 138
    .line 139
    .line 140
    move v3, v1

    .line 141
    const p0, 0x3e3851ec    # 0.18f

    .line 142
    .line 143
    .line 144
    mul-float/2addr p0, v7

    .line 145
    sub-float v1, v3, p0

    .line 146
    .line 147
    const v0, 0x3d8f5c29    # 0.07f

    .line 148
    .line 149
    .line 150
    mul-float/2addr v0, v7

    .line 151
    sub-float v2, v9, v0

    .line 152
    .line 153
    const v0, 0x3df5c28f    # 0.12f

    .line 154
    .line 155
    .line 156
    mul-float/2addr v7, v0

    .line 157
    add-float v4, v7, v9

    .line 158
    .line 159
    move-object v0, p1

    .line 160
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 161
    .line 162
    .line 163
    add-float v1, v3, p0

    .line 164
    .line 165
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    int-to-float v2, v2

    .line 185
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 186
    .line 187
    int-to-float v3, v3

    .line 188
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    int-to-float v4, v4

    .line 193
    sub-float/2addr v4, v2

    .line 194
    const/high16 v5, 0x3f000000    # 0.5f

    .line 195
    .line 196
    mul-float/2addr v4, v5

    .line 197
    add-float/2addr v4, v3

    .line 198
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 199
    .line 200
    int-to-float v3, v3

    .line 201
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    int-to-float v0, v0

    .line 206
    sub-float/2addr v0, v2

    .line 207
    mul-float/2addr v0, v5

    .line 208
    add-float/2addr v0, v3

    .line 209
    mul-float/2addr v5, v2

    .line 210
    add-float/2addr v5, v0

    .line 211
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 212
    .line 213
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 214
    .line 215
    .line 216
    const v0, 0x3e147ae1    # 0.145f

    .line 217
    .line 218
    .line 219
    mul-float/2addr v0, v2

    .line 220
    const v3, 0x404ccccd    # 3.2f

    .line 221
    .line 222
    .line 223
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 228
    .line 229
    .line 230
    iget-object v7, p0, Lce;->c:Landroid/graphics/Path;

    .line 231
    .line 232
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 233
    .line 234
    .line 235
    const p0, 0x3e051eb8    # 0.13f

    .line 236
    .line 237
    .line 238
    mul-float/2addr p0, v2

    .line 239
    add-float v0, v4, p0

    .line 240
    .line 241
    const v3, 0x3e6147ae    # 0.22f

    .line 242
    .line 243
    .line 244
    mul-float/2addr v3, v2

    .line 245
    add-float v8, v5, v3

    .line 246
    .line 247
    invoke-virtual {v7, v0, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 248
    .line 249
    .line 250
    const v0, 0x3e4ccccd    # 0.2f

    .line 251
    .line 252
    .line 253
    mul-float/2addr v0, v2

    .line 254
    add-float v8, v0, v4

    .line 255
    .line 256
    const v0, 0x3da3d70a    # 0.08f

    .line 257
    .line 258
    .line 259
    mul-float/2addr v0, v2

    .line 260
    sub-float v9, v5, v0

    .line 261
    .line 262
    const v0, 0x3ef5c28f    # 0.48f

    .line 263
    .line 264
    .line 265
    mul-float/2addr v0, v2

    .line 266
    add-float v10, v0, v4

    .line 267
    .line 268
    sub-float v11, v5, v3

    .line 269
    .line 270
    const v0, 0x3f266666    # 0.65f

    .line 271
    .line 272
    .line 273
    mul-float/2addr v0, v2

    .line 274
    add-float v12, v0, v4

    .line 275
    .line 276
    sub-float v13, v5, p0

    .line 277
    .line 278
    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v7, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 282
    .line 283
    .line 284
    sget-object p0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 285
    .line 286
    invoke-virtual {v6, p0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 290
    .line 291
    .line 292
    const p0, 0x3f5eb852    # 0.87f

    .line 293
    .line 294
    .line 295
    mul-float/2addr p0, v2

    .line 296
    add-float/2addr p0, v4

    .line 297
    invoke-virtual {v7, p0, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 298
    .line 299
    .line 300
    const p0, 0x3f1c28f6    # 0.61f

    .line 301
    .line 302
    .line 303
    mul-float/2addr p0, v2

    .line 304
    add-float/2addr p0, v4

    .line 305
    const v0, 0x3eae147b    # 0.34f

    .line 306
    .line 307
    .line 308
    mul-float/2addr v0, v2

    .line 309
    sub-float v0, v5, v0

    .line 310
    .line 311
    invoke-virtual {v7, p0, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 312
    .line 313
    .line 314
    const p0, 0x3f23d70a    # 0.64f

    .line 315
    .line 316
    .line 317
    mul-float/2addr p0, v2

    .line 318
    add-float/2addr p0, v4

    .line 319
    const v0, 0x3dcccccd    # 0.1f

    .line 320
    .line 321
    .line 322
    mul-float/2addr v2, v0

    .line 323
    add-float/2addr v2, v5

    .line 324
    invoke-virtual {v7, p0, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1, v7, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 331
    .line 332
    .line 333
    :cond_2
    :goto_0
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget p0, p0, Lce;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lce;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final getOpacity()I
    .locals 0

    .line 1
    const/4 p0, -0x3

    .line 2
    return p0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lce;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lce;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
