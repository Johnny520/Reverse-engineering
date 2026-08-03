.class public final synthetic Lg0/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg0/o;->g:I

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
    .locals 9

    .line 1
    iget v0, p0, Lg0/o;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const-wide v4, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v6, 0x20

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Li2/b;

    .line 18
    .line 19
    instance-of p1, p1, Li2/u;

    .line 20
    .line 21
    xor-int/2addr p1, v3

    .line 22
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    check-cast p1, Li0/c1;

    .line 28
    .line 29
    iget-object p1, p1, Li0/c1;->a:Ld1/c0;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Ld1/c0;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v1

    .line 37
    :pswitch_1
    check-cast p1, Li/m;

    .line 38
    .line 39
    iget p1, p1, Li/m;->a:F

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_2
    check-cast p1, Li/p;

    .line 47
    .line 48
    new-instance v0, Le1/c;

    .line 49
    .line 50
    iget v1, p1, Li/p;->a:F

    .line 51
    .line 52
    iget v2, p1, Li/p;->b:F

    .line 53
    .line 54
    iget v3, p1, Li/p;->c:F

    .line 55
    .line 56
    iget p1, p1, Li/p;->d:F

    .line 57
    .line 58
    invoke-direct {v0, v1, v2, v3, p1}, Le1/c;-><init>(FFFF)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_3
    check-cast p1, Le1/c;

    .line 63
    .line 64
    new-instance v0, Li/p;

    .line 65
    .line 66
    iget v1, p1, Le1/c;->a:F

    .line 67
    .line 68
    iget v2, p1, Le1/c;->b:F

    .line 69
    .line 70
    iget v3, p1, Le1/c;->c:F

    .line 71
    .line 72
    iget p1, p1, Le1/c;->d:F

    .line 73
    .line 74
    invoke-direct {v0, v1, v2, v3, p1}, Li/p;-><init>(FFFF)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_4
    check-cast p1, Li/n;

    .line 79
    .line 80
    iget v0, p1, Li/n;->a:F

    .line 81
    .line 82
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-gez v0, :cond_1

    .line 87
    .line 88
    move v0, v2

    .line 89
    :cond_1
    iget p1, p1, Li/n;->b:F

    .line 90
    .line 91
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-gez p1, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    move v2, p1

    .line 99
    :goto_0
    int-to-long v0, v0

    .line 100
    shl-long/2addr v0, v6

    .line 101
    int-to-long v2, v2

    .line 102
    and-long/2addr v2, v4

    .line 103
    or-long/2addr v0, v2

    .line 104
    new-instance p1, Lu2/l;

    .line 105
    .line 106
    invoke-direct {p1, v0, v1}, Lu2/l;-><init>(J)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_5
    check-cast p1, Lu2/l;

    .line 111
    .line 112
    new-instance v0, Li/n;

    .line 113
    .line 114
    iget-wide v1, p1, Lu2/l;->a:J

    .line 115
    .line 116
    shr-long v6, v1, v6

    .line 117
    .line 118
    long-to-int p1, v6

    .line 119
    int-to-float p1, p1

    .line 120
    and-long/2addr v1, v4

    .line 121
    long-to-int v1, v1

    .line 122
    int-to-float v1, v1

    .line 123
    invoke-direct {v0, p1, v1}, Li/n;-><init>(FF)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_6
    check-cast p1, Li/n;

    .line 128
    .line 129
    iget v0, p1, Li/n;->a:F

    .line 130
    .line 131
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iget p1, p1, Li/n;->b:F

    .line 136
    .line 137
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    int-to-long v0, v0

    .line 142
    shl-long/2addr v0, v6

    .line 143
    int-to-long v2, p1

    .line 144
    and-long/2addr v2, v4

    .line 145
    or-long/2addr v0, v2

    .line 146
    new-instance p1, Lu2/j;

    .line 147
    .line 148
    invoke-direct {p1, v0, v1}, Lu2/j;-><init>(J)V

    .line 149
    .line 150
    .line 151
    return-object p1

    .line 152
    :pswitch_7
    check-cast p1, Lu2/j;

    .line 153
    .line 154
    new-instance v0, Li/n;

    .line 155
    .line 156
    iget-wide v1, p1, Lu2/j;->a:J

    .line 157
    .line 158
    shr-long v6, v1, v6

    .line 159
    .line 160
    long-to-int p1, v6

    .line 161
    int-to-float p1, p1

    .line 162
    and-long/2addr v1, v4

    .line 163
    long-to-int v1, v1

    .line 164
    int-to-float v1, v1

    .line 165
    invoke-direct {v0, p1, v1}, Li/n;-><init>(FF)V

    .line 166
    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_8
    check-cast p1, Li/n;

    .line 170
    .line 171
    iget v0, p1, Li/n;->a:F

    .line 172
    .line 173
    iget p1, p1, Li/n;->b:F

    .line 174
    .line 175
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    int-to-long v0, v0

    .line 180
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    int-to-long v2, p1

    .line 185
    shl-long/2addr v0, v6

    .line 186
    and-long/2addr v2, v4

    .line 187
    or-long/2addr v0, v2

    .line 188
    new-instance p1, Le1/b;

    .line 189
    .line 190
    invoke-direct {p1, v0, v1}, Le1/b;-><init>(J)V

    .line 191
    .line 192
    .line 193
    return-object p1

    .line 194
    :pswitch_9
    check-cast p1, Le1/b;

    .line 195
    .line 196
    new-instance v0, Li/n;

    .line 197
    .line 198
    iget-wide v1, p1, Le1/b;->a:J

    .line 199
    .line 200
    shr-long/2addr v1, v6

    .line 201
    long-to-int v1, v1

    .line 202
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    iget-wide v2, p1, Le1/b;->a:J

    .line 207
    .line 208
    and-long/2addr v2, v4

    .line 209
    long-to-int p1, v2

    .line 210
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    invoke-direct {v0, v1, p1}, Li/n;-><init>(FF)V

    .line 215
    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_a
    check-cast p1, Li/n;

    .line 219
    .line 220
    iget v0, p1, Li/n;->a:F

    .line 221
    .line 222
    iget p1, p1, Li/n;->b:F

    .line 223
    .line 224
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    int-to-long v0, v0

    .line 229
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    int-to-long v2, p1

    .line 234
    shl-long/2addr v0, v6

    .line 235
    and-long/2addr v2, v4

    .line 236
    or-long/2addr v0, v2

    .line 237
    new-instance p1, Le1/e;

    .line 238
    .line 239
    invoke-direct {p1, v0, v1}, Le1/e;-><init>(J)V

    .line 240
    .line 241
    .line 242
    return-object p1

    .line 243
    :pswitch_b
    check-cast p1, Le1/e;

    .line 244
    .line 245
    new-instance v0, Li/n;

    .line 246
    .line 247
    iget-wide v1, p1, Le1/e;->a:J

    .line 248
    .line 249
    shr-long/2addr v1, v6

    .line 250
    long-to-int v1, v1

    .line 251
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    iget-wide v2, p1, Le1/e;->a:J

    .line 256
    .line 257
    and-long/2addr v2, v4

    .line 258
    long-to-int p1, v2

    .line 259
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    invoke-direct {v0, v1, p1}, Li/n;-><init>(FF)V

    .line 264
    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_c
    check-cast p1, Li/n;

    .line 268
    .line 269
    iget v0, p1, Li/n;->a:F

    .line 270
    .line 271
    iget p1, p1, Li/n;->b:F

    .line 272
    .line 273
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    int-to-long v0, v0

    .line 278
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    int-to-long v2, p1

    .line 283
    shl-long/2addr v0, v6

    .line 284
    and-long/2addr v2, v4

    .line 285
    or-long/2addr v0, v2

    .line 286
    new-instance p1, Lu2/g;

    .line 287
    .line 288
    invoke-direct {p1, v0, v1}, Lu2/g;-><init>(J)V

    .line 289
    .line 290
    .line 291
    return-object p1

    .line 292
    :pswitch_d
    check-cast p1, Lu2/g;

    .line 293
    .line 294
    new-instance v0, Li/n;

    .line 295
    .line 296
    iget-wide v1, p1, Lu2/g;->a:J

    .line 297
    .line 298
    shr-long/2addr v1, v6

    .line 299
    long-to-int v1, v1

    .line 300
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    iget-wide v2, p1, Lu2/g;->a:J

    .line 305
    .line 306
    and-long/2addr v2, v4

    .line 307
    long-to-int p1, v2

    .line 308
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    invoke-direct {v0, v1, p1}, Li/n;-><init>(FF)V

    .line 313
    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_e
    check-cast p1, Li/m;

    .line 317
    .line 318
    iget p1, p1, Li/m;->a:F

    .line 319
    .line 320
    new-instance v0, Lu2/f;

    .line 321
    .line 322
    invoke-direct {v0, p1}, Lu2/f;-><init>(F)V

    .line 323
    .line 324
    .line 325
    return-object v0

    .line 326
    :pswitch_f
    check-cast p1, Lu2/f;

    .line 327
    .line 328
    new-instance v0, Li/m;

    .line 329
    .line 330
    iget p1, p1, Lu2/f;->g:F

    .line 331
    .line 332
    invoke-direct {v0, p1}, Li/m;-><init>(F)V

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :pswitch_10
    check-cast p1, Li/m;

    .line 337
    .line 338
    iget p1, p1, Li/m;->a:F

    .line 339
    .line 340
    float-to-int p1, p1

    .line 341
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    return-object p1

    .line 346
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    new-instance v0, Li/m;

    .line 353
    .line 354
    int-to-float p1, p1

    .line 355
    invoke-direct {v0, p1}, Li/m;-><init>(F)V

    .line 356
    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_12
    check-cast p1, Ljava/lang/Float;

    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    new-instance v0, Li/m;

    .line 366
    .line 367
    invoke-direct {v0, p1}, Li/m;-><init>(F)V

    .line 368
    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_13
    check-cast p1, Li/j;

    .line 372
    .line 373
    return-object v1

    .line 374
    :pswitch_14
    check-cast p1, Log/f;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    check-cast p1, Log/i;

    .line 380
    .line 381
    invoke-virtual {p1}, Log/i;->a()Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v0, Log/g;

    .line 386
    .line 387
    invoke-virtual {v0, v3}, Log/g;->get(I)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    check-cast v0, Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {p1}, Log/i;->a()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    check-cast v1, Log/g;

    .line 398
    .line 399
    const/4 v4, 0x2

    .line 400
    invoke-virtual {v1, v4}, Log/g;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    check-cast v1, Ljava/lang/String;

    .line 405
    .line 406
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    new-array v3, v3, [C

    .line 415
    .line 416
    const/16 v5, 0x2c

    .line 417
    .line 418
    aput-char v5, v3, v2

    .line 419
    .line 420
    const/4 v5, 0x6

    .line 421
    invoke-static {v1, v3, v5}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    new-instance v5, Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 428
    .line 429
    .line 430
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    if-eqz v6, :cond_4

    .line 439
    .line 440
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    check-cast v6, Ljava/lang/String;

    .line 445
    .line 446
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    invoke-static {v6}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    if-eqz v6, :cond_3

    .line 459
    .line 460
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    goto :goto_1

    .line 464
    :cond_4
    invoke-static {v5}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-eqz v2, :cond_5

    .line 477
    .line 478
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-eqz v2, :cond_5

    .line 487
    .line 488
    invoke-virtual {p1}, Log/i;->c()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    goto :goto_3

    .line 493
    :cond_5
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 494
    .line 495
    .line 496
    move-result p1

    .line 497
    const/4 v2, 0x0

    .line 498
    if-nez p1, :cond_6

    .line 499
    .line 500
    goto :goto_2

    .line 501
    :cond_6
    move-object v1, v2

    .line 502
    :goto_2
    if-eqz v1, :cond_7

    .line 503
    .line 504
    const-string p1, ","

    .line 505
    .line 506
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    :cond_7
    if-nez v2, :cond_8

    .line 511
    .line 512
    const-string v2, ""

    .line 513
    .line 514
    :cond_8
    const-string p1, " in (0,2"

    .line 515
    .line 516
    const-string v1, "))"

    .line 517
    .line 518
    const-string v3, "("

    .line 519
    .line 520
    invoke-static {v3, v0, p1, v2, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object p1

    .line 524
    :goto_3
    return-object p1

    .line 525
    :pswitch_15
    check-cast p1, Ljava/lang/reflect/Method;

    .line 526
    .line 527
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    return-object p1

    .line 538
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 539
    .line 540
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 544
    .line 545
    .line 546
    move-result p1

    .line 547
    xor-int/2addr p1, v3

    .line 548
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    return-object p1

    .line 553
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 554
    .line 555
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    xor-int/2addr p1, v3

    .line 563
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    return-object p1

    .line 568
    :pswitch_18
    check-cast p1, Ljava/lang/String;

    .line 569
    .line 570
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 574
    .line 575
    .line 576
    move-result p1

    .line 577
    xor-int/2addr p1, v3

    .line 578
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    return-object p1

    .line 583
    :pswitch_19
    check-cast p1, Li/n;

    .line 584
    .line 585
    iget v0, p1, Li/n;->a:F

    .line 586
    .line 587
    iget p1, p1, Li/n;->b:F

    .line 588
    .line 589
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    int-to-long v0, v0

    .line 594
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 595
    .line 596
    .line 597
    move-result p1

    .line 598
    int-to-long v2, p1

    .line 599
    shl-long/2addr v0, v6

    .line 600
    and-long/2addr v2, v4

    .line 601
    or-long/2addr v0, v2

    .line 602
    new-instance p1, Le1/b;

    .line 603
    .line 604
    invoke-direct {p1, v0, v1}, Le1/b;-><init>(J)V

    .line 605
    .line 606
    .line 607
    return-object p1

    .line 608
    :pswitch_1a
    check-cast p1, Le1/b;

    .line 609
    .line 610
    iget-wide v0, p1, Le1/b;->a:J

    .line 611
    .line 612
    const-wide v2, 0x7fffffff7fffffffL

    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    and-long/2addr v2, v0

    .line 618
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    cmp-long v2, v2, v7

    .line 624
    .line 625
    if-eqz v2, :cond_9

    .line 626
    .line 627
    new-instance v2, Li/n;

    .line 628
    .line 629
    shr-long/2addr v0, v6

    .line 630
    long-to-int v0, v0

    .line 631
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    iget-wide v6, p1, Le1/b;->a:J

    .line 636
    .line 637
    and-long v3, v6, v4

    .line 638
    .line 639
    long-to-int p1, v3

    .line 640
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 641
    .line 642
    .line 643
    move-result p1

    .line 644
    invoke-direct {v2, v0, p1}, Li/n;-><init>(FF)V

    .line 645
    .line 646
    .line 647
    goto :goto_4

    .line 648
    :cond_9
    sget-object v2, Lh0/m0;->a:Li/n;

    .line 649
    .line 650
    :goto_4
    return-object v2

    .line 651
    :pswitch_1b
    check-cast p1, Ljava/lang/Byte;

    .line 652
    .line 653
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 654
    .line 655
    .line 656
    move-result p1

    .line 657
    and-int/lit16 p1, p1, 0xff

    .line 658
    .line 659
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object p1

    .line 667
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    const-string v0, "%02x"

    .line 672
    .line 673
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object p1

    .line 677
    return-object p1

    .line 678
    :pswitch_1c
    check-cast p1, Lx1/e2;

    .line 679
    .line 680
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 681
    .line 682
    return-object p1

    .line 683
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
