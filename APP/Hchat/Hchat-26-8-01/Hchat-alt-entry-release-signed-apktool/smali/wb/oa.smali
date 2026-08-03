.class public final synthetic Lwb/oa;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/oa;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/oa;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/oa;->i:Li0/a1;

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
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/oa;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lr/d;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Li0/h0;

    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v1, v3, 0x11

    .line 28
    .line 29
    const/16 v4, 0x10

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    if-eq v1, v4, :cond_0

    .line 33
    .line 34
    move v1, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    :goto_0
    and-int/2addr v3, v5

    .line 38
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Lwb/c9;

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    iget-object v4, v0, Lwb/oa;->h:Landroid/content/Context;

    .line 48
    .line 49
    iget-object v6, v0, Lwb/oa;->i:Li0/a1;

    .line 50
    .line 51
    invoke-direct {v1, v4, v6, v3}, Lwb/c9;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 52
    .line 53
    .line 54
    const v3, 0x6ecfa031

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/16 v3, 0x30

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object v1

    .line 74
    :pswitch_0
    move-object/from16 v1, p1

    .line 75
    .line 76
    check-cast v1, Lr/d;

    .line 77
    .line 78
    move-object/from16 v2, p2

    .line 79
    .line 80
    check-cast v2, Li0/h0;

    .line 81
    .line 82
    move-object/from16 v3, p3

    .line 83
    .line 84
    check-cast v3, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    and-int/lit8 v1, v3, 0x11

    .line 94
    .line 95
    const/16 v4, 0x10

    .line 96
    .line 97
    const/4 v5, 0x1

    .line 98
    if-eq v1, v4, :cond_2

    .line 99
    .line 100
    move v1, v5

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const/4 v1, 0x0

    .line 103
    :goto_2
    and-int/2addr v3, v5

    .line 104
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    new-instance v1, Lwb/c9;

    .line 111
    .line 112
    const/4 v3, 0x2

    .line 113
    iget-object v4, v0, Lwb/oa;->h:Landroid/content/Context;

    .line 114
    .line 115
    iget-object v6, v0, Lwb/oa;->i:Li0/a1;

    .line 116
    .line 117
    invoke-direct {v1, v4, v6, v3}, Lwb/c9;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 118
    .line 119
    .line 120
    const v3, -0x29dc6311

    .line 121
    .line 122
    .line 123
    invoke-static {v3, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const/16 v3, 0x30

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_3
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 135
    .line 136
    .line 137
    :goto_3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 138
    .line 139
    return-object v1

    .line 140
    :pswitch_1
    move-object/from16 v1, p1

    .line 141
    .line 142
    check-cast v1, Lr/d;

    .line 143
    .line 144
    move-object/from16 v2, p2

    .line 145
    .line 146
    check-cast v2, Li0/h0;

    .line 147
    .line 148
    move-object/from16 v3, p3

    .line 149
    .line 150
    check-cast v3, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    and-int/lit8 v1, v3, 0x11

    .line 160
    .line 161
    const/16 v4, 0x10

    .line 162
    .line 163
    const/4 v5, 0x1

    .line 164
    if-eq v1, v4, :cond_4

    .line 165
    .line 166
    move v1, v5

    .line 167
    goto :goto_4

    .line 168
    :cond_4
    const/4 v1, 0x0

    .line 169
    :goto_4
    and-int/2addr v3, v5

    .line 170
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    new-instance v1, Lwb/c9;

    .line 177
    .line 178
    const/4 v3, 0x0

    .line 179
    iget-object v4, v0, Lwb/oa;->h:Landroid/content/Context;

    .line 180
    .line 181
    iget-object v6, v0, Lwb/oa;->i:Li0/a1;

    .line 182
    .line 183
    invoke-direct {v1, v4, v6, v3}, Lwb/c9;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 184
    .line 185
    .line 186
    const v3, -0x5c2e356c

    .line 187
    .line 188
    .line 189
    invoke-static {v3, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const/16 v3, 0x30

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_5
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 201
    .line 202
    .line 203
    :goto_5
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 204
    .line 205
    return-object v1

    .line 206
    :pswitch_2
    move-object/from16 v1, p1

    .line 207
    .line 208
    check-cast v1, Lr/d;

    .line 209
    .line 210
    move-object/from16 v2, p2

    .line 211
    .line 212
    check-cast v2, Li0/h0;

    .line 213
    .line 214
    move-object/from16 v3, p3

    .line 215
    .line 216
    check-cast v3, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    and-int/lit8 v1, v3, 0x11

    .line 226
    .line 227
    const/16 v4, 0x10

    .line 228
    .line 229
    const/4 v5, 0x1

    .line 230
    if-eq v1, v4, :cond_6

    .line 231
    .line 232
    move v1, v5

    .line 233
    goto :goto_6

    .line 234
    :cond_6
    const/4 v1, 0x0

    .line 235
    :goto_6
    and-int/2addr v3, v5

    .line 236
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_7

    .line 241
    .line 242
    new-instance v1, Lwb/c9;

    .line 243
    .line 244
    const/4 v3, 0x3

    .line 245
    iget-object v4, v0, Lwb/oa;->h:Landroid/content/Context;

    .line 246
    .line 247
    iget-object v6, v0, Lwb/oa;->i:Li0/a1;

    .line 248
    .line 249
    invoke-direct {v1, v4, v6, v3}, Lwb/c9;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 250
    .line 251
    .line 252
    const v3, -0x13dcd094

    .line 253
    .line 254
    .line 255
    invoke-static {v3, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const/16 v3, 0x30

    .line 260
    .line 261
    const/4 v4, 0x0

    .line 262
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_7
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 267
    .line 268
    .line 269
    :goto_7
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 270
    .line 271
    return-object v1

    .line 272
    :pswitch_3
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, Lr/d;

    .line 275
    .line 276
    move-object/from16 v2, p2

    .line 277
    .line 278
    check-cast v2, Li0/h0;

    .line 279
    .line 280
    move-object/from16 v3, p3

    .line 281
    .line 282
    check-cast v3, Ljava/lang/Integer;

    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    and-int/lit8 v1, v3, 0x11

    .line 292
    .line 293
    const/16 v4, 0x10

    .line 294
    .line 295
    const/4 v5, 0x1

    .line 296
    if-eq v1, v4, :cond_8

    .line 297
    .line 298
    move v1, v5

    .line 299
    goto :goto_8

    .line 300
    :cond_8
    const/4 v1, 0x0

    .line 301
    :goto_8
    and-int/2addr v3, v5

    .line 302
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-eqz v1, :cond_1d

    .line 307
    .line 308
    iget-object v1, v0, Lwb/oa;->i:Li0/a1;

    .line 309
    .line 310
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    check-cast v3, Lua/i;

    .line 315
    .line 316
    iget-boolean v3, v3, Lua/i;->x:Z

    .line 317
    .line 318
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    sget-object v6, Li0/l;->a:Li0/e;

    .line 327
    .line 328
    if-nez v4, :cond_9

    .line 329
    .line 330
    if-ne v5, v6, :cond_a

    .line 331
    .line 332
    :cond_9
    new-instance v5, Lwb/fg;

    .line 333
    .line 334
    const/4 v4, 0x6

    .line 335
    invoke-direct {v5, v1, v4}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :cond_a
    move-object v4, v5

    .line 342
    check-cast v4, Lfg/l;

    .line 343
    .line 344
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    check-cast v5, Lua/i;

    .line 349
    .line 350
    iget-boolean v5, v5, Lua/i;->y:Z

    .line 351
    .line 352
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    if-nez v7, :cond_b

    .line 361
    .line 362
    if-ne v8, v6, :cond_c

    .line 363
    .line 364
    :cond_b
    new-instance v8, Lwb/fg;

    .line 365
    .line 366
    const/4 v7, 0x7

    .line 367
    invoke-direct {v8, v1, v7}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    :cond_c
    check-cast v8, Lfg/l;

    .line 374
    .line 375
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    check-cast v7, Lua/i;

    .line 380
    .line 381
    iget-boolean v7, v7, Lua/i;->z:Z

    .line 382
    .line 383
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v9

    .line 387
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v10

    .line 391
    if-nez v9, :cond_d

    .line 392
    .line 393
    if-ne v10, v6, :cond_e

    .line 394
    .line 395
    :cond_d
    new-instance v10, Lwb/fg;

    .line 396
    .line 397
    const/16 v9, 0x8

    .line 398
    .line 399
    invoke-direct {v10, v1, v9}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_e
    check-cast v10, Lfg/l;

    .line 406
    .line 407
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    check-cast v9, Lua/i;

    .line 412
    .line 413
    iget v9, v9, Lua/i;->A:I

    .line 414
    .line 415
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v11

    .line 419
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    if-nez v11, :cond_f

    .line 424
    .line 425
    if-ne v12, v6, :cond_10

    .line 426
    .line 427
    :cond_f
    new-instance v12, Lwb/fg;

    .line 428
    .line 429
    const/16 v11, 0x9

    .line 430
    .line 431
    invoke-direct {v12, v1, v11}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    :cond_10
    check-cast v12, Lfg/l;

    .line 438
    .line 439
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v11

    .line 443
    check-cast v11, Lua/i;

    .line 444
    .line 445
    iget-boolean v11, v11, Lua/i;->B:Z

    .line 446
    .line 447
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v13

    .line 451
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v14

    .line 455
    if-nez v13, :cond_11

    .line 456
    .line 457
    if-ne v14, v6, :cond_12

    .line 458
    .line 459
    :cond_11
    new-instance v14, Lwb/fg;

    .line 460
    .line 461
    const/16 v13, 0xa

    .line 462
    .line 463
    invoke-direct {v14, v1, v13}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    :cond_12
    check-cast v14, Lfg/l;

    .line 470
    .line 471
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v13

    .line 475
    check-cast v13, Lua/i;

    .line 476
    .line 477
    iget-object v13, v13, Lua/i;->C:Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v15

    .line 483
    move/from16 v16, v3

    .line 484
    .line 485
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    if-nez v15, :cond_13

    .line 490
    .line 491
    if-ne v3, v6, :cond_14

    .line 492
    .line 493
    :cond_13
    new-instance v3, Lwb/fg;

    .line 494
    .line 495
    const/16 v15, 0xb

    .line 496
    .line 497
    invoke-direct {v3, v1, v15}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :cond_14
    check-cast v3, Lfg/l;

    .line 504
    .line 505
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v15

    .line 509
    check-cast v15, Lua/i;

    .line 510
    .line 511
    iget-object v15, v15, Lua/i;->D:Ljava/lang/String;

    .line 512
    .line 513
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v17

    .line 517
    move-object/from16 p1, v3

    .line 518
    .line 519
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    if-nez v17, :cond_16

    .line 524
    .line 525
    if-ne v3, v6, :cond_15

    .line 526
    .line 527
    goto :goto_9

    .line 528
    :cond_15
    move-object/from16 p2, v4

    .line 529
    .line 530
    goto :goto_a

    .line 531
    :cond_16
    :goto_9
    new-instance v3, Lwb/fg;

    .line 532
    .line 533
    move-object/from16 p2, v4

    .line 534
    .line 535
    const/16 v4, 0xc

    .line 536
    .line 537
    invoke-direct {v3, v1, v4}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    :goto_a
    check-cast v3, Lfg/l;

    .line 544
    .line 545
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    check-cast v4, Lua/i;

    .line 550
    .line 551
    iget-object v4, v4, Lua/i;->E:Ljava/lang/String;

    .line 552
    .line 553
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v17

    .line 557
    move-object/from16 p3, v3

    .line 558
    .line 559
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    if-nez v17, :cond_18

    .line 564
    .line 565
    if-ne v3, v6, :cond_17

    .line 566
    .line 567
    goto :goto_b

    .line 568
    :cond_17
    move-object/from16 v17, v4

    .line 569
    .line 570
    goto :goto_c

    .line 571
    :cond_18
    :goto_b
    new-instance v3, Lwb/fg;

    .line 572
    .line 573
    move-object/from16 v17, v4

    .line 574
    .line 575
    const/16 v4, 0xd

    .line 576
    .line 577
    invoke-direct {v3, v1, v4}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    :goto_c
    move-object/from16 v18, v3

    .line 584
    .line 585
    check-cast v18, Lfg/l;

    .line 586
    .line 587
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    check-cast v3, Lua/i;

    .line 592
    .line 593
    iget-boolean v3, v3, Lua/i;->F:Z

    .line 594
    .line 595
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    move/from16 v19, v3

    .line 600
    .line 601
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    if-nez v4, :cond_19

    .line 606
    .line 607
    if-ne v3, v6, :cond_1a

    .line 608
    .line 609
    :cond_19
    new-instance v3, Lwb/fg;

    .line 610
    .line 611
    const/16 v4, 0xe

    .line 612
    .line 613
    invoke-direct {v3, v1, v4}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :cond_1a
    move-object/from16 v20, v3

    .line 620
    .line 621
    check-cast v20, Lfg/l;

    .line 622
    .line 623
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    check-cast v3, Lua/i;

    .line 628
    .line 629
    iget-object v3, v3, Lua/i;->G:Ljava/lang/String;

    .line 630
    .line 631
    invoke-virtual {v2, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    move-object/from16 v21, v3

    .line 636
    .line 637
    invoke-virtual {v2}, Li0/h0;->P()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    if-nez v4, :cond_1b

    .line 642
    .line 643
    if-ne v3, v6, :cond_1c

    .line 644
    .line 645
    :cond_1b
    new-instance v3, Lwb/fg;

    .line 646
    .line 647
    const/16 v4, 0xf

    .line 648
    .line 649
    invoke-direct {v3, v1, v4}, Lwb/fg;-><init>(Li0/a1;I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v2, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    :cond_1c
    move-object/from16 v22, v3

    .line 656
    .line 657
    check-cast v22, Lfg/l;

    .line 658
    .line 659
    const/16 v25, 0x0

    .line 660
    .line 661
    const/16 v26, 0x0

    .line 662
    .line 663
    move-object/from16 v23, v2

    .line 664
    .line 665
    iget-object v2, v0, Lwb/oa;->h:Landroid/content/Context;

    .line 666
    .line 667
    const/16 v24, 0x0

    .line 668
    .line 669
    move-object/from16 v4, p2

    .line 670
    .line 671
    move-object v6, v8

    .line 672
    move-object v8, v10

    .line 673
    move-object v10, v12

    .line 674
    move-object v12, v14

    .line 675
    move/from16 v3, v16

    .line 676
    .line 677
    move-object/from16 v14, p1

    .line 678
    .line 679
    move-object/from16 v16, p3

    .line 680
    .line 681
    invoke-static/range {v2 .. v26}, Lwb/ho;->b4(Landroid/content/Context;ZLfg/l;ZLfg/l;ZLfg/l;ILfg/l;ZLfg/l;Ljava/lang/String;Lfg/l;Ljava/lang/String;Lfg/l;Ljava/lang/String;Lfg/l;ZLfg/l;Ljava/lang/String;Lfg/l;Li0/h0;III)V

    .line 682
    .line 683
    .line 684
    goto :goto_d

    .line 685
    :cond_1d
    move-object/from16 v23, v2

    .line 686
    .line 687
    invoke-virtual/range {v23 .. v23}, Li0/h0;->V()V

    .line 688
    .line 689
    .line 690
    :goto_d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 691
    .line 692
    return-object v1

    .line 693
    :pswitch_4
    move-object/from16 v1, p1

    .line 694
    .line 695
    check-cast v1, Lr/d;

    .line 696
    .line 697
    move-object/from16 v2, p2

    .line 698
    .line 699
    check-cast v2, Li0/h0;

    .line 700
    .line 701
    move-object/from16 v3, p3

    .line 702
    .line 703
    check-cast v3, Ljava/lang/Integer;

    .line 704
    .line 705
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    and-int/lit8 v1, v3, 0x11

    .line 713
    .line 714
    const/16 v4, 0x10

    .line 715
    .line 716
    const/4 v5, 0x1

    .line 717
    if-eq v1, v4, :cond_1e

    .line 718
    .line 719
    move v1, v5

    .line 720
    goto :goto_e

    .line 721
    :cond_1e
    const/4 v1, 0x0

    .line 722
    :goto_e
    and-int/2addr v3, v5

    .line 723
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    if-eqz v1, :cond_1f

    .line 728
    .line 729
    new-instance v1, Lwb/c9;

    .line 730
    .line 731
    const/4 v3, 0x5

    .line 732
    iget-object v4, v0, Lwb/oa;->h:Landroid/content/Context;

    .line 733
    .line 734
    iget-object v6, v0, Lwb/oa;->i:Li0/a1;

    .line 735
    .line 736
    invoke-direct {v1, v4, v6, v3}, Lwb/c9;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 737
    .line 738
    .line 739
    const v3, 0x5265cd7

    .line 740
    .line 741
    .line 742
    invoke-static {v3, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    const/16 v3, 0x30

    .line 747
    .line 748
    const/4 v4, 0x0

    .line 749
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 750
    .line 751
    .line 752
    goto :goto_f

    .line 753
    :cond_1f
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 754
    .line 755
    .line 756
    :goto_f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 757
    .line 758
    return-object v1

    .line 759
    :pswitch_5
    move-object/from16 v1, p1

    .line 760
    .line 761
    check-cast v1, Lr/d;

    .line 762
    .line 763
    move-object/from16 v2, p2

    .line 764
    .line 765
    check-cast v2, Li0/h0;

    .line 766
    .line 767
    move-object/from16 v3, p3

    .line 768
    .line 769
    check-cast v3, Ljava/lang/Integer;

    .line 770
    .line 771
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 772
    .line 773
    .line 774
    move-result v3

    .line 775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    and-int/lit8 v1, v3, 0x11

    .line 779
    .line 780
    const/16 v4, 0x10

    .line 781
    .line 782
    const/4 v5, 0x1

    .line 783
    if-eq v1, v4, :cond_20

    .line 784
    .line 785
    move v1, v5

    .line 786
    goto :goto_10

    .line 787
    :cond_20
    const/4 v1, 0x0

    .line 788
    :goto_10
    and-int/2addr v3, v5

    .line 789
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 790
    .line 791
    .line 792
    move-result v1

    .line 793
    if-eqz v1, :cond_21

    .line 794
    .line 795
    new-instance v1, Lwb/c9;

    .line 796
    .line 797
    const/4 v3, 0x4

    .line 798
    iget-object v4, v0, Lwb/oa;->h:Landroid/content/Context;

    .line 799
    .line 800
    iget-object v6, v0, Lwb/oa;->i:Li0/a1;

    .line 801
    .line 802
    invoke-direct {v1, v4, v6, v3}, Lwb/c9;-><init>(Landroid/content/Context;Li0/a1;I)V

    .line 803
    .line 804
    .line 805
    const v3, -0x3efd4716

    .line 806
    .line 807
    .line 808
    invoke-static {v3, v1, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    const/16 v3, 0x30

    .line 813
    .line 814
    const/4 v4, 0x0

    .line 815
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 816
    .line 817
    .line 818
    goto :goto_11

    .line 819
    :cond_21
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 820
    .line 821
    .line 822
    :goto_11
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 823
    .line 824
    return-object v1

    .line 825
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
