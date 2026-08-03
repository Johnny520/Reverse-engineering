.class public final synthetic Lwb/ef;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ln9/a;ZLfg/a;Lfg/l;Lfg/l;Lfg/a;I)V
    .locals 0

    .line 1
    const/4 p8, 0x1

    .line 2
    iput p8, p0, Lwb/ef;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ef;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ef;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Lwb/ef;->h:Z

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ef;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/ef;->i:Lfg/l;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/ef;->j:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/ef;->n:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/String;Lfg/a;ZLandroid/app/Activity;Lfg/l;)V
    .locals 1

    .line 22
    const/4 v0, 0x2

    iput v0, p0, Lwb/ef;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ef;->j:Ljava/lang/Object;

    iput-object p2, p0, Lwb/ef;->k:Ljava/lang/Object;

    iput-object p3, p0, Lwb/ef;->l:Ljava/lang/Object;

    iput-object p4, p0, Lwb/ef;->m:Ljava/lang/Object;

    iput-boolean p5, p0, Lwb/ef;->h:Z

    iput-object p6, p0, Lwb/ef;->n:Ljava/lang/Object;

    iput-object p7, p0, Lwb/ef;->i:Lfg/l;

    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Li0/a1;Lfg/l;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lwb/ef;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/ef;->h:Z

    iput-object p2, p0, Lwb/ef;->i:Lfg/l;

    iput-object p3, p0, Lwb/ef;->k:Ljava/lang/Object;

    iput-object p4, p0, Lwb/ef;->j:Ljava/lang/Object;

    iput-object p5, p0, Lwb/ef;->l:Ljava/lang/Object;

    iput-object p6, p0, Lwb/ef;->m:Ljava/lang/Object;

    iput-object p7, p0, Lwb/ef;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ef;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/ef;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/ef;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/Set;

    .line 15
    .line 16
    iget-object v3, v0, Lwb/ef;->l:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v3

    .line 19
    check-cast v4, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, v0, Lwb/ef;->m:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lfg/a;

    .line 24
    .line 25
    iget-object v5, v0, Lwb/ef;->n:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v8, v5

    .line 28
    check-cast v8, Landroid/app/Activity;

    .line 29
    .line 30
    move-object/from16 v14, p1

    .line 31
    .line 32
    check-cast v14, Li0/h0;

    .line 33
    .line 34
    move-object/from16 v5, p2

    .line 35
    .line 36
    check-cast v5, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    and-int/lit8 v6, v5, 0x3

    .line 43
    .line 44
    const/4 v7, 0x2

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x1

    .line 47
    if-eq v6, v7, :cond_0

    .line 48
    .line 49
    move v6, v10

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v6, v9

    .line 52
    :goto_0
    and-int/2addr v5, v10

    .line 53
    invoke-virtual {v14, v5, v6}, Li0/h0;->S(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_10

    .line 58
    .line 59
    invoke-virtual {v14, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v14, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    or-int/2addr v5, v6

    .line 68
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    sget-object v7, Li0/l;->a:Li0/e;

    .line 73
    .line 74
    if-nez v5, :cond_1

    .line 75
    .line 76
    if-ne v6, v7, :cond_4

    .line 77
    .line 78
    :cond_1
    check-cast v2, Ljava/lang/Iterable;

    .line 79
    .line 80
    new-instance v5, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_3

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    move-object v11, v6

    .line 100
    check-cast v11, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-ltz v11, :cond_2

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-ge v11, v12, :cond_2

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    invoke-static {v5}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v14, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    move-object v2, v6

    .line 130
    check-cast v2, Li0/a1;

    .line 131
    .line 132
    sget-object v15, Ly0/l;->a:Ly0/l;

    .line 133
    .line 134
    const/high16 v5, 0x3f800000    # 1.0f

    .line 135
    .line 136
    invoke-static {v15, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    sget-object v11, Lp/j;->c:Lp/e;

    .line 141
    .line 142
    sget-object v12, Ly0/b;->s:Ly0/e;

    .line 143
    .line 144
    invoke-static {v11, v12, v14, v9}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    iget-wide v12, v14, Li0/h0;->T:J

    .line 149
    .line 150
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    invoke-virtual {v14}, Li0/h0;->l()Ls0/h;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-static {v14, v6}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    sget-object v16, Lx1/g;->f:Lx1/f;

    .line 163
    .line 164
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 168
    .line 169
    invoke-virtual {v14}, Li0/h0;->d0()V

    .line 170
    .line 171
    .line 172
    iget-boolean v5, v14, Li0/h0;->S:Z

    .line 173
    .line 174
    if-eqz v5, :cond_5

    .line 175
    .line 176
    invoke-virtual {v14, v10}, Li0/h0;->k(Lfg/a;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    invoke-virtual {v14}, Li0/h0;->n0()V

    .line 181
    .line 182
    .line 183
    :goto_2
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 184
    .line 185
    invoke-static {v5, v14, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object v11, Lx1/f;->d:Lx1/e;

    .line 189
    .line 190
    invoke-static {v11, v14, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    sget-object v13, Lx1/f;->f:Lx1/e;

    .line 198
    .line 199
    invoke-static {v13, v14, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    sget-object v12, Lx1/f;->g:Lx1/d;

    .line 203
    .line 204
    invoke-static {v12, v14}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v21, v10

    .line 208
    .line 209
    sget-object v10, Lx1/f;->c:Lx1/e;

    .line 210
    .line 211
    invoke-static {v10, v14, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    move-object/from16 v22, v10

    .line 219
    .line 220
    const/16 v10, 0xa

    .line 221
    .line 222
    if-nez v6, :cond_6

    .line 223
    .line 224
    const v6, 0x6a3b4fb1

    .line 225
    .line 226
    .line 227
    invoke-virtual {v14, v6}, Li0/h0;->a0(I)V

    .line 228
    .line 229
    .line 230
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 231
    .line 232
    invoke-virtual {v14, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    check-cast v6, Lbi/b;

    .line 237
    .line 238
    invoke-virtual {v6}, Lbi/b;->h()J

    .line 239
    .line 240
    .line 241
    move-result-wide v23

    .line 242
    const/16 v6, 0xd

    .line 243
    .line 244
    invoke-static {v6}, Lx6/d;->D(I)J

    .line 245
    .line 246
    .line 247
    move-result-wide v25

    .line 248
    const/4 v6, 0x4

    .line 249
    int-to-float v6, v6

    .line 250
    int-to-float v9, v10

    .line 251
    const/16 v20, 0x6

    .line 252
    .line 253
    const/16 v17, 0x0

    .line 254
    .line 255
    const/16 v18, 0x0

    .line 256
    .line 257
    move/from16 v16, v6

    .line 258
    .line 259
    move/from16 v19, v9

    .line 260
    .line 261
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    move-object/from16 v16, v8

    .line 266
    .line 267
    move-wide/from16 v8, v25

    .line 268
    .line 269
    const/16 v25, 0x0

    .line 270
    .line 271
    const v26, 0x3ffe8

    .line 272
    .line 273
    .line 274
    move/from16 v17, v10

    .line 275
    .line 276
    const/4 v10, 0x0

    .line 277
    move-object/from16 v18, v11

    .line 278
    .line 279
    const/4 v11, 0x0

    .line 280
    move-object/from16 v20, v12

    .line 281
    .line 282
    move-object/from16 v19, v13

    .line 283
    .line 284
    const-wide/16 v12, 0x0

    .line 285
    .line 286
    move-object/from16 v27, v7

    .line 287
    .line 288
    move-wide/from16 v45, v23

    .line 289
    .line 290
    move-object/from16 v24, v5

    .line 291
    .line 292
    move-object v5, v6

    .line 293
    move-object/from16 v23, v14

    .line 294
    .line 295
    move-wide/from16 v6, v45

    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    move-object/from16 v29, v15

    .line 299
    .line 300
    move-object/from16 v28, v16

    .line 301
    .line 302
    const-wide/16 v15, 0x0

    .line 303
    .line 304
    move/from16 v30, v17

    .line 305
    .line 306
    const/16 v17, 0x0

    .line 307
    .line 308
    move-object/from16 v31, v18

    .line 309
    .line 310
    const/16 v18, 0x0

    .line 311
    .line 312
    move-object/from16 v32, v19

    .line 313
    .line 314
    const/16 v19, 0x0

    .line 315
    .line 316
    move-object/from16 v33, v20

    .line 317
    .line 318
    const/16 v20, 0x0

    .line 319
    .line 320
    move-object/from16 v34, v21

    .line 321
    .line 322
    const/16 v21, 0x0

    .line 323
    .line 324
    move-object/from16 v35, v22

    .line 325
    .line 326
    const/16 v22, 0x0

    .line 327
    .line 328
    move-object/from16 v36, v24

    .line 329
    .line 330
    const/16 v24, 0x6030

    .line 331
    .line 332
    move-object/from16 p1, v2

    .line 333
    .line 334
    move-object/from16 v37, v3

    .line 335
    .line 336
    move-object/from16 v44, v27

    .line 337
    .line 338
    move-object/from16 v38, v28

    .line 339
    .line 340
    move-object/from16 v2, v29

    .line 341
    .line 342
    move-object/from16 v40, v31

    .line 343
    .line 344
    move-object/from16 v41, v32

    .line 345
    .line 346
    move-object/from16 v42, v33

    .line 347
    .line 348
    move-object/from16 v43, v35

    .line 349
    .line 350
    move-object/from16 v39, v36

    .line 351
    .line 352
    const/high16 v0, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v3, 0x0

    .line 355
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 356
    .line 357
    .line 358
    move-object/from16 v14, v23

    .line 359
    .line 360
    invoke-virtual {v14, v3}, Li0/h0;->p(Z)V

    .line 361
    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_6
    move-object/from16 p1, v2

    .line 365
    .line 366
    move-object/from16 v37, v3

    .line 367
    .line 368
    move-object/from16 v39, v5

    .line 369
    .line 370
    move-object/from16 v44, v7

    .line 371
    .line 372
    move-object/from16 v38, v8

    .line 373
    .line 374
    move v3, v9

    .line 375
    move-object/from16 v40, v11

    .line 376
    .line 377
    move-object/from16 v42, v12

    .line 378
    .line 379
    move-object/from16 v41, v13

    .line 380
    .line 381
    move-object v2, v15

    .line 382
    move-object/from16 v34, v21

    .line 383
    .line 384
    move-object/from16 v43, v22

    .line 385
    .line 386
    const/high16 v0, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const v4, 0x6a4043e8

    .line 389
    .line 390
    .line 391
    invoke-virtual {v14, v4}, Li0/h0;->a0(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v14, v3}, Li0/h0;->p(Z)V

    .line 395
    .line 396
    .line 397
    :goto_3
    invoke-static {v2, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    const/16 v5, 0x168

    .line 402
    .line 403
    int-to-float v5, v5

    .line 404
    const/4 v6, 0x0

    .line 405
    const/4 v7, 0x1

    .line 406
    invoke-static {v4, v6, v5, v7}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 407
    .line 408
    .line 409
    move-result-object v9

    .line 410
    invoke-virtual {v14, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    move-object/from16 v5, p1

    .line 415
    .line 416
    invoke-virtual {v14, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v6

    .line 420
    or-int/2addr v4, v6

    .line 421
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    if-nez v4, :cond_7

    .line 426
    .line 427
    move-object/from16 v4, v44

    .line 428
    .line 429
    if-ne v6, v4, :cond_8

    .line 430
    .line 431
    goto :goto_4

    .line 432
    :cond_7
    move-object/from16 v4, v44

    .line 433
    .line 434
    :goto_4
    new-instance v6, Lwb/l7;

    .line 435
    .line 436
    const/16 v8, 0x13

    .line 437
    .line 438
    invoke-direct {v6, v1, v8, v5}, Lwb/l7;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v14, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_8
    move-object/from16 v17, v6

    .line 445
    .line 446
    check-cast v17, Lfg/l;

    .line 447
    .line 448
    const/16 v19, 0x6

    .line 449
    .line 450
    const/16 v20, 0x1fe

    .line 451
    .line 452
    const/4 v10, 0x0

    .line 453
    const/4 v11, 0x0

    .line 454
    const/4 v12, 0x0

    .line 455
    const/4 v13, 0x0

    .line 456
    move-object/from16 v23, v14

    .line 457
    .line 458
    const/4 v14, 0x0

    .line 459
    const/4 v15, 0x0

    .line 460
    const/16 v16, 0x0

    .line 461
    .line 462
    move-object/from16 v18, v23

    .line 463
    .line 464
    invoke-static/range {v9 .. v20}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 465
    .line 466
    .line 467
    move-object/from16 v14, v18

    .line 468
    .line 469
    invoke-static {v2, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    const/16 v1, 0xa

    .line 474
    .line 475
    int-to-float v10, v1

    .line 476
    const/4 v1, 0x6

    .line 477
    int-to-float v12, v1

    .line 478
    const/4 v13, 0x5

    .line 479
    const/4 v9, 0x0

    .line 480
    const/4 v11, 0x0

    .line 481
    invoke-static/range {v8 .. v13}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const/16 v6, 0x8

    .line 486
    .line 487
    int-to-float v6, v6

    .line 488
    invoke-static {v6}, Lp/j;->g(F)Lp/h;

    .line 489
    .line 490
    .line 491
    move-result-object v6

    .line 492
    sget-object v8, Ly0/b;->p:Ly0/f;

    .line 493
    .line 494
    invoke-static {v6, v8, v14, v1}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    iget-wide v8, v14, Li0/h0;->T:J

    .line 499
    .line 500
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    invoke-virtual {v14}, Li0/h0;->l()Ls0/h;

    .line 505
    .line 506
    .line 507
    move-result-object v8

    .line 508
    invoke-static {v14, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-virtual {v14}, Li0/h0;->d0()V

    .line 513
    .line 514
    .line 515
    iget-boolean v9, v14, Li0/h0;->S:Z

    .line 516
    .line 517
    if-eqz v9, :cond_9

    .line 518
    .line 519
    move-object/from16 v9, v34

    .line 520
    .line 521
    invoke-virtual {v14, v9}, Li0/h0;->k(Lfg/a;)V

    .line 522
    .line 523
    .line 524
    :goto_5
    move-object/from16 v9, v39

    .line 525
    .line 526
    goto :goto_6

    .line 527
    :cond_9
    invoke-virtual {v14}, Li0/h0;->n0()V

    .line 528
    .line 529
    .line 530
    goto :goto_5

    .line 531
    :goto_6
    invoke-static {v9, v14, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    move-object/from16 v1, v40

    .line 535
    .line 536
    invoke-static {v1, v14, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    move-object/from16 v1, v41

    .line 540
    .line 541
    move-object/from16 v8, v42

    .line 542
    .line 543
    invoke-static {v6, v14, v1, v14, v8}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 544
    .line 545
    .line 546
    move-object/from16 v1, v43

    .line 547
    .line 548
    invoke-static {v1, v14, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    sget-object v9, Lwb/y2;->p:Lwb/y2;

    .line 552
    .line 553
    float-to-double v1, v0

    .line 554
    const-wide/16 v15, 0x0

    .line 555
    .line 556
    cmpl-double v1, v1, v15

    .line 557
    .line 558
    const-string v2, "invalid weight; must be greater than zero"

    .line 559
    .line 560
    if-lez v1, :cond_a

    .line 561
    .line 562
    goto :goto_7

    .line 563
    :cond_a
    invoke-static {v2}, Lq/a;->a(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    :goto_7
    new-instance v8, Lp/q0;

    .line 567
    .line 568
    invoke-direct {v8, v0, v7}, Lp/q0;-><init>(FZ)V

    .line 569
    .line 570
    .line 571
    const/16 v11, 0x6006

    .line 572
    .line 573
    const/16 v12, 0x8

    .line 574
    .line 575
    const-string v6, "\u53d6\u6d88"

    .line 576
    .line 577
    move-object v1, v5

    .line 578
    move-object v5, v9

    .line 579
    const/4 v9, 0x0

    .line 580
    move v13, v7

    .line 581
    move-object v10, v14

    .line 582
    move-object/from16 v7, v37

    .line 583
    .line 584
    invoke-virtual/range {v5 .. v12}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 585
    .line 586
    .line 587
    move-object v12, v5

    .line 588
    invoke-virtual {v14, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v5

    .line 592
    move-object/from16 v6, p0

    .line 593
    .line 594
    iget-boolean v8, v6, Lwb/ef;->h:Z

    .line 595
    .line 596
    invoke-virtual {v14, v8}, Li0/h0;->g(Z)Z

    .line 597
    .line 598
    .line 599
    move-result v9

    .line 600
    or-int/2addr v5, v9

    .line 601
    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v9

    .line 605
    or-int/2addr v5, v9

    .line 606
    move-object/from16 v9, v38

    .line 607
    .line 608
    invoke-virtual {v14, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v10

    .line 612
    or-int/2addr v5, v10

    .line 613
    iget-object v10, v6, Lwb/ef;->i:Lfg/l;

    .line 614
    .line 615
    invoke-virtual {v14, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-result v11

    .line 619
    or-int/2addr v5, v11

    .line 620
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v11

    .line 624
    if-nez v5, :cond_c

    .line 625
    .line 626
    if-ne v11, v4, :cond_b

    .line 627
    .line 628
    goto :goto_8

    .line 629
    :cond_b
    move-object v9, v1

    .line 630
    move-object v1, v6

    .line 631
    move v6, v8

    .line 632
    goto :goto_9

    .line 633
    :cond_c
    :goto_8
    new-instance v5, Lwb/ji;

    .line 634
    .line 635
    const/4 v11, 0x2

    .line 636
    move-object/from16 v45, v9

    .line 637
    .line 638
    move-object v9, v1

    .line 639
    move-object v1, v6

    .line 640
    move v6, v8

    .line 641
    move-object/from16 v8, v45

    .line 642
    .line 643
    invoke-direct/range {v5 .. v11}, Lwb/ji;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v14, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    move-object v11, v5

    .line 650
    :goto_9
    check-cast v11, Lfg/a;

    .line 651
    .line 652
    float-to-double v4, v0

    .line 653
    cmpl-double v4, v4, v15

    .line 654
    .line 655
    if-lez v4, :cond_d

    .line 656
    .line 657
    :goto_a
    move-object v5, v12

    .line 658
    goto :goto_b

    .line 659
    :cond_d
    invoke-static {v2}, Lq/a;->a(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    goto :goto_a

    .line 663
    :goto_b
    new-instance v12, Lp/q0;

    .line 664
    .line 665
    invoke-direct {v12, v0, v13}, Lp/q0;-><init>(FZ)V

    .line 666
    .line 667
    .line 668
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    check-cast v0, Ljava/util/Set;

    .line 673
    .line 674
    check-cast v0, Ljava/util/Collection;

    .line 675
    .line 676
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    if-eqz v0, :cond_f

    .line 681
    .line 682
    if-eqz v6, :cond_e

    .line 683
    .line 684
    goto :goto_c

    .line 685
    :cond_e
    move v9, v3

    .line 686
    goto :goto_d

    .line 687
    :cond_f
    :goto_c
    move v9, v13

    .line 688
    :goto_d
    const/16 v15, 0x6006

    .line 689
    .line 690
    const/16 v16, 0x0

    .line 691
    .line 692
    const-string v10, "\u786e\u5b9a"

    .line 693
    .line 694
    move v7, v13

    .line 695
    move v13, v9

    .line 696
    move-object v9, v5

    .line 697
    invoke-virtual/range {v9 .. v16}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v14, v7}, Li0/h0;->p(Z)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v14, v7}, Li0/h0;->p(Z)V

    .line 704
    .line 705
    .line 706
    goto :goto_e

    .line 707
    :cond_10
    move-object v1, v0

    .line 708
    invoke-virtual {v14}, Li0/h0;->V()V

    .line 709
    .line 710
    .line 711
    :goto_e
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 712
    .line 713
    return-object v0

    .line 714
    :pswitch_0
    move-object v1, v0

    .line 715
    iget-object v0, v1, Lwb/ef;->k:Ljava/lang/Object;

    .line 716
    .line 717
    move-object v2, v0

    .line 718
    check-cast v2, Landroid/content/Context;

    .line 719
    .line 720
    iget-object v0, v1, Lwb/ef;->l:Ljava/lang/Object;

    .line 721
    .line 722
    move-object v3, v0

    .line 723
    check-cast v3, Ln9/a;

    .line 724
    .line 725
    iget-object v0, v1, Lwb/ef;->m:Ljava/lang/Object;

    .line 726
    .line 727
    move-object v5, v0

    .line 728
    check-cast v5, Lfg/a;

    .line 729
    .line 730
    iget-object v0, v1, Lwb/ef;->j:Ljava/lang/Object;

    .line 731
    .line 732
    move-object v7, v0

    .line 733
    check-cast v7, Lfg/l;

    .line 734
    .line 735
    iget-object v0, v1, Lwb/ef;->n:Ljava/lang/Object;

    .line 736
    .line 737
    move-object v8, v0

    .line 738
    check-cast v8, Lfg/a;

    .line 739
    .line 740
    move-object/from16 v9, p1

    .line 741
    .line 742
    check-cast v9, Li0/h0;

    .line 743
    .line 744
    move-object/from16 v0, p2

    .line 745
    .line 746
    check-cast v0, Ljava/lang/Integer;

    .line 747
    .line 748
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    const/16 v0, 0xc41

    .line 752
    .line 753
    invoke-static {v0}, Li0/r;->C(I)I

    .line 754
    .line 755
    .line 756
    move-result v10

    .line 757
    iget-boolean v4, v1, Lwb/ef;->h:Z

    .line 758
    .line 759
    iget-object v6, v1, Lwb/ef;->i:Lfg/l;

    .line 760
    .line 761
    invoke-static/range {v2 .. v10}, Lwb/ho;->b1(Landroid/content/Context;Ln9/a;ZLfg/a;Lfg/l;Lfg/l;Lfg/a;Li0/h0;I)V

    .line 762
    .line 763
    .line 764
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 765
    .line 766
    return-object v0

    .line 767
    :pswitch_1
    move-object v1, v0

    .line 768
    iget-object v0, v1, Lwb/ef;->k:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v0, Li0/a1;

    .line 771
    .line 772
    iget-object v2, v1, Lwb/ef;->j:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v2, Lfg/l;

    .line 775
    .line 776
    iget-object v3, v1, Lwb/ef;->l:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v3, Li0/a1;

    .line 779
    .line 780
    iget-object v4, v1, Lwb/ef;->m:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v4, Li0/a1;

    .line 783
    .line 784
    iget-object v5, v1, Lwb/ef;->n:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v5, Li0/a1;

    .line 787
    .line 788
    move-object/from16 v11, p1

    .line 789
    .line 790
    check-cast v11, Li0/h0;

    .line 791
    .line 792
    move-object/from16 v6, p2

    .line 793
    .line 794
    check-cast v6, Ljava/lang/Integer;

    .line 795
    .line 796
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v6

    .line 800
    and-int/lit8 v7, v6, 0x3

    .line 801
    .line 802
    const/4 v8, 0x2

    .line 803
    const/4 v14, 0x1

    .line 804
    const/4 v15, 0x0

    .line 805
    if-eq v7, v8, :cond_11

    .line 806
    .line 807
    move v7, v14

    .line 808
    goto :goto_f

    .line 809
    :cond_11
    move v7, v15

    .line 810
    :goto_f
    and-int/2addr v6, v14

    .line 811
    invoke-virtual {v11, v6, v7}, Li0/h0;->S(IZ)Z

    .line 812
    .line 813
    .line 814
    move-result v6

    .line 815
    if-eqz v6, :cond_1b

    .line 816
    .line 817
    iget-boolean v6, v1, Lwb/ef;->h:Z

    .line 818
    .line 819
    const/4 v7, 0x0

    .line 820
    sget-object v8, Li0/l;->a:Li0/e;

    .line 821
    .line 822
    if-nez v6, :cond_16

    .line 823
    .line 824
    const v6, 0x3d5891ad

    .line 825
    .line 826
    .line 827
    invoke-virtual {v11, v6}, Li0/h0;->a0(I)V

    .line 828
    .line 829
    .line 830
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v6

    .line 834
    check-cast v6, Ljava/lang/String;

    .line 835
    .line 836
    invoke-static {v6}, Lwb/ho;->j6(Ljava/lang/String;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v6

    .line 840
    iget-object v9, v1, Lwb/ef;->i:Lfg/l;

    .line 841
    .line 842
    invoke-virtual {v11, v9}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v10

    .line 846
    invoke-virtual {v11, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v12

    .line 850
    or-int/2addr v10, v12

    .line 851
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v12

    .line 855
    if-nez v10, :cond_12

    .line 856
    .line 857
    if-ne v12, v8, :cond_13

    .line 858
    .line 859
    :cond_12
    new-instance v12, Lwb/o1;

    .line 860
    .line 861
    const/16 v10, 0x9

    .line 862
    .line 863
    invoke-direct {v12, v9, v0, v10}, Lwb/o1;-><init>(Lfg/l;Li0/a1;I)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v11, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    :cond_13
    check-cast v12, Lfg/a;

    .line 870
    .line 871
    const-string v0, "\u4ec5\u663e\u793a\u6210\u5458\u901a\u77e5"

    .line 872
    .line 873
    const/4 v9, 0x6

    .line 874
    invoke-static {v0, v6, v12, v11, v9}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 875
    .line 876
    .line 877
    invoke-static {v7, v11, v15, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 878
    .line 879
    .line 880
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    check-cast v0, Ljava/lang/String;

    .line 885
    .line 886
    invoke-static {v0}, Lwb/ho;->j6(Ljava/lang/String;)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-virtual {v11, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 891
    .line 892
    .line 893
    move-result v6

    .line 894
    invoke-virtual {v11, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v10

    .line 898
    or-int/2addr v6, v10

    .line 899
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v10

    .line 903
    if-nez v6, :cond_14

    .line 904
    .line 905
    if-ne v10, v8, :cond_15

    .line 906
    .line 907
    :cond_14
    new-instance v10, Lwb/o1;

    .line 908
    .line 909
    const/16 v6, 0xa

    .line 910
    .line 911
    invoke-direct {v10, v2, v3, v6}, Lwb/o1;-><init>(Lfg/l;Li0/a1;I)V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v11, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    :cond_15
    check-cast v10, Lfg/a;

    .line 918
    .line 919
    const-string v2, "\u5c4f\u853d\u6210\u5458\u901a\u77e5"

    .line 920
    .line 921
    invoke-static {v2, v0, v10, v11, v9}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 922
    .line 923
    .line 924
    invoke-static {v7, v11, v15, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v11, v15}, Li0/h0;->p(Z)V

    .line 928
    .line 929
    .line 930
    goto :goto_10

    .line 931
    :cond_16
    const v0, 0x3d5f7242

    .line 932
    .line 933
    .line 934
    invoke-virtual {v11, v0}, Li0/h0;->a0(I)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v11, v15}, Li0/h0;->p(Z)V

    .line 938
    .line 939
    .line 940
    :goto_10
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    check-cast v0, Ljava/lang/Boolean;

    .line 945
    .line 946
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 947
    .line 948
    .line 949
    move-result v6

    .line 950
    invoke-virtual {v11, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 951
    .line 952
    .line 953
    move-result v0

    .line 954
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v2

    .line 958
    if-nez v0, :cond_17

    .line 959
    .line 960
    if-ne v2, v8, :cond_18

    .line 961
    .line 962
    :cond_17
    new-instance v2, Lwb/gi;

    .line 963
    .line 964
    const/16 v0, 0xa

    .line 965
    .line 966
    invoke-direct {v2, v4, v0}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v11, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 970
    .line 971
    .line 972
    :cond_18
    move-object v10, v2

    .line 973
    check-cast v10, Lfg/l;

    .line 974
    .line 975
    const/16 v12, 0x1b0

    .line 976
    .line 977
    const/16 v13, 0x8

    .line 978
    .line 979
    move v0, v7

    .line 980
    const-string v7, "\u5c4f\u853d@\u6240\u6709\u4eba"

    .line 981
    .line 982
    move-object v2, v8

    .line 983
    const-string v8, "\u547d\u4e2d @\u6240\u6709\u4eba \u65f6\u4e0d\u5f39\u901a\u77e5"

    .line 984
    .line 985
    const/4 v9, 0x0

    .line 986
    invoke-static/range {v6 .. v13}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 987
    .line 988
    .line 989
    invoke-static {v0, v11, v15, v14}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 990
    .line 991
    .line 992
    invoke-interface {v5}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    check-cast v0, Ljava/lang/Boolean;

    .line 997
    .line 998
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 999
    .line 1000
    .line 1001
    move-result v6

    .line 1002
    invoke-virtual {v11, v5}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    invoke-virtual {v11}, Li0/h0;->P()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v3

    .line 1010
    if-nez v0, :cond_19

    .line 1011
    .line 1012
    if-ne v3, v2, :cond_1a

    .line 1013
    .line 1014
    :cond_19
    new-instance v3, Lwb/gi;

    .line 1015
    .line 1016
    const/16 v0, 0xb

    .line 1017
    .line 1018
    invoke-direct {v3, v5, v0}, Lwb/gi;-><init>(Li0/a1;I)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v11, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1022
    .line 1023
    .line 1024
    :cond_1a
    move-object v10, v3

    .line 1025
    check-cast v10, Lfg/l;

    .line 1026
    .line 1027
    const/16 v12, 0x1b0

    .line 1028
    .line 1029
    const/16 v13, 0x8

    .line 1030
    .line 1031
    const-string v7, "\u5c4f\u853d@\u6211"

    .line 1032
    .line 1033
    const-string v8, "\u547d\u4e2d @\u6211 \u65f6\u4e0d\u5f39\u901a\u77e5"

    .line 1034
    .line 1035
    const/4 v9, 0x0

    .line 1036
    invoke-static/range {v6 .. v13}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_11

    .line 1040
    :cond_1b
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 1041
    .line 1042
    .line 1043
    :goto_11
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1044
    .line 1045
    return-object v0

    .line 1046
    nop

    .line 1047
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
