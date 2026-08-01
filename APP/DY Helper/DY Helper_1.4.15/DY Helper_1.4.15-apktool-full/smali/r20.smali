.class public final synthetic Lr20;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr20;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lr20;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final β()Ljava/lang/Object;
    .locals 18

    .line 1
    sget-object v2, Lf01;->α:Lf01;

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    iget-object v1, v0, Lr20;->ζ:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lf01;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    invoke-virtual {v0, v8, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1c

    .line 21
    .line 22
    :cond_0
    const-string v0, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654A1A43A865BA113B69A131136202342FD5D6812BE2CB147B1C77B0708E61CA59B"

    .line 23
    .line 24
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, v8, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    array-length v3, v0

    .line 43
    move v5, v8

    .line 44
    move v6, v5

    .line 45
    const/4 v7, 0x0

    .line 46
    :goto_0
    const/4 v10, 0x2

    .line 47
    const-class v11, Ljava/util/List;

    .line 48
    .line 49
    sget-object v12, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ge v5, v3, :cond_3

    .line 52
    .line 53
    aget-object v13, v0, v5

    .line 54
    .line 55
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    if-nez v14, :cond_2

    .line 64
    .line 65
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    if-eqz v14, :cond_2

    .line 74
    .line 75
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 76
    .line 77
    .line 78
    move-result v14

    .line 79
    if-nez v14, :cond_2

    .line 80
    .line 81
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    if-nez v14, :cond_2

    .line 86
    .line 87
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    invoke-static {v14, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    if-eqz v14, :cond_2

    .line 96
    .line 97
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    array-length v14, v14

    .line 102
    const/4 v15, 0x4

    .line 103
    if-ne v14, v15, :cond_2

    .line 104
    .line 105
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    aget-object v14, v14, v8

    .line 110
    .line 111
    invoke-virtual {v11, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-eqz v14, :cond_2

    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    aget-object v14, v14, v9

    .line 122
    .line 123
    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 124
    .line 125
    invoke-static {v14, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    if-eqz v14, :cond_2

    .line 130
    .line 131
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    aget-object v14, v14, v10

    .line 136
    .line 137
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 138
    .line 139
    invoke-static {v14, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    if-eqz v14, :cond_2

    .line 144
    .line 145
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    const/4 v15, 0x3

    .line 150
    aget-object v14, v14, v15

    .line 151
    .line 152
    const-class v15, Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v14, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    if-eqz v14, :cond_2

    .line 159
    .line 160
    if-eqz v6, :cond_1

    .line 161
    .line 162
    :goto_1
    const/4 v7, 0x0

    .line 163
    goto :goto_2

    .line 164
    :cond_1
    move v6, v9

    .line 165
    move-object v7, v13

    .line 166
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_3
    if-nez v6, :cond_4

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_4
    :goto_2
    if-eqz v7, :cond_25

    .line 173
    .line 174
    invoke-virtual {v7, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 175
    .line 176
    .line 177
    const-string v0, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620E3A3A1D1AE4984B0130504FE636AADD1ED8EE6AA121D6AFA1339BC461EA309AE889F"

    .line 178
    .line 179
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const-string v3, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B6C0A72FA07773D416EAB18344453BCB2FDEB9DC152E1B796D8F9C834EA89AE768FDFFD34619A8965D78C34830911F0322968"

    .line 184
    .line 185
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const-string v5, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E111C1B4BB7F14343F5C6CD5FDD30A372798B4288A83191C624025628F15585AEF37BDE93DDE9B58FB6F6F29F55"

    .line 190
    .line 191
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    filled-new-array {v0, v3, v5}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    new-instance v3, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_d

    .line 217
    .line 218
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Ljava/lang/String;

    .line 223
    .line 224
    :try_start_0
    invoke-static {v0, v8, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :catchall_0
    move-exception v0

    .line 233
    new-instance v6, Leo1;

    .line 234
    .line 235
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    move-object v0, v6

    .line 239
    :goto_4
    instance-of v6, v0, Leo1;

    .line 240
    .line 241
    if-eqz v6, :cond_5

    .line 242
    .line 243
    const/4 v0, 0x0

    .line 244
    :cond_5
    check-cast v0, Ljava/lang/Class;

    .line 245
    .line 246
    if-eqz v0, :cond_b

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    array-length v6, v0

    .line 256
    move v13, v8

    .line 257
    move v14, v13

    .line 258
    const/4 v15, 0x0

    .line 259
    :goto_5
    if-ge v13, v6, :cond_8

    .line 260
    .line 261
    aget-object v16, v0, v13

    .line 262
    .line 263
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 264
    .line 265
    .line 266
    move-result v17

    .line 267
    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 268
    .line 269
    .line 270
    move-result v17

    .line 271
    if-nez v17, :cond_7

    .line 272
    .line 273
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 274
    .line 275
    .line 276
    move-result v17

    .line 277
    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 278
    .line 279
    .line 280
    move-result v17

    .line 281
    if-nez v17, :cond_7

    .line 282
    .line 283
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 284
    .line 285
    .line 286
    move-result v17

    .line 287
    if-nez v17, :cond_7

    .line 288
    .line 289
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 290
    .line 291
    .line 292
    move-result v17

    .line 293
    if-nez v17, :cond_7

    .line 294
    .line 295
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-static {v4, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_7

    .line 308
    .line 309
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    invoke-static {v4, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-eqz v4, :cond_7

    .line 322
    .line 323
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v10

    .line 331
    invoke-static {v4, v10}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    if-eqz v4, :cond_7

    .line 336
    .line 337
    if-eqz v14, :cond_6

    .line 338
    .line 339
    :goto_6
    const/4 v15, 0x0

    .line 340
    goto :goto_7

    .line 341
    :cond_6
    move v14, v9

    .line 342
    move-object/from16 v15, v16

    .line 343
    .line 344
    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 345
    .line 346
    const/4 v10, 0x2

    .line 347
    goto :goto_5

    .line 348
    :cond_8
    if-nez v14, :cond_9

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_9
    :goto_7
    if-nez v15, :cond_a

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_a
    invoke-virtual {v15, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 355
    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_b
    :goto_8
    const/4 v15, 0x0

    .line 359
    :goto_9
    if-eqz v15, :cond_c

    .line 360
    .line 361
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    :cond_c
    const/4 v10, 0x2

    .line 365
    goto/16 :goto_3

    .line 366
    .line 367
    :cond_d
    invoke-static {v3}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    const-string v0, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E111C1B4BB7F14343F5C6CD5FDD30A372798B4288A83191C624025628F15595A8E552FC96C7F391A7B8E1EF9915"

    .line 376
    .line 377
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    :try_start_1
    invoke-static {v0, v8, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 386
    .line 387
    .line 388
    goto :goto_a

    .line 389
    :catchall_1
    move-exception v0

    .line 390
    new-instance v1, Leo1;

    .line 391
    .line 392
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    move-object v0, v1

    .line 396
    :goto_a
    instance-of v1, v0, Leo1;

    .line 397
    .line 398
    if-eqz v1, :cond_e

    .line 399
    .line 400
    const/4 v0, 0x0

    .line 401
    :cond_e
    check-cast v0, Ljava/lang/Class;

    .line 402
    .line 403
    if-eqz v0, :cond_1e

    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    array-length v3, v1

    .line 413
    move v4, v8

    .line 414
    move v5, v4

    .line 415
    const/4 v6, 0x0

    .line 416
    :goto_b
    if-ge v4, v3, :cond_11

    .line 417
    .line 418
    aget-object v7, v1, v4

    .line 419
    .line 420
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 421
    .line 422
    .line 423
    move-result v13

    .line 424
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 425
    .line 426
    .line 427
    move-result v13

    .line 428
    if-nez v13, :cond_10

    .line 429
    .line 430
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    move-result-object v13

    .line 434
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v13

    .line 438
    const-string v14, "androidx.recyclerview.widget.AsyncListDiffer"

    .line 439
    .line 440
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v13

    .line 444
    if-eqz v13, :cond_10

    .line 445
    .line 446
    if-eqz v5, :cond_f

    .line 447
    .line 448
    :goto_c
    const/4 v6, 0x0

    .line 449
    goto :goto_d

    .line 450
    :cond_f
    move-object v6, v7

    .line 451
    move v5, v9

    .line 452
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_11
    if-nez v5, :cond_12

    .line 456
    .line 457
    goto :goto_c

    .line 458
    :cond_12
    :goto_d
    if-nez v6, :cond_13

    .line 459
    .line 460
    :goto_e
    const/4 v4, 0x0

    .line 461
    goto/16 :goto_14

    .line 462
    .line 463
    :cond_13
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance v3, Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 477
    .line 478
    .line 479
    array-length v4, v1

    .line 480
    move v5, v8

    .line 481
    :goto_f
    if-ge v5, v4, :cond_18

    .line 482
    .line 483
    aget-object v7, v1, v5

    .line 484
    .line 485
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 486
    .line 487
    .line 488
    move-result v13

    .line 489
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 490
    .line 491
    .line 492
    move-result v13

    .line 493
    if-nez v13, :cond_14

    .line 494
    .line 495
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 496
    .line 497
    .line 498
    move-result v13

    .line 499
    if-nez v13, :cond_14

    .line 500
    .line 501
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 502
    .line 503
    .line 504
    move-result v13

    .line 505
    if-nez v13, :cond_14

    .line 506
    .line 507
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    move-result-object v13

    .line 511
    invoke-static {v13, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v13

    .line 515
    if-eqz v13, :cond_14

    .line 516
    .line 517
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    move-result-object v13

    .line 521
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    array-length v13, v13

    .line 525
    if-nez v13, :cond_15

    .line 526
    .line 527
    :cond_14
    const/4 v14, 0x2

    .line 528
    goto :goto_10

    .line 529
    :cond_15
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object v13

    .line 533
    array-length v13, v13

    .line 534
    const/4 v14, 0x2

    .line 535
    if-gt v13, v14, :cond_17

    .line 536
    .line 537
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    move-result-object v13

    .line 541
    aget-object v13, v13, v8

    .line 542
    .line 543
    invoke-virtual {v11, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 544
    .line 545
    .line 546
    move-result v13

    .line 547
    if-eqz v13, :cond_17

    .line 548
    .line 549
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    array-length v13, v13

    .line 554
    if-eq v13, v9, :cond_16

    .line 555
    .line 556
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    move-result-object v13

    .line 560
    aget-object v13, v13, v9

    .line 561
    .line 562
    const-class v15, Ljava/lang/Runnable;

    .line 563
    .line 564
    invoke-virtual {v15, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 565
    .line 566
    .line 567
    move-result v13

    .line 568
    if-eqz v13, :cond_17

    .line 569
    .line 570
    :cond_16
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    :cond_17
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 574
    .line 575
    goto :goto_f

    .line 576
    :cond_18
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-eqz v1, :cond_19

    .line 581
    .line 582
    goto :goto_e

    .line 583
    :cond_19
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    new-instance v4, Ljava/util/ArrayList;

    .line 591
    .line 592
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 593
    .line 594
    .line 595
    array-length v5, v1

    .line 596
    move v7, v8

    .line 597
    :goto_11
    if-ge v7, v5, :cond_1b

    .line 598
    .line 599
    aget-object v11, v1, v7

    .line 600
    .line 601
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 602
    .line 603
    .line 604
    move-result v13

    .line 605
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 606
    .line 607
    .line 608
    move-result v13

    .line 609
    if-nez v13, :cond_1a

    .line 610
    .line 611
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 612
    .line 613
    .line 614
    move-result v13

    .line 615
    if-nez v13, :cond_1a

    .line 616
    .line 617
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 618
    .line 619
    .line 620
    move-result v13

    .line 621
    if-nez v13, :cond_1a

    .line 622
    .line 623
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    move-result-object v13

    .line 627
    invoke-static {v13, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v13

    .line 631
    if-eqz v13, :cond_1a

    .line 632
    .line 633
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    move-result-object v13

    .line 637
    array-length v13, v13

    .line 638
    if-ne v13, v9, :cond_1a

    .line 639
    .line 640
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    move-result-object v13

    .line 644
    aget-object v13, v13, v8

    .line 645
    .line 646
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v13

    .line 650
    const-string v14, "androidx.recyclerview.widget.RecyclerView"

    .line 651
    .line 652
    invoke-virtual {v13, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v13

    .line 656
    if-eqz v13, :cond_1a

    .line 657
    .line 658
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    :cond_1a
    add-int/lit8 v7, v7, 0x1

    .line 662
    .line 663
    goto :goto_11

    .line 664
    :cond_1b
    invoke-virtual {v6, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    if-eqz v5, :cond_1c

    .line 676
    .line 677
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    check-cast v5, Ljava/lang/reflect/Method;

    .line 682
    .line 683
    invoke-virtual {v5, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 684
    .line 685
    .line 686
    goto :goto_12

    .line 687
    :cond_1c
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    if-eqz v5, :cond_1d

    .line 696
    .line 697
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    check-cast v5, Ljava/lang/reflect/Method;

    .line 702
    .line 703
    invoke-virtual {v5, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 704
    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_1d
    new-instance v1, Lde0;

    .line 708
    .line 709
    invoke-direct {v1, v0, v6, v4, v3}, Lde0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 710
    .line 711
    .line 712
    move-object v4, v1

    .line 713
    :goto_14
    move-object v11, v4

    .line 714
    goto :goto_15

    .line 715
    :cond_1e
    const/4 v11, 0x0

    .line 716
    :goto_15
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-eqz v0, :cond_20

    .line 721
    .line 722
    if-eqz v11, :cond_1f

    .line 723
    .line 724
    goto :goto_17

    .line 725
    :cond_1f
    const-string v0, "\u672a\u627e\u5230\u6d88\u606f\u9876\u90e8\u72b6\u6001\u8054\u7cfb\u4eba\u63d0\u4ea4\u5165\u53e3"

    .line 726
    .line 727
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    :goto_16
    const/4 v0, 0x0

    .line 731
    return-object v0

    .line 732
    :cond_20
    :goto_17
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v1

    .line 740
    if-eqz v1, :cond_21

    .line 741
    .line 742
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    check-cast v1, Ljava/lang/reflect/Method;

    .line 747
    .line 748
    sget-object v3, Lxq0;->α:Lxq0;

    .line 749
    .line 750
    new-instance v4, Lxe;

    .line 751
    .line 752
    const/16 v5, 0x9

    .line 753
    .line 754
    const/4 v6, 0x0

    .line 755
    invoke-direct {v4, v1, v5, v6}, Lxe;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v3, v1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 759
    .line 760
    .line 761
    goto :goto_18

    .line 762
    :cond_21
    if-eqz v11, :cond_23

    .line 763
    .line 764
    sget-object v0, Lxq0;->α:Lxq0;

    .line 765
    .line 766
    iget-object v1, v11, Lde0;->α:Ljava/lang/Class;

    .line 767
    .line 768
    new-instance v3, Le01;

    .line 769
    .line 770
    const/4 v4, 0x0

    .line 771
    invoke-direct {v3, v11, v4}, Le01;-><init>(Lde0;I)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0, v1, v3}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 775
    .line 776
    .line 777
    iget-object v0, v11, Lde0;->γ:Ljava/util/ArrayList;

    .line 778
    .line 779
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    if-eqz v1, :cond_22

    .line 788
    .line 789
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    check-cast v1, Ljava/lang/reflect/Method;

    .line 794
    .line 795
    sget-object v3, Lxq0;->α:Lxq0;

    .line 796
    .line 797
    new-instance v4, Le01;

    .line 798
    .line 799
    const/4 v5, 0x1

    .line 800
    invoke-direct {v4, v11, v5}, Le01;-><init>(Lde0;I)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v3, v1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 804
    .line 805
    .line 806
    goto :goto_19

    .line 807
    :cond_22
    iget-object v0, v11, Lde0;->δ:Ljava/util/ArrayList;

    .line 808
    .line 809
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 814
    .line 815
    .line 816
    move-result v1

    .line 817
    if-eqz v1, :cond_23

    .line 818
    .line 819
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    check-cast v1, Ljava/lang/reflect/Method;

    .line 824
    .line 825
    sget-object v3, Lxq0;->α:Lxq0;

    .line 826
    .line 827
    new-instance v4, Lxe;

    .line 828
    .line 829
    const/16 v5, 0x8

    .line 830
    .line 831
    const/4 v6, 0x0

    .line 832
    invoke-direct {v4, v1, v5, v6}, Lxe;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v3, v1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 836
    .line 837
    .line 838
    goto :goto_1a

    .line 839
    :cond_23
    sget-object v12, Lbe0;->α:Lbe0;

    .line 840
    .line 841
    new-instance v0, Lw0;

    .line 842
    .line 843
    const/4 v6, 0x0

    .line 844
    const/4 v7, 0x6

    .line 845
    const/4 v1, 0x0

    .line 846
    const-class v3, Lf01;

    .line 847
    .line 848
    const-string v4, "refreshActiveLists"

    .line 849
    .line 850
    const-string v5, "refreshActiveLists()V"

    .line 851
    .line 852
    invoke-direct/range {v0 .. v7}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v12}, Lbe0;->ε()V

    .line 856
    .line 857
    .line 858
    sget-object v1, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 859
    .line 860
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-nez v11, :cond_24

    .line 868
    .line 869
    goto :goto_1b

    .line 870
    :cond_24
    move v8, v9

    .line 871
    :goto_1b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 872
    .line 873
    const-string v2, "installed legacy="

    .line 874
    .line 875
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    .line 881
    const-string v0, " refactor="

    .line 882
    .line 883
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 887
    .line 888
    .line 889
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    const-string v1, "rd1fe9f51c470bd02"

    .line 894
    .line 895
    invoke-static {v1, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    :goto_1c
    sget-object v0, Ls62;->α:Ls62;

    .line 899
    .line 900
    return-object v0

    .line 901
    :cond_25
    const-string v0, "\u672a\u627e\u5230\u552f\u4e00\u6d88\u606f\u9876\u90e8\u72b6\u6001\u63d0\u4ea4\u5951\u7ea6"

    .line 902
    .line 903
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    goto/16 :goto_16
.end method

.method private final γ()Ljava/lang/Object;
    .locals 18

    .line 1
    sget-object v0, Lc72;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    iget-object v0, v0, Lr20;->ζ:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v1, Lc72;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sget-object v4, Ls62;->α:Ls62;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    const-string v1, "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A212389359066D1B172F00485F222B90469CED248BF09C5C325293750AB1B2C2D95917FE2E821077EB3883B4360DCF5CCF9A7D0B8"

    .line 24
    .line 25
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v5, "~78AF64D165955DDE117C70B1E9A06054CFEF62BE1AC901EDEBA85E74FF9FAA32CC75A2F95CA3A5370AE3B02D480FB09CCD293109FD34B708C5136502B2CCACA3D7315477E30BA7256FF9626599C7"

    .line 34
    .line 35
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v0, v5}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    filled-new-array {v1, v5}, [Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v5, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Ljava/lang/Class;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v6}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-instance v7, Lzb0;

    .line 84
    .line 85
    const/16 v8, 0x13

    .line 86
    .line 87
    invoke-direct {v7, v8}, Lzb0;-><init>(I)V

    .line 88
    .line 89
    .line 90
    new-instance v8, Ly30;

    .line 91
    .line 92
    invoke-direct {v8, v6, v2, v7}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 93
    .line 94
    .line 95
    new-instance v6, Lzb0;

    .line 96
    .line 97
    const/16 v7, 0x14

    .line 98
    .line 99
    invoke-direct {v6, v7}, Lzb0;-><init>(I)V

    .line 100
    .line 101
    .line 102
    new-instance v7, Ly30;

    .line 103
    .line 104
    invoke-direct {v7, v8, v3, v6}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 105
    .line 106
    .line 107
    new-instance v6, Lzb0;

    .line 108
    .line 109
    const/16 v8, 0x15

    .line 110
    .line 111
    invoke-direct {v6, v8}, Lzb0;-><init>(I)V

    .line 112
    .line 113
    .line 114
    new-instance v8, Lt52;

    .line 115
    .line 116
    invoke-direct {v8, v7, v6}, Lt52;-><init>(Lss1;La80;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v8}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-static {v5, v6}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    invoke-static {v5}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance v5, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    const-class v7, Ljava/util/List;

    .line 149
    .line 150
    if-eqz v6, :cond_4

    .line 151
    .line 152
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Ljava/lang/Class;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v8, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    array-length v9, v6

    .line 171
    move v10, v2

    .line 172
    :goto_2
    if-ge v10, v9, :cond_3

    .line 173
    .line 174
    aget-object v11, v6, v10

    .line 175
    .line 176
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-nez v12, :cond_2

    .line 185
    .line 186
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    if-nez v12, :cond_2

    .line 191
    .line 192
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    if-nez v12, :cond_2

    .line 197
    .line 198
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    array-length v12, v12

    .line 206
    if-nez v12, :cond_2

    .line 207
    .line 208
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    invoke-virtual {v7, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-eqz v12, :cond_2

    .line 217
    .line 218
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_3
    invoke-static {v5, v8}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-eqz v6, :cond_5

    .line 237
    .line 238
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    check-cast v6, Ljava/lang/reflect/Method;

    .line 243
    .line 244
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_5
    new-instance v1, Ljava/util/HashSet;

    .line 249
    .line 250
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 251
    .line 252
    .line 253
    new-instance v6, Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    :cond_6
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    if-eqz v8, :cond_7

    .line 267
    .line 268
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    move-object v9, v8

    .line 273
    check-cast v9, Ljava/lang/reflect/Method;

    .line 274
    .line 275
    invoke-static {v9}, Lxb;->Ο(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    if-eqz v9, :cond_6

    .line 284
    .line 285
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_7
    const-string v1, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EAAFA1C1A05884F0130B0EF37A70ADCFAAAEF7E5341172E00E30A7691F8E16BD848E"

    .line 290
    .line 291
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-static {v0, v1}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-eqz v1, :cond_b

    .line 300
    .line 301
    new-instance v8, Ljava/util/ArrayList;

    .line 302
    .line 303
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 304
    .line 305
    .line 306
    move-object v9, v1

    .line 307
    :goto_5
    if-eqz v9, :cond_8

    .line 308
    .line 309
    const-class v10, Ljava/lang/Object;

    .line 310
    .line 311
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    if-nez v10, :cond_8

    .line 316
    .line 317
    invoke-static {v9}, Lxb;->Β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    invoke-static {v8, v10}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    goto :goto_5

    .line 329
    :cond_8
    new-instance v9, Ljava/util/HashSet;

    .line 330
    .line 331
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 332
    .line 333
    .line 334
    new-instance v10, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    :cond_9
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    if-eqz v11, :cond_a

    .line 348
    .line 349
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    move-object v12, v11

    .line 354
    check-cast v12, Ljava/lang/reflect/Method;

    .line 355
    .line 356
    invoke-static {v12}, Lxb;->Ο(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-virtual {v9, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    if-eqz v12, :cond_9

    .line 365
    .line 366
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_a
    new-instance v8, Ljava/util/ArrayList;

    .line 371
    .line 372
    const/16 v9, 0xa

    .line 373
    .line 374
    invoke-static {v10, v9}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    if-eqz v10, :cond_c

    .line 390
    .line 391
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    check-cast v10, Ljava/lang/reflect/Method;

    .line 396
    .line 397
    new-instance v11, Lfe0;

    .line 398
    .line 399
    invoke-direct {v11, v1, v10}, Lfe0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_b
    const/4 v8, 0x0

    .line 407
    :cond_c
    sget-object v1, Ljz;->ε:Ljz;

    .line 408
    .line 409
    if-nez v8, :cond_d

    .line 410
    .line 411
    move-object v8, v1

    .line 412
    :cond_d
    const-string v9, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B73EB2FC055B4FF3BF52343C3E41D4B71FE679E18DDCFF5097664554D1C21787EB"

    .line 413
    .line 414
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    invoke-static {v0, v9}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    sget-object v10, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 423
    .line 424
    if-eqz v9, :cond_15

    .line 425
    .line 426
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 427
    .line 428
    .line 429
    move-result-object v11

    .line 430
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    array-length v12, v11

    .line 434
    move v13, v2

    .line 435
    move v14, v13

    .line 436
    const/4 v15, 0x0

    .line 437
    :goto_8
    if-ge v13, v12, :cond_12

    .line 438
    .line 439
    aget-object v16, v11, v13

    .line 440
    .line 441
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 442
    .line 443
    .line 444
    move-result v17

    .line 445
    invoke-static/range {v17 .. v17}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 446
    .line 447
    .line 448
    move-result v17

    .line 449
    if-nez v17, :cond_10

    .line 450
    .line 451
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 452
    .line 453
    .line 454
    move-result v17

    .line 455
    if-nez v17, :cond_10

    .line 456
    .line 457
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 458
    .line 459
    .line 460
    move-result v17

    .line 461
    if-nez v17, :cond_10

    .line 462
    .line 463
    const/16 p0, 0x0

    .line 464
    .line 465
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    invoke-static {v5, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-eqz v5, :cond_f

    .line 474
    .line 475
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    array-length v5, v5

    .line 480
    move/from16 v17, v2

    .line 481
    .line 482
    const/4 v2, 0x2

    .line 483
    if-ne v5, v2, :cond_11

    .line 484
    .line 485
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    aget-object v2, v2, v17

    .line 490
    .line 491
    const-class v5, Ljava/lang/String;

    .line 492
    .line 493
    invoke-static {v2, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-eqz v2, :cond_11

    .line 498
    .line 499
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    aget-object v2, v2, v3

    .line 504
    .line 505
    invoke-virtual {v7, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eqz v2, :cond_11

    .line 510
    .line 511
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    aget-object v2, v2, v3

    .line 516
    .line 517
    const-class v5, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-eqz v2, :cond_11

    .line 524
    .line 525
    if-eqz v14, :cond_e

    .line 526
    .line 527
    :goto_9
    move-object/from16 v15, p0

    .line 528
    .line 529
    goto :goto_b

    .line 530
    :cond_e
    move v14, v3

    .line 531
    move-object/from16 v15, v16

    .line 532
    .line 533
    goto :goto_a

    .line 534
    :cond_f
    move/from16 v17, v2

    .line 535
    .line 536
    goto :goto_a

    .line 537
    :cond_10
    move/from16 v17, v2

    .line 538
    .line 539
    const/16 p0, 0x0

    .line 540
    .line 541
    :cond_11
    :goto_a
    add-int/lit8 v13, v13, 0x1

    .line 542
    .line 543
    move/from16 v2, v17

    .line 544
    .line 545
    goto :goto_8

    .line 546
    :cond_12
    move/from16 v17, v2

    .line 547
    .line 548
    const/16 p0, 0x0

    .line 549
    .line 550
    if-nez v14, :cond_13

    .line 551
    .line 552
    goto :goto_9

    .line 553
    :cond_13
    :goto_b
    if-nez v15, :cond_14

    .line 554
    .line 555
    move-object/from16 v2, p0

    .line 556
    .line 557
    goto :goto_c

    .line 558
    :cond_14
    invoke-virtual {v15, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 559
    .line 560
    .line 561
    new-instance v2, Lfe0;

    .line 562
    .line 563
    invoke-direct {v2, v9, v15}, Lfe0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 564
    .line 565
    .line 566
    :goto_c
    if-eqz v2, :cond_16

    .line 567
    .line 568
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    goto :goto_d

    .line 573
    :cond_15
    move/from16 v17, v2

    .line 574
    .line 575
    const/16 p0, 0x0

    .line 576
    .line 577
    :cond_16
    move-object/from16 v2, p0

    .line 578
    .line 579
    :goto_d
    if-nez v2, :cond_17

    .line 580
    .line 581
    goto :goto_e

    .line 582
    :cond_17
    move-object v1, v2

    .line 583
    :goto_e
    const-string v2, "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"

    .line 584
    .line 585
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-static {v0, v2}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    if-eqz v0, :cond_1c

    .line 594
    .line 595
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    array-length v2, v0

    .line 603
    move-object/from16 v9, p0

    .line 604
    .line 605
    move/from16 v5, v17

    .line 606
    .line 607
    move v7, v5

    .line 608
    :goto_f
    if-ge v5, v2, :cond_1a

    .line 609
    .line 610
    aget-object v11, v0, v5

    .line 611
    .line 612
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 613
    .line 614
    .line 615
    move-result v12

    .line 616
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 617
    .line 618
    .line 619
    move-result v12

    .line 620
    if-nez v12, :cond_19

    .line 621
    .line 622
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 623
    .line 624
    .line 625
    move-result v12

    .line 626
    if-nez v12, :cond_19

    .line 627
    .line 628
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 629
    .line 630
    .line 631
    move-result v12

    .line 632
    if-nez v12, :cond_19

    .line 633
    .line 634
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v12

    .line 638
    const-string v13, "onCreate"

    .line 639
    .line 640
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v12

    .line 644
    if-eqz v12, :cond_19

    .line 645
    .line 646
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    move-result-object v12

    .line 650
    invoke-static {v12, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v12

    .line 654
    if-eqz v12, :cond_19

    .line 655
    .line 656
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    move-result-object v12

    .line 660
    const-class v13, Landroid/os/Bundle;

    .line 661
    .line 662
    filled-new-array {v13}, [Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-result-object v13

    .line 666
    invoke-static {v12, v13}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v12

    .line 670
    if-eqz v12, :cond_19

    .line 671
    .line 672
    if-eqz v7, :cond_18

    .line 673
    .line 674
    :goto_10
    move-object/from16 v9, p0

    .line 675
    .line 676
    goto :goto_11

    .line 677
    :cond_18
    move v7, v3

    .line 678
    move-object v9, v11

    .line 679
    :cond_19
    add-int/lit8 v5, v5, 0x1

    .line 680
    .line 681
    goto :goto_f

    .line 682
    :cond_1a
    if-nez v7, :cond_1b

    .line 683
    .line 684
    goto :goto_10

    .line 685
    :cond_1b
    :goto_11
    if-eqz v9, :cond_1c

    .line 686
    .line 687
    invoke-virtual {v9, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 688
    .line 689
    .line 690
    goto :goto_12

    .line 691
    :cond_1c
    move-object/from16 v9, p0

    .line 692
    .line 693
    :goto_12
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-eqz v0, :cond_1e

    .line 698
    .line 699
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    if-eqz v0, :cond_1e

    .line 704
    .line 705
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-eqz v0, :cond_1e

    .line 710
    .line 711
    if-eqz v9, :cond_1d

    .line 712
    .line 713
    goto :goto_13

    .line 714
    :cond_1d
    const-string v0, "\u672a\u627e\u5230\u8bc4\u8bba\u63d0\u53ca\u3001Feed \u7528\u6237\u641c\u7d22\u3001\u8f93\u5165\u8054\u60f3\u6216\u7528\u6237\u4e3b\u9875\u5165\u53e3"

    .line 715
    .line 716
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    return-object p0

    .line 720
    :cond_1e
    :goto_13
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    move/from16 v5, v17

    .line 725
    .line 726
    :cond_1f
    :goto_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    const-string v6, " hook unavailable: "

    .line 731
    .line 732
    const-string v7, "r3912affb67f40e11"

    .line 733
    .line 734
    if-eqz v0, :cond_21

    .line 735
    .line 736
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    check-cast v0, Ljava/lang/reflect/Method;

    .line 741
    .line 742
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    move-result-object v10

    .line 746
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v10

    .line 750
    const-string v11, "mention:"

    .line 751
    .line 752
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v10

    .line 756
    :try_start_0
    sget-object v11, Lxq0;->α:Lxq0;

    .line 757
    .line 758
    new-instance v12, Lpy1;

    .line 759
    .line 760
    const/16 v13, 0xf

    .line 761
    .line 762
    invoke-direct {v12, v13}, Lpy1;-><init>(I)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v11, v0, v12}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 766
    .line 767
    .line 768
    move-object v11, v4

    .line 769
    goto :goto_15

    .line 770
    :catchall_0
    move-exception v0

    .line 771
    new-instance v11, Leo1;

    .line 772
    .line 773
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 774
    .line 775
    .line 776
    :goto_15
    invoke-static {v11}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    if-nez v0, :cond_20

    .line 781
    .line 782
    check-cast v11, Ls62;

    .line 783
    .line 784
    move v0, v3

    .line 785
    goto :goto_16

    .line 786
    :cond_20
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v11

    .line 790
    new-instance v12, Ljava/lang/StringBuilder;

    .line 791
    .line 792
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v6

    .line 808
    invoke-static {v7, v6, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 809
    .line 810
    .line 811
    move/from16 v0, v17

    .line 812
    .line 813
    :goto_16
    if-eqz v0, :cond_1f

    .line 814
    .line 815
    add-int/lit8 v5, v5, 0x1

    .line 816
    .line 817
    goto :goto_14

    .line 818
    :cond_21
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    move/from16 v8, v17

    .line 823
    .line 824
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-eqz v0, :cond_23

    .line 829
    .line 830
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    check-cast v0, Lfe0;

    .line 835
    .line 836
    iget-object v10, v0, Lfe0;->α:Ljava/lang/reflect/Method;

    .line 837
    .line 838
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    move-result-object v10

    .line 842
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v10

    .line 846
    const-string v11, "search:"

    .line 847
    .line 848
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v10

    .line 852
    :try_start_1
    sget-object v11, Lxq0;->α:Lxq0;

    .line 853
    .line 854
    iget-object v12, v0, Lfe0;->α:Ljava/lang/reflect/Method;

    .line 855
    .line 856
    new-instance v13, Lb72;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 857
    .line 858
    move/from16 v14, v17

    .line 859
    .line 860
    :try_start_2
    invoke-direct {v13, v0, v14}, Lb72;-><init>(Lfe0;I)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v11, v12, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 864
    .line 865
    .line 866
    move-object v11, v4

    .line 867
    goto :goto_19

    .line 868
    :catchall_1
    move-exception v0

    .line 869
    goto :goto_18

    .line 870
    :catchall_2
    move-exception v0

    .line 871
    move/from16 v14, v17

    .line 872
    .line 873
    :goto_18
    new-instance v11, Leo1;

    .line 874
    .line 875
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 876
    .line 877
    .line 878
    :goto_19
    invoke-static {v11}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    if-nez v0, :cond_22

    .line 883
    .line 884
    check-cast v11, Ls62;

    .line 885
    .line 886
    add-int/lit8 v8, v8, 0x1

    .line 887
    .line 888
    goto :goto_1a

    .line 889
    :cond_22
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v11

    .line 893
    new-instance v12, Ljava/lang/StringBuilder;

    .line 894
    .line 895
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v10

    .line 911
    invoke-static {v7, v10, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 912
    .line 913
    .line 914
    :goto_1a
    move/from16 v17, v14

    .line 915
    .line 916
    goto :goto_17

    .line 917
    :cond_23
    move/from16 v14, v17

    .line 918
    .line 919
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    move v2, v14

    .line 924
    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    if-eqz v0, :cond_25

    .line 929
    .line 930
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    check-cast v0, Lfe0;

    .line 935
    .line 936
    iget-object v10, v0, Lfe0;->α:Ljava/lang/reflect/Method;

    .line 937
    .line 938
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    move-result-object v10

    .line 942
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v10

    .line 946
    const-string v11, "suggestion:"

    .line 947
    .line 948
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v10

    .line 952
    :try_start_3
    sget-object v11, Lxq0;->α:Lxq0;

    .line 953
    .line 954
    iget-object v12, v0, Lfe0;->α:Ljava/lang/reflect/Method;

    .line 955
    .line 956
    new-instance v13, Lb72;

    .line 957
    .line 958
    invoke-direct {v13, v0, v3}, Lb72;-><init>(Lfe0;I)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v11, v12, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 962
    .line 963
    .line 964
    move-object v11, v4

    .line 965
    goto :goto_1c

    .line 966
    :catchall_3
    move-exception v0

    .line 967
    new-instance v11, Leo1;

    .line 968
    .line 969
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 970
    .line 971
    .line 972
    :goto_1c
    invoke-static {v11}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    if-nez v0, :cond_24

    .line 977
    .line 978
    check-cast v11, Ls62;

    .line 979
    .line 980
    add-int/lit8 v2, v2, 0x1

    .line 981
    .line 982
    goto :goto_1b

    .line 983
    :cond_24
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v11

    .line 987
    new-instance v12, Ljava/lang/StringBuilder;

    .line 988
    .line 989
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v10

    .line 1005
    invoke-static {v7, v10, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1006
    .line 1007
    .line 1008
    goto :goto_1b

    .line 1009
    :cond_25
    if-eqz v9, :cond_27

    .line 1010
    .line 1011
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    const-string v1, "profile:"

    .line 1020
    .line 1021
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v1

    .line 1025
    :try_start_4
    sget-object v0, Lxq0;->α:Lxq0;

    .line 1026
    .line 1027
    new-instance v10, Lpy1;

    .line 1028
    .line 1029
    const/16 v11, 0x10

    .line 1030
    .line 1031
    invoke-direct {v10, v11}, Lpy1;-><init>(I)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v0, v9, v10}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1035
    .line 1036
    .line 1037
    move-object v9, v4

    .line 1038
    goto :goto_1d

    .line 1039
    :catchall_4
    move-exception v0

    .line 1040
    new-instance v9, Leo1;

    .line 1041
    .line 1042
    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1043
    .line 1044
    .line 1045
    :goto_1d
    invoke-static {v9}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    if-nez v0, :cond_26

    .line 1050
    .line 1051
    check-cast v9, Ls62;

    .line 1052
    .line 1053
    goto :goto_1e

    .line 1054
    :cond_26
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v3

    .line 1058
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v1

    .line 1076
    invoke-static {v7, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1077
    .line 1078
    .line 1079
    :cond_27
    move v3, v14

    .line 1080
    :goto_1e
    add-int v0, v5, v8

    .line 1081
    .line 1082
    add-int/2addr v0, v2

    .line 1083
    add-int/2addr v0, v3

    .line 1084
    if-lez v0, :cond_28

    .line 1085
    .line 1086
    const-string v0, " search="

    .line 1087
    .line 1088
    const-string v1, " suggestion="

    .line 1089
    .line 1090
    const-string v6, "installed mention="

    .line 1091
    .line 1092
    invoke-static {v6, v5, v0, v8, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1097
    .line 1098
    .line 1099
    const-string v1, " profile="

    .line 1100
    .line 1101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v0

    .line 1111
    invoke-static {v7, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    return-object v4

    .line 1115
    :cond_28
    const-string v0, "\u53d1\u73b0\u4e0e\u5bfc\u822a\u76ee\u6807\u5747\u672a\u80fd\u5b89\u88c5"

    .line 1116
    .line 1117
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1118
    .line 1119
    .line 1120
    return-object p0
.end method

.method private final δ()Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Ll41;->α:Ll41;

    .line 2
    .line 3
    const-string v0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object p0, p0, Lr20;->ζ:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-static {p0, v0}, Ll41;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    const/4 v0, 0x0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    new-array p0, v0, [Ljava/lang/reflect/Method;

    .line 27
    .line 28
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    array-length v2, p0

    .line 34
    :goto_1
    if-ge v0, v2, :cond_3

    .line 35
    .line 36
    aget-object v3, p0, v0

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    sget-object v4, Ll41;->ε:Ljava/util/Set;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    return-object v1
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr20;->ε:I

    .line 4
    .line 5
    const-string v2, "LJJJJLL"

    .line 6
    .line 7
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const-class v5, Ljava/util/ArrayList;

    .line 12
    .line 13
    const-class v6, Ljava/util/List;

    .line 14
    .line 15
    const-class v7, Ljava/lang/String;

    .line 16
    .line 17
    const/4 v8, 0x6

    .line 18
    const/16 v9, 0x8

    .line 19
    .line 20
    sget-object v11, Ljz;->ε:Ljz;

    .line 21
    .line 22
    sget-object v13, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    const/4 v14, 0x7

    .line 25
    const/4 v15, 0x0

    .line 26
    sget-object v17, Ls62;->α:Ls62;

    .line 27
    .line 28
    const/4 v10, 0x1

    .line 29
    iget-object v12, v0, Lr20;->ζ:Ljava/lang/ClassLoader;

    .line 30
    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    sget-object v0, Ll41;->α:Ll41;

    .line 35
    .line 36
    const-string v0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"

    .line 37
    .line 38
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v12, v0}, Ll41;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v12, 0x0

    .line 54
    :goto_0
    if-nez v12, :cond_1

    .line 55
    .line 56
    new-array v12, v15, [Ljava/lang/reflect/Method;

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    array-length v1, v12

    .line 64
    :goto_1
    if-ge v15, v1, :cond_3

    .line 65
    .line 66
    aget-object v2, v12, v15

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {v2}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    sget-object v3, Ll41;->ζ:Ljava/util/Set;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_2
    add-int/lit8 v15, v15, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    return-object v0

    .line 96
    :pswitch_0
    invoke-direct {v0}, Lr20;->δ()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    return-object v0

    .line 101
    :pswitch_1
    sget-object v0, Ll41;->α:Ll41;

    .line 102
    .line 103
    const-string v0, "X.C0IIU"

    .line 104
    .line 105
    invoke-static {v12, v0}, Ll41;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    const/4 v12, 0x0

    .line 117
    :goto_2
    if-nez v12, :cond_5

    .line 118
    .line 119
    new-array v12, v15, [Ljava/lang/reflect/Method;

    .line 120
    .line 121
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    array-length v1, v12

    .line 127
    :goto_3
    if-ge v15, v1, :cond_7

    .line 128
    .line 129
    aget-object v2, v12, v15

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Ll41;->η(Ljava/lang/reflect/Method;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_6

    .line 139
    .line 140
    sget-object v3, Ll41;->β:Ljava/util/Set;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_6

    .line 151
    .line 152
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_6
    add-int/lit8 v15, v15, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    return-object v0

    .line 159
    :pswitch_2
    invoke-static {v12, v10}, Luv0;->β(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    return-object v17

    .line 163
    :pswitch_3
    invoke-static {v12, v10}, Luv0;->α(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    return-object v17

    .line 167
    :pswitch_4
    sget-object v0, Ltu0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 168
    .line 169
    invoke-static {v12, v10}, Ltu0;->ε(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    return-object v17

    .line 173
    :pswitch_5
    sget-object v0, Lcp0;->α:Ljava/util/Set;

    .line 174
    .line 175
    invoke-static {v12, v10}, Lcp0;->δ(Ljava/lang/ClassLoader;Z)V

    .line 176
    .line 177
    .line 178
    return-object v17

    .line 179
    :pswitch_6
    invoke-static {v12, v10}, Lbk0;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    return-object v17

    .line 183
    :pswitch_7
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v0, Lt20;

    .line 187
    .line 188
    const/4 v1, 0x5

    .line 189
    invoke-direct {v0, v12, v1}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 190
    .line 191
    .line 192
    sget-object v1, Lkx;->ｌ:Lkx;

    .line 193
    .line 194
    const-string v2, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u6570\u5b57\u6e05\u96f6\u5165\u53e3"

    .line 195
    .line 196
    invoke-static {v1, v12, v2, v0}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    return-object v17

    .line 200
    :pswitch_8
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance v0, Lt20;

    .line 204
    .line 205
    invoke-direct {v0, v12, v14}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 206
    .line 207
    .line 208
    sget-object v1, Lkx;->ｋ:Lkx;

    .line 209
    .line 210
    const-string v2, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u6e05\u672a\u8bfb\u5165\u53e3"

    .line 211
    .line 212
    invoke-static {v1, v12, v2, v0}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    return-object v17

    .line 216
    :pswitch_9
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v0, Lt20;

    .line 220
    .line 221
    invoke-direct {v0, v12, v9}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 222
    .line 223
    .line 224
    sget-object v1, Lkx;->ｊ:Lkx;

    .line 225
    .line 226
    const-string v2, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u670d\u52a1\u5165\u53e3"

    .line 227
    .line 228
    invoke-static {v1, v12, v2, v0}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    return-object v17

    .line 232
    :pswitch_a
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance v0, Lt20;

    .line 236
    .line 237
    invoke-direct {v0, v12, v8}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 238
    .line 239
    .line 240
    sget-object v1, Lkx;->ц:Lkx;

    .line 241
    .line 242
    const-string v2, "\u9002\u914d\u6d88\u606f\u5e95\u680f\u672a\u8bfb\u540c\u6b65\u5165\u53e3"

    .line 243
    .line 244
    invoke-static {v1, v12, v2, v0}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    return-object v17

    .line 248
    :pswitch_b
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v0, Lt20;

    .line 252
    .line 253
    const/16 v1, 0x9

    .line 254
    .line 255
    invoke-direct {v0, v12, v1}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 256
    .line 257
    .line 258
    sget-object v1, Lkx;->ｍ:Lkx;

    .line 259
    .line 260
    const-string v2, "\u9002\u914d\u4e92\u52a8\u6d88\u606f\u672a\u8bfb\u5206\u7ec4\u5165\u53e3"

    .line 261
    .line 262
    invoke-static {v1, v12, v2, v0}, Lx;->ρ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    return-object v17

    .line 266
    :pswitch_c
    sget-object v0, Lwi0;->α:Lwi0;

    .line 267
    .line 268
    invoke-virtual {v0, v12, v10}, Lwi0;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    return-object v17

    .line 272
    :pswitch_d
    sget-object v0, La01;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 273
    .line 274
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    sget-object v1, La01;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 278
    .line 279
    invoke-virtual {v1, v15, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_8

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_8
    :try_start_0
    invoke-static {v12}, La01;->ε(Ljava/lang/ClassLoader;)V

    .line 287
    .line 288
    .line 289
    sget-object v0, Lbe0;->α:Lbe0;

    .line 290
    .line 291
    new-instance v2, Lkt0;

    .line 292
    .line 293
    invoke-direct {v2, v9}, Lkt0;-><init>(I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Lbe0;->ε()V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 300
    .line 301
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    .line 303
    .line 304
    move-object/from16 v2, v17

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    new-instance v2, Leo1;

    .line 309
    .line 310
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    :goto_4
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-eqz v0, :cond_9

    .line 318
    .line 319
    invoke-virtual {v1, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 320
    .line 321
    .line 322
    const-string v1, "rbe3d87ed96de26de"

    .line 323
    .line 324
    const-string v2, "\u5b89\u88c5\u6d88\u606f\u9875\u53cc\u51fb\u663e\u793a Hook \u5931\u8d25"

    .line 325
    .line 326
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    :cond_9
    :goto_5
    return-object v17

    .line 330
    :pswitch_e
    invoke-direct {v0}, Lr20;->γ()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    return-object v0

    .line 335
    :pswitch_f
    sget-object v3, Llv1;->α:Llv1;

    .line 336
    .line 337
    sget-object v9, Llv1;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 338
    .line 339
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    sget-object v0, Llv1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 343
    .line 344
    invoke-virtual {v0, v15, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-nez v0, :cond_a

    .line 349
    .line 350
    goto/16 :goto_f

    .line 351
    .line 352
    :cond_a
    sget-object v0, Lfk1;->α:Lfk1;

    .line 353
    .line 354
    new-instance v1, Luu1;

    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    const/4 v8, 0x7

    .line 358
    const/4 v2, 0x1

    .line 359
    const-class v4, Llv1;

    .line 360
    .line 361
    const-string v5, "installQuickShareTarget"

    .line 362
    .line 363
    const-string v6, "installQuickShareTarget(Ljava/lang/Class;)V"

    .line 364
    .line 365
    invoke-direct/range {v1 .. v8}, Luu1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 366
    .line 367
    .line 368
    sget-object v0, Lfk1;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 369
    .line 370
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    sget-object v0, Lfk1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    check-cast v0, Ljava/lang/Iterable;

    .line 383
    .line 384
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    if-eqz v2, :cond_b

    .line 393
    .line 394
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    check-cast v2, Ljava/lang/Class;

    .line 399
    .line 400
    sget-object v3, Lfk1;->α:Lfk1;

    .line 401
    .line 402
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-static {v1, v2}, Lfk1;->β(La80;Ljava/lang/Class;)V

    .line 406
    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_b
    sget-object v0, Lfk1;->α:Lfk1;

    .line 410
    .line 411
    invoke-virtual {v0, v12, v15}, Lfk1;->α(Ljava/lang/ClassLoader;Z)V

    .line 412
    .line 413
    .line 414
    :try_start_1
    invoke-static {v12}, Lxb;->Χ(Ljava/lang/ClassLoader;)Lge0;

    .line 415
    .line 416
    .line 417
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 418
    goto :goto_7

    .line 419
    :catchall_1
    move-exception v0

    .line 420
    new-instance v1, Leo1;

    .line 421
    .line 422
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    move-object v0, v1

    .line 426
    :goto_7
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    const-string v2, "rac25e39d95f0abcc"

    .line 431
    .line 432
    if-eqz v1, :cond_c

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    const-string v3, "extended share targets unavailable: "

    .line 439
    .line 440
    invoke-static {v3, v1, v2}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    :cond_c
    instance-of v1, v0, Leo1;

    .line 444
    .line 445
    if-eqz v1, :cond_d

    .line 446
    .line 447
    const/4 v0, 0x0

    .line 448
    :cond_d
    check-cast v0, Lge0;

    .line 449
    .line 450
    const-string v1, "installed quick="

    .line 451
    .line 452
    if-nez v0, :cond_f

    .line 453
    .line 454
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->isEmpty()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-nez v0, :cond_e

    .line 462
    .line 463
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->size()I

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    new-instance v3, Ljava/lang/StringBuilder;

    .line 468
    .line 469
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    const-string v0, " extended=0"

    .line 476
    .line 477
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    goto/16 :goto_f

    .line 488
    .line 489
    :cond_e
    const-string v0, "\u672a\u627e\u5230\u53ef\u7528\u7684\u89c6\u9891\u5206\u4eab\u8054\u7cfb\u4eba\u76ee\u6807"

    .line 490
    .line 491
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    const/4 v12, 0x0

    .line 495
    goto/16 :goto_10

    .line 496
    .line 497
    :cond_f
    iget-object v3, v0, Lge0;->ι:Ljava/util/List;

    .line 498
    .line 499
    iget-object v4, v0, Lge0;->θ:Ljava/util/ArrayList;

    .line 500
    .line 501
    iget-object v5, v0, Lge0;->η:Ljava/util/ArrayList;

    .line 502
    .line 503
    iget-object v6, v0, Lge0;->ε:Ljava/util/ArrayList;

    .line 504
    .line 505
    iget-object v7, v0, Lge0;->δ:Ljava/util/ArrayList;

    .line 506
    .line 507
    iget-object v8, v0, Lge0;->γ:Ljava/util/ArrayList;

    .line 508
    .line 509
    iget-object v11, v0, Lge0;->α:Ljava/util/ArrayList;

    .line 510
    .line 511
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 512
    .line 513
    .line 514
    move-result-object v12

    .line 515
    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 516
    .line 517
    .line 518
    move-result v13

    .line 519
    if-eqz v13, :cond_10

    .line 520
    .line 521
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v13

    .line 525
    check-cast v13, Ljava/lang/reflect/Method;

    .line 526
    .line 527
    sget-object v14, Lxq0;->α:Lxq0;

    .line 528
    .line 529
    new-instance v15, Lad1;

    .line 530
    .line 531
    const/16 v10, 0x18

    .line 532
    .line 533
    invoke-direct {v15, v10}, Lad1;-><init>(I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v14, v13, v15}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 537
    .line 538
    .line 539
    const/4 v10, 0x1

    .line 540
    goto :goto_8

    .line 541
    :cond_10
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v10

    .line 545
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v12

    .line 549
    if-eqz v12, :cond_11

    .line 550
    .line 551
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v12

    .line 555
    check-cast v12, Ljava/lang/reflect/Method;

    .line 556
    .line 557
    sget-object v13, Lxq0;->α:Lxq0;

    .line 558
    .line 559
    new-instance v14, Lak0;

    .line 560
    .line 561
    move-object/from16 v16, v3

    .line 562
    .line 563
    const/4 v3, 0x1

    .line 564
    const/4 v15, 0x0

    .line 565
    invoke-direct {v14, v15, v12, v3}, Lak0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;I)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v13, v12, v14}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 569
    .line 570
    .line 571
    move-object/from16 v3, v16

    .line 572
    .line 573
    goto :goto_9

    .line 574
    :cond_11
    move-object/from16 v16, v3

    .line 575
    .line 576
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 581
    .line 582
    .line 583
    move-result v10

    .line 584
    if-eqz v10, :cond_12

    .line 585
    .line 586
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v10

    .line 590
    check-cast v10, Ljava/lang/reflect/Method;

    .line 591
    .line 592
    iget-object v12, v0, Lge0;->β:Ljava/lang/Class;

    .line 593
    .line 594
    sget-object v13, Lxq0;->α:Lxq0;

    .line 595
    .line 596
    new-instance v14, Lak0;

    .line 597
    .line 598
    const/4 v15, 0x1

    .line 599
    invoke-direct {v14, v12, v10, v15}, Lak0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v13, v10, v14}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 603
    .line 604
    .line 605
    goto :goto_a

    .line 606
    :cond_12
    const/4 v15, 0x1

    .line 607
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v10

    .line 615
    if-eqz v10, :cond_13

    .line 616
    .line 617
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v10

    .line 621
    check-cast v10, Ljava/lang/reflect/Method;

    .line 622
    .line 623
    sget-object v12, Lxq0;->α:Lxq0;

    .line 624
    .line 625
    new-instance v13, Lak0;

    .line 626
    .line 627
    const/4 v14, 0x0

    .line 628
    invoke-direct {v13, v14, v10, v15}, Lak0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;I)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12, v10, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 632
    .line 633
    .line 634
    const/4 v15, 0x1

    .line 635
    goto :goto_b

    .line 636
    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 641
    .line 642
    .line 643
    move-result v10

    .line 644
    if-eqz v10, :cond_14

    .line 645
    .line 646
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v10

    .line 650
    check-cast v10, Ljava/lang/reflect/Method;

    .line 651
    .line 652
    iget-object v12, v0, Lge0;->ζ:Ljava/lang/Class;

    .line 653
    .line 654
    sget-object v13, Lxq0;->α:Lxq0;

    .line 655
    .line 656
    new-instance v14, Lak0;

    .line 657
    .line 658
    invoke-direct {v14, v12, v10}, Lak0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v13, v10, v14}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 662
    .line 663
    .line 664
    goto :goto_c

    .line 665
    :cond_14
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    if-eqz v3, :cond_15

    .line 674
    .line 675
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v3

    .line 679
    check-cast v3, Lfe0;

    .line 680
    .line 681
    iget-object v10, v3, Lfe0;->α:Ljava/lang/reflect/Method;

    .line 682
    .line 683
    iget-object v3, v3, Lfe0;->β:Ljava/lang/Class;

    .line 684
    .line 685
    sget-object v12, Lxq0;->α:Lxq0;

    .line 686
    .line 687
    new-instance v13, Lak0;

    .line 688
    .line 689
    const/4 v15, 0x1

    .line 690
    invoke-direct {v13, v3, v10, v15}, Lak0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;I)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v10, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 694
    .line 695
    .line 696
    goto :goto_d

    .line 697
    :cond_15
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 702
    .line 703
    .line 704
    move-result v3

    .line 705
    if-eqz v3, :cond_16

    .line 706
    .line 707
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    check-cast v3, Lfe0;

    .line 712
    .line 713
    iget-object v10, v3, Lfe0;->α:Ljava/lang/reflect/Method;

    .line 714
    .line 715
    iget-object v3, v3, Lfe0;->β:Ljava/lang/Class;

    .line 716
    .line 717
    sget-object v12, Lxq0;->α:Lxq0;

    .line 718
    .line 719
    new-instance v13, Lak0;

    .line 720
    .line 721
    const/4 v15, 0x1

    .line 722
    invoke-direct {v13, v3, v10, v15}, Lak0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;I)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12, v10, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 726
    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_16
    invoke-virtual {v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->size()I

    .line 730
    .line 731
    .line 732
    move-result v0

    .line 733
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 734
    .line 735
    .line 736
    move-result v3

    .line 737
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 738
    .line 739
    .line 740
    move-result v8

    .line 741
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 742
    .line 743
    .line 744
    move-result v7

    .line 745
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 746
    .line 747
    .line 748
    move-result v6

    .line 749
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 750
    .line 751
    .line 752
    move-result v5

    .line 753
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    .line 758
    .line 759
    .line 760
    move-result v9

    .line 761
    const-string v10, " search="

    .line 762
    .line 763
    const-string v11, " select="

    .line 764
    .line 765
    invoke-static {v1, v0, v10, v3, v11}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    const-string v1, " inherited="

    .line 770
    .line 771
    const-string v3, " fragment="

    .line 772
    .line 773
    invoke-static {v0, v8, v1, v7, v3}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 774
    .line 775
    .line 776
    const-string v1, " state="

    .line 777
    .line 778
    const-string v3, " sideSlip="

    .line 779
    .line 780
    invoke-static {v0, v6, v1, v5, v3}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    const-string v1, " picker="

    .line 787
    .line 788
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    :goto_f
    move-object/from16 v12, v17

    .line 802
    .line 803
    :goto_10
    return-object v12

    .line 804
    :pswitch_10
    invoke-direct {v0}, Lr20;->β()Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    return-object v0

    .line 809
    :pswitch_11
    const/16 v19, 0x0

    .line 810
    .line 811
    sget-object v23, Lyz0;->α:Lyz0;

    .line 812
    .line 813
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    sget-object v0, Lyz0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 817
    .line 818
    const/4 v3, 0x1

    .line 819
    invoke-virtual {v0, v15, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 820
    .line 821
    .line 822
    move-result v0

    .line 823
    if-nez v0, :cond_17

    .line 824
    .line 825
    goto/16 :goto_1d

    .line 826
    .line 827
    :cond_17
    const-string v0, "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9F5CC3DD42CA3B4D6DFF0D8D1EFDF53634CE4A40DAB271173B27391F0B8FB18B34C3CFA84E8948EC59BA598A7D46A70A968FC28657F83"

    .line 828
    .line 829
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-static {v0, v15, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    array-length v2, v1

    .line 848
    move v4, v15

    .line 849
    move v8, v4

    .line 850
    move-object/from16 v3, v19

    .line 851
    .line 852
    :goto_11
    if-ge v8, v2, :cond_1a

    .line 853
    .line 854
    aget-object v9, v1, v8

    .line 855
    .line 856
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 857
    .line 858
    .line 859
    move-result v10

    .line 860
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 861
    .line 862
    .line 863
    move-result v10

    .line 864
    if-nez v10, :cond_19

    .line 865
    .line 866
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 867
    .line 868
    .line 869
    move-result v10

    .line 870
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 871
    .line 872
    .line 873
    move-result v10

    .line 874
    if-eqz v10, :cond_19

    .line 875
    .line 876
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 877
    .line 878
    .line 879
    move-result v10

    .line 880
    if-nez v10, :cond_19

    .line 881
    .line 882
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 883
    .line 884
    .line 885
    move-result v10

    .line 886
    if-nez v10, :cond_19

    .line 887
    .line 888
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    move-result-object v10

    .line 892
    array-length v10, v10

    .line 893
    const/4 v11, 0x1

    .line 894
    if-ne v10, v11, :cond_19

    .line 895
    .line 896
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    move-result-object v10

    .line 900
    aget-object v10, v10, v15

    .line 901
    .line 902
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 903
    .line 904
    .line 905
    move-result v10

    .line 906
    if-nez v10, :cond_19

    .line 907
    .line 908
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    move-result-object v10

    .line 912
    invoke-virtual {v6, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 913
    .line 914
    .line 915
    move-result v10

    .line 916
    if-eqz v10, :cond_19

    .line 917
    .line 918
    if-eqz v4, :cond_18

    .line 919
    .line 920
    :goto_12
    move-object/from16 v3, v19

    .line 921
    .line 922
    goto :goto_13

    .line 923
    :cond_18
    move-object v3, v9

    .line 924
    const/4 v4, 0x1

    .line 925
    :cond_19
    add-int/lit8 v8, v8, 0x1

    .line 926
    .line 927
    goto :goto_11

    .line 928
    :cond_1a
    if-nez v4, :cond_1b

    .line 929
    .line 930
    goto :goto_12

    .line 931
    :cond_1b
    :goto_13
    if-eqz v3, :cond_2b

    .line 932
    .line 933
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 938
    .line 939
    .line 940
    array-length v1, v0

    .line 941
    move v4, v15

    .line 942
    move v8, v4

    .line 943
    move-object/from16 v2, v19

    .line 944
    .line 945
    :goto_14
    if-ge v8, v1, :cond_1e

    .line 946
    .line 947
    aget-object v9, v0, v8

    .line 948
    .line 949
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 950
    .line 951
    .line 952
    move-result v10

    .line 953
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 954
    .line 955
    .line 956
    move-result v10

    .line 957
    if-nez v10, :cond_1d

    .line 958
    .line 959
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 960
    .line 961
    .line 962
    move-result v10

    .line 963
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 964
    .line 965
    .line 966
    move-result v10

    .line 967
    if-nez v10, :cond_1d

    .line 968
    .line 969
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 970
    .line 971
    .line 972
    move-result v10

    .line 973
    if-nez v10, :cond_1d

    .line 974
    .line 975
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 976
    .line 977
    .line 978
    move-result v10

    .line 979
    if-nez v10, :cond_1d

    .line 980
    .line 981
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    move-result-object v10

    .line 985
    invoke-static {v10, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    move-result v10

    .line 989
    if-eqz v10, :cond_1d

    .line 990
    .line 991
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    move-result-object v10

    .line 995
    array-length v10, v10

    .line 996
    const/4 v11, 0x2

    .line 997
    if-ne v10, v11, :cond_1d

    .line 998
    .line 999
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v10

    .line 1003
    aget-object v10, v10, v15

    .line 1004
    .line 1005
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v11

    .line 1009
    aget-object v11, v11, v15

    .line 1010
    .line 1011
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v10

    .line 1015
    if-eqz v10, :cond_1d

    .line 1016
    .line 1017
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v10

    .line 1021
    const/16 v20, 0x1

    .line 1022
    .line 1023
    aget-object v10, v10, v20

    .line 1024
    .line 1025
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v10

    .line 1029
    const-string v11, "kotlin.jvm.functions.Function0"

    .line 1030
    .line 1031
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v10

    .line 1035
    if-eqz v10, :cond_1d

    .line 1036
    .line 1037
    if-eqz v4, :cond_1c

    .line 1038
    .line 1039
    :goto_15
    move-object/from16 v2, v19

    .line 1040
    .line 1041
    goto :goto_16

    .line 1042
    :cond_1c
    move-object v2, v9

    .line 1043
    const/4 v4, 0x1

    .line 1044
    :cond_1d
    add-int/lit8 v8, v8, 0x1

    .line 1045
    .line 1046
    goto :goto_14

    .line 1047
    :cond_1e
    if-nez v4, :cond_1f

    .line 1048
    .line 1049
    goto :goto_15

    .line 1050
    :cond_1f
    :goto_16
    if-eqz v2, :cond_2a

    .line 1051
    .line 1052
    const/4 v11, 0x1

    .line 1053
    invoke-virtual {v3, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v2, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1057
    .line 1058
    .line 1059
    const-string v0, "~7897B8FB4A9E8F3BF9B516DDE3F6FCD5574085CBE8B4160971D84C17A47E9E5D6FDC85A6F2DF47FADA98133A5045DBCD68E09AE32FB8CA375BF004475E41AAD7"

    .line 1060
    .line 1061
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-static {v0, v15, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    array-length v1, v0

    .line 1080
    move v8, v15

    .line 1081
    move v9, v8

    .line 1082
    move-object/from16 v4, v19

    .line 1083
    .line 1084
    :goto_17
    if-ge v9, v1, :cond_22

    .line 1085
    .line 1086
    aget-object v10, v0, v9

    .line 1087
    .line 1088
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1089
    .line 1090
    .line 1091
    move-result v11

    .line 1092
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v11

    .line 1096
    if-nez v11, :cond_21

    .line 1097
    .line 1098
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v11

    .line 1102
    const-class v12, Ljava/lang/Integer;

    .line 1103
    .line 1104
    filled-new-array {v12, v7}, [Ljava/lang/Class;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v12

    .line 1108
    invoke-static {v11, v12}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v11

    .line 1112
    if-eqz v11, :cond_21

    .line 1113
    .line 1114
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v11

    .line 1118
    invoke-static {v11, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v11

    .line 1122
    if-nez v11, :cond_21

    .line 1123
    .line 1124
    if-eqz v8, :cond_20

    .line 1125
    .line 1126
    :goto_18
    move-object/from16 v4, v19

    .line 1127
    .line 1128
    goto :goto_19

    .line 1129
    :cond_20
    move-object v4, v10

    .line 1130
    const/4 v8, 0x1

    .line 1131
    :cond_21
    add-int/lit8 v9, v9, 0x1

    .line 1132
    .line 1133
    goto :goto_17

    .line 1134
    :cond_22
    if-nez v8, :cond_23

    .line 1135
    .line 1136
    goto :goto_18

    .line 1137
    :cond_23
    :goto_19
    if-eqz v4, :cond_29

    .line 1138
    .line 1139
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    array-length v1, v0

    .line 1151
    move v8, v15

    .line 1152
    move v9, v8

    .line 1153
    move-object/from16 v4, v19

    .line 1154
    .line 1155
    :goto_1a
    if-ge v9, v1, :cond_26

    .line 1156
    .line 1157
    aget-object v10, v0, v9

    .line 1158
    .line 1159
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1160
    .line 1161
    .line 1162
    move-result v11

    .line 1163
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v11

    .line 1167
    if-nez v11, :cond_25

    .line 1168
    .line 1169
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v11

    .line 1173
    invoke-static {v11, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v11

    .line 1177
    if-eqz v11, :cond_25

    .line 1178
    .line 1179
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v11

    .line 1183
    array-length v11, v11

    .line 1184
    const/4 v12, 0x3

    .line 1185
    if-ne v11, v12, :cond_25

    .line 1186
    .line 1187
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v11

    .line 1191
    aget-object v11, v11, v15

    .line 1192
    .line 1193
    invoke-static {v11, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v11

    .line 1197
    if-eqz v11, :cond_25

    .line 1198
    .line 1199
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v11

    .line 1203
    const/16 v20, 0x1

    .line 1204
    .line 1205
    aget-object v11, v11, v20

    .line 1206
    .line 1207
    invoke-virtual {v6, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v11

    .line 1211
    if-eqz v11, :cond_25

    .line 1212
    .line 1213
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v11

    .line 1217
    aget-object v11, v11, v20

    .line 1218
    .line 1219
    invoke-virtual {v11, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v11

    .line 1223
    if-eqz v11, :cond_25

    .line 1224
    .line 1225
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v11

    .line 1229
    const/16 v18, 0x2

    .line 1230
    .line 1231
    aget-object v11, v11, v18

    .line 1232
    .line 1233
    invoke-virtual {v11}, Ljava/lang/Class;->isEnum()Z

    .line 1234
    .line 1235
    .line 1236
    move-result v11

    .line 1237
    if-eqz v11, :cond_25

    .line 1238
    .line 1239
    if-eqz v8, :cond_24

    .line 1240
    .line 1241
    :goto_1b
    move-object/from16 v4, v19

    .line 1242
    .line 1243
    goto :goto_1c

    .line 1244
    :cond_24
    move-object v4, v10

    .line 1245
    const/4 v8, 0x1

    .line 1246
    :cond_25
    add-int/lit8 v9, v9, 0x1

    .line 1247
    .line 1248
    goto :goto_1a

    .line 1249
    :cond_26
    if-nez v8, :cond_27

    .line 1250
    .line 1251
    goto :goto_1b

    .line 1252
    :cond_27
    :goto_1c
    if-eqz v4, :cond_28

    .line 1253
    .line 1254
    const/4 v11, 0x1

    .line 1255
    invoke-virtual {v4, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1256
    .line 1257
    .line 1258
    sget-object v0, Lxq0;->α:Lxq0;

    .line 1259
    .line 1260
    new-instance v1, Lqg;

    .line 1261
    .line 1262
    invoke-direct {v1, v14, v2, v3}, Lqg;-><init>(ILjava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v0, v2, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 1266
    .line 1267
    .line 1268
    new-instance v1, Lxe;

    .line 1269
    .line 1270
    invoke-direct {v1, v4, v14, v15}, Lxe;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v0, v4, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 1274
    .line 1275
    .line 1276
    sget-object v0, Lbe0;->α:Lbe0;

    .line 1277
    .line 1278
    new-instance v21, Lw0;

    .line 1279
    .line 1280
    const/16 v27, 0x0

    .line 1281
    .line 1282
    const/16 v28, 0x5

    .line 1283
    .line 1284
    const/16 v22, 0x0

    .line 1285
    .line 1286
    const-class v24, Lyz0;

    .line 1287
    .line 1288
    const-string v25, "refreshActiveAdapters"

    .line 1289
    .line 1290
    const-string v26, "refreshActiveAdapters()V"

    .line 1291
    .line 1292
    invoke-direct/range {v21 .. v28}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1293
    .line 1294
    .line 1295
    move-object/from16 v1, v21

    .line 1296
    .line 1297
    invoke-virtual {v0}, Lbe0;->ε()V

    .line 1298
    .line 1299
    .line 1300
    sget-object v0, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1301
    .line 1302
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1303
    .line 1304
    .line 1305
    const-string v0, "r1e0d2867edbb56e0"

    .line 1306
    .line 1307
    const-string v1, "installed session_pipeline=1 search=1"

    .line 1308
    .line 1309
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1310
    .line 1311
    .line 1312
    :goto_1d
    move-object/from16 v12, v17

    .line 1313
    .line 1314
    goto :goto_1f

    .line 1315
    :cond_28
    const-string v0, "\u672a\u627e\u5230\u7edf\u4e00\u641c\u7d22\u7ed3\u679c\u53d1\u5e03\u65b9\u6cd5"

    .line 1316
    .line 1317
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    :goto_1e
    move-object/from16 v12, v19

    .line 1321
    .line 1322
    goto :goto_1f

    .line 1323
    :cond_29
    const-string v0, "\u672a\u627e\u5230 ImSearchViewModelV2 \u641c\u7d22\u5668\u5de5\u5382"

    .line 1324
    .line 1325
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    goto :goto_1e

    .line 1329
    :cond_2a
    const-string v0, "\u672a\u627e\u5230\u552f\u4e00\u4f1a\u8bdd\u5217\u8868 Diff \u5237\u65b0\u5165\u53e3"

    .line 1330
    .line 1331
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    goto :goto_1e

    .line 1335
    :cond_2b
    const-string v0, "\u672a\u627e\u5230\u552f\u4e00\u4f1a\u8bdd\u5217\u8868\u6784\u5efa\u5951\u7ea6"

    .line 1336
    .line 1337
    invoke-static {v0}, Lql1;->δ(Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    goto :goto_1e

    .line 1341
    :goto_1f
    return-object v12

    .line 1342
    :pswitch_12
    const/16 v19, 0x0

    .line 1343
    .line 1344
    sget-object v2, Lcn1;->α:Lcn1;

    .line 1345
    .line 1346
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1347
    .line 1348
    .line 1349
    sget-object v0, Lcn1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1350
    .line 1351
    const/4 v11, 0x1

    .line 1352
    invoke-virtual {v0, v15, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v0

    .line 1356
    if-nez v0, :cond_2c

    .line 1357
    .line 1358
    goto/16 :goto_42

    .line 1359
    .line 1360
    :cond_2c
    const-string v0, "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059549CEEC8160D1645A93B03AD7181CF83CE4C7181C5CDC2A39C54C607876AD7E5AC80E6F5922D3B13B"

    .line 1361
    .line 1362
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    const-string v1, "~789325E9C4B2AA228E18888457F2F91C62869634665744D0738ADF4686D18B8D617FDC9F3DD0608AAC394ABD089B3D7CD772D3263A57B23E74B13C816C44A1B74D"

    .line 1367
    .line 1368
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v1

    .line 1372
    const-string v3, "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C8D8DDD124631A67F6CA8AF59329658089AC491CA591519CA6919D74AF1F815D23C9E17C451AE0AE81B4"

    .line 1373
    .line 1374
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v8

    .line 1378
    const-string v9, "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059554CBE58073CB245CD9A4238D1C0AB71EF1D52C5377DA2A3CCB494F647884794DCF0E6F5922D3B13B"

    .line 1379
    .line 1380
    invoke-static {v9}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v9

    .line 1384
    filled-new-array {v0, v1, v8, v9}, [Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    new-instance v1, Ljava/util/ArrayList;

    .line 1393
    .line 1394
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1395
    .line 1396
    .line 1397
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    :cond_2d
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1402
    .line 1403
    .line 1404
    move-result v8

    .line 1405
    if-eqz v8, :cond_30

    .line 1406
    .line 1407
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v8

    .line 1411
    check-cast v8, Ljava/lang/String;

    .line 1412
    .line 1413
    invoke-static {v12, v8}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v8

    .line 1417
    if-nez v8, :cond_2e

    .line 1418
    .line 1419
    :goto_21
    move-object/from16 v10, v19

    .line 1420
    .line 1421
    goto :goto_22

    .line 1422
    :cond_2e
    invoke-static {v8}, Lxb;->Β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v9

    .line 1426
    invoke-static {v9}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v9

    .line 1430
    check-cast v9, Ljava/lang/reflect/Method;

    .line 1431
    .line 1432
    if-nez v9, :cond_2f

    .line 1433
    .line 1434
    goto :goto_21

    .line 1435
    :cond_2f
    new-instance v10, Lee0;

    .line 1436
    .line 1437
    const/4 v11, 0x1

    .line 1438
    invoke-direct {v10, v9, v8, v15, v11}, Lee0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Class;IZ)V

    .line 1439
    .line 1440
    .line 1441
    :goto_22
    if-eqz v10, :cond_2d

    .line 1442
    .line 1443
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1444
    .line 1445
    .line 1446
    goto :goto_20

    .line 1447
    :cond_30
    new-instance v0, Ljava/util/ArrayList;

    .line 1448
    .line 1449
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v1

    .line 1456
    :cond_31
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1457
    .line 1458
    .line 1459
    move-result v8

    .line 1460
    if-eqz v8, :cond_32

    .line 1461
    .line 1462
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v8

    .line 1466
    move-object v9, v8

    .line 1467
    check-cast v9, Lee0;

    .line 1468
    .line 1469
    iget-object v9, v9, Lee0;->β:Ljava/lang/Class;

    .line 1470
    .line 1471
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v9

    .line 1475
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v10

    .line 1479
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v9

    .line 1483
    if-eqz v9, :cond_31

    .line 1484
    .line 1485
    goto :goto_23

    .line 1486
    :cond_32
    move-object/from16 v8, v19

    .line 1487
    .line 1488
    :goto_23
    check-cast v8, Lee0;

    .line 1489
    .line 1490
    const-string v1, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134A8047955A5084AA23D57E17339D0A0C270D1781D47F429F9219E1F2DEEB97CD2DD45AEADF9D95A748226E"

    .line 1491
    .line 1492
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v1

    .line 1496
    const-string v3, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836377D32BE7A7AC7622548C5CF9AE4AC67D9662B78E035F753B3E80AD9B5332717F492E0C5"

    .line 1497
    .line 1498
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v3

    .line 1502
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v1

    .line 1510
    new-instance v3, Ljava/util/ArrayList;

    .line 1511
    .line 1512
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1513
    .line 1514
    .line 1515
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v1

    .line 1519
    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1520
    .line 1521
    .line 1522
    move-result v9

    .line 1523
    const-class v10, Ljava/lang/Object;

    .line 1524
    .line 1525
    if-eqz v9, :cond_3d

    .line 1526
    .line 1527
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v9

    .line 1531
    check-cast v9, Ljava/lang/String;

    .line 1532
    .line 1533
    invoke-static {v12, v9}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v9

    .line 1537
    if-nez v9, :cond_34

    .line 1538
    .line 1539
    :cond_33
    move-object/from16 p0, v1

    .line 1540
    .line 1541
    move-object/from16 v23, v2

    .line 1542
    .line 1543
    move-object/from16 v26, v8

    .line 1544
    .line 1545
    :goto_25
    move-object/from16 v15, v19

    .line 1546
    .line 1547
    goto/16 :goto_2b

    .line 1548
    .line 1549
    :cond_34
    if-eqz v8, :cond_33

    .line 1550
    .line 1551
    iget-object v11, v8, Lee0;->α:Ljava/lang/reflect/Method;

    .line 1552
    .line 1553
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v13

    .line 1557
    :goto_26
    if-eqz v13, :cond_3a

    .line 1558
    .line 1559
    invoke-virtual {v13, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1560
    .line 1561
    .line 1562
    move-result v21

    .line 1563
    if-nez v21, :cond_3a

    .line 1564
    .line 1565
    invoke-virtual {v13}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v14

    .line 1569
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1570
    .line 1571
    .line 1572
    new-instance v15, Ljava/util/ArrayList;

    .line 1573
    .line 1574
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1575
    .line 1576
    .line 1577
    move-object/from16 p0, v1

    .line 1578
    .line 1579
    array-length v1, v14

    .line 1580
    move-object/from16 v23, v2

    .line 1581
    .line 1582
    const/4 v2, 0x0

    .line 1583
    :goto_27
    if-ge v2, v1, :cond_37

    .line 1584
    .line 1585
    move/from16 v24, v1

    .line 1586
    .line 1587
    aget-object v1, v14, v2

    .line 1588
    .line 1589
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1590
    .line 1591
    .line 1592
    move-result v25

    .line 1593
    invoke-static/range {v25 .. v25}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v25

    .line 1597
    if-nez v25, :cond_35

    .line 1598
    .line 1599
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 1600
    .line 1601
    .line 1602
    move-result v25

    .line 1603
    if-nez v25, :cond_35

    .line 1604
    .line 1605
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 1606
    .line 1607
    .line 1608
    move-result v25

    .line 1609
    if-nez v25, :cond_35

    .line 1610
    .line 1611
    move/from16 v25, v2

    .line 1612
    .line 1613
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v2

    .line 1617
    move-object/from16 v26, v8

    .line 1618
    .line 1619
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v8

    .line 1623
    invoke-static {v2, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1624
    .line 1625
    .line 1626
    move-result v2

    .line 1627
    if-eqz v2, :cond_36

    .line 1628
    .line 1629
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v2

    .line 1633
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v8

    .line 1637
    invoke-static {v2, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v2

    .line 1641
    if-eqz v2, :cond_36

    .line 1642
    .line 1643
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v2

    .line 1647
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v8

    .line 1651
    invoke-static {v2, v8}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 1652
    .line 1653
    .line 1654
    move-result v2

    .line 1655
    if-eqz v2, :cond_36

    .line 1656
    .line 1657
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1658
    .line 1659
    .line 1660
    goto :goto_28

    .line 1661
    :cond_35
    move/from16 v25, v2

    .line 1662
    .line 1663
    move-object/from16 v26, v8

    .line 1664
    .line 1665
    :cond_36
    :goto_28
    add-int/lit8 v2, v25, 0x1

    .line 1666
    .line 1667
    move/from16 v1, v24

    .line 1668
    .line 1669
    move-object/from16 v8, v26

    .line 1670
    .line 1671
    goto :goto_27

    .line 1672
    :cond_37
    move-object/from16 v26, v8

    .line 1673
    .line 1674
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1675
    .line 1676
    .line 1677
    move-result v1

    .line 1678
    const/4 v2, 0x1

    .line 1679
    if-le v1, v2, :cond_38

    .line 1680
    .line 1681
    :goto_29
    move-object/from16 v15, v19

    .line 1682
    .line 1683
    goto :goto_2a

    .line 1684
    :cond_38
    invoke-static {v15}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v1

    .line 1688
    move-object v15, v1

    .line 1689
    check-cast v15, Ljava/lang/reflect/Method;

    .line 1690
    .line 1691
    if-eqz v15, :cond_39

    .line 1692
    .line 1693
    invoke-virtual {v15, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1694
    .line 1695
    .line 1696
    goto :goto_2a

    .line 1697
    :cond_39
    invoke-virtual {v13}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v13

    .line 1701
    move-object/from16 v1, p0

    .line 1702
    .line 1703
    move-object/from16 v2, v23

    .line 1704
    .line 1705
    move-object/from16 v8, v26

    .line 1706
    .line 1707
    const/4 v14, 0x7

    .line 1708
    const/4 v15, 0x0

    .line 1709
    goto/16 :goto_26

    .line 1710
    .line 1711
    :cond_3a
    move-object/from16 p0, v1

    .line 1712
    .line 1713
    move-object/from16 v23, v2

    .line 1714
    .line 1715
    move-object/from16 v26, v8

    .line 1716
    .line 1717
    const/4 v2, 0x1

    .line 1718
    goto :goto_29

    .line 1719
    :goto_2a
    if-nez v15, :cond_3b

    .line 1720
    .line 1721
    goto/16 :goto_25

    .line 1722
    .line 1723
    :cond_3b
    new-instance v1, Lee0;

    .line 1724
    .line 1725
    const/4 v8, 0x0

    .line 1726
    invoke-direct {v1, v15, v9, v8, v2}, Lee0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Class;IZ)V

    .line 1727
    .line 1728
    .line 1729
    move-object v15, v1

    .line 1730
    :goto_2b
    if-eqz v15, :cond_3c

    .line 1731
    .line 1732
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1733
    .line 1734
    .line 1735
    :cond_3c
    move-object/from16 v1, p0

    .line 1736
    .line 1737
    move-object/from16 v2, v23

    .line 1738
    .line 1739
    move-object/from16 v8, v26

    .line 1740
    .line 1741
    const/4 v14, 0x7

    .line 1742
    const/4 v15, 0x0

    .line 1743
    goto/16 :goto_24

    .line 1744
    .line 1745
    :cond_3d
    move-object/from16 v23, v2

    .line 1746
    .line 1747
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v1

    .line 1751
    :goto_2c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1752
    .line 1753
    .line 1754
    move-result v2

    .line 1755
    if-eqz v2, :cond_3e

    .line 1756
    .line 1757
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v2

    .line 1761
    check-cast v2, Lee0;

    .line 1762
    .line 1763
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1764
    .line 1765
    .line 1766
    goto :goto_2c

    .line 1767
    :cond_3e
    const-string v1, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BE36B5FA44404BF5F45F392E3A1BDDAC42C132CD9ECBF24F8B727074D1C602B4D4"

    .line 1768
    .line 1769
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v1

    .line 1773
    const-string v2, "~788FC25F6ECFA50DD00C6DA13A7899CDD863E55178DDAE17670389C4CBEEA21BB6A89E77DB2ED9E42D8EECF2C9A0F474D904794CA12D6D1EFEA81D30FEE224C276466ED6F571"

    .line 1774
    .line 1775
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v2

    .line 1779
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v1

    .line 1783
    invoke-static {v1}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v1

    .line 1787
    new-instance v2, Ljava/util/ArrayList;

    .line 1788
    .line 1789
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1790
    .line 1791
    .line 1792
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    :goto_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1797
    .line 1798
    .line 1799
    move-result v3

    .line 1800
    const-string v8, "kotlin.coroutines.Continuation"

    .line 1801
    .line 1802
    if-eqz v3, :cond_48

    .line 1803
    .line 1804
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v3

    .line 1808
    check-cast v3, Ljava/lang/String;

    .line 1809
    .line 1810
    invoke-static {v12, v3}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v3

    .line 1814
    if-nez v3, :cond_3f

    .line 1815
    .line 1816
    move-object/from16 p0, v1

    .line 1817
    .line 1818
    :goto_2e
    move-object/from16 v15, v19

    .line 1819
    .line 1820
    goto/16 :goto_34

    .line 1821
    .line 1822
    :cond_3f
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v9

    .line 1826
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1827
    .line 1828
    .line 1829
    array-length v11, v9

    .line 1830
    move-object/from16 v15, v19

    .line 1831
    .line 1832
    const/4 v13, 0x0

    .line 1833
    const/4 v14, 0x0

    .line 1834
    :goto_2f
    if-ge v14, v11, :cond_44

    .line 1835
    .line 1836
    aget-object v24, v9, v14

    .line 1837
    .line 1838
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 1839
    .line 1840
    .line 1841
    move-result v25

    .line 1842
    invoke-static/range {v25 .. v25}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1843
    .line 1844
    .line 1845
    move-result v25

    .line 1846
    if-nez v25, :cond_42

    .line 1847
    .line 1848
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 1849
    .line 1850
    .line 1851
    move-result v25

    .line 1852
    if-nez v25, :cond_42

    .line 1853
    .line 1854
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 1855
    .line 1856
    .line 1857
    move-result v25

    .line 1858
    if-nez v25, :cond_42

    .line 1859
    .line 1860
    move-object/from16 p0, v1

    .line 1861
    .line 1862
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v1

    .line 1866
    invoke-static {v1, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1867
    .line 1868
    .line 1869
    move-result v1

    .line 1870
    if-eqz v1, :cond_41

    .line 1871
    .line 1872
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v1

    .line 1876
    array-length v1, v1

    .line 1877
    move-object/from16 v25, v9

    .line 1878
    .line 1879
    const/4 v9, 0x3

    .line 1880
    if-ne v1, v9, :cond_43

    .line 1881
    .line 1882
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v1

    .line 1886
    const/16 v22, 0x0

    .line 1887
    .line 1888
    aget-object v1, v1, v22

    .line 1889
    .line 1890
    invoke-static {v1, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1891
    .line 1892
    .line 1893
    move-result v1

    .line 1894
    if-eqz v1, :cond_43

    .line 1895
    .line 1896
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v1

    .line 1900
    const/16 v20, 0x1

    .line 1901
    .line 1902
    aget-object v1, v1, v20

    .line 1903
    .line 1904
    invoke-virtual {v6, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1905
    .line 1906
    .line 1907
    move-result v1

    .line 1908
    if-eqz v1, :cond_43

    .line 1909
    .line 1910
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v1

    .line 1914
    aget-object v1, v1, v20

    .line 1915
    .line 1916
    invoke-virtual {v1, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1917
    .line 1918
    .line 1919
    move-result v1

    .line 1920
    if-eqz v1, :cond_43

    .line 1921
    .line 1922
    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v1

    .line 1926
    const/16 v18, 0x2

    .line 1927
    .line 1928
    aget-object v1, v1, v18

    .line 1929
    .line 1930
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v1

    .line 1934
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1935
    .line 1936
    .line 1937
    move-result v1

    .line 1938
    if-eqz v1, :cond_43

    .line 1939
    .line 1940
    if-eqz v13, :cond_40

    .line 1941
    .line 1942
    :goto_30
    move-object/from16 v15, v19

    .line 1943
    .line 1944
    goto :goto_33

    .line 1945
    :cond_40
    move-object/from16 v15, v24

    .line 1946
    .line 1947
    const/4 v13, 0x1

    .line 1948
    goto :goto_32

    .line 1949
    :cond_41
    :goto_31
    move-object/from16 v25, v9

    .line 1950
    .line 1951
    goto :goto_32

    .line 1952
    :cond_42
    move-object/from16 p0, v1

    .line 1953
    .line 1954
    goto :goto_31

    .line 1955
    :cond_43
    :goto_32
    add-int/lit8 v14, v14, 0x1

    .line 1956
    .line 1957
    move-object/from16 v1, p0

    .line 1958
    .line 1959
    move-object/from16 v9, v25

    .line 1960
    .line 1961
    goto :goto_2f

    .line 1962
    :cond_44
    move-object/from16 p0, v1

    .line 1963
    .line 1964
    if-nez v13, :cond_45

    .line 1965
    .line 1966
    goto :goto_30

    .line 1967
    :cond_45
    :goto_33
    if-nez v15, :cond_46

    .line 1968
    .line 1969
    goto/16 :goto_2e

    .line 1970
    .line 1971
    :cond_46
    const/4 v11, 0x1

    .line 1972
    invoke-virtual {v15, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1973
    .line 1974
    .line 1975
    new-instance v1, Lee0;

    .line 1976
    .line 1977
    const/4 v8, 0x0

    .line 1978
    invoke-direct {v1, v15, v3, v11, v8}, Lee0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Class;IZ)V

    .line 1979
    .line 1980
    .line 1981
    move-object v15, v1

    .line 1982
    :goto_34
    if-eqz v15, :cond_47

    .line 1983
    .line 1984
    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1985
    .line 1986
    .line 1987
    :cond_47
    move-object/from16 v1, p0

    .line 1988
    .line 1989
    goto/16 :goto_2d

    .line 1990
    .line 1991
    :cond_48
    const-string v1, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BE36B5FA44404BF5F45F392E3A1BC2A050C77FE8D1F2F67787526151C2D10BB4D4"

    .line 1992
    .line 1993
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v1

    .line 1997
    invoke-static {v12, v1}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v1

    .line 2001
    if-nez v1, :cond_49

    .line 2002
    .line 2003
    :goto_35
    move-object/from16 v15, v19

    .line 2004
    .line 2005
    goto/16 :goto_3a

    .line 2006
    .line 2007
    :cond_49
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v3

    .line 2011
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2012
    .line 2013
    .line 2014
    array-length v7, v3

    .line 2015
    move-object/from16 v15, v19

    .line 2016
    .line 2017
    const/4 v9, 0x0

    .line 2018
    const/4 v11, 0x0

    .line 2019
    :goto_36
    if-ge v11, v7, :cond_4d

    .line 2020
    .line 2021
    aget-object v13, v3, v11

    .line 2022
    .line 2023
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2024
    .line 2025
    .line 2026
    move-result v14

    .line 2027
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 2028
    .line 2029
    .line 2030
    move-result v14

    .line 2031
    if-nez v14, :cond_4b

    .line 2032
    .line 2033
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 2034
    .line 2035
    .line 2036
    move-result v14

    .line 2037
    if-nez v14, :cond_4b

    .line 2038
    .line 2039
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 2040
    .line 2041
    .line 2042
    move-result v14

    .line 2043
    if-nez v14, :cond_4b

    .line 2044
    .line 2045
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v14

    .line 2049
    invoke-static {v14, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2050
    .line 2051
    .line 2052
    move-result v14

    .line 2053
    if-eqz v14, :cond_4b

    .line 2054
    .line 2055
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v14

    .line 2059
    array-length v14, v14

    .line 2060
    move-object/from16 p0, v3

    .line 2061
    .line 2062
    const/4 v3, 0x3

    .line 2063
    if-ne v14, v3, :cond_4c

    .line 2064
    .line 2065
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v3

    .line 2069
    const/16 v22, 0x0

    .line 2070
    .line 2071
    aget-object v3, v3, v22

    .line 2072
    .line 2073
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2074
    .line 2075
    .line 2076
    move-result v3

    .line 2077
    if-eqz v3, :cond_4c

    .line 2078
    .line 2079
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v3

    .line 2083
    aget-object v3, v3, v22

    .line 2084
    .line 2085
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 2086
    .line 2087
    .line 2088
    move-result v3

    .line 2089
    if-eqz v3, :cond_4c

    .line 2090
    .line 2091
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v3

    .line 2095
    const/16 v20, 0x1

    .line 2096
    .line 2097
    aget-object v3, v3, v20

    .line 2098
    .line 2099
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v3

    .line 2103
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2104
    .line 2105
    .line 2106
    move-result v3

    .line 2107
    if-eqz v3, :cond_4c

    .line 2108
    .line 2109
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v3

    .line 2113
    const/16 v18, 0x2

    .line 2114
    .line 2115
    aget-object v3, v3, v18

    .line 2116
    .line 2117
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2118
    .line 2119
    .line 2120
    move-result v3

    .line 2121
    if-eqz v3, :cond_4c

    .line 2122
    .line 2123
    if-eqz v9, :cond_4a

    .line 2124
    .line 2125
    :goto_37
    move-object/from16 v15, v19

    .line 2126
    .line 2127
    goto :goto_39

    .line 2128
    :cond_4a
    move-object v15, v13

    .line 2129
    const/4 v9, 0x1

    .line 2130
    goto :goto_38

    .line 2131
    :cond_4b
    move-object/from16 p0, v3

    .line 2132
    .line 2133
    :cond_4c
    :goto_38
    add-int/lit8 v11, v11, 0x1

    .line 2134
    .line 2135
    move-object/from16 v3, p0

    .line 2136
    .line 2137
    goto :goto_36

    .line 2138
    :cond_4d
    if-nez v9, :cond_4e

    .line 2139
    .line 2140
    goto :goto_37

    .line 2141
    :cond_4e
    :goto_39
    if-nez v15, :cond_4f

    .line 2142
    .line 2143
    goto/16 :goto_35

    .line 2144
    .line 2145
    :cond_4f
    const/4 v11, 0x1

    .line 2146
    invoke-virtual {v15, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 2147
    .line 2148
    .line 2149
    new-instance v3, Lee0;

    .line 2150
    .line 2151
    const/4 v8, 0x0

    .line 2152
    invoke-direct {v3, v15, v1, v8, v8}, Lee0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Class;IZ)V

    .line 2153
    .line 2154
    .line 2155
    move-object v15, v3

    .line 2156
    :goto_3a
    invoke-static {v15}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v1

    .line 2160
    invoke-static {v2, v1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2161
    .line 2162
    .line 2163
    move-result-object v1

    .line 2164
    invoke-static {v0, v1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v0

    .line 2168
    new-instance v1, Ljava/util/HashSet;

    .line 2169
    .line 2170
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 2171
    .line 2172
    .line 2173
    new-instance v8, Ljava/util/ArrayList;

    .line 2174
    .line 2175
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 2176
    .line 2177
    .line 2178
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v0

    .line 2182
    :cond_50
    :goto_3b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2183
    .line 2184
    .line 2185
    move-result v2

    .line 2186
    if-eqz v2, :cond_51

    .line 2187
    .line 2188
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v2

    .line 2192
    move-object v3, v2

    .line 2193
    check-cast v3, Lee0;

    .line 2194
    .line 2195
    iget-object v4, v3, Lee0;->α:Ljava/lang/reflect/Method;

    .line 2196
    .line 2197
    invoke-static {v4}, Lxb;->Ο(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v4

    .line 2201
    iget-object v5, v3, Lee0;->β:Ljava/lang/Class;

    .line 2202
    .line 2203
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v5

    .line 2207
    iget v3, v3, Lee0;->γ:I

    .line 2208
    .line 2209
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2210
    .line 2211
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 2212
    .line 2213
    .line 2214
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2215
    .line 2216
    .line 2217
    const-string v4, "@"

    .line 2218
    .line 2219
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2220
    .line 2221
    .line 2222
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2223
    .line 2224
    .line 2225
    const-string v4, ":"

    .line 2226
    .line 2227
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2228
    .line 2229
    .line 2230
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2231
    .line 2232
    .line 2233
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v3

    .line 2237
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2238
    .line 2239
    .line 2240
    move-result v3

    .line 2241
    if-eqz v3, :cond_50

    .line 2242
    .line 2243
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2244
    .line 2245
    .line 2246
    goto :goto_3b

    .line 2247
    :cond_51
    const-string v0, "~788FC25F6ECFA50DD00C6DA13A7899CDD863E55178DDAE17670887DCC2AFB813ACAAC36CD338D4E23588EDA885A8FA63D3591A60BA3A5B35E6AC053ADCC832DA5E6576D8C057"

    .line 2248
    .line 2249
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v0

    .line 2253
    const-string v1, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572BB9CBA168999EC19B64CD4B34ABBFA246174AEFAB1EA23FD1714D0CFBED7F41E218105755558A1760623620D811B30D0186C91DC054E0A392"

    .line 2254
    .line 2255
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v1

    .line 2259
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v0

    .line 2263
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v0

    .line 2267
    new-instance v1, Ljava/util/ArrayList;

    .line 2268
    .line 2269
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2270
    .line 2271
    .line 2272
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v2

    .line 2276
    :cond_52
    :goto_3c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2277
    .line 2278
    .line 2279
    move-result v0

    .line 2280
    if-eqz v0, :cond_55

    .line 2281
    .line 2282
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v0

    .line 2286
    check-cast v0, Ljava/lang/String;

    .line 2287
    .line 2288
    invoke-static {v12, v0}, Lxb;->Ν(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v0

    .line 2292
    if-nez v0, :cond_53

    .line 2293
    .line 2294
    move-object/from16 v15, v19

    .line 2295
    .line 2296
    goto :goto_3e

    .line 2297
    :cond_53
    :try_start_2
    invoke-static {v0}, Lxb;->Α(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 2301
    move-object v15, v0

    .line 2302
    goto :goto_3d

    .line 2303
    :catchall_2
    move-exception v0

    .line 2304
    new-instance v3, Leo1;

    .line 2305
    .line 2306
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2307
    .line 2308
    .line 2309
    move-object v15, v3

    .line 2310
    :goto_3d
    instance-of v0, v15, Leo1;

    .line 2311
    .line 2312
    if-eqz v0, :cond_54

    .line 2313
    .line 2314
    move-object/from16 v15, v19

    .line 2315
    .line 2316
    :cond_54
    check-cast v15, Ljava/lang/reflect/Method;

    .line 2317
    .line 2318
    :goto_3e
    if-eqz v15, :cond_52

    .line 2319
    .line 2320
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2321
    .line 2322
    .line 2323
    goto :goto_3c

    .line 2324
    :cond_55
    new-instance v0, Ljava/util/HashSet;

    .line 2325
    .line 2326
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 2327
    .line 2328
    .line 2329
    new-instance v9, Ljava/util/ArrayList;

    .line 2330
    .line 2331
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2332
    .line 2333
    .line 2334
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v1

    .line 2338
    :cond_56
    :goto_3f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2339
    .line 2340
    .line 2341
    move-result v2

    .line 2342
    if-eqz v2, :cond_57

    .line 2343
    .line 2344
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v2

    .line 2348
    move-object v3, v2

    .line 2349
    check-cast v3, Ljava/lang/reflect/Method;

    .line 2350
    .line 2351
    invoke-static {v3}, Lxb;->Ο(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v3

    .line 2355
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2356
    .line 2357
    .line 2358
    move-result v3

    .line 2359
    if-eqz v3, :cond_56

    .line 2360
    .line 2361
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2362
    .line 2363
    .line 2364
    goto :goto_3f

    .line 2365
    :cond_57
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2366
    .line 2367
    .line 2368
    move-result v0

    .line 2369
    if-nez v0, :cond_5a

    .line 2370
    .line 2371
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v0

    .line 2375
    :goto_40
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2376
    .line 2377
    .line 2378
    move-result v1

    .line 2379
    if-eqz v1, :cond_58

    .line 2380
    .line 2381
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v1

    .line 2385
    check-cast v1, Lee0;

    .line 2386
    .line 2387
    sget-object v2, Lxq0;->α:Lxq0;

    .line 2388
    .line 2389
    iget-object v3, v1, Lee0;->α:Ljava/lang/reflect/Method;

    .line 2390
    .line 2391
    new-instance v4, Lnh;

    .line 2392
    .line 2393
    const/4 v5, 0x7

    .line 2394
    invoke-direct {v4, v5, v1}, Lnh;-><init>(ILjava/lang/Object;)V

    .line 2395
    .line 2396
    .line 2397
    invoke-virtual {v2, v3, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 2398
    .line 2399
    .line 2400
    goto :goto_40

    .line 2401
    :cond_58
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v0

    .line 2405
    :goto_41
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2406
    .line 2407
    .line 2408
    move-result v1

    .line 2409
    if-eqz v1, :cond_59

    .line 2410
    .line 2411
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v1

    .line 2415
    check-cast v1, Ljava/lang/reflect/Method;

    .line 2416
    .line 2417
    sget-object v2, Lxq0;->α:Lxq0;

    .line 2418
    .line 2419
    new-instance v3, Lad1;

    .line 2420
    .line 2421
    const/16 v4, 0xf

    .line 2422
    .line 2423
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 2424
    .line 2425
    .line 2426
    invoke-virtual {v2, v1, v3}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 2427
    .line 2428
    .line 2429
    goto :goto_41

    .line 2430
    :cond_59
    sget-object v10, Lbe0;->α:Lbe0;

    .line 2431
    .line 2432
    new-instance v0, Lw0;

    .line 2433
    .line 2434
    const/4 v6, 0x0

    .line 2435
    const/16 v7, 0x9

    .line 2436
    .line 2437
    const/4 v1, 0x0

    .line 2438
    const-class v3, Lcn1;

    .line 2439
    .line 2440
    const-string v4, "refreshActiveAdapters"

    .line 2441
    .line 2442
    const-string v5, "refreshActiveAdapters()V"

    .line 2443
    .line 2444
    move-object/from16 v2, v23

    .line 2445
    .line 2446
    invoke-direct/range {v0 .. v7}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 2447
    .line 2448
    .line 2449
    invoke-virtual {v10}, Lbe0;->ε()V

    .line 2450
    .line 2451
    .line 2452
    sget-object v1, Lbe0;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2453
    .line 2454
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2455
    .line 2456
    .line 2457
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 2458
    .line 2459
    .line 2460
    move-result v0

    .line 2461
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 2462
    .line 2463
    .line 2464
    move-result v1

    .line 2465
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2466
    .line 2467
    const-string v3, "installed submit="

    .line 2468
    .line 2469
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2470
    .line 2471
    .line 2472
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2473
    .line 2474
    .line 2475
    const-string v0, " bind="

    .line 2476
    .line 2477
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2478
    .line 2479
    .line 2480
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2481
    .line 2482
    .line 2483
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2484
    .line 2485
    .line 2486
    move-result-object v0

    .line 2487
    const-string v1, "reae2c2e0c445b34d"

    .line 2488
    .line 2489
    invoke-static {v1, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 2490
    .line 2491
    .line 2492
    :goto_42
    move-object/from16 v12, v17

    .line 2493
    .line 2494
    goto :goto_43

    .line 2495
    :cond_5a
    const-string v0, "\u672a\u627e\u5230\u4efb\u4f55\u5df2\u77e5\u5173\u7cfb\u5217\u8868\u63d0\u4ea4\u5165\u53e3"

    .line 2496
    .line 2497
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 2498
    .line 2499
    .line 2500
    move-object/from16 v12, v19

    .line 2501
    .line 2502
    :goto_43
    return-object v12

    .line 2503
    :pswitch_13
    move v11, v10

    .line 2504
    invoke-static {v12, v11}, Lh30;->ε(Ljava/lang/ClassLoader;Z)V

    .line 2505
    .line 2506
    .line 2507
    return-object v17

    .line 2508
    :pswitch_14
    move v11, v10

    .line 2509
    sget-object v0, Lb30;->α:Lb30;

    .line 2510
    .line 2511
    invoke-virtual {v0, v12, v11}, Lb30;->ε(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 2512
    .line 2513
    .line 2514
    return-object v17

    .line 2515
    :pswitch_15
    move v11, v10

    .line 2516
    sget-object v0, Lb30;->α:Lb30;

    .line 2517
    .line 2518
    invoke-virtual {v0, v12, v11}, Lb30;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 2519
    .line 2520
    .line 2521
    return-object v17

    .line 2522
    :pswitch_16
    const/16 v19, 0x0

    .line 2523
    .line 2524
    const-string v0, "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"

    .line 2525
    .line 2526
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v1

    .line 2530
    const/4 v8, 0x0

    .line 2531
    :try_start_3
    invoke-static {v1, v8, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2532
    .line 2533
    .line 2534
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 2535
    move-object v15, v0

    .line 2536
    goto :goto_44

    .line 2537
    :catchall_3
    move-exception v0

    .line 2538
    new-instance v2, Leo1;

    .line 2539
    .line 2540
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2541
    .line 2542
    .line 2543
    move-object v15, v2

    .line 2544
    :goto_44
    instance-of v0, v15, Leo1;

    .line 2545
    .line 2546
    if-eqz v0, :cond_5b

    .line 2547
    .line 2548
    move-object/from16 v15, v19

    .line 2549
    .line 2550
    :cond_5b
    check-cast v15, Ljava/lang/Class;

    .line 2551
    .line 2552
    if-nez v15, :cond_5d

    .line 2553
    .line 2554
    :try_start_4
    invoke-virtual {v12, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 2555
    .line 2556
    .line 2557
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 2558
    goto :goto_45

    .line 2559
    :catchall_4
    move-exception v0

    .line 2560
    new-instance v1, Leo1;

    .line 2561
    .line 2562
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2563
    .line 2564
    .line 2565
    move-object v0, v1

    .line 2566
    :goto_45
    instance-of v1, v0, Leo1;

    .line 2567
    .line 2568
    if-eqz v1, :cond_5c

    .line 2569
    .line 2570
    move-object/from16 v12, v19

    .line 2571
    .line 2572
    goto :goto_46

    .line 2573
    :cond_5c
    move-object v12, v0

    .line 2574
    :goto_46
    move-object v15, v12

    .line 2575
    check-cast v15, Ljava/lang/Class;

    .line 2576
    .line 2577
    :cond_5d
    if-nez v15, :cond_5e

    .line 2578
    .line 2579
    goto/16 :goto_4a

    .line 2580
    .line 2581
    :cond_5e
    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v0

    .line 2585
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2586
    .line 2587
    .line 2588
    new-instance v11, Ljava/util/ArrayList;

    .line 2589
    .line 2590
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 2591
    .line 2592
    .line 2593
    array-length v1, v0

    .line 2594
    const/4 v15, 0x0

    .line 2595
    :goto_47
    if-ge v15, v1, :cond_62

    .line 2596
    .line 2597
    aget-object v2, v0, v15

    .line 2598
    .line 2599
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2600
    .line 2601
    .line 2602
    move-result v3

    .line 2603
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 2604
    .line 2605
    .line 2606
    move-result v3

    .line 2607
    if-nez v3, :cond_5f

    .line 2608
    .line 2609
    goto :goto_49

    .line 2610
    :cond_5f
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2611
    .line 2612
    .line 2613
    move-result-object v3

    .line 2614
    if-eqz v3, :cond_61

    .line 2615
    .line 2616
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 2617
    .line 2618
    .line 2619
    move-result v4

    .line 2620
    sparse-switch v4, :sswitch_data_0

    .line 2621
    .line 2622
    .line 2623
    goto :goto_49

    .line 2624
    :sswitch_0
    const-string v4, "addPreloadMedias"

    .line 2625
    .line 2626
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2627
    .line 2628
    .line 2629
    move-result v3

    .line 2630
    if-nez v3, :cond_60

    .line 2631
    .line 2632
    goto :goto_49

    .line 2633
    :sswitch_1
    const-string v4, "insertPreloadMedia"

    .line 2634
    .line 2635
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2636
    .line 2637
    .line 2638
    move-result v3

    .line 2639
    if-nez v3, :cond_60

    .line 2640
    .line 2641
    goto :goto_49

    .line 2642
    :sswitch_2
    const-string v4, "addTask"

    .line 2643
    .line 2644
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2645
    .line 2646
    .line 2647
    move-result v3

    .line 2648
    if-eqz v3, :cond_61

    .line 2649
    .line 2650
    goto :goto_48

    .line 2651
    :sswitch_3
    const-string v4, "addPreloadModelMedia"

    .line 2652
    .line 2653
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2654
    .line 2655
    .line 2656
    move-result v3

    .line 2657
    if-nez v3, :cond_60

    .line 2658
    .line 2659
    goto :goto_49

    .line 2660
    :sswitch_4
    const-string v4, "startDataLoader"

    .line 2661
    .line 2662
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2663
    .line 2664
    .line 2665
    move-result v3

    .line 2666
    if-nez v3, :cond_60

    .line 2667
    .line 2668
    goto :goto_49

    .line 2669
    :sswitch_5
    const-string v4, "addPriorityPreloadTask"

    .line 2670
    .line 2671
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2672
    .line 2673
    .line 2674
    move-result v3

    .line 2675
    if-nez v3, :cond_60

    .line 2676
    .line 2677
    goto :goto_49

    .line 2678
    :sswitch_6
    const-string v4, "setIntValue"

    .line 2679
    .line 2680
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2681
    .line 2682
    .line 2683
    move-result v3

    .line 2684
    if-nez v3, :cond_60

    .line 2685
    .line 2686
    goto :goto_49

    .line 2687
    :cond_60
    :goto_48
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2688
    .line 2689
    .line 2690
    :cond_61
    :goto_49
    add-int/lit8 v15, v15, 0x1

    .line 2691
    .line 2692
    goto :goto_47

    .line 2693
    :cond_62
    :goto_4a
    return-object v11

    .line 2694
    :pswitch_17
    const/16 v19, 0x0

    .line 2695
    .line 2696
    const-string v0, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"

    .line 2697
    .line 2698
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2699
    .line 2700
    .line 2701
    move-result-object v1

    .line 2702
    const/4 v8, 0x0

    .line 2703
    :try_start_5
    invoke-static {v1, v8, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 2707
    move-object v15, v0

    .line 2708
    goto :goto_4b

    .line 2709
    :catchall_5
    move-exception v0

    .line 2710
    new-instance v4, Leo1;

    .line 2711
    .line 2712
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2713
    .line 2714
    .line 2715
    move-object v15, v4

    .line 2716
    :goto_4b
    instance-of v0, v15, Leo1;

    .line 2717
    .line 2718
    if-eqz v0, :cond_63

    .line 2719
    .line 2720
    move-object/from16 v15, v19

    .line 2721
    .line 2722
    :cond_63
    check-cast v15, Ljava/lang/Class;

    .line 2723
    .line 2724
    if-nez v15, :cond_65

    .line 2725
    .line 2726
    :try_start_6
    invoke-virtual {v12, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 2730
    goto :goto_4c

    .line 2731
    :catchall_6
    move-exception v0

    .line 2732
    new-instance v1, Leo1;

    .line 2733
    .line 2734
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2735
    .line 2736
    .line 2737
    move-object v0, v1

    .line 2738
    :goto_4c
    instance-of v1, v0, Leo1;

    .line 2739
    .line 2740
    if-eqz v1, :cond_64

    .line 2741
    .line 2742
    move-object/from16 v12, v19

    .line 2743
    .line 2744
    goto :goto_4d

    .line 2745
    :cond_64
    move-object v12, v0

    .line 2746
    :goto_4d
    move-object v15, v12

    .line 2747
    check-cast v15, Ljava/lang/Class;

    .line 2748
    .line 2749
    :cond_65
    if-nez v15, :cond_66

    .line 2750
    .line 2751
    goto :goto_4f

    .line 2752
    :cond_66
    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v0

    .line 2756
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2757
    .line 2758
    .line 2759
    new-instance v11, Ljava/util/ArrayList;

    .line 2760
    .line 2761
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 2762
    .line 2763
    .line 2764
    array-length v1, v0

    .line 2765
    const/4 v15, 0x0

    .line 2766
    :goto_4e
    if-ge v15, v1, :cond_69

    .line 2767
    .line 2768
    aget-object v4, v0, v15

    .line 2769
    .line 2770
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2771
    .line 2772
    .line 2773
    move-result-object v5

    .line 2774
    invoke-static {v5, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2775
    .line 2776
    .line 2777
    move-result v5

    .line 2778
    if-eqz v5, :cond_68

    .line 2779
    .line 2780
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2781
    .line 2782
    .line 2783
    move-result-object v5

    .line 2784
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v6

    .line 2788
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 2789
    .line 2790
    .line 2791
    move-result v5

    .line 2792
    if-eqz v5, :cond_68

    .line 2793
    .line 2794
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v5

    .line 2798
    const-string v6, "onViewHolderSelected"

    .line 2799
    .line 2800
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2801
    .line 2802
    .line 2803
    move-result v5

    .line 2804
    if-nez v5, :cond_67

    .line 2805
    .line 2806
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v5

    .line 2810
    invoke-static {v5, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2811
    .line 2812
    .line 2813
    move-result v5

    .line 2814
    if-eqz v5, :cond_68

    .line 2815
    .line 2816
    :cond_67
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2817
    .line 2818
    .line 2819
    :cond_68
    add-int/lit8 v15, v15, 0x1

    .line 2820
    .line 2821
    goto :goto_4e

    .line 2822
    :cond_69
    :goto_4f
    return-object v11

    .line 2823
    :pswitch_18
    const/16 v19, 0x0

    .line 2824
    .line 2825
    const-string v0, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114A712E5C4081A28670C45E2406907F30C98529BCD560A07F329B080"

    .line 2826
    .line 2827
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 2828
    .line 2829
    .line 2830
    move-result-object v1

    .line 2831
    const/4 v8, 0x0

    .line 2832
    :try_start_7
    invoke-static {v1, v8, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 2833
    .line 2834
    .line 2835
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 2836
    move-object v15, v0

    .line 2837
    goto :goto_50

    .line 2838
    :catchall_7
    move-exception v0

    .line 2839
    new-instance v2, Leo1;

    .line 2840
    .line 2841
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2842
    .line 2843
    .line 2844
    move-object v15, v2

    .line 2845
    :goto_50
    instance-of v0, v15, Leo1;

    .line 2846
    .line 2847
    if-eqz v0, :cond_6a

    .line 2848
    .line 2849
    move-object/from16 v15, v19

    .line 2850
    .line 2851
    :cond_6a
    check-cast v15, Ljava/lang/Class;

    .line 2852
    .line 2853
    if-nez v15, :cond_6c

    .line 2854
    .line 2855
    :try_start_8
    invoke-virtual {v12, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 2856
    .line 2857
    .line 2858
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 2859
    goto :goto_51

    .line 2860
    :catchall_8
    move-exception v0

    .line 2861
    new-instance v1, Leo1;

    .line 2862
    .line 2863
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2864
    .line 2865
    .line 2866
    move-object v0, v1

    .line 2867
    :goto_51
    instance-of v1, v0, Leo1;

    .line 2868
    .line 2869
    if-eqz v1, :cond_6b

    .line 2870
    .line 2871
    move-object/from16 v12, v19

    .line 2872
    .line 2873
    goto :goto_52

    .line 2874
    :cond_6b
    move-object v12, v0

    .line 2875
    :goto_52
    move-object v15, v12

    .line 2876
    check-cast v15, Ljava/lang/Class;

    .line 2877
    .line 2878
    :cond_6c
    if-nez v15, :cond_6d

    .line 2879
    .line 2880
    goto/16 :goto_57

    .line 2881
    .line 2882
    :cond_6d
    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2883
    .line 2884
    .line 2885
    move-result-object v0

    .line 2886
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2887
    .line 2888
    .line 2889
    new-instance v11, Ljava/util/ArrayList;

    .line 2890
    .line 2891
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 2892
    .line 2893
    .line 2894
    array-length v1, v0

    .line 2895
    const/4 v8, 0x0

    .line 2896
    :goto_53
    if-ge v8, v1, :cond_74

    .line 2897
    .line 2898
    aget-object v2, v0, v8

    .line 2899
    .line 2900
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v5

    .line 2904
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v6

    .line 2908
    invoke-static {v6, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2909
    .line 2910
    .line 2911
    move-result v6

    .line 2912
    if-eqz v6, :cond_6e

    .line 2913
    .line 2914
    array-length v6, v5

    .line 2915
    const/4 v7, 0x2

    .line 2916
    if-ne v6, v7, :cond_6e

    .line 2917
    .line 2918
    const/16 v22, 0x0

    .line 2919
    .line 2920
    aget-object v6, v5, v22

    .line 2921
    .line 2922
    invoke-static {v6, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2923
    .line 2924
    .line 2925
    move-result v6

    .line 2926
    if-eqz v6, :cond_6e

    .line 2927
    .line 2928
    const/16 v20, 0x1

    .line 2929
    .line 2930
    aget-object v6, v5, v20

    .line 2931
    .line 2932
    invoke-static {v6, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2933
    .line 2934
    .line 2935
    move-result v6

    .line 2936
    if-eqz v6, :cond_6e

    .line 2937
    .line 2938
    const/4 v6, 0x1

    .line 2939
    goto :goto_54

    .line 2940
    :cond_6e
    const/4 v6, 0x0

    .line 2941
    :goto_54
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v7

    .line 2945
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2946
    .line 2947
    .line 2948
    move-result-object v7

    .line 2949
    const-string v9, "android.view.View"

    .line 2950
    .line 2951
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2952
    .line 2953
    .line 2954
    move-result v7

    .line 2955
    if-eqz v7, :cond_6f

    .line 2956
    .line 2957
    array-length v7, v5

    .line 2958
    const/4 v9, 0x3

    .line 2959
    if-ne v7, v9, :cond_6f

    .line 2960
    .line 2961
    const/16 v22, 0x0

    .line 2962
    .line 2963
    aget-object v7, v5, v22

    .line 2964
    .line 2965
    invoke-static {v7, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2966
    .line 2967
    .line 2968
    move-result v7

    .line 2969
    if-eqz v7, :cond_6f

    .line 2970
    .line 2971
    const/16 v20, 0x1

    .line 2972
    .line 2973
    aget-object v7, v5, v20

    .line 2974
    .line 2975
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2976
    .line 2977
    .line 2978
    move-result-object v7

    .line 2979
    const-string v9, "android.view.ViewGroup"

    .line 2980
    .line 2981
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2982
    .line 2983
    .line 2984
    move-result v7

    .line 2985
    if-eqz v7, :cond_6f

    .line 2986
    .line 2987
    const/16 v18, 0x2

    .line 2988
    .line 2989
    aget-object v7, v5, v18

    .line 2990
    .line 2991
    invoke-static {v7, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2992
    .line 2993
    .line 2994
    move-result v7

    .line 2995
    if-eqz v7, :cond_70

    .line 2996
    .line 2997
    const/4 v7, 0x1

    .line 2998
    goto :goto_55

    .line 2999
    :cond_6f
    const/16 v18, 0x2

    .line 3000
    .line 3001
    :cond_70
    const/4 v7, 0x0

    .line 3002
    :goto_55
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 3003
    .line 3004
    .line 3005
    move-result-object v9

    .line 3006
    invoke-static {v9, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3007
    .line 3008
    .line 3009
    move-result v9

    .line 3010
    if-eqz v9, :cond_71

    .line 3011
    .line 3012
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3013
    .line 3014
    .line 3015
    array-length v5, v5

    .line 3016
    if-nez v5, :cond_71

    .line 3017
    .line 3018
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v5

    .line 3022
    const-string v9, "preloadTypeConfig"

    .line 3023
    .line 3024
    invoke-static {v5, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3025
    .line 3026
    .line 3027
    move-result v5

    .line 3028
    if-eqz v5, :cond_71

    .line 3029
    .line 3030
    const/4 v5, 0x1

    .line 3031
    goto :goto_56

    .line 3032
    :cond_71
    const/4 v5, 0x0

    .line 3033
    :goto_56
    if-nez v6, :cond_72

    .line 3034
    .line 3035
    if-nez v7, :cond_72

    .line 3036
    .line 3037
    if-eqz v5, :cond_73

    .line 3038
    .line 3039
    :cond_72
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3040
    .line 3041
    .line 3042
    :cond_73
    add-int/lit8 v8, v8, 0x1

    .line 3043
    .line 3044
    goto/16 :goto_53

    .line 3045
    .line 3046
    :cond_74
    :goto_57
    return-object v11

    .line 3047
    :pswitch_19
    invoke-static {v12}, Lpd2;->Ν(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 3048
    .line 3049
    .line 3050
    move-result-object v0

    .line 3051
    return-object v0

    .line 3052
    :pswitch_1a
    const/16 v19, 0x0

    .line 3053
    .line 3054
    const-string v0, "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF250DFFBABD88BD10A5BD02F440065394451D69947F04BBCE04B57E6716670F470E23AF1A7836C1D4E3DA9F3C8C5B0E78"

    .line 3055
    .line 3056
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 3057
    .line 3058
    .line 3059
    move-result-object v1

    .line 3060
    const/4 v8, 0x0

    .line 3061
    :try_start_9
    invoke-static {v1, v8, v12}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 3062
    .line 3063
    .line 3064
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 3065
    move-object v15, v0

    .line 3066
    goto :goto_58

    .line 3067
    :catchall_9
    move-exception v0

    .line 3068
    new-instance v3, Leo1;

    .line 3069
    .line 3070
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 3071
    .line 3072
    .line 3073
    move-object v15, v3

    .line 3074
    :goto_58
    instance-of v0, v15, Leo1;

    .line 3075
    .line 3076
    if-eqz v0, :cond_75

    .line 3077
    .line 3078
    move-object/from16 v15, v19

    .line 3079
    .line 3080
    :cond_75
    check-cast v15, Ljava/lang/Class;

    .line 3081
    .line 3082
    if-nez v15, :cond_77

    .line 3083
    .line 3084
    :try_start_a
    invoke-virtual {v12, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 3085
    .line 3086
    .line 3087
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 3088
    goto :goto_59

    .line 3089
    :catchall_a
    move-exception v0

    .line 3090
    new-instance v1, Leo1;

    .line 3091
    .line 3092
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 3093
    .line 3094
    .line 3095
    move-object v0, v1

    .line 3096
    :goto_59
    instance-of v1, v0, Leo1;

    .line 3097
    .line 3098
    if-eqz v1, :cond_76

    .line 3099
    .line 3100
    move-object/from16 v12, v19

    .line 3101
    .line 3102
    goto :goto_5a

    .line 3103
    :cond_76
    move-object v12, v0

    .line 3104
    :goto_5a
    move-object v15, v12

    .line 3105
    check-cast v15, Ljava/lang/Class;

    .line 3106
    .line 3107
    :cond_77
    if-nez v15, :cond_78

    .line 3108
    .line 3109
    goto :goto_5c

    .line 3110
    :cond_78
    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 3111
    .line 3112
    .line 3113
    move-result-object v0

    .line 3114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3115
    .line 3116
    .line 3117
    new-instance v11, Ljava/util/ArrayList;

    .line 3118
    .line 3119
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 3120
    .line 3121
    .line 3122
    array-length v1, v0

    .line 3123
    move v15, v8

    .line 3124
    :goto_5b
    if-ge v15, v1, :cond_7b

    .line 3125
    .line 3126
    aget-object v3, v0, v15

    .line 3127
    .line 3128
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 3129
    .line 3130
    .line 3131
    move-result-object v4

    .line 3132
    invoke-static {v4, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3133
    .line 3134
    .line 3135
    move-result v4

    .line 3136
    if-eqz v4, :cond_7a

    .line 3137
    .line 3138
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 3139
    .line 3140
    .line 3141
    move-result-object v4

    .line 3142
    const-string v5, "LJJJJZ"

    .line 3143
    .line 3144
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3145
    .line 3146
    .line 3147
    move-result v4

    .line 3148
    if-nez v4, :cond_79

    .line 3149
    .line 3150
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 3151
    .line 3152
    .line 3153
    move-result-object v4

    .line 3154
    invoke-static {v4, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3155
    .line 3156
    .line 3157
    move-result v4

    .line 3158
    if-eqz v4, :cond_7a

    .line 3159
    .line 3160
    :cond_79
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3161
    .line 3162
    .line 3163
    :cond_7a
    add-int/lit8 v15, v15, 0x1

    .line 3164
    .line 3165
    goto :goto_5b

    .line 3166
    :cond_7b
    :goto_5c
    return-object v11

    .line 3167
    :pswitch_1b
    iget-object v1, v0, Lr20;->ζ:Ljava/lang/ClassLoader;

    .line 3168
    .line 3169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3170
    .line 3171
    .line 3172
    new-instance v4, Lr20;

    .line 3173
    .line 3174
    const/4 v9, 0x3

    .line 3175
    invoke-direct {v4, v1, v9}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 3176
    .line 3177
    .line 3178
    new-instance v5, Lbb;

    .line 3179
    .line 3180
    const/16 v0, 0x1c

    .line 3181
    .line 3182
    invoke-direct {v5, v1, v0}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 3183
    .line 3184
    .line 3185
    sget-object v0, Lkx;->Ｋ:Lkx;

    .line 3186
    .line 3187
    const/4 v2, 0x1

    .line 3188
    const/4 v3, 0x6

    .line 3189
    invoke-static/range {v0 .. v5}, Lpd2;->Ο(Lkx;Ljava/lang/ClassLoader;ZILp70;La80;)Ljava/util/ArrayList;

    .line 3190
    .line 3191
    .line 3192
    return-object v17

    .line 3193
    :pswitch_1c
    iget-object v7, v0, Lr20;->ζ:Ljava/lang/ClassLoader;

    .line 3194
    .line 3195
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3196
    .line 3197
    .line 3198
    new-instance v10, Lr20;

    .line 3199
    .line 3200
    invoke-direct {v10, v7, v8}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 3201
    .line 3202
    .line 3203
    new-instance v11, Lt20;

    .line 3204
    .line 3205
    const/4 v15, 0x1

    .line 3206
    invoke-direct {v11, v7, v15}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 3207
    .line 3208
    .line 3209
    sget-object v6, Lkx;->Ｊ:Lkx;

    .line 3210
    .line 3211
    const/4 v8, 0x1

    .line 3212
    const/16 v9, 0x8

    .line 3213
    .line 3214
    invoke-static/range {v6 .. v11}, Lpd2;->Ο(Lkx;Ljava/lang/ClassLoader;ZILp70;La80;)Ljava/util/ArrayList;

    .line 3215
    .line 3216
    .line 3217
    return-object v17

    .line 3218
    nop

    .line 3219
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

    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    :sswitch_data_0
    .sparse-switch
        -0x6848babc -> :sswitch_6
        -0x530b7377 -> :sswitch_5
        -0x4edecda1 -> :sswitch_4
        -0x453bd97d -> :sswitch_3
        -0x4476163a -> :sswitch_2
        0x213138b4 -> :sswitch_1
        0x68f20157 -> :sswitch_0
    .end sparse-switch
.end method
