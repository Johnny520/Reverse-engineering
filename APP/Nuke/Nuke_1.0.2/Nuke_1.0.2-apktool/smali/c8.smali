.class public final synthetic Lc8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    iput p3, p0, Lc8;->h:I

    .line 2
    .line 3
    iput-wide p1, p0, Lc8;->i:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc8;->h:I

    .line 4
    .line 5
    const v2, 0x3e8f5c29    # 0.28f

    .line 6
    .line 7
    .line 8
    const v3, 0x3f3851ec    # 0.72f

    .line 9
    .line 10
    .line 11
    const v4, 0x3f1eb852    # 0.62f

    .line 12
    .line 13
    .line 14
    const v5, 0x3ec28f5c    # 0.38f

    .line 15
    .line 16
    .line 17
    const v6, 0x3eae147b    # 0.34f

    .line 18
    .line 19
    .line 20
    const/high16 v7, 0x3f000000    # 0.5f

    .line 21
    .line 22
    const/high16 v8, 0x40000000    # 2.0f

    .line 23
    .line 24
    iget-wide v9, v0, Lc8;->i:J

    .line 25
    .line 26
    const/16 v11, 0x20

    .line 27
    .line 28
    const-wide v12, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    sget-object v14, La83;->a:La83;

    .line 34
    .line 35
    packed-switch v1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    check-cast v0, Lnc0;

    .line 41
    .line 42
    const/high16 v1, 0x40800000    # 4.0f

    .line 43
    .line 44
    invoke-interface {v0, v1}, Le70;->A(F)F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-interface {v0}, Lnc0;->d()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    and-long/2addr v2, v12

    .line 53
    long-to-int v2, v2

    .line 54
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    const/high16 v2, 0x40c00000    # 6.0f

    .line 63
    .line 64
    invoke-interface {v0, v2}, Le70;->A(F)F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-interface {v0}, Lnc0;->d()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    and-long/2addr v3, v12

    .line 73
    long-to-int v3, v3

    .line 74
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    sub-float/2addr v3, v1

    .line 79
    div-float/2addr v3, v8

    .line 80
    cmpl-float v4, v3, v2

    .line 81
    .line 82
    if-lez v4, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move v2, v3

    .line 86
    :goto_0
    invoke-interface {v0}, Lnc0;->getLayoutDirection()Ld61;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    sget-object v4, Ld61;->i:Ld61;

    .line 91
    .line 92
    if-ne v3, v4, :cond_1

    .line 93
    .line 94
    invoke-interface {v0}, Lnc0;->a0()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    invoke-interface {v0}, Lnc0;->E()Lb5;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v5}, Lb5;->u()J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    invoke-virtual {v5}, Lb5;->q()Lqp;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-interface {v8}, Lqp;->l()V

    .line 111
    .line 112
    .line 113
    :try_start_0
    iget-object v8, v5, Lb5;->i:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v8, Ln4;

    .line 116
    .line 117
    const/high16 v11, -0x40800000    # -1.0f

    .line 118
    .line 119
    const/high16 v12, 0x3f800000    # 1.0f

    .line 120
    .line 121
    invoke-virtual {v8, v11, v12, v3, v4}, Ln4;->A(FFJ)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v9, v10, v1, v2}, Ltl;->u(Lnc0;JFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    .line 127
    invoke-static {v5, v6, v7}, Lvi0;->r(Lb5;J)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    invoke-static {v5, v6, v7}, Lvi0;->r(Lb5;J)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_1
    invoke-static {v0, v9, v10, v1, v2}, Ltl;->u(Lnc0;JFF)V

    .line 137
    .line 138
    .line 139
    :goto_1
    return-object v14

    .line 140
    :pswitch_0
    move-object/from16 v15, p1

    .line 141
    .line 142
    check-cast v15, Lnc0;

    .line 143
    .line 144
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-interface {v15, v8}, Le70;->A(F)F

    .line 148
    .line 149
    .line 150
    move-result v22

    .line 151
    invoke-interface {v15}, Lnc0;->d()J

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    shr-long/2addr v1, v11

    .line 156
    long-to-int v1, v1

    .line 157
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    const v2, 0x3f28f5c3    # 0.66f

    .line 162
    .line 163
    .line 164
    mul-float/2addr v1, v2

    .line 165
    invoke-interface {v15}, Lnc0;->d()J

    .line 166
    .line 167
    .line 168
    move-result-wide v3

    .line 169
    and-long/2addr v3, v12

    .line 170
    long-to-int v3, v3

    .line 171
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    const v4, 0x3e75c28f    # 0.24f

    .line 176
    .line 177
    .line 178
    mul-float/2addr v3, v4

    .line 179
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    int-to-long v4, v1

    .line 184
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    int-to-long v8, v1

    .line 189
    shl-long v3, v4, v11

    .line 190
    .line 191
    and-long/2addr v8, v12

    .line 192
    or-long v18, v3, v8

    .line 193
    .line 194
    invoke-interface {v15}, Lnc0;->d()J

    .line 195
    .line 196
    .line 197
    move-result-wide v3

    .line 198
    shr-long/2addr v3, v11

    .line 199
    long-to-int v1, v3

    .line 200
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    mul-float/2addr v1, v6

    .line 205
    invoke-interface {v15}, Lnc0;->d()J

    .line 206
    .line 207
    .line 208
    move-result-wide v3

    .line 209
    and-long/2addr v3, v12

    .line 210
    long-to-int v3, v3

    .line 211
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    mul-float/2addr v3, v7

    .line 216
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    int-to-long v4, v1

    .line 221
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    int-to-long v6, v1

    .line 226
    shl-long v3, v4, v11

    .line 227
    .line 228
    and-long v5, v6, v12

    .line 229
    .line 230
    or-long v20, v3, v5

    .line 231
    .line 232
    invoke-interface {v15}, Lnc0;->d()J

    .line 233
    .line 234
    .line 235
    move-result-wide v3

    .line 236
    shr-long/2addr v3, v11

    .line 237
    long-to-int v1, v3

    .line 238
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    mul-float/2addr v1, v2

    .line 243
    invoke-interface {v15}, Lnc0;->d()J

    .line 244
    .line 245
    .line 246
    move-result-wide v2

    .line 247
    and-long/2addr v2, v12

    .line 248
    long-to-int v2, v2

    .line 249
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    const v3, 0x3f428f5c    # 0.76f

    .line 254
    .line 255
    .line 256
    mul-float/2addr v2, v3

    .line 257
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    int-to-long v3, v1

    .line 262
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    int-to-long v1, v1

    .line 267
    shl-long/2addr v3, v11

    .line 268
    and-long/2addr v1, v12

    .line 269
    or-long/2addr v1, v3

    .line 270
    const/16 v23, 0x1

    .line 271
    .line 272
    const/16 v24, 0x1e0

    .line 273
    .line 274
    iget-wide v3, v0, Lc8;->i:J

    .line 275
    .line 276
    move-wide/from16 v16, v3

    .line 277
    .line 278
    invoke-static/range {v15 .. v24}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 279
    .line 280
    .line 281
    move-wide/from16 v18, v20

    .line 282
    .line 283
    move-wide/from16 v20, v1

    .line 284
    .line 285
    invoke-static/range {v15 .. v24}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 286
    .line 287
    .line 288
    return-object v14

    .line 289
    :pswitch_1
    move-object/from16 v3, p1

    .line 290
    .line 291
    check-cast v3, Lnc0;

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    const v1, 0x3fe66666    # 1.8f

    .line 297
    .line 298
    .line 299
    invoke-interface {v3, v1}, Le70;->A(F)F

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    invoke-interface {v3}, Lnc0;->d()J

    .line 304
    .line 305
    .line 306
    move-result-wide v1

    .line 307
    shr-long/2addr v1, v11

    .line 308
    long-to-int v1, v1

    .line 309
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    const/high16 v2, 0x3e800000    # 0.25f

    .line 314
    .line 315
    mul-float/2addr v1, v2

    .line 316
    invoke-interface {v3}, Lnc0;->d()J

    .line 317
    .line 318
    .line 319
    move-result-wide v8

    .line 320
    and-long/2addr v8, v12

    .line 321
    long-to-int v2, v8

    .line 322
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    mul-float/2addr v2, v5

    .line 327
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    int-to-long v8, v1

    .line 332
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    int-to-long v1, v1

    .line 337
    shl-long/2addr v8, v11

    .line 338
    and-long/2addr v1, v12

    .line 339
    or-long/2addr v1, v8

    .line 340
    invoke-interface {v3}, Lnc0;->d()J

    .line 341
    .line 342
    .line 343
    move-result-wide v8

    .line 344
    shr-long/2addr v8, v11

    .line 345
    long-to-int v6, v8

    .line 346
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    mul-float/2addr v6, v7

    .line 351
    invoke-interface {v3}, Lnc0;->d()J

    .line 352
    .line 353
    .line 354
    move-result-wide v7

    .line 355
    and-long/2addr v7, v12

    .line 356
    long-to-int v7, v7

    .line 357
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    mul-float/2addr v7, v4

    .line 362
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    int-to-long v8, v4

    .line 367
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    int-to-long v6, v4

    .line 372
    shl-long/2addr v8, v11

    .line 373
    and-long/2addr v6, v12

    .line 374
    or-long/2addr v6, v8

    .line 375
    invoke-interface {v3}, Lnc0;->d()J

    .line 376
    .line 377
    .line 378
    move-result-wide v8

    .line 379
    shr-long/2addr v8, v11

    .line 380
    long-to-int v4, v8

    .line 381
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    const/high16 v8, 0x3f400000    # 0.75f

    .line 386
    .line 387
    mul-float/2addr v4, v8

    .line 388
    invoke-interface {v3}, Lnc0;->d()J

    .line 389
    .line 390
    .line 391
    move-result-wide v8

    .line 392
    and-long/2addr v8, v12

    .line 393
    long-to-int v8, v8

    .line 394
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    mul-float/2addr v8, v5

    .line 399
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    int-to-long v4, v4

    .line 404
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    int-to-long v8, v8

    .line 409
    shl-long/2addr v4, v11

    .line 410
    and-long/2addr v8, v12

    .line 411
    or-long v15, v4, v8

    .line 412
    .line 413
    const/4 v11, 0x1

    .line 414
    const/16 v12, 0x1e0

    .line 415
    .line 416
    iget-wide v4, v0, Lc8;->i:J

    .line 417
    .line 418
    move-wide v8, v6

    .line 419
    move-wide v6, v1

    .line 420
    invoke-static/range {v3 .. v12}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 421
    .line 422
    .line 423
    move-wide v6, v8

    .line 424
    move-wide v8, v15

    .line 425
    invoke-static/range {v3 .. v12}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 426
    .line 427
    .line 428
    return-object v14

    .line 429
    :pswitch_2
    move-object/from16 v0, p1

    .line 430
    .line 431
    check-cast v0, Lnc0;

    .line 432
    .line 433
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-interface {v0, v8}, Le70;->A(F)F

    .line 437
    .line 438
    .line 439
    move-result v16

    .line 440
    invoke-static {}, Laa;->a()Ly9;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-interface {v0}, Lnc0;->d()J

    .line 445
    .line 446
    .line 447
    move-result-wide v4

    .line 448
    shr-long/2addr v4, v11

    .line 449
    long-to-int v4, v4

    .line 450
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    const v5, 0x3e6147ae    # 0.22f

    .line 455
    .line 456
    .line 457
    mul-float/2addr v4, v5

    .line 458
    invoke-interface {v0}, Lnc0;->d()J

    .line 459
    .line 460
    .line 461
    move-result-wide v5

    .line 462
    and-long/2addr v5, v12

    .line 463
    long-to-int v5, v5

    .line 464
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    const v6, 0x3f051eb8    # 0.52f

    .line 469
    .line 470
    .line 471
    mul-float/2addr v5, v6

    .line 472
    iget-object v6, v1, Ly9;->a:Landroid/graphics/Path;

    .line 473
    .line 474
    invoke-virtual {v6, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 475
    .line 476
    .line 477
    invoke-interface {v0}, Lnc0;->d()J

    .line 478
    .line 479
    .line 480
    move-result-wide v4

    .line 481
    shr-long/2addr v4, v11

    .line 482
    long-to-int v4, v4

    .line 483
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    const v5, 0x3ed70a3d    # 0.42f

    .line 488
    .line 489
    .line 490
    mul-float/2addr v4, v5

    .line 491
    invoke-interface {v0}, Lnc0;->d()J

    .line 492
    .line 493
    .line 494
    move-result-wide v5

    .line 495
    and-long/2addr v5, v12

    .line 496
    long-to-int v5, v5

    .line 497
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    mul-float/2addr v5, v3

    .line 502
    invoke-virtual {v1, v4, v5}, Ly9;->e(FF)V

    .line 503
    .line 504
    .line 505
    invoke-interface {v0}, Lnc0;->d()J

    .line 506
    .line 507
    .line 508
    move-result-wide v3

    .line 509
    shr-long/2addr v3, v11

    .line 510
    long-to-int v3, v3

    .line 511
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    const v4, 0x3f47ae14    # 0.78f

    .line 516
    .line 517
    .line 518
    mul-float/2addr v3, v4

    .line 519
    invoke-interface {v0}, Lnc0;->d()J

    .line 520
    .line 521
    .line 522
    move-result-wide v4

    .line 523
    and-long/2addr v4, v12

    .line 524
    long-to-int v4, v4

    .line 525
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    mul-float/2addr v4, v2

    .line 530
    invoke-virtual {v1, v3, v4}, Ly9;->e(FF)V

    .line 531
    .line 532
    .line 533
    new-instance v15, Lxv2;

    .line 534
    .line 535
    const/16 v19, 0x1

    .line 536
    .line 537
    const/16 v20, 0x12

    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/16 v18, 0x1

    .line 542
    .line 543
    invoke-direct/range {v15 .. v20}, Lxv2;-><init>(FFIII)V

    .line 544
    .line 545
    .line 546
    invoke-interface {v0, v1, v9, v10, v15}, Lnc0;->t(Ly9;JLop0;)V

    .line 547
    .line 548
    .line 549
    return-object v14

    .line 550
    :pswitch_3
    move-object/from16 v1, p1

    .line 551
    .line 552
    check-cast v1, Lnc0;

    .line 553
    .line 554
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    const v6, 0x3ff33333    # 1.9f

    .line 558
    .line 559
    .line 560
    invoke-interface {v1, v6}, Le70;->A(F)F

    .line 561
    .line 562
    .line 563
    move-result v23

    .line 564
    invoke-interface {v1}, Lnc0;->d()J

    .line 565
    .line 566
    .line 567
    move-result-wide v8

    .line 568
    shr-long/2addr v8, v11

    .line 569
    long-to-int v6, v8

    .line 570
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    mul-float/2addr v6, v5

    .line 575
    invoke-interface {v1}, Lnc0;->d()J

    .line 576
    .line 577
    .line 578
    move-result-wide v8

    .line 579
    shr-long/2addr v8, v11

    .line 580
    long-to-int v5, v8

    .line 581
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    mul-float/2addr v5, v4

    .line 586
    invoke-interface {v1}, Lnc0;->d()J

    .line 587
    .line 588
    .line 589
    move-result-wide v8

    .line 590
    and-long/2addr v8, v12

    .line 591
    long-to-int v4, v8

    .line 592
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    mul-float/2addr v4, v2

    .line 597
    invoke-interface {v1}, Lnc0;->d()J

    .line 598
    .line 599
    .line 600
    move-result-wide v8

    .line 601
    and-long/2addr v8, v12

    .line 602
    long-to-int v2, v8

    .line 603
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    mul-float/2addr v2, v7

    .line 608
    invoke-interface {v1}, Lnc0;->d()J

    .line 609
    .line 610
    .line 611
    move-result-wide v7

    .line 612
    and-long/2addr v7, v12

    .line 613
    long-to-int v7, v7

    .line 614
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    mul-float/2addr v7, v3

    .line 619
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 620
    .line 621
    .line 622
    move-result v3

    .line 623
    int-to-long v8, v3

    .line 624
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    int-to-long v3, v3

    .line 629
    shl-long/2addr v8, v11

    .line 630
    and-long/2addr v3, v12

    .line 631
    or-long v19, v8, v3

    .line 632
    .line 633
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    int-to-long v3, v3

    .line 638
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    int-to-long v8, v2

    .line 643
    shl-long v2, v3, v11

    .line 644
    .line 645
    and-long v4, v8, v12

    .line 646
    .line 647
    or-long v21, v2, v4

    .line 648
    .line 649
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    int-to-long v2, v2

    .line 654
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    int-to-long v4, v4

    .line 659
    shl-long/2addr v2, v11

    .line 660
    and-long/2addr v4, v12

    .line 661
    or-long/2addr v2, v4

    .line 662
    const/16 v24, 0x1

    .line 663
    .line 664
    const/16 v25, 0x1e0

    .line 665
    .line 666
    iget-wide v4, v0, Lc8;->i:J

    .line 667
    .line 668
    move-object/from16 v16, v1

    .line 669
    .line 670
    move-wide/from16 v17, v4

    .line 671
    .line 672
    invoke-static/range {v16 .. v25}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 673
    .line 674
    .line 675
    move-wide/from16 v19, v21

    .line 676
    .line 677
    move-wide/from16 v21, v2

    .line 678
    .line 679
    invoke-static/range {v16 .. v25}, Lnc0;->Q(Lnc0;JJJFII)V

    .line 680
    .line 681
    .line 682
    return-object v14

    .line 683
    :pswitch_4
    move-object/from16 v4, p1

    .line 684
    .line 685
    check-cast v4, Lnc0;

    .line 686
    .line 687
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-interface {v4}, Lnc0;->d()J

    .line 691
    .line 692
    .line 693
    move-result-wide v1

    .line 694
    invoke-static {v1, v2}, Lgr2;->b(J)F

    .line 695
    .line 696
    .line 697
    move-result v1

    .line 698
    const v2, 0x3e3851ec    # 0.18f

    .line 699
    .line 700
    .line 701
    mul-float v29, v1, v2

    .line 702
    .line 703
    invoke-interface {v4}, Lnc0;->d()J

    .line 704
    .line 705
    .line 706
    move-result-wide v1

    .line 707
    shr-long/2addr v1, v11

    .line 708
    long-to-int v1, v1

    .line 709
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    mul-float/2addr v1, v7

    .line 714
    invoke-interface {v4}, Lnc0;->d()J

    .line 715
    .line 716
    .line 717
    move-result-wide v2

    .line 718
    and-long/2addr v2, v12

    .line 719
    long-to-int v2, v2

    .line 720
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    mul-float/2addr v2, v6

    .line 725
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    int-to-long v5, v1

    .line 730
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 731
    .line 732
    .line 733
    move-result v1

    .line 734
    int-to-long v1, v1

    .line 735
    shl-long/2addr v5, v11

    .line 736
    and-long/2addr v1, v12

    .line 737
    or-long v30, v5, v1

    .line 738
    .line 739
    const/16 v32, 0x0

    .line 740
    .line 741
    const/16 v33, 0x78

    .line 742
    .line 743
    iget-wide v0, v0, Lc8;->i:J

    .line 744
    .line 745
    move-wide/from16 v27, v0

    .line 746
    .line 747
    move-object/from16 v26, v4

    .line 748
    .line 749
    invoke-static/range {v26 .. v33}, Lnc0;->O(Lnc0;JFJLxv2;I)V

    .line 750
    .line 751
    .line 752
    const v2, 0x3f51eb85    # 0.82f

    .line 753
    .line 754
    .line 755
    invoke-static {v2, v0, v1}, Lju;->b(FJ)J

    .line 756
    .line 757
    .line 758
    move-result-wide v5

    .line 759
    invoke-interface {v4}, Lnc0;->d()J

    .line 760
    .line 761
    .line 762
    move-result-wide v0

    .line 763
    invoke-static {v0, v1}, Lgr2;->b(J)F

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    const v1, 0x3ea3d70a    # 0.32f

    .line 768
    .line 769
    .line 770
    mul-float/2addr v0, v1

    .line 771
    invoke-interface {v4}, Lnc0;->d()J

    .line 772
    .line 773
    .line 774
    move-result-wide v1

    .line 775
    shr-long/2addr v1, v11

    .line 776
    long-to-int v1, v1

    .line 777
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 778
    .line 779
    .line 780
    move-result v1

    .line 781
    mul-float/2addr v1, v7

    .line 782
    invoke-interface {v4}, Lnc0;->d()J

    .line 783
    .line 784
    .line 785
    move-result-wide v2

    .line 786
    and-long/2addr v2, v12

    .line 787
    long-to-int v2, v2

    .line 788
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    const v3, 0x3f6147ae    # 0.88f

    .line 793
    .line 794
    .line 795
    mul-float/2addr v2, v3

    .line 796
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 797
    .line 798
    .line 799
    move-result v1

    .line 800
    int-to-long v7, v1

    .line 801
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    int-to-long v1, v1

    .line 806
    shl-long/2addr v7, v11

    .line 807
    and-long/2addr v1, v12

    .line 808
    or-long v8, v7, v1

    .line 809
    .line 810
    const/4 v10, 0x0

    .line 811
    const/16 v11, 0x78

    .line 812
    .line 813
    move v7, v0

    .line 814
    invoke-static/range {v4 .. v11}, Lnc0;->O(Lnc0;JFJLxv2;I)V

    .line 815
    .line 816
    .line 817
    return-object v14

    .line 818
    :pswitch_5
    move-object/from16 v1, p1

    .line 819
    .line 820
    check-cast v1, Lzn2;

    .line 821
    .line 822
    sget-object v2, Lgn2;->a:Lyn2;

    .line 823
    .line 824
    new-instance v3, Lfn2;

    .line 825
    .line 826
    sget-object v7, Len2;->i:Len2;

    .line 827
    .line 828
    const/4 v8, 0x1

    .line 829
    sget-object v4, Lrr0;->h:Lrr0;

    .line 830
    .line 831
    iget-wide v5, v0, Lc8;->i:J

    .line 832
    .line 833
    invoke-direct/range {v3 .. v8}, Lfn2;-><init>(Lrr0;JLen2;Z)V

    .line 834
    .line 835
    .line 836
    invoke-interface {v1, v2, v3}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    return-object v14

    .line 840
    :pswitch_6
    move-object/from16 v0, p1

    .line 841
    .line 842
    check-cast v0, Lym;

    .line 843
    .line 844
    iget-object v1, v0, Lym;->b:Lin0;

    .line 845
    .line 846
    if-nez v1, :cond_2

    .line 847
    .line 848
    goto :goto_3

    .line 849
    :cond_2
    iget-object v2, v0, Lym;->a:Lmp;

    .line 850
    .line 851
    if-eqz v2, :cond_3

    .line 852
    .line 853
    :try_start_1
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-interface {v1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 861
    goto :goto_2

    .line 862
    :catchall_1
    move-exception v0

    .line 863
    new-instance v1, Lx92;

    .line 864
    .line 865
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 866
    .line 867
    .line 868
    move-object v0, v1

    .line 869
    :goto_2
    invoke-virtual {v2, v0}, Lmp;->h(Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    :cond_3
    :goto_3
    return-object v14

    .line 873
    :pswitch_7
    move-object/from16 v0, p1

    .line 874
    .line 875
    check-cast v0, Lqo;

    .line 876
    .line 877
    iget-object v1, v0, Lqo;->h:Lrn;

    .line 878
    .line 879
    invoke-interface {v1}, Lrn;->d()J

    .line 880
    .line 881
    .line 882
    move-result-wide v1

    .line 883
    shr-long/2addr v1, v11

    .line 884
    long-to-int v1, v1

    .line 885
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 886
    .line 887
    .line 888
    move-result v1

    .line 889
    div-float/2addr v1, v8

    .line 890
    invoke-static {v0, v1}, Lrp0;->X(Lqo;F)Ld9;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    new-instance v3, Lcl;

    .line 895
    .line 896
    const/4 v4, 0x5

    .line 897
    invoke-direct {v3, v9, v10, v4}, Lcl;-><init>(JI)V

    .line 898
    .line 899
    .line 900
    new-instance v4, Ld8;

    .line 901
    .line 902
    invoke-direct {v4, v1, v2, v3}, Ld8;-><init>(FLd9;Lcl;)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v0, v4}, Lqo;->a(Lin0;)Ln4;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    return-object v0

    .line 910
    nop

    .line 911
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
