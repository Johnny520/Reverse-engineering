.class public final synthetic Lt32;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lv32;


# direct methods
.method public synthetic constructor <init>(Lv32;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt32;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lt32;->ζ:Lv32;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lt32;->ε:I

    .line 4
    .line 5
    iget-object v0, v0, Lt32;->ζ:Lv32;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v4, v0, Lv32;->Ζ:Lu32;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    move v2, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-boolean v1, v4, Lu32;->γ:Z

    .line 27
    .line 28
    invoke-static {v0}, Li91;->ν(Lzr1;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lbd;->Α(Lqp0;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lyh;->Σ(Lbw;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, Lg4;

    .line 45
    .line 46
    iget-object v3, v1, Lg4;->ζ:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, v0, Lv32;->Ζ:Lu32;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget-object v2, v1, Lu32;->β:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iput-object v3, v1, Lu32;->β:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v2, v1, Lu32;->δ:Lq91;

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-object v4, v0, Lv32;->υ:Lw32;

    .line 68
    .line 69
    iget-object v5, v0, Lv32;->φ:Lf50;

    .line 70
    .line 71
    iget v6, v0, Lv32;->χ:I

    .line 72
    .line 73
    iget-boolean v7, v0, Lv32;->ψ:Z

    .line 74
    .line 75
    iget v8, v0, Lv32;->ω:I

    .line 76
    .line 77
    iget v9, v0, Lv32;->Α:I

    .line 78
    .line 79
    invoke-virtual/range {v2 .. v9}, Lq91;->δ(Ljava/lang/String;Lw32;Lf50;IZII)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    new-instance v1, Lu32;

    .line 84
    .line 85
    iget-object v2, v0, Lv32;->τ:Ljava/lang/String;

    .line 86
    .line 87
    invoke-direct {v1, v2, v3}, Lu32;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance v2, Lq91;

    .line 91
    .line 92
    iget-object v4, v0, Lv32;->υ:Lw32;

    .line 93
    .line 94
    iget-object v5, v0, Lv32;->φ:Lf50;

    .line 95
    .line 96
    iget v6, v0, Lv32;->χ:I

    .line 97
    .line 98
    iget-boolean v7, v0, Lv32;->ψ:Z

    .line 99
    .line 100
    iget v8, v0, Lv32;->ω:I

    .line 101
    .line 102
    iget v9, v0, Lv32;->Α:I

    .line 103
    .line 104
    invoke-direct/range {v2 .. v9}, Lq91;-><init>(Ljava/lang/String;Lw32;Lf50;IZII)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lv32;->В()Lq91;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget-object v3, v3, Lq91;->ι:Lyr;

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Lq91;->γ(Lyr;)V

    .line 114
    .line 115
    .line 116
    iput-object v2, v1, Lu32;->δ:Lq91;

    .line 117
    .line 118
    iput-object v1, v0, Lv32;->Ζ:Lu32;

    .line 119
    .line 120
    :cond_3
    :goto_1
    invoke-static {v0}, Li91;->ν(Lzr1;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v0}, Lbd;->Α(Lqp0;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lyh;->Σ(Lbw;)V

    .line 127
    .line 128
    .line 129
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_1
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, Ljava/util/List;

    .line 135
    .line 136
    invoke-virtual {v0}, Lv32;->В()Lq91;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    iget-object v0, v0, Lv32;->υ:Lw32;

    .line 141
    .line 142
    sget-wide v5, Lci;->η:J

    .line 143
    .line 144
    invoke-static {v0, v5, v6}, Lw32;->α(Lw32;J)Lw32;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    iget-object v15, v4, Lq91;->ο:Lnp0;

    .line 149
    .line 150
    if-nez v15, :cond_4

    .line 151
    .line 152
    :goto_2
    move-object/from16 v26, v1

    .line 153
    .line 154
    move/from16 p0, v2

    .line 155
    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    goto/16 :goto_24

    .line 159
    .line 160
    :cond_4
    iget-object v14, v4, Lq91;->ι:Lyr;

    .line 161
    .line 162
    if-nez v14, :cond_5

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    new-instance v8, Lg4;

    .line 166
    .line 167
    iget-object v5, v4, Lq91;->α:Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v8, v5}, Lg4;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object v5, v4, Lq91;->κ:Ls2;

    .line 173
    .line 174
    if-nez v5, :cond_6

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    iget-object v5, v4, Lq91;->ξ:Lo91;

    .line 178
    .line 179
    if-nez v5, :cond_7

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_7
    iget-wide v5, v4, Lq91;->π:J

    .line 183
    .line 184
    const-wide v10, -0x1fffffffdL

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    and-long v17, v5, v10

    .line 190
    .line 191
    new-instance v5, Lm32;

    .line 192
    .line 193
    new-instance v7, Ll32;

    .line 194
    .line 195
    iget v11, v4, Lq91;->ζ:I

    .line 196
    .line 197
    iget-boolean v12, v4, Lq91;->ε:Z

    .line 198
    .line 199
    iget v13, v4, Lq91;->δ:I

    .line 200
    .line 201
    iget-object v6, v4, Lq91;->γ:Lf50;

    .line 202
    .line 203
    sget-object v10, Ljz;->ε:Ljz;

    .line 204
    .line 205
    move-object/from16 v16, v6

    .line 206
    .line 207
    invoke-direct/range {v7 .. v18}, Ll32;-><init>(Lg4;Lw32;Ljava/util/List;IZILyr;Lnp0;Lf50;J)V

    .line 208
    .line 209
    .line 210
    move-object v11, v10

    .line 211
    move-object v10, v7

    .line 212
    move-wide/from16 v6, v17

    .line 213
    .line 214
    new-instance v12, Lg11;

    .line 215
    .line 216
    new-instance v13, Lb8;

    .line 217
    .line 218
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object v8, v13, Lb8;->β:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v11, v13, Lb8;->γ:Ljava/lang/Object;

    .line 224
    .line 225
    new-instance v11, Lh11;

    .line 226
    .line 227
    invoke-direct {v11, v13, v3}, Lh11;-><init>(Lb8;I)V

    .line 228
    .line 229
    .line 230
    sget-object v15, Lqq0;->ζ:Lqq0;

    .line 231
    .line 232
    invoke-static {v15, v11}, Lln0;->Σ(Lqq0;Lp70;)Loq0;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    iput-object v11, v13, Lb8;->α:Ljava/lang/Object;

    .line 237
    .line 238
    new-instance v11, Lh11;

    .line 239
    .line 240
    invoke-direct {v11, v13, v2}, Lh11;-><init>(Lb8;I)V

    .line 241
    .line 242
    .line 243
    invoke-static {v15, v11}, Lln0;->Σ(Lqq0;Lp70;)Loq0;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    iput-object v11, v13, Lb8;->δ:Ljava/lang/Object;

    .line 248
    .line 249
    iget-object v11, v9, Lw32;->β:Lr91;

    .line 250
    .line 251
    sget v15, Lh4;->α:I

    .line 252
    .line 253
    sget-object v15, Ljz;->ε:Ljz;

    .line 254
    .line 255
    move/from16 p0, v2

    .line 256
    .line 257
    iget-object v2, v8, Lg4;->θ:Ljava/util/ArrayList;

    .line 258
    .line 259
    if-eqz v2, :cond_8

    .line 260
    .line 261
    new-instance v0, Ld50;

    .line 262
    .line 263
    const/4 v3, 0x6

    .line 264
    invoke-direct {v0, v3}, Ld50;-><init>(I)V

    .line 265
    .line 266
    .line 267
    invoke-static {v2, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    goto :goto_3

    .line 272
    :cond_8
    move-object v0, v15

    .line 273
    :goto_3
    new-instance v2, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 276
    .line 277
    .line 278
    new-instance v3, Lw6;

    .line 279
    .line 280
    invoke-direct {v3}, Lw6;-><init>()V

    .line 281
    .line 282
    .line 283
    move-wide/from16 v23, v6

    .line 284
    .line 285
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    const/4 v7, 0x0

    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    :goto_4
    if-ge v7, v6, :cond_13

    .line 293
    .line 294
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v18

    .line 298
    move-object/from16 v19, v0

    .line 299
    .line 300
    move-object/from16 v0, v18

    .line 301
    .line 302
    check-cast v0, Lf4;

    .line 303
    .line 304
    move/from16 v18, v6

    .line 305
    .line 306
    iget-object v6, v0, Lf4;->α:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v6, Lr91;

    .line 309
    .line 310
    invoke-virtual {v11, v6}, Lr91;->α(Lr91;)Lr91;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    move/from16 v20, v7

    .line 315
    .line 316
    iget v7, v0, Lf4;->β:I

    .line 317
    .line 318
    iget v0, v0, Lf4;->γ:I

    .line 319
    .line 320
    if-gt v7, v0, :cond_9

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_9
    const-string v21, "Reversed range is not supported"

    .line 324
    .line 325
    invoke-static/range {v21 .. v21}, Lbm0;->α(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :goto_5
    move-object/from16 v22, v14

    .line 329
    .line 330
    move/from16 v14, v17

    .line 331
    .line 332
    :goto_6
    if-ge v14, v7, :cond_c

    .line 333
    .line 334
    invoke-virtual {v3}, Lw6;->isEmpty()Z

    .line 335
    .line 336
    .line 337
    move-result v17

    .line 338
    if-nez v17, :cond_c

    .line 339
    .line 340
    invoke-virtual {v3}, Lw6;->last()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v17

    .line 344
    move-object/from16 v25, v15

    .line 345
    .line 346
    move-object/from16 v15, v17

    .line 347
    .line 348
    check-cast v15, Lf4;

    .line 349
    .line 350
    move-object/from16 v26, v1

    .line 351
    .line 352
    iget v1, v15, Lf4;->γ:I

    .line 353
    .line 354
    move-object/from16 v27, v5

    .line 355
    .line 356
    iget-object v5, v15, Lf4;->α:Ljava/lang/Object;

    .line 357
    .line 358
    if-ge v7, v1, :cond_a

    .line 359
    .line 360
    new-instance v1, Lf4;

    .line 361
    .line 362
    invoke-direct {v1, v14, v7, v5}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move v14, v7

    .line 369
    move-object/from16 v15, v25

    .line 370
    .line 371
    move-object/from16 v1, v26

    .line 372
    .line 373
    move-object/from16 v5, v27

    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_a
    move-object/from16 v28, v10

    .line 377
    .line 378
    new-instance v10, Lf4;

    .line 379
    .line 380
    invoke-direct {v10, v14, v1, v5}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    iget v14, v15, Lf4;->γ:I

    .line 387
    .line 388
    :goto_7
    invoke-virtual {v3}, Lw6;->isEmpty()Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-nez v1, :cond_b

    .line 393
    .line 394
    invoke-virtual {v3}, Lw6;->last()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    check-cast v1, Lf4;

    .line 399
    .line 400
    iget v1, v1, Lf4;->γ:I

    .line 401
    .line 402
    if-ne v14, v1, :cond_b

    .line 403
    .line 404
    invoke-virtual {v3}, Lw6;->removeLast()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    goto :goto_7

    .line 408
    :cond_b
    move-object/from16 v15, v25

    .line 409
    .line 410
    move-object/from16 v1, v26

    .line 411
    .line 412
    move-object/from16 v5, v27

    .line 413
    .line 414
    move-object/from16 v10, v28

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_c
    move-object/from16 v26, v1

    .line 418
    .line 419
    move-object/from16 v27, v5

    .line 420
    .line 421
    move-object/from16 v28, v10

    .line 422
    .line 423
    move-object/from16 v25, v15

    .line 424
    .line 425
    if-ge v14, v7, :cond_d

    .line 426
    .line 427
    new-instance v1, Lf4;

    .line 428
    .line 429
    invoke-direct {v1, v14, v7, v11}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move/from16 v17, v7

    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_d
    move/from16 v17, v14

    .line 439
    .line 440
    :goto_8
    invoke-virtual {v3}, Lw6;->isEmpty()Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_e

    .line 445
    .line 446
    const/4 v1, 0x0

    .line 447
    goto :goto_9

    .line 448
    :cond_e
    iget-object v1, v3, Lw6;->ζ:[Ljava/lang/Object;

    .line 449
    .line 450
    iget v5, v3, Lw6;->ε:I

    .line 451
    .line 452
    invoke-virtual {v3}, Lw6;->α()I

    .line 453
    .line 454
    .line 455
    move-result v10

    .line 456
    add-int/lit8 v10, v10, -0x1

    .line 457
    .line 458
    add-int/2addr v10, v5

    .line 459
    invoke-virtual {v3, v10}, Lw6;->θ(I)I

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    aget-object v1, v1, v5

    .line 464
    .line 465
    :goto_9
    check-cast v1, Lf4;

    .line 466
    .line 467
    if-eqz v1, :cond_12

    .line 468
    .line 469
    iget v5, v1, Lf4;->γ:I

    .line 470
    .line 471
    iget-object v10, v1, Lf4;->α:Ljava/lang/Object;

    .line 472
    .line 473
    iget v1, v1, Lf4;->β:I

    .line 474
    .line 475
    if-ne v1, v7, :cond_f

    .line 476
    .line 477
    if-ne v5, v0, :cond_f

    .line 478
    .line 479
    invoke-virtual {v3}, Lw6;->removeLast()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    new-instance v1, Lf4;

    .line 483
    .line 484
    check-cast v10, Lr91;

    .line 485
    .line 486
    invoke-virtual {v10, v6}, Lr91;->α(Lr91;)Lr91;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-direct {v1, v7, v0, v5}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v3, v1}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    goto :goto_a

    .line 497
    :cond_f
    if-ne v1, v5, :cond_10

    .line 498
    .line 499
    new-instance v14, Lf4;

    .line 500
    .line 501
    invoke-direct {v14, v1, v5, v10}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    invoke-virtual {v3}, Lw6;->removeLast()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    new-instance v1, Lf4;

    .line 511
    .line 512
    invoke-direct {v1, v7, v0, v6}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v3, v1}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    goto :goto_a

    .line 519
    :cond_10
    if-lt v5, v0, :cond_11

    .line 520
    .line 521
    new-instance v1, Lf4;

    .line 522
    .line 523
    check-cast v10, Lr91;

    .line 524
    .line 525
    invoke-virtual {v10, v6}, Lr91;->α(Lr91;)Lr91;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    invoke-direct {v1, v7, v0, v5}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3, v1}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    goto :goto_a

    .line 536
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 537
    .line 538
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 539
    .line 540
    .line 541
    throw v0

    .line 542
    :cond_12
    new-instance v1, Lf4;

    .line 543
    .line 544
    invoke-direct {v1, v7, v0, v6}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, v1}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    :goto_a
    add-int/lit8 v7, v20, 0x1

    .line 551
    .line 552
    move/from16 v6, v18

    .line 553
    .line 554
    move-object/from16 v0, v19

    .line 555
    .line 556
    move-object/from16 v14, v22

    .line 557
    .line 558
    move-object/from16 v15, v25

    .line 559
    .line 560
    move-object/from16 v1, v26

    .line 561
    .line 562
    move-object/from16 v5, v27

    .line 563
    .line 564
    move-object/from16 v10, v28

    .line 565
    .line 566
    goto/16 :goto_4

    .line 567
    .line 568
    :cond_13
    move-object/from16 v26, v1

    .line 569
    .line 570
    move-object/from16 v27, v5

    .line 571
    .line 572
    move-object/from16 v28, v10

    .line 573
    .line 574
    move-object/from16 v22, v14

    .line 575
    .line 576
    move-object/from16 v25, v15

    .line 577
    .line 578
    move/from16 v0, v17

    .line 579
    .line 580
    :goto_b
    iget-object v1, v8, Lg4;->ζ:Ljava/lang/String;

    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    if-gt v0, v5, :cond_15

    .line 587
    .line 588
    invoke-virtual {v3}, Lw6;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v5

    .line 592
    if-nez v5, :cond_15

    .line 593
    .line 594
    invoke-virtual {v3}, Lw6;->last()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    check-cast v1, Lf4;

    .line 599
    .line 600
    new-instance v5, Lf4;

    .line 601
    .line 602
    iget-object v6, v1, Lf4;->α:Ljava/lang/Object;

    .line 603
    .line 604
    iget v1, v1, Lf4;->γ:I

    .line 605
    .line 606
    invoke-direct {v5, v0, v1, v6}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    :goto_c
    invoke-virtual {v3}, Lw6;->isEmpty()Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-nez v0, :cond_14

    .line 617
    .line 618
    invoke-virtual {v3}, Lw6;->last()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    check-cast v0, Lf4;

    .line 623
    .line 624
    iget v0, v0, Lf4;->γ:I

    .line 625
    .line 626
    if-ne v1, v0, :cond_14

    .line 627
    .line 628
    invoke-virtual {v3}, Lw6;->removeLast()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    goto :goto_c

    .line 632
    :cond_14
    move v0, v1

    .line 633
    goto :goto_b

    .line 634
    :cond_15
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    if-ge v0, v3, :cond_16

    .line 639
    .line 640
    new-instance v3, Lf4;

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 643
    .line 644
    .line 645
    move-result v5

    .line 646
    invoke-direct {v3, v0, v5, v11}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-eqz v0, :cond_17

    .line 657
    .line 658
    new-instance v0, Lf4;

    .line 659
    .line 660
    const/4 v3, 0x0

    .line 661
    invoke-direct {v0, v3, v3, v11}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    goto :goto_d

    .line 668
    :cond_17
    const/4 v3, 0x0

    .line 669
    :goto_d
    new-instance v0, Ljava/util/ArrayList;

    .line 670
    .line 671
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 679
    .line 680
    .line 681
    move-result v5

    .line 682
    move v6, v3

    .line 683
    :goto_e
    if-ge v6, v5, :cond_25

    .line 684
    .line 685
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    check-cast v7, Lf4;

    .line 690
    .line 691
    iget v10, v7, Lf4;->β:I

    .line 692
    .line 693
    iget v14, v7, Lf4;->γ:I

    .line 694
    .line 695
    new-instance v15, Lg4;

    .line 696
    .line 697
    if-eq v10, v14, :cond_18

    .line 698
    .line 699
    invoke-virtual {v1, v10, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v17

    .line 703
    :goto_f
    move-object/from16 v3, v17

    .line 704
    .line 705
    goto :goto_10

    .line 706
    :cond_18
    const-string v17, ""

    .line 707
    .line 708
    goto :goto_f

    .line 709
    :goto_10
    if-ne v10, v14, :cond_19

    .line 710
    .line 711
    move-object/from16 v29, v1

    .line 712
    .line 713
    :goto_11
    move-object/from16 v30, v2

    .line 714
    .line 715
    move/from16 v31, v5

    .line 716
    .line 717
    move/from16 v32, v6

    .line 718
    .line 719
    move-object/from16 v33, v8

    .line 720
    .line 721
    move-object/from16 v34, v12

    .line 722
    .line 723
    const/4 v2, 0x0

    .line 724
    goto/16 :goto_15

    .line 725
    .line 726
    :cond_19
    move-object/from16 v29, v1

    .line 727
    .line 728
    iget-object v1, v8, Lg4;->ε:Ljava/util/List;

    .line 729
    .line 730
    if-nez v1, :cond_1a

    .line 731
    .line 732
    goto :goto_11

    .line 733
    :cond_1a
    move-object/from16 v30, v2

    .line 734
    .line 735
    if-nez v10, :cond_1d

    .line 736
    .line 737
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    if-lt v14, v2, :cond_1d

    .line 742
    .line 743
    new-instance v2, Ljava/util/ArrayList;

    .line 744
    .line 745
    move/from16 v31, v5

    .line 746
    .line 747
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 752
    .line 753
    .line 754
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 755
    .line 756
    .line 757
    move-result v5

    .line 758
    move/from16 v32, v6

    .line 759
    .line 760
    const/4 v6, 0x0

    .line 761
    :goto_12
    if-ge v6, v5, :cond_1c

    .line 762
    .line 763
    move/from16 v17, v5

    .line 764
    .line 765
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    move/from16 v18, v6

    .line 770
    .line 771
    move-object v6, v5

    .line 772
    check-cast v6, Lf4;

    .line 773
    .line 774
    iget-object v6, v6, Lf4;->α:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v6, Le4;

    .line 777
    .line 778
    instance-of v6, v6, Lr91;

    .line 779
    .line 780
    if-nez v6, :cond_1b

    .line 781
    .line 782
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    :cond_1b
    add-int/lit8 v6, v18, 0x1

    .line 786
    .line 787
    move/from16 v5, v17

    .line 788
    .line 789
    goto :goto_12

    .line 790
    :cond_1c
    move-object/from16 v33, v8

    .line 791
    .line 792
    move-object/from16 v34, v12

    .line 793
    .line 794
    goto :goto_15

    .line 795
    :cond_1d
    move/from16 v31, v5

    .line 796
    .line 797
    move/from16 v32, v6

    .line 798
    .line 799
    new-instance v2, Ljava/util/ArrayList;

    .line 800
    .line 801
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 802
    .line 803
    .line 804
    move-result v5

    .line 805
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 806
    .line 807
    .line 808
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    const/4 v6, 0x0

    .line 813
    :goto_13
    if-ge v6, v5, :cond_1c

    .line 814
    .line 815
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v17

    .line 819
    move-object/from16 v18, v1

    .line 820
    .line 821
    move-object/from16 v1, v17

    .line 822
    .line 823
    check-cast v1, Lf4;

    .line 824
    .line 825
    move/from16 v17, v5

    .line 826
    .line 827
    iget-object v5, v1, Lf4;->α:Ljava/lang/Object;

    .line 828
    .line 829
    move-object/from16 v19, v5

    .line 830
    .line 831
    iget v5, v1, Lf4;->γ:I

    .line 832
    .line 833
    move/from16 v20, v6

    .line 834
    .line 835
    iget v6, v1, Lf4;->β:I

    .line 836
    .line 837
    move-object/from16 v33, v8

    .line 838
    .line 839
    move-object/from16 v8, v19

    .line 840
    .line 841
    check-cast v8, Le4;

    .line 842
    .line 843
    instance-of v8, v8, Lr91;

    .line 844
    .line 845
    if-nez v8, :cond_1e

    .line 846
    .line 847
    invoke-static {v10, v14, v6, v5}, Lh4;->α(IIII)Z

    .line 848
    .line 849
    .line 850
    move-result v8

    .line 851
    if-eqz v8, :cond_1e

    .line 852
    .line 853
    iget-object v8, v1, Lf4;->δ:Ljava/lang/String;

    .line 854
    .line 855
    iget-object v1, v1, Lf4;->α:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v1, Le4;

    .line 858
    .line 859
    invoke-static {v6, v10, v14}, Lj81;->μ(III)I

    .line 860
    .line 861
    .line 862
    move-result v6

    .line 863
    sub-int/2addr v6, v10

    .line 864
    invoke-static {v5, v10, v14}, Lj81;->μ(III)I

    .line 865
    .line 866
    .line 867
    move-result v5

    .line 868
    sub-int/2addr v5, v10

    .line 869
    move-object/from16 v34, v12

    .line 870
    .line 871
    new-instance v12, Lf4;

    .line 872
    .line 873
    invoke-direct {v12, v1, v6, v5, v8}, Lf4;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    goto :goto_14

    .line 880
    :cond_1e
    move-object/from16 v34, v12

    .line 881
    .line 882
    :goto_14
    add-int/lit8 v6, v20, 0x1

    .line 883
    .line 884
    move/from16 v5, v17

    .line 885
    .line 886
    move-object/from16 v1, v18

    .line 887
    .line 888
    move-object/from16 v8, v33

    .line 889
    .line 890
    move-object/from16 v12, v34

    .line 891
    .line 892
    goto :goto_13

    .line 893
    :goto_15
    if-nez v2, :cond_1f

    .line 894
    .line 895
    move-object/from16 v2, v25

    .line 896
    .line 897
    :cond_1f
    invoke-direct {v15, v3, v2}, Lg4;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 898
    .line 899
    .line 900
    iget-object v1, v7, Lf4;->α:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast v1, Lr91;

    .line 903
    .line 904
    iget v2, v1, Lr91;->β:I

    .line 905
    .line 906
    if-nez v2, :cond_20

    .line 907
    .line 908
    iget v2, v11, Lr91;->β:I

    .line 909
    .line 910
    iget v5, v1, Lr91;->α:I

    .line 911
    .line 912
    iget-wide v6, v1, Lr91;->γ:J

    .line 913
    .line 914
    iget-object v8, v1, Lr91;->δ:Lh32;

    .line 915
    .line 916
    iget-object v12, v1, Lr91;->ε:Lkh1;

    .line 917
    .line 918
    move/from16 v37, v2

    .line 919
    .line 920
    iget-object v2, v1, Lr91;->ζ:Lwr0;

    .line 921
    .line 922
    move-object/from16 v42, v2

    .line 923
    .line 924
    iget v2, v1, Lr91;->η:I

    .line 925
    .line 926
    move/from16 v43, v2

    .line 927
    .line 928
    iget v2, v1, Lr91;->θ:I

    .line 929
    .line 930
    iget-object v1, v1, Lr91;->ι:Lq32;

    .line 931
    .line 932
    new-instance v35, Lr91;

    .line 933
    .line 934
    move-object/from16 v45, v1

    .line 935
    .line 936
    move/from16 v44, v2

    .line 937
    .line 938
    move/from16 v36, v5

    .line 939
    .line 940
    move-wide/from16 v38, v6

    .line 941
    .line 942
    move-object/from16 v40, v8

    .line 943
    .line 944
    move-object/from16 v41, v12

    .line 945
    .line 946
    invoke-direct/range {v35 .. v45}, Lr91;-><init>(IIJLh32;Lkh1;Lwr0;IILq32;)V

    .line 947
    .line 948
    .line 949
    move-object/from16 v1, v35

    .line 950
    .line 951
    :cond_20
    new-instance v2, Ln91;

    .line 952
    .line 953
    new-instance v5, Lw32;

    .line 954
    .line 955
    iget-object v6, v9, Lw32;->α:Lux1;

    .line 956
    .line 957
    invoke-virtual {v11, v1}, Lr91;->α(Lr91;)Lr91;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    invoke-direct {v5, v6, v1}, Lw32;-><init>(Lux1;Lr91;)V

    .line 962
    .line 963
    .line 964
    iget-object v1, v15, Lg4;->ε:Ljava/util/List;

    .line 965
    .line 966
    if-nez v1, :cond_21

    .line 967
    .line 968
    move-object/from16 v19, v25

    .line 969
    .line 970
    goto :goto_16

    .line 971
    :cond_21
    move-object/from16 v19, v1

    .line 972
    .line 973
    :goto_16
    iget-object v1, v13, Lb8;->γ:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v1, Ljava/util/List;

    .line 976
    .line 977
    new-instance v6, Ljava/util/ArrayList;

    .line 978
    .line 979
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 980
    .line 981
    .line 982
    move-result v7

    .line 983
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 984
    .line 985
    .line 986
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 987
    .line 988
    .line 989
    move-result v7

    .line 990
    const/4 v8, 0x0

    .line 991
    :goto_17
    if-ge v8, v7, :cond_24

    .line 992
    .line 993
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v12

    .line 997
    check-cast v12, Lf4;

    .line 998
    .line 999
    iget v15, v12, Lf4;->β:I

    .line 1000
    .line 1001
    move-object/from16 v17, v1

    .line 1002
    .line 1003
    iget v1, v12, Lf4;->γ:I

    .line 1004
    .line 1005
    invoke-static {v10, v14, v15, v1}, Lh4;->α(IIII)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v18

    .line 1009
    if-eqz v18, :cond_23

    .line 1010
    .line 1011
    if-gt v10, v15, :cond_22

    .line 1012
    .line 1013
    if-gt v1, v14, :cond_22

    .line 1014
    .line 1015
    :goto_18
    move/from16 v18, v1

    .line 1016
    .line 1017
    goto :goto_19

    .line 1018
    :cond_22
    const-string v18, "placeholder can not overlap with paragraph."

    .line 1019
    .line 1020
    invoke-static/range {v18 .. v18}, Lbm0;->α(Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    goto :goto_18

    .line 1024
    :goto_19
    new-instance v1, Lf4;

    .line 1025
    .line 1026
    iget-object v12, v12, Lf4;->α:Ljava/lang/Object;

    .line 1027
    .line 1028
    sub-int/2addr v15, v10

    .line 1029
    move-object/from16 v20, v3

    .line 1030
    .line 1031
    sub-int v3, v18, v10

    .line 1032
    .line 1033
    invoke-direct {v1, v15, v3, v12}, Lf4;-><init>(IILjava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1037
    .line 1038
    .line 1039
    goto :goto_1a

    .line 1040
    :cond_23
    move-object/from16 v20, v3

    .line 1041
    .line 1042
    :goto_1a
    add-int/lit8 v8, v8, 0x1

    .line 1043
    .line 1044
    move-object/from16 v1, v17

    .line 1045
    .line 1046
    move-object/from16 v3, v20

    .line 1047
    .line 1048
    goto :goto_17

    .line 1049
    :cond_24
    move-object/from16 v20, v3

    .line 1050
    .line 1051
    new-instance v1, Lw2;

    .line 1052
    .line 1053
    move-object/from16 v18, v5

    .line 1054
    .line 1055
    move-object/from16 v21, v16

    .line 1056
    .line 1057
    move-object/from16 v17, v20

    .line 1058
    .line 1059
    move-object/from16 v16, v1

    .line 1060
    .line 1061
    move-object/from16 v20, v6

    .line 1062
    .line 1063
    invoke-direct/range {v16 .. v22}, Lw2;-><init>(Ljava/lang/String;Lw32;Ljava/util/List;Ljava/util/List;Lf50;Lyr;)V

    .line 1064
    .line 1065
    .line 1066
    move-object/from16 v16, v21

    .line 1067
    .line 1068
    invoke-direct {v2, v1, v10, v14}, Ln91;-><init>(Lw2;II)V

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    add-int/lit8 v6, v32, 0x1

    .line 1075
    .line 1076
    move-object/from16 v1, v29

    .line 1077
    .line 1078
    move-object/from16 v2, v30

    .line 1079
    .line 1080
    move/from16 v5, v31

    .line 1081
    .line 1082
    move-object/from16 v8, v33

    .line 1083
    .line 1084
    move-object/from16 v12, v34

    .line 1085
    .line 1086
    const/4 v3, 0x0

    .line 1087
    goto/16 :goto_e

    .line 1088
    .line 1089
    :cond_25
    move-object/from16 v34, v12

    .line 1090
    .line 1091
    iput-object v0, v13, Lb8;->ε:Ljava/lang/Object;

    .line 1092
    .line 1093
    iget v0, v4, Lq91;->ζ:I

    .line 1094
    .line 1095
    iget v8, v4, Lq91;->δ:I

    .line 1096
    .line 1097
    invoke-direct/range {v34 .. v34}, Ljava/lang/Object;-><init>()V

    .line 1098
    .line 1099
    .line 1100
    move-object/from16 v1, v34

    .line 1101
    .line 1102
    iput-object v13, v1, Lg11;->γ:Ljava/lang/Object;

    .line 1103
    .line 1104
    iput v0, v1, Lg11;->α:I

    .line 1105
    .line 1106
    invoke-static/range {v23 .. v24}, Lyo;->κ(J)I

    .line 1107
    .line 1108
    .line 1109
    move-result v0

    .line 1110
    if-nez v0, :cond_26

    .line 1111
    .line 1112
    invoke-static/range {v23 .. v24}, Lyo;->ι(J)I

    .line 1113
    .line 1114
    .line 1115
    move-result v0

    .line 1116
    if-nez v0, :cond_26

    .line 1117
    .line 1118
    goto :goto_1b

    .line 1119
    :cond_26
    const-string v0, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 1120
    .line 1121
    invoke-static {v0}, Lbm0;->α(Ljava/lang/String;)V

    .line 1122
    .line 1123
    .line 1124
    :goto_1b
    new-instance v0, Ljava/util/ArrayList;

    .line 1125
    .line 1126
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1127
    .line 1128
    .line 1129
    iget-object v2, v13, Lb8;->ε:Ljava/lang/Object;

    .line 1130
    .line 1131
    check-cast v2, Ljava/util/ArrayList;

    .line 1132
    .line 1133
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1134
    .line 1135
    .line 1136
    move-result v3

    .line 1137
    const/4 v11, 0x0

    .line 1138
    move v13, v11

    .line 1139
    const/4 v12, 0x0

    .line 1140
    const/16 v17, 0x0

    .line 1141
    .line 1142
    :goto_1c
    if-ge v12, v3, :cond_2a

    .line 1143
    .line 1144
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v5

    .line 1148
    move-object v14, v5

    .line 1149
    check-cast v14, Ln91;

    .line 1150
    .line 1151
    iget-object v6, v14, Ln91;->α:Lw2;

    .line 1152
    .line 1153
    invoke-static/range {v23 .. v24}, Lyo;->θ(J)I

    .line 1154
    .line 1155
    .line 1156
    move-result v5

    .line 1157
    invoke-static/range {v23 .. v24}, Lyo;->γ(J)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v7

    .line 1161
    if-eqz v7, :cond_27

    .line 1162
    .line 1163
    invoke-static/range {v23 .. v24}, Lyo;->η(J)I

    .line 1164
    .line 1165
    .line 1166
    move-result v7

    .line 1167
    float-to-double v9, v13

    .line 1168
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v9

    .line 1172
    double-to-float v9, v9

    .line 1173
    float-to-int v9, v9

    .line 1174
    sub-int/2addr v7, v9

    .line 1175
    if-gez v7, :cond_28

    .line 1176
    .line 1177
    const/4 v7, 0x0

    .line 1178
    goto :goto_1d

    .line 1179
    :cond_27
    invoke-static/range {v23 .. v24}, Lyo;->η(J)I

    .line 1180
    .line 1181
    .line 1182
    move-result v7

    .line 1183
    :cond_28
    :goto_1d
    const/4 v9, 0x5

    .line 1184
    invoke-static {v5, v7, v9}, Lzo;->β(III)J

    .line 1185
    .line 1186
    .line 1187
    move-result-wide v9

    .line 1188
    iget v5, v1, Lg11;->α:I

    .line 1189
    .line 1190
    sub-int v7, v5, v17

    .line 1191
    .line 1192
    new-instance v5, Ls2;

    .line 1193
    .line 1194
    invoke-direct/range {v5 .. v10}, Ls2;-><init>(Lw2;IIJ)V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v5}, Ls2;->β()F

    .line 1198
    .line 1199
    .line 1200
    move-result v6

    .line 1201
    add-float v20, v6, v13

    .line 1202
    .line 1203
    iget-object v6, v5, Ls2;->δ:Lk32;

    .line 1204
    .line 1205
    iget v7, v6, Lk32;->ζ:I

    .line 1206
    .line 1207
    add-int v18, v17, v7

    .line 1208
    .line 1209
    move/from16 v19, v13

    .line 1210
    .line 1211
    new-instance v13, Lm91;

    .line 1212
    .line 1213
    iget v15, v14, Ln91;->β:I

    .line 1214
    .line 1215
    iget v7, v14, Ln91;->γ:I

    .line 1216
    .line 1217
    move-object v14, v5

    .line 1218
    move/from16 v16, v7

    .line 1219
    .line 1220
    invoke-direct/range {v13 .. v20}, Lm91;-><init>(Ls2;IIIIFF)V

    .line 1221
    .line 1222
    .line 1223
    move/from16 v5, v18

    .line 1224
    .line 1225
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    iget-boolean v6, v6, Lk32;->δ:Z

    .line 1229
    .line 1230
    if-nez v6, :cond_2b

    .line 1231
    .line 1232
    iget v6, v1, Lg11;->α:I

    .line 1233
    .line 1234
    if-ne v5, v6, :cond_29

    .line 1235
    .line 1236
    iget-object v6, v1, Lg11;->γ:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v6, Lb8;

    .line 1239
    .line 1240
    iget-object v6, v6, Lb8;->ε:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v6, Ljava/util/ArrayList;

    .line 1243
    .line 1244
    invoke-static {v6}, Lyh;->Λ(Ljava/util/List;)I

    .line 1245
    .line 1246
    .line 1247
    move-result v6

    .line 1248
    if-eq v12, v6, :cond_29

    .line 1249
    .line 1250
    goto :goto_1e

    .line 1251
    :cond_29
    add-int/lit8 v12, v12, 0x1

    .line 1252
    .line 1253
    move/from16 v17, v5

    .line 1254
    .line 1255
    move/from16 v13, v20

    .line 1256
    .line 1257
    goto :goto_1c

    .line 1258
    :cond_2a
    move/from16 v5, v17

    .line 1259
    .line 1260
    :cond_2b
    :goto_1e
    iput v5, v1, Lg11;->β:I

    .line 1261
    .line 1262
    iput-object v0, v1, Lg11;->ε:Ljava/lang/Object;

    .line 1263
    .line 1264
    new-instance v2, Ljava/util/ArrayList;

    .line 1265
    .line 1266
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1267
    .line 1268
    .line 1269
    move-result v3

    .line 1270
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1274
    .line 1275
    .line 1276
    move-result v3

    .line 1277
    const/4 v5, 0x0

    .line 1278
    :goto_1f
    if-ge v5, v3, :cond_2e

    .line 1279
    .line 1280
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v6

    .line 1284
    check-cast v6, Lm91;

    .line 1285
    .line 1286
    iget-object v7, v6, Lm91;->α:Ls2;

    .line 1287
    .line 1288
    iget-object v7, v7, Ls2;->ζ:Ljava/lang/Object;

    .line 1289
    .line 1290
    new-instance v8, Ljava/util/ArrayList;

    .line 1291
    .line 1292
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1293
    .line 1294
    .line 1295
    move-result v9

    .line 1296
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1297
    .line 1298
    .line 1299
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 1300
    .line 1301
    .line 1302
    move-result v9

    .line 1303
    const/4 v10, 0x0

    .line 1304
    :goto_20
    if-ge v10, v9, :cond_2d

    .line 1305
    .line 1306
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v12

    .line 1310
    check-cast v12, Lml1;

    .line 1311
    .line 1312
    if-eqz v12, :cond_2c

    .line 1313
    .line 1314
    iget v13, v6, Lm91;->ζ:F

    .line 1315
    .line 1316
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1317
    .line 1318
    .line 1319
    move-result v14

    .line 1320
    int-to-long v14, v14

    .line 1321
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1322
    .line 1323
    .line 1324
    move-result v13

    .line 1325
    move-object/from16 v17, v12

    .line 1326
    .line 1327
    int-to-long v11, v13

    .line 1328
    const/16 v13, 0x20

    .line 1329
    .line 1330
    shl-long v13, v14, v13

    .line 1331
    .line 1332
    const-wide v18, 0xffffffffL

    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    and-long v11, v11, v18

    .line 1338
    .line 1339
    or-long/2addr v11, v13

    .line 1340
    move-object/from16 v13, v17

    .line 1341
    .line 1342
    invoke-virtual {v13, v11, v12}, Lml1;->ε(J)Lml1;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v11

    .line 1346
    goto :goto_21

    .line 1347
    :cond_2c
    const/4 v11, 0x0

    .line 1348
    :goto_21
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1349
    .line 1350
    .line 1351
    add-int/lit8 v10, v10, 0x1

    .line 1352
    .line 1353
    const/4 v11, 0x0

    .line 1354
    goto :goto_20

    .line 1355
    :cond_2d
    invoke-static {v2, v8}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1356
    .line 1357
    .line 1358
    add-int/lit8 v5, v5, 0x1

    .line 1359
    .line 1360
    const/4 v11, 0x0

    .line 1361
    goto :goto_1f

    .line 1362
    :cond_2e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1363
    .line 1364
    .line 1365
    move-result v0

    .line 1366
    iget-object v3, v1, Lg11;->γ:Ljava/lang/Object;

    .line 1367
    .line 1368
    check-cast v3, Lb8;

    .line 1369
    .line 1370
    iget-object v3, v3, Lb8;->γ:Ljava/lang/Object;

    .line 1371
    .line 1372
    check-cast v3, Ljava/util/List;

    .line 1373
    .line 1374
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    if-ge v0, v3, :cond_30

    .line 1379
    .line 1380
    iget-object v0, v1, Lg11;->γ:Ljava/lang/Object;

    .line 1381
    .line 1382
    check-cast v0, Lb8;

    .line 1383
    .line 1384
    iget-object v0, v0, Lb8;->γ:Ljava/lang/Object;

    .line 1385
    .line 1386
    check-cast v0, Ljava/util/List;

    .line 1387
    .line 1388
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1389
    .line 1390
    .line 1391
    move-result v0

    .line 1392
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1393
    .line 1394
    .line 1395
    move-result v3

    .line 1396
    sub-int/2addr v0, v3

    .line 1397
    new-instance v3, Ljava/util/ArrayList;

    .line 1398
    .line 1399
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1400
    .line 1401
    .line 1402
    const/4 v5, 0x0

    .line 1403
    :goto_22
    const/4 v6, 0x0

    .line 1404
    if-ge v5, v0, :cond_2f

    .line 1405
    .line 1406
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1407
    .line 1408
    .line 1409
    add-int/lit8 v5, v5, 0x1

    .line 1410
    .line 1411
    goto :goto_22

    .line 1412
    :cond_2f
    invoke-static {v2, v3}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v2

    .line 1416
    goto :goto_23

    .line 1417
    :cond_30
    const/4 v6, 0x0

    .line 1418
    :goto_23
    iput-object v2, v1, Lg11;->δ:Ljava/lang/Object;

    .line 1419
    .line 1420
    iget-wide v2, v4, Lq91;->μ:J

    .line 1421
    .line 1422
    move-object/from16 v0, v27

    .line 1423
    .line 1424
    move-object/from16 v7, v28

    .line 1425
    .line 1426
    invoke-direct {v0, v7, v1, v2, v3}, Lm32;-><init>(Ll32;Lg11;J)V

    .line 1427
    .line 1428
    .line 1429
    move-object v5, v0

    .line 1430
    :goto_24
    if-eqz v5, :cond_31

    .line 1431
    .line 1432
    move-object/from16 v0, v26

    .line 1433
    .line 1434
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1435
    .line 1436
    .line 1437
    move-object v0, v5

    .line 1438
    goto :goto_25

    .line 1439
    :cond_31
    move-object v0, v6

    .line 1440
    :goto_25
    if-eqz v0, :cond_32

    .line 1441
    .line 1442
    move/from16 v2, p0

    .line 1443
    .line 1444
    goto :goto_26

    .line 1445
    :cond_32
    const/4 v2, 0x0

    .line 1446
    :goto_26
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    return-object v0

    .line 1451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
