.class public final synthetic Ltr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 14
    iput p1, p0, Ltr;->h:I

    iput-object p2, p0, Ltr;->j:Ljava/lang/Object;

    iput-object p4, p0, Ltr;->i:Ljava/lang/Object;

    iput-object p3, p0, Ltr;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Ltr;->h:I

    iput-object p1, p0, Ltr;->i:Ljava/lang/Object;

    iput-object p2, p0, Ltr;->j:Ljava/lang/Object;

    iput-object p3, p0, Ltr;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lxk1;Lxk1;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Ltr;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ltr;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ltr;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ltr;->i:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ltr;->h:I

    .line 4
    .line 5
    sget-object v2, Lrh1;->a:Lrh1;

    .line 6
    .line 7
    const/high16 v4, 0x41200000    # 10.0f

    .line 8
    .line 9
    const v5, 0x790b0111

    .line 10
    .line 11
    .line 12
    const/16 v6, 0xc

    .line 13
    .line 14
    sget-object v7, Lnx;->a:Leb;

    .line 15
    .line 16
    const/4 v9, 0x4

    .line 17
    const/16 v10, 0x10

    .line 18
    .line 19
    const/16 v12, 0x12

    .line 20
    .line 21
    sget-object v13, La83;->a:La83;

    .line 22
    .line 23
    const/4 v14, 0x1

    .line 24
    iget-object v15, v0, Ltr;->k:Ljava/lang/Object;

    .line 25
    .line 26
    const/16 v16, 0xd

    .line 27
    .line 28
    iget-object v3, v0, Ltr;->i:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v0, v0, Ltr;->j:Ljava/lang/Object;

    .line 31
    .line 32
    const/16 v17, 0x11

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    packed-switch v1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    move-object/from16 v19, v0

    .line 39
    .line 40
    check-cast v19, Lxm0;

    .line 41
    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    check-cast v15, Lin0;

    .line 45
    .line 46
    move-object/from16 v0, p1

    .line 47
    .line 48
    check-cast v0, Lpb2;

    .line 49
    .line 50
    move-object/from16 v1, p2

    .line 51
    .line 52
    check-cast v1, Lpx;

    .line 53
    .line 54
    move-object/from16 v2, p3

    .line 55
    .line 56
    check-cast v2, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    and-int/lit8 v4, v2, 0x6

    .line 66
    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    move-object v4, v1

    .line 70
    check-cast v4, Lgo0;

    .line 71
    .line 72
    invoke-virtual {v4, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_0

    .line 77
    .line 78
    move v8, v9

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    const/4 v8, 0x2

    .line 81
    :goto_0
    or-int/2addr v2, v8

    .line 82
    :cond_1
    and-int/lit8 v4, v2, 0x13

    .line 83
    .line 84
    if-eq v4, v12, :cond_2

    .line 85
    .line 86
    move v4, v14

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move v4, v11

    .line 89
    :goto_1
    and-int/2addr v2, v14

    .line 90
    check-cast v1, Lgo0;

    .line 91
    .line 92
    invoke-virtual {v1, v2, v4}, Lgo0;->O(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    invoke-static {v5, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v18

    .line 102
    invoke-static {v0}, Lpb2;->a(Lpb2;)Luh1;

    .line 103
    .line 104
    .line 105
    move-result-object v20

    .line 106
    const/16 v24, 0x0

    .line 107
    .line 108
    const/16 v25, 0x38

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    move-object/from16 v23, v1

    .line 115
    .line 116
    invoke-static/range {v18 .. v25}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 117
    .line 118
    .line 119
    const v2, 0x790b01de

    .line 120
    .line 121
    .line 122
    invoke-static {v2, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v20

    .line 126
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-lez v2, :cond_3

    .line 131
    .line 132
    move/from16 v23, v14

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    move/from16 v23, v11

    .line 136
    .line 137
    :goto_2
    invoke-static {v0}, Lpb2;->a(Lpb2;)Luh1;

    .line 138
    .line 139
    .line 140
    move-result-object v22

    .line 141
    invoke-virtual {v1, v15}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-virtual {v1, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    or-int/2addr v0, v2

    .line 150
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-nez v0, :cond_4

    .line 155
    .line 156
    if-ne v2, v7, :cond_5

    .line 157
    .line 158
    :cond_4
    new-instance v2, Lbu1;

    .line 159
    .line 160
    invoke-direct {v2, v15, v3, v11}, Lbu1;-><init>(Lin0;Ljava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    move-object/from16 v21, v2

    .line 167
    .line 168
    check-cast v21, Lxm0;

    .line 169
    .line 170
    const/16 v26, 0x0

    .line 171
    .line 172
    const/16 v27, 0x30

    .line 173
    .line 174
    const/16 v24, 0x0

    .line 175
    .line 176
    move-object/from16 v25, v1

    .line 177
    .line 178
    invoke-static/range {v20 .. v27}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    invoke-virtual {v1}, Lgo0;->R()V

    .line 183
    .line 184
    .line 185
    :goto_3
    return-object v13

    .line 186
    :pswitch_0
    check-cast v0, Lxk1;

    .line 187
    .line 188
    check-cast v15, Lxk1;

    .line 189
    .line 190
    check-cast v3, Ljava/lang/Integer;

    .line 191
    .line 192
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, Lbv;

    .line 195
    .line 196
    move-object/from16 v2, p2

    .line 197
    .line 198
    check-cast v2, Lpx;

    .line 199
    .line 200
    move-object/from16 v5, p3

    .line 201
    .line 202
    check-cast v5, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    and-int/lit8 v1, v5, 0x11

    .line 212
    .line 213
    if-eq v1, v10, :cond_7

    .line 214
    .line 215
    move v1, v14

    .line 216
    goto :goto_4

    .line 217
    :cond_7
    move v1, v11

    .line 218
    :goto_4
    and-int/2addr v5, v14

    .line 219
    check-cast v2, Lgo0;

    .line 220
    .line 221
    invoke-virtual {v2, v5, v1}, Lgo0;->O(IZ)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_d

    .line 226
    .line 227
    const v1, 0x790b01c6

    .line 228
    .line 229
    .line 230
    invoke-static {v1, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v18

    .line 234
    const v1, 0x790b01c7

    .line 235
    .line 236
    .line 237
    invoke-static {v1, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v20

    .line 241
    new-instance v1, Ls9;

    .line 242
    .line 243
    invoke-direct {v1, v6, v0}, Ls9;-><init>(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    const v5, -0x3091c5ff

    .line 247
    .line 248
    .line 249
    invoke-static {v5, v1, v2}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 250
    .line 251
    .line 252
    move-result-object v22

    .line 253
    invoke-virtual {v2, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    if-nez v1, :cond_8

    .line 262
    .line 263
    if-ne v5, v7, :cond_9

    .line 264
    .line 265
    :cond_8
    new-instance v5, Lf0;

    .line 266
    .line 267
    const/16 v1, 0x1d

    .line 268
    .line 269
    invoke-direct {v5, v0, v1}, Lf0;-><init>(Lxk1;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_9
    move-object/from16 v25, v5

    .line 276
    .line 277
    check-cast v25, Lxm0;

    .line 278
    .line 279
    const/16 v28, 0x6000

    .line 280
    .line 281
    const/16 v29, 0x16a

    .line 282
    .line 283
    const/16 v19, 0x0

    .line 284
    .line 285
    const/16 v21, 0x0

    .line 286
    .line 287
    const/16 v23, 0x0

    .line 288
    .line 289
    const/16 v24, 0x0

    .line 290
    .line 291
    const/16 v26, 0x0

    .line 292
    .line 293
    move-object/from16 v27, v2

    .line 294
    .line 295
    invoke-static/range {v18 .. v29}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 296
    .line 297
    .line 298
    sget-object v1, Lrh1;->a:Lrh1;

    .line 299
    .line 300
    invoke-static {v1, v4}, Lte;->O(Luh1;F)Luh1;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-static {v2, v4}, Lrp0;->O(Lpx;Luh1;)V

    .line 305
    .line 306
    .line 307
    const/16 v23, 0x7

    .line 308
    .line 309
    const/16 v19, 0x0

    .line 310
    .line 311
    const/16 v20, 0x0

    .line 312
    .line 313
    const/16 v21, 0x0

    .line 314
    .line 315
    const/high16 v22, 0x41000000    # 8.0f

    .line 316
    .line 317
    move-object/from16 v18, v1

    .line 318
    .line 319
    invoke-static/range {v18 .. v23}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 320
    .line 321
    .line 322
    move-result-object v19

    .line 323
    move/from16 v4, v22

    .line 324
    .line 325
    const v5, 0x790b01ca

    .line 326
    .line 327
    .line 328
    invoke-static {v5, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v18

    .line 332
    sget-object v5, Lur1;->a:Ltu2;

    .line 333
    .line 334
    invoke-virtual {v2, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    check-cast v8, Llp1;

    .line 339
    .line 340
    iget-wide v8, v8, Llp1;->f:J

    .line 341
    .line 342
    invoke-static/range {v16 .. v16}, Lrg3;->D(I)J

    .line 343
    .line 344
    .line 345
    move-result-wide v23

    .line 346
    invoke-static {v12}, Lrg3;->D(I)J

    .line 347
    .line 348
    .line 349
    move-result-wide v29

    .line 350
    sget-object v36, Lim0;->k:Lim0;

    .line 351
    .line 352
    new-instance v20, Lm13;

    .line 353
    .line 354
    const/16 v32, 0x0

    .line 355
    .line 356
    const v33, 0xfdfff8

    .line 357
    .line 358
    .line 359
    const-wide/16 v26, 0x0

    .line 360
    .line 361
    const/16 v28, 0x0

    .line 362
    .line 363
    const/16 v31, 0x0

    .line 364
    .line 365
    move-wide/from16 v21, v8

    .line 366
    .line 367
    move-object/from16 v25, v36

    .line 368
    .line 369
    invoke-direct/range {v20 .. v33}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 370
    .line 371
    .line 372
    const/16 v26, 0x30

    .line 373
    .line 374
    const/16 v27, 0x3f8

    .line 375
    .line 376
    const/16 v21, 0x0

    .line 377
    .line 378
    const/16 v22, 0x0

    .line 379
    .line 380
    const/16 v23, 0x0

    .line 381
    .line 382
    const/16 v24, 0x0

    .line 383
    .line 384
    move-object/from16 v25, v2

    .line 385
    .line 386
    invoke-static/range {v18 .. v27}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 387
    .line 388
    .line 389
    invoke-interface {v15}, Lgu2;->getValue()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    move-object/from16 v18, v8

    .line 394
    .line 395
    check-cast v18, Ljava/lang/String;

    .line 396
    .line 397
    invoke-virtual {v2, v15}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v8

    .line 401
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    if-nez v8, :cond_a

    .line 406
    .line 407
    if-ne v9, v7, :cond_b

    .line 408
    .line 409
    :cond_a
    new-instance v9, Lpr;

    .line 410
    .line 411
    const/16 v7, 0xb

    .line 412
    .line 413
    invoke-direct {v9, v15, v7}, Lpr;-><init>(Lxk1;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    :cond_b
    move-object/from16 v19, v9

    .line 420
    .line 421
    check-cast v19, Lin0;

    .line 422
    .line 423
    const v7, 0x790b01c8

    .line 424
    .line 425
    .line 426
    invoke-static {v7, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v21

    .line 430
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v7

    .line 434
    check-cast v7, Ljava/lang/Boolean;

    .line 435
    .line 436
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    xor-int/lit8 v27, v7, 0x1

    .line 441
    .line 442
    new-instance v7, Lm51;

    .line 443
    .line 444
    const/4 v8, 0x3

    .line 445
    const/16 v9, 0x7b

    .line 446
    .line 447
    invoke-direct {v7, v8, v9}, Lm51;-><init>(II)V

    .line 448
    .line 449
    .line 450
    const/16 v34, 0x180

    .line 451
    .line 452
    const/16 v35, 0x2df4

    .line 453
    .line 454
    const/16 v20, 0x0

    .line 455
    .line 456
    const/16 v22, 0x0

    .line 457
    .line 458
    const/16 v23, 0x0

    .line 459
    .line 460
    const/16 v24, 0x0

    .line 461
    .line 462
    const/16 v25, 0x0

    .line 463
    .line 464
    const/16 v26, 0x0

    .line 465
    .line 466
    const/16 v28, 0x0

    .line 467
    .line 468
    const/16 v29, 0x0

    .line 469
    .line 470
    const/16 v31, 0x0

    .line 471
    .line 472
    const/16 v33, 0x0

    .line 473
    .line 474
    move-object/from16 v32, v2

    .line 475
    .line 476
    move-object/from16 v30, v7

    .line 477
    .line 478
    invoke-static/range {v18 .. v35}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 479
    .line 480
    .line 481
    const/16 v22, 0x0

    .line 482
    .line 483
    const/16 v23, 0xd

    .line 484
    .line 485
    const/16 v19, 0x0

    .line 486
    .line 487
    const/16 v21, 0x0

    .line 488
    .line 489
    move-object/from16 v18, v1

    .line 490
    .line 491
    move/from16 v20, v4

    .line 492
    .line 493
    invoke-static/range {v18 .. v23}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 494
    .line 495
    .line 496
    move-result-object v19

    .line 497
    const v7, 0x790b01c5

    .line 498
    .line 499
    .line 500
    invoke-static {v7, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v18

    .line 504
    new-instance v20, Lm13;

    .line 505
    .line 506
    invoke-virtual {v2, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v7

    .line 510
    check-cast v7, Llp1;

    .line 511
    .line 512
    iget-wide v7, v7, Llp1;->f:J

    .line 513
    .line 514
    invoke-static {v6}, Lrg3;->D(I)J

    .line 515
    .line 516
    .line 517
    move-result-wide v23

    .line 518
    invoke-static/range {v17 .. v17}, Lrg3;->D(I)J

    .line 519
    .line 520
    .line 521
    move-result-wide v29

    .line 522
    const/16 v32, 0x0

    .line 523
    .line 524
    const v33, 0xfdfffc

    .line 525
    .line 526
    .line 527
    const/16 v25, 0x0

    .line 528
    .line 529
    const-wide/16 v26, 0x0

    .line 530
    .line 531
    move-wide/from16 v21, v7

    .line 532
    .line 533
    invoke-direct/range {v20 .. v33}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 534
    .line 535
    .line 536
    const/16 v26, 0x30

    .line 537
    .line 538
    const/16 v27, 0x3f8

    .line 539
    .line 540
    const/16 v21, 0x0

    .line 541
    .line 542
    const/16 v22, 0x0

    .line 543
    .line 544
    const/16 v23, 0x0

    .line 545
    .line 546
    const/16 v24, 0x0

    .line 547
    .line 548
    move-object/from16 v25, v2

    .line 549
    .line 550
    invoke-static/range {v18 .. v27}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 551
    .line 552
    .line 553
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    check-cast v0, Ljava/lang/Boolean;

    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    if-nez v0, :cond_c

    .line 564
    .line 565
    invoke-interface {v15}, Lgu2;->getValue()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, Ljava/lang/String;

    .line 570
    .line 571
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 572
    .line 573
    .line 574
    move-result v0

    .line 575
    if-nez v0, :cond_c

    .line 576
    .line 577
    if-nez v3, :cond_c

    .line 578
    .line 579
    const v0, 0x1ed69cf1

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2, v0}, Lgo0;->W(I)V

    .line 583
    .line 584
    .line 585
    const/16 v22, 0x0

    .line 586
    .line 587
    const/16 v23, 0xd

    .line 588
    .line 589
    const/16 v19, 0x0

    .line 590
    .line 591
    const/16 v21, 0x0

    .line 592
    .line 593
    move-object/from16 v18, v1

    .line 594
    .line 595
    move/from16 v20, v4

    .line 596
    .line 597
    invoke-static/range {v18 .. v23}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 598
    .line 599
    .line 600
    move-result-object v19

    .line 601
    const v0, 0x790b01c9

    .line 602
    .line 603
    .line 604
    invoke-static {v0, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v18

    .line 608
    invoke-virtual {v2, v5}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    check-cast v0, Llp1;

    .line 613
    .line 614
    iget-wide v0, v0, Llp1;->g:J

    .line 615
    .line 616
    invoke-static {v6}, Lrg3;->D(I)J

    .line 617
    .line 618
    .line 619
    move-result-wide v34

    .line 620
    invoke-static/range {v17 .. v17}, Lrg3;->D(I)J

    .line 621
    .line 622
    .line 623
    move-result-wide v40

    .line 624
    new-instance v31, Lm13;

    .line 625
    .line 626
    const/16 v43, 0x0

    .line 627
    .line 628
    const v44, 0xfdfff8

    .line 629
    .line 630
    .line 631
    const-wide/16 v37, 0x0

    .line 632
    .line 633
    const/16 v39, 0x0

    .line 634
    .line 635
    const/16 v42, 0x0

    .line 636
    .line 637
    move-wide/from16 v32, v0

    .line 638
    .line 639
    invoke-direct/range {v31 .. v44}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 640
    .line 641
    .line 642
    const/16 v26, 0x30

    .line 643
    .line 644
    const/16 v27, 0x3f8

    .line 645
    .line 646
    const/16 v21, 0x0

    .line 647
    .line 648
    const/16 v22, 0x0

    .line 649
    .line 650
    const/16 v23, 0x0

    .line 651
    .line 652
    const/16 v24, 0x0

    .line 653
    .line 654
    move-object/from16 v25, v2

    .line 655
    .line 656
    move-object/from16 v20, v31

    .line 657
    .line 658
    invoke-static/range {v18 .. v27}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v11}, Lgo0;->p(Z)V

    .line 662
    .line 663
    .line 664
    goto :goto_5

    .line 665
    :cond_c
    const v0, 0x1edc923d

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2, v0}, Lgo0;->W(I)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2, v11}, Lgo0;->p(Z)V

    .line 672
    .line 673
    .line 674
    goto :goto_5

    .line 675
    :cond_d
    invoke-virtual {v2}, Lgo0;->R()V

    .line 676
    .line 677
    .line 678
    :goto_5
    return-object v13

    .line 679
    :pswitch_1
    move-object v4, v3

    .line 680
    check-cast v4, Lxm0;

    .line 681
    .line 682
    check-cast v0, Lxt0;

    .line 683
    .line 684
    move-object/from16 v17, v15

    .line 685
    .line 686
    check-cast v17, Lxm0;

    .line 687
    .line 688
    move-object/from16 v1, p1

    .line 689
    .line 690
    check-cast v1, Lpb2;

    .line 691
    .line 692
    move-object/from16 v2, p2

    .line 693
    .line 694
    check-cast v2, Lpx;

    .line 695
    .line 696
    move-object/from16 v3, p3

    .line 697
    .line 698
    check-cast v3, Ljava/lang/Integer;

    .line 699
    .line 700
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    and-int/lit8 v6, v3, 0x6

    .line 708
    .line 709
    if-nez v6, :cond_f

    .line 710
    .line 711
    move-object v6, v2

    .line 712
    check-cast v6, Lgo0;

    .line 713
    .line 714
    invoke-virtual {v6, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v6

    .line 718
    if-eqz v6, :cond_e

    .line 719
    .line 720
    move v8, v9

    .line 721
    goto :goto_6

    .line 722
    :cond_e
    const/4 v8, 0x2

    .line 723
    :goto_6
    or-int/2addr v3, v8

    .line 724
    :cond_f
    and-int/lit8 v6, v3, 0x13

    .line 725
    .line 726
    if-eq v6, v12, :cond_10

    .line 727
    .line 728
    move v6, v14

    .line 729
    goto :goto_7

    .line 730
    :cond_10
    move v6, v11

    .line 731
    :goto_7
    and-int/2addr v3, v14

    .line 732
    move-object v8, v2

    .line 733
    check-cast v8, Lgo0;

    .line 734
    .line 735
    invoke-virtual {v8, v3, v6}, Lgo0;->O(IZ)Z

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eqz v2, :cond_12

    .line 740
    .line 741
    invoke-static {v5, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 746
    .line 747
    .line 748
    move-result-object v5

    .line 749
    const/4 v9, 0x0

    .line 750
    const/16 v10, 0x38

    .line 751
    .line 752
    const/4 v6, 0x0

    .line 753
    const/4 v7, 0x0

    .line 754
    invoke-static/range {v3 .. v10}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 755
    .line 756
    .line 757
    const v2, 0x790b0132

    .line 758
    .line 759
    .line 760
    invoke-static {v2, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v16

    .line 764
    iget-object v0, v0, Lxt0;->d:Lzt0;

    .line 765
    .line 766
    sget-object v2, Lzt0;->j:Lzt0;

    .line 767
    .line 768
    if-ne v0, v2, :cond_11

    .line 769
    .line 770
    move/from16 v19, v14

    .line 771
    .line 772
    goto :goto_8

    .line 773
    :cond_11
    move/from16 v19, v11

    .line 774
    .line 775
    :goto_8
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 776
    .line 777
    .line 778
    move-result-object v18

    .line 779
    const/16 v22, 0x0

    .line 780
    .line 781
    const/16 v23, 0x30

    .line 782
    .line 783
    const/16 v20, 0x0

    .line 784
    .line 785
    move-object/from16 v21, v8

    .line 786
    .line 787
    invoke-static/range {v16 .. v23}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 788
    .line 789
    .line 790
    goto :goto_9

    .line 791
    :cond_12
    invoke-virtual {v8}, Lgo0;->R()V

    .line 792
    .line 793
    .line 794
    :goto_9
    return-object v13

    .line 795
    :pswitch_2
    check-cast v3, Ljava/lang/String;

    .line 796
    .line 797
    check-cast v0, Lin0;

    .line 798
    .line 799
    check-cast v15, Ljava/lang/String;

    .line 800
    .line 801
    move-object/from16 v1, p1

    .line 802
    .line 803
    check-cast v1, Lo71;

    .line 804
    .line 805
    move-object/from16 v2, p2

    .line 806
    .line 807
    check-cast v2, Lpx;

    .line 808
    .line 809
    move-object/from16 v4, p3

    .line 810
    .line 811
    check-cast v4, Ljava/lang/Integer;

    .line 812
    .line 813
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    and-int/lit8 v1, v4, 0x11

    .line 821
    .line 822
    if-eq v1, v10, :cond_13

    .line 823
    .line 824
    move v1, v14

    .line 825
    goto :goto_a

    .line 826
    :cond_13
    move v1, v11

    .line 827
    :goto_a
    and-int/2addr v4, v14

    .line 828
    check-cast v2, Lgo0;

    .line 829
    .line 830
    invoke-virtual {v2, v4, v1}, Lgo0;->O(IZ)Z

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    if-eqz v1, :cond_14

    .line 835
    .line 836
    invoke-static {v15}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 837
    .line 838
    .line 839
    move-result v1

    .line 840
    invoke-static {v3, v0, v1, v2, v11}, Lci0;->i(Ljava/lang/String;Lin0;ZLpx;I)V

    .line 841
    .line 842
    .line 843
    goto :goto_b

    .line 844
    :cond_14
    invoke-virtual {v2}, Lgo0;->R()V

    .line 845
    .line 846
    .line 847
    :goto_b
    return-object v13

    .line 848
    :pswitch_3
    check-cast v0, Lxk1;

    .line 849
    .line 850
    check-cast v3, Ljava/lang/String;

    .line 851
    .line 852
    check-cast v15, Lju;

    .line 853
    .line 854
    move-object/from16 v1, p1

    .line 855
    .line 856
    check-cast v1, Lo71;

    .line 857
    .line 858
    move-object/from16 v2, p2

    .line 859
    .line 860
    check-cast v2, Lpx;

    .line 861
    .line 862
    move-object/from16 v4, p3

    .line 863
    .line 864
    check-cast v4, Ljava/lang/Integer;

    .line 865
    .line 866
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 867
    .line 868
    .line 869
    move-result v4

    .line 870
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    and-int/lit8 v1, v4, 0x11

    .line 874
    .line 875
    if-eq v1, v10, :cond_15

    .line 876
    .line 877
    move v11, v14

    .line 878
    :cond_15
    and-int/lit8 v1, v4, 0x1

    .line 879
    .line 880
    move-object v7, v2

    .line 881
    check-cast v7, Lgo0;

    .line 882
    .line 883
    invoke-virtual {v7, v1, v11}, Lgo0;->O(IZ)Z

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    if-eqz v1, :cond_16

    .line 888
    .line 889
    const v1, 0x790b0151

    .line 890
    .line 891
    .line 892
    invoke-static {v1, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v5

    .line 896
    new-instance v1, Ltt0;

    .line 897
    .line 898
    invoke-direct {v1, v0, v3, v15}, Ltt0;-><init>(Lxk1;Ljava/lang/String;Lju;)V

    .line 899
    .line 900
    .line 901
    const v0, 0x3a2f163e

    .line 902
    .line 903
    .line 904
    invoke-static {v0, v1, v7}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 905
    .line 906
    .line 907
    move-result-object v6

    .line 908
    const/16 v8, 0x180

    .line 909
    .line 910
    const/4 v9, 0x1

    .line 911
    const/4 v4, 0x0

    .line 912
    invoke-static/range {v4 .. v9}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 913
    .line 914
    .line 915
    goto :goto_c

    .line 916
    :cond_16
    invoke-virtual {v7}, Lgo0;->R()V

    .line 917
    .line 918
    .line 919
    :goto_c
    return-object v13

    .line 920
    :pswitch_4
    check-cast v3, Ljava/lang/String;

    .line 921
    .line 922
    check-cast v0, Lkw;

    .line 923
    .line 924
    move-object v1, v15

    .line 925
    check-cast v1, Lnn0;

    .line 926
    .line 927
    move-object/from16 v4, p1

    .line 928
    .line 929
    check-cast v4, Lhm;

    .line 930
    .line 931
    move-object/from16 v5, p2

    .line 932
    .line 933
    check-cast v5, Lpx;

    .line 934
    .line 935
    move-object/from16 v6, p3

    .line 936
    .line 937
    check-cast v6, Ljava/lang/Integer;

    .line 938
    .line 939
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 940
    .line 941
    .line 942
    move-result v6

    .line 943
    const/4 v7, 0x6

    .line 944
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 945
    .line 946
    .line 947
    move-result-object v7

    .line 948
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    and-int/lit8 v4, v6, 0x11

    .line 952
    .line 953
    if-eq v4, v10, :cond_17

    .line 954
    .line 955
    move v4, v14

    .line 956
    goto :goto_d

    .line 957
    :cond_17
    move v4, v11

    .line 958
    :goto_d
    and-int/2addr v6, v14

    .line 959
    check-cast v5, Lgo0;

    .line 960
    .line 961
    invoke-virtual {v5, v6, v4}, Lgo0;->O(IZ)Z

    .line 962
    .line 963
    .line 964
    move-result v4

    .line 965
    if-eqz v4, :cond_1c

    .line 966
    .line 967
    sget-object v4, Ltp0;->c:Lvf;

    .line 968
    .line 969
    sget-object v6, Lsn;->u:Lpk;

    .line 970
    .line 971
    invoke-static {v4, v6, v5, v11}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 972
    .line 973
    .line 974
    move-result-object v4

    .line 975
    iget-wide v9, v5, Lgo0;->T:J

    .line 976
    .line 977
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 978
    .line 979
    .line 980
    move-result v6

    .line 981
    invoke-virtual {v5}, Lgo0;->l()Lyy1;

    .line 982
    .line 983
    .line 984
    move-result-object v9

    .line 985
    invoke-static {v5, v2}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 986
    .line 987
    .line 988
    move-result-object v10

    .line 989
    sget-object v15, Lhx;->c:Lgx;

    .line 990
    .line 991
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    sget-object v15, Lgx;->b:Ljy;

    .line 995
    .line 996
    invoke-virtual {v5}, Lgo0;->Z()V

    .line 997
    .line 998
    .line 999
    move/from16 v18, v12

    .line 1000
    .line 1001
    iget-boolean v12, v5, Lgo0;->S:Z

    .line 1002
    .line 1003
    if-eqz v12, :cond_18

    .line 1004
    .line 1005
    invoke-virtual {v5, v15}, Lgo0;->k(Lxm0;)V

    .line 1006
    .line 1007
    .line 1008
    goto :goto_e

    .line 1009
    :cond_18
    invoke-virtual {v5}, Lgo0;->i0()V

    .line 1010
    .line 1011
    .line 1012
    :goto_e
    sget-object v12, Lgx;->e:Llc;

    .line 1013
    .line 1014
    invoke-static {v5, v12, v4}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1015
    .line 1016
    .line 1017
    sget-object v4, Lgx;->d:Llc;

    .line 1018
    .line 1019
    invoke-static {v5, v4, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v6

    .line 1026
    sget-object v9, Lgx;->f:Llc;

    .line 1027
    .line 1028
    invoke-static {v5, v9, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    sget-object v6, Lgx;->g:Lv6;

    .line 1032
    .line 1033
    invoke-static {v5, v6}, Lyf3;->b(Lpx;Lin0;)V

    .line 1034
    .line 1035
    .line 1036
    sget-object v14, Lgx;->c:Llc;

    .line 1037
    .line 1038
    invoke-static {v5, v14, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1039
    .line 1040
    .line 1041
    const/high16 v10, 0x41400000    # 12.0f

    .line 1042
    .line 1043
    if-eqz v3, :cond_19

    .line 1044
    .line 1045
    const v8, -0x79fad1f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v5, v8}, Lgo0;->W(I)V

    .line 1049
    .line 1050
    .line 1051
    new-instance v16, Lbu0;

    .line 1052
    .line 1053
    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    .line 1054
    .line 1055
    .line 1056
    sget-object v8, Lur1;->a:Ltu2;

    .line 1057
    .line 1058
    invoke-virtual {v5, v8}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v8

    .line 1062
    check-cast v8, Llp1;

    .line 1063
    .line 1064
    move-object/from16 p1, v12

    .line 1065
    .line 1066
    iget-wide v11, v8, Llp1;->e:J

    .line 1067
    .line 1068
    invoke-static/range {v18 .. v18}, Lrg3;->D(I)J

    .line 1069
    .line 1070
    .line 1071
    move-result-wide v30

    .line 1072
    const/16 v8, 0x18

    .line 1073
    .line 1074
    invoke-static {v8}, Lrg3;->D(I)J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v36

    .line 1078
    sget-object v32, Lim0;->m:Lim0;

    .line 1079
    .line 1080
    new-instance v17, Lm13;

    .line 1081
    .line 1082
    const/16 v39, 0x0

    .line 1083
    .line 1084
    const v40, 0xfd7ff8

    .line 1085
    .line 1086
    .line 1087
    const-wide/16 v33, 0x0

    .line 1088
    .line 1089
    const/16 v35, 0x3

    .line 1090
    .line 1091
    const/16 v38, 0x0

    .line 1092
    .line 1093
    move-wide/from16 v28, v11

    .line 1094
    .line 1095
    move-object/from16 v27, v17

    .line 1096
    .line 1097
    invoke-direct/range {v27 .. v40}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 1098
    .line 1099
    .line 1100
    const/16 v23, 0x0

    .line 1101
    .line 1102
    const/16 v24, 0x3f8

    .line 1103
    .line 1104
    const/16 v18, 0x0

    .line 1105
    .line 1106
    const/16 v19, 0x0

    .line 1107
    .line 1108
    const/16 v20, 0x0

    .line 1109
    .line 1110
    const/16 v21, 0x0

    .line 1111
    .line 1112
    move-object/from16 v22, v15

    .line 1113
    .line 1114
    move-object v15, v3

    .line 1115
    move-object/from16 v3, v22

    .line 1116
    .line 1117
    move-object/from16 v22, v5

    .line 1118
    .line 1119
    invoke-static/range {v15 .. v24}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 1120
    .line 1121
    .line 1122
    invoke-static {v2, v10}, Lte;->O(Luh1;F)Luh1;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v8

    .line 1126
    invoke-static {v5, v8}, Lrp0;->O(Lpx;Luh1;)V

    .line 1127
    .line 1128
    .line 1129
    const/4 v8, 0x0

    .line 1130
    invoke-virtual {v5, v8}, Lgo0;->p(Z)V

    .line 1131
    .line 1132
    .line 1133
    goto :goto_f

    .line 1134
    :cond_19
    move v8, v11

    .line 1135
    move-object/from16 p1, v12

    .line 1136
    .line 1137
    move-object v3, v15

    .line 1138
    const v11, -0x797af3e

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v5, v11}, Lgo0;->W(I)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v5, v8}, Lgo0;->p(Z)V

    .line 1145
    .line 1146
    .line 1147
    :goto_f
    sget-object v8, Lbv;->a:Lbv;

    .line 1148
    .line 1149
    invoke-virtual {v0, v8, v5, v7}, Lkw;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    if-eqz v1, :cond_1b

    .line 1153
    .line 1154
    const v0, -0x796a479

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v5, v0}, Lgo0;->W(I)V

    .line 1158
    .line 1159
    .line 1160
    const/high16 v0, 0x41c00000    # 24.0f

    .line 1161
    .line 1162
    invoke-static {v2, v0}, Lte;->O(Luh1;F)Luh1;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    invoke-static {v5, v0}, Lrp0;->O(Lpx;Luh1;)V

    .line 1167
    .line 1168
    .line 1169
    sget-object v0, Lte;->e:Lyi0;

    .line 1170
    .line 1171
    new-instance v2, Lxf;

    .line 1172
    .line 1173
    new-instance v8, Ls;

    .line 1174
    .line 1175
    const/4 v11, 0x2

    .line 1176
    invoke-direct {v8, v11}, Ls;-><init>(I)V

    .line 1177
    .line 1178
    .line 1179
    invoke-direct {v2, v10, v8}, Lxf;-><init>(FLs;)V

    .line 1180
    .line 1181
    .line 1182
    sget-object v8, Lsn;->t:Lqk;

    .line 1183
    .line 1184
    const/16 v10, 0x36

    .line 1185
    .line 1186
    invoke-static {v2, v8, v5, v10}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    iget-wide v10, v5, Lgo0;->T:J

    .line 1191
    .line 1192
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 1193
    .line 1194
    .line 1195
    move-result v8

    .line 1196
    invoke-virtual {v5}, Lgo0;->l()Lyy1;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v10

    .line 1200
    invoke-static {v5, v0}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    invoke-virtual {v5}, Lgo0;->Z()V

    .line 1205
    .line 1206
    .line 1207
    iget-boolean v11, v5, Lgo0;->S:Z

    .line 1208
    .line 1209
    if-eqz v11, :cond_1a

    .line 1210
    .line 1211
    invoke-virtual {v5, v3}, Lgo0;->k(Lxm0;)V

    .line 1212
    .line 1213
    .line 1214
    :goto_10
    move-object/from16 v3, p1

    .line 1215
    .line 1216
    goto :goto_11

    .line 1217
    :cond_1a
    invoke-virtual {v5}, Lgo0;->i0()V

    .line 1218
    .line 1219
    .line 1220
    goto :goto_10

    .line 1221
    :goto_11
    invoke-static {v5, v3, v2}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-static {v5, v4, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    invoke-static {v8, v5, v9, v5, v6}, Lvi0;->q(ILgo0;Llc;Lgo0;Lv6;)V

    .line 1228
    .line 1229
    .line 1230
    invoke-static {v5, v14, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    sget-object v0, Lpb2;->a:Lpb2;

    .line 1234
    .line 1235
    invoke-interface {v1, v0, v5, v7}, Lnn0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    const/4 v0, 0x1

    .line 1239
    invoke-virtual {v5, v0}, Lgo0;->p(Z)V

    .line 1240
    .line 1241
    .line 1242
    const/4 v8, 0x0

    .line 1243
    invoke-virtual {v5, v8}, Lgo0;->p(Z)V

    .line 1244
    .line 1245
    .line 1246
    goto :goto_12

    .line 1247
    :cond_1b
    const/4 v0, 0x1

    .line 1248
    const/4 v8, 0x0

    .line 1249
    const v1, -0x7918dde

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v5, v1}, Lgo0;->W(I)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v5, v8}, Lgo0;->p(Z)V

    .line 1256
    .line 1257
    .line 1258
    :goto_12
    invoke-virtual {v5, v0}, Lgo0;->p(Z)V

    .line 1259
    .line 1260
    .line 1261
    goto :goto_13

    .line 1262
    :cond_1c
    invoke-virtual {v5}, Lgo0;->R()V

    .line 1263
    .line 1264
    .line 1265
    :goto_13
    return-object v13

    .line 1266
    :pswitch_5
    move/from16 v18, v12

    .line 1267
    .line 1268
    check-cast v3, Ljava/lang/String;

    .line 1269
    .line 1270
    check-cast v0, Lxk1;

    .line 1271
    .line 1272
    check-cast v15, Lxk1;

    .line 1273
    .line 1274
    move-object/from16 v1, p1

    .line 1275
    .line 1276
    check-cast v1, Lbv;

    .line 1277
    .line 1278
    move-object/from16 v5, p2

    .line 1279
    .line 1280
    check-cast v5, Lpx;

    .line 1281
    .line 1282
    move-object/from16 v8, p3

    .line 1283
    .line 1284
    check-cast v8, Ljava/lang/Integer;

    .line 1285
    .line 1286
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1287
    .line 1288
    .line 1289
    move-result v8

    .line 1290
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1291
    .line 1292
    .line 1293
    and-int/lit8 v1, v8, 0x11

    .line 1294
    .line 1295
    if-eq v1, v10, :cond_1d

    .line 1296
    .line 1297
    const/4 v1, 0x1

    .line 1298
    :goto_14
    const/16 v25, 0x1

    .line 1299
    .line 1300
    goto :goto_15

    .line 1301
    :cond_1d
    const/4 v1, 0x0

    .line 1302
    goto :goto_14

    .line 1303
    :goto_15
    and-int/lit8 v8, v8, 0x1

    .line 1304
    .line 1305
    check-cast v5, Lgo0;

    .line 1306
    .line 1307
    invoke-virtual {v5, v8, v1}, Lgo0;->O(IZ)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v1

    .line 1311
    if-eqz v1, :cond_23

    .line 1312
    .line 1313
    const v1, 0x790b00d6

    .line 1314
    .line 1315
    .line 1316
    invoke-static {v1, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v26

    .line 1320
    new-instance v28, Lm13;

    .line 1321
    .line 1322
    sget-object v1, Lur1;->a:Ltu2;

    .line 1323
    .line 1324
    invoke-virtual {v5, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v8

    .line 1328
    check-cast v8, Llp1;

    .line 1329
    .line 1330
    iget-wide v10, v8, Llp1;->f:J

    .line 1331
    .line 1332
    invoke-static {v6}, Lrg3;->D(I)J

    .line 1333
    .line 1334
    .line 1335
    move-result-wide v30

    .line 1336
    invoke-static/range {v17 .. v17}, Lrg3;->D(I)J

    .line 1337
    .line 1338
    .line 1339
    move-result-wide v36

    .line 1340
    const/16 v39, 0x0

    .line 1341
    .line 1342
    const v40, 0xfdfffc

    .line 1343
    .line 1344
    .line 1345
    const/16 v32, 0x0

    .line 1346
    .line 1347
    const-wide/16 v33, 0x0

    .line 1348
    .line 1349
    const/16 v35, 0x0

    .line 1350
    .line 1351
    const/16 v38, 0x0

    .line 1352
    .line 1353
    move-object/from16 v27, v28

    .line 1354
    .line 1355
    move-wide/from16 v28, v10

    .line 1356
    .line 1357
    invoke-direct/range {v27 .. v40}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 1358
    .line 1359
    .line 1360
    move-object/from16 v28, v27

    .line 1361
    .line 1362
    const/16 v34, 0x0

    .line 1363
    .line 1364
    const/16 v35, 0x3fa

    .line 1365
    .line 1366
    const/16 v27, 0x0

    .line 1367
    .line 1368
    const/16 v29, 0x0

    .line 1369
    .line 1370
    const/16 v30, 0x0

    .line 1371
    .line 1372
    const/16 v31, 0x0

    .line 1373
    .line 1374
    const/16 v32, 0x0

    .line 1375
    .line 1376
    move-object/from16 v33, v5

    .line 1377
    .line 1378
    invoke-static/range {v26 .. v35}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 1379
    .line 1380
    .line 1381
    const v6, 0x790b00a3

    .line 1382
    .line 1383
    .line 1384
    invoke-static {v2, v4, v5, v6, v5}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v26

    .line 1388
    const v4, 0x790b00a4

    .line 1389
    .line 1390
    .line 1391
    invoke-static {v4, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v29

    .line 1395
    invoke-virtual {v5, v3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1396
    .line 1397
    .line 1398
    move-result v4

    .line 1399
    invoke-virtual {v5}, Lgo0;->L()Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v6

    .line 1403
    if-nez v4, :cond_1e

    .line 1404
    .line 1405
    if-ne v6, v7, :cond_1f

    .line 1406
    .line 1407
    :cond_1e
    new-instance v6, Lr1;

    .line 1408
    .line 1409
    const/16 v4, 0xa

    .line 1410
    .line 1411
    invoke-direct {v6, v4, v3, v15}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v5, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1415
    .line 1416
    .line 1417
    :cond_1f
    move-object/from16 v27, v6

    .line 1418
    .line 1419
    check-cast v27, Lxm0;

    .line 1420
    .line 1421
    const/16 v36, 0x0

    .line 1422
    .line 1423
    const/16 v37, 0x1f4

    .line 1424
    .line 1425
    const/16 v28, 0x0

    .line 1426
    .line 1427
    const/16 v30, 0x0

    .line 1428
    .line 1429
    const/16 v31, 0x0

    .line 1430
    .line 1431
    const/16 v32, 0x0

    .line 1432
    .line 1433
    const/16 v33, 0x0

    .line 1434
    .line 1435
    const/16 v34, 0x0

    .line 1436
    .line 1437
    move-object/from16 v35, v5

    .line 1438
    .line 1439
    invoke-static/range {v26 .. v37}, Lqp0;->h(Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Lmn0;Ljava/lang/String;Lju;ZLin0;Lpx;II)V

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual {v5, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v3

    .line 1446
    check-cast v3, Llp1;

    .line 1447
    .line 1448
    iget-wide v3, v3, Llp1;->d:J

    .line 1449
    .line 1450
    const/16 v31, 0x30

    .line 1451
    .line 1452
    const/16 v32, 0x1

    .line 1453
    .line 1454
    const/16 v26, 0x0

    .line 1455
    .line 1456
    const/high16 v27, 0x3f000000    # 0.5f

    .line 1457
    .line 1458
    move-wide/from16 v28, v3

    .line 1459
    .line 1460
    move-object/from16 v30, v5

    .line 1461
    .line 1462
    invoke-static/range {v26 .. v32}, Lop0;->a(Luh1;FJLpx;II)V

    .line 1463
    .line 1464
    .line 1465
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    check-cast v3, Ljava/util/List;

    .line 1470
    .line 1471
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1472
    .line 1473
    .line 1474
    move-result v3

    .line 1475
    if-eqz v3, :cond_20

    .line 1476
    .line 1477
    const v0, -0x3d2848cf

    .line 1478
    .line 1479
    .line 1480
    invoke-virtual {v5, v0}, Lgo0;->W(I)V

    .line 1481
    .line 1482
    .line 1483
    const/high16 v0, 0x41600000    # 14.0f

    .line 1484
    .line 1485
    const/high16 v3, 0x41e00000    # 28.0f

    .line 1486
    .line 1487
    invoke-static {v2, v0, v3}, Lfg1;->D(Luh1;FF)Luh1;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v27

    .line 1491
    const v0, 0x790b00c6

    .line 1492
    .line 1493
    .line 1494
    invoke-static {v0, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v26

    .line 1498
    new-instance v28, Lm13;

    .line 1499
    .line 1500
    invoke-virtual {v5, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    check-cast v0, Llp1;

    .line 1505
    .line 1506
    iget-wide v0, v0, Llp1;->f:J

    .line 1507
    .line 1508
    invoke-static/range {v16 .. v16}, Lrg3;->D(I)J

    .line 1509
    .line 1510
    .line 1511
    move-result-wide v31

    .line 1512
    invoke-static/range {v18 .. v18}, Lrg3;->D(I)J

    .line 1513
    .line 1514
    .line 1515
    move-result-wide v37

    .line 1516
    const/16 v40, 0x0

    .line 1517
    .line 1518
    const v41, 0xfdfffc

    .line 1519
    .line 1520
    .line 1521
    const/16 v33, 0x0

    .line 1522
    .line 1523
    const-wide/16 v34, 0x0

    .line 1524
    .line 1525
    const/16 v36, 0x0

    .line 1526
    .line 1527
    const/16 v39, 0x0

    .line 1528
    .line 1529
    move-wide/from16 v29, v0

    .line 1530
    .line 1531
    invoke-direct/range {v28 .. v41}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 1532
    .line 1533
    .line 1534
    const/16 v34, 0x30

    .line 1535
    .line 1536
    const/16 v35, 0x3f8

    .line 1537
    .line 1538
    const/16 v29, 0x0

    .line 1539
    .line 1540
    const/16 v30, 0x0

    .line 1541
    .line 1542
    const/16 v31, 0x0

    .line 1543
    .line 1544
    const/16 v32, 0x0

    .line 1545
    .line 1546
    move-object/from16 v33, v5

    .line 1547
    .line 1548
    invoke-static/range {v26 .. v35}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 1549
    .line 1550
    .line 1551
    const/4 v8, 0x0

    .line 1552
    invoke-virtual {v5, v8}, Lgo0;->p(Z)V

    .line 1553
    .line 1554
    .line 1555
    goto :goto_16

    .line 1556
    :cond_20
    const v1, -0x3d21e687

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v5, v1}, Lgo0;->W(I)V

    .line 1560
    .line 1561
    .line 1562
    sget-object v1, Lte;->e:Lyi0;

    .line 1563
    .line 1564
    const/high16 v2, 0x43c30000    # 390.0f

    .line 1565
    .line 1566
    const/4 v3, 0x0

    .line 1567
    const/4 v4, 0x1

    .line 1568
    invoke-static {v1, v3, v2, v4}, Lte;->P(Luh1;FFI)Luh1;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v35

    .line 1572
    invoke-virtual {v5, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1573
    .line 1574
    .line 1575
    move-result v1

    .line 1576
    invoke-virtual {v5}, Lgo0;->L()Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v2

    .line 1580
    if-nez v1, :cond_21

    .line 1581
    .line 1582
    if-ne v2, v7, :cond_22

    .line 1583
    .line 1584
    :cond_21
    new-instance v2, Li0;

    .line 1585
    .line 1586
    invoke-direct {v2, v0, v15, v9}, Li0;-><init>(Lxk1;Lxk1;I)V

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v5, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1590
    .line 1591
    .line 1592
    :cond_22
    move-object/from16 v33, v2

    .line 1593
    .line 1594
    check-cast v33, Lin0;

    .line 1595
    .line 1596
    const/16 v26, 0x6

    .line 1597
    .line 1598
    const/16 v27, 0x1fe

    .line 1599
    .line 1600
    const/16 v28, 0x0

    .line 1601
    .line 1602
    const/16 v29, 0x0

    .line 1603
    .line 1604
    const/16 v30, 0x0

    .line 1605
    .line 1606
    const/16 v32, 0x0

    .line 1607
    .line 1608
    const/16 v34, 0x0

    .line 1609
    .line 1610
    const/16 v36, 0x0

    .line 1611
    .line 1612
    const/16 v37, 0x0

    .line 1613
    .line 1614
    move-object/from16 v31, v5

    .line 1615
    .line 1616
    invoke-static/range {v26 .. v37}, Lrg3;->d(IILs8;Lyf;Lpk;Lpx;Ln50;Lin0;Ld91;Luh1;Ljw1;Z)V

    .line 1617
    .line 1618
    .line 1619
    const/4 v8, 0x0

    .line 1620
    invoke-virtual {v5, v8}, Lgo0;->p(Z)V

    .line 1621
    .line 1622
    .line 1623
    goto :goto_16

    .line 1624
    :cond_23
    invoke-virtual {v5}, Lgo0;->R()V

    .line 1625
    .line 1626
    .line 1627
    :goto_16
    return-object v13

    .line 1628
    nop

    .line 1629
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
