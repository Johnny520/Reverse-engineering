.class public final synthetic Lsh/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lp/r1;

.field public final synthetic h:Lfg/p;

.field public final synthetic i:Lfg/p;

.field public final synthetic j:Lfg/p;

.field public final synthetic k:Lfg/p;

.field public final synthetic l:I

.field public final synthetic m:Lfg/p;

.field public final synthetic n:Lfg/p;

.field public final synthetic o:Lsh/o0;

.field public final synthetic p:Lfg/p;

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lp/r1;Lfg/p;Lfg/p;Lfg/p;Lfg/p;ILfg/p;Lfg/p;Lsh/o0;Lfg/p;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/j0;->g:Lp/r1;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/j0;->h:Lfg/p;

    .line 7
    .line 8
    iput-object p3, p0, Lsh/j0;->i:Lfg/p;

    .line 9
    .line 10
    iput-object p4, p0, Lsh/j0;->j:Lfg/p;

    .line 11
    .line 12
    iput-object p5, p0, Lsh/j0;->k:Lfg/p;

    .line 13
    .line 14
    iput p6, p0, Lsh/j0;->l:I

    .line 15
    .line 16
    iput-object p7, p0, Lsh/j0;->m:Lfg/p;

    .line 17
    .line 18
    iput-object p8, p0, Lsh/j0;->n:Lfg/p;

    .line 19
    .line 20
    iput-object p9, p0, Lsh/j0;->o:Lsh/o0;

    .line 21
    .line 22
    iput-object p10, p0, Lsh/j0;->p:Lfg/p;

    .line 23
    .line 24
    iput p11, p0, Lsh/j0;->q:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    check-cast v7, Lv1/k1;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Lu2/a;

    .line 10
    .line 11
    sget v2, Lsh/p0;->a:F

    .line 12
    .line 13
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-wide v3, v1, Lu2/a;->a:J

    .line 17
    .line 18
    invoke-static {v3, v4}, Lu2/a;->h(J)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    iget-wide v3, v1, Lu2/a;->a:J

    .line 23
    .line 24
    invoke-static {v3, v4}, Lu2/a;->g(J)I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    iget-wide v9, v1, Lu2/a;->a:J

    .line 29
    .line 30
    const/4 v14, 0x0

    .line 31
    const/16 v15, 0xa

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v12, 0x0

    .line 35
    const/4 v13, 0x0

    .line 36
    invoke-static/range {v9 .. v15}, Lu2/a;->a(JIIIII)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    iget-object v6, v0, Lsh/j0;->g:Lp/r1;

    .line 41
    .line 42
    invoke-interface {v6, v7}, Lp/r1;->d(Lu2/c;)I

    .line 43
    .line 44
    .line 45
    move-result v16

    .line 46
    invoke-interface {v7}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v6, v7, v1}, Lp/r1;->c(Lu2/c;Lu2/m;)I

    .line 51
    .line 52
    .line 53
    move-result v14

    .line 54
    invoke-interface {v7}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v6, v7, v1}, Lp/r1;->a(Lu2/c;Lu2/m;)I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    invoke-interface {v6, v7}, Lp/r1;->b(Lu2/c;)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    sget-object v9, Lsh/q0;->l:Lsh/q0;

    .line 67
    .line 68
    iget-object v10, v0, Lsh/j0;->h:Lfg/p;

    .line 69
    .line 70
    invoke-interface {v7, v10, v9}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-static {v9}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, Lv1/m0;

    .line 79
    .line 80
    invoke-interface {v9, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 81
    .line 82
    .line 83
    move-result-object v19

    .line 84
    sget-object v9, Lsh/q0;->g:Lsh/q0;

    .line 85
    .line 86
    iget-object v10, v0, Lsh/j0;->i:Lfg/p;

    .line 87
    .line 88
    invoke-interface {v7, v10, v9}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-static {v9}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    check-cast v9, Lv1/m0;

    .line 97
    .line 98
    invoke-interface {v9, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    sget-object v10, Lsh/q0;->i:Lsh/q0;

    .line 103
    .line 104
    iget-object v11, v0, Lsh/j0;->j:Lfg/p;

    .line 105
    .line 106
    invoke-interface {v7, v11, v10}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    invoke-static {v10}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    check-cast v10, Lv1/m0;

    .line 115
    .line 116
    neg-int v11, v14

    .line 117
    sub-int/2addr v11, v15

    .line 118
    neg-int v12, v1

    .line 119
    move/from16 p1, v14

    .line 120
    .line 121
    invoke-static {v11, v12, v3, v4}, Lu2/b;->i(IIJ)J

    .line 122
    .line 123
    .line 124
    move-result-wide v13

    .line 125
    invoke-interface {v10, v13, v14}, Lv1/m0;->Q(J)Lv1/b1;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    sget-object v13, Lsh/q0;->k:Lsh/q0;

    .line 130
    .line 131
    iget-object v14, v0, Lsh/j0;->k:Lfg/p;

    .line 132
    .line 133
    invoke-interface {v7, v14, v13}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    invoke-static {v13}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    check-cast v13, Lv1/m0;

    .line 142
    .line 143
    move/from16 p2, v15

    .line 144
    .line 145
    invoke-static {v11, v12, v3, v4}, Lu2/b;->i(IIJ)J

    .line 146
    .line 147
    .line 148
    move-result-wide v14

    .line 149
    invoke-interface {v13, v14, v15}, Lv1/m0;->Q(J)Lv1/b1;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    iget v14, v13, Lv1/b1;->g:I

    .line 154
    .line 155
    sget-object v15, Lu2/m;->g:Lu2/m;

    .line 156
    .line 157
    move/from16 v17, v1

    .line 158
    .line 159
    iget v1, v0, Lsh/j0;->l:I

    .line 160
    .line 161
    move/from16 v18, v5

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    if-nez v14, :cond_0

    .line 166
    .line 167
    iget v5, v13, Lv1/b1;->h:I

    .line 168
    .line 169
    if-nez v5, :cond_0

    .line 170
    .line 171
    move/from16 v22, v8

    .line 172
    .line 173
    move-object/from16 v23, v13

    .line 174
    .line 175
    move-object/from16 v14, v20

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_0
    iget v5, v13, Lv1/b1;->h:I

    .line 179
    .line 180
    if-nez v1, :cond_2

    .line 181
    .line 182
    move/from16 v22, v8

    .line 183
    .line 184
    invoke-interface {v7}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    if-ne v8, v15, :cond_1

    .line 189
    .line 190
    invoke-interface {v7, v2}, Lu2/c;->G0(F)I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    :goto_0
    add-int v8, v8, p1

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_1
    invoke-interface {v7, v2}, Lu2/c;->G0(F)I

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    :goto_1
    sub-int v8, v18, v8

    .line 202
    .line 203
    sub-int/2addr v8, v14

    .line 204
    sub-int v8, v8, p2

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_2
    move/from16 v22, v8

    .line 208
    .line 209
    const/4 v8, 0x2

    .line 210
    if-ne v1, v8, :cond_3

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    move/from16 v23, v8

    .line 214
    .line 215
    const/4 v8, 0x3

    .line 216
    if-ne v1, v8, :cond_5

    .line 217
    .line 218
    :goto_2
    invoke-interface {v7}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    if-ne v8, v15, :cond_4

    .line 223
    .line 224
    invoke-interface {v7, v2}, Lu2/c;->G0(F)I

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    goto :goto_1

    .line 229
    :cond_4
    invoke-interface {v7, v2}, Lu2/c;->G0(F)I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    goto :goto_0

    .line 234
    :cond_5
    sub-int v8, v18, v14

    .line 235
    .line 236
    add-int v8, v8, p1

    .line 237
    .line 238
    sub-int v8, v8, p2

    .line 239
    .line 240
    div-int/lit8 v8, v8, 0x2

    .line 241
    .line 242
    :goto_3
    new-instance v14, Lb5/k;

    .line 243
    .line 244
    move-object/from16 v23, v13

    .line 245
    .line 246
    const/4 v13, 0x4

    .line 247
    invoke-direct {v14, v8, v5, v13}, Lb5/k;-><init>(III)V

    .line 248
    .line 249
    .line 250
    :goto_4
    sget-object v5, Lsh/q0;->h:Lsh/q0;

    .line 251
    .line 252
    iget-object v8, v0, Lsh/j0;->m:Lfg/p;

    .line 253
    .line 254
    invoke-interface {v7, v8, v5}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-static {v5}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    check-cast v5, Lv1/m0;

    .line 263
    .line 264
    invoke-interface {v5, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    iget v8, v5, Lv1/b1;->g:I

    .line 269
    .line 270
    const/16 v24, 0x0

    .line 271
    .line 272
    if-nez v8, :cond_6

    .line 273
    .line 274
    iget v8, v5, Lv1/b1;->h:I

    .line 275
    .line 276
    if-nez v8, :cond_6

    .line 277
    .line 278
    const/4 v8, 0x1

    .line 279
    goto :goto_5

    .line 280
    :cond_6
    move/from16 v8, v24

    .line 281
    .line 282
    :goto_5
    if-eqz v14, :cond_9

    .line 283
    .line 284
    iget v13, v14, Lb5/k;->c:I

    .line 285
    .line 286
    move/from16 v25, v8

    .line 287
    .line 288
    if-nez v8, :cond_8

    .line 289
    .line 290
    const/4 v8, 0x3

    .line 291
    if-ne v1, v8, :cond_7

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_7
    iget v1, v5, Lv1/b1;->h:I

    .line 295
    .line 296
    add-int/2addr v1, v13

    .line 297
    invoke-interface {v7, v2}, Lu2/c;->G0(F)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    :goto_6
    add-int/2addr v2, v1

    .line 302
    goto :goto_8

    .line 303
    :cond_8
    :goto_7
    invoke-interface {v7, v2}, Lu2/c;->G0(F)I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    add-int/2addr v1, v13

    .line 308
    invoke-interface {v6, v7}, Lp/r1;->b(Lu2/c;)I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    goto :goto_6

    .line 313
    :goto_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    move-object/from16 v21, v1

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_9
    move/from16 v25, v8

    .line 321
    .line 322
    move-object/from16 v21, v20

    .line 323
    .line 324
    :goto_9
    iget v1, v10, Lv1/b1;->h:I

    .line 325
    .line 326
    if-eqz v1, :cond_d

    .line 327
    .line 328
    if-eqz v21, :cond_a

    .line 329
    .line 330
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    goto :goto_a

    .line 335
    :cond_a
    iget v2, v5, Lv1/b1;->h:I

    .line 336
    .line 337
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    if-nez v25, :cond_b

    .line 342
    .line 343
    move-object/from16 v20, v2

    .line 344
    .line 345
    :cond_b
    if-eqz v20, :cond_c

    .line 346
    .line 347
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    goto :goto_a

    .line 352
    :cond_c
    invoke-interface {v6, v7}, Lp/r1;->b(Lu2/c;)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    :goto_a
    add-int/2addr v1, v2

    .line 357
    goto :goto_b

    .line 358
    :cond_d
    move/from16 v1, v24

    .line 359
    .line 360
    :goto_b
    sget-object v2, Lsh/q0;->j:Lsh/q0;

    .line 361
    .line 362
    iget-object v8, v0, Lsh/j0;->n:Lfg/p;

    .line 363
    .line 364
    invoke-interface {v7, v8, v2}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-static {v2}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    check-cast v2, Lv1/m0;

    .line 373
    .line 374
    invoke-static {v11, v12, v3, v4}, Lu2/b;->i(IIJ)J

    .line 375
    .line 376
    .line 377
    move-result-wide v11

    .line 378
    invoke-interface {v2, v11, v12}, Lv1/m0;->Q(J)Lv1/b1;

    .line 379
    .line 380
    .line 381
    move-result-object v12

    .line 382
    iget v2, v12, Lv1/b1;->g:I

    .line 383
    .line 384
    if-nez v2, :cond_e

    .line 385
    .line 386
    iget v2, v12, Lv1/b1;->h:I

    .line 387
    .line 388
    if-nez v2, :cond_e

    .line 389
    .line 390
    const/4 v11, 0x1

    .line 391
    goto :goto_c

    .line 392
    :cond_e
    move/from16 v11, v24

    .line 393
    .line 394
    :goto_c
    iget v2, v9, Lv1/b1;->g:I

    .line 395
    .line 396
    if-nez v2, :cond_f

    .line 397
    .line 398
    iget v2, v9, Lv1/b1;->h:I

    .line 399
    .line 400
    if-nez v2, :cond_f

    .line 401
    .line 402
    invoke-interface {v6, v7}, Lp/r1;->d(Lu2/c;)I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    invoke-interface {v7, v2}, Lu2/c;->i0(I)F

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    goto :goto_d

    .line 411
    :cond_f
    iget v2, v9, Lv1/b1;->h:I

    .line 412
    .line 413
    invoke-interface {v7, v2}, Lu2/c;->i0(I)F

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    :goto_d
    if-eqz v25, :cond_10

    .line 418
    .line 419
    invoke-interface {v6, v7}, Lp/r1;->b(Lu2/c;)I

    .line 420
    .line 421
    .line 422
    move-result v8

    .line 423
    invoke-interface {v7, v8}, Lu2/c;->i0(I)F

    .line 424
    .line 425
    .line 426
    move-result v8

    .line 427
    goto :goto_e

    .line 428
    :cond_10
    iget v8, v5, Lv1/b1;->h:I

    .line 429
    .line 430
    invoke-interface {v7, v8}, Lu2/c;->i0(I)F

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    :goto_e
    invoke-interface {v7}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 435
    .line 436
    .line 437
    move-result-object v13

    .line 438
    if-ne v13, v15, :cond_11

    .line 439
    .line 440
    invoke-interface {v6, v7, v13}, Lp/r1;->c(Lu2/c;Lu2/m;)I

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    invoke-interface {v7, v13}, Lu2/c;->i0(I)F

    .line 445
    .line 446
    .line 447
    move-result v13

    .line 448
    :goto_f
    move/from16 v20, v1

    .line 449
    .line 450
    goto :goto_10

    .line 451
    :cond_11
    invoke-interface {v6, v7, v13}, Lp/r1;->a(Lu2/c;Lu2/m;)I

    .line 452
    .line 453
    .line 454
    move-result v13

    .line 455
    invoke-interface {v7, v13}, Lu2/c;->i0(I)F

    .line 456
    .line 457
    .line 458
    move-result v13

    .line 459
    goto :goto_f

    .line 460
    :goto_10
    invoke-interface {v7}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    if-ne v1, v15, :cond_12

    .line 465
    .line 466
    invoke-interface {v6, v7, v1}, Lp/r1;->a(Lu2/c;Lu2/m;)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    invoke-interface {v7, v1}, Lu2/c;->i0(I)F

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    goto :goto_11

    .line 475
    :cond_12
    invoke-interface {v6, v7, v1}, Lp/r1;->c(Lu2/c;Lu2/m;)I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    invoke-interface {v7, v1}, Lu2/c;->i0(I)F

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    :goto_11
    new-instance v15, Lp/z0;

    .line 484
    .line 485
    invoke-direct {v15, v13, v2, v1, v8}, Lp/z0;-><init>(FFFF)V

    .line 486
    .line 487
    .line 488
    iget-object v1, v0, Lsh/j0;->o:Lsh/o0;

    .line 489
    .line 490
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    iget-object v1, v1, Lsh/o0;->a:Li0/j1;

    .line 494
    .line 495
    invoke-virtual {v1, v15}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    sget-object v1, Lsh/q0;->m:Lsh/q0;

    .line 499
    .line 500
    iget-object v2, v0, Lsh/j0;->p:Lfg/p;

    .line 501
    .line 502
    invoke-interface {v7, v2, v1}, Lv1/k1;->N(Lfg/p;Ljava/lang/Object;)Ljava/util/List;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    check-cast v1, Lv1/m0;

    .line 511
    .line 512
    invoke-interface {v1, v3, v4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    new-instance v1, Lsh/l0;

    .line 517
    .line 518
    iget v13, v0, Lsh/j0;->q:I

    .line 519
    .line 520
    move/from16 v15, p2

    .line 521
    .line 522
    move-object v3, v9

    .line 523
    move-object v4, v10

    .line 524
    move/from16 v9, v20

    .line 525
    .line 526
    move/from16 v8, v22

    .line 527
    .line 528
    move-object/from16 v20, v23

    .line 529
    .line 530
    move-object v10, v5

    .line 531
    move/from16 v5, v18

    .line 532
    .line 533
    move-object/from16 v18, v14

    .line 534
    .line 535
    move/from16 v14, p1

    .line 536
    .line 537
    invoke-direct/range {v1 .. v21}, Lsh/l0;-><init>(Lv1/b1;Lv1/b1;Lv1/b1;ILp/r1;Lv1/k1;IILv1/b1;ZLv1/b1;IIIIILb5/k;Lv1/b1;Lv1/b1;Ljava/lang/Integer;)V

    .line 538
    .line 539
    .line 540
    sget-object v2, Ltf/u;->g:Ltf/u;

    .line 541
    .line 542
    invoke-interface {v7, v5, v8, v2, v1}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    return-object v1
.end method
