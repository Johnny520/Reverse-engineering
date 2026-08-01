.class public final synthetic Lrj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;

.field public final synthetic η:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lrj0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrj0;->η:Ljava/lang/Class;

    .line 8
    .line 9
    iput-object p2, p0, Lrj0;->ζ:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/Class;I)V
    .locals 0

    .line 12
    iput p3, p0, Lrj0;->ε:I

    iput-object p1, p0, Lrj0;->ζ:Ljava/lang/ClassLoader;

    iput-object p2, p0, Lrj0;->η:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lrj0;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lrj0;->ζ:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    iget-object p0, p0, Lrj0;->η:Ljava/lang/Class;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v0, Lry1;->α:Lry1;

    .line 17
    .line 18
    invoke-static {p1, p0, v2}, Lry1;->у(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/ClassLoader;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v0, Lcj1;->α:Lcj1;

    .line 33
    .line 34
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v3, Lcj1;->β:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_5

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/String;

    .line 56
    .line 57
    :try_start_0
    new-instance v5, Lyh0;

    .line 58
    .line 59
    const/16 v6, 0xd

    .line 60
    .line 61
    invoke-direct {v5, v4, v6}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v5}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 83
    .line 84
    :try_start_1
    invoke-virtual {v5, v2}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    goto :goto_2

    .line 89
    :catchall_0
    move-exception v5

    .line 90
    :try_start_2
    new-instance v6, Leo1;

    .line 91
    .line 92
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    move-object v5, v6

    .line 96
    :goto_2
    instance-of v6, v5, Leo1;

    .line 97
    .line 98
    if-eqz v6, :cond_2

    .line 99
    .line 100
    move-object v5, v1

    .line 101
    :cond_2
    check-cast v5, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    if-nez v5, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-static {p0, v5}, Lcj1;->λ(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_1

    .line 111
    .line 112
    const/4 v6, 0x1

    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 114
    .line 115
    .line 116
    invoke-static {v5}, Lcj1;->ψ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catchall_1
    move-exception v4

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    sget-object v4, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :goto_3
    new-instance v5, Leo1;

    .line 130
    .line 131
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    move-object v4, v5

    .line 135
    :goto_4
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    if-eqz v4, :cond_0

    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    sget v4, Lcom/example/dyhelper/MainHook;->β:I

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    check-cast p0, Ljava/lang/Iterable;

    .line 155
    .line 156
    new-instance p1, Lib1;

    .line 157
    .line 158
    sget-object v0, Lcj1;->α:Lcj1;

    .line 159
    .line 160
    const/16 v0, 0x16

    .line 161
    .line 162
    invoke-direct {p1, v0}, Lib1;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    const/4 p1, 0x3

    .line 170
    invoke-static {p0, p1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    sget-object v0, Lvj0;->α:Lvj0;

    .line 181
    .line 182
    :try_start_3
    new-instance v0, Lt00;

    .line 183
    .line 184
    const/4 v3, 0x5

    .line 185
    invoke-direct {v0, p0, v3}, Lt00;-><init>(Ljava/lang/Class;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findField(La80;)Lorg/luckypray/dexkit/result/FieldDataList;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    new-instance v0, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    :cond_6
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_8

    .line 206
    .line 207
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, Lorg/luckypray/dexkit/result/FieldData;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 212
    .line 213
    :try_start_4
    invoke-virtual {v3, v2}, Lorg/luckypray/dexkit/result/FieldData;->getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 214
    .line 215
    .line 216
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 217
    goto :goto_6

    .line 218
    :catchall_2
    move-exception v3

    .line 219
    :try_start_5
    new-instance v4, Leo1;

    .line 220
    .line 221
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    move-object v3, v4

    .line 225
    :goto_6
    instance-of v4, v3, Leo1;

    .line 226
    .line 227
    if-eqz v4, :cond_7

    .line 228
    .line 229
    move-object v3, v1

    .line 230
    :cond_7
    check-cast v3, Ljava/lang/reflect/Field;

    .line 231
    .line 232
    if-eqz v3, :cond_6

    .line 233
    .line 234
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_5

    .line 238
    :catchall_3
    move-exception p0

    .line 239
    goto/16 :goto_a

    .line 240
    .line 241
    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    :cond_9
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_a

    .line 255
    .line 256
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    move-object v3, v2

    .line 261
    check-cast v3, Ljava/lang/reflect/Field;

    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_9

    .line 272
    .line 273
    invoke-static {v3, p0}, Lvj0;->ν(Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    if-eqz v3, :cond_9

    .line 278
    .line 279
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_a
    new-instance v0, Ljava/util/HashSet;

    .line 284
    .line 285
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 286
    .line 287
    .line 288
    new-instance v2, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    :cond_b
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_c

    .line 302
    .line 303
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    move-object v4, v3

    .line 308
    check-cast v4, Ljava/lang/reflect/Field;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    new-instance v7, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v5, "#"

    .line 339
    .line 340
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v5, ":"

    .line 347
    .line 348
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_b

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-nez v0, :cond_d

    .line 377
    .line 378
    move-object v0, v1

    .line 379
    goto :goto_9

    .line 380
    :cond_d
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-nez v2, :cond_e

    .line 389
    .line 390
    goto :goto_9

    .line 391
    :cond_e
    move-object v2, v0

    .line 392
    check-cast v2, Ljava/lang/reflect/Field;

    .line 393
    .line 394
    invoke-static {v2, p0}, Lvj0;->τ(Ljava/lang/reflect/Field;Ljava/lang/Class;)I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    move-object v4, v3

    .line 403
    check-cast v4, Ljava/lang/reflect/Field;

    .line 404
    .line 405
    invoke-static {v4, p0}, Lvj0;->τ(Ljava/lang/reflect/Field;Ljava/lang/Class;)I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-ge v2, v4, :cond_10

    .line 410
    .line 411
    move-object v0, v3

    .line 412
    move v2, v4

    .line 413
    :cond_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-nez v3, :cond_f

    .line 418
    .line 419
    :goto_9
    check-cast v0, Ljava/lang/reflect/Field;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :goto_a
    new-instance v0, Leo1;

    .line 423
    .line 424
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 425
    .line 426
    .line 427
    :goto_b
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    if-eqz p0, :cond_11

    .line 432
    .line 433
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    const-string p1, "DexKit \u5b9a\u4f4d\u901a\u77e5 API \u5b57\u6bb5\u5931\u8d25 type="

    .line 442
    .line 443
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    const-string p1, "r52bdfd08354d522"

    .line 448
    .line 449
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    :cond_11
    instance-of p0, v0, Leo1;

    .line 453
    .line 454
    if-eqz p0, :cond_12

    .line 455
    .line 456
    goto :goto_c

    .line 457
    :cond_12
    move-object v1, v0

    .line 458
    :goto_c
    check-cast v1, Ljava/lang/reflect/Field;

    .line 459
    .line 460
    return-object v1

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
