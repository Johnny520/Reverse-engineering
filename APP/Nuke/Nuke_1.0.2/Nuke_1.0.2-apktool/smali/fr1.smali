.class public final synthetic Lfr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lun0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lun0;I)V
    .locals 0

    .line 1
    iput p6, p0, Lfr1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lfr1;->i:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lfr1;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lfr1;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lfr1;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p5, p0, Lfr1;->m:Lun0;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lfr1;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    sget-object v3, Lnx;->a:Leb;

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v6, v0, Lfr1;->m:Lun0;

    .line 13
    .line 14
    iget-object v7, v0, Lfr1;->l:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, v0, Lfr1;->k:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v9, v0, Lfr1;->j:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v9, Lwm0;

    .line 25
    .line 26
    check-cast v8, Landroid/view/View;

    .line 27
    .line 28
    move-object v13, v7

    .line 29
    check-cast v13, Lrs2;

    .line 30
    .line 31
    move-object v14, v6

    .line 32
    check-cast v14, Lmn0;

    .line 33
    .line 34
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, Lo71;

    .line 37
    .line 38
    move-object/from16 v6, p2

    .line 39
    .line 40
    check-cast v6, Lpx;

    .line 41
    .line 42
    move-object/from16 v7, p3

    .line 43
    .line 44
    check-cast v7, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    and-int/lit8 v1, v7, 0x11

    .line 54
    .line 55
    if-eq v1, v4, :cond_0

    .line 56
    .line 57
    move v1, v10

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v1, v5

    .line 60
    :goto_0
    and-int/lit8 v4, v7, 0x1

    .line 61
    .line 62
    check-cast v6, Lgo0;

    .line 63
    .line 64
    invoke-virtual {v6, v4, v1}, Lgo0;->O(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget-object v11, v0, Lfr1;->i:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    const v0, -0x3ade0caa

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v0}, Lgo0;->W(I)V

    .line 82
    .line 83
    .line 84
    const/16 v19, 0x0

    .line 85
    .line 86
    const/16 v20, 0x7

    .line 87
    .line 88
    const/4 v15, 0x0

    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    move-object/from16 v18, v6

    .line 94
    .line 95
    invoke-static/range {v15 .. v20}, Lci0;->g(Luh1;Ljava/lang/String;Ljava/lang/String;Lpx;II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v5}, Lgo0;->p(Z)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const v0, -0x3adc645a

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, v0}, Lgo0;->W(I)V

    .line 106
    .line 107
    .line 108
    iget v0, v9, Lwm0;->h:I

    .line 109
    .line 110
    invoke-static {v0, v6}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v15

    .line 114
    invoke-virtual {v6, v8}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {v6}, Lgo0;->L()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v0, :cond_2

    .line 123
    .line 124
    if-ne v1, v3, :cond_3

    .line 125
    .line 126
    :cond_2
    new-instance v1, Lkt0;

    .line 127
    .line 128
    invoke-direct {v1, v8, v10}, Lkt0;-><init>(Landroid/view/View;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_3
    move-object v12, v1

    .line 135
    check-cast v12, Lmn0;

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    move-object/from16 v16, v6

    .line 140
    .line 141
    invoke-static/range {v11 .. v17}, Lci0;->j(Ljava/util/List;Lmn0;Lrs2;Lmn0;Ljava/lang/String;Lpx;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v5}, Lgo0;->p(Z)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    invoke-virtual {v6}, Lgo0;->R()V

    .line 149
    .line 150
    .line 151
    :goto_1
    return-object v2

    .line 152
    :pswitch_0
    check-cast v8, Lkr1;

    .line 153
    .line 154
    check-cast v7, Lin0;

    .line 155
    .line 156
    check-cast v6, Lin0;

    .line 157
    .line 158
    move-object/from16 v1, p1

    .line 159
    .line 160
    check-cast v1, Lhm;

    .line 161
    .line 162
    move-object/from16 v11, p2

    .line 163
    .line 164
    check-cast v11, Lpx;

    .line 165
    .line 166
    move-object/from16 v12, p3

    .line 167
    .line 168
    check-cast v12, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    and-int/lit8 v1, v12, 0x11

    .line 178
    .line 179
    if-eq v1, v4, :cond_5

    .line 180
    .line 181
    move v1, v10

    .line 182
    goto :goto_2

    .line 183
    :cond_5
    move v1, v5

    .line 184
    :goto_2
    and-int/lit8 v4, v12, 0x1

    .line 185
    .line 186
    check-cast v11, Lgo0;

    .line 187
    .line 188
    invoke-virtual {v11, v4, v1}, Lgo0;->O(IZ)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_f

    .line 193
    .line 194
    sget-object v1, Ltp0;->c:Lvf;

    .line 195
    .line 196
    sget-object v4, Lsn;->u:Lpk;

    .line 197
    .line 198
    invoke-static {v1, v4, v11, v5}, Lyu;->a(Lyf;Lpk;Lpx;I)Lav;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget-wide v12, v11, Lgo0;->T:J

    .line 203
    .line 204
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    invoke-virtual {v11}, Lgo0;->l()Lyy1;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    sget-object v13, Lrh1;->a:Lrh1;

    .line 213
    .line 214
    invoke-static {v11, v13}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    sget-object v15, Lhx;->c:Lgx;

    .line 219
    .line 220
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    sget-object v15, Lgx;->b:Ljy;

    .line 224
    .line 225
    invoke-virtual {v11}, Lgo0;->Z()V

    .line 226
    .line 227
    .line 228
    iget-boolean v10, v11, Lgo0;->S:Z

    .line 229
    .line 230
    if-eqz v10, :cond_6

    .line 231
    .line 232
    invoke-virtual {v11, v15}, Lgo0;->k(Lxm0;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    invoke-virtual {v11}, Lgo0;->i0()V

    .line 237
    .line 238
    .line 239
    :goto_3
    sget-object v10, Lgx;->e:Llc;

    .line 240
    .line 241
    invoke-static {v11, v10, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    sget-object v1, Lgx;->d:Llc;

    .line 245
    .line 246
    invoke-static {v11, v1, v12}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    sget-object v4, Lgx;->f:Llc;

    .line 254
    .line 255
    invoke-static {v11, v4, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    sget-object v1, Lgx;->g:Lv6;

    .line 259
    .line 260
    invoke-static {v11, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 261
    .line 262
    .line 263
    sget-object v1, Lgx;->c:Llc;

    .line 264
    .line 265
    invoke-static {v11, v1, v14}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    const v1, 0x4112b3c6    # 9.16889f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v11, v1}, Lgo0;->W(I)V

    .line 272
    .line 273
    .line 274
    iget-object v0, v0, Lfr1;->i:Ljava/util/List;

    .line 275
    .line 276
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_e

    .line 285
    .line 286
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {v1, v9}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    sget-object v10, Lte;->e:Lyi0;

    .line 295
    .line 296
    const/high16 v12, 0x40c00000    # 6.0f

    .line 297
    .line 298
    const/high16 v14, 0x40000000    # 2.0f

    .line 299
    .line 300
    invoke-static {v10, v12, v14}, Lfg1;->D(Luh1;FF)Luh1;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-static {v10, v8}, Lci0;->z(Luh1;Leq2;)Luh1;

    .line 305
    .line 306
    .line 307
    move-result-object v10

    .line 308
    if-eqz v4, :cond_7

    .line 309
    .line 310
    const v12, -0x61537bc7

    .line 311
    .line 312
    .line 313
    invoke-virtual {v11, v12}, Lgo0;->W(I)V

    .line 314
    .line 315
    .line 316
    sget-object v12, Lur1;->a:Ltu2;

    .line 317
    .line 318
    invoke-virtual {v11, v12}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    check-cast v12, Llp1;

    .line 323
    .line 324
    iget-wide v14, v12, Llp1;->g:J

    .line 325
    .line 326
    const v12, 0x3db851ec    # 0.09f

    .line 327
    .line 328
    .line 329
    invoke-static {v12, v14, v15}, Lju;->b(FJ)J

    .line 330
    .line 331
    .line 332
    move-result-wide v14

    .line 333
    invoke-virtual {v11, v5}, Lgo0;->p(Z)V

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_7
    const v12, -0x6151c90d

    .line 338
    .line 339
    .line 340
    invoke-virtual {v11, v12}, Lgo0;->W(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v11, v5}, Lgo0;->p(Z)V

    .line 344
    .line 345
    .line 346
    sget-wide v14, Lju;->f:J

    .line 347
    .line 348
    :goto_5
    sget-object v12, Lsp0;->h:Liu0;

    .line 349
    .line 350
    invoke-static {v10, v14, v15, v12}, Lgf1;->n(Luh1;JLeq2;)Luh1;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    invoke-virtual {v11, v7}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    invoke-virtual {v11, v1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v14

    .line 362
    or-int/2addr v12, v14

    .line 363
    invoke-virtual {v11}, Lgo0;->L()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    if-nez v12, :cond_8

    .line 368
    .line 369
    if-ne v14, v3, :cond_9

    .line 370
    .line 371
    :cond_8
    new-instance v14, Lr1;

    .line 372
    .line 373
    const/16 v12, 0x19

    .line 374
    .line 375
    invoke-direct {v14, v12, v7, v1}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v11, v14}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_9
    check-cast v14, Lxm0;

    .line 382
    .line 383
    invoke-static {v10, v14}, Ltl;->O(Luh1;Lxm0;)Luh1;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    const/high16 v12, 0x41200000    # 10.0f

    .line 388
    .line 389
    invoke-static {v10, v12, v12}, Lfg1;->D(Luh1;FF)Luh1;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    sget-object v12, Lsn;->t:Lqk;

    .line 394
    .line 395
    sget-object v14, Ltp0;->a:Luf;

    .line 396
    .line 397
    const/16 v15, 0x30

    .line 398
    .line 399
    invoke-static {v14, v12, v11, v15}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 400
    .line 401
    .line 402
    move-result-object v12

    .line 403
    iget-wide v14, v11, Lgo0;->T:J

    .line 404
    .line 405
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 406
    .line 407
    .line 408
    move-result v14

    .line 409
    invoke-virtual {v11}, Lgo0;->l()Lyy1;

    .line 410
    .line 411
    .line 412
    move-result-object v15

    .line 413
    invoke-static {v11, v10}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    sget-object v16, Lhx;->c:Lgx;

    .line 418
    .line 419
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    sget-object v5, Lgx;->b:Ljy;

    .line 423
    .line 424
    invoke-virtual {v11}, Lgo0;->Z()V

    .line 425
    .line 426
    .line 427
    move-object/from16 p0, v0

    .line 428
    .line 429
    iget-boolean v0, v11, Lgo0;->S:Z

    .line 430
    .line 431
    if-eqz v0, :cond_a

    .line 432
    .line 433
    invoke-virtual {v11, v5}, Lgo0;->k(Lxm0;)V

    .line 434
    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_a
    invoke-virtual {v11}, Lgo0;->i0()V

    .line 438
    .line 439
    .line 440
    :goto_6
    sget-object v0, Lgx;->e:Llc;

    .line 441
    .line 442
    invoke-static {v11, v0, v12}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    sget-object v0, Lgx;->d:Llc;

    .line 446
    .line 447
    invoke-static {v11, v0, v15}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    sget-object v5, Lgx;->f:Llc;

    .line 455
    .line 456
    invoke-static {v11, v5, v0}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    sget-object v0, Lgx;->g:Lv6;

    .line 460
    .line 461
    invoke-static {v11, v0}, Lyf3;->b(Lpx;Lin0;)V

    .line 462
    .line 463
    .line 464
    sget-object v0, Lgx;->c:Llc;

    .line 465
    .line 466
    invoke-static {v11, v0, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v6, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    move-object v12, v0

    .line 474
    check-cast v12, Ljava/lang/String;

    .line 475
    .line 476
    move-object v0, v13

    .line 477
    new-instance v13, Lg71;

    .line 478
    .line 479
    const/high16 v1, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v5, 0x1

    .line 482
    invoke-direct {v13, v1, v5}, Lg71;-><init>(FZ)V

    .line 483
    .line 484
    .line 485
    new-instance v14, Lm13;

    .line 486
    .line 487
    if-eqz v4, :cond_b

    .line 488
    .line 489
    const v1, -0xf470b7b

    .line 490
    .line 491
    .line 492
    invoke-virtual {v11, v1}, Lgo0;->W(I)V

    .line 493
    .line 494
    .line 495
    sget-object v1, Lur1;->a:Ltu2;

    .line 496
    .line 497
    invoke-virtual {v11, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    check-cast v1, Llp1;

    .line 502
    .line 503
    move-object/from16 p1, v0

    .line 504
    .line 505
    iget-wide v0, v1, Llp1;->e:J

    .line 506
    .line 507
    const/4 v5, 0x0

    .line 508
    :goto_7
    invoke-virtual {v11, v5}, Lgo0;->p(Z)V

    .line 509
    .line 510
    .line 511
    move-wide/from16 v23, v0

    .line 512
    .line 513
    goto :goto_8

    .line 514
    :cond_b
    move-object/from16 p1, v0

    .line 515
    .line 516
    const/4 v5, 0x0

    .line 517
    const v0, -0xf4705b4

    .line 518
    .line 519
    .line 520
    invoke-virtual {v11, v0}, Lgo0;->W(I)V

    .line 521
    .line 522
    .line 523
    sget-object v0, Lur1;->a:Ltu2;

    .line 524
    .line 525
    invoke-virtual {v11, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    check-cast v0, Llp1;

    .line 530
    .line 531
    iget-wide v0, v0, Llp1;->e:J

    .line 532
    .line 533
    const v10, 0x3f4ccccd    # 0.8f

    .line 534
    .line 535
    .line 536
    invoke-static {v10, v0, v1}, Lju;->b(FJ)J

    .line 537
    .line 538
    .line 539
    move-result-wide v0

    .line 540
    goto :goto_7

    .line 541
    :goto_8
    const/16 v0, 0xe

    .line 542
    .line 543
    invoke-static {v0}, Lrg3;->D(I)J

    .line 544
    .line 545
    .line 546
    move-result-wide v25

    .line 547
    if-eqz v4, :cond_c

    .line 548
    .line 549
    sget-object v0, Lim0;->m:Lim0;

    .line 550
    .line 551
    :goto_9
    move-object/from16 v27, v0

    .line 552
    .line 553
    goto :goto_a

    .line 554
    :cond_c
    sget-object v0, Lim0;->j:Lim0;

    .line 555
    .line 556
    goto :goto_9

    .line 557
    :goto_a
    const/16 v34, 0x0

    .line 558
    .line 559
    const v35, 0xfffff8

    .line 560
    .line 561
    .line 562
    const-wide/16 v28, 0x0

    .line 563
    .line 564
    const/16 v30, 0x0

    .line 565
    .line 566
    const-wide/16 v31, 0x0

    .line 567
    .line 568
    const/16 v33, 0x0

    .line 569
    .line 570
    move-object/from16 v22, v14

    .line 571
    .line 572
    invoke-direct/range {v22 .. v35}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 573
    .line 574
    .line 575
    const/16 v20, 0x0

    .line 576
    .line 577
    const/16 v21, 0x3f8

    .line 578
    .line 579
    const/4 v15, 0x0

    .line 580
    const/16 v16, 0x0

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    const/16 v18, 0x0

    .line 585
    .line 586
    move-object/from16 v0, p1

    .line 587
    .line 588
    move-object/from16 v19, v11

    .line 589
    .line 590
    invoke-static/range {v12 .. v21}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 591
    .line 592
    .line 593
    if-eqz v4, :cond_d

    .line 594
    .line 595
    const v1, 0x266a24ad

    .line 596
    .line 597
    .line 598
    invoke-virtual {v11, v1}, Lgo0;->W(I)V

    .line 599
    .line 600
    .line 601
    const/high16 v1, 0x41400000    # 12.0f

    .line 602
    .line 603
    invoke-static {v0, v1}, Lte;->q0(Luh1;F)Luh1;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    invoke-static {v11, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 608
    .line 609
    .line 610
    sget-object v1, Lur1;->a:Ltu2;

    .line 611
    .line 612
    invoke-virtual {v11, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    check-cast v1, Llp1;

    .line 617
    .line 618
    iget-wide v4, v1, Llp1;->g:J

    .line 619
    .line 620
    const/4 v1, 0x0

    .line 621
    const/4 v10, 0x0

    .line 622
    invoke-static {v1, v4, v5, v11, v10}, Leu;->k(Luh1;JLpx;I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v11, v10}, Lgo0;->p(Z)V

    .line 626
    .line 627
    .line 628
    :goto_b
    const/4 v5, 0x1

    .line 629
    goto :goto_c

    .line 630
    :cond_d
    const/4 v10, 0x0

    .line 631
    const v1, 0x266d5ac8

    .line 632
    .line 633
    .line 634
    invoke-virtual {v11, v1}, Lgo0;->W(I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v11, v10}, Lgo0;->p(Z)V

    .line 638
    .line 639
    .line 640
    goto :goto_b

    .line 641
    :goto_c
    invoke-virtual {v11, v5}, Lgo0;->p(Z)V

    .line 642
    .line 643
    .line 644
    move-object v13, v0

    .line 645
    move v5, v10

    .line 646
    move-object/from16 v0, p0

    .line 647
    .line 648
    goto/16 :goto_4

    .line 649
    .line 650
    :cond_e
    move v10, v5

    .line 651
    const/4 v5, 0x1

    .line 652
    invoke-virtual {v11, v10}, Lgo0;->p(Z)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v11, v5}, Lgo0;->p(Z)V

    .line 656
    .line 657
    .line 658
    goto :goto_d

    .line 659
    :cond_f
    invoke-virtual {v11}, Lgo0;->R()V

    .line 660
    .line 661
    .line 662
    :goto_d
    return-object v2

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
