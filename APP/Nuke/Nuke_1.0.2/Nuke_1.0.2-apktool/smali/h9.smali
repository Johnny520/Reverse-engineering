.class public final synthetic Lh9;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p6, p0, Lh9;->h:I

    iput-object p1, p0, Lh9;->i:Ljava/lang/Object;

    iput-object p2, p0, Lh9;->j:Ljava/lang/Object;

    iput-object p3, p0, Lh9;->k:Ljava/lang/Object;

    iput-object p4, p0, Lh9;->l:Ljava/lang/Object;

    iput-object p5, p0, Lh9;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lv30;Lus1;Lk03;Lt91;Lft2;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lh9;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh9;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lh9;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lh9;->i:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lh9;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lh9;->m:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lh9;->h:I

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    sget-object v6, La83;->a:La83;

    .line 7
    .line 8
    const/4 v7, 0x2

    .line 9
    iget-object v8, v0, Lh9;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v9, v0, Lh9;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v10, v0, Lh9;->i:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v11, v0, Lh9;->k:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, v0, Lh9;->j:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v14, 0x1

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v0, Lv30;

    .line 24
    .line 25
    check-cast v11, Lus1;

    .line 26
    .line 27
    check-cast v10, Lk03;

    .line 28
    .line 29
    check-cast v9, Lt91;

    .line 30
    .line 31
    check-cast v8, Lft2;

    .line 32
    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    check-cast v1, Lt61;

    .line 36
    .line 37
    invoke-virtual {v1}, Lt61;->a()V

    .line 38
    .line 39
    .line 40
    iget-object v15, v1, Lt61;->h:Lsp;

    .line 41
    .line 42
    iget-object v0, v0, Lv30;->c:Ljx1;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljx1;->g()F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/16 v16, 0x20

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    cmpg-float v17, v0, v2

    .line 52
    .line 53
    if-nez v17, :cond_0

    .line 54
    .line 55
    goto/16 :goto_a

    .line 56
    .line 57
    :cond_0
    const-wide v17, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    iget-wide v3, v10, Lk03;->b:J

    .line 63
    .line 64
    sget v10, Lf13;->c:I

    .line 65
    .line 66
    shr-long v3, v3, v16

    .line 67
    .line 68
    long-to-int v3, v3

    .line 69
    invoke-interface {v11, v3}, Lus1;->p(I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v9}, Lt91;->d()Lz03;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    iget-object v2, v4, Lz03;->a:Ly03;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ly03;->c(I)Lo62;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    new-instance v3, Lo62;

    .line 87
    .line 88
    invoke-direct {v3, v2, v2, v2, v2}, Lo62;-><init>(FFFF)V

    .line 89
    .line 90
    .line 91
    move-object v2, v3

    .line 92
    :goto_0
    const/high16 v3, 0x40000000    # 2.0f

    .line 93
    .line 94
    invoke-virtual {v1, v3}, Lt61;->A(F)F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    float-to-double v9, v1

    .line 99
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    .line 100
    .line 101
    .line 102
    move-result-wide v9

    .line 103
    double-to-float v1, v9

    .line 104
    const/high16 v4, 0x3f800000    # 1.0f

    .line 105
    .line 106
    cmpg-float v9, v1, v4

    .line 107
    .line 108
    if-gez v9, :cond_2

    .line 109
    .line 110
    move v1, v4

    .line 111
    :cond_2
    iget v4, v2, Lo62;->a:F

    .line 112
    .line 113
    div-float v3, v1, v3

    .line 114
    .line 115
    add-float/2addr v4, v3

    .line 116
    invoke-interface {v15}, Lnc0;->d()J

    .line 117
    .line 118
    .line 119
    move-result-wide v9

    .line 120
    shr-long v9, v9, v16

    .line 121
    .line 122
    long-to-int v9, v9

    .line 123
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    sub-float/2addr v9, v3

    .line 128
    cmpl-float v10, v4, v9

    .line 129
    .line 130
    if-lez v10, :cond_3

    .line 131
    .line 132
    move v4, v9

    .line 133
    :cond_3
    cmpg-float v9, v4, v3

    .line 134
    .line 135
    if-gez v9, :cond_4

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    move v3, v4

    .line 139
    :goto_1
    float-to-int v4, v1

    .line 140
    rem-int/2addr v4, v7

    .line 141
    if-ne v4, v14, :cond_5

    .line 142
    .line 143
    float-to-double v3, v3

    .line 144
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 145
    .line 146
    .line 147
    move-result-wide v3

    .line 148
    double-to-float v3, v3

    .line 149
    const/high16 v4, 0x3f000000    # 0.5f

    .line 150
    .line 151
    add-float/2addr v3, v4

    .line 152
    goto :goto_2

    .line 153
    :cond_5
    float-to-double v3, v3

    .line 154
    invoke-static {v3, v4}, Ljava/lang/Math;->rint(D)D

    .line 155
    .line 156
    .line 157
    move-result-wide v3

    .line 158
    double-to-float v3, v3

    .line 159
    :goto_2
    iget v4, v2, Lo62;->b:F

    .line 160
    .line 161
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    int-to-long v9, v7

    .line 166
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    int-to-long v12, v4

    .line 171
    shl-long v9, v9, v16

    .line 172
    .line 173
    and-long v11, v12, v17

    .line 174
    .line 175
    or-long v21, v9, v11

    .line 176
    .line 177
    iget v2, v2, Lo62;->d:F

    .line 178
    .line 179
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    int-to-long v3, v3

    .line 184
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    int-to-long v9, v2

    .line 189
    shl-long v2, v3, v16

    .line 190
    .line 191
    and-long v9, v9, v17

    .line 192
    .line 193
    or-long v23, v2, v9

    .line 194
    .line 195
    iget-object v2, v15, Lsp;->h:Lrp;

    .line 196
    .line 197
    iget-object v2, v2, Lrp;->c:Lqp;

    .line 198
    .line 199
    iget-object v3, v15, Lsp;->k:Lq9;

    .line 200
    .line 201
    if-nez v3, :cond_6

    .line 202
    .line 203
    invoke-static {}, Lpp0;->i()Lq9;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-virtual {v3, v14}, Lq9;->r(I)V

    .line 208
    .line 209
    .line 210
    iput-object v3, v15, Lsp;->k:Lq9;

    .line 211
    .line 212
    :cond_6
    iget-object v4, v3, Lq9;->c:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v4, Landroid/graphics/Paint;

    .line 215
    .line 216
    invoke-interface {v15}, Lnc0;->d()J

    .line 217
    .line 218
    .line 219
    move-result-wide v9

    .line 220
    invoke-virtual {v8, v0, v9, v10, v3}, Lft2;->a(FJLq9;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v3, Lq9;->e:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Lcl;

    .line 226
    .line 227
    invoke-static {v0, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_7

    .line 232
    .line 233
    invoke-virtual {v3, v5}, Lq9;->l(Lcl;)V

    .line 234
    .line 235
    .line 236
    :cond_7
    iget v0, v3, Lq9;->b:I

    .line 237
    .line 238
    const/4 v5, 0x3

    .line 239
    if-ne v0, v5, :cond_8

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_8
    invoke-virtual {v3, v5}, Lq9;->j(I)V

    .line 243
    .line 244
    .line 245
    :goto_3
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    cmpg-float v0, v0, v1

    .line 250
    .line 251
    if-nez v0, :cond_9

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_9
    invoke-virtual {v3, v1}, Lq9;->q(F)V

    .line 255
    .line 256
    .line 257
    :goto_4
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    const/high16 v1, 0x40800000    # 4.0f

    .line 262
    .line 263
    cmpg-float v0, v0, v1

    .line 264
    .line 265
    if-nez v0, :cond_a

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_a
    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 269
    .line 270
    .line 271
    :goto_5
    invoke-virtual {v3}, Lq9;->f()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-nez v0, :cond_b

    .line 276
    .line 277
    const/4 v0, 0x0

    .line 278
    goto :goto_6

    .line 279
    :cond_b
    const/4 v0, 0x0

    .line 280
    invoke-virtual {v3, v0}, Lq9;->o(I)V

    .line 281
    .line 282
    .line 283
    :goto_6
    invoke-virtual {v3}, Lq9;->g()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-nez v1, :cond_c

    .line 288
    .line 289
    goto :goto_7

    .line 290
    :cond_c
    invoke-virtual {v3, v0}, Lq9;->p(I)V

    .line 291
    .line 292
    .line 293
    :goto_7
    invoke-virtual {v4}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-ne v0, v14, :cond_d

    .line 298
    .line 299
    :goto_8
    move-object/from16 v20, v2

    .line 300
    .line 301
    move-object/from16 v25, v3

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_d
    invoke-virtual {v3, v14}, Lq9;->m(I)V

    .line 305
    .line 306
    .line 307
    goto :goto_8

    .line 308
    :goto_9
    invoke-interface/range {v20 .. v25}, Lqp;->m(JJLq9;)V

    .line 309
    .line 310
    .line 311
    :goto_a
    return-object v6

    .line 312
    :pswitch_0
    check-cast v10, Lj20;

    .line 313
    .line 314
    move-object v13, v0

    .line 315
    check-cast v13, Lcq1;

    .line 316
    .line 317
    move-object v15, v11

    .line 318
    check-cast v15, Landroid/content/Context;

    .line 319
    .line 320
    move-object/from16 v16, v9

    .line 321
    .line 322
    check-cast v16, Lxk1;

    .line 323
    .line 324
    move-object/from16 v17, v8

    .line 325
    .line 326
    check-cast v17, Lxk1;

    .line 327
    .line 328
    move-object/from16 v0, p1

    .line 329
    .line 330
    check-cast v0, Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    new-instance v12, Lnk2;

    .line 337
    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    invoke-direct/range {v12 .. v18}, Lnk2;-><init>(Lcq1;ZLandroid/content/Context;Lxk1;Lxk1;Lt00;)V

    .line 341
    .line 342
    .line 343
    const/4 v0, 0x3

    .line 344
    invoke-static {v10, v5, v12, v0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 345
    .line 346
    .line 347
    return-object v6

    .line 348
    :pswitch_1
    check-cast v10, Lvn1;

    .line 349
    .line 350
    check-cast v0, Ln4;

    .line 351
    .line 352
    check-cast v11, Lv20;

    .line 353
    .line 354
    check-cast v9, Ldq1;

    .line 355
    .line 356
    check-cast v8, Ljw0;

    .line 357
    .line 358
    move-object/from16 v1, p1

    .line 359
    .line 360
    check-cast v1, Lfs1;

    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    new-instance v2, Lvd2;

    .line 366
    .line 367
    const/16 v3, 0x8

    .line 368
    .line 369
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 370
    .line 371
    .line 372
    const-string v3, "runtimeInfo"

    .line 373
    .line 374
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 375
    .line 376
    .line 377
    new-instance v2, Lvd2;

    .line 378
    .line 379
    const/4 v3, 0x0

    .line 380
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 381
    .line 382
    .line 383
    const-string v3, "hasPermission"

    .line 384
    .line 385
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 386
    .line 387
    .line 388
    new-instance v2, Lvd2;

    .line 389
    .line 390
    invoke-direct {v2, v10, v14}, Lvd2;-><init>(Lvn1;I)V

    .line 391
    .line 392
    .line 393
    const-string v3, "configSnapshot"

    .line 394
    .line 395
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 396
    .line 397
    .line 398
    new-instance v2, Lvd2;

    .line 399
    .line 400
    invoke-direct {v2, v10, v7}, Lvd2;-><init>(Lvn1;I)V

    .line 401
    .line 402
    .line 403
    const-string v3, "log"

    .line 404
    .line 405
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 406
    .line 407
    .line 408
    new-instance v2, Lvd2;

    .line 409
    .line 410
    const/4 v5, 0x3

    .line 411
    invoke-direct {v2, v10, v5}, Lvd2;-><init>(Lvn1;I)V

    .line 412
    .line 413
    .line 414
    const-string v3, "minimumIntervalMillis"

    .line 415
    .line 416
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 417
    .line 418
    .line 419
    new-instance v2, Lvd2;

    .line 420
    .line 421
    const/4 v3, 0x4

    .line 422
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 423
    .line 424
    .line 425
    const-string v3, "maximumActiveTimers"

    .line 426
    .line 427
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 428
    .line 429
    .line 430
    const-string v2, "sleep"

    .line 431
    .line 432
    sget-object v3, Lye2;->a:Lye2;

    .line 433
    .line 434
    invoke-virtual {v1, v2, v3}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 435
    .line 436
    .line 437
    new-instance v2, Lvd2;

    .line 438
    .line 439
    const/4 v3, 0x5

    .line 440
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 441
    .line 442
    .line 443
    const-string v3, "messagingTakeEvent"

    .line 444
    .line 445
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 446
    .line 447
    .line 448
    new-instance v2, Lyd2;

    .line 449
    .line 450
    const/16 v3, 0x9

    .line 451
    .line 452
    invoke-direct {v2, v10, v3}, Lyd2;-><init>(Lvn1;I)V

    .line 453
    .line 454
    .line 455
    const-string v3, "messagingSendMessage"

    .line 456
    .line 457
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 458
    .line 459
    .line 460
    new-instance v2, Lyd2;

    .line 461
    .line 462
    const/4 v3, 0x0

    .line 463
    invoke-direct {v2, v10, v3}, Lyd2;-><init>(Lvn1;I)V

    .line 464
    .line 465
    .line 466
    const-string v3, "messagingDownloadMedia"

    .line 467
    .line 468
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 469
    .line 470
    .line 471
    new-instance v2, Lyd2;

    .line 472
    .line 473
    invoke-direct {v2, v10, v14}, Lyd2;-><init>(Lvn1;I)V

    .line 474
    .line 475
    .line 476
    const-string v3, "hostObjectGet"

    .line 477
    .line 478
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 479
    .line 480
    .line 481
    new-instance v2, Lyd2;

    .line 482
    .line 483
    invoke-direct {v2, v10, v7}, Lyd2;-><init>(Lvn1;I)V

    .line 484
    .line 485
    .line 486
    const-string v3, "hostObjectCall"

    .line 487
    .line 488
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 489
    .line 490
    .line 491
    new-instance v2, Lvd2;

    .line 492
    .line 493
    const/4 v3, 0x6

    .line 494
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 495
    .line 496
    .line 497
    const-string v3, "hostObjectRelease"

    .line 498
    .line 499
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 500
    .line 501
    .line 502
    new-instance v2, Lvd2;

    .line 503
    .line 504
    const/4 v3, 0x7

    .line 505
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 506
    .line 507
    .line 508
    const-string v3, "hostContext"

    .line 509
    .line 510
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 511
    .line 512
    .line 513
    new-instance v2, Lvd2;

    .line 514
    .line 515
    const/16 v3, 0x9

    .line 516
    .line 517
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 518
    .line 519
    .line 520
    const-string v3, "hostClassLoader"

    .line 521
    .line 522
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 523
    .line 524
    .line 525
    new-instance v2, Lvd2;

    .line 526
    .line 527
    const/16 v3, 0xf

    .line 528
    .line 529
    invoke-direct {v2, v10, v3}, Lvd2;-><init>(Lvn1;I)V

    .line 530
    .line 531
    .line 532
    const-string v3, "hostFindClass"

    .line 533
    .line 534
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 535
    .line 536
    .line 537
    new-instance v2, Lyd2;

    .line 538
    .line 539
    const/4 v5, 0x3

    .line 540
    invoke-direct {v2, v10, v5}, Lyd2;-><init>(Lvn1;I)V

    .line 541
    .line 542
    .line 543
    const-string v3, "hostGetStatic"

    .line 544
    .line 545
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 546
    .line 547
    .line 548
    new-instance v2, Lyd2;

    .line 549
    .line 550
    const/4 v3, 0x4

    .line 551
    invoke-direct {v2, v10, v3}, Lyd2;-><init>(Lvn1;I)V

    .line 552
    .line 553
    .line 554
    const-string v3, "hostCallStatic"

    .line 555
    .line 556
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 557
    .line 558
    .line 559
    new-instance v2, Lyd2;

    .line 560
    .line 561
    const/4 v3, 0x5

    .line 562
    invoke-direct {v2, v10, v3}, Lyd2;-><init>(Lvn1;I)V

    .line 563
    .line 564
    .line 565
    const-string v3, "hostConstruct"

    .line 566
    .line 567
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 568
    .line 569
    .line 570
    new-instance v2, Lyd2;

    .line 571
    .line 572
    const/4 v3, 0x6

    .line 573
    invoke-direct {v2, v10, v3}, Lyd2;-><init>(Lvn1;I)V

    .line 574
    .line 575
    .line 576
    const-string v3, "uiToast"

    .line 577
    .line 578
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 579
    .line 580
    .line 581
    new-instance v2, Lyd2;

    .line 582
    .line 583
    const/4 v3, 0x7

    .line 584
    invoke-direct {v2, v10, v3}, Lyd2;-><init>(Lvn1;I)V

    .line 585
    .line 586
    .line 587
    const-string v3, "uiAlert"

    .line 588
    .line 589
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 590
    .line 591
    .line 592
    new-instance v2, Lyd2;

    .line 593
    .line 594
    const/16 v3, 0x8

    .line 595
    .line 596
    invoke-direct {v2, v10, v3}, Lyd2;-><init>(Lvn1;I)V

    .line 597
    .line 598
    .line 599
    const-string v3, "uiConfirm"

    .line 600
    .line 601
    invoke-virtual {v1, v3, v2}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 602
    .line 603
    .line 604
    new-instance v2, Lwd2;

    .line 605
    .line 606
    const/4 v3, 0x0

    .line 607
    invoke-direct {v2, v0, v3}, Lwd2;-><init>(Ln4;I)V

    .line 608
    .line 609
    .line 610
    const-string v3, "encodeUtf8"

    .line 611
    .line 612
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 613
    .line 614
    .line 615
    new-instance v2, Lwd2;

    .line 616
    .line 617
    invoke-direct {v2, v0, v14}, Lwd2;-><init>(Ln4;I)V

    .line 618
    .line 619
    .line 620
    const-string v3, "decodeUtf8"

    .line 621
    .line 622
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 623
    .line 624
    .line 625
    new-instance v2, Lwd2;

    .line 626
    .line 627
    invoke-direct {v2, v0, v7}, Lwd2;-><init>(Ln4;I)V

    .line 628
    .line 629
    .line 630
    const-string v3, "encodeBase64"

    .line 631
    .line 632
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 633
    .line 634
    .line 635
    new-instance v2, Lwd2;

    .line 636
    .line 637
    const/4 v5, 0x3

    .line 638
    invoke-direct {v2, v0, v5}, Lwd2;-><init>(Ln4;I)V

    .line 639
    .line 640
    .line 641
    const-string v3, "decodeBase64"

    .line 642
    .line 643
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 644
    .line 645
    .line 646
    new-instance v2, Lwd2;

    .line 647
    .line 648
    const/4 v3, 0x4

    .line 649
    invoke-direct {v2, v0, v3}, Lwd2;-><init>(Ln4;I)V

    .line 650
    .line 651
    .line 652
    const-string v3, "encodeHex"

    .line 653
    .line 654
    invoke-virtual {v1, v3, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 655
    .line 656
    .line 657
    new-instance v2, Lwd2;

    .line 658
    .line 659
    const/4 v3, 0x5

    .line 660
    invoke-direct {v2, v0, v3}, Lwd2;-><init>(Ln4;I)V

    .line 661
    .line 662
    .line 663
    const-string v0, "decodeHex"

    .line 664
    .line 665
    invoke-virtual {v1, v0, v2}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 666
    .line 667
    .line 668
    new-instance v0, Ltd2;

    .line 669
    .line 670
    invoke-direct {v0, v11, v14}, Ltd2;-><init>(Lv20;I)V

    .line 671
    .line 672
    .line 673
    const-string v2, "randomBytes"

    .line 674
    .line 675
    invoke-virtual {v1, v2, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 676
    .line 677
    .line 678
    new-instance v0, Ltd2;

    .line 679
    .line 680
    const/4 v3, 0x0

    .line 681
    invoke-direct {v0, v11, v3}, Ltd2;-><init>(Lv20;I)V

    .line 682
    .line 683
    .line 684
    const-string v2, "randomUUID"

    .line 685
    .line 686
    invoke-virtual {v1, v2, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 687
    .line 688
    .line 689
    new-instance v0, Lhe2;

    .line 690
    .line 691
    invoke-direct {v0, v11, v3}, Lhe2;-><init>(Lv20;I)V

    .line 692
    .line 693
    .line 694
    const-string v2, "digest"

    .line 695
    .line 696
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 697
    .line 698
    .line 699
    new-instance v0, Lhe2;

    .line 700
    .line 701
    invoke-direct {v0, v11, v14}, Lhe2;-><init>(Lv20;I)V

    .line 702
    .line 703
    .line 704
    const-string v2, "hmac"

    .line 705
    .line 706
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 707
    .line 708
    .line 709
    new-instance v0, Lud2;

    .line 710
    .line 711
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 712
    .line 713
    .line 714
    const-string v2, "timingSafeEqual"

    .line 715
    .line 716
    invoke-virtual {v1, v2, v0}, Lfs1;->b(Ljava/lang/String;Lxn0;)V

    .line 717
    .line 718
    .line 719
    new-instance v0, Lhe2;

    .line 720
    .line 721
    invoke-direct {v0, v11, v7}, Lhe2;-><init>(Lv20;I)V

    .line 722
    .line 723
    .line 724
    const-string v2, "aesGcmEncrypt"

    .line 725
    .line 726
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 727
    .line 728
    .line 729
    new-instance v0, Lhe2;

    .line 730
    .line 731
    const/4 v5, 0x3

    .line 732
    invoke-direct {v0, v11, v5}, Lhe2;-><init>(Lv20;I)V

    .line 733
    .line 734
    .line 735
    const-string v2, "aesGcmDecrypt"

    .line 736
    .line 737
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 738
    .line 739
    .line 740
    new-instance v0, Lhe2;

    .line 741
    .line 742
    const/4 v2, 0x4

    .line 743
    invoke-direct {v0, v11, v2}, Lhe2;-><init>(Lv20;I)V

    .line 744
    .line 745
    .line 746
    const-string v2, "pbkdf2"

    .line 747
    .line 748
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 749
    .line 750
    .line 751
    new-instance v0, Lhe2;

    .line 752
    .line 753
    const/4 v2, 0x5

    .line 754
    invoke-direct {v0, v11, v2}, Lhe2;-><init>(Lv20;I)V

    .line 755
    .line 756
    .line 757
    const-string v2, "hkdf"

    .line 758
    .line 759
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 760
    .line 761
    .line 762
    new-instance v0, Lje2;

    .line 763
    .line 764
    const/4 v3, 0x0

    .line 765
    invoke-direct {v0, v9, v3}, Lje2;-><init>(Ldq1;I)V

    .line 766
    .line 767
    .line 768
    const-string v2, "fsExists"

    .line 769
    .line 770
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 771
    .line 772
    .line 773
    new-instance v0, Lje2;

    .line 774
    .line 775
    invoke-direct {v0, v9, v14}, Lje2;-><init>(Ldq1;I)V

    .line 776
    .line 777
    .line 778
    const-string v2, "fsStat"

    .line 779
    .line 780
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 781
    .line 782
    .line 783
    new-instance v0, Lje2;

    .line 784
    .line 785
    invoke-direct {v0, v9, v7}, Lje2;-><init>(Ldq1;I)V

    .line 786
    .line 787
    .line 788
    const-string v2, "fsList"

    .line 789
    .line 790
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 791
    .line 792
    .line 793
    new-instance v0, Lje2;

    .line 794
    .line 795
    const/4 v5, 0x3

    .line 796
    invoke-direct {v0, v9, v5}, Lje2;-><init>(Ldq1;I)V

    .line 797
    .line 798
    .line 799
    const-string v2, "fsReadBytes"

    .line 800
    .line 801
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 802
    .line 803
    .line 804
    new-instance v0, Lje2;

    .line 805
    .line 806
    const/4 v2, 0x4

    .line 807
    invoke-direct {v0, v9, v2}, Lje2;-><init>(Ldq1;I)V

    .line 808
    .line 809
    .line 810
    const-string v2, "fsReadText"

    .line 811
    .line 812
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 813
    .line 814
    .line 815
    new-instance v0, Lje2;

    .line 816
    .line 817
    const/4 v2, 0x5

    .line 818
    invoke-direct {v0, v9, v2}, Lje2;-><init>(Ldq1;I)V

    .line 819
    .line 820
    .line 821
    const-string v2, "fsWriteBytes"

    .line 822
    .line 823
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 824
    .line 825
    .line 826
    new-instance v0, Lje2;

    .line 827
    .line 828
    const/4 v2, 0x6

    .line 829
    invoke-direct {v0, v9, v2}, Lje2;-><init>(Ldq1;I)V

    .line 830
    .line 831
    .line 832
    const-string v2, "fsWriteText"

    .line 833
    .line 834
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 835
    .line 836
    .line 837
    new-instance v0, Lje2;

    .line 838
    .line 839
    const/4 v2, 0x7

    .line 840
    invoke-direct {v0, v9, v2}, Lje2;-><init>(Ldq1;I)V

    .line 841
    .line 842
    .line 843
    const-string v2, "fsCreateDirectory"

    .line 844
    .line 845
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 846
    .line 847
    .line 848
    new-instance v0, Lje2;

    .line 849
    .line 850
    const/16 v2, 0x8

    .line 851
    .line 852
    invoke-direct {v0, v9, v2}, Lje2;-><init>(Ldq1;I)V

    .line 853
    .line 854
    .line 855
    const-string v2, "fsRemove"

    .line 856
    .line 857
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 858
    .line 859
    .line 860
    new-instance v0, Lje2;

    .line 861
    .line 862
    const/16 v2, 0x9

    .line 863
    .line 864
    invoke-direct {v0, v9, v2}, Lje2;-><init>(Ldq1;I)V

    .line 865
    .line 866
    .line 867
    const-string v2, "fsCopy"

    .line 868
    .line 869
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 870
    .line 871
    .line 872
    new-instance v0, Lje2;

    .line 873
    .line 874
    const/16 v2, 0xa

    .line 875
    .line 876
    invoke-direct {v0, v9, v2}, Lje2;-><init>(Ldq1;I)V

    .line 877
    .line 878
    .line 879
    const-string v2, "fsMove"

    .line 880
    .line 881
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 882
    .line 883
    .line 884
    new-instance v0, Lve2;

    .line 885
    .line 886
    const/4 v3, 0x0

    .line 887
    invoke-direct {v0, v8, v3}, Lve2;-><init>(Ljw0;I)V

    .line 888
    .line 889
    .line 890
    const-string v2, "httpFetch"

    .line 891
    .line 892
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 893
    .line 894
    .line 895
    new-instance v0, Lve2;

    .line 896
    .line 897
    invoke-direct {v0, v8, v14}, Lve2;-><init>(Ljw0;I)V

    .line 898
    .line 899
    .line 900
    const-string v2, "httpDownload"

    .line 901
    .line 902
    invoke-virtual {v1, v2, v0}, Lfs1;->a(Ljava/lang/String;Lug;)V

    .line 903
    .line 904
    .line 905
    return-object v6

    .line 906
    :pswitch_2
    const/4 v3, 0x0

    .line 907
    const/16 v16, 0x20

    .line 908
    .line 909
    const-wide v17, 0xffffffffL

    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    check-cast v10, Lsi1;

    .line 915
    .line 916
    check-cast v0, Lo72;

    .line 917
    .line 918
    check-cast v11, Lz62;

    .line 919
    .line 920
    check-cast v9, Lim2;

    .line 921
    .line 922
    check-cast v8, Ly62;

    .line 923
    .line 924
    move-object/from16 v1, p1

    .line 925
    .line 926
    check-cast v1, Ljava/lang/Float;

    .line 927
    .line 928
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 929
    .line 930
    .line 931
    move-result v1

    .line 932
    iget-object v2, v10, Lsi1;->g:Ljn;

    .line 933
    .line 934
    invoke-static {v2}, Lsi1;->g(Ljn;)Loi1;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    if-eqz v2, :cond_e

    .line 939
    .line 940
    iget-object v4, v10, Lio1;->e:Lsz0;

    .line 941
    .line 942
    iget-wide v5, v2, Loi1;->b:J

    .line 943
    .line 944
    iget-wide v12, v2, Loi1;->a:J

    .line 945
    .line 946
    iget-object v7, v4, Lsz0;->i:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v7, Lbb2;

    .line 949
    .line 950
    move/from16 v19, v14

    .line 951
    .line 952
    shr-long v14, v12, v16

    .line 953
    .line 954
    long-to-int v10, v14

    .line 955
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 956
    .line 957
    .line 958
    move-result v10

    .line 959
    invoke-virtual {v7, v10, v5, v6}, Lbb2;->a(FJ)V

    .line 960
    .line 961
    .line 962
    iget-object v4, v4, Lsz0;->j:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast v4, Lbb2;

    .line 965
    .line 966
    and-long v12, v12, v17

    .line 967
    .line 968
    long-to-int v7, v12

    .line 969
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 970
    .line 971
    .line 972
    move-result v7

    .line 973
    invoke-virtual {v4, v7, v5, v6}, Lbb2;->a(FJ)V

    .line 974
    .line 975
    .line 976
    iget-object v4, v0, Lo72;->i:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v4, Loi1;

    .line 979
    .line 980
    invoke-virtual {v4, v2}, Loi1;->a(Loi1;)Loi1;

    .line 981
    .line 982
    .line 983
    move-result-object v4

    .line 984
    iput-object v4, v0, Lo72;->i:Ljava/lang/Object;

    .line 985
    .line 986
    iget-wide v4, v4, Loi1;->a:J

    .line 987
    .line 988
    invoke-virtual {v9, v4, v5}, Lim2;->e(J)J

    .line 989
    .line 990
    .line 991
    move-result-wide v4

    .line 992
    invoke-virtual {v9, v4, v5}, Lim2;->i(J)F

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    iput v0, v11, Lz62;->h:F

    .line 997
    .line 998
    sub-float/2addr v0, v1

    .line 999
    invoke-static {v0}, Lrp0;->S(F)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v0

    .line 1003
    xor-int/lit8 v0, v0, 0x1

    .line 1004
    .line 1005
    iput-boolean v0, v8, Ly62;->h:Z

    .line 1006
    .line 1007
    goto :goto_b

    .line 1008
    :cond_e
    move/from16 v19, v14

    .line 1009
    .line 1010
    :goto_b
    if-eqz v2, :cond_f

    .line 1011
    .line 1012
    move/from16 v13, v19

    .line 1013
    .line 1014
    goto :goto_c

    .line 1015
    :cond_f
    move v13, v3

    .line 1016
    :goto_c
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    return-object v0

    .line 1021
    :pswitch_3
    move/from16 v19, v14

    .line 1022
    .line 1023
    check-cast v10, Ljava/util/List;

    .line 1024
    .line 1025
    check-cast v0, Lwm0;

    .line 1026
    .line 1027
    check-cast v11, Landroid/view/View;

    .line 1028
    .line 1029
    check-cast v9, Lrs2;

    .line 1030
    .line 1031
    move-object v12, v8

    .line 1032
    check-cast v12, Lmn0;

    .line 1033
    .line 1034
    move-object/from16 v1, p1

    .line 1035
    .line 1036
    check-cast v1, Ls81;

    .line 1037
    .line 1038
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1039
    .line 1040
    .line 1041
    new-instance v7, Lfr1;

    .line 1042
    .line 1043
    const/4 v13, 0x1

    .line 1044
    move-object v8, v10

    .line 1045
    move-object v10, v11

    .line 1046
    move-object v11, v9

    .line 1047
    move-object v9, v0

    .line 1048
    invoke-direct/range {v7 .. v13}, Lfr1;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lun0;I)V

    .line 1049
    .line 1050
    .line 1051
    new-instance v0, Lkw;

    .line 1052
    .line 1053
    const v2, 0x15e6ef4c

    .line 1054
    .line 1055
    .line 1056
    move/from16 v3, v19

    .line 1057
    .line 1058
    invoke-direct {v0, v2, v3, v7}, Lkw;-><init>(IZLun0;)V

    .line 1059
    .line 1060
    .line 1061
    const/4 v2, 0x3

    .line 1062
    invoke-static {v1, v5, v0, v2}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 1063
    .line 1064
    .line 1065
    return-object v6

    .line 1066
    :pswitch_4
    check-cast v10, Lk03;

    .line 1067
    .line 1068
    check-cast v0, Ll9;

    .line 1069
    .line 1070
    check-cast v11, Lxx0;

    .line 1071
    .line 1072
    check-cast v9, Lm0;

    .line 1073
    .line 1074
    check-cast v8, Lin0;

    .line 1075
    .line 1076
    move-object/from16 v1, p1

    .line 1077
    .line 1078
    check-cast v1, Lu91;

    .line 1079
    .line 1080
    iget-object v0, v0, Ll9;->a:Lm91;

    .line 1081
    .line 1082
    iput-object v10, v1, Lu91;->h:Lk03;

    .line 1083
    .line 1084
    iput-object v11, v1, Lu91;->i:Lxx0;

    .line 1085
    .line 1086
    iput-object v9, v1, Lu91;->c:Lin0;

    .line 1087
    .line 1088
    iput-object v8, v1, Lu91;->d:Lin0;

    .line 1089
    .line 1090
    if-eqz v0, :cond_10

    .line 1091
    .line 1092
    iget-object v2, v0, Lm91;->w:Lt91;

    .line 1093
    .line 1094
    goto :goto_d

    .line 1095
    :cond_10
    move-object v2, v5

    .line 1096
    :goto_d
    iput-object v2, v1, Lu91;->e:Lt91;

    .line 1097
    .line 1098
    if-eqz v0, :cond_11

    .line 1099
    .line 1100
    iget-object v2, v0, Lm91;->x:Lb03;

    .line 1101
    .line 1102
    goto :goto_e

    .line 1103
    :cond_11
    move-object v2, v5

    .line 1104
    :goto_e
    iput-object v2, v1, Lu91;->f:Lb03;

    .line 1105
    .line 1106
    if-eqz v0, :cond_12

    .line 1107
    .line 1108
    sget-object v2, Lly;->t:Ltu2;

    .line 1109
    .line 1110
    invoke-static {v0, v2}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    move-object v5, v0

    .line 1115
    check-cast v5, Lza3;

    .line 1116
    .line 1117
    :cond_12
    iput-object v5, v1, Lu91;->g:Lza3;

    .line 1118
    .line 1119
    return-object v6

    .line 1120
    nop

    .line 1121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
