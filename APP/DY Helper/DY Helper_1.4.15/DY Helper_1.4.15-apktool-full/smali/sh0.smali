.class public final synthetic Lsh0;
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
    iput p1, p0, Lsh0;->ε:I

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
    .locals 11

    .line 1
    iget p0, p0, Lsh0;->ε:I

    .line 2
    .line 3
    const-string v0, "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    sget-object v3, Ls62;->α:Ls62;

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/ClassLoader;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lwi0;->α:Lwi0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lwi0;->η(Ljava/lang/ClassLoader;)V

    .line 20
    .line 21
    .line 22
    return-object v3

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/ClassLoader;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p0, Lqx;

    .line 29
    .line 30
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v0, Lkx;->Д:Lkx;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lr20;

    .line 39
    .line 40
    const/16 v2, 0x10

    .line 41
    .line 42
    invoke-direct {v1, p1, v2}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 43
    .line 44
    .line 45
    const-string p1, "\u5b9a\u4f4d IM \u964c\u751f\u4eba\u4f1a\u8bdd\u6a21\u578b\u5de5\u5382"

    .line 46
    .line 47
    invoke-direct {p0, v0, p1, v1}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast p1, Ll91;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p0, p1, Ll91;->ε:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Ljava/lang/reflect/Method;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, Ll91;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p0, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const/16 p1, 0x1388

    .line 79
    .line 80
    if-lt p0, p1, :cond_0

    .line 81
    .line 82
    move v1, v2

    .line 83
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Method;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string v3, "deleteConversation"

    .line 98
    .line 99
    invoke-static {p0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_1

    .line 104
    .line 105
    const/16 p0, 0x2710

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    move p0, v1

    .line 109
    :goto_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Ljava/lang/reflect/Type;

    .line 121
    .line 122
    instance-of v3, v2, Ljava/lang/reflect/ParameterizedType;

    .line 123
    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v3, Ljava/util/ArrayList;

    .line 136
    .line 137
    array-length v4, v2

    .line 138
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    array-length v4, v2

    .line 142
    :goto_1
    if-ge v1, v4, :cond_2

    .line 143
    .line 144
    aget-object v5, v2, v1

    .line 145
    .line 146
    invoke-interface {v5}, Ljava/lang/reflect/Type;->getTypeName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_5

    .line 172
    .line 173
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Ljava/lang/String;

    .line 178
    .line 179
    const-class v3, Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_4

    .line 190
    .line 191
    add-int/lit16 p0, p0, 0x1388

    .line 192
    .line 193
    :cond_5
    :goto_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_6

    .line 210
    .line 211
    add-int/lit16 p0, p0, 0x3e8

    .line 212
    .line 213
    :cond_6
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    new-instance v0, Ll91;

    .line 218
    .line 219
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Method;

    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 229
    .line 230
    .line 231
    return-object v3

    .line 232
    :pswitch_5
    check-cast p1, Ljava/lang/reflect/Method;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_6
    check-cast p1, Ljava/lang/reflect/Method;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    array-length p0, p0

    .line 255
    if-nez p0, :cond_7

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    if-eqz p0, :cond_7

    .line 266
    .line 267
    move v1, v2

    .line 268
    :cond_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    return-object p0

    .line 273
    :pswitch_7
    check-cast p1, Ljava/lang/Class;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    return-object p0

    .line 280
    :pswitch_8
    check-cast p1, Ljava/lang/Class;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    return-object p0

    .line 290
    :pswitch_9
    check-cast p1, Ljava/lang/Class;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    return-object p0

    .line 300
    :pswitch_a
    check-cast p1, Lhj0;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    iget-object p0, p1, Lhj0;->α:Lxi0;

    .line 306
    .line 307
    invoke-virtual {p0}, Lxi0;->β()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_b
    check-cast p1, Lxi0;

    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1}, Lxi0;->β()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    return-object p0

    .line 322
    :pswitch_c
    check-cast p1, Ljava/util/Map$Entry;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    check-cast p0, Ljava/lang/String;

    .line 332
    .line 333
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    check-cast p1, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    const-string v0, " "

    .line 344
    .line 345
    invoke-static {p0, v0, p1}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    return-object p0

    .line 350
    :pswitch_d
    check-cast p1, Ljava/lang/ClassLoader;

    .line 351
    .line 352
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    sget-object p0, Lci0;->α:Lci0;

    .line 356
    .line 357
    invoke-virtual {p0, p1}, Lci0;->η(Ljava/lang/ClassLoader;)V

    .line 358
    .line 359
    .line 360
    return-object v3

    .line 361
    :pswitch_e
    check-cast p1, Ljava/lang/ClassLoader;

    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-static {}, Lbi0;->values()[Lbi0;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    new-instance v0, Ljava/util/ArrayList;

    .line 371
    .line 372
    array-length v2, p0

    .line 373
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 374
    .line 375
    .line 376
    array-length v2, p0

    .line 377
    move v3, v1

    .line 378
    :goto_3
    if-ge v3, v2, :cond_8

    .line 379
    .line 380
    aget-object v4, p0, v3

    .line 381
    .line 382
    new-instance v5, Lqx;

    .line 383
    .line 384
    sget-object v6, Lox;->α:Ljava/lang/Object;

    .line 385
    .line 386
    iget-object v6, v4, Lbi0;->ε:Lkx;

    .line 387
    .line 388
    invoke-static {v6, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    iget-object v7, v4, Lbi0;->ε:Lkx;

    .line 393
    .line 394
    iget-object v7, v7, Lkx;->ζ:Ljava/lang/String;

    .line 395
    .line 396
    new-instance v8, Lwh0;

    .line 397
    .line 398
    invoke-direct {v8, p1, v4, v1}, Lwh0;-><init>(Ljava/lang/ClassLoader;Lbi0;I)V

    .line 399
    .line 400
    .line 401
    invoke-direct {v5, v6, v7, v8}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    add-int/lit8 v3, v3, 0x1

    .line 408
    .line 409
    goto :goto_3

    .line 410
    :cond_8
    return-object v0

    .line 411
    :pswitch_f
    move-object v4, p1

    .line 412
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    const/4 v8, 0x6

    .line 422
    const/4 v9, 0x0

    .line 423
    const/4 v6, 0x0

    .line 424
    const/4 v7, 0x0

    .line 425
    invoke-static/range {v4 .. v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 429
    .line 430
    .line 431
    return-object v3

    .line 432
    :pswitch_10
    move-object v5, p1

    .line 433
    check-cast v5, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 434
    .line 435
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v6

    .line 442
    const/4 v9, 0x6

    .line 443
    const/4 v10, 0x0

    .line 444
    const/4 v7, 0x0

    .line 445
    const/4 v8, 0x0

    .line 446
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 447
    .line 448
    .line 449
    const-string v6, "void"

    .line 450
    .line 451
    invoke-static/range {v5 .. v10}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v5}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 455
    .line 456
    .line 457
    return-object v3

    .line 458
    :pswitch_11
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    new-instance p0, Lsh0;

    .line 464
    .line 465
    const/16 v0, 0xd

    .line 466
    .line 467
    invoke-direct {p0, v0}, Lsh0;-><init>(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 471
    .line 472
    .line 473
    return-object v3

    .line 474
    :pswitch_12
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    new-instance p0, Lsh0;

    .line 480
    .line 481
    const/4 v0, 0x3

    .line 482
    invoke-direct {p0, v0}, Lsh0;-><init>(I)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 486
    .line 487
    .line 488
    return-object v3

    .line 489
    :pswitch_13
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 490
    .line 491
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    new-instance p0, Lsh0;

    .line 495
    .line 496
    const/16 v0, 0xc

    .line 497
    .line 498
    invoke-direct {p0, v0}, Lsh0;-><init>(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 502
    .line 503
    .line 504
    return-object v3

    .line 505
    :pswitch_14
    check-cast p1, Lorg/luckypray/dexkit/query/FindMethod;

    .line 506
    .line 507
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    new-instance p0, Lsh0;

    .line 511
    .line 512
    const/4 v0, 0x7

    .line 513
    invoke-direct {p0, v0}, Lsh0;-><init>(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->matcher(La80;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 517
    .line 518
    .line 519
    return-object v3

    .line 520
    :pswitch_15
    move-object v4, p1

    .line 521
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 522
    .line 523
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v5

    .line 530
    const/4 v8, 0x6

    .line 531
    const/4 v9, 0x0

    .line 532
    const/4 v6, 0x0

    .line 533
    const/4 v7, 0x0

    .line 534
    invoke-static/range {v4 .. v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 535
    .line 536
    .line 537
    const-string v5, "java.util.List"

    .line 538
    .line 539
    invoke-static/range {v4 .. v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 543
    .line 544
    .line 545
    return-object v3

    .line 546
    :pswitch_16
    check-cast p1, Ljava/lang/reflect/Method;

    .line 547
    .line 548
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 552
    .line 553
    .line 554
    return-object v3

    .line 555
    :pswitch_17
    check-cast p1, Ljava/lang/reflect/Method;

    .line 556
    .line 557
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    sget-object p0, Lci0;->α:Lci0;

    .line 561
    .line 562
    invoke-static {p1}, Lci0;->λ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object p0

    .line 566
    return-object p0

    .line 567
    :pswitch_18
    check-cast p1, Ljava/lang/Class;

    .line 568
    .line 569
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    return-object p0

    .line 574
    :pswitch_19
    move-object v4, p1

    .line 575
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 576
    .line 577
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    const-string p0, "~794484268AD6F67E0BEA2ECA830A11B407AB19CC18A67D1BB8C2259BBDE977201B783674DB4FAB0B5E357371E1DCA895D457DE8F"

    .line 581
    .line 582
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    const/4 v8, 0x6

    .line 587
    const/4 v9, 0x0

    .line 588
    const/4 v6, 0x0

    .line 589
    const/4 v7, 0x0

    .line 590
    invoke-static/range {v4 .. v9}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/MethodMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramTypes()Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 594
    .line 595
    .line 596
    return-object v3

    .line 597
    :pswitch_1a
    check-cast p1, Ljava/lang/Long;

    .line 598
    .line 599
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 600
    .line 601
    .line 602
    move-result-wide p0

    .line 603
    const-wide/16 v3, 0x0

    .line 604
    .line 605
    cmp-long p0, p0, v3

    .line 606
    .line 607
    if-lez p0, :cond_9

    .line 608
    .line 609
    move v1, v2

    .line 610
    :cond_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 611
    .line 612
    .line 613
    move-result-object p0

    .line 614
    return-object p0

    .line 615
    :pswitch_1b
    check-cast p1, Lix0;

    .line 616
    .line 617
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    sget-object p0, Lvh0;->α:Lvh0;

    .line 621
    .line 622
    iget-object p0, p1, Lix0;->α:Ljava/util/regex/Matcher;

    .line 623
    .line 624
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object p0

    .line 628
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-static {p0}, Lvh0;->φ(Ljava/lang/String;)Ljava/lang/Long;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    return-object p0

    .line 636
    :pswitch_1c
    check-cast p1, Ljava/lang/Class;

    .line 637
    .line 638
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object p0

    .line 642
    return-object p0

    .line 643
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
.end method
