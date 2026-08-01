.class public final Ls2;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Ls2;->d:I

    iput-object p2, p0, Ls2;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lx1;Lsp;Lvt0;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput p1, p0, Ls2;->d:I

    .line 4
    .line 5
    iput-object p3, p0, Ls2;->e:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ls2;->d:I

    .line 6
    .line 7
    sget-object v3, Lg91;->e:Lg91;

    .line 8
    .line 9
    sget-object v4, Lg91;->d:Lg91;

    .line 10
    .line 11
    const/16 v5, 0x20

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v7, "(this)"

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    sget-object v10, Lna1;->a:Lna1;

    .line 19
    .line 20
    iget-object v0, v0, Ls2;->e:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v1, Ljava/lang/Throwable;

    .line 26
    .line 27
    check-cast v0, Lr51;

    .line 28
    .line 29
    iget-object v2, v0, Lr51;->f:Lwc;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lwc;->k(Ljava/lang/Throwable;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    iput-object v9, v0, Lr51;->f:Lwc;

    .line 37
    .line 38
    return-object v10

    .line 39
    :pswitch_0
    check-cast v1, Lgv0;

    .line 40
    .line 41
    check-cast v0, Lo11;

    .line 42
    .line 43
    iget v2, v0, Lo11;->r:F

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lgv0;->e(F)V

    .line 46
    .line 47
    .line 48
    iget v2, v0, Lo11;->s:F

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lgv0;->f(F)V

    .line 51
    .line 52
    .line 53
    iget v2, v0, Lo11;->t:F

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Lgv0;->d(F)V

    .line 56
    .line 57
    .line 58
    iget v2, v0, Lo11;->u:F

    .line 59
    .line 60
    iget v3, v1, Lgv0;->h:F

    .line 61
    .line 62
    cmpg-float v3, v3, v2

    .line 63
    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget v3, v1, Lgv0;->d:I

    .line 68
    .line 69
    or-int/2addr v3, v5

    .line 70
    iput v3, v1, Lgv0;->d:I

    .line 71
    .line 72
    iput v2, v1, Lgv0;->h:F

    .line 73
    .line 74
    :goto_0
    iget v2, v0, Lo11;->v:F

    .line 75
    .line 76
    iget v3, v1, Lgv0;->k:F

    .line 77
    .line 78
    cmpg-float v3, v3, v2

    .line 79
    .line 80
    if-nez v3, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iget v3, v1, Lgv0;->d:I

    .line 84
    .line 85
    or-int/lit16 v3, v3, 0x800

    .line 86
    .line 87
    iput v3, v1, Lgv0;->d:I

    .line 88
    .line 89
    iput v2, v1, Lgv0;->k:F

    .line 90
    .line 91
    :goto_1
    iget-wide v2, v0, Lo11;->w:J

    .line 92
    .line 93
    invoke-virtual {v1, v2, v3}, Lgv0;->i(J)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v0, Lo11;->x:Lx01;

    .line 97
    .line 98
    iget-object v3, v1, Lgv0;->m:Lx01;

    .line 99
    .line 100
    invoke-static {v3, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_3

    .line 105
    .line 106
    iget v3, v1, Lgv0;->d:I

    .line 107
    .line 108
    or-int/lit16 v3, v3, 0x2000

    .line 109
    .line 110
    iput v3, v1, Lgv0;->d:I

    .line 111
    .line 112
    iput-object v2, v1, Lgv0;->m:Lx01;

    .line 113
    .line 114
    :cond_3
    iget-boolean v2, v0, Lo11;->y:Z

    .line 115
    .line 116
    iget-boolean v3, v1, Lgv0;->n:Z

    .line 117
    .line 118
    if-eq v3, v2, :cond_4

    .line 119
    .line 120
    iget v3, v1, Lgv0;->d:I

    .line 121
    .line 122
    or-int/lit16 v3, v3, 0x4000

    .line 123
    .line 124
    iput v3, v1, Lgv0;->d:I

    .line 125
    .line 126
    iput-boolean v2, v1, Lgv0;->n:Z

    .line 127
    .line 128
    :cond_4
    iget-wide v2, v0, Lo11;->z:J

    .line 129
    .line 130
    iget-wide v4, v1, Lgv0;->i:J

    .line 131
    .line 132
    invoke-static {v4, v5, v2, v3}, Lff;->c(JJ)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-nez v4, :cond_5

    .line 137
    .line 138
    iget v4, v1, Lgv0;->d:I

    .line 139
    .line 140
    or-int/lit8 v4, v4, 0x40

    .line 141
    .line 142
    iput v4, v1, Lgv0;->d:I

    .line 143
    .line 144
    iput-wide v2, v1, Lgv0;->i:J

    .line 145
    .line 146
    :cond_5
    iget-wide v2, v0, Lo11;->A:J

    .line 147
    .line 148
    iget-wide v4, v1, Lgv0;->j:J

    .line 149
    .line 150
    invoke-static {v4, v5, v2, v3}, Lff;->c(JJ)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_6

    .line 155
    .line 156
    iget v4, v1, Lgv0;->d:I

    .line 157
    .line 158
    or-int/lit16 v4, v4, 0x80

    .line 159
    .line 160
    iput v4, v1, Lgv0;->d:I

    .line 161
    .line 162
    iput-wide v2, v1, Lgv0;->j:J

    .line 163
    .line 164
    :cond_6
    iget v0, v0, Lo11;->B:I

    .line 165
    .line 166
    iget v2, v1, Lgv0;->r:I

    .line 167
    .line 168
    if-ne v2, v0, :cond_7

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    iget v2, v1, Lgv0;->d:I

    .line 172
    .line 173
    const/high16 v3, 0x80000

    .line 174
    .line 175
    or-int/2addr v2, v3

    .line 176
    iput v2, v1, Lgv0;->d:I

    .line 177
    .line 178
    iput v0, v1, Lgv0;->r:I

    .line 179
    .line 180
    :goto_2
    return-object v10

    .line 181
    :pswitch_1
    check-cast v1, Ljava/util/List;

    .line 182
    .line 183
    check-cast v0, Lk80;

    .line 184
    .line 185
    invoke-virtual {v0}, Lk80;->invoke()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Ljava/lang/Float;

    .line 190
    .line 191
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0

    .line 199
    :pswitch_2
    check-cast v1, Lf01;

    .line 200
    .line 201
    check-cast v0, Ljava/lang/String;

    .line 202
    .line 203
    sget-object v2, Ld01;->a:[Lu40;

    .line 204
    .line 205
    sget-object v2, Lb01;->a:Le01;

    .line 206
    .line 207
    invoke-static {v0}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-interface {v1, v2, v0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    return-object v10

    .line 215
    :pswitch_3
    check-cast v1, Lf01;

    .line 216
    .line 217
    check-cast v0, Lxv0;

    .line 218
    .line 219
    iget v0, v0, Lxv0;->a:I

    .line 220
    .line 221
    invoke-static {v1, v0}, Ld01;->a(Lf01;I)V

    .line 222
    .line 223
    .line 224
    return-object v10

    .line 225
    :pswitch_4
    check-cast v0, Lkh0;

    .line 226
    .line 227
    if-ne v1, v0, :cond_8

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_8
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    :goto_3
    return-object v7

    .line 235
    :pswitch_5
    check-cast v0, Leh0;

    .line 236
    .line 237
    if-ne v1, v0, :cond_9

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    :goto_4
    return-object v7

    .line 245
    :pswitch_6
    check-cast v0, Ldh0;

    .line 246
    .line 247
    if-ne v1, v0, :cond_a

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_a
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    :goto_5
    return-object v7

    .line 255
    :pswitch_7
    check-cast v1, Lne0;

    .line 256
    .line 257
    check-cast v0, Lsh0;

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_8
    check-cast v1, Lbb1;

    .line 266
    .line 267
    check-cast v0, Lay;

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Lay;->g(Lbb1;)V

    .line 270
    .line 271
    .line 272
    iget-object v0, v0, Lay;->i:Lsw;

    .line 273
    .line 274
    if-eqz v0, :cond_b

    .line 275
    .line 276
    invoke-interface {v0, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :cond_b
    return-object v10

    .line 280
    :pswitch_9
    check-cast v1, Luq;

    .line 281
    .line 282
    check-cast v0, Lxx;

    .line 283
    .line 284
    invoke-interface {v1}, Luq;->t()Lo8;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v2}, Lo8;->f()Lbd;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    iget-object v0, v0, Lxx;->g:Lww;

    .line 293
    .line 294
    if-eqz v0, :cond_c

    .line 295
    .line 296
    invoke-interface {v1}, Luq;->t()Lo8;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    iget-object v1, v1, Lo8;->b:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v1, Lvx;

    .line 303
    .line 304
    invoke-interface {v0, v2, v1}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    :cond_c
    return-object v10

    .line 308
    :pswitch_a
    check-cast v1, Luq;

    .line 309
    .line 310
    check-cast v0, Lvx;

    .line 311
    .line 312
    iget-object v2, v0, Lvx;->l:Ld6;

    .line 313
    .line 314
    iget-boolean v3, v0, Lvx;->n:Z

    .line 315
    .line 316
    if-eqz v3, :cond_d

    .line 317
    .line 318
    iget-boolean v3, v0, Lvx;->w:Z

    .line 319
    .line 320
    if-eqz v3, :cond_d

    .line 321
    .line 322
    if-eqz v2, :cond_d

    .line 323
    .line 324
    invoke-interface {v1}, Luq;->t()Lo8;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-virtual {v3}, Lo8;->h()J

    .line 329
    .line 330
    .line 331
    move-result-wide v4

    .line 332
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    invoke-interface {v6}, Lbd;->i()V

    .line 337
    .line 338
    .line 339
    :try_start_0
    iget-object v6, v3, Lo8;->a:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v6, Lx1;

    .line 342
    .line 343
    iget-object v6, v6, Lx1;->e:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v6, Lo8;

    .line 346
    .line 347
    invoke-virtual {v6}, Lo8;->f()Lbd;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-interface {v6, v2}, Lbd;->p(Ld6;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v1}, Lvx;->c(Luq;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-interface {v0}, Lbd;->g()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3, v4, v5}, Lo8;->q(J)V

    .line 365
    .line 366
    .line 367
    goto :goto_6

    .line 368
    :catchall_0
    move-exception v0

    .line 369
    invoke-virtual {v3}, Lo8;->f()Lbd;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-interface {v1}, Lbd;->g()V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v3, v4, v5}, Lo8;->q(J)V

    .line 377
    .line 378
    .line 379
    throw v0

    .line 380
    :cond_d
    invoke-virtual {v0, v1}, Lvx;->c(Luq;)V

    .line 381
    .line 382
    .line 383
    :goto_6
    return-object v10

    .line 384
    :pswitch_b
    sget-object v1, Lrx;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 385
    .line 386
    invoke-virtual {v1, v6, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_e

    .line 391
    .line 392
    check-cast v0, Lvb;

    .line 393
    .line 394
    invoke-interface {v0, v10}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    :cond_e
    return-object v10

    .line 398
    :pswitch_c
    check-cast v1, Lx81;

    .line 399
    .line 400
    check-cast v0, Lus;

    .line 401
    .line 402
    sget-object v2, Lms;->d:Lms;

    .line 403
    .line 404
    sget-object v3, Lms;->e:Lms;

    .line 405
    .line 406
    invoke-virtual {v1, v2, v3}, Lx81;->a(Lms;Lms;)Z

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-eqz v2, :cond_f

    .line 411
    .line 412
    iget-object v0, v0, Lus;->u:Lvs;

    .line 413
    .line 414
    iget-object v0, v0, Lvs;->a:Lc91;

    .line 415
    .line 416
    iget-object v0, v0, Lc91;->a:Lkd;

    .line 417
    .line 418
    if-eqz v0, :cond_11

    .line 419
    .line 420
    iget-object v9, v0, Lkd;->c:Lo31;

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_f
    sget-object v2, Lms;->f:Lms;

    .line 424
    .line 425
    invoke-virtual {v1, v3, v2}, Lx81;->a(Lms;Lms;)Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-eqz v1, :cond_10

    .line 430
    .line 431
    iget-object v0, v0, Lus;->v:Ljt;

    .line 432
    .line 433
    iget-object v0, v0, Ljt;->a:Lc91;

    .line 434
    .line 435
    iget-object v0, v0, Lc91;->a:Lkd;

    .line 436
    .line 437
    if-eqz v0, :cond_11

    .line 438
    .line 439
    iget-object v9, v0, Lkd;->c:Lo31;

    .line 440
    .line 441
    goto :goto_7

    .line 442
    :cond_10
    sget-object v9, Lrs;->c:Lo31;

    .line 443
    .line 444
    :cond_11
    :goto_7
    if-nez v9, :cond_12

    .line 445
    .line 446
    sget-object v9, Lrs;->c:Lo31;

    .line 447
    .line 448
    :cond_12
    return-object v9

    .line 449
    :pswitch_d
    check-cast v1, Lsp;

    .line 450
    .line 451
    iget-object v2, v1, Loe0;->d:Loe0;

    .line 452
    .line 453
    iget-boolean v2, v2, Loe0;->q:Z

    .line 454
    .line 455
    if-nez v2, :cond_13

    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_13
    iget-object v2, v1, Lsp;->s:Lsp;

    .line 459
    .line 460
    if-eqz v2, :cond_15

    .line 461
    .line 462
    check-cast v0, Lx1;

    .line 463
    .line 464
    new-instance v3, Ls2;

    .line 465
    .line 466
    const/16 v5, 0x9

    .line 467
    .line 468
    invoke-direct {v3, v5, v0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3, v2}, Ls2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    if-eq v0, v4, :cond_14

    .line 476
    .line 477
    goto :goto_8

    .line 478
    :cond_14
    invoke-static {v2, v3}, Lr60;->F(Lh91;Lsw;)V

    .line 479
    .line 480
    .line 481
    :cond_15
    :goto_8
    iput-object v9, v1, Lsp;->s:Lsp;

    .line 482
    .line 483
    iput-object v9, v1, Lsp;->r:Lsp;

    .line 484
    .line 485
    move-object v3, v4

    .line 486
    :goto_9
    return-object v3

    .line 487
    :pswitch_e
    check-cast v1, Lsp;

    .line 488
    .line 489
    iget-boolean v2, v1, Loe0;->q:Z

    .line 490
    .line 491
    if-nez v2, :cond_16

    .line 492
    .line 493
    goto :goto_b

    .line 494
    :cond_16
    iget-object v2, v1, Lsp;->s:Lsp;

    .line 495
    .line 496
    if-nez v2, :cond_17

    .line 497
    .line 498
    goto :goto_a

    .line 499
    :cond_17
    const-string v2, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    .line 500
    .line 501
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    :goto_a
    iput-object v9, v1, Lsp;->s:Lsp;

    .line 505
    .line 506
    check-cast v0, Lvt0;

    .line 507
    .line 508
    iget-boolean v1, v0, Lvt0;->d:Z

    .line 509
    .line 510
    iput-boolean v1, v0, Lvt0;->d:Z

    .line 511
    .line 512
    move-object v3, v4

    .line 513
    :goto_b
    return-object v3

    .line 514
    :pswitch_f
    check-cast v1, Ljava/lang/Throwable;

    .line 515
    .line 516
    if-eqz v1, :cond_18

    .line 517
    .line 518
    check-cast v0, Landroid/os/CancellationSignal;

    .line 519
    .line 520
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 521
    .line 522
    .line 523
    :cond_18
    return-object v10

    .line 524
    :pswitch_10
    check-cast v1, La8;

    .line 525
    .line 526
    iget v2, v1, La8;->b:F

    .line 527
    .line 528
    const/4 v3, 0x0

    .line 529
    cmpg-float v4, v2, v3

    .line 530
    .line 531
    if-gez v4, :cond_19

    .line 532
    .line 533
    move v2, v3

    .line 534
    :cond_19
    const/high16 v4, 0x3f800000    # 1.0f

    .line 535
    .line 536
    cmpl-float v5, v2, v4

    .line 537
    .line 538
    if-lez v5, :cond_1a

    .line 539
    .line 540
    move v2, v4

    .line 541
    :cond_1a
    iget v5, v1, La8;->c:F

    .line 542
    .line 543
    const/high16 v6, -0x41000000    # -0.5f

    .line 544
    .line 545
    cmpg-float v7, v5, v6

    .line 546
    .line 547
    if-gez v7, :cond_1b

    .line 548
    .line 549
    move v5, v6

    .line 550
    :cond_1b
    const/high16 v7, 0x3f000000    # 0.5f

    .line 551
    .line 552
    cmpl-float v8, v5, v7

    .line 553
    .line 554
    if-lez v8, :cond_1c

    .line 555
    .line 556
    move v5, v7

    .line 557
    :cond_1c
    iget v8, v1, La8;->d:F

    .line 558
    .line 559
    cmpg-float v9, v8, v6

    .line 560
    .line 561
    if-gez v9, :cond_1d

    .line 562
    .line 563
    goto :goto_c

    .line 564
    :cond_1d
    move v6, v8

    .line 565
    :goto_c
    cmpl-float v8, v6, v7

    .line 566
    .line 567
    if-lez v8, :cond_1e

    .line 568
    .line 569
    goto :goto_d

    .line 570
    :cond_1e
    move v7, v6

    .line 571
    :goto_d
    iget v1, v1, La8;->a:F

    .line 572
    .line 573
    cmpg-float v6, v1, v3

    .line 574
    .line 575
    if-gez v6, :cond_1f

    .line 576
    .line 577
    goto :goto_e

    .line 578
    :cond_1f
    move v3, v1

    .line 579
    :goto_e
    cmpl-float v1, v3, v4

    .line 580
    .line 581
    if-lez v1, :cond_20

    .line 582
    .line 583
    goto :goto_f

    .line 584
    :cond_20
    move v4, v3

    .line 585
    :goto_f
    sget-object v1, Lrf;->x:Lqk0;

    .line 586
    .line 587
    invoke-static {v2, v5, v7, v4, v1}, Lp30;->a(FFFFLof;)J

    .line 588
    .line 589
    .line 590
    move-result-wide v1

    .line 591
    check-cast v0, Lof;

    .line 592
    .line 593
    invoke-static {v1, v2, v0}, Lff;->a(JLof;)J

    .line 594
    .line 595
    .line 596
    move-result-wide v0

    .line 597
    new-instance v2, Lff;

    .line 598
    .line 599
    invoke-direct {v2, v0, v1}, Lff;-><init>(J)V

    .line 600
    .line 601
    .line 602
    return-object v2

    .line 603
    :pswitch_11
    check-cast v1, Loo;

    .line 604
    .line 605
    check-cast v0, Lqo;

    .line 606
    .line 607
    new-instance v1, Lk4;

    .line 608
    .line 609
    invoke-direct {v1, v6, v0}, Lk4;-><init>(ILjava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    return-object v1

    .line 613
    :pswitch_12
    check-cast v1, Lxz0;

    .line 614
    .line 615
    check-cast v0, Landroid/content/res/Resources;

    .line 616
    .line 617
    invoke-static {v1, v0}, Lrd0;->h(Lxz0;Landroid/content/res/Resources;)Z

    .line 618
    .line 619
    .line 620
    move-result v0

    .line 621
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    return-object v0

    .line 626
    :pswitch_13
    check-cast v1, Lxz0;

    .line 627
    .line 628
    check-cast v0, Lu20;

    .line 629
    .line 630
    iget v1, v1, Lxz0;->g:I

    .line 631
    .line 632
    invoke-virtual {v0, v1}, Lu20;->a(I)Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    return-object v0

    .line 641
    :pswitch_14
    move-object v11, v1

    .line 642
    check-cast v11, Lvb0;

    .line 643
    .line 644
    check-cast v0, Lj3;

    .line 645
    .line 646
    iget-object v0, v0, Lj3;->s:Lw3;

    .line 647
    .line 648
    invoke-virtual {v0}, Lw3;->getInsetsListener()Ll20;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    iget-object v1, v1, Ll20;->i:Ldp0;

    .line 653
    .line 654
    invoke-virtual {v1}, Ldp0;->g()I

    .line 655
    .line 656
    .line 657
    move-result v1

    .line 658
    if-lez v1, :cond_23

    .line 659
    .line 660
    sget-object v1, Lhe1;->a:Lug0;

    .line 661
    .line 662
    invoke-virtual {v11}, Lvb0;->a()Li50;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-interface {v1}, Li50;->G()J

    .line 667
    .line 668
    .line 669
    move-result-wide v1

    .line 670
    invoke-virtual {v0}, Lw3;->getInsetsListener()Ll20;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    iget-object v3, v3, Ll20;->h:Ljh0;

    .line 675
    .line 676
    shr-long v4, v1, v5

    .line 677
    .line 678
    long-to-int v15, v4

    .line 679
    const-wide v4, 0xffffffffL

    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    and-long/2addr v1, v4

    .line 685
    long-to-int v1, v1

    .line 686
    sget-object v2, Lhe1;->b:[Lfe1;

    .line 687
    .line 688
    array-length v4, v2

    .line 689
    move v5, v6

    .line 690
    :goto_10
    if-ge v5, v4, :cond_22

    .line 691
    .line 692
    aget-object v7, v2, v5

    .line 693
    .line 694
    invoke-virtual {v3, v7}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v8

    .line 698
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    check-cast v8, Lpe1;

    .line 702
    .line 703
    move-object v9, v7

    .line 704
    check-cast v9, Lge1;

    .line 705
    .line 706
    iget-object v12, v9, Lge1;->c:Ld20;

    .line 707
    .line 708
    iget-wide v13, v8, Lpe1;->h:J

    .line 709
    .line 710
    move/from16 v16, v1

    .line 711
    .line 712
    invoke-static/range {v11 .. v16}, Lhe1;->a(Lvb0;Ld20;JII)V

    .line 713
    .line 714
    .line 715
    iget-object v1, v8, Lpe1;->b:Lgp0;

    .line 716
    .line 717
    invoke-virtual {v1}, Lgp0;->getValue()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    check-cast v1, Ljava/lang/Boolean;

    .line 722
    .line 723
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    if-eqz v1, :cond_21

    .line 728
    .line 729
    iget-object v12, v8, Lpe1;->f:Ld20;

    .line 730
    .line 731
    iget-wide v13, v8, Lpe1;->j:J

    .line 732
    .line 733
    invoke-static/range {v11 .. v16}, Lhe1;->a(Lvb0;Ld20;JII)V

    .line 734
    .line 735
    .line 736
    iget-object v12, v8, Lpe1;->g:Ld20;

    .line 737
    .line 738
    iget-wide v13, v8, Lpe1;->k:J

    .line 739
    .line 740
    invoke-static/range {v11 .. v16}, Lhe1;->a(Lvb0;Ld20;JII)V

    .line 741
    .line 742
    .line 743
    :cond_21
    check-cast v7, Lge1;

    .line 744
    .line 745
    iget-object v12, v7, Lge1;->d:Ld20;

    .line 746
    .line 747
    iget-wide v13, v8, Lpe1;->i:J

    .line 748
    .line 749
    invoke-static/range {v11 .. v16}, Lhe1;->a(Lvb0;Ld20;JII)V

    .line 750
    .line 751
    .line 752
    add-int/lit8 v5, v5, 0x1

    .line 753
    .line 754
    move/from16 v1, v16

    .line 755
    .line 756
    goto :goto_10

    .line 757
    :cond_22
    invoke-virtual {v0}, Lw3;->getInsetsListener()Ll20;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    iget-object v1, v1, Ll20;->j:Ldh0;

    .line 762
    .line 763
    invoke-virtual {v1}, Ldh0;->i()Z

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    if-eqz v2, :cond_23

    .line 768
    .line 769
    invoke-virtual {v0}, Lw3;->getInsetsListener()Ll20;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    iget-object v0, v0, Ll20;->k:Lc31;

    .line 774
    .line 775
    iget-object v2, v1, Ldh0;->a:[Ljava/lang/Object;

    .line 776
    .line 777
    iget v1, v1, Ldh0;->b:I

    .line 778
    .line 779
    :goto_11
    if-ge v6, v1, :cond_23

    .line 780
    .line 781
    aget-object v3, v2, v6

    .line 782
    .line 783
    check-cast v3, Loh0;

    .line 784
    .line 785
    invoke-virtual {v0, v6}, Lc31;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    check-cast v4, Ld20;

    .line 790
    .line 791
    invoke-interface {v3}, Lw31;->getValue()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    check-cast v3, Landroid/graphics/Rect;

    .line 796
    .line 797
    invoke-virtual {v4}, Ld20;->b()Lez;

    .line 798
    .line 799
    .line 800
    move-result-object v5

    .line 801
    iget v7, v3, Landroid/graphics/Rect;->left:I

    .line 802
    .line 803
    int-to-float v7, v7

    .line 804
    invoke-virtual {v11, v5, v7}, Lvb0;->d(Lez;F)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v4}, Ld20;->d()Lez;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    iget v7, v3, Landroid/graphics/Rect;->top:I

    .line 812
    .line 813
    int-to-float v7, v7

    .line 814
    invoke-virtual {v11, v5, v7}, Lvb0;->d(Lez;F)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v4}, Ld20;->c()Lez;

    .line 818
    .line 819
    .line 820
    move-result-object v5

    .line 821
    iget v7, v3, Landroid/graphics/Rect;->right:I

    .line 822
    .line 823
    int-to-float v7, v7

    .line 824
    invoke-virtual {v11, v5, v7}, Lvb0;->d(Lez;F)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v4}, Ld20;->a()Lez;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 832
    .line 833
    int-to-float v3, v3

    .line 834
    invoke-virtual {v11, v4, v3}, Lvb0;->d(Lez;F)V

    .line 835
    .line 836
    .line 837
    add-int/lit8 v6, v6, 0x1

    .line 838
    .line 839
    goto :goto_11

    .line 840
    :cond_23
    return-object v10

    .line 841
    :pswitch_15
    check-cast v1, Ldv;

    .line 842
    .line 843
    check-cast v0, Lqu;

    .line 844
    .line 845
    iget v0, v0, Lqu;->a:I

    .line 846
    .line 847
    invoke-virtual {v1, v0}, Ldv;->D0(I)Z

    .line 848
    .line 849
    .line 850
    move-result v0

    .line 851
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    return-object v0

    .line 856
    :pswitch_16
    check-cast v1, Lt2;

    .line 857
    .line 858
    check-cast v0, Lc60;

    .line 859
    .line 860
    invoke-interface {v1}, Lt2;->L()I

    .line 861
    .line 862
    .line 863
    move-result v2

    .line 864
    const v3, 0x7fffffff

    .line 865
    .line 866
    .line 867
    if-ne v2, v3, :cond_24

    .line 868
    .line 869
    goto/16 :goto_15

    .line 870
    .line 871
    :cond_24
    invoke-interface {v1}, Lt2;->a()Lc60;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    iget-boolean v2, v2, Lc60;->b:Z

    .line 876
    .line 877
    if-eqz v2, :cond_25

    .line 878
    .line 879
    invoke-interface {v1}, Lt2;->u()V

    .line 880
    .line 881
    .line 882
    :cond_25
    invoke-interface {v1}, Lt2;->a()Lc60;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    iget-object v2, v2, Lc60;->g:Ljava/util/HashMap;

    .line 887
    .line 888
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    if-eqz v3, :cond_26

    .line 901
    .line 902
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    check-cast v3, Ljava/util/Map$Entry;

    .line 907
    .line 908
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    check-cast v4, Lo2;

    .line 913
    .line 914
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    check-cast v3, Ljava/lang/Number;

    .line 919
    .line 920
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 921
    .line 922
    .line 923
    move-result v3

    .line 924
    invoke-interface {v1}, Lt2;->r()Lc20;

    .line 925
    .line 926
    .line 927
    move-result-object v5

    .line 928
    invoke-static {v0, v4, v3, v5}, Lc60;->a(Lc60;Lo2;ILqj0;)V

    .line 929
    .line 930
    .line 931
    goto :goto_12

    .line 932
    :cond_26
    invoke-interface {v1}, Lt2;->r()Lc20;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    iget-object v1, v1, Lqj0;->t:Lqj0;

    .line 937
    .line 938
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    :goto_13
    iget-object v2, v0, Lc60;->a:Lt2;

    .line 942
    .line 943
    invoke-interface {v2}, Lt2;->r()Lc20;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v2

    .line 951
    if-nez v2, :cond_28

    .line 952
    .line 953
    invoke-virtual {v0, v1}, Lc60;->b(Lqj0;)Ljava/util/Map;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    check-cast v2, Ljava/lang/Iterable;

    .line 962
    .line 963
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 968
    .line 969
    .line 970
    move-result v3

    .line 971
    if-eqz v3, :cond_27

    .line 972
    .line 973
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v3

    .line 977
    check-cast v3, Lo2;

    .line 978
    .line 979
    invoke-virtual {v0, v1, v3}, Lc60;->c(Lqj0;Lo2;)I

    .line 980
    .line 981
    .line 982
    move-result v4

    .line 983
    invoke-static {v0, v3, v4, v1}, Lc60;->a(Lc60;Lo2;ILqj0;)V

    .line 984
    .line 985
    .line 986
    goto :goto_14

    .line 987
    :cond_27
    iget-object v1, v1, Lqj0;->t:Lqj0;

    .line 988
    .line 989
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    .line 991
    .line 992
    goto :goto_13

    .line 993
    :cond_28
    :goto_15
    return-object v10

    .line 994
    nop

    .line 995
    :pswitch_data_0
    .packed-switch 0x0
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
