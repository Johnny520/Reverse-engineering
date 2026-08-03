.class public final Lc9/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lc9/b0;->a:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Lc9/q;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lc9/b0;->b:Ljava/util/concurrent/ExecutorService;

    .line 23
    .line 24
    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lc9/d2;->a:Lc9/d2;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lc9/d2;->j(Ljava/lang/String;Ljava/util/List;)Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static b(Ljava/util/Collection;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2, v1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object v3, v2

    .line 54
    check-cast v3, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    :try_start_0
    invoke-virtual {v0, v1}, Lg8/i;->q(Ljava/util/List;)Ljava/util/ArrayList;

    .line 84
    .line 85
    .line 86
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    goto :goto_2

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    new-instance v4, Lsf/f;

    .line 90
    .line 91
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move-object v0, v3

    .line 96
    :goto_2
    if-nez v0, :cond_4

    .line 97
    .line 98
    move-object v4, v2

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move-object v4, v0

    .line 101
    :goto_3
    nop

    .line 102
    instance-of v0, v4, Lsf/f;

    .line 103
    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    move-object v4, v2

    .line 107
    :cond_5
    check-cast v4, Ljava/lang/Iterable;

    .line 108
    .line 109
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ltf/y;->a0(I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    const/16 v5, 0x10

    .line 118
    .line 119
    if-ge v0, v5, :cond_6

    .line 120
    .line 121
    move v0, v5

    .line 122
    :cond_6
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    invoke-direct {v5, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_7

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    move-object v6, v4

    .line 142
    check-cast v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 143
    .line 144
    iget-object v6, v6, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 145
    .line 146
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-eqz v0, :cond_8

    .line 155
    .line 156
    invoke-virtual {v0}, Lh8/a;->c()Ljava/util/ArrayList;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_5

    .line 161
    :cond_8
    move-object v0, v3

    .line 162
    :goto_5
    if-nez v0, :cond_9

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_9
    move-object v2, v0

    .line 166
    :goto_6
    new-instance v0, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const/4 v4, 0x0

    .line 180
    move v6, v4

    .line 181
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_b

    .line 186
    .line 187
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    add-int/lit8 v8, v6, 0x1

    .line 192
    .line 193
    if-ltz v6, :cond_a

    .line 194
    .line 195
    check-cast v7, Ll8/b;

    .line 196
    .line 197
    iget-object v7, v7, Ll8/b;->a:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    new-instance v9, Lsf/e;

    .line 204
    .line 205
    invoke-direct {v9, v7, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move v6, v8

    .line 212
    goto :goto_7

    .line 213
    :cond_a
    invoke-static {}, La/a;->Q0()V

    .line 214
    .line 215
    .line 216
    throw v3

    .line 217
    :cond_b
    invoke-static {v0}, Ltf/y;->e0(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v2, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    if-eqz v6, :cond_1d

    .line 239
    .line 240
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    move-object v8, v6

    .line 245
    check-cast v8, Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v5, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    check-cast v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 252
    .line 253
    const/4 v7, 0x1

    .line 254
    if-eqz v6, :cond_c

    .line 255
    .line 256
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatContact;->isGroup()Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    if-ne v9, v7, :cond_c

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_c
    const-string v9, "@chatroom"

    .line 264
    .line 265
    invoke-static {v8, v9, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-nez v9, :cond_e

    .line 270
    .line 271
    const-string v9, "@im.chatroom"

    .line 272
    .line 273
    invoke-static {v8, v9, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    if-eqz v9, :cond_d

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_d
    move v10, v4

    .line 281
    goto :goto_a

    .line 282
    :cond_e
    :goto_9
    move v10, v7

    .line 283
    :goto_a
    if-eqz v6, :cond_f

    .line 284
    .line 285
    invoke-virtual {v6}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    goto :goto_b

    .line 290
    :cond_f
    move-object v7, v3

    .line 291
    :goto_b
    const-string v9, ""

    .line 292
    .line 293
    if-nez v7, :cond_10

    .line 294
    .line 295
    move-object v7, v9

    .line 296
    :cond_10
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    if-eqz v11, :cond_13

    .line 301
    .line 302
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    if-eqz v7, :cond_11

    .line 307
    .line 308
    invoke-virtual {v7, v8}, Lh8/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v7

    .line 312
    goto :goto_c

    .line 313
    :cond_11
    move-object v7, v3

    .line 314
    :goto_c
    if-nez v7, :cond_12

    .line 315
    .line 316
    move-object v7, v9

    .line 317
    :cond_12
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    if-eqz v11, :cond_13

    .line 322
    .line 323
    move-object v7, v8

    .line 324
    :cond_13
    if-eqz v6, :cond_14

    .line 325
    .line 326
    iget-object v11, v6, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 327
    .line 328
    goto :goto_d

    .line 329
    :cond_14
    move-object v11, v3

    .line 330
    :goto_d
    if-nez v11, :cond_15

    .line 331
    .line 332
    move-object v11, v9

    .line 333
    :cond_15
    if-eqz v6, :cond_16

    .line 334
    .line 335
    iget-object v12, v6, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 336
    .line 337
    goto :goto_e

    .line 338
    :cond_16
    move-object v12, v3

    .line 339
    :goto_e
    if-nez v12, :cond_17

    .line 340
    .line 341
    move-object v12, v9

    .line 342
    :cond_17
    const-string v9, "gh_"

    .line 343
    .line 344
    invoke-static {v8, v9, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    if-eqz v6, :cond_18

    .line 349
    .line 350
    iget-object v9, v6, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 351
    .line 352
    goto :goto_f

    .line 353
    :cond_18
    move-object v9, v3

    .line 354
    :goto_f
    if-eqz v6, :cond_19

    .line 355
    .line 356
    iget-object v13, v6, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 357
    .line 358
    goto :goto_10

    .line 359
    :cond_19
    move-object v13, v3

    .line 360
    :goto_10
    if-eqz v6, :cond_1a

    .line 361
    .line 362
    iget-object v6, v6, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 363
    .line 364
    goto :goto_11

    .line 365
    :cond_1a
    move-object v6, v3

    .line 366
    :goto_11
    filled-new-array {v9, v13, v6}, [Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    invoke-static {v6}, La/a;->z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    new-instance v15, Ljava/util/ArrayList;

    .line 375
    .line 376
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    :cond_1b
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v9

    .line 387
    if-eqz v9, :cond_1c

    .line 388
    .line 389
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v9

    .line 393
    move-object v13, v9

    .line 394
    check-cast v13, Ljava/lang/String;

    .line 395
    .line 396
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 397
    .line 398
    .line 399
    move-result v13

    .line 400
    if-nez v13, :cond_1b

    .line 401
    .line 402
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_12

    .line 406
    :cond_1c
    new-instance v6, Lwb/jv;

    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const/16 v16, 0x20

    .line 410
    .line 411
    move-object v9, v7

    .line 412
    move-object v7, v6

    .line 413
    invoke-direct/range {v7 .. v16}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto/16 :goto_8

    .line 420
    .line 421
    :cond_1d
    new-instance v1, Lc9/z;

    .line 422
    .line 423
    const/4 v3, 0x0

    .line 424
    invoke-direct {v1, v0, v3}, Lc9/z;-><init>(Ljava/util/Map;I)V

    .line 425
    .line 426
    .line 427
    new-instance v0, Lc9/a0;

    .line 428
    .line 429
    invoke-direct {v0, v1, v3}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    invoke-static {v2, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    return-object v0
.end method

.method public static c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;
    .locals 4

    .line 1
    invoke-static {p0}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, Lc9/a;

    .line 22
    .line 23
    iget-object v3, v3, Lc9/a;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v3, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v1, v2

    .line 33
    :goto_0
    check-cast v1, Lc9/a;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    const-string p1, "\u804a\u5929\u5206\u7ec4\u4e0d\u5b58\u5728"

    .line 39
    .line 40
    invoke-static {p0, p1}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v2
.end method

.method public static d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/l;)V
    .locals 7

    .line 1
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lc9/v;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v2, v1}, Lc9/v;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, p1, p2}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    new-instance v0, Lc9/w;

    .line 18
    .line 19
    move-object v5, p0

    .line 20
    move-object v3, p1

    .line 21
    move-object v1, p3

    .line 22
    move-object v6, p4

    .line 23
    invoke-direct/range {v0 .. v6}, Lc9/w;-><init>(Lfg/l;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Lwb/kv;Landroid/app/Activity;Lfg/l;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lc9/b0;->b:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static e(Landroid/app/Activity;Ljava/lang/String;ZLaa/c;)V
    .locals 10

    .line 1
    invoke-static {p0, p1}, Lc9/b0;->a(Landroid/app/Activity;Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const-string p1, "\u5f53\u524d\u5206\u7ec4\u6ca1\u6709\u4f1a\u8bdd"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    const-string p1, "\u5f00\u542f\u6d88\u606f\u514d\u6253\u6270"

    .line 20
    .line 21
    :goto_0
    move-object v2, p1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string p1, "\u89e3\u9664\u6d88\u606f\u514d\u6253\u6270"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const-string v0, "\u5c06\u5bf9\u5f53\u524d\u5206\u7ec4\u53ca\u5b50\u5206\u7ec4\u5185 "

    .line 31
    .line 32
    const-string v1, " \u4e2a\u4f1a\u8bdd\u6267\u884c\u6b64\u64cd\u4f5c\u3002"

    .line 33
    .line 34
    invoke-static {p1, v0, v1}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    new-instance v0, Lc9/u;

    .line 39
    .line 40
    move-object v1, p0

    .line 41
    move v4, p2

    .line 42
    move-object v5, p3

    .line 43
    invoke-direct/range {v0 .. v5}, Lc9/u;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;ZLaa/c;)V

    .line 44
    .line 45
    .line 46
    new-instance v8, Lbi/c;

    .line 47
    .line 48
    const/4 p0, 0x6

    .line 49
    invoke-direct {v8, p0}, Lbi/c;-><init>(I)V

    .line 50
    .line 51
    .line 52
    sget-object v9, Lwb/lv;->j:Lwb/lv;

    .line 53
    .line 54
    move-object v7, v0

    .line 55
    move-object v4, v1

    .line 56
    move-object v5, v2

    .line 57
    invoke-static/range {v4 .. v9}, Lwb/y2;->S1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/a;Lwb/lv;)Lwb/kv;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static f(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLfg/l;)V
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v2, v1

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-static {p1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    const-string p1, "\u6ca1\u6709\u53ef\u9009\u62e9\u7684\u4f1a\u8bdd"

    .line 77
    .line 78
    invoke-static {p0, p1}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    invoke-direct {v5, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 89
    .line 90
    invoke-direct {v2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 91
    .line 92
    .line 93
    new-instance p1, Lc9/h;

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-direct {p1, v2, v5, v0}, Lc9/h;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 97
    .line 98
    .line 99
    const-string v0, "\u6b63\u5728\u8f7d\u5165\u4f1a\u8bdd..."

    .line 100
    .line 101
    invoke-static {p0, p1, p2, v0}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v0, Lc9/m;

    .line 106
    .line 107
    move-object v4, p0

    .line 108
    move-object v7, p2

    .line 109
    move-object v8, p3

    .line 110
    move v9, p4

    .line 111
    move-object v6, p5

    .line 112
    invoke-direct/range {v0 .. v9}, Lc9/m;-><init>(Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Ljava/util/concurrent/atomic/AtomicBoolean;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    sget-object p0, Lc9/b0;->b:Ljava/util/concurrent/ExecutorService;

    .line 116
    .line 117
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public static g(Landroid/app/Activity;Ljava/lang/String;Laa/c;)V
    .locals 13

    .line 1
    invoke-static {p0, p1}, Lc9/b0;->c(Landroid/app/Activity;Ljava/lang/String;)Lc9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_5

    .line 6
    .line 7
    invoke-static {p1}, Lc9/d2;->F(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, v0}, Ld9/o;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v6, v2, Lc9/a;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget-boolean v1, v2, Lc9/a;->g:Z

    .line 18
    .line 19
    const-string v3, "\u5df2\u5173\u95ed"

    .line 20
    .line 21
    const-string v4, "\u5df2\u5f00\u542f"

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    move-object v1, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v3

    .line 28
    :goto_0
    new-instance v7, Lsf/e;

    .line 29
    .line 30
    const-string v5, "\u4e3b\u9875\u7f6e\u9876"

    .line 31
    .line 32
    invoke-direct {v7, v5, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const-string v0, "\u5df2\u8bbe\u7f6e"

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string v0, "\u672a\u8bbe\u7f6e"

    .line 41
    .line 42
    :goto_1
    new-instance v8, Lsf/e;

    .line 43
    .line 44
    const-string v1, "\u81ea\u5b9a\u4e49\u5934\u50cf"

    .line 45
    .line 46
    invoke-direct {v8, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    new-instance v9, Lsf/e;

    .line 50
    .line 51
    const-string v0, "\u547d\u540d"

    .line 52
    .line 53
    invoke-direct {v9, v0, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-boolean v0, v2, Lc9/a;->i:Z

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    move-object v0, v4

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v0, v3

    .line 63
    :goto_2
    new-instance v10, Lsf/e;

    .line 64
    .line 65
    const-string v1, "\u663e\u793a\u672a\u8bfb\u6570\u5b57"

    .line 66
    .line 67
    invoke-direct {v10, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v0, v2, Lc9/a;->j:Z

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    move-object v0, v4

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    move-object v0, v3

    .line 77
    :goto_3
    new-instance v11, Lsf/e;

    .line 78
    .line 79
    const-string v1, "\u9884\u89c8\u6700\u65b0\u4e00\u6761\u6d88\u606f"

    .line 80
    .line 81
    invoke-direct {v11, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-boolean v0, v2, Lc9/a;->l:Z

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    move-object v3, v4

    .line 89
    :cond_4
    new-instance v12, Lsf/e;

    .line 90
    .line 91
    const-string v0, "\u663e\u793a\u65e0\u6d88\u606f"

    .line 92
    .line 93
    invoke-direct {v12, v0, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    filled-new-array/range {v7 .. v12}, [Lsf/e;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    new-instance v0, Lc9/n;

    .line 105
    .line 106
    const/4 v5, 0x1

    .line 107
    move-object v1, p0

    .line 108
    move-object v4, p1

    .line 109
    move-object v3, p2

    .line 110
    invoke-direct/range {v0 .. v5}, Lc9/n;-><init>(Landroid/app/Activity;Lc9/a;Laa/c;Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    new-instance v8, Lbi/c;

    .line 114
    .line 115
    const/4 p0, 0x6

    .line 116
    invoke-direct {v8, p0}, Lbi/c;-><init>(I)V

    .line 117
    .line 118
    .line 119
    const-string v4, "\u8bbe\u7f6e"

    .line 120
    .line 121
    move-object v3, v1

    .line 122
    move-object v5, v6

    .line 123
    move-object v6, v7

    .line 124
    move-object v7, v0

    .line 125
    invoke-static/range {v3 .. v8}, Lwb/y2;->W1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    return-void
.end method

.method public static h(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lc9/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lc9/b0;->a:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static i(Landroid/app/Activity;Lc9/y;)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lc9/y;->d:Z

    .line 2
    .line 3
    iget-object v1, p1, Lc9/y;->c:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "\u5931\u8d25"

    .line 8
    .line 9
    invoke-static {v1, p1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p1, Lc9/y;->a:I

    .line 15
    .line 16
    iget p1, p1, Lc9/y;->b:I

    .line 17
    .line 18
    const-string v2, "/"

    .line 19
    .line 20
    if-ne v0, p1, :cond_1

    .line 21
    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "\u5b8c\u6210: "

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, "\u90e8\u5206\u5b8c\u6210: "

    .line 58
    .line 59
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_0
    invoke-static {p0, p1}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static j(Landroid/app/Activity;Lc9/a;Lfg/a;)V
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lc9/o2;->u(Landroid/content/Context;Lc9/a;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v0, "\u8bbe\u7f6e\u5df2\u4fdd\u5b58"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "\u4fdd\u5b58\u8bbe\u7f6e\u5931\u8d25"

    .line 11
    .line 12
    :goto_0
    invoke-static {p0, v0}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method
