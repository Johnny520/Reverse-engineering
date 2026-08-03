.class public final synthetic Lwb/ph;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lsf/b;


# direct methods
.method public synthetic constructor <init>(Lfg/a;Lj8/i;Lfg/l;ZZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/ph;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ph;->j:Lfg/a;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ph;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ph;->l:Lsf/b;

    .line 12
    .line 13
    iput-boolean p4, p0, Lwb/ph;->h:Z

    .line 14
    .line 15
    iput-boolean p5, p0, Lwb/ph;->i:Z

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(ZZLfg/a;Lfg/a;Lfg/a;)V
    .locals 1

    .line 18
    const/4 v0, 0x1

    iput v0, p0, Lwb/ph;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/ph;->h:Z

    iput-boolean p2, p0, Lwb/ph;->i:Z

    iput-object p3, p0, Lwb/ph;->j:Lfg/a;

    iput-object p4, p0, Lwb/ph;->k:Ljava/lang/Object;

    iput-object p5, p0, Lwb/ph;->l:Lsf/b;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/ph;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/ph;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v6, v1

    .line 11
    check-cast v6, Lfg/a;

    .line 12
    .line 13
    iget-object v1, v0, Lwb/ph;->l:Lsf/b;

    .line 14
    .line 15
    move-object v7, v1

    .line 16
    check-cast v7, Lfg/a;

    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, Lr/d;

    .line 21
    .line 22
    move-object/from16 v8, p2

    .line 23
    .line 24
    check-cast v8, Li0/h0;

    .line 25
    .line 26
    move-object/from16 v2, p3

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v1, v2, 0x11

    .line 38
    .line 39
    const/16 v3, 0x10

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    if-eq v1, v3, :cond_0

    .line 43
    .line 44
    move v1, v9

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v1, 0x0

    .line 47
    :goto_0
    and-int/2addr v2, v9

    .line 48
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    new-instance v2, Lwb/ej;

    .line 55
    .line 56
    iget-boolean v3, v0, Lwb/ph;->h:Z

    .line 57
    .line 58
    iget-boolean v4, v0, Lwb/ph;->i:Z

    .line 59
    .line 60
    iget-object v5, v0, Lwb/ph;->j:Lfg/a;

    .line 61
    .line 62
    invoke-direct/range {v2 .. v7}, Lwb/ej;-><init>(ZZLfg/a;Lfg/a;Lfg/a;)V

    .line 63
    .line 64
    .line 65
    const v1, 0x4f55a580

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/16 v2, 0x30

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-static {v3, v1, v8, v2, v9}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 80
    .line 81
    .line 82
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 83
    .line 84
    return-object v1

    .line 85
    :pswitch_0
    iget-object v1, v0, Lwb/ph;->k:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lj8/i;

    .line 88
    .line 89
    iget-object v2, v0, Lwb/ph;->l:Lsf/b;

    .line 90
    .line 91
    check-cast v2, Lfg/l;

    .line 92
    .line 93
    move-object/from16 v3, p1

    .line 94
    .line 95
    check-cast v3, Lp/u;

    .line 96
    .line 97
    move-object/from16 v4, p2

    .line 98
    .line 99
    check-cast v4, Li0/h0;

    .line 100
    .line 101
    move-object/from16 v5, p3

    .line 102
    .line 103
    check-cast v5, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    and-int/lit8 v3, v5, 0x11

    .line 113
    .line 114
    const/4 v6, 0x1

    .line 115
    const/4 v7, 0x0

    .line 116
    const/16 v8, 0x10

    .line 117
    .line 118
    if-eq v3, v8, :cond_2

    .line 119
    .line 120
    move v3, v6

    .line 121
    goto :goto_2

    .line 122
    :cond_2
    move v3, v7

    .line 123
    :goto_2
    and-int/2addr v5, v6

    .line 124
    invoke-virtual {v4, v5, v3}, Li0/h0;->S(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_a

    .line 129
    .line 130
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    sget-object v5, Li0/l;->a:Li0/e;

    .line 135
    .line 136
    if-ne v3, v5, :cond_3

    .line 137
    .line 138
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-static {v3}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v4, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_3
    check-cast v3, Li0/a1;

    .line 148
    .line 149
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    check-cast v9, Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    invoke-static {v9, v4}, Lwb/ho;->L6(ZLi0/h0;)J

    .line 160
    .line 161
    .line 162
    move-result-wide v9

    .line 163
    sget-object v11, Ly0/l;->a:Ly0/l;

    .line 164
    .line 165
    const/high16 v12, 0x3f800000    # 1.0f

    .line 166
    .line 167
    invoke-static {v11, v12}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    const/16 v14, 0xc

    .line 172
    .line 173
    int-to-float v15, v14

    .line 174
    invoke-static {v15}, Lv/e;->a(F)Lv/d;

    .line 175
    .line 176
    .line 177
    move-result-object v14

    .line 178
    invoke-static {v13, v14}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    sget-object v14, Lf1/c0;->b:Lf1/m0;

    .line 183
    .line 184
    invoke-static {v13, v9, v10, v14}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    if-ne v10, v5, :cond_4

    .line 193
    .line 194
    new-instance v10, Lwb/aj;

    .line 195
    .line 196
    const/4 v5, 0x6

    .line 197
    invoke-direct {v10, v3, v5}, Lwb/aj;-><init>(Li0/a1;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_4
    check-cast v10, Lfg/l;

    .line 204
    .line 205
    iget-object v3, v0, Lwb/ph;->j:Lfg/a;

    .line 206
    .line 207
    invoke-static {v9, v3, v10}, Lwb/ho;->N6(Ly0/o;Lfg/a;Lfg/l;)Ly0/o;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    int-to-float v5, v8

    .line 212
    const/16 v9, 0xe

    .line 213
    .line 214
    int-to-float v9, v9

    .line 215
    invoke-static {v3, v5, v9}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    sget-object v5, Ly0/b;->q:Ly0/f;

    .line 220
    .line 221
    sget-object v9, Lp/j;->a:Lp/c;

    .line 222
    .line 223
    const/16 v10, 0x30

    .line 224
    .line 225
    invoke-static {v9, v5, v4, v10}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    iget-wide v9, v4, Li0/h0;->T:J

    .line 230
    .line 231
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    invoke-static {v4, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    sget-object v13, Lx1/g;->f:Lx1/f;

    .line 244
    .line 245
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    sget-object v13, Lx1/f;->b:Lx1/y;

    .line 249
    .line 250
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 251
    .line 252
    .line 253
    iget-boolean v14, v4, Li0/h0;->S:Z

    .line 254
    .line 255
    if-eqz v14, :cond_5

    .line 256
    .line 257
    invoke-virtual {v4, v13}, Li0/h0;->k(Lfg/a;)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_5
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 262
    .line 263
    .line 264
    :goto_3
    sget-object v14, Lx1/f;->e:Lx1/e;

    .line 265
    .line 266
    invoke-static {v14, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object v5, Lx1/f;->d:Lx1/e;

    .line 270
    .line 271
    invoke-static {v5, v4, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    sget-object v10, Lx1/f;->f:Lx1/e;

    .line 279
    .line 280
    invoke-static {v10, v4, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    sget-object v9, Lx1/f;->g:Lx1/d;

    .line 284
    .line 285
    invoke-static {v9, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 286
    .line 287
    .line 288
    move/from16 p2, v8

    .line 289
    .line 290
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 291
    .line 292
    invoke-static {v8, v4, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    const/16 v3, 0x8

    .line 296
    .line 297
    invoke-static {v1, v2, v4, v3}, Lwb/ho;->C0(Lj8/i;Lfg/l;Li0/h0;I)V

    .line 298
    .line 299
    .line 300
    float-to-double v2, v12

    .line 301
    const-wide/16 v16, 0x0

    .line 302
    .line 303
    cmpl-double v2, v2, v16

    .line 304
    .line 305
    if-lez v2, :cond_6

    .line 306
    .line 307
    :goto_4
    move/from16 v16, v15

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_6
    const-string v2, "invalid weight; must be greater than zero"

    .line 311
    .line 312
    invoke-static {v2}, Lq/a;->a(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    goto :goto_4

    .line 316
    :goto_5
    new-instance v15, Lp/q0;

    .line 317
    .line 318
    invoke-direct {v15, v12, v6}, Lp/q0;-><init>(FZ)V

    .line 319
    .line 320
    .line 321
    const/16 v19, 0x0

    .line 322
    .line 323
    const/16 v20, 0xe

    .line 324
    .line 325
    const/16 v17, 0x0

    .line 326
    .line 327
    const/16 v18, 0x0

    .line 328
    .line 329
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    sget-object v3, Lp/j;->c:Lp/e;

    .line 334
    .line 335
    sget-object v12, Ly0/b;->s:Ly0/e;

    .line 336
    .line 337
    invoke-static {v3, v12, v4, v7}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    iget-wide v6, v4, Li0/h0;->T:J

    .line 342
    .line 343
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    invoke-static {v4, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 356
    .line 357
    .line 358
    iget-boolean v15, v4, Li0/h0;->S:Z

    .line 359
    .line 360
    if-eqz v15, :cond_7

    .line 361
    .line 362
    invoke-virtual {v4, v13}, Li0/h0;->k(Lfg/a;)V

    .line 363
    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_7
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 367
    .line 368
    .line 369
    :goto_6
    invoke-static {v14, v4, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v5, v4, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v6, v4, v10, v4, v9}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 376
    .line 377
    .line 378
    invoke-static {v8, v4, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    iget-object v2, v1, Lj8/i;->c:Ljava/lang/String;

    .line 382
    .line 383
    iget-object v3, v1, Lj8/i;->g:Ljava/util/List;

    .line 384
    .line 385
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    if-eqz v5, :cond_8

    .line 390
    .line 391
    invoke-virtual {v1}, Lj8/i;->b()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    :cond_8
    sget-object v5, Lbi/d;->a:Li0/m2;

    .line 396
    .line 397
    invoke-virtual {v4, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    check-cast v6, Lbi/b;

    .line 402
    .line 403
    invoke-virtual {v6}, Lbi/b;->g()J

    .line 404
    .line 405
    .line 406
    move-result-wide v6

    .line 407
    sget-object v10, Lm2/k;->j:Lm2/k;

    .line 408
    .line 409
    invoke-static/range {p2 .. p2}, Lx6/d;->D(I)J

    .line 410
    .line 411
    .line 412
    move-result-wide v8

    .line 413
    const/16 v25, 0x6180

    .line 414
    .line 415
    const v26, 0x3afaa

    .line 416
    .line 417
    .line 418
    move-object v13, v5

    .line 419
    const/4 v5, 0x0

    .line 420
    move-object v14, v11

    .line 421
    const/4 v11, 0x0

    .line 422
    move-object v15, v13

    .line 423
    const/16 v16, 0x0

    .line 424
    .line 425
    const-wide/16 v12, 0x0

    .line 426
    .line 427
    move-object/from16 v17, v14

    .line 428
    .line 429
    const/4 v14, 0x0

    .line 430
    move-object/from16 v18, v15

    .line 431
    .line 432
    move/from16 v19, v16

    .line 433
    .line 434
    const-wide/16 v15, 0x0

    .line 435
    .line 436
    move-object/from16 v20, v17

    .line 437
    .line 438
    const/16 v17, 0x2

    .line 439
    .line 440
    move-object/from16 v21, v18

    .line 441
    .line 442
    const/16 v18, 0x0

    .line 443
    .line 444
    move/from16 v22, v19

    .line 445
    .line 446
    const/16 v19, 0x2

    .line 447
    .line 448
    move-object/from16 v23, v20

    .line 449
    .line 450
    const/16 v20, 0x0

    .line 451
    .line 452
    move-object/from16 v24, v21

    .line 453
    .line 454
    const/16 v21, 0x0

    .line 455
    .line 456
    move/from16 v27, v22

    .line 457
    .line 458
    const/16 v22, 0x0

    .line 459
    .line 460
    move-object/from16 v28, v24

    .line 461
    .line 462
    const v24, 0x186000

    .line 463
    .line 464
    .line 465
    move-object/from16 v29, v23

    .line 466
    .line 467
    move-object/from16 v23, v4

    .line 468
    .line 469
    move-object v4, v2

    .line 470
    move-object/from16 v2, v28

    .line 471
    .line 472
    move-object/from16 v28, v1

    .line 473
    .line 474
    move/from16 v1, v27

    .line 475
    .line 476
    const/16 v27, 0xc

    .line 477
    .line 478
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 479
    .line 480
    .line 481
    move-object/from16 v4, v23

    .line 482
    .line 483
    invoke-virtual/range {v28 .. v28}, Lj8/i;->a()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    invoke-virtual {v4, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    check-cast v6, Lbi/b;

    .line 492
    .line 493
    invoke-virtual {v6}, Lbi/b;->h()J

    .line 494
    .line 495
    .line 496
    move-result-wide v6

    .line 497
    invoke-static/range {v27 .. v27}, Lx6/d;->D(I)J

    .line 498
    .line 499
    .line 500
    move-result-wide v8

    .line 501
    const/4 v10, 0x3

    .line 502
    int-to-float v13, v10

    .line 503
    const/4 v15, 0x0

    .line 504
    const/16 v16, 0xd

    .line 505
    .line 506
    const/4 v12, 0x0

    .line 507
    const/4 v14, 0x0

    .line 508
    move-object/from16 v11, v29

    .line 509
    .line 510
    invoke-static/range {v11 .. v16}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    move/from16 v28, v13

    .line 515
    .line 516
    const v26, 0x3afe8

    .line 517
    .line 518
    .line 519
    move-object v4, v5

    .line 520
    move-object v5, v10

    .line 521
    const/4 v10, 0x0

    .line 522
    const/4 v11, 0x0

    .line 523
    const-wide/16 v12, 0x0

    .line 524
    .line 525
    const/4 v14, 0x0

    .line 526
    const-wide/16 v15, 0x0

    .line 527
    .line 528
    const/16 v24, 0x6030

    .line 529
    .line 530
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 531
    .line 532
    .line 533
    move-object/from16 v4, v23

    .line 534
    .line 535
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 536
    .line 537
    .line 538
    move-result v5

    .line 539
    if-nez v5, :cond_9

    .line 540
    .line 541
    const v5, -0x1b7d7630

    .line 542
    .line 543
    .line 544
    invoke-virtual {v4, v5}, Li0/h0;->a0(I)V

    .line 545
    .line 546
    .line 547
    const/4 v9, 0x0

    .line 548
    const/16 v10, 0x3e

    .line 549
    .line 550
    const-string v6, " / "

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const/4 v8, 0x0

    .line 554
    move-object v5, v3

    .line 555
    invoke-static/range {v5 .. v10}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    const-string v5, "\u6807\u7b7e \u00b7 "

    .line 560
    .line 561
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    invoke-virtual {v4, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    check-cast v2, Lbi/b;

    .line 570
    .line 571
    invoke-virtual {v2}, Lbi/b;->j()J

    .line 572
    .line 573
    .line 574
    move-result-wide v6

    .line 575
    invoke-static/range {v27 .. v27}, Lx6/d;->D(I)J

    .line 576
    .line 577
    .line 578
    move-result-wide v8

    .line 579
    const/4 v15, 0x0

    .line 580
    const/16 v16, 0xd

    .line 581
    .line 582
    const/4 v12, 0x0

    .line 583
    const/4 v14, 0x0

    .line 584
    move/from16 v13, v28

    .line 585
    .line 586
    move-object/from16 v11, v29

    .line 587
    .line 588
    invoke-static/range {v11 .. v16}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    const/16 v25, 0x6180

    .line 593
    .line 594
    const v26, 0x3afe8

    .line 595
    .line 596
    .line 597
    const/4 v10, 0x0

    .line 598
    const/4 v11, 0x0

    .line 599
    const-wide/16 v12, 0x0

    .line 600
    .line 601
    const/4 v14, 0x0

    .line 602
    const-wide/16 v15, 0x0

    .line 603
    .line 604
    const/16 v17, 0x2

    .line 605
    .line 606
    const/16 v18, 0x0

    .line 607
    .line 608
    const/16 v19, 0x1

    .line 609
    .line 610
    const/16 v20, 0x0

    .line 611
    .line 612
    const/16 v21, 0x0

    .line 613
    .line 614
    const/16 v22, 0x0

    .line 615
    .line 616
    const/16 v24, 0x6030

    .line 617
    .line 618
    move-object/from16 v23, v4

    .line 619
    .line 620
    move-object v4, v3

    .line 621
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 622
    .line 623
    .line 624
    move-object/from16 v4, v23

    .line 625
    .line 626
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 627
    .line 628
    .line 629
    :goto_7
    const/4 v2, 0x1

    .line 630
    goto :goto_8

    .line 631
    :cond_9
    const v2, -0x1b77d643

    .line 632
    .line 633
    .line 634
    invoke-virtual {v4, v2}, Li0/h0;->a0(I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v4, v1}, Li0/h0;->p(Z)V

    .line 638
    .line 639
    .line 640
    goto :goto_7

    .line 641
    :goto_8
    invoke-virtual {v4, v2}, Li0/h0;->p(Z)V

    .line 642
    .line 643
    .line 644
    iget-boolean v3, v0, Lwb/ph;->h:Z

    .line 645
    .line 646
    iget-boolean v5, v0, Lwb/ph;->i:Z

    .line 647
    .line 648
    invoke-static {v3, v5, v4, v1}, Lwb/ho;->B3(ZZLi0/h0;I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v4, v2}, Li0/h0;->p(Z)V

    .line 652
    .line 653
    .line 654
    goto :goto_9

    .line 655
    :cond_a
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 656
    .line 657
    .line 658
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 659
    .line 660
    return-object v1

    .line 661
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
