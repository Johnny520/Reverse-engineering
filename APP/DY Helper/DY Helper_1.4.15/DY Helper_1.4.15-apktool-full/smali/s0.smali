.class public final synthetic Ls0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls0;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget p0, p0, Ls0;->ε:I

    .line 2
    .line 3
    const-wide/16 v0, 0x8

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object p0, Ljb0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {p0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lhb0;->ε:Lhb0;

    .line 19
    .line 20
    invoke-static {p0}, Ljb0;->γ(Lhb0;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    sget-object v0, Ljb0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, Ljb0;->β()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const-wide/16 v7, 0x5

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    sget p0, Ljb0;->η:I

    .line 44
    .line 45
    add-int/2addr p0, v5

    .line 46
    sput p0, Ljb0;->η:I

    .line 47
    .line 48
    const/16 v1, 0x18

    .line 49
    .line 50
    if-ge p0, v1, :cond_1

    .line 51
    .line 52
    invoke-static {v7, v8}, Ljb0;->ζ(J)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 57
    .line 58
    .line 59
    const-string p0, "rb22c2f83ae9ef877"

    .line 60
    .line 61
    const-string v0, "\u51b7\u542f\u52a8\u81ea\u52a8\u5ba1\u6279\u7b49\u5f85\u5bbf\u4e3b IM \u5c31\u7eea\u8d85\u65f6\uff0c\u672c\u8fdb\u7a0b\u5df2\u964d\u7ea7\u8df3\u8fc7"

    .line 62
    .line 63
    invoke-static {p0, v0, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-static {p0}, Ljb0;->ε(Lhb0;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lhb0;->ζ:Lhb0;

    .line 77
    .line 78
    invoke-static {p0}, Ljb0;->γ(Lhb0;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_5

    .line 83
    .line 84
    sget-object p0, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 85
    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    invoke-interface {p0, v6}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    sput-object v4, Ljb0;->ι:Ljava/util/concurrent/ScheduledFuture;

    .line 92
    .line 93
    sput v6, Ljb0;->θ:I

    .line 94
    .line 95
    invoke-static {}, Ljb0;->η()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    invoke-static {v7, v8}, Ljb0;->ζ(J)V

    .line 100
    .line 101
    .line 102
    :cond_5
    :goto_0
    return-void

    .line 103
    :pswitch_0
    sget-object p0, Ljb0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    invoke-static {}, Lui1;->Α()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-nez p0, :cond_6

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    invoke-static {v0, v1}, Ljb0;->ζ(J)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Ljb0;->η()V

    .line 122
    .line 123
    .line 124
    :cond_7
    :goto_1
    return-void

    .line 125
    :pswitch_1
    sget-object p0, Ljb0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_9

    .line 132
    .line 133
    invoke-static {}, Lui1;->Α()Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-nez p0, :cond_8

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_8
    invoke-static {v0, v1}, Ljb0;->ζ(J)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Ljb0;->η()V

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_2
    return-void

    .line 147
    :pswitch_2
    sget-object p0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 148
    .line 149
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->ι()V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_3
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 154
    .line 155
    invoke-static {}, Los;->Ι()V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_4
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 160
    .line 161
    invoke-static {}, Los;->ξ()V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_5
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 166
    .line 167
    monitor-enter p0

    .line 168
    :try_start_0
    sput-object v4, Los;->Ρ:Ls0;

    .line 169
    .line 170
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    check-cast v0, Ljava/lang/Iterable;

    .line 180
    .line 181
    instance-of v1, v0, Ljava/util/Collection;

    .line 182
    .line 183
    if-eqz v1, :cond_a

    .line 184
    .line 185
    move-object v1, v0

    .line 186
    check-cast v1, Ljava/util/Collection;

    .line 187
    .line 188
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_a

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    goto :goto_6

    .line 197
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_c

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Lms;

    .line 212
    .line 213
    iget-object v1, v1, Lms;->γ:Lns;

    .line 214
    .line 215
    sget-object v2, Lns;->ζ:Lns;

    .line 216
    .line 217
    if-ne v1, v2, :cond_b

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_c
    :goto_3
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    check-cast v0, Ljava/lang/Iterable;

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    :cond_d
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_e

    .line 240
    .line 241
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    check-cast v1, Lms;

    .line 246
    .line 247
    iget-object v2, v1, Lms;->γ:Lns;

    .line 248
    .line 249
    sget-object v3, Lns;->ε:Lns;

    .line 250
    .line 251
    if-ne v2, v3, :cond_d

    .line 252
    .line 253
    sget-object v2, Lns;->η:Lns;

    .line 254
    .line 255
    iput-object v2, v1, Lms;->γ:Lns;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    .line 257
    move v6, v5

    .line 258
    goto :goto_4

    .line 259
    :cond_e
    :goto_5
    monitor-exit p0

    .line 260
    if-eqz v6, :cond_f

    .line 261
    .line 262
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 263
    .line 264
    const-string p0, "auto finish idle pending DexKit tasks"

    .line 265
    .line 266
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-static {}, Los;->ξ()V

    .line 270
    .line 271
    .line 272
    invoke-static {}, Los;->Ε()V

    .line 273
    .line 274
    .line 275
    invoke-static {}, Los;->Δ()V

    .line 276
    .line 277
    .line 278
    :cond_f
    return-void

    .line 279
    :goto_6
    monitor-exit p0

    .line 280
    throw v0

    .line 281
    :pswitch_6
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 282
    .line 283
    monitor-enter p0

    .line 284
    :try_start_1
    sput-object v4, Los;->Π:Ls0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 285
    .line 286
    monitor-exit p0

    .line 287
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 288
    .line 289
    invoke-static {}, Los;->β()Z

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    if-nez p0, :cond_10

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_10
    invoke-static {}, Los;->ξ()V

    .line 297
    .line 298
    .line 299
    invoke-static {}, Los;->Μ()V

    .line 300
    .line 301
    .line 302
    :goto_7
    return-void

    .line 303
    :catchall_1
    move-exception v0

    .line 304
    monitor-exit p0

    .line 305
    throw v0

    .line 306
    :pswitch_7
    sget-object p0, Los;->Λ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 307
    .line 308
    invoke-virtual {p0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 309
    .line 310
    .line 311
    sget-object p0, Los;->ρ:Landroid/widget/ScrollView;

    .line 312
    .line 313
    if-eqz p0, :cond_11

    .line 314
    .line 315
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 316
    .line 317
    invoke-static {}, Los;->Μ()V

    .line 318
    .line 319
    .line 320
    :cond_11
    return-void

    .line 321
    :pswitch_8
    invoke-static {v5}, Los;->κ(Z)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :pswitch_9
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 326
    .line 327
    monitor-enter p0

    .line 328
    :try_start_2
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 329
    .line 330
    invoke-static {}, Los;->γ()V

    .line 331
    .line 332
    .line 333
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    check-cast v0, Ljava/lang/Iterable;

    .line 343
    .line 344
    instance-of v1, v0, Ljava/util/Collection;

    .line 345
    .line 346
    if-eqz v1, :cond_13

    .line 347
    .line 348
    move-object v1, v0

    .line 349
    check-cast v1, Ljava/util/Collection;

    .line 350
    .line 351
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_13

    .line 356
    .line 357
    :cond_12
    move v0, v6

    .line 358
    goto :goto_8

    .line 359
    :catchall_2
    move-exception v0

    .line 360
    goto/16 :goto_b

    .line 361
    .line 362
    :cond_13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_12

    .line 371
    .line 372
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Lms;

    .line 377
    .line 378
    iget-object v1, v1, Lms;->γ:Lns;

    .line 379
    .line 380
    sget-object v2, Lns;->ε:Lns;

    .line 381
    .line 382
    if-ne v1, v2, :cond_14

    .line 383
    .line 384
    move v0, v5

    .line 385
    :goto_8
    sget-object v1, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    check-cast v1, Ljava/lang/Iterable;

    .line 395
    .line 396
    instance-of v2, v1, Ljava/util/Collection;

    .line 397
    .line 398
    if-eqz v2, :cond_16

    .line 399
    .line 400
    move-object v2, v1

    .line 401
    check-cast v2, Ljava/util/Collection;

    .line 402
    .line 403
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-eqz v2, :cond_16

    .line 408
    .line 409
    :cond_15
    move v1, v6

    .line 410
    goto :goto_9

    .line 411
    :cond_16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-eqz v2, :cond_15

    .line 420
    .line 421
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    check-cast v2, Lms;

    .line 426
    .line 427
    iget-object v2, v2, Lms;->γ:Lns;

    .line 428
    .line 429
    sget-object v3, Lns;->ζ:Lns;

    .line 430
    .line 431
    if-ne v2, v3, :cond_17

    .line 432
    .line 433
    move v1, v5

    .line 434
    :goto_9
    sget-object v2, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    check-cast v2, Ljava/lang/Iterable;

    .line 444
    .line 445
    instance-of v3, v2, Ljava/util/Collection;

    .line 446
    .line 447
    if-eqz v3, :cond_19

    .line 448
    .line 449
    move-object v3, v2

    .line 450
    check-cast v3, Ljava/util/Collection;

    .line 451
    .line 452
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-eqz v3, :cond_19

    .line 457
    .line 458
    :cond_18
    move v5, v6

    .line 459
    goto :goto_a

    .line 460
    :cond_19
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    :cond_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    if-eqz v3, :cond_18

    .line 469
    .line 470
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    check-cast v3, Lms;

    .line 475
    .line 476
    sget-object v7, Los;->α:Landroid/os/Handler;

    .line 477
    .line 478
    iget-object v3, v3, Lms;->γ:Lns;

    .line 479
    .line 480
    invoke-static {v3}, Los;->τ(Lns;)Z

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    if-eqz v3, :cond_1a

    .line 485
    .line 486
    :goto_a
    if-eqz v0, :cond_1b

    .line 487
    .line 488
    if-nez v1, :cond_1b

    .line 489
    .line 490
    if-eqz v5, :cond_1b

    .line 491
    .line 492
    new-instance v4, Ls0;

    .line 493
    .line 494
    const/16 v0, 0x17

    .line 495
    .line 496
    invoke-direct {v4, v0}, Ls0;-><init>(I)V

    .line 497
    .line 498
    .line 499
    sput-object v4, Los;->Ρ:Ls0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 500
    .line 501
    :cond_1b
    monitor-exit p0

    .line 502
    if-eqz v4, :cond_1c

    .line 503
    .line 504
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 505
    .line 506
    const-wide/16 v0, 0x12c

    .line 507
    .line 508
    invoke-virtual {p0, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 509
    .line 510
    .line 511
    :cond_1c
    return-void

    .line 512
    :goto_b
    monitor-exit p0

    .line 513
    throw v0

    .line 514
    :pswitch_a
    invoke-static {v5}, Los;->κ(Z)V

    .line 515
    .line 516
    .line 517
    return-void

    .line 518
    :pswitch_b
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 519
    .line 520
    invoke-static {}, Los;->ξ()V

    .line 521
    .line 522
    .line 523
    invoke-static {}, Los;->Μ()V

    .line 524
    .line 525
    .line 526
    return-void

    .line 527
    :pswitch_c
    sget-object p0, Los;->Μ:Landroid/widget/ScrollView;

    .line 528
    .line 529
    if-nez p0, :cond_1d

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :cond_1d
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    if-nez v0, :cond_1e

    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_1e
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    add-int/2addr v1, v0

    .line 548
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    sub-int/2addr v1, v0

    .line 553
    if-gez v1, :cond_1f

    .line 554
    .line 555
    move v1, v6

    .line 556
    :cond_1f
    invoke-virtual {p0, v6, v1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 557
    .line 558
    .line 559
    :goto_c
    return-void

    .line 560
    :pswitch_d
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 561
    .line 562
    .line 563
    move-result p0

    .line 564
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 565
    .line 566
    .line 567
    invoke-static {v6}, Ljava/lang/System;->exit(I)V

    .line 568
    .line 569
    .line 570
    new-instance p0, Ljava/lang/RuntimeException;

    .line 571
    .line 572
    const-string v0, "System.exit returned normally, while it was supposed to halt JVM."

    .line 573
    .line 574
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    throw p0

    .line 578
    :pswitch_e
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 579
    .line 580
    invoke-static {}, Los;->α()V

    .line 581
    .line 582
    .line 583
    return-void

    .line 584
    :pswitch_f
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 585
    .line 586
    invoke-static {}, Los;->Μ()V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :pswitch_10
    invoke-static {v5}, Los;->κ(Z)V

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :pswitch_11
    sget-object p0, Lll;->α:Lll;

    .line 595
    .line 596
    invoke-static {}, Lll;->μ()V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :pswitch_12
    invoke-static {}, Lmj;->η()V

    .line 601
    .line 602
    .line 603
    invoke-static {}, Lmj;->φ()V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :pswitch_13
    invoke-static {}, Lmj;->φ()V

    .line 608
    .line 609
    .line 610
    return-void

    .line 611
    :pswitch_14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 612
    .line 613
    .line 614
    move-result-wide v0

    .line 615
    sget-object p0, Lfj;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 616
    .line 617
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 618
    .line 619
    .line 620
    move-result-object p0

    .line 621
    new-instance v3, Lgh;

    .line 622
    .line 623
    const/16 v4, 0x8

    .line 624
    .line 625
    invoke-direct {v3, v4}, Lgh;-><init>(I)V

    .line 626
    .line 627
    .line 628
    new-instance v4, Lwi;

    .line 629
    .line 630
    invoke-direct {v4, v3, v6}, Lwi;-><init>(La80;I)V

    .line 631
    .line 632
    .line 633
    invoke-interface {p0, v4}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 634
    .line 635
    .line 636
    sget-object p0, Lfj;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 637
    .line 638
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 639
    .line 640
    .line 641
    move-result-object p0

    .line 642
    new-instance v3, Lgh;

    .line 643
    .line 644
    const/16 v4, 0x9

    .line 645
    .line 646
    invoke-direct {v3, v4}, Lgh;-><init>(I)V

    .line 647
    .line 648
    .line 649
    new-instance v4, Lwi;

    .line 650
    .line 651
    invoke-direct {v4, v3, v5}, Lwi;-><init>(La80;I)V

    .line 652
    .line 653
    .line 654
    invoke-interface {p0, v4}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 655
    .line 656
    .line 657
    sget-object p0, Lfj;->κ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 658
    .line 659
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 660
    .line 661
    .line 662
    move-result-object p0

    .line 663
    new-instance v3, Lmc;

    .line 664
    .line 665
    invoke-direct {v3, v2, v0, v1}, Lmc;-><init>(IJ)V

    .line 666
    .line 667
    .line 668
    new-instance v0, Lwi;

    .line 669
    .line 670
    invoke-direct {v0, v3, v2}, Lwi;-><init>(La80;I)V

    .line 671
    .line 672
    .line 673
    invoke-interface {p0, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 674
    .line 675
    .line 676
    sget-object p0, Lfj;->λ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 677
    .line 678
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    new-instance v0, Lgh;

    .line 683
    .line 684
    const/16 v1, 0xa

    .line 685
    .line 686
    invoke-direct {v0, v1}, Lgh;-><init>(I)V

    .line 687
    .line 688
    .line 689
    new-instance v1, Lwi;

    .line 690
    .line 691
    const/4 v2, 0x3

    .line 692
    invoke-direct {v1, v0, v2}, Lwi;-><init>(La80;I)V

    .line 693
    .line 694
    .line 695
    invoke-interface {p0, v1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 696
    .line 697
    .line 698
    return-void

    .line 699
    :pswitch_15
    sget-object p0, Lug;->α:Ltg;

    .line 700
    .line 701
    invoke-static {}, Ltg;->Μ()Z

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    if-nez v0, :cond_20

    .line 706
    .line 707
    goto :goto_d

    .line 708
    :cond_20
    invoke-virtual {p0}, Ltg;->ο()Z

    .line 709
    .line 710
    .line 711
    invoke-static {v6}, Ltg;->α(Z)V

    .line 712
    .line 713
    .line 714
    :goto_d
    return-void

    .line 715
    :pswitch_16
    sget-object p0, Lug;->α:Ltg;

    .line 716
    .line 717
    invoke-static {}, Ltg;->д()V

    .line 718
    .line 719
    .line 720
    return-void

    .line 721
    :pswitch_17
    sput-object v4, Lug;->Υ:Ls0;

    .line 722
    .line 723
    sput-boolean v6, Lug;->φ:Z

    .line 724
    .line 725
    sget-object p0, Lug;->α:Ltg;

    .line 726
    .line 727
    invoke-static {v5}, Ltg;->α(Z)V

    .line 728
    .line 729
    .line 730
    return-void

    .line 731
    :pswitch_18
    sget-object p0, Lug;->в:Ljava/util/LinkedHashSet;

    .line 732
    .line 733
    invoke-static {p0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    sget-object v1, Lug;->г:Ljava/lang/String;

    .line 738
    .line 739
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    .line 740
    .line 741
    .line 742
    const-string p0, ""

    .line 743
    .line 744
    sput-object p0, Lug;->г:Ljava/lang/String;

    .line 745
    .line 746
    sput-object v4, Lug;->б:Ls0;

    .line 747
    .line 748
    sget-object p0, Lug;->α:Ltg;

    .line 749
    .line 750
    const-string v2, "clean_mode_enabled"

    .line 751
    .line 752
    invoke-static {}, Ltg;->Μ()Z

    .line 753
    .line 754
    .line 755
    move-result v3

    .line 756
    sget-boolean v4, Lug;->ν:Z

    .line 757
    .line 758
    sget-boolean v7, Lug;->σ:Z

    .line 759
    .line 760
    invoke-static {}, Ltg;->е()V

    .line 761
    .line 762
    .line 763
    const-string v8, "runtime config changed"

    .line 764
    .line 765
    invoke-static {v8}, Ltg;->щ(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    sget-object v8, Loh;->α:Loh;

    .line 769
    .line 770
    sget-boolean v8, Lug;->ψ:Z

    .line 771
    .line 772
    invoke-static {v8}, Loh;->θ(Z)V

    .line 773
    .line 774
    .line 775
    invoke-static {}, Ltg;->Μ()Z

    .line 776
    .line 777
    .line 778
    move-result v8

    .line 779
    if-eqz v8, :cond_21

    .line 780
    .line 781
    invoke-virtual {p0}, Ltg;->ο()Z

    .line 782
    .line 783
    .line 784
    :cond_21
    invoke-virtual {p0}, Ltg;->π()V

    .line 785
    .line 786
    .line 787
    invoke-virtual {p0}, Ltg;->ц()V

    .line 788
    .line 789
    .line 790
    invoke-static {}, Ltg;->η()V

    .line 791
    .line 792
    .line 793
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result p0

    .line 797
    if-nez p0, :cond_22

    .line 798
    .line 799
    sget-boolean p0, Lug;->ν:Z

    .line 800
    .line 801
    if-ne v4, p0, :cond_22

    .line 802
    .line 803
    sget-boolean p0, Lug;->σ:Z

    .line 804
    .line 805
    if-ne v7, p0, :cond_22

    .line 806
    .line 807
    sget-boolean p0, Lug;->σ:Z

    .line 808
    .line 809
    if-nez p0, :cond_23

    .line 810
    .line 811
    :cond_22
    sput-boolean v6, Lug;->φ:Z

    .line 812
    .line 813
    :cond_23
    if-nez v8, :cond_24

    .line 814
    .line 815
    sput-boolean v6, Lug;->φ:Z

    .line 816
    .line 817
    :try_start_3
    sget-object p0, Lsb;->α:Lsb;

    .line 818
    .line 819
    invoke-static {v6}, Lsb;->в(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 820
    .line 821
    .line 822
    :catchall_3
    invoke-static {}, Ltg;->й()V

    .line 823
    .line 824
    .line 825
    new-instance p0, Ljava/lang/StringBuilder;

    .line 826
    .line 827
    const-string v2, "re81757ac4b2b47fd"

    .line 828
    .line 829
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object p0

    .line 842
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    goto :goto_f

    .line 846
    :cond_24
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result p0

    .line 850
    if-nez p0, :cond_26

    .line 851
    .line 852
    const-string p0, "clean_auto_hide"

    .line 853
    .line 854
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result p0

    .line 858
    if-nez p0, :cond_26

    .line 859
    .line 860
    if-ne v3, v8, :cond_26

    .line 861
    .line 862
    sget-boolean p0, Lug;->ν:Z

    .line 863
    .line 864
    if-eq v4, p0, :cond_25

    .line 865
    .line 866
    goto :goto_e

    .line 867
    :cond_25
    move v5, v6

    .line 868
    :cond_26
    :goto_e
    invoke-static {v5}, Ltg;->α(Z)V

    .line 869
    .line 870
    .line 871
    sget-boolean p0, Lug;->ν:Z

    .line 872
    .line 873
    sget-boolean v2, Lug;->σ:Z

    .line 874
    .line 875
    new-instance v3, Ljava/lang/StringBuilder;

    .line 876
    .line 877
    const-string v4, "r421e2dad95c76c36"

    .line 878
    .line 879
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object p0

    .line 898
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    :goto_f
    return-void

    .line 902
    :pswitch_19
    sget-boolean p0, Lug;->ν:Z

    .line 903
    .line 904
    sget-object v0, Lug;->α:Ltg;

    .line 905
    .line 906
    invoke-static {}, Ltg;->е()V

    .line 907
    .line 908
    .line 909
    invoke-static {}, Ltg;->η()V

    .line 910
    .line 911
    .line 912
    sput-boolean v6, Lug;->φ:Z

    .line 913
    .line 914
    const-string v1, "account changed"

    .line 915
    .line 916
    invoke-static {v1}, Ltg;->щ(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    invoke-static {}, Ltg;->Μ()Z

    .line 920
    .line 921
    .line 922
    move-result v1

    .line 923
    if-eqz v1, :cond_27

    .line 924
    .line 925
    invoke-virtual {v0}, Ltg;->ο()Z

    .line 926
    .line 927
    .line 928
    :cond_27
    invoke-virtual {v0}, Ltg;->π()V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0}, Ltg;->ц()V

    .line 932
    .line 933
    .line 934
    invoke-static {}, Ltg;->Μ()Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-nez v0, :cond_28

    .line 939
    .line 940
    if-eqz p0, :cond_29

    .line 941
    .line 942
    invoke-static {}, Ltg;->й()V

    .line 943
    .line 944
    .line 945
    goto :goto_10

    .line 946
    :cond_28
    invoke-static {v5}, Ltg;->α(Z)V

    .line 947
    .line 948
    .line 949
    :cond_29
    :goto_10
    sget-boolean p0, Lug;->Τ:Z

    .line 950
    .line 951
    sget-boolean v0, Lug;->ν:Z

    .line 952
    .line 953
    sget-boolean v1, Lug;->σ:Z

    .line 954
    .line 955
    new-instance v2, Ljava/lang/StringBuilder;

    .line 956
    .line 957
    const-string v3, "r85fd2d219760e52a"

    .line 958
    .line 959
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object p0

    .line 975
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    return-void

    .line 979
    :pswitch_1a
    const-string p0, "rc2b948eb05c3593c"

    .line 980
    .line 981
    const-string v0, "blacklist block dialog shown uid="

    .line 982
    .line 983
    sget-object v1, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 984
    .line 985
    :try_start_4
    sget-object v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->λ:Ljava/lang/ref/WeakReference;

    .line 986
    .line 987
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v2

    .line 991
    check-cast v2, Landroid/app/Activity;

    .line 992
    .line 993
    if-eqz v2, :cond_2a

    .line 994
    .line 995
    goto :goto_11

    .line 996
    :cond_2a
    sget-object v2, Lcom/example/dyhelper/beta/BlacklistVerifier;->ι:Landroid/content/Context;

    .line 997
    .line 998
    if-nez v2, :cond_2b

    .line 999
    .line 1000
    goto :goto_13

    .line 1001
    :cond_2b
    :goto_11
    sget-object v6, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 1002
    .line 1003
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v7

    .line 1007
    if-eqz v7, :cond_2c

    .line 1008
    .line 1009
    const-string v6, "\u672a\u77e5"

    .line 1010
    .line 1011
    goto :goto_12

    .line 1012
    :catchall_4
    move-exception v0

    .line 1013
    goto :goto_14

    .line 1014
    :cond_2c
    :goto_12
    invoke-virtual {v1}, Lcom/example/dyhelper/beta/BlacklistVerifier;->δ()Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v7

    .line 1022
    if-eqz v7, :cond_2d

    .line 1023
    .line 1024
    const-string v1, "\u8fdd\u89c4\u4f7f\u7528"

    .line 1025
    .line 1026
    :cond_2d
    const-string v7, "DYHelper \u9ed1\u540d\u5355\u7528\u6237\uff0c\u8fdb\u7a0b\u5c06\u9000\u51fa"

    .line 1027
    .line 1028
    invoke-static {v2, v7, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v7

    .line 1032
    invoke-virtual {v7}, Landroid/widget/Toast;->show()V

    .line 1033
    .line 1034
    .line 1035
    sget-object v7, Lda;->β:Landroid/os/Handler;

    .line 1036
    .line 1037
    new-instance v8, Le9;

    .line 1038
    .line 1039
    invoke-direct {v8, v2, v6, v1, v5}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1043
    .line 1044
    .line 1045
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1051
    .line 1052
    .line 1053
    const-string v0, " reason="

    .line 1054
    .line 1055
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-static {p0, v0, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1066
    .line 1067
    .line 1068
    :goto_13
    sget-object v0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1069
    .line 1070
    goto :goto_15

    .line 1071
    :goto_14
    new-instance v1, Leo1;

    .line 1072
    .line 1073
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1074
    .line 1075
    .line 1076
    move-object v0, v1

    .line 1077
    :goto_15
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    if-eqz v0, :cond_2e

    .line 1082
    .line 1083
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    const-string v1, "show blocked toast/dialog failed: "

    .line 1088
    .line 1089
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-static {p0, v0, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    :cond_2e
    return-void

    .line 1097
    :pswitch_1b
    const-string p0, "notice check failed: "

    .line 1098
    .line 1099
    :try_start_5
    invoke-static {v4}, Lx9;->ξ(Ljava/lang/String;)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v1

    .line 1107
    if-nez v1, :cond_2f

    .line 1108
    .line 1109
    sget-object v1, Lr9;->α:Landroid/os/Handler;

    .line 1110
    .line 1111
    invoke-static {v0}, Lr9;->β(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1112
    .line 1113
    .line 1114
    goto :goto_16

    .line 1115
    :catchall_5
    move-exception v0

    .line 1116
    goto :goto_17

    .line 1117
    :cond_2f
    :goto_16
    sget-object p0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1118
    .line 1119
    invoke-virtual {p0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1120
    .line 1121
    .line 1122
    goto :goto_18

    .line 1123
    :goto_17
    :try_start_6
    const-string v1, "r267d1c3d8cdbcdb7"

    .line 1124
    .line 1125
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v0

    .line 1129
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1130
    .line 1131
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object p0

    .line 1141
    invoke-static {v1, p0, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1142
    .line 1143
    .line 1144
    goto :goto_16

    .line 1145
    :goto_18
    return-void

    .line 1146
    :catchall_6
    move-exception p0

    .line 1147
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1148
    .line 1149
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1150
    .line 1151
    .line 1152
    throw p0

    .line 1153
    :pswitch_1c
    sget-object p0, Landroidx/compose/ui/platform/AndroidComposeView;->О:Lv11;

    .line 1154
    .line 1155
    monitor-enter p0

    .line 1156
    :try_start_7
    iget-object v0, p0, Lv11;->α:[Ljava/lang/Object;

    .line 1157
    .line 1158
    iget v1, p0, Lv11;->β:I

    .line 1159
    .line 1160
    :goto_19
    if-ge v6, v1, :cond_30

    .line 1161
    .line 1162
    aget-object v3, v0, v6

    .line 1163
    .line 1164
    check-cast v3, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1165
    .line 1166
    new-instance v4, Lq0;

    .line 1167
    .line 1168
    invoke-direct {v4, v3, v2}, Lq0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v3, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1172
    .line 1173
    .line 1174
    add-int/lit8 v6, v6, 0x1

    .line 1175
    .line 1176
    goto :goto_19

    .line 1177
    :catchall_7
    move-exception v0

    .line 1178
    goto :goto_1a

    .line 1179
    :cond_30
    monitor-exit p0

    .line 1180
    return-void

    .line 1181
    :goto_1a
    monitor-exit p0

    .line 1182
    throw v0

    .line 1183
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
