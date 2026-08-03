.class public final Ls1/i;
.super Ls1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final c:Ly0/n;

.field public final d:La5/a;

.field public final e:Lf/p;

.field public f:Lx1/i1;

.field public g:Ls1/k;

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Ly0/n;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ls1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls1/i;->c:Ly0/n;

    .line 5
    .line 6
    new-instance p1, La5/a;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v1, v0}, La5/a;-><init>(BI)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    new-array v1, v0, [J

    .line 16
    .line 17
    iput-object v1, p1, La5/a;->i:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p1, p0, Ls1/i;->d:La5/a;

    .line 20
    .line 21
    new-instance p1, Lf/p;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lf/p;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ls1/i;->e:Lf/p;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Ls1/i;->i:Z

    .line 30
    .line 31
    iput-boolean p1, p0, Ls1/i;->j:Z

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Lf/p;Lv1/t;Lh0/q0;Z)Z
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-super/range {p0 .. p4}, Ls1/j;->a(Lf/p;Lv1/t;Lh0/q0;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, v0, Ls1/i;->c:Ly0/n;

    .line 14
    .line 15
    iget-boolean v6, v5, Ly0/n;->t:Z

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_0
    const/4 v8, 0x0

    .line 22
    :goto_0
    if-eqz v5, :cond_8

    .line 23
    .line 24
    instance-of v10, v5, Lx1/w1;

    .line 25
    .line 26
    const/16 v11, 0x10

    .line 27
    .line 28
    if-eqz v10, :cond_1

    .line 29
    .line 30
    check-cast v5, Lx1/w1;

    .line 31
    .line 32
    invoke-static {v5, v11}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iput-object v5, v0, Ls1/i;->f:Lx1/i1;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    iget v10, v5, Ly0/n;->i:I

    .line 40
    .line 41
    and-int/2addr v10, v11

    .line 42
    if-eqz v10, :cond_7

    .line 43
    .line 44
    instance-of v10, v5, Lx1/j;

    .line 45
    .line 46
    if-eqz v10, :cond_7

    .line 47
    .line 48
    move-object v10, v5

    .line 49
    check-cast v10, Lx1/j;

    .line 50
    .line 51
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    :goto_1
    if-eqz v10, :cond_6

    .line 55
    .line 56
    iget v12, v10, Ly0/n;->i:I

    .line 57
    .line 58
    and-int/2addr v12, v11

    .line 59
    if-eqz v12, :cond_5

    .line 60
    .line 61
    add-int/lit8 v9, v9, 0x1

    .line 62
    .line 63
    if-ne v9, v7, :cond_2

    .line 64
    .line 65
    move-object v5, v10

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    if-nez v8, :cond_3

    .line 68
    .line 69
    new-instance v8, Lj0/b;

    .line 70
    .line 71
    new-array v12, v11, [Ly0/n;

    .line 72
    .line 73
    invoke-direct {v8, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    if-eqz v5, :cond_4

    .line 77
    .line 78
    invoke-virtual {v8, v5}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    :cond_4
    invoke-virtual {v8, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    iget-object v10, v10, Ly0/n;->l:Ly0/n;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    if-ne v9, v7, :cond_7

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_7
    :goto_3
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    goto :goto_0

    .line 96
    :cond_8
    iget-object v5, v0, Ls1/i;->f:Lx1/i1;

    .line 97
    .line 98
    if-nez v5, :cond_9

    .line 99
    .line 100
    :goto_4
    return v7

    .line 101
    :cond_9
    invoke-virtual {v1}, Lf/p;->d()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    const/4 v8, 0x0

    .line 106
    :goto_5
    iget-object v10, v0, Ls1/i;->d:La5/a;

    .line 107
    .line 108
    iget-object v11, v0, Ls1/i;->e:Lf/p;

    .line 109
    .line 110
    if-ge v8, v5, :cond_12

    .line 111
    .line 112
    invoke-virtual {v1, v8}, Lf/p;->a(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    invoke-virtual {v1, v8}, Lf/p;->e(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    check-cast v14, Ls1/t;

    .line 121
    .line 122
    invoke-virtual {v10, v12, v13}, La5/a;->e(J)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_11

    .line 127
    .line 128
    move v15, v7

    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    iget-wide v6, v14, Ls1/t;->g:J

    .line 132
    .line 133
    iget-object v10, v14, Ls1/t;->m:Ljava/util/ArrayList;

    .line 134
    .line 135
    move-object/from16 v17, v10

    .line 136
    .line 137
    iget-wide v9, v14, Ls1/t;->c:J

    .line 138
    .line 139
    const-wide v18, 0x7fffffff7fffffffL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    and-long v20, v6, v18

    .line 145
    .line 146
    const-wide v22, 0x7fffff007fffffL

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    add-long v20, v20, v22

    .line 152
    .line 153
    const-wide v24, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    and-long v20, v20, v24

    .line 159
    .line 160
    const-wide/16 v26, 0x0

    .line 161
    .line 162
    cmp-long v20, v20, v26

    .line 163
    .line 164
    if-nez v20, :cond_10

    .line 165
    .line 166
    and-long v20, v9, v18

    .line 167
    .line 168
    add-long v20, v20, v22

    .line 169
    .line 170
    and-long v20, v20, v24

    .line 171
    .line 172
    cmp-long v20, v20, v26

    .line 173
    .line 174
    if-nez v20, :cond_10

    .line 175
    .line 176
    move/from16 v20, v15

    .line 177
    .line 178
    new-instance v15, Ljava/util/ArrayList;

    .line 179
    .line 180
    sget-object v21, Ltf/t;->g:Ltf/t;

    .line 181
    .line 182
    if-nez v17, :cond_a

    .line 183
    .line 184
    move-object/from16 v28, v21

    .line 185
    .line 186
    :goto_6
    move/from16 v51, v4

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_a
    move-object/from16 v28, v17

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :goto_7
    invoke-interface/range {v28 .. v28}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 197
    .line 198
    .line 199
    if-nez v17, :cond_b

    .line 200
    .line 201
    move-object/from16 v4, v21

    .line 202
    .line 203
    :goto_8
    move/from16 v17, v5

    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_b
    move-object/from16 v4, v17

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :goto_9
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    move/from16 v21, v8

    .line 214
    .line 215
    const/4 v8, 0x0

    .line 216
    :goto_a
    if-ge v8, v5, :cond_d

    .line 217
    .line 218
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v28

    .line 222
    move-object/from16 v29, v4

    .line 223
    .line 224
    move-object/from16 v4, v28

    .line 225
    .line 226
    check-cast v4, Ls1/c;

    .line 227
    .line 228
    move-object/from16 v52, v11

    .line 229
    .line 230
    move-wide/from16 v53, v12

    .line 231
    .line 232
    iget-wide v11, v4, Ls1/c;->b:J

    .line 233
    .line 234
    and-long v30, v11, v18

    .line 235
    .line 236
    add-long v30, v30, v22

    .line 237
    .line 238
    and-long v30, v30, v24

    .line 239
    .line 240
    cmp-long v13, v30, v26

    .line 241
    .line 242
    if-nez v13, :cond_c

    .line 243
    .line 244
    new-instance v30, Ls1/c;

    .line 245
    .line 246
    move-object/from16 v55, v14

    .line 247
    .line 248
    iget-wide v13, v4, Ls1/c;->a:J

    .line 249
    .line 250
    move/from16 v28, v5

    .line 251
    .line 252
    iget-object v5, v0, Ls1/i;->f:Lx1/i1;

    .line 253
    .line 254
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5, v2, v11, v12}, Lx1/i1;->W(Lv1/t;J)J

    .line 258
    .line 259
    .line 260
    move-result-wide v33

    .line 261
    iget v5, v4, Ls1/c;->c:F

    .line 262
    .line 263
    iget-wide v11, v4, Ls1/c;->d:J

    .line 264
    .line 265
    move/from16 v35, v5

    .line 266
    .line 267
    iget-wide v4, v4, Ls1/c;->e:J

    .line 268
    .line 269
    move-wide/from16 v38, v4

    .line 270
    .line 271
    move-wide/from16 v36, v11

    .line 272
    .line 273
    move-wide/from16 v31, v13

    .line 274
    .line 275
    invoke-direct/range {v30 .. v39}, Ls1/c;-><init>(JJFJJ)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v4, v30

    .line 279
    .line 280
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_b

    .line 284
    :cond_c
    move/from16 v28, v5

    .line 285
    .line 286
    move-object/from16 v55, v14

    .line 287
    .line 288
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 289
    .line 290
    move/from16 v5, v28

    .line 291
    .line 292
    move-object/from16 v4, v29

    .line 293
    .line 294
    move-object/from16 v11, v52

    .line 295
    .line 296
    move-wide/from16 v12, v53

    .line 297
    .line 298
    move-object/from16 v14, v55

    .line 299
    .line 300
    goto :goto_a

    .line 301
    :cond_d
    move-object/from16 v52, v11

    .line 302
    .line 303
    move-wide/from16 v53, v12

    .line 304
    .line 305
    move-object/from16 v55, v14

    .line 306
    .line 307
    iget-object v4, v0, Ls1/i;->f:Lx1/i1;

    .line 308
    .line 309
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v2, v6, v7}, Lx1/i1;->W(Lv1/t;J)J

    .line 313
    .line 314
    .line 315
    move-result-wide v39

    .line 316
    iget-object v4, v0, Ls1/i;->f:Lx1/i1;

    .line 317
    .line 318
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v2, v9, v10}, Lx1/i1;->W(Lv1/t;J)J

    .line 322
    .line 323
    .line 324
    move-result-wide v33

    .line 325
    iget-wide v4, v14, Ls1/t;->a:J

    .line 326
    .line 327
    iget-wide v6, v14, Ls1/t;->b:J

    .line 328
    .line 329
    iget-boolean v8, v14, Ls1/t;->d:Z

    .line 330
    .line 331
    iget-wide v9, v14, Ls1/t;->f:J

    .line 332
    .line 333
    iget-boolean v11, v14, Ls1/t;->h:Z

    .line 334
    .line 335
    iget v12, v14, Ls1/t;->i:I

    .line 336
    .line 337
    move-wide/from16 v29, v4

    .line 338
    .line 339
    iget-wide v4, v14, Ls1/t;->j:J

    .line 340
    .line 341
    iget v13, v14, Ls1/t;->e:F

    .line 342
    .line 343
    new-instance v28, Ls1/t;

    .line 344
    .line 345
    iget v2, v14, Ls1/t;->k:F

    .line 346
    .line 347
    move-wide/from16 v44, v4

    .line 348
    .line 349
    iget-wide v4, v14, Ls1/t;->l:J

    .line 350
    .line 351
    move-wide/from16 v47, v4

    .line 352
    .line 353
    iget-wide v4, v14, Ls1/t;->n:J

    .line 354
    .line 355
    move/from16 v46, v2

    .line 356
    .line 357
    move-wide/from16 v49, v4

    .line 358
    .line 359
    move-wide/from16 v31, v6

    .line 360
    .line 361
    move/from16 v35, v8

    .line 362
    .line 363
    move-wide/from16 v37, v9

    .line 364
    .line 365
    move/from16 v41, v11

    .line 366
    .line 367
    move/from16 v42, v12

    .line 368
    .line 369
    move/from16 v36, v13

    .line 370
    .line 371
    move-object/from16 v43, v15

    .line 372
    .line 373
    invoke-direct/range {v28 .. v50}, Ls1/t;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 374
    .line 375
    .line 376
    move-object/from16 v2, v28

    .line 377
    .line 378
    iget-object v4, v14, Ls1/t;->q:Ls1/t;

    .line 379
    .line 380
    if-nez v4, :cond_e

    .line 381
    .line 382
    move-object v4, v14

    .line 383
    :cond_e
    iput-object v4, v2, Ls1/t;->q:Ls1/t;

    .line 384
    .line 385
    iget-object v4, v14, Ls1/t;->q:Ls1/t;

    .line 386
    .line 387
    if-nez v4, :cond_f

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_f
    move-object v14, v4

    .line 391
    :goto_c
    iput-object v14, v2, Ls1/t;->q:Ls1/t;

    .line 392
    .line 393
    move-object/from16 v6, v52

    .line 394
    .line 395
    move-wide/from16 v4, v53

    .line 396
    .line 397
    invoke-virtual {v6, v2, v4, v5}, Lf/p;->b(Ljava/lang/Object;J)V

    .line 398
    .line 399
    .line 400
    goto :goto_d

    .line 401
    :cond_10
    move/from16 v51, v4

    .line 402
    .line 403
    move/from16 v17, v5

    .line 404
    .line 405
    move/from16 v21, v8

    .line 406
    .line 407
    move/from16 v20, v15

    .line 408
    .line 409
    goto :goto_d

    .line 410
    :cond_11
    move/from16 v51, v4

    .line 411
    .line 412
    move/from16 v17, v5

    .line 413
    .line 414
    move/from16 v20, v7

    .line 415
    .line 416
    move/from16 v21, v8

    .line 417
    .line 418
    const/16 v16, 0x0

    .line 419
    .line 420
    :goto_d
    add-int/lit8 v8, v21, 0x1

    .line 421
    .line 422
    move-object/from16 v2, p2

    .line 423
    .line 424
    move/from16 v5, v17

    .line 425
    .line 426
    move/from16 v7, v20

    .line 427
    .line 428
    move/from16 v4, v51

    .line 429
    .line 430
    goto/16 :goto_5

    .line 431
    .line 432
    :cond_12
    move/from16 v51, v4

    .line 433
    .line 434
    move/from16 v20, v7

    .line 435
    .line 436
    move-object v6, v11

    .line 437
    const/16 v16, 0x0

    .line 438
    .line 439
    invoke-virtual {v6}, Lf/p;->d()I

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-nez v2, :cond_13

    .line 444
    .line 445
    const/4 v2, 0x0

    .line 446
    iput v2, v10, La5/a;->h:I

    .line 447
    .line 448
    iget-object v1, v0, Ls1/j;->a:Lj0/b;

    .line 449
    .line 450
    invoke-virtual {v1}, Lj0/b;->g()V

    .line 451
    .line 452
    .line 453
    return v20

    .line 454
    :cond_13
    iget v2, v10, La5/a;->h:I

    .line 455
    .line 456
    add-int/lit8 v2, v2, -0x1

    .line 457
    .line 458
    :goto_e
    const/4 v4, -0x1

    .line 459
    if-ge v4, v2, :cond_1b

    .line 460
    .line 461
    iget-object v5, v10, La5/a;->i:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v5, [J

    .line 464
    .line 465
    aget-wide v7, v5, v2

    .line 466
    .line 467
    iget-boolean v5, v1, Lf/p;->g:Z

    .line 468
    .line 469
    if-eqz v5, :cond_17

    .line 470
    .line 471
    iget v5, v1, Lf/p;->j:I

    .line 472
    .line 473
    iget-object v9, v1, Lf/p;->h:[J

    .line 474
    .line 475
    iget-object v11, v1, Lf/p;->i:[Ljava/lang/Object;

    .line 476
    .line 477
    const/4 v12, 0x0

    .line 478
    const/4 v13, 0x0

    .line 479
    :goto_f
    if-ge v13, v5, :cond_16

    .line 480
    .line 481
    aget-object v14, v11, v13

    .line 482
    .line 483
    sget-object v15, Lf/q;->a:Ljava/lang/Object;

    .line 484
    .line 485
    if-eq v14, v15, :cond_15

    .line 486
    .line 487
    if-eq v13, v12, :cond_14

    .line 488
    .line 489
    aget-wide v17, v9, v13

    .line 490
    .line 491
    aput-wide v17, v9, v12

    .line 492
    .line 493
    aput-object v14, v11, v12

    .line 494
    .line 495
    aput-object v16, v11, v13

    .line 496
    .line 497
    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 498
    .line 499
    :cond_15
    add-int/lit8 v13, v13, 0x1

    .line 500
    .line 501
    goto :goto_f

    .line 502
    :cond_16
    const/4 v13, 0x0

    .line 503
    iput-boolean v13, v1, Lf/p;->g:Z

    .line 504
    .line 505
    iput v12, v1, Lf/p;->j:I

    .line 506
    .line 507
    :cond_17
    iget-object v5, v1, Lf/p;->h:[J

    .line 508
    .line 509
    iget v9, v1, Lf/p;->j:I

    .line 510
    .line 511
    invoke-static {v5, v9, v7, v8}, Lg/a;->b([JIJ)I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    if-ltz v5, :cond_18

    .line 516
    .line 517
    goto :goto_11

    .line 518
    :cond_18
    iget v5, v10, La5/a;->h:I

    .line 519
    .line 520
    if-ge v2, v5, :cond_1a

    .line 521
    .line 522
    add-int/lit8 v5, v5, -0x1

    .line 523
    .line 524
    move v7, v2

    .line 525
    :goto_10
    if-ge v7, v5, :cond_19

    .line 526
    .line 527
    iget-object v8, v10, La5/a;->i:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v8, [J

    .line 530
    .line 531
    add-int/lit8 v9, v7, 0x1

    .line 532
    .line 533
    aget-wide v11, v8, v9

    .line 534
    .line 535
    aput-wide v11, v8, v7

    .line 536
    .line 537
    move v7, v9

    .line 538
    goto :goto_10

    .line 539
    :cond_19
    iget v5, v10, La5/a;->h:I

    .line 540
    .line 541
    add-int/2addr v5, v4

    .line 542
    iput v5, v10, La5/a;->h:I

    .line 543
    .line 544
    :cond_1a
    :goto_11
    add-int/lit8 v2, v2, -0x1

    .line 545
    .line 546
    goto :goto_e

    .line 547
    :cond_1b
    new-instance v1, Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-virtual {v6}, Lf/p;->d()I

    .line 550
    .line 551
    .line 552
    move-result v2

    .line 553
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v6}, Lf/p;->d()I

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    const/4 v4, 0x0

    .line 561
    :goto_12
    if-ge v4, v2, :cond_1c

    .line 562
    .line 563
    invoke-virtual {v6, v4}, Lf/p;->e(I)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    add-int/lit8 v4, v4, 0x1

    .line 571
    .line 572
    goto :goto_12

    .line 573
    :cond_1c
    new-instance v2, Ls1/k;

    .line 574
    .line 575
    invoke-direct {v2, v1, v3}, Ls1/k;-><init>(Ljava/util/List;Lh0/q0;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    const/4 v5, 0x0

    .line 583
    :goto_13
    if-ge v5, v4, :cond_1e

    .line 584
    .line 585
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v6

    .line 589
    move-object v7, v6

    .line 590
    check-cast v7, Ls1/t;

    .line 591
    .line 592
    iget-wide v7, v7, Ls1/t;->a:J

    .line 593
    .line 594
    invoke-virtual {v3, v7, v8}, Lh0/q0;->a(J)Z

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    if-eqz v7, :cond_1d

    .line 599
    .line 600
    goto :goto_14

    .line 601
    :cond_1d
    add-int/lit8 v5, v5, 0x1

    .line 602
    .line 603
    goto :goto_13

    .line 604
    :cond_1e
    move-object/from16 v6, v16

    .line 605
    .line 606
    :goto_14
    check-cast v6, Ls1/t;

    .line 607
    .line 608
    const/4 v1, 0x3

    .line 609
    if-eqz v6, :cond_2b

    .line 610
    .line 611
    iget-boolean v3, v6, Ls1/t;->d:Z

    .line 612
    .line 613
    if-nez p4, :cond_1f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    iput-boolean v13, v0, Ls1/i;->i:Z

    .line 617
    .line 618
    goto :goto_19

    .line 619
    :cond_1f
    const/4 v13, 0x0

    .line 620
    iget-boolean v4, v0, Ls1/i;->i:Z

    .line 621
    .line 622
    if-nez v4, :cond_25

    .line 623
    .line 624
    if-nez v3, :cond_20

    .line 625
    .line 626
    iget-boolean v4, v6, Ls1/t;->h:Z

    .line 627
    .line 628
    if-eqz v4, :cond_25

    .line 629
    .line 630
    :cond_20
    iget-object v4, v0, Ls1/i;->f:Lx1/i1;

    .line 631
    .line 632
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    iget-wide v4, v4, Lv1/b1;->i:J

    .line 636
    .line 637
    iget-wide v6, v6, Ls1/t;->c:J

    .line 638
    .line 639
    const/16 v8, 0x20

    .line 640
    .line 641
    shr-long v9, v6, v8

    .line 642
    .line 643
    long-to-int v9, v9

    .line 644
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    const-wide v10, 0xffffffffL

    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    and-long/2addr v6, v10

    .line 654
    long-to-int v6, v6

    .line 655
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 656
    .line 657
    .line 658
    move-result v6

    .line 659
    shr-long v7, v4, v8

    .line 660
    .line 661
    long-to-int v7, v7

    .line 662
    and-long/2addr v4, v10

    .line 663
    long-to-int v4, v4

    .line 664
    const/4 v5, 0x0

    .line 665
    cmpg-float v8, v9, v5

    .line 666
    .line 667
    if-gez v8, :cond_21

    .line 668
    .line 669
    move/from16 v8, v20

    .line 670
    .line 671
    goto :goto_15

    .line 672
    :cond_21
    move v8, v13

    .line 673
    :goto_15
    int-to-float v7, v7

    .line 674
    cmpl-float v7, v9, v7

    .line 675
    .line 676
    if-lez v7, :cond_22

    .line 677
    .line 678
    move/from16 v7, v20

    .line 679
    .line 680
    goto :goto_16

    .line 681
    :cond_22
    move v7, v13

    .line 682
    :goto_16
    or-int/2addr v7, v8

    .line 683
    cmpg-float v5, v6, v5

    .line 684
    .line 685
    if-gez v5, :cond_23

    .line 686
    .line 687
    move/from16 v5, v20

    .line 688
    .line 689
    goto :goto_17

    .line 690
    :cond_23
    move v5, v13

    .line 691
    :goto_17
    or-int/2addr v5, v7

    .line 692
    int-to-float v4, v4

    .line 693
    cmpl-float v4, v6, v4

    .line 694
    .line 695
    if-lez v4, :cond_24

    .line 696
    .line 697
    move/from16 v4, v20

    .line 698
    .line 699
    goto :goto_18

    .line 700
    :cond_24
    move v4, v13

    .line 701
    :goto_18
    or-int/2addr v4, v5

    .line 702
    xor-int/lit8 v4, v4, 0x1

    .line 703
    .line 704
    iput-boolean v4, v0, Ls1/i;->i:Z

    .line 705
    .line 706
    :cond_25
    :goto_19
    iget-boolean v4, v0, Ls1/i;->i:Z

    .line 707
    .line 708
    iget-boolean v5, v0, Ls1/i;->h:Z

    .line 709
    .line 710
    const/4 v6, 0x5

    .line 711
    const/4 v7, 0x4

    .line 712
    if-eq v4, v5, :cond_29

    .line 713
    .line 714
    iget v8, v2, Ls1/k;->f:I

    .line 715
    .line 716
    if-ne v8, v1, :cond_26

    .line 717
    .line 718
    goto :goto_1a

    .line 719
    :cond_26
    if-ne v8, v7, :cond_27

    .line 720
    .line 721
    goto :goto_1a

    .line 722
    :cond_27
    if-ne v8, v6, :cond_29

    .line 723
    .line 724
    :goto_1a
    if-eqz v4, :cond_28

    .line 725
    .line 726
    move v6, v7

    .line 727
    :cond_28
    iput v6, v2, Ls1/k;->f:I

    .line 728
    .line 729
    goto :goto_1b

    .line 730
    :cond_29
    iget v8, v2, Ls1/k;->f:I

    .line 731
    .line 732
    if-ne v8, v7, :cond_2a

    .line 733
    .line 734
    if-eqz v5, :cond_2a

    .line 735
    .line 736
    iget-boolean v5, v0, Ls1/i;->j:Z

    .line 737
    .line 738
    if-nez v5, :cond_2a

    .line 739
    .line 740
    iput v1, v2, Ls1/k;->f:I

    .line 741
    .line 742
    goto :goto_1b

    .line 743
    :cond_2a
    if-ne v8, v6, :cond_2c

    .line 744
    .line 745
    if-eqz v4, :cond_2c

    .line 746
    .line 747
    if-eqz v3, :cond_2c

    .line 748
    .line 749
    iput v1, v2, Ls1/k;->f:I

    .line 750
    .line 751
    goto :goto_1b

    .line 752
    :cond_2b
    const/4 v13, 0x0

    .line 753
    :cond_2c
    :goto_1b
    if-nez v51, :cond_30

    .line 754
    .line 755
    iget v3, v2, Ls1/k;->f:I

    .line 756
    .line 757
    if-ne v3, v1, :cond_30

    .line 758
    .line 759
    iget-object v1, v0, Ls1/i;->g:Ls1/k;

    .line 760
    .line 761
    if-eqz v1, :cond_30

    .line 762
    .line 763
    iget-object v1, v1, Ls1/k;->a:Ljava/lang/Object;

    .line 764
    .line 765
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 766
    .line 767
    .line 768
    move-result v3

    .line 769
    iget-object v4, v2, Ls1/k;->a:Ljava/lang/Object;

    .line 770
    .line 771
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    if-eq v3, v5, :cond_2d

    .line 776
    .line 777
    goto :goto_1d

    .line 778
    :cond_2d
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    move v5, v13

    .line 783
    :goto_1c
    if-ge v5, v3, :cond_2f

    .line 784
    .line 785
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v6

    .line 789
    check-cast v6, Ls1/t;

    .line 790
    .line 791
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    check-cast v7, Ls1/t;

    .line 796
    .line 797
    iget-wide v8, v6, Ls1/t;->c:J

    .line 798
    .line 799
    iget-wide v6, v7, Ls1/t;->c:J

    .line 800
    .line 801
    invoke-static {v8, v9, v6, v7}, Le1/b;->b(JJ)Z

    .line 802
    .line 803
    .line 804
    move-result v6

    .line 805
    if-nez v6, :cond_2e

    .line 806
    .line 807
    goto :goto_1d

    .line 808
    :cond_2e
    add-int/lit8 v5, v5, 0x1

    .line 809
    .line 810
    goto :goto_1c

    .line 811
    :cond_2f
    move v7, v13

    .line 812
    goto :goto_1e

    .line 813
    :cond_30
    :goto_1d
    move/from16 v7, v20

    .line 814
    .line 815
    :goto_1e
    iput-object v2, v0, Ls1/i;->g:Ls1/k;

    .line 816
    .line 817
    return v7
.end method

.method public final b(Lh0/q0;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Ls1/j;->b(Lh0/q0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls1/i;->g:Ls1/k;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v1, p0, Ls1/i;->i:Z

    .line 10
    .line 11
    iput-boolean v1, p0, Ls1/i;->h:Z

    .line 12
    .line 13
    iget-object v1, v0, Ls1/k;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_4

    .line 22
    .line 23
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Ls1/t;

    .line 28
    .line 29
    iget-boolean v6, v5, Ls1/t;->d:Z

    .line 30
    .line 31
    iget-wide v7, v5, Ls1/t;->a:J

    .line 32
    .line 33
    invoke-virtual {p1, v7, v8}, Lh0/q0;->a(J)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget-boolean v9, p0, Ls1/i;->i:Z

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    :cond_1
    if-nez v6, :cond_3

    .line 44
    .line 45
    if-nez v9, :cond_3

    .line 46
    .line 47
    :cond_2
    iget-object v5, p0, Ls1/i;->d:La5/a;

    .line 48
    .line 49
    invoke-virtual {v5, v7, v8}, La5/a;->p(J)V

    .line 50
    .line 51
    .line 52
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    iput-boolean v3, p0, Ls1/i;->i:Z

    .line 56
    .line 57
    iget p1, v0, Ls1/k;->f:I

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    if-ne p1, v0, :cond_5

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    :cond_5
    iput-boolean v3, p0, Ls1/i;->j:Z

    .line 64
    .line 65
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    iget-object v0, p0, Ls1/j;->a:Lj0/b;

    .line 2
    .line 3
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, Lj0/b;->i:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    check-cast v4, Ls1/i;

    .line 14
    .line 15
    invoke-virtual {v4}, Ls1/i;->c()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iget-object v1, p0, Ls1/i;->c:Ly0/n;

    .line 23
    .line 24
    move-object v3, v0

    .line 25
    :goto_1
    if-eqz v1, :cond_8

    .line 26
    .line 27
    instance-of v4, v1, Lx1/w1;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    check-cast v1, Lx1/w1;

    .line 32
    .line 33
    invoke-interface {v1}, Lx1/w1;->b0()V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    iget v4, v1, Ly0/n;->i:I

    .line 38
    .line 39
    const/16 v5, 0x10

    .line 40
    .line 41
    and-int/2addr v4, v5

    .line 42
    if-eqz v4, :cond_7

    .line 43
    .line 44
    instance-of v4, v1, Lx1/j;

    .line 45
    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    move-object v4, v1

    .line 49
    check-cast v4, Lx1/j;

    .line 50
    .line 51
    iget-object v4, v4, Lx1/j;->v:Ly0/n;

    .line 52
    .line 53
    move v6, v2

    .line 54
    :goto_2
    const/4 v7, 0x1

    .line 55
    if-eqz v4, :cond_6

    .line 56
    .line 57
    iget v8, v4, Ly0/n;->i:I

    .line 58
    .line 59
    and-int/2addr v8, v5

    .line 60
    if-eqz v8, :cond_5

    .line 61
    .line 62
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    if-ne v6, v7, :cond_2

    .line 65
    .line 66
    move-object v1, v4

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    if-nez v3, :cond_3

    .line 69
    .line 70
    new-instance v3, Lj0/b;

    .line 71
    .line 72
    new-array v7, v5, [Ly0/n;

    .line 73
    .line 74
    invoke-direct {v3, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v1, v0

    .line 83
    :cond_4
    invoke-virtual {v3, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_3
    iget-object v4, v4, Ly0/n;->l:Ly0/n;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    if-ne v6, v7, :cond_7

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_7
    :goto_4
    invoke-static {v3}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    goto :goto_1

    .line 97
    :cond_8
    return-void
.end method

.method public final d(Lh0/q0;)Z
    .locals 14

    .line 1
    iget-object v0, p0, Ls1/i;->e:Lf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf/p;->d()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    :goto_0
    move v9, v3

    .line 12
    goto/16 :goto_9

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Ls1/i;->c:Ly0/n;

    .line 15
    .line 16
    iget-boolean v4, v1, Ly0/n;->t:Z

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v4, v1, Ly0/n;->n:Lx1/i1;

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, Lx1/i1;->u:Lx1/f0;

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    invoke-virtual {v4}, Lx1/f0;->H()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v4, v3

    .line 35
    :goto_1
    if-nez v4, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    iget-object v4, p0, Ls1/i;->g:Ls1/k;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, Ls1/i;->f:Lx1/i1;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-wide v5, v5, Lv1/b1;->i:J

    .line 49
    .line 50
    move-object v7, v1

    .line 51
    move-object v8, v2

    .line 52
    :goto_2
    const/4 v9, 0x1

    .line 53
    if-eqz v7, :cond_d

    .line 54
    .line 55
    instance-of v10, v7, Lx1/w1;

    .line 56
    .line 57
    if-eqz v10, :cond_4

    .line 58
    .line 59
    move-object v10, v7

    .line 60
    check-cast v10, Lx1/w1;

    .line 61
    .line 62
    sget-object v11, Ls1/l;->i:Ls1/l;

    .line 63
    .line 64
    invoke-interface {v10, v4, v11, v5, v6}, Lx1/w1;->P(Ls1/k;Ls1/l;J)V

    .line 65
    .line 66
    .line 67
    move v10, v3

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v10, v9

    .line 70
    :goto_3
    if-eqz v10, :cond_c

    .line 71
    .line 72
    iget v10, v7, Ly0/n;->i:I

    .line 73
    .line 74
    const/16 v11, 0x10

    .line 75
    .line 76
    and-int/2addr v10, v11

    .line 77
    if-eqz v10, :cond_5

    .line 78
    .line 79
    move v10, v9

    .line 80
    goto :goto_4

    .line 81
    :cond_5
    move v10, v3

    .line 82
    :goto_4
    if-eqz v10, :cond_c

    .line 83
    .line 84
    instance-of v10, v7, Lx1/j;

    .line 85
    .line 86
    if-eqz v10, :cond_c

    .line 87
    .line 88
    move-object v10, v7

    .line 89
    check-cast v10, Lx1/j;

    .line 90
    .line 91
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 92
    .line 93
    move v12, v3

    .line 94
    :goto_5
    if-eqz v10, :cond_b

    .line 95
    .line 96
    iget v13, v10, Ly0/n;->i:I

    .line 97
    .line 98
    and-int/2addr v13, v11

    .line 99
    if-eqz v13, :cond_6

    .line 100
    .line 101
    move v13, v9

    .line 102
    goto :goto_6

    .line 103
    :cond_6
    move v13, v3

    .line 104
    :goto_6
    if-eqz v13, :cond_a

    .line 105
    .line 106
    add-int/lit8 v12, v12, 0x1

    .line 107
    .line 108
    if-ne v12, v9, :cond_7

    .line 109
    .line 110
    move-object v7, v10

    .line 111
    goto :goto_7

    .line 112
    :cond_7
    if-nez v8, :cond_8

    .line 113
    .line 114
    new-instance v8, Lj0/b;

    .line 115
    .line 116
    new-array v13, v11, [Ly0/n;

    .line 117
    .line 118
    invoke-direct {v8, v13}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_8
    if-eqz v7, :cond_9

    .line 122
    .line 123
    invoke-virtual {v8, v7}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object v7, v2

    .line 127
    :cond_9
    invoke-virtual {v8, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_a
    :goto_7
    iget-object v10, v10, Ly0/n;->l:Ly0/n;

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_b
    if-ne v12, v9, :cond_c

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_c
    invoke-static {v8}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    goto :goto_2

    .line 141
    :cond_d
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 142
    .line 143
    if-eqz v1, :cond_e

    .line 144
    .line 145
    iget-object v1, p0, Ls1/j;->a:Lj0/b;

    .line 146
    .line 147
    iget-object v4, v1, Lj0/b;->g:[Ljava/lang/Object;

    .line 148
    .line 149
    iget v1, v1, Lj0/b;->i:I

    .line 150
    .line 151
    move v5, v3

    .line 152
    :goto_8
    if-ge v5, v1, :cond_e

    .line 153
    .line 154
    aget-object v6, v4, v5

    .line 155
    .line 156
    check-cast v6, Ls1/i;

    .line 157
    .line 158
    invoke-virtual {v6, p1}, Ls1/i;->d(Lh0/q0;)Z

    .line 159
    .line 160
    .line 161
    add-int/lit8 v5, v5, 0x1

    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_e
    :goto_9
    invoke-virtual {p0, p1}, Ls1/i;->b(Lh0/q0;)V

    .line 165
    .line 166
    .line 167
    iget p1, v0, Lf/p;->j:I

    .line 168
    .line 169
    iget-object v1, v0, Lf/p;->i:[Ljava/lang/Object;

    .line 170
    .line 171
    move v4, v3

    .line 172
    :goto_a
    if-ge v4, p1, :cond_f

    .line 173
    .line 174
    aput-object v2, v1, v4

    .line 175
    .line 176
    add-int/lit8 v4, v4, 0x1

    .line 177
    .line 178
    goto :goto_a

    .line 179
    :cond_f
    iput v3, v0, Lf/p;->j:I

    .line 180
    .line 181
    iput-boolean v3, v0, Lf/p;->g:Z

    .line 182
    .line 183
    iput-object v2, p0, Ls1/i;->f:Lx1/i1;

    .line 184
    .line 185
    return v9
.end method

.method public final e(Lh0/q0;Z)Z
    .locals 13

    .line 1
    iget-object v0, p0, Ls1/i;->e:Lf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf/p;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Ls1/i;->c:Ly0/n;

    .line 12
    .line 13
    iget-boolean v2, v0, Ly0/n;->t:Z

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object v2, v0, Ly0/n;->n:Lx1/i1;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v2, v2, Lx1/i1;->u:Lx1/f0;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Lx1/f0;->H()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move v2, v1

    .line 32
    :goto_0
    if-nez v2, :cond_3

    .line 33
    .line 34
    :goto_1
    return v1

    .line 35
    :cond_3
    iget-object v2, p0, Ls1/i;->g:Ls1/k;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, p0, Ls1/i;->f:Lx1/i1;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-wide v3, v3, Lv1/b1;->i:J

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    move-object v6, v0

    .line 49
    move-object v7, v5

    .line 50
    :goto_2
    const/16 v8, 0x10

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-eqz v6, :cond_d

    .line 54
    .line 55
    instance-of v10, v6, Lx1/w1;

    .line 56
    .line 57
    if-eqz v10, :cond_4

    .line 58
    .line 59
    move-object v10, v6

    .line 60
    check-cast v10, Lx1/w1;

    .line 61
    .line 62
    sget-object v11, Ls1/l;->g:Ls1/l;

    .line 63
    .line 64
    invoke-interface {v10, v2, v11, v3, v4}, Lx1/w1;->P(Ls1/k;Ls1/l;J)V

    .line 65
    .line 66
    .line 67
    move v10, v1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v10, v9

    .line 70
    :goto_3
    if-eqz v10, :cond_c

    .line 71
    .line 72
    iget v10, v6, Ly0/n;->i:I

    .line 73
    .line 74
    and-int/2addr v10, v8

    .line 75
    if-eqz v10, :cond_5

    .line 76
    .line 77
    move v10, v9

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    move v10, v1

    .line 80
    :goto_4
    if-eqz v10, :cond_c

    .line 81
    .line 82
    instance-of v10, v6, Lx1/j;

    .line 83
    .line 84
    if-eqz v10, :cond_c

    .line 85
    .line 86
    move-object v10, v6

    .line 87
    check-cast v10, Lx1/j;

    .line 88
    .line 89
    iget-object v10, v10, Lx1/j;->v:Ly0/n;

    .line 90
    .line 91
    move v11, v1

    .line 92
    :goto_5
    if-eqz v10, :cond_b

    .line 93
    .line 94
    iget v12, v10, Ly0/n;->i:I

    .line 95
    .line 96
    and-int/2addr v12, v8

    .line 97
    if-eqz v12, :cond_6

    .line 98
    .line 99
    move v12, v9

    .line 100
    goto :goto_6

    .line 101
    :cond_6
    move v12, v1

    .line 102
    :goto_6
    if-eqz v12, :cond_a

    .line 103
    .line 104
    add-int/lit8 v11, v11, 0x1

    .line 105
    .line 106
    if-ne v11, v9, :cond_7

    .line 107
    .line 108
    move-object v6, v10

    .line 109
    goto :goto_7

    .line 110
    :cond_7
    if-nez v7, :cond_8

    .line 111
    .line 112
    new-instance v7, Lj0/b;

    .line 113
    .line 114
    new-array v12, v8, [Ly0/n;

    .line 115
    .line 116
    invoke-direct {v7, v12}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_8
    if-eqz v6, :cond_9

    .line 120
    .line 121
    invoke-virtual {v7, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    move-object v6, v5

    .line 125
    :cond_9
    invoke-virtual {v7, v10}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_a
    :goto_7
    iget-object v10, v10, Ly0/n;->l:Ly0/n;

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_b
    if-ne v11, v9, :cond_c

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_c
    invoke-static {v7}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    goto :goto_2

    .line 139
    :cond_d
    iget-boolean v6, v0, Ly0/n;->t:Z

    .line 140
    .line 141
    if-eqz v6, :cond_e

    .line 142
    .line 143
    iget-object v6, p0, Ls1/j;->a:Lj0/b;

    .line 144
    .line 145
    iget-object v7, v6, Lj0/b;->g:[Ljava/lang/Object;

    .line 146
    .line 147
    iget v6, v6, Lj0/b;->i:I

    .line 148
    .line 149
    move v10, v1

    .line 150
    :goto_8
    if-ge v10, v6, :cond_e

    .line 151
    .line 152
    aget-object v11, v7, v10

    .line 153
    .line 154
    check-cast v11, Ls1/i;

    .line 155
    .line 156
    iget-object v12, p0, Ls1/i;->f:Lx1/i1;

    .line 157
    .line 158
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11, p1, p2}, Ls1/i;->e(Lh0/q0;Z)Z

    .line 162
    .line 163
    .line 164
    add-int/lit8 v10, v10, 0x1

    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_e
    iget-boolean p1, v0, Ly0/n;->t:Z

    .line 168
    .line 169
    if-eqz p1, :cond_18

    .line 170
    .line 171
    move-object p1, v5

    .line 172
    :goto_9
    if-eqz v0, :cond_18

    .line 173
    .line 174
    instance-of p2, v0, Lx1/w1;

    .line 175
    .line 176
    if-eqz p2, :cond_f

    .line 177
    .line 178
    move-object p2, v0

    .line 179
    check-cast p2, Lx1/w1;

    .line 180
    .line 181
    sget-object v6, Ls1/l;->h:Ls1/l;

    .line 182
    .line 183
    invoke-interface {p2, v2, v6, v3, v4}, Lx1/w1;->P(Ls1/k;Ls1/l;J)V

    .line 184
    .line 185
    .line 186
    move p2, v1

    .line 187
    goto :goto_a

    .line 188
    :cond_f
    move p2, v9

    .line 189
    :goto_a
    if-eqz p2, :cond_17

    .line 190
    .line 191
    iget p2, v0, Ly0/n;->i:I

    .line 192
    .line 193
    and-int/2addr p2, v8

    .line 194
    if-eqz p2, :cond_10

    .line 195
    .line 196
    move p2, v9

    .line 197
    goto :goto_b

    .line 198
    :cond_10
    move p2, v1

    .line 199
    :goto_b
    if-eqz p2, :cond_17

    .line 200
    .line 201
    instance-of p2, v0, Lx1/j;

    .line 202
    .line 203
    if-eqz p2, :cond_17

    .line 204
    .line 205
    move-object p2, v0

    .line 206
    check-cast p2, Lx1/j;

    .line 207
    .line 208
    iget-object p2, p2, Lx1/j;->v:Ly0/n;

    .line 209
    .line 210
    move v6, v1

    .line 211
    :goto_c
    if-eqz p2, :cond_16

    .line 212
    .line 213
    iget v7, p2, Ly0/n;->i:I

    .line 214
    .line 215
    and-int/2addr v7, v8

    .line 216
    if-eqz v7, :cond_11

    .line 217
    .line 218
    move v7, v9

    .line 219
    goto :goto_d

    .line 220
    :cond_11
    move v7, v1

    .line 221
    :goto_d
    if-eqz v7, :cond_15

    .line 222
    .line 223
    add-int/lit8 v6, v6, 0x1

    .line 224
    .line 225
    if-ne v6, v9, :cond_12

    .line 226
    .line 227
    move-object v0, p2

    .line 228
    goto :goto_e

    .line 229
    :cond_12
    if-nez p1, :cond_13

    .line 230
    .line 231
    new-instance p1, Lj0/b;

    .line 232
    .line 233
    new-array v7, v8, [Ly0/n;

    .line 234
    .line 235
    invoke-direct {p1, v7}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_13
    if-eqz v0, :cond_14

    .line 239
    .line 240
    invoke-virtual {p1, v0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    move-object v0, v5

    .line 244
    :cond_14
    invoke-virtual {p1, p2}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_15
    :goto_e
    iget-object p2, p2, Ly0/n;->l:Ly0/n;

    .line 248
    .line 249
    goto :goto_c

    .line 250
    :cond_16
    if-ne v6, v9, :cond_17

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_17
    invoke-static {p1}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    goto :goto_9

    .line 258
    :cond_18
    return v9
.end method

.method public final f(JLf/f0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ls1/i;->d:La5/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, La5/a;->e(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p3, p0}, Lf/f0;->g(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, La5/a;->p(J)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Ls1/i;->e:Lf/p;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lf/p;->c(J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    iget-object v0, p0, Ls1/j;->a:Lj0/b;

    .line 25
    .line 26
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 27
    .line 28
    iget v0, v0, Lj0/b;->i:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_1
    if-ge v2, v0, :cond_2

    .line 32
    .line 33
    aget-object v3, v1, v2

    .line 34
    .line 35
    check-cast v3, Ls1/i;

    .line 36
    .line 37
    invoke-virtual {v3, p1, p2, p3}, Ls1/i;->f(JLf/f0;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Node(modifierNode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ls1/i;->c:Ly0/n;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", children="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ls1/j;->a:Lj0/b;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pointerIds="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ls1/i;->d:La5/a;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x29

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
