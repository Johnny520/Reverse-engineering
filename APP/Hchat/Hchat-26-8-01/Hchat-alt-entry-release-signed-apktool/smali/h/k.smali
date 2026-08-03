.class public abstract Lh/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    shl-long v2, v0, v2

    .line 7
    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr v0, v4

    .line 14
    or-long/2addr v0, v2

    .line 15
    sput-wide v0, Lh/k;->a:J

    .line 16
    .line 17
    return-void
.end method

.method public static final a(Li/k1;Ly0/o;Lfg/l;Lfg/l;Ls0/d;Li0/h0;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    move-object/from16 v9, p5

    .line 10
    .line 11
    move/from16 v10, p6

    .line 12
    .line 13
    sget-object v0, Ly0/b;->g:Ly0/g;

    .line 14
    .line 15
    const v2, 0x1e804e2f

    .line 16
    .line 17
    .line 18
    invoke-virtual {v9, v2}, Li0/h0;->b0(I)Li0/h0;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v9, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v4, 0x4

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move v2, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :goto_0
    or-int/2addr v2, v10

    .line 32
    and-int/lit8 v5, v10, 0x30

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    invoke-virtual {v9, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    const/16 v5, 0x20

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v5, 0x10

    .line 46
    .line 47
    :goto_1
    or-int/2addr v2, v5

    .line 48
    :cond_2
    and-int/lit16 v5, v10, 0x180

    .line 49
    .line 50
    if-nez v5, :cond_4

    .line 51
    .line 52
    invoke-virtual {v9, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/16 v5, 0x100

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/16 v5, 0x80

    .line 62
    .line 63
    :goto_2
    or-int/2addr v2, v5

    .line 64
    :cond_4
    and-int/lit16 v5, v10, 0xc00

    .line 65
    .line 66
    if-nez v5, :cond_6

    .line 67
    .line 68
    invoke-virtual {v9, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    const/16 v0, 0x800

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    const/16 v0, 0x400

    .line 78
    .line 79
    :goto_3
    or-int/2addr v2, v0

    .line 80
    :cond_6
    and-int/lit16 v0, v10, 0x6000

    .line 81
    .line 82
    if-nez v0, :cond_8

    .line 83
    .line 84
    invoke-virtual {v9, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    const/16 v0, 0x4000

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    const/16 v0, 0x2000

    .line 94
    .line 95
    :goto_4
    or-int/2addr v2, v0

    .line 96
    :cond_8
    const/high16 v0, 0x30000

    .line 97
    .line 98
    and-int/2addr v0, v10

    .line 99
    move-object/from16 v5, p4

    .line 100
    .line 101
    if-nez v0, :cond_a

    .line 102
    .line 103
    invoke-virtual {v9, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_9

    .line 108
    .line 109
    const/high16 v0, 0x20000

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_9
    const/high16 v0, 0x10000

    .line 113
    .line 114
    :goto_5
    or-int/2addr v2, v0

    .line 115
    :cond_a
    const v0, 0x12493

    .line 116
    .line 117
    .line 118
    and-int/2addr v0, v2

    .line 119
    const v6, 0x12492

    .line 120
    .line 121
    .line 122
    const/4 v11, 0x1

    .line 123
    const/4 v12, 0x0

    .line 124
    if-eq v0, v6, :cond_b

    .line 125
    .line 126
    move v0, v11

    .line 127
    goto :goto_6

    .line 128
    :cond_b
    move v0, v12

    .line 129
    :goto_6
    and-int/lit8 v6, v2, 0x1

    .line 130
    .line 131
    invoke-virtual {v9, v6, v0}, Li0/h0;->S(IZ)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_2f

    .line 136
    .line 137
    sget-object v0, Ly1/h1;->n:Li0/m2;

    .line 138
    .line 139
    invoke-virtual {v9, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Lu2/m;

    .line 144
    .line 145
    and-int/lit8 v0, v2, 0xe

    .line 146
    .line 147
    if-ne v0, v4, :cond_c

    .line 148
    .line 149
    move v2, v11

    .line 150
    goto :goto_7

    .line 151
    :cond_c
    move v2, v12

    .line 152
    :goto_7
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    sget-object v13, Li0/l;->a:Li0/e;

    .line 157
    .line 158
    if-nez v2, :cond_d

    .line 159
    .line 160
    if-ne v6, v13, :cond_e

    .line 161
    .line 162
    :cond_d
    new-instance v6, Lh/t;

    .line 163
    .line 164
    invoke-direct {v6, v1}, Lh/t;-><init>(Li/k1;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v9, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_e
    check-cast v6, Lh/t;

    .line 171
    .line 172
    if-ne v0, v4, :cond_f

    .line 173
    .line 174
    move v2, v11

    .line 175
    goto :goto_8

    .line 176
    :cond_f
    move v2, v12

    .line 177
    :goto_8
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    if-nez v2, :cond_10

    .line 182
    .line 183
    if-ne v14, v13, :cond_11

    .line 184
    .line 185
    :cond_10
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    new-instance v14, Lw0/p;

    .line 194
    .line 195
    invoke-direct {v14}, Lw0/p;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-static {v2}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v14, v2}, Lw0/p;->addAll(Ljava/util/Collection;)Z

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_11
    check-cast v14, Lw0/p;

    .line 209
    .line 210
    if-ne v0, v4, :cond_12

    .line 211
    .line 212
    move v0, v11

    .line 213
    goto :goto_9

    .line 214
    :cond_12
    move v0, v12

    .line 215
    :goto_9
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-nez v0, :cond_13

    .line 220
    .line 221
    if-ne v2, v13, :cond_14

    .line 222
    .line 223
    :cond_13
    sget-object v0, Lf/r0;->a:[J

    .line 224
    .line 225
    new-instance v2, Lf/k0;

    .line 226
    .line 227
    invoke-direct {v2}, Lf/k0;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v9, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_14
    move-object v15, v2

    .line 234
    check-cast v15, Lf/k0;

    .line 235
    .line 236
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v2, v1, Li/k1;->d:Li0/j1;

    .line 241
    .line 242
    invoke-virtual {v14, v0}, Lw0/p;->contains(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-nez v0, :cond_15

    .line 247
    .line 248
    invoke-virtual {v14}, Lw0/p;->clear()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v14, v0}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    :cond_15
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_1a

    .line 271
    .line 272
    invoke-virtual {v14}, Lw0/p;->size()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-ne v0, v11, :cond_16

    .line 277
    .line 278
    invoke-virtual {v14, v12}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-nez v0, :cond_17

    .line 291
    .line 292
    :cond_16
    invoke-virtual {v14}, Lw0/p;->clear()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {v14, v0}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    :cond_17
    iget v0, v15, Lf/k0;->e:I

    .line 303
    .line 304
    if-ne v0, v11, :cond_18

    .line 305
    .line 306
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v15, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_19

    .line 315
    .line 316
    :cond_18
    invoke-virtual {v15}, Lf/k0;->a()V

    .line 317
    .line 318
    .line 319
    :cond_19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    :cond_1a
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-nez v0, :cond_1e

    .line 335
    .line 336
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v14, v0}, Lw0/p;->contains(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_1e

    .line 345
    .line 346
    invoke-virtual {v14}, Lw0/p;->listIterator()Ljava/util/ListIterator;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    move v4, v12

    .line 351
    :goto_a
    move-object/from16 v16, v0

    .line 352
    .line 353
    check-cast v16, Luf/a;

    .line 354
    .line 355
    invoke-virtual/range {v16 .. v16}, Luf/a;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v17

    .line 359
    if-eqz v17, :cond_1c

    .line 360
    .line 361
    invoke-virtual/range {v16 .. v16}, Luf/a;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v12

    .line 365
    invoke-interface {v8, v12}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    invoke-interface {v8, v11}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    invoke-static {v12, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v11

    .line 381
    if-eqz v11, :cond_1b

    .line 382
    .line 383
    :goto_b
    const/4 v0, -0x1

    .line 384
    goto :goto_c

    .line 385
    :cond_1b
    add-int/lit8 v4, v4, 0x1

    .line 386
    .line 387
    const/4 v11, 0x1

    .line 388
    const/4 v12, 0x0

    .line 389
    goto :goto_a

    .line 390
    :cond_1c
    const/4 v4, -0x1

    .line 391
    goto :goto_b

    .line 392
    :goto_c
    if-ne v4, v0, :cond_1d

    .line 393
    .line 394
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v14, v0}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    goto :goto_d

    .line 402
    :cond_1d
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v14, v4, v0}, Lw0/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    :cond_1e
    :goto_d
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v15, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_20

    .line 418
    .line 419
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v15, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-nez v0, :cond_1f

    .line 428
    .line 429
    goto :goto_e

    .line 430
    :cond_1f
    const v0, 0x755c7cd3

    .line 431
    .line 432
    .line 433
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 434
    .line 435
    .line 436
    const/4 v0, 0x0

    .line 437
    invoke-virtual {v9, v0}, Li0/h0;->p(Z)V

    .line 438
    .line 439
    .line 440
    move-object v5, v14

    .line 441
    move-object v14, v6

    .line 442
    move-object v6, v3

    .line 443
    goto :goto_10

    .line 444
    :cond_20
    :goto_e
    const v0, 0x75350ad1

    .line 445
    .line 446
    .line 447
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v15}, Lf/k0;->a()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v14}, Lw0/p;->size()I

    .line 454
    .line 455
    .line 456
    move-result v11

    .line 457
    const/4 v12, 0x0

    .line 458
    :goto_f
    if-ge v12, v11, :cond_21

    .line 459
    .line 460
    invoke-virtual {v14, v12}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    new-instance v0, Lh/h;

    .line 465
    .line 466
    move-object v4, v6

    .line 467
    move-object v6, v5

    .line 468
    move-object v5, v14

    .line 469
    invoke-direct/range {v0 .. v6}, Lh/h;-><init>(Li/k1;Ljava/lang/Object;Lfg/l;Lh/t;Lw0/p;Ls0/d;)V

    .line 470
    .line 471
    .line 472
    move-object v6, v3

    .line 473
    move-object v14, v4

    .line 474
    const v1, -0x16ceaa7

    .line 475
    .line 476
    .line 477
    invoke-static {v1, v0, v9}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v15, v2, v0}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    add-int/lit8 v12, v12, 0x1

    .line 485
    .line 486
    move-object/from16 v1, p0

    .line 487
    .line 488
    move-object v6, v14

    .line 489
    move-object v14, v5

    .line 490
    move-object/from16 v5, p4

    .line 491
    .line 492
    goto :goto_f

    .line 493
    :cond_21
    move-object v5, v14

    .line 494
    const/4 v0, 0x0

    .line 495
    move-object v14, v6

    .line 496
    move-object v6, v3

    .line 497
    invoke-virtual {v9, v0}, Li0/h0;->p(Z)V

    .line 498
    .line 499
    .line 500
    :goto_10
    invoke-virtual/range {p0 .. p0}, Li/k1;->f()Li/e1;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v9, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    invoke-virtual {v9, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    or-int/2addr v0, v1

    .line 513
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-nez v0, :cond_22

    .line 518
    .line 519
    if-ne v1, v13, :cond_23

    .line 520
    .line 521
    :cond_22
    invoke-interface {v6, v14}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    move-object v1, v0

    .line 526
    check-cast v1, Lh/e0;

    .line 527
    .line 528
    invoke-virtual {v9, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    :cond_23
    check-cast v1, Lh/e0;

    .line 532
    .line 533
    iget-object v0, v14, Lh/t;->a:Li/k1;

    .line 534
    .line 535
    invoke-virtual {v9, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    if-nez v2, :cond_24

    .line 544
    .line 545
    if-ne v3, v13, :cond_25

    .line 546
    .line 547
    :cond_24
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 548
    .line 549
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    invoke-virtual {v9, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    :cond_25
    check-cast v3, Li0/a1;

    .line 557
    .line 558
    iget-object v1, v1, Lh/e0;->d:Lh/e1;

    .line 559
    .line 560
    invoke-static {v1, v9}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    invoke-virtual {v0}, Li/k1;->c()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    iget-object v0, v0, Li/k1;->d:Li0/j1;

    .line 569
    .line 570
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_26

    .line 579
    .line 580
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 581
    .line 582
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    goto :goto_11

    .line 586
    :cond_26
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    if-eqz v0, :cond_27

    .line 591
    .line 592
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 593
    .line 594
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    :cond_27
    :goto_11
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    check-cast v0, Ljava/lang/Boolean;

    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    sget-object v12, Ly0/l;->a:Ly0/l;

    .line 608
    .line 609
    const/4 v1, 0x0

    .line 610
    if-eqz v0, :cond_2a

    .line 611
    .line 612
    const v0, 0x50a652f9

    .line 613
    .line 614
    .line 615
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 616
    .line 617
    .line 618
    iget-object v0, v14, Lh/t;->a:Li/k1;

    .line 619
    .line 620
    move-object v2, v1

    .line 621
    sget-object v1, Li/d;->q:Li/m1;

    .line 622
    .line 623
    const/4 v4, 0x0

    .line 624
    move-object v3, v5

    .line 625
    const/4 v5, 0x2

    .line 626
    move-object/from16 v16, v2

    .line 627
    .line 628
    const/4 v2, 0x0

    .line 629
    move-object/from16 v18, v16

    .line 630
    .line 631
    move-object/from16 v16, v3

    .line 632
    .line 633
    move-object v3, v9

    .line 634
    move-object/from16 v9, v18

    .line 635
    .line 636
    invoke-static/range {v0 .. v5}, Li/d;->k(Li/k1;Li/m1;Ljava/lang/String;Li0/h0;II)Li/d1;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-virtual {v3, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    if-nez v0, :cond_28

    .line 649
    .line 650
    if-ne v2, v13, :cond_29

    .line 651
    .line 652
    :cond_28
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    check-cast v0, Lh/e1;

    .line 657
    .line 658
    invoke-static {v12}, Lc1/h;->c(Ly0/o;)Ly0/o;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-virtual {v3, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    :cond_29
    move-object v12, v2

    .line 666
    check-cast v12, Ly0/o;

    .line 667
    .line 668
    const/4 v0, 0x0

    .line 669
    invoke-virtual {v3, v0}, Li0/h0;->p(Z)V

    .line 670
    .line 671
    .line 672
    goto :goto_12

    .line 673
    :cond_2a
    move-object/from16 v16, v5

    .line 674
    .line 675
    move-object v3, v9

    .line 676
    const/4 v0, 0x0

    .line 677
    move-object v9, v1

    .line 678
    const v1, 0x50aa6233

    .line 679
    .line 680
    .line 681
    invoke-virtual {v3, v1}, Li0/h0;->a0(I)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v3, v0}, Li0/h0;->p(Z)V

    .line 685
    .line 686
    .line 687
    move-object v1, v9

    .line 688
    :goto_12
    new-instance v0, Lh/p;

    .line 689
    .line 690
    invoke-direct {v0, v1, v11, v14}, Lh/p;-><init>(Li/d1;Li0/a1;Lh/t;)V

    .line 691
    .line 692
    .line 693
    invoke-interface {v12, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-interface {v7, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    if-ne v1, v13, :cond_2b

    .line 706
    .line 707
    new-instance v1, Lh/m;

    .line 708
    .line 709
    invoke-direct {v1, v14}, Lh/m;-><init>(Lh/t;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v3, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    :cond_2b
    check-cast v1, Lh/m;

    .line 716
    .line 717
    iget-wide v4, v3, Li0/h0;->T:J

    .line 718
    .line 719
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 720
    .line 721
    .line 722
    move-result v2

    .line 723
    invoke-virtual {v3}, Li0/h0;->l()Ls0/h;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    invoke-static {v3, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 732
    .line 733
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 737
    .line 738
    invoke-virtual {v3}, Li0/h0;->d0()V

    .line 739
    .line 740
    .line 741
    iget-boolean v11, v3, Li0/h0;->S:Z

    .line 742
    .line 743
    if-eqz v11, :cond_2c

    .line 744
    .line 745
    invoke-virtual {v3, v5}, Li0/h0;->k(Lfg/a;)V

    .line 746
    .line 747
    .line 748
    goto :goto_13

    .line 749
    :cond_2c
    invoke-virtual {v3}, Li0/h0;->n0()V

    .line 750
    .line 751
    .line 752
    :goto_13
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 753
    .line 754
    invoke-static {v5, v3, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 758
    .line 759
    invoke-static {v1, v3, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 767
    .line 768
    invoke-static {v3, v1, v2}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 769
    .line 770
    .line 771
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 772
    .line 773
    invoke-static {v1, v3}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 774
    .line 775
    .line 776
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 777
    .line 778
    invoke-static {v1, v3, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    const v0, -0x334534ba    # -9.793387E7f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v3, v0}, Li0/h0;->a0(I)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v16 .. v16}, Lw0/p;->size()I

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    const/4 v1, 0x0

    .line 792
    :goto_14
    if-ge v1, v0, :cond_2e

    .line 793
    .line 794
    move-object/from16 v5, v16

    .line 795
    .line 796
    invoke-virtual {v5, v1}, Lw0/p;->get(I)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    const v4, -0x78c25a0a

    .line 801
    .line 802
    .line 803
    invoke-interface {v8, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v11

    .line 807
    const/4 v12, 0x0

    .line 808
    invoke-virtual {v3, v4, v11, v9, v12}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v15, v2}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    check-cast v2, Lfg/p;

    .line 816
    .line 817
    if-nez v2, :cond_2d

    .line 818
    .line 819
    const v2, 0x6077a733

    .line 820
    .line 821
    .line 822
    invoke-virtual {v3, v2}, Li0/h0;->a0(I)V

    .line 823
    .line 824
    .line 825
    :goto_15
    invoke-virtual {v3, v12}, Li0/h0;->p(Z)V

    .line 826
    .line 827
    .line 828
    goto :goto_16

    .line 829
    :cond_2d
    const v4, -0x78c25572

    .line 830
    .line 831
    .line 832
    invoke-virtual {v3, v4}, Li0/h0;->a0(I)V

    .line 833
    .line 834
    .line 835
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    invoke-interface {v2, v3, v4}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    goto :goto_15

    .line 843
    :goto_16
    invoke-virtual {v3, v12}, Li0/h0;->p(Z)V

    .line 844
    .line 845
    .line 846
    add-int/lit8 v1, v1, 0x1

    .line 847
    .line 848
    move-object/from16 v16, v5

    .line 849
    .line 850
    goto :goto_14

    .line 851
    :cond_2e
    const/4 v12, 0x0

    .line 852
    invoke-virtual {v3, v12}, Li0/h0;->p(Z)V

    .line 853
    .line 854
    .line 855
    const/4 v0, 0x1

    .line 856
    invoke-virtual {v3, v0}, Li0/h0;->p(Z)V

    .line 857
    .line 858
    .line 859
    goto :goto_17

    .line 860
    :cond_2f
    move-object v6, v3

    .line 861
    move-object v3, v9

    .line 862
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 863
    .line 864
    .line 865
    :goto_17
    invoke-virtual {v3}, Li0/h0;->t()Li0/r1;

    .line 866
    .line 867
    .line 868
    move-result-object v9

    .line 869
    if-eqz v9, :cond_30

    .line 870
    .line 871
    new-instance v0, Lh/i;

    .line 872
    .line 873
    move-object/from16 v1, p0

    .line 874
    .line 875
    move-object/from16 v5, p4

    .line 876
    .line 877
    move-object v3, v6

    .line 878
    move-object v2, v7

    .line 879
    move-object v4, v8

    .line 880
    move v6, v10

    .line 881
    invoke-direct/range {v0 .. v6}, Lh/i;-><init>(Li/k1;Ly0/o;Lfg/l;Lfg/l;Ls0/d;I)V

    .line 882
    .line 883
    .line 884
    iput-object v0, v9, Li0/r1;->d:Lfg/p;

    .line 885
    .line 886
    :cond_30
    return-void
.end method

.method public static final b(Ljava/lang/Object;Ly0/o;Lfg/l;Ly0/c;Ljava/lang/String;Lfg/l;Ls0/d;Li0/h0;I)V
    .locals 13

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    move-object/from16 v11, p7

    .line 4
    .line 5
    move/from16 v0, p8

    .line 6
    .line 7
    const v1, 0x598416e0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v0, 0x6

    .line 14
    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    and-int/lit8 v1, v0, 0x8

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v11, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v11, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 v1, 0x2

    .line 35
    :goto_1
    or-int/2addr v1, v0

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move v1, v0

    .line 38
    :goto_2
    invoke-virtual {v11, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    const/16 v2, 0x20

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    const/16 v2, 0x10

    .line 48
    .line 49
    :goto_3
    or-int/2addr v1, v2

    .line 50
    and-int/lit16 v2, v0, 0x180

    .line 51
    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    invoke-virtual {v11, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    const/16 v2, 0x100

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    const/16 v2, 0x80

    .line 64
    .line 65
    :goto_4
    or-int/2addr v1, v2

    .line 66
    :cond_5
    or-int/lit16 v1, v1, 0xc00

    .line 67
    .line 68
    and-int/lit16 v2, v0, 0x6000

    .line 69
    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    const/16 v2, 0x4000

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_6
    const/16 v2, 0x2000

    .line 82
    .line 83
    :goto_5
    or-int/2addr v1, v2

    .line 84
    :cond_7
    const/high16 v2, 0x30000

    .line 85
    .line 86
    or-int/2addr v1, v2

    .line 87
    const v2, 0x92493

    .line 88
    .line 89
    .line 90
    and-int/2addr v2, v1

    .line 91
    const v3, 0x92492

    .line 92
    .line 93
    .line 94
    if-eq v2, v3, :cond_8

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    goto :goto_6

    .line 98
    :cond_8
    const/4 v2, 0x0

    .line 99
    :goto_6
    and-int/lit8 v3, v1, 0x1

    .line 100
    .line 101
    invoke-virtual {v11, v3, v2}, Li0/h0;->S(IZ)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_a

    .line 106
    .line 107
    sget-object v2, Ly0/b;->g:Ly0/g;

    .line 108
    .line 109
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    sget-object v4, Li0/l;->a:Li0/e;

    .line 114
    .line 115
    if-ne v3, v4, :cond_9

    .line 116
    .line 117
    sget-object v3, Lh/c;->h:Lh/c;

    .line 118
    .line 119
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_9
    move-object v9, v3

    .line 123
    check-cast v9, Lfg/l;

    .line 124
    .line 125
    and-int/lit8 v3, v1, 0xe

    .line 126
    .line 127
    shr-int/lit8 v4, v1, 0x9

    .line 128
    .line 129
    and-int/lit8 v4, v4, 0x70

    .line 130
    .line 131
    or-int/2addr v3, v4

    .line 132
    invoke-static {p0, v5, v11, v3}, Li/d;->r(Ljava/lang/Object;Ljava/lang/String;Li0/h0;I)Li/k1;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    and-int/lit16 v1, v1, 0x1ff0

    .line 137
    .line 138
    const v3, 0x36000

    .line 139
    .line 140
    .line 141
    or-int v12, v1, v3

    .line 142
    .line 143
    move-object v7, p1

    .line 144
    move-object v8, p2

    .line 145
    move-object/from16 v10, p6

    .line 146
    .line 147
    invoke-static/range {v6 .. v12}, Lh/k;->a(Li/k1;Ly0/o;Lfg/l;Lfg/l;Ls0/d;Li0/h0;I)V

    .line 148
    .line 149
    .line 150
    move-object v4, v2

    .line 151
    move-object v6, v9

    .line 152
    goto :goto_7

    .line 153
    :cond_a
    invoke-virtual/range {p7 .. p7}, Li0/h0;->V()V

    .line 154
    .line 155
    .line 156
    move-object/from16 v4, p3

    .line 157
    .line 158
    move-object/from16 v6, p5

    .line 159
    .line 160
    :goto_7
    invoke-virtual/range {p7 .. p7}, Li0/h0;->t()Li0/r1;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    if-eqz v9, :cond_b

    .line 165
    .line 166
    new-instance v0, Lh/d;

    .line 167
    .line 168
    move-object v1, p0

    .line 169
    move-object v2, p1

    .line 170
    move-object v3, p2

    .line 171
    move-object/from16 v7, p6

    .line 172
    .line 173
    move/from16 v8, p8

    .line 174
    .line 175
    invoke-direct/range {v0 .. v8}, Lh/d;-><init>(Ljava/lang/Object;Ly0/o;Lfg/l;Ly0/c;Ljava/lang/String;Lfg/l;Ls0/d;I)V

    .line 176
    .line 177
    .line 178
    iput-object v0, v9, Li0/r1;->d:Lfg/p;

    .line 179
    .line 180
    :cond_b
    return-void
.end method
