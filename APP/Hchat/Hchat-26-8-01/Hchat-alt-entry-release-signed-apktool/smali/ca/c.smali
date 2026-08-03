.class public final synthetic Lca/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J


# direct methods
.method public synthetic constructor <init>(JI)V
    .locals 0

    .line 1
    iput p3, p0, Lca/c;->g:I

    .line 2
    .line 3
    iput-wide p1, p0, Lca/c;->h:J

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
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lca/c;->g:I

    .line 4
    .line 5
    const-wide/16 v2, 0x3a98

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const-wide/32 v5, 0x927c0

    .line 9
    .line 10
    .line 11
    const-wide/16 v7, 0x1388

    .line 12
    .line 13
    sget-object v9, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x1

    .line 17
    iget-wide v12, v1, Lca/c;->h:J

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v0, p1

    .line 23
    .line 24
    check-cast v0, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lx8/i;

    .line 34
    .line 35
    iget-wide v2, v0, Lx8/i;->b:J

    .line 36
    .line 37
    sub-long/2addr v12, v2

    .line 38
    cmp-long v0, v12, v5

    .line 39
    .line 40
    if-lez v0, :cond_0

    .line 41
    .line 42
    move v10, v11

    .line 43
    :cond_0
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :pswitch_0
    move-object/from16 v2, p1

    .line 49
    .line 50
    check-cast v2, Lh1/d;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v7, Lh1/g;

    .line 56
    .line 57
    int-to-float v0, v4

    .line 58
    invoke-interface {v2, v0}, Lu2/c;->x0(F)F

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    const/4 v14, 0x0

    .line 63
    const/16 v15, 0x1e

    .line 64
    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    move-object v10, v7

    .line 68
    invoke-direct/range {v10 .. v15}, Lh1/g;-><init>(FFIII)V

    .line 69
    .line 70
    .line 71
    const-wide/16 v3, 0x0

    .line 72
    .line 73
    invoke-interface {v2}, Lh1/d;->a()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    invoke-static {v5, v6, v3, v4}, Lh1/d;->n0(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    iget-wide v3, v1, Lca/c;->h:J

    .line 82
    .line 83
    invoke-interface/range {v2 .. v7}, Lh1/d;->x(JJLh1/c;)V

    .line 84
    .line 85
    .line 86
    return-object v9

    .line 87
    :pswitch_1
    move-object/from16 v10, p1

    .line 88
    .line 89
    check-cast v10, Lh1/d;

    .line 90
    .line 91
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    const/16 v17, 0x7e

    .line 97
    .line 98
    iget-wide v11, v1, Lca/c;->h:J

    .line 99
    .line 100
    const-wide/16 v13, 0x0

    .line 101
    .line 102
    const/4 v15, 0x0

    .line 103
    invoke-static/range {v10 .. v17}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 104
    .line 105
    .line 106
    return-object v9

    .line 107
    :pswitch_2
    move-object/from16 v18, p1

    .line 108
    .line 109
    check-cast v18, Lh1/d;

    .line 110
    .line 111
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    const/16 v24, 0x0

    .line 115
    .line 116
    const/16 v25, 0x7e

    .line 117
    .line 118
    iget-wide v2, v1, Lca/c;->h:J

    .line 119
    .line 120
    const-wide/16 v21, 0x0

    .line 121
    .line 122
    const/16 v23, 0x0

    .line 123
    .line 124
    move-wide/from16 v19, v2

    .line 125
    .line 126
    invoke-static/range {v18 .. v25}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 127
    .line 128
    .line 129
    return-object v9

    .line 130
    :pswitch_3
    move-object/from16 v10, p1

    .line 131
    .line 132
    check-cast v10, Lh1/d;

    .line 133
    .line 134
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x7e

    .line 140
    .line 141
    iget-wide v11, v1, Lca/c;->h:J

    .line 142
    .line 143
    const-wide/16 v13, 0x0

    .line 144
    .line 145
    const/4 v15, 0x0

    .line 146
    invoke-static/range {v10 .. v17}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 147
    .line 148
    .line 149
    return-object v9

    .line 150
    :pswitch_4
    move-object/from16 v0, p1

    .line 151
    .line 152
    check-cast v0, Lf2/y;

    .line 153
    .line 154
    sget-object v2, Lh0/h0;->c:Lf2/x;

    .line 155
    .line 156
    new-instance v3, Lh0/g0;

    .line 157
    .line 158
    sget-object v7, Lh0/f0;->h:Lh0/f0;

    .line 159
    .line 160
    const/4 v8, 0x1

    .line 161
    sget-object v4, Lw/g0;->g:Lw/g0;

    .line 162
    .line 163
    iget-wide v5, v1, Lca/c;->h:J

    .line 164
    .line 165
    invoke-direct/range {v3 .. v8}, Lh0/g0;-><init>(Lw/g0;JLh0/f0;Z)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v0, v2, v3}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-object v9

    .line 172
    :pswitch_5
    move-object/from16 v0, p1

    .line 173
    .line 174
    check-cast v0, Lc1/d;

    .line 175
    .line 176
    iget-object v2, v0, Lc1/d;->g:Lc1/a;

    .line 177
    .line 178
    invoke-interface {v2}, Lc1/a;->a()J

    .line 179
    .line 180
    .line 181
    move-result-wide v2

    .line 182
    const/16 v5, 0x20

    .line 183
    .line 184
    shr-long/2addr v2, v5

    .line 185
    long-to-int v2, v2

    .line 186
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    const/high16 v3, 0x40000000    # 2.0f

    .line 191
    .line 192
    div-float/2addr v2, v3

    .line 193
    invoke-static {v0, v2}, Loh/h;->r(Lc1/d;F)Lf1/g;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    new-instance v5, Lf1/n;

    .line 198
    .line 199
    const/4 v6, 0x5

    .line 200
    invoke-direct {v5, v12, v13, v6}, Lf1/n;-><init>(JI)V

    .line 201
    .line 202
    .line 203
    new-instance v6, Lm/e3;

    .line 204
    .line 205
    invoke-direct {v6, v2, v3, v5, v4}, Lm/e3;-><init>(FLjava/lang/Object;Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v6}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

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
    check-cast v0, Lv8/g;

    .line 216
    .line 217
    iget-wide v2, v0, Lv8/g;->e:J

    .line 218
    .line 219
    cmp-long v0, v2, v12

    .line 220
    .line 221
    if-gez v0, :cond_1

    .line 222
    .line 223
    move v10, v11

    .line 224
    :cond_1
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    return-object v0

    .line 229
    :pswitch_7
    move-object/from16 v0, p1

    .line 230
    .line 231
    check-cast v0, Ljava/util/Map$Entry;

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    check-cast v0, Ljava/lang/Number;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    cmp-long v0, v2, v12

    .line 247
    .line 248
    if-gez v0, :cond_2

    .line 249
    .line 250
    move v10, v11

    .line 251
    :cond_2
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    return-object v0

    .line 256
    :pswitch_8
    move-object/from16 v0, p1

    .line 257
    .line 258
    check-cast v0, Ljava/util/Map$Entry;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    check-cast v0, Ljava/lang/Number;

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 273
    .line 274
    .line 275
    move-result-wide v4

    .line 276
    sub-long/2addr v12, v4

    .line 277
    cmp-long v0, v12, v2

    .line 278
    .line 279
    if-lez v0, :cond_3

    .line 280
    .line 281
    move v10, v11

    .line 282
    :cond_3
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    return-object v0

    .line 287
    :pswitch_9
    move-object/from16 v10, p1

    .line 288
    .line 289
    check-cast v10, Lh1/d;

    .line 290
    .line 291
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    const/16 v16, 0x0

    .line 295
    .line 296
    const/16 v17, 0x7e

    .line 297
    .line 298
    iget-wide v11, v1, Lca/c;->h:J

    .line 299
    .line 300
    const-wide/16 v13, 0x0

    .line 301
    .line 302
    const/4 v15, 0x0

    .line 303
    invoke-static/range {v10 .. v17}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 304
    .line 305
    .line 306
    return-object v9

    .line 307
    :pswitch_a
    move-object/from16 v0, p1

    .line 308
    .line 309
    check-cast v0, Ljava/util/Map$Entry;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    check-cast v0, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 324
    .line 325
    .line 326
    move-result-wide v2

    .line 327
    sub-long/2addr v12, v2

    .line 328
    cmp-long v0, v12, v7

    .line 329
    .line 330
    if-lez v0, :cond_4

    .line 331
    .line 332
    move v10, v11

    .line 333
    :cond_4
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0

    .line 338
    :pswitch_b
    move-object/from16 v0, p1

    .line 339
    .line 340
    check-cast v0, Ljava/util/Map$Entry;

    .line 341
    .line 342
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    check-cast v0, Ljava/lang/Number;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 355
    .line 356
    .line 357
    move-result-wide v2

    .line 358
    sub-long/2addr v12, v2

    .line 359
    cmp-long v0, v12, v7

    .line 360
    .line 361
    if-lez v0, :cond_5

    .line 362
    .line 363
    move v10, v11

    .line 364
    :cond_5
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :pswitch_c
    move-object/from16 v0, p1

    .line 370
    .line 371
    check-cast v0, Ljava/util/Map$Entry;

    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    check-cast v0, Lo9/l;

    .line 381
    .line 382
    iget-wide v2, v0, Lo9/l;->b:J

    .line 383
    .line 384
    sub-long/2addr v12, v2

    .line 385
    const-wide/32 v2, 0x1d4c0

    .line 386
    .line 387
    .line 388
    cmp-long v0, v12, v2

    .line 389
    .line 390
    if-lez v0, :cond_6

    .line 391
    .line 392
    move v10, v11

    .line 393
    :cond_6
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :pswitch_d
    move-object/from16 v0, p1

    .line 399
    .line 400
    check-cast v0, Li0/b;

    .line 401
    .line 402
    iget-object v2, v0, Li0/b;->b:Lfg/l;

    .line 403
    .line 404
    if-nez v2, :cond_7

    .line 405
    .line 406
    goto :goto_1

    .line 407
    :cond_7
    iget-object v3, v0, Li0/b;->a:Lqg/g;

    .line 408
    .line 409
    if-eqz v3, :cond_8

    .line 410
    .line 411
    :try_start_0
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    goto :goto_0

    .line 420
    :catchall_0
    move-exception v0

    .line 421
    new-instance v2, Lsf/f;

    .line 422
    .line 423
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 424
    .line 425
    .line 426
    move-object v0, v2

    .line 427
    :goto_0
    invoke-virtual {v3, v0}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :cond_8
    :goto_1
    return-object v9

    .line 431
    :pswitch_e
    move-object/from16 v0, p1

    .line 432
    .line 433
    check-cast v0, Ljava/util/Map$Entry;

    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    check-cast v0, Leb/j;

    .line 443
    .line 444
    iget-wide v2, v0, Leb/j;->e:J

    .line 445
    .line 446
    sub-long/2addr v12, v2

    .line 447
    cmp-long v0, v12, v5

    .line 448
    .line 449
    if-lez v0, :cond_9

    .line 450
    .line 451
    move v10, v11

    .line 452
    :cond_9
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    return-object v0

    .line 457
    :pswitch_f
    move-object/from16 v0, p1

    .line 458
    .line 459
    check-cast v0, Ljava/util/Map$Entry;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    check-cast v0, Ljava/lang/Number;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 474
    .line 475
    .line 476
    move-result-wide v2

    .line 477
    sub-long/2addr v12, v2

    .line 478
    const-wide/16 v2, 0xbb8

    .line 479
    .line 480
    cmp-long v0, v12, v2

    .line 481
    .line 482
    if-lez v0, :cond_a

    .line 483
    .line 484
    move v10, v11

    .line 485
    :cond_a
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    return-object v0

    .line 490
    :pswitch_10
    move-object/from16 v0, p1

    .line 491
    .line 492
    check-cast v0, Ljava/util/Map$Entry;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    check-cast v2, Ljava/lang/Number;

    .line 505
    .line 506
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 507
    .line 508
    .line 509
    move-result-wide v2

    .line 510
    sub-long/2addr v12, v2

    .line 511
    sget-object v2, Leb/f;->a:Leb/f;

    .line 512
    .line 513
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    check-cast v0, Ljava/lang/String;

    .line 521
    .line 522
    const-string v2, "msg:"

    .line 523
    .line 524
    invoke-static {v0, v2, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-eqz v0, :cond_b

    .line 529
    .line 530
    const-wide/32 v2, 0xea60

    .line 531
    .line 532
    .line 533
    goto :goto_2

    .line 534
    :cond_b
    const-wide/16 v2, 0x3e8

    .line 535
    .line 536
    :goto_2
    cmp-long v0, v12, v2

    .line 537
    .line 538
    if-lez v0, :cond_c

    .line 539
    .line 540
    move v10, v11

    .line 541
    :cond_c
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    return-object v0

    .line 546
    :pswitch_11
    move-object/from16 v0, p1

    .line 547
    .line 548
    check-cast v0, Ljava/util/Map$Entry;

    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    check-cast v0, Ljava/lang/Number;

    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 563
    .line 564
    .line 565
    move-result-wide v2

    .line 566
    sub-long/2addr v12, v2

    .line 567
    cmp-long v0, v12, v7

    .line 568
    .line 569
    if-lez v0, :cond_d

    .line 570
    .line 571
    move v10, v11

    .line 572
    :cond_d
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    return-object v0

    .line 577
    :pswitch_12
    move-object/from16 v0, p1

    .line 578
    .line 579
    check-cast v0, Ljava/util/Map$Entry;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    check-cast v0, Ljava/lang/Number;

    .line 592
    .line 593
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 594
    .line 595
    .line 596
    move-result-wide v2

    .line 597
    sub-long/2addr v12, v2

    .line 598
    cmp-long v0, v12, v7

    .line 599
    .line 600
    if-lez v0, :cond_e

    .line 601
    .line 602
    move v10, v11

    .line 603
    :cond_e
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    return-object v0

    .line 608
    :pswitch_13
    move-object/from16 v0, p1

    .line 609
    .line 610
    check-cast v0, Ljava/util/Map$Entry;

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    check-cast v0, Le9/i;

    .line 620
    .line 621
    iget-wide v4, v0, Le9/i;->b:J

    .line 622
    .line 623
    sub-long/2addr v12, v4

    .line 624
    cmp-long v0, v12, v2

    .line 625
    .line 626
    if-lez v0, :cond_f

    .line 627
    .line 628
    move v10, v11

    .line 629
    :cond_f
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    return-object v0

    .line 634
    :pswitch_14
    move-object/from16 v0, p1

    .line 635
    .line 636
    check-cast v0, Ljava/lang/String;

    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    if-nez v2, :cond_10

    .line 646
    .line 647
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    if-nez v0, :cond_10

    .line 656
    .line 657
    move v10, v11

    .line 658
    :cond_10
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    return-object v0

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
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
