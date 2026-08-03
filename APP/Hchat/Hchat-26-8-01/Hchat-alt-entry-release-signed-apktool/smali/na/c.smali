.class public final synthetic Lna/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk8/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lna/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lna/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lk8/o;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lna/c;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lna/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lv8/q;

    .line 13
    .line 14
    iget-object v3, v2, Lv8/q;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 15
    .line 16
    iget-object v4, v1, Lk8/o;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-boolean v4, v1, Lk8/o;->i:Z

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    const-wide/16 v4, 0xfa

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    :goto_0
    :try_start_0
    new-instance v6, Lrb/g;

    .line 45
    .line 46
    const/4 v7, 0x5

    .line 47
    invoke-direct {v6, v2, v7, v1}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    invoke-virtual {v3, v6, v4, v5, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :catchall_0
    :goto_1
    return-void

    .line 56
    :pswitch_0
    iget-object v2, v0, Lna/c;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lo9/p;

    .line 59
    .line 60
    iget-object v3, v2, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 61
    .line 62
    const-string v4, "group_invite_detail_enable"

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    goto/16 :goto_12

    .line 72
    .line 73
    :cond_3
    invoke-virtual {v1}, Lk8/o;->s()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_25

    .line 78
    .line 79
    invoke-virtual {v1}, Lk8/o;->j()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_4

    .line 84
    .line 85
    goto/16 :goto_12

    .line 86
    .line 87
    :cond_4
    invoke-virtual {v1}, Lk8/o;->d()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    iget-object v3, v1, Lk8/o;->c:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v3, v3}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_6

    .line 119
    .line 120
    goto/16 :goto_12

    .line 121
    .line 122
    :cond_6
    invoke-virtual {v1}, Lk8/o;->a()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    iget-object v6, v1, Lk8/o;->f:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v7, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-nez v8, :cond_7

    .line 141
    .line 142
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    :cond_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-nez v8, :cond_9

    .line 153
    .line 154
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-lez v8, :cond_8

    .line 159
    .line 160
    const/16 v8, 0xa

    .line 161
    .line 162
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    :cond_9
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    const/4 v9, 0x0

    .line 177
    if-eqz v8, :cond_a

    .line 178
    .line 179
    goto/16 :goto_10

    .line 180
    .line 181
    :cond_a
    invoke-static {v7}, Lo9/p;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    sget-object v10, Lo9/p;->k:Ljava/util/List;

    .line 186
    .line 187
    const/4 v11, 0x1

    .line 188
    if-eqz v10, :cond_c

    .line 189
    .line 190
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v12

    .line 194
    if-eqz v12, :cond_c

    .line 195
    .line 196
    :cond_b
    move v10, v5

    .line 197
    goto :goto_2

    .line 198
    :cond_c
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    :cond_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v12

    .line 206
    if-eqz v12, :cond_b

    .line 207
    .line 208
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    check-cast v12, Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v8, v12, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    if-eqz v12, :cond_d

    .line 219
    .line 220
    move v10, v11

    .line 221
    :goto_2
    sget-object v12, Lo9/p;->l:Ljava/util/List;

    .line 222
    .line 223
    if-eqz v12, :cond_f

    .line 224
    .line 225
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    if-eqz v13, :cond_f

    .line 230
    .line 231
    :cond_e
    move v12, v5

    .line 232
    goto :goto_3

    .line 233
    :cond_f
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    :cond_10
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    if-eqz v13, :cond_e

    .line 242
    .line 243
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    check-cast v13, Ljava/lang/String;

    .line 248
    .line 249
    invoke-static {v8, v13, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    if-eqz v13, :cond_10

    .line 254
    .line 255
    move v12, v11

    .line 256
    :goto_3
    sget-object v13, Lo9/p;->m:Ljava/util/List;

    .line 257
    .line 258
    if-eqz v13, :cond_12

    .line 259
    .line 260
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    if-eqz v14, :cond_12

    .line 265
    .line 266
    :cond_11
    move v8, v5

    .line 267
    goto :goto_4

    .line 268
    :cond_12
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    :cond_13
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v14

    .line 276
    if-eqz v14, :cond_11

    .line 277
    .line 278
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v14

    .line 282
    check-cast v14, Ljava/lang/String;

    .line 283
    .line 284
    invoke-static {v8, v14, v11}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 285
    .line 286
    .line 287
    move-result v14

    .line 288
    if-eqz v14, :cond_13

    .line 289
    .line 290
    move v8, v11

    .line 291
    :goto_4
    if-eqz v10, :cond_24

    .line 292
    .line 293
    if-eqz v12, :cond_24

    .line 294
    .line 295
    if-nez v8, :cond_24

    .line 296
    .line 297
    filled-new-array {v6, v4}, [Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 302
    .line 303
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 304
    .line 305
    .line 306
    move v8, v5

    .line 307
    :goto_5
    const/4 v10, 0x2

    .line 308
    if-lt v8, v10, :cond_22

    .line 309
    .line 310
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    check-cast v4, Ljava/lang/Iterable;

    .line 318
    .line 319
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v6

    .line 327
    if-eqz v6, :cond_14

    .line 328
    .line 329
    goto/16 :goto_10

    .line 330
    .line 331
    :cond_14
    invoke-virtual {v1}, Lk8/o;->c()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-static {v3, v1}, Lo9/p;->r(Ljava/lang/String;Ljava/lang/String;)Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-eqz v6, :cond_15

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_15
    move-object v1, v9

    .line 343
    :goto_6
    const-string v6, ""

    .line 344
    .line 345
    if-eqz v1, :cond_16

    .line 346
    .line 347
    new-instance v8, Lo9/i;

    .line 348
    .line 349
    invoke-direct {v8, v1, v6}, Lo9/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_16
    move-object v8, v9

    .line 354
    :goto_7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    if-eqz v1, :cond_18

    .line 366
    .line 367
    invoke-virtual {v1}, Lg8/a;->c()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    if-eqz v1, :cond_18

    .line 372
    .line 373
    invoke-static {v3, v1}, Lo9/p;->r(Ljava/lang/String;Ljava/lang/String;)Z

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    if-eqz v12, :cond_17

    .line 378
    .line 379
    goto :goto_8

    .line 380
    :cond_17
    move-object v1, v9

    .line 381
    :goto_8
    if-eqz v1, :cond_18

    .line 382
    .line 383
    new-instance v12, Lo9/i;

    .line 384
    .line 385
    invoke-direct {v12, v1, v6}, Lo9/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_18
    move-object v12, v9

    .line 390
    :goto_9
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    if-lt v1, v10, :cond_19

    .line 395
    .line 396
    invoke-static {v4}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    check-cast v1, Lo9/i;

    .line 401
    .line 402
    invoke-static {v11, v4}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    goto :goto_d

    .line 407
    :cond_19
    if-eqz v8, :cond_1a

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_1a
    if-eqz v12, :cond_1c

    .line 411
    .line 412
    const-string v1, "\u4f60\u9080\u8bf7"

    .line 413
    .line 414
    invoke-static {v7, v1, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_1b

    .line 419
    .line 420
    goto :goto_a

    .line 421
    :cond_1b
    move-object v12, v9

    .line 422
    :goto_a
    move-object v8, v12

    .line 423
    goto :goto_b

    .line 424
    :cond_1c
    move-object v8, v9

    .line 425
    :goto_b
    if-eqz v8, :cond_24

    .line 426
    .line 427
    :goto_c
    move-object v1, v8

    .line 428
    :goto_d
    new-instance v5, Ljava/util/ArrayList;

    .line 429
    .line 430
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    :cond_1d
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    if-eqz v6, :cond_1e

    .line 442
    .line 443
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    move-object v7, v6

    .line 448
    check-cast v7, Lo9/i;

    .line 449
    .line 450
    iget-object v7, v7, Lo9/i;->a:Ljava/lang/String;

    .line 451
    .line 452
    iget-object v8, v1, Lo9/i;->a:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    if-nez v7, :cond_1d

    .line 459
    .line 460
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_1e
    new-instance v4, Ljava/util/HashSet;

    .line 465
    .line 466
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 467
    .line 468
    .line 469
    new-instance v6, Ljava/util/ArrayList;

    .line 470
    .line 471
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    :cond_1f
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    if-eqz v7, :cond_20

    .line 483
    .line 484
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    move-object v8, v7

    .line 489
    check-cast v8, Lo9/i;

    .line 490
    .line 491
    iget-object v8, v8, Lo9/i;->a:Ljava/lang/String;

    .line 492
    .line 493
    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v8

    .line 497
    if-eqz v8, :cond_1f

    .line 498
    .line 499
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    goto :goto_f

    .line 503
    :cond_20
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_21

    .line 508
    .line 509
    goto :goto_10

    .line 510
    :cond_21
    new-instance v9, Lo9/h;

    .line 511
    .line 512
    invoke-direct {v9, v1, v6}, Lo9/h;-><init>(Lo9/i;Ljava/util/ArrayList;)V

    .line 513
    .line 514
    .line 515
    goto :goto_10

    .line 516
    :cond_22
    aget-object v10, v4, v8

    .line 517
    .line 518
    invoke-static {v3, v10, v6}, Lo9/p;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v10}, Lo9/p;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v12

    .line 525
    invoke-virtual {v12, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    if-nez v10, :cond_23

    .line 530
    .line 531
    invoke-static {v3, v12, v6}, Lo9/p;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    .line 532
    .line 533
    .line 534
    :cond_23
    add-int/lit8 v8, v8, 0x1

    .line 535
    .line 536
    goto/16 :goto_5

    .line 537
    .line 538
    :cond_24
    :goto_10
    if-eqz v9, :cond_25

    .line 539
    .line 540
    iget-object v1, v9, Lo9/h;->a:Lo9/i;

    .line 541
    .line 542
    invoke-virtual {v2, v3, v1}, Lo9/p;->C(Ljava/lang/String;Lo9/i;)V

    .line 543
    .line 544
    .line 545
    iget-object v1, v9, Lo9/h;->b:Ljava/util/ArrayList;

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-eqz v4, :cond_25

    .line 556
    .line 557
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    check-cast v4, Lo9/i;

    .line 562
    .line 563
    invoke-virtual {v2, v3, v4}, Lo9/p;->C(Ljava/lang/String;Lo9/i;)V

    .line 564
    .line 565
    .line 566
    goto :goto_11

    .line 567
    :cond_25
    :goto_12
    return-void

    .line 568
    :pswitch_1
    iget-object v2, v0, Lna/c;->b:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v2, Lb9/a;

    .line 571
    .line 572
    iget-object v2, v2, Lb9/a;->f:Ljava/lang/Object;

    .line 573
    .line 574
    move-object v4, v2

    .line 575
    check-cast v4, Lnb/w;

    .line 576
    .line 577
    if-eqz v4, :cond_56

    .line 578
    .line 579
    invoke-virtual {v4}, Lnb/w;->y()Lnb/z;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    const-string v3, "text_speech_enable"

    .line 584
    .line 585
    invoke-virtual {v2, v3}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 586
    .line 587
    .line 588
    move-result v3

    .line 589
    if-eqz v3, :cond_56

    .line 590
    .line 591
    iget-boolean v3, v1, Lk8/o;->i:Z

    .line 592
    .line 593
    if-nez v3, :cond_56

    .line 594
    .line 595
    invoke-virtual {v1}, Lk8/o;->q()Z

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    if-eqz v3, :cond_26

    .line 600
    .line 601
    goto/16 :goto_29

    .line 602
    .line 603
    :cond_26
    invoke-virtual {v1}, Lk8/o;->u()Z

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    const/4 v5, 0x0

    .line 608
    const/4 v6, 0x1

    .line 609
    if-eqz v3, :cond_27

    .line 610
    .line 611
    const-string v3, "text_speech_play_voice_messages"

    .line 612
    .line 613
    invoke-virtual {v2, v3}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-eqz v3, :cond_27

    .line 618
    .line 619
    move v3, v6

    .line 620
    goto :goto_13

    .line 621
    :cond_27
    move v3, v5

    .line 622
    :goto_13
    const-string v7, "text"

    .line 623
    .line 624
    iget-object v8, v1, Lk8/o;->b:Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v7

    .line 630
    if-nez v7, :cond_28

    .line 631
    .line 632
    if-nez v3, :cond_28

    .line 633
    .line 634
    goto/16 :goto_29

    .line 635
    .line 636
    :cond_28
    iget-object v7, v1, Lk8/o;->c:Ljava/lang/String;

    .line 637
    .line 638
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 639
    .line 640
    .line 641
    move-result v8

    .line 642
    if-eqz v8, :cond_29

    .line 643
    .line 644
    invoke-virtual {v1}, Lk8/o;->d()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v7

    .line 648
    :cond_29
    invoke-static {v7, v7}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v10

    .line 652
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 653
    .line 654
    .line 655
    move-result v7

    .line 656
    if-nez v7, :cond_2a

    .line 657
    .line 658
    goto/16 :goto_29

    .line 659
    .line 660
    :cond_2a
    invoke-virtual {v2}, Lnb/z;->a()Ljava/util/Set;

    .line 661
    .line 662
    .line 663
    move-result-object v7

    .line 664
    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v7

    .line 668
    if-nez v7, :cond_2b

    .line 669
    .line 670
    goto/16 :goto_29

    .line 671
    .line 672
    :cond_2b
    invoke-static {v2}, Lnb/w;->k(Lnb/z;)Z

    .line 673
    .line 674
    .line 675
    move-result v7

    .line 676
    if-eqz v7, :cond_2c

    .line 677
    .line 678
    goto/16 :goto_29

    .line 679
    .line 680
    :cond_2c
    iget-object v7, v1, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 681
    .line 682
    const/4 v8, 0x0

    .line 683
    if-eqz v3, :cond_39

    .line 684
    .line 685
    if-eqz v7, :cond_2d

    .line 686
    .line 687
    move-object v15, v7

    .line 688
    goto :goto_14

    .line 689
    :cond_2d
    iget-object v2, v1, Lk8/o;->j:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 690
    .line 691
    move-object v15, v2

    .line 692
    :goto_14
    const-wide/16 v2, 0x0

    .line 693
    .line 694
    if-eqz v7, :cond_2e

    .line 695
    .line 696
    invoke-virtual {v7}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgId()J

    .line 697
    .line 698
    .line 699
    move-result-wide v5

    .line 700
    goto :goto_15

    .line 701
    :cond_2e
    move-wide v5, v2

    .line 702
    :goto_15
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 703
    .line 704
    .line 705
    move-result-object v7

    .line 706
    cmp-long v5, v5, v2

    .line 707
    .line 708
    if-lez v5, :cond_2f

    .line 709
    .line 710
    goto :goto_16

    .line 711
    :cond_2f
    move-object v7, v8

    .line 712
    :goto_16
    if-eqz v7, :cond_30

    .line 713
    .line 714
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 715
    .line 716
    .line 717
    move-result-wide v5

    .line 718
    :goto_17
    move-wide v11, v5

    .line 719
    goto :goto_18

    .line 720
    :cond_30
    if-eqz v15, :cond_31

    .line 721
    .line 722
    iget-wide v5, v15, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 723
    .line 724
    goto :goto_17

    .line 725
    :cond_31
    move-wide v11, v2

    .line 726
    :goto_18
    if-eqz v15, :cond_32

    .line 727
    .line 728
    iget-wide v5, v15, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 729
    .line 730
    move-wide v13, v5

    .line 731
    goto :goto_19

    .line 732
    :cond_32
    move-wide v13, v2

    .line 733
    :goto_19
    cmp-long v5, v13, v2

    .line 734
    .line 735
    const-string v6, ":"

    .line 736
    .line 737
    if-lez v5, :cond_33

    .line 738
    .line 739
    new-instance v1, Ljava/lang/StringBuilder;

    .line 740
    .line 741
    const-string v2, "svr:"

    .line 742
    .line 743
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    :goto_1a
    move-object v9, v1

    .line 760
    goto :goto_1b

    .line 761
    :cond_33
    cmp-long v5, v11, v2

    .line 762
    .line 763
    if-lez v5, :cond_34

    .line 764
    .line 765
    const-string v1, "local:"

    .line 766
    .line 767
    invoke-static {v11, v12, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    goto :goto_1a

    .line 772
    :cond_34
    if-eqz v15, :cond_35

    .line 773
    .line 774
    iget-wide v2, v15, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 775
    .line 776
    :cond_35
    iget-object v1, v1, Lk8/o;->e:Ljava/lang/String;

    .line 777
    .line 778
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    const-string v5, "transient:"

    .line 783
    .line 784
    invoke-static {v5, v10, v6, v2, v3}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    goto :goto_1a

    .line 799
    :goto_1b
    iget-object v1, v4, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 800
    .line 801
    invoke-virtual {v1, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    if-nez v1, :cond_36

    .line 806
    .line 807
    goto/16 :goto_29

    .line 808
    .line 809
    :cond_36
    if-eqz v15, :cond_37

    .line 810
    .line 811
    invoke-static {v15}, Lnb/w;->C(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/util/List;

    .line 812
    .line 813
    .line 814
    move-result-object v8

    .line 815
    :cond_37
    if-nez v8, :cond_38

    .line 816
    .line 817
    sget-object v8, Ltf/t;->g:Ltf/t;

    .line 818
    .line 819
    :cond_38
    move-object/from16 v16, v8

    .line 820
    .line 821
    new-instance v5, Lnb/k;

    .line 822
    .line 823
    move-object v8, v5

    .line 824
    invoke-direct/range {v8 .. v16}, Lnb/k;-><init>(Ljava/lang/String;Ljava/lang/String;JJLh/Hchat/hooks/api/model/WeChatMessage;Ljava/util/List;)V

    .line 825
    .line 826
    .line 827
    iget-wide v6, v4, Lnb/w;->z:J

    .line 828
    .line 829
    iget-object v1, v4, Lnb/w;->b:Landroid/os/Handler;

    .line 830
    .line 831
    new-instance v3, Lnb/h;

    .line 832
    .line 833
    const/4 v8, 0x0

    .line 834
    invoke-direct/range {v3 .. v8}, Lnb/h;-><init>(Lnb/w;Lnb/k;JI)V

    .line 835
    .line 836
    .line 837
    const-wide/16 v4, 0x12c

    .line 838
    .line 839
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 840
    .line 841
    .line 842
    goto/16 :goto_29

    .line 843
    .line 844
    :cond_39
    if-eqz v7, :cond_3a

    .line 845
    .line 846
    invoke-virtual {v7}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v3

    .line 850
    goto :goto_1c

    .line 851
    :cond_3a
    move-object v3, v8

    .line 852
    :goto_1c
    const-string v7, ""

    .line 853
    .line 854
    if-nez v3, :cond_3b

    .line 855
    .line 856
    move-object v3, v7

    .line 857
    :cond_3b
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 858
    .line 859
    .line 860
    move-result v9

    .line 861
    if-eqz v9, :cond_3c

    .line 862
    .line 863
    iget-object v3, v1, Lk8/o;->e:Ljava/lang/String;

    .line 864
    .line 865
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 866
    .line 867
    .line 868
    move-result v9

    .line 869
    if-eqz v9, :cond_3c

    .line 870
    .line 871
    invoke-virtual {v1}, Lk8/o;->a()Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    :cond_3c
    sget-object v9, Lnb/w;->A:Log/k;

    .line 876
    .line 877
    invoke-virtual {v9, v3, v7}, Log/k;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 890
    .line 891
    .line 892
    move-result v11

    .line 893
    if-nez v11, :cond_3d

    .line 894
    .line 895
    goto :goto_1d

    .line 896
    :cond_3d
    const-string v11, "<?xml"

    .line 897
    .line 898
    invoke-static {v3, v11, v6}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 899
    .line 900
    .line 901
    move-result v11

    .line 902
    if-nez v11, :cond_3f

    .line 903
    .line 904
    const-string v11, "<msg"

    .line 905
    .line 906
    invoke-static {v3, v11, v6}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 907
    .line 908
    .line 909
    move-result v11

    .line 910
    if-nez v11, :cond_3f

    .line 911
    .line 912
    const-string v11, "<appmsg"

    .line 913
    .line 914
    invoke-static {v3, v11, v6}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 915
    .line 916
    .line 917
    move-result v11

    .line 918
    if-eqz v11, :cond_3e

    .line 919
    .line 920
    goto :goto_1d

    .line 921
    :cond_3e
    const-string v11, "\\s+"

    .line 922
    .line 923
    invoke-static {v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 924
    .line 925
    .line 926
    move-result-object v11

    .line 927
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    const-string v12, " "

    .line 931
    .line 932
    invoke-virtual {v11, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v3

    .line 940
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v3

    .line 951
    goto :goto_1e

    .line 952
    :cond_3f
    :goto_1d
    move-object v3, v7

    .line 953
    :goto_1e
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 954
    .line 955
    .line 956
    move-result v11

    .line 957
    if-nez v11, :cond_40

    .line 958
    .line 959
    goto/16 :goto_29

    .line 960
    .line 961
    :cond_40
    const-string v11, "text_speech_announce_sender"

    .line 962
    .line 963
    invoke-virtual {v2, v11}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 964
    .line 965
    .line 966
    move-result v2

    .line 967
    if-eqz v2, :cond_55

    .line 968
    .line 969
    iget-boolean v2, v1, Lk8/o;->h:Z

    .line 970
    .line 971
    if-nez v2, :cond_42

    .line 972
    .line 973
    invoke-virtual {v1}, Lk8/o;->j()Z

    .line 974
    .line 975
    .line 976
    move-result v2

    .line 977
    if-eqz v2, :cond_41

    .line 978
    .line 979
    goto :goto_1f

    .line 980
    :cond_41
    move v2, v5

    .line 981
    goto :goto_20

    .line 982
    :cond_42
    :goto_1f
    move v2, v6

    .line 983
    :goto_20
    iget-object v11, v1, Lk8/o;->d:Ljava/lang/String;

    .line 984
    .line 985
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 986
    .line 987
    .line 988
    move-result v12

    .line 989
    if-eqz v12, :cond_43

    .line 990
    .line 991
    invoke-virtual {v1}, Lk8/o;->c()Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v11

    .line 995
    :cond_43
    invoke-static {v11, v11}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v11

    .line 999
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v12

    .line 1003
    if-nez v2, :cond_47

    .line 1004
    .line 1005
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v1

    .line 1009
    if-eqz v1, :cond_44

    .line 1010
    .line 1011
    goto :goto_21

    .line 1012
    :cond_44
    move-object v10, v11

    .line 1013
    :goto_21
    if-eqz v12, :cond_45

    .line 1014
    .line 1015
    invoke-virtual {v12, v10}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v8

    .line 1019
    :cond_45
    if-nez v8, :cond_46

    .line 1020
    .line 1021
    goto :goto_22

    .line 1022
    :cond_46
    move-object v7, v8

    .line 1023
    :goto_22
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v1

    .line 1027
    if-eqz v1, :cond_54

    .line 1028
    .line 1029
    move-object v7, v10

    .line 1030
    goto/16 :goto_28

    .line 1031
    .line 1032
    :cond_47
    if-eqz v2, :cond_4c

    .line 1033
    .line 1034
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    if-nez v2, :cond_48

    .line 1039
    .line 1040
    goto :goto_23

    .line 1041
    :cond_48
    invoke-virtual {v11, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v2

    .line 1045
    if-nez v2, :cond_49

    .line 1046
    .line 1047
    const-string v2, "@chatroom"

    .line 1048
    .line 1049
    invoke-static {v11, v2, v5}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v2

    .line 1053
    if-eqz v2, :cond_4c

    .line 1054
    .line 1055
    :cond_49
    :goto_23
    iget-object v1, v1, Lk8/o;->e:Ljava/lang/String;

    .line 1056
    .line 1057
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    invoke-static {v9, v1}, Log/k;->b(Log/k;Ljava/lang/String;)Log/i;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v1

    .line 1072
    if-eqz v1, :cond_4a

    .line 1073
    .line 1074
    invoke-virtual {v1}, Log/i;->a()Ljava/util/List;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    invoke-static {v6, v1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    check-cast v1, Ljava/lang/String;

    .line 1083
    .line 1084
    goto :goto_24

    .line 1085
    :cond_4a
    move-object v1, v8

    .line 1086
    :goto_24
    if-nez v1, :cond_4b

    .line 1087
    .line 1088
    move-object v11, v7

    .line 1089
    goto :goto_25

    .line 1090
    :cond_4b
    move-object v11, v1

    .line 1091
    :cond_4c
    :goto_25
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1092
    .line 1093
    .line 1094
    move-result v1

    .line 1095
    if-nez v1, :cond_4d

    .line 1096
    .line 1097
    goto :goto_28

    .line 1098
    :cond_4d
    invoke-virtual {v11, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v1

    .line 1102
    if-eqz v1, :cond_4e

    .line 1103
    .line 1104
    goto :goto_28

    .line 1105
    :cond_4e
    if-eqz v12, :cond_4f

    .line 1106
    .line 1107
    invoke-virtual {v12, v10, v11}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    goto :goto_26

    .line 1112
    :cond_4f
    move-object v1, v8

    .line 1113
    :goto_26
    if-nez v1, :cond_50

    .line 1114
    .line 1115
    move-object v1, v7

    .line 1116
    :cond_50
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v2

    .line 1120
    if-eqz v2, :cond_53

    .line 1121
    .line 1122
    if-eqz v12, :cond_51

    .line 1123
    .line 1124
    invoke-virtual {v12, v11}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v8

    .line 1128
    :cond_51
    if-nez v8, :cond_52

    .line 1129
    .line 1130
    goto :goto_27

    .line 1131
    :cond_52
    move-object v7, v8

    .line 1132
    goto :goto_27

    .line 1133
    :cond_53
    move-object v7, v1

    .line 1134
    :goto_27
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1135
    .line 1136
    .line 1137
    move-result v1

    .line 1138
    if-eqz v1, :cond_54

    .line 1139
    .line 1140
    move-object v7, v11

    .line 1141
    :cond_54
    :goto_28
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1142
    .line 1143
    .line 1144
    move-result v1

    .line 1145
    if-lez v1, :cond_55

    .line 1146
    .line 1147
    const-string v1, " \u8bf4\uff0c"

    .line 1148
    .line 1149
    invoke-static {v7, v1, v3}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    :cond_55
    iget-object v1, v4, Lnb/w;->b:Landroid/os/Handler;

    .line 1154
    .line 1155
    new-instance v2, Lnb/f;

    .line 1156
    .line 1157
    const/4 v5, 0x0

    .line 1158
    invoke-direct {v2, v4, v3, v5}, Lnb/f;-><init>(Lnb/w;Ljava/lang/String;I)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1162
    .line 1163
    .line 1164
    :cond_56
    :goto_29
    return-void

    .line 1165
    :pswitch_2
    iget-object v2, v0, Lna/c;->b:Ljava/lang/Object;

    .line 1166
    .line 1167
    move-object v3, v2

    .line 1168
    check-cast v3, Lna/e;

    .line 1169
    .line 1170
    iget-object v2, v1, Lk8/o;->f:Ljava/lang/String;

    .line 1171
    .line 1172
    iget-object v4, v1, Lk8/o;->e:Ljava/lang/String;

    .line 1173
    .line 1174
    const-string v5, "red_packet"

    .line 1175
    .line 1176
    iget-object v6, v1, Lk8/o;->b:Ljava/lang/String;

    .line 1177
    .line 1178
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v5

    .line 1182
    if-nez v5, :cond_57

    .line 1183
    .line 1184
    goto/16 :goto_2b

    .line 1185
    .line 1186
    :cond_57
    iget-object v5, v1, Lk8/o;->g:Ljava/lang/String;

    .line 1187
    .line 1188
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1189
    .line 1190
    .line 1191
    move-result v6

    .line 1192
    if-nez v6, :cond_58

    .line 1193
    .line 1194
    goto :goto_2a

    .line 1195
    :cond_58
    move-object v2, v4

    .line 1196
    :goto_2a
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1197
    .line 1198
    .line 1199
    move-result v6

    .line 1200
    const-string v7, "nativeurl"

    .line 1201
    .line 1202
    if-eqz v6, :cond_59

    .line 1203
    .line 1204
    invoke-static {v2, v7}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v5

    .line 1208
    :cond_59
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v6

    .line 1212
    if-eqz v6, :cond_5a

    .line 1213
    .line 1214
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v6

    .line 1218
    if-nez v6, :cond_5a

    .line 1219
    .line 1220
    invoke-static {v4, v7}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v5

    .line 1224
    :cond_5a
    move-object v8, v5

    .line 1225
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v5

    .line 1229
    if-eqz v5, :cond_5b

    .line 1230
    .line 1231
    goto/16 :goto_2b

    .line 1232
    .line 1233
    :cond_5b
    const-string v5, "exclusive_recv_username"

    .line 1234
    .line 1235
    invoke-static {v2, v5}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v6

    .line 1239
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v7

    .line 1243
    if-eqz v7, :cond_5c

    .line 1244
    .line 1245
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v7

    .line 1249
    if-nez v7, :cond_5c

    .line 1250
    .line 1251
    invoke-static {v4, v5}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v6

    .line 1255
    :cond_5c
    move-object v9, v6

    .line 1256
    const-string v5, "fromusername"

    .line 1257
    .line 1258
    invoke-static {v2, v5}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v6

    .line 1262
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1263
    .line 1264
    .line 1265
    move-result v7

    .line 1266
    if-eqz v7, :cond_5d

    .line 1267
    .line 1268
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v7

    .line 1272
    if-nez v7, :cond_5d

    .line 1273
    .line 1274
    invoke-static {v4, v5}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v6

    .line 1278
    :cond_5d
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v5

    .line 1282
    if-eqz v5, :cond_5e

    .line 1283
    .line 1284
    const-string v5, "sendusername"

    .line 1285
    .line 1286
    invoke-static {v8, v5}, Loa/b;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v6

    .line 1290
    :cond_5e
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1291
    .line 1292
    .line 1293
    move-result v5

    .line 1294
    if-eqz v5, :cond_5f

    .line 1295
    .line 1296
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1297
    .line 1298
    .line 1299
    move-result v5

    .line 1300
    if-nez v5, :cond_5f

    .line 1301
    .line 1302
    const-string v5, ":\n"

    .line 1303
    .line 1304
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 1305
    .line 1306
    .line 1307
    move-result v5

    .line 1308
    if-lez v5, :cond_5f

    .line 1309
    .line 1310
    const/4 v6, 0x0

    .line 1311
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v6

    .line 1315
    :cond_5f
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1316
    .line 1317
    .line 1318
    move-result v4

    .line 1319
    if-eqz v4, :cond_60

    .line 1320
    .line 1321
    iget-object v6, v1, Lk8/o;->d:Ljava/lang/String;

    .line 1322
    .line 1323
    :cond_60
    invoke-static {v6}, Loa/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v6

    .line 1327
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1328
    .line 1329
    const-string v5, "Observe:"

    .line 1330
    .line 1331
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    iget-object v5, v1, Lk8/o;->a:Ljava/lang/String;

    .line 1335
    .line 1336
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v4

    .line 1343
    iget-object v1, v1, Lk8/o;->c:Ljava/lang/String;

    .line 1344
    .line 1345
    invoke-static {v1}, Loa/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v7

    .line 1349
    move-object v5, v2

    .line 1350
    invoke-virtual/range {v3 .. v9}, Lna/e;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1351
    .line 1352
    .line 1353
    :goto_2b
    return-void

    .line 1354
    nop

    .line 1355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
