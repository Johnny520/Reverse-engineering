.class public final synthetic Lpc;
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


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lpc;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lpc;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lpc;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lpc;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lpc;->l:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lpc;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, La83;->a:La83;

    .line 6
    .line 7
    iget-object v4, p0, Lpc;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, Lpc;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, p0, Lpc;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, Lpc;->i:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Lz62;

    .line 19
    .line 20
    check-cast v6, Lsi1;

    .line 21
    .line 22
    check-cast v5, Lgm2;

    .line 23
    .line 24
    check-cast v4, Lh9;

    .line 25
    .line 26
    check-cast p1, Lgd;

    .line 27
    .line 28
    iget-object v0, p1, Lgd;->e:Lnx1;

    .line 29
    .line 30
    iget-object v1, p1, Lgd;->d:Lxm0;

    .line 31
    .line 32
    iget-object p1, p1, Lgd;->i:Lnx1;

    .line 33
    .line 34
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, Lz62;->h:F

    .line 45
    .line 46
    sub-float/2addr v0, v2

    .line 47
    invoke-static {v0}, Lrp0;->S(F)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v6, v5, v0}, Lsi1;->e(Lgm2;F)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    sub-float v2, v0, v2

    .line 58
    .line 59
    invoke-static {v2}, Lrp0;->S(F)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Lxm0;->a()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget v2, p0, Lz62;->h:F

    .line 75
    .line 76
    add-float/2addr v2, v0

    .line 77
    iput v2, p0, Lz62;->h:F

    .line 78
    .line 79
    :cond_1
    iget p0, p0, Lz62;->h:F

    .line 80
    .line 81
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v4, p0}, Lh9;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_2

    .line 96
    .line 97
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1}, Lxm0;->a()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_0
    return-object v3

    .line 106
    :pswitch_0
    check-cast v6, Lmn0;

    .line 107
    .line 108
    check-cast v5, Lyf1;

    .line 109
    .line 110
    check-cast v4, Ljava/lang/String;

    .line 111
    .line 112
    instance-of v0, p0, Ljava/util/Collection;

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    move-object v0, p0

    .line 117
    check-cast v0, Ljava/util/Collection;

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_3

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    move-object p0, v1

    .line 127
    :cond_4
    :goto_1
    if-eqz p0, :cond_8

    .line 128
    .line 129
    invoke-interface {v6, p0, p1}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    iget-object v0, v5, Lyf1;->d:Lxf1;

    .line 140
    .line 141
    sget-object v3, Lxf1;->j:Lxf1;

    .line 142
    .line 143
    if-eq v0, v3, :cond_8

    .line 144
    .line 145
    sget-object v0, Ltp0;->k:Ly41;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-gtz v0, :cond_8

    .line 152
    .line 153
    invoke-static {p0}, Lj93;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    const-string v0, ""

    .line 158
    .line 159
    const-string v3, " (Kotlin reflection is not available)"

    .line 160
    .line 161
    if-eqz p0, :cond_5

    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0, v3, v0}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    goto :goto_2

    .line 172
    :cond_5
    move-object p0, v1

    .line 173
    :goto_2
    if-eqz p1, :cond_6

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p1, v3, v0}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    goto :goto_3

    .line 184
    :cond_6
    move-object p1, v1

    .line 185
    :goto_3
    if-eqz v2, :cond_7

    .line 186
    .line 187
    const-string v0, "HIT"

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_7
    const-string v0, "MISS"

    .line 191
    .line 192
    :goto_4
    const-string v3, "] "

    .line 193
    .line 194
    const-string v5, ": "

    .line 195
    .line 196
    const-string v6, "[FILTER] ["

    .line 197
    .line 198
    invoke-static {v6, v0, v3, v4, v5}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string p0, " [RESOLVED] "

    .line 206
    .line 207
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    sget-object p1, Ltp0;->k:Ly41;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-gtz p1, :cond_8

    .line 224
    .line 225
    const-string p1, "KavaRef"

    .line 226
    .line 227
    invoke-static {p1, p0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 228
    .line 229
    .line 230
    :cond_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :pswitch_1
    check-cast p0, Lj81;

    .line 236
    .line 237
    check-cast v6, Lz71;

    .line 238
    .line 239
    check-cast v5, Lhw2;

    .line 240
    .line 241
    check-cast v4, Lq22;

    .line 242
    .line 243
    check-cast p1, Lba0;

    .line 244
    .line 245
    new-instance p1, Lf90;

    .line 246
    .line 247
    invoke-direct {p1, v6, v5, v4}, Lf90;-><init>(Lz71;Lhw2;Lq22;)V

    .line 248
    .line 249
    .line 250
    iput-object p1, p0, Lj81;->c:Lf90;

    .line 251
    .line 252
    new-instance p1, Lf8;

    .line 253
    .line 254
    const/4 v0, 0x7

    .line 255
    invoke-direct {p1, v0, p0}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    return-object p1

    .line 259
    :pswitch_2
    check-cast p0, Lxk1;

    .line 260
    .line 261
    check-cast v6, Lcz0;

    .line 262
    .line 263
    check-cast v5, Lz62;

    .line 264
    .line 265
    check-cast v4, Lj20;

    .line 266
    .line 267
    check-cast p1, Ljava/lang/Long;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 270
    .line 271
    .line 272
    move-result-wide v0

    .line 273
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    check-cast p0, Lgu2;

    .line 278
    .line 279
    if-eqz p0, :cond_9

    .line 280
    .line 281
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Ljava/lang/Number;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 288
    .line 289
    .line 290
    move-result-wide p0

    .line 291
    goto :goto_5

    .line 292
    :cond_9
    move-wide p0, v0

    .line 293
    :goto_5
    iget-wide v7, v6, Lcz0;->c:J

    .line 294
    .line 295
    iget-object v9, v6, Lcz0;->a:Lzk1;

    .line 296
    .line 297
    const-wide/high16 v10, -0x8000000000000000L

    .line 298
    .line 299
    cmp-long v7, v7, v10

    .line 300
    .line 301
    const/4 v8, 0x0

    .line 302
    if-eqz v7, :cond_a

    .line 303
    .line 304
    iget v7, v5, Lz62;->h:F

    .line 305
    .line 306
    invoke-interface {v4}, Lj20;->g()La20;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    invoke-static {v10}, Lte;->F(La20;)F

    .line 311
    .line 312
    .line 313
    move-result v10

    .line 314
    cmpg-float v7, v7, v10

    .line 315
    .line 316
    if-nez v7, :cond_a

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_a
    iput-wide v0, v6, Lcz0;->c:J

    .line 320
    .line 321
    iget-object v0, v9, Lzk1;->h:[Ljava/lang/Object;

    .line 322
    .line 323
    iget v1, v9, Lzk1;->j:I

    .line 324
    .line 325
    move v7, v8

    .line 326
    :goto_6
    if-ge v7, v1, :cond_b

    .line 327
    .line 328
    aget-object v10, v0, v7

    .line 329
    .line 330
    check-cast v10, Laz0;

    .line 331
    .line 332
    iput-boolean v2, v10, Laz0;->m:Z

    .line 333
    .line 334
    add-int/lit8 v7, v7, 0x1

    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_b
    invoke-interface {v4}, Lj20;->g()La20;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v0}, Lte;->F(La20;)F

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    iput v0, v5, Lz62;->h:F

    .line 346
    .line 347
    :goto_7
    iget v0, v5, Lz62;->h:F

    .line 348
    .line 349
    const/4 v1, 0x0

    .line 350
    cmpg-float v1, v0, v1

    .line 351
    .line 352
    if-nez v1, :cond_c

    .line 353
    .line 354
    iget-object p0, v9, Lzk1;->h:[Ljava/lang/Object;

    .line 355
    .line 356
    iget p1, v9, Lzk1;->j:I

    .line 357
    .line 358
    :goto_8
    if-ge v8, p1, :cond_11

    .line 359
    .line 360
    aget-object v0, p0, v8

    .line 361
    .line 362
    check-cast v0, Laz0;

    .line 363
    .line 364
    iget-object v1, v0, Laz0;->k:Lcy2;

    .line 365
    .line 366
    iget-object v1, v1, Lcy2;->c:Ljava/lang/Object;

    .line 367
    .line 368
    iget-object v4, v0, Laz0;->j:Lnx1;

    .line 369
    .line 370
    invoke-virtual {v4, v1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    iput-boolean v2, v0, Laz0;->m:Z

    .line 374
    .line 375
    add-int/lit8 v8, v8, 0x1

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_c
    iget-wide v4, v6, Lcz0;->c:J

    .line 379
    .line 380
    sub-long/2addr p0, v4

    .line 381
    long-to-float p0, p0

    .line 382
    div-float/2addr p0, v0

    .line 383
    float-to-long p0, p0

    .line 384
    iget-object v0, v9, Lzk1;->h:[Ljava/lang/Object;

    .line 385
    .line 386
    iget v1, v9, Lzk1;->j:I

    .line 387
    .line 388
    move v5, v2

    .line 389
    move v4, v8

    .line 390
    :goto_9
    if-ge v4, v1, :cond_10

    .line 391
    .line 392
    aget-object v7, v0, v4

    .line 393
    .line 394
    check-cast v7, Laz0;

    .line 395
    .line 396
    iget-boolean v9, v7, Laz0;->l:Z

    .line 397
    .line 398
    if-nez v9, :cond_e

    .line 399
    .line 400
    iget-object v9, v7, Laz0;->o:Lcz0;

    .line 401
    .line 402
    iget-object v9, v9, Lcz0;->b:Lnx1;

    .line 403
    .line 404
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {v9, v10}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    iget-boolean v9, v7, Laz0;->m:Z

    .line 410
    .line 411
    if-eqz v9, :cond_d

    .line 412
    .line 413
    iput-boolean v8, v7, Laz0;->m:Z

    .line 414
    .line 415
    iput-wide p0, v7, Laz0;->n:J

    .line 416
    .line 417
    :cond_d
    iget-wide v9, v7, Laz0;->n:J

    .line 418
    .line 419
    sub-long v9, p0, v9

    .line 420
    .line 421
    iget-object v11, v7, Laz0;->k:Lcy2;

    .line 422
    .line 423
    invoke-virtual {v11, v9, v10}, Lcy2;->b(J)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    iget-object v12, v7, Laz0;->j:Lnx1;

    .line 428
    .line 429
    invoke-virtual {v12, v11}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    iget-object v11, v7, Laz0;->k:Lcy2;

    .line 433
    .line 434
    invoke-interface {v11, v9, v10}, Led;->g(J)Z

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    iput-boolean v9, v7, Laz0;->l:Z

    .line 439
    .line 440
    :cond_e
    iget-boolean v7, v7, Laz0;->l:Z

    .line 441
    .line 442
    if-nez v7, :cond_f

    .line 443
    .line 444
    move v5, v8

    .line 445
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_10
    xor-int/lit8 p0, v5, 0x1

    .line 449
    .line 450
    iget-object p1, v6, Lcz0;->d:Lnx1;

    .line 451
    .line 452
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    invoke-virtual {p1, p0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :cond_11
    return-object v3

    .line 460
    :pswitch_3
    check-cast p0, Lz62;

    .line 461
    .line 462
    check-cast v6, Lem2;

    .line 463
    .line 464
    check-cast v5, Lz62;

    .line 465
    .line 466
    check-cast v4, Ln50;

    .line 467
    .line 468
    check-cast p1, Lgd;

    .line 469
    .line 470
    iget-object v0, p1, Lgd;->e:Lnx1;

    .line 471
    .line 472
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    check-cast v0, Ljava/lang/Number;

    .line 477
    .line 478
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    iget v1, p0, Lz62;->h:F

    .line 483
    .line 484
    sub-float/2addr v0, v1

    .line 485
    invoke-virtual {v6, v0}, Lem2;->a(F)F

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    iget-object v2, p1, Lgd;->e:Lnx1;

    .line 490
    .line 491
    invoke-virtual {v2}, Lnx1;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    check-cast v2, Ljava/lang/Number;

    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    iput v2, p0, Lz62;->h:F

    .line 502
    .line 503
    iget-object p0, p1, Lgd;->a:Ln43;

    .line 504
    .line 505
    iget-object p0, p0, Ln43;->b:Lin0;

    .line 506
    .line 507
    iget-object v2, p1, Lgd;->f:Lnd;

    .line 508
    .line 509
    invoke-interface {p0, v2}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object p0

    .line 513
    check-cast p0, Ljava/lang/Number;

    .line 514
    .line 515
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 516
    .line 517
    .line 518
    move-result p0

    .line 519
    iput p0, v5, Lz62;->h:F

    .line 520
    .line 521
    sub-float/2addr v0, v1

    .line 522
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 523
    .line 524
    .line 525
    move-result p0

    .line 526
    const/high16 v0, 0x3f000000    # 0.5f

    .line 527
    .line 528
    cmpl-float p0, p0, v0

    .line 529
    .line 530
    if-lez p0, :cond_12

    .line 531
    .line 532
    iget-object p0, p1, Lgd;->i:Lnx1;

    .line 533
    .line 534
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 535
    .line 536
    invoke-virtual {p0, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    iget-object p0, p1, Lgd;->d:Lxm0;

    .line 540
    .line 541
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    :cond_12
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    return-object v3

    .line 548
    :pswitch_4
    check-cast p0, Lt91;

    .line 549
    .line 550
    check-cast v6, Lo03;

    .line 551
    .line 552
    check-cast v5, Lk03;

    .line 553
    .line 554
    check-cast v4, Lxx0;

    .line 555
    .line 556
    check-cast p1, Lba0;

    .line 557
    .line 558
    invoke-virtual {p0}, Lt91;->b()Z

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    if-eqz p1, :cond_13

    .line 563
    .line 564
    iget-object p1, p0, Lt91;->d:Lsz0;

    .line 565
    .line 566
    iget-object v0, p0, Lt91;->v:Ln10;

    .line 567
    .line 568
    iget-object v1, p0, Lt91;->w:Ln10;

    .line 569
    .line 570
    new-instance v3, Lo72;

    .line 571
    .line 572
    invoke-direct {v3}, Lo72;-><init>()V

    .line 573
    .line 574
    .line 575
    new-instance v7, Lm0;

    .line 576
    .line 577
    invoke-direct {v7, p1, v0, v3}, Lm0;-><init>(Lsz0;Ln10;Lo72;)V

    .line 578
    .line 579
    .line 580
    iget-object p1, v6, Lo03;->a:Lv02;

    .line 581
    .line 582
    invoke-interface {p1, v5, v4, v7, v1}, Lv02;->f(Lk03;Lxx0;Lm0;Ln10;)V

    .line 583
    .line 584
    .line 585
    new-instance v0, Lt03;

    .line 586
    .line 587
    invoke-direct {v0, v6, p1}, Lt03;-><init>(Lo03;Lv02;)V

    .line 588
    .line 589
    .line 590
    iget-object p1, v6, Lo03;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 591
    .line 592
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    iput-object v0, v3, Lo72;->i:Ljava/lang/Object;

    .line 596
    .line 597
    iput-object v0, p0, Lt91;->e:Lt03;

    .line 598
    .line 599
    :cond_13
    new-instance p0, Lka;

    .line 600
    .line 601
    invoke-direct {p0, v2}, Lka;-><init>(I)V

    .line 602
    .line 603
    .line 604
    return-object p0

    .line 605
    :pswitch_5
    check-cast p0, Landroid/content/Context;

    .line 606
    .line 607
    check-cast v6, Lkx1;

    .line 608
    .line 609
    check-cast v5, Lxk1;

    .line 610
    .line 611
    check-cast v4, Lxk1;

    .line 612
    .line 613
    check-cast p1, Ls81;

    .line 614
    .line 615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    sget-object v0, Lci0;->h:Lkw;

    .line 619
    .line 620
    const/4 v7, 0x3

    .line 621
    invoke-static {p1, v1, v0, v7}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 622
    .line 623
    .line 624
    new-instance v0, Lb81;

    .line 625
    .line 626
    invoke-direct {v0, p0, v6, v5, v4}, Lb81;-><init>(Landroid/content/Context;Lkx1;Lxk1;Lxk1;)V

    .line 627
    .line 628
    .line 629
    new-instance p0, Lkw;

    .line 630
    .line 631
    const v4, 0x6c4162bd

    .line 632
    .line 633
    .line 634
    invoke-direct {p0, v4, v2, v0}, Lkw;-><init>(IZLun0;)V

    .line 635
    .line 636
    .line 637
    invoke-static {p1, v1, p0, v7}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 638
    .line 639
    .line 640
    return-object v3

    .line 641
    :pswitch_6
    check-cast p0, Lsc;

    .line 642
    .line 643
    check-cast v6, Lid;

    .line 644
    .line 645
    check-cast v5, Lin0;

    .line 646
    .line 647
    check-cast v4, Ly62;

    .line 648
    .line 649
    check-cast p1, Lgd;

    .line 650
    .line 651
    iget-object v0, p0, Lsc;->c:Lid;

    .line 652
    .line 653
    invoke-static {p1, v0}, Lte;->p0(Lgd;Lid;)V

    .line 654
    .line 655
    .line 656
    iget-object v0, p1, Lgd;->e:Lnx1;

    .line 657
    .line 658
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    invoke-static {p0, v1}, Lsc;->a(Lsc;Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-static {v1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-nez v0, :cond_15

    .line 675
    .line 676
    iget-object v0, p0, Lsc;->c:Lid;

    .line 677
    .line 678
    iget-object v0, v0, Lid;->i:Lnx1;

    .line 679
    .line 680
    invoke-virtual {v0, v1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    iget-object v0, v6, Lid;->i:Lnx1;

    .line 684
    .line 685
    invoke-virtual {v0, v1}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    if-eqz v5, :cond_14

    .line 689
    .line 690
    invoke-interface {v5, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    :cond_14
    iget-object p0, p1, Lgd;->i:Lnx1;

    .line 694
    .line 695
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 696
    .line 697
    invoke-virtual {p0, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    iget-object p0, p1, Lgd;->d:Lxm0;

    .line 701
    .line 702
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    iput-boolean v2, v4, Ly62;->h:Z

    .line 706
    .line 707
    goto :goto_a

    .line 708
    :cond_15
    if-eqz v5, :cond_16

    .line 709
    .line 710
    invoke-interface {v5, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    :cond_16
    :goto_a
    return-object v3

    .line 714
    nop

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
