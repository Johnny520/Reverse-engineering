.class public final Lc7/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final g:Li7/f;

.field public final h:[Lc7/b;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Li7/f;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iput v2, v0, Lc7/a;->i:I

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lc7/a;->g:Li7/f;

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ld7/i;

    .line 20
    .line 21
    sget-object v3, Lc7/g;->m:Lc7/g;

    .line 22
    .line 23
    const/16 v4, 0x16

    .line 24
    .line 25
    invoke-direct {v2, v4, v3}, Ld7/t;-><init>(ILc7/g;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Li7/f;->a()[B

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    array-length v5, v3

    .line 33
    sub-int/2addr v5, v4

    .line 34
    :goto_0
    const/4 v6, 0x0

    .line 35
    if-ltz v5, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v3, v5, v6, v4}, Ld7/s;->P([BIII)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ld7/t;->U()Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v5, v5, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    invoke-virtual {v2}, Ld7/t;->U()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1e

    .line 55
    .line 56
    iget-object v4, v2, Lr7/b;->k:[B

    .line 57
    .line 58
    const/16 v7, 0x10

    .line 59
    .line 60
    invoke-static {v4, v7}, Lk7/a;->s([BI)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    const/4 v8, -0x1

    .line 65
    if-ne v4, v8, :cond_5

    .line 66
    .line 67
    new-instance v4, Ld7/h;

    .line 68
    .line 69
    sget-object v8, Lc7/g;->l:Lc7/g;

    .line 70
    .line 71
    const/4 v9, 0x1

    .line 72
    const/16 v10, 0x14

    .line 73
    .line 74
    invoke-direct {v4, v10, v8, v9}, Ld7/h;-><init>(ILc7/g;I)V

    .line 75
    .line 76
    .line 77
    sub-int/2addr v5, v10

    .line 78
    :goto_2
    if-ltz v5, :cond_3

    .line 79
    .line 80
    invoke-virtual {v4, v3, v5, v6, v10}, Ld7/s;->P([BIII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ld7/t;->U()Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-eqz v8, :cond_2

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_2
    add-int/lit8 v5, v5, -0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    :goto_3
    invoke-virtual {v4}, Ld7/t;->U()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    iput-object v4, v2, Ld7/i;->o:Ld7/h;

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    new-instance v1, Lc7/c;

    .line 103
    .line 104
    const-string v2, "Failed to find zip64 locator"

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    :cond_5
    :goto_4
    iget-object v3, v2, Ld7/i;->o:Ld7/h;

    .line 111
    .line 112
    const/16 v5, 0x8

    .line 113
    .line 114
    if-nez v3, :cond_6

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    new-instance v8, Ld7/h;

    .line 118
    .line 119
    sget-object v9, Lc7/g;->k:Lc7/g;

    .line 120
    .line 121
    const/4 v10, 0x2

    .line 122
    const/16 v11, 0x38

    .line 123
    .line 124
    invoke-direct {v8, v11, v9, v10}, Ld7/h;-><init>(ILc7/g;I)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v3, Lr7/b;->k:[B

    .line 128
    .line 129
    invoke-static {v3, v5}, Lk7/a;->t([BI)J

    .line 130
    .line 131
    .line 132
    move-result-wide v10

    .line 133
    const-wide/16 v12, 0x38

    .line 134
    .line 135
    invoke-virtual {v1, v10, v11, v12, v13}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-virtual {v8, v3}, Ld7/t;->S(Ljava/io/InputStream;)I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Ld7/t;->U()Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_1c

    .line 147
    .line 148
    iput-object v8, v2, Ld7/i;->p:Ld7/h;

    .line 149
    .line 150
    :goto_5
    iget-object v3, v2, Ld7/i;->p:Ld7/h;

    .line 151
    .line 152
    const/16 v8, 0x30

    .line 153
    .line 154
    if-eqz v3, :cond_7

    .line 155
    .line 156
    iget-object v3, v3, Lr7/b;->k:[B

    .line 157
    .line 158
    invoke-static {v3, v8}, Lk7/a;->t([BI)J

    .line 159
    .line 160
    .line 161
    move-result-wide v9

    .line 162
    goto :goto_6

    .line 163
    :cond_7
    invoke-virtual {v2, v7}, Ld7/s;->N(I)J

    .line 164
    .line 165
    .line 166
    move-result-wide v9

    .line 167
    :goto_6
    const/16 v3, 0xc

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ld7/s;->N(I)J

    .line 170
    .line 171
    .line 172
    move-result-wide v11

    .line 173
    invoke-virtual {v1, v9, v10, v11, v12}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    const/16 v10, 0xa

    .line 178
    .line 179
    invoke-virtual {v2, v10}, Ld7/s;->O(I)I

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    new-instance v11, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    .line 187
    .line 188
    new-instance v10, Ld7/d;

    .line 189
    .line 190
    invoke-direct {v10}, Ld7/d;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v9}, Ld7/t;->S(Ljava/io/InputStream;)I

    .line 194
    .line 195
    .line 196
    :goto_7
    invoke-virtual {v10}, Ld7/t;->U()Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-eqz v12, :cond_8

    .line 201
    .line 202
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    new-instance v10, Ld7/d;

    .line 206
    .line 207
    invoke-direct {v10}, Ld7/d;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v10, v9}, Ld7/t;->S(Ljava/io/InputStream;)I

    .line 211
    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_8
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v3}, Ld7/s;->N(I)J

    .line 218
    .line 219
    .line 220
    move-result-wide v9

    .line 221
    invoke-virtual {v2}, Lr7/b;->p()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    iget-object v12, v2, Ld7/i;->o:Ld7/h;

    .line 226
    .line 227
    if-eqz v12, :cond_9

    .line 228
    .line 229
    invoke-virtual {v12}, Lr7/b;->p()I

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    add-int/2addr v3, v12

    .line 234
    :cond_9
    iget-object v12, v2, Ld7/i;->p:Ld7/h;

    .line 235
    .line 236
    if-eqz v12, :cond_a

    .line 237
    .line 238
    iget-object v12, v2, Ld7/i;->o:Ld7/h;

    .line 239
    .line 240
    invoke-virtual {v12}, Lr7/b;->p()I

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    add-int/2addr v3, v12

    .line 245
    :cond_a
    invoke-virtual {v1}, Li7/f;->c()J

    .line 246
    .line 247
    .line 248
    move-result-wide v12

    .line 249
    int-to-long v14, v3

    .line 250
    sub-long/2addr v12, v14

    .line 251
    sub-long/2addr v12, v9

    .line 252
    const/16 v3, 0x18

    .line 253
    .line 254
    int-to-long v9, v3

    .line 255
    sub-long/2addr v12, v9

    .line 256
    const-wide/16 v14, 0x0

    .line 257
    .line 258
    cmp-long v16, v12, v14

    .line 259
    .line 260
    const-wide/16 v17, 0x18

    .line 261
    .line 262
    const/16 p2, 0x4

    .line 263
    .line 264
    sget-object v4, Ld7/n;->m:[B

    .line 265
    .line 266
    const/16 v19, 0x0

    .line 267
    .line 268
    if-gez v16, :cond_c

    .line 269
    .line 270
    :cond_b
    move-object/from16 v10, v19

    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_c
    invoke-virtual {v1, v12, v13, v9, v10}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    new-instance v10, Ld7/n;

    .line 278
    .line 279
    invoke-direct {v10, v3}, Lr7/b;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v10, v3, v6}, Lr7/b;->M(IZ)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10, v4, v6, v5, v7}, Ld7/s;->P([BIII)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v10, v9}, Ld7/n;->S(Ljava/io/InputStream;)I

    .line 289
    .line 290
    .line 291
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V

    .line 292
    .line 293
    .line 294
    iget-object v3, v10, Lr7/b;->k:[B

    .line 295
    .line 296
    invoke-static {v3, v6}, Lk7/a;->t([BI)J

    .line 297
    .line 298
    .line 299
    move-result-wide v12

    .line 300
    cmp-long v3, v12, v17

    .line 301
    .line 302
    if-lez v3, :cond_b

    .line 303
    .line 304
    iget-object v3, v10, Lr7/b;->k:[B

    .line 305
    .line 306
    array-length v9, v3

    .line 307
    sub-int/2addr v9, v5

    .line 308
    if-gtz v9, :cond_d

    .line 309
    .line 310
    new-array v3, v6, [B

    .line 311
    .line 312
    goto :goto_9

    .line 313
    :cond_d
    if-le v7, v9, :cond_e

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_e
    move v9, v7

    .line 317
    :goto_8
    new-array v12, v9, [B

    .line 318
    .line 319
    invoke-static {v3, v5, v12, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 320
    .line 321
    .line 322
    move-object v3, v12

    .line 323
    :goto_9
    invoke-static {v4, v3}, Lr7/c;->N([B[B)Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_b

    .line 328
    .line 329
    :goto_a
    new-instance v3, Ljava/util/ArrayList;

    .line 330
    .line 331
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    add-int/lit8 v9, v9, 0x2

    .line 336
    .line 337
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1}, Li7/f;->c()J

    .line 341
    .line 342
    .line 343
    move-result-wide v12

    .line 344
    invoke-virtual {v1, v14, v15, v12, v13}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    move v12, v6

    .line 353
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 354
    .line 355
    .line 356
    move-result v13

    .line 357
    if-eqz v13, :cond_15

    .line 358
    .line 359
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v13

    .line 363
    check-cast v13, Ld7/d;

    .line 364
    .line 365
    invoke-virtual {v13}, Ld7/g;->g0()Z

    .line 366
    .line 367
    .line 368
    move-result v15

    .line 369
    if-eqz v15, :cond_f

    .line 370
    .line 371
    iget v15, v13, Ld7/g;->o:I

    .line 372
    .line 373
    invoke-virtual {v13}, Ld7/g;->b0()I

    .line 374
    .line 375
    .line 376
    move-result v16

    .line 377
    add-int v16, v16, v15

    .line 378
    .line 379
    add-int/lit8 v15, v16, 0x4

    .line 380
    .line 381
    const/16 v16, 0x1

    .line 382
    .line 383
    iget-object v14, v13, Lr7/b;->k:[B

    .line 384
    .line 385
    invoke-static {v14, v15}, Lk7/a;->t([BI)J

    .line 386
    .line 387
    .line 388
    move-result-wide v14

    .line 389
    goto :goto_c

    .line 390
    :cond_f
    const/16 v16, 0x1

    .line 391
    .line 392
    const/16 v14, 0x2a

    .line 393
    .line 394
    invoke-virtual {v13, v14}, Ld7/s;->N(I)J

    .line 395
    .line 396
    .line 397
    move-result-wide v14

    .line 398
    :goto_c
    invoke-virtual {v9}, Ljava/io/InputStream;->reset()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v9, v14, v15}, Ljava/io/InputStream;->skip(J)J

    .line 402
    .line 403
    .line 404
    move-result-wide v14

    .line 405
    new-instance v8, Ld7/m;

    .line 406
    .line 407
    move/from16 v20, v5

    .line 408
    .line 409
    sget-object v5, Lc7/g;->i:Lc7/g;

    .line 410
    .line 411
    const/4 v7, 0x6

    .line 412
    const/16 v6, 0x1e

    .line 413
    .line 414
    invoke-direct {v8, v6, v5, v7}, Ld7/g;-><init>(ILc7/g;I)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8, v9}, Ld7/t;->S(Ljava/io/InputStream;)I

    .line 418
    .line 419
    .line 420
    invoke-virtual {v8}, Ld7/t;->U()Z

    .line 421
    .line 422
    .line 423
    move-result v5

    .line 424
    if-eqz v5, :cond_10

    .line 425
    .line 426
    goto :goto_d

    .line 427
    :cond_10
    move-object/from16 v8, v19

    .line 428
    .line 429
    :goto_d
    if-eqz v8, :cond_14

    .line 430
    .line 431
    invoke-virtual {v8}, Lr7/b;->p()I

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    int-to-long v5, v5

    .line 436
    add-long/2addr v14, v5

    .line 437
    iput-wide v14, v13, Ld7/g;->s:J

    .line 438
    .line 439
    invoke-virtual {v8, v13}, Ld7/m;->n0(Ld7/d;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v8}, Ld7/g;->c0()I

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    if-nez v5, :cond_11

    .line 447
    .line 448
    invoke-virtual {v8}, Ld7/m;->e0()J

    .line 449
    .line 450
    .line 451
    move-result-wide v5

    .line 452
    goto :goto_e

    .line 453
    :cond_11
    invoke-virtual {v8}, Ld7/m;->X()J

    .line 454
    .line 455
    .line 456
    move-result-wide v5

    .line 457
    :goto_e
    invoke-virtual {v9, v5, v6}, Ljava/io/InputStream;->skip(J)J

    .line 458
    .line 459
    .line 460
    invoke-virtual {v8}, Ld7/m;->s0()V

    .line 461
    .line 462
    .line 463
    iget-object v5, v8, Ld7/m;->t:Ld7/h;

    .line 464
    .line 465
    if-eqz v5, :cond_13

    .line 466
    .line 467
    invoke-virtual {v5, v9}, Ld7/t;->S(Ljava/io/InputStream;)I

    .line 468
    .line 469
    .line 470
    move-result v6

    .line 471
    invoke-virtual {v5}, Lr7/b;->p()I

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    if-eq v6, v5, :cond_13

    .line 476
    .line 477
    iget-object v5, v8, Ld7/g;->q:La5/a;

    .line 478
    .line 479
    iget v6, v5, La5/a;->h:I

    .line 480
    .line 481
    iget-object v5, v5, La5/a;->i:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v5, Ld7/g;

    .line 484
    .line 485
    const/4 v7, 0x3

    .line 486
    iget-object v13, v5, Lr7/b;->k:[B

    .line 487
    .line 488
    invoke-static {v13, v6, v7}, Lk7/a;->q([BII)Z

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    if-nez v7, :cond_12

    .line 493
    .line 494
    iget-object v7, v8, Ld7/m;->t:Ld7/h;

    .line 495
    .line 496
    if-nez v7, :cond_12

    .line 497
    .line 498
    goto :goto_f

    .line 499
    :cond_12
    iget-object v5, v5, Lr7/b;->k:[B

    .line 500
    .line 501
    aget-byte v7, v5, v6

    .line 502
    .line 503
    and-int/lit16 v7, v7, 0xf7

    .line 504
    .line 505
    int-to-byte v7, v7

    .line 506
    aput-byte v7, v5, v6

    .line 507
    .line 508
    invoke-virtual {v8}, Ld7/m;->s0()V

    .line 509
    .line 510
    .line 511
    :cond_13
    :goto_f
    invoke-virtual {v8, v12}, Lk7/a;->H(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    add-int/lit8 v12, v12, 0x1

    .line 518
    .line 519
    move/from16 v5, v20

    .line 520
    .line 521
    const/4 v6, 0x0

    .line 522
    const/16 v7, 0x10

    .line 523
    .line 524
    const/16 v8, 0x30

    .line 525
    .line 526
    goto/16 :goto_b

    .line 527
    .line 528
    :cond_14
    new-instance v1, Lc7/c;

    .line 529
    .line 530
    const-string v2, "Error reading LFH at "

    .line 531
    .line 532
    const-string v3, ", for CEH = "

    .line 533
    .line 534
    invoke-static {v14, v15, v2, v3}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-virtual {v13}, Ld7/g;->a0()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    throw v1

    .line 553
    :cond_15
    move/from16 v20, v5

    .line 554
    .line 555
    const/16 v16, 0x1

    .line 556
    .line 557
    if-eqz v10, :cond_19

    .line 558
    .line 559
    iget-object v5, v10, Lr7/b;->k:[B

    .line 560
    .line 561
    const/4 v6, 0x0

    .line 562
    invoke-static {v5, v6}, Lk7/a;->t([BI)J

    .line 563
    .line 564
    .line 565
    move-result-wide v7

    .line 566
    cmp-long v5, v7, v17

    .line 567
    .line 568
    if-lez v5, :cond_19

    .line 569
    .line 570
    iget-object v5, v10, Lr7/b;->k:[B

    .line 571
    .line 572
    array-length v7, v5

    .line 573
    add-int/lit8 v7, v7, -0x8

    .line 574
    .line 575
    if-gtz v7, :cond_16

    .line 576
    .line 577
    new-array v5, v6, [B

    .line 578
    .line 579
    goto :goto_11

    .line 580
    :cond_16
    const/16 v8, 0x10

    .line 581
    .line 582
    if-le v8, v7, :cond_17

    .line 583
    .line 584
    goto :goto_10

    .line 585
    :cond_17
    const/16 v7, 0x10

    .line 586
    .line 587
    :goto_10
    new-array v8, v7, [B

    .line 588
    .line 589
    move/from16 v9, v20

    .line 590
    .line 591
    invoke-static {v5, v9, v8, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 592
    .line 593
    .line 594
    move-object v5, v8

    .line 595
    :goto_11
    invoke-static {v4, v5}, Lr7/c;->N([B[B)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    if-eqz v4, :cond_19

    .line 600
    .line 601
    iget-object v4, v10, Lr7/b;->k:[B

    .line 602
    .line 603
    invoke-static {v4, v6}, Lk7/a;->t([BI)J

    .line 604
    .line 605
    .line 606
    move-result-wide v4

    .line 607
    const-wide/16 v6, 0x8

    .line 608
    .line 609
    add-long/2addr v4, v6

    .line 610
    iget-object v6, v2, Ld7/i;->p:Ld7/h;

    .line 611
    .line 612
    if-eqz v6, :cond_18

    .line 613
    .line 614
    iget-object v2, v6, Lr7/b;->k:[B

    .line 615
    .line 616
    const/16 v6, 0x30

    .line 617
    .line 618
    invoke-static {v2, v6}, Lk7/a;->t([BI)J

    .line 619
    .line 620
    .line 621
    move-result-wide v6

    .line 622
    goto :goto_12

    .line 623
    :cond_18
    const/16 v8, 0x10

    .line 624
    .line 625
    invoke-virtual {v2, v8}, Ld7/s;->N(I)J

    .line 626
    .line 627
    .line 628
    move-result-wide v6

    .line 629
    :goto_12
    sub-long/2addr v6, v4

    .line 630
    new-instance v2, Ld7/a;

    .line 631
    .line 632
    move/from16 v8, v16

    .line 633
    .line 634
    invoke-direct {v2, v8}, Ld7/l;-><init>(Z)V

    .line 635
    .line 636
    .line 637
    iget-object v8, v2, Ld7/l;->o:Lo7/g;

    .line 638
    .line 639
    invoke-virtual {v8, v10}, Lo7/g;->P(Lk7/a;)V

    .line 640
    .line 641
    .line 642
    new-instance v8, Lq7/b;

    .line 643
    .line 644
    invoke-virtual {v1, v6, v7, v4, v5}, Li7/f;->b(JJ)Ljava/io/InputStream;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-direct {v8, v1}, Lq7/b;-><init>(Ljava/io/InputStream;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2, v8}, Lk7/a;->G(Lq7/b;)V

    .line 652
    .line 653
    .line 654
    :cond_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 655
    .line 656
    .line 657
    move-result v1

    .line 658
    new-array v2, v1, [Lc7/b;

    .line 659
    .line 660
    const/4 v6, 0x0

    .line 661
    :goto_13
    if-ge v6, v1, :cond_1b

    .line 662
    .line 663
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v4

    .line 667
    check-cast v4, Ld7/m;

    .line 668
    .line 669
    iget-object v5, v4, Ld7/m;->u:Ld7/d;

    .line 670
    .line 671
    if-nez v5, :cond_1a

    .line 672
    .line 673
    goto :goto_14

    .line 674
    :cond_1a
    new-instance v5, Lc7/b;

    .line 675
    .line 676
    invoke-direct {v5, v4}, Lc7/b;-><init>(Ld7/m;)V

    .line 677
    .line 678
    .line 679
    aput-object v5, v2, v6

    .line 680
    .line 681
    :goto_14
    add-int/lit8 v6, v6, 0x1

    .line 682
    .line 683
    goto :goto_13

    .line 684
    :cond_1b
    iput-object v2, v0, Lc7/a;->h:[Lc7/b;

    .line 685
    .line 686
    return-void

    .line 687
    :cond_1c
    const/16 p2, 0x4

    .line 688
    .line 689
    new-instance v1, Ljava/io/IOException;

    .line 690
    .line 691
    new-instance v2, Ljava/lang/StringBuilder;

    .line 692
    .line 693
    const-string v3, "Invalid "

    .line 694
    .line 695
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    const-string v3, ": "

    .line 702
    .line 703
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v8}, Lr7/b;->p()I

    .line 707
    .line 708
    .line 709
    move-result v3

    .line 710
    move/from16 v4, p2

    .line 711
    .line 712
    if-ge v3, v4, :cond_1d

    .line 713
    .line 714
    const/4 v6, 0x0

    .line 715
    :goto_15
    const/16 v9, 0x8

    .line 716
    .line 717
    goto :goto_16

    .line 718
    :cond_1d
    iget-object v3, v8, Lr7/b;->k:[B

    .line 719
    .line 720
    const/4 v6, 0x0

    .line 721
    invoke-static {v3, v6}, Lk7/a;->s([BI)I

    .line 722
    .line 723
    .line 724
    move-result v6

    .line 725
    goto :goto_15

    .line 726
    :goto_16
    invoke-static {v6, v9}, Ly7/a;->k(II)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    throw v1

    .line 741
    :cond_1e
    new-instance v1, Lc7/c;

    .line 742
    .line 743
    const-string v2, "Failed to find end record"

    .line 744
    .line 745
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    throw v1
.end method


# virtual methods
.method public final a()Lc7/f;
    .locals 6

    .line 1
    new-instance v0, Lc7/f;

    .line 2
    .line 3
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    iget-object v2, p0, Lc7/a;->h:[Lc7/b;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La7/b;

    .line 12
    .line 13
    const/16 v4, 0x17

    .line 14
    .line 15
    invoke-direct {v3, v4}, La7/b;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v4, Lz7/d;

    .line 19
    .line 20
    array-length v5, v2

    .line 21
    invoke-direct {v4, v2, v5, v3}, Lz7/d;-><init>([Ljava/lang/Object;ILjava/util/function/Predicate;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {v4}, Lz7/d;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v4}, Lz7/d;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lc7/b;

    .line 35
    .line 36
    iget v3, p0, Lc7/a;->i:I

    .line 37
    .line 38
    packed-switch v3, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    new-instance v3, Li7/c;

    .line 42
    .line 43
    iget-object v5, p0, Lc7/a;->g:Li7/f;

    .line 44
    .line 45
    check-cast v5, Li7/e;

    .line 46
    .line 47
    invoke-direct {v3, v5, v2}, Li7/b;-><init>(Li7/f;Lc7/b;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lc7/b;->a()Ld7/d;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget v2, v2, Lk7/a;->g:I

    .line 55
    .line 56
    iput v2, v3, Lc7/e;->d:I

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :pswitch_0
    new-instance v3, Li7/a;

    .line 60
    .line 61
    iget-object v5, p0, Lc7/a;->g:Li7/f;

    .line 62
    .line 63
    check-cast v5, Li7/d;

    .line 64
    .line 65
    invoke-direct {v3, v5, v2}, Li7/b;-><init>(Li7/f;Lc7/b;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Lc7/b;->a()Ld7/d;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget v2, v2, Lk7/a;->g:I

    .line 73
    .line 74
    iput v2, v3, Lc7/e;->d:I

    .line 75
    .line 76
    :goto_1
    invoke-virtual {v3}, Lc7/e;->a()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v1, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-direct {v0, v1}, Lc7/f;-><init>(Ljava/util/LinkedHashMap;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc7/a;->g:Li7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
