.class public final Lwb/ov;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/r;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lfg/l;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ov;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ov;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ov;->i:Lfg/l;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lr/d;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v3, p3

    .line 16
    .line 17
    check-cast v3, Li0/h0;

    .line 18
    .line 19
    move-object/from16 v4, p4

    .line 20
    .line 21
    check-cast v4, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    and-int/lit8 v5, v4, 0x6

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v1, v6

    .line 41
    :goto_0
    or-int/2addr v1, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v1, v4

    .line 44
    :goto_1
    and-int/lit8 v4, v4, 0x30

    .line 45
    .line 46
    if-nez v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Li0/h0;->d(I)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    const/16 v4, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v4, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v1, v4

    .line 60
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 61
    .line 62
    const/16 v5, 0x92

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    const/4 v8, 0x0

    .line 66
    if-eq v4, v5, :cond_4

    .line 67
    .line 68
    move v4, v7

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move v4, v8

    .line 71
    :goto_3
    and-int/2addr v1, v7

    .line 72
    invoke-virtual {v3, v1, v4}, Li0/h0;->S(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_b

    .line 77
    .line 78
    iget-object v1, v0, Lwb/ov;->g:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/String;

    .line 85
    .line 86
    const v2, 0x72f496c6

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v2}, Li0/h0;->a0(I)V

    .line 90
    .line 91
    .line 92
    iget-object v2, v0, Lwb/ov;->h:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const/16 v4, 0x22

    .line 99
    .line 100
    int-to-float v4, v4

    .line 101
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 102
    .line 103
    invoke-static {v5, v4}, Lp/h1;->e(Ly0/o;F)Ly0/o;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    const/16 v5, 0xc

    .line 108
    .line 109
    int-to-float v5, v5

    .line 110
    invoke-static {v5}, Lv/e;->a(F)Lv/d;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-static {v4, v9}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    const v9, 0x72f82736

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v9}, Li0/h0;->a0(I)V

    .line 124
    .line 125
    .line 126
    sget-object v9, Lbi/d;->a:Li0/m2;

    .line 127
    .line 128
    invoke-virtual {v3, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    check-cast v9, Lbi/b;

    .line 133
    .line 134
    invoke-virtual {v9}, Lbi/b;->j()J

    .line 135
    .line 136
    .line 137
    move-result-wide v9

    .line 138
    invoke-virtual {v3, v8}, Li0/h0;->p(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_5
    const v9, 0x72f9ad60

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v9}, Li0/h0;->a0(I)V

    .line 146
    .line 147
    .line 148
    sget-object v9, Lbi/d;->a:Li0/m2;

    .line 149
    .line 150
    invoke-virtual {v3, v9}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    check-cast v9, Lbi/b;

    .line 155
    .line 156
    invoke-virtual {v9}, Lbi/b;->g()J

    .line 157
    .line 158
    .line 159
    move-result-wide v9

    .line 160
    const v11, 0x3d75c28f    # 0.06f

    .line 161
    .line 162
    .line 163
    invoke-static {v9, v10, v11}, Lf1/w;->b(JF)J

    .line 164
    .line 165
    .line 166
    move-result-wide v9

    .line 167
    invoke-virtual {v3, v8}, Li0/h0;->p(Z)V

    .line 168
    .line 169
    .line 170
    :goto_4
    sget-object v11, Lf1/c0;->b:Lf1/m0;

    .line 171
    .line 172
    invoke-static {v4, v9, v10, v11}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    iget-object v4, v0, Lwb/ov;->i:Lfg/l;

    .line 177
    .line 178
    invoke-virtual {v3, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    invoke-virtual {v3, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    or-int/2addr v9, v10

    .line 187
    invoke-virtual {v3}, Li0/h0;->P()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    if-nez v9, :cond_6

    .line 192
    .line 193
    sget-object v9, Li0/l;->a:Li0/e;

    .line 194
    .line 195
    if-ne v10, v9, :cond_7

    .line 196
    .line 197
    :cond_6
    new-instance v10, Lwb/mv;

    .line 198
    .line 199
    invoke-direct {v10, v4, v1}, Lwb/mv;-><init>(Lfg/l;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_7
    move-object/from16 v16, v10

    .line 206
    .line 207
    check-cast v16, Lfg/a;

    .line 208
    .line 209
    const/16 v17, 0xf

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x0

    .line 214
    invoke-static/range {v12 .. v17}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    const/4 v9, 0x0

    .line 219
    invoke-static {v4, v5, v9, v6}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    sget-object v5, Ly0/b;->k:Ly0/g;

    .line 224
    .line 225
    invoke-static {v5, v8}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    iget-wide v9, v3, Li0/h0;->T:J

    .line 230
    .line 231
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    invoke-virtual {v3}, Li0/h0;->l()Ls0/h;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    invoke-static {v3, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 244
    .line 245
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 249
    .line 250
    invoke-virtual {v3}, Li0/h0;->d0()V

    .line 251
    .line 252
    .line 253
    iget-boolean v11, v3, Li0/h0;->S:Z

    .line 254
    .line 255
    if-eqz v11, :cond_8

    .line 256
    .line 257
    invoke-virtual {v3, v10}, Li0/h0;->k(Lfg/a;)V

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_8
    invoke-virtual {v3}, Li0/h0;->n0()V

    .line 262
    .line 263
    .line 264
    :goto_5
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 265
    .line 266
    invoke-static {v10, v3, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object v5, Lx1/f;->d:Lx1/e;

    .line 270
    .line 271
    invoke-static {v5, v3, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    sget-object v6, Lx1/f;->f:Lx1/e;

    .line 279
    .line 280
    invoke-static {v6, v3, v5}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    sget-object v5, Lx1/f;->g:Lx1/d;

    .line 284
    .line 285
    invoke-static {v5, v3}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 286
    .line 287
    .line 288
    sget-object v5, Lx1/f;->c:Lx1/e;

    .line 289
    .line 290
    invoke-static {v5, v3, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    if-eqz v2, :cond_9

    .line 294
    .line 295
    const v4, -0x17c004d3

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v4}, Li0/h0;->a0(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v3, v8}, Li0/h0;->p(Z)V

    .line 302
    .line 303
    .line 304
    sget-wide v4, Lf1/w;->c:J

    .line 305
    .line 306
    :goto_6
    move-wide v5, v4

    .line 307
    goto :goto_7

    .line 308
    :cond_9
    const v4, -0x17c00081

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v4}, Li0/h0;->a0(I)V

    .line 312
    .line 313
    .line 314
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 315
    .line 316
    invoke-virtual {v3, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    check-cast v4, Lbi/b;

    .line 321
    .line 322
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 323
    .line 324
    .line 325
    move-result-wide v4

    .line 326
    invoke-virtual {v3, v8}, Li0/h0;->p(Z)V

    .line 327
    .line 328
    .line 329
    goto :goto_6

    .line 330
    :goto_7
    const/16 v4, 0xd

    .line 331
    .line 332
    invoke-static {v4}, Lx6/d;->D(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v9

    .line 336
    if-eqz v2, :cond_a

    .line 337
    .line 338
    sget-object v2, Lm2/k;->j:Lm2/k;

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_a
    sget-object v2, Lm2/k;->i:Lm2/k;

    .line 342
    .line 343
    :goto_8
    const/16 v24, 0x0

    .line 344
    .line 345
    const v25, 0x3ffaa

    .line 346
    .line 347
    .line 348
    const/4 v4, 0x0

    .line 349
    move v11, v8

    .line 350
    move-wide/from16 v26, v9

    .line 351
    .line 352
    move v9, v7

    .line 353
    move-wide/from16 v7, v26

    .line 354
    .line 355
    const/4 v10, 0x0

    .line 356
    move v13, v11

    .line 357
    const-wide/16 v11, 0x0

    .line 358
    .line 359
    move v14, v13

    .line 360
    const/4 v13, 0x0

    .line 361
    move/from16 v16, v14

    .line 362
    .line 363
    const-wide/16 v14, 0x0

    .line 364
    .line 365
    move/from16 v17, v16

    .line 366
    .line 367
    const/16 v16, 0x0

    .line 368
    .line 369
    move/from16 v18, v17

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    move/from16 v19, v18

    .line 374
    .line 375
    const/16 v18, 0x0

    .line 376
    .line 377
    move/from16 v20, v19

    .line 378
    .line 379
    const/16 v19, 0x0

    .line 380
    .line 381
    move/from16 v21, v20

    .line 382
    .line 383
    const/16 v20, 0x0

    .line 384
    .line 385
    move/from16 v22, v21

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    const/16 v23, 0x6000

    .line 390
    .line 391
    move-object/from16 v26, v3

    .line 392
    .line 393
    move-object v3, v1

    .line 394
    move v1, v9

    .line 395
    move-object v9, v2

    .line 396
    move/from16 v2, v22

    .line 397
    .line 398
    move-object/from16 v22, v26

    .line 399
    .line 400
    invoke-static/range {v3 .. v25}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 401
    .line 402
    .line 403
    move-object/from16 v3, v22

    .line 404
    .line 405
    invoke-virtual {v3, v1}, Li0/h0;->p(Z)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3, v2}, Li0/h0;->p(Z)V

    .line 409
    .line 410
    .line 411
    goto :goto_9

    .line 412
    :cond_b
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 413
    .line 414
    .line 415
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 416
    .line 417
    return-object v1
.end method
