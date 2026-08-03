.class public final Lj2/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/text/TextPaint;

.field public final b:Landroid/text/TextUtils$TruncateAt;

.field public final c:Z

.field public final d:Z

.field public e:Lc8/a;

.field public final f:Landroid/text/Layout;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:F

.field public final k:F

.field public final l:Z

.field public final m:Landroid/graphics/Paint$FontMetricsInt;

.field public final n:I

.field public final o:[Ll2/h;

.field public final p:Landroid/graphics/Rect;

.field public q:Lbe/k;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IZIIIIIILj2/f;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object/from16 v4, p3

    .line 15
    .line 16
    iput-object v4, v1, Lj2/k;->a:Landroid/text/TextPaint;

    .line 17
    .line 18
    move-object/from16 v8, p5

    .line 19
    .line 20
    iput-object v8, v1, Lj2/k;->b:Landroid/text/TextUtils$TruncateAt;

    .line 21
    .line 22
    iput-boolean v7, v1, Lj2/k;->c:Z

    .line 23
    .line 24
    new-instance v5, Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v5, v1, Lj2/k;->p:Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-static/range {p6 .. p6}, Lj2/l;->b(I)Landroid/text/TextDirectionHeuristic;

    .line 36
    .line 37
    .line 38
    move-result-object v13

    .line 39
    sget-object v6, Lj2/i;->a:Landroid/text/Layout$Alignment;

    .line 40
    .line 41
    const/4 v14, 0x1

    .line 42
    const/4 v15, 0x2

    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    if-eq v3, v14, :cond_3

    .line 46
    .line 47
    if-eq v3, v15, :cond_2

    .line 48
    .line 49
    const/4 v6, 0x3

    .line 50
    if-eq v3, v6, :cond_1

    .line 51
    .line 52
    const/4 v6, 0x4

    .line 53
    if-eq v3, v6, :cond_0

    .line 54
    .line 55
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 56
    .line 57
    :goto_0
    move-object v6, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    sget-object v3, Lj2/i;->b:Landroid/text/Layout$Alignment;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object v3, Lj2/i;->a:Landroid/text/Layout$Alignment;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    instance-of v3, v2, Landroid/text/Spanned;

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    move-object v3, v2

    .line 79
    check-cast v3, Landroid/text/Spanned;

    .line 80
    .line 81
    const/4 v9, -0x1

    .line 82
    const-class v11, Ll2/a;

    .line 83
    .line 84
    invoke-interface {v3, v9, v5, v11}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ge v3, v5, :cond_5

    .line 89
    .line 90
    move v3, v14

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    const/4 v3, 0x0

    .line 93
    :goto_2
    const-string v5, "TextLayout:initLayout"

    .line 94
    .line 95
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-virtual/range {p14 .. p14}, Lj2/f;->a()Landroid/text/BoringLayout$Metrics;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    float-to-double v11, v0

    .line 103
    move-wide/from16 v16, v11

    .line 104
    .line 105
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->ceil(D)D

    .line 106
    .line 107
    .line 108
    move-result-wide v10

    .line 109
    double-to-float v5, v10

    .line 110
    float-to-int v5, v5

    .line 111
    const/16 v10, 0x21

    .line 112
    .line 113
    if-eqz v9, :cond_9

    .line 114
    .line 115
    invoke-virtual/range {p14 .. p14}, Lj2/f;->c()F

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    cmpg-float v0, v11, v0

    .line 120
    .line 121
    if-gtz v0, :cond_9

    .line 122
    .line 123
    if-nez v3, :cond_9

    .line 124
    .line 125
    iput-boolean v14, v1, Lj2/k;->l:Z

    .line 126
    .line 127
    if-ltz v5, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    const-string v0, "negative width"

    .line 131
    .line 132
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :goto_3
    if-ltz v5, :cond_7

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_7
    const-string v0, "negative ellipsized width"

    .line 139
    .line 140
    invoke-static {v0}, Lo2/a;->a(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 144
    .line 145
    if-lt v0, v10, :cond_8

    .line 146
    .line 147
    move v4, v5

    .line 148
    move-object v5, v6

    .line 149
    move-object v6, v9

    .line 150
    move v9, v4

    .line 151
    move-object/from16 v3, p3

    .line 152
    .line 153
    invoke-static/range {v2 .. v9}, Lai/a;->j(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;Landroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)Landroid/text/BoringLayout;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    move-object v2, v0

    .line 158
    const/4 v0, 0x0

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    move v4, v5

    .line 161
    move-object v5, v6

    .line 162
    move-object v6, v9

    .line 163
    new-instance v2, Landroid/text/BoringLayout;

    .line 164
    .line 165
    const/high16 v7, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const/4 v8, 0x0

    .line 168
    move v12, v4

    .line 169
    move-object/from16 v3, p1

    .line 170
    .line 171
    move-object/from16 v11, p5

    .line 172
    .line 173
    move/from16 v10, p7

    .line 174
    .line 175
    move-object v9, v6

    .line 176
    const/4 v0, 0x0

    .line 177
    move-object v6, v5

    .line 178
    move v5, v4

    .line 179
    move-object/from16 v4, p3

    .line 180
    .line 181
    invoke-direct/range {v2 .. v12}, Landroid/text/BoringLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)V

    .line 182
    .line 183
    .line 184
    :goto_5
    move/from16 v8, p8

    .line 185
    .line 186
    move-object v6, v13

    .line 187
    goto :goto_6

    .line 188
    :catchall_0
    move-exception v0

    .line 189
    goto/16 :goto_1d

    .line 190
    .line 191
    :cond_9
    move v4, v5

    .line 192
    move-object v5, v6

    .line 193
    const/4 v0, 0x0

    .line 194
    iput-boolean v0, v1, Lj2/k;->l:Z

    .line 195
    .line 196
    move-object v6, v5

    .line 197
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->ceil(D)D

    .line 202
    .line 203
    .line 204
    move-result-wide v2

    .line 205
    double-to-float v2, v2

    .line 206
    float-to-int v10, v2

    .line 207
    move-object/from16 v2, p1

    .line 208
    .line 209
    move-object/from16 v3, p3

    .line 210
    .line 211
    move-object/from16 v9, p5

    .line 212
    .line 213
    move/from16 v12, p7

    .line 214
    .line 215
    move/from16 v8, p8

    .line 216
    .line 217
    move/from16 v14, p10

    .line 218
    .line 219
    move/from16 v15, p11

    .line 220
    .line 221
    move/from16 v16, p12

    .line 222
    .line 223
    move/from16 v11, p13

    .line 224
    .line 225
    move-object v7, v6

    .line 226
    move-object v6, v13

    .line 227
    move/from16 v13, p9

    .line 228
    .line 229
    invoke-static/range {v2 .. v16}, Lj2/g;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    move-object v2, v3

    .line 234
    :goto_6
    iput-object v2, v1, Lj2/k;->f:Landroid/text/Layout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    .line 236
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    iput v3, v1, Lj2/k;->g:I

    .line 248
    .line 249
    add-int/lit8 v4, v3, -0x1

    .line 250
    .line 251
    if-ge v3, v8, :cond_b

    .line 252
    .line 253
    :cond_a
    move v14, v0

    .line 254
    goto :goto_7

    .line 255
    :cond_b
    invoke-virtual {v2, v4}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-gtz v5, :cond_c

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroid/text/Layout;->getLineEnd(I)I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    if-eq v5, v7, :cond_a

    .line 270
    .line 271
    :cond_c
    const/4 v14, 0x1

    .line 272
    :goto_7
    iput-boolean v14, v1, Lj2/k;->d:Z

    .line 273
    .line 274
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    instance-of v5, v5, Landroid/text/Spanned;

    .line 279
    .line 280
    if-nez v5, :cond_d

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_d
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    check-cast v5, Landroid/text/Spanned;

    .line 291
    .line 292
    const-class v8, Ll2/h;

    .line 293
    .line 294
    invoke-static {v5, v8}, Lj2/g;->f(Landroid/text/Spanned;Ljava/lang/Class;)Z

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-nez v5, :cond_e

    .line 299
    .line 300
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-lez v5, :cond_e

    .line 309
    .line 310
    :goto_8
    const/4 v5, 0x0

    .line 311
    goto :goto_9

    .line 312
    :cond_e
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    check-cast v5, Landroid/text/Spanned;

    .line 320
    .line 321
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    invoke-interface {v5, v0, v9, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    check-cast v5, [Ll2/h;

    .line 334
    .line 335
    :goto_9
    iput-object v5, v1, Lj2/k;->o:[Ll2/h;

    .line 336
    .line 337
    if-eqz v5, :cond_11

    .line 338
    .line 339
    invoke-static {v5}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    check-cast v8, Ll2/h;

    .line 344
    .line 345
    if-eqz v8, :cond_11

    .line 346
    .line 347
    iget-boolean v9, v8, Ll2/h;->i:Z

    .line 348
    .line 349
    if-eqz v9, :cond_f

    .line 350
    .line 351
    iget v8, v8, Ll2/h;->l:I

    .line 352
    .line 353
    const/4 v9, 0x2

    .line 354
    if-ne v8, v9, :cond_10

    .line 355
    .line 356
    const/4 v14, 0x1

    .line 357
    goto :goto_a

    .line 358
    :cond_f
    const/4 v9, 0x2

    .line 359
    :cond_10
    move v14, v0

    .line 360
    :goto_a
    move v10, v14

    .line 361
    goto :goto_b

    .line 362
    :cond_11
    const/4 v9, 0x2

    .line 363
    move v10, v0

    .line 364
    :goto_b
    if-eqz v5, :cond_12

    .line 365
    .line 366
    invoke-static {v5}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v8

    .line 370
    check-cast v8, Ll2/h;

    .line 371
    .line 372
    if-eqz v8, :cond_12

    .line 373
    .line 374
    iget-boolean v11, v8, Ll2/h;->j:Z

    .line 375
    .line 376
    if-eqz v11, :cond_12

    .line 377
    .line 378
    iget v8, v8, Ll2/h;->l:I

    .line 379
    .line 380
    if-ne v8, v9, :cond_12

    .line 381
    .line 382
    const/4 v14, 0x1

    .line 383
    goto :goto_c

    .line 384
    :cond_12
    move v14, v0

    .line 385
    :goto_c
    if-eqz v10, :cond_13

    .line 386
    .line 387
    if-eqz v14, :cond_13

    .line 388
    .line 389
    sget-wide v2, Lj2/l;->b:J

    .line 390
    .line 391
    const/16 p1, 0x0

    .line 392
    .line 393
    const/16 p2, 0x20

    .line 394
    .line 395
    const-wide p3, 0xffffffffL

    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    const/16 v7, 0x21

    .line 401
    .line 402
    const/4 v12, 0x1

    .line 403
    goto/16 :goto_16

    .line 404
    .line 405
    :cond_13
    sget-wide v15, Lj2/l;->b:J

    .line 406
    .line 407
    if-nez p7, :cond_1c

    .line 408
    .line 409
    iget-boolean v9, v1, Lj2/k;->l:Z

    .line 410
    .line 411
    if-eqz v9, :cond_15

    .line 412
    .line 413
    move-object v9, v2

    .line 414
    check-cast v9, Landroid/text/BoringLayout;

    .line 415
    .line 416
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 417
    .line 418
    const/16 p1, 0x0

    .line 419
    .line 420
    const/16 v7, 0x21

    .line 421
    .line 422
    if-lt v13, v7, :cond_14

    .line 423
    .line 424
    invoke-static {v9}, Lai/a;->z(Landroid/text/BoringLayout;)Z

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    goto :goto_d

    .line 429
    :cond_14
    move v9, v0

    .line 430
    goto :goto_d

    .line 431
    :cond_15
    const/16 p1, 0x0

    .line 432
    .line 433
    const/16 v7, 0x21

    .line 434
    .line 435
    move-object v9, v2

    .line 436
    check-cast v9, Landroid/text/StaticLayout;

    .line 437
    .line 438
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 439
    .line 440
    if-lt v13, v7, :cond_16

    .line 441
    .line 442
    invoke-static {v9}, Lai/a;->A(Landroid/text/StaticLayout;)Z

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    goto :goto_d

    .line 447
    :cond_16
    const/16 v9, 0x1c

    .line 448
    .line 449
    if-lt v13, v9, :cond_14

    .line 450
    .line 451
    const/4 v9, 0x1

    .line 452
    :goto_d
    if-eqz v9, :cond_17

    .line 453
    .line 454
    const/16 p2, 0x20

    .line 455
    .line 456
    const-wide p3, 0xffffffffL

    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    :goto_e
    const/4 v12, 0x1

    .line 462
    goto :goto_13

    .line 463
    :cond_17
    invoke-virtual {v2}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    invoke-virtual {v2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 468
    .line 469
    .line 470
    move-result-object v13

    .line 471
    const/16 p2, 0x20

    .line 472
    .line 473
    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineStart(I)I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    const-wide p3, 0xffffffffL

    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineEnd(I)I

    .line 483
    .line 484
    .line 485
    move-result v11

    .line 486
    invoke-static {v9, v13, v8, v11}, Lj2/g;->b(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineAscent(I)I

    .line 491
    .line 492
    .line 493
    move-result v11

    .line 494
    iget v12, v8, Landroid/graphics/Rect;->top:I

    .line 495
    .line 496
    if-ge v12, v11, :cond_18

    .line 497
    .line 498
    sub-int/2addr v11, v12

    .line 499
    :goto_f
    const/4 v12, 0x1

    .line 500
    goto :goto_10

    .line 501
    :cond_18
    invoke-virtual {v2}, Landroid/text/Layout;->getTopPadding()I

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    goto :goto_f

    .line 506
    :goto_10
    if-ne v3, v12, :cond_19

    .line 507
    .line 508
    goto :goto_11

    .line 509
    :cond_19
    invoke-virtual {v2, v4}, Landroid/text/Layout;->getLineStart(I)I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    invoke-virtual {v2, v4}, Landroid/text/Layout;->getLineEnd(I)I

    .line 514
    .line 515
    .line 516
    move-result v8

    .line 517
    invoke-static {v9, v13, v3, v8}, Lj2/g;->b(Landroid/text/TextPaint;Ljava/lang/CharSequence;II)Landroid/graphics/Rect;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    :goto_11
    invoke-virtual {v2, v4}, Landroid/text/Layout;->getLineDescent(I)I

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 526
    .line 527
    if-le v8, v3, :cond_1a

    .line 528
    .line 529
    sub-int/2addr v8, v3

    .line 530
    goto :goto_12

    .line 531
    :cond_1a
    invoke-virtual {v2}, Landroid/text/Layout;->getBottomPadding()I

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    :goto_12
    if-nez v11, :cond_1b

    .line 536
    .line 537
    if-nez v8, :cond_1b

    .line 538
    .line 539
    goto :goto_13

    .line 540
    :cond_1b
    invoke-static {v11, v8}, Lj2/l;->a(II)J

    .line 541
    .line 542
    .line 543
    move-result-wide v15

    .line 544
    goto :goto_13

    .line 545
    :cond_1c
    const/16 p1, 0x0

    .line 546
    .line 547
    const/16 p2, 0x20

    .line 548
    .line 549
    const-wide p3, 0xffffffffL

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    const/16 v7, 0x21

    .line 555
    .line 556
    goto :goto_e

    .line 557
    :goto_13
    if-eqz v10, :cond_1d

    .line 558
    .line 559
    move v10, v0

    .line 560
    goto :goto_14

    .line 561
    :cond_1d
    shr-long v2, v15, p2

    .line 562
    .line 563
    long-to-int v10, v2

    .line 564
    :goto_14
    if-eqz v14, :cond_1e

    .line 565
    .line 566
    move v2, v0

    .line 567
    goto :goto_15

    .line 568
    :cond_1e
    and-long v2, v15, p3

    .line 569
    .line 570
    long-to-int v2, v2

    .line 571
    :goto_15
    invoke-static {v10, v2}, Lj2/l;->a(II)J

    .line 572
    .line 573
    .line 574
    move-result-wide v2

    .line 575
    :goto_16
    if-eqz v5, :cond_23

    .line 576
    .line 577
    array-length v8, v5

    .line 578
    move v9, v0

    .line 579
    move v10, v9

    .line 580
    move v11, v10

    .line 581
    :goto_17
    if-ge v10, v8, :cond_21

    .line 582
    .line 583
    aget-object v13, v5, v10

    .line 584
    .line 585
    iget v14, v13, Ll2/h;->q:I

    .line 586
    .line 587
    if-gez v14, :cond_1f

    .line 588
    .line 589
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    .line 590
    .line 591
    .line 592
    move-result v14

    .line 593
    invoke-static {v9, v14}, Ljava/lang/Math;->max(II)I

    .line 594
    .line 595
    .line 596
    move-result v9

    .line 597
    :cond_1f
    iget v13, v13, Ll2/h;->r:I

    .line 598
    .line 599
    if-gez v13, :cond_20

    .line 600
    .line 601
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    .line 602
    .line 603
    .line 604
    move-result v11

    .line 605
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    :cond_20
    add-int/lit8 v10, v10, 0x1

    .line 610
    .line 611
    goto :goto_17

    .line 612
    :cond_21
    if-nez v9, :cond_22

    .line 613
    .line 614
    if-nez v11, :cond_22

    .line 615
    .line 616
    sget-wide v8, Lj2/l;->b:J

    .line 617
    .line 618
    goto :goto_18

    .line 619
    :cond_22
    invoke-static {v9, v11}, Lj2/l;->a(II)J

    .line 620
    .line 621
    .line 622
    move-result-wide v8

    .line 623
    goto :goto_18

    .line 624
    :cond_23
    sget-wide v8, Lj2/l;->b:J

    .line 625
    .line 626
    :goto_18
    shr-long v10, v2, p2

    .line 627
    .line 628
    long-to-int v5, v10

    .line 629
    shr-long v10, v8, p2

    .line 630
    .line 631
    long-to-int v10, v10

    .line 632
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    iput v5, v1, Lj2/k;->h:I

    .line 637
    .line 638
    and-long v2, v2, p3

    .line 639
    .line 640
    long-to-int v2, v2

    .line 641
    and-long v8, v8, p3

    .line 642
    .line 643
    long-to-int v3, v8

    .line 644
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    iput v2, v1, Lj2/k;->i:I

    .line 649
    .line 650
    iget-object v2, v1, Lj2/k;->a:Landroid/text/TextPaint;

    .line 651
    .line 652
    iget-object v3, v1, Lj2/k;->o:[Ll2/h;

    .line 653
    .line 654
    iget v5, v1, Lj2/k;->g:I

    .line 655
    .line 656
    sub-int/2addr v5, v12

    .line 657
    iget-object v8, v1, Lj2/k;->f:Landroid/text/Layout;

    .line 658
    .line 659
    invoke-virtual {v8, v5}, Landroid/text/Layout;->getLineStart(I)I

    .line 660
    .line 661
    .line 662
    move-result v9

    .line 663
    invoke-virtual {v8, v5}, Landroid/text/Layout;->getLineEnd(I)I

    .line 664
    .line 665
    .line 666
    move-result v8

    .line 667
    if-ne v9, v8, :cond_27

    .line 668
    .line 669
    if-eqz v3, :cond_27

    .line 670
    .line 671
    array-length v8, v3

    .line 672
    if-nez v8, :cond_24

    .line 673
    .line 674
    goto/16 :goto_1a

    .line 675
    .line 676
    :cond_24
    move-object v10, v6

    .line 677
    new-instance v6, Landroid/text/SpannableString;

    .line 678
    .line 679
    const-string v8, "\u200b"

    .line 680
    .line 681
    invoke-direct {v6, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 682
    .line 683
    .line 684
    array-length v8, v3

    .line 685
    if-eqz v8, :cond_26

    .line 686
    .line 687
    aget-object v3, v3, v0

    .line 688
    .line 689
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    .line 690
    .line 691
    .line 692
    move-result v8

    .line 693
    if-eqz v5, :cond_25

    .line 694
    .line 695
    iget-boolean v5, v3, Ll2/h;->j:Z

    .line 696
    .line 697
    if-eqz v5, :cond_25

    .line 698
    .line 699
    move v5, v0

    .line 700
    goto :goto_19

    .line 701
    :cond_25
    iget-boolean v5, v3, Ll2/h;->j:Z

    .line 702
    .line 703
    :goto_19
    new-instance v9, Ll2/h;

    .line 704
    .line 705
    iget v11, v3, Ll2/h;->g:F

    .line 706
    .line 707
    iget-boolean v12, v3, Ll2/h;->j:Z

    .line 708
    .line 709
    iget v13, v3, Ll2/h;->k:F

    .line 710
    .line 711
    iget v3, v3, Ll2/h;->l:I

    .line 712
    .line 713
    move/from16 p7, v3

    .line 714
    .line 715
    move/from16 p4, v5

    .line 716
    .line 717
    move/from16 p3, v8

    .line 718
    .line 719
    move-object/from16 p1, v9

    .line 720
    .line 721
    move/from16 p2, v11

    .line 722
    .line 723
    move/from16 p5, v12

    .line 724
    .line 725
    move/from16 p6, v13

    .line 726
    .line 727
    invoke-direct/range {p1 .. p7}, Ll2/h;-><init>(FIZZFI)V

    .line 728
    .line 729
    .line 730
    move-object/from16 v3, p1

    .line 731
    .line 732
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    .line 733
    .line 734
    .line 735
    move-result v5

    .line 736
    invoke-virtual {v6, v3, v0, v5, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v6}, Landroid/text/SpannableString;->length()I

    .line 740
    .line 741
    .line 742
    move-result v9

    .line 743
    iget-boolean v3, v1, Lj2/k;->c:Z

    .line 744
    .line 745
    sget-object v11, Lj2/d;->a:Landroid/text/Layout$Alignment;

    .line 746
    .line 747
    const/16 v19, 0x0

    .line 748
    .line 749
    const/16 v20, 0x0

    .line 750
    .line 751
    const v8, 0x7fffffff

    .line 752
    .line 753
    .line 754
    const v12, 0x7fffffff

    .line 755
    .line 756
    .line 757
    const/4 v13, 0x0

    .line 758
    const v14, 0x7fffffff

    .line 759
    .line 760
    .line 761
    const/4 v15, 0x0

    .line 762
    const/16 v17, 0x0

    .line 763
    .line 764
    const/16 v18, 0x0

    .line 765
    .line 766
    move-object v7, v2

    .line 767
    move/from16 v16, v3

    .line 768
    .line 769
    invoke-static/range {v6 .. v20}, Lj2/g;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IIZIIII)Landroid/text/StaticLayout;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    new-instance v7, Landroid/graphics/Paint$FontMetricsInt;

    .line 774
    .line 775
    invoke-direct {v7}, Landroid/graphics/Paint$FontMetricsInt;-><init>()V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineAscent(I)I

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    iput v3, v7, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 783
    .line 784
    invoke-virtual {v2, v0}, Landroid/text/StaticLayout;->getLineDescent(I)I

    .line 785
    .line 786
    .line 787
    move-result v3

    .line 788
    iput v3, v7, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 789
    .line 790
    invoke-virtual {v2, v0}, Landroid/text/StaticLayout;->getLineTop(I)I

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    iput v3, v7, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 795
    .line 796
    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineBottom(I)I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    iput v2, v7, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 801
    .line 802
    goto :goto_1b

    .line 803
    :cond_26
    const-string v0, "Array is empty."

    .line 804
    .line 805
    invoke-static {v0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    throw p1

    .line 809
    :cond_27
    :goto_1a
    move-object/from16 v7, p1

    .line 810
    .line 811
    :goto_1b
    if-eqz v7, :cond_28

    .line 812
    .line 813
    iget v0, v7, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 814
    .line 815
    invoke-virtual {v1, v4}, Lj2/k;->e(I)F

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    invoke-virtual {v1, v4}, Lj2/k;->g(I)F

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    sub-float/2addr v2, v3

    .line 824
    float-to-int v2, v2

    .line 825
    sub-int v10, v0, v2

    .line 826
    .line 827
    goto :goto_1c

    .line 828
    :cond_28
    move v10, v0

    .line 829
    :goto_1c
    iput v10, v1, Lj2/k;->n:I

    .line 830
    .line 831
    iput-object v7, v1, Lj2/k;->m:Landroid/graphics/Paint$FontMetricsInt;

    .line 832
    .line 833
    iget-object v0, v1, Lj2/k;->f:Landroid/text/Layout;

    .line 834
    .line 835
    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    invoke-static {v0, v4, v2}, Lx6/d;->A(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    iput v0, v1, Lj2/k;->j:F

    .line 844
    .line 845
    iget-object v0, v1, Lj2/k;->f:Landroid/text/Layout;

    .line 846
    .line 847
    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    invoke-static {v0, v4, v2}, Lx6/d;->B(Landroid/text/Layout;ILandroid/graphics/Paint;)F

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    iput v0, v1, Lj2/k;->k:F

    .line 856
    .line 857
    return-void

    .line 858
    :goto_1d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 859
    .line 860
    .line 861
    throw v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lj2/k;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lj2/k;->g:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineBottom(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/text/Layout;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    :goto_0
    iget v1, p0, Lj2/k;->h:I

    .line 21
    .line 22
    add-int/2addr v0, v1

    .line 23
    iget v1, p0, Lj2/k;->i:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    iget v1, p0, Lj2/k;->n:I

    .line 27
    .line 28
    add-int/2addr v0, v1

    .line 29
    return v0
.end method

.method public final b(I)F
    .locals 1

    .line 1
    iget v0, p0, Lj2/k;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iget p1, p0, Lj2/k;->j:F

    .line 8
    .line 9
    iget v0, p0, Lj2/k;->k:F

    .line 10
    .line 11
    add-float/2addr p1, v0

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final c()Lbe/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lj2/k;->q:Lbe/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbe/k;

    .line 6
    .line 7
    iget-object v1, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lbe/k;-><init>(Landroid/text/Layout;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lj2/k;->q:Lbe/k;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final d(I)F
    .locals 2

    .line 1
    iget v0, p0, Lj2/k;->h:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget v1, p0, Lj2/k;->g:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lj2/k;->m:Landroid/graphics/Paint$FontMetricsInt;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lj2/k;->g(I)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 19
    .line 20
    int-to-float v1, v1

    .line 21
    sub-float/2addr p1, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-float p1, p1

    .line 30
    :goto_0
    add-float/2addr v0, p1

    .line 31
    return v0
.end method

.method public final e(I)F
    .locals 3

    .line 1
    iget v0, p0, Lj2/k;->g:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    iget-object v2, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lj2/k;->m:Landroid/graphics/Paint$FontMetricsInt;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-float p1, p1

    .line 20
    iget v0, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 21
    .line 22
    int-to-float v0, v0

    .line 23
    add-float/2addr p1, v0

    .line 24
    return p1

    .line 25
    :cond_0
    iget v1, p0, Lj2/k;->h:I

    .line 26
    .line 27
    int-to-float v1, v1

    .line 28
    invoke-virtual {v2, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    add-float/2addr v1, v2

    .line 34
    add-int/lit8 v0, v0, -0x1

    .line 35
    .line 36
    if-ne p1, v0, :cond_1

    .line 37
    .line 38
    iget p1, p0, Lj2/k;->i:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    :goto_0
    int-to-float p1, p1

    .line 43
    add-float/2addr v1, p1

    .line 44
    return v1
.end method

.method public final f(I)I
    .locals 3

    .line 1
    sget-object v0, Lj2/l;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    iget-object v0, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lj2/k;->b:Landroid/text/TextUtils$TruncateAt;

    .line 12
    .line 13
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineEnd(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public final g(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p1, p0, Lj2/k;->h:I

    .line 13
    .line 14
    :goto_0
    int-to-float p1, p1

    .line 15
    add-float/2addr v0, p1

    .line 16
    return v0
.end method

.method public final h(IZ)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj2/k;->c()Lbe/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, v1, p2}, Lbe/k;->i(IZZ)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0, p1}, Lj2/k;->b(I)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-float/2addr p1, p2

    .line 21
    return p1
.end method

.method public final i(IZ)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj2/k;->c()Lbe/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1, p2}, Lbe/k;->i(IZZ)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0, p1}, Lj2/k;->b(I)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-float/2addr p1, p2

    .line 21
    return p1
.end method

.method public final j()Lc8/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lj2/k;->e:Lc8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lc8/a;

    .line 7
    .line 8
    iget-object v1, p0, Lj2/k;->f:Landroid/text/Layout;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v3, p0, Lj2/k;->a:Landroid/text/TextPaint;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-direct {v0, v2, v1, v3}, Lc8/a;-><init>(Ljava/lang/CharSequence;ILjava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lj2/k;->e:Lc8/a;

    .line 32
    .line 33
    return-object v0
.end method
