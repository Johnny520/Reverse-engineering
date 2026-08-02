.class public final synthetic Lx1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lx1;->i:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lx1;->h:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    const/16 v4, 0x12

    .line 8
    .line 9
    iget-object v5, v0, Lx1;->i:Ljava/lang/String;

    .line 10
    .line 11
    const/16 v6, 0x10

    .line 12
    .line 13
    sget-object v7, La83;->a:La83;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Lo71;

    .line 23
    .line 24
    move-object/from16 v2, p2

    .line 25
    .line 26
    check-cast v2, Lpx;

    .line 27
    .line 28
    move-object/from16 v3, p3

    .line 29
    .line 30
    check-cast v3, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v3, 0x11

    .line 40
    .line 41
    if-eq v1, v6, :cond_0

    .line 42
    .line 43
    move v9, v8

    .line 44
    :cond_0
    and-int/lit8 v1, v3, 0x1

    .line 45
    .line 46
    move-object v13, v2

    .line 47
    check-cast v13, Lgo0;

    .line 48
    .line 49
    invoke-virtual {v13, v1, v9}, Lgo0;->O(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    const v1, 0x790b020b

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v13}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v15, 0x1

    .line 64
    const/4 v10, 0x0

    .line 65
    iget-object v12, v0, Lx1;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static/range {v10 .. v15}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v13}, Lgo0;->R()V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-object v7

    .line 75
    :pswitch_0
    move-object/from16 v0, p1

    .line 76
    .line 77
    check-cast v0, Lbv;

    .line 78
    .line 79
    move-object/from16 v1, p2

    .line 80
    .line 81
    check-cast v1, Lpx;

    .line 82
    .line 83
    move-object/from16 v6, p3

    .line 84
    .line 85
    check-cast v6, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    and-int/lit8 v10, v6, 0x6

    .line 95
    .line 96
    if-nez v10, :cond_3

    .line 97
    .line 98
    move-object v10, v1

    .line 99
    check-cast v10, Lgo0;

    .line 100
    .line 101
    invoke-virtual {v10, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    move v2, v3

    .line 108
    :cond_2
    or-int/2addr v6, v2

    .line 109
    :cond_3
    and-int/lit8 v0, v6, 0x13

    .line 110
    .line 111
    if-eq v0, v4, :cond_4

    .line 112
    .line 113
    move v0, v8

    .line 114
    goto :goto_1

    .line 115
    :cond_4
    move v0, v9

    .line 116
    :goto_1
    and-int/lit8 v2, v6, 0x1

    .line 117
    .line 118
    check-cast v1, Lgo0;

    .line 119
    .line 120
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    new-instance v0, Lbu0;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-static {v5, v0, v1, v9, v9}, Lqp0;->e(Ljava/lang/String;Luh1;Lpx;II)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    invoke-virtual {v1}, Lgo0;->R()V

    .line 136
    .line 137
    .line 138
    :goto_2
    return-object v7

    .line 139
    :pswitch_1
    move-object/from16 v1, p1

    .line 140
    .line 141
    check-cast v1, Lbv;

    .line 142
    .line 143
    move-object/from16 v2, p2

    .line 144
    .line 145
    check-cast v2, Lpx;

    .line 146
    .line 147
    move-object/from16 v3, p3

    .line 148
    .line 149
    check-cast v3, Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    and-int/lit8 v1, v3, 0x11

    .line 159
    .line 160
    if-eq v1, v6, :cond_6

    .line 161
    .line 162
    move v9, v8

    .line 163
    :cond_6
    and-int/lit8 v1, v3, 0x1

    .line 164
    .line 165
    check-cast v2, Lgo0;

    .line 166
    .line 167
    invoke-virtual {v2, v1, v9}, Lgo0;->O(IZ)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_8

    .line 172
    .line 173
    const/4 v13, 0x7

    .line 174
    sget-object v14, Lrh1;->a:Lrh1;

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    const/high16 v12, 0x41000000    # 8.0f

    .line 180
    .line 181
    move-object v8, v14

    .line 182
    invoke-static/range {v8 .. v13}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    move v1, v12

    .line 187
    const v3, 0x790b0104

    .line 188
    .line 189
    .line 190
    invoke-static {v3, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    sget-object v3, Lur1;->a:Ltu2;

    .line 195
    .line 196
    invoke-virtual {v2, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    check-cast v5, Llp1;

    .line 201
    .line 202
    iget-wide v13, v5, Llp1;->f:J

    .line 203
    .line 204
    const/16 v5, 0xd

    .line 205
    .line 206
    invoke-static {v5}, Lrg3;->D(I)J

    .line 207
    .line 208
    .line 209
    move-result-wide v15

    .line 210
    invoke-static {v4}, Lrg3;->D(I)J

    .line 211
    .line 212
    .line 213
    move-result-wide v21

    .line 214
    sget-object v17, Lim0;->k:Lim0;

    .line 215
    .line 216
    new-instance v12, Lm13;

    .line 217
    .line 218
    const/16 v24, 0x0

    .line 219
    .line 220
    const v25, 0xfdfff8

    .line 221
    .line 222
    .line 223
    const-wide/16 v18, 0x0

    .line 224
    .line 225
    const/16 v20, 0x0

    .line 226
    .line 227
    const/16 v23, 0x0

    .line 228
    .line 229
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 230
    .line 231
    .line 232
    const/16 v18, 0x30

    .line 233
    .line 234
    const/16 v19, 0x3f8

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    move-object/from16 v17, v2

    .line 242
    .line 243
    invoke-static/range {v10 .. v19}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Lgo0;->L()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    sget-object v5, Lnx;->a:Leb;

    .line 251
    .line 252
    if-ne v4, v5, :cond_7

    .line 253
    .line 254
    new-instance v4, Lgs;

    .line 255
    .line 256
    invoke-direct {v4, v6}, Lgs;-><init>(I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_7
    move-object v11, v4

    .line 263
    check-cast v11, Lin0;

    .line 264
    .line 265
    const/16 v26, 0x6

    .line 266
    .line 267
    const/16 v27, 0x3bfc

    .line 268
    .line 269
    iget-object v10, v0, Lx1;->i:Ljava/lang/String;

    .line 270
    .line 271
    const/4 v12, 0x0

    .line 272
    const/4 v13, 0x0

    .line 273
    const/4 v14, 0x0

    .line 274
    const/4 v15, 0x0

    .line 275
    const/16 v16, 0x0

    .line 276
    .line 277
    const/16 v17, 0x0

    .line 278
    .line 279
    const/16 v18, 0x0

    .line 280
    .line 281
    const/16 v19, 0x0

    .line 282
    .line 283
    const/16 v20, 0x1

    .line 284
    .line 285
    const/16 v21, 0x0

    .line 286
    .line 287
    const/16 v22, 0x0

    .line 288
    .line 289
    const/16 v23, 0x0

    .line 290
    .line 291
    const/16 v25, 0x30

    .line 292
    .line 293
    move-object/from16 v24, v2

    .line 294
    .line 295
    invoke-static/range {v10 .. v27}, Ltp0;->b(Ljava/lang/String;Lin0;Luh1;Ljava/lang/String;Lmn0;Lmn0;ZIIZZLwb3;Lm51;Lk51;Lpx;III)V

    .line 296
    .line 297
    .line 298
    const/16 v18, 0x0

    .line 299
    .line 300
    const/16 v19, 0xd

    .line 301
    .line 302
    const/4 v15, 0x0

    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    move/from16 v16, v1

    .line 306
    .line 307
    move-object v14, v8

    .line 308
    invoke-static/range {v14 .. v19}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    const v0, 0x790b0101

    .line 313
    .line 314
    .line 315
    invoke-static {v0, v2}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    new-instance v12, Lm13;

    .line 320
    .line 321
    invoke-virtual {v2, v3}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, Llp1;

    .line 326
    .line 327
    iget-wide v13, v0, Llp1;->f:J

    .line 328
    .line 329
    const/16 v0, 0xc

    .line 330
    .line 331
    invoke-static {v0}, Lrg3;->D(I)J

    .line 332
    .line 333
    .line 334
    move-result-wide v15

    .line 335
    const/16 v0, 0x11

    .line 336
    .line 337
    invoke-static {v0}, Lrg3;->D(I)J

    .line 338
    .line 339
    .line 340
    move-result-wide v21

    .line 341
    const/16 v24, 0x0

    .line 342
    .line 343
    const v25, 0xfdfffc

    .line 344
    .line 345
    .line 346
    const/16 v17, 0x0

    .line 347
    .line 348
    const-wide/16 v18, 0x0

    .line 349
    .line 350
    const/16 v20, 0x0

    .line 351
    .line 352
    invoke-direct/range {v12 .. v25}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 353
    .line 354
    .line 355
    const/16 v18, 0x30

    .line 356
    .line 357
    const/16 v19, 0x3f8

    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const/16 v16, 0x0

    .line 363
    .line 364
    move-object/from16 v17, v2

    .line 365
    .line 366
    invoke-static/range {v10 .. v19}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 367
    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_8
    move-object/from16 v17, v2

    .line 371
    .line 372
    invoke-virtual/range {v17 .. v17}, Lgo0;->R()V

    .line 373
    .line 374
    .line 375
    :goto_3
    return-object v7

    .line 376
    :pswitch_2
    move-object/from16 v0, p1

    .line 377
    .line 378
    check-cast v0, Lxm0;

    .line 379
    .line 380
    move-object/from16 v1, p2

    .line 381
    .line 382
    check-cast v1, Lpx;

    .line 383
    .line 384
    move-object/from16 v6, p3

    .line 385
    .line 386
    check-cast v6, Ljava/lang/Integer;

    .line 387
    .line 388
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    and-int/lit8 v10, v6, 0x6

    .line 396
    .line 397
    if-nez v10, :cond_a

    .line 398
    .line 399
    move-object v10, v1

    .line 400
    check-cast v10, Lgo0;

    .line 401
    .line 402
    invoke-virtual {v10, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v10

    .line 406
    if-eqz v10, :cond_9

    .line 407
    .line 408
    move v2, v3

    .line 409
    :cond_9
    or-int/2addr v6, v2

    .line 410
    :cond_a
    and-int/lit8 v2, v6, 0x13

    .line 411
    .line 412
    if-eq v2, v4, :cond_b

    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_b
    move v8, v9

    .line 416
    :goto_4
    and-int/lit8 v2, v6, 0x1

    .line 417
    .line 418
    check-cast v1, Lgo0;

    .line 419
    .line 420
    invoke-virtual {v1, v2, v8}, Lgo0;->O(IZ)Z

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    if-eqz v2, :cond_c

    .line 425
    .line 426
    shl-int/lit8 v2, v6, 0x3

    .line 427
    .line 428
    and-int/lit8 v2, v2, 0x70

    .line 429
    .line 430
    invoke-static {v5, v0, v1, v2}, Lfg1;->d(Ljava/lang/String;Lxm0;Lpx;I)V

    .line 431
    .line 432
    .line 433
    goto :goto_5

    .line 434
    :cond_c
    invoke-virtual {v1}, Lgo0;->R()V

    .line 435
    .line 436
    .line 437
    :goto_5
    return-object v7

    .line 438
    :pswitch_3
    move-object/from16 v0, p1

    .line 439
    .line 440
    check-cast v0, Lo71;

    .line 441
    .line 442
    move-object/from16 v1, p2

    .line 443
    .line 444
    check-cast v1, Lpx;

    .line 445
    .line 446
    move-object/from16 v2, p3

    .line 447
    .line 448
    check-cast v2, Ljava/lang/Integer;

    .line 449
    .line 450
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    and-int/lit8 v0, v2, 0x11

    .line 458
    .line 459
    if-eq v0, v6, :cond_d

    .line 460
    .line 461
    move v9, v8

    .line 462
    :cond_d
    and-int/lit8 v0, v2, 0x1

    .line 463
    .line 464
    check-cast v1, Lgo0;

    .line 465
    .line 466
    invoke-virtual {v1, v0, v9}, Lgo0;->O(IZ)Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-eqz v0, :cond_e

    .line 471
    .line 472
    sget-object v8, Lte;->e:Lyi0;

    .line 473
    .line 474
    const/high16 v12, 0x41000000    # 8.0f

    .line 475
    .line 476
    const/4 v13, 0x5

    .line 477
    const/4 v9, 0x0

    .line 478
    const/high16 v10, 0x41800000    # 16.0f

    .line 479
    .line 480
    const/4 v11, 0x0

    .line 481
    invoke-static/range {v8 .. v13}, Lfg1;->G(Luh1;FFFFI)Luh1;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    const/16 v2, 0x30

    .line 486
    .line 487
    invoke-static {v5, v0, v1, v2}, Lte;->a(Ljava/lang/String;Luh1;Lpx;I)V

    .line 488
    .line 489
    .line 490
    goto :goto_6

    .line 491
    :cond_e
    invoke-virtual {v1}, Lgo0;->R()V

    .line 492
    .line 493
    .line 494
    :goto_6
    return-object v7

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
