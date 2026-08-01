.class public final synthetic Loj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p2, p0, Loj;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Loj;->ε:I

    .line 4
    .line 5
    const-wide/16 v2, 0x3a98

    .line 6
    .line 7
    const-wide/16 v4, 0xc8

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    const-wide/16 v1, 0x1f4

    .line 17
    .line 18
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Le72;->α(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    :catchall_0
    return-void

    .line 25
    :pswitch_0
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    :try_start_1
    invoke-static {v0}, Le72;->α(Ljava/lang/ClassLoader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_1
    move-exception v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "AppLog \u5237\u65b0\u5931\u8d25 source=User.getUid() changed: "

    .line 37
    .line 38
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x4

    .line 43
    const-string v2, "r3d7af71c7d5f3398"

    .line 44
    .line 45
    invoke-static {v2, v0, v6, v1, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :pswitch_1
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 50
    .line 51
    sget-object v1, Lsh1;->α:Lsh1;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Lsh1;->ο(Ljava/lang/ClassLoader;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_2
    const-string v1, "r33415130c3798aa0"

    .line 58
    .line 59
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 60
    .line 61
    sget-object v7, Lsh1;->α:Lsh1;

    .line 62
    .line 63
    const/16 v7, 0xa

    .line 64
    .line 65
    :try_start_2
    invoke-static {v7}, Landroid/os/Process;->setThreadPriority(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    .line 67
    .line 68
    :catchall_2
    :try_start_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 69
    .line 70
    .line 71
    move-result-wide v8

    .line 72
    const-wide/16 v10, 0xbb8

    .line 73
    .line 74
    add-long/2addr v8, v10

    .line 75
    :goto_1
    sget-object v10, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-nez v11, :cond_0

    .line 82
    .line 83
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 84
    .line 85
    .line 86
    move-result-wide v11

    .line 87
    cmp-long v11, v11, v8

    .line 88
    .line 89
    if-gez v11, :cond_0

    .line 90
    .line 91
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_3
    move-exception v0

    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_0
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_1

    .line 103
    .line 104
    const-string v0, "DexKit manager not initialized, skip full resolve"

    .line 105
    .line 106
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_5

    .line 110
    .line 111
    :cond_1
    invoke-static {v0}, Lsh1;->ι(Ljava/lang/ClassLoader;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_2

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    add-long/2addr v4, v2

    .line 123
    :goto_2
    sget-object v2, Lsh1;->κ:Ljava/lang/ref/WeakReference;

    .line 124
    .line 125
    if-eqz v2, :cond_3

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Landroid/app/Activity;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_3
    move-object v2, v6

    .line 135
    :goto_3
    if-nez v2, :cond_4

    .line 136
    .line 137
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 138
    .line 139
    .line 140
    move-result-wide v2

    .line 141
    cmp-long v2, v2, v4

    .line 142
    .line 143
    if-gez v2, :cond_4

    .line 144
    .line 145
    const-wide/16 v2, 0xfa

    .line 146
    .line 147
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    const-wide/16 v2, 0x5dc

    .line 152
    .line 153
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 154
    .line 155
    .line 156
    invoke-static {v0}, Lsh1;->ι(Ljava/lang/ClassLoader;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_5

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_5
    const-string v2, "play completed hooks installed, methods="
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 164
    .line 165
    :try_start_4
    invoke-static {v7}, Landroid/os/Process;->setThreadPriority(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 166
    .line 167
    .line 168
    :catchall_4
    :try_start_5
    invoke-static {v0}, Lsh1;->ι(Ljava/lang/ClassLoader;)Z

    .line 169
    .line 170
    .line 171
    move-result v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 172
    if-eqz v3, :cond_6

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_6
    :try_start_6
    invoke-static {v0}, Luh1;->λ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-static {v0, v3}, Lsh1;->η(Ljava/lang/ClassLoader;Ljava/util/List;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    new-instance v3, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :catchall_5
    move-exception v0

    .line 203
    :try_start_7
    const-string v2, "DexKit progress failed"

    .line 204
    .line 205
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :goto_4
    const-string v2, "schedule completed hooks failed"

    .line 210
    .line 211
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    :goto_5
    return-void

    .line 215
    :pswitch_3
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 216
    .line 217
    sget-object v1, Lsh1;->α:Lsh1;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Lsh1;->δ(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-nez v1, :cond_7

    .line 224
    .line 225
    const-string v0, "resumeFeedPlayer failed: wrapper is null"

    .line 226
    .line 227
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_7
    invoke-static {v1, v0, v7}, Lsh1;->λ(Ljava/lang/Object;Ljava/lang/ClassLoader;Z)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-eqz v2, :cond_8

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_8
    const-string v2, "resume"

    .line 239
    .line 240
    invoke-static {v0, v1, v2}, Lsh1;->κ(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_9

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_9
    const-string v0, "resumeFeedPlayer failed: all methods unavailable"

    .line 248
    .line 249
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :goto_6
    return-void

    .line 253
    :pswitch_4
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 254
    .line 255
    sget-object v1, Lsh1;->α:Lsh1;

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Lsh1;->ο(Ljava/lang/ClassLoader;)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :pswitch_5
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 262
    .line 263
    sget-object v1, Lah0;->α:Landroid/os/Handler;

    .line 264
    .line 265
    sget-object v1, Lah0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 266
    .line 267
    :try_start_8
    invoke-static {v0}, Lah0;->Ω(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-nez v0, :cond_a

    .line 272
    .line 273
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 274
    .line 275
    .line 276
    goto :goto_8

    .line 277
    :catchall_6
    move-exception v0

    .line 278
    goto :goto_7

    .line 279
    :cond_a
    sget-object v2, Lah0;->α:Landroid/os/Handler;

    .line 280
    .line 281
    new-instance v3, Lν;

    .line 282
    .line 283
    const/16 v4, 0x13

    .line 284
    .line 285
    invoke-direct {v3, v4, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_b

    .line 293
    .line 294
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 295
    .line 296
    .line 297
    goto :goto_8

    .line 298
    :goto_7
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 299
    .line 300
    .line 301
    const-string v1, "resolve-adapter"

    .line 302
    .line 303
    invoke-static {v1, v0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    :cond_b
    :goto_8
    return-void

    .line 307
    :pswitch_6
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 308
    .line 309
    sget-object v1, Lx;->Κ:Lx;

    .line 310
    .line 311
    sget-object v6, Lrx;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 312
    .line 313
    sget-object v8, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 314
    .line 315
    :try_start_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 316
    .line 317
    .line 318
    move-result-wide v8

    .line 319
    add-long/2addr v8, v2

    .line 320
    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 321
    .line 322
    .line 323
    move-result-wide v2

    .line 324
    cmp-long v2, v2, v8

    .line 325
    .line 326
    const/4 v3, 0x1

    .line 327
    if-gez v2, :cond_d

    .line 328
    .line 329
    sget-object v2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 332
    .line 333
    .line 334
    move-result v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 335
    if-eqz v2, :cond_c

    .line 336
    .line 337
    move v2, v3

    .line 338
    goto :goto_a

    .line 339
    :cond_c
    :try_start_a
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 340
    .line 341
    .line 342
    goto :goto_9

    .line 343
    :catch_0
    :try_start_b
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 348
    .line 349
    .line 350
    move v2, v7

    .line 351
    goto :goto_a

    .line 352
    :cond_d
    sget-object v2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    :goto_a
    if-nez v2, :cond_e

    .line 359
    .line 360
    const-string v0, "prewarm canceled: DyDexKitManager not initialized"

    .line 361
    .line 362
    invoke-static {v0}, Lrx;->β(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 363
    .line 364
    .line 365
    :goto_b
    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_10

    .line 369
    .line 370
    :catchall_7
    move-exception v0

    .line 371
    goto/16 :goto_f

    .line 372
    .line 373
    :cond_e
    :try_start_c
    invoke-static {v0}, Lrx;->α(Ljava/lang/ClassLoader;)Ljava/util/LinkedHashMap;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_f

    .line 382
    .line 383
    const-string v1, "no prewarm tasks registered"

    .line 384
    .line 385
    invoke-static {v1}, Lrx;->β(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-static {v0}, Lrx;->γ(Ljava/lang/ClassLoader;)V

    .line 389
    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_f
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 393
    .line 394
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    move v8, v7

    .line 406
    move v9, v8

    .line 407
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v10

    .line 411
    if-eqz v10, :cond_14

    .line 412
    .line 413
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    check-cast v10, Ljava/util/Map$Entry;

    .line 418
    .line 419
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    check-cast v11, Ljava/lang/String;

    .line 424
    .line 425
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v10

    .line 429
    check-cast v10, Lqx;

    .line 430
    .line 431
    sget-object v12, Lox;->α:Ljava/lang/Object;

    .line 432
    .line 433
    iget-object v12, v10, Lqx;->α:Ljava/lang/String;

    .line 434
    .line 435
    invoke-static {v12}, Lox;->ν(Ljava/lang/String;)Z

    .line 436
    .line 437
    .line 438
    move-result v13

    .line 439
    if-eqz v13, :cond_10

    .line 440
    .line 441
    :goto_d
    move v12, v3

    .line 442
    goto :goto_e

    .line 443
    :cond_10
    invoke-virtual {v1, v12}, Lx;->Α(Ljava/lang/String;)Z

    .line 444
    .line 445
    .line 446
    move-result v13

    .line 447
    if-eqz v13, :cond_11

    .line 448
    .line 449
    new-instance v13, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v14, "skip unsupported prewarm task: "

    .line 452
    .line 453
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v12

    .line 463
    invoke-static {v12}, Lrx;->β(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    goto :goto_d

    .line 467
    :cond_11
    move v12, v7

    .line 468
    :goto_e
    if-eqz v12, :cond_13

    .line 469
    .line 470
    iget-object v10, v10, Lqx;->α:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v1, v10}, Lx;->Α(Ljava/lang/String;)Z

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    if-eqz v10, :cond_12

    .line 477
    .line 478
    add-int/lit8 v9, v9, 0x1

    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_12
    add-int/lit8 v8, v8, 0x1

    .line 482
    .line 483
    goto :goto_c

    .line 484
    :cond_13
    invoke-interface {v4, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    goto :goto_c

    .line 488
    :cond_14
    invoke-virtual {v4}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 492
    const-string v3, ", unsupported="

    .line 493
    .line 494
    if-eqz v1, :cond_15

    .line 495
    .line 496
    :try_start_d
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    new-instance v2, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 503
    .line 504
    .line 505
    const-string v4, "all prewarm tasks satisfied: cached="

    .line 506
    .line 507
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    const-string v3, ", total="

    .line 520
    .line 521
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-static {v1}, Lrx;->β(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-static {}, Lrx;->ι()V

    .line 535
    .line 536
    .line 537
    invoke-static {v0}, Lrx;->γ(Ljava/lang/ClassLoader;)V

    .line 538
    .line 539
    .line 540
    goto/16 :goto_b

    .line 541
    .line 542
    :cond_15
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    invoke-virtual {v4}, Ljava/util/AbstractMap;->size()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    move-object v10, v5

    .line 558
    check-cast v10, Ljava/lang/Iterable;

    .line 559
    .line 560
    const-string v11, ", "

    .line 561
    .line 562
    new-instance v15, Lhm;

    .line 563
    .line 564
    const/16 v5, 0x17

    .line 565
    .line 566
    invoke-direct {v15, v5}, Lhm;-><init>(I)V

    .line 567
    .line 568
    .line 569
    const/16 v16, 0x1e

    .line 570
    .line 571
    const/4 v12, 0x0

    .line 572
    const/4 v13, 0x0

    .line 573
    const/4 v14, 0x0

    .line 574
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v5

    .line 578
    new-instance v10, Ljava/lang/StringBuilder;

    .line 579
    .line 580
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 581
    .line 582
    .line 583
    const-string v11, "prewarm start, total="

    .line 584
    .line 585
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    const-string v1, ", cached="

    .line 592
    .line 593
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    const-string v1, ", missing="

    .line 606
    .line 607
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    const-string v1, ", missingIds="

    .line 614
    .line 615
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-static {v1}, Lrx;->β(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-static {v0, v4}, Lrx;->η(Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 629
    .line 630
    .line 631
    goto/16 :goto_b

    .line 632
    .line 633
    :goto_f
    :try_start_e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 634
    .line 635
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 636
    .line 637
    .line 638
    const-string v2, "prewarm fatal: "

    .line 639
    .line 640
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-static {v0}, Lrx;->β(Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 651
    .line 652
    .line 653
    goto/16 :goto_b

    .line 654
    .line 655
    :goto_10
    return-void

    .line 656
    :catchall_8
    move-exception v0

    .line 657
    invoke-virtual {v6, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 658
    .line 659
    .line 660
    throw v0

    .line 661
    :pswitch_7
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 662
    .line 663
    sget v1, Lix;->α:I

    .line 664
    .line 665
    invoke-static {v0}, Lix;->λ(Ljava/lang/ClassLoader;)V

    .line 666
    .line 667
    .line 668
    return-void

    .line 669
    :pswitch_8
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 670
    .line 671
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    new-instance v2, Lex;

    .line 676
    .line 677
    invoke-direct {v2, v0}, Lex;-><init>(Ljava/lang/ClassLoader;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v1, v2}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 681
    .line 682
    .line 683
    sget-object v1, Lix;->ν:Landroid/os/Handler;

    .line 684
    .line 685
    new-instance v2, Loj;

    .line 686
    .line 687
    const/4 v3, 0x2

    .line 688
    invoke-direct {v2, v0, v3}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 689
    .line 690
    .line 691
    const-wide/16 v3, 0x0

    .line 692
    .line 693
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 694
    .line 695
    .line 696
    return-void

    .line 697
    :pswitch_9
    iget-object v0, v0, Loj;->ζ:Ljava/lang/ClassLoader;

    .line 698
    .line 699
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->α(Ljava/lang/ClassLoader;)V

    .line 700
    .line 701
    .line 702
    return-void

    .line 703
    :pswitch_data_0
    .packed-switch 0x0
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
