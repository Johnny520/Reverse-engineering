.class public final Ls2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lw2;

.field public final β:I

.field public final γ:J

.field public final δ:Lk32;

.field public final ε:Ljava/lang/CharSequence;

.field public final ζ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lw2;IIJ)V
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
    iput-object v10, v0, Ls2;->α:Lw2;

    .line 13
    .line 14
    iput v4, v0, Ls2;->β:I

    .line 15
    .line 16
    move-wide/from16 v12, p4

    .line 17
    .line 18
    iput-wide v12, v0, Ls2;->γ:J

    .line 19
    .line 20
    invoke-static {v12, v13}, Lyo;->ι(J)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-static {v12, v13}, Lyo;->κ(J)I

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
    invoke-static {v1}, Lbm0;->α(Ljava/lang/String;)V

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
    invoke-static {v1}, Lbm0;->α(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    iget-object v1, v10, Lw2;->β:Lw32;

    .line 48
    .line 49
    iget-object v2, v10, Lw2;->θ:Ljava/lang/CharSequence;

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
    iget-object v8, v1, Lw32;->α:Lux1;

    .line 57
    .line 58
    iget-wide v8, v8, Lux1;->θ:J

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    invoke-static/range {v17 .. v17}, Lu81;->η(I)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    invoke-static {v8, v9, v6, v7}, Ly32;->α(JJ)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_8

    .line 71
    .line 72
    iget-object v6, v1, Lw32;->α:Lux1;

    .line 73
    .line 74
    iget-wide v6, v6, Lux1;->θ:J

    .line 75
    .line 76
    sget-wide v8, Ly32;->γ:J

    .line 77
    .line 78
    invoke-static {v6, v7, v8, v9}, Ly32;->α(JJ)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-nez v6, :cond_8

    .line 83
    .line 84
    iget-object v6, v1, Lw32;->β:Lr91;

    .line 85
    .line 86
    iget v6, v6, Lr91;->α:I

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
    const-class v6, Lol0;

    .line 122
    .line 123
    invoke-static {v2, v6}, Lv71;->ι(Landroid/text/Spanned;Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_8

    .line 128
    .line 129
    new-instance v6, Lol0;

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
    iput-object v9, v0, Ls2;->ε:Ljava/lang/CharSequence;

    .line 155
    .line 156
    iget-object v2, v1, Lw32;->β:Lr91;

    .line 157
    .line 158
    iget-object v1, v1, Lw32;->α:Lux1;

    .line 159
    .line 160
    iget v6, v2, Lr91;->α:I

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
    iget v15, v2, Lr91;->θ:I

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
    iget v2, v2, Lr91;->η:I

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
    invoke-virtual/range {v0 .. v9}, Ls2;->α(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lk32;

    .line 307
    .line 308
    .line 309
    move-result-object v14

    .line 310
    iget-object v0, v14, Lk32;->ε:Landroid/text/Layout;

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
    iget-object v1, v10, Lw2;->η:Ld3;

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
    invoke-virtual/range {v0 .. v9}, Ls2;->α(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lk32;

    .line 400
    .line 401
    .line 402
    move-result-object v14

    .line 403
    :goto_13
    iget v9, v14, Lk32;->ζ:I

    .line 404
    .line 405
    if-ne v11, v10, :cond_25

    .line 406
    .line 407
    invoke-virtual {v14}, Lk32;->α()I

    .line 408
    .line 409
    .line 410
    move-result v10

    .line 411
    invoke-static {v12, v13}, Lyo;->η(J)I

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
    invoke-static {v12, v13}, Lyo;->η(J)I

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
    invoke-virtual {v14, v10}, Lk32;->δ(I)F

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
    iget v4, v0, Ls2;->β:I

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
    iget-object v9, v0, Ls2;->ε:Ljava/lang/CharSequence;

    .line 454
    .line 455
    invoke-virtual/range {v0 .. v9}, Ls2;->α(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lk32;

    .line 456
    .line 457
    .line 458
    move-result-object v14

    .line 459
    :cond_24
    iput-object v14, v0, Ls2;->δ:Lk32;

    .line 460
    .line 461
    goto :goto_17

    .line 462
    :cond_25
    iput-object v14, v0, Ls2;->δ:Lk32;

    .line 463
    .line 464
    :goto_17
    iget-object v1, v0, Ls2;->α:Lw2;

    .line 465
    .line 466
    iget-object v1, v1, Lw2;->η:Ld3;

    .line 467
    .line 468
    iget-object v2, v15, Lux1;->α:Lf32;

    .line 469
    .line 470
    invoke-interface {v2}, Lf32;->δ()Lkn0;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v0}, Ls2;->γ()F

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    invoke-virtual {v0}, Ls2;->β()F

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
    iget-object v5, v15, Lux1;->α:Lf32;

    .line 502
    .line 503
    invoke-interface {v5}, Lf32;->ε()F

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    invoke-virtual {v1, v2, v3, v4, v5}, Ld3;->γ(Lkn0;JF)V

    .line 508
    .line 509
    .line 510
    iget-object v1, v0, Ls2;->δ:Lk32;

    .line 511
    .line 512
    iget-object v1, v1, Lk32;->ε:Landroid/text/Layout;

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
    const-class v5, Ldv1;

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
    check-cast v1, [Ldv1;

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
    invoke-virtual {v0}, Ls2;->γ()F

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    invoke-virtual {v0}, Ls2;->β()F

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
    iget-object v4, v4, Ldv1;->ζ:Lx91;

    .line 605
    .line 606
    new-instance v9, Ljw1;

    .line 607
    .line 608
    invoke-direct {v9, v5, v6}, Ljw1;-><init>(J)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v4, v9}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    add-int/lit8 v3, v3, 0x1

    .line 615
    .line 616
    goto :goto_19

    .line 617
    :cond_28
    iget-object v1, v0, Ls2;->ε:Ljava/lang/CharSequence;

    .line 618
    .line 619
    instance-of v2, v1, Landroid/text/Spanned;

    .line 620
    .line 621
    if-nez v2, :cond_29

    .line 622
    .line 623
    sget-object v1, Ljz;->ε:Ljz;

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
    const-class v3, Lfh1;

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
    check-cast v5, Lfh1;

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
    iget-object v9, v0, Ls2;->δ:Lk32;

    .line 664
    .line 665
    iget-object v9, v9, Lk32;->ε:Landroid/text/Layout;

    .line 666
    .line 667
    invoke-virtual {v9, v6}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 668
    .line 669
    .line 670
    move-result v9

    .line 671
    iget v10, v0, Ls2;->β:I

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
    iget-object v11, v0, Ls2;->δ:Lk32;

    .line 679
    .line 680
    iget-object v11, v11, Lk32;->ε:Landroid/text/Layout;

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
    iget-object v11, v0, Ls2;->δ:Lk32;

    .line 689
    .line 690
    iget-object v11, v11, Lk32;->ε:Landroid/text/Layout;

    .line 691
    .line 692
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getLineStart(I)I

    .line 693
    .line 694
    .line 695
    move-result v11

    .line 696
    iget-object v12, v0, Ls2;->δ:Lk32;

    .line 697
    .line 698
    iget-object v12, v12, Lk32;->ε:Landroid/text/Layout;

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
    iget-object v12, v0, Ls2;->δ:Lk32;

    .line 711
    .line 712
    invoke-virtual {v12, v9}, Lk32;->ε(I)I

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
    iget-object v8, v0, Ls2;->δ:Lk32;

    .line 732
    .line 733
    iget-object v8, v8, Lk32;->ε:Landroid/text/Layout;

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
    iget-object v11, v0, Ls2;->δ:Lk32;

    .line 746
    .line 747
    iget-object v11, v11, Lk32;->ε:Landroid/text/Layout;

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
    iget-object v8, v0, Ls2;->δ:Lk32;

    .line 758
    .line 759
    const/4 v12, 0x0

    .line 760
    invoke-virtual {v8, v6, v12}, Lk32;->η(IZ)F

    .line 761
    .line 762
    .line 763
    move-result v6

    .line 764
    invoke-virtual {v5}, Lfh1;->γ()I

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
    iget-object v8, v0, Ls2;->δ:Lk32;

    .line 777
    .line 778
    invoke-virtual {v8, v6, v12}, Lk32;->θ(IZ)F

    .line 779
    .line 780
    .line 781
    move-result v8

    .line 782
    invoke-virtual {v5}, Lfh1;->γ()I

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
    iget-object v8, v0, Ls2;->δ:Lk32;

    .line 791
    .line 792
    if-eqz v11, :cond_32

    .line 793
    .line 794
    invoke-virtual {v8, v6, v12}, Lk32;->η(IZ)F

    .line 795
    .line 796
    .line 797
    move-result v8

    .line 798
    invoke-virtual {v5}, Lfh1;->γ()I

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    goto :goto_20

    .line 803
    :cond_32
    invoke-virtual {v8, v6, v12}, Lk32;->θ(IZ)F

    .line 804
    .line 805
    .line 806
    move-result v6

    .line 807
    invoke-virtual {v5}, Lfh1;->γ()I

    .line 808
    .line 809
    .line 810
    move-result v8

    .line 811
    goto :goto_1f

    .line 812
    :goto_21
    iget-object v11, v0, Ls2;->δ:Lk32;

    .line 813
    .line 814
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v11, v9}, Lk32;->γ(I)F

    .line 818
    .line 819
    .line 820
    move-result v9

    .line 821
    invoke-virtual {v5}, Lfh1;->β()I

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    int-to-float v11, v11

    .line 826
    sub-float/2addr v9, v11

    .line 827
    invoke-virtual {v5}, Lfh1;->β()I

    .line 828
    .line 829
    .line 830
    move-result v5

    .line 831
    int-to-float v5, v5

    .line 832
    add-float/2addr v5, v9

    .line 833
    new-instance v11, Lml1;

    .line 834
    .line 835
    invoke-direct {v11, v6, v9, v8, v5}, Lml1;-><init>(FFFF)V

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
    iput-object v1, v0, Ls2;->ζ:Ljava/lang/Object;

    .line 849
    .line 850
    return-void
.end method


# virtual methods
.method public final α(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Lk32;
    .locals 15

    .line 1
    invoke-virtual {p0}, Ls2;->γ()F

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    iget-object p0, p0, Ls2;->α:Lw2;

    .line 6
    .line 7
    iget-object v3, p0, Lw2;->η:Ld3;

    .line 8
    .line 9
    iget v6, p0, Lw2;->μ:I

    .line 10
    .line 11
    iget-object v14, p0, Lw2;->ι:Lpp0;

    .line 12
    .line 13
    iget-object p0, p0, Lw2;->β:Lw32;

    .line 14
    .line 15
    sget-object v0, Lu2;->α:Lt2;

    .line 16
    .line 17
    iget-object p0, p0, Lw32;->γ:Lnh1;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lnh1;->α:Lkh1;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    iget-boolean p0, p0, Lkh1;->α:Z

    .line 26
    .line 27
    :goto_0
    move v7, p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    new-instance v0, Lk32;

    .line 32
    .line 33
    move/from16 v4, p1

    .line 34
    .line 35
    move/from16 v13, p2

    .line 36
    .line 37
    move-object/from16 v5, p3

    .line 38
    .line 39
    move/from16 v8, p4

    .line 40
    .line 41
    move/from16 v12, p5

    .line 42
    .line 43
    move/from16 v9, p6

    .line 44
    .line 45
    move/from16 v10, p7

    .line 46
    .line 47
    move/from16 v11, p8

    .line 48
    .line 49
    move-object/from16 v1, p9

    .line 50
    .line 51
    invoke-direct/range {v0 .. v14}, Lk32;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILpp0;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public final β()F
    .locals 0

    .line 1
    iget-object p0, p0, Ls2;->δ:Lk32;

    .line 2
    .line 3
    invoke-virtual {p0}, Lk32;->α()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-float p0, p0

    .line 8
    return p0
.end method

.method public final γ()F
    .locals 2

    .line 1
    iget-wide v0, p0, Ls2;->γ:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lyo;->θ(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    int-to-float p0, p0

    .line 8
    return p0
.end method

.method public final δ(Lde;)V
    .locals 5

    .line 1
    sget-object v0, Lm0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p1, Ll0;

    .line 7
    .line 8
    iget-object p1, p1, Ll0;->α:Landroid/graphics/Canvas;

    .line 9
    .line 10
    iget-object v0, p0, Ls2;->δ:Lk32;

    .line 11
    .line 12
    iget-boolean v1, v0, Lk32;->δ:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ls2;->γ()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Ls2;->β()F

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {p1, v2, v2, v1, p0}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget p0, v0, Lk32;->η:I

    .line 32
    .line 33
    iget-object v1, v0, Lk32;->ο:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    if-eqz p0, :cond_2

    .line 43
    .line 44
    int-to-float v1, p0

    .line 45
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 46
    .line 47
    .line 48
    :cond_2
    sget-object v1, Ln32;->α:Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Lb32;

    .line 57
    .line 58
    invoke-direct {v3}, Landroid/graphics/Canvas;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    check-cast v3, Lb32;

    .line 65
    .line 66
    iput-object p1, v3, Lb32;->α:Landroid/graphics/Canvas;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    :try_start_0
    iget-object v4, v0, Lk32;->ε:Landroid/text/Layout;

    .line 70
    .line 71
    invoke-virtual {v4, v3}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    iput-object v1, v3, Lb32;->α:Landroid/graphics/Canvas;

    .line 75
    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    const/4 v1, -0x1

    .line 79
    int-to-float v1, v1

    .line 80
    int-to-float p0, p0

    .line 81
    mul-float/2addr v1, p0

    .line 82
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_0
    iget-boolean p0, v0, Lk32;->δ:Z

    .line 86
    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 90
    .line 91
    .line 92
    :cond_5
    return-void

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    iput-object v1, v3, Lb32;->α:Landroid/graphics/Canvas;

    .line 95
    .line 96
    throw p0
.end method
