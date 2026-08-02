.class public final synthetic Lgs;
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
    iput p1, p0, Lgs;->h:I

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
    .locals 7

    .line 1
    iget p0, p0, Lgs;->h:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lcj0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p0, Lat;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v0, "MicroMsg.ImgUpload.MsgImgFeatureService"

    .line 21
    .line 22
    const-string v1, "computePHash fileNotExist:"

    .line 23
    .line 24
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, La83;->a:La83;

    .line 32
    .line 33
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    check-cast p1, Lcj0;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance p0, Lgs;

    .line 42
    .line 43
    const/16 v0, 0x1b

    .line 44
    .line 45
    invoke-direct {p0, v0}, Lgs;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Lcj0;->c0(Lin0;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, La83;->a:La83;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Lat;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-string p0, "MicroMsg.ConfigStorageLogic"

    .line 60
    .line 61
    const-string v0, "get userinfo fail"

    .line 62
    .line 63
    filled-new-array {p0, v0}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p1, p0}, Lat;->c0([Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, La83;->a:La83;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance p0, Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_3
    sget-object p0, Lds2;->c:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter p0

    .line 92
    :try_start_0
    sget-object v0, Lds2;->i:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    :goto_0
    if-ge v3, v1, :cond_0

    .line 99
    .line 100
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lin0;

    .line 105
    .line 106
    invoke-interface {v2, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    goto :goto_1

    .line 114
    :cond_0
    monitor-exit p0

    .line 115
    sget-object p0, La83;->a:La83;

    .line 116
    .line 117
    return-object p0

    .line 118
    :goto_1
    monitor-exit p0

    .line 119
    throw p1

    .line 120
    :pswitch_4
    sget-object p0, La83;->a:La83;

    .line 121
    .line 122
    check-cast p1, Ldj0;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    const-string v0, "com.tencent.mm.ui"

    .line 128
    .line 129
    filled-new-array {v0}, [Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iput-object v0, p1, Ldj0;->t:Ljava/util/List;

    .line 138
    .line 139
    new-instance v0, Lyg1;

    .line 140
    .line 141
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 142
    .line 143
    .line 144
    const/16 v1, 0x9

    .line 145
    .line 146
    invoke-static {v0, v1}, Lyg1;->c0(Lyg1;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v3}, Lyg1;->d0(I)V

    .line 150
    .line 151
    .line 152
    const-string v1, "royole"

    .line 153
    .line 154
    const-string v2, "tecno"

    .line 155
    .line 156
    const-string v3, "ro.os_foldable_screen_support"

    .line 157
    .line 158
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v0, v1}, Lyg1;->j0([Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-class v1, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-nez v2, :cond_1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_1
    move-object v1, v2

    .line 179
    :goto_2
    invoke-virtual {v0, v1}, Lyg1;->f0(Ljava/lang/Class;)V

    .line 180
    .line 181
    .line 182
    iput-object v0, p1, Ldj0;->u:Lyg1;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_5
    check-cast p1, Ldj0;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    new-instance p0, Lyg1;

    .line 191
    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v0}, Lyg1;->d0(I)V

    .line 196
    .line 197
    .line 198
    const-string v0, "MicroMsg.CgiCheckLoginAsPad"

    .line 199
    .line 200
    const-string v1, "/cgi-bin/micromsg-bin/checkloginaspad"

    .line 201
    .line 202
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    sget-object v0, La83;->a:La83;

    .line 210
    .line 211
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_6
    check-cast p1, Ljg3;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {p1, p0}, Ljg3;->b(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    sget-object p0, La83;->a:La83;

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_7
    check-cast p1, Ljg3;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {p1, p0}, Ljg3;->b(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    sget-object p0, La83;->a:La83;

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_8
    check-cast p1, Ld31;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    iput-boolean v2, p1, Ld31;->c:Z

    .line 246
    .line 247
    sget-object p0, La83;->a:La83;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_9
    check-cast p1, Ldj0;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    const-string p0, "com.tencent.mm.sdk.platformtools"

    .line 256
    .line 257
    filled-new-array {p0}, [Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 266
    .line 267
    new-instance p0, Lyg1;

    .line 268
    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 270
    .line 271
    .line 272
    const-string v0, "getRoundedCornerBitmap bitmap recycle %s"

    .line 273
    .line 274
    filled-new-array {v0}, [Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const/4 v0, 0x5

    .line 282
    invoke-virtual {p0, v0}, Lyg1;->d0(I)V

    .line 283
    .line 284
    .line 285
    sget-object v0, La83;->a:La83;

    .line 286
    .line 287
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_a
    check-cast p1, Ljg3;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    sget-object p0, Lje0;->d:Lje0;

    .line 296
    .line 297
    iget-object v0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 298
    .line 299
    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    check-cast v0, Landroid/graphics/Bitmap;

    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 320
    .line 321
    invoke-static {p0, v1, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v4, Landroid/graphics/Canvas;

    .line 329
    .line 330
    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 331
    .line 332
    .line 333
    new-instance v5, Landroid/graphics/Paint;

    .line 334
    .line 335
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 339
    .line 340
    .line 341
    new-instance v2, Landroid/graphics/BitmapShader;

    .line 342
    .line 343
    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 344
    .line 345
    invoke-direct {v2, v0, v6, v6}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 349
    .line 350
    .line 351
    new-instance v0, Landroid/graphics/Path;

    .line 352
    .line 353
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 354
    .line 355
    .line 356
    new-instance v2, Landroid/graphics/RectF;

    .line 357
    .line 358
    int-to-float p0, p0

    .line 359
    int-to-float v1, v1

    .line 360
    const/4 v6, 0x0

    .line 361
    invoke-direct {v2, v6, v6, p0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 362
    .line 363
    .line 364
    const/high16 p0, 0x42c80000    # 100.0f

    .line 365
    .line 366
    sget-object v1, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 367
    .line 368
    invoke-virtual {v0, v2, p0, p0, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v4, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p1, v3}, Ljg3;->b(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    sget-object p0, La83;->a:La83;

    .line 378
    .line 379
    return-object p0

    .line 380
    :pswitch_b
    check-cast p1, Ljg3;

    .line 381
    .line 382
    sget-object p0, La83;->a:La83;

    .line 383
    .line 384
    sget-object v0, Lw90;->d:Lw90;

    .line 385
    .line 386
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-static {p1}, Lw90;->q(Ljg3;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 393
    .line 394
    .line 395
    move-object v1, p0

    .line 396
    goto :goto_3

    .line 397
    :catchall_1
    move-exception p1

    .line 398
    new-instance v1, Lx92;

    .line 399
    .line 400
    invoke-direct {v1, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    :goto_3
    invoke-static {v1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    if-eqz p1, :cond_2

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    sget-object v0, Lw90;->h:Ljava/lang/String;

    .line 413
    .line 414
    invoke-static {p1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    const-string v1, "Unable to display message details: "

    .line 419
    .line 420
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    invoke-static {v0, p1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    :cond_2
    return-object p0

    .line 428
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    sget-object p0, La83;->a:La83;

    .line 434
    .line 435
    return-object p0

    .line 436
    :pswitch_d
    check-cast p1, Ljg3;

    .line 437
    .line 438
    sget-object p0, La83;->a:La83;

    .line 439
    .line 440
    sget-object v0, Lr90;->d:Lr90;

    .line 441
    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-static {p1}, Lr90;->q(Ljg3;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 449
    .line 450
    .line 451
    move-object v1, p0

    .line 452
    goto :goto_4

    .line 453
    :catchall_2
    move-exception p1

    .line 454
    new-instance v1, Lx92;

    .line 455
    .line 456
    invoke-direct {v1, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 457
    .line 458
    .line 459
    :goto_4
    invoke-static {v1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    if-eqz p1, :cond_3

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    sget-object v0, Lr90;->h:Ljava/lang/String;

    .line 469
    .line 470
    invoke-static {p1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    const-string v1, "Unable to handle contact ID entry click: "

    .line 475
    .line 476
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    invoke-static {v0, p1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    :cond_3
    return-object p0

    .line 484
    :pswitch_e
    check-cast p1, Ljava/util/List;

    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 490
    .line 491
    .line 492
    move-result p0

    .line 493
    const/4 v1, 0x4

    .line 494
    if-ne p0, v1, :cond_4

    .line 495
    .line 496
    const-class p0, Landroid/widget/AdapterView;

    .line 497
    .line 498
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    check-cast v1, Ljava/lang/Class;

    .line 503
    .line 504
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 505
    .line 506
    .line 507
    move-result p0

    .line 508
    if-eqz p0, :cond_4

    .line 509
    .line 510
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    const-class v1, Landroid/view/View;

    .line 515
    .line 516
    invoke-static {p0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result p0

    .line 520
    if-eqz p0, :cond_4

    .line 521
    .line 522
    const/4 p0, 0x2

    .line 523
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object p0

    .line 527
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 528
    .line 529
    invoke-static {p0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    if-eqz p0, :cond_4

    .line 534
    .line 535
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object p0

    .line 539
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 540
    .line 541
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result p0

    .line 545
    if-eqz p0, :cond_4

    .line 546
    .line 547
    goto :goto_5

    .line 548
    :cond_4
    move v2, v3

    .line 549
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    return-object p0

    .line 554
    :pswitch_f
    check-cast p1, Ljg3;

    .line 555
    .line 556
    sget-object p0, La83;->a:La83;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    iget-object p1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 562
    .line 563
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    check-cast p1, Landroid/app/Activity;

    .line 569
    .line 570
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    const-string v0, "Contact_User"

    .line 575
    .line 576
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object p1

    .line 580
    if-eqz p1, :cond_6

    .line 581
    .line 582
    invoke-static {p1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    if-nez v0, :cond_5

    .line 587
    .line 588
    move-object v1, p1

    .line 589
    :cond_5
    if-eqz v1, :cond_6

    .line 590
    .line 591
    sput-object v1, Lr90;->j:Ljava/lang/String;

    .line 592
    .line 593
    :cond_6
    return-object p0

    .line 594
    :pswitch_10
    check-cast p1, Ljg3;

    .line 595
    .line 596
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    invoke-virtual {p1, p0}, Ljg3;->b(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    sget-object p0, La83;->a:La83;

    .line 607
    .line 608
    return-object p0

    .line 609
    :pswitch_11
    check-cast p1, Lw80;

    .line 610
    .line 611
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    iget-object p0, p1, Lw80;->c:Ljava/lang/String;

    .line 615
    .line 616
    return-object p0

    .line 617
    :pswitch_12
    check-cast p1, Ljg3;

    .line 618
    .line 619
    sget-object p0, La83;->a:La83;

    .line 620
    .line 621
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    sget-object v0, Lx30;->d:Lx30;

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-static {}, Lpp1;->c()Lop1;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    const-string v2, "CustomInputHint/text"

    .line 634
    .line 635
    const-string v3, ""

    .line 636
    .line 637
    invoke-virtual {v0, v2}, Lop1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    if-nez v0, :cond_7

    .line 642
    .line 643
    goto :goto_6

    .line 644
    :cond_7
    move-object v3, v0

    .line 645
    :goto_6
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    if-nez v0, :cond_8

    .line 650
    .line 651
    goto :goto_7

    .line 652
    :cond_8
    move-object v3, v1

    .line 653
    :goto_7
    if-nez v3, :cond_9

    .line 654
    .line 655
    goto :goto_8

    .line 656
    :cond_9
    iget-object p1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 657
    .line 658
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 659
    .line 660
    instance-of v0, p1, Landroid/widget/TextView;

    .line 661
    .line 662
    if-eqz v0, :cond_a

    .line 663
    .line 664
    move-object v1, p1

    .line 665
    check-cast v1, Landroid/widget/TextView;

    .line 666
    .line 667
    :cond_a
    if-eqz v1, :cond_b

    .line 668
    .line 669
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 670
    .line 671
    .line 672
    :cond_b
    :goto_8
    return-object p0

    .line 673
    :pswitch_13
    check-cast p1, Ly10;

    .line 674
    .line 675
    instance-of p0, p1, Lc20;

    .line 676
    .line 677
    if-eqz p0, :cond_c

    .line 678
    .line 679
    move-object v1, p1

    .line 680
    check-cast v1, Lc20;

    .line 681
    .line 682
    :cond_c
    return-object v1

    .line 683
    :pswitch_14
    check-cast p1, Ldj0;

    .line 684
    .line 685
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    new-instance p0, Lgs;

    .line 689
    .line 690
    const/4 v0, 0x7

    .line 691
    invoke-direct {p0, v0}, Lgs;-><init>(I)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {p1, p0}, Ldj0;->c0(Lin0;)V

    .line 695
    .line 696
    .line 697
    sget-object p0, La83;->a:La83;

    .line 698
    .line 699
    return-object p0

    .line 700
    :pswitch_15
    check-cast p1, Lyg1;

    .line 701
    .line 702
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    new-instance p0, Lat;

    .line 706
    .line 707
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 708
    .line 709
    .line 710
    const-string v0, "MMKernel.CoreStorage"

    .line 711
    .line 712
    const-string v1, "factory.getSQLs() is null! %s, %s"

    .line 713
    .line 714
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    sget-object v0, La83;->a:La83;

    .line 722
    .line 723
    iput-object p0, p1, Lyg1;->v:Lat;

    .line 724
    .line 725
    const-string p0, "MicroMsg.db"

    .line 726
    .line 727
    filled-new-array {p0}, [Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object p0

    .line 731
    invoke-virtual {p1, p0}, Lyg1;->h0([Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    return-object v0

    .line 735
    :pswitch_16
    check-cast p1, Ldj0;

    .line 736
    .line 737
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    new-instance p0, Lyg1;

    .line 741
    .line 742
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 743
    .line 744
    .line 745
    const-string v0, "MMKernel.CoreAccount"

    .line 746
    .line 747
    const-string v1, "getUinFromSharedPreferences get from sp fail"

    .line 748
    .line 749
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    sget-object v0, La83;->a:La83;

    .line 757
    .line 758
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 759
    .line 760
    return-object v0

    .line 761
    :pswitch_17
    check-cast p1, Ldj0;

    .line 762
    .line 763
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    const-string p0, "com.tencent.mm.storage"

    .line 767
    .line 768
    filled-new-array {p0}, [Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object p0

    .line 772
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 773
    .line 774
    .line 775
    move-result-object p0

    .line 776
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 777
    .line 778
    new-instance p0, Lyg1;

    .line 779
    .line 780
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    .line 782
    .line 783
    const-string v0, "updateUnreadByTalker %s"

    .line 784
    .line 785
    filled-new-array {v0}, [Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    sget-object v0, La83;->a:La83;

    .line 793
    .line 794
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 795
    .line 796
    return-object v0

    .line 797
    :pswitch_18
    check-cast p1, Ldj0;

    .line 798
    .line 799
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    const-string p0, "com.tencent.mm.storage"

    .line 803
    .line 804
    filled-new-array {p0}, [Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object p0

    .line 812
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 813
    .line 814
    new-instance p0, Lyg1;

    .line 815
    .line 816
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 817
    .line 818
    .line 819
    const-string v0, "ConversationStorage"

    .line 820
    .line 821
    const-string v1, "delChatContact"

    .line 822
    .line 823
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    sget-object v0, La83;->a:La83;

    .line 831
    .line 832
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 833
    .line 834
    return-object v0

    .line 835
    :pswitch_19
    check-cast p1, Lcj0;

    .line 836
    .line 837
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    const-string p0, "com.tencent.mm.storage"

    .line 841
    .line 842
    filled-new-array {p0}, [Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object p0

    .line 846
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 847
    .line 848
    .line 849
    move-result-object p0

    .line 850
    iput-object p0, p1, Lcj0;->t:Ljava/util/List;

    .line 851
    .line 852
    new-instance p0, Lat;

    .line 853
    .line 854
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 855
    .line 856
    .line 857
    const-string v0, "MicroMsg.ContactStorage"

    .line 858
    .line 859
    const-string v1, "FATAL ERROR, invalid contact, empty username"

    .line 860
    .line 861
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    sget-object v0, La83;->a:La83;

    .line 869
    .line 870
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 871
    .line 872
    return-object v0

    .line 873
    :pswitch_1a
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 874
    .line 875
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 876
    .line 877
    .line 878
    move-result p0

    .line 879
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 880
    .line 881
    .line 882
    move-result p0

    .line 883
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 884
    .line 885
    .line 886
    move-result-object p0

    .line 887
    return-object p0

    .line 888
    :pswitch_1b
    check-cast p1, Ldj0;

    .line 889
    .line 890
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    const-string p0, "com.tencent.mm.ui.chatting.component"

    .line 894
    .line 895
    filled-new-array {p0}, [Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object p0

    .line 899
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 900
    .line 901
    .line 902
    move-result-object p0

    .line 903
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 904
    .line 905
    new-instance p0, Lyg1;

    .line 906
    .line 907
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 908
    .line 909
    .line 910
    const-string v0, "MicroMsg.ChattingUI.FootComponent"

    .line 911
    .line 912
    const-string v1, "resetFooter customFooter is %s"

    .line 913
    .line 914
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    sget-object v0, La83;->a:La83;

    .line 922
    .line 923
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 924
    .line 925
    return-object v0

    .line 926
    :pswitch_1c
    check-cast p1, Ldj0;

    .line 927
    .line 928
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    const-string p0, "com.tencent.mm.ui.chatting.adapter"

    .line 932
    .line 933
    filled-new-array {p0}, [Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object p0

    .line 937
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 938
    .line 939
    .line 940
    move-result-object p0

    .line 941
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 942
    .line 943
    new-instance p0, Lyg1;

    .line 944
    .line 945
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 946
    .line 947
    .line 948
    const-string v0, "MicroMsg.ChattingDataAdapterV3"

    .line 949
    .line 950
    const-string v1, "_onBindViewHolder["

    .line 951
    .line 952
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    sget-object v0, La83;->a:La83;

    .line 960
    .line 961
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 962
    .line 963
    return-object v0

    .line 964
    nop

    .line 965
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
