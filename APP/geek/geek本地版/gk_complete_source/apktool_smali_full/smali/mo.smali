.class public final Lmo;
.super Ljava/lang/Object;


# instance fields
.field public a:D

.field public b:I


# direct methods
.method public static a(DDD)Lmo;
    .locals 57

    .line 1
    sget-object v0, Lff;->p:[D

    .line 2
    .line 3
    const-wide v1, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmpg-double v3, p2, v1

    .line 9
    .line 10
    const-wide v9, 0x400e666666666666L    # 3.8

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const-wide/high16 v11, 0x3fd0000000000000L    # 0.25

    .line 16
    .line 17
    const-wide v13, 0x3fe75c28f5c28f5cL    # 0.73

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    move-wide v15, v1

    .line 23
    const-wide v1, 0x3fd28f5c28f5c28fL    # 0.29

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const-wide v17, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const-wide/high16 v19, 0x4026000000000000L    # 11.0

    .line 34
    .line 35
    const-wide v21, 0x4076800000000000L    # 360.0

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const/high16 v23, -0x1000000

    .line 41
    .line 42
    const-wide v24, 0x3fd3851eb851eb85L    # 0.305

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide/high16 v26, 0x4059000000000000L    # 100.0

    .line 48
    .line 49
    const-wide/high16 v28, 0x4000000000000000L    # 2.0

    .line 50
    .line 51
    const/16 v30, 0x0

    .line 52
    .line 53
    const/16 v31, 0x2

    .line 54
    .line 55
    const-wide/16 v32, 0x0

    .line 56
    .line 57
    if-ltz v3, :cond_0

    .line 58
    .line 59
    cmpg-double v3, p4, v15

    .line 60
    .line 61
    if-ltz v3, :cond_0

    .line 62
    .line 63
    const-wide v15, 0x4058fffe5c91d14eL    # 99.9999

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmpl-double v3, p4, v15

    .line 69
    .line 70
    if-lez v3, :cond_1

    .line 71
    .line 72
    :cond_0
    move-wide/from16 v44, v9

    .line 73
    .line 74
    move-wide/from16 v48, v11

    .line 75
    .line 76
    const-wide v38, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    goto/16 :goto_18

    .line 82
    .line 83
    :cond_1
    rem-double v15, p0, v21

    .line 84
    .line 85
    cmpg-double v3, v15, v32

    .line 86
    .line 87
    if-gez v3, :cond_2

    .line 88
    .line 89
    add-double v15, v15, v21

    .line 90
    .line 91
    :cond_2
    const-wide v34, 0x4066800000000000L    # 180.0

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    div-double v15, v15, v34

    .line 97
    .line 98
    const-wide v34, 0x400921fb54442d18L    # Math.PI

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    mul-double v15, v15, v34

    .line 104
    .line 105
    invoke-static/range {p4 .. p5}, La80;->J(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v34

    .line 109
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->sqrt(D)D

    .line 110
    .line 111
    .line 112
    move-result-wide v36

    .line 113
    mul-double v36, v36, v19

    .line 114
    .line 115
    sget-object v3, Lfb0;->k:Lfb0;

    .line 116
    .line 117
    const-wide v38, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    iget-wide v7, v3, Lfb0;->f:D

    .line 123
    .line 124
    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 125
    .line 126
    .line 127
    move-result-wide v7

    .line 128
    sub-double v7, v17, v7

    .line 129
    .line 130
    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 131
    .line 132
    .line 133
    move-result-wide v7

    .line 134
    const-wide/high16 v40, 0x3ff0000000000000L    # 1.0

    .line 135
    .line 136
    div-double v7, v40, v7

    .line 137
    .line 138
    add-double v42, v15, v28

    .line 139
    .line 140
    invoke-static/range {v42 .. v43}, Ljava/lang/Math;->cos(D)D

    .line 141
    .line 142
    .line 143
    move-result-wide v42

    .line 144
    add-double v42, v42, v9

    .line 145
    .line 146
    mul-double v42, v42, v11

    .line 147
    .line 148
    mul-double v42, v42, v38

    .line 149
    .line 150
    move-wide/from16 v44, v9

    .line 151
    .line 152
    iget-wide v9, v3, Lfb0;->e:D

    .line 153
    .line 154
    mul-double v42, v42, v9

    .line 155
    .line 156
    iget-wide v9, v3, Lfb0;->c:D

    .line 157
    .line 158
    mul-double v42, v42, v9

    .line 159
    .line 160
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->sin(D)D

    .line 161
    .line 162
    .line 163
    move-result-wide v9

    .line 164
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->cos(D)D

    .line 165
    .line 166
    .line 167
    move-result-wide v46

    .line 168
    move-wide/from16 v48, v11

    .line 169
    .line 170
    move/from16 v11, v30

    .line 171
    .line 172
    :goto_0
    const/4 v12, 0x5

    .line 173
    if-ge v11, v12, :cond_b

    .line 174
    .line 175
    div-double v1, v36, v26

    .line 176
    .line 177
    cmpl-double v12, p2, v32

    .line 178
    .line 179
    if-eqz v12, :cond_4

    .line 180
    .line 181
    cmpl-double v12, v36, v32

    .line 182
    .line 183
    if-nez v12, :cond_3

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_3
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 187
    .line 188
    .line 189
    move-result-wide v50

    .line 190
    div-double v50, p2, v50

    .line 191
    .line 192
    :goto_1
    const/16 v12, 0x8

    .line 193
    .line 194
    const/4 v14, 0x1

    .line 195
    goto :goto_3

    .line 196
    :cond_4
    :goto_2
    move-wide/from16 v50, v32

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :goto_3
    mul-double v5, v50, v7

    .line 200
    .line 201
    move/from16 p4, v14

    .line 202
    .line 203
    move-wide/from16 p0, v15

    .line 204
    .line 205
    const-wide v14, 0x3ff1c71c71c71c72L    # 1.1111111111111112

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    invoke-static {v5, v6, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 211
    .line 212
    .line 213
    move-result-wide v5

    .line 214
    iget-wide v14, v3, Lfb0;->a:D

    .line 215
    .line 216
    move/from16 p5, v12

    .line 217
    .line 218
    iget-wide v12, v3, Lfb0;->d:D

    .line 219
    .line 220
    div-double v12, v40, v12

    .line 221
    .line 222
    move-wide/from16 v51, v5

    .line 223
    .line 224
    iget-wide v4, v3, Lfb0;->j:D

    .line 225
    .line 226
    div-double/2addr v12, v4

    .line 227
    invoke-static {v1, v2, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 228
    .line 229
    .line 230
    move-result-wide v1

    .line 231
    mul-double/2addr v1, v14

    .line 232
    iget-wide v4, v3, Lfb0;->b:D

    .line 233
    .line 234
    div-double/2addr v1, v4

    .line 235
    add-double v5, v1, v24

    .line 236
    .line 237
    const-wide/high16 v12, 0x4037000000000000L    # 23.0

    .line 238
    .line 239
    mul-double/2addr v5, v12

    .line 240
    mul-double v5, v5, v51

    .line 241
    .line 242
    mul-double v12, v12, v42

    .line 243
    .line 244
    mul-double v14, v51, v19

    .line 245
    .line 246
    mul-double v14, v14, v46

    .line 247
    .line 248
    add-double/2addr v14, v12

    .line 249
    const-wide/high16 v12, 0x405b000000000000L    # 108.0

    .line 250
    .line 251
    mul-double v12, v12, v51

    .line 252
    .line 253
    mul-double/2addr v12, v9

    .line 254
    add-double/2addr v12, v14

    .line 255
    div-double/2addr v5, v12

    .line 256
    mul-double v12, v5, v46

    .line 257
    .line 258
    mul-double/2addr v5, v9

    .line 259
    const-wide v14, 0x407cc00000000000L    # 460.0

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    mul-double/2addr v1, v14

    .line 265
    const-wide v14, 0x407c300000000000L    # 451.0

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    mul-double/2addr v14, v12

    .line 271
    add-double/2addr v14, v1

    .line 272
    const-wide/high16 v51, 0x4072000000000000L    # 288.0

    .line 273
    .line 274
    mul-double v51, v51, v5

    .line 275
    .line 276
    add-double v51, v51, v14

    .line 277
    .line 278
    const-wide v14, 0x4095ec0000000000L    # 1403.0

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    div-double v51, v51, v14

    .line 284
    .line 285
    const-wide v53, 0x408bd80000000000L    # 891.0

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    mul-double v53, v53, v12

    .line 291
    .line 292
    sub-double v53, v1, v53

    .line 293
    .line 294
    const-wide v55, 0x4070500000000000L    # 261.0

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    mul-double v55, v55, v5

    .line 300
    .line 301
    sub-double v53, v53, v55

    .line 302
    .line 303
    div-double v53, v53, v14

    .line 304
    .line 305
    const-wide v55, 0x406b800000000000L    # 220.0

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    mul-double v12, v12, v55

    .line 311
    .line 312
    sub-double/2addr v1, v12

    .line 313
    const-wide v12, 0x40b89c0000000000L    # 6300.0

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    mul-double/2addr v5, v12

    .line 319
    sub-double/2addr v1, v5

    .line 320
    div-double/2addr v1, v14

    .line 321
    invoke-static/range {v51 .. v52}, Lff;->x(D)D

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    invoke-static/range {v53 .. v54}, Lff;->x(D)D

    .line 326
    .line 327
    .line 328
    move-result-wide v12

    .line 329
    invoke-static {v1, v2}, Lff;->x(D)D

    .line 330
    .line 331
    .line 332
    move-result-wide v1

    .line 333
    const/4 v6, 0x3

    .line 334
    new-array v14, v6, [D

    .line 335
    .line 336
    aput-wide v4, v14, v30

    .line 337
    .line 338
    aput-wide v12, v14, p4

    .line 339
    .line 340
    aput-wide v1, v14, v31

    .line 341
    .line 342
    sget-object v1, Lff;->o:[[D

    .line 343
    .line 344
    invoke-static {v14, v1}, Lzt;->F([D[[D)[D

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    aget-wide v4, v1, v30

    .line 349
    .line 350
    cmpg-double v2, v4, v32

    .line 351
    .line 352
    if-ltz v2, :cond_6

    .line 353
    .line 354
    aget-wide v12, v1, p4

    .line 355
    .line 356
    cmpg-double v2, v12, v32

    .line 357
    .line 358
    if-ltz v2, :cond_6

    .line 359
    .line 360
    aget-wide v14, v1, v31

    .line 361
    .line 362
    cmpg-double v2, v14, v32

    .line 363
    .line 364
    if-gez v2, :cond_5

    .line 365
    .line 366
    goto :goto_4

    .line 367
    :cond_5
    aget-wide v51, v0, v30

    .line 368
    .line 369
    aget-wide v53, v0, p4

    .line 370
    .line 371
    aget-wide v55, v0, v31

    .line 372
    .line 373
    mul-double v51, v51, v4

    .line 374
    .line 375
    mul-double v53, v53, v12

    .line 376
    .line 377
    add-double v53, v53, v51

    .line 378
    .line 379
    mul-double v55, v55, v14

    .line 380
    .line 381
    add-double v55, v55, v53

    .line 382
    .line 383
    cmpg-double v2, v55, v32

    .line 384
    .line 385
    if-gtz v2, :cond_7

    .line 386
    .line 387
    :cond_6
    :goto_4
    move/from16 v1, v30

    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_7
    const/4 v2, 0x4

    .line 391
    if-eq v11, v2, :cond_9

    .line 392
    .line 393
    sub-double v4, v55, v34

    .line 394
    .line 395
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 396
    .line 397
    .line 398
    move-result-wide v12

    .line 399
    const-wide v14, 0x3f60624dd2f1a9fcL    # 0.002

    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    cmpg-double v2, v12, v14

    .line 405
    .line 406
    if-gez v2, :cond_8

    .line 407
    .line 408
    goto :goto_5

    .line 409
    :cond_8
    mul-double v4, v4, v36

    .line 410
    .line 411
    mul-double v55, v55, v28

    .line 412
    .line 413
    div-double v4, v4, v55

    .line 414
    .line 415
    sub-double v36, v36, v4

    .line 416
    .line 417
    add-int/lit8 v11, v11, 0x1

    .line 418
    .line 419
    move-wide/from16 v15, p0

    .line 420
    .line 421
    const-wide v1, 0x3fd28f5c28f5c28fL    # 0.29

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    const-wide v13, 0x3fe75c28f5c28f5cL    # 0.73

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    goto/16 :goto_0

    .line 432
    .line 433
    :cond_9
    :goto_5
    aget-wide v2, v1, v30

    .line 434
    .line 435
    const-wide v4, 0x405900a3d70a3d71L    # 100.01

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    cmpl-double v6, v2, v4

    .line 441
    .line 442
    if-gtz v6, :cond_6

    .line 443
    .line 444
    aget-wide v6, v1, p4

    .line 445
    .line 446
    cmpl-double v6, v6, v4

    .line 447
    .line 448
    if-gtz v6, :cond_6

    .line 449
    .line 450
    aget-wide v6, v1, v31

    .line 451
    .line 452
    cmpl-double v4, v6, v4

    .line 453
    .line 454
    if-lez v4, :cond_a

    .line 455
    .line 456
    goto :goto_4

    .line 457
    :cond_a
    invoke-static {v2, v3}, La80;->i(D)I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    aget-wide v3, v1, p4

    .line 462
    .line 463
    invoke-static {v3, v4}, La80;->i(D)I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    aget-wide v4, v1, v31

    .line 468
    .line 469
    invoke-static {v4, v5}, La80;->i(D)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    and-int/lit16 v2, v2, 0xff

    .line 474
    .line 475
    shl-int/lit8 v2, v2, 0x10

    .line 476
    .line 477
    or-int v2, v2, v23

    .line 478
    .line 479
    and-int/lit16 v3, v3, 0xff

    .line 480
    .line 481
    shl-int/lit8 v3, v3, 0x8

    .line 482
    .line 483
    or-int/2addr v2, v3

    .line 484
    and-int/lit16 v1, v1, 0xff

    .line 485
    .line 486
    or-int/2addr v1, v2

    .line 487
    goto :goto_6

    .line 488
    :cond_b
    move-wide/from16 p0, v15

    .line 489
    .line 490
    const/16 p4, 0x1

    .line 491
    .line 492
    const/16 p5, 0x8

    .line 493
    .line 494
    goto :goto_4

    .line 495
    :goto_6
    if-eqz v1, :cond_c

    .line 496
    .line 497
    goto/16 :goto_19

    .line 498
    .line 499
    :cond_c
    const/4 v6, 0x3

    .line 500
    new-array v1, v6, [D

    .line 501
    .line 502
    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    .line 503
    .line 504
    aput-wide v2, v1, v30

    .line 505
    .line 506
    aput-wide v2, v1, p4

    .line 507
    .line 508
    aput-wide v2, v1, v31

    .line 509
    .line 510
    move/from16 v4, p4

    .line 511
    .line 512
    move-object v2, v1

    .line 513
    move/from16 v3, v30

    .line 514
    .line 515
    move v5, v3

    .line 516
    move-wide/from16 v6, v32

    .line 517
    .line 518
    move-wide v10, v6

    .line 519
    :goto_7
    const/16 v8, 0xc

    .line 520
    .line 521
    if-ge v5, v8, :cond_19

    .line 522
    .line 523
    aget-wide v8, v0, v30

    .line 524
    .line 525
    aget-wide v36, v0, p4

    .line 526
    .line 527
    aget-wide v40, v0, v31

    .line 528
    .line 529
    rem-int/lit8 v12, v5, 0x4

    .line 530
    .line 531
    move/from16 v14, p4

    .line 532
    .line 533
    if-gt v12, v14, :cond_d

    .line 534
    .line 535
    move-wide/from16 v42, v32

    .line 536
    .line 537
    goto :goto_8

    .line 538
    :cond_d
    move-wide/from16 v42, v26

    .line 539
    .line 540
    :goto_8
    rem-int/lit8 v12, v5, 0x2

    .line 541
    .line 542
    if-nez v12, :cond_e

    .line 543
    .line 544
    move-wide/from16 v15, v32

    .line 545
    .line 546
    :goto_9
    const/4 v13, 0x4

    .line 547
    goto :goto_a

    .line 548
    :cond_e
    move-wide/from16 v15, v26

    .line 549
    .line 550
    goto :goto_9

    .line 551
    :goto_a
    if-ge v5, v13, :cond_10

    .line 552
    .line 553
    mul-double v36, v36, v42

    .line 554
    .line 555
    sub-double v36, v34, v36

    .line 556
    .line 557
    mul-double v40, v40, v15

    .line 558
    .line 559
    sub-double v36, v36, v40

    .line 560
    .line 561
    div-double v36, v36, v8

    .line 562
    .line 563
    invoke-static/range {v36 .. v37}, Lff;->y(D)Z

    .line 564
    .line 565
    .line 566
    move-result v8

    .line 567
    if-eqz v8, :cond_f

    .line 568
    .line 569
    const/4 v12, 0x3

    .line 570
    new-array v8, v12, [D

    .line 571
    .line 572
    aput-wide v36, v8, v30

    .line 573
    .line 574
    const/4 v14, 0x1

    .line 575
    aput-wide v42, v8, v14

    .line 576
    .line 577
    aput-wide v15, v8, v31

    .line 578
    .line 579
    :goto_b
    move-object v13, v8

    .line 580
    goto :goto_c

    .line 581
    :cond_f
    const/4 v12, 0x3

    .line 582
    new-array v8, v12, [D

    .line 583
    .line 584
    fill-array-data v8, :array_0

    .line 585
    .line 586
    .line 587
    goto :goto_b

    .line 588
    :cond_10
    move/from16 v12, p5

    .line 589
    .line 590
    if-ge v5, v12, :cond_12

    .line 591
    .line 592
    const/4 v12, 0x3

    .line 593
    mul-double/2addr v8, v15

    .line 594
    sub-double v8, v34, v8

    .line 595
    .line 596
    mul-double v40, v40, v42

    .line 597
    .line 598
    sub-double v8, v8, v40

    .line 599
    .line 600
    div-double v8, v8, v36

    .line 601
    .line 602
    invoke-static {v8, v9}, Lff;->y(D)Z

    .line 603
    .line 604
    .line 605
    move-result v36

    .line 606
    if-eqz v36, :cond_11

    .line 607
    .line 608
    new-array v13, v12, [D

    .line 609
    .line 610
    aput-wide v15, v13, v30

    .line 611
    .line 612
    const/4 v14, 0x1

    .line 613
    aput-wide v8, v13, v14

    .line 614
    .line 615
    aput-wide v42, v13, v31

    .line 616
    .line 617
    goto :goto_c

    .line 618
    :cond_11
    new-array v8, v12, [D

    .line 619
    .line 620
    fill-array-data v8, :array_1

    .line 621
    .line 622
    .line 623
    goto :goto_b

    .line 624
    :cond_12
    const/4 v12, 0x3

    .line 625
    mul-double v8, v8, v42

    .line 626
    .line 627
    sub-double v8, v34, v8

    .line 628
    .line 629
    mul-double v36, v36, v15

    .line 630
    .line 631
    sub-double v8, v8, v36

    .line 632
    .line 633
    div-double v8, v8, v40

    .line 634
    .line 635
    invoke-static {v8, v9}, Lff;->y(D)Z

    .line 636
    .line 637
    .line 638
    move-result v13

    .line 639
    if-eqz v13, :cond_13

    .line 640
    .line 641
    new-array v13, v12, [D

    .line 642
    .line 643
    aput-wide v42, v13, v30

    .line 644
    .line 645
    const/4 v14, 0x1

    .line 646
    aput-wide v15, v13, v14

    .line 647
    .line 648
    aput-wide v8, v13, v31

    .line 649
    .line 650
    goto :goto_c

    .line 651
    :cond_13
    new-array v8, v12, [D

    .line 652
    .line 653
    fill-array-data v8, :array_2

    .line 654
    .line 655
    .line 656
    goto :goto_b

    .line 657
    :goto_c
    aget-wide v8, v13, v30

    .line 658
    .line 659
    cmpg-double v8, v8, v32

    .line 660
    .line 661
    if-gez v8, :cond_14

    .line 662
    .line 663
    goto :goto_d

    .line 664
    :cond_14
    invoke-static {v13}, Lff;->v([D)D

    .line 665
    .line 666
    .line 667
    move-result-wide v8

    .line 668
    if-nez v3, :cond_15

    .line 669
    .line 670
    move-wide/from16 v15, p0

    .line 671
    .line 672
    move-wide v6, v8

    .line 673
    move-wide v10, v6

    .line 674
    move-object v1, v13

    .line 675
    move-object v2, v1

    .line 676
    const/4 v3, 0x1

    .line 677
    goto :goto_10

    .line 678
    :cond_15
    if-nez v4, :cond_16

    .line 679
    .line 680
    invoke-static/range {v6 .. v11}, Lff;->b(DDD)Z

    .line 681
    .line 682
    .line 683
    move-result v12

    .line 684
    if-eqz v12, :cond_17

    .line 685
    .line 686
    :cond_16
    move-wide/from16 p2, p0

    .line 687
    .line 688
    move-wide/from16 p0, v6

    .line 689
    .line 690
    move-wide/from16 p4, v8

    .line 691
    .line 692
    goto :goto_e

    .line 693
    :cond_17
    :goto_d
    move-wide/from16 v15, p0

    .line 694
    .line 695
    goto :goto_10

    .line 696
    :goto_e
    invoke-static/range {p0 .. p5}, Lff;->b(DDD)Z

    .line 697
    .line 698
    .line 699
    move-result v4

    .line 700
    move-wide/from16 v6, p0

    .line 701
    .line 702
    move-wide/from16 v15, p2

    .line 703
    .line 704
    move-wide/from16 v8, p4

    .line 705
    .line 706
    if-eqz v4, :cond_18

    .line 707
    .line 708
    move-wide v10, v8

    .line 709
    move-object v2, v13

    .line 710
    :goto_f
    move/from16 v4, v30

    .line 711
    .line 712
    goto :goto_10

    .line 713
    :cond_18
    move-wide v6, v8

    .line 714
    move-object v1, v13

    .line 715
    goto :goto_f

    .line 716
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 717
    .line 718
    move-wide/from16 p0, v15

    .line 719
    .line 720
    const/16 p4, 0x1

    .line 721
    .line 722
    const/16 p5, 0x8

    .line 723
    .line 724
    goto/16 :goto_7

    .line 725
    .line 726
    :cond_19
    move-wide/from16 v15, p0

    .line 727
    .line 728
    filled-new-array {v1, v2}, [[D

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    aget-object v1, v0, v30

    .line 733
    .line 734
    invoke-static {v1}, Lff;->v([D)D

    .line 735
    .line 736
    .line 737
    move-result-wide v2

    .line 738
    const/4 v14, 0x1

    .line 739
    aget-object v0, v0, v14

    .line 740
    .line 741
    move/from16 v4, v30

    .line 742
    .line 743
    :goto_11
    const/4 v12, 0x3

    .line 744
    if-ge v4, v12, :cond_1f

    .line 745
    .line 746
    aget-wide v5, v1, v4

    .line 747
    .line 748
    aget-wide v7, v0, v4

    .line 749
    .line 750
    cmpl-double v9, v5, v7

    .line 751
    .line 752
    if-eqz v9, :cond_1e

    .line 753
    .line 754
    cmpg-double v7, v5, v7

    .line 755
    .line 756
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 757
    .line 758
    if-gez v7, :cond_1a

    .line 759
    .line 760
    invoke-static {v5, v6}, Lff;->U(D)D

    .line 761
    .line 762
    .line 763
    move-result-wide v5

    .line 764
    sub-double/2addr v5, v8

    .line 765
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 766
    .line 767
    .line 768
    move-result-wide v5

    .line 769
    double-to-int v5, v5

    .line 770
    aget-wide v6, v0, v4

    .line 771
    .line 772
    invoke-static {v6, v7}, Lff;->U(D)D

    .line 773
    .line 774
    .line 775
    move-result-wide v6

    .line 776
    sub-double/2addr v6, v8

    .line 777
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 778
    .line 779
    .line 780
    move-result-wide v6

    .line 781
    :goto_12
    double-to-int v6, v6

    .line 782
    goto :goto_13

    .line 783
    :cond_1a
    invoke-static {v5, v6}, Lff;->U(D)D

    .line 784
    .line 785
    .line 786
    move-result-wide v5

    .line 787
    sub-double/2addr v5, v8

    .line 788
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 789
    .line 790
    .line 791
    move-result-wide v5

    .line 792
    double-to-int v5, v5

    .line 793
    aget-wide v6, v0, v4

    .line 794
    .line 795
    invoke-static {v6, v7}, Lff;->U(D)D

    .line 796
    .line 797
    .line 798
    move-result-wide v6

    .line 799
    sub-double/2addr v6, v8

    .line 800
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 801
    .line 802
    .line 803
    move-result-wide v6

    .line 804
    goto :goto_12

    .line 805
    :goto_13
    move/from16 v7, v30

    .line 806
    .line 807
    :goto_14
    const/16 v12, 0x8

    .line 808
    .line 809
    if-ge v7, v12, :cond_1b

    .line 810
    .line 811
    sub-int v8, v6, v5

    .line 812
    .line 813
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 814
    .line 815
    .line 816
    move-result v8

    .line 817
    const/4 v14, 0x1

    .line 818
    if-gt v8, v14, :cond_1c

    .line 819
    .line 820
    :cond_1b
    move-wide/from16 v34, v2

    .line 821
    .line 822
    goto :goto_16

    .line 823
    :cond_1c
    add-int v8, v5, v6

    .line 824
    .line 825
    int-to-double v8, v8

    .line 826
    div-double v8, v8, v28

    .line 827
    .line 828
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 829
    .line 830
    .line 831
    move-result-wide v8

    .line 832
    double-to-int v8, v8

    .line 833
    sget-object v9, Lff;->q:[D

    .line 834
    .line 835
    aget-wide v10, v9, v8

    .line 836
    .line 837
    aget-wide v34, v1, v4

    .line 838
    .line 839
    aget-wide v36, v0, v4

    .line 840
    .line 841
    sub-double v10, v10, v34

    .line 842
    .line 843
    sub-double v36, v36, v34

    .line 844
    .line 845
    div-double v10, v10, v36

    .line 846
    .line 847
    aget-wide v34, v1, v30

    .line 848
    .line 849
    aget-wide v36, v0, v30

    .line 850
    .line 851
    sub-double v36, v36, v34

    .line 852
    .line 853
    mul-double v36, v36, v10

    .line 854
    .line 855
    add-double v36, v36, v34

    .line 856
    .line 857
    const/4 v14, 0x1

    .line 858
    aget-wide v34, v1, v14

    .line 859
    .line 860
    aget-wide v40, v0, v14

    .line 861
    .line 862
    sub-double v40, v40, v34

    .line 863
    .line 864
    mul-double v40, v40, v10

    .line 865
    .line 866
    add-double v40, v40, v34

    .line 867
    .line 868
    aget-wide v34, v1, v31

    .line 869
    .line 870
    aget-wide v42, v0, v31

    .line 871
    .line 872
    sub-double v42, v42, v34

    .line 873
    .line 874
    mul-double v42, v42, v10

    .line 875
    .line 876
    add-double v42, v42, v34

    .line 877
    .line 878
    const/4 v9, 0x3

    .line 879
    new-array v10, v9, [D

    .line 880
    .line 881
    aput-wide v36, v10, v30

    .line 882
    .line 883
    aput-wide v40, v10, v14

    .line 884
    .line 885
    aput-wide v42, v10, v31

    .line 886
    .line 887
    invoke-static {v10}, Lff;->v([D)D

    .line 888
    .line 889
    .line 890
    move-result-wide v34

    .line 891
    move-wide/from16 p0, v2

    .line 892
    .line 893
    move-wide/from16 p2, v15

    .line 894
    .line 895
    move-wide/from16 p4, v34

    .line 896
    .line 897
    invoke-static/range {p0 .. p5}, Lff;->b(DDD)Z

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    move-wide/from16 v34, p0

    .line 902
    .line 903
    move-wide/from16 v36, p4

    .line 904
    .line 905
    if-eqz v2, :cond_1d

    .line 906
    .line 907
    move v6, v8

    .line 908
    move-object v0, v10

    .line 909
    move-wide/from16 v2, v34

    .line 910
    .line 911
    goto :goto_15

    .line 912
    :cond_1d
    move v5, v8

    .line 913
    move-object v1, v10

    .line 914
    move-wide/from16 v2, v36

    .line 915
    .line 916
    :goto_15
    add-int/lit8 v7, v7, 0x1

    .line 917
    .line 918
    goto :goto_14

    .line 919
    :goto_16
    move-wide/from16 v2, v34

    .line 920
    .line 921
    :cond_1e
    add-int/lit8 v4, v4, 0x1

    .line 922
    .line 923
    goto/16 :goto_11

    .line 924
    .line 925
    :cond_1f
    aget-wide v2, v1, v30

    .line 926
    .line 927
    aget-wide v4, v0, v30

    .line 928
    .line 929
    add-double/2addr v2, v4

    .line 930
    div-double v2, v2, v28

    .line 931
    .line 932
    const/4 v14, 0x1

    .line 933
    aget-wide v4, v1, v14

    .line 934
    .line 935
    aget-wide v6, v0, v14

    .line 936
    .line 937
    add-double/2addr v4, v6

    .line 938
    div-double v4, v4, v28

    .line 939
    .line 940
    aget-wide v6, v1, v31

    .line 941
    .line 942
    aget-wide v8, v0, v31

    .line 943
    .line 944
    add-double/2addr v6, v8

    .line 945
    div-double v6, v6, v28

    .line 946
    .line 947
    const/4 v9, 0x3

    .line 948
    new-array v0, v9, [D

    .line 949
    .line 950
    aput-wide v2, v0, v30

    .line 951
    .line 952
    aput-wide v4, v0, v14

    .line 953
    .line 954
    aput-wide v6, v0, v31

    .line 955
    .line 956
    aget-wide v1, v0, v30

    .line 957
    .line 958
    invoke-static {v1, v2}, La80;->i(D)I

    .line 959
    .line 960
    .line 961
    move-result v1

    .line 962
    aget-wide v2, v0, v14

    .line 963
    .line 964
    invoke-static {v2, v3}, La80;->i(D)I

    .line 965
    .line 966
    .line 967
    move-result v2

    .line 968
    aget-wide v3, v0, v31

    .line 969
    .line 970
    invoke-static {v3, v4}, La80;->i(D)I

    .line 971
    .line 972
    .line 973
    move-result v0

    .line 974
    and-int/lit16 v1, v1, 0xff

    .line 975
    .line 976
    shl-int/lit8 v1, v1, 0x10

    .line 977
    .line 978
    or-int v1, v1, v23

    .line 979
    .line 980
    and-int/lit16 v2, v2, 0xff

    .line 981
    .line 982
    const/16 v12, 0x8

    .line 983
    .line 984
    shl-int/2addr v2, v12

    .line 985
    or-int/2addr v1, v2

    .line 986
    and-int/lit16 v0, v0, 0xff

    .line 987
    .line 988
    :goto_17
    or-int/2addr v1, v0

    .line 989
    goto :goto_19

    .line 990
    :goto_18
    invoke-static/range {p4 .. p5}, La80;->J(D)D

    .line 991
    .line 992
    .line 993
    move-result-wide v0

    .line 994
    invoke-static {v0, v1}, La80;->i(D)I

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    and-int/lit16 v0, v0, 0xff

    .line 999
    .line 1000
    shl-int/lit8 v1, v0, 0x10

    .line 1001
    .line 1002
    or-int v1, v1, v23

    .line 1003
    .line 1004
    shl-int/lit8 v2, v0, 0x8

    .line 1005
    .line 1006
    or-int/2addr v1, v2

    .line 1007
    goto :goto_17

    .line 1008
    :goto_19
    new-instance v0, Lmo;

    .line 1009
    .line 1010
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    iput v1, v0, Lmo;->b:I

    .line 1014
    .line 1015
    sget-object v2, Lfb0;->k:Lfb0;

    .line 1016
    .line 1017
    const/high16 v3, 0xff0000

    .line 1018
    .line 1019
    and-int/2addr v3, v1

    .line 1020
    shr-int/lit8 v3, v3, 0x10

    .line 1021
    .line 1022
    const v4, 0xff00

    .line 1023
    .line 1024
    .line 1025
    and-int/2addr v4, v1

    .line 1026
    const/16 v12, 0x8

    .line 1027
    .line 1028
    shr-int/2addr v4, v12

    .line 1029
    and-int/lit16 v5, v1, 0xff

    .line 1030
    .line 1031
    invoke-static {v3}, La80;->s(I)D

    .line 1032
    .line 1033
    .line 1034
    move-result-wide v6

    .line 1035
    invoke-static {v4}, La80;->s(I)D

    .line 1036
    .line 1037
    .line 1038
    move-result-wide v3

    .line 1039
    invoke-static {v5}, La80;->s(I)D

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v8

    .line 1043
    const-wide v10, 0x3fda63c2e8477c96L    # 0.41233895

    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    mul-double/2addr v10, v6

    .line 1049
    const-wide v15, 0x3fd6e341ae4b2c79L    # 0.35762064

    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    mul-double/2addr v15, v3

    .line 1055
    add-double/2addr v15, v10

    .line 1056
    const-wide v10, 0x3fc71af7273e5d5eL    # 0.18051042

    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    mul-double/2addr v10, v8

    .line 1062
    add-double/2addr v10, v15

    .line 1063
    const-wide v15, 0x3fcb367a0f9096bcL    # 0.2126

    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    mul-double/2addr v15, v6

    .line 1069
    const-wide v34, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    mul-double v34, v34, v3

    .line 1075
    .line 1076
    add-double v34, v34, v15

    .line 1077
    .line 1078
    const-wide v15, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    mul-double/2addr v15, v8

    .line 1084
    add-double v15, v15, v34

    .line 1085
    .line 1086
    const-wide v34, 0x3f93c8fde0401c25L    # 0.01932141

    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    mul-double v6, v6, v34

    .line 1092
    .line 1093
    const-wide v34, 0x3fbe818525c434ceL    # 0.11916382

    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    mul-double v3, v3, v34

    .line 1099
    .line 1100
    add-double/2addr v3, v6

    .line 1101
    const-wide v6, 0x3fee693974c0c730L    # 0.95034478

    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    mul-double/2addr v8, v6

    .line 1107
    add-double/2addr v8, v3

    .line 1108
    sget-object v3, La80;->a:[[D

    .line 1109
    .line 1110
    aget-object v4, v3, v30

    .line 1111
    .line 1112
    aget-wide v6, v4, v30

    .line 1113
    .line 1114
    mul-double/2addr v6, v10

    .line 1115
    const/4 v14, 0x1

    .line 1116
    aget-wide v34, v4, v14

    .line 1117
    .line 1118
    mul-double v34, v34, v15

    .line 1119
    .line 1120
    add-double v34, v34, v6

    .line 1121
    .line 1122
    aget-wide v6, v4, v31

    .line 1123
    .line 1124
    mul-double/2addr v6, v8

    .line 1125
    add-double v6, v6, v34

    .line 1126
    .line 1127
    aget-object v4, v3, v14

    .line 1128
    .line 1129
    aget-wide v34, v4, v30

    .line 1130
    .line 1131
    mul-double v34, v34, v10

    .line 1132
    .line 1133
    aget-wide v36, v4, v14

    .line 1134
    .line 1135
    mul-double v36, v36, v15

    .line 1136
    .line 1137
    add-double v36, v36, v34

    .line 1138
    .line 1139
    aget-wide v34, v4, v31

    .line 1140
    .line 1141
    mul-double v34, v34, v8

    .line 1142
    .line 1143
    add-double v34, v34, v36

    .line 1144
    .line 1145
    aget-object v3, v3, v31

    .line 1146
    .line 1147
    aget-wide v36, v3, v30

    .line 1148
    .line 1149
    mul-double v10, v10, v36

    .line 1150
    .line 1151
    aget-wide v36, v3, v14

    .line 1152
    .line 1153
    mul-double v15, v15, v36

    .line 1154
    .line 1155
    add-double/2addr v15, v10

    .line 1156
    aget-wide v10, v3, v31

    .line 1157
    .line 1158
    mul-double/2addr v8, v10

    .line 1159
    add-double/2addr v8, v15

    .line 1160
    iget-object v3, v2, Lfb0;->g:[D

    .line 1161
    .line 1162
    iget-wide v10, v2, Lfb0;->i:D

    .line 1163
    .line 1164
    iget-wide v12, v2, Lfb0;->d:D

    .line 1165
    .line 1166
    iget-wide v14, v2, Lfb0;->a:D

    .line 1167
    .line 1168
    aget-wide v36, v3, v30

    .line 1169
    .line 1170
    mul-double v36, v36, v6

    .line 1171
    .line 1172
    const/4 v4, 0x1

    .line 1173
    aget-wide v6, v3, v4

    .line 1174
    .line 1175
    mul-double v6, v6, v34

    .line 1176
    .line 1177
    aget-wide v34, v3, v31

    .line 1178
    .line 1179
    mul-double v34, v34, v8

    .line 1180
    .line 1181
    iget-wide v8, v2, Lfb0;->h:D

    .line 1182
    .line 1183
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->abs(D)D

    .line 1184
    .line 1185
    .line 1186
    move-result-wide v40

    .line 1187
    mul-double v40, v40, v8

    .line 1188
    .line 1189
    move v3, v5

    .line 1190
    div-double v4, v40, v26

    .line 1191
    .line 1192
    move-wide/from16 p0, v6

    .line 1193
    .line 1194
    const-wide v6, 0x3fdae147ae147ae1L    # 0.42

    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 1200
    .line 1201
    .line 1202
    move-result-wide v4

    .line 1203
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->abs(D)D

    .line 1204
    .line 1205
    .line 1206
    move-result-wide v40

    .line 1207
    mul-double v40, v40, v8

    .line 1208
    .line 1209
    move/from16 p2, v3

    .line 1210
    .line 1211
    move-wide/from16 v42, v4

    .line 1212
    .line 1213
    div-double v3, v40, v26

    .line 1214
    .line 1215
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 1216
    .line 1217
    .line 1218
    move-result-wide v3

    .line 1219
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->abs(D)D

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v40

    .line 1223
    mul-double v40, v40, v8

    .line 1224
    .line 1225
    div-double v8, v40, v26

    .line 1226
    .line 1227
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v5

    .line 1231
    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->signum(D)D

    .line 1232
    .line 1233
    .line 1234
    move-result-wide v7

    .line 1235
    const-wide/high16 v36, 0x4079000000000000L    # 400.0

    .line 1236
    .line 1237
    mul-double v7, v7, v36

    .line 1238
    .line 1239
    mul-double v7, v7, v42

    .line 1240
    .line 1241
    const-wide v40, 0x403b2147ae147ae1L    # 27.13

    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    add-double v42, v42, v40

    .line 1247
    .line 1248
    div-double v7, v7, v42

    .line 1249
    .line 1250
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->signum(D)D

    .line 1251
    .line 1252
    .line 1253
    move-result-wide v42

    .line 1254
    mul-double v42, v42, v36

    .line 1255
    .line 1256
    mul-double v42, v42, v3

    .line 1257
    .line 1258
    add-double v3, v3, v40

    .line 1259
    .line 1260
    div-double v42, v42, v3

    .line 1261
    .line 1262
    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->signum(D)D

    .line 1263
    .line 1264
    .line 1265
    move-result-wide v3

    .line 1266
    mul-double v3, v3, v36

    .line 1267
    .line 1268
    mul-double/2addr v3, v5

    .line 1269
    add-double v5, v5, v40

    .line 1270
    .line 1271
    div-double/2addr v3, v5

    .line 1272
    mul-double v5, v7, v19

    .line 1273
    .line 1274
    const-wide/high16 v34, -0x3fd8000000000000L    # -12.0

    .line 1275
    .line 1276
    mul-double v34, v34, v42

    .line 1277
    .line 1278
    add-double v34, v34, v5

    .line 1279
    .line 1280
    add-double v34, v34, v3

    .line 1281
    .line 1282
    div-double v5, v34, v19

    .line 1283
    .line 1284
    add-double v19, v7, v42

    .line 1285
    .line 1286
    mul-double v34, v3, v28

    .line 1287
    .line 1288
    sub-double v19, v19, v34

    .line 1289
    .line 1290
    const-wide/high16 v34, 0x4022000000000000L    # 9.0

    .line 1291
    .line 1292
    move-wide/from16 p0, v3

    .line 1293
    .line 1294
    div-double v3, v19, v34

    .line 1295
    .line 1296
    const-wide/high16 v19, 0x4034000000000000L    # 20.0

    .line 1297
    .line 1298
    mul-double v34, v7, v19

    .line 1299
    .line 1300
    mul-double v42, v42, v19

    .line 1301
    .line 1302
    add-double v34, v34, v42

    .line 1303
    .line 1304
    const-wide/high16 v36, 0x4035000000000000L    # 21.0

    .line 1305
    .line 1306
    mul-double v36, v36, p0

    .line 1307
    .line 1308
    add-double v36, v36, v34

    .line 1309
    .line 1310
    div-double v36, v36, v19

    .line 1311
    .line 1312
    const-wide/high16 v34, 0x4044000000000000L    # 40.0

    .line 1313
    .line 1314
    mul-double v7, v7, v34

    .line 1315
    .line 1316
    add-double v7, v7, v42

    .line 1317
    .line 1318
    add-double v7, v7, p0

    .line 1319
    .line 1320
    div-double v7, v7, v19

    .line 1321
    .line 1322
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 1323
    .line 1324
    .line 1325
    move-result-wide v19

    .line 1326
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->toDegrees(D)D

    .line 1327
    .line 1328
    .line 1329
    move-result-wide v19

    .line 1330
    cmpg-double v9, v19, v32

    .line 1331
    .line 1332
    if-gez v9, :cond_20

    .line 1333
    .line 1334
    add-double v19, v19, v21

    .line 1335
    .line 1336
    goto :goto_1a

    .line 1337
    :cond_20
    cmpl-double v9, v19, v21

    .line 1338
    .line 1339
    if-ltz v9, :cond_21

    .line 1340
    .line 1341
    sub-double v19, v19, v21

    .line 1342
    .line 1343
    :cond_21
    :goto_1a
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->toRadians(D)D

    .line 1344
    .line 1345
    .line 1346
    move-result-wide v32

    .line 1347
    move-wide/from16 p0, v7

    .line 1348
    .line 1349
    iget-wide v7, v2, Lfb0;->b:D

    .line 1350
    .line 1351
    mul-double v7, v7, p0

    .line 1352
    .line 1353
    div-double/2addr v7, v14

    .line 1354
    move-wide/from16 v34, v10

    .line 1355
    .line 1356
    iget-wide v9, v2, Lfb0;->j:D

    .line 1357
    .line 1358
    mul-double/2addr v9, v12

    .line 1359
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 1360
    .line 1361
    .line 1362
    move-result-wide v7

    .line 1363
    mul-double v7, v7, v26

    .line 1364
    .line 1365
    div-double v7, v7, v26

    .line 1366
    .line 1367
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 1368
    .line 1369
    .line 1370
    const-wide/high16 v9, 0x4010000000000000L    # 4.0

    .line 1371
    .line 1372
    add-double/2addr v14, v9

    .line 1373
    const-wide v9, 0x403423d70a3d70a4L    # 20.14

    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    cmpg-double v9, v19, v9

    .line 1379
    .line 1380
    if-gez v9, :cond_22

    .line 1381
    .line 1382
    add-double v19, v19, v21

    .line 1383
    .line 1384
    :cond_22
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->toRadians(D)D

    .line 1385
    .line 1386
    .line 1387
    move-result-wide v9

    .line 1388
    add-double v9, v9, v28

    .line 1389
    .line 1390
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    .line 1391
    .line 1392
    .line 1393
    move-result-wide v9

    .line 1394
    add-double v9, v9, v44

    .line 1395
    .line 1396
    mul-double v9, v9, v48

    .line 1397
    .line 1398
    mul-double v9, v9, v38

    .line 1399
    .line 1400
    move-wide/from16 p0, v7

    .line 1401
    .line 1402
    iget-wide v7, v2, Lfb0;->e:D

    .line 1403
    .line 1404
    mul-double/2addr v9, v7

    .line 1405
    iget-wide v7, v2, Lfb0;->c:D

    .line 1406
    .line 1407
    mul-double/2addr v9, v7

    .line 1408
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    .line 1409
    .line 1410
    .line 1411
    move-result-wide v3

    .line 1412
    mul-double/2addr v3, v9

    .line 1413
    add-double v36, v36, v24

    .line 1414
    .line 1415
    div-double v3, v3, v36

    .line 1416
    .line 1417
    iget-wide v5, v2, Lfb0;->f:D

    .line 1418
    .line 1419
    const-wide v7, 0x3fd28f5c28f5c28fL    # 0.29

    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 1425
    .line 1426
    .line 1427
    move-result-wide v5

    .line 1428
    sub-double v5, v17, v5

    .line 1429
    .line 1430
    const-wide v7, 0x3fe75c28f5c28f5cL    # 0.73

    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 1436
    .line 1437
    .line 1438
    move-result-wide v5

    .line 1439
    const-wide v7, 0x3feccccccccccccdL    # 0.9

    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 1445
    .line 1446
    .line 1447
    move-result-wide v2

    .line 1448
    mul-double/2addr v2, v5

    .line 1449
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->sqrt(D)D

    .line 1450
    .line 1451
    .line 1452
    move-result-wide v4

    .line 1453
    mul-double/2addr v4, v2

    .line 1454
    mul-double v10, v4, v34

    .line 1455
    .line 1456
    mul-double/2addr v2, v12

    .line 1457
    div-double/2addr v2, v14

    .line 1458
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 1459
    .line 1460
    .line 1461
    const-wide v2, 0x3f9758e219652bd4L    # 0.0228

    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    mul-double/2addr v10, v2

    .line 1467
    invoke-static {v10, v11}, Ljava/lang/Math;->log1p(D)D

    .line 1468
    .line 1469
    .line 1470
    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->cos(D)D

    .line 1471
    .line 1472
    .line 1473
    invoke-static/range {v32 .. v33}, Ljava/lang/Math;->sin(D)D

    .line 1474
    .line 1475
    .line 1476
    iput-wide v4, v0, Lmo;->a:D

    .line 1477
    .line 1478
    shr-int/lit8 v2, v1, 0x10

    .line 1479
    .line 1480
    and-int/lit16 v2, v2, 0xff

    .line 1481
    .line 1482
    invoke-static {v2}, La80;->s(I)D

    .line 1483
    .line 1484
    .line 1485
    move-result-wide v2

    .line 1486
    const/16 v12, 0x8

    .line 1487
    .line 1488
    shr-int/2addr v1, v12

    .line 1489
    and-int/lit16 v1, v1, 0xff

    .line 1490
    .line 1491
    invoke-static {v1}, La80;->s(I)D

    .line 1492
    .line 1493
    .line 1494
    move-result-wide v4

    .line 1495
    invoke-static/range {p2 .. p2}, La80;->s(I)D

    .line 1496
    .line 1497
    .line 1498
    move-result-wide v6

    .line 1499
    const/4 v12, 0x3

    .line 1500
    new-array v1, v12, [D

    .line 1501
    .line 1502
    aput-wide v2, v1, v30

    .line 1503
    .line 1504
    const/4 v14, 0x1

    .line 1505
    aput-wide v4, v1, v14

    .line 1506
    .line 1507
    aput-wide v6, v1, v31

    .line 1508
    .line 1509
    sget-object v2, La80;->b:[[D

    .line 1510
    .line 1511
    invoke-static {v1, v2}, Lzt;->F([D[[D)[D

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    aget-wide v2, v1, v14

    .line 1516
    .line 1517
    div-double v2, v2, v26

    .line 1518
    .line 1519
    const-wide v4, 0x3f822354d28f7cd6L    # 0.008856451679035631

    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    cmpl-double v1, v2, v4

    .line 1525
    .line 1526
    if-lez v1, :cond_23

    .line 1527
    .line 1528
    const-wide v4, 0x3fd5555555555555L    # 0.3333333333333333

    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 1534
    .line 1535
    .line 1536
    :cond_23
    return-object v0

    .line 1537
    :array_0
    .array-data 8
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
    .end array-data

    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    :array_1
    .array-data 8
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
    .end array-data

    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    :array_2
    .array-data 8
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
    .end array-data
.end method
