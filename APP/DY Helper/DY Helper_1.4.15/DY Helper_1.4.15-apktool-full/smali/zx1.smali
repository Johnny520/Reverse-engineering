.class public final synthetic Lzx1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 11
    iput p2, p0, Lzx1;->ε:I

    iput-object p1, p0, Lzx1;->ζ:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm82;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    const/16 p1, 0x10

    .line 2
    .line 3
    iput p1, p0, Lzx1;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lzx1;->ζ:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lzx1;->ε:I

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v3, 0x9

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    const/4 v6, 0x5

    .line 13
    const/4 v7, 0x0

    .line 14
    sget-object v8, Ljz;->ε:Ljz;

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object p0, p0, Lzx1;->ζ:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lj72;

    .line 33
    .line 34
    const/16 v2, 0x13

    .line 35
    .line 36
    invoke-direct {v1, v2}, Lj72;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lorg/luckypray/dexkit/result/MethodData;

    .line 58
    .line 59
    invoke-static {v0, p0, v1}, Lm82;->α(Ljava/util/LinkedHashMap;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/result/MethodData;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lorg/luckypray/dexkit/result/MethodData;->getInvokes()Lorg/luckypray/dexkit/result/MethodDataList;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_4

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    move-object v4, v3

    .line 86
    check-cast v4, Lorg/luckypray/dexkit/result/MethodData;

    .line 87
    .line 88
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/MethodData;->getModifiers()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/MethodData;->getParamCount()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-nez v5, :cond_1

    .line 104
    .line 105
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    const-string v6, "java.util.List"

    .line 110
    .line 111
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_3

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/MethodData;->getDeclaredClassName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    const-string v6, "java."

    .line 123
    .line 124
    invoke-static {v5, v6, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-nez v5, :cond_1

    .line 129
    .line 130
    invoke-virtual {v4}, Lorg/luckypray/dexkit/result/MethodData;->getDeclaredClassName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    const-string v5, "kotlin."

    .line 135
    .line 136
    invoke-static {v4, v5, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_1

    .line 141
    .line 142
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_0

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Lorg/luckypray/dexkit/result/MethodData;

    .line 161
    .line 162
    invoke-static {v0, p0, v2}, Lm82;->α(Ljava/util/LinkedHashMap;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/result/MethodData;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    check-cast p0, Ljava/lang/Iterable;

    .line 174
    .line 175
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lm82;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 185
    .line 186
    sget-object v0, Lry1;->α:Lry1;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-static {v0, p0}, Lry1;->ｅ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    new-instance v0, Ll91;

    .line 204
    .line 205
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 210
    .line 211
    sget-object v0, Lry1;->α:Lry1;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {p0, p1}, Lry1;->ч(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_2
    check-cast p1, Ljava/lang/Class;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    sget-object v0, Lry1;->α:Lry1;

    .line 231
    .line 232
    invoke-static {p1, p0}, Lry1;->ｃ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :pswitch_3
    check-cast p1, Ljava/lang/Class;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    sget-object v0, Lry1;->α:Lry1;

    .line 247
    .line 248
    invoke-static {p1, p0}, Lry1;->ｂ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0

    .line 257
    :pswitch_4
    check-cast p1, Ljava/lang/Class;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    sget-object v0, Lry1;->α:Lry1;

    .line 263
    .line 264
    invoke-static {p1, p0}, Lry1;->ｄ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    return-object p0

    .line 273
    :pswitch_5
    check-cast p1, Ljava/lang/Class;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    sget-object v0, Lry1;->α:Lry1;

    .line 279
    .line 280
    invoke-static {p1, p0}, Lry1;->ｃ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    return-object p0

    .line 289
    :pswitch_6
    check-cast p1, Ljava/lang/Class;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    sget-object v0, Lry1;->α:Lry1;

    .line 295
    .line 296
    invoke-static {p1, p0}, Lry1;->ｃ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    return-object p0

    .line 305
    :pswitch_7
    check-cast p1, Ljava/lang/Class;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    sget-object v0, Lry1;->α:Lry1;

    .line 311
    .line 312
    invoke-static {p1, p0}, Lry1;->ｄ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    return-object p0

    .line 321
    :pswitch_8
    check-cast p1, Ljava/lang/Class;

    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    sget-object v0, Lry1;->α:Lry1;

    .line 327
    .line 328
    invoke-static {p1, p0}, Lry1;->ｄ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    return-object p0

    .line 337
    :pswitch_9
    check-cast p1, Ljava/lang/Class;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    sget-object v0, Lry1;->α:Lry1;

    .line 343
    .line 344
    invoke-static {p1, p0}, Lry1;->ｂ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    return-object p0

    .line 353
    :pswitch_a
    check-cast p1, Ljava/lang/Class;

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    sget-object v0, Lry1;->α:Lry1;

    .line 359
    .line 360
    invoke-static {p1, p0}, Lry1;->ｂ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 361
    .line 362
    .line 363
    move-result p0

    .line 364
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    return-object p0

    .line 369
    :pswitch_b
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    sget-object v0, Lry1;->α:Lry1;

    .line 375
    .line 376
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 377
    .line 378
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 379
    .line 380
    .line 381
    :try_start_0
    new-instance v1, Lay1;

    .line 382
    .line 383
    const/4 v2, 0x2

    .line 384
    invoke-direct {v1, v2}, Lay1;-><init>(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    new-instance v2, Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-eqz v3, :cond_7

    .line 405
    .line 406
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 411
    .line 412
    invoke-virtual {v3, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    if-eqz v3, :cond_6

    .line 417
    .line 418
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    .line 420
    .line 421
    goto :goto_2

    .line 422
    :catchall_0
    move-exception v1

    .line 423
    new-instance v2, Leo1;

    .line 424
    .line 425
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    :cond_7
    instance-of v1, v2, Leo1;

    .line 429
    .line 430
    if-eqz v1, :cond_8

    .line 431
    .line 432
    move-object v2, v8

    .line 433
    :cond_8
    check-cast v2, Ljava/lang/Iterable;

    .line 434
    .line 435
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-eqz v2, :cond_9

    .line 444
    .line 445
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    check-cast v2, Ljava/lang/reflect/Method;

    .line 450
    .line 451
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-static {p0, v0, v2}, Lry1;->ω(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 456
    .line 457
    .line 458
    goto :goto_3

    .line 459
    :cond_9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_e

    .line 464
    .line 465
    :try_start_1
    new-instance v1, Lay1;

    .line 466
    .line 467
    const/4 v2, 0x3

    .line 468
    invoke-direct {v1, v2}, Lay1;-><init>(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    new-instance v2, Ljava/util/ArrayList;

    .line 476
    .line 477
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    :cond_a
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    if-eqz v3, :cond_b

    .line 489
    .line 490
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 495
    .line 496
    invoke-virtual {v3, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    if-eqz v3, :cond_a

    .line 501
    .line 502
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 503
    .line 504
    .line 505
    goto :goto_4

    .line 506
    :catchall_1
    move-exception v1

    .line 507
    new-instance v2, Leo1;

    .line 508
    .line 509
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 510
    .line 511
    .line 512
    :cond_b
    instance-of v1, v2, Leo1;

    .line 513
    .line 514
    if-eqz v1, :cond_c

    .line 515
    .line 516
    move-object v2, v8

    .line 517
    :cond_c
    check-cast v2, Ljava/lang/Iterable;

    .line 518
    .line 519
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    :cond_d
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    if-eqz v2, :cond_e

    .line 528
    .line 529
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    check-cast v2, Ljava/lang/reflect/Method;

    .line 534
    .line 535
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    sget-object v10, Lry1;->ο:Ljava/lang/String;

    .line 544
    .line 545
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    if-eqz v3, :cond_d

    .line 550
    .line 551
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    invoke-static {p0, v0, v2}, Lry1;->ω(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 556
    .line 557
    .line 558
    goto :goto_5

    .line 559
    :cond_e
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    const/16 v2, 0x7d0

    .line 564
    .line 565
    if-eqz v1, :cond_15

    .line 566
    .line 567
    :try_start_2
    new-instance v1, Lay1;

    .line 568
    .line 569
    const/4 v3, 0x4

    .line 570
    invoke-direct {v1, v3}, Lay1;-><init>(I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    new-instance v3, Ljava/util/ArrayList;

    .line 578
    .line 579
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    :cond_f
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 587
    .line 588
    .line 589
    move-result v10

    .line 590
    if-eqz v10, :cond_10

    .line 591
    .line 592
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v10

    .line 596
    check-cast v10, Lorg/luckypray/dexkit/result/MethodData;

    .line 597
    .line 598
    invoke-virtual {v10, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 599
    .line 600
    .line 601
    move-result-object v10

    .line 602
    if-eqz v10, :cond_f

    .line 603
    .line 604
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 605
    .line 606
    .line 607
    goto :goto_6

    .line 608
    :catchall_2
    move-exception v1

    .line 609
    new-instance v3, Leo1;

    .line 610
    .line 611
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 612
    .line 613
    .line 614
    :cond_10
    instance-of v1, v3, Leo1;

    .line 615
    .line 616
    if-eqz v1, :cond_11

    .line 617
    .line 618
    move-object v3, v8

    .line 619
    :cond_11
    check-cast v3, Ljava/lang/Iterable;

    .line 620
    .line 621
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    :cond_12
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-eqz v3, :cond_15

    .line 630
    .line 631
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    check-cast v3, Ljava/lang/reflect/Method;

    .line 636
    .line 637
    if-nez v3, :cond_13

    .line 638
    .line 639
    goto :goto_7

    .line 640
    :cond_13
    invoke-static {p0, v3}, Lry1;->ч(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)Z

    .line 641
    .line 642
    .line 643
    move-result v10

    .line 644
    if-nez v10, :cond_14

    .line 645
    .line 646
    goto :goto_7

    .line 647
    :cond_14
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    invoke-static {v3, p0}, Lry1;->ｄ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 655
    .line 656
    .line 657
    move-result v10

    .line 658
    if-lt v10, v2, :cond_12

    .line 659
    .line 660
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    goto :goto_7

    .line 664
    :cond_15
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    if-eqz v1, :cond_1b

    .line 669
    .line 670
    :try_start_3
    new-instance v1, Lay1;

    .line 671
    .line 672
    invoke-direct {v1, v6}, Lay1;-><init>(I)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    new-instance v3, Ljava/util/ArrayList;

    .line 680
    .line 681
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    :cond_16
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 689
    .line 690
    .line 691
    move-result v6

    .line 692
    if-eqz v6, :cond_18

    .line 693
    .line 694
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v6

    .line 698
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;

    .line 699
    .line 700
    invoke-virtual {v6, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 701
    .line 702
    .line 703
    move-result-object v6

    .line 704
    if-eqz v6, :cond_17

    .line 705
    .line 706
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    move-result-object v6

    .line 710
    goto :goto_9

    .line 711
    :catchall_3
    move-exception v1

    .line 712
    goto :goto_a

    .line 713
    :cond_17
    move-object v6, v9

    .line 714
    :goto_9
    if-eqz v6, :cond_16

    .line 715
    .line 716
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 717
    .line 718
    .line 719
    goto :goto_8

    .line 720
    :goto_a
    new-instance v3, Leo1;

    .line 721
    .line 722
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 723
    .line 724
    .line 725
    :cond_18
    instance-of v1, v3, Leo1;

    .line 726
    .line 727
    if-eqz v1, :cond_19

    .line 728
    .line 729
    move-object v3, v8

    .line 730
    :cond_19
    check-cast v3, Ljava/lang/Iterable;

    .line 731
    .line 732
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    if-eqz v3, :cond_1b

    .line 741
    .line 742
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    check-cast v3, Ljava/lang/Class;

    .line 747
    .line 748
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    invoke-static {v3}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    new-instance v6, Lay1;

    .line 760
    .line 761
    invoke-direct {v6, v5}, Lay1;-><init>(I)V

    .line 762
    .line 763
    .line 764
    new-instance v10, Lc40;

    .line 765
    .line 766
    sget-object v11, Lvs1;->ε:Lvs1;

    .line 767
    .line 768
    invoke-direct {v10, v3, v6, v11}, Lc40;-><init>(Lss1;La80;La80;)V

    .line 769
    .line 770
    .line 771
    new-instance v3, Lx30;

    .line 772
    .line 773
    invoke-direct {v3, v10}, Lx30;-><init>(Lc40;)V

    .line 774
    .line 775
    .line 776
    :goto_b
    invoke-virtual {v3}, Lx30;->hasNext()Z

    .line 777
    .line 778
    .line 779
    move-result v6

    .line 780
    if-eqz v6, :cond_1a

    .line 781
    .line 782
    invoke-virtual {v3}, Lx30;->next()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v6

    .line 786
    check-cast v6, Ljava/lang/Class;

    .line 787
    .line 788
    invoke-static {p0, v0, v6}, Lry1;->ω(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 789
    .line 790
    .line 791
    goto :goto_b

    .line 792
    :cond_1b
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    const/4 v3, 0x7

    .line 797
    if-eqz v1, :cond_21

    .line 798
    .line 799
    :try_start_4
    new-instance v1, Lay1;

    .line 800
    .line 801
    invoke-direct {v1, v3}, Lay1;-><init>(I)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 805
    .line 806
    .line 807
    move-result-object p1

    .line 808
    new-instance v1, Ljava/util/ArrayList;

    .line 809
    .line 810
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 811
    .line 812
    .line 813
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 814
    .line 815
    .line 816
    move-result-object p1

    .line 817
    :cond_1c
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 818
    .line 819
    .line 820
    move-result v5

    .line 821
    if-eqz v5, :cond_1e

    .line 822
    .line 823
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v5

    .line 827
    check-cast v5, Lorg/luckypray/dexkit/result/MethodData;

    .line 828
    .line 829
    invoke-virtual {v5, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 830
    .line 831
    .line 832
    move-result-object v5

    .line 833
    if-eqz v5, :cond_1d

    .line 834
    .line 835
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    goto :goto_d

    .line 840
    :catchall_4
    move-exception p1

    .line 841
    goto :goto_e

    .line 842
    :cond_1d
    move-object v5, v9

    .line 843
    :goto_d
    if-eqz v5, :cond_1c

    .line 844
    .line 845
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 846
    .line 847
    .line 848
    goto :goto_c

    .line 849
    :goto_e
    new-instance v1, Leo1;

    .line 850
    .line 851
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 852
    .line 853
    .line 854
    :cond_1e
    instance-of p1, v1, Leo1;

    .line 855
    .line 856
    if-eqz p1, :cond_1f

    .line 857
    .line 858
    goto :goto_f

    .line 859
    :cond_1f
    move-object v8, v1

    .line 860
    :goto_f
    check-cast v8, Ljava/lang/Iterable;

    .line 861
    .line 862
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 863
    .line 864
    .line 865
    move-result-object p1

    .line 866
    :cond_20
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    if-eqz v1, :cond_21

    .line 871
    .line 872
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    check-cast v1, Ljava/lang/Class;

    .line 877
    .line 878
    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    if-eqz v1, :cond_20

    .line 883
    .line 884
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    if-eqz v1, :cond_20

    .line 889
    .line 890
    array-length v5, v1

    .line 891
    move v6, v7

    .line 892
    :goto_10
    if-ge v6, v5, :cond_20

    .line 893
    .line 894
    aget-object v8, v1, v6

    .line 895
    .line 896
    invoke-static {p0, v0, v8}, Lry1;->ω(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 897
    .line 898
    .line 899
    add-int/lit8 v6, v6, 0x1

    .line 900
    .line 901
    goto :goto_10

    .line 902
    :cond_21
    new-instance p1, Lzx1;

    .line 903
    .line 904
    const/16 v1, 0xb

    .line 905
    .line 906
    invoke-direct {p1, p0, v1}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 907
    .line 908
    .line 909
    invoke-static {v0, v2, p1}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 910
    .line 911
    .line 912
    move-result-object p1

    .line 913
    new-instance v0, Lzx1;

    .line 914
    .line 915
    invoke-direct {v0, p0, v3}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 916
    .line 917
    .line 918
    invoke-static {p1, v2, v0}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 919
    .line 920
    .line 921
    move-result-object p1

    .line 922
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 923
    .line 924
    .line 925
    move-result v0

    .line 926
    if-eqz v0, :cond_22

    .line 927
    .line 928
    sget-object p1, Lry1;->μ:[Ljava/lang/String;

    .line 929
    .line 930
    invoke-static {p0, p1}, Lry1;->ш(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 931
    .line 932
    .line 933
    move-result-object p1

    .line 934
    invoke-static {p1}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object p1

    .line 938
    new-instance v0, Lzx1;

    .line 939
    .line 940
    invoke-direct {v0, p0, v4}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 941
    .line 942
    .line 943
    invoke-static {p1, v2, v0}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 944
    .line 945
    .line 946
    move-result-object p1

    .line 947
    :cond_22
    return-object p1

    .line 948
    :pswitch_c
    check-cast p1, Ljava/lang/Class;

    .line 949
    .line 950
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    sget-object v0, Lry1;->α:Lry1;

    .line 954
    .line 955
    invoke-static {p1, p0}, Lry1;->ｄ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 956
    .line 957
    .line 958
    move-result p0

    .line 959
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 960
    .line 961
    .line 962
    move-result-object p0

    .line 963
    return-object p0

    .line 964
    :pswitch_d
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 965
    .line 966
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 967
    .line 968
    .line 969
    sget-object v0, Lry1;->α:Lry1;

    .line 970
    .line 971
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 972
    .line 973
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 974
    .line 975
    .line 976
    :try_start_5
    new-instance v7, Lay1;

    .line 977
    .line 978
    invoke-direct {v7, v4}, Lay1;-><init>(I)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {p1, v7}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    new-instance v7, Ljava/util/ArrayList;

    .line 986
    .line 987
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 991
    .line 992
    .line 993
    move-result-object v4

    .line 994
    :cond_23
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 995
    .line 996
    .line 997
    move-result v10

    .line 998
    if-eqz v10, :cond_25

    .line 999
    .line 1000
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v10

    .line 1004
    check-cast v10, Lorg/luckypray/dexkit/result/MethodData;

    .line 1005
    .line 1006
    invoke-virtual {v10, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v10

    .line 1010
    if-eqz v10, :cond_24

    .line 1011
    .line 1012
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v10

    .line 1016
    goto :goto_12

    .line 1017
    :catchall_5
    move-exception v4

    .line 1018
    goto :goto_13

    .line 1019
    :cond_24
    move-object v10, v9

    .line 1020
    :goto_12
    if-eqz v10, :cond_23

    .line 1021
    .line 1022
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1023
    .line 1024
    .line 1025
    goto :goto_11

    .line 1026
    :goto_13
    new-instance v7, Leo1;

    .line 1027
    .line 1028
    invoke-direct {v7, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1029
    .line 1030
    .line 1031
    :cond_25
    instance-of v4, v7, Leo1;

    .line 1032
    .line 1033
    if-eqz v4, :cond_26

    .line 1034
    .line 1035
    move-object v7, v8

    .line 1036
    :cond_26
    check-cast v7, Ljava/lang/Iterable;

    .line 1037
    .line 1038
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v4

    .line 1042
    :cond_27
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v7

    .line 1046
    const/16 v10, 0x708

    .line 1047
    .line 1048
    if-eqz v7, :cond_29

    .line 1049
    .line 1050
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v7

    .line 1054
    check-cast v7, Ljava/lang/Class;

    .line 1055
    .line 1056
    if-nez v7, :cond_28

    .line 1057
    .line 1058
    goto :goto_14

    .line 1059
    :cond_28
    invoke-static {v7, p0}, Lry1;->ｂ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v11

    .line 1063
    if-lt v11, v10, :cond_27

    .line 1064
    .line 1065
    invoke-virtual {v0, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1066
    .line 1067
    .line 1068
    goto :goto_14

    .line 1069
    :cond_29
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v4

    .line 1073
    if-eqz v4, :cond_30

    .line 1074
    .line 1075
    :try_start_6
    new-instance v4, Lay1;

    .line 1076
    .line 1077
    invoke-direct {v4, v3}, Lay1;-><init>(I)V

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v3

    .line 1084
    new-instance v4, Ljava/util/ArrayList;

    .line 1085
    .line 1086
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    :cond_2a
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v7

    .line 1097
    if-eqz v7, :cond_2c

    .line 1098
    .line 1099
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v7

    .line 1103
    check-cast v7, Lorg/luckypray/dexkit/result/MethodData;

    .line 1104
    .line 1105
    invoke-virtual {v7, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v7

    .line 1109
    if-eqz v7, :cond_2b

    .line 1110
    .line 1111
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v7

    .line 1115
    goto :goto_16

    .line 1116
    :catchall_6
    move-exception v3

    .line 1117
    goto :goto_17

    .line 1118
    :cond_2b
    move-object v7, v9

    .line 1119
    :goto_16
    if-eqz v7, :cond_2a

    .line 1120
    .line 1121
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1122
    .line 1123
    .line 1124
    goto :goto_15

    .line 1125
    :goto_17
    new-instance v4, Leo1;

    .line 1126
    .line 1127
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1128
    .line 1129
    .line 1130
    :cond_2c
    instance-of v3, v4, Leo1;

    .line 1131
    .line 1132
    if-eqz v3, :cond_2d

    .line 1133
    .line 1134
    move-object v4, v8

    .line 1135
    :cond_2d
    check-cast v4, Ljava/lang/Iterable;

    .line 1136
    .line 1137
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v3

    .line 1141
    :cond_2e
    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1142
    .line 1143
    .line 1144
    move-result v4

    .line 1145
    if-eqz v4, :cond_30

    .line 1146
    .line 1147
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v4

    .line 1151
    check-cast v4, Ljava/lang/Class;

    .line 1152
    .line 1153
    if-nez v4, :cond_2f

    .line 1154
    .line 1155
    goto :goto_18

    .line 1156
    :cond_2f
    invoke-static {v4, p0}, Lry1;->ｂ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 1157
    .line 1158
    .line 1159
    move-result v7

    .line 1160
    if-lt v7, v10, :cond_2e

    .line 1161
    .line 1162
    invoke-virtual {v0, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1163
    .line 1164
    .line 1165
    goto :goto_18

    .line 1166
    :cond_30
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1167
    .line 1168
    .line 1169
    move-result v3

    .line 1170
    if-eqz v3, :cond_37

    .line 1171
    .line 1172
    :try_start_7
    new-instance v3, Lay1;

    .line 1173
    .line 1174
    invoke-direct {v3, v2}, Lay1;-><init>(I)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1178
    .line 1179
    .line 1180
    move-result-object p1

    .line 1181
    new-instance v2, Ljava/util/ArrayList;

    .line 1182
    .line 1183
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1187
    .line 1188
    .line 1189
    move-result-object p1

    .line 1190
    :cond_31
    :goto_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    if-eqz v3, :cond_33

    .line 1195
    .line 1196
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v3

    .line 1200
    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 1201
    .line 1202
    invoke-virtual {v3, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v3

    .line 1206
    if-eqz v3, :cond_32

    .line 1207
    .line 1208
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v3

    .line 1212
    goto :goto_1a

    .line 1213
    :catchall_7
    move-exception p1

    .line 1214
    goto :goto_1b

    .line 1215
    :cond_32
    move-object v3, v9

    .line 1216
    :goto_1a
    if-eqz v3, :cond_31

    .line 1217
    .line 1218
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1219
    .line 1220
    .line 1221
    goto :goto_19

    .line 1222
    :goto_1b
    new-instance v2, Leo1;

    .line 1223
    .line 1224
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1225
    .line 1226
    .line 1227
    :cond_33
    instance-of p1, v2, Leo1;

    .line 1228
    .line 1229
    if-eqz p1, :cond_34

    .line 1230
    .line 1231
    goto :goto_1c

    .line 1232
    :cond_34
    move-object v8, v2

    .line 1233
    :goto_1c
    check-cast v8, Ljava/lang/Iterable;

    .line 1234
    .line 1235
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1236
    .line 1237
    .line 1238
    move-result-object p1

    .line 1239
    :cond_35
    :goto_1d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1240
    .line 1241
    .line 1242
    move-result v2

    .line 1243
    if-eqz v2, :cond_37

    .line 1244
    .line 1245
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    check-cast v2, Ljava/lang/Class;

    .line 1250
    .line 1251
    if-nez v2, :cond_36

    .line 1252
    .line 1253
    goto :goto_1d

    .line 1254
    :cond_36
    invoke-static {v2, p0}, Lry1;->ｂ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 1255
    .line 1256
    .line 1257
    move-result v3

    .line 1258
    if-lt v3, v10, :cond_35

    .line 1259
    .line 1260
    invoke-virtual {v0, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    goto :goto_1d

    .line 1264
    :cond_37
    new-instance p1, Lzx1;

    .line 1265
    .line 1266
    invoke-direct {p1, p0, v1}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1267
    .line 1268
    .line 1269
    invoke-static {v0, v10, p1}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 1270
    .line 1271
    .line 1272
    move-result-object p1

    .line 1273
    new-instance v0, Lzx1;

    .line 1274
    .line 1275
    invoke-direct {v0, p0, v6}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1276
    .line 1277
    .line 1278
    invoke-static {p1, v10, v0}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 1279
    .line 1280
    .line 1281
    move-result-object p1

    .line 1282
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 1283
    .line 1284
    .line 1285
    move-result v0

    .line 1286
    if-eqz v0, :cond_38

    .line 1287
    .line 1288
    sget-object p1, Lry1;->ξ:[Ljava/lang/String;

    .line 1289
    .line 1290
    invoke-static {p0, p1}, Lry1;->ш(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 1291
    .line 1292
    .line 1293
    move-result-object p1

    .line 1294
    invoke-static {p1}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 1295
    .line 1296
    .line 1297
    move-result-object p1

    .line 1298
    new-instance v0, Lzx1;

    .line 1299
    .line 1300
    invoke-direct {v0, p0, v5}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1301
    .line 1302
    .line 1303
    invoke-static {p1, v10, v0}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 1304
    .line 1305
    .line 1306
    move-result-object p1

    .line 1307
    :cond_38
    return-object p1

    .line 1308
    :pswitch_e
    check-cast p1, Ljava/lang/Class;

    .line 1309
    .line 1310
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    sget-object v0, Lry1;->α:Lry1;

    .line 1314
    .line 1315
    invoke-static {p1, p0}, Lry1;->ｂ(Ljava/lang/Class;Ljava/lang/ClassLoader;)I

    .line 1316
    .line 1317
    .line 1318
    move-result p0

    .line 1319
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1320
    .line 1321
    .line 1322
    move-result-object p0

    .line 1323
    return-object p0

    .line 1324
    :pswitch_f
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 1325
    .line 1326
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1327
    .line 1328
    .line 1329
    sget-object v0, Lry1;->α:Lry1;

    .line 1330
    .line 1331
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 1332
    .line 1333
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1334
    .line 1335
    .line 1336
    :try_start_8
    new-instance v4, Lay1;

    .line 1337
    .line 1338
    invoke-direct {v4, v1}, Lay1;-><init>(I)V

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v1

    .line 1345
    new-instance v4, Ljava/util/ArrayList;

    .line 1346
    .line 1347
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v1

    .line 1354
    :cond_39
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1355
    .line 1356
    .line 1357
    move-result v5

    .line 1358
    if-eqz v5, :cond_3b

    .line 1359
    .line 1360
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v5

    .line 1364
    check-cast v5, Lorg/luckypray/dexkit/result/MethodData;

    .line 1365
    .line 1366
    invoke-virtual {v5, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v5

    .line 1370
    if-eqz v5, :cond_3a

    .line 1371
    .line 1372
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v5

    .line 1376
    goto :goto_1f

    .line 1377
    :catchall_8
    move-exception v1

    .line 1378
    goto :goto_20

    .line 1379
    :cond_3a
    move-object v5, v9

    .line 1380
    :goto_1f
    if-eqz v5, :cond_39

    .line 1381
    .line 1382
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1383
    .line 1384
    .line 1385
    goto :goto_1e

    .line 1386
    :goto_20
    new-instance v4, Leo1;

    .line 1387
    .line 1388
    invoke-direct {v4, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1389
    .line 1390
    .line 1391
    :cond_3b
    instance-of v1, v4, Leo1;

    .line 1392
    .line 1393
    if-eqz v1, :cond_3c

    .line 1394
    .line 1395
    move-object v4, v8

    .line 1396
    :cond_3c
    check-cast v4, Ljava/lang/Iterable;

    .line 1397
    .line 1398
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v1

    .line 1402
    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1403
    .line 1404
    .line 1405
    move-result v4

    .line 1406
    if-eqz v4, :cond_3d

    .line 1407
    .line 1408
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v4

    .line 1412
    check-cast v4, Ljava/lang/Class;

    .line 1413
    .line 1414
    invoke-static {p0, v0, v4}, Lry1;->ψ(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 1415
    .line 1416
    .line 1417
    goto :goto_21

    .line 1418
    :cond_3d
    const/16 v1, 0xd

    .line 1419
    .line 1420
    :try_start_9
    new-instance v4, Lay1;

    .line 1421
    .line 1422
    invoke-direct {v4, v1}, Lay1;-><init>(I)V

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v4

    .line 1429
    new-instance v5, Ljava/util/ArrayList;

    .line 1430
    .line 1431
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v4

    .line 1438
    :cond_3e
    :goto_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1439
    .line 1440
    .line 1441
    move-result v6

    .line 1442
    if-eqz v6, :cond_40

    .line 1443
    .line 1444
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v6

    .line 1448
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;

    .line 1449
    .line 1450
    invoke-virtual {v6, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v6

    .line 1454
    if-eqz v6, :cond_3f

    .line 1455
    .line 1456
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v6

    .line 1460
    goto :goto_23

    .line 1461
    :catchall_9
    move-exception v4

    .line 1462
    goto :goto_24

    .line 1463
    :cond_3f
    move-object v6, v9

    .line 1464
    :goto_23
    if-eqz v6, :cond_3e

    .line 1465
    .line 1466
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1467
    .line 1468
    .line 1469
    goto :goto_22

    .line 1470
    :goto_24
    new-instance v5, Leo1;

    .line 1471
    .line 1472
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1473
    .line 1474
    .line 1475
    :cond_40
    instance-of v4, v5, Leo1;

    .line 1476
    .line 1477
    if-eqz v4, :cond_41

    .line 1478
    .line 1479
    move-object v5, v8

    .line 1480
    :cond_41
    check-cast v5, Ljava/lang/Iterable;

    .line 1481
    .line 1482
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v4

    .line 1486
    :goto_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1487
    .line 1488
    .line 1489
    move-result v5

    .line 1490
    if-eqz v5, :cond_42

    .line 1491
    .line 1492
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v5

    .line 1496
    check-cast v5, Ljava/lang/Class;

    .line 1497
    .line 1498
    invoke-static {p0, v0, v5}, Lry1;->ψ(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 1499
    .line 1500
    .line 1501
    goto :goto_25

    .line 1502
    :cond_42
    :try_start_a
    new-instance v4, Lay1;

    .line 1503
    .line 1504
    const/16 v5, 0xe

    .line 1505
    .line 1506
    invoke-direct {v4, v5}, Lay1;-><init>(I)V

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v4

    .line 1513
    new-instance v5, Ljava/util/ArrayList;

    .line 1514
    .line 1515
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v4

    .line 1522
    :cond_43
    :goto_26
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1523
    .line 1524
    .line 1525
    move-result v6

    .line 1526
    if-eqz v6, :cond_45

    .line 1527
    .line 1528
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v6

    .line 1532
    check-cast v6, Lorg/luckypray/dexkit/result/MethodData;

    .line 1533
    .line 1534
    invoke-virtual {v6, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v6

    .line 1538
    if-eqz v6, :cond_44

    .line 1539
    .line 1540
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v6

    .line 1544
    goto :goto_27

    .line 1545
    :catchall_a
    move-exception v4

    .line 1546
    goto :goto_28

    .line 1547
    :cond_44
    move-object v6, v9

    .line 1548
    :goto_27
    if-eqz v6, :cond_43

    .line 1549
    .line 1550
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1551
    .line 1552
    .line 1553
    goto :goto_26

    .line 1554
    :goto_28
    new-instance v5, Leo1;

    .line 1555
    .line 1556
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1557
    .line 1558
    .line 1559
    :cond_45
    instance-of v4, v5, Leo1;

    .line 1560
    .line 1561
    if-eqz v4, :cond_46

    .line 1562
    .line 1563
    move-object v5, v8

    .line 1564
    :cond_46
    check-cast v5, Ljava/lang/Iterable;

    .line 1565
    .line 1566
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v4

    .line 1570
    :goto_29
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1571
    .line 1572
    .line 1573
    move-result v5

    .line 1574
    if-eqz v5, :cond_47

    .line 1575
    .line 1576
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v5

    .line 1580
    check-cast v5, Ljava/lang/Class;

    .line 1581
    .line 1582
    invoke-static {p0, v0, v5}, Lry1;->ψ(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 1583
    .line 1584
    .line 1585
    goto :goto_29

    .line 1586
    :cond_47
    :try_start_b
    new-instance v4, Lay1;

    .line 1587
    .line 1588
    const/16 v5, 0xf

    .line 1589
    .line 1590
    invoke-direct {v4, v5}, Lay1;-><init>(I)V

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {p1, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 1594
    .line 1595
    .line 1596
    move-result-object p1

    .line 1597
    new-instance v4, Ljava/util/ArrayList;

    .line 1598
    .line 1599
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1603
    .line 1604
    .line 1605
    move-result-object p1

    .line 1606
    :cond_48
    :goto_2a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1607
    .line 1608
    .line 1609
    move-result v5

    .line 1610
    if-eqz v5, :cond_4a

    .line 1611
    .line 1612
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v5

    .line 1616
    check-cast v5, Lorg/luckypray/dexkit/result/MethodData;

    .line 1617
    .line 1618
    invoke-virtual {v5, p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v5

    .line 1622
    if-eqz v5, :cond_49

    .line 1623
    .line 1624
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v5

    .line 1628
    goto :goto_2b

    .line 1629
    :catchall_b
    move-exception p1

    .line 1630
    goto :goto_2c

    .line 1631
    :cond_49
    move-object v5, v9

    .line 1632
    :goto_2b
    if-eqz v5, :cond_48

    .line 1633
    .line 1634
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1635
    .line 1636
    .line 1637
    goto :goto_2a

    .line 1638
    :goto_2c
    new-instance v4, Leo1;

    .line 1639
    .line 1640
    invoke-direct {v4, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1641
    .line 1642
    .line 1643
    :cond_4a
    instance-of p1, v4, Leo1;

    .line 1644
    .line 1645
    if-eqz p1, :cond_4b

    .line 1646
    .line 1647
    goto :goto_2d

    .line 1648
    :cond_4b
    move-object v8, v4

    .line 1649
    :goto_2d
    check-cast v8, Ljava/lang/Iterable;

    .line 1650
    .line 1651
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1652
    .line 1653
    .line 1654
    move-result-object p1

    .line 1655
    :cond_4c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1656
    .line 1657
    .line 1658
    move-result v4

    .line 1659
    if-eqz v4, :cond_4d

    .line 1660
    .line 1661
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v4

    .line 1665
    check-cast v4, Ljava/lang/Class;

    .line 1666
    .line 1667
    invoke-static {v4}, Lry1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v4

    .line 1671
    new-instance v5, Lf7;

    .line 1672
    .line 1673
    const/4 v6, 0x1

    .line 1674
    invoke-direct {v5, v6, v4}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1675
    .line 1676
    .line 1677
    new-instance v4, Lay1;

    .line 1678
    .line 1679
    const/16 v7, 0x10

    .line 1680
    .line 1681
    invoke-direct {v4, v7}, Lay1;-><init>(I)V

    .line 1682
    .line 1683
    .line 1684
    new-instance v7, Ly30;

    .line 1685
    .line 1686
    invoke-direct {v7, v5, v6, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1687
    .line 1688
    .line 1689
    new-instance v4, Lay1;

    .line 1690
    .line 1691
    const/16 v5, 0x11

    .line 1692
    .line 1693
    invoke-direct {v4, v5}, Lay1;-><init>(I)V

    .line 1694
    .line 1695
    .line 1696
    invoke-static {v7, v4}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v4

    .line 1700
    new-instance v5, Lx30;

    .line 1701
    .line 1702
    invoke-direct {v5, v4}, Lx30;-><init>(Ly30;)V

    .line 1703
    .line 1704
    .line 1705
    :goto_2e
    invoke-virtual {v5}, Lx30;->hasNext()Z

    .line 1706
    .line 1707
    .line 1708
    move-result v4

    .line 1709
    if-eqz v4, :cond_4c

    .line 1710
    .line 1711
    invoke-virtual {v5}, Lx30;->next()Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v4

    .line 1715
    check-cast v4, Ljava/lang/Class;

    .line 1716
    .line 1717
    invoke-static {p0, v0, v4}, Lry1;->ψ(Ljava/lang/ClassLoader;Ljava/util/LinkedHashSet;Ljava/lang/Class;)V

    .line 1718
    .line 1719
    .line 1720
    goto :goto_2e

    .line 1721
    :cond_4d
    new-instance p1, Lzx1;

    .line 1722
    .line 1723
    invoke-direct {p1, p0, v1}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1724
    .line 1725
    .line 1726
    const/16 v1, 0x5dc

    .line 1727
    .line 1728
    invoke-static {v0, v1, p1}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 1729
    .line 1730
    .line 1731
    move-result-object p1

    .line 1732
    new-instance v0, Lzx1;

    .line 1733
    .line 1734
    invoke-direct {v0, p0, v3}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1735
    .line 1736
    .line 1737
    invoke-static {p1, v1, v0}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 1738
    .line 1739
    .line 1740
    move-result-object p1

    .line 1741
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 1742
    .line 1743
    .line 1744
    move-result v0

    .line 1745
    if-eqz v0, :cond_4e

    .line 1746
    .line 1747
    sget-object p1, Lry1;->ν:[Ljava/lang/String;

    .line 1748
    .line 1749
    invoke-static {p0, p1}, Lry1;->ш(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 1750
    .line 1751
    .line 1752
    move-result-object p1

    .line 1753
    invoke-static {p1}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 1754
    .line 1755
    .line 1756
    move-result-object p1

    .line 1757
    new-instance v0, Lzx1;

    .line 1758
    .line 1759
    invoke-direct {v0, p0, v2}, Lzx1;-><init>(Ljava/lang/ClassLoader;I)V

    .line 1760
    .line 1761
    .line 1762
    invoke-static {p1, v1, v0}, Lry1;->И(Ljava/lang/Iterable;ILa80;)Ljava/util/List;

    .line 1763
    .line 1764
    .line 1765
    move-result-object p1

    .line 1766
    :cond_4e
    return-object p1

    .line 1767
    :pswitch_data_0
    .packed-switch 0x0
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
