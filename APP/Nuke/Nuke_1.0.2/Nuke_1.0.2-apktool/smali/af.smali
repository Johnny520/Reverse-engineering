.class public final synthetic Laf;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 15
    iput p2, p0, Laf;->h:I

    iput-object p3, p0, Laf;->i:Ljava/lang/Object;

    iput-object p4, p0, Laf;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Laf;->h:I

    iput-object p2, p0, Laf;->i:Ljava/lang/Object;

    iput-object p3, p0, Laf;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lin0;I)V
    .locals 0

    .line 1
    const/16 p3, 0xc

    .line 2
    .line 3
    iput p3, p0, Laf;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Laf;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Laf;->i:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Lzq;Lin0;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Laf;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf;->j:Ljava/lang/Object;

    iput-object p2, p0, Laf;->i:Ljava/lang/Object;

    return-void
.end method

.method private final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {v1, v2, v1, v2}, Lh11;->a(JJ)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Laf;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lz71;

    .line 12
    .line 13
    iget-object v0, v0, Laf;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lw81;

    .line 16
    .line 17
    move-object/from16 v3, p1

    .line 18
    .line 19
    check-cast v3, Liw2;

    .line 20
    .line 21
    move-object/from16 v4, p2

    .line 22
    .line 23
    check-cast v4, Lfz;

    .line 24
    .line 25
    new-instance v14, Lc81;

    .line 26
    .line 27
    invoke-direct {v14, v2, v3}, Lc81;-><init>(Lz71;Liw2;)V

    .line 28
    .line 29
    .line 30
    iget-wide v4, v4, Lfz;->a:J

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lw81;->d:Lyf;

    .line 36
    .line 37
    iget-object v6, v0, Lw81;->b:Ljw1;

    .line 38
    .line 39
    iget-object v7, v0, Lw81;->a:Ld91;

    .line 40
    .line 41
    iget-object v8, v7, Ld91;->s:Lxk1;

    .line 42
    .line 43
    iget-object v9, v7, Ld91;->e:Los;

    .line 44
    .line 45
    invoke-interface {v8}, Lgu2;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-boolean v8, v7, Ld91;->b:Z

    .line 49
    .line 50
    if-nez v8, :cond_1

    .line 51
    .line 52
    invoke-interface {v3}, Lm11;->u()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/16 v22, 0x0

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    const/16 v22, 0x1

    .line 63
    .line 64
    :goto_1
    sget-object v8, Lqv1;->h:Lqv1;

    .line 65
    .line 66
    invoke-static {v4, v5, v8}, Lte;->p(JLqv1;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, Lm11;->getLayoutDirection()Ld61;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    sget-object v13, Ld61;->h:Ld61;

    .line 74
    .line 75
    if-ne v12, v13, :cond_2

    .line 76
    .line 77
    iget v12, v6, Ljw1;->a:F

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    iget v12, v6, Ljw1;->c:F

    .line 81
    .line 82
    :goto_2
    invoke-interface {v3, v12}, Le70;->T(F)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    invoke-interface {v3}, Lm11;->getLayoutDirection()Ld61;

    .line 87
    .line 88
    .line 89
    move-result-object v15

    .line 90
    if-ne v15, v13, :cond_3

    .line 91
    .line 92
    iget v13, v6, Ljw1;->c:F

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iget v13, v6, Ljw1;->a:F

    .line 96
    .line 97
    :goto_3
    invoke-interface {v3, v13}, Le70;->T(F)I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    iget v15, v6, Ljw1;->b:F

    .line 102
    .line 103
    invoke-interface {v3, v15}, Le70;->T(F)I

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    iget v6, v6, Ljw1;->d:F

    .line 108
    .line 109
    invoke-interface {v3, v6}, Le70;->T(F)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    add-int/2addr v6, v15

    .line 114
    add-int/2addr v13, v12

    .line 115
    move-object/from16 v16, v9

    .line 116
    .line 117
    move-object v9, v14

    .line 118
    sub-int v14, v6, v15

    .line 119
    .line 120
    neg-int v10, v13

    .line 121
    neg-int v11, v6

    .line 122
    invoke-static {v10, v11, v4, v5}, Lgz;->i(IIJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v10

    .line 126
    move/from16 v25, v1

    .line 127
    .line 128
    iget-object v1, v0, Lw81;->c:Lxm0;

    .line 129
    .line 130
    invoke-interface {v1}, Lxm0;->a()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lt81;

    .line 135
    .line 136
    move-wide/from16 v17, v4

    .line 137
    .line 138
    iget-object v4, v1, Lt81;->c:Lo71;

    .line 139
    .line 140
    invoke-static {v10, v11}, Lfz;->h(J)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    move-object/from16 p2, v1

    .line 145
    .line 146
    invoke-static {v10, v11}, Lfz;->g(J)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    move/from16 v19, v6

    .line 151
    .line 152
    iget-object v6, v4, Lo71;->a:Lkx1;

    .line 153
    .line 154
    invoke-virtual {v6, v5}, Lkx1;->h(I)V

    .line 155
    .line 156
    .line 157
    iget-object v4, v4, Lo71;->b:Lkx1;

    .line 158
    .line 159
    invoke-virtual {v4, v1}, Lkx1;->h(I)V

    .line 160
    .line 161
    .line 162
    const-string v4, "null verticalArrangement when isVertical == true"

    .line 163
    .line 164
    if-eqz v2, :cond_76

    .line 165
    .line 166
    invoke-interface {v2}, Lyf;->b()F

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    invoke-interface {v3, v5}, Le70;->T(F)I

    .line 171
    .line 172
    .line 173
    move-result v23

    .line 174
    invoke-virtual/range {p2 .. p2}, Lt81;->c()I

    .line 175
    .line 176
    .line 177
    move-result v20

    .line 178
    invoke-static/range {v17 .. v18}, Lfz;->g(J)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    sub-int v5, v5, v19

    .line 183
    .line 184
    move-object/from16 v21, v2

    .line 185
    .line 186
    const/16 v26, 0x0

    .line 187
    .line 188
    int-to-long v1, v12

    .line 189
    const/16 v6, 0x20

    .line 190
    .line 191
    shl-long/2addr v1, v6

    .line 192
    move-wide/from16 v27, v1

    .line 193
    .line 194
    int-to-long v1, v15

    .line 195
    const-wide v29, 0xffffffffL

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    and-long v1, v1, v29

    .line 201
    .line 202
    or-long v1, v27, v1

    .line 203
    .line 204
    move v6, v5

    .line 205
    new-instance v5, Lv81;

    .line 206
    .line 207
    iget-object v12, v0, Lw81;->g:Lpk;

    .line 208
    .line 209
    move-wide/from16 v27, v1

    .line 210
    .line 211
    iget-object v1, v0, Lw81;->a:Ld91;

    .line 212
    .line 213
    move-object/from16 v33, v8

    .line 214
    .line 215
    move-object/from16 v2, v16

    .line 216
    .line 217
    move-wide/from16 v31, v17

    .line 218
    .line 219
    const/16 p0, 0x1

    .line 220
    .line 221
    move-object/from16 v8, p2

    .line 222
    .line 223
    move-object/from16 v17, v1

    .line 224
    .line 225
    move-object/from16 p2, v4

    .line 226
    .line 227
    move v4, v6

    .line 228
    move-object v1, v7

    .line 229
    move-wide v6, v10

    .line 230
    move/from16 v10, v20

    .line 231
    .line 232
    move/from16 v11, v23

    .line 233
    .line 234
    move-wide/from16 v55, v27

    .line 235
    .line 236
    move/from16 v28, v13

    .line 237
    .line 238
    move v13, v15

    .line 239
    move/from16 v27, v19

    .line 240
    .line 241
    move-wide/from16 v15, v55

    .line 242
    .line 243
    invoke-direct/range {v5 .. v17}, Lv81;-><init>(JLt81;Lc81;IILpk;IIJLd91;)V

    .line 244
    .line 245
    .line 246
    move-object/from16 v55, v9

    .line 247
    .line 248
    move-object v9, v5

    .line 249
    move-object v5, v8

    .line 250
    move-wide v7, v6

    .line 251
    move v6, v14

    .line 252
    move-object/from16 v14, v55

    .line 253
    .line 254
    invoke-static {}, Ltl;->B()Lvr2;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    if-eqz v12, :cond_4

    .line 259
    .line 260
    invoke-virtual {v12}, Lvr2;->e()Lin0;

    .line 261
    .line 262
    .line 263
    move-result-object v15

    .line 264
    :goto_4
    move/from16 v34, v6

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_4
    move-object/from16 v15, v26

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :goto_5
    invoke-static {v12}, Ltl;->K(Lvr2;)Lvr2;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    move/from16 v35, v11

    .line 275
    .line 276
    :try_start_0
    iget-object v11, v2, Los;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v11, Lkx1;

    .line 279
    .line 280
    invoke-virtual {v11}, Lkx1;->g()I

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    move-object/from16 v36, v14

    .line 285
    .line 286
    iget-object v14, v2, Los;->d:Ljava/lang/Object;

    .line 287
    .line 288
    invoke-static {v11, v5, v14}, Lte;->y(ILt81;Ljava/lang/Object;)I

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    if-eq v11, v14, :cond_5

    .line 293
    .line 294
    move/from16 v37, v4

    .line 295
    .line 296
    iget-object v4, v2, Los;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v4, Lkx1;

    .line 299
    .line 300
    invoke-virtual {v4, v14}, Lkx1;->h(I)V

    .line 301
    .line 302
    .line 303
    iget-object v4, v2, Los;->e:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v4, Ld81;

    .line 306
    .line 307
    move/from16 v38, v10

    .line 308
    .line 309
    iget v10, v4, Ld81;->i:I

    .line 310
    .line 311
    if-eq v11, v10, :cond_6

    .line 312
    .line 313
    iput v11, v4, Ld81;->i:I

    .line 314
    .line 315
    div-int/lit8 v11, v11, 0x1e

    .line 316
    .line 317
    mul-int/lit8 v11, v11, 0x1e

    .line 318
    .line 319
    add-int/lit8 v10, v11, -0x64

    .line 320
    .line 321
    move/from16 v16, v14

    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    invoke-static {v10, v14}, Ljava/lang/Math;->max(II)I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    add-int/lit16 v11, v11, 0x82

    .line 329
    .line 330
    invoke-static {v10, v11}, Lci0;->X(II)Lc11;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    iget-object v4, v4, Ld81;->h:Lnx1;

    .line 335
    .line 336
    invoke-virtual {v4, v10}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto :goto_6

    .line 340
    :catchall_0
    move-exception v0

    .line 341
    goto/16 :goto_5d

    .line 342
    .line 343
    :cond_5
    move/from16 v37, v4

    .line 344
    .line 345
    move/from16 v38, v10

    .line 346
    .line 347
    :cond_6
    move/from16 v16, v14

    .line 348
    .line 349
    :goto_6
    iget-object v2, v2, Los;->c:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v2, Lkx1;

    .line 352
    .line 353
    invoke-virtual {v2}, Lkx1;->g()I

    .line 354
    .line 355
    .line 356
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    invoke-static {v12, v6, v15}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 358
    .line 359
    .line 360
    iget-object v2, v1, Ld91;->r:Lg81;

    .line 361
    .line 362
    iget-object v4, v1, Ld91;->o:Llm;

    .line 363
    .line 364
    iget-object v6, v4, Llm;->a:Lzk1;

    .line 365
    .line 366
    iget v10, v6, Lzk1;->j:I

    .line 367
    .line 368
    if-eqz v10, :cond_7

    .line 369
    .line 370
    move/from16 v10, p0

    .line 371
    .line 372
    goto :goto_7

    .line 373
    :cond_7
    const/4 v10, 0x0

    .line 374
    :goto_7
    sget-object v12, Lbe0;->h:Lbe0;

    .line 375
    .line 376
    if-nez v10, :cond_8

    .line 377
    .line 378
    iget-object v10, v2, Lg81;->h:Lps2;

    .line 379
    .line 380
    invoke-virtual {v10}, Lps2;->isEmpty()Z

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    if-eqz v10, :cond_8

    .line 385
    .line 386
    move/from16 v17, v11

    .line 387
    .line 388
    move-object v10, v12

    .line 389
    move-object/from16 v39, v10

    .line 390
    .line 391
    goto/16 :goto_f

    .line 392
    .line 393
    :cond_8
    new-instance v10, Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 396
    .line 397
    .line 398
    iget-object v4, v4, Llm;->a:Lzk1;

    .line 399
    .line 400
    iget v4, v4, Lzk1;->j:I

    .line 401
    .line 402
    if-eqz v4, :cond_10

    .line 403
    .line 404
    new-instance v4, Lc11;

    .line 405
    .line 406
    iget v14, v6, Lzk1;->j:I

    .line 407
    .line 408
    const-string v15, "MutableVector is empty."

    .line 409
    .line 410
    if-eqz v14, :cond_f

    .line 411
    .line 412
    move/from16 v17, v11

    .line 413
    .line 414
    iget-object v11, v6, Lzk1;->h:[Ljava/lang/Object;

    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    aget-object v19, v11, v18

    .line 419
    .line 420
    move-object/from16 v18, v11

    .line 421
    .line 422
    move-object/from16 v11, v19

    .line 423
    .line 424
    check-cast v11, Lp71;

    .line 425
    .line 426
    iget v11, v11, Lp71;->a:I

    .line 427
    .line 428
    move-object/from16 v39, v12

    .line 429
    .line 430
    move v12, v11

    .line 431
    const/4 v11, 0x0

    .line 432
    :goto_8
    if-ge v11, v14, :cond_a

    .line 433
    .line 434
    aget-object v19, v18, v11

    .line 435
    .line 436
    move/from16 v20, v11

    .line 437
    .line 438
    move-object/from16 v11, v19

    .line 439
    .line 440
    check-cast v11, Lp71;

    .line 441
    .line 442
    iget v11, v11, Lp71;->a:I

    .line 443
    .line 444
    if-ge v11, v12, :cond_9

    .line 445
    .line 446
    move v12, v11

    .line 447
    :cond_9
    add-int/lit8 v11, v20, 0x1

    .line 448
    .line 449
    goto :goto_8

    .line 450
    :cond_a
    if-ltz v12, :cond_b

    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_b
    const-string v11, "negative minIndex"

    .line 454
    .line 455
    invoke-static {v11}, Lnz0;->a(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    :goto_9
    iget v11, v6, Lzk1;->j:I

    .line 459
    .line 460
    if-eqz v11, :cond_e

    .line 461
    .line 462
    iget-object v6, v6, Lzk1;->h:[Ljava/lang/Object;

    .line 463
    .line 464
    const/4 v14, 0x0

    .line 465
    aget-object v15, v6, v14

    .line 466
    .line 467
    check-cast v15, Lp71;

    .line 468
    .line 469
    iget v14, v15, Lp71;->b:I

    .line 470
    .line 471
    move v15, v14

    .line 472
    const/4 v14, 0x0

    .line 473
    :goto_a
    if-ge v14, v11, :cond_d

    .line 474
    .line 475
    aget-object v18, v6, v14

    .line 476
    .line 477
    move-object/from16 v19, v6

    .line 478
    .line 479
    move-object/from16 v6, v18

    .line 480
    .line 481
    check-cast v6, Lp71;

    .line 482
    .line 483
    iget v6, v6, Lp71;->b:I

    .line 484
    .line 485
    if-le v6, v15, :cond_c

    .line 486
    .line 487
    move v15, v6

    .line 488
    :cond_c
    add-int/lit8 v14, v14, 0x1

    .line 489
    .line 490
    move-object/from16 v6, v19

    .line 491
    .line 492
    goto :goto_a

    .line 493
    :cond_d
    invoke-virtual {v5}, Lt81;->c()I

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    add-int/lit8 v6, v6, -0x1

    .line 498
    .line 499
    invoke-static {v15, v6}, Ljava/lang/Math;->min(II)I

    .line 500
    .line 501
    .line 502
    move-result v6

    .line 503
    move/from16 v11, p0

    .line 504
    .line 505
    invoke-direct {v4, v12, v6, v11}, La11;-><init>(III)V

    .line 506
    .line 507
    .line 508
    goto :goto_b

    .line 509
    :cond_e
    invoke-static {v15}, Lum2;->i(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    return-object v26

    .line 513
    :cond_f
    invoke-static {v15}, Lum2;->i(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    return-object v26

    .line 517
    :cond_10
    move/from16 v17, v11

    .line 518
    .line 519
    move-object/from16 v39, v12

    .line 520
    .line 521
    sget-object v4, Lc11;->k:Lc11;

    .line 522
    .line 523
    :goto_b
    iget-object v6, v2, Lg81;->h:Lps2;

    .line 524
    .line 525
    invoke-virtual {v6}, Lps2;->size()I

    .line 526
    .line 527
    .line 528
    move-result v6

    .line 529
    const/4 v11, 0x0

    .line 530
    :goto_c
    if-ge v11, v6, :cond_13

    .line 531
    .line 532
    invoke-virtual {v2, v11}, Lg81;->get(I)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v12

    .line 536
    check-cast v12, Le81;

    .line 537
    .line 538
    iget-object v14, v12, Le81;->a:Ljava/lang/Object;

    .line 539
    .line 540
    iget v12, v12, Le81;->c:I

    .line 541
    .line 542
    invoke-static {v12, v5, v14}, Lte;->y(ILt81;Ljava/lang/Object;)I

    .line 543
    .line 544
    .line 545
    move-result v12

    .line 546
    iget v14, v4, La11;->h:I

    .line 547
    .line 548
    iget v15, v4, La11;->i:I

    .line 549
    .line 550
    if-gt v12, v15, :cond_11

    .line 551
    .line 552
    if-gt v14, v12, :cond_11

    .line 553
    .line 554
    goto :goto_d

    .line 555
    :cond_11
    if-ltz v12, :cond_12

    .line 556
    .line 557
    invoke-virtual {v5}, Lt81;->c()I

    .line 558
    .line 559
    .line 560
    move-result v14

    .line 561
    if-ge v12, v14, :cond_12

    .line 562
    .line 563
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v12

    .line 567
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    :cond_12
    :goto_d
    add-int/lit8 v11, v11, 0x1

    .line 571
    .line 572
    goto :goto_c

    .line 573
    :cond_13
    iget v2, v4, La11;->h:I

    .line 574
    .line 575
    iget v4, v4, La11;->i:I

    .line 576
    .line 577
    if-gt v2, v4, :cond_14

    .line 578
    .line 579
    :goto_e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    if-eq v2, v4, :cond_14

    .line 587
    .line 588
    add-int/lit8 v2, v2, 0x1

    .line 589
    .line 590
    goto :goto_e

    .line 591
    :cond_14
    :goto_f
    invoke-interface {v3}, Lm11;->u()Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    if-nez v2, :cond_16

    .line 596
    .line 597
    if-nez v22, :cond_15

    .line 598
    .line 599
    goto :goto_10

    .line 600
    :cond_15
    iget-object v2, v1, Ld91;->w:Lsz0;

    .line 601
    .line 602
    iget-object v2, v2, Lsz0;->j:Ljava/lang/Object;

    .line 603
    .line 604
    check-cast v2, Lid;

    .line 605
    .line 606
    iget-object v2, v2, Lid;->i:Lnx1;

    .line 607
    .line 608
    invoke-virtual {v2}, Lnx1;->getValue()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    check-cast v2, Ljava/lang/Number;

    .line 613
    .line 614
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    goto :goto_11

    .line 619
    :cond_16
    :goto_10
    iget v2, v1, Ld91;->h:F

    .line 620
    .line 621
    :goto_11
    iget-object v15, v1, Ld91;->n:Lx71;

    .line 622
    .line 623
    move-object/from16 v4, v21

    .line 624
    .line 625
    invoke-interface {v3}, Lm11;->u()Z

    .line 626
    .line 627
    .line 628
    move-result v21

    .line 629
    iget-object v5, v0, Lw81;->e:Lj20;

    .line 630
    .line 631
    iget-object v6, v1, Ld91;->v:Lxk1;

    .line 632
    .line 633
    iget-object v0, v0, Lw81;->f:Lj51;

    .line 634
    .line 635
    if-ltz v13, :cond_17

    .line 636
    .line 637
    goto :goto_12

    .line 638
    :cond_17
    const-string v11, "invalid beforeContentPadding"

    .line 639
    .line 640
    invoke-static {v11}, Lnz0;->a(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    :goto_12
    if-ltz v34, :cond_18

    .line 644
    .line 645
    goto :goto_13

    .line 646
    :cond_18
    const-string v11, "invalid afterContentPadding"

    .line 647
    .line 648
    invoke-static {v11}, Lnz0;->a(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    :goto_13
    sget-object v11, Lce0;->h:Lce0;

    .line 652
    .line 653
    iget-object v12, v9, Lv81;->b:Lt81;

    .line 654
    .line 655
    if-gtz v38, :cond_1a

    .line 656
    .line 657
    invoke-static {v7, v8}, Lfz;->j(J)I

    .line 658
    .line 659
    .line 660
    move-result v16

    .line 661
    invoke-static {v7, v8}, Lfz;->i(J)I

    .line 662
    .line 663
    .line 664
    move-result v17

    .line 665
    new-instance v18, Ljava/util/ArrayList;

    .line 666
    .line 667
    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 668
    .line 669
    .line 670
    iget-object v0, v12, Lt81;->d:Le9;

    .line 671
    .line 672
    const/16 v23, 0x0

    .line 673
    .line 674
    const/16 v24, 0x0

    .line 675
    .line 676
    move-object/from16 v19, v0

    .line 677
    .line 678
    move-object/from16 v20, v9

    .line 679
    .line 680
    invoke-virtual/range {v15 .. v24}, Lx71;->b(IILjava/util/ArrayList;Le9;Lv81;ZZII)V

    .line 681
    .line 682
    .line 683
    if-nez v21, :cond_19

    .line 684
    .line 685
    invoke-virtual {v15}, Lx71;->a()J

    .line 686
    .line 687
    .line 688
    if-nez v25, :cond_19

    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    invoke-static {v7, v8, v14}, Lgz;->g(JI)I

    .line 692
    .line 693
    .line 694
    move-result v16

    .line 695
    invoke-static {v7, v8, v14}, Lgz;->f(JI)I

    .line 696
    .line 697
    .line 698
    move-result v17

    .line 699
    :cond_19
    new-instance v0, Lw;

    .line 700
    .line 701
    const/16 v2, 0x18

    .line 702
    .line 703
    invoke-direct {v0, v2}, Lw;-><init>(I)V

    .line 704
    .line 705
    .line 706
    add-int v2, v16, v28

    .line 707
    .line 708
    move-wide/from16 v6, v31

    .line 709
    .line 710
    invoke-static {v6, v7, v2}, Lgz;->g(JI)I

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    add-int v4, v17, v27

    .line 715
    .line 716
    invoke-static {v6, v7, v4}, Lgz;->f(JI)I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    invoke-interface {v3, v2, v4, v11, v0}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 721
    .line 722
    .line 723
    move-result-object v10

    .line 724
    neg-int v0, v13

    .line 725
    add-int v19, v37, v34

    .line 726
    .line 727
    move-object v13, v5

    .line 728
    new-instance v5, Lx81;

    .line 729
    .line 730
    const/4 v12, 0x0

    .line 731
    const/16 v20, 0x0

    .line 732
    .line 733
    const/4 v6, 0x0

    .line 734
    const/4 v7, 0x0

    .line 735
    const/4 v8, 0x0

    .line 736
    const/4 v2, 0x0

    .line 737
    const/4 v11, 0x0

    .line 738
    iget-wide v14, v9, Lv81;->d:J

    .line 739
    .line 740
    move/from16 v18, v0

    .line 741
    .line 742
    move v9, v2

    .line 743
    move-wide v15, v14

    .line 744
    move-object/from16 v21, v33

    .line 745
    .line 746
    move/from16 v22, v34

    .line 747
    .line 748
    move/from16 v23, v35

    .line 749
    .line 750
    move-object/from16 v14, v36

    .line 751
    .line 752
    move-object/from16 v17, v39

    .line 753
    .line 754
    invoke-direct/range {v5 .. v23}, Lx81;-><init>(Ly81;IZFLof1;FZLj20;Le70;JLjava/util/List;IIILqv1;II)V

    .line 755
    .line 756
    .line 757
    move-object/from16 v36, v1

    .line 758
    .line 759
    move-object/from16 v38, v3

    .line 760
    .line 761
    goto/16 :goto_5c

    .line 762
    .line 763
    :cond_1a
    move/from16 v18, v2

    .line 764
    .line 765
    move/from16 v2, v16

    .line 766
    .line 767
    move-object/from16 v14, v36

    .line 768
    .line 769
    move-object/from16 v16, v4

    .line 770
    .line 771
    move-wide/from16 v55, v31

    .line 772
    .line 773
    move-object/from16 v31, v0

    .line 774
    .line 775
    move-object/from16 v32, v5

    .line 776
    .line 777
    move-wide/from16 v4, v55

    .line 778
    .line 779
    move/from16 v0, v38

    .line 780
    .line 781
    if-lt v2, v0, :cond_1b

    .line 782
    .line 783
    add-int/lit8 v2, v0, -0x1

    .line 784
    .line 785
    const/16 v17, 0x0

    .line 786
    .line 787
    :cond_1b
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    .line 788
    .line 789
    .line 790
    move-result v19

    .line 791
    sub-int v17, v17, v19

    .line 792
    .line 793
    if-nez v2, :cond_1c

    .line 794
    .line 795
    if-gez v17, :cond_1c

    .line 796
    .line 797
    add-int v19, v19, v17

    .line 798
    .line 799
    const/16 v17, 0x0

    .line 800
    .line 801
    :cond_1c
    move/from16 v20, v2

    .line 802
    .line 803
    new-instance v2, Lag;

    .line 804
    .line 805
    invoke-direct {v2}, Lag;-><init>()V

    .line 806
    .line 807
    .line 808
    move-object/from16 v36, v1

    .line 809
    .line 810
    neg-int v1, v13

    .line 811
    if-gez v35, :cond_1d

    .line 812
    .line 813
    move/from16 v23, v35

    .line 814
    .line 815
    :goto_14
    move-object/from16 v24, v15

    .line 816
    .line 817
    goto :goto_15

    .line 818
    :cond_1d
    const/16 v23, 0x0

    .line 819
    .line 820
    goto :goto_14

    .line 821
    :goto_15
    add-int v15, v1, v23

    .line 822
    .line 823
    add-int v17, v17, v15

    .line 824
    .line 825
    move-object/from16 v38, v3

    .line 826
    .line 827
    move-wide/from16 v41, v4

    .line 828
    .line 829
    move-object/from16 v40, v11

    .line 830
    .line 831
    move/from16 v11, v17

    .line 832
    .line 833
    const/4 v3, 0x0

    .line 834
    :goto_16
    iget-wide v4, v9, Lv81;->d:J

    .line 835
    .line 836
    if-gez v11, :cond_1e

    .line 837
    .line 838
    if-lez v20, :cond_1e

    .line 839
    .line 840
    move-object/from16 v43, v6

    .line 841
    .line 842
    add-int/lit8 v6, v20, -0x1

    .line 843
    .line 844
    invoke-virtual {v9, v4, v5, v6}, Lv81;->a(JI)Ly81;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    const/4 v5, 0x0

    .line 849
    invoke-virtual {v2, v5, v4}, Lag;->add(ILjava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    iget v5, v4, Ly81;->m:I

    .line 853
    .line 854
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 855
    .line 856
    .line 857
    move-result v3

    .line 858
    iget v4, v4, Ly81;->l:I

    .line 859
    .line 860
    add-int/2addr v11, v4

    .line 861
    move/from16 v20, v6

    .line 862
    .line 863
    move-object/from16 v6, v43

    .line 864
    .line 865
    goto :goto_16

    .line 866
    :cond_1e
    move-object/from16 v43, v6

    .line 867
    .line 868
    if-ge v11, v15, :cond_1f

    .line 869
    .line 870
    sub-int v6, v15, v11

    .line 871
    .line 872
    sub-int v19, v19, v6

    .line 873
    .line 874
    move v11, v15

    .line 875
    :cond_1f
    move/from16 v6, v19

    .line 876
    .line 877
    sub-int/2addr v11, v15

    .line 878
    add-int v44, v37, v34

    .line 879
    .line 880
    move/from16 v17, v3

    .line 881
    .line 882
    if-gez v44, :cond_20

    .line 883
    .line 884
    const/4 v3, 0x0

    .line 885
    :goto_17
    move/from16 v45, v1

    .line 886
    .line 887
    goto :goto_18

    .line 888
    :cond_20
    move/from16 v3, v44

    .line 889
    .line 890
    goto :goto_17

    .line 891
    :goto_18
    neg-int v1, v11

    .line 892
    move/from16 v23, v11

    .line 893
    .line 894
    move-object/from16 v47, v12

    .line 895
    .line 896
    move/from16 v46, v20

    .line 897
    .line 898
    const/4 v11, 0x0

    .line 899
    const/16 v19, 0x0

    .line 900
    .line 901
    :goto_19
    iget v12, v2, Lag;->j:I

    .line 902
    .line 903
    if-ge v11, v12, :cond_22

    .line 904
    .line 905
    if-lt v1, v3, :cond_21

    .line 906
    .line 907
    invoke-virtual {v2, v11}, Lag;->b(I)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    const/16 v19, 0x1

    .line 911
    .line 912
    goto :goto_19

    .line 913
    :cond_21
    add-int/lit8 v46, v46, 0x1

    .line 914
    .line 915
    invoke-virtual {v2, v11}, Lag;->get(I)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v12

    .line 919
    check-cast v12, Ly81;

    .line 920
    .line 921
    iget v12, v12, Ly81;->l:I

    .line 922
    .line 923
    add-int/2addr v1, v12

    .line 924
    add-int/lit8 v11, v11, 0x1

    .line 925
    .line 926
    goto :goto_19

    .line 927
    :cond_22
    move/from16 v11, v17

    .line 928
    .line 929
    move/from16 v12, v46

    .line 930
    .line 931
    move/from16 v46, v19

    .line 932
    .line 933
    :goto_1a
    if-ge v12, v0, :cond_24

    .line 934
    .line 935
    if-lt v1, v3, :cond_23

    .line 936
    .line 937
    if-lez v1, :cond_23

    .line 938
    .line 939
    invoke-virtual {v2}, Lag;->isEmpty()Z

    .line 940
    .line 941
    .line 942
    move-result v17

    .line 943
    if-eqz v17, :cond_24

    .line 944
    .line 945
    :cond_23
    move/from16 v17, v3

    .line 946
    .line 947
    goto :goto_1b

    .line 948
    :cond_24
    move/from16 v48, v0

    .line 949
    .line 950
    move/from16 v0, v37

    .line 951
    .line 952
    goto :goto_1d

    .line 953
    :goto_1b
    invoke-virtual {v9, v4, v5, v12}, Lv81;->a(JI)Ly81;

    .line 954
    .line 955
    .line 956
    move-result-object v3

    .line 957
    move/from16 v48, v0

    .line 958
    .line 959
    iget v0, v3, Ly81;->l:I

    .line 960
    .line 961
    add-int/2addr v1, v0

    .line 962
    if-gt v1, v15, :cond_25

    .line 963
    .line 964
    move/from16 v19, v0

    .line 965
    .line 966
    add-int/lit8 v0, v48, -0x1

    .line 967
    .line 968
    if-eq v12, v0, :cond_25

    .line 969
    .line 970
    add-int/lit8 v0, v12, 0x1

    .line 971
    .line 972
    sub-int v23, v23, v19

    .line 973
    .line 974
    move/from16 v20, v0

    .line 975
    .line 976
    const/16 v46, 0x1

    .line 977
    .line 978
    goto :goto_1c

    .line 979
    :cond_25
    iget v0, v3, Ly81;->m:I

    .line 980
    .line 981
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    invoke-virtual {v2, v3}, Lag;->addLast(Ljava/lang/Object;)V

    .line 986
    .line 987
    .line 988
    move v11, v0

    .line 989
    :goto_1c
    add-int/lit8 v12, v12, 0x1

    .line 990
    .line 991
    move/from16 v3, v17

    .line 992
    .line 993
    move/from16 v0, v48

    .line 994
    .line 995
    goto :goto_1a

    .line 996
    :goto_1d
    if-ge v1, v0, :cond_28

    .line 997
    .line 998
    sub-int v3, v0, v1

    .line 999
    .line 1000
    sub-int v23, v23, v3

    .line 1001
    .line 1002
    add-int/2addr v1, v3

    .line 1003
    move v15, v11

    .line 1004
    move/from16 v11, v23

    .line 1005
    .line 1006
    :goto_1e
    if-ge v11, v13, :cond_26

    .line 1007
    .line 1008
    if-lez v20, :cond_26

    .line 1009
    .line 1010
    move/from16 v17, v1

    .line 1011
    .line 1012
    add-int/lit8 v1, v20, -0x1

    .line 1013
    .line 1014
    move/from16 v19, v3

    .line 1015
    .line 1016
    invoke-virtual {v9, v4, v5, v1}, Lv81;->a(JI)Ly81;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v3

    .line 1020
    move/from16 v20, v1

    .line 1021
    .line 1022
    const/4 v1, 0x0

    .line 1023
    invoke-virtual {v2, v1, v3}, Lag;->add(ILjava/lang/Object;)V

    .line 1024
    .line 1025
    .line 1026
    iget v1, v3, Ly81;->m:I

    .line 1027
    .line 1028
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    .line 1029
    .line 1030
    .line 1031
    move-result v15

    .line 1032
    iget v1, v3, Ly81;->l:I

    .line 1033
    .line 1034
    add-int/2addr v11, v1

    .line 1035
    move/from16 v1, v17

    .line 1036
    .line 1037
    move/from16 v3, v19

    .line 1038
    .line 1039
    goto :goto_1e

    .line 1040
    :cond_26
    move/from16 v17, v1

    .line 1041
    .line 1042
    move/from16 v19, v3

    .line 1043
    .line 1044
    add-int v3, v6, v19

    .line 1045
    .line 1046
    if-gez v11, :cond_27

    .line 1047
    .line 1048
    add-int/2addr v3, v11

    .line 1049
    add-int v1, v17, v11

    .line 1050
    .line 1051
    move/from16 v17, v13

    .line 1052
    .line 1053
    move/from16 v13, v20

    .line 1054
    .line 1055
    const/4 v11, 0x0

    .line 1056
    goto :goto_1f

    .line 1057
    :cond_27
    move/from16 v1, v17

    .line 1058
    .line 1059
    move/from16 v17, v13

    .line 1060
    .line 1061
    move/from16 v13, v20

    .line 1062
    .line 1063
    goto :goto_1f

    .line 1064
    :cond_28
    move v3, v6

    .line 1065
    move v15, v11

    .line 1066
    move/from16 v17, v13

    .line 1067
    .line 1068
    move/from16 v13, v20

    .line 1069
    .line 1070
    move/from16 v11, v23

    .line 1071
    .line 1072
    :goto_1f
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    .line 1073
    .line 1074
    .line 1075
    move-result v19

    .line 1076
    move/from16 v20, v15

    .line 1077
    .line 1078
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->signum(I)I

    .line 1079
    .line 1080
    .line 1081
    move-result v15

    .line 1082
    move/from16 v37, v12

    .line 1083
    .line 1084
    invoke-static {v3}, Ljava/lang/Integer;->signum(I)I

    .line 1085
    .line 1086
    .line 1087
    move-result v12

    .line 1088
    if-ne v15, v12, :cond_29

    .line 1089
    .line 1090
    invoke-static/range {v18 .. v18}, Ljava/lang/Math;->round(F)I

    .line 1091
    .line 1092
    .line 1093
    move-result v12

    .line 1094
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    .line 1095
    .line 1096
    .line 1097
    move-result v12

    .line 1098
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 1099
    .line 1100
    .line 1101
    move-result v15

    .line 1102
    if-lt v12, v15, :cond_29

    .line 1103
    .line 1104
    int-to-float v12, v3

    .line 1105
    goto :goto_20

    .line 1106
    :cond_29
    move/from16 v12, v18

    .line 1107
    .line 1108
    :goto_20
    sub-float v15, v18, v12

    .line 1109
    .line 1110
    const/16 v18, 0x0

    .line 1111
    .line 1112
    if-eqz v21, :cond_2a

    .line 1113
    .line 1114
    if-le v3, v6, :cond_2a

    .line 1115
    .line 1116
    cmpg-float v19, v15, v18

    .line 1117
    .line 1118
    if-gtz v19, :cond_2a

    .line 1119
    .line 1120
    sub-int/2addr v3, v6

    .line 1121
    int-to-float v3, v3

    .line 1122
    add-float v18, v3, v15

    .line 1123
    .line 1124
    :cond_2a
    move/from16 v3, v18

    .line 1125
    .line 1126
    if-ltz v11, :cond_2b

    .line 1127
    .line 1128
    goto :goto_21

    .line 1129
    :cond_2b
    const-string v6, "negative currentFirstItemScrollOffset"

    .line 1130
    .line 1131
    invoke-static {v6}, Lnz0;->a(Ljava/lang/String;)V

    .line 1132
    .line 1133
    .line 1134
    :goto_21
    neg-int v6, v11

    .line 1135
    invoke-virtual {v2}, Lag;->isEmpty()Z

    .line 1136
    .line 1137
    .line 1138
    move-result v15

    .line 1139
    const-string v18, "ArrayDeque is empty."

    .line 1140
    .line 1141
    if-nez v15, :cond_75

    .line 1142
    .line 1143
    iget-object v15, v2, Lag;->i:[Ljava/lang/Object;

    .line 1144
    .line 1145
    move/from16 v49, v3

    .line 1146
    .line 1147
    iget v3, v2, Lag;->h:I

    .line 1148
    .line 1149
    aget-object v3, v15, v3

    .line 1150
    .line 1151
    check-cast v3, Ly81;

    .line 1152
    .line 1153
    if-gtz v17, :cond_2d

    .line 1154
    .line 1155
    if-gez v35, :cond_2c

    .line 1156
    .line 1157
    goto :goto_23

    .line 1158
    :cond_2c
    move/from16 v23, v6

    .line 1159
    .line 1160
    move-object v6, v3

    .line 1161
    :goto_22
    const/4 v3, 0x0

    .line 1162
    goto :goto_26

    .line 1163
    :cond_2d
    :goto_23
    invoke-virtual {v2}, Lag;->a()I

    .line 1164
    .line 1165
    .line 1166
    move-result v15

    .line 1167
    move-object/from16 v17, v3

    .line 1168
    .line 1169
    move v3, v11

    .line 1170
    const/4 v11, 0x0

    .line 1171
    :goto_24
    if-ge v11, v15, :cond_2f

    .line 1172
    .line 1173
    invoke-virtual {v2, v11}, Lag;->get(I)Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v19

    .line 1177
    move/from16 v23, v6

    .line 1178
    .line 1179
    move-object/from16 v6, v19

    .line 1180
    .line 1181
    check-cast v6, Ly81;

    .line 1182
    .line 1183
    iget v6, v6, Ly81;->l:I

    .line 1184
    .line 1185
    if-eqz v3, :cond_2e

    .line 1186
    .line 1187
    if-gt v6, v3, :cond_2e

    .line 1188
    .line 1189
    invoke-virtual {v2}, Lag;->a()I

    .line 1190
    .line 1191
    .line 1192
    move-result v19

    .line 1193
    move/from16 v51, v3

    .line 1194
    .line 1195
    const/16 v50, 0x1

    .line 1196
    .line 1197
    add-int/lit8 v3, v19, -0x1

    .line 1198
    .line 1199
    if-eq v11, v3, :cond_30

    .line 1200
    .line 1201
    sub-int v3, v51, v6

    .line 1202
    .line 1203
    add-int/lit8 v11, v11, 0x1

    .line 1204
    .line 1205
    invoke-virtual {v2, v11}, Lag;->get(I)Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v6

    .line 1209
    move-object/from16 v17, v6

    .line 1210
    .line 1211
    check-cast v17, Ly81;

    .line 1212
    .line 1213
    move/from16 v6, v23

    .line 1214
    .line 1215
    goto :goto_24

    .line 1216
    :cond_2e
    move/from16 v51, v3

    .line 1217
    .line 1218
    goto :goto_25

    .line 1219
    :cond_2f
    move/from16 v51, v3

    .line 1220
    .line 1221
    move/from16 v23, v6

    .line 1222
    .line 1223
    :cond_30
    :goto_25
    move-object/from16 v6, v17

    .line 1224
    .line 1225
    move/from16 v11, v51

    .line 1226
    .line 1227
    goto :goto_22

    .line 1228
    :goto_26
    invoke-static {v3, v13}, Ljava/lang/Math;->max(II)I

    .line 1229
    .line 1230
    .line 1231
    move-result v15

    .line 1232
    const/16 v50, 0x1

    .line 1233
    .line 1234
    add-int/lit8 v13, v13, -0x1

    .line 1235
    .line 1236
    if-gt v15, v13, :cond_32

    .line 1237
    .line 1238
    move-object/from16 v3, v26

    .line 1239
    .line 1240
    :goto_27
    if-nez v3, :cond_31

    .line 1241
    .line 1242
    new-instance v3, Ljava/util/ArrayList;

    .line 1243
    .line 1244
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1245
    .line 1246
    .line 1247
    :cond_31
    move/from16 v17, v11

    .line 1248
    .line 1249
    invoke-virtual {v9, v4, v5, v13}, Lv81;->a(JI)Ly81;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v11

    .line 1253
    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    if-eq v13, v15, :cond_33

    .line 1257
    .line 1258
    add-int/lit8 v13, v13, -0x1

    .line 1259
    .line 1260
    move/from16 v11, v17

    .line 1261
    .line 1262
    goto :goto_27

    .line 1263
    :cond_32
    move/from16 v17, v11

    .line 1264
    .line 1265
    move-object/from16 v3, v26

    .line 1266
    .line 1267
    :cond_33
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1268
    .line 1269
    .line 1270
    move-result v11

    .line 1271
    const/4 v13, -0x1

    .line 1272
    add-int/2addr v11, v13

    .line 1273
    if-ltz v11, :cond_37

    .line 1274
    .line 1275
    :goto_28
    add-int/lit8 v19, v11, -0x1

    .line 1276
    .line 1277
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v11

    .line 1281
    check-cast v11, Ljava/lang/Number;

    .line 1282
    .line 1283
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 1284
    .line 1285
    .line 1286
    move-result v11

    .line 1287
    if-ge v11, v15, :cond_35

    .line 1288
    .line 1289
    if-nez v3, :cond_34

    .line 1290
    .line 1291
    new-instance v3, Ljava/util/ArrayList;

    .line 1292
    .line 1293
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1294
    .line 1295
    .line 1296
    :cond_34
    invoke-virtual {v9, v4, v5, v11}, Lv81;->a(JI)Ly81;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v11

    .line 1300
    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    :cond_35
    if-gez v19, :cond_36

    .line 1304
    .line 1305
    goto :goto_29

    .line 1306
    :cond_36
    move/from16 v11, v19

    .line 1307
    .line 1308
    goto :goto_28

    .line 1309
    :cond_37
    :goto_29
    if-nez v3, :cond_38

    .line 1310
    .line 1311
    move-object/from16 v3, v39

    .line 1312
    .line 1313
    :cond_38
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1314
    .line 1315
    .line 1316
    move-result v11

    .line 1317
    move/from16 v13, v20

    .line 1318
    .line 1319
    const/4 v15, 0x0

    .line 1320
    :goto_2a
    if-ge v15, v11, :cond_39

    .line 1321
    .line 1322
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v19

    .line 1326
    move/from16 v20, v11

    .line 1327
    .line 1328
    move-object/from16 v11, v19

    .line 1329
    .line 1330
    check-cast v11, Ly81;

    .line 1331
    .line 1332
    iget v11, v11, Ly81;->m:I

    .line 1333
    .line 1334
    invoke-static {v13, v11}, Ljava/lang/Math;->max(II)I

    .line 1335
    .line 1336
    .line 1337
    move-result v13

    .line 1338
    add-int/lit8 v15, v15, 0x1

    .line 1339
    .line 1340
    move/from16 v11, v20

    .line 1341
    .line 1342
    goto :goto_2a

    .line 1343
    :cond_39
    invoke-static {v2}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v11

    .line 1347
    check-cast v11, Ly81;

    .line 1348
    .line 1349
    iget v11, v11, Ly81;->a:I

    .line 1350
    .line 1351
    add-int/lit8 v15, v48, -0x1

    .line 1352
    .line 1353
    invoke-static {v11, v15}, Ljava/lang/Math;->min(II)I

    .line 1354
    .line 1355
    .line 1356
    move-result v11

    .line 1357
    invoke-static {v2}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v15

    .line 1361
    check-cast v15, Ly81;

    .line 1362
    .line 1363
    iget v15, v15, Ly81;->a:I

    .line 1364
    .line 1365
    const/16 v19, 0x1

    .line 1366
    .line 1367
    add-int/lit8 v15, v15, 0x1

    .line 1368
    .line 1369
    if-gt v15, v11, :cond_3b

    .line 1370
    .line 1371
    move-object/from16 v19, v26

    .line 1372
    .line 1373
    :goto_2b
    if-nez v19, :cond_3a

    .line 1374
    .line 1375
    new-instance v19, Ljava/util/ArrayList;

    .line 1376
    .line 1377
    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 1378
    .line 1379
    .line 1380
    :cond_3a
    move/from16 v51, v12

    .line 1381
    .line 1382
    move-object/from16 v12, v19

    .line 1383
    .line 1384
    move/from16 v19, v13

    .line 1385
    .line 1386
    invoke-virtual {v9, v4, v5, v15}, Lv81;->a(JI)Ly81;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v13

    .line 1390
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1391
    .line 1392
    .line 1393
    if-eq v15, v11, :cond_3c

    .line 1394
    .line 1395
    add-int/lit8 v15, v15, 0x1

    .line 1396
    .line 1397
    move/from16 v13, v19

    .line 1398
    .line 1399
    move-object/from16 v19, v12

    .line 1400
    .line 1401
    move/from16 v12, v51

    .line 1402
    .line 1403
    goto :goto_2b

    .line 1404
    :cond_3b
    move/from16 v51, v12

    .line 1405
    .line 1406
    move/from16 v19, v13

    .line 1407
    .line 1408
    move-object/from16 v12, v26

    .line 1409
    .line 1410
    :cond_3c
    if-eqz v12, :cond_3d

    .line 1411
    .line 1412
    invoke-static {v12}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v13

    .line 1416
    check-cast v13, Ly81;

    .line 1417
    .line 1418
    iget v13, v13, Ly81;->a:I

    .line 1419
    .line 1420
    if-le v13, v11, :cond_3d

    .line 1421
    .line 1422
    invoke-static {v12}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v11

    .line 1426
    check-cast v11, Ly81;

    .line 1427
    .line 1428
    iget v11, v11, Ly81;->a:I

    .line 1429
    .line 1430
    :cond_3d
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1431
    .line 1432
    .line 1433
    move-result v13

    .line 1434
    move-object v15, v12

    .line 1435
    const/4 v12, 0x0

    .line 1436
    :goto_2c
    if-ge v12, v13, :cond_40

    .line 1437
    .line 1438
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v20

    .line 1442
    check-cast v20, Ljava/lang/Number;

    .line 1443
    .line 1444
    move-object/from16 v52, v10

    .line 1445
    .line 1446
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Number;->intValue()I

    .line 1447
    .line 1448
    .line 1449
    move-result v10

    .line 1450
    if-le v10, v11, :cond_3f

    .line 1451
    .line 1452
    if-nez v15, :cond_3e

    .line 1453
    .line 1454
    new-instance v15, Ljava/util/ArrayList;

    .line 1455
    .line 1456
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1457
    .line 1458
    .line 1459
    :cond_3e
    invoke-virtual {v9, v4, v5, v10}, Lv81;->a(JI)Ly81;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v10

    .line 1463
    invoke-interface {v15, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1464
    .line 1465
    .line 1466
    :cond_3f
    add-int/lit8 v12, v12, 0x1

    .line 1467
    .line 1468
    move-object/from16 v10, v52

    .line 1469
    .line 1470
    goto :goto_2c

    .line 1471
    :cond_40
    if-nez v15, :cond_41

    .line 1472
    .line 1473
    move-object/from16 v12, v39

    .line 1474
    .line 1475
    goto :goto_2d

    .line 1476
    :cond_41
    move-object v12, v15

    .line 1477
    :goto_2d
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1478
    .line 1479
    .line 1480
    move-result v10

    .line 1481
    move/from16 v13, v19

    .line 1482
    .line 1483
    const/4 v11, 0x0

    .line 1484
    :goto_2e
    if-ge v11, v10, :cond_42

    .line 1485
    .line 1486
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v15

    .line 1490
    check-cast v15, Ly81;

    .line 1491
    .line 1492
    iget v15, v15, Ly81;->m:I

    .line 1493
    .line 1494
    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    .line 1495
    .line 1496
    .line 1497
    move-result v13

    .line 1498
    add-int/lit8 v11, v11, 0x1

    .line 1499
    .line 1500
    goto :goto_2e

    .line 1501
    :cond_42
    invoke-virtual {v2}, Lag;->isEmpty()Z

    .line 1502
    .line 1503
    .line 1504
    move-result v10

    .line 1505
    if-nez v10, :cond_74

    .line 1506
    .line 1507
    iget-object v10, v2, Lag;->i:[Ljava/lang/Object;

    .line 1508
    .line 1509
    iget v11, v2, Lag;->h:I

    .line 1510
    .line 1511
    aget-object v10, v10, v11

    .line 1512
    .line 1513
    invoke-static {v6, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1514
    .line 1515
    .line 1516
    move-result v10

    .line 1517
    if-eqz v10, :cond_43

    .line 1518
    .line 1519
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1520
    .line 1521
    .line 1522
    move-result v10

    .line 1523
    if-eqz v10, :cond_43

    .line 1524
    .line 1525
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1526
    .line 1527
    .line 1528
    move-result v10

    .line 1529
    if-eqz v10, :cond_43

    .line 1530
    .line 1531
    const/4 v10, 0x1

    .line 1532
    goto :goto_2f

    .line 1533
    :cond_43
    const/4 v10, 0x0

    .line 1534
    :goto_2f
    invoke-static {v7, v8, v13}, Lgz;->g(JI)I

    .line 1535
    .line 1536
    .line 1537
    move-result v11

    .line 1538
    invoke-static {v7, v8, v1}, Lgz;->f(JI)I

    .line 1539
    .line 1540
    .line 1541
    move-result v13

    .line 1542
    invoke-static {v13, v0}, Ljava/lang/Math;->min(II)I

    .line 1543
    .line 1544
    .line 1545
    move-result v15

    .line 1546
    if-ge v1, v15, :cond_44

    .line 1547
    .line 1548
    const/4 v15, 0x1

    .line 1549
    goto :goto_30

    .line 1550
    :cond_44
    const/4 v15, 0x0

    .line 1551
    :goto_30
    if-eqz v15, :cond_46

    .line 1552
    .line 1553
    if-nez v23, :cond_45

    .line 1554
    .line 1555
    goto :goto_31

    .line 1556
    :cond_45
    const-string v18, "non-zero itemsScrollOffset"

    .line 1557
    .line 1558
    invoke-static/range {v18 .. v18}, Lnz0;->c(Ljava/lang/String;)V

    .line 1559
    .line 1560
    .line 1561
    :cond_46
    :goto_31
    move/from16 v19, v1

    .line 1562
    .line 1563
    new-instance v1, Ljava/util/ArrayList;

    .line 1564
    .line 1565
    invoke-virtual {v2}, Lag;->a()I

    .line 1566
    .line 1567
    .line 1568
    move-result v18

    .line 1569
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1570
    .line 1571
    .line 1572
    move-result v20

    .line 1573
    add-int v20, v20, v18

    .line 1574
    .line 1575
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1576
    .line 1577
    .line 1578
    move-result v18

    .line 1579
    move-object/from16 v52, v6

    .line 1580
    .line 1581
    add-int v6, v18, v20

    .line 1582
    .line 1583
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1584
    .line 1585
    .line 1586
    if-eqz v15, :cond_4d

    .line 1587
    .line 1588
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v3

    .line 1592
    if-eqz v3, :cond_47

    .line 1593
    .line 1594
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1595
    .line 1596
    .line 1597
    move-result v3

    .line 1598
    if-eqz v3, :cond_47

    .line 1599
    .line 1600
    goto :goto_32

    .line 1601
    :cond_47
    const-string v3, "no extra items"

    .line 1602
    .line 1603
    invoke-static {v3}, Lnz0;->a(Ljava/lang/String;)V

    .line 1604
    .line 1605
    .line 1606
    :goto_32
    invoke-virtual {v2}, Lag;->a()I

    .line 1607
    .line 1608
    .line 1609
    move-result v3

    .line 1610
    new-array v6, v3, [I

    .line 1611
    .line 1612
    const/4 v12, 0x0

    .line 1613
    :goto_33
    if-ge v12, v3, :cond_48

    .line 1614
    .line 1615
    invoke-virtual {v2, v12}, Lag;->get(I)Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v15

    .line 1619
    check-cast v15, Ly81;

    .line 1620
    .line 1621
    iget v15, v15, Ly81;->k:I

    .line 1622
    .line 1623
    aput v15, v6, v12

    .line 1624
    .line 1625
    add-int/lit8 v12, v12, 0x1

    .line 1626
    .line 1627
    goto :goto_33

    .line 1628
    :cond_48
    new-array v12, v3, [I

    .line 1629
    .line 1630
    if-eqz v16, :cond_4c

    .line 1631
    .line 1632
    move-object/from16 v15, v16

    .line 1633
    .line 1634
    invoke-interface {v15, v13, v14, v6, v12}, Lyf;->f(ILpf1;[I[I)V

    .line 1635
    .line 1636
    .line 1637
    new-instance v6, Lc11;

    .line 1638
    .line 1639
    const/4 v15, 0x1

    .line 1640
    sub-int/2addr v3, v15

    .line 1641
    move-object/from16 v20, v9

    .line 1642
    .line 1643
    const/4 v9, 0x0

    .line 1644
    invoke-direct {v6, v9, v3, v15}, La11;-><init>(III)V

    .line 1645
    .line 1646
    .line 1647
    iget v3, v6, La11;->i:I

    .line 1648
    .line 1649
    iget v6, v6, La11;->j:I

    .line 1650
    .line 1651
    if-lez v6, :cond_49

    .line 1652
    .line 1653
    if-gez v3, :cond_4a

    .line 1654
    .line 1655
    :cond_49
    if-gez v6, :cond_4b

    .line 1656
    .line 1657
    if-gtz v3, :cond_4b

    .line 1658
    .line 1659
    :cond_4a
    const/4 v9, 0x0

    .line 1660
    :goto_34
    aget v15, v12, v9

    .line 1661
    .line 1662
    invoke-virtual {v2, v9}, Lag;->get(I)Ljava/lang/Object;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v16

    .line 1666
    move/from16 v18, v6

    .line 1667
    .line 1668
    move-object/from16 v6, v16

    .line 1669
    .line 1670
    check-cast v6, Ly81;

    .line 1671
    .line 1672
    invoke-virtual {v6, v15, v11, v13}, Ly81;->c(III)V

    .line 1673
    .line 1674
    .line 1675
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1676
    .line 1677
    .line 1678
    if-eq v9, v3, :cond_4b

    .line 1679
    .line 1680
    add-int v9, v9, v18

    .line 1681
    .line 1682
    move/from16 v6, v18

    .line 1683
    .line 1684
    goto :goto_34

    .line 1685
    :cond_4b
    move-object/from16 v3, v47

    .line 1686
    .line 1687
    goto :goto_38

    .line 1688
    :cond_4c
    invoke-static/range {p2 .. p2}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 1689
    .line 1690
    .line 1691
    invoke-static {}, Ls;->b()V

    .line 1692
    .line 1693
    .line 1694
    return-object v26

    .line 1695
    :cond_4d
    move-object/from16 v20, v9

    .line 1696
    .line 1697
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 1698
    .line 1699
    .line 1700
    move-result v6

    .line 1701
    move/from16 v15, v23

    .line 1702
    .line 1703
    const/4 v9, 0x0

    .line 1704
    :goto_35
    if-ge v9, v6, :cond_4e

    .line 1705
    .line 1706
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v16

    .line 1710
    move-object/from16 v53, v3

    .line 1711
    .line 1712
    move-object/from16 v3, v16

    .line 1713
    .line 1714
    check-cast v3, Ly81;

    .line 1715
    .line 1716
    move/from16 p2, v6

    .line 1717
    .line 1718
    iget v6, v3, Ly81;->l:I

    .line 1719
    .line 1720
    sub-int/2addr v15, v6

    .line 1721
    invoke-virtual {v3, v15, v11, v13}, Ly81;->c(III)V

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1725
    .line 1726
    .line 1727
    add-int/lit8 v9, v9, 0x1

    .line 1728
    .line 1729
    move/from16 v6, p2

    .line 1730
    .line 1731
    move-object/from16 v3, v53

    .line 1732
    .line 1733
    goto :goto_35

    .line 1734
    :cond_4e
    invoke-virtual {v2}, Lag;->a()I

    .line 1735
    .line 1736
    .line 1737
    move-result v3

    .line 1738
    move/from16 v6, v23

    .line 1739
    .line 1740
    const/4 v9, 0x0

    .line 1741
    :goto_36
    if-ge v9, v3, :cond_4f

    .line 1742
    .line 1743
    invoke-virtual {v2, v9}, Lag;->get(I)Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v15

    .line 1747
    check-cast v15, Ly81;

    .line 1748
    .line 1749
    invoke-virtual {v15, v6, v11, v13}, Ly81;->c(III)V

    .line 1750
    .line 1751
    .line 1752
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1753
    .line 1754
    .line 1755
    iget v15, v15, Ly81;->l:I

    .line 1756
    .line 1757
    add-int/2addr v6, v15

    .line 1758
    add-int/lit8 v9, v9, 0x1

    .line 1759
    .line 1760
    goto :goto_36

    .line 1761
    :cond_4f
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1762
    .line 1763
    .line 1764
    move-result v3

    .line 1765
    const/4 v9, 0x0

    .line 1766
    :goto_37
    if-ge v9, v3, :cond_4b

    .line 1767
    .line 1768
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v15

    .line 1772
    check-cast v15, Ly81;

    .line 1773
    .line 1774
    invoke-virtual {v15, v6, v11, v13}, Ly81;->c(III)V

    .line 1775
    .line 1776
    .line 1777
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1778
    .line 1779
    .line 1780
    iget v15, v15, Ly81;->l:I

    .line 1781
    .line 1782
    add-int/2addr v6, v15

    .line 1783
    add-int/lit8 v9, v9, 0x1

    .line 1784
    .line 1785
    goto :goto_37

    .line 1786
    :goto_38
    iget-object v6, v3, Lt81;->d:Le9;

    .line 1787
    .line 1788
    move-object/from16 v18, v1

    .line 1789
    .line 1790
    move/from16 v16, v11

    .line 1791
    .line 1792
    move/from16 v23, v17

    .line 1793
    .line 1794
    move-object/from16 v15, v24

    .line 1795
    .line 1796
    move/from16 v17, v13

    .line 1797
    .line 1798
    move/from16 v24, v19

    .line 1799
    .line 1800
    move-object/from16 v19, v6

    .line 1801
    .line 1802
    invoke-virtual/range {v15 .. v24}, Lx71;->b(IILjava/util/ArrayList;Le9;Lv81;ZZII)V

    .line 1803
    .line 1804
    .line 1805
    move-object/from16 v12, v18

    .line 1806
    .line 1807
    move-object/from16 v9, v20

    .line 1808
    .line 1809
    move/from16 v1, v21

    .line 1810
    .line 1811
    move/from16 v17, v23

    .line 1812
    .line 1813
    move/from16 v6, v24

    .line 1814
    .line 1815
    if-nez v1, :cond_51

    .line 1816
    .line 1817
    invoke-virtual {v15}, Lx71;->a()J

    .line 1818
    .line 1819
    .line 1820
    if-nez v25, :cond_51

    .line 1821
    .line 1822
    const/4 v15, 0x0

    .line 1823
    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    .line 1824
    .line 1825
    .line 1826
    move-result v11

    .line 1827
    invoke-static {v7, v8, v11}, Lgz;->g(JI)I

    .line 1828
    .line 1829
    .line 1830
    move-result v11

    .line 1831
    move/from16 v16, v10

    .line 1832
    .line 1833
    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    .line 1834
    .line 1835
    .line 1836
    move-result v10

    .line 1837
    invoke-static {v7, v8, v10}, Lgz;->f(JI)I

    .line 1838
    .line 1839
    .line 1840
    move-result v7

    .line 1841
    if-eq v7, v13, :cond_50

    .line 1842
    .line 1843
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1844
    .line 1845
    .line 1846
    move-result v8

    .line 1847
    const/4 v10, 0x0

    .line 1848
    :goto_39
    if-ge v10, v8, :cond_50

    .line 1849
    .line 1850
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v13

    .line 1854
    check-cast v13, Ly81;

    .line 1855
    .line 1856
    iput v7, v13, Ly81;->o:I

    .line 1857
    .line 1858
    add-int/lit8 v10, v10, 0x1

    .line 1859
    .line 1860
    goto :goto_39

    .line 1861
    :cond_50
    move v13, v7

    .line 1862
    goto :goto_3a

    .line 1863
    :cond_51
    move/from16 v16, v10

    .line 1864
    .line 1865
    :goto_3a
    invoke-virtual {v2}, Lag;->isEmpty()Z

    .line 1866
    .line 1867
    .line 1868
    move-result v7

    .line 1869
    if-eqz v7, :cond_52

    .line 1870
    .line 1871
    move-object/from16 v7, v26

    .line 1872
    .line 1873
    goto :goto_3b

    .line 1874
    :cond_52
    iget-object v7, v2, Lag;->i:[Ljava/lang/Object;

    .line 1875
    .line 1876
    iget v8, v2, Lag;->h:I

    .line 1877
    .line 1878
    aget-object v7, v7, v8

    .line 1879
    .line 1880
    :goto_3b
    check-cast v7, Ly81;

    .line 1881
    .line 1882
    if-eqz v7, :cond_53

    .line 1883
    .line 1884
    iget v7, v7, Ly81;->a:I

    .line 1885
    .line 1886
    goto :goto_3c

    .line 1887
    :cond_53
    const/4 v7, 0x0

    .line 1888
    :goto_3c
    invoke-virtual {v2}, Lag;->f()Ljava/lang/Object;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v8

    .line 1892
    check-cast v8, Ly81;

    .line 1893
    .line 1894
    if-eqz v8, :cond_54

    .line 1895
    .line 1896
    iget v8, v8, Ly81;->a:I

    .line 1897
    .line 1898
    goto :goto_3d

    .line 1899
    :cond_54
    const/4 v8, 0x0

    .line 1900
    :goto_3d
    iget-object v3, v3, Lt81;->b:Ls81;

    .line 1901
    .line 1902
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1903
    .line 1904
    .line 1905
    sget-object v3, Lw01;->a:Lyj1;

    .line 1906
    .line 1907
    if-eqz v31, :cond_67

    .line 1908
    .line 1909
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1910
    .line 1911
    .line 1912
    move-result v10

    .line 1913
    if-nez v10, :cond_67

    .line 1914
    .line 1915
    iget v10, v3, Lyj1;->b:I

    .line 1916
    .line 1917
    if-eqz v10, :cond_67

    .line 1918
    .line 1919
    sub-int/2addr v8, v7

    .line 1920
    if-ltz v8, :cond_55

    .line 1921
    .line 1922
    if-nez v10, :cond_56

    .line 1923
    .line 1924
    :cond_55
    move-object/from16 v19, v14

    .line 1925
    .line 1926
    goto :goto_40

    .line 1927
    :cond_56
    const/4 v15, 0x0

    .line 1928
    invoke-static {v15, v10}, Lci0;->X(II)Lc11;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v8

    .line 1932
    iget v10, v8, La11;->h:I

    .line 1933
    .line 1934
    iget v8, v8, La11;->i:I

    .line 1935
    .line 1936
    move-object/from16 v19, v14

    .line 1937
    .line 1938
    if-gt v10, v8, :cond_58

    .line 1939
    .line 1940
    const/4 v15, -0x1

    .line 1941
    :goto_3e
    invoke-virtual {v3, v10}, Lyj1;->c(I)I

    .line 1942
    .line 1943
    .line 1944
    move-result v14

    .line 1945
    if-gt v14, v7, :cond_57

    .line 1946
    .line 1947
    invoke-virtual {v3, v10}, Lyj1;->c(I)I

    .line 1948
    .line 1949
    .line 1950
    move-result v15

    .line 1951
    if-eq v10, v8, :cond_57

    .line 1952
    .line 1953
    add-int/lit8 v10, v10, 0x1

    .line 1954
    .line 1955
    goto :goto_3e

    .line 1956
    :cond_57
    const/4 v7, -0x1

    .line 1957
    goto :goto_3f

    .line 1958
    :cond_58
    const/4 v7, -0x1

    .line 1959
    const/4 v15, -0x1

    .line 1960
    :goto_3f
    if-ne v15, v7, :cond_59

    .line 1961
    .line 1962
    sget-object v7, Lw01;->a:Lyj1;

    .line 1963
    .line 1964
    goto :goto_41

    .line 1965
    :cond_59
    new-instance v7, Lyj1;

    .line 1966
    .line 1967
    const/4 v8, 0x1

    .line 1968
    invoke-direct {v7, v8}, Lyj1;-><init>(I)V

    .line 1969
    .line 1970
    .line 1971
    invoke-virtual {v7, v15}, Lyj1;->a(I)V

    .line 1972
    .line 1973
    .line 1974
    goto :goto_41

    .line 1975
    :goto_40
    move-object v7, v3

    .line 1976
    :goto_41
    new-instance v8, Ljava/util/ArrayList;

    .line 1977
    .line 1978
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1979
    .line 1980
    .line 1981
    new-instance v10, Ljava/util/ArrayList;

    .line 1982
    .line 1983
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1984
    .line 1985
    .line 1986
    move-result v14

    .line 1987
    invoke-direct {v10, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1988
    .line 1989
    .line 1990
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1991
    .line 1992
    .line 1993
    move-result v14

    .line 1994
    const/4 v15, 0x0

    .line 1995
    :goto_42
    if-ge v15, v14, :cond_5c

    .line 1996
    .line 1997
    move/from16 p2, v14

    .line 1998
    .line 1999
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v14

    .line 2003
    move/from16 v18, v15

    .line 2004
    .line 2005
    move-object v15, v14

    .line 2006
    check-cast v15, Ly81;

    .line 2007
    .line 2008
    iget v15, v15, Ly81;->a:I

    .line 2009
    .line 2010
    move/from16 v21, v1

    .line 2011
    .line 2012
    iget-object v1, v3, Lyj1;->a:[I

    .line 2013
    .line 2014
    move-object/from16 v20, v1

    .line 2015
    .line 2016
    iget v1, v3, Lyj1;->b:I

    .line 2017
    .line 2018
    move-object/from16 v22, v3

    .line 2019
    .line 2020
    const/4 v3, 0x0

    .line 2021
    :goto_43
    if-ge v3, v1, :cond_5b

    .line 2022
    .line 2023
    move/from16 v23, v1

    .line 2024
    .line 2025
    aget v1, v20, v3

    .line 2026
    .line 2027
    if-ne v1, v15, :cond_5a

    .line 2028
    .line 2029
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2030
    .line 2031
    .line 2032
    goto :goto_44

    .line 2033
    :cond_5a
    add-int/lit8 v3, v3, 0x1

    .line 2034
    .line 2035
    move/from16 v1, v23

    .line 2036
    .line 2037
    goto :goto_43

    .line 2038
    :cond_5b
    :goto_44
    add-int/lit8 v15, v18, 0x1

    .line 2039
    .line 2040
    move/from16 v14, p2

    .line 2041
    .line 2042
    move/from16 v1, v21

    .line 2043
    .line 2044
    move-object/from16 v3, v22

    .line 2045
    .line 2046
    goto :goto_42

    .line 2047
    :cond_5c
    move/from16 v21, v1

    .line 2048
    .line 2049
    iget-object v1, v7, Lyj1;->a:[I

    .line 2050
    .line 2051
    iget v3, v7, Lyj1;->b:I

    .line 2052
    .line 2053
    const/4 v7, 0x0

    .line 2054
    :goto_45
    if-ge v7, v3, :cond_66

    .line 2055
    .line 2056
    aget v14, v1, v7

    .line 2057
    .line 2058
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v15

    .line 2062
    const/16 v18, 0x0

    .line 2063
    .line 2064
    :goto_46
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 2065
    .line 2066
    .line 2067
    move-result v20

    .line 2068
    if-eqz v20, :cond_5e

    .line 2069
    .line 2070
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v20

    .line 2074
    move-object/from16 v22, v1

    .line 2075
    .line 2076
    move-object/from16 v1, v20

    .line 2077
    .line 2078
    check-cast v1, Ly81;

    .line 2079
    .line 2080
    iget v1, v1, Ly81;->a:I

    .line 2081
    .line 2082
    if-ne v1, v14, :cond_5d

    .line 2083
    .line 2084
    move/from16 v1, v18

    .line 2085
    .line 2086
    :goto_47
    const/4 v15, -0x1

    .line 2087
    goto :goto_48

    .line 2088
    :cond_5d
    add-int/lit8 v18, v18, 0x1

    .line 2089
    .line 2090
    move-object/from16 v1, v22

    .line 2091
    .line 2092
    goto :goto_46

    .line 2093
    :cond_5e
    move-object/from16 v22, v1

    .line 2094
    .line 2095
    const/4 v1, -0x1

    .line 2096
    goto :goto_47

    .line 2097
    :goto_48
    if-ne v1, v15, :cond_5f

    .line 2098
    .line 2099
    invoke-virtual {v9, v4, v5, v14}, Lv81;->a(JI)Ly81;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v18

    .line 2103
    :goto_49
    move-object/from16 v15, v18

    .line 2104
    .line 2105
    move/from16 v18, v3

    .line 2106
    .line 2107
    goto :goto_4a

    .line 2108
    :cond_5f
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v18

    .line 2112
    check-cast v18, Ly81;

    .line 2113
    .line 2114
    goto :goto_49

    .line 2115
    :goto_4a
    iget v3, v15, Ly81;->l:I

    .line 2116
    .line 2117
    move/from16 v20, v3

    .line 2118
    .line 2119
    const/4 v3, -0x1

    .line 2120
    if-ne v1, v3, :cond_60

    .line 2121
    .line 2122
    move-wide/from16 v53, v4

    .line 2123
    .line 2124
    const/high16 v1, -0x80000000

    .line 2125
    .line 2126
    goto :goto_4b

    .line 2127
    :cond_60
    const/4 v1, 0x0

    .line 2128
    invoke-virtual {v15, v1}, Ly81;->a(I)J

    .line 2129
    .line 2130
    .line 2131
    move-result-wide v23

    .line 2132
    move-wide/from16 v53, v4

    .line 2133
    .line 2134
    and-long v3, v23, v29

    .line 2135
    .line 2136
    long-to-int v1, v3

    .line 2137
    :goto_4b
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 2138
    .line 2139
    .line 2140
    move-result v3

    .line 2141
    const/4 v4, 0x0

    .line 2142
    :goto_4c
    if-ge v4, v3, :cond_62

    .line 2143
    .line 2144
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v5

    .line 2148
    move/from16 v23, v3

    .line 2149
    .line 2150
    move-object v3, v5

    .line 2151
    check-cast v3, Ly81;

    .line 2152
    .line 2153
    iget v3, v3, Ly81;->a:I

    .line 2154
    .line 2155
    if-eq v3, v14, :cond_61

    .line 2156
    .line 2157
    goto :goto_4d

    .line 2158
    :cond_61
    add-int/lit8 v4, v4, 0x1

    .line 2159
    .line 2160
    move/from16 v3, v23

    .line 2161
    .line 2162
    goto :goto_4c

    .line 2163
    :cond_62
    move-object/from16 v5, v26

    .line 2164
    .line 2165
    :goto_4d
    check-cast v5, Ly81;

    .line 2166
    .line 2167
    if-eqz v5, :cond_63

    .line 2168
    .line 2169
    const/4 v14, 0x0

    .line 2170
    invoke-virtual {v5, v14}, Ly81;->a(I)J

    .line 2171
    .line 2172
    .line 2173
    move-result-wide v3

    .line 2174
    and-long v3, v3, v29

    .line 2175
    .line 2176
    long-to-int v3, v3

    .line 2177
    :goto_4e
    const/high16 v4, -0x80000000

    .line 2178
    .line 2179
    goto :goto_4f

    .line 2180
    :cond_63
    const/high16 v3, -0x80000000

    .line 2181
    .line 2182
    goto :goto_4e

    .line 2183
    :goto_4f
    if-ne v1, v4, :cond_64

    .line 2184
    .line 2185
    move/from16 v1, v45

    .line 2186
    .line 2187
    move v5, v1

    .line 2188
    goto :goto_50

    .line 2189
    :cond_64
    move/from16 v5, v45

    .line 2190
    .line 2191
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 2192
    .line 2193
    .line 2194
    move-result v1

    .line 2195
    :goto_50
    if-eq v3, v4, :cond_65

    .line 2196
    .line 2197
    sub-int v3, v3, v20

    .line 2198
    .line 2199
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 2200
    .line 2201
    .line 2202
    move-result v1

    .line 2203
    :cond_65
    const/4 v3, 0x1

    .line 2204
    iput-boolean v3, v15, Ly81;->n:Z

    .line 2205
    .line 2206
    invoke-virtual {v15, v1, v11, v13}, Ly81;->c(III)V

    .line 2207
    .line 2208
    .line 2209
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2210
    .line 2211
    .line 2212
    add-int/lit8 v7, v7, 0x1

    .line 2213
    .line 2214
    move/from16 v45, v5

    .line 2215
    .line 2216
    move/from16 v3, v18

    .line 2217
    .line 2218
    move-object/from16 v1, v22

    .line 2219
    .line 2220
    move-wide/from16 v4, v53

    .line 2221
    .line 2222
    goto/16 :goto_45

    .line 2223
    .line 2224
    :cond_66
    move/from16 v5, v45

    .line 2225
    .line 2226
    const/4 v3, 0x1

    .line 2227
    goto :goto_51

    .line 2228
    :cond_67
    move/from16 v21, v1

    .line 2229
    .line 2230
    move-object/from16 v19, v14

    .line 2231
    .line 2232
    move/from16 v5, v45

    .line 2233
    .line 2234
    const/4 v3, 0x1

    .line 2235
    move-object/from16 v8, v39

    .line 2236
    .line 2237
    :goto_51
    if-eqz v16, :cond_69

    .line 2238
    .line 2239
    invoke-static {v12}, Ldu;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v1

    .line 2243
    check-cast v1, Ly81;

    .line 2244
    .line 2245
    if-eqz v1, :cond_68

    .line 2246
    .line 2247
    iget v1, v1, Ly81;->a:I

    .line 2248
    .line 2249
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v1

    .line 2253
    goto :goto_53

    .line 2254
    :cond_68
    move-object/from16 v1, v26

    .line 2255
    .line 2256
    goto :goto_53

    .line 2257
    :cond_69
    invoke-virtual {v2}, Lag;->isEmpty()Z

    .line 2258
    .line 2259
    .line 2260
    move-result v1

    .line 2261
    if-eqz v1, :cond_6a

    .line 2262
    .line 2263
    move-object/from16 v1, v26

    .line 2264
    .line 2265
    goto :goto_52

    .line 2266
    :cond_6a
    iget-object v1, v2, Lag;->i:[Ljava/lang/Object;

    .line 2267
    .line 2268
    iget v4, v2, Lag;->h:I

    .line 2269
    .line 2270
    aget-object v1, v1, v4

    .line 2271
    .line 2272
    :goto_52
    check-cast v1, Ly81;

    .line 2273
    .line 2274
    if-eqz v1, :cond_68

    .line 2275
    .line 2276
    iget v1, v1, Ly81;->a:I

    .line 2277
    .line 2278
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2279
    .line 2280
    .line 2281
    move-result-object v1

    .line 2282
    :goto_53
    if-eqz v16, :cond_6c

    .line 2283
    .line 2284
    invoke-static {v12}, Ldu;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v2

    .line 2288
    check-cast v2, Ly81;

    .line 2289
    .line 2290
    if-eqz v2, :cond_6b

    .line 2291
    .line 2292
    iget v2, v2, Ly81;->a:I

    .line 2293
    .line 2294
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2295
    .line 2296
    .line 2297
    move-result-object v2

    .line 2298
    :goto_54
    move/from16 v4, v37

    .line 2299
    .line 2300
    move/from16 v10, v48

    .line 2301
    .line 2302
    goto :goto_55

    .line 2303
    :cond_6b
    move-object/from16 v2, v26

    .line 2304
    .line 2305
    goto :goto_54

    .line 2306
    :cond_6c
    invoke-virtual {v2}, Lag;->f()Ljava/lang/Object;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v2

    .line 2310
    check-cast v2, Ly81;

    .line 2311
    .line 2312
    if-eqz v2, :cond_6b

    .line 2313
    .line 2314
    iget v2, v2, Ly81;->a:I

    .line 2315
    .line 2316
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v2

    .line 2320
    goto :goto_54

    .line 2321
    :goto_55
    if-lt v4, v10, :cond_6e

    .line 2322
    .line 2323
    if-le v6, v0, :cond_6d

    .line 2324
    .line 2325
    goto :goto_56

    .line 2326
    :cond_6d
    const/4 v3, 0x0

    .line 2327
    :cond_6e
    :goto_56
    new-instance v0, Lm0;

    .line 2328
    .line 2329
    move/from16 v4, v21

    .line 2330
    .line 2331
    move-object/from16 v6, v43

    .line 2332
    .line 2333
    invoke-direct {v0, v6, v12, v8, v4}, Lm0;-><init>(Lxk1;Ljava/util/ArrayList;Ljava/util/List;Z)V

    .line 2334
    .line 2335
    .line 2336
    add-int v11, v11, v28

    .line 2337
    .line 2338
    move-wide/from16 v6, v41

    .line 2339
    .line 2340
    invoke-static {v6, v7, v11}, Lgz;->g(JI)I

    .line 2341
    .line 2342
    .line 2343
    move-result v4

    .line 2344
    add-int v13, v13, v27

    .line 2345
    .line 2346
    invoke-static {v6, v7, v13}, Lgz;->f(JI)I

    .line 2347
    .line 2348
    .line 2349
    move-result v6

    .line 2350
    move-object/from16 v7, v38

    .line 2351
    .line 2352
    move-object/from16 v11, v40

    .line 2353
    .line 2354
    invoke-interface {v7, v4, v6, v11, v0}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v0

    .line 2358
    if-eqz v1, :cond_6f

    .line 2359
    .line 2360
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2361
    .line 2362
    .line 2363
    move-result v11

    .line 2364
    goto :goto_57

    .line 2365
    :cond_6f
    const/4 v11, 0x0

    .line 2366
    :goto_57
    if-eqz v2, :cond_70

    .line 2367
    .line 2368
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2369
    .line 2370
    .line 2371
    move-result v1

    .line 2372
    goto :goto_58

    .line 2373
    :cond_70
    const/4 v1, 0x0

    .line 2374
    :goto_58
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2375
    .line 2376
    .line 2377
    move-result v2

    .line 2378
    if-eqz v2, :cond_71

    .line 2379
    .line 2380
    move-object/from16 v12, v39

    .line 2381
    .line 2382
    :goto_59
    move/from16 v45, v5

    .line 2383
    .line 2384
    goto :goto_5b

    .line 2385
    :cond_71
    new-instance v2, Ljava/util/ArrayList;

    .line 2386
    .line 2387
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2388
    .line 2389
    .line 2390
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 2391
    .line 2392
    .line 2393
    move-result v4

    .line 2394
    const/4 v6, 0x0

    .line 2395
    :goto_5a
    if-ge v6, v4, :cond_73

    .line 2396
    .line 2397
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v8

    .line 2401
    check-cast v8, Ly81;

    .line 2402
    .line 2403
    iget v13, v8, Ly81;->a:I

    .line 2404
    .line 2405
    if-gt v11, v13, :cond_72

    .line 2406
    .line 2407
    if-gt v13, v1, :cond_72

    .line 2408
    .line 2409
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2410
    .line 2411
    .line 2412
    :cond_72
    add-int/lit8 v6, v6, 0x1

    .line 2413
    .line 2414
    goto :goto_5a

    .line 2415
    :cond_73
    sget-object v1, Lrg3;->k:Lqa;

    .line 2416
    .line 2417
    invoke-static {v2, v1}, Lhu;->f0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2418
    .line 2419
    .line 2420
    move-object v12, v2

    .line 2421
    goto :goto_59

    .line 2422
    :goto_5b
    new-instance v5, Lx81;

    .line 2423
    .line 2424
    iget-wide v1, v9, Lv81;->d:J

    .line 2425
    .line 2426
    move-wide v15, v1

    .line 2427
    move v8, v3

    .line 2428
    move-object/from16 v38, v7

    .line 2429
    .line 2430
    move/from16 v20, v10

    .line 2431
    .line 2432
    move/from16 v7, v17

    .line 2433
    .line 2434
    move-object/from16 v14, v19

    .line 2435
    .line 2436
    move-object/from16 v13, v32

    .line 2437
    .line 2438
    move-object/from16 v21, v33

    .line 2439
    .line 2440
    move/from16 v22, v34

    .line 2441
    .line 2442
    move/from16 v23, v35

    .line 2443
    .line 2444
    move/from16 v19, v44

    .line 2445
    .line 2446
    move/from16 v18, v45

    .line 2447
    .line 2448
    move/from16 v11, v49

    .line 2449
    .line 2450
    move/from16 v9, v51

    .line 2451
    .line 2452
    move-object/from16 v6, v52

    .line 2453
    .line 2454
    move-object v10, v0

    .line 2455
    move-object/from16 v17, v12

    .line 2456
    .line 2457
    move/from16 v12, v46

    .line 2458
    .line 2459
    invoke-direct/range {v5 .. v23}, Lx81;-><init>(Ly81;IZFLof1;FZLj20;Le70;JLjava/util/List;IIILqv1;II)V

    .line 2460
    .line 2461
    .line 2462
    :goto_5c
    invoke-interface/range {v38 .. v38}, Lm11;->u()Z

    .line 2463
    .line 2464
    .line 2465
    move-result v0

    .line 2466
    move-object/from16 v1, v36

    .line 2467
    .line 2468
    const/4 v14, 0x0

    .line 2469
    invoke-virtual {v1, v5, v0, v14}, Ld91;->f(Lx81;ZZ)V

    .line 2470
    .line 2471
    .line 2472
    return-object v5

    .line 2473
    :cond_74
    invoke-static/range {v18 .. v18}, Lum2;->i(Ljava/lang/String;)V

    .line 2474
    .line 2475
    .line 2476
    return-object v26

    .line 2477
    :cond_75
    invoke-static/range {v18 .. v18}, Lum2;->i(Ljava/lang/String;)V

    .line 2478
    .line 2479
    .line 2480
    return-object v26

    .line 2481
    :goto_5d
    invoke-static {v12, v6, v15}, Ltl;->U(Lvr2;Lvr2;Lin0;)V

    .line 2482
    .line 2483
    .line 2484
    throw v0

    .line 2485
    :cond_76
    move-object/from16 p2, v4

    .line 2486
    .line 2487
    const/16 v26, 0x0

    .line 2488
    .line 2489
    invoke-static/range {p2 .. p2}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 2490
    .line 2491
    .line 2492
    invoke-static {}, Ls;->b()V

    .line 2493
    .line 2494
    .line 2495
    return-object v26
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget v2, v0, Laf;->h:I

    .line 6
    .line 7
    const-string v3, "\n\n"

    .line 8
    .line 9
    const-string v4, "\u6765\u81ea\u811a\u672c\uff1a"

    .line 10
    .line 11
    const/16 v5, 0x31

    .line 12
    .line 13
    sget-object v8, Lnx;->a:Leb;

    .line 14
    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v11, 0x1

    .line 17
    sget-object v12, La83;->a:La83;

    .line 18
    .line 19
    iget-object v13, v0, Laf;->j:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v14, v0, Laf;->i:Ljava/lang/Object;

    .line 22
    .line 23
    packed-switch v2, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v14, Ly33;

    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, Lpx;

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v11}, Lpp0;->N(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v14, v13, v0, v1}, Ly33;->a(Ljava/lang/Object;Lpx;I)V

    .line 42
    .line 43
    .line 44
    return-object v12

    .line 45
    :pswitch_0
    check-cast v14, Lm13;

    .line 46
    .line 47
    check-cast v13, Lkw;

    .line 48
    .line 49
    move-object/from16 v0, p1

    .line 50
    .line 51
    check-cast v0, Lpx;

    .line 52
    .line 53
    check-cast v1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v11}, Lpp0;->N(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v14, v13, v0, v1}, Lv03;->a(Lm13;Lkw;Lpx;I)V

    .line 63
    .line 64
    .line 65
    return-object v12

    .line 66
    :pswitch_1
    check-cast v14, Lb03;

    .line 67
    .line 68
    check-cast v13, Lj20;

    .line 69
    .line 70
    move-object/from16 v0, p1

    .line 71
    .line 72
    check-cast v0, Loy2;

    .line 73
    .line 74
    check-cast v1, Landroid/content/Context;

    .line 75
    .line 76
    invoke-virtual {v14}, Lb03;->j()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {v14}, Lb03;->m()Lsd;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    iget-object v3, v3, Lsd;->i:Ljava/lang/String;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const/4 v3, 0x0

    .line 90
    :goto_0
    iget-object v4, v14, Lb03;->w:Lf13;

    .line 91
    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    iget-wide v4, v4, Lf13;->a:J

    .line 95
    .line 96
    iget-object v8, v14, Lb03;->b:Lus1;

    .line 97
    .line 98
    const/16 v9, 0x20

    .line 99
    .line 100
    shr-long v10, v4, v9

    .line 101
    .line 102
    long-to-int v9, v10

    .line 103
    invoke-interface {v8, v9}, Lus1;->p(I)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    const-wide v10, 0xffffffffL

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    and-long/2addr v4, v10

    .line 113
    long-to-int v4, v4

    .line 114
    invoke-interface {v8, v4}, Lus1;->p(I)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-static {v9, v4}, Lfg1;->i(II)J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    new-instance v8, Lf13;

    .line 123
    .line 124
    invoke-direct {v8, v4, v5}, Lf13;-><init>(J)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    const/4 v8, 0x0

    .line 129
    :goto_1
    iget-object v4, v14, Lb03;->j:Lp02;

    .line 130
    .line 131
    new-instance v5, Lm0;

    .line 132
    .line 133
    const/16 v9, 0xe

    .line 134
    .line 135
    invoke-direct {v5, v14, v13, v1, v9}, Lm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    sget-object v9, Lr02;->a:Ltu2;

    .line 139
    .line 140
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 141
    .line 142
    const/16 v10, 0x1c

    .line 143
    .line 144
    if-lt v9, v10, :cond_c

    .line 145
    .line 146
    if-eqz v3, :cond_c

    .line 147
    .line 148
    if-eqz v8, :cond_c

    .line 149
    .line 150
    if-eqz v4, :cond_c

    .line 151
    .line 152
    instance-of v9, v4, Lp02;

    .line 153
    .line 154
    if-nez v9, :cond_2

    .line 155
    .line 156
    goto/16 :goto_8

    .line 157
    .line 158
    :cond_2
    iget-wide v9, v8, Lf13;->a:J

    .line 159
    .line 160
    iget-object v11, v4, Lp02;->h:Ljava/lang/Object;

    .line 161
    .line 162
    iget-object v13, v4, Lp02;->e:Lkl1;

    .line 163
    .line 164
    invoke-virtual {v13}, Lkl1;->e()Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-nez v14, :cond_3

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    goto :goto_4

    .line 172
    :cond_3
    iget-object v4, v4, Lp02;->g:Lnx1;

    .line 173
    .line 174
    invoke-virtual {v4}, Lnx1;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Lny2;

    .line 179
    .line 180
    if-eqz v4, :cond_4

    .line 181
    .line 182
    iget-wide v6, v4, Lny2;->b:J

    .line 183
    .line 184
    invoke-static {v9, v10, v6, v7}, Lf13;->b(JJ)Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_4

    .line 189
    .line 190
    iget-object v6, v4, Lny2;->a:Ljava/lang/CharSequence;

    .line 191
    .line 192
    invoke-static {v3, v6}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    if-eqz v6, :cond_4

    .line 197
    .line 198
    iget-object v4, v4, Lny2;->c:Landroid/view/textclassifier/TextClassification;

    .line 199
    .line 200
    move-object/from16 v17, v4

    .line 201
    .line 202
    :goto_2
    const/4 v4, 0x0

    .line 203
    goto :goto_3

    .line 204
    :cond_4
    const/16 v17, 0x0

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :goto_3
    invoke-virtual {v13, v4}, Lkl1;->f(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v7, v17

    .line 211
    .line 212
    :goto_4
    if-nez v7, :cond_5

    .line 213
    .line 214
    invoke-virtual {v5, v0}, Lm0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_5
    invoke-static {v7}, Lp90;->p(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-nez v4, :cond_6

    .line 227
    .line 228
    new-instance v4, Ldz2;

    .line 229
    .line 230
    const/4 v15, 0x0

    .line 231
    invoke-direct {v4, v11, v7, v15}, Ldz2;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    .line 232
    .line 233
    .line 234
    iget-object v6, v0, Loy2;->a:Llk1;

    .line 235
    .line 236
    invoke-virtual {v6, v4}, Llk1;->a(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_6
    invoke-virtual {v7}, Landroid/view/textclassifier/TextClassification;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-nez v4, :cond_7

    .line 245
    .line 246
    invoke-virtual {v7}, Landroid/view/textclassifier/TextClassification;->getLabel()Ljava/lang/CharSequence;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-nez v4, :cond_9

    .line 255
    .line 256
    :cond_7
    invoke-virtual {v7}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-nez v4, :cond_8

    .line 261
    .line 262
    invoke-virtual {v7}, Landroid/view/textclassifier/TextClassification;->getOnClickListener()Landroid/view/View$OnClickListener;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    if-eqz v4, :cond_9

    .line 267
    .line 268
    :cond_8
    new-instance v4, Ldz2;

    .line 269
    .line 270
    const/4 v6, -0x1

    .line 271
    invoke-direct {v4, v11, v7, v6}, Ldz2;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    .line 272
    .line 273
    .line 274
    iget-object v6, v0, Loy2;->a:Llk1;

    .line 275
    .line 276
    invoke-virtual {v6, v4}, Llk1;->a(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    :cond_9
    :goto_5
    invoke-virtual {v5, v0}, Lm0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    invoke-static {v7}, Lp90;->p(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    const/4 v10, 0x0

    .line 291
    :goto_6
    if-ge v10, v5, :cond_b

    .line 292
    .line 293
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    check-cast v6, Landroid/app/RemoteAction;

    .line 298
    .line 299
    if-lez v10, :cond_a

    .line 300
    .line 301
    new-instance v6, Ldz2;

    .line 302
    .line 303
    invoke-direct {v6, v11, v7, v10}, Ldz2;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    .line 304
    .line 305
    .line 306
    iget-object v9, v0, Loy2;->a:Llk1;

    .line 307
    .line 308
    invoke-virtual {v9, v6}, Llk1;->a(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_b
    :goto_7
    iget-wide v4, v8, Lf13;->a:J

    .line 315
    .line 316
    invoke-static/range {v0 .. v5}, Lte;->l(Loy2;Landroid/content/Context;ZLjava/lang/String;J)V

    .line 317
    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_c
    :goto_8
    invoke-virtual {v5, v0}, Lm0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    if-eqz v3, :cond_d

    .line 324
    .line 325
    if-eqz v8, :cond_d

    .line 326
    .line 327
    iget-wide v4, v8, Lf13;->a:J

    .line 328
    .line 329
    invoke-static/range {v0 .. v5}, Lte;->l(Loy2;Landroid/content/Context;ZLjava/lang/String;J)V

    .line 330
    .line 331
    .line 332
    :cond_d
    :goto_9
    return-object v12

    .line 333
    :pswitch_2
    check-cast v14, Lgd3;

    .line 334
    .line 335
    check-cast v13, Landroid/graphics/drawable/Drawable;

    .line 336
    .line 337
    move-object/from16 v0, p1

    .line 338
    .line 339
    check-cast v0, Lpx;

    .line 340
    .line 341
    check-cast v1, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-static {v5}, Lpp0;->N(I)I

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    invoke-virtual {v14, v13, v0, v1}, Lgd3;->a(Landroid/graphics/drawable/Drawable;Lpx;I)V

    .line 351
    .line 352
    .line 353
    return-object v12

    .line 354
    :pswitch_3
    check-cast v14, Luh1;

    .line 355
    .line 356
    check-cast v13, Lkw;

    .line 357
    .line 358
    move-object/from16 v0, p1

    .line 359
    .line 360
    check-cast v0, Lpx;

    .line 361
    .line 362
    check-cast v1, Ljava/lang/Integer;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {v5}, Lpp0;->N(I)I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    invoke-static {v14, v13, v0, v1}, Lrg3;->h(Luh1;Lkw;Lpx;I)V

    .line 372
    .line 373
    .line 374
    return-object v12

    .line 375
    :pswitch_4
    check-cast v14, Ljd2;

    .line 376
    .line 377
    check-cast v13, Lyk2;

    .line 378
    .line 379
    move-object/from16 v0, p1

    .line 380
    .line 381
    check-cast v0, Landroid/app/Activity;

    .line 382
    .line 383
    check-cast v1, Lin0;

    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 392
    .line 393
    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 394
    .line 395
    .line 396
    iget-object v0, v14, Ljd2;->a:Ljava/lang/String;

    .line 397
    .line 398
    if-nez v0, :cond_e

    .line 399
    .line 400
    iget-object v0, v13, Lyk2;->b:Ljava/lang/String;

    .line 401
    .line 402
    :cond_e
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    sget-object v2, Lar1;->h:Lar1;

    .line 407
    .line 408
    iget-object v2, v14, Ljd2;->b:Ljava/lang/String;

    .line 409
    .line 410
    iget-object v5, v13, Lyk2;->b:Ljava/lang/String;

    .line 411
    .line 412
    new-instance v6, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-object v2, v14, Ljd2;->c:Ljava/lang/String;

    .line 435
    .line 436
    new-instance v3, Lvq1;

    .line 437
    .line 438
    const/4 v15, 0x0

    .line 439
    invoke-direct {v3, v1, v15}, Lvq1;-><init>(Lin0;I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    new-instance v2, Lwq1;

    .line 447
    .line 448
    invoke-direct {v2, v1, v15}, Lwq1;-><init>(Lin0;I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    return-object v0

    .line 463
    :pswitch_5
    check-cast v14, Lxf2;

    .line 464
    .line 465
    check-cast v13, Lyk2;

    .line 466
    .line 467
    move-object/from16 v0, p1

    .line 468
    .line 469
    check-cast v0, Landroid/app/Activity;

    .line 470
    .line 471
    check-cast v1, Lin0;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    new-instance v2, Landroid/app/AlertDialog$Builder;

    .line 480
    .line 481
    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 482
    .line 483
    .line 484
    iget-object v0, v14, Lxf2;->a:Ljava/lang/String;

    .line 485
    .line 486
    if-nez v0, :cond_f

    .line 487
    .line 488
    iget-object v0, v13, Lyk2;->b:Ljava/lang/String;

    .line 489
    .line 490
    :cond_f
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    sget-object v2, Lar1;->h:Lar1;

    .line 495
    .line 496
    iget-object v2, v14, Lxf2;->b:Ljava/lang/String;

    .line 497
    .line 498
    iget-object v5, v13, Lyk2;->b:Ljava/lang/String;

    .line 499
    .line 500
    new-instance v6, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    iget-object v2, v14, Lxf2;->c:Ljava/lang/String;

    .line 523
    .line 524
    new-instance v3, Lvq1;

    .line 525
    .line 526
    invoke-direct {v3, v1, v11}, Lvq1;-><init>(Lin0;I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    iget-object v2, v14, Lxf2;->d:Ljava/lang/String;

    .line 534
    .line 535
    new-instance v3, Lvq1;

    .line 536
    .line 537
    invoke-direct {v3, v1, v9}, Lvq1;-><init>(Lin0;I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    new-instance v2, Lwq1;

    .line 545
    .line 546
    invoke-direct {v2, v1, v11}, Lwq1;-><init>(Lin0;I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    return-object v0

    .line 561
    :pswitch_6
    check-cast v14, Lkw;

    .line 562
    .line 563
    check-cast v13, Lg91;

    .line 564
    .line 565
    move-object/from16 v0, p1

    .line 566
    .line 567
    check-cast v0, Lpx;

    .line 568
    .line 569
    check-cast v1, Ljava/lang/Integer;

    .line 570
    .line 571
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    and-int/lit8 v2, v1, 0x3

    .line 576
    .line 577
    if-eq v2, v9, :cond_10

    .line 578
    .line 579
    move v2, v11

    .line 580
    goto :goto_a

    .line 581
    :cond_10
    const/4 v2, 0x0

    .line 582
    :goto_a
    and-int/2addr v1, v11

    .line 583
    check-cast v0, Lgo0;

    .line 584
    .line 585
    invoke-virtual {v0, v1, v2}, Lgo0;->O(IZ)Z

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    if-eqz v1, :cond_11

    .line 590
    .line 591
    const/4 v15, 0x0

    .line 592
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-virtual {v14, v13, v0, v1}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    goto :goto_b

    .line 600
    :cond_11
    invoke-virtual {v0}, Lgo0;->R()V

    .line 601
    .line 602
    .line 603
    :goto_b
    return-object v12

    .line 604
    :pswitch_7
    invoke-direct/range {p0 .. p2}, Laf;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    return-object v0

    .line 609
    :pswitch_8
    check-cast v14, Lz71;

    .line 610
    .line 611
    check-cast v13, Ly71;

    .line 612
    .line 613
    iget-object v3, v13, Ly71;->a:Ljava/lang/Object;

    .line 614
    .line 615
    move-object/from16 v0, p1

    .line 616
    .line 617
    check-cast v0, Lpx;

    .line 618
    .line 619
    check-cast v1, Ljava/lang/Integer;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    and-int/lit8 v2, v1, 0x3

    .line 626
    .line 627
    if-eq v2, v9, :cond_12

    .line 628
    .line 629
    move v2, v11

    .line 630
    goto :goto_c

    .line 631
    :cond_12
    const/4 v2, 0x0

    .line 632
    :goto_c
    and-int/2addr v1, v11

    .line 633
    move-object v4, v0

    .line 634
    check-cast v4, Lgo0;

    .line 635
    .line 636
    invoke-virtual {v4, v1, v2}, Lgo0;->O(IZ)Z

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    if-eqz v0, :cond_19

    .line 641
    .line 642
    iget-object v0, v14, Lz71;->b:Lf0;

    .line 643
    .line 644
    invoke-virtual {v0}, Lf0;->a()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    check-cast v0, Lt81;

    .line 649
    .line 650
    iget v1, v13, Ly71;->c:I

    .line 651
    .line 652
    invoke-virtual {v0}, Lt81;->c()I

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    if-ge v1, v2, :cond_15

    .line 657
    .line 658
    invoke-virtual {v0, v1}, Lt81;->d(I)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v2

    .line 666
    if-nez v2, :cond_13

    .line 667
    .line 668
    goto :goto_e

    .line 669
    :cond_13
    const/4 v6, -0x1

    .line 670
    :cond_14
    :goto_d
    move v2, v1

    .line 671
    goto :goto_f

    .line 672
    :cond_15
    :goto_e
    iget-object v1, v0, Lt81;->d:Le9;

    .line 673
    .line 674
    invoke-virtual {v1, v3}, Le9;->g(Ljava/lang/Object;)I

    .line 675
    .line 676
    .line 677
    move-result v1

    .line 678
    const/4 v6, -0x1

    .line 679
    if-eq v1, v6, :cond_14

    .line 680
    .line 681
    iput v1, v13, Ly71;->c:I

    .line 682
    .line 683
    goto :goto_d

    .line 684
    :goto_f
    if-eq v2, v6, :cond_16

    .line 685
    .line 686
    const v1, -0x6339ef97

    .line 687
    .line 688
    .line 689
    invoke-virtual {v4, v1}, Lgo0;->W(I)V

    .line 690
    .line 691
    .line 692
    iget-object v1, v14, Lz71;->a:Lcc2;

    .line 693
    .line 694
    const/4 v5, 0x0

    .line 695
    invoke-static/range {v0 .. v5}, Lse;->s(Lt81;Ljava/lang/Object;ILjava/lang/Object;Lpx;I)V

    .line 696
    .line 697
    .line 698
    const/4 v15, 0x0

    .line 699
    invoke-virtual {v4, v15}, Lgo0;->p(Z)V

    .line 700
    .line 701
    .line 702
    goto :goto_10

    .line 703
    :cond_16
    const/4 v15, 0x0

    .line 704
    const v0, -0x633657e2

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4, v0}, Lgo0;->W(I)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v4, v15}, Lgo0;->p(Z)V

    .line 711
    .line 712
    .line 713
    :goto_10
    invoke-virtual {v4, v13}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    if-nez v0, :cond_17

    .line 722
    .line 723
    if-ne v1, v8, :cond_18

    .line 724
    .line 725
    :cond_17
    new-instance v1, Lv;

    .line 726
    .line 727
    const/16 v0, 0xb

    .line 728
    .line 729
    invoke-direct {v1, v0, v13}, Lv;-><init>(ILjava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v4, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    :cond_18
    check-cast v1, Lin0;

    .line 736
    .line 737
    invoke-static {v3, v1, v4}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 738
    .line 739
    .line 740
    goto :goto_11

    .line 741
    :cond_19
    invoke-virtual {v4}, Lgo0;->R()V

    .line 742
    .line 743
    .line 744
    :goto_11
    return-object v12

    .line 745
    :pswitch_9
    check-cast v13, Ljava/util/List;

    .line 746
    .line 747
    check-cast v14, Lin0;

    .line 748
    .line 749
    move-object/from16 v0, p1

    .line 750
    .line 751
    check-cast v0, Lpx;

    .line 752
    .line 753
    check-cast v1, Ljava/lang/Integer;

    .line 754
    .line 755
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    invoke-static {v11}, Lpp0;->N(I)I

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    invoke-static {v13, v14, v0, v1}, Ls11;->i(Ljava/util/List;Lin0;Lpx;I)V

    .line 763
    .line 764
    .line 765
    return-object v12

    .line 766
    :pswitch_a
    check-cast v14, Lxt0;

    .line 767
    .line 768
    move-object/from16 v23, v13

    .line 769
    .line 770
    check-cast v23, Lxm0;

    .line 771
    .line 772
    move-object/from16 v0, p1

    .line 773
    .line 774
    check-cast v0, Lpx;

    .line 775
    .line 776
    check-cast v1, Ljava/lang/Integer;

    .line 777
    .line 778
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    and-int/lit8 v2, v1, 0x3

    .line 783
    .line 784
    if-eq v2, v9, :cond_1a

    .line 785
    .line 786
    move v2, v11

    .line 787
    goto :goto_12

    .line 788
    :cond_1a
    const/4 v2, 0x0

    .line 789
    :goto_12
    and-int/2addr v1, v11

    .line 790
    check-cast v0, Lgo0;

    .line 791
    .line 792
    invoke-virtual {v0, v1, v2}, Lgo0;->O(IZ)Z

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    if-eqz v1, :cond_1b

    .line 797
    .line 798
    iget-object v1, v14, Lxt0;->b:Ljava/lang/String;

    .line 799
    .line 800
    iget-object v2, v14, Lxt0;->e:Ljava/lang/String;

    .line 801
    .line 802
    iget-object v3, v14, Lxt0;->a:Lvj;

    .line 803
    .line 804
    invoke-virtual {v3}, Lvj;->d()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v3

    .line 808
    new-instance v4, Ljava/lang/StringBuilder;

    .line 809
    .line 810
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    const-string v2, "\n"

    .line 817
    .line 818
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v18

    .line 828
    new-instance v2, Lvt0;

    .line 829
    .line 830
    const/4 v15, 0x0

    .line 831
    invoke-direct {v2, v14, v15}, Lvt0;-><init>(Lxt0;I)V

    .line 832
    .line 833
    .line 834
    const v3, -0x2fe037d5

    .line 835
    .line 836
    .line 837
    invoke-static {v3, v2, v0}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 838
    .line 839
    .line 840
    move-result-object v19

    .line 841
    new-instance v2, Lvt0;

    .line 842
    .line 843
    invoke-direct {v2, v14, v11}, Lvt0;-><init>(Lxt0;I)V

    .line 844
    .line 845
    .line 846
    const v3, -0x6de1cfd4

    .line 847
    .line 848
    .line 849
    invoke-static {v3, v2, v0}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 850
    .line 851
    .line 852
    move-result-object v20

    .line 853
    const/16 v26, 0x6c00

    .line 854
    .line 855
    const/16 v27, 0x162

    .line 856
    .line 857
    const/16 v17, 0x0

    .line 858
    .line 859
    const/16 v21, 0x0

    .line 860
    .line 861
    const/16 v22, 0x0

    .line 862
    .line 863
    const/16 v24, 0x0

    .line 864
    .line 865
    move-object/from16 v25, v0

    .line 866
    .line 867
    move-object/from16 v16, v1

    .line 868
    .line 869
    invoke-static/range {v16 .. v27}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 870
    .line 871
    .line 872
    goto :goto_13

    .line 873
    :cond_1b
    move-object/from16 v25, v0

    .line 874
    .line 875
    invoke-virtual/range {v25 .. v25}, Lgo0;->R()V

    .line 876
    .line 877
    .line 878
    :goto_13
    return-object v12

    .line 879
    :pswitch_b
    check-cast v14, Lrs2;

    .line 880
    .line 881
    check-cast v13, Lmn0;

    .line 882
    .line 883
    move-object/from16 v0, p1

    .line 884
    .line 885
    check-cast v0, Lgx2;

    .line 886
    .line 887
    check-cast v1, Ljava/lang/Boolean;

    .line 888
    .line 889
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v0}, Lvj;->d()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    invoke-virtual {v14, v2, v1}, Lrs2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    invoke-interface {v13, v0, v1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    return-object v12

    .line 906
    :pswitch_c
    check-cast v14, Landroid/content/Context;

    .line 907
    .line 908
    check-cast v13, Lmn0;

    .line 909
    .line 910
    move-object/from16 v2, p1

    .line 911
    .line 912
    check-cast v2, Lyp2;

    .line 913
    .line 914
    check-cast v1, Lrs1;

    .line 915
    .line 916
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    iget v0, v2, Lyp2;->a:I

    .line 920
    .line 921
    const v3, 0x790b0144

    .line 922
    .line 923
    .line 924
    if-ne v0, v3, :cond_1c

    .line 925
    .line 926
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 930
    .line 931
    const-string v3, "com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI"

    .line 932
    .line 933
    invoke-static {v3}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    invoke-direct {v0, v14, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 938
    .line 939
    .line 940
    const-string v3, "key_web_url"

    .line 941
    .line 942
    const-string v4, ""

    .line 943
    .line 944
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 945
    .line 946
    .line 947
    const-string v3, "key_scene"

    .line 948
    .line 949
    invoke-virtual {v0, v3, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 950
    .line 951
    .line 952
    const-string v3, "key_send_type"

    .line 953
    .line 954
    invoke-virtual {v0, v3, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 955
    .line 956
    .line 957
    const-string v3, "KEY_HOME_PAGE_CLS"

    .line 958
    .line 959
    const-string v4, "com.tencent.mm.ui.LauncherUI"

    .line 960
    .line 961
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 962
    .line 963
    .line 964
    const-string v3, "key_chat_type"

    .line 965
    .line 966
    const/4 v4, 0x3

    .line 967
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 968
    .line 969
    .line 970
    const-string v3, "key_channel"

    .line 971
    .line 972
    const/16 v4, 0xd

    .line 973
    .line 974
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 975
    .line 976
    .line 977
    const-string v3, "key_qrcode_url"

    .line 978
    .line 979
    const-string v4, "m0x1\'W:GZO0Tv5_f;1W0Op"

    .line 980
    .line 981
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 982
    .line 983
    .line 984
    invoke-virtual {v14, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 985
    .line 986
    .line 987
    move-object v3, v12

    .line 988
    goto :goto_14

    .line 989
    :catchall_0
    move-exception v0

    .line 990
    new-instance v3, Lx92;

    .line 991
    .line 992
    invoke-direct {v3, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 993
    .line 994
    .line 995
    :goto_14
    instance-of v0, v3, Lx92;

    .line 996
    .line 997
    if-eqz v0, :cond_1d

    .line 998
    .line 999
    :cond_1c
    invoke-interface {v13, v2, v1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    :cond_1d
    return-object v12

    .line 1003
    :pswitch_d
    check-cast v14, Ljava/util/List;

    .line 1004
    .line 1005
    check-cast v13, Lmn0;

    .line 1006
    .line 1007
    move-object/from16 v0, p1

    .line 1008
    .line 1009
    check-cast v0, Lpx;

    .line 1010
    .line 1011
    check-cast v1, Ljava/lang/Integer;

    .line 1012
    .line 1013
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    and-int/lit8 v2, v1, 0x3

    .line 1018
    .line 1019
    if-eq v2, v9, :cond_1e

    .line 1020
    .line 1021
    move v2, v11

    .line 1022
    goto :goto_15

    .line 1023
    :cond_1e
    const/4 v2, 0x0

    .line 1024
    :goto_15
    and-int/2addr v1, v11

    .line 1025
    check-cast v0, Lgo0;

    .line 1026
    .line 1027
    invoke-virtual {v0, v1, v2}, Lgo0;->O(IZ)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v1

    .line 1031
    if-eqz v1, :cond_24

    .line 1032
    .line 1033
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v1

    .line 1037
    const/4 v2, 0x0

    .line 1038
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v3

    .line 1042
    if-eqz v3, :cond_25

    .line 1043
    .line 1044
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    add-int/lit8 v4, v2, 0x1

    .line 1049
    .line 1050
    if-ltz v2, :cond_23

    .line 1051
    .line 1052
    check-cast v3, Lyp2;

    .line 1053
    .line 1054
    iget v5, v3, Lyp2;->a:I

    .line 1055
    .line 1056
    invoke-static {v5, v0}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v18

    .line 1060
    new-instance v5, Ls9;

    .line 1061
    .line 1062
    const/16 v6, 0x9

    .line 1063
    .line 1064
    invoke-direct {v5, v6, v3}, Ls9;-><init>(ILjava/lang/Object;)V

    .line 1065
    .line 1066
    .line 1067
    const v6, 0x1ec6ff72

    .line 1068
    .line 1069
    .line 1070
    invoke-static {v6, v5, v0}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v22

    .line 1074
    iget-object v5, v3, Lyp2;->d:Ljava/lang/String;

    .line 1075
    .line 1076
    iget-boolean v6, v3, Lyp2;->e:Z

    .line 1077
    .line 1078
    if-eqz v6, :cond_1f

    .line 1079
    .line 1080
    const-wide v6, 0xffdc2626L

    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    invoke-static {v6, v7}, Lsp0;->c(J)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v6

    .line 1089
    new-instance v9, Lju;

    .line 1090
    .line 1091
    invoke-direct {v9, v6, v7}, Lju;-><init>(J)V

    .line 1092
    .line 1093
    .line 1094
    move-object/from16 v24, v9

    .line 1095
    .line 1096
    goto :goto_17

    .line 1097
    :cond_1f
    const/16 v24, 0x0

    .line 1098
    .line 1099
    :goto_17
    invoke-virtual {v0, v13}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v6

    .line 1103
    invoke-virtual {v0, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v7

    .line 1107
    or-int/2addr v6, v7

    .line 1108
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v7

    .line 1112
    if-nez v6, :cond_20

    .line 1113
    .line 1114
    if-ne v7, v8, :cond_21

    .line 1115
    .line 1116
    :cond_20
    new-instance v7, Ld2;

    .line 1117
    .line 1118
    const/16 v6, 0xf

    .line 1119
    .line 1120
    invoke-direct {v7, v6, v13, v3}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v0, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1124
    .line 1125
    .line 1126
    :cond_21
    move-object/from16 v26, v7

    .line 1127
    .line 1128
    check-cast v26, Lin0;

    .line 1129
    .line 1130
    const/16 v28, 0x6000

    .line 1131
    .line 1132
    const/16 v29, 0x8e

    .line 1133
    .line 1134
    const/16 v19, 0x0

    .line 1135
    .line 1136
    const/16 v20, 0x0

    .line 1137
    .line 1138
    const/16 v21, 0x0

    .line 1139
    .line 1140
    const/16 v25, 0x0

    .line 1141
    .line 1142
    move-object/from16 v27, v0

    .line 1143
    .line 1144
    move-object/from16 v23, v5

    .line 1145
    .line 1146
    invoke-static/range {v18 .. v29}, Lqp0;->h(Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Lmn0;Ljava/lang/String;Lju;ZLin0;Lpx;II)V

    .line 1147
    .line 1148
    .line 1149
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1150
    .line 1151
    .line 1152
    move-result v3

    .line 1153
    sub-int/2addr v3, v11

    .line 1154
    if-ge v2, v3, :cond_22

    .line 1155
    .line 1156
    const v2, -0x56fb9ba8

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v0, v2}, Lgo0;->W(I)V

    .line 1160
    .line 1161
    .line 1162
    const/high16 v2, 0x42800000    # 64.0f

    .line 1163
    .line 1164
    const/4 v3, 0x6

    .line 1165
    const/4 v15, 0x0

    .line 1166
    invoke-static {v2, v0, v3, v15}, Lci0;->f(FLpx;II)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v0, v15}, Lgo0;->p(Z)V

    .line 1170
    .line 1171
    .line 1172
    goto :goto_18

    .line 1173
    :cond_22
    const/4 v15, 0x0

    .line 1174
    const v2, -0x56faa7a7

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v0, v2}, Lgo0;->W(I)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v0, v15}, Lgo0;->p(Z)V

    .line 1181
    .line 1182
    .line 1183
    :goto_18
    move v2, v4

    .line 1184
    goto/16 :goto_16

    .line 1185
    .line 1186
    :cond_23
    invoke-static {}, Leu;->a0()V

    .line 1187
    .line 1188
    .line 1189
    const/16 v17, 0x0

    .line 1190
    .line 1191
    throw v17

    .line 1192
    :cond_24
    invoke-virtual {v0}, Lgo0;->R()V

    .line 1193
    .line 1194
    .line 1195
    :cond_25
    return-object v12

    .line 1196
    :pswitch_e
    check-cast v14, Ljava/util/Map;

    .line 1197
    .line 1198
    check-cast v13, Lxk1;

    .line 1199
    .line 1200
    move-object/from16 v0, p1

    .line 1201
    .line 1202
    check-cast v0, Lgx2;

    .line 1203
    .line 1204
    check-cast v1, Ljava/lang/Boolean;

    .line 1205
    .line 1206
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1207
    .line 1208
    .line 1209
    move-result v1

    .line 1210
    invoke-static {v14, v13, v0, v1}, Lnuke/ui/HomeActivity;->p(Ljava/util/Map;Lxk1;Lgx2;Z)La83;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    return-object v0

    .line 1215
    :pswitch_f
    check-cast v14, Lz72;

    .line 1216
    .line 1217
    check-cast v13, Ltr2;

    .line 1218
    .line 1219
    move-object/from16 v0, p1

    .line 1220
    .line 1221
    check-cast v0, Ljava/lang/Integer;

    .line 1222
    .line 1223
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    instance-of v2, v1, Luw;

    .line 1228
    .line 1229
    if-eqz v2, :cond_26

    .line 1230
    .line 1231
    move-object v0, v1

    .line 1232
    check-cast v0, Luw;

    .line 1233
    .line 1234
    iget-object v1, v14, Lz72;->f:Lzk1;

    .line 1235
    .line 1236
    invoke-virtual {v1, v0}, Lzk1;->b(Ljava/lang/Object;)V

    .line 1237
    .line 1238
    .line 1239
    goto :goto_19

    .line 1240
    :cond_26
    instance-of v2, v1, Lba2;

    .line 1241
    .line 1242
    if-nez v2, :cond_28

    .line 1243
    .line 1244
    instance-of v2, v1, Llo0;

    .line 1245
    .line 1246
    if-eqz v2, :cond_27

    .line 1247
    .line 1248
    invoke-static {v13, v0, v1}, Lp7;->K(Ltr2;ILjava/lang/Object;)V

    .line 1249
    .line 1250
    .line 1251
    move-object v0, v1

    .line 1252
    check-cast v0, Llo0;

    .line 1253
    .line 1254
    invoke-virtual {v14, v0}, Lz72;->e(Llo0;)V

    .line 1255
    .line 1256
    .line 1257
    goto :goto_19

    .line 1258
    :cond_27
    instance-of v2, v1, Lb62;

    .line 1259
    .line 1260
    if-eqz v2, :cond_28

    .line 1261
    .line 1262
    invoke-static {v13, v0, v1}, Lp7;->K(Ltr2;ILjava/lang/Object;)V

    .line 1263
    .line 1264
    .line 1265
    move-object v0, v1

    .line 1266
    check-cast v0, Lb62;

    .line 1267
    .line 1268
    invoke-virtual {v0}, Lb62;->c()V

    .line 1269
    .line 1270
    .line 1271
    :cond_28
    :goto_19
    return-object v12

    .line 1272
    :pswitch_10
    check-cast v14, La72;

    .line 1273
    .line 1274
    check-cast v13, Lb72;

    .line 1275
    .line 1276
    move-object/from16 v0, p1

    .line 1277
    .line 1278
    check-cast v0, Ljava/lang/Long;

    .line 1279
    .line 1280
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1281
    .line 1282
    .line 1283
    move-result-wide v2

    .line 1284
    move-object v0, v1

    .line 1285
    check-cast v0, Ljava/lang/Long;

    .line 1286
    .line 1287
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1288
    .line 1289
    .line 1290
    move-result-wide v0

    .line 1291
    sget-object v4, Lte;->a:Lsz0;

    .line 1292
    .line 1293
    const-wide/16 v5, 0x0

    .line 1294
    .line 1295
    cmp-long v5, v0, v5

    .line 1296
    .line 1297
    if-lez v5, :cond_29

    .line 1298
    .line 1299
    const-wide/16 v5, 0x64

    .line 1300
    .line 1301
    mul-long/2addr v5, v2

    .line 1302
    div-long/2addr v5, v0

    .line 1303
    long-to-int v5, v5

    .line 1304
    const/16 v6, 0x64

    .line 1305
    .line 1306
    const/4 v15, 0x0

    .line 1307
    invoke-static {v5, v15, v6}, Lci0;->D(III)I

    .line 1308
    .line 1309
    .line 1310
    move-result v5

    .line 1311
    iget v6, v14, La72;->h:I

    .line 1312
    .line 1313
    if-eq v5, v6, :cond_2a

    .line 1314
    .line 1315
    iput v5, v14, La72;->h:I

    .line 1316
    .line 1317
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v6

    .line 1321
    invoke-static {v2, v3}, Lte;->A(J)Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v2

    .line 1325
    invoke-static {v0, v1}, Lte;->A(J)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    filled-new-array {v6, v2, v0}, [Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    const v1, 0x790b01d2

    .line 1334
    .line 1335
    .line 1336
    invoke-static {v1, v0}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    int-to-float v1, v5

    .line 1341
    const/high16 v2, 0x42c80000    # 100.0f

    .line 1342
    .line 1343
    div-float/2addr v1, v2

    .line 1344
    const/high16 v2, 0x3e800000    # 0.25f

    .line 1345
    .line 1346
    mul-float/2addr v1, v2

    .line 1347
    const v2, 0x3d4ccccd    # 0.05f

    .line 1348
    .line 1349
    .line 1350
    add-float/2addr v1, v2

    .line 1351
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v1

    .line 1355
    invoke-virtual {v4, v0, v1}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1356
    .line 1357
    .line 1358
    goto :goto_1a

    .line 1359
    :cond_29
    const-wide/32 v0, 0x100000

    .line 1360
    .line 1361
    .line 1362
    div-long v0, v2, v0

    .line 1363
    .line 1364
    iget-wide v5, v13, Lb72;->h:J

    .line 1365
    .line 1366
    cmp-long v5, v0, v5

    .line 1367
    .line 1368
    if-eqz v5, :cond_2a

    .line 1369
    .line 1370
    iput-wide v0, v13, Lb72;->h:J

    .line 1371
    .line 1372
    invoke-static {v2, v3}, Lte;->A(J)Ljava/lang/String;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v0

    .line 1376
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v0

    .line 1380
    const v1, 0x790b01d3

    .line 1381
    .line 1382
    .line 1383
    invoke-static {v1, v0}, Lte;->j0(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    const v1, 0x3da3d70a    # 0.08f

    .line 1388
    .line 1389
    .line 1390
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    invoke-virtual {v4, v0, v1}, Lsz0;->N(Ljava/lang/String;Ljava/lang/Float;)V

    .line 1395
    .line 1396
    .line 1397
    :cond_2a
    :goto_1a
    return-object v12

    .line 1398
    :pswitch_11
    check-cast v14, Lcz2;

    .line 1399
    .line 1400
    check-cast v13, Lqy2;

    .line 1401
    .line 1402
    move-object/from16 v0, p1

    .line 1403
    .line 1404
    check-cast v0, Lpx;

    .line 1405
    .line 1406
    check-cast v1, Ljava/lang/Integer;

    .line 1407
    .line 1408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    invoke-static {v11}, Lpp0;->N(I)I

    .line 1412
    .line 1413
    .line 1414
    move-result v1

    .line 1415
    invoke-static {v14, v13, v0, v1}, Lk60;->a(Lcz2;Lqy2;Lpx;I)V

    .line 1416
    .line 1417
    .line 1418
    return-object v12

    .line 1419
    :pswitch_12
    move-object v4, v14

    .line 1420
    check-cast v4, Lry2;

    .line 1421
    .line 1422
    check-cast v13, Lcz2;

    .line 1423
    .line 1424
    move-object/from16 v0, p1

    .line 1425
    .line 1426
    check-cast v0, Lpx;

    .line 1427
    .line 1428
    check-cast v1, Ljava/lang/Integer;

    .line 1429
    .line 1430
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1431
    .line 1432
    .line 1433
    move-result v1

    .line 1434
    and-int/lit8 v2, v1, 0x3

    .line 1435
    .line 1436
    if-eq v2, v9, :cond_2b

    .line 1437
    .line 1438
    move v2, v11

    .line 1439
    goto :goto_1b

    .line 1440
    :cond_2b
    const/4 v2, 0x0

    .line 1441
    :goto_1b
    and-int/2addr v1, v11

    .line 1442
    check-cast v0, Lgo0;

    .line 1443
    .line 1444
    invoke-virtual {v0, v1, v2}, Lgo0;->O(IZ)Z

    .line 1445
    .line 1446
    .line 1447
    move-result v1

    .line 1448
    if-eqz v1, :cond_2e

    .line 1449
    .line 1450
    invoke-virtual {v0, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1451
    .line 1452
    .line 1453
    move-result v1

    .line 1454
    invoke-virtual {v0}, Lgo0;->L()Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v2

    .line 1458
    if-nez v1, :cond_2c

    .line 1459
    .line 1460
    if-ne v2, v8, :cond_2d

    .line 1461
    .line 1462
    :cond_2c
    new-instance v2, Lr6;

    .line 1463
    .line 1464
    const/4 v9, 0x0

    .line 1465
    const/4 v10, 0x1

    .line 1466
    const/4 v3, 0x0

    .line 1467
    const-class v5, Lry2;

    .line 1468
    .line 1469
    const-string v6, "data"

    .line 1470
    .line 1471
    const-string v7, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"

    .line 1472
    .line 1473
    const/4 v8, 0x0

    .line 1474
    invoke-direct/range {v2 .. v10}, Lr6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1475
    .line 1476
    .line 1477
    invoke-static {v2}, Lop0;->m(Lxm0;)Ln70;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    invoke-virtual {v0, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1482
    .line 1483
    .line 1484
    :cond_2d
    check-cast v2, Lgu2;

    .line 1485
    .line 1486
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v1

    .line 1490
    check-cast v1, Lqy2;

    .line 1491
    .line 1492
    const/4 v15, 0x0

    .line 1493
    invoke-static {v13, v1, v0, v15}, Lk60;->a(Lcz2;Lqy2;Lpx;I)V

    .line 1494
    .line 1495
    .line 1496
    goto :goto_1c

    .line 1497
    :cond_2e
    invoke-virtual {v0}, Lgo0;->R()V

    .line 1498
    .line 1499
    .line 1500
    :goto_1c
    return-object v12

    .line 1501
    :pswitch_13
    check-cast v14, Ln00;

    .line 1502
    .line 1503
    check-cast v13, Lm00;

    .line 1504
    .line 1505
    move-object/from16 v0, p1

    .line 1506
    .line 1507
    check-cast v0, Lpx;

    .line 1508
    .line 1509
    check-cast v1, Ljava/lang/Integer;

    .line 1510
    .line 1511
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1512
    .line 1513
    .line 1514
    invoke-static {v11}, Lpp0;->N(I)I

    .line 1515
    .line 1516
    .line 1517
    move-result v1

    .line 1518
    invoke-virtual {v14, v13, v0, v1}, Ln00;->a(Lm00;Lpx;I)V

    .line 1519
    .line 1520
    .line 1521
    return-object v12

    .line 1522
    :pswitch_14
    const/4 v15, 0x0

    .line 1523
    check-cast v13, Lzq;

    .line 1524
    .line 1525
    check-cast v14, Lin0;

    .line 1526
    .line 1527
    move-object/from16 v0, p1

    .line 1528
    .line 1529
    check-cast v0, Lpx;

    .line 1530
    .line 1531
    check-cast v1, Ljava/lang/Integer;

    .line 1532
    .line 1533
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1534
    .line 1535
    .line 1536
    move-result v1

    .line 1537
    and-int/lit8 v2, v1, 0x3

    .line 1538
    .line 1539
    if-eq v2, v9, :cond_2f

    .line 1540
    .line 1541
    move v10, v11

    .line 1542
    goto :goto_1d

    .line 1543
    :cond_2f
    move v10, v15

    .line 1544
    :goto_1d
    and-int/2addr v1, v11

    .line 1545
    move-object v5, v0

    .line 1546
    check-cast v5, Lgo0;

    .line 1547
    .line 1548
    invoke-virtual {v5, v1, v10}, Lgo0;->O(IZ)Z

    .line 1549
    .line 1550
    .line 1551
    move-result v0

    .line 1552
    if-eqz v0, :cond_30

    .line 1553
    .line 1554
    iget-boolean v0, v13, Lzq;->c:Z

    .line 1555
    .line 1556
    const/4 v10, 0x0

    .line 1557
    const/16 v11, 0xb

    .line 1558
    .line 1559
    sget-object v6, Lrh1;->a:Lrh1;

    .line 1560
    .line 1561
    const/4 v7, 0x0

    .line 1562
    const/4 v8, 0x0

    .line 1563
    const/high16 v9, 0x41600000    # 14.0f

    .line 1564
    .line 1565
    invoke-static/range {v6 .. v11}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v2

    .line 1569
    const/16 v6, 0x180

    .line 1570
    .line 1571
    const/16 v7, 0x38

    .line 1572
    .line 1573
    const/4 v3, 0x0

    .line 1574
    const/4 v4, 0x0

    .line 1575
    move-object v1, v14

    .line 1576
    invoke-static/range {v0 .. v7}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 1577
    .line 1578
    .line 1579
    goto :goto_1e

    .line 1580
    :cond_30
    invoke-virtual {v5}, Lgo0;->R()V

    .line 1581
    .line 1582
    .line 1583
    :goto_1e
    return-object v12

    .line 1584
    :pswitch_15
    check-cast v14, Lin0;

    .line 1585
    .line 1586
    check-cast v13, Lin0;

    .line 1587
    .line 1588
    move-object/from16 v0, p1

    .line 1589
    .line 1590
    check-cast v0, Lpx;

    .line 1591
    .line 1592
    check-cast v1, Ljava/lang/Integer;

    .line 1593
    .line 1594
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1595
    .line 1596
    .line 1597
    invoke-static {v11}, Lpp0;->N(I)I

    .line 1598
    .line 1599
    .line 1600
    move-result v1

    .line 1601
    invoke-static {v14, v13, v0, v1}, Lse;->g(Lin0;Lin0;Lpx;I)V

    .line 1602
    .line 1603
    .line 1604
    return-object v12

    .line 1605
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
