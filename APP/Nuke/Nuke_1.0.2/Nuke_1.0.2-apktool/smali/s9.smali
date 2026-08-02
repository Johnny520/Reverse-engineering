.class public final synthetic Ls9;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Ls9;->h:I

    .line 2
    .line 3
    iput-object p3, p0, Ls9;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 9
    iput p1, p0, Ls9;->h:I

    iput-object p2, p0, Ls9;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget v2, v0, Ls9;->h:I

    .line 6
    .line 7
    const/4 v7, 0x7

    .line 8
    const/16 v8, 0x8

    .line 9
    .line 10
    const/4 v11, 0x0

    .line 11
    const/4 v12, 0x2

    .line 12
    const/4 v13, 0x0

    .line 13
    const/4 v14, 0x1

    .line 14
    packed-switch v2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljc3;

    .line 20
    .line 21
    move-object/from16 v2, p1

    .line 22
    .line 23
    check-cast v2, Lpx;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v14}, Lpp0;->N(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {v0, v2, v1}, Lse;->i(Ljc3;Lpx;I)V

    .line 35
    .line 36
    .line 37
    sget-object v0, La83;->a:La83;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroid/app/RemoteAction;

    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    check-cast v2, Lpx;

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    check-cast v2, Lgo0;

    .line 54
    .line 55
    const v1, -0x520d2714

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Lgo0;->W(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/app/RemoteAction;->getTitle()Ljava/lang/CharSequence;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v2, v13}, Lgo0;->p(Z)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_1
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Landroid/view/textclassifier/TextClassification;

    .line 76
    .line 77
    move-object/from16 v2, p1

    .line 78
    .line 79
    check-cast v2, Lpx;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast v2, Lgo0;

    .line 87
    .line 88
    const v1, 0x38a0c7d5

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Lgo0;->W(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/view/textclassifier/TextClassification;->getLabel()Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v2, v13}, Lgo0;->p(Z)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_2
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, [C

    .line 109
    .line 110
    move-object/from16 v2, p1

    .line 111
    .line 112
    check-cast v2, Ljava/lang/CharSequence;

    .line 113
    .line 114
    check-cast v1, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v2, v0, v1, v13}, Lpv2;->r0(Ljava/lang/CharSequence;[CIZ)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-gez v0, :cond_0

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v11, Low1;

    .line 139
    .line 140
    invoke-direct {v11, v0, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :goto_0
    return-object v11

    .line 144
    :pswitch_3
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Lts2;

    .line 147
    .line 148
    move-object/from16 v2, p1

    .line 149
    .line 150
    check-cast v2, Ljava/util/Set;

    .line 151
    .line 152
    check-cast v1, Lvr2;

    .line 153
    .line 154
    iget-object v1, v0, Lts2;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 155
    .line 156
    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-nez v3, :cond_1

    .line 161
    .line 162
    move-object v4, v2

    .line 163
    check-cast v4, Ljava/util/Collection;

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_1
    instance-of v4, v3, Ljava/util/Set;

    .line 167
    .line 168
    if-eqz v4, :cond_2

    .line 169
    .line 170
    new-array v4, v12, [Ljava/util/Set;

    .line 171
    .line 172
    aput-object v3, v4, v13

    .line 173
    .line 174
    aput-object v2, v4, v14

    .line 175
    .line 176
    invoke-static {v4}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    goto :goto_2

    .line 181
    :cond_2
    instance-of v4, v3, Ljava/util/List;

    .line 182
    .line 183
    if-eqz v4, :cond_6

    .line 184
    .line 185
    move-object v4, v3

    .line 186
    check-cast v4, Ljava/util/Collection;

    .line 187
    .line 188
    invoke-static {v2}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-static {v4, v5}, Ldu;->x0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    :cond_3
    :goto_2
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_5

    .line 201
    .line 202
    invoke-virtual {v0}, Lts2;->b()Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_4

    .line 207
    .line 208
    iget-object v1, v0, Lts2;->a:Lin0;

    .line 209
    .line 210
    new-instance v2, Lta;

    .line 211
    .line 212
    const/16 v3, 0x1a

    .line 213
    .line 214
    invoke-direct {v2, v3, v0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    invoke-interface {v1, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    :cond_4
    sget-object v11, La83;->a:La83;

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    if-eq v5, v3, :cond_3

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_6
    const-string v0, "Unexpected notification"

    .line 231
    .line 232
    invoke-static {v0}, Ltx;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 233
    .line 234
    .line 235
    invoke-static {}, Ls;->b()V

    .line 236
    .line 237
    .line 238
    :goto_3
    return-object v11

    .line 239
    :pswitch_4
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, Lzq2;

    .line 242
    .line 243
    move-object/from16 v2, p1

    .line 244
    .line 245
    check-cast v2, Ljava/util/Set;

    .line 246
    .line 247
    check-cast v1, Lvr2;

    .line 248
    .line 249
    iget-object v1, v0, Lsj;->h:Ljava/lang/Object;

    .line 250
    .line 251
    monitor-enter v1

    .line 252
    :try_start_0
    iget-object v14, v0, Lzq2;->k:Lsk1;

    .line 253
    .line 254
    if-nez v14, :cond_7

    .line 255
    .line 256
    check-cast v2, Ljava/lang/Iterable;

    .line 257
    .line 258
    iget-object v3, v0, Lzq2;->i:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-static {v2, v3}, Ldu;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-eqz v2, :cond_b

    .line 265
    .line 266
    iget-object v11, v0, Lzq2;->m:Lho2;

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :catchall_0
    move-exception v0

    .line 270
    goto :goto_7

    .line 271
    :cond_7
    iget-object v15, v14, Lsk1;->b:[Ljava/lang/Object;

    .line 272
    .line 273
    iget-object v14, v14, Lsk1;->a:[J

    .line 274
    .line 275
    const-wide/16 v16, 0x80

    .line 276
    .line 277
    array-length v3, v14

    .line 278
    sub-int/2addr v3, v12

    .line 279
    if-ltz v3, :cond_b

    .line 280
    .line 281
    move v4, v13

    .line 282
    const-wide/16 v18, 0xff

    .line 283
    .line 284
    :goto_4
    aget-wide v5, v14, v4

    .line 285
    .line 286
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    not-long v9, v5

    .line 292
    shl-long/2addr v9, v7

    .line 293
    and-long/2addr v9, v5

    .line 294
    and-long v9, v9, v20

    .line 295
    .line 296
    cmp-long v9, v9, v20

    .line 297
    .line 298
    if-eqz v9, :cond_a

    .line 299
    .line 300
    sub-int v9, v4, v3

    .line 301
    .line 302
    not-int v9, v9

    .line 303
    ushr-int/lit8 v9, v9, 0x1f

    .line 304
    .line 305
    rsub-int/lit8 v9, v9, 0x8

    .line 306
    .line 307
    move v10, v13

    .line 308
    :goto_5
    if-ge v10, v9, :cond_9

    .line 309
    .line 310
    and-long v22, v5, v18

    .line 311
    .line 312
    cmp-long v12, v22, v16

    .line 313
    .line 314
    if-gez v12, :cond_8

    .line 315
    .line 316
    shl-int/lit8 v12, v4, 0x3

    .line 317
    .line 318
    add-int/2addr v12, v10

    .line 319
    aget-object v12, v15, v12

    .line 320
    .line 321
    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v12

    .line 325
    if-eqz v12, :cond_8

    .line 326
    .line 327
    iget-object v11, v0, Lzq2;->m:Lho2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 328
    .line 329
    goto :goto_6

    .line 330
    :cond_8
    shr-long/2addr v5, v8

    .line 331
    add-int/lit8 v10, v10, 0x1

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_9
    if-ne v9, v8, :cond_b

    .line 335
    .line 336
    :cond_a
    if-eq v4, v3, :cond_b

    .line 337
    .line 338
    add-int/lit8 v4, v4, 0x1

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_b
    :goto_6
    monitor-exit v1

    .line 342
    if-eqz v11, :cond_c

    .line 343
    .line 344
    sget-object v0, La83;->a:La83;

    .line 345
    .line 346
    invoke-interface {v11, v0}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    :cond_c
    sget-object v0, La83;->a:La83;

    .line 350
    .line 351
    return-object v0

    .line 352
    :goto_7
    monitor-exit v1

    .line 353
    throw v0

    .line 354
    :pswitch_5
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Lb72;

    .line 357
    .line 358
    move-object/from16 v2, p1

    .line 359
    .line 360
    check-cast v2, Lo12;

    .line 361
    .line 362
    check-cast v1, Lrs1;

    .line 363
    .line 364
    invoke-virtual {v2}, Lo12;->a()V

    .line 365
    .line 366
    .line 367
    iget-wide v1, v1, Lrs1;->a:J

    .line 368
    .line 369
    iput-wide v1, v0, Lb72;->h:J

    .line 370
    .line 371
    sget-object v0, La83;->a:La83;

    .line 372
    .line 373
    return-object v0

    .line 374
    :pswitch_6
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lam2;

    .line 377
    .line 378
    move-object/from16 v2, p1

    .line 379
    .line 380
    check-cast v2, Ljava/lang/Float;

    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    check-cast v1, Ljava/lang/Float;

    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-virtual {v0}, Lth1;->A0()Lj20;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    new-instance v4, Lzl2;

    .line 397
    .line 398
    invoke-direct {v4, v0, v2, v1, v11}, Lzl2;-><init>(Lam2;FFLt00;)V

    .line 399
    .line 400
    .line 401
    const/4 v0, 0x3

    .line 402
    invoke-static {v3, v11, v4, v0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 403
    .line 404
    .line 405
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 406
    .line 407
    return-object v0

    .line 408
    :pswitch_7
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Landroid/content/Context;

    .line 411
    .line 412
    move-object/from16 v2, p1

    .line 413
    .line 414
    check-cast v2, Lpx;

    .line 415
    .line 416
    check-cast v1, Ljava/lang/Integer;

    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    and-int/lit8 v3, v1, 0x3

    .line 423
    .line 424
    if-eq v3, v12, :cond_d

    .line 425
    .line 426
    move v13, v14

    .line 427
    :cond_d
    and-int/2addr v1, v14

    .line 428
    check-cast v2, Lgo0;

    .line 429
    .line 430
    invoke-virtual {v2, v1, v13}, Lgo0;->O(IZ)Z

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    if-eqz v1, :cond_f

    .line 435
    .line 436
    const v1, 0x790b01f9

    .line 437
    .line 438
    .line 439
    invoke-static {v1, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v14

    .line 443
    sget-object v1, Lsq1;->a:Lsq1;

    .line 444
    .line 445
    const-string v1, "nuke/scripts"

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v11}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    if-eqz v3, :cond_e

    .line 455
    .line 456
    invoke-static {v3, v1}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    goto :goto_8

    .line 461
    :cond_e
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    invoke-static {v0, v1}, Lwi0;->g0(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    :goto_8
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v16

    .line 476
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    const/16 v24, 0x0

    .line 480
    .line 481
    const/16 v25, 0x1fa

    .line 482
    .line 483
    const/4 v15, 0x0

    .line 484
    const/16 v17, 0x0

    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    const/16 v19, 0x0

    .line 489
    .line 490
    const/16 v20, 0x0

    .line 491
    .line 492
    const/16 v21, 0x0

    .line 493
    .line 494
    const/16 v22, 0x0

    .line 495
    .line 496
    move-object/from16 v23, v2

    .line 497
    .line 498
    invoke-static/range {v14 .. v25}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 499
    .line 500
    .line 501
    goto :goto_9

    .line 502
    :cond_f
    move-object/from16 v23, v2

    .line 503
    .line 504
    invoke-virtual/range {v23 .. v23}, Lgo0;->R()V

    .line 505
    .line 506
    .line 507
    :goto_9
    sget-object v0, La83;->a:La83;

    .line 508
    .line 509
    return-object v0

    .line 510
    :pswitch_8
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v0, Lub2;

    .line 513
    .line 514
    move-object/from16 v2, p1

    .line 515
    .line 516
    check-cast v2, Ljava/lang/Integer;

    .line 517
    .line 518
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    check-cast v1, Ly10;

    .line 523
    .line 524
    invoke-interface {v1}, Ly10;->getKey()Lz10;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    iget-object v0, v0, Lub2;->l:La20;

    .line 529
    .line 530
    invoke-interface {v0, v3}, La20;->o(Lz10;)Ly10;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    sget-object v4, Lsn;->K:Lsn;

    .line 535
    .line 536
    if-eq v3, v4, :cond_11

    .line 537
    .line 538
    if-eq v1, v0, :cond_10

    .line 539
    .line 540
    const/high16 v2, -0x80000000

    .line 541
    .line 542
    goto :goto_d

    .line 543
    :cond_10
    add-int/lit8 v2, v2, 0x1

    .line 544
    .line 545
    goto :goto_d

    .line 546
    :cond_11
    move-object v3, v0

    .line 547
    check-cast v3, Lk21;

    .line 548
    .line 549
    check-cast v1, Lk21;

    .line 550
    .line 551
    :goto_a
    if-nez v1, :cond_12

    .line 552
    .line 553
    goto :goto_c

    .line 554
    :cond_12
    if-ne v1, v3, :cond_13

    .line 555
    .line 556
    goto :goto_b

    .line 557
    :cond_13
    instance-of v0, v1, Lhd2;

    .line 558
    .line 559
    if-nez v0, :cond_15

    .line 560
    .line 561
    :goto_b
    move-object v11, v1

    .line 562
    :goto_c
    if-ne v11, v3, :cond_14

    .line 563
    .line 564
    if-nez v3, :cond_10

    .line 565
    .line 566
    :goto_d
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    return-object v0

    .line 571
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 572
    .line 573
    new-instance v1, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    const-string v2, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 576
    .line 577
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    const-string v2, ", expected child of "

    .line 584
    .line 585
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    const-string v2, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 592
    .line 593
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    throw v0

    .line 608
    :cond_15
    check-cast v1, Lhd2;

    .line 609
    .line 610
    sget-object v0, Lr21;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 611
    .line 612
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    check-cast v0, Lms;

    .line 617
    .line 618
    if-eqz v0, :cond_16

    .line 619
    .line 620
    invoke-interface {v0}, Lms;->getParent()Lk21;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    move-object v1, v0

    .line 625
    goto :goto_a

    .line 626
    :cond_16
    move-object v1, v11

    .line 627
    goto :goto_a

    .line 628
    :pswitch_9
    const-wide/16 v16, 0x80

    .line 629
    .line 630
    const-wide/16 v18, 0xff

    .line 631
    .line 632
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v0, Li62;

    .line 640
    .line 641
    move-object/from16 v2, p1

    .line 642
    .line 643
    check-cast v2, Ljava/util/Set;

    .line 644
    .line 645
    check-cast v1, Lvr2;

    .line 646
    .line 647
    iget-object v1, v0, Li62;->c:Ljava/lang/Object;

    .line 648
    .line 649
    monitor-enter v1

    .line 650
    :try_start_1
    iget-object v3, v0, Li62;->u:Lju2;

    .line 651
    .line 652
    invoke-virtual {v3}, Lju2;->getValue()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    check-cast v3, Lf62;

    .line 657
    .line 658
    sget-object v4, Lf62;->l:Lf62;

    .line 659
    .line 660
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    if-ltz v3, :cond_1e

    .line 665
    .line 666
    iget-object v3, v0, Li62;->h:Lsk1;

    .line 667
    .line 668
    instance-of v4, v2, Lgd2;

    .line 669
    .line 670
    if-eqz v4, :cond_1b

    .line 671
    .line 672
    check-cast v2, Lgd2;

    .line 673
    .line 674
    iget-object v2, v2, Lgd2;->h:Lsk1;

    .line 675
    .line 676
    iget-object v4, v2, Lsk1;->b:[Ljava/lang/Object;

    .line 677
    .line 678
    iget-object v2, v2, Lsk1;->a:[J

    .line 679
    .line 680
    array-length v5, v2

    .line 681
    sub-int/2addr v5, v12

    .line 682
    if-ltz v5, :cond_1d

    .line 683
    .line 684
    move v6, v13

    .line 685
    :goto_e
    aget-wide v9, v2, v6

    .line 686
    .line 687
    not-long v11, v9

    .line 688
    shl-long/2addr v11, v7

    .line 689
    and-long/2addr v11, v9

    .line 690
    and-long v11, v11, v20

    .line 691
    .line 692
    cmp-long v11, v11, v20

    .line 693
    .line 694
    if-eqz v11, :cond_1a

    .line 695
    .line 696
    sub-int v11, v6, v5

    .line 697
    .line 698
    not-int v11, v11

    .line 699
    ushr-int/lit8 v11, v11, 0x1f

    .line 700
    .line 701
    rsub-int/lit8 v11, v11, 0x8

    .line 702
    .line 703
    move v12, v13

    .line 704
    :goto_f
    if-ge v12, v11, :cond_19

    .line 705
    .line 706
    and-long v22, v9, v18

    .line 707
    .line 708
    cmp-long v15, v22, v16

    .line 709
    .line 710
    if-gez v15, :cond_18

    .line 711
    .line 712
    shl-int/lit8 v15, v6, 0x3

    .line 713
    .line 714
    add-int/2addr v15, v12

    .line 715
    aget-object v15, v4, v15

    .line 716
    .line 717
    move/from16 v22, v7

    .line 718
    .line 719
    instance-of v7, v15, Lqu2;

    .line 720
    .line 721
    if-eqz v7, :cond_17

    .line 722
    .line 723
    move-object v7, v15

    .line 724
    check-cast v7, Lqu2;

    .line 725
    .line 726
    invoke-virtual {v7, v14}, Lqu2;->e(I)Z

    .line 727
    .line 728
    .line 729
    move-result v7

    .line 730
    if-nez v7, :cond_17

    .line 731
    .line 732
    goto :goto_10

    .line 733
    :catchall_1
    move-exception v0

    .line 734
    goto :goto_13

    .line 735
    :cond_17
    invoke-virtual {v3, v15}, Lsk1;->a(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    goto :goto_10

    .line 739
    :cond_18
    move/from16 v22, v7

    .line 740
    .line 741
    :goto_10
    shr-long/2addr v9, v8

    .line 742
    add-int/lit8 v12, v12, 0x1

    .line 743
    .line 744
    move/from16 v7, v22

    .line 745
    .line 746
    goto :goto_f

    .line 747
    :cond_19
    move/from16 v22, v7

    .line 748
    .line 749
    if-ne v11, v8, :cond_1d

    .line 750
    .line 751
    goto :goto_11

    .line 752
    :cond_1a
    move/from16 v22, v7

    .line 753
    .line 754
    :goto_11
    if-eq v6, v5, :cond_1d

    .line 755
    .line 756
    add-int/lit8 v6, v6, 0x1

    .line 757
    .line 758
    move/from16 v7, v22

    .line 759
    .line 760
    goto :goto_e

    .line 761
    :cond_1b
    check-cast v2, Ljava/lang/Iterable;

    .line 762
    .line 763
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 768
    .line 769
    .line 770
    move-result v4

    .line 771
    if-eqz v4, :cond_1d

    .line 772
    .line 773
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v4

    .line 777
    instance-of v5, v4, Lqu2;

    .line 778
    .line 779
    if-eqz v5, :cond_1c

    .line 780
    .line 781
    move-object v5, v4

    .line 782
    check-cast v5, Lqu2;

    .line 783
    .line 784
    invoke-virtual {v5, v14}, Lqu2;->e(I)Z

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    if-nez v5, :cond_1c

    .line 789
    .line 790
    goto :goto_12

    .line 791
    :cond_1c
    invoke-virtual {v3, v4}, Lsk1;->a(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    goto :goto_12

    .line 795
    :cond_1d
    invoke-virtual {v0}, Li62;->y()Llp;

    .line 796
    .line 797
    .line 798
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 799
    :cond_1e
    monitor-exit v1

    .line 800
    if-eqz v11, :cond_1f

    .line 801
    .line 802
    sget-object v0, La83;->a:La83;

    .line 803
    .line 804
    check-cast v11, Lmp;

    .line 805
    .line 806
    invoke-virtual {v11, v0}, Lmp;->h(Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    :cond_1f
    sget-object v0, La83;->a:La83;

    .line 810
    .line 811
    return-object v0

    .line 812
    :goto_13
    monitor-exit v1

    .line 813
    throw v0

    .line 814
    :pswitch_a
    move/from16 v22, v7

    .line 815
    .line 816
    const-wide/16 v16, 0x80

    .line 817
    .line 818
    const-wide/16 v18, 0xff

    .line 819
    .line 820
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v0, Lqj1;

    .line 828
    .line 829
    move-object/from16 v2, p1

    .line 830
    .line 831
    check-cast v2, Ljava/util/Set;

    .line 832
    .line 833
    check-cast v1, Lvr2;

    .line 834
    .line 835
    iget-object v1, v0, Lsj;->h:Ljava/lang/Object;

    .line 836
    .line 837
    monitor-enter v1

    .line 838
    :try_start_2
    iget-object v3, v0, Lqj1;->i:Lrk1;

    .line 839
    .line 840
    new-instance v4, Ld2;

    .line 841
    .line 842
    const/16 v5, 0x16

    .line 843
    .line 844
    invoke-direct {v4, v5, v2, v0}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    invoke-static {v14, v4}, Lxe1;->f(ILjava/lang/Object;)V

    .line 848
    .line 849
    .line 850
    iget-object v2, v3, Lrk1;->b:[Ljava/lang/Object;

    .line 851
    .line 852
    iget-object v3, v3, Lrk1;->a:[J

    .line 853
    .line 854
    array-length v5, v3

    .line 855
    sub-int/2addr v5, v12

    .line 856
    if-ltz v5, :cond_23

    .line 857
    .line 858
    move v6, v13

    .line 859
    :goto_14
    aget-wide v9, v3, v6

    .line 860
    .line 861
    not-long v14, v9

    .line 862
    shl-long v14, v14, v22

    .line 863
    .line 864
    and-long/2addr v14, v9

    .line 865
    and-long v14, v14, v20

    .line 866
    .line 867
    cmp-long v7, v14, v20

    .line 868
    .line 869
    if-eqz v7, :cond_22

    .line 870
    .line 871
    sub-int v7, v6, v5

    .line 872
    .line 873
    not-int v7, v7

    .line 874
    ushr-int/lit8 v7, v7, 0x1f

    .line 875
    .line 876
    rsub-int/lit8 v7, v7, 0x8

    .line 877
    .line 878
    move v11, v13

    .line 879
    :goto_15
    if-ge v11, v7, :cond_21

    .line 880
    .line 881
    and-long v14, v9, v18

    .line 882
    .line 883
    cmp-long v14, v14, v16

    .line 884
    .line 885
    if-gez v14, :cond_20

    .line 886
    .line 887
    shl-int/lit8 v14, v6, 0x3

    .line 888
    .line 889
    add-int/2addr v14, v11

    .line 890
    aget-object v14, v2, v14

    .line 891
    .line 892
    invoke-virtual {v4, v14}, Ld2;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    :cond_20
    shr-long/2addr v9, v8

    .line 896
    add-int/lit8 v11, v11, 0x1

    .line 897
    .line 898
    goto :goto_15

    .line 899
    :cond_21
    if-ne v7, v8, :cond_23

    .line 900
    .line 901
    :cond_22
    if-eq v6, v5, :cond_23

    .line 902
    .line 903
    add-int/lit8 v6, v6, 0x1

    .line 904
    .line 905
    goto :goto_14

    .line 906
    :cond_23
    iget-object v2, v0, Lqj1;->k:Lsk1;

    .line 907
    .line 908
    iget-object v3, v2, Lsk1;->b:[Ljava/lang/Object;

    .line 909
    .line 910
    iget-object v2, v2, Lsk1;->a:[J

    .line 911
    .line 912
    array-length v4, v2

    .line 913
    sub-int/2addr v4, v12

    .line 914
    if-ltz v4, :cond_27

    .line 915
    .line 916
    move v5, v13

    .line 917
    :goto_16
    aget-wide v6, v2, v5

    .line 918
    .line 919
    not-long v9, v6

    .line 920
    shl-long v9, v9, v22

    .line 921
    .line 922
    and-long/2addr v9, v6

    .line 923
    and-long v9, v9, v20

    .line 924
    .line 925
    cmp-long v9, v9, v20

    .line 926
    .line 927
    if-eqz v9, :cond_26

    .line 928
    .line 929
    sub-int v9, v5, v4

    .line 930
    .line 931
    not-int v9, v9

    .line 932
    ushr-int/lit8 v9, v9, 0x1f

    .line 933
    .line 934
    rsub-int/lit8 v9, v9, 0x8

    .line 935
    .line 936
    move v10, v13

    .line 937
    :goto_17
    if-ge v10, v9, :cond_25

    .line 938
    .line 939
    and-long v11, v6, v18

    .line 940
    .line 941
    cmp-long v11, v11, v16

    .line 942
    .line 943
    if-gez v11, :cond_24

    .line 944
    .line 945
    shl-int/lit8 v11, v5, 0x3

    .line 946
    .line 947
    add-int/2addr v11, v10

    .line 948
    aget-object v11, v3, v11

    .line 949
    .line 950
    check-cast v11, Lho2;

    .line 951
    .line 952
    sget-object v12, La83;->a:La83;

    .line 953
    .line 954
    invoke-interface {v11, v12}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    goto :goto_18

    .line 958
    :catchall_2
    move-exception v0

    .line 959
    goto :goto_19

    .line 960
    :cond_24
    :goto_18
    shr-long/2addr v6, v8

    .line 961
    add-int/lit8 v10, v10, 0x1

    .line 962
    .line 963
    goto :goto_17

    .line 964
    :cond_25
    if-ne v9, v8, :cond_27

    .line 965
    .line 966
    :cond_26
    if-eq v5, v4, :cond_27

    .line 967
    .line 968
    add-int/lit8 v5, v5, 0x1

    .line 969
    .line 970
    goto :goto_16

    .line 971
    :cond_27
    iget-object v0, v0, Lqj1;->k:Lsk1;

    .line 972
    .line 973
    invoke-virtual {v0}, Lsk1;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 974
    .line 975
    .line 976
    monitor-exit v1

    .line 977
    sget-object v0, La83;->a:La83;

    .line 978
    .line 979
    return-object v0

    .line 980
    :goto_19
    monitor-exit v1

    .line 981
    throw v0

    .line 982
    :pswitch_b
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v0, Lxk1;

    .line 985
    .line 986
    move-object/from16 v2, p1

    .line 987
    .line 988
    check-cast v2, Lpx;

    .line 989
    .line 990
    check-cast v1, Ljava/lang/Integer;

    .line 991
    .line 992
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 993
    .line 994
    .line 995
    move-result v1

    .line 996
    and-int/lit8 v3, v1, 0x3

    .line 997
    .line 998
    if-eq v3, v12, :cond_28

    .line 999
    .line 1000
    move v13, v14

    .line 1001
    :cond_28
    and-int/2addr v1, v14

    .line 1002
    move-object v8, v2

    .line 1003
    check-cast v8, Lgo0;

    .line 1004
    .line 1005
    invoke-virtual {v8, v1, v13}, Lgo0;->O(IZ)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v1

    .line 1009
    if-eqz v1, :cond_2b

    .line 1010
    .line 1011
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v1

    .line 1015
    check-cast v1, Ljava/lang/Boolean;

    .line 1016
    .line 1017
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    invoke-virtual {v8, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v1

    .line 1025
    invoke-virtual {v8}, Lgo0;->L()Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    if-nez v1, :cond_29

    .line 1030
    .line 1031
    sget-object v1, Lnx;->a:Leb;

    .line 1032
    .line 1033
    if-ne v2, v1, :cond_2a

    .line 1034
    .line 1035
    :cond_29
    new-instance v2, Lpr;

    .line 1036
    .line 1037
    const/16 v1, 0xc

    .line 1038
    .line 1039
    invoke-direct {v2, v0, v1}, Lpr;-><init>(Lxk1;I)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v8, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1043
    .line 1044
    .line 1045
    :cond_2a
    move-object v4, v2

    .line 1046
    check-cast v4, Lin0;

    .line 1047
    .line 1048
    const/4 v9, 0x0

    .line 1049
    const/16 v10, 0x3c

    .line 1050
    .line 1051
    const/4 v5, 0x0

    .line 1052
    const/4 v6, 0x0

    .line 1053
    const/4 v7, 0x0

    .line 1054
    invoke-static/range {v3 .. v10}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 1055
    .line 1056
    .line 1057
    goto :goto_1a

    .line 1058
    :cond_2b
    invoke-virtual {v8}, Lgo0;->R()V

    .line 1059
    .line 1060
    .line 1061
    :goto_1a
    sget-object v0, La83;->a:La83;

    .line 1062
    .line 1063
    return-object v0

    .line 1064
    :pswitch_c
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1065
    .line 1066
    check-cast v0, Lkz2;

    .line 1067
    .line 1068
    move-object/from16 v2, p1

    .line 1069
    .line 1070
    check-cast v2, Lo12;

    .line 1071
    .line 1072
    check-cast v1, Lrs1;

    .line 1073
    .line 1074
    iget-wide v1, v1, Lrs1;->a:J

    .line 1075
    .line 1076
    invoke-interface {v0, v1, v2}, Lkz2;->e(J)V

    .line 1077
    .line 1078
    .line 1079
    sget-object v0, La83;->a:La83;

    .line 1080
    .line 1081
    return-object v0

    .line 1082
    :pswitch_d
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1083
    .line 1084
    check-cast v0, Lcz0;

    .line 1085
    .line 1086
    move-object/from16 v2, p1

    .line 1087
    .line 1088
    check-cast v2, Lpx;

    .line 1089
    .line 1090
    check-cast v1, Ljava/lang/Integer;

    .line 1091
    .line 1092
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v14}, Lpp0;->N(I)I

    .line 1096
    .line 1097
    .line 1098
    move-result v1

    .line 1099
    invoke-virtual {v0, v1, v2}, Lcz0;->a(ILpx;)V

    .line 1100
    .line 1101
    .line 1102
    sget-object v0, La83;->a:La83;

    .line 1103
    .line 1104
    return-object v0

    .line 1105
    :pswitch_e
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1106
    .line 1107
    check-cast v0, Lyp2;

    .line 1108
    .line 1109
    move-object/from16 v2, p1

    .line 1110
    .line 1111
    check-cast v2, Lpx;

    .line 1112
    .line 1113
    check-cast v1, Ljava/lang/Integer;

    .line 1114
    .line 1115
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1116
    .line 1117
    .line 1118
    move-result v1

    .line 1119
    and-int/lit8 v3, v1, 0x3

    .line 1120
    .line 1121
    if-eq v3, v12, :cond_2c

    .line 1122
    .line 1123
    move v3, v14

    .line 1124
    goto :goto_1b

    .line 1125
    :cond_2c
    move v3, v13

    .line 1126
    :goto_1b
    and-int/2addr v1, v14

    .line 1127
    move-object v8, v2

    .line 1128
    check-cast v8, Lgo0;

    .line 1129
    .line 1130
    invoke-virtual {v8, v1, v3}, Lgo0;->O(IZ)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v1

    .line 1134
    if-eqz v1, :cond_2e

    .line 1135
    .line 1136
    iget-object v4, v0, Lyp2;->b:Lsx0;

    .line 1137
    .line 1138
    iget-boolean v0, v0, Lyp2;->e:Z

    .line 1139
    .line 1140
    if-eqz v0, :cond_2d

    .line 1141
    .line 1142
    const v0, -0x76fb02bd

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v8, v0}, Lgo0;->W(I)V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v8, v13}, Lgo0;->p(Z)V

    .line 1149
    .line 1150
    .line 1151
    const-wide v0, 0xffdc2626L

    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    invoke-static {v0, v1}, Lsp0;->c(J)J

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v0

    .line 1160
    :goto_1c
    move-wide v6, v0

    .line 1161
    goto :goto_1d

    .line 1162
    :cond_2d
    const v0, -0x76fafdc8

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v8, v0}, Lgo0;->W(I)V

    .line 1166
    .line 1167
    .line 1168
    sget-object v0, Lur1;->a:Ltu2;

    .line 1169
    .line 1170
    invoke-virtual {v8, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    check-cast v0, Llp1;

    .line 1175
    .line 1176
    iget-wide v0, v0, Llp1;->g:J

    .line 1177
    .line 1178
    invoke-virtual {v8, v13}, Lgo0;->p(Z)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_1c

    .line 1182
    :goto_1d
    const/4 v9, 0x0

    .line 1183
    const/4 v10, 0x2

    .line 1184
    const/4 v5, 0x0

    .line 1185
    invoke-static/range {v4 .. v10}, Lci0;->l(Lsx0;Luh1;JLpx;II)V

    .line 1186
    .line 1187
    .line 1188
    goto :goto_1e

    .line 1189
    :cond_2e
    invoke-virtual {v8}, Lgo0;->R()V

    .line 1190
    .line 1191
    .line 1192
    :goto_1e
    sget-object v0, La83;->a:La83;

    .line 1193
    .line 1194
    return-object v0

    .line 1195
    :pswitch_f
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, Lnuke/ui/HomeActivity;

    .line 1198
    .line 1199
    move-object/from16 v2, p1

    .line 1200
    .line 1201
    check-cast v2, Lpx;

    .line 1202
    .line 1203
    check-cast v1, Ljava/lang/Integer;

    .line 1204
    .line 1205
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    invoke-static {v0, v2, v1}, Lnuke/ui/HomeActivity;->g(Lnuke/ui/HomeActivity;Lpx;I)La83;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    return-object v0

    .line 1214
    :pswitch_10
    move-object/from16 v0, p1

    .line 1215
    .line 1216
    check-cast v0, Lpx;

    .line 1217
    .line 1218
    check-cast v1, Ljava/lang/Integer;

    .line 1219
    .line 1220
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1221
    .line 1222
    .line 1223
    move-result v1

    .line 1224
    and-int/lit8 v2, v1, 0x3

    .line 1225
    .line 1226
    if-eq v2, v12, :cond_2f

    .line 1227
    .line 1228
    move v13, v14

    .line 1229
    :cond_2f
    and-int/2addr v1, v14

    .line 1230
    check-cast v0, Lgo0;

    .line 1231
    .line 1232
    invoke-virtual {v0, v1, v13}, Lgo0;->O(IZ)Z

    .line 1233
    .line 1234
    .line 1235
    move-result v1

    .line 1236
    if-nez v1, :cond_30

    .line 1237
    .line 1238
    invoke-virtual {v0}, Lgo0;->R()V

    .line 1239
    .line 1240
    .line 1241
    sget-object v0, La83;->a:La83;

    .line 1242
    .line 1243
    return-object v0

    .line 1244
    :cond_30
    throw v11

    .line 1245
    :pswitch_11
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1246
    .line 1247
    check-cast v0, Lxy2;

    .line 1248
    .line 1249
    move-object/from16 v2, p1

    .line 1250
    .line 1251
    check-cast v2, Lpx;

    .line 1252
    .line 1253
    check-cast v1, Ljava/lang/Integer;

    .line 1254
    .line 1255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    check-cast v2, Lgo0;

    .line 1259
    .line 1260
    const v1, 0x27b3a34e

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v2, v1}, Lgo0;->W(I)V

    .line 1264
    .line 1265
    .line 1266
    iget-object v0, v0, Lxy2;->b:Ljava/lang/String;

    .line 1267
    .line 1268
    invoke-virtual {v2, v13}, Lgo0;->p(Z)V

    .line 1269
    .line 1270
    .line 1271
    return-object v0

    .line 1272
    :pswitch_12
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1273
    .line 1274
    check-cast v0, Lb03;

    .line 1275
    .line 1276
    move-object/from16 v2, p1

    .line 1277
    .line 1278
    check-cast v2, Lpx;

    .line 1279
    .line 1280
    check-cast v1, Ljava/lang/Integer;

    .line 1281
    .line 1282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1283
    .line 1284
    .line 1285
    invoke-static {v14}, Lpp0;->N(I)I

    .line 1286
    .line 1287
    .line 1288
    move-result v1

    .line 1289
    invoke-static {v0, v2, v1}, Lgf1;->d(Lb03;Lpx;I)V

    .line 1290
    .line 1291
    .line 1292
    sget-object v0, La83;->a:La83;

    .line 1293
    .line 1294
    return-object v0

    .line 1295
    :pswitch_13
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1296
    .line 1297
    check-cast v0, Lz72;

    .line 1298
    .line 1299
    move-object/from16 v2, p1

    .line 1300
    .line 1301
    check-cast v2, Ljava/lang/Integer;

    .line 1302
    .line 1303
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    instance-of v2, v1, Luw;

    .line 1307
    .line 1308
    if-eqz v2, :cond_32

    .line 1309
    .line 1310
    move-object v2, v1

    .line 1311
    check-cast v2, Luw;

    .line 1312
    .line 1313
    iget-object v3, v0, Lz72;->h:Lsk1;

    .line 1314
    .line 1315
    if-nez v3, :cond_31

    .line 1316
    .line 1317
    sget-object v3, Lfd2;->a:Lsk1;

    .line 1318
    .line 1319
    new-instance v3, Lsk1;

    .line 1320
    .line 1321
    invoke-direct {v3}, Lsk1;-><init>()V

    .line 1322
    .line 1323
    .line 1324
    iput-object v3, v0, Lz72;->h:Lsk1;

    .line 1325
    .line 1326
    :cond_31
    invoke-virtual {v3, v2}, Lsk1;->k(Ljava/lang/Object;)V

    .line 1327
    .line 1328
    .line 1329
    iget-object v3, v0, Lz72;->f:Lzk1;

    .line 1330
    .line 1331
    invoke-virtual {v3, v2}, Lzk1;->b(Ljava/lang/Object;)V

    .line 1332
    .line 1333
    .line 1334
    :cond_32
    instance-of v2, v1, Llo0;

    .line 1335
    .line 1336
    if-eqz v2, :cond_33

    .line 1337
    .line 1338
    move-object v2, v1

    .line 1339
    check-cast v2, Llo0;

    .line 1340
    .line 1341
    invoke-virtual {v0, v2}, Lz72;->e(Llo0;)V

    .line 1342
    .line 1343
    .line 1344
    :cond_33
    instance-of v0, v1, Lb62;

    .line 1345
    .line 1346
    if-eqz v0, :cond_34

    .line 1347
    .line 1348
    move-object v0, v1

    .line 1349
    check-cast v0, Lb62;

    .line 1350
    .line 1351
    invoke-virtual {v0}, Lb62;->c()V

    .line 1352
    .line 1353
    .line 1354
    :cond_34
    sget-object v0, La83;->a:La83;

    .line 1355
    .line 1356
    return-object v0

    .line 1357
    :pswitch_14
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1358
    .line 1359
    check-cast v0, Lg33;

    .line 1360
    .line 1361
    move-object/from16 v2, p1

    .line 1362
    .line 1363
    check-cast v2, Lpx;

    .line 1364
    .line 1365
    check-cast v1, Ljava/lang/Integer;

    .line 1366
    .line 1367
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    invoke-static {v14}, Lpp0;->N(I)I

    .line 1371
    .line 1372
    .line 1373
    move-result v1

    .line 1374
    invoke-static {v0, v2, v1}, Lt11;->e(Lg33;Lpx;I)V

    .line 1375
    .line 1376
    .line 1377
    sget-object v0, La83;->a:La83;

    .line 1378
    .line 1379
    return-object v0

    .line 1380
    :pswitch_15
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1381
    .line 1382
    check-cast v0, Ls62;

    .line 1383
    .line 1384
    move-object/from16 v2, p1

    .line 1385
    .line 1386
    check-cast v2, Lpx;

    .line 1387
    .line 1388
    check-cast v1, Ljava/lang/Integer;

    .line 1389
    .line 1390
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1391
    .line 1392
    .line 1393
    invoke-static {v14}, Lpp0;->N(I)I

    .line 1394
    .line 1395
    .line 1396
    move-result v1

    .line 1397
    invoke-static {v0, v2, v1}, Ls11;->o(Ls62;Lpx;I)V

    .line 1398
    .line 1399
    .line 1400
    sget-object v0, La83;->a:La83;

    .line 1401
    .line 1402
    return-object v0

    .line 1403
    :pswitch_16
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v0, Lju;

    .line 1406
    .line 1407
    move-object/from16 v2, p1

    .line 1408
    .line 1409
    check-cast v2, Lpx;

    .line 1410
    .line 1411
    check-cast v1, Ljava/lang/Integer;

    .line 1412
    .line 1413
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1414
    .line 1415
    .line 1416
    move-result v1

    .line 1417
    and-int/lit8 v3, v1, 0x3

    .line 1418
    .line 1419
    if-eq v3, v12, :cond_35

    .line 1420
    .line 1421
    move v13, v14

    .line 1422
    :cond_35
    and-int/2addr v1, v14

    .line 1423
    move-object v6, v2

    .line 1424
    check-cast v6, Lgo0;

    .line 1425
    .line 1426
    invoke-virtual {v6, v1, v13}, Lgo0;->O(IZ)Z

    .line 1427
    .line 1428
    .line 1429
    move-result v1

    .line 1430
    if-eqz v1, :cond_36

    .line 1431
    .line 1432
    const/16 v7, 0xc00

    .line 1433
    .line 1434
    const/16 v8, 0x16

    .line 1435
    .line 1436
    const/4 v2, 0x0

    .line 1437
    const/4 v3, 0x0

    .line 1438
    const/high16 v4, 0x42080000    # 34.0f

    .line 1439
    .line 1440
    const/4 v5, 0x0

    .line 1441
    move-object v1, v0

    .line 1442
    invoke-static/range {v1 .. v8}, Lgf1;->h(Lju;Luh1;ZFLxm0;Lpx;II)V

    .line 1443
    .line 1444
    .line 1445
    goto :goto_1f

    .line 1446
    :cond_36
    invoke-virtual {v6}, Lgo0;->R()V

    .line 1447
    .line 1448
    .line 1449
    :goto_1f
    sget-object v0, La83;->a:La83;

    .line 1450
    .line 1451
    return-object v0

    .line 1452
    :pswitch_17
    iget-object v0, v0, Ls9;->i:Ljava/lang/Object;

    .line 1453
    .line 1454
    check-cast v0, Lum2;

    .line 1455
    .line 1456
    move-object/from16 v2, p1

    .line 1457
    .line 1458
    check-cast v2, Landroid/graphics/RectF;

    .line 1459
    .line 1460
    check-cast v1, Landroid/graphics/RectF;

    .line 1461
    .line 1462
    invoke-static {v2}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v2

    .line 1466
    invoke-static {v1}, Lrp0;->p0(Landroid/graphics/RectF;)Lo62;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v1

    .line 1470
    iget v0, v0, Lum2;->h:I

    .line 1471
    .line 1472
    packed-switch v0, :pswitch_data_1

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v2}, Lo62;->b()J

    .line 1476
    .line 1477
    .line 1478
    move-result-wide v2

    .line 1479
    invoke-virtual {v1, v2, v3}, Lo62;->a(J)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v0

    .line 1483
    goto :goto_20

    .line 1484
    :pswitch_18
    invoke-virtual {v2, v1}, Lo62;->g(Lo62;)Z

    .line 1485
    .line 1486
    .line 1487
    move-result v0

    .line 1488
    :goto_20
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    return-object v0

    .line 1493
    :pswitch_data_0
    .packed-switch 0x0
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

    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_18
    .end packed-switch
.end method
