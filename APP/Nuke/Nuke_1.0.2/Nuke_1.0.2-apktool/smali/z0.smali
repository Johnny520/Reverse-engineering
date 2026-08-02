.class public final Lz0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lon0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lz0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lz0;->i:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lz0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lz0;->k:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lz0;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, v0, Lz0;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lz0;->i:Ljava/util/List;

    .line 10
    .line 11
    const/16 v5, 0x92

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x4

    .line 15
    iget-object v0, v0, Lz0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    const/16 v9, 0x20

    .line 18
    .line 19
    sget-object v10, Lnx;->a:Leb;

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x1

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, Lo71;

    .line 29
    .line 30
    move-object/from16 v13, p2

    .line 31
    .line 32
    check-cast v13, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v15

    .line 38
    move-object/from16 v13, p3

    .line 39
    .line 40
    check-cast v13, Lpx;

    .line 41
    .line 42
    move-object/from16 v14, p4

    .line 43
    .line 44
    check-cast v14, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    check-cast v0, Lxk1;

    .line 51
    .line 52
    and-int/lit8 v16, v14, 0x6

    .line 53
    .line 54
    if-nez v16, :cond_1

    .line 55
    .line 56
    move-object v6, v13

    .line 57
    check-cast v6, Lgo0;

    .line 58
    .line 59
    invoke-virtual {v6, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    move v7, v8

    .line 66
    :cond_0
    or-int v1, v14, v7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move v1, v14

    .line 70
    :goto_0
    and-int/lit8 v6, v14, 0x30

    .line 71
    .line 72
    if-nez v6, :cond_3

    .line 73
    .line 74
    move-object v6, v13

    .line 75
    check-cast v6, Lgo0;

    .line 76
    .line 77
    invoke-virtual {v6, v15}, Lgo0;->d(I)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_2

    .line 82
    .line 83
    move v6, v9

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/16 v6, 0x10

    .line 86
    .line 87
    :goto_1
    or-int/2addr v1, v6

    .line 88
    :cond_3
    and-int/lit16 v6, v1, 0x93

    .line 89
    .line 90
    if-eq v6, v5, :cond_4

    .line 91
    .line 92
    move v5, v12

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    move v5, v11

    .line 95
    :goto_2
    and-int/lit8 v6, v1, 0x1

    .line 96
    .line 97
    check-cast v13, Lgo0;

    .line 98
    .line 99
    invoke-virtual {v13, v6, v5}, Lgo0;->O(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_19

    .line 104
    .line 105
    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    move-object v14, v4

    .line 110
    check-cast v14, Lzq;

    .line 111
    .line 112
    const v4, -0x6c4a1e40

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13, v4}, Lgo0;->W(I)V

    .line 116
    .line 117
    .line 118
    if-lez v15, :cond_5

    .line 119
    .line 120
    move/from16 v16, v12

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    move/from16 v16, v11

    .line 124
    .line 125
    :goto_3
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Ljava/util/List;

    .line 130
    .line 131
    invoke-static {v4}, Leu;->L(Ljava/util/List;)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-ge v15, v4, :cond_6

    .line 136
    .line 137
    move/from16 v17, v12

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    move/from16 v17, v11

    .line 141
    .line 142
    :goto_4
    invoke-virtual {v13, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    if-nez v4, :cond_7

    .line 151
    .line 152
    if-ne v5, v10, :cond_8

    .line 153
    .line 154
    :cond_7
    new-instance v5, Lx0;

    .line 155
    .line 156
    check-cast v3, Lxk1;

    .line 157
    .line 158
    invoke-direct {v5, v12, v14, v3}, Lx0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v13, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    move-object/from16 v18, v5

    .line 165
    .line 166
    check-cast v18, Lxm0;

    .line 167
    .line 168
    invoke-virtual {v13, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    and-int/lit8 v23, v1, 0x70

    .line 173
    .line 174
    xor-int/lit8 v4, v23, 0x30

    .line 175
    .line 176
    if-le v4, v9, :cond_9

    .line 177
    .line 178
    invoke-virtual {v13, v15}, Lgo0;->d(I)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-nez v5, :cond_a

    .line 183
    .line 184
    :cond_9
    and-int/lit8 v5, v1, 0x30

    .line 185
    .line 186
    if-ne v5, v9, :cond_b

    .line 187
    .line 188
    :cond_a
    move v5, v12

    .line 189
    goto :goto_5

    .line 190
    :cond_b
    move v5, v11

    .line 191
    :goto_5
    or-int/2addr v3, v5

    .line 192
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    if-nez v3, :cond_c

    .line 197
    .line 198
    if-ne v5, v10, :cond_d

    .line 199
    .line 200
    :cond_c
    new-instance v5, Lur;

    .line 201
    .line 202
    invoke-direct {v5, v15, v0, v11}, Lur;-><init>(ILxk1;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v13, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_d
    move-object/from16 v19, v5

    .line 209
    .line 210
    check-cast v19, Lxm0;

    .line 211
    .line 212
    invoke-virtual {v13, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-le v4, v9, :cond_e

    .line 217
    .line 218
    invoke-virtual {v13, v15}, Lgo0;->d(I)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-nez v5, :cond_f

    .line 223
    .line 224
    :cond_e
    and-int/lit8 v5, v1, 0x30

    .line 225
    .line 226
    if-ne v5, v9, :cond_10

    .line 227
    .line 228
    :cond_f
    move v5, v12

    .line 229
    goto :goto_6

    .line 230
    :cond_10
    move v5, v11

    .line 231
    :goto_6
    or-int/2addr v3, v5

    .line 232
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    if-nez v3, :cond_11

    .line 237
    .line 238
    if-ne v5, v10, :cond_12

    .line 239
    .line 240
    :cond_11
    new-instance v5, Lur;

    .line 241
    .line 242
    invoke-direct {v5, v15, v0, v12}, Lur;-><init>(ILxk1;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v13, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_12
    move-object/from16 v20, v5

    .line 249
    .line 250
    check-cast v20, Lxm0;

    .line 251
    .line 252
    invoke-virtual {v13, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-le v4, v9, :cond_13

    .line 257
    .line 258
    invoke-virtual {v13, v15}, Lgo0;->d(I)Z

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-nez v4, :cond_15

    .line 263
    .line 264
    :cond_13
    and-int/lit8 v1, v1, 0x30

    .line 265
    .line 266
    if-ne v1, v9, :cond_14

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_14
    move v12, v11

    .line 270
    :cond_15
    :goto_7
    or-int v1, v3, v12

    .line 271
    .line 272
    invoke-virtual {v13, v14}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    or-int/2addr v1, v3

    .line 277
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    if-nez v1, :cond_16

    .line 282
    .line 283
    if-ne v3, v10, :cond_17

    .line 284
    .line 285
    :cond_16
    new-instance v3, Lvr;

    .line 286
    .line 287
    invoke-direct {v3, v0, v15, v14}, Lvr;-><init>(Lxk1;ILzq;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v13, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_17
    move-object/from16 v21, v3

    .line 294
    .line 295
    check-cast v21, Lin0;

    .line 296
    .line 297
    move-object/from16 v22, v13

    .line 298
    .line 299
    invoke-static/range {v14 .. v23}, Lyr;->c(Lzq;IZZLxm0;Lxm0;Lxm0;Lin0;Lpx;I)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Ljava/util/List;

    .line 307
    .line 308
    invoke-static {v0}, Leu;->L(Ljava/util/List;)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eq v15, v0, :cond_18

    .line 313
    .line 314
    const v0, -0x6c3d4c40

    .line 315
    .line 316
    .line 317
    invoke-virtual {v13, v0}, Lgo0;->W(I)V

    .line 318
    .line 319
    .line 320
    sget-object v0, Lur1;->a:Ltu2;

    .line 321
    .line 322
    invoke-virtual {v13, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Llp1;

    .line 327
    .line 328
    iget-wide v0, v0, Llp1;->d:J

    .line 329
    .line 330
    const/16 v21, 0x30

    .line 331
    .line 332
    const/16 v22, 0x1

    .line 333
    .line 334
    const/16 v16, 0x0

    .line 335
    .line 336
    const/high16 v17, 0x3f000000    # 0.5f

    .line 337
    .line 338
    move-wide/from16 v18, v0

    .line 339
    .line 340
    move-object/from16 v20, v13

    .line 341
    .line 342
    invoke-static/range {v16 .. v22}, Lop0;->a(Luh1;FJLpx;II)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v13, v11}, Lgo0;->p(Z)V

    .line 346
    .line 347
    .line 348
    goto :goto_8

    .line 349
    :cond_18
    const v0, -0x6c3ab8a7

    .line 350
    .line 351
    .line 352
    invoke-virtual {v13, v0}, Lgo0;->W(I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v13, v11}, Lgo0;->p(Z)V

    .line 356
    .line 357
    .line 358
    :goto_8
    invoke-virtual {v13, v11}, Lgo0;->p(Z)V

    .line 359
    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_19
    invoke-virtual {v13}, Lgo0;->R()V

    .line 363
    .line 364
    .line 365
    :goto_9
    return-object v2

    .line 366
    :pswitch_0
    move-object/from16 v1, p1

    .line 367
    .line 368
    check-cast v1, Lo71;

    .line 369
    .line 370
    move-object/from16 v6, p2

    .line 371
    .line 372
    check-cast v6, Ljava/lang/Number;

    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    move-object/from16 v13, p3

    .line 379
    .line 380
    check-cast v13, Lpx;

    .line 381
    .line 382
    move-object/from16 v14, p4

    .line 383
    .line 384
    check-cast v14, Ljava/lang/Number;

    .line 385
    .line 386
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result v14

    .line 390
    check-cast v3, Lin0;

    .line 391
    .line 392
    and-int/lit8 v15, v14, 0x6

    .line 393
    .line 394
    if-nez v15, :cond_1b

    .line 395
    .line 396
    move-object v15, v13

    .line 397
    check-cast v15, Lgo0;

    .line 398
    .line 399
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    if-eqz v1, :cond_1a

    .line 404
    .line 405
    move v7, v8

    .line 406
    :cond_1a
    or-int v1, v14, v7

    .line 407
    .line 408
    goto :goto_a

    .line 409
    :cond_1b
    move v1, v14

    .line 410
    :goto_a
    and-int/lit8 v7, v14, 0x30

    .line 411
    .line 412
    if-nez v7, :cond_1d

    .line 413
    .line 414
    move-object v7, v13

    .line 415
    check-cast v7, Lgo0;

    .line 416
    .line 417
    invoke-virtual {v7, v6}, Lgo0;->d(I)Z

    .line 418
    .line 419
    .line 420
    move-result v7

    .line 421
    if-eqz v7, :cond_1c

    .line 422
    .line 423
    move/from16 v16, v9

    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_1c
    const/16 v16, 0x10

    .line 427
    .line 428
    :goto_b
    or-int v1, v1, v16

    .line 429
    .line 430
    :cond_1d
    and-int/lit16 v7, v1, 0x93

    .line 431
    .line 432
    if-eq v7, v5, :cond_1e

    .line 433
    .line 434
    move v5, v12

    .line 435
    goto :goto_c

    .line 436
    :cond_1e
    move v5, v11

    .line 437
    :goto_c
    and-int/2addr v1, v12

    .line 438
    check-cast v13, Lgo0;

    .line 439
    .line 440
    invoke-virtual {v13, v1, v5}, Lgo0;->O(IZ)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_21

    .line 445
    .line 446
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    check-cast v1, Lnuke/module/wechat/ai/AIModelInfo;

    .line 451
    .line 452
    const v4, -0x43a63447

    .line 453
    .line 454
    .line 455
    invoke-virtual {v13, v4}, Lgo0;->W(I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1}, Lnuke/module/wechat/ai/AIModelInfo;->getId()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    check-cast v0, Ljava/lang/String;

    .line 463
    .line 464
    invoke-static {v4, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    invoke-virtual {v13, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v4

    .line 472
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v5

    .line 476
    or-int/2addr v4, v5

    .line 477
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    if-nez v4, :cond_1f

    .line 482
    .line 483
    if-ne v5, v10, :cond_20

    .line 484
    .line 485
    :cond_1f
    new-instance v5, Lx0;

    .line 486
    .line 487
    invoke-direct {v5, v11, v3, v1}, Lx0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v13, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    :cond_20
    check-cast v5, Lxm0;

    .line 494
    .line 495
    sget v3, Lnuke/module/wechat/ai/AIModelInfo;->$stable:I

    .line 496
    .line 497
    invoke-static {v1, v0, v5, v13, v3}, Lse;->c(Lnuke/module/wechat/ai/AIModelInfo;ZLxm0;Lpx;I)V

    .line 498
    .line 499
    .line 500
    sget-object v0, Lur1;->a:Ltu2;

    .line 501
    .line 502
    invoke-virtual {v13, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    check-cast v0, Llp1;

    .line 507
    .line 508
    iget-wide v0, v0, Llp1;->d:J

    .line 509
    .line 510
    const/16 v19, 0x30

    .line 511
    .line 512
    const/16 v20, 0x1

    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    const/high16 v15, 0x3f000000    # 0.5f

    .line 516
    .line 517
    move-wide/from16 v16, v0

    .line 518
    .line 519
    move-object/from16 v18, v13

    .line 520
    .line 521
    invoke-static/range {v14 .. v20}, Lop0;->a(Luh1;FJLpx;II)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v13, v11}, Lgo0;->p(Z)V

    .line 525
    .line 526
    .line 527
    goto :goto_d

    .line 528
    :cond_21
    invoke-virtual {v13}, Lgo0;->R()V

    .line 529
    .line 530
    .line 531
    :goto_d
    return-object v2

    .line 532
    nop

    .line 533
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
