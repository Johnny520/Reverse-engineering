.class public abstract Lth/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li2/y;

.field public static final b:Lr9/p;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li2/y;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/y;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lth/c;->a:Li2/y;

    .line 9
    .line 10
    new-instance v0, Lr9/p;

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lr9/p;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lth/c;->b:Lr9/p;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Lth/g;FF)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lth/c;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    goto/16 :goto_c

    .line 17
    .line 18
    :cond_0
    iget-object v3, v0, Lth/g;->s:[[F

    .line 19
    .line 20
    iget-object v4, v0, Lth/g;->r:[[F

    .line 21
    .line 22
    const v5, 0x3ee66666    # 0.45f

    .line 23
    .line 24
    .line 25
    mul-float v6, v1, v5

    .line 26
    .line 27
    mul-float/2addr v5, v2

    .line 28
    iget v7, v0, Lth/g;->D:I

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/high16 v10, 0x40000000    # 2.0f

    .line 32
    .line 33
    const/4 v11, 0x1

    .line 34
    if-ltz v7, :cond_1

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_1
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    sget-object v12, Lvh/a;->d:[F

    .line 43
    .line 44
    array-length v13, v12

    .line 45
    const/4 v14, 0x0

    .line 46
    :goto_0
    if-ge v14, v13, :cond_3

    .line 47
    .line 48
    aget v15, v12, v14

    .line 49
    .line 50
    const v16, 0x3f6147ae    # 0.88f

    .line 51
    .line 52
    .line 53
    mul-float v16, v16, v15

    .line 54
    .line 55
    const v17, 0x3f8f5c29    # 1.12f

    .line 56
    .line 57
    .line 58
    mul-float v15, v15, v17

    .line 59
    .line 60
    cmpl-float v17, v7, v16

    .line 61
    .line 62
    if-lez v17, :cond_2

    .line 63
    .line 64
    cmpg-float v17, v7, v15

    .line 65
    .line 66
    if-gez v17, :cond_2

    .line 67
    .line 68
    sub-float v7, v7, v16

    .line 69
    .line 70
    sub-float v15, v15, v16

    .line 71
    .line 72
    div-float/2addr v7, v15

    .line 73
    const/high16 v12, 0x3f800000    # 1.0f

    .line 74
    .line 75
    invoke-static {v7, v9, v12}, Lr9/e0;->q(FFF)F

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    new-instance v12, Lvh/b;

    .line 80
    .line 81
    add-int/lit8 v13, v14, 0x1

    .line 82
    .line 83
    mul-float v15, v7, v7

    .line 84
    .line 85
    const/high16 v16, 0x40400000    # 3.0f

    .line 86
    .line 87
    mul-float/2addr v7, v10

    .line 88
    sub-float v16, v16, v7

    .line 89
    .line 90
    mul-float v7, v16, v15

    .line 91
    .line 92
    invoke-direct {v12, v7, v14, v13}, Lvh/b;-><init>(FII)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    add-int/lit8 v14, v14, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    mul-float/2addr v7, v7

    .line 100
    const v12, 0x44f32000    # 1945.0f

    .line 101
    .line 102
    .line 103
    cmpl-float v12, v7, v12

    .line 104
    .line 105
    if-ltz v12, :cond_4

    .line 106
    .line 107
    const/4 v7, 0x4

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/high16 v12, 0x43c80000    # 400.0f

    .line 110
    .line 111
    cmpl-float v12, v7, v12

    .line 112
    .line 113
    if-lez v12, :cond_5

    .line 114
    .line 115
    const/4 v7, 0x3

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    const v12, 0x42b48000    # 90.25f

    .line 118
    .line 119
    .line 120
    cmpl-float v12, v7, v12

    .line 121
    .line 122
    if-ltz v12, :cond_6

    .line 123
    .line 124
    const/4 v7, 0x2

    .line 125
    goto :goto_1

    .line 126
    :cond_6
    const v12, 0x4149999a    # 12.6f

    .line 127
    .line 128
    .line 129
    cmpl-float v7, v7, v12

    .line 130
    .line 131
    if-ltz v7, :cond_7

    .line 132
    .line 133
    move v7, v11

    .line 134
    goto :goto_1

    .line 135
    :cond_7
    const/4 v7, 0x0

    .line 136
    :goto_1
    new-instance v12, Lvh/b;

    .line 137
    .line 138
    invoke-direct {v12, v9, v7, v7}, Lvh/b;-><init>(FII)V

    .line 139
    .line 140
    .line 141
    :goto_2
    iget v7, v12, Lvh/b;->a:I

    .line 142
    .line 143
    iput v7, v0, Lth/g;->E:I

    .line 144
    .line 145
    iget v13, v12, Lvh/b;->b:I

    .line 146
    .line 147
    iput v13, v0, Lth/g;->F:I

    .line 148
    .line 149
    iget v12, v12, Lvh/b;->c:F

    .line 150
    .line 151
    iput v12, v0, Lth/g;->G:F

    .line 152
    .line 153
    :goto_3
    shl-int v12, v11, v7

    .line 154
    .line 155
    mul-int/lit8 v13, v12, 0xd

    .line 156
    .line 157
    int-to-float v13, v13

    .line 158
    iget v14, v0, Lth/g;->k:F

    .line 159
    .line 160
    cmpl-float v14, v13, v14

    .line 161
    .line 162
    if-lez v14, :cond_8

    .line 163
    .line 164
    iput v13, v0, Lth/g;->k:F

    .line 165
    .line 166
    :cond_8
    iget-wide v13, v0, Lth/g;->i:J

    .line 167
    .line 168
    const/16 v15, 0x20

    .line 169
    .line 170
    shr-long/2addr v13, v15

    .line 171
    long-to-int v13, v13

    .line 172
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    iget v14, v0, Lth/g;->k:F

    .line 177
    .line 178
    mul-float/2addr v14, v10

    .line 179
    add-float/2addr v14, v13

    .line 180
    move/from16 v16, v9

    .line 181
    .line 182
    iget-wide v8, v0, Lth/g;->i:J

    .line 183
    .line 184
    const-wide v17, 0xffffffffL

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    and-long v8, v8, v17

    .line 190
    .line 191
    long-to-int v8, v8

    .line 192
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    iget v9, v0, Lth/g;->k:F

    .line 197
    .line 198
    mul-float/2addr v9, v10

    .line 199
    add-float/2addr v9, v8

    .line 200
    iget-object v8, v0, Lth/g;->y:Lf1/n0;

    .line 201
    .line 202
    if-eqz v8, :cond_9

    .line 203
    .line 204
    iget v10, v0, Lth/g;->t:F

    .line 205
    .line 206
    cmpg-float v10, v10, v1

    .line 207
    .line 208
    if-nez v10, :cond_9

    .line 209
    .line 210
    iget v10, v0, Lth/g;->u:F

    .line 211
    .line 212
    cmpg-float v10, v10, v2

    .line 213
    .line 214
    if-nez v10, :cond_9

    .line 215
    .line 216
    iget v10, v0, Lth/g;->v:F

    .line 217
    .line 218
    cmpg-float v10, v10, v14

    .line 219
    .line 220
    if-nez v10, :cond_9

    .line 221
    .line 222
    iget v10, v0, Lth/g;->w:F

    .line 223
    .line 224
    cmpg-float v10, v10, v9

    .line 225
    .line 226
    if-nez v10, :cond_9

    .line 227
    .line 228
    iget v10, v0, Lth/g;->x:I

    .line 229
    .line 230
    if-ne v10, v7, :cond_9

    .line 231
    .line 232
    move/from16 v21, v12

    .line 233
    .line 234
    goto/16 :goto_b

    .line 235
    .line 236
    :cond_9
    mul-float/2addr v6, v6

    .line 237
    int-to-float v8, v12

    .line 238
    sget-object v10, Lvh/a;->c:[F

    .line 239
    .line 240
    aget v10, v10, v7

    .line 241
    .line 242
    sub-float/2addr v6, v10

    .line 243
    mul-float/2addr v8, v8

    .line 244
    div-float/2addr v6, v8

    .line 245
    const v19, 0x3dcccccd    # 0.1f

    .line 246
    .line 247
    .line 248
    cmpg-float v20, v6, v19

    .line 249
    .line 250
    if-gez v20, :cond_a

    .line 251
    .line 252
    move/from16 v6, v19

    .line 253
    .line 254
    :cond_a
    mul-float/2addr v5, v5

    .line 255
    sub-float/2addr v5, v10

    .line 256
    div-float/2addr v5, v8

    .line 257
    cmpg-float v8, v5, v19

    .line 258
    .line 259
    if-gez v8, :cond_b

    .line 260
    .line 261
    move/from16 v5, v19

    .line 262
    .line 263
    :cond_b
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    move v10, v14

    .line 268
    int-to-long v13, v8

    .line 269
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    move/from16 v21, v12

    .line 274
    .line 275
    int-to-long v11, v8

    .line 276
    shl-long/2addr v13, v15

    .line 277
    and-long v11, v11, v17

    .line 278
    .line 279
    or-long/2addr v11, v13

    .line 280
    cmpg-float v8, v1, v16

    .line 281
    .line 282
    if-gtz v8, :cond_c

    .line 283
    .line 284
    cmpg-float v8, v2, v16

    .line 285
    .line 286
    if-gtz v8, :cond_c

    .line 287
    .line 288
    move/from16 v18, v7

    .line 289
    .line 290
    move/from16 v27, v10

    .line 291
    .line 292
    const/4 v8, 0x0

    .line 293
    goto/16 :goto_a

    .line 294
    .line 295
    :cond_c
    shr-long v14, v11, v15

    .line 296
    .line 297
    long-to-int v8, v14

    .line 298
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    float-to-int v8, v8

    .line 303
    div-int v8, v8, v21

    .line 304
    .line 305
    const/4 v14, 0x1

    .line 306
    if-ge v8, v14, :cond_d

    .line 307
    .line 308
    move v8, v14

    .line 309
    :cond_d
    int-to-float v8, v8

    .line 310
    and-long v11, v11, v17

    .line 311
    .line 312
    long-to-int v11, v11

    .line 313
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    float-to-int v11, v11

    .line 318
    div-int v11, v11, v21

    .line 319
    .line 320
    if-ge v11, v14, :cond_e

    .line 321
    .line 322
    const/4 v11, 0x1

    .line 323
    :cond_e
    int-to-float v11, v11

    .line 324
    iget-object v12, v0, Lth/g;->o:[D

    .line 325
    .line 326
    iget-object v14, v0, Lth/g;->p:[F

    .line 327
    .line 328
    iget-object v15, v0, Lth/g;->q:[F

    .line 329
    .line 330
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 331
    .line 332
    .line 333
    move-result v17

    .line 334
    cmpl-float v18, v1, v16

    .line 335
    .line 336
    const-string v13, "in_maxCoord"

    .line 337
    .line 338
    move-object/from16 v23, v3

    .line 339
    .line 340
    const-string v3, "in_blurWeight"

    .line 341
    .line 342
    move-object/from16 v24, v4

    .line 343
    .line 344
    const-string v4, "in_blurOffset"

    .line 345
    .line 346
    move/from16 v25, v8

    .line 347
    .line 348
    const-string v8, "child"

    .line 349
    .line 350
    const/high16 v26, 0x3f000000    # 0.5f

    .line 351
    .line 352
    if-lez v18, :cond_12

    .line 353
    .line 354
    invoke-static {v6, v12, v14, v15}, Lvh/a;->a(F[D[F[F)I

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-lez v6, :cond_12

    .line 359
    .line 360
    aget-object v18, v24, v6

    .line 361
    .line 362
    if-nez v18, :cond_f

    .line 363
    .line 364
    move/from16 v27, v10

    .line 365
    .line 366
    mul-int/lit8 v10, v6, 0x2

    .line 367
    .line 368
    new-array v10, v10, [F

    .line 369
    .line 370
    aput-object v10, v24, v6

    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_f
    move/from16 v27, v10

    .line 374
    .line 375
    move-object/from16 v10, v18

    .line 376
    .line 377
    :goto_4
    aget-object v18, v23, v6

    .line 378
    .line 379
    if-nez v18, :cond_10

    .line 380
    .line 381
    move/from16 v28, v11

    .line 382
    .line 383
    new-array v11, v6, [F

    .line 384
    .line 385
    aput-object v11, v23, v6

    .line 386
    .line 387
    goto :goto_5

    .line 388
    :cond_10
    move/from16 v28, v11

    .line 389
    .line 390
    move-object/from16 v11, v18

    .line 391
    .line 392
    :goto_5
    move/from16 v18, v7

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    :goto_6
    if-ge v7, v6, :cond_11

    .line 396
    .line 397
    mul-int/lit8 v22, v7, 0x2

    .line 398
    .line 399
    aget v29, v14, v7

    .line 400
    .line 401
    aput v29, v10, v22

    .line 402
    .line 403
    const/16 v20, 0x1

    .line 404
    .line 405
    add-int/lit8 v22, v22, 0x1

    .line 406
    .line 407
    aput v16, v10, v22

    .line 408
    .line 409
    aget v22, v15, v7

    .line 410
    .line 411
    aput v22, v11, v7

    .line 412
    .line 413
    add-int/lit8 v7, v7, 0x1

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_11
    sget-object v7, Lvh/a;->a:[[Ljava/lang/String;

    .line 417
    .line 418
    aget-object v7, v7, v6

    .line 419
    .line 420
    aget-object v7, v7, v17

    .line 421
    .line 422
    sget-object v22, Lvh/d;->a:[Ljava/lang/String;

    .line 423
    .line 424
    aget-object v6, v22, v6

    .line 425
    .line 426
    invoke-virtual {v0, v7, v6}, Lth/g;->e(Ljava/lang/String;Ljava/lang/String;)Lai/b;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    iget-object v7, v6, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 431
    .line 432
    invoke-static {v7, v4, v10}, Lai/a;->w(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 433
    .line 434
    .line 435
    iget-object v7, v6, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 436
    .line 437
    invoke-static {v7, v3, v11}, Lai/a;->w(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 438
    .line 439
    .line 440
    sub-float v7, v25, v26

    .line 441
    .line 442
    sub-float v11, v28, v26

    .line 443
    .line 444
    iget-object v10, v6, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 445
    .line 446
    invoke-static {v10, v13, v7, v11}, Lai/a;->t(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 447
    .line 448
    .line 449
    invoke-static {v6, v8}, Lac/p;->L(Lai/b;Ljava/lang/String;)Lf1/m;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    goto :goto_7

    .line 454
    :cond_12
    move/from16 v18, v7

    .line 455
    .line 456
    move/from16 v27, v10

    .line 457
    .line 458
    move/from16 v28, v11

    .line 459
    .line 460
    const/4 v6, 0x0

    .line 461
    :goto_7
    cmpl-float v7, v2, v16

    .line 462
    .line 463
    if-lez v7, :cond_17

    .line 464
    .line 465
    invoke-static {v5, v12, v14, v15}, Lvh/a;->a(F[D[F[F)I

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    if-lez v5, :cond_17

    .line 470
    .line 471
    aget-object v7, v24, v5

    .line 472
    .line 473
    if-nez v7, :cond_13

    .line 474
    .line 475
    mul-int/lit8 v7, v5, 0x2

    .line 476
    .line 477
    new-array v7, v7, [F

    .line 478
    .line 479
    aput-object v7, v24, v5

    .line 480
    .line 481
    :cond_13
    aget-object v10, v23, v5

    .line 482
    .line 483
    if-nez v10, :cond_14

    .line 484
    .line 485
    new-array v10, v5, [F

    .line 486
    .line 487
    aput-object v10, v23, v5

    .line 488
    .line 489
    :cond_14
    const/4 v11, 0x0

    .line 490
    :goto_8
    if-ge v11, v5, :cond_15

    .line 491
    .line 492
    mul-int/lit8 v12, v11, 0x2

    .line 493
    .line 494
    aput v16, v7, v12

    .line 495
    .line 496
    const/16 v20, 0x1

    .line 497
    .line 498
    add-int/lit8 v12, v12, 0x1

    .line 499
    .line 500
    aget v19, v14, v11

    .line 501
    .line 502
    aput v19, v7, v12

    .line 503
    .line 504
    aget v12, v15, v11

    .line 505
    .line 506
    aput v12, v10, v11

    .line 507
    .line 508
    add-int/lit8 v11, v11, 0x1

    .line 509
    .line 510
    goto :goto_8

    .line 511
    :cond_15
    sget-object v11, Lvh/a;->b:[[Ljava/lang/String;

    .line 512
    .line 513
    aget-object v11, v11, v5

    .line 514
    .line 515
    aget-object v11, v11, v17

    .line 516
    .line 517
    sget-object v12, Lvh/d;->a:[Ljava/lang/String;

    .line 518
    .line 519
    aget-object v5, v12, v5

    .line 520
    .line 521
    invoke-virtual {v0, v11, v5}, Lth/g;->e(Ljava/lang/String;Ljava/lang/String;)Lai/b;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    iget-object v11, v5, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 526
    .line 527
    invoke-static {v11, v4, v7}, Lai/a;->w(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 528
    .line 529
    .line 530
    iget-object v4, v5, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 531
    .line 532
    invoke-static {v4, v3, v10}, Lai/a;->w(Landroid/graphics/RuntimeShader;Ljava/lang/String;[F)V

    .line 533
    .line 534
    .line 535
    sub-float v3, v25, v26

    .line 536
    .line 537
    sub-float v11, v28, v26

    .line 538
    .line 539
    iget-object v4, v5, Lai/b;->a:Landroid/graphics/RuntimeShader;

    .line 540
    .line 541
    invoke-static {v4, v13, v3, v11}, Lai/a;->t(Landroid/graphics/RuntimeShader;Ljava/lang/String;FF)V

    .line 542
    .line 543
    .line 544
    if-eqz v6, :cond_16

    .line 545
    .line 546
    invoke-static {v5, v8}, Lac/p;->L(Lai/b;Ljava/lang/String;)Lf1/m;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-static {v6, v3}, Lac/p;->i(Lf1/n0;Lf1/n0;)Lf1/n0;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    :goto_9
    move-object v8, v3

    .line 555
    goto :goto_a

    .line 556
    :cond_16
    invoke-static {v5, v8}, Lac/p;->L(Lai/b;Ljava/lang/String;)Lf1/m;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    goto :goto_9

    .line 561
    :cond_17
    move-object v8, v6

    .line 562
    :goto_a
    iput v1, v0, Lth/g;->t:F

    .line 563
    .line 564
    iput v2, v0, Lth/g;->u:F

    .line 565
    .line 566
    move/from16 v10, v27

    .line 567
    .line 568
    iput v10, v0, Lth/g;->v:F

    .line 569
    .line 570
    iput v9, v0, Lth/g;->w:F

    .line 571
    .line 572
    move/from16 v7, v18

    .line 573
    .line 574
    iput v7, v0, Lth/g;->x:I

    .line 575
    .line 576
    iput-object v8, v0, Lth/g;->y:Lf1/n0;

    .line 577
    .line 578
    :goto_b
    if-nez v8, :cond_18

    .line 579
    .line 580
    :goto_c
    return-void

    .line 581
    :cond_18
    move/from16 v1, v21

    .line 582
    .line 583
    iput v1, v0, Lth/g;->m:I

    .line 584
    .line 585
    iget-object v1, v0, Lth/g;->l:Lf1/n0;

    .line 586
    .line 587
    if-eqz v1, :cond_19

    .line 588
    .line 589
    invoke-static {v1, v8}, Lac/p;->i(Lf1/n0;Lf1/n0;)Lf1/n0;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    :cond_19
    iput-object v8, v0, Lth/g;->l:Lf1/n0;

    .line 594
    .line 595
    return-void
.end method

.method public static b(Ly0/o;Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/l;I)Ly0/o;
    .locals 11

    .line 1
    and-int/lit8 v0, p7, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v6, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v6, p4

    .line 9
    :goto_0
    and-int/lit8 p4, p7, 0x10

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    move-object v7, v1

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object/from16 v7, p5

    .line 16
    .line 17
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lth/c;->c()Z

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    sget-object p4, Ly0/l;->a:Ly0/l;

    .line 34
    .line 35
    if-eqz v7, :cond_2

    .line 36
    .line 37
    invoke-static {p4, v7}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    :cond_2
    invoke-interface {p0, p4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v2, Lth/b;

    .line 46
    .line 47
    sget-object v8, Lth/c;->a:Li2/y;

    .line 48
    .line 49
    move-object v3, p1

    .line 50
    move-object v4, p2

    .line 51
    move-object v5, p3

    .line 52
    move-object/from16 v9, p6

    .line 53
    .line 54
    invoke-direct/range {v2 .. v10}, Lth/b;-><init>(Lth/a;Lfg/a;Lfg/l;Lfg/l;Lfg/l;Lfg/p;Lfg/l;Z)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public static final c()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static final d(Ly0/o;Lth/j;)Ly0/o;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lth/k;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lth/k;-><init>(Lth/j;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final e(Li1/b;Li0/h0;II)Lth/j;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lf1/e0;->a(Li0/h0;)Li1/b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    sget-object p3, Lth/c;->b:Lr9/p;

    .line 10
    .line 11
    invoke-static {p3, p1}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    and-int/lit8 p2, p2, 0xe

    .line 16
    .line 17
    xor-int/lit8 p2, p2, 0x6

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    if-le p2, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :cond_2
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    sget-object v0, Li0/l;->a:Li0/e;

    .line 36
    .line 37
    if-ne p2, v0, :cond_4

    .line 38
    .line 39
    :cond_3
    new-instance p2, Lth/j;

    .line 40
    .line 41
    new-instance v0, Lb0/l;

    .line 42
    .line 43
    const/16 v1, 0xb

    .line 44
    .line 45
    invoke-direct {v0, p3, v1}, Lb0/l;-><init>(Li0/a1;I)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p2, p0, v0}, Lth/j;-><init>(Li1/b;Lb0/l;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    check-cast p2, Lth/j;

    .line 55
    .line 56
    return-object p2
.end method
