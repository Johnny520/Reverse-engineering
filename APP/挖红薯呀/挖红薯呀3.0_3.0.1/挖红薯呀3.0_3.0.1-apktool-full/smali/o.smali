.class public final synthetic Lo;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lo;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lo;->e:Ljava/lang/Object;

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
    iput p1, p0, Lo;->d:I

    iput-object p2, p0, Lo;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lo;->d:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/16 v4, 0x20

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x5

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v10, 0x1

    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lb91;

    .line 21
    .line 22
    check-cast v1, Loo;

    .line 23
    .line 24
    new-instance v1, Lk4;

    .line 25
    .line 26
    invoke-direct {v1, v6, v0}, Lk4;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lf01;

    .line 33
    .line 34
    check-cast v1, Lm5;

    .line 35
    .line 36
    iget-object v1, v1, Lm5;->a:Landroid/view/autofill/AutofillValue;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/autofill/AutofillValue;->isToggle()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/view/autofill/AutofillValue;->getToggleValue()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    :cond_0
    if-eqz v9, :cond_2

    .line 53
    .line 54
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    sget-object v1, Lp81;->d:Lp81;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    sget-object v1, Lp81;->e:Lp81;

    .line 64
    .line 65
    :goto_0
    sget-object v2, Ld01;->a:[Lu40;

    .line 66
    .line 67
    sget-object v2, Lb01;->H:Le01;

    .line 68
    .line 69
    sget-object v3, Ld01;->a:[Lu40;

    .line 70
    .line 71
    const/16 v4, 0x19

    .line 72
    .line 73
    aget-object v3, v3, v4

    .line 74
    .line 75
    invoke-interface {v0, v2, v1}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move v8, v10

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    const/4 v8, 0x0

    .line 81
    :goto_1
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :pswitch_1
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lww;

    .line 89
    .line 90
    sget-object v2, Lkl;->x:Lq91;

    .line 91
    .line 92
    check-cast v1, Lu7;

    .line 93
    .line 94
    iget-object v3, v1, Lu7;->e:Lgp0;

    .line 95
    .line 96
    invoke-virtual {v3}, Lgp0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-object v2, v2, Lq91;->b:Lsw;

    .line 101
    .line 102
    iget-object v1, v1, Lu7;->f:Lb8;

    .line 103
    .line 104
    invoke-interface {v2, v1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v0, v3, v1}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lna1;->a:Lna1;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_2
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Le31;

    .line 117
    .line 118
    iget-object v2, v0, Le31;->g:Ljava/lang/Object;

    .line 119
    .line 120
    monitor-enter v2

    .line 121
    :try_start_0
    iget-object v0, v0, Le31;->i:Ld31;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v3, v0, Ld31;->b:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget v4, v0, Ld31;->d:I

    .line 132
    .line 133
    iget-object v5, v0, Ld31;->c:Lch0;

    .line 134
    .line 135
    if-nez v5, :cond_3

    .line 136
    .line 137
    new-instance v5, Lch0;

    .line 138
    .line 139
    invoke-direct {v5}, Lch0;-><init>()V

    .line 140
    .line 141
    .line 142
    iput-object v5, v0, Ld31;->c:Lch0;

    .line 143
    .line 144
    iget-object v6, v0, Ld31;->f:Ljh0;

    .line 145
    .line 146
    invoke-virtual {v6, v3, v5}, Ljh0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    invoke-virtual {v0, v1, v4, v3, v5}, Ld31;->b(Ljava/lang/Object;ILjava/lang/Object;Lch0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    .line 151
    .line 152
    monitor-exit v2

    .line 153
    sget-object v0, Lna1;->a:Lna1;

    .line 154
    .line 155
    return-object v0

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    monitor-exit v2

    .line 158
    throw v0

    .line 159
    :pswitch_3
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Lkh0;

    .line 162
    .line 163
    instance-of v2, v1, Le41;

    .line 164
    .line 165
    if-eqz v2, :cond_4

    .line 166
    .line 167
    move-object v2, v1

    .line 168
    check-cast v2, Le41;

    .line 169
    .line 170
    invoke-virtual {v2, v5}, Le41;->f(I)V

    .line 171
    .line 172
    .line 173
    :cond_4
    invoke-virtual {v0, v1}, Lkh0;->a(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    sget-object v0, Lna1;->a:Lna1;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_4
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Llz0;

    .line 182
    .line 183
    check-cast v1, Lok0;

    .line 184
    .line 185
    iget-object v2, v0, Llz0;->k:Lny0;

    .line 186
    .line 187
    iget-wide v3, v1, Lok0;->a:J

    .line 188
    .line 189
    iget v1, v0, Llz0;->j:I

    .line 190
    .line 191
    invoke-virtual {v0, v2, v3, v4, v1}, Llz0;->c(Lny0;JI)J

    .line 192
    .line 193
    .line 194
    move-result-wide v0

    .line 195
    new-instance v2, Lok0;

    .line 196
    .line 197
    invoke-direct {v2, v0, v1}, Lok0;-><init>(J)V

    .line 198
    .line 199
    .line 200
    return-object v2

    .line 201
    :pswitch_5
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Lpy0;

    .line 204
    .line 205
    check-cast v1, Ljava/lang/Float;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    iget-object v2, v0, Lpy0;->a:Ldp0;

    .line 212
    .line 213
    invoke-virtual {v2}, Ldp0;->g()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    int-to-float v3, v3

    .line 218
    add-float/2addr v3, v1

    .line 219
    iget v4, v0, Lpy0;->f:F

    .line 220
    .line 221
    add-float/2addr v3, v4

    .line 222
    iget-object v4, v0, Lpy0;->e:Ldp0;

    .line 223
    .line 224
    invoke-virtual {v4}, Ldp0;->g()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    int-to-float v4, v4

    .line 229
    invoke-static {v3, v7, v4}, Lw60;->m(FFF)F

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    cmpg-float v3, v3, v4

    .line 234
    .line 235
    if-nez v3, :cond_5

    .line 236
    .line 237
    move v8, v10

    .line 238
    goto :goto_2

    .line 239
    :cond_5
    const/4 v8, 0x0

    .line 240
    :goto_2
    invoke-virtual {v2}, Ldp0;->g()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    int-to-float v3, v3

    .line 245
    sub-float/2addr v4, v3

    .line 246
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-virtual {v2}, Ldp0;->g()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    add-int/2addr v5, v3

    .line 255
    invoke-virtual {v2, v5}, Ldp0;->h(I)V

    .line 256
    .line 257
    .line 258
    int-to-float v2, v3

    .line 259
    sub-float v2, v4, v2

    .line 260
    .line 261
    iput v2, v0, Lpy0;->f:F

    .line 262
    .line 263
    if-nez v8, :cond_6

    .line 264
    .line 265
    move v1, v4

    .line 266
    :cond_6
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :pswitch_6
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lyw0;

    .line 274
    .line 275
    iget-object v0, v0, Lyw0;->f:Lzw0;

    .line 276
    .line 277
    if-eqz v0, :cond_7

    .line 278
    .line 279
    invoke-interface {v0, v1}, Lzw0;->b(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    :cond_7
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    return-object v0

    .line 288
    :pswitch_7
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, Lot0;

    .line 291
    .line 292
    check-cast v1, Ljava/lang/Throwable;

    .line 293
    .line 294
    const-string v2, "Recomposer effect job completed"

    .line 295
    .line 296
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 297
    .line 298
    invoke-direct {v3, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 302
    .line 303
    .line 304
    iget-object v2, v0, Lot0;->c:Ljava/lang/Object;

    .line 305
    .line 306
    monitor-enter v2

    .line 307
    :try_start_1
    iget-object v4, v0, Lot0;->d:Lc40;

    .line 308
    .line 309
    if-eqz v4, :cond_8

    .line 310
    .line 311
    iget-object v5, v0, Lot0;->u:Lz31;

    .line 312
    .line 313
    sget-object v6, Ljt0;->e:Ljt0;

    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v9, v6}, Lz31;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    invoke-interface {v4, v3}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 322
    .line 323
    .line 324
    iput-object v9, v0, Lot0;->r:Lwc;

    .line 325
    .line 326
    new-instance v3, Lc;

    .line 327
    .line 328
    const/16 v5, 0x11

    .line 329
    .line 330
    invoke-direct {v3, v5, v0, v1}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    invoke-interface {v4, v3}, Lc40;->r(Lsw;)Lpo;

    .line 334
    .line 335
    .line 336
    goto :goto_3

    .line 337
    :catchall_1
    move-exception v0

    .line 338
    goto :goto_4

    .line 339
    :cond_8
    iput-object v3, v0, Lot0;->e:Ljava/lang/Throwable;

    .line 340
    .line 341
    iget-object v0, v0, Lot0;->u:Lz31;

    .line 342
    .line 343
    sget-object v1, Ljt0;->d:Ljt0;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v9, v1}, Lz31;->j(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 349
    .line 350
    .line 351
    :goto_3
    monitor-exit v2

    .line 352
    sget-object v0, Lna1;->a:Lna1;

    .line 353
    .line 354
    return-object v0

    .line 355
    :goto_4
    monitor-exit v2

    .line 356
    throw v0

    .line 357
    :pswitch_8
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Lyi;

    .line 360
    .line 361
    invoke-virtual {v0, v1}, Lyi;->z(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    sget-object v0, Lna1;->a:Lna1;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_9
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, Lzt0;

    .line 370
    .line 371
    check-cast v1, Lh91;

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    check-cast v1, Lj91;

    .line 377
    .line 378
    iget-object v1, v1, Lj91;->r:Ld80;

    .line 379
    .line 380
    iget-object v2, v0, Lzt0;->d:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v2, Ljava/util/List;

    .line 383
    .line 384
    if-eqz v2, :cond_9

    .line 385
    .line 386
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_9
    filled-new-array {v1}, [Ld80;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    new-instance v2, Ljava/util/ArrayList;

    .line 395
    .line 396
    new-instance v3, Lw8;

    .line 397
    .line 398
    invoke-direct {v3, v1, v10}, Lw8;-><init>([Ljava/lang/Object;Z)V

    .line 399
    .line 400
    .line 401
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 402
    .line 403
    .line 404
    :goto_5
    iput-object v2, v0, Lzt0;->d:Ljava/lang/Object;

    .line 405
    .line 406
    sget-object v0, Lg91;->e:Lg91;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_a
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, Lqo0;

    .line 412
    .line 413
    check-cast v1, Ljava/lang/Float;

    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    iget-object v0, v0, Lqo0;->b:Lkm;

    .line 420
    .line 421
    invoke-virtual {v0}, Llo0;->p()I

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_a

    .line 426
    .line 427
    invoke-virtual {v0}, Llo0;->p()I

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    int-to-float v2, v2

    .line 432
    div-float v7, v1, v2

    .line 433
    .line 434
    :cond_a
    invoke-static {v7}, Lrd0;->Q(F)I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    iget-object v2, v0, Llo0;->d:Lco0;

    .line 439
    .line 440
    iget-object v2, v2, Lco0;->b:Ldp0;

    .line 441
    .line 442
    invoke-virtual {v2}, Ldp0;->g()I

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    add-int/2addr v2, v1

    .line 447
    invoke-virtual {v0, v2}, Llo0;->k(I)I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    iget-object v0, v0, Llo0;->s:Ldp0;

    .line 452
    .line 453
    invoke-virtual {v0, v1}, Ldp0;->h(I)V

    .line 454
    .line 455
    .line 456
    sget-object v0, Lna1;->a:Lna1;

    .line 457
    .line 458
    return-object v0

    .line 459
    :pswitch_b
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Lw31;

    .line 462
    .line 463
    check-cast v1, Lgv0;

    .line 464
    .line 465
    invoke-interface {v0}, Lw31;->getValue()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    check-cast v0, Ljava/lang/Number;

    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    invoke-virtual {v1, v0}, Lgv0;->d(F)V

    .line 476
    .line 477
    .line 478
    sget-object v0, Lna1;->a:Lna1;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_c
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, Lwg0;

    .line 484
    .line 485
    check-cast v1, Ld30;

    .line 486
    .line 487
    iget-wide v1, v1, Ld30;->a:J

    .line 488
    .line 489
    shr-long/2addr v1, v4

    .line 490
    long-to-int v1, v1

    .line 491
    check-cast v0, Ldp0;

    .line 492
    .line 493
    invoke-virtual {v0, v1}, Ldp0;->h(I)V

    .line 494
    .line 495
    .line 496
    sget-object v0, Lna1;->a:Lna1;

    .line 497
    .line 498
    return-object v0

    .line 499
    :pswitch_d
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast v0, Ldi0;

    .line 502
    .line 503
    check-cast v1, Ljava/lang/Throwable;

    .line 504
    .line 505
    invoke-virtual {v0, v9}, Ldi0;->g(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    sget-object v0, Lna1;->a:Lna1;

    .line 509
    .line 510
    return-object v0

    .line 511
    :pswitch_e
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, Lorg/json/JSONObject;

    .line 514
    .line 515
    check-cast v1, Ljava/lang/String;

    .line 516
    .line 517
    invoke-static {v0, v1}, Ln90;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    return-object v0

    .line 522
    :pswitch_f
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, Lzw0;

    .line 525
    .line 526
    if-eqz v0, :cond_b

    .line 527
    .line 528
    invoke-interface {v0, v1}, Lzw0;->b(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v10

    .line 532
    :cond_b
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    return-object v0

    .line 537
    :pswitch_10
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v0, Lc90;

    .line 540
    .line 541
    check-cast v1, Ljava/lang/Float;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    neg-float v1, v1

    .line 548
    cmpg-float v2, v1, v7

    .line 549
    .line 550
    if-gez v2, :cond_c

    .line 551
    .line 552
    invoke-virtual {v0}, Lc90;->c()Z

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    if-eqz v2, :cond_15

    .line 557
    .line 558
    :cond_c
    cmpl-float v2, v1, v7

    .line 559
    .line 560
    if-lez v2, :cond_d

    .line 561
    .line 562
    invoke-virtual {v0}, Lc90;->a()Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-nez v2, :cond_d

    .line 567
    .line 568
    goto/16 :goto_9

    .line 569
    .line 570
    :cond_d
    iget v2, v0, Lc90;->h:F

    .line 571
    .line 572
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    const/high16 v3, 0x3f000000    # 0.5f

    .line 577
    .line 578
    cmpg-float v2, v2, v3

    .line 579
    .line 580
    if-gtz v2, :cond_e

    .line 581
    .line 582
    goto :goto_6

    .line 583
    :cond_e
    const-string v2, "entered drag with non-zero pending scroll"

    .line 584
    .line 585
    invoke-static {v2}, Lz10;->c(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    :goto_6
    iput-boolean v10, v0, Lc90;->d:Z

    .line 589
    .line 590
    iget v2, v0, Lc90;->h:F

    .line 591
    .line 592
    add-float/2addr v2, v1

    .line 593
    iput v2, v0, Lc90;->h:F

    .line 594
    .line 595
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    cmpl-float v2, v2, v3

    .line 600
    .line 601
    if-lez v2, :cond_13

    .line 602
    .line 603
    iget v2, v0, Lc90;->h:F

    .line 604
    .line 605
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    iget-object v5, v0, Lc90;->f:Lgp0;

    .line 610
    .line 611
    invoke-virtual {v5}, Lgp0;->getValue()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    check-cast v5, Lv80;

    .line 616
    .line 617
    iget-boolean v6, v0, Lc90;->b:Z

    .line 618
    .line 619
    xor-int/2addr v6, v10

    .line 620
    invoke-virtual {v5, v4, v6}, Lv80;->f(IZ)Lv80;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    if-eqz v5, :cond_f

    .line 625
    .line 626
    iget-object v6, v0, Lc90;->c:Lv80;

    .line 627
    .line 628
    if-eqz v6, :cond_f

    .line 629
    .line 630
    invoke-virtual {v6, v4, v10}, Lv80;->f(IZ)Lv80;

    .line 631
    .line 632
    .line 633
    move-result-object v4

    .line 634
    if-eqz v4, :cond_10

    .line 635
    .line 636
    iput-object v4, v0, Lc90;->c:Lv80;

    .line 637
    .line 638
    :cond_f
    move-object v9, v5

    .line 639
    :cond_10
    if-eqz v9, :cond_11

    .line 640
    .line 641
    iget-boolean v4, v0, Lc90;->b:Z

    .line 642
    .line 643
    invoke-virtual {v0, v9, v4, v10}, Lc90;->f(Lv80;ZZ)V

    .line 644
    .line 645
    .line 646
    iget-object v4, v0, Lc90;->v:Loh0;

    .line 647
    .line 648
    sget-object v5, Lna1;->a:Lna1;

    .line 649
    .line 650
    invoke-interface {v4, v5}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    iget v4, v0, Lc90;->h:F

    .line 654
    .line 655
    sub-float/2addr v2, v4

    .line 656
    invoke-virtual {v0, v2, v9}, Lc90;->h(FLv80;)V

    .line 657
    .line 658
    .line 659
    goto :goto_7

    .line 660
    :cond_11
    iget-object v4, v0, Lc90;->k:Lb60;

    .line 661
    .line 662
    if-eqz v4, :cond_12

    .line 663
    .line 664
    invoke-virtual {v4}, Lb60;->k()V

    .line 665
    .line 666
    .line 667
    :cond_12
    iget v4, v0, Lc90;->h:F

    .line 668
    .line 669
    sub-float/2addr v2, v4

    .line 670
    invoke-virtual {v0}, Lc90;->g()Lv80;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    invoke-virtual {v0, v2, v4}, Lc90;->h(FLv80;)V

    .line 675
    .line 676
    .line 677
    :cond_13
    :goto_7
    iget v2, v0, Lc90;->h:F

    .line 678
    .line 679
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    cmpg-float v2, v2, v3

    .line 684
    .line 685
    if-gtz v2, :cond_14

    .line 686
    .line 687
    :goto_8
    move v7, v1

    .line 688
    goto :goto_9

    .line 689
    :cond_14
    iget v2, v0, Lc90;->h:F

    .line 690
    .line 691
    sub-float/2addr v1, v2

    .line 692
    iput v7, v0, Lc90;->h:F

    .line 693
    .line 694
    goto :goto_8

    .line 695
    :cond_15
    :goto_9
    neg-float v0, v7

    .line 696
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    return-object v0

    .line 701
    :pswitch_11
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v0, Ly70;

    .line 704
    .line 705
    check-cast v1, Loo;

    .line 706
    .line 707
    new-instance v1, Lk4;

    .line 708
    .line 709
    invoke-direct {v1, v5, v0}, Lk4;-><init>(ILjava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    return-object v1

    .line 713
    :pswitch_12
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, Lm70;

    .line 716
    .line 717
    check-cast v1, Loo;

    .line 718
    .line 719
    new-instance v1, Lk4;

    .line 720
    .line 721
    invoke-direct {v1, v3, v0}, Lk4;-><init>(ILjava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    return-object v1

    .line 725
    :pswitch_13
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v0, Lkv;

    .line 728
    .line 729
    check-cast v1, Laa1;

    .line 730
    .line 731
    iget-object v4, v1, Laa1;->b:Lzv;

    .line 732
    .line 733
    iget v5, v1, Laa1;->c:I

    .line 734
    .line 735
    iget v6, v1, Laa1;->d:I

    .line 736
    .line 737
    iget-object v7, v1, Laa1;->e:Ljava/lang/Object;

    .line 738
    .line 739
    new-instance v2, Laa1;

    .line 740
    .line 741
    const/4 v3, 0x0

    .line 742
    invoke-direct/range {v2 .. v7}, Laa1;-><init>(Lz51;Lzv;IILjava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v0, v2}, Lkv;->a(Laa1;)Lba1;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    iget-object v0, v0, Lba1;->d:Ljava/lang/Object;

    .line 750
    .line 751
    return-object v0

    .line 752
    :pswitch_14
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, Lkp;

    .line 755
    .line 756
    check-cast v1, Llp$a;

    .line 757
    .line 758
    invoke-static {v0, v1}, Lkp;->a(Lkp;Llp$a;)Lna1;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    return-object v0

    .line 763
    :pswitch_15
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast v0, Lvt0;

    .line 766
    .line 767
    check-cast v1, Lh91;

    .line 768
    .line 769
    iget-boolean v2, v0, Lvt0;->d:Z

    .line 770
    .line 771
    if-nez v2, :cond_17

    .line 772
    .line 773
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    check-cast v1, Lsy0;

    .line 777
    .line 778
    iget-boolean v1, v1, Lsy0;->r:Z

    .line 779
    .line 780
    if-eqz v1, :cond_16

    .line 781
    .line 782
    goto :goto_a

    .line 783
    :cond_16
    const/4 v8, 0x0

    .line 784
    goto :goto_b

    .line 785
    :cond_17
    :goto_a
    move v8, v10

    .line 786
    :goto_b
    iput-boolean v8, v0, Lvt0;->d:Z

    .line 787
    .line 788
    xor-int/lit8 v0, v8, 0x1

    .line 789
    .line 790
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    return-object v0

    .line 795
    :pswitch_16
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v0, Lsa;

    .line 798
    .line 799
    check-cast v1, Lnc;

    .line 800
    .line 801
    iget v2, v0, Lsa;->u:F

    .line 802
    .line 803
    invoke-virtual {v1}, Lnc;->b()F

    .line 804
    .line 805
    .line 806
    move-result v5

    .line 807
    mul-float/2addr v5, v2

    .line 808
    cmpl-float v2, v5, v7

    .line 809
    .line 810
    if-ltz v2, :cond_35

    .line 811
    .line 812
    iget-object v2, v1, Lnc;->d:Lbc;

    .line 813
    .line 814
    invoke-interface {v2}, Lbc;->c()J

    .line 815
    .line 816
    .line 817
    move-result-wide v11

    .line 818
    invoke-static {v11, v12}, Lq11;->b(J)F

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    cmpl-float v2, v2, v7

    .line 823
    .line 824
    if-lez v2, :cond_35

    .line 825
    .line 826
    iget v2, v0, Lsa;->u:F

    .line 827
    .line 828
    invoke-static {v2, v7}, Lnp;->b(FF)Z

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    const/high16 v5, 0x3f800000    # 1.0f

    .line 833
    .line 834
    if-eqz v2, :cond_18

    .line 835
    .line 836
    move v2, v5

    .line 837
    goto :goto_c

    .line 838
    :cond_18
    iget v2, v0, Lsa;->u:F

    .line 839
    .line 840
    invoke-virtual {v1}, Lnc;->b()F

    .line 841
    .line 842
    .line 843
    move-result v11

    .line 844
    mul-float/2addr v11, v2

    .line 845
    float-to-double v11, v11

    .line 846
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 847
    .line 848
    .line 849
    move-result-wide v11

    .line 850
    double-to-float v2, v11

    .line 851
    :goto_c
    iget-object v11, v1, Lnc;->d:Lbc;

    .line 852
    .line 853
    invoke-interface {v11}, Lbc;->c()J

    .line 854
    .line 855
    .line 856
    move-result-wide v11

    .line 857
    invoke-static {v11, v12}, Lq11;->b(J)F

    .line 858
    .line 859
    .line 860
    move-result v11

    .line 861
    const/high16 v12, 0x40000000    # 2.0f

    .line 862
    .line 863
    div-float/2addr v11, v12

    .line 864
    float-to-double v13, v11

    .line 865
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 866
    .line 867
    .line 868
    move-result-wide v13

    .line 869
    double-to-float v11, v13

    .line 870
    invoke-static {v2, v11}, Ljava/lang/Math;->min(FF)F

    .line 871
    .line 872
    .line 873
    move-result v14

    .line 874
    div-float v18, v14, v12

    .line 875
    .line 876
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    move/from16 p0, v12

    .line 881
    .line 882
    int-to-long v12, v2

    .line 883
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 884
    .line 885
    .line 886
    move-result v2

    .line 887
    int-to-long v9, v2

    .line 888
    shl-long/2addr v12, v4

    .line 889
    const-wide v16, 0xffffffffL

    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    and-long v9, v9, v16

    .line 895
    .line 896
    or-long v20, v12, v9

    .line 897
    .line 898
    iget-object v2, v1, Lnc;->d:Lbc;

    .line 899
    .line 900
    invoke-interface {v2}, Lbc;->c()J

    .line 901
    .line 902
    .line 903
    move-result-wide v9

    .line 904
    shr-long/2addr v9, v4

    .line 905
    long-to-int v2, v9

    .line 906
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 907
    .line 908
    .line 909
    move-result v2

    .line 910
    sub-float/2addr v2, v14

    .line 911
    iget-object v9, v1, Lnc;->d:Lbc;

    .line 912
    .line 913
    invoke-interface {v9}, Lbc;->c()J

    .line 914
    .line 915
    .line 916
    move-result-wide v9

    .line 917
    and-long v9, v9, v16

    .line 918
    .line 919
    long-to-int v9, v9

    .line 920
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 921
    .line 922
    .line 923
    move-result v9

    .line 924
    sub-float/2addr v9, v14

    .line 925
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 926
    .line 927
    .line 928
    move-result v2

    .line 929
    int-to-long v12, v2

    .line 930
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    int-to-long v9, v2

    .line 935
    shl-long/2addr v12, v4

    .line 936
    and-long v9, v9, v16

    .line 937
    .line 938
    or-long v22, v12, v9

    .line 939
    .line 940
    mul-float v12, v14, p0

    .line 941
    .line 942
    iget-object v2, v1, Lnc;->d:Lbc;

    .line 943
    .line 944
    invoke-interface {v2}, Lbc;->c()J

    .line 945
    .line 946
    .line 947
    move-result-wide v9

    .line 948
    invoke-static {v9, v10}, Lq11;->b(J)F

    .line 949
    .line 950
    .line 951
    move-result v2

    .line 952
    cmpl-float v2, v12, v2

    .line 953
    .line 954
    if-lez v2, :cond_19

    .line 955
    .line 956
    const/4 v2, 0x1

    .line 957
    goto :goto_d

    .line 958
    :cond_19
    const/4 v2, 0x0

    .line 959
    :goto_d
    iget-object v9, v0, Lsa;->w:Lx01;

    .line 960
    .line 961
    iget-object v10, v1, Lnc;->d:Lbc;

    .line 962
    .line 963
    move v13, v4

    .line 964
    invoke-interface {v10}, Lbc;->c()J

    .line 965
    .line 966
    .line 967
    move-result-wide v3

    .line 968
    iget-object v10, v1, Lnc;->d:Lbc;

    .line 969
    .line 970
    invoke-interface {v10}, Lbc;->getLayoutDirection()Lk50;

    .line 971
    .line 972
    .line 973
    move-result-object v10

    .line 974
    invoke-interface {v9, v3, v4, v10, v1}, Lx01;->a(JLk50;Lym;)Lv50;

    .line 975
    .line 976
    .line 977
    move-result-object v3

    .line 978
    instance-of v4, v3, Lwm0;

    .line 979
    .line 980
    if-eqz v4, :cond_2b

    .line 981
    .line 982
    iget-object v4, v0, Lsa;->v:Lg31;

    .line 983
    .line 984
    check-cast v3, Lwm0;

    .line 985
    .line 986
    iget-object v10, v3, Lwm0;->a:Ld6;

    .line 987
    .line 988
    if-eqz v2, :cond_1a

    .line 989
    .line 990
    new-instance v0, Lc;

    .line 991
    .line 992
    const/4 v2, 0x3

    .line 993
    invoke-direct {v0, v2, v3, v4}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v1, v0}, Lnc;->a(Lsw;)Lx1;

    .line 997
    .line 998
    .line 999
    move-result-object v9

    .line 1000
    goto/16 :goto_1a

    .line 1001
    .line 1002
    :cond_1a
    if-eqz v4, :cond_1b

    .line 1003
    .line 1004
    move/from16 p0, v13

    .line 1005
    .line 1006
    iget-wide v13, v4, Lg31;->l:J

    .line 1007
    .line 1008
    invoke-static {v5, v13, v14}, Lff;->b(FJ)J

    .line 1009
    .line 1010
    .line 1011
    move-result-wide v13

    .line 1012
    new-instance v2, Lja;

    .line 1013
    .line 1014
    invoke-direct {v2, v6, v13, v14}, Lja;-><init>(IJ)V

    .line 1015
    .line 1016
    .line 1017
    move-object/from16 v23, v2

    .line 1018
    .line 1019
    const/4 v2, 0x1

    .line 1020
    goto :goto_e

    .line 1021
    :cond_1b
    move/from16 p0, v13

    .line 1022
    .line 1023
    const/4 v2, 0x0

    .line 1024
    const/16 v23, 0x0

    .line 1025
    .line 1026
    :goto_e
    invoke-virtual {v10}, Ld6;->c()Lst0;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v6

    .line 1030
    iget v13, v6, Lst0;->b:F

    .line 1031
    .line 1032
    iget v14, v6, Lst0;->a:F

    .line 1033
    .line 1034
    move/from16 p1, v5

    .line 1035
    .line 1036
    iget-object v5, v0, Lsa;->t:Loa;

    .line 1037
    .line 1038
    if-nez v5, :cond_1c

    .line 1039
    .line 1040
    new-instance v5, Loa;

    .line 1041
    .line 1042
    invoke-direct {v5}, Loa;-><init>()V

    .line 1043
    .line 1044
    .line 1045
    iput-object v5, v0, Lsa;->t:Loa;

    .line 1046
    .line 1047
    :cond_1c
    iget-object v5, v0, Lsa;->t:Loa;

    .line 1048
    .line 1049
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1050
    .line 1051
    .line 1052
    iget-object v11, v5, Loa;->d:Ld6;

    .line 1053
    .line 1054
    if-nez v11, :cond_1d

    .line 1055
    .line 1056
    invoke-static {}, Lf6;->a()Ld6;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v11

    .line 1060
    iput-object v11, v5, Loa;->d:Ld6;

    .line 1061
    .line 1062
    :cond_1d
    invoke-virtual {v11}, Ld6;->e()V

    .line 1063
    .line 1064
    .line 1065
    iget v5, v6, Lst0;->a:F

    .line 1066
    .line 1067
    iget v15, v6, Lst0;->d:F

    .line 1068
    .line 1069
    iget v7, v6, Lst0;->c:F

    .line 1070
    .line 1071
    iget v9, v6, Lst0;->b:F

    .line 1072
    .line 1073
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 1074
    .line 1075
    .line 1076
    move-result v18

    .line 1077
    if-nez v18, :cond_1e

    .line 1078
    .line 1079
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 1080
    .line 1081
    .line 1082
    move-result v18

    .line 1083
    if-nez v18, :cond_1e

    .line 1084
    .line 1085
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v18

    .line 1089
    if-nez v18, :cond_1e

    .line 1090
    .line 1091
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v18

    .line 1095
    if-eqz v18, :cond_1f

    .line 1096
    .line 1097
    :cond_1e
    const-string v18, "Invalid rectangle, make sure no value is NaN"

    .line 1098
    .line 1099
    invoke-static/range {v18 .. v18}, Lf6;->b(Ljava/lang/String;)V

    .line 1100
    .line 1101
    .line 1102
    :cond_1f
    iget-object v8, v11, Ld6;->b:Landroid/graphics/RectF;

    .line 1103
    .line 1104
    if-nez v8, :cond_20

    .line 1105
    .line 1106
    new-instance v8, Landroid/graphics/RectF;

    .line 1107
    .line 1108
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 1109
    .line 1110
    .line 1111
    iput-object v8, v11, Ld6;->b:Landroid/graphics/RectF;

    .line 1112
    .line 1113
    :cond_20
    iget-object v8, v11, Ld6;->b:Landroid/graphics/RectF;

    .line 1114
    .line 1115
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v8, v5, v9, v7, v15}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1119
    .line 1120
    .line 1121
    iget-object v5, v11, Ld6;->a:Landroid/graphics/Path;

    .line 1122
    .line 1123
    iget-object v7, v11, Ld6;->b:Landroid/graphics/RectF;

    .line 1124
    .line 1125
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1126
    .line 1127
    .line 1128
    sget-object v8, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 1129
    .line 1130
    invoke-virtual {v5, v7, v8}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 1131
    .line 1132
    .line 1133
    const/4 v5, 0x0

    .line 1134
    invoke-virtual {v11, v11, v10, v5}, Ld6;->d(Ld6;Ld6;I)Z

    .line 1135
    .line 1136
    .line 1137
    new-instance v5, Lzt0;

    .line 1138
    .line 1139
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1140
    .line 1141
    .line 1142
    iget v7, v6, Lst0;->c:F

    .line 1143
    .line 1144
    sub-float/2addr v7, v14

    .line 1145
    float-to-double v7, v7

    .line 1146
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 1147
    .line 1148
    .line 1149
    move-result-wide v7

    .line 1150
    double-to-float v7, v7

    .line 1151
    float-to-int v7, v7

    .line 1152
    iget v8, v6, Lst0;->d:F

    .line 1153
    .line 1154
    sub-float/2addr v8, v13

    .line 1155
    float-to-double v8, v8

    .line 1156
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v8

    .line 1160
    double-to-float v8, v8

    .line 1161
    float-to-int v8, v8

    .line 1162
    int-to-long v9, v7

    .line 1163
    shl-long v9, v9, p0

    .line 1164
    .line 1165
    int-to-long v7, v8

    .line 1166
    and-long v7, v7, v16

    .line 1167
    .line 1168
    or-long v21, v9, v7

    .line 1169
    .line 1170
    iget-object v0, v0, Lsa;->t:Loa;

    .line 1171
    .line 1172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    iget-object v7, v0, Loa;->a:Lt5;

    .line 1176
    .line 1177
    iget-object v8, v0, Loa;->b:Lb3;

    .line 1178
    .line 1179
    if-eqz v7, :cond_21

    .line 1180
    .line 1181
    invoke-virtual {v7}, Lt5;->a()I

    .line 1182
    .line 1183
    .line 1184
    move-result v9

    .line 1185
    new-instance v10, Lrz;

    .line 1186
    .line 1187
    invoke-direct {v10, v9}, Lrz;-><init>(I)V

    .line 1188
    .line 1189
    .line 1190
    goto :goto_f

    .line 1191
    :cond_21
    const/4 v10, 0x0

    .line 1192
    :goto_f
    if-nez v10, :cond_22

    .line 1193
    .line 1194
    goto :goto_10

    .line 1195
    :cond_22
    iget v9, v10, Lrz;->a:I

    .line 1196
    .line 1197
    if-nez v9, :cond_23

    .line 1198
    .line 1199
    goto :goto_13

    .line 1200
    :cond_23
    :goto_10
    if-eqz v7, :cond_24

    .line 1201
    .line 1202
    invoke-virtual {v7}, Lt5;->a()I

    .line 1203
    .line 1204
    .line 1205
    move-result v9

    .line 1206
    new-instance v10, Lrz;

    .line 1207
    .line 1208
    invoke-direct {v10, v9}, Lrz;-><init>(I)V

    .line 1209
    .line 1210
    .line 1211
    move-object v9, v10

    .line 1212
    goto :goto_11

    .line 1213
    :cond_24
    const/4 v9, 0x0

    .line 1214
    :goto_11
    if-nez v9, :cond_25

    .line 1215
    .line 1216
    goto :goto_12

    .line 1217
    :cond_25
    iget v9, v9, Lrz;->a:I

    .line 1218
    .line 1219
    if-eq v2, v9, :cond_26

    .line 1220
    .line 1221
    :goto_12
    const/4 v10, 0x0

    .line 1222
    goto :goto_14

    .line 1223
    :cond_26
    :goto_13
    const/4 v10, 0x1

    .line 1224
    :goto_14
    if-eqz v7, :cond_28

    .line 1225
    .line 1226
    iget-object v9, v7, Lt5;->a:Landroid/graphics/Bitmap;

    .line 1227
    .line 1228
    if-eqz v8, :cond_28

    .line 1229
    .line 1230
    iget-object v15, v1, Lnc;->d:Lbc;

    .line 1231
    .line 1232
    invoke-interface {v15}, Lbc;->c()J

    .line 1233
    .line 1234
    .line 1235
    move-result-wide v18

    .line 1236
    move-object v15, v6

    .line 1237
    move-object/from16 v20, v7

    .line 1238
    .line 1239
    shr-long v6, v18, p0

    .line 1240
    .line 1241
    long-to-int v6, v6

    .line 1242
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1243
    .line 1244
    .line 1245
    move-result v6

    .line 1246
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1247
    .line 1248
    .line 1249
    move-result v7

    .line 1250
    int-to-float v7, v7

    .line 1251
    cmpl-float v6, v6, v7

    .line 1252
    .line 1253
    if-gtz v6, :cond_29

    .line 1254
    .line 1255
    iget-object v6, v1, Lnc;->d:Lbc;

    .line 1256
    .line 1257
    invoke-interface {v6}, Lbc;->c()J

    .line 1258
    .line 1259
    .line 1260
    move-result-wide v6

    .line 1261
    and-long v6, v6, v16

    .line 1262
    .line 1263
    long-to-int v6, v6

    .line 1264
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1265
    .line 1266
    .line 1267
    move-result v6

    .line 1268
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1269
    .line 1270
    .line 1271
    move-result v7

    .line 1272
    int-to-float v7, v7

    .line 1273
    cmpl-float v6, v6, v7

    .line 1274
    .line 1275
    if-gtz v6, :cond_29

    .line 1276
    .line 1277
    if-nez v10, :cond_27

    .line 1278
    .line 1279
    goto :goto_15

    .line 1280
    :cond_27
    move-object/from16 v7, v20

    .line 1281
    .line 1282
    goto :goto_16

    .line 1283
    :cond_28
    move-object v15, v6

    .line 1284
    :cond_29
    :goto_15
    shr-long v6, v21, p0

    .line 1285
    .line 1286
    long-to-int v6, v6

    .line 1287
    and-long v7, v21, v16

    .line 1288
    .line 1289
    long-to-int v7, v7

    .line 1290
    invoke-static {v6, v7, v2}, Lkl;->d(III)Lt5;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v7

    .line 1294
    iput-object v7, v0, Loa;->a:Lt5;

    .line 1295
    .line 1296
    sget-object v2, Lc3;->a:Landroid/graphics/Canvas;

    .line 1297
    .line 1298
    new-instance v8, Lb3;

    .line 1299
    .line 1300
    invoke-direct {v8}, Lb3;-><init>()V

    .line 1301
    .line 1302
    .line 1303
    new-instance v2, Landroid/graphics/Canvas;

    .line 1304
    .line 1305
    iget-object v6, v7, Lt5;->a:Landroid/graphics/Bitmap;

    .line 1306
    .line 1307
    invoke-direct {v2, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1308
    .line 1309
    .line 1310
    iput-object v2, v8, Lb3;->a:Landroid/graphics/Canvas;

    .line 1311
    .line 1312
    iput-object v8, v0, Loa;->b:Lb3;

    .line 1313
    .line 1314
    :goto_16
    iget-object v2, v0, Loa;->c:Ldd;

    .line 1315
    .line 1316
    if-nez v2, :cond_2a

    .line 1317
    .line 1318
    new-instance v2, Ldd;

    .line 1319
    .line 1320
    invoke-direct {v2}, Ldd;-><init>()V

    .line 1321
    .line 1322
    .line 1323
    iput-object v2, v0, Loa;->c:Ldd;

    .line 1324
    .line 1325
    :cond_2a
    iget-object v6, v2, Ldd;->e:Lo8;

    .line 1326
    .line 1327
    iget-object v0, v2, Ldd;->d:Lcd;

    .line 1328
    .line 1329
    invoke-static/range {v21 .. v22}, Lo30;->C(J)J

    .line 1330
    .line 1331
    .line 1332
    move-result-wide v9

    .line 1333
    move-object/from16 v29, v2

    .line 1334
    .line 1335
    iget-object v2, v1, Lnc;->d:Lbc;

    .line 1336
    .line 1337
    invoke-interface {v2}, Lbc;->getLayoutDirection()Lk50;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    move-object/from16 v18, v4

    .line 1342
    .line 1343
    iget-object v4, v0, Lcd;->a:Lym;

    .line 1344
    .line 1345
    move-object/from16 v20, v11

    .line 1346
    .line 1347
    iget-object v11, v0, Lcd;->b:Lk50;

    .line 1348
    .line 1349
    move-object/from16 v19, v15

    .line 1350
    .line 1351
    iget-object v15, v0, Lcd;->c:Lbd;

    .line 1352
    .line 1353
    move-object/from16 v24, v4

    .line 1354
    .line 1355
    move-object/from16 v26, v5

    .line 1356
    .line 1357
    iget-wide v4, v0, Lcd;->d:J

    .line 1358
    .line 1359
    iput-object v1, v0, Lcd;->a:Lym;

    .line 1360
    .line 1361
    iput-object v2, v0, Lcd;->b:Lk50;

    .line 1362
    .line 1363
    iput-object v8, v0, Lcd;->c:Lbd;

    .line 1364
    .line 1365
    iput-wide v9, v0, Lcd;->d:J

    .line 1366
    .line 1367
    invoke-virtual {v8}, Lb3;->i()V

    .line 1368
    .line 1369
    .line 1370
    sget-wide v30, Lff;->b:J

    .line 1371
    .line 1372
    const/16 v34, 0x3a

    .line 1373
    .line 1374
    move-wide/from16 v32, v9

    .line 1375
    .line 1376
    invoke-static/range {v29 .. v34}, Luq;->v(Luq;JJI)V

    .line 1377
    .line 1378
    .line 1379
    neg-float v2, v14

    .line 1380
    neg-float v9, v13

    .line 1381
    iget-object v10, v6, Lo8;->a:Ljava/lang/Object;

    .line 1382
    .line 1383
    check-cast v10, Lx1;

    .line 1384
    .line 1385
    invoke-virtual {v10, v2, v9}, Lx1;->u(FF)V

    .line 1386
    .line 1387
    .line 1388
    :try_start_2
    iget-object v3, v3, Lwm0;->a:Ld6;

    .line 1389
    .line 1390
    new-instance v10, Ls41;

    .line 1391
    .line 1392
    move-object/from16 v28, v3

    .line 1393
    .line 1394
    const/16 v3, 0x1e

    .line 1395
    .line 1396
    const/4 v13, 0x0

    .line 1397
    const/4 v14, 0x0

    .line 1398
    invoke-direct {v10, v12, v13, v14, v3}, Ls41;-><init>(FFII)V

    .line 1399
    .line 1400
    .line 1401
    const/16 v32, 0x34

    .line 1402
    .line 1403
    const/16 v30, 0x0

    .line 1404
    .line 1405
    move-object/from16 v31, v10

    .line 1406
    .line 1407
    move-object/from16 v27, v29

    .line 1408
    .line 1409
    move-object/from16 v29, v18

    .line 1410
    .line 1411
    invoke-static/range {v27 .. v32}, Luq;->h0(Luq;Ld6;Lpf1;FLs41;I)V

    .line 1412
    .line 1413
    .line 1414
    invoke-interface/range {v27 .. v27}, Luq;->c()J

    .line 1415
    .line 1416
    .line 1417
    move-result-wide v12

    .line 1418
    shr-long v12, v12, p0

    .line 1419
    .line 1420
    long-to-int v3, v12

    .line 1421
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1422
    .line 1423
    .line 1424
    move-result v3

    .line 1425
    add-float v3, v3, p1

    .line 1426
    .line 1427
    invoke-interface/range {v27 .. v27}, Luq;->c()J

    .line 1428
    .line 1429
    .line 1430
    move-result-wide v12

    .line 1431
    shr-long v12, v12, p0

    .line 1432
    .line 1433
    long-to-int v10, v12

    .line 1434
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1435
    .line 1436
    .line 1437
    move-result v10

    .line 1438
    div-float/2addr v3, v10

    .line 1439
    invoke-interface/range {v27 .. v27}, Luq;->c()J

    .line 1440
    .line 1441
    .line 1442
    move-result-wide v12

    .line 1443
    and-long v12, v12, v16

    .line 1444
    .line 1445
    long-to-int v10, v12

    .line 1446
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1447
    .line 1448
    .line 1449
    move-result v10

    .line 1450
    add-float v10, v10, p1

    .line 1451
    .line 1452
    invoke-interface/range {v27 .. v27}, Luq;->c()J

    .line 1453
    .line 1454
    .line 1455
    move-result-wide v12

    .line 1456
    and-long v12, v12, v16

    .line 1457
    .line 1458
    long-to-int v12, v12

    .line 1459
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1460
    .line 1461
    .line 1462
    move-result v12

    .line 1463
    div-float/2addr v10, v12

    .line 1464
    invoke-interface/range {v27 .. v27}, Luq;->K()J

    .line 1465
    .line 1466
    .line 1467
    move-result-wide v12

    .line 1468
    move-object v14, v7

    .line 1469
    move-object/from16 v16, v8

    .line 1470
    .line 1471
    invoke-virtual {v6}, Lo8;->h()J

    .line 1472
    .line 1473
    .line 1474
    move-result-wide v7

    .line 1475
    invoke-virtual {v6}, Lo8;->f()Lbd;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v17

    .line 1479
    invoke-interface/range {v17 .. v17}, Lbd;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1480
    .line 1481
    .line 1482
    move-object/from16 p0, v14

    .line 1483
    .line 1484
    :try_start_3
    iget-object v14, v6, Lo8;->a:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v14, Lx1;

    .line 1487
    .line 1488
    invoke-virtual {v14, v3, v10, v12, v13}, Lx1;->s(FFJ)V

    .line 1489
    .line 1490
    .line 1491
    const/16 v31, 0x0

    .line 1492
    .line 1493
    const/16 v32, 0x1c

    .line 1494
    .line 1495
    const/16 v30, 0x0

    .line 1496
    .line 1497
    move-object/from16 v28, v20

    .line 1498
    .line 1499
    invoke-static/range {v27 .. v32}, Luq;->h0(Luq;Ld6;Lpf1;FLs41;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1500
    .line 1501
    .line 1502
    :try_start_4
    invoke-virtual {v6}, Lo8;->f()Lbd;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v3

    .line 1506
    invoke-interface {v3}, Lbd;->g()V

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v6, v7, v8}, Lo8;->q(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1510
    .line 1511
    .line 1512
    iget-object v3, v6, Lo8;->a:Ljava/lang/Object;

    .line 1513
    .line 1514
    check-cast v3, Lx1;

    .line 1515
    .line 1516
    neg-float v2, v2

    .line 1517
    neg-float v6, v9

    .line 1518
    invoke-virtual {v3, v2, v6}, Lx1;->u(FF)V

    .line 1519
    .line 1520
    .line 1521
    invoke-virtual/range {v16 .. v16}, Lb3;->g()V

    .line 1522
    .line 1523
    .line 1524
    move-object/from16 v2, v24

    .line 1525
    .line 1526
    iput-object v2, v0, Lcd;->a:Lym;

    .line 1527
    .line 1528
    iput-object v11, v0, Lcd;->b:Lk50;

    .line 1529
    .line 1530
    iput-object v15, v0, Lcd;->c:Lbd;

    .line 1531
    .line 1532
    iput-wide v4, v0, Lcd;->d:J

    .line 1533
    .line 1534
    move-object/from16 v14, p0

    .line 1535
    .line 1536
    iget-object v0, v14, Lt5;->a:Landroid/graphics/Bitmap;

    .line 1537
    .line 1538
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 1539
    .line 1540
    .line 1541
    move-object/from16 v0, v26

    .line 1542
    .line 1543
    iput-object v14, v0, Lzt0;->d:Ljava/lang/Object;

    .line 1544
    .line 1545
    new-instance v18, Lra;

    .line 1546
    .line 1547
    move-object/from16 v20, v0

    .line 1548
    .line 1549
    invoke-direct/range {v18 .. v23}, Lra;-><init>(Lst0;Lzt0;JLja;)V

    .line 1550
    .line 1551
    .line 1552
    move-object/from16 v0, v18

    .line 1553
    .line 1554
    invoke-virtual {v1, v0}, Lnc;->a(Lsw;)Lx1;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v9

    .line 1558
    goto/16 :goto_1a

    .line 1559
    .line 1560
    :catchall_2
    move-exception v0

    .line 1561
    goto :goto_17

    .line 1562
    :catchall_3
    move-exception v0

    .line 1563
    :try_start_5
    invoke-virtual {v6}, Lo8;->f()Lbd;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v1

    .line 1567
    invoke-interface {v1}, Lbd;->g()V

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v6, v7, v8}, Lo8;->q(J)V

    .line 1571
    .line 1572
    .line 1573
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1574
    :goto_17
    iget-object v1, v6, Lo8;->a:Ljava/lang/Object;

    .line 1575
    .line 1576
    check-cast v1, Lx1;

    .line 1577
    .line 1578
    neg-float v2, v2

    .line 1579
    neg-float v3, v9

    .line 1580
    invoke-virtual {v1, v2, v3}, Lx1;->u(FF)V

    .line 1581
    .line 1582
    .line 1583
    throw v0

    .line 1584
    :cond_2b
    instance-of v4, v3, Lym0;

    .line 1585
    .line 1586
    if-eqz v4, :cond_30

    .line 1587
    .line 1588
    iget-object v15, v0, Lsa;->v:Lg31;

    .line 1589
    .line 1590
    check-cast v3, Lym0;

    .line 1591
    .line 1592
    iget-object v3, v3, Lym0;->a:Lbw0;

    .line 1593
    .line 1594
    invoke-static {v3}, Lj50;->s(Lbw0;)Z

    .line 1595
    .line 1596
    .line 1597
    move-result v4

    .line 1598
    if-eqz v4, :cond_2c

    .line 1599
    .line 1600
    iget-wide v3, v3, Lbw0;->e:J

    .line 1601
    .line 1602
    new-instance v0, Ls41;

    .line 1603
    .line 1604
    const/4 v5, 0x0

    .line 1605
    const/16 v6, 0x1e

    .line 1606
    .line 1607
    const/4 v13, 0x0

    .line 1608
    invoke-direct {v0, v14, v13, v5, v6}, Ls41;-><init>(FFII)V

    .line 1609
    .line 1610
    .line 1611
    new-instance v13, Lqa;

    .line 1612
    .line 1613
    move-object/from16 v24, v0

    .line 1614
    .line 1615
    move-wide/from16 v16, v3

    .line 1616
    .line 1617
    move/from16 v19, v14

    .line 1618
    .line 1619
    move v14, v2

    .line 1620
    invoke-direct/range {v13 .. v24}, Lqa;-><init>(ZLg31;JFFJJLs41;)V

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v1, v13}, Lnc;->a(Lsw;)Lx1;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v9

    .line 1627
    goto/16 :goto_1a

    .line 1628
    .line 1629
    :cond_2c
    move-object/from16 v35, v15

    .line 1630
    .line 1631
    move v15, v2

    .line 1632
    move-object/from16 v2, v35

    .line 1633
    .line 1634
    iget-object v4, v0, Lsa;->t:Loa;

    .line 1635
    .line 1636
    if-nez v4, :cond_2d

    .line 1637
    .line 1638
    new-instance v4, Loa;

    .line 1639
    .line 1640
    invoke-direct {v4}, Loa;-><init>()V

    .line 1641
    .line 1642
    .line 1643
    iput-object v4, v0, Lsa;->t:Loa;

    .line 1644
    .line 1645
    :cond_2d
    iget-object v0, v0, Lsa;->t:Loa;

    .line 1646
    .line 1647
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1648
    .line 1649
    .line 1650
    iget-object v4, v0, Loa;->d:Ld6;

    .line 1651
    .line 1652
    if-nez v4, :cond_2e

    .line 1653
    .line 1654
    invoke-static {}, Lf6;->a()Ld6;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v4

    .line 1658
    iput-object v4, v0, Loa;->d:Ld6;

    .line 1659
    .line 1660
    :cond_2e
    invoke-virtual {v4}, Ld6;->e()V

    .line 1661
    .line 1662
    .line 1663
    invoke-static {v4, v3}, Ld6;->b(Ld6;Lbw0;)V

    .line 1664
    .line 1665
    .line 1666
    if-nez v15, :cond_2f

    .line 1667
    .line 1668
    invoke-static {}, Lf6;->a()Ld6;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    iget v5, v3, Lbw0;->c:F

    .line 1673
    .line 1674
    iget v6, v3, Lbw0;->a:F

    .line 1675
    .line 1676
    sub-float/2addr v5, v6

    .line 1677
    sub-float v16, v5, v14

    .line 1678
    .line 1679
    iget v5, v3, Lbw0;->d:F

    .line 1680
    .line 1681
    iget v6, v3, Lbw0;->b:F

    .line 1682
    .line 1683
    sub-float/2addr v5, v6

    .line 1684
    sub-float v17, v5, v14

    .line 1685
    .line 1686
    iget-wide v5, v3, Lbw0;->e:J

    .line 1687
    .line 1688
    invoke-static {v14, v5, v6}, Lp30;->U(FJ)J

    .line 1689
    .line 1690
    .line 1691
    move-result-wide v18

    .line 1692
    iget-wide v5, v3, Lbw0;->f:J

    .line 1693
    .line 1694
    invoke-static {v14, v5, v6}, Lp30;->U(FJ)J

    .line 1695
    .line 1696
    .line 1697
    move-result-wide v20

    .line 1698
    iget-wide v5, v3, Lbw0;->h:J

    .line 1699
    .line 1700
    invoke-static {v14, v5, v6}, Lp30;->U(FJ)J

    .line 1701
    .line 1702
    .line 1703
    move-result-wide v24

    .line 1704
    iget-wide v5, v3, Lbw0;->g:J

    .line 1705
    .line 1706
    invoke-static {v14, v5, v6}, Lp30;->U(FJ)J

    .line 1707
    .line 1708
    .line 1709
    move-result-wide v22

    .line 1710
    new-instance v13, Lbw0;

    .line 1711
    .line 1712
    move v15, v14

    .line 1713
    invoke-direct/range {v13 .. v25}, Lbw0;-><init>(FFFFJJJJ)V

    .line 1714
    .line 1715
    .line 1716
    invoke-static {v0, v13}, Ld6;->b(Ld6;Lbw0;)V

    .line 1717
    .line 1718
    .line 1719
    const/4 v5, 0x0

    .line 1720
    invoke-virtual {v4, v4, v0, v5}, Ld6;->d(Ld6;Ld6;I)Z

    .line 1721
    .line 1722
    .line 1723
    :cond_2f
    new-instance v0, Lc;

    .line 1724
    .line 1725
    const/4 v3, 0x2

    .line 1726
    invoke-direct {v0, v3, v4, v2}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v1, v0}, Lnc;->a(Lsw;)Lx1;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v9

    .line 1733
    goto :goto_1a

    .line 1734
    :cond_30
    move v15, v2

    .line 1735
    instance-of v2, v3, Lxm0;

    .line 1736
    .line 1737
    if-eqz v2, :cond_34

    .line 1738
    .line 1739
    iget-object v4, v0, Lsa;->v:Lg31;

    .line 1740
    .line 1741
    if-eqz v15, :cond_31

    .line 1742
    .line 1743
    const-wide/16 v20, 0x0

    .line 1744
    .line 1745
    :cond_31
    move-wide/from16 v5, v20

    .line 1746
    .line 1747
    if-eqz v15, :cond_32

    .line 1748
    .line 1749
    iget-object v0, v1, Lnc;->d:Lbc;

    .line 1750
    .line 1751
    invoke-interface {v0}, Lbc;->c()J

    .line 1752
    .line 1753
    .line 1754
    move-result-wide v22

    .line 1755
    :cond_32
    move-wide/from16 v7, v22

    .line 1756
    .line 1757
    if-eqz v15, :cond_33

    .line 1758
    .line 1759
    sget-object v0, Lqt;->Q:Lqt;

    .line 1760
    .line 1761
    :goto_18
    move-object v9, v0

    .line 1762
    goto :goto_19

    .line 1763
    :cond_33
    new-instance v0, Ls41;

    .line 1764
    .line 1765
    const/4 v2, 0x0

    .line 1766
    const/16 v3, 0x1e

    .line 1767
    .line 1768
    const/4 v13, 0x0

    .line 1769
    invoke-direct {v0, v14, v13, v2, v3}, Ls41;-><init>(FFII)V

    .line 1770
    .line 1771
    .line 1772
    goto :goto_18

    .line 1773
    :goto_19
    new-instance v3, Lpa;

    .line 1774
    .line 1775
    invoke-direct/range {v3 .. v9}, Lpa;-><init>(Lg31;JJLo30;)V

    .line 1776
    .line 1777
    .line 1778
    invoke-virtual {v1, v3}, Lnc;->a(Lsw;)Lx1;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v9

    .line 1782
    goto :goto_1a

    .line 1783
    :cond_34
    invoke-static {}, Lxc;->j()V

    .line 1784
    .line 1785
    .line 1786
    const/4 v9, 0x0

    .line 1787
    goto :goto_1a

    .line 1788
    :cond_35
    new-instance v0, Lw9;

    .line 1789
    .line 1790
    const/4 v15, 0x1

    .line 1791
    invoke-direct {v0, v15}, Lw9;-><init>(I)V

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v1, v0}, Lnc;->a(Lsw;)Lx1;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v9

    .line 1798
    :goto_1a
    return-object v9

    .line 1799
    :pswitch_17
    const-string v2, "(this Map)"

    .line 1800
    .line 1801
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 1802
    .line 1803
    check-cast v0, Lgq0;

    .line 1804
    .line 1805
    check-cast v1, Ljava/util/Map$Entry;

    .line 1806
    .line 1807
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1808
    .line 1809
    .line 1810
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1811
    .line 1812
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1813
    .line 1814
    .line 1815
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v4

    .line 1819
    if-ne v4, v0, :cond_36

    .line 1820
    .line 1821
    move-object v4, v2

    .line 1822
    goto :goto_1b

    .line 1823
    :cond_36
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v4

    .line 1827
    :goto_1b
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1828
    .line 1829
    .line 1830
    const/16 v4, 0x3d

    .line 1831
    .line 1832
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1833
    .line 1834
    .line 1835
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v1

    .line 1839
    if-ne v1, v0, :cond_37

    .line 1840
    .line 1841
    goto :goto_1c

    .line 1842
    :cond_37
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v2

    .line 1846
    :goto_1c
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1847
    .line 1848
    .line 1849
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v0

    .line 1853
    return-object v0

    .line 1854
    :pswitch_18
    iget-object v0, v0, Lo;->e:Ljava/lang/Object;

    .line 1855
    .line 1856
    check-cast v0, Lp;

    .line 1857
    .line 1858
    if-ne v1, v0, :cond_38

    .line 1859
    .line 1860
    const-string v0, "(this Collection)"

    .line 1861
    .line 1862
    goto :goto_1d

    .line 1863
    :cond_38
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v0

    .line 1867
    :goto_1d
    return-object v0

    .line 1868
    nop

    .line 1869
    :pswitch_data_0
    .packed-switch 0x0
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
