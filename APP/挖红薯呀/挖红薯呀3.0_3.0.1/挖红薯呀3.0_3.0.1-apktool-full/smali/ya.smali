.class public final synthetic Lya;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lya;->d:I

    iput-object p2, p0, Lya;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lpe0;I)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput p2, p0, Lya;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lya;->e:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lya;->d:I

    .line 8
    .line 9
    const/4 v8, 0x7

    .line 10
    const/16 v9, 0x8

    .line 11
    .line 12
    const/4 v12, 0x4

    .line 13
    const/4 v13, 0x2

    .line 14
    const/4 v14, 0x0

    .line 15
    const/4 v15, 0x0

    .line 16
    const-wide/16 v16, 0x80

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    packed-switch v3, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lha;

    .line 25
    .line 26
    check-cast v1, Ld30;

    .line 27
    .line 28
    move-object v6, v2

    .line 29
    check-cast v6, Lk50;

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    iget-wide v4, v1, Ld30;->a:J

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    invoke-virtual/range {v1 .. v6}, Lha;->a(JJLk50;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    new-instance v2, Lw20;

    .line 41
    .line 42
    invoke-direct {v2, v0, v1}, Lw20;-><init>(J)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    :pswitch_0
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lsw;

    .line 49
    .line 50
    check-cast v2, Lna1;

    .line 51
    .line 52
    invoke-interface {v0, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object v0, Lna1;->a:Lna1;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/util/List;

    .line 61
    .line 62
    check-cast v1, Ljava/lang/CharSequence;

    .line 63
    .line 64
    check-cast v2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ne v3, v4, :cond_4

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    if-ne v3, v4, :cond_2

    .line 86
    .line 87
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v1, v0, v2, v14, v12}, Lk41;->Z(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-gez v1, :cond_1

    .line 98
    .line 99
    :cond_0
    :goto_0
    move-object v2, v15

    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Luo0;

    .line 107
    .line 108
    invoke-direct {v2, v1, v0}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_5

    .line 112
    .line 113
    :cond_2
    const-string v0, "List has more than one element."

    .line 114
    .line 115
    invoke-static {v0}, Lxc;->l(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 121
    .line 122
    const-string v1, "List is empty."

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :cond_4
    new-instance v3, Lz20;

    .line 129
    .line 130
    if-gez v2, :cond_5

    .line 131
    .line 132
    move v2, v14

    .line 133
    :cond_5
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-direct {v3, v2, v5, v4}, Lx20;-><init>(III)V

    .line 138
    .line 139
    .line 140
    iget v3, v3, Lx20;->e:I

    .line 141
    .line 142
    instance-of v4, v1, Ljava/lang/String;

    .line 143
    .line 144
    if-eqz v4, :cond_a

    .line 145
    .line 146
    if-le v2, v3, :cond_6

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_6
    :goto_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_8

    .line 158
    .line 159
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    move-object v6, v5

    .line 164
    check-cast v6, Ljava/lang/String;

    .line 165
    .line 166
    move-object v7, v1

    .line 167
    check-cast v7, Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    invoke-virtual {v6, v14, v7, v2, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_7

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_8
    move-object v5, v15

    .line 181
    :goto_2
    check-cast v5, Ljava/lang/String;

    .line 182
    .line 183
    if-eqz v5, :cond_9

    .line 184
    .line 185
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    new-instance v2, Luo0;

    .line 190
    .line 191
    invoke-direct {v2, v0, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_9
    if-eq v2, v3, :cond_0

    .line 196
    .line 197
    add-int/lit8 v2, v2, 0x1

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_a
    if-le v2, v3, :cond_b

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_d

    .line 212
    .line 213
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    move-object v6, v5

    .line 218
    check-cast v6, Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    invoke-static {v6, v1, v2, v7, v14}, Lk41;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_c

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_d
    move-object v5, v15

    .line 232
    :goto_4
    check-cast v5, Ljava/lang/String;

    .line 233
    .line 234
    if-eqz v5, :cond_e

    .line 235
    .line 236
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-instance v2, Luo0;

    .line 241
    .line 242
    invoke-direct {v2, v0, v5}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_e
    if-eq v2, v3, :cond_0

    .line 247
    .line 248
    add-int/lit8 v2, v2, 0x1

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :goto_5
    if-eqz v2, :cond_f

    .line 252
    .line 253
    iget-object v0, v2, Luo0;->d:Ljava/lang/Object;

    .line 254
    .line 255
    iget-object v1, v2, Luo0;->e:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    new-instance v15, Luo0;

    .line 268
    .line 269
    invoke-direct {v15, v0, v1}, Luo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    :cond_f
    :goto_6
    return-object v15

    .line 273
    :pswitch_2
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v0, Le31;

    .line 276
    .line 277
    check-cast v1, Ljava/util/Set;

    .line 278
    .line 279
    check-cast v2, Ll21;

    .line 280
    .line 281
    iget-object v2, v0, Le31;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 282
    .line 283
    :goto_7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-nez v3, :cond_10

    .line 288
    .line 289
    move-object v5, v1

    .line 290
    check-cast v5, Ljava/util/Collection;

    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_10
    instance-of v5, v3, Ljava/util/Set;

    .line 294
    .line 295
    if-eqz v5, :cond_11

    .line 296
    .line 297
    new-array v5, v13, [Ljava/util/Set;

    .line 298
    .line 299
    aput-object v3, v5, v14

    .line 300
    .line 301
    aput-object v1, v5, v4

    .line 302
    .line 303
    invoke-static {v5}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    goto :goto_8

    .line 308
    :cond_11
    instance-of v5, v3, Ljava/util/List;

    .line 309
    .line 310
    if-eqz v5, :cond_15

    .line 311
    .line 312
    move-object v5, v3

    .line 313
    check-cast v5, Ljava/util/Collection;

    .line 314
    .line 315
    invoke-static {v1}, Lo30;->v(Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    invoke-static {v5, v6}, Lye;->S(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    :cond_12
    :goto_8
    invoke-virtual {v2, v3, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    if-eqz v6, :cond_14

    .line 328
    .line 329
    invoke-virtual {v0}, Le31;->a()Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_13

    .line 334
    .line 335
    iget-object v1, v0, Le31;->a:Lsw;

    .line 336
    .line 337
    new-instance v2, Lk6;

    .line 338
    .line 339
    const/16 v3, 0xd

    .line 340
    .line 341
    invoke-direct {v2, v3, v0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v1, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    :cond_13
    sget-object v0, Lna1;->a:Lna1;

    .line 348
    .line 349
    return-object v0

    .line 350
    :cond_14
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    if-eq v6, v3, :cond_12

    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_15
    const-string v0, "Unexpected notification"

    .line 358
    .line 359
    invoke-static {v0}, Lqi;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 360
    .line 361
    .line 362
    new-instance v0, Lsg;

    .line 363
    .line 364
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :pswitch_3
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, Lvb;

    .line 371
    .line 372
    check-cast v1, Ljava/util/Set;

    .line 373
    .line 374
    check-cast v2, Ll21;

    .line 375
    .line 376
    instance-of v2, v1, Lfy0;

    .line 377
    .line 378
    if-eqz v2, :cond_19

    .line 379
    .line 380
    move-object v2, v1

    .line 381
    check-cast v2, Lfy0;

    .line 382
    .line 383
    iget-object v2, v2, Lfy0;->d:Lkh0;

    .line 384
    .line 385
    iget-object v3, v2, Lkh0;->b:[Ljava/lang/Object;

    .line 386
    .line 387
    iget-object v2, v2, Lkh0;->a:[J

    .line 388
    .line 389
    array-length v4, v2

    .line 390
    sub-int/2addr v4, v13

    .line 391
    if-ltz v4, :cond_1d

    .line 392
    .line 393
    move v5, v14

    .line 394
    const-wide/16 v18, 0xff

    .line 395
    .line 396
    :goto_9
    aget-wide v6, v2, v5

    .line 397
    .line 398
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    not-long v10, v6

    .line 404
    shl-long/2addr v10, v8

    .line 405
    and-long/2addr v10, v6

    .line 406
    and-long v10, v10, v20

    .line 407
    .line 408
    cmp-long v10, v10, v20

    .line 409
    .line 410
    if-eqz v10, :cond_18

    .line 411
    .line 412
    sub-int v10, v5, v4

    .line 413
    .line 414
    not-int v10, v10

    .line 415
    ushr-int/lit8 v10, v10, 0x1f

    .line 416
    .line 417
    rsub-int/lit8 v10, v10, 0x8

    .line 418
    .line 419
    move v11, v14

    .line 420
    :goto_a
    if-ge v11, v10, :cond_17

    .line 421
    .line 422
    and-long v22, v6, v18

    .line 423
    .line 424
    cmp-long v13, v22, v16

    .line 425
    .line 426
    if-gez v13, :cond_16

    .line 427
    .line 428
    shl-int/lit8 v13, v5, 0x3

    .line 429
    .line 430
    add-int/2addr v13, v11

    .line 431
    aget-object v13, v3, v13

    .line 432
    .line 433
    instance-of v15, v13, Le41;

    .line 434
    .line 435
    if-eqz v15, :cond_1c

    .line 436
    .line 437
    check-cast v13, Le41;

    .line 438
    .line 439
    invoke-virtual {v13, v12}, Le41;->e(I)Z

    .line 440
    .line 441
    .line 442
    move-result v13

    .line 443
    if-eqz v13, :cond_16

    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_16
    shr-long/2addr v6, v9

    .line 447
    add-int/lit8 v11, v11, 0x1

    .line 448
    .line 449
    goto :goto_a

    .line 450
    :cond_17
    if-ne v10, v9, :cond_1d

    .line 451
    .line 452
    :cond_18
    if-eq v5, v4, :cond_1d

    .line 453
    .line 454
    add-int/lit8 v5, v5, 0x1

    .line 455
    .line 456
    goto :goto_9

    .line 457
    :cond_19
    move-object v2, v1

    .line 458
    check-cast v2, Ljava/lang/Iterable;

    .line 459
    .line 460
    instance-of v3, v2, Ljava/util/Collection;

    .line 461
    .line 462
    if-eqz v3, :cond_1a

    .line 463
    .line 464
    move-object v3, v2

    .line 465
    check-cast v3, Ljava/util/Collection;

    .line 466
    .line 467
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    if-eqz v3, :cond_1a

    .line 472
    .line 473
    goto :goto_c

    .line 474
    :cond_1a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    :cond_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-eqz v3, :cond_1d

    .line 483
    .line 484
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    instance-of v4, v3, Le41;

    .line 489
    .line 490
    if-eqz v4, :cond_1c

    .line 491
    .line 492
    check-cast v3, Le41;

    .line 493
    .line 494
    invoke-virtual {v3, v12}, Le41;->e(I)Z

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    if-eqz v3, :cond_1b

    .line 499
    .line 500
    :cond_1c
    :goto_b
    invoke-interface {v0, v1}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    :cond_1d
    :goto_c
    sget-object v0, Lna1;->a:Lna1;

    .line 504
    .line 505
    return-object v0

    .line 506
    :pswitch_4
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, Ldz0;

    .line 509
    .line 510
    check-cast v1, Ljava/lang/Float;

    .line 511
    .line 512
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    check-cast v2, Ljava/lang/Float;

    .line 517
    .line 518
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    invoke-virtual {v0}, Loe0;->k0()Lyk;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    new-instance v4, Lcz0;

    .line 527
    .line 528
    invoke-direct {v4, v0, v1, v2, v15}, Lcz0;-><init>(Ldz0;FFLik;)V

    .line 529
    .line 530
    .line 531
    const/4 v0, 0x3

    .line 532
    invoke-static {v3, v15, v4, v0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 533
    .line 534
    .line 535
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_5
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v0, Lmw0;

    .line 541
    .line 542
    check-cast v1, Ljava/lang/Integer;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    move-object v1, v2

    .line 549
    check-cast v1, Lnk;

    .line 550
    .line 551
    invoke-interface {v1}, Lnk;->getKey()Lok;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    iget-object v0, v0, Lmw0;->h:Lpk;

    .line 556
    .line 557
    invoke-interface {v0, v2}, Lpk;->l(Lok;)Lnk;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    sget-object v4, Ln2;->I:Ln2;

    .line 562
    .line 563
    if-eq v2, v4, :cond_1f

    .line 564
    .line 565
    if-eq v1, v0, :cond_1e

    .line 566
    .line 567
    const/high16 v3, -0x80000000

    .line 568
    .line 569
    goto :goto_10

    .line 570
    :cond_1e
    add-int/lit8 v3, v3, 0x1

    .line 571
    .line 572
    goto :goto_10

    .line 573
    :cond_1f
    move-object v5, v0

    .line 574
    check-cast v5, Lc40;

    .line 575
    .line 576
    check-cast v1, Lc40;

    .line 577
    .line 578
    :goto_d
    if-nez v1, :cond_20

    .line 579
    .line 580
    goto :goto_f

    .line 581
    :cond_20
    if-ne v1, v5, :cond_21

    .line 582
    .line 583
    goto :goto_e

    .line 584
    :cond_21
    instance-of v0, v1, Lgy0;

    .line 585
    .line 586
    if-nez v0, :cond_23

    .line 587
    .line 588
    :goto_e
    move-object v15, v1

    .line 589
    :goto_f
    if-ne v15, v5, :cond_22

    .line 590
    .line 591
    if-nez v5, :cond_1e

    .line 592
    .line 593
    :goto_10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    return-object v0

    .line 598
    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 599
    .line 600
    new-instance v1, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    const-string v2, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 603
    .line 604
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    const-string v2, ", expected child of "

    .line 611
    .line 612
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    const-string v2, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 619
    .line 620
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    throw v0

    .line 635
    :cond_23
    check-cast v1, Lgy0;

    .line 636
    .line 637
    invoke-virtual {v1}, Lj40;->M()Lde;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    if-eqz v0, :cond_24

    .line 642
    .line 643
    invoke-interface {v0}, Lde;->getParent()Lc40;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    move-object v1, v0

    .line 648
    goto :goto_d

    .line 649
    :cond_24
    move-object v1, v15

    .line 650
    goto :goto_d

    .line 651
    :pswitch_6
    const-wide/16 v18, 0xff

    .line 652
    .line 653
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v0, Lot0;

    .line 661
    .line 662
    check-cast v1, Ljava/util/Set;

    .line 663
    .line 664
    check-cast v2, Ll21;

    .line 665
    .line 666
    iget-object v2, v0, Lot0;->c:Ljava/lang/Object;

    .line 667
    .line 668
    monitor-enter v2

    .line 669
    :try_start_0
    iget-object v3, v0, Lot0;->u:Lz31;

    .line 670
    .line 671
    invoke-virtual {v3}, Lz31;->getValue()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v3

    .line 675
    check-cast v3, Ljt0;

    .line 676
    .line 677
    sget-object v5, Ljt0;->h:Ljt0;

    .line 678
    .line 679
    invoke-virtual {v3, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    if-ltz v3, :cond_2c

    .line 684
    .line 685
    iget-object v3, v0, Lot0;->h:Lkh0;

    .line 686
    .line 687
    instance-of v5, v1, Lfy0;

    .line 688
    .line 689
    if-eqz v5, :cond_29

    .line 690
    .line 691
    check-cast v1, Lfy0;

    .line 692
    .line 693
    iget-object v1, v1, Lfy0;->d:Lkh0;

    .line 694
    .line 695
    iget-object v5, v1, Lkh0;->b:[Ljava/lang/Object;

    .line 696
    .line 697
    iget-object v1, v1, Lkh0;->a:[J

    .line 698
    .line 699
    array-length v6, v1

    .line 700
    sub-int/2addr v6, v13

    .line 701
    if-ltz v6, :cond_2b

    .line 702
    .line 703
    move v7, v14

    .line 704
    :goto_11
    aget-wide v10, v1, v7

    .line 705
    .line 706
    not-long v12, v10

    .line 707
    shl-long/2addr v12, v8

    .line 708
    and-long/2addr v12, v10

    .line 709
    and-long v12, v12, v20

    .line 710
    .line 711
    cmp-long v12, v12, v20

    .line 712
    .line 713
    if-eqz v12, :cond_28

    .line 714
    .line 715
    sub-int v12, v7, v6

    .line 716
    .line 717
    not-int v12, v12

    .line 718
    ushr-int/lit8 v12, v12, 0x1f

    .line 719
    .line 720
    rsub-int/lit8 v12, v12, 0x8

    .line 721
    .line 722
    move v13, v14

    .line 723
    :goto_12
    if-ge v13, v12, :cond_27

    .line 724
    .line 725
    and-long v22, v10, v18

    .line 726
    .line 727
    cmp-long v15, v22, v16

    .line 728
    .line 729
    if-gez v15, :cond_26

    .line 730
    .line 731
    shl-int/lit8 v15, v7, 0x3

    .line 732
    .line 733
    add-int/2addr v15, v13

    .line 734
    aget-object v15, v5, v15

    .line 735
    .line 736
    instance-of v8, v15, Le41;

    .line 737
    .line 738
    if-eqz v8, :cond_25

    .line 739
    .line 740
    move-object v8, v15

    .line 741
    check-cast v8, Le41;

    .line 742
    .line 743
    invoke-virtual {v8, v4}, Le41;->e(I)Z

    .line 744
    .line 745
    .line 746
    move-result v8

    .line 747
    if-nez v8, :cond_25

    .line 748
    .line 749
    goto :goto_13

    .line 750
    :catchall_0
    move-exception v0

    .line 751
    goto :goto_15

    .line 752
    :cond_25
    invoke-virtual {v3, v15}, Lkh0;->a(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    :cond_26
    :goto_13
    shr-long/2addr v10, v9

    .line 756
    add-int/lit8 v13, v13, 0x1

    .line 757
    .line 758
    const/4 v8, 0x7

    .line 759
    goto :goto_12

    .line 760
    :cond_27
    if-ne v12, v9, :cond_2b

    .line 761
    .line 762
    :cond_28
    if-eq v7, v6, :cond_2b

    .line 763
    .line 764
    add-int/lit8 v7, v7, 0x1

    .line 765
    .line 766
    const/4 v8, 0x7

    .line 767
    goto :goto_11

    .line 768
    :cond_29
    check-cast v1, Ljava/lang/Iterable;

    .line 769
    .line 770
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 775
    .line 776
    .line 777
    move-result v5

    .line 778
    if-eqz v5, :cond_2b

    .line 779
    .line 780
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    instance-of v6, v5, Le41;

    .line 785
    .line 786
    if-eqz v6, :cond_2a

    .line 787
    .line 788
    move-object v6, v5

    .line 789
    check-cast v6, Le41;

    .line 790
    .line 791
    invoke-virtual {v6, v4}, Le41;->e(I)Z

    .line 792
    .line 793
    .line 794
    move-result v6

    .line 795
    if-nez v6, :cond_2a

    .line 796
    .line 797
    goto :goto_14

    .line 798
    :cond_2a
    invoke-virtual {v3, v5}, Lkh0;->a(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    goto :goto_14

    .line 802
    :cond_2b
    invoke-virtual {v0}, Lot0;->y()Luc;

    .line 803
    .line 804
    .line 805
    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 806
    :cond_2c
    monitor-exit v2

    .line 807
    if-eqz v15, :cond_2d

    .line 808
    .line 809
    sget-object v0, Lna1;->a:Lna1;

    .line 810
    .line 811
    check-cast v15, Lwc;

    .line 812
    .line 813
    invoke-virtual {v15, v0}, Lwc;->i(Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    :cond_2d
    sget-object v0, Lna1;->a:Lna1;

    .line 817
    .line 818
    return-object v0

    .line 819
    :goto_15
    monitor-exit v2

    .line 820
    throw v0

    .line 821
    :pswitch_7
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v0, Lwg0;

    .line 824
    .line 825
    check-cast v1, Lji;

    .line 826
    .line 827
    check-cast v2, Ljava/lang/Integer;

    .line 828
    .line 829
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    invoke-static {v0, v1, v2}, Lzc0;->d(Lwg0;Lji;I)Lna1;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    return-object v0

    .line 838
    :pswitch_8
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v0, Landroid/graphics/Bitmap;

    .line 841
    .line 842
    check-cast v1, Lji;

    .line 843
    .line 844
    check-cast v2, Ljava/lang/Integer;

    .line 845
    .line 846
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 847
    .line 848
    .line 849
    move-result v2

    .line 850
    invoke-static {v0, v1, v2}, Lzc0;->o(Landroid/graphics/Bitmap;Lji;I)Lna1;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    return-object v0

    .line 855
    :pswitch_9
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v0, Lww;

    .line 858
    .line 859
    check-cast v1, Lvw0;

    .line 860
    .line 861
    invoke-interface {v0, v1, v2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    check-cast v0, Ljava/util/List;

    .line 866
    .line 867
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 868
    .line 869
    .line 870
    move-result v2

    .line 871
    :goto_16
    if-ge v14, v2, :cond_30

    .line 872
    .line 873
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    if-eqz v3, :cond_2f

    .line 878
    .line 879
    iget-object v4, v1, Lvw0;->e:Lzw0;

    .line 880
    .line 881
    if-eqz v4, :cond_2f

    .line 882
    .line 883
    invoke-interface {v4, v3}, Lzw0;->b(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v4

    .line 887
    if-eqz v4, :cond_2e

    .line 888
    .line 889
    goto :goto_17

    .line 890
    :cond_2e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    const-string v1, "item at index "

    .line 893
    .line 894
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 898
    .line 899
    .line 900
    const-string v1, " can\'t be saved: "

    .line 901
    .line 902
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 903
    .line 904
    .line 905
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 913
    .line 914
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    throw v1

    .line 922
    :cond_2f
    :goto_17
    add-int/lit8 v14, v14, 0x1

    .line 923
    .line 924
    goto :goto_16

    .line 925
    :cond_30
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 926
    .line 927
    .line 928
    move-result v1

    .line 929
    if-nez v1, :cond_31

    .line 930
    .line 931
    new-instance v15, Ljava/util/ArrayList;

    .line 932
    .line 933
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 934
    .line 935
    .line 936
    :cond_31
    return-object v15

    .line 937
    :pswitch_a
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v0, Liu0;

    .line 940
    .line 941
    check-cast v1, Ljava/lang/Integer;

    .line 942
    .line 943
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    instance-of v1, v2, Lvh;

    .line 947
    .line 948
    if-eqz v1, :cond_33

    .line 949
    .line 950
    move-object v1, v2

    .line 951
    check-cast v1, Lvh;

    .line 952
    .line 953
    iget-object v3, v0, Liu0;->h:Lkh0;

    .line 954
    .line 955
    if-nez v3, :cond_32

    .line 956
    .line 957
    sget-object v3, Ley0;->a:Lkh0;

    .line 958
    .line 959
    new-instance v3, Lkh0;

    .line 960
    .line 961
    invoke-direct {v3}, Lkh0;-><init>()V

    .line 962
    .line 963
    .line 964
    iput-object v3, v0, Liu0;->h:Lkh0;

    .line 965
    .line 966
    :cond_32
    invoke-virtual {v3, v1}, Lkh0;->k(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    iget-object v3, v0, Liu0;->f:Lsh0;

    .line 970
    .line 971
    invoke-virtual {v3, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    :cond_33
    instance-of v1, v2, Lku0;

    .line 975
    .line 976
    if-eqz v1, :cond_34

    .line 977
    .line 978
    move-object v1, v2

    .line 979
    check-cast v1, Lku0;

    .line 980
    .line 981
    invoke-virtual {v0, v1}, Liu0;->e(Lku0;)V

    .line 982
    .line 983
    .line 984
    :cond_34
    instance-of v0, v2, Lht0;

    .line 985
    .line 986
    if-eqz v0, :cond_35

    .line 987
    .line 988
    move-object v0, v2

    .line 989
    check-cast v0, Lht0;

    .line 990
    .line 991
    invoke-virtual {v0}, Lht0;->c()V

    .line 992
    .line 993
    .line 994
    :cond_35
    sget-object v0, Lna1;->a:Lna1;

    .line 995
    .line 996
    return-object v0

    .line 997
    :pswitch_b
    iget-object v0, v0, Lya;->e:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v0, Lpe0;

    .line 1000
    .line 1001
    check-cast v1, Lji;

    .line 1002
    .line 1003
    check-cast v2, Ljava/lang/Integer;

    .line 1004
    .line 1005
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    invoke-static {v4}, Lj50;->A(I)I

    .line 1009
    .line 1010
    .line 1011
    move-result v2

    .line 1012
    invoke-static {v0, v1, v2}, Lza;->a(Lpe0;Lji;I)V

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Lna1;->a:Lna1;

    .line 1016
    .line 1017
    return-object v0

    .line 1018
    nop

    .line 1019
    :pswitch_data_0
    .packed-switch 0x0
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
