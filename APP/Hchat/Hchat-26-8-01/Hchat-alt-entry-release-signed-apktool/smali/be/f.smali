.class public final Lbe/f;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lbe/f;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static i(Lud/r;[Lud/p;ILod/a;)Lae/f;
    .locals 3

    .line 1
    aget-object v0, p1, p2

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object p1, Lmd/b;->E:Lmd/b;

    .line 6
    .line 7
    iget-object v1, v0, Lmd/e;->g:Lmd/f;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lae/c;

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iget-object p1, p1, Lae/c;->g:Lae/f;

    .line 18
    .line 19
    invoke-virtual {p1, p0, p3}, Lae/f;->a(Lud/r;Lod/a;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object p1

    .line 28
    :cond_1
    new-instance v0, Lud/p;

    .line 29
    .line 30
    sget-object v1, Lpd/k;->Q:Lpd/k;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, v1, v2}, Lud/p;-><init>(Lpd/k;I)V

    .line 34
    .line 35
    .line 36
    iput p2, v0, Lud/p;->n:I

    .line 37
    .line 38
    sget-object v1, Lmd/a;->m:Lmd/a;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 41
    .line 42
    .line 43
    aput-object v0, p1, p2

    .line 44
    .line 45
    :cond_2
    new-instance p1, Lae/f;

    .line 46
    .line 47
    invoke-direct {p1, p2}, Lae/f;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0, p3}, Lae/f;->a(Lud/r;Lod/a;)Z

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lud/r;->E:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    new-instance p2, Ljava/util/ArrayList;

    .line 62
    .line 63
    const/4 p3, 0x2

    .line 64
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lud/r;->E:Ljava/util/List;

    .line 68
    .line 69
    :cond_3
    iget-object p0, p0, Lud/r;->E:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    new-instance p0, Lae/c;

    .line 75
    .line 76
    invoke-direct {p0, p1}, Lae/c;-><init>(Lae/f;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p0}, Lmd/e;->y(Loc/b;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method


# virtual methods
.method public final g(Lud/r;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-boolean v1, v0, Lud/r;->p:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_d

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Lud/r;->y:[Lud/p;

    .line 10
    .line 11
    iget-object v2, v0, Lud/r;->n:La5/a;

    .line 12
    .line 13
    iget-object v3, v2, La5/a;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lac/k;

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    invoke-virtual {v3, v4}, Lac/k;->B(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Lac/k;->L()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x1

    .line 26
    const/4 v7, -0x1

    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    move v5, v7

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v2}, La5/a;->f()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    rem-int/lit8 v9, v5, 0x2

    .line 36
    .line 37
    const/4 v10, 0x2

    .line 38
    if-ne v9, v6, :cond_2

    .line 39
    .line 40
    move v9, v10

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v9, 0x0

    .line 43
    :goto_0
    const/16 v11, 0x10

    .line 44
    .line 45
    invoke-static {v5, v10, v11, v9}, Lp/a;->g(IIII)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    :goto_1
    if-ne v5, v7, :cond_3

    .line 50
    .line 51
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 52
    .line 53
    move/from16 v16, v6

    .line 54
    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_3
    iget-object v2, v2, La5/a;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lac/k;

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Lac/k;->B(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lac/k;->L()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    mul-int/lit8 v4, v2, 0x8

    .line 69
    .line 70
    add-int/2addr v4, v5

    .line 71
    invoke-virtual {v3}, Lac/k;->g()Lac/k;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    iget-object v10, v3, Lac/k;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v10, Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Lac/k;->B(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    new-instance v12, Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-direct {v12, v11}, Ljava/util/HashMap;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    :goto_2
    if-ge v13, v11, :cond_6

    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    sub-int/2addr v14, v4

    .line 103
    invoke-virtual {v3}, Lac/k;->I()I

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    move/from16 v16, v6

    .line 108
    .line 109
    invoke-static {v15}, Ljava/lang/Math;->abs(I)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    new-array v8, v6, [I

    .line 114
    .line 115
    new-array v7, v6, [Ljava/lang/String;

    .line 116
    .line 117
    move/from16 v17, v4

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    :goto_3
    if-ge v4, v6, :cond_4

    .line 121
    .line 122
    move/from16 v18, v4

    .line 123
    .line 124
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-virtual {v9, v4}, Lac/k;->y(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    aput-object v4, v7, v18

    .line 133
    .line 134
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    aput v4, v8, v18

    .line 139
    .line 140
    add-int/lit8 v4, v18, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    if-gtz v15, :cond_5

    .line 144
    .line 145
    invoke-static {v3}, La/a;->H0(Lac/k;)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    goto :goto_4

    .line 150
    :cond_5
    const/4 v4, -0x1

    .line 151
    :goto_4
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    new-instance v14, Lqc/b;

    .line 156
    .line 157
    invoke-direct {v14, v8, v7, v4}, Lqc/b;-><init>([I[Ljava/lang/String;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v6, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    add-int/lit8 v13, v13, 0x1

    .line 164
    .line 165
    move/from16 v6, v16

    .line 166
    .line 167
    move/from16 v4, v17

    .line 168
    .line 169
    const/4 v7, -0x1

    .line 170
    goto :goto_2

    .line 171
    :cond_6
    move/from16 v16, v6

    .line 172
    .line 173
    invoke-virtual {v3, v5}, Lac/k;->B(I)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 179
    .line 180
    .line 181
    const/4 v5, 0x0

    .line 182
    :goto_5
    if-ge v5, v2, :cond_8

    .line 183
    .line 184
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->getInt()I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    invoke-virtual {v3}, Lac/k;->L()I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    invoke-virtual {v3}, Lac/k;->L()I

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    invoke-virtual {v12, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    check-cast v9, Lqc/b;

    .line 205
    .line 206
    if-eqz v9, :cond_7

    .line 207
    .line 208
    new-instance v8, Lqc/f;

    .line 209
    .line 210
    add-int/2addr v7, v6

    .line 211
    add-int/lit8 v7, v7, -0x1

    .line 212
    .line 213
    invoke-direct {v8, v6, v7, v9}, Lqc/f;-><init>(IILqc/b;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    add-int/lit8 v5, v5, 0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    new-instance v0, Laf/d;

    .line 223
    .line 224
    const-string v1, "Catch handler not found by byte offset: "

    .line 225
    .line 226
    invoke-static {v8, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v0

    .line 234
    :cond_8
    move-object v2, v4

    .line 235
    :goto_6
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_9

    .line 240
    .line 241
    goto/16 :goto_d

    .line 242
    .line 243
    :cond_9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-eqz v3, :cond_17

    .line 252
    .line 253
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Lqc/f;

    .line 258
    .line 259
    iget-object v4, v3, Lqc/f;->c:Lqc/b;

    .line 260
    .line 261
    iget v5, v3, Lqc/f;->a:I

    .line 262
    .line 263
    iget-object v6, v4, Lqc/b;->a:[I

    .line 264
    .line 265
    iget-object v7, v4, Lqc/b;->b:[Ljava/lang/String;

    .line 266
    .line 267
    array-length v8, v6

    .line 268
    new-instance v9, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 271
    .line 272
    .line 273
    const/4 v10, 0x0

    .line 274
    :goto_8
    if-ge v10, v8, :cond_b

    .line 275
    .line 276
    aget v11, v6, v10

    .line 277
    .line 278
    iget-object v12, v0, Lud/r;->l:Lud/e;

    .line 279
    .line 280
    iget-object v12, v12, Lud/e;->k:Lud/u;

    .line 281
    .line 282
    aget-object v13, v7, v10

    .line 283
    .line 284
    invoke-static {v12, v13}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    invoke-static {v0, v1, v11, v12}, Lbe/f;->i(Lud/r;[Lud/p;ILod/a;)Lae/f;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    if-eqz v11, :cond_a

    .line 293
    .line 294
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_b
    iget v4, v4, Lqc/b;->c:I

    .line 301
    .line 302
    const/4 v6, 0x0

    .line 303
    if-ltz v4, :cond_c

    .line 304
    .line 305
    invoke-static {v0, v1, v4, v6}, Lbe/f;->i(Lud/r;[Lud/p;ILod/a;)Lae/f;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    if-eqz v4, :cond_c

    .line 310
    .line 311
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    :cond_c
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_d

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_d
    new-instance v4, Lae/a;

    .line 322
    .line 323
    const/4 v7, 0x0

    .line 324
    invoke-direct {v4, v7}, Lae/a;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-static {v4}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 332
    .line 333
    .line 334
    new-instance v4, Lae/b;

    .line 335
    .line 336
    invoke-direct {v4, v9}, Lae/b;-><init>(Ljava/util/List;)V

    .line 337
    .line 338
    .line 339
    iget v3, v3, Lqc/f;->b:I

    .line 340
    .line 341
    move v7, v5

    .line 342
    const/4 v8, 0x0

    .line 343
    :cond_e
    sget-object v9, Lmd/a;->i:Lmd/a;

    .line 344
    .line 345
    if-gt v7, v3, :cond_15

    .line 346
    .line 347
    aget-object v10, v1, v7

    .line 348
    .line 349
    if-eqz v10, :cond_14

    .line 350
    .line 351
    sget-object v6, Lmd/b;->F:Lmd/b;

    .line 352
    .line 353
    iget-object v11, v10, Lmd/e;->g:Lmd/f;

    .line 354
    .line 355
    invoke-virtual {v11, v6}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    check-cast v6, Lae/b;

    .line 360
    .line 361
    if-eqz v6, :cond_12

    .line 362
    .line 363
    iget-object v6, v6, Lae/b;->g:Ljava/util/List;

    .line 364
    .line 365
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    iget-object v12, v4, Lae/b;->g:Ljava/util/List;

    .line 370
    .line 371
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 372
    .line 373
    .line 374
    move-result v13

    .line 375
    if-nez v11, :cond_f

    .line 376
    .line 377
    if-nez v13, :cond_f

    .line 378
    .line 379
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_f
    if-nez v11, :cond_10

    .line 383
    .line 384
    move-object v6, v12

    .line 385
    goto :goto_9

    .line 386
    :cond_10
    if-nez v13, :cond_11

    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_11
    new-instance v14, Ljava/util/ArrayList;

    .line 390
    .line 391
    add-int/2addr v11, v13

    .line 392
    invoke-direct {v14, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 396
    .line 397
    .line 398
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 399
    .line 400
    .line 401
    move-object v6, v14

    .line 402
    :goto_9
    new-instance v11, Lae/a;

    .line 403
    .line 404
    const/4 v12, 0x0

    .line 405
    invoke-direct {v11, v12}, Lae/a;-><init>(I)V

    .line 406
    .line 407
    .line 408
    invoke-static {v11}, Ljava/util/Comparator;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    .line 409
    .line 410
    .line 411
    move-result-object v11

    .line 412
    invoke-interface {v6, v11}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 413
    .line 414
    .line 415
    new-instance v11, Lae/b;

    .line 416
    .line 417
    invoke-direct {v11, v6}, Lae/b;-><init>(Ljava/util/List;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v10, v11}, Lmd/e;->y(Loc/b;)V

    .line 421
    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_12
    invoke-virtual {v10, v4}, Lmd/e;->y(Loc/b;)V

    .line 425
    .line 426
    .line 427
    :goto_a
    if-nez v8, :cond_13

    .line 428
    .line 429
    invoke-virtual {v10, v9}, Lmd/e;->w(Lmd/a;)V

    .line 430
    .line 431
    .line 432
    move-object v6, v10

    .line 433
    move/from16 v8, v16

    .line 434
    .line 435
    goto :goto_b

    .line 436
    :cond_13
    move-object v6, v10

    .line 437
    :cond_14
    :goto_b
    invoke-static {v1, v7}, Lbe/b;->E([Lud/p;I)I

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    const/4 v10, -0x1

    .line 442
    if-ne v7, v10, :cond_e

    .line 443
    .line 444
    goto :goto_c

    .line 445
    :cond_15
    const/4 v10, -0x1

    .line 446
    :goto_c
    sget-object v3, Lmd/a;->j:Lmd/a;

    .line 447
    .line 448
    if-eqz v8, :cond_16

    .line 449
    .line 450
    invoke-virtual {v6, v3}, Lmd/e;->w(Lmd/a;)V

    .line 451
    .line 452
    .line 453
    const/4 v8, 0x0

    .line 454
    goto/16 :goto_7

    .line 455
    .line 456
    :cond_16
    new-instance v6, Lud/p;

    .line 457
    .line 458
    sget-object v7, Lpd/k;->Q:Lpd/k;

    .line 459
    .line 460
    const/4 v8, 0x0

    .line 461
    invoke-direct {v6, v7, v8}, Lud/p;-><init>(Lpd/k;I)V

    .line 462
    .line 463
    .line 464
    iput v5, v6, Lud/p;->n:I

    .line 465
    .line 466
    sget-object v7, Lmd/a;->m:Lmd/a;

    .line 467
    .line 468
    invoke-virtual {v6, v7}, Lmd/e;->w(Lmd/a;)V

    .line 469
    .line 470
    .line 471
    aput-object v6, v1, v5

    .line 472
    .line 473
    invoke-virtual {v6, v9}, Lmd/e;->w(Lmd/a;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v6, v3}, Lmd/e;->w(Lmd/a;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v6, v4}, Lmd/e;->y(Loc/b;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_7

    .line 483
    .line 484
    :cond_17
    :goto_d
    return-void
.end method
