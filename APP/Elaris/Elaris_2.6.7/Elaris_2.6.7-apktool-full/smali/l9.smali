.class public final Ll9;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Landroid/graphics/Paint;

.field public final d:Landroid/graphics/RectF;

.field public final e:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(II)V
    .locals 2

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
    iput-object v0, p0, Ll9;->c:Landroid/graphics/Paint;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ll9;->d:Landroid/graphics/RectF;

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ll9;->e:Landroid/graphics/Path;

    .line 25
    .line 26
    iput p1, p0, Ll9;->a:I

    .line 27
    .line 28
    iput p2, p0, Ll9;->b:I

    .line 29
    .line 30
    return-void
.end method

.method public static a(IF)I
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p1

    .line 4
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-float v1, v1

    .line 9
    mul-float/2addr v1, v0

    .line 10
    const/high16 v2, 0x437f0000    # 255.0f

    .line 11
    .line 12
    mul-float/2addr p1, v2

    .line 13
    add-float/2addr v1, p1

    .line 14
    float-to-int v1, v1

    .line 15
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-float v2, v2

    .line 20
    mul-float/2addr v2, v0

    .line 21
    add-float/2addr v2, p1

    .line 22
    float-to-int v2, v2

    .line 23
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    int-to-float p0, p0

    .line 28
    mul-float/2addr p0, v0

    .line 29
    add-float/2addr p0, p1

    .line 30
    float-to-int p0, p0

    .line 31
    invoke-static {v1, v2, p0}, Landroid/graphics/Color;->rgb(III)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    int-to-float v6, v3

    .line 14
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    int-to-float v7, v3

    .line 19
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    int-to-float v8, v3

    .line 22
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    int-to-float v9, v2

    .line 25
    const/4 v2, 0x0

    .line 26
    cmpg-float v3, v6, v2

    .line 27
    .line 28
    if-lez v3, :cond_5

    .line 29
    .line 30
    cmpg-float v2, v7, v2

    .line 31
    .line 32
    if-gtz v2, :cond_0

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    const/4 v2, 0x1

    .line 37
    const v5, 0x3d4ccccd    # 0.05f

    .line 38
    .line 39
    .line 40
    const v10, 0x3ed70a3d    # 0.42f

    .line 41
    .line 42
    .line 43
    const v11, 0x3eeb851f    # 0.46f

    .line 44
    .line 45
    .line 46
    const v12, 0x3e8f5c29    # 0.28f

    .line 47
    .line 48
    .line 49
    const v13, 0x3df5c28f    # 0.12f

    .line 50
    .line 51
    .line 52
    const v14, 0x3d3851ec    # 0.045f

    .line 53
    .line 54
    .line 55
    const/high16 v15, 0x3f800000    # 1.0f

    .line 56
    .line 57
    const v16, 0x3eb851ec    # 0.36f

    .line 58
    .line 59
    .line 60
    iget-object v3, v0, Ll9;->d:Landroid/graphics/RectF;

    .line 61
    .line 62
    move/from16 v17, v5

    .line 63
    .line 64
    iget-object v5, v0, Ll9;->c:Landroid/graphics/Paint;

    .line 65
    .line 66
    const v18, 0x3f47ae14    # 0.78f

    .line 67
    .line 68
    .line 69
    const v19, 0x3da3d70a    # 0.08f

    .line 70
    .line 71
    .line 72
    iget v4, v0, Ll9;->a:I

    .line 73
    .line 74
    if-ne v4, v2, :cond_1

    .line 75
    .line 76
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 79
    .line 80
    .line 81
    const/16 v0, 0xba

    .line 82
    .line 83
    const/16 v2, 0x49

    .line 84
    .line 85
    const/16 v4, 0xf6

    .line 86
    .line 87
    invoke-static {v4, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    .line 93
    .line 94
    mul-float/2addr v13, v6

    .line 95
    add-float/2addr v13, v8

    .line 96
    mul-float/2addr v12, v7

    .line 97
    add-float/2addr v12, v9

    .line 98
    mul-float/2addr v11, v6

    .line 99
    add-float/2addr v11, v8

    .line 100
    mul-float/2addr v10, v7

    .line 101
    add-float/2addr v10, v9

    .line 102
    invoke-virtual {v3, v13, v12, v11, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 103
    .line 104
    .line 105
    mul-float v0, v6, v17

    .line 106
    .line 107
    invoke-virtual {v1, v3, v0, v0, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 108
    .line 109
    .line 110
    mul-float v4, v6, v19

    .line 111
    .line 112
    add-float v0, v8, v4

    .line 113
    .line 114
    mul-float v2, v7, v16

    .line 115
    .line 116
    add-float/2addr v2, v9

    .line 117
    const v10, 0x3f6b851f    # 0.92f

    .line 118
    .line 119
    .line 120
    mul-float/2addr v10, v6

    .line 121
    add-float/2addr v10, v8

    .line 122
    mul-float v7, v7, v18

    .line 123
    .line 124
    add-float/2addr v7, v9

    .line 125
    invoke-virtual {v3, v0, v2, v10, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v3, v4, v4, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 132
    .line 133
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 134
    .line 135
    .line 136
    mul-float/2addr v6, v14

    .line 137
    invoke-static {v15, v6}, Ljava/lang/Math;->max(FF)F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 142
    .line 143
    .line 144
    const/16 v0, 0x97

    .line 145
    .line 146
    const/16 v2, 0x2e

    .line 147
    .line 148
    const/16 v6, 0xd7

    .line 149
    .line 150
    invoke-static {v6, v0, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v3, v4, v4, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_1
    const/4 v2, 0x2

    .line 162
    const v20, 0x3f28f5c3    # 0.66f

    .line 163
    .line 164
    .line 165
    const v21, 0x3ef5c28f    # 0.48f

    .line 166
    .line 167
    .line 168
    const v22, 0x3f1eb852    # 0.62f

    .line 169
    .line 170
    .line 171
    move/from16 v23, v10

    .line 172
    .line 173
    const v10, 0x3f5c28f6    # 0.86f

    .line 174
    .line 175
    .line 176
    move/from16 v24, v11

    .line 177
    .line 178
    const/16 v11, 0xf8

    .line 179
    .line 180
    move/from16 v25, v12

    .line 181
    .line 182
    iget v12, v0, Ll9;->b:I

    .line 183
    .line 184
    const v26, 0x3e6147ae    # 0.22f

    .line 185
    .line 186
    .line 187
    if-ne v4, v2, :cond_2

    .line 188
    .line 189
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 190
    .line 191
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 192
    .line 193
    .line 194
    const/16 v4, 0xfb

    .line 195
    .line 196
    move/from16 v27, v13

    .line 197
    .line 198
    const/16 v13, 0xff

    .line 199
    .line 200
    invoke-static {v11, v4, v13}, Landroid/graphics/Color;->rgb(III)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 205
    .line 206
    .line 207
    mul-float v26, v26, v6

    .line 208
    .line 209
    add-float v4, v26, v8

    .line 210
    .line 211
    mul-float v13, v7, v27

    .line 212
    .line 213
    add-float/2addr v13, v9

    .line 214
    mul-float v18, v18, v6

    .line 215
    .line 216
    add-float v11, v18, v8

    .line 217
    .line 218
    const v17, 0x3f6147ae    # 0.88f

    .line 219
    .line 220
    .line 221
    mul-float v17, v17, v7

    .line 222
    .line 223
    move/from16 v27, v14

    .line 224
    .line 225
    add-float v14, v17, v9

    .line 226
    .line 227
    invoke-virtual {v3, v4, v13, v11, v14}, Landroid/graphics/RectF;->set(FFFF)V

    .line 228
    .line 229
    .line 230
    mul-float v14, v6, v27

    .line 231
    .line 232
    invoke-virtual {v1, v3, v14, v14, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 233
    .line 234
    .line 235
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 236
    .line 237
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v15, v14}, Ljava/lang/Math;->max(FF)F

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 245
    .line 246
    .line 247
    const v15, 0x3f0f5c29    # 0.56f

    .line 248
    .line 249
    .line 250
    invoke-static {v12, v15}, Ll9;->a(IF)I

    .line 251
    .line 252
    .line 253
    move-result v15

    .line 254
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v3, v14, v14, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v12, v10}, Ll9;->a(IF)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 268
    .line 269
    .line 270
    iget-object v0, v0, Ll9;->e:Landroid/graphics/Path;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 273
    .line 274
    .line 275
    mul-float v3, v6, v22

    .line 276
    .line 277
    add-float/2addr v3, v8

    .line 278
    invoke-virtual {v0, v3, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 279
    .line 280
    .line 281
    mul-float v10, v7, v25

    .line 282
    .line 283
    add-float/2addr v10, v9

    .line 284
    invoke-virtual {v0, v11, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v3, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 300
    .line 301
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 302
    .line 303
    .line 304
    sget-object v0, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 305
    .line 306
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 307
    .line 308
    .line 309
    const v0, 0x3d851eb8    # 0.065f

    .line 310
    .line 311
    .line 312
    mul-float/2addr v0, v6

    .line 313
    const v3, 0x3fe66666    # 1.8f

    .line 314
    .line 315
    .line 316
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 324
    .line 325
    .line 326
    mul-float v21, v21, v6

    .line 327
    .line 328
    add-float v21, v21, v8

    .line 329
    .line 330
    mul-float v3, v7, v16

    .line 331
    .line 332
    add-float/2addr v3, v9

    .line 333
    mul-float v22, v22, v7

    .line 334
    .line 335
    add-float v4, v22, v9

    .line 336
    .line 337
    move-object v0, v2

    .line 338
    move v2, v3

    .line 339
    move/from16 v3, v21

    .line 340
    .line 341
    move-object v10, v0

    .line 342
    move-object v0, v1

    .line 343
    move/from16 v1, v21

    .line 344
    .line 345
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 346
    .line 347
    .line 348
    const v0, 0x3f23d70a    # 0.64f

    .line 349
    .line 350
    .line 351
    mul-float/2addr v0, v6

    .line 352
    add-float v3, v0, v8

    .line 353
    .line 354
    const v0, 0x3ea3d70a    # 0.32f

    .line 355
    .line 356
    .line 357
    mul-float/2addr v0, v7

    .line 358
    add-float v4, v0, v9

    .line 359
    .line 360
    move-object/from16 v0, p1

    .line 361
    .line 362
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 366
    .line 367
    .line 368
    mul-float v10, v6, v23

    .line 369
    .line 370
    add-float/2addr v10, v8

    .line 371
    mul-float v7, v7, v20

    .line 372
    .line 373
    add-float/2addr v7, v9

    .line 374
    const v1, 0x3d99999a    # 0.075f

    .line 375
    .line 376
    .line 377
    mul-float/2addr v6, v1

    .line 378
    invoke-virtual {v0, v10, v7, v6, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 379
    .line 380
    .line 381
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 382
    .line 383
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :cond_2
    move-object v0, v1

    .line 388
    move/from16 v27, v14

    .line 389
    .line 390
    const/4 v1, 0x4

    .line 391
    if-ne v4, v1, :cond_3

    .line 392
    .line 393
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 394
    .line 395
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 396
    .line 397
    .line 398
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 399
    .line 400
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 401
    .line 402
    .line 403
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 404
    .line 405
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 406
    .line 407
    .line 408
    const v1, 0x3db851ec    # 0.09f

    .line 409
    .line 410
    .line 411
    mul-float/2addr v1, v6

    .line 412
    const/high16 v2, 0x40000000    # 2.0f

    .line 413
    .line 414
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 422
    .line 423
    .line 424
    const/high16 v1, 0x3f000000    # 0.5f

    .line 425
    .line 426
    mul-float/2addr v1, v6

    .line 427
    add-float/2addr v1, v8

    .line 428
    mul-float v26, v26, v7

    .line 429
    .line 430
    add-float v2, v26, v9

    .line 431
    .line 432
    const v10, 0x3e75c28f    # 0.24f

    .line 433
    .line 434
    .line 435
    mul-float v3, v6, v10

    .line 436
    .line 437
    add-float/2addr v3, v8

    .line 438
    mul-float v21, v21, v7

    .line 439
    .line 440
    add-float v4, v21, v9

    .line 441
    .line 442
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 443
    .line 444
    .line 445
    const v0, 0x3f428f5c    # 0.76f

    .line 446
    .line 447
    .line 448
    mul-float/2addr v6, v0

    .line 449
    add-float v3, v6, v8

    .line 450
    .line 451
    move-object/from16 v0, p1

    .line 452
    .line 453
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 454
    .line 455
    .line 456
    mul-float/2addr v10, v7

    .line 457
    add-float v2, v10, v9

    .line 458
    .line 459
    mul-float v7, v7, v18

    .line 460
    .line 461
    add-float v4, v7, v9

    .line 462
    .line 463
    move v3, v1

    .line 464
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 465
    .line 466
    .line 467
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 468
    .line 469
    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :cond_3
    const/4 v1, 0x5

    .line 474
    if-ne v4, v1, :cond_4

    .line 475
    .line 476
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 477
    .line 478
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 479
    .line 480
    .line 481
    const v1, 0x3f51eb85    # 0.82f

    .line 482
    .line 483
    .line 484
    invoke-static {v12, v1}, Ll9;->a(IF)I

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 489
    .line 490
    .line 491
    const v2, 0x3e3851ec    # 0.18f

    .line 492
    .line 493
    .line 494
    mul-float/2addr v2, v6

    .line 495
    add-float/2addr v2, v8

    .line 496
    mul-float v26, v26, v7

    .line 497
    .line 498
    add-float v4, v26, v9

    .line 499
    .line 500
    mul-float/2addr v1, v6

    .line 501
    add-float/2addr v1, v8

    .line 502
    mul-float v7, v7, v18

    .line 503
    .line 504
    add-float/2addr v7, v9

    .line 505
    invoke-virtual {v3, v2, v4, v1, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 506
    .line 507
    .line 508
    mul-float v4, v6, v19

    .line 509
    .line 510
    invoke-virtual {v0, v3, v4, v4, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 511
    .line 512
    .line 513
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 514
    .line 515
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 516
    .line 517
    .line 518
    mul-float v6, v6, v17

    .line 519
    .line 520
    invoke-static {v15, v6}, Ljava/lang/Math;->max(FF)F

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v3, v4, v4, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :cond_4
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 535
    .line 536
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 537
    .line 538
    .line 539
    const/16 v1, 0xfa

    .line 540
    .line 541
    const/16 v2, 0xfc

    .line 542
    .line 543
    invoke-static {v11, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 548
    .line 549
    .line 550
    mul-float v26, v26, v6

    .line 551
    .line 552
    add-float v1, v26, v8

    .line 553
    .line 554
    const v2, 0x3e0f5c29    # 0.14f

    .line 555
    .line 556
    .line 557
    mul-float/2addr v2, v7

    .line 558
    add-float/2addr v2, v9

    .line 559
    mul-float v18, v18, v6

    .line 560
    .line 561
    add-float v4, v18, v8

    .line 562
    .line 563
    mul-float/2addr v10, v7

    .line 564
    add-float/2addr v10, v9

    .line 565
    invoke-virtual {v3, v1, v2, v4, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 566
    .line 567
    .line 568
    const v1, 0x3d23d70a    # 0.04f

    .line 569
    .line 570
    .line 571
    mul-float/2addr v1, v6

    .line 572
    invoke-virtual {v0, v3, v1, v1, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 573
    .line 574
    .line 575
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 576
    .line 577
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 578
    .line 579
    .line 580
    mul-float v14, v6, v27

    .line 581
    .line 582
    invoke-static {v15, v14}, Ljava/lang/Math;->max(FF)F

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 587
    .line 588
    .line 589
    const/16 v2, 0xaa

    .line 590
    .line 591
    const/16 v4, 0xbe

    .line 592
    .line 593
    const/16 v10, 0xa0

    .line 594
    .line 595
    invoke-static {v10, v2, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0, v3, v1, v1, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setColor(I)V

    .line 606
    .line 607
    .line 608
    const v1, 0x3eae147b    # 0.34f

    .line 609
    .line 610
    .line 611
    mul-float/2addr v1, v6

    .line 612
    add-float/2addr v1, v8

    .line 613
    mul-float v11, v7, v24

    .line 614
    .line 615
    add-float v2, v11, v9

    .line 616
    .line 617
    mul-float v20, v20, v6

    .line 618
    .line 619
    add-float v3, v20, v8

    .line 620
    .line 621
    move v4, v2

    .line 622
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 623
    .line 624
    .line 625
    const v0, 0x3f19999a    # 0.6f

    .line 626
    .line 627
    .line 628
    mul-float/2addr v7, v0

    .line 629
    add-float v2, v7, v9

    .line 630
    .line 631
    mul-float v6, v6, v22

    .line 632
    .line 633
    add-float v3, v6, v8

    .line 634
    .line 635
    move v4, v2

    .line 636
    move-object/from16 v0, p1

    .line 637
    .line 638
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 639
    .line 640
    .line 641
    :cond_5
    :goto_0
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    const/16 p0, 0x60

    .line 2
    .line 3
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    const/16 p0, 0x60

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
    .locals 0

    .line 1
    iget-object p0, p0, Ll9;->c:Landroid/graphics/Paint;

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
    iget-object p0, p0, Ll9;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    return-void
.end method
