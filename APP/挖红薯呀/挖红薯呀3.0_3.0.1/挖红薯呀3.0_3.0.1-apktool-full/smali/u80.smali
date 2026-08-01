.class public final Lu80;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lr70;


# instance fields
.field public final synthetic a:Lc90;

.field public final synthetic b:Ljn0;

.field public final synthetic c:Lhw;

.field public final synthetic d:Lu8;

.field public final synthetic e:Lyk;

.field public final synthetic f:Ljo0;

.field public final synthetic g:Lga;


# direct methods
.method public constructor <init>(Lc90;Ljn0;Lx70;Lu8;Lyk;Lux;Ljo0;Lga;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu80;->a:Lc90;

    .line 5
    .line 6
    iput-object p2, p0, Lu80;->b:Ljn0;

    .line 7
    .line 8
    iput-object p3, p0, Lu80;->c:Lhw;

    .line 9
    .line 10
    iput-object p4, p0, Lu80;->d:Lu8;

    .line 11
    .line 12
    iput-object p5, p0, Lu80;->e:Lyk;

    .line 13
    .line 14
    iput-object p7, p0, Lu80;->f:Ljo0;

    .line 15
    .line 16
    iput-object p8, p0, Lu80;->g:Lga;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ls70;J)Lyd0;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    invoke-static {v3, v4, v3, v4}, Ld30;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    move-object/from16 v13, p1

    .line 12
    .line 13
    iget-object v4, v13, Ls70;->e:Ly41;

    .line 14
    .line 15
    iget-object v5, v0, Lu80;->a:Lc90;

    .line 16
    .line 17
    iget-object v6, v5, Lc90;->s:Loh0;

    .line 18
    .line 19
    invoke-interface {v6}, Lw31;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-boolean v6, v5, Lc90;->b:Z

    .line 23
    .line 24
    if-nez v6, :cond_1

    .line 25
    .line 26
    invoke-interface {v4}, Ll30;->m()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 v17, 0x0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/16 v17, 0x1

    .line 37
    .line 38
    :goto_1
    sget-object v6, Lum0;->e:Lum0;

    .line 39
    .line 40
    invoke-static {v1, v2, v6}, Ls91;->p(JLum0;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v4}, Ll30;->getLayoutDirection()Lk50;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    sget-object v10, Lk50;->d:Lk50;

    .line 48
    .line 49
    iget-object v11, v0, Lu80;->b:Ljn0;

    .line 50
    .line 51
    if-ne v9, v10, :cond_2

    .line 52
    .line 53
    invoke-interface {v11, v9}, Ljn0;->a(Lk50;)F

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-interface {v11, v9}, Ljn0;->b(Lk50;)F

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    :goto_2
    invoke-interface {v4, v9}, Lym;->F(F)I

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    invoke-interface {v4}, Ll30;->getLayoutDirection()Lk50;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-ne v9, v10, :cond_3

    .line 71
    .line 72
    invoke-interface {v11, v9}, Ljn0;->b(Lk50;)F

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-interface {v11, v9}, Ljn0;->a(Lk50;)F

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    :goto_3
    invoke-interface {v4, v9}, Lym;->F(F)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-interface {v11}, Ljn0;->d()F

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    invoke-interface {v4, v14}, Lym;->F(F)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    invoke-interface {v11}, Ljn0;->c()F

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    invoke-interface {v4, v11}, Lym;->F(F)I

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    add-int/2addr v11, v14

    .line 102
    add-int/2addr v9, v12

    .line 103
    sub-int v21, v9, v12

    .line 104
    .line 105
    neg-int v15, v9

    .line 106
    neg-int v7, v11

    .line 107
    invoke-static {v1, v2, v15, v7}, Lqj;->h(JII)J

    .line 108
    .line 109
    .line 110
    move-result-wide v18

    .line 111
    iget-object v7, v0, Lu80;->c:Lhw;

    .line 112
    .line 113
    invoke-interface {v7}, Lhw;->invoke()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    check-cast v7, Lr80;

    .line 118
    .line 119
    iget-object v15, v7, Lr80;->c:Ly60;

    .line 120
    .line 121
    invoke-static/range {v18 .. v19}, Lpj;->h(J)I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    move/from16 v22, v3

    .line 126
    .line 127
    invoke-static/range {v18 .. v19}, Lpj;->g(J)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    move-object/from16 v23, v5

    .line 132
    .line 133
    iget-object v5, v15, Ly60;->a:Ldp0;

    .line 134
    .line 135
    invoke-virtual {v5, v8}, Ldp0;->h(I)V

    .line 136
    .line 137
    .line 138
    iget-object v5, v15, Ly60;->b:Ldp0;

    .line 139
    .line 140
    invoke-virtual {v5, v3}, Ldp0;->h(I)V

    .line 141
    .line 142
    .line 143
    iget-object v3, v0, Lu80;->d:Lu8;

    .line 144
    .line 145
    if-eqz v3, :cond_67

    .line 146
    .line 147
    invoke-interface {v3}, Lu8;->a()F

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-interface {v4, v5}, Lym;->F(F)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    move v8, v9

    .line 156
    invoke-virtual {v7}, Lr80;->a()I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    invoke-static {v1, v2}, Lpj;->h(J)I

    .line 161
    .line 162
    .line 163
    move-result v15

    .line 164
    sub-int/2addr v15, v8

    .line 165
    move-object/from16 v25, v3

    .line 166
    .line 167
    move-object/from16 v24, v4

    .line 168
    .line 169
    int-to-long v3, v12

    .line 170
    const/16 v26, 0x20

    .line 171
    .line 172
    shl-long v3, v3, v26

    .line 173
    .line 174
    move-wide/from16 v27, v3

    .line 175
    .line 176
    int-to-long v3, v14

    .line 177
    const-wide v29, 0xffffffffL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    and-long v3, v3, v29

    .line 183
    .line 184
    or-long v3, v27, v3

    .line 185
    .line 186
    new-instance v14, Lt80;

    .line 187
    .line 188
    move/from16 v27, v11

    .line 189
    .line 190
    iget-object v11, v0, Lu80;->g:Lga;

    .line 191
    .line 192
    move-wide/from16 v28, v3

    .line 193
    .line 194
    iget-object v3, v0, Lu80;->a:Lc90;

    .line 195
    .line 196
    move-object/from16 v16, v3

    .line 197
    .line 198
    move/from16 v20, v8

    .line 199
    .line 200
    move-object v8, v13

    .line 201
    move-object v4, v14

    .line 202
    move/from16 v31, v15

    .line 203
    .line 204
    move/from16 v13, v21

    .line 205
    .line 206
    move-object/from16 v3, v23

    .line 207
    .line 208
    move-wide/from16 v14, v28

    .line 209
    .line 210
    move-object/from16 v21, v6

    .line 211
    .line 212
    move-object/from16 v52, v10

    .line 213
    .line 214
    move v10, v5

    .line 215
    move-wide/from16 v5, v18

    .line 216
    .line 217
    const/16 v19, 0x1

    .line 218
    .line 219
    move-object/from16 v18, v52

    .line 220
    .line 221
    invoke-direct/range {v4 .. v16}, Lt80;-><init>(JLr80;Ls70;IILga;IIJLc90;)V

    .line 222
    .line 223
    .line 224
    move-object v14, v4

    .line 225
    move v4, v12

    .line 226
    move/from16 v29, v20

    .line 227
    .line 228
    move-object/from16 v20, v21

    .line 229
    .line 230
    move/from16 v28, v22

    .line 231
    .line 232
    move/from16 v22, v10

    .line 233
    .line 234
    move/from16 v21, v13

    .line 235
    .line 236
    move v10, v9

    .line 237
    invoke-static {}, Lu50;->k()Ll21;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    const/16 v30, 0x0

    .line 242
    .line 243
    if-eqz v8, :cond_4

    .line 244
    .line 245
    invoke-virtual {v8}, Ll21;->e()Lsw;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    goto :goto_4

    .line 250
    :cond_4
    move-object/from16 v9, v30

    .line 251
    .line 252
    :goto_4
    invoke-static {v8}, Lu50;->s(Ll21;)Ll21;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    :try_start_0
    iget-object v12, v3, Lc90;->e:Lfe;

    .line 257
    .line 258
    iget-object v13, v12, Lfe;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v13, Ldp0;

    .line 261
    .line 262
    invoke-virtual {v13}, Ldp0;->g()I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    iget-object v15, v12, Lfe;->d:Ljava/lang/Object;

    .line 267
    .line 268
    invoke-static {v13, v7, v15}, Lg60;->k(ILo70;Ljava/lang/Object;)I

    .line 269
    .line 270
    .line 271
    move-result v15

    .line 272
    if-eq v13, v15, :cond_5

    .line 273
    .line 274
    move/from16 v16, v10

    .line 275
    .line 276
    iget-object v10, v12, Lfe;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v10, Ldp0;

    .line 279
    .line 280
    invoke-virtual {v10, v15}, Ldp0;->h(I)V

    .line 281
    .line 282
    .line 283
    iget-object v10, v12, Lfe;->e:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v10, Lt70;

    .line 286
    .line 287
    invoke-virtual {v10, v13}, Lt70;->a(I)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :catchall_0
    move-exception v0

    .line 292
    goto/16 :goto_50

    .line 293
    .line 294
    :cond_5
    move/from16 v16, v10

    .line 295
    .line 296
    :goto_5
    iget-object v10, v12, Lfe;->c:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v10, Ldp0;

    .line 299
    .line 300
    invoke-virtual {v10}, Ldp0;->g()I

    .line 301
    .line 302
    .line 303
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    invoke-static {v8, v11, v9}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 305
    .line 306
    .line 307
    iget-object v8, v3, Lc90;->r:La80;

    .line 308
    .line 309
    iget-object v9, v3, Lc90;->o:Leb;

    .line 310
    .line 311
    invoke-static {v7, v8, v9}, Lj50;->i(Lo70;La80;Leb;)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    invoke-interface/range {v24 .. v24}, Ll30;->m()Z

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    if-nez v8, :cond_7

    .line 320
    .line 321
    if-nez v17, :cond_6

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_6
    iget-object v8, v3, Lc90;->w:Ld;

    .line 325
    .line 326
    iget-object v8, v8, Ld;->f:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v8, Lw7;

    .line 329
    .line 330
    iget-object v8, v8, Lw7;->e:Lgp0;

    .line 331
    .line 332
    invoke-virtual {v8}, Lgp0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    check-cast v8, Ljava/lang/Number;

    .line 337
    .line 338
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    goto :goto_7

    .line 343
    :cond_7
    :goto_6
    iget v8, v3, Lc90;->h:F

    .line 344
    .line 345
    :goto_7
    iget-object v9, v3, Lc90;->n:Ll70;

    .line 346
    .line 347
    move v11, v15

    .line 348
    invoke-interface/range {v24 .. v24}, Ll30;->m()Z

    .line 349
    .line 350
    .line 351
    move-result v15

    .line 352
    iget-object v12, v3, Lc90;->v:Loh0;

    .line 353
    .line 354
    if-ltz v4, :cond_8

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_8
    const-string v13, "invalid beforeContentPadding"

    .line 358
    .line 359
    invoke-static {v13}, Lz10;->a(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    :goto_8
    if-ltz v21, :cond_9

    .line 363
    .line 364
    goto :goto_9

    .line 365
    :cond_9
    const-string v13, "invalid afterContentPadding"

    .line 366
    .line 367
    invoke-static {v13}, Lz10;->a(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    :goto_9
    move-object/from16 v32, v3

    .line 371
    .line 372
    sget-object v3, Lis;->d:Lis;

    .line 373
    .line 374
    move/from16 v33, v10

    .line 375
    .line 376
    iget-object v10, v14, Lt80;->b:Lr80;

    .line 377
    .line 378
    move/from16 v34, v8

    .line 379
    .line 380
    iget-object v8, v0, Lu80;->e:Lyk;

    .line 381
    .line 382
    sget-object v35, Lhs;->d:Lhs;

    .line 383
    .line 384
    if-gtz v16, :cond_b

    .line 385
    .line 386
    invoke-static {v5, v6}, Lpj;->j(J)I

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    invoke-static {v5, v6}, Lpj;->i(J)I

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    new-instance v12, Ljava/util/ArrayList;

    .line 395
    .line 396
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 397
    .line 398
    .line 399
    iget-object v13, v10, Lr80;->d:Lu5;

    .line 400
    .line 401
    move/from16 v16, v17

    .line 402
    .line 403
    const/16 v17, 0x0

    .line 404
    .line 405
    const/16 v18, 0x0

    .line 406
    .line 407
    move v10, v0

    .line 408
    invoke-virtual/range {v9 .. v18}, Ll70;->b(IILjava/util/ArrayList;Lu5;Lt80;ZZII)V

    .line 409
    .line 410
    .line 411
    move/from16 v16, v15

    .line 412
    .line 413
    move-object v15, v9

    .line 414
    if-nez v16, :cond_a

    .line 415
    .line 416
    invoke-virtual {v15}, Ll70;->a()J

    .line 417
    .line 418
    .line 419
    if-nez v28, :cond_a

    .line 420
    .line 421
    const/4 v0, 0x0

    .line 422
    invoke-static {v0, v5, v6}, Lqj;->f(IJ)I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    invoke-static {v0, v5, v6}, Lqj;->e(IJ)I

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    move v0, v7

    .line 431
    goto :goto_a

    .line 432
    :cond_a
    move v0, v10

    .line 433
    :goto_a
    new-instance v5, Lpn;

    .line 434
    .line 435
    const/16 v6, 0x19

    .line 436
    .line 437
    invoke-direct {v5, v6}, Lpn;-><init>(I)V

    .line 438
    .line 439
    .line 440
    add-int v0, v0, v29

    .line 441
    .line 442
    invoke-static {v0, v1, v2}, Lqj;->f(IJ)I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    add-int v11, v11, v27

    .line 447
    .line 448
    invoke-static {v11, v1, v2}, Lqj;->e(IJ)I

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    move-object/from16 v2, v24

    .line 453
    .line 454
    invoke-interface {v2, v0, v1, v3, v5}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    neg-int v0, v4

    .line 459
    add-int v18, v31, v21

    .line 460
    .line 461
    new-instance v4, Lv80;

    .line 462
    .line 463
    const/4 v11, 0x0

    .line 464
    const/16 v19, 0x0

    .line 465
    .line 466
    const/4 v5, 0x0

    .line 467
    const/4 v6, 0x0

    .line 468
    const/4 v7, 0x0

    .line 469
    move-object v12, v8

    .line 470
    const/4 v8, 0x0

    .line 471
    const/4 v10, 0x0

    .line 472
    iget-wide v14, v14, Lt80;->d:J

    .line 473
    .line 474
    move-object/from16 v13, p1

    .line 475
    .line 476
    move/from16 v17, v0

    .line 477
    .line 478
    move-object/from16 v16, v35

    .line 479
    .line 480
    invoke-direct/range {v4 .. v22}, Lv80;-><init>(Lw80;IZFLyd0;FZLyk;Lym;JLjava/util/List;IIILum0;II)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_4f

    .line 484
    .line 485
    :cond_b
    move/from16 v52, v31

    .line 486
    .line 487
    move-object/from16 v31, v8

    .line 488
    .line 489
    move/from16 v8, v16

    .line 490
    .line 491
    move/from16 v16, v17

    .line 492
    .line 493
    move-object/from16 v17, v9

    .line 494
    .line 495
    move/from16 v9, v52

    .line 496
    .line 497
    if-lt v11, v8, :cond_c

    .line 498
    .line 499
    add-int/lit8 v11, v8, -0x1

    .line 500
    .line 501
    const/16 v33, 0x0

    .line 502
    .line 503
    :cond_c
    invoke-static/range {v34 .. v34}, Ljava/lang/Math;->round(F)I

    .line 504
    .line 505
    .line 506
    move-result v36

    .line 507
    sub-int v33, v33, v36

    .line 508
    .line 509
    if-nez v11, :cond_d

    .line 510
    .line 511
    if-gez v33, :cond_d

    .line 512
    .line 513
    add-int v36, v36, v33

    .line 514
    .line 515
    const/16 v33, 0x0

    .line 516
    .line 517
    :cond_d
    move-object/from16 v37, v3

    .line 518
    .line 519
    new-instance v3, Lx8;

    .line 520
    .line 521
    invoke-direct {v3}, Lx8;-><init>()V

    .line 522
    .line 523
    .line 524
    neg-int v1, v4

    .line 525
    if-gez v22, :cond_e

    .line 526
    .line 527
    move/from16 v2, v22

    .line 528
    .line 529
    goto :goto_b

    .line 530
    :cond_e
    const/4 v2, 0x0

    .line 531
    :goto_b
    add-int/2addr v2, v1

    .line 532
    add-int v33, v33, v2

    .line 533
    .line 534
    move/from16 v38, v1

    .line 535
    .line 536
    move/from16 v13, v33

    .line 537
    .line 538
    move/from16 v33, v11

    .line 539
    .line 540
    const/4 v11, 0x0

    .line 541
    :goto_c
    iget-wide v0, v14, Lt80;->d:J

    .line 542
    .line 543
    if-gez v13, :cond_f

    .line 544
    .line 545
    if-lez v33, :cond_f

    .line 546
    .line 547
    move-object/from16 v39, v12

    .line 548
    .line 549
    add-int/lit8 v12, v33, -0x1

    .line 550
    .line 551
    invoke-virtual {v14, v12, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    const/4 v1, 0x0

    .line 556
    invoke-virtual {v3, v1, v0}, Lx8;->add(ILjava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    iget v1, v0, Lw80;->l:I

    .line 560
    .line 561
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 562
    .line 563
    .line 564
    move-result v11

    .line 565
    iget v0, v0, Lw80;->k:I

    .line 566
    .line 567
    add-int/2addr v13, v0

    .line 568
    move/from16 v33, v12

    .line 569
    .line 570
    move-object/from16 v12, v39

    .line 571
    .line 572
    goto :goto_c

    .line 573
    :cond_f
    move-object/from16 v39, v12

    .line 574
    .line 575
    if-ge v13, v2, :cond_10

    .line 576
    .line 577
    sub-int v12, v2, v13

    .line 578
    .line 579
    sub-int v36, v36, v12

    .line 580
    .line 581
    move v13, v2

    .line 582
    :cond_10
    move/from16 v12, v36

    .line 583
    .line 584
    sub-int/2addr v13, v2

    .line 585
    add-int v36, v9, v21

    .line 586
    .line 587
    move/from16 v40, v11

    .line 588
    .line 589
    if-gez v36, :cond_11

    .line 590
    .line 591
    const/4 v11, 0x0

    .line 592
    :goto_d
    move/from16 v41, v15

    .line 593
    .line 594
    goto :goto_e

    .line 595
    :cond_11
    move/from16 v11, v36

    .line 596
    .line 597
    goto :goto_d

    .line 598
    :goto_e
    neg-int v15, v13

    .line 599
    move-object/from16 v45, v10

    .line 600
    .line 601
    move/from16 v42, v13

    .line 602
    .line 603
    move/from16 v44, v33

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const/16 v43, 0x0

    .line 607
    .line 608
    :goto_f
    iget v10, v3, Lx8;->f:I

    .line 609
    .line 610
    if-ge v13, v10, :cond_13

    .line 611
    .line 612
    if-lt v15, v11, :cond_12

    .line 613
    .line 614
    invoke-virtual {v3, v13}, Lx8;->b(I)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move/from16 v43, v19

    .line 618
    .line 619
    goto :goto_f

    .line 620
    :cond_12
    add-int/lit8 v44, v44, 0x1

    .line 621
    .line 622
    invoke-virtual {v3, v13}, Lx8;->get(I)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v10

    .line 626
    check-cast v10, Lw80;

    .line 627
    .line 628
    iget v10, v10, Lw80;->k:I

    .line 629
    .line 630
    add-int/2addr v15, v10

    .line 631
    add-int/lit8 v13, v13, 0x1

    .line 632
    .line 633
    goto :goto_f

    .line 634
    :cond_13
    move/from16 v10, v40

    .line 635
    .line 636
    move/from16 v13, v44

    .line 637
    .line 638
    :goto_10
    if-ge v13, v8, :cond_15

    .line 639
    .line 640
    if-lt v15, v11, :cond_14

    .line 641
    .line 642
    if-lez v15, :cond_14

    .line 643
    .line 644
    invoke-virtual {v3}, Lx8;->isEmpty()Z

    .line 645
    .line 646
    .line 647
    move-result v40

    .line 648
    if-eqz v40, :cond_15

    .line 649
    .line 650
    :cond_14
    move/from16 v40, v8

    .line 651
    .line 652
    goto :goto_11

    .line 653
    :cond_15
    move/from16 v40, v8

    .line 654
    .line 655
    goto :goto_13

    .line 656
    :goto_11
    invoke-virtual {v14, v13, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    move/from16 v44, v11

    .line 661
    .line 662
    iget v11, v8, Lw80;->k:I

    .line 663
    .line 664
    add-int/2addr v15, v11

    .line 665
    if-gt v15, v2, :cond_16

    .line 666
    .line 667
    move/from16 v46, v2

    .line 668
    .line 669
    add-int/lit8 v2, v40, -0x1

    .line 670
    .line 671
    if-eq v13, v2, :cond_17

    .line 672
    .line 673
    add-int/lit8 v2, v13, 0x1

    .line 674
    .line 675
    sub-int v42, v42, v11

    .line 676
    .line 677
    move/from16 v33, v2

    .line 678
    .line 679
    move/from16 v43, v19

    .line 680
    .line 681
    goto :goto_12

    .line 682
    :cond_16
    move/from16 v46, v2

    .line 683
    .line 684
    :cond_17
    iget v2, v8, Lw80;->l:I

    .line 685
    .line 686
    invoke-static {v10, v2}, Ljava/lang/Math;->max(II)I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    invoke-virtual {v3, v8}, Lx8;->addLast(Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    move v10, v2

    .line 694
    :goto_12
    add-int/lit8 v13, v13, 0x1

    .line 695
    .line 696
    move/from16 v8, v40

    .line 697
    .line 698
    move/from16 v11, v44

    .line 699
    .line 700
    move/from16 v2, v46

    .line 701
    .line 702
    goto :goto_10

    .line 703
    :goto_13
    if-ge v15, v9, :cond_1a

    .line 704
    .line 705
    sub-int v2, v9, v15

    .line 706
    .line 707
    sub-int v42, v42, v2

    .line 708
    .line 709
    add-int/2addr v15, v2

    .line 710
    move/from16 v8, v42

    .line 711
    .line 712
    :goto_14
    if-ge v8, v4, :cond_18

    .line 713
    .line 714
    if-lez v33, :cond_18

    .line 715
    .line 716
    add-int/lit8 v11, v33, -0x1

    .line 717
    .line 718
    move/from16 v44, v2

    .line 719
    .line 720
    invoke-virtual {v14, v11, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    move/from16 v46, v4

    .line 725
    .line 726
    const/4 v4, 0x0

    .line 727
    invoke-virtual {v3, v4, v2}, Lx8;->add(ILjava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    iget v4, v2, Lw80;->l:I

    .line 731
    .line 732
    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    .line 733
    .line 734
    .line 735
    move-result v10

    .line 736
    iget v2, v2, Lw80;->k:I

    .line 737
    .line 738
    add-int/2addr v8, v2

    .line 739
    move/from16 v33, v11

    .line 740
    .line 741
    move/from16 v2, v44

    .line 742
    .line 743
    move/from16 v4, v46

    .line 744
    .line 745
    goto :goto_14

    .line 746
    :cond_18
    move/from16 v44, v2

    .line 747
    .line 748
    move/from16 v46, v4

    .line 749
    .line 750
    add-int v2, v12, v44

    .line 751
    .line 752
    if-gez v8, :cond_19

    .line 753
    .line 754
    add-int/2addr v2, v8

    .line 755
    add-int/2addr v15, v8

    .line 756
    move/from16 v4, v33

    .line 757
    .line 758
    const/4 v8, 0x0

    .line 759
    goto :goto_15

    .line 760
    :cond_19
    move/from16 v4, v33

    .line 761
    .line 762
    goto :goto_15

    .line 763
    :cond_1a
    move/from16 v46, v4

    .line 764
    .line 765
    move v2, v12

    .line 766
    move/from16 v4, v33

    .line 767
    .line 768
    move/from16 v8, v42

    .line 769
    .line 770
    :goto_15
    invoke-static/range {v34 .. v34}, Ljava/lang/Math;->round(F)I

    .line 771
    .line 772
    .line 773
    move-result v11

    .line 774
    invoke-static {v11}, Ljava/lang/Integer;->signum(I)I

    .line 775
    .line 776
    .line 777
    move-result v11

    .line 778
    move/from16 v33, v10

    .line 779
    .line 780
    invoke-static {v2}, Ljava/lang/Integer;->signum(I)I

    .line 781
    .line 782
    .line 783
    move-result v10

    .line 784
    if-ne v11, v10, :cond_1b

    .line 785
    .line 786
    invoke-static/range {v34 .. v34}, Ljava/lang/Math;->round(F)I

    .line 787
    .line 788
    .line 789
    move-result v10

    .line 790
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 791
    .line 792
    .line 793
    move-result v10

    .line 794
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 795
    .line 796
    .line 797
    move-result v11

    .line 798
    if-lt v10, v11, :cond_1b

    .line 799
    .line 800
    int-to-float v10, v2

    .line 801
    move/from16 v42, v10

    .line 802
    .line 803
    goto :goto_16

    .line 804
    :cond_1b
    move/from16 v42, v34

    .line 805
    .line 806
    :goto_16
    sub-float v10, v34, v42

    .line 807
    .line 808
    const/4 v11, 0x0

    .line 809
    if-eqz v41, :cond_1c

    .line 810
    .line 811
    if-le v2, v12, :cond_1c

    .line 812
    .line 813
    cmpg-float v34, v10, v11

    .line 814
    .line 815
    if-gtz v34, :cond_1c

    .line 816
    .line 817
    sub-int/2addr v2, v12

    .line 818
    int-to-float v2, v2

    .line 819
    add-float v11, v2, v10

    .line 820
    .line 821
    :cond_1c
    move v2, v11

    .line 822
    if-ltz v8, :cond_1d

    .line 823
    .line 824
    goto :goto_17

    .line 825
    :cond_1d
    const-string v10, "negative currentFirstItemScrollOffset"

    .line 826
    .line 827
    invoke-static {v10}, Lz10;->a(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    :goto_17
    neg-int v10, v8

    .line 831
    invoke-virtual {v3}, Lx8;->first()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v11

    .line 835
    check-cast v11, Lw80;

    .line 836
    .line 837
    if-gtz v46, :cond_1f

    .line 838
    .line 839
    if-gez v22, :cond_1e

    .line 840
    .line 841
    goto :goto_19

    .line 842
    :cond_1e
    move/from16 v46, v2

    .line 843
    .line 844
    move-object v2, v11

    .line 845
    move v11, v8

    .line 846
    :goto_18
    const/4 v8, 0x0

    .line 847
    goto :goto_1b

    .line 848
    :cond_1f
    :goto_19
    invoke-virtual {v3}, Lx8;->a()I

    .line 849
    .line 850
    .line 851
    move-result v12

    .line 852
    move-object/from16 v34, v11

    .line 853
    .line 854
    move v11, v8

    .line 855
    const/4 v8, 0x0

    .line 856
    :goto_1a
    if-ge v8, v12, :cond_20

    .line 857
    .line 858
    invoke-virtual {v3, v8}, Lx8;->get(I)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v44

    .line 862
    move/from16 v46, v2

    .line 863
    .line 864
    move-object/from16 v2, v44

    .line 865
    .line 866
    check-cast v2, Lw80;

    .line 867
    .line 868
    iget v2, v2, Lw80;->k:I

    .line 869
    .line 870
    if-eqz v11, :cond_21

    .line 871
    .line 872
    if-gt v2, v11, :cond_21

    .line 873
    .line 874
    invoke-virtual {v3}, Lx8;->a()I

    .line 875
    .line 876
    .line 877
    move-result v44

    .line 878
    move/from16 v47, v2

    .line 879
    .line 880
    add-int/lit8 v2, v44, -0x1

    .line 881
    .line 882
    if-eq v8, v2, :cond_21

    .line 883
    .line 884
    sub-int v11, v11, v47

    .line 885
    .line 886
    add-int/lit8 v8, v8, 0x1

    .line 887
    .line 888
    invoke-virtual {v3, v8}, Lx8;->get(I)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    move-object/from16 v34, v2

    .line 893
    .line 894
    check-cast v34, Lw80;

    .line 895
    .line 896
    move/from16 v2, v46

    .line 897
    .line 898
    goto :goto_1a

    .line 899
    :cond_20
    move/from16 v46, v2

    .line 900
    .line 901
    :cond_21
    move-object/from16 v2, v34

    .line 902
    .line 903
    goto :goto_18

    .line 904
    :goto_1b
    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    .line 905
    .line 906
    .line 907
    move-result v12

    .line 908
    add-int/lit8 v4, v4, -0x1

    .line 909
    .line 910
    if-gt v12, v4, :cond_23

    .line 911
    .line 912
    move-object/from16 v8, v30

    .line 913
    .line 914
    :goto_1c
    if-nez v8, :cond_22

    .line 915
    .line 916
    new-instance v8, Ljava/util/ArrayList;

    .line 917
    .line 918
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 919
    .line 920
    .line 921
    :cond_22
    move/from16 v34, v10

    .line 922
    .line 923
    invoke-virtual {v14, v4, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 924
    .line 925
    .line 926
    move-result-object v10

    .line 927
    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    if-eq v4, v12, :cond_24

    .line 931
    .line 932
    add-int/lit8 v4, v4, -0x1

    .line 933
    .line 934
    move/from16 v10, v34

    .line 935
    .line 936
    goto :goto_1c

    .line 937
    :cond_23
    move/from16 v34, v10

    .line 938
    .line 939
    move-object/from16 v8, v30

    .line 940
    .line 941
    :cond_24
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 942
    .line 943
    .line 944
    move-result v4

    .line 945
    const/4 v10, -0x1

    .line 946
    add-int/2addr v4, v10

    .line 947
    if-ltz v4, :cond_28

    .line 948
    .line 949
    :goto_1d
    add-int/lit8 v44, v4, -0x1

    .line 950
    .line 951
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    check-cast v4, Ljava/lang/Number;

    .line 956
    .line 957
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 958
    .line 959
    .line 960
    move-result v4

    .line 961
    if-ge v4, v12, :cond_26

    .line 962
    .line 963
    if-nez v8, :cond_25

    .line 964
    .line 965
    new-instance v8, Ljava/util/ArrayList;

    .line 966
    .line 967
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 968
    .line 969
    .line 970
    :cond_25
    invoke-virtual {v14, v4, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 971
    .line 972
    .line 973
    move-result-object v4

    .line 974
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    :cond_26
    if-gez v44, :cond_27

    .line 978
    .line 979
    goto :goto_1e

    .line 980
    :cond_27
    move/from16 v4, v44

    .line 981
    .line 982
    goto :goto_1d

    .line 983
    :cond_28
    :goto_1e
    if-nez v8, :cond_29

    .line 984
    .line 985
    move-object/from16 v8, v35

    .line 986
    .line 987
    :cond_29
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 988
    .line 989
    .line 990
    move-result v4

    .line 991
    move/from16 v10, v33

    .line 992
    .line 993
    const/4 v12, 0x0

    .line 994
    :goto_1f
    if-ge v12, v4, :cond_2a

    .line 995
    .line 996
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v44

    .line 1000
    move/from16 v47, v4

    .line 1001
    .line 1002
    move-object/from16 v4, v44

    .line 1003
    .line 1004
    check-cast v4, Lw80;

    .line 1005
    .line 1006
    iget v4, v4, Lw80;->l:I

    .line 1007
    .line 1008
    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    .line 1009
    .line 1010
    .line 1011
    move-result v10

    .line 1012
    add-int/lit8 v12, v12, 0x1

    .line 1013
    .line 1014
    move/from16 v4, v47

    .line 1015
    .line 1016
    goto :goto_1f

    .line 1017
    :cond_2a
    invoke-static {v3}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v4

    .line 1021
    check-cast v4, Lw80;

    .line 1022
    .line 1023
    iget v4, v4, Lw80;->a:I

    .line 1024
    .line 1025
    add-int/lit8 v12, v40, -0x1

    .line 1026
    .line 1027
    invoke-static {v4, v12}, Ljava/lang/Math;->min(II)I

    .line 1028
    .line 1029
    .line 1030
    move-result v4

    .line 1031
    invoke-static {v3}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v12

    .line 1035
    check-cast v12, Lw80;

    .line 1036
    .line 1037
    iget v12, v12, Lw80;->a:I

    .line 1038
    .line 1039
    add-int/lit8 v12, v12, 0x1

    .line 1040
    .line 1041
    if-gt v12, v4, :cond_2c

    .line 1042
    .line 1043
    move-object/from16 v44, v30

    .line 1044
    .line 1045
    :goto_20
    if-nez v44, :cond_2b

    .line 1046
    .line 1047
    new-instance v44, Ljava/util/ArrayList;

    .line 1048
    .line 1049
    invoke-direct/range {v44 .. v44}, Ljava/util/ArrayList;-><init>()V

    .line 1050
    .line 1051
    .line 1052
    :cond_2b
    move/from16 v47, v10

    .line 1053
    .line 1054
    move-object/from16 v10, v44

    .line 1055
    .line 1056
    move/from16 v44, v11

    .line 1057
    .line 1058
    invoke-virtual {v14, v12, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v11

    .line 1062
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    if-eq v12, v4, :cond_2d

    .line 1066
    .line 1067
    add-int/lit8 v12, v12, 0x1

    .line 1068
    .line 1069
    move/from16 v11, v44

    .line 1070
    .line 1071
    move-object/from16 v44, v10

    .line 1072
    .line 1073
    move/from16 v10, v47

    .line 1074
    .line 1075
    goto :goto_20

    .line 1076
    :cond_2c
    move/from16 v47, v10

    .line 1077
    .line 1078
    move/from16 v44, v11

    .line 1079
    .line 1080
    move-object/from16 v10, v30

    .line 1081
    .line 1082
    :cond_2d
    if-eqz v10, :cond_2e

    .line 1083
    .line 1084
    invoke-static {v10}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v11

    .line 1088
    check-cast v11, Lw80;

    .line 1089
    .line 1090
    iget v11, v11, Lw80;->a:I

    .line 1091
    .line 1092
    if-le v11, v4, :cond_2e

    .line 1093
    .line 1094
    invoke-static {v10}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v4

    .line 1098
    check-cast v4, Lw80;

    .line 1099
    .line 1100
    iget v4, v4, Lw80;->a:I

    .line 1101
    .line 1102
    :cond_2e
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 1103
    .line 1104
    .line 1105
    move-result v11

    .line 1106
    move-object v12, v10

    .line 1107
    const/4 v10, 0x0

    .line 1108
    :goto_21
    if-ge v10, v11, :cond_31

    .line 1109
    .line 1110
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v48

    .line 1114
    check-cast v48, Ljava/lang/Number;

    .line 1115
    .line 1116
    move-object/from16 v49, v7

    .line 1117
    .line 1118
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Number;->intValue()I

    .line 1119
    .line 1120
    .line 1121
    move-result v7

    .line 1122
    if-le v7, v4, :cond_30

    .line 1123
    .line 1124
    if-nez v12, :cond_2f

    .line 1125
    .line 1126
    new-instance v12, Ljava/util/ArrayList;

    .line 1127
    .line 1128
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1129
    .line 1130
    .line 1131
    :cond_2f
    invoke-virtual {v14, v7, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v7

    .line 1135
    invoke-interface {v12, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    :cond_30
    add-int/lit8 v10, v10, 0x1

    .line 1139
    .line 1140
    move-object/from16 v7, v49

    .line 1141
    .line 1142
    goto :goto_21

    .line 1143
    :cond_31
    if-nez v12, :cond_32

    .line 1144
    .line 1145
    move-object/from16 v12, v35

    .line 1146
    .line 1147
    :cond_32
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1148
    .line 1149
    .line 1150
    move-result v4

    .line 1151
    move/from16 v10, v47

    .line 1152
    .line 1153
    const/4 v7, 0x0

    .line 1154
    :goto_22
    if-ge v7, v4, :cond_33

    .line 1155
    .line 1156
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v11

    .line 1160
    check-cast v11, Lw80;

    .line 1161
    .line 1162
    iget v11, v11, Lw80;->l:I

    .line 1163
    .line 1164
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 1165
    .line 1166
    .line 1167
    move-result v10

    .line 1168
    add-int/lit8 v7, v7, 0x1

    .line 1169
    .line 1170
    goto :goto_22

    .line 1171
    :cond_33
    invoke-virtual {v3}, Lx8;->first()Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v4

    .line 1175
    invoke-static {v2, v4}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    move-result v4

    .line 1179
    if-eqz v4, :cond_34

    .line 1180
    .line 1181
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1182
    .line 1183
    .line 1184
    move-result v4

    .line 1185
    if-eqz v4, :cond_34

    .line 1186
    .line 1187
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1188
    .line 1189
    .line 1190
    move-result v4

    .line 1191
    if-eqz v4, :cond_34

    .line 1192
    .line 1193
    move/from16 v47, v19

    .line 1194
    .line 1195
    goto :goto_23

    .line 1196
    :cond_34
    const/16 v47, 0x0

    .line 1197
    .line 1198
    :goto_23
    invoke-static {v15, v5, v6}, Lqj;->f(IJ)I

    .line 1199
    .line 1200
    .line 1201
    move-result v4

    .line 1202
    invoke-static {v10, v5, v6}, Lqj;->e(IJ)I

    .line 1203
    .line 1204
    .line 1205
    move-result v11

    .line 1206
    invoke-static {v4, v9}, Ljava/lang/Math;->min(II)I

    .line 1207
    .line 1208
    .line 1209
    move-result v7

    .line 1210
    if-ge v15, v7, :cond_35

    .line 1211
    .line 1212
    move/from16 v7, v19

    .line 1213
    .line 1214
    goto :goto_24

    .line 1215
    :cond_35
    const/4 v7, 0x0

    .line 1216
    :goto_24
    if-eqz v7, :cond_37

    .line 1217
    .line 1218
    if-nez v34, :cond_36

    .line 1219
    .line 1220
    goto :goto_25

    .line 1221
    :cond_36
    const-string v10, "non-zero itemsScrollOffset"

    .line 1222
    .line 1223
    invoke-static {v10}, Lz10;->c(Ljava/lang/String;)V

    .line 1224
    .line 1225
    .line 1226
    :cond_37
    :goto_25
    new-instance v10, Ljava/util/ArrayList;

    .line 1227
    .line 1228
    invoke-virtual {v3}, Lx8;->a()I

    .line 1229
    .line 1230
    .line 1231
    move-result v48

    .line 1232
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1233
    .line 1234
    .line 1235
    move-result v49

    .line 1236
    add-int v49, v49, v48

    .line 1237
    .line 1238
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1239
    .line 1240
    .line 1241
    move-result v48

    .line 1242
    move-object/from16 v50, v2

    .line 1243
    .line 1244
    add-int v2, v48, v49

    .line 1245
    .line 1246
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1247
    .line 1248
    .line 1249
    if-eqz v7, :cond_3f

    .line 1250
    .line 1251
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1252
    .line 1253
    .line 1254
    move-result v2

    .line 1255
    if-eqz v2, :cond_38

    .line 1256
    .line 1257
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 1258
    .line 1259
    .line 1260
    move-result v2

    .line 1261
    if-eqz v2, :cond_38

    .line 1262
    .line 1263
    goto :goto_26

    .line 1264
    :cond_38
    const-string v2, "no extra items"

    .line 1265
    .line 1266
    invoke-static {v2}, Lz10;->a(Ljava/lang/String;)V

    .line 1267
    .line 1268
    .line 1269
    :goto_26
    invoke-virtual {v3}, Lx8;->a()I

    .line 1270
    .line 1271
    .line 1272
    move-result v2

    .line 1273
    new-array v7, v2, [I

    .line 1274
    .line 1275
    const/4 v8, 0x0

    .line 1276
    :goto_27
    if-ge v8, v2, :cond_39

    .line 1277
    .line 1278
    invoke-virtual {v3, v8}, Lx8;->get(I)Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v12

    .line 1282
    check-cast v12, Lw80;

    .line 1283
    .line 1284
    iget v12, v12, Lw80;->j:I

    .line 1285
    .line 1286
    aput v12, v7, v8

    .line 1287
    .line 1288
    add-int/lit8 v8, v8, 0x1

    .line 1289
    .line 1290
    goto :goto_27

    .line 1291
    :cond_39
    new-array v2, v2, [I

    .line 1292
    .line 1293
    if-eqz v25, :cond_3e

    .line 1294
    .line 1295
    move v12, v9

    .line 1296
    move-object/from16 v8, v18

    .line 1297
    .line 1298
    move-object v9, v2

    .line 1299
    move-object/from16 v2, v24

    .line 1300
    .line 1301
    move-wide/from16 v52, v5

    .line 1302
    .line 1303
    move-object/from16 v5, p1

    .line 1304
    .line 1305
    move v6, v4

    .line 1306
    move-object/from16 v4, v25

    .line 1307
    .line 1308
    move-wide/from16 v24, v0

    .line 1309
    .line 1310
    move-wide/from16 v0, v52

    .line 1311
    .line 1312
    invoke-interface/range {v4 .. v9}, Lu8;->b(Lzd0;I[ILk50;[I)V

    .line 1313
    .line 1314
    .line 1315
    invoke-static {v9}, Lf9;->i0([I)Lz20;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v4

    .line 1319
    iget v5, v4, Lx20;->d:I

    .line 1320
    .line 1321
    iget v7, v4, Lx20;->e:I

    .line 1322
    .line 1323
    iget v4, v4, Lx20;->f:I

    .line 1324
    .line 1325
    if-lez v4, :cond_3a

    .line 1326
    .line 1327
    if-le v5, v7, :cond_3b

    .line 1328
    .line 1329
    :cond_3a
    if-gez v4, :cond_3c

    .line 1330
    .line 1331
    if-gt v7, v5, :cond_3c

    .line 1332
    .line 1333
    :cond_3b
    :goto_28
    aget v8, v9, v5

    .line 1334
    .line 1335
    invoke-virtual {v3, v5}, Lx8;->get(I)Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v18

    .line 1339
    move/from16 v34, v4

    .line 1340
    .line 1341
    move-object/from16 v4, v18

    .line 1342
    .line 1343
    check-cast v4, Lw80;

    .line 1344
    .line 1345
    invoke-virtual {v4, v8, v6, v11}, Lw80;->c(III)V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    if-eq v5, v7, :cond_3c

    .line 1352
    .line 1353
    add-int v5, v5, v34

    .line 1354
    .line 1355
    move/from16 v4, v34

    .line 1356
    .line 1357
    goto :goto_28

    .line 1358
    :cond_3c
    move v4, v12

    .line 1359
    :cond_3d
    move v7, v13

    .line 1360
    move-object/from16 v5, v45

    .line 1361
    .line 1362
    goto/16 :goto_2c

    .line 1363
    .line 1364
    :cond_3e
    const-string v0, "null horizontalArrangement when isVertical == false"

    .line 1365
    .line 1366
    invoke-static {v0}, Lz10;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 1367
    .line 1368
    .line 1369
    new-instance v0, Lsg;

    .line 1370
    .line 1371
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1372
    .line 1373
    .line 1374
    throw v0

    .line 1375
    :cond_3f
    move-object/from16 v2, v24

    .line 1376
    .line 1377
    move-wide/from16 v24, v0

    .line 1378
    .line 1379
    move-wide v0, v5

    .line 1380
    move v6, v4

    .line 1381
    move v4, v9

    .line 1382
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1383
    .line 1384
    .line 1385
    move-result v5

    .line 1386
    move/from16 v9, v34

    .line 1387
    .line 1388
    const/4 v7, 0x0

    .line 1389
    :goto_29
    if-ge v7, v5, :cond_40

    .line 1390
    .line 1391
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v18

    .line 1395
    move/from16 v48, v5

    .line 1396
    .line 1397
    move-object/from16 v5, v18

    .line 1398
    .line 1399
    check-cast v5, Lw80;

    .line 1400
    .line 1401
    move/from16 v18, v7

    .line 1402
    .line 1403
    iget v7, v5, Lw80;->k:I

    .line 1404
    .line 1405
    sub-int/2addr v9, v7

    .line 1406
    invoke-virtual {v5, v9, v6, v11}, Lw80;->c(III)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1410
    .line 1411
    .line 1412
    add-int/lit8 v7, v18, 0x1

    .line 1413
    .line 1414
    move/from16 v5, v48

    .line 1415
    .line 1416
    goto :goto_29

    .line 1417
    :cond_40
    invoke-virtual {v3}, Lx8;->a()I

    .line 1418
    .line 1419
    .line 1420
    move-result v5

    .line 1421
    move/from16 v7, v34

    .line 1422
    .line 1423
    const/4 v8, 0x0

    .line 1424
    :goto_2a
    if-ge v8, v5, :cond_41

    .line 1425
    .line 1426
    invoke-virtual {v3, v8}, Lx8;->get(I)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v9

    .line 1430
    check-cast v9, Lw80;

    .line 1431
    .line 1432
    invoke-virtual {v9, v7, v6, v11}, Lw80;->c(III)V

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1436
    .line 1437
    .line 1438
    iget v9, v9, Lw80;->k:I

    .line 1439
    .line 1440
    add-int/2addr v7, v9

    .line 1441
    add-int/lit8 v8, v8, 0x1

    .line 1442
    .line 1443
    goto :goto_2a

    .line 1444
    :cond_41
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1445
    .line 1446
    .line 1447
    move-result v5

    .line 1448
    const/4 v8, 0x0

    .line 1449
    :goto_2b
    if-ge v8, v5, :cond_3d

    .line 1450
    .line 1451
    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v9

    .line 1455
    check-cast v9, Lw80;

    .line 1456
    .line 1457
    invoke-virtual {v9, v7, v6, v11}, Lw80;->c(III)V

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1461
    .line 1462
    .line 1463
    iget v9, v9, Lw80;->k:I

    .line 1464
    .line 1465
    add-int/2addr v7, v9

    .line 1466
    add-int/lit8 v8, v8, 0x1

    .line 1467
    .line 1468
    goto :goto_2b

    .line 1469
    :goto_2c
    iget-object v13, v5, Lr80;->d:Lu5;

    .line 1470
    .line 1471
    move/from16 v51, v7

    .line 1472
    .line 1473
    move-object v12, v10

    .line 1474
    move/from16 v18, v15

    .line 1475
    .line 1476
    move-object/from16 v9, v17

    .line 1477
    .line 1478
    move-object/from16 v7, v39

    .line 1479
    .line 1480
    move/from16 v8, v40

    .line 1481
    .line 1482
    move/from16 v15, v41

    .line 1483
    .line 1484
    move/from16 v17, v44

    .line 1485
    .line 1486
    move v10, v6

    .line 1487
    move-object v6, v5

    .line 1488
    const/4 v5, -0x1

    .line 1489
    invoke-virtual/range {v9 .. v18}, Ll70;->b(IILjava/util/ArrayList;Lu5;Lt80;ZZII)V

    .line 1490
    .line 1491
    .line 1492
    move-object v13, v12

    .line 1493
    move/from16 v12, v18

    .line 1494
    .line 1495
    if-nez v15, :cond_42

    .line 1496
    .line 1497
    invoke-virtual {v9}, Ll70;->a()J

    .line 1498
    .line 1499
    .line 1500
    if-nez v28, :cond_42

    .line 1501
    .line 1502
    const/4 v9, 0x0

    .line 1503
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    .line 1504
    .line 1505
    .line 1506
    move-result v5

    .line 1507
    invoke-static {v5, v0, v1}, Lqj;->f(IJ)I

    .line 1508
    .line 1509
    .line 1510
    move-result v5

    .line 1511
    invoke-static {v11, v9}, Ljava/lang/Math;->max(II)I

    .line 1512
    .line 1513
    .line 1514
    move-result v11

    .line 1515
    invoke-static {v11, v0, v1}, Lqj;->e(IJ)I

    .line 1516
    .line 1517
    .line 1518
    move-result v11

    .line 1519
    if-eq v5, v10, :cond_43

    .line 1520
    .line 1521
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1522
    .line 1523
    .line 1524
    move-result v0

    .line 1525
    const/4 v1, 0x0

    .line 1526
    :goto_2d
    if-ge v1, v0, :cond_43

    .line 1527
    .line 1528
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v9

    .line 1532
    check-cast v9, Lw80;

    .line 1533
    .line 1534
    iput v5, v9, Lw80;->n:I

    .line 1535
    .line 1536
    add-int/lit8 v1, v1, 0x1

    .line 1537
    .line 1538
    goto :goto_2d

    .line 1539
    :cond_42
    move v5, v10

    .line 1540
    :cond_43
    invoke-virtual {v3}, Lx8;->isEmpty()Z

    .line 1541
    .line 1542
    .line 1543
    move-result v0

    .line 1544
    if-eqz v0, :cond_44

    .line 1545
    .line 1546
    move-object/from16 v0, v30

    .line 1547
    .line 1548
    goto :goto_2e

    .line 1549
    :cond_44
    iget-object v0, v3, Lx8;->e:[Ljava/lang/Object;

    .line 1550
    .line 1551
    iget v1, v3, Lx8;->d:I

    .line 1552
    .line 1553
    aget-object v0, v0, v1

    .line 1554
    .line 1555
    :goto_2e
    check-cast v0, Lw80;

    .line 1556
    .line 1557
    if-eqz v0, :cond_45

    .line 1558
    .line 1559
    iget v0, v0, Lw80;->a:I

    .line 1560
    .line 1561
    goto :goto_2f

    .line 1562
    :cond_45
    const/4 v0, 0x0

    .line 1563
    :goto_2f
    invoke-virtual {v3}, Lx8;->f()Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v1

    .line 1567
    check-cast v1, Lw80;

    .line 1568
    .line 1569
    if-eqz v1, :cond_46

    .line 1570
    .line 1571
    iget v1, v1, Lw80;->a:I

    .line 1572
    .line 1573
    goto :goto_30

    .line 1574
    :cond_46
    const/4 v1, 0x0

    .line 1575
    :goto_30
    iget-object v6, v6, Lr80;->b:Lp80;

    .line 1576
    .line 1577
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1578
    .line 1579
    .line 1580
    sget-object v6, Lt20;->a:Ltg0;

    .line 1581
    .line 1582
    move-object/from16 v9, p0

    .line 1583
    .line 1584
    iget-object v9, v9, Lu80;->f:Ljo0;

    .line 1585
    .line 1586
    if-eqz v9, :cond_5a

    .line 1587
    .line 1588
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v9

    .line 1592
    if-nez v9, :cond_5a

    .line 1593
    .line 1594
    iget v9, v6, Ltg0;->b:I

    .line 1595
    .line 1596
    if-eqz v9, :cond_5a

    .line 1597
    .line 1598
    sub-int/2addr v1, v0

    .line 1599
    if-ltz v1, :cond_4c

    .line 1600
    .line 1601
    if-nez v9, :cond_47

    .line 1602
    .line 1603
    goto :goto_34

    .line 1604
    :cond_47
    const/4 v1, 0x0

    .line 1605
    invoke-static {v1, v9}, Lw60;->O(II)Lz20;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v9

    .line 1609
    iget v1, v9, Lx20;->d:I

    .line 1610
    .line 1611
    iget v9, v9, Lx20;->e:I

    .line 1612
    .line 1613
    if-gt v1, v9, :cond_4a

    .line 1614
    .line 1615
    const/16 p0, -0x1

    .line 1616
    .line 1617
    :goto_31
    invoke-virtual {v6, v1}, Ltg0;->b(I)I

    .line 1618
    .line 1619
    .line 1620
    move-result v10

    .line 1621
    if-gt v10, v0, :cond_49

    .line 1622
    .line 1623
    invoke-virtual {v6, v1}, Ltg0;->b(I)I

    .line 1624
    .line 1625
    .line 1626
    move-result v10

    .line 1627
    if-eq v1, v9, :cond_48

    .line 1628
    .line 1629
    add-int/lit8 v1, v1, 0x1

    .line 1630
    .line 1631
    move/from16 p0, v10

    .line 1632
    .line 1633
    goto :goto_31

    .line 1634
    :cond_48
    :goto_32
    const/4 v0, -0x1

    .line 1635
    goto :goto_33

    .line 1636
    :cond_49
    move/from16 v10, p0

    .line 1637
    .line 1638
    goto :goto_32

    .line 1639
    :cond_4a
    const/4 v0, -0x1

    .line 1640
    const/4 v10, -0x1

    .line 1641
    :goto_33
    if-ne v10, v0, :cond_4b

    .line 1642
    .line 1643
    sget-object v0, Lt20;->a:Ltg0;

    .line 1644
    .line 1645
    goto :goto_35

    .line 1646
    :cond_4b
    new-instance v0, Ltg0;

    .line 1647
    .line 1648
    move/from16 v1, v19

    .line 1649
    .line 1650
    invoke-direct {v0, v1}, Ltg0;-><init>(I)V

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v0, v10}, Ltg0;->a(I)V

    .line 1654
    .line 1655
    .line 1656
    goto :goto_35

    .line 1657
    :cond_4c
    :goto_34
    move-object v0, v6

    .line 1658
    :goto_35
    new-instance v1, Ljava/util/ArrayList;

    .line 1659
    .line 1660
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1661
    .line 1662
    .line 1663
    new-instance v9, Ljava/util/ArrayList;

    .line 1664
    .line 1665
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1666
    .line 1667
    .line 1668
    move-result v10

    .line 1669
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 1673
    .line 1674
    .line 1675
    move-result v10

    .line 1676
    move-object/from16 v28, v2

    .line 1677
    .line 1678
    const/4 v2, 0x0

    .line 1679
    :goto_36
    if-ge v2, v10, :cond_4f

    .line 1680
    .line 1681
    move/from16 p0, v10

    .line 1682
    .line 1683
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v10

    .line 1687
    move/from16 v16, v2

    .line 1688
    .line 1689
    move-object v2, v10

    .line 1690
    check-cast v2, Lw80;

    .line 1691
    .line 1692
    iget v2, v2, Lw80;->a:I

    .line 1693
    .line 1694
    move-object/from16 v39, v7

    .line 1695
    .line 1696
    iget-object v7, v6, Ltg0;->a:[I

    .line 1697
    .line 1698
    move-object/from16 v17, v7

    .line 1699
    .line 1700
    iget v7, v6, Ltg0;->b:I

    .line 1701
    .line 1702
    move-object/from16 v18, v6

    .line 1703
    .line 1704
    const/4 v6, 0x0

    .line 1705
    :goto_37
    if-ge v6, v7, :cond_4e

    .line 1706
    .line 1707
    move/from16 v34, v6

    .line 1708
    .line 1709
    aget v6, v17, v34

    .line 1710
    .line 1711
    if-ne v6, v2, :cond_4d

    .line 1712
    .line 1713
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1714
    .line 1715
    .line 1716
    goto :goto_38

    .line 1717
    :cond_4d
    add-int/lit8 v6, v34, 0x1

    .line 1718
    .line 1719
    goto :goto_37

    .line 1720
    :cond_4e
    :goto_38
    add-int/lit8 v2, v16, 0x1

    .line 1721
    .line 1722
    move/from16 v10, p0

    .line 1723
    .line 1724
    move-object/from16 v6, v18

    .line 1725
    .line 1726
    move-object/from16 v7, v39

    .line 1727
    .line 1728
    goto :goto_36

    .line 1729
    :cond_4f
    move-object/from16 v39, v7

    .line 1730
    .line 1731
    iget-object v2, v0, Ltg0;->a:[I

    .line 1732
    .line 1733
    iget v0, v0, Ltg0;->b:I

    .line 1734
    .line 1735
    const/4 v6, 0x0

    .line 1736
    :goto_39
    if-ge v6, v0, :cond_59

    .line 1737
    .line 1738
    aget v7, v2, v6

    .line 1739
    .line 1740
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v10

    .line 1744
    const/16 v16, 0x0

    .line 1745
    .line 1746
    :goto_3a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1747
    .line 1748
    .line 1749
    move-result v17

    .line 1750
    if-eqz v17, :cond_51

    .line 1751
    .line 1752
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v17

    .line 1756
    move/from16 v18, v0

    .line 1757
    .line 1758
    move-object/from16 v0, v17

    .line 1759
    .line 1760
    check-cast v0, Lw80;

    .line 1761
    .line 1762
    iget v0, v0, Lw80;->a:I

    .line 1763
    .line 1764
    if-ne v0, v7, :cond_50

    .line 1765
    .line 1766
    move/from16 v10, v16

    .line 1767
    .line 1768
    :goto_3b
    const/4 v0, -0x1

    .line 1769
    goto :goto_3c

    .line 1770
    :cond_50
    add-int/lit8 v16, v16, 0x1

    .line 1771
    .line 1772
    move/from16 v0, v18

    .line 1773
    .line 1774
    goto :goto_3a

    .line 1775
    :cond_51
    move/from16 v18, v0

    .line 1776
    .line 1777
    const/4 v10, -0x1

    .line 1778
    goto :goto_3b

    .line 1779
    :goto_3c
    if-ne v10, v0, :cond_52

    .line 1780
    .line 1781
    move-object/from16 p0, v1

    .line 1782
    .line 1783
    move-wide/from16 v0, v24

    .line 1784
    .line 1785
    invoke-virtual {v14, v7, v0, v1}, Lt80;->a(IJ)Lw80;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v16

    .line 1789
    :goto_3d
    move-object/from16 v0, v16

    .line 1790
    .line 1791
    goto :goto_3e

    .line 1792
    :cond_52
    move-object/from16 p0, v1

    .line 1793
    .line 1794
    move-wide/from16 v0, v24

    .line 1795
    .line 1796
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v16

    .line 1800
    check-cast v16, Lw80;

    .line 1801
    .line 1802
    goto :goto_3d

    .line 1803
    :goto_3e
    iget v1, v0, Lw80;->k:I

    .line 1804
    .line 1805
    move/from16 v16, v1

    .line 1806
    .line 1807
    const/4 v1, -0x1

    .line 1808
    if-ne v10, v1, :cond_53

    .line 1809
    .line 1810
    move-object v10, v2

    .line 1811
    const/high16 v1, -0x80000000

    .line 1812
    .line 1813
    goto :goto_3f

    .line 1814
    :cond_53
    const/4 v10, 0x0

    .line 1815
    invoke-virtual {v0, v10}, Lw80;->a(I)J

    .line 1816
    .line 1817
    .line 1818
    move-result-wide v33

    .line 1819
    move-object v10, v2

    .line 1820
    shr-long v1, v33, v26

    .line 1821
    .line 1822
    long-to-int v1, v1

    .line 1823
    :goto_3f
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1824
    .line 1825
    .line 1826
    move-result v2

    .line 1827
    move/from16 v33, v6

    .line 1828
    .line 1829
    const/4 v6, 0x0

    .line 1830
    :goto_40
    if-ge v6, v2, :cond_55

    .line 1831
    .line 1832
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v34

    .line 1836
    move/from16 v40, v2

    .line 1837
    .line 1838
    move-object/from16 v2, v34

    .line 1839
    .line 1840
    check-cast v2, Lw80;

    .line 1841
    .line 1842
    iget v2, v2, Lw80;->a:I

    .line 1843
    .line 1844
    if-eq v2, v7, :cond_54

    .line 1845
    .line 1846
    goto :goto_41

    .line 1847
    :cond_54
    add-int/lit8 v6, v6, 0x1

    .line 1848
    .line 1849
    move/from16 v2, v40

    .line 1850
    .line 1851
    goto :goto_40

    .line 1852
    :cond_55
    move-object/from16 v34, v30

    .line 1853
    .line 1854
    :goto_41
    move-object/from16 v2, v34

    .line 1855
    .line 1856
    check-cast v2, Lw80;

    .line 1857
    .line 1858
    if-eqz v2, :cond_56

    .line 1859
    .line 1860
    const/4 v6, 0x0

    .line 1861
    invoke-virtual {v2, v6}, Lw80;->a(I)J

    .line 1862
    .line 1863
    .line 1864
    move-result-wide v40

    .line 1865
    shr-long v6, v40, v26

    .line 1866
    .line 1867
    long-to-int v2, v6

    .line 1868
    :goto_42
    const/high16 v6, -0x80000000

    .line 1869
    .line 1870
    goto :goto_43

    .line 1871
    :cond_56
    const/high16 v2, -0x80000000

    .line 1872
    .line 1873
    goto :goto_42

    .line 1874
    :goto_43
    if-ne v1, v6, :cond_57

    .line 1875
    .line 1876
    move/from16 v1, v38

    .line 1877
    .line 1878
    move v7, v1

    .line 1879
    goto :goto_44

    .line 1880
    :cond_57
    move/from16 v7, v38

    .line 1881
    .line 1882
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 1883
    .line 1884
    .line 1885
    move-result v1

    .line 1886
    :goto_44
    if-eq v2, v6, :cond_58

    .line 1887
    .line 1888
    sub-int v2, v2, v16

    .line 1889
    .line 1890
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 1891
    .line 1892
    .line 1893
    move-result v1

    .line 1894
    :cond_58
    const/4 v2, 0x1

    .line 1895
    iput-boolean v2, v0, Lw80;->m:Z

    .line 1896
    .line 1897
    invoke-virtual {v0, v1, v5, v11}, Lw80;->c(III)V

    .line 1898
    .line 1899
    .line 1900
    move-object/from16 v1, p0

    .line 1901
    .line 1902
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1903
    .line 1904
    .line 1905
    add-int/lit8 v0, v33, 0x1

    .line 1906
    .line 1907
    move v6, v0

    .line 1908
    move/from16 v38, v7

    .line 1909
    .line 1910
    move-object v2, v10

    .line 1911
    move/from16 v0, v18

    .line 1912
    .line 1913
    goto/16 :goto_39

    .line 1914
    .line 1915
    :cond_59
    move/from16 v7, v38

    .line 1916
    .line 1917
    const/4 v2, 0x1

    .line 1918
    goto :goto_45

    .line 1919
    :cond_5a
    move-object/from16 v28, v2

    .line 1920
    .line 1921
    move-object/from16 v39, v7

    .line 1922
    .line 1923
    move/from16 v2, v19

    .line 1924
    .line 1925
    move/from16 v7, v38

    .line 1926
    .line 1927
    move-object/from16 v1, v35

    .line 1928
    .line 1929
    :goto_45
    if-eqz v47, :cond_5c

    .line 1930
    .line 1931
    invoke-static {v13}, Lye;->K(Ljava/util/List;)Ljava/lang/Object;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v0

    .line 1935
    check-cast v0, Lw80;

    .line 1936
    .line 1937
    if-eqz v0, :cond_5b

    .line 1938
    .line 1939
    iget v0, v0, Lw80;->a:I

    .line 1940
    .line 1941
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v0

    .line 1945
    goto :goto_47

    .line 1946
    :cond_5b
    move-object/from16 v0, v30

    .line 1947
    .line 1948
    goto :goto_47

    .line 1949
    :cond_5c
    invoke-virtual {v3}, Lx8;->isEmpty()Z

    .line 1950
    .line 1951
    .line 1952
    move-result v0

    .line 1953
    if-eqz v0, :cond_5d

    .line 1954
    .line 1955
    move-object/from16 v0, v30

    .line 1956
    .line 1957
    goto :goto_46

    .line 1958
    :cond_5d
    iget-object v0, v3, Lx8;->e:[Ljava/lang/Object;

    .line 1959
    .line 1960
    iget v6, v3, Lx8;->d:I

    .line 1961
    .line 1962
    aget-object v0, v0, v6

    .line 1963
    .line 1964
    :goto_46
    check-cast v0, Lw80;

    .line 1965
    .line 1966
    if-eqz v0, :cond_5b

    .line 1967
    .line 1968
    iget v0, v0, Lw80;->a:I

    .line 1969
    .line 1970
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v0

    .line 1974
    :goto_47
    if-eqz v47, :cond_5f

    .line 1975
    .line 1976
    invoke-static {v13}, Lye;->Q(Ljava/util/List;)Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v3

    .line 1980
    check-cast v3, Lw80;

    .line 1981
    .line 1982
    if-eqz v3, :cond_5e

    .line 1983
    .line 1984
    iget v3, v3, Lw80;->a:I

    .line 1985
    .line 1986
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v30

    .line 1990
    :cond_5e
    :goto_48
    move/from16 v3, v51

    .line 1991
    .line 1992
    goto :goto_49

    .line 1993
    :cond_5f
    invoke-virtual {v3}, Lx8;->f()Ljava/lang/Object;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v3

    .line 1997
    check-cast v3, Lw80;

    .line 1998
    .line 1999
    if-eqz v3, :cond_5e

    .line 2000
    .line 2001
    iget v3, v3, Lw80;->a:I

    .line 2002
    .line 2003
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v30

    .line 2007
    goto :goto_48

    .line 2008
    :goto_49
    if-lt v3, v8, :cond_61

    .line 2009
    .line 2010
    if-le v12, v4, :cond_60

    .line 2011
    .line 2012
    goto :goto_4a

    .line 2013
    :cond_60
    const/4 v2, 0x0

    .line 2014
    :cond_61
    :goto_4a
    new-instance v3, Lzj;

    .line 2015
    .line 2016
    move-object/from16 v4, v39

    .line 2017
    .line 2018
    invoke-direct {v3, v4, v13, v1, v15}, Lzj;-><init>(Loh0;Ljava/util/ArrayList;Ljava/util/List;Z)V

    .line 2019
    .line 2020
    .line 2021
    add-int v5, v5, v29

    .line 2022
    .line 2023
    move-wide/from16 v9, p2

    .line 2024
    .line 2025
    invoke-static {v5, v9, v10}, Lqj;->f(IJ)I

    .line 2026
    .line 2027
    .line 2028
    move-result v4

    .line 2029
    add-int v11, v11, v27

    .line 2030
    .line 2031
    invoke-static {v11, v9, v10}, Lqj;->e(IJ)I

    .line 2032
    .line 2033
    .line 2034
    move-result v5

    .line 2035
    move-object/from16 v6, v28

    .line 2036
    .line 2037
    move-object/from16 v9, v37

    .line 2038
    .line 2039
    invoke-interface {v6, v4, v5, v9, v3}, Lzd0;->Q(IILjava/util/Map;Lsw;)Lyd0;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v9

    .line 2043
    if-eqz v0, :cond_62

    .line 2044
    .line 2045
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2046
    .line 2047
    .line 2048
    move-result v0

    .line 2049
    goto :goto_4b

    .line 2050
    :cond_62
    const/4 v0, 0x0

    .line 2051
    :goto_4b
    if-eqz v30, :cond_63

    .line 2052
    .line 2053
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Integer;->intValue()I

    .line 2054
    .line 2055
    .line 2056
    move-result v3

    .line 2057
    goto :goto_4c

    .line 2058
    :cond_63
    const/4 v3, 0x0

    .line 2059
    :goto_4c
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2060
    .line 2061
    .line 2062
    move-result v4

    .line 2063
    if-eqz v4, :cond_64

    .line 2064
    .line 2065
    move-object/from16 v16, v35

    .line 2066
    .line 2067
    goto :goto_4e

    .line 2068
    :cond_64
    new-instance v4, Ljava/util/ArrayList;

    .line 2069
    .line 2070
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2071
    .line 2072
    .line 2073
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 2074
    .line 2075
    .line 2076
    move-result v1

    .line 2077
    const/4 v5, 0x0

    .line 2078
    :goto_4d
    if-ge v5, v1, :cond_66

    .line 2079
    .line 2080
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v10

    .line 2084
    check-cast v10, Lw80;

    .line 2085
    .line 2086
    iget v11, v10, Lw80;->a:I

    .line 2087
    .line 2088
    if-gt v0, v11, :cond_65

    .line 2089
    .line 2090
    if-gt v11, v3, :cond_65

    .line 2091
    .line 2092
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2093
    .line 2094
    .line 2095
    :cond_65
    add-int/lit8 v5, v5, 0x1

    .line 2096
    .line 2097
    goto :goto_4d

    .line 2098
    :cond_66
    sget-object v0, Lo30;->k:Lh6;

    .line 2099
    .line 2100
    invoke-static {v4, v0}, Ldf;->F(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2101
    .line 2102
    .line 2103
    move-object/from16 v16, v4

    .line 2104
    .line 2105
    :goto_4e
    new-instance v4, Lv80;

    .line 2106
    .line 2107
    iget-wide v14, v14, Lt80;->d:J

    .line 2108
    .line 2109
    move-object/from16 v13, p1

    .line 2110
    .line 2111
    move-object/from16 v24, v6

    .line 2112
    .line 2113
    move/from16 v17, v7

    .line 2114
    .line 2115
    move/from16 v19, v8

    .line 2116
    .line 2117
    move-object/from16 v12, v31

    .line 2118
    .line 2119
    move/from16 v18, v36

    .line 2120
    .line 2121
    move/from16 v8, v42

    .line 2122
    .line 2123
    move/from16 v11, v43

    .line 2124
    .line 2125
    move/from16 v6, v44

    .line 2126
    .line 2127
    move/from16 v10, v46

    .line 2128
    .line 2129
    move-object/from16 v5, v50

    .line 2130
    .line 2131
    move v7, v2

    .line 2132
    invoke-direct/range {v4 .. v22}, Lv80;-><init>(Lw80;IZFLyd0;FZLyk;Lym;JLjava/util/List;IIILum0;II)V

    .line 2133
    .line 2134
    .line 2135
    :goto_4f
    invoke-interface/range {v24 .. v24}, Ll30;->m()Z

    .line 2136
    .line 2137
    .line 2138
    move-result v0

    .line 2139
    move-object/from16 v3, v32

    .line 2140
    .line 2141
    const/4 v1, 0x0

    .line 2142
    invoke-virtual {v3, v4, v0, v1}, Lc90;->f(Lv80;ZZ)V

    .line 2143
    .line 2144
    .line 2145
    iget-object v0, v3, Lc90;->a:Ldm;

    .line 2146
    .line 2147
    return-object v4

    .line 2148
    :goto_50
    invoke-static {v8, v11, v9}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 2149
    .line 2150
    .line 2151
    throw v0

    .line 2152
    :cond_67
    const-string v0, "null horizontalAlignment when isVertical == false"

    .line 2153
    .line 2154
    invoke-static {v0}, Lz10;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 2155
    .line 2156
    .line 2157
    new-instance v0, Lsg;

    .line 2158
    .line 2159
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2160
    .line 2161
    .line 2162
    throw v0
.end method
