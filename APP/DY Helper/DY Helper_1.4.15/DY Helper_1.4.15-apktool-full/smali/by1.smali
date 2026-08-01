.class public final synthetic Lby1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lby1;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget p0, p0, Lby1;->ε:I

    .line 2
    .line 3
    const-string v0, "]"

    .line 4
    .line 5
    const-string v1, "\"["

    .line 6
    .line 7
    const-string v2, "\""

    .line 8
    .line 9
    const-string v3, "\u65b0\u589e"

    .line 10
    .line 11
    const-string v4, "\u4fdd\u7559"

    .line 12
    .line 13
    const-string v5, "\u9690\u85cf"

    .line 14
    .line 15
    const-string v6, "\u4fdd\u62a4"

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x1

    .line 20
    sget-object v10, Ls62;->α:Ls62;

    .line 21
    .line 22
    const-wide v11, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const/16 v13, 0x20

    .line 28
    .line 29
    packed-switch p0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast p1, Lz3;

    .line 33
    .line 34
    iget p0, p1, Lz3;->α:F

    .line 35
    .line 36
    iget p1, p1, Lz3;->β:F

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    int-to-long v0, p0

    .line 43
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long p0, p0

    .line 48
    shl-long/2addr v0, v13

    .line 49
    and-long/2addr p0, v11

    .line 50
    or-long/2addr p0, v0

    .line 51
    new-instance v0, Lo41;

    .line 52
    .line 53
    invoke-direct {v0, p0, p1}, Lo41;-><init>(J)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    check-cast p1, Lo41;

    .line 58
    .line 59
    new-instance p0, Lz3;

    .line 60
    .line 61
    iget-wide v0, p1, Lo41;->α:J

    .line 62
    .line 63
    shr-long/2addr v0, v13

    .line 64
    long-to-int v0, v0

    .line 65
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-wide v1, p1, Lo41;->α:J

    .line 70
    .line 71
    and-long/2addr v1, v11

    .line 72
    long-to-int p1, v1

    .line 73
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-direct {p0, v0, p1}, Lz3;-><init>(FF)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    check-cast p1, Lz3;

    .line 82
    .line 83
    iget p0, p1, Lz3;->α:F

    .line 84
    .line 85
    iget p1, p1, Lz3;->β:F

    .line 86
    .line 87
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    int-to-long v0, p0

    .line 92
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    int-to-long p0, p0

    .line 97
    shl-long/2addr v0, v13

    .line 98
    and-long/2addr p0, v11

    .line 99
    or-long/2addr p0, v0

    .line 100
    new-instance v0, Ljw1;

    .line 101
    .line 102
    invoke-direct {v0, p0, p1}, Ljw1;-><init>(J)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_2
    check-cast p1, Ljw1;

    .line 107
    .line 108
    new-instance p0, Lz3;

    .line 109
    .line 110
    iget-wide v0, p1, Ljw1;->α:J

    .line 111
    .line 112
    shr-long/2addr v0, v13

    .line 113
    long-to-int v0, v0

    .line 114
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-wide v1, p1, Ljw1;->α:J

    .line 119
    .line 120
    and-long/2addr v1, v11

    .line 121
    long-to-int p1, v1

    .line 122
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-direct {p0, v0, p1}, Lz3;-><init>(FF)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_3
    check-cast p1, Lz3;

    .line 131
    .line 132
    iget p0, p1, Lz3;->α:F

    .line 133
    .line 134
    iget p1, p1, Lz3;->β:F

    .line 135
    .line 136
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    int-to-long v0, p0

    .line 141
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    int-to-long p0, p0

    .line 146
    shl-long/2addr v0, v13

    .line 147
    and-long/2addr p0, v11

    .line 148
    or-long/2addr p0, v0

    .line 149
    new-instance v0, Ljv;

    .line 150
    .line 151
    invoke-direct {v0, p0, p1}, Ljv;-><init>(J)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_4
    check-cast p1, Ljv;

    .line 156
    .line 157
    new-instance p0, Lz3;

    .line 158
    .line 159
    iget-wide v0, p1, Ljv;->α:J

    .line 160
    .line 161
    shr-long/2addr v0, v13

    .line 162
    long-to-int v0, v0

    .line 163
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iget-wide v1, p1, Ljv;->α:J

    .line 168
    .line 169
    and-long/2addr v1, v11

    .line 170
    long-to-int p1, v1

    .line 171
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-direct {p0, v0, p1}, Lz3;-><init>(FF)V

    .line 176
    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_5
    check-cast p1, Ly3;

    .line 180
    .line 181
    iget p0, p1, Ly3;->α:F

    .line 182
    .line 183
    new-instance p1, Liv;

    .line 184
    .line 185
    invoke-direct {p1, p0}, Liv;-><init>(F)V

    .line 186
    .line 187
    .line 188
    return-object p1

    .line 189
    :pswitch_6
    check-cast p1, Liv;

    .line 190
    .line 191
    new-instance p0, Ly3;

    .line 192
    .line 193
    iget p1, p1, Liv;->ε:F

    .line 194
    .line 195
    invoke-direct {p0, p1}, Ly3;-><init>(F)V

    .line 196
    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_7
    check-cast p1, Ly3;

    .line 200
    .line 201
    iget p0, p1, Ly3;->α:F

    .line 202
    .line 203
    float-to-int p0, p0

    .line 204
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    new-instance p1, Ly3;

    .line 216
    .line 217
    int-to-float p0, p0

    .line 218
    invoke-direct {p1, p0}, Ly3;-><init>(F)V

    .line 219
    .line 220
    .line 221
    return-object p1

    .line 222
    :pswitch_9
    check-cast p1, Ljava/lang/Float;

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    new-instance p1, Ly3;

    .line 229
    .line 230
    invoke-direct {p1, p0}, Ly3;-><init>(F)V

    .line 231
    .line 232
    .line 233
    return-object p1

    .line 234
    :pswitch_a
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, Landroid/view/View;

    .line 244
    .line 245
    if-eqz p0, :cond_0

    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    :cond_0
    return-object v8

    .line 252
    :pswitch_b
    check-cast p1, Lk52;

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-boolean p0, p1, Lk52;->θ:Z

    .line 258
    .line 259
    if-eqz p0, :cond_1

    .line 260
    .line 261
    move-object v3, v6

    .line 262
    goto :goto_0

    .line 263
    :cond_1
    iget-boolean p0, p1, Lk52;->ι:Z

    .line 264
    .line 265
    if-eqz p0, :cond_2

    .line 266
    .line 267
    move-object v3, v5

    .line 268
    goto :goto_0

    .line 269
    :cond_2
    iget-boolean p0, p1, Lk52;->η:Z

    .line 270
    .line 271
    if-eqz p0, :cond_3

    .line 272
    .line 273
    move-object v3, v4

    .line 274
    :cond_3
    :goto_0
    iget-object p0, p1, Lk52;->α:Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v2, p0, v1, v3, v0}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :pswitch_c
    check-cast p1, Ljava/lang/Class;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0

    .line 288
    :pswitch_d
    check-cast p1, Lj52;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    iget-boolean p0, p1, Lj52;->θ:Z

    .line 294
    .line 295
    if-eqz p0, :cond_4

    .line 296
    .line 297
    move-object v3, v6

    .line 298
    goto :goto_1

    .line 299
    :cond_4
    iget-boolean p0, p1, Lj52;->ι:Z

    .line 300
    .line 301
    if-eqz p0, :cond_5

    .line 302
    .line 303
    move-object v3, v5

    .line 304
    goto :goto_1

    .line 305
    :cond_5
    iget-boolean p0, p1, Lj52;->η:Z

    .line 306
    .line 307
    if-eqz p0, :cond_6

    .line 308
    .line 309
    move-object v3, v4

    .line 310
    :cond_6
    :goto_1
    iget-object p0, p1, Lj52;->α:Ljava/lang/String;

    .line 311
    .line 312
    invoke-static {v2, p0, v1, v3, v0}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :pswitch_e
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    check-cast p0, Landroid/view/View;

    .line 327
    .line 328
    if-eqz p0, :cond_7

    .line 329
    .line 330
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    :cond_7
    return-object v8

    .line 335
    :pswitch_f
    check-cast p1, Ljava/lang/Class;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 343
    .line 344
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    sget-object p0, Lo22;->α:Lo22;

    .line 348
    .line 349
    invoke-static {p1}, Lo22;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    return-object p0

    .line 354
    :pswitch_11
    check-cast p1, Ljava/lang/reflect/Method;

    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 360
    .line 361
    .line 362
    move-result p0

    .line 363
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 364
    .line 365
    .line 366
    move-result p0

    .line 367
    if-eqz p0, :cond_8

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    array-length p0, p0

    .line 378
    if-nez p0, :cond_b

    .line 379
    .line 380
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    const-class v0, Ljava/lang/String;

    .line 385
    .line 386
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result p0

    .line 390
    if-nez p0, :cond_9

    .line 391
    .line 392
    goto :goto_2

    .line 393
    :cond_9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 394
    .line 395
    .line 396
    move-result p0

    .line 397
    if-nez p0, :cond_b

    .line 398
    .line 399
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    if-eqz p0, :cond_a

    .line 404
    .line 405
    goto :goto_2

    .line 406
    :cond_a
    move v7, v9

    .line 407
    :cond_b
    :goto_2
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    return-object p0

    .line 412
    :pswitch_12
    check-cast p1, Ljava/lang/Class;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    return-object p0

    .line 419
    :pswitch_13
    check-cast p1, Ljava/lang/ClassLoader;

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    sget-object p0, Lo22;->α:Lo22;

    .line 425
    .line 426
    invoke-static {p1}, Lo22;->κ(Ljava/lang/ClassLoader;)V

    .line 427
    .line 428
    .line 429
    return-object v10

    .line 430
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    const-string p0, "*"

    .line 436
    .line 437
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result p0

    .line 441
    if-nez p0, :cond_c

    .line 442
    .line 443
    sget-object p0, Lo22;->ω:Ljava/util/Set;

    .line 444
    .line 445
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result p0

    .line 449
    if-eqz p0, :cond_d

    .line 450
    .line 451
    :cond_c
    sget-object p0, Lo22;->α:Lo22;

    .line 452
    .line 453
    invoke-static {v9}, Lo22;->ω(Z)Ljava/util/Set;

    .line 454
    .line 455
    .line 456
    invoke-static {}, Lo22;->α()V

    .line 457
    .line 458
    .line 459
    const-string p0, "prefs:"

    .line 460
    .line 461
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-static {p0}, Lo22;->Κ(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    :cond_d
    return-object v10

    .line 469
    :pswitch_15
    sget-object p0, Lo22;->α:Lo22;

    .line 470
    .line 471
    invoke-static {p1}, Lo22;->Ε(Ljava/lang/Object;)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    if-eqz p0, :cond_e

    .line 476
    .line 477
    goto :goto_3

    .line 478
    :cond_e
    if-eqz p1, :cond_f

    .line 479
    .line 480
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    :cond_f
    if-nez v8, :cond_10

    .line 485
    .line 486
    const-string p0, ""

    .line 487
    .line 488
    goto :goto_3

    .line 489
    :cond_10
    move-object p0, v8

    .line 490
    :goto_3
    return-object p0

    .line 491
    :pswitch_16
    check-cast p1, Ljava/lang/Class;

    .line 492
    .line 493
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    return-object p0

    .line 498
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 499
    .line 500
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 504
    .line 505
    .line 506
    move-result p0

    .line 507
    const-string v0, "    "

    .line 508
    .line 509
    if-eqz p0, :cond_11

    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 512
    .line 513
    .line 514
    move-result p0

    .line 515
    const/4 v1, 0x4

    .line 516
    if-ge p0, v1, :cond_12

    .line 517
    .line 518
    move-object p1, v0

    .line 519
    goto :goto_4

    .line 520
    :cond_11
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    :cond_12
    :goto_4
    return-object p1

    .line 525
    :pswitch_18
    check-cast p1, Ll91;

    .line 526
    .line 527
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    iget-object p0, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast p0, Ljava/lang/Number;

    .line 533
    .line 534
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 535
    .line 536
    .line 537
    move-result p0

    .line 538
    const/16 p1, 0x5dc

    .line 539
    .line 540
    if-lt p0, p1, :cond_13

    .line 541
    .line 542
    move v7, v9

    .line 543
    :cond_13
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    return-object p0

    .line 548
    :pswitch_19
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 549
    .line 550
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    const-string p0, "java.util.Map"

    .line 554
    .line 555
    filled-new-array {p0}, [Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 560
    .line 561
    .line 562
    return-object v10

    .line 563
    :pswitch_1a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    move-result-object p0

    .line 569
    array-length p0, p0

    .line 570
    if-ne p0, v9, :cond_14

    .line 571
    .line 572
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    aget-object p0, p0, v7

    .line 577
    .line 578
    const-class p1, Ljava/util/Map;

    .line 579
    .line 580
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 581
    .line 582
    .line 583
    move-result p0

    .line 584
    if-eqz p0, :cond_14

    .line 585
    .line 586
    move v7, v9

    .line 587
    :cond_14
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 588
    .line 589
    .line 590
    move-result-object p0

    .line 591
    return-object p0

    .line 592
    :pswitch_1b
    move-object v0, p1

    .line 593
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 594
    .line 595
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    sget-object v1, Lry1;->θ:Ljava/lang/String;

    .line 599
    .line 600
    const/4 v4, 0x6

    .line 601
    const/4 v5, 0x0

    .line 602
    const/4 v2, 0x0

    .line 603
    const/4 v3, 0x0

    .line 604
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 605
    .line 606
    .line 607
    sget-object v1, Lry1;->ι:Ljava/lang/String;

    .line 608
    .line 609
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 613
    .line 614
    .line 615
    return-object v10

    .line 616
    :pswitch_1c
    move-object v1, p1

    .line 617
    check-cast v1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 618
    .line 619
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    const/4 v5, 0x6

    .line 623
    const/4 v6, 0x0

    .line 624
    const-string v2, "void"

    .line 625
    .line 626
    const/4 v3, 0x0

    .line 627
    const/4 v4, 0x0

    .line 628
    invoke-static/range {v1 .. v6}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 629
    .line 630
    .line 631
    sget-object p0, Lry1;->θ:Ljava/lang/String;

    .line 632
    .line 633
    sget-object p1, Lry1;->ε:Ljava/lang/String;

    .line 634
    .line 635
    filled-new-array {p0, p1}, [Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    invoke-virtual {v1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes([Ljava/lang/String;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 640
    .line 641
    .line 642
    return-object v10

    .line 643
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
