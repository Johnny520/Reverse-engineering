.class public final Lf0/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lf0/a;

.field public final b:Lf0/n;

.field public final c:Ljava/lang/Object;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ln2/s;

.field public k:Li2/k0;

.field public l:Lb5/k;

.field public m:Le1/c;

.field public n:Le1/c;

.field public final o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field public final p:[F

.field public final q:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lf0/a;Lf0/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf0/r;->a:Lf0/a;

    .line 5
    .line 6
    iput-object p2, p0, Lf0/r;->b:Lf0/n;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lf0/r;->c:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 16
    .line 17
    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lf0/r;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 21
    .line 22
    invoke-static {}, Lf1/i0;->a()[F

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lf0/r;->p:[F

    .line 27
    .line 28
    new-instance p1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lf0/r;->q:Landroid/graphics/Matrix;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lf0/r;->b:Lf0/n;

    .line 4
    .line 5
    invoke-virtual {v1}, Lf0/n;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v1, Lf0/n;->b:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/view/inputmethod/InputMethodManager;->isActive(Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_19

    .line 16
    .line 17
    iget-object v2, v0, Lf0/r;->j:Ln2/s;

    .line 18
    .line 19
    if-eqz v2, :cond_19

    .line 20
    .line 21
    iget-object v2, v0, Lf0/r;->l:Lb5/k;

    .line 22
    .line 23
    if-eqz v2, :cond_19

    .line 24
    .line 25
    iget-object v2, v0, Lf0/r;->k:Li2/k0;

    .line 26
    .line 27
    if-eqz v2, :cond_19

    .line 28
    .line 29
    iget-object v2, v0, Lf0/r;->m:Le1/c;

    .line 30
    .line 31
    if-eqz v2, :cond_19

    .line 32
    .line 33
    iget-object v2, v0, Lf0/r;->n:Le1/c;

    .line 34
    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    goto/16 :goto_11

    .line 38
    .line 39
    :cond_0
    iget-object v2, v0, Lf0/r;->p:[F

    .line 40
    .line 41
    invoke-static {v2}, Lf1/i0;->d([F)V

    .line 42
    .line 43
    .line 44
    iget-object v4, v0, Lf0/r;->a:Lf0/a;

    .line 45
    .line 46
    iget-object v4, v4, Lf0/a;->n:Lf0/p;

    .line 47
    .line 48
    iget-object v4, v4, Lf0/p;->x:Li0/j1;

    .line 49
    .line 50
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lv1/t;

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    invoke-interface {v4}, Lv1/t;->C()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v4, 0x0

    .line 66
    :goto_0
    if-nez v4, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-interface {v4, v2}, Lv1/t;->E([F)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    iget-object v4, v0, Lf0/r;->n:Le1/c;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget v4, v4, Le1/c;->a:F

    .line 78
    .line 79
    neg-float v4, v4

    .line 80
    iget-object v5, v0, Lf0/r;->n:Le1/c;

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget v5, v5, Le1/c;->b:F

    .line 86
    .line 87
    neg-float v5, v5

    .line 88
    invoke-static {v2, v4, v5}, Lf1/i0;->f([FFF)V

    .line 89
    .line 90
    .line 91
    iget-object v4, v0, Lf0/r;->q:Landroid/graphics/Matrix;

    .line 92
    .line 93
    invoke-static {v4, v2}, Lf1/c0;->p(Landroid/graphics/Matrix;[F)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v0, Lf0/r;->j:Ln2/s;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-wide v5, v2, Ln2/s;->b:J

    .line 102
    .line 103
    iget-object v7, v0, Lf0/r;->l:Lb5/k;

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v8, v0, Lf0/r;->k:Li2/k0;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v9, v8, Li2/k0;->b:Li2/o;

    .line 114
    .line 115
    iget-object v10, v0, Lf0/r;->m:Le1/c;

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget v11, v10, Le1/c;->d:F

    .line 121
    .line 122
    iget v12, v10, Le1/c;->b:F

    .line 123
    .line 124
    iget-object v13, v0, Lf0/r;->n:Le1/c;

    .line 125
    .line 126
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-boolean v14, v0, Lf0/r;->f:Z

    .line 130
    .line 131
    iget-boolean v15, v0, Lf0/r;->g:Z

    .line 132
    .line 133
    move-object/from16 v16, v1

    .line 134
    .line 135
    iget-boolean v1, v0, Lf0/r;->h:Z

    .line 136
    .line 137
    move/from16 v17, v1

    .line 138
    .line 139
    iget-boolean v1, v0, Lf0/r;->i:Z

    .line 140
    .line 141
    move/from16 v25, v1

    .line 142
    .line 143
    iget-object v1, v0, Lf0/r;->o:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 144
    .line 145
    invoke-virtual {v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->reset()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v4}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setMatrix(Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 149
    .line 150
    .line 151
    iget-object v4, v2, Ln2/s;->c:Li2/m0;

    .line 152
    .line 153
    move-wide/from16 v18, v5

    .line 154
    .line 155
    invoke-static/range {v18 .. v19}, Li2/m0;->f(J)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    invoke-static/range {v18 .. v19}, Li2/m0;->e(J)I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    invoke-virtual {v1, v5, v6}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setSelectionRange(II)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 164
    .line 165
    .line 166
    sget-object v6, Lt2/j;->h:Lt2/j;

    .line 167
    .line 168
    move-object/from16 v18, v1

    .line 169
    .line 170
    const/16 v26, 0x1

    .line 171
    .line 172
    if-eqz v14, :cond_b

    .line 173
    .line 174
    if-gez v5, :cond_4

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_4
    invoke-virtual {v7, v5}, Lb5/k;->l(I)I

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8, v5}, Li2/k0;->c(I)Le1/c;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    iget v1, v14, Le1/c;->a:F

    .line 185
    .line 186
    move/from16 v27, v11

    .line 187
    .line 188
    move/from16 v28, v12

    .line 189
    .line 190
    iget-wide v11, v8, Li2/k0;->c:J

    .line 191
    .line 192
    const/16 v19, 0x20

    .line 193
    .line 194
    shr-long v11, v11, v19

    .line 195
    .line 196
    long-to-int v11, v11

    .line 197
    int-to-float v11, v11

    .line 198
    const/4 v12, 0x0

    .line 199
    invoke-static {v1, v12, v11}, Lr9/e0;->q(FFF)F

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    iget v11, v14, Le1/c;->b:F

    .line 204
    .line 205
    invoke-static {v10, v1, v11}, Lf0/q;->f(Le1/c;FF)Z

    .line 206
    .line 207
    .line 208
    move-result v11

    .line 209
    iget v12, v14, Le1/c;->d:F

    .line 210
    .line 211
    invoke-static {v10, v1, v12}, Lf0/q;->f(Le1/c;FF)Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    invoke-virtual {v8, v5}, Li2/k0;->a(I)Lt2/j;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    if-ne v5, v6, :cond_5

    .line 220
    .line 221
    move/from16 v5, v26

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_5
    const/4 v5, 0x0

    .line 225
    :goto_2
    if-nez v11, :cond_7

    .line 226
    .line 227
    if-eqz v12, :cond_6

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_6
    const/16 v19, 0x0

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_7
    :goto_3
    move/from16 v19, v26

    .line 234
    .line 235
    :goto_4
    if-eqz v11, :cond_8

    .line 236
    .line 237
    if-nez v12, :cond_9

    .line 238
    .line 239
    :cond_8
    or-int/lit8 v19, v19, 0x2

    .line 240
    .line 241
    :cond_9
    if-eqz v5, :cond_a

    .line 242
    .line 243
    or-int/lit8 v19, v19, 0x4

    .line 244
    .line 245
    :cond_a
    move/from16 v23, v19

    .line 246
    .line 247
    iget v5, v14, Le1/c;->b:F

    .line 248
    .line 249
    iget v11, v14, Le1/c;->d:F

    .line 250
    .line 251
    move/from16 v22, v11

    .line 252
    .line 253
    move/from16 v19, v1

    .line 254
    .line 255
    move/from16 v20, v5

    .line 256
    .line 257
    move/from16 v21, v11

    .line 258
    .line 259
    invoke-virtual/range {v18 .. v23}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setInsertionMarkerLocation(FFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_b
    :goto_5
    move/from16 v27, v11

    .line 264
    .line 265
    move/from16 v28, v12

    .line 266
    .line 267
    :goto_6
    move-object/from16 v1, v18

    .line 268
    .line 269
    if-eqz v15, :cond_15

    .line 270
    .line 271
    const/4 v5, -0x1

    .line 272
    if-eqz v4, :cond_c

    .line 273
    .line 274
    iget-wide v11, v4, Li2/m0;->a:J

    .line 275
    .line 276
    invoke-static {v11, v12}, Li2/m0;->f(J)I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    goto :goto_7

    .line 281
    :cond_c
    move v11, v5

    .line 282
    :goto_7
    if-eqz v4, :cond_d

    .line 283
    .line 284
    iget-wide v4, v4, Li2/m0;->a:J

    .line 285
    .line 286
    invoke-static {v4, v5}, Li2/m0;->e(J)I

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    :cond_d
    if-ltz v11, :cond_15

    .line 291
    .line 292
    if-ge v11, v5, :cond_15

    .line 293
    .line 294
    iget-object v2, v2, Ln2/s;->a:Li2/g;

    .line 295
    .line 296
    iget-object v2, v2, Li2/g;->h:Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {v2, v11, v5}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-virtual {v1, v11, v2}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->setComposingText(ILjava/lang/CharSequence;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7, v11}, Lb5/k;->l(I)I

    .line 306
    .line 307
    .line 308
    invoke-virtual {v7, v5}, Lb5/k;->l(I)I

    .line 309
    .line 310
    .line 311
    sub-int v2, v5, v11

    .line 312
    .line 313
    mul-int/lit8 v2, v2, 0x4

    .line 314
    .line 315
    new-array v2, v2, [F

    .line 316
    .line 317
    invoke-static {v11, v5}, Li2/e0;->b(II)J

    .line 318
    .line 319
    .line 320
    move-result-wide v14

    .line 321
    invoke-virtual {v9, v14, v15, v2}, Li2/o;->a(J[F)V

    .line 322
    .line 323
    .line 324
    move v4, v11

    .line 325
    :goto_8
    if-ge v4, v5, :cond_15

    .line 326
    .line 327
    invoke-virtual {v7, v4}, Lb5/k;->l(I)I

    .line 328
    .line 329
    .line 330
    sub-int v12, v4, v11

    .line 331
    .line 332
    mul-int/lit8 v12, v12, 0x4

    .line 333
    .line 334
    aget v14, v2, v12

    .line 335
    .line 336
    add-int/lit8 v15, v12, 0x1

    .line 337
    .line 338
    aget v15, v2, v15

    .line 339
    .line 340
    add-int/lit8 v18, v12, 0x2

    .line 341
    .line 342
    move-object/from16 v19, v1

    .line 343
    .line 344
    aget v1, v2, v18

    .line 345
    .line 346
    add-int/lit8 v12, v12, 0x3

    .line 347
    .line 348
    aget v12, v2, v12

    .line 349
    .line 350
    move-object/from16 v29, v2

    .line 351
    .line 352
    iget v2, v10, Le1/c;->a:F

    .line 353
    .line 354
    cmpg-float v2, v2, v1

    .line 355
    .line 356
    if-gez v2, :cond_e

    .line 357
    .line 358
    move/from16 v18, v26

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_e
    const/16 v18, 0x0

    .line 362
    .line 363
    :goto_9
    iget v2, v10, Le1/c;->c:F

    .line 364
    .line 365
    cmpg-float v2, v14, v2

    .line 366
    .line 367
    if-gez v2, :cond_f

    .line 368
    .line 369
    move/from16 v2, v26

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_f
    const/4 v2, 0x0

    .line 373
    :goto_a
    and-int v2, v18, v2

    .line 374
    .line 375
    cmpg-float v18, v28, v12

    .line 376
    .line 377
    if-gez v18, :cond_10

    .line 378
    .line 379
    move/from16 v18, v26

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_10
    const/16 v18, 0x0

    .line 383
    .line 384
    :goto_b
    and-int v2, v2, v18

    .line 385
    .line 386
    cmpg-float v18, v15, v27

    .line 387
    .line 388
    if-gez v18, :cond_11

    .line 389
    .line 390
    move/from16 v18, v26

    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_11
    const/16 v18, 0x0

    .line 394
    .line 395
    :goto_c
    and-int v2, v2, v18

    .line 396
    .line 397
    invoke-static {v10, v14, v15}, Lf0/q;->f(Le1/c;FF)Z

    .line 398
    .line 399
    .line 400
    move-result v18

    .line 401
    if-eqz v18, :cond_13

    .line 402
    .line 403
    invoke-static {v10, v1, v12}, Lf0/q;->f(Le1/c;FF)Z

    .line 404
    .line 405
    .line 406
    move-result v18

    .line 407
    if-nez v18, :cond_12

    .line 408
    .line 409
    goto :goto_e

    .line 410
    :cond_12
    :goto_d
    move/from16 v22, v1

    .line 411
    .line 412
    goto :goto_f

    .line 413
    :cond_13
    :goto_e
    or-int/lit8 v2, v2, 0x2

    .line 414
    .line 415
    goto :goto_d

    .line 416
    :goto_f
    invoke-virtual {v8, v4}, Li2/k0;->a(I)Lt2/j;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    if-ne v1, v6, :cond_14

    .line 421
    .line 422
    or-int/lit8 v2, v2, 0x4

    .line 423
    .line 424
    :cond_14
    move/from16 v24, v2

    .line 425
    .line 426
    move/from16 v23, v12

    .line 427
    .line 428
    move/from16 v20, v14

    .line 429
    .line 430
    move/from16 v21, v15

    .line 431
    .line 432
    move-object/from16 v18, v19

    .line 433
    .line 434
    move/from16 v19, v4

    .line 435
    .line 436
    invoke-virtual/range {v18 .. v24}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addCharacterBounds(IFFFFI)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 437
    .line 438
    .line 439
    move-object/from16 v1, v18

    .line 440
    .line 441
    add-int/lit8 v4, v19, 0x1

    .line 442
    .line 443
    move-object/from16 v2, v29

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :cond_15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 447
    .line 448
    const/16 v4, 0x21

    .line 449
    .line 450
    if-lt v2, v4, :cond_16

    .line 451
    .line 452
    if-eqz v17, :cond_16

    .line 453
    .line 454
    invoke-static {}, Lai/a;->m()Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-static {v13}, Lf1/c0;->u(Le1/c;)Landroid/graphics/RectF;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    invoke-static {v4, v5}, Lai/a;->n(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-static {v13}, Lf1/c0;->u(Le1/c;)Landroid/graphics/RectF;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    invoke-static {v4, v5}, Lai/a;->D(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    invoke-static {v4}, Lai/a;->o(Landroid/view/inputmethod/EditorBoundsInfo$Builder;)Landroid/view/inputmethod/EditorBoundsInfo;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    invoke-static {v1, v4}, Lai/a;->l(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroid/view/inputmethod/EditorBoundsInfo;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 479
    .line 480
    .line 481
    :cond_16
    const/16 v4, 0x22

    .line 482
    .line 483
    if-lt v2, v4, :cond_18

    .line 484
    .line 485
    if-eqz v25, :cond_18

    .line 486
    .line 487
    invoke-virtual {v10}, Le1/c;->f()Z

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    if-nez v2, :cond_18

    .line 492
    .line 493
    iget v2, v9, Li2/o;->f:I

    .line 494
    .line 495
    add-int/lit8 v2, v2, -0x1

    .line 496
    .line 497
    if-gez v2, :cond_17

    .line 498
    .line 499
    const/4 v2, 0x0

    .line 500
    :cond_17
    move/from16 v4, v28

    .line 501
    .line 502
    invoke-virtual {v9, v4}, Li2/o;->e(F)I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    const/4 v5, 0x0

    .line 507
    invoke-static {v4, v5, v2}, Lr9/e0;->r(III)I

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    move/from16 v6, v27

    .line 512
    .line 513
    invoke-virtual {v9, v6}, Li2/o;->e(F)I

    .line 514
    .line 515
    .line 516
    move-result v6

    .line 517
    invoke-static {v6, v5, v2}, Lr9/e0;->r(III)I

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-gt v4, v2, :cond_18

    .line 522
    .line 523
    :goto_10
    invoke-virtual {v8, v4}, Li2/k0;->e(I)F

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    invoke-virtual {v9, v4}, Li2/o;->f(I)F

    .line 528
    .line 529
    .line 530
    move-result v6

    .line 531
    invoke-virtual {v8, v4}, Li2/k0;->f(I)F

    .line 532
    .line 533
    .line 534
    move-result v7

    .line 535
    invoke-virtual {v9, v4}, Li2/o;->b(I)F

    .line 536
    .line 537
    .line 538
    move-result v10

    .line 539
    invoke-static {v1, v5, v6, v7, v10}, Lb0/a0;->n(Landroid/view/inputmethod/CursorAnchorInfo$Builder;FFFF)V

    .line 540
    .line 541
    .line 542
    if-eq v4, v2, :cond_18

    .line 543
    .line 544
    add-int/lit8 v4, v4, 0x1

    .line 545
    .line 546
    goto :goto_10

    .line 547
    :cond_18
    invoke-virtual {v1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->build()Landroid/view/inputmethod/CursorAnchorInfo;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-virtual/range {v16 .. v16}, Lf0/n;->a()Landroid/view/inputmethod/InputMethodManager;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    invoke-virtual {v2, v3, v1}, Landroid/view/inputmethod/InputMethodManager;->updateCursorAnchorInfo(Landroid/view/View;Landroid/view/inputmethod/CursorAnchorInfo;)V

    .line 556
    .line 557
    .line 558
    const/4 v5, 0x0

    .line 559
    iput-boolean v5, v0, Lf0/r;->e:Z

    .line 560
    .line 561
    :cond_19
    :goto_11
    return-void
.end method
