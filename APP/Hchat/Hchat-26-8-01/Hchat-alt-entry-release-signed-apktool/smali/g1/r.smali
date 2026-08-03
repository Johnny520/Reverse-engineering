.class public final Lg1/r;
.super Lg1/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final r:Lg1/d;


# instance fields
.field public final d:Lg1/t;

.field public final e:F

.field public final f:F

.field public final g:Lg1/s;

.field public final h:[F

.field public final i:[F

.field public final j:[F

.field public final k:Lg1/j;

.field public final l:Lg1/q;

.field public final m:Lg1/n;

.field public final n:Lg1/j;

.field public final o:Lg1/q;

.field public final p:Lg1/n;

.field public final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lg1/d;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lg1/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg1/r;->r:Lg1/d;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[FLg1/t;DFFI)V
    .locals 17

    move-wide/from16 v1, p4

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v1, v3

    .line 681
    sget-object v3, Lg1/r;->r:Lg1/d;

    if-nez v0, :cond_0

    move-object v11, v3

    goto :goto_0

    .line 682
    :cond_0
    new-instance v4, Lg1/o;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v2, v5}, Lg1/o;-><init>(DI)V

    move-object v11, v4

    :goto_0
    if-nez v0, :cond_1

    :goto_1
    move-object v12, v3

    goto :goto_2

    .line 683
    :cond_1
    new-instance v3, Lg1/o;

    const/4 v0, 0x1

    invoke-direct {v3, v1, v2, v0}, Lg1/o;-><init>(DI)V

    goto :goto_1

    .line 684
    :goto_2
    new-instance v15, Lg1/s;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/16 v5, 0x0

    move-object v0, v15

    invoke-direct/range {v0 .. v10}, Lg1/s;-><init>(DDDDD)V

    const/4 v10, 0x0

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v13, p6

    move/from16 v14, p7

    move/from16 v16, p8

    .line 685
    invoke-direct/range {v6 .. v16}, Lg1/r;-><init>(Ljava/lang/String;[FLg1/t;[FLg1/j;Lg1/j;FFLg1/s;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[FLg1/t;Lg1/s;I)V
    .locals 15

    move-object/from16 v9, p4

    .line 670
    iget-wide v0, v9, Lg1/s;->a:D

    const-wide/high16 v2, -0x3ff8000000000000L    # -3.0

    cmpg-double v4, v0, v2

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 671
    :goto_0
    iget-wide v5, v9, Lg1/s;->g:D

    iget-wide v7, v9, Lg1/s;->f:D

    const-wide/high16 v10, -0x4000000000000000L    # -2.0

    const-wide/16 v12, 0x0

    if-eqz v4, :cond_1

    .line 672
    new-instance v4, Lg1/p;

    const/4 v14, 0x4

    invoke-direct {v4, v9, v14}, Lg1/p;-><init>(Lg1/s;I)V

    goto :goto_1

    :cond_1
    cmpg-double v4, v0, v10

    if-nez v4, :cond_2

    .line 673
    new-instance v4, Lg1/p;

    const/4 v14, 0x5

    invoke-direct {v4, v9, v14}, Lg1/p;-><init>(Lg1/s;I)V

    goto :goto_1

    :cond_2
    cmpg-double v4, v7, v12

    if-nez v4, :cond_3

    cmpg-double v4, v5, v12

    if-nez v4, :cond_3

    .line 674
    new-instance v4, Lg1/p;

    const/4 v14, 0x6

    invoke-direct {v4, v9, v14}, Lg1/p;-><init>(Lg1/s;I)V

    goto :goto_1

    .line 675
    :cond_3
    new-instance v4, Lg1/p;

    const/4 v14, 0x7

    invoke-direct {v4, v9, v14}, Lg1/p;-><init>(Lg1/s;I)V

    :goto_1
    cmpg-double v2, v0, v2

    if-nez v2, :cond_4

    .line 676
    new-instance v0, Lg1/p;

    const/4 v1, 0x0

    invoke-direct {v0, v9, v1}, Lg1/p;-><init>(Lg1/s;I)V

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_4
    cmpg-double v0, v0, v10

    if-nez v0, :cond_5

    .line 677
    new-instance v0, Lg1/p;

    const/4 v1, 0x1

    invoke-direct {v0, v9, v1}, Lg1/p;-><init>(Lg1/s;I)V

    goto :goto_2

    :cond_5
    cmpg-double v0, v7, v12

    if-nez v0, :cond_6

    cmpg-double v0, v5, v12

    if-nez v0, :cond_6

    .line 678
    new-instance v0, Lg1/p;

    const/4 v1, 0x2

    invoke-direct {v0, v9, v1}, Lg1/p;-><init>(Lg1/s;I)V

    goto :goto_2

    .line 679
    :cond_6
    new-instance v0, Lg1/p;

    const/4 v1, 0x3

    invoke-direct {v0, v9, v1}, Lg1/p;-><init>(Lg1/s;I)V

    goto :goto_2

    :goto_3
    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v5, v4

    const/4 v4, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v10, p5

    .line 680
    invoke-direct/range {v0 .. v10}, Lg1/r;-><init>(Ljava/lang/String;[FLg1/t;[FLg1/j;Lg1/j;FFLg1/s;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[FLg1/t;[FLg1/j;Lg1/j;FFLg1/s;I)V
    .locals 32

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
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v5, p6

    .line 12
    .line 13
    move/from16 v6, p7

    .line 14
    .line 15
    move/from16 v7, p8

    .line 16
    .line 17
    move/from16 v8, p10

    .line 18
    .line 19
    sget-wide v9, Lg1/b;->a:J

    .line 20
    .line 21
    move-object/from16 v11, p1

    .line 22
    .line 23
    invoke-direct {v0, v8, v11, v9, v10}, Lg1/c;-><init>(ILjava/lang/String;J)V

    .line 24
    .line 25
    .line 26
    iput-object v2, v0, Lg1/r;->d:Lg1/t;

    .line 27
    .line 28
    iput v6, v0, Lg1/r;->e:F

    .line 29
    .line 30
    iput v7, v0, Lg1/r;->f:F

    .line 31
    .line 32
    move-object/from16 v9, p9

    .line 33
    .line 34
    iput-object v9, v0, Lg1/r;->g:Lg1/s;

    .line 35
    .line 36
    iput-object v4, v0, Lg1/r;->k:Lg1/j;

    .line 37
    .line 38
    new-instance v9, Lg1/q;

    .line 39
    .line 40
    const/4 v10, 0x1

    .line 41
    invoke-direct {v9, v0, v10}, Lg1/q;-><init>(Lg1/r;I)V

    .line 42
    .line 43
    .line 44
    iput-object v9, v0, Lg1/r;->l:Lg1/q;

    .line 45
    .line 46
    new-instance v9, Lg1/n;

    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    invoke-direct {v9, v0, v11}, Lg1/n;-><init>(Lg1/r;I)V

    .line 50
    .line 51
    .line 52
    iput-object v9, v0, Lg1/r;->m:Lg1/n;

    .line 53
    .line 54
    iput-object v5, v0, Lg1/r;->n:Lg1/j;

    .line 55
    .line 56
    new-instance v9, Lg1/q;

    .line 57
    .line 58
    invoke-direct {v9, v0, v11}, Lg1/q;-><init>(Lg1/r;I)V

    .line 59
    .line 60
    .line 61
    iput-object v9, v0, Lg1/r;->o:Lg1/q;

    .line 62
    .line 63
    new-instance v9, Lg1/n;

    .line 64
    .line 65
    invoke-direct {v9, v0, v10}, Lg1/n;-><init>(Lg1/r;I)V

    .line 66
    .line 67
    .line 68
    iput-object v9, v0, Lg1/r;->p:Lg1/n;

    .line 69
    .line 70
    array-length v9, v1

    .line 71
    const/16 v12, 0x9

    .line 72
    .line 73
    const/4 v13, 0x6

    .line 74
    if-eq v9, v13, :cond_1

    .line 75
    .line 76
    array-length v9, v1

    .line 77
    if-ne v9, v12, :cond_0

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    const-string v1, "The color space\'s primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"

    .line 81
    .line 82
    invoke-static {v1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    throw v1

    .line 87
    :cond_1
    :goto_0
    cmpl-float v9, v6, v7

    .line 88
    .line 89
    if-gez v9, :cond_10

    .line 90
    .line 91
    new-array v9, v13, [F

    .line 92
    .line 93
    array-length v14, v1

    .line 94
    const/16 v15, 0x8

    .line 95
    .line 96
    const/16 v16, 0x7

    .line 97
    .line 98
    const/16 v17, 0x2

    .line 99
    .line 100
    const/16 v18, 0x3

    .line 101
    .line 102
    const/16 v19, 0x4

    .line 103
    .line 104
    const/16 v20, 0x5

    .line 105
    .line 106
    if-ne v14, v12, :cond_2

    .line 107
    .line 108
    aget v14, v1, v11

    .line 109
    .line 110
    aget v21, v1, v10

    .line 111
    .line 112
    add-float v22, v14, v21

    .line 113
    .line 114
    aget v23, v1, v17

    .line 115
    .line 116
    add-float v22, v22, v23

    .line 117
    .line 118
    div-float v14, v14, v22

    .line 119
    .line 120
    aput v14, v9, v11

    .line 121
    .line 122
    div-float v21, v21, v22

    .line 123
    .line 124
    aput v21, v9, v10

    .line 125
    .line 126
    aget v14, v1, v18

    .line 127
    .line 128
    aget v21, v1, v19

    .line 129
    .line 130
    add-float v22, v14, v21

    .line 131
    .line 132
    aget v23, v1, v20

    .line 133
    .line 134
    add-float v22, v22, v23

    .line 135
    .line 136
    div-float v14, v14, v22

    .line 137
    .line 138
    aput v14, v9, v17

    .line 139
    .line 140
    div-float v21, v21, v22

    .line 141
    .line 142
    aput v21, v9, v18

    .line 143
    .line 144
    aget v14, v1, v13

    .line 145
    .line 146
    aget v21, v1, v16

    .line 147
    .line 148
    add-float v22, v14, v21

    .line 149
    .line 150
    aget v1, v1, v15

    .line 151
    .line 152
    add-float v22, v22, v1

    .line 153
    .line 154
    div-float v14, v14, v22

    .line 155
    .line 156
    aput v14, v9, v19

    .line 157
    .line 158
    div-float v21, v21, v22

    .line 159
    .line 160
    aput v21, v9, v20

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_2
    invoke-static {v1, v11, v9, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 164
    .line 165
    .line 166
    :goto_1
    iput-object v9, v0, Lg1/r;->h:[F

    .line 167
    .line 168
    if-nez v3, :cond_3

    .line 169
    .line 170
    aget v3, v9, v11

    .line 171
    .line 172
    aget v14, v9, v10

    .line 173
    .line 174
    aget v21, v9, v17

    .line 175
    .line 176
    aget v22, v9, v18

    .line 177
    .line 178
    aget v23, v9, v19

    .line 179
    .line 180
    aget v24, v9, v20

    .line 181
    .line 182
    const/high16 p1, 0x3f800000    # 1.0f

    .line 183
    .line 184
    iget v1, v2, Lg1/t;->a:F

    .line 185
    .line 186
    move/from16 p9, v11

    .line 187
    .line 188
    iget v11, v2, Lg1/t;->b:F

    .line 189
    .line 190
    move/from16 v25, v15

    .line 191
    .line 192
    int-to-float v15, v10

    .line 193
    sub-float v26, v15, v3

    .line 194
    .line 195
    div-float v26, v26, v14

    .line 196
    .line 197
    sub-float v27, v15, v21

    .line 198
    .line 199
    div-float v27, v27, v22

    .line 200
    .line 201
    sub-float v28, v15, v23

    .line 202
    .line 203
    div-float v28, v28, v24

    .line 204
    .line 205
    sub-float/2addr v15, v1

    .line 206
    div-float/2addr v15, v11

    .line 207
    div-float v29, v3, v14

    .line 208
    .line 209
    div-float v30, v21, v22

    .line 210
    .line 211
    div-float v31, v23, v24

    .line 212
    .line 213
    div-float/2addr v1, v11

    .line 214
    sub-float v15, v15, v26

    .line 215
    .line 216
    sub-float v30, v30, v29

    .line 217
    .line 218
    mul-float v15, v15, v30

    .line 219
    .line 220
    sub-float v1, v1, v29

    .line 221
    .line 222
    sub-float v27, v27, v26

    .line 223
    .line 224
    mul-float v11, v1, v27

    .line 225
    .line 226
    sub-float/2addr v15, v11

    .line 227
    sub-float v28, v28, v26

    .line 228
    .line 229
    mul-float v28, v28, v30

    .line 230
    .line 231
    sub-float v31, v31, v29

    .line 232
    .line 233
    mul-float v27, v27, v31

    .line 234
    .line 235
    sub-float v28, v28, v27

    .line 236
    .line 237
    div-float v15, v15, v28

    .line 238
    .line 239
    mul-float v31, v31, v15

    .line 240
    .line 241
    sub-float v1, v1, v31

    .line 242
    .line 243
    div-float v1, v1, v30

    .line 244
    .line 245
    sub-float v11, p1, v1

    .line 246
    .line 247
    sub-float/2addr v11, v15

    .line 248
    div-float v26, v11, v14

    .line 249
    .line 250
    div-float v27, v1, v22

    .line 251
    .line 252
    div-float v28, v15, v24

    .line 253
    .line 254
    mul-float v29, v26, v3

    .line 255
    .line 256
    sub-float v3, p1, v3

    .line 257
    .line 258
    sub-float/2addr v3, v14

    .line 259
    mul-float v3, v3, v26

    .line 260
    .line 261
    mul-float v14, v27, v21

    .line 262
    .line 263
    sub-float v21, p1, v21

    .line 264
    .line 265
    sub-float v21, v21, v22

    .line 266
    .line 267
    mul-float v21, v21, v27

    .line 268
    .line 269
    mul-float v22, v28, v23

    .line 270
    .line 271
    sub-float v23, p1, v23

    .line 272
    .line 273
    sub-float v23, v23, v24

    .line 274
    .line 275
    mul-float v23, v23, v28

    .line 276
    .line 277
    new-array v12, v12, [F

    .line 278
    .line 279
    aput v29, v12, p9

    .line 280
    .line 281
    aput v11, v12, v10

    .line 282
    .line 283
    aput v3, v12, v17

    .line 284
    .line 285
    aput v14, v12, v18

    .line 286
    .line 287
    aput v1, v12, v19

    .line 288
    .line 289
    aput v21, v12, v20

    .line 290
    .line 291
    aput v22, v12, v13

    .line 292
    .line 293
    aput v15, v12, v16

    .line 294
    .line 295
    aput v23, v12, v25

    .line 296
    .line 297
    iput-object v12, v0, Lg1/r;->i:[F

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_3
    move/from16 p9, v11

    .line 301
    .line 302
    const/high16 p1, 0x3f800000    # 1.0f

    .line 303
    .line 304
    array-length v1, v3

    .line 305
    if-ne v1, v12, :cond_f

    .line 306
    .line 307
    iput-object v3, v0, Lg1/r;->i:[F

    .line 308
    .line 309
    :goto_2
    iget-object v1, v0, Lg1/r;->i:[F

    .line 310
    .line 311
    invoke-static {v1}, Lg1/k;->f([F)[F

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    iput-object v1, v0, Lg1/r;->j:[F

    .line 316
    .line 317
    invoke-static {v9}, Lg1/k;->b([F)F

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    sget-object v3, Lg1/e;->a:[F

    .line 322
    .line 323
    sget-object v3, Lg1/e;->b:[F

    .line 324
    .line 325
    invoke-static {v3}, Lg1/k;->b([F)F

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    div-float/2addr v1, v3

    .line 330
    const v3, 0x3f666666    # 0.9f

    .line 331
    .line 332
    .line 333
    cmpl-float v1, v1, v3

    .line 334
    .line 335
    if-lez v1, :cond_6

    .line 336
    .line 337
    sget-object v1, Lg1/e;->a:[F

    .line 338
    .line 339
    aget v11, v9, p9

    .line 340
    .line 341
    aget v12, v1, p9

    .line 342
    .line 343
    sub-float/2addr v11, v12

    .line 344
    aget v14, v9, v10

    .line 345
    .line 346
    aget v15, v1, v10

    .line 347
    .line 348
    sub-float/2addr v14, v15

    .line 349
    aget v16, v9, v17

    .line 350
    .line 351
    aget v21, v1, v17

    .line 352
    .line 353
    sub-float v16, v16, v21

    .line 354
    .line 355
    aget v22, v9, v18

    .line 356
    .line 357
    aget v23, v1, v18

    .line 358
    .line 359
    sub-float v22, v22, v23

    .line 360
    .line 361
    aget v24, v9, v19

    .line 362
    .line 363
    aget v25, v1, v19

    .line 364
    .line 365
    sub-float v24, v24, v25

    .line 366
    .line 367
    aget v26, v9, v20

    .line 368
    .line 369
    aget v1, v1, v20

    .line 370
    .line 371
    sub-float v26, v26, v1

    .line 372
    .line 373
    const/16 p2, 0x0

    .line 374
    .line 375
    new-array v3, v13, [F

    .line 376
    .line 377
    aput v11, v3, p9

    .line 378
    .line 379
    aput v14, v3, v10

    .line 380
    .line 381
    aput v16, v3, v17

    .line 382
    .line 383
    aput v22, v3, v18

    .line 384
    .line 385
    aput v24, v3, v19

    .line 386
    .line 387
    aput v26, v3, v20

    .line 388
    .line 389
    aget v11, v3, p9

    .line 390
    .line 391
    aget v14, v3, v10

    .line 392
    .line 393
    sub-float v16, v12, v25

    .line 394
    .line 395
    sub-float v22, v15, v1

    .line 396
    .line 397
    mul-float v22, v22, v11

    .line 398
    .line 399
    mul-float v16, v16, v14

    .line 400
    .line 401
    sub-float v22, v22, v16

    .line 402
    .line 403
    cmpg-float v16, v22, p2

    .line 404
    .line 405
    if-ltz v16, :cond_7

    .line 406
    .line 407
    sub-float v16, v12, v21

    .line 408
    .line 409
    sub-float v22, v15, v23

    .line 410
    .line 411
    mul-float v16, v16, v14

    .line 412
    .line 413
    mul-float v22, v22, v11

    .line 414
    .line 415
    sub-float v16, v16, v22

    .line 416
    .line 417
    cmpg-float v11, v16, p2

    .line 418
    .line 419
    if-gez v11, :cond_4

    .line 420
    .line 421
    goto :goto_3

    .line 422
    :cond_4
    aget v11, v3, v17

    .line 423
    .line 424
    aget v14, v3, v18

    .line 425
    .line 426
    sub-float v16, v21, v12

    .line 427
    .line 428
    sub-float v17, v23, v15

    .line 429
    .line 430
    mul-float v17, v17, v11

    .line 431
    .line 432
    mul-float v16, v16, v14

    .line 433
    .line 434
    sub-float v17, v17, v16

    .line 435
    .line 436
    cmpg-float v16, v17, p2

    .line 437
    .line 438
    if-ltz v16, :cond_7

    .line 439
    .line 440
    sub-float v16, v21, v25

    .line 441
    .line 442
    sub-float v17, v23, v1

    .line 443
    .line 444
    mul-float v16, v16, v14

    .line 445
    .line 446
    mul-float v17, v17, v11

    .line 447
    .line 448
    sub-float v16, v16, v17

    .line 449
    .line 450
    cmpg-float v11, v16, p2

    .line 451
    .line 452
    if-gez v11, :cond_5

    .line 453
    .line 454
    goto :goto_3

    .line 455
    :cond_5
    aget v11, v3, v19

    .line 456
    .line 457
    aget v3, v3, v20

    .line 458
    .line 459
    sub-float v14, v25, v21

    .line 460
    .line 461
    sub-float v16, v1, v23

    .line 462
    .line 463
    mul-float v16, v16, v11

    .line 464
    .line 465
    mul-float/2addr v14, v3

    .line 466
    sub-float v16, v16, v14

    .line 467
    .line 468
    cmpg-float v14, v16, p2

    .line 469
    .line 470
    if-ltz v14, :cond_7

    .line 471
    .line 472
    sub-float v25, v25, v12

    .line 473
    .line 474
    sub-float/2addr v1, v15

    .line 475
    mul-float v25, v25, v3

    .line 476
    .line 477
    mul-float/2addr v1, v11

    .line 478
    sub-float v25, v25, v1

    .line 479
    .line 480
    cmpg-float v1, v25, p2

    .line 481
    .line 482
    if-ltz v1, :cond_7

    .line 483
    .line 484
    goto :goto_4

    .line 485
    :cond_6
    const/16 p2, 0x0

    .line 486
    .line 487
    :cond_7
    :goto_3
    cmpg-float v1, v6, p2

    .line 488
    .line 489
    :goto_4
    if-nez v8, :cond_8

    .line 490
    .line 491
    goto/16 :goto_9

    .line 492
    .line 493
    :cond_8
    sget-object v1, Lg1/e;->a:[F

    .line 494
    .line 495
    if-ne v9, v1, :cond_9

    .line 496
    .line 497
    goto :goto_6

    .line 498
    :cond_9
    move/from16 v3, p9

    .line 499
    .line 500
    :goto_5
    if-ge v3, v13, :cond_b

    .line 501
    .line 502
    aget v8, v9, v3

    .line 503
    .line 504
    aget v11, v1, v3

    .line 505
    .line 506
    invoke-static {v8, v11}, Ljava/lang/Float;->compare(FF)I

    .line 507
    .line 508
    .line 509
    move-result v8

    .line 510
    if-eqz v8, :cond_a

    .line 511
    .line 512
    aget v8, v9, v3

    .line 513
    .line 514
    aget v11, v1, v3

    .line 515
    .line 516
    sub-float/2addr v8, v11

    .line 517
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 518
    .line 519
    .line 520
    move-result v8

    .line 521
    const v11, 0x3a83126f    # 0.001f

    .line 522
    .line 523
    .line 524
    cmpl-float v8, v8, v11

    .line 525
    .line 526
    if-lez v8, :cond_a

    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 530
    .line 531
    goto :goto_5

    .line 532
    :cond_b
    :goto_6
    sget-object v1, Lg1/k;->d:Lg1/t;

    .line 533
    .line 534
    invoke-static {v2, v1}, Lg1/k;->d(Lg1/t;Lg1/t;)Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    if-nez v1, :cond_c

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :cond_c
    cmpg-float v1, v6, p2

    .line 542
    .line 543
    if-nez v1, :cond_d

    .line 544
    .line 545
    cmpg-float v1, v7, p1

    .line 546
    .line 547
    if-nez v1, :cond_d

    .line 548
    .line 549
    sget-object v1, Lg1/e;->a:[F

    .line 550
    .line 551
    sget-object v1, Lg1/e;->e:Lg1/r;

    .line 552
    .line 553
    const-wide/16 v2, 0x0

    .line 554
    .line 555
    :goto_7
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 556
    .line 557
    cmpg-double v6, v2, v6

    .line 558
    .line 559
    if-gtz v6, :cond_e

    .line 560
    .line 561
    iget-object v6, v1, Lg1/r;->k:Lg1/j;

    .line 562
    .line 563
    invoke-interface {v4, v2, v3}, Lg1/j;->c(D)D

    .line 564
    .line 565
    .line 566
    move-result-wide v7

    .line 567
    invoke-interface {v6, v2, v3}, Lg1/j;->c(D)D

    .line 568
    .line 569
    .line 570
    move-result-wide v11

    .line 571
    sub-double/2addr v7, v11

    .line 572
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    .line 573
    .line 574
    .line 575
    move-result-wide v6

    .line 576
    const-wide v8, 0x3f50624dd2f1a9fcL    # 0.001

    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    cmpg-double v6, v6, v8

    .line 582
    .line 583
    if-gtz v6, :cond_d

    .line 584
    .line 585
    iget-object v6, v1, Lg1/r;->n:Lg1/j;

    .line 586
    .line 587
    invoke-interface {v5, v2, v3}, Lg1/j;->c(D)D

    .line 588
    .line 589
    .line 590
    move-result-wide v11

    .line 591
    invoke-interface {v6, v2, v3}, Lg1/j;->c(D)D

    .line 592
    .line 593
    .line 594
    move-result-wide v6

    .line 595
    sub-double/2addr v11, v6

    .line 596
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    .line 597
    .line 598
    .line 599
    move-result-wide v6

    .line 600
    cmpg-double v6, v6, v8

    .line 601
    .line 602
    if-gtz v6, :cond_d

    .line 603
    .line 604
    const-wide v6, 0x3f70101010101010L    # 0.00392156862745098

    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    add-double/2addr v2, v6

    .line 610
    goto :goto_7

    .line 611
    :cond_d
    :goto_8
    move/from16 v10, p9

    .line 612
    .line 613
    :cond_e
    :goto_9
    iput-boolean v10, v0, Lg1/r;->q:Z

    .line 614
    .line 615
    return-void

    .line 616
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 617
    .line 618
    array-length v2, v3

    .line 619
    new-instance v3, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    const-string v4, "Transform must have 9 entries! Has "

    .line 622
    .line 623
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    throw v1

    .line 637
    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 638
    .line 639
    new-instance v2, Ljava/lang/StringBuilder;

    .line 640
    .line 641
    const-string v3, "Invalid range: min="

    .line 642
    .line 643
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    const-string v3, ", max="

    .line 650
    .line 651
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    const-string v3, "; min must be strictly < max"

    .line 658
    .line 659
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    throw v1
.end method


# virtual methods
.method public final a(I)F
    .locals 0

    .line 1
    iget p1, p0, Lg1/r;->f:F

    .line 2
    .line 3
    return p1
.end method

.method public final b(I)F
    .locals 0

    .line 1
    iget p1, p0, Lg1/r;->e:F

    .line 2
    .line 3
    return p1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg1/r;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d(FFF)J
    .locals 4

    .line 1
    float-to-double v0, p1

    .line 2
    iget-object p1, p0, Lg1/r;->p:Lg1/n;

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1}, Lg1/n;->c(D)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    double-to-float v0, v0

    .line 9
    float-to-double v1, p2

    .line 10
    invoke-virtual {p1, v1, v2}, Lg1/n;->c(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    double-to-float p2, v1

    .line 15
    float-to-double v1, p3

    .line 16
    invoke-virtual {p1, v1, v2}, Lg1/n;->c(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    double-to-float p1, v1

    .line 21
    iget-object p3, p0, Lg1/r;->i:[F

    .line 22
    .line 23
    array-length v1, p3

    .line 24
    const/16 v2, 0x9

    .line 25
    .line 26
    if-ge v1, v2, :cond_0

    .line 27
    .line 28
    const-wide/16 p1, 0x0

    .line 29
    .line 30
    return-wide p1

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    aget v1, p3, v1

    .line 33
    .line 34
    mul-float/2addr v1, v0

    .line 35
    const/4 v2, 0x3

    .line 36
    aget v2, p3, v2

    .line 37
    .line 38
    mul-float/2addr v2, p2

    .line 39
    add-float/2addr v2, v1

    .line 40
    const/4 v1, 0x6

    .line 41
    aget v1, p3, v1

    .line 42
    .line 43
    mul-float/2addr v1, p1

    .line 44
    add-float/2addr v1, v2

    .line 45
    const/4 v2, 0x1

    .line 46
    aget v2, p3, v2

    .line 47
    .line 48
    mul-float/2addr v2, v0

    .line 49
    const/4 v0, 0x4

    .line 50
    aget v0, p3, v0

    .line 51
    .line 52
    mul-float/2addr v0, p2

    .line 53
    add-float/2addr v0, v2

    .line 54
    const/4 p2, 0x7

    .line 55
    aget p2, p3, p2

    .line 56
    .line 57
    mul-float/2addr p2, p1

    .line 58
    add-float/2addr p2, v0

    .line 59
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    int-to-long v0, p1

    .line 64
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    int-to-long p1, p1

    .line 69
    const/16 p3, 0x20

    .line 70
    .line 71
    shl-long/2addr v0, p3

    .line 72
    const-wide v2, 0xffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long/2addr p1, v2

    .line 78
    or-long/2addr p1, v0

    .line 79
    return-wide p1
.end method

.method public final e(FFF)F
    .locals 3

    .line 1
    float-to-double v0, p1

    .line 2
    iget-object p1, p0, Lg1/r;->p:Lg1/n;

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1}, Lg1/n;->c(D)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    double-to-float v0, v0

    .line 9
    float-to-double v1, p2

    .line 10
    invoke-virtual {p1, v1, v2}, Lg1/n;->c(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    double-to-float p2, v1

    .line 15
    float-to-double v1, p3

    .line 16
    invoke-virtual {p1, v1, v2}, Lg1/n;->c(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    double-to-float p1, v1

    .line 21
    const/4 p3, 0x2

    .line 22
    iget-object v1, p0, Lg1/r;->i:[F

    .line 23
    .line 24
    aget p3, v1, p3

    .line 25
    .line 26
    mul-float/2addr p3, v0

    .line 27
    const/4 v0, 0x5

    .line 28
    aget v0, v1, v0

    .line 29
    .line 30
    mul-float/2addr v0, p2

    .line 31
    add-float/2addr v0, p3

    .line 32
    const/16 p2, 0x8

    .line 33
    .line 34
    aget p2, v1, p2

    .line 35
    .line 36
    mul-float/2addr p2, p1

    .line 37
    add-float/2addr p2, v0

    .line 38
    return p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_a

    .line 7
    .line 8
    const-class v2, Lg1/r;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-super {p0, p1}, Lg1/c;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    return v1

    .line 24
    :cond_2
    check-cast p1, Lg1/r;

    .line 25
    .line 26
    iget v2, p1, Lg1/r;->e:F

    .line 27
    .line 28
    iget v3, p0, Lg1/r;->e:F

    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    iget v2, p1, Lg1/r;->f:F

    .line 38
    .line 39
    iget v3, p0, Lg1/r;->f:F

    .line 40
    .line 41
    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    return v1

    .line 48
    :cond_4
    iget-object v2, p0, Lg1/r;->d:Lg1/t;

    .line 49
    .line 50
    iget-object v3, p1, Lg1/r;->d:Lg1/t;

    .line 51
    .line 52
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_5

    .line 57
    .line 58
    return v1

    .line 59
    :cond_5
    iget-object v2, p0, Lg1/r;->h:[F

    .line 60
    .line 61
    iget-object v3, p1, Lg1/r;->h:[F

    .line 62
    .line 63
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([F[F)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_6

    .line 68
    .line 69
    return v1

    .line 70
    :cond_6
    iget-object v2, p1, Lg1/r;->g:Lg1/s;

    .line 71
    .line 72
    iget-object v3, p0, Lg1/r;->g:Lg1/s;

    .line 73
    .line 74
    if-eqz v3, :cond_7

    .line 75
    .line 76
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1

    .line 81
    :cond_7
    if-nez v2, :cond_8

    .line 82
    .line 83
    return v0

    .line 84
    :cond_8
    iget-object v0, p0, Lg1/r;->k:Lg1/j;

    .line 85
    .line 86
    iget-object v2, p1, Lg1/r;->k:Lg1/j;

    .line 87
    .line 88
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_9

    .line 93
    .line 94
    return v1

    .line 95
    :cond_9
    iget-object v0, p0, Lg1/r;->n:Lg1/j;

    .line 96
    .line 97
    iget-object p1, p1, Lg1/r;->n:Lg1/j;

    .line 98
    .line 99
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1

    .line 104
    :cond_a
    :goto_0
    return v1
.end method

.method public final f(FFFFLg1/c;)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lg1/r;->j:[F

    .line 3
    .line 4
    aget v0, v1, v0

    .line 5
    .line 6
    mul-float/2addr v0, p1

    .line 7
    const/4 v2, 0x3

    .line 8
    aget v2, v1, v2

    .line 9
    .line 10
    mul-float/2addr v2, p2

    .line 11
    add-float/2addr v2, v0

    .line 12
    const/4 v0, 0x6

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    mul-float/2addr v0, p3

    .line 16
    add-float/2addr v0, v2

    .line 17
    const/4 v2, 0x1

    .line 18
    aget v2, v1, v2

    .line 19
    .line 20
    mul-float/2addr v2, p1

    .line 21
    const/4 v3, 0x4

    .line 22
    aget v3, v1, v3

    .line 23
    .line 24
    mul-float/2addr v3, p2

    .line 25
    add-float/2addr v3, v2

    .line 26
    const/4 v2, 0x7

    .line 27
    aget v2, v1, v2

    .line 28
    .line 29
    mul-float/2addr v2, p3

    .line 30
    add-float/2addr v2, v3

    .line 31
    const/4 v3, 0x2

    .line 32
    aget v3, v1, v3

    .line 33
    .line 34
    mul-float/2addr v3, p1

    .line 35
    const/4 p1, 0x5

    .line 36
    aget p1, v1, p1

    .line 37
    .line 38
    mul-float/2addr p1, p2

    .line 39
    add-float/2addr p1, v3

    .line 40
    const/16 p2, 0x8

    .line 41
    .line 42
    aget p2, v1, p2

    .line 43
    .line 44
    mul-float/2addr p2, p3

    .line 45
    add-float/2addr p2, p1

    .line 46
    float-to-double v0, v0

    .line 47
    iget-object p1, p0, Lg1/r;->m:Lg1/n;

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Lg1/n;->c(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    double-to-float p3, v0

    .line 54
    float-to-double v0, v2

    .line 55
    invoke-virtual {p1, v0, v1}, Lg1/n;->c(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    double-to-float v0, v0

    .line 60
    float-to-double v1, p2

    .line 61
    invoke-virtual {p1, v1, v2}, Lg1/n;->c(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide p1

    .line 65
    double-to-float p1, p1

    .line 66
    invoke-static {p3, v0, p1, p4, p5}, Lf1/c0;->b(FFFFLg1/c;)J

    .line 67
    .line 68
    .line 69
    move-result-wide p1

    .line 70
    return-wide p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    invoke-super {p0}, Lg1/c;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, Lg1/r;->d:Lg1/t;

    .line 8
    .line 9
    invoke-virtual {v1}, Lg1/t;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v0, p0, Lg1/r;->h:[F

    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/2addr v0, v1

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget v1, p0, Lg1/r;->e:F

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    cmpg-float v3, v1, v2

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    move v1, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :goto_0
    add-int/2addr v0, v1

    .line 40
    mul-int/lit8 v0, v0, 0x1f

    .line 41
    .line 42
    iget v1, p0, Lg1/r;->f:F

    .line 43
    .line 44
    cmpg-float v2, v1, v2

    .line 45
    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    move v1, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    :goto_1
    add-int/2addr v0, v1

    .line 55
    mul-int/lit8 v0, v0, 0x1f

    .line 56
    .line 57
    iget-object v1, p0, Lg1/r;->g:Lg1/s;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v1}, Lg1/s;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    :cond_2
    add-int/2addr v0, v4

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    mul-int/lit8 v0, v0, 0x1f

    .line 69
    .line 70
    iget-object v1, p0, Lg1/r;->k:Lg1/j;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    mul-int/lit8 v1, v1, 0x1f

    .line 78
    .line 79
    iget-object v0, p0, Lg1/r;->n:Lg1/j;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-int/2addr v0, v1

    .line 86
    :cond_3
    return v0
.end method
