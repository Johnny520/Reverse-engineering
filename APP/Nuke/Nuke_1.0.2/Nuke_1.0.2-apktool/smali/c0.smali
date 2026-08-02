.class public final synthetic Lc0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc0;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 91

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lc0;->h:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, La83;->a:La83;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return-object v2

    .line 13
    :pswitch_0
    sget-object v0, Lpp1;->a:Lpp1;

    .line 14
    .line 15
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Lvu0;->i:Lvu0;

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-static {}, Lfd3;->b()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-object v2

    .line 35
    :pswitch_1
    sget-object v0, Lru;->a:Ltu2;

    .line 36
    .line 37
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_2
    const/16 v89, -0x1

    .line 41
    .line 42
    const v90, 0xffff

    .line 43
    .line 44
    .line 45
    const-wide/16 v1, 0x0

    .line 46
    .line 47
    const-wide/16 v3, 0x0

    .line 48
    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    const-wide/16 v7, 0x0

    .line 52
    .line 53
    const-wide/16 v9, 0x0

    .line 54
    .line 55
    const-wide/16 v11, 0x0

    .line 56
    .line 57
    const-wide/16 v13, 0x0

    .line 58
    .line 59
    const-wide/16 v15, 0x0

    .line 60
    .line 61
    const-wide/16 v17, 0x0

    .line 62
    .line 63
    const-wide/16 v19, 0x0

    .line 64
    .line 65
    const-wide/16 v21, 0x0

    .line 66
    .line 67
    const-wide/16 v23, 0x0

    .line 68
    .line 69
    const-wide/16 v25, 0x0

    .line 70
    .line 71
    const-wide/16 v27, 0x0

    .line 72
    .line 73
    const-wide/16 v29, 0x0

    .line 74
    .line 75
    const-wide/16 v31, 0x0

    .line 76
    .line 77
    const-wide/16 v33, 0x0

    .line 78
    .line 79
    const-wide/16 v35, 0x0

    .line 80
    .line 81
    const-wide/16 v37, 0x0

    .line 82
    .line 83
    const-wide/16 v39, 0x0

    .line 84
    .line 85
    const-wide/16 v41, 0x0

    .line 86
    .line 87
    const-wide/16 v43, 0x0

    .line 88
    .line 89
    const-wide/16 v45, 0x0

    .line 90
    .line 91
    const-wide/16 v47, 0x0

    .line 92
    .line 93
    const-wide/16 v49, 0x0

    .line 94
    .line 95
    const-wide/16 v51, 0x0

    .line 96
    .line 97
    const-wide/16 v53, 0x0

    .line 98
    .line 99
    const-wide/16 v55, 0x0

    .line 100
    .line 101
    const-wide/16 v57, 0x0

    .line 102
    .line 103
    const-wide/16 v59, 0x0

    .line 104
    .line 105
    const-wide/16 v61, 0x0

    .line 106
    .line 107
    const-wide/16 v63, 0x0

    .line 108
    .line 109
    const-wide/16 v65, 0x0

    .line 110
    .line 111
    const-wide/16 v67, 0x0

    .line 112
    .line 113
    const-wide/16 v69, 0x0

    .line 114
    .line 115
    const-wide/16 v71, 0x0

    .line 116
    .line 117
    const-wide/16 v73, 0x0

    .line 118
    .line 119
    const-wide/16 v75, 0x0

    .line 120
    .line 121
    const-wide/16 v77, 0x0

    .line 122
    .line 123
    const-wide/16 v79, 0x0

    .line 124
    .line 125
    const-wide/16 v81, 0x0

    .line 126
    .line 127
    const-wide/16 v83, 0x0

    .line 128
    .line 129
    const-wide/16 v85, 0x0

    .line 130
    .line 131
    const-wide/16 v87, 0x0

    .line 132
    .line 133
    invoke-static/range {v1 .. v90}, Lru;->c(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJII)Lpu;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :pswitch_3
    sget-object v0, Llu;->g:Lmp1;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_4
    sget-object v0, Lhs;->b:Lhs;

    .line 142
    .line 143
    invoke-virtual {v0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_5
    sget-object v0, Lfs;->b:Lfs;

    .line 149
    .line 150
    invoke-virtual {v0}, Lv70;->d()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0

    .line 155
    :pswitch_6
    sget-object v0, Lis;->b:Lis;

    .line 156
    .line 157
    invoke-virtual {v0}, Lv70;->e()Ljava/lang/reflect/Method;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :pswitch_7
    invoke-static {}, Lir;->values()[Lir;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v1, Lzf0;

    .line 170
    .line 171
    const-string v2, "nuke.module.wechat.item.chat.ChatAutoReply.ReplyType"

    .line 172
    .line 173
    invoke-direct {v1, v2, v0}, Lzf0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 174
    .line 175
    .line 176
    return-object v1

    .line 177
    :pswitch_8
    invoke-static {}, Lgr;->values()[Lgr;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    new-instance v1, Lzf0;

    .line 185
    .line 186
    const-string v2, "nuke.module.wechat.item.chat.ChatAutoReply.MatchMode"

    .line 187
    .line 188
    invoke-direct {v1, v2, v0}, Lzf0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 189
    .line 190
    .line 191
    return-object v1

    .line 192
    :pswitch_9
    invoke-static {}, Ler;->values()[Ler;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance v1, Lzf0;

    .line 200
    .line 201
    const-string v2, "nuke.module.wechat.item.chat.ChatAutoReply.ListMode"

    .line 202
    .line 203
    invoke-direct {v1, v2, v0}, Lzf0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 204
    .line 205
    .line 206
    return-object v1

    .line 207
    :pswitch_a
    new-instance v0, Lcg;

    .line 208
    .line 209
    sget-object v1, Lxq;->a:Lxq;

    .line 210
    .line 211
    invoke-direct {v0, v1}, Lcg;-><init>(Lw41;)V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_b
    sget-object v0, Lir;->Companion:Lhr;

    .line 216
    .line 217
    invoke-virtual {v0}, Lhr;->serializer()Lw41;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :pswitch_c
    new-instance v0, Lcg;

    .line 223
    .line 224
    sget-object v1, Lnv2;->a:Lnv2;

    .line 225
    .line 226
    invoke-direct {v0}, Lcg;-><init>()V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_d
    sget-object v0, Ler;->Companion:Ldr;

    .line 231
    .line 232
    invoke-virtual {v0}, Ldr;->serializer()Lw41;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    return-object v0

    .line 237
    :pswitch_e
    new-instance v0, Lcg;

    .line 238
    .line 239
    sget-object v1, Lnv2;->a:Lnv2;

    .line 240
    .line 241
    invoke-direct {v0, v1}, Lcg;-><init>(Lw41;)V

    .line 242
    .line 243
    .line 244
    return-object v0

    .line 245
    :pswitch_f
    sget-object v0, Lgr;->Companion:Lfr;

    .line 246
    .line 247
    invoke-virtual {v0}, Lfr;->serializer()Lw41;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    :pswitch_10
    sget-object v0, Llk;->a:Ltu2;

    .line 253
    .line 254
    return-object v3

    .line 255
    :pswitch_11
    new-instance v0, Lft2;

    .line 256
    .line 257
    const v1, 0x4dffeb3b    # 5.3670077E8f

    .line 258
    .line 259
    .line 260
    invoke-static {v1}, Lsp0;->b(I)J

    .line 261
    .line 262
    .line 263
    move-result-wide v1

    .line 264
    invoke-direct {v0, v1, v2}, Lft2;-><init>(J)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_12
    new-instance v0, Lcg;

    .line 269
    .line 270
    sget-object v1, Lnv2;->a:Lnv2;

    .line 271
    .line 272
    invoke-direct {v0}, Lcg;-><init>()V

    .line 273
    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_13
    new-instance v0, Lcg;

    .line 277
    .line 278
    sget-object v1, Lnv2;->a:Lnv2;

    .line 279
    .line 280
    invoke-direct {v0}, Lcg;-><init>()V

    .line 281
    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_14
    sget-object v0, Ljn1;->d:Ljn1;

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    sget-object v0, Ljn1;->f:Lhx2;

    .line 290
    .line 291
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v0, Ljava/lang/Class;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    sget-object v2, Lii;->d:Lii;

    .line 305
    .line 306
    new-instance v4, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 309
    .line 310
    .line 311
    array-length v5, v0

    .line 312
    move v6, v1

    .line 313
    :goto_1
    if-ge v6, v5, :cond_4

    .line 314
    .line 315
    aget-object v7, v0, v6

    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    sget-object v9, Lii;->m:Ljava/util/Set;

    .line 325
    .line 326
    array-length v10, v8

    .line 327
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    invoke-interface {v9, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    if-nez v9, :cond_1

    .line 336
    .line 337
    goto :goto_2

    .line 338
    :cond_1
    array-length v9, v8

    .line 339
    const/4 v10, 0x6

    .line 340
    if-ge v9, v10, :cond_2

    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_2
    aget-object v9, v8, v1

    .line 344
    .line 345
    const-class v10, Ljava/lang/String;

    .line 346
    .line 347
    invoke-static {v9, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v9

    .line 351
    if-eqz v9, :cond_3

    .line 352
    .line 353
    const/4 v9, 0x1

    .line 354
    aget-object v9, v8, v9

    .line 355
    .line 356
    invoke-static {v9, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-eqz v9, :cond_3

    .line 361
    .line 362
    const/4 v9, 0x2

    .line 363
    aget-object v9, v8, v9

    .line 364
    .line 365
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 366
    .line 367
    invoke-static {v9, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v9

    .line 371
    if-eqz v9, :cond_3

    .line 372
    .line 373
    const/4 v9, 0x3

    .line 374
    aget-object v9, v8, v9

    .line 375
    .line 376
    invoke-static {v9, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v9

    .line 380
    if-eqz v9, :cond_3

    .line 381
    .line 382
    const/4 v9, 0x4

    .line 383
    aget-object v9, v8, v9

    .line 384
    .line 385
    invoke-static {v9, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    if-eqz v9, :cond_3

    .line 390
    .line 391
    const/4 v9, 0x5

    .line 392
    aget-object v8, v8, v9

    .line 393
    .line 394
    invoke-static {v8, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-eqz v8, :cond_3

    .line 399
    .line 400
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    :cond_3
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 404
    .line 405
    goto :goto_1

    .line 406
    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-nez v1, :cond_5

    .line 415
    .line 416
    move-object v1, v3

    .line 417
    goto :goto_3

    .line 418
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-nez v2, :cond_6

    .line 427
    .line 428
    goto :goto_3

    .line 429
    :cond_6
    move-object v2, v1

    .line 430
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 431
    .line 432
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    move-object v5, v4

    .line 441
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 442
    .line 443
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    if-ge v2, v5, :cond_8

    .line 448
    .line 449
    move-object v1, v4

    .line 450
    move v2, v5

    .line 451
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-nez v4, :cond_7

    .line 456
    .line 457
    :goto_3
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 458
    .line 459
    if-eqz v1, :cond_9

    .line 460
    .line 461
    invoke-static {v1}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 462
    .line 463
    .line 464
    move-object v3, v1

    .line 465
    goto :goto_4

    .line 466
    :cond_9
    const-string v0, "No supported NetSceneTenpayRemittanceConfirm constructor found"

    .line 467
    .line 468
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    :goto_4
    return-object v3

    .line 472
    :pswitch_15
    new-instance v0, Lcg;

    .line 473
    .line 474
    sget-object v1, Lnv2;->a:Lnv2;

    .line 475
    .line 476
    invoke-direct {v0}, Lcg;-><init>()V

    .line 477
    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_16
    new-instance v0, Lcg;

    .line 481
    .line 482
    sget-object v1, Lnv2;->a:Lnv2;

    .line 483
    .line 484
    invoke-direct {v0}, Lcg;-><init>()V

    .line 485
    .line 486
    .line 487
    return-object v0

    .line 488
    :pswitch_17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 489
    .line 490
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    return-object v0

    .line 495
    :pswitch_18
    new-instance v0, Lkx1;

    .line 496
    .line 497
    invoke-direct {v0, v1}, Lkx1;-><init>(I)V

    .line 498
    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_19
    const-string v0, "com.tencent.mm.protocal.protobuf.TimeLineObject"

    .line 502
    .line 503
    invoke-static {v0}, Lup0;->H(Ljava/lang/String;)Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    return-object v0

    .line 508
    :pswitch_1a
    invoke-static {}, Lc1;->values()[Lc1;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    new-instance v1, Lzf0;

    .line 516
    .line 517
    const-string v2, "nuke.module.wechat.ai.AIChatListMode"

    .line 518
    .line 519
    invoke-direct {v1, v2, v0}, Lzf0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 520
    .line 521
    .line 522
    return-object v1

    .line 523
    :pswitch_1b
    invoke-static {}, Lnuke/module/wechat/ai/AIChatConfig;->a()Lw41;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    return-object v0

    .line 528
    :pswitch_1c
    invoke-static {}, Lnuke/module/wechat/ai/AIChatConfig;->b()Lw41;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    return-object v0

    .line 533
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
