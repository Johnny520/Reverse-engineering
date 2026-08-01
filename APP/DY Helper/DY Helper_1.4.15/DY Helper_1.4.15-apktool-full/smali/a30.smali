.class public final synthetic La30;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, La30;->ε:I

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lo80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, La30;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Lid1;

    .line 8
    .line 9
    check-cast p2, Lid1;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lqc1;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, p1, Lid1;->ε:Ljava/lang/Integer;

    .line 25
    .line 26
    const-string v0, "Required value was null."

    .line 27
    .line 28
    if-eqz p0, :cond_d

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iget-object v2, p2, Lid1;->ε:Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz v2, :cond_c

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v3, p1, Lid1;->ζ:Ljava/lang/Integer;

    .line 43
    .line 44
    if-eqz v3, :cond_b

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iget-object v4, p2, Lid1;->ζ:Ljava/lang/Integer;

    .line 51
    .line 52
    if-eqz v4, :cond_a

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    if-nez v2, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    int-to-long v4, v3

    .line 64
    int-to-long v6, v2

    .line 65
    mul-long/2addr v4, v6

    .line 66
    int-to-long v6, v0

    .line 67
    int-to-long v8, p0

    .line 68
    mul-long/2addr v6, v8

    .line 69
    cmp-long v1, v4, v6

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-static {v6, v7, v4, v5}, Lln0;->π(JJ)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    goto :goto_2

    .line 78
    :cond_1
    :goto_0
    if-nez p0, :cond_2

    .line 79
    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    const/4 p0, -0x1

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    if-nez v2, :cond_3

    .line 85
    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    const/4 p0, 0x1

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    if-eq v3, v0, :cond_4

    .line 91
    .line 92
    invoke-static {v0, v3}, Lln0;->ο(II)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    sub-int/2addr v3, p0

    .line 98
    sub-int/2addr v0, v2

    .line 99
    if-eq v3, v0, :cond_5

    .line 100
    .line 101
    invoke-static {v0, v3}, Lln0;->ο(II)I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    if-eq p0, v2, :cond_6

    .line 107
    .line 108
    invoke-static {p0, v2}, Lln0;->ο(II)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    goto :goto_2

    .line 113
    :cond_6
    iget-object p0, p1, Lid1;->δ:Ljava/lang/Integer;

    .line 114
    .line 115
    const v0, 0x7fffffff

    .line 116
    .line 117
    .line 118
    if-eqz p0, :cond_7

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    goto :goto_1

    .line 125
    :cond_7
    move p0, v0

    .line 126
    :goto_1
    iget-object v1, p2, Lid1;->δ:Ljava/lang/Integer;

    .line 127
    .line 128
    if-eqz v1, :cond_8

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    :cond_8
    if-eq p0, v0, :cond_9

    .line 135
    .line 136
    invoke-static {p0, v0}, Lln0;->ο(II)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    goto :goto_2

    .line 141
    :cond_9
    iget p0, p1, Lid1;->α:I

    .line 142
    .line 143
    iget p1, p2, Lid1;->α:I

    .line 144
    .line 145
    invoke-static {p0, p1}, Lln0;->ο(II)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    :goto_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    goto :goto_3

    .line 154
    :cond_a
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_b
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_c
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_d
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_3
    return-object v1

    .line 170
    :pswitch_0
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 171
    .line 172
    check-cast p2, Ljava/lang/ClassLoader;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, Lb30;

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget-object p0, Lb30;->α:Lb30;

    .line 188
    .line 189
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 190
    .line 191
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 192
    .line 193
    .line 194
    sget-object v2, Lb30;->γ:Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    :cond_e
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_f

    .line 205
    .line 206
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {p1, p2, v3}, Lb30;->β(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    if-eqz v3, :cond_e

    .line 217
    .line 218
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_f
    :try_start_0
    new-instance v2, Ls20;

    .line 223
    .line 224
    const/4 v3, 0x5

    .line 225
    invoke-direct {v2, v3}, Ls20;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(La80;)Lorg/luckypray/dexkit/result/ClassDataList;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    new-instance v2, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    :cond_10
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eqz v3, :cond_11

    .line 246
    .line 247
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    check-cast v3, Lorg/luckypray/dexkit/result/ClassData;

    .line 252
    .line 253
    invoke-static {v3, p2}, Lb30;->α(Lorg/luckypray/dexkit/result/ClassData;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    if-eqz v3, :cond_10

    .line 258
    .line 259
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :catchall_0
    move-exception p1

    .line 264
    goto :goto_7

    .line 265
    :cond_11
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    if-eqz p2, :cond_12

    .line 274
    .line 275
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    check-cast p2, Ljava/lang/Class;

    .line 280
    .line 281
    invoke-virtual {v0, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_12
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :goto_7
    new-instance p2, Leo1;

    .line 289
    .line 290
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    move-object p1, p2

    .line 294
    :goto_8
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    if-eqz p1, :cond_13

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    const-string p2, "DexKit \u7ed3\u6784\u5b9a\u4f4d Flux \u53f3\u4fa7\u63a7\u4ef6\u7c7b\u5931\u8d25: "

    .line 305
    .line 306
    invoke-static {p2, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    const/4 p2, 0x4

    .line 311
    const-string v2, "rd9730769dd2a56d9"

    .line 312
    .line 313
    invoke-static {v2, p1, v1, p2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :cond_13
    new-instance p1, Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    :cond_14
    :goto_9
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-eqz v0, :cond_15

    .line 330
    .line 331
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    move-object v1, v0

    .line 336
    check-cast v1, Ljava/lang/Class;

    .line 337
    .line 338
    invoke-virtual {p0, v1}, Lb30;->η(Ljava/lang/Class;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-eqz v1, :cond_14

    .line 343
    .line 344
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_15
    new-instance p0, Ljava/util/HashSet;

    .line 349
    .line 350
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 351
    .line 352
    .line 353
    new-instance p2, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    :cond_16
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_17

    .line 367
    .line 368
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    move-object v1, v0

    .line 373
    check-cast v1, Ljava/lang/Class;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    if-eqz v1, :cond_16

    .line 384
    .line 385
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_17
    return-object p2

    .line 390
    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 391
    .line 392
    check-cast p2, Ljava/lang/ClassLoader;

    .line 393
    .line 394
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast p0, Lb30;

    .line 403
    .line 404
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 408
    .line 409
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 410
    .line 411
    .line 412
    sget-object v0, Lb30;->δ:Ljava/util/List;

    .line 413
    .line 414
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    :cond_18
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_19

    .line 423
    .line 424
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    check-cast v1, Ljava/lang/String;

    .line 429
    .line 430
    sget-object v2, Lb30;->α:Lb30;

    .line 431
    .line 432
    invoke-static {p1, p2, v1}, Lb30;->β(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    if-eqz v1, :cond_18

    .line 437
    .line 438
    invoke-virtual {p0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    goto :goto_b

    .line 442
    :cond_19
    new-instance p1, Ljava/util/ArrayList;

    .line 443
    .line 444
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    :cond_1a
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result p2

    .line 455
    if-eqz p2, :cond_1b

    .line 456
    .line 457
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object p2

    .line 461
    move-object v0, p2

    .line 462
    check-cast v0, Ljava/lang/Class;

    .line 463
    .line 464
    invoke-static {v0}, Lb30;->δ(Ljava/lang/Class;)Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-eqz v0, :cond_1a

    .line 469
    .line 470
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    goto :goto_c

    .line 474
    :cond_1b
    new-instance p0, Ljava/util/HashSet;

    .line 475
    .line 476
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 477
    .line 478
    .line 479
    new-instance p2, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    :cond_1c
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-eqz v0, :cond_1d

    .line 493
    .line 494
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    move-object v1, v0

    .line 499
    check-cast v1, Ljava/lang/Class;

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    invoke-virtual {p0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-eqz v1, :cond_1c

    .line 510
    .line 511
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_1d
    return-object p2

    .line 516
    nop

    .line 517
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
