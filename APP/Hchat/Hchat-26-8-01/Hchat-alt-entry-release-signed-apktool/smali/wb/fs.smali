.class public final synthetic Lwb/fs;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lsf/b;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILfg/l;Lwb/rt;Lfg/l;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/fs;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lwb/fs;->i:I

    .line 8
    .line 9
    iput-object p2, p0, Lwb/fs;->h:Lfg/l;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/fs;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/fs;->j:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/fs;->k:Lsf/b;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Lsf/e;Lfg/a;Landroid/app/Activity;Lfg/l;I)V
    .locals 1

    .line 18
    const/4 v0, 0x1

    iput v0, p0, Lwb/fs;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/fs;->j:Ljava/lang/Object;

    iput-object p2, p0, Lwb/fs;->k:Lsf/b;

    iput-object p3, p0, Lwb/fs;->l:Ljava/lang/Object;

    iput-object p4, p0, Lwb/fs;->h:Lfg/l;

    iput p5, p0, Lwb/fs;->i:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/fs;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/fs;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lsf/e;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/fs;->k:Lsf/b;

    .line 13
    .line 14
    move-object v4, v2

    .line 15
    check-cast v4, Lfg/a;

    .line 16
    .line 17
    iget-object v2, v0, Lwb/fs;->l:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, v2

    .line 20
    check-cast v5, Landroid/app/Activity;

    .line 21
    .line 22
    move-object/from16 v2, p1

    .line 23
    .line 24
    check-cast v2, Lr/d;

    .line 25
    .line 26
    move-object/from16 v10, p2

    .line 27
    .line 28
    check-cast v10, Li0/h0;

    .line 29
    .line 30
    move-object/from16 v3, p3

    .line 31
    .line 32
    check-cast v3, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v2, v3, 0x11

    .line 42
    .line 43
    const/16 v6, 0x10

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    if-eq v2, v6, :cond_0

    .line 47
    .line 48
    move v2, v7

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v2, 0x0

    .line 51
    :goto_0
    and-int/2addr v3, v7

    .line 52
    invoke-virtual {v10, v3, v2}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    sget-object v2, Lwb/y2;->p:Lwb/y2;

    .line 59
    .line 60
    iget-object v3, v1, Lsf/e;->g:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v9, v3

    .line 63
    check-cast v9, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v1, v1, Lsf/e;->h:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v10, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v10, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    or-int/2addr v3, v6

    .line 78
    iget-object v6, v0, Lwb/fs;->h:Lfg/l;

    .line 79
    .line 80
    invoke-virtual {v10, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    or-int/2addr v3, v7

    .line 85
    iget v7, v0, Lwb/fs;->i:I

    .line 86
    .line 87
    invoke-virtual {v10, v7}, Li0/h0;->d(I)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    or-int/2addr v3, v8

    .line 92
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    if-nez v3, :cond_1

    .line 97
    .line 98
    sget-object v3, Li0/l;->a:Li0/e;

    .line 99
    .line 100
    if-ne v8, v3, :cond_2

    .line 101
    .line 102
    :cond_1
    new-instance v3, Lwb/pu;

    .line 103
    .line 104
    const/4 v8, 0x1

    .line 105
    invoke-direct/range {v3 .. v8}, Lwb/pu;-><init>(Lfg/a;Landroid/app/Activity;Lfg/l;II)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v8, v3

    .line 112
    :cond_2
    check-cast v8, Lfg/a;

    .line 113
    .line 114
    const/16 v11, 0xc00

    .line 115
    .line 116
    move-object v6, v2

    .line 117
    move-object v7, v9

    .line 118
    move-object v9, v8

    .line 119
    move-object v8, v1

    .line 120
    invoke-virtual/range {v6 .. v11}, Lwb/y2;->z(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 128
    .line 129
    return-object v1

    .line 130
    :pswitch_0
    iget-object v1, v0, Lwb/fs;->l:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lwb/rt;

    .line 133
    .line 134
    iget-object v2, v0, Lwb/fs;->j:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v2, Lfg/l;

    .line 137
    .line 138
    iget-object v3, v0, Lwb/fs;->k:Lsf/b;

    .line 139
    .line 140
    check-cast v3, Lfg/l;

    .line 141
    .line 142
    move-object/from16 v4, p1

    .line 143
    .line 144
    check-cast v4, Lr/d;

    .line 145
    .line 146
    move-object/from16 v9, p2

    .line 147
    .line 148
    check-cast v9, Li0/h0;

    .line 149
    .line 150
    move-object/from16 v5, p3

    .line 151
    .line 152
    check-cast v5, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    and-int/lit8 v4, v5, 0x11

    .line 162
    .line 163
    const/16 v6, 0x10

    .line 164
    .line 165
    const/4 v7, 0x0

    .line 166
    const/4 v8, 0x1

    .line 167
    if-eq v4, v6, :cond_4

    .line 168
    .line 169
    move v4, v8

    .line 170
    goto :goto_2

    .line 171
    :cond_4
    move v4, v7

    .line 172
    :goto_2
    and-int/2addr v5, v8

    .line 173
    invoke-virtual {v9, v5, v4}, Li0/h0;->S(IZ)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_10

    .line 178
    .line 179
    iget v4, v0, Lwb/fs;->i:I

    .line 180
    .line 181
    if-lez v4, :cond_5

    .line 182
    .line 183
    const v4, -0x55777f16

    .line 184
    .line 185
    .line 186
    invoke-virtual {v9, v4}, Li0/h0;->a0(I)V

    .line 187
    .line 188
    .line 189
    const/4 v4, 0x0

    .line 190
    invoke-static {v4, v9, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 191
    .line 192
    .line 193
    :goto_3
    invoke-virtual {v9, v7}, Li0/h0;->p(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_5
    const v4, -0x59782f1a

    .line 198
    .line 199
    .line 200
    invoke-virtual {v9, v4}, Li0/h0;->a0(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :goto_4
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 205
    .line 206
    const/high16 v5, 0x3f800000    # 1.0f

    .line 207
    .line 208
    invoke-static {v4, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    const/16 v6, 0xa

    .line 213
    .line 214
    int-to-float v6, v6

    .line 215
    const/4 v7, 0x6

    .line 216
    int-to-float v7, v7

    .line 217
    const/4 v10, 0x5

    .line 218
    int-to-float v10, v10

    .line 219
    invoke-static {v4, v6, v10, v7, v10}, Lp/d;->o(Ly0/o;FFFF)Ly0/o;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    sget-object v6, Ly0/b;->q:Ly0/f;

    .line 224
    .line 225
    sget-object v7, Lp/j;->a:Lp/c;

    .line 226
    .line 227
    const/16 v10, 0x30

    .line 228
    .line 229
    invoke-static {v7, v6, v9, v10}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    iget-wide v10, v9, Li0/h0;->T:J

    .line 234
    .line 235
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    invoke-static {v9, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 248
    .line 249
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 253
    .line 254
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 255
    .line 256
    .line 257
    iget-boolean v12, v9, Li0/h0;->S:Z

    .line 258
    .line 259
    if-eqz v12, :cond_6

    .line 260
    .line 261
    invoke-virtual {v9, v11}, Li0/h0;->k(Lfg/a;)V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_6
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 266
    .line 267
    .line 268
    :goto_5
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 269
    .line 270
    invoke-static {v11, v9, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    sget-object v6, Lx1/f;->d:Lx1/e;

    .line 274
    .line 275
    invoke-static {v6, v9, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    sget-object v7, Lx1/f;->f:Lx1/e;

    .line 283
    .line 284
    invoke-static {v7, v9, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    sget-object v6, Lx1/f;->g:Lx1/d;

    .line 288
    .line 289
    invoke-static {v6, v9}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 290
    .line 291
    .line 292
    sget-object v6, Lx1/f;->c:Lx1/e;

    .line 293
    .line 294
    invoke-static {v6, v9, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    new-instance v4, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    iget-object v6, v1, Lwb/rt;->d:Lfb/a1;

    .line 303
    .line 304
    if-eqz v6, :cond_7

    .line 305
    .line 306
    const-string v6, "\u5f15\u7528 \u00b7 "

    .line 307
    .line 308
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    :cond_7
    iget-object v6, v1, Lwb/rt;->b:Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-eqz v7, :cond_8

    .line 318
    .line 319
    iget-object v6, v1, Lwb/rt;->c:Ljava/util/List;

    .line 320
    .line 321
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    const-string v7, " \u4e2a\u9644\u4ef6"

    .line 326
    .line 327
    invoke-static {v6, v7}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    :cond_8
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 339
    .line 340
    invoke-virtual {v9, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    check-cast v6, Lbi/b;

    .line 345
    .line 346
    invoke-virtual {v6}, Lbi/b;->h()J

    .line 347
    .line 348
    .line 349
    move-result-wide v6

    .line 350
    const/16 v10, 0xc

    .line 351
    .line 352
    invoke-static {v10}, Lx6/d;->D(I)J

    .line 353
    .line 354
    .line 355
    move-result-wide v10

    .line 356
    float-to-double v12, v5

    .line 357
    const-wide/16 v14, 0x0

    .line 358
    .line 359
    cmpl-double v12, v12, v14

    .line 360
    .line 361
    if-lez v12, :cond_9

    .line 362
    .line 363
    :goto_6
    move-wide v12, v6

    .line 364
    goto :goto_7

    .line 365
    :cond_9
    const-string v12, "invalid weight; must be greater than zero"

    .line 366
    .line 367
    invoke-static {v12}, Lq/a;->a(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto :goto_6

    .line 371
    :goto_7
    new-instance v6, Lp/q0;

    .line 372
    .line 373
    invoke-direct {v6, v5, v8}, Lp/q0;-><init>(FZ)V

    .line 374
    .line 375
    .line 376
    const/16 v26, 0x6180

    .line 377
    .line 378
    const v27, 0x3afe8

    .line 379
    .line 380
    .line 381
    move-object/from16 v24, v9

    .line 382
    .line 383
    move-wide v9, v10

    .line 384
    const/4 v11, 0x0

    .line 385
    move v5, v8

    .line 386
    move-wide v7, v12

    .line 387
    const/4 v12, 0x0

    .line 388
    const-wide/16 v13, 0x0

    .line 389
    .line 390
    const/4 v15, 0x0

    .line 391
    const-wide/16 v16, 0x0

    .line 392
    .line 393
    const/16 v18, 0x2

    .line 394
    .line 395
    const/16 v19, 0x0

    .line 396
    .line 397
    const/16 v20, 0x1

    .line 398
    .line 399
    const/16 v21, 0x0

    .line 400
    .line 401
    const/16 v22, 0x0

    .line 402
    .line 403
    const/16 v23, 0x0

    .line 404
    .line 405
    const/16 v25, 0x6000

    .line 406
    .line 407
    move/from16 v28, v5

    .line 408
    .line 409
    move-object v5, v4

    .line 410
    move/from16 v4, v28

    .line 411
    .line 412
    invoke-static/range {v5 .. v27}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 413
    .line 414
    .line 415
    move-object/from16 v9, v24

    .line 416
    .line 417
    sget-object v5, Lwb/y2;->n:Lwb/y2;

    .line 418
    .line 419
    sget-object v6, Lwb/ap;->r:Lm1/f;

    .line 420
    .line 421
    iget-object v7, v0, Lwb/fs;->h:Lfg/l;

    .line 422
    .line 423
    invoke-virtual {v9, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v8

    .line 427
    invoke-virtual {v9, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    or-int/2addr v8, v10

    .line 432
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v10

    .line 436
    sget-object v11, Li0/l;->a:Li0/e;

    .line 437
    .line 438
    if-nez v8, :cond_a

    .line 439
    .line 440
    if-ne v10, v11, :cond_b

    .line 441
    .line 442
    :cond_a
    new-instance v10, Lwb/is;

    .line 443
    .line 444
    const/4 v8, 0x0

    .line 445
    invoke-direct {v10, v7, v1, v8}, Lwb/is;-><init>(Lfg/l;Lwb/rt;I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v9, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :cond_b
    move-object v8, v10

    .line 452
    check-cast v8, Lfg/a;

    .line 453
    .line 454
    const/16 v10, 0xc36

    .line 455
    .line 456
    const-string v7, "\u7f16\u8f91\u5f85\u53d1\u9001\u6d88\u606f"

    .line 457
    .line 458
    invoke-virtual/range {v5 .. v10}, Lwb/y2;->h0(Lm1/f;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 459
    .line 460
    .line 461
    sget-object v6, Lwb/ap;->l:Lm1/f;

    .line 462
    .line 463
    invoke-virtual {v9, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    invoke-virtual {v9, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v8

    .line 471
    or-int/2addr v7, v8

    .line 472
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    if-nez v7, :cond_c

    .line 477
    .line 478
    if-ne v8, v11, :cond_d

    .line 479
    .line 480
    :cond_c
    new-instance v8, Lwb/is;

    .line 481
    .line 482
    const/4 v7, 0x1

    .line 483
    invoke-direct {v8, v2, v1, v7}, Lwb/is;-><init>(Lfg/l;Lwb/rt;I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v9, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    :cond_d
    check-cast v8, Lfg/a;

    .line 490
    .line 491
    const/16 v10, 0xc36

    .line 492
    .line 493
    const-string v7, "\u7acb\u5373\u53d1\u9001"

    .line 494
    .line 495
    invoke-virtual/range {v5 .. v10}, Lwb/y2;->h0(Lm1/f;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 496
    .line 497
    .line 498
    sget-object v6, Lwb/ap;->s:Lm1/f;

    .line 499
    .line 500
    invoke-virtual {v9, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    invoke-virtual {v9, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v7

    .line 508
    or-int/2addr v2, v7

    .line 509
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    if-nez v2, :cond_e

    .line 514
    .line 515
    if-ne v7, v11, :cond_f

    .line 516
    .line 517
    :cond_e
    new-instance v7, Lwb/is;

    .line 518
    .line 519
    const/4 v2, 0x2

    .line 520
    invoke-direct {v7, v3, v1, v2}, Lwb/is;-><init>(Lfg/l;Lwb/rt;I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    :cond_f
    move-object v8, v7

    .line 527
    check-cast v8, Lfg/a;

    .line 528
    .line 529
    const/16 v10, 0xc36

    .line 530
    .line 531
    const-string v7, "\u5220\u9664\u5f85\u53d1\u9001\u6d88\u606f"

    .line 532
    .line 533
    invoke-virtual/range {v5 .. v10}, Lwb/y2;->h0(Lm1/f;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v9, v4}, Li0/h0;->p(Z)V

    .line 537
    .line 538
    .line 539
    goto :goto_8

    .line 540
    :cond_10
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 541
    .line 542
    .line 543
    :goto_8
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 544
    .line 545
    return-object v1

    .line 546
    nop

    .line 547
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
