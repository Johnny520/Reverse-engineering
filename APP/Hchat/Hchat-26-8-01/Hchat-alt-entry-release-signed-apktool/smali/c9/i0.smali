.class public final synthetic Lc9/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lc9/i0;->g:I

    .line 2
    .line 3
    iput-object p2, p0, Lc9/i0;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lc9/i0;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc9/i0;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v11, p1

    .line 9
    .line 10
    check-cast v11, Lfg/a;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v2, p3

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v3, v2, 0x6

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x2

    .line 40
    :goto_0
    or-int/2addr v2, v3

    .line 41
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 42
    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    if-eq v3, v4, :cond_2

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 v3, 0x0

    .line 50
    :goto_1
    and-int/lit8 v4, v2, 0x1

    .line 51
    .line 52
    invoke-virtual {v1, v4, v3}, Li0/h0;->S(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    new-instance v3, Lwb/rf;

    .line 59
    .line 60
    const/4 v4, 0x2

    .line 61
    iget-object v5, v0, Lc9/i0;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {v3, v5, v11, v4}, Lwb/rf;-><init>(Ljava/lang/String;Lfg/a;I)V

    .line 64
    .line 65
    .line 66
    const v4, -0x66d70ddd

    .line 67
    .line 68
    .line 69
    invoke-static {v4, v3, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 70
    .line 71
    .line 72
    move-result-object v17

    .line 73
    shl-int/lit8 v2, v2, 0x18

    .line 74
    .line 75
    const/high16 v3, 0xe000000

    .line 76
    .line 77
    and-int/2addr v2, v3

    .line 78
    or-int/lit8 v19, v2, 0x6

    .line 79
    .line 80
    const/16 v20, 0xc00

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    iget-object v3, v0, Lc9/i0;->h:Ljava/lang/String;

    .line 84
    .line 85
    const-wide/16 v4, 0x0

    .line 86
    .line 87
    const-wide/16 v6, 0x0

    .line 88
    .line 89
    const-wide/16 v8, 0x0

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    const-wide/16 v12, 0x0

    .line 93
    .line 94
    const-wide/16 v14, 0x0

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    move-object/from16 v18, v1

    .line 99
    .line 100
    invoke-static/range {v2 .. v20}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move-object/from16 v18, v1

    .line 105
    .line 106
    invoke-virtual/range {v18 .. v18}, Li0/h0;->V()V

    .line 107
    .line 108
    .line 109
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 110
    .line 111
    return-object v1

    .line 112
    :pswitch_0
    move-object/from16 v1, p1

    .line 113
    .line 114
    check-cast v1, Lfg/p;

    .line 115
    .line 116
    move-object/from16 v2, p2

    .line 117
    .line 118
    check-cast v2, Li0/h0;

    .line 119
    .line 120
    move-object/from16 v3, p3

    .line 121
    .line 122
    check-cast v3, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    and-int/lit8 v4, v3, 0x6

    .line 132
    .line 133
    if-nez v4, :cond_5

    .line 134
    .line 135
    invoke-virtual {v2, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_4

    .line 140
    .line 141
    const/4 v4, 0x4

    .line 142
    goto :goto_3

    .line 143
    :cond_4
    const/4 v4, 0x2

    .line 144
    :goto_3
    or-int/2addr v3, v4

    .line 145
    :cond_5
    move/from16 v25, v3

    .line 146
    .line 147
    and-int/lit8 v3, v25, 0x13

    .line 148
    .line 149
    const/16 v4, 0x12

    .line 150
    .line 151
    const/4 v5, 0x1

    .line 152
    const/4 v6, 0x0

    .line 153
    if-eq v3, v4, :cond_6

    .line 154
    .line 155
    move v3, v5

    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move v3, v6

    .line 158
    :goto_4
    and-int/lit8 v4, v25, 0x1

    .line 159
    .line 160
    invoke-virtual {v2, v4, v3}, Li0/h0;->S(IZ)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_a

    .line 165
    .line 166
    sget-object v3, Ly0/b;->g:Ly0/g;

    .line 167
    .line 168
    invoke-static {v3, v6}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iget-wide v7, v2, Li0/h0;->T:J

    .line 173
    .line 174
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    invoke-virtual {v2}, Li0/h0;->l()Ls0/h;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    sget-object v8, Ly0/l;->a:Ly0/l;

    .line 183
    .line 184
    invoke-static {v2, v8}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    sget-object v9, Lx1/g;->f:Lx1/f;

    .line 189
    .line 190
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    sget-object v9, Lx1/f;->b:Lx1/y;

    .line 194
    .line 195
    invoke-virtual {v2}, Li0/h0;->d0()V

    .line 196
    .line 197
    .line 198
    iget-boolean v10, v2, Li0/h0;->S:Z

    .line 199
    .line 200
    if-eqz v10, :cond_7

    .line 201
    .line 202
    invoke-virtual {v2, v9}, Li0/h0;->k(Lfg/a;)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_7
    invoke-virtual {v2}, Li0/h0;->n0()V

    .line 207
    .line 208
    .line 209
    :goto_5
    sget-object v9, Lx1/f;->e:Lx1/e;

    .line 210
    .line 211
    invoke-static {v9, v2, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object v3, Lx1/f;->d:Lx1/e;

    .line 215
    .line 216
    invoke-static {v3, v2, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 224
    .line 225
    invoke-static {v4, v2, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object v3, Lx1/f;->g:Lx1/d;

    .line 229
    .line 230
    invoke-static {v3, v2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 231
    .line 232
    .line 233
    sget-object v3, Lx1/f;->c:Lx1/e;

    .line 234
    .line 235
    invoke-static {v3, v2, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    iget-object v3, v0, Lc9/i0;->h:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    const/16 v26, 0xe

    .line 245
    .line 246
    if-eqz v3, :cond_9

    .line 247
    .line 248
    const v3, 0x43f10cc2

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 252
    .line 253
    .line 254
    iget-object v3, v0, Lc9/i0;->i:Ljava/lang/String;

    .line 255
    .line 256
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_8

    .line 261
    .line 262
    const-string v3, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u8d44\u6599\u5c1a\u672a\u5c31\u7eea"

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_8
    const-string v3, "\u586b\u5199\u8bc4\u8bba\u5185\u5bb9"

    .line 266
    .line 267
    :goto_6
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    check-cast v4, Lbi/b;

    .line 274
    .line 275
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 276
    .line 277
    .line 278
    move-result-wide v7

    .line 279
    move-wide/from16 v29, v7

    .line 280
    .line 281
    move v8, v5

    .line 282
    move-wide/from16 v4, v29

    .line 283
    .line 284
    move v9, v6

    .line 285
    invoke-static/range {v26 .. v26}, Lx6/d;->D(I)J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    const/16 v23, 0x0

    .line 290
    .line 291
    const v24, 0x3ffea

    .line 292
    .line 293
    .line 294
    move-object/from16 v21, v2

    .line 295
    .line 296
    move-object v2, v3

    .line 297
    const/4 v3, 0x0

    .line 298
    move v10, v8

    .line 299
    const/4 v8, 0x0

    .line 300
    move v11, v9

    .line 301
    const/4 v9, 0x0

    .line 302
    move v12, v10

    .line 303
    move v13, v11

    .line 304
    const-wide/16 v10, 0x0

    .line 305
    .line 306
    move v14, v12

    .line 307
    const/4 v12, 0x0

    .line 308
    move/from16 v16, v13

    .line 309
    .line 310
    move v15, v14

    .line 311
    const-wide/16 v13, 0x0

    .line 312
    .line 313
    move/from16 v17, v15

    .line 314
    .line 315
    const/4 v15, 0x0

    .line 316
    move/from16 v18, v16

    .line 317
    .line 318
    const/16 v16, 0x0

    .line 319
    .line 320
    move/from16 v19, v17

    .line 321
    .line 322
    const/16 v17, 0x0

    .line 323
    .line 324
    move/from16 v20, v18

    .line 325
    .line 326
    const/16 v18, 0x0

    .line 327
    .line 328
    move/from16 v22, v19

    .line 329
    .line 330
    const/16 v19, 0x0

    .line 331
    .line 332
    move/from16 v27, v20

    .line 333
    .line 334
    const/16 v20, 0x0

    .line 335
    .line 336
    move/from16 v28, v22

    .line 337
    .line 338
    const/16 v22, 0x6000

    .line 339
    .line 340
    move/from16 v0, v27

    .line 341
    .line 342
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 343
    .line 344
    .line 345
    move-object/from16 v2, v21

    .line 346
    .line 347
    invoke-virtual {v2, v0}, Li0/h0;->p(Z)V

    .line 348
    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_9
    move v0, v6

    .line 352
    const v3, 0x43f527da

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v0}, Li0/h0;->p(Z)V

    .line 359
    .line 360
    .line 361
    :goto_7
    and-int/lit8 v0, v25, 0xe

    .line 362
    .line 363
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-interface {v1, v2, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    const/4 v12, 0x1

    .line 371
    invoke-virtual {v2, v12}, Li0/h0;->p(Z)V

    .line 372
    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_a
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 376
    .line 377
    .line 378
    :goto_8
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_1
    move-object/from16 v0, p1

    .line 382
    .line 383
    check-cast v0, Lfg/p;

    .line 384
    .line 385
    move-object/from16 v1, p2

    .line 386
    .line 387
    check-cast v1, Li0/h0;

    .line 388
    .line 389
    move-object/from16 v2, p3

    .line 390
    .line 391
    check-cast v2, Ljava/lang/Integer;

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    and-int/lit8 v3, v2, 0x6

    .line 401
    .line 402
    if-nez v3, :cond_c

    .line 403
    .line 404
    invoke-virtual {v1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-eqz v3, :cond_b

    .line 409
    .line 410
    const/4 v3, 0x4

    .line 411
    goto :goto_9

    .line 412
    :cond_b
    const/4 v3, 0x2

    .line 413
    :goto_9
    or-int/2addr v2, v3

    .line 414
    :cond_c
    move/from16 v24, v2

    .line 415
    .line 416
    and-int/lit8 v2, v24, 0x13

    .line 417
    .line 418
    const/16 v3, 0x12

    .line 419
    .line 420
    const/4 v4, 0x1

    .line 421
    const/4 v5, 0x0

    .line 422
    if-eq v2, v3, :cond_d

    .line 423
    .line 424
    move v2, v4

    .line 425
    goto :goto_a

    .line 426
    :cond_d
    move v2, v5

    .line 427
    :goto_a
    and-int/lit8 v3, v24, 0x1

    .line 428
    .line 429
    invoke-virtual {v1, v3, v2}, Li0/h0;->S(IZ)Z

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    if-eqz v2, :cond_10

    .line 434
    .line 435
    sget-object v2, Ly0/b;->j:Ly0/g;

    .line 436
    .line 437
    invoke-static {v2, v5}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    iget-wide v6, v1, Li0/h0;->T:J

    .line 442
    .line 443
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    sget-object v7, Ly0/l;->a:Ly0/l;

    .line 452
    .line 453
    invoke-static {v1, v7}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    sget-object v8, Lx1/g;->f:Lx1/f;

    .line 458
    .line 459
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    sget-object v8, Lx1/f;->b:Lx1/y;

    .line 463
    .line 464
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 465
    .line 466
    .line 467
    iget-boolean v9, v1, Li0/h0;->S:Z

    .line 468
    .line 469
    if-eqz v9, :cond_e

    .line 470
    .line 471
    invoke-virtual {v1, v8}, Li0/h0;->k(Lfg/a;)V

    .line 472
    .line 473
    .line 474
    goto :goto_b

    .line 475
    :cond_e
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 476
    .line 477
    .line 478
    :goto_b
    sget-object v8, Lx1/f;->e:Lx1/e;

    .line 479
    .line 480
    invoke-static {v8, v1, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    sget-object v2, Lx1/f;->d:Lx1/e;

    .line 484
    .line 485
    invoke-static {v2, v1, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    sget-object v3, Lx1/f;->f:Lx1/e;

    .line 493
    .line 494
    invoke-static {v3, v1, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 498
    .line 499
    invoke-static {v2, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 500
    .line 501
    .line 502
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 503
    .line 504
    invoke-static {v2, v1, v7}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    move-object/from16 v2, p0

    .line 508
    .line 509
    iget-object v3, v2, Lc9/i0;->h:Ljava/lang/String;

    .line 510
    .line 511
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    if-nez v3, :cond_f

    .line 516
    .line 517
    const v3, -0x22ec3fed

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1, v3}, Li0/h0;->a0(I)V

    .line 521
    .line 522
    .line 523
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 524
    .line 525
    invoke-virtual {v1, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    check-cast v3, Lbi/b;

    .line 530
    .line 531
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 532
    .line 533
    .line 534
    move-result-wide v6

    .line 535
    const/16 v3, 0x10

    .line 536
    .line 537
    invoke-static {v3}, Lx6/d;->D(I)J

    .line 538
    .line 539
    .line 540
    move-result-wide v8

    .line 541
    const/16 v22, 0x0

    .line 542
    .line 543
    const v23, 0x3ffea

    .line 544
    .line 545
    .line 546
    move-object/from16 v20, v1

    .line 547
    .line 548
    iget-object v1, v2, Lc9/i0;->i:Ljava/lang/String;

    .line 549
    .line 550
    const/4 v2, 0x0

    .line 551
    move-wide/from16 v29, v6

    .line 552
    .line 553
    move v6, v4

    .line 554
    move-wide/from16 v3, v29

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    move v10, v5

    .line 558
    move-wide/from16 v29, v8

    .line 559
    .line 560
    move v9, v6

    .line 561
    move-wide/from16 v5, v29

    .line 562
    .line 563
    const/4 v8, 0x0

    .line 564
    move v11, v9

    .line 565
    move v12, v10

    .line 566
    const-wide/16 v9, 0x0

    .line 567
    .line 568
    move v13, v11

    .line 569
    const/4 v11, 0x0

    .line 570
    move v15, v12

    .line 571
    move v14, v13

    .line 572
    const-wide/16 v12, 0x0

    .line 573
    .line 574
    move/from16 v16, v14

    .line 575
    .line 576
    const/4 v14, 0x0

    .line 577
    move/from16 v17, v15

    .line 578
    .line 579
    const/4 v15, 0x0

    .line 580
    move/from16 v18, v16

    .line 581
    .line 582
    const/16 v16, 0x0

    .line 583
    .line 584
    move/from16 v19, v17

    .line 585
    .line 586
    const/16 v17, 0x0

    .line 587
    .line 588
    move/from16 v21, v18

    .line 589
    .line 590
    const/16 v18, 0x0

    .line 591
    .line 592
    move/from16 v25, v19

    .line 593
    .line 594
    const/16 v19, 0x0

    .line 595
    .line 596
    move/from16 v26, v21

    .line 597
    .line 598
    const/16 v21, 0x6000

    .line 599
    .line 600
    move-object/from16 p1, v0

    .line 601
    .line 602
    move/from16 v0, v25

    .line 603
    .line 604
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 605
    .line 606
    .line 607
    move-object/from16 v1, v20

    .line 608
    .line 609
    invoke-virtual {v1, v0}, Li0/h0;->p(Z)V

    .line 610
    .line 611
    .line 612
    goto :goto_c

    .line 613
    :cond_f
    move-object/from16 p1, v0

    .line 614
    .line 615
    move v0, v5

    .line 616
    const v2, -0x22e824d5

    .line 617
    .line 618
    .line 619
    invoke-virtual {v1, v2}, Li0/h0;->a0(I)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1, v0}, Li0/h0;->p(Z)V

    .line 623
    .line 624
    .line 625
    :goto_c
    and-int/lit8 v0, v24, 0xe

    .line 626
    .line 627
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    move-object/from16 v2, p1

    .line 632
    .line 633
    invoke-interface {v2, v1, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    const/4 v13, 0x1

    .line 637
    invoke-virtual {v1, v13}, Li0/h0;->p(Z)V

    .line 638
    .line 639
    .line 640
    goto :goto_d

    .line 641
    :cond_10
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 642
    .line 643
    .line 644
    :goto_d
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 645
    .line 646
    return-object v0

    .line 647
    :pswitch_2
    move-object/from16 v0, p1

    .line 648
    .line 649
    check-cast v0, Lr/d;

    .line 650
    .line 651
    move-object/from16 v1, p2

    .line 652
    .line 653
    check-cast v1, Li0/h0;

    .line 654
    .line 655
    move-object/from16 v2, p3

    .line 656
    .line 657
    check-cast v2, Ljava/lang/Integer;

    .line 658
    .line 659
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    and-int/lit8 v0, v2, 0x11

    .line 667
    .line 668
    const/16 v3, 0x10

    .line 669
    .line 670
    const/4 v4, 0x1

    .line 671
    if-eq v0, v3, :cond_11

    .line 672
    .line 673
    move v0, v4

    .line 674
    goto :goto_e

    .line 675
    :cond_11
    const/4 v0, 0x0

    .line 676
    :goto_e
    and-int/2addr v2, v4

    .line 677
    invoke-virtual {v1, v2, v0}, Li0/h0;->S(IZ)Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-eqz v0, :cond_12

    .line 682
    .line 683
    new-instance v0, Lwb/vh;

    .line 684
    .line 685
    const/4 v2, 0x0

    .line 686
    const/4 v3, 0x0

    .line 687
    move-object/from16 v5, p0

    .line 688
    .line 689
    iget-object v6, v5, Lc9/i0;->h:Ljava/lang/String;

    .line 690
    .line 691
    iget-object v7, v5, Lc9/i0;->i:Ljava/lang/String;

    .line 692
    .line 693
    invoke-direct {v0, v6, v7, v2, v3}, Lwb/vh;-><init>(Ljava/lang/String;Ljava/lang/String;IB)V

    .line 694
    .line 695
    .line 696
    const v2, 0x6d0e4f69

    .line 697
    .line 698
    .line 699
    invoke-static {v2, v0, v1}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    const/16 v2, 0x30

    .line 704
    .line 705
    const/4 v3, 0x0

    .line 706
    invoke-static {v3, v0, v1, v2, v4}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 707
    .line 708
    .line 709
    goto :goto_f

    .line 710
    :cond_12
    move-object/from16 v5, p0

    .line 711
    .line 712
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 713
    .line 714
    .line 715
    :goto_f
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 716
    .line 717
    return-object v0

    .line 718
    :pswitch_3
    move-object v5, v0

    .line 719
    move-object/from16 v0, p1

    .line 720
    .line 721
    check-cast v0, Lfg/p;

    .line 722
    .line 723
    move-object/from16 v1, p2

    .line 724
    .line 725
    check-cast v1, Li0/h0;

    .line 726
    .line 727
    move-object/from16 v2, p3

    .line 728
    .line 729
    check-cast v2, Ljava/lang/Integer;

    .line 730
    .line 731
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    and-int/lit8 v3, v2, 0x6

    .line 739
    .line 740
    if-nez v3, :cond_14

    .line 741
    .line 742
    invoke-virtual {v1, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    if-eqz v3, :cond_13

    .line 747
    .line 748
    const/4 v3, 0x4

    .line 749
    goto :goto_10

    .line 750
    :cond_13
    const/4 v3, 0x2

    .line 751
    :goto_10
    or-int/2addr v2, v3

    .line 752
    :cond_14
    and-int/lit8 v3, v2, 0x13

    .line 753
    .line 754
    const/16 v4, 0x12

    .line 755
    .line 756
    const/4 v6, 0x1

    .line 757
    const/4 v7, 0x0

    .line 758
    if-eq v3, v4, :cond_15

    .line 759
    .line 760
    move v3, v6

    .line 761
    goto :goto_11

    .line 762
    :cond_15
    move v3, v7

    .line 763
    :goto_11
    and-int/lit8 v4, v2, 0x1

    .line 764
    .line 765
    invoke-virtual {v1, v4, v3}, Li0/h0;->S(IZ)Z

    .line 766
    .line 767
    .line 768
    move-result v3

    .line 769
    if-eqz v3, :cond_18

    .line 770
    .line 771
    sget-object v3, Ly0/b;->g:Ly0/g;

    .line 772
    .line 773
    invoke-static {v3, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 774
    .line 775
    .line 776
    move-result-object v3

    .line 777
    iget-wide v8, v1, Li0/h0;->T:J

    .line 778
    .line 779
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    invoke-virtual {v1}, Li0/h0;->l()Ls0/h;

    .line 784
    .line 785
    .line 786
    move-result-object v8

    .line 787
    sget-object v9, Ly0/l;->a:Ly0/l;

    .line 788
    .line 789
    invoke-static {v1, v9}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    sget-object v10, Lx1/g;->f:Lx1/f;

    .line 794
    .line 795
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    sget-object v10, Lx1/f;->b:Lx1/y;

    .line 799
    .line 800
    invoke-virtual {v1}, Li0/h0;->d0()V

    .line 801
    .line 802
    .line 803
    iget-boolean v11, v1, Li0/h0;->S:Z

    .line 804
    .line 805
    if-eqz v11, :cond_16

    .line 806
    .line 807
    invoke-virtual {v1, v10}, Li0/h0;->k(Lfg/a;)V

    .line 808
    .line 809
    .line 810
    goto :goto_12

    .line 811
    :cond_16
    invoke-virtual {v1}, Li0/h0;->n0()V

    .line 812
    .line 813
    .line 814
    :goto_12
    sget-object v10, Lx1/f;->e:Lx1/e;

    .line 815
    .line 816
    invoke-static {v10, v1, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    sget-object v3, Lx1/f;->d:Lx1/e;

    .line 820
    .line 821
    invoke-static {v3, v1, v8}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 825
    .line 826
    .line 827
    move-result-object v3

    .line 828
    sget-object v4, Lx1/f;->f:Lx1/e;

    .line 829
    .line 830
    invoke-static {v4, v1, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    sget-object v3, Lx1/f;->g:Lx1/d;

    .line 834
    .line 835
    invoke-static {v3, v1}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 836
    .line 837
    .line 838
    sget-object v3, Lx1/f;->c:Lx1/e;

    .line 839
    .line 840
    invoke-static {v3, v1, v9}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 841
    .line 842
    .line 843
    iget-object v3, v5, Lc9/i0;->h:Ljava/lang/String;

    .line 844
    .line 845
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 846
    .line 847
    .line 848
    move-result v3

    .line 849
    if-nez v3, :cond_17

    .line 850
    .line 851
    const v3, -0x3580e503

    .line 852
    .line 853
    .line 854
    invoke-virtual {v1, v3}, Li0/h0;->a0(I)V

    .line 855
    .line 856
    .line 857
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 858
    .line 859
    invoke-virtual {v1, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    check-cast v3, Lbi/b;

    .line 864
    .line 865
    invoke-virtual {v3}, Lbi/b;->h()J

    .line 866
    .line 867
    .line 868
    move-result-wide v8

    .line 869
    const/16 v3, 0xf

    .line 870
    .line 871
    invoke-static {v3}, Lx6/d;->D(I)J

    .line 872
    .line 873
    .line 874
    move-result-wide v10

    .line 875
    const/16 v27, 0x0

    .line 876
    .line 877
    const v28, 0x3ffea

    .line 878
    .line 879
    .line 880
    move v3, v6

    .line 881
    iget-object v6, v5, Lc9/i0;->i:Ljava/lang/String;

    .line 882
    .line 883
    move v4, v7

    .line 884
    const/4 v7, 0x0

    .line 885
    const/4 v12, 0x0

    .line 886
    const/4 v13, 0x0

    .line 887
    const-wide/16 v14, 0x0

    .line 888
    .line 889
    const/16 v16, 0x0

    .line 890
    .line 891
    const-wide/16 v17, 0x0

    .line 892
    .line 893
    const/16 v19, 0x0

    .line 894
    .line 895
    const/16 v20, 0x0

    .line 896
    .line 897
    const/16 v21, 0x0

    .line 898
    .line 899
    const/16 v22, 0x0

    .line 900
    .line 901
    const/16 v23, 0x0

    .line 902
    .line 903
    const/16 v24, 0x0

    .line 904
    .line 905
    const/16 v26, 0x6000

    .line 906
    .line 907
    move-object/from16 v25, v1

    .line 908
    .line 909
    invoke-static/range {v6 .. v28}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v1, v4}, Li0/h0;->p(Z)V

    .line 913
    .line 914
    .line 915
    goto :goto_13

    .line 916
    :cond_17
    move v3, v6

    .line 917
    move v4, v7

    .line 918
    const v6, -0x357d2403    # -4287998.5f

    .line 919
    .line 920
    .line 921
    invoke-virtual {v1, v6}, Li0/h0;->a0(I)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1, v4}, Li0/h0;->p(Z)V

    .line 925
    .line 926
    .line 927
    :goto_13
    and-int/lit8 v2, v2, 0xe

    .line 928
    .line 929
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    invoke-interface {v0, v1, v2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v1, v3}, Li0/h0;->p(Z)V

    .line 937
    .line 938
    .line 939
    goto :goto_14

    .line 940
    :cond_18
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 941
    .line 942
    .line 943
    :goto_14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 944
    .line 945
    return-object v0

    .line 946
    nop

    .line 947
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
