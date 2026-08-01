.class public final Lm3;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm3;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lm3;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lm3;->f:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lm3;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lna1;->a:Lna1;

    .line 7
    .line 8
    iget-object v5, p0, Lm3;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Lm3;->e:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lsw;

    .line 16
    .line 17
    sget-object v0, Lqj0;->P:Lgv0;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    check-cast v5, Lqj0;

    .line 23
    .line 24
    iget-object p0, v5, Lqj0;->G:Lx01;

    .line 25
    .line 26
    iget-object v1, v0, Lgv0;->m:Lx01;

    .line 27
    .line 28
    if-eq p0, v1, :cond_0

    .line 29
    .line 30
    move p0, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move p0, v3

    .line 33
    :goto_0
    iget-boolean v6, v5, Lqj0;->H:Z

    .line 34
    .line 35
    iget-boolean v7, v0, Lgv0;->n:Z

    .line 36
    .line 37
    if-eq v6, v7, :cond_1

    .line 38
    .line 39
    move v3, v2

    .line 40
    :cond_1
    if-nez p0, :cond_2

    .line 41
    .line 42
    if-eqz v3, :cond_4

    .line 43
    .line 44
    :cond_2
    iput-object v1, v5, Lqj0;->G:Lx01;

    .line 45
    .line 46
    iput-boolean v7, v5, Lqj0;->H:Z

    .line 47
    .line 48
    iget-boolean v1, v5, Lqj0;->I:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    if-eqz v7, :cond_4

    .line 55
    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    :cond_3
    iget-object p0, v5, Lqj0;->r:Lb60;

    .line 59
    .line 60
    invoke-virtual {p0}, Lb60;->F()V

    .line 61
    .line 62
    .line 63
    :cond_4
    iput-boolean v2, v5, Lqj0;->I:Z

    .line 64
    .line 65
    iget-object p0, v0, Lgv0;->m:Lx01;

    .line 66
    .line 67
    iget-wide v1, v0, Lgv0;->o:J

    .line 68
    .line 69
    iget-object v3, v0, Lgv0;->q:Lk50;

    .line 70
    .line 71
    iget-object v5, v0, Lgv0;->p:Lym;

    .line 72
    .line 73
    invoke-interface {p0, v1, v2, v3, v5}, Lx01;->a(JLk50;Lym;)Lv50;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iput-object p0, v0, Lgv0;->s:Lv50;

    .line 78
    .line 79
    return-object v4

    .line 80
    :pswitch_0
    check-cast p0, Lb60;

    .line 81
    .line 82
    iget-object p0, p0, Lb60;->I:Lmj0;

    .line 83
    .line 84
    check-cast v5, Lzt0;

    .line 85
    .line 86
    iget-object v0, p0, Lmj0;->f:Loe0;

    .line 87
    .line 88
    iget v0, v0, Loe0;->g:I

    .line 89
    .line 90
    and-int/lit8 v0, v0, 0x8

    .line 91
    .line 92
    if-eqz v0, :cond_f

    .line 93
    .line 94
    iget-object p0, p0, Lmj0;->e:Ld61;

    .line 95
    .line 96
    :goto_1
    if-eqz p0, :cond_f

    .line 97
    .line 98
    iget v0, p0, Loe0;->f:I

    .line 99
    .line 100
    and-int/lit8 v0, v0, 0x8

    .line 101
    .line 102
    if-eqz v0, :cond_e

    .line 103
    .line 104
    move-object v0, p0

    .line 105
    move-object v6, v1

    .line 106
    :goto_2
    if-eqz v0, :cond_e

    .line 107
    .line 108
    instance-of v7, v0, Lvz0;

    .line 109
    .line 110
    if-eqz v7, :cond_7

    .line 111
    .line 112
    check-cast v0, Lvz0;

    .line 113
    .line 114
    invoke-interface {v0}, Lvz0;->V()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_5

    .line 119
    .line 120
    new-instance v7, Lsz0;

    .line 121
    .line 122
    invoke-direct {v7}, Lsz0;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object v7, v5, Lzt0;->d:Ljava/lang/Object;

    .line 126
    .line 127
    iput-boolean v2, v7, Lsz0;->g:Z

    .line 128
    .line 129
    :cond_5
    invoke-interface {v0}, Lvz0;->X()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-eqz v7, :cond_6

    .line 134
    .line 135
    iget-object v7, v5, Lzt0;->d:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v7, Lsz0;

    .line 138
    .line 139
    iput-boolean v2, v7, Lsz0;->f:Z

    .line 140
    .line 141
    :cond_6
    iget-object v7, v5, Lzt0;->d:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v7, Lf01;

    .line 144
    .line 145
    invoke-interface {v0, v7}, Lvz0;->S(Lf01;)V

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_7
    iget v7, v0, Loe0;->f:I

    .line 150
    .line 151
    and-int/lit8 v7, v7, 0x8

    .line 152
    .line 153
    if-eqz v7, :cond_d

    .line 154
    .line 155
    instance-of v7, v0, Lsm;

    .line 156
    .line 157
    if-eqz v7, :cond_d

    .line 158
    .line 159
    move-object v7, v0

    .line 160
    check-cast v7, Lsm;

    .line 161
    .line 162
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 163
    .line 164
    move v8, v3

    .line 165
    :goto_3
    if-eqz v7, :cond_c

    .line 166
    .line 167
    iget v9, v7, Loe0;->f:I

    .line 168
    .line 169
    and-int/lit8 v9, v9, 0x8

    .line 170
    .line 171
    if-eqz v9, :cond_b

    .line 172
    .line 173
    add-int/lit8 v8, v8, 0x1

    .line 174
    .line 175
    if-ne v8, v2, :cond_8

    .line 176
    .line 177
    move-object v0, v7

    .line 178
    goto :goto_4

    .line 179
    :cond_8
    if-nez v6, :cond_9

    .line 180
    .line 181
    new-instance v6, Lsh0;

    .line 182
    .line 183
    const/16 v9, 0x10

    .line 184
    .line 185
    new-array v9, v9, [Loe0;

    .line 186
    .line 187
    invoke-direct {v6, v9}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    if-eqz v0, :cond_a

    .line 191
    .line 192
    invoke-virtual {v6, v0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object v0, v1

    .line 196
    :cond_a
    invoke-virtual {v6, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_b
    :goto_4
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_c
    if-ne v8, v2, :cond_d

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_d
    :goto_5
    invoke-static {v6}, Lpf1;->f(Lsh0;)Loe0;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    goto :goto_2

    .line 210
    :cond_e
    iget-object p0, p0, Loe0;->h:Loe0;

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_f
    return-object v4

    .line 214
    :pswitch_1
    check-cast p0, Lmy;

    .line 215
    .line 216
    check-cast v5, Loe0;

    .line 217
    .line 218
    invoke-virtual {p0, v5}, Lmy;->d(Loe0;)V

    .line 219
    .line 220
    .line 221
    return-object v4

    .line 222
    :pswitch_2
    check-cast p0, Lzt0;

    .line 223
    .line 224
    check-cast v5, Ldv;

    .line 225
    .line 226
    invoke-virtual {v5}, Ldv;->y0()Lav;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iput-object v0, p0, Lzt0;->d:Ljava/lang/Object;

    .line 231
    .line 232
    return-object v4

    .line 233
    :pswitch_3
    check-cast p0, Lmc;

    .line 234
    .line 235
    iget-object p0, p0, Lmc;->t:Lo;

    .line 236
    .line 237
    check-cast v5, Lnc;

    .line 238
    .line 239
    invoke-virtual {p0, v5}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    return-object v4

    .line 243
    :pswitch_4
    check-cast p0, Lhw;

    .line 244
    .line 245
    if-eqz p0, :cond_11

    .line 246
    .line 247
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    check-cast p0, Lst0;

    .line 252
    .line 253
    if-nez p0, :cond_10

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_10
    move-object v1, p0

    .line 257
    goto :goto_8

    .line 258
    :cond_11
    :goto_6
    check-cast v5, Lqj0;

    .line 259
    .line 260
    invoke-virtual {v5}, Lqj0;->G0()Loe0;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    iget-boolean p0, p0, Loe0;->q:Z

    .line 265
    .line 266
    if-eqz p0, :cond_12

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_12
    move-object v5, v1

    .line 270
    :goto_7
    if-eqz v5, :cond_13

    .line 271
    .line 272
    iget-wide v0, v5, Lxq0;->f:J

    .line 273
    .line 274
    invoke-static {v0, v1}, Lo30;->C(J)J

    .line 275
    .line 276
    .line 277
    move-result-wide v0

    .line 278
    const-wide/16 v2, 0x0

    .line 279
    .line 280
    invoke-static {v2, v3, v0, v1}, Lv50;->b(JJ)Lst0;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    :cond_13
    :goto_8
    return-object v1

    .line 285
    :pswitch_5
    check-cast v5, Lc4;

    .line 286
    .line 287
    check-cast p0, Lmy0;

    .line 288
    .line 289
    iget-object v0, p0, Lmy0;->h:Lhy0;

    .line 290
    .line 291
    iget-object v1, p0, Lmy0;->i:Lhy0;

    .line 292
    .line 293
    iget-object v2, p0, Lmy0;->f:Ljava/lang/Float;

    .line 294
    .line 295
    iget-object v3, p0, Lmy0;->g:Ljava/lang/Float;

    .line 296
    .line 297
    const/4 v6, 0x0

    .line 298
    if-eqz v0, :cond_14

    .line 299
    .line 300
    if-eqz v2, :cond_14

    .line 301
    .line 302
    iget-object v7, v0, Lhy0;->a:Lhw;

    .line 303
    .line 304
    invoke-interface {v7}, Lhw;->invoke()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    check-cast v7, Ljava/lang/Number;

    .line 309
    .line 310
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    sub-float/2addr v7, v2

    .line 319
    goto :goto_9

    .line 320
    :cond_14
    move v7, v6

    .line 321
    :goto_9
    if-eqz v1, :cond_15

    .line 322
    .line 323
    if-eqz v3, :cond_15

    .line 324
    .line 325
    iget-object v2, v1, Lhy0;->a:Lhw;

    .line 326
    .line 327
    invoke-interface {v2}, Lhw;->invoke()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    check-cast v2, Ljava/lang/Number;

    .line 332
    .line 333
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    sub-float/2addr v2, v3

    .line 342
    goto :goto_a

    .line 343
    :cond_15
    move v2, v6

    .line 344
    :goto_a
    cmpg-float v3, v7, v6

    .line 345
    .line 346
    if-nez v3, :cond_16

    .line 347
    .line 348
    cmpg-float v2, v2, v6

    .line 349
    .line 350
    if-nez v2, :cond_16

    .line 351
    .line 352
    goto :goto_b

    .line 353
    :cond_16
    iget v2, p0, Lmy0;->d:I

    .line 354
    .line 355
    invoke-virtual {v5, v2}, Lc4;->s(I)I

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    invoke-virtual {v5}, Lc4;->k()Lu20;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    iget v6, v5, Lc4;->o:I

    .line 364
    .line 365
    invoke-virtual {v3, v6}, Lu20;->b(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    check-cast v3, Lzz0;

    .line 370
    .line 371
    if-eqz v3, :cond_17

    .line 372
    .line 373
    :try_start_0
    iget-object v6, v5, Lc4;->q:Le1;

    .line 374
    .line 375
    if-eqz v6, :cond_17

    .line 376
    .line 377
    invoke-virtual {v5, v3}, Lc4;->c(Lzz0;)Landroid/graphics/Rect;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    iget-object v6, v6, Le1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 382
    .line 383
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 384
    .line 385
    .line 386
    :catch_0
    :cond_17
    invoke-virtual {v5}, Lc4;->k()Lu20;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    iget v6, v5, Lc4;->p:I

    .line 391
    .line 392
    invoke-virtual {v3, v6}, Lu20;->b(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    check-cast v3, Lzz0;

    .line 397
    .line 398
    if-eqz v3, :cond_18

    .line 399
    .line 400
    :try_start_1
    iget-object v6, v5, Lc4;->r:Le1;

    .line 401
    .line 402
    if-eqz v6, :cond_18

    .line 403
    .line 404
    invoke-virtual {v5, v3}, Lc4;->c(Lzz0;)Landroid/graphics/Rect;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    iget-object v6, v6, Le1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 409
    .line 410
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 411
    .line 412
    .line 413
    :catch_1
    :cond_18
    iget-object v3, v5, Lc4;->g:Lw3;

    .line 414
    .line 415
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v5}, Lc4;->k()Lu20;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    invoke-virtual {v3, v2}, Lu20;->b(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    check-cast v3, Lzz0;

    .line 427
    .line 428
    if-eqz v3, :cond_1b

    .line 429
    .line 430
    iget-object v3, v3, Lzz0;->a:Lxz0;

    .line 431
    .line 432
    if-eqz v3, :cond_1b

    .line 433
    .line 434
    iget-object v3, v3, Lxz0;->c:Lb60;

    .line 435
    .line 436
    if-eqz v3, :cond_1b

    .line 437
    .line 438
    if-eqz v0, :cond_19

    .line 439
    .line 440
    iget-object v6, v5, Lc4;->t:Lug0;

    .line 441
    .line 442
    invoke-virtual {v6, v2, v0}, Lug0;->i(ILjava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    :cond_19
    if-eqz v1, :cond_1a

    .line 446
    .line 447
    iget-object v6, v5, Lc4;->u:Lug0;

    .line 448
    .line 449
    invoke-virtual {v6, v2, v1}, Lug0;->i(ILjava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    :cond_1a
    invoke-virtual {v5, v3}, Lc4;->o(Lb60;)V

    .line 453
    .line 454
    .line 455
    :cond_1b
    :goto_b
    if-eqz v0, :cond_1c

    .line 456
    .line 457
    iget-object v0, v0, Lhy0;->a:Lhw;

    .line 458
    .line 459
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    check-cast v0, Ljava/lang/Float;

    .line 464
    .line 465
    iput-object v0, p0, Lmy0;->f:Ljava/lang/Float;

    .line 466
    .line 467
    :cond_1c
    if-eqz v1, :cond_1d

    .line 468
    .line 469
    iget-object v0, v1, Lhy0;->a:Lhw;

    .line 470
    .line 471
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    check-cast v0, Ljava/lang/Float;

    .line 476
    .line 477
    iput-object v0, p0, Lmy0;->g:Ljava/lang/Float;

    .line 478
    .line 479
    :cond_1d
    return-object v4

    .line 480
    :pswitch_6
    check-cast p0, Lw3;

    .line 481
    .line 482
    check-cast v5, Landroid/view/MotionEvent;

    .line 483
    .line 484
    invoke-static {p0, v5}, Lw3;->f(Lw3;Landroid/view/MotionEvent;)Z

    .line 485
    .line 486
    .line 487
    move-result p0

    .line 488
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    return-object p0

    .line 493
    :pswitch_7
    check-cast p0, Lw3;

    .line 494
    .line 495
    check-cast v5, Landroid/view/KeyEvent;

    .line 496
    .line 497
    invoke-static {p0, v5}, Lw3;->g(Lw3;Landroid/view/KeyEvent;)Z

    .line 498
    .line 499
    .line 500
    move-result p0

    .line 501
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    return-object p0

    .line 506
    nop

    .line 507
    :pswitch_data_0
    .packed-switch 0x0
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
