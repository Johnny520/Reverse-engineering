.class public final Lk9/d;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lk9/c;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lk9/c;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk9/d;->a:Lk9/c;

    .line 5
    .line 6
    new-instance p1, Landroid/graphics/Paint;

    .line 7
    .line 8
    const/4 v0, 0x5

    .line 9
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 23
    .line 24
    .line 25
    sget-object p2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lk9/d;->b:Landroid/graphics/Paint;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Path;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lk9/d;->c:Landroid/graphics/Path;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lk9/d;->d:Landroid/graphics/RectF;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-float v7, v2

    .line 29
    const/4 v2, 0x0

    .line 30
    cmpg-float v2, v7, v2

    .line 31
    .line 32
    if-gtz v2, :cond_0

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/high16 v3, 0x40000000    # 2.0f

    .line 45
    .line 46
    div-float v4, v7, v3

    .line 47
    .line 48
    sub-float v8, v2, v4

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterY()F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    sub-float v9, v2, v4

    .line 59
    .line 60
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 61
    .line 62
    iget-object v6, v0, Lk9/d;->b:Landroid/graphics/Paint;

    .line 63
    .line 64
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 65
    .line 66
    .line 67
    const v4, 0x3d851eb8    # 0.065f

    .line 68
    .line 69
    .line 70
    mul-float/2addr v4, v7

    .line 71
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 72
    .line 73
    .line 74
    iget-object v4, v0, Lk9/d;->c:Landroid/graphics/Path;

    .line 75
    .line 76
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 77
    .line 78
    .line 79
    iget-object v5, v0, Lk9/d;->a:Lk9/c;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    const/high16 v11, 0x3f000000    # 0.5f

    .line 86
    .line 87
    const v12, 0x3f23d70a    # 0.64f

    .line 88
    .line 89
    .line 90
    const v13, 0x3eb851ec    # 0.36f

    .line 91
    .line 92
    .line 93
    const-wide v14, 0x400921fb54442d18L    # Math.PI

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    const v16, 0x3d75c28f    # 0.06f

    .line 99
    .line 100
    .line 101
    const v17, 0x3e6b851f    # 0.23f

    .line 102
    .line 103
    .line 104
    const v18, 0x3f570a3d    # 0.84f

    .line 105
    .line 106
    .line 107
    const v19, 0x3e0f5c29    # 0.14f

    .line 108
    .line 109
    .line 110
    const v20, 0x3edc28f6    # 0.43f

    .line 111
    .line 112
    .line 113
    const v21, 0x3e051eb8    # 0.13f

    .line 114
    .line 115
    .line 116
    const v22, 0x3e2e147b    # 0.17f

    .line 117
    .line 118
    .line 119
    const v23, 0x3f2b851f    # 0.67f

    .line 120
    .line 121
    .line 122
    const/16 v24, 0x0

    .line 123
    .line 124
    const v25, 0x3e8f5c29    # 0.28f

    .line 125
    .line 126
    .line 127
    iget-object v10, v0, Lk9/d;->d:Landroid/graphics/RectF;

    .line 128
    .line 129
    packed-switch v5, :pswitch_data_0

    .line 130
    .line 131
    .line 132
    invoke-static {}, Lokio/a;->k()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_0
    const v2, 0x3f0ccccd    # 0.55f

    .line 137
    .line 138
    .line 139
    mul-float/2addr v2, v7

    .line 140
    add-float/2addr v2, v8

    .line 141
    const v3, 0x3e4ccccd    # 0.2f

    .line 142
    .line 143
    .line 144
    mul-float/2addr v3, v7

    .line 145
    add-float/2addr v3, v9

    .line 146
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 147
    .line 148
    .line 149
    const v2, 0x3f4ccccd    # 0.8f

    .line 150
    .line 151
    .line 152
    mul-float/2addr v2, v7

    .line 153
    add-float/2addr v2, v8

    .line 154
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 155
    .line 156
    .line 157
    const v3, 0x3ee66666    # 0.45f

    .line 158
    .line 159
    .line 160
    mul-float/2addr v3, v7

    .line 161
    add-float/2addr v3, v9

    .line 162
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 163
    .line 164
    .line 165
    const v2, 0x3f4a3d71    # 0.79f

    .line 166
    .line 167
    .line 168
    mul-float/2addr v2, v7

    .line 169
    add-float/2addr v2, v8

    .line 170
    const v3, 0x3e570a3d    # 0.21f

    .line 171
    .line 172
    .line 173
    mul-float/2addr v3, v7

    .line 174
    add-float/2addr v3, v9

    .line 175
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 176
    .line 177
    .line 178
    const v2, 0x3eeb851f    # 0.46f

    .line 179
    .line 180
    .line 181
    mul-float/2addr v2, v7

    .line 182
    add-float/2addr v2, v8

    .line 183
    const v3, 0x3f0a3d71    # 0.54f

    .line 184
    .line 185
    .line 186
    mul-float/2addr v3, v7

    .line 187
    add-float/2addr v3, v9

    .line 188
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 189
    .line 190
    .line 191
    mul-float v23, v23, v7

    .line 192
    .line 193
    add-float v2, v23, v8

    .line 194
    .line 195
    const v3, 0x3ee147ae    # 0.44f

    .line 196
    .line 197
    .line 198
    mul-float/2addr v3, v7

    .line 199
    add-float/2addr v3, v9

    .line 200
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 201
    .line 202
    .line 203
    const/high16 v3, 0x3f400000    # 0.75f

    .line 204
    .line 205
    mul-float/2addr v3, v7

    .line 206
    add-float/2addr v3, v9

    .line 207
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 208
    .line 209
    .line 210
    const v2, 0x3e6147ae    # 0.22f

    .line 211
    .line 212
    .line 213
    mul-float/2addr v2, v7

    .line 214
    add-float/2addr v2, v8

    .line 215
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 216
    .line 217
    .line 218
    const v3, 0x3e99999a    # 0.3f

    .line 219
    .line 220
    .line 221
    mul-float/2addr v3, v7

    .line 222
    add-float/2addr v3, v9

    .line 223
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 224
    .line 225
    .line 226
    const v2, 0x3f07ae14    # 0.53f

    .line 227
    .line 228
    .line 229
    mul-float/2addr v7, v2

    .line 230
    add-float/2addr v7, v8

    .line 231
    invoke-virtual {v4, v7, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :pswitch_1
    mul-float v19, v19, v7

    .line 239
    .line 240
    add-float v2, v19, v8

    .line 241
    .line 242
    const v3, 0x3e8a3d71    # 0.27f

    .line 243
    .line 244
    .line 245
    mul-float/2addr v3, v7

    .line 246
    add-float/2addr v3, v9

    .line 247
    mul-float v18, v18, v7

    .line 248
    .line 249
    add-float v4, v18, v8

    .line 250
    .line 251
    const v5, 0x3f428f5c    # 0.76f

    .line 252
    .line 253
    .line 254
    mul-float/2addr v5, v7

    .line 255
    add-float/2addr v5, v9

    .line 256
    invoke-virtual {v10, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 257
    .line 258
    .line 259
    const v2, 0x3dcccccd    # 0.1f

    .line 260
    .line 261
    .line 262
    mul-float/2addr v2, v7

    .line 263
    invoke-virtual {v1, v10, v2, v2, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 264
    .line 265
    .line 266
    mul-float v17, v17, v7

    .line 267
    .line 268
    add-float v2, v17, v8

    .line 269
    .line 270
    mul-float v23, v23, v7

    .line 271
    .line 272
    add-float v4, v23, v8

    .line 273
    .line 274
    mul-float v22, v22, v7

    .line 275
    .line 276
    add-float v5, v22, v9

    .line 277
    .line 278
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 279
    .line 280
    .line 281
    const v2, 0x3f147ae1    # 0.58f

    .line 282
    .line 283
    .line 284
    mul-float/2addr v2, v7

    .line 285
    add-float/2addr v2, v8

    .line 286
    const v3, 0x3ed70a3d    # 0.42f

    .line 287
    .line 288
    .line 289
    mul-float/2addr v3, v7

    .line 290
    add-float/2addr v3, v9

    .line 291
    const v4, 0x3f6147ae    # 0.88f

    .line 292
    .line 293
    .line 294
    mul-float/2addr v4, v7

    .line 295
    add-float/2addr v4, v8

    .line 296
    const v5, 0x3f1eb852    # 0.62f

    .line 297
    .line 298
    .line 299
    mul-float/2addr v5, v7

    .line 300
    add-float/2addr v5, v9

    .line 301
    invoke-virtual {v10, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 302
    .line 303
    .line 304
    mul-float v2, v7, v16

    .line 305
    .line 306
    invoke-virtual {v1, v10, v2, v2, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 307
    .line 308
    .line 309
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 310
    .line 311
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 312
    .line 313
    .line 314
    const v2, 0x3f2e147b    # 0.68f

    .line 315
    .line 316
    .line 317
    mul-float/2addr v2, v7

    .line 318
    add-float/2addr v2, v8

    .line 319
    const v3, 0x3f051eb8    # 0.52f

    .line 320
    .line 321
    .line 322
    mul-float/2addr v3, v7

    .line 323
    add-float/2addr v3, v9

    .line 324
    const v4, 0x3ccccccd    # 0.025f

    .line 325
    .line 326
    .line 327
    mul-float/2addr v7, v4

    .line 328
    invoke-virtual {v1, v2, v3, v7, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :pswitch_2
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 333
    .line 334
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-virtual {v3}, Landroid/graphics/Rect;->exactCenterY()F

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    const v5, 0x3ca3d70a    # 0.02f

    .line 354
    .line 355
    .line 356
    mul-float/2addr v5, v7

    .line 357
    add-float/2addr v5, v3

    .line 358
    move/from16 v3, v24

    .line 359
    .line 360
    :goto_0
    const/16 v8, 0xa

    .line 361
    .line 362
    if-lt v3, v8, :cond_1

    .line 363
    .line 364
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_1
    rem-int/lit8 v8, v3, 0x2

    .line 372
    .line 373
    if-nez v8, :cond_2

    .line 374
    .line 375
    const v8, 0x3ebd70a4    # 0.37f

    .line 376
    .line 377
    .line 378
    mul-float/2addr v8, v7

    .line 379
    goto :goto_1

    .line 380
    :cond_2
    mul-float v8, v7, v22

    .line 381
    .line 382
    :goto_1
    int-to-double v9, v3

    .line 383
    mul-double/2addr v9, v14

    .line 384
    const-wide/high16 v11, 0x4014000000000000L    # 5.0

    .line 385
    .line 386
    div-double/2addr v9, v11

    .line 387
    const-wide v11, -0x4006de04abbbd2e8L    # -1.5707963267948966

    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    add-double/2addr v9, v11

    .line 393
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    .line 394
    .line 395
    .line 396
    move-result-wide v11

    .line 397
    double-to-float v11, v11

    .line 398
    mul-float/2addr v11, v8

    .line 399
    add-float/2addr v11, v2

    .line 400
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 401
    .line 402
    .line 403
    move-result-wide v9

    .line 404
    double-to-float v9, v9

    .line 405
    mul-float/2addr v9, v8

    .line 406
    add-float/2addr v9, v5

    .line 407
    if-nez v3, :cond_3

    .line 408
    .line 409
    invoke-virtual {v4, v11, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 410
    .line 411
    .line 412
    goto :goto_2

    .line 413
    :cond_3
    invoke-virtual {v4, v11, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 414
    .line 415
    .line 416
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 417
    .line 418
    goto :goto_0

    .line 419
    :pswitch_3
    mul-float v19, v19, v7

    .line 420
    .line 421
    add-float v2, v19, v8

    .line 422
    .line 423
    mul-float v17, v17, v7

    .line 424
    .line 425
    add-float v3, v17, v9

    .line 426
    .line 427
    const v5, 0x3f5c28f6    # 0.86f

    .line 428
    .line 429
    .line 430
    mul-float/2addr v5, v7

    .line 431
    add-float/2addr v5, v8

    .line 432
    const v14, 0x3f451eb8    # 0.77f

    .line 433
    .line 434
    .line 435
    mul-float/2addr v14, v7

    .line 436
    add-float/2addr v14, v9

    .line 437
    invoke-virtual {v10, v2, v3, v5, v14}, Landroid/graphics/RectF;->set(FFFF)V

    .line 438
    .line 439
    .line 440
    mul-float v2, v7, v21

    .line 441
    .line 442
    invoke-virtual {v1, v10, v2, v2, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 443
    .line 444
    .line 445
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 446
    .line 447
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 448
    .line 449
    .line 450
    mul-float v20, v20, v7

    .line 451
    .line 452
    add-float v2, v20, v8

    .line 453
    .line 454
    mul-float/2addr v13, v7

    .line 455
    add-float/2addr v13, v9

    .line 456
    invoke-virtual {v4, v2, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 457
    .line 458
    .line 459
    mul-float/2addr v12, v7

    .line 460
    add-float/2addr v12, v9

    .line 461
    invoke-virtual {v4, v2, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 462
    .line 463
    .line 464
    mul-float v23, v23, v7

    .line 465
    .line 466
    add-float v2, v23, v8

    .line 467
    .line 468
    mul-float/2addr v7, v11

    .line 469
    add-float/2addr v7, v9

    .line 470
    invoke-virtual {v4, v2, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :pswitch_4
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    invoke-virtual {v3}, Landroid/graphics/Rect;->exactCenterX()F

    .line 485
    .line 486
    .line 487
    move-result v14

    .line 488
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    invoke-virtual {v3}, Landroid/graphics/Rect;->exactCenterY()F

    .line 493
    .line 494
    .line 495
    move-result v15

    .line 496
    const v3, 0x3e23d70a    # 0.16f

    .line 497
    .line 498
    .line 499
    mul-float/2addr v3, v7

    .line 500
    add-float v4, v3, v8

    .line 501
    .line 502
    add-float/2addr v3, v9

    .line 503
    mul-float v18, v18, v7

    .line 504
    .line 505
    add-float v8, v18, v8

    .line 506
    .line 507
    add-float v5, v18, v9

    .line 508
    .line 509
    invoke-virtual {v10, v4, v3, v8, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 513
    .line 514
    .line 515
    const v2, 0x3db851ec    # 0.09f

    .line 516
    .line 517
    .line 518
    mul-float/2addr v2, v7

    .line 519
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 520
    .line 521
    .line 522
    move/from16 v8, v24

    .line 523
    .line 524
    :goto_3
    const/4 v2, 0x6

    .line 525
    if-lt v8, v2, :cond_4

    .line 526
    .line 527
    mul-float v2, v7, v16

    .line 528
    .line 529
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 530
    .line 531
    .line 532
    const v2, 0x3df5c28f    # 0.12f

    .line 533
    .line 534
    .line 535
    mul-float/2addr v7, v2

    .line 536
    invoke-virtual {v1, v14, v15, v7, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :cond_4
    int-to-float v2, v8

    .line 541
    const/high16 v3, 0x42700000    # 60.0f

    .line 542
    .line 543
    mul-float/2addr v2, v3

    .line 544
    const/high16 v3, -0x3d520000    # -87.0f

    .line 545
    .line 546
    add-float/2addr v3, v2

    .line 547
    const/high16 v4, 0x42580000    # 54.0f

    .line 548
    .line 549
    const/4 v5, 0x0

    .line 550
    move-object v2, v10

    .line 551
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 552
    .line 553
    .line 554
    const/high16 v1, 0x41880000    # 17.0f

    .line 555
    .line 556
    add-float/2addr v1, v3

    .line 557
    float-to-double v1, v1

    .line 558
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 559
    .line 560
    .line 561
    move-result-wide v1

    .line 562
    const/high16 v4, 0x42500000    # 52.0f

    .line 563
    .line 564
    add-float/2addr v3, v4

    .line 565
    float-to-double v3, v3

    .line 566
    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    .line 567
    .line 568
    .line 569
    move-result-wide v3

    .line 570
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 571
    .line 572
    .line 573
    move-result-wide v11

    .line 574
    double-to-float v5, v11

    .line 575
    mul-float/2addr v5, v7

    .line 576
    mul-float v5, v5, v21

    .line 577
    .line 578
    add-float/2addr v5, v14

    .line 579
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 580
    .line 581
    .line 582
    move-result-wide v1

    .line 583
    double-to-float v1, v1

    .line 584
    mul-float/2addr v1, v7

    .line 585
    mul-float v1, v1, v21

    .line 586
    .line 587
    add-float/2addr v1, v15

    .line 588
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 589
    .line 590
    .line 591
    move-result-wide v11

    .line 592
    double-to-float v2, v11

    .line 593
    mul-float/2addr v2, v7

    .line 594
    const v9, 0x3e9eb852    # 0.31f

    .line 595
    .line 596
    .line 597
    mul-float/2addr v2, v9

    .line 598
    add-float/2addr v2, v14

    .line 599
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 600
    .line 601
    .line 602
    move-result-wide v3

    .line 603
    double-to-float v3, v3

    .line 604
    mul-float/2addr v3, v7

    .line 605
    mul-float/2addr v3, v9

    .line 606
    add-float/2addr v3, v15

    .line 607
    move v4, v2

    .line 608
    move v2, v5

    .line 609
    move v5, v3

    .line 610
    move v3, v1

    .line 611
    move-object/from16 v1, p1

    .line 612
    .line 613
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 614
    .line 615
    .line 616
    add-int/lit8 v8, v8, 0x1

    .line 617
    .line 618
    goto :goto_3

    .line 619
    :pswitch_5
    mul-float/2addr v13, v7

    .line 620
    add-float v2, v13, v8

    .line 621
    .line 622
    mul-float v22, v22, v7

    .line 623
    .line 624
    add-float v3, v22, v9

    .line 625
    .line 626
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 627
    .line 628
    .line 629
    add-float v5, v22, v8

    .line 630
    .line 631
    invoke-virtual {v4, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 632
    .line 633
    .line 634
    add-float/2addr v13, v9

    .line 635
    invoke-virtual {v4, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 636
    .line 637
    .line 638
    mul-float/2addr v12, v7

    .line 639
    add-float v10, v12, v8

    .line 640
    .line 641
    invoke-virtual {v4, v10, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 642
    .line 643
    .line 644
    const v14, 0x3f547ae1    # 0.83f

    .line 645
    .line 646
    .line 647
    mul-float/2addr v14, v7

    .line 648
    add-float v15, v14, v8

    .line 649
    .line 650
    invoke-virtual {v4, v15, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v4, v15, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 654
    .line 655
    .line 656
    add-float/2addr v12, v9

    .line 657
    invoke-virtual {v4, v5, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 658
    .line 659
    .line 660
    add-float/2addr v14, v9

    .line 661
    invoke-virtual {v4, v5, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v4, v2, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v4, v15, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v4, v15, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v4, v10, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v1, v4, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 677
    .line 678
    .line 679
    mul-float v10, v7, v25

    .line 680
    .line 681
    add-float v2, v10, v8

    .line 682
    .line 683
    mul-float/2addr v11, v7

    .line 684
    add-float v3, v11, v9

    .line 685
    .line 686
    const v4, 0x3f3851ec    # 0.72f

    .line 687
    .line 688
    .line 689
    mul-float/2addr v7, v4

    .line 690
    add-float v4, v7, v8

    .line 691
    .line 692
    move v5, v3

    .line 693
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 694
    .line 695
    .line 696
    return-void

    .line 697
    :pswitch_6
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 702
    .line 703
    .line 704
    move-result v8

    .line 705
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterY()F

    .line 710
    .line 711
    .line 712
    move-result v9

    .line 713
    const v2, 0x3e947ae1    # 0.29f

    .line 714
    .line 715
    .line 716
    mul-float/2addr v2, v7

    .line 717
    invoke-virtual {v1, v8, v9, v2, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 718
    .line 719
    .line 720
    const v2, 0x3dd70a3d    # 0.105f

    .line 721
    .line 722
    .line 723
    mul-float/2addr v2, v7

    .line 724
    invoke-virtual {v1, v8, v9, v2, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 725
    .line 726
    .line 727
    move/from16 v10, v24

    .line 728
    .line 729
    :goto_4
    const/16 v2, 0x8

    .line 730
    .line 731
    if-lt v10, v2, :cond_5

    .line 732
    .line 733
    goto :goto_6

    .line 734
    :cond_5
    int-to-double v2, v10

    .line 735
    mul-double/2addr v2, v14

    .line 736
    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    .line 737
    .line 738
    div-double/2addr v2, v4

    .line 739
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 740
    .line 741
    .line 742
    move-result-wide v4

    .line 743
    double-to-float v4, v4

    .line 744
    mul-float/2addr v4, v7

    .line 745
    const v5, 0x3eae147b    # 0.34f

    .line 746
    .line 747
    .line 748
    mul-float/2addr v4, v5

    .line 749
    add-float/2addr v4, v8

    .line 750
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 751
    .line 752
    .line 753
    move-result-wide v11

    .line 754
    double-to-float v11, v11

    .line 755
    mul-float/2addr v11, v7

    .line 756
    mul-float/2addr v11, v5

    .line 757
    add-float/2addr v11, v9

    .line 758
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 759
    .line 760
    .line 761
    move-result-wide v12

    .line 762
    double-to-float v5, v12

    .line 763
    mul-float/2addr v5, v7

    .line 764
    mul-float v5, v5, v20

    .line 765
    .line 766
    add-float/2addr v5, v8

    .line 767
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 768
    .line 769
    .line 770
    move-result-wide v2

    .line 771
    double-to-float v2, v2

    .line 772
    mul-float/2addr v2, v7

    .line 773
    mul-float v2, v2, v20

    .line 774
    .line 775
    add-float/2addr v2, v9

    .line 776
    move v3, v5

    .line 777
    move v5, v2

    .line 778
    move v2, v4

    .line 779
    move v4, v3

    .line 780
    move v3, v11

    .line 781
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 782
    .line 783
    .line 784
    add-int/lit8 v10, v10, 0x1

    .line 785
    .line 786
    move-object/from16 v1, p1

    .line 787
    .line 788
    goto :goto_4

    .line 789
    :pswitch_7
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 790
    .line 791
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 792
    .line 793
    .line 794
    const v1, 0x3e3851ec    # 0.18f

    .line 795
    .line 796
    .line 797
    mul-float v9, v7, v1

    .line 798
    .line 799
    const v1, 0x3de147ae    # 0.11f

    .line 800
    .line 801
    .line 802
    mul-float v10, v7, v1

    .line 803
    .line 804
    mul-float v1, v9, v3

    .line 805
    .line 806
    add-float/2addr v1, v10

    .line 807
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    div-float/2addr v1, v3

    .line 816
    sub-float v11, v2, v1

    .line 817
    .line 818
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterY()F

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    sub-float v12, v2, v1

    .line 827
    .line 828
    move/from16 v13, v24

    .line 829
    .line 830
    :goto_5
    const/4 v14, 0x2

    .line 831
    if-lt v13, v14, :cond_6

    .line 832
    .line 833
    :goto_6
    return-void

    .line 834
    :cond_6
    move/from16 v15, v24

    .line 835
    .line 836
    :goto_7
    if-lt v15, v14, :cond_7

    .line 837
    .line 838
    add-int/lit8 v13, v13, 0x1

    .line 839
    .line 840
    goto :goto_5

    .line 841
    :cond_7
    int-to-float v1, v15

    .line 842
    add-float v2, v9, v10

    .line 843
    .line 844
    mul-float/2addr v1, v2

    .line 845
    add-float/2addr v1, v11

    .line 846
    int-to-float v3, v13

    .line 847
    mul-float/2addr v3, v2

    .line 848
    add-float/2addr v3, v12

    .line 849
    add-float v4, v1, v9

    .line 850
    .line 851
    add-float v5, v3, v9

    .line 852
    .line 853
    move-object v8, v6

    .line 854
    mul-float v6, v9, v25

    .line 855
    .line 856
    move v7, v6

    .line 857
    move v2, v1

    .line 858
    move-object/from16 v1, p1

    .line 859
    .line 860
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 861
    .line 862
    .line 863
    move-object v6, v8

    .line 864
    add-int/lit8 v15, v15, 0x1

    .line 865
    .line 866
    goto :goto_7

    .line 867
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk9/d;->b:Landroid/graphics/Paint;

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
    iget-object v0, p0, Lk9/d;->b:Landroid/graphics/Paint;

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
