.class public final Lsh/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/n0;


# static fields
.field public static final a:Lsh/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsh/r;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsh/r;->a:Lsh/r;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final h(Lv1/p0;Ljava/util/List;J)Lv1/o0;
    .locals 37

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    invoke-interface {v0, v1}, Lu2/c;->G0(F)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    move-object v5, v3

    .line 25
    check-cast v5, Lv1/m0;

    .line 26
    .line 27
    invoke-static {v5}, Lv1/w;->i(Lv1/m0;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v6, "start"

    .line 32
    .line 33
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x0

    .line 41
    :goto_0
    check-cast v3, Lv1/m0;

    .line 42
    .line 43
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_3e

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, Lv1/m0;

    .line 58
    .line 59
    invoke-static {v5}, Lv1/w;->i(Lv1/m0;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v7, "center"

    .line 64
    .line 65
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_4

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    move-object v7, v6

    .line 86
    check-cast v7, Lv1/m0;

    .line 87
    .line 88
    invoke-static {v7}, Lv1/w;->i(Lv1/m0;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    const-string v8, "end"

    .line 93
    .line 94
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    const/4 v6, 0x0

    .line 102
    :goto_1
    check-cast v6, Lv1/m0;

    .line 103
    .line 104
    invoke-static/range {p3 .. p4}, Lu2/a;->h(J)I

    .line 105
    .line 106
    .line 107
    move-result v16

    .line 108
    invoke-static/range {p3 .. p4}, Lu2/a;->g(J)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    const/4 v9, 0x1

    .line 115
    goto :goto_2

    .line 116
    :cond_5
    const/4 v9, 0x0

    .line 117
    :goto_2
    if-eqz v6, :cond_6

    .line 118
    .line 119
    const/4 v10, 0x1

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    const/4 v10, 0x0

    .line 122
    :goto_3
    if-eqz v9, :cond_7

    .line 123
    .line 124
    move v14, v1

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    const/4 v14, 0x0

    .line 127
    :goto_4
    if-eqz v10, :cond_8

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_8
    const/4 v1, 0x0

    .line 131
    :goto_5
    sub-int v11, v16, v14

    .line 132
    .line 133
    sub-int/2addr v11, v1

    .line 134
    if-gez v11, :cond_9

    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    :cond_9
    if-eqz v3, :cond_a

    .line 138
    .line 139
    invoke-interface {v3, v2}, Lv1/m0;->M(I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    goto :goto_6

    .line 144
    :cond_a
    const/4 v1, 0x0

    .line 145
    :goto_6
    invoke-interface {v5, v2}, Lv1/m0;->M(I)I

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v6, :cond_b

    .line 150
    .line 151
    invoke-interface {v6, v2}, Lv1/m0;->M(I)I

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    goto :goto_7

    .line 156
    :cond_b
    const/4 v13, 0x0

    .line 157
    :goto_7
    add-int v15, v1, v12

    .line 158
    .line 159
    add-int/2addr v15, v13

    .line 160
    if-gt v15, v11, :cond_d

    .line 161
    .line 162
    sub-int/2addr v11, v1

    .line 163
    sub-int/2addr v11, v13

    .line 164
    if-gez v11, :cond_c

    .line 165
    .line 166
    const/4 v11, 0x0

    .line 167
    :cond_c
    move v7, v1

    .line 168
    move-object/from16 v22, v5

    .line 169
    .line 170
    move-object/from16 v24, v6

    .line 171
    .line 172
    :goto_8
    move/from16 v28, v11

    .line 173
    .line 174
    :goto_9
    move/from16 v32, v13

    .line 175
    .line 176
    goto/16 :goto_24

    .line 177
    .line 178
    :cond_d
    if-eqz v3, :cond_e

    .line 179
    .line 180
    invoke-interface {v3, v2}, Lv1/m0;->G(I)I

    .line 181
    .line 182
    .line 183
    move-result v17

    .line 184
    goto :goto_a

    .line 185
    :cond_e
    const/16 v17, 0x0

    .line 186
    .line 187
    :goto_a
    invoke-interface {v5, v2}, Lv1/m0;->G(I)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v6, :cond_f

    .line 192
    .line 193
    invoke-interface {v6, v2}, Lv1/m0;->G(I)I

    .line 194
    .line 195
    .line 196
    move-result v18

    .line 197
    move/from16 v8, v18

    .line 198
    .line 199
    goto :goto_b

    .line 200
    :cond_f
    const/4 v8, 0x0

    .line 201
    :goto_b
    if-eqz v9, :cond_10

    .line 202
    .line 203
    const/4 v7, 0x2

    .line 204
    :goto_c
    move/from16 v20, v9

    .line 205
    .line 206
    goto :goto_d

    .line 207
    :cond_10
    const/4 v7, 0x0

    .line 208
    goto :goto_c

    .line 209
    :goto_d
    if-eqz v10, :cond_11

    .line 210
    .line 211
    const/4 v9, 0x3

    .line 212
    goto :goto_e

    .line 213
    :cond_11
    const/4 v9, 0x0

    .line 214
    :goto_e
    add-int/lit8 v22, v7, 0x5

    .line 215
    .line 216
    move/from16 v23, v10

    .line 217
    .line 218
    add-int v10, v22, v9

    .line 219
    .line 220
    if-lez v10, :cond_29

    .line 221
    .line 222
    move-object/from16 v22, v5

    .line 223
    .line 224
    move-object/from16 v24, v6

    .line 225
    .line 226
    int-to-long v5, v11

    .line 227
    move-wide/from16 v25, v5

    .line 228
    .line 229
    int-to-long v5, v7

    .line 230
    mul-long v5, v5, v25

    .line 231
    .line 232
    move-wide/from16 v27, v5

    .line 233
    .line 234
    int-to-long v5, v10

    .line 235
    move-wide/from16 v29, v5

    .line 236
    .line 237
    div-long v5, v27, v29

    .line 238
    .line 239
    long-to-int v5, v5

    .line 240
    const/4 v6, 0x5

    .line 241
    int-to-long v6, v6

    .line 242
    mul-long v6, v6, v25

    .line 243
    .line 244
    div-long v6, v6, v29

    .line 245
    .line 246
    long-to-int v6, v6

    .line 247
    int-to-long v9, v9

    .line 248
    mul-long v9, v9, v25

    .line 249
    .line 250
    div-long v9, v9, v29

    .line 251
    .line 252
    long-to-int v7, v9

    .line 253
    if-eqz v20, :cond_12

    .line 254
    .line 255
    if-le v1, v5, :cond_12

    .line 256
    .line 257
    const/4 v9, 0x1

    .line 258
    goto :goto_f

    .line 259
    :cond_12
    const/4 v9, 0x0

    .line 260
    :goto_f
    if-le v12, v6, :cond_13

    .line 261
    .line 262
    const/4 v10, 0x1

    .line 263
    goto :goto_10

    .line 264
    :cond_13
    const/4 v10, 0x0

    .line 265
    :goto_10
    if-eqz v23, :cond_14

    .line 266
    .line 267
    if-le v13, v7, :cond_14

    .line 268
    .line 269
    const/16 v20, 0x1

    .line 270
    .line 271
    goto :goto_11

    .line 272
    :cond_14
    const/16 v20, 0x0

    .line 273
    .line 274
    :goto_11
    add-int v23, v9, v10

    .line 275
    .line 276
    move/from16 v25, v5

    .line 277
    .line 278
    add-int v5, v23, v20

    .line 279
    .line 280
    move/from16 v23, v6

    .line 281
    .line 282
    const/4 v6, 0x1

    .line 283
    if-eq v5, v6, :cond_22

    .line 284
    .line 285
    const/4 v6, 0x2

    .line 286
    if-eq v5, v6, :cond_17

    .line 287
    .line 288
    const/4 v6, 0x3

    .line 289
    if-eq v5, v6, :cond_15

    .line 290
    .line 291
    if-ge v15, v11, :cond_2a

    .line 292
    .line 293
    sub-int v5, v11, v15

    .line 294
    .line 295
    add-int/2addr v12, v5

    .line 296
    goto/16 :goto_1e

    .line 297
    .line 298
    :cond_15
    add-int v5, v25, v23

    .line 299
    .line 300
    add-int/2addr v5, v7

    .line 301
    if-ge v5, v11, :cond_16

    .line 302
    .line 303
    sub-int v1, v11, v5

    .line 304
    .line 305
    add-int v12, v1, v23

    .line 306
    .line 307
    move v13, v7

    .line 308
    :goto_12
    move/from16 v1, v25

    .line 309
    .line 310
    goto/16 :goto_1e

    .line 311
    .line 312
    :cond_16
    move v13, v7

    .line 313
    move/from16 v12, v23

    .line 314
    .line 315
    goto :goto_12

    .line 316
    :cond_17
    if-nez v9, :cond_18

    .line 317
    .line 318
    sub-int v5, v11, v1

    .line 319
    .line 320
    move v6, v1

    .line 321
    goto :goto_13

    .line 322
    :cond_18
    move v5, v11

    .line 323
    const/4 v6, 0x0

    .line 324
    :goto_13
    if-nez v10, :cond_19

    .line 325
    .line 326
    sub-int/2addr v5, v12

    .line 327
    move v7, v12

    .line 328
    goto :goto_14

    .line 329
    :cond_19
    const/4 v7, 0x0

    .line 330
    :goto_14
    if-nez v20, :cond_1a

    .line 331
    .line 332
    sub-int/2addr v5, v13

    .line 333
    move v15, v13

    .line 334
    goto :goto_15

    .line 335
    :cond_1a
    const/4 v15, 0x0

    .line 336
    :goto_15
    if-eqz v9, :cond_1b

    .line 337
    .line 338
    move/from16 v18, v1

    .line 339
    .line 340
    goto :goto_16

    .line 341
    :cond_1b
    const/16 v18, 0x0

    .line 342
    .line 343
    :goto_16
    if-eqz v10, :cond_1c

    .line 344
    .line 345
    move/from16 v19, v12

    .line 346
    .line 347
    goto :goto_17

    .line 348
    :cond_1c
    const/16 v19, 0x0

    .line 349
    .line 350
    :goto_17
    add-int v18, v18, v19

    .line 351
    .line 352
    if-eqz v20, :cond_1d

    .line 353
    .line 354
    move/from16 v19, v13

    .line 355
    .line 356
    :goto_18
    move/from16 v21, v6

    .line 357
    .line 358
    goto :goto_19

    .line 359
    :cond_1d
    const/16 v19, 0x0

    .line 360
    .line 361
    goto :goto_18

    .line 362
    :goto_19
    add-int v6, v18, v19

    .line 363
    .line 364
    if-lez v6, :cond_21

    .line 365
    .line 366
    move/from16 v18, v10

    .line 367
    .line 368
    if-eqz v9, :cond_1e

    .line 369
    .line 370
    int-to-long v9, v5

    .line 371
    move-wide/from16 v25, v9

    .line 372
    .line 373
    int-to-long v9, v1

    .line 374
    mul-long v9, v9, v25

    .line 375
    .line 376
    move-wide/from16 v25, v9

    .line 377
    .line 378
    int-to-long v9, v6

    .line 379
    div-long v9, v25, v9

    .line 380
    .line 381
    long-to-int v1, v9

    .line 382
    goto :goto_1a

    .line 383
    :cond_1e
    move/from16 v1, v21

    .line 384
    .line 385
    :goto_1a
    if-eqz v18, :cond_1f

    .line 386
    .line 387
    int-to-long v9, v5

    .line 388
    move-wide/from16 v18, v9

    .line 389
    .line 390
    int-to-long v9, v12

    .line 391
    mul-long v9, v9, v18

    .line 392
    .line 393
    move-wide/from16 v18, v9

    .line 394
    .line 395
    int-to-long v9, v6

    .line 396
    div-long v9, v18, v9

    .line 397
    .line 398
    long-to-int v7, v9

    .line 399
    :cond_1f
    move v12, v7

    .line 400
    if-eqz v20, :cond_20

    .line 401
    .line 402
    int-to-long v9, v5

    .line 403
    move-wide/from16 v18, v9

    .line 404
    .line 405
    int-to-long v9, v13

    .line 406
    mul-long v9, v9, v18

    .line 407
    .line 408
    int-to-long v5, v6

    .line 409
    div-long/2addr v9, v5

    .line 410
    long-to-int v13, v9

    .line 411
    goto :goto_1e

    .line 412
    :cond_20
    move v13, v15

    .line 413
    goto :goto_1e

    .line 414
    :cond_21
    move v12, v7

    .line 415
    move v13, v15

    .line 416
    move/from16 v1, v21

    .line 417
    .line 418
    goto :goto_1e

    .line 419
    :cond_22
    move/from16 v18, v10

    .line 420
    .line 421
    if-nez v9, :cond_23

    .line 422
    .line 423
    sub-int v5, v11, v1

    .line 424
    .line 425
    goto :goto_1b

    .line 426
    :cond_23
    move v5, v11

    .line 427
    const/4 v1, 0x0

    .line 428
    :goto_1b
    if-nez v18, :cond_24

    .line 429
    .line 430
    sub-int/2addr v5, v12

    .line 431
    goto :goto_1c

    .line 432
    :cond_24
    const/4 v12, 0x0

    .line 433
    :goto_1c
    if-nez v20, :cond_25

    .line 434
    .line 435
    sub-int/2addr v5, v13

    .line 436
    move/from16 v36, v13

    .line 437
    .line 438
    move v13, v5

    .line 439
    move/from16 v5, v36

    .line 440
    .line 441
    goto :goto_1d

    .line 442
    :cond_25
    move v13, v5

    .line 443
    const/4 v5, 0x0

    .line 444
    :goto_1d
    if-eqz v9, :cond_26

    .line 445
    .line 446
    move v1, v13

    .line 447
    :cond_26
    if-eqz v18, :cond_27

    .line 448
    .line 449
    move v12, v13

    .line 450
    :cond_27
    if-eqz v20, :cond_28

    .line 451
    .line 452
    goto :goto_1e

    .line 453
    :cond_28
    move v13, v5

    .line 454
    goto :goto_1e

    .line 455
    :cond_29
    move-object/from16 v22, v5

    .line 456
    .line 457
    move-object/from16 v24, v6

    .line 458
    .line 459
    move v12, v11

    .line 460
    const/4 v1, 0x0

    .line 461
    const/4 v13, 0x0

    .line 462
    :cond_2a
    :goto_1e
    add-int/lit8 v5, v12, 0x1

    .line 463
    .line 464
    if-gt v5, v4, :cond_30

    .line 465
    .line 466
    if-gt v4, v11, :cond_30

    .line 467
    .line 468
    sub-int v5, v4, v12

    .line 469
    .line 470
    sub-int v6, v1, v17

    .line 471
    .line 472
    if-gez v6, :cond_2b

    .line 473
    .line 474
    const/4 v6, 0x0

    .line 475
    :cond_2b
    sub-int v7, v13, v8

    .line 476
    .line 477
    if-gez v7, :cond_2c

    .line 478
    .line 479
    const/4 v7, 0x0

    .line 480
    :cond_2c
    add-int v9, v6, v7

    .line 481
    .line 482
    if-lez v9, :cond_30

    .line 483
    .line 484
    move v10, v12

    .line 485
    move v15, v13

    .line 486
    int-to-long v12, v5

    .line 487
    move/from16 v18, v4

    .line 488
    .line 489
    move/from16 v19, v5

    .line 490
    .line 491
    int-to-long v4, v6

    .line 492
    mul-long/2addr v12, v4

    .line 493
    int-to-long v4, v9

    .line 494
    div-long/2addr v12, v4

    .line 495
    long-to-int v4, v12

    .line 496
    if-le v4, v6, :cond_2d

    .line 497
    .line 498
    goto :goto_1f

    .line 499
    :cond_2d
    move v6, v4

    .line 500
    :goto_1f
    sub-int v5, v19, v6

    .line 501
    .line 502
    if-gez v5, :cond_2e

    .line 503
    .line 504
    const/4 v5, 0x0

    .line 505
    :cond_2e
    if-le v5, v7, :cond_2f

    .line 506
    .line 507
    goto :goto_20

    .line 508
    :cond_2f
    move v7, v5

    .line 509
    :goto_20
    sub-int/2addr v1, v6

    .line 510
    sub-int v13, v15, v7

    .line 511
    .line 512
    add-int/2addr v6, v7

    .line 513
    add-int/2addr v6, v10

    .line 514
    goto :goto_21

    .line 515
    :cond_30
    move/from16 v18, v4

    .line 516
    .line 517
    move v10, v12

    .line 518
    move v15, v13

    .line 519
    move v6, v10

    .line 520
    move v13, v15

    .line 521
    :goto_21
    add-int/lit8 v4, v13, 0x1

    .line 522
    .line 523
    if-gt v4, v8, :cond_36

    .line 524
    .line 525
    if-gt v8, v11, :cond_36

    .line 526
    .line 527
    sub-int/2addr v8, v13

    .line 528
    sub-int v4, v1, v17

    .line 529
    .line 530
    if-gez v4, :cond_31

    .line 531
    .line 532
    const/4 v4, 0x0

    .line 533
    :cond_31
    sub-int v5, v6, v18

    .line 534
    .line 535
    if-gez v5, :cond_32

    .line 536
    .line 537
    const/4 v5, 0x0

    .line 538
    :cond_32
    add-int v7, v4, v5

    .line 539
    .line 540
    if-lez v7, :cond_36

    .line 541
    .line 542
    int-to-long v9, v8

    .line 543
    int-to-long v11, v4

    .line 544
    mul-long/2addr v9, v11

    .line 545
    int-to-long v11, v7

    .line 546
    div-long/2addr v9, v11

    .line 547
    long-to-int v7, v9

    .line 548
    if-le v7, v4, :cond_33

    .line 549
    .line 550
    goto :goto_22

    .line 551
    :cond_33
    move v4, v7

    .line 552
    :goto_22
    sub-int/2addr v8, v4

    .line 553
    if-gez v8, :cond_34

    .line 554
    .line 555
    const/4 v8, 0x0

    .line 556
    :cond_34
    if-le v8, v5, :cond_35

    .line 557
    .line 558
    goto :goto_23

    .line 559
    :cond_35
    move v5, v8

    .line 560
    :goto_23
    sub-int/2addr v1, v4

    .line 561
    sub-int v11, v6, v5

    .line 562
    .line 563
    add-int/2addr v4, v5

    .line 564
    add-int/2addr v13, v4

    .line 565
    move v7, v1

    .line 566
    goto/16 :goto_8

    .line 567
    .line 568
    :cond_36
    move v7, v1

    .line 569
    move/from16 v28, v6

    .line 570
    .line 571
    goto/16 :goto_9

    .line 572
    .line 573
    :goto_24
    if-eqz v3, :cond_37

    .line 574
    .line 575
    const/4 v9, 0x0

    .line 576
    const/16 v10, 0xc

    .line 577
    .line 578
    const/4 v6, 0x0

    .line 579
    const/4 v8, 0x0

    .line 580
    move-wide/from16 v4, p3

    .line 581
    .line 582
    invoke-static/range {v4 .. v10}, Lu2/a;->a(JIIIII)J

    .line 583
    .line 584
    .line 585
    move-result-wide v6

    .line 586
    invoke-interface {v3, v6, v7}, Lv1/m0;->Q(J)Lv1/b1;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    move-object v12, v1

    .line 591
    goto :goto_25

    .line 592
    :cond_37
    const/4 v12, 0x0

    .line 593
    :goto_25
    if-eqz v12, :cond_38

    .line 594
    .line 595
    iget v1, v12, Lv1/b1;->g:I

    .line 596
    .line 597
    move v13, v1

    .line 598
    goto :goto_26

    .line 599
    :cond_38
    const/4 v13, 0x0

    .line 600
    :goto_26
    if-eqz v12, :cond_39

    .line 601
    .line 602
    iget v1, v12, Lv1/b1;->h:I

    .line 603
    .line 604
    move v9, v1

    .line 605
    goto :goto_27

    .line 606
    :cond_39
    const/4 v9, 0x0

    .line 607
    :goto_27
    const/16 v30, 0x0

    .line 608
    .line 609
    const/16 v31, 0xc

    .line 610
    .line 611
    const/16 v27, 0x0

    .line 612
    .line 613
    const/16 v29, 0x0

    .line 614
    .line 615
    move-wide/from16 v25, p3

    .line 616
    .line 617
    invoke-static/range {v25 .. v31}, Lu2/a;->a(JIIIII)J

    .line 618
    .line 619
    .line 620
    move-result-wide v3

    .line 621
    move-object/from16 v5, v22

    .line 622
    .line 623
    invoke-interface {v5, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 624
    .line 625
    .line 626
    move-result-object v10

    .line 627
    if-eqz v24, :cond_3a

    .line 628
    .line 629
    const/16 v34, 0x0

    .line 630
    .line 631
    const/16 v35, 0xc

    .line 632
    .line 633
    const/16 v31, 0x0

    .line 634
    .line 635
    const/16 v33, 0x0

    .line 636
    .line 637
    move-wide/from16 v29, p3

    .line 638
    .line 639
    invoke-static/range {v29 .. v35}, Lu2/a;->a(JIIIII)J

    .line 640
    .line 641
    .line 642
    move-result-wide v3

    .line 643
    move-object/from16 v6, v24

    .line 644
    .line 645
    invoke-interface {v6, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    move-object v15, v1

    .line 650
    goto :goto_28

    .line 651
    :cond_3a
    const/4 v15, 0x0

    .line 652
    :goto_28
    if-eqz v15, :cond_3b

    .line 653
    .line 654
    iget v8, v15, Lv1/b1;->h:I

    .line 655
    .line 656
    move v11, v8

    .line 657
    goto :goto_29

    .line 658
    :cond_3b
    const/4 v11, 0x0

    .line 659
    :goto_29
    iget v1, v10, Lv1/b1;->h:I

    .line 660
    .line 661
    invoke-static {v1, v11}, Ljava/lang/Math;->max(II)I

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    .line 666
    .line 667
    .line 668
    move-result v8

    .line 669
    invoke-static/range {p3 .. p4}, Lu2/a;->i(J)I

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    const v4, 0x7fffffff

    .line 678
    .line 679
    .line 680
    if-eq v2, v4, :cond_3c

    .line 681
    .line 682
    move-object v4, v3

    .line 683
    goto :goto_2a

    .line 684
    :cond_3c
    const/4 v4, 0x0

    .line 685
    :goto_2a
    if-eqz v4, :cond_3d

    .line 686
    .line 687
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    goto :goto_2b

    .line 692
    :cond_3d
    move v2, v8

    .line 693
    :goto_2b
    invoke-static {v8, v1, v2}, Lr9/e0;->r(III)I

    .line 694
    .line 695
    .line 696
    move-result v1

    .line 697
    new-instance v7, Lsh/q;

    .line 698
    .line 699
    invoke-direct/range {v7 .. v16}, Lsh/q;-><init>(IILv1/b1;ILv1/b1;IILv1/b1;I)V

    .line 700
    .line 701
    .line 702
    move/from16 v2, v16

    .line 703
    .line 704
    sget-object v3, Ltf/u;->g:Ltf/u;

    .line 705
    .line 706
    invoke-interface {v0, v2, v1, v3, v7}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    return-object v0

    .line 711
    :cond_3e
    const-string v0, "Collection contains no element matching the predicate."

    .line 712
    .line 713
    invoke-static {v0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    const/4 v0, 0x0

    .line 717
    return-object v0
.end method
