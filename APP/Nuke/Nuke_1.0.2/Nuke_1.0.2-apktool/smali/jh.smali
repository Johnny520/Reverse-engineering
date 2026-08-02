.class public final synthetic Ljh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lxk1;

.field public final synthetic k:Lxk1;

.field public final synthetic l:Lxk1;

.field public final synthetic m:Lkx1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lxk1;Lxk1;Lxk1;Lkx1;I)V
    .locals 0

    .line 1
    iput p6, p0, Ljh;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ljh;->i:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Ljh;->j:Lxk1;

    .line 6
    .line 7
    iput-object p3, p0, Ljh;->k:Lxk1;

    .line 8
    .line 9
    iput-object p4, p0, Ljh;->l:Lxk1;

    .line 10
    .line 11
    iput-object p5, p0, Ljh;->m:Lkx1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ljh;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/high16 v5, 0x41200000    # 10.0f

    .line 8
    .line 9
    sget-object v6, Lrh1;->a:Lrh1;

    .line 10
    .line 11
    sget-object v7, Lnx;->a:Leb;

    .line 12
    .line 13
    const/16 v8, 0x10

    .line 14
    .line 15
    const/4 v9, 0x6

    .line 16
    iget-object v11, v0, Ljh;->m:Lkx1;

    .line 17
    .line 18
    iget-object v12, v0, Ljh;->l:Lxk1;

    .line 19
    .line 20
    iget-object v13, v0, Ljh;->k:Lxk1;

    .line 21
    .line 22
    iget-object v14, v0, Ljh;->j:Lxk1;

    .line 23
    .line 24
    iget-object v0, v0, Ljh;->i:Ljava/util/List;

    .line 25
    .line 26
    const/high16 v15, 0x3f800000    # 1.0f

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    const/4 v4, 0x1

    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, Lbv;

    .line 36
    .line 37
    move-object/from16 v16, p2

    .line 38
    .line 39
    check-cast v16, Lpx;

    .line 40
    .line 41
    move-object/from16 v17, p3

    .line 42
    .line 43
    check-cast v17, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v17

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    and-int/lit8 v1, v17, 0x11

    .line 53
    .line 54
    if-eq v1, v8, :cond_0

    .line 55
    .line 56
    move v1, v4

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v1, 0x0

    .line 59
    :goto_0
    and-int/lit8 v8, v17, 0x1

    .line 60
    .line 61
    move-object/from16 v10, v16

    .line 62
    .line 63
    check-cast v10, Lgo0;

    .line 64
    .line 65
    invoke-virtual {v10, v8, v1}, Lgo0;->O(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_d

    .line 70
    .line 71
    invoke-interface {v13}, Lgu2;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    move-object/from16 v17, v1

    .line 76
    .line 77
    check-cast v17, Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v10}, Lgo0;->L()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-ne v1, v7, :cond_1

    .line 84
    .line 85
    new-instance v1, Lpr;

    .line 86
    .line 87
    const/16 v8, 0x1b

    .line 88
    .line 89
    invoke-direct {v1, v13, v8}, Lpr;-><init>(Lxk1;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    move-object/from16 v18, v1

    .line 96
    .line 97
    check-cast v18, Lin0;

    .line 98
    .line 99
    const v1, 0x790b023a

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v10}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v20

    .line 106
    const/16 v33, 0x0

    .line 107
    .line 108
    const/16 v34, 0x3ff4

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    const/16 v21, 0x0

    .line 113
    .line 114
    const/16 v22, 0x0

    .line 115
    .line 116
    const/16 v23, 0x0

    .line 117
    .line 118
    const/16 v24, 0x0

    .line 119
    .line 120
    const/16 v25, 0x0

    .line 121
    .line 122
    const/16 v26, 0x0

    .line 123
    .line 124
    const/16 v27, 0x0

    .line 125
    .line 126
    const/16 v28, 0x0

    .line 127
    .line 128
    const/16 v29, 0x0

    .line 129
    .line 130
    const/16 v30, 0x0

    .line 131
    .line 132
    const/16 v32, 0x30

    .line 133
    .line 134
    move-object/from16 v31, v10

    .line 135
    .line 136
    invoke-static/range {v17 .. v34}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v1, v31

    .line 140
    .line 141
    invoke-static {v6, v5}, Lte;->O(Luh1;F)Luh1;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-static {v1, v8}, Lrp0;->O(Lpx;Luh1;)V

    .line 146
    .line 147
    .line 148
    sget-object v8, Lte;->e:Lyi0;

    .line 149
    .line 150
    new-instance v10, Lxf;

    .line 151
    .line 152
    new-instance v13, Ls;

    .line 153
    .line 154
    invoke-direct {v13, v3}, Ls;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-direct {v10, v5, v13}, Lxf;-><init>(FLs;)V

    .line 158
    .line 159
    .line 160
    sget-object v13, Lsn;->s:Lqk;

    .line 161
    .line 162
    invoke-static {v10, v13, v1, v9}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    move-object/from16 v25, v6

    .line 167
    .line 168
    iget-wide v5, v1, Lgo0;->T:J

    .line 169
    .line 170
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-virtual {v1}, Lgo0;->l()Lyy1;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-static {v1, v8}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    sget-object v17, Lhx;->c:Lgx;

    .line 183
    .line 184
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget-object v9, Lgx;->b:Ljy;

    .line 188
    .line 189
    invoke-virtual {v1}, Lgo0;->Z()V

    .line 190
    .line 191
    .line 192
    iget-boolean v3, v1, Lgo0;->S:Z

    .line 193
    .line 194
    if-eqz v3, :cond_2

    .line 195
    .line 196
    invoke-virtual {v1, v9}, Lgo0;->k(Lxm0;)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_2
    invoke-virtual {v1}, Lgo0;->i0()V

    .line 201
    .line 202
    .line 203
    :goto_1
    sget-object v3, Lgx;->e:Llc;

    .line 204
    .line 205
    invoke-static {v1, v3, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    sget-object v3, Lgx;->d:Llc;

    .line 209
    .line 210
    invoke-static {v1, v3, v6}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    sget-object v5, Lgx;->f:Llc;

    .line 218
    .line 219
    invoke-static {v1, v5, v3}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    sget-object v3, Lgx;->g:Lv6;

    .line 223
    .line 224
    invoke-static {v1, v3}, Lyf3;->b(Lpx;Lin0;)V

    .line 225
    .line 226
    .line 227
    sget-object v3, Lgx;->c:Llc;

    .line 228
    .line 229
    invoke-static {v1, v3, v13}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    const v3, 0x790b023b

    .line 233
    .line 234
    .line 235
    invoke-static {v3, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v17

    .line 239
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    xor-int/lit8 v20, v3, 0x1

    .line 244
    .line 245
    new-instance v3, Lg71;

    .line 246
    .line 247
    invoke-direct {v3, v15, v4}, Lg71;-><init>(FZ)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    invoke-virtual {v1, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    or-int/2addr v5, v6

    .line 259
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    if-nez v5, :cond_3

    .line 264
    .line 265
    if-ne v6, v7, :cond_4

    .line 266
    .line 267
    :cond_3
    new-instance v6, Lmh;

    .line 268
    .line 269
    const/4 v5, 0x2

    .line 270
    invoke-direct {v6, v0, v14, v5}, Lmh;-><init>(Ljava/util/List;Lxk1;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_4
    move-object/from16 v18, v6

    .line 277
    .line 278
    check-cast v18, Lxm0;

    .line 279
    .line 280
    const/16 v23, 0x0

    .line 281
    .line 282
    const/16 v24, 0x30

    .line 283
    .line 284
    const/16 v21, 0x0

    .line 285
    .line 286
    move-object/from16 v22, v1

    .line 287
    .line 288
    move-object/from16 v19, v3

    .line 289
    .line 290
    invoke-static/range {v17 .. v24}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 291
    .line 292
    .line 293
    const v3, 0x790b0231

    .line 294
    .line 295
    .line 296
    invoke-static {v3, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v17

    .line 300
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    check-cast v3, Ljava/util/Set;

    .line 305
    .line 306
    check-cast v3, Ljava/util/Collection;

    .line 307
    .line 308
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    xor-int/lit8 v20, v3, 0x1

    .line 313
    .line 314
    new-instance v3, Lg71;

    .line 315
    .line 316
    invoke-direct {v3, v15, v4}, Lg71;-><init>(FZ)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    const/4 v9, 0x3

    .line 328
    if-nez v5, :cond_5

    .line 329
    .line 330
    if-ne v6, v7, :cond_6

    .line 331
    .line 332
    :cond_5
    new-instance v6, La02;

    .line 333
    .line 334
    invoke-direct {v6, v14, v9}, La02;-><init>(Lxk1;I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v6}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    :cond_6
    move-object/from16 v18, v6

    .line 341
    .line 342
    check-cast v18, Lxm0;

    .line 343
    .line 344
    const/16 v23, 0x0

    .line 345
    .line 346
    const/16 v24, 0x30

    .line 347
    .line 348
    const/16 v21, 0x0

    .line 349
    .line 350
    move-object/from16 v22, v1

    .line 351
    .line 352
    move-object/from16 v19, v3

    .line 353
    .line 354
    invoke-static/range {v17 .. v24}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v4}, Lgo0;->p(Z)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v5, v25

    .line 361
    .line 362
    const/high16 v3, 0x41200000    # 10.0f

    .line 363
    .line 364
    invoke-static {v5, v3}, Lte;->O(Luh1;F)Luh1;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-static {v1, v3}, Lrp0;->O(Lpx;Luh1;)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v12}, Lgu2;->getValue()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    check-cast v3, Lnc3;

    .line 376
    .line 377
    sget-object v5, Lmc3;->a:Lmc3;

    .line 378
    .line 379
    invoke-static {v3, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    if-eqz v5, :cond_7

    .line 384
    .line 385
    const v0, 0x5d40dacb

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v0}, Lgo0;->W(I)V

    .line 389
    .line 390
    .line 391
    sget-object v0, Lgf1;->a:Lkw;

    .line 392
    .line 393
    const/4 v3, 0x6

    .line 394
    invoke-static {v0, v1, v3}, Lse;->k(Lkw;Lpx;I)V

    .line 395
    .line 396
    .line 397
    const/4 v0, 0x0

    .line 398
    invoke-virtual {v1, v0}, Lgo0;->p(Z)V

    .line 399
    .line 400
    .line 401
    goto/16 :goto_3

    .line 402
    .line 403
    :cond_7
    sget-object v5, Lkc3;->a:Lkc3;

    .line 404
    .line 405
    invoke-static {v3, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    if-eqz v5, :cond_8

    .line 410
    .line 411
    const v0, 0x5d4ad3d0

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1, v0}, Lgo0;->W(I)V

    .line 415
    .line 416
    .line 417
    new-instance v0, Lnh;

    .line 418
    .line 419
    const/4 v5, 0x2

    .line 420
    invoke-direct {v0, v11, v5}, Lnh;-><init>(Lkx1;I)V

    .line 421
    .line 422
    .line 423
    const v3, -0x49bc7e02

    .line 424
    .line 425
    .line 426
    invoke-static {v3, v0, v1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    const/4 v3, 0x6

    .line 431
    invoke-static {v0, v1, v3}, Lse;->k(Lkw;Lpx;I)V

    .line 432
    .line 433
    .line 434
    const/4 v0, 0x0

    .line 435
    invoke-virtual {v1, v0}, Lgo0;->p(Z)V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_3

    .line 439
    .line 440
    :cond_8
    instance-of v3, v3, Llc3;

    .line 441
    .line 442
    if-eqz v3, :cond_c

    .line 443
    .line 444
    const v3, 0x5d562976

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v3}, Lgo0;->W(I)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_9

    .line 455
    .line 456
    const v0, 0x5d564cb3

    .line 457
    .line 458
    .line 459
    invoke-virtual {v1, v0}, Lgo0;->W(I)V

    .line 460
    .line 461
    .line 462
    sget-object v0, Lgf1;->b:Lkw;

    .line 463
    .line 464
    const/4 v3, 0x6

    .line 465
    invoke-static {v0, v1, v3}, Lse;->k(Lkw;Lpx;I)V

    .line 466
    .line 467
    .line 468
    const/4 v0, 0x0

    .line 469
    invoke-virtual {v1, v0}, Lgo0;->p(Z)V

    .line 470
    .line 471
    .line 472
    goto :goto_2

    .line 473
    :cond_9
    const v3, 0x5d5c0915

    .line 474
    .line 475
    .line 476
    invoke-virtual {v1, v3}, Lgo0;->W(I)V

    .line 477
    .line 478
    .line 479
    const/high16 v3, 0x43b40000    # 360.0f

    .line 480
    .line 481
    const/4 v5, 0x0

    .line 482
    invoke-static {v8, v5, v3, v4}, Lte;->P(Luh1;FFI)Luh1;

    .line 483
    .line 484
    .line 485
    move-result-object v26

    .line 486
    invoke-virtual {v1, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    invoke-virtual {v1, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    or-int/2addr v3, v4

    .line 495
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    if-nez v3, :cond_a

    .line 500
    .line 501
    if-ne v4, v7, :cond_b

    .line 502
    .line 503
    :cond_a
    new-instance v4, Loh;

    .line 504
    .line 505
    invoke-direct {v4, v0, v14, v9}, Loh;-><init>(Ljava/util/List;Lxk1;I)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    :cond_b
    move-object/from16 v24, v4

    .line 512
    .line 513
    check-cast v24, Lin0;

    .line 514
    .line 515
    const/16 v17, 0x6

    .line 516
    .line 517
    const/16 v18, 0x1fe

    .line 518
    .line 519
    const/16 v19, 0x0

    .line 520
    .line 521
    const/16 v20, 0x0

    .line 522
    .line 523
    const/16 v21, 0x0

    .line 524
    .line 525
    const/16 v23, 0x0

    .line 526
    .line 527
    const/16 v25, 0x0

    .line 528
    .line 529
    const/16 v27, 0x0

    .line 530
    .line 531
    const/16 v28, 0x0

    .line 532
    .line 533
    move-object/from16 v22, v1

    .line 534
    .line 535
    invoke-static/range {v17 .. v28}, Lrg3;->d(IILs8;Lyf;Lpk;Lpx;Ln50;Lin0;Ld91;Luh1;Ljw1;Z)V

    .line 536
    .line 537
    .line 538
    const/4 v0, 0x0

    .line 539
    invoke-virtual {v1, v0}, Lgo0;->p(Z)V

    .line 540
    .line 541
    .line 542
    :goto_2
    invoke-virtual {v1, v0}, Lgo0;->p(Z)V

    .line 543
    .line 544
    .line 545
    goto :goto_3

    .line 546
    :cond_c
    const/4 v0, 0x0

    .line 547
    const v2, 0xb442997

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1, v2}, Lgo0;->W(I)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v1, v0}, Lgo0;->p(Z)V

    .line 554
    .line 555
    .line 556
    invoke-static {}, Lc80;->s()V

    .line 557
    .line 558
    .line 559
    const/4 v2, 0x0

    .line 560
    goto :goto_3

    .line 561
    :cond_d
    move-object v1, v10

    .line 562
    invoke-virtual {v1}, Lgo0;->R()V

    .line 563
    .line 564
    .line 565
    :goto_3
    return-object v2

    .line 566
    :pswitch_0
    move-object v5, v6

    .line 567
    move-object/from16 v1, p1

    .line 568
    .line 569
    check-cast v1, Lbv;

    .line 570
    .line 571
    move-object/from16 v3, p2

    .line 572
    .line 573
    check-cast v3, Lpx;

    .line 574
    .line 575
    move-object/from16 v6, p3

    .line 576
    .line 577
    check-cast v6, Ljava/lang/Integer;

    .line 578
    .line 579
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    and-int/lit8 v1, v6, 0x11

    .line 587
    .line 588
    if-eq v1, v8, :cond_e

    .line 589
    .line 590
    move v1, v4

    .line 591
    goto :goto_4

    .line 592
    :cond_e
    const/4 v1, 0x0

    .line 593
    :goto_4
    and-int/2addr v6, v4

    .line 594
    check-cast v3, Lgo0;

    .line 595
    .line 596
    invoke-virtual {v3, v6, v1}, Lgo0;->O(IZ)Z

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    if-eqz v1, :cond_1b

    .line 601
    .line 602
    invoke-interface {v13}, Lgu2;->getValue()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    move-object/from16 v28, v1

    .line 607
    .line 608
    check-cast v28, Ljava/lang/String;

    .line 609
    .line 610
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    if-ne v1, v7, :cond_f

    .line 615
    .line 616
    new-instance v1, Lh0;

    .line 617
    .line 618
    const/16 v6, 0x16

    .line 619
    .line 620
    invoke-direct {v1, v13, v6}, Lh0;-><init>(Lxk1;I)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    :cond_f
    move-object/from16 v29, v1

    .line 627
    .line 628
    check-cast v29, Lin0;

    .line 629
    .line 630
    const v1, 0x790b008b

    .line 631
    .line 632
    .line 633
    invoke-static {v1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v31

    .line 637
    const/16 v44, 0x0

    .line 638
    .line 639
    const/16 v45, 0x3ff4

    .line 640
    .line 641
    const/16 v30, 0x0

    .line 642
    .line 643
    const/16 v32, 0x0

    .line 644
    .line 645
    const/16 v33, 0x0

    .line 646
    .line 647
    const/16 v34, 0x0

    .line 648
    .line 649
    const/16 v35, 0x0

    .line 650
    .line 651
    const/16 v36, 0x0

    .line 652
    .line 653
    const/16 v37, 0x0

    .line 654
    .line 655
    const/16 v38, 0x0

    .line 656
    .line 657
    const/16 v39, 0x0

    .line 658
    .line 659
    const/16 v40, 0x0

    .line 660
    .line 661
    const/16 v41, 0x0

    .line 662
    .line 663
    const/16 v43, 0x30

    .line 664
    .line 665
    move-object/from16 v42, v3

    .line 666
    .line 667
    invoke-static/range {v28 .. v45}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 668
    .line 669
    .line 670
    const/high16 v1, 0x41200000    # 10.0f

    .line 671
    .line 672
    invoke-static {v5, v1}, Lte;->O(Luh1;F)Luh1;

    .line 673
    .line 674
    .line 675
    move-result-object v6

    .line 676
    invoke-static {v3, v6}, Lrp0;->O(Lpx;Luh1;)V

    .line 677
    .line 678
    .line 679
    sget-object v6, Lte;->e:Lyi0;

    .line 680
    .line 681
    new-instance v8, Lxf;

    .line 682
    .line 683
    new-instance v9, Ls;

    .line 684
    .line 685
    const/4 v10, 0x2

    .line 686
    invoke-direct {v9, v10}, Ls;-><init>(I)V

    .line 687
    .line 688
    .line 689
    invoke-direct {v8, v1, v9}, Lxf;-><init>(FLs;)V

    .line 690
    .line 691
    .line 692
    sget-object v1, Lsn;->s:Lqk;

    .line 693
    .line 694
    const/4 v9, 0x6

    .line 695
    invoke-static {v8, v1, v3, v9}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    iget-wide v8, v3, Lgo0;->T:J

    .line 700
    .line 701
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 702
    .line 703
    .line 704
    move-result v8

    .line 705
    invoke-virtual {v3}, Lgo0;->l()Lyy1;

    .line 706
    .line 707
    .line 708
    move-result-object v9

    .line 709
    invoke-static {v3, v6}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 710
    .line 711
    .line 712
    move-result-object v10

    .line 713
    sget-object v13, Lhx;->c:Lgx;

    .line 714
    .line 715
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    sget-object v13, Lgx;->b:Ljy;

    .line 719
    .line 720
    invoke-virtual {v3}, Lgo0;->Z()V

    .line 721
    .line 722
    .line 723
    move/from16 v25, v4

    .line 724
    .line 725
    iget-boolean v4, v3, Lgo0;->S:Z

    .line 726
    .line 727
    if-eqz v4, :cond_10

    .line 728
    .line 729
    invoke-virtual {v3, v13}, Lgo0;->k(Lxm0;)V

    .line 730
    .line 731
    .line 732
    goto :goto_5

    .line 733
    :cond_10
    invoke-virtual {v3}, Lgo0;->i0()V

    .line 734
    .line 735
    .line 736
    :goto_5
    sget-object v4, Lgx;->e:Llc;

    .line 737
    .line 738
    invoke-static {v3, v4, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    sget-object v1, Lgx;->d:Llc;

    .line 742
    .line 743
    invoke-static {v3, v1, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    sget-object v4, Lgx;->f:Llc;

    .line 751
    .line 752
    invoke-static {v3, v4, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    sget-object v1, Lgx;->g:Lv6;

    .line 756
    .line 757
    invoke-static {v3, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 758
    .line 759
    .line 760
    sget-object v1, Lgx;->c:Llc;

    .line 761
    .line 762
    invoke-static {v3, v1, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    const v1, 0x790b008c

    .line 766
    .line 767
    .line 768
    invoke-static {v1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v17

    .line 772
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    xor-int/lit8 v20, v1, 0x1

    .line 777
    .line 778
    new-instance v1, Lg71;

    .line 779
    .line 780
    move/from16 v4, v25

    .line 781
    .line 782
    invoke-direct {v1, v15, v4}, Lg71;-><init>(FZ)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v3, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v8

    .line 789
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    move-result v9

    .line 793
    or-int/2addr v8, v9

    .line 794
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v9

    .line 798
    if-nez v8, :cond_11

    .line 799
    .line 800
    if-ne v9, v7, :cond_12

    .line 801
    .line 802
    :cond_11
    new-instance v9, Lmh;

    .line 803
    .line 804
    invoke-direct {v9, v0, v14, v4}, Lmh;-><init>(Ljava/util/List;Lxk1;I)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v3, v9}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    :cond_12
    move-object/from16 v18, v9

    .line 811
    .line 812
    check-cast v18, Lxm0;

    .line 813
    .line 814
    const/16 v23, 0x0

    .line 815
    .line 816
    const/16 v24, 0x30

    .line 817
    .line 818
    const/16 v21, 0x0

    .line 819
    .line 820
    move-object/from16 v19, v1

    .line 821
    .line 822
    move-object/from16 v22, v3

    .line 823
    .line 824
    invoke-static/range {v17 .. v24}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 825
    .line 826
    .line 827
    const v1, 0x790b0077

    .line 828
    .line 829
    .line 830
    invoke-static {v1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v17

    .line 834
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    check-cast v1, Ljava/util/Set;

    .line 839
    .line 840
    check-cast v1, Ljava/util/Collection;

    .line 841
    .line 842
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 843
    .line 844
    .line 845
    move-result v1

    .line 846
    const/4 v4, 0x1

    .line 847
    xor-int/lit8 v20, v1, 0x1

    .line 848
    .line 849
    new-instance v1, Lg71;

    .line 850
    .line 851
    invoke-direct {v1, v15, v4}, Lg71;-><init>(FZ)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v3, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v4

    .line 858
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    if-nez v4, :cond_13

    .line 863
    .line 864
    if-ne v8, v7, :cond_14

    .line 865
    .line 866
    :cond_13
    new-instance v8, Lf0;

    .line 867
    .line 868
    const/16 v4, 0xe

    .line 869
    .line 870
    invoke-direct {v8, v14, v4}, Lf0;-><init>(Lxk1;I)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v3, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    :cond_14
    move-object/from16 v18, v8

    .line 877
    .line 878
    check-cast v18, Lxm0;

    .line 879
    .line 880
    const/16 v23, 0x0

    .line 881
    .line 882
    const/16 v24, 0x30

    .line 883
    .line 884
    const/16 v21, 0x0

    .line 885
    .line 886
    move-object/from16 v19, v1

    .line 887
    .line 888
    move-object/from16 v22, v3

    .line 889
    .line 890
    invoke-static/range {v17 .. v24}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 891
    .line 892
    .line 893
    const/4 v4, 0x1

    .line 894
    invoke-virtual {v3, v4}, Lgo0;->p(Z)V

    .line 895
    .line 896
    .line 897
    const/high16 v1, 0x41200000    # 10.0f

    .line 898
    .line 899
    invoke-static {v5, v1}, Lte;->O(Luh1;F)Luh1;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-static {v3, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 904
    .line 905
    .line 906
    invoke-interface {v12}, Lgu2;->getValue()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    check-cast v1, Lk33;

    .line 911
    .line 912
    sget-object v4, Lj33;->a:Lj33;

    .line 913
    .line 914
    invoke-static {v1, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    move-result v4

    .line 918
    if-eqz v4, :cond_15

    .line 919
    .line 920
    const v0, 0x3a51455c

    .line 921
    .line 922
    .line 923
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 924
    .line 925
    .line 926
    sget-object v0, Lpp0;->a:Lkw;

    .line 927
    .line 928
    const/4 v9, 0x6

    .line 929
    invoke-static {v0, v3, v9}, Lt11;->h(Lkw;Lpx;I)V

    .line 930
    .line 931
    .line 932
    const/4 v0, 0x0

    .line 933
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 934
    .line 935
    .line 936
    goto/16 :goto_7

    .line 937
    .line 938
    :cond_15
    sget-object v4, Lh33;->a:Lh33;

    .line 939
    .line 940
    invoke-static {v1, v4}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    move-result v4

    .line 944
    if-eqz v4, :cond_16

    .line 945
    .line 946
    const v0, 0x3a5b2d8c

    .line 947
    .line 948
    .line 949
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 950
    .line 951
    .line 952
    new-instance v0, Lnh;

    .line 953
    .line 954
    const/4 v4, 0x1

    .line 955
    invoke-direct {v0, v11, v4}, Lnh;-><init>(Lkx1;I)V

    .line 956
    .line 957
    .line 958
    const v1, -0x22f71e44

    .line 959
    .line 960
    .line 961
    invoke-static {v1, v0, v3}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    const/4 v9, 0x6

    .line 966
    invoke-static {v0, v3, v9}, Lt11;->h(Lkw;Lpx;I)V

    .line 967
    .line 968
    .line 969
    const/4 v0, 0x0

    .line 970
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 971
    .line 972
    .line 973
    goto/16 :goto_7

    .line 974
    .line 975
    :cond_16
    instance-of v1, v1, Li33;

    .line 976
    .line 977
    if-eqz v1, :cond_1a

    .line 978
    .line 979
    const v1, 0x3a65631d

    .line 980
    .line 981
    .line 982
    invoke-virtual {v3, v1}, Lgo0;->W(I)V

    .line 983
    .line 984
    .line 985
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 986
    .line 987
    .line 988
    move-result v1

    .line 989
    if-eqz v1, :cond_17

    .line 990
    .line 991
    const v0, 0x3a658524

    .line 992
    .line 993
    .line 994
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 995
    .line 996
    .line 997
    sget-object v0, Lpp0;->b:Lkw;

    .line 998
    .line 999
    const/4 v9, 0x6

    .line 1000
    invoke-static {v0, v3, v9}, Lt11;->h(Lkw;Lpx;I)V

    .line 1001
    .line 1002
    .line 1003
    const/4 v0, 0x0

    .line 1004
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_6

    .line 1008
    :cond_17
    const v1, 0x3a6b33b8

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual {v3, v1}, Lgo0;->W(I)V

    .line 1012
    .line 1013
    .line 1014
    const/high16 v1, 0x43b40000    # 360.0f

    .line 1015
    .line 1016
    const/4 v4, 0x1

    .line 1017
    const/4 v5, 0x0

    .line 1018
    invoke-static {v6, v5, v1, v4}, Lte;->P(Luh1;FFI)Luh1;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v37

    .line 1022
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v1

    .line 1026
    invoke-virtual {v3, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v5

    .line 1030
    or-int/2addr v1, v5

    .line 1031
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v5

    .line 1035
    if-nez v1, :cond_18

    .line 1036
    .line 1037
    if-ne v5, v7, :cond_19

    .line 1038
    .line 1039
    :cond_18
    new-instance v5, Loh;

    .line 1040
    .line 1041
    invoke-direct {v5, v0, v14, v4}, Loh;-><init>(Ljava/util/List;Lxk1;I)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v3, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1045
    .line 1046
    .line 1047
    :cond_19
    move-object/from16 v35, v5

    .line 1048
    .line 1049
    check-cast v35, Lin0;

    .line 1050
    .line 1051
    const/16 v28, 0x6

    .line 1052
    .line 1053
    const/16 v29, 0x1fe

    .line 1054
    .line 1055
    const/16 v30, 0x0

    .line 1056
    .line 1057
    const/16 v31, 0x0

    .line 1058
    .line 1059
    const/16 v32, 0x0

    .line 1060
    .line 1061
    const/16 v34, 0x0

    .line 1062
    .line 1063
    const/16 v36, 0x0

    .line 1064
    .line 1065
    const/16 v38, 0x0

    .line 1066
    .line 1067
    const/16 v39, 0x0

    .line 1068
    .line 1069
    move-object/from16 v33, v3

    .line 1070
    .line 1071
    invoke-static/range {v28 .. v39}, Lrg3;->d(IILs8;Lyf;Lpk;Lpx;Ln50;Lin0;Ld91;Luh1;Ljw1;Z)V

    .line 1072
    .line 1073
    .line 1074
    const/4 v0, 0x0

    .line 1075
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1076
    .line 1077
    .line 1078
    :goto_6
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1079
    .line 1080
    .line 1081
    goto :goto_7

    .line 1082
    :cond_1a
    const/4 v0, 0x0

    .line 1083
    const v1, 0xa23a863

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v3, v1}, Lgo0;->W(I)V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1090
    .line 1091
    .line 1092
    invoke-static {}, Lc80;->s()V

    .line 1093
    .line 1094
    .line 1095
    const/4 v2, 0x0

    .line 1096
    goto :goto_7

    .line 1097
    :cond_1b
    invoke-virtual {v3}, Lgo0;->R()V

    .line 1098
    .line 1099
    .line 1100
    :goto_7
    return-object v2

    .line 1101
    :pswitch_1
    move-object v5, v6

    .line 1102
    move-object/from16 v1, p1

    .line 1103
    .line 1104
    check-cast v1, Lbv;

    .line 1105
    .line 1106
    move-object/from16 v3, p2

    .line 1107
    .line 1108
    check-cast v3, Lpx;

    .line 1109
    .line 1110
    move-object/from16 v4, p3

    .line 1111
    .line 1112
    check-cast v4, Ljava/lang/Integer;

    .line 1113
    .line 1114
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1115
    .line 1116
    .line 1117
    move-result v4

    .line 1118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    and-int/lit8 v1, v4, 0x11

    .line 1122
    .line 1123
    if-eq v1, v8, :cond_1c

    .line 1124
    .line 1125
    const/4 v1, 0x1

    .line 1126
    :goto_8
    const/16 v25, 0x1

    .line 1127
    .line 1128
    goto :goto_9

    .line 1129
    :cond_1c
    const/4 v1, 0x0

    .line 1130
    goto :goto_8

    .line 1131
    :goto_9
    and-int/lit8 v4, v4, 0x1

    .line 1132
    .line 1133
    check-cast v3, Lgo0;

    .line 1134
    .line 1135
    invoke-virtual {v3, v4, v1}, Lgo0;->O(IZ)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v1

    .line 1139
    if-eqz v1, :cond_29

    .line 1140
    .line 1141
    invoke-interface {v13}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    move-object/from16 v28, v1

    .line 1146
    .line 1147
    check-cast v28, Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v1

    .line 1153
    if-ne v1, v7, :cond_1d

    .line 1154
    .line 1155
    new-instance v1, Lh0;

    .line 1156
    .line 1157
    const/16 v4, 0x11

    .line 1158
    .line 1159
    invoke-direct {v1, v13, v4}, Lh0;-><init>(Lxk1;I)V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v3, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1163
    .line 1164
    .line 1165
    :cond_1d
    move-object/from16 v29, v1

    .line 1166
    .line 1167
    check-cast v29, Lin0;

    .line 1168
    .line 1169
    const v1, 0x790b0069

    .line 1170
    .line 1171
    .line 1172
    invoke-static {v1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v31

    .line 1176
    const/16 v44, 0x0

    .line 1177
    .line 1178
    const/16 v45, 0x3ff4

    .line 1179
    .line 1180
    const/16 v30, 0x0

    .line 1181
    .line 1182
    const/16 v32, 0x0

    .line 1183
    .line 1184
    const/16 v33, 0x0

    .line 1185
    .line 1186
    const/16 v34, 0x0

    .line 1187
    .line 1188
    const/16 v35, 0x0

    .line 1189
    .line 1190
    const/16 v36, 0x0

    .line 1191
    .line 1192
    const/16 v37, 0x0

    .line 1193
    .line 1194
    const/16 v38, 0x0

    .line 1195
    .line 1196
    const/16 v39, 0x0

    .line 1197
    .line 1198
    const/16 v40, 0x0

    .line 1199
    .line 1200
    const/16 v41, 0x0

    .line 1201
    .line 1202
    const/16 v43, 0x30

    .line 1203
    .line 1204
    move-object/from16 v42, v3

    .line 1205
    .line 1206
    invoke-static/range {v28 .. v45}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 1207
    .line 1208
    .line 1209
    const/high16 v1, 0x41200000    # 10.0f

    .line 1210
    .line 1211
    invoke-static {v5, v1}, Lte;->O(Luh1;F)Luh1;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v4

    .line 1215
    invoke-static {v3, v4}, Lrp0;->O(Lpx;Luh1;)V

    .line 1216
    .line 1217
    .line 1218
    sget-object v4, Lte;->e:Lyi0;

    .line 1219
    .line 1220
    new-instance v6, Lxf;

    .line 1221
    .line 1222
    new-instance v8, Ls;

    .line 1223
    .line 1224
    const/4 v10, 0x2

    .line 1225
    invoke-direct {v8, v10}, Ls;-><init>(I)V

    .line 1226
    .line 1227
    .line 1228
    invoke-direct {v6, v1, v8}, Lxf;-><init>(FLs;)V

    .line 1229
    .line 1230
    .line 1231
    sget-object v1, Lsn;->s:Lqk;

    .line 1232
    .line 1233
    const/4 v9, 0x6

    .line 1234
    invoke-static {v6, v1, v3, v9}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v1

    .line 1238
    iget-wide v8, v3, Lgo0;->T:J

    .line 1239
    .line 1240
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 1241
    .line 1242
    .line 1243
    move-result v6

    .line 1244
    invoke-virtual {v3}, Lgo0;->l()Lyy1;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v8

    .line 1248
    invoke-static {v3, v4}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v9

    .line 1252
    sget-object v10, Lhx;->c:Lgx;

    .line 1253
    .line 1254
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1255
    .line 1256
    .line 1257
    sget-object v10, Lgx;->b:Ljy;

    .line 1258
    .line 1259
    invoke-virtual {v3}, Lgo0;->Z()V

    .line 1260
    .line 1261
    .line 1262
    iget-boolean v13, v3, Lgo0;->S:Z

    .line 1263
    .line 1264
    if-eqz v13, :cond_1e

    .line 1265
    .line 1266
    invoke-virtual {v3, v10}, Lgo0;->k(Lxm0;)V

    .line 1267
    .line 1268
    .line 1269
    goto :goto_a

    .line 1270
    :cond_1e
    invoke-virtual {v3}, Lgo0;->i0()V

    .line 1271
    .line 1272
    .line 1273
    :goto_a
    sget-object v10, Lgx;->e:Llc;

    .line 1274
    .line 1275
    invoke-static {v3, v10, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    sget-object v1, Lgx;->d:Llc;

    .line 1279
    .line 1280
    invoke-static {v3, v1, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1281
    .line 1282
    .line 1283
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v1

    .line 1287
    sget-object v6, Lgx;->f:Llc;

    .line 1288
    .line 1289
    invoke-static {v3, v6, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1290
    .line 1291
    .line 1292
    sget-object v1, Lgx;->g:Lv6;

    .line 1293
    .line 1294
    invoke-static {v3, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 1295
    .line 1296
    .line 1297
    sget-object v1, Lgx;->c:Llc;

    .line 1298
    .line 1299
    invoke-static {v3, v1, v9}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 1300
    .line 1301
    .line 1302
    const v1, 0x790b006a

    .line 1303
    .line 1304
    .line 1305
    invoke-static {v1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v17

    .line 1309
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1310
    .line 1311
    .line 1312
    move-result v1

    .line 1313
    const/4 v6, 0x1

    .line 1314
    xor-int/lit8 v20, v1, 0x1

    .line 1315
    .line 1316
    new-instance v1, Lg71;

    .line 1317
    .line 1318
    invoke-direct {v1, v15, v6}, Lg71;-><init>(FZ)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v3, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1322
    .line 1323
    .line 1324
    move-result v6

    .line 1325
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 1326
    .line 1327
    .line 1328
    move-result v8

    .line 1329
    or-int/2addr v6, v8

    .line 1330
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v8

    .line 1334
    if-nez v6, :cond_1f

    .line 1335
    .line 1336
    if-ne v8, v7, :cond_20

    .line 1337
    .line 1338
    :cond_1f
    new-instance v8, Lmh;

    .line 1339
    .line 1340
    const/4 v6, 0x0

    .line 1341
    invoke-direct {v8, v0, v14, v6}, Lmh;-><init>(Ljava/util/List;Lxk1;I)V

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v3, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1345
    .line 1346
    .line 1347
    :cond_20
    move-object/from16 v18, v8

    .line 1348
    .line 1349
    check-cast v18, Lxm0;

    .line 1350
    .line 1351
    const/16 v23, 0x0

    .line 1352
    .line 1353
    const/16 v24, 0x30

    .line 1354
    .line 1355
    const/16 v21, 0x0

    .line 1356
    .line 1357
    move-object/from16 v19, v1

    .line 1358
    .line 1359
    move-object/from16 v22, v3

    .line 1360
    .line 1361
    invoke-static/range {v17 .. v24}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 1362
    .line 1363
    .line 1364
    const v1, 0x790b0051

    .line 1365
    .line 1366
    .line 1367
    invoke-static {v1, v3}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v17

    .line 1371
    invoke-interface {v14}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v1

    .line 1375
    check-cast v1, Ljava/util/Set;

    .line 1376
    .line 1377
    check-cast v1, Ljava/util/Collection;

    .line 1378
    .line 1379
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1380
    .line 1381
    .line 1382
    move-result v1

    .line 1383
    const/4 v6, 0x1

    .line 1384
    xor-int/lit8 v20, v1, 0x1

    .line 1385
    .line 1386
    new-instance v1, Lg71;

    .line 1387
    .line 1388
    invoke-direct {v1, v15, v6}, Lg71;-><init>(FZ)V

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {v3, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1392
    .line 1393
    .line 1394
    move-result v6

    .line 1395
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v8

    .line 1399
    if-nez v6, :cond_21

    .line 1400
    .line 1401
    if-ne v8, v7, :cond_22

    .line 1402
    .line 1403
    :cond_21
    new-instance v8, Lf0;

    .line 1404
    .line 1405
    const/16 v6, 0xc

    .line 1406
    .line 1407
    invoke-direct {v8, v14, v6}, Lf0;-><init>(Lxk1;I)V

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v3, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1411
    .line 1412
    .line 1413
    :cond_22
    move-object/from16 v18, v8

    .line 1414
    .line 1415
    check-cast v18, Lxm0;

    .line 1416
    .line 1417
    const/16 v23, 0x0

    .line 1418
    .line 1419
    const/16 v24, 0x30

    .line 1420
    .line 1421
    const/16 v21, 0x0

    .line 1422
    .line 1423
    move-object/from16 v19, v1

    .line 1424
    .line 1425
    move-object/from16 v22, v3

    .line 1426
    .line 1427
    invoke-static/range {v17 .. v24}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 1428
    .line 1429
    .line 1430
    const/4 v6, 0x1

    .line 1431
    invoke-virtual {v3, v6}, Lgo0;->p(Z)V

    .line 1432
    .line 1433
    .line 1434
    const/high16 v1, 0x41200000    # 10.0f

    .line 1435
    .line 1436
    invoke-static {v5, v1}, Lte;->O(Luh1;F)Luh1;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v1

    .line 1440
    invoke-static {v3, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 1441
    .line 1442
    .line 1443
    invoke-interface {v12}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v1

    .line 1447
    check-cast v1, Lw62;

    .line 1448
    .line 1449
    sget-object v5, Lv62;->a:Lv62;

    .line 1450
    .line 1451
    invoke-static {v1, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1452
    .line 1453
    .line 1454
    move-result v5

    .line 1455
    if-eqz v5, :cond_23

    .line 1456
    .line 1457
    const v0, 0x76d9e662

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 1461
    .line 1462
    .line 1463
    sget-object v0, Lop0;->b:Lkw;

    .line 1464
    .line 1465
    const/4 v9, 0x6

    .line 1466
    invoke-static {v0, v3, v9}, Ls11;->d(Lkw;Lpx;I)V

    .line 1467
    .line 1468
    .line 1469
    const/4 v6, 0x0

    .line 1470
    invoke-virtual {v3, v6}, Lgo0;->p(Z)V

    .line 1471
    .line 1472
    .line 1473
    goto/16 :goto_c

    .line 1474
    .line 1475
    :cond_23
    const/4 v6, 0x0

    .line 1476
    sget-object v5, Lt62;->a:Lt62;

    .line 1477
    .line 1478
    invoke-static {v1, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1479
    .line 1480
    .line 1481
    move-result v5

    .line 1482
    if-eqz v5, :cond_24

    .line 1483
    .line 1484
    const v0, 0x76e2ab57

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 1488
    .line 1489
    .line 1490
    new-instance v0, Lnh;

    .line 1491
    .line 1492
    invoke-direct {v0, v11, v6}, Lnh;-><init>(Lkx1;I)V

    .line 1493
    .line 1494
    .line 1495
    const v1, -0x6d39ebdb

    .line 1496
    .line 1497
    .line 1498
    invoke-static {v1, v0, v3}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    const/4 v9, 0x6

    .line 1503
    invoke-static {v0, v3, v9}, Ls11;->d(Lkw;Lpx;I)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v3, v6}, Lgo0;->p(Z)V

    .line 1507
    .line 1508
    .line 1509
    goto/16 :goto_c

    .line 1510
    .line 1511
    :cond_24
    instance-of v1, v1, Lu62;

    .line 1512
    .line 1513
    if-eqz v1, :cond_28

    .line 1514
    .line 1515
    const v1, 0x76ebaac9

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v3, v1}, Lgo0;->W(I)V

    .line 1519
    .line 1520
    .line 1521
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1522
    .line 1523
    .line 1524
    move-result v1

    .line 1525
    if-eqz v1, :cond_25

    .line 1526
    .line 1527
    const v0, 0x76ebcc92

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 1531
    .line 1532
    .line 1533
    sget-object v0, Lop0;->c:Lkw;

    .line 1534
    .line 1535
    const/4 v9, 0x6

    .line 1536
    invoke-static {v0, v3, v9}, Ls11;->d(Lkw;Lpx;I)V

    .line 1537
    .line 1538
    .line 1539
    const/4 v0, 0x0

    .line 1540
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1541
    .line 1542
    .line 1543
    goto :goto_b

    .line 1544
    :cond_25
    const v1, 0x76f04010

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v3, v1}, Lgo0;->W(I)V

    .line 1548
    .line 1549
    .line 1550
    const/high16 v1, 0x43b40000    # 360.0f

    .line 1551
    .line 1552
    const/4 v5, 0x0

    .line 1553
    const/4 v6, 0x1

    .line 1554
    invoke-static {v4, v5, v1, v6}, Lte;->P(Luh1;FFI)Luh1;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v37

    .line 1558
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 1559
    .line 1560
    .line 1561
    move-result v1

    .line 1562
    invoke-virtual {v3, v14}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1563
    .line 1564
    .line 1565
    move-result v4

    .line 1566
    or-int/2addr v1, v4

    .line 1567
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v4

    .line 1571
    if-nez v1, :cond_26

    .line 1572
    .line 1573
    if-ne v4, v7, :cond_27

    .line 1574
    .line 1575
    :cond_26
    new-instance v4, Loh;

    .line 1576
    .line 1577
    const/4 v6, 0x0

    .line 1578
    invoke-direct {v4, v0, v14, v6}, Loh;-><init>(Ljava/util/List;Lxk1;I)V

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v3, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1582
    .line 1583
    .line 1584
    :cond_27
    move-object/from16 v35, v4

    .line 1585
    .line 1586
    check-cast v35, Lin0;

    .line 1587
    .line 1588
    const/16 v28, 0x6

    .line 1589
    .line 1590
    const/16 v29, 0x1fe

    .line 1591
    .line 1592
    const/16 v30, 0x0

    .line 1593
    .line 1594
    const/16 v31, 0x0

    .line 1595
    .line 1596
    const/16 v32, 0x0

    .line 1597
    .line 1598
    const/16 v34, 0x0

    .line 1599
    .line 1600
    const/16 v36, 0x0

    .line 1601
    .line 1602
    const/16 v38, 0x0

    .line 1603
    .line 1604
    const/16 v39, 0x0

    .line 1605
    .line 1606
    move-object/from16 v33, v3

    .line 1607
    .line 1608
    invoke-static/range {v28 .. v39}, Lrg3;->d(IILs8;Lyf;Lpk;Lpx;Ln50;Lin0;Ld91;Luh1;Ljw1;Z)V

    .line 1609
    .line 1610
    .line 1611
    const/4 v0, 0x0

    .line 1612
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1613
    .line 1614
    .line 1615
    :goto_b
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1616
    .line 1617
    .line 1618
    goto :goto_c

    .line 1619
    :cond_28
    const/4 v0, 0x0

    .line 1620
    const v1, 0x2d1fcddd

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v3, v1}, Lgo0;->W(I)V

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v3, v0}, Lgo0;->p(Z)V

    .line 1627
    .line 1628
    .line 1629
    invoke-static {}, Lc80;->s()V

    .line 1630
    .line 1631
    .line 1632
    const/4 v2, 0x0

    .line 1633
    goto :goto_c

    .line 1634
    :cond_29
    invoke-virtual {v3}, Lgo0;->R()V

    .line 1635
    .line 1636
    .line 1637
    :goto_c
    return-object v2

    .line 1638
    nop

    .line 1639
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
