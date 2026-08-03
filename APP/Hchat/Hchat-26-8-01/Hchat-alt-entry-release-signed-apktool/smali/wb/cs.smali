.class public final synthetic Lwb/cs;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfb/d1;

.field public final synthetic i:Z

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Z

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfb/d1;ZLfg/l;ZLfg/p;Lfg/p;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/cs;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/cs;->h:Lfb/d1;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/cs;->i:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwb/cs;->j:Lfg/l;

    .line 12
    .line 13
    iput-boolean p4, p0, Lwb/cs;->k:Z

    .line 14
    .line 15
    iput-object p5, p0, Lwb/cs;->l:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/cs;->m:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/cs;->n:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p8, p0, Lwb/cs;->o:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p9, p0, Lwb/cs;->p:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p10, p0, Lwb/cs;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p11, p0, Lwb/cs;->r:Ljava/lang/Object;

    .line 28
    .line 29
    return-void
.end method

.method public synthetic constructor <init>(Lwb/y2;Ly0/o;Lfb/d1;ZZLfg/a;Lfg/a;Lfg/a;Lfg/a;Lfg/l;Lfg/l;I)V
    .locals 0

    .line 30
    const/4 p12, 0x0

    iput p12, p0, Lwb/cs;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/cs;->l:Ljava/lang/Object;

    iput-object p2, p0, Lwb/cs;->m:Ljava/lang/Object;

    iput-object p3, p0, Lwb/cs;->h:Lfb/d1;

    iput-boolean p4, p0, Lwb/cs;->i:Z

    iput-boolean p5, p0, Lwb/cs;->k:Z

    iput-object p6, p0, Lwb/cs;->n:Ljava/lang/Object;

    iput-object p7, p0, Lwb/cs;->o:Ljava/lang/Object;

    iput-object p8, p0, Lwb/cs;->p:Ljava/lang/Object;

    iput-object p9, p0, Lwb/cs;->q:Ljava/lang/Object;

    iput-object p10, p0, Lwb/cs;->j:Lfg/l;

    iput-object p11, p0, Lwb/cs;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/cs;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lwb/cs;->l:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lfg/p;

    .line 11
    .line 12
    iget-object v2, v0, Lwb/cs;->m:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lfg/p;

    .line 15
    .line 16
    iget-object v3, v0, Lwb/cs;->n:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v3

    .line 19
    check-cast v6, Li0/a1;

    .line 20
    .line 21
    iget-object v3, v0, Lwb/cs;->o:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v7, v3

    .line 24
    check-cast v7, Li0/a1;

    .line 25
    .line 26
    iget-object v3, v0, Lwb/cs;->p:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v12, v3

    .line 29
    check-cast v12, Li0/a1;

    .line 30
    .line 31
    iget-object v3, v0, Lwb/cs;->q:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v10, v3

    .line 34
    check-cast v10, Li0/a1;

    .line 35
    .line 36
    iget-object v3, v0, Lwb/cs;->r:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Li0/a1;

    .line 39
    .line 40
    move-object/from16 v4, p1

    .line 41
    .line 42
    check-cast v4, Li0/h0;

    .line 43
    .line 44
    move-object/from16 v5, p2

    .line 45
    .line 46
    check-cast v5, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    and-int/lit8 v8, v5, 0x3

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v11, 0x1

    .line 56
    const/4 v13, 0x2

    .line 57
    if-eq v8, v13, :cond_0

    .line 58
    .line 59
    move v8, v11

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v8, v9

    .line 62
    :goto_0
    and-int/2addr v5, v11

    .line 63
    invoke-virtual {v4, v5, v8}, Li0/h0;->S(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_14

    .line 68
    .line 69
    sget-object v5, Lp/j;->c:Lp/e;

    .line 70
    .line 71
    sget-object v8, Ly0/b;->s:Ly0/e;

    .line 72
    .line 73
    invoke-static {v5, v8, v4, v9}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-wide v8, v4, Li0/h0;->T:J

    .line 78
    .line 79
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-virtual {v4}, Li0/h0;->l()Ls0/h;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    sget-object v14, Ly0/l;->a:Ly0/l;

    .line 88
    .line 89
    invoke-static {v4, v14}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    sget-object v16, Lx1/g;->f:Lx1/f;

    .line 94
    .line 95
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 99
    .line 100
    invoke-virtual {v4}, Li0/h0;->d0()V

    .line 101
    .line 102
    .line 103
    iget-boolean v13, v4, Li0/h0;->S:Z

    .line 104
    .line 105
    if-eqz v13, :cond_1

    .line 106
    .line 107
    invoke-virtual {v4, v11}, Li0/h0;->k(Lfg/a;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    invoke-virtual {v4}, Li0/h0;->n0()V

    .line 112
    .line 113
    .line 114
    :goto_1
    sget-object v11, Lx1/f;->e:Lx1/e;

    .line 115
    .line 116
    invoke-static {v11, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object v5, Lx1/f;->d:Lx1/e;

    .line 120
    .line 121
    invoke-static {v5, v4, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 129
    .line 130
    invoke-static {v8, v4, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    sget-object v5, Lx1/f;->g:Lx1/d;

    .line 134
    .line 135
    invoke-static {v5, v4}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 136
    .line 137
    .line 138
    sget-object v5, Lx1/f;->c:Lx1/e;

    .line 139
    .line 140
    invoke-static {v5, v4, v15}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v9, v0, Lwb/cs;->h:Lfb/d1;

    .line 144
    .line 145
    iget-object v5, v9, Lfb/d1;->b:Ljava/lang/String;

    .line 146
    .line 147
    iget-boolean v11, v9, Lfb/d1;->m:Z

    .line 148
    .line 149
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-eqz v8, :cond_2

    .line 154
    .line 155
    const-string v5, "\u65b0\u5bf9\u8bdd"

    .line 156
    .line 157
    :cond_2
    move-object v13, v5

    .line 158
    sget-object v5, Lbi/d;->a:Li0/m2;

    .line 159
    .line 160
    invoke-virtual {v4, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    check-cast v5, Lbi/b;

    .line 165
    .line 166
    invoke-virtual {v5}, Lbi/b;->g()J

    .line 167
    .line 168
    .line 169
    move-result-wide v15

    .line 170
    const/16 v5, 0xf

    .line 171
    .line 172
    invoke-static {v5}, Lx6/d;->D(I)J

    .line 173
    .line 174
    .line 175
    move-result-wide v17

    .line 176
    const/high16 v5, 0x3f800000    # 1.0f

    .line 177
    .line 178
    invoke-static {v14, v5}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 179
    .line 180
    .line 181
    move-result-object v19

    .line 182
    const/16 v8, 0x8

    .line 183
    .line 184
    int-to-float v8, v8

    .line 185
    const/16 v5, 0xa

    .line 186
    .line 187
    int-to-float v5, v5

    .line 188
    const/16 v24, 0x2

    .line 189
    .line 190
    const/16 v21, 0x0

    .line 191
    .line 192
    move/from16 v22, v8

    .line 193
    .line 194
    move/from16 v23, v5

    .line 195
    .line 196
    move/from16 v20, v8

    .line 197
    .line 198
    invoke-static/range {v19 .. v24}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    new-instance v8, Lt2/k;

    .line 203
    .line 204
    move-object/from16 v32, v4

    .line 205
    .line 206
    const/4 v4, 0x3

    .line 207
    invoke-direct {v8, v4}, Lt2/k;-><init>(I)V

    .line 208
    .line 209
    .line 210
    const/16 v34, 0x6180

    .line 211
    .line 212
    const v35, 0x3abe8

    .line 213
    .line 214
    .line 215
    const/16 v19, 0x0

    .line 216
    .line 217
    const/16 v20, 0x0

    .line 218
    .line 219
    const-wide/16 v21, 0x0

    .line 220
    .line 221
    const-wide/16 v24, 0x0

    .line 222
    .line 223
    const/16 v26, 0x2

    .line 224
    .line 225
    const/16 v27, 0x0

    .line 226
    .line 227
    const/16 v28, 0x2

    .line 228
    .line 229
    const/16 v29, 0x0

    .line 230
    .line 231
    const/16 v30, 0x0

    .line 232
    .line 233
    const/16 v31, 0x0

    .line 234
    .line 235
    const/16 v33, 0x6030

    .line 236
    .line 237
    move-object v4, v14

    .line 238
    move-object v14, v5

    .line 239
    move-object v5, v4

    .line 240
    move-object/from16 v23, v8

    .line 241
    .line 242
    const/4 v4, 0x2

    .line 243
    invoke-static/range {v13 .. v35}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 244
    .line 245
    .line 246
    move-object/from16 v13, v32

    .line 247
    .line 248
    sget-object v14, Lwb/y2;->n:Lwb/y2;

    .line 249
    .line 250
    sget-object v19, Lwb/ap;->r:Lm1/f;

    .line 251
    .line 252
    invoke-virtual {v13, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v15

    .line 260
    move-object/from16 p2, v14

    .line 261
    .line 262
    sget-object v14, Li0/l;->a:Li0/e;

    .line 263
    .line 264
    if-nez v8, :cond_3

    .line 265
    .line 266
    if-ne v15, v14, :cond_4

    .line 267
    .line 268
    :cond_3
    move v8, v4

    .line 269
    goto :goto_2

    .line 270
    :cond_4
    move-object v8, v12

    .line 271
    const/high16 v36, 0x3f800000    # 1.0f

    .line 272
    .line 273
    move v12, v4

    .line 274
    move-object v4, v15

    .line 275
    move-object v15, v5

    .line 276
    move-object v5, v9

    .line 277
    goto :goto_3

    .line 278
    :goto_2
    new-instance v4, Lc9/n0;

    .line 279
    .line 280
    move-object v15, v5

    .line 281
    move-object v5, v9

    .line 282
    const/16 v9, 0x1b

    .line 283
    .line 284
    move-object/from16 v36, v12

    .line 285
    .line 286
    move v12, v8

    .line 287
    move-object/from16 v8, v36

    .line 288
    .line 289
    const/high16 v36, 0x3f800000    # 1.0f

    .line 290
    .line 291
    invoke-direct/range {v4 .. v9}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v13, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :goto_3
    move-object/from16 v16, v4

    .line 298
    .line 299
    check-cast v16, Lfg/a;

    .line 300
    .line 301
    move-object v4, v14

    .line 302
    const v14, 0x30036

    .line 303
    .line 304
    .line 305
    move-object v6, v15

    .line 306
    const/16 v15, 0xc

    .line 307
    .line 308
    const-string v18, "\u7f16\u8f91\u6807\u9898"

    .line 309
    .line 310
    const/16 v20, 0x0

    .line 311
    .line 312
    const/16 v21, 0x0

    .line 313
    .line 314
    move-object/from16 v17, v13

    .line 315
    .line 316
    move-object/from16 v13, p2

    .line 317
    .line 318
    invoke-virtual/range {v13 .. v21}, Lwb/y2;->W(IILfg/a;Li0/h0;Ljava/lang/String;Lm1/f;ZZ)V

    .line 319
    .line 320
    .line 321
    move-object v14, v13

    .line 322
    move-object/from16 v7, v17

    .line 323
    .line 324
    sget-object v19, Lwb/ap;->t:Lm1/f;

    .line 325
    .line 326
    invoke-virtual {v7, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v9

    .line 330
    move v13, v11

    .line 331
    iget-object v11, v0, Lwb/cs;->j:Lfg/l;

    .line 332
    .line 333
    invoke-virtual {v7, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v15

    .line 337
    or-int/2addr v9, v15

    .line 338
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v15

    .line 342
    if-nez v9, :cond_5

    .line 343
    .line 344
    if-ne v15, v4, :cond_6

    .line 345
    .line 346
    :cond_5
    move v9, v12

    .line 347
    move-object v12, v8

    .line 348
    goto :goto_4

    .line 349
    :cond_6
    move-object v9, v5

    .line 350
    move-object v12, v8

    .line 351
    move v5, v13

    .line 352
    move-object v8, v15

    .line 353
    const/4 v15, 0x1

    .line 354
    goto :goto_5

    .line 355
    :goto_4
    new-instance v8, Lwb/gt;

    .line 356
    .line 357
    move v15, v13

    .line 358
    const/4 v13, 0x0

    .line 359
    move-object v9, v5

    .line 360
    move v5, v15

    .line 361
    const/4 v15, 0x1

    .line 362
    invoke-direct/range {v8 .. v13}, Lwb/gt;-><init>(Lfb/d1;Li0/a1;Lfg/l;Li0/a1;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v7, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :goto_5
    move-object/from16 v16, v8

    .line 369
    .line 370
    check-cast v16, Lfg/a;

    .line 371
    .line 372
    move-object v13, v14

    .line 373
    const v14, 0x30036

    .line 374
    .line 375
    .line 376
    move v8, v15

    .line 377
    const/4 v15, 0x4

    .line 378
    const-string v18, "\u4e0a\u79fb"

    .line 379
    .line 380
    const/16 v20, 0x0

    .line 381
    .line 382
    iget-boolean v8, v0, Lwb/cs;->i:Z

    .line 383
    .line 384
    move-object/from16 v17, v7

    .line 385
    .line 386
    move/from16 v21, v8

    .line 387
    .line 388
    move/from16 v7, v36

    .line 389
    .line 390
    const/4 v8, 0x1

    .line 391
    invoke-virtual/range {v13 .. v21}, Lwb/y2;->W(IILfg/a;Li0/h0;Ljava/lang/String;Lm1/f;ZZ)V

    .line 392
    .line 393
    .line 394
    move-object v15, v13

    .line 395
    move-object/from16 v14, v17

    .line 396
    .line 397
    sget-object v19, Lwb/ap;->u:Lm1/f;

    .line 398
    .line 399
    invoke-virtual {v14, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v13

    .line 403
    invoke-virtual {v14, v11}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v16

    .line 407
    or-int v13, v13, v16

    .line 408
    .line 409
    invoke-virtual {v14}, Li0/h0;->P()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    if-nez v13, :cond_8

    .line 414
    .line 415
    if-ne v8, v4, :cond_7

    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_7
    const/4 v7, 0x1

    .line 419
    goto :goto_7

    .line 420
    :cond_8
    :goto_6
    new-instance v8, Lwb/gt;

    .line 421
    .line 422
    const/4 v13, 0x1

    .line 423
    const/4 v7, 0x1

    .line 424
    invoke-direct/range {v8 .. v13}, Lwb/gt;-><init>(Lfb/d1;Li0/a1;Lfg/l;Li0/a1;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v14, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :goto_7
    move-object/from16 v16, v8

    .line 431
    .line 432
    check-cast v16, Lfg/a;

    .line 433
    .line 434
    move-object/from16 v17, v14

    .line 435
    .line 436
    const v14, 0x30036

    .line 437
    .line 438
    .line 439
    move-object v13, v15

    .line 440
    const/4 v15, 0x4

    .line 441
    const-string v18, "\u4e0b\u79fb"

    .line 442
    .line 443
    const/16 v20, 0x0

    .line 444
    .line 445
    iget-boolean v8, v0, Lwb/cs;->k:Z

    .line 446
    .line 447
    move/from16 v21, v8

    .line 448
    .line 449
    invoke-virtual/range {v13 .. v21}, Lwb/y2;->W(IILfg/a;Li0/h0;Ljava/lang/String;Lm1/f;ZZ)V

    .line 450
    .line 451
    .line 452
    move-object v14, v13

    .line 453
    move-object/from16 v13, v17

    .line 454
    .line 455
    sget-object v19, Lwb/ap;->w:Lm1/f;

    .line 456
    .line 457
    iget-boolean v8, v9, Lfb/d1;->l:Z

    .line 458
    .line 459
    if-eqz v8, :cond_9

    .line 460
    .line 461
    const-string v8, "\u53d6\u6d88\u7f6e\u9876"

    .line 462
    .line 463
    :goto_8
    move-object/from16 v18, v8

    .line 464
    .line 465
    goto :goto_9

    .line 466
    :cond_9
    const-string v8, "\u7f6e\u9876\u804a\u5929"

    .line 467
    .line 468
    goto :goto_8

    .line 469
    :goto_9
    invoke-virtual {v13, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v8

    .line 473
    invoke-virtual {v13, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v10

    .line 477
    or-int/2addr v8, v10

    .line 478
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    if-nez v8, :cond_a

    .line 483
    .line 484
    if-ne v10, v4, :cond_b

    .line 485
    .line 486
    :cond_a
    new-instance v10, Lwb/jr;

    .line 487
    .line 488
    const/4 v8, 0x0

    .line 489
    invoke-direct {v10, v1, v9, v12, v8}, Lwb/jr;-><init>(Lfg/p;Lfb/d1;Li0/a1;I)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v13, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    :cond_b
    move-object/from16 v16, v10

    .line 496
    .line 497
    check-cast v16, Lfg/a;

    .line 498
    .line 499
    move-object v15, v14

    .line 500
    const v14, 0x30006

    .line 501
    .line 502
    .line 503
    move-object/from16 v17, v13

    .line 504
    .line 505
    move-object v13, v15

    .line 506
    const/16 v15, 0xc

    .line 507
    .line 508
    const/16 v20, 0x0

    .line 509
    .line 510
    const/16 v21, 0x0

    .line 511
    .line 512
    invoke-virtual/range {v13 .. v21}, Lwb/y2;->W(IILfg/a;Li0/h0;Ljava/lang/String;Lm1/f;ZZ)V

    .line 513
    .line 514
    .line 515
    move-object v14, v13

    .line 516
    move-object/from16 v13, v17

    .line 517
    .line 518
    if-eqz v5, :cond_c

    .line 519
    .line 520
    sget-object v1, Lwb/ap;->y:Lm1/f;

    .line 521
    .line 522
    :goto_a
    move-object/from16 v19, v1

    .line 523
    .line 524
    goto :goto_b

    .line 525
    :cond_c
    sget-object v1, Lwb/ap;->x:Lm1/f;

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :goto_b
    if-eqz v5, :cond_d

    .line 529
    .line 530
    const-string v1, "\u89e3\u9501\u804a\u5929"

    .line 531
    .line 532
    :goto_c
    move-object/from16 v18, v1

    .line 533
    .line 534
    goto :goto_d

    .line 535
    :cond_d
    const-string v1, "\u9501\u5b9a\u804a\u5929"

    .line 536
    .line 537
    goto :goto_c

    .line 538
    :goto_d
    invoke-virtual {v13, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    invoke-virtual {v13, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v8

    .line 546
    or-int/2addr v1, v8

    .line 547
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v8

    .line 551
    if-nez v1, :cond_e

    .line 552
    .line 553
    if-ne v8, v4, :cond_f

    .line 554
    .line 555
    :cond_e
    new-instance v8, Lwb/jr;

    .line 556
    .line 557
    const/4 v1, 0x1

    .line 558
    invoke-direct {v8, v2, v9, v12, v1}, Lwb/jr;-><init>(Lfg/p;Lfb/d1;Li0/a1;I)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v13, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    :cond_f
    move-object/from16 v16, v8

    .line 565
    .line 566
    check-cast v16, Lfg/a;

    .line 567
    .line 568
    move-object v15, v14

    .line 569
    const/high16 v14, 0x30000

    .line 570
    .line 571
    move-object/from16 v17, v13

    .line 572
    .line 573
    move-object v13, v15

    .line 574
    const/16 v15, 0xc

    .line 575
    .line 576
    const/16 v20, 0x0

    .line 577
    .line 578
    const/16 v21, 0x0

    .line 579
    .line 580
    invoke-virtual/range {v13 .. v21}, Lwb/y2;->W(IILfg/a;Li0/h0;Ljava/lang/String;Lm1/f;ZZ)V

    .line 581
    .line 582
    .line 583
    move-object v14, v13

    .line 584
    move-object/from16 v13, v17

    .line 585
    .line 586
    sget-object v19, Lwb/ap;->s:Lm1/f;

    .line 587
    .line 588
    if-eqz v5, :cond_10

    .line 589
    .line 590
    const-string v1, "\u5220\u9664\uff08\u5df2\u9501\u5b9a\uff09"

    .line 591
    .line 592
    :goto_e
    move-object/from16 v18, v1

    .line 593
    .line 594
    goto :goto_f

    .line 595
    :cond_10
    const-string v1, "\u5220\u9664"

    .line 596
    .line 597
    goto :goto_e

    .line 598
    :goto_f
    xor-int/lit8 v21, v5, 0x1

    .line 599
    .line 600
    invoke-virtual {v13, v9}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    if-nez v1, :cond_11

    .line 609
    .line 610
    if-ne v2, v4, :cond_12

    .line 611
    .line 612
    :cond_11
    new-instance v2, Lwb/kr;

    .line 613
    .line 614
    const/4 v1, 0x0

    .line 615
    invoke-direct {v2, v9, v3, v12, v1}, Lwb/kr;-><init>(Lfb/d1;Li0/a1;Li0/a1;I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v13, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    :cond_12
    move-object/from16 v16, v2

    .line 622
    .line 623
    check-cast v16, Lfg/a;

    .line 624
    .line 625
    move-object v15, v14

    .line 626
    const v14, 0x30186

    .line 627
    .line 628
    .line 629
    move-object/from16 v17, v13

    .line 630
    .line 631
    move-object v13, v15

    .line 632
    const/4 v15, 0x0

    .line 633
    const/16 v20, 0x1

    .line 634
    .line 635
    invoke-virtual/range {v13 .. v21}, Lwb/y2;->W(IILfg/a;Li0/h0;Ljava/lang/String;Lm1/f;ZZ)V

    .line 636
    .line 637
    .line 638
    move-object/from16 v13, v17

    .line 639
    .line 640
    invoke-virtual {v13}, Li0/h0;->P()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    if-ne v1, v4, :cond_13

    .line 645
    .line 646
    new-instance v1, Lwb/jp;

    .line 647
    .line 648
    const/4 v2, 0x4

    .line 649
    invoke-direct {v1, v12, v2}, Lwb/jp;-><init>(Li0/a1;I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v13, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    :cond_13
    move-object v14, v1

    .line 656
    check-cast v14, Lfg/a;

    .line 657
    .line 658
    const/high16 v1, 0x3f800000    # 1.0f

    .line 659
    .line 660
    invoke-static {v6, v1}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 661
    .line 662
    .line 663
    move-result-object v15

    .line 664
    const/4 v4, 0x2

    .line 665
    int-to-float v1, v4

    .line 666
    const/16 v19, 0x0

    .line 667
    .line 668
    const/16 v20, 0xd

    .line 669
    .line 670
    const/16 v16, 0x0

    .line 671
    .line 672
    const/16 v18, 0x0

    .line 673
    .line 674
    move/from16 v17, v1

    .line 675
    .line 676
    invoke-static/range {v15 .. v20}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 677
    .line 678
    .line 679
    move-result-object v15

    .line 680
    invoke-static {v13}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 681
    .line 682
    .line 683
    move-result-object v20

    .line 684
    const/16 v23, 0x1b6

    .line 685
    .line 686
    const/16 v24, 0x778

    .line 687
    .line 688
    move-object/from16 v17, v13

    .line 689
    .line 690
    const-string v13, "\u53d6\u6d88"

    .line 691
    .line 692
    const/16 v16, 0x0

    .line 693
    .line 694
    move-object/from16 v32, v17

    .line 695
    .line 696
    const/16 v17, 0x0

    .line 697
    .line 698
    const/16 v21, 0x0

    .line 699
    .line 700
    move-object/from16 v22, v32

    .line 701
    .line 702
    invoke-static/range {v13 .. v24}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 703
    .line 704
    .line 705
    move-object/from16 v13, v22

    .line 706
    .line 707
    invoke-virtual {v13, v7}, Li0/h0;->p(Z)V

    .line 708
    .line 709
    .line 710
    goto :goto_10

    .line 711
    :cond_14
    move-object v13, v4

    .line 712
    invoke-virtual {v13}, Li0/h0;->V()V

    .line 713
    .line 714
    .line 715
    :goto_10
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 716
    .line 717
    return-object v1

    .line 718
    :pswitch_0
    iget-object v1, v0, Lwb/cs;->l:Ljava/lang/Object;

    .line 719
    .line 720
    move-object v2, v1

    .line 721
    check-cast v2, Lwb/y2;

    .line 722
    .line 723
    iget-object v1, v0, Lwb/cs;->m:Ljava/lang/Object;

    .line 724
    .line 725
    move-object v3, v1

    .line 726
    check-cast v3, Ly0/o;

    .line 727
    .line 728
    iget-object v1, v0, Lwb/cs;->n:Ljava/lang/Object;

    .line 729
    .line 730
    move-object v7, v1

    .line 731
    check-cast v7, Lfg/a;

    .line 732
    .line 733
    iget-object v1, v0, Lwb/cs;->o:Ljava/lang/Object;

    .line 734
    .line 735
    move-object v8, v1

    .line 736
    check-cast v8, Lfg/a;

    .line 737
    .line 738
    iget-object v1, v0, Lwb/cs;->p:Ljava/lang/Object;

    .line 739
    .line 740
    move-object v9, v1

    .line 741
    check-cast v9, Lfg/a;

    .line 742
    .line 743
    iget-object v1, v0, Lwb/cs;->q:Ljava/lang/Object;

    .line 744
    .line 745
    move-object v10, v1

    .line 746
    check-cast v10, Lfg/a;

    .line 747
    .line 748
    iget-object v1, v0, Lwb/cs;->r:Ljava/lang/Object;

    .line 749
    .line 750
    move-object v12, v1

    .line 751
    check-cast v12, Lfg/l;

    .line 752
    .line 753
    move-object/from16 v13, p1

    .line 754
    .line 755
    check-cast v13, Li0/h0;

    .line 756
    .line 757
    move-object/from16 v1, p2

    .line 758
    .line 759
    check-cast v1, Ljava/lang/Integer;

    .line 760
    .line 761
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    const/4 v1, 0x1

    .line 765
    invoke-static {v1}, Li0/r;->C(I)I

    .line 766
    .line 767
    .line 768
    move-result v14

    .line 769
    iget-object v4, v0, Lwb/cs;->h:Lfb/d1;

    .line 770
    .line 771
    iget-boolean v5, v0, Lwb/cs;->i:Z

    .line 772
    .line 773
    iget-boolean v6, v0, Lwb/cs;->k:Z

    .line 774
    .line 775
    iget-object v11, v0, Lwb/cs;->j:Lfg/l;

    .line 776
    .line 777
    invoke-virtual/range {v2 .. v14}, Lwb/y2;->Z(Ly0/o;Lfb/d1;ZZLfg/a;Lfg/a;Lfg/a;Lfg/a;Lfg/l;Lfg/l;Li0/h0;I)V

    .line 778
    .line 779
    .line 780
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 781
    .line 782
    return-object v1

    .line 783
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
