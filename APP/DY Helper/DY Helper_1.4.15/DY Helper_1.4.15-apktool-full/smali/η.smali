.class public final synthetic Lη;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lη;->ε:I

    iput-object p2, p0, Lη;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkn0;J)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lη;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lη;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lη;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    iget-object v0, v0, Lη;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, Lv32;

    .line 14
    .line 15
    iput-object v5, v0, Lv32;->Ζ:Lu32;

    .line 16
    .line 17
    invoke-static {v0}, Li91;->ν(Lzr1;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lbd;->Α(Lqp0;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lyh;->Σ(Lbw;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    move-object v1, v0

    .line 30
    check-cast v1, Lkx1;

    .line 31
    .line 32
    :goto_0
    iget-object v5, v1, Lkx1;->η:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v5

    .line 35
    :try_start_0
    iget-boolean v0, v1, Lkx1;->γ:Z

    .line 36
    .line 37
    if-nez v0, :cond_5

    .line 38
    .line 39
    iput-boolean v3, v1, Lkx1;->γ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    .line 41
    :try_start_1
    iget-object v0, v1, Lkx1;->ζ:Lk21;

    .line 42
    .line 43
    iget-object v6, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 44
    .line 45
    iget v0, v0, Lk21;->η:I

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    :goto_1
    if-ge v7, v0, :cond_4

    .line 49
    .line 50
    aget-object v8, v6, v7

    .line 51
    .line 52
    check-cast v8, Ljx1;

    .line 53
    .line 54
    iget-object v9, v8, Ljx1;->η:Lc21;

    .line 55
    .line 56
    iget-object v8, v8, Ljx1;->α:La80;

    .line 57
    .line 58
    iget-object v10, v9, Lc21;->β:[Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v11, v9, Lc21;->α:[J

    .line 61
    .line 62
    array-length v12, v11

    .line 63
    sub-int/2addr v12, v2

    .line 64
    if-ltz v12, :cond_3

    .line 65
    .line 66
    const/4 v13, 0x0

    .line 67
    :goto_2
    aget-wide v14, v11, v13

    .line 68
    .line 69
    not-long v2, v14

    .line 70
    const/16 v17, 0x7

    .line 71
    .line 72
    shl-long v2, v2, v17

    .line 73
    .line 74
    and-long/2addr v2, v14

    .line 75
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long v2, v2, v17

    .line 81
    .line 82
    cmp-long v2, v2, v17

    .line 83
    .line 84
    if-eqz v2, :cond_2

    .line 85
    .line 86
    sub-int v2, v13, v12

    .line 87
    .line 88
    not-int v2, v2

    .line 89
    ushr-int/lit8 v2, v2, 0x1f

    .line 90
    .line 91
    const/16 v3, 0x8

    .line 92
    .line 93
    rsub-int/lit8 v2, v2, 0x8

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    :goto_3
    if-ge v4, v2, :cond_1

    .line 97
    .line 98
    const-wide/16 v18, 0xff

    .line 99
    .line 100
    and-long v18, v14, v18

    .line 101
    .line 102
    const-wide/16 v20, 0x80

    .line 103
    .line 104
    cmp-long v18, v18, v20

    .line 105
    .line 106
    if-gez v18, :cond_0

    .line 107
    .line 108
    shl-int/lit8 v18, v13, 0x3

    .line 109
    .line 110
    add-int v18, v18, v4

    .line 111
    .line 112
    move/from16 p0, v3

    .line 113
    .line 114
    aget-object v3, v10, v18

    .line 115
    .line 116
    invoke-interface {v8, v3}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_0
    move/from16 p0, v3

    .line 121
    .line 122
    :goto_4
    shr-long v14, v14, p0

    .line 123
    .line 124
    add-int/lit8 v4, v4, 0x1

    .line 125
    .line 126
    move/from16 v3, p0

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_1
    if-ne v2, v3, :cond_3

    .line 130
    .line 131
    :cond_2
    if-eq v13, v12, :cond_3

    .line 132
    .line 133
    add-int/lit8 v13, v13, 0x1

    .line 134
    .line 135
    const/4 v2, 0x2

    .line 136
    const/4 v3, 0x1

    .line 137
    goto :goto_2

    .line 138
    :cond_3
    invoke-virtual {v9}, Lc21;->β()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    .line 140
    .line 141
    add-int/lit8 v7, v7, 0x1

    .line 142
    .line 143
    const/4 v2, 0x2

    .line 144
    const/4 v3, 0x1

    .line 145
    goto :goto_1

    .line 146
    :goto_5
    const/4 v2, 0x0

    .line 147
    goto :goto_6

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    goto :goto_5

    .line 150
    :cond_4
    const/4 v2, 0x0

    .line 151
    :try_start_2
    iput-boolean v2, v1, Lkx1;->γ:Z

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :catchall_1
    move-exception v0

    .line 155
    goto :goto_8

    .line 156
    :goto_6
    iput-boolean v2, v1, Lkx1;->γ:Z

    .line 157
    .line 158
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 159
    :cond_5
    :goto_7
    monitor-exit v5

    .line 160
    invoke-virtual {v1}, Lkx1;->α()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_6

    .line 165
    .line 166
    sget-object v0, Ls62;->α:Ls62;

    .line 167
    .line 168
    return-object v0

    .line 169
    :cond_6
    const/4 v2, 0x2

    .line 170
    const/4 v3, 0x1

    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :goto_8
    monitor-exit v5

    .line 174
    throw v0

    .line 175
    :pswitch_1
    check-cast v0, Ldv1;

    .line 176
    .line 177
    iget-object v0, v0, Ldv1;->ζ:Lx91;

    .line 178
    .line 179
    invoke-virtual {v0}, Lx91;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Ljw1;

    .line 184
    .line 185
    iget-wide v1, v1, Ljw1;->α:J

    .line 186
    .line 187
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    cmp-long v1, v1, v3

    .line 193
    .line 194
    if-nez v1, :cond_7

    .line 195
    .line 196
    goto :goto_c

    .line 197
    :cond_7
    invoke-virtual {v0}, Lx91;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Ljw1;

    .line 202
    .line 203
    iget-wide v1, v1, Ljw1;->α:J

    .line 204
    .line 205
    cmp-long v3, v1, v3

    .line 206
    .line 207
    if-nez v3, :cond_8

    .line 208
    .line 209
    const/4 v3, 0x1

    .line 210
    goto :goto_9

    .line 211
    :cond_8
    const/4 v3, 0x0

    .line 212
    :goto_9
    const/16 v4, 0x20

    .line 213
    .line 214
    shr-long v6, v1, v4

    .line 215
    .line 216
    long-to-int v4, v6

    .line 217
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    const/4 v6, 0x0

    .line 222
    cmpg-float v4, v4, v6

    .line 223
    .line 224
    if-gtz v4, :cond_9

    .line 225
    .line 226
    const/4 v4, 0x1

    .line 227
    goto :goto_a

    .line 228
    :cond_9
    const/4 v4, 0x0

    .line 229
    :goto_a
    or-int/2addr v3, v4

    .line 230
    const-wide v7, 0xffffffffL

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    and-long/2addr v1, v7

    .line 236
    long-to-int v1, v1

    .line 237
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    cmpg-float v1, v1, v6

    .line 242
    .line 243
    if-gtz v1, :cond_a

    .line 244
    .line 245
    const/16 v16, 0x1

    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_a
    const/16 v16, 0x0

    .line 249
    .line 250
    :goto_b
    or-int v1, v3, v16

    .line 251
    .line 252
    if-eqz v1, :cond_b

    .line 253
    .line 254
    :goto_c
    return-object v5

    .line 255
    :cond_b
    invoke-virtual {v0}, Lx91;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, Ljw1;

    .line 260
    .line 261
    iget-wide v0, v0, Ljw1;->α:J

    .line 262
    .line 263
    throw v5

    .line 264
    :pswitch_2
    check-cast v0, Lkq1;

    .line 265
    .line 266
    invoke-interface {v0}, Lhr0;->δ()Ljr0;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    new-instance v2, Lll1;

    .line 271
    .line 272
    const/4 v3, 0x0

    .line 273
    invoke-direct {v2, v3, v0}, Lll1;-><init>(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v2}, Ljr0;->α(Lgr0;)V

    .line 277
    .line 278
    .line 279
    sget-object v0, Ls62;->α:Ls62;

    .line 280
    .line 281
    return-object v0

    .line 282
    :pswitch_3
    check-cast v0, Lorg/luckypray/dexkit/DexKitBridge;

    .line 283
    .line 284
    new-instance v1, Lcf1;

    .line 285
    .line 286
    const/16 v2, 0x17

    .line 287
    .line 288
    invoke-direct {v1, v2}, Lcf1;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0

    .line 296
    :pswitch_4
    check-cast v0, Lli0;

    .line 297
    .line 298
    iget-object v0, v0, Lli0;->φ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0

    .line 309
    :pswitch_5
    move-object v1, v0

    .line 310
    check-cast v1, Ldg0;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    :try_start_3
    iget-object v0, v1, Ldg0;->Γ:Llg0;

    .line 316
    .line 317
    const/4 v2, 0x2

    .line 318
    const/4 v3, 0x0

    .line 319
    invoke-virtual {v0, v2, v3, v3}, Llg0;->ξ(IIZ)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 320
    .line 321
    .line 322
    goto :goto_d

    .line 323
    :catch_0
    move-exception v0

    .line 324
    sget-object v2, Lsz;->θ:Lsz;

    .line 325
    .line 326
    invoke-virtual {v1, v2, v2, v0}, Ldg0;->δ(Lsz;Lsz;Ljava/io/IOException;)V

    .line 327
    .line 328
    .line 329
    :goto_d
    sget-object v0, Ls62;->α:Ls62;

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_6
    check-cast v0, Lnd0;

    .line 333
    .line 334
    iget-object v0, v0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    return-object v0

    .line 345
    :pswitch_7
    check-cast v0, Ljava/lang/Long;

    .line 346
    .line 347
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 348
    .line 349
    invoke-static {v0}, Lcom/example/dyhelper/hook/γ;->Δ(Ljava/lang/Long;)V

    .line 350
    .line 351
    .line 352
    sget-object v0, Ls62;->α:Ls62;

    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_8
    check-cast v0, Law;

    .line 356
    .line 357
    invoke-virtual {v0}, Law;->И()V

    .line 358
    .line 359
    .line 360
    sget-object v0, Ls62;->α:Ls62;

    .line 361
    .line 362
    return-object v0

    .line 363
    :pswitch_9
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 364
    .line 365
    sget v1, Landroidx/activity/ComponentActivity;->χ:I

    .line 366
    .line 367
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->reportFullyDrawn()V

    .line 368
    .line 369
    .line 370
    return-object v5

    .line 371
    :pswitch_a
    check-cast v0, Landroid/widget/TextView;

    .line 372
    .line 373
    sget-object v1, Lbh;->κ:Lrz;

    .line 374
    .line 375
    if-eqz v1, :cond_c

    .line 376
    .line 377
    invoke-virtual {v1}, Lμ;->isEmpty()Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-eqz v2, :cond_c

    .line 382
    .line 383
    const/4 v4, 0x0

    .line 384
    goto :goto_f

    .line 385
    :cond_c
    invoke-virtual {v1}, Lχ;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    const/4 v4, 0x0

    .line 390
    :cond_d
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    if-eqz v2, :cond_f

    .line 395
    .line 396
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    check-cast v2, Lbh;

    .line 401
    .line 402
    invoke-static {v2}, Ls1;->π(Lbh;)Lch;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    iget-boolean v2, v2, Lch;->α:Z

    .line 407
    .line 408
    if-eqz v2, :cond_d

    .line 409
    .line 410
    add-int/lit8 v4, v4, 0x1

    .line 411
    .line 412
    if-ltz v4, :cond_e

    .line 413
    .line 414
    goto :goto_e

    .line 415
    :cond_e
    invoke-static {}, Lyh;->ф()V

    .line 416
    .line 417
    .line 418
    throw v5

    .line 419
    :cond_f
    :goto_f
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const v3, 0x7f0f003a

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 439
    .line 440
    .line 441
    sget-object v0, Ls62;->α:Ls62;

    .line 442
    .line 443
    return-object v0

    .line 444
    :pswitch_b
    check-cast v0, Lrb;

    .line 445
    .line 446
    sget-object v1, Ls62;->α:Ls62;

    .line 447
    .line 448
    iget-object v2, v0, Lrb;->α:Ljava/util/IdentityHashMap;

    .line 449
    .line 450
    iget-object v3, v0, Lrb;->β:Ljava/util/IdentityHashMap;

    .line 451
    .line 452
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    :cond_10
    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_11

    .line 465
    .line 466
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    check-cast v0, Ljava/util/Map$Entry;

    .line 471
    .line 472
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    check-cast v5, Landroid/view/View;

    .line 477
    .line 478
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    check-cast v0, Lqb;

    .line 483
    .line 484
    :try_start_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    iget v6, v0, Lqb;->α:F

    .line 491
    .line 492
    invoke-virtual {v5, v6}, Landroid/view/View;->setAlpha(F)V

    .line 493
    .line 494
    .line 495
    iget-boolean v6, v0, Lqb;->β:Z

    .line 496
    .line 497
    invoke-virtual {v5, v6}, Landroid/view/View;->setClickable(Z)V

    .line 498
    .line 499
    .line 500
    iget-boolean v6, v0, Lqb;->γ:Z

    .line 501
    .line 502
    invoke-virtual {v5, v6}, Landroid/view/View;->setLongClickable(Z)V

    .line 503
    .line 504
    .line 505
    iget-boolean v6, v0, Lqb;->δ:Z

    .line 506
    .line 507
    invoke-virtual {v5, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 508
    .line 509
    .line 510
    iget v0, v0, Lqb;->ε:I

    .line 511
    .line 512
    invoke-virtual {v5, v0}, Landroid/view/View;->setImportantForAccessibility(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 513
    .line 514
    .line 515
    move-object v5, v1

    .line 516
    goto :goto_11

    .line 517
    :catchall_2
    move-exception v0

    .line 518
    new-instance v5, Leo1;

    .line 519
    .line 520
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 521
    .line 522
    .line 523
    :goto_11
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    if-eqz v0, :cond_10

    .line 528
    .line 529
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    const-string v5, "r4d245d98269851e7"

    .line 534
    .line 535
    invoke-static {v5, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    goto :goto_10

    .line 539
    :cond_11
    invoke-virtual {v2}, Ljava/util/IdentityHashMap;->clear()V

    .line 540
    .line 541
    .line 542
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    :cond_12
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    if-eqz v0, :cond_13

    .line 555
    .line 556
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    check-cast v0, Ljava/util/Map$Entry;

    .line 561
    .line 562
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    check-cast v4, Landroid/view/View;

    .line 567
    .line 568
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    check-cast v0, Lpb;

    .line 573
    .line 574
    :try_start_5
    iget-object v0, v0, Lpb;->α:Landroid/graphics/drawable/Drawable;

    .line 575
    .line 576
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 577
    .line 578
    .line 579
    move-object v4, v1

    .line 580
    goto :goto_13

    .line 581
    :catchall_3
    move-exception v0

    .line 582
    new-instance v4, Leo1;

    .line 583
    .line 584
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 585
    .line 586
    .line 587
    :goto_13
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    if-eqz v0, :cond_12

    .line 592
    .line 593
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    const-string v4, "r9f2bf9809d31c9dd"

    .line 598
    .line 599
    invoke-static {v4, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    goto :goto_12

    .line 603
    :cond_13
    invoke-virtual {v3}, Ljava/util/IdentityHashMap;->clear()V

    .line 604
    .line 605
    .line 606
    return-object v1

    .line 607
    :pswitch_c
    check-cast v0, Landroid/view/ViewGroup;

    .line 608
    .line 609
    sget-object v1, Lsb;->Α:Ljava/util/Map;

    .line 610
    .line 611
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    monitor-enter v1

    .line 615
    :try_start_6
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    check-cast v0, Lrb;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 620
    .line 621
    monitor-exit v1

    .line 622
    if-nez v0, :cond_14

    .line 623
    .line 624
    goto :goto_14

    .line 625
    :cond_14
    sget-object v1, Lsb;->α:Lsb;

    .line 626
    .line 627
    new-instance v1, Lη;

    .line 628
    .line 629
    const/4 v2, 0x5

    .line 630
    invoke-direct {v1, v2, v0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    invoke-static {v1}, Lsb;->Ω(Lp70;)V

    .line 634
    .line 635
    .line 636
    :goto_14
    sget-object v0, Ls62;->α:Ls62;

    .line 637
    .line 638
    return-object v0

    .line 639
    :catchall_4
    move-exception v0

    .line 640
    monitor-exit v1

    .line 641
    throw v0

    .line 642
    :pswitch_d
    check-cast v0, Lp9;

    .line 643
    .line 644
    sget-object v1, Lr9;->α:Landroid/os/Handler;

    .line 645
    .line 646
    iget-object v0, v0, Lp9;->α:Ljava/lang/String;

    .line 647
    .line 648
    const-string v1, "shown_dates"

    .line 649
    .line 650
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    if-eqz v2, :cond_15

    .line 655
    .line 656
    goto :goto_17

    .line 657
    :cond_15
    sget-object v2, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 658
    .line 659
    if-eqz v2, :cond_16

    .line 660
    .line 661
    goto :goto_15

    .line 662
    :cond_16
    sget-object v2, Lr9;->δ:Landroid/content/Context;

    .line 663
    .line 664
    if-nez v2, :cond_17

    .line 665
    .line 666
    move-object v2, v5

    .line 667
    goto :goto_15

    .line 668
    :cond_17
    invoke-static {v2}, Lr9;->α(Landroid/content/Context;)V

    .line 669
    .line 670
    .line 671
    sget-object v2, Lr9;->ε:Landroid/content/SharedPreferences;

    .line 672
    .line 673
    :goto_15
    if-nez v2, :cond_18

    .line 674
    .line 675
    goto :goto_17

    .line 676
    :cond_18
    sget-object v3, Lnz;->ε:Lnz;

    .line 677
    .line 678
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    if-eqz v3, :cond_19

    .line 683
    .line 684
    check-cast v3, Ljava/lang/Iterable;

    .line 685
    .line 686
    invoke-static {v3}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 687
    .line 688
    .line 689
    move-result-object v3

    .line 690
    goto :goto_16

    .line 691
    :cond_19
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 692
    .line 693
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 694
    .line 695
    .line 696
    :goto_16
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    const-string v2, "last_shown_date"

    .line 708
    .line 709
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 714
    .line 715
    .line 716
    const-string v1, "r62fe5deb53d30681"

    .line 717
    .line 718
    const-string v2, "notice marked shown date="

    .line 719
    .line 720
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    const/4 v2, 0x4

    .line 725
    invoke-static {v1, v0, v5, v2, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    :goto_17
    sget-object v0, Ls62;->α:Ls62;

    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_e
    check-cast v0, Lmq;

    .line 732
    .line 733
    invoke-static {v0}, Lt7;->β(Lmq;)V

    .line 734
    .line 735
    .line 736
    sget-object v0, Ls62;->α:Ls62;

    .line 737
    .line 738
    return-object v0

    .line 739
    :pswitch_f
    check-cast v0, Lkn0;

    .line 740
    .line 741
    check-cast v0, Lpc;

    .line 742
    .line 743
    throw v5

    .line 744
    :pswitch_10
    check-cast v0, Lcom/example/dyhelper/ui/AboutActivity;

    .line 745
    .line 746
    sget v1, Lcom/example/dyhelper/ui/AboutActivity;->ζ:I

    .line 747
    .line 748
    new-instance v1, Lθ;

    .line 749
    .line 750
    const/4 v3, 0x0

    .line 751
    invoke-direct {v1, v3, v0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    return-object v1

    .line 755
    :pswitch_data_0
    .packed-switch 0x0
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
