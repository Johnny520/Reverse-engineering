.class public final Lq2/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li2/t;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Li2/n0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lm2/d;

.field public final f:Lu2/c;

.field public final g:Lq2/f;

.field public final h:Ljava/lang/CharSequence;

.field public final i:Lj2/f;

.field public j:Lb5/c;

.field public final k:Z

.field public final l:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Li2/n0;Ljava/util/List;Ljava/util/List;Lm2/d;Lu2/c;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p1

    .line 13
    .line 14
    iput-object v4, v0, Lq2/d;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v1, v0, Lq2/d;->b:Li2/n0;

    .line 17
    .line 18
    iput-object v2, v0, Lq2/d;->c:Ljava/util/List;

    .line 19
    .line 20
    move-object/from16 v4, p4

    .line 21
    .line 22
    iput-object v4, v0, Lq2/d;->d:Ljava/util/List;

    .line 23
    .line 24
    move-object/from16 v4, p5

    .line 25
    .line 26
    iput-object v4, v0, Lq2/d;->e:Lm2/d;

    .line 27
    .line 28
    iput-object v3, v0, Lq2/d;->f:Lu2/c;

    .line 29
    .line 30
    new-instance v4, Lq2/f;

    .line 31
    .line 32
    invoke-interface {v3}, Lu2/c;->d()F

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-direct {v4, v6}, Landroid/text/TextPaint;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput v5, v4, Landroid/text/TextPaint;->density:F

    .line 41
    .line 42
    sget-object v5, Lt2/l;->b:Lt2/l;

    .line 43
    .line 44
    iput-object v5, v4, Lq2/f;->b:Lt2/l;

    .line 45
    .line 46
    const/4 v5, 0x3

    .line 47
    iput v5, v4, Lq2/f;->c:I

    .line 48
    .line 49
    sget-object v7, Lf1/q0;->d:Lf1/q0;

    .line 50
    .line 51
    iput-object v7, v4, Lq2/f;->d:Lf1/q0;

    .line 52
    .line 53
    iput-object v4, v0, Lq2/d;->g:Lq2/f;

    .line 54
    .line 55
    invoke-static {v1}, Lq2/j;->a(Li2/n0;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const/4 v8, 0x0

    .line 60
    if-nez v7, :cond_0

    .line 61
    .line 62
    move v7, v8

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    sget-object v7, Lq2/i;->a:Lm/a;

    .line 65
    .line 66
    sget-object v7, Lq2/i;->a:Lm/a;

    .line 67
    .line 68
    iget-object v9, v7, Lm/a;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v9, Li0/l2;

    .line 71
    .line 72
    if-eqz v9, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-static {}, Ll3/i;->d()Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_2

    .line 80
    .line 81
    invoke-virtual {v7}, Lm/a;->o()Li0/l2;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    iput-object v9, v7, Lm/a;->h:Ljava/lang/Object;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    sget-object v9, Lq2/j;->a:Lq2/k;

    .line 89
    .line 90
    :goto_0
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    :goto_1
    iput-boolean v7, v0, Lq2/d;->k:Z

    .line 101
    .line 102
    iget-object v7, v1, Li2/n0;->b:Li2/u;

    .line 103
    .line 104
    iget v7, v7, Li2/u;->b:I

    .line 105
    .line 106
    iget-object v9, v1, Li2/n0;->a:Li2/f0;

    .line 107
    .line 108
    iget-object v9, v9, Li2/f0;->k:Lp2/b;

    .line 109
    .line 110
    const/4 v10, 0x4

    .line 111
    const/4 v12, 0x2

    .line 112
    if-ne v7, v10, :cond_4

    .line 113
    .line 114
    :cond_3
    :goto_2
    move v7, v12

    .line 115
    goto :goto_4

    .line 116
    :cond_4
    const/4 v10, 0x5

    .line 117
    if-ne v7, v10, :cond_6

    .line 118
    .line 119
    :cond_5
    move v7, v5

    .line 120
    goto :goto_4

    .line 121
    :cond_6
    if-ne v7, v6, :cond_7

    .line 122
    .line 123
    move v7, v8

    .line 124
    goto :goto_4

    .line 125
    :cond_7
    if-ne v7, v12, :cond_8

    .line 126
    .line 127
    move v7, v6

    .line 128
    goto :goto_4

    .line 129
    :cond_8
    if-ne v7, v5, :cond_9

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_9
    if-nez v7, :cond_8d

    .line 133
    .line 134
    :goto_3
    if-eqz v9, :cond_a

    .line 135
    .line 136
    iget-object v7, v9, Lp2/b;->g:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, Lp2/a;

    .line 143
    .line 144
    iget-object v7, v7, Lp2/a;->a:Ljava/util/Locale;

    .line 145
    .line 146
    if-nez v7, :cond_b

    .line 147
    .line 148
    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    :cond_b
    invoke-static {v7}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_3

    .line 157
    .line 158
    if-eq v7, v6, :cond_5

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :goto_4
    iput v7, v0, Lq2/d;->l:I

    .line 162
    .line 163
    new-instance v7, Lq2/c;

    .line 164
    .line 165
    invoke-direct {v7, v0, v8}, Lq2/c;-><init>(Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    iget-object v9, v1, Li2/n0;->b:Li2/u;

    .line 169
    .line 170
    iget-object v9, v9, Li2/u;->i:Lt2/s;

    .line 171
    .line 172
    if-nez v9, :cond_c

    .line 173
    .line 174
    sget-object v9, Lt2/s;->c:Lt2/s;

    .line 175
    .line 176
    :cond_c
    iget-boolean v10, v9, Lt2/s;->b:Z

    .line 177
    .line 178
    if-eqz v10, :cond_d

    .line 179
    .line 180
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    or-int/lit16 v10, v10, 0x80

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    and-int/lit16 v10, v10, -0x81

    .line 192
    .line 193
    :goto_5
    invoke-virtual {v4, v10}, Landroid/graphics/Paint;->setFlags(I)V

    .line 194
    .line 195
    .line 196
    iget v9, v9, Lt2/s;->a:I

    .line 197
    .line 198
    if-ne v9, v6, :cond_e

    .line 199
    .line 200
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    or-int/lit8 v5, v5, 0x40

    .line 205
    .line 206
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFlags(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setHinting(I)V

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_e
    if-ne v9, v12, :cond_f

    .line 214
    .line 215
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setHinting(I)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_f
    if-ne v9, v5, :cond_10

    .line 223
    .line 224
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v8}, Landroid/graphics/Paint;->setHinting(I)V

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_10
    invoke-virtual {v4}, Landroid/graphics/Paint;->getFlags()I

    .line 232
    .line 233
    .line 234
    :goto_6
    iget-object v1, v1, Li2/n0;->a:Li2/f0;

    .line 235
    .line 236
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    move v9, v8

    .line 241
    :goto_7
    if-ge v9, v5, :cond_12

    .line 242
    .line 243
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    move-object v13, v10

    .line 248
    check-cast v13, Li2/e;

    .line 249
    .line 250
    iget-object v13, v13, Li2/e;->a:Ljava/lang/Object;

    .line 251
    .line 252
    instance-of v13, v13, Li2/f0;

    .line 253
    .line 254
    if-eqz v13, :cond_11

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_11
    add-int/lit8 v9, v9, 0x1

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_12
    const/4 v10, 0x0

    .line 261
    :goto_8
    if-eqz v10, :cond_13

    .line 262
    .line 263
    move v2, v6

    .line 264
    goto :goto_9

    .line 265
    :cond_13
    move v2, v8

    .line 266
    :goto_9
    iget-wide v9, v1, Li2/f0;->b:J

    .line 267
    .line 268
    iget-object v5, v1, Li2/f0;->g:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v13, v1, Li2/f0;->k:Lp2/b;

    .line 271
    .line 272
    iget-object v14, v1, Li2/f0;->a:Lt2/o;

    .line 273
    .line 274
    iget-object v15, v1, Li2/f0;->j:Lt2/p;

    .line 275
    .line 276
    const/16 p1, 0x0

    .line 277
    .line 278
    iget-wide v11, v1, Li2/f0;->h:J

    .line 279
    .line 280
    move/from16 p5, v6

    .line 281
    .line 282
    move-object/from16 v16, v7

    .line 283
    .line 284
    invoke-static {v9, v10}, Lu2/o;->b(J)J

    .line 285
    .line 286
    .line 287
    move-result-wide v6

    .line 288
    move-wide/from16 p2, v9

    .line 289
    .line 290
    const-wide v8, 0x100000000L

    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    invoke-static {v6, v7, v8, v9}, Lu2/p;->a(JJ)Z

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    if-eqz v10, :cond_14

    .line 300
    .line 301
    move-wide/from16 v8, p2

    .line 302
    .line 303
    invoke-interface {v3, v8, v9}, Lu2/c;->O0(J)F

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 308
    .line 309
    .line 310
    goto :goto_a

    .line 311
    :cond_14
    const-wide v8, 0x200000000L

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    invoke-static {v6, v7, v8, v9}, Lu2/p;->a(JJ)Z

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    if-eqz v6, :cond_15

    .line 321
    .line 322
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    invoke-static/range {p2 .. p3}, Lu2/o;->c(J)F

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    mul-float/2addr v7, v6

    .line 331
    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 332
    .line 333
    .line 334
    :cond_15
    :goto_a
    iget-object v6, v1, Li2/f0;->f:Lm2/p;

    .line 335
    .line 336
    if-nez v6, :cond_17

    .line 337
    .line 338
    iget-object v7, v1, Li2/f0;->d:Lm2/i;

    .line 339
    .line 340
    if-nez v7, :cond_17

    .line 341
    .line 342
    iget-object v7, v1, Li2/f0;->c:Lm2/k;

    .line 343
    .line 344
    if-eqz v7, :cond_16

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_16
    move/from16 p2, v2

    .line 348
    .line 349
    move-object/from16 v10, v16

    .line 350
    .line 351
    move-object/from16 v16, v14

    .line 352
    .line 353
    goto :goto_10

    .line 354
    :cond_17
    :goto_b
    iget-object v7, v1, Li2/f0;->c:Lm2/k;

    .line 355
    .line 356
    if-nez v7, :cond_18

    .line 357
    .line 358
    sget-object v7, Lm2/k;->i:Lm2/k;

    .line 359
    .line 360
    :cond_18
    iget-object v8, v1, Li2/f0;->d:Lm2/i;

    .line 361
    .line 362
    if-eqz v8, :cond_19

    .line 363
    .line 364
    iget v8, v8, Lm2/i;->a:I

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_19
    const/4 v8, 0x0

    .line 368
    :goto_c
    iget-object v9, v1, Li2/f0;->e:Lm2/j;

    .line 369
    .line 370
    if-eqz v9, :cond_1a

    .line 371
    .line 372
    iget v9, v9, Lm2/j;->a:I

    .line 373
    .line 374
    :goto_d
    move/from16 p2, v2

    .line 375
    .line 376
    move-object/from16 v10, v16

    .line 377
    .line 378
    goto :goto_e

    .line 379
    :cond_1a
    const v9, 0xffff

    .line 380
    .line 381
    .line 382
    goto :goto_d

    .line 383
    :goto_e
    iget-object v2, v10, Lq2/c;->h:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v2, Lq2/d;

    .line 386
    .line 387
    move-object/from16 v16, v14

    .line 388
    .line 389
    iget-object v14, v2, Lq2/d;->e:Lm2/d;

    .line 390
    .line 391
    check-cast v14, Lm2/e;

    .line 392
    .line 393
    invoke-virtual {v14, v6, v7, v8, v9}, Lm2/e;->b(Lm2/p;Lm2/k;II)Lm2/r;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    instance-of v7, v6, Lm2/r;

    .line 398
    .line 399
    if-nez v7, :cond_1b

    .line 400
    .line 401
    new-instance v7, Lb5/c;

    .line 402
    .line 403
    iget-object v8, v2, Lq2/d;->j:Lb5/c;

    .line 404
    .line 405
    invoke-direct {v7, v6, v8}, Lb5/c;-><init>(Lm2/r;Lb5/c;)V

    .line 406
    .line 407
    .line 408
    iput-object v7, v2, Lq2/d;->j:Lb5/c;

    .line 409
    .line 410
    iget-object v2, v7, Lb5/c;->c:Ljava/lang/Object;

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    check-cast v2, Landroid/graphics/Typeface;

    .line 416
    .line 417
    goto :goto_f

    .line 418
    :cond_1b
    iget-object v2, v6, Lm2/r;->g:Ljava/lang/Object;

    .line 419
    .line 420
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    check-cast v2, Landroid/graphics/Typeface;

    .line 424
    .line 425
    :goto_f
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 426
    .line 427
    .line 428
    :goto_10
    if-eqz v13, :cond_1d

    .line 429
    .line 430
    sget-object v2, Lp2/b;->i:Lp2/b;

    .line 431
    .line 432
    sget-object v2, Lp2/c;->a:Lb5/c;

    .line 433
    .line 434
    invoke-virtual {v2}, Lb5/c;->r()Lp2/b;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v13, v2}, Lp2/b;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-nez v2, :cond_1d

    .line 443
    .line 444
    new-instance v2, Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-static {v13}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 451
    .line 452
    .line 453
    iget-object v6, v13, Lp2/b;->g:Ljava/lang/Object;

    .line 454
    .line 455
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v7

    .line 463
    if-eqz v7, :cond_1c

    .line 464
    .line 465
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v7

    .line 469
    check-cast v7, Lp2/a;

    .line 470
    .line 471
    iget-object v7, v7, Lp2/a;->a:Ljava/util/Locale;

    .line 472
    .line 473
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    goto :goto_11

    .line 477
    :cond_1c
    const/4 v7, 0x0

    .line 478
    new-array v6, v7, [Ljava/util/Locale;

    .line 479
    .line 480
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    check-cast v2, [Ljava/util/Locale;

    .line 485
    .line 486
    array-length v6, v2

    .line 487
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    check-cast v2, [Ljava/util/Locale;

    .line 492
    .line 493
    new-instance v6, Landroid/os/LocaleList;

    .line 494
    .line 495
    invoke-direct {v6, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextLocales(Landroid/os/LocaleList;)V

    .line 499
    .line 500
    .line 501
    :cond_1d
    if-eqz v5, :cond_1e

    .line 502
    .line 503
    const-string v2, ""

    .line 504
    .line 505
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-nez v2, :cond_1e

    .line 510
    .line 511
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    :cond_1e
    if-eqz v15, :cond_1f

    .line 515
    .line 516
    sget-object v2, Lt2/p;->c:Lt2/p;

    .line 517
    .line 518
    invoke-virtual {v15, v2}, Lt2/p;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    if-nez v2, :cond_1f

    .line 523
    .line 524
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    iget v5, v15, Lt2/p;->a:F

    .line 529
    .line 530
    mul-float/2addr v2, v5

    .line 531
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextScaleX(F)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSkewX()F

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    iget v5, v15, Lt2/p;->b:F

    .line 539
    .line 540
    add-float/2addr v2, v5

    .line 541
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 542
    .line 543
    .line 544
    :cond_1f
    invoke-interface/range {v16 .. v16}, Lt2/o;->b()J

    .line 545
    .line 546
    .line 547
    move-result-wide v5

    .line 548
    invoke-virtual {v4, v5, v6}, Lq2/f;->d(J)V

    .line 549
    .line 550
    .line 551
    invoke-interface/range {v16 .. v16}, Lt2/o;->c()Lf1/s;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    invoke-interface/range {v16 .. v16}, Lt2/o;->a()F

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    invoke-virtual {v4, v2, v5, v6, v7}, Lq2/f;->c(Lf1/s;JF)V

    .line 565
    .line 566
    .line 567
    iget-object v2, v1, Li2/f0;->n:Lf1/q0;

    .line 568
    .line 569
    invoke-virtual {v4, v2}, Lq2/f;->f(Lf1/q0;)V

    .line 570
    .line 571
    .line 572
    iget-object v2, v1, Li2/f0;->m:Lt2/l;

    .line 573
    .line 574
    invoke-virtual {v4, v2}, Lq2/f;->g(Lt2/l;)V

    .line 575
    .line 576
    .line 577
    iget-object v2, v1, Li2/f0;->o:Lh1/c;

    .line 578
    .line 579
    invoke-virtual {v4, v2}, Lq2/f;->e(Lh1/c;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v11, v12}, Lu2/o;->b(J)J

    .line 583
    .line 584
    .line 585
    move-result-wide v5

    .line 586
    const-wide v7, 0x100000000L

    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    invoke-static {v5, v6, v7, v8}, Lu2/p;->a(JJ)Z

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    const/4 v5, 0x0

    .line 596
    if-eqz v2, :cond_22

    .line 597
    .line 598
    invoke-static {v11, v12}, Lu2/o;->c(J)F

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    cmpg-float v2, v2, v5

    .line 603
    .line 604
    if-nez v2, :cond_20

    .line 605
    .line 606
    goto :goto_12

    .line 607
    :cond_20
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextScaleX()F

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    mul-float/2addr v6, v2

    .line 616
    invoke-interface {v3, v11, v12}, Lu2/c;->O0(J)F

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    cmpg-float v3, v6, v5

    .line 621
    .line 622
    if-nez v3, :cond_21

    .line 623
    .line 624
    goto :goto_13

    .line 625
    :cond_21
    div-float/2addr v2, v6

    .line 626
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 627
    .line 628
    .line 629
    goto :goto_13

    .line 630
    :cond_22
    :goto_12
    invoke-static {v11, v12}, Lu2/o;->b(J)J

    .line 631
    .line 632
    .line 633
    move-result-wide v2

    .line 634
    const-wide v8, 0x200000000L

    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    invoke-static {v2, v3, v8, v9}, Lu2/p;->a(JJ)Z

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    if-eqz v2, :cond_23

    .line 644
    .line 645
    invoke-static {v11, v12}, Lu2/o;->c(J)F

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 650
    .line 651
    .line 652
    :cond_23
    :goto_13
    iget-wide v2, v1, Li2/f0;->l:J

    .line 653
    .line 654
    iget-object v1, v1, Li2/f0;->i:Lt2/a;

    .line 655
    .line 656
    if-eqz p2, :cond_25

    .line 657
    .line 658
    invoke-static {v11, v12}, Lu2/o;->b(J)J

    .line 659
    .line 660
    .line 661
    move-result-wide v6

    .line 662
    const-wide v8, 0x100000000L

    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    invoke-static {v6, v7, v8, v9}, Lu2/p;->a(JJ)Z

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    if-eqz v4, :cond_25

    .line 672
    .line 673
    invoke-static {v11, v12}, Lu2/o;->c(J)F

    .line 674
    .line 675
    .line 676
    move-result v4

    .line 677
    cmpg-float v4, v4, v5

    .line 678
    .line 679
    if-nez v4, :cond_24

    .line 680
    .line 681
    goto :goto_14

    .line 682
    :cond_24
    move/from16 v4, p5

    .line 683
    .line 684
    goto :goto_15

    .line 685
    :cond_25
    :goto_14
    const/4 v4, 0x0

    .line 686
    :goto_15
    sget-wide v6, Lf1/w;->g:J

    .line 687
    .line 688
    invoke-static {v2, v3, v6, v7}, Lf1/w;->c(JJ)Z

    .line 689
    .line 690
    .line 691
    move-result v8

    .line 692
    if-nez v8, :cond_26

    .line 693
    .line 694
    sget-wide v8, Lf1/w;->f:J

    .line 695
    .line 696
    invoke-static {v2, v3, v8, v9}, Lf1/w;->c(JJ)Z

    .line 697
    .line 698
    .line 699
    move-result v8

    .line 700
    if-nez v8, :cond_26

    .line 701
    .line 702
    move/from16 v8, p5

    .line 703
    .line 704
    goto :goto_16

    .line 705
    :cond_26
    const/4 v8, 0x0

    .line 706
    :goto_16
    if-eqz v1, :cond_28

    .line 707
    .line 708
    iget v9, v1, Lt2/a;->a:F

    .line 709
    .line 710
    invoke-static {v9, v5}, Ljava/lang/Float;->compare(FF)I

    .line 711
    .line 712
    .line 713
    move-result v9

    .line 714
    if-nez v9, :cond_27

    .line 715
    .line 716
    goto :goto_17

    .line 717
    :cond_27
    move/from16 v9, p5

    .line 718
    .line 719
    goto :goto_18

    .line 720
    :cond_28
    :goto_17
    const/4 v9, 0x0

    .line 721
    :goto_18
    if-nez v4, :cond_29

    .line 722
    .line 723
    if-nez v8, :cond_29

    .line 724
    .line 725
    if-nez v9, :cond_29

    .line 726
    .line 727
    move-object/from16 v1, p1

    .line 728
    .line 729
    goto :goto_1d

    .line 730
    :cond_29
    if-eqz v4, :cond_2a

    .line 731
    .line 732
    :goto_19
    move-wide/from16 v28, v11

    .line 733
    .line 734
    goto :goto_1a

    .line 735
    :cond_2a
    sget-wide v11, Lu2/o;->c:J

    .line 736
    .line 737
    goto :goto_19

    .line 738
    :goto_1a
    if-eqz v8, :cond_2b

    .line 739
    .line 740
    move-wide/from16 v33, v2

    .line 741
    .line 742
    goto :goto_1b

    .line 743
    :cond_2b
    move-wide/from16 v33, v6

    .line 744
    .line 745
    :goto_1b
    if-eqz v9, :cond_2c

    .line 746
    .line 747
    move-object/from16 v30, v1

    .line 748
    .line 749
    goto :goto_1c

    .line 750
    :cond_2c
    move-object/from16 v30, p1

    .line 751
    .line 752
    :goto_1c
    new-instance v18, Li2/f0;

    .line 753
    .line 754
    const/16 v36, 0x0

    .line 755
    .line 756
    const v37, 0xf67f

    .line 757
    .line 758
    .line 759
    const-wide/16 v19, 0x0

    .line 760
    .line 761
    const-wide/16 v21, 0x0

    .line 762
    .line 763
    const/16 v23, 0x0

    .line 764
    .line 765
    const/16 v24, 0x0

    .line 766
    .line 767
    const/16 v25, 0x0

    .line 768
    .line 769
    const/16 v26, 0x0

    .line 770
    .line 771
    const/16 v27, 0x0

    .line 772
    .line 773
    const/16 v31, 0x0

    .line 774
    .line 775
    const/16 v32, 0x0

    .line 776
    .line 777
    const/16 v35, 0x0

    .line 778
    .line 779
    invoke-direct/range {v18 .. v37}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;I)V

    .line 780
    .line 781
    .line 782
    move-object/from16 v1, v18

    .line 783
    .line 784
    :goto_1d
    iget-object v2, v0, Lq2/d;->c:Ljava/util/List;

    .line 785
    .line 786
    if-eqz v1, :cond_2f

    .line 787
    .line 788
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    add-int/lit8 v2, v2, 0x1

    .line 793
    .line 794
    new-instance v3, Ljava/util/ArrayList;

    .line 795
    .line 796
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 797
    .line 798
    .line 799
    const/4 v4, 0x0

    .line 800
    :goto_1e
    if-ge v4, v2, :cond_2e

    .line 801
    .line 802
    if-nez v4, :cond_2d

    .line 803
    .line 804
    new-instance v6, Li2/e;

    .line 805
    .line 806
    iget-object v7, v0, Lq2/d;->a:Ljava/lang/String;

    .line 807
    .line 808
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 809
    .line 810
    .line 811
    move-result v7

    .line 812
    const/4 v8, 0x0

    .line 813
    invoke-direct {v6, v8, v7, v1}, Li2/e;-><init>(IILjava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    goto :goto_1f

    .line 817
    :cond_2d
    iget-object v6, v0, Lq2/d;->c:Ljava/util/List;

    .line 818
    .line 819
    add-int/lit8 v7, v4, -0x1

    .line 820
    .line 821
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v6

    .line 825
    check-cast v6, Li2/e;

    .line 826
    .line 827
    :goto_1f
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    add-int/lit8 v4, v4, 0x1

    .line 831
    .line 832
    goto :goto_1e

    .line 833
    :cond_2e
    move-object v2, v3

    .line 834
    :cond_2f
    iget-object v1, v0, Lq2/d;->a:Ljava/lang/String;

    .line 835
    .line 836
    iget-object v3, v0, Lq2/d;->g:Lq2/f;

    .line 837
    .line 838
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    iget-object v4, v0, Lq2/d;->b:Li2/n0;

    .line 843
    .line 844
    iget-object v6, v0, Lq2/d;->d:Ljava/util/List;

    .line 845
    .line 846
    iget-object v14, v0, Lq2/d;->f:Lu2/c;

    .line 847
    .line 848
    iget-boolean v7, v0, Lq2/d;->k:Z

    .line 849
    .line 850
    sget-object v8, Lq2/b;->a:Lq2/a;

    .line 851
    .line 852
    const-class v8, Ll3/v;

    .line 853
    .line 854
    if-eqz v7, :cond_46

    .line 855
    .line 856
    invoke-static {}, Ll3/i;->d()Z

    .line 857
    .line 858
    .line 859
    move-result v7

    .line 860
    if-eqz v7, :cond_46

    .line 861
    .line 862
    iget-object v7, v4, Li2/n0;->c:Li2/x;

    .line 863
    .line 864
    if-eqz v7, :cond_30

    .line 865
    .line 866
    iget-object v7, v7, Li2/x;->a:Li2/w;

    .line 867
    .line 868
    if-eqz v7, :cond_30

    .line 869
    .line 870
    iget v7, v7, Li2/w;->b:I

    .line 871
    .line 872
    new-instance v9, Li2/j;

    .line 873
    .line 874
    invoke-direct {v9, v7}, Li2/j;-><init>(I)V

    .line 875
    .line 876
    .line 877
    goto :goto_20

    .line 878
    :cond_30
    move-object/from16 v9, p1

    .line 879
    .line 880
    :goto_20
    if-nez v9, :cond_32

    .line 881
    .line 882
    :cond_31
    const/4 v7, 0x0

    .line 883
    goto :goto_21

    .line 884
    :cond_32
    iget v7, v9, Li2/j;->a:I

    .line 885
    .line 886
    const/4 v9, 0x2

    .line 887
    if-ne v7, v9, :cond_31

    .line 888
    .line 889
    move/from16 v7, p5

    .line 890
    .line 891
    :goto_21
    invoke-static {}, Ll3/i;->a()Ll3/i;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 896
    .line 897
    .line 898
    move-result v11

    .line 899
    invoke-virtual {v9}, Ll3/i;->c()I

    .line 900
    .line 901
    .line 902
    move-result v12

    .line 903
    move/from16 v13, p5

    .line 904
    .line 905
    if-ne v12, v13, :cond_33

    .line 906
    .line 907
    const/4 v12, 0x1

    .line 908
    goto :goto_22

    .line 909
    :cond_33
    const/4 v12, 0x0

    .line 910
    :goto_22
    if-eqz v12, :cond_45

    .line 911
    .line 912
    if-ltz v11, :cond_44

    .line 913
    .line 914
    if-ltz v11, :cond_34

    .line 915
    .line 916
    const/4 v12, 0x1

    .line 917
    goto :goto_23

    .line 918
    :cond_34
    const/4 v12, 0x0

    .line 919
    :goto_23
    if-eqz v12, :cond_43

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 922
    .line 923
    .line 924
    move-result v12

    .line 925
    if-ltz v12, :cond_35

    .line 926
    .line 927
    const/4 v12, 0x1

    .line 928
    goto :goto_24

    .line 929
    :cond_35
    const/4 v12, 0x0

    .line 930
    :goto_24
    if-eqz v12, :cond_42

    .line 931
    .line 932
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 933
    .line 934
    .line 935
    move-result v12

    .line 936
    if-gt v11, v12, :cond_36

    .line 937
    .line 938
    const/4 v12, 0x1

    .line 939
    goto :goto_25

    .line 940
    :cond_36
    const/4 v12, 0x0

    .line 941
    :goto_25
    if-eqz v12, :cond_41

    .line 942
    .line 943
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 944
    .line 945
    .line 946
    move-result v12

    .line 947
    if-eqz v12, :cond_37

    .line 948
    .line 949
    if-nez v11, :cond_38

    .line 950
    .line 951
    :cond_37
    move-object/from16 v19, v1

    .line 952
    .line 953
    move/from16 p2, v5

    .line 954
    .line 955
    goto/16 :goto_29

    .line 956
    .line 957
    :cond_38
    const/4 v13, 0x1

    .line 958
    if-eq v7, v13, :cond_39

    .line 959
    .line 960
    const/16 v23, 0x0

    .line 961
    .line 962
    goto :goto_26

    .line 963
    :cond_39
    const/16 v23, 0x1

    .line 964
    .line 965
    :goto_26
    iget-object v7, v9, Ll3/i;->e:Ll3/f;

    .line 966
    .line 967
    iget-object v7, v7, Ll3/f;->b:Lb5/c;

    .line 968
    .line 969
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 970
    .line 971
    .line 972
    instance-of v9, v1, Landroid/text/Spannable;

    .line 973
    .line 974
    if-eqz v9, :cond_3a

    .line 975
    .line 976
    new-instance v9, Ll3/y;

    .line 977
    .line 978
    move-object v12, v1

    .line 979
    check-cast v12, Landroid/text/Spannable;

    .line 980
    .line 981
    invoke-direct {v9, v12}, Ll3/y;-><init>(Landroid/text/Spannable;)V

    .line 982
    .line 983
    .line 984
    const/4 v12, 0x0

    .line 985
    goto :goto_27

    .line 986
    :cond_3a
    instance-of v9, v1, Landroid/text/Spanned;

    .line 987
    .line 988
    if-eqz v9, :cond_3b

    .line 989
    .line 990
    move-object v9, v1

    .line 991
    check-cast v9, Landroid/text/Spanned;

    .line 992
    .line 993
    add-int/lit8 v12, v11, 0x1

    .line 994
    .line 995
    const/4 v13, -0x1

    .line 996
    invoke-interface {v9, v13, v12, v8}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 997
    .line 998
    .line 999
    move-result v9

    .line 1000
    if-gt v9, v11, :cond_3b

    .line 1001
    .line 1002
    new-instance v9, Ll3/y;

    .line 1003
    .line 1004
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 1005
    .line 1006
    .line 1007
    const/4 v12, 0x0

    .line 1008
    iput-boolean v12, v9, Ll3/y;->g:Z

    .line 1009
    .line 1010
    new-instance v13, Landroid/text/SpannableString;

    .line 1011
    .line 1012
    invoke-direct {v13, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1013
    .line 1014
    .line 1015
    iput-object v13, v9, Ll3/y;->h:Landroid/text/Spannable;

    .line 1016
    .line 1017
    goto :goto_27

    .line 1018
    :cond_3b
    const/4 v12, 0x0

    .line 1019
    move-object/from16 v9, p1

    .line 1020
    .line 1021
    :goto_27
    if-eqz v9, :cond_3d

    .line 1022
    .line 1023
    iget-object v13, v9, Ll3/y;->h:Landroid/text/Spannable;

    .line 1024
    .line 1025
    invoke-interface {v13, v12, v11, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v13

    .line 1029
    check-cast v13, [Ll3/v;

    .line 1030
    .line 1031
    if-eqz v13, :cond_3d

    .line 1032
    .line 1033
    array-length v12, v13

    .line 1034
    if-lez v12, :cond_3d

    .line 1035
    .line 1036
    array-length v12, v13

    .line 1037
    move/from16 p2, v5

    .line 1038
    .line 1039
    const/4 v5, 0x0

    .line 1040
    const/4 v15, 0x0

    .line 1041
    :goto_28
    move-object/from16 v19, v1

    .line 1042
    .line 1043
    if-ge v15, v12, :cond_3e

    .line 1044
    .line 1045
    aget-object v1, v13, v15

    .line 1046
    .line 1047
    move/from16 v16, v12

    .line 1048
    .line 1049
    iget-object v12, v9, Ll3/y;->h:Landroid/text/Spannable;

    .line 1050
    .line 1051
    invoke-interface {v12, v1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 1052
    .line 1053
    .line 1054
    move-result v12

    .line 1055
    move-object/from16 p3, v13

    .line 1056
    .line 1057
    iget-object v13, v9, Ll3/y;->h:Landroid/text/Spannable;

    .line 1058
    .line 1059
    invoke-interface {v13, v1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v13

    .line 1063
    if-eq v12, v11, :cond_3c

    .line 1064
    .line 1065
    invoke-virtual {v9, v1}, Ll3/y;->removeSpan(Ljava/lang/Object;)V

    .line 1066
    .line 1067
    .line 1068
    :cond_3c
    invoke-static {v12, v5}, Ljava/lang/Math;->min(II)I

    .line 1069
    .line 1070
    .line 1071
    move-result v5

    .line 1072
    invoke-static {v13, v11}, Ljava/lang/Math;->max(II)I

    .line 1073
    .line 1074
    .line 1075
    move-result v11

    .line 1076
    add-int/lit8 v15, v15, 0x1

    .line 1077
    .line 1078
    move-object/from16 v13, p3

    .line 1079
    .line 1080
    move/from16 v12, v16

    .line 1081
    .line 1082
    move-object/from16 v1, v19

    .line 1083
    .line 1084
    goto :goto_28

    .line 1085
    :cond_3d
    move-object/from16 v19, v1

    .line 1086
    .line 1087
    move/from16 p2, v5

    .line 1088
    .line 1089
    const/4 v5, 0x0

    .line 1090
    :cond_3e
    if-eq v5, v11, :cond_40

    .line 1091
    .line 1092
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 1093
    .line 1094
    .line 1095
    move-result v1

    .line 1096
    if-lt v5, v1, :cond_3f

    .line 1097
    .line 1098
    goto :goto_29

    .line 1099
    :cond_3f
    new-instance v1, Lb/e;

    .line 1100
    .line 1101
    iget-object v12, v7, Lb5/c;->a:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v12, La2/a;

    .line 1104
    .line 1105
    const/16 v13, 0x15

    .line 1106
    .line 1107
    invoke-direct {v1, v9, v13, v12}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1108
    .line 1109
    .line 1110
    const v22, 0x7fffffff

    .line 1111
    .line 1112
    .line 1113
    move-object/from16 v24, v1

    .line 1114
    .line 1115
    move/from16 v20, v5

    .line 1116
    .line 1117
    move-object/from16 v18, v7

    .line 1118
    .line 1119
    move/from16 v21, v11

    .line 1120
    .line 1121
    invoke-virtual/range {v18 .. v24}, Lb5/c;->G(Ljava/lang/CharSequence;IIIZLl3/o;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    check-cast v1, Ll3/y;

    .line 1126
    .line 1127
    if-eqz v1, :cond_40

    .line 1128
    .line 1129
    iget-object v1, v1, Ll3/y;->h:Landroid/text/Spannable;

    .line 1130
    .line 1131
    goto :goto_2a

    .line 1132
    :cond_40
    :goto_29
    move-object/from16 v1, v19

    .line 1133
    .line 1134
    :goto_2a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1135
    .line 1136
    .line 1137
    goto :goto_2b

    .line 1138
    :cond_41
    const-string v1, "end should be < than charSequence length"

    .line 1139
    .line 1140
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    throw p1

    .line 1144
    :cond_42
    const-string v1, "start should be < than charSequence length"

    .line 1145
    .line 1146
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    throw p1

    .line 1150
    :cond_43
    const-string v1, "start should be <= than end"

    .line 1151
    .line 1152
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1153
    .line 1154
    .line 1155
    throw p1

    .line 1156
    :cond_44
    const-string v1, "end cannot be negative"

    .line 1157
    .line 1158
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1159
    .line 1160
    .line 1161
    throw p1

    .line 1162
    :cond_45
    const-string v1, "Not initialized yet"

    .line 1163
    .line 1164
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1165
    .line 1166
    .line 1167
    throw p1

    .line 1168
    :cond_46
    move-object/from16 v19, v1

    .line 1169
    .line 1170
    move/from16 p2, v5

    .line 1171
    .line 1172
    move-object/from16 v1, v19

    .line 1173
    .line 1174
    :goto_2b
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1175
    .line 1176
    .line 1177
    move-result v5

    .line 1178
    const-wide v15, 0xff00000000L

    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    if-eqz v5, :cond_47

    .line 1184
    .line 1185
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1186
    .line 1187
    .line 1188
    move-result v5

    .line 1189
    if-eqz v5, :cond_47

    .line 1190
    .line 1191
    iget-object v5, v4, Li2/n0;->b:Li2/u;

    .line 1192
    .line 1193
    iget-object v5, v5, Li2/u;->d:Lt2/q;

    .line 1194
    .line 1195
    sget-object v7, Lt2/q;->c:Lt2/q;

    .line 1196
    .line 1197
    invoke-static {v5, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v5

    .line 1201
    if-eqz v5, :cond_47

    .line 1202
    .line 1203
    iget-object v5, v4, Li2/n0;->b:Li2/u;

    .line 1204
    .line 1205
    const-wide/16 v20, 0x0

    .line 1206
    .line 1207
    iget-wide v11, v5, Li2/u;->c:J

    .line 1208
    .line 1209
    and-long/2addr v11, v15

    .line 1210
    cmp-long v5, v11, v20

    .line 1211
    .line 1212
    if-nez v5, :cond_48

    .line 1213
    .line 1214
    goto/16 :goto_57

    .line 1215
    .line 1216
    :cond_47
    const-wide/16 v20, 0x0

    .line 1217
    .line 1218
    :cond_48
    instance-of v5, v1, Landroid/text/Spannable;

    .line 1219
    .line 1220
    if-eqz v5, :cond_49

    .line 1221
    .line 1222
    check-cast v1, Landroid/text/Spannable;

    .line 1223
    .line 1224
    move-object v11, v1

    .line 1225
    goto :goto_2c

    .line 1226
    :cond_49
    new-instance v5, Landroid/text/SpannableString;

    .line 1227
    .line 1228
    invoke-direct {v5, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1229
    .line 1230
    .line 1231
    move-object v11, v5

    .line 1232
    :goto_2c
    iget-object v1, v4, Li2/n0;->a:Li2/f0;

    .line 1233
    .line 1234
    iget-object v1, v1, Li2/f0;->m:Lt2/l;

    .line 1235
    .line 1236
    sget-object v5, Lt2/l;->c:Lt2/l;

    .line 1237
    .line 1238
    invoke-static {v1, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1239
    .line 1240
    .line 1241
    move-result v1

    .line 1242
    const/16 v5, 0x21

    .line 1243
    .line 1244
    if-eqz v1, :cond_4a

    .line 1245
    .line 1246
    sget-object v1, Lq2/b;->a:Lq2/a;

    .line 1247
    .line 1248
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 1249
    .line 1250
    .line 1251
    move-result v7

    .line 1252
    const/4 v12, 0x0

    .line 1253
    invoke-interface {v11, v1, v12, v7, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1254
    .line 1255
    .line 1256
    :cond_4a
    iget-object v1, v4, Li2/n0;->c:Li2/x;

    .line 1257
    .line 1258
    if-eqz v1, :cond_4b

    .line 1259
    .line 1260
    iget-object v1, v1, Li2/x;->a:Li2/w;

    .line 1261
    .line 1262
    if-eqz v1, :cond_4b

    .line 1263
    .line 1264
    iget-boolean v1, v1, Li2/w;->a:Z

    .line 1265
    .line 1266
    goto :goto_2d

    .line 1267
    :cond_4b
    const/4 v1, 0x0

    .line 1268
    :goto_2d
    if-eqz v1, :cond_4d

    .line 1269
    .line 1270
    iget-object v1, v4, Li2/n0;->b:Li2/u;

    .line 1271
    .line 1272
    iget-object v7, v1, Li2/u;->f:Lt2/i;

    .line 1273
    .line 1274
    if-nez v7, :cond_4d

    .line 1275
    .line 1276
    iget-wide v12, v1, Li2/u;->c:J

    .line 1277
    .line 1278
    invoke-static {v12, v13, v3, v14}, Lf8/i;->A0(JFLu2/c;)F

    .line 1279
    .line 1280
    .line 1281
    move-result v1

    .line 1282
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v7

    .line 1286
    if-nez v7, :cond_4c

    .line 1287
    .line 1288
    new-instance v7, Ll2/g;

    .line 1289
    .line 1290
    invoke-direct {v7, v1}, Ll2/g;-><init>(F)V

    .line 1291
    .line 1292
    .line 1293
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1294
    .line 1295
    .line 1296
    move-result v1

    .line 1297
    const/4 v12, 0x0

    .line 1298
    invoke-interface {v11, v7, v12, v1, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1299
    .line 1300
    .line 1301
    :cond_4c
    const/4 v12, 0x0

    .line 1302
    goto :goto_33

    .line 1303
    :cond_4d
    iget-object v1, v4, Li2/n0;->b:Li2/u;

    .line 1304
    .line 1305
    iget-object v7, v1, Li2/u;->f:Lt2/i;

    .line 1306
    .line 1307
    if-nez v7, :cond_4e

    .line 1308
    .line 1309
    sget-object v7, Lt2/i;->d:Lt2/i;

    .line 1310
    .line 1311
    :cond_4e
    iget-wide v12, v1, Li2/u;->c:J

    .line 1312
    .line 1313
    invoke-static {v12, v13, v3, v14}, Lf8/i;->A0(JFLu2/c;)F

    .line 1314
    .line 1315
    .line 1316
    move-result v23

    .line 1317
    invoke-static/range {v23 .. v23}, Ljava/lang/Float;->isNaN(F)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v1

    .line 1321
    if-nez v1, :cond_4c

    .line 1322
    .line 1323
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1324
    .line 1325
    .line 1326
    move-result v1

    .line 1327
    if-nez v1, :cond_4f

    .line 1328
    .line 1329
    goto :goto_2e

    .line 1330
    :cond_4f
    invoke-static {v11}, Log/m;->u0(Ljava/lang/CharSequence;)C

    .line 1331
    .line 1332
    .line 1333
    move-result v1

    .line 1334
    const/16 v9, 0xa

    .line 1335
    .line 1336
    if-ne v1, v9, :cond_50

    .line 1337
    .line 1338
    :goto_2e
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1339
    .line 1340
    .line 1341
    move-result v1

    .line 1342
    const/4 v13, 0x1

    .line 1343
    add-int/2addr v1, v13

    .line 1344
    :goto_2f
    move/from16 v24, v1

    .line 1345
    .line 1346
    goto :goto_30

    .line 1347
    :cond_50
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1348
    .line 1349
    .line 1350
    move-result v1

    .line 1351
    goto :goto_2f

    .line 1352
    :goto_30
    new-instance v22, Ll2/h;

    .line 1353
    .line 1354
    iget v1, v7, Lt2/i;->b:I

    .line 1355
    .line 1356
    and-int/lit8 v9, v1, 0x1

    .line 1357
    .line 1358
    if-lez v9, :cond_51

    .line 1359
    .line 1360
    const/16 v25, 0x1

    .line 1361
    .line 1362
    goto :goto_31

    .line 1363
    :cond_51
    const/16 v25, 0x0

    .line 1364
    .line 1365
    :goto_31
    and-int/lit8 v1, v1, 0x10

    .line 1366
    .line 1367
    if-lez v1, :cond_52

    .line 1368
    .line 1369
    const/16 v26, 0x1

    .line 1370
    .line 1371
    goto :goto_32

    .line 1372
    :cond_52
    const/16 v26, 0x0

    .line 1373
    .line 1374
    :goto_32
    iget v1, v7, Lt2/i;->a:F

    .line 1375
    .line 1376
    iget v7, v7, Lt2/i;->c:I

    .line 1377
    .line 1378
    move/from16 v27, v1

    .line 1379
    .line 1380
    move/from16 v28, v7

    .line 1381
    .line 1382
    invoke-direct/range {v22 .. v28}, Ll2/h;-><init>(FIZZFI)V

    .line 1383
    .line 1384
    .line 1385
    move-object/from16 v1, v22

    .line 1386
    .line 1387
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1388
    .line 1389
    .line 1390
    move-result v7

    .line 1391
    const/4 v12, 0x0

    .line 1392
    invoke-interface {v11, v1, v12, v7, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1393
    .line 1394
    .line 1395
    :goto_33
    iget-object v1, v4, Li2/n0;->b:Li2/u;

    .line 1396
    .line 1397
    iget-object v1, v1, Li2/u;->d:Lt2/q;

    .line 1398
    .line 1399
    if-eqz v1, :cond_5b

    .line 1400
    .line 1401
    move/from16 v17, v12

    .line 1402
    .line 1403
    iget-wide v12, v1, Lt2/q;->a:J

    .line 1404
    .line 1405
    move-object v7, v6

    .line 1406
    iget-wide v5, v1, Lt2/q;->b:J

    .line 1407
    .line 1408
    invoke-static/range {v17 .. v17}, Lx6/d;->D(I)J

    .line 1409
    .line 1410
    .line 1411
    move-result-wide v0

    .line 1412
    invoke-static {v12, v13, v0, v1}, Lu2/o;->a(JJ)Z

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    if-eqz v0, :cond_53

    .line 1417
    .line 1418
    invoke-static/range {v17 .. v17}, Lx6/d;->D(I)J

    .line 1419
    .line 1420
    .line 1421
    move-result-wide v0

    .line 1422
    invoke-static {v5, v6, v0, v1}, Lu2/o;->a(JJ)Z

    .line 1423
    .line 1424
    .line 1425
    move-result v0

    .line 1426
    if-nez v0, :cond_54

    .line 1427
    .line 1428
    :cond_53
    and-long v0, v12, v15

    .line 1429
    .line 1430
    cmp-long v0, v0, v20

    .line 1431
    .line 1432
    if-nez v0, :cond_55

    .line 1433
    .line 1434
    :cond_54
    :goto_34
    move-object v9, v7

    .line 1435
    :goto_35
    move-object/from16 p6, v8

    .line 1436
    .line 1437
    goto/16 :goto_38

    .line 1438
    .line 1439
    :cond_55
    and-long v0, v5, v15

    .line 1440
    .line 1441
    cmp-long v0, v0, v20

    .line 1442
    .line 1443
    if-nez v0, :cond_56

    .line 1444
    .line 1445
    goto :goto_34

    .line 1446
    :cond_56
    invoke-static {v12, v13}, Lu2/o;->b(J)J

    .line 1447
    .line 1448
    .line 1449
    move-result-wide v0

    .line 1450
    move-object v9, v7

    .line 1451
    move-object/from16 p6, v8

    .line 1452
    .line 1453
    const-wide v7, 0x100000000L

    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    invoke-static {v0, v1, v7, v8}, Lu2/p;->a(JJ)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v15

    .line 1462
    if-eqz v15, :cond_57

    .line 1463
    .line 1464
    invoke-interface {v14, v12, v13}, Lu2/c;->O0(J)F

    .line 1465
    .line 1466
    .line 1467
    move-result v0

    .line 1468
    const-wide v7, 0x200000000L

    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    goto :goto_36

    .line 1474
    :cond_57
    const-wide v7, 0x200000000L

    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    invoke-static {v0, v1, v7, v8}, Lu2/p;->a(JJ)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v0

    .line 1483
    if-eqz v0, :cond_58

    .line 1484
    .line 1485
    invoke-static {v12, v13}, Lu2/o;->c(J)F

    .line 1486
    .line 1487
    .line 1488
    move-result v0

    .line 1489
    mul-float/2addr v0, v3

    .line 1490
    goto :goto_36

    .line 1491
    :cond_58
    move/from16 v0, p2

    .line 1492
    .line 1493
    :goto_36
    invoke-static {v5, v6}, Lu2/o;->b(J)J

    .line 1494
    .line 1495
    .line 1496
    move-result-wide v12

    .line 1497
    const-wide v7, 0x100000000L

    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    invoke-static {v12, v13, v7, v8}, Lu2/p;->a(JJ)Z

    .line 1503
    .line 1504
    .line 1505
    move-result v1

    .line 1506
    if-eqz v1, :cond_59

    .line 1507
    .line 1508
    invoke-interface {v14, v5, v6}, Lu2/c;->O0(J)F

    .line 1509
    .line 1510
    .line 1511
    move-result v1

    .line 1512
    goto :goto_37

    .line 1513
    :cond_59
    const-wide v7, 0x200000000L

    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    invoke-static {v12, v13, v7, v8}, Lu2/p;->a(JJ)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v1

    .line 1522
    if-eqz v1, :cond_5a

    .line 1523
    .line 1524
    invoke-static {v5, v6}, Lu2/o;->c(J)F

    .line 1525
    .line 1526
    .line 1527
    move-result v1

    .line 1528
    mul-float/2addr v1, v3

    .line 1529
    goto :goto_37

    .line 1530
    :cond_5a
    move/from16 v1, p2

    .line 1531
    .line 1532
    :goto_37
    new-instance v3, Landroid/text/style/LeadingMarginSpan$Standard;

    .line 1533
    .line 1534
    float-to-double v5, v0

    .line 1535
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 1536
    .line 1537
    .line 1538
    move-result-wide v5

    .line 1539
    double-to-float v0, v5

    .line 1540
    float-to-int v0, v0

    .line 1541
    float-to-double v5, v1

    .line 1542
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 1543
    .line 1544
    .line 1545
    move-result-wide v5

    .line 1546
    double-to-float v1, v5

    .line 1547
    float-to-int v1, v1

    .line 1548
    invoke-direct {v3, v0, v1}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 1549
    .line 1550
    .line 1551
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1552
    .line 1553
    .line 1554
    move-result v0

    .line 1555
    const/16 v1, 0x21

    .line 1556
    .line 1557
    const/4 v12, 0x0

    .line 1558
    invoke-interface {v11, v3, v12, v0, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1559
    .line 1560
    .line 1561
    goto :goto_38

    .line 1562
    :cond_5b
    move-object v9, v6

    .line 1563
    goto/16 :goto_35

    .line 1564
    .line 1565
    :goto_38
    new-instance v0, Ljava/util/ArrayList;

    .line 1566
    .line 1567
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1568
    .line 1569
    .line 1570
    move-result v1

    .line 1571
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1572
    .line 1573
    .line 1574
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1575
    .line 1576
    .line 1577
    move-result v1

    .line 1578
    const/4 v3, 0x0

    .line 1579
    :goto_39
    if-ge v3, v1, :cond_60

    .line 1580
    .line 1581
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v5

    .line 1585
    check-cast v5, Li2/e;

    .line 1586
    .line 1587
    iget-object v6, v5, Li2/e;->a:Ljava/lang/Object;

    .line 1588
    .line 1589
    instance-of v7, v6, Li2/f0;

    .line 1590
    .line 1591
    if-eqz v7, :cond_5f

    .line 1592
    .line 1593
    move-object v7, v6

    .line 1594
    check-cast v7, Li2/f0;

    .line 1595
    .line 1596
    iget-object v8, v7, Li2/f0;->f:Lm2/p;

    .line 1597
    .line 1598
    if-nez v8, :cond_5d

    .line 1599
    .line 1600
    iget-object v8, v7, Li2/f0;->d:Lm2/i;

    .line 1601
    .line 1602
    if-nez v8, :cond_5d

    .line 1603
    .line 1604
    iget-object v7, v7, Li2/f0;->c:Lm2/k;

    .line 1605
    .line 1606
    if-eqz v7, :cond_5c

    .line 1607
    .line 1608
    goto :goto_3a

    .line 1609
    :cond_5c
    const/4 v7, 0x0

    .line 1610
    goto :goto_3b

    .line 1611
    :cond_5d
    :goto_3a
    const/4 v7, 0x1

    .line 1612
    :goto_3b
    if-nez v7, :cond_5e

    .line 1613
    .line 1614
    check-cast v6, Li2/f0;

    .line 1615
    .line 1616
    iget-object v6, v6, Li2/f0;->e:Lm2/j;

    .line 1617
    .line 1618
    if-eqz v6, :cond_5f

    .line 1619
    .line 1620
    :cond_5e
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1621
    .line 1622
    .line 1623
    :cond_5f
    add-int/lit8 v3, v3, 0x1

    .line 1624
    .line 1625
    goto :goto_39

    .line 1626
    :cond_60
    iget-object v1, v4, Li2/n0;->a:Li2/f0;

    .line 1627
    .line 1628
    iget-object v3, v1, Li2/f0;->f:Lm2/p;

    .line 1629
    .line 1630
    if-nez v3, :cond_62

    .line 1631
    .line 1632
    iget-object v5, v1, Li2/f0;->d:Lm2/i;

    .line 1633
    .line 1634
    if-nez v5, :cond_62

    .line 1635
    .line 1636
    iget-object v5, v1, Li2/f0;->c:Lm2/k;

    .line 1637
    .line 1638
    if-eqz v5, :cond_61

    .line 1639
    .line 1640
    goto :goto_3c

    .line 1641
    :cond_61
    const/4 v5, 0x0

    .line 1642
    goto :goto_3d

    .line 1643
    :cond_62
    :goto_3c
    const/4 v5, 0x1

    .line 1644
    :goto_3d
    if-nez v5, :cond_64

    .line 1645
    .line 1646
    iget-object v5, v1, Li2/f0;->e:Lm2/j;

    .line 1647
    .line 1648
    if-eqz v5, :cond_63

    .line 1649
    .line 1650
    goto :goto_3e

    .line 1651
    :cond_63
    move-object/from16 v1, p1

    .line 1652
    .line 1653
    goto :goto_3f

    .line 1654
    :cond_64
    :goto_3e
    iget-object v5, v1, Li2/f0;->c:Lm2/k;

    .line 1655
    .line 1656
    iget-object v6, v1, Li2/f0;->d:Lm2/i;

    .line 1657
    .line 1658
    iget-object v1, v1, Li2/f0;->e:Lm2/j;

    .line 1659
    .line 1660
    new-instance v18, Li2/f0;

    .line 1661
    .line 1662
    const/16 v36, 0x0

    .line 1663
    .line 1664
    const v37, 0xffc3

    .line 1665
    .line 1666
    .line 1667
    const-wide/16 v19, 0x0

    .line 1668
    .line 1669
    const-wide/16 v21, 0x0

    .line 1670
    .line 1671
    const/16 v27, 0x0

    .line 1672
    .line 1673
    const-wide/16 v28, 0x0

    .line 1674
    .line 1675
    const/16 v30, 0x0

    .line 1676
    .line 1677
    const/16 v31, 0x0

    .line 1678
    .line 1679
    const/16 v32, 0x0

    .line 1680
    .line 1681
    const-wide/16 v33, 0x0

    .line 1682
    .line 1683
    const/16 v35, 0x0

    .line 1684
    .line 1685
    move-object/from16 v25, v1

    .line 1686
    .line 1687
    move-object/from16 v26, v3

    .line 1688
    .line 1689
    move-object/from16 v23, v5

    .line 1690
    .line 1691
    move-object/from16 v24, v6

    .line 1692
    .line 1693
    invoke-direct/range {v18 .. v37}, Li2/f0;-><init>(JJLm2/k;Lm2/i;Lm2/j;Lm2/p;Ljava/lang/String;JLt2/a;Lt2/p;Lp2/b;JLt2/l;Lf1/q0;I)V

    .line 1694
    .line 1695
    .line 1696
    move-object/from16 v1, v18

    .line 1697
    .line 1698
    :goto_3f
    new-instance v3, Ldb/f;

    .line 1699
    .line 1700
    const/4 v5, 0x2

    .line 1701
    invoke-direct {v3, v11, v5, v10}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1702
    .line 1703
    .line 1704
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1705
    .line 1706
    .line 1707
    move-result v5

    .line 1708
    const/4 v13, 0x1

    .line 1709
    if-gt v5, v13, :cond_66

    .line 1710
    .line 1711
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1712
    .line 1713
    .line 1714
    move-result v5

    .line 1715
    if-nez v5, :cond_6e

    .line 1716
    .line 1717
    const/4 v12, 0x0

    .line 1718
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v5

    .line 1722
    check-cast v5, Li2/e;

    .line 1723
    .line 1724
    iget-object v5, v5, Li2/e;->a:Ljava/lang/Object;

    .line 1725
    .line 1726
    check-cast v5, Li2/f0;

    .line 1727
    .line 1728
    if-nez v1, :cond_65

    .line 1729
    .line 1730
    goto :goto_40

    .line 1731
    :cond_65
    invoke-virtual {v1, v5}, Li2/f0;->c(Li2/f0;)Li2/f0;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v5

    .line 1735
    :goto_40
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v1

    .line 1739
    check-cast v1, Li2/e;

    .line 1740
    .line 1741
    iget v1, v1, Li2/e;->b:I

    .line 1742
    .line 1743
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v1

    .line 1747
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v0

    .line 1751
    check-cast v0, Li2/e;

    .line 1752
    .line 1753
    iget v0, v0, Li2/e;->c:I

    .line 1754
    .line 1755
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    invoke-virtual {v3, v5, v1, v0}, Ldb/f;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1760
    .line 1761
    .line 1762
    goto/16 :goto_47

    .line 1763
    .line 1764
    :cond_66
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1765
    .line 1766
    .line 1767
    move-result v5

    .line 1768
    mul-int/lit8 v6, v5, 0x2

    .line 1769
    .line 1770
    new-array v7, v6, [I

    .line 1771
    .line 1772
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1773
    .line 1774
    .line 1775
    move-result v8

    .line 1776
    const/4 v10, 0x0

    .line 1777
    :goto_41
    if-ge v10, v8, :cond_67

    .line 1778
    .line 1779
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v12

    .line 1783
    check-cast v12, Li2/e;

    .line 1784
    .line 1785
    iget v13, v12, Li2/e;->b:I

    .line 1786
    .line 1787
    aput v13, v7, v10

    .line 1788
    .line 1789
    add-int v13, v10, v5

    .line 1790
    .line 1791
    iget v12, v12, Li2/e;->c:I

    .line 1792
    .line 1793
    aput v12, v7, v13

    .line 1794
    .line 1795
    add-int/lit8 v10, v10, 0x1

    .line 1796
    .line 1797
    goto :goto_41

    .line 1798
    :cond_67
    const/4 v13, 0x1

    .line 1799
    if-le v6, v13, :cond_68

    .line 1800
    .line 1801
    invoke-static {v7}, Ljava/util/Arrays;->sort([I)V

    .line 1802
    .line 1803
    .line 1804
    :cond_68
    if-eqz v6, :cond_8c

    .line 1805
    .line 1806
    const/16 v17, 0x0

    .line 1807
    .line 1808
    aget v5, v7, v17

    .line 1809
    .line 1810
    const/4 v8, 0x0

    .line 1811
    :goto_42
    if-ge v8, v6, :cond_6e

    .line 1812
    .line 1813
    aget v10, v7, v8

    .line 1814
    .line 1815
    if-ne v10, v5, :cond_69

    .line 1816
    .line 1817
    move-object/from16 p4, v0

    .line 1818
    .line 1819
    move-object/from16 v16, v1

    .line 1820
    .line 1821
    move/from16 v18, v6

    .line 1822
    .line 1823
    goto :goto_46

    .line 1824
    :cond_69
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1825
    .line 1826
    .line 1827
    move-result v12

    .line 1828
    move-object v15, v1

    .line 1829
    const/4 v13, 0x0

    .line 1830
    :goto_43
    if-ge v13, v12, :cond_6c

    .line 1831
    .line 1832
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v16

    .line 1836
    move-object/from16 p4, v0

    .line 1837
    .line 1838
    move-object/from16 v0, v16

    .line 1839
    .line 1840
    check-cast v0, Li2/e;

    .line 1841
    .line 1842
    move-object/from16 v16, v1

    .line 1843
    .line 1844
    iget v1, v0, Li2/e;->b:I

    .line 1845
    .line 1846
    move/from16 v18, v6

    .line 1847
    .line 1848
    iget v6, v0, Li2/e;->c:I

    .line 1849
    .line 1850
    if-eq v1, v6, :cond_6b

    .line 1851
    .line 1852
    invoke-static {v5, v10, v1, v6}, Li2/h;->b(IIII)Z

    .line 1853
    .line 1854
    .line 1855
    move-result v1

    .line 1856
    if-eqz v1, :cond_6b

    .line 1857
    .line 1858
    iget-object v0, v0, Li2/e;->a:Ljava/lang/Object;

    .line 1859
    .line 1860
    check-cast v0, Li2/f0;

    .line 1861
    .line 1862
    if-nez v15, :cond_6a

    .line 1863
    .line 1864
    :goto_44
    move-object v15, v0

    .line 1865
    goto :goto_45

    .line 1866
    :cond_6a
    invoke-virtual {v15, v0}, Li2/f0;->c(Li2/f0;)Li2/f0;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    goto :goto_44

    .line 1871
    :cond_6b
    :goto_45
    add-int/lit8 v13, v13, 0x1

    .line 1872
    .line 1873
    move-object/from16 v0, p4

    .line 1874
    .line 1875
    move-object/from16 v1, v16

    .line 1876
    .line 1877
    move/from16 v6, v18

    .line 1878
    .line 1879
    goto :goto_43

    .line 1880
    :cond_6c
    move-object/from16 p4, v0

    .line 1881
    .line 1882
    move-object/from16 v16, v1

    .line 1883
    .line 1884
    move/from16 v18, v6

    .line 1885
    .line 1886
    if-eqz v15, :cond_6d

    .line 1887
    .line 1888
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v0

    .line 1892
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v1

    .line 1896
    invoke-virtual {v3, v15, v0, v1}, Ldb/f;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1897
    .line 1898
    .line 1899
    :cond_6d
    move v5, v10

    .line 1900
    :goto_46
    add-int/lit8 v8, v8, 0x1

    .line 1901
    .line 1902
    move-object/from16 v0, p4

    .line 1903
    .line 1904
    move-object/from16 v1, v16

    .line 1905
    .line 1906
    move/from16 v6, v18

    .line 1907
    .line 1908
    goto :goto_42

    .line 1909
    :cond_6e
    :goto_47
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1910
    .line 1911
    .line 1912
    move-result v0

    .line 1913
    const/4 v1, 0x0

    .line 1914
    const/4 v7, 0x0

    .line 1915
    :goto_48
    if-ge v7, v0, :cond_7f

    .line 1916
    .line 1917
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v3

    .line 1921
    check-cast v3, Li2/e;

    .line 1922
    .line 1923
    iget-object v5, v3, Li2/e;->a:Ljava/lang/Object;

    .line 1924
    .line 1925
    instance-of v6, v5, Li2/f0;

    .line 1926
    .line 1927
    if-eqz v6, :cond_6f

    .line 1928
    .line 1929
    iget v15, v3, Li2/e;->b:I

    .line 1930
    .line 1931
    iget v3, v3, Li2/e;->c:I

    .line 1932
    .line 1933
    if-ltz v15, :cond_6f

    .line 1934
    .line 1935
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1936
    .line 1937
    .line 1938
    move-result v6

    .line 1939
    if-ge v15, v6, :cond_6f

    .line 1940
    .line 1941
    if-le v3, v15, :cond_6f

    .line 1942
    .line 1943
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 1944
    .line 1945
    .line 1946
    move-result v6

    .line 1947
    if-le v3, v6, :cond_70

    .line 1948
    .line 1949
    :cond_6f
    move/from16 p4, v0

    .line 1950
    .line 1951
    move/from16 v16, v7

    .line 1952
    .line 1953
    move-object/from16 v18, v14

    .line 1954
    .line 1955
    move v14, v1

    .line 1956
    goto/16 :goto_4f

    .line 1957
    .line 1958
    :cond_70
    check-cast v5, Li2/f0;

    .line 1959
    .line 1960
    iget-object v6, v5, Li2/f0;->i:Lt2/a;

    .line 1961
    .line 1962
    iget-object v8, v5, Li2/f0;->a:Lt2/o;

    .line 1963
    .line 1964
    if-eqz v6, :cond_71

    .line 1965
    .line 1966
    iget v6, v6, Lt2/a;->a:F

    .line 1967
    .line 1968
    new-instance v10, Ll2/a;

    .line 1969
    .line 1970
    const/4 v12, 0x0

    .line 1971
    invoke-direct {v10, v12, v6}, Ll2/a;-><init>(IF)V

    .line 1972
    .line 1973
    .line 1974
    const/16 v6, 0x21

    .line 1975
    .line 1976
    invoke-interface {v11, v10, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1977
    .line 1978
    .line 1979
    :cond_71
    invoke-interface {v8}, Lt2/o;->b()J

    .line 1980
    .line 1981
    .line 1982
    move-result-wide v12

    .line 1983
    invoke-static {v11, v12, v13, v15, v3}, Lf8/i;->C0(Landroid/text/Spannable;JII)V

    .line 1984
    .line 1985
    .line 1986
    invoke-interface {v8}, Lt2/o;->c()Lf1/s;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v6

    .line 1990
    invoke-interface {v8}, Lt2/o;->a()F

    .line 1991
    .line 1992
    .line 1993
    move-result v8

    .line 1994
    if-eqz v6, :cond_73

    .line 1995
    .line 1996
    instance-of v10, v6, Lf1/t0;

    .line 1997
    .line 1998
    if-eqz v10, :cond_72

    .line 1999
    .line 2000
    check-cast v6, Lf1/t0;

    .line 2001
    .line 2002
    iget-wide v12, v6, Lf1/t0;->a:J

    .line 2003
    .line 2004
    invoke-static {v11, v12, v13, v15, v3}, Lf8/i;->C0(Landroid/text/Spannable;JII)V

    .line 2005
    .line 2006
    .line 2007
    goto :goto_49

    .line 2008
    :cond_72
    new-instance v10, Ls2/b;

    .line 2009
    .line 2010
    check-cast v6, Lf1/p0;

    .line 2011
    .line 2012
    invoke-direct {v10, v6, v8}, Ls2/b;-><init>(Lf1/p0;F)V

    .line 2013
    .line 2014
    .line 2015
    const/16 v6, 0x21

    .line 2016
    .line 2017
    invoke-interface {v11, v10, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2018
    .line 2019
    .line 2020
    :cond_73
    :goto_49
    iget-object v6, v5, Li2/f0;->m:Lt2/l;

    .line 2021
    .line 2022
    if-eqz v6, :cond_76

    .line 2023
    .line 2024
    iget v6, v6, Lt2/l;->a:I

    .line 2025
    .line 2026
    new-instance v8, Ll2/k;

    .line 2027
    .line 2028
    or-int/lit8 v10, v6, 0x1

    .line 2029
    .line 2030
    if-ne v10, v6, :cond_74

    .line 2031
    .line 2032
    const/4 v10, 0x1

    .line 2033
    goto :goto_4a

    .line 2034
    :cond_74
    const/4 v10, 0x0

    .line 2035
    :goto_4a
    or-int/lit8 v12, v6, 0x2

    .line 2036
    .line 2037
    if-ne v12, v6, :cond_75

    .line 2038
    .line 2039
    const/4 v6, 0x1

    .line 2040
    goto :goto_4b

    .line 2041
    :cond_75
    const/4 v6, 0x0

    .line 2042
    :goto_4b
    invoke-direct {v8, v10, v6}, Ll2/k;-><init>(ZZ)V

    .line 2043
    .line 2044
    .line 2045
    const/16 v6, 0x21

    .line 2046
    .line 2047
    invoke-interface {v11, v8, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2048
    .line 2049
    .line 2050
    goto :goto_4c

    .line 2051
    :cond_76
    const/16 v6, 0x21

    .line 2052
    .line 2053
    :goto_4c
    iget-wide v12, v5, Li2/f0;->b:J

    .line 2054
    .line 2055
    move/from16 v16, v3

    .line 2056
    .line 2057
    invoke-static/range {v11 .. v16}, Lf8/i;->D0(Landroid/text/Spannable;JLu2/c;II)V

    .line 2058
    .line 2059
    .line 2060
    iget-object v8, v5, Li2/f0;->g:Ljava/lang/String;

    .line 2061
    .line 2062
    if-eqz v8, :cond_77

    .line 2063
    .line 2064
    new-instance v10, Ll2/b;

    .line 2065
    .line 2066
    const/4 v12, 0x0

    .line 2067
    invoke-direct {v10, v8, v12}, Ll2/b;-><init>(Ljava/lang/Object;I)V

    .line 2068
    .line 2069
    .line 2070
    invoke-interface {v11, v10, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2071
    .line 2072
    .line 2073
    :cond_77
    iget-object v8, v5, Li2/f0;->j:Lt2/p;

    .line 2074
    .line 2075
    if-eqz v8, :cond_78

    .line 2076
    .line 2077
    new-instance v10, Landroid/text/style/ScaleXSpan;

    .line 2078
    .line 2079
    iget v12, v8, Lt2/p;->a:F

    .line 2080
    .line 2081
    invoke-direct {v10, v12}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 2082
    .line 2083
    .line 2084
    invoke-interface {v11, v10, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2085
    .line 2086
    .line 2087
    new-instance v10, Ll2/a;

    .line 2088
    .line 2089
    iget v8, v8, Lt2/p;->b:F

    .line 2090
    .line 2091
    const/4 v13, 0x1

    .line 2092
    invoke-direct {v10, v13, v8}, Ll2/a;-><init>(IF)V

    .line 2093
    .line 2094
    .line 2095
    invoke-interface {v11, v10, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2096
    .line 2097
    .line 2098
    goto :goto_4d

    .line 2099
    :cond_78
    const/4 v13, 0x1

    .line 2100
    :goto_4d
    iget-object v6, v5, Li2/f0;->k:Lp2/b;

    .line 2101
    .line 2102
    invoke-static {v11, v6, v15, v3}, Lf8/i;->E0(Landroid/text/Spannable;Lp2/b;II)V

    .line 2103
    .line 2104
    .line 2105
    move-object v6, v14

    .line 2106
    iget-wide v13, v5, Li2/f0;->l:J

    .line 2107
    .line 2108
    const-wide/16 v18, 0x10

    .line 2109
    .line 2110
    cmp-long v8, v13, v18

    .line 2111
    .line 2112
    if-eqz v8, :cond_79

    .line 2113
    .line 2114
    new-instance v8, Landroid/text/style/BackgroundColorSpan;

    .line 2115
    .line 2116
    invoke-static {v13, v14}, Lf1/c0;->w(J)I

    .line 2117
    .line 2118
    .line 2119
    move-result v10

    .line 2120
    invoke-direct {v8, v10}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 2121
    .line 2122
    .line 2123
    const/16 v10, 0x21

    .line 2124
    .line 2125
    invoke-interface {v11, v8, v15, v3, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2126
    .line 2127
    .line 2128
    :cond_79
    iget-object v8, v5, Li2/f0;->n:Lf1/q0;

    .line 2129
    .line 2130
    if-eqz v8, :cond_7b

    .line 2131
    .line 2132
    iget-wide v12, v8, Lf1/q0;->b:J

    .line 2133
    .line 2134
    new-instance v10, Ll2/j;

    .line 2135
    .line 2136
    move/from16 p4, v0

    .line 2137
    .line 2138
    move v14, v1

    .line 2139
    iget-wide v0, v8, Lf1/q0;->a:J

    .line 2140
    .line 2141
    invoke-static {v0, v1}, Lf1/c0;->w(J)I

    .line 2142
    .line 2143
    .line 2144
    move-result v0

    .line 2145
    const/16 v1, 0x20

    .line 2146
    .line 2147
    move-object/from16 v18, v6

    .line 2148
    .line 2149
    move/from16 v16, v7

    .line 2150
    .line 2151
    shr-long v6, v12, v1

    .line 2152
    .line 2153
    long-to-int v1, v6

    .line 2154
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2155
    .line 2156
    .line 2157
    move-result v1

    .line 2158
    const-wide v6, 0xffffffffL

    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    and-long/2addr v6, v12

    .line 2164
    long-to-int v6, v6

    .line 2165
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2166
    .line 2167
    .line 2168
    move-result v6

    .line 2169
    iget v7, v8, Lf1/q0;->c:F

    .line 2170
    .line 2171
    cmpg-float v8, v7, p2

    .line 2172
    .line 2173
    if-nez v8, :cond_7a

    .line 2174
    .line 2175
    const/4 v7, 0x1

    .line 2176
    :cond_7a
    invoke-direct {v10, v0, v1, v6, v7}, Ll2/j;-><init>(IFFF)V

    .line 2177
    .line 2178
    .line 2179
    const/16 v6, 0x21

    .line 2180
    .line 2181
    invoke-interface {v11, v10, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2182
    .line 2183
    .line 2184
    goto :goto_4e

    .line 2185
    :cond_7b
    move/from16 p4, v0

    .line 2186
    .line 2187
    move v14, v1

    .line 2188
    move-object/from16 v18, v6

    .line 2189
    .line 2190
    move/from16 v16, v7

    .line 2191
    .line 2192
    const/16 v6, 0x21

    .line 2193
    .line 2194
    :goto_4e
    iget-object v0, v5, Li2/f0;->o:Lh1/c;

    .line 2195
    .line 2196
    if-eqz v0, :cond_7c

    .line 2197
    .line 2198
    new-instance v1, Ls2/a;

    .line 2199
    .line 2200
    invoke-direct {v1, v0}, Ls2/a;-><init>(Lh1/c;)V

    .line 2201
    .line 2202
    .line 2203
    invoke-interface {v11, v1, v15, v3, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2204
    .line 2205
    .line 2206
    :cond_7c
    iget-wide v0, v5, Li2/f0;->h:J

    .line 2207
    .line 2208
    invoke-static {v0, v1}, Lu2/o;->b(J)J

    .line 2209
    .line 2210
    .line 2211
    move-result-wide v0

    .line 2212
    const-wide v7, 0x100000000L

    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    invoke-static {v0, v1, v7, v8}, Lu2/p;->a(JJ)Z

    .line 2218
    .line 2219
    .line 2220
    move-result v0

    .line 2221
    if-nez v0, :cond_7d

    .line 2222
    .line 2223
    iget-wide v0, v5, Li2/f0;->h:J

    .line 2224
    .line 2225
    invoke-static {v0, v1}, Lu2/o;->b(J)J

    .line 2226
    .line 2227
    .line 2228
    move-result-wide v0

    .line 2229
    const-wide v7, 0x200000000L

    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    invoke-static {v0, v1, v7, v8}, Lu2/p;->a(JJ)Z

    .line 2235
    .line 2236
    .line 2237
    move-result v0

    .line 2238
    if-eqz v0, :cond_7e

    .line 2239
    .line 2240
    :cond_7d
    const/4 v1, 0x1

    .line 2241
    goto :goto_50

    .line 2242
    :cond_7e
    :goto_4f
    move v1, v14

    .line 2243
    :goto_50
    add-int/lit8 v7, v16, 0x1

    .line 2244
    .line 2245
    move/from16 v0, p4

    .line 2246
    .line 2247
    move-object/from16 v14, v18

    .line 2248
    .line 2249
    goto/16 :goto_48

    .line 2250
    .line 2251
    :cond_7f
    move-object/from16 v18, v14

    .line 2252
    .line 2253
    move v14, v1

    .line 2254
    if-eqz v14, :cond_85

    .line 2255
    .line 2256
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2257
    .line 2258
    .line 2259
    move-result v0

    .line 2260
    const/4 v7, 0x0

    .line 2261
    :goto_51
    if-ge v7, v0, :cond_85

    .line 2262
    .line 2263
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v1

    .line 2267
    check-cast v1, Li2/e;

    .line 2268
    .line 2269
    iget-object v3, v1, Li2/e;->a:Ljava/lang/Object;

    .line 2270
    .line 2271
    check-cast v3, Li2/b;

    .line 2272
    .line 2273
    instance-of v5, v3, Li2/f0;

    .line 2274
    .line 2275
    if-eqz v5, :cond_80

    .line 2276
    .line 2277
    iget v5, v1, Li2/e;->b:I

    .line 2278
    .line 2279
    iget v1, v1, Li2/e;->c:I

    .line 2280
    .line 2281
    if-ltz v5, :cond_80

    .line 2282
    .line 2283
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 2284
    .line 2285
    .line 2286
    move-result v6

    .line 2287
    if-ge v5, v6, :cond_80

    .line 2288
    .line 2289
    if-le v1, v5, :cond_80

    .line 2290
    .line 2291
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 2292
    .line 2293
    .line 2294
    move-result v6

    .line 2295
    if-le v1, v6, :cond_81

    .line 2296
    .line 2297
    :cond_80
    move v3, v7

    .line 2298
    move-object/from16 p2, v9

    .line 2299
    .line 2300
    move-object/from16 v7, v18

    .line 2301
    .line 2302
    const/16 v10, 0x21

    .line 2303
    .line 2304
    goto :goto_53

    .line 2305
    :cond_81
    check-cast v3, Li2/f0;

    .line 2306
    .line 2307
    iget-wide v12, v3, Li2/f0;->h:J

    .line 2308
    .line 2309
    invoke-static {v12, v13}, Lu2/o;->b(J)J

    .line 2310
    .line 2311
    .line 2312
    move-result-wide v14

    .line 2313
    move v3, v7

    .line 2314
    const-wide v6, 0x100000000L

    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    invoke-static {v14, v15, v6, v7}, Lu2/p;->a(JJ)Z

    .line 2320
    .line 2321
    .line 2322
    move-result v8

    .line 2323
    if-eqz v8, :cond_82

    .line 2324
    .line 2325
    new-instance v6, Ll2/f;

    .line 2326
    .line 2327
    move-object/from16 v7, v18

    .line 2328
    .line 2329
    invoke-interface {v7, v12, v13}, Lu2/c;->O0(J)F

    .line 2330
    .line 2331
    .line 2332
    move-result v8

    .line 2333
    invoke-direct {v6, v8}, Ll2/f;-><init>(F)V

    .line 2334
    .line 2335
    .line 2336
    move-object/from16 p2, v9

    .line 2337
    .line 2338
    goto :goto_52

    .line 2339
    :cond_82
    move-object/from16 p2, v9

    .line 2340
    .line 2341
    move-object/from16 v7, v18

    .line 2342
    .line 2343
    const-wide v8, 0x200000000L

    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    invoke-static {v14, v15, v8, v9}, Lu2/p;->a(JJ)Z

    .line 2349
    .line 2350
    .line 2351
    move-result v6

    .line 2352
    if-eqz v6, :cond_83

    .line 2353
    .line 2354
    new-instance v6, Ll2/e;

    .line 2355
    .line 2356
    invoke-static {v12, v13}, Lu2/o;->c(J)F

    .line 2357
    .line 2358
    .line 2359
    move-result v8

    .line 2360
    invoke-direct {v6, v8}, Ll2/e;-><init>(F)V

    .line 2361
    .line 2362
    .line 2363
    goto :goto_52

    .line 2364
    :cond_83
    move-object/from16 v6, p1

    .line 2365
    .line 2366
    :goto_52
    const/16 v10, 0x21

    .line 2367
    .line 2368
    if-eqz v6, :cond_84

    .line 2369
    .line 2370
    invoke-interface {v11, v6, v5, v1, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 2371
    .line 2372
    .line 2373
    :cond_84
    :goto_53
    add-int/lit8 v1, v3, 0x1

    .line 2374
    .line 2375
    move-object/from16 v9, p2

    .line 2376
    .line 2377
    move-object/from16 v18, v7

    .line 2378
    .line 2379
    move v7, v1

    .line 2380
    goto :goto_51

    .line 2381
    :cond_85
    move-object/from16 p2, v9

    .line 2382
    .line 2383
    move-object/from16 v7, v18

    .line 2384
    .line 2385
    iget-object v0, v4, Li2/n0;->b:Li2/u;

    .line 2386
    .line 2387
    iget-object v0, v0, Li2/u;->d:Lt2/q;

    .line 2388
    .line 2389
    if-eqz v0, :cond_87

    .line 2390
    .line 2391
    iget-wide v0, v0, Lt2/q;->a:J

    .line 2392
    .line 2393
    invoke-static {v0, v1}, Lu2/o;->b(J)J

    .line 2394
    .line 2395
    .line 2396
    move-result-wide v3

    .line 2397
    const-wide v8, 0x100000000L

    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    invoke-static {v3, v4, v8, v9}, Lu2/p;->a(JJ)Z

    .line 2403
    .line 2404
    .line 2405
    move-result v5

    .line 2406
    if-eqz v5, :cond_86

    .line 2407
    .line 2408
    invoke-interface {v7, v0, v1}, Lu2/c;->O0(J)F

    .line 2409
    .line 2410
    .line 2411
    goto :goto_54

    .line 2412
    :cond_86
    const-wide v7, 0x200000000L

    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    invoke-static {v3, v4, v7, v8}, Lu2/p;->a(JJ)Z

    .line 2418
    .line 2419
    .line 2420
    move-result v3

    .line 2421
    if-eqz v3, :cond_87

    .line 2422
    .line 2423
    invoke-static {v0, v1}, Lu2/o;->c(J)F

    .line 2424
    .line 2425
    .line 2426
    :cond_87
    :goto_54
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2427
    .line 2428
    .line 2429
    move-result v0

    .line 2430
    const/4 v7, 0x0

    .line 2431
    :goto_55
    if-ge v7, v0, :cond_88

    .line 2432
    .line 2433
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v1

    .line 2437
    check-cast v1, Li2/e;

    .line 2438
    .line 2439
    iget-object v1, v1, Li2/e;->a:Ljava/lang/Object;

    .line 2440
    .line 2441
    add-int/lit8 v7, v7, 0x1

    .line 2442
    .line 2443
    goto :goto_55

    .line 2444
    :cond_88
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    .line 2445
    .line 2446
    .line 2447
    move-result v0

    .line 2448
    if-lez v0, :cond_8b

    .line 2449
    .line 2450
    move-object/from16 v9, p2

    .line 2451
    .line 2452
    const/4 v12, 0x0

    .line 2453
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v0

    .line 2457
    check-cast v0, Li2/e;

    .line 2458
    .line 2459
    iget-object v1, v0, Li2/e;->a:Ljava/lang/Object;

    .line 2460
    .line 2461
    if-nez v1, :cond_8a

    .line 2462
    .line 2463
    iget v1, v0, Li2/e;->b:I

    .line 2464
    .line 2465
    iget v0, v0, Li2/e;->c:I

    .line 2466
    .line 2467
    move-object/from16 v2, p6

    .line 2468
    .line 2469
    invoke-interface {v11, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v0

    .line 2473
    array-length v1, v0

    .line 2474
    move v8, v12

    .line 2475
    :goto_56
    if-ge v8, v1, :cond_89

    .line 2476
    .line 2477
    aget-object v2, v0, v8

    .line 2478
    .line 2479
    check-cast v2, Ll3/v;

    .line 2480
    .line 2481
    invoke-interface {v11, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2482
    .line 2483
    .line 2484
    add-int/lit8 v8, v8, 0x1

    .line 2485
    .line 2486
    goto :goto_56

    .line 2487
    :cond_89
    new-instance v0, Ll2/i;

    .line 2488
    .line 2489
    throw p1

    .line 2490
    :cond_8a
    invoke-static {}, Lah/a;->d()V

    .line 2491
    .line 2492
    .line 2493
    throw p1

    .line 2494
    :cond_8b
    move-object/from16 v0, p0

    .line 2495
    .line 2496
    move-object v1, v11

    .line 2497
    :goto_57
    iput-object v1, v0, Lq2/d;->h:Ljava/lang/CharSequence;

    .line 2498
    .line 2499
    new-instance v2, Lj2/f;

    .line 2500
    .line 2501
    iget-object v3, v0, Lq2/d;->g:Lq2/f;

    .line 2502
    .line 2503
    iget v4, v0, Lq2/d;->l:I

    .line 2504
    .line 2505
    invoke-direct {v2, v1, v3, v4}, Lj2/f;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    .line 2506
    .line 2507
    .line 2508
    iput-object v2, v0, Lq2/d;->i:Lj2/f;

    .line 2509
    .line 2510
    return-void

    .line 2511
    :cond_8c
    move-object/from16 v0, p0

    .line 2512
    .line 2513
    const-string v1, "Array is empty."

    .line 2514
    .line 2515
    invoke-static {v1}, Lj8/o;->l(Ljava/lang/String;)V

    .line 2516
    .line 2517
    .line 2518
    throw p1

    .line 2519
    :cond_8d
    const/16 p1, 0x0

    .line 2520
    .line 2521
    const-string v1, "Invalid TextDirection."

    .line 2522
    .line 2523
    invoke-static {v1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 2524
    .line 2525
    .line 2526
    throw p1
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lq2/d;->j:Lb5/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lb5/c;->D()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Lq2/d;->k:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lq2/d;->b:Li2/n0;

    .line 19
    .line 20
    invoke-static {v0}, Lq2/j;->a(Li2/n0;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    sget-object v0, Lq2/i;->a:Lm/a;

    .line 27
    .line 28
    sget-object v0, Lq2/i;->a:Lm/a;

    .line 29
    .line 30
    iget-object v2, v0, Lm/a;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Li0/l2;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {}, Ll3/i;->d()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Lm/a;->o()Li0/l2;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iput-object v2, v0, Lm/a;->h:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    sget-object v2, Lq2/j;->a:Lq2/k;

    .line 51
    .line 52
    :goto_1
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    return v1

    .line 66
    :cond_4
    :goto_2
    const/4 v0, 0x1

    .line 67
    return v0
.end method

.method public final b()F
    .locals 11

    .line 1
    iget-object v0, p0, Lq2/d;->i:Lj2/f;

    .line 2
    .line 3
    iget v1, v0, Lj2/f;->e:F

    .line 4
    .line 5
    iget-object v2, v0, Lj2/f;->b:Landroid/text/TextPaint;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget v0, v0, Lj2/f;->e:F

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Ljava/text/BreakIterator;->getLineInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, Lj2/c;

    .line 25
    .line 26
    iget-object v4, v0, Lj2/f;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-direct {v3, v4, v5}, Lj2/c;-><init>(Ljava/lang/CharSequence;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/util/PriorityQueue;

    .line 39
    .line 40
    sget-object v4, Lj2/g;->a:Lb8/c;

    .line 41
    .line 42
    const/16 v5, 0xa

    .line 43
    .line 44
    invoke-direct {v3, v5, v4}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v6, 0x0

    .line 52
    :goto_0
    const/4 v7, -0x1

    .line 53
    if-eq v4, v7, :cond_3

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->size()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const/4 v8, 0x1

    .line 60
    if-ge v7, v5, :cond_1

    .line 61
    .line 62
    new-instance v7, Llg/d;

    .line 63
    .line 64
    invoke-direct {v7, v6, v4, v8}, Llg/b;-><init>(III)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Llg/d;

    .line 76
    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    iget v9, v7, Llg/b;->h:I

    .line 80
    .line 81
    iget v7, v7, Llg/b;->g:I

    .line 82
    .line 83
    sub-int/2addr v9, v7

    .line 84
    sub-int v7, v4, v6

    .line 85
    .line 86
    if-ge v9, v7, :cond_2

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    new-instance v7, Llg/d;

    .line 92
    .line 93
    invoke-direct {v7, v6, v4, v8}, Llg/b;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v7}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/text/BreakIterator;->next()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    move v10, v6

    .line 104
    move v6, v4

    .line 105
    move v4, v10

    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    invoke-virtual {v3}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_6

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    check-cast v3, Llg/d;

    .line 130
    .line 131
    iget v4, v3, Llg/b;->g:I

    .line 132
    .line 133
    iget v3, v3, Llg/b;->h:I

    .line 134
    .line 135
    invoke-virtual {v0}, Lj2/f;->b()Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-static {v5, v4, v3, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_5

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, Llg/d;

    .line 154
    .line 155
    iget v5, v4, Llg/b;->g:I

    .line 156
    .line 157
    iget v4, v4, Llg/b;->h:I

    .line 158
    .line 159
    invoke-virtual {v0}, Lj2/f;->b()Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-static {v6, v5, v4, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    goto :goto_2

    .line 172
    :cond_5
    move v1, v3

    .line 173
    :goto_3
    iput v1, v0, Lj2/f;->e:F

    .line 174
    .line 175
    return v1

    .line 176
    :cond_6
    invoke-static {}, Lbsh/j;->e()V

    .line 177
    .line 178
    .line 179
    const/4 v0, 0x0

    .line 180
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/d;->i:Lj2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj2/f;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
