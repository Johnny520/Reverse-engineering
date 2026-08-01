.class public final synthetic Ls20;
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
    iput p1, p0, Ls20;->ε:I

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
    .locals 12

    .line 1
    iget p0, p0, Ls20;->ε:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    const/4 v1, 0x7

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    cmp-long p0, p0, v0

    .line 20
    .line 21
    if-lez p0, :cond_0

    .line 22
    .line 23
    move v2, v3

    .line 24
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p1, Ljava/lang/Class;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    array-length p0, p0

    .line 66
    if-nez p0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_1

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_1

    .line 89
    .line 90
    move v2, v3

    .line 91
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const-string p0, "*"

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-nez p0, :cond_2

    .line 108
    .line 109
    sget-object p0, Ljb0;->μ:Ljava/util/Set;

    .line 110
    .line 111
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_3

    .line 116
    .line 117
    :cond_2
    sget-object p0, Ljb0;->ε:Ljava/util/concurrent/ScheduledExecutorService;

    .line 118
    .line 119
    new-instance p1, Ls0;

    .line 120
    .line 121
    const/16 v0, 0x1b

    .line 122
    .line 123
    invoke-direct {p1, v0}, Ls0;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    sget-object p0, Ls62;->α:Ls62;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_4
    sget-object p0, Lax1;->γ:Ljava/lang/Object;

    .line 133
    .line 134
    monitor-enter p0

    .line 135
    :try_start_0
    sget-object v0, Lax1;->ι:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    :goto_0
    if-ge v2, v1, :cond_4

    .line 142
    .line 143
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, La80;

    .line 148
    .line 149
    invoke-interface {v3, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    move-object p1, v0

    .line 157
    goto :goto_1

    .line 158
    :cond_4
    monitor-exit p0

    .line 159
    sget-object p0, Ls62;->α:Ls62;

    .line 160
    .line 161
    return-object p0

    .line 162
    :goto_1
    monitor-exit p0

    .line 163
    throw p1

    .line 164
    :pswitch_5
    check-cast p1, Ljava/lang/reflect/Method;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    array-length p0, p0

    .line 177
    if-nez p0, :cond_6

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-nez p0, :cond_6

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    const-string v0, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"

    .line 198
    .line 199
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    if-nez p0, :cond_5

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    const-string p1, "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"

    .line 218
    .line 219
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    if-eqz p0, :cond_6

    .line 228
    .line 229
    :cond_5
    move v2, v3

    .line 230
    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    return-object p0

    .line 235
    :pswitch_6
    check-cast p1, Ljava/lang/ClassLoader;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    sget-object p0, Lh30;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 241
    .line 242
    invoke-static {}, Lg30;->values()[Lg30;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    array-length v0, p0

    .line 247
    move v1, v2

    .line 248
    :goto_2
    if-ge v1, v0, :cond_7

    .line 249
    .line 250
    aget-object v3, p0, v1

    .line 251
    .line 252
    invoke-static {v3, p1, v2}, Lh30;->δ(Lg30;Ljava/lang/ClassLoader;Z)V

    .line 253
    .line 254
    .line 255
    add-int/lit8 v1, v1, 0x1

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_7
    invoke-static {p1, v2}, Lh30;->ε(Ljava/lang/ClassLoader;Z)V

    .line 259
    .line 260
    .line 261
    sget-object p0, Ls62;->α:Ls62;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_7
    check-cast p1, Ljava/lang/ClassLoader;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Lg30;->values()[Lg30;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    new-instance v0, Ljava/util/ArrayList;

    .line 274
    .line 275
    array-length v1, p0

    .line 276
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 277
    .line 278
    .line 279
    array-length v1, p0

    .line 280
    :goto_3
    const/16 v3, 0x9

    .line 281
    .line 282
    if-ge v2, v1, :cond_8

    .line 283
    .line 284
    aget-object v4, p0, v2

    .line 285
    .line 286
    new-instance v5, Lqx;

    .line 287
    .line 288
    sget-object v6, Lox;->α:Ljava/lang/Object;

    .line 289
    .line 290
    iget-object v6, v4, Lg30;->ε:Lkx;

    .line 291
    .line 292
    invoke-static {v6, p1}, Lox;->ζ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    iget-object v7, v4, Lg30;->ε:Lkx;

    .line 297
    .line 298
    iget-object v7, v7, Lkx;->ζ:Ljava/lang/String;

    .line 299
    .line 300
    new-instance v8, Lp3;

    .line 301
    .line 302
    invoke-direct {v8, v4, v3, p1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-direct {v5, v6, v7, v8}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    add-int/lit8 v2, v2, 0x1

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_8
    new-instance p0, Lqx;

    .line 315
    .line 316
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 317
    .line 318
    sget-object v1, Lkx;->С:Lkx;

    .line 319
    .line 320
    invoke-static {v1, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    const-string v2, "\u5b9a\u4f4d\u89c6\u9891\u64ad\u653e\u5730\u5740\u6a21\u578b Getter \u65b9\u6cd5"

    .line 325
    .line 326
    new-instance v4, Lr20;

    .line 327
    .line 328
    invoke-direct {v4, p1, v3}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 329
    .line 330
    .line 331
    invoke-direct {p0, v1, v2, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 332
    .line 333
    .line 334
    invoke-static {p0, v0}, Lxh;->Ф(Ljava/lang/Object;Ljava/util/List;)Ljava/util/ArrayList;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    return-object p0

    .line 339
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/Field;

    .line 340
    .line 341
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 345
    .line 346
    .line 347
    sget-object p0, Ls62;->α:Ls62;

    .line 348
    .line 349
    return-object p0

    .line 350
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 351
    .line 352
    invoke-static {p1}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-static {v0, p1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    new-instance v5, Ljava/util/ArrayList;

    .line 372
    .line 373
    array-length v6, v4

    .line 374
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 375
    .line 376
    .line 377
    array-length v6, v4

    .line 378
    :goto_4
    if-ge v2, v6, :cond_9

    .line 379
    .line 380
    aget-object v7, v4, v2

    .line 381
    .line 382
    invoke-static {v7, v5, v2, v3}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    goto :goto_4

    .line 387
    :cond_9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 392
    .line 393
    .line 394
    const-string v6, ","

    .line 395
    .line 396
    const/4 v10, 0x0

    .line 397
    const/16 v11, 0x3e

    .line 398
    .line 399
    const/4 v7, 0x0

    .line 400
    const/4 v8, 0x0

    .line 401
    const/4 v9, 0x0

    .line 402
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    const-string v2, "#"

    .line 407
    .line 408
    const-string v3, "("

    .line 409
    .line 410
    invoke-static {p0, v2, v0, v3, p1}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    const-string p1, "):"

    .line 415
    .line 416
    invoke-static {p0, p1, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    return-object p0

    .line 421
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 422
    .line 423
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 424
    .line 425
    .line 426
    sget-object p0, Ls62;->α:Ls62;

    .line 427
    .line 428
    return-object p0

    .line 429
    :pswitch_b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    array-length p0, p0

    .line 439
    if-nez p0, :cond_b

    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 442
    .line 443
    .line 444
    move-result p0

    .line 445
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 446
    .line 447
    .line 448
    move-result p0

    .line 449
    if-nez p0, :cond_b

    .line 450
    .line 451
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    const-string v0, "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"

    .line 460
    .line 461
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result p0

    .line 469
    if-nez p0, :cond_a

    .line 470
    .line 471
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    const-string p1, "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"

    .line 480
    .line 481
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result p0

    .line 489
    if-eqz p0, :cond_b

    .line 490
    .line 491
    :cond_a
    move v2, v3

    .line 492
    :cond_b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    return-object p0

    .line 497
    :pswitch_c
    check-cast p1, Ljava/lang/reflect/Method;

    .line 498
    .line 499
    invoke-static {p1}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-static {v0, p1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    move-result-object v4

    .line 515
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    new-instance v5, Ljava/util/ArrayList;

    .line 519
    .line 520
    array-length v6, v4

    .line 521
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 522
    .line 523
    .line 524
    array-length v6, v4

    .line 525
    :goto_5
    if-ge v2, v6, :cond_c

    .line 526
    .line 527
    aget-object v7, v4, v2

    .line 528
    .line 529
    invoke-static {v7, v5, v2, v3}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 530
    .line 531
    .line 532
    move-result v2

    .line 533
    goto :goto_5

    .line 534
    :cond_c
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 535
    .line 536
    .line 537
    move-result p1

    .line 538
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 539
    .line 540
    .line 541
    const-string v6, ","

    .line 542
    .line 543
    const/4 v10, 0x0

    .line 544
    const/16 v11, 0x3e

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const/4 v8, 0x0

    .line 548
    const/4 v9, 0x0

    .line 549
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    const-string v2, "#"

    .line 554
    .line 555
    const-string v3, "("

    .line 556
    .line 557
    invoke-static {p0, v2, v0, v3, p1}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    const-string p1, "):"

    .line 562
    .line 563
    invoke-static {p0, p1, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object p0

    .line 567
    return-object p0

    .line 568
    :pswitch_d
    check-cast p1, Ljava/lang/reflect/Method;

    .line 569
    .line 570
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    invoke-static {p1}, Lh30;->η(Ljava/lang/reflect/Method;)I

    .line 574
    .line 575
    .line 576
    move-result p0

    .line 577
    const/16 p1, 0x708

    .line 578
    .line 579
    if-lt p0, p1, :cond_d

    .line 580
    .line 581
    move v2, v3

    .line 582
    :cond_d
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    return-object p0

    .line 587
    :pswitch_e
    check-cast p1, Ljava/lang/reflect/Method;

    .line 588
    .line 589
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-virtual {p1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 593
    .line 594
    .line 595
    sget-object p0, Ls62;->α:Ls62;

    .line 596
    .line 597
    return-object p0

    .line 598
    :pswitch_f
    check-cast p1, Ljava/lang/reflect/Field;

    .line 599
    .line 600
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 604
    .line 605
    .line 606
    move-result p0

    .line 607
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 608
    .line 609
    .line 610
    move-result p0

    .line 611
    xor-int/2addr p0, v3

    .line 612
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 613
    .line 614
    .line 615
    move-result-object p0

    .line 616
    return-object p0

    .line 617
    :pswitch_10
    check-cast p1, Ljava/lang/Class;

    .line 618
    .line 619
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    return-object p0

    .line 624
    :pswitch_11
    check-cast p1, Ljava/lang/Class;

    .line 625
    .line 626
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    return-object p0

    .line 634
    :pswitch_12
    check-cast p1, Ljava/lang/ClassLoader;

    .line 635
    .line 636
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-static {p1}, Lc30;->δ(Ljava/lang/ClassLoader;)V

    .line 640
    .line 641
    .line 642
    sget-object p0, Ls62;->α:Ls62;

    .line 643
    .line 644
    return-object p0

    .line 645
    :pswitch_13
    check-cast p1, Ljava/lang/ClassLoader;

    .line 646
    .line 647
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    new-instance p0, Lqx;

    .line 651
    .line 652
    sget-object v2, Lox;->α:Ljava/lang/Object;

    .line 653
    .line 654
    sget-object v2, Lkx;->я:Lkx;

    .line 655
    .line 656
    invoke-static {v2, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    const-string v3, "\u5b9a\u4f4d Feed \u53f3\u4fa7\u63a7\u4ef6\u6a21\u5757\u7c7b"

    .line 661
    .line 662
    new-instance v4, Lr20;

    .line 663
    .line 664
    invoke-direct {v4, p1, v1}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 665
    .line 666
    .line 667
    invoke-direct {p0, v2, v3, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 668
    .line 669
    .line 670
    new-instance v1, Lqx;

    .line 671
    .line 672
    sget-object v2, Lkx;->А:Lkx;

    .line 673
    .line 674
    invoke-static {v2, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    const-string v3, "\u5b9a\u4f4d Feed \u5934\u50cf\u6269\u5c55 PresenterGroup \u7c7b"

    .line 679
    .line 680
    new-instance v4, Lr20;

    .line 681
    .line 682
    invoke-direct {v4, p1, v0}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 683
    .line 684
    .line 685
    invoke-direct {v1, v2, v3, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 686
    .line 687
    .line 688
    filled-new-array {p0, v1}, [Lqx;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object p0

    .line 696
    return-object p0

    .line 697
    :pswitch_14
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 698
    .line 699
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    const-class p0, Landroid/view/View;

    .line 703
    .line 704
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->returnType(Ljava/lang/Class;)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 705
    .line 706
    .line 707
    const/4 p0, 0x3

    .line 708
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->paramCount(I)Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 709
    .line 710
    .line 711
    sget-object p0, Ls62;->α:Ls62;

    .line 712
    .line 713
    return-object p0

    .line 714
    :pswitch_15
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 715
    .line 716
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    new-instance p0, Ls20;

    .line 720
    .line 721
    invoke-direct {p0, v0}, Ls20;-><init>(I)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;->add(La80;)Lorg/luckypray/dexkit/query/matchers/MethodsMatcher;

    .line 725
    .line 726
    .line 727
    sget-object p0, Ls62;->α:Ls62;

    .line 728
    .line 729
    return-object p0

    .line 730
    :pswitch_16
    move-object v2, p1

    .line 731
    check-cast v2, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 732
    .line 733
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    const-string p0, "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314028F5A6C96A968724110CE5DD878D6654DCD64D754A5F498DF2F177829ACF900101545BD428"

    .line 737
    .line 738
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    const/4 v6, 0x6

    .line 743
    const/4 v7, 0x0

    .line 744
    const/4 v4, 0x0

    .line 745
    const/4 v5, 0x0

    .line 746
    invoke-static/range {v2 .. v7}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->addInterface$default(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 747
    .line 748
    .line 749
    new-instance p0, Ls20;

    .line 750
    .line 751
    invoke-direct {p0, v1}, Ls20;-><init>(I)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2, p0}, Lorg/luckypray/dexkit/query/matchers/ClassMatcher;->methods(La80;)Lorg/luckypray/dexkit/query/matchers/ClassMatcher;

    .line 755
    .line 756
    .line 757
    sget-object p0, Ls62;->α:Ls62;

    .line 758
    .line 759
    return-object p0

    .line 760
    :pswitch_17
    check-cast p1, Lorg/luckypray/dexkit/query/FindClass;

    .line 761
    .line 762
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    new-instance p0, Ls20;

    .line 766
    .line 767
    const/4 v0, 0x6

    .line 768
    invoke-direct {p0, v0}, Ls20;-><init>(I)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindClass;->matcher(La80;)Lorg/luckypray/dexkit/query/FindClass;

    .line 772
    .line 773
    .line 774
    sget-object p0, Ls62;->α:Ls62;

    .line 775
    .line 776
    return-object p0

    .line 777
    :pswitch_18
    check-cast p1, Landroid/content/Context;

    .line 778
    .line 779
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    sget-object p0, Lz20;->α:Lz20;

    .line 783
    .line 784
    const-string p0, "auto_scroll_next_enabled"

    .line 785
    .line 786
    invoke-static {p0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 787
    .line 788
    .line 789
    move-result p0

    .line 790
    if-eqz p0, :cond_e

    .line 791
    .line 792
    const-string p0, "#2F8CFF"

    .line 793
    .line 794
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 795
    .line 796
    .line 797
    move-result p0

    .line 798
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 799
    .line 800
    .line 801
    move-result-object p0

    .line 802
    goto :goto_6

    .line 803
    :cond_e
    const-string p0, "#FFFFFFFF"

    .line 804
    .line 805
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 806
    .line 807
    .line 808
    move-result p0

    .line 809
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 810
    .line 811
    .line 812
    move-result-object p0

    .line 813
    :goto_6
    return-object p0

    .line 814
    :pswitch_19
    check-cast p1, Landroid/content/Context;

    .line 815
    .line 816
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    sget-object p0, Lz20;->α:Lz20;

    .line 820
    .line 821
    const p0, 0x7f0800b7

    .line 822
    .line 823
    .line 824
    const-string v0, "play"

    .line 825
    .line 826
    invoke-static {p0, p1, v0}, Lz20;->π(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 827
    .line 828
    .line 829
    move-result-object p0

    .line 830
    return-object p0

    .line 831
    :pswitch_1a
    check-cast p1, Landroid/content/Context;

    .line 832
    .line 833
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    const/4 p0, 0x0

    .line 837
    return-object p0

    .line 838
    :pswitch_1b
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 839
    .line 840
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    const-string p0, "~7900D027A3932BB549D3B8B2DD00267041103759ADD6D0A1A70C488FC6B59198F6388B3274"

    .line 844
    .line 845
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object p0

    .line 849
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setDeclaredClass(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    const-string p0, "void"

    .line 853
    .line 854
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    const-string p0, "~7924EBBB26E5F67FFF0E3BFBBADCDA20635AA34941353E9324DD0F29CE2AB2598E4CEDA96265666F373BCC67"

    .line 858
    .line 859
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object p0

    .line 863
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 864
    .line 865
    .line 866
    move-result-object p0

    .line 867
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setParamTypes(Ljava/util/Collection;)V

    .line 868
    .line 869
    .line 870
    sget-object p0, Ls62;->α:Ls62;

    .line 871
    .line 872
    return-object p0

    .line 873
    :pswitch_1c
    check-cast p1, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;

    .line 874
    .line 875
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    const-string p0, "~7900D027A3932BB549D3B8B2DD00267041103759ADD6D0A1A70C488FC6B59198F6388B3274"

    .line 879
    .line 880
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object p0

    .line 884
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setDeclaredClass(Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    const-string p0, "void"

    .line 888
    .line 889
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setReturnType(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    const-string p0, "java.lang.String[]"

    .line 893
    .line 894
    const-string v0, "java.lang.String"

    .line 895
    .line 896
    const-string v1, "long"

    .line 897
    .line 898
    filled-new-array {p0, v0, v1, v0}, [Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object p0

    .line 902
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 903
    .line 904
    .line 905
    move-result-object p0

    .line 906
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/matchers/MethodMatcher;->setParamTypes(Ljava/util/Collection;)V

    .line 907
    .line 908
    .line 909
    sget-object p0, Ls62;->α:Ls62;

    .line 910
    .line 911
    return-object p0

    .line 912
    nop

    .line 913
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
