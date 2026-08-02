.class public final synthetic Lih;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lxm0;

.field public final synthetic j:Lin0;

.field public final synthetic k:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxm0;Lin0;Lxk1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lih;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lih;->i:Lxm0;

    .line 4
    .line 5
    iput-object p2, p0, Lih;->j:Lin0;

    .line 6
    .line 7
    iput-object p3, p0, Lih;->k:Lxk1;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lih;->h:I

    .line 4
    .line 5
    const v2, 0x790b014a

    .line 6
    .line 7
    .line 8
    sget-object v3, La83;->a:La83;

    .line 9
    .line 10
    sget-object v4, Lnx;->a:Leb;

    .line 11
    .line 12
    const v5, 0x790b0111

    .line 13
    .line 14
    .line 15
    const/16 v6, 0x12

    .line 16
    .line 17
    const/4 v7, 0x4

    .line 18
    iget-object v8, v0, Lih;->k:Lxk1;

    .line 19
    .line 20
    iget-object v9, v0, Lih;->j:Lin0;

    .line 21
    .line 22
    const/4 v10, 0x2

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x1

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Lpb2;

    .line 31
    .line 32
    move-object/from16 v13, p2

    .line 33
    .line 34
    check-cast v13, Lpx;

    .line 35
    .line 36
    move-object/from16 v14, p3

    .line 37
    .line 38
    check-cast v14, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v14

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    and-int/lit8 v15, v14, 0x6

    .line 48
    .line 49
    if-nez v15, :cond_1

    .line 50
    .line 51
    move-object v15, v13

    .line 52
    check-cast v15, Lgo0;

    .line 53
    .line 54
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v15

    .line 58
    if-eqz v15, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v7, v10

    .line 62
    :goto_0
    or-int/2addr v14, v7

    .line 63
    :cond_1
    and-int/lit8 v7, v14, 0x13

    .line 64
    .line 65
    if-eq v7, v6, :cond_2

    .line 66
    .line 67
    move v11, v12

    .line 68
    :cond_2
    and-int/lit8 v6, v14, 0x1

    .line 69
    .line 70
    check-cast v13, Lgo0;

    .line 71
    .line 72
    invoke-virtual {v13, v6, v11}, Lgo0;->O(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_5

    .line 77
    .line 78
    invoke-static {v5, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v14

    .line 82
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    const/16 v21, 0x38

    .line 89
    .line 90
    iget-object v15, v0, Lih;->i:Lxm0;

    .line 91
    .line 92
    const/16 v17, 0x0

    .line 93
    .line 94
    const/16 v18, 0x0

    .line 95
    .line 96
    move-object/from16 v19, v13

    .line 97
    .line 98
    invoke-static/range {v14 .. v21}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 99
    .line 100
    .line 101
    invoke-static {v2, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    invoke-virtual {v13, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-virtual {v13, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    or-int/2addr v0, v2

    .line 114
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-nez v0, :cond_3

    .line 119
    .line 120
    if-ne v2, v4, :cond_4

    .line 121
    .line 122
    :cond_3
    new-instance v2, Lph;

    .line 123
    .line 124
    const/4 v0, 0x3

    .line 125
    invoke-direct {v2, v9, v8, v0}, Lph;-><init>(Lin0;Lxk1;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v13, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    move-object v15, v2

    .line 132
    check-cast v15, Lxm0;

    .line 133
    .line 134
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    const/16 v20, 0x0

    .line 139
    .line 140
    const/16 v21, 0x38

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    move-object/from16 v19, v13

    .line 147
    .line 148
    invoke-static/range {v14 .. v21}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    move-object/from16 v19, v13

    .line 153
    .line 154
    invoke-virtual/range {v19 .. v19}, Lgo0;->R()V

    .line 155
    .line 156
    .line 157
    :goto_1
    return-object v3

    .line 158
    :pswitch_0
    move-object/from16 v1, p1

    .line 159
    .line 160
    check-cast v1, Lpb2;

    .line 161
    .line 162
    move-object/from16 v13, p2

    .line 163
    .line 164
    check-cast v13, Lpx;

    .line 165
    .line 166
    move-object/from16 v14, p3

    .line 167
    .line 168
    check-cast v14, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    and-int/lit8 v15, v14, 0x6

    .line 178
    .line 179
    if-nez v15, :cond_7

    .line 180
    .line 181
    move-object v15, v13

    .line 182
    check-cast v15, Lgo0;

    .line 183
    .line 184
    invoke-virtual {v15, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    if-eqz v15, :cond_6

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    move v7, v10

    .line 192
    :goto_2
    or-int/2addr v14, v7

    .line 193
    :cond_7
    and-int/lit8 v7, v14, 0x13

    .line 194
    .line 195
    if-eq v7, v6, :cond_8

    .line 196
    .line 197
    move v11, v12

    .line 198
    :cond_8
    and-int/lit8 v6, v14, 0x1

    .line 199
    .line 200
    check-cast v13, Lgo0;

    .line 201
    .line 202
    invoke-virtual {v13, v6, v11}, Lgo0;->O(IZ)Z

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-eqz v6, :cond_b

    .line 207
    .line 208
    invoke-static {v5, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 213
    .line 214
    .line 215
    move-result-object v16

    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    const/16 v21, 0x38

    .line 219
    .line 220
    iget-object v15, v0, Lih;->i:Lxm0;

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    const/16 v18, 0x0

    .line 225
    .line 226
    move-object/from16 v19, v13

    .line 227
    .line 228
    invoke-static/range {v14 .. v21}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 229
    .line 230
    .line 231
    invoke-static {v2, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    invoke-virtual {v13, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    invoke-virtual {v13, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    or-int/2addr v0, v2

    .line 244
    invoke-virtual {v13}, Lgo0;->L()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    if-nez v0, :cond_9

    .line 249
    .line 250
    if-ne v2, v4, :cond_a

    .line 251
    .line 252
    :cond_9
    new-instance v2, Lph;

    .line 253
    .line 254
    invoke-direct {v2, v9, v8, v10}, Lph;-><init>(Lin0;Lxk1;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v13, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_a
    move-object v15, v2

    .line 261
    check-cast v15, Lxm0;

    .line 262
    .line 263
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 264
    .line 265
    .line 266
    move-result-object v16

    .line 267
    const/16 v20, 0x0

    .line 268
    .line 269
    const/16 v21, 0x38

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    .line 273
    const/16 v18, 0x0

    .line 274
    .line 275
    move-object/from16 v19, v13

    .line 276
    .line 277
    invoke-static/range {v14 .. v21}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 278
    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_b
    move-object/from16 v19, v13

    .line 282
    .line 283
    invoke-virtual/range {v19 .. v19}, Lgo0;->R()V

    .line 284
    .line 285
    .line 286
    :goto_3
    return-object v3

    .line 287
    :pswitch_1
    move-object/from16 v1, p1

    .line 288
    .line 289
    check-cast v1, Lpb2;

    .line 290
    .line 291
    move-object/from16 v2, p2

    .line 292
    .line 293
    check-cast v2, Lpx;

    .line 294
    .line 295
    move-object/from16 v13, p3

    .line 296
    .line 297
    check-cast v13, Ljava/lang/Integer;

    .line 298
    .line 299
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v13

    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    and-int/lit8 v14, v13, 0x6

    .line 307
    .line 308
    if-nez v14, :cond_d

    .line 309
    .line 310
    move-object v14, v2

    .line 311
    check-cast v14, Lgo0;

    .line 312
    .line 313
    invoke-virtual {v14, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v14

    .line 317
    if-eqz v14, :cond_c

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_c
    move v7, v10

    .line 321
    :goto_4
    or-int/2addr v13, v7

    .line 322
    :cond_d
    and-int/lit8 v7, v13, 0x13

    .line 323
    .line 324
    if-eq v7, v6, :cond_e

    .line 325
    .line 326
    move v11, v12

    .line 327
    :cond_e
    and-int/lit8 v6, v13, 0x1

    .line 328
    .line 329
    check-cast v2, Lgo0;

    .line 330
    .line 331
    invoke-virtual {v2, v6, v11}, Lgo0;->O(IZ)Z

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    if-eqz v6, :cond_11

    .line 336
    .line 337
    invoke-static {v5, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 342
    .line 343
    .line 344
    move-result-object v15

    .line 345
    const/16 v19, 0x0

    .line 346
    .line 347
    const/16 v20, 0x38

    .line 348
    .line 349
    iget-object v14, v0, Lih;->i:Lxm0;

    .line 350
    .line 351
    const/16 v16, 0x0

    .line 352
    .line 353
    const/16 v17, 0x0

    .line 354
    .line 355
    move-object/from16 v18, v2

    .line 356
    .line 357
    invoke-static/range {v13 .. v20}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v8}, Lgu2;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    check-cast v0, Ljava/util/Set;

    .line 365
    .line 366
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    const v5, 0x790b007c

    .line 379
    .line 380
    .line 381
    invoke-static {v5, v0, v2}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v13

    .line 385
    invoke-virtual {v2, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    invoke-virtual {v2, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    or-int/2addr v0, v5

    .line 394
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    if-nez v0, :cond_f

    .line 399
    .line 400
    if-ne v5, v4, :cond_10

    .line 401
    .line 402
    :cond_f
    new-instance v5, Lph;

    .line 403
    .line 404
    invoke-direct {v5, v9, v8, v12}, Lph;-><init>(Lin0;Lxk1;I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    :cond_10
    move-object v14, v5

    .line 411
    check-cast v14, Lxm0;

    .line 412
    .line 413
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 414
    .line 415
    .line 416
    move-result-object v15

    .line 417
    const/16 v19, 0x0

    .line 418
    .line 419
    const/16 v20, 0x38

    .line 420
    .line 421
    const/16 v16, 0x0

    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    move-object/from16 v18, v2

    .line 426
    .line 427
    invoke-static/range {v13 .. v20}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 428
    .line 429
    .line 430
    goto :goto_5

    .line 431
    :cond_11
    move-object/from16 v18, v2

    .line 432
    .line 433
    invoke-virtual/range {v18 .. v18}, Lgo0;->R()V

    .line 434
    .line 435
    .line 436
    :goto_5
    return-object v3

    .line 437
    :pswitch_2
    move-object/from16 v1, p1

    .line 438
    .line 439
    check-cast v1, Lpb2;

    .line 440
    .line 441
    move-object/from16 v2, p2

    .line 442
    .line 443
    check-cast v2, Lpx;

    .line 444
    .line 445
    move-object/from16 v13, p3

    .line 446
    .line 447
    check-cast v13, Ljava/lang/Integer;

    .line 448
    .line 449
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 450
    .line 451
    .line 452
    move-result v13

    .line 453
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    and-int/lit8 v14, v13, 0x6

    .line 457
    .line 458
    if-nez v14, :cond_13

    .line 459
    .line 460
    move-object v14, v2

    .line 461
    check-cast v14, Lgo0;

    .line 462
    .line 463
    invoke-virtual {v14, v1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v14

    .line 467
    if-eqz v14, :cond_12

    .line 468
    .line 469
    goto :goto_6

    .line 470
    :cond_12
    move v7, v10

    .line 471
    :goto_6
    or-int/2addr v13, v7

    .line 472
    :cond_13
    and-int/lit8 v7, v13, 0x13

    .line 473
    .line 474
    if-eq v7, v6, :cond_14

    .line 475
    .line 476
    move v6, v12

    .line 477
    goto :goto_7

    .line 478
    :cond_14
    move v6, v11

    .line 479
    :goto_7
    and-int/lit8 v7, v13, 0x1

    .line 480
    .line 481
    check-cast v2, Lgo0;

    .line 482
    .line 483
    invoke-virtual {v2, v7, v6}, Lgo0;->O(IZ)Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    if-eqz v6, :cond_17

    .line 488
    .line 489
    invoke-static {v5, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v12

    .line 493
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 494
    .line 495
    .line 496
    move-result-object v14

    .line 497
    const/16 v18, 0x0

    .line 498
    .line 499
    const/16 v19, 0x38

    .line 500
    .line 501
    iget-object v13, v0, Lih;->i:Lxm0;

    .line 502
    .line 503
    const/4 v15, 0x0

    .line 504
    const/16 v16, 0x0

    .line 505
    .line 506
    move-object/from16 v17, v2

    .line 507
    .line 508
    invoke-static/range {v12 .. v19}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 509
    .line 510
    .line 511
    invoke-interface {v8}, Lgu2;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    check-cast v0, Ljava/util/Set;

    .line 516
    .line 517
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    const v5, 0x790b0056

    .line 530
    .line 531
    .line 532
    invoke-static {v5, v0, v2}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v12

    .line 536
    invoke-virtual {v2, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    invoke-virtual {v2, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    or-int/2addr v0, v5

    .line 545
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    if-nez v0, :cond_15

    .line 550
    .line 551
    if-ne v5, v4, :cond_16

    .line 552
    .line 553
    :cond_15
    new-instance v5, Lph;

    .line 554
    .line 555
    invoke-direct {v5, v9, v8, v11}, Lph;-><init>(Lin0;Lxk1;I)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2, v5}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    :cond_16
    move-object v13, v5

    .line 562
    check-cast v13, Lxm0;

    .line 563
    .line 564
    invoke-static {v1}, Lpb2;->a(Lpb2;)Luh1;

    .line 565
    .line 566
    .line 567
    move-result-object v14

    .line 568
    const/16 v18, 0x0

    .line 569
    .line 570
    const/16 v19, 0x38

    .line 571
    .line 572
    const/4 v15, 0x0

    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    move-object/from16 v17, v2

    .line 576
    .line 577
    invoke-static/range {v12 .. v19}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 578
    .line 579
    .line 580
    goto :goto_8

    .line 581
    :cond_17
    move-object/from16 v17, v2

    .line 582
    .line 583
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 584
    .line 585
    .line 586
    :goto_8
    return-object v3

    .line 587
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
