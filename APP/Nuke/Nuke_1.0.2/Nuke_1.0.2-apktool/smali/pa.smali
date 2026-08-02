.class public abstract Lpa;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lmy;

.field public static final b:Lmy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lq7;->q:Lq7;

    .line 2
    .line 3
    new-instance v1, Lmy;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lmy;-><init>(Lxm0;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lpa;->a:Lmy;

    .line 9
    .line 10
    sget-object v0, Lq7;->p:Lq7;

    .line 11
    .line 12
    new-instance v1, Lmy;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lmy;-><init>(Lxm0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lpa;->b:Lmy;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Lg22;Lxm0;Lh22;Lkw;Lpx;II)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p3

    .line 4
    .line 5
    move/from16 v10, p5

    .line 6
    .line 7
    move-object/from16 v11, p4

    .line 8
    .line 9
    check-cast v11, Lgo0;

    .line 10
    .line 11
    const v0, -0x699ff8ef

    .line 12
    .line 13
    .line 14
    invoke-virtual {v11, v0}, Lgo0;->X(I)Lgo0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, v10, 0x6

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v11, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int/2addr v0, v10

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v10

    .line 33
    :goto_1
    and-int/lit8 v2, p6, 0x2

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    or-int/lit8 v0, v0, 0x30

    .line 38
    .line 39
    :cond_2
    move-object/from16 v3, p1

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    and-int/lit8 v3, v10, 0x30

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    move-object/from16 v3, p1

    .line 47
    .line 48
    invoke-virtual {v11, v3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_4

    .line 53
    .line 54
    const/16 v4, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    const/16 v4, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v0, v4

    .line 60
    :goto_3
    and-int/lit16 v4, v10, 0x180

    .line 61
    .line 62
    if-nez v4, :cond_6

    .line 63
    .line 64
    move-object/from16 v4, p2

    .line 65
    .line 66
    invoke-virtual {v11, v4}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    const/16 v5, 0x100

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_5
    const/16 v5, 0x80

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v5

    .line 78
    goto :goto_5

    .line 79
    :cond_6
    move-object/from16 v4, p2

    .line 80
    .line 81
    :goto_5
    and-int/lit16 v5, v10, 0xc00

    .line 82
    .line 83
    if-nez v5, :cond_8

    .line 84
    .line 85
    invoke-virtual {v11, v9}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_7

    .line 90
    .line 91
    const/16 v5, 0x800

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_7
    const/16 v5, 0x400

    .line 95
    .line 96
    :goto_6
    or-int/2addr v0, v5

    .line 97
    :cond_8
    and-int/lit16 v5, v0, 0x493

    .line 98
    .line 99
    const/16 v6, 0x492

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    if-eq v5, v6, :cond_9

    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    goto :goto_7

    .line 106
    :cond_9
    move v5, v8

    .line 107
    :goto_7
    and-int/lit8 v6, v0, 0x1

    .line 108
    .line 109
    invoke-virtual {v11, v6, v5}, Lgo0;->O(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_1f

    .line 114
    .line 115
    if-eqz v2, :cond_a

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_a
    move-object/from16 v18, v3

    .line 121
    .line 122
    :goto_8
    sget-object v2, Lr7;->f:Ltu2;

    .line 123
    .line 124
    invoke-virtual {v11, v2}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Landroid/view/View;

    .line 129
    .line 130
    sget-object v3, Lly;->h:Ltu2;

    .line 131
    .line 132
    invoke-virtual {v11, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, Le70;

    .line 137
    .line 138
    sget-object v6, Lpa;->a:Lmy;

    .line 139
    .line 140
    invoke-virtual {v11, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    move-object/from16 v20, v6

    .line 145
    .line 146
    check-cast v20, Ljava/lang/String;

    .line 147
    .line 148
    sget-object v6, Lly;->n:Ltu2;

    .line 149
    .line 150
    invoke-virtual {v11, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    move-object/from16 v21, v6

    .line 155
    .line 156
    check-cast v21, Ld61;

    .line 157
    .line 158
    invoke-static {v11}, Lrg3;->L(Lpx;)Leo0;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-static {v9, v11}, Lop0;->x(Ljava/lang/Object;Lpx;)Lxk1;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    new-array v5, v8, [Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    sget-object v13, Lnx;->a:Leb;

    .line 173
    .line 174
    if-ne v7, v13, :cond_b

    .line 175
    .line 176
    sget-object v7, Lq7;->r:Lq7;

    .line 177
    .line 178
    invoke-virtual {v11, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    check-cast v7, Lxm0;

    .line 182
    .line 183
    const/16 v8, 0x30

    .line 184
    .line 185
    invoke-static {v5, v7, v11, v8}, Lgf1;->M([Ljava/lang/Object;Lxm0;Lpx;I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    move-object v7, v5

    .line 190
    check-cast v7, Ljava/util/UUID;

    .line 191
    .line 192
    sget-object v5, Lpa;->b:Lmy;

    .line 193
    .line 194
    invoke-virtual {v11, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    if-ne v5, v13, :cond_c

    .line 209
    .line 210
    move/from16 v22, v0

    .line 211
    .line 212
    new-instance v0, Ld22;

    .line 213
    .line 214
    move-object v5, v4

    .line 215
    move-object v4, v2

    .line 216
    move-object v2, v5

    .line 217
    move-object v5, v3

    .line 218
    move-object/from16 v23, v6

    .line 219
    .line 220
    move-object/from16 v3, v20

    .line 221
    .line 222
    move/from16 v14, v22

    .line 223
    .line 224
    const/4 v15, 0x1

    .line 225
    move-object v6, v1

    .line 226
    move-object/from16 v1, v18

    .line 227
    .line 228
    invoke-direct/range {v0 .. v8}, Ld22;-><init>(Lxm0;Lh22;Ljava/lang/String;Landroid/view/View;Le70;Lg22;Ljava/util/UUID;Z)V

    .line 229
    .line 230
    .line 231
    move-object v1, v6

    .line 232
    new-instance v2, Loa;

    .line 233
    .line 234
    invoke-direct {v2, v0, v12, v15}, Loa;-><init>(Ld22;Lxk1;I)V

    .line 235
    .line 236
    .line 237
    new-instance v4, Lkw;

    .line 238
    .line 239
    const v5, -0x11bbdae4

    .line 240
    .line 241
    .line 242
    invoke-direct {v4, v5, v15, v2}, Lkw;-><init>(IZLun0;)V

    .line 243
    .line 244
    .line 245
    move-object/from16 v2, v23

    .line 246
    .line 247
    invoke-virtual {v0, v2, v4}, Ld22;->n(Lyx;Lmn0;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    move-object v5, v0

    .line 254
    goto :goto_9

    .line 255
    :cond_c
    move v14, v0

    .line 256
    move-object/from16 v3, v20

    .line 257
    .line 258
    const/4 v15, 0x1

    .line 259
    :goto_9
    check-cast v5, Ld22;

    .line 260
    .line 261
    invoke-virtual {v11, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    and-int/lit8 v2, v14, 0x70

    .line 266
    .line 267
    const/16 v4, 0x20

    .line 268
    .line 269
    if-ne v2, v4, :cond_d

    .line 270
    .line 271
    move v7, v15

    .line 272
    goto :goto_a

    .line 273
    :cond_d
    const/4 v7, 0x0

    .line 274
    :goto_a
    or-int/2addr v0, v7

    .line 275
    and-int/lit16 v4, v14, 0x380

    .line 276
    .line 277
    const/16 v6, 0x100

    .line 278
    .line 279
    if-ne v4, v6, :cond_e

    .line 280
    .line 281
    move v7, v15

    .line 282
    goto :goto_b

    .line 283
    :cond_e
    const/4 v7, 0x0

    .line 284
    :goto_b
    or-int/2addr v0, v7

    .line 285
    invoke-virtual {v11, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    or-int/2addr v0, v6

    .line 290
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    invoke-virtual {v11, v6}, Lgo0;->d(I)Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    or-int/2addr v0, v6

    .line 299
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    if-nez v0, :cond_f

    .line 304
    .line 305
    if-ne v6, v13, :cond_10

    .line 306
    .line 307
    :cond_f
    new-instance v16, Lia;

    .line 308
    .line 309
    move-object/from16 v19, p2

    .line 310
    .line 311
    move-object/from16 v20, v3

    .line 312
    .line 313
    move-object/from16 v17, v5

    .line 314
    .line 315
    invoke-direct/range {v16 .. v21}, Lia;-><init>(Ld22;Lxm0;Lh22;Ljava/lang/String;Ld61;)V

    .line 316
    .line 317
    .line 318
    move-object/from16 v6, v16

    .line 319
    .line 320
    invoke-virtual {v11, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :cond_10
    check-cast v6, Lin0;

    .line 324
    .line 325
    invoke-static {v5, v6, v11}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v11, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    const/16 v6, 0x20

    .line 333
    .line 334
    if-ne v2, v6, :cond_11

    .line 335
    .line 336
    move v7, v15

    .line 337
    goto :goto_c

    .line 338
    :cond_11
    const/4 v7, 0x0

    .line 339
    :goto_c
    or-int/2addr v0, v7

    .line 340
    const/16 v6, 0x100

    .line 341
    .line 342
    if-ne v4, v6, :cond_12

    .line 343
    .line 344
    move v7, v15

    .line 345
    goto :goto_d

    .line 346
    :cond_12
    const/4 v7, 0x0

    .line 347
    :goto_d
    or-int/2addr v0, v7

    .line 348
    invoke-virtual {v11, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    or-int/2addr v0, v2

    .line 353
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    invoke-virtual {v11, v2}, Lgo0;->d(I)Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    or-int/2addr v0, v2

    .line 362
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    if-nez v0, :cond_14

    .line 367
    .line 368
    if-ne v2, v13, :cond_13

    .line 369
    .line 370
    goto :goto_e

    .line 371
    :cond_13
    move-object/from16 v6, v21

    .line 372
    .line 373
    goto :goto_f

    .line 374
    :cond_14
    :goto_e
    new-instance v16, Lja;

    .line 375
    .line 376
    move-object/from16 v19, p2

    .line 377
    .line 378
    move-object/from16 v20, v3

    .line 379
    .line 380
    move-object/from16 v17, v5

    .line 381
    .line 382
    invoke-direct/range {v16 .. v21}, Lja;-><init>(Ld22;Lxm0;Lh22;Ljava/lang/String;Ld61;)V

    .line 383
    .line 384
    .line 385
    move-object/from16 v2, v16

    .line 386
    .line 387
    move-object/from16 v6, v21

    .line 388
    .line 389
    invoke-virtual {v11, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    :goto_f
    check-cast v2, Lxm0;

    .line 393
    .line 394
    invoke-static {v2, v11}, Leu;->r(Lxm0;Lpx;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v11, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    and-int/lit8 v2, v14, 0xe

    .line 402
    .line 403
    const/4 v3, 0x4

    .line 404
    if-ne v2, v3, :cond_15

    .line 405
    .line 406
    move v7, v15

    .line 407
    goto :goto_10

    .line 408
    :cond_15
    const/4 v7, 0x0

    .line 409
    :goto_10
    or-int/2addr v0, v7

    .line 410
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    if-nez v0, :cond_16

    .line 415
    .line 416
    if-ne v2, v13, :cond_17

    .line 417
    .line 418
    :cond_16
    new-instance v2, Lfa;

    .line 419
    .line 420
    const/4 v0, 0x2

    .line 421
    invoke-direct {v2, v0, v5, v1}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v11, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :cond_17
    check-cast v2, Lin0;

    .line 428
    .line 429
    invoke-static {v1, v2, v11}, Leu;->c(Ljava/lang/Object;Lin0;Lpx;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v11, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    if-nez v0, :cond_18

    .line 441
    .line 442
    if-ne v2, v13, :cond_19

    .line 443
    .line 444
    :cond_18
    new-instance v2, La2;

    .line 445
    .line 446
    const/4 v0, 0x5

    .line 447
    const/4 v3, 0x0

    .line 448
    invoke-direct {v2, v5, v3, v0}, La2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v11, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    :cond_19
    check-cast v2, Lmn0;

    .line 455
    .line 456
    invoke-static {v11, v2, v5}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v11, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    if-nez v0, :cond_1a

    .line 468
    .line 469
    if-ne v2, v13, :cond_1b

    .line 470
    .line 471
    :cond_1a
    new-instance v2, Lla;

    .line 472
    .line 473
    const/4 v0, 0x0

    .line 474
    invoke-direct {v2, v5, v0}, Lla;-><init>(Ld22;I)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v11, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :cond_1b
    check-cast v2, Lin0;

    .line 481
    .line 482
    sget-object v0, Lrh1;->a:Lrh1;

    .line 483
    .line 484
    invoke-static {v0, v2}, Lt11;->E(Luh1;Lin0;)Luh1;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v11, v5}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    invoke-virtual {v11, v3}, Lgo0;->d(I)Z

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    or-int/2addr v2, v3

    .line 501
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    if-nez v2, :cond_1c

    .line 506
    .line 507
    if-ne v3, v13, :cond_1d

    .line 508
    .line 509
    :cond_1c
    new-instance v3, Lma;

    .line 510
    .line 511
    invoke-direct {v3, v5, v6}, Lma;-><init>(Ld22;Ld61;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v11, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    :cond_1d
    check-cast v3, Lnf1;

    .line 518
    .line 519
    iget-wide v4, v11, Lgo0;->T:J

    .line 520
    .line 521
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    invoke-virtual {v11}, Lgo0;->l()Lyy1;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-static {v11, v0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    sget-object v5, Lhx;->c:Lgx;

    .line 534
    .line 535
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    sget-object v5, Lgx;->b:Ljy;

    .line 539
    .line 540
    invoke-virtual {v11}, Lgo0;->Z()V

    .line 541
    .line 542
    .line 543
    iget-boolean v6, v11, Lgo0;->S:Z

    .line 544
    .line 545
    if-eqz v6, :cond_1e

    .line 546
    .line 547
    invoke-virtual {v11, v5}, Lgo0;->k(Lxm0;)V

    .line 548
    .line 549
    .line 550
    goto :goto_11

    .line 551
    :cond_1e
    invoke-virtual {v11}, Lgo0;->i0()V

    .line 552
    .line 553
    .line 554
    :goto_11
    sget-object v5, Lgx;->e:Llc;

    .line 555
    .line 556
    invoke-static {v11, v5, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    sget-object v3, Lgx;->d:Llc;

    .line 560
    .line 561
    invoke-static {v11, v3, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    sget-object v3, Lgx;->f:Llc;

    .line 569
    .line 570
    invoke-static {v11, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    sget-object v2, Lgx;->g:Lv6;

    .line 574
    .line 575
    invoke-static {v11, v2}, Lyf3;->b(Lpx;Lin0;)V

    .line 576
    .line 577
    .line 578
    sget-object v2, Lgx;->c:Llc;

    .line 579
    .line 580
    invoke-static {v11, v2, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v11, v15}, Lgo0;->p(Z)V

    .line 584
    .line 585
    .line 586
    move-object/from16 v2, v18

    .line 587
    .line 588
    goto :goto_12

    .line 589
    :cond_1f
    invoke-virtual {v11}, Lgo0;->R()V

    .line 590
    .line 591
    .line 592
    move-object v2, v3

    .line 593
    :goto_12
    invoke-virtual {v11}, Lgo0;->r()Lb62;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    if-eqz v7, :cond_20

    .line 598
    .line 599
    new-instance v0, Lna;

    .line 600
    .line 601
    move-object/from16 v3, p2

    .line 602
    .line 603
    move/from16 v6, p6

    .line 604
    .line 605
    move-object v4, v9

    .line 606
    move v5, v10

    .line 607
    invoke-direct/range {v0 .. v6}, Lna;-><init>(Lg22;Lxm0;Lh22;Lkw;II)V

    .line 608
    .line 609
    .line 610
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 611
    .line 612
    :cond_20
    return-void
.end method

.method public static final b(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 21
    .line 22
    and-int/lit16 p0, p0, 0x2000

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    return v0
.end method
