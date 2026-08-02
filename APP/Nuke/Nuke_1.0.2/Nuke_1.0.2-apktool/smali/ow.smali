.class public final synthetic Low;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Low;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Low;->h:I

    .line 4
    .line 5
    sget-object v1, Lce0;->h:Lce0;

    .line 6
    .line 7
    const/high16 v2, 0x41200000    # 10.0f

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, "1.0.2"

    .line 11
    .line 12
    const v5, 0x790b0171

    .line 13
    .line 14
    .line 15
    const/high16 v6, 0x41400000    # 12.0f

    .line 16
    .line 17
    const/high16 v7, 0x41e00000    # 28.0f

    .line 18
    .line 19
    sget-object v8, Lrh1;->a:Lrh1;

    .line 20
    .line 21
    const/16 v9, 0x10

    .line 22
    .line 23
    sget-object v10, La83;->a:La83;

    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    const/4 v12, 0x0

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, Lbv;

    .line 33
    .line 34
    move-object/from16 v1, p2

    .line 35
    .line 36
    check-cast v1, Lpx;

    .line 37
    .line 38
    move-object/from16 v2, p3

    .line 39
    .line 40
    check-cast v2, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    and-int/lit8 v0, v2, 0x11

    .line 50
    .line 51
    if-eq v0, v9, :cond_0

    .line 52
    .line 53
    move v0, v11

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v0, v12

    .line 56
    :goto_0
    and-int/2addr v2, v11

    .line 57
    check-cast v1, Lgo0;

    .line 58
    .line 59
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    const v0, 0x790b0237

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v1, v12}, Lse;->l(Ljava/lang/String;Lpx;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {v1}, Lgo0;->R()V

    .line 77
    .line 78
    .line 79
    :goto_1
    return-object v10

    .line 80
    :pswitch_0
    move-object/from16 v0, p1

    .line 81
    .line 82
    check-cast v0, Lbv;

    .line 83
    .line 84
    move-object/from16 v1, p2

    .line 85
    .line 86
    check-cast v1, Lpx;

    .line 87
    .line 88
    move-object/from16 v2, p3

    .line 89
    .line 90
    check-cast v2, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    and-int/lit8 v0, v2, 0x11

    .line 100
    .line 101
    if-eq v0, v9, :cond_2

    .line 102
    .line 103
    move v0, v11

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    move v0, v12

    .line 106
    :goto_2
    and-int/2addr v2, v11

    .line 107
    check-cast v1, Lgo0;

    .line 108
    .line 109
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-static {v8, v7}, Lte;->g0(Luh1;F)Luh1;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    sget-object v0, Lur1;->a:Ltu2;

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Llp1;

    .line 126
    .line 127
    iget-wide v14, v0, Llp1;->g:J

    .line 128
    .line 129
    const/16 v20, 0x0

    .line 130
    .line 131
    const/16 v22, 0x186

    .line 132
    .line 133
    const/high16 v16, 0x40200000    # 2.5f

    .line 134
    .line 135
    const-wide/16 v17, 0x0

    .line 136
    .line 137
    const/16 v19, 0x0

    .line 138
    .line 139
    move-object/from16 v21, v1

    .line 140
    .line 141
    invoke-static/range {v13 .. v22}, Lx32;->a(Luh1;JFJIFLpx;I)V

    .line 142
    .line 143
    .line 144
    const v0, 0x790b0236

    .line 145
    .line 146
    .line 147
    invoke-static {v8, v6, v1, v0, v1}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v0, v1, v12}, Lse;->l(Ljava/lang/String;Lpx;I)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_3
    invoke-virtual {v1}, Lgo0;->R()V

    .line 156
    .line 157
    .line 158
    :goto_3
    return-object v10

    .line 159
    :pswitch_1
    move-object/from16 v0, p1

    .line 160
    .line 161
    check-cast v0, Lo71;

    .line 162
    .line 163
    move-object/from16 v1, p2

    .line 164
    .line 165
    check-cast v1, Lpx;

    .line 166
    .line 167
    move-object/from16 v2, p3

    .line 168
    .line 169
    check-cast v2, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    and-int/lit8 v0, v2, 0x11

    .line 179
    .line 180
    if-eq v0, v9, :cond_4

    .line 181
    .line 182
    move v12, v11

    .line 183
    :cond_4
    and-int/lit8 v0, v2, 0x1

    .line 184
    .line 185
    move-object v5, v1

    .line 186
    check-cast v5, Lgo0;

    .line 187
    .line 188
    invoke-virtual {v5, v0, v12}, Lgo0;->O(IZ)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_5

    .line 193
    .line 194
    const v0, 0x790b0205

    .line 195
    .line 196
    .line 197
    invoke-static {v0, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    const v0, 0x790b021c

    .line 202
    .line 203
    .line 204
    invoke-static {v0, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    const/4 v6, 0x0

    .line 209
    const/4 v7, 0x1

    .line 210
    const/4 v2, 0x0

    .line 211
    invoke-static/range {v2 .. v7}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_5
    invoke-virtual {v5}, Lgo0;->R()V

    .line 216
    .line 217
    .line 218
    :goto_4
    return-object v10

    .line 219
    :pswitch_2
    move-object/from16 v0, p1

    .line 220
    .line 221
    check-cast v0, Lpb2;

    .line 222
    .line 223
    move-object/from16 v1, p2

    .line 224
    .line 225
    check-cast v1, Lpx;

    .line 226
    .line 227
    move-object/from16 v2, p3

    .line 228
    .line 229
    check-cast v2, Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    and-int/lit8 v0, v2, 0x11

    .line 239
    .line 240
    if-eq v0, v9, :cond_6

    .line 241
    .line 242
    move v12, v11

    .line 243
    :cond_6
    and-int/lit8 v0, v2, 0x1

    .line 244
    .line 245
    check-cast v1, Lgo0;

    .line 246
    .line 247
    invoke-virtual {v1, v0, v12}, Lgo0;->O(IZ)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_7

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_7
    invoke-virtual {v1}, Lgo0;->R()V

    .line 255
    .line 256
    .line 257
    :goto_5
    return-object v10

    .line 258
    :pswitch_3
    move-object/from16 v0, p1

    .line 259
    .line 260
    check-cast v0, Lo71;

    .line 261
    .line 262
    move-object/from16 v1, p2

    .line 263
    .line 264
    check-cast v1, Lpx;

    .line 265
    .line 266
    move-object/from16 v2, p3

    .line 267
    .line 268
    check-cast v2, Ljava/lang/Integer;

    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    and-int/lit8 v0, v2, 0x11

    .line 278
    .line 279
    if-eq v0, v9, :cond_8

    .line 280
    .line 281
    move v12, v11

    .line 282
    :cond_8
    and-int/lit8 v0, v2, 0x1

    .line 283
    .line 284
    move-object v5, v1

    .line 285
    check-cast v5, Lgo0;

    .line 286
    .line 287
    invoke-virtual {v5, v0, v12}, Lgo0;->O(IZ)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_9

    .line 292
    .line 293
    const v0, 0x790b0126

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    const v0, 0x790b0125

    .line 301
    .line 302
    .line 303
    invoke-static {v0, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    const/4 v6, 0x0

    .line 308
    const/4 v7, 0x1

    .line 309
    const/4 v2, 0x0

    .line 310
    invoke-static/range {v2 .. v7}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 311
    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_9
    invoke-virtual {v5}, Lgo0;->R()V

    .line 315
    .line 316
    .line 317
    :goto_6
    return-object v10

    .line 318
    :pswitch_4
    move-object/from16 v0, p1

    .line 319
    .line 320
    check-cast v0, Lo71;

    .line 321
    .line 322
    move-object/from16 v1, p2

    .line 323
    .line 324
    check-cast v1, Lpx;

    .line 325
    .line 326
    move-object/from16 v2, p3

    .line 327
    .line 328
    check-cast v2, Ljava/lang/Integer;

    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    and-int/lit8 v0, v2, 0x11

    .line 338
    .line 339
    if-eq v0, v9, :cond_a

    .line 340
    .line 341
    move v0, v11

    .line 342
    goto :goto_7

    .line 343
    :cond_a
    move v0, v12

    .line 344
    :goto_7
    and-int/2addr v2, v11

    .line 345
    check-cast v1, Lgo0;

    .line 346
    .line 347
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_b

    .line 352
    .line 353
    invoke-static {v12, v1}, Ls11;->g(ILpx;)V

    .line 354
    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_b
    invoke-virtual {v1}, Lgo0;->R()V

    .line 358
    .line 359
    .line 360
    :goto_8
    return-object v10

    .line 361
    :pswitch_5
    move-object/from16 v0, p1

    .line 362
    .line 363
    check-cast v0, Lo71;

    .line 364
    .line 365
    move-object/from16 v1, p2

    .line 366
    .line 367
    check-cast v1, Lpx;

    .line 368
    .line 369
    move-object/from16 v2, p3

    .line 370
    .line 371
    check-cast v2, Ljava/lang/Integer;

    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    and-int/lit8 v0, v2, 0x11

    .line 381
    .line 382
    if-eq v0, v9, :cond_c

    .line 383
    .line 384
    move v0, v11

    .line 385
    goto :goto_9

    .line 386
    :cond_c
    move v0, v12

    .line 387
    :goto_9
    and-int/2addr v2, v11

    .line 388
    check-cast v1, Lgo0;

    .line 389
    .line 390
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_d

    .line 395
    .line 396
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {v5, v0, v1}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-static {v0, v3, v1, v12}, Lci0;->q(Ljava/lang/String;Luh1;Lpx;I)V

    .line 405
    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_d
    invoke-virtual {v1}, Lgo0;->R()V

    .line 409
    .line 410
    .line 411
    :goto_a
    return-object v10

    .line 412
    :pswitch_6
    move-object/from16 v0, p1

    .line 413
    .line 414
    check-cast v0, Lo71;

    .line 415
    .line 416
    move-object/from16 v1, p2

    .line 417
    .line 418
    check-cast v1, Lpx;

    .line 419
    .line 420
    move-object/from16 v2, p3

    .line 421
    .line 422
    check-cast v2, Ljava/lang/Integer;

    .line 423
    .line 424
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    and-int/lit8 v0, v2, 0x11

    .line 432
    .line 433
    if-eq v0, v9, :cond_e

    .line 434
    .line 435
    move v0, v11

    .line 436
    goto :goto_b

    .line 437
    :cond_e
    move v0, v12

    .line 438
    :goto_b
    and-int/2addr v2, v11

    .line 439
    check-cast v1, Lgo0;

    .line 440
    .line 441
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_f

    .line 446
    .line 447
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-static {v5, v0, v1}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-static {v0, v3, v1, v12}, Lci0;->q(Ljava/lang/String;Luh1;Lpx;I)V

    .line 456
    .line 457
    .line 458
    goto :goto_c

    .line 459
    :cond_f
    invoke-virtual {v1}, Lgo0;->R()V

    .line 460
    .line 461
    .line 462
    :goto_c
    return-object v10

    .line 463
    :pswitch_7
    move-object/from16 v0, p1

    .line 464
    .line 465
    check-cast v0, Lbv;

    .line 466
    .line 467
    move-object/from16 v1, p2

    .line 468
    .line 469
    check-cast v1, Lpx;

    .line 470
    .line 471
    move-object/from16 v2, p3

    .line 472
    .line 473
    check-cast v2, Ljava/lang/Integer;

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    and-int/lit8 v0, v2, 0x11

    .line 483
    .line 484
    if-eq v0, v9, :cond_10

    .line 485
    .line 486
    move v0, v11

    .line 487
    goto :goto_d

    .line 488
    :cond_10
    move v0, v12

    .line 489
    :goto_d
    and-int/2addr v2, v11

    .line 490
    check-cast v1, Lgo0;

    .line 491
    .line 492
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_11

    .line 497
    .line 498
    const v0, 0x790b0087

    .line 499
    .line 500
    .line 501
    invoke-static {v0, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0, v1, v12}, Lt11;->i(Ljava/lang/String;Lpx;I)V

    .line 506
    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_11
    invoke-virtual {v1}, Lgo0;->R()V

    .line 510
    .line 511
    .line 512
    :goto_e
    return-object v10

    .line 513
    :pswitch_8
    move-object/from16 v0, p1

    .line 514
    .line 515
    check-cast v0, Lbv;

    .line 516
    .line 517
    move-object/from16 v1, p2

    .line 518
    .line 519
    check-cast v1, Lpx;

    .line 520
    .line 521
    move-object/from16 v2, p3

    .line 522
    .line 523
    check-cast v2, Ljava/lang/Integer;

    .line 524
    .line 525
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    and-int/lit8 v0, v2, 0x11

    .line 533
    .line 534
    if-eq v0, v9, :cond_12

    .line 535
    .line 536
    move v0, v11

    .line 537
    goto :goto_f

    .line 538
    :cond_12
    move v0, v12

    .line 539
    :goto_f
    and-int/2addr v2, v11

    .line 540
    check-cast v1, Lgo0;

    .line 541
    .line 542
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-eqz v0, :cond_13

    .line 547
    .line 548
    invoke-static {v8, v7}, Lte;->g0(Luh1;F)Luh1;

    .line 549
    .line 550
    .line 551
    move-result-object v13

    .line 552
    sget-object v0, Lur1;->a:Ltu2;

    .line 553
    .line 554
    invoke-virtual {v1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    check-cast v0, Llp1;

    .line 559
    .line 560
    iget-wide v14, v0, Llp1;->g:J

    .line 561
    .line 562
    const/16 v20, 0x0

    .line 563
    .line 564
    const/16 v22, 0x186

    .line 565
    .line 566
    const/high16 v16, 0x40200000    # 2.5f

    .line 567
    .line 568
    const-wide/16 v17, 0x0

    .line 569
    .line 570
    const/16 v19, 0x0

    .line 571
    .line 572
    move-object/from16 v21, v1

    .line 573
    .line 574
    invoke-static/range {v13 .. v22}, Lx32;->a(Luh1;JFJIFLpx;I)V

    .line 575
    .line 576
    .line 577
    const v0, 0x790b0086

    .line 578
    .line 579
    .line 580
    invoke-static {v8, v6, v1, v0, v1}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-static {v0, v1, v12}, Lt11;->i(Ljava/lang/String;Lpx;I)V

    .line 585
    .line 586
    .line 587
    goto :goto_10

    .line 588
    :cond_13
    invoke-virtual {v1}, Lgo0;->R()V

    .line 589
    .line 590
    .line 591
    :goto_10
    return-object v10

    .line 592
    :pswitch_9
    move-object/from16 v0, p1

    .line 593
    .line 594
    check-cast v0, Lbv;

    .line 595
    .line 596
    move-object/from16 v1, p2

    .line 597
    .line 598
    check-cast v1, Lpx;

    .line 599
    .line 600
    move-object/from16 v2, p3

    .line 601
    .line 602
    check-cast v2, Ljava/lang/Integer;

    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    and-int/lit8 v0, v2, 0x11

    .line 612
    .line 613
    if-eq v0, v9, :cond_14

    .line 614
    .line 615
    move v0, v11

    .line 616
    goto :goto_11

    .line 617
    :cond_14
    move v0, v12

    .line 618
    :goto_11
    and-int/2addr v2, v11

    .line 619
    check-cast v1, Lgo0;

    .line 620
    .line 621
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    if-eqz v0, :cond_15

    .line 626
    .line 627
    const v0, 0x790b0063

    .line 628
    .line 629
    .line 630
    invoke-static {v0, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-static {v0, v1, v12}, Ls11;->e(Ljava/lang/String;Lpx;I)V

    .line 635
    .line 636
    .line 637
    goto :goto_12

    .line 638
    :cond_15
    invoke-virtual {v1}, Lgo0;->R()V

    .line 639
    .line 640
    .line 641
    :goto_12
    return-object v10

    .line 642
    :pswitch_a
    move-object/from16 v0, p1

    .line 643
    .line 644
    check-cast v0, Lbv;

    .line 645
    .line 646
    move-object/from16 v1, p2

    .line 647
    .line 648
    check-cast v1, Lpx;

    .line 649
    .line 650
    move-object/from16 v2, p3

    .line 651
    .line 652
    check-cast v2, Ljava/lang/Integer;

    .line 653
    .line 654
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    and-int/lit8 v0, v2, 0x11

    .line 662
    .line 663
    if-eq v0, v9, :cond_16

    .line 664
    .line 665
    move v0, v11

    .line 666
    goto :goto_13

    .line 667
    :cond_16
    move v0, v12

    .line 668
    :goto_13
    and-int/2addr v2, v11

    .line 669
    check-cast v1, Lgo0;

    .line 670
    .line 671
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_17

    .line 676
    .line 677
    invoke-static {v8, v7}, Lte;->g0(Luh1;F)Luh1;

    .line 678
    .line 679
    .line 680
    move-result-object v13

    .line 681
    sget-object v0, Lur1;->a:Ltu2;

    .line 682
    .line 683
    invoke-virtual {v1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    check-cast v0, Llp1;

    .line 688
    .line 689
    iget-wide v14, v0, Llp1;->g:J

    .line 690
    .line 691
    const/16 v20, 0x0

    .line 692
    .line 693
    const/16 v22, 0x186

    .line 694
    .line 695
    const/high16 v16, 0x40200000    # 2.5f

    .line 696
    .line 697
    const-wide/16 v17, 0x0

    .line 698
    .line 699
    const/16 v19, 0x0

    .line 700
    .line 701
    move-object/from16 v21, v1

    .line 702
    .line 703
    invoke-static/range {v13 .. v22}, Lx32;->a(Luh1;JFJIFLpx;I)V

    .line 704
    .line 705
    .line 706
    const v0, 0x790b0060

    .line 707
    .line 708
    .line 709
    invoke-static {v8, v6, v1, v0, v1}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v0, v1, v12}, Ls11;->e(Ljava/lang/String;Lpx;I)V

    .line 714
    .line 715
    .line 716
    goto :goto_14

    .line 717
    :cond_17
    invoke-virtual {v1}, Lgo0;->R()V

    .line 718
    .line 719
    .line 720
    :goto_14
    return-object v10

    .line 721
    :pswitch_b
    move-object/from16 v0, p1

    .line 722
    .line 723
    check-cast v0, Lo71;

    .line 724
    .line 725
    move-object/from16 v1, p2

    .line 726
    .line 727
    check-cast v1, Lpx;

    .line 728
    .line 729
    move-object/from16 v2, p3

    .line 730
    .line 731
    check-cast v2, Ljava/lang/Integer;

    .line 732
    .line 733
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    and-int/lit8 v0, v2, 0x11

    .line 741
    .line 742
    if-eq v0, v9, :cond_18

    .line 743
    .line 744
    move v12, v11

    .line 745
    :cond_18
    and-int/lit8 v0, v2, 0x1

    .line 746
    .line 747
    move-object v5, v1

    .line 748
    check-cast v5, Lgo0;

    .line 749
    .line 750
    invoke-virtual {v5, v0, v12}, Lgo0;->O(IZ)Z

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    if-eqz v0, :cond_19

    .line 755
    .line 756
    const v0, 0x790b0165

    .line 757
    .line 758
    .line 759
    invoke-static {v0, v5}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    sget-object v4, Lci0;->g:Lkw;

    .line 764
    .line 765
    const/16 v6, 0x180

    .line 766
    .line 767
    const/4 v7, 0x1

    .line 768
    const/4 v2, 0x0

    .line 769
    invoke-static/range {v2 .. v7}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 770
    .line 771
    .line 772
    goto :goto_15

    .line 773
    :cond_19
    invoke-virtual {v5}, Lgo0;->R()V

    .line 774
    .line 775
    .line 776
    :goto_15
    return-object v10

    .line 777
    :pswitch_c
    move-object/from16 v0, p1

    .line 778
    .line 779
    check-cast v0, Lbv;

    .line 780
    .line 781
    move-object/from16 v1, p2

    .line 782
    .line 783
    check-cast v1, Lpx;

    .line 784
    .line 785
    move-object/from16 v2, p3

    .line 786
    .line 787
    check-cast v2, Ljava/lang/Integer;

    .line 788
    .line 789
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    and-int/lit8 v0, v2, 0x11

    .line 797
    .line 798
    if-eq v0, v9, :cond_1a

    .line 799
    .line 800
    move v0, v11

    .line 801
    goto :goto_16

    .line 802
    :cond_1a
    move v0, v12

    .line 803
    :goto_16
    and-int/2addr v2, v11

    .line 804
    check-cast v1, Lgo0;

    .line 805
    .line 806
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-eqz v0, :cond_1b

    .line 811
    .line 812
    const v0, 0x790b0020

    .line 813
    .line 814
    .line 815
    invoke-static {v0, v1}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-static {v0, v1, v12}, Lse;->f(Ljava/lang/String;Lpx;I)V

    .line 820
    .line 821
    .line 822
    goto :goto_17

    .line 823
    :cond_1b
    invoke-virtual {v1}, Lgo0;->R()V

    .line 824
    .line 825
    .line 826
    :goto_17
    return-object v10

    .line 827
    :pswitch_d
    move-object/from16 v0, p1

    .line 828
    .line 829
    check-cast v0, Lbv;

    .line 830
    .line 831
    move-object/from16 v1, p2

    .line 832
    .line 833
    check-cast v1, Lpx;

    .line 834
    .line 835
    move-object/from16 v2, p3

    .line 836
    .line 837
    check-cast v2, Ljava/lang/Integer;

    .line 838
    .line 839
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    and-int/lit8 v0, v2, 0x11

    .line 847
    .line 848
    if-eq v0, v9, :cond_1c

    .line 849
    .line 850
    move v0, v11

    .line 851
    goto :goto_18

    .line 852
    :cond_1c
    move v0, v12

    .line 853
    :goto_18
    and-int/2addr v2, v11

    .line 854
    check-cast v1, Lgo0;

    .line 855
    .line 856
    invoke-virtual {v1, v2, v0}, Lgo0;->O(IZ)Z

    .line 857
    .line 858
    .line 859
    move-result v0

    .line 860
    if-eqz v0, :cond_1d

    .line 861
    .line 862
    invoke-static {v8, v7}, Lte;->g0(Luh1;F)Luh1;

    .line 863
    .line 864
    .line 865
    move-result-object v13

    .line 866
    sget-object v0, Lur1;->a:Ltu2;

    .line 867
    .line 868
    invoke-virtual {v1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    check-cast v0, Llp1;

    .line 873
    .line 874
    iget-wide v14, v0, Llp1;->g:J

    .line 875
    .line 876
    const/16 v20, 0x0

    .line 877
    .line 878
    const/16 v22, 0x186

    .line 879
    .line 880
    const/high16 v16, 0x40200000    # 2.5f

    .line 881
    .line 882
    const-wide/16 v17, 0x0

    .line 883
    .line 884
    const/16 v19, 0x0

    .line 885
    .line 886
    move-object/from16 v21, v1

    .line 887
    .line 888
    invoke-static/range {v13 .. v22}, Lx32;->a(Luh1;JFJIFLpx;I)V

    .line 889
    .line 890
    .line 891
    const v0, 0x790b0022

    .line 892
    .line 893
    .line 894
    invoke-static {v8, v6, v1, v0, v1}, Lvi0;->f(Lrh1;FLgo0;ILgo0;)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    invoke-static {v0, v1, v12}, Lse;->f(Ljava/lang/String;Lpx;I)V

    .line 899
    .line 900
    .line 901
    goto :goto_19

    .line 902
    :cond_1d
    invoke-virtual {v1}, Lgo0;->R()V

    .line 903
    .line 904
    .line 905
    :goto_19
    return-object v10

    .line 906
    :pswitch_e
    move-object/from16 v0, p1

    .line 907
    .line 908
    check-cast v0, Lpf1;

    .line 909
    .line 910
    move-object/from16 v3, p2

    .line 911
    .line 912
    check-cast v3, Lif1;

    .line 913
    .line 914
    move-object/from16 v4, p3

    .line 915
    .line 916
    check-cast v4, Lfz;

    .line 917
    .line 918
    invoke-interface {v0, v2}, Le70;->T(F)I

    .line 919
    .line 920
    .line 921
    move-result v2

    .line 922
    iget-wide v4, v4, Lfz;->a:J

    .line 923
    .line 924
    mul-int/lit8 v6, v2, 0x2

    .line 925
    .line 926
    invoke-static {v12, v6, v4, v5}, Lgz;->i(IIJ)J

    .line 927
    .line 928
    .line 929
    move-result-wide v4

    .line 930
    invoke-interface {v3, v4, v5}, Lif1;->e(J)Lsz1;

    .line 931
    .line 932
    .line 933
    move-result-object v3

    .line 934
    iget v4, v3, Lsz1;->i:I

    .line 935
    .line 936
    sub-int/2addr v4, v6

    .line 937
    iget v5, v3, Lsz1;->h:I

    .line 938
    .line 939
    new-instance v6, Lo4;

    .line 940
    .line 941
    invoke-direct {v6, v3, v2, v12}, Lo4;-><init>(Lsz1;II)V

    .line 942
    .line 943
    .line 944
    invoke-interface {v0, v5, v4, v1, v6}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    return-object v0

    .line 949
    :pswitch_f
    move-object/from16 v0, p1

    .line 950
    .line 951
    check-cast v0, Lpf1;

    .line 952
    .line 953
    move-object/from16 v3, p2

    .line 954
    .line 955
    check-cast v3, Lif1;

    .line 956
    .line 957
    move-object/from16 v4, p3

    .line 958
    .line 959
    check-cast v4, Lfz;

    .line 960
    .line 961
    invoke-interface {v0, v2}, Le70;->T(F)I

    .line 962
    .line 963
    .line 964
    move-result v2

    .line 965
    iget-wide v4, v4, Lfz;->a:J

    .line 966
    .line 967
    mul-int/lit8 v6, v2, 0x2

    .line 968
    .line 969
    invoke-static {v6, v12, v4, v5}, Lgz;->i(IIJ)J

    .line 970
    .line 971
    .line 972
    move-result-wide v4

    .line 973
    invoke-interface {v3, v4, v5}, Lif1;->e(J)Lsz1;

    .line 974
    .line 975
    .line 976
    move-result-object v3

    .line 977
    iget v4, v3, Lsz1;->i:I

    .line 978
    .line 979
    iget v5, v3, Lsz1;->h:I

    .line 980
    .line 981
    sub-int/2addr v5, v6

    .line 982
    new-instance v6, Lo4;

    .line 983
    .line 984
    invoke-direct {v6, v3, v2, v11}, Lo4;-><init>(Lsz1;II)V

    .line 985
    .line 986
    .line 987
    invoke-interface {v0, v5, v4, v1, v6}, Lpf1;->j0(IILjava/util/Map;Lin0;)Lof1;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    return-object v0

    .line 992
    :pswitch_10
    move-object/from16 v0, p1

    .line 993
    .line 994
    check-cast v0, Lm00;

    .line 995
    .line 996
    move-object/from16 v1, p2

    .line 997
    .line 998
    check-cast v1, Lpx;

    .line 999
    .line 1000
    move-object/from16 v2, p3

    .line 1001
    .line 1002
    check-cast v2, Ljava/lang/Integer;

    .line 1003
    .line 1004
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1005
    .line 1006
    .line 1007
    move-result v2

    .line 1008
    and-int/lit8 v3, v2, 0x6

    .line 1009
    .line 1010
    if-nez v3, :cond_1f

    .line 1011
    .line 1012
    move-object v3, v1

    .line 1013
    check-cast v3, Lgo0;

    .line 1014
    .line 1015
    invoke-virtual {v3, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    if-eqz v3, :cond_1e

    .line 1020
    .line 1021
    const/4 v3, 0x4

    .line 1022
    goto :goto_1a

    .line 1023
    :cond_1e
    const/4 v3, 0x2

    .line 1024
    :goto_1a
    or-int/2addr v2, v3

    .line 1025
    :cond_1f
    and-int/lit8 v3, v2, 0x13

    .line 1026
    .line 1027
    const/16 v4, 0x12

    .line 1028
    .line 1029
    if-eq v3, v4, :cond_20

    .line 1030
    .line 1031
    move v3, v11

    .line 1032
    goto :goto_1b

    .line 1033
    :cond_20
    move v3, v12

    .line 1034
    :goto_1b
    and-int/2addr v2, v11

    .line 1035
    check-cast v1, Lgo0;

    .line 1036
    .line 1037
    invoke-virtual {v1, v2, v3}, Lgo0;->O(IZ)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v2

    .line 1041
    if-eqz v2, :cond_21

    .line 1042
    .line 1043
    sget v2, Lo00;->g:F

    .line 1044
    .line 1045
    const/4 v3, 0x0

    .line 1046
    invoke-static {v8, v3, v2, v11}, Lfg1;->E(Luh1;FFI)Luh1;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v2

    .line 1050
    sget-object v3, Lte;->e:Lyi0;

    .line 1051
    .line 1052
    invoke-interface {v2, v3}, Luh1;->c(Luh1;)Luh1;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    sget v3, Lo00;->f:F

    .line 1057
    .line 1058
    invoke-static {v2, v3}, Lte;->O(Luh1;F)Luh1;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    iget-wide v3, v0, Lm00;->c:J

    .line 1063
    .line 1064
    sget-object v0, Lsp0;->h:Liu0;

    .line 1065
    .line 1066
    invoke-static {v2, v3, v4, v0}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    invoke-static {v0, v1, v12}, Ldm;->a(Luh1;Lpx;I)V

    .line 1071
    .line 1072
    .line 1073
    goto :goto_1c

    .line 1074
    :cond_21
    invoke-virtual {v1}, Lgo0;->R()V

    .line 1075
    .line 1076
    .line 1077
    :goto_1c
    return-object v10

    .line 1078
    nop

    .line 1079
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
