.class public final synthetic Lj72;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj72;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget p0, p0, Lj72;->ε:I

    .line 2
    .line 3
    const-string v0, "#"

    .line 4
    .line 5
    sget-object v1, Ljz;->ε:Ljz;

    .line 6
    .line 7
    const-wide v2, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/16 v4, 0x20

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    sget-object v6, Ls62;->α:Ls62;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, Lvc2;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Field;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_2
    check-cast p1, Ljava/lang/ClassLoader;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object p0, Lib2;->α:Lib2;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lib2;->ρ(Ljava/lang/ClassLoader;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lib2;->π(Ljava/lang/ClassLoader;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lib2;->ξ(Ljava/lang/ClassLoader;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lib2;->ο(Ljava/lang/ClassLoader;)V

    .line 69
    .line 70
    .line 71
    return-object v6

    .line 72
    :pswitch_3
    check-cast p1, Ljava/lang/ClassLoader;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :pswitch_4
    move-object v7, p1

    .line 79
    check-cast v7, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const-string p0, "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CEDAB515DCE2816D426A735BD613EB803E27DD20F86DC9230C10D9F6CC144E"

    .line 85
    .line 86
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    const/4 v11, 0x6

    .line 91
    const/4 v12, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 95
    .line 96
    .line 97
    const-string v8, "java.util.List"

    .line 98
    .line 99
    invoke-static/range {v7 .. v12}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 103
    .line 104
    .line 105
    return-object v6

    .line 106
    :pswitch_5
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance p0, Lj72;

    .line 112
    .line 113
    const/16 v0, 0x14

    .line 114
    .line 115
    invoke-direct {p0, v0}, Lj72;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 119
    .line 120
    .line 121
    return-object v6

    .line 122
    :pswitch_6
    check-cast p1, Ljava/lang/ClassLoader;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object p0, Lm82;->α:Lm82;

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Lm82;->γ(Ljava/lang/ClassLoader;)V

    .line 130
    .line 131
    .line 132
    return-object v6

    .line 133
    :pswitch_7
    check-cast p1, Ljava/lang/ClassLoader;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    sget-object p0, Lm82;->α:Lm82;

    .line 139
    .line 140
    invoke-static {}, Lm82;->δ()Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_0

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_0
    new-instance p0, Lqx;

    .line 148
    .line 149
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 150
    .line 151
    sget-object v0, Lkx;->Ｆ:Lkx;

    .line 152
    .line 153
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    new-instance v1, Lk41;

    .line 158
    .line 159
    const/16 v2, 0x18

    .line 160
    .line 161
    invoke-direct {v1, p1, v2}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 162
    .line 163
    .line 164
    const-string p1, "\u5b9a\u4f4d 39.3 \u53ca\u4ee5\u4e0a\u89c6\u9891\u500d\u901f\u9009\u9879\u63d0\u4f9b\u65b9\u6cd5"

    .line 165
    .line 166
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 167
    .line 168
    .line 169
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :goto_0
    return-object v1

    .line 174
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 175
    .line 176
    const/4 p0, 0x0

    .line 177
    :try_start_0
    invoke-virtual {p1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, p0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 184
    goto :goto_1

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    move-object p1, v0

    .line 187
    new-instance v0, Leo1;

    .line 188
    .line 189
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    move-object p1, v0

    .line 193
    :goto_1
    instance-of v0, p1, Leo1;

    .line 194
    .line 195
    if-eqz v0, :cond_1

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_1
    move-object p0, p1

    .line 199
    :goto_2
    return-object p0

    .line 200
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    new-instance v1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string p0, "()"

    .line 229
    .line 230
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    return-object p0

    .line 238
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    aget-object p1, p1, v7

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    const-string v2, "("

    .line 263
    .line 264
    invoke-static {p0, v0, v1, v2, p1}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    const-string p1, ")"

    .line 269
    .line 270
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :pswitch_b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    const-string v0, "setSpeed"

    .line 285
    .line 286
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-eqz p0, :cond_2

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    if-eqz p0, :cond_2

    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_2
    move v5, v7

    .line 313
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    return-object p0

    .line 318
    :pswitch_c
    check-cast p1, Lmq;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    const-string p0, "video_length_alert_enabled"

    .line 324
    .line 325
    invoke-static {p0, v7}, Lf82;->ξ(Ljava/lang/String;Z)Z

    .line 326
    .line 327
    .line 328
    move-result p0

    .line 329
    if-eqz p0, :cond_3

    .line 330
    .line 331
    iget-wide p0, p1, Lmq;->δ:J

    .line 332
    .line 333
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    sget-object p1, Lf82;->α:Landroid/os/Handler;

    .line 338
    .line 339
    new-instance v0, Le82;

    .line 340
    .line 341
    invoke-direct {v0, p0, v7}, Le82;-><init>(Ljava/lang/Long;I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 345
    .line 346
    .line 347
    :cond_3
    return-object v6

    .line 348
    :pswitch_d
    check-cast p1, Ljava/lang/reflect/Field;

    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 351
    .line 352
    .line 353
    move-result p0

    .line 354
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    if-nez p0, :cond_4

    .line 359
    .line 360
    const-class p0, Ljava/util/List;

    .line 361
    .line 362
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 367
    .line 368
    .line 369
    move-result p0

    .line 370
    if-eqz p0, :cond_4

    .line 371
    .line 372
    sget-object p0, Lc82;->α:Lc82;

    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-static {p0}, Lc82;->ν(Ljava/lang/String;)Z

    .line 382
    .line 383
    .line 384
    move-result p0

    .line 385
    if-eqz p0, :cond_4

    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_4
    move v5, v7

    .line 389
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    return-object p0

    .line 394
    :pswitch_e
    check-cast p1, Ljava/lang/reflect/Field;

    .line 395
    .line 396
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 397
    .line 398
    .line 399
    move-result p0

    .line 400
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 401
    .line 402
    .line 403
    move-result p0

    .line 404
    if-nez p0, :cond_5

    .line 405
    .line 406
    const-class p0, Ljava/util/Map;

    .line 407
    .line 408
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 413
    .line 414
    .line 415
    move-result p0

    .line 416
    if-eqz p0, :cond_5

    .line 417
    .line 418
    goto :goto_5

    .line 419
    :cond_5
    move v5, v7

    .line 420
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    return-object p0

    .line 425
    :pswitch_f
    check-cast p1, Ljava/lang/Class;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    new-instance p0, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 433
    .line 434
    .line 435
    :goto_6
    if-eqz p1, :cond_7

    .line 436
    .line 437
    const-class v0, Ljava/lang/Object;

    .line 438
    .line 439
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-nez v0, :cond_7

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    new-instance v1, Lj72;

    .line 457
    .line 458
    const/16 v2, 0xa

    .line 459
    .line 460
    invoke-direct {v1, v2}, Lj72;-><init>(I)V

    .line 461
    .line 462
    .line 463
    new-instance v2, Ly30;

    .line 464
    .line 465
    invoke-direct {v2, v0, v5, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 466
    .line 467
    .line 468
    new-instance v0, Lx30;

    .line 469
    .line 470
    invoke-direct {v0, v2}, Lx30;-><init>(Ly30;)V

    .line 471
    .line 472
    .line 473
    :catchall_1
    :goto_7
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-eqz v1, :cond_6

    .line 478
    .line 479
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    check-cast v1, Ljava/lang/reflect/Field;

    .line 484
    .line 485
    :try_start_1
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 489
    .line 490
    .line 491
    goto :goto_7

    .line 492
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    goto :goto_6

    .line 497
    :cond_7
    return-object p0

    .line 498
    :pswitch_10
    check-cast p1, Ld82;

    .line 499
    .line 500
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    return-object p0

    .line 508
    :pswitch_11
    check-cast p1, Ljava/util/Map$Entry;

    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    check-cast p0, Ld82;

    .line 518
    .line 519
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    new-instance v0, Ljava/lang/StringBuilder;

    .line 528
    .line 529
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    const-string p0, ":"

    .line 536
    .line 537
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    return-object p0

    .line 548
    :pswitch_12
    check-cast p1, Ly3;

    .line 549
    .line 550
    iget p0, p1, Ly3;->α:F

    .line 551
    .line 552
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    return-object p0

    .line 557
    :pswitch_13
    check-cast p1, Lb4;

    .line 558
    .line 559
    new-instance p0, Lml1;

    .line 560
    .line 561
    iget v0, p1, Lb4;->α:F

    .line 562
    .line 563
    iget v1, p1, Lb4;->β:F

    .line 564
    .line 565
    iget v2, p1, Lb4;->γ:F

    .line 566
    .line 567
    iget p1, p1, Lb4;->δ:F

    .line 568
    .line 569
    invoke-direct {p0, v0, v1, v2, p1}, Lml1;-><init>(FFFF)V

    .line 570
    .line 571
    .line 572
    return-object p0

    .line 573
    :pswitch_14
    check-cast p1, Lml1;

    .line 574
    .line 575
    new-instance p0, Lb4;

    .line 576
    .line 577
    iget v0, p1, Lml1;->α:F

    .line 578
    .line 579
    iget v1, p1, Lml1;->β:F

    .line 580
    .line 581
    iget v2, p1, Lml1;->γ:F

    .line 582
    .line 583
    iget p1, p1, Lml1;->δ:F

    .line 584
    .line 585
    invoke-direct {p0, v0, v1, v2, p1}, Lb4;-><init>(FFFF)V

    .line 586
    .line 587
    .line 588
    return-object p0

    .line 589
    :pswitch_15
    check-cast p1, Lz3;

    .line 590
    .line 591
    iget p0, p1, Lz3;->α:F

    .line 592
    .line 593
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 594
    .line 595
    .line 596
    move-result p0

    .line 597
    if-gez p0, :cond_8

    .line 598
    .line 599
    move p0, v7

    .line 600
    :cond_8
    iget p1, p1, Lz3;->β:F

    .line 601
    .line 602
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 603
    .line 604
    .line 605
    move-result p1

    .line 606
    if-gez p1, :cond_9

    .line 607
    .line 608
    goto :goto_8

    .line 609
    :cond_9
    move v7, p1

    .line 610
    :goto_8
    int-to-long p0, p0

    .line 611
    shl-long/2addr p0, v4

    .line 612
    int-to-long v0, v7

    .line 613
    and-long/2addr v0, v2

    .line 614
    or-long/2addr p0, v0

    .line 615
    new-instance v0, Lbn0;

    .line 616
    .line 617
    invoke-direct {v0, p0, p1}, Lbn0;-><init>(J)V

    .line 618
    .line 619
    .line 620
    return-object v0

    .line 621
    :pswitch_16
    check-cast p1, Lbn0;

    .line 622
    .line 623
    new-instance p0, Lz3;

    .line 624
    .line 625
    iget-wide v0, p1, Lbn0;->α:J

    .line 626
    .line 627
    shr-long v4, v0, v4

    .line 628
    .line 629
    long-to-int p1, v4

    .line 630
    int-to-float p1, p1

    .line 631
    and-long/2addr v0, v2

    .line 632
    long-to-int v0, v0

    .line 633
    int-to-float v0, v0

    .line 634
    invoke-direct {p0, p1, v0}, Lz3;-><init>(FF)V

    .line 635
    .line 636
    .line 637
    return-object p0

    .line 638
    :pswitch_17
    check-cast p1, Lz3;

    .line 639
    .line 640
    iget p0, p1, Lz3;->α:F

    .line 641
    .line 642
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 643
    .line 644
    .line 645
    move-result p0

    .line 646
    iget p1, p1, Lz3;->β:F

    .line 647
    .line 648
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 649
    .line 650
    .line 651
    move-result p1

    .line 652
    int-to-long v0, p0

    .line 653
    shl-long/2addr v0, v4

    .line 654
    int-to-long p0, p1

    .line 655
    and-long/2addr p0, v2

    .line 656
    or-long/2addr p0, v0

    .line 657
    new-instance v0, Lum0;

    .line 658
    .line 659
    invoke-direct {v0, p0, p1}, Lum0;-><init>(J)V

    .line 660
    .line 661
    .line 662
    return-object v0

    .line 663
    :pswitch_18
    check-cast p1, Lum0;

    .line 664
    .line 665
    new-instance p0, Lz3;

    .line 666
    .line 667
    iget-wide v0, p1, Lum0;->α:J

    .line 668
    .line 669
    shr-long v4, v0, v4

    .line 670
    .line 671
    long-to-int p1, v4

    .line 672
    int-to-float p1, p1

    .line 673
    and-long/2addr v0, v2

    .line 674
    long-to-int v0, v0

    .line 675
    int-to-float v0, v0

    .line 676
    invoke-direct {p0, p1, v0}, Lz3;-><init>(FF)V

    .line 677
    .line 678
    .line 679
    return-object p0

    .line 680
    nop

    .line 681
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
