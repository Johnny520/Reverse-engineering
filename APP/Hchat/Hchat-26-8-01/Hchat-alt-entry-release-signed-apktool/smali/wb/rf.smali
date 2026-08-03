.class public final synthetic Lwb/rf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lfg/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/rf;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/rf;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/rf;->i:Lfg/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/rf;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v11, p1

    .line 9
    .line 10
    check-cast v11, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x3

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    move v2, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v4

    .line 30
    :goto_0
    and-int/2addr v1, v5

    .line 31
    invoke-virtual {v11, v1, v2}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 38
    .line 39
    const/high16 v2, 0x3f800000    # 1.0f

    .line 40
    .line 41
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v6, Lp/j;->c:Lp/e;

    .line 46
    .line 47
    sget-object v7, Ly0/b;->s:Ly0/e;

    .line 48
    .line 49
    invoke-static {v6, v7, v11, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iget-wide v6, v11, Li0/h0;->T:J

    .line 54
    .line 55
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-virtual {v11}, Li0/h0;->l()Ls0/h;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v11, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    sget-object v8, Lx1/g;->f:Lx1/f;

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v8, Lx1/f;->b:Lx1/y;

    .line 73
    .line 74
    invoke-virtual {v11}, Li0/h0;->d0()V

    .line 75
    .line 76
    .line 77
    iget-boolean v9, v11, Li0/h0;->S:Z

    .line 78
    .line 79
    if-eqz v9, :cond_1

    .line 80
    .line 81
    invoke-virtual {v11, v8}, Li0/h0;->k(Lfg/a;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v11}, Li0/h0;->n0()V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object v8, Lx1/f;->e:Lx1/e;

    .line 89
    .line 90
    invoke-static {v8, v11, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v4, Lx1/f;->d:Lx1/e;

    .line 94
    .line 95
    invoke-static {v4, v11, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    sget-object v6, Lx1/f;->f:Lx1/e;

    .line 103
    .line 104
    invoke-static {v6, v11, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 108
    .line 109
    invoke-static {v4, v11}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 110
    .line 111
    .line 112
    sget-object v4, Lx1/f;->c:Lx1/e;

    .line 113
    .line 114
    invoke-static {v4, v11, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 118
    .line 119
    invoke-virtual {v11, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lbi/b;

    .line 124
    .line 125
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 126
    .line 127
    .line 128
    move-result-wide v3

    .line 129
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    const/16 v7, 0xa

    .line 134
    .line 135
    int-to-float v7, v7

    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-static {v6, v8, v7, v5}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    new-instance v12, Lt2/k;

    .line 142
    .line 143
    const/4 v7, 0x3

    .line 144
    invoke-direct {v12, v7}, Lt2/k;-><init>(I)V

    .line 145
    .line 146
    .line 147
    const/16 v23, 0x0

    .line 148
    .line 149
    const v24, 0x3fbf8

    .line 150
    .line 151
    .line 152
    move v7, v2

    .line 153
    iget-object v2, v0, Lwb/rf;->h:Ljava/lang/String;

    .line 154
    .line 155
    move v9, v5

    .line 156
    move v8, v7

    .line 157
    move-wide v4, v3

    .line 158
    move-object v3, v6

    .line 159
    const-wide/16 v6, 0x0

    .line 160
    .line 161
    move v10, v8

    .line 162
    const/4 v8, 0x0

    .line 163
    move v13, v9

    .line 164
    const/4 v9, 0x0

    .line 165
    move v14, v10

    .line 166
    move-object/from16 v21, v11

    .line 167
    .line 168
    const-wide/16 v10, 0x0

    .line 169
    .line 170
    move/from16 v16, v13

    .line 171
    .line 172
    move v15, v14

    .line 173
    const-wide/16 v13, 0x0

    .line 174
    .line 175
    move/from16 v17, v15

    .line 176
    .line 177
    const/4 v15, 0x0

    .line 178
    move/from16 v18, v16

    .line 179
    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    move/from16 v19, v17

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    move/from16 v20, v18

    .line 187
    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    move/from16 v22, v19

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    move/from16 v25, v20

    .line 195
    .line 196
    const/16 v20, 0x0

    .line 197
    .line 198
    move/from16 v26, v22

    .line 199
    .line 200
    const/16 v22, 0x30

    .line 201
    .line 202
    move/from16 v0, v26

    .line 203
    .line 204
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const/16 v0, 0x8

    .line 212
    .line 213
    int-to-float v4, v0

    .line 214
    const/4 v6, 0x0

    .line 215
    const/16 v7, 0xd

    .line 216
    .line 217
    const/4 v3, 0x0

    .line 218
    const/4 v5, 0x0

    .line 219
    invoke-static/range {v2 .. v7}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    const/16 v12, 0x186

    .line 224
    .line 225
    const/16 v13, 0x7f8

    .line 226
    .line 227
    const-string v2, "\u53d6\u6d88"

    .line 228
    .line 229
    move-object/from16 v0, p0

    .line 230
    .line 231
    iget-object v3, v0, Lwb/rf;->i:Lfg/a;

    .line 232
    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v7, 0x0

    .line 235
    const/4 v8, 0x0

    .line 236
    const/4 v10, 0x0

    .line 237
    move-object/from16 v11, v21

    .line 238
    .line 239
    invoke-static/range {v2 .. v13}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x1

    .line 243
    invoke-virtual {v11, v13}, Li0/h0;->p(Z)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_2
    invoke-virtual {v11}, Li0/h0;->V()V

    .line 248
    .line 249
    .line 250
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 251
    .line 252
    return-object v1

    .line 253
    :pswitch_0
    move-object/from16 v7, p1

    .line 254
    .line 255
    check-cast v7, Li0/h0;

    .line 256
    .line 257
    move-object/from16 v1, p2

    .line 258
    .line 259
    check-cast v1, Ljava/lang/Integer;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    and-int/lit8 v2, v1, 0x3

    .line 266
    .line 267
    const/4 v3, 0x2

    .line 268
    const/4 v4, 0x0

    .line 269
    const/4 v5, 0x1

    .line 270
    if-eq v2, v3, :cond_3

    .line 271
    .line 272
    move v2, v5

    .line 273
    goto :goto_3

    .line 274
    :cond_3
    move v2, v4

    .line 275
    :goto_3
    and-int/2addr v1, v5

    .line 276
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_6

    .line 281
    .line 282
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 283
    .line 284
    const/high16 v2, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    sget-object v6, Lp/j;->c:Lp/e;

    .line 291
    .line 292
    sget-object v8, Ly0/b;->s:Ly0/e;

    .line 293
    .line 294
    invoke-static {v6, v8, v7, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    iget-wide v8, v7, Li0/h0;->T:J

    .line 299
    .line 300
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    invoke-virtual {v7}, Li0/h0;->l()Ls0/h;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    invoke-static {v7, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 313
    .line 314
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 318
    .line 319
    invoke-virtual {v7}, Li0/h0;->d0()V

    .line 320
    .line 321
    .line 322
    iget-boolean v11, v7, Li0/h0;->S:Z

    .line 323
    .line 324
    if-eqz v11, :cond_4

    .line 325
    .line 326
    invoke-virtual {v7, v10}, Li0/h0;->k(Lfg/a;)V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_4
    invoke-virtual {v7}, Li0/h0;->n0()V

    .line 331
    .line 332
    .line 333
    :goto_4
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 334
    .line 335
    invoke-static {v10, v7, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    sget-object v6, Lx1/f;->d:Lx1/e;

    .line 339
    .line 340
    invoke-static {v6, v7, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    sget-object v8, Lx1/f;->f:Lx1/e;

    .line 348
    .line 349
    invoke-static {v8, v7, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    sget-object v6, Lx1/f;->g:Lx1/d;

    .line 353
    .line 354
    invoke-static {v6, v7}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 355
    .line 356
    .line 357
    sget-object v6, Lx1/f;->c:Lx1/e;

    .line 358
    .line 359
    invoke-static {v6, v7, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    iget-object v3, v0, Lwb/rf;->h:Ljava/lang/String;

    .line 363
    .line 364
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    if-nez v6, :cond_5

    .line 369
    .line 370
    const v6, -0x3a4e6d7f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v7, v6}, Li0/h0;->a0(I)V

    .line 374
    .line 375
    .line 376
    sget-object v6, Lbi/d;->a:Li0/m2;

    .line 377
    .line 378
    invoke-virtual {v7, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    check-cast v6, Lbi/b;

    .line 383
    .line 384
    invoke-virtual {v6}, Lbi/b;->h()J

    .line 385
    .line 386
    .line 387
    move-result-wide v8

    .line 388
    const/16 v6, 0xe

    .line 389
    .line 390
    invoke-static {v6}, Lx6/d;->D(I)J

    .line 391
    .line 392
    .line 393
    move-result-wide v10

    .line 394
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    const/4 v12, 0x4

    .line 399
    int-to-float v12, v12

    .line 400
    const/16 v13, 0x8

    .line 401
    .line 402
    int-to-float v13, v13

    .line 403
    invoke-static {v6, v12, v13}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    const/16 v23, 0x0

    .line 408
    .line 409
    const v24, 0x3ffe8

    .line 410
    .line 411
    .line 412
    move v12, v5

    .line 413
    move-wide/from16 v28, v8

    .line 414
    .line 415
    move v9, v4

    .line 416
    move-wide/from16 v4, v28

    .line 417
    .line 418
    const/4 v8, 0x0

    .line 419
    move v13, v9

    .line 420
    const/4 v9, 0x0

    .line 421
    move v14, v2

    .line 422
    move-object v2, v3

    .line 423
    move-object v3, v6

    .line 424
    move-object/from16 v21, v7

    .line 425
    .line 426
    move-wide v6, v10

    .line 427
    const-wide/16 v10, 0x0

    .line 428
    .line 429
    move v15, v12

    .line 430
    const/4 v12, 0x0

    .line 431
    move/from16 v17, v13

    .line 432
    .line 433
    move/from16 v16, v14

    .line 434
    .line 435
    const-wide/16 v13, 0x0

    .line 436
    .line 437
    move/from16 v18, v15

    .line 438
    .line 439
    const/4 v15, 0x0

    .line 440
    move/from16 v19, v16

    .line 441
    .line 442
    const/16 v16, 0x0

    .line 443
    .line 444
    move/from16 v20, v17

    .line 445
    .line 446
    const/16 v17, 0x0

    .line 447
    .line 448
    move/from16 v22, v18

    .line 449
    .line 450
    const/16 v18, 0x0

    .line 451
    .line 452
    move/from16 v25, v19

    .line 453
    .line 454
    const/16 v19, 0x0

    .line 455
    .line 456
    move/from16 v26, v20

    .line 457
    .line 458
    const/16 v20, 0x0

    .line 459
    .line 460
    move/from16 v27, v22

    .line 461
    .line 462
    const/16 v22, 0x6030

    .line 463
    .line 464
    move/from16 v0, v26

    .line 465
    .line 466
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 467
    .line 468
    .line 469
    move-object/from16 v7, v21

    .line 470
    .line 471
    invoke-virtual {v7, v0}, Li0/h0;->p(Z)V

    .line 472
    .line 473
    .line 474
    goto :goto_5

    .line 475
    :cond_5
    move v0, v4

    .line 476
    const v2, -0x3a492a73

    .line 477
    .line 478
    .line 479
    invoke-virtual {v7, v2}, Li0/h0;->a0(I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v7, v0}, Li0/h0;->p(Z)V

    .line 483
    .line 484
    .line 485
    :goto_5
    sget-object v2, Lwb/y2;->p:Lwb/y2;

    .line 486
    .line 487
    const/high16 v14, 0x3f800000    # 1.0f

    .line 488
    .line 489
    invoke-static {v1, v14}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 490
    .line 491
    .line 492
    move-result-object v8

    .line 493
    const/16 v0, 0xa

    .line 494
    .line 495
    int-to-float v10, v0

    .line 496
    const/4 v0, 0x6

    .line 497
    int-to-float v12, v0

    .line 498
    const/4 v13, 0x5

    .line 499
    const/4 v9, 0x0

    .line 500
    const/4 v11, 0x0

    .line 501
    invoke-static/range {v8 .. v13}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    const/16 v8, 0x6d86

    .line 506
    .line 507
    const/4 v9, 0x0

    .line 508
    const-string v3, "\u786e\u5b9a"

    .line 509
    .line 510
    move-object/from16 v0, p0

    .line 511
    .line 512
    iget-object v4, v0, Lwb/rf;->i:Lfg/a;

    .line 513
    .line 514
    const/4 v6, 0x1

    .line 515
    invoke-virtual/range {v2 .. v9}, Lwb/y2;->k(Ljava/lang/String;Lfg/a;Ly0/o;ZLi0/h0;II)V

    .line 516
    .line 517
    .line 518
    const/4 v15, 0x1

    .line 519
    invoke-virtual {v7, v15}, Li0/h0;->p(Z)V

    .line 520
    .line 521
    .line 522
    goto :goto_6

    .line 523
    :cond_6
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 524
    .line 525
    .line 526
    :goto_6
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 527
    .line 528
    return-object v1

    .line 529
    :pswitch_1
    move-object/from16 v1, p1

    .line 530
    .line 531
    check-cast v1, Li0/h0;

    .line 532
    .line 533
    move-object/from16 v2, p2

    .line 534
    .line 535
    check-cast v2, Ljava/lang/Integer;

    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    and-int/lit8 v3, v2, 0x3

    .line 542
    .line 543
    const/4 v4, 0x2

    .line 544
    const/4 v5, 0x1

    .line 545
    if-eq v3, v4, :cond_7

    .line 546
    .line 547
    move v3, v5

    .line 548
    goto :goto_7

    .line 549
    :cond_7
    const/4 v3, 0x0

    .line 550
    :goto_7
    and-int/2addr v2, v5

    .line 551
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    if-eqz v2, :cond_8

    .line 556
    .line 557
    const-string v2, "\u8f6c\u53d1\u597d\u53cb"

    .line 558
    .line 559
    const/4 v3, 0x6

    .line 560
    iget-object v4, v0, Lwb/rf;->h:Ljava/lang/String;

    .line 561
    .line 562
    iget-object v5, v0, Lwb/rf;->i:Lfg/a;

    .line 563
    .line 564
    invoke-static {v2, v4, v5, v1, v3}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 565
    .line 566
    .line 567
    goto :goto_8

    .line 568
    :cond_8
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 569
    .line 570
    .line 571
    :goto_8
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 572
    .line 573
    return-object v1

    .line 574
    nop

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
