.class public final synthetic Lsh/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsh/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lsh/d;->h:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lsh/d;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lfg/p;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v4, v3, 0x6

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v4, 0x2

    .line 40
    :goto_0
    or-int/2addr v3, v4

    .line 41
    :cond_1
    move/from16 v25, v3

    .line 42
    .line 43
    and-int/lit8 v3, v25, 0x13

    .line 44
    .line 45
    const/16 v4, 0x12

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    if-eq v3, v4, :cond_2

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v3, v5

    .line 53
    :goto_1
    and-int/lit8 v4, v25, 0x1

    .line 54
    .line 55
    invoke-virtual {v2, v4, v3}, Li0/h0;->S(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    iget-object v3, v0, Lsh/d;->h:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/16 v26, 0xe

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    const v3, -0x7486b08b

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 75
    .line 76
    .line 77
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Lbi/b;

    .line 84
    .line 85
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    invoke-static/range {v26 .. v26}, Lx6/d;->D(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    const/16 v23, 0x0

    .line 94
    .line 95
    const v24, 0x3ffea

    .line 96
    .line 97
    .line 98
    move-object/from16 v21, v2

    .line 99
    .line 100
    const-string v2, "\u641c\u7d22\u6635\u79f0 / \u7fa4\u804a\u5907\u6ce8 / wxid"

    .line 101
    .line 102
    move v8, v5

    .line 103
    move-wide v4, v3

    .line 104
    const/4 v3, 0x0

    .line 105
    move v9, v8

    .line 106
    const/4 v8, 0x0

    .line 107
    move v10, v9

    .line 108
    const/4 v9, 0x0

    .line 109
    move v12, v10

    .line 110
    const-wide/16 v10, 0x0

    .line 111
    .line 112
    move v13, v12

    .line 113
    const/4 v12, 0x0

    .line 114
    move v15, v13

    .line 115
    const-wide/16 v13, 0x0

    .line 116
    .line 117
    move/from16 v16, v15

    .line 118
    .line 119
    const/4 v15, 0x0

    .line 120
    move/from16 v17, v16

    .line 121
    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    move/from16 v18, v17

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    move/from16 v19, v18

    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    move/from16 v20, v19

    .line 133
    .line 134
    const/16 v19, 0x0

    .line 135
    .line 136
    move/from16 v22, v20

    .line 137
    .line 138
    const/16 v20, 0x0

    .line 139
    .line 140
    move/from16 v27, v22

    .line 141
    .line 142
    const/16 v22, 0x6006

    .line 143
    .line 144
    move/from16 v0, v27

    .line 145
    .line 146
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 147
    .line 148
    .line 149
    move-object/from16 v2, v21

    .line 150
    .line 151
    invoke-virtual {v2, v0}, Li0/h0;->p(Z)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_3
    move v0, v5

    .line 156
    const v3, -0x748327da

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v0}, Li0/h0;->p(Z)V

    .line 163
    .line 164
    .line 165
    :goto_2
    and-int/lit8 v0, v25, 0xe

    .line 166
    .line 167
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-interface {v1, v2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_4
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 176
    .line 177
    .line 178
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_0
    move-object/from16 v0, p1

    .line 182
    .line 183
    check-cast v0, Lh/b0;

    .line 184
    .line 185
    move-object/from16 v1, p2

    .line 186
    .line 187
    check-cast v1, Li0/h0;

    .line 188
    .line 189
    move-object/from16 v2, p3

    .line 190
    .line 191
    check-cast v2, Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    and-int/lit8 v0, v2, 0x11

    .line 201
    .line 202
    const/16 v3, 0x10

    .line 203
    .line 204
    const/4 v4, 0x1

    .line 205
    if-eq v0, v3, :cond_5

    .line 206
    .line 207
    move v0, v4

    .line 208
    goto :goto_4

    .line 209
    :cond_5
    const/4 v0, 0x0

    .line 210
    :goto_4
    and-int/2addr v2, v4

    .line 211
    invoke-virtual {v1, v2, v0}, Li0/h0;->S(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_6

    .line 216
    .line 217
    sget-object v0, Lwb/y2;->n:Lwb/y2;

    .line 218
    .line 219
    const/16 v2, 0x30

    .line 220
    .line 221
    move-object/from16 v3, p0

    .line 222
    .line 223
    iget-object v4, v3, Lsh/d;->h:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v0, v4, v1, v2}, Lwb/y2;->T(Ljava/lang/String;Li0/h0;I)V

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_6
    move-object/from16 v3, p0

    .line 230
    .line 231
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 232
    .line 233
    .line 234
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 235
    .line 236
    return-object v0

    .line 237
    :pswitch_1
    move-object v3, v0

    .line 238
    move-object/from16 v0, p1

    .line 239
    .line 240
    check-cast v0, Lfg/p;

    .line 241
    .line 242
    move-object/from16 v1, p2

    .line 243
    .line 244
    check-cast v1, Li0/h0;

    .line 245
    .line 246
    move-object/from16 v2, p3

    .line 247
    .line 248
    check-cast v2, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    and-int/lit8 v4, v2, 0x6

    .line 258
    .line 259
    const/4 v5, 0x2

    .line 260
    if-nez v4, :cond_8

    .line 261
    .line 262
    invoke-virtual {v1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    if-eqz v4, :cond_7

    .line 267
    .line 268
    const/4 v4, 0x4

    .line 269
    goto :goto_6

    .line 270
    :cond_7
    move v4, v5

    .line 271
    :goto_6
    or-int/2addr v2, v4

    .line 272
    :cond_8
    and-int/lit8 v4, v2, 0x13

    .line 273
    .line 274
    const/16 v6, 0x12

    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/4 v8, 0x1

    .line 278
    if-eq v4, v6, :cond_9

    .line 279
    .line 280
    move v4, v8

    .line 281
    goto :goto_7

    .line 282
    :cond_9
    move v4, v7

    .line 283
    :goto_7
    and-int/lit8 v6, v2, 0x1

    .line 284
    .line 285
    invoke-virtual {v1, v6, v4}, Li0/h0;->S(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_c

    .line 290
    .line 291
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 292
    .line 293
    const/high16 v6, 0x3f800000    # 1.0f

    .line 294
    .line 295
    invoke-static {v4, v6}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    const/16 v6, 0x22

    .line 300
    .line 301
    int-to-float v6, v6

    .line 302
    const/4 v9, 0x0

    .line 303
    invoke-static {v4, v6, v9, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    sget-object v5, Ly0/b;->j:Ly0/g;

    .line 308
    .line 309
    invoke-static {v5, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    iget-wide v9, v1, Li0/h0;->T:J

    .line 314
    .line 315
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-static {v1, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 328
    .line 329
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 333
    .line 334
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 335
    .line 336
    .line 337
    iget-boolean v11, v1, Li0/h0;->S:Z

    .line 338
    .line 339
    if-eqz v11, :cond_a

    .line 340
    .line 341
    invoke-virtual {v1, v10}, Li0/h0;->k(Lfg/a;)V

    .line 342
    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_a
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 346
    .line 347
    .line 348
    :goto_8
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 349
    .line 350
    invoke-static {v10, v1, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    sget-object v5, Lx1/f;->d:Lx1/e;

    .line 354
    .line 355
    invoke-static {v5, v1, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    sget-object v6, Lx1/f;->f:Lx1/e;

    .line 363
    .line 364
    invoke-static {v6, v1, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    sget-object v5, Lx1/f;->g:Lx1/d;

    .line 368
    .line 369
    invoke-static {v5, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 370
    .line 371
    .line 372
    sget-object v5, Lx1/f;->c:Lx1/e;

    .line 373
    .line 374
    invoke-static {v5, v1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    iget-object v4, v3, Lsh/d;->h:Ljava/lang/String;

    .line 378
    .line 379
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    const/16 v27, 0xe

    .line 384
    .line 385
    if-eqz v4, :cond_b

    .line 386
    .line 387
    const v4, -0x45006044

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v4}, Li0/h0;->a0(I)V

    .line 391
    .line 392
    .line 393
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 394
    .line 395
    invoke-virtual {v1, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    check-cast v4, Lbi/b;

    .line 400
    .line 401
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 402
    .line 403
    .line 404
    move-result-wide v4

    .line 405
    move v6, v8

    .line 406
    invoke-static/range {v27 .. v27}, Lx6/d;->D(I)J

    .line 407
    .line 408
    .line 409
    move-result-wide v8

    .line 410
    const/16 v25, 0x0

    .line 411
    .line 412
    const v26, 0x3ffea

    .line 413
    .line 414
    .line 415
    move v10, v6

    .line 416
    move-wide/from16 v29, v4

    .line 417
    .line 418
    move v5, v7

    .line 419
    move-wide/from16 v6, v29

    .line 420
    .line 421
    const-string v4, "\u8f93\u5165\u6d88\u606f"

    .line 422
    .line 423
    move v11, v5

    .line 424
    const/4 v5, 0x0

    .line 425
    move v12, v10

    .line 426
    const/4 v10, 0x0

    .line 427
    move v13, v11

    .line 428
    const/4 v11, 0x0

    .line 429
    move v15, v12

    .line 430
    move v14, v13

    .line 431
    const-wide/16 v12, 0x0

    .line 432
    .line 433
    move/from16 v16, v14

    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    move/from16 v18, v15

    .line 437
    .line 438
    move/from16 v17, v16

    .line 439
    .line 440
    const-wide/16 v15, 0x0

    .line 441
    .line 442
    move/from16 v19, v17

    .line 443
    .line 444
    const/16 v17, 0x0

    .line 445
    .line 446
    move/from16 v20, v18

    .line 447
    .line 448
    const/16 v18, 0x0

    .line 449
    .line 450
    move/from16 v21, v19

    .line 451
    .line 452
    const/16 v19, 0x0

    .line 453
    .line 454
    move/from16 v22, v20

    .line 455
    .line 456
    const/16 v20, 0x0

    .line 457
    .line 458
    move/from16 v23, v21

    .line 459
    .line 460
    const/16 v21, 0x0

    .line 461
    .line 462
    move/from16 v24, v22

    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    move/from16 v28, v24

    .line 467
    .line 468
    const/16 v24, 0x6006

    .line 469
    .line 470
    move/from16 p1, v23

    .line 471
    .line 472
    move-object/from16 v23, v1

    .line 473
    .line 474
    move/from16 v1, p1

    .line 475
    .line 476
    move/from16 p1, v2

    .line 477
    .line 478
    move/from16 v2, v28

    .line 479
    .line 480
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 481
    .line 482
    .line 483
    move-object/from16 v4, v23

    .line 484
    .line 485
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 486
    .line 487
    .line 488
    goto :goto_9

    .line 489
    :cond_b
    move-object v4, v1

    .line 490
    move/from16 p1, v2

    .line 491
    .line 492
    move v1, v7

    .line 493
    move v2, v8

    .line 494
    const v5, -0x44fc57f1

    .line 495
    .line 496
    .line 497
    invoke-virtual {v4, v5}, Li0/h0;->a0(I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 501
    .line 502
    .line 503
    :goto_9
    and-int/lit8 v1, p1, 0xe

    .line 504
    .line 505
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-interface {v0, v4, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v4, v2}, Li0/h0;->p(Z)V

    .line 513
    .line 514
    .line 515
    goto :goto_a

    .line 516
    :cond_c
    move-object v4, v1

    .line 517
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 518
    .line 519
    .line 520
    :goto_a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 521
    .line 522
    return-object v0

    .line 523
    :pswitch_2
    move-object v3, v0

    .line 524
    move-object/from16 v0, p1

    .line 525
    .line 526
    check-cast v0, Lfg/p;

    .line 527
    .line 528
    move-object/from16 v1, p2

    .line 529
    .line 530
    check-cast v1, Li0/h0;

    .line 531
    .line 532
    move-object/from16 v2, p3

    .line 533
    .line 534
    check-cast v2, Ljava/lang/Integer;

    .line 535
    .line 536
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    and-int/lit8 v4, v2, 0x6

    .line 544
    .line 545
    if-nez v4, :cond_e

    .line 546
    .line 547
    invoke-virtual {v1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_d

    .line 552
    .line 553
    const/4 v4, 0x4

    .line 554
    goto :goto_b

    .line 555
    :cond_d
    const/4 v4, 0x2

    .line 556
    :goto_b
    or-int/2addr v2, v4

    .line 557
    :cond_e
    and-int/lit8 v4, v2, 0x13

    .line 558
    .line 559
    const/16 v5, 0x12

    .line 560
    .line 561
    const/4 v6, 0x1

    .line 562
    const/4 v7, 0x0

    .line 563
    if-eq v4, v5, :cond_f

    .line 564
    .line 565
    move v4, v6

    .line 566
    goto :goto_c

    .line 567
    :cond_f
    move v4, v7

    .line 568
    :goto_c
    and-int/lit8 v5, v2, 0x1

    .line 569
    .line 570
    invoke-virtual {v1, v5, v4}, Li0/h0;->S(IZ)Z

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    if-eqz v4, :cond_12

    .line 575
    .line 576
    sget-object v4, Ly0/b;->g:Ly0/g;

    .line 577
    .line 578
    invoke-static {v4, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    iget-wide v8, v1, Li0/h0;->T:J

    .line 583
    .line 584
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 589
    .line 590
    .line 591
    move-result-object v8

    .line 592
    sget-object v9, Ly0/l;->a:Ly0/l;

    .line 593
    .line 594
    invoke-static {v1, v9}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 595
    .line 596
    .line 597
    move-result-object v9

    .line 598
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 599
    .line 600
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 604
    .line 605
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 606
    .line 607
    .line 608
    iget-boolean v11, v1, Li0/h0;->S:Z

    .line 609
    .line 610
    if-eqz v11, :cond_10

    .line 611
    .line 612
    invoke-virtual {v1, v10}, Li0/h0;->k(Lfg/a;)V

    .line 613
    .line 614
    .line 615
    goto :goto_d

    .line 616
    :cond_10
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 617
    .line 618
    .line 619
    :goto_d
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 620
    .line 621
    invoke-static {v10, v1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    sget-object v4, Lx1/f;->d:Lx1/e;

    .line 625
    .line 626
    invoke-static {v4, v1, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 630
    .line 631
    .line 632
    move-result-object v4

    .line 633
    sget-object v5, Lx1/f;->f:Lx1/e;

    .line 634
    .line 635
    invoke-static {v5, v1, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 639
    .line 640
    invoke-static {v4, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 641
    .line 642
    .line 643
    sget-object v4, Lx1/f;->c:Lx1/e;

    .line 644
    .line 645
    invoke-static {v4, v1, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    iget-object v4, v3, Lsh/d;->h:Ljava/lang/String;

    .line 649
    .line 650
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 651
    .line 652
    .line 653
    move-result v4

    .line 654
    const/16 v27, 0xe

    .line 655
    .line 656
    if-eqz v4, :cond_11

    .line 657
    .line 658
    const v4, -0x4d25e275

    .line 659
    .line 660
    .line 661
    invoke-virtual {v1, v4}, Li0/h0;->a0(I)V

    .line 662
    .line 663
    .line 664
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 665
    .line 666
    invoke-virtual {v1, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    check-cast v4, Lbi/b;

    .line 671
    .line 672
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 673
    .line 674
    .line 675
    move-result-wide v4

    .line 676
    invoke-static/range {v27 .. v27}, Lx6/d;->D(I)J

    .line 677
    .line 678
    .line 679
    move-result-wide v8

    .line 680
    const/16 v25, 0x0

    .line 681
    .line 682
    const v26, 0x3ffea

    .line 683
    .line 684
    .line 685
    move v10, v7

    .line 686
    move-wide/from16 v29, v4

    .line 687
    .line 688
    move v5, v6

    .line 689
    move-wide/from16 v6, v29

    .line 690
    .line 691
    const-string v4, "\u586b\u5199\u672c\u6b21\u7248\u672c\u7684\u66f4\u65b0\u5185\u5bb9"

    .line 692
    .line 693
    move v11, v5

    .line 694
    const/4 v5, 0x0

    .line 695
    move v12, v10

    .line 696
    const/4 v10, 0x0

    .line 697
    move v13, v11

    .line 698
    const/4 v11, 0x0

    .line 699
    move v15, v12

    .line 700
    move v14, v13

    .line 701
    const-wide/16 v12, 0x0

    .line 702
    .line 703
    move/from16 v16, v14

    .line 704
    .line 705
    const/4 v14, 0x0

    .line 706
    move/from16 v18, v15

    .line 707
    .line 708
    move/from16 v17, v16

    .line 709
    .line 710
    const-wide/16 v15, 0x0

    .line 711
    .line 712
    move/from16 v19, v17

    .line 713
    .line 714
    const/16 v17, 0x0

    .line 715
    .line 716
    move/from16 v20, v18

    .line 717
    .line 718
    const/16 v18, 0x0

    .line 719
    .line 720
    move/from16 v21, v19

    .line 721
    .line 722
    const/16 v19, 0x0

    .line 723
    .line 724
    move/from16 v22, v20

    .line 725
    .line 726
    const/16 v20, 0x0

    .line 727
    .line 728
    move/from16 v23, v21

    .line 729
    .line 730
    const/16 v21, 0x0

    .line 731
    .line 732
    move/from16 v24, v22

    .line 733
    .line 734
    const/16 v22, 0x0

    .line 735
    .line 736
    move/from16 v28, v24

    .line 737
    .line 738
    const/16 v24, 0x6006

    .line 739
    .line 740
    move-object/from16 v23, v1

    .line 741
    .line 742
    move/from16 v1, v28

    .line 743
    .line 744
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 745
    .line 746
    .line 747
    move-object/from16 v4, v23

    .line 748
    .line 749
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 750
    .line 751
    .line 752
    goto :goto_e

    .line 753
    :cond_11
    move-object v4, v1

    .line 754
    move v1, v7

    .line 755
    const v5, -0x4d21bfdb

    .line 756
    .line 757
    .line 758
    invoke-virtual {v4, v5}, Li0/h0;->a0(I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 762
    .line 763
    .line 764
    :goto_e
    and-int/lit8 v1, v2, 0xe

    .line 765
    .line 766
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    invoke-interface {v0, v4, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    const/4 v13, 0x1

    .line 774
    invoke-virtual {v4, v13}, Li0/h0;->p(Z)V

    .line 775
    .line 776
    .line 777
    goto :goto_f

    .line 778
    :cond_12
    move-object v4, v1

    .line 779
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 780
    .line 781
    .line 782
    :goto_f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 783
    .line 784
    return-object v0

    .line 785
    :pswitch_3
    move-object v3, v0

    .line 786
    move-object/from16 v0, p1

    .line 787
    .line 788
    check-cast v0, Lr/d;

    .line 789
    .line 790
    move-object/from16 v1, p2

    .line 791
    .line 792
    check-cast v1, Li0/h0;

    .line 793
    .line 794
    move-object/from16 v2, p3

    .line 795
    .line 796
    check-cast v2, Ljava/lang/Integer;

    .line 797
    .line 798
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    and-int/lit8 v0, v2, 0x11

    .line 806
    .line 807
    const/16 v4, 0x10

    .line 808
    .line 809
    const/4 v5, 0x1

    .line 810
    if-eq v0, v4, :cond_13

    .line 811
    .line 812
    move v0, v5

    .line 813
    goto :goto_10

    .line 814
    :cond_13
    const/4 v0, 0x0

    .line 815
    :goto_10
    and-int/2addr v2, v5

    .line 816
    invoke-virtual {v1, v2, v0}, Li0/h0;->S(IZ)Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    if-eqz v0, :cond_14

    .line 821
    .line 822
    const/16 v0, 0xa

    .line 823
    .line 824
    int-to-float v6, v0

    .line 825
    const/4 v8, 0x0

    .line 826
    const/16 v9, 0xd

    .line 827
    .line 828
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 829
    .line 830
    const/4 v5, 0x0

    .line 831
    const/4 v7, 0x0

    .line 832
    invoke-static/range {v4 .. v9}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    const/16 v2, 0x30

    .line 837
    .line 838
    const/16 v4, 0xc

    .line 839
    .line 840
    iget-object v5, v3, Lsh/d;->h:Ljava/lang/String;

    .line 841
    .line 842
    invoke-static {v5, v0, v1, v2, v4}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 843
    .line 844
    .line 845
    goto :goto_11

    .line 846
    :cond_14
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 847
    .line 848
    .line 849
    :goto_11
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 850
    .line 851
    return-object v0

    .line 852
    :pswitch_4
    move-object v3, v0

    .line 853
    move-object/from16 v0, p1

    .line 854
    .line 855
    check-cast v0, Lr/d;

    .line 856
    .line 857
    move-object/from16 v1, p2

    .line 858
    .line 859
    check-cast v1, Li0/h0;

    .line 860
    .line 861
    move-object/from16 v2, p3

    .line 862
    .line 863
    check-cast v2, Ljava/lang/Integer;

    .line 864
    .line 865
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 866
    .line 867
    .line 868
    move-result v2

    .line 869
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    and-int/lit8 v0, v2, 0x11

    .line 873
    .line 874
    const/16 v4, 0x10

    .line 875
    .line 876
    const/4 v5, 0x0

    .line 877
    const/4 v6, 0x1

    .line 878
    if-eq v0, v4, :cond_15

    .line 879
    .line 880
    move v0, v6

    .line 881
    goto :goto_12

    .line 882
    :cond_15
    move v0, v5

    .line 883
    :goto_12
    and-int/2addr v2, v6

    .line 884
    invoke-virtual {v1, v2, v0}, Li0/h0;->S(IZ)Z

    .line 885
    .line 886
    .line 887
    move-result v0

    .line 888
    if-eqz v0, :cond_16

    .line 889
    .line 890
    const/4 v0, 0x0

    .line 891
    const/16 v2, 0xe

    .line 892
    .line 893
    iget-object v4, v3, Lsh/d;->h:Ljava/lang/String;

    .line 894
    .line 895
    invoke-static {v4, v0, v1, v5, v2}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 896
    .line 897
    .line 898
    goto :goto_13

    .line 899
    :cond_16
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 900
    .line 901
    .line 902
    :goto_13
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 903
    .line 904
    return-object v0

    .line 905
    :pswitch_5
    move-object v3, v0

    .line 906
    move-object/from16 v0, p1

    .line 907
    .line 908
    check-cast v0, Lr/d;

    .line 909
    .line 910
    move-object/from16 v1, p2

    .line 911
    .line 912
    check-cast v1, Li0/h0;

    .line 913
    .line 914
    move-object/from16 v2, p3

    .line 915
    .line 916
    check-cast v2, Ljava/lang/Integer;

    .line 917
    .line 918
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 919
    .line 920
    .line 921
    move-result v2

    .line 922
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    and-int/lit8 v0, v2, 0x11

    .line 926
    .line 927
    const/16 v4, 0x10

    .line 928
    .line 929
    const/4 v5, 0x1

    .line 930
    if-eq v0, v4, :cond_17

    .line 931
    .line 932
    move v0, v5

    .line 933
    goto :goto_14

    .line 934
    :cond_17
    const/4 v0, 0x0

    .line 935
    :goto_14
    and-int/2addr v2, v5

    .line 936
    invoke-virtual {v1, v2, v0}, Li0/h0;->S(IZ)Z

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    if-eqz v0, :cond_18

    .line 941
    .line 942
    const/16 v0, 0xa

    .line 943
    .line 944
    int-to-float v6, v0

    .line 945
    const/4 v8, 0x0

    .line 946
    const/16 v9, 0xd

    .line 947
    .line 948
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 949
    .line 950
    const/4 v5, 0x0

    .line 951
    const/4 v7, 0x0

    .line 952
    invoke-static/range {v4 .. v9}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    const/16 v2, 0x30

    .line 957
    .line 958
    const/16 v4, 0xc

    .line 959
    .line 960
    iget-object v5, v3, Lsh/d;->h:Ljava/lang/String;

    .line 961
    .line 962
    invoke-static {v5, v0, v1, v2, v4}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 963
    .line 964
    .line 965
    goto :goto_15

    .line 966
    :cond_18
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 967
    .line 968
    .line 969
    :goto_15
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 970
    .line 971
    return-object v0

    .line 972
    :pswitch_6
    move-object v3, v0

    .line 973
    move-object/from16 v0, p1

    .line 974
    .line 975
    check-cast v0, Lfg/p;

    .line 976
    .line 977
    move-object/from16 v1, p2

    .line 978
    .line 979
    check-cast v1, Li0/h0;

    .line 980
    .line 981
    move-object/from16 v2, p3

    .line 982
    .line 983
    check-cast v2, Ljava/lang/Integer;

    .line 984
    .line 985
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 986
    .line 987
    .line 988
    move-result v2

    .line 989
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    and-int/lit8 v4, v2, 0x6

    .line 993
    .line 994
    if-nez v4, :cond_1a

    .line 995
    .line 996
    invoke-virtual {v1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    move-result v4

    .line 1000
    if-eqz v4, :cond_19

    .line 1001
    .line 1002
    const/4 v4, 0x4

    .line 1003
    goto :goto_16

    .line 1004
    :cond_19
    const/4 v4, 0x2

    .line 1005
    :goto_16
    or-int/2addr v2, v4

    .line 1006
    :cond_1a
    and-int/lit8 v4, v2, 0x13

    .line 1007
    .line 1008
    const/16 v5, 0x12

    .line 1009
    .line 1010
    const/4 v6, 0x0

    .line 1011
    if-eq v4, v5, :cond_1b

    .line 1012
    .line 1013
    const/4 v4, 0x1

    .line 1014
    goto :goto_17

    .line 1015
    :cond_1b
    move v4, v6

    .line 1016
    :goto_17
    and-int/lit8 v5, v2, 0x1

    .line 1017
    .line 1018
    invoke-virtual {v1, v5, v4}, Li0/h0;->S(IZ)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v4

    .line 1022
    if-eqz v4, :cond_1d

    .line 1023
    .line 1024
    iget-object v4, v3, Lsh/d;->h:Ljava/lang/String;

    .line 1025
    .line 1026
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1027
    .line 1028
    .line 1029
    move-result v4

    .line 1030
    const/16 v27, 0xe

    .line 1031
    .line 1032
    if-nez v4, :cond_1c

    .line 1033
    .line 1034
    const v4, -0x11fa1d7

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v1, v4}, Li0/h0;->a0(I)V

    .line 1038
    .line 1039
    .line 1040
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 1041
    .line 1042
    invoke-virtual {v1, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v4

    .line 1046
    check-cast v4, Lbi/b;

    .line 1047
    .line 1048
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v4

    .line 1052
    invoke-static/range {v27 .. v27}, Lx6/d;->D(I)J

    .line 1053
    .line 1054
    .line 1055
    move-result-wide v8

    .line 1056
    const/16 v25, 0x0

    .line 1057
    .line 1058
    const v26, 0x3ffea

    .line 1059
    .line 1060
    .line 1061
    move-wide/from16 v29, v4

    .line 1062
    .line 1063
    move v5, v6

    .line 1064
    move-wide/from16 v6, v29

    .line 1065
    .line 1066
    const-string v4, "\u7559\u7a7a\u4f7f\u7528\u7fa4\u4e3b/\u7ba1\u7406\u5458/\u7fa4\u5458"

    .line 1067
    .line 1068
    move v10, v5

    .line 1069
    const/4 v5, 0x0

    .line 1070
    move v11, v10

    .line 1071
    const/4 v10, 0x0

    .line 1072
    move v12, v11

    .line 1073
    const/4 v11, 0x0

    .line 1074
    move v14, v12

    .line 1075
    const-wide/16 v12, 0x0

    .line 1076
    .line 1077
    move v15, v14

    .line 1078
    const/4 v14, 0x0

    .line 1079
    move/from16 v17, v15

    .line 1080
    .line 1081
    const-wide/16 v15, 0x0

    .line 1082
    .line 1083
    move/from16 v18, v17

    .line 1084
    .line 1085
    const/16 v17, 0x0

    .line 1086
    .line 1087
    move/from16 v19, v18

    .line 1088
    .line 1089
    const/16 v18, 0x0

    .line 1090
    .line 1091
    move/from16 v20, v19

    .line 1092
    .line 1093
    const/16 v19, 0x0

    .line 1094
    .line 1095
    move/from16 v21, v20

    .line 1096
    .line 1097
    const/16 v20, 0x0

    .line 1098
    .line 1099
    move/from16 v22, v21

    .line 1100
    .line 1101
    const/16 v21, 0x0

    .line 1102
    .line 1103
    move/from16 v23, v22

    .line 1104
    .line 1105
    const/16 v22, 0x0

    .line 1106
    .line 1107
    const/16 v24, 0x6000

    .line 1108
    .line 1109
    move/from16 v29, v23

    .line 1110
    .line 1111
    move-object/from16 v23, v1

    .line 1112
    .line 1113
    move/from16 v1, v29

    .line 1114
    .line 1115
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1116
    .line 1117
    .line 1118
    move-object/from16 v4, v23

    .line 1119
    .line 1120
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 1121
    .line 1122
    .line 1123
    goto :goto_18

    .line 1124
    :cond_1c
    move-object v4, v1

    .line 1125
    move v1, v6

    .line 1126
    const v5, -0x11be0d7

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v4, v5}, Li0/h0;->a0(I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 1133
    .line 1134
    .line 1135
    :goto_18
    and-int/lit8 v1, v2, 0xe

    .line 1136
    .line 1137
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    invoke-interface {v0, v4, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    goto :goto_19

    .line 1145
    :cond_1d
    move-object v4, v1

    .line 1146
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 1147
    .line 1148
    .line 1149
    :goto_19
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1150
    .line 1151
    return-object v0

    .line 1152
    :pswitch_7
    move-object v3, v0

    .line 1153
    move-object/from16 v0, p1

    .line 1154
    .line 1155
    check-cast v0, Lp/f1;

    .line 1156
    .line 1157
    move-object/from16 v1, p2

    .line 1158
    .line 1159
    check-cast v1, Li0/h0;

    .line 1160
    .line 1161
    move-object/from16 v2, p3

    .line 1162
    .line 1163
    check-cast v2, Ljava/lang/Integer;

    .line 1164
    .line 1165
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1166
    .line 1167
    .line 1168
    move-result v2

    .line 1169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1170
    .line 1171
    .line 1172
    and-int/lit8 v0, v2, 0x11

    .line 1173
    .line 1174
    const/16 v4, 0x10

    .line 1175
    .line 1176
    const/4 v5, 0x1

    .line 1177
    if-eq v0, v4, :cond_1e

    .line 1178
    .line 1179
    move v0, v5

    .line 1180
    goto :goto_1a

    .line 1181
    :cond_1e
    const/4 v0, 0x0

    .line 1182
    :goto_1a
    and-int/2addr v2, v5

    .line 1183
    invoke-virtual {v1, v2, v0}, Li0/h0;->S(IZ)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    if-eqz v0, :cond_1f

    .line 1188
    .line 1189
    sget-object v0, Lbi/m;->a:Li0/m2;

    .line 1190
    .line 1191
    invoke-virtual {v1, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    check-cast v0, Lbi/l;

    .line 1196
    .line 1197
    iget-object v0, v0, Lbi/l;->e:Li0/j1;

    .line 1198
    .line 1199
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    move-object/from16 v22, v0

    .line 1204
    .line 1205
    check-cast v22, Li2/n0;

    .line 1206
    .line 1207
    const/16 v25, 0x0

    .line 1208
    .line 1209
    const v26, 0x1fffe

    .line 1210
    .line 1211
    .line 1212
    iget-object v4, v3, Lsh/d;->h:Ljava/lang/String;

    .line 1213
    .line 1214
    const/4 v5, 0x0

    .line 1215
    const-wide/16 v6, 0x0

    .line 1216
    .line 1217
    const-wide/16 v8, 0x0

    .line 1218
    .line 1219
    const/4 v10, 0x0

    .line 1220
    const/4 v11, 0x0

    .line 1221
    const-wide/16 v12, 0x0

    .line 1222
    .line 1223
    const/4 v14, 0x0

    .line 1224
    const-wide/16 v15, 0x0

    .line 1225
    .line 1226
    const/16 v17, 0x0

    .line 1227
    .line 1228
    const/16 v18, 0x0

    .line 1229
    .line 1230
    const/16 v19, 0x0

    .line 1231
    .line 1232
    const/16 v20, 0x0

    .line 1233
    .line 1234
    const/16 v21, 0x0

    .line 1235
    .line 1236
    const/16 v24, 0x0

    .line 1237
    .line 1238
    move-object/from16 v23, v1

    .line 1239
    .line 1240
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1241
    .line 1242
    .line 1243
    goto :goto_1b

    .line 1244
    :cond_1f
    move-object/from16 v23, v1

    .line 1245
    .line 1246
    invoke-virtual/range {v23 .. v23}, Li0/h0;->V()V

    .line 1247
    .line 1248
    .line 1249
    :goto_1b
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1250
    .line 1251
    return-object v0

    .line 1252
    nop

    .line 1253
    :pswitch_data_0
    .packed-switch 0x0
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
