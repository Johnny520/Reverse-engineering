.class public final synthetic Lge;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lge;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lge;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lge;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p4, p0, Lge;->i:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lge;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, Lge;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lge;->j:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v8, v6

    .line 17
    check-cast v8, Lxm0;

    .line 18
    .line 19
    check-cast v5, Lxm0;

    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Lpb2;

    .line 24
    .line 25
    move-object/from16 v6, p2

    .line 26
    .line 27
    check-cast v6, Lpx;

    .line 28
    .line 29
    move-object/from16 v7, p3

    .line 30
    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    and-int/lit8 v9, v7, 0x6

    .line 41
    .line 42
    if-nez v9, :cond_1

    .line 43
    .line 44
    move-object v9, v6

    .line 45
    check-cast v9, Lgo0;

    .line 46
    .line 47
    invoke-virtual {v9, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eqz v9, :cond_0

    .line 52
    .line 53
    const/4 v9, 0x4

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v9, 0x2

    .line 56
    :goto_0
    or-int/2addr v7, v9

    .line 57
    :cond_1
    and-int/lit8 v9, v7, 0x13

    .line 58
    .line 59
    const/16 v10, 0x12

    .line 60
    .line 61
    if-eq v9, v10, :cond_2

    .line 62
    .line 63
    move v3, v4

    .line 64
    :cond_2
    and-int/2addr v4, v7

    .line 65
    move-object v12, v6

    .line 66
    check-cast v12, Lgo0;

    .line 67
    .line 68
    invoke-virtual {v12, v4, v3}, Lgo0;->O(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    const v3, 0x790b0111

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v12}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    const/4 v13, 0x0

    .line 86
    const/16 v14, 0x38

    .line 87
    .line 88
    const/4 v10, 0x0

    .line 89
    const/4 v11, 0x0

    .line 90
    invoke-static/range {v7 .. v14}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 91
    .line 92
    .line 93
    const v3, 0x790b014a

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v12}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x30

    .line 106
    .line 107
    move-object v14, v12

    .line 108
    iget-boolean v12, v0, Lge;->i:Z

    .line 109
    .line 110
    move-object v10, v5

    .line 111
    invoke-static/range {v9 .. v16}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    invoke-virtual {v12}, Lgo0;->R()V

    .line 116
    .line 117
    .line 118
    :goto_1
    return-object v2

    .line 119
    :pswitch_0
    check-cast v6, Lxk1;

    .line 120
    .line 121
    check-cast v5, Lxk1;

    .line 122
    .line 123
    move-object/from16 v1, p1

    .line 124
    .line 125
    check-cast v1, Lbv;

    .line 126
    .line 127
    move-object/from16 v7, p2

    .line 128
    .line 129
    check-cast v7, Lpx;

    .line 130
    .line 131
    move-object/from16 v8, p3

    .line 132
    .line 133
    check-cast v8, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    and-int/lit8 v1, v8, 0x11

    .line 143
    .line 144
    const/16 v9, 0x10

    .line 145
    .line 146
    if-eq v1, v9, :cond_4

    .line 147
    .line 148
    move v1, v4

    .line 149
    goto :goto_2

    .line 150
    :cond_4
    move v1, v3

    .line 151
    :goto_2
    and-int/2addr v8, v4

    .line 152
    check-cast v7, Lgo0;

    .line 153
    .line 154
    invoke-virtual {v7, v8, v1}, Lgo0;->O(IZ)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_b

    .line 159
    .line 160
    sget-object v1, Lte;->e:Lyi0;

    .line 161
    .line 162
    invoke-static {v7}, Lgf1;->P(Lpx;)Lnl2;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-static {v1, v8}, Lgf1;->b0(Luh1;Lnl2;)Luh1;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    sget-object v8, Ltp0;->c:Lvf;

    .line 171
    .line 172
    sget-object v9, Lsn;->u:Lpk;

    .line 173
    .line 174
    invoke-static {v8, v9, v7, v3}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    iget-wide v9, v7, Lgo0;->T:J

    .line 179
    .line 180
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    invoke-virtual {v7}, Lgo0;->l()Lyy1;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    invoke-static {v7, v1}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    sget-object v11, Lhx;->c:Lgx;

    .line 193
    .line 194
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object v11, Lgx;->b:Ljy;

    .line 198
    .line 199
    invoke-virtual {v7}, Lgo0;->Z()V

    .line 200
    .line 201
    .line 202
    iget-boolean v12, v7, Lgo0;->S:Z

    .line 203
    .line 204
    if-eqz v12, :cond_5

    .line 205
    .line 206
    invoke-virtual {v7, v11}, Lgo0;->k(Lxm0;)V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_5
    invoke-virtual {v7}, Lgo0;->i0()V

    .line 211
    .line 212
    .line 213
    :goto_3
    sget-object v11, Lgx;->e:Llc;

    .line 214
    .line 215
    invoke-static {v7, v11, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    sget-object v8, Lgx;->d:Llc;

    .line 219
    .line 220
    invoke-static {v7, v8, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    sget-object v9, Lgx;->f:Llc;

    .line 228
    .line 229
    invoke-static {v7, v9, v8}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    sget-object v8, Lgx;->g:Lv6;

    .line 233
    .line 234
    invoke-static {v7, v8}, Lyf3;->b(Lpx;Lin0;)V

    .line 235
    .line 236
    .line 237
    sget-object v8, Lgx;->c:Llc;

    .line 238
    .line 239
    invoke-static {v7, v8, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    const v1, 0x790b0046

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-static {v1, v7, v3}, Lrg3;->b(Ljava/lang/String;Lpx;I)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v6}, Lgu2;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move-object v9, v1

    .line 257
    check-cast v9, Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v7, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    sget-object v10, Lnx;->a:Leb;

    .line 268
    .line 269
    if-nez v1, :cond_6

    .line 270
    .line 271
    if-ne v8, v10, :cond_7

    .line 272
    .line 273
    :cond_6
    new-instance v8, Lh0;

    .line 274
    .line 275
    const/16 v1, 0xb

    .line 276
    .line 277
    invoke-direct {v8, v6, v1}, Lh0;-><init>(Lxk1;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v8}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_7
    check-cast v8, Lin0;

    .line 284
    .line 285
    const v1, 0x790b0047

    .line 286
    .line 287
    .line 288
    invoke-static {v1, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    const/16 v25, 0x0

    .line 293
    .line 294
    const/16 v26, 0x3e34

    .line 295
    .line 296
    const/4 v11, 0x0

    .line 297
    const/4 v13, 0x0

    .line 298
    const/4 v14, 0x0

    .line 299
    const/4 v15, 0x0

    .line 300
    const/16 v16, 0x2

    .line 301
    .line 302
    const/16 v17, 0x4

    .line 303
    .line 304
    const/16 v18, 0x0

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    const/16 v20, 0x0

    .line 309
    .line 310
    const/16 v21, 0x0

    .line 311
    .line 312
    const/16 v22, 0x0

    .line 313
    .line 314
    const/high16 v24, 0x6d80000

    .line 315
    .line 316
    move-object/from16 v23, v7

    .line 317
    .line 318
    move-object v1, v10

    .line 319
    move-object v10, v8

    .line 320
    invoke-static/range {v9 .. v26}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 321
    .line 322
    .line 323
    const/4 v12, 0x0

    .line 324
    const/16 v13, 0xd

    .line 325
    .line 326
    sget-object v14, Lrh1;->a:Lrh1;

    .line 327
    .line 328
    const/4 v9, 0x0

    .line 329
    const/high16 v16, 0x40e00000    # 7.0f

    .line 330
    .line 331
    const/4 v11, 0x0

    .line 332
    move-object v8, v14

    .line 333
    move/from16 v10, v16

    .line 334
    .line 335
    invoke-static/range {v8 .. v13}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    move/from16 v27, v10

    .line 340
    .line 341
    const v9, 0x790b0045

    .line 342
    .line 343
    .line 344
    invoke-static {v9, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    invoke-static {v7}, Lrg3;->x(Lgo0;)Lm13;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    const/16 v17, 0x30

    .line 353
    .line 354
    const/16 v18, 0x3f8

    .line 355
    .line 356
    const/4 v12, 0x0

    .line 357
    const/4 v13, 0x0

    .line 358
    const/4 v14, 0x0

    .line 359
    move-object v10, v6

    .line 360
    move-object/from16 v16, v7

    .line 361
    .line 362
    invoke-static/range {v9 .. v18}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 363
    .line 364
    .line 365
    const/high16 v6, 0x41800000    # 16.0f

    .line 366
    .line 367
    const v9, 0x790b0049

    .line 368
    .line 369
    .line 370
    invoke-static {v8, v6, v7, v9, v7}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    invoke-static {v6, v7, v3}, Lrg3;->b(Ljava/lang/String;Lpx;I)V

    .line 375
    .line 376
    .line 377
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    move-object v9, v6

    .line 382
    check-cast v9, Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {v7, v5}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    invoke-virtual {v7}, Lgo0;->L()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v10

    .line 392
    if-nez v6, :cond_8

    .line 393
    .line 394
    if-ne v10, v1, :cond_9

    .line 395
    .line 396
    :cond_8
    new-instance v10, Lh0;

    .line 397
    .line 398
    const/16 v1, 0xc

    .line 399
    .line 400
    invoke-direct {v10, v5, v1}, Lh0;-><init>(Lxk1;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7, v10}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_9
    check-cast v10, Lin0;

    .line 407
    .line 408
    const v1, 0x790b004a

    .line 409
    .line 410
    .line 411
    invoke-static {v1, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v12

    .line 415
    const/16 v25, 0x0

    .line 416
    .line 417
    const/16 v26, 0x3ff4

    .line 418
    .line 419
    const/4 v11, 0x0

    .line 420
    const/4 v13, 0x0

    .line 421
    const/4 v14, 0x0

    .line 422
    const/4 v15, 0x0

    .line 423
    const/16 v16, 0x0

    .line 424
    .line 425
    const/16 v17, 0x0

    .line 426
    .line 427
    const/16 v18, 0x0

    .line 428
    .line 429
    const/16 v19, 0x0

    .line 430
    .line 431
    const/16 v20, 0x0

    .line 432
    .line 433
    const/16 v21, 0x0

    .line 434
    .line 435
    const/16 v22, 0x0

    .line 436
    .line 437
    const/16 v24, 0x0

    .line 438
    .line 439
    move-object/from16 v23, v7

    .line 440
    .line 441
    invoke-static/range {v9 .. v26}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 442
    .line 443
    .line 444
    invoke-interface {v5}, Lgu2;->getValue()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    check-cast v1, Ljava/lang/String;

    .line 449
    .line 450
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    if-nez v1, :cond_a

    .line 455
    .line 456
    iget-boolean v0, v0, Lge;->i:Z

    .line 457
    .line 458
    if-nez v0, :cond_a

    .line 459
    .line 460
    const v0, 0x35aa669e

    .line 461
    .line 462
    .line 463
    invoke-virtual {v7, v0}, Lgo0;->W(I)V

    .line 464
    .line 465
    .line 466
    const/16 v18, 0x0

    .line 467
    .line 468
    const/16 v19, 0xd

    .line 469
    .line 470
    const/4 v15, 0x0

    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    move-object v14, v8

    .line 474
    move/from16 v16, v27

    .line 475
    .line 476
    invoke-static/range {v14 .. v19}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 477
    .line 478
    .line 479
    move-result-object v10

    .line 480
    const v0, 0x790b0048

    .line 481
    .line 482
    .line 483
    invoke-static {v0, v7}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-static {v7}, Lrg3;->x(Lgo0;)Lm13;

    .line 488
    .line 489
    .line 490
    move-result-object v11

    .line 491
    sget-object v0, Lur1;->a:Ltu2;

    .line 492
    .line 493
    invoke-virtual {v7, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    check-cast v0, Llp1;

    .line 498
    .line 499
    iget-wide v12, v0, Llp1;->g:J

    .line 500
    .line 501
    const/16 v23, 0x0

    .line 502
    .line 503
    const v24, 0xfffffe

    .line 504
    .line 505
    .line 506
    const-wide/16 v14, 0x0

    .line 507
    .line 508
    const/16 v16, 0x0

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const-wide/16 v18, 0x0

    .line 513
    .line 514
    const-wide/16 v20, 0x0

    .line 515
    .line 516
    const/16 v22, 0x0

    .line 517
    .line 518
    invoke-static/range {v11 .. v24}, Lm13;->a(Lm13;JJLim0;Lmx2;JJLw02;Lya1;I)Lm13;

    .line 519
    .line 520
    .line 521
    move-result-object v11

    .line 522
    const/16 v17, 0x30

    .line 523
    .line 524
    const/16 v18, 0x3f8

    .line 525
    .line 526
    const/4 v12, 0x0

    .line 527
    const/4 v13, 0x0

    .line 528
    const/4 v14, 0x0

    .line 529
    const/4 v15, 0x0

    .line 530
    move-object/from16 v16, v7

    .line 531
    .line 532
    invoke-static/range {v9 .. v18}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v7, v3}, Lgo0;->p(Z)V

    .line 536
    .line 537
    .line 538
    goto :goto_4

    .line 539
    :cond_a
    const v0, 0x35ae7fa7

    .line 540
    .line 541
    .line 542
    invoke-virtual {v7, v0}, Lgo0;->W(I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v7, v3}, Lgo0;->p(Z)V

    .line 546
    .line 547
    .line 548
    :goto_4
    invoke-virtual {v7, v4}, Lgo0;->p(Z)V

    .line 549
    .line 550
    .line 551
    goto :goto_5

    .line 552
    :cond_b
    invoke-virtual {v7}, Lgo0;->R()V

    .line 553
    .line 554
    .line 555
    :goto_5
    return-object v2

    .line 556
    nop

    .line 557
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
