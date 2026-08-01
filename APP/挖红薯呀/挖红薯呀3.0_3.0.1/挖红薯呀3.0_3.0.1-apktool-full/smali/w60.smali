.class public abstract Lw60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lmc1;


# direct methods
.method public static final A(Lnr0;JJ)Z
    .locals 10

    .line 1
    iget v0, p0, Lnr0;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-wide v3, p0, Lnr0;->c:J

    .line 11
    .line 12
    const/16 p0, 0x20

    .line 13
    .line 14
    shr-long v5, v3, p0

    .line 15
    .line 16
    long-to-int v5, v5

    .line 17
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const-wide v6, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v3, v6

    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    shr-long v8, p3, p0

    .line 33
    .line 34
    long-to-int v4, v8

    .line 35
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    int-to-float v0, v0

    .line 40
    mul-float/2addr v4, v0

    .line 41
    shr-long v8, p1, p0

    .line 42
    .line 43
    long-to-int p0, v8

    .line 44
    int-to-float p0, p0

    .line 45
    add-float/2addr p0, v4

    .line 46
    and-long/2addr p3, v6

    .line 47
    long-to-int p3, p3

    .line 48
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    mul-float/2addr p3, v0

    .line 53
    and-long/2addr p1, v6

    .line 54
    long-to-int p1, p1

    .line 55
    int-to-float p1, p1

    .line 56
    add-float/2addr p1, p3

    .line 57
    neg-float p2, v4

    .line 58
    cmpg-float p2, v5, p2

    .line 59
    .line 60
    if-gez p2, :cond_1

    .line 61
    .line 62
    move p2, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move p2, v1

    .line 65
    :goto_1
    cmpl-float p0, v5, p0

    .line 66
    .line 67
    if-lez p0, :cond_2

    .line 68
    .line 69
    move p0, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move p0, v1

    .line 72
    :goto_2
    or-int/2addr p0, p2

    .line 73
    neg-float p2, p3

    .line 74
    cmpg-float p2, v3, p2

    .line 75
    .line 76
    if-gez p2, :cond_3

    .line 77
    .line 78
    move p2, v2

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    move p2, v1

    .line 81
    :goto_3
    or-int/2addr p0, p2

    .line 82
    cmpl-float p1, v3, p1

    .line 83
    .line 84
    if-lez p1, :cond_4

    .line 85
    .line 86
    move v1, v2

    .line 87
    :cond_4
    or-int/2addr p0, v1

    .line 88
    return p0
.end method

.method public static B(Lz11;ILz11;ZZZ)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p1}, Lz11;->u(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int v4, v1, v3

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p1}, Lz11;->f(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-virtual {v0, v4}, Lz11;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    sub-int v7, v6, v5

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-ltz v1, :cond_0

    .line 25
    .line 26
    iget-object v10, v0, Lz11;->b:[I

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Lz11;->r(I)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    mul-int/lit8 v11, v11, 0x5

    .line 33
    .line 34
    add-int/2addr v11, v9

    .line 35
    aget v10, v10, v11

    .line 36
    .line 37
    const/high16 v11, 0xc000000

    .line 38
    .line 39
    and-int/2addr v10, v11

    .line 40
    if-eqz v10, :cond_0

    .line 41
    .line 42
    move v10, v9

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v10, 0x0

    .line 45
    :goto_0
    invoke-virtual {v2, v3}, Lz11;->w(I)V

    .line 46
    .line 47
    .line 48
    iget v11, v2, Lz11;->t:I

    .line 49
    .line 50
    invoke-virtual {v2, v7, v11}, Lz11;->x(II)V

    .line 51
    .line 52
    .line 53
    iget v11, v0, Lz11;->g:I

    .line 54
    .line 55
    if-ge v11, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Lz11;->B(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget v11, v0, Lz11;->k:I

    .line 61
    .line 62
    if-ge v11, v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, v6, v4}, Lz11;->C(II)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v6, v2, Lz11;->b:[I

    .line 68
    .line 69
    iget v11, v2, Lz11;->t:I

    .line 70
    .line 71
    iget-object v12, v0, Lz11;->b:[I

    .line 72
    .line 73
    mul-int/lit8 v13, v11, 0x5

    .line 74
    .line 75
    mul-int/lit8 v14, v1, 0x5

    .line 76
    .line 77
    mul-int/lit8 v15, v4, 0x5

    .line 78
    .line 79
    invoke-static {v12, v6, v13, v14, v15}, Lf9;->a0([I[IIII)V

    .line 80
    .line 81
    .line 82
    iget-object v12, v2, Lz11;->c:[Ljava/lang/Object;

    .line 83
    .line 84
    iget v14, v2, Lz11;->i:I

    .line 85
    .line 86
    iget-object v15, v0, Lz11;->c:[Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {v15, v5, v12, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    iget v15, v2, Lz11;->v:I

    .line 92
    .line 93
    add-int/lit8 v16, v13, 0x2

    .line 94
    .line 95
    aput v15, v6, v16

    .line 96
    .line 97
    sub-int v16, v11, v1

    .line 98
    .line 99
    add-int v8, v11, v3

    .line 100
    .line 101
    invoke-virtual {v2, v6, v11}, Lz11;->g([II)I

    .line 102
    .line 103
    .line 104
    move-result v18

    .line 105
    sub-int v18, v14, v18

    .line 106
    .line 107
    move/from16 v19, v9

    .line 108
    .line 109
    iget v9, v2, Lz11;->m:I

    .line 110
    .line 111
    move/from16 v20, v9

    .line 112
    .line 113
    iget v9, v2, Lz11;->l:I

    .line 114
    .line 115
    array-length v12, v12

    .line 116
    move/from16 v21, v10

    .line 117
    .line 118
    move/from16 v10, v20

    .line 119
    .line 120
    move/from16 v20, v13

    .line 121
    .line 122
    move v13, v11

    .line 123
    :goto_1
    if-ge v13, v8, :cond_6

    .line 124
    .line 125
    if-eq v13, v11, :cond_3

    .line 126
    .line 127
    mul-int/lit8 v22, v13, 0x5

    .line 128
    .line 129
    add-int/lit8 v22, v22, 0x2

    .line 130
    .line 131
    aget v23, v6, v22

    .line 132
    .line 133
    add-int v23, v23, v16

    .line 134
    .line 135
    aput v23, v6, v22

    .line 136
    .line 137
    :cond_3
    invoke-virtual {v2, v6, v13}, Lz11;->g([II)I

    .line 138
    .line 139
    .line 140
    move-result v22

    .line 141
    move-object/from16 v23, v6

    .line 142
    .line 143
    add-int v6, v22, v18

    .line 144
    .line 145
    if-ge v10, v13, :cond_4

    .line 146
    .line 147
    move/from16 v22, v11

    .line 148
    .line 149
    const/4 v11, 0x0

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move/from16 v22, v11

    .line 152
    .line 153
    iget v11, v2, Lz11;->k:I

    .line 154
    .line 155
    :goto_2
    invoke-static {v6, v11, v9, v12}, Lz11;->i(IIII)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    mul-int/lit8 v11, v13, 0x5

    .line 160
    .line 161
    add-int/lit8 v11, v11, 0x4

    .line 162
    .line 163
    aput v6, v23, v11

    .line 164
    .line 165
    if-ne v13, v10, :cond_5

    .line 166
    .line 167
    add-int/lit8 v10, v10, 0x1

    .line 168
    .line 169
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 170
    .line 171
    move/from16 v11, v22

    .line 172
    .line 173
    move-object/from16 v6, v23

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_6
    move-object/from16 v23, v6

    .line 177
    .line 178
    iput v10, v2, Lz11;->m:I

    .line 179
    .line 180
    iget-object v6, v0, Lz11;->d:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v0}, Lz11;->p()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-static {v6, v1, v9}, Ly11;->a(Ljava/util/ArrayList;II)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    iget-object v9, v0, Lz11;->d:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v0}, Lz11;->p()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-static {v9, v4, v10}, Ly11;->a(Ljava/util/ArrayList;II)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-ge v6, v4, :cond_8

    .line 201
    .line 202
    iget-object v9, v0, Lz11;->d:Ljava/util/ArrayList;

    .line 203
    .line 204
    new-instance v10, Ljava/util/ArrayList;

    .line 205
    .line 206
    sub-int v11, v4, v6

    .line 207
    .line 208
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    move v11, v6

    .line 212
    :goto_3
    if-ge v11, v4, :cond_7

    .line 213
    .line 214
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    check-cast v12, Lu2;

    .line 219
    .line 220
    iget v13, v12, Lu2;->a:I

    .line 221
    .line 222
    add-int v13, v13, v16

    .line 223
    .line 224
    iput v13, v12, Lu2;->a:I

    .line 225
    .line 226
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    add-int/lit8 v11, v11, 0x1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_7
    iget-object v11, v2, Lz11;->d:Ljava/util/ArrayList;

    .line 233
    .line 234
    iget v12, v2, Lz11;->t:I

    .line 235
    .line 236
    invoke-virtual {v2}, Lz11;->p()I

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    invoke-static {v11, v12, v13}, Ly11;->a(Ljava/util/ArrayList;II)I

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    iget-object v12, v2, Lz11;->d:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v12, v11, v10}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_8
    sget-object v10, Lhs;->d:Lhs;

    .line 258
    .line 259
    :goto_4
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_9

    .line 264
    .line 265
    iget-object v4, v0, Lz11;->e:Ljava/util/HashMap;

    .line 266
    .line 267
    iget-object v6, v2, Lz11;->e:Ljava/util/HashMap;

    .line 268
    .line 269
    if-eqz v4, :cond_9

    .line 270
    .line 271
    if-eqz v6, :cond_9

    .line 272
    .line 273
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    const/4 v9, 0x0

    .line 278
    :goto_5
    if-ge v9, v6, :cond_9

    .line 279
    .line 280
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    check-cast v11, Lu2;

    .line 285
    .line 286
    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    check-cast v11, Ley;

    .line 291
    .line 292
    add-int/lit8 v9, v9, 0x1

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_9
    iget v4, v2, Lz11;->v:I

    .line 296
    .line 297
    invoke-virtual {v2, v15}, Lz11;->O(I)Ley;

    .line 298
    .line 299
    .line 300
    iget-object v4, v0, Lz11;->b:[I

    .line 301
    .line 302
    invoke-virtual {v0, v4, v1}, Lz11;->E([II)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez p5, :cond_a

    .line 307
    .line 308
    const/16 v17, 0x0

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_a
    if-eqz p3, :cond_e

    .line 312
    .line 313
    if-ltz v4, :cond_b

    .line 314
    .line 315
    move/from16 v17, v19

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_b
    const/16 v17, 0x0

    .line 319
    .line 320
    :goto_6
    if-eqz v17, :cond_c

    .line 321
    .line 322
    invoke-virtual {v0}, Lz11;->P()V

    .line 323
    .line 324
    .line 325
    iget v3, v0, Lz11;->t:I

    .line 326
    .line 327
    sub-int/2addr v4, v3

    .line 328
    invoke-virtual {v0, v4}, Lz11;->a(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Lz11;->P()V

    .line 332
    .line 333
    .line 334
    :cond_c
    iget v3, v0, Lz11;->t:I

    .line 335
    .line 336
    sub-int/2addr v1, v3

    .line 337
    invoke-virtual {v0, v1}, Lz11;->a(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Lz11;->H()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v17, :cond_d

    .line 345
    .line 346
    invoke-virtual {v0}, Lz11;->M()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Lz11;->j()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Lz11;->M()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Lz11;->j()V

    .line 356
    .line 357
    .line 358
    :cond_d
    move/from16 v17, v1

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_e
    invoke-virtual {v0, v1, v3}, Lz11;->I(II)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    add-int/lit8 v1, v1, -0x1

    .line 366
    .line 367
    invoke-virtual {v0, v5, v7, v1}, Lz11;->J(III)V

    .line 368
    .line 369
    .line 370
    move/from16 v17, v3

    .line 371
    .line 372
    :goto_7
    if-eqz v17, :cond_f

    .line 373
    .line 374
    const-string v0, "Unexpectedly removed anchors"

    .line 375
    .line 376
    invoke-static {v0}, Lqi;->a(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :cond_f
    iget v0, v2, Lz11;->o:I

    .line 380
    .line 381
    add-int/lit8 v13, v20, 0x1

    .line 382
    .line 383
    aget v1, v23, v13

    .line 384
    .line 385
    const/high16 v3, 0x40000000    # 2.0f

    .line 386
    .line 387
    and-int/2addr v3, v1

    .line 388
    if-eqz v3, :cond_10

    .line 389
    .line 390
    move/from16 v9, v19

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_10
    const v3, 0x3ffffff

    .line 394
    .line 395
    .line 396
    and-int v9, v1, v3

    .line 397
    .line 398
    :goto_8
    add-int/2addr v0, v9

    .line 399
    iput v0, v2, Lz11;->o:I

    .line 400
    .line 401
    if-eqz p4, :cond_11

    .line 402
    .line 403
    iput v8, v2, Lz11;->t:I

    .line 404
    .line 405
    add-int/2addr v14, v7

    .line 406
    iput v14, v2, Lz11;->i:I

    .line 407
    .line 408
    :cond_11
    if-eqz v21, :cond_12

    .line 409
    .line 410
    invoke-virtual {v2, v15}, Lz11;->T(I)V

    .line 411
    .line 412
    .line 413
    :cond_12
    return-object v10
.end method

.method public static final C(Ldv;Lrp;)Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [Ldv;

    .line 4
    .line 5
    iget-object v2, p0, Loe0;->d:Loe0;

    .line 6
    .line 7
    iget-boolean v2, v2, Loe0;->q:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, "visitChildren called on an unattached node"

    .line 12
    .line 13
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Lsh0;

    .line 17
    .line 18
    new-array v3, v0, [Loe0;

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Loe0;->d:Loe0;

    .line 24
    .line 25
    iget-object v3, p0, Loe0;->i:Loe0;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v2, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    move p0, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    iget v3, v2, Lsh0;->f:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lsh0;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Loe0;

    .line 51
    .line 52
    iget v6, v3, Loe0;->g:I

    .line 53
    .line 54
    and-int/lit16 v6, v6, 0x400

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    invoke-static {v2, v3}, Lpf1;->e(Lsh0;Loe0;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_2
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget v6, v3, Loe0;->f:I

    .line 65
    .line 66
    and-int/lit16 v6, v6, 0x400

    .line 67
    .line 68
    if-eqz v6, :cond_c

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v7, v6

    .line 72
    :goto_3
    if-eqz v3, :cond_2

    .line 73
    .line 74
    instance-of v8, v3, Ldv;

    .line 75
    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    check-cast v3, Ldv;

    .line 79
    .line 80
    add-int/lit8 v8, p0, 0x1

    .line 81
    .line 82
    array-length v9, v1

    .line 83
    if-ge v9, v8, :cond_4

    .line 84
    .line 85
    array-length v9, v1

    .line 86
    mul-int/lit8 v10, v9, 0x2

    .line 87
    .line 88
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    new-array v10, v10, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1, v4, v10, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    move-object v1, v10

    .line 98
    :cond_4
    aput-object v3, v1, p0

    .line 99
    .line 100
    move p0, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget v8, v3, Loe0;->f:I

    .line 103
    .line 104
    and-int/lit16 v8, v8, 0x400

    .line 105
    .line 106
    if-eqz v8, :cond_b

    .line 107
    .line 108
    instance-of v8, v3, Lsm;

    .line 109
    .line 110
    if-eqz v8, :cond_b

    .line 111
    .line 112
    move-object v8, v3

    .line 113
    check-cast v8, Lsm;

    .line 114
    .line 115
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 116
    .line 117
    move v9, v4

    .line 118
    :goto_4
    if-eqz v8, :cond_a

    .line 119
    .line 120
    iget v10, v8, Loe0;->f:I

    .line 121
    .line 122
    and-int/lit16 v10, v10, 0x400

    .line 123
    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    if-ne v9, v5, :cond_6

    .line 129
    .line 130
    move-object v3, v8

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-nez v7, :cond_7

    .line 133
    .line 134
    new-instance v7, Lsh0;

    .line 135
    .line 136
    new-array v10, v0, [Loe0;

    .line 137
    .line 138
    invoke-direct {v7, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    if-eqz v3, :cond_8

    .line 142
    .line 143
    invoke-virtual {v7, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v3, v6

    .line 147
    :cond_8
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    :goto_5
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-ne v9, v5, :cond_b

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_b
    :goto_6
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_3

    .line 161
    :cond_c
    iget-object v3, v3, Loe0;->i:Loe0;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_d
    sget-object v0, Lev;->b:Lev;

    .line 165
    .line 166
    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 167
    .line 168
    .line 169
    sub-int/2addr p0, v5

    .line 170
    array-length v0, v1

    .line 171
    if-ge p0, v0, :cond_f

    .line 172
    .line 173
    :goto_7
    if-ltz p0, :cond_f

    .line 174
    .line 175
    aget-object v0, v1, p0

    .line 176
    .line 177
    check-cast v0, Ldv;

    .line 178
    .line 179
    invoke-static {v0}, Li4;->t(Ldv;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_e

    .line 184
    .line 185
    invoke-static {v0, p1}, Lw60;->h(Ldv;Lrp;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    return v5

    .line 192
    :cond_e
    add-int/lit8 p0, p0, -0x1

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_f
    return v4
.end method

.method public static final D(Ldv;Lrp;)Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [Ldv;

    .line 4
    .line 5
    iget-object v2, p0, Loe0;->d:Loe0;

    .line 6
    .line 7
    iget-boolean v2, v2, Loe0;->q:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, "visitChildren called on an unattached node"

    .line 12
    .line 13
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Lsh0;

    .line 17
    .line 18
    new-array v3, v0, [Loe0;

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Loe0;->d:Loe0;

    .line 24
    .line 25
    iget-object v3, p0, Loe0;->i:Loe0;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v2, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    move p0, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    iget v3, v2, Lsh0;->f:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lsh0;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Loe0;

    .line 51
    .line 52
    iget v6, v3, Loe0;->g:I

    .line 53
    .line 54
    and-int/lit16 v6, v6, 0x400

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    invoke-static {v2, v3}, Lpf1;->e(Lsh0;Loe0;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_2
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget v6, v3, Loe0;->f:I

    .line 65
    .line 66
    and-int/lit16 v6, v6, 0x400

    .line 67
    .line 68
    if-eqz v6, :cond_c

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v7, v6

    .line 72
    :goto_3
    if-eqz v3, :cond_2

    .line 73
    .line 74
    instance-of v8, v3, Ldv;

    .line 75
    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    check-cast v3, Ldv;

    .line 79
    .line 80
    add-int/lit8 v8, p0, 0x1

    .line 81
    .line 82
    array-length v9, v1

    .line 83
    if-ge v9, v8, :cond_4

    .line 84
    .line 85
    array-length v9, v1

    .line 86
    mul-int/lit8 v10, v9, 0x2

    .line 87
    .line 88
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    new-array v10, v10, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1, v4, v10, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    move-object v1, v10

    .line 98
    :cond_4
    aput-object v3, v1, p0

    .line 99
    .line 100
    move p0, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget v8, v3, Loe0;->f:I

    .line 103
    .line 104
    and-int/lit16 v8, v8, 0x400

    .line 105
    .line 106
    if-eqz v8, :cond_b

    .line 107
    .line 108
    instance-of v8, v3, Lsm;

    .line 109
    .line 110
    if-eqz v8, :cond_b

    .line 111
    .line 112
    move-object v8, v3

    .line 113
    check-cast v8, Lsm;

    .line 114
    .line 115
    iget-object v8, v8, Lsm;->s:Loe0;

    .line 116
    .line 117
    move v9, v4

    .line 118
    :goto_4
    if-eqz v8, :cond_a

    .line 119
    .line 120
    iget v10, v8, Loe0;->f:I

    .line 121
    .line 122
    and-int/lit16 v10, v10, 0x400

    .line 123
    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    if-ne v9, v5, :cond_6

    .line 129
    .line 130
    move-object v3, v8

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-nez v7, :cond_7

    .line 133
    .line 134
    new-instance v7, Lsh0;

    .line 135
    .line 136
    new-array v10, v0, [Loe0;

    .line 137
    .line 138
    invoke-direct {v7, v10}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    if-eqz v3, :cond_8

    .line 142
    .line 143
    invoke-virtual {v7, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v3, v6

    .line 147
    :cond_8
    invoke-virtual {v7, v8}, Lsh0;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    :goto_5
    iget-object v8, v8, Loe0;->i:Loe0;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-ne v9, v5, :cond_b

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_b
    :goto_6
    invoke-static {v7}, Lpf1;->f(Lsh0;)Loe0;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_3

    .line 161
    :cond_c
    iget-object v3, v3, Loe0;->i:Loe0;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_d
    sget-object v0, Lev;->b:Lev;

    .line 165
    .line 166
    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 167
    .line 168
    .line 169
    move v0, v4

    .line 170
    :goto_7
    if-ge v0, p0, :cond_f

    .line 171
    .line 172
    aget-object v2, v1, v0

    .line 173
    .line 174
    check-cast v2, Ldv;

    .line 175
    .line 176
    invoke-static {v2}, Li4;->t(Ldv;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_e

    .line 181
    .line 182
    invoke-static {v2, p1}, Lw60;->s(Ldv;Lrp;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    return v5

    .line 189
    :cond_e
    add-int/lit8 v0, v0, 0x1

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_f
    return v4
.end method

.method public static final E(Lnr0;Z)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lnr0;->g:J

    .line 2
    .line 3
    iget-wide v2, p0, Lnr0;->c:J

    .line 4
    .line 5
    invoke-static {v2, v3, v0, v1}, Lok0;->d(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lnr0;->b()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const-wide/16 p0, 0x0

    .line 18
    .line 19
    return-wide p0

    .line 20
    :cond_0
    return-wide v0
.end method

.method public static final F(Ljava/io/Reader;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    new-array v1, v1, [C

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    :goto_0
    if-ltz v2, :cond_0

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public static final G(Lji;Lsw;)V
    .locals 2

    .line 1
    new-instance v0, Lya;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lya;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    check-cast p0, Lpi;

    .line 9
    .line 10
    sget-object p1, Lna1;->a:Lna1;

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Lpi;->b(Lww;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final H([Ljava/lang/Object;II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p1, p2, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aput-object v0, p0, p1

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void
.end method

.method public static final I(Ldv;Ldv;ILrp;)Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Ldv;->B0()Lcv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcv;->e:Lcv;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_24

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    new-array v1, v0, [Ldv;

    .line 13
    .line 14
    iget-object v3, p0, Loe0;->d:Loe0;

    .line 15
    .line 16
    iget-boolean v3, v3, Loe0;->q:Z

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    const-string v3, "visitChildren called on an unattached node"

    .line 21
    .line 22
    invoke-static {v3}, Lw10;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v3, Lsh0;

    .line 26
    .line 27
    new-array v4, v0, [Loe0;

    .line 28
    .line 29
    invoke-direct {v3, v4}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Loe0;->d:Loe0;

    .line 33
    .line 34
    iget-object v5, v4, Loe0;->i:Loe0;

    .line 35
    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    invoke-static {v3, v4}, Lpf1;->e(Lsh0;Loe0;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    move v4, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    iget v5, v3, Lsh0;->f:I

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x1

    .line 51
    if-eqz v5, :cond_d

    .line 52
    .line 53
    add-int/lit8 v5, v5, -0x1

    .line 54
    .line 55
    invoke-virtual {v3, v5}, Lsh0;->k(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Loe0;

    .line 60
    .line 61
    iget v8, v5, Loe0;->g:I

    .line 62
    .line 63
    and-int/lit16 v8, v8, 0x400

    .line 64
    .line 65
    if-nez v8, :cond_3

    .line 66
    .line 67
    invoke-static {v3, v5}, Lpf1;->e(Lsh0;Loe0;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_2
    if-eqz v5, :cond_2

    .line 72
    .line 73
    iget v8, v5, Loe0;->f:I

    .line 74
    .line 75
    and-int/lit16 v8, v8, 0x400

    .line 76
    .line 77
    if-eqz v8, :cond_c

    .line 78
    .line 79
    move-object v8, v6

    .line 80
    :goto_3
    if-eqz v5, :cond_2

    .line 81
    .line 82
    instance-of v9, v5, Ldv;

    .line 83
    .line 84
    if-eqz v9, :cond_5

    .line 85
    .line 86
    check-cast v5, Ldv;

    .line 87
    .line 88
    add-int/lit8 v9, v4, 0x1

    .line 89
    .line 90
    array-length v10, v1

    .line 91
    if-ge v10, v9, :cond_4

    .line 92
    .line 93
    array-length v10, v1

    .line 94
    mul-int/lit8 v11, v10, 0x2

    .line 95
    .line 96
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    new-array v11, v11, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v1, v2, v11, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    .line 104
    .line 105
    move-object v1, v11

    .line 106
    :cond_4
    aput-object v5, v1, v4

    .line 107
    .line 108
    move v4, v9

    .line 109
    goto :goto_6

    .line 110
    :cond_5
    iget v9, v5, Loe0;->f:I

    .line 111
    .line 112
    and-int/lit16 v9, v9, 0x400

    .line 113
    .line 114
    if-eqz v9, :cond_b

    .line 115
    .line 116
    instance-of v9, v5, Lsm;

    .line 117
    .line 118
    if-eqz v9, :cond_b

    .line 119
    .line 120
    move-object v9, v5

    .line 121
    check-cast v9, Lsm;

    .line 122
    .line 123
    iget-object v9, v9, Lsm;->s:Loe0;

    .line 124
    .line 125
    move v10, v2

    .line 126
    :goto_4
    if-eqz v9, :cond_a

    .line 127
    .line 128
    iget v11, v9, Loe0;->f:I

    .line 129
    .line 130
    and-int/lit16 v11, v11, 0x400

    .line 131
    .line 132
    if-eqz v11, :cond_9

    .line 133
    .line 134
    add-int/lit8 v10, v10, 0x1

    .line 135
    .line 136
    if-ne v10, v7, :cond_6

    .line 137
    .line 138
    move-object v5, v9

    .line 139
    goto :goto_5

    .line 140
    :cond_6
    if-nez v8, :cond_7

    .line 141
    .line 142
    new-instance v8, Lsh0;

    .line 143
    .line 144
    new-array v11, v0, [Loe0;

    .line 145
    .line 146
    invoke-direct {v8, v11}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    if-eqz v5, :cond_8

    .line 150
    .line 151
    invoke-virtual {v8, v5}, Lsh0;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object v5, v6

    .line 155
    :cond_8
    invoke-virtual {v8, v9}, Lsh0;->b(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_9
    :goto_5
    iget-object v9, v9, Loe0;->i:Loe0;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_a
    if-ne v10, v7, :cond_b

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_b
    :goto_6
    invoke-static {v8}, Lpf1;->f(Lsh0;)Loe0;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    goto :goto_3

    .line 169
    :cond_c
    iget-object v5, v5, Loe0;->i:Loe0;

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_d
    sget-object v3, Lev;->b:Lev;

    .line 173
    .line 174
    invoke-static {v1, v2, v4, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 175
    .line 176
    .line 177
    if-ne p2, v7, :cond_10

    .line 178
    .line 179
    invoke-static {v2, v4}, Lw60;->O(II)Lz20;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iget v4, v3, Lx20;->d:I

    .line 184
    .line 185
    iget v3, v3, Lx20;->e:I

    .line 186
    .line 187
    if-gt v4, v3, :cond_13

    .line 188
    .line 189
    move v5, v2

    .line 190
    :goto_7
    if-eqz v5, :cond_e

    .line 191
    .line 192
    aget-object v8, v1, v4

    .line 193
    .line 194
    check-cast v8, Ldv;

    .line 195
    .line 196
    invoke-static {v8}, Li4;->t(Ldv;)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_e

    .line 201
    .line 202
    invoke-static {v8, p3}, Lw60;->s(Ldv;Lrp;)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eqz v8, :cond_e

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_e
    aget-object v8, v1, v4

    .line 210
    .line 211
    invoke-static {v8, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-eqz v8, :cond_f

    .line 216
    .line 217
    move v5, v7

    .line 218
    :cond_f
    if-eq v4, v3, :cond_13

    .line 219
    .line 220
    add-int/lit8 v4, v4, 0x1

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_10
    const/4 v3, 0x2

    .line 224
    if-ne p2, v3, :cond_23

    .line 225
    .line 226
    invoke-static {v2, v4}, Lw60;->O(II)Lz20;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    iget v4, v3, Lx20;->d:I

    .line 231
    .line 232
    iget v3, v3, Lx20;->e:I

    .line 233
    .line 234
    if-gt v4, v3, :cond_13

    .line 235
    .line 236
    move v5, v2

    .line 237
    :goto_8
    if-eqz v5, :cond_11

    .line 238
    .line 239
    aget-object v8, v1, v3

    .line 240
    .line 241
    check-cast v8, Ldv;

    .line 242
    .line 243
    invoke-static {v8}, Li4;->t(Ldv;)Z

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    if-eqz v9, :cond_11

    .line 248
    .line 249
    invoke-static {v8, p3}, Lw60;->h(Ldv;Lrp;)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-eqz v8, :cond_11

    .line 254
    .line 255
    :goto_9
    return v7

    .line 256
    :cond_11
    aget-object v8, v1, v3

    .line 257
    .line 258
    invoke-static {v8, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_12

    .line 263
    .line 264
    move v5, v7

    .line 265
    :cond_12
    if-eq v3, v4, :cond_13

    .line 266
    .line 267
    add-int/lit8 v3, v3, -0x1

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_13
    if-ne p2, v7, :cond_14

    .line 271
    .line 272
    goto/16 :goto_10

    .line 273
    .line 274
    :cond_14
    invoke-virtual {p0}, Ldv;->y0()Lav;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    iget-boolean p1, p1, Lav;->a:Z

    .line 279
    .line 280
    if-eqz p1, :cond_22

    .line 281
    .line 282
    iget-object p1, p0, Loe0;->d:Loe0;

    .line 283
    .line 284
    iget-boolean p1, p1, Loe0;->q:Z

    .line 285
    .line 286
    if-nez p1, :cond_15

    .line 287
    .line 288
    const-string p1, "visitAncestors called on an unattached node"

    .line 289
    .line 290
    invoke-static {p1}, Lw10;->b(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    :cond_15
    iget-object p1, p0, Loe0;->d:Loe0;

    .line 294
    .line 295
    iget-object p1, p1, Loe0;->h:Loe0;

    .line 296
    .line 297
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    :goto_a
    if-eqz p2, :cond_20

    .line 302
    .line 303
    iget-object v1, p2, Lb60;->I:Lmj0;

    .line 304
    .line 305
    iget-object v1, v1, Lmj0;->f:Loe0;

    .line 306
    .line 307
    iget v1, v1, Loe0;->g:I

    .line 308
    .line 309
    and-int/lit16 v1, v1, 0x400

    .line 310
    .line 311
    if-eqz v1, :cond_1e

    .line 312
    .line 313
    :goto_b
    if-eqz p1, :cond_1e

    .line 314
    .line 315
    iget v1, p1, Loe0;->f:I

    .line 316
    .line 317
    and-int/lit16 v1, v1, 0x400

    .line 318
    .line 319
    if-eqz v1, :cond_1d

    .line 320
    .line 321
    move-object v1, p1

    .line 322
    move-object v3, v6

    .line 323
    :goto_c
    if-eqz v1, :cond_1d

    .line 324
    .line 325
    instance-of v4, v1, Ldv;

    .line 326
    .line 327
    if-eqz v4, :cond_16

    .line 328
    .line 329
    move-object v6, v1

    .line 330
    goto :goto_f

    .line 331
    :cond_16
    iget v4, v1, Loe0;->f:I

    .line 332
    .line 333
    and-int/lit16 v4, v4, 0x400

    .line 334
    .line 335
    if-eqz v4, :cond_1c

    .line 336
    .line 337
    instance-of v4, v1, Lsm;

    .line 338
    .line 339
    if-eqz v4, :cond_1c

    .line 340
    .line 341
    move-object v4, v1

    .line 342
    check-cast v4, Lsm;

    .line 343
    .line 344
    iget-object v4, v4, Lsm;->s:Loe0;

    .line 345
    .line 346
    move v5, v2

    .line 347
    :goto_d
    if-eqz v4, :cond_1b

    .line 348
    .line 349
    iget v8, v4, Loe0;->f:I

    .line 350
    .line 351
    and-int/lit16 v8, v8, 0x400

    .line 352
    .line 353
    if-eqz v8, :cond_1a

    .line 354
    .line 355
    add-int/lit8 v5, v5, 0x1

    .line 356
    .line 357
    if-ne v5, v7, :cond_17

    .line 358
    .line 359
    move-object v1, v4

    .line 360
    goto :goto_e

    .line 361
    :cond_17
    if-nez v3, :cond_18

    .line 362
    .line 363
    new-instance v3, Lsh0;

    .line 364
    .line 365
    new-array v8, v0, [Loe0;

    .line 366
    .line 367
    invoke-direct {v3, v8}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    :cond_18
    if-eqz v1, :cond_19

    .line 371
    .line 372
    invoke-virtual {v3, v1}, Lsh0;->b(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    move-object v1, v6

    .line 376
    :cond_19
    invoke-virtual {v3, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_1a
    :goto_e
    iget-object v4, v4, Loe0;->i:Loe0;

    .line 380
    .line 381
    goto :goto_d

    .line 382
    :cond_1b
    if-ne v5, v7, :cond_1c

    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_1c
    invoke-static {v3}, Lpf1;->f(Lsh0;)Loe0;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    goto :goto_c

    .line 390
    :cond_1d
    iget-object p1, p1, Loe0;->h:Loe0;

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_1e
    invoke-virtual {p2}, Lb60;->v()Lb60;

    .line 394
    .line 395
    .line 396
    move-result-object p2

    .line 397
    if-eqz p2, :cond_1f

    .line 398
    .line 399
    iget-object p1, p2, Lb60;->I:Lmj0;

    .line 400
    .line 401
    if-eqz p1, :cond_1f

    .line 402
    .line 403
    iget-object p1, p1, Lmj0;->e:Ld61;

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_1f
    move-object p1, v6

    .line 407
    goto :goto_a

    .line 408
    :cond_20
    :goto_f
    if-nez v6, :cond_21

    .line 409
    .line 410
    goto :goto_10

    .line 411
    :cond_21
    invoke-virtual {p3, p0}, Lrp;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    check-cast p0, Ljava/lang/Boolean;

    .line 416
    .line 417
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    return p0

    .line 422
    :cond_22
    :goto_10
    return v2

    .line 423
    :cond_23
    const-string p0, "This function should only be used for 1-D focus search"

    .line 424
    .line 425
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    return v2

    .line 429
    :cond_24
    const-string p0, "This function should only be used within a parent that has focus."

    .line 430
    .line 431
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    return v2
.end method

.method public static final J(Lji;Lww;Ljava/lang/Object;)V
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lpi;

    .line 3
    .line 4
    iget-boolean v0, v0, Lpi;->S:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Lpi;

    .line 10
    .line 11
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    check-cast p0, Lpi;

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lpi;->b(Lww;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static K(Landroid/view/Window;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/Window;->setDecorFitsSystemWindows(Z)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    and-int/lit16 v1, v1, -0x101

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    or-int/lit16 v1, v1, 0x100

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/Window;->setDecorFitsSystemWindows(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static L(Lz20;)Lx20;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lx20;->d:I

    .line 5
    .line 6
    iget v1, p0, Lx20;->e:I

    .line 7
    .line 8
    iget p0, p0, Lx20;->f:I

    .line 9
    .line 10
    if-lez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, -0x2

    .line 15
    :goto_0
    new-instance v2, Lx20;

    .line 16
    .line 17
    invoke-direct {v2, v0, v1, p0}, Lx20;-><init>(III)V

    .line 18
    .line 19
    .line 20
    return-object v2
.end method

.method public static final M(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lbv0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p0, Lbv0;

    .line 7
    .line 8
    iget-object p0, p0, Lbv0;->d:Ljava/lang/Throwable;

    .line 9
    .line 10
    throw p0
.end method

.method public static final N()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static O(II)Lz20;
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lz20;->g:Lz20;

    .line 6
    .line 7
    sget-object p0, Lz20;->g:Lz20;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lz20;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    sub-int/2addr p1, v1

    .line 14
    invoke-direct {v0, p0, p1, v1}, Lx20;-><init>(III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final a(Lpe0;Lc90;Ljn0;Lu8;Lga;Lyt;Lj5;Lsw;Lji;I)V
    .locals 19

    .line 1
    move-object/from16 v8, p8

    .line 2
    .line 3
    check-cast v8, Lpi;

    .line 4
    .line 5
    const v0, -0x705086e1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, Lpi;->X(I)Lpi;

    .line 9
    .line 10
    .line 11
    move-object/from16 v11, p1

    .line 12
    .line 13
    invoke-virtual {v8, v11}, Lpi;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v0, 0x10

    .line 23
    .line 24
    :goto_0
    or-int v0, p9, v0

    .line 25
    .line 26
    const v1, 0x32d80

    .line 27
    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    move-object/from16 v15, p5

    .line 31
    .line 32
    invoke-virtual {v8, v15}, Lpi;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const/high16 v1, 0x100000

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/high16 v1, 0x80000

    .line 42
    .line 43
    :goto_1
    or-int/2addr v0, v1

    .line 44
    const/high16 v1, 0x2000000

    .line 45
    .line 46
    or-int/2addr v0, v1

    .line 47
    move-object/from16 v7, p7

    .line 48
    .line 49
    invoke-virtual {v8, v7}, Lpi;->h(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const/high16 v1, 0x20000000

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/high16 v1, 0x10000000

    .line 59
    .line 60
    :goto_2
    or-int/2addr v0, v1

    .line 61
    const v1, 0x12492493

    .line 62
    .line 63
    .line 64
    and-int/2addr v1, v0

    .line 65
    const v2, 0x12492492

    .line 66
    .line 67
    .line 68
    if-eq v1, v2, :cond_3

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    const/4 v1, 0x0

    .line 73
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 74
    .line 75
    invoke-virtual {v8, v2, v1}, Lpi;->O(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    invoke-virtual {v8}, Lpi;->T()V

    .line 82
    .line 83
    .line 84
    and-int/lit8 v1, p9, 0x1

    .line 85
    .line 86
    const v2, -0xe00e001

    .line 87
    .line 88
    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    invoke-virtual {v8}, Lpi;->y()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_4

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_4
    invoke-virtual {v8}, Lpi;->R()V

    .line 99
    .line 100
    .line 101
    and-int/2addr v0, v2

    .line 102
    move-object/from16 v2, p2

    .line 103
    .line 104
    move-object/from16 v6, p3

    .line 105
    .line 106
    move-object/from16 v5, p4

    .line 107
    .line 108
    move-object/from16 v4, p6

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_5
    :goto_4
    new-instance v1, Lln0;

    .line 112
    .line 113
    const/4 v3, 0x0

    .line 114
    invoke-direct {v1, v3, v3, v3, v3}, Lln0;-><init>(FFFF)V

    .line 115
    .line 116
    .line 117
    sget-object v3, Lrd0;->a:Lt8;

    .line 118
    .line 119
    sget-object v4, Ln2;->n:Lga;

    .line 120
    .line 121
    invoke-static {v8}, Lbn0;->a(Lji;)Lj5;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    and-int/2addr v0, v2

    .line 126
    move-object v2, v5

    .line 127
    move-object v5, v4

    .line 128
    move-object v4, v2

    .line 129
    move-object v2, v1

    .line 130
    move-object v6, v3

    .line 131
    :goto_5
    invoke-virtual {v8}, Lpi;->q()V

    .line 132
    .line 133
    .line 134
    and-int/lit8 v1, v0, 0x70

    .line 135
    .line 136
    or-int/lit16 v1, v1, 0x6d86

    .line 137
    .line 138
    const/high16 v3, 0x70000

    .line 139
    .line 140
    shr-int/lit8 v9, v0, 0x3

    .line 141
    .line 142
    and-int/2addr v3, v9

    .line 143
    or-int/2addr v1, v3

    .line 144
    const/high16 v3, 0x180000

    .line 145
    .line 146
    or-int v9, v1, v3

    .line 147
    .line 148
    shr-int/lit8 v0, v0, 0x12

    .line 149
    .line 150
    and-int/lit16 v0, v0, 0x1c00

    .line 151
    .line 152
    const/16 v1, 0x30

    .line 153
    .line 154
    or-int v10, v1, v0

    .line 155
    .line 156
    move-object/from16 v0, p0

    .line 157
    .line 158
    move-object v1, v11

    .line 159
    move-object v3, v15

    .line 160
    invoke-static/range {v0 .. v10}, Lj50;->a(Lpe0;Lc90;Ljn0;Lyt;Lj5;Lga;Lu8;Lsw;Lji;II)V

    .line 161
    .line 162
    .line 163
    move-object v12, v2

    .line 164
    move-object/from16 v16, v4

    .line 165
    .line 166
    move-object v14, v5

    .line 167
    move-object v13, v6

    .line 168
    goto :goto_6

    .line 169
    :cond_6
    invoke-virtual {v8}, Lpi;->R()V

    .line 170
    .line 171
    .line 172
    move-object/from16 v12, p2

    .line 173
    .line 174
    move-object/from16 v13, p3

    .line 175
    .line 176
    move-object/from16 v14, p4

    .line 177
    .line 178
    move-object/from16 v16, p6

    .line 179
    .line 180
    :goto_6
    invoke-virtual {v8}, Lpi;->r()Lht0;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    if-eqz v0, :cond_7

    .line 185
    .line 186
    new-instance v9, Lv60;

    .line 187
    .line 188
    move-object/from16 v10, p0

    .line 189
    .line 190
    move-object/from16 v11, p1

    .line 191
    .line 192
    move-object/from16 v15, p5

    .line 193
    .line 194
    move-object/from16 v17, p7

    .line 195
    .line 196
    move/from16 v18, p9

    .line 197
    .line 198
    invoke-direct/range {v9 .. v18}, Lv60;-><init>(Lpe0;Lc90;Ljn0;Lu8;Lga;Lyt;Lj5;Lsw;I)V

    .line 199
    .line 200
    .line 201
    iput-object v9, v0, Lht0;->d:Lww;

    .line 202
    .line 203
    :cond_7
    return-void
.end method

.method public static final b(Lpe0;Lkm;Ljn0;Lf21;ZLj5;Ln2;Laj0;Lga;Ln2;Lmh;Lji;II)V
    .locals 44

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v0, p3

    move/from16 v11, p4

    move-object/from16 v5, p6

    move-object/from16 v12, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v13, p10

    move/from16 v14, p12

    move/from16 v15, p13

    sget-object v2, Ln2;->r:Lfa;

    .line 1
    move-object/from16 v6, p11

    check-cast v6, Lpi;

    const v7, -0x22247a99

    invoke-virtual {v6, v7}, Lpi;->X(I)Lpi;

    and-int/lit8 v7, v14, 0x6

    move/from16 p11, v7

    if-nez p11, :cond_1

    invoke-virtual {v6, v1}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_0

    const/16 v16, 0x4

    goto :goto_0

    :cond_0
    const/16 v16, 0x2

    :goto_0
    or-int v16, v14, v16

    goto :goto_1

    :cond_1
    move/from16 v16, v14

    :goto_1
    and-int/lit8 v17, v14, 0x30

    const/16 v18, 0x10

    if-nez v17, :cond_3

    invoke-virtual {v6, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2

    const/16 v17, 0x20

    goto :goto_2

    :cond_2
    move/from16 v17, v18

    :goto_2
    or-int v16, v16, v17

    :cond_3
    and-int/lit16 v10, v14, 0x180

    const/16 v19, 0x80

    if-nez v10, :cond_5

    invoke-virtual {v6, v4}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_3

    :cond_4
    move/from16 v10, v19

    :goto_3
    or-int v16, v16, v10

    :cond_5
    and-int/lit16 v10, v14, 0xc00

    const/16 v20, 0x400

    const/4 v7, 0x0

    move/from16 v22, v10

    if-nez v22, :cond_7

    invoke-virtual {v6, v7}, Lpi;->g(Z)Z

    move-result v22

    if-eqz v22, :cond_6

    const/16 v22, 0x800

    goto :goto_4

    :cond_6
    move/from16 v22, v20

    :goto_4
    or-int v16, v16, v22

    :cond_7
    and-int/lit16 v10, v14, 0x6000

    const/16 v23, 0x2000

    const/4 v7, 0x1

    if-nez v10, :cond_9

    invoke-virtual {v6, v7}, Lpi;->d(I)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v10, v23

    :goto_5
    or-int v16, v16, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int v24, v14, v10

    const/high16 v25, 0x10000

    if-nez v24, :cond_b

    invoke-virtual {v6, v0}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_a

    const/high16 v24, 0x20000

    goto :goto_6

    :cond_a
    move/from16 v24, v25

    :goto_6
    or-int v16, v16, v24

    :cond_b
    const/high16 v24, 0x180000

    and-int v27, v14, v24

    const/high16 v28, 0x80000

    move/from16 v29, v10

    if-nez v27, :cond_d

    invoke-virtual {v6, v11}, Lpi;->g(Z)Z

    move-result v27

    if-eqz v27, :cond_c

    const/high16 v27, 0x100000

    goto :goto_7

    :cond_c
    move/from16 v27, v28

    :goto_7
    or-int v16, v16, v27

    :cond_d
    const/high16 v27, 0xc00000

    and-int v30, v14, v27

    move-object/from16 v7, p5

    if-nez v30, :cond_f

    invoke-virtual {v6, v7}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_e

    const/high16 v31, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v31, 0x400000

    :goto_8
    or-int v16, v16, v31

    :cond_f
    const/high16 v31, 0x6000000

    and-int v32, v14, v31

    if-nez v32, :cond_11

    const/4 v10, 0x0

    invoke-virtual {v6, v10}, Lpi;->d(I)Z

    move-result v33

    if-eqz v33, :cond_10

    const/high16 v10, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v10, 0x2000000

    :goto_9
    or-int v16, v16, v10

    :cond_11
    const/high16 v10, 0x30000000

    and-int v33, v14, v10

    move/from16 v34, v10

    const/4 v10, 0x0

    if-nez v33, :cond_13

    invoke-virtual {v6, v10}, Lpi;->c(F)Z

    move-result v33

    if-eqz v33, :cond_12

    const/high16 v33, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v33, 0x10000000

    :goto_a
    or-int v16, v16, v33

    :cond_13
    and-int/lit8 v33, v15, 0x6

    if-nez v33, :cond_15

    invoke-virtual {v6, v5}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_14

    const/16 v33, 0x4

    goto :goto_b

    :cond_14
    const/16 v33, 0x2

    :goto_b
    or-int v33, v15, v33

    goto :goto_c

    :cond_15
    move/from16 v33, v15

    :goto_c
    and-int/lit8 v35, v15, 0x30

    if-nez v35, :cond_17

    invoke-virtual {v6, v12}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_16

    const/16 v18, 0x20

    :cond_16
    or-int v33, v33, v18

    :cond_17
    and-int/lit16 v10, v15, 0x180

    const/4 v14, 0x0

    if-nez v10, :cond_19

    invoke-virtual {v6, v14}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_18

    const/16 v19, 0x100

    :cond_18
    or-int v33, v33, v19

    :cond_19
    and-int/lit16 v10, v15, 0xc00

    if-nez v10, :cond_1b

    invoke-virtual {v6, v2}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1a

    const/16 v20, 0x800

    :cond_1a
    or-int v33, v33, v20

    :cond_1b
    and-int/lit16 v10, v15, 0x6000

    if-nez v10, :cond_1d

    invoke-virtual {v6, v8}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1c

    const/16 v23, 0x4000

    :cond_1c
    or-int v33, v33, v23

    :cond_1d
    and-int v10, v15, v29

    if-nez v10, :cond_1f

    invoke-virtual {v6, v9}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1e

    const/high16 v25, 0x20000

    :cond_1e
    or-int v33, v33, v25

    :cond_1f
    and-int v10, v15, v24

    if-nez v10, :cond_21

    invoke-virtual {v6, v13}, Lpi;->h(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_20

    const/high16 v28, 0x100000

    :cond_20
    or-int v33, v33, v28

    :cond_21
    move/from16 v10, v33

    const v19, 0x12492493

    and-int v14, v16, v19

    const v7, 0x12492492

    if-ne v14, v7, :cond_23

    const v7, 0x92493

    and-int/2addr v7, v10

    const v14, 0x92492

    if-eq v7, v14, :cond_22

    goto :goto_d

    :cond_22
    const/4 v7, 0x0

    goto :goto_e

    :cond_23
    :goto_d
    const/4 v7, 0x1

    :goto_e
    and-int/lit8 v14, v16, 0x1

    invoke-virtual {v6, v14, v7}, Lpi;->O(IZ)Z

    move-result v7

    if-eqz v7, :cond_66

    and-int/lit8 v14, v16, 0x70

    const/16 v7, 0x20

    if-ne v14, v7, :cond_24

    const/16 v19, 0x1

    goto :goto_f

    :cond_24
    const/16 v19, 0x0

    .line 2
    :goto_f
    invoke-virtual {v6}, Lpi;->L()Ljava/lang/Object;

    move-result-object v7

    .line 3
    sget-object v15, Lii;->a:Lr3;

    if-nez v19, :cond_25

    if-ne v7, v15, :cond_26

    .line 4
    :cond_25
    new-instance v7, Lu70;

    const/4 v12, 0x0

    invoke-direct {v7, v3, v12}, Lu70;-><init>(Lkm;I)V

    .line 5
    invoke-virtual {v6, v7}, Lpi;->g0(Ljava/lang/Object;)V

    .line 6
    :cond_26
    check-cast v7, Lhw;

    shr-int/lit8 v12, v16, 0x3

    and-int/lit8 v19, v12, 0xe

    shr-int/lit8 v23, v10, 0xf

    and-int/lit8 v25, v23, 0x70

    or-int v25, v19, v25

    move/from16 v28, v12

    and-int/lit16 v12, v10, 0x380

    or-int v12, v25, v12

    move/from16 v25, v10

    .line 7
    invoke-static {v13, v6}, Lr60;->z(Ljava/lang/Object;Lji;)Loh0;

    move-result-object v10

    move/from16 v33, v12

    const/4 v12, 0x0

    .line 8
    invoke-static {v12, v6}, Lr60;->z(Ljava/lang/Object;Lji;)Loh0;

    move-result-object v13

    and-int/lit8 v12, v33, 0xe

    move/from16 v35, v12

    const/16 v36, 0x6

    xor-int/lit8 v12, v35, 0x6

    const/4 v11, 0x4

    if-le v12, v11, :cond_27

    .line 9
    invoke-virtual {v6, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_28

    :cond_27
    and-int/lit8 v12, v33, 0x6

    if-ne v12, v11, :cond_29

    :cond_28
    const/4 v11, 0x1

    goto :goto_10

    :cond_29
    const/4 v11, 0x0

    :goto_10
    invoke-virtual {v6, v10}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v6, v13}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v6, v7}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    .line 10
    invoke-virtual {v6}, Lpi;->L()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_2a

    if-ne v12, v15, :cond_2b

    .line 11
    :cond_2a
    sget-object v11, Ln2;->R:Ln2;

    new-instance v12, Lp9;

    const/4 v1, 0x4

    invoke-direct {v12, v10, v13, v7, v1}, Lp9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v11, v12}, Lr60;->l(Ln2;Lhw;)Ldn;

    move-result-object v7

    .line 12
    new-instance v10, Lc7;

    invoke-direct {v10, v1, v7, v3}, Lc7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v11, v10}, Lr60;->l(Ln2;Lhw;)Ldn;

    move-result-object v41

    .line 13
    new-instance v37, Lx70;

    const/16 v38, 0x0

    const/16 v39, 0x0

    .line 14
    const-class v40, Lw31;

    const-string v42, "value"

    const-string v43, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v37 .. v43}, Lx70;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v12, v37

    .line 15
    invoke-virtual {v6, v12}, Lpi;->g0(Ljava/lang/Object;)V

    .line 16
    :cond_2b
    check-cast v12, Lx70;

    .line 17
    invoke-virtual {v6}, Lpi;->L()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_2c

    .line 18
    invoke-static {v6}, Ls91;->s(Lji;)Lyk;

    move-result-object v1

    .line 19
    invoke-virtual {v6, v1}, Lpi;->g0(Ljava/lang/Object;)V

    .line 20
    :cond_2c
    move-object v10, v1

    check-cast v10, Lyk;

    const/16 v7, 0x20

    if-ne v14, v7, :cond_2d

    const/4 v1, 0x1

    goto :goto_11

    :cond_2d
    const/4 v1, 0x0

    .line 21
    :goto_11
    invoke-virtual {v6}, Lpi;->L()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_2e

    if-ne v7, v15, :cond_2f

    .line 22
    :cond_2e
    new-instance v7, Lu70;

    const/4 v1, 0x1

    invoke-direct {v7, v3, v1}, Lu70;-><init>(Lkm;I)V

    .line 23
    invoke-virtual {v6, v7}, Lpi;->g0(Ljava/lang/Object;)V

    .line 24
    :cond_2f
    check-cast v7, Lhw;

    const v1, 0xfff0

    and-int v1, v16, v1

    shr-int/lit8 v11, v16, 0x9

    const/high16 v13, 0x70000

    and-int v33, v11, v13

    or-int v1, v1, v33

    const/high16 v33, 0x380000

    and-int v11, v11, v33

    or-int/2addr v1, v11

    shl-int/lit8 v11, v25, 0x15

    const/high16 v35, 0x1c00000

    and-int v11, v11, v35

    or-int/2addr v1, v11

    shl-int/lit8 v11, v25, 0xf

    const/high16 v25, 0xe000000

    and-int v37, v11, v25

    or-int v1, v1, v37

    const/high16 v37, 0x70000000

    and-int v11, v11, v37

    or-int/2addr v1, v11

    and-int/lit8 v11, v1, 0x70

    xor-int/lit8 v11, v11, 0x30

    move/from16 v38, v13

    const/16 v13, 0x20

    if-le v11, v13, :cond_30

    .line 25
    invoke-virtual {v6, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_31

    :cond_30
    and-int/lit8 v11, v1, 0x30

    if-ne v11, v13, :cond_32

    :cond_31
    const/4 v11, 0x1

    goto :goto_12

    :cond_32
    const/4 v11, 0x0

    :goto_12
    and-int/lit16 v13, v1, 0x380

    xor-int/lit16 v13, v13, 0x180

    const/16 v3, 0x100

    if-le v13, v3, :cond_33

    .line 26
    invoke-virtual {v6, v4}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_34

    :cond_33
    and-int/lit16 v13, v1, 0x180

    if-ne v13, v3, :cond_35

    :cond_34
    const/4 v3, 0x1

    goto :goto_13

    :cond_35
    const/4 v3, 0x0

    :goto_13
    or-int/2addr v3, v11

    and-int/lit16 v11, v1, 0x1c00

    xor-int/lit16 v11, v11, 0xc00

    const/16 v13, 0x800

    if-le v11, v13, :cond_36

    const/4 v11, 0x0

    .line 27
    invoke-virtual {v6, v11}, Lpi;->g(Z)Z

    move-result v21

    if-nez v21, :cond_37

    :cond_36
    and-int/lit16 v11, v1, 0xc00

    if-ne v11, v13, :cond_38

    :cond_37
    const/4 v11, 0x1

    goto :goto_14

    :cond_38
    const/4 v11, 0x0

    :goto_14
    or-int/2addr v3, v11

    const v11, 0xe000

    and-int/2addr v11, v1

    xor-int/lit16 v11, v11, 0x6000

    const/16 v13, 0x4000

    if-le v11, v13, :cond_39

    const/4 v11, 0x1

    .line 28
    invoke-virtual {v6, v11}, Lpi;->d(I)Z

    move-result v21

    if-nez v21, :cond_3a

    goto :goto_15

    :cond_39
    const/4 v11, 0x1

    :goto_15
    and-int/lit16 v11, v1, 0x6000

    if-ne v11, v13, :cond_3b

    :cond_3a
    const/4 v11, 0x1

    goto :goto_16

    :cond_3b
    const/4 v11, 0x0

    :goto_16
    or-int/2addr v3, v11

    and-int v11, v1, v25

    xor-int v11, v11, v31

    const/high16 v13, 0x4000000

    if-le v11, v13, :cond_3c

    .line 29
    invoke-virtual {v6, v2}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    :cond_3c
    and-int v2, v1, v31

    if-ne v2, v13, :cond_3e

    :cond_3d
    const/4 v2, 0x1

    goto :goto_17

    :cond_3e
    const/4 v2, 0x0

    :goto_17
    or-int/2addr v2, v3

    and-int v3, v1, v37

    xor-int v3, v3, v34

    const/high16 v11, 0x20000000

    if-le v3, v11, :cond_3f

    .line 30
    invoke-virtual {v6, v8}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_40

    :cond_3f
    and-int v3, v1, v34

    if-ne v3, v11, :cond_41

    :cond_40
    const/4 v3, 0x1

    goto :goto_18

    :cond_41
    const/4 v3, 0x0

    :goto_18
    or-int/2addr v2, v3

    and-int v3, v1, v33

    xor-int v3, v3, v24

    const/high16 v11, 0x100000

    if-le v3, v11, :cond_42

    const/4 v3, 0x0

    .line 31
    invoke-virtual {v6, v3}, Lpi;->c(F)Z

    move-result v3

    if-nez v3, :cond_43

    :cond_42
    and-int v3, v1, v24

    if-ne v3, v11, :cond_44

    :cond_43
    const/4 v3, 0x1

    goto :goto_19

    :cond_44
    const/4 v3, 0x0

    :goto_19
    or-int/2addr v2, v3

    and-int v3, v1, v35

    xor-int v3, v3, v27

    const/high16 v11, 0x800000

    if-le v3, v11, :cond_45

    .line 32
    invoke-virtual {v6, v5}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_46

    :cond_45
    and-int v3, v1, v27

    if-ne v3, v11, :cond_47

    :cond_46
    const/4 v3, 0x1

    goto :goto_1a

    :cond_47
    const/4 v3, 0x0

    :goto_1a
    or-int/2addr v2, v3

    and-int/lit8 v3, v23, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v11, 0x4

    if-le v3, v11, :cond_48

    .line 33
    invoke-virtual {v6, v9}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_49

    :cond_48
    and-int/lit8 v3, v23, 0x6

    if-ne v3, v11, :cond_4a

    :cond_49
    const/4 v3, 0x1

    goto :goto_1b

    :cond_4a
    const/4 v3, 0x0

    :goto_1b
    or-int/2addr v2, v3

    .line 34
    invoke-virtual {v6, v7}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    and-int v3, v1, v38

    xor-int v3, v3, v29

    const/high16 v13, 0x20000

    if-le v3, v13, :cond_4b

    const/4 v3, 0x0

    .line 35
    invoke-virtual {v6, v3}, Lpi;->d(I)Z

    move-result v18

    if-nez v18, :cond_4c

    goto :goto_1c

    :cond_4b
    const/4 v3, 0x0

    :goto_1c
    and-int v1, v1, v29

    if-ne v1, v13, :cond_4d

    :cond_4c
    const/4 v1, 0x1

    goto :goto_1d

    :cond_4d
    move v1, v3

    :goto_1d
    or-int/2addr v1, v2

    .line 36
    invoke-virtual {v6, v10}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 37
    invoke-virtual {v6}, Lpi;->L()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4f

    if-ne v2, v15, :cond_4e

    goto :goto_1e

    :cond_4e
    move-object v1, v6

    move-object v4, v10

    move-object v10, v12

    const/16 v13, 0x20

    const/16 v26, 0x1

    move v12, v11

    move v11, v3

    move-object/from16 v3, p1

    goto :goto_1f

    .line 38
    :cond_4f
    :goto_1e
    new-instance v2, Lyn0;

    move-object v1, v6

    move-object v6, v12

    const/16 v13, 0x20

    const/16 v26, 0x1

    move v12, v11

    move v11, v3

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v10}, Lyn0;-><init>(Lkm;Ljn0;Ln2;Lx70;Lhw;Lga;Ln2;Lyk;)V

    move-object v4, v10

    move-object v10, v6

    .line 39
    invoke-virtual {v1, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 40
    :goto_1f
    move-object/from16 v18, v2

    check-cast v18, Lr70;

    xor-int/lit8 v2, v19, 0x6

    if-le v2, v12, :cond_50

    .line 41
    invoke-virtual {v1, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_51

    :cond_50
    and-int/lit8 v2, v28, 0x6

    if-ne v2, v12, :cond_52

    :cond_51
    move/from16 v7, v26

    goto :goto_20

    :cond_52
    move v7, v11

    :goto_20
    invoke-virtual {v1, v11}, Lpi;->g(Z)Z

    move-result v2

    or-int/2addr v2, v7

    .line 42
    invoke-virtual {v1}, Lpi;->L()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_53

    if-ne v5, v15, :cond_54

    .line 43
    :cond_53
    new-instance v5, Lg80;

    invoke-direct {v5, v3, v11}, Lg80;-><init>(Lkm;Z)V

    .line 44
    invoke-virtual {v1, v5}, Lpi;->g0(Ljava/lang/Object;)V

    .line 45
    :cond_54
    check-cast v5, Lf80;

    if-ne v14, v13, :cond_55

    move/from16 v7, v26

    goto :goto_21

    :cond_55
    move v7, v11

    :goto_21
    and-int v2, v16, v38

    const/high16 v6, 0x20000

    if-ne v2, v6, :cond_56

    move/from16 v2, v26

    goto :goto_22

    :cond_56
    move v2, v11

    :goto_22
    or-int/2addr v2, v7

    .line 46
    invoke-virtual {v1}, Lpi;->L()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_57

    if-ne v6, v15, :cond_58

    .line 47
    :cond_57
    new-instance v6, Lqo0;

    invoke-direct {v6, v0, v3}, Lqo0;-><init>(Lf21;Lkm;)V

    .line 48
    invoke-virtual {v1, v6}, Lpi;->g0(Ljava/lang/Object;)V

    .line 49
    :cond_58
    move-object v7, v6

    check-cast v7, Lqo0;

    .line 50
    sget-object v2, Lmb;->a:Lej;

    .line 51
    invoke-virtual {v1, v2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    move-result-object v2

    .line 52
    check-cast v2, Lkb;

    if-ne v14, v13, :cond_59

    move/from16 v6, v26

    goto :goto_23

    :cond_59
    move v6, v11

    .line 53
    :goto_23
    invoke-virtual {v1, v2}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    .line 54
    invoke-virtual {v1}, Lpi;->L()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_5a

    if-ne v8, v15, :cond_5b

    .line 55
    :cond_5a
    new-instance v8, Lon0;

    invoke-direct {v8, v3, v2}, Lon0;-><init>(Lkm;Lkb;)V

    .line 56
    invoke-virtual {v1, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 57
    :cond_5b
    move-object v9, v8

    check-cast v9, Lon0;

    .line 58
    sget-object v2, Lme0;->a:Lme0;

    sget-object v6, Lum0;->e:Lum0;

    if-eqz p4, :cond_64

    const v8, -0x32e44cfd

    invoke-virtual {v1, v8}, Lpi;->W(I)V

    shr-int/lit8 v8, v16, 0x15

    and-int/lit8 v8, v8, 0x70

    or-int v8, v19, v8

    and-int/lit8 v14, v8, 0xe

    xor-int/lit8 v14, v14, 0x6

    if-le v14, v12, :cond_5c

    .line 59
    invoke-virtual {v1, v3}, Lpi;->f(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5d

    :cond_5c
    and-int/lit8 v14, v8, 0x6

    if-ne v14, v12, :cond_5e

    :cond_5d
    move/from16 v12, v26

    goto :goto_24

    :cond_5e
    move v12, v11

    :goto_24
    and-int/lit8 v14, v8, 0x70

    xor-int/lit8 v14, v14, 0x30

    if-le v14, v13, :cond_5f

    invoke-virtual {v1, v11}, Lpi;->d(I)Z

    move-result v14

    if-nez v14, :cond_61

    :cond_5f
    and-int/lit8 v8, v8, 0x30

    if-ne v8, v13, :cond_60

    goto :goto_25

    :cond_60
    move/from16 v26, v11

    :cond_61
    :goto_25
    or-int v8, v12, v26

    .line 60
    invoke-virtual {v1}, Lpi;->L()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_62

    if-ne v12, v15, :cond_63

    .line 61
    :cond_62
    new-instance v12, Lnn0;

    invoke-direct {v12, v3}, Lnn0;-><init>(Lkm;)V

    .line 62
    invoke-virtual {v1, v12}, Lpi;->g0(Ljava/lang/Object;)V

    .line 63
    :cond_63
    check-cast v12, Lnn0;

    .line 64
    iget-object v8, v3, Llo0;->w:Leb;

    .line 65
    invoke-static {v12, v8, v6}, Lkl;->t(Lf70;Leb;Lum0;)Lpe0;

    move-result-object v8

    .line 66
    invoke-virtual {v1, v11}, Lpi;->p(Z)V

    goto :goto_26

    :cond_64
    const v8, -0x32ddbe25

    .line 67
    invoke-virtual {v1, v8}, Lpi;->W(I)V

    .line 68
    invoke-virtual {v1, v11}, Lpi;->p(Z)V

    move-object v8, v2

    .line 69
    :goto_26
    iget-object v12, v3, Llo0;->z:La90;

    move-object/from16 v13, p0

    .line 70
    invoke-interface {v13, v12}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v12

    .line 71
    iget-object v14, v3, Llo0;->x:Lo9;

    .line 72
    invoke-interface {v12, v14}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v12

    move/from16 v14, p4

    .line 73
    invoke-static {v12, v10, v5, v6, v14}, Lp30;->O(Lpe0;Lx70;Lf80;Lum0;Z)Lpe0;

    move-result-object v5

    if-eqz v14, :cond_65

    .line 74
    new-instance v12, Ltn0;

    invoke-direct {v12, v11, v3, v4}, Ltn0;-><init>(ZLkm;Lyk;)V

    invoke-static {v2, v12}, Luz0;->a(Lpe0;Lsw;)Lpe0;

    move-result-object v2

    .line 75
    invoke-interface {v5, v2}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v2

    goto :goto_27

    .line 76
    :cond_65
    invoke-interface {v5, v2}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v2

    .line 77
    :goto_27
    invoke-interface {v2, v8}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v2

    .line 78
    iget-object v8, v3, Llo0;->r:Lxg0;

    move-object/from16 v5, p5

    move-object v4, v6

    move v6, v14

    .line 79
    invoke-static/range {v2 .. v9}, Ls91;->N(Lpe0;Lez0;Lum0;Lj5;ZLyt;Lxg0;Lon0;)Lpe0;

    move-result-object v2

    move-object v9, v3

    .line 80
    new-instance v3, Li5;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v9}, Li5;-><init>(ILjava/lang/Object;)V

    sget-object v4, Lo51;->a:Lir0;

    .line 81
    new-instance v4, Ln51;

    move/from16 v5, v36

    const/4 v12, 0x0

    invoke-direct {v4, v9, v12, v3, v5}, Ln51;-><init>(Ljava/lang/Object;Lr60;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 82
    invoke-interface {v2, v4}, Lpe0;->c(Lpe0;)Lpe0;

    move-result-object v2

    move-object/from16 v12, p7

    .line 83
    invoke-static {v2, v12}, Lkl;->u(Lpe0;Laj0;)Lpe0;

    move-result-object v4

    .line 84
    iget-object v5, v9, Llo0;->u:Ld80;

    const/4 v8, 0x0

    move-object v7, v1

    move-object v3, v10

    move-object/from16 v6, v18

    .line 85
    invoke-static/range {v3 .. v8}, Lr60;->b(Lhw;Lpe0;Ld80;Lr70;Lji;I)V

    goto :goto_28

    :cond_66
    move-object v13, v1

    move-object v9, v3

    move-object v7, v6

    .line 86
    invoke-virtual {v7}, Lpi;->R()V

    .line 87
    :goto_28
    invoke-virtual {v7}, Lpi;->r()Lht0;

    move-result-object v14

    if-eqz v14, :cond_67

    new-instance v0, Lv70;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object v2, v9

    move-object v8, v12

    move-object v1, v13

    move-object/from16 v9, p8

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lv70;-><init>(Lpe0;Lkm;Ljn0;Lf21;ZLj5;Ln2;Laj0;Lga;Ln2;Lmh;II)V

    .line 88
    iput-object v0, v14, Lht0;->d:Lww;

    :cond_67
    return-void
.end method

.method public static final c([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {p0, v0, v1, p1, v2}, Lf9;->e0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p1, 0x2

    .line 12
    .line 13
    array-length v2, p0

    .line 14
    invoke-static {p0, v0, v1, p1, v2}, Lf9;->c0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 15
    .line 16
    .line 17
    aput-object p2, v0, p1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    aput-object p3, v0, p1

    .line 22
    .line 23
    return-object v0
.end method

.method public static final d(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {p1, v0, v1, p0, v2}, Lf9;->e0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x2

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p1, v0, p0, v1, v2}, Lf9;->c0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final e(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {p1, v0, v1, p0, v2}, Lf9;->e0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x1

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p1, v0, p0, v1, v2}, Lf9;->c0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final f([Ljava/lang/Object;IILa0;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0x3

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "["

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_2

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int v2, p1, v1

    .line 26
    .line 27
    aget-object v2, p0, v2

    .line 28
    .line 29
    if-ne v2, p3, :cond_1

    .line 30
    .line 31
    const-string v2, "(this Collection)"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string p0, "]"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static g(Ljava/lang/StringBuilder;Ljava/lang/Object;Lsw;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of p2, p1, Ljava/lang/CharSequence;

    .line 18
    .line 19
    :goto_0
    if-eqz p2, :cond_2

    .line 20
    .line 21
    check-cast p1, Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    instance-of p2, p1, Ljava/lang/Character;

    .line 28
    .line 29
    if-eqz p2, :cond_3

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Character;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static final h(Ldv;Lrp;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldv;->B0()Lcv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    if-eq v0, v3, :cond_9

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    invoke-static {p0, p1}, Lw60;->C(Ldv;Lrp;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_6

    .line 26
    .line 27
    invoke-virtual {p0}, Ldv;->y0()Lav;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-boolean v0, v0, Lav;->a:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Lrp;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move p0, v2

    .line 47
    :goto_0
    if-eqz p0, :cond_5

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {}, Lxc;->j()V

    .line 51
    .line 52
    .line 53
    return v2

    .line 54
    :cond_2
    invoke-static {p0}, Li4;->q(Ldv;)Ldv;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v5, "ActiveParent must have a focusedChild"

    .line 59
    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    invoke-virtual {v0}, Ldv;->B0()Lcv;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_7

    .line 71
    .line 72
    if-eq v6, v4, :cond_4

    .line 73
    .line 74
    if-eq v6, v3, :cond_7

    .line 75
    .line 76
    if-eq v6, v1, :cond_3

    .line 77
    .line 78
    invoke-static {}, Lxc;->j()V

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_3
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return v2

    .line 86
    :cond_4
    invoke-static {v0, p1}, Lw60;->h(Ldv;Lrp;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_6

    .line 91
    .line 92
    invoke-static {p0, v0, v3, p1}, Lw60;->t(Ldv;Ldv;ILrp;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0}, Ldv;->y0()Lav;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    iget-boolean p0, p0, Lav;->a:Z

    .line 103
    .line 104
    if-eqz p0, :cond_5

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lrp;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    return v2

    .line 120
    :cond_6
    :goto_1
    return v4

    .line 121
    :cond_7
    invoke-static {p0, v0, v3, p1}, Lw60;->t(Ldv;Ldv;ILrp;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    return p0

    .line 126
    :cond_8
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return v2

    .line 130
    :cond_9
    invoke-static {p0, p1}, Lw60;->C(Ldv;Lrp;)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    return p0
.end method

.method public static final i(Lnr0;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnr0;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lnr0;->d:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final j(Lnr0;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnr0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lnr0;->h:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean p0, p0, Lnr0;->d:Z

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static final k(Lnr0;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnr0;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lnr0;->d:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static l(DDD)D
    .locals 1

    .line 1
    cmpl-double v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-double v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmpl-double p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static m(FFF)F
    .locals 2

    .line 1
    cmpl-float v0, p1, p2

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-float v0, p0, p1

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    cmpl-float p1, p0, p2

    .line 11
    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    return p2

    .line 15
    :cond_1
    return p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x2e

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static n(III)I
    .locals 2

    .line 1
    if-gt p1, p2, :cond_2

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    if-le p0, p2, :cond_1

    .line 7
    .line 8
    return p2

    .line 9
    :cond_1
    return p0

    .line 10
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, " is less than minimum "

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x2e

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static o(JJJ)J
    .locals 1

    .line 1
    cmp-long v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmp-long v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmp-long p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static final p(Ljava/lang/Throwable;)Lbv0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbv0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lbv0;-><init>(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final q(ILjava/util/List;)I
    .locals 7

    .line 1
    invoke-static {p1}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lwo0;

    .line 6
    .line 7
    iget v0, v0, Lwo0;->c:I

    .line 8
    .line 9
    invoke-static {p1}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lwo0;

    .line 14
    .line 15
    iget v1, v1, Lwo0;->c:I

    .line 16
    .line 17
    if-gt p0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Index "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, " should be less or equal than last line\'s end "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lx10;->a(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x1

    .line 50
    sub-int/2addr v0, v1

    .line 51
    const/4 v2, 0x0

    .line 52
    move v3, v2

    .line 53
    :goto_1
    if-gt v3, v0, :cond_4

    .line 54
    .line 55
    add-int v4, v3, v0

    .line 56
    .line 57
    ushr-int/2addr v4, v1

    .line 58
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Lwo0;

    .line 63
    .line 64
    iget v6, v5, Lwo0;->b:I

    .line 65
    .line 66
    if-le v6, p0, :cond_1

    .line 67
    .line 68
    move v5, v1

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    iget v5, v5, Lwo0;->c:I

    .line 71
    .line 72
    if-gt v5, p0, :cond_2

    .line 73
    .line 74
    const/4 v5, -0x1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    move v5, v2

    .line 77
    :goto_2
    if-gez v5, :cond_3

    .line 78
    .line 79
    add-int/lit8 v3, v4, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    if-lez v5, :cond_5

    .line 83
    .line 84
    add-int/lit8 v0, v4, -0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    add-int/2addr v3, v1

    .line 88
    neg-int v4, v3

    .line 89
    :cond_5
    if-ltz v4, :cond_6

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-ge v4, v0, :cond_6

    .line 96
    .line 97
    return v4

    .line 98
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v1, "Found paragraph index "

    .line 101
    .line 102
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, " should be in range [0, "

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, ").\nDebug info: index="

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p0, ", paragraphs=["

    .line 129
    .line 130
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    new-instance p0, Lpg0;

    .line 134
    .line 135
    invoke-direct {p0, v2}, Lpg0;-><init>(I)V

    .line 136
    .line 137
    .line 138
    const/16 v1, 0x1f

    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-static {p1, v2, p0, v1}, Lya0;->a(Ljava/util/List;Ljava/lang/String;Lpg0;I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const/16 p0, 0x5d

    .line 149
    .line 150
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, Lx10;->a(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return v4
.end method

.method public static final r(ILjava/util/List;)I
    .locals 7

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-gt v3, v0, :cond_4

    .line 10
    .line 11
    add-int v4, v3, v0

    .line 12
    .line 13
    ushr-int/2addr v4, v1

    .line 14
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, Lwo0;

    .line 19
    .line 20
    iget v6, v5, Lwo0;->d:I

    .line 21
    .line 22
    if-le v6, p0, :cond_0

    .line 23
    .line 24
    move v5, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget v5, v5, Lwo0;->e:I

    .line 27
    .line 28
    if-gt v5, p0, :cond_1

    .line 29
    .line 30
    const/4 v5, -0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v2

    .line 33
    :goto_1
    if-gez v5, :cond_2

    .line 34
    .line 35
    add-int/lit8 v3, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    if-lez v5, :cond_3

    .line 39
    .line 40
    add-int/lit8 v0, v4, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return v4

    .line 44
    :cond_4
    add-int/2addr v3, v1

    .line 45
    neg-int p0, v3

    .line 46
    return p0
.end method

.method public static final s(Ldv;Lrp;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldv;->B0()Lcv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v2, :cond_6

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ldv;->y0()Lav;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-boolean v0, v0, Lav;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Lrp;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_0
    invoke-static {p0, p1}, Lw60;->D(Ldv;Lrp;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_1
    invoke-static {}, Lxc;->j()V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_2
    invoke-static {p0}, Li4;->q(Ldv;)Ldv;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    invoke-static {v0, p1}, Lw60;->s(Ldv;Lrp;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_4

    .line 60
    .line 61
    invoke-static {p0, v0, v2, p1}, Lw60;->t(Ldv;Ldv;ILrp;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return v1

    .line 69
    :cond_4
    :goto_0
    return v2

    .line 70
    :cond_5
    const-string p0, "ActiveParent must have a focusedChild"

    .line 71
    .line 72
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v1

    .line 76
    :cond_6
    invoke-static {p0, p1}, Lw60;->D(Ldv;Lrp;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public static final t(Ldv;Ldv;ILrp;)Z
    .locals 8

    .line 1
    invoke-static {p0, p1, p2, p3}, Lw60;->I(Ldv;Ldv;ILrp;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p0}, Lpf1;->R(Lrm;)Ldn0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lw3;

    .line 14
    .line 15
    invoke-virtual {v0}, Lw3;->getFocusOwner()Lwu;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lzu;

    .line 20
    .line 21
    invoke-virtual {v0}, Lzu;->f()Ldv;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v1, Lhl0;

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    move-object v3, p0

    .line 29
    move-object v4, p1

    .line 30
    move v5, p2

    .line 31
    move-object v6, p3

    .line 32
    invoke-direct/range {v1 .. v7}, Lhl0;-><init>(Ldv;Ldv;Ljava/lang/Object;ILrp;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v5, v1}, Li4;->E(Ldv;ILsw;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final u(Lzn0;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lzn0;->e:Lum0;

    .line 2
    .line 3
    sget-object v1, Lum0;->d:Lum0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lzn0;->g()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide v2, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr v0, v2

    .line 17
    :goto_0
    long-to-int p0, v0

    .line 18
    return p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lzn0;->g()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const/16 p0, 0x20

    .line 24
    .line 25
    shr-long/2addr v0, p0

    .line 26
    goto :goto_0
.end method

.method public static final v(Lsz0;Le01;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lsz0;->d:Ljh0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    :cond_0
    return-object p0
.end method

.method public static final w(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "No valid saved state was found for the key \'"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, "\'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public static final x(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static final y(Lji;Ljava/lang/Integer;Lww;)V
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lpi;

    .line 3
    .line 4
    iget-boolean v0, v0, Lpi;->S:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lpi;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Lpi;->b(Lww;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public static final z([F)Z
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    aget v0, p0, v2

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    cmpg-float v0, v0, v1

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    aget v3, p0, v0

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    cmpg-float v3, v3, v4

    .line 21
    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    aget v3, p0, v3

    .line 26
    .line 27
    cmpg-float v3, v3, v4

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    aget v3, p0, v3

    .line 33
    .line 34
    cmpg-float v3, v3, v4

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    aget v3, p0, v3

    .line 40
    .line 41
    cmpg-float v3, v3, v4

    .line 42
    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x5

    .line 46
    aget v3, p0, v3

    .line 47
    .line 48
    cmpg-float v3, v3, v1

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    const/4 v3, 0x6

    .line 53
    aget v3, p0, v3

    .line 54
    .line 55
    cmpg-float v3, v3, v4

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    const/4 v3, 0x7

    .line 60
    aget v3, p0, v3

    .line 61
    .line 62
    cmpg-float v3, v3, v4

    .line 63
    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    const/16 v3, 0x8

    .line 67
    .line 68
    aget v3, p0, v3

    .line 69
    .line 70
    cmpg-float v3, v3, v4

    .line 71
    .line 72
    if-nez v3, :cond_1

    .line 73
    .line 74
    const/16 v3, 0x9

    .line 75
    .line 76
    aget v3, p0, v3

    .line 77
    .line 78
    cmpg-float v3, v3, v4

    .line 79
    .line 80
    if-nez v3, :cond_1

    .line 81
    .line 82
    const/16 v3, 0xa

    .line 83
    .line 84
    aget v3, p0, v3

    .line 85
    .line 86
    cmpg-float v3, v3, v1

    .line 87
    .line 88
    if-nez v3, :cond_1

    .line 89
    .line 90
    const/16 v3, 0xb

    .line 91
    .line 92
    aget v3, p0, v3

    .line 93
    .line 94
    cmpg-float v3, v3, v4

    .line 95
    .line 96
    if-nez v3, :cond_1

    .line 97
    .line 98
    const/16 v3, 0xc

    .line 99
    .line 100
    aget v3, p0, v3

    .line 101
    .line 102
    cmpg-float v3, v3, v4

    .line 103
    .line 104
    if-nez v3, :cond_1

    .line 105
    .line 106
    const/16 v3, 0xd

    .line 107
    .line 108
    aget v3, p0, v3

    .line 109
    .line 110
    cmpg-float v3, v3, v4

    .line 111
    .line 112
    if-nez v3, :cond_1

    .line 113
    .line 114
    const/16 v3, 0xe

    .line 115
    .line 116
    aget v3, p0, v3

    .line 117
    .line 118
    cmpg-float v3, v3, v4

    .line 119
    .line 120
    if-nez v3, :cond_1

    .line 121
    .line 122
    const/16 v3, 0xf

    .line 123
    .line 124
    aget p0, p0, v3

    .line 125
    .line 126
    cmpg-float p0, p0, v1

    .line 127
    .line 128
    if-nez p0, :cond_1

    .line 129
    .line 130
    return v0

    .line 131
    :cond_1
    return v2
.end method
