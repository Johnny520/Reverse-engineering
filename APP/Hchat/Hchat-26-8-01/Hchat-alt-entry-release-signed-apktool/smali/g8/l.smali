.class public final Lg8/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lh/Hchat/dexkit/DexFinder;

.field public final b:Lm8/c;


# direct methods
.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Lm8/c;Lg1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg8/l;->a:Lh/Hchat/dexkit/DexFinder;

    .line 5
    .line 6
    iput-object p2, p0, Lg8/l;->b:Lm8/c;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-class v0, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[WeChatVerifyUserApi] "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;II)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v2, ""

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move-object v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v3, v0

    .line 18
    :goto_0
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-string v0, "\u901a\u8fc7\u597d\u53cb\u7533\u8bf7\u5931\u8d25: wxid\u4e3a\u7a7a"

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lg8/l;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return v4

    .line 31
    :cond_1
    iget-object v0, v1, Lg8/l;->a:Lh/Hchat/dexkit/DexFinder;

    .line 32
    .line 33
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->verifyUserClass:Ljava/lang/Class;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const-string v0, "\u901a\u8fc7\u597d\u53cb\u7533\u8bf7\u5931\u8d25: verifyUserClass\u4e3a\u7a7a"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lg8/l;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v4

    .line 43
    :cond_2
    if-nez p2, :cond_3

    .line 44
    .line 45
    move-object v5, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    move-object/from16 v5, p2

    .line 48
    .line 49
    :goto_1
    const/4 v6, 0x3

    .line 50
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v8, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    const/4 v10, 0x1

    .line 72
    const/16 v11, 0x8

    .line 73
    .line 74
    const/4 v13, 0x2

    .line 75
    const/4 v14, 0x6

    .line 76
    const/4 v15, 0x4

    .line 77
    if-eqz v9, :cond_7

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    move-object/from16 v16, v9

    .line 84
    .line 85
    check-cast v16, Ljava/lang/reflect/Constructor;

    .line 86
    .line 87
    move/from16 p1, v4

    .line 88
    .line 89
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    move/from16 p2, v6

    .line 94
    .line 95
    array-length v6, v4

    .line 96
    const/16 v16, 0x5

    .line 97
    .line 98
    const-class v12, Ljava/lang/String;

    .line 99
    .line 100
    if-ne v6, v15, :cond_4

    .line 101
    .line 102
    aget-object v6, v4, p1

    .line 103
    .line 104
    invoke-static {v6}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v6, :cond_6

    .line 109
    .line 110
    aget-object v6, v4, v10

    .line 111
    .line 112
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-eqz v6, :cond_6

    .line 117
    .line 118
    aget-object v6, v4, v13

    .line 119
    .line 120
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    aget-object v4, v4, p2

    .line 127
    .line 128
    invoke-static {v4}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_6

    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_4
    array-length v6, v4

    .line 137
    if-ne v6, v14, :cond_5

    .line 138
    .line 139
    aget-object v6, v4, p1

    .line 140
    .line 141
    invoke-static {v6}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_6

    .line 146
    .line 147
    aget-object v6, v4, v10

    .line 148
    .line 149
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_6

    .line 154
    .line 155
    aget-object v6, v4, v13

    .line 156
    .line 157
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_6

    .line 162
    .line 163
    aget-object v6, v4, p2

    .line 164
    .line 165
    invoke-static {v6}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-eqz v6, :cond_6

    .line 170
    .line 171
    aget-object v6, v4, v15

    .line 172
    .line 173
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_6

    .line 178
    .line 179
    aget-object v4, v4, v16

    .line 180
    .line 181
    invoke-static {v4}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_6

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    array-length v6, v4

    .line 189
    if-ne v6, v11, :cond_6

    .line 190
    .line 191
    aget-object v6, v4, p1

    .line 192
    .line 193
    invoke-static {v6}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_6

    .line 198
    .line 199
    aget-object v6, v4, v10

    .line 200
    .line 201
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_6

    .line 206
    .line 207
    aget-object v6, v4, v13

    .line 208
    .line 209
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_6

    .line 214
    .line 215
    aget-object v6, v4, p2

    .line 216
    .line 217
    invoke-static {v6}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    if-eqz v6, :cond_6

    .line 222
    .line 223
    aget-object v6, v4, v15

    .line 224
    .line 225
    invoke-static {v6, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    if-eqz v6, :cond_6

    .line 230
    .line 231
    aget-object v6, v4, v16

    .line 232
    .line 233
    invoke-static {v6}, Lg8/l;->a(Ljava/lang/Class;)Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-eqz v6, :cond_6

    .line 238
    .line 239
    const-class v6, Ljava/util/List;

    .line 240
    .line 241
    aget-object v4, v4, v14

    .line 242
    .line 243
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-eqz v4, :cond_6

    .line 248
    .line 249
    :goto_3
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    :cond_6
    move/from16 v4, p1

    .line 253
    .line 254
    move/from16 v6, p2

    .line 255
    .line 256
    goto/16 :goto_2

    .line 257
    .line 258
    :cond_7
    move/from16 p1, v4

    .line 259
    .line 260
    move/from16 p2, v6

    .line 261
    .line 262
    const/16 v16, 0x5

    .line 263
    .line 264
    new-instance v0, La9/h;

    .line 265
    .line 266
    const/16 v4, 0x12

    .line 267
    .line 268
    invoke-direct {v0, v4}, La9/h;-><init>(I)V

    .line 269
    .line 270
    .line 271
    invoke-static {v8, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    const/4 v6, 0x0

    .line 280
    move-object v0, v6

    .line 281
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    if-eqz v8, :cond_b

    .line 286
    .line 287
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    check-cast v8, Ljava/lang/reflect/Constructor;

    .line 292
    .line 293
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    array-length v9, v9

    .line 298
    if-eq v9, v15, :cond_a

    .line 299
    .line 300
    if-eq v9, v14, :cond_9

    .line 301
    .line 302
    if-eq v9, v11, :cond_8

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_8
    new-array v0, v11, [Ljava/lang/Object;

    .line 306
    .line 307
    aput-object v7, v0, p1

    .line 308
    .line 309
    aput-object v3, v0, v10

    .line 310
    .line 311
    aput-object v5, v0, v13

    .line 312
    .line 313
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    aput-object v9, v0, p2

    .line 318
    .line 319
    aput-object v2, v0, v15

    .line 320
    .line 321
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    aput-object v9, v0, v16

    .line 326
    .line 327
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 328
    .line 329
    aput-object v9, v0, v14

    .line 330
    .line 331
    const/4 v9, 0x7

    .line 332
    aput-object v6, v0, v9

    .line 333
    .line 334
    goto :goto_5

    .line 335
    :catchall_0
    move-exception v0

    .line 336
    goto :goto_6

    .line 337
    :cond_9
    new-array v0, v14, [Ljava/lang/Object;

    .line 338
    .line 339
    aput-object v7, v0, p1

    .line 340
    .line 341
    aput-object v3, v0, v10

    .line 342
    .line 343
    aput-object v5, v0, v13

    .line 344
    .line 345
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    aput-object v9, v0, p2

    .line 350
    .line 351
    aput-object v2, v0, v15

    .line 352
    .line 353
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    aput-object v9, v0, v16

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_a
    new-array v0, v15, [Ljava/lang/Object;

    .line 361
    .line 362
    aput-object v7, v0, p1

    .line 363
    .line 364
    aput-object v3, v0, v10

    .line 365
    .line 366
    aput-object v5, v0, v13

    .line 367
    .line 368
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    aput-object v9, v0, p2

    .line 373
    .line 374
    :goto_5
    array-length v9, v0

    .line 375
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v8, v0}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 383
    goto :goto_7

    .line 384
    :goto_6
    invoke-virtual {v8}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    array-length v8, v8

    .line 389
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    new-instance v9, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    const-string v8, ": "

    .line 402
    .line 403
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    goto/16 :goto_4

    .line 414
    .line 415
    :cond_b
    if-eqz v0, :cond_c

    .line 416
    .line 417
    const-string v2, ", last="

    .line 418
    .line 419
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    :cond_c
    const-string v0, "\u901a\u8fc7\u597d\u53cb\u7533\u8bf7\u5931\u8d25: \u65e0\u5408\u9002\u6784\u9020"

    .line 424
    .line 425
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v1, v0}, Lg8/l;->b(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    :goto_7
    if-eqz v6, :cond_f

    .line 433
    .line 434
    iget-object v0, v1, Lg8/l;->b:Lm8/c;

    .line 435
    .line 436
    invoke-virtual {v0, v6}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-ne v0, v10, :cond_d

    .line 441
    .line 442
    move v4, v10

    .line 443
    goto :goto_8

    .line 444
    :cond_d
    move/from16 v4, p1

    .line 445
    .line 446
    :goto_8
    if-nez v4, :cond_e

    .line 447
    .line 448
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    const-string v2, "\u901a\u8fc7\u597d\u53cb\u7533\u8bf7\u5931\u8d25: \u53d1\u5305\u5931\u8d25 request="

    .line 457
    .line 458
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v1, v0}, Lg8/l;->b(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    :cond_e
    return v4

    .line 466
    :cond_f
    return p1
.end method
