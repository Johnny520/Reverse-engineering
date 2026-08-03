.class public final synthetic Li2/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li2/y;->g:I

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
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget v2, v1, Li2/y;->g:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x2

    .line 10
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v2, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v2, p2

    .line 17
    .line 18
    check-cast v2, Lwf/e;

    .line 19
    .line 20
    instance-of v4, v2, Li0/o2;

    .line 21
    .line 22
    if-eqz v4, :cond_3

    .line 23
    .line 24
    instance-of v4, v0, Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move-object v3, v0

    .line 29
    check-cast v3, Ljava/lang/Integer;

    .line 30
    .line 31
    :cond_0
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v0, v7

    .line 39
    :goto_0
    if-nez v0, :cond_2

    .line 40
    .line 41
    move-object v0, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    add-int/2addr v0, v7

    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_3
    :goto_1
    return-object v0

    .line 49
    :pswitch_0
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    move-object/from16 v2, p2

    .line 52
    .line 53
    check-cast v2, Ljava/lang/Throwable;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const-string v3, "[Hchat:AutoMessageForward] "

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-object v6

    .line 68
    :pswitch_1
    check-cast v0, Lv0/b;

    .line 69
    .line 70
    return-object p2

    .line 71
    :pswitch_2
    check-cast v0, Lv0/b;

    .line 72
    .line 73
    move-object/from16 v0, p2

    .line 74
    .line 75
    check-cast v0, Lv0/d;

    .line 76
    .line 77
    iget-object v2, v0, Lv0/d;->g:Ljava/util/Map;

    .line 78
    .line 79
    iget-object v0, v0, Lv0/d;->h:Lf/k0;

    .line 80
    .line 81
    iget-object v6, v0, Lf/k0;->b:[Ljava/lang/Object;

    .line 82
    .line 83
    iget-object v7, v0, Lf/k0;->c:[Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v0, v0, Lf/k0;->a:[J

    .line 86
    .line 87
    array-length v8, v0

    .line 88
    sub-int/2addr v8, v5

    .line 89
    if-ltz v8, :cond_8

    .line 90
    .line 91
    move v5, v4

    .line 92
    :goto_2
    aget-wide v9, v0, v5

    .line 93
    .line 94
    not-long v11, v9

    .line 95
    const/4 v13, 0x7

    .line 96
    shl-long/2addr v11, v13

    .line 97
    and-long/2addr v11, v9

    .line 98
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr v11, v13

    .line 104
    cmp-long v11, v11, v13

    .line 105
    .line 106
    if-eqz v11, :cond_7

    .line 107
    .line 108
    sub-int v11, v5, v8

    .line 109
    .line 110
    not-int v11, v11

    .line 111
    ushr-int/lit8 v11, v11, 0x1f

    .line 112
    .line 113
    const/16 v12, 0x8

    .line 114
    .line 115
    rsub-int/lit8 v11, v11, 0x8

    .line 116
    .line 117
    move v13, v4

    .line 118
    :goto_3
    if-ge v13, v11, :cond_6

    .line 119
    .line 120
    const-wide/16 v14, 0xff

    .line 121
    .line 122
    and-long/2addr v14, v9

    .line 123
    const-wide/16 v16, 0x80

    .line 124
    .line 125
    cmp-long v14, v14, v16

    .line 126
    .line 127
    if-gez v14, :cond_5

    .line 128
    .line 129
    shl-int/lit8 v14, v5, 0x3

    .line 130
    .line 131
    add-int/2addr v14, v13

    .line 132
    aget-object v15, v6, v14

    .line 133
    .line 134
    aget-object v14, v7, v14

    .line 135
    .line 136
    check-cast v14, Lv0/f;

    .line 137
    .line 138
    invoke-interface {v14}, Lv0/f;->c()Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    invoke-interface {v14}, Ljava/util/Map;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    if-eqz v16, :cond_4

    .line 147
    .line 148
    invoke-interface {v2, v15}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_4
    invoke-interface {v2, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    :cond_5
    :goto_4
    shr-long/2addr v9, v12

    .line 156
    add-int/lit8 v13, v13, 0x1

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    if-ne v11, v12, :cond_8

    .line 160
    .line 161
    :cond_7
    if-eq v5, v8, :cond_8

    .line 162
    .line 163
    add-int/lit8 v5, v5, 0x1

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_8
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_9
    move-object v3, v2

    .line 174
    :goto_5
    return-object v3

    .line 175
    :pswitch_3
    check-cast v0, Ljava/lang/Integer;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    move-object/from16 v2, p2

    .line 182
    .line 183
    check-cast v2, Lwf/e;

    .line 184
    .line 185
    add-int/2addr v0, v7

    .line 186
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :pswitch_4
    check-cast v0, Lh1/d;

    .line 192
    .line 193
    move-object/from16 v2, p2

    .line 194
    .line 195
    check-cast v2, Lfg/l;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    return-object v6

    .line 207
    :pswitch_5
    check-cast v0, Ljava/lang/String;

    .line 208
    .line 209
    move-object/from16 v2, p2

    .line 210
    .line 211
    check-cast v2, Ljava/lang/Throwable;

    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    const-string v3, "[Hchat:HideChatMenu] "

    .line 217
    .line 218
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    return-object v6

    .line 226
    :pswitch_6
    check-cast v0, Lv0/b;

    .line 227
    .line 228
    move-object/from16 v2, p2

    .line 229
    .line 230
    check-cast v2, Lsh/e2;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    iget v0, v2, Lsh/e2;->a:F

    .line 239
    .line 240
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v3, v2, Lsh/e2;->c:Li0/f1;

    .line 245
    .line 246
    invoke-virtual {v3}, Li0/f1;->g()F

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    iget-object v2, v2, Lsh/e2;->b:Li0/f1;

    .line 255
    .line 256
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    filled-new-array {v0, v3, v2}, [Ljava/lang/Float;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    return-object v0

    .line 273
    :pswitch_7
    check-cast v0, Li0/h0;

    .line 274
    .line 275
    move-object/from16 v2, p2

    .line 276
    .line 277
    check-cast v2, Ljava/lang/Integer;

    .line 278
    .line 279
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    and-int/lit8 v3, v2, 0x3

    .line 284
    .line 285
    if-eq v3, v5, :cond_a

    .line 286
    .line 287
    move v4, v7

    .line 288
    :cond_a
    and-int/2addr v2, v7

    .line 289
    invoke-virtual {v0, v2, v4}, Li0/h0;->S(IZ)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_b

    .line 294
    .line 295
    sget-object v2, Lci/x;->a:Lci/a;

    .line 296
    .line 297
    const/4 v3, 0x6

    .line 298
    invoke-virtual {v2, v0, v3}, Lci/a;->a(Li0/h0;I)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_b
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 303
    .line 304
    .line 305
    :goto_6
    return-object v6

    .line 306
    :pswitch_8
    check-cast v0, Li0/h0;

    .line 307
    .line 308
    move-object/from16 v2, p2

    .line 309
    .line 310
    check-cast v2, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    and-int/lit8 v3, v2, 0x3

    .line 317
    .line 318
    if-eq v3, v5, :cond_c

    .line 319
    .line 320
    move v4, v7

    .line 321
    :cond_c
    and-int/2addr v2, v7

    .line 322
    invoke-virtual {v0, v2, v4}, Li0/h0;->S(IZ)Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_d

    .line 327
    .line 328
    goto :goto_7

    .line 329
    :cond_d
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 330
    .line 331
    .line 332
    :goto_7
    return-object v6

    .line 333
    :pswitch_9
    check-cast v0, Li0/h0;

    .line 334
    .line 335
    move-object/from16 v2, p2

    .line 336
    .line 337
    check-cast v2, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    and-int/lit8 v3, v2, 0x3

    .line 344
    .line 345
    if-eq v3, v5, :cond_e

    .line 346
    .line 347
    move v4, v7

    .line 348
    :cond_e
    and-int/2addr v2, v7

    .line 349
    invoke-virtual {v0, v2, v4}, Li0/h0;->S(IZ)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-eqz v2, :cond_f

    .line 354
    .line 355
    goto :goto_8

    .line 356
    :cond_f
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 357
    .line 358
    .line 359
    :goto_8
    return-object v6

    .line 360
    :pswitch_a
    check-cast v0, Li0/h0;

    .line 361
    .line 362
    move-object/from16 v2, p2

    .line 363
    .line 364
    check-cast v2, Ljava/lang/Integer;

    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    and-int/lit8 v3, v2, 0x3

    .line 371
    .line 372
    if-eq v3, v5, :cond_10

    .line 373
    .line 374
    move v4, v7

    .line 375
    :cond_10
    and-int/2addr v2, v7

    .line 376
    invoke-virtual {v0, v2, v4}, Li0/h0;->S(IZ)Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_11

    .line 381
    .line 382
    goto :goto_9

    .line 383
    :cond_11
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 384
    .line 385
    .line 386
    :goto_9
    return-object v6

    .line 387
    :pswitch_b
    check-cast v0, Li0/h0;

    .line 388
    .line 389
    move-object/from16 v2, p2

    .line 390
    .line 391
    check-cast v2, Ljava/lang/Integer;

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    and-int/lit8 v3, v2, 0x3

    .line 398
    .line 399
    if-eq v3, v5, :cond_12

    .line 400
    .line 401
    move v4, v7

    .line 402
    :cond_12
    and-int/2addr v2, v7

    .line 403
    invoke-virtual {v0, v2, v4}, Li0/h0;->S(IZ)Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-eqz v2, :cond_13

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_13
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 411
    .line 412
    .line 413
    :goto_a
    return-object v6

    .line 414
    :pswitch_c
    check-cast v0, Li0/h0;

    .line 415
    .line 416
    move-object/from16 v2, p2

    .line 417
    .line 418
    check-cast v2, Ljava/lang/Integer;

    .line 419
    .line 420
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    and-int/lit8 v3, v2, 0x3

    .line 425
    .line 426
    if-eq v3, v5, :cond_14

    .line 427
    .line 428
    move v4, v7

    .line 429
    :cond_14
    and-int/2addr v2, v7

    .line 430
    invoke-virtual {v0, v2, v4}, Li0/h0;->S(IZ)Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_15

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_15
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 438
    .line 439
    .line 440
    :goto_b
    return-object v6

    .line 441
    :pswitch_d
    check-cast v0, Lv0/b;

    .line 442
    .line 443
    move-object/from16 v0, p2

    .line 444
    .line 445
    check-cast v0, Ls/x0;

    .line 446
    .line 447
    invoke-virtual {v0}, Ls/x0;->c()Ljava/util/Map;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    if-eqz v2, :cond_16

    .line 456
    .line 457
    goto :goto_c

    .line 458
    :cond_16
    move-object v3, v0

    .line 459
    :goto_c
    return-object v3

    .line 460
    :pswitch_e
    check-cast v0, Lv0/b;

    .line 461
    .line 462
    move-object/from16 v0, p2

    .line 463
    .line 464
    check-cast v0, Lr/z;

    .line 465
    .line 466
    invoke-virtual {v0}, Lr/z;->h()I

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v0}, Lr/z;->i()I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    filled-new-array {v2, v0}, [Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    return-object v0

    .line 491
    :pswitch_f
    check-cast v0, Ljava/lang/Boolean;

    .line 492
    .line 493
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 494
    .line 495
    .line 496
    move-object/from16 v2, p2

    .line 497
    .line 498
    check-cast v2, Lwf/e;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_10
    check-cast v0, Lwf/g;

    .line 502
    .line 503
    move-object/from16 v2, p2

    .line 504
    .line 505
    check-cast v2, Lwf/e;

    .line 506
    .line 507
    invoke-interface {v0, v2}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    return-object v0

    .line 512
    :pswitch_11
    check-cast v0, Lwf/g;

    .line 513
    .line 514
    move-object/from16 v2, p2

    .line 515
    .line 516
    check-cast v2, Lwf/e;

    .line 517
    .line 518
    invoke-interface {v0, v2}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    return-object v0

    .line 523
    :pswitch_12
    check-cast v0, Ljava/lang/String;

    .line 524
    .line 525
    move-object/from16 v2, p2

    .line 526
    .line 527
    check-cast v2, Lp8/c0;

    .line 528
    .line 529
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    if-eqz v2, :cond_17

    .line 533
    .line 534
    goto :goto_d

    .line 535
    :cond_17
    new-instance v2, Lp8/c0;

    .line 536
    .line 537
    invoke-direct {v2}, Lp8/c0;-><init>()V

    .line 538
    .line 539
    .line 540
    :goto_d
    iget v0, v2, Lp8/c0;->b:I

    .line 541
    .line 542
    add-int/2addr v0, v7

    .line 543
    iput v0, v2, Lp8/c0;->b:I

    .line 544
    .line 545
    return-object v2

    .line 546
    :pswitch_13
    check-cast v0, Lv0/b;

    .line 547
    .line 548
    move-object/from16 v0, p2

    .line 549
    .line 550
    check-cast v0, Lk/w1;

    .line 551
    .line 552
    iget-object v0, v0, Lk/w1;->a:Li0/g1;

    .line 553
    .line 554
    invoke-virtual {v0}, Li0/g1;->g()I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    return-object v0

    .line 563
    :pswitch_14
    check-cast v0, Lv0/b;

    .line 564
    .line 565
    move-object/from16 v0, p2

    .line 566
    .line 567
    check-cast v0, Lt2/r;

    .line 568
    .line 569
    iget v0, v0, Lt2/r;->a:I

    .line 570
    .line 571
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    return-object v0

    .line 576
    :pswitch_15
    check-cast v0, Lv0/b;

    .line 577
    .line 578
    move-object/from16 v2, p2

    .line 579
    .line 580
    check-cast v2, Lt2/s;

    .line 581
    .line 582
    iget v3, v2, Lt2/s;->a:I

    .line 583
    .line 584
    new-instance v4, Lt2/r;

    .line 585
    .line 586
    invoke-direct {v4, v3}, Lt2/r;-><init>(I)V

    .line 587
    .line 588
    .line 589
    sget-object v3, Li2/e0;->e:Lp4/t;

    .line 590
    .line 591
    invoke-static {v4, v3, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    iget-boolean v2, v2, Lt2/s;->b:Z

    .line 596
    .line 597
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    return-object v0

    .line 610
    :pswitch_16
    check-cast v0, Lv0/b;

    .line 611
    .line 612
    move-object/from16 v0, p2

    .line 613
    .line 614
    check-cast v0, Lt2/e;

    .line 615
    .line 616
    iget v0, v0, Lt2/e;->a:I

    .line 617
    .line 618
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    return-object v0

    .line 623
    :pswitch_17
    check-cast v0, Lv0/b;

    .line 624
    .line 625
    move-object/from16 v0, p2

    .line 626
    .line 627
    check-cast v0, Li2/j;

    .line 628
    .line 629
    iget v0, v0, Li2/j;->a:I

    .line 630
    .line 631
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    return-object v0

    .line 636
    :pswitch_18
    check-cast v0, Lv0/b;

    .line 637
    .line 638
    move-object/from16 v2, p2

    .line 639
    .line 640
    check-cast v2, Li2/w;

    .line 641
    .line 642
    iget-boolean v3, v2, Li2/w;->a:Z

    .line 643
    .line 644
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    sget-object v4, Li2/d0;->a:Lp4/t;

    .line 649
    .line 650
    iget v2, v2, Li2/w;->b:I

    .line 651
    .line 652
    new-instance v4, Li2/j;

    .line 653
    .line 654
    invoke-direct {v4, v2}, Li2/j;-><init>(I)V

    .line 655
    .line 656
    .line 657
    sget-object v2, Li2/e0;->b:Lp4/t;

    .line 658
    .line 659
    invoke-static {v4, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    return-object v0

    .line 672
    :pswitch_19
    check-cast v0, Lv0/b;

    .line 673
    .line 674
    move-object/from16 v2, p2

    .line 675
    .line 676
    check-cast v2, Li2/l0;

    .line 677
    .line 678
    iget-object v3, v2, Li2/l0;->a:Li2/f0;

    .line 679
    .line 680
    sget-object v4, Li2/d0;->h:Lp4/t;

    .line 681
    .line 682
    invoke-static {v3, v4, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    iget-object v5, v2, Li2/l0;->b:Li2/f0;

    .line 687
    .line 688
    invoke-static {v5, v4, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v5

    .line 692
    iget-object v6, v2, Li2/l0;->c:Li2/f0;

    .line 693
    .line 694
    invoke-static {v6, v4, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    iget-object v2, v2, Li2/l0;->d:Li2/f0;

    .line 699
    .line 700
    invoke-static {v2, v4, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    filled-new-array {v3, v5, v6, v0}, [Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    return-object v0

    .line 713
    :pswitch_1a
    check-cast v0, Lv0/b;

    .line 714
    .line 715
    move-object/from16 v2, p2

    .line 716
    .line 717
    check-cast v2, Li2/f0;

    .line 718
    .line 719
    iget-object v3, v2, Li2/f0;->a:Lt2/o;

    .line 720
    .line 721
    invoke-interface {v3}, Lt2/o;->b()J

    .line 722
    .line 723
    .line 724
    move-result-wide v3

    .line 725
    new-instance v5, Lf1/w;

    .line 726
    .line 727
    invoke-direct {v5, v3, v4}, Lf1/w;-><init>(J)V

    .line 728
    .line 729
    .line 730
    sget-object v3, Li2/d0;->p:Li2/c0;

    .line 731
    .line 732
    invoke-static {v5, v3, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    iget-wide v4, v2, Li2/f0;->b:J

    .line 737
    .line 738
    new-instance v7, Lu2/o;

    .line 739
    .line 740
    invoke-direct {v7, v4, v5}, Lu2/o;-><init>(J)V

    .line 741
    .line 742
    .line 743
    sget-object v4, Li2/d0;->v:Li2/c0;

    .line 744
    .line 745
    invoke-static {v7, v4, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    iget-object v5, v2, Li2/f0;->c:Lm2/k;

    .line 750
    .line 751
    sget-object v8, Lm2/k;->h:Lm2/k;

    .line 752
    .line 753
    sget-object v8, Li2/d0;->m:Lp4/t;

    .line 754
    .line 755
    invoke-static {v5, v8, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v8

    .line 759
    iget-object v5, v2, Li2/f0;->d:Lm2/i;

    .line 760
    .line 761
    sget-object v9, Li2/d0;->t:Lp4/t;

    .line 762
    .line 763
    invoke-static {v5, v9, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v9

    .line 767
    iget-object v5, v2, Li2/f0;->e:Lm2/j;

    .line 768
    .line 769
    sget-object v10, Li2/d0;->u:Lp4/t;

    .line 770
    .line 771
    invoke-static {v5, v10, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v10

    .line 775
    const/4 v5, -0x1

    .line 776
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 777
    .line 778
    .line 779
    move-result-object v11

    .line 780
    iget-object v12, v2, Li2/f0;->g:Ljava/lang/String;

    .line 781
    .line 782
    iget-wide v13, v2, Li2/f0;->h:J

    .line 783
    .line 784
    new-instance v5, Lu2/o;

    .line 785
    .line 786
    invoke-direct {v5, v13, v14}, Lu2/o;-><init>(J)V

    .line 787
    .line 788
    .line 789
    invoke-static {v5, v4, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v13

    .line 793
    iget-object v4, v2, Li2/f0;->i:Lt2/a;

    .line 794
    .line 795
    sget-object v5, Li2/d0;->n:Lp4/t;

    .line 796
    .line 797
    invoke-static {v4, v5, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v14

    .line 801
    iget-object v4, v2, Li2/f0;->j:Lt2/p;

    .line 802
    .line 803
    sget-object v5, Li2/d0;->k:Lp4/t;

    .line 804
    .line 805
    invoke-static {v4, v5, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v15

    .line 809
    iget-object v4, v2, Li2/f0;->k:Lp2/b;

    .line 810
    .line 811
    sget-object v5, Lp2/b;->i:Lp2/b;

    .line 812
    .line 813
    sget-object v5, Li2/d0;->y:Lp4/t;

    .line 814
    .line 815
    invoke-static {v4, v5, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v16

    .line 819
    iget-wide v4, v2, Li2/f0;->l:J

    .line 820
    .line 821
    new-instance v1, Lf1/w;

    .line 822
    .line 823
    invoke-direct {v1, v4, v5}, Lf1/w;-><init>(J)V

    .line 824
    .line 825
    .line 826
    invoke-static {v1, v3, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v17

    .line 830
    iget-object v1, v2, Li2/f0;->m:Lt2/l;

    .line 831
    .line 832
    sget-object v3, Li2/d0;->j:Lp4/t;

    .line 833
    .line 834
    invoke-static {v1, v3, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v18

    .line 838
    iget-object v1, v2, Li2/f0;->n:Lf1/q0;

    .line 839
    .line 840
    sget-object v2, Lf1/q0;->d:Lf1/q0;

    .line 841
    .line 842
    sget-object v2, Li2/d0;->o:Lp4/t;

    .line 843
    .line 844
    invoke-static {v1, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v19

    .line 848
    filled-new-array/range {v6 .. v19}, [Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    return-object v0

    .line 857
    :pswitch_1b
    check-cast v0, Lv0/b;

    .line 858
    .line 859
    move-object/from16 v0, p2

    .line 860
    .line 861
    check-cast v0, Li2/o0;

    .line 862
    .line 863
    iget-object v0, v0, Li2/o0;->a:Ljava/lang/String;

    .line 864
    .line 865
    return-object v0

    .line 866
    :pswitch_1c
    check-cast v0, Lv0/b;

    .line 867
    .line 868
    move-object/from16 v1, p2

    .line 869
    .line 870
    check-cast v1, Li2/u;

    .line 871
    .line 872
    iget v2, v1, Li2/u;->a:I

    .line 873
    .line 874
    new-instance v3, Lt2/k;

    .line 875
    .line 876
    invoke-direct {v3, v2}, Lt2/k;-><init>(I)V

    .line 877
    .line 878
    .line 879
    sget-object v2, Li2/d0;->q:Li2/c0;

    .line 880
    .line 881
    invoke-static {v3, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    iget v2, v1, Li2/u;->b:I

    .line 886
    .line 887
    new-instance v3, Lt2/m;

    .line 888
    .line 889
    invoke-direct {v3, v2}, Lt2/m;-><init>(I)V

    .line 890
    .line 891
    .line 892
    sget-object v2, Li2/d0;->r:Li2/c0;

    .line 893
    .line 894
    invoke-static {v3, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v5

    .line 898
    iget-wide v2, v1, Li2/u;->c:J

    .line 899
    .line 900
    new-instance v6, Lu2/o;

    .line 901
    .line 902
    invoke-direct {v6, v2, v3}, Lu2/o;-><init>(J)V

    .line 903
    .line 904
    .line 905
    sget-object v2, Li2/d0;->v:Li2/c0;

    .line 906
    .line 907
    invoke-static {v6, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v6

    .line 911
    iget-object v2, v1, Li2/u;->d:Lt2/q;

    .line 912
    .line 913
    sget-object v3, Lt2/q;->c:Lt2/q;

    .line 914
    .line 915
    sget-object v3, Li2/d0;->l:Lp4/t;

    .line 916
    .line 917
    invoke-static {v2, v3, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v7

    .line 921
    iget-object v2, v1, Li2/u;->e:Li2/w;

    .line 922
    .line 923
    sget-object v3, Li2/e0;->a:Lp4/t;

    .line 924
    .line 925
    invoke-static {v2, v3, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v8

    .line 929
    iget-object v2, v1, Li2/u;->f:Lt2/i;

    .line 930
    .line 931
    sget-object v3, Lt2/i;->d:Lt2/i;

    .line 932
    .line 933
    sget-object v3, Li2/d0;->A:Lp4/t;

    .line 934
    .line 935
    invoke-static {v2, v3, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v9

    .line 939
    iget v2, v1, Li2/u;->g:I

    .line 940
    .line 941
    new-instance v3, Lt2/e;

    .line 942
    .line 943
    invoke-direct {v3, v2}, Lt2/e;-><init>(I)V

    .line 944
    .line 945
    .line 946
    sget-object v2, Li2/e0;->c:Lp4/t;

    .line 947
    .line 948
    invoke-static {v3, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v10

    .line 952
    iget v2, v1, Li2/u;->h:I

    .line 953
    .line 954
    new-instance v3, Lt2/d;

    .line 955
    .line 956
    invoke-direct {v3, v2}, Lt2/d;-><init>(I)V

    .line 957
    .line 958
    .line 959
    sget-object v2, Li2/d0;->s:Li2/c0;

    .line 960
    .line 961
    invoke-static {v3, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v11

    .line 965
    iget-object v1, v1, Li2/u;->i:Lt2/s;

    .line 966
    .line 967
    sget-object v2, Li2/e0;->d:Lp4/t;

    .line 968
    .line 969
    invoke-static {v1, v2, v0}, Li2/d0;->a(Ljava/lang/Object;Lv0/j;Lv0/b;)Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v12

    .line 973
    filled-new-array/range {v4 .. v12}, [Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    invoke-static {v0}, La/a;->k([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    return-object v0

    .line 982
    nop

    .line 983
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
