.class public final Lyn0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lr70;


# instance fields
.field public final synthetic a:Lkm;

.field public final synthetic b:Ljn0;

.field public final synthetic c:Ln2;

.field public final synthetic d:Lhw;

.field public final synthetic e:Lhw;

.field public final synthetic f:Lga;

.field public final synthetic g:Ln2;

.field public final synthetic h:Lyk;


# direct methods
.method public constructor <init>(Lkm;Ljn0;Ln2;Lx70;Lhw;Lga;Ln2;Lyk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyn0;->a:Lkm;

    .line 5
    .line 6
    iput-object p2, p0, Lyn0;->b:Ljn0;

    .line 7
    .line 8
    iput-object p3, p0, Lyn0;->c:Ln2;

    .line 9
    .line 10
    iput-object p4, p0, Lyn0;->d:Lhw;

    .line 11
    .line 12
    iput-object p5, p0, Lyn0;->e:Lhw;

    .line 13
    .line 14
    iput-object p6, p0, Lyn0;->f:Lga;

    .line 15
    .line 16
    iput-object p7, p0, Lyn0;->g:Ln2;

    .line 17
    .line 18
    iput-object p8, p0, Lyn0;->h:Lyk;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ls70;J)Lyd0;
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v12, p2

    .line 6
    .line 7
    iget-object v14, v0, Lyn0;->a:Lkm;

    .line 8
    .line 9
    iget-object v2, v14, Llo0;->D:Loh0;

    .line 10
    .line 11
    invoke-interface {v2}, Lw31;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    sget-object v15, Lum0;->e:Lum0;

    .line 15
    .line 16
    invoke-static {v12, v13, v15}, Ls91;->p(JLum0;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Ls70;->e:Ly41;

    .line 20
    .line 21
    invoke-interface {v2}, Ll30;->getLayoutDirection()Lk50;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, v0, Lyn0;->b:Ljn0;

    .line 26
    .line 27
    sget-object v5, Lk50;->d:Lk50;

    .line 28
    .line 29
    if-ne v3, v5, :cond_0

    .line 30
    .line 31
    invoke-interface {v4, v3}, Ljn0;->a(Lk50;)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {v4, v3}, Ljn0;->b(Lk50;)F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    :goto_0
    invoke-interface {v2, v3}, Lym;->F(F)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-interface {v2}, Ll30;->getLayoutDirection()Lk50;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    if-ne v6, v5, :cond_1

    .line 49
    .line 50
    invoke-interface {v4, v6}, Ljn0;->b(Lk50;)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {v4, v6}, Ljn0;->a(Lk50;)F

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    :goto_1
    invoke-interface {v2, v6}, Lym;->F(F)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-interface {v4}, Ljn0;->d()F

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    invoke-interface {v2, v7}, Lym;->F(F)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-interface {v4}, Ljn0;->c()F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-interface {v2, v4}, Lym;->F(F)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    add-int/2addr v4, v7

    .line 80
    add-int/2addr v6, v3

    .line 81
    sub-int v8, v6, v3

    .line 82
    .line 83
    neg-int v9, v6

    .line 84
    neg-int v10, v4

    .line 85
    invoke-static {v12, v13, v9, v10}, Lqj;->h(JII)J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    iput-object v1, v14, Llo0;->q:Lym;

    .line 90
    .line 91
    const/4 v11, 0x0

    .line 92
    invoke-interface {v2, v11}, Lym;->F(F)I

    .line 93
    .line 94
    .line 95
    move-result v16

    .line 96
    invoke-static {v12, v13}, Lpj;->h(J)I

    .line 97
    .line 98
    .line 99
    move-result v17

    .line 100
    move-object/from16 v18, v15

    .line 101
    .line 102
    sub-int v15, v17, v6

    .line 103
    .line 104
    int-to-long v11, v3

    .line 105
    const/16 v17, 0x20

    .line 106
    .line 107
    shl-long v11, v11, v17

    .line 108
    .line 109
    move-object/from16 v17, v14

    .line 110
    .line 111
    int-to-long v13, v7

    .line 112
    const-wide v20, 0xffffffffL

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    and-long v13, v13, v20

    .line 118
    .line 119
    or-long/2addr v11, v13

    .line 120
    iget-object v7, v0, Lyn0;->c:Ln2;

    .line 121
    .line 122
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    if-gez v15, :cond_2

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move v1, v15

    .line 130
    :goto_2
    invoke-static {v9, v10}, Lpj;->g(J)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    const/4 v14, 0x5

    .line 135
    move/from16 v21, v4

    .line 136
    .line 137
    move-object/from16 v20, v5

    .line 138
    .line 139
    invoke-static {v1, v7, v14}, Lqj;->b(III)J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    move-object/from16 v7, v17

    .line 144
    .line 145
    iput-wide v4, v7, Llo0;->A:J

    .line 146
    .line 147
    iget-object v4, v0, Lyn0;->d:Lhw;

    .line 148
    .line 149
    invoke-interface {v4}, Lhw;->invoke()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, Lxn0;

    .line 154
    .line 155
    add-int v5, v15, v3

    .line 156
    .line 157
    add-int/2addr v5, v8

    .line 158
    iget-object v13, v0, Lyn0;->g:Ln2;

    .line 159
    .line 160
    invoke-static {}, Lu50;->k()Ll21;

    .line 161
    .line 162
    .line 163
    move-result-object v14

    .line 164
    move-wide/from16 v23, v11

    .line 165
    .line 166
    if-eqz v14, :cond_3

    .line 167
    .line 168
    invoke-virtual {v14}, Ll21;->e()Lsw;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    goto :goto_3

    .line 173
    :cond_3
    const/4 v11, 0x0

    .line 174
    :goto_3
    invoke-static {v14}, Lu50;->s(Ll21;)Ll21;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    move/from16 v26, v6

    .line 179
    .line 180
    :try_start_0
    iget-object v6, v7, Llo0;->d:Lco0;

    .line 181
    .line 182
    move-wide/from16 v27, v9

    .line 183
    .line 184
    iget-object v9, v6, Lco0;->b:Ldp0;

    .line 185
    .line 186
    invoke-virtual {v9}, Ldp0;->g()I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    iget-object v10, v6, Lco0;->e:Ljava/lang/Object;

    .line 191
    .line 192
    invoke-static {v9, v4, v10}, Lg60;->k(ILo70;Ljava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eq v9, v10, :cond_4

    .line 197
    .line 198
    move/from16 v29, v15

    .line 199
    .line 200
    iget-object v15, v6, Lco0;->b:Ldp0;

    .line 201
    .line 202
    invoke-virtual {v15, v10}, Ldp0;->h(I)V

    .line 203
    .line 204
    .line 205
    iget-object v15, v6, Lco0;->f:Lt70;

    .line 206
    .line 207
    invoke-virtual {v15, v9}, Lt70;->a(I)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_4
    move/from16 v29, v15

    .line 212
    .line 213
    :goto_4
    iget-object v6, v6, Lco0;->b:Ldp0;

    .line 214
    .line 215
    invoke-virtual {v6}, Ldp0;->g()I

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7}, Llo0;->l()F

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    invoke-virtual {v7}, Lkm;->n()I

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v5, v1, v3, v8}, Ln2;->i(IIII)I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    int-to-float v9, v9

    .line 230
    add-int v13, v1, v16

    .line 231
    .line 232
    int-to-float v15, v13

    .line 233
    mul-float/2addr v6, v15

    .line 234
    sub-float/2addr v9, v6

    .line 235
    invoke-static {v9}, Lrd0;->Q(F)I

    .line 236
    .line 237
    .line 238
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 239
    invoke-static {v14, v12, v11}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 240
    .line 241
    .line 242
    iget-object v9, v7, Llo0;->B:La80;

    .line 243
    .line 244
    iget-object v11, v7, Llo0;->w:Leb;

    .line 245
    .line 246
    invoke-static {v4, v9, v11}, Lj50;->i(Lo70;La80;Leb;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    sget-object v9, Lv20;->a:Lug0;

    .line 251
    .line 252
    new-instance v11, Lug0;

    .line 253
    .line 254
    invoke-direct {v11}, Lug0;-><init>()V

    .line 255
    .line 256
    .line 257
    iget-object v9, v0, Lyn0;->e:Lhw;

    .line 258
    .line 259
    invoke-interface {v9}, Lhw;->invoke()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    check-cast v9, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    iget-object v15, v7, Llo0;->C:Loh0;

    .line 270
    .line 271
    if-ltz v3, :cond_5

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_5
    const-string v9, "negative beforeContentPadding"

    .line 275
    .line 276
    invoke-static {v9}, Lz10;->a(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :goto_5
    if-ltz v8, :cond_6

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_6
    const-string v9, "negative afterContentPadding"

    .line 283
    .line 284
    invoke-static {v9}, Lz10;->a(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :goto_6
    if-gez v13, :cond_7

    .line 288
    .line 289
    const/4 v9, 0x0

    .line 290
    goto :goto_7

    .line 291
    :cond_7
    move v9, v13

    .line 292
    :goto_7
    move/from16 v30, v6

    .line 293
    .line 294
    if-gez v14, :cond_8

    .line 295
    .line 296
    move v6, v14

    .line 297
    :goto_8
    move-object/from16 v31, v4

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_8
    const/4 v6, 0x0

    .line 301
    goto :goto_8

    .line 302
    :goto_9
    invoke-static/range {v27 .. v28}, Lpj;->g(J)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    move/from16 v32, v5

    .line 307
    .line 308
    const/4 v5, 0x5

    .line 309
    invoke-static {v1, v4, v5}, Lqj;->b(III)J

    .line 310
    .line 311
    .line 312
    move-result-wide v4

    .line 313
    move/from16 v22, v13

    .line 314
    .line 315
    sget-object v13, Lis;->d:Lis;

    .line 316
    .line 317
    move-object/from16 v33, v15

    .line 318
    .line 319
    move-object/from16 v34, v7

    .line 320
    .line 321
    iget-object v7, v0, Lyn0;->g:Ln2;

    .line 322
    .line 323
    move/from16 v35, v9

    .line 324
    .line 325
    iget-object v9, v0, Lyn0;->h:Lyk;

    .line 326
    .line 327
    if-gtz v14, :cond_9

    .line 328
    .line 329
    move-wide v11, v4

    .line 330
    neg-int v4, v3

    .line 331
    add-int v5, v29, v8

    .line 332
    .line 333
    invoke-static/range {v27 .. v28}, Lpj;->j(J)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    invoke-static/range {v27 .. v28}, Lpj;->i(J)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    new-instance v10, Lpn;

    .line 342
    .line 343
    const/16 v14, 0x19

    .line 344
    .line 345
    invoke-direct {v10, v14}, Lpn;-><init>(I)V

    .line 346
    .line 347
    .line 348
    add-int v0, v0, v26

    .line 349
    .line 350
    move v14, v4

    .line 351
    move/from16 p0, v5

    .line 352
    .line 353
    move-wide/from16 v4, p2

    .line 354
    .line 355
    invoke-static {v0, v4, v5}, Lqj;->f(IJ)I

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    add-int v3, v3, v21

    .line 360
    .line 361
    invoke-static {v3, v4, v5}, Lqj;->e(IJ)I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    invoke-interface {v2, v0, v3, v13, v10}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    move v3, v8

    .line 370
    move-object v8, v0

    .line 371
    new-instance v0, Lzn0;

    .line 372
    .line 373
    move/from16 v5, p0

    .line 374
    .line 375
    move-object/from16 v10, p1

    .line 376
    .line 377
    move-object v13, v2

    .line 378
    move v4, v14

    .line 379
    move/from16 v2, v16

    .line 380
    .line 381
    invoke-direct/range {v0 .. v12}, Lzn0;-><init>(IIIIIILn2;Lyd0;Lyk;Lym;J)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v1, p1

    .line 385
    .line 386
    move-object/from16 v29, v13

    .line 387
    .line 388
    move-object/from16 v52, v34

    .line 389
    .line 390
    const/16 v38, 0x1

    .line 391
    .line 392
    goto/16 :goto_40

    .line 393
    .line 394
    :cond_9
    move/from16 v19, v8

    .line 395
    .line 396
    move v8, v6

    .line 397
    move/from16 v6, v19

    .line 398
    .line 399
    move-wide/from16 v36, v4

    .line 400
    .line 401
    move-object/from16 v19, v9

    .line 402
    .line 403
    move-wide/from16 v4, p2

    .line 404
    .line 405
    move v9, v1

    .line 406
    move-object v1, v2

    .line 407
    move-object v2, v12

    .line 408
    move/from16 v12, v16

    .line 409
    .line 410
    const/16 v16, 0x0

    .line 411
    .line 412
    :goto_a
    if-lez v10, :cond_a

    .line 413
    .line 414
    if-lez v30, :cond_a

    .line 415
    .line 416
    add-int/lit8 v10, v10, -0x1

    .line 417
    .line 418
    sub-int v30, v30, v35

    .line 419
    .line 420
    goto :goto_a

    .line 421
    :cond_a
    mul-int/lit8 v30, v30, -0x1

    .line 422
    .line 423
    if-lt v10, v14, :cond_b

    .line 424
    .line 425
    add-int/lit8 v10, v14, -0x1

    .line 426
    .line 427
    const/16 v30, 0x0

    .line 428
    .line 429
    :cond_b
    const/16 v38, 0x1

    .line 430
    .line 431
    new-instance v15, Lx8;

    .line 432
    .line 433
    invoke-direct {v15}, Lx8;-><init>()V

    .line 434
    .line 435
    .line 436
    move-object/from16 v39, v13

    .line 437
    .line 438
    neg-int v13, v3

    .line 439
    if-gez v12, :cond_c

    .line 440
    .line 441
    move/from16 v40, v12

    .line 442
    .line 443
    :goto_b
    move/from16 v41, v13

    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_c
    const/16 v40, 0x0

    .line 447
    .line 448
    goto :goto_b

    .line 449
    :goto_c
    add-int v13, v41, v40

    .line 450
    .line 451
    add-int v30, v30, v13

    .line 452
    .line 453
    move/from16 v42, v8

    .line 454
    .line 455
    move/from16 v40, v14

    .line 456
    .line 457
    move/from16 v14, v30

    .line 458
    .line 459
    move/from16 v30, v12

    .line 460
    .line 461
    const/4 v12, 0x0

    .line 462
    :goto_d
    iget-object v8, v0, Lyn0;->f:Lga;

    .line 463
    .line 464
    if-gez v14, :cond_d

    .line 465
    .line 466
    if-lez v10, :cond_d

    .line 467
    .line 468
    add-int/lit8 v10, v10, -0x1

    .line 469
    .line 470
    move-object/from16 v43, v2

    .line 471
    .line 472
    move v2, v10

    .line 473
    move v10, v9

    .line 474
    invoke-interface {v1}, Ll30;->getLayoutDirection()Lk50;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    move/from16 v44, v3

    .line 479
    .line 480
    move-object/from16 v49, v7

    .line 481
    .line 482
    move-wide/from16 v45, v27

    .line 483
    .line 484
    move-object/from16 v5, v31

    .line 485
    .line 486
    move/from16 v47, v32

    .line 487
    .line 488
    move/from16 v0, v35

    .line 489
    .line 490
    move-wide/from16 v3, v36

    .line 491
    .line 492
    move/from16 v48, v42

    .line 493
    .line 494
    move-object/from16 v53, v1

    .line 495
    .line 496
    move-object/from16 v1, p1

    .line 497
    .line 498
    move-wide/from16 v54, v23

    .line 499
    .line 500
    move-object/from16 v23, v53

    .line 501
    .line 502
    move-object/from16 v24, v20

    .line 503
    .line 504
    move/from16 v20, v6

    .line 505
    .line 506
    move-wide/from16 v6, v54

    .line 507
    .line 508
    invoke-static/range {v1 .. v11}, Lz60;->w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    move-object v4, v5

    .line 513
    move-wide v5, v6

    .line 514
    move v9, v10

    .line 515
    const/4 v1, 0x0

    .line 516
    invoke-virtual {v15, v1, v8}, Lx8;->add(ILjava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    iget v1, v8, Lae0;->h:I

    .line 520
    .line 521
    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    .line 522
    .line 523
    .line 524
    move-result v12

    .line 525
    add-int/2addr v14, v0

    .line 526
    move v10, v2

    .line 527
    move-object/from16 v31, v4

    .line 528
    .line 529
    move-object/from16 v1, v23

    .line 530
    .line 531
    move-object/from16 v2, v43

    .line 532
    .line 533
    move/from16 v3, v44

    .line 534
    .line 535
    move-object/from16 v7, v49

    .line 536
    .line 537
    move-object/from16 v0, p0

    .line 538
    .line 539
    move-wide/from16 v53, v5

    .line 540
    .line 541
    move/from16 v6, v20

    .line 542
    .line 543
    move-wide/from16 v4, p2

    .line 544
    .line 545
    move-object/from16 v20, v24

    .line 546
    .line 547
    move-wide/from16 v23, v53

    .line 548
    .line 549
    goto :goto_d

    .line 550
    :cond_d
    move-object/from16 v0, v20

    .line 551
    .line 552
    move/from16 v20, v6

    .line 553
    .line 554
    move-wide/from16 v5, v23

    .line 555
    .line 556
    move-object/from16 v24, v0

    .line 557
    .line 558
    move-object/from16 v23, v1

    .line 559
    .line 560
    move-object/from16 v43, v2

    .line 561
    .line 562
    move/from16 v44, v3

    .line 563
    .line 564
    move-object/from16 v49, v7

    .line 565
    .line 566
    move-object v7, v8

    .line 567
    move-wide/from16 v45, v27

    .line 568
    .line 569
    move-object/from16 v4, v31

    .line 570
    .line 571
    move/from16 v47, v32

    .line 572
    .line 573
    move/from16 v0, v35

    .line 574
    .line 575
    move/from16 v48, v42

    .line 576
    .line 577
    if-ge v14, v13, :cond_e

    .line 578
    .line 579
    move v14, v13

    .line 580
    :cond_e
    sub-int/2addr v14, v13

    .line 581
    add-int v27, v29, v20

    .line 582
    .line 583
    if-gez v27, :cond_f

    .line 584
    .line 585
    const/4 v1, 0x0

    .line 586
    goto :goto_e

    .line 587
    :cond_f
    move/from16 v1, v27

    .line 588
    .line 589
    :goto_e
    neg-int v2, v14

    .line 590
    move/from16 v35, v0

    .line 591
    .line 592
    move/from16 v28, v10

    .line 593
    .line 594
    const/4 v3, 0x0

    .line 595
    const/4 v8, 0x0

    .line 596
    :goto_f
    iget v0, v15, Lx8;->f:I

    .line 597
    .line 598
    if-ge v3, v0, :cond_11

    .line 599
    .line 600
    if-lt v2, v1, :cond_10

    .line 601
    .line 602
    invoke-virtual {v15, v3}, Lx8;->b(I)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move/from16 v8, v38

    .line 606
    .line 607
    goto :goto_f

    .line 608
    :cond_10
    add-int/lit8 v28, v28, 0x1

    .line 609
    .line 610
    add-int v2, v2, v35

    .line 611
    .line 612
    add-int/lit8 v3, v3, 0x1

    .line 613
    .line 614
    goto :goto_f

    .line 615
    :cond_11
    move v0, v12

    .line 616
    move/from16 v31, v16

    .line 617
    .line 618
    move v12, v2

    .line 619
    move/from16 v16, v8

    .line 620
    .line 621
    move/from16 v2, v28

    .line 622
    .line 623
    move/from16 v28, v14

    .line 624
    .line 625
    move v14, v10

    .line 626
    :goto_10
    move/from16 v3, v40

    .line 627
    .line 628
    if-ge v2, v3, :cond_16

    .line 629
    .line 630
    if-lt v12, v1, :cond_13

    .line 631
    .line 632
    if-lez v12, :cond_13

    .line 633
    .line 634
    invoke-virtual {v15}, Lx8;->isEmpty()Z

    .line 635
    .line 636
    .line 637
    move-result v8

    .line 638
    if-eqz v8, :cond_12

    .line 639
    .line 640
    goto :goto_11

    .line 641
    :cond_12
    move/from16 v40, v3

    .line 642
    .line 643
    move-object v10, v11

    .line 644
    move/from16 p0, v14

    .line 645
    .line 646
    move/from16 v13, v29

    .line 647
    .line 648
    move/from16 v14, v35

    .line 649
    .line 650
    move v11, v0

    .line 651
    move v0, v2

    .line 652
    move-wide/from16 v2, v36

    .line 653
    .line 654
    goto/16 :goto_14

    .line 655
    .line 656
    :cond_13
    :goto_11
    invoke-interface/range {v23 .. v23}, Ll30;->getLayoutDirection()Lk50;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    move/from16 v32, v1

    .line 661
    .line 662
    move v1, v2

    .line 663
    move/from16 v40, v3

    .line 664
    .line 665
    move-object v10, v11

    .line 666
    move/from16 p0, v14

    .line 667
    .line 668
    move/from16 v14, v35

    .line 669
    .line 670
    move-wide/from16 v2, v36

    .line 671
    .line 672
    move v11, v0

    .line 673
    move-object/from16 v0, p1

    .line 674
    .line 675
    invoke-static/range {v0 .. v10}, Lz60;->w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;

    .line 676
    .line 677
    .line 678
    move-result-object v8

    .line 679
    move v0, v1

    .line 680
    add-int/lit8 v1, v40, -0x1

    .line 681
    .line 682
    if-ne v0, v1, :cond_14

    .line 683
    .line 684
    move/from16 v35, v9

    .line 685
    .line 686
    goto :goto_12

    .line 687
    :cond_14
    move/from16 v35, v14

    .line 688
    .line 689
    :goto_12
    add-int v12, v12, v35

    .line 690
    .line 691
    if-gt v12, v13, :cond_15

    .line 692
    .line 693
    if-eq v0, v1, :cond_15

    .line 694
    .line 695
    add-int/lit8 v1, v0, 0x1

    .line 696
    .line 697
    sub-int v28, v28, v14

    .line 698
    .line 699
    move v8, v1

    .line 700
    move v1, v11

    .line 701
    move/from16 v16, v38

    .line 702
    .line 703
    goto :goto_13

    .line 704
    :cond_15
    iget v1, v8, Lae0;->h:I

    .line 705
    .line 706
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    invoke-virtual {v15, v8}, Lx8;->addLast(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    move/from16 v8, p0

    .line 714
    .line 715
    :goto_13
    add-int/lit8 v0, v0, 0x1

    .line 716
    .line 717
    move-wide/from16 v36, v2

    .line 718
    .line 719
    move-object v11, v10

    .line 720
    move/from16 v35, v14

    .line 721
    .line 722
    move v2, v0

    .line 723
    move v0, v1

    .line 724
    move v14, v8

    .line 725
    move/from16 v1, v32

    .line 726
    .line 727
    goto :goto_10

    .line 728
    :cond_16
    move/from16 v40, v3

    .line 729
    .line 730
    move-object v10, v11

    .line 731
    move/from16 p0, v14

    .line 732
    .line 733
    move/from16 v14, v35

    .line 734
    .line 735
    move v11, v0

    .line 736
    move v0, v2

    .line 737
    move-wide/from16 v2, v36

    .line 738
    .line 739
    move/from16 v13, v29

    .line 740
    .line 741
    :goto_14
    if-ge v12, v13, :cond_19

    .line 742
    .line 743
    sub-int v1, v13, v12

    .line 744
    .line 745
    sub-int v28, v28, v1

    .line 746
    .line 747
    add-int/2addr v12, v1

    .line 748
    move/from16 v1, p0

    .line 749
    .line 750
    move/from16 v8, v28

    .line 751
    .line 752
    move/from16 v28, v12

    .line 753
    .line 754
    move/from16 v12, v44

    .line 755
    .line 756
    :goto_15
    if-ge v8, v12, :cond_17

    .line 757
    .line 758
    if-lez v1, :cond_17

    .line 759
    .line 760
    add-int/lit8 v1, v1, -0x1

    .line 761
    .line 762
    move/from16 v29, v8

    .line 763
    .line 764
    invoke-interface/range {v23 .. v23}, Ll30;->getLayoutDirection()Lk50;

    .line 765
    .line 766
    .line 767
    move-result-object v8

    .line 768
    move/from16 v50, v0

    .line 769
    .line 770
    move-object/from16 v0, p1

    .line 771
    .line 772
    invoke-static/range {v0 .. v10}, Lz60;->w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;

    .line 773
    .line 774
    .line 775
    move-result-object v8

    .line 776
    const/4 v0, 0x0

    .line 777
    invoke-virtual {v15, v0, v8}, Lx8;->add(ILjava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    iget v0, v8, Lae0;->h:I

    .line 781
    .line 782
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 783
    .line 784
    .line 785
    move-result v11

    .line 786
    add-int v8, v29, v14

    .line 787
    .line 788
    move/from16 v0, v50

    .line 789
    .line 790
    goto :goto_15

    .line 791
    :cond_17
    move/from16 v50, v0

    .line 792
    .line 793
    move/from16 v29, v8

    .line 794
    .line 795
    if-gez v29, :cond_18

    .line 796
    .line 797
    add-int v0, v28, v29

    .line 798
    .line 799
    const/4 v8, 0x0

    .line 800
    goto :goto_16

    .line 801
    :cond_18
    move/from16 v0, v28

    .line 802
    .line 803
    move/from16 v8, v29

    .line 804
    .line 805
    goto :goto_16

    .line 806
    :cond_19
    move/from16 v50, v0

    .line 807
    .line 808
    move v0, v12

    .line 809
    move/from16 v12, v44

    .line 810
    .line 811
    move/from16 v1, p0

    .line 812
    .line 813
    move/from16 v8, v28

    .line 814
    .line 815
    :goto_16
    if-ltz v8, :cond_1a

    .line 816
    .line 817
    :goto_17
    move/from16 p0, v11

    .line 818
    .line 819
    goto :goto_18

    .line 820
    :cond_1a
    const-string v28, "invalid currentFirstPageScrollOffset"

    .line 821
    .line 822
    invoke-static/range {v28 .. v28}, Lz10;->a(Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    goto :goto_17

    .line 826
    :goto_18
    neg-int v11, v8

    .line 827
    invoke-virtual {v15}, Lx8;->first()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v28

    .line 831
    check-cast v28, Lae0;

    .line 832
    .line 833
    if-gtz v12, :cond_1b

    .line 834
    .line 835
    if-gez v30, :cond_1c

    .line 836
    .line 837
    :cond_1b
    move/from16 v29, v0

    .line 838
    .line 839
    goto :goto_1a

    .line 840
    :cond_1c
    move/from16 v29, v0

    .line 841
    .line 842
    move-object/from16 v0, v28

    .line 843
    .line 844
    move/from16 v28, v1

    .line 845
    .line 846
    :goto_19
    move/from16 v32, v8

    .line 847
    .line 848
    move/from16 v8, v48

    .line 849
    .line 850
    goto :goto_1c

    .line 851
    :goto_1a
    invoke-virtual {v15}, Lx8;->a()I

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    move-object/from16 v32, v28

    .line 856
    .line 857
    move/from16 v28, v1

    .line 858
    .line 859
    const/4 v1, 0x0

    .line 860
    :goto_1b
    if-ge v1, v0, :cond_1d

    .line 861
    .line 862
    if-eqz v8, :cond_1d

    .line 863
    .line 864
    if-gt v14, v8, :cond_1d

    .line 865
    .line 866
    invoke-virtual {v15}, Lx8;->a()I

    .line 867
    .line 868
    .line 869
    move-result v35

    .line 870
    move/from16 v36, v0

    .line 871
    .line 872
    add-int/lit8 v0, v35, -0x1

    .line 873
    .line 874
    if-eq v1, v0, :cond_1d

    .line 875
    .line 876
    sub-int/2addr v8, v14

    .line 877
    add-int/lit8 v1, v1, 0x1

    .line 878
    .line 879
    invoke-virtual {v15, v1}, Lx8;->get(I)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    move-object/from16 v32, v0

    .line 884
    .line 885
    check-cast v32, Lae0;

    .line 886
    .line 887
    move/from16 v0, v36

    .line 888
    .line 889
    goto :goto_1b

    .line 890
    :cond_1d
    move-object/from16 v0, v32

    .line 891
    .line 892
    goto :goto_19

    .line 893
    :goto_1c
    sub-int v1, v28, v8

    .line 894
    .line 895
    move-object/from16 v35, v0

    .line 896
    .line 897
    const/4 v0, 0x0

    .line 898
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 899
    .line 900
    .line 901
    move-result v1

    .line 902
    add-int/lit8 v0, v28, -0x1

    .line 903
    .line 904
    if-gt v1, v0, :cond_1f

    .line 905
    .line 906
    const/16 v28, 0x0

    .line 907
    .line 908
    :goto_1d
    if-nez v28, :cond_1e

    .line 909
    .line 910
    new-instance v28, Ljava/util/ArrayList;

    .line 911
    .line 912
    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    .line 913
    .line 914
    .line 915
    :cond_1e
    move/from16 v48, v8

    .line 916
    .line 917
    move/from16 v36, v14

    .line 918
    .line 919
    move-object/from16 v14, v28

    .line 920
    .line 921
    invoke-interface/range {v23 .. v23}, Ll30;->getLayoutDirection()Lk50;

    .line 922
    .line 923
    .line 924
    move-result-object v8

    .line 925
    move/from16 v44, v12

    .line 926
    .line 927
    move-object/from16 v28, v15

    .line 928
    .line 929
    move/from16 v15, v29

    .line 930
    .line 931
    move/from16 v12, v48

    .line 932
    .line 933
    move/from16 v29, v11

    .line 934
    .line 935
    move-object/from16 v11, v35

    .line 936
    .line 937
    move/from16 v35, v13

    .line 938
    .line 939
    move v13, v1

    .line 940
    move v1, v0

    .line 941
    move-object/from16 v0, p1

    .line 942
    .line 943
    invoke-static/range {v0 .. v10}, Lz60;->w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;

    .line 944
    .line 945
    .line 946
    move-result-object v8

    .line 947
    invoke-interface {v14, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    if-eq v1, v13, :cond_20

    .line 951
    .line 952
    add-int/lit8 v0, v1, -0x1

    .line 953
    .line 954
    move v8, v12

    .line 955
    move v1, v13

    .line 956
    move/from16 v13, v35

    .line 957
    .line 958
    move/from16 v12, v44

    .line 959
    .line 960
    move-object/from16 v35, v11

    .line 961
    .line 962
    move/from16 v11, v29

    .line 963
    .line 964
    move/from16 v29, v15

    .line 965
    .line 966
    move-object/from16 v15, v28

    .line 967
    .line 968
    move-object/from16 v28, v14

    .line 969
    .line 970
    move/from16 v14, v36

    .line 971
    .line 972
    goto :goto_1d

    .line 973
    :cond_1f
    move/from16 v44, v12

    .line 974
    .line 975
    move/from16 v36, v14

    .line 976
    .line 977
    move-object/from16 v28, v15

    .line 978
    .line 979
    move/from16 v15, v29

    .line 980
    .line 981
    move v12, v8

    .line 982
    move/from16 v29, v11

    .line 983
    .line 984
    move-object/from16 v11, v35

    .line 985
    .line 986
    move/from16 v35, v13

    .line 987
    .line 988
    move v13, v1

    .line 989
    const/4 v14, 0x0

    .line 990
    :cond_20
    invoke-interface/range {v43 .. v43}, Ljava/util/Collection;->size()I

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    const/4 v1, 0x0

    .line 995
    :goto_1e
    if-ge v1, v0, :cond_23

    .line 996
    .line 997
    move-object/from16 v8, v43

    .line 998
    .line 999
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v37

    .line 1003
    check-cast v37, Ljava/lang/Number;

    .line 1004
    .line 1005
    move/from16 v42, v0

    .line 1006
    .line 1007
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Number;->intValue()I

    .line 1008
    .line 1009
    .line 1010
    move-result v0

    .line 1011
    if-ge v0, v13, :cond_22

    .line 1012
    .line 1013
    if-nez v14, :cond_21

    .line 1014
    .line 1015
    new-instance v14, Ljava/util/ArrayList;

    .line 1016
    .line 1017
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1018
    .line 1019
    .line 1020
    :cond_21
    move-object/from16 v43, v8

    .line 1021
    .line 1022
    invoke-interface/range {v23 .. v23}, Ll30;->getLayoutDirection()Lk50;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v8

    .line 1026
    move-object/from16 v37, v43

    .line 1027
    .line 1028
    move/from16 v43, v1

    .line 1029
    .line 1030
    move v1, v0

    .line 1031
    move-object/from16 v0, p1

    .line 1032
    .line 1033
    invoke-static/range {v0 .. v10}, Lz60;->w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    invoke-interface {v14, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    goto :goto_1f

    .line 1041
    :cond_22
    move/from16 v43, v1

    .line 1042
    .line 1043
    move-object/from16 v37, v8

    .line 1044
    .line 1045
    :goto_1f
    add-int/lit8 v1, v43, 0x1

    .line 1046
    .line 1047
    move-object/from16 v43, v37

    .line 1048
    .line 1049
    move/from16 v0, v42

    .line 1050
    .line 1051
    goto :goto_1e

    .line 1052
    :cond_23
    move-object/from16 v37, v43

    .line 1053
    .line 1054
    sget-object v13, Lhs;->d:Lhs;

    .line 1055
    .line 1056
    if-nez v14, :cond_24

    .line 1057
    .line 1058
    move-object v14, v13

    .line 1059
    :cond_24
    invoke-interface {v14}, Ljava/util/Collection;->size()I

    .line 1060
    .line 1061
    .line 1062
    move-result v0

    .line 1063
    move/from16 v1, p0

    .line 1064
    .line 1065
    const/4 v8, 0x0

    .line 1066
    :goto_20
    if-ge v8, v0, :cond_25

    .line 1067
    .line 1068
    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v42

    .line 1072
    move/from16 p0, v0

    .line 1073
    .line 1074
    move-object/from16 v0, v42

    .line 1075
    .line 1076
    check-cast v0, Lae0;

    .line 1077
    .line 1078
    iget v0, v0, Lae0;->h:I

    .line 1079
    .line 1080
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 1081
    .line 1082
    .line 1083
    move-result v1

    .line 1084
    add-int/lit8 v8, v8, 0x1

    .line 1085
    .line 1086
    move/from16 v0, p0

    .line 1087
    .line 1088
    goto :goto_20

    .line 1089
    :cond_25
    invoke-virtual/range {v28 .. v28}, Lx8;->last()Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    check-cast v0, Lae0;

    .line 1094
    .line 1095
    iget v0, v0, Lae0;->a:I

    .line 1096
    .line 1097
    sub-int v8, v40, v0

    .line 1098
    .line 1099
    add-int/lit8 v8, v8, -0x1

    .line 1100
    .line 1101
    invoke-static {v12, v8}, Ljava/lang/Math;->min(II)I

    .line 1102
    .line 1103
    .line 1104
    move-result v8

    .line 1105
    add-int/2addr v8, v0

    .line 1106
    add-int/lit8 v0, v0, 0x1

    .line 1107
    .line 1108
    if-gt v0, v8, :cond_27

    .line 1109
    .line 1110
    const/16 v42, 0x0

    .line 1111
    .line 1112
    :goto_21
    if-nez v42, :cond_26

    .line 1113
    .line 1114
    new-instance v42, Ljava/util/ArrayList;

    .line 1115
    .line 1116
    invoke-direct/range {v42 .. v42}, Ljava/util/ArrayList;-><init>()V

    .line 1117
    .line 1118
    .line 1119
    :cond_26
    move/from16 v48, v12

    .line 1120
    .line 1121
    move-object/from16 v12, v42

    .line 1122
    .line 1123
    move/from16 v42, v8

    .line 1124
    .line 1125
    invoke-interface/range {v23 .. v23}, Ll30;->getLayoutDirection()Lk50;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v8

    .line 1129
    move-object/from16 p0, v13

    .line 1130
    .line 1131
    move/from16 v13, v42

    .line 1132
    .line 1133
    move/from16 v42, v1

    .line 1134
    .line 1135
    move v1, v0

    .line 1136
    move-object/from16 v0, p1

    .line 1137
    .line 1138
    invoke-static/range {v0 .. v10}, Lz60;->w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v8

    .line 1142
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1143
    .line 1144
    .line 1145
    if-eq v1, v13, :cond_28

    .line 1146
    .line 1147
    add-int/lit8 v0, v1, 0x1

    .line 1148
    .line 1149
    move v8, v13

    .line 1150
    move/from16 v1, v42

    .line 1151
    .line 1152
    move-object/from16 v13, p0

    .line 1153
    .line 1154
    move-object/from16 v42, v12

    .line 1155
    .line 1156
    move/from16 v12, v48

    .line 1157
    .line 1158
    goto :goto_21

    .line 1159
    :cond_27
    move/from16 v42, v1

    .line 1160
    .line 1161
    move/from16 v48, v12

    .line 1162
    .line 1163
    move-object/from16 p0, v13

    .line 1164
    .line 1165
    move v13, v8

    .line 1166
    const/4 v12, 0x0

    .line 1167
    :cond_28
    invoke-interface/range {v37 .. v37}, Ljava/util/Collection;->size()I

    .line 1168
    .line 1169
    .line 1170
    move-result v0

    .line 1171
    const/4 v1, 0x0

    .line 1172
    :goto_22
    if-ge v1, v0, :cond_2c

    .line 1173
    .line 1174
    move-object/from16 v8, v37

    .line 1175
    .line 1176
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v37

    .line 1180
    check-cast v37, Ljava/lang/Number;

    .line 1181
    .line 1182
    move/from16 v43, v0

    .line 1183
    .line 1184
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Number;->intValue()I

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    move/from16 v37, v1

    .line 1189
    .line 1190
    add-int/lit8 v1, v13, 0x1

    .line 1191
    .line 1192
    if-gt v1, v0, :cond_2b

    .line 1193
    .line 1194
    move/from16 v1, v40

    .line 1195
    .line 1196
    if-ge v0, v1, :cond_2a

    .line 1197
    .line 1198
    if-nez v12, :cond_29

    .line 1199
    .line 1200
    new-instance v12, Ljava/util/ArrayList;

    .line 1201
    .line 1202
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1203
    .line 1204
    .line 1205
    :cond_29
    move-object/from16 v40, v8

    .line 1206
    .line 1207
    invoke-interface/range {v23 .. v23}, Ll30;->getLayoutDirection()Lk50;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v8

    .line 1211
    move/from16 v51, v43

    .line 1212
    .line 1213
    move-object/from16 v43, v40

    .line 1214
    .line 1215
    move/from16 v40, v51

    .line 1216
    .line 1217
    move/from16 v51, v37

    .line 1218
    .line 1219
    move/from16 v37, v13

    .line 1220
    .line 1221
    move v13, v1

    .line 1222
    move v1, v0

    .line 1223
    move-object/from16 v0, p1

    .line 1224
    .line 1225
    invoke-static/range {v0 .. v10}, Lz60;->w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v1

    .line 1229
    move-object v8, v7

    .line 1230
    move/from16 v7, v21

    .line 1231
    .line 1232
    move/from16 v0, v22

    .line 1233
    .line 1234
    move-wide/from16 v21, v2

    .line 1235
    .line 1236
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    goto :goto_24

    .line 1240
    :cond_2a
    move/from16 v51, v37

    .line 1241
    .line 1242
    move/from16 v37, v13

    .line 1243
    .line 1244
    move v13, v1

    .line 1245
    :goto_23
    move/from16 v0, v22

    .line 1246
    .line 1247
    move/from16 v40, v43

    .line 1248
    .line 1249
    move-object/from16 v43, v8

    .line 1250
    .line 1251
    move-object v8, v7

    .line 1252
    move/from16 v7, v21

    .line 1253
    .line 1254
    move-wide/from16 v21, v2

    .line 1255
    .line 1256
    goto :goto_24

    .line 1257
    :cond_2b
    move/from16 v51, v37

    .line 1258
    .line 1259
    move/from16 v37, v13

    .line 1260
    .line 1261
    move/from16 v13, v40

    .line 1262
    .line 1263
    goto :goto_23

    .line 1264
    :goto_24
    add-int/lit8 v1, v51, 0x1

    .line 1265
    .line 1266
    move-wide/from16 v2, v21

    .line 1267
    .line 1268
    move/from16 v22, v0

    .line 1269
    .line 1270
    move/from16 v21, v7

    .line 1271
    .line 1272
    move-object v7, v8

    .line 1273
    move/from16 v0, v40

    .line 1274
    .line 1275
    move/from16 v40, v13

    .line 1276
    .line 1277
    move/from16 v13, v37

    .line 1278
    .line 1279
    move-object/from16 v37, v43

    .line 1280
    .line 1281
    goto :goto_22

    .line 1282
    :cond_2c
    move/from16 v7, v21

    .line 1283
    .line 1284
    move/from16 v0, v22

    .line 1285
    .line 1286
    move/from16 v13, v40

    .line 1287
    .line 1288
    move-wide/from16 v21, v2

    .line 1289
    .line 1290
    if-nez v12, :cond_2d

    .line 1291
    .line 1292
    move-object/from16 v12, p0

    .line 1293
    .line 1294
    :cond_2d
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1295
    .line 1296
    .line 1297
    move-result v1

    .line 1298
    move/from16 v2, v42

    .line 1299
    .line 1300
    const/4 v3, 0x0

    .line 1301
    :goto_25
    if-ge v3, v1, :cond_2e

    .line 1302
    .line 1303
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v4

    .line 1307
    check-cast v4, Lae0;

    .line 1308
    .line 1309
    iget v4, v4, Lae0;->h:I

    .line 1310
    .line 1311
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 1312
    .line 1313
    .line 1314
    move-result v2

    .line 1315
    add-int/lit8 v3, v3, 0x1

    .line 1316
    .line 1317
    goto :goto_25

    .line 1318
    :cond_2e
    invoke-virtual/range {v28 .. v28}, Lx8;->first()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    invoke-static {v11, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v1

    .line 1326
    if-eqz v1, :cond_2f

    .line 1327
    .line 1328
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 1329
    .line 1330
    .line 1331
    move-result v1

    .line 1332
    if-eqz v1, :cond_2f

    .line 1333
    .line 1334
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1335
    .line 1336
    .line 1337
    move-result v1

    .line 1338
    if-eqz v1, :cond_2f

    .line 1339
    .line 1340
    move/from16 v6, v38

    .line 1341
    .line 1342
    :goto_26
    move-wide/from16 v3, v45

    .line 1343
    .line 1344
    goto :goto_27

    .line 1345
    :cond_2f
    const/4 v6, 0x0

    .line 1346
    goto :goto_26

    .line 1347
    :goto_27
    invoke-static {v15, v3, v4}, Lqj;->f(IJ)I

    .line 1348
    .line 1349
    .line 1350
    move-result v1

    .line 1351
    invoke-static {v2, v3, v4}, Lqj;->e(IJ)I

    .line 1352
    .line 1353
    .line 1354
    move-result v8

    .line 1355
    move/from16 v10, v35

    .line 1356
    .line 1357
    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    .line 1358
    .line 1359
    .line 1360
    move-result v2

    .line 1361
    if-ge v15, v2, :cond_30

    .line 1362
    .line 1363
    move/from16 v2, v38

    .line 1364
    .line 1365
    goto :goto_28

    .line 1366
    :cond_30
    const/4 v2, 0x0

    .line 1367
    :goto_28
    if-eqz v2, :cond_32

    .line 1368
    .line 1369
    if-nez v29, :cond_31

    .line 1370
    .line 1371
    goto :goto_29

    .line 1372
    :cond_31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1373
    .line 1374
    const-string v4, "non-zero pagesScrollOffset="

    .line 1375
    .line 1376
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1377
    .line 1378
    .line 1379
    move/from16 v4, v29

    .line 1380
    .line 1381
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v3

    .line 1388
    invoke-static {v3}, Lz10;->c(Ljava/lang/String;)V

    .line 1389
    .line 1390
    .line 1391
    goto :goto_2a

    .line 1392
    :cond_32
    :goto_29
    move/from16 v4, v29

    .line 1393
    .line 1394
    :goto_2a
    new-instance v3, Ljava/util/ArrayList;

    .line 1395
    .line 1396
    invoke-virtual/range {v28 .. v28}, Lx8;->a()I

    .line 1397
    .line 1398
    .line 1399
    move-result v5

    .line 1400
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1401
    .line 1402
    .line 1403
    move-result v29

    .line 1404
    add-int v29, v29, v5

    .line 1405
    .line 1406
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1407
    .line 1408
    .line 1409
    move-result v5

    .line 1410
    add-int v5, v5, v29

    .line 1411
    .line 1412
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1413
    .line 1414
    .line 1415
    if-eqz v2, :cond_37

    .line 1416
    .line 1417
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    if-eqz v0, :cond_33

    .line 1422
    .line 1423
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1424
    .line 1425
    .line 1426
    move-result v0

    .line 1427
    if-eqz v0, :cond_33

    .line 1428
    .line 1429
    goto :goto_2b

    .line 1430
    :cond_33
    const-string v0, "No extra pages"

    .line 1431
    .line 1432
    invoke-static {v0}, Lz10;->a(Ljava/lang/String;)V

    .line 1433
    .line 1434
    .line 1435
    :goto_2b
    invoke-virtual/range {v28 .. v28}, Lx8;->a()I

    .line 1436
    .line 1437
    .line 1438
    move-result v0

    .line 1439
    move-object v2, v3

    .line 1440
    new-array v3, v0, [I

    .line 1441
    .line 1442
    const/4 v4, 0x0

    .line 1443
    :goto_2c
    if-ge v4, v0, :cond_34

    .line 1444
    .line 1445
    aput v9, v3, v4

    .line 1446
    .line 1447
    add-int/lit8 v4, v4, 0x1

    .line 1448
    .line 1449
    goto :goto_2c

    .line 1450
    :cond_34
    new-array v5, v0, [I

    .line 1451
    .line 1452
    move-object/from16 v0, v23

    .line 1453
    .line 1454
    move/from16 v4, v30

    .line 1455
    .line 1456
    move/from16 v23, v1

    .line 1457
    .line 1458
    invoke-interface {v0, v4}, Lym;->f0(I)F

    .line 1459
    .line 1460
    .line 1461
    move-result v1

    .line 1462
    move-object/from16 v29, v0

    .line 1463
    .line 1464
    new-instance v0, Lv8;

    .line 1465
    .line 1466
    move-object/from16 v17, v2

    .line 1467
    .line 1468
    move/from16 v30, v6

    .line 1469
    .line 1470
    const/4 v2, 0x0

    .line 1471
    const/4 v6, 0x0

    .line 1472
    invoke-direct {v0, v1, v2, v6}, Lv8;-><init>(FZLs8;)V

    .line 1473
    .line 1474
    .line 1475
    move-object/from16 v1, v24

    .line 1476
    .line 1477
    move/from16 v24, v4

    .line 1478
    .line 1479
    move-object v4, v1

    .line 1480
    move-object/from16 v1, p1

    .line 1481
    .line 1482
    move-object/from16 v6, v17

    .line 1483
    .line 1484
    move/from16 v2, v23

    .line 1485
    .line 1486
    move/from16 v23, v7

    .line 1487
    .line 1488
    move-object/from16 v7, v29

    .line 1489
    .line 1490
    invoke-virtual/range {v0 .. v5}, Lv8;->b(Lzd0;I[ILk50;[I)V

    .line 1491
    .line 1492
    .line 1493
    invoke-static {v5}, Lf9;->i0([I)Lz20;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    iget v0, v0, Lx20;->e:I

    .line 1498
    .line 1499
    if-gez v0, :cond_35

    .line 1500
    .line 1501
    move-object/from16 v1, v28

    .line 1502
    .line 1503
    goto/16 :goto_31

    .line 1504
    .line 1505
    :cond_35
    const/4 v1, 0x0

    .line 1506
    :goto_2d
    aget v3, v5, v1

    .line 1507
    .line 1508
    move-object/from16 v4, v28

    .line 1509
    .line 1510
    invoke-virtual {v4, v1}, Lx8;->get(I)Ljava/lang/Object;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v28

    .line 1514
    move-object/from16 v29, v4

    .line 1515
    .line 1516
    move-object/from16 v4, v28

    .line 1517
    .line 1518
    check-cast v4, Lae0;

    .line 1519
    .line 1520
    invoke-virtual {v4, v3, v2, v8}, Lae0;->b(III)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1524
    .line 1525
    .line 1526
    if-eq v1, v0, :cond_36

    .line 1527
    .line 1528
    add-int/lit8 v1, v1, 0x1

    .line 1529
    .line 1530
    move-object/from16 v28, v29

    .line 1531
    .line 1532
    goto :goto_2d

    .line 1533
    :cond_36
    move-object/from16 v1, v29

    .line 1534
    .line 1535
    goto/16 :goto_31

    .line 1536
    .line 1537
    :cond_37
    move-object/from16 v2, v23

    .line 1538
    .line 1539
    move/from16 v23, v7

    .line 1540
    .line 1541
    move-object v7, v2

    .line 1542
    move v2, v1

    .line 1543
    move-object/from16 v1, v28

    .line 1544
    .line 1545
    move/from16 v24, v30

    .line 1546
    .line 1547
    move/from16 v30, v6

    .line 1548
    .line 1549
    move-object v6, v3

    .line 1550
    invoke-interface {v14}, Ljava/util/Collection;->size()I

    .line 1551
    .line 1552
    .line 1553
    move-result v3

    .line 1554
    move/from16 v28, v4

    .line 1555
    .line 1556
    const/4 v5, 0x0

    .line 1557
    :goto_2e
    if-ge v5, v3, :cond_38

    .line 1558
    .line 1559
    invoke-interface {v14, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v29

    .line 1563
    move/from16 v35, v0

    .line 1564
    .line 1565
    move-object/from16 v0, v29

    .line 1566
    .line 1567
    check-cast v0, Lae0;

    .line 1568
    .line 1569
    move/from16 v29, v3

    .line 1570
    .line 1571
    sub-int v3, v28, v35

    .line 1572
    .line 1573
    invoke-virtual {v0, v3, v2, v8}, Lae0;->b(III)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1577
    .line 1578
    .line 1579
    add-int/lit8 v5, v5, 0x1

    .line 1580
    .line 1581
    move/from16 v28, v3

    .line 1582
    .line 1583
    move/from16 v3, v29

    .line 1584
    .line 1585
    move/from16 v0, v35

    .line 1586
    .line 1587
    goto :goto_2e

    .line 1588
    :cond_38
    move/from16 v35, v0

    .line 1589
    .line 1590
    invoke-virtual {v1}, Lx8;->a()I

    .line 1591
    .line 1592
    .line 1593
    move-result v0

    .line 1594
    const/4 v3, 0x0

    .line 1595
    :goto_2f
    if-ge v3, v0, :cond_39

    .line 1596
    .line 1597
    invoke-virtual {v1, v3}, Lx8;->get(I)Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v5

    .line 1601
    check-cast v5, Lae0;

    .line 1602
    .line 1603
    invoke-virtual {v5, v4, v2, v8}, Lae0;->b(III)V

    .line 1604
    .line 1605
    .line 1606
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1607
    .line 1608
    .line 1609
    add-int v4, v4, v35

    .line 1610
    .line 1611
    add-int/lit8 v3, v3, 0x1

    .line 1612
    .line 1613
    goto :goto_2f

    .line 1614
    :cond_39
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1615
    .line 1616
    .line 1617
    move-result v0

    .line 1618
    const/4 v3, 0x0

    .line 1619
    :goto_30
    if-ge v3, v0, :cond_3a

    .line 1620
    .line 1621
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v5

    .line 1625
    check-cast v5, Lae0;

    .line 1626
    .line 1627
    invoke-virtual {v5, v4, v2, v8}, Lae0;->b(III)V

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1631
    .line 1632
    .line 1633
    add-int v4, v4, v35

    .line 1634
    .line 1635
    add-int/lit8 v3, v3, 0x1

    .line 1636
    .line 1637
    goto :goto_30

    .line 1638
    :cond_3a
    :goto_31
    if-eqz v30, :cond_3b

    .line 1639
    .line 1640
    move-object/from16 v29, v1

    .line 1641
    .line 1642
    move-object v1, v6

    .line 1643
    :goto_32
    move/from16 v35, v2

    .line 1644
    .line 1645
    goto :goto_34

    .line 1646
    :cond_3b
    new-instance v3, Ljava/util/ArrayList;

    .line 1647
    .line 1648
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1649
    .line 1650
    .line 1651
    move-result v0

    .line 1652
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1656
    .line 1657
    .line 1658
    move-result v0

    .line 1659
    const/4 v4, 0x0

    .line 1660
    :goto_33
    if-ge v4, v0, :cond_3d

    .line 1661
    .line 1662
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v5

    .line 1666
    move/from16 v28, v0

    .line 1667
    .line 1668
    move-object v0, v5

    .line 1669
    check-cast v0, Lae0;

    .line 1670
    .line 1671
    move-object/from16 v29, v1

    .line 1672
    .line 1673
    iget v1, v0, Lae0;->a:I

    .line 1674
    .line 1675
    invoke-virtual/range {v29 .. v29}, Lx8;->first()Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v30

    .line 1679
    move/from16 v35, v2

    .line 1680
    .line 1681
    move-object/from16 v2, v30

    .line 1682
    .line 1683
    check-cast v2, Lae0;

    .line 1684
    .line 1685
    iget v2, v2, Lae0;->a:I

    .line 1686
    .line 1687
    if-lt v1, v2, :cond_3c

    .line 1688
    .line 1689
    iget v0, v0, Lae0;->a:I

    .line 1690
    .line 1691
    invoke-virtual/range {v29 .. v29}, Lx8;->last()Ljava/lang/Object;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v1

    .line 1695
    check-cast v1, Lae0;

    .line 1696
    .line 1697
    iget v1, v1, Lae0;->a:I

    .line 1698
    .line 1699
    if-gt v0, v1, :cond_3c

    .line 1700
    .line 1701
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1702
    .line 1703
    .line 1704
    :cond_3c
    add-int/lit8 v4, v4, 0x1

    .line 1705
    .line 1706
    move/from16 v0, v28

    .line 1707
    .line 1708
    move-object/from16 v1, v29

    .line 1709
    .line 1710
    move/from16 v2, v35

    .line 1711
    .line 1712
    goto :goto_33

    .line 1713
    :cond_3d
    move-object/from16 v29, v1

    .line 1714
    .line 1715
    move-object v1, v3

    .line 1716
    goto :goto_32

    .line 1717
    :goto_34
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 1718
    .line 1719
    .line 1720
    move-result v0

    .line 1721
    if-eqz v0, :cond_3e

    .line 1722
    .line 1723
    move-object/from16 v0, p0

    .line 1724
    .line 1725
    goto :goto_36

    .line 1726
    :cond_3e
    new-instance v0, Ljava/util/ArrayList;

    .line 1727
    .line 1728
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1729
    .line 1730
    .line 1731
    move-result v2

    .line 1732
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1733
    .line 1734
    .line 1735
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1736
    .line 1737
    .line 1738
    move-result v2

    .line 1739
    const/4 v3, 0x0

    .line 1740
    :goto_35
    if-ge v3, v2, :cond_40

    .line 1741
    .line 1742
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v4

    .line 1746
    move-object v5, v4

    .line 1747
    check-cast v5, Lae0;

    .line 1748
    .line 1749
    iget v5, v5, Lae0;->a:I

    .line 1750
    .line 1751
    invoke-virtual/range {v29 .. v29}, Lx8;->first()Ljava/lang/Object;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v14

    .line 1755
    check-cast v14, Lae0;

    .line 1756
    .line 1757
    iget v14, v14, Lae0;->a:I

    .line 1758
    .line 1759
    if-ge v5, v14, :cond_3f

    .line 1760
    .line 1761
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1762
    .line 1763
    .line 1764
    :cond_3f
    add-int/lit8 v3, v3, 0x1

    .line 1765
    .line 1766
    goto :goto_35

    .line 1767
    :cond_40
    :goto_36
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1768
    .line 1769
    .line 1770
    move-result v2

    .line 1771
    if-eqz v2, :cond_41

    .line 1772
    .line 1773
    move-object/from16 v2, p0

    .line 1774
    .line 1775
    goto :goto_38

    .line 1776
    :cond_41
    new-instance v2, Ljava/util/ArrayList;

    .line 1777
    .line 1778
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1779
    .line 1780
    .line 1781
    move-result v3

    .line 1782
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1786
    .line 1787
    .line 1788
    move-result v3

    .line 1789
    const/4 v4, 0x0

    .line 1790
    :goto_37
    if-ge v4, v3, :cond_43

    .line 1791
    .line 1792
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v5

    .line 1796
    move-object v12, v5

    .line 1797
    check-cast v12, Lae0;

    .line 1798
    .line 1799
    iget v12, v12, Lae0;->a:I

    .line 1800
    .line 1801
    invoke-virtual/range {v29 .. v29}, Lx8;->last()Ljava/lang/Object;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v14

    .line 1805
    check-cast v14, Lae0;

    .line 1806
    .line 1807
    iget v14, v14, Lae0;->a:I

    .line 1808
    .line 1809
    if-le v12, v14, :cond_42

    .line 1810
    .line 1811
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1812
    .line 1813
    .line 1814
    :cond_42
    add-int/lit8 v4, v4, 0x1

    .line 1815
    .line 1816
    goto :goto_37

    .line 1817
    :cond_43
    :goto_38
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1818
    .line 1819
    .line 1820
    move-result v3

    .line 1821
    if-eqz v3, :cond_44

    .line 1822
    .line 1823
    move-object/from16 p0, v0

    .line 1824
    .line 1825
    move-object/from16 v29, v1

    .line 1826
    .line 1827
    move-object/from16 v25, v2

    .line 1828
    .line 1829
    move/from16 v30, v8

    .line 1830
    .line 1831
    move/from16 v4, v20

    .line 1832
    .line 1833
    move/from16 v12, v44

    .line 1834
    .line 1835
    move/from16 v14, v47

    .line 1836
    .line 1837
    move-object/from16 v3, v49

    .line 1838
    .line 1839
    const/16 v17, 0x0

    .line 1840
    .line 1841
    goto/16 :goto_3a

    .line 1842
    .line 1843
    :cond_44
    const/4 v3, 0x0

    .line 1844
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v4

    .line 1848
    move-object v5, v4

    .line 1849
    check-cast v5, Lae0;

    .line 1850
    .line 1851
    iget v5, v5, Lae0;->j:I

    .line 1852
    .line 1853
    move-object/from16 p0, v0

    .line 1854
    .line 1855
    move-object/from16 v17, v4

    .line 1856
    .line 1857
    move/from16 v4, v20

    .line 1858
    .line 1859
    move/from16 v12, v44

    .line 1860
    .line 1861
    move/from16 v14, v47

    .line 1862
    .line 1863
    move-object/from16 v3, v49

    .line 1864
    .line 1865
    invoke-virtual {v3, v14, v9, v12, v4}, Ln2;->i(IIII)I

    .line 1866
    .line 1867
    .line 1868
    move-result v0

    .line 1869
    int-to-float v0, v0

    .line 1870
    int-to-float v5, v5

    .line 1871
    sub-float/2addr v5, v0

    .line 1872
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 1873
    .line 1874
    .line 1875
    move-result v0

    .line 1876
    neg-float v0, v0

    .line 1877
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1878
    .line 1879
    .line 1880
    move-result v5

    .line 1881
    add-int/lit8 v5, v5, -0x1

    .line 1882
    .line 1883
    move/from16 v25, v0

    .line 1884
    .line 1885
    move/from16 v0, v38

    .line 1886
    .line 1887
    if-gt v0, v5, :cond_46

    .line 1888
    .line 1889
    move-object/from16 v53, v2

    .line 1890
    .line 1891
    move v2, v0

    .line 1892
    move/from16 v0, v25

    .line 1893
    .line 1894
    move-object/from16 v25, v53

    .line 1895
    .line 1896
    :goto_39
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v28

    .line 1900
    move-object/from16 v29, v1

    .line 1901
    .line 1902
    move-object/from16 v1, v28

    .line 1903
    .line 1904
    check-cast v1, Lae0;

    .line 1905
    .line 1906
    iget v1, v1, Lae0;->j:I

    .line 1907
    .line 1908
    move/from16 v30, v8

    .line 1909
    .line 1910
    invoke-virtual {v3, v14, v9, v12, v4}, Ln2;->i(IIII)I

    .line 1911
    .line 1912
    .line 1913
    move-result v8

    .line 1914
    int-to-float v8, v8

    .line 1915
    int-to-float v1, v1

    .line 1916
    sub-float/2addr v1, v8

    .line 1917
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 1918
    .line 1919
    .line 1920
    move-result v1

    .line 1921
    neg-float v1, v1

    .line 1922
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 1923
    .line 1924
    .line 1925
    move-result v8

    .line 1926
    if-gez v8, :cond_45

    .line 1927
    .line 1928
    move v0, v1

    .line 1929
    move-object/from16 v17, v28

    .line 1930
    .line 1931
    :cond_45
    if-eq v2, v5, :cond_47

    .line 1932
    .line 1933
    add-int/lit8 v2, v2, 0x1

    .line 1934
    .line 1935
    move-object/from16 v1, v29

    .line 1936
    .line 1937
    move/from16 v8, v30

    .line 1938
    .line 1939
    goto :goto_39

    .line 1940
    :cond_46
    move-object/from16 v29, v1

    .line 1941
    .line 1942
    move-object/from16 v25, v2

    .line 1943
    .line 1944
    move/from16 v30, v8

    .line 1945
    .line 1946
    :cond_47
    :goto_3a
    move-object/from16 v0, v17

    .line 1947
    .line 1948
    check-cast v0, Lae0;

    .line 1949
    .line 1950
    invoke-virtual {v3, v14, v9, v12, v4}, Ln2;->i(IIII)I

    .line 1951
    .line 1952
    .line 1953
    move-result v1

    .line 1954
    if-eqz v0, :cond_48

    .line 1955
    .line 1956
    iget v2, v0, Lae0;->j:I

    .line 1957
    .line 1958
    goto :goto_3b

    .line 1959
    :cond_48
    const/4 v2, 0x0

    .line 1960
    :goto_3b
    if-nez v36, :cond_49

    .line 1961
    .line 1962
    goto :goto_3c

    .line 1963
    :cond_49
    sub-int/2addr v1, v2

    .line 1964
    int-to-float v1, v1

    .line 1965
    move/from16 v14, v36

    .line 1966
    .line 1967
    int-to-float v2, v14

    .line 1968
    div-float/2addr v1, v2

    .line 1969
    const/high16 v2, -0x41000000    # -0.5f

    .line 1970
    .line 1971
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1972
    .line 1973
    invoke-static {v1, v2, v5}, Lw60;->m(FFF)F

    .line 1974
    .line 1975
    .line 1976
    move-result v1

    .line 1977
    move/from16 v31, v1

    .line 1978
    .line 1979
    :goto_3c
    new-instance v1, Lc;

    .line 1980
    .line 1981
    const/16 v2, 0xf

    .line 1982
    .line 1983
    move-object/from16 v5, v33

    .line 1984
    .line 1985
    invoke-direct {v1, v2, v5, v6}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1986
    .line 1987
    .line 1988
    add-int v2, v35, v26

    .line 1989
    .line 1990
    move-wide/from16 v5, p2

    .line 1991
    .line 1992
    invoke-static {v2, v5, v6}, Lqj;->f(IJ)I

    .line 1993
    .line 1994
    .line 1995
    move-result v2

    .line 1996
    add-int v8, v30, v23

    .line 1997
    .line 1998
    invoke-static {v8, v5, v6}, Lqj;->e(IJ)I

    .line 1999
    .line 2000
    .line 2001
    move-result v5

    .line 2002
    move-object/from16 v6, v39

    .line 2003
    .line 2004
    invoke-interface {v7, v2, v5, v6, v1}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v1

    .line 2008
    move/from16 v2, v50

    .line 2009
    .line 2010
    if-lt v2, v13, :cond_4b

    .line 2011
    .line 2012
    if-le v15, v10, :cond_4a

    .line 2013
    .line 2014
    goto :goto_3e

    .line 2015
    :cond_4a
    const/4 v13, 0x0

    .line 2016
    :goto_3d
    move-object v10, v0

    .line 2017
    goto :goto_3f

    .line 2018
    :cond_4b
    :goto_3e
    const/4 v13, 0x1

    .line 2019
    goto :goto_3d

    .line 2020
    :goto_3f
    new-instance v0, Lzn0;

    .line 2021
    .line 2022
    move-object/from16 v17, p0

    .line 2023
    .line 2024
    move-object/from16 v20, p1

    .line 2025
    .line 2026
    move-object v15, v1

    .line 2027
    move-object v14, v3

    .line 2028
    move v2, v9

    .line 2029
    move-object v9, v11

    .line 2030
    move-object/from16 v5, v18

    .line 2031
    .line 2032
    move/from16 v3, v24

    .line 2033
    .line 2034
    move-object/from16 v18, v25

    .line 2035
    .line 2036
    move-object/from16 v1, v29

    .line 2037
    .line 2038
    move/from16 v11, v31

    .line 2039
    .line 2040
    move/from16 v12, v32

    .line 2041
    .line 2042
    move-object/from16 v52, v34

    .line 2043
    .line 2044
    move/from16 v6, v41

    .line 2045
    .line 2046
    move/from16 v8, v48

    .line 2047
    .line 2048
    const/16 v38, 0x1

    .line 2049
    .line 2050
    move-object/from16 v29, v7

    .line 2051
    .line 2052
    move/from16 v7, v27

    .line 2053
    .line 2054
    invoke-direct/range {v0 .. v22}, Lzn0;-><init>(Ljava/util/List;IIILum0;IIILae0;Lae0;FIZLn2;Lyd0;ZLjava/util/List;Ljava/util/List;Lyk;Lym;J)V

    .line 2055
    .line 2056
    .line 2057
    move-object/from16 v1, v20

    .line 2058
    .line 2059
    :goto_40
    invoke-interface/range {v29 .. v29}, Ll30;->m()Z

    .line 2060
    .line 2061
    .line 2062
    move-result v2

    .line 2063
    move-object/from16 v7, v52

    .line 2064
    .line 2065
    const/4 v3, 0x0

    .line 2066
    invoke-virtual {v7, v0, v2, v3}, Llo0;->h(Lzn0;ZZ)V

    .line 2067
    .line 2068
    .line 2069
    iget-object v2, v7, Llo0;->v:Lpn0;

    .line 2070
    .line 2071
    iget-object v4, v0, Lzn0;->a:Ljava/util/List;

    .line 2072
    .line 2073
    const-string v5, "compose:pager:cache_window:keepAroundItems"

    .line 2074
    .line 2075
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2076
    .line 2077
    .line 2078
    :try_start_1
    iget v5, v2, Lpn0;->c:I

    .line 2079
    .line 2080
    const v6, 0x7fffffff

    .line 2081
    .line 2082
    .line 2083
    if-eq v5, v6, :cond_4c

    .line 2084
    .line 2085
    iget v5, v2, Lpn0;->d:I

    .line 2086
    .line 2087
    const/high16 v6, -0x80000000

    .line 2088
    .line 2089
    if-eq v5, v6, :cond_4c

    .line 2090
    .line 2091
    move/from16 v13, v38

    .line 2092
    .line 2093
    goto :goto_41

    .line 2094
    :cond_4c
    move v13, v3

    .line 2095
    :goto_41
    if-eqz v13, :cond_4e

    .line 2096
    .line 2097
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 2098
    .line 2099
    .line 2100
    move-result v3

    .line 2101
    if-nez v3, :cond_4e

    .line 2102
    .line 2103
    invoke-static {v4}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v3

    .line 2107
    check-cast v3, Lae0;

    .line 2108
    .line 2109
    iget v3, v3, Lae0;->a:I

    .line 2110
    .line 2111
    invoke-static {v4}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v4

    .line 2115
    check-cast v4, Lae0;

    .line 2116
    .line 2117
    iget v4, v4, Lae0;->a:I

    .line 2118
    .line 2119
    iget v5, v2, Lpn0;->c:I

    .line 2120
    .line 2121
    :goto_42
    if-ge v5, v3, :cond_4d

    .line 2122
    .line 2123
    invoke-virtual {v1, v5}, Ls70;->a(I)Ljava/util/List;

    .line 2124
    .line 2125
    .line 2126
    add-int/lit8 v5, v5, 0x1

    .line 2127
    .line 2128
    goto :goto_42

    .line 2129
    :cond_4d
    add-int/lit8 v4, v4, 0x1

    .line 2130
    .line 2131
    iget v2, v2, Lpn0;->d:I

    .line 2132
    .line 2133
    if-gt v4, v2, :cond_4e

    .line 2134
    .line 2135
    :goto_43
    invoke-virtual {v1, v4}, Ls70;->a(I)Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2136
    .line 2137
    .line 2138
    if-eq v4, v2, :cond_4e

    .line 2139
    .line 2140
    add-int/lit8 v4, v4, 0x1

    .line 2141
    .line 2142
    goto :goto_43

    .line 2143
    :catchall_0
    move-exception v0

    .line 2144
    goto :goto_44

    .line 2145
    :cond_4e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2146
    .line 2147
    .line 2148
    return-object v0

    .line 2149
    :goto_44
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2150
    .line 2151
    .line 2152
    throw v0

    .line 2153
    :catchall_1
    move-exception v0

    .line 2154
    invoke-static {v14, v12, v11}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 2155
    .line 2156
    .line 2157
    throw v0
.end method
