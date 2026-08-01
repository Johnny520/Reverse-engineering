.class public final synthetic Lw0;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lw0;->ε:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw0;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcn1;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lcn1;->γ:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Lfb0;

    .line 18
    .line 19
    const/16 v2, 0x11

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lfb0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    sget-object v0, Ls62;->α:Ls62;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ld51;

    .line 33
    .line 34
    invoke-virtual {v0}, Ld51;->γ()V

    .line 35
    .line 36
    .line 37
    sget-object v0, Ls62;->α:Ls62;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_1
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ld51;

    .line 43
    .line 44
    invoke-virtual {v0}, Ld51;->γ()V

    .line 45
    .line 46
    .line 47
    sget-object v0, Ls62;->α:Ls62;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_2
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lf01;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v0, Lf01;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    sget-object v0, Lf01;->δ:Landroid/os/Handler;

    .line 69
    .line 70
    new-instance v1, Lfb0;

    .line 71
    .line 72
    const/16 v2, 0xb

    .line 73
    .line 74
    invoke-direct {v1, v2}, Lfb0;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 78
    .line 79
    .line 80
    :goto_0
    sget-object v0, Ls62;->α:Ls62;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_3
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lyz0;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    sget-object v0, Lyz0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    const/4 v2, 0x0

    .line 94
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    sget-object v1, Lyz0;->γ:Landroid/os/Handler;

    .line 102
    .line 103
    new-instance v3, Lfb0;

    .line 104
    .line 105
    const/16 v4, 0x8

    .line 106
    .line 107
    invoke-direct {v3, v4}, Lfb0;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_2

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 117
    .line 118
    .line 119
    :cond_2
    :goto_1
    sget-object v0, Ls62;->α:Ls62;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_4
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lht0;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {}, Lui1;->Α()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_3

    .line 134
    .line 135
    const/high16 v0, 0x3f800000    # 1.0f

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    const-string v0, "liquid_glass_bottom_bar_scale_percent"

    .line 139
    .line 140
    const/16 v1, 0x64

    .line 141
    .line 142
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 147
    .line 148
    .line 149
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    :catchall_0
    const/16 v0, 0x32

    .line 151
    .line 152
    const/16 v2, 0x96

    .line 153
    .line 154
    invoke-static {v1, v0, v2}, Lj81;->μ(III)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    int-to-float v0, v0

    .line 159
    const/high16 v1, 0x42c80000    # 100.0f

    .line 160
    .line 161
    div-float/2addr v0, v1

    .line 162
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0

    .line 167
    :pswitch_5
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lht0;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {}, Lht0;->δ()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_6
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Ls40;

    .line 186
    .line 187
    iget-object v1, v0, Ls40;->γ:Lc21;

    .line 188
    .line 189
    iget-object v2, v0, Ls40;->δ:Lc21;

    .line 190
    .line 191
    iget-object v3, v0, Ls40;->α:Ly40;

    .line 192
    .line 193
    invoke-virtual {v3}, Ly40;->ζ()Lc50;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    const/4 v12, 0x0

    .line 198
    const/16 v13, 0x8

    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    if-nez v4, :cond_7

    .line 202
    .line 203
    iget-object v4, v2, Lc21;->β:[Ljava/lang/Object;

    .line 204
    .line 205
    iget-object v15, v2, Lc21;->α:[J

    .line 206
    .line 207
    const-wide/16 v16, 0x80

    .line 208
    .line 209
    array-length v5, v15

    .line 210
    add-int/lit8 v5, v5, -0x2

    .line 211
    .line 212
    if-ltz v5, :cond_14

    .line 213
    .line 214
    move v6, v14

    .line 215
    const-wide/16 v18, 0xff

    .line 216
    .line 217
    :goto_3
    aget-wide v7, v15, v6

    .line 218
    .line 219
    const/16 p0, 0x7

    .line 220
    .line 221
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    not-long v9, v7

    .line 227
    shl-long v9, v9, p0

    .line 228
    .line 229
    and-long/2addr v9, v7

    .line 230
    and-long v9, v9, v20

    .line 231
    .line 232
    cmp-long v9, v9, v20

    .line 233
    .line 234
    if-eqz v9, :cond_6

    .line 235
    .line 236
    sub-int v9, v6, v5

    .line 237
    .line 238
    not-int v9, v9

    .line 239
    ushr-int/lit8 v9, v9, 0x1f

    .line 240
    .line 241
    rsub-int/lit8 v9, v9, 0x8

    .line 242
    .line 243
    move v10, v14

    .line 244
    :goto_4
    if-ge v10, v9, :cond_5

    .line 245
    .line 246
    and-long v22, v7, v18

    .line 247
    .line 248
    cmp-long v11, v22, v16

    .line 249
    .line 250
    if-ltz v11, :cond_4

    .line 251
    .line 252
    shr-long/2addr v7, v13

    .line 253
    add-int/lit8 v10, v10, 0x1

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_4
    shl-int/lit8 v0, v6, 0x3

    .line 257
    .line 258
    add-int/2addr v0, v10

    .line 259
    aget-object v0, v4, v0

    .line 260
    .line 261
    check-cast v0, Lp8;

    .line 262
    .line 263
    invoke-virtual {v0}, Lp8;->Г()V

    .line 264
    .line 265
    .line 266
    throw v12

    .line 267
    :cond_5
    if-ne v9, v13, :cond_14

    .line 268
    .line 269
    :cond_6
    if-eq v6, v5, :cond_14

    .line 270
    .line 271
    add-int/lit8 v6, v6, 0x1

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_7
    const/16 p0, 0x7

    .line 275
    .line 276
    const-wide/16 v16, 0x80

    .line 277
    .line 278
    const-wide/16 v18, 0xff

    .line 279
    .line 280
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    iget-boolean v5, v4, Lq01;->σ:Z

    .line 286
    .line 287
    if-eqz v5, :cond_14

    .line 288
    .line 289
    invoke-virtual {v1, v4}, Lc21;->γ(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-eqz v5, :cond_8

    .line 294
    .line 295
    invoke-virtual {v4}, Lc50;->З()V

    .line 296
    .line 297
    .line 298
    :cond_8
    invoke-virtual {v4}, Lc50;->Ж()Lb50;

    .line 299
    .line 300
    .line 301
    iget-object v5, v4, Lq01;->ε:Lq01;

    .line 302
    .line 303
    iget-boolean v5, v5, Lq01;->σ:Z

    .line 304
    .line 305
    if-nez v5, :cond_9

    .line 306
    .line 307
    const-string v5, "visitAncestors called on an unattached node"

    .line 308
    .line 309
    invoke-static {v5}, Lam0;->β(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    :cond_9
    iget-object v5, v4, Lq01;->ε:Lq01;

    .line 313
    .line 314
    invoke-static {v4}, Lh62;->ц(Lur;)Lyp0;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    move v6, v14

    .line 319
    :goto_5
    if-eqz v4, :cond_10

    .line 320
    .line 321
    iget-object v7, v4, Lyp0;->Κ:Lk31;

    .line 322
    .line 323
    iget-object v7, v7, Lk31;->ζ:Lq01;

    .line 324
    .line 325
    iget v7, v7, Lq01;->θ:I

    .line 326
    .line 327
    and-int/lit16 v7, v7, 0x1400

    .line 328
    .line 329
    if-eqz v7, :cond_e

    .line 330
    .line 331
    :goto_6
    if-eqz v5, :cond_e

    .line 332
    .line 333
    iget v7, v5, Lq01;->η:I

    .line 334
    .line 335
    and-int/lit16 v8, v7, 0x1400

    .line 336
    .line 337
    if-eqz v8, :cond_d

    .line 338
    .line 339
    and-int/lit16 v7, v7, 0x400

    .line 340
    .line 341
    if-eqz v7, :cond_a

    .line 342
    .line 343
    add-int/lit8 v6, v6, 0x1

    .line 344
    .line 345
    :cond_a
    instance-of v7, v5, Lp8;

    .line 346
    .line 347
    if-eqz v7, :cond_d

    .line 348
    .line 349
    invoke-virtual {v2, v5}, Lc21;->γ(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    if-nez v7, :cond_b

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_b
    const/4 v0, 0x1

    .line 357
    if-gt v6, v0, :cond_c

    .line 358
    .line 359
    check-cast v5, Lp8;

    .line 360
    .line 361
    invoke-virtual {v5}, Lp8;->Г()V

    .line 362
    .line 363
    .line 364
    throw v12

    .line 365
    :cond_c
    check-cast v5, Lp8;

    .line 366
    .line 367
    invoke-virtual {v5}, Lp8;->Г()V

    .line 368
    .line 369
    .line 370
    throw v12

    .line 371
    :cond_d
    :goto_7
    iget-object v5, v5, Lq01;->ι:Lq01;

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_e
    invoke-virtual {v4}, Lyp0;->σ()Lyp0;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    if-eqz v4, :cond_f

    .line 379
    .line 380
    iget-object v5, v4, Lyp0;->Κ:Lk31;

    .line 381
    .line 382
    if-eqz v5, :cond_f

    .line 383
    .line 384
    iget-object v5, v5, Lk31;->ε:Lq22;

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_f
    move-object v5, v12

    .line 388
    goto :goto_5

    .line 389
    :cond_10
    iget-object v4, v2, Lc21;->β:[Ljava/lang/Object;

    .line 390
    .line 391
    iget-object v5, v2, Lc21;->α:[J

    .line 392
    .line 393
    array-length v6, v5

    .line 394
    add-int/lit8 v6, v6, -0x2

    .line 395
    .line 396
    if-ltz v6, :cond_14

    .line 397
    .line 398
    move v7, v14

    .line 399
    :goto_8
    aget-wide v8, v5, v7

    .line 400
    .line 401
    not-long v10, v8

    .line 402
    shl-long v10, v10, p0

    .line 403
    .line 404
    and-long/2addr v10, v8

    .line 405
    and-long v10, v10, v20

    .line 406
    .line 407
    cmp-long v10, v10, v20

    .line 408
    .line 409
    if-eqz v10, :cond_13

    .line 410
    .line 411
    sub-int v10, v7, v6

    .line 412
    .line 413
    not-int v10, v10

    .line 414
    ushr-int/lit8 v10, v10, 0x1f

    .line 415
    .line 416
    rsub-int/lit8 v10, v10, 0x8

    .line 417
    .line 418
    move v11, v14

    .line 419
    :goto_9
    if-ge v11, v10, :cond_12

    .line 420
    .line 421
    and-long v22, v8, v18

    .line 422
    .line 423
    cmp-long v15, v22, v16

    .line 424
    .line 425
    if-ltz v15, :cond_11

    .line 426
    .line 427
    shr-long/2addr v8, v13

    .line 428
    add-int/lit8 v11, v11, 0x1

    .line 429
    .line 430
    goto :goto_9

    .line 431
    :cond_11
    shl-int/lit8 v0, v7, 0x3

    .line 432
    .line 433
    add-int/2addr v0, v11

    .line 434
    aget-object v0, v4, v0

    .line 435
    .line 436
    check-cast v0, Lp8;

    .line 437
    .line 438
    invoke-virtual {v0}, Lp8;->Г()V

    .line 439
    .line 440
    .line 441
    throw v12

    .line 442
    :cond_12
    if-ne v10, v13, :cond_14

    .line 443
    .line 444
    :cond_13
    if-eq v7, v6, :cond_14

    .line 445
    .line 446
    add-int/lit8 v7, v7, 0x1

    .line 447
    .line 448
    goto :goto_8

    .line 449
    :cond_14
    invoke-virtual {v3}, Ly40;->ζ()Lc50;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    if-eqz v4, :cond_15

    .line 454
    .line 455
    iget-object v4, v3, Ly40;->γ:Lc50;

    .line 456
    .line 457
    invoke-virtual {v4}, Lc50;->Ж()Lb50;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    sget-object v5, Lb50;->η:Lb50;

    .line 462
    .line 463
    if-ne v4, v5, :cond_16

    .line 464
    .line 465
    :cond_15
    invoke-virtual {v3}, Ly40;->γ()V

    .line 466
    .line 467
    .line 468
    :cond_16
    invoke-virtual {v1}, Lc21;->β()V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2}, Lc21;->β()V

    .line 472
    .line 473
    .line 474
    iput-boolean v14, v0, Ls40;->ε:Z

    .line 475
    .line 476
    sget-object v0, Ls62;->α:Ls62;

    .line 477
    .line 478
    return-object v0

    .line 479
    :pswitch_7
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, Ltg;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-static {}, Ltg;->Μ()Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-eqz v0, :cond_17

    .line 491
    .line 492
    sget v0, Lug;->ξ:I

    .line 493
    .line 494
    const/16 v1, 0x64

    .line 495
    .line 496
    if-ge v0, v1, :cond_17

    .line 497
    .line 498
    const/4 v0, 0x1

    .line 499
    goto :goto_a

    .line 500
    :cond_17
    const/4 v0, 0x0

    .line 501
    :goto_a
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    return-object v0

    .line 506
    :pswitch_8
    iget-object v0, v0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, Landroid/view/View;

    .line 509
    .line 510
    const/4 v1, 0x1

    .line 511
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForContentCapture(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Landroid/view/View;->getContentCaptureSession()Landroid/view/contentcapture/ContentCaptureSession;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    if-nez v1, :cond_18

    .line 519
    .line 520
    const/4 v0, 0x0

    .line 521
    goto :goto_b

    .line 522
    :cond_18
    new-instance v2, Ln5;

    .line 523
    .line 524
    const/16 v3, 0x8

    .line 525
    .line 526
    const/4 v4, 0x0

    .line 527
    invoke-direct {v2, v3, v1, v0, v4}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 528
    .line 529
    .line 530
    move-object v0, v2

    .line 531
    :goto_b
    return-object v0

    .line 532
    nop

    .line 533
    :pswitch_data_0
    .packed-switch 0x0
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
