.class public final synthetic Lm2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm2;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lm2;->i:Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lm2;->h:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, La83;->a:La83;

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v0, v0, Lm2;->i:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Lq03;

    .line 18
    .line 19
    iget-object v1, v0, Lq03;->b:Lb5;

    .line 20
    .line 21
    iput-object v3, v0, Lq03;->n:Lm2;

    .line 22
    .line 23
    iget-object v2, v0, Lq03;->m:Lzk1;

    .line 24
    .line 25
    iget-object v0, v0, Lq03;->a:Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-ne v0, v6, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2}, Lzk1;->g()V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_0
    iget-object v0, v2, Lzk1;->h:[Ljava/lang/Object;

    .line 55
    .line 56
    iget v4, v2, Lzk1;->j:I

    .line 57
    .line 58
    move-object v8, v3

    .line 59
    move v9, v7

    .line 60
    :goto_0
    if-ge v9, v4, :cond_7

    .line 61
    .line 62
    aget-object v10, v0, v9

    .line 63
    .line 64
    check-cast v10, Lp03;

    .line 65
    .line 66
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_5

    .line 71
    .line 72
    if-eq v11, v6, :cond_4

    .line 73
    .line 74
    if-eq v11, v5, :cond_2

    .line 75
    .line 76
    const/4 v12, 0x3

    .line 77
    if-ne v11, v12, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-static {}, Lc80;->s()V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_2
    :goto_1
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-static {v3, v11}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    if-nez v11, :cond_6

    .line 92
    .line 93
    sget-object v8, Lp03;->j:Lp03;

    .line 94
    .line 95
    if-ne v10, v8, :cond_3

    .line 96
    .line 97
    move v8, v6

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move v8, v7

    .line 100
    :goto_2
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    :goto_3
    move-object v8, v3

    .line 108
    goto :goto_4

    .line 109
    :cond_5
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_7
    invoke-virtual {v2}, Lzk1;->g()V

    .line 116
    .line 117
    .line 118
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-static {v3, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    iget-object v0, v1, Lb5;->j:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lj71;

    .line 129
    .line 130
    invoke-interface {v0}, Lj71;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 135
    .line 136
    iget-object v2, v1, Lb5;->i:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Landroid/view/View;

    .line 139
    .line 140
    invoke-virtual {v0, v2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    if-eqz v8, :cond_a

    .line 144
    .line 145
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_9

    .line 150
    .line 151
    iget-object v0, v1, Lb5;->k:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lhh1;

    .line 154
    .line 155
    iget-object v0, v0, Lhh1;->i:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lhh1;

    .line 158
    .line 159
    invoke-virtual {v0}, Lhh1;->G()V

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_9
    iget-object v0, v1, Lb5;->k:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lhh1;

    .line 166
    .line 167
    iget-object v0, v0, Lhh1;->i:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lhh1;

    .line 170
    .line 171
    invoke-virtual {v0}, Lhh1;->A()V

    .line 172
    .line 173
    .line 174
    :cond_a
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-static {v3, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_b

    .line 181
    .line 182
    iget-object v0, v1, Lb5;->j:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Lj71;

    .line 185
    .line 186
    invoke-interface {v0}, Lj71;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 191
    .line 192
    iget-object v1, v1, Lb5;->i:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, Landroid/view/View;

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 197
    .line 198
    .line 199
    :cond_b
    :goto_6
    return-void

    .line 200
    :pswitch_0
    check-cast v0, Lra2;

    .line 201
    .line 202
    invoke-static {v0}, Lra2;->a(Lra2;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_1
    check-cast v0, [Lvj;

    .line 207
    .line 208
    sget-object v1, Lpp1;->a:Lpp1;

    .line 209
    .line 210
    :try_start_0
    sget-object v1, Lvr1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 211
    .line 212
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-static {v1}, Lvr1;->b(Lvu0;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-static {v3}, Lte;->S(Lvu0;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_f

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    new-instance v3, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-static {}, Lpp1;->f()Z

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    sput-object v0, Lrg3;->i:[Lvj;

    .line 243
    .line 244
    array-length v6, v0

    .line 245
    move v8, v7

    .line 246
    :goto_7
    if-ge v8, v6, :cond_e

    .line 247
    .line 248
    aget-object v9, v0, v8

    .line 249
    .line 250
    instance-of v10, v9, Ltb1;

    .line 251
    .line 252
    if-nez v10, :cond_d

    .line 253
    .line 254
    instance-of v10, v9, Lgw;

    .line 255
    .line 256
    if-eqz v10, :cond_c

    .line 257
    .line 258
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :cond_c
    invoke-static {v9, v5}, Lop0;->q(Lvj;Z)V

    .line 262
    .line 263
    .line 264
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_e
    new-array v0, v7, [Lgw;

    .line 268
    .line 269
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    check-cast v0, [Lgw;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    sput-object v0, Lrg3;->j:[Lgw;

    .line 279
    .line 280
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v1, v0}, Lvr1;->c(Ljava/lang/String;Lvu0;)V

    .line 285
    .line 286
    .line 287
    goto :goto_8

    .line 288
    :catchall_0
    move-exception v0

    .line 289
    goto :goto_9

    .line 290
    :cond_f
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-static {v0, v1}, Lte;->i0([Lvj;Lvu0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
    .line 296
    .line 297
    :goto_8
    move-object v1, v4

    .line 298
    goto :goto_a

    .line 299
    :goto_9
    new-instance v1, Lx92;

    .line 300
    .line 301
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    :goto_a
    invoke-static {v1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    if-eqz v0, :cond_10

    .line 309
    .line 310
    const-string v1, "NukeCore"

    .line 311
    .line 312
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    const-string v3, "Nuke init failed: "

    .line 317
    .line 318
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const-string v3, "["

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v3, "]"

    .line 337
    .line 338
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 349
    .line 350
    .line 351
    goto :goto_b

    .line 352
    :catchall_1
    move-exception v0

    .line 353
    new-instance v4, Lx92;

    .line 354
    .line 355
    invoke-direct {v4, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 356
    .line 357
    .line 358
    :goto_b
    instance-of v0, v4, Lx92;

    .line 359
    .line 360
    if-eqz v0, :cond_10

    .line 361
    .line 362
    invoke-static {v2, v1, v5}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 363
    .line 364
    .line 365
    :cond_10
    return-void

    .line 366
    :pswitch_2
    check-cast v0, Lta;

    .line 367
    .line 368
    const-string v1, "[NukeNativePerf]"

    .line 369
    .line 370
    :try_start_2
    sget-object v3, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 371
    .line 372
    sget-object v3, Lam1;->a:Ljava/lang/ThreadLocal;

    .line 373
    .line 374
    sget-object v5, Lam1;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 375
    .line 376
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 377
    .line 378
    .line 379
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    check-cast v6, Ljava/lang/Boolean;

    .line 384
    .line 385
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 386
    .line 387
    invoke-virtual {v3, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 388
    .line 389
    .line 390
    :try_start_4
    invoke-static {}, Lam1;->c()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Lta;->a()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 394
    .line 395
    .line 396
    :try_start_5
    invoke-virtual {v3, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 397
    .line 398
    .line 399
    :try_start_6
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :catchall_2
    move-exception v0

    .line 404
    goto :goto_c

    .line 405
    :catchall_3
    move-exception v0

    .line 406
    :try_start_7
    invoke-virtual {v3, v6}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 410
    :goto_c
    :try_start_8
    invoke-virtual {v5}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 411
    .line 412
    .line 413
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 414
    :goto_d
    move-object v3, v0

    .line 415
    goto :goto_e

    .line 416
    :catchall_4
    move-exception v0

    .line 417
    goto :goto_d

    .line 418
    :goto_e
    invoke-static {v3}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const-string v5, "warmup failed: "

    .line 423
    .line 424
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    :try_start_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 445
    .line 446
    .line 447
    goto :goto_f

    .line 448
    :catchall_5
    move-exception v0

    .line 449
    new-instance v4, Lx92;

    .line 450
    .line 451
    invoke-direct {v4, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 452
    .line 453
    .line 454
    :goto_f
    instance-of v0, v4, Lx92;

    .line 455
    .line 456
    if-eqz v0, :cond_11

    .line 457
    .line 458
    const-string v0, "NukeNativePerf"

    .line 459
    .line 460
    invoke-static {v2, v0, v5}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 461
    .line 462
    .line 463
    :cond_11
    throw v3

    .line 464
    :pswitch_3
    check-cast v0, Ls1;

    .line 465
    .line 466
    invoke-virtual {v0}, Ls1;->a()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    return-void

    .line 470
    :pswitch_4
    check-cast v0, Lp80;

    .line 471
    .line 472
    invoke-static {v0}, Lp80;->a(Lp80;)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :pswitch_5
    check-cast v0, Law;

    .line 477
    .line 478
    iget-object v1, v0, Law;->i:Ljava/lang/Runnable;

    .line 479
    .line 480
    if-eqz v1, :cond_12

    .line 481
    .line 482
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 483
    .line 484
    .line 485
    iput-object v3, v0, Law;->i:Ljava/lang/Runnable;

    .line 486
    .line 487
    :cond_12
    return-void

    .line 488
    :pswitch_6
    check-cast v0, Ljg3;

    .line 489
    .line 490
    iget-object v0, v0, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 491
    .line 492
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    check-cast v0, Landroid/widget/ImageView;

    .line 498
    .line 499
    new-array v1, v5, [F

    .line 500
    .line 501
    fill-array-data v1, :array_0

    .line 502
    .line 503
    .line 504
    const-string v2, "rotation"

    .line 505
    .line 506
    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    sget-object v1, Lcs;->d:Lcs;

    .line 511
    .line 512
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-static {}, Lcs;->q()Lbs;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    iget-wide v1, v1, Lbs;->a:J

    .line 520
    .line 521
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 522
    .line 523
    .line 524
    const/4 v1, -0x1

    .line 525
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 526
    .line 527
    .line 528
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 529
    .line 530
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :pswitch_7
    check-cast v0, Lnb;

    .line 541
    .line 542
    iget-object v0, v0, Lnb;->h:Landroid/view/ActionMode;

    .line 543
    .line 544
    if-eqz v0, :cond_13

    .line 545
    .line 546
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 547
    .line 548
    .line 549
    :cond_13
    return-void

    .line 550
    :pswitch_8
    check-cast v0, Lw7;

    .line 551
    .line 552
    invoke-virtual {v0}, Lw7;->h()Z

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    iget-object v2, v0, Lw7;->h:Lb7;

    .line 557
    .line 558
    if-nez v1, :cond_14

    .line 559
    .line 560
    goto/16 :goto_13

    .line 561
    .line 562
    :cond_14
    const-string v1, "ContentCapture:changeChecker"

    .line 563
    .line 564
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    :try_start_a
    invoke-virtual {v2, v6}, Lb7;->v(Z)V

    .line 568
    .line 569
    .line 570
    iget-object v1, v0, Lw7;->r:Lzj1;

    .line 571
    .line 572
    iget-object v3, v1, Lx01;->b:[I

    .line 573
    .line 574
    iget-object v1, v1, Lx01;->a:[J

    .line 575
    .line 576
    array-length v6, v1

    .line 577
    sub-int/2addr v6, v5

    .line 578
    if-ltz v6, :cond_18

    .line 579
    .line 580
    move v5, v7

    .line 581
    :goto_10
    aget-wide v8, v1, v5

    .line 582
    .line 583
    not-long v10, v8

    .line 584
    const/4 v12, 0x7

    .line 585
    shl-long/2addr v10, v12

    .line 586
    and-long/2addr v10, v8

    .line 587
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    and-long/2addr v10, v12

    .line 593
    cmp-long v10, v10, v12

    .line 594
    .line 595
    if-eqz v10, :cond_17

    .line 596
    .line 597
    sub-int v10, v5, v6

    .line 598
    .line 599
    not-int v10, v10

    .line 600
    ushr-int/lit8 v10, v10, 0x1f

    .line 601
    .line 602
    const/16 v11, 0x8

    .line 603
    .line 604
    rsub-int/lit8 v10, v10, 0x8

    .line 605
    .line 606
    move v12, v7

    .line 607
    :goto_11
    if-ge v12, v10, :cond_16

    .line 608
    .line 609
    const-wide/16 v13, 0xff

    .line 610
    .line 611
    and-long/2addr v13, v8

    .line 612
    const-wide/16 v15, 0x80

    .line 613
    .line 614
    cmp-long v13, v13, v15

    .line 615
    .line 616
    if-gez v13, :cond_15

    .line 617
    .line 618
    shl-int/lit8 v13, v5, 0x3

    .line 619
    .line 620
    add-int/2addr v13, v12

    .line 621
    aget v15, v3, v13

    .line 622
    .line 623
    invoke-virtual {v0}, Lw7;->f()Lx01;

    .line 624
    .line 625
    .line 626
    move-result-object v13

    .line 627
    invoke-virtual {v13, v15}, Lx01;->a(I)Z

    .line 628
    .line 629
    .line 630
    move-result v13

    .line 631
    if-nez v13, :cond_15

    .line 632
    .line 633
    iget-object v13, v0, Lw7;->k:Ljava/util/ArrayList;

    .line 634
    .line 635
    new-instance v14, Lzz;

    .line 636
    .line 637
    move-wide/from16 v20, v8

    .line 638
    .line 639
    iget-wide v7, v0, Lw7;->q:J

    .line 640
    .line 641
    sget-object v18, La00;->i:La00;

    .line 642
    .line 643
    const/16 v19, 0x0

    .line 644
    .line 645
    move-wide/from16 v16, v7

    .line 646
    .line 647
    invoke-direct/range {v14 .. v19}, Lzz;-><init>(IJLa00;Lmb3;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    iget-object v7, v0, Lw7;->o:Ljn;

    .line 654
    .line 655
    invoke-interface {v7, v4}, Lho2;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    goto :goto_12

    .line 659
    :cond_15
    move-wide/from16 v20, v8

    .line 660
    .line 661
    :goto_12
    shr-long v8, v20, v11

    .line 662
    .line 663
    add-int/lit8 v12, v12, 0x1

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    goto :goto_11

    .line 667
    :cond_16
    if-ne v10, v11, :cond_18

    .line 668
    .line 669
    :cond_17
    if-eq v5, v6, :cond_18

    .line 670
    .line 671
    add-int/lit8 v5, v5, 0x1

    .line 672
    .line 673
    const/4 v7, 0x0

    .line 674
    goto :goto_10

    .line 675
    :cond_18
    const-string v1, "ContentCapture:sendAppearEvents"

    .line 676
    .line 677
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 678
    .line 679
    .line 680
    :try_start_b
    invoke-virtual {v2}, Lb7;->getSemanticsOwner()Ltn2;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    invoke-virtual {v1}, Ltn2;->a()Lqn2;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    iget-object v2, v0, Lw7;->s:Lrn2;

    .line 689
    .line 690
    invoke-virtual {v0, v1, v2}, Lw7;->j(Lqn2;Lrn2;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 691
    .line 692
    .line 693
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0}, Lw7;->f()Lx01;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-virtual {v0, v1}, Lw7;->d(Lx01;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0}, Lw7;->n()V

    .line 704
    .line 705
    .line 706
    const/4 v1, 0x0

    .line 707
    iput-boolean v1, v0, Lw7;->t:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 708
    .line 709
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 710
    .line 711
    .line 712
    :goto_13
    return-void

    .line 713
    :catchall_6
    move-exception v0

    .line 714
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 715
    .line 716
    .line 717
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 718
    :catchall_7
    move-exception v0

    .line 719
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 720
    .line 721
    .line 722
    throw v0

    .line 723
    :pswitch_9
    check-cast v0, Lh7;

    .line 724
    .line 725
    const-string v1, "measureAndLayout"

    .line 726
    .line 727
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    :try_start_e
    iget-object v1, v0, Lh7;->k:Lb7;

    .line 731
    .line 732
    invoke-virtual {v1, v6}, Lb7;->v(Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 733
    .line 734
    .line 735
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 736
    .line 737
    .line 738
    const-string v1, "checkForSemanticsChanges"

    .line 739
    .line 740
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    :try_start_f
    invoke-virtual {v0}, Lh7;->g()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 744
    .line 745
    .line 746
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 747
    .line 748
    .line 749
    const/4 v1, 0x0

    .line 750
    iput-boolean v1, v0, Lh7;->P:Z

    .line 751
    .line 752
    return-void

    .line 753
    :catchall_8
    move-exception v0

    .line 754
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 755
    .line 756
    .line 757
    throw v0

    .line 758
    :catchall_9
    move-exception v0

    .line 759
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 760
    .line 761
    .line 762
    throw v0

    .line 763
    :pswitch_a
    check-cast v0, Lo2;

    .line 764
    .line 765
    invoke-virtual {v0}, Lo2;->c()V

    .line 766
    .line 767
    .line 768
    return-void

    .line 769
    :pswitch_data_0
    .packed-switch 0x0
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

    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
.end method
