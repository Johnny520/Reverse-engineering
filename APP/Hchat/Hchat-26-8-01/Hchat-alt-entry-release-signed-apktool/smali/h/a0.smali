.class public abstract Lh/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static final a(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Lfg/p;Ls0/d;Li0/h0;I)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move-object/from16 v11, p7

    .line 16
    .line 17
    move/from16 v0, p8

    .line 18
    .line 19
    iget-object v8, v1, Li/k1;->d:Li0/j1;

    .line 20
    .line 21
    const v9, 0x72039c2f

    .line 22
    .line 23
    .line 24
    invoke-virtual {v11, v9}, Li0/h0;->b0(I)Li0/h0;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v9, v0, 0x6

    .line 28
    .line 29
    const/4 v10, 0x4

    .line 30
    if-nez v9, :cond_1

    .line 31
    .line 32
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-eqz v9, :cond_0

    .line 37
    .line 38
    move v9, v10

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v9, 0x2

    .line 41
    :goto_0
    or-int/2addr v9, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v9, v0

    .line 44
    :goto_1
    and-int/lit8 v12, v0, 0x30

    .line 45
    .line 46
    if-nez v12, :cond_3

    .line 47
    .line 48
    invoke-virtual {v11, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    if-eqz v12, :cond_2

    .line 53
    .line 54
    const/16 v12, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v12, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v9, v12

    .line 60
    :cond_3
    and-int/lit16 v12, v0, 0x180

    .line 61
    .line 62
    if-nez v12, :cond_5

    .line 63
    .line 64
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-eqz v12, :cond_4

    .line 69
    .line 70
    const/16 v12, 0x100

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/16 v12, 0x80

    .line 74
    .line 75
    :goto_3
    or-int/2addr v9, v12

    .line 76
    :cond_5
    and-int/lit16 v12, v0, 0xc00

    .line 77
    .line 78
    if-nez v12, :cond_7

    .line 79
    .line 80
    invoke-virtual {v11, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-eqz v12, :cond_6

    .line 85
    .line 86
    const/16 v12, 0x800

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    const/16 v12, 0x400

    .line 90
    .line 91
    :goto_4
    or-int/2addr v9, v12

    .line 92
    :cond_7
    and-int/lit16 v12, v0, 0x6000

    .line 93
    .line 94
    if-nez v12, :cond_9

    .line 95
    .line 96
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-eqz v12, :cond_8

    .line 101
    .line 102
    const/16 v12, 0x4000

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_8
    const/16 v12, 0x2000

    .line 106
    .line 107
    :goto_5
    or-int/2addr v9, v12

    .line 108
    :cond_9
    const/high16 v12, 0x30000

    .line 109
    .line 110
    and-int/2addr v12, v0

    .line 111
    if-nez v12, :cond_b

    .line 112
    .line 113
    invoke-virtual {v11, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-eqz v12, :cond_a

    .line 118
    .line 119
    const/high16 v12, 0x20000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    const/high16 v12, 0x10000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v9, v12

    .line 125
    :cond_b
    const/high16 v12, 0x180000

    .line 126
    .line 127
    or-int/2addr v9, v12

    .line 128
    const/high16 v12, 0xc00000

    .line 129
    .line 130
    and-int/2addr v12, v0

    .line 131
    if-nez v12, :cond_d

    .line 132
    .line 133
    invoke-virtual {v11, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eqz v12, :cond_c

    .line 138
    .line 139
    const/high16 v12, 0x800000

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_c
    const/high16 v12, 0x400000

    .line 143
    .line 144
    :goto_7
    or-int/2addr v9, v12

    .line 145
    :cond_d
    move v14, v9

    .line 146
    const v9, 0x492493

    .line 147
    .line 148
    .line 149
    and-int/2addr v9, v14

    .line 150
    const v12, 0x492492

    .line 151
    .line 152
    .line 153
    const/16 v16, 0x1

    .line 154
    .line 155
    const/4 v15, 0x0

    .line 156
    if-eq v9, v12, :cond_e

    .line 157
    .line 158
    move/from16 v9, v16

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_e
    move v9, v15

    .line 162
    :goto_8
    and-int/lit8 v12, v14, 0x1

    .line 163
    .line 164
    invoke-virtual {v11, v12, v9}, Li0/h0;->S(IZ)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_45

    .line 169
    .line 170
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-interface {v2, v9}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    check-cast v9, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-nez v9, :cond_10

    .line 185
    .line 186
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    invoke-interface {v2, v9}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    check-cast v9, Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-nez v9, :cond_10

    .line 201
    .line 202
    invoke-virtual {v1}, Li/k1;->g()Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-nez v9, :cond_10

    .line 207
    .line 208
    invoke-virtual {v1}, Li/k1;->d()Z

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    if-eqz v9, :cond_f

    .line 213
    .line 214
    goto :goto_9

    .line 215
    :cond_f
    const v8, -0xdabcc8d

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11, v8}, Li0/h0;->a0(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v15}, Li0/h0;->p(Z)V

    .line 222
    .line 223
    .line 224
    move-object v1, v7

    .line 225
    goto/16 :goto_20

    .line 226
    .line 227
    :cond_10
    :goto_9
    const v9, -0xdd9ee57

    .line 228
    .line 229
    .line 230
    invoke-virtual {v11, v9}, Li0/h0;->a0(I)V

    .line 231
    .line 232
    .line 233
    and-int/lit8 v9, v14, 0xe

    .line 234
    .line 235
    or-int/lit8 v12, v9, 0x30

    .line 236
    .line 237
    and-int/lit8 v13, v12, 0xe

    .line 238
    .line 239
    xor-int/lit8 v15, v13, 0x6

    .line 240
    .line 241
    const/4 v0, 0x6

    .line 242
    if-le v15, v10, :cond_11

    .line 243
    .line 244
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    if-nez v15, :cond_12

    .line 249
    .line 250
    :cond_11
    and-int/2addr v12, v0

    .line 251
    if-ne v12, v10, :cond_13

    .line 252
    .line 253
    :cond_12
    move/from16 v12, v16

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_13
    const/4 v12, 0x0

    .line 257
    :goto_a
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v15

    .line 261
    move/from16 v18, v12

    .line 262
    .line 263
    sget-object v12, Li0/l;->a:Li0/e;

    .line 264
    .line 265
    if-nez v18, :cond_14

    .line 266
    .line 267
    if-ne v15, v12, :cond_15

    .line 268
    .line 269
    :cond_14
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v15

    .line 273
    invoke-virtual {v11, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :cond_15
    invoke-virtual {v1}, Li/k1;->g()Z

    .line 277
    .line 278
    .line 279
    move-result v18

    .line 280
    if-eqz v18, :cond_16

    .line 281
    .line 282
    invoke-virtual {v1}, Li/k1;->c()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v15

    .line 286
    :cond_16
    move/from16 v18, v0

    .line 287
    .line 288
    const v0, 0x6defb3b0

    .line 289
    .line 290
    .line 291
    invoke-virtual {v11, v0}, Li0/h0;->a0(I)V

    .line 292
    .line 293
    .line 294
    invoke-static {v1, v2, v15, v11}, Lh/a0;->d(Li/k1;Lfg/l;Ljava/lang/Object;Li0/h0;)Lh/f0;

    .line 295
    .line 296
    .line 297
    move-result-object v15

    .line 298
    const/4 v10, 0x0

    .line 299
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    invoke-virtual {v11, v0}, Li0/h0;->a0(I)V

    .line 307
    .line 308
    .line 309
    invoke-static {v1, v2, v8, v11}, Lh/a0;->d(Li/k1;Lfg/l;Ljava/lang/Object;Li0/h0;)Lh/f0;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 314
    .line 315
    .line 316
    or-int/lit16 v8, v13, 0xc00

    .line 317
    .line 318
    and-int/lit8 v10, v8, 0xe

    .line 319
    .line 320
    xor-int/lit8 v10, v10, 0x6

    .line 321
    .line 322
    const/4 v13, 0x4

    .line 323
    if-le v10, v13, :cond_17

    .line 324
    .line 325
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v19

    .line 329
    if-nez v19, :cond_18

    .line 330
    .line 331
    :cond_17
    and-int/lit8 v2, v8, 0x6

    .line 332
    .line 333
    if-ne v2, v13, :cond_19

    .line 334
    .line 335
    :cond_18
    move/from16 v2, v16

    .line 336
    .line 337
    goto :goto_b

    .line 338
    :cond_19
    const/4 v2, 0x0

    .line 339
    :goto_b
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v13

    .line 343
    if-nez v2, :cond_1b

    .line 344
    .line 345
    if-ne v13, v12, :cond_1a

    .line 346
    .line 347
    goto :goto_c

    .line 348
    :cond_1a
    move/from16 v20, v8

    .line 349
    .line 350
    move/from16 v21, v14

    .line 351
    .line 352
    goto :goto_d

    .line 353
    :cond_1b
    :goto_c
    new-instance v13, Li/k1;

    .line 354
    .line 355
    new-instance v2, Lb/e;

    .line 356
    .line 357
    invoke-direct {v2, v15}, Lb/e;-><init>(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    move/from16 v20, v8

    .line 361
    .line 362
    new-instance v8, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    move/from16 v21, v14

    .line 368
    .line 369
    iget-object v14, v1, Li/k1;->c:Ljava/lang/String;

    .line 370
    .line 371
    const-string v7, " > EnterExitTransition"

    .line 372
    .line 373
    invoke-static {v8, v14, v7}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    invoke-direct {v13, v2, v1, v7}, Li/k1;-><init>(Lb/e;Li/k1;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v11, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :goto_d
    move-object v8, v13

    .line 384
    check-cast v8, Li/k1;

    .line 385
    .line 386
    const/4 v13, 0x4

    .line 387
    if-le v10, v13, :cond_1c

    .line 388
    .line 389
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-nez v2, :cond_1d

    .line 394
    .line 395
    :cond_1c
    and-int/lit8 v2, v20, 0x6

    .line 396
    .line 397
    if-ne v2, v13, :cond_1e

    .line 398
    .line 399
    :cond_1d
    move/from16 v2, v16

    .line 400
    .line 401
    goto :goto_e

    .line 402
    :cond_1e
    const/4 v2, 0x0

    .line 403
    :goto_e
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    or-int/2addr v2, v7

    .line 408
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    if-nez v2, :cond_1f

    .line 413
    .line 414
    if-ne v7, v12, :cond_20

    .line 415
    .line 416
    :cond_1f
    new-instance v7, Lc9/i;

    .line 417
    .line 418
    const/16 v2, 0x10

    .line 419
    .line 420
    invoke-direct {v7, v1, v2, v8}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v11, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    :cond_20
    check-cast v7, Lfg/l;

    .line 427
    .line 428
    invoke-static {v8, v7, v11}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1}, Li/k1;->g()Z

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    if-eqz v2, :cond_21

    .line 436
    .line 437
    invoke-virtual {v8, v15, v0}, Li/k1;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    goto :goto_f

    .line 441
    :cond_21
    invoke-virtual {v8, v0}, Li/k1;->k(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    iget-object v0, v8, Li/k1;->k:Li0/j1;

    .line 445
    .line 446
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 447
    .line 448
    invoke-virtual {v0, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :goto_f
    sget-object v0, Lh/m0;->a:Li/m1;

    .line 452
    .line 453
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    if-nez v0, :cond_22

    .line 462
    .line 463
    if-ne v2, v12, :cond_23

    .line 464
    .line 465
    :cond_22
    invoke-static {v4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    invoke-virtual {v11, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    :cond_23
    check-cast v2, Li0/a1;

    .line 473
    .line 474
    invoke-virtual {v8}, Li/k1;->c()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    iget-object v7, v8, Li/k1;->d:Li0/j1;

    .line 479
    .line 480
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v10

    .line 484
    sget-object v13, Lh/f0;->h:Lh/f0;

    .line 485
    .line 486
    if-ne v0, v10, :cond_25

    .line 487
    .line 488
    invoke-virtual {v8}, Li/k1;->c()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    if-ne v0, v13, :cond_25

    .line 493
    .line 494
    invoke-virtual {v8}, Li/k1;->g()Z

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_24

    .line 499
    .line 500
    invoke-interface {v2, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    goto :goto_10

    .line 504
    :cond_24
    sget-object v0, Lh/r0;->b:Lh/r0;

    .line 505
    .line 506
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    goto :goto_10

    .line 510
    :cond_25
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    if-ne v0, v13, :cond_26

    .line 515
    .line 516
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    check-cast v0, Lh/r0;

    .line 521
    .line 522
    invoke-virtual {v0, v4}, Lh/r0;->a(Lh/r0;)Lh/r0;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    :cond_26
    :goto_10
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    check-cast v0, Lh/r0;

    .line 534
    .line 535
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v10

    .line 543
    if-nez v2, :cond_27

    .line 544
    .line 545
    if-ne v10, v12, :cond_28

    .line 546
    .line 547
    :cond_27
    invoke-static {v5}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    :cond_28
    check-cast v10, Li0/a1;

    .line 555
    .line 556
    invoke-virtual {v8}, Li/k1;->c()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v14

    .line 564
    if-ne v2, v14, :cond_2a

    .line 565
    .line 566
    invoke-virtual {v8}, Li/k1;->c()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    if-ne v2, v13, :cond_2a

    .line 571
    .line 572
    invoke-virtual {v8}, Li/k1;->g()Z

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    if-eqz v2, :cond_29

    .line 577
    .line 578
    invoke-interface {v10, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    goto :goto_11

    .line 582
    :cond_29
    sget-object v2, Lh/s0;->b:Lh/s0;

    .line 583
    .line 584
    invoke-interface {v10, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    goto :goto_11

    .line 588
    :cond_2a
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    if-eq v2, v13, :cond_2b

    .line 593
    .line 594
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    check-cast v2, Lh/s0;

    .line 599
    .line 600
    invoke-virtual {v2, v5}, Lh/s0;->a(Lh/s0;)Lh/s0;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-interface {v10, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    :cond_2b
    :goto_11
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    check-cast v2, Lh/s0;

    .line 612
    .line 613
    invoke-static {v6, v11}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 614
    .line 615
    .line 616
    move-result-object v10

    .line 617
    invoke-virtual {v8}, Li/k1;->c()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v13

    .line 621
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v14

    .line 625
    invoke-interface {v6, v13, v14}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v13

    .line 629
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v14

    .line 633
    invoke-virtual {v11, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v15

    .line 637
    or-int/2addr v14, v15

    .line 638
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v15

    .line 642
    move-object/from16 v17, v13

    .line 643
    .line 644
    const/4 v13, 0x0

    .line 645
    if-nez v14, :cond_2c

    .line 646
    .line 647
    if-ne v15, v12, :cond_2d

    .line 648
    .line 649
    :cond_2c
    new-instance v15, Lc0/m;

    .line 650
    .line 651
    const/4 v14, 0x3

    .line 652
    invoke-direct {v15, v8, v10, v13, v14}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v11, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    :cond_2d
    check-cast v15, Lfg/p;

    .line 659
    .line 660
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v10

    .line 664
    if-ne v10, v12, :cond_2e

    .line 665
    .line 666
    invoke-static/range {v17 .. v17}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 667
    .line 668
    .line 669
    move-result-object v10

    .line 670
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    :cond_2e
    check-cast v10, Li0/a1;

    .line 674
    .line 675
    invoke-virtual {v11, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v14

    .line 679
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v13

    .line 683
    if-nez v14, :cond_30

    .line 684
    .line 685
    if-ne v13, v12, :cond_2f

    .line 686
    .line 687
    goto :goto_12

    .line 688
    :cond_2f
    const/4 v14, 0x0

    .line 689
    goto :goto_13

    .line 690
    :cond_30
    :goto_12
    new-instance v13, Lc0/m;

    .line 691
    .line 692
    move/from16 v1, v18

    .line 693
    .line 694
    const/4 v14, 0x0

    .line 695
    invoke-direct {v13, v15, v10, v14, v1}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v11, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    :goto_13
    check-cast v13, Lfg/p;

    .line 702
    .line 703
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 704
    .line 705
    invoke-static {v13, v11, v1}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v8}, Li/k1;->c()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    sget-object v13, Lh/f0;->i:Lh/f0;

    .line 713
    .line 714
    if-ne v1, v13, :cond_32

    .line 715
    .line 716
    invoke-virtual {v7}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    if-ne v1, v13, :cond_32

    .line 721
    .line 722
    invoke-interface {v10}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    check-cast v1, Ljava/lang/Boolean;

    .line 727
    .line 728
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    if-nez v1, :cond_31

    .line 733
    .line 734
    goto :goto_14

    .line 735
    :cond_31
    const v0, -0xdabe3cd

    .line 736
    .line 737
    .line 738
    invoke-virtual {v11, v0}, Li0/h0;->a0(I)V

    .line 739
    .line 740
    .line 741
    const/4 v10, 0x0

    .line 742
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 743
    .line 744
    .line 745
    move-object/from16 v1, p6

    .line 746
    .line 747
    goto/16 :goto_1f

    .line 748
    .line 749
    :cond_32
    :goto_14
    const v1, -0xdc032f6

    .line 750
    .line 751
    .line 752
    invoke-virtual {v11, v1}, Li0/h0;->a0(I)V

    .line 753
    .line 754
    .line 755
    const/4 v13, 0x4

    .line 756
    if-ne v9, v13, :cond_33

    .line 757
    .line 758
    move/from16 v1, v16

    .line 759
    .line 760
    goto :goto_15

    .line 761
    :cond_33
    const/4 v1, 0x0

    .line 762
    :goto_15
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v7

    .line 766
    if-nez v1, :cond_34

    .line 767
    .line 768
    if-ne v7, v12, :cond_35

    .line 769
    .line 770
    :cond_34
    new-instance v7, Lh/c0;

    .line 771
    .line 772
    invoke-direct {v7}, Lh/c0;-><init>()V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v11, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    :cond_35
    check-cast v7, Lh/c0;

    .line 779
    .line 780
    sget-object v9, Li/d;->p:Li/m1;

    .line 781
    .line 782
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    if-ne v1, v12, :cond_36

    .line 787
    .line 788
    sget-object v1, Lh/j0;->g:Lh/j0;

    .line 789
    .line 790
    invoke-virtual {v11, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    :cond_36
    check-cast v1, Lfg/a;

    .line 794
    .line 795
    const v10, -0xa02f001

    .line 796
    .line 797
    .line 798
    invoke-virtual {v11, v10}, Li0/h0;->a0(I)V

    .line 799
    .line 800
    .line 801
    const/4 v10, 0x0

    .line 802
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 803
    .line 804
    .line 805
    const v13, -0xa02e522

    .line 806
    .line 807
    .line 808
    invoke-virtual {v11, v13}, Li0/h0;->a0(I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 812
    .line 813
    .line 814
    iget-object v15, v0, Lh/r0;->a:Lh/h1;

    .line 815
    .line 816
    iget-object v10, v2, Lh/s0;->a:Lh/h1;

    .line 817
    .line 818
    iget-object v13, v15, Lh/h1;->b:Lh/f1;

    .line 819
    .line 820
    if-nez v13, :cond_38

    .line 821
    .line 822
    iget-object v13, v10, Lh/h1;->b:Lh/f1;

    .line 823
    .line 824
    if-eqz v13, :cond_37

    .line 825
    .line 826
    goto :goto_16

    .line 827
    :cond_37
    const/4 v13, 0x0

    .line 828
    goto :goto_17

    .line 829
    :cond_38
    :goto_16
    move/from16 v13, v16

    .line 830
    .line 831
    :goto_17
    if-eqz v13, :cond_3a

    .line 832
    .line 833
    const v13, -0x3654347f

    .line 834
    .line 835
    .line 836
    invoke-virtual {v11, v13}, Li0/h0;->a0(I)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v13

    .line 843
    if-ne v13, v12, :cond_39

    .line 844
    .line 845
    const-string v13, "Built-in slide"

    .line 846
    .line 847
    invoke-virtual {v11, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 848
    .line 849
    .line 850
    :cond_39
    check-cast v13, Ljava/lang/String;

    .line 851
    .line 852
    move-object/from16 v17, v12

    .line 853
    .line 854
    const/16 v12, 0x180

    .line 855
    .line 856
    move-object/from16 v18, v10

    .line 857
    .line 858
    move-object v10, v13

    .line 859
    const/4 v13, 0x0

    .line 860
    move-object/from16 v4, v17

    .line 861
    .line 862
    move-object/from16 v14, v18

    .line 863
    .line 864
    invoke-static/range {v8 .. v13}, Li/d;->k(Li/k1;Li/m1;Ljava/lang/String;Li0/h0;II)Li/d1;

    .line 865
    .line 866
    .line 867
    move-result-object v13

    .line 868
    const/4 v10, 0x0

    .line 869
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 870
    .line 871
    .line 872
    move-object/from16 v17, v13

    .line 873
    .line 874
    goto :goto_18

    .line 875
    :cond_3a
    move-object v14, v10

    .line 876
    move-object v4, v12

    .line 877
    const/4 v10, 0x0

    .line 878
    const v9, -0x36529734    # -1420569.5f

    .line 879
    .line 880
    .line 881
    invoke-virtual {v11, v9}, Li0/h0;->a0(I)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 885
    .line 886
    .line 887
    const/16 v17, 0x0

    .line 888
    .line 889
    :goto_18
    const v9, -0x364f7fbd

    .line 890
    .line 891
    .line 892
    invoke-virtual {v11, v9}, Li0/h0;->a0(I)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 896
    .line 897
    .line 898
    const v9, -0x364bc67d

    .line 899
    .line 900
    .line 901
    invoke-virtual {v11, v9}, Li0/h0;->a0(I)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 905
    .line 906
    .line 907
    const/4 v9, 0x0

    .line 908
    xor-int/lit8 v9, v9, 0x1

    .line 909
    .line 910
    sget-object v12, Lg1/e;->a:[F

    .line 911
    .line 912
    const v12, -0x363f7c78    # -1577073.0f

    .line 913
    .line 914
    .line 915
    invoke-virtual {v11, v12}, Li0/h0;->a0(I)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 919
    .line 920
    .line 921
    move v10, v9

    .line 922
    sget-object v9, Li/d;->j:Li/m1;

    .line 923
    .line 924
    iget-object v12, v15, Lh/h1;->a:Lh/t0;

    .line 925
    .line 926
    if-nez v12, :cond_3c

    .line 927
    .line 928
    iget-object v12, v14, Lh/h1;->a:Lh/t0;

    .line 929
    .line 930
    if-eqz v12, :cond_3b

    .line 931
    .line 932
    goto :goto_19

    .line 933
    :cond_3b
    const/4 v12, 0x0

    .line 934
    goto :goto_1a

    .line 935
    :cond_3c
    :goto_19
    move/from16 v12, v16

    .line 936
    .line 937
    :goto_1a
    if-eqz v12, :cond_3e

    .line 938
    .line 939
    const v12, -0x29f458fd

    .line 940
    .line 941
    .line 942
    invoke-virtual {v11, v12}, Li0/h0;->a0(I)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v12

    .line 949
    if-ne v12, v4, :cond_3d

    .line 950
    .line 951
    const-string v12, "Built-in alpha"

    .line 952
    .line 953
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 954
    .line 955
    .line 956
    :cond_3d
    check-cast v12, Ljava/lang/String;

    .line 957
    .line 958
    move v13, v10

    .line 959
    move-object v10, v12

    .line 960
    const/16 v12, 0x180

    .line 961
    .line 962
    move v14, v13

    .line 963
    const/4 v13, 0x0

    .line 964
    invoke-static/range {v8 .. v13}, Li/d;->k(Li/k1;Li/m1;Ljava/lang/String;Li0/h0;II)Li/d1;

    .line 965
    .line 966
    .line 967
    move-result-object v13

    .line 968
    const/4 v10, 0x0

    .line 969
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 970
    .line 971
    .line 972
    goto :goto_1b

    .line 973
    :cond_3e
    move v14, v10

    .line 974
    const/4 v10, 0x0

    .line 975
    const v9, -0x29f1c318

    .line 976
    .line 977
    .line 978
    invoke-virtual {v11, v9}, Li0/h0;->a0(I)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 982
    .line 983
    .line 984
    const/4 v13, 0x0

    .line 985
    :goto_1b
    const v9, -0x29ee24f8

    .line 986
    .line 987
    .line 988
    invoke-virtual {v11, v9}, Li0/h0;->a0(I)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 992
    .line 993
    .line 994
    const v9, -0x29ea5478

    .line 995
    .line 996
    .line 997
    invoke-virtual {v11, v9}, Li0/h0;->a0(I)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v11, v13}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v9

    .line 1007
    invoke-virtual {v11, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v10

    .line 1011
    or-int/2addr v9, v10

    .line 1012
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v10

    .line 1016
    or-int/2addr v9, v10

    .line 1017
    const/4 v10, 0x0

    .line 1018
    invoke-virtual {v11, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v12

    .line 1022
    or-int/2addr v9, v12

    .line 1023
    invoke-virtual {v11, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v12

    .line 1027
    or-int/2addr v9, v12

    .line 1028
    invoke-virtual {v11, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v12

    .line 1032
    or-int/2addr v9, v12

    .line 1033
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v12

    .line 1037
    if-nez v9, :cond_40

    .line 1038
    .line 1039
    if-ne v12, v4, :cond_3f

    .line 1040
    .line 1041
    goto :goto_1c

    .line 1042
    :cond_3f
    move-object/from16 v26, v0

    .line 1043
    .line 1044
    move-object/from16 v27, v2

    .line 1045
    .line 1046
    move-object/from16 v24, v10

    .line 1047
    .line 1048
    goto :goto_1d

    .line 1049
    :cond_40
    :goto_1c
    new-instance v22, Lh/h0;

    .line 1050
    .line 1051
    move-object/from16 v28, v10

    .line 1052
    .line 1053
    move-object/from16 v26, v0

    .line 1054
    .line 1055
    move-object/from16 v27, v2

    .line 1056
    .line 1057
    move-object/from16 v25, v8

    .line 1058
    .line 1059
    move-object/from16 v24, v10

    .line 1060
    .line 1061
    move-object/from16 v23, v13

    .line 1062
    .line 1063
    invoke-direct/range {v22 .. v28}, Lh/h0;-><init>(Li/d1;Li/d1;Li/k1;Lh/r0;Lh/s0;Li/d1;)V

    .line 1064
    .line 1065
    .line 1066
    move-object/from16 v12, v22

    .line 1067
    .line 1068
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1069
    .line 1070
    .line 1071
    :goto_1d
    move-object/from16 v30, v12

    .line 1072
    .line 1073
    check-cast v30, Lh/h0;

    .line 1074
    .line 1075
    invoke-virtual {v11, v14}, Li0/h0;->g(Z)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v0

    .line 1079
    invoke-virtual {v11, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1080
    .line 1081
    .line 1082
    move-result v2

    .line 1083
    or-int/2addr v0, v2

    .line 1084
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v2

    .line 1088
    if-nez v0, :cond_41

    .line 1089
    .line 1090
    if-ne v2, v4, :cond_42

    .line 1091
    .line 1092
    :cond_41
    new-instance v2, Lh/k0;

    .line 1093
    .line 1094
    invoke-direct {v2, v14, v1}, Lh/k0;-><init>(ZLfg/a;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v11, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1098
    .line 1099
    .line 1100
    :cond_42
    check-cast v2, Lfg/l;

    .line 1101
    .line 1102
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 1103
    .line 1104
    invoke-static {v0, v2}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    new-instance v22, Lh/g0;

    .line 1109
    .line 1110
    move-object/from16 v25, v24

    .line 1111
    .line 1112
    move-object/from16 v29, v1

    .line 1113
    .line 1114
    move-object/from16 v23, v8

    .line 1115
    .line 1116
    move-object/from16 v28, v27

    .line 1117
    .line 1118
    move-object/from16 v27, v26

    .line 1119
    .line 1120
    move-object/from16 v26, v17

    .line 1121
    .line 1122
    invoke-direct/range {v22 .. v30}, Lh/g0;-><init>(Li/k1;Li/d1;Li/d1;Li/d1;Lh/r0;Lh/s0;Lfg/a;Lh/h0;)V

    .line 1123
    .line 1124
    .line 1125
    move-object/from16 v1, v22

    .line 1126
    .line 1127
    invoke-interface {v2, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    invoke-interface {v1, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v1

    .line 1135
    const v2, -0x70fb69

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v11, v2}, Li0/h0;->a0(I)V

    .line 1139
    .line 1140
    .line 1141
    const/4 v10, 0x0

    .line 1142
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 1143
    .line 1144
    .line 1145
    invoke-interface {v1, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    invoke-interface {v3, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    if-ne v1, v4, :cond_43

    .line 1158
    .line 1159
    new-instance v1, Lh/v;

    .line 1160
    .line 1161
    invoke-direct {v1, v7}, Lh/v;-><init>(Lh/c0;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v11, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1165
    .line 1166
    .line 1167
    :cond_43
    check-cast v1, Lh/v;

    .line 1168
    .line 1169
    iget-wide v8, v11, Li0/h0;->T:J

    .line 1170
    .line 1171
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 1172
    .line 1173
    .line 1174
    move-result v2

    .line 1175
    invoke-virtual {v11}, Li0/h0;->l()Ls0/h;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v4

    .line 1179
    invoke-static {v11, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    sget-object v8, Lx1/g;->f:Lx1/f;

    .line 1184
    .line 1185
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1186
    .line 1187
    .line 1188
    sget-object v8, Lx1/f;->b:Lx1/y;

    .line 1189
    .line 1190
    invoke-virtual {v11}, Li0/h0;->d0()V

    .line 1191
    .line 1192
    .line 1193
    iget-boolean v9, v11, Li0/h0;->S:Z

    .line 1194
    .line 1195
    if-eqz v9, :cond_44

    .line 1196
    .line 1197
    invoke-virtual {v11, v8}, Li0/h0;->k(Lfg/a;)V

    .line 1198
    .line 1199
    .line 1200
    goto :goto_1e

    .line 1201
    :cond_44
    invoke-virtual {v11}, Li0/h0;->n0()V

    .line 1202
    .line 1203
    .line 1204
    :goto_1e
    sget-object v8, Lx1/f;->e:Lx1/e;

    .line 1205
    .line 1206
    invoke-static {v8, v11, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1207
    .line 1208
    .line 1209
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 1210
    .line 1211
    invoke-static {v1, v11, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1212
    .line 1213
    .line 1214
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 1219
    .line 1220
    invoke-static {v11, v1, v2}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1221
    .line 1222
    .line 1223
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 1224
    .line 1225
    invoke-static {v1, v11}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1226
    .line 1227
    .line 1228
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 1229
    .line 1230
    invoke-static {v1, v11, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    shr-int/lit8 v0, v21, 0x12

    .line 1234
    .line 1235
    and-int/lit8 v0, v0, 0x70

    .line 1236
    .line 1237
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    move-object/from16 v1, p6

    .line 1242
    .line 1243
    invoke-virtual {v1, v7, v11, v0}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move/from16 v0, v16

    .line 1247
    .line 1248
    invoke-virtual {v11, v0}, Li0/h0;->p(Z)V

    .line 1249
    .line 1250
    .line 1251
    const/4 v10, 0x0

    .line 1252
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 1253
    .line 1254
    .line 1255
    :goto_1f
    invoke-virtual {v11, v10}, Li0/h0;->p(Z)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_20

    .line 1259
    :cond_45
    move-object v1, v7

    .line 1260
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 1261
    .line 1262
    .line 1263
    :goto_20
    invoke-virtual {v11}, Li0/h0;->t()Li0/r1;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v9

    .line 1267
    if-eqz v9, :cond_46

    .line 1268
    .line 1269
    new-instance v0, Lh/d;

    .line 1270
    .line 1271
    move-object/from16 v2, p1

    .line 1272
    .line 1273
    move-object/from16 v4, p3

    .line 1274
    .line 1275
    move/from16 v8, p8

    .line 1276
    .line 1277
    move-object v7, v1

    .line 1278
    move-object/from16 v1, p0

    .line 1279
    .line 1280
    invoke-direct/range {v0 .. v8}, Lh/d;-><init>(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Lfg/p;Ls0/d;I)V

    .line 1281
    .line 1282
    .line 1283
    iput-object v0, v9, Li0/r1;->d:Lfg/p;

    .line 1284
    .line 1285
    :cond_46
    return-void
.end method

.method public static final b(ZLy0/o;Lh/r0;Lh/s0;Ljava/lang/String;Ls0/d;Li0/h0;I)V
    .locals 10

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    move/from16 v8, p7

    .line 4
    .line 5
    const v0, 0x6b47faab

    .line 6
    .line 7
    .line 8
    invoke-virtual {v6, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, v8, 0x30

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v6, p0}, Li0/h0;->g(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v0, 0x10

    .line 25
    .line 26
    :goto_0
    or-int/2addr v0, v8

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v8

    .line 29
    :goto_1
    or-int/lit16 v0, v0, 0x180

    .line 30
    .line 31
    and-int/lit16 v1, v8, 0xc00

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {v6, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const/16 v1, 0x800

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v1, 0x400

    .line 45
    .line 46
    :goto_2
    or-int/2addr v0, v1

    .line 47
    :cond_3
    and-int/lit16 v1, v8, 0x6000

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    invoke-virtual {v6, p3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    const/16 v1, 0x4000

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    const/16 v1, 0x2000

    .line 61
    .line 62
    :goto_3
    or-int/2addr v0, v1

    .line 63
    :cond_5
    const/high16 v1, 0x30000

    .line 64
    .line 65
    or-int/2addr v0, v1

    .line 66
    const/high16 v1, 0x180000

    .line 67
    .line 68
    and-int/2addr v1, v8

    .line 69
    if-nez v1, :cond_7

    .line 70
    .line 71
    invoke-virtual {v6, p5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    const/high16 v1, 0x100000

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/high16 v1, 0x80000

    .line 81
    .line 82
    :goto_4
    or-int/2addr v0, v1

    .line 83
    :cond_7
    const v1, 0x92491

    .line 84
    .line 85
    .line 86
    and-int/2addr v1, v0

    .line 87
    const v2, 0x92490

    .line 88
    .line 89
    .line 90
    if-eq v1, v2, :cond_8

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    goto :goto_5

    .line 94
    :cond_8
    const/4 v1, 0x0

    .line 95
    :goto_5
    and-int/lit8 v2, v0, 0x1

    .line 96
    .line 97
    invoke-virtual {v6, v2, v1}, Li0/h0;->S(IZ)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_a

    .line 102
    .line 103
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    shr-int/lit8 v1, v0, 0x3

    .line 108
    .line 109
    and-int/lit8 v2, v1, 0xe

    .line 110
    .line 111
    shr-int/lit8 v3, v0, 0xc

    .line 112
    .line 113
    and-int/lit8 v3, v3, 0x70

    .line 114
    .line 115
    or-int/2addr v2, v3

    .line 116
    const-string v9, "AnimatedVisibility"

    .line 117
    .line 118
    invoke-static {p1, v9, v6, v2}, Li/d;->r(Ljava/lang/Object;Ljava/lang/String;Li0/h0;I)Li/k1;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    sget-object v3, Li0/l;->a:Li0/e;

    .line 127
    .line 128
    if-ne v2, v3, :cond_9

    .line 129
    .line 130
    sget-object v2, Lh/c;->i:Lh/c;

    .line 131
    .line 132
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_9
    check-cast v2, Lfg/l;

    .line 136
    .line 137
    and-int/lit16 v3, v0, 0x380

    .line 138
    .line 139
    or-int/lit8 v3, v3, 0x30

    .line 140
    .line 141
    and-int/lit16 v7, v0, 0x1c00

    .line 142
    .line 143
    or-int/2addr v3, v7

    .line 144
    const v7, 0xe000

    .line 145
    .line 146
    .line 147
    and-int/2addr v0, v7

    .line 148
    or-int/2addr v0, v3

    .line 149
    const/high16 v3, 0x70000

    .line 150
    .line 151
    and-int/2addr v1, v3

    .line 152
    or-int v7, v0, v1

    .line 153
    .line 154
    move-object v1, v2

    .line 155
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 156
    .line 157
    move-object v0, p1

    .line 158
    move-object v3, p2

    .line 159
    move-object v4, p3

    .line 160
    move-object v5, p5

    .line 161
    invoke-static/range {v0 .. v7}, Lh/a0;->c(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Ls0/d;Li0/h0;I)V

    .line 162
    .line 163
    .line 164
    move-object v5, v9

    .line 165
    goto :goto_6

    .line 166
    :cond_a
    invoke-virtual/range {p6 .. p6}, Li0/h0;->V()V

    .line 167
    .line 168
    .line 169
    move-object v2, p1

    .line 170
    move-object v5, p4

    .line 171
    :goto_6
    invoke-virtual/range {p6 .. p6}, Li0/h0;->t()Li0/r1;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_b

    .line 176
    .line 177
    new-instance v0, Lh/x;

    .line 178
    .line 179
    move v1, p0

    .line 180
    move-object v3, p2

    .line 181
    move-object v4, p3

    .line 182
    move-object v6, p5

    .line 183
    move v7, v8

    .line 184
    invoke-direct/range {v0 .. v7}, Lh/x;-><init>(ZLy0/o;Lh/r0;Lh/s0;Ljava/lang/String;Ls0/d;I)V

    .line 185
    .line 186
    .line 187
    iput-object v0, p1, Li0/r1;->d:Lfg/p;

    .line 188
    .line 189
    :cond_b
    return-void
.end method

.method public static final c(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Ls0/d;Li0/h0;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move-object/from16 v7, p6

    .line 8
    .line 9
    move/from16 v10, p7

    .line 10
    .line 11
    const v2, 0x65b46798

    .line 12
    .line 13
    .line 14
    invoke-virtual {v7, v2}, Li0/h0;->b0(I)Li0/h0;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v2, v10, 0x6

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v7, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :goto_0
    or-int/2addr v2, v10

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v10

    .line 34
    :goto_1
    and-int/lit8 v4, v10, 0x30

    .line 35
    .line 36
    const/16 v5, 0x20

    .line 37
    .line 38
    if-nez v4, :cond_3

    .line 39
    .line 40
    invoke-virtual {v7, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    move v4, v5

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v4, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v2, v4

    .line 51
    :cond_3
    and-int/lit16 v4, v10, 0x180

    .line 52
    .line 53
    if-nez v4, :cond_5

    .line 54
    .line 55
    invoke-virtual {v7, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v4, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v2, v4

    .line 67
    :cond_5
    and-int/lit16 v4, v10, 0xc00

    .line 68
    .line 69
    if-nez v4, :cond_7

    .line 70
    .line 71
    move-object/from16 v4, p3

    .line 72
    .line 73
    invoke-virtual {v7, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_6

    .line 78
    .line 79
    const/16 v6, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v6, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v2, v6

    .line 85
    goto :goto_5

    .line 86
    :cond_7
    move-object/from16 v4, p3

    .line 87
    .line 88
    :goto_5
    and-int/lit16 v6, v10, 0x6000

    .line 89
    .line 90
    if-nez v6, :cond_9

    .line 91
    .line 92
    move-object/from16 v6, p4

    .line 93
    .line 94
    invoke-virtual {v7, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_8

    .line 99
    .line 100
    const/16 v8, 0x4000

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_8
    const/16 v8, 0x2000

    .line 104
    .line 105
    :goto_6
    or-int/2addr v2, v8

    .line 106
    goto :goto_7

    .line 107
    :cond_9
    move-object/from16 v6, p4

    .line 108
    .line 109
    :goto_7
    const/high16 v8, 0x30000

    .line 110
    .line 111
    and-int v11, v10, v8

    .line 112
    .line 113
    if-nez v11, :cond_b

    .line 114
    .line 115
    move-object/from16 v11, p5

    .line 116
    .line 117
    invoke-virtual {v7, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    if-eqz v12, :cond_a

    .line 122
    .line 123
    const/high16 v12, 0x20000

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_a
    const/high16 v12, 0x10000

    .line 127
    .line 128
    :goto_8
    or-int/2addr v2, v12

    .line 129
    goto :goto_9

    .line 130
    :cond_b
    move-object/from16 v11, p5

    .line 131
    .line 132
    :goto_9
    const v12, 0x12493

    .line 133
    .line 134
    .line 135
    and-int/2addr v12, v2

    .line 136
    const v13, 0x12492

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x1

    .line 141
    if-eq v12, v13, :cond_c

    .line 142
    .line 143
    move v12, v15

    .line 144
    goto :goto_a

    .line 145
    :cond_c
    move v12, v14

    .line 146
    :goto_a
    and-int/lit8 v13, v2, 0x1

    .line 147
    .line 148
    invoke-virtual {v7, v13, v12}, Li0/h0;->S(IZ)Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-eqz v12, :cond_12

    .line 153
    .line 154
    and-int/lit8 v12, v2, 0x70

    .line 155
    .line 156
    if-ne v12, v5, :cond_d

    .line 157
    .line 158
    move v5, v15

    .line 159
    goto :goto_b

    .line 160
    :cond_d
    move v5, v14

    .line 161
    :goto_b
    and-int/lit8 v13, v2, 0xe

    .line 162
    .line 163
    if-ne v13, v3, :cond_e

    .line 164
    .line 165
    move v14, v15

    .line 166
    :cond_e
    or-int v3, v5, v14

    .line 167
    .line 168
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    sget-object v14, Li0/l;->a:Li0/e;

    .line 173
    .line 174
    if-nez v3, :cond_f

    .line 175
    .line 176
    if-ne v5, v14, :cond_10

    .line 177
    .line 178
    :cond_f
    new-instance v5, Lh/y;

    .line 179
    .line 180
    invoke-direct {v5, v1, v0}, Lh/y;-><init>(Lfg/l;Li/k1;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_10
    check-cast v5, Lfg/q;

    .line 187
    .line 188
    invoke-static {v9, v5}, Lv1/w;->k(Ly0/o;Lfg/q;)Ly0/o;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    if-ne v5, v14, :cond_11

    .line 197
    .line 198
    sget-object v5, Lh/j;->i:Lh/j;

    .line 199
    .line 200
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_11
    check-cast v5, Lfg/p;

    .line 204
    .line 205
    or-int/2addr v8, v13

    .line 206
    or-int/2addr v8, v12

    .line 207
    and-int/lit16 v12, v2, 0x1c00

    .line 208
    .line 209
    or-int/2addr v8, v12

    .line 210
    const v12, 0xe000

    .line 211
    .line 212
    .line 213
    and-int/2addr v12, v2

    .line 214
    or-int/2addr v8, v12

    .line 215
    const/high16 v12, 0x1c00000

    .line 216
    .line 217
    shl-int/lit8 v2, v2, 0x6

    .line 218
    .line 219
    and-int/2addr v2, v12

    .line 220
    or-int/2addr v8, v2

    .line 221
    move-object v2, v3

    .line 222
    move-object v3, v4

    .line 223
    move-object v4, v6

    .line 224
    move-object v6, v11

    .line 225
    invoke-static/range {v0 .. v8}, Lh/a0;->a(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Lfg/p;Ls0/d;Li0/h0;I)V

    .line 226
    .line 227
    .line 228
    goto :goto_c

    .line 229
    :cond_12
    invoke-virtual/range {p6 .. p6}, Li0/h0;->V()V

    .line 230
    .line 231
    .line 232
    :goto_c
    invoke-virtual/range {p6 .. p6}, Li0/h0;->t()Li0/r1;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    if-eqz v8, :cond_13

    .line 237
    .line 238
    new-instance v0, Lh/z;

    .line 239
    .line 240
    move-object/from16 v1, p0

    .line 241
    .line 242
    move-object/from16 v2, p1

    .line 243
    .line 244
    move-object/from16 v4, p3

    .line 245
    .line 246
    move-object/from16 v5, p4

    .line 247
    .line 248
    move-object/from16 v6, p5

    .line 249
    .line 250
    move-object v3, v9

    .line 251
    move v7, v10

    .line 252
    invoke-direct/range {v0 .. v7}, Lh/z;-><init>(Li/k1;Lfg/l;Ly0/o;Lh/r0;Lh/s0;Ls0/d;I)V

    .line 253
    .line 254
    .line 255
    iput-object v0, v8, Li0/r1;->d:Lfg/p;

    .line 256
    .line 257
    :cond_13
    return-void
.end method

.method public static final d(Li/k1;Lfg/l;Ljava/lang/Object;Li0/h0;)Lh/f0;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, -0x192ea2d9

    .line 3
    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p3, v1, p0, v0, v2}, Li0/h0;->W(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li/k1;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lh/f0;->g:Lh/f0;

    .line 14
    .line 15
    sget-object v3, Lh/f0;->i:Lh/f0;

    .line 16
    .line 17
    sget-object v4, Lh/f0;->h:Lh/f0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const v0, -0xca56761

    .line 22
    .line 23
    .line 24
    invoke-virtual {p3, v0}, Li0/h0;->a0(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3, v2}, Li0/h0;->p(Z)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    move-object v1, v4

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_6

    .line 59
    .line 60
    move-object v1, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const v0, -0xca1388c

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3, v0}, Li0/h0;->a0(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v5, Li0/l;->a:Li0/e;

    .line 73
    .line 74
    if-ne v0, v5, :cond_2

    .line 75
    .line 76
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p3, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    check-cast v0, Li0/a1;

    .line 86
    .line 87
    invoke-virtual {p0}, Li/k1;->c()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-interface {p1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_3

    .line 102
    .line 103
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v0, p0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    invoke-interface {p1, p2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_4

    .line 119
    .line 120
    move-object v1, v4

    .line 121
    goto :goto_0

    .line 122
    :cond_4
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_5

    .line 133
    .line 134
    move-object v1, v3

    .line 135
    :cond_5
    :goto_0
    invoke-virtual {p3, v2}, Li0/h0;->p(Z)V

    .line 136
    .line 137
    .line 138
    :cond_6
    :goto_1
    invoke-virtual {p3, v2}, Li0/h0;->p(Z)V

    .line 139
    .line 140
    .line 141
    return-object v1
.end method
