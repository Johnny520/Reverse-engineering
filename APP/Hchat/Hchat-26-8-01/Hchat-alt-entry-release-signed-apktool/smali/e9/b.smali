.class public final synthetic Le9/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk8/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Lr8/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Le9/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Le9/b;->b:Lr8/g;

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
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget v0, v1, Le9/b;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-string v3, "block_at_all_notification_enable"

    .line 9
    .line 10
    const-string v4, "Hchat_block_at_all_notification_config"

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const-string v7, ""

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, Le9/b;->b:Lr8/g;

    .line 19
    .line 20
    sget-object v2, Lx9/d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    .line 22
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {v0, v6}, Lx9/d;->c(Landroid/content/Context;Lk8/o;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, v1, Le9/b;->b:Lr8/g;

    .line 29
    .line 30
    sget-object v2, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 33
    .line 34
    new-instance v2, Lx8/r;

    .line 35
    .line 36
    invoke-direct {v2, v0}, Lx8/r;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    const-string v3, "auto_reply_enable"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    invoke-virtual {v6}, Lk8/o;->q()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_1
    iget-object v3, v6, Lk8/o;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v6}, Lk8/o;->d()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :cond_2
    const-string v4, "excluded_talkers_enable"

    .line 70
    .line 71
    invoke-virtual {v2, v4}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_3
    if-eqz v3, :cond_4

    .line 80
    .line 81
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    :cond_4
    if-nez v5, :cond_5

    .line 90
    .line 91
    move-object v5, v7

    .line 92
    :cond_5
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-nez v3, :cond_6

    .line 97
    .line 98
    goto/16 :goto_2

    .line 99
    .line 100
    :cond_6
    const-string v3, "excluded_talkers"

    .line 101
    .line 102
    invoke-virtual {v2, v3, v7}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/4 v4, 0x6

    .line 107
    new-array v7, v4, [C

    .line 108
    .line 109
    fill-array-data v7, :array_0

    .line 110
    .line 111
    .line 112
    invoke-static {v3, v7, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    new-instance v4, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_7

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    check-cast v7, Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v7, v4}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    :cond_8
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-eqz v7, :cond_9

    .line 159
    .line 160
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    move-object v8, v7

    .line 165
    check-cast v8, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-lez v8, :cond_8

    .line 172
    .line 173
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_9
    invoke-static {v3}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/lang/Iterable;

    .line 182
    .line 183
    instance-of v4, v3, Ljava/util/Collection;

    .line 184
    .line 185
    if-eqz v4, :cond_a

    .line 186
    .line 187
    move-object v4, v3

    .line 188
    check-cast v4, Ljava/util/Collection;

    .line 189
    .line 190
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-eqz v4, :cond_a

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_a
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_c

    .line 206
    .line 207
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {v4, v5}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-eqz v4, :cond_b

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_c
    :goto_2
    sget-object v3, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 221
    .line 222
    new-instance v4, Lr8/b;

    .line 223
    .line 224
    const/16 v5, 0xb

    .line 225
    .line 226
    invoke-direct {v4, v0, v2, v6, v5}, Lr8/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 230
    .line 231
    .line 232
    :goto_3
    return-void

    .line 233
    :pswitch_1
    iget-object v0, v1, Le9/b;->b:Lr8/g;

    .line 234
    .line 235
    sget-object v5, Lt8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 236
    .line 237
    iget-object v0, v0, Lr8/g;->a:Landroid/content/Context;

    .line 238
    .line 239
    invoke-static {v0, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-interface {v4, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_d

    .line 248
    .line 249
    sget-object v0, Lt8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_d
    iget-object v2, v6, Lk8/o;->c:Ljava/lang/String;

    .line 256
    .line 257
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-eqz v3, :cond_e

    .line 262
    .line 263
    invoke-virtual {v6}, Lk8/o;->d()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {v0, v2}, Loh/h;->i(Landroid/content/Context;Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    invoke-static {v6, v2}, Lt8/b;->a(Lk8/o;Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    iget-object v5, v6, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 279
    .line 280
    if-eqz v5, :cond_f

    .line 281
    .line 282
    iget-wide v5, v5, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_f
    const-wide/16 v5, 0x0

    .line 286
    .line 287
    :goto_4
    if-eqz v3, :cond_11

    .line 288
    .line 289
    if-nez v4, :cond_10

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_10
    invoke-static {v0, v2, v5, v6}, Lt8/b;->c(Landroid/content/Context;Ljava/lang/String;J)V

    .line 293
    .line 294
    .line 295
    :cond_11
    :goto_5
    return-void

    .line 296
    :pswitch_2
    iget-object v0, v1, Le9/b;->b:Lr8/g;

    .line 297
    .line 298
    sget-object v8, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 299
    .line 300
    iget-object v8, v0, Lr8/g;->a:Landroid/content/Context;

    .line 301
    .line 302
    iget-object v9, v6, Lk8/o;->e:Ljava/lang/String;

    .line 303
    .line 304
    iget-object v10, v6, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 305
    .line 306
    iget-object v11, v6, Lk8/o;->c:Ljava/lang/String;

    .line 307
    .line 308
    sget-object v0, Lt8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 309
    .line 310
    invoke-static {v8, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-nez v0, :cond_12

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_12
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_13

    .line 326
    .line 327
    invoke-virtual {v6}, Lk8/o;->d()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    goto :goto_6

    .line 332
    :cond_13
    move-object v0, v11

    .line 333
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {v8, v0}, Loh/h;->i(Landroid/content/Context;Ljava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    if-eqz v3, :cond_14

    .line 341
    .line 342
    invoke-static {v6, v0}, Lt8/b;->a(Lk8/o;Ljava/lang/String;)Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_14

    .line 347
    .line 348
    goto/16 :goto_1e

    .line 349
    .line 350
    :cond_14
    :goto_7
    new-instance v0, Le9/s;

    .line 351
    .line 352
    invoke-direct {v0, v8}, Le9/s;-><init>(Landroid/content/Context;)V

    .line 353
    .line 354
    .line 355
    const-string v3, "custom_notification_enable"

    .line 356
    .line 357
    invoke-virtual {v0, v3}, Le9/s;->b(Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-nez v3, :cond_15

    .line 362
    .line 363
    goto/16 :goto_1e

    .line 364
    .line 365
    :cond_15
    iget-boolean v3, v6, Lk8/o;->i:Z

    .line 366
    .line 367
    if-nez v3, :cond_41

    .line 368
    .line 369
    invoke-virtual {v6}, Lk8/o;->q()Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_16

    .line 374
    .line 375
    goto/16 :goto_1e

    .line 376
    .line 377
    :cond_16
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-eqz v3, :cond_17

    .line 382
    .line 383
    invoke-virtual {v6}, Lk8/o;->d()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    goto :goto_8

    .line 388
    :cond_17
    move-object v3, v11

    .line 389
    :goto_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-eqz v4, :cond_18

    .line 397
    .line 398
    goto/16 :goto_1e

    .line 399
    .line 400
    :cond_18
    if-eqz v10, :cond_19

    .line 401
    .line 402
    invoke-virtual {v10}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    goto :goto_9

    .line 407
    :cond_19
    move-object v4, v5

    .line 408
    :goto_9
    if-nez v4, :cond_1a

    .line 409
    .line 410
    move-object v4, v7

    .line 411
    :cond_1a
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 412
    .line 413
    .line 414
    move-result v12

    .line 415
    if-eqz v12, :cond_1b

    .line 416
    .line 417
    move-object v4, v9

    .line 418
    :cond_1b
    iget-object v12, v6, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 419
    .line 420
    if-eqz v12, :cond_1c

    .line 421
    .line 422
    invoke-virtual {v12}, Lh/Hchat/hooks/api/model/WeChatMessage;->getType()I

    .line 423
    .line 424
    .line 425
    move-result v12

    .line 426
    goto :goto_a

    .line 427
    :cond_1c
    move v12, v2

    .line 428
    :goto_a
    const/16 v13, 0x25

    .line 429
    .line 430
    if-eq v12, v13, :cond_41

    .line 431
    .line 432
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    const-string v12, "antispamticket"

    .line 436
    .line 437
    const/4 v13, 0x1

    .line 438
    invoke-static {v4, v12, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 439
    .line 440
    .line 441
    move-result v12

    .line 442
    if-nez v12, :cond_41

    .line 443
    .line 444
    const-string v12, "verify_ticket"

    .line 445
    .line 446
    invoke-static {v4, v12, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 447
    .line 448
    .line 449
    move-result v12

    .line 450
    if-nez v12, :cond_41

    .line 451
    .line 452
    const-string v12, "encryptusername"

    .line 453
    .line 454
    invoke-static {v4, v12, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 455
    .line 456
    .line 457
    move-result v12

    .line 458
    if-nez v12, :cond_41

    .line 459
    .line 460
    const-string v12, "fmessage"

    .line 461
    .line 462
    invoke-static {v4, v12, v13}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-eqz v4, :cond_1d

    .line 467
    .line 468
    goto/16 :goto_1e

    .line 469
    .line 470
    :cond_1d
    invoke-virtual {v0, v3}, Le9/s;->a(Ljava/lang/String;)Le9/c;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    if-eqz v4, :cond_41

    .line 475
    .line 476
    iget-boolean v0, v4, Le9/c;->f:Z

    .line 477
    .line 478
    if-eqz v0, :cond_41

    .line 479
    .line 480
    iget v0, v4, Le9/c;->g:I

    .line 481
    .line 482
    if-nez v0, :cond_1e

    .line 483
    .line 484
    goto/16 :goto_1e

    .line 485
    .line 486
    :cond_1e
    invoke-virtual {v6}, Lk8/o;->s()Z

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-nez v0, :cond_41

    .line 491
    .line 492
    invoke-virtual {v6}, Lk8/o;->o()Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-nez v0, :cond_41

    .line 497
    .line 498
    const-string v0, "recalled"

    .line 499
    .line 500
    iget-object v12, v6, Lk8/o;->b:Ljava/lang/String;

    .line 501
    .line 502
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-nez v0, :cond_20

    .line 507
    .line 508
    iget-object v0, v6, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 509
    .line 510
    if-eqz v0, :cond_1f

    .line 511
    .line 512
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isRecalled()Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_1f

    .line 517
    .line 518
    goto :goto_b

    .line 519
    :cond_1f
    move v0, v2

    .line 520
    goto :goto_c

    .line 521
    :cond_20
    :goto_b
    move v0, v13

    .line 522
    :goto_c
    if-eqz v0, :cond_21

    .line 523
    .line 524
    goto/16 :goto_1e

    .line 525
    .line 526
    :cond_21
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->b()Lq8/m;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    if-eqz v0, :cond_22

    .line 538
    .line 539
    invoke-virtual {v0}, Lq8/m;->a()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v12

    .line 543
    goto :goto_d

    .line 544
    :cond_22
    move-object v12, v5

    .line 545
    :goto_d
    if-nez v12, :cond_23

    .line 546
    .line 547
    move-object v12, v7

    .line 548
    :cond_23
    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v12

    .line 552
    if-eqz v12, :cond_30

    .line 553
    .line 554
    if-eqz v0, :cond_30

    .line 555
    .line 556
    iget-object v12, v0, Lq8/m;->b:Lq8/o;

    .line 557
    .line 558
    if-eqz v12, :cond_24

    .line 559
    .line 560
    invoke-virtual {v12}, Lq8/o;->a()Landroid/app/Activity;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    goto :goto_e

    .line 565
    :cond_24
    move-object v12, v5

    .line 566
    :goto_e
    if-nez v12, :cond_25

    .line 567
    .line 568
    goto :goto_f

    .line 569
    :cond_25
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v12

    .line 573
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v12

    .line 577
    const-string v14, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 578
    .line 579
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v14

    .line 583
    if-nez v14, :cond_28

    .line 584
    .line 585
    const-string v14, ".ui.chatting."

    .line 586
    .line 587
    invoke-virtual {v12, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 588
    .line 589
    .line 590
    move-result v12

    .line 591
    if-eqz v12, :cond_26

    .line 592
    .line 593
    goto :goto_10

    .line 594
    :cond_26
    :goto_f
    iget-object v0, v0, Lq8/m;->j:Ljava/lang/String;

    .line 595
    .line 596
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-nez v0, :cond_27

    .line 601
    .line 602
    goto :goto_10

    .line 603
    :cond_27
    move v0, v2

    .line 604
    goto :goto_11

    .line 605
    :cond_28
    :goto_10
    move v0, v13

    .line 606
    :goto_11
    if-ne v0, v13, :cond_30

    .line 607
    .line 608
    const-string v0, "activity"

    .line 609
    .line 610
    invoke-virtual {v8, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    instance-of v12, v0, Landroid/app/ActivityManager;

    .line 615
    .line 616
    if-eqz v12, :cond_29

    .line 617
    .line 618
    check-cast v0, Landroid/app/ActivityManager;

    .line 619
    .line 620
    goto :goto_12

    .line 621
    :cond_29
    move-object v0, v5

    .line 622
    :goto_12
    if-eqz v0, :cond_2f

    .line 623
    .line 624
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 625
    .line 626
    .line 627
    move-result v12

    .line 628
    :try_start_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    if-eqz v0, :cond_2d

    .line 633
    .line 634
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    :cond_2a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 639
    .line 640
    .line 641
    move-result v14

    .line 642
    if-eqz v14, :cond_2b

    .line 643
    .line 644
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v14

    .line 648
    move-object v15, v14

    .line 649
    check-cast v15, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 650
    .line 651
    iget v15, v15, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 652
    .line 653
    if-ne v15, v12, :cond_2a

    .line 654
    .line 655
    goto :goto_13

    .line 656
    :catchall_0
    move-exception v0

    .line 657
    goto :goto_16

    .line 658
    :cond_2b
    move-object v14, v5

    .line 659
    :goto_13
    check-cast v14, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 660
    .line 661
    if-eqz v14, :cond_2d

    .line 662
    .line 663
    iget v0, v14, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 664
    .line 665
    const/16 v12, 0x64

    .line 666
    .line 667
    if-eq v0, v12, :cond_2d

    .line 668
    .line 669
    const/16 v12, 0xc8

    .line 670
    .line 671
    if-ne v0, v12, :cond_2c

    .line 672
    .line 673
    goto :goto_14

    .line 674
    :cond_2c
    move v0, v2

    .line 675
    goto :goto_15

    .line 676
    :cond_2d
    :goto_14
    move v0, v13

    .line 677
    :goto_15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 678
    .line 679
    .line 680
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 681
    goto :goto_17

    .line 682
    :goto_16
    new-instance v12, Lsf/f;

    .line 683
    .line 684
    invoke-direct {v12, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 685
    .line 686
    .line 687
    move-object v0, v12

    .line 688
    :goto_17
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 689
    .line 690
    instance-of v14, v0, Lsf/f;

    .line 691
    .line 692
    if-eqz v14, :cond_2e

    .line 693
    .line 694
    move-object v0, v12

    .line 695
    :cond_2e
    check-cast v0, Ljava/lang/Boolean;

    .line 696
    .line 697
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    goto :goto_18

    .line 702
    :cond_2f
    move v0, v13

    .line 703
    goto :goto_18

    .line 704
    :cond_30
    move v0, v2

    .line 705
    :goto_18
    if-eqz v0, :cond_31

    .line 706
    .line 707
    goto/16 :goto_1e

    .line 708
    .line 709
    :cond_31
    invoke-static {v4}, Le9/q;->k(Le9/c;)Z

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-eqz v0, :cond_32

    .line 714
    .line 715
    goto/16 :goto_1e

    .line 716
    .line 717
    :cond_32
    iget-boolean v0, v4, Le9/c;->d:Z

    .line 718
    .line 719
    iget-object v12, v4, Le9/c;->w:Ljava/lang/String;

    .line 720
    .line 721
    iget-object v14, v4, Le9/c;->v:Ljava/lang/String;

    .line 722
    .line 723
    if-nez v0, :cond_33

    .line 724
    .line 725
    goto/16 :goto_1d

    .line 726
    .line 727
    :cond_33
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-eqz v0, :cond_34

    .line 732
    .line 733
    invoke-virtual {v6}, Lk8/o;->d()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v11

    .line 737
    :cond_34
    iget-object v0, v6, Lk8/o;->d:Ljava/lang/String;

    .line 738
    .line 739
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 740
    .line 741
    .line 742
    move-result v15

    .line 743
    if-eqz v15, :cond_35

    .line 744
    .line 745
    invoke-virtual {v6}, Lk8/o;->c()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    :cond_35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 753
    .line 754
    .line 755
    move-result v15

    .line 756
    if-nez v15, :cond_37

    .line 757
    .line 758
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 759
    .line 760
    .line 761
    move-result-object v15

    .line 762
    if-eqz v15, :cond_36

    .line 763
    .line 764
    iget-object v2, v4, Le9/c;->b:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v15, v2, v0}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    goto :goto_19

    .line 771
    :cond_36
    move-object v2, v5

    .line 772
    :goto_19
    if-nez v2, :cond_38

    .line 773
    .line 774
    :cond_37
    move-object v2, v7

    .line 775
    :cond_38
    if-eqz v10, :cond_39

    .line 776
    .line 777
    invoke-virtual {v10}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v5

    .line 781
    :cond_39
    if-nez v5, :cond_3a

    .line 782
    .line 783
    goto :goto_1a

    .line 784
    :cond_3a
    move-object v7, v5

    .line 785
    :goto_1a
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 786
    .line 787
    .line 788
    move-result v5

    .line 789
    if-eqz v5, :cond_3b

    .line 790
    .line 791
    goto :goto_1b

    .line 792
    :cond_3b
    move-object v9, v7

    .line 793
    :goto_1b
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 794
    .line 795
    .line 796
    move-result v5

    .line 797
    if-nez v5, :cond_3c

    .line 798
    .line 799
    sget-object v5, Le9/s;->b:Ljava/util/Set;

    .line 800
    .line 801
    invoke-static {v14, v0, v2, v9}, Le9/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 802
    .line 803
    .line 804
    move-result v5

    .line 805
    if-nez v5, :cond_3c

    .line 806
    .line 807
    :goto_1c
    move v2, v13

    .line 808
    goto :goto_1d

    .line 809
    :cond_3c
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 810
    .line 811
    .line 812
    move-result v5

    .line 813
    if-nez v5, :cond_3d

    .line 814
    .line 815
    sget-object v5, Le9/s;->b:Ljava/util/Set;

    .line 816
    .line 817
    invoke-static {v12, v0, v2, v9}, Le9/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 818
    .line 819
    .line 820
    move-result v0

    .line 821
    if-eqz v0, :cond_3d

    .line 822
    .line 823
    goto :goto_1c

    .line 824
    :cond_3d
    iget-boolean v0, v4, Le9/c;->t:Z

    .line 825
    .line 826
    if-eqz v0, :cond_3e

    .line 827
    .line 828
    sget-object v0, Lt8/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 829
    .line 830
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    invoke-static {v6, v11}, Lt8/b;->a(Lk8/o;Ljava/lang/String;)Z

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    if-eqz v0, :cond_3e

    .line 838
    .line 839
    goto :goto_1c

    .line 840
    :cond_3e
    iget-boolean v0, v4, Le9/c;->u:Z

    .line 841
    .line 842
    if-eqz v0, :cond_3f

    .line 843
    .line 844
    invoke-virtual {v6}, Lk8/o;->g()Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-eqz v0, :cond_3f

    .line 849
    .line 850
    goto :goto_1c

    .line 851
    :cond_3f
    const/4 v2, 0x0

    .line 852
    :goto_1d
    if-eqz v2, :cond_40

    .line 853
    .line 854
    goto :goto_1e

    .line 855
    :cond_40
    sget-object v0, Le9/q;->f:Landroid/os/Handler;

    .line 856
    .line 857
    new-instance v2, Le9/d;

    .line 858
    .line 859
    const/4 v7, 0x1

    .line 860
    move-object v5, v8

    .line 861
    invoke-direct/range {v2 .. v7}, Le9/d;-><init>(Ljava/lang/String;Le9/c;Landroid/content/Context;Lk8/o;I)V

    .line 862
    .line 863
    .line 864
    const-wide/16 v3, 0x384

    .line 865
    .line 866
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 867
    .line 868
    .line 869
    :cond_41
    :goto_1e
    return-void

    .line 870
    nop

    .line 871
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    :array_0
    .array-data 2
        0x2cs
        -0xf4s
        0x3bs
        -0xe5s
        0xas
        0xds
    .end array-data
.end method
