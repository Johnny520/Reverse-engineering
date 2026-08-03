.class public final synthetic Lf0/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lf0/h;->g:I

    iput-object p1, p0, Lf0/h;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyg/b;Lyg/a;)V
    .locals 0

    .line 1
    const/16 p2, 0xe

    .line 2
    .line 3
    iput p2, p0, Lf0/h;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lf0/h;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lf0/h;->g:I

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/16 v3, 0xc

    .line 8
    .line 9
    const/16 v4, 0xa

    .line 10
    .line 11
    sget-object v5, Li0/l;->a:Li0/e;

    .line 12
    .line 13
    const/16 v6, 0x30

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/16 v8, 0x10

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    sget-object v11, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    iget-object v12, v0, Lf0/h;->h:Ljava/lang/Object;

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    check-cast v12, Lyg/f;

    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Throwable;

    .line 32
    .line 33
    move-object/from16 v1, p2

    .line 34
    .line 35
    check-cast v1, Lsf/n;

    .line 36
    .line 37
    move-object/from16 v1, p3

    .line 38
    .line 39
    check-cast v1, Lwf/g;

    .line 40
    .line 41
    invoke-virtual {v12}, Lyg/f;->b()V

    .line 42
    .line 43
    .line 44
    return-object v11

    .line 45
    :pswitch_0
    check-cast v12, Lyg/b;

    .line 46
    .line 47
    move-object/from16 v1, p1

    .line 48
    .line 49
    check-cast v1, Ljava/lang/Throwable;

    .line 50
    .line 51
    move-object/from16 v1, p2

    .line 52
    .line 53
    check-cast v1, Lsf/n;

    .line 54
    .line 55
    move-object/from16 v1, p3

    .line 56
    .line 57
    check-cast v1, Lwf/g;

    .line 58
    .line 59
    sget-object v1, Lyg/b;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    .line 61
    invoke-virtual {v1, v12, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v12, v7}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v11

    .line 68
    :pswitch_1
    check-cast v12, Landroid/widget/FrameLayout;

    .line 69
    .line 70
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Lp/r;

    .line 73
    .line 74
    move-object/from16 v2, p2

    .line 75
    .line 76
    check-cast v2, Li0/h0;

    .line 77
    .line 78
    move-object/from16 v3, p3

    .line 79
    .line 80
    check-cast v3, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    and-int/lit8 v1, v3, 0x11

    .line 90
    .line 91
    if-eq v1, v8, :cond_0

    .line 92
    .line 93
    move v10, v9

    .line 94
    :cond_0
    and-int/lit8 v1, v3, 0x1

    .line 95
    .line 96
    invoke-virtual {v2, v1, v10}, Li0/h0;->S(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    invoke-virtual {v2, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-nez v1, :cond_1

    .line 111
    .line 112
    if-ne v3, v5, :cond_2

    .line 113
    .line 114
    :cond_1
    new-instance v3, Lwb/ar;

    .line 115
    .line 116
    invoke-direct {v3, v12, v9}, Lwb/ar;-><init>(Landroid/widget/FrameLayout;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    move-object v13, v3

    .line 123
    check-cast v13, Lfg/l;

    .line 124
    .line 125
    sget-object v14, Lp/h1;->c:Lp/a0;

    .line 126
    .line 127
    const/16 v17, 0x30

    .line 128
    .line 129
    const/16 v18, 0x4

    .line 130
    .line 131
    const/4 v15, 0x0

    .line 132
    move-object/from16 v16, v2

    .line 133
    .line 134
    invoke-static/range {v13 .. v18}, Lx2/i;->b(Lfg/l;Ly0/o;Lfg/l;Li0/h0;II)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    move-object/from16 v16, v2

    .line 139
    .line 140
    invoke-virtual/range {v16 .. v16}, Li0/h0;->V()V

    .line 141
    .line 142
    .line 143
    :goto_0
    return-object v11

    .line 144
    :pswitch_2
    check-cast v12, Lba/a;

    .line 145
    .line 146
    move-object/from16 v1, p1

    .line 147
    .line 148
    check-cast v1, Lr/d;

    .line 149
    .line 150
    move-object/from16 v2, p2

    .line 151
    .line 152
    check-cast v2, Li0/h0;

    .line 153
    .line 154
    move-object/from16 v5, p3

    .line 155
    .line 156
    check-cast v5, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    and-int/lit8 v1, v5, 0x11

    .line 166
    .line 167
    if-eq v1, v8, :cond_4

    .line 168
    .line 169
    move v10, v9

    .line 170
    :cond_4
    and-int/lit8 v1, v5, 0x1

    .line 171
    .line 172
    invoke-virtual {v2, v1, v10}, Li0/h0;->S(IZ)Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    int-to-float v15, v4

    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/16 v18, 0xd

    .line 182
    .line 183
    sget-object v13, Ly0/l;->a:Ly0/l;

    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    const/16 v16, 0x0

    .line 187
    .line 188
    invoke-static/range {v13 .. v18}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iget-object v4, v12, Lba/a;->g:Ljava/lang/String;

    .line 193
    .line 194
    const-string v5, "\u6c14\u6ce1"

    .line 195
    .line 196
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {v4, v1, v2, v6, v3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_5
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 205
    .line 206
    .line 207
    :goto_1
    return-object v11

    .line 208
    :pswitch_3
    check-cast v12, Lfg/p;

    .line 209
    .line 210
    move-object/from16 v1, p1

    .line 211
    .line 212
    check-cast v1, Lp/u;

    .line 213
    .line 214
    move-object/from16 v2, p2

    .line 215
    .line 216
    check-cast v2, Li0/h0;

    .line 217
    .line 218
    move-object/from16 v3, p3

    .line 219
    .line 220
    check-cast v3, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    and-int/lit8 v1, v3, 0x11

    .line 230
    .line 231
    if-eq v1, v8, :cond_6

    .line 232
    .line 233
    move v1, v9

    .line 234
    goto :goto_2

    .line 235
    :cond_6
    move v1, v10

    .line 236
    :goto_2
    and-int/2addr v3, v9

    .line 237
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_7

    .line 242
    .line 243
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-interface {v12, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_7
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 252
    .line 253
    .line 254
    :goto_3
    return-object v11

    .line 255
    :pswitch_4
    check-cast v12, Lsh/x;

    .line 256
    .line 257
    move-object/from16 v1, p1

    .line 258
    .line 259
    check-cast v1, Lp/x0;

    .line 260
    .line 261
    move-object/from16 v2, p2

    .line 262
    .line 263
    check-cast v2, Li0/h0;

    .line 264
    .line 265
    move-object/from16 v3, p3

    .line 266
    .line 267
    check-cast v3, Ljava/lang/Integer;

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    and-int/lit8 v4, v3, 0x6

    .line 277
    .line 278
    if-nez v4, :cond_9

    .line 279
    .line 280
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-eqz v4, :cond_8

    .line 285
    .line 286
    const/4 v4, 0x4

    .line 287
    goto :goto_4

    .line 288
    :cond_8
    const/4 v4, 0x2

    .line 289
    :goto_4
    or-int/2addr v3, v4

    .line 290
    :cond_9
    and-int/lit8 v4, v3, 0x13

    .line 291
    .line 292
    const/16 v6, 0x12

    .line 293
    .line 294
    if-eq v4, v6, :cond_a

    .line 295
    .line 296
    move v10, v9

    .line 297
    :cond_a
    and-int/2addr v3, v9

    .line 298
    invoke-virtual {v2, v3, v10}, Li0/h0;->S(IZ)Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    if-eqz v3, :cond_c

    .line 303
    .line 304
    sget-object v3, Lp/h1;->c:Lp/a0;

    .line 305
    .line 306
    iget-object v4, v12, Lsh/x;->e:Lm/a;

    .line 307
    .line 308
    invoke-static {v3, v4, v7}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 309
    .line 310
    .line 311
    move-result-object v13

    .line 312
    invoke-interface {v1}, Lp/x0;->c()F

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    const/16 v4, 0x8

    .line 317
    .line 318
    int-to-float v4, v4

    .line 319
    add-float/2addr v3, v4

    .line 320
    invoke-interface {v1}, Lp/x0;->a()F

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    const/16 v4, 0x54

    .line 325
    .line 326
    int-to-float v4, v4

    .line 327
    add-float/2addr v1, v4

    .line 328
    const/4 v4, 0x5

    .line 329
    invoke-static {v3, v1, v4}, Lp/d;->b(FFI)Lp/z0;

    .line 330
    .line 331
    .line 332
    move-result-object v15

    .line 333
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    if-ne v1, v5, :cond_b

    .line 338
    .line 339
    new-instance v1, Lw0/l;

    .line 340
    .line 341
    const/16 v3, 0x19

    .line 342
    .line 343
    invoke-direct {v1, v3}, Lw0/l;-><init>(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    :cond_b
    move-object/from16 v21, v1

    .line 350
    .line 351
    check-cast v21, Lfg/l;

    .line 352
    .line 353
    const/high16 v23, 0x30000000

    .line 354
    .line 355
    const/16 v24, 0x1fa

    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const/16 v16, 0x0

    .line 359
    .line 360
    const/16 v17, 0x0

    .line 361
    .line 362
    const/16 v18, 0x0

    .line 363
    .line 364
    const/16 v19, 0x0

    .line 365
    .line 366
    const/16 v20, 0x0

    .line 367
    .line 368
    move-object/from16 v22, v2

    .line 369
    .line 370
    invoke-static/range {v13 .. v24}, La/a;->b(Ly0/o;Lr/z;Lp/x0;Lp/i;Ly0/e;Lm/p;ZLk/k1;Lfg/l;Li0/h0;II)V

    .line 371
    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_c
    move-object/from16 v22, v2

    .line 375
    .line 376
    invoke-virtual/range {v22 .. v22}, Li0/h0;->V()V

    .line 377
    .line 378
    .line 379
    :goto_5
    return-object v11

    .line 380
    :pswitch_5
    check-cast v12, Lwb/s0;

    .line 381
    .line 382
    move-object/from16 v1, p1

    .line 383
    .line 384
    check-cast v1, Lr/d;

    .line 385
    .line 386
    move-object/from16 v2, p2

    .line 387
    .line 388
    check-cast v2, Li0/h0;

    .line 389
    .line 390
    move-object/from16 v5, p3

    .line 391
    .line 392
    check-cast v5, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    and-int/lit8 v1, v5, 0x11

    .line 402
    .line 403
    if-eq v1, v8, :cond_d

    .line 404
    .line 405
    move v10, v9

    .line 406
    :cond_d
    and-int/lit8 v1, v5, 0x1

    .line 407
    .line 408
    invoke-virtual {v2, v1, v10}, Li0/h0;->S(IZ)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-eqz v1, :cond_f

    .line 413
    .line 414
    int-to-float v15, v4

    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    const/16 v18, 0xd

    .line 418
    .line 419
    sget-object v13, Ly0/l;->a:Ly0/l;

    .line 420
    .line 421
    const/4 v14, 0x0

    .line 422
    const/16 v16, 0x0

    .line 423
    .line 424
    invoke-static/range {v13 .. v18}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    if-nez v12, :cond_e

    .line 429
    .line 430
    const-string v4, "\u7fa4\u804a"

    .line 431
    .line 432
    goto :goto_6

    .line 433
    :cond_e
    const-string v4, "\u7fa4\u6210\u5458"

    .line 434
    .line 435
    :goto_6
    invoke-static {v4, v1, v2, v6, v3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 436
    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_f
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 440
    .line 441
    .line 442
    :goto_7
    return-object v11

    .line 443
    :pswitch_6
    check-cast v12, Ljava/util/ArrayList;

    .line 444
    .line 445
    move-object/from16 v1, p1

    .line 446
    .line 447
    check-cast v1, Lr/d;

    .line 448
    .line 449
    move-object/from16 v2, p2

    .line 450
    .line 451
    check-cast v2, Li0/h0;

    .line 452
    .line 453
    move-object/from16 v5, p3

    .line 454
    .line 455
    check-cast v5, Ljava/lang/Integer;

    .line 456
    .line 457
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v5

    .line 461
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    and-int/lit8 v1, v5, 0x11

    .line 465
    .line 466
    if-eq v1, v8, :cond_10

    .line 467
    .line 468
    move v10, v9

    .line 469
    :cond_10
    and-int/lit8 v1, v5, 0x1

    .line 470
    .line 471
    invoke-virtual {v2, v1, v10}, Li0/h0;->S(IZ)Z

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    if-eqz v1, :cond_12

    .line 476
    .line 477
    int-to-float v15, v4

    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/16 v18, 0xd

    .line 481
    .line 482
    sget-object v13, Ly0/l;->a:Ly0/l;

    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    const/16 v16, 0x0

    .line 486
    .line 487
    invoke-static/range {v13 .. v18}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    if-eqz v4, :cond_11

    .line 496
    .line 497
    const-string v4, "\u5173\u952e\u8bcd"

    .line 498
    .line 499
    goto :goto_8

    .line 500
    :cond_11
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    const-string v5, "\u5173\u952e\u8bcd \u00b7 "

    .line 505
    .line 506
    const-string v7, " \u4e2a"

    .line 507
    .line 508
    invoke-static {v4, v5, v7}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v4

    .line 512
    :goto_8
    invoke-static {v4, v1, v2, v6, v3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 513
    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_12
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 517
    .line 518
    .line 519
    :goto_9
    return-object v11

    .line 520
    :pswitch_7
    check-cast v12, Lwb/h5;

    .line 521
    .line 522
    move-object/from16 v1, p1

    .line 523
    .line 524
    check-cast v1, Lr/d;

    .line 525
    .line 526
    move-object/from16 v2, p2

    .line 527
    .line 528
    check-cast v2, Li0/h0;

    .line 529
    .line 530
    move-object/from16 v3, p3

    .line 531
    .line 532
    check-cast v3, Ljava/lang/Integer;

    .line 533
    .line 534
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    and-int/lit8 v1, v3, 0x11

    .line 542
    .line 543
    if-eq v1, v8, :cond_13

    .line 544
    .line 545
    move v10, v9

    .line 546
    :cond_13
    and-int/lit8 v1, v3, 0x1

    .line 547
    .line 548
    invoke-virtual {v2, v1, v10}, Li0/h0;->S(IZ)Z

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    if-eqz v1, :cond_14

    .line 553
    .line 554
    new-instance v1, Lb0/t;

    .line 555
    .line 556
    const/16 v3, 0x1c

    .line 557
    .line 558
    invoke-direct {v1, v12, v3}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 559
    .line 560
    .line 561
    const v3, 0x1624da17

    .line 562
    .line 563
    .line 564
    invoke-static {v3, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-static {v7, v1, v2, v6, v9}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 569
    .line 570
    .line 571
    goto :goto_a

    .line 572
    :cond_14
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 573
    .line 574
    .line 575
    :goto_a
    return-object v11

    .line 576
    :pswitch_8
    check-cast v12, Ldb/c;

    .line 577
    .line 578
    move-object/from16 v1, p1

    .line 579
    .line 580
    check-cast v1, Lr/d;

    .line 581
    .line 582
    move-object/from16 v2, p2

    .line 583
    .line 584
    check-cast v2, Li0/h0;

    .line 585
    .line 586
    move-object/from16 v5, p3

    .line 587
    .line 588
    check-cast v5, Ljava/lang/Integer;

    .line 589
    .line 590
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    and-int/lit8 v1, v5, 0x11

    .line 598
    .line 599
    if-eq v1, v8, :cond_15

    .line 600
    .line 601
    move v10, v9

    .line 602
    :cond_15
    and-int/lit8 v1, v5, 0x1

    .line 603
    .line 604
    invoke-virtual {v2, v1, v10}, Li0/h0;->S(IZ)Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    if-eqz v1, :cond_17

    .line 609
    .line 610
    int-to-float v15, v4

    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    const/16 v18, 0xd

    .line 614
    .line 615
    sget-object v13, Ly0/l;->a:Ly0/l;

    .line 616
    .line 617
    const/4 v14, 0x0

    .line 618
    const/16 v16, 0x0

    .line 619
    .line 620
    invoke-static/range {v13 .. v18}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    iget v4, v12, Ldb/c;->r:I

    .line 625
    .line 626
    if-ne v4, v9, :cond_16

    .line 627
    .line 628
    const-string v4, "\u670b\u53cb\u5708\u5185\u5bb9"

    .line 629
    .line 630
    goto :goto_b

    .line 631
    :cond_16
    const-string v4, "\u53d1\u9001\u5185\u5bb9"

    .line 632
    .line 633
    :goto_b
    invoke-static {v4, v1, v2, v6, v3}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 634
    .line 635
    .line 636
    goto :goto_c

    .line 637
    :cond_17
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 638
    .line 639
    .line 640
    :goto_c
    return-object v11

    .line 641
    :pswitch_9
    check-cast v12, Lvb/a;

    .line 642
    .line 643
    move-object/from16 v1, p1

    .line 644
    .line 645
    check-cast v1, Lr/d;

    .line 646
    .line 647
    move-object/from16 v3, p2

    .line 648
    .line 649
    check-cast v3, Li0/h0;

    .line 650
    .line 651
    move-object/from16 v4, p3

    .line 652
    .line 653
    check-cast v4, Ljava/lang/Integer;

    .line 654
    .line 655
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    and-int/lit8 v1, v4, 0x11

    .line 663
    .line 664
    if-eq v1, v8, :cond_18

    .line 665
    .line 666
    move v1, v9

    .line 667
    goto :goto_d

    .line 668
    :cond_18
    move v1, v10

    .line 669
    :goto_d
    and-int/2addr v4, v9

    .line 670
    invoke-virtual {v3, v4, v1}, Li0/h0;->S(IZ)Z

    .line 671
    .line 672
    .line 673
    move-result v1

    .line 674
    if-eqz v1, :cond_19

    .line 675
    .line 676
    invoke-interface {v12}, Lvb/a;->b()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-static {v1, v7, v3, v10, v2}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 681
    .line 682
    .line 683
    goto :goto_e

    .line 684
    :cond_19
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 685
    .line 686
    .line 687
    :goto_e
    return-object v11

    .line 688
    :pswitch_a
    check-cast v12, Lc9/u;

    .line 689
    .line 690
    move-object/from16 v1, p1

    .line 691
    .line 692
    check-cast v1, Ly0/o;

    .line 693
    .line 694
    move-object/from16 v1, p2

    .line 695
    .line 696
    check-cast v1, Li0/h0;

    .line 697
    .line 698
    move-object/from16 v3, p3

    .line 699
    .line 700
    check-cast v3, Ljava/lang/Integer;

    .line 701
    .line 702
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    const v3, -0x620472b

    .line 706
    .line 707
    .line 708
    invoke-virtual {v1, v3}, Li0/h0;->a0(I)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    if-ne v3, v5, :cond_1a

    .line 716
    .line 717
    invoke-static {v1}, Li0/r;->n(Li0/h0;)Lqg/t;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    invoke-virtual {v1, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    :cond_1a
    check-cast v3, Lqg/t;

    .line 725
    .line 726
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v4

    .line 730
    if-ne v4, v5, :cond_1b

    .line 731
    .line 732
    invoke-static {v7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    invoke-virtual {v1, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    :cond_1b
    check-cast v4, Li0/a1;

    .line 740
    .line 741
    invoke-static {v12, v1}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 742
    .line 743
    .line 744
    move-result-object v6

    .line 745
    invoke-virtual {v1, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 746
    .line 747
    .line 748
    move-result v8

    .line 749
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v9

    .line 753
    if-nez v8, :cond_1c

    .line 754
    .line 755
    if-ne v9, v5, :cond_1d

    .line 756
    .line 757
    :cond_1c
    new-instance v9, Lb0/l;

    .line 758
    .line 759
    invoke-direct {v9, v4, v2}, Lb0/l;-><init>(Li0/a1;I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v9}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    :cond_1d
    check-cast v9, Lfg/l;

    .line 766
    .line 767
    invoke-static {v7, v9, v1}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v1, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    invoke-virtual {v1, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result v8

    .line 778
    or-int/2addr v2, v8

    .line 779
    invoke-virtual {v1, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 780
    .line 781
    .line 782
    move-result v8

    .line 783
    or-int/2addr v2, v8

    .line 784
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v8

    .line 788
    if-nez v2, :cond_1e

    .line 789
    .line 790
    if-ne v8, v5, :cond_1f

    .line 791
    .line 792
    :cond_1e
    new-instance v8, Lw/f1;

    .line 793
    .line 794
    invoke-direct {v8, v3, v4, v6, v10}, Lw/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v1, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    :cond_1f
    check-cast v8, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 801
    .line 802
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 803
    .line 804
    invoke-static {v2, v7, v8}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    invoke-virtual {v1, v10}, Li0/h0;->p(Z)V

    .line 809
    .line 810
    .line 811
    return-object v2

    .line 812
    :pswitch_b
    check-cast v12, Lnb/a;

    .line 813
    .line 814
    move-object/from16 v1, p1

    .line 815
    .line 816
    check-cast v1, Ljava/lang/Throwable;

    .line 817
    .line 818
    move-object/from16 v2, p3

    .line 819
    .line 820
    check-cast v2, Lwf/g;

    .line 821
    .line 822
    invoke-virtual {v12, v1}, Lnb/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    return-object v11

    .line 826
    :pswitch_c
    check-cast v12, Lh0/y;

    .line 827
    .line 828
    move-object/from16 v1, p1

    .line 829
    .line 830
    check-cast v1, Ls1/t;

    .line 831
    .line 832
    move-object/from16 v1, p2

    .line 833
    .line 834
    check-cast v1, Ls1/t;

    .line 835
    .line 836
    move-object/from16 v2, p3

    .line 837
    .line 838
    check-cast v2, Le1/b;

    .line 839
    .line 840
    iget-wide v1, v1, Ls1/t;->c:J

    .line 841
    .line 842
    iget-object v3, v12, Lh0/y;->h:Lw/y0;

    .line 843
    .line 844
    sget-object v4, Lh0/w;->d:Lg1/d;

    .line 845
    .line 846
    invoke-interface {v3, v1, v2, v4}, Lw/y0;->a(JLg1/d;)V

    .line 847
    .line 848
    .line 849
    return-object v11

    .line 850
    :pswitch_d
    check-cast v12, Lh0/d1;

    .line 851
    .line 852
    move-object/from16 v1, p1

    .line 853
    .line 854
    check-cast v1, Ly0/o;

    .line 855
    .line 856
    move-object/from16 v2, p2

    .line 857
    .line 858
    check-cast v2, Li0/h0;

    .line 859
    .line 860
    move-object/from16 v3, p3

    .line 861
    .line 862
    check-cast v3, Ljava/lang/Integer;

    .line 863
    .line 864
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    const v3, 0x760d4197

    .line 868
    .line 869
    .line 870
    invoke-virtual {v2, v3}, Li0/h0;->a0(I)V

    .line 871
    .line 872
    .line 873
    sget-object v3, Ly1/h1;->h:Li0/m2;

    .line 874
    .line 875
    invoke-virtual {v2, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v3

    .line 879
    check-cast v3, Lu2/c;

    .line 880
    .line 881
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    if-ne v4, v5, :cond_20

    .line 886
    .line 887
    new-instance v4, Lu2/l;

    .line 888
    .line 889
    const-wide/16 v6, 0x0

    .line 890
    .line 891
    invoke-direct {v4, v6, v7}, Lu2/l;-><init>(J)V

    .line 892
    .line 893
    .line 894
    invoke-static {v4}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    invoke-virtual {v2, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    :cond_20
    check-cast v4, Li0/a1;

    .line 902
    .line 903
    invoke-virtual {v2, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v6

    .line 907
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    if-nez v6, :cond_21

    .line 912
    .line 913
    if-ne v7, v5, :cond_22

    .line 914
    .line 915
    :cond_21
    new-instance v7, Laa/c;

    .line 916
    .line 917
    const/16 v6, 0xb

    .line 918
    .line 919
    invoke-direct {v7, v12, v6, v4}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v2, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    :cond_22
    check-cast v7, Lfg/a;

    .line 926
    .line 927
    invoke-virtual {v2, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 928
    .line 929
    .line 930
    move-result v6

    .line 931
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v8

    .line 935
    if-nez v6, :cond_23

    .line 936
    .line 937
    if-ne v8, v5, :cond_24

    .line 938
    .line 939
    :cond_23
    new-instance v8, Lh0/h1;

    .line 940
    .line 941
    invoke-direct {v8, v3, v4, v9}, Lh0/h1;-><init>(Lu2/c;Li0/a1;I)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v2, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 945
    .line 946
    .line 947
    :cond_24
    check-cast v8, Lfg/l;

    .line 948
    .line 949
    sget-object v3, Lh0/m0;->a:Li/n;

    .line 950
    .line 951
    new-instance v3, Lh0/j0;

    .line 952
    .line 953
    invoke-direct {v3, v7, v8}, Lh0/j0;-><init>(Lfg/a;Lfg/l;)V

    .line 954
    .line 955
    .line 956
    invoke-static {v1, v3}, Ly0/a;->a(Ly0/o;Lfg/q;)Ly0/o;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    invoke-virtual {v2, v10}, Li0/h0;->p(Z)V

    .line 961
    .line 962
    .line 963
    return-object v1

    .line 964
    :pswitch_e
    check-cast v12, Lf0/i;

    .line 965
    .line 966
    move-object/from16 v1, p1

    .line 967
    .line 968
    check-cast v1, Ljava/lang/Integer;

    .line 969
    .line 970
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 971
    .line 972
    .line 973
    move-result v1

    .line 974
    move-object/from16 v2, p2

    .line 975
    .line 976
    check-cast v2, Ljava/lang/Integer;

    .line 977
    .line 978
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 979
    .line 980
    .line 981
    move-result v2

    .line 982
    move-object/from16 v3, p3

    .line 983
    .line 984
    check-cast v3, Ljava/lang/Boolean;

    .line 985
    .line 986
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    if-eqz v3, :cond_25

    .line 991
    .line 992
    goto :goto_f

    .line 993
    :cond_25
    iget-object v4, v12, Lf0/i;->A:Lb5/k;

    .line 994
    .line 995
    invoke-virtual {v4, v1}, Lb5/k;->n(I)I

    .line 996
    .line 997
    .line 998
    :goto_f
    if-eqz v3, :cond_26

    .line 999
    .line 1000
    goto :goto_10

    .line 1001
    :cond_26
    iget-object v4, v12, Lf0/i;->A:Lb5/k;

    .line 1002
    .line 1003
    invoke-virtual {v4, v2}, Lb5/k;->n(I)I

    .line 1004
    .line 1005
    .line 1006
    :goto_10
    iget-boolean v4, v12, Lf0/i;->z:Z

    .line 1007
    .line 1008
    if-nez v4, :cond_27

    .line 1009
    .line 1010
    goto :goto_11

    .line 1011
    :cond_27
    iget-object v4, v12, Lf0/i;->x:Ln2/s;

    .line 1012
    .line 1013
    iget-wide v4, v4, Ln2/s;->b:J

    .line 1014
    .line 1015
    sget v6, Li2/m0;->c:I

    .line 1016
    .line 1017
    const/16 v6, 0x20

    .line 1018
    .line 1019
    shr-long v13, v4, v6

    .line 1020
    .line 1021
    long-to-int v6, v13

    .line 1022
    if-ne v1, v6, :cond_28

    .line 1023
    .line 1024
    const-wide v13, 0xffffffffL

    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    and-long/2addr v4, v13

    .line 1030
    long-to-int v4, v4

    .line 1031
    if-ne v2, v4, :cond_28

    .line 1032
    .line 1033
    :goto_11
    move v9, v10

    .line 1034
    goto :goto_14

    .line 1035
    :cond_28
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 1036
    .line 1037
    .line 1038
    move-result v4

    .line 1039
    sget-object v5, Lw/h0;->g:Lw/h0;

    .line 1040
    .line 1041
    if-ltz v4, :cond_2b

    .line 1042
    .line 1043
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 1044
    .line 1045
    .line 1046
    move-result v4

    .line 1047
    iget-object v6, v12, Lf0/i;->x:Ln2/s;

    .line 1048
    .line 1049
    iget-object v6, v6, Ln2/s;->a:Li2/g;

    .line 1050
    .line 1051
    iget-object v6, v6, Li2/g;->h:Ljava/lang/String;

    .line 1052
    .line 1053
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1054
    .line 1055
    .line 1056
    move-result v6

    .line 1057
    if-gt v4, v6, :cond_2b

    .line 1058
    .line 1059
    if-nez v3, :cond_2a

    .line 1060
    .line 1061
    if-ne v1, v2, :cond_29

    .line 1062
    .line 1063
    goto :goto_12

    .line 1064
    :cond_29
    iget-object v3, v12, Lf0/i;->B:Lh0/d1;

    .line 1065
    .line 1066
    invoke-virtual {v3, v9}, Lh0/d1;->h(Z)V

    .line 1067
    .line 1068
    .line 1069
    goto :goto_13

    .line 1070
    :cond_2a
    :goto_12
    iget-object v3, v12, Lf0/i;->B:Lh0/d1;

    .line 1071
    .line 1072
    invoke-virtual {v3, v10}, Lh0/d1;->t(Z)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v3, v5}, Lh0/d1;->q(Lw/h0;)V

    .line 1076
    .line 1077
    .line 1078
    :goto_13
    iget-object v3, v12, Lf0/i;->y:Lw/q0;

    .line 1079
    .line 1080
    iget-object v3, v3, Lw/q0;->v:Lw/w;

    .line 1081
    .line 1082
    new-instance v4, Ln2/s;

    .line 1083
    .line 1084
    iget-object v5, v12, Lf0/i;->x:Ln2/s;

    .line 1085
    .line 1086
    iget-object v5, v5, Ln2/s;->a:Li2/g;

    .line 1087
    .line 1088
    invoke-static {v1, v2}, Li2/e0;->b(II)J

    .line 1089
    .line 1090
    .line 1091
    move-result-wide v1

    .line 1092
    invoke-direct {v4, v5, v1, v2, v7}, Ln2/s;-><init>(Li2/g;JLi2/m0;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v3, v4}, Lw/w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    goto :goto_14

    .line 1099
    :cond_2b
    iget-object v1, v12, Lf0/i;->B:Lh0/d1;

    .line 1100
    .line 1101
    invoke-virtual {v1, v10}, Lh0/d1;->t(Z)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v1, v5}, Lh0/d1;->q(Lw/h0;)V

    .line 1105
    .line 1106
    .line 1107
    goto :goto_11

    .line 1108
    :goto_14
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    return-object v1

    .line 1113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
