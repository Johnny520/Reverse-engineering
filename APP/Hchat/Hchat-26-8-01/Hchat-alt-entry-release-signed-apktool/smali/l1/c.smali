.class public final Ll1/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lf1/c0;

.field public b:Lf1/j;

.field public c:Lf1/n;

.field public d:J

.field public e:J

.field public f:J

.field public g:Lu2/m;

.field public h:F

.field public final i:Ll1/d;

.field public final j:Lf1/h;

.field public k:Lf1/g;


# direct methods
.method public constructor <init>(Ll1/d;Lf1/c0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ll1/c;->a:Lf1/c0;

    .line 5
    .line 6
    sget p2, Lf1/w;->h:I

    .line 7
    .line 8
    sget-wide v0, Lf1/w;->g:J

    .line 9
    .line 10
    iput-wide v0, p0, Ll1/c;->d:J

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Ll1/c;->e:J

    .line 15
    .line 16
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Ll1/c;->f:J

    .line 22
    .line 23
    sget-object p2, Lu2/m;->g:Lu2/m;

    .line 24
    .line 25
    iput-object p2, p0, Ll1/c;->g:Lu2/m;

    .line 26
    .line 27
    const/high16 p2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p2, p0, Ll1/c;->h:F

    .line 30
    .line 31
    iput-object p1, p0, Ll1/c;->i:Ll1/d;

    .line 32
    .line 33
    invoke-static {}, Lf1/c0;->f()Lf1/h;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Ll1/c;->j:Lf1/h;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(Lx1/h0;Lf1/n;JJFI)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v4, p5

    .line 8
    .line 9
    iget-object v6, v1, Lx1/h0;->g:Lh1/b;

    .line 10
    .line 11
    iget-object v7, v0, Ll1/c;->a:Lf1/c0;

    .line 12
    .line 13
    instance-of v8, v7, Lf1/j0;

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const-wide/16 v10, 0x0

    .line 17
    .line 18
    if-eqz v8, :cond_0

    .line 19
    .line 20
    check-cast v7, Lf1/j0;

    .line 21
    .line 22
    iget-object v7, v7, Lf1/j0;->f:Lf1/j;

    .line 23
    .line 24
    iput-object v7, v0, Ll1/c;->b:Lf1/j;

    .line 25
    .line 26
    iput-wide v10, v0, Ll1/c;->e:J

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of v8, v7, Lf1/l0;

    .line 30
    .line 31
    if-eqz v8, :cond_2

    .line 32
    .line 33
    check-cast v7, Lf1/l0;

    .line 34
    .line 35
    iget-object v8, v7, Lf1/l0;->f:Le1/d;

    .line 36
    .line 37
    invoke-static {v8}, Lbe/h;->D(Le1/d;)Z

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    if-eqz v12, :cond_1

    .line 42
    .line 43
    iput-object v9, v0, Ll1/c;->b:Lf1/j;

    .line 44
    .line 45
    iget-wide v7, v8, Le1/d;->e:J

    .line 46
    .line 47
    iput-wide v7, v0, Ll1/c;->e:J

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v7, v7, Lf1/l0;->g:Lf1/j;

    .line 51
    .line 52
    iput-object v7, v0, Ll1/c;->b:Lf1/j;

    .line 53
    .line 54
    iput-wide v10, v0, Ll1/c;->e:J

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    instance-of v7, v7, Lf1/k0;

    .line 58
    .line 59
    if-eqz v7, :cond_10

    .line 60
    .line 61
    iput-object v9, v0, Ll1/c;->b:Lf1/j;

    .line 62
    .line 63
    iput-wide v10, v0, Ll1/c;->e:J

    .line 64
    .line 65
    :goto_0
    if-eqz p2, :cond_3

    .line 66
    .line 67
    move-object v4, v6

    .line 68
    move-object/from16 v6, p2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const-wide/16 v7, 0x10

    .line 72
    .line 73
    cmp-long v7, v4, v7

    .line 74
    .line 75
    if-eqz v7, :cond_6

    .line 76
    .line 77
    iget-object v7, v0, Ll1/c;->c:Lf1/n;

    .line 78
    .line 79
    if-eqz v7, :cond_4

    .line 80
    .line 81
    iget-wide v10, v0, Ll1/c;->d:J

    .line 82
    .line 83
    invoke-static {v10, v11, v4, v5}, Lf1/w;->c(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-nez v8, :cond_5

    .line 88
    .line 89
    :cond_4
    new-instance v7, Lf1/n;

    .line 90
    .line 91
    const/4 v8, 0x5

    .line 92
    invoke-direct {v7, v4, v5, v8}, Lf1/n;-><init>(JI)V

    .line 93
    .line 94
    .line 95
    iput-wide v4, v0, Ll1/c;->d:J

    .line 96
    .line 97
    iput-object v7, v0, Ll1/c;->c:Lf1/n;

    .line 98
    .line 99
    :cond_5
    move-object v4, v6

    .line 100
    move-object v6, v7

    .line 101
    goto :goto_1

    .line 102
    :cond_6
    move-object v4, v6

    .line 103
    move-object v6, v9

    .line 104
    :goto_1
    iget-wide v7, v0, Ll1/c;->f:J

    .line 105
    .line 106
    const-wide v10, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    cmp-long v5, v7, v10

    .line 112
    .line 113
    if-nez v5, :cond_7

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_7
    invoke-static {v7, v8, v2, v3}, Le1/e;->a(JJ)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_8

    .line 121
    .line 122
    iget-object v5, v0, Ll1/c;->g:Lu2/m;

    .line 123
    .line 124
    invoke-virtual {v1}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    if-ne v5, v7, :cond_8

    .line 129
    .line 130
    iget v5, v0, Ll1/c;->h:F

    .line 131
    .line 132
    invoke-virtual {v4}, Lh1/b;->d()F

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    cmpg-float v5, v5, v7

    .line 137
    .line 138
    if-nez v5, :cond_8

    .line 139
    .line 140
    const/16 p2, 0x20

    .line 141
    .line 142
    const-wide p5, 0xffffffffL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    goto/16 :goto_9

    .line 148
    .line 149
    :cond_8
    :goto_2
    iget-wide v7, v0, Ll1/c;->e:J

    .line 150
    .line 151
    iget-object v5, v0, Ll1/c;->b:Lf1/j;

    .line 152
    .line 153
    iget-object v13, v0, Ll1/c;->i:Ll1/d;

    .line 154
    .line 155
    iget v14, v13, Ll1/d;->a:F

    .line 156
    .line 157
    invoke-virtual {v1, v14}, Lx1/h0;->x0(F)F

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    iget v13, v13, Ll1/d;->b:F

    .line 162
    .line 163
    invoke-virtual {v1, v13}, Lx1/h0;->x0(F)F

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    const/4 v15, 0x1

    .line 168
    const/16 v9, 0xb

    .line 169
    .line 170
    const/16 p2, 0x20

    .line 171
    .line 172
    iget-object v10, v0, Ll1/c;->j:Lf1/h;

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const-wide p5, 0xffffffffL

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    const/4 v11, 0x2

    .line 182
    if-eqz v5, :cond_d

    .line 183
    .line 184
    int-to-float v7, v11

    .line 185
    mul-float v8, v14, v7

    .line 186
    .line 187
    mul-float/2addr v7, v13

    .line 188
    add-float/2addr v7, v8

    .line 189
    shr-long v11, v2, p2

    .line 190
    .line 191
    long-to-int v8, v11

    .line 192
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    add-float/2addr v8, v7

    .line 197
    and-long v11, v2, p5

    .line 198
    .line 199
    long-to-int v11, v11

    .line 200
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    add-float/2addr v11, v7

    .line 205
    float-to-double v7, v8

    .line 206
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 207
    .line 208
    .line 209
    move-result-wide v7

    .line 210
    double-to-float v7, v7

    .line 211
    float-to-int v7, v7

    .line 212
    float-to-double v11, v11

    .line 213
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 214
    .line 215
    .line 216
    move-result-wide v11

    .line 217
    double-to-float v8, v11

    .line 218
    float-to-int v8, v8

    .line 219
    invoke-static {v7, v8, v15}, Lf1/c0;->e(III)Lf1/g;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-static {v7}, Lf1/c0;->a(Lf1/g;)Lf1/b;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    cmpl-float v11, v13, v17

    .line 228
    .line 229
    if-lez v11, :cond_b

    .line 230
    .line 231
    add-float v11, v14, v13

    .line 232
    .line 233
    invoke-virtual {v8, v11, v11}, Lf1/b;->m(FF)V

    .line 234
    .line 235
    .line 236
    cmpl-float v11, v14, v17

    .line 237
    .line 238
    if-lez v11, :cond_9

    .line 239
    .line 240
    new-instance v12, Landroid/graphics/BlurMaskFilter;

    .line 241
    .line 242
    sget-object v15, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 243
    .line 244
    invoke-direct {v12, v14, v15}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_9
    const/4 v12, 0x0

    .line 249
    :goto_3
    invoke-static {v10, v12, v9}, Lr9/e0;->v(Lf1/h;Landroid/graphics/BlurMaskFilter;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8, v5, v10}, Lf1/b;->j(Lf1/j;Lf1/h;)V

    .line 253
    .line 254
    .line 255
    if-lez v11, :cond_a

    .line 256
    .line 257
    new-instance v9, Landroid/graphics/BlurMaskFilter;

    .line 258
    .line 259
    sget-object v11, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 260
    .line 261
    invoke-direct {v9, v14, v11}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_a
    const/4 v9, 0x0

    .line 266
    :goto_4
    const/4 v11, 0x3

    .line 267
    invoke-static {v10, v9, v11}, Lr9/e0;->v(Lf1/h;Landroid/graphics/BlurMaskFilter;I)V

    .line 268
    .line 269
    .line 270
    const/high16 v9, 0x40000000    # 2.0f

    .line 271
    .line 272
    mul-float/2addr v13, v9

    .line 273
    invoke-virtual {v10, v13}, Lf1/h;->C(F)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v8, v5, v10}, Lf1/b;->j(Lf1/j;Lf1/h;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_8

    .line 280
    .line 281
    :cond_b
    cmpl-float v11, v14, v17

    .line 282
    .line 283
    if-lez v11, :cond_c

    .line 284
    .line 285
    new-instance v11, Landroid/graphics/BlurMaskFilter;

    .line 286
    .line 287
    sget-object v12, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 288
    .line 289
    invoke-direct {v11, v14, v12}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_c
    const/4 v11, 0x0

    .line 294
    :goto_5
    invoke-static {v10, v11, v9}, Lr9/e0;->v(Lf1/h;Landroid/graphics/BlurMaskFilter;I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8, v14, v14}, Lf1/b;->m(FF)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8, v5, v10}, Lf1/b;->j(Lf1/j;Lf1/h;)V

    .line 301
    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_d
    int-to-float v5, v11

    .line 305
    mul-float v11, v14, v5

    .line 306
    .line 307
    mul-float/2addr v13, v5

    .line 308
    add-float/2addr v13, v11

    .line 309
    shr-long v11, v2, p2

    .line 310
    .line 311
    long-to-int v5, v11

    .line 312
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    add-float/2addr v5, v13

    .line 317
    and-long v11, v2, p5

    .line 318
    .line 319
    long-to-int v11, v11

    .line 320
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    add-float/2addr v11, v13

    .line 325
    float-to-double v12, v5

    .line 326
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 327
    .line 328
    .line 329
    move-result-wide v12

    .line 330
    double-to-float v12, v12

    .line 331
    float-to-int v12, v12

    .line 332
    move-object v13, v10

    .line 333
    float-to-double v9, v11

    .line 334
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 335
    .line 336
    .line 337
    move-result-wide v9

    .line 338
    double-to-float v9, v9

    .line 339
    float-to-int v9, v9

    .line 340
    invoke-static {v12, v9, v15}, Lf1/c0;->e(III)Lf1/g;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    invoke-static {v9}, Lf1/c0;->a(Lf1/g;)Lf1/b;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    sub-float/2addr v5, v14

    .line 349
    sub-float v19, v11, v14

    .line 350
    .line 351
    shr-long v11, v7, p2

    .line 352
    .line 353
    long-to-int v11, v11

    .line 354
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 355
    .line 356
    .line 357
    move-result v20

    .line 358
    and-long v7, v7, p5

    .line 359
    .line 360
    long-to-int v7, v7

    .line 361
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 362
    .line 363
    .line 364
    move-result v21

    .line 365
    cmpl-float v7, v14, v17

    .line 366
    .line 367
    if-lez v7, :cond_e

    .line 368
    .line 369
    new-instance v7, Landroid/graphics/BlurMaskFilter;

    .line 370
    .line 371
    sget-object v8, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 372
    .line 373
    invoke-direct {v7, v14, v8}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 374
    .line 375
    .line 376
    :goto_6
    const/16 v8, 0xb

    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_e
    const/4 v7, 0x0

    .line 380
    goto :goto_6

    .line 381
    :goto_7
    invoke-static {v13, v7, v8}, Lr9/e0;->v(Lf1/h;Landroid/graphics/BlurMaskFilter;I)V

    .line 382
    .line 383
    .line 384
    iget-object v15, v10, Lf1/b;->a:Landroid/graphics/Canvas;

    .line 385
    .line 386
    iget-object v7, v13, Lf1/h;->i:Ljava/lang/Object;

    .line 387
    .line 388
    move-object/from16 v22, v7

    .line 389
    .line 390
    check-cast v22, Landroid/graphics/Paint;

    .line 391
    .line 392
    move/from16 v17, v14

    .line 393
    .line 394
    move/from16 v18, v5

    .line 395
    .line 396
    move/from16 v16, v14

    .line 397
    .line 398
    invoke-virtual/range {v15 .. v22}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 399
    .line 400
    .line 401
    move-object v7, v9

    .line 402
    :goto_8
    iput-object v7, v0, Ll1/c;->k:Lf1/g;

    .line 403
    .line 404
    iput-wide v2, v0, Ll1/c;->f:J

    .line 405
    .line 406
    invoke-virtual {v1}, Lx1/h0;->getLayoutDirection()Lu2/m;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    iput-object v2, v0, Ll1/c;->g:Lu2/m;

    .line 411
    .line 412
    invoke-virtual {v4}, Lh1/b;->d()F

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    iput v2, v0, Ll1/c;->h:F

    .line 417
    .line 418
    :goto_9
    iget-object v2, v0, Ll1/c;->k:Lf1/g;

    .line 419
    .line 420
    if-eqz v2, :cond_f

    .line 421
    .line 422
    iget-object v3, v0, Ll1/c;->i:Ll1/d;

    .line 423
    .line 424
    iget v4, v3, Ll1/d;->a:F

    .line 425
    .line 426
    invoke-virtual {v1, v4}, Lx1/h0;->x0(F)F

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    iget v3, v3, Ll1/d;->b:F

    .line 431
    .line 432
    invoke-virtual {v1, v3}, Lx1/h0;->x0(F)F

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    add-float/2addr v3, v4

    .line 437
    neg-float v3, v3

    .line 438
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    int-to-long v4, v4

    .line 443
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    int-to-long v7, v3

    .line 448
    shl-long v3, v4, p2

    .line 449
    .line 450
    and-long v7, v7, p5

    .line 451
    .line 452
    or-long/2addr v3, v7

    .line 453
    const/16 v8, 0x8

    .line 454
    .line 455
    move/from16 v5, p7

    .line 456
    .line 457
    move/from16 v7, p8

    .line 458
    .line 459
    invoke-static/range {v1 .. v8}, Lh1/d;->U(Lh1/d;Lf1/g;JFLf1/n;II)V

    .line 460
    .line 461
    .line 462
    :cond_f
    return-void

    .line 463
    :cond_10
    invoke-static {}, Lokio/a;->k()V

    .line 464
    .line 465
    .line 466
    return-void
.end method
