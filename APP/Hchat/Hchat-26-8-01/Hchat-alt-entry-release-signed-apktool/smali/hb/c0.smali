.class public final synthetic Lhb/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(J[FLgg/s;Lgg/r;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lhb/c0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lhb/c0;->h:J

    .line 8
    .line 9
    iput-object p3, p0, Lhb/c0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lhb/c0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lhb/c0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lc9/c0;Lhb/i0;Landroid/app/Activity;J)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lhb/c0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/c0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lhb/c0;->j:Ljava/lang/Object;

    iput-object p3, p0, Lhb/c0;->k:Ljava/lang/Object;

    iput-wide p4, p0, Lhb/c0;->h:J

    return-void
.end method

.method public synthetic constructor <init>(Le1/c;Lgg/u;JLf1/n;)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lhb/c0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/c0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lhb/c0;->j:Ljava/lang/Object;

    iput-wide p3, p0, Lhb/c0;->h:J

    iput-object p5, p0, Lhb/c0;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lhb/c0;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lhb/c0;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Le1/c;

    .line 11
    .line 12
    iget-object v2, v1, Lhb/c0;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lgg/u;

    .line 15
    .line 16
    iget-wide v5, v1, Lhb/c0;->h:J

    .line 17
    .line 18
    iget-object v3, v1, Lhb/c0;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v10, v3

    .line 21
    check-cast v10, Lf1/n;

    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    check-cast v3, Lx1/h0;

    .line 26
    .line 27
    invoke-virtual {v3}, Lx1/h0;->e()V

    .line 28
    .line 29
    .line 30
    iget v13, v0, Le1/c;->a:F

    .line 31
    .line 32
    iget v14, v0, Le1/c;->b:F

    .line 33
    .line 34
    iget-object v15, v3, Lx1/h0;->g:Lh1/b;

    .line 35
    .line 36
    iget-object v0, v15, Lh1/b;->h:Lb5/c;

    .line 37
    .line 38
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroidx/lifecycle/x;

    .line 41
    .line 42
    invoke-virtual {v0, v13, v14}, Landroidx/lifecycle/x;->c0(FF)V

    .line 43
    .line 44
    .line 45
    :try_start_0
    iget-object v0, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v4, v0

    .line 48
    check-cast v4, Lf1/g;

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/16 v12, 0x37a

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    invoke-static/range {v3 .. v12}, Lh1/d;->U0(Lh1/d;Lf1/g;JJFLf1/n;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    iget-object v0, v15, Lh1/b;->h:Lb5/c;

    .line 60
    .line 61
    iget-object v0, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Landroidx/lifecycle/x;

    .line 64
    .line 65
    neg-float v2, v13

    .line 66
    neg-float v3, v14

    .line 67
    invoke-virtual {v0, v2, v3}, Landroidx/lifecycle/x;->c0(FF)V

    .line 68
    .line 69
    .line 70
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 71
    .line 72
    return-object v0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    iget-object v2, v15, Lh1/b;->h:Lb5/c;

    .line 75
    .line 76
    iget-object v2, v2, Lb5/c;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Landroidx/lifecycle/x;

    .line 79
    .line 80
    neg-float v3, v13

    .line 81
    neg-float v4, v14

    .line 82
    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/x;->c0(FF)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :pswitch_0
    iget-object v0, v1, Lhb/c0;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, [F

    .line 89
    .line 90
    iget-object v2, v1, Lhb/c0;->j:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Lgg/s;

    .line 93
    .line 94
    iget-object v3, v1, Lhb/c0;->k:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Lgg/r;

    .line 97
    .line 98
    move-object/from16 v4, p1

    .line 99
    .line 100
    check-cast v4, Li2/r;

    .line 101
    .line 102
    iget v5, v4, Li2/r;->b:I

    .line 103
    .line 104
    iget-object v6, v4, Li2/r;->a:Li2/a;

    .line 105
    .line 106
    iget v7, v4, Li2/r;->c:I

    .line 107
    .line 108
    iget-wide v8, v1, Lhb/c0;->h:J

    .line 109
    .line 110
    invoke-static {v8, v9}, Li2/m0;->f(J)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-le v5, v10, :cond_0

    .line 115
    .line 116
    iget v5, v4, Li2/r;->b:I

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_0
    invoke-static {v8, v9}, Li2/m0;->f(J)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    :goto_1
    invoke-static {v8, v9}, Li2/m0;->e(J)I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-ge v7, v10, :cond_1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_1
    invoke-static {v8, v9}, Li2/m0;->e(J)I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    :goto_2
    invoke-virtual {v4, v5}, Li2/r;->d(I)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-virtual {v4, v7}, Li2/r;->d(I)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-static {v5, v4}, Li2/e0;->b(II)J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    iget v7, v2, Lgg/s;->g:I

    .line 147
    .line 148
    iget-object v8, v6, Li2/a;->d:Lj2/k;

    .line 149
    .line 150
    invoke-static {v4, v5}, Li2/m0;->f(J)I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    invoke-static {v4, v5}, Li2/m0;->e(J)I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    iget-object v11, v8, Lj2/k;->f:Landroid/text/Layout;

    .line 159
    .line 160
    invoke-virtual {v11}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    if-ltz v9, :cond_2

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_2
    const-string v13, "startOffset must be > 0"

    .line 172
    .line 173
    invoke-static {v13}, Lo2/a;->a(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :goto_3
    if-ge v9, v12, :cond_3

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_3
    const-string v13, "startOffset must be less than text length"

    .line 180
    .line 181
    invoke-static {v13}, Lo2/a;->a(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :goto_4
    if-le v10, v9, :cond_4

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_4
    const-string v13, "endOffset must be greater than startOffset"

    .line 188
    .line 189
    invoke-static {v13}, Lo2/a;->a(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_5
    if-gt v10, v12, :cond_5

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_5
    const-string v12, "endOffset must be smaller or equal to text length"

    .line 196
    .line 197
    invoke-static {v12}, Lo2/a;->a(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :goto_6
    sub-int v12, v10, v9

    .line 201
    .line 202
    mul-int/lit8 v12, v12, 0x4

    .line 203
    .line 204
    array-length v13, v0

    .line 205
    sub-int/2addr v13, v7

    .line 206
    if-lt v13, v12, :cond_6

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_6
    const-string v12, "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"

    .line 210
    .line 211
    invoke-static {v12}, Lo2/a;->a(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :goto_7
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    add-int/lit8 v13, v10, -0x1

    .line 219
    .line 220
    invoke-virtual {v11, v13}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    new-instance v14, Le2/g;

    .line 225
    .line 226
    invoke-direct {v14, v8}, Le2/g;-><init>(Lj2/k;)V

    .line 227
    .line 228
    .line 229
    if-gt v12, v13, :cond_c

    .line 230
    .line 231
    :goto_8
    invoke-virtual {v11, v12}, Landroid/text/Layout;->getLineStart(I)I

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    move-object/from16 v16, v0

    .line 236
    .line 237
    invoke-virtual {v8, v12}, Lj2/k;->f(I)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-virtual {v8, v12}, Lj2/k;->g(I)F

    .line 250
    .line 251
    .line 252
    move-result v17

    .line 253
    invoke-virtual {v8, v12}, Lj2/k;->e(I)F

    .line 254
    .line 255
    .line 256
    move-result v18

    .line 257
    move-wide/from16 v19, v4

    .line 258
    .line 259
    invoke-virtual {v11, v12}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    const/4 v5, 0x1

    .line 264
    move-object/from16 p1, v6

    .line 265
    .line 266
    const/4 v6, 0x0

    .line 267
    if-ne v4, v5, :cond_7

    .line 268
    .line 269
    move v4, v5

    .line 270
    goto :goto_9

    .line 271
    :cond_7
    move v4, v6

    .line 272
    :goto_9
    if-ge v15, v0, :cond_b

    .line 273
    .line 274
    invoke-virtual {v11, v15}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 275
    .line 276
    .line 277
    move-result v21

    .line 278
    if-eqz v4, :cond_8

    .line 279
    .line 280
    if-nez v21, :cond_8

    .line 281
    .line 282
    invoke-virtual {v14, v15, v6, v6, v5}, Le2/g;->a(IZZZ)F

    .line 283
    .line 284
    .line 285
    move-result v21

    .line 286
    add-int/lit8 v6, v15, 0x1

    .line 287
    .line 288
    invoke-virtual {v14, v6, v5, v5, v5}, Le2/g;->a(IZZZ)F

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    move/from16 v22, v0

    .line 293
    .line 294
    move v0, v6

    .line 295
    :goto_a
    const/4 v6, 0x0

    .line 296
    goto :goto_b

    .line 297
    :cond_8
    if-eqz v4, :cond_9

    .line 298
    .line 299
    if-eqz v21, :cond_9

    .line 300
    .line 301
    const/4 v6, 0x0

    .line 302
    invoke-virtual {v14, v15, v6, v6, v6}, Le2/g;->a(IZZZ)F

    .line 303
    .line 304
    .line 305
    move-result v21

    .line 306
    move/from16 v22, v0

    .line 307
    .line 308
    add-int/lit8 v0, v15, 0x1

    .line 309
    .line 310
    invoke-virtual {v14, v0, v5, v5, v6}, Le2/g;->a(IZZZ)F

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    move/from16 v23, v21

    .line 315
    .line 316
    move/from16 v21, v0

    .line 317
    .line 318
    move/from16 v0, v23

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_9
    move/from16 v22, v0

    .line 322
    .line 323
    const/4 v6, 0x0

    .line 324
    if-nez v4, :cond_a

    .line 325
    .line 326
    if-eqz v21, :cond_a

    .line 327
    .line 328
    invoke-virtual {v14, v15, v6, v6, v5}, Le2/g;->a(IZZZ)F

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    add-int/lit8 v6, v15, 0x1

    .line 333
    .line 334
    invoke-virtual {v14, v6, v5, v5, v5}, Le2/g;->a(IZZZ)F

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    move/from16 v21, v6

    .line 339
    .line 340
    goto :goto_a

    .line 341
    :cond_a
    invoke-virtual {v14, v15, v6, v6, v6}, Le2/g;->a(IZZZ)F

    .line 342
    .line 343
    .line 344
    move-result v21

    .line 345
    add-int/lit8 v0, v15, 0x1

    .line 346
    .line 347
    invoke-virtual {v14, v0, v5, v5, v6}, Le2/g;->a(IZZZ)F

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    :goto_b
    aput v21, v16, v7

    .line 352
    .line 353
    add-int/lit8 v21, v7, 0x1

    .line 354
    .line 355
    aput v17, v16, v21

    .line 356
    .line 357
    add-int/lit8 v21, v7, 0x2

    .line 358
    .line 359
    aput v0, v16, v21

    .line 360
    .line 361
    add-int/lit8 v0, v7, 0x3

    .line 362
    .line 363
    aput v18, v16, v0

    .line 364
    .line 365
    add-int/lit8 v7, v7, 0x4

    .line 366
    .line 367
    add-int/lit8 v15, v15, 0x1

    .line 368
    .line 369
    move/from16 v0, v22

    .line 370
    .line 371
    goto :goto_9

    .line 372
    :cond_b
    if-eq v12, v13, :cond_d

    .line 373
    .line 374
    add-int/lit8 v12, v12, 0x1

    .line 375
    .line 376
    move-object/from16 v6, p1

    .line 377
    .line 378
    move-object/from16 v0, v16

    .line 379
    .line 380
    move-wide/from16 v4, v19

    .line 381
    .line 382
    goto/16 :goto_8

    .line 383
    .line 384
    :cond_c
    move-object/from16 v16, v0

    .line 385
    .line 386
    move-wide/from16 v19, v4

    .line 387
    .line 388
    move-object/from16 p1, v6

    .line 389
    .line 390
    :cond_d
    iget v0, v2, Lgg/s;->g:I

    .line 391
    .line 392
    invoke-static/range {v19 .. v20}, Li2/m0;->d(J)I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    mul-int/lit8 v4, v4, 0x4

    .line 397
    .line 398
    add-int/2addr v4, v0

    .line 399
    iget v0, v2, Lgg/s;->g:I

    .line 400
    .line 401
    :goto_c
    if-ge v0, v4, :cond_e

    .line 402
    .line 403
    add-int/lit8 v5, v0, 0x1

    .line 404
    .line 405
    aget v6, v16, v5

    .line 406
    .line 407
    iget v7, v3, Lgg/r;->g:F

    .line 408
    .line 409
    add-float/2addr v6, v7

    .line 410
    aput v6, v16, v5

    .line 411
    .line 412
    add-int/lit8 v5, v0, 0x3

    .line 413
    .line 414
    aget v6, v16, v5

    .line 415
    .line 416
    add-float/2addr v6, v7

    .line 417
    aput v6, v16, v5

    .line 418
    .line 419
    add-int/lit8 v0, v0, 0x4

    .line 420
    .line 421
    goto :goto_c

    .line 422
    :cond_e
    iput v4, v2, Lgg/s;->g:I

    .line 423
    .line 424
    iget v0, v3, Lgg/r;->g:F

    .line 425
    .line 426
    invoke-virtual/range {p1 .. p1}, Li2/a;->b()F

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    add-float/2addr v2, v0

    .line 431
    iput v2, v3, Lgg/r;->g:F

    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :pswitch_1
    iget-object v0, v1, Lhb/c0;->i:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lc9/c0;

    .line 438
    .line 439
    iget-object v2, v1, Lhb/c0;->j:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v2, Lhb/i0;

    .line 442
    .line 443
    iget-object v3, v1, Lhb/c0;->k:Ljava/lang/Object;

    .line 444
    .line 445
    move-object v4, v3

    .line 446
    check-cast v4, Landroid/app/Activity;

    .line 447
    .line 448
    move-object/from16 v3, p1

    .line 449
    .line 450
    check-cast v3, Ljava/lang/Integer;

    .line 451
    .line 452
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    const/4 v5, 0x1

    .line 457
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    sget-object v7, Ltf/v;->g:Ltf/v;

    .line 462
    .line 463
    if-eq v3, v5, :cond_13

    .line 464
    .line 465
    const/4 v5, 0x2

    .line 466
    if-eq v3, v5, :cond_f

    .line 467
    .line 468
    const/4 v2, 0x0

    .line 469
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v0, v2, v7}, Lc9/c0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    goto/16 :goto_f

    .line 477
    .line 478
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    new-instance v7, Lsf/e;

    .line 486
    .line 487
    const-string v3, "\u5468\u4e00"

    .line 488
    .line 489
    invoke-direct {v7, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    const/4 v2, 0x3

    .line 493
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    new-instance v8, Lsf/e;

    .line 498
    .line 499
    const-string v3, "\u5468\u4e8c"

    .line 500
    .line 501
    invoke-direct {v8, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    const/4 v2, 0x4

    .line 505
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    new-instance v9, Lsf/e;

    .line 510
    .line 511
    const-string v3, "\u5468\u4e09"

    .line 512
    .line 513
    invoke-direct {v9, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    const/4 v2, 0x5

    .line 517
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    new-instance v10, Lsf/e;

    .line 522
    .line 523
    const-string v3, "\u5468\u56db"

    .line 524
    .line 525
    invoke-direct {v10, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    const/4 v2, 0x6

    .line 529
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    new-instance v11, Lsf/e;

    .line 534
    .line 535
    const-string v3, "\u5468\u4e94"

    .line 536
    .line 537
    invoke-direct {v11, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    const/4 v2, 0x7

    .line 541
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    new-instance v12, Lsf/e;

    .line 546
    .line 547
    const-string v5, "\u5468\u516d"

    .line 548
    .line 549
    invoke-direct {v12, v3, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    new-instance v13, Lsf/e;

    .line 553
    .line 554
    const-string v3, "\u5468\u65e5"

    .line 555
    .line 556
    invoke-direct {v13, v6, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    filled-new-array/range {v7 .. v13}, [Lsf/e;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    iget-wide v6, v1, Lhb/c0;->h:J

    .line 572
    .line 573
    invoke-virtual {v5, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v5, v2}, Ljava/util/Calendar;->get(I)I

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    invoke-static {v3}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    new-instance v6, Ljava/util/ArrayList;

    .line 585
    .line 586
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v5

    .line 593
    :cond_10
    :goto_d
    move-object v7, v5

    .line 594
    check-cast v7, Llg/c;

    .line 595
    .line 596
    iget-boolean v8, v7, Llg/c;->i:Z

    .line 597
    .line 598
    if-eqz v8, :cond_11

    .line 599
    .line 600
    invoke-virtual {v7}, Llg/c;->next()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    move-object v8, v7

    .line 605
    check-cast v8, Ljava/lang/Number;

    .line 606
    .line 607
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result v8

    .line 611
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v8

    .line 615
    check-cast v8, Lsf/e;

    .line 616
    .line 617
    iget-object v8, v8, Lsf/e;->g:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v8, Ljava/lang/Number;

    .line 620
    .line 621
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v8

    .line 625
    if-ne v8, v2, :cond_10

    .line 626
    .line 627
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    goto :goto_d

    .line 631
    :cond_11
    invoke-static {v6}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    new-instance v7, Ljava/util/ArrayList;

    .line 636
    .line 637
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 642
    .line 643
    .line 644
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 649
    .line 650
    .line 651
    move-result v5

    .line 652
    if-eqz v5, :cond_12

    .line 653
    .line 654
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v5

    .line 658
    check-cast v5, Lsf/e;

    .line 659
    .line 660
    iget-object v5, v5, Lsf/e;->h:Ljava/lang/Object;

    .line 661
    .line 662
    new-instance v6, Lsf/e;

    .line 663
    .line 664
    const-string v9, ""

    .line 665
    .line 666
    invoke-direct {v6, v5, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    goto :goto_e

    .line 673
    :cond_12
    new-instance v9, Lc9/i;

    .line 674
    .line 675
    invoke-direct {v9, v0, v3}, Lc9/i;-><init>(Lc9/c0;Ljava/util/List;)V

    .line 676
    .line 677
    .line 678
    new-instance v10, Lk/s1;

    .line 679
    .line 680
    const/4 v0, 0x7

    .line 681
    invoke-direct {v10, v0}, Lk/s1;-><init>(I)V

    .line 682
    .line 683
    .line 684
    const/16 v11, 0x120

    .line 685
    .line 686
    const-string v5, "\u9009\u62e9\u91cd\u590d\u65e5\u671f"

    .line 687
    .line 688
    const-string v6, ""

    .line 689
    .line 690
    invoke-static/range {v4 .. v11}, Lwb/y2;->Z1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Set;Lfg/l;Lfg/a;I)V

    .line 691
    .line 692
    .line 693
    goto :goto_f

    .line 694
    :cond_13
    invoke-virtual {v0, v6, v7}, Lc9/c0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    :goto_f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 698
    .line 699
    return-object v0

    .line 700
    nop

    .line 701
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
