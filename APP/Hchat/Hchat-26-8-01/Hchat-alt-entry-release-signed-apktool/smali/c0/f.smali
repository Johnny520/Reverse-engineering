.class public final synthetic Lc0/f;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p8, p0, Lc0/f;->n:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p7}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lc0/f;->n:I

    .line 4
    .line 5
    const-string v2, "isAd"

    .line 6
    .line 7
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    iget-object v8, v0, Lgg/d;->h:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/reflect/Method;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v8, Lp8/q;

    .line 24
    .line 25
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lp8/q;->a(Ljava/lang/reflect/Method;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    array-length v2, v2

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    const-string v2, "com.tencent.mm.plugin.sns.model."

    .line 45
    .line 46
    invoke-static {v1, v7, v2}, Leh/a;->A(Ljava/lang/reflect/Method;ZLjava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v5, v7

    .line 55
    :goto_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    return-object v1

    .line 60
    :pswitch_0
    move-object/from16 v1, p1

    .line 61
    .line 62
    check-cast v1, Ljava/lang/reflect/Method;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast v8, Lp8/k;

    .line 68
    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Lp8/k;->d(Ljava/lang/reflect/Method;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    return-object v1

    .line 81
    :pswitch_1
    move-object/from16 v1, p1

    .line 82
    .line 83
    check-cast v1, Ljava/lang/reflect/Method;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast v8, Lp8/k;

    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lp8/k;->c(Ljava/lang/reflect/Method;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    return-object v1

    .line 102
    :pswitch_2
    move-object/from16 v1, p1

    .line 103
    .line 104
    check-cast v1, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    check-cast v8, Lk/g;

    .line 111
    .line 112
    iget-object v2, v8, Lk/g;->K:Lf/z;

    .line 113
    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    invoke-virtual {v8}, Lk/g;->v1()V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_1
    iget-object v1, v8, Lk/g;->w:Ln/k;

    .line 122
    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    iget-object v1, v2, Lf/z;->c:[Ljava/lang/Object;

    .line 126
    .line 127
    iget-object v9, v2, Lf/z;->a:[J

    .line 128
    .line 129
    array-length v10, v9

    .line 130
    add-int/lit8 v10, v10, -0x2

    .line 131
    .line 132
    if-ltz v10, :cond_5

    .line 133
    .line 134
    move v11, v7

    .line 135
    :goto_1
    aget-wide v12, v9, v11

    .line 136
    .line 137
    not-long v14, v12

    .line 138
    const/16 v16, 0x7

    .line 139
    .line 140
    shl-long v14, v14, v16

    .line 141
    .line 142
    and-long/2addr v14, v12

    .line 143
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    and-long v14, v14, v16

    .line 149
    .line 150
    cmp-long v14, v14, v16

    .line 151
    .line 152
    if-eqz v14, :cond_4

    .line 153
    .line 154
    sub-int v14, v11, v10

    .line 155
    .line 156
    not-int v14, v14

    .line 157
    ushr-int/lit8 v14, v14, 0x1f

    .line 158
    .line 159
    const/16 v15, 0x8

    .line 160
    .line 161
    rsub-int/lit8 v14, v14, 0x8

    .line 162
    .line 163
    move v5, v7

    .line 164
    :goto_2
    if-ge v5, v14, :cond_3

    .line 165
    .line 166
    const-wide/16 v17, 0xff

    .line 167
    .line 168
    and-long v17, v12, v17

    .line 169
    .line 170
    const-wide/16 v19, 0x80

    .line 171
    .line 172
    cmp-long v17, v17, v19

    .line 173
    .line 174
    if-gez v17, :cond_2

    .line 175
    .line 176
    shl-int/lit8 v17, v11, 0x3

    .line 177
    .line 178
    add-int v17, v17, v5

    .line 179
    .line 180
    aget-object v17, v1, v17

    .line 181
    .line 182
    move/from16 p1, v15

    .line 183
    .line 184
    move-object/from16 v15, v17

    .line 185
    .line 186
    check-cast v15, Ln/m;

    .line 187
    .line 188
    invoke-virtual {v8}, Ly0/n;->Y0()Lqg/t;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    new-instance v0, Lk/e;

    .line 193
    .line 194
    invoke-direct {v0, v8, v15, v6, v7}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

    .line 195
    .line 196
    .line 197
    const/4 v15, 0x3

    .line 198
    invoke-static {v3, v6, v0, v15}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_2
    move/from16 p1, v15

    .line 203
    .line 204
    :goto_3
    shr-long v12, v12, p1

    .line 205
    .line 206
    add-int/lit8 v5, v5, 0x1

    .line 207
    .line 208
    move-object/from16 v0, p0

    .line 209
    .line 210
    move/from16 v15, p1

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    move v0, v15

    .line 214
    if-ne v14, v0, :cond_5

    .line 215
    .line 216
    :cond_4
    if-eq v11, v10, :cond_5

    .line 217
    .line 218
    add-int/lit8 v11, v11, 0x1

    .line 219
    .line 220
    move-object/from16 v0, p0

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_5
    iget-object v0, v8, Lk/g;->L:Ln/m;

    .line 224
    .line 225
    if-eqz v0, :cond_6

    .line 226
    .line 227
    invoke-virtual {v8}, Ly0/n;->Y0()Lqg/t;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    new-instance v3, Lk/e;

    .line 232
    .line 233
    const/4 v5, 0x1

    .line 234
    invoke-direct {v3, v8, v0, v6, v5}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

    .line 235
    .line 236
    .line 237
    const/4 v15, 0x3

    .line 238
    invoke-static {v1, v6, v3, v15}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 239
    .line 240
    .line 241
    :cond_6
    invoke-virtual {v2}, Lf/z;->a()V

    .line 242
    .line 243
    .line 244
    iput-object v6, v8, Lk/g;->L:Ln/m;

    .line 245
    .line 246
    invoke-virtual {v8}, Lk/g;->w1()V

    .line 247
    .line 248
    .line 249
    :goto_4
    return-object v4

    .line 250
    :pswitch_3
    move-object/from16 v0, p1

    .line 251
    .line 252
    check-cast v0, Ljava/lang/reflect/Method;

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    check-cast v8, Lj8/a;

    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-static {v0}, Lj8/a;->e(Ljava/lang/reflect/Method;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :pswitch_4
    move-object/from16 v0, p1

    .line 272
    .line 273
    check-cast v0, Ljava/lang/reflect/Method;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    check-cast v8, Lj8/a;

    .line 279
    .line 280
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-static {v0}, Lj8/a;->c(Ljava/lang/reflect/Method;)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    return-object v0

    .line 292
    :pswitch_5
    move-object/from16 v0, p1

    .line 293
    .line 294
    check-cast v0, Lp8/l;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    check-cast v8, Lia/u;

    .line 300
    .line 301
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object v1, v0, Lp8/l;->a:Ljava/lang/String;

    .line 305
    .line 306
    if-nez v1, :cond_7

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_7
    iget-object v0, v0, Lp8/l;->c:Ljava/lang/Object;

    .line 310
    .line 311
    if-eqz v0, :cond_8

    .line 312
    .line 313
    new-array v1, v7, [Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {v0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    const/16 v16, 0x1

    .line 326
    .line 327
    xor-int/lit8 v7, v0, 0x1

    .line 328
    .line 329
    :cond_8
    :goto_5
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    return-object v0

    .line 334
    :pswitch_6
    move-object/from16 v0, p1

    .line 335
    .line 336
    check-cast v0, Lp8/l;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    check-cast v8, Lia/u;

    .line 342
    .line 343
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget-object v1, v0, Lp8/l;->a:Ljava/lang/String;

    .line 347
    .line 348
    if-nez v1, :cond_9

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_9
    iget-object v0, v0, Lp8/l;->c:Ljava/lang/Object;

    .line 352
    .line 353
    if-eqz v0, :cond_a

    .line 354
    .line 355
    new-array v1, v7, [Ljava/lang/Object;

    .line 356
    .line 357
    invoke-static {v0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 362
    .line 363
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    const/16 v16, 0x1

    .line 368
    .line 369
    xor-int/lit8 v7, v0, 0x1

    .line 370
    .line 371
    :cond_a
    :goto_6
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    return-object v0

    .line 376
    :pswitch_7
    move-object/from16 v0, p1

    .line 377
    .line 378
    check-cast v0, Ljava/lang/reflect/Method;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    check-cast v8, Lha/z;

    .line 384
    .line 385
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-static {v0}, Lha/z;->i(Ljava/lang/reflect/Method;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    return-object v0

    .line 397
    :pswitch_8
    move-object/from16 v0, p1

    .line 398
    .line 399
    check-cast v0, Ljava/lang/reflect/Method;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    check-cast v8, Lha/z;

    .line 405
    .line 406
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-static {v0}, Lha/z;->h(Ljava/lang/reflect/Method;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    return-object v0

    .line 418
    :pswitch_9
    move-object/from16 v0, p1

    .line 419
    .line 420
    check-cast v0, Ljava/lang/reflect/Method;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    check-cast v8, Lha/z;

    .line 426
    .line 427
    invoke-virtual {v8, v0}, Lha/z;->g(Ljava/lang/reflect/Method;)Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    return-object v0

    .line 436
    :pswitch_a
    move-object/from16 v0, p1

    .line 437
    .line 438
    check-cast v0, Ljava/lang/reflect/Method;

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    check-cast v8, Lha/z;

    .line 444
    .line 445
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-static {v0}, Lha/z;->f(Ljava/lang/reflect/Method;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    return-object v0

    .line 457
    :pswitch_b
    move-object/from16 v0, p1

    .line 458
    .line 459
    check-cast v0, Ljava/lang/reflect/Method;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    check-cast v8, Lha/s;

    .line 465
    .line 466
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    invoke-static {v0}, Lha/s;->h(Ljava/lang/reflect/Method;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    return-object v0

    .line 478
    :pswitch_c
    move-object/from16 v0, p1

    .line 479
    .line 480
    check-cast v0, Ljava/lang/reflect/Method;

    .line 481
    .line 482
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    check-cast v8, Lha/s;

    .line 486
    .line 487
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-static {v0}, Lha/s;->f(Ljava/lang/reflect/Method;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    return-object v0

    .line 499
    :pswitch_d
    move-object/from16 v0, p1

    .line 500
    .line 501
    check-cast v0, Ljava/lang/reflect/Method;

    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    check-cast v8, Lha/s;

    .line 507
    .line 508
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-static {v0}, Lha/s;->d(Ljava/lang/reflect/Method;)Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    return-object v0

    .line 520
    :pswitch_e
    move-object/from16 v0, p1

    .line 521
    .line 522
    check-cast v0, Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    check-cast v8, Lfb/s2;

    .line 528
    .line 529
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v8, v0, v7}, Lfb/s2;->D(Ljava/lang/String;Z)Ljava/io/File;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    if-nez v2, :cond_b

    .line 541
    .line 542
    goto :goto_7

    .line 543
    :cond_b
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    if-eqz v2, :cond_e

    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 550
    .line 551
    .line 552
    move-result-wide v2

    .line 553
    const-wide/32 v4, 0x200000

    .line 554
    .line 555
    .line 556
    cmp-long v2, v2, v4

    .line 557
    .line 558
    if-gtz v2, :cond_d

    .line 559
    .line 560
    invoke-static {v1}, Ldg/l;->g0(Ljava/io/File;)[B

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    sget-object v2, Lfb/t2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 565
    .line 566
    invoke-static {v1}, Lfb/t2;->C([B)Z

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    if-eqz v2, :cond_c

    .line 571
    .line 572
    new-instance v6, Ljava/lang/String;

    .line 573
    .line 574
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 575
    .line 576
    invoke-direct {v6, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 577
    .line 578
    .line 579
    goto :goto_7

    .line 580
    :cond_c
    const-string v1, "\u6587\u4ef6\u4e0d\u662f\u53ef\u4fee\u6539\u7684\u6587\u672c\u6587\u4ef6: "

    .line 581
    .line 582
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    goto :goto_7

    .line 590
    :cond_d
    const-string v1, "\u6587\u4ef6\u8d85\u8fc7 2 MB: "

    .line 591
    .line 592
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    goto :goto_7

    .line 600
    :cond_e
    const-string v1, "\u7edf\u4e00\u8865\u4e01\u53ea\u80fd\u64cd\u4f5c\u6587\u672c\u6587\u4ef6: "

    .line 601
    .line 602
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-static {v0}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    :goto_7
    return-object v6

    .line 610
    :pswitch_f
    move-object/from16 v0, p1

    .line 611
    .line 612
    check-cast v0, Ljava/io/File;

    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    check-cast v8, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 618
    .line 619
    invoke-static {v8, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$isPluginDirectory(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Ljava/io/File;)Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    return-object v0

    .line 628
    :pswitch_10
    move-object/from16 v0, p1

    .line 629
    .line 630
    check-cast v0, Ljava/io/File;

    .line 631
    .line 632
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    check-cast v8, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 636
    .line 637
    invoke-static {v8, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->access$isPluginDirectory(Lh/Hchat/hooks/items/script/ScriptPluginRuntime;Ljava/io/File;)Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    return-object v0

    .line 646
    :pswitch_11
    move-object/from16 v0, p1

    .line 647
    .line 648
    check-cast v0, Ljava/lang/String;

    .line 649
    .line 650
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    check-cast v8, Ljava/util/Map;

    .line 654
    .line 655
    invoke-interface {v8, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    return-object v0

    .line 664
    :pswitch_12
    move-object/from16 v0, p1

    .line 665
    .line 666
    check-cast v0, Ljava/lang/Number;

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    check-cast v8, Ljava/util/List;

    .line 673
    .line 674
    invoke-static {v0, v8}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    check-cast v0, Lca/a0;

    .line 679
    .line 680
    return-object v0

    .line 681
    :pswitch_13
    move-object/from16 v0, p1

    .line 682
    .line 683
    check-cast v0, Ljava/lang/reflect/Method;

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    check-cast v8, Lc9/d2;

    .line 689
    .line 690
    invoke-static {v8, v0}, Lc9/d2;->g(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    return-object v0

    .line 699
    :pswitch_14
    move-object/from16 v0, p1

    .line 700
    .line 701
    check-cast v0, Ljava/lang/reflect/Method;

    .line 702
    .line 703
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    check-cast v8, Lc9/d2;

    .line 707
    .line 708
    invoke-static {v8, v0}, Lc9/d2;->f(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 709
    .line 710
    .line 711
    move-result v0

    .line 712
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    return-object v0

    .line 717
    :pswitch_15
    move-object/from16 v0, p1

    .line 718
    .line 719
    check-cast v0, Ljava/lang/reflect/Method;

    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    check-cast v8, Lc9/d2;

    .line 725
    .line 726
    invoke-static {v8, v0}, Lc9/d2;->e(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    return-object v0

    .line 735
    :pswitch_16
    move-object/from16 v0, p1

    .line 736
    .line 737
    check-cast v0, Ljava/lang/reflect/Method;

    .line 738
    .line 739
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    check-cast v8, Lc9/d2;

    .line 743
    .line 744
    invoke-static {v8, v0}, Lc9/d2;->d(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    return-object v0

    .line 753
    :pswitch_17
    move-object/from16 v0, p1

    .line 754
    .line 755
    check-cast v0, Ljava/lang/reflect/Method;

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    check-cast v8, Lc9/d2;

    .line 761
    .line 762
    invoke-static {v8, v0}, Lc9/d2;->c(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    return-object v0

    .line 771
    :pswitch_18
    move-object/from16 v0, p1

    .line 772
    .line 773
    check-cast v0, Ljava/lang/reflect/Method;

    .line 774
    .line 775
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    check-cast v8, Lc9/d2;

    .line 779
    .line 780
    invoke-static {v8, v0}, Lc9/d2;->b(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    return-object v0

    .line 789
    :pswitch_19
    move-object/from16 v0, p1

    .line 790
    .line 791
    check-cast v0, Ljava/lang/reflect/Method;

    .line 792
    .line 793
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    check-cast v8, Lc9/d2;

    .line 797
    .line 798
    invoke-static {v8, v0}, Lc9/d2;->a(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    return-object v0

    .line 807
    :pswitch_1a
    move-object/from16 v0, p1

    .line 808
    .line 809
    check-cast v0, Ljava/lang/reflect/Method;

    .line 810
    .line 811
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    check-cast v8, Lc9/d2;

    .line 815
    .line 816
    invoke-static {v8, v0}, Lc9/d2;->a(Lc9/d2;Ljava/lang/reflect/Method;)Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    return-object v0

    .line 825
    :pswitch_1b
    move-object/from16 v0, p1

    .line 826
    .line 827
    check-cast v0, Lfg/l;

    .line 828
    .line 829
    check-cast v8, Ly/a;

    .line 830
    .line 831
    iget-object v1, v8, Ly/a;->b:Lf/f0;

    .line 832
    .line 833
    invoke-virtual {v1, v0}, Lf/f0;->a(Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    return-object v4

    .line 837
    :pswitch_1c
    move-object/from16 v0, p1

    .line 838
    .line 839
    check-cast v0, Le1/b;

    .line 840
    .line 841
    iget-wide v11, v0, Le1/b;->a:J

    .line 842
    .line 843
    move-object v10, v8

    .line 844
    check-cast v10, Lc0/j;

    .line 845
    .line 846
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    sget-object v0, Ld0/f;->a:Li0/u;

    .line 850
    .line 851
    invoke-static {v10, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    move-object v13, v0

    .line 856
    check-cast v13, Ld0/e;

    .line 857
    .line 858
    if-nez v13, :cond_f

    .line 859
    .line 860
    goto :goto_8

    .line 861
    :cond_f
    new-instance v14, Lc0/h;

    .line 862
    .line 863
    invoke-direct {v14, v10, v11, v12}, Lc0/h;-><init>(Lc0/j;J)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v10}, Ly0/n;->Y0()Lqg/t;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    new-instance v9, Lc0/i;

    .line 871
    .line 872
    const/4 v15, 0x0

    .line 873
    invoke-direct/range {v9 .. v15}, Lc0/i;-><init>(Lc0/j;JLd0/e;Lc0/h;Lwf/c;)V

    .line 874
    .line 875
    .line 876
    const/4 v15, 0x3

    .line 877
    invoke-static {v0, v6, v9, v15}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 878
    .line 879
    .line 880
    :goto_8
    return-object v4

    .line 881
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
