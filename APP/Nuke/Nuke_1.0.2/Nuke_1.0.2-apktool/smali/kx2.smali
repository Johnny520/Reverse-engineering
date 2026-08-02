.class public final synthetic Lkx2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lkx2;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lh63;)V
    .locals 0

    .line 1
    const/16 p1, 0x8

    .line 2
    .line 3
    iput p1, p0, Lkx2;->h:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget p0, p0, Lkx2;->h:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x1

    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x20

    .line 10
    .line 11
    const-wide v6, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Lcj0;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance p0, Lkx2;

    .line 25
    .line 26
    const/16 v0, 0x1c

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lkx2;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p0}, Lcj0;->c0(Lin0;)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :pswitch_0
    check-cast p1, Lat;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string p0, "//voicetrymore"

    .line 41
    .line 42
    const-string v0, "getVoiceService %s"

    .line 43
    .line 44
    const-string v1, "MicroMsg.SceneVoiceService"

    .line 45
    .line 46
    filled-new-array {v1, p0, v0}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p1, p0}, Lat;->c0([Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :pswitch_1
    check-cast p1, Ljd;

    .line 55
    .line 56
    iget p0, p1, Ljd;->a:F

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, Lmd;

    .line 64
    .line 65
    new-instance p0, Lo62;

    .line 66
    .line 67
    iget v0, p1, Lmd;->a:F

    .line 68
    .line 69
    iget v1, p1, Lmd;->b:F

    .line 70
    .line 71
    iget v2, p1, Lmd;->c:F

    .line 72
    .line 73
    iget p1, p1, Lmd;->d:F

    .line 74
    .line 75
    invoke-direct {p0, v0, v1, v2, p1}, Lo62;-><init>(FFFF)V

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_3
    check-cast p1, Lo62;

    .line 80
    .line 81
    new-instance p0, Lmd;

    .line 82
    .line 83
    iget v0, p1, Lo62;->a:F

    .line 84
    .line 85
    iget v1, p1, Lo62;->b:F

    .line 86
    .line 87
    iget v2, p1, Lo62;->c:F

    .line 88
    .line 89
    iget p1, p1, Lo62;->d:F

    .line 90
    .line 91
    invoke-direct {p0, v0, v1, v2, p1}, Lmd;-><init>(FFFF)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_4
    check-cast p1, Lkd;

    .line 96
    .line 97
    iget p0, p1, Lkd;->a:F

    .line 98
    .line 99
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-gez p0, :cond_0

    .line 104
    .line 105
    move p0, v4

    .line 106
    :cond_0
    iget p1, p1, Lkd;->b:F

    .line 107
    .line 108
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-gez p1, :cond_1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    move v4, p1

    .line 116
    :goto_0
    int-to-long p0, p0

    .line 117
    shl-long/2addr p0, v5

    .line 118
    int-to-long v0, v4

    .line 119
    and-long/2addr v0, v6

    .line 120
    or-long/2addr p0, v0

    .line 121
    new-instance v0, Lh11;

    .line 122
    .line 123
    invoke-direct {v0, p0, p1}, Lh11;-><init>(J)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_5
    check-cast p1, Lh11;

    .line 128
    .line 129
    new-instance p0, Lkd;

    .line 130
    .line 131
    iget-wide v0, p1, Lh11;->a:J

    .line 132
    .line 133
    shr-long v2, v0, v5

    .line 134
    .line 135
    long-to-int p1, v2

    .line 136
    int-to-float p1, p1

    .line 137
    and-long/2addr v0, v6

    .line 138
    long-to-int v0, v0

    .line 139
    int-to-float v0, v0

    .line 140
    invoke-direct {p0, p1, v0}, Lkd;-><init>(FF)V

    .line 141
    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_6
    check-cast p1, Lkd;

    .line 145
    .line 146
    iget p0, p1, Lkd;->a:F

    .line 147
    .line 148
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    iget p1, p1, Lkd;->b:F

    .line 153
    .line 154
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    int-to-long v0, p0

    .line 159
    shl-long/2addr v0, v5

    .line 160
    int-to-long p0, p1

    .line 161
    and-long/2addr p0, v6

    .line 162
    or-long/2addr p0, v0

    .line 163
    new-instance v0, Lz01;

    .line 164
    .line 165
    invoke-direct {v0, p0, p1}, Lz01;-><init>(J)V

    .line 166
    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_7
    check-cast p1, Lz01;

    .line 170
    .line 171
    new-instance p0, Lkd;

    .line 172
    .line 173
    iget-wide v0, p1, Lz01;->a:J

    .line 174
    .line 175
    shr-long v2, v0, v5

    .line 176
    .line 177
    long-to-int p1, v2

    .line 178
    int-to-float p1, p1

    .line 179
    and-long/2addr v0, v6

    .line 180
    long-to-int v0, v0

    .line 181
    int-to-float v0, v0

    .line 182
    invoke-direct {p0, p1, v0}, Lkd;-><init>(FF)V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_8
    check-cast p1, Lkd;

    .line 187
    .line 188
    iget p0, p1, Lkd;->a:F

    .line 189
    .line 190
    iget p1, p1, Lkd;->b:F

    .line 191
    .line 192
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    int-to-long v0, p0

    .line 197
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    int-to-long p0, p0

    .line 202
    shl-long/2addr v0, v5

    .line 203
    and-long/2addr p0, v6

    .line 204
    or-long/2addr p0, v0

    .line 205
    new-instance v0, Lrs1;

    .line 206
    .line 207
    invoke-direct {v0, p0, p1}, Lrs1;-><init>(J)V

    .line 208
    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_9
    check-cast p1, Lrs1;

    .line 212
    .line 213
    new-instance p0, Lkd;

    .line 214
    .line 215
    iget-wide v0, p1, Lrs1;->a:J

    .line 216
    .line 217
    shr-long/2addr v0, v5

    .line 218
    long-to-int v0, v0

    .line 219
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    iget-wide v1, p1, Lrs1;->a:J

    .line 224
    .line 225
    and-long/2addr v1, v6

    .line 226
    long-to-int p1, v1

    .line 227
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    invoke-direct {p0, v0, p1}, Lkd;-><init>(FF)V

    .line 232
    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_a
    check-cast p1, Lkd;

    .line 236
    .line 237
    iget p0, p1, Lkd;->a:F

    .line 238
    .line 239
    iget p1, p1, Lkd;->b:F

    .line 240
    .line 241
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    int-to-long v0, p0

    .line 246
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    int-to-long p0, p0

    .line 251
    shl-long/2addr v0, v5

    .line 252
    and-long/2addr p0, v6

    .line 253
    or-long/2addr p0, v0

    .line 254
    new-instance v0, Lgr2;

    .line 255
    .line 256
    invoke-direct {v0, p0, p1}, Lgr2;-><init>(J)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_b
    check-cast p1, Lgr2;

    .line 261
    .line 262
    new-instance p0, Lkd;

    .line 263
    .line 264
    iget-wide v0, p1, Lgr2;->a:J

    .line 265
    .line 266
    shr-long/2addr v0, v5

    .line 267
    long-to-int v0, v0

    .line 268
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    iget-wide v1, p1, Lgr2;->a:J

    .line 273
    .line 274
    and-long/2addr v1, v6

    .line 275
    long-to-int p1, v1

    .line 276
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    invoke-direct {p0, v0, p1}, Lkd;-><init>(FF)V

    .line 281
    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_c
    check-cast p1, Lkd;

    .line 285
    .line 286
    iget p0, p1, Lkd;->a:F

    .line 287
    .line 288
    iget p1, p1, Lkd;->b:F

    .line 289
    .line 290
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    int-to-long v0, p0

    .line 295
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    int-to-long p0, p0

    .line 300
    shl-long/2addr v0, v5

    .line 301
    and-long/2addr p0, v6

    .line 302
    or-long/2addr p0, v0

    .line 303
    new-instance v0, Lbb0;

    .line 304
    .line 305
    invoke-direct {v0, p0, p1}, Lbb0;-><init>(J)V

    .line 306
    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_d
    check-cast p1, Lbb0;

    .line 310
    .line 311
    new-instance p0, Lkd;

    .line 312
    .line 313
    iget-wide v0, p1, Lbb0;->a:J

    .line 314
    .line 315
    shr-long/2addr v0, v5

    .line 316
    long-to-int v0, v0

    .line 317
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    iget-wide v1, p1, Lbb0;->a:J

    .line 322
    .line 323
    and-long/2addr v1, v6

    .line 324
    long-to-int p1, v1

    .line 325
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    invoke-direct {p0, v0, p1}, Lkd;-><init>(FF)V

    .line 330
    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_e
    check-cast p1, Ljd;

    .line 334
    .line 335
    iget p0, p1, Ljd;->a:F

    .line 336
    .line 337
    new-instance p1, Lza0;

    .line 338
    .line 339
    invoke-direct {p1, p0}, Lza0;-><init>(F)V

    .line 340
    .line 341
    .line 342
    return-object p1

    .line 343
    :pswitch_f
    check-cast p1, Lza0;

    .line 344
    .line 345
    new-instance p0, Ljd;

    .line 346
    .line 347
    iget p1, p1, Lza0;->h:F

    .line 348
    .line 349
    invoke-direct {p0, p1}, Ljd;-><init>(F)V

    .line 350
    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_10
    check-cast p1, Ljd;

    .line 354
    .line 355
    iget p0, p1, Ljd;->a:F

    .line 356
    .line 357
    float-to-int p0, p0

    .line 358
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 366
    .line 367
    .line 368
    move-result p0

    .line 369
    new-instance p1, Ljd;

    .line 370
    .line 371
    int-to-float p0, p0

    .line 372
    invoke-direct {p1, p0}, Ljd;-><init>(F)V

    .line 373
    .line 374
    .line 375
    return-object p1

    .line 376
    :pswitch_12
    check-cast p1, Ljava/lang/Float;

    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    new-instance p1, Ljd;

    .line 383
    .line 384
    invoke-direct {p1, p0}, Ljd;-><init>(F)V

    .line 385
    .line 386
    .line 387
    return-object p1

    .line 388
    :pswitch_13
    check-cast p1, Ljg3;

    .line 389
    .line 390
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 394
    .line 395
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 396
    .line 397
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    check-cast p0, Landroid/app/Activity;

    .line 401
    .line 402
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    const-string p1, "max_select_count"

    .line 407
    .line 408
    const/16 v0, 0x1a0a

    .line 409
    .line 410
    invoke-virtual {p0, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 411
    .line 412
    .line 413
    return-object v2

    .line 414
    :pswitch_14
    check-cast p1, Lx41;

    .line 415
    .line 416
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    const-string p0, "*"

    .line 420
    .line 421
    return-object p0

    .line 422
    :pswitch_15
    check-cast p1, Ljava/util/List;

    .line 423
    .line 424
    new-instance p0, Ltz2;

    .line 425
    .line 426
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    check-cast v0, Ljava/lang/Boolean;

    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_2

    .line 440
    .line 441
    sget-object v0, Lqv1;->h:Lqv1;

    .line 442
    .line 443
    goto :goto_1

    .line 444
    :cond_2
    sget-object v0, Lqv1;->i:Lqv1;

    .line 445
    .line 446
    :goto_1
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    check-cast p1, Ljava/lang/Float;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    invoke-direct {p0, v0, p1}, Ltz2;-><init>(Lqv1;F)V

    .line 460
    .line 461
    .line 462
    return-object p0

    .line 463
    :pswitch_16
    check-cast p1, Lpz2;

    .line 464
    .line 465
    invoke-virtual {p1}, Lpz2;->b()Ljava/lang/Integer;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    if-eqz p0, :cond_3

    .line 470
    .line 471
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 472
    .line 473
    .line 474
    move-result p0

    .line 475
    new-instance v3, Lz60;

    .line 476
    .line 477
    iget-wide v0, p1, Lpz2;->f:J

    .line 478
    .line 479
    sget p1, Lf13;->c:I

    .line 480
    .line 481
    and-long/2addr v0, v6

    .line 482
    long-to-int p1, v0

    .line 483
    sub-int/2addr p0, p1

    .line 484
    invoke-direct {v3, v4, p0}, Lz60;-><init>(II)V

    .line 485
    .line 486
    .line 487
    :cond_3
    return-object v3

    .line 488
    :pswitch_17
    check-cast p1, Lpz2;

    .line 489
    .line 490
    invoke-virtual {p1}, Lpz2;->c()Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    if-eqz p0, :cond_4

    .line 495
    .line 496
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 497
    .line 498
    .line 499
    move-result p0

    .line 500
    new-instance v3, Lz60;

    .line 501
    .line 502
    iget-wide v0, p1, Lpz2;->f:J

    .line 503
    .line 504
    sget p1, Lf13;->c:I

    .line 505
    .line 506
    and-long/2addr v0, v6

    .line 507
    long-to-int p1, v0

    .line 508
    sub-int/2addr p1, p0

    .line 509
    invoke-direct {v3, p1, v4}, Lz60;-><init>(II)V

    .line 510
    .line 511
    .line 512
    :cond_4
    return-object v3

    .line 513
    :pswitch_18
    check-cast p1, Lpz2;

    .line 514
    .line 515
    invoke-virtual {p1}, Lpz2;->d()Ljava/lang/Integer;

    .line 516
    .line 517
    .line 518
    move-result-object p0

    .line 519
    if-eqz p0, :cond_5

    .line 520
    .line 521
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 522
    .line 523
    .line 524
    move-result p0

    .line 525
    new-instance v3, Lz60;

    .line 526
    .line 527
    iget-wide v0, p1, Lpz2;->f:J

    .line 528
    .line 529
    sget p1, Lf13;->c:I

    .line 530
    .line 531
    and-long/2addr v0, v6

    .line 532
    long-to-int p1, v0

    .line 533
    sub-int/2addr p0, p1

    .line 534
    invoke-direct {v3, v4, p0}, Lz60;-><init>(II)V

    .line 535
    .line 536
    .line 537
    :cond_5
    return-object v3

    .line 538
    :pswitch_19
    check-cast p1, Lpz2;

    .line 539
    .line 540
    invoke-virtual {p1}, Lpz2;->e()Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    if-eqz p0, :cond_6

    .line 545
    .line 546
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 547
    .line 548
    .line 549
    move-result p0

    .line 550
    new-instance v3, Lz60;

    .line 551
    .line 552
    iget-wide v0, p1, Lpz2;->f:J

    .line 553
    .line 554
    sget p1, Lf13;->c:I

    .line 555
    .line 556
    and-long/2addr v0, v6

    .line 557
    long-to-int p1, v0

    .line 558
    sub-int/2addr p1, p0

    .line 559
    invoke-direct {v3, p1, v4}, Lz60;-><init>(II)V

    .line 560
    .line 561
    .line 562
    :cond_6
    return-object v3

    .line 563
    :pswitch_1a
    check-cast p1, Lpz2;

    .line 564
    .line 565
    iget-object p0, p1, Lpz2;->g:Lsd;

    .line 566
    .line 567
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 568
    .line 569
    iget-wide v1, p1, Lpz2;->f:J

    .line 570
    .line 571
    sget v5, Lf13;->c:I

    .line 572
    .line 573
    and-long/2addr v1, v6

    .line 574
    long-to-int v1, v1

    .line 575
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    invoke-virtual {v2, p0}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2, v1}, Ljava/text/BreakIterator;->following(I)I

    .line 583
    .line 584
    .line 585
    move-result p0

    .line 586
    if-eq p0, v0, :cond_7

    .line 587
    .line 588
    new-instance v3, Lz60;

    .line 589
    .line 590
    iget-wide v0, p1, Lpz2;->f:J

    .line 591
    .line 592
    and-long/2addr v0, v6

    .line 593
    long-to-int p1, v0

    .line 594
    sub-int/2addr p0, p1

    .line 595
    invoke-direct {v3, v4, p0}, Lz60;-><init>(II)V

    .line 596
    .line 597
    .line 598
    :cond_7
    return-object v3

    .line 599
    :pswitch_1b
    check-cast p1, Lpz2;

    .line 600
    .line 601
    iget-object p0, p1, Lpz2;->g:Lsd;

    .line 602
    .line 603
    iget-object p0, p0, Lsd;->i:Ljava/lang/String;

    .line 604
    .line 605
    iget-wide v1, p1, Lpz2;->f:J

    .line 606
    .line 607
    sget v5, Lf13;->c:I

    .line 608
    .line 609
    and-long/2addr v1, v6

    .line 610
    long-to-int v1, v1

    .line 611
    if-gtz v1, :cond_8

    .line 612
    .line 613
    :goto_2
    move p0, v0

    .line 614
    goto :goto_3

    .line 615
    :cond_8
    if-gtz v1, :cond_9

    .line 616
    .line 617
    goto :goto_2

    .line 618
    :cond_9
    invoke-static {p0, v1, v0}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 619
    .line 620
    .line 621
    move-result p0

    .line 622
    :goto_3
    if-ne p0, v0, :cond_a

    .line 623
    .line 624
    goto :goto_4

    .line 625
    :cond_a
    new-instance v3, Lz60;

    .line 626
    .line 627
    iget-wide v0, p1, Lpz2;->f:J

    .line 628
    .line 629
    and-long/2addr v0, v6

    .line 630
    long-to-int p1, v0

    .line 631
    sub-int/2addr p1, p0

    .line 632
    invoke-direct {v3, p1, v4}, Lz60;-><init>(II)V

    .line 633
    .line 634
    .line 635
    :goto_4
    return-object v3

    .line 636
    :pswitch_1c
    check-cast p1, Landroid/content/res/Resources;

    .line 637
    .line 638
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 642
    .line 643
    .line 644
    move-result-object p0

    .line 645
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 646
    .line 647
    and-int/lit8 p0, p0, 0x30

    .line 648
    .line 649
    if-ne p0, v5, :cond_b

    .line 650
    .line 651
    goto :goto_5

    .line 652
    :cond_b
    move v1, v4

    .line 653
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    return-object p0

    .line 658
    nop

    .line 659
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
