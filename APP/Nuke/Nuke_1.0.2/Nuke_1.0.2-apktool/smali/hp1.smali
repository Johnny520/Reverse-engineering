.class public final synthetic Lhp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:I

.field public final synthetic j:Lin0;


# direct methods
.method public synthetic constructor <init>(ILin0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lhp1;->h:Z

    .line 5
    .line 6
    iput p1, p0, Lhp1;->i:I

    .line 7
    .line 8
    iput-object p2, p0, Lhp1;->j:Lin0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Luh1;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lpx;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v2, Lgo0;

    .line 22
    .line 23
    const v3, 0x2e64a995

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lgo0;->W(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    sget-object v4, Lnx;->a:Leb;

    .line 34
    .line 35
    if-ne v3, v4, :cond_0

    .line 36
    .line 37
    new-instance v3, Lbk1;

    .line 38
    .line 39
    invoke-direct {v3}, Lbk1;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    check-cast v3, Lbk1;

    .line 46
    .line 47
    invoke-static {v3, v2}, Lrg3;->t(Lbk1;Lpx;)Lxk1;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    sget-object v6, Lly;->l:Ltu2;

    .line 52
    .line 53
    invoke-virtual {v2, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    move-object v9, v6

    .line 58
    check-cast v9, Lbs0;

    .line 59
    .line 60
    const v6, 0x27e0b647

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v6}, Lgo0;->W(I)V

    .line 64
    .line 65
    .line 66
    sget-object v6, Lur1;->b:Lmy;

    .line 67
    .line 68
    invoke-virtual {v2, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    const/4 v6, 0x0

    .line 79
    invoke-virtual {v2, v6}, Lgo0;->p(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    const-wide/16 v10, 0x0

    .line 87
    .line 88
    if-ne v7, v4, :cond_1

    .line 89
    .line 90
    new-instance v7, Lh11;

    .line 91
    .line 92
    invoke-direct {v7, v10, v11}, Lh11;-><init>(J)V

    .line 93
    .line 94
    .line 95
    invoke-static {v7}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v2, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    move-object v14, v7

    .line 103
    check-cast v14, Lxk1;

    .line 104
    .line 105
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    if-ne v7, v4, :cond_2

    .line 110
    .line 111
    new-instance v7, Lrs1;

    .line 112
    .line 113
    invoke-direct {v7, v10, v11}, Lrs1;-><init>(J)V

    .line 114
    .line 115
    .line 116
    invoke-static {v7}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {v2, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    move-object v13, v7

    .line 124
    check-cast v13, Lxk1;

    .line 125
    .line 126
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    if-ne v7, v4, :cond_3

    .line 131
    .line 132
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-static {v7}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-virtual {v2, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_3
    check-cast v7, Lxk1;

    .line 142
    .line 143
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    const/4 v11, 0x0

    .line 148
    if-ne v10, v4, :cond_4

    .line 149
    .line 150
    invoke-static {v11}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v2, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_4
    check-cast v10, Lxk1;

    .line 158
    .line 159
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    check-cast v12, Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    invoke-interface {v13}, Lgu2;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v15

    .line 173
    check-cast v15, Lrs1;

    .line 174
    .line 175
    move-object/from16 p2, v7

    .line 176
    .line 177
    iget-wide v6, v15, Lrs1;->a:J

    .line 178
    .line 179
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    check-cast v15, Lh11;

    .line 184
    .line 185
    move/from16 v18, v8

    .line 186
    .line 187
    move-object/from16 p3, v9

    .line 188
    .line 189
    iget-wide v8, v15, Lh11;->a:J

    .line 190
    .line 191
    invoke-virtual {v2, v12}, Lgo0;->g(Z)Z

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    invoke-virtual {v2, v6, v7}, Lgo0;->e(J)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    or-int/2addr v6, v12

    .line 200
    invoke-virtual {v2, v8, v9}, Lgo0;->e(J)Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    or-int/2addr v6, v7

    .line 205
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    const/high16 v8, -0x40800000    # -1.0f

    .line 210
    .line 211
    const/high16 v15, 0x3f800000    # 1.0f

    .line 212
    .line 213
    if-nez v6, :cond_6

    .line 214
    .line 215
    if-ne v7, v4, :cond_5

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_5
    move-object/from16 v17, v13

    .line 219
    .line 220
    const/high16 v19, 0x40000000    # 2.0f

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_6
    :goto_0
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    check-cast v6, Lh11;

    .line 228
    .line 229
    iget-wide v6, v6, Lh11;->a:J

    .line 230
    .line 231
    const/16 v16, 0x20

    .line 232
    .line 233
    shr-long v6, v6, v16

    .line 234
    .line 235
    long-to-int v6, v6

    .line 236
    if-nez v6, :cond_7

    .line 237
    .line 238
    move-object/from16 v17, v13

    .line 239
    .line 240
    const/4 v6, 0x0

    .line 241
    const/high16 v19, 0x40000000    # 2.0f

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_7
    invoke-interface {v13}, Lgu2;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    check-cast v6, Lrs1;

    .line 249
    .line 250
    iget-wide v6, v6, Lrs1;->a:J

    .line 251
    .line 252
    shr-long v6, v6, v16

    .line 253
    .line 254
    long-to-int v6, v6

    .line 255
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    check-cast v7, Lh11;

    .line 264
    .line 265
    move-object/from16 v17, v13

    .line 266
    .line 267
    const/high16 v19, 0x40000000    # 2.0f

    .line 268
    .line 269
    iget-wide v12, v7, Lh11;->a:J

    .line 270
    .line 271
    shr-long v12, v12, v16

    .line 272
    .line 273
    long-to-int v7, v12

    .line 274
    int-to-float v7, v7

    .line 275
    div-float v7, v7, v19

    .line 276
    .line 277
    sub-float/2addr v6, v7

    .line 278
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    check-cast v7, Lh11;

    .line 283
    .line 284
    iget-wide v12, v7, Lh11;->a:J

    .line 285
    .line 286
    shr-long v12, v12, v16

    .line 287
    .line 288
    long-to-int v7, v12

    .line 289
    int-to-float v7, v7

    .line 290
    div-float v7, v7, v19

    .line 291
    .line 292
    div-float/2addr v6, v7

    .line 293
    invoke-static {v6, v8, v15}, Lci0;->C(FFF)F

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    :goto_1
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    invoke-virtual {v2, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :goto_2
    check-cast v7, Ljava/lang/Number;

    .line 305
    .line 306
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    check-cast v7, Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    invoke-interface/range {v17 .. v17}, Lgu2;->getValue()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    check-cast v12, Lrs1;

    .line 325
    .line 326
    iget-wide v12, v12, Lrs1;->a:J

    .line 327
    .line 328
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v16

    .line 332
    move-object/from16 v9, v16

    .line 333
    .line 334
    check-cast v9, Lh11;

    .line 335
    .line 336
    iget-wide v8, v9, Lh11;->a:J

    .line 337
    .line 338
    invoke-virtual {v2, v7}, Lgo0;->g(Z)Z

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    invoke-virtual {v2, v12, v13}, Lgo0;->e(J)Z

    .line 343
    .line 344
    .line 345
    move-result v12

    .line 346
    or-int/2addr v7, v12

    .line 347
    invoke-virtual {v2, v8, v9}, Lgo0;->e(J)Z

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    or-int/2addr v7, v8

    .line 352
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    if-nez v7, :cond_8

    .line 357
    .line 358
    if-ne v8, v4, :cond_a

    .line 359
    .line 360
    :cond_8
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    check-cast v7, Lh11;

    .line 365
    .line 366
    iget-wide v7, v7, Lh11;->a:J

    .line 367
    .line 368
    const-wide v12, 0xffffffffL

    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    and-long/2addr v7, v12

    .line 374
    long-to-int v7, v7

    .line 375
    if-nez v7, :cond_9

    .line 376
    .line 377
    const/4 v7, 0x0

    .line 378
    goto :goto_3

    .line 379
    :cond_9
    invoke-interface/range {v17 .. v17}, Lgu2;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    check-cast v7, Lrs1;

    .line 384
    .line 385
    iget-wide v7, v7, Lrs1;->a:J

    .line 386
    .line 387
    and-long/2addr v7, v12

    .line 388
    long-to-int v7, v7

    .line 389
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    check-cast v8, Lh11;

    .line 398
    .line 399
    iget-wide v8, v8, Lh11;->a:J

    .line 400
    .line 401
    and-long/2addr v8, v12

    .line 402
    long-to-int v8, v8

    .line 403
    int-to-float v8, v8

    .line 404
    div-float v8, v8, v19

    .line 405
    .line 406
    sub-float/2addr v7, v8

    .line 407
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    check-cast v8, Lh11;

    .line 412
    .line 413
    iget-wide v8, v8, Lh11;->a:J

    .line 414
    .line 415
    and-long/2addr v8, v12

    .line 416
    long-to-int v8, v8

    .line 417
    int-to-float v8, v8

    .line 418
    div-float v8, v8, v19

    .line 419
    .line 420
    div-float/2addr v7, v8

    .line 421
    const/high16 v8, -0x40800000    # -1.0f

    .line 422
    .line 423
    invoke-static {v7, v8, v15}, Lci0;->C(FFF)F

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    :goto_3
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    invoke-virtual {v2, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_a
    check-cast v8, Ljava/lang/Number;

    .line 435
    .line 436
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    check-cast v8, Ljava/lang/Boolean;

    .line 445
    .line 446
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 447
    .line 448
    .line 449
    move-result v8

    .line 450
    iget-boolean v9, v0, Lhp1;->h:Z

    .line 451
    .line 452
    if-eqz v8, :cond_b

    .line 453
    .line 454
    if-eqz v9, :cond_b

    .line 455
    .line 456
    move v8, v15

    .line 457
    goto :goto_4

    .line 458
    :cond_b
    const/4 v8, 0x0

    .line 459
    :goto_4
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    check-cast v5, Ljava/lang/Boolean;

    .line 464
    .line 465
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    const/4 v12, 0x4

    .line 470
    if-eqz v5, :cond_c

    .line 471
    .line 472
    const v5, 0x461c4000    # 10000.0f

    .line 473
    .line 474
    .line 475
    invoke-static {v15, v5, v11, v12}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    goto :goto_5

    .line 480
    :cond_c
    const v5, 0x3ecccccd    # 0.4f

    .line 481
    .line 482
    .line 483
    const/high16 v13, 0x42f00000    # 120.0f

    .line 484
    .line 485
    invoke-static {v5, v13, v11, v12}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    :goto_5
    const-string v11, "JellyProgress"

    .line 490
    .line 491
    const/16 v12, 0xc00

    .line 492
    .line 493
    invoke-static {v8, v5, v11, v2, v12}, Luc;->b(FLfj0;Ljava/lang/String;Lpx;I)Lgu2;

    .line 494
    .line 495
    .line 496
    move-result-object v5

    .line 497
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v8

    .line 501
    check-cast v8, Ljava/lang/Number;

    .line 502
    .line 503
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 504
    .line 505
    .line 506
    move-result v8

    .line 507
    const v11, 0x3cf5c28f    # 0.03f

    .line 508
    .line 509
    .line 510
    mul-float/2addr v8, v11

    .line 511
    sub-float v13, v15, v8

    .line 512
    .line 513
    neg-float v7, v7

    .line 514
    const/high16 v8, 0x40c00000    # 6.0f

    .line 515
    .line 516
    mul-float/2addr v7, v8

    .line 517
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    check-cast v11, Ljava/lang/Number;

    .line 522
    .line 523
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 524
    .line 525
    .line 526
    move-result v11

    .line 527
    mul-float/2addr v11, v7

    .line 528
    mul-float/2addr v6, v8

    .line 529
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    check-cast v5, Ljava/lang/Number;

    .line 534
    .line 535
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 536
    .line 537
    .line 538
    move-result v5

    .line 539
    mul-float v15, v5, v6

    .line 540
    .line 541
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    if-ne v5, v4, :cond_d

    .line 546
    .line 547
    new-instance v5, Lpr;

    .line 548
    .line 549
    const/16 v6, 0xf

    .line 550
    .line 551
    invoke-direct {v5, v14, v6}, Lpr;-><init>(Lxk1;I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    :cond_d
    check-cast v5, Lin0;

    .line 558
    .line 559
    invoke-static {v1, v5}, Lgf1;->G(Luh1;Lin0;)Luh1;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    if-ne v5, v4, :cond_e

    .line 568
    .line 569
    new-instance v5, Lpr;

    .line 570
    .line 571
    const/16 v6, 0x10

    .line 572
    .line 573
    invoke-direct {v5, v10, v6}, Lpr;-><init>(Lxk1;I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    :cond_e
    check-cast v5, Lin0;

    .line 580
    .line 581
    invoke-static {v1, v5}, Lt11;->E(Luh1;Lin0;)Luh1;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 586
    .line 587
    .line 588
    move-result-object v5

    .line 589
    invoke-virtual {v2, v9}, Lgo0;->g(Z)Z

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    if-nez v6, :cond_10

    .line 598
    .line 599
    if-ne v7, v4, :cond_f

    .line 600
    .line 601
    goto :goto_6

    .line 602
    :cond_f
    move-object/from16 v8, p2

    .line 603
    .line 604
    move-object/from16 v6, v17

    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_10
    :goto_6
    new-instance v7, Lkp1;

    .line 608
    .line 609
    move-object/from16 v8, p2

    .line 610
    .line 611
    move-object/from16 v6, v17

    .line 612
    .line 613
    invoke-direct {v7, v9, v6, v8}, Lkp1;-><init>(ZLxk1;Lxk1;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :goto_7
    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 620
    .line 621
    invoke-static {v1, v5, v7}, Lvw2;->a(Luh1;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Luh1;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-virtual {v2, v13}, Lgo0;->c(F)Z

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    invoke-virtual {v2, v11}, Lgo0;->c(F)Z

    .line 630
    .line 631
    .line 632
    move-result v7

    .line 633
    or-int/2addr v5, v7

    .line 634
    invoke-virtual {v2, v15}, Lgo0;->c(F)Z

    .line 635
    .line 636
    .line 637
    move-result v7

    .line 638
    or-int/2addr v5, v7

    .line 639
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    if-nez v5, :cond_12

    .line 644
    .line 645
    if-ne v7, v4, :cond_11

    .line 646
    .line 647
    goto :goto_8

    .line 648
    :cond_11
    move-object/from16 v17, v6

    .line 649
    .line 650
    goto :goto_9

    .line 651
    :cond_12
    :goto_8
    new-instance v12, Lip1;

    .line 652
    .line 653
    move-object/from16 v17, v6

    .line 654
    .line 655
    move-object/from16 v16, v14

    .line 656
    .line 657
    move v14, v11

    .line 658
    invoke-direct/range {v12 .. v17}, Lip1;-><init>(FFFLxk1;Lxk1;)V

    .line 659
    .line 660
    .line 661
    move-object/from16 v14, v16

    .line 662
    .line 663
    invoke-virtual {v2, v12}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    move-object v7, v12

    .line 667
    :goto_9
    check-cast v7, Lin0;

    .line 668
    .line 669
    invoke-static {v1, v7}, Lte;->L(Luh1;Lin0;)Luh1;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    move/from16 v5, v18

    .line 674
    .line 675
    invoke-virtual {v2, v5}, Lgo0;->g(Z)Z

    .line 676
    .line 677
    .line 678
    move-result v6

    .line 679
    move-object/from16 v7, p3

    .line 680
    .line 681
    invoke-virtual {v2, v7}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v11

    .line 685
    or-int/2addr v6, v11

    .line 686
    move-object v15, v10

    .line 687
    iget v10, v0, Lhp1;->i:I

    .line 688
    .line 689
    invoke-virtual {v2, v10}, Lgo0;->d(I)Z

    .line 690
    .line 691
    .line 692
    move-result v11

    .line 693
    or-int/2addr v6, v11

    .line 694
    iget-object v11, v0, Lhp1;->j:Lin0;

    .line 695
    .line 696
    invoke-virtual {v2, v11}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    or-int/2addr v0, v6

    .line 701
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v6

    .line 705
    if-nez v0, :cond_13

    .line 706
    .line 707
    if-ne v6, v4, :cond_14

    .line 708
    .line 709
    :cond_13
    move-object v6, v7

    .line 710
    goto :goto_a

    .line 711
    :cond_14
    move v0, v9

    .line 712
    goto :goto_b

    .line 713
    :goto_a
    new-instance v7, Ljp1;

    .line 714
    .line 715
    move-object v12, v8

    .line 716
    move v0, v9

    .line 717
    move-object/from16 v13, v17

    .line 718
    .line 719
    move v8, v5

    .line 720
    move-object v9, v6

    .line 721
    invoke-direct/range {v7 .. v15}, Ljp1;-><init>(ZLbs0;ILin0;Lxk1;Lxk1;Lxk1;Lxk1;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v7}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    move-object v6, v7

    .line 728
    :goto_b
    check-cast v6, Lxm0;

    .line 729
    .line 730
    invoke-static {v1, v3, v0, v6}, Lte;->r(Luh1;Lbk1;ZLxm0;)Luh1;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    const/4 v1, 0x0

    .line 735
    invoke-virtual {v2, v1}, Lgo0;->p(Z)V

    .line 736
    .line 737
    .line 738
    return-object v0
.end method
