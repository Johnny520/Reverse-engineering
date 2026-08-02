.class public final Lv5;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lv5;->i:I

    .line 2
    .line 3
    iput-object p2, p0, Lv5;->j:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lv5;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    sget-object v5, La83;->a:La83;

    .line 8
    .line 9
    iget-object p0, p0, Lv5;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Throwable;

    .line 15
    .line 16
    check-cast p0, Lyw2;

    .line 17
    .line 18
    iget-object v0, p0, Lyw2;->j:Lmp;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lmp;->n(Ljava/lang/Throwable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iput-object v4, p0, Lyw2;->j:Lmp;

    .line 26
    .line 27
    return-object v5

    .line 28
    :pswitch_0
    check-cast p1, Lca2;

    .line 29
    .line 30
    check-cast p0, Lvq2;

    .line 31
    .line 32
    iget v0, p0, Lvq2;->v:F

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lca2;->k(F)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lvq2;->w:F

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lca2;->l(F)V

    .line 40
    .line 41
    .line 42
    iget v0, p0, Lvq2;->x:F

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lca2;->c(F)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v1}, Lca2;->s(F)V

    .line 48
    .line 49
    .line 50
    iget v0, p0, Lvq2;->y:F

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lca2;->n(F)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Lca2;->h(F)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lca2;->i(F)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v1}, Lca2;->j(F)V

    .line 62
    .line 63
    .line 64
    iget v0, p0, Lvq2;->z:F

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lca2;->f(F)V

    .line 67
    .line 68
    .line 69
    iget-wide v0, p0, Lvq2;->A:J

    .line 70
    .line 71
    invoke-virtual {p1, v0, v1}, Lca2;->r(J)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lvq2;->B:Leq2;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Lca2;->p(Leq2;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v0, p0, Lvq2;->C:Z

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lca2;->g(Z)V

    .line 82
    .line 83
    .line 84
    iget-wide v0, p0, Lvq2;->D:J

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1}, Lca2;->e(J)V

    .line 87
    .line 88
    .line 89
    iget-wide v0, p0, Lvq2;->E:J

    .line 90
    .line 91
    invoke-virtual {p1, v0, v1}, Lca2;->q(J)V

    .line 92
    .line 93
    .line 94
    iget p0, p0, Lvq2;->F:I

    .line 95
    .line 96
    iget v0, p1, Lca2;->z:I

    .line 97
    .line 98
    if-ne v0, p0, :cond_1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    iget v0, p1, Lca2;->h:I

    .line 102
    .line 103
    const/high16 v1, 0x80000

    .line 104
    .line 105
    or-int/2addr v0, v1

    .line 106
    iput v0, p1, Lca2;->h:I

    .line 107
    .line 108
    iput p0, p1, Lca2;->z:I

    .line 109
    .line 110
    :goto_0
    return-object v5

    .line 111
    :pswitch_1
    check-cast p1, Lca2;

    .line 112
    .line 113
    check-cast p0, Lcq2;

    .line 114
    .line 115
    iget v0, p0, Lcq2;->a:F

    .line 116
    .line 117
    iget-object v1, p1, Lca2;->x:Le70;

    .line 118
    .line 119
    invoke-interface {v1}, Le70;->b()F

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    mul-float/2addr v1, v0

    .line 124
    invoke-virtual {p1, v1}, Lca2;->n(F)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcq2;->b:Leq2;

    .line 128
    .line 129
    invoke-virtual {p1, v0}, Lca2;->p(Leq2;)V

    .line 130
    .line 131
    .line 132
    iget-boolean v0, p0, Lcq2;->c:Z

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Lca2;->g(Z)V

    .line 135
    .line 136
    .line 137
    iget-wide v0, p0, Lcq2;->d:J

    .line 138
    .line 139
    invoke-virtual {p1, v0, v1}, Lca2;->e(J)V

    .line 140
    .line 141
    .line 142
    iget-wide v0, p0, Lcq2;->e:J

    .line 143
    .line 144
    invoke-virtual {p1, v0, v1}, Lca2;->q(J)V

    .line 145
    .line 146
    .line 147
    return-object v5

    .line 148
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 149
    .line 150
    check-cast p0, Lo81;

    .line 151
    .line 152
    invoke-virtual {p0}, Lo81;->a()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Ljava/lang/Float;

    .line 157
    .line 158
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :pswitch_3
    check-cast p1, Lzn2;

    .line 167
    .line 168
    check-cast p0, Ljava/lang/String;

    .line 169
    .line 170
    sget-object v0, Lxn2;->a:[Lv41;

    .line 171
    .line 172
    sget-object v0, Lvn2;->a:Lyn2;

    .line 173
    .line 174
    invoke-static {p0}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-interface {p1, v0, p0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-object v5

    .line 182
    :pswitch_4
    check-cast p1, Landroid/view/MotionEvent;

    .line 183
    .line 184
    check-cast p0, Lu12;

    .line 185
    .line 186
    invoke-virtual {p0}, Lu12;->f()Lin0;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    check-cast p0, Lcc;

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Lcc;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    return-object v5

    .line 196
    :pswitch_5
    check-cast p1, Lsh1;

    .line 197
    .line 198
    check-cast p0, Lzk1;

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 204
    .line 205
    return-object p0

    .line 206
    :pswitch_6
    check-cast p1, Lxr1;

    .line 207
    .line 208
    iget-object v0, p1, Lxr1;->b:Ll62;

    .line 209
    .line 210
    if-eqz v0, :cond_2

    .line 211
    .line 212
    invoke-virtual {v0}, Ll62;->closeConnection()V

    .line 213
    .line 214
    .line 215
    iput-object v4, p1, Lxr1;->b:Ll62;

    .line 216
    .line 217
    :cond_2
    check-cast p0, Ltz0;

    .line 218
    .line 219
    iget-object v0, p0, Ltz0;->d:Lzk1;

    .line 220
    .line 221
    iget-object v1, v0, Lzk1;->h:[Ljava/lang/Object;

    .line 222
    .line 223
    iget v3, v0, Lzk1;->j:I

    .line 224
    .line 225
    :goto_1
    if-ge v2, v3, :cond_4

    .line 226
    .line 227
    aget-object v4, v1, v2

    .line 228
    .line 229
    check-cast v4, Lod3;

    .line 230
    .line 231
    invoke-static {v4, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_3

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_4
    const/4 v2, -0x1

    .line 242
    :goto_2
    if-ltz v2, :cond_5

    .line 243
    .line 244
    invoke-virtual {v0, v2}, Lzk1;->k(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    :cond_5
    iget p1, v0, Lzk1;->j:I

    .line 248
    .line 249
    if-nez p1, :cond_6

    .line 250
    .line 251
    iget-object p0, p0, Ltz0;->b:Lea;

    .line 252
    .line 253
    invoke-virtual {p0}, Lea;->a()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    :cond_6
    return-object v5

    .line 257
    :pswitch_7
    check-cast p1, Li93;

    .line 258
    .line 259
    check-cast p0, Lar0;

    .line 260
    .line 261
    invoke-virtual {p0, p1}, Lar0;->g(Li93;)V

    .line 262
    .line 263
    .line 264
    iget-object p0, p0, Lar0;->i:Lin0;

    .line 265
    .line 266
    if-eqz p0, :cond_7

    .line 267
    .line 268
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    :cond_7
    return-object v5

    .line 272
    :pswitch_8
    check-cast p1, Lnc0;

    .line 273
    .line 274
    check-cast p0, Lsq0;

    .line 275
    .line 276
    invoke-interface {p1}, Lnc0;->E()Lb5;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Lb5;->q()Lqp;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iget-object p0, p0, Lsq0;->k:Lmn0;

    .line 285
    .line 286
    if-eqz p0, :cond_8

    .line 287
    .line 288
    invoke-interface {p1}, Lnc0;->E()Lb5;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    iget-object p1, p1, Lb5;->j:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p1, Lpq0;

    .line 295
    .line 296
    invoke-interface {p0, v0, p1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    :cond_8
    return-object v5

    .line 300
    :pswitch_9
    check-cast p1, Lnc0;

    .line 301
    .line 302
    check-cast p0, Lpq0;

    .line 303
    .line 304
    iget-object v0, p0, Lpq0;->l:Ly9;

    .line 305
    .line 306
    iget-boolean v1, p0, Lpq0;->n:Z

    .line 307
    .line 308
    if-eqz v1, :cond_9

    .line 309
    .line 310
    iget-boolean v1, p0, Lpq0;->w:Z

    .line 311
    .line 312
    if-eqz v1, :cond_9

    .line 313
    .line 314
    if-eqz v0, :cond_9

    .line 315
    .line 316
    invoke-interface {p1}, Lnc0;->E()Lb5;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Lb5;->u()J

    .line 321
    .line 322
    .line 323
    move-result-wide v2

    .line 324
    invoke-virtual {v1}, Lb5;->q()Lqp;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    invoke-interface {v4}, Lqp;->l()V

    .line 329
    .line 330
    .line 331
    :try_start_0
    iget-object v4, v1, Lb5;->i:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v4, Ln4;

    .line 334
    .line 335
    iget-object v4, v4, Ln4;->i:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v4, Lb5;

    .line 338
    .line 339
    invoke-virtual {v4}, Lb5;->q()Lqp;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-interface {v4, v0}, Lqp;->s(Ly9;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0, p1}, Lpq0;->c(Lnc0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    .line 348
    .line 349
    invoke-static {v1, v2, v3}, Lvi0;->r(Lb5;J)V

    .line 350
    .line 351
    .line 352
    goto :goto_3

    .line 353
    :catchall_0
    move-exception v0

    .line 354
    move-object p0, v0

    .line 355
    invoke-static {v1, v2, v3}, Lvi0;->r(Lb5;J)V

    .line 356
    .line 357
    .line 358
    throw p0

    .line 359
    :cond_9
    invoke-virtual {p0, p1}, Lpq0;->c(Lnc0;)V

    .line 360
    .line 361
    .line 362
    :goto_3
    return-object v5

    .line 363
    :pswitch_a
    sget-object p1, Liq0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 364
    .line 365
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    if-eqz p1, :cond_a

    .line 370
    .line 371
    check-cast p0, Ljn;

    .line 372
    .line 373
    invoke-interface {p0, v5}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    :cond_a
    return-object v5

    .line 377
    :pswitch_b
    check-cast p1, Lgb0;

    .line 378
    .line 379
    iget-object v0, p1, Lth1;->h:Lth1;

    .line 380
    .line 381
    iget-boolean v0, v0, Lth1;->u:Z

    .line 382
    .line 383
    if-nez v0, :cond_b

    .line 384
    .line 385
    sget-object p0, Lc43;->i:Lc43;

    .line 386
    .line 387
    goto :goto_5

    .line 388
    :cond_b
    iget-object v0, p1, Lgb0;->w:Lgb0;

    .line 389
    .line 390
    sget-object v1, Lc43;->h:Lc43;

    .line 391
    .line 392
    if-eqz v0, :cond_d

    .line 393
    .line 394
    check-cast p0, Ln4;

    .line 395
    .line 396
    new-instance v2, Lv5;

    .line 397
    .line 398
    const/16 v3, 0xa

    .line 399
    .line 400
    invoke-direct {v2, v3, p0}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v0}, Lv5;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    if-eq p0, v1, :cond_c

    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_c
    invoke-static {v0, v2}, Ltb3;->f(Ld43;Lin0;)V

    .line 411
    .line 412
    .line 413
    :cond_d
    :goto_4
    iput-object v4, p1, Lgb0;->w:Lgb0;

    .line 414
    .line 415
    iput-object v4, p1, Lgb0;->v:Lgb0;

    .line 416
    .line 417
    move-object p0, v1

    .line 418
    :goto_5
    return-object p0

    .line 419
    :pswitch_c
    check-cast p1, Lba0;

    .line 420
    .line 421
    check-cast p0, Lda0;

    .line 422
    .line 423
    new-instance p1, Lf8;

    .line 424
    .line 425
    const/4 v0, 0x4

    .line 426
    invoke-direct {p1, v0, p0}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    return-object p1

    .line 430
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 431
    .line 432
    if-eqz p1, :cond_e

    .line 433
    .line 434
    check-cast p0, Landroid/os/CancellationSignal;

    .line 435
    .line 436
    invoke-virtual {p0}, Landroid/os/CancellationSignal;->cancel()V

    .line 437
    .line 438
    .line 439
    :cond_e
    return-object v5

    .line 440
    :pswitch_e
    check-cast p1, Lmd;

    .line 441
    .line 442
    iget v0, p1, Lmd;->b:F

    .line 443
    .line 444
    cmpg-float v2, v0, v1

    .line 445
    .line 446
    if-gez v2, :cond_f

    .line 447
    .line 448
    move v0, v1

    .line 449
    :cond_f
    const/high16 v2, 0x3f800000    # 1.0f

    .line 450
    .line 451
    cmpl-float v3, v0, v2

    .line 452
    .line 453
    if-lez v3, :cond_10

    .line 454
    .line 455
    move v0, v2

    .line 456
    :cond_10
    iget v3, p1, Lmd;->c:F

    .line 457
    .line 458
    const/high16 v4, -0x41000000    # -0.5f

    .line 459
    .line 460
    cmpg-float v5, v3, v4

    .line 461
    .line 462
    if-gez v5, :cond_11

    .line 463
    .line 464
    move v3, v4

    .line 465
    :cond_11
    const/high16 v5, 0x3f000000    # 0.5f

    .line 466
    .line 467
    cmpl-float v6, v3, v5

    .line 468
    .line 469
    if-lez v6, :cond_12

    .line 470
    .line 471
    move v3, v5

    .line 472
    :cond_12
    iget v6, p1, Lmd;->d:F

    .line 473
    .line 474
    cmpg-float v7, v6, v4

    .line 475
    .line 476
    if-gez v7, :cond_13

    .line 477
    .line 478
    goto :goto_6

    .line 479
    :cond_13
    move v4, v6

    .line 480
    :goto_6
    cmpl-float v6, v4, v5

    .line 481
    .line 482
    if-lez v6, :cond_14

    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_14
    move v5, v4

    .line 486
    :goto_7
    iget p1, p1, Lmd;->a:F

    .line 487
    .line 488
    cmpg-float v4, p1, v1

    .line 489
    .line 490
    if-gez v4, :cond_15

    .line 491
    .line 492
    goto :goto_8

    .line 493
    :cond_15
    move v1, p1

    .line 494
    :goto_8
    cmpl-float p1, v1, v2

    .line 495
    .line 496
    if-lez p1, :cond_16

    .line 497
    .line 498
    goto :goto_9

    .line 499
    :cond_16
    move v2, v1

    .line 500
    :goto_9
    sget-object p1, Luu;->x:Lft1;

    .line 501
    .line 502
    invoke-static {v0, v3, v5, v2, p1}, Lsp0;->a(FFFFLsu;)J

    .line 503
    .line 504
    .line 505
    move-result-wide v0

    .line 506
    check-cast p0, Lsu;

    .line 507
    .line 508
    invoke-static {v0, v1, p0}, Lju;->a(JLsu;)J

    .line 509
    .line 510
    .line 511
    move-result-wide p0

    .line 512
    new-instance v0, Lju;

    .line 513
    .line 514
    invoke-direct {v0, p0, p1}, Lju;-><init>(J)V

    .line 515
    .line 516
    .line 517
    return-object v0

    .line 518
    :pswitch_f
    check-cast p1, Lo62;

    .line 519
    .line 520
    check-cast p0, Lkm;

    .line 521
    .line 522
    iget-boolean v0, p0, Lth1;->u:Z

    .line 523
    .line 524
    if-eqz v0, :cond_17

    .line 525
    .line 526
    invoke-virtual {p0}, Lth1;->A0()Lj20;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    new-instance v1, La2;

    .line 531
    .line 532
    const/4 v2, 0x6

    .line 533
    invoke-direct {v1, p0, p1, v4, v2}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 534
    .line 535
    .line 536
    const/4 p0, 0x3

    .line 537
    invoke-static {v0, v4, v1, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 538
    .line 539
    .line 540
    :cond_17
    return-object v5

    .line 541
    :pswitch_10
    check-cast p1, Le70;

    .line 542
    .line 543
    check-cast p0, Lr61;

    .line 544
    .line 545
    invoke-virtual {p0, p1}, Lr61;->Z(Le70;)V

    .line 546
    .line 547
    .line 548
    return-object v5

    .line 549
    :pswitch_11
    check-cast p1, Lqn2;

    .line 550
    .line 551
    check-cast p0, Landroid/content/res/Resources;

    .line 552
    .line 553
    invoke-static {p1, p0}, Lrg3;->k(Lqn2;Landroid/content/res/Resources;)Z

    .line 554
    .line 555
    .line 556
    move-result p0

    .line 557
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    return-object p0

    .line 562
    :pswitch_12
    check-cast p1, Lqn2;

    .line 563
    .line 564
    check-cast p0, Lx01;

    .line 565
    .line 566
    iget p1, p1, Lqn2;->f:I

    .line 567
    .line 568
    invoke-virtual {p0, p1}, Lx01;->a(I)Z

    .line 569
    .line 570
    .line 571
    move-result p0

    .line 572
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    return-object p0

    .line 577
    :pswitch_13
    move-object v6, p1

    .line 578
    check-cast v6, Lhd1;

    .line 579
    .line 580
    check-cast p0, Lo6;

    .line 581
    .line 582
    iget-object p0, p0, Lo6;->w:Lb7;

    .line 583
    .line 584
    invoke-virtual {p0}, Lb7;->getInsetsListener()Lb01;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    iget-object p1, p1, Lb01;->n:Lkx1;

    .line 589
    .line 590
    invoke-virtual {p1}, Lkx1;->g()I

    .line 591
    .line 592
    .line 593
    move-result p1

    .line 594
    if-lez p1, :cond_1b

    .line 595
    .line 596
    sget-object p1, Ljf3;->a:Lzj1;

    .line 597
    .line 598
    iput-boolean v3, v6, Lhd1;->h:Z

    .line 599
    .line 600
    iget-object p1, v6, Lhd1;->k:Lkd1;

    .line 601
    .line 602
    invoke-virtual {p1}, Lkd1;->t0()Lc61;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    iget-wide v3, v6, Lhd1;->i:J

    .line 607
    .line 608
    const-wide v7, 0x7fffffff7fffffffL

    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    invoke-static {v3, v4, v7, v8}, Lz01;->a(JJ)Z

    .line 614
    .line 615
    .line 616
    move-result v1

    .line 617
    if-eqz v1, :cond_18

    .line 618
    .line 619
    const-wide/16 v3, 0x0

    .line 620
    .line 621
    invoke-interface {v0, v3, v4}, Lc61;->c(J)J

    .line 622
    .line 623
    .line 624
    move-result-wide v3

    .line 625
    invoke-static {v3, v4}, Ltp0;->J(J)J

    .line 626
    .line 627
    .line 628
    move-result-wide v3

    .line 629
    iput-wide v3, v6, Lhd1;->i:J

    .line 630
    .line 631
    invoke-interface {v0}, Lc61;->L()J

    .line 632
    .line 633
    .line 634
    move-result-wide v3

    .line 635
    iput-wide v3, v6, Lhd1;->j:J

    .line 636
    .line 637
    :cond_18
    invoke-virtual {p1}, Lkd1;->w0()Lr61;

    .line 638
    .line 639
    .line 640
    move-result-object p1

    .line 641
    iget-object p1, p1, Lr61;->N:Lv61;

    .line 642
    .line 643
    invoke-virtual {p1}, Lv61;->b()V

    .line 644
    .line 645
    .line 646
    invoke-interface {v0}, Lc61;->L()J

    .line 647
    .line 648
    .line 649
    move-result-wide v0

    .line 650
    invoke-virtual {p0}, Lb7;->getInsetsListener()Lb01;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    iget-object p1, p1, Lb01;->m:Lrk1;

    .line 655
    .line 656
    const/16 v3, 0x20

    .line 657
    .line 658
    shr-long v3, v0, v3

    .line 659
    .line 660
    long-to-int v10, v3

    .line 661
    const-wide v3, 0xffffffffL

    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    and-long/2addr v0, v3

    .line 667
    long-to-int v11, v0

    .line 668
    sget-object v0, Ljf3;->b:[Lhf3;

    .line 669
    .line 670
    array-length v1, v0

    .line 671
    move v3, v2

    .line 672
    :goto_a
    if-ge v3, v1, :cond_1a

    .line 673
    .line 674
    aget-object v4, v0, v3

    .line 675
    .line 676
    invoke-virtual {p1, v4}, Lrk1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v7

    .line 680
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    move-object v12, v7

    .line 684
    check-cast v12, Lxf3;

    .line 685
    .line 686
    move-object v7, v4

    .line 687
    check-cast v7, Lif3;

    .line 688
    .line 689
    iget-object v7, v7, Lif3;->c:Lrz0;

    .line 690
    .line 691
    iget-wide v8, v12, Lxf3;->h:J

    .line 692
    .line 693
    invoke-static/range {v6 .. v11}, Ljf3;->a(Lhd1;Lrz0;JII)V

    .line 694
    .line 695
    .line 696
    iget-object v7, v12, Lxf3;->b:Lnx1;

    .line 697
    .line 698
    invoke-virtual {v7}, Lnx1;->getValue()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    check-cast v7, Ljava/lang/Boolean;

    .line 703
    .line 704
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    if-eqz v7, :cond_19

    .line 709
    .line 710
    iget-object v7, v12, Lxf3;->f:Lrz0;

    .line 711
    .line 712
    iget-wide v8, v12, Lxf3;->j:J

    .line 713
    .line 714
    invoke-static/range {v6 .. v11}, Ljf3;->a(Lhd1;Lrz0;JII)V

    .line 715
    .line 716
    .line 717
    iget-object v7, v12, Lxf3;->g:Lrz0;

    .line 718
    .line 719
    iget-wide v8, v12, Lxf3;->k:J

    .line 720
    .line 721
    invoke-static/range {v6 .. v11}, Ljf3;->a(Lhd1;Lrz0;JII)V

    .line 722
    .line 723
    .line 724
    :cond_19
    check-cast v4, Lif3;

    .line 725
    .line 726
    iget-object v7, v4, Lif3;->d:Lrz0;

    .line 727
    .line 728
    iget-wide v8, v12, Lxf3;->i:J

    .line 729
    .line 730
    invoke-static/range {v6 .. v11}, Ljf3;->a(Lhd1;Lrz0;JII)V

    .line 731
    .line 732
    .line 733
    add-int/lit8 v3, v3, 0x1

    .line 734
    .line 735
    goto :goto_a

    .line 736
    :cond_1a
    invoke-virtual {p0}, Lb7;->getInsetsListener()Lb01;

    .line 737
    .line 738
    .line 739
    move-result-object p1

    .line 740
    iget-object p1, p1, Lb01;->o:Llk1;

    .line 741
    .line 742
    invoke-virtual {p1}, Llk1;->i()Z

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    if-eqz v0, :cond_1b

    .line 747
    .line 748
    invoke-virtual {p0}, Lb7;->getInsetsListener()Lb01;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    iget-object p0, p0, Lb01;->p:Lps2;

    .line 753
    .line 754
    iget-object v0, p1, Llk1;->a:[Ljava/lang/Object;

    .line 755
    .line 756
    iget p1, p1, Llk1;->b:I

    .line 757
    .line 758
    :goto_b
    if-ge v2, p1, :cond_1b

    .line 759
    .line 760
    aget-object v1, v0, v2

    .line 761
    .line 762
    check-cast v1, Lxk1;

    .line 763
    .line 764
    invoke-virtual {p0, v2}, Lps2;->get(I)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    check-cast v3, Lrz0;

    .line 769
    .line 770
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    check-cast v1, Landroid/graphics/Rect;

    .line 775
    .line 776
    invoke-virtual {v3}, Lrz0;->b()Lgu0;

    .line 777
    .line 778
    .line 779
    move-result-object v4

    .line 780
    iget v7, v1, Landroid/graphics/Rect;->left:I

    .line 781
    .line 782
    int-to-float v7, v7

    .line 783
    invoke-virtual {v6, v4, v7}, Lhd1;->a(Lgu0;F)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v3}, Lrz0;->d()Lgu0;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    iget v7, v1, Landroid/graphics/Rect;->top:I

    .line 791
    .line 792
    int-to-float v7, v7

    .line 793
    invoke-virtual {v6, v4, v7}, Lhd1;->a(Lgu0;F)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v3}, Lrz0;->c()Lgu0;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    iget v7, v1, Landroid/graphics/Rect;->right:I

    .line 801
    .line 802
    int-to-float v7, v7

    .line 803
    invoke-virtual {v6, v4, v7}, Lhd1;->a(Lgu0;F)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v3}, Lrz0;->a()Lgu0;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 811
    .line 812
    int-to-float v1, v1

    .line 813
    invoke-virtual {v6, v3, v1}, Lhd1;->a(Lgu0;F)V

    .line 814
    .line 815
    .line 816
    add-int/lit8 v2, v2, 0x1

    .line 817
    .line 818
    goto :goto_b

    .line 819
    :cond_1b
    return-object v5

    .line 820
    :pswitch_14
    check-cast p1, Lpl0;

    .line 821
    .line 822
    check-cast p0, Lok0;

    .line 823
    .line 824
    iget p0, p0, Lok0;->a:I

    .line 825
    .line 826
    invoke-virtual {p1, p0}, Lpl0;->T0(I)Z

    .line 827
    .line 828
    .line 829
    move-result p0

    .line 830
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 831
    .line 832
    .line 833
    move-result-object p0

    .line 834
    return-object p0

    .line 835
    :pswitch_15
    check-cast p1, Lw5;

    .line 836
    .line 837
    check-cast p0, Ls61;

    .line 838
    .line 839
    invoke-interface {p1}, Lw5;->P()I

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    const v1, 0x7fffffff

    .line 844
    .line 845
    .line 846
    if-ne v0, v1, :cond_1c

    .line 847
    .line 848
    goto/16 :goto_f

    .line 849
    .line 850
    :cond_1c
    invoke-interface {p1}, Lw5;->a()Ls61;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    iget-boolean v0, v0, Ls61;->b:Z

    .line 855
    .line 856
    if-eqz v0, :cond_1d

    .line 857
    .line 858
    invoke-interface {p1}, Lw5;->q()V

    .line 859
    .line 860
    .line 861
    :cond_1d
    invoke-interface {p1}, Lw5;->a()Ls61;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    iget-object v0, v0, Ls61;->g:Ljava/util/HashMap;

    .line 866
    .line 867
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    if-eqz v1, :cond_1e

    .line 880
    .line 881
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    check-cast v1, Ljava/util/Map$Entry;

    .line 886
    .line 887
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    check-cast v2, Ldu0;

    .line 892
    .line 893
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v1

    .line 897
    check-cast v1, Ljava/lang/Number;

    .line 898
    .line 899
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 900
    .line 901
    .line 902
    move-result v1

    .line 903
    invoke-interface {p1}, Lw5;->n()Lqz0;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    invoke-static {p0, v2, v1, v3}, Ls61;->a(Ls61;Ldu0;ILzn1;)V

    .line 908
    .line 909
    .line 910
    goto :goto_c

    .line 911
    :cond_1e
    invoke-interface {p1}, Lw5;->n()Lqz0;

    .line 912
    .line 913
    .line 914
    move-result-object p1

    .line 915
    iget-object p1, p1, Lzn1;->x:Lzn1;

    .line 916
    .line 917
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    :goto_d
    iget-object v0, p0, Ls61;->a:Lw5;

    .line 921
    .line 922
    invoke-interface {v0}, Lw5;->n()Lqz0;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    move-result v0

    .line 930
    if-nez v0, :cond_20

    .line 931
    .line 932
    invoke-virtual {p0, p1}, Ls61;->b(Lzn1;)Ljava/util/Map;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    check-cast v0, Ljava/lang/Iterable;

    .line 941
    .line 942
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    if-eqz v1, :cond_1f

    .line 951
    .line 952
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    check-cast v1, Ldu0;

    .line 957
    .line 958
    invoke-virtual {p0, p1, v1}, Ls61;->c(Lzn1;Ldu0;)I

    .line 959
    .line 960
    .line 961
    move-result v2

    .line 962
    invoke-static {p0, v1, v2, p1}, Ls61;->a(Ls61;Ldu0;ILzn1;)V

    .line 963
    .line 964
    .line 965
    goto :goto_e

    .line 966
    :cond_1f
    iget-object p1, p1, Lzn1;->x:Lzn1;

    .line 967
    .line 968
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    goto :goto_d

    .line 972
    :cond_20
    :goto_f
    return-object v5

    .line 973
    :pswitch_data_0
    .packed-switch 0x0
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
