.class public final Li2/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lq2/d;

.field public final b:I

.field public final c:J

.field public final d:Lj2/k;

.field public final e:Ljava/lang/CharSequence;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq2/d;IIJ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move/from16 v4, p2

    .line 6
    .line 7
    move/from16 v11, p3

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v10, v0, Li2/a;->a:Lq2/d;

    .line 13
    .line 14
    iput v4, v0, Li2/a;->b:I

    .line 15
    .line 16
    move-wide/from16 v12, p4

    .line 17
    .line 18
    iput-wide v12, v0, Li2/a;->c:J

    .line 19
    .line 20
    invoke-static {v12, v13}, Lu2/a;->i(J)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-static {v12, v13}, Lu2/a;->j(J)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v1, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 34
    .line 35
    invoke-static {v1}, Lo2/a;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    const/4 v14, 0x1

    .line 39
    if-lt v4, v14, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string v1, "maxLines should be greater than 0"

    .line 43
    .line 44
    invoke-static {v1}, Lo2/a;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    iget-object v1, v10, Lq2/d;->b:Li2/n0;

    .line 48
    .line 49
    iget-object v2, v10, Lq2/d;->h:Ljava/lang/CharSequence;

    .line 50
    .line 51
    const/4 v3, 0x5

    .line 52
    const/4 v5, 0x4

    .line 53
    const/4 v6, 0x2

    .line 54
    if-ne v11, v6, :cond_9

    .line 55
    .line 56
    iget-object v8, v1, Li2/n0;->a:Li2/f0;

    .line 57
    .line 58
    iget-wide v8, v8, Li2/f0;->h:J

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    invoke-static/range {v17 .. v17}, Lx6/d;->D(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    invoke-static {v8, v9, v6, v7}, Lu2/o;->a(JJ)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_8

    .line 71
    .line 72
    iget-object v6, v1, Li2/n0;->a:Li2/f0;

    .line 73
    .line 74
    iget-wide v6, v6, Li2/f0;->h:J

    .line 75
    .line 76
    sget-wide v8, Lu2/o;->c:J

    .line 77
    .line 78
    invoke-static {v6, v7, v8, v9}, Lu2/o;->a(JJ)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-nez v6, :cond_8

    .line 83
    .line 84
    iget-object v6, v1, Li2/n0;->b:Li2/u;

    .line 85
    .line 86
    iget v6, v6, Li2/u;->a:I

    .line 87
    .line 88
    if-nez v6, :cond_2

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_2
    if-ne v6, v3, :cond_3

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    if-ne v6, v5, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-nez v6, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    instance-of v6, v2, Landroid/text/Spannable;

    .line 105
    .line 106
    if-eqz v6, :cond_6

    .line 107
    .line 108
    move-object v6, v2

    .line 109
    check-cast v6, Landroid/text/Spannable;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    const/4 v6, 0x0

    .line 113
    :goto_2
    if-nez v6, :cond_7

    .line 114
    .line 115
    new-instance v6, Landroid/text/SpannableString;

    .line 116
    .line 117
    invoke-direct {v6, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    :cond_7
    move-object v2, v6

    .line 121
    const-class v6, Ll2/c;

    .line 122
    .line 123
    invoke-static {v2, v6}, Lj2/g;->f(Landroid/text/Spanned;Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_8

    .line 128
    .line 129
    new-instance v6, Ll2/c;

    .line 130
    .line 131
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    sub-int/2addr v7, v14

    .line 139
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    sub-int/2addr v8, v14

    .line 144
    const/16 v9, 0x21

    .line 145
    .line 146
    invoke-interface {v2, v6, v7, v8, v9}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 147
    .line 148
    .line 149
    :cond_8
    :goto_3
    move-object v9, v2

    .line 150
    goto :goto_4

    .line 151
    :cond_9
    const/16 v17, 0x0

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :goto_4
    iput-object v9, v0, Li2/a;->e:Ljava/lang/CharSequence;

    .line 155
    .line 156
    iget-object v2, v1, Li2/n0;->b:Li2/u;

    .line 157
    .line 158
    iget-object v1, v1, Li2/n0;->a:Li2/f0;

    .line 159
    .line 160
    iget v6, v2, Li2/u;->a:I

    .line 161
    .line 162
    const/4 v7, 0x3

    .line 163
    if-ne v6, v14, :cond_a

    .line 164
    .line 165
    move v8, v7

    .line 166
    goto :goto_6

    .line 167
    :cond_a
    const/4 v8, 0x2

    .line 168
    if-ne v6, v8, :cond_b

    .line 169
    .line 170
    move v8, v5

    .line 171
    goto :goto_6

    .line 172
    :cond_b
    if-ne v6, v7, :cond_c

    .line 173
    .line 174
    const/4 v8, 0x2

    .line 175
    goto :goto_6

    .line 176
    :cond_c
    if-ne v6, v3, :cond_d

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_d
    const/4 v8, 0x6

    .line 180
    if-ne v6, v8, :cond_e

    .line 181
    .line 182
    move v8, v14

    .line 183
    goto :goto_6

    .line 184
    :cond_e
    :goto_5
    move/from16 v8, v17

    .line 185
    .line 186
    :goto_6
    if-ne v6, v5, :cond_f

    .line 187
    .line 188
    move v6, v14

    .line 189
    goto :goto_7

    .line 190
    :cond_f
    move/from16 v6, v17

    .line 191
    .line 192
    :goto_7
    iget v15, v2, Li2/u;->h:I

    .line 193
    .line 194
    const/16 v3, 0x20

    .line 195
    .line 196
    const/4 v5, 0x2

    .line 197
    if-ne v15, v5, :cond_11

    .line 198
    .line 199
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 200
    .line 201
    if-gt v15, v3, :cond_10

    .line 202
    .line 203
    move v15, v5

    .line 204
    goto :goto_8

    .line 205
    :cond_10
    const/4 v15, 0x4

    .line 206
    goto :goto_8

    .line 207
    :cond_11
    move/from16 v15, v17

    .line 208
    .line 209
    :goto_8
    iget v2, v2, Li2/u;->g:I

    .line 210
    .line 211
    and-int/lit16 v3, v2, 0xff

    .line 212
    .line 213
    if-ne v3, v14, :cond_12

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_12
    if-ne v3, v5, :cond_13

    .line 217
    .line 218
    move v3, v2

    .line 219
    move v2, v6

    .line 220
    move v6, v14

    .line 221
    goto :goto_a

    .line 222
    :cond_13
    if-ne v3, v7, :cond_14

    .line 223
    .line 224
    move v3, v2

    .line 225
    move v2, v6

    .line 226
    const/4 v6, 0x2

    .line 227
    goto :goto_a

    .line 228
    :cond_14
    :goto_9
    move v3, v2

    .line 229
    move v2, v6

    .line 230
    move/from16 v6, v17

    .line 231
    .line 232
    :goto_a
    shr-int/lit8 v5, v3, 0x8

    .line 233
    .line 234
    and-int/lit16 v5, v5, 0xff

    .line 235
    .line 236
    if-ne v5, v14, :cond_15

    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_15
    const/4 v14, 0x2

    .line 240
    if-ne v5, v14, :cond_16

    .line 241
    .line 242
    move v5, v7

    .line 243
    const/4 v7, 0x1

    .line 244
    goto :goto_c

    .line 245
    :cond_16
    if-ne v5, v7, :cond_17

    .line 246
    .line 247
    move v5, v7

    .line 248
    const/4 v7, 0x2

    .line 249
    goto :goto_c

    .line 250
    :cond_17
    const/4 v14, 0x4

    .line 251
    if-ne v5, v14, :cond_18

    .line 252
    .line 253
    move v5, v7

    .line 254
    goto :goto_c

    .line 255
    :cond_18
    :goto_b
    move v5, v7

    .line 256
    move/from16 v7, v17

    .line 257
    .line 258
    :goto_c
    shr-int/lit8 v3, v3, 0x10

    .line 259
    .line 260
    and-int/lit16 v3, v3, 0xff

    .line 261
    .line 262
    const/4 v14, 0x1

    .line 263
    if-ne v3, v14, :cond_19

    .line 264
    .line 265
    const/4 v14, 0x2

    .line 266
    goto :goto_d

    .line 267
    :cond_19
    const/4 v14, 0x2

    .line 268
    if-ne v3, v14, :cond_1a

    .line 269
    .line 270
    move-object v3, v1

    .line 271
    move v1, v8

    .line 272
    const/4 v8, 0x1

    .line 273
    goto :goto_e

    .line 274
    :cond_1a
    :goto_d
    move-object v3, v1

    .line 275
    move v1, v8

    .line 276
    move/from16 v8, v17

    .line 277
    .line 278
    :goto_e
    if-ne v11, v14, :cond_1b

    .line 279
    .line 280
    sget-object v16, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 281
    .line 282
    :goto_f
    move v5, v15

    .line 283
    const/16 v18, 0x20

    .line 284
    .line 285
    move-object v15, v3

    .line 286
    move-object/from16 v3, v16

    .line 287
    .line 288
    goto :goto_10

    .line 289
    :cond_1b
    const/4 v5, 0x5

    .line 290
    if-ne v11, v5, :cond_1c

    .line 291
    .line 292
    sget-object v16, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 293
    .line 294
    goto :goto_f

    .line 295
    :cond_1c
    const/4 v5, 0x4

    .line 296
    if-ne v11, v5, :cond_1d

    .line 297
    .line 298
    sget-object v16, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    .line 299
    .line 300
    goto :goto_f

    .line 301
    :cond_1d
    move v5, v15

    .line 302
    const/16 v18, 0x20

    .line 303
    .line 304
    move-object v15, v3

    .line 305
    const/4 v3, 0x0

    .line 306
    :goto_10
    invoke-virtual/range {v0 .. v9}, Li2/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lj2/k;

    .line 307
    .line 308
    .line 309
    move-result-object v14

    .line 310
    iget-object v0, v14, Lj2/k;->f:Landroid/text/Layout;

    .line 311
    .line 312
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 313
    .line 314
    move/from16 v16, v1

    .line 315
    .line 316
    const/16 v1, 0x23

    .line 317
    .line 318
    if-ge v4, v1, :cond_1e

    .line 319
    .line 320
    iget-object v1, v10, Lq2/d;->g:Lq2/f;

    .line 321
    .line 322
    invoke-virtual {v1}, Landroid/graphics/Paint;->getLetterSpacing()F

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    const/4 v4, 0x0

    .line 327
    cmpg-float v1, v1, v4

    .line 328
    .line 329
    if-nez v1, :cond_1f

    .line 330
    .line 331
    :cond_1e
    move-object/from16 v0, p0

    .line 332
    .line 333
    move/from16 v4, p2

    .line 334
    .line 335
    move/from16 v1, v16

    .line 336
    .line 337
    const/4 v10, 0x2

    .line 338
    goto :goto_13

    .line 339
    :cond_1f
    const/4 v1, 0x4

    .line 340
    if-ne v11, v1, :cond_20

    .line 341
    .line 342
    :goto_11
    const/4 v1, 0x0

    .line 343
    goto :goto_12

    .line 344
    :cond_20
    const/4 v1, 0x5

    .line 345
    if-ne v11, v1, :cond_1e

    .line 346
    .line 347
    goto :goto_11

    .line 348
    :goto_12
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-lez v4, :cond_1e

    .line 353
    .line 354
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    invoke-virtual {v0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    add-int/2addr v0, v4

    .line 363
    invoke-interface {v9, v1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    invoke-interface {v9, v0, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const/4 v9, 0x3

    .line 376
    new-array v9, v9, [Ljava/lang/CharSequence;

    .line 377
    .line 378
    aput-object v4, v9, v1

    .line 379
    .line 380
    const-string v1, "\u2026"

    .line 381
    .line 382
    const/16 v19, 0x1

    .line 383
    .line 384
    aput-object v1, v9, v19

    .line 385
    .line 386
    const/4 v10, 0x2

    .line 387
    aput-object v0, v9, v10

    .line 388
    .line 389
    invoke-static {v9}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 390
    .line 391
    .line 392
    move-result-object v9

    .line 393
    move-object/from16 v0, p0

    .line 394
    .line 395
    move/from16 v4, p2

    .line 396
    .line 397
    move/from16 v1, v16

    .line 398
    .line 399
    invoke-virtual/range {v0 .. v9}, Li2/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lj2/k;

    .line 400
    .line 401
    .line 402
    move-result-object v14

    .line 403
    :goto_13
    iget v9, v14, Lj2/k;->g:I

    .line 404
    .line 405
    if-ne v11, v10, :cond_25

    .line 406
    .line 407
    invoke-virtual {v14}, Lj2/k;->a()I

    .line 408
    .line 409
    .line 410
    move-result v10

    .line 411
    invoke-static {v12, v13}, Lu2/a;->g(J)I

    .line 412
    .line 413
    .line 414
    move-result v11

    .line 415
    if-le v10, v11, :cond_25

    .line 416
    .line 417
    const/4 v10, 0x1

    .line 418
    if-le v4, v10, :cond_25

    .line 419
    .line 420
    invoke-static {v12, v13}, Lu2/a;->g(J)I

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    const/4 v10, 0x0

    .line 425
    :goto_14
    if-ge v10, v9, :cond_22

    .line 426
    .line 427
    invoke-virtual {v14, v10}, Lj2/k;->e(I)F

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    int-to-float v12, v4

    .line 432
    cmpl-float v11, v11, v12

    .line 433
    .line 434
    if-lez v11, :cond_21

    .line 435
    .line 436
    goto :goto_15

    .line 437
    :cond_21
    add-int/lit8 v10, v10, 0x1

    .line 438
    .line 439
    goto :goto_14

    .line 440
    :cond_22
    move v10, v9

    .line 441
    :goto_15
    if-ltz v10, :cond_24

    .line 442
    .line 443
    iget v4, v0, Li2/a;->b:I

    .line 444
    .line 445
    if-eq v10, v4, :cond_24

    .line 446
    .line 447
    const/4 v4, 0x1

    .line 448
    if-ge v10, v4, :cond_23

    .line 449
    .line 450
    const/4 v4, 0x1

    .line 451
    goto :goto_16

    .line 452
    :cond_23
    move v4, v10

    .line 453
    :goto_16
    iget-object v9, v0, Li2/a;->e:Ljava/lang/CharSequence;

    .line 454
    .line 455
    invoke-virtual/range {v0 .. v9}, Li2/a;->a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lj2/k;

    .line 456
    .line 457
    .line 458
    move-result-object v14

    .line 459
    :cond_24
    iput-object v14, v0, Li2/a;->d:Lj2/k;

    .line 460
    .line 461
    goto :goto_17

    .line 462
    :cond_25
    iput-object v14, v0, Li2/a;->d:Lj2/k;

    .line 463
    .line 464
    :goto_17
    iget-object v1, v0, Li2/a;->a:Lq2/d;

    .line 465
    .line 466
    iget-object v1, v1, Lq2/d;->g:Lq2/f;

    .line 467
    .line 468
    iget-object v2, v15, Li2/f0;->a:Lt2/o;

    .line 469
    .line 470
    invoke-interface {v2}, Lt2/o;->c()Lf1/s;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v0}, Li2/a;->d()F

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    invoke-virtual {v0}, Li2/a;->b()F

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    int-to-long v5, v3

    .line 487
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    int-to-long v3, v3

    .line 492
    shl-long v5, v5, v18

    .line 493
    .line 494
    const-wide v7, 0xffffffffL

    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    and-long/2addr v3, v7

    .line 500
    or-long/2addr v3, v5

    .line 501
    iget-object v5, v15, Li2/f0;->a:Lt2/o;

    .line 502
    .line 503
    invoke-interface {v5}, Lt2/o;->a()F

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    invoke-virtual {v1, v2, v3, v4, v5}, Lq2/f;->c(Lf1/s;JF)V

    .line 508
    .line 509
    .line 510
    iget-object v1, v0, Li2/a;->d:Lj2/k;

    .line 511
    .line 512
    iget-object v1, v1, Lj2/k;->f:Landroid/text/Layout;

    .line 513
    .line 514
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    instance-of v2, v2, Landroid/text/Spanned;

    .line 519
    .line 520
    if-nez v2, :cond_27

    .line 521
    .line 522
    :cond_26
    const/4 v1, 0x0

    .line 523
    goto :goto_18

    .line 524
    :cond_27
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    check-cast v2, Landroid/text/Spanned;

    .line 532
    .line 533
    const/4 v3, -0x1

    .line 534
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    const-class v5, Ls2/b;

    .line 539
    .line 540
    invoke-interface {v2, v3, v4, v5}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    if-eq v3, v2, :cond_26

    .line 549
    .line 550
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    check-cast v2, Landroid/text/Spanned;

    .line 558
    .line 559
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    const/4 v3, 0x0

    .line 568
    invoke-interface {v2, v3, v1, v5}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    check-cast v1, [Ls2/b;

    .line 573
    .line 574
    :goto_18
    if-eqz v1, :cond_28

    .line 575
    .line 576
    array-length v2, v1

    .line 577
    const/4 v3, 0x0

    .line 578
    :goto_19
    if-ge v3, v2, :cond_28

    .line 579
    .line 580
    aget-object v4, v1, v3

    .line 581
    .line 582
    invoke-virtual {v0}, Li2/a;->d()F

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    invoke-virtual {v0}, Li2/a;->b()F

    .line 587
    .line 588
    .line 589
    move-result v6

    .line 590
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    int-to-long v9, v5

    .line 595
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 596
    .line 597
    .line 598
    move-result v5

    .line 599
    int-to-long v5, v5

    .line 600
    shl-long v9, v9, v18

    .line 601
    .line 602
    and-long/2addr v5, v7

    .line 603
    or-long/2addr v5, v9

    .line 604
    iget-object v4, v4, Ls2/b;->i:Li0/j1;

    .line 605
    .line 606
    new-instance v9, Le1/e;

    .line 607
    .line 608
    invoke-direct {v9, v5, v6}, Le1/e;-><init>(J)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v4, v9}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    add-int/lit8 v3, v3, 0x1

    .line 615
    .line 616
    goto :goto_19

    .line 617
    :cond_28
    iget-object v1, v0, Li2/a;->e:Ljava/lang/CharSequence;

    .line 618
    .line 619
    instance-of v2, v1, Landroid/text/Spanned;

    .line 620
    .line 621
    if-nez v2, :cond_29

    .line 622
    .line 623
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 624
    .line 625
    goto/16 :goto_24

    .line 626
    .line 627
    :cond_29
    move-object v2, v1

    .line 628
    check-cast v2, Landroid/text/Spanned;

    .line 629
    .line 630
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    const-class v3, Ll2/i;

    .line 635
    .line 636
    const/4 v4, 0x0

    .line 637
    invoke-interface {v2, v4, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    new-instance v3, Ljava/util/ArrayList;

    .line 642
    .line 643
    array-length v4, v1

    .line 644
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 645
    .line 646
    .line 647
    array-length v4, v1

    .line 648
    const/4 v7, 0x0

    .line 649
    :goto_1a
    if-ge v7, v4, :cond_33

    .line 650
    .line 651
    aget-object v5, v1, v7

    .line 652
    .line 653
    check-cast v5, Ll2/i;

    .line 654
    .line 655
    invoke-interface {v2, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 656
    .line 657
    .line 658
    move-result v6

    .line 659
    invoke-interface {v2, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 660
    .line 661
    .line 662
    move-result v8

    .line 663
    iget-object v9, v0, Li2/a;->d:Lj2/k;

    .line 664
    .line 665
    iget-object v9, v9, Lj2/k;->f:Landroid/text/Layout;

    .line 666
    .line 667
    invoke-virtual {v9, v6}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 668
    .line 669
    .line 670
    move-result v9

    .line 671
    iget v10, v0, Li2/a;->b:I

    .line 672
    .line 673
    if-lt v9, v10, :cond_2a

    .line 674
    .line 675
    const/4 v10, 0x1

    .line 676
    goto :goto_1b

    .line 677
    :cond_2a
    const/4 v10, 0x0

    .line 678
    :goto_1b
    iget-object v11, v0, Li2/a;->d:Lj2/k;

    .line 679
    .line 680
    iget-object v11, v11, Lj2/k;->f:Landroid/text/Layout;

    .line 681
    .line 682
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 683
    .line 684
    .line 685
    move-result v11

    .line 686
    if-lez v11, :cond_2b

    .line 687
    .line 688
    iget-object v11, v0, Li2/a;->d:Lj2/k;

    .line 689
    .line 690
    iget-object v11, v11, Lj2/k;->f:Landroid/text/Layout;

    .line 691
    .line 692
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getLineStart(I)I

    .line 693
    .line 694
    .line 695
    move-result v11

    .line 696
    iget-object v12, v0, Li2/a;->d:Lj2/k;

    .line 697
    .line 698
    iget-object v12, v12, Lj2/k;->f:Landroid/text/Layout;

    .line 699
    .line 700
    invoke-virtual {v12, v9}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 701
    .line 702
    .line 703
    move-result v12

    .line 704
    add-int/2addr v12, v11

    .line 705
    if-le v8, v12, :cond_2b

    .line 706
    .line 707
    const/4 v11, 0x1

    .line 708
    goto :goto_1c

    .line 709
    :cond_2b
    const/4 v11, 0x0

    .line 710
    :goto_1c
    iget-object v12, v0, Li2/a;->d:Lj2/k;

    .line 711
    .line 712
    invoke-virtual {v12, v9}, Lj2/k;->f(I)I

    .line 713
    .line 714
    .line 715
    move-result v12

    .line 716
    if-le v8, v12, :cond_2c

    .line 717
    .line 718
    const/4 v8, 0x1

    .line 719
    goto :goto_1d

    .line 720
    :cond_2c
    const/4 v8, 0x0

    .line 721
    :goto_1d
    if-nez v11, :cond_2d

    .line 722
    .line 723
    if-nez v8, :cond_2d

    .line 724
    .line 725
    if-eqz v10, :cond_2e

    .line 726
    .line 727
    :cond_2d
    const/4 v10, 0x1

    .line 728
    const/4 v12, 0x0

    .line 729
    goto/16 :goto_22

    .line 730
    .line 731
    :cond_2e
    iget-object v8, v0, Li2/a;->d:Lj2/k;

    .line 732
    .line 733
    iget-object v8, v8, Lj2/k;->f:Landroid/text/Layout;

    .line 734
    .line 735
    invoke-virtual {v8, v9}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 736
    .line 737
    .line 738
    move-result v8

    .line 739
    const/4 v10, 0x1

    .line 740
    if-ne v8, v10, :cond_2f

    .line 741
    .line 742
    move v8, v10

    .line 743
    goto :goto_1e

    .line 744
    :cond_2f
    const/4 v8, 0x0

    .line 745
    :goto_1e
    iget-object v11, v0, Li2/a;->d:Lj2/k;

    .line 746
    .line 747
    iget-object v11, v11, Lj2/k;->f:Landroid/text/Layout;

    .line 748
    .line 749
    invoke-virtual {v11, v6}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 750
    .line 751
    .line 752
    move-result v11

    .line 753
    if-eqz v8, :cond_30

    .line 754
    .line 755
    if-nez v11, :cond_30

    .line 756
    .line 757
    iget-object v8, v0, Li2/a;->d:Lj2/k;

    .line 758
    .line 759
    const/4 v12, 0x0

    .line 760
    invoke-virtual {v8, v6, v12}, Lj2/k;->h(IZ)F

    .line 761
    .line 762
    .line 763
    move-result v6

    .line 764
    invoke-virtual {v5}, Ll2/i;->c()I

    .line 765
    .line 766
    .line 767
    move-result v8

    .line 768
    :goto_1f
    int-to-float v8, v8

    .line 769
    add-float/2addr v8, v6

    .line 770
    goto :goto_21

    .line 771
    :cond_30
    const/4 v12, 0x0

    .line 772
    if-eqz v8, :cond_31

    .line 773
    .line 774
    if-eqz v11, :cond_31

    .line 775
    .line 776
    iget-object v8, v0, Li2/a;->d:Lj2/k;

    .line 777
    .line 778
    invoke-virtual {v8, v6, v12}, Lj2/k;->i(IZ)F

    .line 779
    .line 780
    .line 781
    move-result v8

    .line 782
    invoke-virtual {v5}, Ll2/i;->c()I

    .line 783
    .line 784
    .line 785
    move-result v6

    .line 786
    :goto_20
    int-to-float v6, v6

    .line 787
    sub-float v6, v8, v6

    .line 788
    .line 789
    goto :goto_21

    .line 790
    :cond_31
    iget-object v8, v0, Li2/a;->d:Lj2/k;

    .line 791
    .line 792
    if-eqz v11, :cond_32

    .line 793
    .line 794
    invoke-virtual {v8, v6, v12}, Lj2/k;->h(IZ)F

    .line 795
    .line 796
    .line 797
    move-result v8

    .line 798
    invoke-virtual {v5}, Ll2/i;->c()I

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    goto :goto_20

    .line 803
    :cond_32
    invoke-virtual {v8, v6, v12}, Lj2/k;->i(IZ)F

    .line 804
    .line 805
    .line 806
    move-result v6

    .line 807
    invoke-virtual {v5}, Ll2/i;->c()I

    .line 808
    .line 809
    .line 810
    move-result v8

    .line 811
    goto :goto_1f

    .line 812
    :goto_21
    iget-object v11, v0, Li2/a;->d:Lj2/k;

    .line 813
    .line 814
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v11, v9}, Lj2/k;->d(I)F

    .line 818
    .line 819
    .line 820
    move-result v9

    .line 821
    invoke-virtual {v5}, Ll2/i;->b()I

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    int-to-float v11, v11

    .line 826
    sub-float/2addr v9, v11

    .line 827
    invoke-virtual {v5}, Ll2/i;->b()I

    .line 828
    .line 829
    .line 830
    move-result v5

    .line 831
    int-to-float v5, v5

    .line 832
    add-float/2addr v5, v9

    .line 833
    new-instance v11, Le1/c;

    .line 834
    .line 835
    invoke-direct {v11, v6, v9, v8, v5}, Le1/c;-><init>(FFFF)V

    .line 836
    .line 837
    .line 838
    goto :goto_23

    .line 839
    :goto_22
    const/4 v11, 0x0

    .line 840
    :goto_23
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    add-int/lit8 v7, v7, 0x1

    .line 844
    .line 845
    goto/16 :goto_1a

    .line 846
    .line 847
    :cond_33
    move-object v1, v3

    .line 848
    :goto_24
    iput-object v1, v0, Li2/a;->f:Ljava/lang/Object;

    .line 849
    .line 850
    return-void
.end method


# virtual methods
.method public final a(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lj2/k;
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Li2/a;->d()F

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    move-object/from16 v15, p0

    .line 6
    .line 7
    iget-object v0, v15, Li2/a;->a:Lq2/d;

    .line 8
    .line 9
    iget-object v3, v0, Lq2/d;->g:Lq2/f;

    .line 10
    .line 11
    iget v6, v0, Lq2/d;->l:I

    .line 12
    .line 13
    iget-object v14, v0, Lq2/d;->i:Lj2/f;

    .line 14
    .line 15
    iget-object v0, v0, Lq2/d;->b:Li2/n0;

    .line 16
    .line 17
    sget-object v1, Lq2/b;->a:Lq2/a;

    .line 18
    .line 19
    iget-object v0, v0, Li2/n0;->c:Li2/x;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Li2/x;->a:Li2/w;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-boolean v0, v0, Li2/w;->a:Z

    .line 28
    .line 29
    :goto_0
    move v7, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    new-instance v0, Lj2/k;

    .line 34
    .line 35
    move/from16 v4, p1

    .line 36
    .line 37
    move/from16 v13, p2

    .line 38
    .line 39
    move-object/from16 v5, p3

    .line 40
    .line 41
    move/from16 v8, p4

    .line 42
    .line 43
    move/from16 v12, p5

    .line 44
    .line 45
    move/from16 v9, p6

    .line 46
    .line 47
    move/from16 v10, p7

    .line 48
    .line 49
    move/from16 v11, p8

    .line 50
    .line 51
    move-object/from16 v1, p9

    .line 52
    .line 53
    invoke-direct/range {v0 .. v14}, Lj2/k;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILj2/f;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->d:Lj2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj2/k;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    return v0
.end method

.method public final c(Le1/c;ILg1/d;)J
    .locals 11

    .line 1
    invoke-static {p1}, Lf1/c0;->u(Le1/c;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    const/4 p1, 0x1

    .line 6
    const/4 v8, 0x0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-ne p2, p1, :cond_1

    .line 11
    .line 12
    move p2, p1

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    move p2, v8

    .line 15
    :goto_1
    new-instance v6, Lb0/t;

    .line 16
    .line 17
    const/16 v0, 0xe

    .line 18
    .line 19
    invoke-direct {v6, p3, v0}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Li2/a;->d:Lj2/k;

    .line 23
    .line 24
    iget-object p3, v0, Lj2/k;->a:Landroid/text/TextPaint;

    .line 25
    .line 26
    iget-object v1, v0, Lj2/k;->f:Landroid/text/Layout;

    .line 27
    .line 28
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v3, 0x22

    .line 31
    .line 32
    if-lt v2, v3, :cond_3

    .line 33
    .line 34
    if-ne p2, p1, :cond_2

    .line 35
    .line 36
    new-instance p2, Lb/e;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {v0}, Lj2/k;->j()Lc8/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/16 v2, 0x10

    .line 47
    .line 48
    invoke-direct {p2, p3, v2, v0}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p3, Lk2/a;

    .line 52
    .line 53
    invoke-direct {p3, p2}, Lk2/a;-><init>(Lb/e;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static {}, Lf0/k;->q()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p2, p3}, Lf0/k;->m(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/GraphemeClusterSegmentFinder;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-static {p2}, Lf0/k;->n(Ljava/lang/Object;)Landroid/text/SegmentFinder;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    :goto_2
    new-instance p2, Lj2/a;

    .line 73
    .line 74
    invoke-direct {p2, v6}, Lj2/a;-><init>(Lb0/t;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v4, p3, p2}, Lf0/k;->r(Landroid/text/Layout;Landroid/graphics/RectF;Landroid/text/SegmentFinder;Lj2/a;)[I

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    goto/16 :goto_8

    .line 82
    .line 83
    :cond_3
    move v3, v2

    .line 84
    invoke-virtual {v0}, Lj2/k;->c()Lbe/k;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-ne p2, p1, :cond_4

    .line 89
    .line 90
    new-instance p2, Lb/e;

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-virtual {v0}, Lj2/k;->j()Lc8/a;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const/16 v5, 0x10

    .line 101
    .line 102
    invoke-direct {p2, p3, v5, v3}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :goto_3
    move-object v5, p2

    .line 106
    goto :goto_4

    .line 107
    :cond_4
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    const/16 v5, 0x1d

    .line 112
    .line 113
    if-lt v3, v5, :cond_5

    .line 114
    .line 115
    new-instance v3, Lk2/b;

    .line 116
    .line 117
    invoke-direct {v3, p2, p3}, Lk2/b;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V

    .line 118
    .line 119
    .line 120
    move-object p2, v3

    .line 121
    goto :goto_3

    .line 122
    :cond_5
    new-instance p3, Lk2/c;

    .line 123
    .line 124
    invoke-direct {p3, p2}, Lk2/c;-><init>(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    move-object p2, p3

    .line 128
    goto :goto_3

    .line 129
    :goto_4
    iget p2, v4, Landroid/graphics/RectF;->top:F

    .line 130
    .line 131
    float-to-int p2, p2

    .line 132
    invoke-virtual {v1, p2}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    iget p3, v4, Landroid/graphics/RectF;->top:F

    .line 137
    .line 138
    invoke-virtual {v0, p2}, Lj2/k;->e(I)F

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    cmpl-float p3, p3, v3

    .line 143
    .line 144
    if-lez p3, :cond_6

    .line 145
    .line 146
    add-int/lit8 p2, p2, 0x1

    .line 147
    .line 148
    iget p3, v0, Lj2/k;->g:I

    .line 149
    .line 150
    if-lt p2, p3, :cond_6

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_6
    move v3, p2

    .line 154
    iget p2, v4, Landroid/graphics/RectF;->bottom:F

    .line 155
    .line 156
    float-to-int p2, p2

    .line 157
    invoke-virtual {v1, p2}, Landroid/text/Layout;->getLineForVertical(I)I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-nez p2, :cond_7

    .line 162
    .line 163
    iget p3, v4, Landroid/graphics/RectF;->bottom:F

    .line 164
    .line 165
    invoke-virtual {v0, v8}, Lj2/k;->g(I)F

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    cmpg-float p3, p3, v7

    .line 170
    .line 171
    if-gez p3, :cond_7

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_7
    const/4 v7, 0x1

    .line 175
    invoke-static/range {v0 .. v7}, Lj2/g;->e(Lj2/k;Landroid/text/Layout;Lbe/k;ILandroid/graphics/RectF;Lk2/d;Lb0/t;Z)I

    .line 176
    .line 177
    .line 178
    move-result p3

    .line 179
    :goto_5
    move v9, v3

    .line 180
    const/4 v10, -0x1

    .line 181
    if-ne p3, v10, :cond_8

    .line 182
    .line 183
    if-ge v9, p2, :cond_8

    .line 184
    .line 185
    add-int/lit8 v3, v9, 0x1

    .line 186
    .line 187
    const/4 v7, 0x1

    .line 188
    invoke-static/range {v0 .. v7}, Lj2/g;->e(Lj2/k;Landroid/text/Layout;Lbe/k;ILandroid/graphics/RectF;Lk2/d;Lb0/t;Z)I

    .line 189
    .line 190
    .line 191
    move-result p3

    .line 192
    goto :goto_5

    .line 193
    :cond_8
    if-ne p3, v10, :cond_9

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_9
    const/4 v7, 0x0

    .line 197
    move v3, p2

    .line 198
    invoke-static/range {v0 .. v7}, Lj2/g;->e(Lj2/k;Landroid/text/Layout;Lbe/k;ILandroid/graphics/RectF;Lk2/d;Lb0/t;Z)I

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    :goto_6
    if-ne p2, v10, :cond_a

    .line 203
    .line 204
    if-ge v9, v3, :cond_a

    .line 205
    .line 206
    add-int/lit8 v3, v3, -0x1

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    invoke-static/range {v0 .. v7}, Lj2/g;->e(Lj2/k;Landroid/text/Layout;Lbe/k;ILandroid/graphics/RectF;Lk2/d;Lb0/t;Z)I

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    goto :goto_6

    .line 214
    :cond_a
    if-ne p2, v10, :cond_b

    .line 215
    .line 216
    :goto_7
    const/4 p2, 0x0

    .line 217
    goto :goto_8

    .line 218
    :cond_b
    add-int/2addr p3, p1

    .line 219
    invoke-interface {v5, p3}, Lk2/d;->g(I)I

    .line 220
    .line 221
    .line 222
    move-result p3

    .line 223
    sub-int/2addr p2, p1

    .line 224
    invoke-interface {v5, p2}, Lk2/d;->h(I)I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    filled-new-array {p3, p2}, [I

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    :goto_8
    if-nez p2, :cond_c

    .line 233
    .line 234
    sget-wide p1, Li2/m0;->b:J

    .line 235
    .line 236
    return-wide p1

    .line 237
    :cond_c
    aget p3, p2, v8

    .line 238
    .line 239
    aget p1, p2, p1

    .line 240
    .line 241
    invoke-static {p3, p1}, Li2/e0;->b(II)J

    .line 242
    .line 243
    .line 244
    move-result-wide p1

    .line 245
    return-wide p1
.end method

.method public final d()F
    .locals 2

    .line 1
    iget-wide v0, p0, Li2/a;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lu2/a;->h(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    return v0
.end method

.method public final e(Lf1/u;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lf1/c;->a(Lf1/u;)Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Li2/a;->d:Lj2/k;

    .line 6
    .line 7
    iget-boolean v1, v0, Lj2/k;->d:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Li2/a;->d()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Li2/a;->b()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p1, v2, v2, v1, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    iget v1, v0, Lj2/k;->h:I

    .line 27
    .line 28
    iget-object v3, v0, Lj2/k;->p:Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz v1, :cond_2

    .line 38
    .line 39
    int-to-float v3, v1

    .line 40
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 41
    .line 42
    .line 43
    :cond_2
    sget-object v3, Lj2/l;->a:Ljava/lang/ThreadLocal;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-nez v4, :cond_3

    .line 50
    .line 51
    new-instance v4, Lj2/j;

    .line 52
    .line 53
    invoke-direct {v4}, Landroid/graphics/Canvas;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    check-cast v4, Lj2/j;

    .line 60
    .line 61
    iput-object p1, v4, Lj2/j;->a:Landroid/graphics/Canvas;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    :try_start_0
    iget-object v5, v0, Lj2/k;->f:Landroid/text/Layout;

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    iput-object v3, v4, Lj2/j;->a:Landroid/graphics/Canvas;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    const/4 v3, -0x1

    .line 74
    int-to-float v3, v3

    .line 75
    int-to-float v1, v1

    .line 76
    mul-float/2addr v3, v1

    .line 77
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_0
    iget-boolean v0, v0, Lj2/k;->d:Z

    .line 81
    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    iput-object v3, v4, Lj2/j;->a:Landroid/graphics/Canvas;

    .line 90
    .line 91
    throw p1
.end method

.method public final f(Lf1/u;JLf1/q0;Lt2/l;Lh1/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li2/a;->a:Lq2/d;

    .line 2
    .line 3
    iget-object v0, v0, Lq2/d;->g:Lq2/f;

    .line 4
    .line 5
    iget v1, v0, Lq2/f;->c:I

    .line 6
    .line 7
    invoke-virtual {v0, p2, p3}, Lq2/f;->d(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p4}, Lq2/f;->f(Lf1/q0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p5}, Lq2/f;->g(Lt2/l;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p6}, Lq2/f;->e(Lh1/c;)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    invoke-virtual {v0, p2}, Lq2/f;->b(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Li2/a;->e(Lf1/u;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lq2/f;->b(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final g(Lf1/u;Lf1/s;FLf1/q0;Lt2/l;Lh1/c;)V
    .locals 8

    .line 1
    iget-object v0, p0, Li2/a;->a:Lq2/d;

    .line 2
    .line 3
    iget-object v0, v0, Lq2/d;->g:Lq2/f;

    .line 4
    .line 5
    iget v1, v0, Lq2/f;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Li2/a;->d()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Li2/a;->b()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-long v4, v2

    .line 20
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-long v2, v2

    .line 25
    const/16 v6, 0x20

    .line 26
    .line 27
    shl-long/2addr v4, v6

    .line 28
    const-wide v6, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v2, v6

    .line 34
    or-long/2addr v2, v4

    .line 35
    invoke-virtual {v0, p2, v2, v3, p3}, Lq2/f;->c(Lf1/s;JF)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p4}, Lq2/f;->f(Lf1/q0;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p5}, Lq2/f;->g(Lt2/l;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p6}, Lq2/f;->e(Lh1/c;)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x3

    .line 48
    invoke-virtual {v0, p2}, Lq2/f;->b(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Li2/a;->e(Lf1/u;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lq2/f;->b(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
