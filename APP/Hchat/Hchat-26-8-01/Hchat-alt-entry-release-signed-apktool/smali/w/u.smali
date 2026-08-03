.class public final synthetic Lw/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/a;ZLandroid/app/Activity;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lw/u;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lw/u;->h:I

    .line 8
    .line 9
    iput-object p2, p0, Lw/u;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lw/u;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lw/u;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lw/u;->n:Ljava/lang/Object;

    .line 16
    .line 17
    iput-boolean p6, p0, Lw/u;->i:Z

    .line 18
    .line 19
    iput-object p7, p0, Lw/u;->o:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p8, p0, Lw/u;->j:Lfg/l;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Lh0/d1;Lw/q0;ZLfg/l;Ln2/s;Lb5/k;Lu2/c;I)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lw/u;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/u;->k:Ljava/lang/Object;

    iput-object p2, p0, Lw/u;->l:Ljava/lang/Object;

    iput-boolean p3, p0, Lw/u;->i:Z

    iput-object p4, p0, Lw/u;->j:Lfg/l;

    iput-object p5, p0, Lw/u;->m:Ljava/lang/Object;

    iput-object p6, p0, Lw/u;->n:Ljava/lang/Object;

    iput-object p7, p0, Lw/u;->o:Ljava/lang/Object;

    iput p8, p0, Lw/u;->h:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;IZLfg/a;Lfg/a;Lsh/t;Ln1/a;Lfg/l;I)V
    .locals 0

    .line 25
    const/4 p9, 0x2

    iput p9, p0, Lw/u;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/u;->k:Ljava/lang/Object;

    iput p2, p0, Lw/u;->h:I

    iput-boolean p3, p0, Lw/u;->i:Z

    iput-object p4, p0, Lw/u;->l:Ljava/lang/Object;

    iput-object p5, p0, Lw/u;->m:Ljava/lang/Object;

    iput-object p6, p0, Lw/u;->n:Ljava/lang/Object;

    iput-object p7, p0, Lw/u;->o:Ljava/lang/Object;

    iput-object p8, p0, Lw/u;->j:Lfg/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 67

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/u;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lw/u;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v1, v0, Lw/u;->l:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v1

    .line 16
    check-cast v5, Lfg/a;

    .line 17
    .line 18
    iget-object v1, v0, Lw/u;->m:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v6, v1

    .line 21
    check-cast v6, Lfg/a;

    .line 22
    .line 23
    iget-object v1, v0, Lw/u;->n:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, v1

    .line 26
    check-cast v7, Lsh/t;

    .line 27
    .line 28
    iget-object v1, v0, Lw/u;->o:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v8, v1

    .line 31
    check-cast v8, Ln1/a;

    .line 32
    .line 33
    move-object/from16 v10, p1

    .line 34
    .line 35
    check-cast v10, Li0/h0;

    .line 36
    .line 37
    move-object/from16 v1, p2

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x6c01

    .line 45
    .line 46
    invoke-static {v1}, Li0/r;->C(I)I

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    iget v3, v0, Lw/u;->h:I

    .line 51
    .line 52
    iget-boolean v4, v0, Lw/u;->i:Z

    .line 53
    .line 54
    iget-object v9, v0, Lw/u;->j:Lfg/l;

    .line 55
    .line 56
    invoke-static/range {v2 .. v11}, Lr9/e0;->g(Ljava/util/ArrayList;IZLfg/a;Lfg/a;Lsh/t;Ln1/a;Lfg/l;Li0/h0;I)V

    .line 57
    .line 58
    .line 59
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_0
    iget-object v1, v0, Lw/u;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v2, v0, Lw/u;->l:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v3, v2

    .line 69
    check-cast v3, Ljava/lang/String;

    .line 70
    .line 71
    iget-object v2, v0, Lw/u;->m:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v4, v0, Lw/u;->n:Ljava/lang/Object;

    .line 76
    .line 77
    move-object/from16 v27, v4

    .line 78
    .line 79
    check-cast v27, Lfg/a;

    .line 80
    .line 81
    iget-object v4, v0, Lw/u;->o:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v8, v4

    .line 84
    check-cast v8, Landroid/app/Activity;

    .line 85
    .line 86
    move-object/from16 v14, p1

    .line 87
    .line 88
    check-cast v14, Li0/h0;

    .line 89
    .line 90
    move-object/from16 v4, p2

    .line 91
    .line 92
    check-cast v4, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    and-int/lit8 v5, v4, 0x3

    .line 99
    .line 100
    const/4 v6, 0x2

    .line 101
    const/4 v9, 0x1

    .line 102
    if-eq v5, v6, :cond_0

    .line 103
    .line 104
    move v5, v9

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    const/4 v5, 0x0

    .line 107
    :goto_0
    and-int/2addr v4, v9

    .line 108
    invoke-virtual {v14, v4, v5}, Li0/h0;->S(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 113
    .line 114
    if-eqz v4, :cond_17

    .line 115
    .line 116
    iget v4, v0, Lw/u;->h:I

    .line 117
    .line 118
    if-ge v4, v9, :cond_1

    .line 119
    .line 120
    move v4, v9

    .line 121
    :cond_1
    invoke-virtual {v14, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    invoke-virtual {v14, v4}, Li0/h0;->d(I)Z

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    or-int/2addr v6, v10

    .line 130
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    sget-object v11, Li0/l;->a:Li0/e;

    .line 135
    .line 136
    if-nez v6, :cond_2

    .line 137
    .line 138
    if-ne v10, v11, :cond_3

    .line 139
    .line 140
    :cond_2
    invoke-static {v4, v1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v14, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_3
    check-cast v10, Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v14, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    const/4 v12, 0x4

    .line 158
    if-nez v1, :cond_5

    .line 159
    .line 160
    if-ne v6, v11, :cond_4

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    move-object v13, v8

    .line 164
    goto :goto_2

    .line 165
    :cond_5
    :goto_1
    new-instance v1, Ln2/s;

    .line 166
    .line 167
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    move-object v13, v8

    .line 172
    invoke-static {v6, v6}, Li2/e0;->b(II)J

    .line 173
    .line 174
    .line 175
    move-result-wide v7

    .line 176
    invoke-direct {v1, v12, v10, v7, v8}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 177
    .line 178
    .line 179
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v14, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :goto_2
    move-object v1, v6

    .line 187
    check-cast v1, Li0/a1;

    .line 188
    .line 189
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    if-ne v6, v11, :cond_6

    .line 194
    .line 195
    const-string v6, ""

    .line 196
    .line 197
    invoke-static {v6}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v14, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_6
    move-object v10, v6

    .line 205
    check-cast v10, Li0/a1;

    .line 206
    .line 207
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    if-ne v6, v11, :cond_7

    .line 212
    .line 213
    new-instance v6, Ld1/v;

    .line 214
    .line 215
    invoke-direct {v6}, Ld1/v;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v14, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :cond_7
    check-cast v6, Ld1/v;

    .line 222
    .line 223
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    if-ne v7, v11, :cond_8

    .line 228
    .line 229
    new-instance v7, Lwb/eo;

    .line 230
    .line 231
    const/4 v8, 0x2

    .line 232
    const/4 v15, 0x0

    .line 233
    invoke-direct {v7, v6, v15, v8}, Lwb/eo;-><init>(Ld1/v;Lwf/c;I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v14, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    check-cast v7, Lfg/p;

    .line 240
    .line 241
    invoke-static {v7, v14, v5}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    sget-object v15, Ly0/l;->a:Ly0/l;

    .line 245
    .line 246
    const/high16 v7, 0x3f800000    # 1.0f

    .line 247
    .line 248
    invoke-static {v15, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    sget-object v7, Lp/j;->c:Lp/e;

    .line 253
    .line 254
    sget-object v9, Ly0/b;->s:Ly0/e;

    .line 255
    .line 256
    const/4 v12, 0x0

    .line 257
    invoke-static {v7, v9, v14, v12}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    move-object/from16 p1, v13

    .line 262
    .line 263
    iget-wide v12, v14, Li0/h0;->T:J

    .line 264
    .line 265
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    invoke-virtual {v14}, Li0/h0;->l()Ls0/h;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    invoke-static {v14, v8}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    sget-object v17, Lx1/g;->f:Lx1/f;

    .line 278
    .line 279
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    sget-object v9, Lx1/f;->b:Lx1/y;

    .line 283
    .line 284
    invoke-virtual {v14}, Li0/h0;->d0()V

    .line 285
    .line 286
    .line 287
    move-object/from16 v26, v2

    .line 288
    .line 289
    iget-boolean v2, v14, Li0/h0;->S:Z

    .line 290
    .line 291
    if-eqz v2, :cond_9

    .line 292
    .line 293
    invoke-virtual {v14, v9}, Li0/h0;->k(Lfg/a;)V

    .line 294
    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_9
    invoke-virtual {v14}, Li0/h0;->n0()V

    .line 298
    .line 299
    .line 300
    :goto_3
    sget-object v2, Lx1/f;->e:Lx1/e;

    .line 301
    .line 302
    invoke-static {v2, v14, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    sget-object v7, Lx1/f;->d:Lx1/e;

    .line 306
    .line 307
    invoke-static {v7, v14, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    sget-object v13, Lx1/f;->f:Lx1/e;

    .line 315
    .line 316
    invoke-static {v13, v14, v12}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    sget-object v12, Lx1/f;->g:Lx1/d;

    .line 320
    .line 321
    invoke-static {v12, v14}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 322
    .line 323
    .line 324
    move-object/from16 v23, v9

    .line 325
    .line 326
    sget-object v9, Lx1/f;->c:Lx1/e;

    .line 327
    .line 328
    invoke-static {v9, v14, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    move-object/from16 v24, v9

    .line 336
    .line 337
    const/16 v9, 0xa

    .line 338
    .line 339
    if-nez v8, :cond_a

    .line 340
    .line 341
    const v8, 0x11074b4c

    .line 342
    .line 343
    .line 344
    invoke-virtual {v14, v8}, Li0/h0;->a0(I)V

    .line 345
    .line 346
    .line 347
    sget-object v8, Lbi/d;->a:Li0/m2;

    .line 348
    .line 349
    invoke-virtual {v14, v8}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    check-cast v8, Lbi/b;

    .line 354
    .line 355
    invoke-virtual {v8}, Lbi/b;->h()J

    .line 356
    .line 357
    .line 358
    move-result-wide v28

    .line 359
    const/16 v8, 0xd

    .line 360
    .line 361
    invoke-static {v8}, Lx6/d;->D(I)J

    .line 362
    .line 363
    .line 364
    move-result-wide v30

    .line 365
    const/4 v8, 0x4

    .line 366
    int-to-float v8, v8

    .line 367
    move-object/from16 v25, v3

    .line 368
    .line 369
    int-to-float v3, v9

    .line 370
    const/16 v20, 0x6

    .line 371
    .line 372
    const/16 v17, 0x0

    .line 373
    .line 374
    const/16 v18, 0x0

    .line 375
    .line 376
    move/from16 v19, v3

    .line 377
    .line 378
    move/from16 v16, v8

    .line 379
    .line 380
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    move-object/from16 v8, v24

    .line 385
    .line 386
    const/16 v24, 0x0

    .line 387
    .line 388
    move/from16 v16, v4

    .line 389
    .line 390
    move-object v4, v3

    .line 391
    move-object/from16 v3, v25

    .line 392
    .line 393
    const v25, 0x3ffe8

    .line 394
    .line 395
    .line 396
    move/from16 v17, v9

    .line 397
    .line 398
    const/4 v9, 0x0

    .line 399
    move-object/from16 v18, v10

    .line 400
    .line 401
    const/4 v10, 0x0

    .line 402
    move-object/from16 v20, v11

    .line 403
    .line 404
    move-object/from16 v19, v12

    .line 405
    .line 406
    const-wide/16 v11, 0x0

    .line 407
    .line 408
    move-object/from16 v32, v13

    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    move-object/from16 v47, v14

    .line 412
    .line 413
    move-object/from16 v33, v15

    .line 414
    .line 415
    const-wide/16 v14, 0x0

    .line 416
    .line 417
    move/from16 v34, v16

    .line 418
    .line 419
    const/16 v16, 0x0

    .line 420
    .line 421
    move/from16 v35, v17

    .line 422
    .line 423
    const/16 v17, 0x0

    .line 424
    .line 425
    move-object/from16 v36, v18

    .line 426
    .line 427
    const/16 v18, 0x0

    .line 428
    .line 429
    move-object/from16 v37, v19

    .line 430
    .line 431
    const/16 v19, 0x0

    .line 432
    .line 433
    move-object/from16 v38, v20

    .line 434
    .line 435
    const/16 v20, 0x0

    .line 436
    .line 437
    const/16 v39, 0x1

    .line 438
    .line 439
    const/16 v21, 0x0

    .line 440
    .line 441
    move-object/from16 v40, v23

    .line 442
    .line 443
    const/16 v23, 0x6030

    .line 444
    .line 445
    move-object/from16 v51, p1

    .line 446
    .line 447
    move-object/from16 p1, v1

    .line 448
    .line 449
    move-object/from16 p2, v2

    .line 450
    .line 451
    move-object/from16 v57, v5

    .line 452
    .line 453
    move-object/from16 v53, v7

    .line 454
    .line 455
    move-object/from16 v56, v8

    .line 456
    .line 457
    move-wide/from16 v7, v30

    .line 458
    .line 459
    move-object/from16 v54, v32

    .line 460
    .line 461
    move-object/from16 v1, v33

    .line 462
    .line 463
    move-object/from16 v52, v36

    .line 464
    .line 465
    move-object/from16 v55, v37

    .line 466
    .line 467
    move-object/from16 v58, v38

    .line 468
    .line 469
    move-object/from16 v59, v40

    .line 470
    .line 471
    move-object/from16 v22, v47

    .line 472
    .line 473
    const/4 v0, 0x0

    .line 474
    const/high16 v2, 0x3f800000    # 1.0f

    .line 475
    .line 476
    move-wide/from16 v65, v28

    .line 477
    .line 478
    move-object/from16 v28, v6

    .line 479
    .line 480
    move-wide/from16 v5, v65

    .line 481
    .line 482
    invoke-static/range {v3 .. v25}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 483
    .line 484
    .line 485
    move-object/from16 v14, v22

    .line 486
    .line 487
    invoke-virtual {v14, v0}, Li0/h0;->p(Z)V

    .line 488
    .line 489
    .line 490
    goto :goto_4

    .line 491
    :cond_a
    move-object/from16 v51, p1

    .line 492
    .line 493
    move-object/from16 p1, v1

    .line 494
    .line 495
    move-object/from16 p2, v2

    .line 496
    .line 497
    move/from16 v34, v4

    .line 498
    .line 499
    move-object/from16 v57, v5

    .line 500
    .line 501
    move-object/from16 v28, v6

    .line 502
    .line 503
    move-object/from16 v53, v7

    .line 504
    .line 505
    move-object/from16 v52, v10

    .line 506
    .line 507
    move-object/from16 v58, v11

    .line 508
    .line 509
    move-object/from16 v55, v12

    .line 510
    .line 511
    move-object/from16 v54, v13

    .line 512
    .line 513
    move-object v1, v15

    .line 514
    move-object/from16 v59, v23

    .line 515
    .line 516
    move-object/from16 v56, v24

    .line 517
    .line 518
    const/4 v0, 0x0

    .line 519
    const/high16 v2, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const v3, 0x110c3f83

    .line 522
    .line 523
    .line 524
    invoke-virtual {v14, v3}, Li0/h0;->a0(I)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v14, v0}, Li0/h0;->p(Z)V

    .line 528
    .line 529
    .line 530
    :goto_4
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    const/16 v4, 0xc

    .line 535
    .line 536
    int-to-float v5, v4

    .line 537
    invoke-static {v5}, Lv/e;->a(F)Lv/d;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    invoke-static {v3, v6}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 546
    .line 547
    invoke-virtual {v14, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v7

    .line 551
    check-cast v7, Lbi/b;

    .line 552
    .line 553
    invoke-virtual {v7}, Lbi/b;->k()J

    .line 554
    .line 555
    .line 556
    move-result-wide v7

    .line 557
    sget-object v9, Lf1/c0;->b:Lf1/m0;

    .line 558
    .line 559
    invoke-static {v3, v7, v8, v9}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    invoke-static {v3, v5, v5}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    sget-object v5, Ly0/b;->g:Ly0/g;

    .line 568
    .line 569
    invoke-static {v5, v0}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    iget-wide v7, v14, Li0/h0;->T:J

    .line 574
    .line 575
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    invoke-virtual {v14}, Li0/h0;->l()Ls0/h;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    invoke-static {v14, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {v14}, Li0/h0;->d0()V

    .line 588
    .line 589
    .line 590
    iget-boolean v9, v14, Li0/h0;->S:Z

    .line 591
    .line 592
    if-eqz v9, :cond_b

    .line 593
    .line 594
    move-object/from16 v9, v59

    .line 595
    .line 596
    invoke-virtual {v14, v9}, Li0/h0;->k(Lfg/a;)V

    .line 597
    .line 598
    .line 599
    :goto_5
    move-object/from16 v10, p2

    .line 600
    .line 601
    goto :goto_6

    .line 602
    :cond_b
    move-object/from16 v9, v59

    .line 603
    .line 604
    invoke-virtual {v14}, Li0/h0;->n0()V

    .line 605
    .line 606
    .line 607
    goto :goto_5

    .line 608
    :goto_6
    invoke-static {v10, v14, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    move-object/from16 v5, v53

    .line 612
    .line 613
    invoke-static {v5, v14, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    move-object/from16 v8, v54

    .line 617
    .line 618
    move-object/from16 v11, v55

    .line 619
    .line 620
    invoke-static {v7, v14, v8, v14, v11}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 621
    .line 622
    .line 623
    move-object/from16 v7, v56

    .line 624
    .line 625
    invoke-static {v7, v14, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    invoke-interface/range {p1 .. p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v3

    .line 632
    check-cast v3, Ln2/s;

    .line 633
    .line 634
    iget-object v3, v3, Ln2/s;->a:Li2/g;

    .line 635
    .line 636
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 637
    .line 638
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    const/16 v29, 0x10

    .line 643
    .line 644
    if-nez v3, :cond_c

    .line 645
    .line 646
    invoke-static/range {v26 .. v26}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    if-nez v3, :cond_c

    .line 651
    .line 652
    const v3, 0x38ccffb9

    .line 653
    .line 654
    .line 655
    invoke-virtual {v14, v3}, Li0/h0;->a0(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v14, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    check-cast v3, Lbi/b;

    .line 663
    .line 664
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 665
    .line 666
    .line 667
    move-result-wide v12

    .line 668
    move-object/from16 v32, v8

    .line 669
    .line 670
    move-object/from16 v59, v9

    .line 671
    .line 672
    invoke-static/range {v29 .. v29}, Lx6/d;->D(I)J

    .line 673
    .line 674
    .line 675
    move-result-wide v8

    .line 676
    const/16 v25, 0x0

    .line 677
    .line 678
    move v3, v4

    .line 679
    move-object/from16 v4, v26

    .line 680
    .line 681
    const v26, 0x3ffea

    .line 682
    .line 683
    .line 684
    move-object/from16 v53, v5

    .line 685
    .line 686
    const/4 v5, 0x0

    .line 687
    move-object v15, v10

    .line 688
    const/4 v10, 0x0

    .line 689
    move-object/from16 v19, v11

    .line 690
    .line 691
    const/4 v11, 0x0

    .line 692
    move-object/from16 v16, v6

    .line 693
    .line 694
    move-object/from16 v24, v7

    .line 695
    .line 696
    move-wide v6, v12

    .line 697
    const-wide/16 v12, 0x0

    .line 698
    .line 699
    move-object/from16 v47, v14

    .line 700
    .line 701
    const/4 v14, 0x0

    .line 702
    move-object/from16 v17, v15

    .line 703
    .line 704
    move-object/from16 v18, v16

    .line 705
    .line 706
    const-wide/16 v15, 0x0

    .line 707
    .line 708
    move-object/from16 v20, v17

    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    move-object/from16 v21, v18

    .line 713
    .line 714
    const/16 v18, 0x0

    .line 715
    .line 716
    move-object/from16 v37, v19

    .line 717
    .line 718
    const/16 v19, 0x0

    .line 719
    .line 720
    move-object/from16 v22, v20

    .line 721
    .line 722
    const/16 v20, 0x0

    .line 723
    .line 724
    move-object/from16 v23, v21

    .line 725
    .line 726
    const/16 v21, 0x0

    .line 727
    .line 728
    move-object/from16 v30, v22

    .line 729
    .line 730
    const/16 v22, 0x0

    .line 731
    .line 732
    move-object/from16 v56, v24

    .line 733
    .line 734
    const/16 v24, 0x6000

    .line 735
    .line 736
    move-object/from16 v2, v23

    .line 737
    .line 738
    move-object/from16 v60, v30

    .line 739
    .line 740
    move-object/from16 v62, v32

    .line 741
    .line 742
    move-object/from16 v63, v37

    .line 743
    .line 744
    move-object/from16 v23, v47

    .line 745
    .line 746
    move-object/from16 v61, v53

    .line 747
    .line 748
    move-object/from16 v64, v56

    .line 749
    .line 750
    move/from16 v30, v3

    .line 751
    .line 752
    move-object/from16 v3, v59

    .line 753
    .line 754
    invoke-static/range {v4 .. v26}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 755
    .line 756
    .line 757
    move-object/from16 v14, v23

    .line 758
    .line 759
    invoke-virtual {v14, v0}, Li0/h0;->p(Z)V

    .line 760
    .line 761
    .line 762
    goto :goto_7

    .line 763
    :cond_c
    move/from16 v30, v4

    .line 764
    .line 765
    move-object/from16 v61, v5

    .line 766
    .line 767
    move-object v2, v6

    .line 768
    move-object/from16 v64, v7

    .line 769
    .line 770
    move-object/from16 v62, v8

    .line 771
    .line 772
    move-object v3, v9

    .line 773
    move-object/from16 v60, v10

    .line 774
    .line 775
    move-object/from16 v63, v11

    .line 776
    .line 777
    const v4, 0x38d174e9

    .line 778
    .line 779
    .line 780
    invoke-virtual {v14, v4}, Li0/h0;->a0(I)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v14, v0}, Li0/h0;->p(Z)V

    .line 784
    .line 785
    .line 786
    :goto_7
    invoke-interface/range {p1 .. p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    move-object v9, v4

    .line 791
    check-cast v9, Ln2/s;

    .line 792
    .line 793
    new-instance v4, Lw/p0;

    .line 794
    .line 795
    const/16 v5, 0x7b

    .line 796
    .line 797
    const/4 v6, 0x1

    .line 798
    invoke-direct {v4, v6, v5}, Lw/p0;-><init>(II)V

    .line 799
    .line 800
    .line 801
    new-instance v13, Li2/n0;

    .line 802
    .line 803
    invoke-virtual {v14, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    check-cast v5, Lbi/b;

    .line 808
    .line 809
    invoke-virtual {v5}, Lbi/b;->g()J

    .line 810
    .line 811
    .line 812
    move-result-wide v16

    .line 813
    invoke-static/range {v29 .. v29}, Lx6/d;->D(I)J

    .line 814
    .line 815
    .line 816
    move-result-wide v18

    .line 817
    const-wide/16 v24, 0x0

    .line 818
    .line 819
    const v26, 0xfffffc

    .line 820
    .line 821
    .line 822
    const/16 v20, 0x0

    .line 823
    .line 824
    const-wide/16 v21, 0x0

    .line 825
    .line 826
    const/16 v23, 0x0

    .line 827
    .line 828
    move-object v15, v13

    .line 829
    invoke-direct/range {v15 .. v26}, Li2/n0;-><init>(JJLm2/k;JIJI)V

    .line 830
    .line 831
    .line 832
    new-instance v5, Lf1/t0;

    .line 833
    .line 834
    invoke-virtual {v14, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    check-cast v2, Lbi/b;

    .line 839
    .line 840
    invoke-virtual {v2}, Lbi/b;->j()J

    .line 841
    .line 842
    .line 843
    move-result-wide v7

    .line 844
    invoke-direct {v5, v7, v8}, Lf1/t0;-><init>(J)V

    .line 845
    .line 846
    .line 847
    const/high16 v2, 0x3f800000    # 1.0f

    .line 848
    .line 849
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 850
    .line 851
    .line 852
    move-result-object v7

    .line 853
    move-object/from16 v2, v28

    .line 854
    .line 855
    invoke-static {v7, v2}, Ld1/d;->j(Ly0/o;Ld1/v;)Ly0/o;

    .line 856
    .line 857
    .line 858
    move-result-object v11

    .line 859
    move/from16 v2, v34

    .line 860
    .line 861
    invoke-virtual {v14, v2}, Li0/h0;->d(I)Z

    .line 862
    .line 863
    .line 864
    move-result v7

    .line 865
    move-object/from16 v8, p1

    .line 866
    .line 867
    invoke-virtual {v14, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v10

    .line 871
    or-int/2addr v7, v10

    .line 872
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v10

    .line 876
    if-nez v7, :cond_e

    .line 877
    .line 878
    move-object/from16 v7, v58

    .line 879
    .line 880
    if-ne v10, v7, :cond_d

    .line 881
    .line 882
    goto :goto_8

    .line 883
    :cond_d
    move-object/from16 v15, v52

    .line 884
    .line 885
    goto :goto_9

    .line 886
    :cond_e
    move-object/from16 v7, v58

    .line 887
    .line 888
    :goto_8
    new-instance v10, Leb/v0;

    .line 889
    .line 890
    const/4 v12, 0x7

    .line 891
    move-object/from16 v15, v52

    .line 892
    .line 893
    invoke-direct {v10, v2, v8, v15, v12}, Leb/v0;-><init>(ILjava/lang/Object;Ljava/lang/Object;I)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v14, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    :goto_9
    check-cast v10, Lfg/l;

    .line 900
    .line 901
    const/16 v25, 0x0

    .line 902
    .line 903
    const v26, 0xbe98

    .line 904
    .line 905
    .line 906
    const/4 v12, 0x0

    .line 907
    move-object/from16 v18, v15

    .line 908
    .line 909
    const/4 v15, 0x0

    .line 910
    const/16 v16, 0x1

    .line 911
    .line 912
    const/16 v17, 0x0

    .line 913
    .line 914
    move-object/from16 v36, v18

    .line 915
    .line 916
    const/16 v18, 0x0

    .line 917
    .line 918
    const/16 v19, 0x0

    .line 919
    .line 920
    const/16 v20, 0x0

    .line 921
    .line 922
    const/16 v22, 0x0

    .line 923
    .line 924
    const/high16 v24, 0x6180000

    .line 925
    .line 926
    move-object/from16 v21, v5

    .line 927
    .line 928
    move-object/from16 v23, v14

    .line 929
    .line 930
    move-object/from16 v52, v36

    .line 931
    .line 932
    move-object v14, v4

    .line 933
    invoke-static/range {v9 .. v26}, Lw/i;->b(Ln2/s;Lfg/l;Ly0/o;ZLi2/n0;Lw/p0;Lw/o0;ZIILj8/o;Lfg/l;Lf1/s;Lfg/q;Li0/h0;III)V

    .line 934
    .line 935
    .line 936
    move-object/from16 v14, v23

    .line 937
    .line 938
    invoke-virtual {v14, v6}, Li0/h0;->p(Z)V

    .line 939
    .line 940
    .line 941
    invoke-interface/range {v52 .. v52}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v2

    .line 945
    check-cast v2, Ljava/lang/String;

    .line 946
    .line 947
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 948
    .line 949
    .line 950
    move-result v2

    .line 951
    const/4 v4, 0x6

    .line 952
    if-nez v2, :cond_f

    .line 953
    .line 954
    const v2, 0x112b64b0

    .line 955
    .line 956
    .line 957
    invoke-virtual {v14, v2}, Li0/h0;->a0(I)V

    .line 958
    .line 959
    .line 960
    invoke-interface/range {v52 .. v52}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v2

    .line 964
    move-object/from16 v28, v2

    .line 965
    .line 966
    check-cast v28, Ljava/lang/String;

    .line 967
    .line 968
    const-wide v9, 0xffd32f2fL

    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    invoke-static {v9, v10}, Lf1/c0;->d(J)J

    .line 974
    .line 975
    .line 976
    move-result-wide v9

    .line 977
    invoke-static/range {v30 .. v30}, Lx6/d;->D(I)J

    .line 978
    .line 979
    .line 980
    move-result-wide v32

    .line 981
    const/high16 v2, 0x3f800000    # 1.0f

    .line 982
    .line 983
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 984
    .line 985
    .line 986
    move-result-object v15

    .line 987
    int-to-float v2, v4

    .line 988
    const/16 v19, 0x0

    .line 989
    .line 990
    const/16 v20, 0xd

    .line 991
    .line 992
    const/16 v16, 0x0

    .line 993
    .line 994
    const/16 v18, 0x0

    .line 995
    .line 996
    move/from16 v17, v2

    .line 997
    .line 998
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 999
    .line 1000
    .line 1001
    move-result-object v29

    .line 1002
    new-instance v2, Lt2/k;

    .line 1003
    .line 1004
    const/4 v5, 0x3

    .line 1005
    invoke-direct {v2, v5}, Lt2/k;-><init>(I)V

    .line 1006
    .line 1007
    .line 1008
    const/16 v49, 0x0

    .line 1009
    .line 1010
    const v50, 0x3fbe8

    .line 1011
    .line 1012
    .line 1013
    const/16 v34, 0x0

    .line 1014
    .line 1015
    const/16 v35, 0x0

    .line 1016
    .line 1017
    const-wide/16 v36, 0x0

    .line 1018
    .line 1019
    const-wide/16 v39, 0x0

    .line 1020
    .line 1021
    const/16 v41, 0x0

    .line 1022
    .line 1023
    const/16 v42, 0x0

    .line 1024
    .line 1025
    const/16 v43, 0x0

    .line 1026
    .line 1027
    const/16 v44, 0x0

    .line 1028
    .line 1029
    const/16 v45, 0x0

    .line 1030
    .line 1031
    const/16 v46, 0x0

    .line 1032
    .line 1033
    const/16 v48, 0x61b0

    .line 1034
    .line 1035
    move-object/from16 v38, v2

    .line 1036
    .line 1037
    move-wide/from16 v30, v9

    .line 1038
    .line 1039
    move-object/from16 v47, v14

    .line 1040
    .line 1041
    invoke-static/range {v28 .. v50}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v14, v0}, Li0/h0;->p(Z)V

    .line 1045
    .line 1046
    .line 1047
    :goto_a
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1048
    .line 1049
    goto :goto_b

    .line 1050
    :cond_f
    const v2, 0x1130c203

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v14, v2}, Li0/h0;->a0(I)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v14, v0}, Li0/h0;->p(Z)V

    .line 1057
    .line 1058
    .line 1059
    goto :goto_a

    .line 1060
    :goto_b
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v15

    .line 1064
    const/16 v1, 0xa

    .line 1065
    .line 1066
    int-to-float v1, v1

    .line 1067
    int-to-float v2, v4

    .line 1068
    const/16 v20, 0x5

    .line 1069
    .line 1070
    const/16 v16, 0x0

    .line 1071
    .line 1072
    const/16 v18, 0x0

    .line 1073
    .line 1074
    move/from16 v17, v1

    .line 1075
    .line 1076
    move/from16 v19, v2

    .line 1077
    .line 1078
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    const/16 v2, 0x8

    .line 1083
    .line 1084
    int-to-float v2, v2

    .line 1085
    invoke-static {v2}, Lp/j;->g(F)Lp/h;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    sget-object v5, Ly0/b;->p:Ly0/f;

    .line 1090
    .line 1091
    invoke-static {v2, v5, v14, v4}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v2

    .line 1095
    iget-wide v4, v14, Li0/h0;->T:J

    .line 1096
    .line 1097
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    invoke-virtual {v14}, Li0/h0;->l()Ls0/h;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v5

    .line 1105
    invoke-static {v14, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v1

    .line 1109
    invoke-virtual {v14}, Li0/h0;->d0()V

    .line 1110
    .line 1111
    .line 1112
    iget-boolean v9, v14, Li0/h0;->S:Z

    .line 1113
    .line 1114
    if-eqz v9, :cond_10

    .line 1115
    .line 1116
    invoke-virtual {v14, v3}, Li0/h0;->k(Lfg/a;)V

    .line 1117
    .line 1118
    .line 1119
    :goto_c
    move-object/from16 v15, v60

    .line 1120
    .line 1121
    goto :goto_d

    .line 1122
    :cond_10
    invoke-virtual {v14}, Li0/h0;->n0()V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_c

    .line 1126
    :goto_d
    invoke-static {v15, v14, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    move-object/from16 v2, v61

    .line 1130
    .line 1131
    invoke-static {v2, v14, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1132
    .line 1133
    .line 1134
    move-object/from16 v2, v62

    .line 1135
    .line 1136
    move-object/from16 v11, v63

    .line 1137
    .line 1138
    invoke-static {v4, v14, v2, v14, v11}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 1139
    .line 1140
    .line 1141
    move-object/from16 v2, v64

    .line 1142
    .line 1143
    invoke-static {v2, v14, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1144
    .line 1145
    .line 1146
    sget-object v5, Lwb/y2;->p:Lwb/y2;

    .line 1147
    .line 1148
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1149
    .line 1150
    float-to-double v3, v2

    .line 1151
    const-wide/16 v15, 0x0

    .line 1152
    .line 1153
    cmpl-double v1, v3, v15

    .line 1154
    .line 1155
    const-string v3, "invalid weight; must be greater than zero"

    .line 1156
    .line 1157
    if-lez v1, :cond_11

    .line 1158
    .line 1159
    :goto_e
    move-object v9, v8

    .line 1160
    goto :goto_f

    .line 1161
    :cond_11
    invoke-static {v3}, Lq/a;->a(Ljava/lang/String;)V

    .line 1162
    .line 1163
    .line 1164
    goto :goto_e

    .line 1165
    :goto_f
    new-instance v8, Lp/q0;

    .line 1166
    .line 1167
    invoke-direct {v8, v2, v6}, Lp/q0;-><init>(FZ)V

    .line 1168
    .line 1169
    .line 1170
    const/16 v11, 0x6006

    .line 1171
    .line 1172
    const/16 v12, 0x8

    .line 1173
    .line 1174
    move/from16 v21, v6

    .line 1175
    .line 1176
    const-string v6, "\u53d6\u6d88"

    .line 1177
    .line 1178
    move-object v1, v9

    .line 1179
    const/4 v9, 0x0

    .line 1180
    move-object v2, v7

    .line 1181
    move-object v10, v14

    .line 1182
    move/from16 v4, v21

    .line 1183
    .line 1184
    move-object/from16 v7, v27

    .line 1185
    .line 1186
    invoke-virtual/range {v5 .. v12}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 1187
    .line 1188
    .line 1189
    move-object v12, v5

    .line 1190
    invoke-virtual {v14, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v5

    .line 1194
    move-object/from16 v13, p0

    .line 1195
    .line 1196
    iget-boolean v6, v13, Lw/u;->i:Z

    .line 1197
    .line 1198
    invoke-virtual {v14, v6}, Li0/h0;->g(Z)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v8

    .line 1202
    or-int/2addr v5, v8

    .line 1203
    invoke-virtual {v14, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1204
    .line 1205
    .line 1206
    move-result v8

    .line 1207
    or-int/2addr v5, v8

    .line 1208
    move-object/from16 v8, v51

    .line 1209
    .line 1210
    invoke-virtual {v14, v8}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v9

    .line 1214
    or-int/2addr v5, v9

    .line 1215
    iget-object v11, v13, Lw/u;->j:Lfg/l;

    .line 1216
    .line 1217
    invoke-virtual {v14, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v9

    .line 1221
    or-int/2addr v5, v9

    .line 1222
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v9

    .line 1226
    if-nez v5, :cond_12

    .line 1227
    .line 1228
    if-ne v9, v2, :cond_13

    .line 1229
    .line 1230
    :cond_12
    new-instance v5, Lwb/ok;

    .line 1231
    .line 1232
    move-object v9, v1

    .line 1233
    move-object/from16 v10, v52

    .line 1234
    .line 1235
    invoke-direct/range {v5 .. v11}, Lwb/ok;-><init>(ZLfg/a;Landroid/app/Activity;Li0/a1;Li0/a1;Lfg/l;)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v14, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1239
    .line 1240
    .line 1241
    move-object v9, v5

    .line 1242
    :cond_13
    move-object v11, v9

    .line 1243
    check-cast v11, Lfg/a;

    .line 1244
    .line 1245
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1246
    .line 1247
    float-to-double v7, v2

    .line 1248
    cmpl-double v5, v7, v15

    .line 1249
    .line 1250
    if-lez v5, :cond_14

    .line 1251
    .line 1252
    :goto_10
    move-object v5, v12

    .line 1253
    goto :goto_11

    .line 1254
    :cond_14
    invoke-static {v3}, Lq/a;->a(Ljava/lang/String;)V

    .line 1255
    .line 1256
    .line 1257
    goto :goto_10

    .line 1258
    :goto_11
    new-instance v12, Lp/q0;

    .line 1259
    .line 1260
    invoke-direct {v12, v2, v4}, Lp/q0;-><init>(FZ)V

    .line 1261
    .line 1262
    .line 1263
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v1

    .line 1267
    check-cast v1, Ln2/s;

    .line 1268
    .line 1269
    iget-object v1, v1, Ln2/s;->a:Li2/g;

    .line 1270
    .line 1271
    iget-object v1, v1, Li2/g;->h:Ljava/lang/String;

    .line 1272
    .line 1273
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1274
    .line 1275
    .line 1276
    move-result v1

    .line 1277
    if-eqz v1, :cond_16

    .line 1278
    .line 1279
    if-eqz v6, :cond_15

    .line 1280
    .line 1281
    goto :goto_12

    .line 1282
    :cond_15
    move v7, v0

    .line 1283
    goto :goto_13

    .line 1284
    :cond_16
    :goto_12
    move v7, v4

    .line 1285
    :goto_13
    const/16 v15, 0x6006

    .line 1286
    .line 1287
    const/16 v16, 0x0

    .line 1288
    .line 1289
    const-string v10, "\u786e\u5b9a"

    .line 1290
    .line 1291
    move-object v9, v5

    .line 1292
    move-object v0, v13

    .line 1293
    move v13, v7

    .line 1294
    invoke-virtual/range {v9 .. v16}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v14, v4}, Li0/h0;->p(Z)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v14, v4}, Li0/h0;->p(Z)V

    .line 1301
    .line 1302
    .line 1303
    goto :goto_14

    .line 1304
    :cond_17
    move-object/from16 v57, v5

    .line 1305
    .line 1306
    invoke-virtual {v14}, Li0/h0;->V()V

    .line 1307
    .line 1308
    .line 1309
    :goto_14
    return-object v57

    .line 1310
    :pswitch_1
    iget-object v1, v0, Lw/u;->k:Ljava/lang/Object;

    .line 1311
    .line 1312
    check-cast v1, Lh0/d1;

    .line 1313
    .line 1314
    iget-object v2, v0, Lw/u;->l:Ljava/lang/Object;

    .line 1315
    .line 1316
    move-object v4, v2

    .line 1317
    check-cast v4, Lw/q0;

    .line 1318
    .line 1319
    iget-object v2, v0, Lw/u;->m:Ljava/lang/Object;

    .line 1320
    .line 1321
    move-object v6, v2

    .line 1322
    check-cast v6, Ln2/s;

    .line 1323
    .line 1324
    iget-object v2, v0, Lw/u;->n:Ljava/lang/Object;

    .line 1325
    .line 1326
    move-object v7, v2

    .line 1327
    check-cast v7, Lb5/k;

    .line 1328
    .line 1329
    iget-object v2, v0, Lw/u;->o:Ljava/lang/Object;

    .line 1330
    .line 1331
    move-object v8, v2

    .line 1332
    check-cast v8, Lu2/c;

    .line 1333
    .line 1334
    move-object/from16 v2, p1

    .line 1335
    .line 1336
    check-cast v2, Li0/h0;

    .line 1337
    .line 1338
    move-object/from16 v3, p2

    .line 1339
    .line 1340
    check-cast v3, Ljava/lang/Integer;

    .line 1341
    .line 1342
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1343
    .line 1344
    .line 1345
    move-result v3

    .line 1346
    and-int/lit8 v5, v3, 0x3

    .line 1347
    .line 1348
    const/4 v9, 0x2

    .line 1349
    const/4 v10, 0x1

    .line 1350
    const/4 v11, 0x0

    .line 1351
    if-eq v5, v9, :cond_18

    .line 1352
    .line 1353
    move v5, v10

    .line 1354
    goto :goto_15

    .line 1355
    :cond_18
    move v5, v11

    .line 1356
    :goto_15
    and-int/2addr v3, v10

    .line 1357
    invoke-virtual {v2, v3, v5}, Li0/h0;->S(IZ)Z

    .line 1358
    .line 1359
    .line 1360
    move-result v3

    .line 1361
    if-eqz v3, :cond_1c

    .line 1362
    .line 1363
    new-instance v3, Lw/a0;

    .line 1364
    .line 1365
    iget-object v5, v0, Lw/u;->j:Lfg/l;

    .line 1366
    .line 1367
    iget v9, v0, Lw/u;->h:I

    .line 1368
    .line 1369
    invoke-direct/range {v3 .. v9}, Lw/a0;-><init>(Lw/q0;Lfg/l;Ln2/s;Lb5/k;Lu2/c;I)V

    .line 1370
    .line 1371
    .line 1372
    iget-wide v5, v2, Li0/h0;->T:J

    .line 1373
    .line 1374
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 1375
    .line 1376
    .line 1377
    move-result v5

    .line 1378
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v6

    .line 1382
    sget-object v7, Ly0/l;->a:Ly0/l;

    .line 1383
    .line 1384
    invoke-static {v2, v7}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v7

    .line 1388
    sget-object v8, Lx1/g;->f:Lx1/f;

    .line 1389
    .line 1390
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1391
    .line 1392
    .line 1393
    sget-object v8, Lx1/f;->b:Lx1/y;

    .line 1394
    .line 1395
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 1396
    .line 1397
    .line 1398
    iget-boolean v9, v2, Li0/h0;->S:Z

    .line 1399
    .line 1400
    if-eqz v9, :cond_19

    .line 1401
    .line 1402
    invoke-virtual {v2, v8}, Li0/h0;->k(Lfg/a;)V

    .line 1403
    .line 1404
    .line 1405
    goto :goto_16

    .line 1406
    :cond_19
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 1407
    .line 1408
    .line 1409
    :goto_16
    sget-object v8, Lx1/f;->e:Lx1/e;

    .line 1410
    .line 1411
    invoke-static {v8, v2, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1412
    .line 1413
    .line 1414
    sget-object v3, Lx1/f;->d:Lx1/e;

    .line 1415
    .line 1416
    invoke-static {v3, v2, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1417
    .line 1418
    .line 1419
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v3

    .line 1423
    sget-object v5, Lx1/f;->f:Lx1/e;

    .line 1424
    .line 1425
    invoke-static {v5, v2, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    sget-object v3, Lx1/f;->g:Lx1/d;

    .line 1429
    .line 1430
    invoke-static {v3, v2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1431
    .line 1432
    .line 1433
    sget-object v3, Lx1/f;->c:Lx1/e;

    .line 1434
    .line 1435
    invoke-static {v3, v2, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v2, v10}, Li0/h0;->p(Z)V

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual {v4}, Lw/q0;->a()Lw/h0;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v3

    .line 1445
    sget-object v5, Lw/h0;->g:Lw/h0;

    .line 1446
    .line 1447
    iget-boolean v6, v0, Lw/u;->i:Z

    .line 1448
    .line 1449
    if-eq v3, v5, :cond_1a

    .line 1450
    .line 1451
    invoke-virtual {v4}, Lw/q0;->c()Lv1/t;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v3

    .line 1455
    if-eqz v3, :cond_1a

    .line 1456
    .line 1457
    invoke-virtual {v4}, Lw/q0;->c()Lv1/t;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v3

    .line 1461
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1462
    .line 1463
    .line 1464
    invoke-interface {v3}, Lv1/t;->C()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v3

    .line 1468
    if-eqz v3, :cond_1a

    .line 1469
    .line 1470
    if-eqz v6, :cond_1a

    .line 1471
    .line 1472
    goto :goto_17

    .line 1473
    :cond_1a
    move v10, v11

    .line 1474
    :goto_17
    invoke-static {v1, v10, v2, v11}, Lw/s;->i(Lh0/d1;ZLi0/h0;I)V

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v4}, Lw/q0;->a()Lw/h0;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v3

    .line 1481
    sget-object v4, Lw/h0;->i:Lw/h0;

    .line 1482
    .line 1483
    if-ne v3, v4, :cond_1b

    .line 1484
    .line 1485
    if-eqz v6, :cond_1b

    .line 1486
    .line 1487
    const v3, -0x2a98f0d6

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 1491
    .line 1492
    .line 1493
    invoke-static {v1, v2, v11}, Lw/s;->j(Lh0/d1;Li0/h0;I)V

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual {v2, v11}, Li0/h0;->p(Z)V

    .line 1497
    .line 1498
    .line 1499
    goto :goto_18

    .line 1500
    :cond_1b
    const v1, -0x2a97c486

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v2, v1}, Li0/h0;->a0(I)V

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual {v2, v11}, Li0/h0;->p(Z)V

    .line 1507
    .line 1508
    .line 1509
    goto :goto_18

    .line 1510
    :cond_1c
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 1511
    .line 1512
    .line 1513
    :goto_18
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1514
    .line 1515
    return-object v1

    .line 1516
    nop

    .line 1517
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
