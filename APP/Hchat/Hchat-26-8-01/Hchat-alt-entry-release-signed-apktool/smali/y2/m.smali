.class public abstract Ly2/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li0/u;

.field public static final b:Li0/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ly2/d;->j:Ly2/d;

    .line 2
    .line 3
    new-instance v1, Li0/u;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Li0/u;-><init>(Lfg/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Ly2/m;->a:Li0/u;

    .line 9
    .line 10
    sget-object v0, Ly2/d;->i:Ly2/d;

    .line 11
    .line 12
    new-instance v1, Li0/u;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Li0/u;-><init>(Lfg/a;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ly2/m;->b:Li0/u;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Ly2/b0;Lfg/a;Ly2/c0;Ls0/d;Li0/h0;II)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p4

    .line 4
    .line 5
    move/from16 v10, p5

    .line 6
    .line 7
    const v0, -0x699ff8ef

    .line 8
    .line 9
    .line 10
    invoke-virtual {v9, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, v10, 0x6

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v9, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int/2addr v0, v10

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v10

    .line 29
    :goto_1
    and-int/lit8 v2, p6, 0x2

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    or-int/lit8 v0, v0, 0x30

    .line 34
    .line 35
    :cond_2
    move-object/from16 v3, p1

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v3, v10, 0x30

    .line 39
    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    move-object/from16 v3, p1

    .line 43
    .line 44
    invoke-virtual {v9, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_4

    .line 49
    .line 50
    const/16 v4, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    const/16 v4, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v0, v4

    .line 56
    :goto_3
    and-int/lit16 v4, v10, 0x180

    .line 57
    .line 58
    if-nez v4, :cond_6

    .line 59
    .line 60
    move-object/from16 v4, p2

    .line 61
    .line 62
    invoke-virtual {v9, v4}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    const/16 v5, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/16 v5, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr v0, v5

    .line 74
    goto :goto_5

    .line 75
    :cond_6
    move-object/from16 v4, p2

    .line 76
    .line 77
    :goto_5
    and-int/lit16 v5, v10, 0xc00

    .line 78
    .line 79
    move-object/from16 v14, p3

    .line 80
    .line 81
    if-nez v5, :cond_8

    .line 82
    .line 83
    invoke-virtual {v9, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    const/16 v5, 0x800

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_7
    const/16 v5, 0x400

    .line 93
    .line 94
    :goto_6
    or-int/2addr v0, v5

    .line 95
    :cond_8
    move v15, v0

    .line 96
    and-int/lit16 v0, v15, 0x493

    .line 97
    .line 98
    const/16 v5, 0x492

    .line 99
    .line 100
    const/4 v7, 0x0

    .line 101
    if-eq v0, v5, :cond_9

    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    goto :goto_7

    .line 105
    :cond_9
    move v0, v7

    .line 106
    :goto_7
    and-int/lit8 v5, v15, 0x1

    .line 107
    .line 108
    invoke-virtual {v9, v5, v0}, Li0/h0;->S(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_1f

    .line 113
    .line 114
    if-eqz v2, :cond_a

    .line 115
    .line 116
    const/16 v16, 0x0

    .line 117
    .line 118
    goto :goto_8

    .line 119
    :cond_a
    move-object/from16 v16, v3

    .line 120
    .line 121
    :goto_8
    sget-object v2, Ly1/i0;->f:Li0/m2;

    .line 122
    .line 123
    invoke-virtual {v9, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Landroid/view/View;

    .line 128
    .line 129
    sget-object v3, Ly1/h1;->h:Li0/m2;

    .line 130
    .line 131
    invoke-virtual {v9, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    move-object v5, v3

    .line 136
    check-cast v5, Lu2/c;

    .line 137
    .line 138
    sget-object v3, Ly2/m;->a:Li0/u;

    .line 139
    .line 140
    invoke-virtual {v9, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    move-object/from16 v18, v3

    .line 145
    .line 146
    check-cast v18, Ljava/lang/String;

    .line 147
    .line 148
    sget-object v3, Ly1/h1;->n:Li0/m2;

    .line 149
    .line 150
    invoke-virtual {v9, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    move-object/from16 v19, v3

    .line 155
    .line 156
    check-cast v19, Lu2/m;

    .line 157
    .line 158
    invoke-static {v9}, Li0/r;->x(Li0/h0;)Li0/f0;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static/range {p3 .. p4}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    new-array v0, v7, [Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    sget-object v11, Li0/l;->a:Li0/e;

    .line 173
    .line 174
    if-ne v6, v11, :cond_b

    .line 175
    .line 176
    sget-object v6, Ly2/d;->k:Ly2/d;

    .line 177
    .line 178
    invoke-virtual {v9, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    check-cast v6, Lfg/a;

    .line 182
    .line 183
    const/16 v7, 0x30

    .line 184
    .line 185
    invoke-static {v0, v6, v9, v7}, Lv0/k;->c([Ljava/lang/Object;Lfg/a;Li0/h0;I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object v7, v0

    .line 190
    check-cast v7, Ljava/util/UUID;

    .line 191
    .line 192
    sget-object v0, Ly2/m;->b:Li0/u;

    .line 193
    .line 194
    invoke-virtual {v9, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    if-ne v6, v11, :cond_c

    .line 209
    .line 210
    move-object/from16 v20, v8

    .line 211
    .line 212
    move v8, v0

    .line 213
    new-instance v0, Ly2/x;

    .line 214
    .line 215
    move-object v6, v4

    .line 216
    move-object v4, v2

    .line 217
    move-object v2, v6

    .line 218
    move-object v6, v1

    .line 219
    move-object v12, v3

    .line 220
    move-object/from16 v1, v16

    .line 221
    .line 222
    move-object/from16 v3, v18

    .line 223
    .line 224
    move-object/from16 v13, v20

    .line 225
    .line 226
    const/4 v10, 0x0

    .line 227
    const/16 v20, 0x0

    .line 228
    .line 229
    invoke-direct/range {v0 .. v8}, Ly2/x;-><init>(Lfg/a;Ly2/c0;Ljava/lang/String;Landroid/view/View;Lu2/c;Ly2/b0;Ljava/util/UUID;Z)V

    .line 230
    .line 231
    .line 232
    move-object v1, v6

    .line 233
    new-instance v2, Ly2/l;

    .line 234
    .line 235
    const/4 v4, 0x1

    .line 236
    invoke-direct {v2, v0, v13, v4}, Ly2/l;-><init>(Ly2/x;Li0/a1;I)V

    .line 237
    .line 238
    .line 239
    new-instance v4, Ls0/d;

    .line 240
    .line 241
    const v5, -0x11bbdae4

    .line 242
    .line 243
    .line 244
    const/4 v6, 0x1

    .line 245
    invoke-direct {v4, v5, v2, v6}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v12, v4}, Ly2/x;->n(Li0/o;Lfg/p;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    move-object v6, v0

    .line 255
    goto :goto_9

    .line 256
    :cond_c
    move-object/from16 v3, v18

    .line 257
    .line 258
    const/4 v10, 0x0

    .line 259
    const/16 v20, 0x0

    .line 260
    .line 261
    :goto_9
    check-cast v6, Ly2/x;

    .line 262
    .line 263
    invoke-virtual {v9, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    and-int/lit8 v2, v15, 0x70

    .line 268
    .line 269
    const/16 v4, 0x20

    .line 270
    .line 271
    if-ne v2, v4, :cond_d

    .line 272
    .line 273
    const/4 v4, 0x1

    .line 274
    goto :goto_a

    .line 275
    :cond_d
    move/from16 v4, v20

    .line 276
    .line 277
    :goto_a
    or-int/2addr v0, v4

    .line 278
    and-int/lit16 v4, v15, 0x380

    .line 279
    .line 280
    const/16 v5, 0x100

    .line 281
    .line 282
    if-ne v4, v5, :cond_e

    .line 283
    .line 284
    const/4 v5, 0x1

    .line 285
    goto :goto_b

    .line 286
    :cond_e
    move/from16 v5, v20

    .line 287
    .line 288
    :goto_b
    or-int/2addr v0, v5

    .line 289
    invoke-virtual {v9, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    or-int/2addr v0, v5

    .line 294
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->ordinal()I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    invoke-virtual {v9, v5}, Li0/h0;->d(I)Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    or-int/2addr v0, v5

    .line 303
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    if-nez v0, :cond_10

    .line 308
    .line 309
    if-ne v5, v11, :cond_f

    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_f
    move v0, v15

    .line 313
    move-object v15, v6

    .line 314
    goto :goto_d

    .line 315
    :cond_10
    :goto_c
    new-instance v14, Ly2/g;

    .line 316
    .line 317
    move-object/from16 v17, p2

    .line 318
    .line 319
    move-object/from16 v18, v3

    .line 320
    .line 321
    move v0, v15

    .line 322
    move-object v15, v6

    .line 323
    invoke-direct/range {v14 .. v19}, Ly2/g;-><init>(Ly2/x;Lfg/a;Ly2/c0;Ljava/lang/String;Lu2/m;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v9, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    move-object v5, v14

    .line 330
    :goto_d
    check-cast v5, Lfg/l;

    .line 331
    .line 332
    invoke-static {v15, v5, v9}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    const/16 v6, 0x20

    .line 340
    .line 341
    if-ne v2, v6, :cond_11

    .line 342
    .line 343
    const/4 v6, 0x1

    .line 344
    goto :goto_e

    .line 345
    :cond_11
    move/from16 v6, v20

    .line 346
    .line 347
    :goto_e
    or-int v2, v5, v6

    .line 348
    .line 349
    const/16 v5, 0x100

    .line 350
    .line 351
    if-ne v4, v5, :cond_12

    .line 352
    .line 353
    const/4 v6, 0x1

    .line 354
    goto :goto_f

    .line 355
    :cond_12
    move/from16 v6, v20

    .line 356
    .line 357
    :goto_f
    or-int/2addr v2, v6

    .line 358
    invoke-virtual {v9, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    or-int/2addr v2, v4

    .line 363
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->ordinal()I

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    invoke-virtual {v9, v4}, Li0/h0;->d(I)Z

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    or-int/2addr v2, v4

    .line 372
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    if-nez v2, :cond_14

    .line 377
    .line 378
    if-ne v4, v11, :cond_13

    .line 379
    .line 380
    goto :goto_10

    .line 381
    :cond_13
    move-object/from16 v3, v19

    .line 382
    .line 383
    goto :goto_11

    .line 384
    :cond_14
    :goto_10
    new-instance v14, Ly2/h;

    .line 385
    .line 386
    move-object/from16 v17, p2

    .line 387
    .line 388
    move-object/from16 v18, v3

    .line 389
    .line 390
    invoke-direct/range {v14 .. v19}, Ly2/h;-><init>(Ly2/x;Lfg/a;Ly2/c0;Ljava/lang/String;Lu2/m;)V

    .line 391
    .line 392
    .line 393
    move-object/from16 v3, v19

    .line 394
    .line 395
    invoke-virtual {v9, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    move-object v4, v14

    .line 399
    :goto_11
    check-cast v4, Lfg/a;

    .line 400
    .line 401
    invoke-static {v4, v9}, Li0/r;->j(Lfg/a;Li0/h0;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v9, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    and-int/lit8 v0, v0, 0xe

    .line 409
    .line 410
    const/4 v4, 0x4

    .line 411
    if-ne v0, v4, :cond_15

    .line 412
    .line 413
    const/4 v6, 0x1

    .line 414
    goto :goto_12

    .line 415
    :cond_15
    move/from16 v6, v20

    .line 416
    .line 417
    :goto_12
    or-int v0, v2, v6

    .line 418
    .line 419
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    if-nez v0, :cond_16

    .line 424
    .line 425
    if-ne v2, v11, :cond_17

    .line 426
    .line 427
    :cond_16
    new-instance v2, Lf1/p;

    .line 428
    .line 429
    const/16 v0, 0xc

    .line 430
    .line 431
    invoke-direct {v2, v15, v0, v1}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v9, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :cond_17
    check-cast v2, Lfg/l;

    .line 438
    .line 439
    invoke-static {v1, v2, v9}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v9, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    if-nez v0, :cond_18

    .line 451
    .line 452
    if-ne v2, v11, :cond_19

    .line 453
    .line 454
    :cond_18
    new-instance v2, Lci/j;

    .line 455
    .line 456
    const/16 v0, 0x1d

    .line 457
    .line 458
    invoke-direct {v2, v15, v10, v0}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v9, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    :cond_19
    check-cast v2, Lfg/p;

    .line 465
    .line 466
    invoke-static {v2, v9, v15}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v9, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    if-nez v0, :cond_1a

    .line 478
    .line 479
    if-ne v2, v11, :cond_1b

    .line 480
    .line 481
    :cond_1a
    new-instance v2, Ly2/j;

    .line 482
    .line 483
    const/4 v0, 0x0

    .line 484
    invoke-direct {v2, v15, v0}, Ly2/j;-><init>(Ly2/x;I)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v9, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    :cond_1b
    check-cast v2, Lfg/l;

    .line 491
    .line 492
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 493
    .line 494
    invoke-static {v0, v2}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v9, v15}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    invoke-virtual {v9, v4}, Li0/h0;->d(I)Z

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    or-int/2addr v2, v4

    .line 511
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    if-nez v2, :cond_1c

    .line 516
    .line 517
    if-ne v4, v11, :cond_1d

    .line 518
    .line 519
    :cond_1c
    new-instance v4, Lw/o1;

    .line 520
    .line 521
    const/4 v2, 0x1

    .line 522
    invoke-direct {v4, v15, v2, v3}, Lw/o1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v9, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    :cond_1d
    check-cast v4, Lv1/n0;

    .line 529
    .line 530
    iget-wide v2, v9, Li0/h0;->T:J

    .line 531
    .line 532
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-static {v9, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 545
    .line 546
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 550
    .line 551
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 552
    .line 553
    .line 554
    iget-boolean v6, v9, Li0/h0;->S:Z

    .line 555
    .line 556
    if-eqz v6, :cond_1e

    .line 557
    .line 558
    invoke-virtual {v9, v5}, Li0/h0;->k(Lfg/a;)V

    .line 559
    .line 560
    .line 561
    goto :goto_13

    .line 562
    :cond_1e
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 563
    .line 564
    .line 565
    :goto_13
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 566
    .line 567
    invoke-static {v5, v9, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    sget-object v4, Lx1/f;->d:Lx1/e;

    .line 571
    .line 572
    invoke-static {v4, v9, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    sget-object v3, Lx1/f;->f:Lx1/e;

    .line 580
    .line 581
    invoke-static {v3, v9, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    sget-object v2, Lx1/f;->g:Lx1/d;

    .line 585
    .line 586
    invoke-static {v2, v9}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 587
    .line 588
    .line 589
    sget-object v2, Lx1/f;->c:Lx1/e;

    .line 590
    .line 591
    invoke-static {v2, v9, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    const/4 v6, 0x1

    .line 595
    invoke-virtual {v9, v6}, Li0/h0;->p(Z)V

    .line 596
    .line 597
    .line 598
    move-object/from16 v2, v16

    .line 599
    .line 600
    goto :goto_14

    .line 601
    :cond_1f
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 602
    .line 603
    .line 604
    move-object v2, v3

    .line 605
    :goto_14
    invoke-virtual {v9}, Li0/h0;->t()Li0/r1;

    .line 606
    .line 607
    .line 608
    move-result-object v7

    .line 609
    if-eqz v7, :cond_20

    .line 610
    .line 611
    new-instance v0, Ly2/k;

    .line 612
    .line 613
    move-object/from16 v3, p2

    .line 614
    .line 615
    move-object/from16 v4, p3

    .line 616
    .line 617
    move/from16 v5, p5

    .line 618
    .line 619
    move/from16 v6, p6

    .line 620
    .line 621
    invoke-direct/range {v0 .. v6}, Ly2/k;-><init>(Ly2/b0;Lfg/a;Ly2/c0;Ls0/d;II)V

    .line 622
    .line 623
    .line 624
    iput-object v0, v7, Li0/r1;->d:Lfg/p;

    .line 625
    .line 626
    :cond_20
    return-void
.end method

.method public static final b(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 21
    .line 22
    and-int/lit16 p0, p0, 0x2000

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    return v0
.end method
