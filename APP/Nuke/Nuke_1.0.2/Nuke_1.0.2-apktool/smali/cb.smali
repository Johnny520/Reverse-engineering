.class public final synthetic Lcb;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lcb;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lcb;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcb;->i:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcb;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    sget-object v5, Lnx;->a:Leb;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-boolean v7, v0, Lcb;->i:Z

    .line 14
    .line 15
    iget-object v0, v0, Lcb;->j:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v0, Ltz2;

    .line 21
    .line 22
    iget-object v1, v0, Ltz2;->f:Lnx1;

    .line 23
    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    check-cast v2, Luh1;

    .line 27
    .line 28
    move-object/from16 v2, p2

    .line 29
    .line 30
    check-cast v2, Lpx;

    .line 31
    .line 32
    move-object/from16 v3, p3

    .line 33
    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v2, Lgo0;

    .line 40
    .line 41
    const v3, -0x7f685f60

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Lgo0;->W(I)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Lly;->n:Ltu2;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    sget-object v8, Ld61;->i:Ld61;

    .line 54
    .line 55
    if-ne v3, v8, :cond_0

    .line 56
    .line 57
    move v3, v4

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v3, v6

    .line 60
    :goto_0
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    check-cast v8, Lqv1;

    .line 65
    .line 66
    sget-object v9, Lqv1;->h:Lqv1;

    .line 67
    .line 68
    if-eq v8, v9, :cond_2

    .line 69
    .line 70
    if-nez v3, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v3, v6

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    :goto_1
    move v3, v4

    .line 76
    :goto_2
    invoke-virtual {v2, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    if-nez v8, :cond_3

    .line 85
    .line 86
    if-ne v9, v5, :cond_4

    .line 87
    .line 88
    :cond_3
    new-instance v9, Lxq2;

    .line 89
    .line 90
    const/4 v8, 0x7

    .line 91
    invoke-direct {v9, v8, v0}, Lxq2;-><init>(ILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    check-cast v9, Lin0;

    .line 98
    .line 99
    invoke-static {v9, v2}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    if-ne v9, v5, :cond_5

    .line 108
    .line 109
    new-instance v9, Lpr;

    .line 110
    .line 111
    const/16 v10, 0x16

    .line 112
    .line 113
    invoke-direct {v9, v8, v10}, Lpr;-><init>(Lxk1;I)V

    .line 114
    .line 115
    .line 116
    new-instance v8, Le60;

    .line 117
    .line 118
    invoke-direct {v8, v9}, Le60;-><init>(Lin0;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v9, v8

    .line 125
    :cond_5
    check-cast v9, Lbm2;

    .line 126
    .line 127
    invoke-virtual {v2, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    invoke-virtual {v2, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    or-int/2addr v8, v10

    .line 136
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    if-nez v8, :cond_6

    .line 141
    .line 142
    if-ne v10, v5, :cond_7

    .line 143
    .line 144
    :cond_6
    new-instance v10, Lsz2;

    .line 145
    .line 146
    invoke-direct {v10, v9, v0}, Lsz2;-><init>(Lbm2;Ltz2;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_7
    check-cast v10, Lsz2;

    .line 153
    .line 154
    invoke-virtual {v1}, Lnx1;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Lqv1;

    .line 159
    .line 160
    if-eqz v7, :cond_8

    .line 161
    .line 162
    iget-object v0, v0, Ltz2;->b:Ljx1;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljx1;->g()F

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    const/4 v5, 0x0

    .line 169
    cmpg-float v0, v0, v5

    .line 170
    .line 171
    if-nez v0, :cond_9

    .line 172
    .line 173
    :cond_8
    move v4, v6

    .line 174
    :cond_9
    invoke-static {v10, v1, v4, v3}, Lul2;->b(Lsz2;Lqv1;ZZ)Luh1;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v2, v6}, Lgo0;->p(Z)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_0
    check-cast v0, Lin0;

    .line 183
    .line 184
    move-object/from16 v1, p1

    .line 185
    .line 186
    check-cast v1, Lo71;

    .line 187
    .line 188
    move-object/from16 v5, p2

    .line 189
    .line 190
    check-cast v5, Lpx;

    .line 191
    .line 192
    move-object/from16 v8, p3

    .line 193
    .line 194
    check-cast v8, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    and-int/lit8 v1, v8, 0x11

    .line 204
    .line 205
    if-eq v1, v3, :cond_a

    .line 206
    .line 207
    move v6, v4

    .line 208
    :cond_a
    and-int/lit8 v1, v8, 0x1

    .line 209
    .line 210
    move-object v11, v5

    .line 211
    check-cast v11, Lgo0;

    .line 212
    .line 213
    invoke-virtual {v11, v1, v6}, Lgo0;->O(IZ)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_b

    .line 218
    .line 219
    const v1, 0x790b0149

    .line 220
    .line 221
    .line 222
    invoke-static {v1, v11}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    new-instance v1, Lsr;

    .line 227
    .line 228
    invoke-direct {v1, v0, v7}, Lsr;-><init>(Lin0;Z)V

    .line 229
    .line 230
    .line 231
    const v0, -0x582f7bbc    # -5.7875E-15f

    .line 232
    .line 233
    .line 234
    invoke-static {v0, v1, v11}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    const/16 v12, 0x180

    .line 239
    .line 240
    const/4 v13, 0x1

    .line 241
    const/4 v8, 0x0

    .line 242
    invoke-static/range {v8 .. v13}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_b
    invoke-virtual {v11}, Lgo0;->R()V

    .line 247
    .line 248
    .line 249
    :goto_3
    return-object v2

    .line 250
    :pswitch_1
    check-cast v0, Lxk1;

    .line 251
    .line 252
    move-object/from16 v1, p1

    .line 253
    .line 254
    check-cast v1, Lbv;

    .line 255
    .line 256
    move-object/from16 v8, p2

    .line 257
    .line 258
    check-cast v8, Lpx;

    .line 259
    .line 260
    move-object/from16 v9, p3

    .line 261
    .line 262
    check-cast v9, Ljava/lang/Integer;

    .line 263
    .line 264
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    and-int/lit8 v1, v9, 0x11

    .line 272
    .line 273
    if-eq v1, v3, :cond_c

    .line 274
    .line 275
    move v1, v4

    .line 276
    goto :goto_4

    .line 277
    :cond_c
    move v1, v6

    .line 278
    :goto_4
    and-int/lit8 v3, v9, 0x1

    .line 279
    .line 280
    check-cast v8, Lgo0;

    .line 281
    .line 282
    invoke-virtual {v8, v3, v1}, Lgo0;->O(IZ)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_10

    .line 287
    .line 288
    const/4 v14, 0x7

    .line 289
    sget-object v15, Lrh1;->a:Lrh1;

    .line 290
    .line 291
    const/4 v10, 0x0

    .line 292
    const/4 v11, 0x0

    .line 293
    const/4 v12, 0x0

    .line 294
    const/high16 v13, 0x41000000    # 8.0f

    .line 295
    .line 296
    move-object v9, v15

    .line 297
    invoke-static/range {v9 .. v14}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    move-object v1, v9

    .line 302
    move v3, v13

    .line 303
    const v4, 0x790b00e5

    .line 304
    .line 305
    .line 306
    invoke-static {v4, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    sget-object v4, Lur1;->a:Ltu2;

    .line 311
    .line 312
    invoke-virtual {v8, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v11

    .line 316
    check-cast v11, Llp1;

    .line 317
    .line 318
    iget-wide v13, v11, Llp1;->f:J

    .line 319
    .line 320
    const/16 v11, 0xd

    .line 321
    .line 322
    invoke-static {v11}, Lrg3;->D(I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v15

    .line 326
    const/16 v11, 0x12

    .line 327
    .line 328
    invoke-static {v11}, Lrg3;->D(I)J

    .line 329
    .line 330
    .line 331
    move-result-wide v21

    .line 332
    sget-object v28, Lim0;->k:Lim0;

    .line 333
    .line 334
    new-instance v12, Lm13;

    .line 335
    .line 336
    const/16 v24, 0x0

    .line 337
    .line 338
    const v25, 0xfdfff8

    .line 339
    .line 340
    .line 341
    const-wide/16 v18, 0x0

    .line 342
    .line 343
    const/16 v20, 0x0

    .line 344
    .line 345
    const/16 v23, 0x0

    .line 346
    .line 347
    move-object/from16 v17, v28

    .line 348
    .line 349
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 350
    .line 351
    .line 352
    const/16 v17, 0x30

    .line 353
    .line 354
    const/16 v18, 0x3f8

    .line 355
    .line 356
    move-object v11, v12

    .line 357
    const/4 v12, 0x0

    .line 358
    const/4 v13, 0x0

    .line 359
    const/4 v14, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    move-object/from16 v16, v8

    .line 362
    .line 363
    invoke-static/range {v9 .. v18}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 364
    .line 365
    .line 366
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    check-cast v9, Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {v8, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v11

    .line 380
    if-nez v10, :cond_d

    .line 381
    .line 382
    if-ne v11, v5, :cond_e

    .line 383
    .line 384
    :cond_d
    new-instance v11, Lpr;

    .line 385
    .line 386
    const/16 v5, 0x8

    .line 387
    .line 388
    invoke-direct {v11, v0, v5}, Lpr;-><init>(Lxk1;I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v8, v11}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :cond_e
    move-object v10, v11

    .line 395
    check-cast v10, Lin0;

    .line 396
    .line 397
    const v5, 0x790b00e3

    .line 398
    .line 399
    .line 400
    invoke-static {v5, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v12

    .line 404
    new-instance v5, Lm51;

    .line 405
    .line 406
    const/4 v11, 0x3

    .line 407
    const/16 v13, 0x7b

    .line 408
    .line 409
    invoke-direct {v5, v11, v13}, Lm51;-><init>(II)V

    .line 410
    .line 411
    .line 412
    const/16 v25, 0x180

    .line 413
    .line 414
    const/16 v26, 0x2ff4

    .line 415
    .line 416
    const/4 v11, 0x0

    .line 417
    const/4 v13, 0x0

    .line 418
    const/4 v14, 0x0

    .line 419
    const/4 v15, 0x0

    .line 420
    const/16 v16, 0x0

    .line 421
    .line 422
    const/16 v17, 0x0

    .line 423
    .line 424
    const/16 v18, 0x0

    .line 425
    .line 426
    const/16 v19, 0x0

    .line 427
    .line 428
    const/16 v20, 0x0

    .line 429
    .line 430
    const/16 v22, 0x0

    .line 431
    .line 432
    const/16 v24, 0x0

    .line 433
    .line 434
    move-object/from16 v21, v5

    .line 435
    .line 436
    move-object/from16 v23, v8

    .line 437
    .line 438
    invoke-static/range {v9 .. v26}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 439
    .line 440
    .line 441
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    check-cast v0, Ljava/lang/String;

    .line 446
    .line 447
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-nez v0, :cond_f

    .line 452
    .line 453
    if-nez v7, :cond_f

    .line 454
    .line 455
    const v0, -0x20e9b43e

    .line 456
    .line 457
    .line 458
    invoke-virtual {v8, v0}, Lgo0;->W(I)V

    .line 459
    .line 460
    .line 461
    const/16 v19, 0x0

    .line 462
    .line 463
    const/16 v20, 0xd

    .line 464
    .line 465
    const/16 v16, 0x0

    .line 466
    .line 467
    const/16 v18, 0x0

    .line 468
    .line 469
    move-object v15, v1

    .line 470
    move/from16 v17, v3

    .line 471
    .line 472
    invoke-static/range {v15 .. v20}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    const v0, 0x790b00e4

    .line 477
    .line 478
    .line 479
    invoke-static {v0, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v9

    .line 483
    invoke-virtual {v8, v4}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    check-cast v0, Llp1;

    .line 488
    .line 489
    iget-wide v0, v0, Llp1;->g:J

    .line 490
    .line 491
    const/16 v3, 0xc

    .line 492
    .line 493
    invoke-static {v3}, Lrg3;->D(I)J

    .line 494
    .line 495
    .line 496
    move-result-wide v26

    .line 497
    const/16 v3, 0x11

    .line 498
    .line 499
    invoke-static {v3}, Lrg3;->D(I)J

    .line 500
    .line 501
    .line 502
    move-result-wide v32

    .line 503
    new-instance v23, Lm13;

    .line 504
    .line 505
    const/16 v35, 0x0

    .line 506
    .line 507
    const v36, 0xfdfff8

    .line 508
    .line 509
    .line 510
    const-wide/16 v29, 0x0

    .line 511
    .line 512
    const/16 v31, 0x0

    .line 513
    .line 514
    const/16 v34, 0x0

    .line 515
    .line 516
    move-wide/from16 v24, v0

    .line 517
    .line 518
    invoke-direct/range {v23 .. v36}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 519
    .line 520
    .line 521
    const/16 v17, 0x30

    .line 522
    .line 523
    const/16 v18, 0x3f8

    .line 524
    .line 525
    const/4 v12, 0x0

    .line 526
    const/4 v13, 0x0

    .line 527
    const/4 v14, 0x0

    .line 528
    const/4 v15, 0x0

    .line 529
    move-object/from16 v16, v8

    .line 530
    .line 531
    move-object/from16 v11, v23

    .line 532
    .line 533
    invoke-static/range {v9 .. v18}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v8, v6}, Lgo0;->p(Z)V

    .line 537
    .line 538
    .line 539
    goto :goto_5

    .line 540
    :cond_f
    const v0, -0x20e3a86c

    .line 541
    .line 542
    .line 543
    invoke-virtual {v8, v0}, Lgo0;->W(I)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v8, v6}, Lgo0;->p(Z)V

    .line 547
    .line 548
    .line 549
    goto :goto_5

    .line 550
    :cond_10
    invoke-virtual {v8}, Lgo0;->R()V

    .line 551
    .line 552
    .line 553
    :goto_5
    return-object v2

    .line 554
    :pswitch_2
    check-cast v0, Lxm0;

    .line 555
    .line 556
    move-object/from16 v1, p1

    .line 557
    .line 558
    check-cast v1, Luh1;

    .line 559
    .line 560
    move-object/from16 v2, p2

    .line 561
    .line 562
    check-cast v2, Lpx;

    .line 563
    .line 564
    move-object/from16 v3, p3

    .line 565
    .line 566
    check-cast v3, Ljava/lang/Integer;

    .line 567
    .line 568
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    check-cast v2, Lgo0;

    .line 572
    .line 573
    const v3, -0xbba9706

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v3}, Lgo0;->W(I)V

    .line 577
    .line 578
    .line 579
    sget-object v3, Lh13;->a:Lmy;

    .line 580
    .line 581
    invoke-virtual {v2, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    check-cast v3, Lg13;

    .line 586
    .line 587
    iget-wide v3, v3, Lg13;->a:J

    .line 588
    .line 589
    invoke-virtual {v2, v3, v4}, Lgo0;->e(J)Z

    .line 590
    .line 591
    .line 592
    move-result v8

    .line 593
    invoke-virtual {v2, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v9

    .line 597
    or-int/2addr v8, v9

    .line 598
    invoke-virtual {v2, v7}, Lgo0;->g(Z)Z

    .line 599
    .line 600
    .line 601
    move-result v9

    .line 602
    or-int/2addr v8, v9

    .line 603
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    if-nez v8, :cond_11

    .line 608
    .line 609
    if-ne v9, v5, :cond_12

    .line 610
    .line 611
    :cond_11
    new-instance v9, Ldb;

    .line 612
    .line 613
    invoke-direct {v9, v3, v4, v0, v7}, Ldb;-><init>(JLxm0;Z)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :cond_12
    check-cast v9, Lin0;

    .line 620
    .line 621
    invoke-static {v1, v9}, Lqp0;->t(Luh1;Lin0;)Luh1;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v2, v6}, Lgo0;->p(Z)V

    .line 626
    .line 627
    .line 628
    return-object v0

    .line 629
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
