.class public final synthetic Ls8;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls8;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Ls8;->d:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, Lvw0;

    .line 13
    .line 14
    move-object/from16 v0, p2

    .line 15
    .line 16
    check-cast v0, Lr61;

    .line 17
    .line 18
    iget v0, v0, Lr61;->a:I

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_0
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, Lvw0;

    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, Lv01;

    .line 32
    .line 33
    iget-wide v2, v1, Lv01;->a:J

    .line 34
    .line 35
    new-instance v4, Lff;

    .line 36
    .line 37
    invoke-direct {v4, v2, v3}, Lff;-><init>(J)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Lux0;->p:Ltx0;

    .line 41
    .line 42
    invoke-static {v4, v2, v0}, Lux0;->a(Ljava/lang/Object;Lqx0;Lvw0;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-wide v3, v1, Lv01;->b:J

    .line 47
    .line 48
    new-instance v5, Lok0;

    .line 49
    .line 50
    invoke-direct {v5, v3, v4}, Lok0;-><init>(J)V

    .line 51
    .line 52
    .line 53
    sget-object v3, Lux0;->x:Ltx0;

    .line 54
    .line 55
    invoke-static {v5, v3, v0}, Lux0;->a(Ljava/lang/Object;Lqx0;Lvw0;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v1, v1, Lv01;->c:F

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, Lo30;->i([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :pswitch_1
    move-object/from16 v0, p1

    .line 75
    .line 76
    check-cast v0, Lvw0;

    .line 77
    .line 78
    move-object/from16 v0, p2

    .line 79
    .line 80
    check-cast v0, Ll71;

    .line 81
    .line 82
    iget-wide v1, v0, Ll71;->a:J

    .line 83
    .line 84
    const/16 v3, 0x20

    .line 85
    .line 86
    shr-long/2addr v1, v3

    .line 87
    long-to-int v1, v1

    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-wide v2, v0, Ll71;->a:J

    .line 93
    .line 94
    const-wide v4, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long/2addr v2, v4

    .line 100
    long-to-int v0, v2

    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    filled-new-array {v1, v0}, [Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Lo30;->i([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :pswitch_2
    move-object/from16 v0, p1

    .line 115
    .line 116
    check-cast v0, Lvw0;

    .line 117
    .line 118
    move-object/from16 v1, p2

    .line 119
    .line 120
    check-cast v1, Ljava/util/List;

    .line 121
    .line 122
    new-instance v3, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    :goto_0
    if-ge v2, v4, :cond_0

    .line 136
    .line 137
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Le8;

    .line 142
    .line 143
    sget-object v6, Lux0;->b:Ld;

    .line 144
    .line 145
    invoke-static {v5, v6, v0}, Lux0;->a(Ljava/lang/Object;Lqx0;Lvw0;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_0
    return-object v3

    .line 156
    :pswitch_3
    move-object/from16 v0, p1

    .line 157
    .line 158
    check-cast v0, Lvw0;

    .line 159
    .line 160
    move-object/from16 v0, p2

    .line 161
    .line 162
    check-cast v0, Lz9;

    .line 163
    .line 164
    iget v0, v0, Lz9;->a:F

    .line 165
    .line 166
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0

    .line 171
    :pswitch_4
    move-object/from16 v0, p1

    .line 172
    .line 173
    check-cast v0, Lvw0;

    .line 174
    .line 175
    move-object/from16 v1, p2

    .line 176
    .line 177
    check-cast v1, Lsa0;

    .line 178
    .line 179
    iget-object v2, v1, Lsa0;->a:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v1, v1, Lsa0;->b:Li71;

    .line 182
    .line 183
    sget-object v3, Lux0;->i:Ld;

    .line 184
    .line 185
    invoke-static {v1, v3, v0}, Lux0;->a(Ljava/lang/Object;Lqx0;Lvw0;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Lo30;->i([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :pswitch_5
    move-object/from16 v0, p1

    .line 199
    .line 200
    check-cast v0, Lvw0;

    .line 201
    .line 202
    move-object/from16 v0, p2

    .line 203
    .line 204
    check-cast v0, Lzv;

    .line 205
    .line 206
    iget v0, v0, Lzv;->d:I

    .line 207
    .line 208
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_6
    move-object/from16 v0, p1

    .line 214
    .line 215
    check-cast v0, Lvw0;

    .line 216
    .line 217
    move-object/from16 v1, p2

    .line 218
    .line 219
    check-cast v1, Lz61;

    .line 220
    .line 221
    iget-wide v2, v1, Lz61;->a:J

    .line 222
    .line 223
    new-instance v4, Lu71;

    .line 224
    .line 225
    invoke-direct {v4, v2, v3}, Lu71;-><init>(J)V

    .line 226
    .line 227
    .line 228
    sget-object v2, Lux0;->v:Ltx0;

    .line 229
    .line 230
    invoke-static {v4, v2, v0}, Lux0;->a(Ljava/lang/Object;Lqx0;Lvw0;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    iget-wide v4, v1, Lz61;->b:J

    .line 235
    .line 236
    new-instance v1, Lu71;

    .line 237
    .line 238
    invoke-direct {v1, v4, v5}, Lu71;-><init>(J)V

    .line 239
    .line 240
    .line 241
    invoke-static {v1, v2, v0}, Lux0;->a(Ljava/lang/Object;Lqx0;Lvw0;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v0}, Lo30;->i([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    return-object v0

    .line 254
    :pswitch_7
    move-object/from16 v0, p1

    .line 255
    .line 256
    check-cast v0, Lvw0;

    .line 257
    .line 258
    move-object/from16 v0, p2

    .line 259
    .line 260
    check-cast v0, Ly61;

    .line 261
    .line 262
    iget v1, v0, Ly61;->a:F

    .line 263
    .line 264
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget v0, v0, Ly61;->b:F

    .line 269
    .line 270
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    filled-new-array {v1, v0}, [Ljava/lang/Float;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v0}, Lo30;->i([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    return-object v0

    .line 283
    :pswitch_8
    move-object/from16 v0, p1

    .line 284
    .line 285
    check-cast v0, Lvw0;

    .line 286
    .line 287
    move-object/from16 v0, p2

    .line 288
    .line 289
    check-cast v0, Lu61;

    .line 290
    .line 291
    iget v0, v0, Lu61;->a:I

    .line 292
    .line 293
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    return-object v0

    .line 298
    :pswitch_9
    move-object/from16 v0, p1

    .line 299
    .line 300
    check-cast v0, Lvw0;

    .line 301
    .line 302
    move-object/from16 v1, p2

    .line 303
    .line 304
    check-cast v1, Lf8;

    .line 305
    .line 306
    iget-object v2, v1, Lf8;->e:Ljava/lang/String;

    .line 307
    .line 308
    iget-object v1, v1, Lf8;->d:Ljava/util/List;

    .line 309
    .line 310
    sget-object v3, Lux0;->a:Ld;

    .line 311
    .line 312
    invoke-static {v1, v3, v0}, Lux0;->a(Ljava/lang/Object;Lqx0;Lvw0;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-static {v0}, Lo30;->i([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    return-object v0

    .line 325
    :pswitch_a
    move-object/from16 v0, p1

    .line 326
    .line 327
    check-cast v0, Lvw0;

    .line 328
    .line 329
    return-object p2

    .line 330
    :pswitch_b
    move-object/from16 v0, p1

    .line 331
    .line 332
    check-cast v0, Lvw0;

    .line 333
    .line 334
    move-object/from16 v0, p2

    .line 335
    .line 336
    check-cast v0, Lyw0;

    .line 337
    .line 338
    iget-object v3, v0, Lyw0;->d:Ljava/util/Map;

    .line 339
    .line 340
    iget-object v0, v0, Lyw0;->e:Ljh0;

    .line 341
    .line 342
    iget-object v4, v0, Ljh0;->b:[Ljava/lang/Object;

    .line 343
    .line 344
    iget-object v5, v0, Ljh0;->c:[Ljava/lang/Object;

    .line 345
    .line 346
    iget-object v0, v0, Ljh0;->a:[J

    .line 347
    .line 348
    array-length v6, v0

    .line 349
    add-int/lit8 v6, v6, -0x2

    .line 350
    .line 351
    if-ltz v6, :cond_5

    .line 352
    .line 353
    move v7, v2

    .line 354
    :goto_1
    aget-wide v8, v0, v7

    .line 355
    .line 356
    not-long v10, v8

    .line 357
    const/4 v12, 0x7

    .line 358
    shl-long/2addr v10, v12

    .line 359
    and-long/2addr v10, v8

    .line 360
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    and-long/2addr v10, v12

    .line 366
    cmp-long v10, v10, v12

    .line 367
    .line 368
    if-eqz v10, :cond_4

    .line 369
    .line 370
    sub-int v10, v7, v6

    .line 371
    .line 372
    not-int v10, v10

    .line 373
    ushr-int/lit8 v10, v10, 0x1f

    .line 374
    .line 375
    const/16 v11, 0x8

    .line 376
    .line 377
    rsub-int/lit8 v10, v10, 0x8

    .line 378
    .line 379
    move v12, v2

    .line 380
    :goto_2
    if-ge v12, v10, :cond_3

    .line 381
    .line 382
    const-wide/16 v13, 0xff

    .line 383
    .line 384
    and-long/2addr v13, v8

    .line 385
    const-wide/16 v15, 0x80

    .line 386
    .line 387
    cmp-long v13, v13, v15

    .line 388
    .line 389
    if-gez v13, :cond_2

    .line 390
    .line 391
    shl-int/lit8 v13, v7, 0x3

    .line 392
    .line 393
    add-int/2addr v13, v12

    .line 394
    aget-object v14, v4, v13

    .line 395
    .line 396
    aget-object v13, v5, v13

    .line 397
    .line 398
    check-cast v13, Lzw0;

    .line 399
    .line 400
    invoke-interface {v13}, Lzw0;->c()Ljava/util/Map;

    .line 401
    .line 402
    .line 403
    move-result-object v13

    .line 404
    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    .line 405
    .line 406
    .line 407
    move-result v15

    .line 408
    if-eqz v15, :cond_1

    .line 409
    .line 410
    invoke-interface {v3, v14}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    goto :goto_3

    .line 414
    :cond_1
    invoke-interface {v3, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    :cond_2
    :goto_3
    shr-long/2addr v8, v11

    .line 418
    add-int/lit8 v12, v12, 0x1

    .line 419
    .line 420
    goto :goto_2

    .line 421
    :cond_3
    if-ne v10, v11, :cond_5

    .line 422
    .line 423
    :cond_4
    if-eq v7, v6, :cond_5

    .line 424
    .line 425
    add-int/lit8 v7, v7, 0x1

    .line 426
    .line 427
    goto :goto_1

    .line 428
    :cond_5
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-eqz v0, :cond_6

    .line 433
    .line 434
    goto :goto_4

    .line 435
    :cond_6
    move-object v1, v3

    .line 436
    :goto_4
    return-object v1

    .line 437
    :pswitch_c
    move-object/from16 v0, p1

    .line 438
    .line 439
    check-cast v0, Ljava/lang/Integer;

    .line 440
    .line 441
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    move-object/from16 v1, p2

    .line 446
    .line 447
    check-cast v1, Lnk;

    .line 448
    .line 449
    add-int/lit8 v0, v0, 0x1

    .line 450
    .line 451
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    return-object v0

    .line 456
    :pswitch_d
    move-object/from16 v0, p1

    .line 457
    .line 458
    check-cast v0, Lvw0;

    .line 459
    .line 460
    move-object/from16 v0, p2

    .line 461
    .line 462
    check-cast v0, Lf90;

    .line 463
    .line 464
    invoke-virtual {v0}, Lf90;->c()Ljava/util/Map;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    if-eqz v2, :cond_7

    .line 473
    .line 474
    goto :goto_5

    .line 475
    :cond_7
    move-object v1, v0

    .line 476
    :goto_5
    return-object v1

    .line 477
    :pswitch_e
    move-object/from16 v0, p1

    .line 478
    .line 479
    check-cast v0, Lvw0;

    .line 480
    .line 481
    move-object/from16 v0, p2

    .line 482
    .line 483
    check-cast v0, Lc90;

    .line 484
    .line 485
    iget-object v1, v0, Lc90;->e:Lfe;

    .line 486
    .line 487
    iget-object v1, v1, Lfe;->b:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v1, Ldp0;

    .line 490
    .line 491
    invoke-virtual {v1}, Ldp0;->g()I

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    iget-object v0, v0, Lc90;->e:Lfe;

    .line 500
    .line 501
    iget-object v0, v0, Lfe;->c:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, Ldp0;

    .line 504
    .line 505
    invoke-virtual {v0}, Ldp0;->g()I

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    filled-new-array {v1, v0}, [Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-static {v0}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    return-object v0

    .line 522
    :pswitch_f
    move-object/from16 v0, p1

    .line 523
    .line 524
    check-cast v0, Lvw0;

    .line 525
    .line 526
    move-object/from16 v0, p2

    .line 527
    .line 528
    check-cast v0, Lkm;

    .line 529
    .line 530
    iget-object v1, v0, Llo0;->d:Lco0;

    .line 531
    .line 532
    iget-object v1, v1, Lco0;->b:Ldp0;

    .line 533
    .line 534
    invoke-virtual {v1}, Ldp0;->g()I

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-virtual {v0}, Llo0;->l()F

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    const/high16 v3, -0x41000000    # -0.5f

    .line 547
    .line 548
    const/high16 v4, 0x3f000000    # 0.5f

    .line 549
    .line 550
    invoke-static {v2, v3, v4}, Lw60;->m(FFF)F

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-virtual {v0}, Lkm;->n()I

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    filled-new-array {v1, v2, v0}, [Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-static {v0}, Lo30;->w([Ljava/lang/Object;)Ljava/util/List;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    return-object v0

    .line 575
    :pswitch_10
    move-object/from16 v0, p1

    .line 576
    .line 577
    check-cast v0, Ljava/lang/Boolean;

    .line 578
    .line 579
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 580
    .line 581
    .line 582
    move-object/from16 v1, p2

    .line 583
    .line 584
    check-cast v1, Lnk;

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_11
    move-object/from16 v0, p1

    .line 588
    .line 589
    check-cast v0, Lpk;

    .line 590
    .line 591
    move-object/from16 v1, p2

    .line 592
    .line 593
    check-cast v1, Lnk;

    .line 594
    .line 595
    invoke-interface {v0, v1}, Lpk;->h(Lpk;)Lpk;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    return-object v0

    .line 600
    :pswitch_12
    move-object/from16 v0, p1

    .line 601
    .line 602
    check-cast v0, Lpk;

    .line 603
    .line 604
    move-object/from16 v1, p2

    .line 605
    .line 606
    check-cast v1, Lnk;

    .line 607
    .line 608
    invoke-interface {v0, v1}, Lpk;->h(Lpk;)Lpk;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    return-object v0

    .line 613
    :pswitch_13
    move-object/from16 v0, p1

    .line 614
    .line 615
    check-cast v0, Lpk;

    .line 616
    .line 617
    move-object/from16 v1, p2

    .line 618
    .line 619
    check-cast v1, Lnk;

    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-interface {v1}, Lnk;->getKey()Lok;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    invoke-interface {v0, v2}, Lpk;->t(Lok;)Lpk;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    sget-object v2, Lfs;->d:Lfs;

    .line 636
    .line 637
    if-ne v0, v2, :cond_8

    .line 638
    .line 639
    goto :goto_7

    .line 640
    :cond_8
    sget-object v3, Ln2;->w:Ln2;

    .line 641
    .line 642
    invoke-interface {v0, v3}, Lpk;->l(Lok;)Lnk;

    .line 643
    .line 644
    .line 645
    move-result-object v4

    .line 646
    check-cast v4, Lrk;

    .line 647
    .line 648
    if-nez v4, :cond_9

    .line 649
    .line 650
    new-instance v2, Leg;

    .line 651
    .line 652
    invoke-direct {v2, v1, v0}, Leg;-><init>(Lnk;Lpk;)V

    .line 653
    .line 654
    .line 655
    :goto_6
    move-object v1, v2

    .line 656
    goto :goto_7

    .line 657
    :cond_9
    invoke-interface {v0, v3}, Lpk;->t(Lok;)Lpk;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    if-ne v0, v2, :cond_a

    .line 662
    .line 663
    new-instance v0, Leg;

    .line 664
    .line 665
    invoke-direct {v0, v4, v1}, Leg;-><init>(Lnk;Lpk;)V

    .line 666
    .line 667
    .line 668
    move-object v1, v0

    .line 669
    goto :goto_7

    .line 670
    :cond_a
    new-instance v2, Leg;

    .line 671
    .line 672
    new-instance v3, Leg;

    .line 673
    .line 674
    invoke-direct {v3, v1, v0}, Leg;-><init>(Lnk;Lpk;)V

    .line 675
    .line 676
    .line 677
    invoke-direct {v2, v4, v3}, Leg;-><init>(Lnk;Lpk;)V

    .line 678
    .line 679
    .line 680
    goto :goto_6

    .line 681
    :goto_7
    return-object v1

    .line 682
    :pswitch_14
    move-object/from16 v0, p1

    .line 683
    .line 684
    check-cast v0, Lji;

    .line 685
    .line 686
    move-object/from16 v1, p2

    .line 687
    .line 688
    check-cast v1, Ljava/lang/Integer;

    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    invoke-static {v0, v1}, Loh;->e(Lji;I)Lna1;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    return-object v0

    .line 699
    :pswitch_15
    move-object/from16 v0, p1

    .line 700
    .line 701
    check-cast v0, Lji;

    .line 702
    .line 703
    move-object/from16 v1, p2

    .line 704
    .line 705
    check-cast v1, Ljava/lang/Integer;

    .line 706
    .line 707
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    invoke-static {v0, v1}, Loh;->d(Lji;I)Lna1;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    return-object v0

    .line 716
    :pswitch_16
    move-object/from16 v0, p1

    .line 717
    .line 718
    check-cast v0, Lji;

    .line 719
    .line 720
    move-object/from16 v1, p2

    .line 721
    .line 722
    check-cast v1, Ljava/lang/Integer;

    .line 723
    .line 724
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 725
    .line 726
    .line 727
    move-result v1

    .line 728
    invoke-static {v0, v1}, Loh;->k(Lji;I)Lna1;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    return-object v0

    .line 733
    :pswitch_17
    move-object/from16 v0, p1

    .line 734
    .line 735
    check-cast v0, Lji;

    .line 736
    .line 737
    move-object/from16 v1, p2

    .line 738
    .line 739
    check-cast v1, Ljava/lang/Integer;

    .line 740
    .line 741
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    invoke-static {v0, v1}, Loh;->g(Lji;I)Lna1;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    return-object v0

    .line 750
    :pswitch_18
    move-object/from16 v0, p1

    .line 751
    .line 752
    check-cast v0, Lji;

    .line 753
    .line 754
    move-object/from16 v1, p2

    .line 755
    .line 756
    check-cast v1, Ljava/lang/Integer;

    .line 757
    .line 758
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    invoke-static {v0, v1}, Loh;->a(Lji;I)Lna1;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    return-object v0

    .line 767
    :pswitch_19
    move-object/from16 v0, p1

    .line 768
    .line 769
    check-cast v0, Lji;

    .line 770
    .line 771
    move-object/from16 v1, p2

    .line 772
    .line 773
    check-cast v1, Ljava/lang/Integer;

    .line 774
    .line 775
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 776
    .line 777
    .line 778
    move-result v1

    .line 779
    invoke-static {v0, v1}, Loh;->h(Lji;I)Lna1;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    return-object v0

    .line 784
    :pswitch_1a
    move-object/from16 v0, p1

    .line 785
    .line 786
    check-cast v0, Lji;

    .line 787
    .line 788
    move-object/from16 v1, p2

    .line 789
    .line 790
    check-cast v1, Ljava/lang/Integer;

    .line 791
    .line 792
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    invoke-static {v0, v1}, Loh;->c(Lji;I)Lna1;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    return-object v0

    .line 801
    :pswitch_1b
    move-object/from16 v0, p1

    .line 802
    .line 803
    check-cast v0, Ljava/lang/String;

    .line 804
    .line 805
    move-object/from16 v1, p2

    .line 806
    .line 807
    check-cast v1, Lnk;

    .line 808
    .line 809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    if-nez v2, :cond_b

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    goto :goto_8

    .line 826
    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 827
    .line 828
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    const-string v0, ", "

    .line 835
    .line 836
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    :goto_8
    return-object v0

    .line 847
    :pswitch_1c
    move-object/from16 v0, p1

    .line 848
    .line 849
    check-cast v0, Ljava/lang/Integer;

    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    move-object/from16 v1, p2

    .line 856
    .line 857
    check-cast v1, Lk50;

    .line 858
    .line 859
    int-to-float v0, v0

    .line 860
    const/high16 v2, 0x40000000    # 2.0f

    .line 861
    .line 862
    div-float/2addr v0, v2

    .line 863
    const/high16 v2, 0x3f800000    # 1.0f

    .line 864
    .line 865
    sget-object v3, Lk50;->d:Lk50;

    .line 866
    .line 867
    if-ne v1, v3, :cond_c

    .line 868
    .line 869
    const/high16 v1, -0x40800000    # -1.0f

    .line 870
    .line 871
    goto :goto_9

    .line 872
    :cond_c
    move v1, v2

    .line 873
    :goto_9
    add-float/2addr v2, v1

    .line 874
    mul-float/2addr v2, v0

    .line 875
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 876
    .line 877
    .line 878
    move-result v0

    .line 879
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    return-object v0

    .line 884
    nop

    .line 885
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
