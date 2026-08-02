.class public final synthetic Leg1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 9
    iput p2, p0, Leg1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    const/16 p1, 0xd

    .line 2
    .line 3
    iput p1, p0, Leg1;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget v1, v1, Leg1;->h:I

    .line 6
    .line 7
    sget-object v2, La83;->a:La83;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, Lbc2;

    .line 17
    .line 18
    move-object/from16 v0, p2

    .line 19
    .line 20
    check-cast v0, Ljz2;

    .line 21
    .line 22
    iget v0, v0, Ljz2;->a:I

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_0
    check-cast v0, Lbc2;

    .line 30
    .line 31
    move-object/from16 v0, p2

    .line 32
    .line 33
    check-cast v0, Lky2;

    .line 34
    .line 35
    iget v0, v0, Lky2;->a:I

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_1
    check-cast v0, Lbc2;

    .line 43
    .line 44
    move-object/from16 v1, p2

    .line 45
    .line 46
    check-cast v1, Lbq2;

    .line 47
    .line 48
    iget-wide v2, v1, Lbq2;->a:J

    .line 49
    .line 50
    new-instance v4, Lju;

    .line 51
    .line 52
    invoke-direct {v4, v2, v3}, Lju;-><init>(J)V

    .line 53
    .line 54
    .line 55
    sget-object v2, Lbd2;->p:Lad2;

    .line 56
    .line 57
    invoke-static {v4, v2, v0}, Lbd2;->a(Ljava/lang/Object;Lwc2;Lbc2;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-wide v3, v1, Lbq2;->b:J

    .line 62
    .line 63
    new-instance v5, Lrs1;

    .line 64
    .line 65
    invoke-direct {v5, v3, v4}, Lrs1;-><init>(J)V

    .line 66
    .line 67
    .line 68
    sget-object v3, Lbd2;->x:Lad2;

    .line 69
    .line 70
    invoke-static {v5, v3, v0}, Lbd2;->a(Ljava/lang/Object;Lwc2;Lbc2;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget v1, v1, Lbq2;->c:F

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Leu;->w([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :pswitch_2
    check-cast v0, Lbc2;

    .line 90
    .line 91
    move-object/from16 v0, p2

    .line 92
    .line 93
    check-cast v0, Lf13;

    .line 94
    .line 95
    iget-wide v1, v0, Lf13;->a:J

    .line 96
    .line 97
    const/16 v3, 0x20

    .line 98
    .line 99
    shr-long/2addr v1, v3

    .line 100
    long-to-int v1, v1

    .line 101
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-wide v2, v0, Lf13;->a:J

    .line 106
    .line 107
    const-wide v4, 0xffffffffL

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    and-long/2addr v2, v4

    .line 113
    long-to-int v0, v2

    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    filled-new-array {v1, v0}, [Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Leu;->w([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :pswitch_3
    check-cast v0, Lbc2;

    .line 128
    .line 129
    move-object/from16 v1, p2

    .line 130
    .line 131
    check-cast v1, Ljava/util/List;

    .line 132
    .line 133
    new-instance v2, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    :goto_0
    if-ge v5, v3, :cond_0

    .line 147
    .line 148
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    check-cast v4, Lrd;

    .line 153
    .line 154
    sget-object v6, Lbd2;->b:Ldq1;

    .line 155
    .line 156
    invoke-static {v4, v6, v0}, Lbd2;->a(Ljava/lang/Object;Lwc2;Lbc2;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    add-int/lit8 v5, v5, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_0
    return-object v2

    .line 167
    :pswitch_4
    check-cast v0, Lbc2;

    .line 168
    .line 169
    move-object/from16 v0, p2

    .line 170
    .line 171
    check-cast v0, Lxj;

    .line 172
    .line 173
    iget v0, v0, Lxj;->a:F

    .line 174
    .line 175
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :pswitch_5
    check-cast v0, Lbc2;

    .line 181
    .line 182
    move-object/from16 v1, p2

    .line 183
    .line 184
    check-cast v1, Leb1;

    .line 185
    .line 186
    iget-object v2, v1, Leb1;->a:Ljava/lang/String;

    .line 187
    .line 188
    iget-object v1, v1, Leb1;->b:Lb13;

    .line 189
    .line 190
    sget-object v3, Lbd2;->i:Ldq1;

    .line 191
    .line 192
    invoke-static {v1, v3, v0}, Lbd2;->a(Ljava/lang/Object;Lwc2;Lbc2;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v0}, Leu;->w([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    return-object v0

    .line 205
    :pswitch_6
    check-cast v0, Lbc2;

    .line 206
    .line 207
    move-object/from16 v0, p2

    .line 208
    .line 209
    check-cast v0, Lim0;

    .line 210
    .line 211
    iget v0, v0, Lim0;->h:I

    .line 212
    .line 213
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    :pswitch_7
    check-cast v0, Lbc2;

    .line 219
    .line 220
    move-object/from16 v1, p2

    .line 221
    .line 222
    check-cast v1, Ln03;

    .line 223
    .line 224
    iget-wide v2, v1, Ln03;->a:J

    .line 225
    .line 226
    new-instance v4, Lp13;

    .line 227
    .line 228
    invoke-direct {v4, v2, v3}, Lp13;-><init>(J)V

    .line 229
    .line 230
    .line 231
    sget-object v2, Lbd2;->v:Lad2;

    .line 232
    .line 233
    invoke-static {v4, v2, v0}, Lbd2;->a(Ljava/lang/Object;Lwc2;Lbc2;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    iget-wide v4, v1, Ln03;->b:J

    .line 238
    .line 239
    new-instance v1, Lp13;

    .line 240
    .line 241
    invoke-direct {v1, v4, v5}, Lp13;-><init>(J)V

    .line 242
    .line 243
    .line 244
    invoke-static {v1, v2, v0}, Lbd2;->a(Ljava/lang/Object;Lwc2;Lbc2;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0}, Leu;->w([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    return-object v0

    .line 257
    :pswitch_8
    check-cast v0, Lbc2;

    .line 258
    .line 259
    move-object/from16 v0, p2

    .line 260
    .line 261
    check-cast v0, Lm03;

    .line 262
    .line 263
    iget v1, v0, Lm03;->a:F

    .line 264
    .line 265
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iget v0, v0, Lm03;->b:F

    .line 270
    .line 271
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    filled-new-array {v1, v0}, [Ljava/lang/Float;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, Leu;->w([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    return-object v0

    .line 284
    :pswitch_9
    check-cast v0, Lbc2;

    .line 285
    .line 286
    move-object/from16 v0, p2

    .line 287
    .line 288
    check-cast v0, Lgz2;

    .line 289
    .line 290
    iget v0, v0, Lgz2;->a:I

    .line 291
    .line 292
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    return-object v0

    .line 297
    :pswitch_a
    check-cast v0, Lbc2;

    .line 298
    .line 299
    move-object/from16 v1, p2

    .line 300
    .line 301
    check-cast v1, Lsd;

    .line 302
    .line 303
    iget-object v2, v1, Lsd;->i:Ljava/lang/String;

    .line 304
    .line 305
    iget-object v1, v1, Lsd;->h:Ljava/util/List;

    .line 306
    .line 307
    sget-object v3, Lbd2;->a:Ldq1;

    .line 308
    .line 309
    invoke-static {v1, v3, v0}, Lbd2;->a(Ljava/lang/Object;Lwc2;Lbc2;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, Leu;->w([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    return-object v0

    .line 322
    :pswitch_b
    check-cast v0, Lbc2;

    .line 323
    .line 324
    return-object p2

    .line 325
    :pswitch_c
    check-cast v0, Lbc2;

    .line 326
    .line 327
    move-object/from16 v0, p2

    .line 328
    .line 329
    check-cast v0, Ldc2;

    .line 330
    .line 331
    iget-object v1, v0, Ldc2;->h:Ljava/util/Map;

    .line 332
    .line 333
    iget-object v0, v0, Ldc2;->i:Lrk1;

    .line 334
    .line 335
    iget-object v2, v0, Lrk1;->b:[Ljava/lang/Object;

    .line 336
    .line 337
    iget-object v6, v0, Lrk1;->c:[Ljava/lang/Object;

    .line 338
    .line 339
    iget-object v0, v0, Lrk1;->a:[J

    .line 340
    .line 341
    array-length v7, v0

    .line 342
    sub-int/2addr v7, v4

    .line 343
    if-ltz v7, :cond_5

    .line 344
    .line 345
    move v4, v5

    .line 346
    :goto_1
    aget-wide v8, v0, v4

    .line 347
    .line 348
    not-long v10, v8

    .line 349
    const/4 v12, 0x7

    .line 350
    shl-long/2addr v10, v12

    .line 351
    and-long/2addr v10, v8

    .line 352
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    and-long/2addr v10, v12

    .line 358
    cmp-long v10, v10, v12

    .line 359
    .line 360
    if-eqz v10, :cond_4

    .line 361
    .line 362
    sub-int v10, v4, v7

    .line 363
    .line 364
    not-int v10, v10

    .line 365
    ushr-int/lit8 v10, v10, 0x1f

    .line 366
    .line 367
    const/16 v11, 0x8

    .line 368
    .line 369
    rsub-int/lit8 v10, v10, 0x8

    .line 370
    .line 371
    move v12, v5

    .line 372
    :goto_2
    if-ge v12, v10, :cond_3

    .line 373
    .line 374
    const-wide/16 v13, 0xff

    .line 375
    .line 376
    and-long/2addr v13, v8

    .line 377
    const-wide/16 v15, 0x80

    .line 378
    .line 379
    cmp-long v13, v13, v15

    .line 380
    .line 381
    if-gez v13, :cond_2

    .line 382
    .line 383
    shl-int/lit8 v13, v4, 0x3

    .line 384
    .line 385
    add-int/2addr v13, v12

    .line 386
    aget-object v14, v2, v13

    .line 387
    .line 388
    aget-object v13, v6, v13

    .line 389
    .line 390
    check-cast v13, Lfc2;

    .line 391
    .line 392
    invoke-interface {v13}, Lfc2;->c()Ljava/util/Map;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v15

    .line 400
    if-eqz v15, :cond_1

    .line 401
    .line 402
    invoke-interface {v1, v14}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    goto :goto_3

    .line 406
    :cond_1
    invoke-interface {v1, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    :cond_2
    :goto_3
    shr-long/2addr v8, v11

    .line 410
    add-int/lit8 v12, v12, 0x1

    .line 411
    .line 412
    goto :goto_2

    .line 413
    :cond_3
    if-ne v10, v11, :cond_5

    .line 414
    .line 415
    :cond_4
    if-eq v4, v7, :cond_5

    .line 416
    .line 417
    add-int/lit8 v4, v4, 0x1

    .line 418
    .line 419
    goto :goto_1

    .line 420
    :cond_5
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-eqz v0, :cond_6

    .line 425
    .line 426
    goto :goto_4

    .line 427
    :cond_6
    move-object v3, v1

    .line 428
    :goto_4
    return-object v3

    .line 429
    :pswitch_d
    check-cast v0, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    move-object/from16 v1, p2

    .line 436
    .line 437
    check-cast v1, Ly10;

    .line 438
    .line 439
    add-int/2addr v0, v6

    .line 440
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    return-object v0

    .line 445
    :pswitch_e
    sget-object v1, Lup0;->a:Lkw;

    .line 446
    .line 447
    check-cast v0, Lpx;

    .line 448
    .line 449
    move-object/from16 v3, p2

    .line 450
    .line 451
    check-cast v3, Ljava/lang/Integer;

    .line 452
    .line 453
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    and-int/lit8 v7, v3, 0x3

    .line 458
    .line 459
    if-eq v7, v4, :cond_7

    .line 460
    .line 461
    move v4, v6

    .line 462
    goto :goto_5

    .line 463
    :cond_7
    move v4, v5

    .line 464
    :goto_5
    and-int/2addr v3, v6

    .line 465
    check-cast v0, Lgo0;

    .line 466
    .line 467
    invoke-virtual {v0, v3, v4}, Lgo0;->O(IZ)Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    if-eqz v3, :cond_8

    .line 472
    .line 473
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-virtual {v1, v0, v3}, Lkw;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_8
    invoke-virtual {v0}, Lgo0;->R()V

    .line 482
    .line 483
    .line 484
    :goto_6
    return-object v2

    .line 485
    :pswitch_f
    check-cast v0, Lpx;

    .line 486
    .line 487
    move-object/from16 v1, p2

    .line 488
    .line 489
    check-cast v1, Ljava/lang/Integer;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-static {v6}, Lpp0;->N(I)I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    invoke-static {v1, v0}, Lrp0;->H(ILpx;)V

    .line 499
    .line 500
    .line 501
    return-object v2

    .line 502
    :pswitch_10
    check-cast v0, Lin0;

    .line 503
    .line 504
    move-object/from16 v1, p2

    .line 505
    .line 506
    check-cast v1, Lrg1;

    .line 507
    .line 508
    :try_start_0
    iget-object v1, v1, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    check-cast v0, Ljava/lang/Boolean;

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 521
    .line 522
    .line 523
    goto :goto_7

    .line 524
    :catchall_0
    move-exception v0

    .line 525
    new-instance v1, Lx92;

    .line 526
    .line 527
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 528
    .line 529
    .line 530
    move-object v0, v1

    .line 531
    :goto_7
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 532
    .line 533
    instance-of v2, v0, Lx92;

    .line 534
    .line 535
    if-eqz v2, :cond_9

    .line 536
    .line 537
    move-object v0, v1

    .line 538
    :cond_9
    check-cast v0, Ljava/lang/Boolean;

    .line 539
    .line 540
    return-object v0

    .line 541
    :pswitch_11
    move-object/from16 v1, p2

    .line 542
    .line 543
    check-cast v1, Lrg1;

    .line 544
    .line 545
    iget-object v1, v1, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-static {v1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    return-object v0

    .line 560
    :pswitch_12
    check-cast v0, Ljava/lang/Boolean;

    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    move-object/from16 v1, p2

    .line 567
    .line 568
    check-cast v1, Lrg1;

    .line 569
    .line 570
    iget-object v1, v1, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    if-eq v1, v0, :cond_a

    .line 577
    .line 578
    move v5, v6

    .line 579
    :cond_a
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    return-object v0

    .line 584
    :pswitch_13
    check-cast v0, Ljava/lang/Boolean;

    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    move-object/from16 v1, p2

    .line 591
    .line 592
    check-cast v1, Lrg1;

    .line 593
    .line 594
    iget-object v1, v1, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 595
    .line 596
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->isDefault()Z

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    if-ne v1, v0, :cond_b

    .line 601
    .line 602
    move v5, v6

    .line 603
    :cond_b
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    return-object v0

    .line 608
    :pswitch_14
    check-cast v0, Ljava/lang/Boolean;

    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    move-object/from16 v1, p2

    .line 615
    .line 616
    check-cast v1, Lrg1;

    .line 617
    .line 618
    iget-object v1, v1, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 619
    .line 620
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    if-eq v1, v0, :cond_c

    .line 625
    .line 626
    move v5, v6

    .line 627
    :cond_c
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    return-object v0

    .line 632
    :pswitch_15
    check-cast v0, Ljava/lang/String;

    .line 633
    .line 634
    move-object/from16 v1, p2

    .line 635
    .line 636
    check-cast v1, Lwf1;

    .line 637
    .line 638
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    instance-of v4, v2, Ljava/lang/reflect/Method;

    .line 643
    .line 644
    if-eqz v4, :cond_d

    .line 645
    .line 646
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    check-cast v1, Ljava/lang/reflect/Method;

    .line 654
    .line 655
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    goto :goto_8

    .line 660
    :cond_d
    instance-of v4, v2, Ljava/lang/reflect/Constructor;

    .line 661
    .line 662
    if-eqz v4, :cond_e

    .line 663
    .line 664
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 672
    .line 673
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    goto :goto_8

    .line 678
    :cond_e
    instance-of v2, v2, Ljava/lang/reflect/Field;

    .line 679
    .line 680
    if-eqz v2, :cond_f

    .line 681
    .line 682
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    check-cast v1, Ljava/lang/reflect/Field;

    .line 690
    .line 691
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->toGenericString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    :goto_8
    invoke-static {v1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    goto :goto_9

    .line 704
    :cond_f
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    const-string v1, "Unsupported member type: "

    .line 709
    .line 710
    invoke-static {v1, v0}, Ls;->k(Ljava/lang/String;Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    :goto_9
    return-object v3

    .line 714
    :pswitch_16
    check-cast v0, Ljava/lang/Boolean;

    .line 715
    .line 716
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    move-object/from16 v1, p2

    .line 721
    .line 722
    check-cast v1, Lwf1;

    .line 723
    .line 724
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-interface {v1}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    if-eq v1, v0, :cond_10

    .line 733
    .line 734
    move v5, v6

    .line 735
    :cond_10
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    return-object v0

    .line 740
    :pswitch_17
    check-cast v0, Ljava/lang/Boolean;

    .line 741
    .line 742
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    move-object/from16 v1, p2

    .line 747
    .line 748
    check-cast v1, Lrg1;

    .line 749
    .line 750
    iget-object v1, v1, Lrg1;->c:Ljava/lang/reflect/Method;

    .line 751
    .line 752
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-ne v1, v0, :cond_11

    .line 757
    .line 758
    move v5, v6

    .line 759
    :cond_11
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    return-object v0

    .line 764
    :pswitch_18
    check-cast v0, Ljava/lang/Boolean;

    .line 765
    .line 766
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 767
    .line 768
    .line 769
    move-result v0

    .line 770
    move-object/from16 v1, p2

    .line 771
    .line 772
    check-cast v1, Lwf1;

    .line 773
    .line 774
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    invoke-interface {v1}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    if-ne v1, v0, :cond_12

    .line 783
    .line 784
    move v5, v6

    .line 785
    :cond_12
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    return-object v0

    .line 790
    :pswitch_19
    check-cast v0, Lin0;

    .line 791
    .line 792
    move-object/from16 v1, p2

    .line 793
    .line 794
    check-cast v1, Lwf1;

    .line 795
    .line 796
    :try_start_1
    sget-object v2, Lzh1;->i:Lj51;

    .line 797
    .line 798
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    invoke-interface {v1}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 803
    .line 804
    .line 805
    move-result v1

    .line 806
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    sget-object v2, Lzh1;->k:Lyf0;

    .line 810
    .line 811
    new-instance v3, Ljava/util/ArrayList;

    .line 812
    .line 813
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v2}, Lw2;->iterator()Ljava/util/Iterator;

    .line 817
    .line 818
    .line 819
    move-result-object v2

    .line 820
    :cond_13
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    if-eqz v4, :cond_15

    .line 825
    .line 826
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    move-object v7, v4

    .line 831
    check-cast v7, Lzh1;

    .line 832
    .line 833
    iget v7, v7, Lzh1;->h:I

    .line 834
    .line 835
    and-int/2addr v7, v1

    .line 836
    if-eqz v7, :cond_14

    .line 837
    .line 838
    move v7, v6

    .line 839
    goto :goto_b

    .line 840
    :cond_14
    move v7, v5

    .line 841
    :goto_b
    if-eqz v7, :cond_13

    .line 842
    .line 843
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    goto :goto_a

    .line 847
    :cond_15
    invoke-static {v3}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    check-cast v0, Ljava/lang/Boolean;

    .line 856
    .line 857
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 858
    .line 859
    .line 860
    goto :goto_c

    .line 861
    :catchall_1
    move-exception v0

    .line 862
    new-instance v1, Lx92;

    .line 863
    .line 864
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 865
    .line 866
    .line 867
    move-object v0, v1

    .line 868
    :goto_c
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 869
    .line 870
    instance-of v2, v0, Lx92;

    .line 871
    .line 872
    if-eqz v2, :cond_16

    .line 873
    .line 874
    move-object v0, v1

    .line 875
    :cond_16
    check-cast v0, Ljava/lang/Boolean;

    .line 876
    .line 877
    return-object v0

    .line 878
    :pswitch_1a
    check-cast v0, Ljava/util/Set;

    .line 879
    .line 880
    move-object/from16 v1, p2

    .line 881
    .line 882
    check-cast v1, Lwf1;

    .line 883
    .line 884
    check-cast v0, Ljava/lang/Iterable;

    .line 885
    .line 886
    instance-of v2, v0, Ljava/util/Collection;

    .line 887
    .line 888
    if-eqz v2, :cond_17

    .line 889
    .line 890
    move-object v2, v0

    .line 891
    check-cast v2, Ljava/util/Collection;

    .line 892
    .line 893
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    if-eqz v2, :cond_17

    .line 898
    .line 899
    goto :goto_d

    .line 900
    :cond_17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    if-eqz v2, :cond_19

    .line 909
    .line 910
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    check-cast v2, Lzh1;

    .line 915
    .line 916
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 917
    .line 918
    .line 919
    move-result-object v3

    .line 920
    invoke-interface {v3}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 921
    .line 922
    .line 923
    move-result v3

    .line 924
    iget v2, v2, Lzh1;->h:I

    .line 925
    .line 926
    and-int/2addr v2, v3

    .line 927
    if-eqz v2, :cond_18

    .line 928
    .line 929
    goto :goto_e

    .line 930
    :cond_19
    :goto_d
    move v5, v6

    .line 931
    :goto_e
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    return-object v0

    .line 936
    :pswitch_1b
    check-cast v0, Ljava/util/Set;

    .line 937
    .line 938
    move-object/from16 v1, p2

    .line 939
    .line 940
    check-cast v1, Lwf1;

    .line 941
    .line 942
    check-cast v0, Ljava/lang/Iterable;

    .line 943
    .line 944
    instance-of v2, v0, Ljava/util/Collection;

    .line 945
    .line 946
    if-eqz v2, :cond_1a

    .line 947
    .line 948
    move-object v2, v0

    .line 949
    check-cast v2, Ljava/util/Collection;

    .line 950
    .line 951
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    if-eqz v2, :cond_1a

    .line 956
    .line 957
    goto :goto_10

    .line 958
    :cond_1a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    if-eqz v2, :cond_1b

    .line 967
    .line 968
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    check-cast v2, Lzh1;

    .line 973
    .line 974
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 975
    .line 976
    .line 977
    move-result-object v3

    .line 978
    invoke-interface {v3}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 979
    .line 980
    .line 981
    move-result v3

    .line 982
    iget v2, v2, Lzh1;->h:I

    .line 983
    .line 984
    and-int/2addr v2, v3

    .line 985
    if-eqz v2, :cond_1c

    .line 986
    .line 987
    goto :goto_f

    .line 988
    :cond_1b
    :goto_10
    move v5, v6

    .line 989
    :cond_1c
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    return-object v0

    .line 994
    :pswitch_1c
    check-cast v0, Lin0;

    .line 995
    .line 996
    move-object/from16 v1, p2

    .line 997
    .line 998
    check-cast v1, Lwf1;

    .line 999
    .line 1000
    :try_start_2
    invoke-virtual {v1}, Lwf1;->b()Ljava/lang/reflect/Member;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    invoke-interface {v1}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    check-cast v0, Ljava/lang/Boolean;

    .line 1013
    .line 1014
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1015
    .line 1016
    .line 1017
    goto :goto_11

    .line 1018
    :catchall_2
    move-exception v0

    .line 1019
    new-instance v1, Lx92;

    .line 1020
    .line 1021
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1022
    .line 1023
    .line 1024
    move-object v0, v1

    .line 1025
    :goto_11
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1026
    .line 1027
    instance-of v2, v0, Lx92;

    .line 1028
    .line 1029
    if-eqz v2, :cond_1d

    .line 1030
    .line 1031
    move-object v0, v1

    .line 1032
    :cond_1d
    check-cast v0, Ljava/lang/Boolean;

    .line 1033
    .line 1034
    return-object v0

    .line 1035
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
