.class public final synthetic Lrh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLun0;II)V
    .locals 0

    .line 14
    iput p5, p0, Lrh;->h:I

    iput-object p1, p0, Lrh;->k:Ljava/lang/Object;

    iput-boolean p2, p0, Lrh;->i:Z

    iput-object p3, p0, Lrh;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lin0;ZI)V
    .locals 0

    .line 16
    const/4 p4, 0x2

    iput p4, p0, Lrh;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrh;->k:Ljava/lang/Object;

    iput-object p2, p0, Lrh;->j:Ljava/lang/Object;

    iput-boolean p3, p0, Lrh;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lju;Z)V
    .locals 1

    .line 15
    const/4 v0, 0x4

    iput v0, p0, Lrh;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrh;->k:Ljava/lang/Object;

    iput-object p2, p0, Lrh;->j:Ljava/lang/Object;

    iput-boolean p3, p0, Lrh;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkf2;ZLin0;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lrh;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrh;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lrh;->i:Z

    .line 10
    .line 11
    iput-object p3, p0, Lrh;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lrh;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-boolean v4, v0, Lrh;->i:Z

    .line 8
    .line 9
    sget-object v5, La83;->a:La83;

    .line 10
    .line 11
    iget-object v6, v0, Lrh;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, Lrh;->k:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, Ljc3;

    .line 20
    .line 21
    check-cast v6, Lin0;

    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Lpx;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v8}, Lpp0;->N(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {v7, v4, v6, v0, v1}, Lse;->j(Ljc3;ZLin0;Lpx;I)V

    .line 39
    .line 40
    .line 41
    return-object v5

    .line 42
    :pswitch_0
    check-cast v7, Lkf2;

    .line 43
    .line 44
    check-cast v6, Lin0;

    .line 45
    .line 46
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, Lpx;

    .line 49
    .line 50
    move-object/from16 v4, p2

    .line 51
    .line 52
    check-cast v4, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    and-int/lit8 v9, v4, 0x3

    .line 59
    .line 60
    if-eq v9, v3, :cond_0

    .line 61
    .line 62
    move v9, v8

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v9, v2

    .line 65
    :goto_0
    and-int/2addr v4, v8

    .line 66
    move-object v14, v1

    .line 67
    check-cast v14, Lgo0;

    .line 68
    .line 69
    invoke-virtual {v14, v4, v9}, Lgo0;->O(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    iget-object v1, v7, Lkf2;->s:Lvf2;

    .line 76
    .line 77
    iget-object v1, v1, Lvf2;->a:Lwf2;

    .line 78
    .line 79
    sget-object v4, Lwf2;->k:Lwf2;

    .line 80
    .line 81
    iget-boolean v10, v0, Lrh;->i:Z

    .line 82
    .line 83
    sget-object v0, Lnx;->a:Leb;

    .line 84
    .line 85
    if-ne v1, v4, :cond_3

    .line 86
    .line 87
    const v1, -0x7c698ba4

    .line 88
    .line 89
    .line 90
    invoke-virtual {v14, v1}, Lgo0;->W(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v14, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v14}, Lgo0;->L()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-nez v1, :cond_1

    .line 102
    .line 103
    if-ne v3, v0, :cond_2

    .line 104
    .line 105
    :cond_1
    new-instance v3, Lwo0;

    .line 106
    .line 107
    invoke-direct {v3, v6, v8}, Lwo0;-><init>(Lin0;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v14, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    move-object v11, v3

    .line 114
    check-cast v11, Lin0;

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v15, 0x0

    .line 118
    const/4 v12, 0x0

    .line 119
    invoke-static/range {v10 .. v15}, Lte;->g(ZLin0;Luh1;ZLpx;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14, v2}, Lgo0;->p(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    const v1, -0x7c662801

    .line 127
    .line 128
    .line 129
    invoke-virtual {v14, v1}, Lgo0;->W(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v14, v6}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-virtual {v14}, Lgo0;->L()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    if-nez v1, :cond_4

    .line 141
    .line 142
    if-ne v4, v0, :cond_5

    .line 143
    .line 144
    :cond_4
    new-instance v4, Lwo0;

    .line 145
    .line 146
    invoke-direct {v4, v6, v3}, Lwo0;-><init>(Lin0;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v14, v4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    move-object v11, v4

    .line 153
    check-cast v11, Lin0;

    .line 154
    .line 155
    const/16 v16, 0x0

    .line 156
    .line 157
    const/16 v17, 0x3c

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    const/4 v13, 0x0

    .line 161
    move-object v15, v14

    .line 162
    const/4 v14, 0x0

    .line 163
    invoke-static/range {v10 .. v17}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 164
    .line 165
    .line 166
    move-object v14, v15

    .line 167
    invoke-virtual {v14, v2}, Lgo0;->p(Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_6
    invoke-virtual {v14}, Lgo0;->R()V

    .line 172
    .line 173
    .line 174
    :goto_1
    return-object v5

    .line 175
    :pswitch_1
    move-object v15, v7

    .line 176
    check-cast v15, Ljava/lang/String;

    .line 177
    .line 178
    check-cast v6, Lju;

    .line 179
    .line 180
    move-object/from16 v0, p1

    .line 181
    .line 182
    check-cast v0, Lpx;

    .line 183
    .line 184
    move-object/from16 v1, p2

    .line 185
    .line 186
    check-cast v1, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    and-int/lit8 v7, v1, 0x3

    .line 193
    .line 194
    if-eq v7, v3, :cond_7

    .line 195
    .line 196
    move v3, v8

    .line 197
    goto :goto_2

    .line 198
    :cond_7
    move v3, v2

    .line 199
    :goto_2
    and-int/2addr v1, v8

    .line 200
    check-cast v0, Lgo0;

    .line 201
    .line 202
    invoke-virtual {v0, v1, v3}, Lgo0;->O(IZ)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    if-eqz v1, :cond_c

    .line 207
    .line 208
    sget-object v1, Lsn;->t:Lqk;

    .line 209
    .line 210
    sget-object v3, Ltp0;->a:Luf;

    .line 211
    .line 212
    const/16 v7, 0x30

    .line 213
    .line 214
    invoke-static {v3, v1, v0, v7}, Lnb2;->a(Lwf;Lqk;Lpx;I)Lob2;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iget-wide v9, v0, Lgo0;->T:J

    .line 219
    .line 220
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-virtual {v0}, Lgo0;->l()Lyy1;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    sget-object v9, Lrh1;->a:Lrh1;

    .line 229
    .line 230
    invoke-static {v0, v9}, Ltl;->M(Lpx;Luh1;)Luh1;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    sget-object v11, Lhx;->c:Lgx;

    .line 235
    .line 236
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    sget-object v11, Lgx;->b:Ljy;

    .line 240
    .line 241
    invoke-virtual {v0}, Lgo0;->Z()V

    .line 242
    .line 243
    .line 244
    iget-boolean v12, v0, Lgo0;->S:Z

    .line 245
    .line 246
    if-eqz v12, :cond_8

    .line 247
    .line 248
    invoke-virtual {v0, v11}, Lgo0;->k(Lxm0;)V

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_8
    invoke-virtual {v0}, Lgo0;->i0()V

    .line 253
    .line 254
    .line 255
    :goto_3
    sget-object v11, Lgx;->e:Llc;

    .line 256
    .line 257
    invoke-static {v0, v11, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    sget-object v1, Lgx;->d:Llc;

    .line 261
    .line 262
    invoke-static {v0, v1, v7}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    sget-object v3, Lgx;->f:Llc;

    .line 270
    .line 271
    invoke-static {v0, v3, v1}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    sget-object v1, Lgx;->g:Lv6;

    .line 275
    .line 276
    invoke-static {v0, v1}, Lyf3;->b(Lpx;Lin0;)V

    .line 277
    .line 278
    .line 279
    sget-object v1, Lgx;->c:Llc;

    .line 280
    .line 281
    invoke-static {v0, v1, v10}, Lyf3;->c(Lpx;Lmn0;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    if-eqz v15, :cond_a

    .line 285
    .line 286
    const v1, 0x52b01673

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v1}, Lgo0;->W(I)V

    .line 290
    .line 291
    .line 292
    new-instance v16, Lm13;

    .line 293
    .line 294
    if-nez v6, :cond_9

    .line 295
    .line 296
    const v1, 0x2aaed2c

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v1}, Lgo0;->W(I)V

    .line 300
    .line 301
    .line 302
    sget-object v1, Lur1;->a:Ltu2;

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Llp1;

    .line 309
    .line 310
    iget-wide v6, v1, Llp1;->f:J

    .line 311
    .line 312
    invoke-virtual {v0, v2}, Lgo0;->p(Z)V

    .line 313
    .line 314
    .line 315
    :goto_4
    move-wide/from16 v17, v6

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_9
    const v1, 0x2aae94c

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v1}, Lgo0;->W(I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v2}, Lgo0;->p(Z)V

    .line 325
    .line 326
    .line 327
    iget-wide v6, v6, Lju;->a:J

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :goto_5
    const/16 v1, 0xe

    .line 331
    .line 332
    invoke-static {v1}, Lrg3;->D(I)J

    .line 333
    .line 334
    .line 335
    move-result-wide v19

    .line 336
    sget-object v21, Lim0;->j:Lim0;

    .line 337
    .line 338
    const/16 v28, 0x0

    .line 339
    .line 340
    const v29, 0xfffff8

    .line 341
    .line 342
    .line 343
    const-wide/16 v22, 0x0

    .line 344
    .line 345
    const/16 v24, 0x0

    .line 346
    .line 347
    const-wide/16 v25, 0x0

    .line 348
    .line 349
    const/16 v27, 0x0

    .line 350
    .line 351
    invoke-direct/range {v16 .. v29}, Lm13;-><init>(JJLim0;JIJLw02;Lya1;I)V

    .line 352
    .line 353
    .line 354
    const/16 v23, 0x0

    .line 355
    .line 356
    const/16 v24, 0x3fa

    .line 357
    .line 358
    move-object/from16 v17, v16

    .line 359
    .line 360
    const/16 v16, 0x0

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
    const/16 v21, 0x0

    .line 369
    .line 370
    move-object/from16 v22, v0

    .line 371
    .line 372
    invoke-static/range {v15 .. v24}, Leu;->a(Ljava/lang/String;Luh1;Lm13;IZIILpx;II)V

    .line 373
    .line 374
    .line 375
    const/high16 v1, 0x41000000    # 8.0f

    .line 376
    .line 377
    invoke-static {v9, v1}, Lte;->q0(Luh1;F)Luh1;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {v0, v1}, Lrp0;->O(Lpx;Luh1;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v2}, Lgo0;->p(Z)V

    .line 385
    .line 386
    .line 387
    goto :goto_6

    .line 388
    :cond_a
    const v1, 0x52b66c23

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v1}, Lgo0;->W(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v2}, Lgo0;->p(Z)V

    .line 395
    .line 396
    .line 397
    :goto_6
    sget-object v1, Lur1;->a:Ltu2;

    .line 398
    .line 399
    invoke-virtual {v0, v1}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    check-cast v1, Llp1;

    .line 404
    .line 405
    iget-wide v6, v1, Llp1;->f:J

    .line 406
    .line 407
    if-eqz v4, :cond_b

    .line 408
    .line 409
    const v1, 0x3f1eb852    # 0.62f

    .line 410
    .line 411
    .line 412
    goto :goto_7

    .line 413
    :cond_b
    const v1, 0x3eb851ec    # 0.36f

    .line 414
    .line 415
    .line 416
    :goto_7
    invoke-static {v1, v6, v7}, Lju;->b(FJ)J

    .line 417
    .line 418
    .line 419
    move-result-wide v3

    .line 420
    const/4 v1, 0x0

    .line 421
    invoke-static {v1, v3, v4, v0, v2}, Lqp0;->g(Luh1;JLpx;I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v8}, Lgo0;->p(Z)V

    .line 425
    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_c
    invoke-virtual {v0}, Lgo0;->R()V

    .line 429
    .line 430
    .line 431
    :goto_8
    return-object v5

    .line 432
    :pswitch_2
    check-cast v7, Lxt0;

    .line 433
    .line 434
    check-cast v6, Lxm0;

    .line 435
    .line 436
    move-object/from16 v0, p1

    .line 437
    .line 438
    check-cast v0, Lpx;

    .line 439
    .line 440
    move-object/from16 v1, p2

    .line 441
    .line 442
    check-cast v1, Ljava/lang/Integer;

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-static {v8}, Lpp0;->N(I)I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    invoke-static {v7, v4, v6, v0, v1}, Ls11;->k(Lxt0;ZLxm0;Lpx;I)V

    .line 452
    .line 453
    .line 454
    return-object v5

    .line 455
    :pswitch_3
    check-cast v7, Ljava/lang/String;

    .line 456
    .line 457
    check-cast v6, Lin0;

    .line 458
    .line 459
    move-object/from16 v0, p1

    .line 460
    .line 461
    check-cast v0, Lpx;

    .line 462
    .line 463
    move-object/from16 v1, p2

    .line 464
    .line 465
    check-cast v1, Ljava/lang/Integer;

    .line 466
    .line 467
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-static {v8}, Lpp0;->N(I)I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    invoke-static {v7, v6, v4, v0, v1}, Lci0;->i(Ljava/lang/String;Lin0;ZLpx;I)V

    .line 475
    .line 476
    .line 477
    return-object v5

    .line 478
    :pswitch_4
    check-cast v7, Lg33;

    .line 479
    .line 480
    check-cast v6, Lin0;

    .line 481
    .line 482
    move-object/from16 v0, p1

    .line 483
    .line 484
    check-cast v0, Lpx;

    .line 485
    .line 486
    move-object/from16 v1, p2

    .line 487
    .line 488
    check-cast v1, Ljava/lang/Integer;

    .line 489
    .line 490
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-static {v8}, Lpp0;->N(I)I

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    invoke-static {v7, v4, v6, v0, v1}, Lt11;->f(Lg33;ZLin0;Lpx;I)V

    .line 498
    .line 499
    .line 500
    return-object v5

    .line 501
    :pswitch_5
    check-cast v7, Ls62;

    .line 502
    .line 503
    check-cast v6, Lin0;

    .line 504
    .line 505
    move-object/from16 v0, p1

    .line 506
    .line 507
    check-cast v0, Lpx;

    .line 508
    .line 509
    move-object/from16 v1, p2

    .line 510
    .line 511
    check-cast v1, Ljava/lang/Integer;

    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    invoke-static {v8}, Lpp0;->N(I)I

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    invoke-static {v7, v4, v6, v0, v1}, Ls11;->p(Ls62;ZLin0;Lpx;I)V

    .line 521
    .line 522
    .line 523
    return-object v5

    .line 524
    nop

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
