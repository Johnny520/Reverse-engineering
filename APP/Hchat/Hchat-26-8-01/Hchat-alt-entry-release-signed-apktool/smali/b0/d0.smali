.class public final synthetic Lb0/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    iput v0, p0, Lb0/d0;->g:I

    .line 4
    .line 5
    sget-object v0, Lj8/d;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lb0/d0;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 13
    iput p2, p0, Lb0/d0;->g:I

    iput-object p1, p0, Lb0/d0;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Lb0/d0;->g:I

    iput-object p1, p0, Lb0/d0;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lb0/d0;->g:I

    .line 6
    .line 7
    const/16 v5, 0x20

    .line 8
    .line 9
    const-wide v6, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v11, 0x0

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ln2/g;

    .line 23
    .line 24
    check-cast v0, Ln2/g;

    .line 25
    .line 26
    if-ne v2, v0, :cond_0

    .line 27
    .line 28
    const-string v2, " > "

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v2, "   "

    .line 32
    .line 33
    :goto_0
    const-string v3, ", newCursorPosition="

    .line 34
    .line 35
    instance-of v4, v0, Ln2/a;

    .line 36
    .line 37
    const/16 v5, 0x29

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v6, "CommitTextCommand(text.length="

    .line 44
    .line 45
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v0, Ln2/a;

    .line 49
    .line 50
    iget-object v6, v0, Ln2/a;->a:Li2/g;

    .line 51
    .line 52
    iget-object v6, v6, Li2/g;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget v0, v0, Ln2/a;->b:I

    .line 65
    .line 66
    :goto_1
    invoke-static {v4, v0, v5}, Lp/a;->n(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :cond_1
    instance-of v4, v0, Ln2/q;

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    new-instance v4, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v6, "SetComposingTextCommand(text.length="

    .line 79
    .line 80
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    check-cast v0, Ln2/q;

    .line 84
    .line 85
    iget-object v6, v0, Ln2/q;->a:Li2/g;

    .line 86
    .line 87
    iget-object v6, v6, Li2/g;->h:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget v0, v0, Ln2/q;->b:I

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    instance-of v3, v0, Ln2/p;

    .line 103
    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    check-cast v0, Ln2/p;

    .line 107
    .line 108
    invoke-virtual {v0}, Ln2/p;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    instance-of v3, v0, Ln2/e;

    .line 114
    .line 115
    if-eqz v3, :cond_4

    .line 116
    .line 117
    check-cast v0, Ln2/e;

    .line 118
    .line 119
    invoke-virtual {v0}, Ln2/e;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    instance-of v3, v0, Ln2/f;

    .line 125
    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    check-cast v0, Ln2/f;

    .line 129
    .line 130
    invoke-virtual {v0}, Ln2/f;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    instance-of v3, v0, Ln2/r;

    .line 136
    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    check-cast v0, Ln2/r;

    .line 140
    .line 141
    invoke-virtual {v0}, Ln2/r;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto :goto_2

    .line 146
    :cond_6
    instance-of v3, v0, Ln2/h;

    .line 147
    .line 148
    if-eqz v3, :cond_7

    .line 149
    .line 150
    const-string v0, "FinishComposingTextCommand()"

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_7
    instance-of v3, v0, Ln2/d;

    .line 154
    .line 155
    if-eqz v3, :cond_8

    .line 156
    .line 157
    const-string v0, "DeleteAllCommand()"

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Lgg/v;->a(Ljava/lang/Class;)Lgg/f;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, Lgg/f;->c()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-nez v0, :cond_9

    .line 173
    .line 174
    const-string v0, "{anonymous EditCommand}"

    .line 175
    .line 176
    :cond_9
    const-string v3, "Unknown EditCommand: "

    .line 177
    .line 178
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0

    .line 187
    :pswitch_0
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Lm2/e;

    .line 190
    .line 191
    check-cast v0, Lm2/q;

    .line 192
    .line 193
    iget-object v5, v0, Lm2/q;->b:Lm2/k;

    .line 194
    .line 195
    iget v6, v0, Lm2/q;->c:I

    .line 196
    .line 197
    iget v7, v0, Lm2/q;->d:I

    .line 198
    .line 199
    iget-object v8, v0, Lm2/q;->e:Ljava/lang/Object;

    .line 200
    .line 201
    new-instance v3, Lm2/q;

    .line 202
    .line 203
    const/4 v4, 0x0

    .line 204
    invoke-direct/range {v3 .. v8}, Lm2/q;-><init>(Lm2/p;Lm2/k;IILjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v3}, Lm2/e;->a(Lm2/q;)Lm2/r;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object v0, v0, Lm2/r;->g:Ljava/lang/Object;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_1
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v2, Lm/o2;

    .line 217
    .line 218
    check-cast v0, Le1/b;

    .line 219
    .line 220
    iget-object v3, v2, Lm/o2;->k:Lm/u1;

    .line 221
    .line 222
    iget-wide v4, v0, Le1/b;->a:J

    .line 223
    .line 224
    iget v0, v2, Lm/o2;->j:I

    .line 225
    .line 226
    invoke-virtual {v2, v3, v4, v5, v0}, Lm/o2;->c(Lm/u1;JI)J

    .line 227
    .line 228
    .line 229
    move-result-wide v2

    .line 230
    new-instance v0, Le1/b;

    .line 231
    .line 232
    invoke-direct {v0, v2, v3}, Le1/b;-><init>(J)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_2
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v2, Lc9/q0;

    .line 239
    .line 240
    check-cast v0, Ls1/t;

    .line 241
    .line 242
    invoke-static {v0, v11}, Ls1/s;->h(Ls1/t;Z)J

    .line 243
    .line 244
    .line 245
    move-result-wide v3

    .line 246
    new-instance v5, Le1/b;

    .line 247
    .line 248
    invoke-direct {v5, v3, v4}, Le1/b;-><init>(J)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v0, v5}, Lc9/q0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ls1/t;->a()V

    .line 255
    .line 256
    .line 257
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_3
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v2, Lw/t0;

    .line 263
    .line 264
    check-cast v0, Ls1/t;

    .line 265
    .line 266
    invoke-virtual {v2}, Lw/t0;->invoke()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_4
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v2, Lk/w1;

    .line 275
    .line 276
    check-cast v0, Ljava/lang/Float;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    iget-object v3, v2, Lk/w1;->a:Li0/g1;

    .line 283
    .line 284
    invoke-virtual {v3}, Li0/g1;->g()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    int-to-float v4, v4

    .line 289
    add-float/2addr v4, v0

    .line 290
    iget v5, v2, Lk/w1;->f:F

    .line 291
    .line 292
    add-float/2addr v4, v5

    .line 293
    iget-object v5, v2, Lk/w1;->e:Li0/g1;

    .line 294
    .line 295
    invoke-virtual {v5}, Li0/g1;->g()I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    int-to-float v5, v5

    .line 300
    invoke-static {v4, v8, v5}, Lr9/e0;->q(FFF)F

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    cmpg-float v4, v4, v5

    .line 305
    .line 306
    if-nez v4, :cond_a

    .line 307
    .line 308
    const/4 v10, 0x1

    .line 309
    goto :goto_3

    .line 310
    :cond_a
    move v10, v11

    .line 311
    :goto_3
    invoke-virtual {v3}, Li0/g1;->g()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    int-to-float v4, v4

    .line 316
    sub-float/2addr v5, v4

    .line 317
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    invoke-virtual {v3}, Li0/g1;->g()I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    add-int/2addr v6, v4

    .line 326
    invoke-virtual {v3, v6}, Li0/g1;->h(I)V

    .line 327
    .line 328
    .line 329
    int-to-float v3, v4

    .line 330
    sub-float v3, v5, v3

    .line 331
    .line 332
    iput v3, v2, Lk/w1;->f:F

    .line 333
    .line 334
    if-nez v10, :cond_b

    .line 335
    .line 336
    move v0, v5

    .line 337
    :cond_b
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    return-object v0

    .line 342
    :pswitch_5
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v2, Lk/s;

    .line 345
    .line 346
    check-cast v0, Lc1/d;

    .line 347
    .line 348
    iget v13, v2, Lk/s;->x:F

    .line 349
    .line 350
    invoke-virtual {v0}, Lc1/d;->d()F

    .line 351
    .line 352
    .line 353
    move-result v14

    .line 354
    mul-float/2addr v14, v13

    .line 355
    cmpl-float v13, v14, v8

    .line 356
    .line 357
    if-ltz v13, :cond_25

    .line 358
    .line 359
    iget-object v13, v0, Lc1/d;->g:Lc1/a;

    .line 360
    .line 361
    invoke-interface {v13}, Lc1/a;->a()J

    .line 362
    .line 363
    .line 364
    move-result-wide v13

    .line 365
    invoke-static {v13, v14}, Le1/e;->b(J)F

    .line 366
    .line 367
    .line 368
    move-result v13

    .line 369
    cmpl-float v13, v13, v8

    .line 370
    .line 371
    if-lez v13, :cond_25

    .line 372
    .line 373
    iget v13, v2, Lk/s;->x:F

    .line 374
    .line 375
    invoke-static {v13, v8}, Lu2/f;->b(FF)Z

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    const/high16 v13, 0x3f800000    # 1.0f

    .line 380
    .line 381
    if-eqz v8, :cond_c

    .line 382
    .line 383
    move v8, v13

    .line 384
    goto :goto_4

    .line 385
    :cond_c
    iget v8, v2, Lk/s;->x:F

    .line 386
    .line 387
    invoke-virtual {v0}, Lc1/d;->d()F

    .line 388
    .line 389
    .line 390
    move-result v14

    .line 391
    mul-float/2addr v14, v8

    .line 392
    float-to-double v14, v14

    .line 393
    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    .line 394
    .line 395
    .line 396
    move-result-wide v14

    .line 397
    double-to-float v8, v14

    .line 398
    :goto_4
    iget-object v14, v0, Lc1/d;->g:Lc1/a;

    .line 399
    .line 400
    invoke-interface {v14}, Lc1/a;->a()J

    .line 401
    .line 402
    .line 403
    move-result-wide v14

    .line 404
    invoke-static {v14, v15}, Le1/e;->b(J)F

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    int-to-float v9, v9

    .line 409
    div-float/2addr v14, v9

    .line 410
    float-to-double v14, v14

    .line 411
    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    .line 412
    .line 413
    .line 414
    move-result-wide v14

    .line 415
    double-to-float v14, v14

    .line 416
    invoke-static {v8, v14}, Ljava/lang/Math;->min(FF)F

    .line 417
    .line 418
    .line 419
    move-result v16

    .line 420
    div-float v8, v16, v9

    .line 421
    .line 422
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 423
    .line 424
    .line 425
    move-result v14

    .line 426
    int-to-long v14, v14

    .line 427
    const-wide/16 v17, 0x0

    .line 428
    .line 429
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    int-to-long v3, v3

    .line 434
    shl-long/2addr v14, v5

    .line 435
    and-long/2addr v3, v6

    .line 436
    or-long v22, v14, v3

    .line 437
    .line 438
    iget-object v3, v0, Lc1/d;->g:Lc1/a;

    .line 439
    .line 440
    invoke-interface {v3}, Lc1/a;->a()J

    .line 441
    .line 442
    .line 443
    move-result-wide v3

    .line 444
    shr-long/2addr v3, v5

    .line 445
    long-to-int v3, v3

    .line 446
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    sub-float v3, v3, v16

    .line 451
    .line 452
    iget-object v4, v0, Lc1/d;->g:Lc1/a;

    .line 453
    .line 454
    invoke-interface {v4}, Lc1/a;->a()J

    .line 455
    .line 456
    .line 457
    move-result-wide v14

    .line 458
    and-long/2addr v14, v6

    .line 459
    long-to-int v4, v14

    .line 460
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    sub-float v4, v4, v16

    .line 465
    .line 466
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    int-to-long v14, v3

    .line 471
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    int-to-long v3, v3

    .line 476
    shl-long/2addr v14, v5

    .line 477
    and-long/2addr v3, v6

    .line 478
    or-long v24, v14, v3

    .line 479
    .line 480
    mul-float v27, v16, v9

    .line 481
    .line 482
    iget-object v3, v0, Lc1/d;->g:Lc1/a;

    .line 483
    .line 484
    invoke-interface {v3}, Lc1/a;->a()J

    .line 485
    .line 486
    .line 487
    move-result-wide v3

    .line 488
    invoke-static {v3, v4}, Le1/e;->b(J)F

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    cmpl-float v3, v27, v3

    .line 493
    .line 494
    if-lez v3, :cond_d

    .line 495
    .line 496
    const/4 v3, 0x1

    .line 497
    goto :goto_5

    .line 498
    :cond_d
    move v3, v11

    .line 499
    :goto_5
    iget-object v4, v2, Lk/s;->z:Lv/d;

    .line 500
    .line 501
    iget-object v9, v0, Lc1/d;->g:Lc1/a;

    .line 502
    .line 503
    invoke-interface {v9}, Lc1/a;->a()J

    .line 504
    .line 505
    .line 506
    move-result-wide v14

    .line 507
    iget-object v9, v0, Lc1/d;->g:Lc1/a;

    .line 508
    .line 509
    invoke-interface {v9}, Lc1/a;->getLayoutDirection()Lu2/m;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    invoke-virtual {v4, v14, v15, v9, v0}, Lv/d;->a(JLu2/m;Lu2/c;)Lf1/c0;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    instance-of v9, v4, Lf1/j0;

    .line 518
    .line 519
    if-eqz v9, :cond_1b

    .line 520
    .line 521
    iget-object v8, v2, Lk/s;->y:Lf1/t0;

    .line 522
    .line 523
    check-cast v4, Lf1/j0;

    .line 524
    .line 525
    iget-object v9, v4, Lf1/j0;->f:Lf1/j;

    .line 526
    .line 527
    if-eqz v3, :cond_e

    .line 528
    .line 529
    new-instance v2, Lc9/i;

    .line 530
    .line 531
    const/16 v3, 0x1a

    .line 532
    .line 533
    invoke-direct {v2, v4, v3, v8}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v2}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

    .line 537
    .line 538
    .line 539
    move-result-object v12

    .line 540
    goto/16 :goto_10

    .line 541
    .line 542
    :cond_e
    if-eqz v8, :cond_f

    .line 543
    .line 544
    iget-wide v14, v8, Lf1/t0;->a:J

    .line 545
    .line 546
    invoke-static {v14, v15, v13}, Lf1/w;->b(JF)J

    .line 547
    .line 548
    .line 549
    move-result-wide v13

    .line 550
    new-instance v3, Lf1/n;

    .line 551
    .line 552
    const/4 v15, 0x5

    .line 553
    invoke-direct {v3, v13, v14, v15}, Lf1/n;-><init>(JI)V

    .line 554
    .line 555
    .line 556
    move-object/from16 v21, v3

    .line 557
    .line 558
    const/4 v3, 0x1

    .line 559
    goto :goto_6

    .line 560
    :cond_f
    move v3, v11

    .line 561
    const/16 v21, 0x0

    .line 562
    .line 563
    :goto_6
    invoke-virtual {v9}, Lf1/j;->e()Le1/c;

    .line 564
    .line 565
    .line 566
    move-result-object v13

    .line 567
    iget v14, v13, Le1/c;->b:F

    .line 568
    .line 569
    iget v15, v13, Le1/c;->a:F

    .line 570
    .line 571
    move/from16 v19, v5

    .line 572
    .line 573
    iget-object v5, v2, Lk/s;->w:Lk/p;

    .line 574
    .line 575
    if-nez v5, :cond_10

    .line 576
    .line 577
    new-instance v5, Lk/p;

    .line 578
    .line 579
    invoke-direct {v5}, Lk/p;-><init>()V

    .line 580
    .line 581
    .line 582
    iput-object v5, v2, Lk/s;->w:Lk/p;

    .line 583
    .line 584
    :cond_10
    iget-object v5, v2, Lk/s;->w:Lk/p;

    .line 585
    .line 586
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    move-wide/from16 v34, v6

    .line 590
    .line 591
    iget-object v6, v5, Lk/p;->d:Lf1/j;

    .line 592
    .line 593
    if-nez v6, :cond_11

    .line 594
    .line 595
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 596
    .line 597
    .line 598
    move-result-object v6

    .line 599
    iput-object v6, v5, Lk/p;->d:Lf1/j;

    .line 600
    .line 601
    :cond_11
    invoke-virtual {v6}, Lf1/j;->h()V

    .line 602
    .line 603
    .line 604
    invoke-static {v6, v13}, Lf1/j;->b(Lf1/j;Le1/c;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v6, v6, v9, v11}, Lf1/j;->g(Lf1/j;Lf1/j;I)Z

    .line 608
    .line 609
    .line 610
    new-instance v5, Lgg/u;

    .line 611
    .line 612
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 613
    .line 614
    .line 615
    iget v7, v13, Le1/c;->c:F

    .line 616
    .line 617
    sub-float/2addr v7, v15

    .line 618
    float-to-double v11, v7

    .line 619
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 620
    .line 621
    .line 622
    move-result-wide v11

    .line 623
    double-to-float v7, v11

    .line 624
    float-to-int v7, v7

    .line 625
    iget v9, v13, Le1/c;->d:F

    .line 626
    .line 627
    sub-float/2addr v9, v14

    .line 628
    float-to-double v11, v9

    .line 629
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 630
    .line 631
    .line 632
    move-result-wide v11

    .line 633
    double-to-float v9, v11

    .line 634
    float-to-int v9, v9

    .line 635
    int-to-long v11, v7

    .line 636
    shl-long v11, v11, v19

    .line 637
    .line 638
    move-wide/from16 v16, v11

    .line 639
    .line 640
    int-to-long v10, v9

    .line 641
    and-long v9, v10, v34

    .line 642
    .line 643
    or-long v9, v16, v9

    .line 644
    .line 645
    iget-object v2, v2, Lk/s;->w:Lk/p;

    .line 646
    .line 647
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    iget-object v11, v2, Lk/p;->a:Lf1/g;

    .line 651
    .line 652
    iget-object v12, v2, Lk/p;->b:Lf1/b;

    .line 653
    .line 654
    if-eqz v11, :cond_12

    .line 655
    .line 656
    invoke-virtual {v11}, Lf1/g;->a()I

    .line 657
    .line 658
    .line 659
    move-result v7

    .line 660
    move-object/from16 v16, v6

    .line 661
    .line 662
    new-instance v6, Lf1/f0;

    .line 663
    .line 664
    invoke-direct {v6, v7}, Lf1/f0;-><init>(I)V

    .line 665
    .line 666
    .line 667
    goto :goto_7

    .line 668
    :cond_12
    move-object/from16 v16, v6

    .line 669
    .line 670
    const/4 v6, 0x0

    .line 671
    :goto_7
    if-nez v6, :cond_13

    .line 672
    .line 673
    goto :goto_8

    .line 674
    :cond_13
    iget v6, v6, Lf1/f0;->a:I

    .line 675
    .line 676
    if-nez v6, :cond_14

    .line 677
    .line 678
    goto :goto_b

    .line 679
    :cond_14
    :goto_8
    if-eqz v11, :cond_15

    .line 680
    .line 681
    invoke-virtual {v11}, Lf1/g;->a()I

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    new-instance v7, Lf1/f0;

    .line 686
    .line 687
    invoke-direct {v7, v6}, Lf1/f0;-><init>(I)V

    .line 688
    .line 689
    .line 690
    goto :goto_9

    .line 691
    :cond_15
    const/4 v7, 0x0

    .line 692
    :goto_9
    if-nez v7, :cond_16

    .line 693
    .line 694
    goto :goto_a

    .line 695
    :cond_16
    iget v6, v7, Lf1/f0;->a:I

    .line 696
    .line 697
    if-eq v3, v6, :cond_17

    .line 698
    .line 699
    :goto_a
    const/16 v28, 0x0

    .line 700
    .line 701
    goto :goto_c

    .line 702
    :cond_17
    :goto_b
    const/16 v28, 0x1

    .line 703
    .line 704
    :goto_c
    if-eqz v11, :cond_18

    .line 705
    .line 706
    if-eqz v12, :cond_18

    .line 707
    .line 708
    iget-object v6, v0, Lc1/d;->g:Lc1/a;

    .line 709
    .line 710
    invoke-interface {v6}, Lc1/a;->a()J

    .line 711
    .line 712
    .line 713
    move-result-wide v6

    .line 714
    shr-long v6, v6, v19

    .line 715
    .line 716
    long-to-int v6, v6

    .line 717
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 718
    .line 719
    .line 720
    move-result v6

    .line 721
    iget-object v7, v11, Lf1/g;->a:Landroid/graphics/Bitmap;

    .line 722
    .line 723
    move/from16 v17, v6

    .line 724
    .line 725
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    .line 726
    .line 727
    .line 728
    move-result v6

    .line 729
    int-to-float v6, v6

    .line 730
    cmpl-float v6, v17, v6

    .line 731
    .line 732
    if-gtz v6, :cond_18

    .line 733
    .line 734
    iget-object v6, v0, Lc1/d;->g:Lc1/a;

    .line 735
    .line 736
    invoke-interface {v6}, Lc1/a;->a()J

    .line 737
    .line 738
    .line 739
    move-result-wide v17

    .line 740
    move-object/from16 v20, v7

    .line 741
    .line 742
    and-long v6, v17, v34

    .line 743
    .line 744
    long-to-int v6, v6

    .line 745
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 746
    .line 747
    .line 748
    move-result v6

    .line 749
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Bitmap;->getHeight()I

    .line 750
    .line 751
    .line 752
    move-result v7

    .line 753
    int-to-float v7, v7

    .line 754
    cmpl-float v6, v6, v7

    .line 755
    .line 756
    if-gtz v6, :cond_18

    .line 757
    .line 758
    if-nez v28, :cond_19

    .line 759
    .line 760
    :cond_18
    shr-long v6, v9, v19

    .line 761
    .line 762
    long-to-int v6, v6

    .line 763
    and-long v11, v9, v34

    .line 764
    .line 765
    long-to-int v7, v11

    .line 766
    invoke-static {v6, v7, v3}, Lf1/c0;->e(III)Lf1/g;

    .line 767
    .line 768
    .line 769
    move-result-object v11

    .line 770
    iput-object v11, v2, Lk/p;->a:Lf1/g;

    .line 771
    .line 772
    invoke-static {v11}, Lf1/c0;->a(Lf1/g;)Lf1/b;

    .line 773
    .line 774
    .line 775
    move-result-object v12

    .line 776
    iput-object v12, v2, Lk/p;->b:Lf1/b;

    .line 777
    .line 778
    :cond_19
    iget-object v3, v2, Lk/p;->c:Lh1/b;

    .line 779
    .line 780
    if-nez v3, :cond_1a

    .line 781
    .line 782
    new-instance v3, Lh1/b;

    .line 783
    .line 784
    invoke-direct {v3}, Lh1/b;-><init>()V

    .line 785
    .line 786
    .line 787
    iput-object v3, v2, Lk/p;->c:Lh1/b;

    .line 788
    .line 789
    :cond_1a
    iget-object v2, v3, Lh1/b;->h:Lb5/c;

    .line 790
    .line 791
    iget-object v6, v3, Lh1/b;->g:Lh1/a;

    .line 792
    .line 793
    move-object/from16 v17, v8

    .line 794
    .line 795
    invoke-static {v9, v10}, Lr9/e0;->q0(J)J

    .line 796
    .line 797
    .line 798
    move-result-wide v7

    .line 799
    move-object/from16 v36, v3

    .line 800
    .line 801
    iget-object v3, v0, Lc1/d;->g:Lc1/a;

    .line 802
    .line 803
    invoke-interface {v3}, Lc1/a;->getLayoutDirection()Lu2/m;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    move-wide/from16 v22, v9

    .line 808
    .line 809
    iget-object v9, v6, Lh1/a;->a:Lu2/c;

    .line 810
    .line 811
    iget-object v10, v6, Lh1/a;->b:Lu2/m;

    .line 812
    .line 813
    move-object/from16 v18, v13

    .line 814
    .line 815
    iget-object v13, v6, Lh1/a;->c:Lf1/u;

    .line 816
    .line 817
    move-object/from16 v24, v10

    .line 818
    .line 819
    move-object/from16 v20, v11

    .line 820
    .line 821
    iget-wide v10, v6, Lh1/a;->d:J

    .line 822
    .line 823
    iput-object v0, v6, Lh1/a;->a:Lu2/c;

    .line 824
    .line 825
    iput-object v3, v6, Lh1/a;->b:Lu2/m;

    .line 826
    .line 827
    iput-object v12, v6, Lh1/a;->c:Lf1/u;

    .line 828
    .line 829
    iput-wide v7, v6, Lh1/a;->d:J

    .line 830
    .line 831
    invoke-virtual {v12}, Lf1/b;->e()V

    .line 832
    .line 833
    .line 834
    sget-wide v37, Lf1/w;->b:J

    .line 835
    .line 836
    const/16 v42, 0x0

    .line 837
    .line 838
    const/16 v43, 0x3a

    .line 839
    .line 840
    const/16 v41, 0x0

    .line 841
    .line 842
    move-wide/from16 v39, v7

    .line 843
    .line 844
    invoke-static/range {v36 .. v43}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 845
    .line 846
    .line 847
    neg-float v3, v15

    .line 848
    neg-float v7, v14

    .line 849
    iget-object v8, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v8, Landroidx/lifecycle/x;

    .line 852
    .line 853
    invoke-virtual {v8, v3, v7}, Landroidx/lifecycle/x;->c0(FF)V

    .line 854
    .line 855
    .line 856
    :try_start_0
    iget-object v4, v4, Lf1/j0;->f:Lf1/j;

    .line 857
    .line 858
    new-instance v32, Lh1/g;

    .line 859
    .line 860
    const/16 v30, 0x0

    .line 861
    .line 862
    const/16 v31, 0x1e

    .line 863
    .line 864
    const/16 v28, 0x0

    .line 865
    .line 866
    const/16 v29, 0x0

    .line 867
    .line 868
    move-object/from16 v26, v32

    .line 869
    .line 870
    invoke-direct/range {v26 .. v31}, Lh1/g;-><init>(FFIII)V

    .line 871
    .line 872
    .line 873
    const/16 v33, 0x34

    .line 874
    .line 875
    const/16 v31, 0x0

    .line 876
    .line 877
    move-object/from16 v29, v4

    .line 878
    .line 879
    move-object/from16 v30, v17

    .line 880
    .line 881
    move-object/from16 v28, v36

    .line 882
    .line 883
    invoke-static/range {v28 .. v33}, Lh1/d;->s0(Lh1/d;Lf1/j;Lf1/s;FLh1/g;I)V

    .line 884
    .line 885
    .line 886
    invoke-interface/range {v36 .. v36}, Lh1/d;->a()J

    .line 887
    .line 888
    .line 889
    move-result-wide v14

    .line 890
    shr-long v14, v14, v19

    .line 891
    .line 892
    long-to-int v4, v14

    .line 893
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 894
    .line 895
    .line 896
    move-result v4

    .line 897
    const/4 v8, 0x1

    .line 898
    int-to-float v8, v8

    .line 899
    add-float/2addr v4, v8

    .line 900
    invoke-interface/range {v36 .. v36}, Lh1/d;->a()J

    .line 901
    .line 902
    .line 903
    move-result-wide v14

    .line 904
    shr-long v14, v14, v19

    .line 905
    .line 906
    long-to-int v14, v14

    .line 907
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 908
    .line 909
    .line 910
    move-result v14

    .line 911
    div-float/2addr v4, v14

    .line 912
    invoke-interface/range {v36 .. v36}, Lh1/d;->a()J

    .line 913
    .line 914
    .line 915
    move-result-wide v14

    .line 916
    and-long v14, v14, v34

    .line 917
    .line 918
    long-to-int v14, v14

    .line 919
    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 920
    .line 921
    .line 922
    move-result v14

    .line 923
    add-float/2addr v14, v8

    .line 924
    invoke-interface/range {v36 .. v36}, Lh1/d;->a()J

    .line 925
    .line 926
    .line 927
    move-result-wide v25

    .line 928
    move/from16 p1, v14

    .line 929
    .line 930
    and-long v14, v25, v34

    .line 931
    .line 932
    long-to-int v8, v14

    .line 933
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 934
    .line 935
    .line 936
    move-result v8

    .line 937
    div-float v14, p1, v8

    .line 938
    .line 939
    move-object/from16 p1, v0

    .line 940
    .line 941
    invoke-interface/range {v36 .. v36}, Lh1/d;->I0()J

    .line 942
    .line 943
    .line 944
    move-result-wide v0

    .line 945
    move-wide/from16 v25, v10

    .line 946
    .line 947
    invoke-virtual {v2}, Lb5/c;->v()J

    .line 948
    .line 949
    .line 950
    move-result-wide v10

    .line 951
    invoke-virtual {v2}, Lb5/c;->p()Lf1/u;

    .line 952
    .line 953
    .line 954
    move-result-object v8

    .line 955
    invoke-interface {v8}, Lf1/u;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 956
    .line 957
    .line 958
    :try_start_1
    iget-object v8, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v8, Landroidx/lifecycle/x;

    .line 961
    .line 962
    invoke-virtual {v8, v4, v14, v0, v1}, Landroidx/lifecycle/x;->S(FFJ)V

    .line 963
    .line 964
    .line 965
    const/16 v32, 0x0

    .line 966
    .line 967
    const/16 v33, 0x1c

    .line 968
    .line 969
    const/16 v31, 0x0

    .line 970
    .line 971
    move-object/from16 v29, v16

    .line 972
    .line 973
    move-object/from16 v28, v36

    .line 974
    .line 975
    invoke-static/range {v28 .. v33}, Lh1/d;->s0(Lh1/d;Lf1/j;Lf1/s;FLh1/g;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 976
    .line 977
    .line 978
    :try_start_2
    invoke-virtual {v2}, Lb5/c;->p()Lf1/u;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-interface {v0}, Lf1/u;->p()V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v2, v10, v11}, Lb5/c;->U(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 986
    .line 987
    .line 988
    iget-object v0, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v0, Landroidx/lifecycle/x;

    .line 991
    .line 992
    neg-float v1, v3

    .line 993
    neg-float v2, v7

    .line 994
    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/x;->c0(FF)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v12}, Lf1/b;->p()V

    .line 998
    .line 999
    .line 1000
    iput-object v9, v6, Lh1/a;->a:Lu2/c;

    .line 1001
    .line 1002
    move-object/from16 v0, v24

    .line 1003
    .line 1004
    iput-object v0, v6, Lh1/a;->b:Lu2/m;

    .line 1005
    .line 1006
    iput-object v13, v6, Lh1/a;->c:Lf1/u;

    .line 1007
    .line 1008
    move-wide/from16 v0, v25

    .line 1009
    .line 1010
    iput-wide v0, v6, Lh1/a;->d:J

    .line 1011
    .line 1012
    move-object/from16 v11, v20

    .line 1013
    .line 1014
    iget-object v0, v11, Lf1/g;->a:Landroid/graphics/Bitmap;

    .line 1015
    .line 1016
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 1017
    .line 1018
    .line 1019
    iput-object v11, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 1020
    .line 1021
    new-instance v16, Lhb/c0;

    .line 1022
    .line 1023
    move-object/from16 v17, v18

    .line 1024
    .line 1025
    move-wide/from16 v19, v22

    .line 1026
    .line 1027
    move-object/from16 v18, v5

    .line 1028
    .line 1029
    invoke-direct/range {v16 .. v21}, Lhb/c0;-><init>(Le1/c;Lgg/u;JLf1/n;)V

    .line 1030
    .line 1031
    .line 1032
    move-object/from16 v0, p1

    .line 1033
    .line 1034
    move-object/from16 v1, v16

    .line 1035
    .line 1036
    invoke-virtual {v0, v1}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v12

    .line 1040
    goto/16 :goto_10

    .line 1041
    .line 1042
    :catchall_0
    move-exception v0

    .line 1043
    goto :goto_d

    .line 1044
    :catchall_1
    move-exception v0

    .line 1045
    :try_start_3
    invoke-virtual {v2}, Lb5/c;->p()Lf1/u;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    invoke-interface {v1}, Lf1/u;->p()V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2, v10, v11}, Lb5/c;->U(J)V

    .line 1053
    .line 1054
    .line 1055
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1056
    :goto_d
    iget-object v1, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast v1, Landroidx/lifecycle/x;

    .line 1059
    .line 1060
    neg-float v2, v3

    .line 1061
    neg-float v3, v7

    .line 1062
    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/x;->c0(FF)V

    .line 1063
    .line 1064
    .line 1065
    throw v0

    .line 1066
    :cond_1b
    instance-of v1, v4, Lf1/l0;

    .line 1067
    .line 1068
    if-eqz v1, :cond_20

    .line 1069
    .line 1070
    iget-object v1, v2, Lk/s;->y:Lf1/t0;

    .line 1071
    .line 1072
    check-cast v4, Lf1/l0;

    .line 1073
    .line 1074
    iget-object v4, v4, Lf1/l0;->f:Le1/d;

    .line 1075
    .line 1076
    invoke-static {v4}, Lbe/h;->D(Le1/d;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v5

    .line 1080
    if-eqz v5, :cond_1c

    .line 1081
    .line 1082
    iget-wide v4, v4, Le1/d;->e:J

    .line 1083
    .line 1084
    new-instance v15, Lh1/g;

    .line 1085
    .line 1086
    const/16 v19, 0x0

    .line 1087
    .line 1088
    const/16 v20, 0x1e

    .line 1089
    .line 1090
    const/16 v17, 0x0

    .line 1091
    .line 1092
    const/16 v18, 0x0

    .line 1093
    .line 1094
    invoke-direct/range {v15 .. v20}, Lh1/g;-><init>(FFIII)V

    .line 1095
    .line 1096
    .line 1097
    new-instance v2, Lk/r;

    .line 1098
    .line 1099
    move-object/from16 v17, v1

    .line 1100
    .line 1101
    move-wide/from16 v18, v4

    .line 1102
    .line 1103
    move/from16 v20, v8

    .line 1104
    .line 1105
    move-object/from16 v26, v15

    .line 1106
    .line 1107
    move/from16 v21, v16

    .line 1108
    .line 1109
    move-object v15, v2

    .line 1110
    move/from16 v16, v3

    .line 1111
    .line 1112
    invoke-direct/range {v15 .. v26}, Lk/r;-><init>(ZLf1/t0;JFFJJLh1/g;)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v0, v15}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v12

    .line 1119
    goto/16 :goto_10

    .line 1120
    .line 1121
    :cond_1c
    move/from16 v44, v3

    .line 1122
    .line 1123
    move-object v3, v1

    .line 1124
    move/from16 v1, v16

    .line 1125
    .line 1126
    move/from16 v16, v44

    .line 1127
    .line 1128
    iget-object v5, v2, Lk/s;->w:Lk/p;

    .line 1129
    .line 1130
    if-nez v5, :cond_1d

    .line 1131
    .line 1132
    new-instance v5, Lk/p;

    .line 1133
    .line 1134
    invoke-direct {v5}, Lk/p;-><init>()V

    .line 1135
    .line 1136
    .line 1137
    iput-object v5, v2, Lk/s;->w:Lk/p;

    .line 1138
    .line 1139
    :cond_1d
    iget-object v2, v2, Lk/s;->w:Lk/p;

    .line 1140
    .line 1141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    iget-object v5, v2, Lk/p;->d:Lf1/j;

    .line 1145
    .line 1146
    if-nez v5, :cond_1e

    .line 1147
    .line 1148
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v5

    .line 1152
    iput-object v5, v2, Lk/p;->d:Lf1/j;

    .line 1153
    .line 1154
    :cond_1e
    invoke-virtual {v5}, Lf1/j;->h()V

    .line 1155
    .line 1156
    .line 1157
    invoke-static {v5, v4}, Lf1/j;->c(Lf1/j;Le1/d;)V

    .line 1158
    .line 1159
    .line 1160
    if-nez v16, :cond_1f

    .line 1161
    .line 1162
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    iget v6, v4, Le1/d;->c:F

    .line 1167
    .line 1168
    iget v7, v4, Le1/d;->a:F

    .line 1169
    .line 1170
    sub-float/2addr v6, v7

    .line 1171
    sub-float v18, v6, v1

    .line 1172
    .line 1173
    iget v6, v4, Le1/d;->d:F

    .line 1174
    .line 1175
    iget v7, v4, Le1/d;->b:F

    .line 1176
    .line 1177
    sub-float/2addr v6, v7

    .line 1178
    sub-float v19, v6, v1

    .line 1179
    .line 1180
    iget-wide v6, v4, Le1/d;->e:J

    .line 1181
    .line 1182
    invoke-static {v6, v7, v1}, Lk/n;->t(JF)J

    .line 1183
    .line 1184
    .line 1185
    move-result-wide v20

    .line 1186
    iget-wide v6, v4, Le1/d;->f:J

    .line 1187
    .line 1188
    invoke-static {v6, v7, v1}, Lk/n;->t(JF)J

    .line 1189
    .line 1190
    .line 1191
    move-result-wide v22

    .line 1192
    iget-wide v6, v4, Le1/d;->h:J

    .line 1193
    .line 1194
    invoke-static {v6, v7, v1}, Lk/n;->t(JF)J

    .line 1195
    .line 1196
    .line 1197
    move-result-wide v26

    .line 1198
    iget-wide v6, v4, Le1/d;->g:J

    .line 1199
    .line 1200
    invoke-static {v6, v7, v1}, Lk/n;->t(JF)J

    .line 1201
    .line 1202
    .line 1203
    move-result-wide v24

    .line 1204
    new-instance v15, Le1/d;

    .line 1205
    .line 1206
    move/from16 v17, v1

    .line 1207
    .line 1208
    move/from16 v16, v1

    .line 1209
    .line 1210
    invoke-direct/range {v15 .. v27}, Le1/d;-><init>(FFFFJJJJ)V

    .line 1211
    .line 1212
    .line 1213
    invoke-static {v2, v15}, Lf1/j;->c(Lf1/j;Le1/d;)V

    .line 1214
    .line 1215
    .line 1216
    const/4 v1, 0x0

    .line 1217
    invoke-virtual {v5, v5, v2, v1}, Lf1/j;->g(Lf1/j;Lf1/j;I)Z

    .line 1218
    .line 1219
    .line 1220
    :cond_1f
    new-instance v1, Lc9/i;

    .line 1221
    .line 1222
    const/16 v2, 0x19

    .line 1223
    .line 1224
    invoke-direct {v1, v5, v2, v3}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v0, v1}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v12

    .line 1231
    goto :goto_10

    .line 1232
    :cond_20
    move/from16 v1, v16

    .line 1233
    .line 1234
    move/from16 v16, v3

    .line 1235
    .line 1236
    instance-of v3, v4, Lf1/k0;

    .line 1237
    .line 1238
    if-eqz v3, :cond_24

    .line 1239
    .line 1240
    iget-object v5, v2, Lk/s;->y:Lf1/t0;

    .line 1241
    .line 1242
    if-eqz v16, :cond_21

    .line 1243
    .line 1244
    move-wide/from16 v6, v17

    .line 1245
    .line 1246
    goto :goto_e

    .line 1247
    :cond_21
    move-wide/from16 v6, v22

    .line 1248
    .line 1249
    :goto_e
    if-eqz v16, :cond_22

    .line 1250
    .line 1251
    iget-object v2, v0, Lc1/d;->g:Lc1/a;

    .line 1252
    .line 1253
    invoke-interface {v2}, Lc1/a;->a()J

    .line 1254
    .line 1255
    .line 1256
    move-result-wide v24

    .line 1257
    :cond_22
    move-wide/from16 v8, v24

    .line 1258
    .line 1259
    if-eqz v16, :cond_23

    .line 1260
    .line 1261
    sget-object v1, Lh1/f;->b:Lh1/f;

    .line 1262
    .line 1263
    move-object v10, v1

    .line 1264
    goto :goto_f

    .line 1265
    :cond_23
    new-instance v15, Lh1/g;

    .line 1266
    .line 1267
    const/16 v19, 0x0

    .line 1268
    .line 1269
    const/16 v20, 0x1e

    .line 1270
    .line 1271
    const/16 v17, 0x0

    .line 1272
    .line 1273
    const/16 v18, 0x0

    .line 1274
    .line 1275
    move/from16 v16, v1

    .line 1276
    .line 1277
    invoke-direct/range {v15 .. v20}, Lh1/g;-><init>(FFIII)V

    .line 1278
    .line 1279
    .line 1280
    move-object v10, v15

    .line 1281
    :goto_f
    new-instance v4, Lk/q;

    .line 1282
    .line 1283
    invoke-direct/range {v4 .. v10}, Lk/q;-><init>(Lf1/t0;JJLh1/c;)V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v0, v4}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v12

    .line 1290
    goto :goto_10

    .line 1291
    :cond_24
    invoke-static {}, Lokio/a;->k()V

    .line 1292
    .line 1293
    .line 1294
    const/4 v12, 0x0

    .line 1295
    goto :goto_10

    .line 1296
    :cond_25
    new-instance v1, Li2/z;

    .line 1297
    .line 1298
    const/16 v2, 0xd

    .line 1299
    .line 1300
    invoke-direct {v1, v2}, Li2/z;-><init>(I)V

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v0, v1}, Lc1/d;->e(Lfg/l;)Landroidx/lifecycle/x;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v12

    .line 1307
    :goto_10
    return-object v12

    .line 1308
    :pswitch_6
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1309
    .line 1310
    check-cast v2, Ljava/lang/ClassLoader;

    .line 1311
    .line 1312
    check-cast v0, Lhh/o;

    .line 1313
    .line 1314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    :try_start_4
    invoke-virtual {v0, v2}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1321
    goto :goto_11

    .line 1322
    :catchall_2
    move-exception v0

    .line 1323
    new-instance v2, Lsf/f;

    .line 1324
    .line 1325
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1326
    .line 1327
    .line 1328
    move-object v0, v2

    .line 1329
    :goto_11
    nop

    .line 1330
    instance-of v2, v0, Lsf/f;

    .line 1331
    .line 1332
    if-eqz v2, :cond_26

    .line 1333
    .line 1334
    const/4 v12, 0x0

    .line 1335
    goto :goto_12

    .line 1336
    :cond_26
    move-object v12, v0

    .line 1337
    :goto_12
    check-cast v12, Ljava/lang/reflect/Method;

    .line 1338
    .line 1339
    return-object v12

    .line 1340
    :pswitch_7
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v2, Lia/a0;

    .line 1343
    .line 1344
    check-cast v0, Ljava/lang/Boolean;

    .line 1345
    .line 1346
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1347
    .line 1348
    .line 1349
    move-result v0

    .line 1350
    if-nez v0, :cond_27

    .line 1351
    .line 1352
    iget-object v0, v2, Lia/a0;->d:Lab/b;

    .line 1353
    .line 1354
    const-string v2, "\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u5f85\u6e05\u7406\u7f13\u5b58\u6062\u590d\u5931\u8d25"

    .line 1355
    .line 1356
    const/4 v3, 0x0

    .line 1357
    invoke-virtual {v0, v2, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    :cond_27
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1361
    .line 1362
    return-object v0

    .line 1363
    :pswitch_8
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1364
    .line 1365
    check-cast v2, Li0/f2;

    .line 1366
    .line 1367
    iget-object v3, v2, Li0/f2;->l:Lsg/p;

    .line 1368
    .line 1369
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1370
    .line 1371
    .line 1372
    iget-object v4, v2, Li0/f2;->l:Lsg/p;

    .line 1373
    .line 1374
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    if-nez v3, :cond_28

    .line 1379
    .line 1380
    const-string v3, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 1381
    .line 1382
    invoke-static {v3}, Li0/n1;->b(Ljava/lang/String;)V

    .line 1383
    .line 1384
    .line 1385
    :cond_28
    iget-object v3, v2, Li0/f2;->k:Lf/l0;

    .line 1386
    .line 1387
    iget-object v4, v2, Li0/f2;->i:Ljava/lang/Object;

    .line 1388
    .line 1389
    if-nez v3, :cond_2a

    .line 1390
    .line 1391
    if-nez v4, :cond_29

    .line 1392
    .line 1393
    iput-object v0, v2, Li0/f2;->i:Ljava/lang/Object;

    .line 1394
    .line 1395
    goto :goto_14

    .line 1396
    :cond_29
    sget-object v3, Lf/s0;->a:Lf/l0;

    .line 1397
    .line 1398
    new-instance v3, Lf/l0;

    .line 1399
    .line 1400
    invoke-direct {v3}, Lf/l0;-><init>()V

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v3, v4}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v3, v0}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 1407
    .line 1408
    .line 1409
    iput-object v3, v2, Li0/f2;->k:Lf/l0;

    .line 1410
    .line 1411
    const/4 v3, 0x0

    .line 1412
    iput-object v3, v2, Li0/f2;->i:Ljava/lang/Object;

    .line 1413
    .line 1414
    goto :goto_14

    .line 1415
    :cond_2a
    if-nez v4, :cond_2b

    .line 1416
    .line 1417
    goto :goto_13

    .line 1418
    :cond_2b
    const-string v2, "workingSoleWatchedObject must be null when workingWatchSet is non-null"

    .line 1419
    .line 1420
    invoke-static {v2}, Li0/n1;->b(Ljava/lang/String;)V

    .line 1421
    .line 1422
    .line 1423
    :goto_13
    invoke-virtual {v3, v0}, Lf/l0;->a(Ljava/lang/Object;)Z

    .line 1424
    .line 1425
    .line 1426
    :goto_14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1427
    .line 1428
    return-object v0

    .line 1429
    :pswitch_9
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1430
    .line 1431
    check-cast v2, Li0/y1;

    .line 1432
    .line 1433
    check-cast v0, Ljava/lang/Throwable;

    .line 1434
    .line 1435
    const-string v3, "Recomposer effect job completed"

    .line 1436
    .line 1437
    new-instance v4, Ljava/util/concurrent/CancellationException;

    .line 1438
    .line 1439
    invoke-direct {v4, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1443
    .line 1444
    .line 1445
    iget-object v3, v2, Li0/y1;->c:Ljava/lang/Object;

    .line 1446
    .line 1447
    monitor-enter v3

    .line 1448
    :try_start_5
    iget-object v5, v2, Li0/y1;->d:Lqg/r0;

    .line 1449
    .line 1450
    if-eqz v5, :cond_2c

    .line 1451
    .line 1452
    iget-object v6, v2, Li0/y1;->u:Ltg/b0;

    .line 1453
    .line 1454
    sget-object v7, Li0/u1;->h:Li0/u1;

    .line 1455
    .line 1456
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1457
    .line 1458
    .line 1459
    const/4 v8, 0x0

    .line 1460
    invoke-virtual {v6, v8, v7}, Ltg/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1461
    .line 1462
    .line 1463
    invoke-interface {v5, v4}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 1464
    .line 1465
    .line 1466
    iput-object v8, v2, Li0/y1;->r:Lqg/g;

    .line 1467
    .line 1468
    new-instance v4, Lc9/i;

    .line 1469
    .line 1470
    const/16 v6, 0x16

    .line 1471
    .line 1472
    invoke-direct {v4, v2, v6, v0}, Lc9/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1473
    .line 1474
    .line 1475
    invoke-interface {v5, v4}, Lqg/r0;->o(Lfg/l;)Lqg/d0;

    .line 1476
    .line 1477
    .line 1478
    goto :goto_15

    .line 1479
    :catchall_3
    move-exception v0

    .line 1480
    goto :goto_16

    .line 1481
    :cond_2c
    iput-object v4, v2, Li0/y1;->e:Ljava/lang/Throwable;

    .line 1482
    .line 1483
    iget-object v0, v2, Li0/y1;->u:Ltg/b0;

    .line 1484
    .line 1485
    sget-object v2, Li0/u1;->g:Li0/u1;

    .line 1486
    .line 1487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    const/4 v8, 0x0

    .line 1491
    invoke-virtual {v0, v8, v2}, Ltg/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1492
    .line 1493
    .line 1494
    :goto_15
    monitor-exit v3

    .line 1495
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1496
    .line 1497
    return-object v0

    .line 1498
    :goto_16
    monitor-exit v3

    .line 1499
    throw v0

    .line 1500
    :pswitch_a
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1501
    .line 1502
    check-cast v2, Li0/q;

    .line 1503
    .line 1504
    invoke-virtual {v2, v0}, Li0/q;->y(Ljava/lang/Object;)V

    .line 1505
    .line 1506
    .line 1507
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1508
    .line 1509
    return-object v0

    .line 1510
    :pswitch_b
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1511
    .line 1512
    check-cast v2, Li/k1;

    .line 1513
    .line 1514
    check-cast v0, Li0/a0;

    .line 1515
    .line 1516
    new-instance v0, Lb0/m;

    .line 1517
    .line 1518
    invoke-direct {v0, v2, v9}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 1519
    .line 1520
    .line 1521
    return-object v0

    .line 1522
    :pswitch_c
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1523
    .line 1524
    check-cast v2, Lfg/p;

    .line 1525
    .line 1526
    sget-object v3, Li/d;->j:Li/m1;

    .line 1527
    .line 1528
    check-cast v0, Li/j;

    .line 1529
    .line 1530
    iget-object v4, v0, Li/j;->e:Li0/j1;

    .line 1531
    .line 1532
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v4

    .line 1536
    iget-object v3, v3, Li/m1;->b:Lfg/l;

    .line 1537
    .line 1538
    iget-object v0, v0, Li/j;->f:Li/q;

    .line 1539
    .line 1540
    invoke-interface {v3, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    invoke-interface {v2, v4, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1545
    .line 1546
    .line 1547
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1548
    .line 1549
    return-object v0

    .line 1550
    :pswitch_d
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1551
    .line 1552
    move-object v8, v2

    .line 1553
    check-cast v8, Lh0/q0;

    .line 1554
    .line 1555
    check-cast v0, Ls1/t;

    .line 1556
    .line 1557
    iget-wide v10, v0, Ls1/t;->c:J

    .line 1558
    .line 1559
    iget-object v2, v8, Lh0/q0;->d:Ljava/lang/Object;

    .line 1560
    .line 1561
    check-cast v2, Lh0/d1;

    .line 1562
    .line 1563
    invoke-virtual {v2}, Lh0/d1;->k()Z

    .line 1564
    .line 1565
    .line 1566
    move-result v3

    .line 1567
    if-eqz v3, :cond_2f

    .line 1568
    .line 1569
    invoke-virtual {v2}, Lh0/d1;->n()Ln2/s;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v3

    .line 1573
    iget-object v3, v3, Ln2/s;->a:Li2/g;

    .line 1574
    .line 1575
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 1576
    .line 1577
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1578
    .line 1579
    .line 1580
    move-result v3

    .line 1581
    if-nez v3, :cond_2d

    .line 1582
    .line 1583
    goto :goto_17

    .line 1584
    :cond_2d
    iget-object v3, v2, Lh0/d1;->d:Lw/q0;

    .line 1585
    .line 1586
    if-eqz v3, :cond_2f

    .line 1587
    .line 1588
    invoke-virtual {v3}, Lw/q0;->d()Lw/m1;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v3

    .line 1592
    if-nez v3, :cond_2e

    .line 1593
    .line 1594
    goto :goto_17

    .line 1595
    :cond_2e
    invoke-virtual {v2}, Lh0/d1;->n()Ln2/s;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v9

    .line 1599
    const/4 v12, 0x0

    .line 1600
    sget-object v13, Lh0/w;->d:Lg1/d;

    .line 1601
    .line 1602
    invoke-virtual/range {v8 .. v13}, Lh0/q0;->f(Ln2/s;JZLg1/d;)J

    .line 1603
    .line 1604
    .line 1605
    const/4 v10, 0x1

    .line 1606
    goto :goto_18

    .line 1607
    :cond_2f
    :goto_17
    const/4 v10, 0x0

    .line 1608
    :goto_18
    if-eqz v10, :cond_30

    .line 1609
    .line 1610
    invoke-virtual {v0}, Ls1/t;->a()V

    .line 1611
    .line 1612
    .line 1613
    :cond_30
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1614
    .line 1615
    return-object v0

    .line 1616
    :pswitch_e
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v2, Lt7/b;

    .line 1619
    .line 1620
    check-cast v0, Lfb/l0;

    .line 1621
    .line 1622
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1623
    .line 1624
    .line 1625
    new-instance v3, Lfb/k0;

    .line 1626
    .line 1627
    invoke-direct {v3, v2, v0}, Lfb/k0;-><init>(Lt7/b;Lfb/l0;)V

    .line 1628
    .line 1629
    .line 1630
    return-object v3

    .line 1631
    :pswitch_f
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1632
    .line 1633
    check-cast v2, Lorg/json/JSONObject;

    .line 1634
    .line 1635
    check-cast v0, Ljava/lang/String;

    .line 1636
    .line 1637
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1638
    .line 1639
    .line 1640
    const-string v3, ""

    .line 1641
    .line 1642
    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1647
    .line 1648
    .line 1649
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v0

    .line 1653
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v0

    .line 1657
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1658
    .line 1659
    .line 1660
    move-result v2

    .line 1661
    if-nez v2, :cond_31

    .line 1662
    .line 1663
    move-object v12, v0

    .line 1664
    goto :goto_19

    .line 1665
    :cond_31
    const/4 v12, 0x0

    .line 1666
    :goto_19
    return-object v12

    .line 1667
    :pswitch_10
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1668
    .line 1669
    check-cast v2, Lf0/v;

    .line 1670
    .line 1671
    check-cast v0, Ln2/g;

    .line 1672
    .line 1673
    invoke-virtual {v2, v0}, Lf0/v;->a(Ln2/g;)V

    .line 1674
    .line 1675
    .line 1676
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1677
    .line 1678
    return-object v0

    .line 1679
    :pswitch_11
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptWaBridge;

    .line 1682
    .line 1683
    check-cast v0, Log/f;

    .line 1684
    .line 1685
    invoke-static {v2, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->D(Lh/Hchat/hooks/items/script/ScriptWaBridge;Log/f;)Ljava/lang/CharSequence;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    return-object v0

    .line 1690
    :pswitch_12
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1691
    .line 1692
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 1693
    .line 1694
    check-cast v0, Ljava/lang/String;

    .line 1695
    .line 1696
    invoke-static {v2, v0}, Lh/Hchat/hooks/items/script/ScriptAudioBridge;->e(Lh/Hchat/hooks/items/script/ScriptPluginBridge;Ljava/lang/String;)Lsf/n;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v0

    .line 1700
    return-object v0

    .line 1701
    :pswitch_13
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1702
    .line 1703
    check-cast v2, Ld0/c;

    .line 1704
    .line 1705
    check-cast v0, Li0/a0;

    .line 1706
    .line 1707
    new-instance v0, Lb0/m;

    .line 1708
    .line 1709
    const/4 v7, 0x1

    .line 1710
    invoke-direct {v0, v2, v7}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 1711
    .line 1712
    .line 1713
    return-object v0

    .line 1714
    :pswitch_14
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1715
    .line 1716
    check-cast v2, Landroid/view/ViewParent;

    .line 1717
    .line 1718
    check-cast v0, Li0/a0;

    .line 1719
    .line 1720
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1721
    .line 1722
    .line 1723
    instance-of v0, v2, Ly2/t;

    .line 1724
    .line 1725
    if-eqz v0, :cond_32

    .line 1726
    .line 1727
    move-object v0, v2

    .line 1728
    check-cast v0, Ly2/t;

    .line 1729
    .line 1730
    goto :goto_1a

    .line 1731
    :cond_32
    const/4 v0, 0x0

    .line 1732
    :goto_1a
    if-eqz v0, :cond_33

    .line 1733
    .line 1734
    iget-object v12, v0, Ly2/t;->p:Landroid/view/Window;

    .line 1735
    .line 1736
    goto :goto_1b

    .line 1737
    :cond_33
    const/4 v12, 0x0

    .line 1738
    :goto_1b
    if-eqz v12, :cond_34

    .line 1739
    .line 1740
    const/4 v2, 0x0

    .line 1741
    invoke-virtual {v12, v2}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 1742
    .line 1743
    .line 1744
    :cond_34
    if-eqz v12, :cond_35

    .line 1745
    .line 1746
    invoke-virtual {v12, v8}, Landroid/view/Window;->setDimAmount(F)V

    .line 1747
    .line 1748
    .line 1749
    :cond_35
    if-eqz v12, :cond_36

    .line 1750
    .line 1751
    invoke-virtual {v12, v9}, Landroid/view/Window;->clearFlags(I)V

    .line 1752
    .line 1753
    .line 1754
    :cond_36
    new-instance v0, Lci/r0;

    .line 1755
    .line 1756
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1757
    .line 1758
    .line 1759
    return-object v0

    .line 1760
    :pswitch_15
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1761
    .line 1762
    check-cast v2, Lci/n0;

    .line 1763
    .line 1764
    check-cast v0, Lf1/d0;

    .line 1765
    .line 1766
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1767
    .line 1768
    .line 1769
    iget-object v2, v2, Lci/n0;->w:Li/c;

    .line 1770
    .line 1771
    invoke-virtual {v2}, Li/c;->d()Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v3

    .line 1775
    check-cast v3, Ljava/lang/Number;

    .line 1776
    .line 1777
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 1778
    .line 1779
    .line 1780
    move-result v3

    .line 1781
    invoke-interface {v0, v3}, Lf1/d0;->q(F)V

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual {v2}, Li/c;->d()Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v2

    .line 1788
    check-cast v2, Ljava/lang/Number;

    .line 1789
    .line 1790
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 1791
    .line 1792
    .line 1793
    move-result v2

    .line 1794
    invoke-interface {v0, v2}, Lf1/d0;->i(F)V

    .line 1795
    .line 1796
    .line 1797
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1798
    .line 1799
    return-object v0

    .line 1800
    :pswitch_16
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v2, Lci/e0;

    .line 1803
    .line 1804
    check-cast v0, Lf1/d0;

    .line 1805
    .line 1806
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1807
    .line 1808
    .line 1809
    iget-boolean v3, v2, Lci/e0;->w:Z

    .line 1810
    .line 1811
    iget v2, v2, Lci/e0;->C:F

    .line 1812
    .line 1813
    if-eqz v3, :cond_37

    .line 1814
    .line 1815
    invoke-interface {v0, v2}, Lf1/d0;->g(F)V

    .line 1816
    .line 1817
    .line 1818
    :goto_1c
    const/4 v7, 0x1

    .line 1819
    goto :goto_1d

    .line 1820
    :cond_37
    invoke-interface {v0, v2}, Lf1/d0;->s(F)V

    .line 1821
    .line 1822
    .line 1823
    goto :goto_1c

    .line 1824
    :goto_1d
    invoke-interface {v0, v7}, Lf1/d0;->r(Z)V

    .line 1825
    .line 1826
    .line 1827
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1828
    .line 1829
    return-object v0

    .line 1830
    :pswitch_17
    const-wide/16 v17, 0x0

    .line 1831
    .line 1832
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 1833
    .line 1834
    check-cast v2, Lca/e0;

    .line 1835
    .line 1836
    move-object v3, v0

    .line 1837
    check-cast v3, Lhb/t;

    .line 1838
    .line 1839
    const-string v4, ""

    .line 1840
    .line 1841
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1842
    .line 1843
    .line 1844
    iget-object v0, v3, Lhb/t;->g:Lk8/t;

    .line 1845
    .line 1846
    if-eqz v0, :cond_38

    .line 1847
    .line 1848
    iget-object v0, v0, Lk8/t;->f:Ljava/lang/String;

    .line 1849
    .line 1850
    goto :goto_1e

    .line 1851
    :cond_38
    const/4 v0, 0x0

    .line 1852
    :goto_1e
    if-nez v0, :cond_39

    .line 1853
    .line 1854
    move-object/from16 v30, v4

    .line 1855
    .line 1856
    goto :goto_1f

    .line 1857
    :cond_39
    move-object/from16 v30, v0

    .line 1858
    .line 1859
    :goto_1f
    iget-object v2, v2, Lca/e0;->p:Lb5/c;

    .line 1860
    .line 1861
    iget-object v0, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 1862
    .line 1863
    move-object v5, v0

    .line 1864
    check-cast v5, Lab/b;

    .line 1865
    .line 1866
    iget-wide v10, v3, Lhb/t;->a:J

    .line 1867
    .line 1868
    iget v0, v3, Lhb/t;->b:I

    .line 1869
    .line 1870
    const v6, 0xffff

    .line 1871
    .line 1872
    .line 1873
    and-int/2addr v0, v6

    .line 1874
    const/4 v6, 0x3

    .line 1875
    if-eq v0, v6, :cond_3a

    .line 1876
    .line 1877
    :goto_20
    move-object/from16 v19, v4

    .line 1878
    .line 1879
    const/4 v3, 0x0

    .line 1880
    const/4 v9, 0x0

    .line 1881
    goto/16 :goto_3a

    .line 1882
    .line 1883
    :cond_3a
    iget-object v0, v2, Lb5/c;->c:Ljava/lang/Object;

    .line 1884
    .line 1885
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v0

    .line 1889
    move-object v8, v0

    .line 1890
    check-cast v8, Lca/b;

    .line 1891
    .line 1892
    if-eqz v8, :cond_59

    .line 1893
    .line 1894
    iget-object v12, v8, Lca/b;->b:Ljava/lang/reflect/Method;

    .line 1895
    .line 1896
    iget-object v13, v8, Lca/b;->c:Ljava/lang/reflect/Method;

    .line 1897
    .line 1898
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v0

    .line 1902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1903
    .line 1904
    .line 1905
    const/4 v14, 0x0

    .line 1906
    invoke-static {v14, v0}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v0

    .line 1910
    const-class v14, Ljava/lang/String;

    .line 1911
    .line 1912
    invoke-static {v0, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1913
    .line 1914
    .line 1915
    move-result v0

    .line 1916
    if-nez v0, :cond_3b

    .line 1917
    .line 1918
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v0

    .line 1922
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1923
    .line 1924
    const-string v3, "\u804a\u5929\u5b9e\u51b5\u56fe\u7247\u67e5\u8be2\u65b9\u6cd5\u53c2\u6570\u4e0d\u517c\u5bb9: msgId="

    .line 1925
    .line 1926
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1930
    .line 1931
    .line 1932
    const-string v3, " method="

    .line 1933
    .line 1934
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1935
    .line 1936
    .line 1937
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v0

    .line 1944
    const/4 v3, 0x0

    .line 1945
    invoke-virtual {v5, v0, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    goto :goto_20

    .line 1949
    :cond_3b
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v0

    .line 1953
    const/16 v28, 0x0

    .line 1954
    .line 1955
    aget-object v14, v0, v28

    .line 1956
    .line 1957
    iget-object v0, v3, Lhb/t;->k:Ljava/lang/Object;

    .line 1958
    .line 1959
    if-eqz v0, :cond_3d

    .line 1960
    .line 1961
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1962
    .line 1963
    .line 1964
    invoke-virtual {v14, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 1965
    .line 1966
    .line 1967
    move-result v15

    .line 1968
    if-eqz v15, :cond_3c

    .line 1969
    .line 1970
    goto :goto_21

    .line 1971
    :cond_3c
    const/4 v0, 0x0

    .line 1972
    :goto_21
    if-eqz v0, :cond_3d

    .line 1973
    .line 1974
    goto :goto_26

    .line 1975
    :cond_3d
    :try_start_6
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v0

    .line 1979
    if-eqz v0, :cond_3e

    .line 1980
    .line 1981
    invoke-virtual {v0, v10, v11}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageById(J)Ljava/lang/Object;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1985
    goto :goto_22

    .line 1986
    :catchall_4
    move-exception v0

    .line 1987
    goto :goto_23

    .line 1988
    :cond_3e
    const/4 v0, 0x0

    .line 1989
    :goto_22
    move-object v15, v0

    .line 1990
    goto :goto_24

    .line 1991
    :goto_23
    new-instance v15, Lsf/f;

    .line 1992
    .line 1993
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1994
    .line 1995
    .line 1996
    :goto_24
    instance-of v0, v15, Lsf/f;

    .line 1997
    .line 1998
    if-eqz v0, :cond_3f

    .line 1999
    .line 2000
    const/4 v15, 0x0

    .line 2001
    :cond_3f
    if-eqz v15, :cond_40

    .line 2002
    .line 2003
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v14, v15}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 2007
    .line 2008
    .line 2009
    move-result v0

    .line 2010
    if-eqz v0, :cond_40

    .line 2011
    .line 2012
    goto :goto_25

    .line 2013
    :cond_40
    const/4 v15, 0x0

    .line 2014
    :goto_25
    if-eqz v15, :cond_59

    .line 2015
    .line 2016
    move-object v0, v15

    .line 2017
    :goto_26
    const-string v14, "getMsgId"

    .line 2018
    .line 2019
    const-string v15, "getMsgID"

    .line 2020
    .line 2021
    const-string v7, "getId"

    .line 2022
    .line 2023
    filled-new-array {v14, v15, v7}, [Ljava/lang/String;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v7

    .line 2027
    const/4 v14, 0x0

    .line 2028
    :goto_27
    if-lt v14, v6, :cond_45

    .line 2029
    .line 2030
    const-string v6, "field_msgId"

    .line 2031
    .line 2032
    const-string v7, "msgId"

    .line 2033
    .line 2034
    const-string v14, "msgID"

    .line 2035
    .line 2036
    const-string v15, "id"

    .line 2037
    .line 2038
    filled-new-array {v6, v7, v14, v15}, [Ljava/lang/String;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v15

    .line 2042
    const/4 v6, 0x0

    .line 2043
    :goto_28
    const/4 v7, 0x4

    .line 2044
    if-lt v6, v7, :cond_41

    .line 2045
    .line 2046
    move-wide/from16 v6, v17

    .line 2047
    .line 2048
    goto :goto_2d

    .line 2049
    :cond_41
    aget-object v7, v15, v6

    .line 2050
    .line 2051
    invoke-static {v0, v7}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v7

    .line 2055
    instance-of v14, v7, Ljava/lang/Number;

    .line 2056
    .line 2057
    if-eqz v14, :cond_42

    .line 2058
    .line 2059
    check-cast v7, Ljava/lang/Number;

    .line 2060
    .line 2061
    goto :goto_29

    .line 2062
    :cond_42
    const/4 v7, 0x0

    .line 2063
    :goto_29
    if-eqz v7, :cond_44

    .line 2064
    .line 2065
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 2066
    .line 2067
    .line 2068
    move-result-wide v21

    .line 2069
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v7

    .line 2073
    cmp-long v14, v21, v17

    .line 2074
    .line 2075
    if-lez v14, :cond_43

    .line 2076
    .line 2077
    goto :goto_2a

    .line 2078
    :cond_43
    const/4 v7, 0x0

    .line 2079
    :goto_2a
    if-eqz v7, :cond_44

    .line 2080
    .line 2081
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 2082
    .line 2083
    .line 2084
    move-result-wide v6

    .line 2085
    goto :goto_2d

    .line 2086
    :cond_44
    add-int/lit8 v6, v6, 0x1

    .line 2087
    .line 2088
    goto :goto_28

    .line 2089
    :cond_45
    aget-object v15, v7, v14

    .line 2090
    .line 2091
    const/4 v6, 0x0

    .line 2092
    new-array v9, v6, [Ljava/lang/Object;

    .line 2093
    .line 2094
    invoke-static {v0, v15, v9}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v6

    .line 2098
    instance-of v9, v6, Ljava/lang/Number;

    .line 2099
    .line 2100
    if-eqz v9, :cond_46

    .line 2101
    .line 2102
    check-cast v6, Ljava/lang/Number;

    .line 2103
    .line 2104
    goto :goto_2b

    .line 2105
    :cond_46
    const/4 v6, 0x0

    .line 2106
    :goto_2b
    if-eqz v6, :cond_58

    .line 2107
    .line 2108
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 2109
    .line 2110
    .line 2111
    move-result-wide v21

    .line 2112
    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v6

    .line 2116
    cmp-long v9, v21, v17

    .line 2117
    .line 2118
    if-lez v9, :cond_47

    .line 2119
    .line 2120
    goto :goto_2c

    .line 2121
    :cond_47
    const/4 v6, 0x0

    .line 2122
    :goto_2c
    if-eqz v6, :cond_58

    .line 2123
    .line 2124
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 2125
    .line 2126
    .line 2127
    move-result-wide v6

    .line 2128
    :goto_2d
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v9

    .line 2132
    cmp-long v6, v6, v17

    .line 2133
    .line 2134
    if-lez v6, :cond_48

    .line 2135
    .line 2136
    goto :goto_2e

    .line 2137
    :cond_48
    const/4 v9, 0x0

    .line 2138
    :goto_2e
    if-eqz v9, :cond_49

    .line 2139
    .line 2140
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 2141
    .line 2142
    .line 2143
    move-result-wide v6

    .line 2144
    goto :goto_2f

    .line 2145
    :cond_49
    move-wide v6, v10

    .line 2146
    :goto_2f
    const-string v9, "getTalker"

    .line 2147
    .line 2148
    const-string v15, "talker"

    .line 2149
    .line 2150
    filled-new-array {v9, v15}, [Ljava/lang/String;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v9

    .line 2154
    move-object/from16 v19, v4

    .line 2155
    .line 2156
    const/4 v14, 0x0

    .line 2157
    :goto_30
    const/4 v4, 0x2

    .line 2158
    if-lt v14, v4, :cond_4e

    .line 2159
    .line 2160
    const-string v9, "field_talker"

    .line 2161
    .line 2162
    filled-new-array {v9, v15}, [Ljava/lang/String;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v21

    .line 2166
    const/4 v9, 0x0

    .line 2167
    :goto_31
    if-lt v9, v4, :cond_4a

    .line 2168
    .line 2169
    move-object/from16 v14, v19

    .line 2170
    .line 2171
    goto :goto_36

    .line 2172
    :cond_4a
    aget-object v14, v21, v9

    .line 2173
    .line 2174
    invoke-static {v0, v14}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v14

    .line 2178
    instance-of v15, v14, Ljava/lang/String;

    .line 2179
    .line 2180
    if-eqz v15, :cond_4b

    .line 2181
    .line 2182
    check-cast v14, Ljava/lang/String;

    .line 2183
    .line 2184
    goto :goto_32

    .line 2185
    :cond_4b
    const/4 v14, 0x0

    .line 2186
    :goto_32
    if-eqz v14, :cond_4d

    .line 2187
    .line 2188
    invoke-static {v14}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v14

    .line 2192
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v14

    .line 2196
    if-eqz v14, :cond_4d

    .line 2197
    .line 2198
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2199
    .line 2200
    .line 2201
    move-result v15

    .line 2202
    if-nez v15, :cond_4c

    .line 2203
    .line 2204
    goto :goto_33

    .line 2205
    :cond_4c
    const/4 v14, 0x0

    .line 2206
    :goto_33
    if-eqz v14, :cond_4d

    .line 2207
    .line 2208
    goto :goto_36

    .line 2209
    :cond_4d
    add-int/lit8 v9, v9, 0x1

    .line 2210
    .line 2211
    goto :goto_31

    .line 2212
    :cond_4e
    aget-object v4, v9, v14

    .line 2213
    .line 2214
    move-object/from16 v21, v9

    .line 2215
    .line 2216
    move/from16 v23, v14

    .line 2217
    .line 2218
    const/4 v9, 0x0

    .line 2219
    new-array v14, v9, [Ljava/lang/Object;

    .line 2220
    .line 2221
    invoke-static {v0, v4, v14}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v4

    .line 2225
    instance-of v9, v4, Ljava/lang/String;

    .line 2226
    .line 2227
    if-eqz v9, :cond_4f

    .line 2228
    .line 2229
    check-cast v4, Ljava/lang/String;

    .line 2230
    .line 2231
    goto :goto_34

    .line 2232
    :cond_4f
    const/4 v4, 0x0

    .line 2233
    :goto_34
    if-eqz v4, :cond_57

    .line 2234
    .line 2235
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v4

    .line 2239
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v4

    .line 2243
    if-eqz v4, :cond_57

    .line 2244
    .line 2245
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2246
    .line 2247
    .line 2248
    move-result v9

    .line 2249
    if-nez v9, :cond_50

    .line 2250
    .line 2251
    goto :goto_35

    .line 2252
    :cond_50
    const/4 v4, 0x0

    .line 2253
    :goto_35
    if-eqz v4, :cond_57

    .line 2254
    .line 2255
    move-object v14, v4

    .line 2256
    :goto_36
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2257
    .line 2258
    .line 2259
    move-result v4

    .line 2260
    if-eqz v4, :cond_51

    .line 2261
    .line 2262
    iget-object v14, v3, Lhb/t;->c:Ljava/lang/String;

    .line 2263
    .line 2264
    :cond_51
    :try_start_7
    iget-object v3, v8, Lca/b;->a:Ljava/lang/reflect/Method;

    .line 2265
    .line 2266
    const/4 v9, 0x0

    .line 2267
    new-array v4, v9, [Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 2268
    .line 2269
    const/4 v9, 0x0

    .line 2270
    :try_start_8
    invoke-static {v3, v9, v4}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v3

    .line 2274
    if-eqz v3, :cond_52

    .line 2275
    .line 2276
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v4

    .line 2280
    filled-new-array {v14, v4}, [Ljava/lang/Object;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v4

    .line 2284
    invoke-static {v12, v3, v4}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v3

    .line 2288
    if-eqz v3, :cond_52

    .line 2289
    .line 2290
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v4

    .line 2294
    const/16 v16, 0x1

    .line 2295
    .line 2296
    aget-object v4, v4, v16

    .line 2297
    .line 2298
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 2299
    .line 2300
    .line 2301
    move-result v4

    .line 2302
    if-nez v4, :cond_53

    .line 2303
    .line 2304
    :cond_52
    move-object v3, v9

    .line 2305
    goto :goto_39

    .line 2306
    :cond_53
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2307
    .line 2308
    .line 2309
    move-result v4

    .line 2310
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 2311
    .line 2312
    .line 2313
    move-result v4

    .line 2314
    if-eqz v4, :cond_54

    .line 2315
    .line 2316
    move-object v4, v9

    .line 2317
    goto :goto_37

    .line 2318
    :cond_54
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v4

    .line 2322
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->staticInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v4

    .line 2326
    if-eqz v4, :cond_52

    .line 2327
    .line 2328
    :goto_37
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v0

    .line 2332
    invoke-static {v13, v4, v0}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v0

    .line 2336
    if-eqz v0, :cond_52

    .line 2337
    .line 2338
    invoke-virtual {v2, v0, v6, v7}, Lb5/c;->L(Ljava/lang/Object;J)Lca/a;

    .line 2339
    .line 2340
    .line 2341
    move-result-object v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 2342
    goto :goto_39

    .line 2343
    :catchall_5
    move-exception v0

    .line 2344
    goto :goto_38

    .line 2345
    :catchall_6
    move-exception v0

    .line 2346
    const/4 v9, 0x0

    .line 2347
    :goto_38
    new-instance v2, Lsf/f;

    .line 2348
    .line 2349
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 2350
    .line 2351
    .line 2352
    move-object v3, v2

    .line 2353
    :goto_39
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2354
    .line 2355
    .line 2356
    move-result-object v0

    .line 2357
    if-eqz v0, :cond_55

    .line 2358
    .line 2359
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2360
    .line 2361
    const-string v4, "\u89e3\u6790\u804a\u5929\u5b9e\u51b5\u56fe\u7247\u5931\u8d25: msgId="

    .line 2362
    .line 2363
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2364
    .line 2365
    .line 2366
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2367
    .line 2368
    .line 2369
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2370
    .line 2371
    .line 2372
    move-result-object v2

    .line 2373
    invoke-virtual {v5, v2, v0}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2374
    .line 2375
    .line 2376
    :cond_55
    instance-of v0, v3, Lsf/f;

    .line 2377
    .line 2378
    if-eqz v0, :cond_56

    .line 2379
    .line 2380
    move-object v3, v9

    .line 2381
    :cond_56
    check-cast v3, Lca/a;

    .line 2382
    .line 2383
    goto :goto_3a

    .line 2384
    :cond_57
    const/4 v9, 0x0

    .line 2385
    const/16 v16, 0x1

    .line 2386
    .line 2387
    add-int/lit8 v14, v23, 0x1

    .line 2388
    .line 2389
    move-object/from16 v9, v21

    .line 2390
    .line 2391
    goto/16 :goto_30

    .line 2392
    .line 2393
    :cond_58
    move-object/from16 v19, v4

    .line 2394
    .line 2395
    const/4 v9, 0x0

    .line 2396
    const/16 v16, 0x1

    .line 2397
    .line 2398
    add-int/lit8 v14, v14, 0x1

    .line 2399
    .line 2400
    move-object/from16 v4, v19

    .line 2401
    .line 2402
    const/4 v6, 0x3

    .line 2403
    const/4 v9, 0x2

    .line 2404
    goto/16 :goto_27

    .line 2405
    .line 2406
    :cond_59
    move-object/from16 v19, v4

    .line 2407
    .line 2408
    const/4 v9, 0x0

    .line 2409
    move-object v3, v9

    .line 2410
    :goto_3a
    new-instance v29, Lp8/d;

    .line 2411
    .line 2412
    if-eqz v3, :cond_5a

    .line 2413
    .line 2414
    iget-object v12, v3, Lca/a;->a:Ljava/lang/String;

    .line 2415
    .line 2416
    goto :goto_3b

    .line 2417
    :cond_5a
    move-object v12, v9

    .line 2418
    :goto_3b
    if-nez v12, :cond_5b

    .line 2419
    .line 2420
    move-object/from16 v31, v19

    .line 2421
    .line 2422
    goto :goto_3c

    .line 2423
    :cond_5b
    move-object/from16 v31, v12

    .line 2424
    .line 2425
    :goto_3c
    if-eqz v3, :cond_5c

    .line 2426
    .line 2427
    iget v0, v3, Lca/a;->b:I

    .line 2428
    .line 2429
    move/from16 v32, v0

    .line 2430
    .line 2431
    goto :goto_3d

    .line 2432
    :cond_5c
    const/16 v32, 0x0

    .line 2433
    .line 2434
    :goto_3d
    if-eqz v3, :cond_5d

    .line 2435
    .line 2436
    iget v0, v3, Lca/a;->c:I

    .line 2437
    .line 2438
    move/from16 v33, v0

    .line 2439
    .line 2440
    goto :goto_3e

    .line 2441
    :cond_5d
    const/16 v33, 0x0

    .line 2442
    .line 2443
    :goto_3e
    if-eqz v3, :cond_5e

    .line 2444
    .line 2445
    iget v11, v3, Lca/a;->d:I

    .line 2446
    .line 2447
    move/from16 v34, v11

    .line 2448
    .line 2449
    goto :goto_3f

    .line 2450
    :cond_5e
    const/16 v34, 0x0

    .line 2451
    .line 2452
    :goto_3f
    if-eqz v3, :cond_5f

    .line 2453
    .line 2454
    iget-wide v3, v3, Lca/a;->e:J

    .line 2455
    .line 2456
    move-wide/from16 v35, v3

    .line 2457
    .line 2458
    goto :goto_40

    .line 2459
    :cond_5f
    move-wide/from16 v35, v17

    .line 2460
    .line 2461
    :goto_40
    const/16 v37, 0x40

    .line 2462
    .line 2463
    invoke-direct/range {v29 .. v37}, Lp8/d;-><init>(Ljava/lang/String;Ljava/lang/String;IIIJI)V

    .line 2464
    .line 2465
    .line 2466
    return-object v29

    .line 2467
    :pswitch_18
    const/16 v16, 0x1

    .line 2468
    .line 2469
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 2470
    .line 2471
    check-cast v2, Ljava/util/List;

    .line 2472
    .line 2473
    check-cast v0, Ljava/lang/String;

    .line 2474
    .line 2475
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2476
    .line 2477
    .line 2478
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2479
    .line 2480
    .line 2481
    move-result v3

    .line 2482
    if-lez v3, :cond_60

    .line 2483
    .line 2484
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 2485
    .line 2486
    .line 2487
    move-result v0

    .line 2488
    if-eqz v0, :cond_60

    .line 2489
    .line 2490
    move/from16 v10, v16

    .line 2491
    .line 2492
    goto :goto_41

    .line 2493
    :cond_60
    const/4 v10, 0x0

    .line 2494
    :goto_41
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2495
    .line 2496
    .line 2497
    move-result-object v0

    .line 2498
    return-object v0

    .line 2499
    :pswitch_19
    const/4 v9, 0x0

    .line 2500
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 2501
    .line 2502
    check-cast v2, Lb0/d0;

    .line 2503
    .line 2504
    check-cast v0, Lx1/e2;

    .line 2505
    .line 2506
    instance-of v3, v0, Lc0/a;

    .line 2507
    .line 2508
    if-eqz v3, :cond_61

    .line 2509
    .line 2510
    check-cast v0, Lc0/a;

    .line 2511
    .line 2512
    iget-object v0, v0, Lc0/a;->u:Lb0/d0;

    .line 2513
    .line 2514
    invoke-virtual {v2, v0}, Lb0/d0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2515
    .line 2516
    .line 2517
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2518
    .line 2519
    goto :goto_42

    .line 2520
    :cond_61
    const-string v0, "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."

    .line 2521
    .line 2522
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 2523
    .line 2524
    .line 2525
    move-object v12, v9

    .line 2526
    :goto_42
    return-object v12

    .line 2527
    :pswitch_1a
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 2528
    .line 2529
    check-cast v2, Ly/a;

    .line 2530
    .line 2531
    check-cast v0, Lfg/l;

    .line 2532
    .line 2533
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2534
    .line 2535
    .line 2536
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2537
    .line 2538
    return-object v0

    .line 2539
    :pswitch_1b
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 2540
    .line 2541
    check-cast v2, Lc0/c;

    .line 2542
    .line 2543
    check-cast v0, Ly/a;

    .line 2544
    .line 2545
    iget-object v3, v2, Lc0/c;->w:Lb0/q;

    .line 2546
    .line 2547
    sget-object v4, Ly1/i0;->b:Li0/m2;

    .line 2548
    .line 2549
    invoke-static {v2, v4}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 2550
    .line 2551
    .line 2552
    move-result-object v2

    .line 2553
    invoke-virtual {v3, v0, v2}, Lb0/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2554
    .line 2555
    .line 2556
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2557
    .line 2558
    return-object v0

    .line 2559
    :pswitch_1c
    move/from16 v19, v5

    .line 2560
    .line 2561
    move-wide/from16 v34, v6

    .line 2562
    .line 2563
    iget-object v2, v1, Lb0/d0;->h:Ljava/lang/Object;

    .line 2564
    .line 2565
    check-cast v2, Landroid/graphics/drawable/Drawable;

    .line 2566
    .line 2567
    check-cast v0, Lh1/d;

    .line 2568
    .line 2569
    invoke-interface {v0}, Lh1/d;->z0()Lb5/c;

    .line 2570
    .line 2571
    .line 2572
    move-result-object v3

    .line 2573
    invoke-virtual {v3}, Lb5/c;->p()Lf1/u;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v3

    .line 2577
    invoke-interface {v0}, Lh1/d;->a()J

    .line 2578
    .line 2579
    .line 2580
    move-result-wide v4

    .line 2581
    shr-long v4, v4, v19

    .line 2582
    .line 2583
    long-to-int v4, v4

    .line 2584
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2585
    .line 2586
    .line 2587
    move-result v4

    .line 2588
    float-to-int v4, v4

    .line 2589
    invoke-interface {v0}, Lh1/d;->a()J

    .line 2590
    .line 2591
    .line 2592
    move-result-wide v5

    .line 2593
    and-long v5, v5, v34

    .line 2594
    .line 2595
    long-to-int v0, v5

    .line 2596
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2597
    .line 2598
    .line 2599
    move-result v0

    .line 2600
    float-to-int v0, v0

    .line 2601
    const/4 v9, 0x0

    .line 2602
    invoke-virtual {v2, v9, v9, v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2603
    .line 2604
    .line 2605
    invoke-static {v3}, Lf1/c;->a(Lf1/u;)Landroid/graphics/Canvas;

    .line 2606
    .line 2607
    .line 2608
    move-result-object v0

    .line 2609
    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 2610
    .line 2611
    .line 2612
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2613
    .line 2614
    return-object v0

    .line 2615
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
