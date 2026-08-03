.class public final synthetic Lwb/ou;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Landroid/app/Activity;

.field public final synthetic l:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lfg/a;Landroid/app/Activity;Lfg/l;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/ou;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ou;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ou;->i:Ljava/util/List;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ou;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/ou;->k:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/ou;->l:Lfg/l;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ou;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v11, p1

    .line 9
    .line 10
    check-cast v11, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x3

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    const/4 v5, 0x2

    .line 25
    if-eq v2, v5, :cond_0

    .line 26
    .line 27
    move v2, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v3

    .line 30
    :goto_0
    and-int/2addr v1, v4

    .line 31
    invoke-virtual {v11, v1, v2}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_6

    .line 36
    .line 37
    sget-object v12, Ly0/l;->a:Ly0/l;

    .line 38
    .line 39
    const/high16 v1, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-static {v12, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/16 v6, 0x26c

    .line 46
    .line 47
    int-to-float v6, v6

    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-static {v2, v7, v6, v4}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sget-object v6, Lp/j;->c:Lp/e;

    .line 54
    .line 55
    sget-object v8, Ly0/b;->s:Ly0/e;

    .line 56
    .line 57
    invoke-static {v6, v8, v11, v3}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-wide v8, v11, Li0/h0;->T:J

    .line 62
    .line 63
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    invoke-virtual {v11}, Li0/h0;->l()Ls0/h;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-static {v11, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 81
    .line 82
    invoke-virtual {v11}, Li0/h0;->d0()V

    .line 83
    .line 84
    .line 85
    iget-boolean v13, v11, Li0/h0;->S:Z

    .line 86
    .line 87
    if-eqz v13, :cond_1

    .line 88
    .line 89
    invoke-virtual {v11, v10}, Li0/h0;->k(Lfg/a;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {v11}, Li0/h0;->n0()V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 97
    .line 98
    invoke-static {v10, v11, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v6, Lx1/f;->d:Lx1/e;

    .line 102
    .line 103
    invoke-static {v6, v11, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 111
    .line 112
    invoke-static {v8, v11, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    sget-object v6, Lx1/f;->g:Lx1/d;

    .line 116
    .line 117
    invoke-static {v6, v11}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 118
    .line 119
    .line 120
    sget-object v6, Lx1/f;->c:Lx1/e;

    .line 121
    .line 122
    invoke-static {v6, v11, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object v2, v0, Lwb/ou;->h:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_2

    .line 132
    .line 133
    const v6, -0x1eb5d9d6

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11, v6}, Li0/h0;->a0(I)V

    .line 137
    .line 138
    .line 139
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 140
    .line 141
    invoke-virtual {v11, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Lbi/b;

    .line 146
    .line 147
    invoke-virtual {v6}, Lbi/b;->h()J

    .line 148
    .line 149
    .line 150
    move-result-wide v8

    .line 151
    const/16 v6, 0xd

    .line 152
    .line 153
    invoke-static {v6}, Lx6/d;->D(I)J

    .line 154
    .line 155
    .line 156
    move-result-wide v18

    .line 157
    const/4 v6, 0x4

    .line 158
    int-to-float v13, v6

    .line 159
    const/16 v6, 0xa

    .line 160
    .line 161
    int-to-float v6, v6

    .line 162
    const/16 v17, 0x6

    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    move/from16 v16, v6

    .line 167
    .line 168
    invoke-static/range {v12 .. v17}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    const/16 v23, 0x0

    .line 173
    .line 174
    const v24, 0x3ffe8

    .line 175
    .line 176
    .line 177
    move v10, v5

    .line 178
    move-wide/from16 v31, v8

    .line 179
    .line 180
    move v9, v4

    .line 181
    move-wide/from16 v4, v31

    .line 182
    .line 183
    const/4 v8, 0x0

    .line 184
    move v13, v9

    .line 185
    const/4 v9, 0x0

    .line 186
    move v14, v10

    .line 187
    move-object/from16 v21, v11

    .line 188
    .line 189
    const-wide/16 v10, 0x0

    .line 190
    .line 191
    move-object v15, v12

    .line 192
    const/4 v12, 0x0

    .line 193
    move/from16 v16, v13

    .line 194
    .line 195
    move/from16 v17, v14

    .line 196
    .line 197
    const-wide/16 v13, 0x0

    .line 198
    .line 199
    move-object/from16 v20, v15

    .line 200
    .line 201
    const/4 v15, 0x0

    .line 202
    move/from16 v22, v16

    .line 203
    .line 204
    const/16 v16, 0x0

    .line 205
    .line 206
    move/from16 v25, v17

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    move/from16 v26, v3

    .line 211
    .line 212
    move-object v3, v6

    .line 213
    move-wide/from16 v31, v18

    .line 214
    .line 215
    move/from16 v19, v7

    .line 216
    .line 217
    move-wide/from16 v6, v31

    .line 218
    .line 219
    const/16 v18, 0x0

    .line 220
    .line 221
    move/from16 v27, v19

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    move-object/from16 v28, v20

    .line 226
    .line 227
    const/16 v20, 0x0

    .line 228
    .line 229
    move/from16 v29, v22

    .line 230
    .line 231
    const/16 v22, 0x6030

    .line 232
    .line 233
    move/from16 v1, v26

    .line 234
    .line 235
    move-object/from16 v0, v28

    .line 236
    .line 237
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 238
    .line 239
    .line 240
    move-object/from16 v11, v21

    .line 241
    .line 242
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 243
    .line 244
    .line 245
    :goto_2
    const/high16 v2, 0x3f800000    # 1.0f

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_2
    move v1, v3

    .line 249
    move-object v0, v12

    .line 250
    const v2, -0x1eb0e59f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v11, v2}, Li0/h0;->a0(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v11, v1}, Li0/h0;->p(Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :goto_3
    invoke-static {v0, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    float-to-double v4, v2

    .line 265
    const-wide/16 v6, 0x0

    .line 266
    .line 267
    cmpl-double v4, v4, v6

    .line 268
    .line 269
    if-lez v4, :cond_3

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_3
    const-string v4, "invalid weight; must be greater than zero"

    .line 273
    .line 274
    invoke-static {v4}, Lq/a;->a(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :goto_4
    new-instance v4, Lp/q0;

    .line 278
    .line 279
    invoke-direct {v4, v2, v1}, Lp/q0;-><init>(FZ)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v3, v4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    move-object/from16 v1, p0

    .line 287
    .line 288
    iget-object v3, v1, Lwb/ou;->i:Ljava/util/List;

    .line 289
    .line 290
    invoke-virtual {v11, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    iget-object v14, v1, Lwb/ou;->j:Lfg/a;

    .line 295
    .line 296
    invoke-virtual {v11, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    or-int/2addr v4, v5

    .line 301
    iget-object v5, v1, Lwb/ou;->k:Landroid/app/Activity;

    .line 302
    .line 303
    invoke-virtual {v11, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    or-int/2addr v4, v6

    .line 308
    iget-object v6, v1, Lwb/ou;->l:Lfg/l;

    .line 309
    .line 310
    invoke-virtual {v11, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    or-int/2addr v4, v7

    .line 315
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    if-nez v4, :cond_4

    .line 320
    .line 321
    sget-object v4, Li0/l;->a:Li0/e;

    .line 322
    .line 323
    if-ne v7, v4, :cond_5

    .line 324
    .line 325
    :cond_4
    new-instance v7, Lwb/ss;

    .line 326
    .line 327
    invoke-direct {v7, v3, v14, v5, v6}, Lwb/ss;-><init>(Ljava/util/List;Lfg/a;Landroid/app/Activity;Lfg/l;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v11, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_5
    move-object v10, v7

    .line 334
    check-cast v10, Lfg/l;

    .line 335
    .line 336
    const/4 v12, 0x0

    .line 337
    const/16 v13, 0x1fe

    .line 338
    .line 339
    const/4 v3, 0x0

    .line 340
    const/4 v4, 0x0

    .line 341
    const/4 v5, 0x0

    .line 342
    const/4 v6, 0x0

    .line 343
    const/4 v7, 0x0

    .line 344
    const/4 v8, 0x0

    .line 345
    const/4 v9, 0x0

    .line 346
    invoke-static/range {v2 .. v13}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x3f800000    # 1.0f

    .line 350
    .line 351
    invoke-static {v0, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    const/16 v0, 0x8

    .line 356
    .line 357
    int-to-float v5, v0

    .line 358
    const/4 v0, 0x6

    .line 359
    int-to-float v7, v0

    .line 360
    const/4 v8, 0x5

    .line 361
    const/4 v4, 0x0

    .line 362
    const/4 v6, 0x0

    .line 363
    invoke-static/range {v3 .. v8}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    const/16 v2, 0x2c

    .line 368
    .line 369
    int-to-float v2, v2

    .line 370
    const/4 v3, 0x0

    .line 371
    const/4 v10, 0x2

    .line 372
    invoke-static {v0, v2, v3, v10}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    const/16 v12, 0x186

    .line 377
    .line 378
    const/16 v13, 0x7f8

    .line 379
    .line 380
    const-string v2, "\u53d6\u6d88"

    .line 381
    .line 382
    const/4 v5, 0x0

    .line 383
    const/4 v7, 0x0

    .line 384
    const/4 v8, 0x0

    .line 385
    const/4 v10, 0x0

    .line 386
    move-object v3, v14

    .line 387
    invoke-static/range {v2 .. v13}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 388
    .line 389
    .line 390
    const/4 v13, 0x1

    .line 391
    invoke-virtual {v11, v13}, Li0/h0;->p(Z)V

    .line 392
    .line 393
    .line 394
    goto :goto_5

    .line 395
    :cond_6
    move-object v1, v0

    .line 396
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 397
    .line 398
    .line 399
    :goto_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_0
    move-object v1, v0

    .line 403
    move-object/from16 v6, p1

    .line 404
    .line 405
    check-cast v6, Li0/h0;

    .line 406
    .line 407
    move-object/from16 v0, p2

    .line 408
    .line 409
    check-cast v0, Ljava/lang/Integer;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    and-int/lit8 v2, v0, 0x3

    .line 416
    .line 417
    const/4 v3, 0x0

    .line 418
    const/4 v4, 0x1

    .line 419
    const/4 v5, 0x2

    .line 420
    if-eq v2, v5, :cond_7

    .line 421
    .line 422
    move v2, v4

    .line 423
    goto :goto_6

    .line 424
    :cond_7
    move v2, v3

    .line 425
    :goto_6
    and-int/2addr v0, v4

    .line 426
    invoke-virtual {v6, v0, v2}, Li0/h0;->S(IZ)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-eqz v0, :cond_e

    .line 431
    .line 432
    sget-object v7, Ly0/l;->a:Ly0/l;

    .line 433
    .line 434
    const/high16 v0, 0x3f800000    # 1.0f

    .line 435
    .line 436
    invoke-static {v7, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    sget-object v8, Lp/j;->c:Lp/e;

    .line 441
    .line 442
    sget-object v9, Ly0/b;->s:Ly0/e;

    .line 443
    .line 444
    invoke-static {v8, v9, v6, v3}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    iget-wide v9, v6, Li0/h0;->T:J

    .line 449
    .line 450
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 451
    .line 452
    .line 453
    move-result v9

    .line 454
    invoke-virtual {v6}, Li0/h0;->l()Ls0/h;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    invoke-static {v6, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 463
    .line 464
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 468
    .line 469
    invoke-virtual {v6}, Li0/h0;->d0()V

    .line 470
    .line 471
    .line 472
    iget-boolean v12, v6, Li0/h0;->S:Z

    .line 473
    .line 474
    if-eqz v12, :cond_8

    .line 475
    .line 476
    invoke-virtual {v6, v11}, Li0/h0;->k(Lfg/a;)V

    .line 477
    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_8
    invoke-virtual {v6}, Li0/h0;->n0()V

    .line 481
    .line 482
    .line 483
    :goto_7
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 484
    .line 485
    invoke-static {v11, v6, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    sget-object v8, Lx1/f;->d:Lx1/e;

    .line 489
    .line 490
    invoke-static {v8, v6, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    sget-object v9, Lx1/f;->f:Lx1/e;

    .line 498
    .line 499
    invoke-static {v9, v6, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    sget-object v8, Lx1/f;->g:Lx1/d;

    .line 503
    .line 504
    invoke-static {v8, v6}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 505
    .line 506
    .line 507
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 508
    .line 509
    invoke-static {v8, v6, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    iget-object v2, v1, Lwb/ou;->h:Ljava/lang/String;

    .line 513
    .line 514
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 515
    .line 516
    .line 517
    move-result v8

    .line 518
    if-nez v8, :cond_9

    .line 519
    .line 520
    const v8, 0x5af27928

    .line 521
    .line 522
    .line 523
    invoke-virtual {v6, v8}, Li0/h0;->a0(I)V

    .line 524
    .line 525
    .line 526
    sget-object v8, Lbi/d;->a:Li0/m2;

    .line 527
    .line 528
    invoke-virtual {v6, v8}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v8

    .line 532
    check-cast v8, Lbi/b;

    .line 533
    .line 534
    invoke-virtual {v8}, Lbi/b;->h()J

    .line 535
    .line 536
    .line 537
    move-result-wide v13

    .line 538
    const/16 v8, 0xd

    .line 539
    .line 540
    invoke-static {v8}, Lx6/d;->D(I)J

    .line 541
    .line 542
    .line 543
    move-result-wide v15

    .line 544
    const/4 v8, 0x4

    .line 545
    int-to-float v8, v8

    .line 546
    const/16 v9, 0xa

    .line 547
    .line 548
    int-to-float v11, v9

    .line 549
    const/4 v12, 0x6

    .line 550
    const/4 v9, 0x0

    .line 551
    const/4 v10, 0x0

    .line 552
    invoke-static/range {v7 .. v12}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    const/16 v23, 0x0

    .line 557
    .line 558
    const v24, 0x3ffe8

    .line 559
    .line 560
    .line 561
    move v9, v3

    .line 562
    move-object v3, v8

    .line 563
    const/4 v8, 0x0

    .line 564
    move v10, v9

    .line 565
    const/4 v9, 0x0

    .line 566
    move v12, v10

    .line 567
    const-wide/16 v10, 0x0

    .line 568
    .line 569
    move/from16 v17, v12

    .line 570
    .line 571
    const/4 v12, 0x0

    .line 572
    move/from16 v18, v4

    .line 573
    .line 574
    move/from16 v19, v5

    .line 575
    .line 576
    move-wide v4, v13

    .line 577
    const-wide/16 v13, 0x0

    .line 578
    .line 579
    move-object/from16 v21, v6

    .line 580
    .line 581
    move-wide/from16 v31, v15

    .line 582
    .line 583
    move-object/from16 v16, v7

    .line 584
    .line 585
    move-wide/from16 v6, v31

    .line 586
    .line 587
    const/4 v15, 0x0

    .line 588
    move-object/from16 v20, v16

    .line 589
    .line 590
    const/16 v16, 0x0

    .line 591
    .line 592
    move/from16 v22, v17

    .line 593
    .line 594
    const/16 v17, 0x0

    .line 595
    .line 596
    move/from16 v25, v18

    .line 597
    .line 598
    const/16 v18, 0x0

    .line 599
    .line 600
    move/from16 v26, v19

    .line 601
    .line 602
    const/16 v19, 0x0

    .line 603
    .line 604
    move-object/from16 v27, v20

    .line 605
    .line 606
    const/16 v20, 0x0

    .line 607
    .line 608
    move/from16 v28, v22

    .line 609
    .line 610
    const/16 v22, 0x6030

    .line 611
    .line 612
    move-object/from16 v30, v27

    .line 613
    .line 614
    move/from16 v0, v28

    .line 615
    .line 616
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 617
    .line 618
    .line 619
    move-object/from16 v6, v21

    .line 620
    .line 621
    invoke-virtual {v6, v0}, Li0/h0;->p(Z)V

    .line 622
    .line 623
    .line 624
    goto :goto_8

    .line 625
    :cond_9
    move v0, v3

    .line 626
    move-object/from16 v30, v7

    .line 627
    .line 628
    const v2, 0x5af76d5f

    .line 629
    .line 630
    .line 631
    invoke-virtual {v6, v2}, Li0/h0;->a0(I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v6, v0}, Li0/h0;->p(Z)V

    .line 635
    .line 636
    .line 637
    :goto_8
    const v2, -0x1e1907c4

    .line 638
    .line 639
    .line 640
    invoke-virtual {v6, v2}, Li0/h0;->a0(I)V

    .line 641
    .line 642
    .line 643
    iget-object v2, v1, Lwb/ou;->i:Ljava/util/List;

    .line 644
    .line 645
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v8

    .line 649
    move v13, v0

    .line 650
    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    iget-object v3, v1, Lwb/ou;->j:Lfg/a;

    .line 655
    .line 656
    if-eqz v2, :cond_d

    .line 657
    .line 658
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    add-int/lit8 v15, v13, 0x1

    .line 663
    .line 664
    if-ltz v13, :cond_c

    .line 665
    .line 666
    check-cast v2, Lsf/e;

    .line 667
    .line 668
    sget-object v4, Lwb/y2;->p:Lwb/y2;

    .line 669
    .line 670
    iget-object v5, v2, Lsf/e;->g:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v5, Ljava/lang/String;

    .line 673
    .line 674
    iget-object v2, v2, Lsf/e;->h:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v2, Ljava/lang/String;

    .line 677
    .line 678
    invoke-virtual {v6, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v7

    .line 682
    iget-object v11, v1, Lwb/ou;->k:Landroid/app/Activity;

    .line 683
    .line 684
    invoke-virtual {v6, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v9

    .line 688
    or-int/2addr v7, v9

    .line 689
    iget-object v12, v1, Lwb/ou;->l:Lfg/l;

    .line 690
    .line 691
    invoke-virtual {v6, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v9

    .line 695
    or-int/2addr v7, v9

    .line 696
    invoke-virtual {v6, v13}, Li0/h0;->d(I)Z

    .line 697
    .line 698
    .line 699
    move-result v9

    .line 700
    or-int/2addr v7, v9

    .line 701
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v9

    .line 705
    if-nez v7, :cond_a

    .line 706
    .line 707
    sget-object v7, Li0/l;->a:Li0/e;

    .line 708
    .line 709
    if-ne v9, v7, :cond_b

    .line 710
    .line 711
    :cond_a
    new-instance v9, Lwb/pu;

    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    move-object v10, v3

    .line 715
    invoke-direct/range {v9 .. v14}, Lwb/pu;-><init>(Lfg/a;Landroid/app/Activity;Lfg/l;II)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v6, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    :cond_b
    check-cast v9, Lfg/a;

    .line 722
    .line 723
    const/16 v7, 0xc00

    .line 724
    .line 725
    move-object v3, v4

    .line 726
    move-object v4, v2

    .line 727
    move-object v2, v3

    .line 728
    move-object v3, v5

    .line 729
    move-object v5, v9

    .line 730
    invoke-virtual/range {v2 .. v7}, Lwb/y2;->z(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 731
    .line 732
    .line 733
    move v13, v15

    .line 734
    goto :goto_9

    .line 735
    :cond_c
    invoke-static {}, La/a;->Q0()V

    .line 736
    .line 737
    .line 738
    const/4 v0, 0x0

    .line 739
    throw v0

    .line 740
    :cond_d
    invoke-virtual {v6, v0}, Li0/h0;->p(Z)V

    .line 741
    .line 742
    .line 743
    move-object/from16 v7, v30

    .line 744
    .line 745
    const/high16 v0, 0x3f800000    # 1.0f

    .line 746
    .line 747
    invoke-static {v7, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 748
    .line 749
    .line 750
    move-result-object v8

    .line 751
    const/16 v0, 0x8

    .line 752
    .line 753
    int-to-float v10, v0

    .line 754
    const/4 v0, 0x6

    .line 755
    int-to-float v12, v0

    .line 756
    const/4 v13, 0x5

    .line 757
    const/4 v9, 0x0

    .line 758
    const/4 v11, 0x0

    .line 759
    invoke-static/range {v8 .. v13}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    const/16 v2, 0x2c

    .line 764
    .line 765
    int-to-float v2, v2

    .line 766
    const/4 v4, 0x0

    .line 767
    const/4 v5, 0x2

    .line 768
    invoke-static {v0, v2, v4, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 769
    .line 770
    .line 771
    move-result-object v4

    .line 772
    const/16 v12, 0x186

    .line 773
    .line 774
    const/16 v13, 0x7f8

    .line 775
    .line 776
    const-string v2, "\u53d6\u6d88"

    .line 777
    .line 778
    const/4 v5, 0x0

    .line 779
    move-object/from16 v21, v6

    .line 780
    .line 781
    const/4 v6, 0x0

    .line 782
    const/4 v7, 0x0

    .line 783
    const/4 v8, 0x0

    .line 784
    const/4 v9, 0x0

    .line 785
    const/4 v10, 0x0

    .line 786
    move-object/from16 v11, v21

    .line 787
    .line 788
    invoke-static/range {v2 .. v13}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 789
    .line 790
    .line 791
    move-object v6, v11

    .line 792
    const/4 v0, 0x1

    .line 793
    invoke-virtual {v6, v0}, Li0/h0;->p(Z)V

    .line 794
    .line 795
    .line 796
    goto :goto_a

    .line 797
    :cond_e
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 798
    .line 799
    .line 800
    :goto_a
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 801
    .line 802
    return-object v0

    .line 803
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
