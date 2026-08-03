.class public final synthetic Lwb/si;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lfg/a;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/a;ZLjava/lang/String;ZZLfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/si;->g:Lfg/a;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwb/si;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lwb/si;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lwb/si;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/si;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lwb/si;->l:Lfg/a;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lp/u;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v3, 0x11

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x1

    .line 26
    const/16 v6, 0x10

    .line 27
    .line 28
    if-eq v1, v6, :cond_0

    .line 29
    .line 30
    move v1, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v4

    .line 33
    :goto_0
    and-int/2addr v3, v5

    .line 34
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_13

    .line 39
    .line 40
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v3, Li0/l;->a:Li0/e;

    .line 45
    .line 46
    if-ne v1, v3, :cond_1

    .line 47
    .line 48
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-static {v1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v2, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    check-cast v1, Li0/a1;

    .line 58
    .line 59
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    check-cast v7, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-static {v7, v2}, Lwb/ho;->L6(ZLi0/h0;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v7

    .line 73
    sget-object v9, Ly0/l;->a:Ly0/l;

    .line 74
    .line 75
    const/high16 v10, 0x3f800000    # 1.0f

    .line 76
    .line 77
    invoke-static {v9, v10}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    const/16 v12, 0xc

    .line 82
    .line 83
    int-to-float v13, v12

    .line 84
    invoke-static {v13}, Lv/e;->a(F)Lv/d;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-static {v11, v13}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    sget-object v13, Lf1/c0;->b:Lf1/m0;

    .line 93
    .line 94
    invoke-static {v11, v7, v8, v13}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    if-ne v8, v3, :cond_2

    .line 103
    .line 104
    new-instance v8, Lwb/gj;

    .line 105
    .line 106
    const/16 v11, 0x8

    .line 107
    .line 108
    invoke-direct {v8, v1, v11}, Lwb/gj;-><init>(Li0/a1;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    check-cast v8, Lfg/l;

    .line 115
    .line 116
    iget-object v1, v0, Lwb/si;->g:Lfg/a;

    .line 117
    .line 118
    invoke-static {v7, v1, v8}, Lwb/ho;->N6(Ly0/o;Lfg/a;Lfg/l;)Ly0/o;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    int-to-float v6, v6

    .line 123
    const/16 v7, 0xd

    .line 124
    .line 125
    int-to-float v8, v7

    .line 126
    invoke-static {v1, v6, v8}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    sget-object v6, Lp/j;->c:Lp/e;

    .line 131
    .line 132
    sget-object v8, Ly0/b;->s:Ly0/e;

    .line 133
    .line 134
    invoke-static {v6, v8, v2, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    iget-wide v13, v2, Li0/h0;->T:J

    .line 139
    .line 140
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    invoke-static {v2, v1}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v15, Lx1/g;->f:Lx1/f;

    .line 153
    .line 154
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    sget-object v15, Lx1/f;->b:Lx1/y;

    .line 158
    .line 159
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 160
    .line 161
    .line 162
    iget-boolean v7, v2, Li0/h0;->S:Z

    .line 163
    .line 164
    if-eqz v7, :cond_3

    .line 165
    .line 166
    invoke-virtual {v2, v15}, Li0/h0;->k(Lfg/a;)V

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_3
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 171
    .line 172
    .line 173
    :goto_1
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 174
    .line 175
    invoke-static {v7, v2, v11}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    sget-object v11, Lx1/f;->d:Lx1/e;

    .line 179
    .line 180
    invoke-static {v11, v2, v14}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    sget-object v14, Lx1/f;->f:Lx1/e;

    .line 188
    .line 189
    invoke-static {v14, v2, v13}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget-object v13, Lx1/f;->g:Lx1/d;

    .line 193
    .line 194
    invoke-static {v13, v2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 195
    .line 196
    .line 197
    move-object/from16 p2, v3

    .line 198
    .line 199
    sget-object v3, Lx1/f;->c:Lx1/e;

    .line 200
    .line 201
    invoke-static {v3, v2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    sget-object v1, Ly0/b;->q:Ly0/f;

    .line 205
    .line 206
    sget-object v12, Lp/j;->a:Lp/c;

    .line 207
    .line 208
    const/16 v4, 0x30

    .line 209
    .line 210
    invoke-static {v12, v1, v2, v4}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    move-object v12, v6

    .line 215
    iget-wide v5, v2, Li0/h0;->T:J

    .line 216
    .line 217
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-static {v2, v9}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 230
    .line 231
    .line 232
    iget-boolean v10, v2, Li0/h0;->S:Z

    .line 233
    .line 234
    if-eqz v10, :cond_4

    .line 235
    .line 236
    invoke-virtual {v2, v15}, Li0/h0;->k(Lfg/a;)V

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_4
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 241
    .line 242
    .line 243
    :goto_2
    invoke-static {v7, v2, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v11, v2, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v5, v2, v14, v2, v13}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 250
    .line 251
    .line 252
    invoke-static {v3, v2, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    const/high16 v1, 0x3f800000    # 1.0f

    .line 256
    .line 257
    float-to-double v4, v1

    .line 258
    const-wide/16 v18, 0x0

    .line 259
    .line 260
    cmpl-double v4, v4, v18

    .line 261
    .line 262
    if-lez v4, :cond_5

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_5
    const-string v4, "invalid weight; must be greater than zero"

    .line 266
    .line 267
    invoke-static {v4}, Lq/a;->a(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :goto_3
    new-instance v4, Lp/q0;

    .line 271
    .line 272
    const/4 v5, 0x1

    .line 273
    invoke-direct {v4, v1, v5}, Lp/q0;-><init>(FZ)V

    .line 274
    .line 275
    .line 276
    const/4 v6, 0x0

    .line 277
    invoke-static {v12, v8, v2, v6}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    iget-wide v5, v2, Li0/h0;->T:J

    .line 282
    .line 283
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-static {v2, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 296
    .line 297
    .line 298
    iget-boolean v10, v2, Li0/h0;->S:Z

    .line 299
    .line 300
    if-eqz v10, :cond_6

    .line 301
    .line 302
    invoke-virtual {v2, v15}, Li0/h0;->k(Lfg/a;)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_6
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 307
    .line 308
    .line 309
    :goto_4
    invoke-static {v7, v2, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v11, v2, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v5, v2, v14, v2, v13}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v3, v2, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    check-cast v5, Lbi/b;

    .line 328
    .line 329
    invoke-virtual {v5}, Lbi/b;->g()J

    .line 330
    .line 331
    .line 332
    move-result-wide v5

    .line 333
    sget-object v8, Lm2/k;->j:Lm2/k;

    .line 334
    .line 335
    const/16 v23, 0x0

    .line 336
    .line 337
    const v24, 0x3ffba

    .line 338
    .line 339
    .line 340
    move-object/from16 v21, v2

    .line 341
    .line 342
    iget-object v2, v0, Lwb/si;->i:Ljava/lang/String;

    .line 343
    .line 344
    move-object v10, v3

    .line 345
    const/4 v3, 0x0

    .line 346
    move-wide/from16 v18, v5

    .line 347
    .line 348
    move-object v5, v7

    .line 349
    const-wide/16 v6, 0x0

    .line 350
    .line 351
    move-object v12, v9

    .line 352
    const/4 v9, 0x0

    .line 353
    move-object/from16 v22, v10

    .line 354
    .line 355
    move-object/from16 v20, v11

    .line 356
    .line 357
    const-wide/16 v10, 0x0

    .line 358
    .line 359
    move-object/from16 v25, v12

    .line 360
    .line 361
    const/4 v12, 0x0

    .line 362
    move-object/from16 v27, v13

    .line 363
    .line 364
    move-object/from16 v26, v14

    .line 365
    .line 366
    const-wide/16 v13, 0x0

    .line 367
    .line 368
    move-object/from16 v28, v15

    .line 369
    .line 370
    const/4 v15, 0x0

    .line 371
    const/16 v29, 0x0

    .line 372
    .line 373
    const/16 v16, 0x0

    .line 374
    .line 375
    const/16 v30, 0x1

    .line 376
    .line 377
    const/16 v17, 0x0

    .line 378
    .line 379
    move-object/from16 v31, v4

    .line 380
    .line 381
    move-wide/from16 v42, v18

    .line 382
    .line 383
    move-object/from16 v19, v5

    .line 384
    .line 385
    move-wide/from16 v4, v42

    .line 386
    .line 387
    const/16 v18, 0x0

    .line 388
    .line 389
    move-object/from16 v32, v19

    .line 390
    .line 391
    const/16 v19, 0x0

    .line 392
    .line 393
    move-object/from16 v33, v20

    .line 394
    .line 395
    const/16 v20, 0x0

    .line 396
    .line 397
    move-object/from16 v34, v22

    .line 398
    .line 399
    const/high16 v22, 0x180000

    .line 400
    .line 401
    move-object/from16 v40, p2

    .line 402
    .line 403
    move-object/from16 v41, v25

    .line 404
    .line 405
    move-object/from16 v37, v26

    .line 406
    .line 407
    move-object/from16 v38, v27

    .line 408
    .line 409
    move-object/from16 v1, v31

    .line 410
    .line 411
    move-object/from16 v35, v32

    .line 412
    .line 413
    move-object/from16 v36, v33

    .line 414
    .line 415
    move-object/from16 v39, v34

    .line 416
    .line 417
    const/16 v25, 0xc

    .line 418
    .line 419
    const/16 v26, 0xd

    .line 420
    .line 421
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 422
    .line 423
    .line 424
    move-object/from16 v27, v8

    .line 425
    .line 426
    move-object/from16 v2, v21

    .line 427
    .line 428
    new-instance v3, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    iget-boolean v4, v0, Lwb/si;->j:Z

    .line 434
    .line 435
    if-eqz v4, :cond_7

    .line 436
    .line 437
    const-string v5, "\u5f53\u524d"

    .line 438
    .line 439
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    :cond_7
    iget-boolean v5, v0, Lwb/si;->h:Z

    .line 443
    .line 444
    const-string v6, " \u00b7 "

    .line 445
    .line 446
    if-eqz v5, :cond_9

    .line 447
    .line 448
    if-nez v4, :cond_9

    .line 449
    .line 450
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    if-lez v4, :cond_8

    .line 455
    .line 456
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    :cond_8
    const-string v4, "\u5df2\u9009\u62e9"

    .line 460
    .line 461
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    :cond_9
    iget-boolean v4, v0, Lwb/si;->k:Z

    .line 465
    .line 466
    if-eqz v4, :cond_b

    .line 467
    .line 468
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    if-lez v7, :cond_a

    .line 473
    .line 474
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    :cond_a
    const-string v6, "\u5df2\u6536\u85cf"

    .line 478
    .line 479
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    :cond_b
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 483
    .line 484
    .line 485
    move-result v6

    .line 486
    if-nez v6, :cond_c

    .line 487
    .line 488
    const-string v6, "\u70b9\u51fb\u9009\u62e9"

    .line 489
    .line 490
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    :cond_c
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-virtual {v2, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    check-cast v6, Lbi/b;

    .line 502
    .line 503
    invoke-virtual {v6}, Lbi/b;->h()J

    .line 504
    .line 505
    .line 506
    move-result-wide v6

    .line 507
    invoke-static/range {v25 .. v25}, Lx6/d;->D(I)J

    .line 508
    .line 509
    .line 510
    move-result-wide v8

    .line 511
    const/16 v23, 0x0

    .line 512
    .line 513
    const v24, 0x3ffea

    .line 514
    .line 515
    .line 516
    move-object/from16 v21, v2

    .line 517
    .line 518
    move-object v2, v3

    .line 519
    const/4 v3, 0x0

    .line 520
    move v10, v4

    .line 521
    move-wide/from16 v42, v8

    .line 522
    .line 523
    move v9, v5

    .line 524
    move-wide v4, v6

    .line 525
    move-wide/from16 v6, v42

    .line 526
    .line 527
    const/4 v8, 0x0

    .line 528
    move v11, v9

    .line 529
    const/4 v9, 0x0

    .line 530
    move v13, v10

    .line 531
    move v12, v11

    .line 532
    const-wide/16 v10, 0x0

    .line 533
    .line 534
    move v14, v12

    .line 535
    const/4 v12, 0x0

    .line 536
    move/from16 v16, v13

    .line 537
    .line 538
    move v15, v14

    .line 539
    const-wide/16 v13, 0x0

    .line 540
    .line 541
    move/from16 v17, v15

    .line 542
    .line 543
    const/4 v15, 0x0

    .line 544
    move/from16 v18, v16

    .line 545
    .line 546
    const/16 v16, 0x0

    .line 547
    .line 548
    move/from16 v19, v17

    .line 549
    .line 550
    const/16 v17, 0x0

    .line 551
    .line 552
    move/from16 v20, v18

    .line 553
    .line 554
    const/16 v18, 0x0

    .line 555
    .line 556
    move/from16 v22, v19

    .line 557
    .line 558
    const/16 v19, 0x0

    .line 559
    .line 560
    move/from16 v25, v20

    .line 561
    .line 562
    const/16 v20, 0x0

    .line 563
    .line 564
    move/from16 v29, v22

    .line 565
    .line 566
    const/16 v22, 0x6000

    .line 567
    .line 568
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 569
    .line 570
    .line 571
    move-object/from16 v2, v21

    .line 572
    .line 573
    const/4 v3, 0x1

    .line 574
    invoke-virtual {v2, v3}, Li0/h0;->p(Z)V

    .line 575
    .line 576
    .line 577
    if-eqz v29, :cond_d

    .line 578
    .line 579
    const-string v4, "\u5df2\u9009"

    .line 580
    .line 581
    goto :goto_5

    .line 582
    :cond_d
    const-string v4, "\u9009\u62e9"

    .line 583
    .line 584
    :goto_5
    if-eqz v29, :cond_e

    .line 585
    .line 586
    const v5, 0x2e5c61cf

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v5}, Li0/h0;->a0(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    check-cast v5, Lbi/b;

    .line 597
    .line 598
    invoke-virtual {v5}, Lbi/b;->j()J

    .line 599
    .line 600
    .line 601
    move-result-wide v5

    .line 602
    const/4 v7, 0x0

    .line 603
    :goto_6
    invoke-virtual {v2, v7}, Li0/h0;->p(Z)V

    .line 604
    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_e
    const/4 v7, 0x0

    .line 608
    const v5, 0x2e5c665f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v5}, Li0/h0;->a0(I)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    check-cast v5, Lbi/b;

    .line 619
    .line 620
    invoke-virtual {v5}, Lbi/b;->h()J

    .line 621
    .line 622
    .line 623
    move-result-wide v5

    .line 624
    goto :goto_6

    .line 625
    :goto_7
    invoke-static/range {v26 .. v26}, Lx6/d;->D(I)J

    .line 626
    .line 627
    .line 628
    move-result-wide v8

    .line 629
    const/16 v23, 0x0

    .line 630
    .line 631
    const v24, 0x3ffaa

    .line 632
    .line 633
    .line 634
    move/from16 v17, v3

    .line 635
    .line 636
    const/4 v3, 0x0

    .line 637
    move-object/from16 v21, v2

    .line 638
    .line 639
    move-object v2, v4

    .line 640
    move-wide v4, v5

    .line 641
    move/from16 v16, v7

    .line 642
    .line 643
    move-wide v6, v8

    .line 644
    const/4 v9, 0x0

    .line 645
    const-wide/16 v10, 0x0

    .line 646
    .line 647
    const/4 v12, 0x0

    .line 648
    const-wide/16 v13, 0x0

    .line 649
    .line 650
    const/4 v15, 0x0

    .line 651
    move/from16 v29, v16

    .line 652
    .line 653
    const/16 v16, 0x0

    .line 654
    .line 655
    move/from16 v30, v17

    .line 656
    .line 657
    const/16 v17, 0x0

    .line 658
    .line 659
    const/16 v18, 0x0

    .line 660
    .line 661
    const/16 v19, 0x0

    .line 662
    .line 663
    const/16 v20, 0x0

    .line 664
    .line 665
    const v22, 0x186000

    .line 666
    .line 667
    .line 668
    move-object/from16 v31, v1

    .line 669
    .line 670
    move-object/from16 v8, v27

    .line 671
    .line 672
    move/from16 v1, v30

    .line 673
    .line 674
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 675
    .line 676
    .line 677
    move-object/from16 v2, v21

    .line 678
    .line 679
    invoke-virtual {v2, v1}, Li0/h0;->p(Z)V

    .line 680
    .line 681
    .line 682
    const/4 v3, 0x0

    .line 683
    const/4 v6, 0x0

    .line 684
    invoke-static {v3, v2, v6, v1}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 685
    .line 686
    .line 687
    move-object/from16 v12, v41

    .line 688
    .line 689
    const/high16 v3, 0x3f800000    # 1.0f

    .line 690
    .line 691
    invoke-static {v12, v3}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 692
    .line 693
    .line 694
    move-result-object v3

    .line 695
    sget-object v4, Lp/j;->b:Lp/c;

    .line 696
    .line 697
    sget-object v5, Ly0/b;->p:Ly0/f;

    .line 698
    .line 699
    const/4 v6, 0x6

    .line 700
    invoke-static {v4, v5, v2, v6}, Lp/d1;->a(Lp/g;Ly0/f;Li0/h0;I)Lp/e1;

    .line 701
    .line 702
    .line 703
    move-result-object v4

    .line 704
    iget-wide v9, v2, Li0/h0;->T:J

    .line 705
    .line 706
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 707
    .line 708
    .line 709
    move-result v5

    .line 710
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 711
    .line 712
    .line 713
    move-result-object v7

    .line 714
    invoke-static {v2, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 715
    .line 716
    .line 717
    move-result-object v3

    .line 718
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 719
    .line 720
    .line 721
    iget-boolean v9, v2, Li0/h0;->S:Z

    .line 722
    .line 723
    if-eqz v9, :cond_f

    .line 724
    .line 725
    move-object/from16 v9, v28

    .line 726
    .line 727
    invoke-virtual {v2, v9}, Li0/h0;->k(Lfg/a;)V

    .line 728
    .line 729
    .line 730
    :goto_8
    move-object/from16 v9, v35

    .line 731
    .line 732
    goto :goto_9

    .line 733
    :cond_f
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 734
    .line 735
    .line 736
    goto :goto_8

    .line 737
    :goto_9
    invoke-static {v9, v2, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    move-object/from16 v4, v36

    .line 741
    .line 742
    invoke-static {v4, v2, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    move-object/from16 v4, v37

    .line 746
    .line 747
    move-object/from16 v7, v38

    .line 748
    .line 749
    invoke-static {v5, v2, v4, v2, v7}, Lj8/b;->p(ILi0/h0;Lx1/e;Li0/h0;Lx1/d;)V

    .line 750
    .line 751
    .line 752
    move-object/from16 v10, v39

    .line 753
    .line 754
    invoke-static {v10, v2, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 755
    .line 756
    .line 757
    const/16 v3, 0xa

    .line 758
    .line 759
    int-to-float v3, v3

    .line 760
    invoke-static {v3}, Lv/e;->a(F)Lv/d;

    .line 761
    .line 762
    .line 763
    move-result-object v4

    .line 764
    invoke-static {v12, v4}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 765
    .line 766
    .line 767
    move-result-object v13

    .line 768
    iget-object v4, v0, Lwb/si;->l:Lfg/a;

    .line 769
    .line 770
    invoke-virtual {v2, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v5

    .line 774
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v7

    .line 778
    if-nez v5, :cond_10

    .line 779
    .line 780
    move-object/from16 v5, v40

    .line 781
    .line 782
    if-ne v7, v5, :cond_11

    .line 783
    .line 784
    :cond_10
    new-instance v7, Lwb/kc;

    .line 785
    .line 786
    const/16 v5, 0x18

    .line 787
    .line 788
    invoke-direct {v7, v4, v5}, Lwb/kc;-><init>(Lfg/a;I)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 792
    .line 793
    .line 794
    :cond_11
    move-object/from16 v17, v7

    .line 795
    .line 796
    check-cast v17, Lfg/a;

    .line 797
    .line 798
    const/16 v18, 0xf

    .line 799
    .line 800
    const/4 v14, 0x0

    .line 801
    const/4 v15, 0x0

    .line 802
    const/16 v16, 0x0

    .line 803
    .line 804
    invoke-static/range {v13 .. v18}, Lk/n;->j(Ly0/o;ZLjava/lang/String;Ln/k;Lfg/a;I)Ly0/o;

    .line 805
    .line 806
    .line 807
    move-result-object v4

    .line 808
    int-to-float v5, v6

    .line 809
    invoke-static {v4, v3, v5}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    if-eqz v25, :cond_12

    .line 814
    .line 815
    const-string v4, "\u53d6\u6d88\u6536\u85cf"

    .line 816
    .line 817
    :goto_a
    move-object/from16 v5, v31

    .line 818
    .line 819
    goto :goto_b

    .line 820
    :cond_12
    const-string v4, "\u6536\u85cf"

    .line 821
    .line 822
    goto :goto_a

    .line 823
    :goto_b
    invoke-virtual {v2, v5}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v5

    .line 827
    check-cast v5, Lbi/b;

    .line 828
    .line 829
    invoke-virtual {v5}, Lbi/b;->j()J

    .line 830
    .line 831
    .line 832
    move-result-wide v5

    .line 833
    invoke-static/range {v26 .. v26}, Lx6/d;->D(I)J

    .line 834
    .line 835
    .line 836
    move-result-wide v9

    .line 837
    const/16 v23, 0x0

    .line 838
    .line 839
    const v24, 0x3ffa8

    .line 840
    .line 841
    .line 842
    move-object/from16 v21, v2

    .line 843
    .line 844
    move-object v2, v4

    .line 845
    move-wide v4, v5

    .line 846
    move-wide v6, v9

    .line 847
    const/4 v9, 0x0

    .line 848
    const-wide/16 v10, 0x0

    .line 849
    .line 850
    const/4 v12, 0x0

    .line 851
    const-wide/16 v13, 0x0

    .line 852
    .line 853
    const/4 v15, 0x0

    .line 854
    const/16 v16, 0x0

    .line 855
    .line 856
    const/16 v17, 0x0

    .line 857
    .line 858
    const/16 v18, 0x0

    .line 859
    .line 860
    const/16 v19, 0x0

    .line 861
    .line 862
    const/16 v20, 0x0

    .line 863
    .line 864
    const v22, 0x186000

    .line 865
    .line 866
    .line 867
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 868
    .line 869
    .line 870
    move-object/from16 v2, v21

    .line 871
    .line 872
    invoke-virtual {v2, v1}, Li0/h0;->p(Z)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v2, v1}, Li0/h0;->p(Z)V

    .line 876
    .line 877
    .line 878
    goto :goto_c

    .line 879
    :cond_13
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 880
    .line 881
    .line 882
    :goto_c
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 883
    .line 884
    return-object v1
.end method
