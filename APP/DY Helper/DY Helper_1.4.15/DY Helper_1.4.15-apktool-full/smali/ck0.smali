.class public abstract Lck0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lck0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    const-string v0, "@"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_f

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/16 v6, 0x2ee0

    .line 20
    .line 21
    if-lt v5, v6, :cond_1

    .line 22
    .line 23
    goto/16 :goto_f

    .line 24
    .line 25
    :cond_1
    instance-of v5, v1, Ljava/lang/CharSequence;

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v3, v0}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    instance-of v5, v1, Ljava/lang/Number;

    .line 38
    .line 39
    if-nez v5, :cond_1f

    .line 40
    .line 41
    instance-of v5, v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    if-nez v5, :cond_1f

    .line 44
    .line 45
    instance-of v5, v1, Ljava/lang/Enum;

    .line 46
    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    goto/16 :goto_10

    .line 50
    .line 51
    :cond_3
    invoke-interface {v4, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_4

    .line 56
    .line 57
    goto/16 :goto_f

    .line 58
    .line 59
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-static {v3, v7}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 v7, 0x0

    .line 71
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-nez v9, :cond_5

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v8, v0, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_5

    .line 94
    .line 95
    invoke-static {v3, v8}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    :catchall_0
    :cond_5
    const/4 v0, 0x3

    .line 99
    if-lt v2, v0, :cond_6

    .line 100
    .line 101
    goto/16 :goto_f

    .line 102
    .line 103
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const/16 v8, 0x1e

    .line 108
    .line 109
    const/4 v9, 0x1

    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    :try_start_1
    invoke-static {v1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    goto :goto_0

    .line 121
    :catchall_1
    move-exception v0

    .line 122
    new-instance v5, Leo1;

    .line 123
    .line 124
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    move-object v0, v5

    .line 128
    :goto_0
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    instance-of v6, v0, Leo1;

    .line 133
    .line 134
    if-eqz v6, :cond_7

    .line 135
    .line 136
    move-object v0, v5

    .line 137
    :cond_7
    check-cast v0, Ljava/lang/Number;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    :goto_1
    if-ge v7, v0, :cond_1e

    .line 148
    .line 149
    :try_start_2
    invoke-static {v1, v7}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    add-int/lit8 v6, v2, 0x1

    .line 154
    .line 155
    invoke-static {v5, v6, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 156
    .line 157
    .line 158
    :catchall_2
    add-int/lit8 v7, v7, 0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_8
    instance-of v0, v1, Ljava/util/Map;

    .line 162
    .line 163
    const/4 v10, 0x0

    .line 164
    if-eqz v0, :cond_b

    .line 165
    .line 166
    move-object v0, v1

    .line 167
    check-cast v0, Ljava/util/Map;

    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_1e

    .line 182
    .line 183
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Ljava/util/Map$Entry;

    .line 188
    .line 189
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    add-int/lit8 v6, v7, 0x1

    .line 198
    .line 199
    if-ge v7, v8, :cond_1e

    .line 200
    .line 201
    if-eqz v5, :cond_9

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    if-eqz v7, :cond_9

    .line 208
    .line 209
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 210
    .line 211
    invoke-static {v11, v7, v11}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    goto :goto_3

    .line 216
    :cond_9
    move-object v7, v10

    .line 217
    :goto_3
    if-nez v7, :cond_a

    .line 218
    .line 219
    const-string v7, ""

    .line 220
    .line 221
    :cond_a
    invoke-static {v3, v7, v1}, Lck0;->γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    add-int/lit8 v7, v2, 0x1

    .line 225
    .line 226
    invoke-static {v5, v7, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v1, v7, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V

    .line 230
    .line 231
    .line 232
    move v7, v6

    .line 233
    goto :goto_2

    .line 234
    :cond_b
    instance-of v0, v1, Ljava/lang/Iterable;

    .line 235
    .line 236
    if-eqz v0, :cond_c

    .line 237
    .line 238
    move-object v0, v1

    .line 239
    check-cast v0, Ljava/lang/Iterable;

    .line 240
    .line 241
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_1e

    .line 250
    .line 251
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    add-int/lit8 v5, v7, 0x1

    .line 256
    .line 257
    if-ge v7, v8, :cond_1e

    .line 258
    .line 259
    add-int/lit8 v6, v2, 0x1

    .line 260
    .line 261
    invoke-static {v1, v6, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V

    .line 262
    .line 263
    .line 264
    move v7, v5

    .line 265
    goto :goto_4

    .line 266
    :cond_c
    const-string v36, "getUserInfo"

    .line 267
    .line 268
    const-string v37, "getMember"

    .line 269
    .line 270
    const-string v11, "getConversationId"

    .line 271
    .line 272
    const-string v12, "getConversationShortId"

    .line 273
    .line 274
    const-string v13, "getShortId"

    .line 275
    .line 276
    const-string v14, "getConversationType"

    .line 277
    .line 278
    const-string v15, "getUnreadCount"

    .line 279
    .line 280
    const-string v16, "getName"

    .line 281
    .line 282
    const-string v17, "getTitle"

    .line 283
    .line 284
    const-string v18, "getConversationName"

    .line 285
    .line 286
    const-string v19, "getNickName"

    .line 287
    .line 288
    const-string v20, "getNickname"

    .line 289
    .line 290
    const-string v21, "getDisplayName"

    .line 291
    .line 292
    const-string v22, "getRemark"

    .line 293
    .line 294
    const-string v23, "getAlias"

    .line 295
    .line 296
    const-string v24, "getLabel"

    .line 297
    .line 298
    const-string v25, "getUid"

    .line 299
    .line 300
    const-string v26, "getUserId"

    .line 301
    .line 302
    const-string v27, "getSecUid"

    .line 303
    .line 304
    const-string v28, "getAuthorUid"

    .line 305
    .line 306
    const-string v29, "getAvatarUid"

    .line 307
    .line 308
    const-string v30, "getExt"

    .line 309
    .line 310
    const-string v31, "getLocalExt"

    .line 311
    .line 312
    const-string v32, "getExtra"

    .line 313
    .line 314
    const-string v33, "getCoreInfo"

    .line 315
    .line 316
    const-string v34, "getConversationCoreInfo"

    .line 317
    .line 318
    const-string v35, "getSingleChatFromUser"

    .line 319
    .line 320
    filled-new-array/range {v11 .. v37}, [Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    move v8, v7

    .line 325
    :goto_5
    const/16 v11, 0x1b

    .line 326
    .line 327
    if-ge v8, v11, :cond_12

    .line 328
    .line 329
    aget-object v11, v0, v8

    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 332
    .line 333
    .line 334
    move-result v12

    .line 335
    if-lt v12, v6, :cond_d

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_d
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    move-result-object v12

    .line 342
    invoke-virtual {v12}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    array-length v13, v12

    .line 350
    move v14, v7

    .line 351
    :goto_6
    if-ge v14, v13, :cond_f

    .line 352
    .line 353
    aget-object v15, v12, v14

    .line 354
    .line 355
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    invoke-static {v7, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    if-eqz v7, :cond_e

    .line 364
    .line 365
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    array-length v7, v7

    .line 373
    if-nez v7, :cond_e

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_e
    add-int/lit8 v14, v14, 0x1

    .line 377
    .line 378
    const/4 v7, 0x0

    .line 379
    goto :goto_6

    .line 380
    :cond_f
    move-object v15, v10

    .line 381
    :goto_7
    if-nez v15, :cond_10

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_10
    invoke-virtual {v15, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v15, v1, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    if-nez v7, :cond_11

    .line 392
    .line 393
    goto :goto_8

    .line 394
    :cond_11
    invoke-static {v3, v11}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-static {v3, v11, v7}, Lck0;->δ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    add-int/lit8 v11, v2, 0x1

    .line 401
    .line 402
    invoke-static {v7, v11, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 403
    .line 404
    .line 405
    :catchall_3
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 406
    .line 407
    const/4 v7, 0x0

    .line 408
    goto :goto_5

    .line 409
    :cond_12
    :goto_9
    invoke-static {v5}, Lck0;->η(Ljava/lang/Class;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-nez v0, :cond_13

    .line 414
    .line 415
    goto/16 :goto_f

    .line 416
    .line 417
    :cond_13
    const/4 v0, 0x0

    .line 418
    :goto_a
    if-eqz v5, :cond_1e

    .line 419
    .line 420
    const-class v7, Ljava/lang/Object;

    .line 421
    .line 422
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    if-nez v7, :cond_1e

    .line 427
    .line 428
    const/4 v7, 0x5

    .line 429
    if-ge v0, v7, :cond_1e

    .line 430
    .line 431
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    new-instance v8, Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 441
    .line 442
    .line 443
    array-length v10, v7

    .line 444
    const/4 v11, 0x0

    .line 445
    :goto_b
    if-ge v11, v10, :cond_15

    .line 446
    .line 447
    aget-object v12, v7, v11

    .line 448
    .line 449
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 450
    .line 451
    .line 452
    move-result v13

    .line 453
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 454
    .line 455
    .line 456
    move-result v13

    .line 457
    if-nez v13, :cond_14

    .line 458
    .line 459
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    :cond_14
    add-int/lit8 v11, v11, 0x1

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_15
    const/16 v7, 0x50

    .line 466
    .line 467
    invoke-static {v8, v7}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 472
    .line 473
    .line 474
    move-result-object v7

    .line 475
    :catchall_4
    :cond_16
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v8

    .line 479
    if-eqz v8, :cond_1d

    .line 480
    .line 481
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    check-cast v8, Ljava/lang/reflect/Field;

    .line 486
    .line 487
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    if-lt v10, v6, :cond_17

    .line 492
    .line 493
    goto :goto_f

    .line 494
    :cond_17
    :try_start_4
    invoke-virtual {v8, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v10

    .line 501
    if-nez v10, :cond_18

    .line 502
    .line 503
    goto :goto_c

    .line 504
    :cond_18
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v11

    .line 508
    invoke-static {v3, v11}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v8

    .line 515
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 519
    .line 520
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v8, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v8

    .line 527
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-static {v3, v8, v10}, Lck0;->γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    instance-of v8, v10, Ljava/lang/CharSequence;

    .line 534
    .line 535
    if-nez v8, :cond_1c

    .line 536
    .line 537
    instance-of v8, v10, Ljava/lang/Number;

    .line 538
    .line 539
    if-nez v8, :cond_1c

    .line 540
    .line 541
    instance-of v8, v10, Ljava/lang/Boolean;

    .line 542
    .line 543
    if-nez v8, :cond_1c

    .line 544
    .line 545
    instance-of v8, v10, Ljava/lang/Enum;

    .line 546
    .line 547
    if-eqz v8, :cond_19

    .line 548
    .line 549
    goto :goto_e

    .line 550
    :cond_19
    instance-of v8, v10, Ljava/util/Map;

    .line 551
    .line 552
    if-nez v8, :cond_1b

    .line 553
    .line 554
    instance-of v8, v10, Ljava/lang/Iterable;

    .line 555
    .line 556
    if-eqz v8, :cond_1a

    .line 557
    .line 558
    goto :goto_d

    .line 559
    :cond_1a
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    move-result-object v8

    .line 563
    invoke-static {v8}, Lck0;->η(Ljava/lang/Class;)Z

    .line 564
    .line 565
    .line 566
    move-result v8

    .line 567
    if-eqz v8, :cond_16

    .line 568
    .line 569
    add-int/lit8 v8, v2, 0x1

    .line 570
    .line 571
    invoke-static {v10, v8, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V

    .line 572
    .line 573
    .line 574
    goto :goto_c

    .line 575
    :cond_1b
    :goto_d
    add-int/lit8 v8, v2, 0x1

    .line 576
    .line 577
    invoke-static {v10, v8, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V

    .line 578
    .line 579
    .line 580
    goto :goto_c

    .line 581
    :cond_1c
    :goto_e
    add-int/lit8 v8, v2, 0x1

    .line 582
    .line 583
    invoke-static {v10, v8, v3, v4}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 584
    .line 585
    .line 586
    goto :goto_c

    .line 587
    :cond_1d
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    move-result-object v5

    .line 591
    add-int/lit8 v0, v0, 0x1

    .line 592
    .line 593
    goto/16 :goto_a

    .line 594
    .line 595
    :cond_1e
    :goto_f
    return-void

    .line 596
    :cond_1f
    :goto_10
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-static {v3, v0}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    return-void
.end method

.method public static β(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x2ee0

    .line 15
    .line 16
    if-lt v0, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/16 v0, 0x20

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/16 v1, 0x12c

    .line 29
    .line 30
    if-le v0, v1, :cond_2

    .line 31
    .line 32
    invoke-static {p1, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    :cond_3
    :goto_0
    return-void
.end method

.method public static γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    instance-of v0, p2, Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    instance-of v0, p2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    instance-of v0, p2, Ljava/lang/Enum;

    .line 41
    .line 42
    if-eqz v0, :cond_a

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Enum;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    :goto_0
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :cond_4
    const-string v0, "conversation"

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const-string v2, "id"

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    invoke-static {p1, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    const-string p1, "cid:"

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_5
    const-string v0, "short"

    .line 94
    .line 95
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    invoke-static {p1, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    const-string p1, "short:"

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_6
    const-string v0, "uid"

    .line 118
    .line 119
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_9

    .line 124
    .line 125
    const-string v0, "user_id"

    .line 126
    .line 127
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_9

    .line 132
    .line 133
    const-string v0, "userid"

    .line 134
    .line 135
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_7
    const-string v0, "name"

    .line 143
    .line 144
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_8

    .line 149
    .line 150
    const-string v0, "nick"

    .line 151
    .line 152
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_8

    .line 157
    .line 158
    const-string v0, "remark"

    .line 159
    .line 160
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_8

    .line 165
    .line 166
    const-string v0, "alias"

    .line 167
    .line 168
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_8

    .line 173
    .line 174
    const-string v0, "title"

    .line 175
    .line 176
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_a

    .line 181
    .line 182
    :cond_8
    const-string p1, "name:"

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_9
    :goto_1
    const-string p1, "uid:"

    .line 193
    .line 194
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_a
    :goto_2
    return-void
.end method

.method public static δ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p2, Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    instance-of v0, p2, Ljava/lang/Number;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p2, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    instance-of v0, p2, Ljava/lang/Enum;

    .line 37
    .line 38
    if-eqz v0, :cond_b

    .line 39
    .line 40
    check-cast p2, Ljava/lang/Enum;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    :goto_0
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_3
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 63
    .line 64
    invoke-static {v0, p1, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v0, "conversationid"

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_a

    .line 76
    .line 77
    const-string v0, "getconversationid"

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :cond_4
    const-string v0, "conversationshortid"

    .line 88
    .line 89
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_9

    .line 94
    .line 95
    const-string v0, "shortid"

    .line 96
    .line 97
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    const-string v0, "uid"

    .line 105
    .line 106
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_8

    .line 111
    .line 112
    const-string v0, "userid"

    .line 113
    .line 114
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    const-string v0, "user_id"

    .line 121
    .line 122
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_6

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    const-string v0, "name"

    .line 130
    .line 131
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_7

    .line 136
    .line 137
    const-string v0, "nick"

    .line 138
    .line 139
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_7

    .line 144
    .line 145
    const-string v0, "remark"

    .line 146
    .line 147
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_7

    .line 152
    .line 153
    const-string v0, "alias"

    .line 154
    .line 155
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_7

    .line 160
    .line 161
    const-string v0, "title"

    .line 162
    .line 163
    invoke-static {p1, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_b

    .line 168
    .line 169
    :cond_7
    const-string p1, "name:"

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_8
    :goto_1
    const-string p1, "uid:"

    .line 180
    .line 181
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_9
    :goto_2
    const-string p1, "short:"

    .line 190
    .line 191
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_a
    :goto_3
    const-string p1, "cid:"

    .line 200
    .line 201
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const-string p1, "conversationid:"

    .line 209
    .line 210
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-static {p0, p1}, Lck0;->β(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :cond_b
    :goto_4
    return-void
.end method

.method public static ε(Ljava/lang/Object;Ljava/util/Set;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 22
    .line 23
    if-nez v1, :cond_5

    .line 24
    .line 25
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-nez v1, :cond_5

    .line 28
    .line 29
    instance-of v1, p0, Ljava/lang/Enum;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    sget-object v3, Lck0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    move-object p0, v2

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    new-instance v2, Ljava/util/IdentityHashMap;

    .line 55
    .line 56
    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0, v4, v2}, Lck0;->α(Ljava/lang/Object;ILjava/lang/StringBuilder;Ljava/util/Set;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    const/16 v4, 0x320

    .line 83
    .line 84
    if-le v2, v4, :cond_4

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v3, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_1
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 102
    .line 103
    invoke-static {v1, p0, v1}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    check-cast p1, Ljava/lang/Iterable;

    .line 115
    .line 116
    instance-of v1, p1, Ljava/util/Collection;

    .line 117
    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    move-object v1, p1

    .line 121
    check-cast v1, Ljava/util/Collection;

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_7

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_9

    .line 139
    .line 140
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_8

    .line 151
    .line 152
    invoke-static {p0, v1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_8

    .line 157
    .line 158
    const/4 p0, 0x1

    .line 159
    return p0

    .line 160
    :cond_9
    :goto_2
    return v0
.end method

.method public static ζ(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    const-string v0, "\r"

    .line 2
    .line 3
    const-string v1, "\n"

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x5

    .line 10
    new-array v0, v0, [C

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x6

    .line 17
    invoke-static {p0, v0, v1, v2}, Lq02;->с(Ljava/lang/String;[CII)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v1, 0xa

    .line 24
    .line 25
    invoke-static {p0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v2, "#"

    .line 52
    .line 53
    invoke-static {v1, v2, v1}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v2, v1

    .line 101
    check-cast v2, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_1

    .line 108
    .line 109
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    invoke-static {p0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :array_0
    .array-data 2
        0xas
        0x2cs
        0x3bs
        -0xf4s
        -0xe5s
    .end array-data
.end method

.method public static η(Ljava/lang/Class;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "java.lang."

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "java.util."

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const-class v1, Ljava/util/Map;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    const-class v1, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-string p0, "~79AD51ECDCE0892D97569325DF07"

    .line 41
    .line 42
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v0, p0, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_3

    .line 51
    .line 52
    const-string p0, "~79A9CCFE43C6F630EAFE1170674919"

    .line 53
    .line 54
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {v0, p0, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez p0, :cond_3

    .line 63
    .line 64
    const-string p0, "X."

    .line 65
    .line 66
    invoke-static {v0, p0, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_3

    .line 71
    .line 72
    const-string p0, "kotlin."

    .line 73
    .line 74
    invoke-static {v0, p0, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    :goto_0
    return v2

    .line 82
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 83
    return p0
.end method
