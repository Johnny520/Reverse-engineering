.class public final Lgm2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic a:Lim2;


# direct methods
.method public constructor <init>(Lim2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgm2;->a:Lim2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JI)J
    .locals 21

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    iget-object v2, v2, Lgm2;->a:Lim2;

    .line 8
    .line 9
    iput v3, v2, Lim2;->j:I

    .line 10
    .line 11
    iget-object v4, v2, Lim2;->b:Ls8;

    .line 12
    .line 13
    if-eqz v4, :cond_36

    .line 14
    .line 15
    iget-object v5, v2, Lim2;->a:Lbm2;

    .line 16
    .line 17
    invoke-interface {v5}, Lbm2;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    iget-object v5, v2, Lim2;->a:Lbm2;

    .line 24
    .line 25
    invoke-interface {v5}, Lbm2;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_36

    .line 30
    .line 31
    :cond_0
    iget v3, v2, Lim2;->j:I

    .line 32
    .line 33
    iget-object v2, v2, Lim2;->m:Lv;

    .line 34
    .line 35
    iget-object v5, v4, Ls8;->c:Ljd0;

    .line 36
    .line 37
    iget-wide v6, v4, Ls8;->g:J

    .line 38
    .line 39
    invoke-static {v6, v7}, Lgr2;->c(J)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    iget-object v2, v2, Lv;->i:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lim2;

    .line 48
    .line 49
    iget-object v3, v2, Lim2;->k:Lkl2;

    .line 50
    .line 51
    iget v4, v2, Lim2;->j:I

    .line 52
    .line 53
    invoke-virtual {v2, v3, v0, v1, v4}, Lim2;->c(Lkl2;JI)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    new-instance v2, Lrs1;

    .line 58
    .line 59
    invoke-direct {v2, v0, v1}, Lrs1;-><init>(J)V

    .line 60
    .line 61
    .line 62
    iget-wide v0, v2, Lrs1;->a:J

    .line 63
    .line 64
    return-wide v0

    .line 65
    :cond_1
    iget-boolean v6, v4, Ls8;->f:Z

    .line 66
    .line 67
    const-wide/16 v7, 0x0

    .line 68
    .line 69
    const/4 v9, 0x1

    .line 70
    if-nez v6, :cond_6

    .line 71
    .line 72
    iget-object v6, v5, Ljd0;->f:Landroid/widget/EdgeEffect;

    .line 73
    .line 74
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_2

    .line 79
    .line 80
    invoke-virtual {v4, v7, v8}, Ls8;->f(J)F

    .line 81
    .line 82
    .line 83
    :cond_2
    iget-object v6, v5, Ljd0;->g:Landroid/widget/EdgeEffect;

    .line 84
    .line 85
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_3

    .line 90
    .line 91
    invoke-virtual {v4, v7, v8}, Ls8;->g(J)F

    .line 92
    .line 93
    .line 94
    :cond_3
    iget-object v6, v5, Ljd0;->d:Landroid/widget/EdgeEffect;

    .line 95
    .line 96
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    invoke-virtual {v4, v7, v8}, Ls8;->h(J)F

    .line 103
    .line 104
    .line 105
    :cond_4
    iget-object v6, v5, Ljd0;->e:Landroid/widget/EdgeEffect;

    .line 106
    .line 107
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_5

    .line 112
    .line 113
    invoke-virtual {v4, v7, v8}, Ls8;->e(J)F

    .line 114
    .line 115
    .line 116
    :cond_5
    iput-boolean v9, v4, Ls8;->f:Z

    .line 117
    .line 118
    :cond_6
    sget v6, Lp9;->a:I

    .line 119
    .line 120
    const/4 v6, 0x2

    .line 121
    if-ne v3, v6, :cond_7

    .line 122
    .line 123
    const/high16 v6, 0x40800000    # 4.0f

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_7
    const/high16 v6, 0x3f800000    # 1.0f

    .line 127
    .line 128
    :goto_0
    invoke-static {v6, v0, v1}, Lrs1;->f(FJ)J

    .line 129
    .line 130
    .line 131
    move-result-wide v10

    .line 132
    const-wide v12, 0xffffffffL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    and-long v14, v0, v12

    .line 138
    .line 139
    long-to-int v14, v14

    .line 140
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    cmpg-float v15, v15, v16

    .line 147
    .line 148
    if-nez v15, :cond_9

    .line 149
    .line 150
    move-wide/from16 v17, v12

    .line 151
    .line 152
    :cond_8
    move/from16 v12, v16

    .line 153
    .line 154
    goto/16 :goto_1

    .line 155
    .line 156
    :cond_9
    iget-object v15, v5, Ljd0;->d:Landroid/widget/EdgeEffect;

    .line 157
    .line 158
    invoke-static {v15}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 159
    .line 160
    .line 161
    move-result v15

    .line 162
    if-eqz v15, :cond_c

    .line 163
    .line 164
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    cmpg-float v15, v15, v16

    .line 169
    .line 170
    if-gez v15, :cond_c

    .line 171
    .line 172
    invoke-virtual {v4, v10, v11}, Ls8;->h(J)F

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    move-wide/from16 v17, v12

    .line 177
    .line 178
    iget-object v12, v5, Ljd0;->d:Landroid/widget/EdgeEffect;

    .line 179
    .line 180
    invoke-static {v12}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-nez v12, :cond_a

    .line 185
    .line 186
    invoke-virtual {v5}, Ljd0;->e()Landroid/widget/EdgeEffect;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    invoke-virtual {v12}, Landroid/widget/EdgeEffect;->finish()V

    .line 191
    .line 192
    .line 193
    :cond_a
    and-long v12, v10, v17

    .line 194
    .line 195
    long-to-int v12, v12

    .line 196
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    cmpg-float v12, v15, v12

    .line 201
    .line 202
    if-nez v12, :cond_b

    .line 203
    .line 204
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    goto :goto_1

    .line 209
    :cond_b
    div-float v12, v15, v6

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_c
    move-wide/from16 v17, v12

    .line 213
    .line 214
    iget-object v12, v5, Ljd0;->e:Landroid/widget/EdgeEffect;

    .line 215
    .line 216
    invoke-static {v12}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    if-eqz v12, :cond_8

    .line 221
    .line 222
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 223
    .line 224
    .line 225
    move-result v12

    .line 226
    cmpl-float v12, v12, v16

    .line 227
    .line 228
    if-lez v12, :cond_8

    .line 229
    .line 230
    invoke-virtual {v4, v10, v11}, Ls8;->e(J)F

    .line 231
    .line 232
    .line 233
    move-result v12

    .line 234
    iget-object v13, v5, Ljd0;->e:Landroid/widget/EdgeEffect;

    .line 235
    .line 236
    invoke-static {v13}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    if-nez v13, :cond_d

    .line 241
    .line 242
    invoke-virtual {v5}, Ljd0;->b()Landroid/widget/EdgeEffect;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->finish()V

    .line 247
    .line 248
    .line 249
    :cond_d
    and-long v7, v10, v17

    .line 250
    .line 251
    long-to-int v7, v7

    .line 252
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    cmpg-float v7, v12, v7

    .line 257
    .line 258
    if-nez v7, :cond_e

    .line 259
    .line 260
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 261
    .line 262
    .line 263
    move-result v12

    .line 264
    goto :goto_1

    .line 265
    :cond_e
    div-float/2addr v12, v6

    .line 266
    :goto_1
    const/16 p0, 0x20

    .line 267
    .line 268
    shr-long v7, v0, p0

    .line 269
    .line 270
    long-to-int v7, v7

    .line 271
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    cmpg-float v8, v8, v16

    .line 276
    .line 277
    if-nez v8, :cond_10

    .line 278
    .line 279
    :cond_f
    move/from16 v6, v16

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_10
    iget-object v8, v5, Ljd0;->f:Landroid/widget/EdgeEffect;

    .line 283
    .line 284
    invoke-static {v8}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    if-eqz v8, :cond_13

    .line 289
    .line 290
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    cmpg-float v8, v8, v16

    .line 295
    .line 296
    if-gez v8, :cond_13

    .line 297
    .line 298
    invoke-virtual {v4, v10, v11}, Ls8;->f(J)F

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    iget-object v13, v5, Ljd0;->f:Landroid/widget/EdgeEffect;

    .line 303
    .line 304
    invoke-static {v13}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 305
    .line 306
    .line 307
    move-result v13

    .line 308
    if-nez v13, :cond_11

    .line 309
    .line 310
    invoke-virtual {v5}, Ljd0;->c()Landroid/widget/EdgeEffect;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->finish()V

    .line 315
    .line 316
    .line 317
    :cond_11
    shr-long v10, v10, p0

    .line 318
    .line 319
    long-to-int v10, v10

    .line 320
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    cmpg-float v10, v8, v10

    .line 325
    .line 326
    if-nez v10, :cond_12

    .line 327
    .line 328
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    goto :goto_2

    .line 333
    :cond_12
    div-float v6, v8, v6

    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_13
    iget-object v8, v5, Ljd0;->g:Landroid/widget/EdgeEffect;

    .line 337
    .line 338
    invoke-static {v8}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    if-eqz v8, :cond_f

    .line 343
    .line 344
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    cmpl-float v8, v8, v16

    .line 349
    .line 350
    if-lez v8, :cond_f

    .line 351
    .line 352
    invoke-virtual {v4, v10, v11}, Ls8;->g(J)F

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    iget-object v13, v5, Ljd0;->g:Landroid/widget/EdgeEffect;

    .line 357
    .line 358
    invoke-static {v13}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    if-nez v13, :cond_14

    .line 363
    .line 364
    invoke-virtual {v5}, Ljd0;->d()Landroid/widget/EdgeEffect;

    .line 365
    .line 366
    .line 367
    move-result-object v13

    .line 368
    invoke-virtual {v13}, Landroid/widget/EdgeEffect;->finish()V

    .line 369
    .line 370
    .line 371
    :cond_14
    shr-long v10, v10, p0

    .line 372
    .line 373
    long-to-int v10, v10

    .line 374
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    cmpg-float v10, v8, v10

    .line 379
    .line 380
    if-nez v10, :cond_12

    .line 381
    .line 382
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    :goto_2
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    int-to-long v10, v6

    .line 391
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    int-to-long v12, v6

    .line 396
    shl-long v10, v10, p0

    .line 397
    .line 398
    and-long v12, v12, v17

    .line 399
    .line 400
    or-long/2addr v10, v12

    .line 401
    const-wide/16 v12, 0x0

    .line 402
    .line 403
    invoke-static {v10, v11, v12, v13}, Lrs1;->b(JJ)Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-nez v6, :cond_15

    .line 408
    .line 409
    invoke-virtual {v4}, Ls8;->d()V

    .line 410
    .line 411
    .line 412
    :cond_15
    invoke-static {v0, v1, v10, v11}, Lrs1;->d(JJ)J

    .line 413
    .line 414
    .line 415
    move-result-wide v0

    .line 416
    iget-object v2, v2, Lv;->i:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v2, Lim2;

    .line 419
    .line 420
    iget-object v6, v2, Lim2;->k:Lkl2;

    .line 421
    .line 422
    iget v8, v2, Lim2;->j:I

    .line 423
    .line 424
    invoke-virtual {v2, v6, v0, v1, v8}, Lim2;->c(Lkl2;JI)J

    .line 425
    .line 426
    .line 427
    move-result-wide v12

    .line 428
    new-instance v2, Lrs1;

    .line 429
    .line 430
    invoke-direct {v2, v12, v13}, Lrs1;-><init>(J)V

    .line 431
    .line 432
    .line 433
    iget-wide v12, v2, Lrs1;->a:J

    .line 434
    .line 435
    move-wide/from16 v19, v10

    .line 436
    .line 437
    invoke-static {v0, v1, v12, v13}, Lrs1;->d(JJ)J

    .line 438
    .line 439
    .line 440
    move-result-wide v9

    .line 441
    move v2, v7

    .line 442
    shr-long v6, v0, p0

    .line 443
    .line 444
    long-to-int v6, v6

    .line 445
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    cmpg-float v6, v6, v16

    .line 450
    .line 451
    if-nez v6, :cond_16

    .line 452
    .line 453
    and-long v6, v0, v17

    .line 454
    .line 455
    long-to-int v6, v6

    .line 456
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    cmpg-float v6, v6, v16

    .line 461
    .line 462
    if-nez v6, :cond_16

    .line 463
    .line 464
    goto :goto_3

    .line 465
    :cond_16
    shr-long v6, v12, p0

    .line 466
    .line 467
    long-to-int v6, v6

    .line 468
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    cmpg-float v6, v6, v16

    .line 473
    .line 474
    if-nez v6, :cond_17

    .line 475
    .line 476
    and-long v6, v12, v17

    .line 477
    .line 478
    long-to-int v6, v6

    .line 479
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    cmpg-float v6, v6, v16

    .line 484
    .line 485
    if-nez v6, :cond_17

    .line 486
    .line 487
    goto :goto_3

    .line 488
    :cond_17
    iget-object v6, v5, Ljd0;->f:Landroid/widget/EdgeEffect;

    .line 489
    .line 490
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    if-nez v6, :cond_18

    .line 495
    .line 496
    iget-object v6, v5, Ljd0;->d:Landroid/widget/EdgeEffect;

    .line 497
    .line 498
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 499
    .line 500
    .line 501
    move-result v6

    .line 502
    if-nez v6, :cond_18

    .line 503
    .line 504
    iget-object v6, v5, Ljd0;->g:Landroid/widget/EdgeEffect;

    .line 505
    .line 506
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 507
    .line 508
    .line 509
    move-result v6

    .line 510
    if-nez v6, :cond_18

    .line 511
    .line 512
    iget-object v6, v5, Ljd0;->e:Landroid/widget/EdgeEffect;

    .line 513
    .line 514
    invoke-static {v6}, Ljd0;->g(Landroid/widget/EdgeEffect;)Z

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-eqz v6, :cond_19

    .line 519
    .line 520
    :cond_18
    invoke-virtual {v4}, Ls8;->a()V

    .line 521
    .line 522
    .line 523
    :cond_19
    :goto_3
    const/4 v7, 0x1

    .line 524
    if-ne v3, v7, :cond_1f

    .line 525
    .line 526
    shr-long v6, v9, p0

    .line 527
    .line 528
    long-to-int v3, v6

    .line 529
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    const/high16 v7, 0x3f000000    # 0.5f

    .line 534
    .line 535
    cmpl-float v6, v6, v7

    .line 536
    .line 537
    const/high16 v8, -0x41000000    # -0.5f

    .line 538
    .line 539
    if-lez v6, :cond_1a

    .line 540
    .line 541
    invoke-virtual {v4, v9, v10}, Ls8;->f(J)F

    .line 542
    .line 543
    .line 544
    :goto_4
    move/from16 p0, v7

    .line 545
    .line 546
    move/from16 p2, v8

    .line 547
    .line 548
    const/4 v3, 0x1

    .line 549
    goto :goto_5

    .line 550
    :cond_1a
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    cmpg-float v3, v3, v8

    .line 555
    .line 556
    if-gez v3, :cond_1b

    .line 557
    .line 558
    invoke-virtual {v4, v9, v10}, Ls8;->g(J)F

    .line 559
    .line 560
    .line 561
    goto :goto_4

    .line 562
    :cond_1b
    move/from16 p0, v7

    .line 563
    .line 564
    move/from16 p2, v8

    .line 565
    .line 566
    const/4 v3, 0x0

    .line 567
    :goto_5
    and-long v7, v9, v17

    .line 568
    .line 569
    long-to-int v6, v7

    .line 570
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    cmpl-float v7, v7, p0

    .line 575
    .line 576
    if-lez v7, :cond_1c

    .line 577
    .line 578
    invoke-virtual {v4, v9, v10}, Ls8;->h(J)F

    .line 579
    .line 580
    .line 581
    :goto_6
    const/4 v6, 0x1

    .line 582
    goto :goto_7

    .line 583
    :cond_1c
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    cmpg-float v6, v6, p2

    .line 588
    .line 589
    if-gez v6, :cond_1d

    .line 590
    .line 591
    invoke-virtual {v4, v9, v10}, Ls8;->e(J)F

    .line 592
    .line 593
    .line 594
    goto :goto_6

    .line 595
    :cond_1d
    const/4 v6, 0x0

    .line 596
    :goto_7
    if-nez v3, :cond_1e

    .line 597
    .line 598
    if-eqz v6, :cond_1f

    .line 599
    .line 600
    :cond_1e
    const/4 v3, 0x1

    .line 601
    :goto_8
    const-wide/16 v6, 0x0

    .line 602
    .line 603
    goto :goto_9

    .line 604
    :cond_1f
    const/4 v3, 0x0

    .line 605
    goto :goto_8

    .line 606
    :goto_9
    invoke-static {v0, v1, v6, v7}, Lrs1;->b(JJ)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-nez v0, :cond_34

    .line 611
    .line 612
    iget-object v0, v5, Ljd0;->f:Landroid/widget/EdgeEffect;

    .line 613
    .line 614
    invoke-static {v0}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-eqz v0, :cond_22

    .line 619
    .line 620
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    cmpg-float v0, v0, v16

    .line 625
    .line 626
    if-gez v0, :cond_22

    .line 627
    .line 628
    invoke-virtual {v5}, Ljd0;->c()Landroid/widget/EdgeEffect;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    instance-of v6, v0, Ljq0;

    .line 637
    .line 638
    if-eqz v6, :cond_20

    .line 639
    .line 640
    check-cast v0, Ljq0;

    .line 641
    .line 642
    iget v6, v0, Ljq0;->b:F

    .line 643
    .line 644
    add-float/2addr v6, v1

    .line 645
    iput v6, v0, Ljq0;->b:F

    .line 646
    .line 647
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    iget v6, v0, Ljq0;->a:F

    .line 652
    .line 653
    cmpl-float v1, v1, v6

    .line 654
    .line 655
    if-lez v1, :cond_21

    .line 656
    .line 657
    invoke-virtual {v0}, Ljq0;->onRelease()V

    .line 658
    .line 659
    .line 660
    goto :goto_a

    .line 661
    :cond_20
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 662
    .line 663
    .line 664
    :cond_21
    :goto_a
    iget-object v0, v5, Ljd0;->f:Landroid/widget/EdgeEffect;

    .line 665
    .line 666
    invoke-static {v0}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    goto :goto_b

    .line 671
    :cond_22
    const/4 v0, 0x0

    .line 672
    :goto_b
    iget-object v1, v5, Ljd0;->g:Landroid/widget/EdgeEffect;

    .line 673
    .line 674
    invoke-static {v1}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 675
    .line 676
    .line 677
    move-result v1

    .line 678
    if-eqz v1, :cond_27

    .line 679
    .line 680
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 681
    .line 682
    .line 683
    move-result v1

    .line 684
    cmpl-float v1, v1, v16

    .line 685
    .line 686
    if-lez v1, :cond_27

    .line 687
    .line 688
    invoke-virtual {v5}, Ljd0;->d()Landroid/widget/EdgeEffect;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 693
    .line 694
    .line 695
    move-result v2

    .line 696
    instance-of v6, v1, Ljq0;

    .line 697
    .line 698
    if-eqz v6, :cond_23

    .line 699
    .line 700
    check-cast v1, Ljq0;

    .line 701
    .line 702
    iget v6, v1, Ljq0;->b:F

    .line 703
    .line 704
    add-float/2addr v6, v2

    .line 705
    iput v6, v1, Ljq0;->b:F

    .line 706
    .line 707
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    iget v6, v1, Ljq0;->a:F

    .line 712
    .line 713
    cmpl-float v2, v2, v6

    .line 714
    .line 715
    if-lez v2, :cond_24

    .line 716
    .line 717
    invoke-virtual {v1}, Ljq0;->onRelease()V

    .line 718
    .line 719
    .line 720
    goto :goto_c

    .line 721
    :cond_23
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 722
    .line 723
    .line 724
    :cond_24
    :goto_c
    if-nez v0, :cond_26

    .line 725
    .line 726
    iget-object v0, v5, Ljd0;->g:Landroid/widget/EdgeEffect;

    .line 727
    .line 728
    invoke-static {v0}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_25

    .line 733
    .line 734
    goto :goto_d

    .line 735
    :cond_25
    const/4 v0, 0x0

    .line 736
    goto :goto_e

    .line 737
    :cond_26
    :goto_d
    const/4 v0, 0x1

    .line 738
    :cond_27
    :goto_e
    iget-object v1, v5, Ljd0;->d:Landroid/widget/EdgeEffect;

    .line 739
    .line 740
    invoke-static {v1}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 741
    .line 742
    .line 743
    move-result v1

    .line 744
    if-eqz v1, :cond_2c

    .line 745
    .line 746
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    cmpg-float v1, v1, v16

    .line 751
    .line 752
    if-gez v1, :cond_2c

    .line 753
    .line 754
    invoke-virtual {v5}, Ljd0;->e()Landroid/widget/EdgeEffect;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 759
    .line 760
    .line 761
    move-result v2

    .line 762
    instance-of v6, v1, Ljq0;

    .line 763
    .line 764
    if-eqz v6, :cond_28

    .line 765
    .line 766
    check-cast v1, Ljq0;

    .line 767
    .line 768
    iget v6, v1, Ljq0;->b:F

    .line 769
    .line 770
    add-float/2addr v6, v2

    .line 771
    iput v6, v1, Ljq0;->b:F

    .line 772
    .line 773
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    iget v6, v1, Ljq0;->a:F

    .line 778
    .line 779
    cmpl-float v2, v2, v6

    .line 780
    .line 781
    if-lez v2, :cond_29

    .line 782
    .line 783
    invoke-virtual {v1}, Ljq0;->onRelease()V

    .line 784
    .line 785
    .line 786
    goto :goto_f

    .line 787
    :cond_28
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 788
    .line 789
    .line 790
    :cond_29
    :goto_f
    if-nez v0, :cond_2b

    .line 791
    .line 792
    iget-object v0, v5, Ljd0;->d:Landroid/widget/EdgeEffect;

    .line 793
    .line 794
    invoke-static {v0}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    if-eqz v0, :cond_2a

    .line 799
    .line 800
    goto :goto_10

    .line 801
    :cond_2a
    const/4 v0, 0x0

    .line 802
    goto :goto_11

    .line 803
    :cond_2b
    :goto_10
    const/4 v0, 0x1

    .line 804
    :cond_2c
    :goto_11
    iget-object v1, v5, Ljd0;->e:Landroid/widget/EdgeEffect;

    .line 805
    .line 806
    invoke-static {v1}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    if-eqz v1, :cond_31

    .line 811
    .line 812
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 813
    .line 814
    .line 815
    move-result v1

    .line 816
    cmpl-float v1, v1, v16

    .line 817
    .line 818
    if-lez v1, :cond_31

    .line 819
    .line 820
    invoke-virtual {v5}, Ljd0;->b()Landroid/widget/EdgeEffect;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 825
    .line 826
    .line 827
    move-result v2

    .line 828
    instance-of v6, v1, Ljq0;

    .line 829
    .line 830
    if-eqz v6, :cond_2d

    .line 831
    .line 832
    check-cast v1, Ljq0;

    .line 833
    .line 834
    iget v6, v1, Ljq0;->b:F

    .line 835
    .line 836
    add-float/2addr v6, v2

    .line 837
    iput v6, v1, Ljq0;->b:F

    .line 838
    .line 839
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    iget v6, v1, Ljq0;->a:F

    .line 844
    .line 845
    cmpl-float v2, v2, v6

    .line 846
    .line 847
    if-lez v2, :cond_2e

    .line 848
    .line 849
    invoke-virtual {v1}, Ljq0;->onRelease()V

    .line 850
    .line 851
    .line 852
    goto :goto_12

    .line 853
    :cond_2d
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 854
    .line 855
    .line 856
    :cond_2e
    :goto_12
    if-nez v0, :cond_30

    .line 857
    .line 858
    iget-object v0, v5, Ljd0;->e:Landroid/widget/EdgeEffect;

    .line 859
    .line 860
    invoke-static {v0}, Ljd0;->f(Landroid/widget/EdgeEffect;)Z

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    if-eqz v0, :cond_2f

    .line 865
    .line 866
    goto :goto_13

    .line 867
    :cond_2f
    const/4 v0, 0x0

    .line 868
    goto :goto_14

    .line 869
    :cond_30
    :goto_13
    const/4 v0, 0x1

    .line 870
    :cond_31
    :goto_14
    if-nez v0, :cond_33

    .line 871
    .line 872
    if-eqz v3, :cond_32

    .line 873
    .line 874
    goto :goto_15

    .line 875
    :cond_32
    const/4 v9, 0x0

    .line 876
    goto :goto_16

    .line 877
    :cond_33
    :goto_15
    const/4 v9, 0x1

    .line 878
    :goto_16
    move v3, v9

    .line 879
    :cond_34
    if-eqz v3, :cond_35

    .line 880
    .line 881
    invoke-virtual {v4}, Ls8;->d()V

    .line 882
    .line 883
    .line 884
    :cond_35
    move-wide/from16 v0, v19

    .line 885
    .line 886
    invoke-static {v0, v1, v12, v13}, Lrs1;->e(JJ)J

    .line 887
    .line 888
    .line 889
    move-result-wide v0

    .line 890
    return-wide v0

    .line 891
    :cond_36
    iget-object v4, v2, Lim2;->k:Lkl2;

    .line 892
    .line 893
    invoke-virtual {v2, v4, v0, v1, v3}, Lim2;->c(Lkl2;JI)J

    .line 894
    .line 895
    .line 896
    move-result-wide v0

    .line 897
    return-wide v0
.end method
