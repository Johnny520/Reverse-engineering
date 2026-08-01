.class public final synthetic Lo7;
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
    iput p1, p0, Lo7;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lo7;->ε:I

    .line 2
    .line 3
    const-string v0, "auto_scroll_touch_restart_enabled"

    .line 4
    .line 5
    const-string v1, "chapter_ad_skip_enabled"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object p0, Lpm0;->α:Lm02;

    .line 14
    .line 15
    return-object v4

    .line 16
    :pswitch_0
    new-instance p0, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    new-instance p0, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v0, "CompositionLocal LocalHostDefaultProvider not present"

    .line 39
    .line 40
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :pswitch_3
    sget-object p0, Lqd0;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/ClassLoader;

    .line 51
    .line 52
    if-nez p0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object v0, Lbe0;->α:Lbe0;

    .line 56
    .line 57
    invoke-virtual {v0}, Lbe0;->γ()Lzd0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-boolean v0, v0, Lzd0;->β:Z

    .line 64
    .line 65
    if-ne v0, v2, :cond_1

    .line 66
    .line 67
    invoke-static {p0}, Lqd0;->α(Ljava/lang/ClassLoader;)Z

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_4
    const-string p0, "feed_right_auto_scroll_button_enabled"

    .line 74
    .line 75
    invoke-static {p0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :pswitch_5
    const-string p0, "feed_right_dislike_button_enabled"

    .line 85
    .line 86
    invoke-static {p0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_6
    sput-object v4, Lcom/example/dyhelper/hook/γ;->Ι:Li20;

    .line 96
    .line 97
    const-wide/16 v0, 0x0

    .line 98
    .line 99
    sput-wide v0, Lcom/example/dyhelper/hook/γ;->Κ:J

    .line 100
    .line 101
    sput-object v4, Lcom/example/dyhelper/hook/γ;->Λ:Ld20;

    .line 102
    .line 103
    sget-object p0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 104
    .line 105
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Κ()Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-nez p0, :cond_2

    .line 110
    .line 111
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->Υ()V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    sget-object p0, Lpq;->α:Lpq;

    .line 116
    .line 117
    invoke-static {}, Lpq;->α()Lmq;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz p0, :cond_3

    .line 122
    .line 123
    iget-wide v0, p0, Lmq;->δ:J

    .line 124
    .line 125
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, Lcom/example/dyhelper/hook/γ;->Δ(Ljava/lang/Long;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_7
    sget-object p0, Lcom/example/dyhelper/hook/γ;->ζ:Landroid/os/Handler;

    .line 136
    .line 137
    new-instance v0, Ls0;

    .line 138
    .line 139
    const/16 v1, 0x1a

    .line 140
    .line 141
    invoke-direct {v0, v1}, Ls0;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 145
    .line 146
    .line 147
    sget-object p0, Ls62;->α:Ls62;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_8
    const-string p0, "Unexpected call to default provider"

    .line 151
    .line 152
    invoke-static {p0}, Lsn;->β(Ljava/lang/String;)Ljava/lang/Void;

    .line 153
    .line 154
    .line 155
    new-instance p0, Lpm;

    .line 156
    .line 157
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 158
    .line 159
    .line 160
    throw p0

    .line 161
    :pswitch_9
    sget-object p0, Lyn;->α:Lm02;

    .line 162
    .line 163
    return-object v4

    .line 164
    :pswitch_a
    new-instance p0, Landroid/os/Handler;

    .line 165
    .line 166
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 171
    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_b
    invoke-static {}, Lx9;->α()Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-eqz p0, :cond_4

    .line 179
    .line 180
    invoke-static {v1, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-eqz p0, :cond_4

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_4
    move v2, v3

    .line 188
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_c
    invoke-static {}, Lx9;->α()Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_5

    .line 198
    .line 199
    invoke-static {v1, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    if-eqz p0, :cond_5

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_5
    move v2, v3

    .line 207
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :pswitch_d
    sget-object p0, Lsb;->ω:Ljava/util/concurrent/ConcurrentHashMap;

    .line 213
    .line 214
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_9

    .line 227
    .line 228
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Ljava/util/Map$Entry;

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Ljava/util/Set;

    .line 239
    .line 240
    check-cast v0, Ljava/lang/Iterable;

    .line 241
    .line 242
    new-instance v1, Ln7;

    .line 243
    .line 244
    const/16 v2, 0xe

    .line 245
    .line 246
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v1}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_6

    .line 261
    .line 262
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    check-cast v1, Landroid/view/View;

    .line 273
    .line 274
    if-nez v1, :cond_8

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-eqz v2, :cond_7

    .line 282
    .line 283
    sget-object v2, Lsb;->α:Lsb;

    .line 284
    .line 285
    invoke-static {v1}, Lsb;->Χ(Landroid/view/View;)V

    .line 286
    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_9
    sget-object p0, Ls62;->α:Ls62;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_e
    sget-object p0, Lsb;->α:Lsb;

    .line 293
    .line 294
    sget-object p0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 295
    .line 296
    if-eqz p0, :cond_a

    .line 297
    .line 298
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    check-cast p0, Landroid/app/Activity;

    .line 303
    .line 304
    if-eqz p0, :cond_a

    .line 305
    .line 306
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    if-eqz p0, :cond_a

    .line 311
    .line 312
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    :cond_a
    if-eqz v4, :cond_b

    .line 317
    .line 318
    invoke-static {v4}, Lsb;->а(Landroid/view/View;)V

    .line 319
    .line 320
    .line 321
    :cond_b
    invoke-static {}, Lsb;->β()V

    .line 322
    .line 323
    .line 324
    sget-object p0, Ls62;->α:Ls62;

    .line 325
    .line 326
    return-object p0

    .line 327
    :pswitch_f
    sget-object p0, Lsb;->ω:Ljava/util/concurrent/ConcurrentHashMap;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_f

    .line 342
    .line 343
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Ljava/util/Map$Entry;

    .line 348
    .line 349
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    check-cast v0, Ljava/util/Set;

    .line 354
    .line 355
    check-cast v0, Ljava/lang/Iterable;

    .line 356
    .line 357
    new-instance v1, Ln7;

    .line 358
    .line 359
    const/16 v2, 0xf

    .line 360
    .line 361
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 362
    .line 363
    .line 364
    invoke-static {v0, v1}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    :cond_d
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-eqz v1, :cond_c

    .line 376
    .line 377
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, Landroid/view/View;

    .line 388
    .line 389
    if-nez v1, :cond_e

    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-eqz v2, :cond_d

    .line 397
    .line 398
    sget-object v2, Lsb;->α:Lsb;

    .line 399
    .line 400
    invoke-static {v1}, Lsb;->Σ(Landroid/view/View;)V

    .line 401
    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_f
    sget-object p0, Ls62;->α:Ls62;

    .line 405
    .line 406
    return-object p0

    .line 407
    :pswitch_10
    sget-object p0, Lsb;->α:Lsb;

    .line 408
    .line 409
    sget-object p0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 410
    .line 411
    if-eqz p0, :cond_10

    .line 412
    .line 413
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    check-cast p0, Landroid/app/Activity;

    .line 418
    .line 419
    if-eqz p0, :cond_10

    .line 420
    .line 421
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    if-eqz p0, :cond_10

    .line 426
    .line 427
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    :cond_10
    if-eqz v4, :cond_11

    .line 432
    .line 433
    invoke-static {v4}, Lsb;->а(Landroid/view/View;)V

    .line 434
    .line 435
    .line 436
    :cond_11
    invoke-static {}, Lsb;->β()V

    .line 437
    .line 438
    .line 439
    sget-object p0, Ls62;->α:Ls62;

    .line 440
    .line 441
    return-object p0

    .line 442
    :pswitch_11
    sget-object p0, Lsb;->ω:Ljava/util/concurrent/ConcurrentHashMap;

    .line 443
    .line 444
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    :cond_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-eqz v0, :cond_15

    .line 457
    .line 458
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, Ljava/util/Map$Entry;

    .line 463
    .line 464
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    check-cast v1, Ljava/lang/Number;

    .line 469
    .line 470
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    check-cast v0, Ljava/util/Set;

    .line 479
    .line 480
    check-cast v0, Ljava/lang/Iterable;

    .line 481
    .line 482
    new-instance v2, Ln7;

    .line 483
    .line 484
    const/16 v3, 0xd

    .line 485
    .line 486
    invoke-direct {v2, v3}, Ln7;-><init>(I)V

    .line 487
    .line 488
    .line 489
    invoke-static {v0, v2}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 490
    .line 491
    .line 492
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    :cond_13
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    if-eqz v2, :cond_12

    .line 501
    .line 502
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 507
    .line 508
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    check-cast v2, Landroid/view/View;

    .line 513
    .line 514
    if-nez v2, :cond_14

    .line 515
    .line 516
    goto :goto_6

    .line 517
    :cond_14
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    if-eqz v3, :cond_13

    .line 522
    .line 523
    sget-object v3, Lsb;->α:Lsb;

    .line 524
    .line 525
    invoke-static {v2, v1}, Lsb;->ε(Landroid/view/View;I)V

    .line 526
    .line 527
    .line 528
    goto :goto_6

    .line 529
    :cond_15
    sget-object p0, Ls62;->α:Ls62;

    .line 530
    .line 531
    return-object p0

    .line 532
    :pswitch_12
    sget-object p0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 533
    .line 534
    if-eqz p0, :cond_16

    .line 535
    .line 536
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    check-cast p0, Landroid/app/Activity;

    .line 541
    .line 542
    goto :goto_7

    .line 543
    :cond_16
    move-object p0, v4

    .line 544
    :goto_7
    sget-object v0, Lsb;->α:Lsb;

    .line 545
    .line 546
    invoke-virtual {v0, p0}, Lsb;->Π(Landroid/app/Activity;)V

    .line 547
    .line 548
    .line 549
    sget-boolean v1, Lsb;->ν:Z

    .line 550
    .line 551
    if-nez v1, :cond_17

    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_17
    invoke-virtual {v0}, Lsb;->θ()V

    .line 555
    .line 556
    .line 557
    if-eqz p0, :cond_18

    .line 558
    .line 559
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    if-eqz p0, :cond_18

    .line 564
    .line 565
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    :cond_18
    if-eqz v4, :cond_19

    .line 570
    .line 571
    invoke-static {v4}, Lsb;->а(Landroid/view/View;)V

    .line 572
    .line 573
    .line 574
    :cond_19
    invoke-static {}, Lsb;->β()V

    .line 575
    .line 576
    .line 577
    :goto_8
    sget-object p0, Ls62;->α:Ls62;

    .line 578
    .line 579
    return-object p0

    .line 580
    :pswitch_13
    sget-object p0, Lsb;->ψ:Ljava/lang/ref/WeakReference;

    .line 581
    .line 582
    if-eqz p0, :cond_1a

    .line 583
    .line 584
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p0

    .line 588
    check-cast p0, Landroid/app/Activity;

    .line 589
    .line 590
    goto :goto_9

    .line 591
    :cond_1a
    move-object p0, v4

    .line 592
    :goto_9
    sget-object v0, Lsb;->α:Lsb;

    .line 593
    .line 594
    invoke-virtual {v0, p0}, Lsb;->Π(Landroid/app/Activity;)V

    .line 595
    .line 596
    .line 597
    sget-boolean v1, Lsb;->ν:Z

    .line 598
    .line 599
    if-nez v1, :cond_1b

    .line 600
    .line 601
    goto :goto_a

    .line 602
    :cond_1b
    invoke-virtual {v0}, Lsb;->θ()V

    .line 603
    .line 604
    .line 605
    if-eqz p0, :cond_1c

    .line 606
    .line 607
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 608
    .line 609
    .line 610
    move-result-object p0

    .line 611
    if-eqz p0, :cond_1c

    .line 612
    .line 613
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    :cond_1c
    if-eqz v4, :cond_1d

    .line 618
    .line 619
    invoke-static {v4}, Lsb;->а(Landroid/view/View;)V

    .line 620
    .line 621
    .line 622
    :cond_1d
    invoke-static {}, Lsb;->β()V

    .line 623
    .line 624
    .line 625
    :goto_a
    sget-object p0, Ls62;->α:Ls62;

    .line 626
    .line 627
    return-object p0

    .line 628
    :pswitch_14
    sget-object p0, Lr9;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 629
    .line 630
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 631
    .line 632
    .line 633
    sget-object p0, Ls62;->α:Ls62;

    .line 634
    .line 635
    return-object p0

    .line 636
    :pswitch_15
    sget-object p0, Lcom/example/dyhelper/beta/BetaNativeBridge;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 637
    .line 638
    :try_start_0
    const-string p0, "dy_protect"

    .line 639
    .line 640
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 641
    .line 642
    .line 643
    goto :goto_b

    .line 644
    :catchall_0
    move-exception p0

    .line 645
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object p0

    .line 649
    const-string v0, "dy_protect load failed: "

    .line 650
    .line 651
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    const/4 v0, 0x4

    .line 656
    const-string v1, "r2c07920444d2b8e4"

    .line 657
    .line 658
    invoke-static {v1, p0, v4, v0, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    move v2, v3

    .line 662
    :goto_b
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 663
    .line 664
    .line 665
    move-result-object p0

    .line 666
    return-object p0

    .line 667
    :pswitch_16
    sget-object p0, Lw8;->α:Lm02;

    .line 668
    .line 669
    return-object v4

    .line 670
    :pswitch_17
    sget-object p0, Lt7;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 671
    .line 672
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 673
    .line 674
    .line 675
    move-result p0

    .line 676
    if-nez p0, :cond_1e

    .line 677
    .line 678
    goto :goto_c

    .line 679
    :cond_1e
    sput-boolean v2, Lt7;->η:Z

    .line 680
    .line 681
    sget-object p0, Lt7;->ε:Lp7;

    .line 682
    .line 683
    if-eqz p0, :cond_1f

    .line 684
    .line 685
    iget-boolean v0, p0, Lp7;->θ:Z

    .line 686
    .line 687
    if-nez v0, :cond_1f

    .line 688
    .line 689
    iput-boolean v2, p0, Lp7;->η:Z

    .line 690
    .line 691
    invoke-static {p0}, Lt7;->α(Lp7;)V

    .line 692
    .line 693
    .line 694
    :cond_1f
    :goto_c
    sget-object p0, Ls62;->α:Ls62;

    .line 695
    .line 696
    return-object p0

    .line 697
    :pswitch_18
    sget-boolean p0, Lt7;->η:Z

    .line 698
    .line 699
    sput-boolean v3, Lt7;->η:Z

    .line 700
    .line 701
    if-nez p0, :cond_20

    .line 702
    .line 703
    goto :goto_d

    .line 704
    :cond_20
    sget-object p0, Lt7;->ε:Lp7;

    .line 705
    .line 706
    if-nez p0, :cond_21

    .line 707
    .line 708
    goto :goto_d

    .line 709
    :cond_21
    iget-boolean v1, p0, Lp7;->θ:Z

    .line 710
    .line 711
    if-eqz v1, :cond_22

    .line 712
    .line 713
    goto :goto_d

    .line 714
    :cond_22
    iget-boolean v1, p0, Lp7;->η:Z

    .line 715
    .line 716
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-eqz v1, :cond_23

    .line 721
    .line 722
    if-eqz v0, :cond_25

    .line 723
    .line 724
    :cond_23
    iget-boolean v0, p0, Lp7;->η:Z

    .line 725
    .line 726
    if-eqz v0, :cond_24

    .line 727
    .line 728
    iput-boolean v3, p0, Lp7;->η:Z

    .line 729
    .line 730
    :cond_24
    invoke-static {p0}, Lt7;->ε(Lp7;)V

    .line 731
    .line 732
    .line 733
    :cond_25
    :goto_d
    sget-object p0, Ls62;->α:Ls62;

    .line 734
    .line 735
    return-object p0

    .line 736
    :pswitch_19
    sput-boolean v3, Lt7;->ζ:Z

    .line 737
    .line 738
    sget-object p0, Lt7;->ε:Lp7;

    .line 739
    .line 740
    invoke-static {p0}, Lt7;->α(Lp7;)V

    .line 741
    .line 742
    .line 743
    sget-object p0, Ls62;->α:Ls62;

    .line 744
    .line 745
    return-object p0

    .line 746
    :pswitch_1a
    sget-object p0, Lt7;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 747
    .line 748
    invoke-static {}, Lpq;->α()Lmq;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    invoke-static {p0}, Lt7;->β(Lmq;)V

    .line 753
    .line 754
    .line 755
    sget-object p0, Ls62;->α:Ls62;

    .line 756
    .line 757
    return-object p0

    .line 758
    :pswitch_1b
    sget-object p0, Lt7;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 759
    .line 760
    invoke-static {}, Lpq;->α()Lmq;

    .line 761
    .line 762
    .line 763
    move-result-object p0

    .line 764
    invoke-static {p0}, Lt7;->β(Lmq;)V

    .line 765
    .line 766
    .line 767
    sget-object p0, Ls62;->α:Ls62;

    .line 768
    .line 769
    return-object p0

    .line 770
    :pswitch_1c
    sput-boolean v2, Lt7;->ζ:Z

    .line 771
    .line 772
    sget-object p0, Lt7;->ε:Lp7;

    .line 773
    .line 774
    if-eqz p0, :cond_26

    .line 775
    .line 776
    iget-object v4, p0, Lp7;->δ:Lm7;

    .line 777
    .line 778
    :cond_26
    if-eqz v4, :cond_27

    .line 779
    .line 780
    invoke-static {p0}, Lt7;->ε(Lp7;)V

    .line 781
    .line 782
    .line 783
    goto :goto_e

    .line 784
    :cond_27
    invoke-static {}, Lpq;->α()Lmq;

    .line 785
    .line 786
    .line 787
    move-result-object p0

    .line 788
    invoke-static {p0}, Lt7;->β(Lmq;)V

    .line 789
    .line 790
    .line 791
    :goto_e
    sget-object p0, Ls62;->α:Ls62;

    .line 792
    .line 793
    return-object p0

    .line 794
    nop

    .line 795
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
