.class public final synthetic Lvi1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lvi1;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lvi1;->h:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x5

    .line 7
    const-string v3, "onGYNetEnd"

    .line 8
    .line 9
    const-string v4, "com.tencent.mm.plugin.luckymoney.model"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const-string v6, "["

    .line 13
    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x6

    .line 16
    const-string v9, "NukeCore"

    .line 17
    .line 18
    const/16 v11, 0x2d

    .line 19
    .line 20
    const/16 v12, 0x96

    .line 21
    .line 22
    const/16 v13, 0xd2

    .line 23
    .line 24
    const/16 v14, 0x6e

    .line 25
    .line 26
    const p0, 0x3f70a3d7    # 0.94f

    .line 27
    .line 28
    .line 29
    const/16 v10, 0x12c

    .line 30
    .line 31
    const-string v16, "com.tencent.mm.storage"

    .line 32
    .line 33
    const-string v17, "com.tencent.mm.ui.chatting.viewitems"

    .line 34
    .line 35
    const/16 v18, 0x0

    .line 36
    .line 37
    const/high16 v19, 0x3f800000    # 1.0f

    .line 38
    .line 39
    const v20, 0x3f6b851f    # 0.92f

    .line 40
    .line 41
    .line 42
    const/4 v15, 0x0

    .line 43
    sget-object v21, La83;->a:La83;

    .line 44
    .line 45
    packed-switch v0, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    move-object/from16 v0, p1

    .line 49
    .line 50
    check-cast v0, Ld31;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iput-boolean v15, v0, Ld31;->c:Z

    .line 56
    .line 57
    return-object v21

    .line 58
    :pswitch_0
    move-object/from16 v0, p1

    .line 59
    .line 60
    check-cast v0, Lp51;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput v10, v0, Lp51;->a:I

    .line 66
    .line 67
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1, v15}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 72
    .line 73
    .line 74
    const v1, 0x3f851eb8    # 1.04f

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, v1, v14}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 82
    .line 83
    .line 84
    const v1, 0x3f7d70a4    # 0.99f

    .line 85
    .line 86
    .line 87
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1, v13}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 92
    .line 93
    .line 94
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1, v10}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 99
    .line 100
    .line 101
    return-object v21

    .line 102
    :pswitch_1
    move-object/from16 v0, p1

    .line 103
    .line 104
    check-cast v0, Lp51;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iput v12, v0, Lp51;->a:I

    .line 110
    .line 111
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v1, v15}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 116
    .line 117
    .line 118
    const v1, 0x3f818937    # 1.012f

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, v1, v11}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 126
    .line 127
    .line 128
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v0, v1, v12}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 133
    .line 134
    .line 135
    return-object v21

    .line 136
    :pswitch_2
    move-object/from16 v0, p1

    .line 137
    .line 138
    check-cast v0, Lp51;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iput v10, v0, Lp51;->a:I

    .line 144
    .line 145
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v0, v1, v15}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 150
    .line 151
    .line 152
    const v1, 0x3f833333    # 1.025f

    .line 153
    .line 154
    .line 155
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v0, v1, v14}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 160
    .line 161
    .line 162
    const v1, 0x3f7eb852    # 0.995f

    .line 163
    .line 164
    .line 165
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v0, v1, v13}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 170
    .line 171
    .line 172
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v0, v1, v10}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 177
    .line 178
    .line 179
    return-object v21

    .line 180
    :pswitch_3
    move-object/from16 v0, p1

    .line 181
    .line 182
    check-cast v0, Lp51;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    const/16 v1, 0xa0

    .line 188
    .line 189
    iput v1, v0, Lp51;->a:I

    .line 190
    .line 191
    const/4 v2, 0x0

    .line 192
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v0, v2, v15}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 197
    .line 198
    .line 199
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v3, 0x50

    .line 204
    .line 205
    invoke-virtual {v0, v2, v3}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v2, v1}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 209
    .line 210
    .line 211
    return-object v21

    .line 212
    :pswitch_4
    move-object/from16 v0, p1

    .line 213
    .line 214
    check-cast v0, Lp51;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iput v12, v0, Lp51;->a:I

    .line 220
    .line 221
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v0, v1, v15}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 226
    .line 227
    .line 228
    const v1, 0x3f824dd3    # 1.018f

    .line 229
    .line 230
    .line 231
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v0, v1, v11}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 236
    .line 237
    .line 238
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v0, v1, v12}, Lp51;->a(Ljava/lang/Float;I)Lo51;

    .line 243
    .line 244
    .line 245
    return-object v21

    .line 246
    :pswitch_5
    move-object/from16 v0, p1

    .line 247
    .line 248
    check-cast v0, Ljg3;

    .line 249
    .line 250
    const-string v1, "[NukeCore]"

    .line 251
    .line 252
    sget-object v2, Lpp1;->a:Lpp1;

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljg3;->a()[Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    aget-object v0, v0, v15

    .line 262
    .line 263
    check-cast v0, Landroid/app/Application;

    .line 264
    .line 265
    if-nez v0, :cond_0

    .line 266
    .line 267
    goto/16 :goto_4

    .line 268
    .line 269
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    if-nez v2, :cond_1

    .line 274
    .line 275
    move-object v2, v0

    .line 276
    :cond_1
    sput-object v2, Lup0;->i:Landroid/content/Context;

    .line 277
    .line 278
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    sput-object v2, Lup0;->j:Ljava/lang/ClassLoader;

    .line 286
    .line 287
    sget-object v2, Lup0;->l:Ljava/lang/String;

    .line 288
    .line 289
    const-string v3, "moduleApkPath"

    .line 290
    .line 291
    if-eqz v2, :cond_6

    .line 292
    .line 293
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {v4, v2}, Llg3;->b(Landroid/content/res/Resources;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :try_start_0
    sget-object v2, Lup0;->l:Ljava/lang/String;

    .line 304
    .line 305
    if-eqz v2, :cond_2

    .line 306
    .line 307
    invoke-static {v0}, Lc5;->a(Landroid/app/Application;)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v2, v21

    .line 311
    .line 312
    goto :goto_1

    .line 313
    :catchall_0
    move-exception v0

    .line 314
    goto :goto_0

    .line 315
    :cond_2
    invoke-static {v3}, Lt11;->S(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 319
    :goto_0
    new-instance v2, Lx92;

    .line 320
    .line 321
    invoke-direct {v2, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    :goto_1
    invoke-static {v2}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-eqz v0, :cond_3

    .line 329
    .line 330
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    const-string v2, "Install ProxyInstrumentation failed; Activity.onResume fallback remains active: "

    .line 335
    .line 336
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 357
    .line 358
    .line 359
    move-object/from16 v1, v21

    .line 360
    .line 361
    goto :goto_2

    .line 362
    :catchall_1
    move-exception v0

    .line 363
    new-instance v1, Lx92;

    .line 364
    .line 365
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    :goto_2
    instance-of v0, v1, Lx92;

    .line 369
    .line 370
    if-eqz v0, :cond_3

    .line 371
    .line 372
    invoke-static {v8, v9, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    :cond_3
    invoke-static {}, Lpp1;->a()[Lvj;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    sget-object v1, Laq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 380
    .line 381
    invoke-static {}, Lpp1;->c()Lop1;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-static {}, Lpp1;->b()Lop1;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-static {v1, v2, v0}, Laq1;->a(Lop1;Lop1;[Lvj;)V

    .line 399
    .line 400
    .line 401
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-static {v1}, Lte;->S(Lvu0;)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_4

    .line 410
    .line 411
    invoke-static {v0}, Lpp1;->i([Lvj;)V

    .line 412
    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_4
    :try_start_2
    const-string v0, "[NukeCore]Defer dex analysis until runtime entry Activity is ready"

    .line 416
    .line 417
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 418
    .line 419
    .line 420
    move-object/from16 v1, v21

    .line 421
    .line 422
    goto :goto_3

    .line 423
    :catchall_2
    move-exception v0

    .line 424
    new-instance v1, Lx92;

    .line 425
    .line 426
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 427
    .line 428
    .line 429
    :goto_3
    instance-of v0, v1, Lx92;

    .line 430
    .line 431
    if-eqz v0, :cond_5

    .line 432
    .line 433
    const-string v0, "Defer dex analysis until runtime entry Activity is ready"

    .line 434
    .line 435
    invoke-static {v7, v9, v0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 436
    .line 437
    .line 438
    :cond_5
    :goto_4
    return-object v21

    .line 439
    :cond_6
    invoke-static {v3}, Lt11;->S(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v18

    .line 443
    :pswitch_6
    move-object/from16 v0, p1

    .line 444
    .line 445
    check-cast v0, Ljg3;

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Ljg3;->a()[Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    aget-object v0, v0, v15

    .line 455
    .line 456
    check-cast v0, Landroid/app/Application;

    .line 457
    .line 458
    if-nez v0, :cond_7

    .line 459
    .line 460
    goto/16 :goto_9

    .line 461
    .line 462
    :cond_7
    sget-object v1, Lpp1;->a:Lpp1;

    .line 463
    .line 464
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    if-nez v1, :cond_8

    .line 469
    .line 470
    move-object v1, v0

    .line 471
    :cond_8
    sput-object v1, Lup0;->i:Landroid/content/Context;

    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    sput-object v0, Lup0;->j:Ljava/lang/ClassLoader;

    .line 481
    .line 482
    invoke-static {}, Lpp1;->a()[Lvj;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    const-string v1, "]"

    .line 487
    .line 488
    sget-object v2, Lpp1;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 489
    .line 490
    invoke-virtual {v2, v15, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-nez v2, :cond_9

    .line 495
    .line 496
    goto/16 :goto_9

    .line 497
    .line 498
    :cond_9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 499
    .line 500
    .line 501
    :try_start_3
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-static {v2}, Lte;->S(Lvu0;)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eqz v2, :cond_b

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-static {}, Lpp1;->f()Z

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    array-length v3, v0

    .line 519
    :goto_5
    if-ge v15, v3, :cond_c

    .line 520
    .line 521
    aget-object v4, v0, v15

    .line 522
    .line 523
    instance-of v5, v4, Ltb1;

    .line 524
    .line 525
    if-nez v5, :cond_a

    .line 526
    .line 527
    invoke-virtual {v4}, Lvj;->c()Z

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    if-eqz v5, :cond_a

    .line 532
    .line 533
    invoke-static {v4, v2}, Lop0;->q(Lvj;Z)V

    .line 534
    .line 535
    .line 536
    :cond_a
    add-int/lit8 v15, v15, 0x1

    .line 537
    .line 538
    goto :goto_5

    .line 539
    :cond_b
    const-string v2, "Skip early hook installation: dex cache is invalid"
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 540
    .line 541
    :try_start_4
    const-string v0, "[NukeCore]Skip early hook installation: dex cache is invalid"

    .line 542
    .line 543
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 544
    .line 545
    .line 546
    move-object/from16 v3, v21

    .line 547
    .line 548
    goto :goto_6

    .line 549
    :catchall_3
    move-exception v0

    .line 550
    :try_start_5
    new-instance v3, Lx92;

    .line 551
    .line 552
    invoke-direct {v3, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 553
    .line 554
    .line 555
    :goto_6
    instance-of v0, v3, Lx92;

    .line 556
    .line 557
    if-eqz v0, :cond_c

    .line 558
    .line 559
    invoke-static {v7, v9, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 560
    .line 561
    .line 562
    :cond_c
    move-object/from16 v2, v21

    .line 563
    .line 564
    goto :goto_7

    .line 565
    :catchall_4
    move-exception v0

    .line 566
    new-instance v2, Lx92;

    .line 567
    .line 568
    invoke-direct {v2, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 569
    .line 570
    .line 571
    :goto_7
    invoke-static {v2}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    if-eqz v0, :cond_d

    .line 576
    .line 577
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    const-string v2, "Early hook installation failed: "

    .line 582
    .line 583
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 592
    .line 593
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 610
    .line 611
    .line 612
    move-object/from16 v1, v21

    .line 613
    .line 614
    goto :goto_8

    .line 615
    :catchall_5
    move-exception v0

    .line 616
    new-instance v1, Lx92;

    .line 617
    .line 618
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 619
    .line 620
    .line 621
    :goto_8
    instance-of v0, v1, Lx92;

    .line 622
    .line 623
    if-eqz v0, :cond_d

    .line 624
    .line 625
    invoke-static {v8, v9, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 626
    .line 627
    .line 628
    :cond_d
    :goto_9
    return-object v21

    .line 629
    :pswitch_7
    move-object/from16 v0, p1

    .line 630
    .line 631
    check-cast v0, Ljg3;

    .line 632
    .line 633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    sget-object v1, Lpp1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 637
    .line 638
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    if-eqz v1, :cond_e

    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_e
    iget-object v0, v0, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 646
    .line 647
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 648
    .line 649
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    check-cast v0, Landroid/app/Activity;

    .line 653
    .line 654
    invoke-static {v0}, Lpp1;->g(Landroid/app/Activity;)V

    .line 655
    .line 656
    .line 657
    :goto_a
    return-object v21

    .line 658
    :pswitch_8
    move-object/from16 v0, p1

    .line 659
    .line 660
    check-cast v0, Ld31;

    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    iput-boolean v5, v0, Ld31;->b:Z

    .line 666
    .line 667
    return-object v21

    .line 668
    :pswitch_9
    move-object/from16 v0, p1

    .line 669
    .line 670
    check-cast v0, Lzn2;

    .line 671
    .line 672
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    return-object v21

    .line 676
    :pswitch_a
    move-object/from16 v0, p1

    .line 677
    .line 678
    check-cast v0, Lqn1;

    .line 679
    .line 680
    iget-object v0, v0, Lqn1;->a:Lea;

    .line 681
    .line 682
    if-eqz v0, :cond_f

    .line 683
    .line 684
    invoke-virtual {v0}, Lea;->a()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    :cond_f
    return-object v21

    .line 688
    :pswitch_b
    move-object/from16 v0, p1

    .line 689
    .line 690
    check-cast v0, Lcj0;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    const-string v1, "com.tencent.mm.modelsimple"

    .line 696
    .line 697
    filled-new-array {v1}, [Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    iput-object v1, v0, Lcj0;->t:Ljava/util/List;

    .line 706
    .line 707
    new-instance v1, Lat;

    .line 708
    .line 709
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 710
    .line 711
    .line 712
    const-string v2, "null cannot be cast to non-null type com.tencent.mm.protocal.MMTypingSend.Req"

    .line 713
    .line 714
    filled-new-array {v2}, [Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 722
    .line 723
    return-object v21

    .line 724
    :pswitch_c
    move-object/from16 v0, p1

    .line 725
    .line 726
    check-cast v0, Lcj0;

    .line 727
    .line 728
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    const-string v1, "com.tencent.mm.plugin.remittance.model"

    .line 732
    .line 733
    filled-new-array {v1}, [Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    iput-object v1, v0, Lcj0;->t:Ljava/util/List;

    .line 742
    .line 743
    new-instance v1, Lat;

    .line 744
    .line 745
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 746
    .line 747
    .line 748
    const-string v2, "/cgi-bin/mmpay-bin/transferoperation"

    .line 749
    .line 750
    const-string v3, "account click info , key is %s, value is %s"

    .line 751
    .line 752
    const-string v4, "Micromsg.NetSceneTenpayRemittanceConfirm"

    .line 753
    .line 754
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 762
    .line 763
    return-object v21

    .line 764
    :pswitch_d
    move-object/from16 v0, p1

    .line 765
    .line 766
    check-cast v0, Lcj0;

    .line 767
    .line 768
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 769
    .line 770
    .line 771
    new-instance v1, Lat;

    .line 772
    .line 773
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 774
    .line 775
    .line 776
    const-string v2, "MicroMsg.NetSceneSendMsg"

    .line 777
    .line 778
    const-string v3, "send msg fail ret = %s MsgId=%s MsgSource=%s"

    .line 779
    .line 780
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 788
    .line 789
    return-object v21

    .line 790
    :pswitch_e
    move-object/from16 v0, p1

    .line 791
    .line 792
    check-cast v0, Ldj0;

    .line 793
    .line 794
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    filled-new-array {v4}, [Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    iput-object v1, v0, Ldj0;->t:Ljava/util/List;

    .line 806
    .line 807
    new-instance v1, Lvi1;

    .line 808
    .line 809
    const/16 v2, 0xd

    .line 810
    .line 811
    invoke-direct {v1, v2}, Lvi1;-><init>(I)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0, v1}, Ldj0;->c0(Lin0;)V

    .line 815
    .line 816
    .line 817
    return-object v21

    .line 818
    :pswitch_f
    move-object/from16 v0, p1

    .line 819
    .line 820
    check-cast v0, Lyg1;

    .line 821
    .line 822
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    new-instance v4, Llv2;

    .line 826
    .line 827
    invoke-direct {v4, v3, v2}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 828
    .line 829
    .line 830
    iput-object v4, v0, Lyg1;->t:Llv2;

    .line 831
    .line 832
    invoke-virtual {v0, v1}, Lyg1;->d0(I)V

    .line 833
    .line 834
    .line 835
    new-instance v1, Lat;

    .line 836
    .line 837
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 838
    .line 839
    .line 840
    const-string v2, "MicroMsg.NetSceneReceiveLuckyMoney"

    .line 841
    .line 842
    const-string v3, "/cgi-bin/mmpay-bin/receivewxhb"

    .line 843
    .line 844
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    iput-object v1, v0, Lyg1;->v:Lat;

    .line 852
    .line 853
    return-object v21

    .line 854
    :pswitch_10
    move-object/from16 v0, p1

    .line 855
    .line 856
    check-cast v0, Lcj0;

    .line 857
    .line 858
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    const-string v1, "com.tencent.mm.modelbase"

    .line 862
    .line 863
    filled-new-array {v1}, [Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    iput-object v1, v0, Lcj0;->t:Ljava/util/List;

    .line 872
    .line 873
    new-instance v1, Lat;

    .line 874
    .line 875
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 876
    .line 877
    .line 878
    const-string v2, "reset::cancel scene"

    .line 879
    .line 880
    const-string v3, "clearRunningQueue"

    .line 881
    .line 882
    const-string v4, "MicroMsg.NetSceneQueue"

    .line 883
    .line 884
    const-string v5, "doScene failed"

    .line 885
    .line 886
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 894
    .line 895
    return-object v21

    .line 896
    :pswitch_11
    move-object/from16 v0, p1

    .line 897
    .line 898
    check-cast v0, Ldj0;

    .line 899
    .line 900
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    filled-new-array {v4}, [Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 908
    .line 909
    .line 910
    move-result-object v1

    .line 911
    iput-object v1, v0, Ldj0;->t:Ljava/util/List;

    .line 912
    .line 913
    new-instance v1, Lvi1;

    .line 914
    .line 915
    const/16 v2, 0xa

    .line 916
    .line 917
    invoke-direct {v1, v2}, Lvi1;-><init>(I)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v0, v1}, Ldj0;->c0(Lin0;)V

    .line 921
    .line 922
    .line 923
    return-object v21

    .line 924
    :pswitch_12
    move-object/from16 v0, p1

    .line 925
    .line 926
    check-cast v0, Lyg1;

    .line 927
    .line 928
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    new-instance v4, Llv2;

    .line 932
    .line 933
    invoke-direct {v4, v3, v2}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 934
    .line 935
    .line 936
    iput-object v4, v0, Lyg1;->t:Llv2;

    .line 937
    .line 938
    invoke-virtual {v0, v1}, Lyg1;->d0(I)V

    .line 939
    .line 940
    .line 941
    new-instance v1, Lat;

    .line 942
    .line 943
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 944
    .line 945
    .line 946
    const-string v2, "MicroMsg.NetSceneOpenLuckyMoney"

    .line 947
    .line 948
    const-string v3, "/cgi-bin/mmpay-bin/openwxhb"

    .line 949
    .line 950
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v2

    .line 954
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    iput-object v1, v0, Lyg1;->v:Lat;

    .line 958
    .line 959
    return-object v21

    .line 960
    :pswitch_13
    move-object/from16 v0, p1

    .line 961
    .line 962
    check-cast v0, Lcj0;

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    const-string v1, "com.tencent.mm.vfs"

    .line 968
    .line 969
    filled-new-array {v1}, [Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v1

    .line 973
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    iput-object v1, v0, Lcj0;->t:Ljava/util/List;

    .line 978
    .line 979
    new-instance v1, Lat;

    .line 980
    .line 981
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 982
    .line 983
    .line 984
    const-string v2, "Base directory exists but is not a directory,"

    .line 985
    .line 986
    filled-new-array {v2}, [Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 994
    .line 995
    return-object v21

    .line 996
    :pswitch_14
    move-object/from16 v0, p1

    .line 997
    .line 998
    check-cast v0, Lrw1;

    .line 999
    .line 1000
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1003
    .line 1004
    .line 1005
    iget v2, v0, Lrw1;->b:I

    .line 1006
    .line 1007
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    const-string v2, ", "

    .line 1011
    .line 1012
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1013
    .line 1014
    .line 1015
    iget v0, v0, Lrw1;->c:I

    .line 1016
    .line 1017
    const/16 v2, 0x29

    .line 1018
    .line 1019
    invoke-static {v1, v0, v2}, Lvi0;->m(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    return-object v0

    .line 1024
    :pswitch_15
    move-object/from16 v0, p1

    .line 1025
    .line 1026
    check-cast v0, Ldj0;

    .line 1027
    .line 1028
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    filled-new-array/range {v17 .. v17}, [Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    iput-object v1, v0, Ldj0;->t:Ljava/util/List;

    .line 1040
    .line 1041
    new-instance v1, Lyg1;

    .line 1042
    .line 1043
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1044
    .line 1045
    .line 1046
    const-string v2, "context item select failed, null dataTag"

    .line 1047
    .line 1048
    const-string v3, "MicroMsg.ChattingItem"

    .line 1049
    .line 1050
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    invoke-virtual {v1, v2}, Lyg1;->j0([Ljava/lang/String;)V

    .line 1055
    .line 1056
    .line 1057
    iput-object v1, v0, Ldj0;->u:Lyg1;

    .line 1058
    .line 1059
    return-object v21

    .line 1060
    :pswitch_16
    move-object/from16 v0, p1

    .line 1061
    .line 1062
    check-cast v0, Ldj0;

    .line 1063
    .line 1064
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1065
    .line 1066
    .line 1067
    filled-new-array/range {v17 .. v17}, [Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    iput-object v1, v0, Ldj0;->t:Ljava/util/List;

    .line 1076
    .line 1077
    new-instance v1, Lyg1;

    .line 1078
    .line 1079
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1080
    .line 1081
    .line 1082
    const-string v2, "MicroMsg.ChattingItem"

    .line 1083
    .line 1084
    const-string v3, "on create context menu, match qcontact or tcontact, remove favorite menu item"

    .line 1085
    .line 1086
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v2

    .line 1090
    invoke-virtual {v1, v2}, Lyg1;->j0([Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    iput-object v1, v0, Ldj0;->u:Lyg1;

    .line 1094
    .line 1095
    return-object v21

    .line 1096
    :pswitch_17
    move-object/from16 v0, p1

    .line 1097
    .line 1098
    check-cast v0, Lcj0;

    .line 1099
    .line 1100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v1

    .line 1107
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    iput-object v1, v0, Lcj0;->t:Ljava/util/List;

    .line 1112
    .line 1113
    new-instance v1, Lat;

    .line 1114
    .line 1115
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1116
    .line 1117
    .line 1118
    const-string v2, "set msg status fail, msgId:%d, type:%d, userName:%s %s"

    .line 1119
    .line 1120
    filled-new-array {v2}, [Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v2

    .line 1124
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 1125
    .line 1126
    .line 1127
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 1128
    .line 1129
    return-object v21

    .line 1130
    :pswitch_18
    move-object/from16 v0, p1

    .line 1131
    .line 1132
    check-cast v0, Lcj0;

    .line 1133
    .line 1134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1135
    .line 1136
    .line 1137
    filled-new-array/range {v17 .. v17}, [Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    iput-object v1, v0, Lcj0;->t:Ljava/util/List;

    .line 1146
    .line 1147
    new-instance v1, Lat;

    .line 1148
    .line 1149
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1150
    .line 1151
    .line 1152
    const-string v2, "ItemDataTag"

    .line 1153
    .line 1154
    const-string v3, "getCurrentMsg2 err"

    .line 1155
    .line 1156
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 1164
    .line 1165
    return-object v21

    .line 1166
    :pswitch_19
    move-object/from16 v0, p1

    .line 1167
    .line 1168
    check-cast v0, Ljg3;

    .line 1169
    .line 1170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1171
    .line 1172
    .line 1173
    iget-object v1, v0, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 1174
    .line 1175
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1176
    .line 1177
    if-nez v1, :cond_10

    .line 1178
    .line 1179
    goto :goto_c

    .line 1180
    :cond_10
    invoke-virtual {v0}, Ljg3;->a()[Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    aget-object v0, v0, v15

    .line 1185
    .line 1186
    instance-of v1, v0, Landroid/view/MenuItem;

    .line 1187
    .line 1188
    if-eqz v1, :cond_11

    .line 1189
    .line 1190
    check-cast v0, Landroid/view/MenuItem;

    .line 1191
    .line 1192
    goto :goto_b

    .line 1193
    :cond_11
    move-object/from16 v0, v18

    .line 1194
    .line 1195
    :goto_b
    if-nez v0, :cond_12

    .line 1196
    .line 1197
    goto :goto_c

    .line 1198
    :cond_12
    sget-object v1, Ljd3;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1199
    .line 1200
    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    .line 1201
    .line 1202
    .line 1203
    sget-object v0, Ljd3;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1204
    .line 1205
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v1

    .line 1213
    if-nez v1, :cond_13

    .line 1214
    .line 1215
    :goto_c
    move-object/from16 v18, v21

    .line 1216
    .line 1217
    goto :goto_d

    .line 1218
    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1223
    .line 1224
    .line 1225
    invoke-static {}, Lc80;->g()V

    .line 1226
    .line 1227
    .line 1228
    :goto_d
    return-object v18

    .line 1229
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1230
    .line 1231
    check-cast v0, Ljg3;

    .line 1232
    .line 1233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v0}, Ljg3;->a()[Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    aget-object v0, v0, v15

    .line 1241
    .line 1242
    if-nez v0, :cond_14

    .line 1243
    .line 1244
    goto :goto_10

    .line 1245
    :cond_14
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    const-class v1, Ljava/lang/Integer;

    .line 1254
    .line 1255
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v2

    .line 1259
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v2

    .line 1263
    if-nez v2, :cond_15

    .line 1264
    .line 1265
    move-object v2, v1

    .line 1266
    :cond_15
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    invoke-static {v3}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v3

    .line 1274
    if-nez v3, :cond_16

    .line 1275
    .line 1276
    move-object v3, v1

    .line 1277
    :cond_16
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v4

    .line 1281
    invoke-static {v4}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v4

    .line 1285
    if-nez v4, :cond_17

    .line 1286
    .line 1287
    move-object v4, v1

    .line 1288
    :cond_17
    const-class v5, Ljava/lang/CharSequence;

    .line 1289
    .line 1290
    invoke-static {v5}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v6

    .line 1294
    invoke-static {v6}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v6

    .line 1298
    if-nez v6, :cond_18

    .line 1299
    .line 1300
    goto :goto_e

    .line 1301
    :cond_18
    move-object v5, v6

    .line 1302
    :goto_e
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v6

    .line 1306
    invoke-static {v6}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v6

    .line 1310
    if-nez v6, :cond_19

    .line 1311
    .line 1312
    goto :goto_f

    .line 1313
    :cond_19
    move-object v1, v6

    .line 1314
    :goto_f
    filled-new-array {v2, v3, v4, v5, v1}, [Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v1

    .line 1318
    invoke-virtual {v0, v1}, Lsg1;->d([Ljava/lang/Object;)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    check-cast v0, Lzg1;

    .line 1330
    .line 1331
    sget-object v0, Ljd3;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1332
    .line 1333
    invoke-static {v0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1342
    .line 1343
    .line 1344
    move-result v1

    .line 1345
    if-nez v1, :cond_1a

    .line 1346
    .line 1347
    :goto_10
    move-object/from16 v18, v21

    .line 1348
    .line 1349
    goto :goto_11

    .line 1350
    :cond_1a
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v0

    .line 1354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1355
    .line 1356
    .line 1357
    invoke-static {}, Lc80;->g()V

    .line 1358
    .line 1359
    .line 1360
    :goto_11
    return-object v18

    .line 1361
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1362
    .line 1363
    check-cast v0, Ldj0;

    .line 1364
    .line 1365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1366
    .line 1367
    .line 1368
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v1

    .line 1372
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v1

    .line 1376
    iput-object v1, v0, Ldj0;->t:Ljava/util/List;

    .line 1377
    .line 1378
    new-instance v1, Lyg1;

    .line 1379
    .line 1380
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1381
    .line 1382
    .line 1383
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 1384
    .line 1385
    invoke-virtual {v1, v2}, Lyg1;->f0(Ljava/lang/Class;)V

    .line 1386
    .line 1387
    .line 1388
    const-string v2, "check table name from id:%d table:%s getTableNameByLocalId:%s"

    .line 1389
    .line 1390
    filled-new-array {v2}, [Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v2

    .line 1394
    invoke-virtual {v1, v2}, Lyg1;->j0([Ljava/lang/String;)V

    .line 1395
    .line 1396
    .line 1397
    iput-object v1, v0, Ldj0;->u:Lyg1;

    .line 1398
    .line 1399
    return-object v21

    .line 1400
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1401
    .line 1402
    check-cast v0, Ldj0;

    .line 1403
    .line 1404
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1405
    .line 1406
    .line 1407
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v1

    .line 1411
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v1

    .line 1415
    iput-object v1, v0, Ldj0;->t:Ljava/util/List;

    .line 1416
    .line 1417
    new-instance v1, Lyg1;

    .line 1418
    .line 1419
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1420
    .line 1421
    .line 1422
    const-string v2, "MicroMsg.MsgInfo"

    .line 1423
    .line 1424
    const-string v3, "[parseNewXmlSysMsg]"

    .line 1425
    .line 1426
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v2

    .line 1430
    invoke-virtual {v1, v2}, Lyg1;->j0([Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    iput-object v1, v0, Ldj0;->u:Lyg1;

    .line 1434
    .line 1435
    return-object v21

    .line 1436
    nop

    .line 1437
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
