.class public final synthetic Leu1;
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
    iput p1, p0, Leu1;->ε:I

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
    .locals 7

    .line 1
    iget p0, p0, Leu1;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, 0x14

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p1, Ljava/lang/ClassLoader;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object p0, Lry1;->α:Lry1;

    .line 42
    .line 43
    sget-object v0, Lry1;->Θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    invoke-virtual {v0, v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const-string v0, "Spark DexKit \u9996\u626b\u5b8c\u6210\uff0c\u90e8\u7f72\u4f9d\u8d56 Hook"

    .line 53
    .line 54
    invoke-static {v0}, Lry1;->щ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lry1;->и(Ljava/lang/ClassLoader;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lry1;->з(Ljava/lang/ClassLoader;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lst;->α:Lst;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Lst;->σ(Ljava/lang/ClassLoader;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast p0, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :catchall_0
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Lky1;

    .line 94
    .line 95
    iget-wide v0, p1, Lky1;->γ:J

    .line 96
    .line 97
    cmp-long v2, v0, v3

    .line 98
    .line 99
    if-lez v2, :cond_1

    .line 100
    .line 101
    :try_start_0
    sget-object v2, Lst;->α:Lst;

    .line 102
    .line 103
    iget-object p1, p1, Lky1;->α:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v0, v1, p1}, Lst;->ξ(JLjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_2
    check-cast p1, Ljava/lang/ClassLoader;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance p0, Lqx;

    .line 118
    .line 119
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 120
    .line 121
    sget-object v0, Lkx;->ｄ:Lkx;

    .line 122
    .line 123
    invoke-static {v0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "\u5b9a\u4f4d\u706b\u82b1\u4f1a\u8bdd CoreInfo \u65b9\u6cd5"

    .line 128
    .line 129
    new-instance v3, Lk41;

    .line 130
    .line 131
    invoke-direct {v3, p1, v2}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 132
    .line 133
    .line 134
    invoke-direct {p0, v0, v1, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 135
    .line 136
    .line 137
    new-instance v0, Lqx;

    .line 138
    .line 139
    sget-object v1, Lkx;->ｇ:Lkx;

    .line 140
    .line 141
    invoke-static {v1, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "\u5b9a\u4f4d\u706b\u82b1\u5b98\u65b9\u53d1\u9001\u56de\u8c03\u63a5\u53e3"

    .line 146
    .line 147
    new-instance v3, Lk41;

    .line 148
    .line 149
    const/16 v4, 0x15

    .line 150
    .line 151
    invoke-direct {v3, p1, v4}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v1, v2, v3}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 155
    .line 156
    .line 157
    new-instance v1, Lqx;

    .line 158
    .line 159
    sget-object v2, Lkx;->ｆ:Lkx;

    .line 160
    .line 161
    invoke-static {v2, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-string v3, "\u5b9a\u4f4d\u706b\u82b1\u5b98\u65b9\u53d1\u9001\u5de5\u5382\u7c7b"

    .line 166
    .line 167
    new-instance v4, Lk41;

    .line 168
    .line 169
    const/16 v5, 0x16

    .line 170
    .line 171
    invoke-direct {v4, p1, v5}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 172
    .line 173
    .line 174
    invoke-direct {v1, v2, v3, v4}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 175
    .line 176
    .line 177
    new-instance v2, Lqx;

    .line 178
    .line 179
    sget-object v3, Lkx;->ｈ:Lkx;

    .line 180
    .line 181
    invoke-static {v3, p1}, Lox;->α(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    const-string v4, "\u5b9a\u4f4d\u706b\u82b1\u5b98\u65b9\u6d88\u606f\u53d1\u9001\u5668"

    .line 186
    .line 187
    new-instance v5, Lk41;

    .line 188
    .line 189
    const/16 v6, 0x17

    .line 190
    .line 191
    invoke-direct {v5, p1, v6}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v2, v3, v4, v5}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 195
    .line 196
    .line 197
    filled-new-array {p0, v0, v1, v2}, [Lqx;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    sget-object p0, Lbd1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 212
    .line 213
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 214
    .line 215
    .line 216
    sget-object p0, Lbd1;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 219
    .line 220
    .line 221
    sget-object p0, Lbd1;->ε:Ljava/util/concurrent/ConcurrentHashMap;

    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 224
    .line 225
    .line 226
    sget-object p0, Lbd1;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 227
    .line 228
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    sget-object p0, Lbd1;->η:Ljava/util/concurrent/atomic/AtomicReference;

    .line 232
    .line 233
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object p0, Lbd1;->θ:Ljava/util/Map;

    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    monitor-enter p0

    .line 242
    :try_start_1
    invoke-interface {p0}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 243
    .line 244
    .line 245
    monitor-exit p0

    .line 246
    sget-object p0, Ldd1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 247
    .line 248
    invoke-virtual {p0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 249
    .line 250
    .line 251
    sget-object p0, Ldd1;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 252
    .line 253
    invoke-virtual {p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 254
    .line 255
    .line 256
    invoke-static {}, Ldd1;->α()V

    .line 257
    .line 258
    .line 259
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-static {p0}, Lx02;->Σ(Ljava/lang/String;)Ljava/lang/Long;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    if-eqz p0, :cond_4

    .line 272
    .line 273
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 274
    .line 275
    .line 276
    move-result-wide v5

    .line 277
    cmp-long p1, v5, v3

    .line 278
    .line 279
    if-lez p1, :cond_3

    .line 280
    .line 281
    move-object v1, p0

    .line 282
    :cond_3
    if-eqz v1, :cond_4

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 285
    .line 286
    .line 287
    move-result-wide p0

    .line 288
    sget-object v0, Lry1;->α:Lry1;

    .line 289
    .line 290
    const-string v0, "PrefsManager.profileChanged"

    .line 291
    .line 292
    invoke-static {p0, p1, v0}, Lry1;->ｍ(JLjava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :cond_4
    sget-object p0, Ls62;->α:Ls62;

    .line 296
    .line 297
    return-object p0

    .line 298
    :catchall_1
    move-exception p1

    .line 299
    monitor-exit p0

    .line 300
    throw p1

    .line 301
    :pswitch_4
    check-cast p1, Lyw1;

    .line 302
    .line 303
    sget-object p0, Lax1;->α:Leu1;

    .line 304
    .line 305
    sget-object p0, Ls62;->α:Ls62;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    sget-object p0, Ls62;->α:Ls62;

    .line 314
    .line 315
    return-object p0

    .line 316
    :pswitch_6
    check-cast p1, Landroid/app/Activity;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    sget-object p0, Lbv1;->α:Lbv1;

    .line 322
    .line 323
    invoke-static {}, Lbv1;->Β()Z

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    if-nez p0, :cond_6

    .line 328
    .line 329
    const-string p0, "volume_key_enabled"

    .line 330
    .line 331
    invoke-static {p0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    if-nez p0, :cond_6

    .line 336
    .line 337
    const-string p0, "share_panel_enabled"

    .line 338
    .line 339
    invoke-static {p0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    if-eqz p0, :cond_5

    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_5
    move v5, v6

    .line 347
    :cond_6
    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    return-object p0

    .line 352
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 353
    .line 354
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    sget-object p1, Lbv1;->α:Lbv1;

    .line 359
    .line 360
    const-string p1, "auto_scroll_article_dwell_seconds"

    .line 361
    .line 362
    const/4 v0, 0x5

    .line 363
    const/16 v1, 0x78

    .line 364
    .line 365
    invoke-static {p0, v0, v1}, Lj81;->μ(III)I

    .line 366
    .line 367
    .line 368
    move-result p0

    .line 369
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 370
    .line 371
    .line 372
    sget-object p0, Ls62;->α:Ls62;

    .line 373
    .line 374
    return-object p0

    .line 375
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 378
    .line 379
    .line 380
    move-result p0

    .line 381
    sget-object p1, Lbv1;->α:Lbv1;

    .line 382
    .line 383
    const-string p1, "auto_scroll_image_dwell_seconds"

    .line 384
    .line 385
    const/4 v0, 0x3

    .line 386
    const/16 v1, 0x3c

    .line 387
    .line 388
    invoke-static {p0, v0, v1}, Lj81;->μ(III)I

    .line 389
    .line 390
    .line 391
    move-result p0

    .line 392
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 393
    .line 394
    .line 395
    sget-object p0, Ls62;->α:Ls62;

    .line 396
    .line 397
    return-object p0

    .line 398
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 401
    .line 402
    .line 403
    move-result p0

    .line 404
    sget-object p1, Lbv1;->α:Lbv1;

    .line 405
    .line 406
    const-string p1, "auto_scroll_delay_ms"

    .line 407
    .line 408
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 409
    .line 410
    .line 411
    sget-object p0, Ls62;->α:Ls62;

    .line 412
    .line 413
    return-object p0

    .line 414
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 415
    .line 416
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    sget-object p1, Lbv1;->α:Lbv1;

    .line 421
    .line 422
    const-string p1, "seekbar_time_alpha"

    .line 423
    .line 424
    const/16 v0, 0x64

    .line 425
    .line 426
    invoke-static {p0, v6, v0}, Lj81;->μ(III)I

    .line 427
    .line 428
    .line 429
    move-result p0

    .line 430
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 431
    .line 432
    .line 433
    sget-object p0, Ls62;->α:Ls62;

    .line 434
    .line 435
    return-object p0

    .line 436
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 439
    .line 440
    .line 441
    move-result p0

    .line 442
    sget-object p1, Lbv1;->α:Lbv1;

    .line 443
    .line 444
    const-string p1, "seekbar_time_text_size"

    .line 445
    .line 446
    invoke-static {p0, v0, v2}, Lj81;->μ(III)I

    .line 447
    .line 448
    .line 449
    move-result p0

    .line 450
    invoke-static {p1, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 451
    .line 452
    .line 453
    sget-object p0, Ls62;->α:Ls62;

    .line 454
    .line 455
    return-object p0

    .line 456
    :pswitch_c
    check-cast p1, Lfo1;

    .line 457
    .line 458
    iget-object p0, p1, Lfo1;->ε:Ljava/lang/Object;

    .line 459
    .line 460
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    if-eqz p0, :cond_8

    .line 465
    .line 466
    const-string p1, "DYHelper"

    .line 467
    .line 468
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    if-nez p0, :cond_7

    .line 473
    .line 474
    const-string p0, ""

    .line 475
    .line 476
    :cond_7
    const-string v2, "\u9996\u6b21\u6253\u5f00\u8bbe\u7f6e\u83b7\u53d6\u98df\u7269\u76ee\u5f55\u5931\u8d25: "

    .line 477
    .line 478
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    invoke-static {p1, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    :cond_8
    sget-object p0, Ls62;->α:Ls62;

    .line 486
    .line 487
    return-object p0

    .line 488
    :pswitch_d
    check-cast p1, Landroid/app/Activity;

    .line 489
    .line 490
    const-string p0, "seekbar_time_enabled"

    .line 491
    .line 492
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    return-object p0

    .line 497
    :pswitch_e
    check-cast p1, Landroid/app/Activity;

    .line 498
    .line 499
    const-string p0, "auto_pause_on_complete_enabled"

    .line 500
    .line 501
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    return-object p0

    .line 506
    :pswitch_f
    check-cast p1, Landroid/app/Activity;

    .line 507
    .line 508
    const-string p0, "auto_scroll_next_enabled"

    .line 509
    .line 510
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    return-object p0

    .line 515
    :pswitch_10
    check-cast p1, Landroid/app/Activity;

    .line 516
    .line 517
    const-string p0, "video_length_alert_enabled"

    .line 518
    .line 519
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    return-object p0

    .line 524
    :pswitch_11
    check-cast p1, Landroid/app/Activity;

    .line 525
    .line 526
    const-string p0, "block_douyin_duration_reminder_enabled"

    .line 527
    .line 528
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 529
    .line 530
    .line 531
    move-result-object p0

    .line 532
    return-object p0

    .line 533
    :pswitch_12
    check-cast p1, Landroid/app/Activity;

    .line 534
    .line 535
    const-string p0, "duration_alert_enabled"

    .line 536
    .line 537
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    return-object p0

    .line 542
    :pswitch_13
    check-cast p1, Landroid/app/Activity;

    .line 543
    .line 544
    const-string p0, "im_auto_read_enabled"

    .line 545
    .line 546
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    return-object p0

    .line 551
    :pswitch_14
    check-cast p1, Landroid/app/Activity;

    .line 552
    .line 553
    const-string p0, "im_disable_read_receipt_report"

    .line 554
    .line 555
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    return-object p0

    .line 560
    :pswitch_15
    check-cast p1, Landroid/app/Activity;

    .line 561
    .line 562
    const-string p0, "im_time_label_enabled"

    .line 563
    .line 564
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    return-object p0

    .line 569
    :pswitch_16
    check-cast p1, Landroid/app/Activity;

    .line 570
    .line 571
    const-string p0, "im_anti_recall_enabled"

    .line 572
    .line 573
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    return-object p0

    .line 578
    :pswitch_17
    check-cast p1, Landroid/app/Activity;

    .line 579
    .line 580
    const-string p0, "filter_enabled"

    .line 581
    .line 582
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    return-object p0

    .line 587
    :pswitch_18
    check-cast p1, Landroid/app/Activity;

    .line 588
    .line 589
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 593
    .line 594
    return-object p0

    .line 595
    :pswitch_19
    check-cast p1, Landroid/app/Activity;

    .line 596
    .line 597
    const-string p0, "version_update_check_enabled"

    .line 598
    .line 599
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    return-object p0

    .line 604
    :pswitch_1a
    check-cast p1, Landroid/app/Activity;

    .line 605
    .line 606
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 610
    .line 611
    return-object p0

    .line 612
    :pswitch_1b
    check-cast p1, Landroid/app/Activity;

    .line 613
    .line 614
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    const-string p0, "download_show_top_notification"

    .line 618
    .line 619
    invoke-static {p0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 620
    .line 621
    .line 622
    move-result p0

    .line 623
    if-nez p0, :cond_a

    .line 624
    .line 625
    const-string p0, "spark_show_top_notification"

    .line 626
    .line 627
    invoke-static {p0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 628
    .line 629
    .line 630
    move-result p0

    .line 631
    if-nez p0, :cond_a

    .line 632
    .line 633
    const-string p0, "pet_elf_camp_show_top_notification"

    .line 634
    .line 635
    invoke-static {p0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 636
    .line 637
    .line 638
    move-result p0

    .line 639
    if-eqz p0, :cond_9

    .line 640
    .line 641
    goto :goto_3

    .line 642
    :cond_9
    move v5, v6

    .line 643
    :cond_a
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 644
    .line 645
    .line 646
    move-result-object p0

    .line 647
    return-object p0

    .line 648
    :pswitch_1c
    check-cast p1, Landroid/app/Activity;

    .line 649
    .line 650
    const-string p0, "info_bar_enabled"

    .line 651
    .line 652
    invoke-static {p1, p0, v6}, Lnx;->γ(Landroid/app/Activity;Ljava/lang/String;Z)Ljava/lang/Boolean;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    return-object p0

    .line 657
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
