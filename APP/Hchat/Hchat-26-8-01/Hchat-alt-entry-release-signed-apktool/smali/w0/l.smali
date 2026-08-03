.class public final synthetic Lw0/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw0/l;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw0/l;->g:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0x18

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    sget-object v10, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Lna/i;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, v1, Lna/i;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, Lna/i;->b:Ljava/lang/String;

    .line 35
    .line 36
    :cond_0
    return-object v2

    .line 37
    :pswitch_0
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Leb/c0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    return-object v10

    .line 45
    :pswitch_1
    move-object/from16 v1, p1

    .line 46
    .line 47
    check-cast v1, Lwb/sv;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v1, v1, Lwb/sv;->b:Ljava/lang/String;

    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_2
    move-object/from16 v1, p1

    .line 56
    .line 57
    check-cast v1, Lwb/qo;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    instance-of v1, v1, Lwb/po;

    .line 63
    .line 64
    xor-int/2addr v1, v9

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    return-object v1

    .line 70
    :pswitch_3
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Lr/h;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object v3, Lwb/p0;->H1:Ls0/d;

    .line 78
    .line 79
    invoke-static {v1, v7, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 80
    .line 81
    .line 82
    return-object v10

    .line 83
    :pswitch_4
    move-object/from16 v1, p1

    .line 84
    .line 85
    check-cast v1, Lwb/g;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    if-eq v1, v9, :cond_3

    .line 97
    .line 98
    if-eq v1, v6, :cond_2

    .line 99
    .line 100
    if-eq v1, v2, :cond_5

    .line 101
    .line 102
    if-eq v1, v5, :cond_5

    .line 103
    .line 104
    const/4 v3, 0x5

    .line 105
    if-ne v1, v3, :cond_1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move v2, v6

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    move v2, v9

    .line 115
    goto :goto_0

    .line 116
    :cond_4
    move v2, v8

    .line 117
    :cond_5
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    :goto_1
    return-object v7

    .line 122
    :pswitch_5
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    xor-int/2addr v1, v9

    .line 134
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    return-object v1

    .line 139
    :pswitch_6
    move-object/from16 v1, p1

    .line 140
    .line 141
    check-cast v1, Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v1, v1}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    return-object v1

    .line 148
    :pswitch_7
    move-object/from16 v1, p1

    .line 149
    .line 150
    check-cast v1, Lwb/c;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    instance-of v1, v1, Lwb/b;

    .line 156
    .line 157
    xor-int/2addr v1, v9

    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    return-object v1

    .line 163
    :pswitch_8
    move-object/from16 v1, p1

    .line 164
    .line 165
    check-cast v1, Lwb/g4;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v2, Lwb/e4;->a:Lwb/e4;

    .line 171
    .line 172
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    instance-of v1, v1, Lwb/f4;

    .line 180
    .line 181
    if-eqz v1, :cond_7

    .line 182
    .line 183
    move v8, v9

    .line 184
    :goto_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    goto :goto_3

    .line 189
    :cond_7
    invoke-static {}, Lokio/a;->k()V

    .line 190
    .line 191
    .line 192
    :goto_3
    return-object v7

    .line 193
    :pswitch_9
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, Lwb/zq;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    sget-object v2, Lwb/xq;->c:Lwb/xq;

    .line 201
    .line 202
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_8

    .line 207
    .line 208
    move v6, v8

    .line 209
    goto :goto_4

    .line 210
    :cond_8
    sget-object v2, Lwb/xq;->b:Lwb/xq;

    .line 211
    .line 212
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_9

    .line 217
    .line 218
    move v6, v9

    .line 219
    goto :goto_4

    .line 220
    :cond_9
    sget-object v2, Lwb/xq;->a:Lwb/xq;

    .line 221
    .line 222
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_b

    .line 227
    .line 228
    instance-of v1, v1, Lwb/yq;

    .line 229
    .line 230
    if-eqz v1, :cond_a

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_a
    invoke-static {}, Lokio/a;->k()V

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_b
    :goto_4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    :goto_5
    return-object v7

    .line 242
    :pswitch_a
    move-object/from16 v1, p1

    .line 243
    .line 244
    check-cast v1, Lwb/iu;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    sget-object v2, Lwb/hu;->a:Lwb/hu;

    .line 250
    .line 251
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_c

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_c
    instance-of v1, v1, Lwb/gu;

    .line 259
    .line 260
    if-eqz v1, :cond_d

    .line 261
    .line 262
    move v8, v9

    .line 263
    :goto_6
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    goto :goto_7

    .line 268
    :cond_d
    invoke-static {}, Lokio/a;->k()V

    .line 269
    .line 270
    .line 271
    :goto_7
    return-object v7

    .line 272
    :pswitch_b
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    return-object v10

    .line 280
    :pswitch_c
    move-object/from16 v1, p1

    .line 281
    .line 282
    check-cast v1, Landroid/content/Context;

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    new-instance v2, Landroid/widget/ImageView;

    .line 288
    .line 289
    invoke-direct {v2, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 290
    .line 291
    .line 292
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 293
    .line 294
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 295
    .line 296
    .line 297
    return-object v2

    .line 298
    :pswitch_d
    move-object/from16 v1, p1

    .line 299
    .line 300
    check-cast v1, Landroid/content/Context;

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    new-instance v2, Landroid/widget/ImageView;

    .line 306
    .line 307
    invoke-direct {v2, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 308
    .line 309
    .line 310
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 311
    .line 312
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 313
    .line 314
    .line 315
    return-object v2

    .line 316
    :pswitch_e
    move-object/from16 v1, p1

    .line 317
    .line 318
    check-cast v1, Lwb/b3;

    .line 319
    .line 320
    if-nez v1, :cond_e

    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_e
    move v8, v9

    .line 324
    :goto_8
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    return-object v1

    .line 329
    :pswitch_f
    move-object/from16 v1, p1

    .line 330
    .line 331
    check-cast v1, Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    return-object v10

    .line 337
    :pswitch_10
    move-object/from16 v1, p1

    .line 338
    .line 339
    check-cast v1, Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    return-object v10

    .line 345
    :pswitch_11
    move-object/from16 v1, p1

    .line 346
    .line 347
    check-cast v1, Ljava/lang/String;

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    return-object v10

    .line 353
    :pswitch_12
    move-object/from16 v1, p1

    .line 354
    .line 355
    check-cast v1, Ljava/lang/String;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    return-object v10

    .line 361
    :pswitch_13
    move-object/from16 v1, p1

    .line 362
    .line 363
    check-cast v1, Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    return-object v10

    .line 369
    :pswitch_14
    move-object/from16 v1, p1

    .line 370
    .line 371
    check-cast v1, Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    return-object v10

    .line 377
    :pswitch_15
    move-object/from16 v1, p1

    .line 378
    .line 379
    check-cast v1, Lwb/lu;

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    instance-of v1, v1, Lwb/ju;

    .line 385
    .line 386
    xor-int/2addr v1, v9

    .line 387
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    return-object v1

    .line 392
    :pswitch_16
    move-object/from16 v1, p1

    .line 393
    .line 394
    check-cast v1, Lh/t;

    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1}, Lh/t;->c()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    check-cast v2, Lwb/x2;

    .line 404
    .line 405
    invoke-static {v2}, Lwb/ho;->z4(Lwb/x2;)I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    invoke-virtual {v1}, Lh/t;->b()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    check-cast v1, Lwb/x2;

    .line 414
    .line 415
    invoke-static {v1}, Lwb/ho;->z4(Lwb/x2;)I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-le v2, v1, :cond_f

    .line 420
    .line 421
    move v1, v9

    .line 422
    goto :goto_9

    .line 423
    :cond_f
    move v1, v8

    .line 424
    :goto_9
    const/16 v2, 0x104

    .line 425
    .line 426
    const/4 v3, 0x6

    .line 427
    invoke-static {v2, v3, v7}, Li/d;->p(IILi/v;)Li/l1;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    new-instance v5, Lwb/m6;

    .line 432
    .line 433
    invoke-direct {v5, v8, v1}, Lwb/m6;-><init>(IZ)V

    .line 434
    .line 435
    .line 436
    sget-object v10, Lh/m0;->a:Li/m1;

    .line 437
    .line 438
    new-instance v10, Lh/l0;

    .line 439
    .line 440
    invoke-direct {v10, v5, v8}, Lh/l0;-><init>(Lfg/l;I)V

    .line 441
    .line 442
    .line 443
    new-instance v5, Lh/r0;

    .line 444
    .line 445
    new-instance v11, Lh/h1;

    .line 446
    .line 447
    new-instance v13, Lh/f1;

    .line 448
    .line 449
    invoke-direct {v13, v10, v4}, Lh/f1;-><init>(Lfg/l;Li/y;)V

    .line 450
    .line 451
    .line 452
    const/16 v16, 0x0

    .line 453
    .line 454
    const/16 v17, 0x7d

    .line 455
    .line 456
    const/4 v12, 0x0

    .line 457
    const/4 v14, 0x0

    .line 458
    const/4 v15, 0x0

    .line 459
    invoke-direct/range {v11 .. v17}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 460
    .line 461
    .line 462
    invoke-direct {v5, v11}, Lh/r0;-><init>(Lh/h1;)V

    .line 463
    .line 464
    .line 465
    const/16 v4, 0xb4

    .line 466
    .line 467
    invoke-static {v4, v3, v7}, Li/d;->p(IILi/v;)Li/l1;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    invoke-static {v4, v6}, Lh/m0;->a(Li/y;I)Lh/r0;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    invoke-virtual {v5, v4}, Lh/r0;->a(Lh/r0;)Lh/r0;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    invoke-static {v2, v3, v7}, Li/d;->p(IILi/v;)Li/l1;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    new-instance v5, Lwb/m6;

    .line 484
    .line 485
    invoke-direct {v5, v9, v1}, Lwb/m6;-><init>(IZ)V

    .line 486
    .line 487
    .line 488
    new-instance v1, Lh/l0;

    .line 489
    .line 490
    invoke-direct {v1, v5, v9}, Lh/l0;-><init>(Lfg/l;I)V

    .line 491
    .line 492
    .line 493
    new-instance v5, Lh/s0;

    .line 494
    .line 495
    new-instance v8, Lh/h1;

    .line 496
    .line 497
    new-instance v10, Lh/f1;

    .line 498
    .line 499
    invoke-direct {v10, v1, v2}, Lh/f1;-><init>(Lfg/l;Li/y;)V

    .line 500
    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const/16 v14, 0x7d

    .line 504
    .line 505
    const/4 v9, 0x0

    .line 506
    const/4 v11, 0x0

    .line 507
    invoke-direct/range {v8 .. v14}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 508
    .line 509
    .line 510
    invoke-direct {v5, v8}, Lh/s0;-><init>(Lh/h1;)V

    .line 511
    .line 512
    .line 513
    const/16 v1, 0xa0

    .line 514
    .line 515
    invoke-static {v1, v3, v7}, Li/d;->p(IILi/v;)Li/l1;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-static {v1, v6}, Lh/m0;->b(Li/l1;I)Lh/s0;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-virtual {v5, v1}, Lh/s0;->a(Lh/s0;)Lh/s0;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    sget v2, Lh/k;->b:I

    .line 528
    .line 529
    new-instance v2, Lh/e0;

    .line 530
    .line 531
    invoke-direct {v2, v4, v1}, Lh/e0;-><init>(Lh/r0;Lh/s0;)V

    .line 532
    .line 533
    .line 534
    return-object v2

    .line 535
    :pswitch_17
    move-object/from16 v1, p1

    .line 536
    .line 537
    check-cast v1, Lth/g;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-static {v1}, La/a;->b1(Lth/g;)V

    .line 543
    .line 544
    .line 545
    int-to-float v2, v5

    .line 546
    iget v5, v1, Lth/g;->g:F

    .line 547
    .line 548
    mul-float v6, v5, v2

    .line 549
    .line 550
    mul-float/2addr v5, v2

    .line 551
    invoke-static {v1, v6, v5}, Lth/c;->a(Lth/g;FF)V

    .line 552
    .line 553
    .line 554
    int-to-float v2, v4

    .line 555
    iget v4, v1, Lth/g;->g:F

    .line 556
    .line 557
    mul-float v5, v4, v2

    .line 558
    .line 559
    mul-float/2addr v4, v2

    .line 560
    invoke-static {v1, v5, v4, v8, v3}, La/a;->w0(Lth/g;FFZF)V

    .line 561
    .line 562
    .line 563
    return-object v10

    .line 564
    :pswitch_18
    move-object/from16 v1, p1

    .line 565
    .line 566
    check-cast v1, Lth/g;

    .line 567
    .line 568
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-static {v1}, La/a;->b1(Lth/g;)V

    .line 572
    .line 573
    .line 574
    int-to-float v2, v5

    .line 575
    iget v5, v1, Lth/g;->g:F

    .line 576
    .line 577
    mul-float v6, v5, v2

    .line 578
    .line 579
    mul-float/2addr v5, v2

    .line 580
    invoke-static {v1, v6, v5}, Lth/c;->a(Lth/g;FF)V

    .line 581
    .line 582
    .line 583
    int-to-float v2, v4

    .line 584
    iget v4, v1, Lth/g;->g:F

    .line 585
    .line 586
    mul-float v5, v4, v2

    .line 587
    .line 588
    mul-float/2addr v4, v2

    .line 589
    invoke-static {v1, v5, v4, v8, v3}, La/a;->w0(Lth/g;FFZF)V

    .line 590
    .line 591
    .line 592
    return-object v10

    .line 593
    :pswitch_19
    move-object/from16 v1, p1

    .line 594
    .line 595
    check-cast v1, Lf2/y;

    .line 596
    .line 597
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    return-object v10

    .line 601
    :pswitch_1a
    move-object/from16 v1, p1

    .line 602
    .line 603
    check-cast v1, Lth/g;

    .line 604
    .line 605
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    invoke-static {v1}, La/a;->b1(Lth/g;)V

    .line 609
    .line 610
    .line 611
    int-to-float v2, v5

    .line 612
    iget v5, v1, Lth/g;->g:F

    .line 613
    .line 614
    mul-float v6, v5, v2

    .line 615
    .line 616
    mul-float/2addr v5, v2

    .line 617
    invoke-static {v1, v6, v5}, Lth/c;->a(Lth/g;FF)V

    .line 618
    .line 619
    .line 620
    int-to-float v2, v4

    .line 621
    iget v4, v1, Lth/g;->g:F

    .line 622
    .line 623
    mul-float v5, v4, v2

    .line 624
    .line 625
    mul-float/2addr v4, v2

    .line 626
    invoke-static {v1, v5, v4, v8, v3}, La/a;->w0(Lth/g;FFZF)V

    .line 627
    .line 628
    .line 629
    return-object v10

    .line 630
    :pswitch_1b
    move-object/from16 v1, p1

    .line 631
    .line 632
    check-cast v1, Lwb/a1;

    .line 633
    .line 634
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    sget-object v2, Lwb/y0;->a:Lwb/y0;

    .line 638
    .line 639
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    if-eqz v2, :cond_10

    .line 644
    .line 645
    move v6, v8

    .line 646
    goto :goto_a

    .line 647
    :cond_10
    instance-of v2, v1, Lwb/x0;

    .line 648
    .line 649
    if-eqz v2, :cond_11

    .line 650
    .line 651
    move v6, v9

    .line 652
    goto :goto_a

    .line 653
    :cond_11
    instance-of v2, v1, Lwb/w0;

    .line 654
    .line 655
    if-nez v2, :cond_13

    .line 656
    .line 657
    instance-of v1, v1, Lwb/z0;

    .line 658
    .line 659
    if-eqz v1, :cond_12

    .line 660
    .line 661
    goto :goto_a

    .line 662
    :cond_12
    invoke-static {}, Lokio/a;->k()V

    .line 663
    .line 664
    .line 665
    goto :goto_b

    .line 666
    :cond_13
    :goto_a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 667
    .line 668
    .line 669
    move-result-object v7

    .line 670
    :goto_b
    return-object v7

    .line 671
    :pswitch_1c
    move-object/from16 v1, p1

    .line 672
    .line 673
    check-cast v1, Lw0/j;

    .line 674
    .line 675
    sget-object v1, Lw0/m;->a:Lw0/l;

    .line 676
    .line 677
    return-object v10

    .line 678
    nop

    .line 679
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
