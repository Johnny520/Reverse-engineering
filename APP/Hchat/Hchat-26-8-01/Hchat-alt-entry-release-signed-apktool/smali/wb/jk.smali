.class public final synthetic Lwb/jk;
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
    iput p1, p0, Lwb/jk;->g:I

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
    iget v1, v0, Lwb/jk;->g:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, Lgb/g;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Lgb/g;->a:Ljava/lang/String;

    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Lgb/g;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v1, v1, Lgb/g;->a:Ljava/lang/String;

    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_1
    move-object/from16 v1, p1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/reflect/Method;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    array-length v2, v2

    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-class v2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    move v5, v6

    .line 65
    :cond_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    return-object v1

    .line 70
    :pswitch_2
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    return-object v7

    .line 78
    :pswitch_3
    move-object/from16 v1, p1

    .line 79
    .line 80
    check-cast v1, Lwb/no;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    instance-of v1, v1, Lwb/mo;

    .line 86
    .line 87
    xor-int/2addr v1, v6

    .line 88
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    return-object v1

    .line 93
    :pswitch_4
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, Lwb/r2;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v2, Lwb/m2;->b:Lwb/m2;

    .line 101
    .line 102
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    move v3, v5

    .line 109
    goto :goto_1

    .line 110
    :cond_1
    sget-object v2, Lwb/m2;->c:Lwb/m2;

    .line 111
    .line 112
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    instance-of v2, v1, Lwb/o2;

    .line 119
    .line 120
    if-nez v2, :cond_4

    .line 121
    .line 122
    instance-of v2, v1, Lwb/n2;

    .line 123
    .line 124
    if-eqz v2, :cond_2

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    sget-object v2, Lwb/m2;->a:Lwb/m2;

    .line 128
    .line 129
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_5

    .line 134
    .line 135
    instance-of v2, v1, Lwb/q2;

    .line 136
    .line 137
    if-nez v2, :cond_5

    .line 138
    .line 139
    instance-of v1, v1, Lwb/p2;

    .line 140
    .line 141
    if-eqz v1, :cond_3

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-static {}, Lokio/a;->k()V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    :goto_0
    move v3, v6

    .line 149
    :cond_5
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    :goto_2
    return-object v4

    .line 154
    :pswitch_5
    move-object/from16 v1, p1

    .line 155
    .line 156
    check-cast v1, Lh/t;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lh/t;->c()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    check-cast v7, Lwb/t4;

    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    invoke-virtual {v1}, Lh/t;->b()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Lwb/t4;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-le v7, v1, :cond_6

    .line 182
    .line 183
    move v1, v6

    .line 184
    goto :goto_3

    .line 185
    :cond_6
    move v1, v5

    .line 186
    :goto_3
    const/16 v7, 0xf0

    .line 187
    .line 188
    const/4 v8, 0x6

    .line 189
    invoke-static {v7, v8, v4}, Li/d;->p(IILi/v;)Li/l1;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    new-instance v9, Lwb/m6;

    .line 194
    .line 195
    invoke-direct {v9, v3, v1}, Lwb/m6;-><init>(IZ)V

    .line 196
    .line 197
    .line 198
    sget-object v10, Lh/m0;->a:Li/m1;

    .line 199
    .line 200
    new-instance v10, Lh/l0;

    .line 201
    .line 202
    invoke-direct {v10, v9, v5}, Lh/l0;-><init>(Lfg/l;I)V

    .line 203
    .line 204
    .line 205
    new-instance v5, Lh/r0;

    .line 206
    .line 207
    new-instance v11, Lh/h1;

    .line 208
    .line 209
    new-instance v13, Lh/f1;

    .line 210
    .line 211
    invoke-direct {v13, v10, v7}, Lh/f1;-><init>(Lfg/l;Li/y;)V

    .line 212
    .line 213
    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    const/16 v17, 0x7d

    .line 217
    .line 218
    const/4 v12, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    invoke-direct/range {v11 .. v17}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 222
    .line 223
    .line 224
    invoke-direct {v5, v11}, Lh/r0;-><init>(Lh/h1;)V

    .line 225
    .line 226
    .line 227
    const/16 v7, 0xa0

    .line 228
    .line 229
    invoke-static {v7, v8, v4}, Li/d;->p(IILi/v;)Li/l1;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-static {v7, v3}, Lh/m0;->a(Li/y;I)Lh/r0;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-virtual {v5, v7}, Lh/r0;->a(Lh/r0;)Lh/r0;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    const/16 v7, 0xdc

    .line 242
    .line 243
    invoke-static {v7, v8, v4}, Li/d;->p(IILi/v;)Li/l1;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    new-instance v9, Lwb/m6;

    .line 248
    .line 249
    invoke-direct {v9, v2, v1}, Lwb/m6;-><init>(IZ)V

    .line 250
    .line 251
    .line 252
    new-instance v1, Lh/l0;

    .line 253
    .line 254
    invoke-direct {v1, v9, v6}, Lh/l0;-><init>(Lfg/l;I)V

    .line 255
    .line 256
    .line 257
    new-instance v2, Lh/s0;

    .line 258
    .line 259
    new-instance v9, Lh/h1;

    .line 260
    .line 261
    new-instance v11, Lh/f1;

    .line 262
    .line 263
    invoke-direct {v11, v1, v7}, Lh/f1;-><init>(Lfg/l;Li/y;)V

    .line 264
    .line 265
    .line 266
    const/16 v15, 0x7d

    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    const/4 v13, 0x0

    .line 270
    invoke-direct/range {v9 .. v15}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v2, v9}, Lh/s0;-><init>(Lh/h1;)V

    .line 274
    .line 275
    .line 276
    const/16 v1, 0x8c

    .line 277
    .line 278
    invoke-static {v1, v8, v4}, Li/d;->p(IILi/v;)Li/l1;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-static {v1, v3}, Lh/m0;->b(Li/l1;I)Lh/s0;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v2, v1}, Lh/s0;->a(Lh/s0;)Lh/s0;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    sget v2, Lh/k;->b:I

    .line 291
    .line 292
    new-instance v2, Lh/e0;

    .line 293
    .line 294
    invoke-direct {v2, v5, v1}, Lh/e0;-><init>(Lh/r0;Lh/s0;)V

    .line 295
    .line 296
    .line 297
    return-object v2

    .line 298
    :pswitch_6
    move-object/from16 v1, p1

    .line 299
    .line 300
    check-cast v1, Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    return-object v7

    .line 306
    :pswitch_7
    move-object/from16 v1, p1

    .line 307
    .line 308
    check-cast v1, Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    return-object v7

    .line 314
    :pswitch_8
    move-object/from16 v1, p1

    .line 315
    .line 316
    check-cast v1, Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    return-object v7

    .line 322
    :pswitch_9
    move-object/from16 v1, p1

    .line 323
    .line 324
    check-cast v1, Lwb/b3;

    .line 325
    .line 326
    if-nez v1, :cond_7

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_7
    move v5, v6

    .line 330
    :goto_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    return-object v1

    .line 335
    :pswitch_a
    move-object/from16 v1, p1

    .line 336
    .line 337
    check-cast v1, Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    return-object v7

    .line 343
    :pswitch_b
    move-object/from16 v1, p1

    .line 344
    .line 345
    check-cast v1, Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    return-object v7

    .line 351
    :pswitch_c
    move-object/from16 v1, p1

    .line 352
    .line 353
    check-cast v1, Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    return-object v7

    .line 359
    :pswitch_d
    move-object/from16 v1, p1

    .line 360
    .line 361
    check-cast v1, Lwb/j;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    sget-object v2, Lwb/h;->a:Lwb/h;

    .line 367
    .line 368
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-eqz v2, :cond_8

    .line 373
    .line 374
    move v3, v5

    .line 375
    goto :goto_6

    .line 376
    :cond_8
    sget-object v2, Lwb/h;->b:Lwb/h;

    .line 377
    .line 378
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-nez v2, :cond_b

    .line 383
    .line 384
    sget-object v2, Lwb/h;->c:Lwb/h;

    .line 385
    .line 386
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-eqz v2, :cond_9

    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_9
    sget-object v2, Lwb/h;->d:Lwb/h;

    .line 394
    .line 395
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-nez v2, :cond_c

    .line 400
    .line 401
    sget-object v2, Lwb/h;->e:Lwb/h;

    .line 402
    .line 403
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-nez v2, :cond_c

    .line 408
    .line 409
    instance-of v1, v1, Lwb/i;

    .line 410
    .line 411
    if-eqz v1, :cond_a

    .line 412
    .line 413
    goto :goto_6

    .line 414
    :cond_a
    invoke-static {}, Lokio/a;->k()V

    .line 415
    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_b
    :goto_5
    move v3, v6

    .line 419
    :cond_c
    :goto_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    :goto_7
    return-object v4

    .line 424
    :pswitch_e
    move-object/from16 v1, p1

    .line 425
    .line 426
    check-cast v1, Ljava/lang/String;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    return-object v7

    .line 432
    :pswitch_f
    move-object/from16 v1, p1

    .line 433
    .line 434
    check-cast v1, Lwb/mq;

    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    sget-object v2, Lwb/kq;->a:Lwb/kq;

    .line 440
    .line 441
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    if-eqz v2, :cond_d

    .line 446
    .line 447
    move v3, v5

    .line 448
    goto :goto_8

    .line 449
    :cond_d
    instance-of v2, v1, Lwb/lq;

    .line 450
    .line 451
    if-eqz v2, :cond_e

    .line 452
    .line 453
    move v3, v6

    .line 454
    goto :goto_8

    .line 455
    :cond_e
    instance-of v1, v1, Lwb/jq;

    .line 456
    .line 457
    if-eqz v1, :cond_f

    .line 458
    .line 459
    :goto_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    goto :goto_9

    .line 464
    :cond_f
    invoke-static {}, Lokio/a;->k()V

    .line 465
    .line 466
    .line 467
    :goto_9
    return-object v4

    .line 468
    :pswitch_10
    move-object/from16 v1, p1

    .line 469
    .line 470
    check-cast v1, Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    return-object v7

    .line 476
    :pswitch_11
    move-object/from16 v1, p1

    .line 477
    .line 478
    check-cast v1, Lwb/o;

    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    sget-object v2, Lwb/m;->a:Lwb/m;

    .line 484
    .line 485
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    if-eqz v2, :cond_10

    .line 490
    .line 491
    goto :goto_b

    .line 492
    :cond_10
    instance-of v2, v1, Lwb/n;

    .line 493
    .line 494
    if-nez v2, :cond_12

    .line 495
    .line 496
    instance-of v2, v1, Lwb/k;

    .line 497
    .line 498
    if-nez v2, :cond_12

    .line 499
    .line 500
    instance-of v1, v1, Lwb/l;

    .line 501
    .line 502
    if-eqz v1, :cond_11

    .line 503
    .line 504
    goto :goto_a

    .line 505
    :cond_11
    invoke-static {}, Lokio/a;->k()V

    .line 506
    .line 507
    .line 508
    goto :goto_c

    .line 509
    :cond_12
    :goto_a
    move v5, v6

    .line 510
    :goto_b
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    :goto_c
    return-object v4

    .line 515
    :pswitch_12
    move-object/from16 v1, p1

    .line 516
    .line 517
    check-cast v1, Lwb/e;

    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    sget-object v2, Lwb/e;->b:Lwb/e;

    .line 523
    .line 524
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    if-eqz v2, :cond_13

    .line 529
    .line 530
    goto :goto_d

    .line 531
    :cond_13
    sget-object v2, Lwb/e;->a:Lwb/e;

    .line 532
    .line 533
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    if-eqz v1, :cond_14

    .line 538
    .line 539
    move v5, v6

    .line 540
    :goto_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    goto :goto_e

    .line 545
    :cond_14
    invoke-static {}, Lokio/a;->k()V

    .line 546
    .line 547
    .line 548
    :goto_e
    return-object v4

    .line 549
    :pswitch_13
    move-object/from16 v1, p1

    .line 550
    .line 551
    check-cast v1, Lwb/gq;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    instance-of v1, v1, Lwb/fq;

    .line 557
    .line 558
    xor-int/2addr v1, v6

    .line 559
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    return-object v1

    .line 564
    :pswitch_14
    move-object/from16 v1, p1

    .line 565
    .line 566
    check-cast v1, Ljava/lang/String;

    .line 567
    .line 568
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    return-object v7

    .line 572
    :pswitch_15
    move-object/from16 v1, p1

    .line 573
    .line 574
    check-cast v1, Lwb/v;

    .line 575
    .line 576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    sget-object v2, Lwb/t;->a:Lwb/t;

    .line 580
    .line 581
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    if-eqz v2, :cond_15

    .line 586
    .line 587
    goto :goto_10

    .line 588
    :cond_15
    instance-of v2, v1, Lwb/u;

    .line 589
    .line 590
    if-nez v2, :cond_17

    .line 591
    .line 592
    instance-of v2, v1, Lwb/r;

    .line 593
    .line 594
    if-nez v2, :cond_17

    .line 595
    .line 596
    instance-of v1, v1, Lwb/s;

    .line 597
    .line 598
    if-eqz v1, :cond_16

    .line 599
    .line 600
    goto :goto_f

    .line 601
    :cond_16
    invoke-static {}, Lokio/a;->k()V

    .line 602
    .line 603
    .line 604
    goto :goto_11

    .line 605
    :cond_17
    :goto_f
    move v5, v6

    .line 606
    :goto_10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    :goto_11
    return-object v4

    .line 611
    :pswitch_16
    move-object/from16 v1, p1

    .line 612
    .line 613
    check-cast v1, Lwb/bp;

    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    return-object v7

    .line 619
    :pswitch_17
    move-object/from16 v1, p1

    .line 620
    .line 621
    check-cast v1, Ljava/lang/String;

    .line 622
    .line 623
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    return-object v7

    .line 627
    :pswitch_18
    move-object/from16 v1, p1

    .line 628
    .line 629
    check-cast v1, Ljava/lang/String;

    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    return-object v7

    .line 635
    :pswitch_19
    move-object/from16 v1, p1

    .line 636
    .line 637
    check-cast v1, Lr/h;

    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    sget-object v3, Lwb/p0;->k6:Ls0/d;

    .line 643
    .line 644
    invoke-static {v1, v4, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 645
    .line 646
    .line 647
    return-object v7

    .line 648
    :pswitch_1a
    move-object/from16 v1, p1

    .line 649
    .line 650
    check-cast v1, Ljava/lang/String;

    .line 651
    .line 652
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    return-object v7

    .line 656
    :pswitch_1b
    move-object/from16 v1, p1

    .line 657
    .line 658
    check-cast v1, Ljava/lang/String;

    .line 659
    .line 660
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    return-object v7

    .line 664
    :pswitch_1c
    move-object/from16 v1, p1

    .line 665
    .line 666
    check-cast v1, Ljava/lang/String;

    .line 667
    .line 668
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    return-object v7

    .line 672
    nop

    .line 673
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
