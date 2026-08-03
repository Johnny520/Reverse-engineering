.class public final synthetic Lwb/sj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Lwb/f6;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(FFLjava/lang/String;Li0/a1;Lwb/f6;Landroid/content/Context;Lfg/a;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/sj;->g:F

    .line 5
    .line 6
    iput p2, p0, Lwb/sj;->h:F

    .line 7
    .line 8
    iput-object p3, p0, Lwb/sj;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/sj;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/sj;->k:Lwb/f6;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/sj;->l:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/sj;->m:Lfg/a;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/sj;->n:Li0/a1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 51

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
    if-eqz v1, :cond_a

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
    iget v7, v0, Lwb/sj;->g:F

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
    move-result-object v7

    .line 55
    iget-wide v8, v10, Li0/h0;->T:J

    .line 56
    .line 57
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-static {v10, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 75
    .line 76
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 77
    .line 78
    .line 79
    iget-boolean v12, v10, Li0/h0;->S:Z

    .line 80
    .line 81
    if-eqz v12, :cond_1

    .line 82
    .line 83
    invoke-virtual {v10, v11}, Li0/h0;->k(Lfg/a;)V

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
    sget-object v12, Lx1/f;->e:Lx1/e;

    .line 91
    .line 92
    invoke-static {v12, v10, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v7, Lx1/f;->d:Lx1/e;

    .line 96
    .line 97
    invoke-static {v7, v10, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    sget-object v9, Lx1/f;->f:Lx1/e;

    .line 105
    .line 106
    invoke-static {v9, v10, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v8, Lx1/f;->g:Lx1/d;

    .line 110
    .line 111
    invoke-static {v8, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 112
    .line 113
    .line 114
    sget-object v13, Lx1/f;->c:Lx1/e;

    .line 115
    .line 116
    invoke-static {v13, v10, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget v14, v0, Lwb/sj;->h:F

    .line 124
    .line 125
    invoke-static {v3, v6, v14, v5}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v10}, Lk/n;->q(Li0/h0;)Lk/w1;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-static {v3, v6, v5, v5}, Lk/n;->r(Ly0/o;Lk/w1;ZZ)Ly0/o;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const/16 v6, 0xa

    .line 138
    .line 139
    int-to-float v6, v6

    .line 140
    invoke-static {v6}, Lv/e;->a(F)Lv/d;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    invoke-static {v3, v14}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    sget-object v14, Lbi/d;->a:Li0/m2;

    .line 149
    .line 150
    invoke-virtual {v10, v14}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    check-cast v15, Lbi/b;

    .line 155
    .line 156
    move/from16 v16, v6

    .line 157
    .line 158
    invoke-virtual {v15}, Lbi/b;->n()J

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    sget-object v15, Lf1/c0;->b:Lf1/m0;

    .line 163
    .line 164
    invoke-static {v3, v5, v6, v15}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    const/16 v5, 0xe

    .line 169
    .line 170
    int-to-float v5, v5

    .line 171
    const/16 v6, 0xc

    .line 172
    .line 173
    int-to-float v2, v6

    .line 174
    invoke-static {v3, v5, v2}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    sget-object v6, Ly0/b;->g:Ly0/g;

    .line 179
    .line 180
    invoke-static {v6, v4}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    move-object v6, v1

    .line 185
    move/from16 v19, v2

    .line 186
    .line 187
    iget-wide v1, v10, Li0/h0;->T:J

    .line 188
    .line 189
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-static {v10, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 202
    .line 203
    .line 204
    move/from16 v18, v5

    .line 205
    .line 206
    iget-boolean v5, v10, Li0/h0;->S:Z

    .line 207
    .line 208
    if-eqz v5, :cond_2

    .line 209
    .line 210
    invoke-virtual {v10, v11}, Li0/h0;->k(Lfg/a;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_2
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 215
    .line 216
    .line 217
    :goto_2
    invoke-static {v12, v10, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v7, v10, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v10, v9, v10, v8}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v13, v10, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v10, v14}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    check-cast v1, Lbi/b;

    .line 234
    .line 235
    invoke-virtual {v1}, Lbi/b;->g()J

    .line 236
    .line 237
    .line 238
    move-result-wide v3

    .line 239
    const/16 v1, 0xd

    .line 240
    .line 241
    invoke-static {v1}, Lx6/d;->D(I)J

    .line 242
    .line 243
    .line 244
    move-result-wide v1

    .line 245
    const/16 v5, 0x14

    .line 246
    .line 247
    invoke-static {v5}, Lx6/d;->D(I)J

    .line 248
    .line 249
    .line 250
    move-result-wide v20

    .line 251
    const/16 v22, 0x30

    .line 252
    .line 253
    const v23, 0x3f7ea

    .line 254
    .line 255
    .line 256
    move-wide/from16 v49, v1

    .line 257
    .line 258
    move-object v2, v6

    .line 259
    move-wide/from16 v5, v49

    .line 260
    .line 261
    iget-object v1, v0, Lwb/sj;->i:Ljava/lang/String;

    .line 262
    .line 263
    move-object/from16 v24, v2

    .line 264
    .line 265
    const/4 v2, 0x0

    .line 266
    move-object/from16 v25, v7

    .line 267
    .line 268
    const/4 v7, 0x0

    .line 269
    move-object/from16 v26, v8

    .line 270
    .line 271
    const/4 v8, 0x0

    .line 272
    move-object/from16 v27, v12

    .line 273
    .line 274
    move-object/from16 v28, v13

    .line 275
    .line 276
    move-wide/from16 v12, v20

    .line 277
    .line 278
    move-object/from16 v21, v9

    .line 279
    .line 280
    move-object/from16 v20, v10

    .line 281
    .line 282
    const-wide/16 v9, 0x0

    .line 283
    .line 284
    move-object/from16 v29, v11

    .line 285
    .line 286
    const/4 v11, 0x0

    .line 287
    move-object/from16 v30, v14

    .line 288
    .line 289
    const/4 v14, 0x0

    .line 290
    move-object/from16 v31, v15

    .line 291
    .line 292
    const/4 v15, 0x0

    .line 293
    move/from16 v32, v16

    .line 294
    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    const/16 v33, 0xc

    .line 298
    .line 299
    const/16 v17, 0x0

    .line 300
    .line 301
    move/from16 v34, v18

    .line 302
    .line 303
    const/16 v18, 0x0

    .line 304
    .line 305
    move/from16 v35, v19

    .line 306
    .line 307
    const/16 v19, 0x0

    .line 308
    .line 309
    move-object/from16 v36, v21

    .line 310
    .line 311
    const/16 v21, 0x6006

    .line 312
    .line 313
    move-object/from16 v39, v25

    .line 314
    .line 315
    move-object/from16 v41, v26

    .line 316
    .line 317
    move-object/from16 v38, v27

    .line 318
    .line 319
    move-object/from16 v42, v28

    .line 320
    .line 321
    move-object/from16 v37, v29

    .line 322
    .line 323
    move-object/from16 v45, v31

    .line 324
    .line 325
    move/from16 v43, v35

    .line 326
    .line 327
    move-object/from16 v40, v36

    .line 328
    .line 329
    const/4 v0, 0x1

    .line 330
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 331
    .line 332
    .line 333
    move-object/from16 v10, v20

    .line 334
    .line 335
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 336
    .line 337
    .line 338
    move-object/from16 v1, v30

    .line 339
    .line 340
    invoke-virtual {v10, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    check-cast v2, Lbi/b;

    .line 345
    .line 346
    invoke-virtual {v2}, Lbi/b;->h()J

    .line 347
    .line 348
    .line 349
    move-result-wide v3

    .line 350
    invoke-static/range {v33 .. v33}, Lx6/d;->D(I)J

    .line 351
    .line 352
    .line 353
    move-result-wide v5

    .line 354
    const/4 v15, 0x0

    .line 355
    const/16 v16, 0xd

    .line 356
    .line 357
    const/4 v12, 0x0

    .line 358
    const/4 v14, 0x0

    .line 359
    move-object/from16 v11, v24

    .line 360
    .line 361
    move/from16 v13, v34

    .line 362
    .line 363
    invoke-static/range {v11 .. v16}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    const/16 v22, 0x0

    .line 368
    .line 369
    const v23, 0x3ffe8

    .line 370
    .line 371
    .line 372
    const-string v1, "\u8bf7\u8f93\u5165\u201c\u6211\u540c\u610f\u201d\u786e\u8ba4"

    .line 373
    .line 374
    const-wide/16 v9, 0x0

    .line 375
    .line 376
    const/4 v11, 0x0

    .line 377
    const-wide/16 v12, 0x0

    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    const/4 v15, 0x0

    .line 381
    const/16 v16, 0x0

    .line 382
    .line 383
    const/16 v21, 0x6030

    .line 384
    .line 385
    move-object/from16 v46, v24

    .line 386
    .line 387
    move-object/from16 v0, v30

    .line 388
    .line 389
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 390
    .line 391
    .line 392
    move-object/from16 v1, p0

    .line 393
    .line 394
    move-object/from16 v10, v20

    .line 395
    .line 396
    iget-object v2, v1, Lwb/sj;->j:Li0/a1;

    .line 397
    .line 398
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    check-cast v3, Ljava/lang/String;

    .line 403
    .line 404
    new-instance v5, Li2/n0;

    .line 405
    .line 406
    invoke-virtual {v10, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    check-cast v4, Lbi/b;

    .line 411
    .line 412
    invoke-virtual {v4}, Lbi/b;->g()J

    .line 413
    .line 414
    .line 415
    move-result-wide v12

    .line 416
    const/16 v4, 0xf

    .line 417
    .line 418
    invoke-static {v4}, Lx6/d;->D(I)J

    .line 419
    .line 420
    .line 421
    move-result-wide v14

    .line 422
    const-wide/16 v20, 0x0

    .line 423
    .line 424
    const v22, 0xfffffc

    .line 425
    .line 426
    .line 427
    const/16 v16, 0x0

    .line 428
    .line 429
    const-wide/16 v17, 0x0

    .line 430
    .line 431
    const/16 v19, 0x0

    .line 432
    .line 433
    move-object v11, v5

    .line 434
    invoke-direct/range {v11 .. v22}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 435
    .line 436
    .line 437
    move-object/from16 v6, v46

    .line 438
    .line 439
    const/high16 v4, 0x3f800000    # 1.0f

    .line 440
    .line 441
    invoke-static {v6, v4}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 442
    .line 443
    .line 444
    move-result-object v11

    .line 445
    const/16 v7, 0x8

    .line 446
    .line 447
    int-to-float v13, v7

    .line 448
    const/4 v15, 0x0

    .line 449
    const/16 v16, 0xd

    .line 450
    .line 451
    const/4 v12, 0x0

    .line 452
    const/4 v14, 0x0

    .line 453
    invoke-static/range {v11 .. v16}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    invoke-static/range {v32 .. v32}, Lv/e;->a(F)Lv/d;

    .line 458
    .line 459
    .line 460
    move-result-object v8

    .line 461
    invoke-static {v7, v8}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    invoke-virtual {v10, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    check-cast v0, Lbi/b;

    .line 470
    .line 471
    invoke-virtual {v0}, Lbi/b;->k()J

    .line 472
    .line 473
    .line 474
    move-result-wide v8

    .line 475
    move-object/from16 v0, v45

    .line 476
    .line 477
    invoke-static {v7, v8, v9, v0}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    const/16 v7, 0xb

    .line 482
    .line 483
    int-to-float v7, v7

    .line 484
    move/from16 v8, v43

    .line 485
    .line 486
    invoke-static {v0, v8, v7}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    sget-object v9, Li0/l;->a:Li0/e;

    .line 495
    .line 496
    if-ne v7, v9, :cond_3

    .line 497
    .line 498
    new-instance v7, Lwb/gj;

    .line 499
    .line 500
    const/16 v11, 0xa

    .line 501
    .line 502
    invoke-direct {v7, v2, v11}, Lwb/gj;-><init>(Li0/a1;I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v10, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    :cond_3
    check-cast v7, Lfg/l;

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const v18, 0xfed8

    .line 513
    .line 514
    .line 515
    move/from16 v44, v4

    .line 516
    .line 517
    const/4 v4, 0x0

    .line 518
    move-object/from16 v24, v6

    .line 519
    .line 520
    const/4 v6, 0x0

    .line 521
    move-object v11, v2

    .line 522
    move-object v2, v7

    .line 523
    const/4 v7, 0x0

    .line 524
    move/from16 v19, v8

    .line 525
    .line 526
    const/4 v8, 0x1

    .line 527
    move-object v12, v9

    .line 528
    const/4 v9, 0x0

    .line 529
    move-object/from16 v20, v10

    .line 530
    .line 531
    const/4 v10, 0x0

    .line 532
    move-object v13, v11

    .line 533
    const/4 v11, 0x0

    .line 534
    move-object v14, v12

    .line 535
    const/4 v12, 0x0

    .line 536
    move-object v15, v13

    .line 537
    const/4 v13, 0x0

    .line 538
    move-object/from16 v16, v14

    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    move-object/from16 v21, v16

    .line 542
    .line 543
    const v16, 0x6000030

    .line 544
    .line 545
    .line 546
    move-object v1, v3

    .line 547
    move-object/from16 v23, v15

    .line 548
    .line 549
    move-object/from16 v15, v20

    .line 550
    .line 551
    move-object/from16 v48, v21

    .line 552
    .line 553
    move-object/from16 v47, v24

    .line 554
    .line 555
    move-object v3, v0

    .line 556
    move/from16 v0, v44

    .line 557
    .line 558
    invoke-static/range {v1 .. v18}, Lw/i;->a(Ljava/lang/String;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V

    .line 559
    .line 560
    .line 561
    move-object v10, v15

    .line 562
    move-object/from16 v6, v47

    .line 563
    .line 564
    invoke-static {v6, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 565
    .line 566
    .line 567
    move-result-object v17

    .line 568
    const/16 v21, 0x0

    .line 569
    .line 570
    const/16 v22, 0xd

    .line 571
    .line 572
    const/16 v18, 0x0

    .line 573
    .line 574
    const/16 v20, 0x0

    .line 575
    .line 576
    invoke-static/range {v17 .. v22}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    invoke-static/range {v32 .. v32}, Lp/j;->g(F)Lp/h;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    sget-object v3, Ly0/b;->p:Ly0/f;

    .line 585
    .line 586
    const/4 v4, 0x6

    .line 587
    invoke-static {v2, v3, v10, v4}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    iget-wide v3, v10, Li0/h0;->T:J

    .line 592
    .line 593
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    invoke-static {v10, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 606
    .line 607
    .line 608
    iget-boolean v5, v10, Li0/h0;->S:Z

    .line 609
    .line 610
    if-eqz v5, :cond_4

    .line 611
    .line 612
    move-object/from16 v5, v37

    .line 613
    .line 614
    invoke-virtual {v10, v5}, Li0/h0;->k(Lfg/a;)V

    .line 615
    .line 616
    .line 617
    :goto_3
    move-object/from16 v5, v38

    .line 618
    .line 619
    goto :goto_4

    .line 620
    :cond_4
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 621
    .line 622
    .line 623
    goto :goto_3

    .line 624
    :goto_4
    invoke-static {v5, v10, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    move-object/from16 v2, v39

    .line 628
    .line 629
    invoke-static {v2, v10, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    move-object/from16 v2, v40

    .line 633
    .line 634
    move-object/from16 v4, v41

    .line 635
    .line 636
    invoke-static {v3, v10, v2, v10, v4}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 637
    .line 638
    .line 639
    move-object/from16 v2, v42

    .line 640
    .line 641
    invoke-static {v2, v10, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    float-to-double v1, v0

    .line 645
    const-wide/16 v13, 0x0

    .line 646
    .line 647
    cmpl-double v1, v1, v13

    .line 648
    .line 649
    const-string v15, "invalid weight; must be greater than zero"

    .line 650
    .line 651
    if-lez v1, :cond_5

    .line 652
    .line 653
    goto :goto_5

    .line 654
    :cond_5
    invoke-static {v15}, Lq/a;->a(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    :goto_5
    new-instance v3, Lp/q0;

    .line 658
    .line 659
    const/4 v1, 0x1

    .line 660
    invoke-direct {v3, v0, v1}, Lp/q0;-><init>(FZ)V

    .line 661
    .line 662
    .line 663
    invoke-static {v10}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 664
    .line 665
    .line 666
    move-result-object v8

    .line 667
    const/4 v11, 0x6

    .line 668
    const/16 v12, 0x778

    .line 669
    .line 670
    const-string v1, "\u53d6\u6d88"

    .line 671
    .line 672
    move-object/from16 v2, p0

    .line 673
    .line 674
    iget-object v4, v2, Lwb/sj;->k:Lwb/f6;

    .line 675
    .line 676
    move-object v2, v4

    .line 677
    const/4 v4, 0x0

    .line 678
    const/4 v5, 0x0

    .line 679
    const/4 v6, 0x0

    .line 680
    const/4 v7, 0x0

    .line 681
    const/4 v9, 0x0

    .line 682
    move-wide/from16 v16, v13

    .line 683
    .line 684
    move-object/from16 v13, p0

    .line 685
    .line 686
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 687
    .line 688
    .line 689
    iget-object v4, v13, Lwb/sj;->n:Li0/a1;

    .line 690
    .line 691
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    check-cast v1, Ljava/lang/Number;

    .line 696
    .line 697
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-lez v1, :cond_6

    .line 702
    .line 703
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    check-cast v1, Ljava/lang/Number;

    .line 708
    .line 709
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    const-string v2, "\u7ee7\u7eed\uff08"

    .line 714
    .line 715
    const-string v3, "s\uff09"

    .line 716
    .line 717
    invoke-static {v1, v2, v3}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    :goto_6
    move-object v7, v1

    .line 722
    goto :goto_7

    .line 723
    :cond_6
    const-string v1, "\u540c\u610f\u5e76\u7ee7\u7eed"

    .line 724
    .line 725
    goto :goto_6

    .line 726
    :goto_7
    iget-object v2, v13, Lwb/sj;->l:Landroid/content/Context;

    .line 727
    .line 728
    invoke-virtual {v10, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v1

    .line 732
    iget-object v3, v13, Lwb/sj;->m:Lfg/a;

    .line 733
    .line 734
    invoke-virtual {v10, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    move-result v5

    .line 738
    or-int/2addr v1, v5

    .line 739
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v5

    .line 743
    if-nez v1, :cond_7

    .line 744
    .line 745
    move-object/from16 v14, v48

    .line 746
    .line 747
    if-ne v5, v14, :cond_8

    .line 748
    .line 749
    :cond_7
    new-instance v1, Lc9/n0;

    .line 750
    .line 751
    const/16 v6, 0x12

    .line 752
    .line 753
    move-object/from16 v5, v23

    .line 754
    .line 755
    invoke-direct/range {v1 .. v6}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v10, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    move-object v5, v1

    .line 762
    :cond_8
    move-object v2, v5

    .line 763
    check-cast v2, Lfg/a;

    .line 764
    .line 765
    float-to-double v3, v0

    .line 766
    cmpl-double v1, v3, v16

    .line 767
    .line 768
    if-lez v1, :cond_9

    .line 769
    .line 770
    goto :goto_8

    .line 771
    :cond_9
    invoke-static {v15}, Lq/a;->a(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    :goto_8
    new-instance v3, Lp/q0;

    .line 775
    .line 776
    const/4 v14, 0x1

    .line 777
    invoke-direct {v3, v0, v14}, Lp/q0;-><init>(FZ)V

    .line 778
    .line 779
    .line 780
    invoke-static {v10}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 781
    .line 782
    .line 783
    move-result-object v8

    .line 784
    const/4 v11, 0x0

    .line 785
    const/16 v12, 0x778

    .line 786
    .line 787
    const/4 v4, 0x0

    .line 788
    const/4 v5, 0x0

    .line 789
    const/4 v6, 0x0

    .line 790
    move-object v1, v7

    .line 791
    const/4 v7, 0x0

    .line 792
    const/4 v9, 0x0

    .line 793
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v10, v14}, Li0/h0;->p(Z)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v10, v14}, Li0/h0;->p(Z)V

    .line 800
    .line 801
    .line 802
    goto :goto_9

    .line 803
    :cond_a
    move-object v13, v0

    .line 804
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 805
    .line 806
    .line 807
    :goto_9
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 808
    .line 809
    return-object v0
.end method
