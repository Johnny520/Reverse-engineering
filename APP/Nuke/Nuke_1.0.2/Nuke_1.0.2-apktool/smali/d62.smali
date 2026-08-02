.class public final synthetic Ld62;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld62;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Ld62;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ld62;->j:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ld62;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lff3;

    .line 15
    .line 16
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/view/View;

    .line 19
    .line 20
    check-cast p1, Lba0;

    .line 21
    .line 22
    iget-object p1, v0, Lff3;->u:Lc01;

    .line 23
    .line 24
    iget v1, v0, Lff3;->t:I

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    sget v1, Lwa3;->a:I

    .line 29
    .line 30
    invoke-static {p0, p1}, Lra3;->b(Landroid/view/View;Lgt1;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p1}, Lwa3;->b(Landroid/view/View;Lwd3;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget p1, v0, Lff3;->t:I

    .line 49
    .line 50
    add-int/2addr p1, v5

    .line 51
    iput p1, v0, Lff3;->t:I

    .line 52
    .line 53
    new-instance p1, Llj;

    .line 54
    .line 55
    const/4 v1, 0x6

    .line 56
    invoke-direct {p1, v1, v0, p0}, Llj;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_0
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Landroid/content/Context;

    .line 63
    .line 64
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Ljc3;

    .line 67
    .line 68
    check-cast p1, Landroid/widget/ImageView;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lx82;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object p0, p0, Ljc3;->c:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Lx82;->b(Ljava/lang/String;)Ls82;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Lwj;->d()Lwj;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ls82;

    .line 88
    .line 89
    invoke-virtual {p0}, Lwj;->n()Lwj;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Ls82;

    .line 94
    .line 95
    invoke-virtual {p0}, Lwj;->i()Lwj;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Ls82;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ls82;->C(Landroid/widget/ImageView;)V

    .line 102
    .line 103
    .line 104
    sget-object p0, La83;->a:La83;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_1
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lp83;

    .line 110
    .line 111
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p0, Lin0;

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Long;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget p1, v0, Lp83;->e:F

    .line 121
    .line 122
    iput v4, v0, Lp83;->e:F

    .line 123
    .line 124
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    sget-object p0, La83;->a:La83;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_2
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Ly33;

    .line 137
    .line 138
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p0, Lu33;

    .line 141
    .line 142
    check-cast p1, Lba0;

    .line 143
    .line 144
    new-instance p1, Llj;

    .line 145
    .line 146
    const/4 v1, 0x5

    .line 147
    invoke-direct {p1, v1, v0, p0}, Llj;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_3
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Ly33;

    .line 154
    .line 155
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, Ly33;

    .line 158
    .line 159
    check-cast p1, Lba0;

    .line 160
    .line 161
    iget-object p1, v0, Ly33;->j:Lps2;

    .line 162
    .line 163
    invoke-virtual {p1, p0}, Lps2;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    new-instance p1, Llj;

    .line 167
    .line 168
    invoke-direct {p1, v3, v0, p0}, Llj;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-object p1

    .line 172
    :pswitch_4
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lj20;

    .line 175
    .line 176
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Ly33;

    .line 179
    .line 180
    check-cast p1, Lba0;

    .line 181
    .line 182
    new-instance p1, Llu2;

    .line 183
    .line 184
    invoke-direct {p1, p0, v6}, Llu2;-><init>(Ly33;Lt00;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0, v6, p1, v5}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 188
    .line 189
    .line 190
    new-instance p0, Lka;

    .line 191
    .line 192
    invoke-direct {p0, v2}, Lka;-><init>(I)V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_5
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Lin0;

    .line 199
    .line 200
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p0, Lxk1;

    .line 203
    .line 204
    check-cast p1, Lx13;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-static {p1}, Lgf1;->U(Lx13;)J

    .line 213
    .line 214
    .line 215
    move-result-wide p0

    .line 216
    invoke-static {p0, p1}, Lp7;->O(J)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-interface {v0, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    sget-object p0, La83;->a:La83;

    .line 224
    .line 225
    return-object p0

    .line 226
    :pswitch_6
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lgm2;

    .line 229
    .line 230
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p0, Lim2;

    .line 233
    .line 234
    check-cast p1, Lnb0;

    .line 235
    .line 236
    iget-boolean v2, p1, Lnb0;->b:Z

    .line 237
    .line 238
    if-eqz v2, :cond_2

    .line 239
    .line 240
    const/high16 v2, -0x40800000    # -1.0f

    .line 241
    .line 242
    goto :goto_0

    .line 243
    :cond_2
    const/high16 v2, 0x3f800000    # 1.0f

    .line 244
    .line 245
    :goto_0
    iget-wide v6, p1, Lnb0;->a:J

    .line 246
    .line 247
    iget-object p0, p0, Lim2;->d:Lqv1;

    .line 248
    .line 249
    sget-object p1, Lqv1;->i:Lqv1;

    .line 250
    .line 251
    if-ne p0, p1, :cond_3

    .line 252
    .line 253
    invoke-static {v4, v5, v6, v7}, Lrs1;->a(FIJ)J

    .line 254
    .line 255
    .line 256
    move-result-wide p0

    .line 257
    goto :goto_1

    .line 258
    :cond_3
    invoke-static {v4, v1, v6, v7}, Lrs1;->a(FIJ)J

    .line 259
    .line 260
    .line 261
    move-result-wide p0

    .line 262
    :goto_1
    invoke-static {v2, p0, p1}, Lrs1;->f(FJ)J

    .line 263
    .line 264
    .line 265
    move-result-wide p0

    .line 266
    invoke-virtual {v0, p0, p1, v5}, Lgm2;->a(JI)J

    .line 267
    .line 268
    .line 269
    sget-object p0, La83;->a:La83;

    .line 270
    .line 271
    return-object p0

    .line 272
    :pswitch_7
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Lkf2;

    .line 275
    .line 276
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p0, Landroid/content/Context;

    .line 279
    .line 280
    check-cast p1, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    iget-object v0, v0, Lkf2;->o:Lif2;

    .line 286
    .line 287
    if-eqz v0, :cond_e

    .line 288
    .line 289
    iget-object v0, v0, Lif2;->a:Luf2;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_b

    .line 296
    .line 297
    if-eq v0, v5, :cond_9

    .line 298
    .line 299
    if-eq v0, v1, :cond_6

    .line 300
    .line 301
    if-eq v0, v2, :cond_5

    .line 302
    .line 303
    if-eq v0, v3, :cond_4

    .line 304
    .line 305
    invoke-static {}, Lc80;->s()V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_6

    .line 309
    .line 310
    :cond_4
    const p1, 0x790b0206

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    goto/16 :goto_6

    .line 321
    .line 322
    :cond_5
    invoke-static {p1}, Ll31;->c(Ljava/lang/String;)Li41;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    :goto_2
    move-object v6, p0

    .line 327
    goto/16 :goto_4

    .line 328
    .line 329
    :cond_6
    invoke-static {p1}, Lvv2;->V(Ljava/lang/String;)Ljava/lang/Double;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-eqz v0, :cond_8

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 336
    .line 337
    .line 338
    move-result-wide v1

    .line 339
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 340
    .line 341
    .line 342
    move-result-wide v1

    .line 343
    const-wide v3, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    cmpg-double v1, v1, v3

    .line 349
    .line 350
    if-gtz v1, :cond_7

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_7
    move-object v0, v6

    .line 354
    :goto_3
    if-eqz v0, :cond_8

    .line 355
    .line 356
    invoke-static {v0}, Ll31;->b(Ljava/lang/Number;)Li41;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    goto :goto_2

    .line 361
    :cond_8
    const v0, 0x790b0202

    .line 362
    .line 363
    .line 364
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_9
    const/16 v0, 0xa

    .line 377
    .line 378
    invoke-static {p1, v0}, Lwv2;->g0(Ljava/lang/String;I)Ljava/lang/Long;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    if-eqz v0, :cond_a

    .line 383
    .line 384
    invoke-static {v0}, Ll31;->b(Ljava/lang/Number;)Li41;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    goto :goto_2

    .line 389
    :cond_a
    const v0, 0x790b0201

    .line 390
    .line 391
    .line 392
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    goto :goto_6

    .line 404
    :cond_b
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 405
    .line 406
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    const-string v1, "true"

    .line 414
    .line 415
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    if-eqz v1, :cond_c

    .line 420
    .line 421
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-static {p0}, Ll31;->a(Ljava/lang/Boolean;)Li41;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    goto :goto_2

    .line 428
    :cond_c
    const-string v1, "false"

    .line 429
    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-eqz v0, :cond_d

    .line 435
    .line 436
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 437
    .line 438
    invoke-static {p0}, Ll31;->a(Ljava/lang/Boolean;)Li41;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    goto :goto_2

    .line 443
    :goto_4
    if-nez v6, :cond_f

    .line 444
    .line 445
    goto :goto_5

    .line 446
    :cond_d
    const p1, 0x790b01f3

    .line 447
    .line 448
    .line 449
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_e
    :goto_5
    invoke-static {p1}, Ll31;->c(Ljava/lang/String;)Li41;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    :cond_f
    :goto_6
    return-object v6

    .line 462
    :pswitch_8
    iget-object v0, p0, Ld62;->i:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Li62;

    .line 465
    .line 466
    iget-object p0, p0, Ld62;->j:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast p0, Ljava/lang/Throwable;

    .line 469
    .line 470
    check-cast p1, Ljava/lang/Throwable;

    .line 471
    .line 472
    iget-object v1, v0, Li62;->c:Ljava/lang/Object;

    .line 473
    .line 474
    monitor-enter v1

    .line 475
    if-eqz p0, :cond_11

    .line 476
    .line 477
    if-eqz p1, :cond_12

    .line 478
    .line 479
    :try_start_0
    instance-of v2, p1, Ljava/util/concurrent/CancellationException;

    .line 480
    .line 481
    if-nez v2, :cond_10

    .line 482
    .line 483
    goto :goto_7

    .line 484
    :cond_10
    move-object p1, v6

    .line 485
    :goto_7
    if-eqz p1, :cond_12

    .line 486
    .line 487
    invoke-static {p0, p1}, Lfg1;->m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 488
    .line 489
    .line 490
    goto :goto_8

    .line 491
    :catchall_0
    move-exception p0

    .line 492
    goto :goto_9

    .line 493
    :cond_11
    move-object p0, v6

    .line 494
    :cond_12
    :goto_8
    iput-object p0, v0, Li62;->e:Ljava/lang/Throwable;

    .line 495
    .line 496
    iget-object p0, v0, Li62;->u:Lju2;

    .line 497
    .line 498
    sget-object p1, Lf62;->h:Lf62;

    .line 499
    .line 500
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-virtual {p0, v6, p1}, Lju2;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 504
    .line 505
    .line 506
    monitor-exit v1

    .line 507
    sget-object p0, La83;->a:La83;

    .line 508
    .line 509
    return-object p0

    .line 510
    :goto_9
    monitor-exit v1

    .line 511
    throw p0

    .line 512
    nop

    .line 513
    :pswitch_data_0
    .packed-switch 0x0
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
