.class public final synthetic Lr9/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr9/p;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lr9/p;->g:I

    .line 6
    .line 7
    const v3, 0x3dcccccd    # 0.1f

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, -0x1

    .line 12
    const/16 v6, 0x12c

    .line 13
    .line 14
    const-wide v7, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x0

    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    sget-object v2, Lw0/m;->c:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v2

    .line 28
    :try_start_0
    sget-object v3, Lw0/m;->i:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    :goto_0
    if-ge v11, v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Lfg/l;

    .line 41
    .line 42
    invoke-interface {v5, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    add-int/lit8 v11, v11, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    monitor-exit v2

    .line 51
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object v0

    .line 54
    :goto_1
    monitor-exit v2

    .line 55
    throw v0

    .line 56
    :pswitch_0
    check-cast v0, Lf2/y;

    .line 57
    .line 58
    sget-object v2, Lf2/u;->A:Lf2/x;

    .line 59
    .line 60
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 61
    .line 62
    invoke-interface {v0, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :pswitch_1
    check-cast v0, Li2/e;

    .line 67
    .line 68
    iget-object v2, v0, Li2/e;->a:Ljava/lang/Object;

    .line 69
    .line 70
    instance-of v3, v2, Li2/m;

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    check-cast v2, Li2/m;

    .line 75
    .line 76
    invoke-virtual {v2}, Li2/m;->a()Li2/l0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    iget-object v3, v2, Li2/l0;->a:Li2/f0;

    .line 83
    .line 84
    if-nez v3, :cond_1

    .line 85
    .line 86
    iget-object v3, v2, Li2/l0;->b:Li2/f0;

    .line 87
    .line 88
    if-nez v3, :cond_1

    .line 89
    .line 90
    iget-object v3, v2, Li2/l0;->c:Li2/f0;

    .line 91
    .line 92
    if-nez v3, :cond_1

    .line 93
    .line 94
    iget-object v2, v2, Li2/l0;->d:Li2/f0;

    .line 95
    .line 96
    if-nez v2, :cond_1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    new-instance v2, Li2/e;

    .line 100
    .line 101
    iget-object v3, v0, Li2/e;->a:Ljava/lang/Object;

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    check-cast v3, Li2/m;

    .line 107
    .line 108
    invoke-virtual {v3}, Li2/m;->a()Li2/l0;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-eqz v3, :cond_2

    .line 113
    .line 114
    iget-object v3, v3, Li2/l0;->a:Li2/f0;

    .line 115
    .line 116
    if-nez v3, :cond_3

    .line 117
    .line 118
    :cond_2
    new-instance v4, Li2/f0;

    .line 119
    .line 120
    const/16 v22, 0x0

    .line 121
    .line 122
    const v23, 0xffff

    .line 123
    .line 124
    .line 125
    const-wide/16 v5, 0x0

    .line 126
    .line 127
    const-wide/16 v7, 0x0

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v10, 0x0

    .line 131
    const/4 v11, 0x0

    .line 132
    const/4 v12, 0x0

    .line 133
    const/4 v13, 0x0

    .line 134
    const-wide/16 v14, 0x0

    .line 135
    .line 136
    const/16 v16, 0x0

    .line 137
    .line 138
    const/16 v17, 0x0

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const-wide/16 v19, 0x0

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    invoke-direct/range {v4 .. v23}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;I)V

    .line 147
    .line 148
    .line 149
    move-object v3, v4

    .line 150
    :cond_3
    iget v4, v0, Li2/e;->b:I

    .line 151
    .line 152
    iget v5, v0, Li2/e;->c:I

    .line 153
    .line 154
    invoke-direct {v2, v4, v5, v3}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    filled-new-array {v0, v2}, [Li2/e;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    goto :goto_3

    .line 166
    :cond_4
    :goto_2
    filled-new-array {v0}, [Li2/e;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :goto_3
    return-object v0

    .line 175
    :pswitch_2
    check-cast v0, Ljava/util/List;

    .line 176
    .line 177
    new-instance v2, Lw/j1;

    .line 178
    .line 179
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    check-cast v3, Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_5

    .line 193
    .line 194
    sget-object v3, Lm/p1;->g:Lm/p1;

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_5
    sget-object v3, Lm/p1;->h:Lm/p1;

    .line 198
    .line 199
    :goto_4
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    check-cast v0, Ljava/lang/Float;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-direct {v2, v3, v0}, Lw/j1;-><init>(Lm/p1;F)V

    .line 213
    .line 214
    .line 215
    return-object v2

    .line 216
    :pswitch_3
    check-cast v0, Lh0/s0;

    .line 217
    .line 218
    invoke-virtual {v0}, Lh0/s0;->b()Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    if-eqz v2, :cond_6

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    new-instance v9, Ln2/e;

    .line 229
    .line 230
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 231
    .line 232
    sget v0, Li2/m0;->c:I

    .line 233
    .line 234
    and-long/2addr v3, v7

    .line 235
    long-to-int v0, v3

    .line 236
    sub-int/2addr v2, v0

    .line 237
    invoke-direct {v9, v11, v2}, Ln2/e;-><init>(II)V

    .line 238
    .line 239
    .line 240
    :cond_6
    return-object v9

    .line 241
    :pswitch_4
    check-cast v0, Lh0/s0;

    .line 242
    .line 243
    invoke-virtual {v0}, Lh0/s0;->c()Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    if-eqz v2, :cond_7

    .line 248
    .line 249
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    new-instance v9, Ln2/e;

    .line 254
    .line 255
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 256
    .line 257
    sget v0, Li2/m0;->c:I

    .line 258
    .line 259
    and-long/2addr v3, v7

    .line 260
    long-to-int v0, v3

    .line 261
    sub-int/2addr v0, v2

    .line 262
    invoke-direct {v9, v0, v11}, Ln2/e;-><init>(II)V

    .line 263
    .line 264
    .line 265
    :cond_7
    return-object v9

    .line 266
    :pswitch_5
    check-cast v0, Lh0/s0;

    .line 267
    .line 268
    invoke-virtual {v0}, Lh0/s0;->d()Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    if-eqz v2, :cond_8

    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    new-instance v9, Ln2/e;

    .line 279
    .line 280
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 281
    .line 282
    sget v0, Li2/m0;->c:I

    .line 283
    .line 284
    and-long/2addr v3, v7

    .line 285
    long-to-int v0, v3

    .line 286
    sub-int/2addr v2, v0

    .line 287
    invoke-direct {v9, v11, v2}, Ln2/e;-><init>(II)V

    .line 288
    .line 289
    .line 290
    :cond_8
    return-object v9

    .line 291
    :pswitch_6
    check-cast v0, Lh0/s0;

    .line 292
    .line 293
    invoke-virtual {v0}, Lh0/s0;->e()Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    if-eqz v2, :cond_9

    .line 298
    .line 299
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    new-instance v9, Ln2/e;

    .line 304
    .line 305
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 306
    .line 307
    sget v0, Li2/m0;->c:I

    .line 308
    .line 309
    and-long/2addr v3, v7

    .line 310
    long-to-int v0, v3

    .line 311
    sub-int/2addr v0, v2

    .line 312
    invoke-direct {v9, v0, v11}, Ln2/e;-><init>(II)V

    .line 313
    .line 314
    .line 315
    :cond_9
    return-object v9

    .line 316
    :pswitch_7
    check-cast v0, Lh0/s0;

    .line 317
    .line 318
    iget-object v2, v0, Lh0/s0;->g:Li2/g;

    .line 319
    .line 320
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 321
    .line 322
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 323
    .line 324
    sget v6, Li2/m0;->c:I

    .line 325
    .line 326
    and-long/2addr v3, v7

    .line 327
    long-to-int v3, v3

    .line 328
    invoke-static {v3, v2}, Lw/s;->q(ILjava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eq v2, v5, :cond_a

    .line 333
    .line 334
    new-instance v9, Ln2/e;

    .line 335
    .line 336
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 337
    .line 338
    and-long/2addr v3, v7

    .line 339
    long-to-int v0, v3

    .line 340
    sub-int/2addr v2, v0

    .line 341
    invoke-direct {v9, v11, v2}, Ln2/e;-><init>(II)V

    .line 342
    .line 343
    .line 344
    :cond_a
    return-object v9

    .line 345
    :pswitch_8
    check-cast v0, Lh0/s0;

    .line 346
    .line 347
    iget-object v2, v0, Lh0/s0;->g:Li2/g;

    .line 348
    .line 349
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 350
    .line 351
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 352
    .line 353
    sget v6, Li2/m0;->c:I

    .line 354
    .line 355
    and-long/2addr v3, v7

    .line 356
    long-to-int v3, v3

    .line 357
    if-gtz v3, :cond_b

    .line 358
    .line 359
    :goto_5
    move v2, v5

    .line 360
    goto :goto_6

    .line 361
    :cond_b
    invoke-static {}, Lw/s;->u()Ll3/i;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    if-nez v4, :cond_d

    .line 366
    .line 367
    if-gtz v3, :cond_c

    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_c
    invoke-static {v2, v3, v5}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    goto :goto_6

    .line 375
    :cond_d
    add-int/lit8 v6, v3, -0x1

    .line 376
    .line 377
    invoke-virtual {v4, v2, v6}, Ll3/i;->b(Ljava/lang/CharSequence;I)I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-gez v4, :cond_f

    .line 382
    .line 383
    if-gtz v3, :cond_e

    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_e
    invoke-static {v2, v3, v5}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    goto :goto_6

    .line 391
    :cond_f
    move v2, v4

    .line 392
    :goto_6
    if-ne v2, v5, :cond_10

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_10
    new-instance v9, Ln2/e;

    .line 396
    .line 397
    iget-wide v3, v0, Lh0/s0;->f:J

    .line 398
    .line 399
    and-long/2addr v3, v7

    .line 400
    long-to-int v0, v3

    .line 401
    sub-int/2addr v0, v2

    .line 402
    invoke-direct {v9, v0, v11}, Ln2/e;-><init>(II)V

    .line 403
    .line 404
    .line 405
    :goto_7
    return-object v9

    .line 406
    :pswitch_9
    check-cast v0, Ln2/s;

    .line 407
    .line 408
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_a
    check-cast v0, Li2/k0;

    .line 412
    .line 413
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_b
    check-cast v0, Li2/k0;

    .line 417
    .line 418
    sget v0, Lw/i;->a:I

    .line 419
    .line 420
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 421
    .line 422
    return-object v0

    .line 423
    :pswitch_c
    check-cast v0, Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    xor-int/2addr v0, v10

    .line 433
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    return-object v0

    .line 438
    :pswitch_d
    check-cast v0, Ljava/lang/String;

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    xor-int/2addr v0, v10

    .line 448
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    return-object v0

    .line 453
    :pswitch_e
    check-cast v0, Ljava/lang/String;

    .line 454
    .line 455
    if-nez v0, :cond_11

    .line 456
    .line 457
    const-string v0, ""

    .line 458
    .line 459
    :cond_11
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0

    .line 468
    :pswitch_f
    check-cast v0, Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    xor-int/2addr v0, v10

    .line 478
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    return-object v0

    .line 483
    :pswitch_10
    check-cast v0, Ljava/lang/String;

    .line 484
    .line 485
    if-nez v0, :cond_12

    .line 486
    .line 487
    const-string v0, ""

    .line 488
    .line 489
    :cond_12
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    :pswitch_11
    return-object v0

    .line 498
    :pswitch_12
    check-cast v0, Ljava/util/Map;

    .line 499
    .line 500
    new-instance v2, Lv0/d;

    .line 501
    .line 502
    invoke-direct {v2, v0}, Lv0/d;-><init>(Ljava/util/Map;)V

    .line 503
    .line 504
    .line 505
    return-object v2

    .line 506
    :pswitch_13
    check-cast v0, Ljava/lang/reflect/Method;

    .line 507
    .line 508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_14
    check-cast v0, Lx1/h0;

    .line 520
    .line 521
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0}, Lx1/h0;->e()V

    .line 525
    .line 526
    .line 527
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_15
    check-cast v0, Ljava/util/List;

    .line 531
    .line 532
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    new-instance v2, Lsh/e2;

    .line 536
    .line 537
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    check-cast v3, Ljava/lang/Number;

    .line 542
    .line 543
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    check-cast v5, Ljava/lang/Number;

    .line 552
    .line 553
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 554
    .line 555
    .line 556
    move-result v5

    .line 557
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, Ljava/lang/Number;

    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    invoke-direct {v2, v3, v5, v0}, Lsh/e2;-><init>(FFF)V

    .line 568
    .line 569
    .line 570
    return-object v2

    .line 571
    :pswitch_16
    check-cast v0, Lf2/y;

    .line 572
    .line 573
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-static {v0}, Lf2/w;->f(Lf2/y;)V

    .line 577
    .line 578
    .line 579
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 580
    .line 581
    return-object v0

    .line 582
    :pswitch_17
    check-cast v0, Li/i0;

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-virtual {v0, v2, v6}, Li/i0;->a(Ljava/lang/Float;I)Li/h0;

    .line 592
    .line 593
    .line 594
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_18
    check-cast v0, Li/i0;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    const v2, 0x3f59999a    # 0.85f

    .line 603
    .line 604
    .line 605
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    const/16 v3, 0xc8

    .line 610
    .line 611
    invoke-virtual {v0, v2, v3}, Li/i0;->a(Ljava/lang/Float;I)Li/h0;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    sget-object v3, Li/x;->a:Li/s;

    .line 616
    .line 617
    iput-object v3, v2, Li/h0;->b:Li/v;

    .line 618
    .line 619
    const v2, 0x3f4d9168    # 0.803f

    .line 620
    .line 621
    .line 622
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    invoke-virtual {v0, v2, v6}, Li/i0;->a(Ljava/lang/Float;I)Li/h0;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    iput-object v3, v0, Li/h0;->b:Li/v;

    .line 631
    .line 632
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_19
    check-cast v0, Li/i0;

    .line 636
    .line 637
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-virtual {v0, v2, v6}, Li/i0;->a(Ljava/lang/Float;I)Li/h0;

    .line 645
    .line 646
    .line 647
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_1a
    check-cast v0, Lf2/y;

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    invoke-static {v0}, Lf2/w;->f(Lf2/y;)V

    .line 656
    .line 657
    .line 658
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 659
    .line 660
    return-object v0

    .line 661
    :pswitch_1b
    check-cast v0, Lf2/y;

    .line 662
    .line 663
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    invoke-static {v0, v11}, Lf2/w;->c(Lf2/y;I)V

    .line 667
    .line 668
    .line 669
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 670
    .line 671
    return-object v0

    .line 672
    :pswitch_1c
    check-cast v0, Log/f;

    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    check-cast v0, Log/i;

    .line 678
    .line 679
    iget-object v0, v0, Log/i;->c:Log/h;

    .line 680
    .line 681
    invoke-virtual {v0, v10}, Log/h;->a(I)Log/e;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    if-eqz v2, :cond_13

    .line 686
    .line 687
    iget-object v0, v2, Log/e;->a:Ljava/lang/String;

    .line 688
    .line 689
    goto :goto_8

    .line 690
    :cond_13
    invoke-virtual {v0, v4}, Log/h;->a(I)Log/e;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    if-eqz v0, :cond_14

    .line 695
    .line 696
    iget-object v9, v0, Log/e;->a:Ljava/lang/String;

    .line 697
    .line 698
    :cond_14
    if-nez v9, :cond_15

    .line 699
    .line 700
    const-string v0, ""

    .line 701
    .line 702
    goto :goto_8

    .line 703
    :cond_15
    move-object v0, v9

    .line 704
    :goto_8
    return-object v0

    .line 705
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
