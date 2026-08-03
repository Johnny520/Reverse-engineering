.class public final synthetic Lwb/zu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Integer;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Landroid/app/Activity;

.field public final synthetic l:Lfg/l;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Integer;Lfg/a;Landroid/app/Activity;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/zu;->g:I

    .line 5
    .line 6
    iput p2, p0, Lwb/zu;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lwb/zu;->i:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/zu;->j:Lfg/a;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/zu;->k:Landroid/app/Activity;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/zu;->l:Lfg/l;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    check-cast v6, Li0/h0;

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
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    if-eqz v1, :cond_15

    .line 33
    .line 34
    iget v1, v0, Lwb/zu;->g:I

    .line 35
    .line 36
    invoke-virtual {v6, v1}, Li0/h0;->d(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget v7, v0, Lwb/zu;->h:I

    .line 41
    .line 42
    invoke-virtual {v6, v7}, Li0/h0;->d(I)Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    or-int/2addr v3, v8

    .line 47
    iget-object v8, v0, Lwb/zu;->i:Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v6, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    or-int/2addr v3, v9

    .line 54
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    sget-object v10, Li0/l;->a:Li0/e;

    .line 59
    .line 60
    if-nez v3, :cond_1

    .line 61
    .line 62
    if-ne v9, v10, :cond_4

    .line 63
    .line 64
    :cond_1
    if-ge v1, v7, :cond_2

    .line 65
    .line 66
    move v1, v7

    .line 67
    :cond_2
    if-eqz v8, :cond_3

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-le v1, v3, :cond_3

    .line 74
    .line 75
    move v1, v3

    .line 76
    :cond_3
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-virtual {v6, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    check-cast v9, Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v6, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    if-ne v3, v10, :cond_6

    .line 96
    .line 97
    :cond_5
    new-instance v1, Ln2/s;

    .line 98
    .line 99
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-static {v4, v3}, Li2/e0;->b(II)J

    .line 104
    .line 105
    .line 106
    move-result-wide v11

    .line 107
    const/4 v3, 0x4

    .line 108
    invoke-direct {v1, v3, v9, v11, v12}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    move-object v1, v3

    .line 119
    check-cast v1, Li0/a1;

    .line 120
    .line 121
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    if-ne v3, v10, :cond_7

    .line 126
    .line 127
    const-string v3, ""

    .line 128
    .line 129
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_7
    check-cast v3, Li0/a1;

    .line 137
    .line 138
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    if-ne v9, v10, :cond_8

    .line 143
    .line 144
    new-instance v9, Ld1/v;

    .line 145
    .line 146
    invoke-direct {v9}, Ld1/v;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_8
    check-cast v9, Ld1/v;

    .line 153
    .line 154
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    if-ne v11, v10, :cond_9

    .line 159
    .line 160
    new-instance v11, Lwb/eo;

    .line 161
    .line 162
    const/4 v12, 0x1

    .line 163
    const/4 v13, 0x0

    .line 164
    invoke-direct {v11, v9, v13, v12}, Lwb/eo;-><init>(Ld1/v;Lwf/c;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    check-cast v11, Lfg/p;

    .line 171
    .line 172
    invoke-static {v11, v6, v2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sget-object v11, Ly0/l;->a:Ly0/l;

    .line 176
    .line 177
    const/high16 v12, 0x3f800000    # 1.0f

    .line 178
    .line 179
    invoke-static {v11, v12}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    sget-object v14, Lp/j;->c:Lp/e;

    .line 184
    .line 185
    sget-object v15, Ly0/b;->s:Ly0/e;

    .line 186
    .line 187
    invoke-static {v14, v15, v6, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 188
    .line 189
    .line 190
    move-result-object v14

    .line 191
    iget-wide v4, v6, Li0/h0;->T:J

    .line 192
    .line 193
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    invoke-virtual {v6}, Li0/h0;->l()Ls0/h;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-static {v6, v13}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    sget-object v15, Lx1/g;->f:Lx1/f;

    .line 206
    .line 207
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    sget-object v15, Lx1/f;->b:Lx1/y;

    .line 211
    .line 212
    invoke-virtual {v6}, Li0/h0;->d0()V

    .line 213
    .line 214
    .line 215
    iget-boolean v12, v6, Li0/h0;->S:Z

    .line 216
    .line 217
    if-eqz v12, :cond_a

    .line 218
    .line 219
    invoke-virtual {v6, v15}, Li0/h0;->k(Lfg/a;)V

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_a
    invoke-virtual {v6}, Li0/h0;->n0()V

    .line 224
    .line 225
    .line 226
    :goto_1
    sget-object v12, Lx1/f;->e:Lx1/e;

    .line 227
    .line 228
    invoke-static {v12, v6, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    sget-object v14, Lx1/f;->d:Lx1/e;

    .line 232
    .line 233
    invoke-static {v14, v6, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    sget-object v5, Lx1/f;->f:Lx1/e;

    .line 241
    .line 242
    invoke-static {v5, v6, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 246
    .line 247
    invoke-static {v4, v6}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v17, v4

    .line 251
    .line 252
    sget-object v4, Lx1/f;->c:Lx1/e;

    .line 253
    .line 254
    invoke-static {v4, v6, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    check-cast v13, Ln2/s;

    .line 262
    .line 263
    move-object/from16 v18, v2

    .line 264
    .line 265
    new-instance v2, Lw/p0;

    .line 266
    .line 267
    move-object/from16 v19, v4

    .line 268
    .line 269
    const/16 v4, 0x7b

    .line 270
    .line 271
    move/from16 v20, v7

    .line 272
    .line 273
    const/4 v7, 0x3

    .line 274
    invoke-direct {v2, v7, v4}, Lw/p0;-><init>(II)V

    .line 275
    .line 276
    .line 277
    new-instance v21, Li2/n0;

    .line 278
    .line 279
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 280
    .line 281
    invoke-virtual {v6, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v22

    .line 285
    check-cast v22, Lbi/b;

    .line 286
    .line 287
    invoke-virtual/range {v22 .. v22}, Lbi/b;->g()J

    .line 288
    .line 289
    .line 290
    move-result-wide v22

    .line 291
    const/16 v24, 0x10

    .line 292
    .line 293
    invoke-static/range {v24 .. v24}, Lx6/d;->D(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v24

    .line 297
    const-wide/16 v30, 0x0

    .line 298
    .line 299
    const v32, 0xff7ffc

    .line 300
    .line 301
    .line 302
    const/16 v26, 0x0

    .line 303
    .line 304
    const-wide/16 v27, 0x0

    .line 305
    .line 306
    const/16 v29, 0x3

    .line 307
    .line 308
    invoke-direct/range {v21 .. v32}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v22, v13

    .line 312
    .line 313
    new-instance v13, Lf1/t0;

    .line 314
    .line 315
    invoke-virtual {v6, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v23

    .line 319
    check-cast v23, Lbi/b;

    .line 320
    .line 321
    move-object/from16 v24, v8

    .line 322
    .line 323
    invoke-virtual/range {v23 .. v23}, Lbi/b;->j()J

    .line 324
    .line 325
    .line 326
    move-result-wide v7

    .line 327
    invoke-direct {v13, v7, v8}, Lf1/t0;-><init>(J)V

    .line 328
    .line 329
    .line 330
    const/high16 v7, 0x3f800000    # 1.0f

    .line 331
    .line 332
    invoke-static {v11, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    invoke-static {v8, v9}, Ld1/d;->j(Ly0/o;Ld1/v;)Ly0/o;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    const/16 v9, 0xc

    .line 341
    .line 342
    int-to-float v7, v9

    .line 343
    invoke-static {v7}, Lv/e;->a(F)Lv/d;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    invoke-static {v8, v9}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    invoke-virtual {v6, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    check-cast v9, Lbi/b;

    .line 356
    .line 357
    move-object/from16 v27, v4

    .line 358
    .line 359
    move-object/from16 v26, v5

    .line 360
    .line 361
    invoke-virtual {v9}, Lbi/b;->k()J

    .line 362
    .line 363
    .line 364
    move-result-wide v4

    .line 365
    sget-object v9, Lf1/c0;->b:Lf1/m0;

    .line 366
    .line 367
    invoke-static {v8, v4, v5, v9}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-static {v4, v7, v7}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-virtual {v6, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    if-nez v5, :cond_b

    .line 384
    .line 385
    if-ne v7, v10, :cond_c

    .line 386
    .line 387
    :cond_b
    new-instance v7, Lwb/op;

    .line 388
    .line 389
    const/4 v5, 0x2

    .line 390
    invoke-direct {v7, v5, v1, v3}, Lwb/op;-><init>(ILi0/a1;Li0/a1;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    :cond_c
    check-cast v7, Lfg/l;

    .line 397
    .line 398
    move-object/from16 v5, v17

    .line 399
    .line 400
    const/16 v17, 0x0

    .line 401
    .line 402
    move-object/from16 v8, v18

    .line 403
    .line 404
    const v18, 0xbe98

    .line 405
    .line 406
    .line 407
    move-object v9, v3

    .line 408
    move-object v3, v4

    .line 409
    const/4 v4, 0x0

    .line 410
    move-object/from16 v28, v15

    .line 411
    .line 412
    move-object v15, v6

    .line 413
    move-object v6, v2

    .line 414
    move-object v2, v7

    .line 415
    const/4 v7, 0x0

    .line 416
    move-object/from16 v29, v8

    .line 417
    .line 418
    const/4 v8, 0x1

    .line 419
    move-object/from16 v30, v9

    .line 420
    .line 421
    const/4 v9, 0x0

    .line 422
    move-object/from16 v31, v10

    .line 423
    .line 424
    const/4 v10, 0x0

    .line 425
    move-object/from16 v32, v11

    .line 426
    .line 427
    const/4 v11, 0x0

    .line 428
    move-object/from16 v33, v12

    .line 429
    .line 430
    const/4 v12, 0x0

    .line 431
    move-object/from16 v34, v14

    .line 432
    .line 433
    const/4 v14, 0x0

    .line 434
    const/high16 v35, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/high16 v16, 0x6180000

    .line 437
    .line 438
    move-object/from16 v36, v1

    .line 439
    .line 440
    move-object/from16 v40, v5

    .line 441
    .line 442
    move-object/from16 v41, v19

    .line 443
    .line 444
    move-object/from16 v5, v21

    .line 445
    .line 446
    move-object/from16 v1, v22

    .line 447
    .line 448
    move-object/from16 p1, v24

    .line 449
    .line 450
    move-object/from16 v39, v26

    .line 451
    .line 452
    move-object/from16 v42, v31

    .line 453
    .line 454
    move-object/from16 v43, v32

    .line 455
    .line 456
    move-object/from16 v37, v33

    .line 457
    .line 458
    move-object/from16 v38, v34

    .line 459
    .line 460
    const/4 v0, 0x0

    .line 461
    const/16 v23, 0xc

    .line 462
    .line 463
    move/from16 v24, v20

    .line 464
    .line 465
    invoke-static/range {v1 .. v18}, Lw/i;->b(Ln2/s;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V

    .line 466
    .line 467
    .line 468
    invoke-interface/range {v30 .. v30}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    check-cast v1, Ljava/lang/String;

    .line 473
    .line 474
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_e

    .line 479
    .line 480
    if-eqz p1, :cond_d

    .line 481
    .line 482
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Number;->intValue()I

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    const-string v2, "\u8bf7\u8f93\u5165 "

    .line 487
    .line 488
    const-string v3, "-"

    .line 489
    .line 490
    move/from16 v4, v24

    .line 491
    .line 492
    invoke-static {v4, v2, v3, v1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    goto :goto_2

    .line 497
    :cond_d
    move/from16 v4, v24

    .line 498
    .line 499
    const-string v1, "\u8bf7\u8f93\u5165\u4e0d\u5c0f\u4e8e "

    .line 500
    .line 501
    const-string v2, " \u7684\u6574\u6570"

    .line 502
    .line 503
    invoke-static {v4, v1, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    goto :goto_2

    .line 508
    :cond_e
    move/from16 v4, v24

    .line 509
    .line 510
    :goto_2
    invoke-interface/range {v30 .. v30}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    check-cast v2, Ljava/lang/String;

    .line 515
    .line 516
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_f

    .line 521
    .line 522
    const v2, 0x5abf9a99

    .line 523
    .line 524
    .line 525
    invoke-virtual {v15, v2}, Li0/h0;->a0(I)V

    .line 526
    .line 527
    .line 528
    move-object/from16 v2, v27

    .line 529
    .line 530
    invoke-virtual {v15, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    check-cast v2, Lbi/b;

    .line 535
    .line 536
    invoke-virtual {v2}, Lbi/b;->h()J

    .line 537
    .line 538
    .line 539
    move-result-wide v2

    .line 540
    invoke-virtual {v15, v0}, Li0/h0;->p(Z)V

    .line 541
    .line 542
    .line 543
    goto :goto_3

    .line 544
    :cond_f
    const v2, 0x5ac15896

    .line 545
    .line 546
    .line 547
    invoke-virtual {v15, v2}, Li0/h0;->a0(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v15, v0}, Li0/h0;->p(Z)V

    .line 551
    .line 552
    .line 553
    const-wide v2, 0xffd32f2fL

    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    invoke-static {v2, v3}, Lf1/c0;->d(J)J

    .line 559
    .line 560
    .line 561
    move-result-wide v2

    .line 562
    :goto_3
    invoke-static/range {v23 .. v23}, Lx6/d;->D(I)J

    .line 563
    .line 564
    .line 565
    move-result-wide v5

    .line 566
    move-object/from16 v7, v43

    .line 567
    .line 568
    const/high16 v0, 0x3f800000    # 1.0f

    .line 569
    .line 570
    invoke-static {v7, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 571
    .line 572
    .line 573
    move-result-object v8

    .line 574
    const/4 v14, 0x6

    .line 575
    int-to-float v10, v14

    .line 576
    const/4 v12, 0x0

    .line 577
    const/16 v13, 0xd

    .line 578
    .line 579
    const/4 v9, 0x0

    .line 580
    const/4 v11, 0x0

    .line 581
    invoke-static/range {v8 .. v13}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 582
    .line 583
    .line 584
    move-result-object v8

    .line 585
    move/from16 v24, v10

    .line 586
    .line 587
    new-instance v11, Lt2/k;

    .line 588
    .line 589
    const/4 v9, 0x3

    .line 590
    invoke-direct {v11, v9}, Lt2/k;-><init>(I)V

    .line 591
    .line 592
    .line 593
    const/16 v22, 0x0

    .line 594
    .line 595
    const v23, 0x3fbe8

    .line 596
    .line 597
    .line 598
    const/4 v7, 0x0

    .line 599
    move/from16 v20, v4

    .line 600
    .line 601
    move-wide v3, v2

    .line 602
    move-object v2, v8

    .line 603
    const/4 v8, 0x0

    .line 604
    const-wide/16 v9, 0x0

    .line 605
    .line 606
    const-wide/16 v12, 0x0

    .line 607
    .line 608
    move/from16 v16, v14

    .line 609
    .line 610
    const/4 v14, 0x0

    .line 611
    move/from16 v17, v20

    .line 612
    .line 613
    move-object/from16 v20, v15

    .line 614
    .line 615
    const/4 v15, 0x0

    .line 616
    move/from16 v18, v16

    .line 617
    .line 618
    const/16 v16, 0x0

    .line 619
    .line 620
    move/from16 v19, v17

    .line 621
    .line 622
    const/16 v17, 0x0

    .line 623
    .line 624
    move/from16 v21, v18

    .line 625
    .line 626
    const/16 v18, 0x0

    .line 627
    .line 628
    move/from16 v25, v19

    .line 629
    .line 630
    const/16 v19, 0x0

    .line 631
    .line 632
    move/from16 v26, v21

    .line 633
    .line 634
    const/16 v21, 0x6030

    .line 635
    .line 636
    move/from16 v44, v25

    .line 637
    .line 638
    move-object/from16 v45, v43

    .line 639
    .line 640
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 641
    .line 642
    .line 643
    move-object/from16 v15, v20

    .line 644
    .line 645
    move-object/from16 v7, v45

    .line 646
    .line 647
    invoke-static {v7, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 648
    .line 649
    .line 650
    move-result-object v16

    .line 651
    const/16 v1, 0xa

    .line 652
    .line 653
    int-to-float v1, v1

    .line 654
    const/16 v19, 0x0

    .line 655
    .line 656
    const/16 v21, 0x5

    .line 657
    .line 658
    const/16 v17, 0x0

    .line 659
    .line 660
    move/from16 v18, v1

    .line 661
    .line 662
    move/from16 v20, v24

    .line 663
    .line 664
    invoke-static/range {v16 .. v21}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    const/16 v2, 0x8

    .line 669
    .line 670
    int-to-float v2, v2

    .line 671
    invoke-static {v2}, Lp/j;->g(F)Lp/h;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    sget-object v3, Ly0/b;->p:Ly0/f;

    .line 676
    .line 677
    const/4 v4, 0x6

    .line 678
    invoke-static {v2, v3, v15, v4}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    iget-wide v3, v15, Li0/h0;->T:J

    .line 683
    .line 684
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    invoke-virtual {v15}, Li0/h0;->l()Ls0/h;

    .line 689
    .line 690
    .line 691
    move-result-object v4

    .line 692
    invoke-static {v15, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-virtual {v15}, Li0/h0;->d0()V

    .line 697
    .line 698
    .line 699
    iget-boolean v5, v15, Li0/h0;->S:Z

    .line 700
    .line 701
    if-eqz v5, :cond_10

    .line 702
    .line 703
    move-object/from16 v5, v28

    .line 704
    .line 705
    invoke-virtual {v15, v5}, Li0/h0;->k(Lfg/a;)V

    .line 706
    .line 707
    .line 708
    :goto_4
    move-object/from16 v5, v37

    .line 709
    .line 710
    goto :goto_5

    .line 711
    :cond_10
    invoke-virtual {v15}, Li0/h0;->n0()V

    .line 712
    .line 713
    .line 714
    goto :goto_4

    .line 715
    :goto_5
    invoke-static {v5, v15, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    move-object/from16 v2, v38

    .line 719
    .line 720
    invoke-static {v2, v15, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    move-object/from16 v2, v39

    .line 724
    .line 725
    move-object/from16 v5, v40

    .line 726
    .line 727
    invoke-static {v3, v15, v2, v15, v5}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 728
    .line 729
    .line 730
    move-object/from16 v2, v41

    .line 731
    .line 732
    invoke-static {v2, v15, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    sget-object v1, Lwb/y2;->p:Lwb/y2;

    .line 736
    .line 737
    float-to-double v2, v0

    .line 738
    const-wide/16 v16, 0x0

    .line 739
    .line 740
    cmpl-double v2, v2, v16

    .line 741
    .line 742
    const-string v18, "invalid weight; must be greater than zero"

    .line 743
    .line 744
    if-lez v2, :cond_11

    .line 745
    .line 746
    goto :goto_6

    .line 747
    :cond_11
    invoke-static/range {v18 .. v18}, Lq/a;->a(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    :goto_6
    new-instance v4, Lp/q0;

    .line 751
    .line 752
    const/4 v9, 0x1

    .line 753
    invoke-direct {v4, v0, v9}, Lp/q0;-><init>(FZ)V

    .line 754
    .line 755
    .line 756
    const/16 v7, 0x6006

    .line 757
    .line 758
    const/16 v8, 0x8

    .line 759
    .line 760
    const-string v2, "\u53d6\u6d88"

    .line 761
    .line 762
    move-object/from16 v10, p0

    .line 763
    .line 764
    iget-object v3, v10, Lwb/zu;->j:Lfg/a;

    .line 765
    .line 766
    const/4 v5, 0x0

    .line 767
    move-object v6, v15

    .line 768
    invoke-virtual/range {v1 .. v8}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 769
    .line 770
    .line 771
    move-object/from16 v12, v36

    .line 772
    .line 773
    invoke-virtual {v15, v12}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    move/from16 v4, v44

    .line 778
    .line 779
    invoke-virtual {v15, v4}, Li0/h0;->d(I)Z

    .line 780
    .line 781
    .line 782
    move-result v5

    .line 783
    or-int/2addr v2, v5

    .line 784
    move-object/from16 v5, p1

    .line 785
    .line 786
    invoke-virtual {v15, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v6

    .line 790
    or-int/2addr v2, v6

    .line 791
    invoke-virtual {v15, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v6

    .line 795
    or-int/2addr v2, v6

    .line 796
    iget-object v11, v10, Lwb/zu;->k:Landroid/app/Activity;

    .line 797
    .line 798
    invoke-virtual {v15, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v6

    .line 802
    or-int/2addr v2, v6

    .line 803
    iget-object v14, v10, Lwb/zu;->l:Lfg/l;

    .line 804
    .line 805
    invoke-virtual {v15, v14}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v6

    .line 809
    or-int/2addr v2, v6

    .line 810
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v6

    .line 814
    if-nez v2, :cond_13

    .line 815
    .line 816
    move-object/from16 v2, v42

    .line 817
    .line 818
    if-ne v6, v2, :cond_12

    .line 819
    .line 820
    goto :goto_7

    .line 821
    :cond_12
    move v2, v9

    .line 822
    goto :goto_8

    .line 823
    :cond_13
    :goto_7
    new-instance v7, Lwb/bv;

    .line 824
    .line 825
    move-object v10, v3

    .line 826
    move v8, v4

    .line 827
    move v2, v9

    .line 828
    move-object/from16 v13, v30

    .line 829
    .line 830
    move-object v9, v5

    .line 831
    invoke-direct/range {v7 .. v14}, Lwb/bv;-><init>(ILjava/lang/Integer;Lfg/a;Landroid/app/Activity;Li0/a1;Li0/a1;Lfg/l;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v15, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    move-object v6, v7

    .line 838
    :goto_8
    move-object v3, v6

    .line 839
    check-cast v3, Lfg/a;

    .line 840
    .line 841
    float-to-double v4, v0

    .line 842
    cmpl-double v4, v4, v16

    .line 843
    .line 844
    if-lez v4, :cond_14

    .line 845
    .line 846
    goto :goto_9

    .line 847
    :cond_14
    invoke-static/range {v18 .. v18}, Lq/a;->a(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    :goto_9
    new-instance v4, Lp/q0;

    .line 851
    .line 852
    invoke-direct {v4, v0, v2}, Lp/q0;-><init>(FZ)V

    .line 853
    .line 854
    .line 855
    const/16 v7, 0x6c06

    .line 856
    .line 857
    const/4 v8, 0x0

    .line 858
    move v9, v2

    .line 859
    const-string v2, "\u786e\u5b9a"

    .line 860
    .line 861
    const/4 v5, 0x1

    .line 862
    move-object v6, v15

    .line 863
    invoke-virtual/range {v1 .. v8}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v15, v9}, Li0/h0;->p(Z)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v15, v9}, Li0/h0;->p(Z)V

    .line 870
    .line 871
    .line 872
    return-object v29

    .line 873
    :cond_15
    move-object/from16 v29, v2

    .line 874
    .line 875
    move-object v15, v6

    .line 876
    invoke-virtual {v15}, Li0/h0;->V()V

    .line 877
    .line 878
    .line 879
    return-object v29
.end method
