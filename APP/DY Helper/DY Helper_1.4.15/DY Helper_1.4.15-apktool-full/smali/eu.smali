.class public final Leu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/Set;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Leu;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sput-object v0, Leu;->β:Ljava/util/Set;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Leu;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    return-void
.end method

.method public static α(Ljava/lang/ClassLoader;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v2, Lkx;->ｚ:Lkx;

    .line 9
    .line 10
    invoke-static {v2, v1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v3, "):"

    .line 15
    .line 16
    const-string v4, "("

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const-string v6, "#"

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-eqz v8, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-object v8, v2

    .line 51
    check-cast v8, Ljava/lang/reflect/Method;

    .line 52
    .line 53
    invoke-static {v8}, Leu;->β(Ljava/lang/reflect/Method;)Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_1

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_d

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Ljava/lang/reflect/Method;

    .line 78
    .line 79
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    :goto_2
    const-string v0, "~7806780885C0804EA843C2785FE21414EFEDAD1FDA598E7F9DB79EEE7AC484663C250A1F928A67714B0CDDBA270FFB6AF2BE2FA2BE2151B2363345030242B4D0CFEF437623D1EC87FDE81353D0B4FD7E606F1024C098FBDE1889784B9D79F6C3B38F4D4D"

    .line 84
    .line 85
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v8, "~7806780885C0804EA843C2785FE21414EFEDAD1FDA598E7F9DB79EEE7AC484663C250A1F928A67714B0CDDBA270FFB6AF2BE2FA2BE2151B2363345030242B4D0CFEF437623D1EC87FDE81353D0B4FD7E606F1024C098FBDE1889784B9D73F6C3B38F474D"

    .line 90
    .line 91
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    filled-new-array {v0, v8}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_a

    .line 117
    .line 118
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/lang/String;

    .line 123
    .line 124
    :try_start_0
    invoke-static {v0, v5, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    goto :goto_4

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    new-instance v10, Leo1;

    .line 131
    .line 132
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    move-object v0, v10

    .line 136
    :goto_4
    instance-of v10, v0, Leo1;

    .line 137
    .line 138
    if-eqz v10, :cond_4

    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    :cond_4
    check-cast v0, Ljava/lang/Class;

    .line 142
    .line 143
    if-nez v0, :cond_5

    .line 144
    .line 145
    goto/16 :goto_8

    .line 146
    .line 147
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    new-instance v10, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    array-length v11, v0

    .line 160
    move v12, v5

    .line 161
    :goto_5
    if-ge v12, v11, :cond_7

    .line 162
    .line 163
    aget-object v13, v0, v12

    .line 164
    .line 165
    invoke-static {v13}, Leu;->β(Ljava/lang/reflect/Method;)Z

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    if-eqz v14, :cond_6

    .line 170
    .line 171
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    :cond_6
    add-int/lit8 v12, v12, 0x1

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    if-eqz v10, :cond_9

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    check-cast v10, Ljava/lang/reflect/Method;

    .line 192
    .line 193
    invoke-virtual {v10, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    invoke-static {v12, v10}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v14

    .line 216
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v15, Ljava/util/ArrayList;

    .line 220
    .line 221
    array-length v5, v14

    .line 222
    invoke-direct {v15, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 223
    .line 224
    .line 225
    array-length v5, v14

    .line 226
    const/4 v7, 0x0

    .line 227
    :goto_7
    if-ge v7, v5, :cond_8

    .line 228
    .line 229
    move-object/from16 v22, v0

    .line 230
    .line 231
    aget-object v0, v14, v7

    .line 232
    .line 233
    const/4 v1, 0x1

    .line 234
    invoke-static {v0, v15, v7, v1}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    move-object/from16 v1, p0

    .line 239
    .line 240
    move-object/from16 v0, v22

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_8
    move-object/from16 v22, v0

    .line 244
    .line 245
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 250
    .line 251
    .line 252
    const/16 v20, 0x0

    .line 253
    .line 254
    const/16 v21, 0x3e

    .line 255
    .line 256
    const-string v16, ","

    .line 257
    .line 258
    const/16 v17, 0x0

    .line 259
    .line 260
    const/16 v18, 0x0

    .line 261
    .line 262
    const/16 v19, 0x0

    .line 263
    .line 264
    invoke-static/range {v15 .. v21}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v11, v6, v12, v4, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-interface {v8, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-object/from16 v1, p0

    .line 286
    .line 287
    move-object/from16 v0, v22

    .line 288
    .line 289
    const/4 v5, 0x0

    .line 290
    const/4 v7, 0x1

    .line 291
    goto :goto_6

    .line 292
    :cond_9
    :goto_8
    move-object/from16 v1, p0

    .line 293
    .line 294
    const/4 v5, 0x0

    .line 295
    const/4 v7, 0x1

    .line 296
    goto/16 :goto_3

    .line 297
    .line 298
    :cond_a
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_b

    .line 303
    .line 304
    invoke-virtual {v8}, Ljava/util/AbstractMap;->size()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    new-instance v1, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    const-string v5, "reflection fallback hit, count="

    .line 311
    .line 312
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0}, Leu;->γ(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    :cond_b
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    check-cast v0, Ljava/lang/Iterable;

    .line 333
    .line 334
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-nez v0, :cond_c

    .line 343
    .line 344
    invoke-static {v2, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 345
    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_c
    sget-object v1, Ljz;->ε:Ljz;

    .line 349
    .line 350
    :cond_d
    :goto_9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_e

    .line 355
    .line 356
    const-string v0, "no target methods resolved, allowDexKitScan=false"

    .line 357
    .line 358
    invoke-static {v0}, Leu;->γ(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :cond_e
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_11

    .line 371
    .line 372
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Ljava/lang/reflect/Method;

    .line 377
    .line 378
    invoke-static {v1}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    invoke-static {v5, v1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    new-instance v9, Ljava/util/ArrayList;

    .line 398
    .line 399
    array-length v10, v8

    .line 400
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 401
    .line 402
    .line 403
    array-length v10, v8

    .line 404
    const/4 v11, 0x0

    .line 405
    :goto_b
    if-ge v11, v10, :cond_f

    .line 406
    .line 407
    aget-object v12, v8, v11

    .line 408
    .line 409
    const/4 v13, 0x1

    .line 410
    invoke-static {v12, v9, v11, v13}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 411
    .line 412
    .line 413
    move-result v11

    .line 414
    goto :goto_b

    .line 415
    :cond_f
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 416
    .line 417
    .line 418
    move-result v8

    .line 419
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 420
    .line 421
    .line 422
    const/4 v14, 0x0

    .line 423
    const/16 v15, 0x3e

    .line 424
    .line 425
    const-string v10, ","

    .line 426
    .line 427
    const/4 v11, 0x0

    .line 428
    const/4 v12, 0x0

    .line 429
    const/4 v13, 0x0

    .line 430
    invoke-static/range {v9 .. v15}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-static {v2, v6, v5, v4, v8}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-static {v2, v3, v7}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    sget-object v5, Leu;->β:Ljava/util/Set;

    .line 443
    .line 444
    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-nez v2, :cond_10

    .line 449
    .line 450
    const/4 v8, 0x0

    .line 451
    const/4 v13, 0x1

    .line 452
    goto :goto_a

    .line 453
    :cond_10
    const/4 v13, 0x1

    .line 454
    invoke-virtual {v1, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 455
    .line 456
    .line 457
    sget-object v2, Lxq0;->α:Lxq0;

    .line 458
    .line 459
    new-instance v5, Lxe;

    .line 460
    .line 461
    const/4 v7, 0x4

    .line 462
    const/4 v8, 0x0

    .line 463
    invoke-direct {v5, v1, v7, v8}, Lxe;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v1, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    new-instance v5, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    const-string v7, "hooked "

    .line 484
    .line 485
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-static {v1}, Leu;->γ(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_a

    .line 505
    .line 506
    :cond_11
    return-void
.end method

.method public static β(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    array-length v0, v0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eq v0, v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    aget-object v0, v0, v1

    .line 29
    .line 30
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {v0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    :goto_0
    return v1

    .line 50
    :cond_3
    return v2
.end method

.method public static γ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "rfbe541a4adc09a1c"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
