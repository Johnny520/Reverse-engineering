.class public final Lni0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lxd0;


# instance fields
.field public final synthetic a:Lhw;

.field public final synthetic b:Lww;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lhw;Lww;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lni0;->a:Lhw;

    .line 5
    .line 6
    iput-object p2, p0, Lni0;->b:Lww;

    .line 7
    .line 8
    iput-boolean p3, p0, Lni0;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Lzd0;Ljava/util/List;J)Lyd0;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    iget-object v2, v0, Lni0;->a:Lhw;

    .line 8
    .line 9
    invoke-interface {v2}, Lhw;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    cmpg-float v4, v2, v3

    .line 21
    .line 22
    if-gez v4, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v2

    .line 26
    :goto_0
    const/4 v9, 0x0

    .line 27
    const/16 v10, 0xa

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    move-wide/from16 v4, p3

    .line 33
    .line 34
    invoke-static/range {v4 .. v10}, Lpj;->a(JIIIII)J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v5, 0x0

    .line 43
    :goto_1
    const-string v8, "Collection contains no element matching the predicate."

    .line 44
    .line 45
    if-ge v5, v2, :cond_15

    .line 46
    .line 47
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    check-cast v9, Lsd0;

    .line 52
    .line 53
    invoke-static {v9}, Lpf1;->z(Lsd0;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    const-string v11, "icon"

    .line 58
    .line 59
    invoke-static {v10, v11}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-eqz v10, :cond_14

    .line 64
    .line 65
    invoke-interface {v9, v6, v7}, Lsd0;->e(J)Lxq0;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget v5, v2, Lxq0;->d:I

    .line 70
    .line 71
    sget v9, Loi0;->d:F

    .line 72
    .line 73
    const/high16 v10, 0x40000000    # 2.0f

    .line 74
    .line 75
    mul-float/2addr v9, v10

    .line 76
    invoke-interface {v15, v9}, Lym;->F(F)I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    add-int/2addr v9, v5

    .line 81
    int-to-float v5, v9

    .line 82
    mul-float/2addr v5, v3

    .line 83
    invoke-static {v5}, Lrd0;->Q(F)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    iget v11, v2, Lxq0;->e:I

    .line 88
    .line 89
    sget v12, Loi0;->e:F

    .line 90
    .line 91
    mul-float/2addr v12, v10

    .line 92
    invoke-interface {v15, v12}, Lym;->F(F)I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    add-int/2addr v12, v11

    .line 97
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    const/4 v13, 0x0

    .line 102
    :goto_2
    if-ge v13, v11, :cond_13

    .line 103
    .line 104
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v14

    .line 108
    check-cast v14, Lsd0;

    .line 109
    .line 110
    invoke-static {v14}, Lpf1;->z(Lsd0;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    move/from16 v17, v10

    .line 115
    .line 116
    const-string v10, "indicatorRipple"

    .line 117
    .line 118
    invoke-static {v4, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_12

    .line 123
    .line 124
    if-ltz v9, :cond_1

    .line 125
    .line 126
    const/4 v10, 0x1

    .line 127
    goto :goto_3

    .line 128
    :cond_1
    const/4 v10, 0x0

    .line 129
    :goto_3
    if-ltz v12, :cond_2

    .line 130
    .line 131
    const/4 v11, 0x1

    .line 132
    goto :goto_4

    .line 133
    :cond_2
    const/4 v11, 0x0

    .line 134
    :goto_4
    and-int/2addr v10, v11

    .line 135
    const-string v11, "width and height must be >= 0"

    .line 136
    .line 137
    if-nez v10, :cond_3

    .line 138
    .line 139
    invoke-static {v11}, Ly10;->a(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    invoke-static {v9, v9, v12, v12}, Lqj;->g(IIII)J

    .line 143
    .line 144
    .line 145
    move-result-wide v9

    .line 146
    invoke-interface {v14, v9, v10}, Lsd0;->e(J)Lxq0;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    const/4 v13, 0x0

    .line 155
    :goto_5
    if-ge v13, v10, :cond_5

    .line 156
    .line 157
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v18

    .line 161
    move-object/from16 v19, v18

    .line 162
    .line 163
    check-cast v19, Lsd0;

    .line 164
    .line 165
    invoke-static/range {v19 .. v19}, Lpf1;->z(Lsd0;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    const-string v14, "indicator"

    .line 170
    .line 171
    invoke-static {v4, v14}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_4

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_5
    const/16 v18, 0x0

    .line 182
    .line 183
    :goto_6
    move-object/from16 v4, v18

    .line 184
    .line 185
    check-cast v4, Lsd0;

    .line 186
    .line 187
    if-eqz v4, :cond_9

    .line 188
    .line 189
    if-ltz v5, :cond_6

    .line 190
    .line 191
    const/4 v10, 0x1

    .line 192
    goto :goto_7

    .line 193
    :cond_6
    const/4 v10, 0x0

    .line 194
    :goto_7
    if-ltz v12, :cond_7

    .line 195
    .line 196
    const/16 v20, 0x1

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_7
    const/16 v20, 0x0

    .line 200
    .line 201
    :goto_8
    and-int v10, v10, v20

    .line 202
    .line 203
    if-nez v10, :cond_8

    .line 204
    .line 205
    invoke-static {v11}, Ly10;->a(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :cond_8
    invoke-static {v5, v5, v12, v12}, Lqj;->g(IIII)J

    .line 209
    .line 210
    .line 211
    move-result-wide v10

    .line 212
    invoke-interface {v4, v10, v11}, Lsd0;->e(J)Lxq0;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    goto :goto_9

    .line 217
    :cond_9
    const/4 v4, 0x0

    .line 218
    :goto_9
    iget-object v5, v0, Lni0;->b:Lww;

    .line 219
    .line 220
    if-eqz v5, :cond_c

    .line 221
    .line 222
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    const/4 v11, 0x0

    .line 227
    :goto_a
    if-ge v11, v10, :cond_b

    .line 228
    .line 229
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    check-cast v12, Lsd0;

    .line 234
    .line 235
    invoke-static {v12}, Lpf1;->z(Lsd0;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    const-string v14, "label"

    .line 240
    .line 241
    invoke-static {v13, v14}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    if-eqz v13, :cond_a

    .line 246
    .line 247
    invoke-interface {v12, v6, v7}, Lsd0;->e(J)Lxq0;

    .line 248
    .line 249
    .line 250
    move-result-object v14

    .line 251
    goto :goto_b

    .line 252
    :cond_a
    add-int/lit8 v11, v11, 0x1

    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_b
    invoke-static {v8}, Lya0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 256
    .line 257
    .line 258
    new-instance v0, Lsg;

    .line 259
    .line 260
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 261
    .line 262
    .line 263
    throw v0

    .line 264
    :cond_c
    const/4 v14, 0x0

    .line 265
    :goto_b
    sget-object v1, Lis;->d:Lis;

    .line 266
    .line 267
    const v6, 0x7fffffff

    .line 268
    .line 269
    .line 270
    if-nez v5, :cond_e

    .line 271
    .line 272
    invoke-static/range {p3 .. p4}, Lpj;->h(J)I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-ne v0, v6, :cond_d

    .line 277
    .line 278
    iget v0, v2, Lxq0;->d:I

    .line 279
    .line 280
    sget v3, Loi0;->g:F

    .line 281
    .line 282
    invoke-interface {v15, v3}, Lym;->F(F)I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    mul-int/lit8 v3, v3, 0x2

    .line 287
    .line 288
    add-int/2addr v3, v0

    .line 289
    :goto_c
    move/from16 v24, v3

    .line 290
    .line 291
    goto :goto_d

    .line 292
    :cond_d
    invoke-static/range {p3 .. p4}, Lpj;->h(J)I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    goto :goto_c

    .line 297
    :goto_d
    sget v0, Loi0;->a:F

    .line 298
    .line 299
    invoke-interface {v15, v0}, Lym;->F(F)I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    move-wide/from16 v7, p3

    .line 304
    .line 305
    invoke-static {v0, v7, v8}, Lqj;->e(IJ)I

    .line 306
    .line 307
    .line 308
    move-result v25

    .line 309
    iget v0, v2, Lxq0;->d:I

    .line 310
    .line 311
    sub-int v0, v24, v0

    .line 312
    .line 313
    div-int/lit8 v19, v0, 0x2

    .line 314
    .line 315
    iget v0, v2, Lxq0;->e:I

    .line 316
    .line 317
    sub-int v0, v25, v0

    .line 318
    .line 319
    div-int/lit8 v20, v0, 0x2

    .line 320
    .line 321
    iget v0, v9, Lxq0;->d:I

    .line 322
    .line 323
    sub-int v0, v24, v0

    .line 324
    .line 325
    div-int/lit8 v22, v0, 0x2

    .line 326
    .line 327
    iget v0, v9, Lxq0;->e:I

    .line 328
    .line 329
    sub-int v0, v25, v0

    .line 330
    .line 331
    div-int/lit8 v23, v0, 0x2

    .line 332
    .line 333
    new-instance v16, Lki0;

    .line 334
    .line 335
    move-object/from16 v18, v2

    .line 336
    .line 337
    move-object/from16 v17, v4

    .line 338
    .line 339
    move-object/from16 v21, v9

    .line 340
    .line 341
    invoke-direct/range {v16 .. v25}, Lki0;-><init>(Lxq0;Lxq0;IILxq0;IIII)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v2, v16

    .line 345
    .line 346
    move/from16 v3, v24

    .line 347
    .line 348
    move/from16 v0, v25

    .line 349
    .line 350
    invoke-interface {v15, v3, v0, v1, v2}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    return-object v0

    .line 355
    :cond_e
    move-object v8, v2

    .line 356
    move-object v11, v9

    .line 357
    move-object v2, v1

    .line 358
    move-object v1, v4

    .line 359
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget v4, v8, Lxq0;->e:I

    .line 363
    .line 364
    int-to-float v4, v4

    .line 365
    sget v5, Loi0;->e:F

    .line 366
    .line 367
    invoke-interface {v15, v5}, Lym;->p(F)F

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    add-float/2addr v7, v4

    .line 372
    sget v4, Loi0;->c:F

    .line 373
    .line 374
    invoke-interface {v15, v4}, Lym;->p(F)F

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    add-float/2addr v9, v7

    .line 379
    iget v7, v14, Lxq0;->e:I

    .line 380
    .line 381
    int-to-float v7, v7

    .line 382
    add-float/2addr v9, v7

    .line 383
    invoke-static/range {p3 .. p4}, Lpj;->i(J)I

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    int-to-float v7, v7

    .line 388
    sub-float/2addr v7, v9

    .line 389
    div-float v7, v7, v17

    .line 390
    .line 391
    invoke-interface {v15, v5}, Lym;->p(F)F

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    cmpg-float v12, v7, v10

    .line 396
    .line 397
    if-gez v12, :cond_f

    .line 398
    .line 399
    goto :goto_e

    .line 400
    :cond_f
    move v10, v7

    .line 401
    :goto_e
    mul-float v7, v10, v17

    .line 402
    .line 403
    add-float/2addr v7, v9

    .line 404
    move-object v9, v2

    .line 405
    iget-boolean v2, v0, Lni0;->c:Z

    .line 406
    .line 407
    if-eqz v2, :cond_10

    .line 408
    .line 409
    move v0, v10

    .line 410
    goto :goto_f

    .line 411
    :cond_10
    iget v0, v8, Lxq0;->e:I

    .line 412
    .line 413
    int-to-float v0, v0

    .line 414
    sub-float v0, v7, v0

    .line 415
    .line 416
    div-float v0, v0, v17

    .line 417
    .line 418
    :goto_f
    sub-float/2addr v0, v10

    .line 419
    const/high16 v12, 0x3f800000    # 1.0f

    .line 420
    .line 421
    sub-float/2addr v12, v3

    .line 422
    mul-float/2addr v12, v0

    .line 423
    iget v0, v8, Lxq0;->e:I

    .line 424
    .line 425
    int-to-float v0, v0

    .line 426
    add-float/2addr v0, v10

    .line 427
    invoke-interface {v15, v5}, Lym;->p(F)F

    .line 428
    .line 429
    .line 430
    move-result v13

    .line 431
    add-float/2addr v13, v0

    .line 432
    invoke-interface {v15, v4}, Lym;->p(F)F

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    add-float/2addr v0, v13

    .line 437
    invoke-static/range {p3 .. p4}, Lpj;->h(J)I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    if-ne v4, v6, :cond_11

    .line 442
    .line 443
    iget v4, v8, Lxq0;->d:I

    .line 444
    .line 445
    sget v6, Loi0;->g:F

    .line 446
    .line 447
    invoke-interface {v15, v6}, Lym;->F(F)I

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    mul-int/lit8 v6, v6, 0x2

    .line 452
    .line 453
    add-int/2addr v6, v4

    .line 454
    goto :goto_10

    .line 455
    :cond_11
    invoke-static/range {p3 .. p4}, Lpj;->h(J)I

    .line 456
    .line 457
    .line 458
    move-result v6

    .line 459
    :goto_10
    iget v4, v14, Lxq0;->d:I

    .line 460
    .line 461
    sub-int v4, v6, v4

    .line 462
    .line 463
    div-int/lit8 v4, v4, 0x2

    .line 464
    .line 465
    iget v13, v8, Lxq0;->d:I

    .line 466
    .line 467
    sub-int v13, v6, v13

    .line 468
    .line 469
    div-int/lit8 v13, v13, 0x2

    .line 470
    .line 471
    move/from16 p0, v0

    .line 472
    .line 473
    iget v0, v11, Lxq0;->d:I

    .line 474
    .line 475
    sub-int v0, v6, v0

    .line 476
    .line 477
    div-int/lit8 v0, v0, 0x2

    .line 478
    .line 479
    invoke-interface {v15, v5}, Lym;->p(F)F

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    sub-float v5, v10, v5

    .line 484
    .line 485
    invoke-static {v7}, Lrd0;->Q(F)I

    .line 486
    .line 487
    .line 488
    move-result v7

    .line 489
    move/from16 v16, v7

    .line 490
    .line 491
    move v7, v12

    .line 492
    move v12, v0

    .line 493
    new-instance v0, Lji0;

    .line 494
    .line 495
    move-object/from16 v27, v9

    .line 496
    .line 497
    move v9, v13

    .line 498
    move/from16 v26, v16

    .line 499
    .line 500
    move v13, v5

    .line 501
    move v5, v4

    .line 502
    move-object v4, v14

    .line 503
    move v14, v6

    .line 504
    move/from16 v6, p0

    .line 505
    .line 506
    invoke-direct/range {v0 .. v15}, Lji0;-><init>(Lxq0;ZFLxq0;IFFLxq0;IFLxq0;IFILzd0;)V

    .line 507
    .line 508
    .line 509
    move-object v1, v0

    .line 510
    move/from16 v0, v26

    .line 511
    .line 512
    move-object/from16 v2, v27

    .line 513
    .line 514
    invoke-interface {v15, v14, v0, v2, v1}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    return-object v0

    .line 519
    :cond_12
    move-object/from16 v18, v2

    .line 520
    .line 521
    add-int/lit8 v13, v13, 0x1

    .line 522
    .line 523
    move/from16 v10, v17

    .line 524
    .line 525
    goto/16 :goto_2

    .line 526
    .line 527
    :cond_13
    invoke-static {v8}, Lya0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 528
    .line 529
    .line 530
    new-instance v0, Lsg;

    .line 531
    .line 532
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 533
    .line 534
    .line 535
    throw v0

    .line 536
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 537
    .line 538
    goto/16 :goto_1

    .line 539
    .line 540
    :cond_15
    invoke-static {v8}, Lya0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 541
    .line 542
    .line 543
    new-instance v0, Lsg;

    .line 544
    .line 545
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 546
    .line 547
    .line 548
    throw v0
.end method
