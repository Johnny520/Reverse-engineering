.class public final synthetic Ly30;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxk1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly30;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ly30;->i:Lxk1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ly30;->h:I

    .line 4
    .line 5
    sget-object v2, Lnx;->a:Leb;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/16 v4, 0xd

    .line 10
    .line 11
    sget-object v5, La83;->a:La83;

    .line 12
    .line 13
    const/16 v6, 0x10

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    iget-object v0, v0, Ly30;->i:Lxk1;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, Lo71;

    .line 25
    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, Lpx;

    .line 29
    .line 30
    move-object/from16 v3, p3

    .line 31
    .line 32
    check-cast v3, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v1, v3, 0x11

    .line 42
    .line 43
    if-eq v1, v6, :cond_0

    .line 44
    .line 45
    move v1, v8

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v1, v7

    .line 48
    :goto_0
    and-int/2addr v3, v8

    .line 49
    move-object v11, v2

    .line 50
    check-cast v11, Lgo0;

    .line 51
    .line 52
    invoke-virtual {v11, v3, v1}, Lgo0;->O(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ltq1;

    .line 63
    .line 64
    iget-boolean v1, v1, Ltq1;->b:Z

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    const v1, -0x33c0478b    # -5.0258388E7f

    .line 69
    .line 70
    .line 71
    invoke-virtual {v11, v1}, Lgo0;->W(I)V

    .line 72
    .line 73
    .line 74
    const v1, 0x790b0218

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v11}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v11, v7}, Lgo0;->p(Z)V

    .line 82
    .line 83
    .line 84
    :goto_1
    move-object v9, v1

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    const v1, -0x33be7a2d    # -5.0730828E7f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v1}, Lgo0;->W(I)V

    .line 90
    .line 91
    .line 92
    const v1, 0x790b020a

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v11}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v11, v7}, Lgo0;->p(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :goto_2
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ltq1;

    .line 108
    .line 109
    iget-object v0, v0, Ltq1;->c:Ljava/lang/String;

    .line 110
    .line 111
    if-nez v0, :cond_2

    .line 112
    .line 113
    const v0, -0x5c81ea0f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v11, v0}, Lgo0;->W(I)V

    .line 117
    .line 118
    .line 119
    const v0, 0x790b01fd

    .line 120
    .line 121
    .line 122
    invoke-static {v0, v11}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_3
    invoke-virtual {v11, v7}, Lgo0;->p(Z)V

    .line 127
    .line 128
    .line 129
    move-object v10, v0

    .line 130
    goto :goto_4

    .line 131
    :cond_2
    const v1, -0x5c81f099

    .line 132
    .line 133
    .line 134
    invoke-virtual {v11, v1}, Lgo0;->W(I)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :goto_4
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x1

    .line 140
    const/4 v8, 0x0

    .line 141
    invoke-static/range {v8 .. v13}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_3
    invoke-virtual {v11}, Lgo0;->R()V

    .line 146
    .line 147
    .line 148
    :goto_5
    return-object v5

    .line 149
    :pswitch_0
    move-object/from16 v1, p1

    .line 150
    .line 151
    check-cast v1, Lbv;

    .line 152
    .line 153
    move-object/from16 v9, p2

    .line 154
    .line 155
    check-cast v9, Lpx;

    .line 156
    .line 157
    move-object/from16 v10, p3

    .line 158
    .line 159
    check-cast v10, Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    and-int/lit8 v1, v10, 0x11

    .line 169
    .line 170
    if-eq v1, v6, :cond_4

    .line 171
    .line 172
    move v7, v8

    .line 173
    :cond_4
    and-int/lit8 v1, v10, 0x1

    .line 174
    .line 175
    check-cast v9, Lgo0;

    .line 176
    .line 177
    invoke-virtual {v9, v1, v7}, Lgo0;->O(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_6

    .line 182
    .line 183
    const/high16 v14, 0x41000000    # 8.0f

    .line 184
    .line 185
    const/4 v15, 0x7

    .line 186
    sget-object v10, Lrh1;->a:Lrh1;

    .line 187
    .line 188
    const/4 v11, 0x0

    .line 189
    const/4 v12, 0x0

    .line 190
    const/4 v13, 0x0

    .line 191
    invoke-static/range {v10 .. v15}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    const v1, 0x790b01e2

    .line 196
    .line 197
    .line 198
    invoke-static {v1, v9}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    sget-object v1, Lur1;->a:Ltu2;

    .line 203
    .line 204
    invoke-virtual {v9, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, Llp1;

    .line 209
    .line 210
    iget-wide v13, v1, Llp1;->f:J

    .line 211
    .line 212
    invoke-static {v4}, Lrg3;->D(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v15

    .line 216
    invoke-static {v3}, Lrg3;->D(I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v21

    .line 220
    sget-object v17, Lim0;->k:Lim0;

    .line 221
    .line 222
    new-instance v12, Lm13;

    .line 223
    .line 224
    const/16 v24, 0x0

    .line 225
    .line 226
    const v25, 0xfdfff8

    .line 227
    .line 228
    .line 229
    const-wide/16 v18, 0x0

    .line 230
    .line 231
    const/16 v20, 0x0

    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 236
    .line 237
    .line 238
    const/16 v18, 0x30

    .line 239
    .line 240
    const/16 v19, 0x3f8

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const/16 v16, 0x0

    .line 246
    .line 247
    move-object/from16 v17, v9

    .line 248
    .line 249
    invoke-static/range {v10 .. v19}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move-object v10, v1

    .line 257
    check-cast v10, Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    if-ne v1, v2, :cond_5

    .line 264
    .line 265
    new-instance v1, Lpr;

    .line 266
    .line 267
    const/16 v2, 0x13

    .line 268
    .line 269
    invoke-direct {v1, v0, v2}, Lpr;-><init>(Lxk1;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_5
    move-object v11, v1

    .line 276
    check-cast v11, Lin0;

    .line 277
    .line 278
    const v0, 0x790b01e1

    .line 279
    .line 280
    .line 281
    invoke-static {v0, v9}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    const/16 v26, 0x0

    .line 286
    .line 287
    const/16 v27, 0x3ff4

    .line 288
    .line 289
    const/4 v12, 0x0

    .line 290
    const/4 v14, 0x0

    .line 291
    const/4 v15, 0x0

    .line 292
    const/16 v16, 0x0

    .line 293
    .line 294
    const/16 v17, 0x0

    .line 295
    .line 296
    const/16 v18, 0x0

    .line 297
    .line 298
    const/16 v19, 0x0

    .line 299
    .line 300
    const/16 v20, 0x0

    .line 301
    .line 302
    const/16 v21, 0x0

    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const/16 v23, 0x0

    .line 307
    .line 308
    const/16 v25, 0x30

    .line 309
    .line 310
    move-object/from16 v24, v9

    .line 311
    .line 312
    invoke-static/range {v10 .. v27}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_6
    move-object/from16 v17, v9

    .line 317
    .line 318
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 319
    .line 320
    .line 321
    :goto_6
    return-object v5

    .line 322
    :pswitch_1
    move-object/from16 v1, p1

    .line 323
    .line 324
    check-cast v1, Lbv;

    .line 325
    .line 326
    move-object/from16 v9, p2

    .line 327
    .line 328
    check-cast v9, Lpx;

    .line 329
    .line 330
    move-object/from16 v10, p3

    .line 331
    .line 332
    check-cast v10, Ljava/lang/Integer;

    .line 333
    .line 334
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    and-int/lit8 v1, v10, 0x11

    .line 342
    .line 343
    if-eq v1, v6, :cond_7

    .line 344
    .line 345
    move v7, v8

    .line 346
    :cond_7
    and-int/lit8 v1, v10, 0x1

    .line 347
    .line 348
    check-cast v9, Lgo0;

    .line 349
    .line 350
    invoke-virtual {v9, v1, v7}, Lgo0;->O(IZ)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_a

    .line 355
    .line 356
    const/4 v15, 0x7

    .line 357
    sget-object v16, Lrh1;->a:Lrh1;

    .line 358
    .line 359
    const/4 v11, 0x0

    .line 360
    const/4 v12, 0x0

    .line 361
    const/4 v13, 0x0

    .line 362
    const/high16 v14, 0x41000000    # 8.0f

    .line 363
    .line 364
    move-object/from16 v10, v16

    .line 365
    .line 366
    invoke-static/range {v10 .. v15}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 367
    .line 368
    .line 369
    move-result-object v11

    .line 370
    move-object v1, v10

    .line 371
    move v6, v14

    .line 372
    const v7, 0x790b00ef

    .line 373
    .line 374
    .line 375
    invoke-static {v7, v9}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v10

    .line 379
    sget-object v7, Lur1;->a:Ltu2;

    .line 380
    .line 381
    invoke-virtual {v9, v7}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v8

    .line 385
    check-cast v8, Llp1;

    .line 386
    .line 387
    iget-wide v13, v8, Llp1;->f:J

    .line 388
    .line 389
    invoke-static {v4}, Lrg3;->D(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v15

    .line 393
    invoke-static {v3}, Lrg3;->D(I)J

    .line 394
    .line 395
    .line 396
    move-result-wide v21

    .line 397
    sget-object v17, Lim0;->k:Lim0;

    .line 398
    .line 399
    new-instance v12, Lm13;

    .line 400
    .line 401
    const/16 v24, 0x0

    .line 402
    .line 403
    const v25, 0xfdfff8

    .line 404
    .line 405
    .line 406
    const-wide/16 v18, 0x0

    .line 407
    .line 408
    const/16 v20, 0x0

    .line 409
    .line 410
    const/16 v23, 0x0

    .line 411
    .line 412
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 413
    .line 414
    .line 415
    const/16 v18, 0x30

    .line 416
    .line 417
    const/16 v19, 0x3f8

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const/4 v14, 0x0

    .line 421
    const/4 v15, 0x0

    .line 422
    const/16 v16, 0x0

    .line 423
    .line 424
    move-object/from16 v17, v9

    .line 425
    .line 426
    invoke-static/range {v10 .. v19}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    move-object v10, v3

    .line 434
    check-cast v10, Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {v9, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    invoke-virtual {v9}, Lgo0;->L()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    if-nez v3, :cond_8

    .line 445
    .line 446
    if-ne v4, v2, :cond_9

    .line 447
    .line 448
    :cond_8
    new-instance v4, Lpr;

    .line 449
    .line 450
    const/16 v2, 0x9

    .line 451
    .line 452
    invoke-direct {v4, v0, v2}, Lpr;-><init>(Lxk1;I)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v9, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    :cond_9
    move-object v11, v4

    .line 459
    check-cast v11, Lin0;

    .line 460
    .line 461
    const v0, 0x790b00f1

    .line 462
    .line 463
    .line 464
    invoke-static {v0, v9}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v13

    .line 468
    const/16 v26, 0x0

    .line 469
    .line 470
    const/16 v27, 0x3ff4

    .line 471
    .line 472
    const/4 v12, 0x0

    .line 473
    const/4 v14, 0x0

    .line 474
    const/4 v15, 0x0

    .line 475
    const/16 v16, 0x0

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/16 v18, 0x0

    .line 480
    .line 481
    const/16 v19, 0x0

    .line 482
    .line 483
    const/16 v20, 0x0

    .line 484
    .line 485
    const/16 v21, 0x0

    .line 486
    .line 487
    const/16 v22, 0x0

    .line 488
    .line 489
    const/16 v23, 0x0

    .line 490
    .line 491
    const/16 v25, 0x0

    .line 492
    .line 493
    move-object/from16 v24, v9

    .line 494
    .line 495
    invoke-static/range {v10 .. v27}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 496
    .line 497
    .line 498
    const/16 v20, 0x0

    .line 499
    .line 500
    const/16 v21, 0xd

    .line 501
    .line 502
    const/16 v17, 0x0

    .line 503
    .line 504
    const/16 v19, 0x0

    .line 505
    .line 506
    move-object/from16 v16, v1

    .line 507
    .line 508
    move/from16 v18, v6

    .line 509
    .line 510
    invoke-static/range {v16 .. v21}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 511
    .line 512
    .line 513
    move-result-object v11

    .line 514
    const v0, 0x790b00ee

    .line 515
    .line 516
    .line 517
    invoke-static {v0, v9}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v10

    .line 521
    new-instance v12, Lm13;

    .line 522
    .line 523
    invoke-virtual {v9, v7}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    check-cast v0, Llp1;

    .line 528
    .line 529
    iget-wide v13, v0, Llp1;->f:J

    .line 530
    .line 531
    const/16 v0, 0xc

    .line 532
    .line 533
    invoke-static {v0}, Lrg3;->D(I)J

    .line 534
    .line 535
    .line 536
    move-result-wide v15

    .line 537
    const/16 v0, 0x11

    .line 538
    .line 539
    invoke-static {v0}, Lrg3;->D(I)J

    .line 540
    .line 541
    .line 542
    move-result-wide v21

    .line 543
    const/16 v24, 0x0

    .line 544
    .line 545
    const v25, 0xfdfffc

    .line 546
    .line 547
    .line 548
    const/16 v17, 0x0

    .line 549
    .line 550
    const-wide/16 v18, 0x0

    .line 551
    .line 552
    const/16 v20, 0x0

    .line 553
    .line 554
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 555
    .line 556
    .line 557
    const/16 v18, 0x30

    .line 558
    .line 559
    const/16 v19, 0x3f8

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    const/4 v15, 0x0

    .line 564
    const/16 v16, 0x0

    .line 565
    .line 566
    move-object/from16 v17, v9

    .line 567
    .line 568
    invoke-static/range {v10 .. v19}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 569
    .line 570
    .line 571
    goto :goto_7

    .line 572
    :cond_a
    move-object/from16 v17, v9

    .line 573
    .line 574
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 575
    .line 576
    .line 577
    :goto_7
    return-object v5

    .line 578
    nop

    .line 579
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
