.class public final Lfb1;
.super Lbb1;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final b:Lay;

.field public c:Ljava/lang/String;

.field public d:Z

.field public final e:Lrq;

.field public f:Lhw;

.field public final g:Lgp0;

.field public h:Lja;

.field public final i:Lgp0;

.field public j:J

.field public k:F

.field public l:F

.field public final m:Leb1;


# direct methods
.method public constructor <init>(Lay;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfb1;->b:Lay;

    .line 5
    .line 6
    new-instance v0, Leb1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Leb1;-><init>(Lfb1;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p1, Lay;->i:Lsw;

    .line 13
    .line 14
    const-string p1, ""

    .line 15
    .line 16
    iput-object p1, p0, Lfb1;->c:Ljava/lang/String;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lfb1;->d:Z

    .line 20
    .line 21
    new-instance v0, Lrq;

    .line 22
    .line 23
    invoke-direct {v0}, Lrq;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lfb1;->e:Lrq;

    .line 27
    .line 28
    sget-object v0, Lcj;->l:Lcj;

    .line 29
    .line 30
    iput-object v0, p0, Lfb1;->f:Lhw;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lfb1;->g:Lgp0;

    .line 38
    .line 39
    new-instance v0, Lq11;

    .line 40
    .line 41
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, Lq11;-><init>(J)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lfb1;->i:Lgp0;

    .line 51
    .line 52
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    iput-wide v0, p0, Lfb1;->j:J

    .line 58
    .line 59
    const/high16 v0, 0x3f800000    # 1.0f

    .line 60
    .line 61
    iput v0, p0, Lfb1;->k:F

    .line 62
    .line 63
    iput v0, p0, Lfb1;->l:F

    .line 64
    .line 65
    new-instance v0, Leb1;

    .line 66
    .line 67
    invoke-direct {v0, p0, p1}, Leb1;-><init>(Lfb1;I)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lfb1;->m:Leb1;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a(Luq;)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, v1}, Lfb1;->e(Luq;FLja;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final e(Luq;FLja;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lfb1;->b:Lay;

    .line 6
    .line 7
    iget-boolean v3, v2, Lay;->d:Z

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    iget-object v5, v0, Lfb1;->g:Lgp0;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v3, :cond_4

    .line 14
    .line 15
    iget-wide v8, v2, Lay;->e:J

    .line 16
    .line 17
    const-wide/16 v10, 0x10

    .line 18
    .line 19
    cmp-long v3, v8, v10

    .line 20
    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    invoke-virtual {v5}, Lgp0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lja;

    .line 28
    .line 29
    sget v8, Lib1;->a:I

    .line 30
    .line 31
    instance-of v8, v3, Lja;

    .line 32
    .line 33
    const/4 v9, 0x3

    .line 34
    if-eqz v8, :cond_1

    .line 35
    .line 36
    iget v3, v3, Lja;->c:I

    .line 37
    .line 38
    if-ne v3, v4, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    if-ne v3, v9, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-nez v3, :cond_4

    .line 45
    .line 46
    :goto_0
    instance-of v3, v1, Lja;

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget v3, v1, Lja;->c:I

    .line 51
    .line 52
    if-ne v3, v4, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    if-ne v3, v9, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    if-nez v1, :cond_4

    .line 59
    .line 60
    :goto_1
    move v3, v6

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const/4 v3, 0x0

    .line 63
    :goto_2
    iget-boolean v8, v0, Lfb1;->d:Z

    .line 64
    .line 65
    iget-object v9, v0, Lfb1;->e:Lrq;

    .line 66
    .line 67
    if-nez v8, :cond_6

    .line 68
    .line 69
    iget-wide v10, v0, Lfb1;->j:J

    .line 70
    .line 71
    invoke-interface/range {p1 .. p1}, Luq;->c()J

    .line 72
    .line 73
    .line 74
    move-result-wide v12

    .line 75
    invoke-static {v10, v11, v12, v13}, Lq11;->a(JJ)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_6

    .line 80
    .line 81
    iget-object v8, v9, Lrq;->a:Lt5;

    .line 82
    .line 83
    if-eqz v8, :cond_5

    .line 84
    .line 85
    invoke-virtual {v8}, Lt5;->a()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    goto :goto_3

    .line 90
    :cond_5
    const/4 v8, 0x0

    .line 91
    :goto_3
    if-ne v3, v8, :cond_6

    .line 92
    .line 93
    goto/16 :goto_7

    .line 94
    .line 95
    :cond_6
    if-ne v3, v6, :cond_8

    .line 96
    .line 97
    iget-wide v10, v2, Lay;->e:J

    .line 98
    .line 99
    sget v2, Lib1;->a:I

    .line 100
    .line 101
    invoke-static {v10, v11}, Lff;->d(J)F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    const/high16 v6, 0x3f800000    # 1.0f

    .line 106
    .line 107
    cmpg-float v2, v2, v6

    .line 108
    .line 109
    if-nez v2, :cond_7

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    invoke-static {v6, v10, v11}, Lff;->b(FJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v10

    .line 116
    :goto_4
    new-instance v2, Lja;

    .line 117
    .line 118
    invoke-direct {v2, v4, v10, v11}, Lja;-><init>(IJ)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_8
    const/4 v2, 0x0

    .line 123
    :goto_5
    iput-object v2, v0, Lfb1;->h:Lja;

    .line 124
    .line 125
    invoke-interface/range {p1 .. p1}, Luq;->c()J

    .line 126
    .line 127
    .line 128
    move-result-wide v10

    .line 129
    const/16 v2, 0x20

    .line 130
    .line 131
    shr-long/2addr v10, v2

    .line 132
    long-to-int v4, v10

    .line 133
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    iget-object v6, v0, Lfb1;->i:Lgp0;

    .line 138
    .line 139
    invoke-virtual {v6}, Lgp0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    check-cast v8, Lq11;

    .line 144
    .line 145
    iget-wide v10, v8, Lq11;->a:J

    .line 146
    .line 147
    shr-long/2addr v10, v2

    .line 148
    long-to-int v8, v10

    .line 149
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    div-float/2addr v4, v8

    .line 154
    iput v4, v0, Lfb1;->k:F

    .line 155
    .line 156
    invoke-interface/range {p1 .. p1}, Luq;->c()J

    .line 157
    .line 158
    .line 159
    move-result-wide v10

    .line 160
    const-wide v12, 0xffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v10, v12

    .line 166
    long-to-int v4, v10

    .line 167
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-virtual {v6}, Lgp0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    check-cast v6, Lq11;

    .line 176
    .line 177
    iget-wide v10, v6, Lq11;->a:J

    .line 178
    .line 179
    and-long/2addr v10, v12

    .line 180
    long-to-int v6, v10

    .line 181
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    div-float/2addr v4, v6

    .line 186
    iput v4, v0, Lfb1;->l:F

    .line 187
    .line 188
    invoke-interface/range {p1 .. p1}, Luq;->c()J

    .line 189
    .line 190
    .line 191
    move-result-wide v10

    .line 192
    shr-long/2addr v10, v2

    .line 193
    long-to-int v4, v10

    .line 194
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    float-to-double v10, v4

    .line 199
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 200
    .line 201
    .line 202
    move-result-wide v10

    .line 203
    double-to-float v4, v10

    .line 204
    float-to-int v4, v4

    .line 205
    invoke-interface/range {p1 .. p1}, Luq;->c()J

    .line 206
    .line 207
    .line 208
    move-result-wide v10

    .line 209
    and-long/2addr v10, v12

    .line 210
    long-to-int v6, v10

    .line 211
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    float-to-double v10, v6

    .line 216
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 217
    .line 218
    .line 219
    move-result-wide v10

    .line 220
    double-to-float v6, v10

    .line 221
    float-to-int v6, v6

    .line 222
    int-to-long v10, v4

    .line 223
    shl-long/2addr v10, v2

    .line 224
    int-to-long v14, v6

    .line 225
    and-long/2addr v14, v12

    .line 226
    or-long/2addr v10, v14

    .line 227
    invoke-interface/range {p1 .. p1}, Luq;->getLayoutDirection()Lk50;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iget-object v6, v9, Lrq;->a:Lt5;

    .line 232
    .line 233
    iget-object v8, v9, Lrq;->b:Lb3;

    .line 234
    .line 235
    if-eqz v6, :cond_9

    .line 236
    .line 237
    iget-object v14, v6, Lt5;->a:Landroid/graphics/Bitmap;

    .line 238
    .line 239
    if-eqz v8, :cond_9

    .line 240
    .line 241
    move-wide v15, v12

    .line 242
    shr-long v12, v10, v2

    .line 243
    .line 244
    long-to-int v12, v12

    .line 245
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getWidth()I

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    if-gt v12, v13, :cond_a

    .line 250
    .line 251
    and-long v12, v10, v15

    .line 252
    .line 253
    long-to-int v12, v12

    .line 254
    invoke-virtual {v14}, Landroid/graphics/Bitmap;->getHeight()I

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    if-gt v12, v13, :cond_a

    .line 259
    .line 260
    iget v12, v9, Lrq;->d:I

    .line 261
    .line 262
    if-ne v12, v3, :cond_a

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_9
    move-wide v15, v12

    .line 266
    :cond_a
    shr-long v12, v10, v2

    .line 267
    .line 268
    long-to-int v2, v12

    .line 269
    and-long v12, v10, v15

    .line 270
    .line 271
    long-to-int v6, v12

    .line 272
    invoke-static {v2, v6, v3}, Lkl;->d(III)Lt5;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    sget-object v2, Lc3;->a:Landroid/graphics/Canvas;

    .line 277
    .line 278
    new-instance v8, Lb3;

    .line 279
    .line 280
    invoke-direct {v8}, Lb3;-><init>()V

    .line 281
    .line 282
    .line 283
    new-instance v2, Landroid/graphics/Canvas;

    .line 284
    .line 285
    iget-object v12, v6, Lt5;->a:Landroid/graphics/Bitmap;

    .line 286
    .line 287
    invoke-direct {v2, v12}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 288
    .line 289
    .line 290
    iput-object v2, v8, Lb3;->a:Landroid/graphics/Canvas;

    .line 291
    .line 292
    iput-object v6, v9, Lrq;->a:Lt5;

    .line 293
    .line 294
    iput-object v8, v9, Lrq;->b:Lb3;

    .line 295
    .line 296
    iput v3, v9, Lrq;->d:I

    .line 297
    .line 298
    :goto_6
    iput-wide v10, v9, Lrq;->c:J

    .line 299
    .line 300
    iget-object v12, v9, Lrq;->e:Ldd;

    .line 301
    .line 302
    invoke-static {v10, v11}, Lo30;->C(J)J

    .line 303
    .line 304
    .line 305
    move-result-wide v2

    .line 306
    iget-object v10, v12, Ldd;->d:Lcd;

    .line 307
    .line 308
    iget-object v11, v10, Lcd;->a:Lym;

    .line 309
    .line 310
    iget-object v13, v10, Lcd;->b:Lk50;

    .line 311
    .line 312
    iget-object v14, v10, Lcd;->c:Lbd;

    .line 313
    .line 314
    move-object/from16 v18, v8

    .line 315
    .line 316
    iget-wide v7, v10, Lcd;->d:J

    .line 317
    .line 318
    move-object/from16 v15, p1

    .line 319
    .line 320
    iput-object v15, v10, Lcd;->a:Lym;

    .line 321
    .line 322
    iput-object v4, v10, Lcd;->b:Lk50;

    .line 323
    .line 324
    move-object/from16 v4, v18

    .line 325
    .line 326
    iput-object v4, v10, Lcd;->c:Lbd;

    .line 327
    .line 328
    iput-wide v2, v10, Lcd;->d:J

    .line 329
    .line 330
    invoke-virtual {v4}, Lb3;->i()V

    .line 331
    .line 332
    .line 333
    move-object v2, v13

    .line 334
    move-object v3, v14

    .line 335
    sget-wide v13, Lff;->b:J

    .line 336
    .line 337
    const-wide/16 v15, 0x0

    .line 338
    .line 339
    const/16 v17, 0x3e

    .line 340
    .line 341
    invoke-static/range {v12 .. v17}, Luq;->v(Luq;JJI)V

    .line 342
    .line 343
    .line 344
    iget-object v10, v0, Lfb1;->m:Leb1;

    .line 345
    .line 346
    invoke-virtual {v10, v12}, Leb1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v4}, Lb3;->g()V

    .line 350
    .line 351
    .line 352
    iget-object v4, v12, Ldd;->d:Lcd;

    .line 353
    .line 354
    iput-object v11, v4, Lcd;->a:Lym;

    .line 355
    .line 356
    iput-object v2, v4, Lcd;->b:Lk50;

    .line 357
    .line 358
    iput-object v3, v4, Lcd;->c:Lbd;

    .line 359
    .line 360
    iput-wide v7, v4, Lcd;->d:J

    .line 361
    .line 362
    iget-object v2, v6, Lt5;->a:Landroid/graphics/Bitmap;

    .line 363
    .line 364
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 365
    .line 366
    .line 367
    const/4 v2, 0x0

    .line 368
    iput-boolean v2, v0, Lfb1;->d:Z

    .line 369
    .line 370
    invoke-interface/range {p1 .. p1}, Luq;->c()J

    .line 371
    .line 372
    .line 373
    move-result-wide v2

    .line 374
    iput-wide v2, v0, Lfb1;->j:J

    .line 375
    .line 376
    :goto_7
    if-eqz v1, :cond_b

    .line 377
    .line 378
    move-object/from16 v26, v1

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_b
    invoke-virtual {v5}, Lgp0;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, Lja;

    .line 386
    .line 387
    if-eqz v1, :cond_c

    .line 388
    .line 389
    invoke-virtual {v5}, Lgp0;->getValue()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    check-cast v0, Lja;

    .line 394
    .line 395
    :goto_8
    move-object/from16 v26, v0

    .line 396
    .line 397
    goto :goto_9

    .line 398
    :cond_c
    iget-object v0, v0, Lfb1;->h:Lja;

    .line 399
    .line 400
    goto :goto_8

    .line 401
    :goto_9
    iget-object v0, v9, Lrq;->a:Lt5;

    .line 402
    .line 403
    if-eqz v0, :cond_d

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_d
    const-string v1, "drawCachedImage must be invoked first before attempting to draw the result into another destination"

    .line 407
    .line 408
    invoke-static {v1}, Lw10;->b(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    :goto_a
    iget-wide v1, v9, Lrq;->c:J

    .line 412
    .line 413
    const/16 v27, 0x0

    .line 414
    .line 415
    const/16 v28, 0x35a

    .line 416
    .line 417
    const-wide/16 v23, 0x0

    .line 418
    .line 419
    move-object/from16 v19, p1

    .line 420
    .line 421
    move/from16 v25, p2

    .line 422
    .line 423
    move-object/from16 v20, v0

    .line 424
    .line 425
    move-wide/from16 v21, v1

    .line 426
    .line 427
    invoke-static/range {v19 .. v28}, Luq;->H(Luq;Lt5;JJFLja;II)V

    .line 428
    .line 429
    .line 430
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Params: \tname: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lfb1;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\n\tviewportWidth: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lfb1;->i:Lgp0;

    .line 19
    .line 20
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lq11;

    .line 25
    .line 26
    iget-wide v1, v1, Lq11;->a:J

    .line 27
    .line 28
    const/16 v3, 0x20

    .line 29
    .line 30
    shr-long/2addr v1, v3

    .line 31
    long-to-int v1, v1

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "\n\tviewportHeight: "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Lq11;

    .line 49
    .line 50
    iget-wide v1, p0, Lq11;->a:J

    .line 51
    .line 52
    const-wide v3, 0xffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v1, v3

    .line 58
    long-to-int p0, v1

    .line 59
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p0, "\n"

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
