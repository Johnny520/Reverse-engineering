.class public final Lnw2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Luh1;

.field public final synthetic i:Leq2;

.field public final synthetic j:J

.field public final synthetic k:F

.field public final synthetic l:Lkw;


# direct methods
.method public constructor <init>(Luh1;Leq2;JFLkw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnw2;->h:Luh1;

    .line 5
    .line 6
    iput-object p2, p0, Lnw2;->i:Leq2;

    .line 7
    .line 8
    iput-wide p3, p0, Lnw2;->j:J

    .line 9
    .line 10
    iput p5, p0, Lnw2;->k:F

    .line 11
    .line 12
    iput-object p6, p0, Lnw2;->l:Lkw;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lpx;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v6, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v6

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v6

    .line 25
    check-cast v1, Lgo0;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, Lgo0;->O(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sget-object v3, La83;->a:La83;

    .line 32
    .line 33
    if-eqz v2, :cond_22

    .line 34
    .line 35
    sget-object v2, Lru;->a:Ltu2;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lpu;

    .line 42
    .line 43
    sget-object v4, Lru;->b:Ltu2;

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget-wide v7, v2, Lpu;->p:J

    .line 56
    .line 57
    iget-wide v9, v0, Lnw2;->j:J

    .line 58
    .line 59
    invoke-static {v9, v10, v7, v8}, Lju;->c(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    const/16 v12, 0x18

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    if-eqz v11, :cond_1b

    .line 67
    .line 68
    if-eqz v4, :cond_1b

    .line 69
    .line 70
    iget v4, v0, Lnw2;->k:F

    .line 71
    .line 72
    invoke-static {v4, v13}, Lza0;->b(FF)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_1

    .line 77
    .line 78
    :goto_1
    move/from16 v23, v6

    .line 79
    .line 80
    goto/16 :goto_14

    .line 81
    .line 82
    :cond_1
    const/high16 v9, 0x3f800000    # 1.0f

    .line 83
    .line 84
    add-float/2addr v4, v9

    .line 85
    float-to-double v10, v4

    .line 86
    invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v10

    .line 90
    double-to-float v4, v10

    .line 91
    const/high16 v10, 0x40900000    # 4.5f

    .line 92
    .line 93
    mul-float/2addr v4, v10

    .line 94
    const/high16 v10, 0x40000000    # 2.0f

    .line 95
    .line 96
    add-float/2addr v4, v10

    .line 97
    const/high16 v10, 0x42c80000    # 100.0f

    .line 98
    .line 99
    div-float/2addr v4, v10

    .line 100
    iget-wide v10, v2, Lpu;->t:J

    .line 101
    .line 102
    invoke-static {v4, v10, v11}, Lju;->b(FJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v10

    .line 106
    invoke-static {v7, v8}, Lju;->f(J)Lsu;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v10, v11, v2}, Lju;->a(JLsu;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    invoke-static {v7, v8}, Lju;->d(J)F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    invoke-static {v10, v11}, Lju;->d(J)F

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    sub-float v14, v9, v4

    .line 123
    .line 124
    mul-float v15, v2, v14

    .line 125
    .line 126
    add-float/2addr v15, v4

    .line 127
    invoke-static {v10, v11}, Lju;->h(J)F

    .line 128
    .line 129
    .line 130
    move-result v16

    .line 131
    invoke-static {v7, v8}, Lju;->h(J)F

    .line 132
    .line 133
    .line 134
    move-result v17

    .line 135
    cmpg-float v18, v15, v13

    .line 136
    .line 137
    if-nez v18, :cond_2

    .line 138
    .line 139
    move/from16 v17, v13

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_2
    mul-float v16, v16, v4

    .line 143
    .line 144
    mul-float v17, v17, v2

    .line 145
    .line 146
    mul-float v17, v17, v14

    .line 147
    .line 148
    add-float v17, v17, v16

    .line 149
    .line 150
    div-float v17, v17, v15

    .line 151
    .line 152
    :goto_2
    invoke-static {v10, v11}, Lju;->g(J)F

    .line 153
    .line 154
    .line 155
    move-result v16

    .line 156
    invoke-static {v7, v8}, Lju;->g(J)F

    .line 157
    .line 158
    .line 159
    move-result v19

    .line 160
    if-nez v18, :cond_3

    .line 161
    .line 162
    move/from16 v19, v13

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_3
    mul-float v16, v16, v4

    .line 166
    .line 167
    mul-float v19, v19, v2

    .line 168
    .line 169
    mul-float v19, v19, v14

    .line 170
    .line 171
    add-float v19, v19, v16

    .line 172
    .line 173
    div-float v19, v19, v15

    .line 174
    .line 175
    :goto_3
    invoke-static {v10, v11}, Lju;->e(J)F

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    invoke-static {v7, v8}, Lju;->e(J)F

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-nez v18, :cond_4

    .line 184
    .line 185
    move v11, v13

    .line 186
    goto :goto_4

    .line 187
    :cond_4
    mul-float/2addr v10, v4

    .line 188
    mul-float/2addr v11, v2

    .line 189
    mul-float/2addr v11, v14

    .line 190
    add-float/2addr v11, v10

    .line 191
    div-float/2addr v11, v15

    .line 192
    :goto_4
    invoke-static {v7, v8}, Lju;->f(J)Lsu;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v2}, Lsu;->c()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    const/16 v7, 0x20

    .line 201
    .line 202
    const/16 v8, 0x10

    .line 203
    .line 204
    const/high16 v10, 0x3f000000    # 0.5f

    .line 205
    .line 206
    if-eqz v4, :cond_5

    .line 207
    .line 208
    const/high16 v2, 0x437f0000    # 255.0f

    .line 209
    .line 210
    mul-float/2addr v15, v2

    .line 211
    add-float/2addr v15, v10

    .line 212
    float-to-int v4, v15

    .line 213
    shl-int/2addr v4, v12

    .line 214
    mul-float v17, v17, v2

    .line 215
    .line 216
    add-float v9, v17, v10

    .line 217
    .line 218
    float-to-int v9, v9

    .line 219
    shl-int/lit8 v8, v9, 0x10

    .line 220
    .line 221
    or-int/2addr v4, v8

    .line 222
    mul-float v19, v19, v2

    .line 223
    .line 224
    add-float v8, v19, v10

    .line 225
    .line 226
    float-to-int v8, v8

    .line 227
    shl-int/lit8 v8, v8, 0x8

    .line 228
    .line 229
    or-int/2addr v4, v8

    .line 230
    mul-float/2addr v11, v2

    .line 231
    add-float/2addr v11, v10

    .line 232
    float-to-int v2, v11

    .line 233
    or-int/2addr v2, v4

    .line 234
    int-to-long v8, v2

    .line 235
    shl-long v7, v8, v7

    .line 236
    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :cond_5
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    ushr-int/lit8 v14, v4, 0x1f

    .line 244
    .line 245
    move/from16 p1, v7

    .line 246
    .line 247
    ushr-int/lit8 v7, v4, 0x17

    .line 248
    .line 249
    move/from16 p2, v8

    .line 250
    .line 251
    const/16 v8, 0xff

    .line 252
    .line 253
    and-int/2addr v7, v8

    .line 254
    const v16, 0x7fffff

    .line 255
    .line 256
    .line 257
    and-int v17, v4, v16

    .line 258
    .line 259
    const/high16 v18, 0x800000

    .line 260
    .line 261
    move/from16 v20, v10

    .line 262
    .line 263
    const/16 v10, -0xa

    .line 264
    .line 265
    const/16 v21, 0x31

    .line 266
    .line 267
    const/16 v22, 0x200

    .line 268
    .line 269
    move/from16 v23, v6

    .line 270
    .line 271
    const/16 v6, 0x1f

    .line 272
    .line 273
    if-ne v7, v8, :cond_7

    .line 274
    .line 275
    if-eqz v17, :cond_6

    .line 276
    .line 277
    move/from16 v4, v22

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_6
    const/4 v4, 0x0

    .line 281
    :goto_5
    move v7, v6

    .line 282
    goto :goto_8

    .line 283
    :cond_7
    add-int/lit8 v7, v7, -0x70

    .line 284
    .line 285
    if-lt v7, v6, :cond_8

    .line 286
    .line 287
    move/from16 v7, v21

    .line 288
    .line 289
    const/4 v4, 0x0

    .line 290
    goto :goto_8

    .line 291
    :cond_8
    if-gtz v7, :cond_b

    .line 292
    .line 293
    if-lt v7, v10, :cond_a

    .line 294
    .line 295
    or-int v4, v17, v18

    .line 296
    .line 297
    rsub-int/lit8 v7, v7, 0x1

    .line 298
    .line 299
    shr-int/2addr v4, v7

    .line 300
    and-int/lit16 v7, v4, 0x1000

    .line 301
    .line 302
    if-eqz v7, :cond_9

    .line 303
    .line 304
    add-int/lit16 v4, v4, 0x2000

    .line 305
    .line 306
    :cond_9
    shr-int/lit8 v4, v4, 0xd

    .line 307
    .line 308
    :goto_6
    const/4 v7, 0x0

    .line 309
    goto :goto_8

    .line 310
    :cond_a
    const/4 v4, 0x0

    .line 311
    goto :goto_6

    .line 312
    :cond_b
    shr-int/lit8 v17, v17, 0xd

    .line 313
    .line 314
    and-int/lit16 v4, v4, 0x1000

    .line 315
    .line 316
    if-eqz v4, :cond_c

    .line 317
    .line 318
    shl-int/lit8 v4, v7, 0xa

    .line 319
    .line 320
    or-int v4, v4, v17

    .line 321
    .line 322
    add-int/lit8 v4, v4, 0x1

    .line 323
    .line 324
    shl-int/lit8 v7, v14, 0xf

    .line 325
    .line 326
    or-int/2addr v4, v7

    .line 327
    :goto_7
    int-to-short v4, v4

    .line 328
    goto :goto_9

    .line 329
    :cond_c
    move/from16 v4, v17

    .line 330
    .line 331
    :goto_8
    shl-int/lit8 v14, v14, 0xf

    .line 332
    .line 333
    shl-int/lit8 v7, v7, 0xa

    .line 334
    .line 335
    or-int/2addr v7, v14

    .line 336
    or-int/2addr v4, v7

    .line 337
    goto :goto_7

    .line 338
    :goto_9
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    ushr-int/lit8 v14, v7, 0x1f

    .line 343
    .line 344
    ushr-int/lit8 v5, v7, 0x17

    .line 345
    .line 346
    and-int/2addr v5, v8

    .line 347
    and-int v19, v7, v16

    .line 348
    .line 349
    if-ne v5, v8, :cond_e

    .line 350
    .line 351
    if-eqz v19, :cond_d

    .line 352
    .line 353
    move/from16 v5, v22

    .line 354
    .line 355
    goto :goto_a

    .line 356
    :cond_d
    const/4 v5, 0x0

    .line 357
    :goto_a
    move/from16 v19, v5

    .line 358
    .line 359
    move v5, v6

    .line 360
    goto :goto_d

    .line 361
    :cond_e
    add-int/lit8 v5, v5, -0x70

    .line 362
    .line 363
    if-lt v5, v6, :cond_f

    .line 364
    .line 365
    move/from16 v5, v21

    .line 366
    .line 367
    :goto_b
    const/16 v19, 0x0

    .line 368
    .line 369
    goto :goto_d

    .line 370
    :cond_f
    if-gtz v5, :cond_12

    .line 371
    .line 372
    if-lt v5, v10, :cond_11

    .line 373
    .line 374
    or-int v7, v19, v18

    .line 375
    .line 376
    rsub-int/lit8 v5, v5, 0x1

    .line 377
    .line 378
    shr-int v5, v7, v5

    .line 379
    .line 380
    and-int/lit16 v7, v5, 0x1000

    .line 381
    .line 382
    if-eqz v7, :cond_10

    .line 383
    .line 384
    add-int/lit16 v5, v5, 0x2000

    .line 385
    .line 386
    :cond_10
    shr-int/lit8 v5, v5, 0xd

    .line 387
    .line 388
    move/from16 v19, v5

    .line 389
    .line 390
    const/4 v5, 0x0

    .line 391
    goto :goto_d

    .line 392
    :cond_11
    const/4 v5, 0x0

    .line 393
    goto :goto_b

    .line 394
    :cond_12
    shr-int/lit8 v19, v19, 0xd

    .line 395
    .line 396
    and-int/lit16 v7, v7, 0x1000

    .line 397
    .line 398
    if-eqz v7, :cond_13

    .line 399
    .line 400
    shl-int/lit8 v5, v5, 0xa

    .line 401
    .line 402
    or-int v5, v5, v19

    .line 403
    .line 404
    add-int/lit8 v5, v5, 0x1

    .line 405
    .line 406
    shl-int/lit8 v7, v14, 0xf

    .line 407
    .line 408
    or-int/2addr v5, v7

    .line 409
    :goto_c
    int-to-short v5, v5

    .line 410
    goto :goto_e

    .line 411
    :cond_13
    :goto_d
    shl-int/lit8 v7, v14, 0xf

    .line 412
    .line 413
    shl-int/lit8 v5, v5, 0xa

    .line 414
    .line 415
    or-int/2addr v5, v7

    .line 416
    or-int v5, v5, v19

    .line 417
    .line 418
    goto :goto_c

    .line 419
    :goto_e
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 420
    .line 421
    .line 422
    move-result v7

    .line 423
    ushr-int/lit8 v11, v7, 0x1f

    .line 424
    .line 425
    ushr-int/lit8 v14, v7, 0x17

    .line 426
    .line 427
    and-int/2addr v14, v8

    .line 428
    and-int v16, v7, v16

    .line 429
    .line 430
    if-ne v14, v8, :cond_15

    .line 431
    .line 432
    if-eqz v16, :cond_14

    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_14
    const/16 v22, 0x0

    .line 436
    .line 437
    :goto_f
    move/from16 v21, v6

    .line 438
    .line 439
    move/from16 v6, v22

    .line 440
    .line 441
    goto :goto_12

    .line 442
    :cond_15
    add-int/lit8 v14, v14, -0x70

    .line 443
    .line 444
    if-lt v14, v6, :cond_16

    .line 445
    .line 446
    const/4 v6, 0x0

    .line 447
    goto :goto_12

    .line 448
    :cond_16
    if-gtz v14, :cond_19

    .line 449
    .line 450
    if-lt v14, v10, :cond_18

    .line 451
    .line 452
    or-int v6, v16, v18

    .line 453
    .line 454
    rsub-int/lit8 v7, v14, 0x1

    .line 455
    .line 456
    shr-int/2addr v6, v7

    .line 457
    and-int/lit16 v7, v6, 0x1000

    .line 458
    .line 459
    if-eqz v7, :cond_17

    .line 460
    .line 461
    add-int/lit16 v6, v6, 0x2000

    .line 462
    .line 463
    :cond_17
    shr-int/lit8 v6, v6, 0xd

    .line 464
    .line 465
    :goto_10
    const/16 v21, 0x0

    .line 466
    .line 467
    goto :goto_12

    .line 468
    :cond_18
    const/4 v6, 0x0

    .line 469
    goto :goto_10

    .line 470
    :cond_19
    shr-int/lit8 v6, v16, 0xd

    .line 471
    .line 472
    and-int/lit16 v7, v7, 0x1000

    .line 473
    .line 474
    if-eqz v7, :cond_1a

    .line 475
    .line 476
    shl-int/lit8 v7, v14, 0xa

    .line 477
    .line 478
    or-int/2addr v6, v7

    .line 479
    add-int/lit8 v6, v6, 0x1

    .line 480
    .line 481
    shl-int/lit8 v7, v11, 0xf

    .line 482
    .line 483
    or-int/2addr v6, v7

    .line 484
    :goto_11
    int-to-short v6, v6

    .line 485
    goto :goto_13

    .line 486
    :cond_1a
    move/from16 v21, v14

    .line 487
    .line 488
    :goto_12
    shl-int/lit8 v7, v11, 0xf

    .line 489
    .line 490
    shl-int/lit8 v8, v21, 0xa

    .line 491
    .line 492
    or-int/2addr v7, v8

    .line 493
    or-int/2addr v6, v7

    .line 494
    goto :goto_11

    .line 495
    :goto_13
    invoke-static {v15, v9}, Ljava/lang/Math;->min(FF)F

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    invoke-static {v13, v7}, Ljava/lang/Math;->max(FF)F

    .line 500
    .line 501
    .line 502
    move-result v7

    .line 503
    const v8, 0x447fc000    # 1023.0f

    .line 504
    .line 505
    .line 506
    mul-float/2addr v7, v8

    .line 507
    add-float v7, v7, v20

    .line 508
    .line 509
    float-to-int v7, v7

    .line 510
    iget v2, v2, Lsu;->c:I

    .line 511
    .line 512
    int-to-long v8, v4

    .line 513
    const-wide/32 v10, 0xffff

    .line 514
    .line 515
    .line 516
    and-long/2addr v8, v10

    .line 517
    const/16 v4, 0x30

    .line 518
    .line 519
    shl-long/2addr v8, v4

    .line 520
    int-to-long v4, v5

    .line 521
    and-long/2addr v4, v10

    .line 522
    shl-long v4, v4, p1

    .line 523
    .line 524
    or-long/2addr v4, v8

    .line 525
    int-to-long v8, v6

    .line 526
    and-long/2addr v8, v10

    .line 527
    shl-long v8, v8, p2

    .line 528
    .line 529
    or-long/2addr v4, v8

    .line 530
    int-to-long v6, v7

    .line 531
    const-wide/16 v8, 0x3ff

    .line 532
    .line 533
    and-long/2addr v6, v8

    .line 534
    const/4 v8, 0x6

    .line 535
    shl-long/2addr v6, v8

    .line 536
    or-long/2addr v4, v6

    .line 537
    int-to-long v6, v2

    .line 538
    const-wide/16 v8, 0x3f

    .line 539
    .line 540
    and-long/2addr v6, v8

    .line 541
    or-long v7, v4, v6

    .line 542
    .line 543
    goto :goto_14

    .line 544
    :cond_1b
    move/from16 v23, v6

    .line 545
    .line 546
    move-wide v7, v9

    .line 547
    :goto_14
    sget-object v2, Lly;->h:Ltu2;

    .line 548
    .line 549
    invoke-virtual {v1, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    const/high16 v4, 0x41200000    # 10.0f

    .line 554
    .line 555
    check-cast v2, Le70;

    .line 556
    .line 557
    invoke-interface {v2, v4}, Le70;->A(F)F

    .line 558
    .line 559
    .line 560
    move-result v28

    .line 561
    cmpl-float v2, v28, v13

    .line 562
    .line 563
    sget-object v24, Lrh1;->a:Lrh1;

    .line 564
    .line 565
    iget-object v4, v0, Lnw2;->i:Leq2;

    .line 566
    .line 567
    if-lez v2, :cond_1c

    .line 568
    .line 569
    sget-wide v29, Lm33;->b:J

    .line 570
    .line 571
    const/16 v32, 0x0

    .line 572
    .line 573
    sget-wide v33, Ltq0;->a:J

    .line 574
    .line 575
    const/high16 v25, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/high16 v26, 0x3f800000    # 1.0f

    .line 578
    .line 579
    const/high16 v27, 0x3f800000    # 1.0f

    .line 580
    .line 581
    move-wide/from16 v35, v33

    .line 582
    .line 583
    move-object/from16 v31, v4

    .line 584
    .line 585
    invoke-static/range {v24 .. v36}, Lte;->M(Luh1;FFFFJLeq2;ZJJ)Luh1;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    move-object/from16 v4, v24

    .line 590
    .line 591
    move-object/from16 v5, v31

    .line 592
    .line 593
    goto :goto_15

    .line 594
    :cond_1c
    move-object v5, v4

    .line 595
    move-object/from16 v4, v24

    .line 596
    .line 597
    move-object v2, v4

    .line 598
    :goto_15
    iget-object v6, v0, Lnw2;->h:Luh1;

    .line 599
    .line 600
    invoke-interface {v6, v2}, Luh1;->c(Luh1;)Luh1;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-interface {v2, v4}, Luh1;->c(Luh1;)Luh1;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-static {v2, v7, v8, v5}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    invoke-static {v2, v5}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    sget-object v5, Lnx;->a:Leb;

    .line 621
    .line 622
    if-ne v4, v5, :cond_1d

    .line 623
    .line 624
    new-instance v4, Lml2;

    .line 625
    .line 626
    invoke-direct {v4, v12}, Lml2;-><init>(I)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v1, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    :cond_1d
    check-cast v4, Lin0;

    .line 633
    .line 634
    const/4 v6, 0x0

    .line 635
    invoke-static {v2, v6, v4}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    if-ne v4, v5, :cond_1e

    .line 644
    .line 645
    sget-object v4, Lzo1;->c:Lzo1;

    .line 646
    .line 647
    invoke-virtual {v1, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    :cond_1e
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 651
    .line 652
    invoke-static {v2, v3, v4}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    sget-object v4, Lsn;->j:Lrk;

    .line 657
    .line 658
    move/from16 v5, v23

    .line 659
    .line 660
    invoke-static {v4, v5}, Ldm;->d(Lr5;Z)Lnf1;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    iget-wide v5, v1, Lgo0;->T:J

    .line 665
    .line 666
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 667
    .line 668
    .line 669
    move-result v5

    .line 670
    invoke-virtual {v1}, Lgo0;->l()Lyy1;

    .line 671
    .line 672
    .line 673
    move-result-object v6

    .line 674
    invoke-static {v1, v2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    sget-object v7, Lhx;->c:Lgx;

    .line 679
    .line 680
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    sget-object v7, Lgx;->b:Ljy;

    .line 684
    .line 685
    invoke-virtual {v1}, Lgo0;->Z()V

    .line 686
    .line 687
    .line 688
    iget-boolean v8, v1, Lgo0;->S:Z

    .line 689
    .line 690
    if-eqz v8, :cond_1f

    .line 691
    .line 692
    invoke-virtual {v1, v7}, Lgo0;->k(Lxm0;)V

    .line 693
    .line 694
    .line 695
    goto :goto_16

    .line 696
    :cond_1f
    invoke-virtual {v1}, Lgo0;->i0()V

    .line 697
    .line 698
    .line 699
    :goto_16
    sget-object v7, Lgx;->e:Llc;

    .line 700
    .line 701
    invoke-static {v1, v7, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    sget-object v4, Lgx;->d:Llc;

    .line 705
    .line 706
    invoke-static {v1, v4, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    sget-object v4, Lgx;->f:Llc;

    .line 710
    .line 711
    iget-boolean v6, v1, Lgo0;->S:Z

    .line 712
    .line 713
    if-nez v6, :cond_20

    .line 714
    .line 715
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v6

    .line 719
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 720
    .line 721
    .line 722
    move-result-object v7

    .line 723
    invoke-static {v6, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v6

    .line 727
    if-nez v6, :cond_21

    .line 728
    .line 729
    :cond_20
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    invoke-virtual {v1, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    invoke-virtual {v1, v4, v5}, Lgo0;->b(Lmn0;Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    :cond_21
    sget-object v4, Lgx;->c:Llc;

    .line 744
    .line 745
    invoke-static {v1, v4, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    const/16 v17, 0x0

    .line 749
    .line 750
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    iget-object v0, v0, Lnw2;->l:Lkw;

    .line 755
    .line 756
    invoke-virtual {v0, v1, v2}, Lkw;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    const/4 v5, 0x1

    .line 760
    invoke-virtual {v1, v5}, Lgo0;->p(Z)V

    .line 761
    .line 762
    .line 763
    return-object v3

    .line 764
    :cond_22
    invoke-virtual {v1}, Lgo0;->R()V

    .line 765
    .line 766
    .line 767
    return-object v3
.end method
