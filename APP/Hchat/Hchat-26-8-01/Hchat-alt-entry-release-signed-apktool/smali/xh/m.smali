.class public final synthetic Lxh/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Lqg/t;

.field public final synthetic i:Li/c;

.field public final synthetic j:Li/c;

.field public final synthetic k:Li/c;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Lsh/d0;

.field public final synthetic n:F

.field public final synthetic o:Lsh/y;

.field public final synthetic p:Lsh/g0;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Ls0/d;


# direct methods
.method public synthetic constructor <init>(ZLqg/t;Li/c;Li/c;Li/c;Li0/a1;Lsh/d0;FLsh/y;Lsh/g0;Li0/a1;Li0/a1;Li0/a1;Ls0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lxh/m;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lxh/m;->h:Lqg/t;

    .line 7
    .line 8
    iput-object p3, p0, Lxh/m;->i:Li/c;

    .line 9
    .line 10
    iput-object p4, p0, Lxh/m;->j:Li/c;

    .line 11
    .line 12
    iput-object p5, p0, Lxh/m;->k:Li/c;

    .line 13
    .line 14
    iput-object p6, p0, Lxh/m;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lxh/m;->m:Lsh/d0;

    .line 17
    .line 18
    iput p8, p0, Lxh/m;->n:F

    .line 19
    .line 20
    iput-object p9, p0, Lxh/m;->o:Lsh/y;

    .line 21
    .line 22
    iput-object p10, p0, Lxh/m;->p:Lsh/g0;

    .line 23
    .line 24
    iput-object p11, p0, Lxh/m;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lxh/m;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lxh/m;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lxh/m;->t:Ls0/d;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, Li0/h0;

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
    const/4 v8, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v13

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v8

    .line 25
    :goto_0
    and-int/2addr v1, v13

    .line 26
    invoke-virtual {v5, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sget-object v14, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    if-eqz v1, :cond_15

    .line 33
    .line 34
    invoke-static {v5}, La/a;->I0(Li0/h0;)Ls3/e;

    .line 35
    .line 36
    .line 37
    move-result-object v16

    .line 38
    iget-object v1, v0, Lxh/m;->h:Lqg/t;

    .line 39
    .line 40
    invoke-virtual {v5, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, v0, Lxh/m;->i:Li/c;

    .line 45
    .line 46
    invoke-virtual {v5, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    or-int/2addr v2, v4

    .line 51
    iget-object v4, v0, Lxh/m;->j:Li/c;

    .line 52
    .line 53
    invoke-virtual {v5, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    or-int/2addr v2, v6

    .line 58
    iget-object v6, v0, Lxh/m;->k:Li/c;

    .line 59
    .line 60
    invoke-virtual {v5, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    or-int/2addr v2, v7

    .line 65
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    sget-object v9, Li0/l;->a:Li0/e;

    .line 70
    .line 71
    if-nez v2, :cond_2

    .line 72
    .line 73
    if-ne v7, v9, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move-object v10, v3

    .line 77
    move-object v11, v4

    .line 78
    move-object v12, v6

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    :goto_1
    new-instance v17, Lxa/f;

    .line 81
    .line 82
    const/16 v22, 0x1

    .line 83
    .line 84
    move-object/from16 v18, v1

    .line 85
    .line 86
    move-object/from16 v19, v3

    .line 87
    .line 88
    move-object/from16 v20, v4

    .line 89
    .line 90
    move-object/from16 v21, v6

    .line 91
    .line 92
    invoke-direct/range {v17 .. v22}, Lxa/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    move-object/from16 v7, v17

    .line 96
    .line 97
    move-object/from16 v10, v19

    .line 98
    .line 99
    move-object/from16 v11, v20

    .line 100
    .line 101
    move-object/from16 v12, v21

    .line 102
    .line 103
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :goto_2
    move-object v3, v7

    .line 107
    check-cast v3, Lfg/a;

    .line 108
    .line 109
    iget-object v15, v0, Lxh/m;->l:Li0/a1;

    .line 110
    .line 111
    invoke-virtual {v5, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-nez v1, :cond_3

    .line 120
    .line 121
    if-ne v2, v9, :cond_4

    .line 122
    .line 123
    :cond_3
    new-instance v2, Lwb/ht;

    .line 124
    .line 125
    const/4 v1, 0x3

    .line 126
    invoke-direct {v2, v15, v1}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    move-object v4, v2

    .line 133
    check-cast v4, Lfg/a;

    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    iget-boolean v2, v0, Lxh/m;->g:Z

    .line 138
    .line 139
    move-object/from16 v1, v16

    .line 140
    .line 141
    invoke-static/range {v1 .. v7}, Lx6/d;->d(Ls3/e;ZLfg/a;Lfg/a;Li0/h0;II)V

    .line 142
    .line 143
    .line 144
    iget-object v2, v1, Ls3/e;->a:Li0/j1;

    .line 145
    .line 146
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Lr3/e;

    .line 151
    .line 152
    invoke-virtual {v5, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    invoke-virtual {v5, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    or-int/2addr v3, v4

    .line 161
    invoke-virtual {v5, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    or-int/2addr v3, v4

    .line 166
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    const/16 v19, 0x0

    .line 171
    .line 172
    if-nez v3, :cond_5

    .line 173
    .line 174
    if-ne v4, v9, :cond_6

    .line 175
    .line 176
    :cond_5
    move-object v3, v15

    .line 177
    goto :goto_3

    .line 178
    :cond_6
    move-object v3, v15

    .line 179
    move-object/from16 v1, v19

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :goto_3
    new-instance v15, Lc0/m;

    .line 183
    .line 184
    const/16 v20, 0x17

    .line 185
    .line 186
    move-object/from16 v16, v1

    .line 187
    .line 188
    move-object/from16 v17, v10

    .line 189
    .line 190
    move-object/from16 v18, v11

    .line 191
    .line 192
    invoke-direct/range {v15 .. v20}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v1, v19

    .line 196
    .line 197
    invoke-virtual {v5, v15}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    move-object v4, v15

    .line 201
    :goto_4
    check-cast v4, Lfg/p;

    .line 202
    .line 203
    invoke-static {v4, v5, v2}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    sget-object v2, Lp/h1;->c:Lp/a0;

    .line 207
    .line 208
    sget-object v4, Ly0/b;->g:Ly0/g;

    .line 209
    .line 210
    invoke-static {v4, v8}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    move-object/from16 p2, v14

    .line 215
    .line 216
    iget-wide v13, v5, Li0/h0;->T:J

    .line 217
    .line 218
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    invoke-virtual {v5}, Li0/h0;->l()Ls0/h;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    invoke-static {v5, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    sget-object v15, Lx1/g;->f:Lx1/f;

    .line 231
    .line 232
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    sget-object v15, Lx1/f;->b:Lx1/y;

    .line 236
    .line 237
    invoke-virtual {v5}, Li0/h0;->d0()V

    .line 238
    .line 239
    .line 240
    iget-boolean v1, v5, Li0/h0;->S:Z

    .line 241
    .line 242
    if-eqz v1, :cond_7

    .line 243
    .line 244
    invoke-virtual {v5, v15}, Li0/h0;->k(Lfg/a;)V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_7
    invoke-virtual {v5}, Li0/h0;->n0()V

    .line 249
    .line 250
    .line 251
    :goto_5
    sget-object v1, Lx1/f;->e:Lx1/e;

    .line 252
    .line 253
    invoke-static {v1, v5, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    sget-object v6, Lx1/f;->d:Lx1/e;

    .line 257
    .line 258
    invoke-static {v6, v5, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    sget-object v13, Lx1/f;->f:Lx1/e;

    .line 266
    .line 267
    invoke-static {v5, v7, v13}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 268
    .line 269
    .line 270
    sget-object v7, Lx1/f;->g:Lx1/d;

    .line 271
    .line 272
    invoke-static {v7, v5}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 273
    .line 274
    .line 275
    sget-object v8, Lx1/f;->c:Lx1/e;

    .line 276
    .line 277
    invoke-static {v8, v5, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    const v14, -0x3ddc113e

    .line 281
    .line 282
    .line 283
    invoke-virtual {v5, v14}, Li0/h0;->a0(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v14

    .line 290
    move/from16 v17, v14

    .line 291
    .line 292
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    if-nez v17, :cond_9

    .line 297
    .line 298
    if-ne v14, v9, :cond_8

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_8
    move-object/from16 v20, v11

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_9
    :goto_6
    new-instance v14, Lxh/a;

    .line 305
    .line 306
    move-object/from16 v20, v11

    .line 307
    .line 308
    const/4 v11, 0x1

    .line 309
    invoke-direct {v14, v12, v11}, Lxh/a;-><init>(Li/c;I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :goto_7
    check-cast v14, Lfg/l;

    .line 316
    .line 317
    invoke-static {v2, v14}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    sget-object v12, Lbi/d;->a:Li0/m2;

    .line 322
    .line 323
    invoke-virtual {v5, v12}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    check-cast v12, Lbi/b;

    .line 328
    .line 329
    move-object v14, v7

    .line 330
    move-object/from16 v17, v8

    .line 331
    .line 332
    invoke-virtual {v12}, Lbi/b;->o()J

    .line 333
    .line 334
    .line 335
    move-result-wide v7

    .line 336
    sget-object v12, Lf1/c0;->b:Lf1/m0;

    .line 337
    .line 338
    invoke-static {v11, v7, v8, v12}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    const/4 v8, 0x0

    .line 343
    invoke-static {v7, v5, v8}, Lp/o;->a(Ly0/o;Li0/h0;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v5, v8}, Li0/h0;->p(Z)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    iget-object v8, v0, Lxh/m;->q:Li0/a1;

    .line 354
    .line 355
    if-ne v7, v9, :cond_a

    .line 356
    .line 357
    new-instance v7, Lxh/n;

    .line 358
    .line 359
    const/4 v11, 0x0

    .line 360
    invoke-direct {v7, v8, v11}, Lxh/n;-><init>(Li0/a1;I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_a
    check-cast v7, Lfg/l;

    .line 367
    .line 368
    invoke-static {v2, v7}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v5, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v7

    .line 376
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v11

    .line 380
    if-nez v7, :cond_b

    .line 381
    .line 382
    if-ne v11, v9, :cond_c

    .line 383
    .line 384
    :cond_b
    new-instance v11, Lxh/g;

    .line 385
    .line 386
    const/4 v7, 0x1

    .line 387
    invoke-direct {v11, v3, v7}, Lxh/g;-><init>(Li0/a1;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v5, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    :cond_c
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 394
    .line 395
    move-object/from16 v7, p2

    .line 396
    .line 397
    invoke-static {v2, v7, v11}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    iget-object v11, v0, Lxh/m;->m:Lsh/d0;

    .line 402
    .line 403
    invoke-virtual {v5, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v12

    .line 407
    const/4 v7, 0x0

    .line 408
    invoke-virtual {v5, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v7

    .line 412
    or-int/2addr v7, v12

    .line 413
    iget v12, v0, Lxh/m;->n:F

    .line 414
    .line 415
    invoke-virtual {v5, v12}, Li0/h0;->c(F)Z

    .line 416
    .line 417
    .line 418
    move-result v18

    .line 419
    or-int v7, v7, v18

    .line 420
    .line 421
    move/from16 v18, v7

    .line 422
    .line 423
    iget-object v7, v0, Lxh/m;->o:Lsh/y;

    .line 424
    .line 425
    invoke-virtual {v5, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v19

    .line 429
    or-int v18, v18, v19

    .line 430
    .line 431
    move-object/from16 v24, v7

    .line 432
    .line 433
    iget-object v7, v0, Lxh/m;->p:Lsh/g0;

    .line 434
    .line 435
    move-object/from16 v25, v7

    .line 436
    .line 437
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Enum;->ordinal()I

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    invoke-virtual {v5, v7}, Li0/h0;->d(I)Z

    .line 442
    .line 443
    .line 444
    move-result v7

    .line 445
    or-int v7, v18, v7

    .line 446
    .line 447
    move/from16 v18, v7

    .line 448
    .line 449
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    if-nez v18, :cond_e

    .line 454
    .line 455
    if-ne v7, v9, :cond_d

    .line 456
    .line 457
    goto :goto_8

    .line 458
    :cond_d
    move-object v8, v11

    .line 459
    goto :goto_9

    .line 460
    :cond_e
    :goto_8
    new-instance v21, Lxh/o;

    .line 461
    .line 462
    iget-object v7, v0, Lxh/m;->r:Li0/a1;

    .line 463
    .line 464
    move-object/from16 v26, v7

    .line 465
    .line 466
    move-object/from16 v27, v8

    .line 467
    .line 468
    move-object/from16 v22, v11

    .line 469
    .line 470
    move/from16 v23, v12

    .line 471
    .line 472
    invoke-direct/range {v21 .. v27}, Lxh/o;-><init>(Lsh/d0;FLsh/y;Lsh/g0;Li0/a1;Li0/a1;)V

    .line 473
    .line 474
    .line 475
    move-object/from16 v7, v21

    .line 476
    .line 477
    move-object/from16 v8, v22

    .line 478
    .line 479
    invoke-virtual {v5, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    :goto_9
    check-cast v7, Lfg/q;

    .line 483
    .line 484
    invoke-static {v2, v7}, Lv1/w;->k(Ly0/o;Lfg/q;)Ly0/o;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    const/4 v7, 0x0

    .line 489
    invoke-static {v4, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    iget-wide v11, v5, Li0/h0;->T:J

    .line 494
    .line 495
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    invoke-virtual {v5}, Li0/h0;->l()Ls0/h;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    invoke-static {v5, v2}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    invoke-virtual {v5}, Li0/h0;->d0()V

    .line 508
    .line 509
    .line 510
    iget-boolean v12, v5, Li0/h0;->S:Z

    .line 511
    .line 512
    if-eqz v12, :cond_f

    .line 513
    .line 514
    invoke-virtual {v5, v15}, Li0/h0;->k(Lfg/a;)V

    .line 515
    .line 516
    .line 517
    goto :goto_a

    .line 518
    :cond_f
    invoke-virtual {v5}, Li0/h0;->n0()V

    .line 519
    .line 520
    .line 521
    :goto_a
    invoke-static {v1, v5, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    invoke-static {v6, v5, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-static {v5, v1, v13}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 532
    .line 533
    .line 534
    invoke-static {v14, v5}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 535
    .line 536
    .line 537
    move-object/from16 v1, v17

    .line 538
    .line 539
    invoke-static {v1, v5, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, Lxh/m;->s:Li0/a1;

    .line 543
    .line 544
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    check-cast v2, Lu2/l;

    .line 549
    .line 550
    iget-wide v6, v2, Lu2/l;->a:J

    .line 551
    .line 552
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    if-ne v2, v9, :cond_10

    .line 557
    .line 558
    new-instance v2, Lwb/lp;

    .line 559
    .line 560
    const/16 v4, 0x1c

    .line 561
    .line 562
    invoke-direct {v2, v1, v4}, Lwb/lp;-><init>(Li0/a1;I)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    :cond_10
    check-cast v2, Lfg/l;

    .line 569
    .line 570
    invoke-virtual {v5, v10}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    if-nez v1, :cond_11

    .line 579
    .line 580
    if-ne v4, v9, :cond_12

    .line 581
    .line 582
    :cond_11
    new-instance v4, Lxh/k;

    .line 583
    .line 584
    const/4 v1, 0x0

    .line 585
    invoke-direct {v4, v10, v1}, Lxh/k;-><init>(Li/c;I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    :cond_12
    check-cast v4, Lfg/a;

    .line 592
    .line 593
    move-object/from16 v11, v20

    .line 594
    .line 595
    invoke-virtual {v5, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v10

    .line 603
    if-nez v1, :cond_13

    .line 604
    .line 605
    if-ne v10, v9, :cond_14

    .line 606
    .line 607
    :cond_13
    new-instance v10, Lxh/k;

    .line 608
    .line 609
    const/4 v1, 0x1

    .line 610
    invoke-direct {v10, v11, v1}, Lxh/k;-><init>(Li/c;I)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v5, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    :cond_14
    check-cast v10, Lfg/a;

    .line 617
    .line 618
    move-wide/from16 v28, v6

    .line 619
    .line 620
    move-object v7, v2

    .line 621
    move-wide/from16 v1, v28

    .line 622
    .line 623
    iget-object v6, v8, Lsh/d0;->e:Lsh/f0;

    .line 624
    .line 625
    iget-wide v8, v8, Lsh/d0;->d:J

    .line 626
    .line 627
    new-instance v11, Lxh/l;

    .line 628
    .line 629
    const/4 v12, 0x0

    .line 630
    iget-object v13, v0, Lxh/m;->t:Ls0/d;

    .line 631
    .line 632
    invoke-direct {v11, v3, v13, v12}, Lxh/l;-><init>(Li0/a1;Ls0/d;I)V

    .line 633
    .line 634
    .line 635
    const v3, 0x7435c31c

    .line 636
    .line 637
    .line 638
    invoke-static {v3, v11, v5}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    const v12, 0xc00030

    .line 643
    .line 644
    .line 645
    move-object v11, v5

    .line 646
    move-object v5, v10

    .line 647
    move-object v10, v3

    .line 648
    move-object v3, v7

    .line 649
    move-wide v7, v8

    .line 650
    const/4 v9, 0x0

    .line 651
    move-object/from16 v13, p2

    .line 652
    .line 653
    invoke-static/range {v1 .. v12}, Lsh/s;->h(JLfg/l;Lfg/a;Lfg/a;Lsh/f0;JLy0/o;Ls0/d;Li0/h0;I)V

    .line 654
    .line 655
    .line 656
    move-object v5, v11

    .line 657
    const/4 v1, 0x1

    .line 658
    invoke-virtual {v5, v1}, Li0/h0;->p(Z)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v5, v1}, Li0/h0;->p(Z)V

    .line 662
    .line 663
    .line 664
    return-object v13

    .line 665
    :cond_15
    move-object v13, v14

    .line 666
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 667
    .line 668
    .line 669
    return-object v13
.end method
