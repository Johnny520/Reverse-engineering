.class public final synthetic Lkt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lkt0;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lz81;I)V
    .locals 0

    .line 7
    iput p2, p0, Lkt0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget p0, p0, Lkt0;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Ls62;->α:Ls62;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p0, Laj;

    .line 13
    .line 14
    const/16 v0, 0x12

    .line 15
    .line 16
    invoke-direct {p0, v0}, Laj;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    new-instance p0, Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    sget-object p0, Lbv1;->α:Lbv1;

    .line 35
    .line 36
    invoke-static {}, Lbv1;->ω()V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lbv1;->κ:Landroid/widget/ScrollView;

    .line 40
    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v3, v3}, Landroid/widget/ScrollView;->scrollTo(II)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-object v2

    .line 47
    :pswitch_2
    sget-object p0, Lvr1;->α:Lyx;

    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_3
    sget-object p0, Lyp1;->α:Lm02;

    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_4
    new-instance p0, Lkp1;

    .line 54
    .line 55
    invoke-direct {p0}, Lkp1;-><init>()V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_5
    sget-object p0, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->α:Ljava/lang/Object;

    .line 60
    .line 61
    :try_start_0
    const-string p0, "dy_protect"

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    new-instance v0, Leo1;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object p0, v0

    .line 76
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    const-string v1, "DYHelper-Native"

    .line 83
    .line 84
    const-string v2, "dy_protect load failed"

    .line 85
    .line 86
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 87
    .line 88
    .line 89
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    instance-of v1, p0, Leo1;

    .line 92
    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    move-object p0, v0

    .line 96
    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->η()Ls62;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_7
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->ε()Ls62;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_8
    sget-object p0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    xor-int/2addr p0, v4

    .line 116
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_9
    sget-object p0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 122
    .line 123
    invoke-static {p0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    xor-int/2addr p0, v4

    .line 132
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    return-object p0

    .line 137
    :pswitch_a
    sget-object p0, Lpg1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-nez p0, :cond_3

    .line 144
    .line 145
    sget-object p0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_3

    .line 152
    .line 153
    move v3, v4

    .line 154
    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_b
    sget-object p0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 160
    .line 161
    invoke-static {p0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    xor-int/2addr p0, v4

    .line 170
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_c
    sget-object p0, Lpg1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_4

    .line 182
    .line 183
    sget-object p0, Lpg1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    if-nez p0, :cond_4

    .line 190
    .line 191
    move v3, v4

    .line 192
    :cond_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_d
    sget-object p0, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 198
    .line 199
    invoke-static {p0}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    xor-int/2addr p0, v4

    .line 208
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :pswitch_e
    sget-object p0, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 214
    .line 215
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    xor-int/2addr p0, v4

    .line 220
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_f
    sget-object p0, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 226
    .line 227
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    xor-int/2addr p0, v4

    .line 232
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :pswitch_10
    sget-object p0, Lse1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 238
    .line 239
    invoke-static {}, Lse1;->ζ()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    xor-int/2addr p0, v4

    .line 248
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :pswitch_11
    sget-object p0, Ljf1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    xor-int/2addr p0, v4

    .line 260
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :pswitch_12
    invoke-static {}, Lxa1;->κ()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    xor-int/2addr p0, v4

    .line 274
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    return-object p0

    .line 279
    :pswitch_13
    sget-object p0, Lq71;->α:Lq71;

    .line 280
    .line 281
    return-object v2

    .line 282
    :pswitch_14
    sget-object p0, La01;->β:Landroid/os/Handler;

    .line 283
    .line 284
    new-instance v0, Lfb0;

    .line 285
    .line 286
    const/16 v1, 0xa

    .line 287
    .line 288
    invoke-direct {v0, v1}, Lfb0;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 292
    .line 293
    .line 294
    return-object v2

    .line 295
    :pswitch_15
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 296
    .line 297
    const-string v0, "CompositionLocal LocalSavedStateRegistryOwner not present"

    .line 298
    .line 299
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw p0

    .line 303
    :pswitch_16
    sget-object p0, Lxu0;->α:Lm02;

    .line 304
    .line 305
    sget-object p0, Lx;->Τ:Lx;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_17
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    const-string v0, "CompositionLocal LocalLifecycleOwner not present"

    .line 311
    .line 312
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw p0

    .line 316
    :pswitch_18
    sget-object p0, Lil0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 317
    .line 318
    invoke-virtual {p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    if-nez p0, :cond_5

    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_5
    :try_start_1
    invoke-static {}, Lil0;->γ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 326
    .line 327
    .line 328
    :try_start_2
    invoke-static {}, Lui1;->Α()Z

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    if-nez p0, :cond_6

    .line 333
    .line 334
    goto :goto_1

    .line 335
    :cond_6
    new-instance p0, Lwj0;

    .line 336
    .line 337
    const/16 v0, 0x17

    .line 338
    .line 339
    invoke-direct {p0, v0}, Lwj0;-><init>(I)V

    .line 340
    .line 341
    .line 342
    sget-object v0, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 343
    .line 344
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 345
    .line 346
    .line 347
    goto :goto_1

    .line 348
    :catchall_1
    move-exception p0

    .line 349
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    new-instance v0, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v1, "ra271a8f65257ac83"

    .line 356
    .line 357
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    :goto_1
    const-string p0, "ra6f6ddad27a7dd1a"

    .line 371
    .line 372
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 373
    .line 374
    .line 375
    goto :goto_2

    .line 376
    :catchall_2
    move-exception p0

    .line 377
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    const-string v1, "\u521d\u59cb\u5316\u5931\u8d25: "

    .line 382
    .line 383
    const-string v3, "racd07984e4339f30"

    .line 384
    .line 385
    invoke-static {v1, v0, v3, p0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 386
    .line 387
    .line 388
    :goto_2
    return-object v2

    .line 389
    :pswitch_19
    sget-object p0, Ltg0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 390
    .line 391
    invoke-virtual {p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 392
    .line 393
    .line 394
    move-result p0

    .line 395
    if-nez p0, :cond_7

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_7
    sget-object p0, Ltg0;->β:Landroid/os/Handler;

    .line 399
    .line 400
    sget-object v3, Ltg0;->γ:Lfb0;

    .line 401
    .line 402
    const-wide/16 v4, 0x7530

    .line 403
    .line 404
    invoke-virtual {p0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 405
    .line 406
    .line 407
    const-string p0, "DYHelper"

    .line 408
    .line 409
    const-string v3, "IMAutoReadScheduler \u521d\u59cb\u5316\u5b8c\u6210"

    .line 410
    .line 411
    invoke-static {p0, v3, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    :goto_3
    return-object v2

    .line 415
    :pswitch_1a
    sget-object p0, Lyw;->α:Landroid/os/Handler;

    .line 416
    .line 417
    new-instance p0, Lxl;

    .line 418
    .line 419
    const/16 v4, 0xb

    .line 420
    .line 421
    invoke-direct {p0, v4, v3}, Lxl;-><init>(IB)V

    .line 422
    .line 423
    .line 424
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    const-class v4, Landroid/app/Activity;

    .line 429
    .line 430
    const-string v5, "onResume"

    .line 431
    .line 432
    invoke-static {v4, v5, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 433
    .line 434
    .line 435
    new-instance p0, Lxl;

    .line 436
    .line 437
    const/16 v5, 0xc

    .line 438
    .line 439
    invoke-direct {p0, v5, v3}, Lxl;-><init>(IB)V

    .line 440
    .line 441
    .line 442
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    const-string v5, "onPause"

    .line 447
    .line 448
    invoke-static {v4, v5, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 449
    .line 450
    .line 451
    new-instance p0, Lxl;

    .line 452
    .line 453
    const/16 v5, 0xd

    .line 454
    .line 455
    invoke-direct {p0, v5, v3}, Lxl;-><init>(IB)V

    .line 456
    .line 457
    .line 458
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    const-string v5, "onDestroy"

    .line 463
    .line 464
    invoke-static {v4, v5, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 465
    .line 466
    .line 467
    new-instance p0, Lxl;

    .line 468
    .line 469
    const/16 v5, 0xe

    .line 470
    .line 471
    invoke-direct {p0, v5, v3}, Lxl;-><init>(IB)V

    .line 472
    .line 473
    .line 474
    const-class v3, Landroid/view/MotionEvent;

    .line 475
    .line 476
    filled-new-array {v3, p0}, [Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    const-string v3, "dispatchTouchEvent"

    .line 481
    .line 482
    invoke-static {v4, v3, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 483
    .line 484
    .line 485
    const-string p0, "DYHelper:DurationAlert"

    .line 486
    .line 487
    const-string v3, "\u89c6\u9891\u65f6\u957f\u63d0\u9192 & \u7a7a\u95f2\u9000\u51fa Hook \u521d\u59cb\u5316\u5b8c\u6210"

    .line 488
    .line 489
    invoke-static {p0, v3, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    return-object v2

    .line 493
    :pswitch_1b
    sget-object p0, Lyo1;->α:Lxo1;

    .line 494
    .line 495
    return-object p0

    .line 496
    :pswitch_1c
    sget-object p0, Lyo1;->α:Lxo1;

    .line 497
    .line 498
    return-object p0

    .line 499
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
