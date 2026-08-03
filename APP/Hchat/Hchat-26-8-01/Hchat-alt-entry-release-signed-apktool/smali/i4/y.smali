.class public final Li4/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:I

.field public b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li4/z;Li4/i;Ljava/util/ArrayList;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li4/y;->g:Ljava/lang/Object;

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li4/y;->c:Ljava/lang/Object;

    .line 47
    new-instance v0, Ljava/util/BitSet;

    .line 48
    iget p1, p1, Li4/z;->d:I

    .line 49
    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Li4/y;->d:Ljava/lang/Object;

    .line 50
    iput-object p2, p0, Li4/y;->e:Ljava/lang/Object;

    .line 51
    iput-object p3, p0, Li4/y;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lud/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li4/y;->c:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Lle/c;

    .line 7
    .line 8
    invoke-direct {v0}, Lle/c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Li4/y;->d:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Lle/a;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0}, Lle/a;-><init>(Lud/r;Li4/y;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Li4/y;->e:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v1, Lb5/c;

    .line 21
    .line 22
    invoke-direct {v1, p1, p0, v0}, Lb5/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Li4/y;->f:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v0, Lze/c;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lze/c;-><init>(Lud/r;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Li4/y;->g:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object p1, p1, Lud/r;->z:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    mul-int/lit8 p1, p1, 0x64

    .line 41
    .line 42
    iput p1, p0, Li4/y;->a:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public a(Lu4/b;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li4/y;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v3, v0, Li4/y;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Li4/z;

    .line 12
    .line 13
    iget-object v4, v1, Lu4/b;->c:Lz4/g;

    .line 14
    .line 15
    iget v5, v1, Lu4/b;->a:I

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-virtual {v4, v6}, Lz4/g;->n(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    iput v4, v0, Li4/y;->b:I

    .line 23
    .line 24
    iget-object v4, v1, Lu4/b;->c:Lz4/g;

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    invoke-virtual {v4, v7}, Lz4/g;->n(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    iput v4, v0, Li4/y;->a:I

    .line 32
    .line 33
    invoke-virtual {v0, v4}, Li4/y;->c(I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget-object v8, v0, Li4/y;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v8, Ljava/util/BitSet;

    .line 40
    .line 41
    invoke-virtual {v8, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    :goto_0
    if-ltz v9, :cond_d

    .line 46
    .line 47
    invoke-virtual {v8, v9}, Ljava/util/BitSet;->clear(I)V

    .line 48
    .line 49
    .line 50
    iget-object v10, v0, Li4/y;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v10, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    invoke-virtual {v10, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    check-cast v10, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    invoke-virtual {v3, v9}, Li4/z;->j(I)Lu4/b;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    iget-object v12, v11, Lu4/b;->c:Lz4/g;

    .line 73
    .line 74
    invoke-virtual {v3, v11}, Li4/z;->h(Lu4/b;)Z

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    if-eqz v13, :cond_0

    .line 79
    .line 80
    invoke-virtual {v12, v6}, Lz4/g;->n(I)I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    invoke-virtual {v0, v13}, Li4/y;->c(I)I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    invoke-virtual {v12, v7}, Lz4/g;->n(I)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    new-instance v15, Lz4/g;

    .line 93
    .line 94
    move/from16 v16, v7

    .line 95
    .line 96
    const/4 v7, 0x2

    .line 97
    invoke-direct {v15, v7}, Lz4/g;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v15, v13}, Lz4/g;->l(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v15, v12}, Lz4/g;->l(I)V

    .line 104
    .line 105
    .line 106
    iput-boolean v6, v15, Lz4/j;->g:Z

    .line 107
    .line 108
    const/4 v14, -0x1

    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_0
    move/from16 v16, v7

    .line 112
    .line 113
    iget-object v7, v3, Li4/z;->l:[Lf1/h;

    .line 114
    .line 115
    array-length v13, v7

    .line 116
    add-int/lit8 v13, v13, -0x1

    .line 117
    .line 118
    :goto_1
    if-ltz v13, :cond_2

    .line 119
    .line 120
    aget-object v15, v7, v13

    .line 121
    .line 122
    if-eqz v15, :cond_1

    .line 123
    .line 124
    iget-object v14, v15, Lf1/h;->j:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v14, Ljava/util/BitSet;

    .line 127
    .line 128
    invoke-virtual {v14, v9}, Ljava/util/BitSet;->get(I)Z

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    if-eqz v14, :cond_1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_1
    add-int/lit8 v13, v13, -0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_2
    const/4 v15, 0x0

    .line 139
    :goto_2
    if-eqz v15, :cond_4

    .line 140
    .line 141
    iget v7, v15, Lf1/h;->h:I

    .line 142
    .line 143
    iget v12, v0, Li4/y;->a:I

    .line 144
    .line 145
    if-ne v7, v12, :cond_3

    .line 146
    .line 147
    iget v7, v0, Li4/y;->b:I

    .line 148
    .line 149
    invoke-static {v7}, Lz4/g;->o(I)Lz4/g;

    .line 150
    .line 151
    .line 152
    move-result-object v15

    .line 153
    iget v14, v0, Li4/y;->b:I

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_3
    new-instance v1, Ljava/lang/RuntimeException;

    .line 157
    .line 158
    invoke-static {v7}, La/a;->X0(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iget v3, v0, Li4/y;->a:I

    .line 163
    .line 164
    invoke-static {v3}, La/a;->X0(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    new-instance v4, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v5, "ret instruction returns to label "

    .line 171
    .line 172
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v2, " expected: "

    .line 179
    .line 180
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw v1

    .line 194
    :cond_4
    iget v7, v11, Lu4/b;->d:I

    .line 195
    .line 196
    iget v13, v12, Lz4/g;->i:I

    .line 197
    .line 198
    new-instance v15, Lz4/g;

    .line 199
    .line 200
    invoke-direct {v15, v13}, Lz4/g;-><init>(I)V

    .line 201
    .line 202
    .line 203
    const/4 v14, -0x1

    .line 204
    :goto_3
    if-ge v6, v13, :cond_6

    .line 205
    .line 206
    move/from16 v17, v13

    .line 207
    .line 208
    invoke-virtual {v12, v6}, Lz4/g;->n(I)I

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    move/from16 v18, v6

    .line 213
    .line 214
    invoke-virtual {v0, v13}, Li4/y;->c(I)I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    invoke-virtual {v15, v6}, Lz4/g;->l(I)V

    .line 219
    .line 220
    .line 221
    if-ne v7, v13, :cond_5

    .line 222
    .line 223
    move v14, v6

    .line 224
    :cond_5
    add-int/lit8 v6, v18, 0x1

    .line 225
    .line 226
    move/from16 v13, v17

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_6
    const/4 v6, 0x0

    .line 230
    iput-boolean v6, v15, Lz4/j;->g:Z

    .line 231
    .line 232
    :goto_4
    new-instance v6, Lu4/b;

    .line 233
    .line 234
    iget-object v7, v11, Lu4/b;->b:Lh4/u;

    .line 235
    .line 236
    iget-object v11, v7, Lz4/e;->h:[Ljava/lang/Object;

    .line 237
    .line 238
    array-length v11, v11

    .line 239
    const/4 v12, 0x0

    .line 240
    const/4 v13, 0x0

    .line 241
    :goto_5
    if-ge v12, v11, :cond_8

    .line 242
    .line 243
    invoke-virtual {v7, v12}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v17

    .line 247
    move/from16 v18, v12

    .line 248
    .line 249
    move-object/from16 v12, v17

    .line 250
    .line 251
    check-cast v12, Lu4/i;

    .line 252
    .line 253
    iget-object v12, v12, Lu4/i;->g:Lu4/r;

    .line 254
    .line 255
    move/from16 v17, v4

    .line 256
    .line 257
    sget-object v4, Lu4/s;->g:Lu4/r;

    .line 258
    .line 259
    if-eq v12, v4, :cond_7

    .line 260
    .line 261
    add-int/lit8 v13, v13, 0x1

    .line 262
    .line 263
    :cond_7
    add-int/lit8 v12, v18, 0x1

    .line 264
    .line 265
    move/from16 v4, v17

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_8
    move/from16 v17, v4

    .line 269
    .line 270
    if-ne v13, v11, :cond_9

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_9
    new-instance v4, Lh4/u;

    .line 274
    .line 275
    invoke-direct {v4, v13}, Lz4/e;-><init>(I)V

    .line 276
    .line 277
    .line 278
    const/4 v12, 0x0

    .line 279
    const/4 v13, 0x0

    .line 280
    :goto_6
    if-ge v12, v11, :cond_b

    .line 281
    .line 282
    invoke-virtual {v7, v12}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v18

    .line 286
    move-object/from16 v19, v7

    .line 287
    .line 288
    move-object/from16 v7, v18

    .line 289
    .line 290
    check-cast v7, Lu4/i;

    .line 291
    .line 292
    move/from16 v18, v11

    .line 293
    .line 294
    iget-object v11, v7, Lu4/i;->g:Lu4/r;

    .line 295
    .line 296
    move/from16 v20, v12

    .line 297
    .line 298
    sget-object v12, Lu4/s;->g:Lu4/r;

    .line 299
    .line 300
    if-eq v11, v12, :cond_a

    .line 301
    .line 302
    add-int/lit8 v11, v13, 0x1

    .line 303
    .line 304
    invoke-virtual {v4, v13, v7}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    move v13, v11

    .line 308
    :cond_a
    add-int/lit8 v12, v20, 0x1

    .line 309
    .line 310
    move/from16 v11, v18

    .line 311
    .line 312
    move-object/from16 v7, v19

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_b
    const/4 v7, 0x0

    .line 316
    iput-boolean v7, v4, Lz4/j;->g:Z

    .line 317
    .line 318
    move-object v7, v4

    .line 319
    :goto_7
    invoke-direct {v6, v10, v7, v15, v14}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    check-cast v4, Lz4/g;

    .line 327
    .line 328
    invoke-virtual {v3, v6, v4}, Li4/z;->a(Lu4/b;Lz4/g;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v9}, Li4/z;->j(I)Lu4/b;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v3, v4}, Li4/z;->h(Lu4/b;)Z

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-eqz v4, :cond_c

    .line 340
    .line 341
    new-instance v4, Li4/y;

    .line 342
    .line 343
    iget-object v6, v0, Li4/y;->e:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v6, Li4/i;

    .line 346
    .line 347
    invoke-direct {v4, v3, v6, v2}, Li4/y;-><init>(Li4/z;Li4/i;Ljava/util/ArrayList;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3, v10}, Li4/z;->j(I)Lu4/b;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    invoke-virtual {v4, v6}, Li4/y;->a(Lu4/b;)V

    .line 355
    .line 356
    .line 357
    :cond_c
    const/4 v6, 0x0

    .line 358
    invoke-virtual {v8, v6}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    move/from16 v7, v16

    .line 363
    .line 364
    move/from16 v4, v17

    .line 365
    .line 366
    goto/16 :goto_0

    .line 367
    .line 368
    :cond_d
    move/from16 v17, v4

    .line 369
    .line 370
    new-instance v4, Lu4/b;

    .line 371
    .line 372
    iget-object v1, v1, Lu4/b;->b:Lh4/u;

    .line 373
    .line 374
    invoke-static/range {v17 .. v17}, Lz4/g;->o(I)Lz4/g;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    move/from16 v7, v17

    .line 379
    .line 380
    invoke-direct {v4, v5, v1, v6, v7}, Lu4/b;-><init>(ILh4/u;Lz4/g;I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, Lz4/g;

    .line 388
    .line 389
    iget-object v2, v3, Li4/z;->i:Ljava/util/ArrayList;

    .line 390
    .line 391
    iget-object v5, v3, Li4/z;->h:Ljava/util/ArrayList;

    .line 392
    .line 393
    iget v6, v4, Lu4/b;->a:I

    .line 394
    .line 395
    invoke-virtual {v3, v6}, Li4/z;->k(I)I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-gez v3, :cond_e

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_e
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    :goto_8
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1}, Lz4/j;->k()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    return-void
.end method

.method public b(Lud/a;)Lxd/b;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li4/y;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lud/r;

    .line 8
    .line 9
    iget-object v3, v0, Li4/y;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lze/c;

    .line 12
    .line 13
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v4, Lxd/b;

    .line 17
    .line 18
    iget-object v5, v0, Li4/y;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, Lle/c;

    .line 21
    .line 22
    iget-object v6, v5, Lle/c;->b:Lle/b;

    .line 23
    .line 24
    iget-object v6, v6, Lle/b;->b:Lxd/a;

    .line 25
    .line 26
    invoke-direct {v4, v6}, Lxd/b;-><init>(Lud/n;)V

    .line 27
    .line 28
    .line 29
    iget-object v6, v5, Lle/c;->b:Lle/b;

    .line 30
    .line 31
    iget-object v6, v6, Lle/b;->a:Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-virtual {v6, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    sget-object v7, Lpd/k;->U:Lpd/k;

    .line 38
    .line 39
    sget-object v8, Lmd/b;->A:Lmd/b;

    .line 40
    .line 41
    if-eqz v6, :cond_6

    .line 42
    .line 43
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 44
    .line 45
    invoke-virtual {v1, v8}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    :cond_0
    move-object v14, v0

    .line 56
    move-object v10, v4

    .line 57
    goto/16 :goto_31

    .line 58
    .line 59
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Lnd/f;

    .line 83
    .line 84
    iget-object v5, v5, Lnd/f;->i:Lud/p;

    .line 85
    .line 86
    iget-object v6, v5, Lud/p;->k:Lpd/k;

    .line 87
    .line 88
    sget-object v8, Lpd/k;->T:Lpd/k;

    .line 89
    .line 90
    if-ne v6, v8, :cond_2

    .line 91
    .line 92
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lnd/f;

    .line 110
    .line 111
    iget-object v3, v3, Lnd/f;->i:Lud/p;

    .line 112
    .line 113
    iget-object v5, v3, Lud/p;->k:Lpd/k;

    .line 114
    .line 115
    if-ne v5, v7, :cond_4

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :cond_5
    new-instance v1, Lud/o;

    .line 121
    .line 122
    invoke-direct {v1, v2}, Lud/o;-><init>(Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4, v1}, Lxd/b;->H(Lud/j;)V

    .line 126
    .line 127
    .line 128
    return-object v4

    .line 129
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v3, v3, Lze/c;->h:Ljava/util/BitSet;

    .line 133
    .line 134
    iget v6, v1, Lud/a;->j:I

    .line 135
    .line 136
    invoke-virtual {v3, v6}, Ljava/util/BitSet;->get(I)Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    invoke-virtual {v3, v6}, Ljava/util/BitSet;->set(I)V

    .line 141
    .line 142
    .line 143
    if-eqz v9, :cond_7

    .line 144
    .line 145
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 150
    .line 151
    invoke-virtual {v1}, Lmd/f;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v5, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v6, "Removed duplicated region for block: "

    .line 158
    .line 159
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v3, " "

    .line 166
    .line 167
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v2, v1}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-object v4

    .line 181
    :cond_7
    :goto_0
    if-eqz v1, :cond_0

    .line 182
    .line 183
    iget-object v6, v0, Li4/y;->f:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v6, Lb5/c;

    .line 186
    .line 187
    sget-object v9, Lmd/a;->h:Lmd/a;

    .line 188
    .line 189
    iget-object v10, v1, Lmd/e;->g:Lmd/f;

    .line 190
    .line 191
    invoke-virtual {v10, v9}, Lmd/f;->a(Lmd/a;)Z

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    const/4 v10, 0x1

    .line 196
    if-eqz v9, :cond_9

    .line 197
    .line 198
    move-object v14, v0

    .line 199
    move-object v10, v4

    .line 200
    move-object v12, v8

    .line 201
    :cond_8
    const/4 v1, 0x0

    .line 202
    goto/16 :goto_30

    .line 203
    .line 204
    :cond_9
    sget-object v9, Lmd/b;->z:Lmd/b;

    .line 205
    .line 206
    iget-object v12, v1, Lmd/e;->g:Lmd/f;

    .line 207
    .line 208
    invoke-virtual {v12, v9}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    const/4 v13, 0x0

    .line 217
    if-eqz v12, :cond_c

    .line 218
    .line 219
    sget-object v14, Lmd/a;->k:Lmd/a;

    .line 220
    .line 221
    iget-object v15, v1, Lmd/e;->g:Lmd/f;

    .line 222
    .line 223
    invoke-virtual {v15, v14}, Lmd/f;->a(Lmd/a;)Z

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    if-eqz v14, :cond_c

    .line 228
    .line 229
    if-ne v12, v10, :cond_a

    .line 230
    .line 231
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    check-cast v9, Lnd/t;

    .line 236
    .line 237
    invoke-virtual {v6, v4, v9, v5}, Lb5/c;->H(Lxd/b;Lnd/t;Lle/c;)Lud/a;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    :goto_1
    move v9, v10

    .line 242
    goto :goto_2

    .line 243
    :cond_a
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    :cond_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v12

    .line 251
    if-eqz v12, :cond_c

    .line 252
    .line 253
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    check-cast v12, Lnd/t;

    .line 258
    .line 259
    iget-object v14, v12, Lnd/t;->a:Lud/a;

    .line 260
    .line 261
    if-ne v14, v1, :cond_b

    .line 262
    .line 263
    invoke-virtual {v6, v4, v12, v5}, Lb5/c;->H(Lxd/b;Lnd/t;Lle/c;)Lud/a;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    goto :goto_1

    .line 268
    :cond_c
    move v9, v13

    .line 269
    const/4 v6, 0x0

    .line 270
    :goto_2
    invoke-static {v1}, La/a;->c0(Lud/h;)Lud/p;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    iget-object v14, v4, Lxd/b;->k:Ljava/util/ArrayList;

    .line 275
    .line 276
    if-nez v9, :cond_d

    .line 277
    .line 278
    if-eqz v12, :cond_d

    .line 279
    .line 280
    iget-object v15, v12, Lud/p;->k:Lpd/k;

    .line 281
    .line 282
    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    .line 283
    .line 284
    .line 285
    move-result v15

    .line 286
    const/16 v11, 0xf

    .line 287
    .line 288
    sget-object v10, Lmd/a;->z:Lmd/a;

    .line 289
    .line 290
    if-eq v15, v11, :cond_4c

    .line 291
    .line 292
    const/16 v11, 0x10

    .line 293
    .line 294
    if-eq v15, v11, :cond_1b

    .line 295
    .line 296
    const/16 v10, 0x12

    .line 297
    .line 298
    if-eq v15, v10, :cond_e

    .line 299
    .line 300
    :cond_d
    move-object v10, v4

    .line 301
    move-object v12, v8

    .line 302
    move-object v11, v14

    .line 303
    goto/16 :goto_b

    .line 304
    .line 305
    :cond_e
    new-instance v6, Lle/f;

    .line 306
    .line 307
    invoke-direct {v6, v2, v0}, Lle/f;-><init>(Lud/r;Li4/y;)V

    .line 308
    .line 309
    .line 310
    new-instance v9, Lxd/e;

    .line 311
    .line 312
    invoke-direct {v9, v4, v12}, Lxd/e;-><init>(Lxd/b;Lud/p;)V

    .line 313
    .line 314
    .line 315
    iget-object v10, v9, Lxd/e;->m:Lxd/b;

    .line 316
    .line 317
    iget-object v11, v10, Lxd/b;->k:Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    new-instance v11, Ljava/util/LinkedHashSet;

    .line 326
    .line 327
    invoke-direct {v11}, Ljava/util/LinkedHashSet;-><init>()V

    .line 328
    .line 329
    .line 330
    new-instance v15, Ljava/util/HashSet;

    .line 331
    .line 332
    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v13}, Lud/p;->S(I)Lqd/l;

    .line 336
    .line 337
    .line 338
    move-result-object v12

    .line 339
    invoke-static {v9, v12, v1, v11, v15}, Lle/f;->a(Lxd/e;Lqd/l;Lud/a;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)V

    .line 340
    .line 341
    .line 342
    iget-object v12, v9, Lxd/e;->l:Ljava/util/ArrayList;

    .line 343
    .line 344
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v17

    .line 352
    if-eqz v17, :cond_10

    .line 353
    .line 354
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v17

    .line 358
    move-object/from16 v13, v17

    .line 359
    .line 360
    check-cast v13, Lud/p;

    .line 361
    .line 362
    move-object/from16 v17, v12

    .line 363
    .line 364
    iget-object v12, v2, Lud/r;->z:Ljava/util/List;

    .line 365
    .line 366
    invoke-static {v2, v13, v12}, La/a;->S(Lud/r;Lud/p;Ljava/util/List;)Lud/a;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    move-object/from16 v19, v8

    .line 371
    .line 372
    sget-object v8, Lmd/a;->s:Lmd/a;

    .line 373
    .line 374
    if-eqz v12, :cond_f

    .line 375
    .line 376
    invoke-virtual {v12, v8}, Lmd/e;->w(Lmd/a;)V

    .line 377
    .line 378
    .line 379
    :cond_f
    const/4 v12, 0x0

    .line 380
    invoke-virtual {v13, v12}, Lud/p;->a0(I)Lqd/l;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v13, v8}, Lmd/e;->w(Lmd/a;)V

    .line 384
    .line 385
    .line 386
    move-object/from16 v12, v17

    .line 387
    .line 388
    move-object/from16 v8, v19

    .line 389
    .line 390
    const/4 v13, 0x0

    .line 391
    goto :goto_3

    .line 392
    :cond_10
    move-object/from16 v19, v8

    .line 393
    .line 394
    invoke-static {v1}, La/a;->d0(Lud/a;)Lud/a;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    if-nez v8, :cond_11

    .line 399
    .line 400
    const-string v6, "Unexpected end of synchronized block"

    .line 401
    .line 402
    invoke-virtual {v2, v6}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    const/4 v6, 0x0

    .line 406
    goto/16 :goto_a

    .line 407
    .line 408
    :cond_11
    invoke-interface {v11}, Ljava/util/Set;->size()I

    .line 409
    .line 410
    .line 411
    move-result v12

    .line 412
    const/4 v13, 0x1

    .line 413
    if-ne v12, v13, :cond_12

    .line 414
    .line 415
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v12

    .line 419
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    check-cast v12, Lud/a;

    .line 424
    .line 425
    invoke-static {v12}, La/a;->d0(Lud/a;)Lud/a;

    .line 426
    .line 427
    .line 428
    move-result-object v12

    .line 429
    goto :goto_4

    .line 430
    :cond_12
    invoke-interface {v11}, Ljava/util/Set;->size()I

    .line 431
    .line 432
    .line 433
    move-result v12

    .line 434
    if-le v12, v13, :cond_13

    .line 435
    .line 436
    invoke-virtual {v15}, Ljava/util/HashSet;->clear()V

    .line 437
    .line 438
    .line 439
    invoke-static {v8, v11, v15}, Lle/f;->b(Lud/a;Ljava/util/LinkedHashSet;Ljava/util/HashSet;)Lud/a;

    .line 440
    .line 441
    .line 442
    move-result-object v12

    .line 443
    goto :goto_4

    .line 444
    :cond_13
    const/4 v12, 0x0

    .line 445
    :goto_4
    invoke-virtual {v5, v9}, Lle/c;->c(Lxd/a;)V

    .line 446
    .line 447
    .line 448
    if-eqz v12, :cond_14

    .line 449
    .line 450
    invoke-virtual {v5, v12}, Lle/c;->a(Lud/a;)V

    .line 451
    .line 452
    .line 453
    goto :goto_9

    .line 454
    :cond_14
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    if-eqz v11, :cond_1a

    .line 463
    .line 464
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    check-cast v11, Lud/a;

    .line 469
    .line 470
    invoke-static {v11}, La/a;->u(Lud/a;)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v13

    .line 474
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 475
    .line 476
    .line 477
    move-result v15

    .line 478
    if-nez v15, :cond_18

    .line 479
    .line 480
    invoke-static {v13}, Lxe/s;->i(Ljava/util/List;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v13

    .line 484
    check-cast v13, Lud/a;

    .line 485
    .line 486
    iget-object v15, v2, Lud/r;->C:Lud/a;

    .line 487
    .line 488
    if-ne v13, v15, :cond_15

    .line 489
    .line 490
    :goto_6
    move-object/from16 v17, v9

    .line 491
    .line 492
    const/4 v9, 0x1

    .line 493
    goto :goto_7

    .line 494
    :cond_15
    iget-object v13, v13, Lud/a;->n:Ljava/util/List;

    .line 495
    .line 496
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 497
    .line 498
    .line 499
    move-result v15

    .line 500
    if-eqz v15, :cond_16

    .line 501
    .line 502
    goto :goto_6

    .line 503
    :cond_16
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 504
    .line 505
    .line 506
    move-result v15

    .line 507
    move-object/from16 v17, v9

    .line 508
    .line 509
    const/4 v9, 0x1

    .line 510
    if-ne v15, v9, :cond_17

    .line 511
    .line 512
    const/4 v9, 0x0

    .line 513
    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v13

    .line 517
    check-cast v13, Lud/a;

    .line 518
    .line 519
    iget-object v9, v13, Lud/a;->n:Ljava/util/List;

    .line 520
    .line 521
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    goto :goto_7

    .line 526
    :cond_17
    const/4 v9, 0x0

    .line 527
    :goto_7
    if-nez v9, :cond_19

    .line 528
    .line 529
    goto :goto_8

    .line 530
    :cond_18
    move-object/from16 v17, v9

    .line 531
    .line 532
    :goto_8
    invoke-virtual {v5, v11}, Lle/c;->a(Lud/a;)V

    .line 533
    .line 534
    .line 535
    move-object v12, v11

    .line 536
    :cond_19
    move-object/from16 v9, v17

    .line 537
    .line 538
    goto :goto_5

    .line 539
    :cond_1a
    :goto_9
    iget-object v9, v10, Lxd/b;->k:Ljava/util/ArrayList;

    .line 540
    .line 541
    iget-object v6, v6, Lle/f;->a:Li4/y;

    .line 542
    .line 543
    invoke-virtual {v6, v8}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    invoke-virtual {v5}, Lle/c;->b()V

    .line 551
    .line 552
    .line 553
    move-object v6, v12

    .line 554
    :goto_a
    move-object v10, v4

    .line 555
    move-object v11, v14

    .line 556
    move-object/from16 v12, v19

    .line 557
    .line 558
    const/4 v9, 0x1

    .line 559
    :goto_b
    move-object v14, v0

    .line 560
    goto/16 :goto_2f

    .line 561
    .line 562
    :cond_1b
    move-object/from16 v19, v8

    .line 563
    .line 564
    check-cast v12, Lpd/s;

    .line 565
    .line 566
    invoke-virtual {v12}, Lpd/s;->l0()Lpd/r;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    iget-object v6, v6, Lpd/r;->q:[I

    .line 571
    .line 572
    array-length v6, v6

    .line 573
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 574
    .line 575
    invoke-direct {v8, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 576
    .line 577
    .line 578
    iget-object v9, v12, Lpd/s;->t:[Lud/a;

    .line 579
    .line 580
    const/4 v11, 0x0

    .line 581
    :goto_c
    if-ge v11, v6, :cond_1c

    .line 582
    .line 583
    aget-object v13, v9, v11

    .line 584
    .line 585
    new-instance v15, Lcom/alibaba/fastjson2/writer/b;

    .line 586
    .line 587
    move/from16 v17, v6

    .line 588
    .line 589
    const/16 v6, 0x1b

    .line 590
    .line 591
    invoke-direct {v15, v6}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 592
    .line 593
    .line 594
    invoke-interface {v8, v13, v15}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v6

    .line 598
    check-cast v6, Ljava/util/List;

    .line 599
    .line 600
    invoke-virtual {v12, v11}, Lpd/s;->k0(I)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v13

    .line 604
    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    add-int/lit8 v11, v11, 0x1

    .line 608
    .line 609
    move/from16 v6, v17

    .line 610
    .line 611
    goto :goto_c

    .line 612
    :cond_1c
    iget-object v6, v12, Lpd/s;->u:Lud/a;

    .line 613
    .line 614
    if-eqz v6, :cond_1d

    .line 615
    .line 616
    new-instance v9, Lcom/alibaba/fastjson2/writer/b;

    .line 617
    .line 618
    const/16 v11, 0x1c

    .line 619
    .line 620
    invoke-direct {v9, v11}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 621
    .line 622
    .line 623
    invoke-interface {v8, v6, v9}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v9

    .line 627
    check-cast v9, Ljava/util/List;

    .line 628
    .line 629
    sget-object v11, Lxd/d;->m:Luf/d;

    .line 630
    .line 631
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    :cond_1d
    new-instance v9, Lxd/d;

    .line 635
    .line 636
    invoke-direct {v9, v4, v1}, Lxd/d;-><init>(Lud/n;Lud/a;)V

    .line 637
    .line 638
    .line 639
    new-instance v11, Lnd/e0;

    .line 640
    .line 641
    invoke-direct {v11, v9}, Lnd/e0;-><init>(Lxd/d;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v11}, Lmd/e;->y(Loc/b;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    invoke-virtual {v5, v9}, Lle/c;->c(Lxd/a;)V

    .line 651
    .line 652
    .line 653
    invoke-static {v2}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 654
    .line 655
    .line 656
    move-result-object v11

    .line 657
    iget-object v13, v1, Lud/a;->o:Ljava/util/List;

    .line 658
    .line 659
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 660
    .line 661
    .line 662
    move-result-object v13

    .line 663
    :goto_d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v15

    .line 667
    if-eqz v15, :cond_1f

    .line 668
    .line 669
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v15

    .line 673
    check-cast v15, Lud/a;

    .line 674
    .line 675
    move-object/from16 v17, v6

    .line 676
    .line 677
    sget-object v6, Lmd/a;->l:Lmd/a;

    .line 678
    .line 679
    move-object/from16 v20, v13

    .line 680
    .line 681
    iget-object v13, v15, Lmd/e;->g:Lmd/f;

    .line 682
    .line 683
    invoke-virtual {v13, v6}, Lmd/f;->a(Lmd/a;)Z

    .line 684
    .line 685
    .line 686
    move-result v6

    .line 687
    if-eqz v6, :cond_1e

    .line 688
    .line 689
    :goto_e
    move-object/from16 v6, v17

    .line 690
    .line 691
    move-object/from16 v13, v20

    .line 692
    .line 693
    goto :goto_d

    .line 694
    :cond_1e
    iget-object v6, v15, Lud/a;->r:Ljava/util/BitSet;

    .line 695
    .line 696
    invoke-virtual {v11, v6}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 697
    .line 698
    .line 699
    goto :goto_e

    .line 700
    :cond_1f
    move-object/from16 v17, v6

    .line 701
    .line 702
    iget v6, v1, Lud/a;->j:I

    .line 703
    .line 704
    invoke-virtual {v11, v6}, Ljava/util/BitSet;->clear(I)V

    .line 705
    .line 706
    .line 707
    iget-object v6, v2, Lud/r;->C:Lud/a;

    .line 708
    .line 709
    iget v6, v6, Lud/a;->j:I

    .line 710
    .line 711
    invoke-virtual {v11, v6}, Ljava/util/BitSet;->clear(I)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v11}, Ljava/util/BitSet;->cardinality()I

    .line 715
    .line 716
    .line 717
    move-result v6

    .line 718
    const/4 v13, 0x1

    .line 719
    if-ne v6, v13, :cond_20

    .line 720
    .line 721
    invoke-static {v2, v11}, La/a;->r(Lud/r;Ljava/util/BitSet;)Lud/a;

    .line 722
    .line 723
    .line 724
    move-result-object v6

    .line 725
    move-object/from16 v23, v4

    .line 726
    .line 727
    move-object/from16 v24, v8

    .line 728
    .line 729
    move-object/from16 v21, v14

    .line 730
    .line 731
    goto/16 :goto_13

    .line 732
    .line 733
    :cond_20
    invoke-virtual {v2, v1}, Lud/r;->U(Lud/a;)Lnd/t;

    .line 734
    .line 735
    .line 736
    move-result-object v6

    .line 737
    if-eqz v6, :cond_28

    .line 738
    .line 739
    iget-object v13, v6, Lnd/t;->b:Lud/a;

    .line 740
    .line 741
    iget-object v6, v6, Lnd/t;->a:Lud/a;

    .line 742
    .line 743
    iget-object v6, v6, Lud/a;->q:Ljava/util/BitSet;

    .line 744
    .line 745
    invoke-virtual {v11, v6}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 746
    .line 747
    .line 748
    iget-object v6, v13, Lud/a;->q:Ljava/util/BitSet;

    .line 749
    .line 750
    invoke-virtual {v11, v6}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v11}, Ljava/util/BitSet;->cardinality()I

    .line 754
    .line 755
    .line 756
    move-result v6

    .line 757
    const/4 v15, 0x2

    .line 758
    if-ne v6, v15, :cond_26

    .line 759
    .line 760
    iget v6, v13, Lud/a;->j:I

    .line 761
    .line 762
    invoke-virtual {v11, v6}, Ljava/util/BitSet;->get(I)Z

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    if-eqz v6, :cond_26

    .line 767
    .line 768
    invoke-static {v2, v11}, La/a;->q(Lud/r;Ljava/util/BitSet;)Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v6

    .line 772
    invoke-interface {v6, v13}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    invoke-static {v6}, Lxe/s;->f(Ljava/util/List;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v6

    .line 779
    check-cast v6, Lud/a;

    .line 780
    .line 781
    if-eqz v6, :cond_26

    .line 782
    .line 783
    iget-object v15, v1, Lud/a;->o:Ljava/util/List;

    .line 784
    .line 785
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 786
    .line 787
    .line 788
    move-result-object v15

    .line 789
    const/16 v20, 0x0

    .line 790
    .line 791
    :goto_f
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 792
    .line 793
    .line 794
    move-result v21

    .line 795
    if-eqz v21, :cond_25

    .line 796
    .line 797
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v21

    .line 801
    move-object/from16 v22, v15

    .line 802
    .line 803
    move-object/from16 v15, v21

    .line 804
    .line 805
    check-cast v15, Lud/a;

    .line 806
    .line 807
    move-object/from16 v21, v14

    .line 808
    .line 809
    iget-object v14, v15, Lud/a;->r:Ljava/util/BitSet;

    .line 810
    .line 811
    move-object/from16 v23, v4

    .line 812
    .line 813
    iget v4, v13, Lud/a;->j:I

    .line 814
    .line 815
    invoke-virtual {v14, v4}, Ljava/util/BitSet;->get(I)Z

    .line 816
    .line 817
    .line 818
    move-result v4

    .line 819
    if-eqz v4, :cond_23

    .line 820
    .line 821
    if-eq v15, v6, :cond_23

    .line 822
    .line 823
    new-instance v4, Ljava/util/HashSet;

    .line 824
    .line 825
    new-instance v14, Ljava/util/ArrayList;

    .line 826
    .line 827
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 828
    .line 829
    .line 830
    invoke-static {v2}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    move-object/from16 v24, v8

    .line 835
    .line 836
    const/4 v8, 0x0

    .line 837
    invoke-static {v15, v15, v14, v0, v8}, La/a;->z(Lud/a;Lud/a;Ljava/util/AbstractCollection;Ljava/util/BitSet;Z)V

    .line 838
    .line 839
    .line 840
    invoke-direct {v4, v14}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    if-nez v0, :cond_24

    .line 848
    .line 849
    iget-object v0, v6, Lud/a;->m:Ljava/util/List;

    .line 850
    .line 851
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    new-instance v8, Lle/d;

    .line 856
    .line 857
    const/4 v14, 0x0

    .line 858
    invoke-direct {v8, v4, v14}, Lle/d;-><init>(Ljava/util/HashSet;I)V

    .line 859
    .line 860
    .line 861
    invoke-interface {v0, v8}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 862
    .line 863
    .line 864
    move-result v0

    .line 865
    if-eqz v0, :cond_21

    .line 866
    .line 867
    goto :goto_10

    .line 868
    :cond_21
    iget-object v0, v13, Lud/a;->m:Ljava/util/List;

    .line 869
    .line 870
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    :cond_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 875
    .line 876
    .line 877
    move-result v8

    .line 878
    if-eqz v8, :cond_24

    .line 879
    .line 880
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v8

    .line 884
    check-cast v8, Lud/a;

    .line 885
    .line 886
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    move-result v14

    .line 890
    if-eqz v14, :cond_22

    .line 891
    .line 892
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 893
    .line 894
    iget-object v4, v8, Lmd/e;->g:Lmd/f;

    .line 895
    .line 896
    invoke-virtual {v4, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-eqz v0, :cond_24

    .line 901
    .line 902
    iget-object v0, v8, Lud/a;->l:Ljava/util/ArrayList;

    .line 903
    .line 904
    new-instance v4, Lud/p;

    .line 905
    .line 906
    const/4 v8, 0x0

    .line 907
    invoke-direct {v4, v7, v8}, Lud/p;-><init>(Lpd/k;I)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    const/16 v20, 0x1

    .line 914
    .line 915
    goto :goto_10

    .line 916
    :cond_23
    move-object/from16 v24, v8

    .line 917
    .line 918
    :cond_24
    :goto_10
    move-object/from16 v0, p0

    .line 919
    .line 920
    move-object/from16 v14, v21

    .line 921
    .line 922
    move-object/from16 v15, v22

    .line 923
    .line 924
    move-object/from16 v4, v23

    .line 925
    .line 926
    move-object/from16 v8, v24

    .line 927
    .line 928
    goto/16 :goto_f

    .line 929
    .line 930
    :cond_25
    move-object/from16 v23, v4

    .line 931
    .line 932
    move-object/from16 v24, v8

    .line 933
    .line 934
    move-object/from16 v21, v14

    .line 935
    .line 936
    if-eqz v20, :cond_27

    .line 937
    .line 938
    iget v0, v13, Lud/a;->j:I

    .line 939
    .line 940
    invoke-virtual {v11, v0}, Ljava/util/BitSet;->clear(I)V

    .line 941
    .line 942
    .line 943
    goto :goto_11

    .line 944
    :cond_26
    move-object/from16 v23, v4

    .line 945
    .line 946
    move-object/from16 v24, v8

    .line 947
    .line 948
    move-object/from16 v21, v14

    .line 949
    .line 950
    :cond_27
    const/4 v6, 0x0

    .line 951
    :goto_11
    invoke-virtual {v11}, Ljava/util/BitSet;->isEmpty()Z

    .line 952
    .line 953
    .line 954
    move-result v0

    .line 955
    if-eqz v0, :cond_29

    .line 956
    .line 957
    iget-object v0, v2, Lud/r;->C:Lud/a;

    .line 958
    .line 959
    :goto_12
    move-object v6, v0

    .line 960
    goto/16 :goto_1a

    .line 961
    .line 962
    :cond_28
    move-object/from16 v23, v4

    .line 963
    .line 964
    move-object/from16 v24, v8

    .line 965
    .line 966
    move-object/from16 v21, v14

    .line 967
    .line 968
    const/4 v6, 0x0

    .line 969
    :cond_29
    if-nez v6, :cond_2b

    .line 970
    .line 971
    iget-object v6, v1, Lud/a;->t:Lud/a;

    .line 972
    .line 973
    iget v0, v6, Lud/a;->j:I

    .line 974
    .line 975
    invoke-virtual {v11, v0}, Ljava/util/BitSet;->get(I)Z

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    if-eqz v0, :cond_2a

    .line 980
    .line 981
    goto :goto_13

    .line 982
    :cond_2a
    iget-object v0, v1, Lud/a;->q:Ljava/util/BitSet;

    .line 983
    .line 984
    invoke-virtual {v11, v0}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    .line 985
    .line 986
    .line 987
    invoke-static {v2, v11}, La/a;->r(Lud/r;Ljava/util/BitSet;)Lud/a;

    .line 988
    .line 989
    .line 990
    move-result-object v6

    .line 991
    :cond_2b
    :goto_13
    if-eqz v6, :cond_2c

    .line 992
    .line 993
    invoke-virtual {v2, v6}, Lud/r;->Y(Lud/a;)Z

    .line 994
    .line 995
    .line 996
    move-result v0

    .line 997
    if-eqz v0, :cond_2c

    .line 998
    .line 999
    iget-object v6, v2, Lud/r;->C:Lud/a;

    .line 1000
    .line 1001
    :cond_2c
    iget-object v0, v1, Lud/a;->t:Lud/a;

    .line 1002
    .line 1003
    if-nez v6, :cond_39

    .line 1004
    .line 1005
    iget-object v4, v2, Lud/r;->C:Lud/a;

    .line 1006
    .line 1007
    if-ne v0, v4, :cond_39

    .line 1008
    .line 1009
    iget-object v0, v4, Lud/a;->m:Ljava/util/List;

    .line 1010
    .line 1011
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1012
    .line 1013
    .line 1014
    move-result v6

    .line 1015
    const/4 v13, 0x1

    .line 1016
    if-ne v6, v13, :cond_2d

    .line 1017
    .line 1018
    const/4 v8, 0x0

    .line 1019
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    check-cast v0, Lud/a;

    .line 1024
    .line 1025
    goto :goto_12

    .line 1026
    :cond_2d
    iget-object v8, v2, Lud/r;->t:Lqd/j;

    .line 1027
    .line 1028
    sget-object v11, Lqd/j;->j:Lqd/g;

    .line 1029
    .line 1030
    sget-object v13, Lpd/k;->p:Lpd/k;

    .line 1031
    .line 1032
    if-ne v8, v11, :cond_2f

    .line 1033
    .line 1034
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v8

    .line 1038
    :cond_2e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v11

    .line 1042
    if-eqz v11, :cond_36

    .line 1043
    .line 1044
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v11

    .line 1048
    check-cast v11, Lud/a;

    .line 1049
    .line 1050
    invoke-static {v11}, La/a;->c0(Lud/h;)Lud/p;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v11

    .line 1054
    if-eqz v11, :cond_34

    .line 1055
    .line 1056
    iget-object v11, v11, Lud/p;->k:Lpd/k;

    .line 1057
    .line 1058
    if-eq v11, v13, :cond_2e

    .line 1059
    .line 1060
    goto :goto_17

    .line 1061
    :cond_2f
    new-instance v8, Ljava/util/ArrayList;

    .line 1062
    .line 1063
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1064
    .line 1065
    .line 1066
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v11

    .line 1070
    :goto_14
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1071
    .line 1072
    .line 1073
    move-result v14

    .line 1074
    if-eqz v14, :cond_31

    .line 1075
    .line 1076
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v14

    .line 1080
    check-cast v14, Lud/a;

    .line 1081
    .line 1082
    invoke-static {v14}, La/a;->c0(Lud/h;)Lud/p;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v14

    .line 1086
    if-eqz v14, :cond_34

    .line 1087
    .line 1088
    iget-object v15, v14, Lud/p;->k:Lpd/k;

    .line 1089
    .line 1090
    if-eq v15, v13, :cond_30

    .line 1091
    .line 1092
    goto :goto_17

    .line 1093
    :cond_30
    const/4 v15, 0x0

    .line 1094
    invoke-virtual {v14, v15}, Lud/p;->S(I)Lqd/l;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v14

    .line 1098
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    goto :goto_14

    .line 1102
    :cond_31
    const/4 v15, 0x0

    .line 1103
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v11

    .line 1107
    check-cast v11, Lqd/l;

    .line 1108
    .line 1109
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1110
    .line 1111
    .line 1112
    instance-of v13, v11, Lqd/r;

    .line 1113
    .line 1114
    if-eqz v13, :cond_33

    .line 1115
    .line 1116
    check-cast v11, Lqd/r;

    .line 1117
    .line 1118
    const/4 v13, 0x1

    .line 1119
    :goto_15
    if-ge v13, v6, :cond_36

    .line 1120
    .line 1121
    const/4 v14, 0x1

    .line 1122
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v15

    .line 1126
    check-cast v15, Lqd/l;

    .line 1127
    .line 1128
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1129
    .line 1130
    .line 1131
    instance-of v14, v15, Lqd/r;

    .line 1132
    .line 1133
    if-eqz v14, :cond_34

    .line 1134
    .line 1135
    check-cast v15, Lqd/r;

    .line 1136
    .line 1137
    invoke-virtual {v15, v11}, Lqd/r;->g0(Lqd/r;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v14

    .line 1141
    if-nez v14, :cond_32

    .line 1142
    .line 1143
    goto :goto_17

    .line 1144
    :cond_32
    add-int/lit8 v13, v13, 0x1

    .line 1145
    .line 1146
    goto :goto_15

    .line 1147
    :cond_33
    const/4 v13, 0x1

    .line 1148
    :goto_16
    if-ge v13, v6, :cond_36

    .line 1149
    .line 1150
    const/4 v14, 0x1

    .line 1151
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v15

    .line 1155
    check-cast v15, Lqd/l;

    .line 1156
    .line 1157
    invoke-virtual {v15, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v14

    .line 1161
    if-nez v14, :cond_35

    .line 1162
    .line 1163
    :cond_34
    :goto_17
    move-object v6, v4

    .line 1164
    goto/16 :goto_1a

    .line 1165
    .line 1166
    :cond_35
    add-int/lit8 v13, v13, 0x1

    .line 1167
    .line 1168
    goto :goto_16

    .line 1169
    :cond_36
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v4

    .line 1173
    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v8

    .line 1177
    if-eqz v8, :cond_37

    .line 1178
    .line 1179
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v8

    .line 1183
    check-cast v8, Lud/a;

    .line 1184
    .line 1185
    invoke-virtual {v5, v8}, Lle/c;->a(Lud/a;)V

    .line 1186
    .line 1187
    .line 1188
    goto :goto_18

    .line 1189
    :cond_37
    const/4 v4, 0x1

    .line 1190
    :goto_19
    if-ge v4, v6, :cond_38

    .line 1191
    .line 1192
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v8

    .line 1196
    check-cast v8, Lud/a;

    .line 1197
    .line 1198
    sget-object v11, Lmd/a;->u:Lmd/a;

    .line 1199
    .line 1200
    invoke-virtual {v8, v11}, Lmd/e;->w(Lmd/a;)V

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v8, v10}, Lmd/e;->w(Lmd/a;)V

    .line 1204
    .line 1205
    .line 1206
    add-int/lit8 v4, v4, 0x1

    .line 1207
    .line 1208
    goto :goto_19

    .line 1209
    :cond_38
    const/4 v8, 0x0

    .line 1210
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    check-cast v0, Lud/a;

    .line 1215
    .line 1216
    goto/16 :goto_12

    .line 1217
    .line 1218
    :cond_39
    iget-object v4, v12, Lpd/s;->u:Lud/a;

    .line 1219
    .line 1220
    if-ne v0, v4, :cond_3a

    .line 1221
    .line 1222
    iget-object v4, v1, Lud/a;->o:Ljava/util/List;

    .line 1223
    .line 1224
    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v4

    .line 1228
    if-eqz v4, :cond_3a

    .line 1229
    .line 1230
    iget-object v4, v1, Lud/a;->r:Ljava/util/BitSet;

    .line 1231
    .line 1232
    iget v8, v0, Lud/a;->j:I

    .line 1233
    .line 1234
    invoke-virtual {v4, v8}, Ljava/util/BitSet;->get(I)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v4

    .line 1238
    if-eqz v4, :cond_3a

    .line 1239
    .line 1240
    invoke-virtual {v5, v0}, Lle/c;->a(Lud/a;)V

    .line 1241
    .line 1242
    .line 1243
    :cond_3a
    if-nez v6, :cond_3b

    .line 1244
    .line 1245
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1250
    .line 1251
    const-string v6, "Failed to find \'out\' block for switch in "

    .line 1252
    .line 1253
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    .line 1259
    const-string v0, ". Please report as an issue."

    .line 1260
    .line 1261
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    invoke-virtual {v2, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    iget-object v6, v1, Lud/a;->t:Lud/a;

    .line 1272
    .line 1273
    :cond_3b
    if-eqz v6, :cond_3d

    .line 1274
    .line 1275
    iget v0, v6, Lud/a;->j:I

    .line 1276
    .line 1277
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->get(I)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    if-nez v0, :cond_3c

    .line 1282
    .line 1283
    goto :goto_1a

    .line 1284
    :cond_3c
    const-string v0, "Failed to find switch \'out\' block (already processed)"

    .line 1285
    .line 1286
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 1287
    .line 1288
    .line 1289
    const/4 v0, 0x0

    .line 1290
    return-object v0

    .line 1291
    :cond_3d
    :goto_1a
    invoke-virtual {v5, v6}, Lle/c;->a(Lud/a;)V

    .line 1292
    .line 1293
    .line 1294
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1295
    .line 1296
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1297
    .line 1298
    .line 1299
    if-eqz v6, :cond_44

    .line 1300
    .line 1301
    invoke-virtual/range {v24 .. v24}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v4

    .line 1305
    invoke-static {v2}, La/a;->D0(Lud/r;)Ljava/util/BitSet;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v8

    .line 1309
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v4

    .line 1313
    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1314
    .line 1315
    .line 1316
    move-result v10

    .line 1317
    if-eqz v10, :cond_3e

    .line 1318
    .line 1319
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v10

    .line 1323
    check-cast v10, Lud/a;

    .line 1324
    .line 1325
    iget v10, v10, Lud/a;->j:I

    .line 1326
    .line 1327
    invoke-virtual {v8, v10}, Ljava/util/BitSet;->set(I)V

    .line 1328
    .line 1329
    .line 1330
    goto :goto_1b

    .line 1331
    :cond_3e
    iget v4, v6, Lud/a;->j:I

    .line 1332
    .line 1333
    invoke-virtual {v8, v4}, Ljava/util/BitSet;->clear(I)V

    .line 1334
    .line 1335
    .line 1336
    iget-object v4, v9, Lxd/d;->k:Lud/a;

    .line 1337
    .line 1338
    iget-object v4, v4, Lud/a;->n:Ljava/util/List;

    .line 1339
    .line 1340
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v4

    .line 1344
    :cond_3f
    :goto_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v10

    .line 1348
    if-eqz v10, :cond_41

    .line 1349
    .line 1350
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v10

    .line 1354
    check-cast v10, Lud/a;

    .line 1355
    .line 1356
    iget-object v11, v10, Lud/a;->r:Ljava/util/BitSet;

    .line 1357
    .line 1358
    invoke-virtual {v11, v8}, Ljava/util/BitSet;->intersects(Ljava/util/BitSet;)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v13

    .line 1362
    if-eqz v13, :cond_3f

    .line 1363
    .line 1364
    new-instance v13, Ljava/util/BitSet;

    .line 1365
    .line 1366
    iget-object v14, v2, Lud/r;->z:Ljava/util/List;

    .line 1367
    .line 1368
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 1369
    .line 1370
    .line 1371
    move-result v14

    .line 1372
    invoke-direct {v13, v14}, Ljava/util/BitSet;-><init>(I)V

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v11}, Ljava/util/BitSet;->isEmpty()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v14

    .line 1379
    if-nez v14, :cond_40

    .line 1380
    .line 1381
    invoke-virtual {v13, v11}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 1382
    .line 1383
    .line 1384
    :cond_40
    iget v11, v6, Lud/a;->j:I

    .line 1385
    .line 1386
    invoke-virtual {v13, v11}, Ljava/util/BitSet;->clear(I)V

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual {v13, v8}, Ljava/util/BitSet;->and(Ljava/util/BitSet;)V

    .line 1390
    .line 1391
    .line 1392
    invoke-static {v2, v13}, La/a;->r(Lud/r;Ljava/util/BitSet;)Lud/a;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v11

    .line 1396
    invoke-interface {v0, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1397
    .line 1398
    .line 1399
    goto :goto_1c

    .line 1400
    :cond_41
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 1401
    .line 1402
    .line 1403
    move-result v4

    .line 1404
    if-nez v4, :cond_44

    .line 1405
    .line 1406
    move-object/from16 v4, v24

    .line 1407
    .line 1408
    invoke-static {v4, v0}, Loh/h;->E(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v8

    .line 1412
    if-eqz v8, :cond_45

    .line 1413
    .line 1414
    new-instance v8, Ljava/util/ArrayList;

    .line 1415
    .line 1416
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 1417
    .line 1418
    .line 1419
    move-result v10

    .line 1420
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v10

    .line 1427
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1428
    .line 1429
    .line 1430
    new-instance v10, Lce/b;

    .line 1431
    .line 1432
    const/4 v11, 0x2

    .line 1433
    invoke-direct {v10, v0, v11}, Lce/b;-><init>(Ljava/lang/Object;I)V

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 1437
    .line 1438
    .line 1439
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 1440
    .line 1441
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 1442
    .line 1443
    .line 1444
    move-result v11

    .line 1445
    invoke-direct {v10, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v8

    .line 1452
    :goto_1d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1453
    .line 1454
    .line 1455
    move-result v11

    .line 1456
    if-eqz v11, :cond_42

    .line 1457
    .line 1458
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v11

    .line 1462
    check-cast v11, Lud/a;

    .line 1463
    .line 1464
    invoke-virtual {v4, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v13

    .line 1468
    check-cast v13, Ljava/util/List;

    .line 1469
    .line 1470
    invoke-interface {v10, v11, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    goto :goto_1d

    .line 1474
    :cond_42
    invoke-static {v10, v0}, Loh/h;->E(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Z

    .line 1475
    .line 1476
    .line 1477
    move-result v8

    .line 1478
    if-eqz v8, :cond_43

    .line 1479
    .line 1480
    const-string v8, "Can\'t fix incorrect switch cases order, some code will duplicate"

    .line 1481
    .line 1482
    invoke-virtual {v2, v8}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 1486
    .line 1487
    .line 1488
    goto :goto_1e

    .line 1489
    :cond_43
    move-object v8, v10

    .line 1490
    goto :goto_1f

    .line 1491
    :cond_44
    move-object/from16 v4, v24

    .line 1492
    .line 1493
    :cond_45
    :goto_1e
    move-object v8, v4

    .line 1494
    :goto_1f
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v4

    .line 1498
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v4

    .line 1502
    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1503
    .line 1504
    .line 1505
    move-result v8

    .line 1506
    iget-object v10, v9, Lxd/d;->l:Ljava/util/ArrayList;

    .line 1507
    .line 1508
    if-eqz v8, :cond_49

    .line 1509
    .line 1510
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v8

    .line 1514
    check-cast v8, Ljava/util/Map$Entry;

    .line 1515
    .line 1516
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v11

    .line 1520
    check-cast v11, Ljava/util/List;

    .line 1521
    .line 1522
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v8

    .line 1526
    check-cast v8, Lud/a;

    .line 1527
    .line 1528
    iget-object v13, v5, Lle/c;->b:Lle/b;

    .line 1529
    .line 1530
    iget-object v13, v13, Lle/b;->a:Ljava/util/HashSet;

    .line 1531
    .line 1532
    invoke-virtual {v13, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1533
    .line 1534
    .line 1535
    move-result v13

    .line 1536
    if-eqz v13, :cond_46

    .line 1537
    .line 1538
    new-instance v8, Lxd/b;

    .line 1539
    .line 1540
    iget-object v13, v5, Lle/c;->b:Lle/b;

    .line 1541
    .line 1542
    iget-object v13, v13, Lle/b;->b:Lxd/a;

    .line 1543
    .line 1544
    invoke-direct {v8, v13}, Lxd/b;-><init>(Lud/n;)V

    .line 1545
    .line 1546
    .line 1547
    move-object/from16 v14, p0

    .line 1548
    .line 1549
    goto :goto_21

    .line 1550
    :cond_46
    invoke-virtual {v0, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v13

    .line 1554
    check-cast v13, Lud/a;

    .line 1555
    .line 1556
    invoke-virtual {v5, v13}, Lle/c;->a(Lud/a;)V

    .line 1557
    .line 1558
    .line 1559
    move-object/from16 v14, p0

    .line 1560
    .line 1561
    invoke-virtual {v14, v8}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v8

    .line 1565
    if-eqz v13, :cond_47

    .line 1566
    .line 1567
    iget-object v15, v5, Lle/c;->b:Lle/b;

    .line 1568
    .line 1569
    iget-object v15, v15, Lle/b;->a:Ljava/util/HashSet;

    .line 1570
    .line 1571
    invoke-virtual {v15, v13}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1572
    .line 1573
    .line 1574
    :cond_47
    if-eqz v13, :cond_48

    .line 1575
    .line 1576
    sget-object v15, Lmd/a;->U:Lmd/a;

    .line 1577
    .line 1578
    invoke-virtual {v13, v15}, Lmd/e;->w(Lmd/a;)V

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v8, v15}, Lmd/e;->w(Lmd/a;)V

    .line 1582
    .line 1583
    .line 1584
    :cond_48
    :goto_21
    new-instance v13, Lxd/c;

    .line 1585
    .line 1586
    invoke-direct {v13, v11, v8}, Lxd/c;-><init>(Ljava/util/List;Lud/j;)V

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1590
    .line 1591
    .line 1592
    goto :goto_20

    .line 1593
    :cond_49
    move-object/from16 v14, p0

    .line 1594
    .line 1595
    if-nez v17, :cond_4a

    .line 1596
    .line 1597
    const/4 v0, 0x1

    .line 1598
    goto :goto_22

    .line 1599
    :cond_4a
    invoke-interface {v10}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    new-instance v4, Lce/n;

    .line 1604
    .line 1605
    const/16 v8, 0x10

    .line 1606
    .line 1607
    invoke-direct {v4, v8}, Lce/n;-><init>(I)V

    .line 1608
    .line 1609
    .line 1610
    invoke-interface {v0, v4}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 1611
    .line 1612
    .line 1613
    move-result v0

    .line 1614
    :goto_22
    if-eqz v0, :cond_4b

    .line 1615
    .line 1616
    new-instance v0, Lbe/i;

    .line 1617
    .line 1618
    const/16 v4, 0xf

    .line 1619
    .line 1620
    invoke-direct {v0, v12, v4}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 1624
    .line 1625
    .line 1626
    :cond_4b
    invoke-virtual {v5}, Lle/c;->b()V

    .line 1627
    .line 1628
    .line 1629
    :goto_23
    move-object/from16 v12, v19

    .line 1630
    .line 1631
    move-object/from16 v11, v21

    .line 1632
    .line 1633
    move-object/from16 v10, v23

    .line 1634
    .line 1635
    :goto_24
    const/4 v9, 0x1

    .line 1636
    goto/16 :goto_2f

    .line 1637
    .line 1638
    :cond_4c
    move-object/from16 v23, v4

    .line 1639
    .line 1640
    move-object/from16 v19, v8

    .line 1641
    .line 1642
    move-object/from16 v21, v14

    .line 1643
    .line 1644
    move-object v14, v0

    .line 1645
    iget-object v0, v14, Li4/y;->e:Ljava/lang/Object;

    .line 1646
    .line 1647
    check-cast v0, Lle/a;

    .line 1648
    .line 1649
    check-cast v12, Lpd/i;

    .line 1650
    .line 1651
    iget-object v4, v0, Lle/a;->b:Li4/y;

    .line 1652
    .line 1653
    iget-object v0, v0, Lle/a;->a:Lud/r;

    .line 1654
    .line 1655
    iget-object v6, v1, Lmd/e;->g:Lmd/f;

    .line 1656
    .line 1657
    invoke-virtual {v6, v10}, Lmd/f;->a(Lmd/a;)Z

    .line 1658
    .line 1659
    .line 1660
    move-result v6

    .line 1661
    if-eqz v6, :cond_4d

    .line 1662
    .line 1663
    iget-object v0, v12, Lpd/i;->q:Lud/a;

    .line 1664
    .line 1665
    move-object v6, v0

    .line 1666
    goto :goto_23

    .line 1667
    :cond_4d
    invoke-static {v0, v1}, Lle/a;->g(Lud/r;Lud/a;)Lhb/r;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v6

    .line 1671
    if-nez v6, :cond_4e

    .line 1672
    .line 1673
    :goto_25
    move-object/from16 v12, v19

    .line 1674
    .line 1675
    move-object/from16 v11, v21

    .line 1676
    .line 1677
    move-object/from16 v10, v23

    .line 1678
    .line 1679
    const/4 v6, 0x0

    .line 1680
    goto :goto_24

    .line 1681
    :cond_4e
    invoke-static {v6}, Lle/a;->h(Lhb/r;)Lhb/r;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v8

    .line 1685
    if-eqz v8, :cond_4f

    .line 1686
    .line 1687
    goto :goto_26

    .line 1688
    :cond_4f
    invoke-static {v6}, Lhb/r;->l(Lhb/r;)Lhb/r;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v8

    .line 1692
    :goto_26
    invoke-static {v0, v1, v8}, Lle/a;->j(Lud/r;Lud/a;Lhb/r;)Lhb/r;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v6

    .line 1696
    if-eqz v6, :cond_50

    .line 1697
    .line 1698
    goto :goto_27

    .line 1699
    :cond_50
    iget-object v6, v8, Lhb/r;->d:Ljava/lang/Object;

    .line 1700
    .line 1701
    check-cast v6, Lze/c;

    .line 1702
    .line 1703
    iget-object v6, v6, Lze/c;->h:Ljava/util/BitSet;

    .line 1704
    .line 1705
    invoke-virtual {v6}, Ljava/util/BitSet;->cardinality()I

    .line 1706
    .line 1707
    .line 1708
    move-result v6

    .line 1709
    const/4 v13, 0x1

    .line 1710
    if-gt v6, v13, :cond_51

    .line 1711
    .line 1712
    goto :goto_25

    .line 1713
    :cond_51
    invoke-static {v0, v1}, Lle/a;->g(Lud/r;Lud/a;)Lhb/r;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v6

    .line 1717
    invoke-static {v0, v1, v6}, Lle/a;->j(Lud/r;Lud/a;Lhb/r;)Lhb/r;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v6

    .line 1721
    if-nez v6, :cond_52

    .line 1722
    .line 1723
    goto :goto_25

    .line 1724
    :cond_52
    :goto_27
    iget-object v0, v6, Lhb/r;->d:Ljava/lang/Object;

    .line 1725
    .line 1726
    check-cast v0, Lze/c;

    .line 1727
    .line 1728
    invoke-static {v6}, Lle/a;->a(Lhb/r;)V

    .line 1729
    .line 1730
    .line 1731
    new-instance v8, Lyd/c;

    .line 1732
    .line 1733
    move-object/from16 v10, v23

    .line 1734
    .line 1735
    invoke-direct {v8, v10}, Lyd/a;-><init>(Lxd/b;)V

    .line 1736
    .line 1737
    .line 1738
    iget-object v9, v6, Lhb/r;->c:Ljava/lang/Object;

    .line 1739
    .line 1740
    check-cast v9, Lyd/b;

    .line 1741
    .line 1742
    iput-object v9, v8, Lyd/a;->k:Lyd/b;

    .line 1743
    .line 1744
    invoke-virtual {v0}, Lze/c;->c()Ljava/util/List;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v9

    .line 1748
    iput-object v9, v8, Lyd/a;->l:Ljava/util/List;

    .line 1749
    .line 1750
    move-object/from16 v11, v21

    .line 1751
    .line 1752
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1753
    .line 1754
    .line 1755
    iget-object v9, v6, Lhb/r;->i:Ljava/lang/Object;

    .line 1756
    .line 1757
    check-cast v9, Lud/a;

    .line 1758
    .line 1759
    invoke-virtual {v5, v8}, Lle/c;->c(Lxd/a;)V

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v5, v9}, Lle/c;->a(Lud/a;)V

    .line 1763
    .line 1764
    .line 1765
    iget-object v12, v6, Lhb/r;->e:Ljava/lang/Object;

    .line 1766
    .line 1767
    check-cast v12, Lud/a;

    .line 1768
    .line 1769
    if-nez v12, :cond_53

    .line 1770
    .line 1771
    new-instance v12, Lxd/b;

    .line 1772
    .line 1773
    invoke-direct {v12, v8}, Lxd/b;-><init>(Lud/n;)V

    .line 1774
    .line 1775
    .line 1776
    iput-object v12, v8, Lyd/c;->m:Lud/j;

    .line 1777
    .line 1778
    goto :goto_28

    .line 1779
    :cond_53
    invoke-virtual {v4, v12}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v12

    .line 1783
    iput-object v12, v8, Lyd/c;->m:Lud/j;

    .line 1784
    .line 1785
    :goto_28
    iget-object v6, v6, Lhb/r;->f:Ljava/lang/Object;

    .line 1786
    .line 1787
    check-cast v6, Lud/a;

    .line 1788
    .line 1789
    if-eqz v6, :cond_54

    .line 1790
    .line 1791
    iget-object v12, v5, Lle/c;->b:Lle/b;

    .line 1792
    .line 1793
    iget-object v12, v12, Lle/b;->a:Ljava/util/HashSet;

    .line 1794
    .line 1795
    invoke-virtual {v12, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1796
    .line 1797
    .line 1798
    move-result v12

    .line 1799
    if-eqz v12, :cond_55

    .line 1800
    .line 1801
    :cond_54
    const/4 v4, 0x0

    .line 1802
    goto :goto_29

    .line 1803
    :cond_55
    invoke-virtual {v4, v6}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v4

    .line 1807
    iput-object v4, v8, Lyd/c;->n:Lud/j;

    .line 1808
    .line 1809
    const/4 v4, 0x0

    .line 1810
    goto :goto_2a

    .line 1811
    :goto_29
    iput-object v4, v8, Lyd/c;->n:Lud/j;

    .line 1812
    .line 1813
    :goto_2a
    iget-object v6, v8, Lyd/c;->n:Lud/j;

    .line 1814
    .line 1815
    if-nez v6, :cond_59

    .line 1816
    .line 1817
    if-eqz v9, :cond_59

    .line 1818
    .line 1819
    iget-object v6, v9, Lmd/e;->g:Lmd/f;

    .line 1820
    .line 1821
    move-object/from16 v12, v19

    .line 1822
    .line 1823
    invoke-virtual {v6, v12}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v6

    .line 1827
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1828
    .line 1829
    .line 1830
    move-result v13

    .line 1831
    if-nez v13, :cond_5a

    .line 1832
    .line 1833
    new-instance v13, Lxd/b;

    .line 1834
    .line 1835
    invoke-direct {v13, v8}, Lxd/b;-><init>(Lud/n;)V

    .line 1836
    .line 1837
    .line 1838
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v6

    .line 1842
    :goto_2b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1843
    .line 1844
    .line 1845
    move-result v15

    .line 1846
    if-eqz v15, :cond_58

    .line 1847
    .line 1848
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v15

    .line 1852
    check-cast v15, Lnd/f;

    .line 1853
    .line 1854
    iget-object v4, v15, Lnd/f;->h:Lud/a;

    .line 1855
    .line 1856
    invoke-virtual {v4, v9}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 1857
    .line 1858
    .line 1859
    move-result v4

    .line 1860
    if-eqz v4, :cond_57

    .line 1861
    .line 1862
    iget-object v4, v15, Lnd/f;->g:Lud/a;

    .line 1863
    .line 1864
    invoke-virtual {v0}, Lze/c;->iterator()Ljava/util/Iterator;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v15

    .line 1868
    :goto_2c
    move-object/from16 v17, v15

    .line 1869
    .line 1870
    check-cast v17, Lze/b;

    .line 1871
    .line 1872
    invoke-virtual/range {v17 .. v17}, Lze/b;->hasNext()Z

    .line 1873
    .line 1874
    .line 1875
    move-result v18

    .line 1876
    if-eqz v18, :cond_57

    .line 1877
    .line 1878
    invoke-virtual/range {v17 .. v17}, Lze/b;->next()Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v17

    .line 1882
    move-object/from16 v18, v0

    .line 1883
    .line 1884
    move-object/from16 v0, v17

    .line 1885
    .line 1886
    check-cast v0, Lud/a;

    .line 1887
    .line 1888
    iget-object v0, v0, Lud/a;->n:Ljava/util/List;

    .line 1889
    .line 1890
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1891
    .line 1892
    .line 1893
    move-result v0

    .line 1894
    if-eqz v0, :cond_56

    .line 1895
    .line 1896
    invoke-virtual {v13, v4}, Lxd/b;->H(Lud/j;)V

    .line 1897
    .line 1898
    .line 1899
    goto :goto_2d

    .line 1900
    :cond_56
    move-object/from16 v0, v18

    .line 1901
    .line 1902
    goto :goto_2c

    .line 1903
    :cond_57
    move-object/from16 v18, v0

    .line 1904
    .line 1905
    :goto_2d
    move-object/from16 v0, v18

    .line 1906
    .line 1907
    const/4 v4, 0x0

    .line 1908
    goto :goto_2b

    .line 1909
    :cond_58
    iput-object v13, v8, Lyd/c;->n:Lud/j;

    .line 1910
    .line 1911
    goto :goto_2e

    .line 1912
    :cond_59
    move-object/from16 v12, v19

    .line 1913
    .line 1914
    :cond_5a
    :goto_2e
    invoke-virtual {v5}, Lle/c;->b()V

    .line 1915
    .line 1916
    .line 1917
    move-object v6, v9

    .line 1918
    goto/16 :goto_24

    .line 1919
    .line 1920
    :goto_2f
    if-nez v9, :cond_5b

    .line 1921
    .line 1922
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1923
    .line 1924
    .line 1925
    invoke-static {v1}, La/a;->d0(Lud/a;)Lud/a;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v6

    .line 1929
    :cond_5b
    if-eqz v6, :cond_8

    .line 1930
    .line 1931
    iget-object v0, v5, Lle/c;->b:Lle/b;

    .line 1932
    .line 1933
    iget-object v0, v0, Lle/b;->a:Ljava/util/HashSet;

    .line 1934
    .line 1935
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1936
    .line 1937
    .line 1938
    move-result v0

    .line 1939
    if-nez v0, :cond_8

    .line 1940
    .line 1941
    iget-object v0, v5, Lle/c;->b:Lle/b;

    .line 1942
    .line 1943
    iget-object v0, v0, Lle/b;->a:Ljava/util/HashSet;

    .line 1944
    .line 1945
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 1946
    .line 1947
    .line 1948
    move-result v0

    .line 1949
    if-nez v0, :cond_8

    .line 1950
    .line 1951
    move-object v1, v6

    .line 1952
    :goto_30
    iget v0, v14, Li4/y;->b:I

    .line 1953
    .line 1954
    const/16 v16, 0x1

    .line 1955
    .line 1956
    add-int/lit8 v0, v0, 0x1

    .line 1957
    .line 1958
    iput v0, v14, Li4/y;->b:I

    .line 1959
    .line 1960
    iget v4, v14, Li4/y;->a:I

    .line 1961
    .line 1962
    if-gt v0, v4, :cond_5c

    .line 1963
    .line 1964
    move-object v4, v10

    .line 1965
    move-object v8, v12

    .line 1966
    move-object v0, v14

    .line 1967
    goto/16 :goto_0

    .line 1968
    .line 1969
    :cond_5c
    new-instance v0, Laf/f;

    .line 1970
    .line 1971
    const-string v1, "Regions count limit reached"

    .line 1972
    .line 1973
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1974
    .line 1975
    .line 1976
    throw v0

    .line 1977
    :goto_31
    return-object v10
.end method

.method public c(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Li4/y;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Li4/y;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    iget v2, p0, Li4/y;->a:I

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lz4/g;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget v4, v3, Lz4/g;->i:I

    .line 37
    .line 38
    if-lez v4, :cond_2

    .line 39
    .line 40
    add-int/lit8 v4, v4, -0x1

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Lz4/g;->n(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-ne v3, v2, :cond_2

    .line 47
    .line 48
    iget-object v2, p0, Li4/y;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Li4/i;

    .line 51
    .line 52
    invoke-virtual {v2}, Li4/i;->k()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object v3, p0, Li4/y;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/BitSet;

    .line 59
    .line 60
    invoke-virtual {v3, p1}, Ljava/util/BitSet;->set(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-gt v1, v2, :cond_1

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lz4/g;

    .line 90
    .line 91
    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    return v2

    .line 95
    :cond_2
    return p1
.end method
