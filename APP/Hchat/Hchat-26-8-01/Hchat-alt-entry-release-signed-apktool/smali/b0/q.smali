.class public final synthetic Lb0/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p2, p0, Lb0/q;->g:I

    iput-object p1, p0, Lb0/q;->i:Ljava/lang/Object;

    iput-object p3, p0, Lb0/q;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 12
    iput p4, p0, Lb0/q;->g:I

    iput-object p1, p0, Lb0/q;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb0/q;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lz/g;Lz/c;I)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    iput p3, p0, Lb0/q;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb0/q;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lb0/q;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method private final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 66

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lb0/q;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ls/b0;

    .line 6
    .line 7
    iget-object v2, v1, Lb0/q;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lr/o;

    .line 10
    .line 11
    move-object/from16 v3, p1

    .line 12
    .line 13
    check-cast v3, Lv1/k1;

    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    check-cast v4, Lu2/a;

    .line 18
    .line 19
    new-instance v14, Ls/f0;

    .line 20
    .line 21
    invoke-direct {v14, v0, v3}, Ls/f0;-><init>(Ls/b0;Lv1/k1;)V

    .line 22
    .line 23
    .line 24
    iget-wide v4, v4, Lu2/a;->a:J

    .line 25
    .line 26
    iget-object v0, v2, Lr/o;->f:Lp/g;

    .line 27
    .line 28
    iget-object v6, v2, Lr/o;->e:Lp/i;

    .line 29
    .line 30
    iget-object v7, v2, Lr/o;->c:Lp/x0;

    .line 31
    .line 32
    iget-boolean v8, v2, Lr/o;->b:Z

    .line 33
    .line 34
    iget-object v9, v2, Lr/o;->a:Lr/z;

    .line 35
    .line 36
    iget-object v10, v9, Lr/z;->t:Li0/a1;

    .line 37
    .line 38
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-boolean v10, v9, Lr/z;->b:Z

    .line 42
    .line 43
    if-nez v10, :cond_1

    .line 44
    .line 45
    invoke-interface {v3}, Lv1/o;->u0()Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-eqz v10, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/16 v24, 0x0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    const/16 v24, 0x1

    .line 56
    .line 57
    :goto_1
    sget-object v29, Lm/p1;->h:Lm/p1;

    .line 58
    .line 59
    sget-object v30, Lm/p1;->g:Lm/p1;

    .line 60
    .line 61
    if-eqz v8, :cond_2

    .line 62
    .line 63
    move-object/from16 v10, v30

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move-object/from16 v10, v29

    .line 67
    .line 68
    :goto_2
    invoke-static {v4, v5, v10}, Lk/n;->h(JLm/p1;)V

    .line 69
    .line 70
    .line 71
    sget-object v10, Lu2/m;->g:Lu2/m;

    .line 72
    .line 73
    if-eqz v8, :cond_3

    .line 74
    .line 75
    invoke-interface {v3}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 76
    .line 77
    .line 78
    move-result-object v13

    .line 79
    invoke-interface {v7, v13}, Lp/x0;->d(Lu2/m;)F

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    invoke-interface {v3, v13}, Lu2/c;->G0(F)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    goto :goto_4

    .line 88
    :cond_3
    invoke-interface {v3}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    if-ne v13, v10, :cond_4

    .line 93
    .line 94
    invoke-interface {v7, v13}, Lp/x0;->d(Lu2/m;)F

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-interface {v7, v13}, Lp/x0;->b(Lu2/m;)F

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    :goto_3
    invoke-interface {v3, v13}, Lu2/c;->G0(F)I

    .line 104
    .line 105
    .line 106
    move-result v13

    .line 107
    :goto_4
    if-eqz v8, :cond_5

    .line 108
    .line 109
    invoke-interface {v3}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    invoke-interface {v7, v15}, Lp/x0;->b(Lu2/m;)F

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    invoke-interface {v3, v15}, Lu2/c;->G0(F)I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    goto :goto_6

    .line 122
    :cond_5
    invoke-interface {v3}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 123
    .line 124
    .line 125
    move-result-object v15

    .line 126
    if-ne v15, v10, :cond_6

    .line 127
    .line 128
    invoke-interface {v7, v15}, Lp/x0;->b(Lu2/m;)F

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    goto :goto_5

    .line 133
    :cond_6
    invoke-interface {v7, v15}, Lp/x0;->d(Lu2/m;)F

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    :goto_5
    invoke-interface {v3, v15}, Lu2/c;->G0(F)I

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    :goto_6
    invoke-interface {v7}, Lp/x0;->c()F

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    invoke-interface {v3, v11}, Lu2/c;->G0(F)I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    invoke-interface {v7}, Lp/x0;->a()F

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-interface {v3, v7}, Lu2/c;->G0(F)I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    add-int/2addr v7, v11

    .line 158
    move-object/from16 v20, v0

    .line 159
    .line 160
    add-int v0, v13, v15

    .line 161
    .line 162
    if-eqz v8, :cond_7

    .line 163
    .line 164
    move/from16 v16, v7

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_7
    move/from16 v16, v0

    .line 168
    .line 169
    :goto_7
    if-eqz v8, :cond_8

    .line 170
    .line 171
    move v15, v11

    .line 172
    goto :goto_8

    .line 173
    :cond_8
    if-nez v8, :cond_9

    .line 174
    .line 175
    move v15, v13

    .line 176
    :cond_9
    :goto_8
    sub-int v22, v16, v15

    .line 177
    .line 178
    neg-int v12, v0

    .line 179
    move/from16 v31, v0

    .line 180
    .line 181
    neg-int v0, v7

    .line 182
    invoke-static {v12, v0, v4, v5}, Lu2/b;->i(IIJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v16

    .line 186
    iget-object v0, v2, Lr/o;->d:Lfg/a;

    .line 187
    .line 188
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, Lr/k;

    .line 193
    .line 194
    iget-object v12, v0, Lr/k;->c:Lr/d;

    .line 195
    .line 196
    move-object/from16 v18, v0

    .line 197
    .line 198
    invoke-static/range {v16 .. v17}, Lu2/a;->h(J)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    invoke-static/range {v16 .. v17}, Lu2/a;->g(J)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    move-wide/from16 v25, v4

    .line 207
    .line 208
    iget-object v4, v12, Lr/d;->a:Li0/g1;

    .line 209
    .line 210
    invoke-virtual {v4, v0}, Li0/g1;->h(I)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v12, Lr/d;->b:Li0/g1;

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Li0/g1;->h(I)V

    .line 216
    .line 217
    .line 218
    const-string v0, "null verticalArrangement when isVertical == true"

    .line 219
    .line 220
    if-eqz v8, :cond_b

    .line 221
    .line 222
    if-eqz v6, :cond_a

    .line 223
    .line 224
    invoke-interface {v6}, Lp/i;->a()F

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    goto :goto_a

    .line 229
    :cond_a
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Lokio/a;->c()V

    .line 233
    .line 234
    .line 235
    :goto_9
    const/4 v0, 0x0

    .line 236
    return-object v0

    .line 237
    :cond_b
    if-eqz v20, :cond_8b

    .line 238
    .line 239
    invoke-interface/range {v20 .. v20}, Lp/g;->a()F

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    :goto_a
    invoke-interface {v3, v1}, Lu2/c;->G0(F)I

    .line 244
    .line 245
    .line 246
    move-result v23

    .line 247
    invoke-virtual/range {v18 .. v18}, Lr/k;->c()I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v8, :cond_c

    .line 252
    .line 253
    invoke-static/range {v25 .. v26}, Lu2/a;->g(J)I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    sub-int/2addr v4, v7

    .line 258
    goto :goto_b

    .line 259
    :cond_c
    invoke-static/range {v25 .. v26}, Lu2/a;->h(J)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    sub-int v4, v4, v31

    .line 264
    .line 265
    :goto_b
    int-to-long v12, v13

    .line 266
    const/16 v32, 0x20

    .line 267
    .line 268
    shl-long v12, v12, v32

    .line 269
    .line 270
    move-object/from16 v21, v0

    .line 271
    .line 272
    move v5, v1

    .line 273
    int-to-long v0, v11

    .line 274
    const-wide v33, 0xffffffffL

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    and-long v0, v0, v33

    .line 280
    .line 281
    or-long/2addr v0, v12

    .line 282
    move v11, v5

    .line 283
    new-instance v5, Lr/n;

    .line 284
    .line 285
    iget-boolean v8, v2, Lr/o;->b:Z

    .line 286
    .line 287
    iget-object v13, v2, Lr/o;->j:Ly0/e;

    .line 288
    .line 289
    move-object v12, v10

    .line 290
    move-object v10, v14

    .line 291
    iget-object v14, v2, Lr/o;->k:Ly0/f;

    .line 292
    .line 293
    move-wide/from16 v27, v0

    .line 294
    .line 295
    iget-object v0, v2, Lr/o;->a:Lr/z;

    .line 296
    .line 297
    move-object/from16 v19, v0

    .line 298
    .line 299
    move-object/from16 v37, v6

    .line 300
    .line 301
    move/from16 v38, v7

    .line 302
    .line 303
    move-object/from16 p1, v9

    .line 304
    .line 305
    move-wide/from16 v6, v16

    .line 306
    .line 307
    move-object/from16 v9, v18

    .line 308
    .line 309
    move/from16 v16, v22

    .line 310
    .line 311
    move-wide/from16 v35, v25

    .line 312
    .line 313
    move-wide/from16 v17, v27

    .line 314
    .line 315
    const/4 v0, 0x1

    .line 316
    const/4 v1, 0x0

    .line 317
    move-object/from16 v22, v12

    .line 318
    .line 319
    move/from16 v12, v23

    .line 320
    .line 321
    invoke-direct/range {v5 .. v19}, Lr/n;-><init>(JZLr/k;Ls/f0;IILy0/e;Ly0/f;IIJLr/z;)V

    .line 322
    .line 323
    .line 324
    move-object v14, v10

    .line 325
    move v13, v15

    .line 326
    move v15, v11

    .line 327
    move-wide/from16 v64, v6

    .line 328
    .line 329
    move-object v7, v5

    .line 330
    move v6, v12

    .line 331
    move/from16 v5, v16

    .line 332
    .line 333
    move-wide/from16 v11, v64

    .line 334
    .line 335
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    const/16 v39, 0x0

    .line 340
    .line 341
    if-eqz v8, :cond_d

    .line 342
    .line 343
    invoke-virtual {v8}, Lw0/f;->e()Lfg/l;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    goto :goto_c

    .line 348
    :cond_d
    move-object/from16 v10, v39

    .line 349
    .line 350
    :goto_c
    invoke-static {v8}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    move/from16 v40, v0

    .line 355
    .line 356
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lr/z;->h()I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    move/from16 v41, v6

    .line 361
    .line 362
    move-object/from16 v6, p1

    .line 363
    .line 364
    move/from16 p1, v5

    .line 365
    .line 366
    iget-object v5, v6, Lr/z;->e:Lb/f;

    .line 367
    .line 368
    move-object/from16 v42, v14

    .line 369
    .line 370
    iget-object v14, v5, Lb/f;->d:Ljava/lang/Object;

    .line 371
    .line 372
    invoke-static {v0, v14, v9}, Ls/o;->f(ILjava/lang/Object;Lr/k;)I

    .line 373
    .line 374
    .line 375
    move-result v14

    .line 376
    if-eq v0, v14, :cond_e

    .line 377
    .line 378
    move/from16 v43, v4

    .line 379
    .line 380
    iget-object v4, v5, Lb/f;->b:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v4, Li0/g1;

    .line 383
    .line 384
    invoke-virtual {v4, v14}, Li0/g1;->h(I)V

    .line 385
    .line 386
    .line 387
    iget-object v4, v5, Lb/f;->e:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v4, Ls/g0;

    .line 390
    .line 391
    iget v5, v4, Ls/g0;->h:I

    .line 392
    .line 393
    if-eq v0, v5, :cond_f

    .line 394
    .line 395
    iput v0, v4, Ls/g0;->h:I

    .line 396
    .line 397
    div-int/lit8 v0, v0, 0x1e

    .line 398
    .line 399
    mul-int/lit8 v0, v0, 0x1e

    .line 400
    .line 401
    add-int/lit8 v5, v0, -0x64

    .line 402
    .line 403
    move/from16 v16, v14

    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    invoke-static {v5, v14}, Ljava/lang/Math;->max(II)I

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    add-int/lit16 v0, v0, 0x82

    .line 411
    .line 412
    invoke-static {v5, v0}, Lr9/e0;->r0(II)Llg/d;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    iget-object v4, v4, Ls/g0;->g:Li0/j1;

    .line 417
    .line 418
    invoke-virtual {v4, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    goto :goto_d

    .line 422
    :cond_e
    move/from16 v43, v4

    .line 423
    .line 424
    :cond_f
    move/from16 v16, v14

    .line 425
    .line 426
    :goto_d
    invoke-virtual {v6}, Lr/z;->i()I

    .line 427
    .line 428
    .line 429
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 430
    invoke-static {v8, v1, v10}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 431
    .line 432
    .line 433
    iget-object v1, v6, Lr/z;->s:Ls/j0;

    .line 434
    .line 435
    iget-object v4, v6, Lr/z;->p:Lm/c;

    .line 436
    .line 437
    iget-object v5, v4, Lm/c;->a:Lj0/b;

    .line 438
    .line 439
    iget v8, v5, Lj0/b;->i:I

    .line 440
    .line 441
    if-eqz v8, :cond_10

    .line 442
    .line 443
    move/from16 v8, v40

    .line 444
    .line 445
    goto :goto_e

    .line 446
    :cond_10
    const/4 v8, 0x0

    .line 447
    :goto_e
    sget-object v10, Ltf/t;->g:Ltf/t;

    .line 448
    .line 449
    if-nez v8, :cond_11

    .line 450
    .line 451
    iget-object v8, v1, Ls/j0;->g:Lw0/p;

    .line 452
    .line 453
    invoke-virtual {v8}, Lw0/p;->isEmpty()Z

    .line 454
    .line 455
    .line 456
    move-result v8

    .line 457
    if-eqz v8, :cond_11

    .line 458
    .line 459
    move/from16 v18, v0

    .line 460
    .line 461
    move-object v8, v10

    .line 462
    move-object/from16 v44, v8

    .line 463
    .line 464
    goto/16 :goto_16

    .line 465
    .line 466
    :cond_11
    new-instance v8, Ljava/util/ArrayList;

    .line 467
    .line 468
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 469
    .line 470
    .line 471
    iget-object v4, v4, Lm/c;->a:Lj0/b;

    .line 472
    .line 473
    iget v4, v4, Lj0/b;->i:I

    .line 474
    .line 475
    if-eqz v4, :cond_19

    .line 476
    .line 477
    new-instance v4, Llg/d;

    .line 478
    .line 479
    iget v14, v5, Lj0/b;->i:I

    .line 480
    .line 481
    const-string v17, "MutableVector is empty."

    .line 482
    .line 483
    if-eqz v14, :cond_18

    .line 484
    .line 485
    move/from16 v18, v0

    .line 486
    .line 487
    iget-object v0, v5, Lj0/b;->g:[Ljava/lang/Object;

    .line 488
    .line 489
    const/16 v19, 0x0

    .line 490
    .line 491
    aget-object v23, v0, v19

    .line 492
    .line 493
    move-object/from16 v19, v0

    .line 494
    .line 495
    move-object/from16 v0, v23

    .line 496
    .line 497
    check-cast v0, Ls/m;

    .line 498
    .line 499
    iget v0, v0, Ls/m;->a:I

    .line 500
    .line 501
    move-object/from16 v44, v10

    .line 502
    .line 503
    const/4 v10, 0x0

    .line 504
    :goto_f
    if-ge v10, v14, :cond_13

    .line 505
    .line 506
    aget-object v23, v19, v10

    .line 507
    .line 508
    move/from16 v25, v10

    .line 509
    .line 510
    move-object/from16 v10, v23

    .line 511
    .line 512
    check-cast v10, Ls/m;

    .line 513
    .line 514
    iget v10, v10, Ls/m;->a:I

    .line 515
    .line 516
    if-ge v10, v0, :cond_12

    .line 517
    .line 518
    move v0, v10

    .line 519
    :cond_12
    add-int/lit8 v10, v25, 0x1

    .line 520
    .line 521
    goto :goto_f

    .line 522
    :cond_13
    if-ltz v0, :cond_14

    .line 523
    .line 524
    goto :goto_10

    .line 525
    :cond_14
    const-string v10, "negative minIndex"

    .line 526
    .line 527
    invoke-static {v10}, Lo/b;->a(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :goto_10
    iget v10, v5, Lj0/b;->i:I

    .line 531
    .line 532
    if-eqz v10, :cond_17

    .line 533
    .line 534
    iget-object v5, v5, Lj0/b;->g:[Ljava/lang/Object;

    .line 535
    .line 536
    const/4 v14, 0x0

    .line 537
    aget-object v17, v5, v14

    .line 538
    .line 539
    move-object/from16 v14, v17

    .line 540
    .line 541
    check-cast v14, Ls/m;

    .line 542
    .line 543
    iget v14, v14, Ls/m;->b:I

    .line 544
    .line 545
    move-object/from16 v17, v5

    .line 546
    .line 547
    move v5, v14

    .line 548
    const/4 v14, 0x0

    .line 549
    :goto_11
    if-ge v14, v10, :cond_16

    .line 550
    .line 551
    aget-object v19, v17, v14

    .line 552
    .line 553
    move/from16 v23, v10

    .line 554
    .line 555
    move-object/from16 v10, v19

    .line 556
    .line 557
    check-cast v10, Ls/m;

    .line 558
    .line 559
    iget v10, v10, Ls/m;->b:I

    .line 560
    .line 561
    if-le v10, v5, :cond_15

    .line 562
    .line 563
    move v5, v10

    .line 564
    :cond_15
    add-int/lit8 v14, v14, 0x1

    .line 565
    .line 566
    move/from16 v10, v23

    .line 567
    .line 568
    goto :goto_11

    .line 569
    :cond_16
    invoke-virtual {v9}, Lr/k;->c()I

    .line 570
    .line 571
    .line 572
    move-result v10

    .line 573
    add-int/lit8 v10, v10, -0x1

    .line 574
    .line 575
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 576
    .line 577
    .line 578
    move-result v5

    .line 579
    move/from16 v10, v40

    .line 580
    .line 581
    invoke-direct {v4, v0, v5, v10}, Llg/b;-><init>(III)V

    .line 582
    .line 583
    .line 584
    goto :goto_12

    .line 585
    :cond_17
    invoke-static/range {v17 .. v17}, Lj8/o;->l(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_9

    .line 589
    .line 590
    :cond_18
    invoke-static/range {v17 .. v17}, Lj8/o;->l(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    goto/16 :goto_9

    .line 594
    .line 595
    :cond_19
    move/from16 v18, v0

    .line 596
    .line 597
    move-object/from16 v44, v10

    .line 598
    .line 599
    sget-object v4, Llg/d;->j:Llg/d;

    .line 600
    .line 601
    :goto_12
    iget-object v0, v1, Ls/j0;->g:Lw0/p;

    .line 602
    .line 603
    invoke-virtual {v0}, Lw0/p;->size()I

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    const/4 v5, 0x0

    .line 608
    :goto_13
    if-ge v5, v0, :cond_1c

    .line 609
    .line 610
    invoke-virtual {v1, v5}, Ls/j0;->get(I)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v10

    .line 614
    check-cast v10, Ls/h0;

    .line 615
    .line 616
    iget-object v14, v10, Ls/h0;->a:Ljava/lang/Object;

    .line 617
    .line 618
    iget v10, v10, Ls/h0;->c:I

    .line 619
    .line 620
    invoke-static {v10, v14, v9}, Ls/o;->f(ILjava/lang/Object;Lr/k;)I

    .line 621
    .line 622
    .line 623
    move-result v10

    .line 624
    iget v14, v4, Llg/b;->g:I

    .line 625
    .line 626
    move/from16 v17, v0

    .line 627
    .line 628
    iget v0, v4, Llg/b;->h:I

    .line 629
    .line 630
    if-gt v10, v0, :cond_1a

    .line 631
    .line 632
    if-gt v14, v10, :cond_1a

    .line 633
    .line 634
    goto :goto_14

    .line 635
    :cond_1a
    if-ltz v10, :cond_1b

    .line 636
    .line 637
    invoke-virtual {v9}, Lr/k;->c()I

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-ge v10, v0, :cond_1b

    .line 642
    .line 643
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    :cond_1b
    :goto_14
    add-int/lit8 v5, v5, 0x1

    .line 651
    .line 652
    move/from16 v0, v17

    .line 653
    .line 654
    goto :goto_13

    .line 655
    :cond_1c
    iget v0, v4, Llg/b;->g:I

    .line 656
    .line 657
    iget v1, v4, Llg/b;->h:I

    .line 658
    .line 659
    if-gt v0, v1, :cond_1d

    .line 660
    .line 661
    :goto_15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    if-eq v0, v1, :cond_1d

    .line 669
    .line 670
    add-int/lit8 v0, v0, 0x1

    .line 671
    .line 672
    goto :goto_15

    .line 673
    :cond_1d
    :goto_16
    invoke-interface {v3}, Lv1/o;->u0()Z

    .line 674
    .line 675
    .line 676
    move-result v0

    .line 677
    if-nez v0, :cond_1f

    .line 678
    .line 679
    if-nez v24, :cond_1e

    .line 680
    .line 681
    goto :goto_17

    .line 682
    :cond_1e
    iget-object v0, v6, Lr/z;->x:Lp4/t;

    .line 683
    .line 684
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Li/l;

    .line 687
    .line 688
    iget-object v0, v0, Li/l;->h:Li0/j1;

    .line 689
    .line 690
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    check-cast v0, Ljava/lang/Number;

    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    goto :goto_18

    .line 701
    :cond_1f
    :goto_17
    iget v0, v6, Lr/z;->h:F

    .line 702
    .line 703
    :goto_18
    iget-boolean v1, v2, Lr/o;->b:Z

    .line 704
    .line 705
    move v4, v15

    .line 706
    iget-object v15, v6, Lr/z;->o:Ls/z;

    .line 707
    .line 708
    invoke-interface {v3}, Lv1/o;->u0()Z

    .line 709
    .line 710
    .line 711
    move-result v23

    .line 712
    iget-object v5, v2, Lr/o;->g:Lqg/t;

    .line 713
    .line 714
    iget-object v14, v6, Lr/z;->w:Li0/a1;

    .line 715
    .line 716
    iget-object v9, v2, Lr/o;->h:Lf1/z;

    .line 717
    .line 718
    iget-object v2, v2, Lr/o;->i:Ls/h;

    .line 719
    .line 720
    iget-boolean v10, v6, Lr/z;->i:Z

    .line 721
    .line 722
    if-ltz v13, :cond_20

    .line 723
    .line 724
    goto :goto_19

    .line 725
    :cond_20
    const-string v17, "invalid beforeContentPadding"

    .line 726
    .line 727
    invoke-static/range {v17 .. v17}, Lo/b;->a(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    :goto_19
    if-ltz p1, :cond_21

    .line 731
    .line 732
    :goto_1a
    move/from16 v17, v0

    .line 733
    .line 734
    goto :goto_1b

    .line 735
    :cond_21
    const-string v17, "invalid afterContentPadding"

    .line 736
    .line 737
    invoke-static/range {v17 .. v17}, Lo/b;->a(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    goto :goto_1a

    .line 741
    :goto_1b
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 742
    .line 743
    move/from16 v19, v1

    .line 744
    .line 745
    iget-object v1, v7, Lr/n;->b:Lr/k;

    .line 746
    .line 747
    move-object/from16 v27, v5

    .line 748
    .line 749
    move-object/from16 v45, v6

    .line 750
    .line 751
    const-wide/16 v5, 0x0

    .line 752
    .line 753
    if-gtz v4, :cond_24

    .line 754
    .line 755
    invoke-static {v11, v12}, Lu2/a;->j(J)I

    .line 756
    .line 757
    .line 758
    move-result v17

    .line 759
    invoke-static {v11, v12}, Lu2/a;->i(J)I

    .line 760
    .line 761
    .line 762
    move-result v18

    .line 763
    move/from16 v22, v19

    .line 764
    .line 765
    new-instance v19, Ljava/util/ArrayList;

    .line 766
    .line 767
    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 768
    .line 769
    .line 770
    iget-object v1, v1, Lr/k;->d:Lac/k;

    .line 771
    .line 772
    const/16 v25, 0x0

    .line 773
    .line 774
    const/16 v26, 0x0

    .line 775
    .line 776
    const/16 v16, 0x0

    .line 777
    .line 778
    move-object/from16 v20, v1

    .line 779
    .line 780
    move-object/from16 v21, v7

    .line 781
    .line 782
    move-object/from16 v28, v9

    .line 783
    .line 784
    invoke-virtual/range {v15 .. v28}, Ls/z;->c(IIILjava/util/ArrayList;Lac/k;Lr/n;ZZZIILqg/t;Lf1/z;)V

    .line 785
    .line 786
    .line 787
    move-object/from16 v16, v15

    .line 788
    .line 789
    move-object/from16 v15, v21

    .line 790
    .line 791
    move/from16 v19, v22

    .line 792
    .line 793
    if-nez v23, :cond_22

    .line 794
    .line 795
    invoke-virtual/range {v16 .. v16}, Ls/z;->a()J

    .line 796
    .line 797
    .line 798
    move-result-wide v1

    .line 799
    invoke-static {v1, v2, v5, v6}, Lu2/l;->a(JJ)Z

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    if-nez v4, :cond_22

    .line 804
    .line 805
    shr-long v4, v1, v32

    .line 806
    .line 807
    long-to-int v4, v4

    .line 808
    invoke-static {v4, v11, v12}, Lu2/b;->g(IJ)I

    .line 809
    .line 810
    .line 811
    move-result v17

    .line 812
    and-long v1, v1, v33

    .line 813
    .line 814
    long-to-int v1, v1

    .line 815
    invoke-static {v1, v11, v12}, Lu2/b;->f(IJ)I

    .line 816
    .line 817
    .line 818
    move-result v18

    .line 819
    :cond_22
    new-instance v1, Li2/z;

    .line 820
    .line 821
    const/16 v2, 0xe

    .line 822
    .line 823
    invoke-direct {v1, v2}, Li2/z;-><init>(I)V

    .line 824
    .line 825
    .line 826
    add-int v2, v17, v31

    .line 827
    .line 828
    move-wide/from16 v4, v35

    .line 829
    .line 830
    invoke-static {v2, v4, v5}, Lu2/b;->g(IJ)I

    .line 831
    .line 832
    .line 833
    move-result v2

    .line 834
    add-int v6, v18, v38

    .line 835
    .line 836
    invoke-static {v6, v4, v5}, Lu2/b;->f(IJ)I

    .line 837
    .line 838
    .line 839
    move-result v4

    .line 840
    invoke-interface {v3, v2, v4, v0, v1}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 841
    .line 842
    .line 843
    move-result-object v10

    .line 844
    neg-int v0, v13

    .line 845
    add-int v4, v43, p1

    .line 846
    .line 847
    if-eqz v19, :cond_23

    .line 848
    .line 849
    move-object/from16 v21, v30

    .line 850
    .line 851
    goto :goto_1c

    .line 852
    :cond_23
    move-object/from16 v21, v29

    .line 853
    .line 854
    :goto_1c
    new-instance v5, Lr/p;

    .line 855
    .line 856
    const/4 v12, 0x0

    .line 857
    const/16 v20, 0x0

    .line 858
    .line 859
    const/4 v6, 0x0

    .line 860
    const/4 v7, 0x0

    .line 861
    const/4 v8, 0x0

    .line 862
    const/4 v9, 0x0

    .line 863
    const/4 v11, 0x0

    .line 864
    iget-wide v1, v15, Lr/n;->d:J

    .line 865
    .line 866
    move/from16 v22, p1

    .line 867
    .line 868
    move/from16 v18, v0

    .line 869
    .line 870
    move-wide v15, v1

    .line 871
    move/from16 v19, v4

    .line 872
    .line 873
    move-object/from16 v13, v27

    .line 874
    .line 875
    move/from16 v23, v41

    .line 876
    .line 877
    move-object/from16 v14, v42

    .line 878
    .line 879
    move-object/from16 v17, v44

    .line 880
    .line 881
    invoke-direct/range {v5 .. v23}, Lr/p;-><init>(Lr/q;IZFLv1/o0;FZLqg/t;Lu2/c;JLjava/util/List;IIILm/p1;II)V

    .line 882
    .line 883
    .line 884
    move-object v0, v3

    .line 885
    move-object/from16 v63, v45

    .line 886
    .line 887
    goto/16 :goto_6e

    .line 888
    .line 889
    :cond_24
    move-wide/from16 v25, v5

    .line 890
    .line 891
    move-object/from16 v28, v9

    .line 892
    .line 893
    move/from16 v5, v16

    .line 894
    .line 895
    move-object/from16 v6, v42

    .line 896
    .line 897
    move-object/from16 v16, v15

    .line 898
    .line 899
    move-object v15, v7

    .line 900
    move-wide/from16 v64, v35

    .line 901
    .line 902
    move/from16 v36, p1

    .line 903
    .line 904
    move-object/from16 v35, v2

    .line 905
    .line 906
    move-object/from16 p1, v3

    .line 907
    .line 908
    move-wide/from16 v2, v64

    .line 909
    .line 910
    if-lt v5, v4, :cond_25

    .line 911
    .line 912
    add-int/lit8 v5, v4, -0x1

    .line 913
    .line 914
    const/16 v18, 0x0

    .line 915
    .line 916
    :cond_25
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 917
    .line 918
    .line 919
    move-result v7

    .line 920
    sub-int v9, v18, v7

    .line 921
    .line 922
    if-nez v5, :cond_26

    .line 923
    .line 924
    if-gez v9, :cond_26

    .line 925
    .line 926
    add-int/2addr v7, v9

    .line 927
    const/4 v9, 0x0

    .line 928
    :cond_26
    move-object/from16 v42, v0

    .line 929
    .line 930
    new-instance v0, Ltf/k;

    .line 931
    .line 932
    invoke-direct {v0}, Ltf/k;-><init>()V

    .line 933
    .line 934
    .line 935
    move-wide/from16 v46, v2

    .line 936
    .line 937
    neg-int v2, v13

    .line 938
    if-gez v41, :cond_27

    .line 939
    .line 940
    move/from16 v3, v41

    .line 941
    .line 942
    goto :goto_1d

    .line 943
    :cond_27
    const/4 v3, 0x0

    .line 944
    :goto_1d
    add-int/2addr v3, v2

    .line 945
    add-int/2addr v9, v3

    .line 946
    move-object/from16 v48, v1

    .line 947
    .line 948
    move/from16 v49, v2

    .line 949
    .line 950
    move/from16 v18, v5

    .line 951
    .line 952
    const/4 v5, 0x0

    .line 953
    :goto_1e
    iget-wide v1, v15, Lr/n;->d:J

    .line 954
    .line 955
    if-gez v9, :cond_28

    .line 956
    .line 957
    if-lez v18, :cond_28

    .line 958
    .line 959
    move/from16 v50, v7

    .line 960
    .line 961
    add-int/lit8 v7, v18, -0x1

    .line 962
    .line 963
    invoke-virtual {v15, v7, v1, v2}, Lr/n;->a(IJ)Lr/q;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    const/4 v2, 0x0

    .line 968
    invoke-virtual {v0, v2, v1}, Ltf/k;->add(ILjava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    iget v2, v1, Lr/q;->r:I

    .line 972
    .line 973
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 974
    .line 975
    .line 976
    move-result v5

    .line 977
    iget v1, v1, Lr/q;->q:I

    .line 978
    .line 979
    add-int/2addr v9, v1

    .line 980
    move/from16 v18, v7

    .line 981
    .line 982
    move/from16 v7, v50

    .line 983
    .line 984
    goto :goto_1e

    .line 985
    :cond_28
    move/from16 v50, v7

    .line 986
    .line 987
    if-ge v9, v3, :cond_29

    .line 988
    .line 989
    sub-int v7, v3, v9

    .line 990
    .line 991
    sub-int v7, v50, v7

    .line 992
    .line 993
    move v9, v3

    .line 994
    goto :goto_1f

    .line 995
    :cond_29
    move/from16 v7, v50

    .line 996
    .line 997
    :goto_1f
    sub-int/2addr v9, v3

    .line 998
    add-int v50, v43, v36

    .line 999
    .line 1000
    move/from16 v51, v5

    .line 1001
    .line 1002
    if-gez v50, :cond_2a

    .line 1003
    .line 1004
    const/4 v5, 0x0

    .line 1005
    :goto_20
    move/from16 v52, v10

    .line 1006
    .line 1007
    goto :goto_21

    .line 1008
    :cond_2a
    move/from16 v5, v50

    .line 1009
    .line 1010
    goto :goto_20

    .line 1011
    :goto_21
    neg-int v10, v9

    .line 1012
    move/from16 v54, v9

    .line 1013
    .line 1014
    move-object/from16 v56, v14

    .line 1015
    .line 1016
    move/from16 v55, v18

    .line 1017
    .line 1018
    const/4 v9, 0x0

    .line 1019
    const/16 v53, 0x0

    .line 1020
    .line 1021
    :goto_22
    iget v14, v0, Ltf/k;->i:I

    .line 1022
    .line 1023
    if-ge v9, v14, :cond_2c

    .line 1024
    .line 1025
    if-lt v10, v5, :cond_2b

    .line 1026
    .line 1027
    invoke-virtual {v0, v9}, Ltf/k;->c(I)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    const/16 v53, 0x1

    .line 1031
    .line 1032
    goto :goto_22

    .line 1033
    :cond_2b
    add-int/lit8 v55, v55, 0x1

    .line 1034
    .line 1035
    invoke-virtual {v0, v9}, Ltf/k;->get(I)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v14

    .line 1039
    check-cast v14, Lr/q;

    .line 1040
    .line 1041
    iget v14, v14, Lr/q;->q:I

    .line 1042
    .line 1043
    add-int/2addr v10, v14

    .line 1044
    add-int/lit8 v9, v9, 0x1

    .line 1045
    .line 1046
    goto :goto_22

    .line 1047
    :cond_2c
    move/from16 v9, v51

    .line 1048
    .line 1049
    move/from16 v14, v55

    .line 1050
    .line 1051
    :goto_23
    if-ge v14, v4, :cond_2e

    .line 1052
    .line 1053
    if-lt v10, v5, :cond_2d

    .line 1054
    .line 1055
    if-lez v10, :cond_2d

    .line 1056
    .line 1057
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 1058
    .line 1059
    .line 1060
    move-result v51

    .line 1061
    if-eqz v51, :cond_2e

    .line 1062
    .line 1063
    :cond_2d
    move/from16 v51, v4

    .line 1064
    .line 1065
    goto :goto_24

    .line 1066
    :cond_2e
    move/from16 v51, v4

    .line 1067
    .line 1068
    move/from16 v4, v43

    .line 1069
    .line 1070
    goto :goto_26

    .line 1071
    :goto_24
    invoke-virtual {v15, v14, v1, v2}, Lr/n;->a(IJ)Lr/q;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v4

    .line 1075
    move/from16 v55, v5

    .line 1076
    .line 1077
    iget v5, v4, Lr/q;->q:I

    .line 1078
    .line 1079
    add-int/2addr v10, v5

    .line 1080
    if-gt v10, v3, :cond_2f

    .line 1081
    .line 1082
    move/from16 v57, v3

    .line 1083
    .line 1084
    add-int/lit8 v3, v51, -0x1

    .line 1085
    .line 1086
    if-eq v14, v3, :cond_30

    .line 1087
    .line 1088
    add-int/lit8 v3, v14, 0x1

    .line 1089
    .line 1090
    sub-int v54, v54, v5

    .line 1091
    .line 1092
    move/from16 v18, v3

    .line 1093
    .line 1094
    const/16 v53, 0x1

    .line 1095
    .line 1096
    goto :goto_25

    .line 1097
    :cond_2f
    move/from16 v57, v3

    .line 1098
    .line 1099
    :cond_30
    iget v3, v4, Lr/q;->r:I

    .line 1100
    .line 1101
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    .line 1102
    .line 1103
    .line 1104
    move-result v3

    .line 1105
    invoke-virtual {v0, v4}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 1106
    .line 1107
    .line 1108
    move v9, v3

    .line 1109
    :goto_25
    add-int/lit8 v14, v14, 0x1

    .line 1110
    .line 1111
    move/from16 v4, v51

    .line 1112
    .line 1113
    move/from16 v5, v55

    .line 1114
    .line 1115
    move/from16 v3, v57

    .line 1116
    .line 1117
    goto :goto_23

    .line 1118
    :goto_26
    if-ge v10, v4, :cond_33

    .line 1119
    .line 1120
    sub-int v3, v4, v10

    .line 1121
    .line 1122
    sub-int v54, v54, v3

    .line 1123
    .line 1124
    add-int/2addr v10, v3

    .line 1125
    move/from16 v5, v54

    .line 1126
    .line 1127
    :goto_27
    if-ge v5, v13, :cond_31

    .line 1128
    .line 1129
    if-lez v18, :cond_31

    .line 1130
    .line 1131
    move/from16 v43, v3

    .line 1132
    .line 1133
    add-int/lit8 v3, v18, -0x1

    .line 1134
    .line 1135
    move/from16 v54, v5

    .line 1136
    .line 1137
    invoke-virtual {v15, v3, v1, v2}, Lr/n;->a(IJ)Lr/q;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v5

    .line 1141
    move/from16 v18, v3

    .line 1142
    .line 1143
    const/4 v3, 0x0

    .line 1144
    invoke-virtual {v0, v3, v5}, Ltf/k;->add(ILjava/lang/Object;)V

    .line 1145
    .line 1146
    .line 1147
    iget v3, v5, Lr/q;->r:I

    .line 1148
    .line 1149
    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    .line 1150
    .line 1151
    .line 1152
    move-result v9

    .line 1153
    iget v3, v5, Lr/q;->q:I

    .line 1154
    .line 1155
    add-int v5, v54, v3

    .line 1156
    .line 1157
    move/from16 v3, v43

    .line 1158
    .line 1159
    goto :goto_27

    .line 1160
    :cond_31
    move/from16 v43, v3

    .line 1161
    .line 1162
    move/from16 v54, v5

    .line 1163
    .line 1164
    add-int v3, v7, v43

    .line 1165
    .line 1166
    if-gez v54, :cond_32

    .line 1167
    .line 1168
    add-int v3, v3, v54

    .line 1169
    .line 1170
    add-int v10, v10, v54

    .line 1171
    .line 1172
    move/from16 v5, v18

    .line 1173
    .line 1174
    move/from16 v18, v9

    .line 1175
    .line 1176
    move v9, v5

    .line 1177
    move v5, v10

    .line 1178
    const/4 v10, 0x0

    .line 1179
    goto :goto_29

    .line 1180
    :cond_32
    move/from16 v5, v18

    .line 1181
    .line 1182
    move/from16 v18, v9

    .line 1183
    .line 1184
    move v9, v5

    .line 1185
    :goto_28
    move v5, v10

    .line 1186
    move/from16 v10, v54

    .line 1187
    .line 1188
    goto :goto_29

    .line 1189
    :cond_33
    move/from16 v3, v18

    .line 1190
    .line 1191
    move/from16 v18, v9

    .line 1192
    .line 1193
    move v9, v3

    .line 1194
    move v3, v7

    .line 1195
    goto :goto_28

    .line 1196
    :goto_29
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 1197
    .line 1198
    .line 1199
    move-result v43

    .line 1200
    move/from16 v54, v13

    .line 1201
    .line 1202
    invoke-static/range {v43 .. v43}, Ljava/lang/Integer;->signum(I)I

    .line 1203
    .line 1204
    .line 1205
    move-result v13

    .line 1206
    move/from16 v43, v14

    .line 1207
    .line 1208
    invoke-static {v3}, Ljava/lang/Integer;->signum(I)I

    .line 1209
    .line 1210
    .line 1211
    move-result v14

    .line 1212
    if-ne v13, v14, :cond_34

    .line 1213
    .line 1214
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 1215
    .line 1216
    .line 1217
    move-result v13

    .line 1218
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    .line 1219
    .line 1220
    .line 1221
    move-result v13

    .line 1222
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 1223
    .line 1224
    .line 1225
    move-result v14

    .line 1226
    if-lt v13, v14, :cond_34

    .line 1227
    .line 1228
    int-to-float v13, v3

    .line 1229
    goto :goto_2a

    .line 1230
    :cond_34
    move/from16 v13, v17

    .line 1231
    .line 1232
    :goto_2a
    sub-float v14, v17, v13

    .line 1233
    .line 1234
    const/16 v17, 0x0

    .line 1235
    .line 1236
    if-eqz v23, :cond_35

    .line 1237
    .line 1238
    if-le v3, v7, :cond_35

    .line 1239
    .line 1240
    cmpg-float v55, v14, v17

    .line 1241
    .line 1242
    if-gtz v55, :cond_35

    .line 1243
    .line 1244
    sub-int/2addr v3, v7

    .line 1245
    int-to-float v3, v3

    .line 1246
    add-float v17, v3, v14

    .line 1247
    .line 1248
    :cond_35
    move/from16 v3, v17

    .line 1249
    .line 1250
    if-ltz v10, :cond_36

    .line 1251
    .line 1252
    goto :goto_2b

    .line 1253
    :cond_36
    const-string v7, "negative currentFirstItemScrollOffset"

    .line 1254
    .line 1255
    invoke-static {v7}, Lo/b;->a(Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    :goto_2b
    neg-int v7, v10

    .line 1259
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 1260
    .line 1261
    .line 1262
    move-result v14

    .line 1263
    const-string v17, "ArrayDeque is empty."

    .line 1264
    .line 1265
    if-nez v14, :cond_8a

    .line 1266
    .line 1267
    iget-object v14, v0, Ltf/k;->h:[Ljava/lang/Object;

    .line 1268
    .line 1269
    move/from16 v55, v3

    .line 1270
    .line 1271
    iget v3, v0, Ltf/k;->g:I

    .line 1272
    .line 1273
    aget-object v3, v14, v3

    .line 1274
    .line 1275
    check-cast v3, Lr/q;

    .line 1276
    .line 1277
    if-gtz v54, :cond_38

    .line 1278
    .line 1279
    if-gez v41, :cond_37

    .line 1280
    .line 1281
    goto :goto_2d

    .line 1282
    :cond_37
    move/from16 v58, v7

    .line 1283
    .line 1284
    :goto_2c
    move-wide/from16 v59, v25

    .line 1285
    .line 1286
    const/4 v14, 0x0

    .line 1287
    move/from16 v25, v10

    .line 1288
    .line 1289
    goto :goto_2f

    .line 1290
    :cond_38
    :goto_2d
    invoke-virtual {v0}, Ltf/k;->a()I

    .line 1291
    .line 1292
    .line 1293
    move-result v14

    .line 1294
    move-object/from16 v54, v3

    .line 1295
    .line 1296
    const/4 v3, 0x0

    .line 1297
    :goto_2e
    if-ge v3, v14, :cond_39

    .line 1298
    .line 1299
    invoke-virtual {v0, v3}, Ltf/k;->get(I)Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v57

    .line 1303
    move/from16 v58, v7

    .line 1304
    .line 1305
    move-object/from16 v7, v57

    .line 1306
    .line 1307
    check-cast v7, Lr/q;

    .line 1308
    .line 1309
    iget v7, v7, Lr/q;->q:I

    .line 1310
    .line 1311
    if-eqz v10, :cond_3a

    .line 1312
    .line 1313
    if-gt v7, v10, :cond_3a

    .line 1314
    .line 1315
    invoke-virtual {v0}, Ltf/k;->a()I

    .line 1316
    .line 1317
    .line 1318
    move-result v57

    .line 1319
    move/from16 v59, v7

    .line 1320
    .line 1321
    const/16 v40, 0x1

    .line 1322
    .line 1323
    add-int/lit8 v7, v57, -0x1

    .line 1324
    .line 1325
    if-eq v3, v7, :cond_3a

    .line 1326
    .line 1327
    sub-int v10, v10, v59

    .line 1328
    .line 1329
    add-int/lit8 v3, v3, 0x1

    .line 1330
    .line 1331
    invoke-virtual {v0, v3}, Ltf/k;->get(I)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v7

    .line 1335
    move-object/from16 v54, v7

    .line 1336
    .line 1337
    check-cast v54, Lr/q;

    .line 1338
    .line 1339
    move/from16 v7, v58

    .line 1340
    .line 1341
    goto :goto_2e

    .line 1342
    :cond_39
    move/from16 v58, v7

    .line 1343
    .line 1344
    :cond_3a
    move-object/from16 v3, v54

    .line 1345
    .line 1346
    goto :goto_2c

    .line 1347
    :goto_2f
    invoke-static {v14, v9}, Ljava/lang/Math;->max(II)I

    .line 1348
    .line 1349
    .line 1350
    move-result v7

    .line 1351
    const/16 v40, 0x1

    .line 1352
    .line 1353
    add-int/lit8 v9, v9, -0x1

    .line 1354
    .line 1355
    move-object/from16 v10, v39

    .line 1356
    .line 1357
    if-gt v7, v9, :cond_3c

    .line 1358
    .line 1359
    :goto_30
    if-nez v10, :cond_3b

    .line 1360
    .line 1361
    new-instance v10, Ljava/util/ArrayList;

    .line 1362
    .line 1363
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1364
    .line 1365
    .line 1366
    :cond_3b
    invoke-virtual {v15, v9, v1, v2}, Lr/n;->a(IJ)Lr/q;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v14

    .line 1370
    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    if-eq v9, v7, :cond_3c

    .line 1374
    .line 1375
    add-int/lit8 v9, v9, -0x1

    .line 1376
    .line 1377
    goto :goto_30

    .line 1378
    :cond_3c
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1379
    .line 1380
    .line 1381
    move-result v9

    .line 1382
    const/4 v14, -0x1

    .line 1383
    add-int/2addr v9, v14

    .line 1384
    if-ltz v9, :cond_40

    .line 1385
    .line 1386
    :goto_31
    add-int/lit8 v26, v9, -0x1

    .line 1387
    .line 1388
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v9

    .line 1392
    check-cast v9, Ljava/lang/Number;

    .line 1393
    .line 1394
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1395
    .line 1396
    .line 1397
    move-result v9

    .line 1398
    if-ge v9, v7, :cond_3e

    .line 1399
    .line 1400
    if-nez v10, :cond_3d

    .line 1401
    .line 1402
    new-instance v10, Ljava/util/ArrayList;

    .line 1403
    .line 1404
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1405
    .line 1406
    .line 1407
    :cond_3d
    invoke-virtual {v15, v9, v1, v2}, Lr/n;->a(IJ)Lr/q;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v9

    .line 1411
    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1412
    .line 1413
    .line 1414
    :cond_3e
    if-gez v26, :cond_3f

    .line 1415
    .line 1416
    goto :goto_32

    .line 1417
    :cond_3f
    move/from16 v9, v26

    .line 1418
    .line 1419
    goto :goto_31

    .line 1420
    :cond_40
    :goto_32
    if-nez v10, :cond_41

    .line 1421
    .line 1422
    move-object/from16 v10, v44

    .line 1423
    .line 1424
    :cond_41
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1425
    .line 1426
    .line 1427
    move-result v7

    .line 1428
    move/from16 v9, v18

    .line 1429
    .line 1430
    const/4 v14, 0x0

    .line 1431
    :goto_33
    if-ge v14, v7, :cond_42

    .line 1432
    .line 1433
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v18

    .line 1437
    move/from16 v26, v7

    .line 1438
    .line 1439
    move-object/from16 v7, v18

    .line 1440
    .line 1441
    check-cast v7, Lr/q;

    .line 1442
    .line 1443
    iget v7, v7, Lr/q;->r:I

    .line 1444
    .line 1445
    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    .line 1446
    .line 1447
    .line 1448
    move-result v9

    .line 1449
    add-int/lit8 v14, v14, 0x1

    .line 1450
    .line 1451
    move/from16 v7, v26

    .line 1452
    .line 1453
    goto :goto_33

    .line 1454
    :cond_42
    invoke-static {v0}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v7

    .line 1458
    check-cast v7, Lr/q;

    .line 1459
    .line 1460
    iget v7, v7, Lr/q;->a:I

    .line 1461
    .line 1462
    add-int/lit8 v14, v51, -0x1

    .line 1463
    .line 1464
    invoke-static {v7, v14}, Ljava/lang/Math;->min(II)I

    .line 1465
    .line 1466
    .line 1467
    move-result v7

    .line 1468
    invoke-static {v0}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v14

    .line 1472
    check-cast v14, Lr/q;

    .line 1473
    .line 1474
    iget v14, v14, Lr/q;->a:I

    .line 1475
    .line 1476
    const/16 v40, 0x1

    .line 1477
    .line 1478
    add-int/lit8 v14, v14, 0x1

    .line 1479
    .line 1480
    if-gt v14, v7, :cond_44

    .line 1481
    .line 1482
    move-object/from16 v18, v39

    .line 1483
    .line 1484
    :goto_34
    if-nez v18, :cond_43

    .line 1485
    .line 1486
    new-instance v18, Ljava/util/ArrayList;

    .line 1487
    .line 1488
    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 1489
    .line 1490
    .line 1491
    :cond_43
    move/from16 v26, v9

    .line 1492
    .line 1493
    move/from16 v57, v13

    .line 1494
    .line 1495
    move-object/from16 v9, v18

    .line 1496
    .line 1497
    invoke-virtual {v15, v14, v1, v2}, Lr/n;->a(IJ)Lr/q;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v13

    .line 1501
    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1502
    .line 1503
    .line 1504
    if-eq v14, v7, :cond_45

    .line 1505
    .line 1506
    add-int/lit8 v14, v14, 0x1

    .line 1507
    .line 1508
    move-object/from16 v18, v9

    .line 1509
    .line 1510
    move/from16 v9, v26

    .line 1511
    .line 1512
    move/from16 v13, v57

    .line 1513
    .line 1514
    goto :goto_34

    .line 1515
    :cond_44
    move/from16 v26, v9

    .line 1516
    .line 1517
    move/from16 v57, v13

    .line 1518
    .line 1519
    move-object/from16 v9, v39

    .line 1520
    .line 1521
    :cond_45
    if-eqz v9, :cond_46

    .line 1522
    .line 1523
    invoke-static {v9}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v13

    .line 1527
    check-cast v13, Lr/q;

    .line 1528
    .line 1529
    iget v13, v13, Lr/q;->a:I

    .line 1530
    .line 1531
    if-le v13, v7, :cond_46

    .line 1532
    .line 1533
    invoke-static {v9}, Ltf/m;->B1(Ljava/util/List;)Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v7

    .line 1537
    check-cast v7, Lr/q;

    .line 1538
    .line 1539
    iget v7, v7, Lr/q;->a:I

    .line 1540
    .line 1541
    :cond_46
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1542
    .line 1543
    .line 1544
    move-result v13

    .line 1545
    const/4 v14, 0x0

    .line 1546
    :goto_35
    if-ge v14, v13, :cond_49

    .line 1547
    .line 1548
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v18

    .line 1552
    check-cast v18, Ljava/lang/Number;

    .line 1553
    .line 1554
    move-object/from16 v61, v8

    .line 1555
    .line 1556
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 1557
    .line 1558
    .line 1559
    move-result v8

    .line 1560
    if-le v8, v7, :cond_48

    .line 1561
    .line 1562
    if-nez v9, :cond_47

    .line 1563
    .line 1564
    new-instance v9, Ljava/util/ArrayList;

    .line 1565
    .line 1566
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1567
    .line 1568
    .line 1569
    :cond_47
    invoke-virtual {v15, v8, v1, v2}, Lr/n;->a(IJ)Lr/q;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v8

    .line 1573
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1574
    .line 1575
    .line 1576
    :cond_48
    add-int/lit8 v14, v14, 0x1

    .line 1577
    .line 1578
    move-object/from16 v8, v61

    .line 1579
    .line 1580
    goto :goto_35

    .line 1581
    :cond_49
    if-nez v9, :cond_4a

    .line 1582
    .line 1583
    move-object/from16 v9, v44

    .line 1584
    .line 1585
    :cond_4a
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 1586
    .line 1587
    .line 1588
    move-result v7

    .line 1589
    move/from16 v8, v26

    .line 1590
    .line 1591
    const/4 v13, 0x0

    .line 1592
    :goto_36
    if-ge v13, v7, :cond_4b

    .line 1593
    .line 1594
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v14

    .line 1598
    check-cast v14, Lr/q;

    .line 1599
    .line 1600
    iget v14, v14, Lr/q;->r:I

    .line 1601
    .line 1602
    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    .line 1603
    .line 1604
    .line 1605
    move-result v8

    .line 1606
    add-int/lit8 v13, v13, 0x1

    .line 1607
    .line 1608
    goto :goto_36

    .line 1609
    :cond_4b
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 1610
    .line 1611
    .line 1612
    move-result v7

    .line 1613
    if-nez v7, :cond_89

    .line 1614
    .line 1615
    iget-object v7, v0, Ltf/k;->h:[Ljava/lang/Object;

    .line 1616
    .line 1617
    iget v13, v0, Ltf/k;->g:I

    .line 1618
    .line 1619
    aget-object v7, v7, v13

    .line 1620
    .line 1621
    invoke-static {v3, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    move-result v7

    .line 1625
    if-eqz v7, :cond_4c

    .line 1626
    .line 1627
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1628
    .line 1629
    .line 1630
    move-result v7

    .line 1631
    if-eqz v7, :cond_4c

    .line 1632
    .line 1633
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1634
    .line 1635
    .line 1636
    move-result v7

    .line 1637
    if-eqz v7, :cond_4c

    .line 1638
    .line 1639
    const/4 v13, 0x1

    .line 1640
    goto :goto_37

    .line 1641
    :cond_4c
    const/4 v13, 0x0

    .line 1642
    :goto_37
    if-eqz v19, :cond_4d

    .line 1643
    .line 1644
    move v7, v8

    .line 1645
    goto :goto_38

    .line 1646
    :cond_4d
    move v7, v5

    .line 1647
    :goto_38
    invoke-static {v7, v11, v12}, Lu2/b;->g(IJ)I

    .line 1648
    .line 1649
    .line 1650
    move-result v14

    .line 1651
    if-eqz v19, :cond_4e

    .line 1652
    .line 1653
    move v8, v5

    .line 1654
    :cond_4e
    invoke-static {v8, v11, v12}, Lu2/b;->f(IJ)I

    .line 1655
    .line 1656
    .line 1657
    move-result v18

    .line 1658
    if-eqz v19, :cond_4f

    .line 1659
    .line 1660
    move/from16 v7, v18

    .line 1661
    .line 1662
    goto :goto_39

    .line 1663
    :cond_4f
    move v7, v14

    .line 1664
    :goto_39
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    .line 1665
    .line 1666
    .line 1667
    move-result v8

    .line 1668
    if-ge v5, v8, :cond_50

    .line 1669
    .line 1670
    const/4 v8, 0x1

    .line 1671
    goto :goto_3a

    .line 1672
    :cond_50
    const/4 v8, 0x0

    .line 1673
    :goto_3a
    if-eqz v8, :cond_52

    .line 1674
    .line 1675
    if-nez v58, :cond_51

    .line 1676
    .line 1677
    goto :goto_3b

    .line 1678
    :cond_51
    const-string v17, "non-zero itemsScrollOffset"

    .line 1679
    .line 1680
    invoke-static/range {v17 .. v17}, Lo/b;->c(Ljava/lang/String;)V

    .line 1681
    .line 1682
    .line 1683
    :cond_52
    :goto_3b
    move-object/from16 v61, v3

    .line 1684
    .line 1685
    new-instance v3, Ljava/util/ArrayList;

    .line 1686
    .line 1687
    invoke-virtual {v0}, Ltf/k;->a()I

    .line 1688
    .line 1689
    .line 1690
    move-result v17

    .line 1691
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1692
    .line 1693
    .line 1694
    move-result v26

    .line 1695
    add-int v26, v26, v17

    .line 1696
    .line 1697
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 1698
    .line 1699
    .line 1700
    move-result v17

    .line 1701
    move/from16 v62, v5

    .line 1702
    .line 1703
    add-int v5, v17, v26

    .line 1704
    .line 1705
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1706
    .line 1707
    .line 1708
    if-eqz v8, :cond_5a

    .line 1709
    .line 1710
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 1711
    .line 1712
    .line 1713
    move-result v5

    .line 1714
    if-eqz v5, :cond_53

    .line 1715
    .line 1716
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 1717
    .line 1718
    .line 1719
    move-result v5

    .line 1720
    if-eqz v5, :cond_53

    .line 1721
    .line 1722
    goto :goto_3c

    .line 1723
    :cond_53
    const-string v5, "no extra items"

    .line 1724
    .line 1725
    invoke-static {v5}, Lo/b;->a(Ljava/lang/String;)V

    .line 1726
    .line 1727
    .line 1728
    :goto_3c
    invoke-virtual {v0}, Ltf/k;->a()I

    .line 1729
    .line 1730
    .line 1731
    move-result v5

    .line 1732
    new-array v8, v5, [I

    .line 1733
    .line 1734
    const/4 v9, 0x0

    .line 1735
    :goto_3d
    if-ge v9, v5, :cond_54

    .line 1736
    .line 1737
    invoke-virtual {v0, v9}, Ltf/k;->get(I)Ljava/lang/Object;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v10

    .line 1741
    check-cast v10, Lr/q;

    .line 1742
    .line 1743
    iget v10, v10, Lr/q;->p:I

    .line 1744
    .line 1745
    aput v10, v8, v9

    .line 1746
    .line 1747
    add-int/lit8 v9, v9, 0x1

    .line 1748
    .line 1749
    goto :goto_3d

    .line 1750
    :cond_54
    new-array v10, v5, [I

    .line 1751
    .line 1752
    if-eqz v19, :cond_56

    .line 1753
    .line 1754
    move-object/from16 v9, v37

    .line 1755
    .line 1756
    if-eqz v9, :cond_55

    .line 1757
    .line 1758
    invoke-interface {v9, v7, v6, v8, v10}, Lp/i;->c(ILv1/p0;[I[I)V

    .line 1759
    .line 1760
    .line 1761
    move-wide/from16 v64, v59

    .line 1762
    .line 1763
    move-wide/from16 v59, v1

    .line 1764
    .line 1765
    move-wide/from16 v1, v64

    .line 1766
    .line 1767
    move/from16 v17, v5

    .line 1768
    .line 1769
    move/from16 v37, v13

    .line 1770
    .line 1771
    move/from16 v13, v18

    .line 1772
    .line 1773
    move-object/from16 v63, v45

    .line 1774
    .line 1775
    goto :goto_3e

    .line 1776
    :cond_55
    invoke-static/range {v21 .. v21}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 1777
    .line 1778
    .line 1779
    invoke-static {}, Lokio/a;->c()V

    .line 1780
    .line 1781
    .line 1782
    goto/16 :goto_9

    .line 1783
    .line 1784
    :cond_56
    if-eqz v20, :cond_59

    .line 1785
    .line 1786
    move-wide/from16 v64, v59

    .line 1787
    .line 1788
    move-wide/from16 v59, v1

    .line 1789
    .line 1790
    move-wide/from16 v1, v64

    .line 1791
    .line 1792
    move/from16 v17, v5

    .line 1793
    .line 1794
    move/from16 v37, v13

    .line 1795
    .line 1796
    move/from16 v13, v18

    .line 1797
    .line 1798
    move-object/from16 v5, v20

    .line 1799
    .line 1800
    move-object/from16 v9, v22

    .line 1801
    .line 1802
    move-object/from16 v63, v45

    .line 1803
    .line 1804
    invoke-interface/range {v5 .. v10}, Lp/g;->b(Lv1/p0;I[ILu2/m;[I)V

    .line 1805
    .line 1806
    .line 1807
    :goto_3e
    new-instance v5, Llg/d;

    .line 1808
    .line 1809
    const/4 v7, 0x1

    .line 1810
    add-int/lit8 v8, v17, -0x1

    .line 1811
    .line 1812
    const/4 v9, 0x0

    .line 1813
    invoke-direct {v5, v9, v8, v7}, Llg/b;-><init>(III)V

    .line 1814
    .line 1815
    .line 1816
    iget v7, v5, Llg/b;->h:I

    .line 1817
    .line 1818
    iget v5, v5, Llg/b;->i:I

    .line 1819
    .line 1820
    if-lez v5, :cond_57

    .line 1821
    .line 1822
    if-gez v7, :cond_58

    .line 1823
    .line 1824
    :cond_57
    if-gez v5, :cond_5d

    .line 1825
    .line 1826
    if-gtz v7, :cond_5d

    .line 1827
    .line 1828
    :cond_58
    const/4 v8, 0x0

    .line 1829
    :goto_3f
    aget v9, v10, v8

    .line 1830
    .line 1831
    invoke-virtual {v0, v8}, Ltf/k;->get(I)Ljava/lang/Object;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v17

    .line 1835
    move-object/from16 v1, v17

    .line 1836
    .line 1837
    check-cast v1, Lr/q;

    .line 1838
    .line 1839
    invoke-virtual {v1, v9, v14, v13}, Lr/q;->d(III)V

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1843
    .line 1844
    .line 1845
    if-eq v8, v7, :cond_5d

    .line 1846
    .line 1847
    add-int/2addr v8, v5

    .line 1848
    const-wide/16 v1, 0x0

    .line 1849
    .line 1850
    goto :goto_3f

    .line 1851
    :cond_59
    const-string v0, "null horizontalArrangement when isVertical == false"

    .line 1852
    .line 1853
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 1854
    .line 1855
    .line 1856
    invoke-static {}, Lokio/a;->c()V

    .line 1857
    .line 1858
    .line 1859
    goto/16 :goto_9

    .line 1860
    .line 1861
    :cond_5a
    move-wide/from16 v59, v1

    .line 1862
    .line 1863
    move/from16 v37, v13

    .line 1864
    .line 1865
    move/from16 v13, v18

    .line 1866
    .line 1867
    move-object/from16 v63, v45

    .line 1868
    .line 1869
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 1870
    .line 1871
    .line 1872
    move-result v1

    .line 1873
    move/from16 v5, v58

    .line 1874
    .line 1875
    const/4 v2, 0x0

    .line 1876
    :goto_40
    if-ge v2, v1, :cond_5b

    .line 1877
    .line 1878
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v7

    .line 1882
    check-cast v7, Lr/q;

    .line 1883
    .line 1884
    iget v8, v7, Lr/q;->q:I

    .line 1885
    .line 1886
    sub-int/2addr v5, v8

    .line 1887
    invoke-virtual {v7, v5, v14, v13}, Lr/q;->d(III)V

    .line 1888
    .line 1889
    .line 1890
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1891
    .line 1892
    .line 1893
    add-int/lit8 v2, v2, 0x1

    .line 1894
    .line 1895
    goto :goto_40

    .line 1896
    :cond_5b
    invoke-virtual {v0}, Ltf/k;->a()I

    .line 1897
    .line 1898
    .line 1899
    move-result v1

    .line 1900
    move/from16 v7, v58

    .line 1901
    .line 1902
    const/4 v2, 0x0

    .line 1903
    :goto_41
    if-ge v2, v1, :cond_5c

    .line 1904
    .line 1905
    invoke-virtual {v0, v2}, Ltf/k;->get(I)Ljava/lang/Object;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v5

    .line 1909
    check-cast v5, Lr/q;

    .line 1910
    .line 1911
    invoke-virtual {v5, v7, v14, v13}, Lr/q;->d(III)V

    .line 1912
    .line 1913
    .line 1914
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1915
    .line 1916
    .line 1917
    iget v5, v5, Lr/q;->q:I

    .line 1918
    .line 1919
    add-int/2addr v7, v5

    .line 1920
    add-int/lit8 v2, v2, 0x1

    .line 1921
    .line 1922
    goto :goto_41

    .line 1923
    :cond_5c
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 1924
    .line 1925
    .line 1926
    move-result v1

    .line 1927
    const/4 v2, 0x0

    .line 1928
    :goto_42
    if-ge v2, v1, :cond_5d

    .line 1929
    .line 1930
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v5

    .line 1934
    check-cast v5, Lr/q;

    .line 1935
    .line 1936
    invoke-virtual {v5, v7, v14, v13}, Lr/q;->d(III)V

    .line 1937
    .line 1938
    .line 1939
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1940
    .line 1941
    .line 1942
    iget v5, v5, Lr/q;->q:I

    .line 1943
    .line 1944
    add-int/2addr v7, v5

    .line 1945
    add-int/lit8 v2, v2, 0x1

    .line 1946
    .line 1947
    goto :goto_42

    .line 1948
    :cond_5d
    if-nez v52, :cond_5e

    .line 1949
    .line 1950
    move/from16 v9, v57

    .line 1951
    .line 1952
    float-to-int v1, v9

    .line 1953
    move-object/from16 v2, v48

    .line 1954
    .line 1955
    iget-object v5, v2, Lr/k;->d:Lac/k;

    .line 1956
    .line 1957
    move-object/from16 v20, v5

    .line 1958
    .line 1959
    move/from16 v18, v13

    .line 1960
    .line 1961
    move/from16 v17, v14

    .line 1962
    .line 1963
    move-object/from16 v21, v15

    .line 1964
    .line 1965
    move-object/from16 v15, v16

    .line 1966
    .line 1967
    move/from16 v22, v19

    .line 1968
    .line 1969
    move/from16 v5, v51

    .line 1970
    .line 1971
    move/from16 v26, v62

    .line 1972
    .line 1973
    move/from16 v16, v1

    .line 1974
    .line 1975
    move-object/from16 v19, v3

    .line 1976
    .line 1977
    invoke-virtual/range {v15 .. v28}, Ls/z;->c(IIILjava/util/ArrayList;Lac/k;Lr/n;ZZZIILqg/t;Lf1/z;)V

    .line 1978
    .line 1979
    .line 1980
    move-object/from16 v16, v15

    .line 1981
    .line 1982
    move-object/from16 v15, v21

    .line 1983
    .line 1984
    move/from16 v10, v26

    .line 1985
    .line 1986
    :goto_43
    move/from16 v1, v23

    .line 1987
    .line 1988
    move/from16 v7, v25

    .line 1989
    .line 1990
    goto :goto_44

    .line 1991
    :cond_5e
    move/from16 v22, v19

    .line 1992
    .line 1993
    move-object/from16 v2, v48

    .line 1994
    .line 1995
    move/from16 v5, v51

    .line 1996
    .line 1997
    move/from16 v9, v57

    .line 1998
    .line 1999
    move/from16 v10, v62

    .line 2000
    .line 2001
    goto :goto_43

    .line 2002
    :goto_44
    if-nez v1, :cond_62

    .line 2003
    .line 2004
    move-object v8, v6

    .line 2005
    move/from16 v25, v7

    .line 2006
    .line 2007
    invoke-virtual/range {v16 .. v16}, Ls/z;->a()J

    .line 2008
    .line 2009
    .line 2010
    move-result-wide v6

    .line 2011
    move-object/from16 v16, v8

    .line 2012
    .line 2013
    move/from16 v57, v9

    .line 2014
    .line 2015
    const-wide/16 v8, 0x0

    .line 2016
    .line 2017
    invoke-static {v6, v7, v8, v9}, Lu2/l;->a(JJ)Z

    .line 2018
    .line 2019
    .line 2020
    move-result v8

    .line 2021
    if-nez v8, :cond_63

    .line 2022
    .line 2023
    if-eqz v22, :cond_5f

    .line 2024
    .line 2025
    move v8, v13

    .line 2026
    :goto_45
    move-wide/from16 v17, v6

    .line 2027
    .line 2028
    goto :goto_46

    .line 2029
    :cond_5f
    move v8, v14

    .line 2030
    goto :goto_45

    .line 2031
    :goto_46
    shr-long v6, v17, v32

    .line 2032
    .line 2033
    long-to-int v6, v6

    .line 2034
    invoke-static {v14, v6}, Ljava/lang/Math;->max(II)I

    .line 2035
    .line 2036
    .line 2037
    move-result v6

    .line 2038
    invoke-static {v6, v11, v12}, Lu2/b;->g(IJ)I

    .line 2039
    .line 2040
    .line 2041
    move-result v14

    .line 2042
    and-long v6, v17, v33

    .line 2043
    .line 2044
    long-to-int v6, v6

    .line 2045
    invoke-static {v13, v6}, Ljava/lang/Math;->max(II)I

    .line 2046
    .line 2047
    .line 2048
    move-result v6

    .line 2049
    invoke-static {v6, v11, v12}, Lu2/b;->f(IJ)I

    .line 2050
    .line 2051
    .line 2052
    move-result v18

    .line 2053
    if-eqz v22, :cond_60

    .line 2054
    .line 2055
    move/from16 v6, v18

    .line 2056
    .line 2057
    goto :goto_47

    .line 2058
    :cond_60
    move v6, v14

    .line 2059
    :goto_47
    if-eq v6, v8, :cond_61

    .line 2060
    .line 2061
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2062
    .line 2063
    .line 2064
    move-result v7

    .line 2065
    const/4 v12, 0x0

    .line 2066
    :goto_48
    if-ge v12, v7, :cond_61

    .line 2067
    .line 2068
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v8

    .line 2072
    check-cast v8, Lr/q;

    .line 2073
    .line 2074
    iput v6, v8, Lr/q;->t:I

    .line 2075
    .line 2076
    iget v9, v8, Lr/q;->h:I

    .line 2077
    .line 2078
    add-int/2addr v9, v6

    .line 2079
    iput v9, v8, Lr/q;->v:I

    .line 2080
    .line 2081
    add-int/lit8 v12, v12, 0x1

    .line 2082
    .line 2083
    goto :goto_48

    .line 2084
    :cond_61
    move/from16 v13, v18

    .line 2085
    .line 2086
    goto :goto_49

    .line 2087
    :cond_62
    move-object/from16 v16, v6

    .line 2088
    .line 2089
    move/from16 v25, v7

    .line 2090
    .line 2091
    move/from16 v57, v9

    .line 2092
    .line 2093
    :cond_63
    :goto_49
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 2094
    .line 2095
    .line 2096
    move-result v6

    .line 2097
    if-eqz v6, :cond_64

    .line 2098
    .line 2099
    move-object/from16 v6, v39

    .line 2100
    .line 2101
    goto :goto_4a

    .line 2102
    :cond_64
    iget-object v6, v0, Ltf/k;->h:[Ljava/lang/Object;

    .line 2103
    .line 2104
    iget v7, v0, Ltf/k;->g:I

    .line 2105
    .line 2106
    aget-object v6, v6, v7

    .line 2107
    .line 2108
    :goto_4a
    check-cast v6, Lr/q;

    .line 2109
    .line 2110
    if-eqz v6, :cond_65

    .line 2111
    .line 2112
    iget v12, v6, Lr/q;->a:I

    .line 2113
    .line 2114
    goto :goto_4b

    .line 2115
    :cond_65
    const/4 v12, 0x0

    .line 2116
    :goto_4b
    invoke-virtual {v0}, Ltf/k;->g()Ljava/lang/Object;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v6

    .line 2120
    check-cast v6, Lr/q;

    .line 2121
    .line 2122
    if-eqz v6, :cond_66

    .line 2123
    .line 2124
    iget v6, v6, Lr/q;->a:I

    .line 2125
    .line 2126
    goto :goto_4c

    .line 2127
    :cond_66
    const/4 v6, 0x0

    .line 2128
    :goto_4c
    iget-object v2, v2, Lr/k;->b:Lr/h;

    .line 2129
    .line 2130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2131
    .line 2132
    .line 2133
    sget-object v2, Lf/j;->a:Lf/v;

    .line 2134
    .line 2135
    if-eqz v35, :cond_7b

    .line 2136
    .line 2137
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2138
    .line 2139
    .line 2140
    move-result v7

    .line 2141
    if-nez v7, :cond_7b

    .line 2142
    .line 2143
    iget v7, v2, Lf/v;->b:I

    .line 2144
    .line 2145
    if-eqz v7, :cond_7b

    .line 2146
    .line 2147
    sub-int/2addr v6, v12

    .line 2148
    if-ltz v6, :cond_6b

    .line 2149
    .line 2150
    if-nez v7, :cond_67

    .line 2151
    .line 2152
    goto :goto_4f

    .line 2153
    :cond_67
    const/4 v9, 0x0

    .line 2154
    invoke-static {v9, v7}, Lr9/e0;->r0(II)Llg/d;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v6

    .line 2158
    iget v7, v6, Llg/b;->g:I

    .line 2159
    .line 2160
    iget v6, v6, Llg/b;->h:I

    .line 2161
    .line 2162
    if-gt v7, v6, :cond_69

    .line 2163
    .line 2164
    const/4 v8, -0x1

    .line 2165
    :goto_4d
    invoke-virtual {v2, v7}, Lf/v;->c(I)I

    .line 2166
    .line 2167
    .line 2168
    move-result v9

    .line 2169
    if-gt v9, v12, :cond_68

    .line 2170
    .line 2171
    invoke-virtual {v2, v7}, Lf/v;->c(I)I

    .line 2172
    .line 2173
    .line 2174
    move-result v8

    .line 2175
    if-eq v7, v6, :cond_68

    .line 2176
    .line 2177
    add-int/lit8 v7, v7, 0x1

    .line 2178
    .line 2179
    goto :goto_4d

    .line 2180
    :cond_68
    const/4 v6, -0x1

    .line 2181
    goto :goto_4e

    .line 2182
    :cond_69
    const/4 v6, -0x1

    .line 2183
    const/4 v8, -0x1

    .line 2184
    :goto_4e
    if-ne v8, v6, :cond_6a

    .line 2185
    .line 2186
    sget-object v6, Lf/j;->a:Lf/v;

    .line 2187
    .line 2188
    goto :goto_50

    .line 2189
    :cond_6a
    new-instance v6, Lf/v;

    .line 2190
    .line 2191
    const/4 v7, 0x1

    .line 2192
    invoke-direct {v6, v7}, Lf/v;-><init>(I)V

    .line 2193
    .line 2194
    .line 2195
    invoke-virtual {v6, v8}, Lf/v;->a(I)V

    .line 2196
    .line 2197
    .line 2198
    goto :goto_50

    .line 2199
    :cond_6b
    :goto_4f
    move-object v6, v2

    .line 2200
    :goto_50
    new-instance v7, Ljava/util/ArrayList;

    .line 2201
    .line 2202
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2203
    .line 2204
    .line 2205
    new-instance v8, Ljava/util/ArrayList;

    .line 2206
    .line 2207
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2208
    .line 2209
    .line 2210
    move-result v9

    .line 2211
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 2212
    .line 2213
    .line 2214
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2215
    .line 2216
    .line 2217
    move-result v9

    .line 2218
    const/4 v12, 0x0

    .line 2219
    :goto_51
    if-ge v12, v9, :cond_6e

    .line 2220
    .line 2221
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v11

    .line 2225
    move/from16 v17, v9

    .line 2226
    .line 2227
    move-object v9, v11

    .line 2228
    check-cast v9, Lr/q;

    .line 2229
    .line 2230
    iget v9, v9, Lr/q;->a:I

    .line 2231
    .line 2232
    move/from16 v18, v12

    .line 2233
    .line 2234
    iget-object v12, v2, Lf/v;->a:[I

    .line 2235
    .line 2236
    move-object/from16 v19, v12

    .line 2237
    .line 2238
    iget v12, v2, Lf/v;->b:I

    .line 2239
    .line 2240
    move-object/from16 v20, v2

    .line 2241
    .line 2242
    const/4 v2, 0x0

    .line 2243
    :goto_52
    if-ge v2, v12, :cond_6d

    .line 2244
    .line 2245
    move/from16 v21, v2

    .line 2246
    .line 2247
    aget v2, v19, v21

    .line 2248
    .line 2249
    if-ne v2, v9, :cond_6c

    .line 2250
    .line 2251
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2252
    .line 2253
    .line 2254
    goto :goto_53

    .line 2255
    :cond_6c
    add-int/lit8 v2, v21, 0x1

    .line 2256
    .line 2257
    goto :goto_52

    .line 2258
    :cond_6d
    :goto_53
    add-int/lit8 v12, v18, 0x1

    .line 2259
    .line 2260
    move/from16 v9, v17

    .line 2261
    .line 2262
    move-object/from16 v2, v20

    .line 2263
    .line 2264
    goto :goto_51

    .line 2265
    :cond_6e
    iget-object v2, v6, Lf/v;->a:[I

    .line 2266
    .line 2267
    iget v6, v6, Lf/v;->b:I

    .line 2268
    .line 2269
    const/4 v12, 0x0

    .line 2270
    :goto_54
    if-ge v12, v6, :cond_7a

    .line 2271
    .line 2272
    aget v9, v2, v12

    .line 2273
    .line 2274
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v11

    .line 2278
    const/16 v17, 0x0

    .line 2279
    .line 2280
    :goto_55
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2281
    .line 2282
    .line 2283
    move-result v18

    .line 2284
    if-eqz v18, :cond_70

    .line 2285
    .line 2286
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v18

    .line 2290
    move-object/from16 v19, v2

    .line 2291
    .line 2292
    move-object/from16 v2, v18

    .line 2293
    .line 2294
    check-cast v2, Lr/q;

    .line 2295
    .line 2296
    iget v2, v2, Lr/q;->a:I

    .line 2297
    .line 2298
    if-ne v2, v9, :cond_6f

    .line 2299
    .line 2300
    move/from16 v2, v17

    .line 2301
    .line 2302
    :goto_56
    const/4 v11, -0x1

    .line 2303
    goto :goto_57

    .line 2304
    :cond_6f
    add-int/lit8 v17, v17, 0x1

    .line 2305
    .line 2306
    move-object/from16 v2, v19

    .line 2307
    .line 2308
    goto :goto_55

    .line 2309
    :cond_70
    move-object/from16 v19, v2

    .line 2310
    .line 2311
    const/4 v2, -0x1

    .line 2312
    goto :goto_56

    .line 2313
    :goto_57
    if-ne v2, v11, :cond_71

    .line 2314
    .line 2315
    move/from16 v17, v12

    .line 2316
    .line 2317
    move-wide/from16 v11, v59

    .line 2318
    .line 2319
    invoke-virtual {v15, v9, v11, v12}, Lr/n;->a(IJ)Lr/q;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v18

    .line 2323
    :goto_58
    move/from16 v20, v6

    .line 2324
    .line 2325
    move-object/from16 v6, v18

    .line 2326
    .line 2327
    goto :goto_59

    .line 2328
    :cond_71
    move/from16 v17, v12

    .line 2329
    .line 2330
    move-wide/from16 v11, v59

    .line 2331
    .line 2332
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v18

    .line 2336
    check-cast v18, Lr/q;

    .line 2337
    .line 2338
    goto :goto_58

    .line 2339
    :goto_59
    iget v11, v6, Lr/q;->q:I

    .line 2340
    .line 2341
    const/4 v12, -0x1

    .line 2342
    if-ne v2, v12, :cond_72

    .line 2343
    .line 2344
    move v2, v13

    .line 2345
    const/high16 v12, -0x80000000

    .line 2346
    .line 2347
    goto :goto_5b

    .line 2348
    :cond_72
    const/4 v2, 0x0

    .line 2349
    invoke-virtual {v6, v2}, Lr/q;->b(I)J

    .line 2350
    .line 2351
    .line 2352
    move-result-wide v23

    .line 2353
    iget-boolean v2, v6, Lr/q;->c:Z

    .line 2354
    .line 2355
    if-eqz v2, :cond_73

    .line 2356
    .line 2357
    move v2, v13

    .line 2358
    and-long v12, v23, v33

    .line 2359
    .line 2360
    :goto_5a
    long-to-int v12, v12

    .line 2361
    goto :goto_5b

    .line 2362
    :cond_73
    move v2, v13

    .line 2363
    shr-long v12, v23, v32

    .line 2364
    .line 2365
    goto :goto_5a

    .line 2366
    :goto_5b
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 2367
    .line 2368
    .line 2369
    move-result v13

    .line 2370
    move/from16 v21, v2

    .line 2371
    .line 2372
    const/4 v2, 0x0

    .line 2373
    :goto_5c
    if-ge v2, v13, :cond_75

    .line 2374
    .line 2375
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v23

    .line 2379
    move/from16 v24, v2

    .line 2380
    .line 2381
    move-object/from16 v2, v23

    .line 2382
    .line 2383
    check-cast v2, Lr/q;

    .line 2384
    .line 2385
    iget v2, v2, Lr/q;->a:I

    .line 2386
    .line 2387
    if-eq v2, v9, :cond_74

    .line 2388
    .line 2389
    goto :goto_5d

    .line 2390
    :cond_74
    add-int/lit8 v2, v24, 0x1

    .line 2391
    .line 2392
    goto :goto_5c

    .line 2393
    :cond_75
    move-object/from16 v23, v39

    .line 2394
    .line 2395
    :goto_5d
    move-object/from16 v2, v23

    .line 2396
    .line 2397
    check-cast v2, Lr/q;

    .line 2398
    .line 2399
    if-eqz v2, :cond_77

    .line 2400
    .line 2401
    const/4 v9, 0x0

    .line 2402
    invoke-virtual {v2, v9}, Lr/q;->b(I)J

    .line 2403
    .line 2404
    .line 2405
    move-result-wide v23

    .line 2406
    iget-boolean v2, v2, Lr/q;->c:Z

    .line 2407
    .line 2408
    if-eqz v2, :cond_76

    .line 2409
    .line 2410
    move-object v2, v8

    .line 2411
    and-long v8, v23, v33

    .line 2412
    .line 2413
    :goto_5e
    long-to-int v8, v8

    .line 2414
    goto :goto_5f

    .line 2415
    :cond_76
    move-object v2, v8

    .line 2416
    shr-long v8, v23, v32

    .line 2417
    .line 2418
    goto :goto_5e

    .line 2419
    :goto_5f
    const/high16 v9, -0x80000000

    .line 2420
    .line 2421
    goto :goto_60

    .line 2422
    :cond_77
    move-object v2, v8

    .line 2423
    const/high16 v8, -0x80000000

    .line 2424
    .line 2425
    goto :goto_5f

    .line 2426
    :goto_60
    if-ne v12, v9, :cond_78

    .line 2427
    .line 2428
    move/from16 v12, v49

    .line 2429
    .line 2430
    move v13, v12

    .line 2431
    goto :goto_61

    .line 2432
    :cond_78
    move/from16 v13, v49

    .line 2433
    .line 2434
    invoke-static {v13, v12}, Ljava/lang/Math;->max(II)I

    .line 2435
    .line 2436
    .line 2437
    move-result v12

    .line 2438
    :goto_61
    if-eq v8, v9, :cond_79

    .line 2439
    .line 2440
    sub-int/2addr v8, v11

    .line 2441
    invoke-static {v12, v8}, Ljava/lang/Math;->min(II)I

    .line 2442
    .line 2443
    .line 2444
    move-result v12

    .line 2445
    :cond_79
    const/4 v8, 0x1

    .line 2446
    iput-boolean v8, v6, Lr/q;->s:Z

    .line 2447
    .line 2448
    move/from16 v9, v21

    .line 2449
    .line 2450
    invoke-virtual {v6, v12, v14, v9}, Lr/q;->d(III)V

    .line 2451
    .line 2452
    .line 2453
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2454
    .line 2455
    .line 2456
    add-int/lit8 v12, v17, 0x1

    .line 2457
    .line 2458
    move-object v8, v2

    .line 2459
    move/from16 v49, v13

    .line 2460
    .line 2461
    move-object/from16 v2, v19

    .line 2462
    .line 2463
    move/from16 v6, v20

    .line 2464
    .line 2465
    move v13, v9

    .line 2466
    goto/16 :goto_54

    .line 2467
    .line 2468
    :cond_7a
    move v9, v13

    .line 2469
    move/from16 v13, v49

    .line 2470
    .line 2471
    const/4 v8, 0x1

    .line 2472
    goto :goto_62

    .line 2473
    :cond_7b
    move v9, v13

    .line 2474
    move/from16 v13, v49

    .line 2475
    .line 2476
    const/4 v8, 0x1

    .line 2477
    move-object/from16 v7, v44

    .line 2478
    .line 2479
    :goto_62
    if-eqz v37, :cond_7d

    .line 2480
    .line 2481
    invoke-static {v3}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 2482
    .line 2483
    .line 2484
    move-result-object v2

    .line 2485
    check-cast v2, Lr/q;

    .line 2486
    .line 2487
    if-eqz v2, :cond_7c

    .line 2488
    .line 2489
    iget v2, v2, Lr/q;->a:I

    .line 2490
    .line 2491
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v2

    .line 2495
    goto :goto_64

    .line 2496
    :cond_7c
    move-object/from16 v2, v39

    .line 2497
    .line 2498
    goto :goto_64

    .line 2499
    :cond_7d
    invoke-virtual {v0}, Ltf/k;->isEmpty()Z

    .line 2500
    .line 2501
    .line 2502
    move-result v2

    .line 2503
    if-eqz v2, :cond_7e

    .line 2504
    .line 2505
    move-object/from16 v2, v39

    .line 2506
    .line 2507
    goto :goto_63

    .line 2508
    :cond_7e
    iget-object v2, v0, Ltf/k;->h:[Ljava/lang/Object;

    .line 2509
    .line 2510
    iget v6, v0, Ltf/k;->g:I

    .line 2511
    .line 2512
    aget-object v2, v2, v6

    .line 2513
    .line 2514
    :goto_63
    check-cast v2, Lr/q;

    .line 2515
    .line 2516
    if-eqz v2, :cond_7c

    .line 2517
    .line 2518
    iget v2, v2, Lr/q;->a:I

    .line 2519
    .line 2520
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v2

    .line 2524
    :goto_64
    if-eqz v37, :cond_80

    .line 2525
    .line 2526
    invoke-static {v3}, Ltf/m;->C1(Ljava/util/List;)Ljava/lang/Object;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v0

    .line 2530
    check-cast v0, Lr/q;

    .line 2531
    .line 2532
    if-eqz v0, :cond_7f

    .line 2533
    .line 2534
    iget v0, v0, Lr/q;->a:I

    .line 2535
    .line 2536
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v39

    .line 2540
    :cond_7f
    :goto_65
    move/from16 v0, v43

    .line 2541
    .line 2542
    goto :goto_66

    .line 2543
    :cond_80
    invoke-virtual {v0}, Ltf/k;->g()Ljava/lang/Object;

    .line 2544
    .line 2545
    .line 2546
    move-result-object v0

    .line 2547
    check-cast v0, Lr/q;

    .line 2548
    .line 2549
    if-eqz v0, :cond_7f

    .line 2550
    .line 2551
    iget v0, v0, Lr/q;->a:I

    .line 2552
    .line 2553
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v39

    .line 2557
    goto :goto_65

    .line 2558
    :goto_66
    if-lt v0, v5, :cond_82

    .line 2559
    .line 2560
    if-le v10, v4, :cond_81

    .line 2561
    .line 2562
    goto :goto_67

    .line 2563
    :cond_81
    const/4 v8, 0x0

    .line 2564
    :cond_82
    :goto_67
    new-instance v0, Ld9/h;

    .line 2565
    .line 2566
    move-object/from16 v4, v56

    .line 2567
    .line 2568
    invoke-direct {v0, v4, v3, v7, v1}, Ld9/h;-><init>(Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Z)V

    .line 2569
    .line 2570
    .line 2571
    add-int v14, v14, v31

    .line 2572
    .line 2573
    move-wide/from16 v10, v46

    .line 2574
    .line 2575
    invoke-static {v14, v10, v11}, Lu2/b;->g(IJ)I

    .line 2576
    .line 2577
    .line 2578
    move-result v1

    .line 2579
    add-int v4, v9, v38

    .line 2580
    .line 2581
    invoke-static {v4, v10, v11}, Lu2/b;->f(IJ)I

    .line 2582
    .line 2583
    .line 2584
    move-result v4

    .line 2585
    move-object/from16 v6, p1

    .line 2586
    .line 2587
    move-object/from16 v9, v42

    .line 2588
    .line 2589
    invoke-interface {v6, v1, v4, v9, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v10

    .line 2593
    if-eqz v2, :cond_83

    .line 2594
    .line 2595
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2596
    .line 2597
    .line 2598
    move-result v12

    .line 2599
    goto :goto_68

    .line 2600
    :cond_83
    const/4 v12, 0x0

    .line 2601
    :goto_68
    if-eqz v39, :cond_84

    .line 2602
    .line 2603
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Integer;->intValue()I

    .line 2604
    .line 2605
    .line 2606
    move-result v0

    .line 2607
    goto :goto_69

    .line 2608
    :cond_84
    const/4 v0, 0x0

    .line 2609
    :goto_69
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2610
    .line 2611
    .line 2612
    move-result v1

    .line 2613
    if-eqz v1, :cond_85

    .line 2614
    .line 2615
    move-object/from16 v17, v44

    .line 2616
    .line 2617
    goto :goto_6b

    .line 2618
    :cond_85
    new-instance v1, Ljava/util/ArrayList;

    .line 2619
    .line 2620
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 2621
    .line 2622
    .line 2623
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 2624
    .line 2625
    .line 2626
    move-result v2

    .line 2627
    const/4 v4, 0x0

    .line 2628
    :goto_6a
    if-ge v4, v2, :cond_87

    .line 2629
    .line 2630
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v7

    .line 2634
    check-cast v7, Lr/q;

    .line 2635
    .line 2636
    iget v9, v7, Lr/q;->a:I

    .line 2637
    .line 2638
    if-gt v12, v9, :cond_86

    .line 2639
    .line 2640
    if-gt v9, v0, :cond_86

    .line 2641
    .line 2642
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2643
    .line 2644
    .line 2645
    :cond_86
    add-int/lit8 v4, v4, 0x1

    .line 2646
    .line 2647
    goto :goto_6a

    .line 2648
    :cond_87
    sget-object v0, Ls/o;->b:Lb8/c;

    .line 2649
    .line 2650
    invoke-static {v1, v0}, Ltf/q;->g1(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2651
    .line 2652
    .line 2653
    move-object/from16 v17, v1

    .line 2654
    .line 2655
    :goto_6b
    if-eqz v22, :cond_88

    .line 2656
    .line 2657
    move-object/from16 v21, v30

    .line 2658
    .line 2659
    :goto_6c
    move v11, v5

    .line 2660
    goto :goto_6d

    .line 2661
    :cond_88
    move-object/from16 v21, v29

    .line 2662
    .line 2663
    goto :goto_6c

    .line 2664
    :goto_6d
    new-instance v5, Lr/p;

    .line 2665
    .line 2666
    iget-wide v0, v15, Lr/n;->d:J

    .line 2667
    .line 2668
    move/from16 v20, v11

    .line 2669
    .line 2670
    move/from16 v18, v13

    .line 2671
    .line 2672
    move-object/from16 v14, v16

    .line 2673
    .line 2674
    move/from16 v7, v25

    .line 2675
    .line 2676
    move-object/from16 v13, v27

    .line 2677
    .line 2678
    move/from16 v22, v36

    .line 2679
    .line 2680
    move/from16 v23, v41

    .line 2681
    .line 2682
    move/from16 v19, v50

    .line 2683
    .line 2684
    move/from16 v12, v53

    .line 2685
    .line 2686
    move/from16 v11, v55

    .line 2687
    .line 2688
    move/from16 v9, v57

    .line 2689
    .line 2690
    move-wide v15, v0

    .line 2691
    move-object v0, v6

    .line 2692
    move-object/from16 v6, v61

    .line 2693
    .line 2694
    invoke-direct/range {v5 .. v23}, Lr/p;-><init>(Lr/q;IZFLv1/o0;FZLqg/t;Lu2/c;JLjava/util/List;IIILm/p1;II)V

    .line 2695
    .line 2696
    .line 2697
    :goto_6e
    invoke-interface {v0}, Lv1/o;->u0()Z

    .line 2698
    .line 2699
    .line 2700
    move-result v0

    .line 2701
    move-object/from16 v6, v63

    .line 2702
    .line 2703
    const/4 v14, 0x0

    .line 2704
    invoke-virtual {v6, v5, v0, v14}, Lr/z;->g(Lr/p;ZZ)V

    .line 2705
    .line 2706
    .line 2707
    return-object v5

    .line 2708
    :cond_89
    invoke-static/range {v17 .. v17}, Lj8/o;->l(Ljava/lang/String;)V

    .line 2709
    .line 2710
    .line 2711
    goto/16 :goto_9

    .line 2712
    .line 2713
    :cond_8a
    invoke-static/range {v17 .. v17}, Lj8/o;->l(Ljava/lang/String;)V

    .line 2714
    .line 2715
    .line 2716
    goto/16 :goto_9

    .line 2717
    .line 2718
    :catchall_0
    move-exception v0

    .line 2719
    invoke-static {v8, v1, v10}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 2720
    .line 2721
    .line 2722
    throw v0

    .line 2723
    :cond_8b
    const-string v0, "null horizontalAlignment when isVertical == false"

    .line 2724
    .line 2725
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 2726
    .line 2727
    .line 2728
    invoke-static {}, Lokio/a;->c()V

    .line 2729
    .line 2730
    .line 2731
    goto/16 :goto_9
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget v2, v0, Lb0/q;->g:I

    .line 6
    .line 7
    const/4 v4, -0x1

    .line 8
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 9
    .line 10
    const/16 v6, 0x9

    .line 11
    .line 12
    const/16 v7, 0x8

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x6

    .line 16
    sget-object v10, Li0/l;->a:Li0/e;

    .line 17
    .line 18
    const/4 v11, 0x2

    .line 19
    const/4 v12, 0x0

    .line 20
    const/4 v13, 0x1

    .line 21
    sget-object v14, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    iget-object v15, v0, Lb0/q;->h:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 v16, 0x31

    .line 26
    .line 27
    iget-object v3, v0, Lb0/q;->i:Ljava/lang/Object;

    .line 28
    .line 29
    packed-switch v2, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v3, Lwb/fu;

    .line 33
    .line 34
    check-cast v15, Lfg/a;

    .line 35
    .line 36
    move-object/from16 v2, p1

    .line 37
    .line 38
    check-cast v2, Li0/h0;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v13}, Li0/r;->C(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v3, v15, v2, v1}, Lwb/ho;->g4(Lwb/fu;Lfg/a;Li0/h0;I)V

    .line 50
    .line 51
    .line 52
    return-object v14

    .line 53
    :pswitch_0
    check-cast v3, Lwb/c3;

    .line 54
    .line 55
    check-cast v15, Lfg/a;

    .line 56
    .line 57
    move-object/from16 v2, p1

    .line 58
    .line 59
    check-cast v2, Li0/h0;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v13}, Li0/r;->C(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v3, v15, v2, v1}, Lwb/ho;->F0(Lwb/c3;Lfg/a;Li0/h0;I)V

    .line 71
    .line 72
    .line 73
    return-object v14

    .line 74
    :pswitch_1
    check-cast v3, Lwb/s0;

    .line 75
    .line 76
    check-cast v15, Li0/a1;

    .line 77
    .line 78
    move-object/from16 v2, p1

    .line 79
    .line 80
    check-cast v2, Li0/h0;

    .line 81
    .line 82
    check-cast v1, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    and-int/lit8 v4, v1, 0x3

    .line 89
    .line 90
    if-eq v4, v11, :cond_0

    .line 91
    .line 92
    move v12, v13

    .line 93
    :cond_0
    and-int/2addr v1, v13

    .line 94
    invoke-virtual {v2, v1, v12}, Li0/h0;->S(IZ)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    if-nez v3, :cond_1

    .line 101
    .line 102
    const-string v1, "\u7fa4\u540d\u79f0 / \u7fa4\u804a\u5907\u6ce8 / \u7fa4\u53f7"

    .line 103
    .line 104
    :goto_0
    move-object/from16 v17, v1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    const-string v1, "\u7fa4\u6635\u79f0 / wxid"

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :goto_1
    invoke-interface {v15}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    move-object/from16 v18, v1

    .line 115
    .line 116
    check-cast v18, Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v2, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-nez v1, :cond_2

    .line 127
    .line 128
    if-ne v3, v10, :cond_3

    .line 129
    .line 130
    :cond_2
    new-instance v3, Lwb/aj;

    .line 131
    .line 132
    const/16 v1, 0xe

    .line 133
    .line 134
    invoke-direct {v3, v15, v1}, Lwb/aj;-><init>(Li0/a1;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_3
    move-object/from16 v20, v3

    .line 141
    .line 142
    check-cast v20, Lfg/l;

    .line 143
    .line 144
    const/16 v22, 0x6

    .line 145
    .line 146
    const/16 v23, 0x8

    .line 147
    .line 148
    const-string v16, "\u641c\u7d22"

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    move-object/from16 v21, v2

    .line 153
    .line 154
    invoke-static/range {v16 .. v23}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    move-object/from16 v21, v2

    .line 159
    .line 160
    invoke-virtual/range {v21 .. v21}, Li0/h0;->V()V

    .line 161
    .line 162
    .line 163
    :goto_2
    return-object v14

    .line 164
    :pswitch_2
    check-cast v3, Ljava/lang/String;

    .line 165
    .line 166
    check-cast v15, Li0/a1;

    .line 167
    .line 168
    move-object/from16 v6, p1

    .line 169
    .line 170
    check-cast v6, Li0/h0;

    .line 171
    .line 172
    check-cast v1, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    and-int/lit8 v2, v1, 0x3

    .line 179
    .line 180
    if-eq v2, v11, :cond_5

    .line 181
    .line 182
    move v2, v13

    .line 183
    goto :goto_3

    .line 184
    :cond_5
    move v2, v12

    .line 185
    :goto_3
    and-int/2addr v1, v13

    .line 186
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_8

    .line 191
    .line 192
    invoke-interface {v15}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-virtual {v6, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    if-nez v2, :cond_6

    .line 211
    .line 212
    if-ne v4, v10, :cond_7

    .line 213
    .line 214
    :cond_6
    new-instance v4, Lwb/gi;

    .line 215
    .line 216
    invoke-direct {v4, v15, v12}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_7
    move-object v5, v4

    .line 223
    check-cast v5, Lfg/l;

    .line 224
    .line 225
    const/16 v7, 0x30

    .line 226
    .line 227
    const/16 v8, 0x8

    .line 228
    .line 229
    const-string v2, "\u542f\u7528\u9ed8\u8ba4\u89c4\u5219"

    .line 230
    .line 231
    const/4 v4, 0x0

    .line 232
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 237
    .line 238
    .line 239
    :goto_4
    return-object v14

    .line 240
    :pswitch_3
    check-cast v3, Landroid/content/SharedPreferences;

    .line 241
    .line 242
    move-object v2, v15

    .line 243
    check-cast v2, Lfg/a;

    .line 244
    .line 245
    move-object/from16 v4, p1

    .line 246
    .line 247
    check-cast v4, Li0/h0;

    .line 248
    .line 249
    check-cast v1, Ljava/lang/Integer;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    and-int/lit8 v5, v1, 0x3

    .line 256
    .line 257
    if-eq v5, v11, :cond_9

    .line 258
    .line 259
    move v5, v13

    .line 260
    goto :goto_5

    .line 261
    :cond_9
    move v5, v12

    .line 262
    :goto_5
    and-int/2addr v1, v13

    .line 263
    invoke-virtual {v4, v1, v5}, Li0/h0;->S(IZ)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_c

    .line 268
    .line 269
    const/16 v19, 0x1

    .line 270
    .line 271
    const/16 v21, 0x6db0

    .line 272
    .line 273
    const-string v16, "keyword_notify_system"

    .line 274
    .line 275
    const-string v17, "\u7cfb\u7edf\u901a\u77e5"

    .line 276
    .line 277
    const-string v18, "\u5728\u901a\u77e5\u680f\u663e\u793a\u63d0\u9192"

    .line 278
    .line 279
    move-object v15, v3

    .line 280
    move-object/from16 v20, v4

    .line 281
    .line 282
    invoke-static/range {v15 .. v21}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v1, v20

    .line 286
    .line 287
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 288
    .line 289
    .line 290
    const-string v16, "keyword_notify_toast"

    .line 291
    .line 292
    const-string v17, "Toast \u63d0\u793a"

    .line 293
    .line 294
    const-string v18, "\u77ed\u6682\u5f39\u51fa\u63d0\u793a"

    .line 295
    .line 296
    invoke-static/range {v15 .. v21}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 297
    .line 298
    .line 299
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 300
    .line 301
    .line 302
    const-string v16, "keyword_notify_at_me"

    .line 303
    .line 304
    const-string v17, "@\u6211\u901a\u77e5"

    .line 305
    .line 306
    const-string v18, "\u7fa4\u804a\u6709\u4eba @ \u6211\u65f6\u63d0\u9192"

    .line 307
    .line 308
    invoke-static/range {v15 .. v21}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 312
    .line 313
    .line 314
    const-string v16, "keyword_notify_at_all"

    .line 315
    .line 316
    const-string v17, "@\u6240\u6709\u4eba/\u7fa4\u516c\u544a\u901a\u77e5"

    .line 317
    .line 318
    const-string v18, "\u547d\u4e2d @\u6240\u6709\u4eba \u6216\u7fa4\u516c\u544a\u65f6\u63d0\u9192"

    .line 319
    .line 320
    invoke-static/range {v15 .. v21}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 321
    .line 322
    .line 323
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    if-nez v3, :cond_a

    .line 335
    .line 336
    if-ne v4, v10, :cond_b

    .line 337
    .line 338
    :cond_a
    new-instance v4, Lwb/kc;

    .line 339
    .line 340
    const/4 v3, 0x3

    .line 341
    invoke-direct {v4, v2, v3}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_b
    check-cast v4, Lfg/a;

    .line 348
    .line 349
    const/16 v2, 0x36

    .line 350
    .line 351
    const-string v3, "\u901a\u77e5/Toast\u6a21\u677f"

    .line 352
    .line 353
    const-string v5, "\u7559\u7a7a\u65f6\u4f7f\u7528\u5185\u7f6e\u9ed8\u8ba4\u6a21\u677f"

    .line 354
    .line 355
    invoke-static {v3, v5, v4, v1, v2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 356
    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_c
    move-object v1, v4

    .line 360
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 361
    .line 362
    .line 363
    :goto_6
    return-object v14

    .line 364
    :pswitch_4
    check-cast v3, Ljava/util/List;

    .line 365
    .line 366
    check-cast v15, Lfg/a;

    .line 367
    .line 368
    move-object/from16 v2, p1

    .line 369
    .line 370
    check-cast v2, Li0/h0;

    .line 371
    .line 372
    check-cast v1, Ljava/lang/Integer;

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    and-int/lit8 v4, v1, 0x3

    .line 379
    .line 380
    if-eq v4, v11, :cond_d

    .line 381
    .line 382
    move v12, v13

    .line 383
    :cond_d
    and-int/2addr v1, v13

    .line 384
    invoke-virtual {v2, v1, v12}, Li0/h0;->S(IZ)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_e

    .line 389
    .line 390
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    const-string v3, "\u7edf\u4e00\u4fee\u6539\u5168\u90e8 "

    .line 395
    .line 396
    const-string v4, " \u4e2a\u4f1a\u8bdd\u89c4\u5219"

    .line 397
    .line 398
    invoke-static {v1, v3, v4}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    const-string v3, "\u6279\u91cf\u914d\u7f6e"

    .line 403
    .line 404
    invoke-static {v3, v1, v15, v2, v9}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 405
    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_e
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 409
    .line 410
    .line 411
    :goto_7
    return-object v14

    .line 412
    :pswitch_5
    check-cast v3, Lx9/f;

    .line 413
    .line 414
    check-cast v15, Lfg/l;

    .line 415
    .line 416
    move-object/from16 v2, p1

    .line 417
    .line 418
    check-cast v2, Li0/h0;

    .line 419
    .line 420
    check-cast v1, Ljava/lang/Integer;

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    and-int/lit8 v4, v1, 0x3

    .line 427
    .line 428
    if-eq v4, v11, :cond_f

    .line 429
    .line 430
    move v4, v13

    .line 431
    goto :goto_8

    .line 432
    :cond_f
    move v4, v12

    .line 433
    :goto_8
    and-int/2addr v1, v13

    .line 434
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    if-eqz v1, :cond_13

    .line 439
    .line 440
    iget-object v1, v3, Lx9/f;->a:Ljava/lang/String;

    .line 441
    .line 442
    iget-boolean v4, v3, Lx9/f;->b:Z

    .line 443
    .line 444
    if-eqz v4, :cond_10

    .line 445
    .line 446
    const-string v4, "\u5168\u5b57\u5339\u914d"

    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_10
    const-string v4, "\u6a21\u7cca\u5339\u914d"

    .line 450
    .line 451
    :goto_9
    invoke-virtual {v2, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v5

    .line 455
    invoke-virtual {v2, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v6

    .line 459
    or-int/2addr v5, v6

    .line 460
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    if-nez v5, :cond_11

    .line 465
    .line 466
    if-ne v6, v10, :cond_12

    .line 467
    .line 468
    :cond_11
    new-instance v6, Lsh/v1;

    .line 469
    .line 470
    const/16 v5, 0x18

    .line 471
    .line 472
    invoke-direct {v6, v15, v5, v3}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :cond_12
    check-cast v6, Lfg/a;

    .line 479
    .line 480
    invoke-static {v1, v4, v6, v2, v12}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 481
    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_13
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 485
    .line 486
    .line 487
    :goto_a
    return-object v14

    .line 488
    :pswitch_6
    check-cast v3, Lv8/a;

    .line 489
    .line 490
    check-cast v15, Lfg/l;

    .line 491
    .line 492
    move-object/from16 v2, p1

    .line 493
    .line 494
    check-cast v2, Li0/h0;

    .line 495
    .line 496
    check-cast v1, Ljava/lang/Integer;

    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    and-int/lit8 v4, v1, 0x3

    .line 503
    .line 504
    if-eq v4, v11, :cond_14

    .line 505
    .line 506
    move v4, v13

    .line 507
    goto :goto_b

    .line 508
    :cond_14
    move v4, v12

    .line 509
    :goto_b
    and-int/2addr v1, v13

    .line 510
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    if-eqz v1, :cond_20

    .line 515
    .line 516
    iget-boolean v1, v3, Lv8/a;->c:Z

    .line 517
    .line 518
    invoke-virtual {v2, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    invoke-virtual {v2, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v5

    .line 526
    or-int/2addr v4, v5

    .line 527
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    if-nez v4, :cond_15

    .line 532
    .line 533
    if-ne v5, v10, :cond_16

    .line 534
    .line 535
    :cond_15
    new-instance v5, Lwb/pg;

    .line 536
    .line 537
    const/4 v4, 0x4

    .line 538
    invoke-direct {v5, v15, v3, v4}, Lwb/pg;-><init>(Lfg/l;Lv8/a;I)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_16
    move-object/from16 v20, v5

    .line 545
    .line 546
    check-cast v20, Lfg/l;

    .line 547
    .line 548
    const/16 v22, 0x1b0

    .line 549
    .line 550
    const/16 v23, 0x8

    .line 551
    .line 552
    const-string v17, "\u542f\u7528\u89c4\u5219"

    .line 553
    .line 554
    const-string v18, "\u5173\u95ed\u540e\u4fdd\u7559\u914d\u7f6e\u4f46\u4e0d\u89e6\u53d1"

    .line 555
    .line 556
    const/16 v19, 0x0

    .line 557
    .line 558
    move/from16 v16, v1

    .line 559
    .line 560
    move-object/from16 v21, v2

    .line 561
    .line 562
    invoke-static/range {v16 .. v23}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 563
    .line 564
    .line 565
    move-object/from16 v1, v21

    .line 566
    .line 567
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 568
    .line 569
    .line 570
    iget-boolean v2, v3, Lv8/a;->d:Z

    .line 571
    .line 572
    invoke-virtual {v1, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v4

    .line 576
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v5

    .line 580
    or-int/2addr v4, v5

    .line 581
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    if-nez v4, :cond_17

    .line 586
    .line 587
    if-ne v5, v10, :cond_18

    .line 588
    .line 589
    :cond_17
    new-instance v5, Lwb/pg;

    .line 590
    .line 591
    const/4 v4, 0x5

    .line 592
    invoke-direct {v5, v15, v3, v4}, Lwb/pg;-><init>(Lfg/l;Lv8/a;I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    :cond_18
    move-object/from16 v20, v5

    .line 599
    .line 600
    check-cast v20, Lfg/l;

    .line 601
    .line 602
    const/16 v22, 0x1b0

    .line 603
    .line 604
    const/16 v23, 0x8

    .line 605
    .line 606
    const-string v17, "\u8f6c\u53d1\u81ea\u5df1\u53d1\u9001\u7684\u6d88\u606f"

    .line 607
    .line 608
    const-string v18, "\u9ed8\u8ba4\u5173\u95ed\uff1b\u6a21\u5757\u81ea\u52a8\u8f6c\u53d1\u7684\u6d88\u606f\u4e0d\u4f1a\u518d\u6b21\u89e6\u53d1"

    .line 609
    .line 610
    const/16 v19, 0x0

    .line 611
    .line 612
    move-object/from16 v21, v1

    .line 613
    .line 614
    move/from16 v16, v2

    .line 615
    .line 616
    invoke-static/range {v16 .. v23}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 617
    .line 618
    .line 619
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 620
    .line 621
    .line 622
    iget-object v2, v3, Lv8/a;->b:Ljava/lang/String;

    .line 623
    .line 624
    invoke-virtual {v1, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v4

    .line 628
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v5

    .line 632
    or-int/2addr v4, v5

    .line 633
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v5

    .line 637
    if-nez v4, :cond_19

    .line 638
    .line 639
    if-ne v5, v10, :cond_1a

    .line 640
    .line 641
    :cond_19
    new-instance v5, Lwb/pg;

    .line 642
    .line 643
    invoke-direct {v5, v15, v3, v9}, Lwb/pg;-><init>(Lfg/l;Lv8/a;I)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    :cond_1a
    move-object/from16 v20, v5

    .line 650
    .line 651
    check-cast v20, Lfg/l;

    .line 652
    .line 653
    const/16 v22, 0x36

    .line 654
    .line 655
    const/16 v23, 0x8

    .line 656
    .line 657
    const-string v16, "\u89c4\u5219\u540d\u79f0"

    .line 658
    .line 659
    const-string v17, "\u7528\u4e8e\u5217\u8868\u91cc\u8bc6\u522b\u89c4\u5219"

    .line 660
    .line 661
    const/16 v19, 0x0

    .line 662
    .line 663
    move-object/from16 v21, v1

    .line 664
    .line 665
    move-object/from16 v18, v2

    .line 666
    .line 667
    invoke-static/range {v16 .. v23}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 668
    .line 669
    .line 670
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 671
    .line 672
    .line 673
    iget-boolean v2, v3, Lv8/a;->i:Z

    .line 674
    .line 675
    invoke-virtual {v1, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v4

    .line 679
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    or-int/2addr v4, v5

    .line 684
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    if-nez v4, :cond_1b

    .line 689
    .line 690
    if-ne v5, v10, :cond_1c

    .line 691
    .line 692
    :cond_1b
    new-instance v5, Lwb/pg;

    .line 693
    .line 694
    const/4 v4, 0x7

    .line 695
    invoke-direct {v5, v15, v3, v4}, Lwb/pg;-><init>(Lfg/l;Lv8/a;I)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v1, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    :cond_1c
    move-object/from16 v20, v5

    .line 702
    .line 703
    check-cast v20, Lfg/l;

    .line 704
    .line 705
    const/16 v22, 0x1b0

    .line 706
    .line 707
    const/16 v23, 0x8

    .line 708
    .line 709
    const-string v17, "\u5ef6\u8fdf\u53d1\u9001"

    .line 710
    .line 711
    const-string v18, "\u5f00\u542f\u540e\u6309\u8bbe\u7f6e\u65f6\u95f4\u7b49\u5f85\u518d\u8f6c\u53d1"

    .line 712
    .line 713
    const/16 v19, 0x0

    .line 714
    .line 715
    move-object/from16 v21, v1

    .line 716
    .line 717
    move/from16 v16, v2

    .line 718
    .line 719
    invoke-static/range {v16 .. v23}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 720
    .line 721
    .line 722
    iget-boolean v2, v3, Lv8/a;->i:Z

    .line 723
    .line 724
    if-eqz v2, :cond_1f

    .line 725
    .line 726
    const v2, -0x3c8b8b1c

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1, v2}, Li0/h0;->a0(I)V

    .line 730
    .line 731
    .line 732
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 733
    .line 734
    .line 735
    iget-wide v4, v3, Lv8/a;->j:J

    .line 736
    .line 737
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v18

    .line 741
    invoke-virtual {v1, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v2

    .line 745
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    move-result v4

    .line 749
    or-int/2addr v2, v4

    .line 750
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    if-nez v2, :cond_1d

    .line 755
    .line 756
    if-ne v4, v10, :cond_1e

    .line 757
    .line 758
    :cond_1d
    new-instance v4, Lwb/pg;

    .line 759
    .line 760
    invoke-direct {v4, v15, v3, v7}, Lwb/pg;-><init>(Lfg/l;Lv8/a;I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    :cond_1e
    move-object/from16 v19, v4

    .line 767
    .line 768
    check-cast v19, Lfg/l;

    .line 769
    .line 770
    const/16 v21, 0x36

    .line 771
    .line 772
    const-string v16, "\u5ef6\u8fdf\u65f6\u95f4"

    .line 773
    .line 774
    const-string v17, "\u5355\u4f4d\u79d2\uff0c0 \u8868\u793a\u7acb\u5373\u53d1\u9001"

    .line 775
    .line 776
    move-object/from16 v20, v1

    .line 777
    .line 778
    invoke-static/range {v16 .. v21}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v1, v12}, Li0/h0;->p(Z)V

    .line 782
    .line 783
    .line 784
    goto :goto_c

    .line 785
    :cond_1f
    const v2, -0x3c87212f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1, v2}, Li0/h0;->a0(I)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1, v12}, Li0/h0;->p(Z)V

    .line 792
    .line 793
    .line 794
    goto :goto_c

    .line 795
    :cond_20
    move-object v1, v2

    .line 796
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 797
    .line 798
    .line 799
    :goto_c
    return-object v14

    .line 800
    :pswitch_7
    check-cast v3, Lwb/mu;

    .line 801
    .line 802
    check-cast v15, Li0/a1;

    .line 803
    .line 804
    move-object/from16 v2, p1

    .line 805
    .line 806
    check-cast v2, Li0/h0;

    .line 807
    .line 808
    check-cast v1, Ljava/lang/Integer;

    .line 809
    .line 810
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    and-int/lit8 v4, v1, 0x3

    .line 815
    .line 816
    if-eq v4, v11, :cond_21

    .line 817
    .line 818
    move v4, v13

    .line 819
    goto :goto_d

    .line 820
    :cond_21
    move v4, v12

    .line 821
    :goto_d
    and-int/2addr v1, v13

    .line 822
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 823
    .line 824
    .line 825
    move-result v1

    .line 826
    if-eqz v1, :cond_24

    .line 827
    .line 828
    iget-object v1, v3, Lwb/mu;->b:Lua/h;

    .line 829
    .line 830
    iget-object v1, v1, Lua/h;->b:Ljava/lang/String;

    .line 831
    .line 832
    const/16 v20, 0x6

    .line 833
    .line 834
    const/16 v21, 0x4

    .line 835
    .line 836
    const-string v16, "ID"

    .line 837
    .line 838
    const/16 v18, 0x0

    .line 839
    .line 840
    move-object/from16 v17, v1

    .line 841
    .line 842
    move-object/from16 v19, v2

    .line 843
    .line 844
    invoke-static/range {v16 .. v21}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 845
    .line 846
    .line 847
    move-object/from16 v1, v19

    .line 848
    .line 849
    invoke-static {v8, v1, v12, v13}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 850
    .line 851
    .line 852
    invoke-interface {v15}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    check-cast v2, Ljava/lang/Boolean;

    .line 857
    .line 858
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 859
    .line 860
    .line 861
    move-result v16

    .line 862
    invoke-virtual {v1, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    if-nez v2, :cond_22

    .line 871
    .line 872
    if-ne v3, v10, :cond_23

    .line 873
    .line 874
    :cond_22
    new-instance v3, Lwb/oh;

    .line 875
    .line 876
    const/16 v2, 0x1b

    .line 877
    .line 878
    invoke-direct {v3, v15, v2}, Lwb/oh;-><init>(Li0/a1;I)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    :cond_23
    move-object/from16 v20, v3

    .line 885
    .line 886
    check-cast v20, Lfg/l;

    .line 887
    .line 888
    const/16 v22, 0x1b0

    .line 889
    .line 890
    const/16 v23, 0x8

    .line 891
    .line 892
    const-string v17, "\u542f\u7528\u81ea\u52a8\u6536\u6b3e"

    .line 893
    .line 894
    const-string v18, "\u5173\u95ed\u540e\u8be5\u804a\u5929\u4e0d\u4f1a\u81ea\u52a8\u6536\u6b3e"

    .line 895
    .line 896
    const/16 v19, 0x0

    .line 897
    .line 898
    move-object/from16 v21, v1

    .line 899
    .line 900
    invoke-static/range {v16 .. v23}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 901
    .line 902
    .line 903
    goto :goto_e

    .line 904
    :cond_24
    move-object v1, v2

    .line 905
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 906
    .line 907
    .line 908
    :goto_e
    return-object v14

    .line 909
    :pswitch_8
    check-cast v3, Lvb/a;

    .line 910
    .line 911
    check-cast v15, Lfg/a;

    .line 912
    .line 913
    move-object/from16 v2, p1

    .line 914
    .line 915
    check-cast v2, Li0/h0;

    .line 916
    .line 917
    check-cast v1, Ljava/lang/Integer;

    .line 918
    .line 919
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-static {v13}, Li0/r;->C(I)I

    .line 923
    .line 924
    .line 925
    move-result v1

    .line 926
    invoke-static {v3, v15, v2, v1}, Lwb/ho;->I0(Lvb/a;Lfg/a;Li0/h0;I)V

    .line 927
    .line 928
    .line 929
    return-object v14

    .line 930
    :pswitch_9
    check-cast v3, Lwb/d3;

    .line 931
    .line 932
    check-cast v15, Lfg/a;

    .line 933
    .line 934
    move-object/from16 v2, p1

    .line 935
    .line 936
    check-cast v2, Li0/h0;

    .line 937
    .line 938
    check-cast v1, Ljava/lang/Integer;

    .line 939
    .line 940
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    invoke-static {v13}, Li0/r;->C(I)I

    .line 944
    .line 945
    .line 946
    move-result v1

    .line 947
    invoke-static {v3, v15, v2, v1}, Lwb/ho;->K0(Lwb/d3;Lfg/a;Li0/h0;I)V

    .line 948
    .line 949
    .line 950
    return-object v14

    .line 951
    :pswitch_a
    check-cast v3, Leb/c0;

    .line 952
    .line 953
    check-cast v15, Lfg/a;

    .line 954
    .line 955
    move-object/from16 v2, p1

    .line 956
    .line 957
    check-cast v2, Li0/h0;

    .line 958
    .line 959
    check-cast v1, Ljava/lang/Integer;

    .line 960
    .line 961
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    invoke-static {v6}, Li0/r;->C(I)I

    .line 965
    .line 966
    .line 967
    move-result v1

    .line 968
    invoke-static {v3, v15, v2, v1}, Lwb/ho;->H2(Leb/c0;Lfg/a;Li0/h0;I)V

    .line 969
    .line 970
    .line 971
    return-object v14

    .line 972
    :pswitch_b
    check-cast v3, Lwb/z2;

    .line 973
    .line 974
    check-cast v15, Lfg/a;

    .line 975
    .line 976
    move-object/from16 v2, p1

    .line 977
    .line 978
    check-cast v2, Li0/h0;

    .line 979
    .line 980
    check-cast v1, Ljava/lang/Integer;

    .line 981
    .line 982
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    invoke-static {v6}, Li0/r;->C(I)I

    .line 986
    .line 987
    .line 988
    move-result v1

    .line 989
    invoke-static {v3, v15, v2, v1}, Lwb/ho;->B0(Lwb/z2;Lfg/a;Li0/h0;I)V

    .line 990
    .line 991
    .line 992
    return-object v14

    .line 993
    :pswitch_c
    check-cast v3, Lc9/q0;

    .line 994
    .line 995
    check-cast v15, Lfg/a;

    .line 996
    .line 997
    move-object/from16 v2, p1

    .line 998
    .line 999
    check-cast v2, Ljava/lang/String;

    .line 1000
    .line 1001
    check-cast v1, Ljava/lang/String;

    .line 1002
    .line 1003
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v3, v2, v1}, Lc9/q0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    check-cast v1, Ljava/lang/Boolean;

    .line 1014
    .line 1015
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v1

    .line 1019
    if-eqz v1, :cond_25

    .line 1020
    .line 1021
    invoke-interface {v15}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    :cond_25
    return-object v14

    .line 1025
    :pswitch_d
    check-cast v3, Ls0/d;

    .line 1026
    .line 1027
    check-cast v15, Lc9/r0;

    .line 1028
    .line 1029
    move-object/from16 v2, p1

    .line 1030
    .line 1031
    check-cast v2, Li0/h0;

    .line 1032
    .line 1033
    check-cast v1, Ljava/lang/Integer;

    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1036
    .line 1037
    .line 1038
    move-result v1

    .line 1039
    and-int/lit8 v4, v1, 0x3

    .line 1040
    .line 1041
    if-eq v4, v11, :cond_26

    .line 1042
    .line 1043
    move v4, v13

    .line 1044
    goto :goto_f

    .line 1045
    :cond_26
    move v4, v12

    .line 1046
    :goto_f
    and-int/2addr v1, v13

    .line 1047
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v1

    .line 1051
    if-eqz v1, :cond_27

    .line 1052
    .line 1053
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v1

    .line 1057
    invoke-virtual {v3, v15, v2, v1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    goto :goto_10

    .line 1061
    :cond_27
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 1062
    .line 1063
    .line 1064
    :goto_10
    return-object v14

    .line 1065
    :pswitch_e
    check-cast v3, Ls0/d;

    .line 1066
    .line 1067
    check-cast v15, Lsh/o0;

    .line 1068
    .line 1069
    move-object/from16 v2, p1

    .line 1070
    .line 1071
    check-cast v2, Li0/h0;

    .line 1072
    .line 1073
    check-cast v1, Ljava/lang/Integer;

    .line 1074
    .line 1075
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1076
    .line 1077
    .line 1078
    move-result v1

    .line 1079
    and-int/lit8 v4, v1, 0x3

    .line 1080
    .line 1081
    if-eq v4, v11, :cond_28

    .line 1082
    .line 1083
    move v4, v13

    .line 1084
    goto :goto_11

    .line 1085
    :cond_28
    move v4, v12

    .line 1086
    :goto_11
    and-int/2addr v1, v13

    .line 1087
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v1

    .line 1091
    if-eqz v1, :cond_2a

    .line 1092
    .line 1093
    sget-object v1, Ly0/b;->g:Ly0/g;

    .line 1094
    .line 1095
    invoke-static {v1, v12}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    iget-wide v6, v2, Li0/h0;->T:J

    .line 1100
    .line 1101
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 1102
    .line 1103
    .line 1104
    move-result v4

    .line 1105
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v6

    .line 1109
    invoke-static {v2, v5}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v5

    .line 1113
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 1114
    .line 1115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 1119
    .line 1120
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 1121
    .line 1122
    .line 1123
    iget-boolean v8, v2, Li0/h0;->S:Z

    .line 1124
    .line 1125
    if-eqz v8, :cond_29

    .line 1126
    .line 1127
    invoke-virtual {v2, v7}, Li0/h0;->k(Lfg/a;)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_12

    .line 1131
    :cond_29
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 1132
    .line 1133
    .line 1134
    :goto_12
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 1135
    .line 1136
    invoke-static {v7, v2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1137
    .line 1138
    .line 1139
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 1140
    .line 1141
    invoke-static {v1, v2, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v1

    .line 1148
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 1149
    .line 1150
    invoke-static {v2, v1, v4}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1151
    .line 1152
    .line 1153
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 1154
    .line 1155
    invoke-static {v1, v2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1156
    .line 1157
    .line 1158
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 1159
    .line 1160
    invoke-static {v1, v2, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1161
    .line 1162
    .line 1163
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    invoke-virtual {v3, v15, v2, v1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v2, v13}, Li0/h0;->p(Z)V

    .line 1171
    .line 1172
    .line 1173
    goto :goto_13

    .line 1174
    :cond_2a
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 1175
    .line 1176
    .line 1177
    :goto_13
    return-object v14

    .line 1178
    :pswitch_f
    check-cast v3, Lp/x0;

    .line 1179
    .line 1180
    check-cast v15, Ls0/d;

    .line 1181
    .line 1182
    move-object/from16 v2, p1

    .line 1183
    .line 1184
    check-cast v2, Li0/h0;

    .line 1185
    .line 1186
    check-cast v1, Ljava/lang/Integer;

    .line 1187
    .line 1188
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1189
    .line 1190
    .line 1191
    move-result v1

    .line 1192
    and-int/lit8 v4, v1, 0x3

    .line 1193
    .line 1194
    if-eq v4, v11, :cond_2b

    .line 1195
    .line 1196
    move v4, v13

    .line 1197
    goto :goto_14

    .line 1198
    :cond_2b
    move v4, v12

    .line 1199
    :goto_14
    and-int/2addr v1, v13

    .line 1200
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v1

    .line 1204
    if-eqz v1, :cond_2d

    .line 1205
    .line 1206
    invoke-static {v5, v3}, Lp/d;->k(Ly0/o;Lp/x0;)Ly0/o;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    sget-object v3, Lp/j;->c:Lp/e;

    .line 1211
    .line 1212
    sget-object v4, Ly0/b;->s:Ly0/e;

    .line 1213
    .line 1214
    invoke-static {v3, v4, v2, v12}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v3

    .line 1218
    iget-wide v4, v2, Li0/h0;->T:J

    .line 1219
    .line 1220
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 1221
    .line 1222
    .line 1223
    move-result v4

    .line 1224
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v5

    .line 1228
    invoke-static {v2, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    sget-object v6, Lx1/g;->f:Lx1/f;

    .line 1233
    .line 1234
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    sget-object v6, Lx1/f;->b:Lx1/y;

    .line 1238
    .line 1239
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 1240
    .line 1241
    .line 1242
    iget-boolean v7, v2, Li0/h0;->S:Z

    .line 1243
    .line 1244
    if-eqz v7, :cond_2c

    .line 1245
    .line 1246
    invoke-virtual {v2, v6}, Li0/h0;->k(Lfg/a;)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_15

    .line 1250
    :cond_2c
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 1251
    .line 1252
    .line 1253
    :goto_15
    sget-object v6, Lx1/f;->e:Lx1/e;

    .line 1254
    .line 1255
    invoke-static {v6, v2, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1256
    .line 1257
    .line 1258
    sget-object v3, Lx1/f;->d:Lx1/e;

    .line 1259
    .line 1260
    invoke-static {v3, v2, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v3

    .line 1267
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 1268
    .line 1269
    invoke-static {v2, v3, v4}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1270
    .line 1271
    .line 1272
    sget-object v3, Lx1/f;->g:Lx1/d;

    .line 1273
    .line 1274
    invoke-static {v3, v2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1275
    .line 1276
    .line 1277
    sget-object v3, Lx1/f;->c:Lx1/e;

    .line 1278
    .line 1279
    invoke-static {v3, v2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1280
    .line 1281
    .line 1282
    sget-object v1, Lp/u;->a:Lp/u;

    .line 1283
    .line 1284
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v3

    .line 1288
    invoke-virtual {v15, v1, v2, v3}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v2, v13}, Li0/h0;->p(Z)V

    .line 1292
    .line 1293
    .line 1294
    goto :goto_16

    .line 1295
    :cond_2d
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 1296
    .line 1297
    .line 1298
    :goto_16
    return-object v14

    .line 1299
    :pswitch_10
    check-cast v3, Ls0/d;

    .line 1300
    .line 1301
    check-cast v15, Ls/x0;

    .line 1302
    .line 1303
    move-object/from16 v2, p1

    .line 1304
    .line 1305
    check-cast v2, Li0/h0;

    .line 1306
    .line 1307
    check-cast v1, Ljava/lang/Integer;

    .line 1308
    .line 1309
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1310
    .line 1311
    .line 1312
    move-result v1

    .line 1313
    and-int/lit8 v4, v1, 0x3

    .line 1314
    .line 1315
    if-eq v4, v11, :cond_2e

    .line 1316
    .line 1317
    move v4, v13

    .line 1318
    goto :goto_17

    .line 1319
    :cond_2e
    move v4, v12

    .line 1320
    :goto_17
    and-int/2addr v1, v13

    .line 1321
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 1322
    .line 1323
    .line 1324
    move-result v1

    .line 1325
    if-eqz v1, :cond_2f

    .line 1326
    .line 1327
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v1

    .line 1331
    invoke-virtual {v3, v15, v2, v1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    goto :goto_18

    .line 1335
    :cond_2f
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 1336
    .line 1337
    .line 1338
    :goto_18
    return-object v14

    .line 1339
    :pswitch_11
    invoke-direct/range {p0 .. p2}, Lb0/q;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v1

    .line 1343
    return-object v1

    .line 1344
    :pswitch_12
    check-cast v3, Ls/b0;

    .line 1345
    .line 1346
    check-cast v15, Ls/a0;

    .line 1347
    .line 1348
    iget-object v2, v15, Ls/a0;->a:Ljava/lang/Object;

    .line 1349
    .line 1350
    move-object/from16 v5, p1

    .line 1351
    .line 1352
    check-cast v5, Li0/h0;

    .line 1353
    .line 1354
    check-cast v1, Ljava/lang/Integer;

    .line 1355
    .line 1356
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1357
    .line 1358
    .line 1359
    move-result v1

    .line 1360
    and-int/lit8 v6, v1, 0x3

    .line 1361
    .line 1362
    if-eq v6, v11, :cond_30

    .line 1363
    .line 1364
    move v6, v13

    .line 1365
    goto :goto_19

    .line 1366
    :cond_30
    move v6, v12

    .line 1367
    :goto_19
    and-int/2addr v1, v13

    .line 1368
    invoke-virtual {v5, v1, v6}, Li0/h0;->S(IZ)Z

    .line 1369
    .line 1370
    .line 1371
    move-result v1

    .line 1372
    if-eqz v1, :cond_36

    .line 1373
    .line 1374
    iget-object v1, v3, Ls/b0;->b:Lb0/j;

    .line 1375
    .line 1376
    invoke-virtual {v1}, Lb0/j;->invoke()Ljava/lang/Object;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    check-cast v1, Lr/k;

    .line 1381
    .line 1382
    iget v6, v15, Ls/a0;->c:I

    .line 1383
    .line 1384
    invoke-virtual {v1}, Lr/k;->c()I

    .line 1385
    .line 1386
    .line 1387
    move-result v7

    .line 1388
    if-ge v6, v7, :cond_31

    .line 1389
    .line 1390
    invoke-virtual {v1, v6}, Lr/k;->d(I)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v7

    .line 1394
    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v7

    .line 1398
    if-nez v7, :cond_32

    .line 1399
    .line 1400
    :cond_31
    iget-object v6, v1, Lr/k;->d:Lac/k;

    .line 1401
    .line 1402
    invoke-virtual {v6, v2}, Lac/k;->o(Ljava/lang/Object;)I

    .line 1403
    .line 1404
    .line 1405
    move-result v6

    .line 1406
    if-eq v6, v4, :cond_32

    .line 1407
    .line 1408
    iput v6, v15, Ls/a0;->c:I

    .line 1409
    .line 1410
    :cond_32
    if-eq v6, v4, :cond_33

    .line 1411
    .line 1412
    const v4, -0x6339ef97

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v5, v4}, Li0/h0;->a0(I)V

    .line 1416
    .line 1417
    .line 1418
    iget-object v3, v3, Ls/b0;->a:Lv0/c;

    .line 1419
    .line 1420
    const/16 v21, 0x0

    .line 1421
    .line 1422
    move-object/from16 v16, v1

    .line 1423
    .line 1424
    move-object/from16 v19, v2

    .line 1425
    .line 1426
    move-object/from16 v17, v3

    .line 1427
    .line 1428
    move-object/from16 v20, v5

    .line 1429
    .line 1430
    move/from16 v18, v6

    .line 1431
    .line 1432
    invoke-static/range {v16 .. v21}, Ls/o;->d(Lr/k;Ljava/lang/Object;ILjava/lang/Object;Li0/h0;I)V

    .line 1433
    .line 1434
    .line 1435
    move-object/from16 v1, v19

    .line 1436
    .line 1437
    move-object/from16 v2, v20

    .line 1438
    .line 1439
    invoke-virtual {v2, v12}, Li0/h0;->p(Z)V

    .line 1440
    .line 1441
    .line 1442
    goto :goto_1a

    .line 1443
    :cond_33
    move-object v1, v2

    .line 1444
    move-object v2, v5

    .line 1445
    const v3, -0x633657e2

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v2, v12}, Li0/h0;->p(Z)V

    .line 1452
    .line 1453
    .line 1454
    :goto_1a
    invoke-virtual {v2, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v3

    .line 1458
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v4

    .line 1462
    if-nez v3, :cond_34

    .line 1463
    .line 1464
    if-ne v4, v10, :cond_35

    .line 1465
    .line 1466
    :cond_34
    new-instance v4, Lnb/a;

    .line 1467
    .line 1468
    invoke-direct {v4, v15, v9}, Lnb/a;-><init>(Ljava/lang/Object;I)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1472
    .line 1473
    .line 1474
    :cond_35
    check-cast v4, Lfg/l;

    .line 1475
    .line 1476
    invoke-static {v1, v4, v2}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 1477
    .line 1478
    .line 1479
    goto :goto_1b

    .line 1480
    :cond_36
    move-object v2, v5

    .line 1481
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 1482
    .line 1483
    .line 1484
    :goto_1b
    return-object v14

    .line 1485
    :pswitch_13
    check-cast v3, Ll/e;

    .line 1486
    .line 1487
    check-cast v15, Ll/d;

    .line 1488
    .line 1489
    move-object/from16 v2, p1

    .line 1490
    .line 1491
    check-cast v2, Li0/h0;

    .line 1492
    .line 1493
    check-cast v1, Ljava/lang/Integer;

    .line 1494
    .line 1495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1496
    .line 1497
    .line 1498
    invoke-static {v13}, Li0/r;->C(I)I

    .line 1499
    .line 1500
    .line 1501
    move-result v1

    .line 1502
    invoke-virtual {v3, v15, v2, v1}, Ll/e;->a(Ll/d;Li0/h0;I)V

    .line 1503
    .line 1504
    .line 1505
    return-object v14

    .line 1506
    :pswitch_14
    check-cast v3, Ly0/o;

    .line 1507
    .line 1508
    check-cast v15, Lfg/l;

    .line 1509
    .line 1510
    move-object/from16 v2, p1

    .line 1511
    .line 1512
    check-cast v2, Li0/h0;

    .line 1513
    .line 1514
    check-cast v1, Ljava/lang/Integer;

    .line 1515
    .line 1516
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1517
    .line 1518
    .line 1519
    invoke-static {v13}, Li0/r;->C(I)I

    .line 1520
    .line 1521
    .line 1522
    move-result v1

    .line 1523
    invoke-static {v3, v15, v2, v1}, Lk/n;->a(Ly0/o;Lfg/l;Li0/h0;I)V

    .line 1524
    .line 1525
    .line 1526
    return-object v14

    .line 1527
    :pswitch_15
    check-cast v3, Lb5/i;

    .line 1528
    .line 1529
    check-cast v15, Ll0/k;

    .line 1530
    .line 1531
    move-object/from16 v2, p1

    .line 1532
    .line 1533
    check-cast v2, Ljava/lang/Integer;

    .line 1534
    .line 1535
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1536
    .line 1537
    .line 1538
    move-result v2

    .line 1539
    instance-of v4, v1, Li0/h;

    .line 1540
    .line 1541
    if-eqz v4, :cond_37

    .line 1542
    .line 1543
    check-cast v1, Li0/h;

    .line 1544
    .line 1545
    iget-object v2, v3, Lb5/i;->g:Ljava/lang/Object;

    .line 1546
    .line 1547
    check-cast v2, Lj0/b;

    .line 1548
    .line 1549
    invoke-virtual {v2, v1}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 1550
    .line 1551
    .line 1552
    goto :goto_1c

    .line 1553
    :cond_37
    instance-of v4, v1, Li0/d2;

    .line 1554
    .line 1555
    if-nez v4, :cond_39

    .line 1556
    .line 1557
    instance-of v4, v1, Li0/k0;

    .line 1558
    .line 1559
    if-eqz v4, :cond_38

    .line 1560
    .line 1561
    invoke-static {v15, v2, v1}, Li0/r;->z(Ll0/k;ILjava/lang/Object;)V

    .line 1562
    .line 1563
    .line 1564
    check-cast v1, Li0/k0;

    .line 1565
    .line 1566
    invoke-virtual {v3, v1}, Lb5/i;->g(Li0/k0;)V

    .line 1567
    .line 1568
    .line 1569
    goto :goto_1c

    .line 1570
    :cond_38
    instance-of v3, v1, Li0/r1;

    .line 1571
    .line 1572
    if-eqz v3, :cond_39

    .line 1573
    .line 1574
    invoke-static {v15, v2, v1}, Li0/r;->z(Ll0/k;ILjava/lang/Object;)V

    .line 1575
    .line 1576
    .line 1577
    check-cast v1, Li0/r1;

    .line 1578
    .line 1579
    invoke-virtual {v1}, Li0/r1;->c()V

    .line 1580
    .line 1581
    .line 1582
    :cond_39
    :goto_1c
    return-object v14

    .line 1583
    :pswitch_16
    check-cast v3, Lh0/d1;

    .line 1584
    .line 1585
    check-cast v15, Lqg/t;

    .line 1586
    .line 1587
    move-object/from16 v2, p1

    .line 1588
    .line 1589
    check-cast v2, Ly/a;

    .line 1590
    .line 1591
    check-cast v1, Landroid/content/Context;

    .line 1592
    .line 1593
    invoke-virtual {v3}, Lh0/d1;->j()Z

    .line 1594
    .line 1595
    .line 1596
    move-result v18

    .line 1597
    invoke-virtual {v3}, Lh0/d1;->m()Li2/g;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v5

    .line 1601
    if-eqz v5, :cond_3a

    .line 1602
    .line 1603
    iget-object v5, v5, Li2/g;->h:Ljava/lang/String;

    .line 1604
    .line 1605
    goto :goto_1d

    .line 1606
    :cond_3a
    const/4 v5, 0x0

    .line 1607
    :goto_1d
    iget-object v8, v3, Lh0/d1;->v:Li2/m0;

    .line 1608
    .line 1609
    if-eqz v8, :cond_3b

    .line 1610
    .line 1611
    iget-wide v8, v8, Li2/m0;->a:J

    .line 1612
    .line 1613
    iget-object v10, v3, Lh0/d1;->b:Lb5/k;

    .line 1614
    .line 1615
    const/16 v11, 0x20

    .line 1616
    .line 1617
    shr-long v12, v8, v11

    .line 1618
    .line 1619
    long-to-int v11, v12

    .line 1620
    invoke-virtual {v10, v11}, Lb5/k;->l(I)I

    .line 1621
    .line 1622
    .line 1623
    const-wide v12, 0xffffffffL

    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    and-long/2addr v8, v12

    .line 1629
    long-to-int v8, v8

    .line 1630
    invoke-virtual {v10, v8}, Lb5/k;->l(I)I

    .line 1631
    .line 1632
    .line 1633
    invoke-static {v11, v8}, Li2/e0;->b(II)J

    .line 1634
    .line 1635
    .line 1636
    move-result-wide v8

    .line 1637
    new-instance v10, Li2/m0;

    .line 1638
    .line 1639
    invoke-direct {v10, v8, v9}, Li2/m0;-><init>(J)V

    .line 1640
    .line 1641
    .line 1642
    goto :goto_1e

    .line 1643
    :cond_3b
    const/4 v10, 0x0

    .line 1644
    :goto_1e
    iget-object v8, v3, Lh0/d1;->i:Lh0/p;

    .line 1645
    .line 1646
    new-instance v9, Lb0/s;

    .line 1647
    .line 1648
    invoke-direct {v9, v7, v1, v3, v15}, Lb0/s;-><init>(ILandroid/content/Context;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1649
    .line 1650
    .line 1651
    sget-object v3, Lh0/r;->a:Li0/m2;

    .line 1652
    .line 1653
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1654
    .line 1655
    const/16 v7, 0x1c

    .line 1656
    .line 1657
    if-lt v3, v7, :cond_3c

    .line 1658
    .line 1659
    if-eqz v5, :cond_3c

    .line 1660
    .line 1661
    if-eqz v10, :cond_3c

    .line 1662
    .line 1663
    if-eqz v8, :cond_3c

    .line 1664
    .line 1665
    instance-of v3, v8, Lh0/p;

    .line 1666
    .line 1667
    if-nez v3, :cond_3d

    .line 1668
    .line 1669
    :cond_3c
    move-object/from16 v17, v1

    .line 1670
    .line 1671
    move-object v1, v2

    .line 1672
    move-object/from16 v19, v5

    .line 1673
    .line 1674
    goto/16 :goto_25

    .line 1675
    .line 1676
    :cond_3d
    iget-wide v11, v10, Li2/m0;->a:J

    .line 1677
    .line 1678
    iget-object v3, v8, Lh0/p;->h:Ljava/lang/Object;

    .line 1679
    .line 1680
    iget-object v7, v8, Lh0/p;->e:Lyg/b;

    .line 1681
    .line 1682
    invoke-virtual {v7}, Lyg/b;->e()Z

    .line 1683
    .line 1684
    .line 1685
    move-result v13

    .line 1686
    if-nez v13, :cond_3e

    .line 1687
    .line 1688
    const/4 v6, 0x0

    .line 1689
    goto :goto_21

    .line 1690
    :cond_3e
    iget-object v8, v8, Lh0/p;->g:Li0/j1;

    .line 1691
    .line 1692
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v8

    .line 1696
    check-cast v8, Lh0/r0;

    .line 1697
    .line 1698
    move-object v13, v7

    .line 1699
    if-eqz v8, :cond_3f

    .line 1700
    .line 1701
    iget-wide v6, v8, Lh0/r0;->b:J

    .line 1702
    .line 1703
    invoke-static {v11, v12, v6, v7}, Li2/m0;->b(JJ)Z

    .line 1704
    .line 1705
    .line 1706
    move-result v6

    .line 1707
    if-eqz v6, :cond_3f

    .line 1708
    .line 1709
    iget-object v6, v8, Lh0/r0;->a:Ljava/lang/CharSequence;

    .line 1710
    .line 1711
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1712
    .line 1713
    .line 1714
    move-result v6

    .line 1715
    if-eqz v6, :cond_3f

    .line 1716
    .line 1717
    iget-object v6, v8, Lh0/r0;->c:Landroid/view/textclassifier/TextClassification;

    .line 1718
    .line 1719
    :goto_1f
    const/4 v7, 0x0

    .line 1720
    goto :goto_20

    .line 1721
    :cond_3f
    const/4 v6, 0x0

    .line 1722
    goto :goto_1f

    .line 1723
    :goto_20
    invoke-virtual {v13, v7}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 1724
    .line 1725
    .line 1726
    :goto_21
    if-nez v6, :cond_40

    .line 1727
    .line 1728
    invoke-virtual {v9, v2}, Lb0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1729
    .line 1730
    .line 1731
    goto :goto_24

    .line 1732
    :cond_40
    invoke-static {v6}, Lb0/b0;->r(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v7

    .line 1736
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1737
    .line 1738
    .line 1739
    move-result v7

    .line 1740
    if-nez v7, :cond_41

    .line 1741
    .line 1742
    new-instance v4, Lz/h;

    .line 1743
    .line 1744
    const/4 v7, 0x0

    .line 1745
    invoke-direct {v4, v3, v6, v7}, Lz/h;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    .line 1746
    .line 1747
    .line 1748
    iget-object v7, v2, Ly/a;->a:Lf/f0;

    .line 1749
    .line 1750
    invoke-virtual {v7, v4}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 1751
    .line 1752
    .line 1753
    goto :goto_22

    .line 1754
    :cond_41
    invoke-virtual {v6}, Landroid/view/textclassifier/TextClassification;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 1755
    .line 1756
    .line 1757
    move-result-object v7

    .line 1758
    if-nez v7, :cond_42

    .line 1759
    .line 1760
    invoke-virtual {v6}, Landroid/view/textclassifier/TextClassification;->getLabel()Ljava/lang/CharSequence;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v7

    .line 1764
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1765
    .line 1766
    .line 1767
    move-result v7

    .line 1768
    if-nez v7, :cond_44

    .line 1769
    .line 1770
    :cond_42
    invoke-virtual {v6}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v7

    .line 1774
    if-nez v7, :cond_43

    .line 1775
    .line 1776
    invoke-virtual {v6}, Landroid/view/textclassifier/TextClassification;->getOnClickListener()Landroid/view/View$OnClickListener;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v7

    .line 1780
    if-eqz v7, :cond_44

    .line 1781
    .line 1782
    :cond_43
    new-instance v7, Lz/h;

    .line 1783
    .line 1784
    invoke-direct {v7, v3, v6, v4}, Lz/h;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    .line 1785
    .line 1786
    .line 1787
    iget-object v4, v2, Ly/a;->a:Lf/f0;

    .line 1788
    .line 1789
    invoke-virtual {v4, v7}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 1790
    .line 1791
    .line 1792
    :cond_44
    :goto_22
    invoke-virtual {v9, v2}, Lb0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    invoke-static {v6}, Lb0/b0;->r(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v4

    .line 1799
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1800
    .line 1801
    .line 1802
    move-result v7

    .line 1803
    const/4 v12, 0x0

    .line 1804
    :goto_23
    if-ge v12, v7, :cond_46

    .line 1805
    .line 1806
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v8

    .line 1810
    check-cast v8, Landroid/app/RemoteAction;

    .line 1811
    .line 1812
    if-lez v12, :cond_45

    .line 1813
    .line 1814
    new-instance v8, Lz/h;

    .line 1815
    .line 1816
    invoke-direct {v8, v3, v6, v12}, Lz/h;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    .line 1817
    .line 1818
    .line 1819
    iget-object v9, v2, Ly/a;->a:Lf/f0;

    .line 1820
    .line 1821
    invoke-virtual {v9, v8}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 1822
    .line 1823
    .line 1824
    :cond_45
    add-int/lit8 v12, v12, 0x1

    .line 1825
    .line 1826
    goto :goto_23

    .line 1827
    :cond_46
    :goto_24
    iget-wide v3, v10, Li2/m0;->a:J

    .line 1828
    .line 1829
    move-object/from16 v17, v1

    .line 1830
    .line 1831
    move-object/from16 v16, v2

    .line 1832
    .line 1833
    move-wide/from16 v20, v3

    .line 1834
    .line 1835
    move-object/from16 v19, v5

    .line 1836
    .line 1837
    invoke-static/range {v16 .. v21}, Lx/a;->a(Ly/a;Landroid/content/Context;ZLjava/lang/String;J)V

    .line 1838
    .line 1839
    .line 1840
    goto :goto_26

    .line 1841
    :goto_25
    invoke-virtual {v9, v1}, Lb0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1842
    .line 1843
    .line 1844
    if-eqz v19, :cond_47

    .line 1845
    .line 1846
    if-eqz v10, :cond_47

    .line 1847
    .line 1848
    iget-wide v2, v10, Li2/m0;->a:J

    .line 1849
    .line 1850
    move-object/from16 v16, v1

    .line 1851
    .line 1852
    move-wide/from16 v20, v2

    .line 1853
    .line 1854
    invoke-static/range {v16 .. v21}, Lx/a;->a(Ly/a;Landroid/content/Context;ZLjava/lang/String;J)V

    .line 1855
    .line 1856
    .line 1857
    :cond_47
    :goto_26
    return-object v14

    .line 1858
    :pswitch_17
    check-cast v3, Ly0/o;

    .line 1859
    .line 1860
    check-cast v15, Ls0/d;

    .line 1861
    .line 1862
    move-object/from16 v2, p1

    .line 1863
    .line 1864
    check-cast v2, Li0/h0;

    .line 1865
    .line 1866
    check-cast v1, Ljava/lang/Integer;

    .line 1867
    .line 1868
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1869
    .line 1870
    .line 1871
    invoke-static/range {v16 .. v16}, Li0/r;->C(I)I

    .line 1872
    .line 1873
    .line 1874
    move-result v1

    .line 1875
    invoke-static {v3, v15, v2, v1}, Lbe/h;->c(Ly0/o;Ls0/d;Li0/h0;I)V

    .line 1876
    .line 1877
    .line 1878
    return-object v14

    .line 1879
    :pswitch_18
    check-cast v3, Ls0/d;

    .line 1880
    .line 1881
    check-cast v15, Lc9/p0;

    .line 1882
    .line 1883
    move-object/from16 v2, p1

    .line 1884
    .line 1885
    check-cast v2, Li0/h0;

    .line 1886
    .line 1887
    check-cast v1, Ljava/lang/Integer;

    .line 1888
    .line 1889
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1890
    .line 1891
    .line 1892
    move-result v1

    .line 1893
    and-int/lit8 v4, v1, 0x3

    .line 1894
    .line 1895
    if-eq v4, v11, :cond_48

    .line 1896
    .line 1897
    move v4, v13

    .line 1898
    goto :goto_27

    .line 1899
    :cond_48
    const/4 v4, 0x0

    .line 1900
    :goto_27
    and-int/2addr v1, v13

    .line 1901
    invoke-virtual {v2, v1, v4}, Li0/h0;->S(IZ)Z

    .line 1902
    .line 1903
    .line 1904
    move-result v1

    .line 1905
    if-eqz v1, :cond_49

    .line 1906
    .line 1907
    const/16 v17, 0x0

    .line 1908
    .line 1909
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v1

    .line 1913
    invoke-virtual {v3, v15, v2, v1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1914
    .line 1915
    .line 1916
    goto :goto_28

    .line 1917
    :cond_49
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 1918
    .line 1919
    .line 1920
    :goto_28
    return-object v14

    .line 1921
    :pswitch_19
    check-cast v3, Lc9/j1;

    .line 1922
    .line 1923
    check-cast v15, Ljava/lang/String;

    .line 1924
    .line 1925
    move-object/from16 v2, p1

    .line 1926
    .line 1927
    check-cast v2, Li0/h0;

    .line 1928
    .line 1929
    check-cast v1, Ljava/lang/Integer;

    .line 1930
    .line 1931
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1932
    .line 1933
    .line 1934
    const/16 v1, 0x37

    .line 1935
    .line 1936
    invoke-static {v1}, Li0/r;->C(I)I

    .line 1937
    .line 1938
    .line 1939
    move-result v1

    .line 1940
    invoke-virtual {v3, v15, v2, v1}, Lc9/j1;->r(Ljava/lang/String;Li0/h0;I)V

    .line 1941
    .line 1942
    .line 1943
    return-object v14

    .line 1944
    :pswitch_1a
    check-cast v3, Lb0/e0;

    .line 1945
    .line 1946
    check-cast v15, Landroid/graphics/drawable/Drawable;

    .line 1947
    .line 1948
    move-object/from16 v2, p1

    .line 1949
    .line 1950
    check-cast v2, Li0/h0;

    .line 1951
    .line 1952
    check-cast v1, Ljava/lang/Integer;

    .line 1953
    .line 1954
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1955
    .line 1956
    .line 1957
    invoke-static/range {v16 .. v16}, Li0/r;->C(I)I

    .line 1958
    .line 1959
    .line 1960
    move-result v1

    .line 1961
    invoke-virtual {v3, v15, v2, v1}, Lb0/e0;->a(Landroid/graphics/drawable/Drawable;Li0/h0;I)V

    .line 1962
    .line 1963
    .line 1964
    return-object v14

    .line 1965
    :pswitch_1b
    check-cast v15, Lz/g;

    .line 1966
    .line 1967
    check-cast v3, Lz/c;

    .line 1968
    .line 1969
    move-object/from16 v2, p1

    .line 1970
    .line 1971
    check-cast v2, Li0/h0;

    .line 1972
    .line 1973
    check-cast v1, Ljava/lang/Integer;

    .line 1974
    .line 1975
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1976
    .line 1977
    .line 1978
    invoke-static {v13}, Li0/r;->C(I)I

    .line 1979
    .line 1980
    .line 1981
    move-result v1

    .line 1982
    invoke-static {v15, v3, v2, v1}, Lb0/w;->a(Lz/g;Lz/c;Li0/h0;I)V

    .line 1983
    .line 1984
    .line 1985
    return-object v14

    .line 1986
    :pswitch_1c
    move-object v6, v3

    .line 1987
    check-cast v6, Ld0/d;

    .line 1988
    .line 1989
    check-cast v15, Lz/g;

    .line 1990
    .line 1991
    move-object/from16 v2, p1

    .line 1992
    .line 1993
    check-cast v2, Li0/h0;

    .line 1994
    .line 1995
    check-cast v1, Ljava/lang/Integer;

    .line 1996
    .line 1997
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1998
    .line 1999
    .line 2000
    move-result v1

    .line 2001
    and-int/lit8 v3, v1, 0x3

    .line 2002
    .line 2003
    if-eq v3, v11, :cond_4a

    .line 2004
    .line 2005
    move v7, v13

    .line 2006
    goto :goto_29

    .line 2007
    :cond_4a
    const/4 v7, 0x0

    .line 2008
    :goto_29
    and-int/2addr v1, v13

    .line 2009
    invoke-virtual {v2, v1, v7}, Li0/h0;->S(IZ)Z

    .line 2010
    .line 2011
    .line 2012
    move-result v1

    .line 2013
    if-eqz v1, :cond_4d

    .line 2014
    .line 2015
    invoke-virtual {v2, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 2016
    .line 2017
    .line 2018
    move-result v1

    .line 2019
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v3

    .line 2023
    if-nez v1, :cond_4b

    .line 2024
    .line 2025
    if-ne v3, v10, :cond_4c

    .line 2026
    .line 2027
    :cond_4b
    new-instance v4, Lb0/v;

    .line 2028
    .line 2029
    const/4 v11, 0x0

    .line 2030
    const/4 v12, 0x0

    .line 2031
    const/4 v5, 0x0

    .line 2032
    const-class v7, Ld0/d;

    .line 2033
    .line 2034
    const-string v8, "data"

    .line 2035
    .line 2036
    const-string v9, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"

    .line 2037
    .line 2038
    const/4 v10, 0x0

    .line 2039
    invoke-direct/range {v4 .. v12}, Lb0/v;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 2040
    .line 2041
    .line 2042
    invoke-static {v4}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v3

    .line 2046
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2047
    .line 2048
    .line 2049
    :cond_4c
    check-cast v3, Li0/l2;

    .line 2050
    .line 2051
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v1

    .line 2055
    check-cast v1, Lz/c;

    .line 2056
    .line 2057
    const/4 v7, 0x0

    .line 2058
    invoke-static {v15, v1, v2, v7}, Lb0/w;->a(Lz/g;Lz/c;Li0/h0;I)V

    .line 2059
    .line 2060
    .line 2061
    goto :goto_2a

    .line 2062
    :cond_4d
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 2063
    .line 2064
    .line 2065
    :goto_2a
    return-object v14

    .line 2066
    nop

    .line 2067
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
