.class public final synthetic Lv;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lv;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lv;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 9
    iput p1, p0, Lv;->h:I

    iput-object p2, p0, Lv;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lv;->h:I

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x1

    .line 14
    packed-switch v2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ler2;

    .line 20
    .line 21
    move-object v9, v1

    .line 22
    check-cast v9, Lo12;

    .line 23
    .line 24
    iget-wide v3, v9, Lo12;->c:J

    .line 25
    .line 26
    iget-object v1, v0, Ler2;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lb03;

    .line 29
    .line 30
    invoke-virtual {v1}, Lb03;->k()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Lb03;->n()Lk03;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v2, v2, Lk03;->a:Lsd;

    .line 41
    .line 42
    iget-object v2, v2, Lsd;->i:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v2, v1, Lb03;->d:Lt91;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v2}, Lt91;->d()Lz03;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v1}, Lb03;->n()Lk03;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const/4 v5, 0x0

    .line 67
    sget-object v6, Lgd3;->H:Lc80;

    .line 68
    .line 69
    move-object v1, v0

    .line 70
    invoke-virtual/range {v1 .. v6}, Ler2;->e(Lk03;JZLvm2;)J

    .line 71
    .line 72
    .line 73
    move v7, v8

    .line 74
    :cond_2
    :goto_0
    if-eqz v7, :cond_3

    .line 75
    .line 76
    invoke-virtual {v9}, Lo12;->a()V

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object v0, La83;->a:La83;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_0
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lim2;

    .line 85
    .line 86
    check-cast v1, Lrs1;

    .line 87
    .line 88
    iget-object v2, v0, Lim2;->k:Lkl2;

    .line 89
    .line 90
    iget-wide v3, v1, Lrs1;->a:J

    .line 91
    .line 92
    iget v1, v0, Lim2;->j:I

    .line 93
    .line 94
    invoke-virtual {v0, v2, v3, v4, v1}, Lim2;->c(Lkl2;JI)J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    new-instance v2, Lrs1;

    .line 99
    .line 100
    invoke-direct {v2, v0, v1}, Lrs1;-><init>(J)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :pswitch_1
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lnl2;

    .line 107
    .line 108
    check-cast v1, Ljava/lang/Float;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iget-object v2, v0, Lnl2;->a:Lkx1;

    .line 115
    .line 116
    invoke-virtual {v2}, Lkx1;->g()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    int-to-float v3, v3

    .line 121
    add-float/2addr v3, v1

    .line 122
    iget v4, v0, Lnl2;->f:F

    .line 123
    .line 124
    add-float/2addr v3, v4

    .line 125
    iget-object v4, v0, Lnl2;->e:Lkx1;

    .line 126
    .line 127
    invoke-virtual {v4}, Lkx1;->g()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    int-to-float v4, v4

    .line 132
    invoke-static {v3, v5, v4}, Lci0;->C(FFF)F

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    cmpg-float v3, v3, v4

    .line 137
    .line 138
    if-nez v3, :cond_4

    .line 139
    .line 140
    move v7, v8

    .line 141
    :cond_4
    invoke-virtual {v2}, Lkx1;->g()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    int-to-float v3, v3

    .line 146
    sub-float/2addr v4, v3

    .line 147
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    invoke-virtual {v2}, Lkx1;->g()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    add-int/2addr v5, v3

    .line 156
    invoke-virtual {v2, v5}, Lkx1;->h(I)V

    .line 157
    .line 158
    .line 159
    int-to-float v2, v3

    .line 160
    sub-float v2, v4, v2

    .line 161
    .line 162
    iput v2, v0, Lnl2;->f:F

    .line 163
    .line 164
    if-nez v7, :cond_5

    .line 165
    .line 166
    move v1, v4

    .line 167
    :cond_5
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    return-object v0

    .line 172
    :pswitch_2
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 173
    .line 174
    move-object v2, v0

    .line 175
    check-cast v2, Ljava/lang/String;

    .line 176
    .line 177
    move-object v0, v1

    .line 178
    check-cast v0, Lgq1;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object v1, v0, Lgq1;->b:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v0, v0, Lgq1;->c:Ljava/lang/String;

    .line 186
    .line 187
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Leu;->Q([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    const/4 v5, 0x0

    .line 196
    const/16 v6, 0x3e

    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    const/4 v4, 0x0

    .line 200
    invoke-static/range {v1 .. v6}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    return-object v0

    .line 205
    :pswitch_3
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Ldc2;

    .line 208
    .line 209
    iget-object v0, v0, Ldc2;->j:Lfc2;

    .line 210
    .line 211
    if-eqz v0, :cond_6

    .line 212
    .line 213
    invoke-interface {v0, v1}, Lfc2;->b(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    :cond_6
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    :pswitch_4
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Ll62;

    .line 225
    .line 226
    check-cast v1, Lrd0;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ll62;->a(Lrd0;)V

    .line 229
    .line 230
    .line 231
    sget-object v0, La83;->a:La83;

    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_5
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Li62;

    .line 237
    .line 238
    check-cast v1, Ljava/lang/Throwable;

    .line 239
    .line 240
    const-string v2, "Recomposer effect job completed"

    .line 241
    .line 242
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 243
    .line 244
    invoke-direct {v3, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 248
    .line 249
    .line 250
    iget-object v2, v0, Li62;->c:Ljava/lang/Object;

    .line 251
    .line 252
    monitor-enter v2

    .line 253
    :try_start_0
    iget-object v4, v0, Li62;->d:Lk21;

    .line 254
    .line 255
    if-eqz v4, :cond_7

    .line 256
    .line 257
    iget-object v5, v0, Li62;->u:Lju2;

    .line 258
    .line 259
    sget-object v8, Lf62;->i:Lf62;

    .line 260
    .line 261
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v6, v8}, Lju2;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    invoke-interface {v4, v3}, Lk21;->c(Ljava/util/concurrent/CancellationException;)V

    .line 268
    .line 269
    .line 270
    iput-object v6, v0, Li62;->r:Lmp;

    .line 271
    .line 272
    new-instance v3, Ld62;

    .line 273
    .line 274
    invoke-direct {v3, v7, v0, v1}, Ld62;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v4, v3}, Lk21;->t(Lin0;)Lca0;

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :catchall_0
    move-exception v0

    .line 282
    goto :goto_2

    .line 283
    :cond_7
    iput-object v3, v0, Li62;->e:Ljava/lang/Throwable;

    .line 284
    .line 285
    iget-object v0, v0, Li62;->u:Lju2;

    .line 286
    .line 287
    sget-object v1, Lf62;->h:Lf62;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v6, v1}, Lju2;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    .line 294
    .line 295
    :goto_1
    monitor-exit v2

    .line 296
    sget-object v0, La83;->a:La83;

    .line 297
    .line 298
    return-object v0

    .line 299
    :goto_2
    monitor-exit v2

    .line 300
    throw v0

    .line 301
    :pswitch_6
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v0, Lfy;

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Lfy;->y(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    sget-object v0, La83;->a:La83;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_7
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v0, Lo72;

    .line 314
    .line 315
    check-cast v1, Ld43;

    .line 316
    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    check-cast v1, Lf43;

    .line 321
    .line 322
    iget-object v1, v1, Lf43;->v:Lj81;

    .line 323
    .line 324
    iget-object v2, v0, Lo72;->i:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v2, Ljava/util/List;

    .line 327
    .line 328
    if-eqz v2, :cond_8

    .line 329
    .line 330
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    goto :goto_3

    .line 334
    :cond_8
    filled-new-array {v1}, [Lj81;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-static {v1}, Leu;->R([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    :goto_3
    iput-object v2, v0, Lo72;->i:Ljava/lang/Object;

    .line 343
    .line 344
    sget-object v0, Lc43;->i:Lc43;

    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_8
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Lyo2;

    .line 350
    .line 351
    check-cast v1, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    new-instance v2, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-interface {v0, v1}, Lyo2;->e(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    const-string v3, ": "

    .line 370
    .line 371
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-interface {v0, v1}, Lyo2;->j(I)Lyo2;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-interface {v0}, Lyo2;->b()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    return-object v0

    .line 390
    :pswitch_9
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v0, Landroid/view/View;

    .line 393
    .line 394
    check-cast v1, Lba0;

    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    :goto_4
    instance-of v2, v1, Landroid/app/Activity;

    .line 407
    .line 408
    if-eqz v2, :cond_9

    .line 409
    .line 410
    check-cast v1, Landroid/app/Activity;

    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_9
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 414
    .line 415
    if-eqz v2, :cond_a

    .line 416
    .line 417
    check-cast v1, Landroid/content/ContextWrapper;

    .line 418
    .line 419
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    goto :goto_4

    .line 427
    :cond_a
    move-object v1, v6

    .line 428
    :goto_5
    if-eqz v1, :cond_b

    .line 429
    .line 430
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    :cond_b
    const/4 v1, 0x2

    .line 435
    if-nez v6, :cond_c

    .line 436
    .line 437
    new-instance v0, Lka;

    .line 438
    .line 439
    invoke-direct {v0, v1}, Lka;-><init>(I)V

    .line 440
    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_c
    new-instance v2, Lmb3;

    .line 444
    .line 445
    invoke-direct {v2, v6, v0}, Lmb3;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 446
    .line 447
    .line 448
    iget-object v0, v2, Lmb3;->a:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, Ldf3;

    .line 451
    .line 452
    invoke-virtual {v0}, Ldf3;->a()I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    invoke-static {v6, v7}, Lrd3;->a(Landroid/view/Window;Z)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v1}, Ldf3;->d(I)V

    .line 460
    .line 461
    .line 462
    iget v5, v0, Ldf3;->a:I

    .line 463
    .line 464
    const/16 v7, 0x207

    .line 465
    .line 466
    packed-switch v5, :pswitch_data_1

    .line 467
    .line 468
    .line 469
    iget-object v0, v0, Ldf3;->c:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v0, Landroid/view/WindowInsetsController;

    .line 472
    .line 473
    invoke-static {v0, v7}, Lce3;->s(Landroid/view/WindowInsetsController;I)V

    .line 474
    .line 475
    .line 476
    goto :goto_8

    .line 477
    :pswitch_a
    move v5, v8

    .line 478
    :goto_6
    const/16 v9, 0x200

    .line 479
    .line 480
    if-gt v5, v9, :cond_11

    .line 481
    .line 482
    and-int v9, v7, v5

    .line 483
    .line 484
    if-nez v9, :cond_d

    .line 485
    .line 486
    goto :goto_7

    .line 487
    :cond_d
    if-eq v5, v8, :cond_10

    .line 488
    .line 489
    if-eq v5, v1, :cond_f

    .line 490
    .line 491
    if-eq v5, v3, :cond_e

    .line 492
    .line 493
    goto :goto_7

    .line 494
    :cond_e
    iget-object v9, v0, Ldf3;->c:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v9, Lhh1;

    .line 497
    .line 498
    iget-object v9, v9, Lhh1;->i:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v9, Lhh1;

    .line 501
    .line 502
    invoke-virtual {v9}, Lhh1;->A()V

    .line 503
    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_f
    invoke-virtual {v0, v1}, Ldf3;->e(I)V

    .line 507
    .line 508
    .line 509
    goto :goto_7

    .line 510
    :cond_10
    const/4 v9, 0x4

    .line 511
    invoke-virtual {v0, v9}, Ldf3;->e(I)V

    .line 512
    .line 513
    .line 514
    :goto_7
    shl-int/lit8 v5, v5, 0x1

    .line 515
    .line 516
    goto :goto_6

    .line 517
    :cond_11
    :goto_8
    new-instance v0, Lxp1;

    .line 518
    .line 519
    invoke-direct {v0, v2, v4, v6}, Lxp1;-><init>(Lmb3;ILandroid/view/Window;)V

    .line 520
    .line 521
    .line 522
    :goto_9
    return-object v0

    .line 523
    :pswitch_b
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v0, [Lvj;

    .line 526
    .line 527
    check-cast v1, Ljg3;

    .line 528
    .line 529
    sget-object v2, La83;->a:La83;

    .line 530
    .line 531
    const-string v3, "[NukeCore]"

    .line 532
    .line 533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1}, Ljg3;->a()[Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    aget-object v1, v1, v7

    .line 541
    .line 542
    check-cast v1, Landroid/content/Context;

    .line 543
    .line 544
    if-nez v1, :cond_12

    .line 545
    .line 546
    goto/16 :goto_c

    .line 547
    .line 548
    :cond_12
    sget-object v5, Lpp1;->a:Lpp1;

    .line 549
    .line 550
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    if-nez v5, :cond_13

    .line 555
    .line 556
    move-object v5, v1

    .line 557
    :cond_13
    sput-object v5, Lup0;->i:Landroid/content/Context;

    .line 558
    .line 559
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    sput-object v1, Lup0;->j:Ljava/lang/ClassLoader;

    .line 567
    .line 568
    sget-object v1, Lpp1;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 569
    .line 570
    invoke-virtual {v1, v7, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-nez v1, :cond_14

    .line 575
    .line 576
    goto :goto_c

    .line 577
    :cond_14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 578
    .line 579
    .line 580
    :try_start_1
    invoke-static {}, Lpp1;->d()Lvu0;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    invoke-static {v1}, Lte;->S(Lvu0;)Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    invoke-static {v0, v1}, Lop0;->p([Lvj;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 589
    .line 590
    .line 591
    move-object v1, v2

    .line 592
    goto :goto_a

    .line 593
    :catchall_1
    move-exception v0

    .line 594
    new-instance v1, Lx92;

    .line 595
    .line 596
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 597
    .line 598
    .line 599
    :goto_a
    invoke-static {v1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    if-eqz v0, :cond_16

    .line 604
    .line 605
    const-string v1, "NukeCore"

    .line 606
    .line 607
    sget-object v5, Lup0;->m:Ljava/lang/String;

    .line 608
    .line 609
    if-eqz v5, :cond_15

    .line 610
    .line 611
    invoke-static {v0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    new-instance v6, Ljava/lang/StringBuilder;

    .line 616
    .line 617
    const-string v7, "Secondary process hook installation failed in "

    .line 618
    .line 619
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    const-string v5, ": "

    .line 626
    .line 627
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 642
    .line 643
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 654
    .line 655
    .line 656
    move-object v3, v2

    .line 657
    goto :goto_b

    .line 658
    :catchall_2
    move-exception v0

    .line 659
    new-instance v3, Lx92;

    .line 660
    .line 661
    invoke-direct {v3, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 662
    .line 663
    .line 664
    :goto_b
    instance-of v0, v3, Lx92;

    .line 665
    .line 666
    if-eqz v0, :cond_16

    .line 667
    .line 668
    invoke-static {v4, v1, v5}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 669
    .line 670
    .line 671
    goto :goto_c

    .line 672
    :cond_15
    const-string v0, "hostProcess"

    .line 673
    .line 674
    invoke-static {v0}, Lt11;->S(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    throw v6

    .line 678
    :cond_16
    :goto_c
    return-object v2

    .line 679
    :pswitch_c
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v0, Lkl1;

    .line 682
    .line 683
    check-cast v1, Ljava/lang/Throwable;

    .line 684
    .line 685
    invoke-virtual {v0, v6}, Lkl1;->f(Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    sget-object v0, La83;->a:La83;

    .line 689
    .line 690
    return-object v0

    .line 691
    :pswitch_d
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v0, Lcf1;

    .line 694
    .line 695
    check-cast v1, Ljava/lang/Integer;

    .line 696
    .line 697
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    invoke-virtual {v0, v1}, Lcf1;->b(I)Laf1;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    return-object v0

    .line 706
    :pswitch_e
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast v0, Lfc2;

    .line 709
    .line 710
    if-eqz v0, :cond_17

    .line 711
    .line 712
    invoke-interface {v0, v1}, Lfc2;->b(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    :cond_17
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    return-object v0

    .line 721
    :pswitch_f
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v0, Ld91;

    .line 724
    .line 725
    check-cast v1, Ljava/lang/Float;

    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    neg-float v1, v1

    .line 732
    cmpg-float v2, v1, v5

    .line 733
    .line 734
    if-gez v2, :cond_18

    .line 735
    .line 736
    invoke-virtual {v0}, Ld91;->c()Z

    .line 737
    .line 738
    .line 739
    move-result v2

    .line 740
    if-eqz v2, :cond_21

    .line 741
    .line 742
    :cond_18
    cmpl-float v2, v1, v5

    .line 743
    .line 744
    if-lez v2, :cond_19

    .line 745
    .line 746
    invoke-virtual {v0}, Ld91;->a()Z

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    if-nez v2, :cond_19

    .line 751
    .line 752
    goto/16 :goto_10

    .line 753
    .line 754
    :cond_19
    iget v2, v0, Ld91;->h:F

    .line 755
    .line 756
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 757
    .line 758
    .line 759
    move-result v2

    .line 760
    const/high16 v3, 0x3f000000    # 0.5f

    .line 761
    .line 762
    cmpg-float v2, v2, v3

    .line 763
    .line 764
    if-gtz v2, :cond_1a

    .line 765
    .line 766
    goto :goto_d

    .line 767
    :cond_1a
    const-string v2, "entered drag with non-zero pending scroll"

    .line 768
    .line 769
    invoke-static {v2}, Lnz0;->c(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    :goto_d
    iput-boolean v8, v0, Ld91;->d:Z

    .line 773
    .line 774
    iget v2, v0, Ld91;->h:F

    .line 775
    .line 776
    add-float/2addr v2, v1

    .line 777
    iput v2, v0, Ld91;->h:F

    .line 778
    .line 779
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 780
    .line 781
    .line 782
    move-result v2

    .line 783
    cmpl-float v2, v2, v3

    .line 784
    .line 785
    if-lez v2, :cond_1f

    .line 786
    .line 787
    iget v2, v0, Ld91;->h:F

    .line 788
    .line 789
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 790
    .line 791
    .line 792
    move-result v4

    .line 793
    iget-object v7, v0, Ld91;->f:Lnx1;

    .line 794
    .line 795
    invoke-virtual {v7}, Lnx1;->getValue()Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v7

    .line 799
    check-cast v7, Lx81;

    .line 800
    .line 801
    iget-boolean v9, v0, Ld91;->b:Z

    .line 802
    .line 803
    xor-int/2addr v9, v8

    .line 804
    invoke-virtual {v7, v4, v9}, Lx81;->f(IZ)Lx81;

    .line 805
    .line 806
    .line 807
    move-result-object v7

    .line 808
    if-eqz v7, :cond_1b

    .line 809
    .line 810
    iget-object v9, v0, Ld91;->c:Lx81;

    .line 811
    .line 812
    if-eqz v9, :cond_1b

    .line 813
    .line 814
    invoke-virtual {v9, v4, v8}, Lx81;->f(IZ)Lx81;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    if-eqz v4, :cond_1c

    .line 819
    .line 820
    iput-object v4, v0, Ld91;->c:Lx81;

    .line 821
    .line 822
    :cond_1b
    move-object v6, v7

    .line 823
    :cond_1c
    if-eqz v6, :cond_1d

    .line 824
    .line 825
    iget-boolean v4, v0, Ld91;->b:Z

    .line 826
    .line 827
    invoke-virtual {v0, v6, v4, v8}, Ld91;->f(Lx81;ZZ)V

    .line 828
    .line 829
    .line 830
    iget-object v4, v0, Ld91;->v:Lxk1;

    .line 831
    .line 832
    sget-object v7, La83;->a:La83;

    .line 833
    .line 834
    invoke-interface {v4, v7}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    iget v4, v0, Ld91;->h:F

    .line 838
    .line 839
    sub-float/2addr v2, v4

    .line 840
    invoke-virtual {v0, v2, v6}, Ld91;->h(FLx81;)V

    .line 841
    .line 842
    .line 843
    goto :goto_e

    .line 844
    :cond_1d
    iget-object v4, v0, Ld91;->k:Lr61;

    .line 845
    .line 846
    if-eqz v4, :cond_1e

    .line 847
    .line 848
    invoke-virtual {v4}, Lr61;->k()V

    .line 849
    .line 850
    .line 851
    :cond_1e
    iget v4, v0, Ld91;->h:F

    .line 852
    .line 853
    sub-float/2addr v2, v4

    .line 854
    invoke-virtual {v0}, Ld91;->g()Lx81;

    .line 855
    .line 856
    .line 857
    move-result-object v4

    .line 858
    invoke-virtual {v0, v2, v4}, Ld91;->h(FLx81;)V

    .line 859
    .line 860
    .line 861
    :cond_1f
    :goto_e
    iget v2, v0, Ld91;->h:F

    .line 862
    .line 863
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    cmpg-float v2, v2, v3

    .line 868
    .line 869
    if-gtz v2, :cond_20

    .line 870
    .line 871
    :goto_f
    move v5, v1

    .line 872
    goto :goto_10

    .line 873
    :cond_20
    iget v2, v0, Ld91;->h:F

    .line 874
    .line 875
    sub-float/2addr v1, v2

    .line 876
    iput v5, v0, Ld91;->h:F

    .line 877
    .line 878
    goto :goto_f

    .line 879
    :cond_21
    :goto_10
    neg-float v0, v5

    .line 880
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    return-object v0

    .line 885
    :pswitch_10
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast v1, Ljava/lang/Integer;

    .line 888
    .line 889
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    return-object v0

    .line 893
    :pswitch_11
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast v0, Le81;

    .line 896
    .line 897
    check-cast v1, Lba0;

    .line 898
    .line 899
    new-instance v1, Lf8;

    .line 900
    .line 901
    invoke-direct {v1, v3, v0}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 902
    .line 903
    .line 904
    return-object v1

    .line 905
    :pswitch_12
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Ly71;

    .line 908
    .line 909
    check-cast v1, Lba0;

    .line 910
    .line 911
    new-instance v1, Lf8;

    .line 912
    .line 913
    invoke-direct {v1, v4, v0}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    return-object v1

    .line 917
    :pswitch_13
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, Lyl0;

    .line 920
    .line 921
    check-cast v1, Ll63;

    .line 922
    .line 923
    iget-object v4, v1, Ll63;->b:Lim0;

    .line 924
    .line 925
    iget v5, v1, Ll63;->c:I

    .line 926
    .line 927
    iget v6, v1, Ll63;->d:I

    .line 928
    .line 929
    iget-object v7, v1, Ll63;->e:Ljava/lang/Object;

    .line 930
    .line 931
    new-instance v2, Ll63;

    .line 932
    .line 933
    const/4 v3, 0x0

    .line 934
    invoke-direct/range {v2 .. v7}, Ll63;-><init>(Lmx2;Lim0;IILjava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v0, v2}, Lyl0;->a(Ll63;)Lm63;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    iget-object v0, v0, Lm63;->h:Ljava/lang/Object;

    .line 942
    .line 943
    return-object v0

    .line 944
    :pswitch_14
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v0, Lrd0;

    .line 947
    .line 948
    check-cast v1, Lrd0;

    .line 949
    .line 950
    if-ne v0, v1, :cond_22

    .line 951
    .line 952
    const-string v0, " > "

    .line 953
    .line 954
    goto :goto_11

    .line 955
    :cond_22
    const-string v0, "   "

    .line 956
    .line 957
    :goto_11
    const-string v2, ", newCursorPosition="

    .line 958
    .line 959
    instance-of v3, v1, Lev;

    .line 960
    .line 961
    const/16 v4, 0x29

    .line 962
    .line 963
    if-eqz v3, :cond_23

    .line 964
    .line 965
    new-instance v3, Ljava/lang/StringBuilder;

    .line 966
    .line 967
    const-string v5, "CommitTextCommand(text.length="

    .line 968
    .line 969
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 970
    .line 971
    .line 972
    check-cast v1, Lev;

    .line 973
    .line 974
    iget-object v5, v1, Lev;->a:Lsd;

    .line 975
    .line 976
    iget-object v5, v5, Lsd;->i:Ljava/lang/String;

    .line 977
    .line 978
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 979
    .line 980
    .line 981
    move-result v5

    .line 982
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 986
    .line 987
    .line 988
    iget v1, v1, Lev;->b:I

    .line 989
    .line 990
    :goto_12
    invoke-static {v3, v1, v4}, Lvi0;->m(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    goto/16 :goto_13

    .line 995
    .line 996
    :cond_23
    instance-of v3, v1, Llp2;

    .line 997
    .line 998
    if-eqz v3, :cond_24

    .line 999
    .line 1000
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    const-string v5, "SetComposingTextCommand(text.length="

    .line 1003
    .line 1004
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    check-cast v1, Llp2;

    .line 1008
    .line 1009
    iget-object v5, v1, Llp2;->a:Lsd;

    .line 1010
    .line 1011
    iget-object v5, v5, Lsd;->i:Ljava/lang/String;

    .line 1012
    .line 1013
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1014
    .line 1015
    .line 1016
    move-result v5

    .line 1017
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    .line 1023
    iget v1, v1, Llp2;->b:I

    .line 1024
    .line 1025
    goto :goto_12

    .line 1026
    :cond_24
    instance-of v2, v1, Lkp2;

    .line 1027
    .line 1028
    if-eqz v2, :cond_25

    .line 1029
    .line 1030
    check-cast v1, Lkp2;

    .line 1031
    .line 1032
    invoke-virtual {v1}, Lkp2;->toString()Ljava/lang/String;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    goto :goto_13

    .line 1037
    :cond_25
    instance-of v2, v1, Lz60;

    .line 1038
    .line 1039
    if-eqz v2, :cond_26

    .line 1040
    .line 1041
    check-cast v1, Lz60;

    .line 1042
    .line 1043
    invoke-virtual {v1}, Lz60;->toString()Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v1

    .line 1047
    goto :goto_13

    .line 1048
    :cond_26
    instance-of v2, v1, La70;

    .line 1049
    .line 1050
    if-eqz v2, :cond_27

    .line 1051
    .line 1052
    check-cast v1, La70;

    .line 1053
    .line 1054
    invoke-virtual {v1}, La70;->toString()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    goto :goto_13

    .line 1059
    :cond_27
    instance-of v2, v1, Lmp2;

    .line 1060
    .line 1061
    if-eqz v2, :cond_28

    .line 1062
    .line 1063
    check-cast v1, Lmp2;

    .line 1064
    .line 1065
    invoke-virtual {v1}, Lmp2;->toString()Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    goto :goto_13

    .line 1070
    :cond_28
    instance-of v2, v1, Lej0;

    .line 1071
    .line 1072
    if-eqz v2, :cond_29

    .line 1073
    .line 1074
    const-string v1, "FinishComposingTextCommand()"

    .line 1075
    .line 1076
    goto :goto_13

    .line 1077
    :cond_29
    instance-of v2, v1, Ly60;

    .line 1078
    .line 1079
    if-eqz v2, :cond_2a

    .line 1080
    .line 1081
    const-string v1, "DeleteAllCommand()"

    .line 1082
    .line 1083
    goto :goto_13

    .line 1084
    :cond_2a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v1

    .line 1088
    invoke-static {v1}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v1

    .line 1092
    invoke-virtual {v1}, Lbt;->c()Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    if-nez v1, :cond_2b

    .line 1097
    .line 1098
    const-string v1, "{anonymous EditCommand}"

    .line 1099
    .line 1100
    :cond_2b
    const-string v2, "Unknown EditCommand: "

    .line 1101
    .line 1102
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    :goto_13
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    return-object v0

    .line 1111
    :pswitch_15
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v0, Ldd1;

    .line 1114
    .line 1115
    check-cast v1, Lo12;

    .line 1116
    .line 1117
    invoke-virtual {v0}, Ldd1;->a()Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    sget-object v0, La83;->a:La83;

    .line 1121
    .line 1122
    return-object v0

    .line 1123
    :pswitch_16
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 1124
    .line 1125
    check-cast v0, [Ljava/lang/Object;

    .line 1126
    .line 1127
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 1128
    .line 1129
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    array-length v1, v1

    .line 1134
    array-length v0, v0

    .line 1135
    if-ne v1, v0, :cond_2c

    .line 1136
    .line 1137
    move v7, v8

    .line 1138
    :cond_2c
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    return-object v0

    .line 1143
    :pswitch_17
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 1144
    .line 1145
    check-cast v0, Lql;

    .line 1146
    .line 1147
    check-cast v1, Lqo;

    .line 1148
    .line 1149
    iget v2, v0, Lql;->y:F

    .line 1150
    .line 1151
    invoke-virtual {v1}, Lqo;->b()F

    .line 1152
    .line 1153
    .line 1154
    move-result v3

    .line 1155
    mul-float/2addr v3, v2

    .line 1156
    cmpl-float v2, v3, v5

    .line 1157
    .line 1158
    if-ltz v2, :cond_4a

    .line 1159
    .line 1160
    iget-object v2, v1, Lqo;->h:Lrn;

    .line 1161
    .line 1162
    invoke-interface {v2}, Lrn;->d()J

    .line 1163
    .line 1164
    .line 1165
    move-result-wide v2

    .line 1166
    invoke-static {v2, v3}, Lgr2;->b(J)F

    .line 1167
    .line 1168
    .line 1169
    move-result v2

    .line 1170
    cmpl-float v2, v2, v5

    .line 1171
    .line 1172
    if-lez v2, :cond_4a

    .line 1173
    .line 1174
    iget v2, v0, Lql;->y:F

    .line 1175
    .line 1176
    invoke-static {v2, v5}, Lza0;->b(FF)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v2

    .line 1180
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1181
    .line 1182
    if-eqz v2, :cond_2d

    .line 1183
    .line 1184
    move v2, v3

    .line 1185
    goto :goto_14

    .line 1186
    :cond_2d
    iget v2, v0, Lql;->y:F

    .line 1187
    .line 1188
    invoke-virtual {v1}, Lqo;->b()F

    .line 1189
    .line 1190
    .line 1191
    move-result v5

    .line 1192
    mul-float/2addr v5, v2

    .line 1193
    float-to-double v9, v5

    .line 1194
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 1195
    .line 1196
    .line 1197
    move-result-wide v9

    .line 1198
    double-to-float v2, v9

    .line 1199
    :goto_14
    iget-object v5, v1, Lqo;->h:Lrn;

    .line 1200
    .line 1201
    invoke-interface {v5}, Lrn;->d()J

    .line 1202
    .line 1203
    .line 1204
    move-result-wide v9

    .line 1205
    invoke-static {v9, v10}, Lgr2;->b(J)F

    .line 1206
    .line 1207
    .line 1208
    move-result v5

    .line 1209
    const/high16 v9, 0x40000000    # 2.0f

    .line 1210
    .line 1211
    div-float/2addr v5, v9

    .line 1212
    float-to-double v10, v5

    .line 1213
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 1214
    .line 1215
    .line 1216
    move-result-wide v10

    .line 1217
    double-to-float v5, v10

    .line 1218
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 1219
    .line 1220
    .line 1221
    move-result v11

    .line 1222
    div-float v2, v11, v9

    .line 1223
    .line 1224
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1225
    .line 1226
    .line 1227
    move-result v5

    .line 1228
    int-to-long v12, v5

    .line 1229
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1230
    .line 1231
    .line 1232
    move-result v5

    .line 1233
    int-to-long v14, v5

    .line 1234
    const/16 v5, 0x20

    .line 1235
    .line 1236
    shl-long/2addr v12, v5

    .line 1237
    const-wide v16, 0xffffffffL

    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    and-long v14, v14, v16

    .line 1243
    .line 1244
    or-long v18, v12, v14

    .line 1245
    .line 1246
    iget-object v10, v1, Lqo;->h:Lrn;

    .line 1247
    .line 1248
    invoke-interface {v10}, Lrn;->d()J

    .line 1249
    .line 1250
    .line 1251
    move-result-wide v12

    .line 1252
    shr-long/2addr v12, v5

    .line 1253
    long-to-int v10, v12

    .line 1254
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1255
    .line 1256
    .line 1257
    move-result v10

    .line 1258
    sub-float/2addr v10, v11

    .line 1259
    iget-object v12, v1, Lqo;->h:Lrn;

    .line 1260
    .line 1261
    invoke-interface {v12}, Lrn;->d()J

    .line 1262
    .line 1263
    .line 1264
    move-result-wide v12

    .line 1265
    and-long v12, v12, v16

    .line 1266
    .line 1267
    long-to-int v12, v12

    .line 1268
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1269
    .line 1270
    .line 1271
    move-result v12

    .line 1272
    sub-float/2addr v12, v11

    .line 1273
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1274
    .line 1275
    .line 1276
    move-result v10

    .line 1277
    int-to-long v13, v10

    .line 1278
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1279
    .line 1280
    .line 1281
    move-result v10

    .line 1282
    move/from16 p0, v5

    .line 1283
    .line 1284
    int-to-long v5, v10

    .line 1285
    shl-long v13, v13, p0

    .line 1286
    .line 1287
    and-long v5, v5, v16

    .line 1288
    .line 1289
    or-long/2addr v5, v13

    .line 1290
    mul-float v21, v11, v9

    .line 1291
    .line 1292
    iget-object v9, v1, Lqo;->h:Lrn;

    .line 1293
    .line 1294
    invoke-interface {v9}, Lrn;->d()J

    .line 1295
    .line 1296
    .line 1297
    move-result-wide v9

    .line 1298
    invoke-static {v9, v10}, Lgr2;->b(J)F

    .line 1299
    .line 1300
    .line 1301
    move-result v9

    .line 1302
    cmpl-float v9, v21, v9

    .line 1303
    .line 1304
    if-lez v9, :cond_2e

    .line 1305
    .line 1306
    move v9, v8

    .line 1307
    goto :goto_15

    .line 1308
    :cond_2e
    move v9, v7

    .line 1309
    :goto_15
    iget-object v10, v0, Lql;->A:Leq2;

    .line 1310
    .line 1311
    iget-object v13, v1, Lqo;->h:Lrn;

    .line 1312
    .line 1313
    invoke-interface {v13}, Lrn;->d()J

    .line 1314
    .line 1315
    .line 1316
    move-result-wide v13

    .line 1317
    iget-object v15, v1, Lqo;->h:Lrn;

    .line 1318
    .line 1319
    invoke-interface {v15}, Lrn;->getLayoutDirection()Ld61;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v15

    .line 1323
    invoke-interface {v10, v13, v14, v15, v1}, Leq2;->a(JLd61;Le70;)Lte;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v10

    .line 1327
    instance-of v13, v10, Lsv1;

    .line 1328
    .line 1329
    if-eqz v13, :cond_40

    .line 1330
    .line 1331
    iget-object v2, v0, Lql;->z:Lft2;

    .line 1332
    .line 1333
    check-cast v10, Lsv1;

    .line 1334
    .line 1335
    iget-object v4, v10, Lsv1;->j:Ly9;

    .line 1336
    .line 1337
    if-eqz v9, :cond_2f

    .line 1338
    .line 1339
    new-instance v0, Ld2;

    .line 1340
    .line 1341
    const/4 v3, 0x7

    .line 1342
    invoke-direct {v0, v3, v10, v2}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v1, v0}, Lqo;->a(Lin0;)Ln4;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v6

    .line 1349
    goto/16 :goto_25

    .line 1350
    .line 1351
    :cond_2f
    if-eqz v2, :cond_30

    .line 1352
    .line 1353
    iget-wide v5, v2, Lft2;->a:J

    .line 1354
    .line 1355
    invoke-static {v3, v5, v6}, Lju;->b(FJ)J

    .line 1356
    .line 1357
    .line 1358
    move-result-wide v5

    .line 1359
    new-instance v9, Lcl;

    .line 1360
    .line 1361
    const/4 v11, 0x5

    .line 1362
    invoke-direct {v9, v5, v6, v11}, Lcl;-><init>(JI)V

    .line 1363
    .line 1364
    .line 1365
    move v5, v8

    .line 1366
    goto :goto_16

    .line 1367
    :cond_30
    move v5, v7

    .line 1368
    const/4 v9, 0x0

    .line 1369
    :goto_16
    invoke-virtual {v4}, Ly9;->d()Lo62;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v6

    .line 1373
    iget v11, v6, Lo62;->b:F

    .line 1374
    .line 1375
    iget v13, v6, Lo62;->a:F

    .line 1376
    .line 1377
    iget-object v14, v0, Lql;->x:Lml;

    .line 1378
    .line 1379
    if-nez v14, :cond_31

    .line 1380
    .line 1381
    new-instance v14, Lml;

    .line 1382
    .line 1383
    invoke-direct {v14}, Lml;-><init>()V

    .line 1384
    .line 1385
    .line 1386
    iput-object v14, v0, Lql;->x:Lml;

    .line 1387
    .line 1388
    :cond_31
    iget-object v14, v0, Lql;->x:Lml;

    .line 1389
    .line 1390
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1391
    .line 1392
    .line 1393
    iget-object v15, v14, Lml;->d:Ly9;

    .line 1394
    .line 1395
    if-nez v15, :cond_32

    .line 1396
    .line 1397
    invoke-static {}, Laa;->a()Ly9;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v15

    .line 1401
    iput-object v15, v14, Lml;->d:Ly9;

    .line 1402
    .line 1403
    :cond_32
    invoke-virtual {v15}, Ly9;->g()V

    .line 1404
    .line 1405
    .line 1406
    sget-object v14, Lux1;->h:Lux1;

    .line 1407
    .line 1408
    move/from16 p1, v3

    .line 1409
    .line 1410
    iget v3, v6, Lo62;->a:F

    .line 1411
    .line 1412
    iget v8, v6, Lo62;->d:F

    .line 1413
    .line 1414
    iget v12, v6, Lo62;->c:F

    .line 1415
    .line 1416
    iget v7, v6, Lo62;->b:F

    .line 1417
    .line 1418
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v18

    .line 1422
    if-nez v18, :cond_34

    .line 1423
    .line 1424
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 1425
    .line 1426
    .line 1427
    move-result v18

    .line 1428
    if-nez v18, :cond_34

    .line 1429
    .line 1430
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 1431
    .line 1432
    .line 1433
    move-result v18

    .line 1434
    if-nez v18, :cond_34

    .line 1435
    .line 1436
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 1437
    .line 1438
    .line 1439
    move-result v18

    .line 1440
    if-eqz v18, :cond_33

    .line 1441
    .line 1442
    goto :goto_18

    .line 1443
    :cond_33
    :goto_17
    move-object/from16 v18, v2

    .line 1444
    .line 1445
    goto :goto_19

    .line 1446
    :cond_34
    :goto_18
    const-string v18, "Invalid rectangle, make sure no value is NaN"

    .line 1447
    .line 1448
    invoke-static/range {v18 .. v18}, Laa;->c(Ljava/lang/String;)V

    .line 1449
    .line 1450
    .line 1451
    goto :goto_17

    .line 1452
    :goto_19
    iget-object v2, v15, Ly9;->b:Landroid/graphics/RectF;

    .line 1453
    .line 1454
    if-nez v2, :cond_35

    .line 1455
    .line 1456
    new-instance v2, Landroid/graphics/RectF;

    .line 1457
    .line 1458
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 1459
    .line 1460
    .line 1461
    iput-object v2, v15, Ly9;->b:Landroid/graphics/RectF;

    .line 1462
    .line 1463
    :cond_35
    iget-object v2, v15, Ly9;->b:Landroid/graphics/RectF;

    .line 1464
    .line 1465
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v2, v3, v7, v12, v8}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1469
    .line 1470
    .line 1471
    iget-object v2, v15, Ly9;->a:Landroid/graphics/Path;

    .line 1472
    .line 1473
    iget-object v3, v15, Ly9;->b:Landroid/graphics/RectF;

    .line 1474
    .line 1475
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1476
    .line 1477
    .line 1478
    invoke-static {v14}, Laa;->b(Lux1;)Landroid/graphics/Path$Direction;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v7

    .line 1482
    invoke-virtual {v2, v3, v7}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 1483
    .line 1484
    .line 1485
    const/4 v2, 0x0

    .line 1486
    invoke-virtual {v15, v15, v4, v2}, Ly9;->f(Ly9;Ly9;I)Z

    .line 1487
    .line 1488
    .line 1489
    new-instance v2, Lo72;

    .line 1490
    .line 1491
    invoke-direct {v2}, Lo72;-><init>()V

    .line 1492
    .line 1493
    .line 1494
    iget v3, v6, Lo62;->c:F

    .line 1495
    .line 1496
    sub-float/2addr v3, v13

    .line 1497
    float-to-double v3, v3

    .line 1498
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 1499
    .line 1500
    .line 1501
    move-result-wide v3

    .line 1502
    double-to-float v3, v3

    .line 1503
    float-to-int v3, v3

    .line 1504
    iget v4, v6, Lo62;->d:F

    .line 1505
    .line 1506
    sub-float/2addr v4, v11

    .line 1507
    float-to-double v7, v4

    .line 1508
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 1509
    .line 1510
    .line 1511
    move-result-wide v7

    .line 1512
    double-to-float v4, v7

    .line 1513
    float-to-int v4, v4

    .line 1514
    int-to-long v7, v3

    .line 1515
    shl-long v7, v7, p0

    .line 1516
    .line 1517
    int-to-long v3, v4

    .line 1518
    and-long v3, v3, v16

    .line 1519
    .line 1520
    or-long/2addr v3, v7

    .line 1521
    iget-object v0, v0, Lql;->x:Lml;

    .line 1522
    .line 1523
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1524
    .line 1525
    .line 1526
    iget-object v7, v0, Lml;->a:Ld9;

    .line 1527
    .line 1528
    iget-object v8, v0, Lml;->b:Lf6;

    .line 1529
    .line 1530
    if-eqz v7, :cond_36

    .line 1531
    .line 1532
    invoke-virtual {v7}, Ld9;->a()I

    .line 1533
    .line 1534
    .line 1535
    move-result v12

    .line 1536
    new-instance v14, Lix0;

    .line 1537
    .line 1538
    invoke-direct {v14, v12}, Lix0;-><init>(I)V

    .line 1539
    .line 1540
    .line 1541
    goto :goto_1a

    .line 1542
    :cond_36
    const/4 v14, 0x0

    .line 1543
    :goto_1a
    if-nez v14, :cond_37

    .line 1544
    .line 1545
    goto :goto_1b

    .line 1546
    :cond_37
    iget v12, v14, Lix0;->a:I

    .line 1547
    .line 1548
    if-nez v12, :cond_38

    .line 1549
    .line 1550
    goto :goto_1e

    .line 1551
    :cond_38
    :goto_1b
    if-eqz v7, :cond_39

    .line 1552
    .line 1553
    invoke-virtual {v7}, Ld9;->a()I

    .line 1554
    .line 1555
    .line 1556
    move-result v12

    .line 1557
    new-instance v14, Lix0;

    .line 1558
    .line 1559
    invoke-direct {v14, v12}, Lix0;-><init>(I)V

    .line 1560
    .line 1561
    .line 1562
    goto :goto_1c

    .line 1563
    :cond_39
    const/4 v14, 0x0

    .line 1564
    :goto_1c
    if-nez v14, :cond_3a

    .line 1565
    .line 1566
    goto :goto_1d

    .line 1567
    :cond_3a
    iget v12, v14, Lix0;->a:I

    .line 1568
    .line 1569
    if-eq v5, v12, :cond_3b

    .line 1570
    .line 1571
    :goto_1d
    const/16 v20, 0x0

    .line 1572
    .line 1573
    goto :goto_1f

    .line 1574
    :cond_3b
    :goto_1e
    const/16 v20, 0x1

    .line 1575
    .line 1576
    :goto_1f
    if-eqz v7, :cond_3c

    .line 1577
    .line 1578
    if-eqz v8, :cond_3c

    .line 1579
    .line 1580
    iget-object v12, v1, Lqo;->h:Lrn;

    .line 1581
    .line 1582
    invoke-interface {v12}, Lrn;->d()J

    .line 1583
    .line 1584
    .line 1585
    move-result-wide v22

    .line 1586
    move-wide/from16 v28, v3

    .line 1587
    .line 1588
    shr-long v3, v22, p0

    .line 1589
    .line 1590
    long-to-int v3, v3

    .line 1591
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1592
    .line 1593
    .line 1594
    move-result v3

    .line 1595
    iget-object v4, v7, Ld9;->a:Landroid/graphics/Bitmap;

    .line 1596
    .line 1597
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1598
    .line 1599
    .line 1600
    move-result v12

    .line 1601
    int-to-float v12, v12

    .line 1602
    cmpl-float v3, v3, v12

    .line 1603
    .line 1604
    if-gtz v3, :cond_3d

    .line 1605
    .line 1606
    iget-object v3, v1, Lqo;->h:Lrn;

    .line 1607
    .line 1608
    invoke-interface {v3}, Lrn;->d()J

    .line 1609
    .line 1610
    .line 1611
    move-result-wide v22

    .line 1612
    move-object v12, v4

    .line 1613
    and-long v3, v22, v16

    .line 1614
    .line 1615
    long-to-int v3, v3

    .line 1616
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1617
    .line 1618
    .line 1619
    move-result v3

    .line 1620
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1621
    .line 1622
    .line 1623
    move-result v4

    .line 1624
    int-to-float v4, v4

    .line 1625
    cmpl-float v3, v3, v4

    .line 1626
    .line 1627
    if-gtz v3, :cond_3d

    .line 1628
    .line 1629
    if-nez v20, :cond_3e

    .line 1630
    .line 1631
    goto :goto_20

    .line 1632
    :cond_3c
    move-wide/from16 v28, v3

    .line 1633
    .line 1634
    :cond_3d
    :goto_20
    shr-long v3, v28, p0

    .line 1635
    .line 1636
    long-to-int v3, v3

    .line 1637
    and-long v7, v28, v16

    .line 1638
    .line 1639
    long-to-int v4, v7

    .line 1640
    invoke-static {v3, v4, v5}, Lp7;->b(III)Ld9;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v7

    .line 1644
    iput-object v7, v0, Lml;->a:Ld9;

    .line 1645
    .line 1646
    invoke-static {v7}, Lrp0;->F(Ld9;)Lf6;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v8

    .line 1650
    iput-object v8, v0, Lml;->b:Lf6;

    .line 1651
    .line 1652
    :cond_3e
    iget-object v3, v0, Lml;->c:Lsp;

    .line 1653
    .line 1654
    if-nez v3, :cond_3f

    .line 1655
    .line 1656
    new-instance v3, Lsp;

    .line 1657
    .line 1658
    invoke-direct {v3}, Lsp;-><init>()V

    .line 1659
    .line 1660
    .line 1661
    iput-object v3, v0, Lml;->c:Lsp;

    .line 1662
    .line 1663
    :cond_3f
    iget-object v4, v3, Lsp;->i:Lb5;

    .line 1664
    .line 1665
    iget-object v0, v3, Lsp;->h:Lrp;

    .line 1666
    .line 1667
    move-object v12, v6

    .line 1668
    invoke-static/range {v28 .. v29}, Ls11;->q0(J)J

    .line 1669
    .line 1670
    .line 1671
    move-result-wide v5

    .line 1672
    iget-object v14, v1, Lqo;->h:Lrn;

    .line 1673
    .line 1674
    invoke-interface {v14}, Lrn;->getLayoutDirection()Ld61;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v14

    .line 1678
    move-object/from16 v30, v3

    .line 1679
    .line 1680
    iget-object v3, v0, Lrp;->a:Le70;

    .line 1681
    .line 1682
    move-object/from16 v19, v9

    .line 1683
    .line 1684
    iget-object v9, v0, Lrp;->b:Ld61;

    .line 1685
    .line 1686
    move-object/from16 v38, v12

    .line 1687
    .line 1688
    iget-object v12, v0, Lrp;->c:Lqp;

    .line 1689
    .line 1690
    move-object/from16 v39, v2

    .line 1691
    .line 1692
    move-object/from16 v40, v3

    .line 1693
    .line 1694
    iget-wide v2, v0, Lrp;->d:J

    .line 1695
    .line 1696
    iput-object v1, v0, Lrp;->a:Le70;

    .line 1697
    .line 1698
    iput-object v14, v0, Lrp;->b:Ld61;

    .line 1699
    .line 1700
    iput-object v8, v0, Lrp;->c:Lqp;

    .line 1701
    .line 1702
    iput-wide v5, v0, Lrp;->d:J

    .line 1703
    .line 1704
    invoke-virtual {v8}, Lf6;->l()V

    .line 1705
    .line 1706
    .line 1707
    sget-wide v31, Lju;->b:J

    .line 1708
    .line 1709
    const-wide/16 v33, 0x0

    .line 1710
    .line 1711
    const/16 v37, 0x3a

    .line 1712
    .line 1713
    move-wide/from16 v35, v5

    .line 1714
    .line 1715
    invoke-static/range {v30 .. v37}, Lnc0;->i0(Lnc0;JJJI)V

    .line 1716
    .line 1717
    .line 1718
    neg-float v5, v13

    .line 1719
    neg-float v6, v11

    .line 1720
    iget-object v11, v4, Lb5;->i:Ljava/lang/Object;

    .line 1721
    .line 1722
    check-cast v11, Ln4;

    .line 1723
    .line 1724
    invoke-virtual {v11, v5, v6}, Ln4;->C(FF)V

    .line 1725
    .line 1726
    .line 1727
    :try_start_3
    iget-object v10, v10, Lsv1;->j:Ly9;

    .line 1728
    .line 1729
    new-instance v20, Lxv2;

    .line 1730
    .line 1731
    const/16 v24, 0x0

    .line 1732
    .line 1733
    const/16 v25, 0x1e

    .line 1734
    .line 1735
    const/16 v22, 0x0

    .line 1736
    .line 1737
    const/16 v23, 0x0

    .line 1738
    .line 1739
    invoke-direct/range {v20 .. v25}, Lxv2;-><init>(FFIII)V

    .line 1740
    .line 1741
    .line 1742
    const/16 v27, 0x34

    .line 1743
    .line 1744
    const/16 v25, 0x0

    .line 1745
    .line 1746
    move-object/from16 v23, v10

    .line 1747
    .line 1748
    move-object/from16 v24, v18

    .line 1749
    .line 1750
    move-object/from16 v26, v20

    .line 1751
    .line 1752
    move-object/from16 v22, v30

    .line 1753
    .line 1754
    invoke-static/range {v22 .. v27}, Lnc0;->v(Lnc0;Ly9;Lan;FLxv2;I)V

    .line 1755
    .line 1756
    .line 1757
    invoke-interface/range {v30 .. v30}, Lnc0;->d()J

    .line 1758
    .line 1759
    .line 1760
    move-result-wide v10

    .line 1761
    shr-long v10, v10, p0

    .line 1762
    .line 1763
    long-to-int v10, v10

    .line 1764
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1765
    .line 1766
    .line 1767
    move-result v10

    .line 1768
    add-float v10, v10, p1

    .line 1769
    .line 1770
    invoke-interface/range {v30 .. v30}, Lnc0;->d()J

    .line 1771
    .line 1772
    .line 1773
    move-result-wide v13

    .line 1774
    shr-long v13, v13, p0

    .line 1775
    .line 1776
    long-to-int v11, v13

    .line 1777
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1778
    .line 1779
    .line 1780
    move-result v11

    .line 1781
    div-float/2addr v10, v11

    .line 1782
    invoke-interface/range {v30 .. v30}, Lnc0;->d()J

    .line 1783
    .line 1784
    .line 1785
    move-result-wide v13

    .line 1786
    and-long v13, v13, v16

    .line 1787
    .line 1788
    long-to-int v11, v13

    .line 1789
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1790
    .line 1791
    .line 1792
    move-result v11

    .line 1793
    add-float v11, v11, p1

    .line 1794
    .line 1795
    invoke-interface/range {v30 .. v30}, Lnc0;->d()J

    .line 1796
    .line 1797
    .line 1798
    move-result-wide v13

    .line 1799
    and-long v13, v13, v16

    .line 1800
    .line 1801
    long-to-int v13, v13

    .line 1802
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1803
    .line 1804
    .line 1805
    move-result v13

    .line 1806
    div-float/2addr v11, v13

    .line 1807
    invoke-interface/range {v30 .. v30}, Lnc0;->a0()J

    .line 1808
    .line 1809
    .line 1810
    move-result-wide v13

    .line 1811
    move-object/from16 v16, v7

    .line 1812
    .line 1813
    move-object/from16 v17, v8

    .line 1814
    .line 1815
    invoke-virtual {v4}, Lb5;->u()J

    .line 1816
    .line 1817
    .line 1818
    move-result-wide v7

    .line 1819
    invoke-virtual {v4}, Lb5;->q()Lqp;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v18

    .line 1823
    invoke-interface/range {v18 .. v18}, Lqp;->l()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1824
    .line 1825
    .line 1826
    move-object/from16 p0, v15

    .line 1827
    .line 1828
    :try_start_4
    iget-object v15, v4, Lb5;->i:Ljava/lang/Object;

    .line 1829
    .line 1830
    check-cast v15, Ln4;

    .line 1831
    .line 1832
    invoke-virtual {v15, v10, v11, v13, v14}, Ln4;->A(FFJ)V

    .line 1833
    .line 1834
    .line 1835
    const/16 v26, 0x0

    .line 1836
    .line 1837
    const/16 v27, 0x1c

    .line 1838
    .line 1839
    const/16 v25, 0x0

    .line 1840
    .line 1841
    move-object/from16 v23, p0

    .line 1842
    .line 1843
    move-object/from16 v22, v30

    .line 1844
    .line 1845
    invoke-static/range {v22 .. v27}, Lnc0;->v(Lnc0;Ly9;Lan;FLxv2;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1846
    .line 1847
    .line 1848
    :try_start_5
    invoke-virtual {v4}, Lb5;->q()Lqp;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v10

    .line 1852
    invoke-interface {v10}, Lqp;->i()V

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v4, v7, v8}, Lb5;->E(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1856
    .line 1857
    .line 1858
    iget-object v4, v4, Lb5;->i:Ljava/lang/Object;

    .line 1859
    .line 1860
    check-cast v4, Ln4;

    .line 1861
    .line 1862
    neg-float v5, v5

    .line 1863
    neg-float v6, v6

    .line 1864
    invoke-virtual {v4, v5, v6}, Ln4;->C(FF)V

    .line 1865
    .line 1866
    .line 1867
    invoke-virtual/range {v17 .. v17}, Lf6;->i()V

    .line 1868
    .line 1869
    .line 1870
    move-object/from16 v4, v40

    .line 1871
    .line 1872
    iput-object v4, v0, Lrp;->a:Le70;

    .line 1873
    .line 1874
    iput-object v9, v0, Lrp;->b:Ld61;

    .line 1875
    .line 1876
    iput-object v12, v0, Lrp;->c:Lqp;

    .line 1877
    .line 1878
    iput-wide v2, v0, Lrp;->d:J

    .line 1879
    .line 1880
    move-object/from16 v7, v16

    .line 1881
    .line 1882
    iget-object v0, v7, Ld9;->a:Landroid/graphics/Bitmap;

    .line 1883
    .line 1884
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 1885
    .line 1886
    .line 1887
    move-object/from16 v0, v39

    .line 1888
    .line 1889
    iput-object v7, v0, Lo72;->i:Ljava/lang/Object;

    .line 1890
    .line 1891
    new-instance v22, Lpl;

    .line 1892
    .line 1893
    move-object/from16 v24, v0

    .line 1894
    .line 1895
    move-object/from16 v27, v19

    .line 1896
    .line 1897
    move-wide/from16 v25, v28

    .line 1898
    .line 1899
    move-object/from16 v23, v38

    .line 1900
    .line 1901
    invoke-direct/range {v22 .. v27}, Lpl;-><init>(Lo62;Lo72;JLcl;)V

    .line 1902
    .line 1903
    .line 1904
    move-object/from16 v0, v22

    .line 1905
    .line 1906
    invoke-virtual {v1, v0}, Lqo;->a(Lin0;)Ln4;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v6

    .line 1910
    goto/16 :goto_25

    .line 1911
    .line 1912
    :catchall_3
    move-exception v0

    .line 1913
    goto :goto_21

    .line 1914
    :catchall_4
    move-exception v0

    .line 1915
    :try_start_6
    invoke-virtual {v4}, Lb5;->q()Lqp;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v1

    .line 1919
    invoke-interface {v1}, Lqp;->i()V

    .line 1920
    .line 1921
    .line 1922
    invoke-virtual {v4, v7, v8}, Lb5;->E(J)V

    .line 1923
    .line 1924
    .line 1925
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1926
    :goto_21
    iget-object v1, v4, Lb5;->i:Ljava/lang/Object;

    .line 1927
    .line 1928
    check-cast v1, Ln4;

    .line 1929
    .line 1930
    neg-float v2, v5

    .line 1931
    neg-float v3, v6

    .line 1932
    invoke-virtual {v1, v2, v3}, Ln4;->C(FF)V

    .line 1933
    .line 1934
    .line 1935
    throw v0

    .line 1936
    :cond_40
    instance-of v3, v10, Luv1;

    .line 1937
    .line 1938
    if-eqz v3, :cond_45

    .line 1939
    .line 1940
    iget-object v3, v0, Lql;->z:Lft2;

    .line 1941
    .line 1942
    check-cast v10, Luv1;

    .line 1943
    .line 1944
    iget-object v7, v10, Luv1;->j:Ldb2;

    .line 1945
    .line 1946
    invoke-static {v7}, Lp7;->z(Ldb2;)Z

    .line 1947
    .line 1948
    .line 1949
    move-result v8

    .line 1950
    if-eqz v8, :cond_41

    .line 1951
    .line 1952
    iget-wide v7, v7, Ldb2;->e:J

    .line 1953
    .line 1954
    new-instance v21, Lxv2;

    .line 1955
    .line 1956
    const/4 v14, 0x0

    .line 1957
    const/16 v15, 0x1e

    .line 1958
    .line 1959
    const/4 v12, 0x0

    .line 1960
    const/4 v13, 0x0

    .line 1961
    move-object/from16 v10, v21

    .line 1962
    .line 1963
    invoke-direct/range {v10 .. v15}, Lxv2;-><init>(FFIII)V

    .line 1964
    .line 1965
    .line 1966
    new-instance v10, Lol;

    .line 1967
    .line 1968
    move v15, v2

    .line 1969
    move-object v12, v3

    .line 1970
    move-wide v13, v7

    .line 1971
    move/from16 v16, v11

    .line 1972
    .line 1973
    move-wide/from16 v17, v18

    .line 1974
    .line 1975
    move-wide/from16 v19, v5

    .line 1976
    .line 1977
    move v11, v9

    .line 1978
    invoke-direct/range {v10 .. v21}, Lol;-><init>(ZLft2;JFFJJLxv2;)V

    .line 1979
    .line 1980
    .line 1981
    invoke-virtual {v1, v10}, Lqo;->a(Lin0;)Ln4;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v6

    .line 1985
    goto/16 :goto_25

    .line 1986
    .line 1987
    :cond_41
    move-object v2, v3

    .line 1988
    move v8, v9

    .line 1989
    iget-object v3, v0, Lql;->x:Lml;

    .line 1990
    .line 1991
    if-nez v3, :cond_42

    .line 1992
    .line 1993
    new-instance v3, Lml;

    .line 1994
    .line 1995
    invoke-direct {v3}, Lml;-><init>()V

    .line 1996
    .line 1997
    .line 1998
    iput-object v3, v0, Lql;->x:Lml;

    .line 1999
    .line 2000
    :cond_42
    iget-object v0, v0, Lql;->x:Lml;

    .line 2001
    .line 2002
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2003
    .line 2004
    .line 2005
    iget-object v3, v0, Lml;->d:Ly9;

    .line 2006
    .line 2007
    if-nez v3, :cond_43

    .line 2008
    .line 2009
    invoke-static {}, Laa;->a()Ly9;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v3

    .line 2013
    iput-object v3, v0, Lml;->d:Ly9;

    .line 2014
    .line 2015
    :cond_43
    invoke-virtual {v3}, Ly9;->g()V

    .line 2016
    .line 2017
    .line 2018
    invoke-static {v3, v7}, Ly9;->b(Ly9;Ldb2;)V

    .line 2019
    .line 2020
    .line 2021
    if-nez v8, :cond_44

    .line 2022
    .line 2023
    invoke-static {}, Laa;->a()Ly9;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v0

    .line 2027
    iget v5, v7, Ldb2;->c:F

    .line 2028
    .line 2029
    iget v6, v7, Ldb2;->a:F

    .line 2030
    .line 2031
    sub-float/2addr v5, v6

    .line 2032
    sub-float v13, v5, v11

    .line 2033
    .line 2034
    iget v5, v7, Ldb2;->d:F

    .line 2035
    .line 2036
    iget v6, v7, Ldb2;->b:F

    .line 2037
    .line 2038
    sub-float/2addr v5, v6

    .line 2039
    sub-float v14, v5, v11

    .line 2040
    .line 2041
    iget-wide v5, v7, Ldb2;->e:J

    .line 2042
    .line 2043
    invoke-static {v11, v5, v6}, Lfg1;->P(FJ)J

    .line 2044
    .line 2045
    .line 2046
    move-result-wide v15

    .line 2047
    iget-wide v5, v7, Ldb2;->f:J

    .line 2048
    .line 2049
    invoke-static {v11, v5, v6}, Lfg1;->P(FJ)J

    .line 2050
    .line 2051
    .line 2052
    move-result-wide v17

    .line 2053
    iget-wide v5, v7, Ldb2;->h:J

    .line 2054
    .line 2055
    invoke-static {v11, v5, v6}, Lfg1;->P(FJ)J

    .line 2056
    .line 2057
    .line 2058
    move-result-wide v21

    .line 2059
    iget-wide v5, v7, Ldb2;->g:J

    .line 2060
    .line 2061
    invoke-static {v11, v5, v6}, Lfg1;->P(FJ)J

    .line 2062
    .line 2063
    .line 2064
    move-result-wide v19

    .line 2065
    new-instance v10, Ldb2;

    .line 2066
    .line 2067
    move v12, v11

    .line 2068
    invoke-direct/range {v10 .. v22}, Ldb2;-><init>(FFFFJJJJ)V

    .line 2069
    .line 2070
    .line 2071
    invoke-static {v0, v10}, Ly9;->b(Ly9;Ldb2;)V

    .line 2072
    .line 2073
    .line 2074
    const/4 v5, 0x0

    .line 2075
    invoke-virtual {v3, v3, v0, v5}, Ly9;->f(Ly9;Ly9;I)Z

    .line 2076
    .line 2077
    .line 2078
    :cond_44
    new-instance v0, Ld2;

    .line 2079
    .line 2080
    invoke-direct {v0, v4, v3, v2}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 2081
    .line 2082
    .line 2083
    invoke-virtual {v1, v0}, Lqo;->a(Lin0;)Ln4;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v6

    .line 2087
    goto :goto_25

    .line 2088
    :cond_45
    move v8, v9

    .line 2089
    move-wide/from16 v17, v18

    .line 2090
    .line 2091
    move-wide/from16 v19, v5

    .line 2092
    .line 2093
    instance-of v2, v10, Ltv1;

    .line 2094
    .line 2095
    if-eqz v2, :cond_49

    .line 2096
    .line 2097
    iget-object v0, v0, Lql;->z:Lft2;

    .line 2098
    .line 2099
    if-eqz v8, :cond_46

    .line 2100
    .line 2101
    const-wide/16 v2, 0x0

    .line 2102
    .line 2103
    move-wide/from16 v25, v2

    .line 2104
    .line 2105
    goto :goto_22

    .line 2106
    :cond_46
    move-wide/from16 v25, v17

    .line 2107
    .line 2108
    :goto_22
    if-eqz v8, :cond_47

    .line 2109
    .line 2110
    iget-object v2, v1, Lqo;->h:Lrn;

    .line 2111
    .line 2112
    invoke-interface {v2}, Lrn;->d()J

    .line 2113
    .line 2114
    .line 2115
    move-result-wide v5

    .line 2116
    move-wide/from16 v27, v5

    .line 2117
    .line 2118
    goto :goto_23

    .line 2119
    :cond_47
    move-wide/from16 v27, v19

    .line 2120
    .line 2121
    :goto_23
    if-eqz v8, :cond_48

    .line 2122
    .line 2123
    sget-object v2, Lxi0;->h:Lxi0;

    .line 2124
    .line 2125
    move-object/from16 v29, v2

    .line 2126
    .line 2127
    goto :goto_24

    .line 2128
    :cond_48
    new-instance v10, Lxv2;

    .line 2129
    .line 2130
    const/4 v14, 0x0

    .line 2131
    const/16 v15, 0x1e

    .line 2132
    .line 2133
    const/4 v12, 0x0

    .line 2134
    const/4 v13, 0x0

    .line 2135
    invoke-direct/range {v10 .. v15}, Lxv2;-><init>(FFIII)V

    .line 2136
    .line 2137
    .line 2138
    move-object/from16 v29, v10

    .line 2139
    .line 2140
    :goto_24
    new-instance v23, Lnl;

    .line 2141
    .line 2142
    move-object/from16 v24, v0

    .line 2143
    .line 2144
    invoke-direct/range {v23 .. v29}, Lnl;-><init>(Lft2;JJLop0;)V

    .line 2145
    .line 2146
    .line 2147
    move-object/from16 v0, v23

    .line 2148
    .line 2149
    invoke-virtual {v1, v0}, Lqo;->a(Lin0;)Ln4;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v6

    .line 2153
    goto :goto_25

    .line 2154
    :cond_49
    invoke-static {}, Lc80;->s()V

    .line 2155
    .line 2156
    .line 2157
    const/4 v6, 0x0

    .line 2158
    goto :goto_25

    .line 2159
    :cond_4a
    new-instance v0, Lw;

    .line 2160
    .line 2161
    const/16 v2, 0x17

    .line 2162
    .line 2163
    invoke-direct {v0, v2}, Lw;-><init>(I)V

    .line 2164
    .line 2165
    .line 2166
    invoke-virtual {v1, v0}, Lqo;->a(Lin0;)Ln4;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v6

    .line 2170
    :goto_25
    return-object v6

    .line 2171
    :pswitch_18
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 2172
    .line 2173
    check-cast v0, Lgk;

    .line 2174
    .line 2175
    check-cast v1, Lba0;

    .line 2176
    .line 2177
    new-instance v1, Lf8;

    .line 2178
    .line 2179
    const/4 v2, 0x3

    .line 2180
    invoke-direct {v1, v2, v0}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 2181
    .line 2182
    .line 2183
    return-object v1

    .line 2184
    :pswitch_19
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 2185
    .line 2186
    check-cast v0, Lws1;

    .line 2187
    .line 2188
    check-cast v1, Lzn2;

    .line 2189
    .line 2190
    sget-object v2, Lgn2;->a:Lyn2;

    .line 2191
    .line 2192
    new-instance v3, Lfn2;

    .line 2193
    .line 2194
    sget-object v4, Lrr0;->h:Lrr0;

    .line 2195
    .line 2196
    invoke-interface {v0}, Lws1;->a()J

    .line 2197
    .line 2198
    .line 2199
    move-result-wide v5

    .line 2200
    sget-object v7, Len2;->i:Len2;

    .line 2201
    .line 2202
    const/4 v8, 0x1

    .line 2203
    invoke-direct/range {v3 .. v8}, Lfn2;-><init>(Lrr0;JLen2;Z)V

    .line 2204
    .line 2205
    .line 2206
    invoke-interface {v1, v2, v3}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    sget-object v0, La83;->a:La83;

    .line 2210
    .line 2211
    return-object v0

    .line 2212
    :pswitch_1a
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 2213
    .line 2214
    check-cast v0, Lp5;

    .line 2215
    .line 2216
    check-cast v1, Loy2;

    .line 2217
    .line 2218
    iget-object v2, v0, Lp5;->x:Laf;

    .line 2219
    .line 2220
    sget-object v3, Lr7;->b:Ltu2;

    .line 2221
    .line 2222
    invoke-static {v0, v3}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v0

    .line 2226
    invoke-virtual {v2, v1, v0}, Laf;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2227
    .line 2228
    .line 2229
    sget-object v0, La83;->a:La83;

    .line 2230
    .line 2231
    return-object v0

    .line 2232
    :pswitch_1b
    const-string v2, "(this Map)"

    .line 2233
    .line 2234
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 2235
    .line 2236
    check-cast v0, Lzy1;

    .line 2237
    .line 2238
    check-cast v1, Ljava/util/Map$Entry;

    .line 2239
    .line 2240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2241
    .line 2242
    .line 2243
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2244
    .line 2245
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 2246
    .line 2247
    .line 2248
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v4

    .line 2252
    if-ne v4, v0, :cond_4b

    .line 2253
    .line 2254
    move-object v4, v2

    .line 2255
    goto :goto_26

    .line 2256
    :cond_4b
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v4

    .line 2260
    :goto_26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2261
    .line 2262
    .line 2263
    const/16 v4, 0x3d

    .line 2264
    .line 2265
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2266
    .line 2267
    .line 2268
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v1

    .line 2272
    if-ne v1, v0, :cond_4c

    .line 2273
    .line 2274
    goto :goto_27

    .line 2275
    :cond_4c
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v2

    .line 2279
    :goto_27
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2280
    .line 2281
    .line 2282
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v0

    .line 2286
    return-object v0

    .line 2287
    :pswitch_1c
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 2288
    .line 2289
    check-cast v0, Lk2;

    .line 2290
    .line 2291
    if-ne v1, v0, :cond_4d

    .line 2292
    .line 2293
    const-string v0, "(this Collection)"

    .line 2294
    .line 2295
    goto :goto_28

    .line 2296
    :cond_4d
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v0

    .line 2300
    :goto_28
    return-object v0

    .line 2301
    :pswitch_1d
    iget-object v0, v0, Lv;->i:Ljava/lang/Object;

    .line 2302
    .line 2303
    check-cast v0, Lby0;

    .line 2304
    .line 2305
    check-cast v1, Ljo2;

    .line 2306
    .line 2307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2308
    .line 2309
    .line 2310
    sget-object v2, Lb0;->d:Lb0;

    .line 2311
    .line 2312
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2313
    .line 2314
    .line 2315
    sget-object v2, Lb0;->h:Ljava/lang/String;

    .line 2316
    .line 2317
    iget-object v0, v0, Lby0;->a:Ljava/lang/String;

    .line 2318
    .line 2319
    iget-object v3, v1, Ljo2;->b:Lio2;

    .line 2320
    .line 2321
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v3

    .line 2325
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2326
    .line 2327
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 2328
    .line 2329
    .line 2330
    move-result-object v3

    .line 2331
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2332
    .line 2333
    .line 2334
    iget-object v1, v1, Ljo2;->c:Ljava/lang/String;

    .line 2335
    .line 2336
    const-string v4, "AI reply send failed: talker="

    .line 2337
    .line 2338
    const-string v5, ", code="

    .line 2339
    .line 2340
    const-string v6, ", reason="

    .line 2341
    .line 2342
    invoke-static {v4, v0, v5, v3, v6}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v0

    .line 2346
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2347
    .line 2348
    .line 2349
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2350
    .line 2351
    .line 2352
    move-result-object v0

    .line 2353
    invoke-static {v2, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2354
    .line 2355
    .line 2356
    sget-object v0, La83;->a:La83;

    .line 2357
    .line 2358
    return-object v0

    .line 2359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
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

    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
    .end packed-switch
.end method
