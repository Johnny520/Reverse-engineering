.class public final synthetic Lk41;
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
    iput p2, p0, Lk41;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lk41;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lk41;->ε:I

    .line 2
    .line 3
    sget-object v1, Ljz;->ε:Ljz;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, Ls62;->α:Ls62;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, Lk41;->ζ:Ljava/lang/ClassLoader;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object p0, Lm82;->α:Lm82;

    .line 16
    .line 17
    invoke-virtual {p0, v6, v5}, Lm82;->η(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    return-object v4

    .line 21
    :pswitch_0
    sget-object p0, Lry1;->α:Lry1;

    .line 22
    .line 23
    invoke-static {v6, v5}, Lry1;->Р(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :pswitch_1
    sget-object p0, Lry1;->α:Lry1;

    .line 28
    .line 29
    invoke-static {v6, v5}, Lry1;->Т(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object v4

    .line 33
    :pswitch_2
    sget-object p0, Lry1;->α:Lry1;

    .line 34
    .line 35
    invoke-static {v6, v5}, Lry1;->С(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-object v4

    .line 39
    :pswitch_3
    sget-object p0, Lry1;->α:Lry1;

    .line 40
    .line 41
    invoke-virtual {p0, v6, v5}, Lry1;->П(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    return-object v4

    .line 45
    :pswitch_4
    sget-object p0, Lry1;->α:Lry1;

    .line 46
    .line 47
    :try_start_0
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lry1;->ψ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p0, v0

    .line 70
    goto/16 :goto_8

    .line 71
    .line 72
    :cond_0
    :goto_0
    sget-object v4, Lry1;->δ:[Ljava/lang/String;

    .line 73
    .line 74
    array-length v7, v4

    .line 75
    move v8, v3

    .line 76
    :goto_1
    if-ge v8, v7, :cond_3

    .line 77
    .line 78
    aget-object v0, v4, v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    :try_start_1
    invoke-static {v0, v3, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    goto :goto_2

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    :try_start_2
    new-instance v9, Leo1;

    .line 87
    .line 88
    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v9

    .line 92
    :goto_2
    instance-of v9, v0, Leo1;

    .line 93
    .line 94
    if-eqz v9, :cond_1

    .line 95
    .line 96
    move-object v0, v2

    .line 97
    :cond_1
    check-cast v0, Ljava/lang/Class;

    .line 98
    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    sget-object v0, Lry1;->ε:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v6, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v2, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    :cond_4
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    move-object v4, v3

    .line 133
    check-cast v4, Ljava/lang/Class;

    .line 134
    .line 135
    invoke-static {v4}, Lry1;->м(Ljava/lang/Class;)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_4

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_6

    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Ljava/lang/Class;

    .line 165
    .line 166
    new-instance v4, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 172
    .line 173
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-static {v6, v4, v3}, Lry1;->δ(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p0, v4}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    :cond_7
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_8

    .line 197
    .line 198
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    move-object v4, v3

    .line 203
    check-cast v4, Ljava/lang/reflect/Method;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v4}, Lry1;->ф(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_7

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_8
    new-instance p0, Lqy1;

    .line 219
    .line 220
    sget-object v0, Lry1;->α:Lry1;

    .line 221
    .line 222
    const/4 v0, 0x2

    .line 223
    invoke-direct {p0, v0}, Lqy1;-><init>(I)V

    .line 224
    .line 225
    .line 226
    invoke-static {v2, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    new-instance v0, Ljava/util/HashSet;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 233
    .line 234
    .line 235
    new-instance v2, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    :cond_9
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-eqz v3, :cond_a

    .line 249
    .line 250
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    move-object v4, v3

    .line 255
    check-cast v4, Ljava/lang/reflect/Method;

    .line 256
    .line 257
    invoke-static {v4}, Lry1;->ｇ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_9

    .line 266
    .line 267
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_b

    .line 280
    .line 281
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    check-cast v0, Ljava/lang/reflect/Method;

    .line 286
    .line 287
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 288
    .line 289
    .line 290
    goto :goto_7

    .line 291
    :goto_8
    new-instance v2, Leo1;

    .line 292
    .line 293
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    :cond_b
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    if-nez p0, :cond_c

    .line 301
    .line 302
    move-object v1, v2

    .line 303
    goto :goto_9

    .line 304
    :cond_c
    const-string v0, "\u706b\u82b1 Message \u53d1\u9001\u5165\u53e3\u53cd\u5c04\u515c\u5e95\u5931\u8d25"

    .line 305
    .line 306
    invoke-static {v0, p0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    :goto_9
    check-cast v1, Ljava/util/List;

    .line 310
    .line 311
    return-object v1

    .line 312
    :pswitch_5
    :try_start_3
    sget-object p0, Lry1;->θ:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v6, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    sget-object v0, Lry1;->ι:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v6, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    new-instance v2, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 334
    .line 335
    .line 336
    array-length v4, p0

    .line 337
    :goto_a
    if-ge v3, v4, :cond_e

    .line 338
    .line 339
    aget-object v6, p0, v3

    .line 340
    .line 341
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 346
    .line 347
    .line 348
    move-result v7

    .line 349
    if-nez v7, :cond_d

    .line 350
    .line 351
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    array-length v7, v7

    .line 359
    if-nez v7, :cond_d

    .line 360
    .line 361
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-virtual {v0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    if-eqz v7, :cond_d

    .line 370
    .line 371
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    goto :goto_b

    .line 375
    :catchall_2
    move-exception v0

    .line 376
    move-object p0, v0

    .line 377
    goto :goto_d

    .line 378
    :cond_d
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-eqz v0, :cond_f

    .line 390
    .line 391
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, Ljava/lang/reflect/Method;

    .line 396
    .line 397
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 398
    .line 399
    .line 400
    goto :goto_c

    .line 401
    :goto_d
    new-instance v2, Leo1;

    .line 402
    .line 403
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 404
    .line 405
    .line 406
    :cond_f
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    if-nez p0, :cond_10

    .line 411
    .line 412
    move-object v1, v2

    .line 413
    goto :goto_e

    .line 414
    :cond_10
    sget-object v0, Lry1;->α:Lry1;

    .line 415
    .line 416
    const-string v0, "Conversation#getCoreInfo \u53cd\u5c04\u515c\u5e95\u5931\u8d25"

    .line 417
    .line 418
    invoke-static {v0, p0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 419
    .line 420
    .line 421
    :goto_e
    check-cast v1, Ljava/util/List;

    .line 422
    .line 423
    return-object v1

    .line 424
    :pswitch_6
    sget-object p0, Lry1;->α:Lry1;

    .line 425
    .line 426
    invoke-virtual {p0, v6}, Lry1;->υ(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    return-object p0

    .line 431
    :pswitch_7
    sget-object p0, Lry1;->α:Lry1;

    .line 432
    .line 433
    invoke-virtual {p0, v6}, Lry1;->υ(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    return-object p0

    .line 438
    :pswitch_8
    sget-object p0, Lfk1;->α:Lfk1;

    .line 439
    .line 440
    invoke-virtual {p0, v6, v5}, Lfk1;->α(Ljava/lang/ClassLoader;Z)V

    .line 441
    .line 442
    .line 443
    return-object v4

    .line 444
    :pswitch_9
    sget-object p0, Lck1;->α:Lck1;

    .line 445
    .line 446
    invoke-virtual {p0, v6, v5}, Lck1;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;

    .line 447
    .line 448
    .line 449
    return-object v4

    .line 450
    :pswitch_a
    sget-object p0, Lki1;->α:Lki1;

    .line 451
    .line 452
    invoke-virtual {p0, v6, v5}, Lki1;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 453
    .line 454
    .line 455
    return-object v4

    .line 456
    :pswitch_b
    sget-object p0, Lki1;->α:Lki1;

    .line 457
    .line 458
    invoke-virtual {p0, v6, v5}, Lki1;->ι(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;

    .line 459
    .line 460
    .line 461
    return-object v4

    .line 462
    :pswitch_c
    sget-object p0, Lmi1;->α:Lmi1;

    .line 463
    .line 464
    invoke-static {v6, v5}, Lmi1;->κ(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    return-object v4

    .line 468
    :pswitch_d
    sget-object p0, Lp81;->α:Lp81;

    .line 469
    .line 470
    invoke-virtual {p0, v6, v5}, Lp81;->π(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    return-object v4

    .line 474
    :pswitch_e
    sget-object p0, Lp81;->α:Lp81;

    .line 475
    .line 476
    invoke-virtual {p0, v6, v5}, Lp81;->ο(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    return-object v4

    .line 480
    :pswitch_f
    sget-object p0, Ll41;->α:Ll41;

    .line 481
    .line 482
    const-string p0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"

    .line 483
    .line 484
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    invoke-static {v6, p0}, Ll41;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    if-eqz p0, :cond_11

    .line 493
    .line 494
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    :cond_11
    if-nez v2, :cond_12

    .line 499
    .line 500
    new-array v2, v3, [Ljava/lang/reflect/Method;

    .line 501
    .line 502
    :cond_12
    new-instance p0, Ljava/util/ArrayList;

    .line 503
    .line 504
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 505
    .line 506
    .line 507
    array-length v0, v2

    .line 508
    :goto_f
    if-ge v3, v0, :cond_14

    .line 509
    .line 510
    aget-object v1, v2, v3

    .line 511
    .line 512
    invoke-static {v1}, Ll41;->ε(Ljava/lang/reflect/Method;)Z

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    if-eqz v4, :cond_13

    .line 517
    .line 518
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 522
    .line 523
    goto :goto_f

    .line 524
    :cond_14
    return-object p0

    .line 525
    :pswitch_10
    sget-object p0, Ll41;->α:Ll41;

    .line 526
    .line 527
    const-string p0, "X.C0IIU"

    .line 528
    .line 529
    invoke-static {v6, p0}, Ll41;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object p0

    .line 533
    if-eqz p0, :cond_15

    .line 534
    .line 535
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    :cond_15
    if-nez v2, :cond_16

    .line 540
    .line 541
    new-array v2, v3, [Ljava/lang/reflect/Method;

    .line 542
    .line 543
    :cond_16
    new-instance p0, Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 546
    .line 547
    .line 548
    array-length v0, v2

    .line 549
    :goto_10
    if-ge v3, v0, :cond_18

    .line 550
    .line 551
    aget-object v1, v2, v3

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-static {v1}, Ll41;->θ(Ljava/lang/reflect/Method;)Z

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    if-eqz v4, :cond_17

    .line 561
    .line 562
    sget-object v4, Ll41;->γ:Ljava/util/Set;

    .line 563
    .line 564
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    if-eqz v4, :cond_17

    .line 573
    .line 574
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    :cond_17
    add-int/lit8 v3, v3, 0x1

    .line 578
    .line 579
    goto :goto_10

    .line 580
    :cond_18
    return-object p0

    .line 581
    :pswitch_11
    sget-object v0, Ll41;->α:Ll41;

    .line 582
    .line 583
    iget-object v6, p0, Lk41;->ζ:Ljava/lang/ClassLoader;

    .line 584
    .line 585
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    new-instance v8, Lsv0;

    .line 589
    .line 590
    const/16 p0, 0xb

    .line 591
    .line 592
    invoke-direct {v8, p0}, Lsv0;-><init>(I)V

    .line 593
    .line 594
    .line 595
    new-instance v9, Lr20;

    .line 596
    .line 597
    const/16 p0, 0x1d

    .line 598
    .line 599
    invoke-direct {v9, v6, p0}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 600
    .line 601
    .line 602
    new-instance v10, Lt20;

    .line 603
    .line 604
    const/16 p0, 0x10

    .line 605
    .line 606
    invoke-direct {v10, v6, p0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 607
    .line 608
    .line 609
    sget-object v5, Lkx;->Ｒ:Lkx;

    .line 610
    .line 611
    const/4 v7, 0x1

    .line 612
    invoke-static/range {v5 .. v10}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 613
    .line 614
    .line 615
    return-object v4

    .line 616
    :pswitch_12
    sget-object v0, Ll41;->α:Ll41;

    .line 617
    .line 618
    iget-object v6, p0, Lk41;->ζ:Ljava/lang/ClassLoader;

    .line 619
    .line 620
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    new-instance v8, Lsv0;

    .line 624
    .line 625
    const/16 p0, 0x13

    .line 626
    .line 627
    invoke-direct {v8, p0}, Lsv0;-><init>(I)V

    .line 628
    .line 629
    .line 630
    new-instance v9, Lk41;

    .line 631
    .line 632
    const/16 p0, 0x8

    .line 633
    .line 634
    invoke-direct {v9, v6, p0}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 635
    .line 636
    .line 637
    new-instance v10, Lt20;

    .line 638
    .line 639
    const/16 p0, 0x14

    .line 640
    .line 641
    invoke-direct {v10, v6, p0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 642
    .line 643
    .line 644
    sget-object v5, Lkx;->Ｑ:Lkx;

    .line 645
    .line 646
    const/4 v7, 0x1

    .line 647
    invoke-static/range {v5 .. v10}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 648
    .line 649
    .line 650
    return-object v4

    .line 651
    :pswitch_13
    sget-object v0, Ll41;->α:Ll41;

    .line 652
    .line 653
    iget-object v6, p0, Lk41;->ζ:Ljava/lang/ClassLoader;

    .line 654
    .line 655
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    new-instance v8, Lsv0;

    .line 659
    .line 660
    const/16 p0, 0x16

    .line 661
    .line 662
    invoke-direct {v8, p0}, Lsv0;-><init>(I)V

    .line 663
    .line 664
    .line 665
    new-instance v9, Lr20;

    .line 666
    .line 667
    const/16 p0, 0x1c

    .line 668
    .line 669
    invoke-direct {v9, v6, p0}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 670
    .line 671
    .line 672
    new-instance v10, Lt20;

    .line 673
    .line 674
    const/16 p0, 0xf

    .line 675
    .line 676
    invoke-direct {v10, v6, p0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 677
    .line 678
    .line 679
    sget-object v5, Lkx;->Ｐ:Lkx;

    .line 680
    .line 681
    const/4 v7, 0x1

    .line 682
    invoke-static/range {v5 .. v10}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 683
    .line 684
    .line 685
    return-object v4

    .line 686
    :pswitch_14
    sget-object v0, Ll41;->α:Ll41;

    .line 687
    .line 688
    iget-object v6, p0, Lk41;->ζ:Ljava/lang/ClassLoader;

    .line 689
    .line 690
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    new-instance v8, Lsv0;

    .line 694
    .line 695
    const/16 p0, 0xc

    .line 696
    .line 697
    invoke-direct {v8, p0}, Lsv0;-><init>(I)V

    .line 698
    .line 699
    .line 700
    new-instance v9, Lk41;

    .line 701
    .line 702
    invoke-direct {v9, v6, v3}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 703
    .line 704
    .line 705
    new-instance v10, Lt20;

    .line 706
    .line 707
    const/16 p0, 0x11

    .line 708
    .line 709
    invoke-direct {v10, v6, p0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 710
    .line 711
    .line 712
    sget-object v5, Lkx;->Ｏ:Lkx;

    .line 713
    .line 714
    const/4 v7, 0x1

    .line 715
    invoke-static/range {v5 .. v10}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 716
    .line 717
    .line 718
    return-object v4

    .line 719
    :pswitch_15
    sget-object p0, Ll41;->α:Ll41;

    .line 720
    .line 721
    invoke-virtual {p0, v6, v5}, Ll41;->μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 722
    .line 723
    .line 724
    return-object v4

    .line 725
    :pswitch_16
    sget-object p0, Ll41;->α:Ll41;

    .line 726
    .line 727
    invoke-virtual {p0, v6, v5}, Ll41;->λ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 728
    .line 729
    .line 730
    return-object v4

    .line 731
    :pswitch_17
    sget-object p0, Ll41;->α:Ll41;

    .line 732
    .line 733
    const-string p0, "~78F7D766E6AD8F2F174318E7D62B7C5A33BB7F4AE8124A81AFC66CE9CAF1612AB0CC190D4DE79087AC9AA6387725E92C44671B8A1F53B7D95FD0FC4A146F6E9C4118321BB624C9457379A394FC87165DFAF1C84EA1F2939C"

    .line 734
    .line 735
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object p0

    .line 739
    invoke-static {v6, p0}, Ll41;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    move-result-object p0

    .line 743
    if-eqz p0, :cond_19

    .line 744
    .line 745
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    :cond_19
    if-nez v2, :cond_1a

    .line 750
    .line 751
    new-array v2, v3, [Ljava/lang/reflect/Method;

    .line 752
    .line 753
    :cond_1a
    new-instance p0, Ljava/util/ArrayList;

    .line 754
    .line 755
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 756
    .line 757
    .line 758
    array-length v0, v2

    .line 759
    :goto_11
    if-ge v3, v0, :cond_1c

    .line 760
    .line 761
    aget-object v1, v2, v3

    .line 762
    .line 763
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    invoke-static {v1}, Ll41;->ζ(Ljava/lang/reflect/Method;)Z

    .line 767
    .line 768
    .line 769
    move-result v4

    .line 770
    if-eqz v4, :cond_1b

    .line 771
    .line 772
    sget-object v4, Ll41;->δ:Ljava/util/Set;

    .line 773
    .line 774
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    move-result v4

    .line 782
    if-eqz v4, :cond_1b

    .line 783
    .line 784
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    :cond_1b
    add-int/lit8 v3, v3, 0x1

    .line 788
    .line 789
    goto :goto_11

    .line 790
    :cond_1c
    return-object p0

    .line 791
    :pswitch_data_0
    .packed-switch 0x0
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
