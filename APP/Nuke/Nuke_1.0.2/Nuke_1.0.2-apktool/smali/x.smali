.class public final synthetic Lx;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lx;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lx;->j:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lxm0;Lun0;I)V
    .locals 0

    .line 11
    iput p3, p0, Lx;->h:I

    iput-object p1, p0, Lx;->j:Ljava/lang/Object;

    iput-object p2, p0, Lx;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lx;->h:I

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/16 v4, 0x12

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x4

    .line 12
    sget-object v7, Lnx;->a:Leb;

    .line 13
    .line 14
    sget-object v8, La83;->a:La83;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    iget-object v10, v0, Lx;->j:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v0, v0, Lx;->i:Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, Landroid/text/Spannable;

    .line 26
    .line 27
    check-cast v10, Lw9;

    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Llt2;

    .line 32
    .line 33
    move-object/from16 v2, p2

    .line 34
    .line 35
    check-cast v2, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    move-object/from16 v3, p3

    .line 42
    .line 43
    check-cast v3, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    new-instance v4, Lam0;

    .line 50
    .line 51
    iget-object v5, v1, Llt2;->f:Lmx2;

    .line 52
    .line 53
    iget-object v6, v1, Llt2;->c:Lim0;

    .line 54
    .line 55
    if-nez v6, :cond_0

    .line 56
    .line 57
    sget-object v6, Lim0;->j:Lim0;

    .line 58
    .line 59
    :cond_0
    iget-object v7, v1, Llt2;->d:Lgm0;

    .line 60
    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    iget v11, v7, Lgm0;->a:I

    .line 64
    .line 65
    :cond_1
    iget-object v1, v1, Llt2;->e:Lhm0;

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    iget v1, v1, Lhm0;->a:I

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const v1, 0xffff

    .line 73
    .line 74
    .line 75
    :goto_0
    iget-object v7, v10, Lw9;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v7, Lx9;

    .line 78
    .line 79
    iget-object v10, v7, Lx9;->e:Lxl0;

    .line 80
    .line 81
    check-cast v10, Lyl0;

    .line 82
    .line 83
    invoke-virtual {v10, v5, v6, v11, v1}, Lyl0;->b(Lmx2;Lim0;II)Lm63;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    instance-of v5, v1, Lm63;

    .line 88
    .line 89
    if-nez v5, :cond_3

    .line 90
    .line 91
    new-instance v5, Lvu2;

    .line 92
    .line 93
    iget-object v6, v7, Lx9;->j:Lvu2;

    .line 94
    .line 95
    invoke-direct {v5, v1, v6}, Lvu2;-><init>(Lm63;Lvu2;)V

    .line 96
    .line 97
    .line 98
    iput-object v5, v7, Lx9;->j:Lvu2;

    .line 99
    .line 100
    iget-object v1, v5, Lvu2;->c:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    check-cast v1, Landroid/graphics/Typeface;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    iget-object v1, v1, Lm63;->h:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    check-cast v1, Landroid/graphics/Typeface;

    .line 114
    .line 115
    :goto_1
    invoke-direct {v4, v9, v1}, Lam0;-><init>(ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    const/16 v1, 0x21

    .line 119
    .line 120
    invoke-interface {v0, v4, v2, v3, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 121
    .line 122
    .line 123
    return-object v8

    .line 124
    :pswitch_0
    check-cast v10, Lxm0;

    .line 125
    .line 126
    check-cast v0, Lin0;

    .line 127
    .line 128
    move-object/from16 v1, p1

    .line 129
    .line 130
    check-cast v1, Luh1;

    .line 131
    .line 132
    move-object/from16 v1, p2

    .line 133
    .line 134
    check-cast v1, Lpx;

    .line 135
    .line 136
    move-object/from16 v2, p3

    .line 137
    .line 138
    check-cast v2, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    check-cast v1, Lgo0;

    .line 144
    .line 145
    const v2, 0x2d4acc1b

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v2}, Lgo0;->W(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-ne v2, v7, :cond_4

    .line 156
    .line 157
    invoke-static {v10}, Lop0;->m(Lxm0;)Ln70;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_4
    check-cast v2, Lgu2;

    .line 165
    .line 166
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    if-ne v3, v7, :cond_5

    .line 171
    .line 172
    new-instance v3, Lsc;

    .line 173
    .line 174
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Lrs1;

    .line 179
    .line 180
    iget-wide v4, v4, Lrs1;->a:J

    .line 181
    .line 182
    new-instance v6, Lrs1;

    .line 183
    .line 184
    invoke-direct {v6, v4, v5}, Lrs1;-><init>(J)V

    .line 185
    .line 186
    .line 187
    sget-object v4, Lin2;->b:Ln43;

    .line 188
    .line 189
    sget-wide v9, Lin2;->c:J

    .line 190
    .line 191
    new-instance v5, Lrs1;

    .line 192
    .line 193
    invoke-direct {v5, v9, v10}, Lrs1;-><init>(J)V

    .line 194
    .line 195
    .line 196
    const/16 v9, 0x8

    .line 197
    .line 198
    invoke-direct {v3, v6, v4, v5, v9}, Lsc;-><init>(Ljava/lang/Object;Ln43;Ljava/lang/Object;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_5
    check-cast v3, Lsc;

    .line 205
    .line 206
    invoke-virtual {v1, v3}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    if-nez v4, :cond_6

    .line 215
    .line 216
    if-ne v5, v7, :cond_7

    .line 217
    .line 218
    :cond_6
    new-instance v5, Lb2;

    .line 219
    .line 220
    const/4 v4, 0x0

    .line 221
    const/16 v6, 0x13

    .line 222
    .line 223
    invoke-direct {v5, v2, v3, v4, v6}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_7
    check-cast v5, Lmn0;

    .line 230
    .line 231
    invoke-static {v1, v5, v8}, Leu;->f(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iget-object v2, v3, Lsc;->c:Lid;

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-nez v3, :cond_8

    .line 245
    .line 246
    if-ne v4, v7, :cond_9

    .line 247
    .line 248
    :cond_8
    new-instance v4, Lhn2;

    .line 249
    .line 250
    invoke-direct {v4, v2, v11}, Lhn2;-><init>(Lgu2;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_9
    check-cast v4, Lxm0;

    .line 257
    .line 258
    invoke-interface {v0, v4}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Luh1;

    .line 263
    .line 264
    invoke-virtual {v1, v11}, Lgo0;->p(Z)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_1
    move-object v13, v10

    .line 269
    check-cast v13, Lxm0;

    .line 270
    .line 271
    check-cast v0, Lxm0;

    .line 272
    .line 273
    move-object/from16 v1, p1

    .line 274
    .line 275
    check-cast v1, Lpb2;

    .line 276
    .line 277
    move-object/from16 v2, p2

    .line 278
    .line 279
    check-cast v2, Lpx;

    .line 280
    .line 281
    move-object/from16 v3, p3

    .line 282
    .line 283
    check-cast v3, Ljava/lang/Integer;

    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    and-int/lit8 v7, v3, 0x6

    .line 293
    .line 294
    if-nez v7, :cond_b

    .line 295
    .line 296
    move-object v7, v2

    .line 297
    check-cast v7, Lgo0;

    .line 298
    .line 299
    invoke-virtual {v7, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    if-eqz v7, :cond_a

    .line 304
    .line 305
    move v5, v6

    .line 306
    :cond_a
    or-int/2addr v3, v5

    .line 307
    :cond_b
    and-int/lit8 v5, v3, 0x13

    .line 308
    .line 309
    if-eq v5, v4, :cond_c

    .line 310
    .line 311
    move v11, v9

    .line 312
    :cond_c
    and-int/2addr v3, v9

    .line 313
    check-cast v2, Lgo0;

    .line 314
    .line 315
    invoke-virtual {v2, v3, v11}, Lgo0;->O(IZ)Z

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    if-eqz v3, :cond_d

    .line 320
    .line 321
    const v3, 0x790b0111

    .line 322
    .line 323
    .line 324
    invoke-static {v3, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 329
    .line 330
    .line 331
    move-result-object v14

    .line 332
    const/16 v18, 0x0

    .line 333
    .line 334
    const/16 v19, 0x38

    .line 335
    .line 336
    const/4 v15, 0x0

    .line 337
    const/16 v16, 0x0

    .line 338
    .line 339
    move-object/from16 v17, v2

    .line 340
    .line 341
    invoke-static/range {v12 .. v19}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 342
    .line 343
    .line 344
    const v3, 0x790b014a

    .line 345
    .line 346
    .line 347
    invoke-static {v3, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v14

    .line 351
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 352
    .line 353
    .line 354
    move-result-object v16

    .line 355
    const/16 v20, 0x0

    .line 356
    .line 357
    const/16 v21, 0x38

    .line 358
    .line 359
    const/16 v17, 0x0

    .line 360
    .line 361
    move-object v15, v0

    .line 362
    move-object/from16 v19, v2

    .line 363
    .line 364
    invoke-static/range {v14 .. v21}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 365
    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_d
    move-object/from16 v17, v2

    .line 369
    .line 370
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 371
    .line 372
    .line 373
    :goto_2
    return-object v8

    .line 374
    :pswitch_2
    check-cast v0, Lci1;

    .line 375
    .line 376
    check-cast v10, Lxm0;

    .line 377
    .line 378
    move-object/from16 v1, p1

    .line 379
    .line 380
    check-cast v1, Lxm0;

    .line 381
    .line 382
    move-object/from16 v2, p2

    .line 383
    .line 384
    check-cast v2, Lpx;

    .line 385
    .line 386
    move-object/from16 v12, p3

    .line 387
    .line 388
    check-cast v12, Ljava/lang/Integer;

    .line 389
    .line 390
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    and-int/lit8 v13, v12, 0x6

    .line 398
    .line 399
    if-nez v13, :cond_f

    .line 400
    .line 401
    move-object v13, v2

    .line 402
    check-cast v13, Lgo0;

    .line 403
    .line 404
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v13

    .line 408
    if-eqz v13, :cond_e

    .line 409
    .line 410
    move v5, v6

    .line 411
    :cond_e
    or-int/2addr v12, v5

    .line 412
    :cond_f
    and-int/lit8 v5, v12, 0x13

    .line 413
    .line 414
    if-eq v5, v4, :cond_10

    .line 415
    .line 416
    move v4, v9

    .line 417
    goto :goto_3

    .line 418
    :cond_10
    move v4, v11

    .line 419
    :goto_3
    and-int/lit8 v5, v12, 0x1

    .line 420
    .line 421
    check-cast v2, Lgo0;

    .line 422
    .line 423
    invoke-virtual {v2, v5, v4}, Lgo0;->O(IZ)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-eqz v4, :cond_14

    .line 428
    .line 429
    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    and-int/lit8 v5, v12, 0xe

    .line 434
    .line 435
    if-ne v5, v6, :cond_11

    .line 436
    .line 437
    goto :goto_4

    .line 438
    :cond_11
    move v9, v11

    .line 439
    :goto_4
    or-int/2addr v4, v9

    .line 440
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    if-nez v4, :cond_12

    .line 445
    .line 446
    if-ne v5, v7, :cond_13

    .line 447
    .line 448
    :cond_12
    new-instance v5, Lz;

    .line 449
    .line 450
    const/4 v4, 0x7

    .line 451
    invoke-direct {v5, v10, v1, v4}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    :cond_13
    check-cast v5, Lin0;

    .line 458
    .line 459
    shl-int/lit8 v3, v12, 0x3

    .line 460
    .line 461
    and-int/lit8 v3, v3, 0x70

    .line 462
    .line 463
    invoke-static {v0, v1, v5, v2, v3}, Lpp0;->e(Lci1;Lxm0;Lin0;Lpx;I)V

    .line 464
    .line 465
    .line 466
    goto :goto_5

    .line 467
    :cond_14
    invoke-virtual {v2}, Lgo0;->R()V

    .line 468
    .line 469
    .line 470
    :goto_5
    return-object v8

    .line 471
    :pswitch_3
    check-cast v0, Lin0;

    .line 472
    .line 473
    check-cast v10, Lm00;

    .line 474
    .line 475
    move-object/from16 v1, p1

    .line 476
    .line 477
    check-cast v1, Lbv;

    .line 478
    .line 479
    move-object/from16 v1, p2

    .line 480
    .line 481
    check-cast v1, Lpx;

    .line 482
    .line 483
    move-object/from16 v3, p3

    .line 484
    .line 485
    check-cast v3, Ljava/lang/Integer;

    .line 486
    .line 487
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    and-int/lit8 v4, v3, 0x11

    .line 492
    .line 493
    if-eq v4, v2, :cond_15

    .line 494
    .line 495
    move v2, v9

    .line 496
    goto :goto_6

    .line 497
    :cond_15
    move v2, v11

    .line 498
    :goto_6
    and-int/2addr v3, v9

    .line 499
    check-cast v1, Lgo0;

    .line 500
    .line 501
    invoke-virtual {v1, v3, v2}, Lgo0;->O(IZ)Z

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    if-eqz v2, :cond_17

    .line 506
    .line 507
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    if-ne v2, v7, :cond_16

    .line 512
    .line 513
    new-instance v2, Ln00;

    .line 514
    .line 515
    invoke-direct {v2}, Ln00;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    :cond_16
    check-cast v2, Ln00;

    .line 522
    .line 523
    iget-object v3, v2, Ln00;->a:Lps2;

    .line 524
    .line 525
    invoke-virtual {v3}, Lps2;->clear()V

    .line 526
    .line 527
    .line 528
    invoke-interface {v0, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2, v10, v1, v11}, Ln00;->a(Lm00;Lpx;I)V

    .line 532
    .line 533
    .line 534
    goto :goto_7

    .line 535
    :cond_17
    invoke-virtual {v1}, Lgo0;->R()V

    .line 536
    .line 537
    .line 538
    :goto_7
    return-object v8

    .line 539
    :pswitch_4
    check-cast v0, Ljava/lang/String;

    .line 540
    .line 541
    check-cast v10, Lxm0;

    .line 542
    .line 543
    move-object/from16 v1, p1

    .line 544
    .line 545
    check-cast v1, Lxm0;

    .line 546
    .line 547
    move-object/from16 v2, p2

    .line 548
    .line 549
    check-cast v2, Lpx;

    .line 550
    .line 551
    move-object/from16 v12, p3

    .line 552
    .line 553
    check-cast v12, Ljava/lang/Integer;

    .line 554
    .line 555
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 556
    .line 557
    .line 558
    move-result v12

    .line 559
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    and-int/lit8 v13, v12, 0x6

    .line 563
    .line 564
    if-nez v13, :cond_19

    .line 565
    .line 566
    move-object v13, v2

    .line 567
    check-cast v13, Lgo0;

    .line 568
    .line 569
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v13

    .line 573
    if-eqz v13, :cond_18

    .line 574
    .line 575
    move v5, v6

    .line 576
    :cond_18
    or-int/2addr v12, v5

    .line 577
    :cond_19
    and-int/lit8 v5, v12, 0x13

    .line 578
    .line 579
    if-eq v5, v4, :cond_1a

    .line 580
    .line 581
    move v4, v9

    .line 582
    goto :goto_8

    .line 583
    :cond_1a
    move v4, v11

    .line 584
    :goto_8
    and-int/lit8 v5, v12, 0x1

    .line 585
    .line 586
    check-cast v2, Lgo0;

    .line 587
    .line 588
    invoke-virtual {v2, v5, v4}, Lgo0;->O(IZ)Z

    .line 589
    .line 590
    .line 591
    move-result v4

    .line 592
    if-eqz v4, :cond_1e

    .line 593
    .line 594
    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v4

    .line 598
    and-int/lit8 v5, v12, 0xe

    .line 599
    .line 600
    if-ne v5, v6, :cond_1b

    .line 601
    .line 602
    goto :goto_9

    .line 603
    :cond_1b
    move v9, v11

    .line 604
    :goto_9
    or-int/2addr v4, v9

    .line 605
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    if-nez v4, :cond_1c

    .line 610
    .line 611
    if-ne v5, v7, :cond_1d

    .line 612
    .line 613
    :cond_1c
    new-instance v5, Lz;

    .line 614
    .line 615
    const/4 v4, 0x5

    .line 616
    invoke-direct {v5, v10, v1, v4}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    :cond_1d
    check-cast v5, Lin0;

    .line 623
    .line 624
    shl-int/lit8 v3, v12, 0x3

    .line 625
    .line 626
    and-int/lit8 v3, v3, 0x70

    .line 627
    .line 628
    invoke-static {v0, v1, v5, v2, v3}, Lrg3;->c(Ljava/lang/String;Lxm0;Lin0;Lpx;I)V

    .line 629
    .line 630
    .line 631
    goto :goto_a

    .line 632
    :cond_1e
    invoke-virtual {v2}, Lgo0;->R()V

    .line 633
    .line 634
    .line 635
    :goto_a
    return-object v8

    .line 636
    :pswitch_5
    check-cast v0, Lcr;

    .line 637
    .line 638
    check-cast v10, Lxm0;

    .line 639
    .line 640
    move-object/from16 v1, p1

    .line 641
    .line 642
    check-cast v1, Lxm0;

    .line 643
    .line 644
    move-object/from16 v2, p2

    .line 645
    .line 646
    check-cast v2, Lpx;

    .line 647
    .line 648
    move-object/from16 v12, p3

    .line 649
    .line 650
    check-cast v12, Ljava/lang/Integer;

    .line 651
    .line 652
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 653
    .line 654
    .line 655
    move-result v12

    .line 656
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    and-int/lit8 v13, v12, 0x6

    .line 660
    .line 661
    if-nez v13, :cond_20

    .line 662
    .line 663
    move-object v13, v2

    .line 664
    check-cast v13, Lgo0;

    .line 665
    .line 666
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v13

    .line 670
    if-eqz v13, :cond_1f

    .line 671
    .line 672
    move v5, v6

    .line 673
    :cond_1f
    or-int/2addr v12, v5

    .line 674
    :cond_20
    and-int/lit8 v5, v12, 0x13

    .line 675
    .line 676
    if-eq v5, v4, :cond_21

    .line 677
    .line 678
    move v4, v9

    .line 679
    goto :goto_b

    .line 680
    :cond_21
    move v4, v11

    .line 681
    :goto_b
    and-int/lit8 v5, v12, 0x1

    .line 682
    .line 683
    check-cast v2, Lgo0;

    .line 684
    .line 685
    invoke-virtual {v2, v5, v4}, Lgo0;->O(IZ)Z

    .line 686
    .line 687
    .line 688
    move-result v4

    .line 689
    if-eqz v4, :cond_25

    .line 690
    .line 691
    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    and-int/lit8 v5, v12, 0xe

    .line 696
    .line 697
    if-ne v5, v6, :cond_22

    .line 698
    .line 699
    goto :goto_c

    .line 700
    :cond_22
    move v9, v11

    .line 701
    :goto_c
    or-int/2addr v4, v9

    .line 702
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    if-nez v4, :cond_23

    .line 707
    .line 708
    if-ne v5, v7, :cond_24

    .line 709
    .line 710
    :cond_23
    new-instance v5, Lz;

    .line 711
    .line 712
    invoke-direct {v5, v10, v1, v6}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    :cond_24
    check-cast v5, Lin0;

    .line 719
    .line 720
    shl-int/lit8 v3, v12, 0x3

    .line 721
    .line 722
    and-int/lit8 v3, v3, 0x70

    .line 723
    .line 724
    invoke-static {v0, v1, v5, v2, v3}, Lyr;->d(Lcr;Lxm0;Lin0;Lpx;I)V

    .line 725
    .line 726
    .line 727
    goto :goto_d

    .line 728
    :cond_25
    invoke-virtual {v2}, Lgo0;->R()V

    .line 729
    .line 730
    .line 731
    :goto_d
    return-object v8

    .line 732
    :pswitch_6
    check-cast v0, Ldi;

    .line 733
    .line 734
    check-cast v10, Lxm0;

    .line 735
    .line 736
    move-object/from16 v1, p1

    .line 737
    .line 738
    check-cast v1, Lxm0;

    .line 739
    .line 740
    move-object/from16 v2, p2

    .line 741
    .line 742
    check-cast v2, Lpx;

    .line 743
    .line 744
    move-object/from16 v12, p3

    .line 745
    .line 746
    check-cast v12, Ljava/lang/Integer;

    .line 747
    .line 748
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 749
    .line 750
    .line 751
    move-result v12

    .line 752
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    and-int/lit8 v13, v12, 0x6

    .line 756
    .line 757
    if-nez v13, :cond_27

    .line 758
    .line 759
    move-object v13, v2

    .line 760
    check-cast v13, Lgo0;

    .line 761
    .line 762
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v13

    .line 766
    if-eqz v13, :cond_26

    .line 767
    .line 768
    move v5, v6

    .line 769
    :cond_26
    or-int/2addr v12, v5

    .line 770
    :cond_27
    and-int/lit8 v5, v12, 0x13

    .line 771
    .line 772
    if-eq v5, v4, :cond_28

    .line 773
    .line 774
    move v4, v9

    .line 775
    goto :goto_e

    .line 776
    :cond_28
    move v4, v11

    .line 777
    :goto_e
    and-int/lit8 v5, v12, 0x1

    .line 778
    .line 779
    check-cast v2, Lgo0;

    .line 780
    .line 781
    invoke-virtual {v2, v5, v4}, Lgo0;->O(IZ)Z

    .line 782
    .line 783
    .line 784
    move-result v4

    .line 785
    if-eqz v4, :cond_2c

    .line 786
    .line 787
    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    and-int/lit8 v5, v12, 0xe

    .line 792
    .line 793
    if-ne v5, v6, :cond_29

    .line 794
    .line 795
    goto :goto_f

    .line 796
    :cond_29
    move v9, v11

    .line 797
    :goto_f
    or-int/2addr v4, v9

    .line 798
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    if-nez v4, :cond_2a

    .line 803
    .line 804
    if-ne v5, v7, :cond_2b

    .line 805
    .line 806
    :cond_2a
    new-instance v5, Lz;

    .line 807
    .line 808
    invoke-direct {v5, v10, v1, v3}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    :cond_2b
    check-cast v5, Lin0;

    .line 815
    .line 816
    shl-int/lit8 v3, v12, 0x3

    .line 817
    .line 818
    and-int/lit8 v3, v3, 0x70

    .line 819
    .line 820
    invoke-static {v0, v1, v5, v2, v3}, Lt11;->a(Ldi;Lxm0;Lin0;Lpx;I)V

    .line 821
    .line 822
    .line 823
    goto :goto_10

    .line 824
    :cond_2c
    invoke-virtual {v2}, Lgo0;->R()V

    .line 825
    .line 826
    .line 827
    :goto_10
    return-object v8

    .line 828
    :pswitch_7
    check-cast v0, Lch;

    .line 829
    .line 830
    check-cast v10, Lxm0;

    .line 831
    .line 832
    move-object/from16 v1, p1

    .line 833
    .line 834
    check-cast v1, Lxm0;

    .line 835
    .line 836
    move-object/from16 v2, p2

    .line 837
    .line 838
    check-cast v2, Lpx;

    .line 839
    .line 840
    move-object/from16 v12, p3

    .line 841
    .line 842
    check-cast v12, Ljava/lang/Integer;

    .line 843
    .line 844
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 845
    .line 846
    .line 847
    move-result v12

    .line 848
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 849
    .line 850
    .line 851
    and-int/lit8 v13, v12, 0x6

    .line 852
    .line 853
    if-nez v13, :cond_2e

    .line 854
    .line 855
    move-object v13, v2

    .line 856
    check-cast v13, Lgo0;

    .line 857
    .line 858
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    move-result v13

    .line 862
    if-eqz v13, :cond_2d

    .line 863
    .line 864
    move v13, v6

    .line 865
    goto :goto_11

    .line 866
    :cond_2d
    move v13, v5

    .line 867
    :goto_11
    or-int/2addr v12, v13

    .line 868
    :cond_2e
    and-int/lit8 v13, v12, 0x13

    .line 869
    .line 870
    if-eq v13, v4, :cond_2f

    .line 871
    .line 872
    move v4, v9

    .line 873
    goto :goto_12

    .line 874
    :cond_2f
    move v4, v11

    .line 875
    :goto_12
    and-int/lit8 v13, v12, 0x1

    .line 876
    .line 877
    check-cast v2, Lgo0;

    .line 878
    .line 879
    invoke-virtual {v2, v13, v4}, Lgo0;->O(IZ)Z

    .line 880
    .line 881
    .line 882
    move-result v4

    .line 883
    if-eqz v4, :cond_33

    .line 884
    .line 885
    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    move-result v4

    .line 889
    and-int/lit8 v13, v12, 0xe

    .line 890
    .line 891
    if-ne v13, v6, :cond_30

    .line 892
    .line 893
    goto :goto_13

    .line 894
    :cond_30
    move v9, v11

    .line 895
    :goto_13
    or-int/2addr v4, v9

    .line 896
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v6

    .line 900
    if-nez v4, :cond_31

    .line 901
    .line 902
    if-ne v6, v7, :cond_32

    .line 903
    .line 904
    :cond_31
    new-instance v6, Lz;

    .line 905
    .line 906
    invoke-direct {v6, v10, v1, v5}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v2, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    :cond_32
    check-cast v6, Lin0;

    .line 913
    .line 914
    shl-int/lit8 v3, v12, 0x3

    .line 915
    .line 916
    and-int/lit8 v3, v3, 0x70

    .line 917
    .line 918
    invoke-static {v0, v1, v6, v2, v3}, Ls11;->b(Lch;Lxm0;Lin0;Lpx;I)V

    .line 919
    .line 920
    .line 921
    goto :goto_14

    .line 922
    :cond_33
    invoke-virtual {v2}, Lgo0;->R()V

    .line 923
    .line 924
    .line 925
    :goto_14
    return-object v8

    .line 926
    :pswitch_8
    check-cast v0, Lin0;

    .line 927
    .line 928
    check-cast v10, Lc73;

    .line 929
    .line 930
    move-object/from16 v1, p1

    .line 931
    .line 932
    check-cast v1, Lo71;

    .line 933
    .line 934
    move-object/from16 v3, p2

    .line 935
    .line 936
    check-cast v3, Lpx;

    .line 937
    .line 938
    move-object/from16 v4, p3

    .line 939
    .line 940
    check-cast v4, Ljava/lang/Integer;

    .line 941
    .line 942
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    and-int/lit8 v1, v4, 0x11

    .line 950
    .line 951
    if-eq v1, v2, :cond_34

    .line 952
    .line 953
    move v11, v9

    .line 954
    :cond_34
    and-int/lit8 v1, v4, 0x1

    .line 955
    .line 956
    move-object v15, v3

    .line 957
    check-cast v15, Lgo0;

    .line 958
    .line 959
    invoke-virtual {v15, v1, v11}, Lgo0;->O(IZ)Z

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    if-eqz v1, :cond_35

    .line 964
    .line 965
    const v1, 0x790b0138

    .line 966
    .line 967
    .line 968
    invoke-static {v1, v15}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v13

    .line 972
    new-instance v1, Lgf;

    .line 973
    .line 974
    invoke-direct {v1, v0, v10}, Lgf;-><init>(Lin0;Lc73;)V

    .line 975
    .line 976
    .line 977
    const v0, -0x6f21aba1

    .line 978
    .line 979
    .line 980
    invoke-static {v0, v1, v15}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 981
    .line 982
    .line 983
    move-result-object v14

    .line 984
    const/16 v16, 0x180

    .line 985
    .line 986
    const/16 v17, 0x1

    .line 987
    .line 988
    const/4 v12, 0x0

    .line 989
    invoke-static/range {v12 .. v17}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 990
    .line 991
    .line 992
    goto :goto_15

    .line 993
    :cond_35
    invoke-virtual {v15}, Lgo0;->R()V

    .line 994
    .line 995
    .line 996
    :goto_15
    return-object v8

    .line 997
    :pswitch_9
    check-cast v0, Lde;

    .line 998
    .line 999
    check-cast v10, Lxm0;

    .line 1000
    .line 1001
    move-object/from16 v1, p1

    .line 1002
    .line 1003
    check-cast v1, Lxm0;

    .line 1004
    .line 1005
    move-object/from16 v2, p2

    .line 1006
    .line 1007
    check-cast v2, Lpx;

    .line 1008
    .line 1009
    move-object/from16 v12, p3

    .line 1010
    .line 1011
    check-cast v12, Ljava/lang/Integer;

    .line 1012
    .line 1013
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 1014
    .line 1015
    .line 1016
    move-result v12

    .line 1017
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    and-int/lit8 v13, v12, 0x6

    .line 1021
    .line 1022
    if-nez v13, :cond_37

    .line 1023
    .line 1024
    move-object v13, v2

    .line 1025
    check-cast v13, Lgo0;

    .line 1026
    .line 1027
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v13

    .line 1031
    if-eqz v13, :cond_36

    .line 1032
    .line 1033
    move v5, v6

    .line 1034
    :cond_36
    or-int/2addr v12, v5

    .line 1035
    :cond_37
    and-int/lit8 v5, v12, 0x13

    .line 1036
    .line 1037
    if-eq v5, v4, :cond_38

    .line 1038
    .line 1039
    move v4, v9

    .line 1040
    goto :goto_16

    .line 1041
    :cond_38
    move v4, v11

    .line 1042
    :goto_16
    and-int/lit8 v5, v12, 0x1

    .line 1043
    .line 1044
    check-cast v2, Lgo0;

    .line 1045
    .line 1046
    invoke-virtual {v2, v5, v4}, Lgo0;->O(IZ)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v4

    .line 1050
    if-eqz v4, :cond_3c

    .line 1051
    .line 1052
    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v4

    .line 1056
    and-int/lit8 v5, v12, 0xe

    .line 1057
    .line 1058
    if-ne v5, v6, :cond_39

    .line 1059
    .line 1060
    move v11, v9

    .line 1061
    :cond_39
    or-int/2addr v4, v11

    .line 1062
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v5

    .line 1066
    if-nez v4, :cond_3a

    .line 1067
    .line 1068
    if-ne v5, v7, :cond_3b

    .line 1069
    .line 1070
    :cond_3a
    new-instance v5, Lz;

    .line 1071
    .line 1072
    invoke-direct {v5, v10, v1, v9}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    :cond_3b
    check-cast v5, Lin0;

    .line 1079
    .line 1080
    shl-int/lit8 v3, v12, 0x3

    .line 1081
    .line 1082
    and-int/lit8 v3, v3, 0x70

    .line 1083
    .line 1084
    invoke-static {v0, v1, v5, v2, v3}, Lrg3;->a(Lde;Lxm0;Lin0;Lpx;I)V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_17

    .line 1088
    :cond_3c
    invoke-virtual {v2}, Lgo0;->R()V

    .line 1089
    .line 1090
    .line 1091
    :goto_17
    return-object v8

    .line 1092
    :pswitch_a
    check-cast v0, Lk1;

    .line 1093
    .line 1094
    check-cast v10, Lkx1;

    .line 1095
    .line 1096
    move-object/from16 v1, p1

    .line 1097
    .line 1098
    check-cast v1, Lbv;

    .line 1099
    .line 1100
    move-object/from16 v3, p2

    .line 1101
    .line 1102
    check-cast v3, Lpx;

    .line 1103
    .line 1104
    move-object/from16 v4, p3

    .line 1105
    .line 1106
    check-cast v4, Ljava/lang/Integer;

    .line 1107
    .line 1108
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1109
    .line 1110
    .line 1111
    move-result v4

    .line 1112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1113
    .line 1114
    .line 1115
    and-int/lit8 v1, v4, 0x11

    .line 1116
    .line 1117
    if-eq v1, v2, :cond_3d

    .line 1118
    .line 1119
    move v1, v9

    .line 1120
    goto :goto_18

    .line 1121
    :cond_3d
    move v1, v11

    .line 1122
    :goto_18
    and-int/lit8 v2, v4, 0x1

    .line 1123
    .line 1124
    check-cast v3, Lgo0;

    .line 1125
    .line 1126
    invoke-virtual {v3, v2, v1}, Lgo0;->O(IZ)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    if-eqz v1, :cond_3f

    .line 1131
    .line 1132
    iget-object v0, v0, Lk1;->a:Ljava/lang/String;

    .line 1133
    .line 1134
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    const v1, 0x790b0021

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v1, v0, v3}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    invoke-static {v0, v3, v11}, Lse;->f(Ljava/lang/String;Lpx;I)V

    .line 1146
    .line 1147
    .line 1148
    const/high16 v0, 0x41400000    # 12.0f

    .line 1149
    .line 1150
    const v1, 0x790b0023

    .line 1151
    .line 1152
    .line 1153
    sget-object v2, Lrh1;->a:Lrh1;

    .line 1154
    .line 1155
    invoke-static {v2, v0, v3, v1, v3}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v12

    .line 1159
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    if-ne v0, v7, :cond_3e

    .line 1164
    .line 1165
    new-instance v0, Lq0;

    .line 1166
    .line 1167
    invoke-direct {v0, v10, v11}, Lq0;-><init>(Lkx1;I)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v3, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1171
    .line 1172
    .line 1173
    :cond_3e
    move-object v13, v0

    .line 1174
    check-cast v13, Lxm0;

    .line 1175
    .line 1176
    const/16 v18, 0x30

    .line 1177
    .line 1178
    const/16 v19, 0x3c

    .line 1179
    .line 1180
    const/4 v14, 0x0

    .line 1181
    const/4 v15, 0x0

    .line 1182
    const/16 v16, 0x0

    .line 1183
    .line 1184
    move-object/from16 v17, v3

    .line 1185
    .line 1186
    invoke-static/range {v12 .. v19}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 1187
    .line 1188
    .line 1189
    goto :goto_19

    .line 1190
    :cond_3f
    move-object/from16 v17, v3

    .line 1191
    .line 1192
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 1193
    .line 1194
    .line 1195
    :goto_19
    return-object v8

    .line 1196
    :pswitch_b
    check-cast v0, Lnuke/module/wechat/ai/AIChatConfig;

    .line 1197
    .line 1198
    check-cast v10, Lxm0;

    .line 1199
    .line 1200
    move-object/from16 v1, p1

    .line 1201
    .line 1202
    check-cast v1, Lxm0;

    .line 1203
    .line 1204
    move-object/from16 v2, p2

    .line 1205
    .line 1206
    check-cast v2, Lpx;

    .line 1207
    .line 1208
    move-object/from16 v12, p3

    .line 1209
    .line 1210
    check-cast v12, Ljava/lang/Integer;

    .line 1211
    .line 1212
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 1213
    .line 1214
    .line 1215
    move-result v12

    .line 1216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1217
    .line 1218
    .line 1219
    and-int/lit8 v13, v12, 0x6

    .line 1220
    .line 1221
    if-nez v13, :cond_41

    .line 1222
    .line 1223
    move-object v13, v2

    .line 1224
    check-cast v13, Lgo0;

    .line 1225
    .line 1226
    invoke-virtual {v13, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v13

    .line 1230
    if-eqz v13, :cond_40

    .line 1231
    .line 1232
    move v5, v6

    .line 1233
    :cond_40
    or-int/2addr v12, v5

    .line 1234
    :cond_41
    and-int/lit8 v5, v12, 0x13

    .line 1235
    .line 1236
    if-eq v5, v4, :cond_42

    .line 1237
    .line 1238
    move v4, v9

    .line 1239
    goto :goto_1a

    .line 1240
    :cond_42
    move v4, v11

    .line 1241
    :goto_1a
    and-int/lit8 v5, v12, 0x1

    .line 1242
    .line 1243
    check-cast v2, Lgo0;

    .line 1244
    .line 1245
    invoke-virtual {v2, v5, v4}, Lgo0;->O(IZ)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v4

    .line 1249
    if-eqz v4, :cond_46

    .line 1250
    .line 1251
    invoke-virtual {v2, v10}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v4

    .line 1255
    and-int/lit8 v5, v12, 0xe

    .line 1256
    .line 1257
    if-ne v5, v6, :cond_43

    .line 1258
    .line 1259
    goto :goto_1b

    .line 1260
    :cond_43
    move v9, v11

    .line 1261
    :goto_1b
    or-int/2addr v4, v9

    .line 1262
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v5

    .line 1266
    if-nez v4, :cond_44

    .line 1267
    .line 1268
    if-ne v5, v7, :cond_45

    .line 1269
    .line 1270
    :cond_44
    new-instance v5, Lz;

    .line 1271
    .line 1272
    invoke-direct {v5, v10, v1, v11}, Lz;-><init>(Lxm0;Lxm0;I)V

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    :cond_45
    check-cast v5, Lin0;

    .line 1279
    .line 1280
    sget v4, Lnuke/module/wechat/ai/AIChatConfig;->$stable:I

    .line 1281
    .line 1282
    shl-int/lit8 v3, v12, 0x3

    .line 1283
    .line 1284
    and-int/lit8 v3, v3, 0x70

    .line 1285
    .line 1286
    or-int/2addr v3, v4

    .line 1287
    invoke-static {v0, v1, v5, v2, v3}, Lse;->a(Lnuke/module/wechat/ai/AIChatConfig;Lxm0;Lin0;Lpx;I)V

    .line 1288
    .line 1289
    .line 1290
    goto :goto_1c

    .line 1291
    :cond_46
    invoke-virtual {v2}, Lgo0;->R()V

    .line 1292
    .line 1293
    .line 1294
    :goto_1c
    return-object v8

    .line 1295
    :pswitch_data_0
    .packed-switch 0x0
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
