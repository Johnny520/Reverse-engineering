.class public final synthetic Lyb3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyb3;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lyb3;->h:I

    .line 4
    .line 5
    const-string v1, "MicroMsg.SceneVoiceService"

    .line 6
    .line 7
    const-string v2, "quanPin"

    .line 8
    .line 9
    const-string v3, "pyInitial"

    .line 10
    .line 11
    const-string v4, "alias"

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const-string v9, "avatarUrl"

    .line 18
    .line 19
    const-string v10, "nickname"

    .line 20
    .line 21
    const-string v11, "username"

    .line 22
    .line 23
    const/4 v12, 0x2

    .line 24
    const/4 v13, 0x0

    .line 25
    packed-switch v0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    check-cast v0, Ldj0;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string v1, "com.tencent.mm.sdk.platformtools"

    .line 36
    .line 37
    filled-new-array {v1}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, v0, Ldj0;->t:Ljava/util/List;

    .line 46
    .line 47
    new-instance v1, Lyg1;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v2, "MicroMsg.SDK.XmlParser"

    .line 53
    .line 54
    const-string v3, "[ %s ]"

    .line 55
    .line 56
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Lyg1;->j0([Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget-object v2, La83;->a:La83;

    .line 64
    .line 65
    iput-object v1, v0, Ldj0;->u:Lyg1;

    .line 66
    .line 67
    return-object v2

    .line 68
    :pswitch_0
    move-object/from16 v0, p1

    .line 69
    .line 70
    check-cast v0, Lnf3;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_1
    move-object/from16 v0, p1

    .line 77
    .line 78
    check-cast v0, Ljg3;

    .line 79
    .line 80
    sget-object v1, La83;->a:La83;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v2, v0, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 86
    .line 87
    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    instance-of v3, v2, Ljava/util/Map;

    .line 92
    .line 93
    if-eqz v3, :cond_1

    .line 94
    .line 95
    instance-of v3, v2, Lq41;

    .line 96
    .line 97
    if-eqz v3, :cond_0

    .line 98
    .line 99
    instance-of v3, v2, Ls41;

    .line 100
    .line 101
    if-eqz v3, :cond_1

    .line 102
    .line 103
    :cond_0
    move-object v8, v2

    .line 104
    check-cast v8, Ljava/util/Map;

    .line 105
    .line 106
    :cond_1
    if-nez v8, :cond_2

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    sget-object v2, Lnd3;->e:Lnd3;

    .line 110
    .line 111
    new-instance v3, Lmd3;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljg3;->a()[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v8}, Lxe1;->e(Ljava/lang/Object;)Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-direct {v3, v0, v4}, Lmd3;-><init>(Ljava/util/List;Ljava/util/Map;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ltb1;->j(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :goto_0
    return-object v1

    .line 132
    :pswitch_2
    move-object/from16 v0, p1

    .line 133
    .line 134
    check-cast v0, Ljg3;

    .line 135
    .line 136
    sget-object v1, La83;->a:La83;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljg3;->a()[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    aget-object v0, v0, v13

    .line 146
    .line 147
    if-nez v0, :cond_3

    .line 148
    .line 149
    goto/16 :goto_2

    .line 150
    .line 151
    :cond_3
    sget-object v2, Lid3;->e:Lid3;

    .line 152
    .line 153
    new-instance v3, Lhd3;

    .line 154
    .line 155
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, Lzf1;->b()V

    .line 164
    .line 165
    .line 166
    const-string v5, "field_isSend"

    .line 167
    .line 168
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Lpi0;

    .line 179
    .line 180
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    check-cast v4, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v4}, Lzf1;->b()V

    .line 202
    .line 203
    .line 204
    const-string v5, "field_status"

    .line 205
    .line 206
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Lpi0;

    .line 217
    .line 218
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    check-cast v4, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v16

    .line 231
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v4}, Lzf1;->b()V

    .line 240
    .line 241
    .line 242
    const-string v5, "field_talker"

    .line 243
    .line 244
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    check-cast v4, Lpi0;

    .line 255
    .line 256
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    move-object/from16 v17, v4

    .line 264
    .line 265
    check-cast v17, Ljava/lang/String;

    .line 266
    .line 267
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-virtual {v4}, Lzf1;->b()V

    .line 276
    .line 277
    .line 278
    const-string v5, "field_lvbuffer"

    .line 279
    .line 280
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    check-cast v4, Lpi0;

    .line 291
    .line 292
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    move-object/from16 v18, v4

    .line 297
    .line 298
    check-cast v18, [B

    .line 299
    .line 300
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-virtual {v4}, Lzf1;->b()V

    .line 309
    .line 310
    .line 311
    const-string v5, "field_type"

    .line 312
    .line 313
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 314
    .line 315
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    check-cast v4, Lpi0;

    .line 324
    .line 325
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    check-cast v4, Ljava/lang/Integer;

    .line 333
    .line 334
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v19

    .line 338
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-virtual {v4}, Lzf1;->b()V

    .line 347
    .line 348
    .line 349
    const-string v5, "field_msgId"

    .line 350
    .line 351
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    check-cast v4, Lpi0;

    .line 362
    .line 363
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    check-cast v4, Ljava/lang/Long;

    .line 371
    .line 372
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 373
    .line 374
    .line 375
    move-result-wide v20

    .line 376
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-virtual {v4}, Lzf1;->b()V

    .line 385
    .line 386
    .line 387
    const-string v5, "field_bizChatId"

    .line 388
    .line 389
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 390
    .line 391
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    check-cast v4, Lpi0;

    .line 400
    .line 401
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    check-cast v4, Ljava/lang/Long;

    .line 409
    .line 410
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 411
    .line 412
    .line 413
    move-result-wide v22

    .line 414
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-virtual {v4}, Lzf1;->b()V

    .line 423
    .line 424
    .line 425
    const-string v5, "field_content"

    .line 426
    .line 427
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 428
    .line 429
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    check-cast v4, Lpi0;

    .line 438
    .line 439
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    move-object/from16 v24, v4

    .line 447
    .line 448
    check-cast v24, Ljava/lang/String;

    .line 449
    .line 450
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    invoke-virtual {v4}, Lzf1;->b()V

    .line 459
    .line 460
    .line 461
    const-string v5, "field_createTime"

    .line 462
    .line 463
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 464
    .line 465
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    check-cast v4, Lpi0;

    .line 474
    .line 475
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    check-cast v4, Ljava/lang/Long;

    .line 483
    .line 484
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 485
    .line 486
    .line 487
    move-result-wide v25

    .line 488
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    invoke-virtual {v4}, Ln4;->r()Lhi0;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    invoke-virtual {v4}, Lzf1;->b()V

    .line 497
    .line 498
    .line 499
    const-string v5, "field_msgSvrId"

    .line 500
    .line 501
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 502
    .line 503
    invoke-virtual {v4}, Lhi0;->c()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    check-cast v4, Lpi0;

    .line 512
    .line 513
    invoke-virtual {v4}, Lpi0;->g0()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Ljava/lang/Long;

    .line 518
    .line 519
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    invoke-virtual {v5}, Ln4;->r()Lhi0;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    invoke-virtual {v5}, Lzf1;->b()V

    .line 528
    .line 529
    .line 530
    const-string v8, "field_flag"

    .line 531
    .line 532
    iput-object v8, v5, Lzf1;->b:Ljava/lang/String;

    .line 533
    .line 534
    invoke-virtual {v5}, Lhi0;->c()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-static {v5}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    check-cast v5, Lpi0;

    .line 543
    .line 544
    invoke-virtual {v5}, Lpi0;->g0()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v5

    .line 548
    check-cast v5, Ljava/lang/Integer;

    .line 549
    .line 550
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 551
    .line 552
    .line 553
    move-result-object v8

    .line 554
    invoke-virtual {v8}, Ln4;->r()Lhi0;

    .line 555
    .line 556
    .line 557
    move-result-object v8

    .line 558
    invoke-virtual {v8}, Lzf1;->b()V

    .line 559
    .line 560
    .line 561
    const-string v9, "field_msgSeq"

    .line 562
    .line 563
    iput-object v9, v8, Lzf1;->b:Ljava/lang/String;

    .line 564
    .line 565
    invoke-virtual {v8}, Lhi0;->c()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v8

    .line 569
    invoke-static {v8}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    check-cast v8, Lpi0;

    .line 574
    .line 575
    invoke-virtual {v8}, Lpi0;->g0()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v8

    .line 579
    check-cast v8, Ljava/lang/Long;

    .line 580
    .line 581
    new-instance v14, Lyi1;

    .line 582
    .line 583
    if-eqz v4, :cond_4

    .line 584
    .line 585
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 586
    .line 587
    .line 588
    move-result-wide v9

    .line 589
    move-wide/from16 v27, v9

    .line 590
    .line 591
    goto :goto_1

    .line 592
    :cond_4
    move-wide/from16 v27, v6

    .line 593
    .line 594
    :goto_1
    if-eqz v5, :cond_5

    .line 595
    .line 596
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 597
    .line 598
    .line 599
    move-result v13

    .line 600
    :cond_5
    move/from16 v29, v13

    .line 601
    .line 602
    if-eqz v8, :cond_6

    .line 603
    .line 604
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 605
    .line 606
    .line 607
    move-result-wide v6

    .line 608
    :cond_6
    move-wide/from16 v30, v6

    .line 609
    .line 610
    const/16 v32, 0x1000

    .line 611
    .line 612
    invoke-direct/range {v14 .. v32}, Lyi1;-><init>(IILjava/lang/String;[BIJJLjava/lang/String;JJIJI)V

    .line 613
    .line 614
    .line 615
    invoke-direct {v3, v14, v0}, Lhd3;-><init>(Lyi1;Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v3}, Ltb1;->j(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    :goto_2
    return-object v1

    .line 622
    :pswitch_3
    move-object/from16 v0, p1

    .line 623
    .line 624
    check-cast v0, Ljava/util/List;

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    if-ne v1, v12, :cond_7

    .line 634
    .line 635
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    const-class v2, Landroid/content/ContentValues;

    .line 640
    .line 641
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    if-eqz v1, :cond_7

    .line 646
    .line 647
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 652
    .line 653
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-eqz v0, :cond_7

    .line 658
    .line 659
    goto :goto_3

    .line 660
    :cond_7
    move v5, v13

    .line 661
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    return-object v0

    .line 666
    :pswitch_4
    move-object/from16 v0, p1

    .line 667
    .line 668
    check-cast v0, Landroid/database/Cursor;

    .line 669
    .line 670
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    new-instance v1, Lqs1;

    .line 674
    .line 675
    invoke-static {v0, v11}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    invoke-static {v0, v4}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    invoke-static {v0, v10}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    invoke-static {v0, v9}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-direct {v1, v2, v3, v4, v0}, Lqs1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    return-object v1

    .line 695
    :pswitch_5
    move-object/from16 v0, p1

    .line 696
    .line 697
    check-cast v0, Landroid/database/Cursor;

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    new-instance v12, Lmz;

    .line 703
    .line 704
    invoke-static {v0, v11}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v13

    .line 708
    invoke-static {v0, v10}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v14

    .line 712
    invoke-static {v0, v4}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v15

    .line 716
    const-string v1, "conRemark"

    .line 717
    .line 718
    invoke-static {v0, v1}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v16

    .line 722
    invoke-static {v0, v3}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v17

    .line 726
    invoke-static {v0, v2}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v18

    .line 730
    invoke-static {v0, v9}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v19

    .line 734
    const-string v1, "encryptUsername"

    .line 735
    .line 736
    invoke-static {v0, v1}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v20

    .line 740
    const-string v1, "type"

    .line 741
    .line 742
    invoke-static {v0, v1}, Lp40;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 743
    .line 744
    .line 745
    move-result v21

    .line 746
    invoke-direct/range {v12 .. v21}, Lmz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 747
    .line 748
    .line 749
    return-object v12

    .line 750
    :pswitch_6
    move-object/from16 v0, p1

    .line 751
    .line 752
    check-cast v0, Ljava/lang/Class;

    .line 753
    .line 754
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    const-string v1, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 762
    .line 763
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    return-object v0

    .line 772
    :pswitch_7
    move-object/from16 v0, p1

    .line 773
    .line 774
    check-cast v0, Landroid/database/Cursor;

    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    new-instance v12, Lcr0;

    .line 780
    .line 781
    invoke-static {v0, v11}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v13

    .line 785
    invoke-static {v0, v10}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v14

    .line 789
    invoke-static {v0, v3}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v15

    .line 793
    invoke-static {v0, v2}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v16

    .line 797
    invoke-static {v0, v9}, Lp40;->V(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v17

    .line 801
    invoke-direct/range {v12 .. v17}, Lcr0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    return-object v12

    .line 805
    :pswitch_8
    move-object/from16 v0, p1

    .line 806
    .line 807
    check-cast v0, Ljava/lang/Class;

    .line 808
    .line 809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    const-class v1, Landroid/database/Cursor;

    .line 813
    .line 814
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    invoke-static {v2}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    if-nez v2, :cond_8

    .line 823
    .line 824
    goto :goto_4

    .line 825
    :cond_8
    move-object v1, v2

    .line 826
    :goto_4
    sget-object v2, Ldt;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 827
    .line 828
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 829
    .line 830
    .line 831
    move-result v0

    .line 832
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    return-object v0

    .line 837
    :pswitch_9
    move-object/from16 v0, p1

    .line 838
    .line 839
    check-cast v0, Ljava/util/List;

    .line 840
    .line 841
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 845
    .line 846
    .line 847
    move-result v1

    .line 848
    if-ne v1, v12, :cond_c

    .line 849
    .line 850
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    const-class v2, Ljava/lang/String;

    .line 855
    .line 856
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    invoke-static {v3}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    move-result-object v3

    .line 864
    if-nez v3, :cond_9

    .line 865
    .line 866
    move-object v3, v2

    .line 867
    :cond_9
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v1

    .line 871
    if-eqz v1, :cond_c

    .line 872
    .line 873
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    check-cast v1, Ljava/lang/Class;

    .line 878
    .line 879
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 880
    .line 881
    .line 882
    move-result v1

    .line 883
    if-eqz v1, :cond_c

    .line 884
    .line 885
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    check-cast v0, Ljava/lang/Class;

    .line 890
    .line 891
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    if-eqz v0, :cond_c

    .line 896
    .line 897
    const-class v1, Ljava/lang/Object;

    .line 898
    .line 899
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 900
    .line 901
    .line 902
    move-result-object v3

    .line 903
    invoke-static {v3}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    if-nez v3, :cond_a

    .line 908
    .line 909
    goto :goto_5

    .line 910
    :cond_a
    move-object v1, v3

    .line 911
    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    if-nez v1, :cond_d

    .line 916
    .line 917
    invoke-static {v2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    invoke-static {v1}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    if-nez v1, :cond_b

    .line 926
    .line 927
    goto :goto_6

    .line 928
    :cond_b
    move-object v2, v1

    .line 929
    :goto_6
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result v0

    .line 933
    if-eqz v0, :cond_c

    .line 934
    .line 935
    goto :goto_7

    .line 936
    :cond_c
    move v5, v13

    .line 937
    :cond_d
    :goto_7
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    return-object v0

    .line 942
    :pswitch_a
    move-object/from16 v0, p1

    .line 943
    .line 944
    check-cast v0, Lhd3;

    .line 945
    .line 946
    sget-object v1, La83;->a:La83;

    .line 947
    .line 948
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    sget-object v2, Lvc3;->f:Lvu2;

    .line 952
    .line 953
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    iget-object v3, v0, Lhd3;->a:Lyi1;

    .line 957
    .line 958
    invoke-static {v3}, Lte;->l0(Lyi1;)Lby0;

    .line 959
    .line 960
    .line 961
    move-result-object v4

    .line 962
    if-nez v4, :cond_f

    .line 963
    .line 964
    :cond_e
    :goto_8
    move-object v3, v8

    .line 965
    goto/16 :goto_11

    .line 966
    .line 967
    :cond_f
    iget-object v5, v4, Lby0;->a:Ljava/lang/String;

    .line 968
    .line 969
    iget-object v9, v2, Lvu2;->a:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v9, Lxm0;

    .line 972
    .line 973
    invoke-interface {v9}, Lxm0;->a()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v9

    .line 977
    check-cast v9, Lid2;

    .line 978
    .line 979
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    iget-object v10, v9, Lid2;->a:Ljava/lang/String;

    .line 983
    .line 984
    invoke-static {v10}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 985
    .line 986
    .line 987
    move-result v11

    .line 988
    if-eqz v11, :cond_10

    .line 989
    .line 990
    goto :goto_8

    .line 991
    :cond_10
    const-string v11, "@chatroom"

    .line 992
    .line 993
    invoke-static {v5, v11, v13}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 994
    .line 995
    .line 996
    move-result v11

    .line 997
    if-eqz v11, :cond_11

    .line 998
    .line 999
    iget-object v5, v4, Lby0;->c:Ljava/lang/String;

    .line 1000
    .line 1001
    :cond_11
    if-eqz v5, :cond_e

    .line 1002
    .line 1003
    invoke-static {v5}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v12

    .line 1007
    if-eqz v12, :cond_12

    .line 1008
    .line 1009
    goto :goto_8

    .line 1010
    :cond_12
    iget-object v12, v2, Lvu2;->b:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v12, Lxm0;

    .line 1013
    .line 1014
    invoke-interface {v12}, Lxm0;->a()Ljava/lang/Object;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v12

    .line 1018
    check-cast v12, Ljava/lang/Number;

    .line 1019
    .line 1020
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v16

    .line 1024
    new-instance v18, Lyf2;

    .line 1025
    .line 1026
    iget-object v12, v9, Lid2;->a:Ljava/lang/String;

    .line 1027
    .line 1028
    iget-object v13, v4, Lby0;->a:Ljava/lang/String;

    .line 1029
    .line 1030
    if-eqz v11, :cond_13

    .line 1031
    .line 1032
    const-string v11, "group"

    .line 1033
    .line 1034
    :goto_9
    move-object/from16 v22, v11

    .line 1035
    .line 1036
    goto :goto_a

    .line 1037
    :cond_13
    const-string v11, "private"

    .line 1038
    .line 1039
    goto :goto_9

    .line 1040
    :goto_a
    const-string v19, "wechat"

    .line 1041
    .line 1042
    const/16 v23, 0x0

    .line 1043
    .line 1044
    move-object/from16 v20, v12

    .line 1045
    .line 1046
    move-object/from16 v21, v13

    .line 1047
    .line 1048
    invoke-direct/range {v18 .. v23}, Lyf2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    iget-wide v11, v3, Lyi1;->j:J

    .line 1052
    .line 1053
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v13

    .line 1057
    cmp-long v11, v11, v6

    .line 1058
    .line 1059
    if-eqz v11, :cond_14

    .line 1060
    .line 1061
    goto :goto_b

    .line 1062
    :cond_14
    move-object v13, v8

    .line 1063
    :goto_b
    if-eqz v13, :cond_16

    .line 1064
    .line 1065
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1066
    .line 1067
    .line 1068
    move-result-wide v11

    .line 1069
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v11

    .line 1073
    if-nez v11, :cond_15

    .line 1074
    .line 1075
    goto :goto_d

    .line 1076
    :cond_15
    :goto_c
    move-object/from16 v20, v11

    .line 1077
    .line 1078
    goto :goto_f

    .line 1079
    :cond_16
    :goto_d
    iget-wide v11, v3, Lyi1;->f:J

    .line 1080
    .line 1081
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v13

    .line 1085
    cmp-long v11, v11, v6

    .line 1086
    .line 1087
    if-eqz v11, :cond_17

    .line 1088
    .line 1089
    goto :goto_e

    .line 1090
    :cond_17
    move-object v13, v8

    .line 1091
    :goto_e
    if-eqz v13, :cond_18

    .line 1092
    .line 1093
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1094
    .line 1095
    .line 1096
    move-result-wide v11

    .line 1097
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v11

    .line 1101
    goto :goto_c

    .line 1102
    :cond_18
    move-object/from16 v20, v8

    .line 1103
    .line 1104
    :goto_f
    iget-wide v11, v3, Lyi1;->i:J

    .line 1105
    .line 1106
    cmp-long v3, v11, v6

    .line 1107
    .line 1108
    if-gtz v3, :cond_19

    .line 1109
    .line 1110
    move-wide/from16 v21, v16

    .line 1111
    .line 1112
    goto :goto_10

    .line 1113
    :cond_19
    const-wide v6, 0x2540be400L

    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    cmp-long v3, v11, v6

    .line 1119
    .line 1120
    if-gez v3, :cond_1a

    .line 1121
    .line 1122
    const-wide/16 v6, 0x3e8

    .line 1123
    .line 1124
    mul-long/2addr v11, v6

    .line 1125
    :cond_1a
    move-wide/from16 v21, v11

    .line 1126
    .line 1127
    :goto_10
    iget-object v3, v4, Lby0;->b:Ljava/lang/String;

    .line 1128
    .line 1129
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 1130
    .line 1131
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1132
    .line 1133
    .line 1134
    iget-object v7, v4, Lby0;->b:Ljava/lang/String;

    .line 1135
    .line 1136
    invoke-static {v7}, Ll31;->c(Ljava/lang/String;)Li41;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v7

    .line 1140
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    const-string v11, "text"

    .line 1144
    .line 1145
    invoke-interface {v6, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v7

    .line 1149
    check-cast v7, Lj31;

    .line 1150
    .line 1151
    new-instance v7, Ld41;

    .line 1152
    .line 1153
    invoke-direct {v7, v6}, Ld41;-><init>(Ljava/util/Map;)V

    .line 1154
    .line 1155
    .line 1156
    new-instance v6, Lei2;

    .line 1157
    .line 1158
    invoke-direct {v6, v7}, Lei2;-><init>(Ld41;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-static {v6}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v24

    .line 1165
    new-instance v19, Lti2;

    .line 1166
    .line 1167
    move-object/from16 v23, v3

    .line 1168
    .line 1169
    invoke-direct/range {v19 .. v24}, Lti2;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V

    .line 1170
    .line 1171
    .line 1172
    new-instance v3, Ll5;

    .line 1173
    .line 1174
    new-instance v14, Lci2;

    .line 1175
    .line 1176
    iget-object v2, v2, Lvu2;->c:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v2, Lxm0;

    .line 1179
    .line 1180
    invoke-interface {v2}, Lxm0;->a()Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v2

    .line 1184
    move-object v15, v2

    .line 1185
    check-cast v15, Ljava/lang/String;

    .line 1186
    .line 1187
    new-instance v2, Lcl2;

    .line 1188
    .line 1189
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v6

    .line 1193
    invoke-direct {v2, v5, v6}, Lcl2;-><init>(Ljava/lang/String;Z)V

    .line 1194
    .line 1195
    .line 1196
    iget-object v0, v0, Lhd3;->b:Ljava/lang/Object;

    .line 1197
    .line 1198
    move-object/from16 v22, v0

    .line 1199
    .line 1200
    move-object/from16 v20, v2

    .line 1201
    .line 1202
    move-object/from16 v21, v19

    .line 1203
    .line 1204
    move-object/from16 v19, v18

    .line 1205
    .line 1206
    move-object/from16 v18, v9

    .line 1207
    .line 1208
    invoke-direct/range {v14 .. v22}, Lci2;-><init>(Ljava/lang/String;JLid2;Lyf2;Lcl2;Lti2;Ljava/lang/Object;)V

    .line 1209
    .line 1210
    .line 1211
    iget-object v0, v4, Lby0;->d:Ljava/lang/String;

    .line 1212
    .line 1213
    invoke-direct {v3, v14, v0}, Ll5;-><init>(Lci2;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    :goto_11
    if-nez v3, :cond_1b

    .line 1217
    .line 1218
    goto :goto_13

    .line 1219
    :cond_1b
    sget-object v0, Lvc3;->g:Lz52;

    .line 1220
    .line 1221
    iget-object v2, v3, Ll5;->b:Ljava/lang/String;

    .line 1222
    .line 1223
    invoke-virtual {v0, v2}, Lz52;->a(Ljava/lang/String;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    if-nez v0, :cond_1c

    .line 1228
    .line 1229
    goto :goto_13

    .line 1230
    :cond_1c
    sget-object v0, Lsq1;->a:Lsq1;

    .line 1231
    .line 1232
    iget-object v0, v3, Ll5;->a:Lci2;

    .line 1233
    .line 1234
    sget-boolean v2, Lsq1;->f:Z

    .line 1235
    .line 1236
    if-nez v2, :cond_1d

    .line 1237
    .line 1238
    goto :goto_13

    .line 1239
    :cond_1d
    sget-object v2, Lpp1;->a:Lpp1;

    .line 1240
    .line 1241
    invoke-static {}, Lpp1;->f()Z

    .line 1242
    .line 1243
    .line 1244
    move-result v2

    .line 1245
    if-eqz v2, :cond_1e

    .line 1246
    .line 1247
    goto :goto_13

    .line 1248
    :cond_1e
    sget-object v2, Lsq1;->o:Ljn;

    .line 1249
    .line 1250
    if-eqz v2, :cond_23

    .line 1251
    .line 1252
    invoke-interface {v2, v0}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v2

    .line 1256
    instance-of v3, v2, Loq;

    .line 1257
    .line 1258
    if-eqz v3, :cond_22

    .line 1259
    .line 1260
    sget-object v9, Lsq1;->h:Lb5;

    .line 1261
    .line 1262
    if-eqz v9, :cond_21

    .line 1263
    .line 1264
    sget-object v10, Lph2;->j:Lph2;

    .line 1265
    .line 1266
    iget-object v0, v0, Lci2;->a:Ljava/lang/String;

    .line 1267
    .line 1268
    const-string v3, "Unable to queue host message event "

    .line 1269
    .line 1270
    const-string v4, "."

    .line 1271
    .line 1272
    invoke-static {v3, v0, v4}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v11

    .line 1276
    instance-of v0, v2, Lnq;

    .line 1277
    .line 1278
    if-eqz v0, :cond_1f

    .line 1279
    .line 1280
    check-cast v2, Lnq;

    .line 1281
    .line 1282
    goto :goto_12

    .line 1283
    :cond_1f
    move-object v2, v8

    .line 1284
    :goto_12
    if-eqz v2, :cond_20

    .line 1285
    .line 1286
    iget-object v8, v2, Lnq;->a:Ljava/lang/Throwable;

    .line 1287
    .line 1288
    :cond_20
    move-object v13, v8

    .line 1289
    const/16 v14, 0x18

    .line 1290
    .line 1291
    const/4 v12, 0x0

    .line 1292
    invoke-static/range {v9 .. v14}, Lb5;->x(Lb5;Lph2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 1293
    .line 1294
    .line 1295
    goto :goto_13

    .line 1296
    :cond_21
    const-string v0, "scriptLogger"

    .line 1297
    .line 1298
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    throw v8

    .line 1302
    :cond_22
    :goto_13
    return-object v1

    .line 1303
    :cond_23
    const-string v0, "messageQueue"

    .line 1304
    .line 1305
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    throw v8

    .line 1309
    :pswitch_b
    move-object/from16 v0, p1

    .line 1310
    .line 1311
    check-cast v0, Landroid/content/Context;

    .line 1312
    .line 1313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1314
    .line 1315
    .line 1316
    new-instance v1, Landroid/widget/ImageView;

    .line 1317
    .line 1318
    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1319
    .line 1320
    .line 1321
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1322
    .line 1323
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1324
    .line 1325
    .line 1326
    return-object v1

    .line 1327
    :pswitch_c
    move-object/from16 v0, p1

    .line 1328
    .line 1329
    check-cast v0, Lcj0;

    .line 1330
    .line 1331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1332
    .line 1333
    .line 1334
    new-instance v1, Lat;

    .line 1335
    .line 1336
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1337
    .line 1338
    .line 1339
    const-string v2, "MicroMsg.VoiceStorage"

    .line 1340
    .line 1341
    const-string v3, "update failed, no values"

    .line 1342
    .line 1343
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v2

    .line 1347
    invoke-virtual {v1, v2}, Lat;->d0([Ljava/lang/String;)V

    .line 1348
    .line 1349
    .line 1350
    sget-object v2, La83;->a:La83;

    .line 1351
    .line 1352
    iput-object v1, v0, Lcj0;->u:Lat;

    .line 1353
    .line 1354
    return-object v2

    .line 1355
    :pswitch_d
    move-object/from16 v0, p1

    .line 1356
    .line 1357
    check-cast v0, Ldj0;

    .line 1358
    .line 1359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1360
    .line 1361
    .line 1362
    new-instance v1, Lyb3;

    .line 1363
    .line 1364
    const/4 v2, 0x6

    .line 1365
    invoke-direct {v1, v2}, Lyb3;-><init>(I)V

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v0, v1}, Ldj0;->c0(Lin0;)V

    .line 1369
    .line 1370
    .line 1371
    sget-object v0, La83;->a:La83;

    .line 1372
    .line 1373
    return-object v0

    .line 1374
    :pswitch_e
    move-object/from16 v0, p1

    .line 1375
    .line 1376
    check-cast v0, Lyg1;

    .line 1377
    .line 1378
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1379
    .line 1380
    .line 1381
    const-string v2, "Start Recv[%s] :%s"

    .line 1382
    .line 1383
    const-string v3, "Start Send :"

    .line 1384
    .line 1385
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v1

    .line 1389
    invoke-virtual {v0, v1}, Lyg1;->h0([Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    sget-object v0, La83;->a:La83;

    .line 1393
    .line 1394
    return-object v0

    .line 1395
    :pswitch_f
    move-object/from16 v0, p1

    .line 1396
    .line 1397
    check-cast v0, Ldj0;

    .line 1398
    .line 1399
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1400
    .line 1401
    .line 1402
    new-instance v1, Lyb3;

    .line 1403
    .line 1404
    const/4 v2, 0x4

    .line 1405
    invoke-direct {v1, v2}, Lyb3;-><init>(I)V

    .line 1406
    .line 1407
    .line 1408
    invoke-virtual {v0, v1}, Ldj0;->c0(Lin0;)V

    .line 1409
    .line 1410
    .line 1411
    sget-object v0, La83;->a:La83;

    .line 1412
    .line 1413
    return-object v0

    .line 1414
    :pswitch_10
    move-object/from16 v0, p1

    .line 1415
    .line 1416
    check-cast v0, Lyg1;

    .line 1417
    .line 1418
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v0, v13}, Lyg1;->d0(I)V

    .line 1422
    .line 1423
    .line 1424
    const-string v2, "run() %s"

    .line 1425
    .line 1426
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v1

    .line 1430
    invoke-virtual {v0, v1}, Lyg1;->h0([Ljava/lang/String;)V

    .line 1431
    .line 1432
    .line 1433
    sget-object v0, La83;->a:La83;

    .line 1434
    .line 1435
    return-object v0

    .line 1436
    :pswitch_11
    move-object/from16 v0, p1

    .line 1437
    .line 1438
    check-cast v0, Ldj0;

    .line 1439
    .line 1440
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1441
    .line 1442
    .line 1443
    new-instance v1, Lyb3;

    .line 1444
    .line 1445
    invoke-direct {v1, v12}, Lyb3;-><init>(I)V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v0, v1}, Ldj0;->c0(Lin0;)V

    .line 1449
    .line 1450
    .line 1451
    sget-object v0, La83;->a:La83;

    .line 1452
    .line 1453
    return-object v0

    .line 1454
    :pswitch_12
    move-object/from16 v0, p1

    .line 1455
    .line 1456
    check-cast v0, Lyg1;

    .line 1457
    .line 1458
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1459
    .line 1460
    .line 1461
    const-string v1, "getAmrFullPath cost: "

    .line 1462
    .line 1463
    filled-new-array {v1}, [Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    invoke-virtual {v0, v1}, Lyg1;->h0([Ljava/lang/String;)V

    .line 1468
    .line 1469
    .line 1470
    sget-object v0, La83;->a:La83;

    .line 1471
    .line 1472
    return-object v0

    .line 1473
    :pswitch_13
    move-object/from16 v0, p1

    .line 1474
    .line 1475
    check-cast v0, Lcj0;

    .line 1476
    .line 1477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1478
    .line 1479
    .line 1480
    new-instance v1, Lyb3;

    .line 1481
    .line 1482
    invoke-direct {v1, v13}, Lyb3;-><init>(I)V

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual {v0, v1}, Lcj0;->c0(Lin0;)V

    .line 1486
    .line 1487
    .line 1488
    sget-object v0, La83;->a:La83;

    .line 1489
    .line 1490
    return-object v0

    .line 1491
    :pswitch_14
    move-object/from16 v0, p1

    .line 1492
    .line 1493
    check-cast v0, Lat;

    .line 1494
    .line 1495
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1496
    .line 1497
    .line 1498
    const-string v1, "MicroMsg.VoiceLogic"

    .line 1499
    .line 1500
    const-string v2, "startRecord insert voicestg success"

    .line 1501
    .line 1502
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    invoke-virtual {v0, v1}, Lat;->c0([Ljava/lang/String;)V

    .line 1507
    .line 1508
    .line 1509
    sget-object v0, La83;->a:La83;

    .line 1510
    .line 1511
    return-object v0

    .line 1512
    nop

    .line 1513
    :pswitch_data_0
    .packed-switch 0x0
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
