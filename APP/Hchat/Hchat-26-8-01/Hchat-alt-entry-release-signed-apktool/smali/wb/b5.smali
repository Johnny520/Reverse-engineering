.class public final synthetic Lwb/b5;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Lfg/q;

.field public final synthetic o:Lc9/r0;


# direct methods
.method public synthetic constructor <init>(FFLjava/lang/String;Li0/a1;Li0/a1;Li0/a1;Lfg/a;Lfg/q;Lc9/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/b5;->g:F

    .line 5
    .line 6
    iput p2, p0, Lwb/b5;->h:F

    .line 7
    .line 8
    iput-object p3, p0, Lwb/b5;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/b5;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/b5;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/b5;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/b5;->m:Lfg/a;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/b5;->n:Lfg/q;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/b5;->o:Lc9/r0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    check-cast v10, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v5

    .line 26
    invoke-virtual {v10, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_b

    .line 31
    .line 32
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 33
    .line 34
    const/high16 v2, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const/4 v6, 0x0

    .line 41
    iget v7, v0, Lwb/b5;->g:F

    .line 42
    .line 43
    invoke-static {v3, v6, v7, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sget-object v7, Lp/j;->c:Lp/e;

    .line 48
    .line 49
    sget-object v8, Ly0/b;->s:Ly0/e;

    .line 50
    .line 51
    invoke-static {v7, v8, v10, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    iget-wide v11, v10, Li0/h0;->T:J

    .line 56
    .line 57
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-static {v10, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v13, Lx1/g;->f:Lx1/f;

    .line 70
    .line 71
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v13, Lx1/f;->b:Lx1/y;

    .line 75
    .line 76
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 77
    .line 78
    .line 79
    iget-boolean v14, v10, Li0/h0;->S:Z

    .line 80
    .line 81
    if-eqz v14, :cond_1

    .line 82
    .line 83
    invoke-virtual {v10, v13}, Li0/h0;->k(Lfg/a;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object v14, Lx1/f;->e:Lx1/e;

    .line 91
    .line 92
    invoke-static {v14, v10, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v9, Lx1/f;->d:Lx1/e;

    .line 96
    .line 97
    invoke-static {v9, v10, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    sget-object v12, Lx1/f;->f:Lx1/e;

    .line 105
    .line 106
    invoke-static {v12, v10, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v11, Lx1/f;->g:Lx1/d;

    .line 110
    .line 111
    invoke-static {v11, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 112
    .line 113
    .line 114
    sget-object v15, Lx1/f;->c:Lx1/e;

    .line 115
    .line 116
    invoke-static {v15, v10, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget v2, v0, Lwb/b5;->h:F

    .line 124
    .line 125
    invoke-static {v3, v6, v2, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v10}, Lk/n;->q(Li0/h0;)Lk/w1;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {v2, v3, v5, v5}, Lk/n;->r(Ly0/o;Lk/w1;ZZ)Ly0/o;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    sget-object v3, Ly0/b;->g:Ly0/g;

    .line 138
    .line 139
    invoke-static {v3, v4}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    iget-wide v5, v10, Li0/h0;->T:J

    .line 144
    .line 145
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-static {v10, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 158
    .line 159
    .line 160
    iget-boolean v4, v10, Li0/h0;->S:Z

    .line 161
    .line 162
    if-eqz v4, :cond_2

    .line 163
    .line 164
    invoke-virtual {v10, v13}, Li0/h0;->k(Lfg/a;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 169
    .line 170
    .line 171
    :goto_2
    invoke-static {v14, v10, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v9, v10, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v5, v10, v12, v10, v11}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v15, v10, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const/high16 v2, 0x3f800000    # 1.0f

    .line 184
    .line 185
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const/4 v2, 0x0

    .line 190
    invoke-static {v7, v8, v10, v2}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    iget-wide v5, v10, Li0/h0;->T:J

    .line 195
    .line 196
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-static {v10, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 209
    .line 210
    .line 211
    iget-boolean v7, v10, Li0/h0;->S:Z

    .line 212
    .line 213
    if-eqz v7, :cond_3

    .line 214
    .line 215
    invoke-virtual {v10, v13}, Li0/h0;->k(Lfg/a;)V

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_3
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 220
    .line 221
    .line 222
    :goto_3
    invoke-static {v14, v10, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v9, v10, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v5, v10, v12, v10, v11}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v15, v10, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iget-object v3, v0, Lwb/b5;->i:Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    const/16 v5, 0xc

    .line 241
    .line 242
    if-nez v4, :cond_4

    .line 243
    .line 244
    const v4, -0x3c7d9643

    .line 245
    .line 246
    .line 247
    invoke-virtual {v10, v4}, Li0/h0;->a0(I)V

    .line 248
    .line 249
    .line 250
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 251
    .line 252
    invoke-virtual {v10, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    check-cast v4, Lbi/b;

    .line 257
    .line 258
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 259
    .line 260
    .line 261
    move-result-wide v6

    .line 262
    move-wide/from16 v42, v6

    .line 263
    .line 264
    move-object v7, v3

    .line 265
    move-wide/from16 v3, v42

    .line 266
    .line 267
    move v8, v5

    .line 268
    invoke-static {v8}, Lx6/d;->D(I)J

    .line 269
    .line 270
    .line 271
    move-result-wide v5

    .line 272
    const/high16 v2, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 275
    .line 276
    .line 277
    move-result-object v17

    .line 278
    const/16 v2, 0xa

    .line 279
    .line 280
    int-to-float v2, v2

    .line 281
    const/16 v22, 0x7

    .line 282
    .line 283
    const/16 v18, 0x0

    .line 284
    .line 285
    const/16 v19, 0x0

    .line 286
    .line 287
    const/16 v20, 0x0

    .line 288
    .line 289
    move/from16 v21, v2

    .line 290
    .line 291
    invoke-static/range {v17 .. v22}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    const/16 v22, 0x0

    .line 296
    .line 297
    const v23, 0x3ffe8

    .line 298
    .line 299
    .line 300
    move-object/from16 v17, v1

    .line 301
    .line 302
    move-object v1, v7

    .line 303
    const/4 v7, 0x0

    .line 304
    move/from16 v18, v8

    .line 305
    .line 306
    const/4 v8, 0x0

    .line 307
    move-object/from16 v19, v9

    .line 308
    .line 309
    move-object/from16 v20, v10

    .line 310
    .line 311
    const-wide/16 v9, 0x0

    .line 312
    .line 313
    move-object/from16 v21, v11

    .line 314
    .line 315
    const/4 v11, 0x0

    .line 316
    move-object/from16 v25, v12

    .line 317
    .line 318
    move-object/from16 v24, v13

    .line 319
    .line 320
    const-wide/16 v12, 0x0

    .line 321
    .line 322
    move-object/from16 v26, v14

    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    move-object/from16 v27, v15

    .line 326
    .line 327
    const/4 v15, 0x0

    .line 328
    const/16 v28, 0x0

    .line 329
    .line 330
    const/16 v16, 0x0

    .line 331
    .line 332
    move-object/from16 v29, v17

    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    move/from16 v30, v18

    .line 337
    .line 338
    const/16 v18, 0x0

    .line 339
    .line 340
    move-object/from16 v31, v19

    .line 341
    .line 342
    const/16 v19, 0x0

    .line 343
    .line 344
    move-object/from16 v32, v21

    .line 345
    .line 346
    const/16 v21, 0x6030

    .line 347
    .line 348
    move-object/from16 v33, v24

    .line 349
    .line 350
    move-object/from16 v36, v25

    .line 351
    .line 352
    move-object/from16 v34, v26

    .line 353
    .line 354
    move-object/from16 v38, v27

    .line 355
    .line 356
    move/from16 v0, v28

    .line 357
    .line 358
    move-object/from16 v40, v29

    .line 359
    .line 360
    move-object/from16 v35, v31

    .line 361
    .line 362
    move-object/from16 v37, v32

    .line 363
    .line 364
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 365
    .line 366
    .line 367
    move-object/from16 v10, v20

    .line 368
    .line 369
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 370
    .line 371
    .line 372
    goto :goto_4

    .line 373
    :cond_4
    move-object/from16 v40, v1

    .line 374
    .line 375
    move v0, v2

    .line 376
    move-object/from16 v35, v9

    .line 377
    .line 378
    move-object/from16 v37, v11

    .line 379
    .line 380
    move-object/from16 v36, v12

    .line 381
    .line 382
    move-object/from16 v33, v13

    .line 383
    .line 384
    move-object/from16 v34, v14

    .line 385
    .line 386
    move-object/from16 v38, v15

    .line 387
    .line 388
    const v1, -0x3c7843b7

    .line 389
    .line 390
    .line 391
    invoke-virtual {v10, v1}, Li0/h0;->a0(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 395
    .line 396
    .line 397
    :goto_4
    sget-object v1, Lwb/y2;->j:Lwb/y2;

    .line 398
    .line 399
    move-object/from16 v0, p0

    .line 400
    .line 401
    iget-object v13, v0, Lwb/b5;->j:Li0/a1;

    .line 402
    .line 403
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    check-cast v2, Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    sget-object v14, Li0/l;->a:Li0/e;

    .line 414
    .line 415
    if-ne v3, v14, :cond_5

    .line 416
    .line 417
    new-instance v3, Lb0/l;

    .line 418
    .line 419
    const/16 v4, 0x14

    .line 420
    .line 421
    invoke-direct {v3, v13, v4}, Lb0/l;-><init>(Li0/a1;I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v10, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :cond_5
    check-cast v3, Lfg/l;

    .line 428
    .line 429
    const/16 v4, 0x6d86

    .line 430
    .line 431
    invoke-virtual {v1, v2, v3, v10, v4}, Lwb/y2;->m(Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 432
    .line 433
    .line 434
    iget-object v15, v0, Lwb/b5;->k:Li0/a1;

    .line 435
    .line 436
    invoke-interface {v15}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    move-object v4, v2

    .line 441
    check-cast v4, Ljava/lang/String;

    .line 442
    .line 443
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    if-ne v2, v14, :cond_6

    .line 448
    .line 449
    new-instance v2, Lb0/l;

    .line 450
    .line 451
    const/16 v3, 0x15

    .line 452
    .line 453
    invoke-direct {v2, v15, v3}, Lb0/l;-><init>(Li0/a1;I)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :cond_6
    move-object v5, v2

    .line 460
    check-cast v5, Lfg/l;

    .line 461
    .line 462
    const/16 v7, 0x6c36

    .line 463
    .line 464
    const-string v2, "\u5934\u8854\u989c\u8272"

    .line 465
    .line 466
    const-string v3, "\u652f\u6301\u5355\u8272\u548c\u6e10\u53d8"

    .line 467
    .line 468
    move-object v6, v10

    .line 469
    invoke-virtual/range {v1 .. v7}, Lwb/y2;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 470
    .line 471
    .line 472
    iget-object v8, v0, Lwb/b5;->l:Li0/a1;

    .line 473
    .line 474
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    move-object v4, v2

    .line 479
    check-cast v4, Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    if-ne v2, v14, :cond_7

    .line 486
    .line 487
    new-instance v2, Lb0/l;

    .line 488
    .line 489
    const/16 v3, 0x16

    .line 490
    .line 491
    invoke-direct {v2, v8, v3}, Lb0/l;-><init>(Li0/a1;I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    :cond_7
    move-object v5, v2

    .line 498
    check-cast v5, Lfg/l;

    .line 499
    .line 500
    const/16 v7, 0x6c36

    .line 501
    .line 502
    const-string v2, "\u6587\u5b57\u989c\u8272"

    .line 503
    .line 504
    const-string v3, "\u9ed8\u8ba4\u767d\u8272\uff0c\u652f\u6301\u6e10\u53d8"

    .line 505
    .line 506
    move-object v6, v10

    .line 507
    invoke-virtual/range {v1 .. v7}, Lwb/y2;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 508
    .line 509
    .line 510
    const/4 v1, 0x1

    .line 511
    invoke-virtual {v10, v1}, Li0/h0;->p(Z)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v10, v1}, Li0/h0;->p(Z)V

    .line 515
    .line 516
    .line 517
    move-object/from16 v3, v40

    .line 518
    .line 519
    const/high16 v2, 0x3f800000    # 1.0f

    .line 520
    .line 521
    invoke-static {v3, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 522
    .line 523
    .line 524
    move-result-object v16

    .line 525
    const/16 v2, 0xc

    .line 526
    .line 527
    int-to-float v2, v2

    .line 528
    const/16 v20, 0x0

    .line 529
    .line 530
    const/16 v21, 0xd

    .line 531
    .line 532
    const/16 v17, 0x0

    .line 533
    .line 534
    const/16 v19, 0x0

    .line 535
    .line 536
    move/from16 v18, v2

    .line 537
    .line 538
    invoke-static/range {v16 .. v21}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    const/16 v4, 0x8

    .line 543
    .line 544
    int-to-float v4, v4

    .line 545
    invoke-static {v4}, Lp/j;->g(F)Lp/h;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    sget-object v5, Ly0/b;->p:Ly0/f;

    .line 550
    .line 551
    const/4 v6, 0x6

    .line 552
    invoke-static {v4, v5, v10, v6}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    iget-wide v5, v10, Li0/h0;->T:J

    .line 557
    .line 558
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 563
    .line 564
    .line 565
    move-result-object v6

    .line 566
    invoke-static {v10, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 571
    .line 572
    .line 573
    iget-boolean v7, v10, Li0/h0;->S:Z

    .line 574
    .line 575
    if-eqz v7, :cond_8

    .line 576
    .line 577
    move-object/from16 v7, v33

    .line 578
    .line 579
    invoke-virtual {v10, v7}, Li0/h0;->k(Lfg/a;)V

    .line 580
    .line 581
    .line 582
    :goto_5
    move-object/from16 v7, v34

    .line 583
    .line 584
    goto :goto_6

    .line 585
    :cond_8
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 586
    .line 587
    .line 588
    goto :goto_5

    .line 589
    :goto_6
    invoke-static {v7, v10, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    move-object/from16 v4, v35

    .line 593
    .line 594
    invoke-static {v4, v10, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    move-object/from16 v4, v36

    .line 598
    .line 599
    move-object/from16 v6, v37

    .line 600
    .line 601
    invoke-static {v5, v10, v4, v10, v6}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v4, v38

    .line 605
    .line 606
    invoke-static {v4, v10, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    sget-object v2, Lp/f1;->a:Lp/f1;

    .line 610
    .line 611
    move-object v4, v3

    .line 612
    invoke-virtual {v2, v4, v1}, Lp/f1;->a(Ly0/o;Z)Ly0/o;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    const/4 v11, 0x6

    .line 617
    const/16 v12, 0x7f8

    .line 618
    .line 619
    move/from16 v39, v1

    .line 620
    .line 621
    const-string v1, "\u91cd\u7f6e"

    .line 622
    .line 623
    move-object v5, v2

    .line 624
    iget-object v2, v0, Lwb/b5;->m:Lfg/a;

    .line 625
    .line 626
    move-object/from16 v29, v4

    .line 627
    .line 628
    const/4 v4, 0x0

    .line 629
    move-object v6, v5

    .line 630
    const/4 v5, 0x0

    .line 631
    move-object v7, v6

    .line 632
    const/4 v6, 0x0

    .line 633
    move-object v9, v7

    .line 634
    const/4 v7, 0x0

    .line 635
    move-object/from16 v16, v8

    .line 636
    .line 637
    const/4 v8, 0x0

    .line 638
    move-object/from16 v17, v9

    .line 639
    .line 640
    const/4 v9, 0x0

    .line 641
    move-object/from16 v18, v15

    .line 642
    .line 643
    move-object/from16 v41, v17

    .line 644
    .line 645
    move-object/from16 v15, v29

    .line 646
    .line 647
    move-object/from16 v17, v13

    .line 648
    .line 649
    move/from16 v13, v39

    .line 650
    .line 651
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 652
    .line 653
    .line 654
    iget-object v3, v0, Lwb/b5;->n:Lfg/q;

    .line 655
    .line 656
    invoke-virtual {v10, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v1

    .line 660
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    if-nez v1, :cond_9

    .line 665
    .line 666
    if-ne v2, v14, :cond_a

    .line 667
    .line 668
    :cond_9
    new-instance v2, Lc9/n0;

    .line 669
    .line 670
    const/16 v7, 0xa

    .line 671
    .line 672
    move-object/from16 v6, v16

    .line 673
    .line 674
    move-object/from16 v4, v17

    .line 675
    .line 676
    move-object/from16 v5, v18

    .line 677
    .line 678
    invoke-direct/range {v2 .. v7}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    :cond_a
    check-cast v2, Lfg/a;

    .line 685
    .line 686
    move-object/from16 v14, v41

    .line 687
    .line 688
    invoke-virtual {v14, v15, v13}, Lp/f1;->a(Ly0/o;Z)Ly0/o;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    const/4 v11, 0x6

    .line 693
    const/16 v12, 0x7f8

    .line 694
    .line 695
    const-string v1, "\u4fdd\u5b58"

    .line 696
    .line 697
    const/4 v4, 0x0

    .line 698
    const/4 v5, 0x0

    .line 699
    const/4 v6, 0x0

    .line 700
    const/4 v7, 0x0

    .line 701
    const/4 v8, 0x0

    .line 702
    const/4 v9, 0x0

    .line 703
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v14, v15, v13}, Lp/f1;->a(Ly0/o;Z)Ly0/o;

    .line 707
    .line 708
    .line 709
    move-result-object v3

    .line 710
    const-string v1, "\u53d6\u6d88"

    .line 711
    .line 712
    iget-object v2, v0, Lwb/b5;->o:Lc9/r0;

    .line 713
    .line 714
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v10, v13}, Li0/h0;->p(Z)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v10, v13}, Li0/h0;->p(Z)V

    .line 721
    .line 722
    .line 723
    goto :goto_7

    .line 724
    :cond_b
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 725
    .line 726
    .line 727
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 728
    .line 729
    return-object v1
.end method
