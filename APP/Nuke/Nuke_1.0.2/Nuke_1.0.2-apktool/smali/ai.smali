.class public final Lai;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lon0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lxk1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lxk1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lai;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lai;->i:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lai;->j:Lxk1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lai;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    sget-object v3, Lnx;->a:Leb;

    .line 8
    .line 9
    iget-object v4, v0, Lai;->i:Ljava/util/List;

    .line 10
    .line 11
    const/16 v5, 0x92

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/16 v7, 0x20

    .line 16
    .line 17
    const/4 v8, 0x4

    .line 18
    iget-object v0, v0, Lai;->j:Lxk1;

    .line 19
    .line 20
    const/4 v9, 0x2

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x1

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
    move-object/from16 v12, p2

    .line 31
    .line 32
    check-cast v12, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v12

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
    and-int/lit8 v15, v14, 0x6

    .line 51
    .line 52
    if-nez v15, :cond_1

    .line 53
    .line 54
    move-object v15, v13

    .line 55
    check-cast v15, Lgo0;

    .line 56
    .line 57
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v8, v9

    .line 65
    :goto_0
    or-int v1, v14, v8

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v1, v14

    .line 69
    :goto_1
    and-int/lit8 v8, v14, 0x30

    .line 70
    .line 71
    if-nez v8, :cond_3

    .line 72
    .line 73
    move-object v8, v13

    .line 74
    check-cast v8, Lgo0;

    .line 75
    .line 76
    invoke-virtual {v8, v12}, Lgo0;->d(I)Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eqz v8, :cond_2

    .line 81
    .line 82
    move v6, v7

    .line 83
    :cond_2
    or-int/2addr v1, v6

    .line 84
    :cond_3
    and-int/lit16 v6, v1, 0x93

    .line 85
    .line 86
    if-eq v6, v5, :cond_4

    .line 87
    .line 88
    move v5, v11

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move v5, v10

    .line 91
    :goto_2
    and-int/2addr v1, v11

    .line 92
    check-cast v13, Lgo0;

    .line 93
    .line 94
    invoke-virtual {v13, v1, v5}, Lgo0;->O(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_7

    .line 99
    .line 100
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljc3;

    .line 105
    .line 106
    const v4, 0x3126b25a

    .line 107
    .line 108
    .line 109
    invoke-virtual {v13, v4}, Lgo0;->W(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Ljava/util/Set;

    .line 117
    .line 118
    iget-object v5, v1, Ljc3;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {v13, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-virtual {v13, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    or-int/2addr v5, v6

    .line 133
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    if-nez v5, :cond_5

    .line 138
    .line 139
    if-ne v6, v3, :cond_6

    .line 140
    .line 141
    :cond_5
    new-instance v6, Lzh;

    .line 142
    .line 143
    const/16 v3, 0xc

    .line 144
    .line 145
    invoke-direct {v6, v3, v1, v0}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v13, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_6
    check-cast v6, Lin0;

    .line 152
    .line 153
    invoke-static {v1, v4, v6, v13, v10}, Lse;->j(Ljc3;ZLin0;Lpx;I)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lur1;->a:Ltu2;

    .line 157
    .line 158
    invoke-virtual {v13, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Llp1;

    .line 163
    .line 164
    iget-wide v0, v0, Llp1;->d:J

    .line 165
    .line 166
    const/16 v19, 0x30

    .line 167
    .line 168
    const/16 v20, 0x1

    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    const/high16 v15, 0x3f000000    # 0.5f

    .line 172
    .line 173
    move-wide/from16 v16, v0

    .line 174
    .line 175
    move-object/from16 v18, v13

    .line 176
    .line 177
    invoke-static/range {v14 .. v20}, Lop0;->a(Luh1;FJLpx;II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v13, v10}, Lgo0;->p(Z)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    invoke-virtual {v13}, Lgo0;->R()V

    .line 185
    .line 186
    .line 187
    :goto_3
    return-object v2

    .line 188
    :pswitch_0
    move-object/from16 v1, p1

    .line 189
    .line 190
    check-cast v1, Lo71;

    .line 191
    .line 192
    move-object/from16 v12, p2

    .line 193
    .line 194
    check-cast v12, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    move-object/from16 v13, p3

    .line 201
    .line 202
    check-cast v13, Lpx;

    .line 203
    .line 204
    move-object/from16 v14, p4

    .line 205
    .line 206
    check-cast v14, Ljava/lang/Number;

    .line 207
    .line 208
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    and-int/lit8 v15, v14, 0x6

    .line 213
    .line 214
    if-nez v15, :cond_9

    .line 215
    .line 216
    move-object v15, v13

    .line 217
    check-cast v15, Lgo0;

    .line 218
    .line 219
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_8

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_8
    move v8, v9

    .line 227
    :goto_4
    or-int v1, v14, v8

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_9
    move v1, v14

    .line 231
    :goto_5
    and-int/lit8 v8, v14, 0x30

    .line 232
    .line 233
    if-nez v8, :cond_b

    .line 234
    .line 235
    move-object v8, v13

    .line 236
    check-cast v8, Lgo0;

    .line 237
    .line 238
    invoke-virtual {v8, v12}, Lgo0;->d(I)Z

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    if-eqz v8, :cond_a

    .line 243
    .line 244
    move v6, v7

    .line 245
    :cond_a
    or-int/2addr v1, v6

    .line 246
    :cond_b
    and-int/lit16 v6, v1, 0x93

    .line 247
    .line 248
    if-eq v6, v5, :cond_c

    .line 249
    .line 250
    move v5, v11

    .line 251
    goto :goto_6

    .line 252
    :cond_c
    move v5, v10

    .line 253
    :goto_6
    and-int/2addr v1, v11

    .line 254
    check-cast v13, Lgo0;

    .line 255
    .line 256
    invoke-virtual {v13, v1, v5}, Lgo0;->O(IZ)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_10

    .line 261
    .line 262
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, Lxt0;

    .line 267
    .line 268
    const v4, -0x2e11785d

    .line 269
    .line 270
    .line 271
    invoke-virtual {v13, v4}, Lgo0;->W(I)V

    .line 272
    .line 273
    .line 274
    if-nez v12, :cond_d

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_d
    move v11, v10

    .line 278
    :goto_7
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    if-nez v4, :cond_e

    .line 287
    .line 288
    if-ne v5, v3, :cond_f

    .line 289
    .line 290
    :cond_e
    new-instance v5, Lx0;

    .line 291
    .line 292
    invoke-direct {v5, v9, v1, v0}, Lx0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v13, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_f
    check-cast v5, Lxm0;

    .line 299
    .line 300
    invoke-static {v1, v11, v5, v13, v10}, Ls11;->k(Lxt0;ZLxm0;Lpx;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v13, v10}, Lgo0;->p(Z)V

    .line 304
    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_10
    invoke-virtual {v13}, Lgo0;->R()V

    .line 308
    .line 309
    .line 310
    :goto_8
    return-object v2

    .line 311
    :pswitch_1
    move-object/from16 v1, p1

    .line 312
    .line 313
    check-cast v1, Lo71;

    .line 314
    .line 315
    move-object/from16 v12, p2

    .line 316
    .line 317
    check-cast v12, Ljava/lang/Number;

    .line 318
    .line 319
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    move-object/from16 v13, p3

    .line 324
    .line 325
    check-cast v13, Lpx;

    .line 326
    .line 327
    move-object/from16 v14, p4

    .line 328
    .line 329
    check-cast v14, Ljava/lang/Number;

    .line 330
    .line 331
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v14

    .line 335
    and-int/lit8 v15, v14, 0x6

    .line 336
    .line 337
    if-nez v15, :cond_12

    .line 338
    .line 339
    move-object v15, v13

    .line 340
    check-cast v15, Lgo0;

    .line 341
    .line 342
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    if-eqz v1, :cond_11

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_11
    move v8, v9

    .line 350
    :goto_9
    or-int v1, v14, v8

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_12
    move v1, v14

    .line 354
    :goto_a
    and-int/lit8 v8, v14, 0x30

    .line 355
    .line 356
    if-nez v8, :cond_14

    .line 357
    .line 358
    move-object v8, v13

    .line 359
    check-cast v8, Lgo0;

    .line 360
    .line 361
    invoke-virtual {v8, v12}, Lgo0;->d(I)Z

    .line 362
    .line 363
    .line 364
    move-result v8

    .line 365
    if-eqz v8, :cond_13

    .line 366
    .line 367
    move v6, v7

    .line 368
    :cond_13
    or-int/2addr v1, v6

    .line 369
    :cond_14
    and-int/lit16 v6, v1, 0x93

    .line 370
    .line 371
    if-eq v6, v5, :cond_15

    .line 372
    .line 373
    move v5, v11

    .line 374
    goto :goto_b

    .line 375
    :cond_15
    move v5, v10

    .line 376
    :goto_b
    and-int/2addr v1, v11

    .line 377
    check-cast v13, Lgo0;

    .line 378
    .line 379
    invoke-virtual {v13, v1, v5}, Lgo0;->O(IZ)Z

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    if-eqz v1, :cond_18

    .line 384
    .line 385
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    check-cast v1, Lg33;

    .line 390
    .line 391
    const v4, -0x5f58b646

    .line 392
    .line 393
    .line 394
    invoke-virtual {v13, v4}, Lgo0;->W(I)V

    .line 395
    .line 396
    .line 397
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    check-cast v4, Ljava/util/Set;

    .line 402
    .line 403
    iget-object v5, v1, Lg33;->a:Ljava/lang/String;

    .line 404
    .line 405
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    invoke-virtual {v13, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    invoke-virtual {v13, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    or-int/2addr v5, v6

    .line 418
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    if-nez v5, :cond_16

    .line 423
    .line 424
    if-ne v6, v3, :cond_17

    .line 425
    .line 426
    :cond_16
    new-instance v6, Lzh;

    .line 427
    .line 428
    invoke-direct {v6, v11, v1, v0}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v13, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_17
    check-cast v6, Lin0;

    .line 435
    .line 436
    invoke-static {v1, v4, v6, v13, v10}, Lt11;->f(Lg33;ZLin0;Lpx;I)V

    .line 437
    .line 438
    .line 439
    sget-object v0, Lur1;->a:Ltu2;

    .line 440
    .line 441
    invoke-virtual {v13, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    check-cast v0, Llp1;

    .line 446
    .line 447
    iget-wide v0, v0, Llp1;->d:J

    .line 448
    .line 449
    const/16 v19, 0x30

    .line 450
    .line 451
    const/16 v20, 0x1

    .line 452
    .line 453
    const/4 v14, 0x0

    .line 454
    const/high16 v15, 0x3f000000    # 0.5f

    .line 455
    .line 456
    move-wide/from16 v16, v0

    .line 457
    .line 458
    move-object/from16 v18, v13

    .line 459
    .line 460
    invoke-static/range {v14 .. v20}, Lop0;->a(Luh1;FJLpx;II)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v13, v10}, Lgo0;->p(Z)V

    .line 464
    .line 465
    .line 466
    goto :goto_c

    .line 467
    :cond_18
    invoke-virtual {v13}, Lgo0;->R()V

    .line 468
    .line 469
    .line 470
    :goto_c
    return-object v2

    .line 471
    :pswitch_2
    move-object/from16 v1, p1

    .line 472
    .line 473
    check-cast v1, Lo71;

    .line 474
    .line 475
    move-object/from16 v12, p2

    .line 476
    .line 477
    check-cast v12, Ljava/lang/Number;

    .line 478
    .line 479
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 480
    .line 481
    .line 482
    move-result v12

    .line 483
    move-object/from16 v13, p3

    .line 484
    .line 485
    check-cast v13, Lpx;

    .line 486
    .line 487
    move-object/from16 v14, p4

    .line 488
    .line 489
    check-cast v14, Ljava/lang/Number;

    .line 490
    .line 491
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 492
    .line 493
    .line 494
    move-result v14

    .line 495
    and-int/lit8 v15, v14, 0x6

    .line 496
    .line 497
    if-nez v15, :cond_1a

    .line 498
    .line 499
    move-object v15, v13

    .line 500
    check-cast v15, Lgo0;

    .line 501
    .line 502
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-eqz v1, :cond_19

    .line 507
    .line 508
    goto :goto_d

    .line 509
    :cond_19
    move v8, v9

    .line 510
    :goto_d
    or-int v1, v14, v8

    .line 511
    .line 512
    goto :goto_e

    .line 513
    :cond_1a
    move v1, v14

    .line 514
    :goto_e
    and-int/lit8 v8, v14, 0x30

    .line 515
    .line 516
    if-nez v8, :cond_1c

    .line 517
    .line 518
    move-object v8, v13

    .line 519
    check-cast v8, Lgo0;

    .line 520
    .line 521
    invoke-virtual {v8, v12}, Lgo0;->d(I)Z

    .line 522
    .line 523
    .line 524
    move-result v8

    .line 525
    if-eqz v8, :cond_1b

    .line 526
    .line 527
    move v6, v7

    .line 528
    :cond_1b
    or-int/2addr v1, v6

    .line 529
    :cond_1c
    and-int/lit16 v6, v1, 0x93

    .line 530
    .line 531
    if-eq v6, v5, :cond_1d

    .line 532
    .line 533
    move v5, v11

    .line 534
    goto :goto_f

    .line 535
    :cond_1d
    move v5, v10

    .line 536
    :goto_f
    and-int/2addr v1, v11

    .line 537
    check-cast v13, Lgo0;

    .line 538
    .line 539
    invoke-virtual {v13, v1, v5}, Lgo0;->O(IZ)Z

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    if-eqz v1, :cond_20

    .line 544
    .line 545
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v1

    .line 549
    check-cast v1, Ls62;

    .line 550
    .line 551
    const v4, 0x29a92b39

    .line 552
    .line 553
    .line 554
    invoke-virtual {v13, v4}, Lgo0;->W(I)V

    .line 555
    .line 556
    .line 557
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    check-cast v4, Ljava/util/Set;

    .line 562
    .line 563
    iget-object v5, v1, Ls62;->a:Ljava/lang/String;

    .line 564
    .line 565
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    invoke-virtual {v13, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v5

    .line 573
    invoke-virtual {v13, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    or-int/2addr v5, v6

    .line 578
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v6

    .line 582
    if-nez v5, :cond_1e

    .line 583
    .line 584
    if-ne v6, v3, :cond_1f

    .line 585
    .line 586
    :cond_1e
    new-instance v6, Lzh;

    .line 587
    .line 588
    invoke-direct {v6, v10, v1, v0}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v13, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    :cond_1f
    check-cast v6, Lin0;

    .line 595
    .line 596
    invoke-static {v1, v4, v6, v13, v10}, Ls11;->p(Ls62;ZLin0;Lpx;I)V

    .line 597
    .line 598
    .line 599
    sget-object v0, Lur1;->a:Ltu2;

    .line 600
    .line 601
    invoke-virtual {v13, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    check-cast v0, Llp1;

    .line 606
    .line 607
    iget-wide v0, v0, Llp1;->d:J

    .line 608
    .line 609
    const/16 v19, 0x30

    .line 610
    .line 611
    const/16 v20, 0x1

    .line 612
    .line 613
    const/4 v14, 0x0

    .line 614
    const/high16 v15, 0x3f000000    # 0.5f

    .line 615
    .line 616
    move-wide/from16 v16, v0

    .line 617
    .line 618
    move-object/from16 v18, v13

    .line 619
    .line 620
    invoke-static/range {v14 .. v20}, Lop0;->a(Luh1;FJLpx;II)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v13, v10}, Lgo0;->p(Z)V

    .line 624
    .line 625
    .line 626
    goto :goto_10

    .line 627
    :cond_20
    invoke-virtual {v13}, Lgo0;->R()V

    .line 628
    .line 629
    .line 630
    :goto_10
    return-object v2

    .line 631
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
