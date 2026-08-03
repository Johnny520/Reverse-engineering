.class public final Lw/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/n0;


# instance fields
.field public final synthetic a:Lw/q0;

.field public final synthetic b:Lfg/l;

.field public final synthetic c:Ln2/s;

.field public final synthetic d:Lb5/k;

.field public final synthetic e:Lu2/c;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Lw/q0;Lfg/l;Ln2/s;Lb5/k;Lu2/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/a0;->a:Lw/q0;

    .line 5
    .line 6
    iput-object p2, p0, Lw/a0;->b:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lw/a0;->c:Ln2/s;

    .line 9
    .line 10
    iput-object p4, p0, Lw/a0;->d:Lb5/k;

    .line 11
    .line 12
    iput-object p5, p0, Lw/a0;->e:Lu2/c;

    .line 13
    .line 14
    iput p6, p0, Lw/a0;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Lv1/o;Ljava/util/List;I)I
    .locals 0

    .line 1
    iget-object p2, p0, Lw/a0;->a:Lw/q0;

    .line 2
    .line 3
    iget-object p3, p2, Lw/q0;->a:Lw/x0;

    .line 4
    .line 5
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p3, p1}, Lw/x0;->a(Lu2/m;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p2, Lw/q0;->a:Lw/x0;

    .line 13
    .line 14
    iget-object p1, p1, Lw/x0;->j:Lbe/k;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lbe/k;->c()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Lw/s;->n(F)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_0
    const-string p1, "layoutIntrinsics must be called first"

    .line 28
    .line 29
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return p1
.end method

.method public final h(Lv1/p0;Ljava/util/List;J)Lv1/o0;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lw/a0;->a:Lw/q0;

    .line 4
    .line 5
    invoke-static {}, Lw0/q;->e()Lw0/f;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lw0/f;->e()Lfg/l;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    :goto_0
    invoke-static {v2}, Lw0/q;->h(Lw0/f;)Lw0/f;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :try_start_0
    invoke-virtual {v0}, Lw/q0;->d()Lw/m1;

    .line 22
    .line 23
    .line 24
    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    invoke-static {v2, v4, v3}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 26
    .line 27
    .line 28
    if-eqz v15, :cond_1

    .line 29
    .line 30
    iget-object v2, v15, Lw/m1;->a:Li2/k0;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v2, 0x0

    .line 34
    :goto_1
    iget-object v3, v0, Lw/q0;->a:Lw/x0;

    .line 35
    .line 36
    invoke-interface/range {p1 .. p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    iget v4, v3, Lw/x0;->f:I

    .line 41
    .line 42
    iget-boolean v5, v3, Lw/x0;->e:Z

    .line 43
    .line 44
    iget v6, v3, Lw/x0;->c:I

    .line 45
    .line 46
    const-wide v16, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v18, 0x20

    .line 52
    .line 53
    if-eqz v2, :cond_8

    .line 54
    .line 55
    iget-object v11, v2, Li2/k0;->b:Li2/o;

    .line 56
    .line 57
    iget-object v12, v2, Li2/k0;->a:Li2/j0;

    .line 58
    .line 59
    iget-object v13, v3, Lw/x0;->a:Li2/g;

    .line 60
    .line 61
    iget-object v7, v3, Lw/x0;->b:Li2/n0;

    .line 62
    .line 63
    iget-object v8, v3, Lw/x0;->i:Ljava/util/List;

    .line 64
    .line 65
    iget-object v14, v3, Lw/x0;->g:Lu2/c;

    .line 66
    .line 67
    iget-object v9, v3, Lw/x0;->h:Lm2/d;

    .line 68
    .line 69
    move-object/from16 v21, v2

    .line 70
    .line 71
    iget-object v2, v11, Li2/o;->a:Lbe/k;

    .line 72
    .line 73
    invoke-virtual {v2}, Lbe/k;->a()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    move-wide/from16 v12, p3

    .line 80
    .line 81
    move-object/from16 v22, v0

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_2
    iget-object v2, v12, Li2/j0;->a:Li2/g;

    .line 86
    .line 87
    move-object/from16 v22, v0

    .line 88
    .line 89
    iget-wide v0, v12, Li2/j0;->j:J

    .line 90
    .line 91
    invoke-static {v2, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    iget-object v2, v12, Li2/j0;->b:Li2/n0;

    .line 98
    .line 99
    invoke-virtual {v2, v7}, Li2/n0;->b(Li2/n0;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    iget-object v2, v12, Li2/j0;->c:Ljava/util/List;

    .line 106
    .line 107
    invoke-static {v2, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    iget v2, v12, Li2/j0;->d:I

    .line 114
    .line 115
    if-ne v2, v6, :cond_7

    .line 116
    .line 117
    iget-boolean v2, v12, Li2/j0;->e:Z

    .line 118
    .line 119
    if-ne v2, v5, :cond_7

    .line 120
    .line 121
    iget v2, v12, Li2/j0;->f:I

    .line 122
    .line 123
    if-ne v2, v4, :cond_7

    .line 124
    .line 125
    iget-object v2, v12, Li2/j0;->g:Lu2/c;

    .line 126
    .line 127
    invoke-static {v2, v14}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_7

    .line 132
    .line 133
    iget-object v2, v12, Li2/j0;->h:Lu2/m;

    .line 134
    .line 135
    if-ne v2, v10, :cond_7

    .line 136
    .line 137
    iget-object v2, v12, Li2/j0;->i:Lm2/d;

    .line 138
    .line 139
    invoke-static {v2, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_3

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_3
    invoke-static/range {p3 .. p4}, Lu2/a;->j(J)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-static {v0, v1}, Lu2/a;->j(J)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eq v2, v7, :cond_4

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    if-nez v5, :cond_5

    .line 158
    .line 159
    const/4 v2, 0x2

    .line 160
    if-ne v4, v2, :cond_6

    .line 161
    .line 162
    :cond_5
    invoke-static/range {p3 .. p4}, Lu2/a;->h(J)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-static {v0, v1}, Lu2/a;->h(J)I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-ne v2, v7, :cond_7

    .line 171
    .line 172
    invoke-static/range {p3 .. p4}, Lu2/a;->g(J)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-static {v0, v1}, Lu2/a;->g(J)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-ne v2, v0, :cond_7

    .line 181
    .line 182
    :cond_6
    new-instance v2, Li2/j0;

    .line 183
    .line 184
    iget-object v0, v12, Li2/j0;->a:Li2/g;

    .line 185
    .line 186
    iget-object v4, v3, Lw/x0;->b:Li2/n0;

    .line 187
    .line 188
    iget-object v5, v12, Li2/j0;->c:Ljava/util/List;

    .line 189
    .line 190
    iget v6, v12, Li2/j0;->d:I

    .line 191
    .line 192
    iget-boolean v7, v12, Li2/j0;->e:Z

    .line 193
    .line 194
    iget v8, v12, Li2/j0;->f:I

    .line 195
    .line 196
    iget-object v9, v12, Li2/j0;->g:Lu2/c;

    .line 197
    .line 198
    iget-object v10, v12, Li2/j0;->h:Lu2/m;

    .line 199
    .line 200
    iget-object v1, v12, Li2/j0;->i:Lm2/d;

    .line 201
    .line 202
    move-object v3, v11

    .line 203
    move-object v11, v1

    .line 204
    move-object v1, v3

    .line 205
    move-wide/from16 v12, p3

    .line 206
    .line 207
    move-object v3, v0

    .line 208
    move-object/from16 v14, v21

    .line 209
    .line 210
    const/4 v0, 0x0

    .line 211
    invoke-direct/range {v2 .. v13}, Li2/j0;-><init>(Li2/g;Li2/n0;Ljava/util/List;IZILu2/c;Lu2/m;Lm2/d;J)V

    .line 212
    .line 213
    .line 214
    iget v3, v1, Li2/o;->d:F

    .line 215
    .line 216
    invoke-static {v3}, Lw/s;->n(F)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    iget v4, v1, Li2/o;->e:F

    .line 221
    .line 222
    invoke-static {v4}, Lw/s;->n(F)I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    int-to-long v5, v3

    .line 227
    shl-long v5, v5, v18

    .line 228
    .line 229
    int-to-long v3, v4

    .line 230
    and-long v3, v3, v16

    .line 231
    .line 232
    or-long/2addr v3, v5

    .line 233
    invoke-static {v12, v13, v3, v4}, Lu2/b;->d(JJ)J

    .line 234
    .line 235
    .line 236
    move-result-wide v3

    .line 237
    new-instance v5, Li2/k0;

    .line 238
    .line 239
    invoke-direct {v5, v2, v1, v3, v4}, Li2/k0;-><init>(Li2/j0;Li2/o;J)V

    .line 240
    .line 241
    .line 242
    move-object/from16 v23, v14

    .line 243
    .line 244
    move-object/from16 p2, v15

    .line 245
    .line 246
    goto/16 :goto_8

    .line 247
    .line 248
    :cond_7
    :goto_2
    move-wide/from16 v12, p3

    .line 249
    .line 250
    :goto_3
    move-object/from16 v14, v21

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_8
    move-wide/from16 v12, p3

    .line 254
    .line 255
    move-object/from16 v22, v0

    .line 256
    .line 257
    move-object v14, v2

    .line 258
    :goto_4
    const/4 v0, 0x0

    .line 259
    invoke-virtual {v3, v10}, Lw/x0;->a(Lu2/m;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v12, v13}, Lu2/a;->j(J)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-nez v5, :cond_9

    .line 267
    .line 268
    const/4 v2, 0x2

    .line 269
    if-ne v4, v2, :cond_a

    .line 270
    .line 271
    :cond_9
    invoke-static {v12, v13}, Lu2/a;->d(J)Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-eqz v2, :cond_a

    .line 276
    .line 277
    invoke-static {v12, v13}, Lu2/a;->h(J)I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    goto :goto_5

    .line 282
    :cond_a
    const v2, 0x7fffffff

    .line 283
    .line 284
    .line 285
    :goto_5
    if-nez v5, :cond_b

    .line 286
    .line 287
    const/4 v5, 0x2

    .line 288
    if-ne v4, v5, :cond_b

    .line 289
    .line 290
    const/16 v27, 0x1

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_b
    move/from16 v27, v6

    .line 294
    .line 295
    :goto_6
    const-string v4, "layoutIntrinsics must be called first"

    .line 296
    .line 297
    if-ne v1, v2, :cond_c

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_c
    iget-object v5, v3, Lw/x0;->j:Lbe/k;

    .line 301
    .line 302
    if-eqz v5, :cond_11

    .line 303
    .line 304
    invoke-virtual {v5}, Lbe/k;->c()F

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    invoke-static {v5}, Lw/s;->n(F)I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    invoke-static {v5, v1, v2}, Lr9/e0;->r(III)I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    :goto_7
    new-instance v23, Li2/o;

    .line 317
    .line 318
    iget-object v1, v3, Lw/x0;->j:Lbe/k;

    .line 319
    .line 320
    if-eqz v1, :cond_10

    .line 321
    .line 322
    invoke-static {v12, v13}, Lu2/a;->g(J)I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    invoke-static {v0, v2, v0, v4}, Lf8/i;->u(IIII)J

    .line 327
    .line 328
    .line 329
    move-result-wide v25

    .line 330
    iget v2, v3, Lw/x0;->f:I

    .line 331
    .line 332
    move-object/from16 v24, v1

    .line 333
    .line 334
    move/from16 v28, v2

    .line 335
    .line 336
    invoke-direct/range {v23 .. v28}, Li2/o;-><init>(Lbe/k;JII)V

    .line 337
    .line 338
    .line 339
    move-object/from16 v1, v23

    .line 340
    .line 341
    iget v2, v1, Li2/o;->d:F

    .line 342
    .line 343
    invoke-static {v2}, Lw/s;->n(F)I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    iget v4, v1, Li2/o;->e:F

    .line 348
    .line 349
    invoke-static {v4}, Lw/s;->n(F)I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    int-to-long v5, v2

    .line 354
    shl-long v5, v5, v18

    .line 355
    .line 356
    int-to-long v7, v4

    .line 357
    and-long v7, v7, v16

    .line 358
    .line 359
    or-long v4, v5, v7

    .line 360
    .line 361
    invoke-static {v12, v13, v4, v5}, Lu2/b;->d(JJ)J

    .line 362
    .line 363
    .line 364
    move-result-wide v4

    .line 365
    new-instance v2, Li2/k0;

    .line 366
    .line 367
    move-object v6, v2

    .line 368
    new-instance v2, Li2/j0;

    .line 369
    .line 370
    iget-object v7, v3, Lw/x0;->a:Li2/g;

    .line 371
    .line 372
    move-wide v8, v4

    .line 373
    iget-object v4, v3, Lw/x0;->b:Li2/n0;

    .line 374
    .line 375
    iget-object v5, v3, Lw/x0;->i:Ljava/util/List;

    .line 376
    .line 377
    move-object v11, v6

    .line 378
    iget v6, v3, Lw/x0;->c:I

    .line 379
    .line 380
    move-object/from16 v19, v7

    .line 381
    .line 382
    iget-boolean v7, v3, Lw/x0;->e:Z

    .line 383
    .line 384
    move-wide/from16 v20, v8

    .line 385
    .line 386
    iget v8, v3, Lw/x0;->f:I

    .line 387
    .line 388
    iget-object v9, v3, Lw/x0;->g:Lu2/c;

    .line 389
    .line 390
    iget-object v3, v3, Lw/x0;->h:Lm2/d;

    .line 391
    .line 392
    move-object v0, v11

    .line 393
    move-object/from16 v23, v14

    .line 394
    .line 395
    move-object/from16 p2, v15

    .line 396
    .line 397
    move-wide/from16 v14, v20

    .line 398
    .line 399
    move-object v11, v3

    .line 400
    move-object/from16 v3, v19

    .line 401
    .line 402
    invoke-direct/range {v2 .. v13}, Li2/j0;-><init>(Li2/g;Li2/n0;Ljava/util/List;IZILu2/c;Lu2/m;Lm2/d;J)V

    .line 403
    .line 404
    .line 405
    invoke-direct {v0, v2, v1, v14, v15}, Li2/k0;-><init>(Li2/j0;Li2/o;J)V

    .line 406
    .line 407
    .line 408
    move-object v5, v0

    .line 409
    :goto_8
    iget-wide v0, v5, Li2/k0;->c:J

    .line 410
    .line 411
    shr-long v2, v0, v18

    .line 412
    .line 413
    long-to-int v2, v2

    .line 414
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    and-long v0, v0, v16

    .line 419
    .line 420
    long-to-int v0, v0

    .line 421
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    move-object/from16 v14, v23

    .line 434
    .line 435
    invoke-static {v14, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-nez v2, :cond_e

    .line 440
    .line 441
    new-instance v2, Lw/m1;

    .line 442
    .line 443
    if-eqz p2, :cond_d

    .line 444
    .line 445
    move-object/from16 v3, p2

    .line 446
    .line 447
    iget-object v14, v3, Lw/m1;->c:Lv1/t;

    .line 448
    .line 449
    goto :goto_9

    .line 450
    :cond_d
    const/4 v14, 0x0

    .line 451
    :goto_9
    invoke-direct {v2, v5, v14}, Lw/m1;-><init>(Li2/k0;Lv1/t;)V

    .line 452
    .line 453
    .line 454
    move-object/from16 v3, v22

    .line 455
    .line 456
    iget-object v4, v3, Lw/q0;->i:Li0/j1;

    .line 457
    .line 458
    invoke-virtual {v4, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    const/4 v2, 0x0

    .line 462
    iput-boolean v2, v3, Lw/q0;->p:Z

    .line 463
    .line 464
    move-object/from16 v6, p0

    .line 465
    .line 466
    iget-object v4, v6, Lw/a0;->b:Lfg/l;

    .line 467
    .line 468
    invoke-interface {v4, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    iget-object v4, v6, Lw/a0;->c:Ln2/s;

    .line 472
    .line 473
    iget-object v7, v6, Lw/a0;->d:Lb5/k;

    .line 474
    .line 475
    invoke-static {v3, v4, v7}, Lw/s;->w(Lw/q0;Ln2/s;Lb5/k;)V

    .line 476
    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_e
    move-object/from16 v6, p0

    .line 480
    .line 481
    move-object/from16 v3, v22

    .line 482
    .line 483
    const/4 v2, 0x0

    .line 484
    :goto_a
    iget v4, v6, Lw/a0;->f:I

    .line 485
    .line 486
    const/4 v7, 0x1

    .line 487
    if-ne v4, v7, :cond_f

    .line 488
    .line 489
    iget-object v4, v5, Li2/k0;->b:Li2/o;

    .line 490
    .line 491
    invoke-virtual {v4, v2}, Li2/o;->b(I)F

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    invoke-static {v2}, Lw/s;->n(F)I

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    goto :goto_b

    .line 500
    :cond_f
    move v8, v2

    .line 501
    :goto_b
    iget-object v2, v6, Lw/a0;->e:Lu2/c;

    .line 502
    .line 503
    invoke-interface {v2, v8}, Lu2/c;->i0(I)F

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    iget-object v3, v3, Lw/q0;->g:Li0/j1;

    .line 508
    .line 509
    new-instance v4, Lu2/f;

    .line 510
    .line 511
    invoke-direct {v4, v2}, Lu2/f;-><init>(F)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v3, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    sget-object v2, Lv1/c;->a:Lv1/j;

    .line 518
    .line 519
    iget v3, v5, Li2/k0;->d:F

    .line 520
    .line 521
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    new-instance v4, Lsf/e;

    .line 530
    .line 531
    invoke-direct {v4, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    sget-object v2, Lv1/c;->b:Lv1/j;

    .line 535
    .line 536
    iget v3, v5, Li2/k0;->e:F

    .line 537
    .line 538
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    new-instance v5, Lsf/e;

    .line 547
    .line 548
    invoke-direct {v5, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    filled-new-array {v4, v5}, [Lsf/e;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    invoke-static {v2}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    new-instance v3, Li2/z;

    .line 560
    .line 561
    const/16 v4, 0xe

    .line 562
    .line 563
    invoke-direct {v3, v4}, Li2/z;-><init>(I)V

    .line 564
    .line 565
    .line 566
    move-object/from16 v4, p1

    .line 567
    .line 568
    invoke-interface {v4, v1, v0, v2, v3}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    return-object v0

    .line 573
    :cond_10
    move-object/from16 v6, p0

    .line 574
    .line 575
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    const/4 v0, 0x0

    .line 579
    return-object v0

    .line 580
    :cond_11
    move-object/from16 v6, p0

    .line 581
    .line 582
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    const/4 v0, 0x0

    .line 586
    return-object v0

    .line 587
    :catchall_0
    move-exception v0

    .line 588
    move-object v6, v1

    .line 589
    invoke-static {v2, v4, v3}, Lw0/q;->k(Lw0/f;Lw0/f;Lfg/l;)V

    .line 590
    .line 591
    .line 592
    throw v0
.end method
