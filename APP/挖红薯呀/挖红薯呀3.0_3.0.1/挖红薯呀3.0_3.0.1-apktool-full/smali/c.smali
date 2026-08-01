.class public final synthetic Lc;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lc;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lc;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lc;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lc;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lkf1;

    .line 12
    .line 13
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroid/app/Activity;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v0, p0, p1}, Lkf1;->c(Lkf1;Landroid/app/Activity;Z)Lna1;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lde1;

    .line 31
    .line 32
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroid/view/View;

    .line 35
    .line 36
    check-cast p1, Loo;

    .line 37
    .line 38
    iget-object p1, v0, Lde1;->u:Lm20;

    .line 39
    .line 40
    iget v1, v0, Lde1;->t:I

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    sget v1, Lkc1;->a:I

    .line 45
    .line 46
    invoke-static {p0, p1}, Lgc1;->a(Landroid/view/View;Lrk0;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1}, Lkc1;->a(Landroid/view/View;Lgd1;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    iget p1, v0, Lde1;->t:I

    .line 65
    .line 66
    add-int/2addr p1, v3

    .line 67
    iput p1, v0, Lde1;->t:I

    .line 68
    .line 69
    new-instance p1, Ln4;

    .line 70
    .line 71
    const/4 v1, 0x5

    .line 72
    invoke-direct {p1, v1, v0, p0}, Ln4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_1
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lva1;

    .line 79
    .line 80
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lsw;

    .line 83
    .line 84
    check-cast p1, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget p1, v0, Lva1;->e:F

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    iput v1, v0, Lva1;->e:F

    .line 93
    .line 94
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lna1;->a:Lna1;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_2
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lb91;

    .line 107
    .line 108
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lw81;

    .line 111
    .line 112
    check-cast p1, Loo;

    .line 113
    .line 114
    new-instance p1, Ln4;

    .line 115
    .line 116
    const/4 v1, 0x4

    .line 117
    invoke-direct {p1, v1, v0, p0}, Ln4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object p1

    .line 121
    :pswitch_3
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lb91;

    .line 124
    .line 125
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p0, Lb91;

    .line 128
    .line 129
    check-cast p1, Loo;

    .line 130
    .line 131
    iget-object p1, v0, Lb91;->j:Lc31;

    .line 132
    .line 133
    invoke-virtual {p1, p0}, Lc31;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    new-instance p1, Ln4;

    .line 137
    .line 138
    const/4 v1, 0x3

    .line 139
    invoke-direct {p1, v1, v0, p0}, Ln4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-object p1

    .line 143
    :pswitch_4
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, Lyk;

    .line 146
    .line 147
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p0, Lb91;

    .line 150
    .line 151
    check-cast p1, Loo;

    .line 152
    .line 153
    new-instance p1, Lb41;

    .line 154
    .line 155
    invoke-direct {p1, p0, v2}, Lb41;-><init>(Lb91;Lik;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v2, p1, v3}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 159
    .line 160
    .line 161
    new-instance p0, La91;

    .line 162
    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_5
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Ljz0;

    .line 170
    .line 171
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p0, Llz0;

    .line 174
    .line 175
    check-cast p1, Laq;

    .line 176
    .line 177
    iget-boolean v2, p1, Laq;->b:Z

    .line 178
    .line 179
    if-eqz v2, :cond_2

    .line 180
    .line 181
    const/high16 v2, -0x40800000    # -1.0f

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_2
    const/high16 v2, 0x3f800000    # 1.0f

    .line 185
    .line 186
    :goto_0
    iget-wide v4, p1, Laq;->a:J

    .line 187
    .line 188
    iget-object p0, p0, Llz0;->d:Lum0;

    .line 189
    .line 190
    sget-object p1, Lum0;->e:Lum0;

    .line 191
    .line 192
    if-ne p0, p1, :cond_3

    .line 193
    .line 194
    invoke-static {v3, v4, v5}, Lok0;->a(IJ)J

    .line 195
    .line 196
    .line 197
    move-result-wide p0

    .line 198
    goto :goto_1

    .line 199
    :cond_3
    invoke-static {v1, v4, v5}, Lok0;->a(IJ)J

    .line 200
    .line 201
    .line 202
    move-result-wide p0

    .line 203
    :goto_1
    invoke-static {v2, p0, p1}, Lok0;->f(FJ)J

    .line 204
    .line 205
    .line 206
    move-result-wide p0

    .line 207
    invoke-virtual {v0, v3, p0, p1}, Ljz0;->a(IJ)J

    .line 208
    .line 209
    .line 210
    sget-object p0, Lna1;->a:Lna1;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_6
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Luh0;

    .line 216
    .line 217
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p0, Lfd1;

    .line 220
    .line 221
    check-cast p1, Lfd1;

    .line 222
    .line 223
    new-instance v1, Lgt;

    .line 224
    .line 225
    invoke-direct {v1, p0, p1}, Lgt;-><init>(Lfd1;Lfd1;)V

    .line 226
    .line 227
    .line 228
    iget-object p0, v0, Luh0;->a:Lgp0;

    .line 229
    .line 230
    invoke-virtual {p0, v1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    sget-object p0, Lna1;->a:Lna1;

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_7
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lot0;

    .line 239
    .line 240
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p0, Ljava/lang/Throwable;

    .line 243
    .line 244
    check-cast p1, Ljava/lang/Throwable;

    .line 245
    .line 246
    iget-object v1, v0, Lot0;->c:Ljava/lang/Object;

    .line 247
    .line 248
    monitor-enter v1

    .line 249
    if-eqz p0, :cond_5

    .line 250
    .line 251
    if-eqz p1, :cond_6

    .line 252
    .line 253
    :try_start_0
    instance-of v3, p1, Ljava/util/concurrent/CancellationException;

    .line 254
    .line 255
    if-nez v3, :cond_4

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_4
    move-object p1, v2

    .line 259
    :goto_2
    if-eqz p1, :cond_6

    .line 260
    .line 261
    invoke-static {p0, p1}, Lkl;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :catchall_0
    move-exception v0

    .line 266
    move-object p0, v0

    .line 267
    goto :goto_4

    .line 268
    :cond_5
    move-object p0, v2

    .line 269
    :cond_6
    :goto_3
    iput-object p0, v0, Lot0;->e:Ljava/lang/Throwable;

    .line 270
    .line 271
    iget-object p0, v0, Lot0;->u:Lz31;

    .line 272
    .line 273
    sget-object p1, Ljt0;->d:Ljt0;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v2, p1}, Lz31;->j(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 279
    .line 280
    .line 281
    monitor-exit v1

    .line 282
    sget-object p0, Lna1;->a:Lna1;

    .line 283
    .line 284
    return-object p0

    .line 285
    :goto_4
    monitor-exit v1

    .line 286
    throw p0

    .line 287
    :pswitch_8
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, Lyi;

    .line 290
    .line 291
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast p0, Lkh0;

    .line 294
    .line 295
    invoke-virtual {v0, p1}, Lyi;->A(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    if-eqz p0, :cond_7

    .line 299
    .line 300
    invoke-virtual {p0, p1}, Lkh0;->a(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    :cond_7
    sget-object p0, Lna1;->a:Lna1;

    .line 304
    .line 305
    return-object p0

    .line 306
    :pswitch_9
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, Loh0;

    .line 309
    .line 310
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p0, Ljava/util/ArrayList;

    .line 313
    .line 314
    check-cast p1, Lwq0;

    .line 315
    .line 316
    new-instance v1, Lyc0;

    .line 317
    .line 318
    invoke-direct {v1, v3, p0}, Lyc0;-><init>(ILjava/util/ArrayList;)V

    .line 319
    .line 320
    .line 321
    iput-boolean v3, p1, Lwq0;->d:Z

    .line 322
    .line 323
    invoke-virtual {v1, p1}, Lyc0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    const/4 p0, 0x0

    .line 327
    iput-boolean p0, p1, Lwq0;->d:Z

    .line 328
    .line 329
    invoke-interface {v0}, Lw31;->getValue()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    sget-object p0, Lna1;->a:Lna1;

    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_a
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Lin0;

    .line 338
    .line 339
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast p0, Lxq0;

    .line 342
    .line 343
    check-cast p1, Lwq0;

    .line 344
    .line 345
    iget-boolean v1, v0, Lin0;->v:Z

    .line 346
    .line 347
    iget v2, v0, Lin0;->r:F

    .line 348
    .line 349
    if-eqz v1, :cond_8

    .line 350
    .line 351
    invoke-interface {p1, v2}, Lym;->F(F)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    iget v0, v0, Lin0;->s:F

    .line 356
    .line 357
    invoke-interface {p1, v0}, Lym;->F(F)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    invoke-static {p1, p0, v1, v0}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 362
    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_8
    invoke-interface {p1, v2}, Lym;->F(F)I

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    iget v0, v0, Lin0;->s:F

    .line 370
    .line 371
    invoke-interface {p1, v0}, Lym;->F(F)I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    invoke-static {p1, p0, v1, v0}, Lwq0;->i(Lwq0;Lxq0;II)V

    .line 376
    .line 377
    .line 378
    :goto_5
    sget-object p0, Lna1;->a:Lna1;

    .line 379
    .line 380
    return-object p0

    .line 381
    :pswitch_b
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v0, Landroid/content/SharedPreferences;

    .line 384
    .line 385
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast p0, Lvf0$k;

    .line 388
    .line 389
    check-cast p1, Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    invoke-static {v0, p0, p1}, Lvf0;->p0(Landroid/content/SharedPreferences;Lvf0$k;Z)Lna1;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    return-object p0

    .line 400
    :pswitch_c
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, Landroid/content/SharedPreferences;

    .line 403
    .line 404
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast p0, Lvf0$l;

    .line 407
    .line 408
    check-cast p1, Ljava/lang/Boolean;

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    invoke-static {v0, p0, p1}, Lvf0;->m(Landroid/content/SharedPreferences;Lvf0$l;Z)Lna1;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    return-object p0

    .line 419
    :pswitch_d
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v0, Ltop/anjao2024/xp1whs/MainActivity;

    .line 422
    .line 423
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast p0, Loh0;

    .line 426
    .line 427
    check-cast p1, Ljava/lang/Boolean;

    .line 428
    .line 429
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    invoke-static {v0, p0, p1}, Ltop/anjao2024/xp1whs/MainActivity;->f(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Z)Lna1;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    return-object p0

    .line 438
    :pswitch_e
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v0, Lzw0;

    .line 441
    .line 442
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast p0, Lyw0;

    .line 445
    .line 446
    check-cast p1, Ljava/util/Map;

    .line 447
    .line 448
    new-instance v1, Lf90;

    .line 449
    .line 450
    invoke-direct {v1, v0, p1, p0}, Lf90;-><init>(Lzw0;Ljava/util/Map;Lyw0;)V

    .line 451
    .line 452
    .line 453
    return-object v1

    .line 454
    :pswitch_f
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, Lf90;

    .line 457
    .line 458
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast p1, Loo;

    .line 461
    .line 462
    iget-object p1, v0, Lf90;->f:Lkh0;

    .line 463
    .line 464
    invoke-virtual {p1, p0}, Lkh0;->i(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    new-instance p1, Ln4;

    .line 468
    .line 469
    invoke-direct {p1, v1, v0, p0}, Ln4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-object p1

    .line 473
    :pswitch_10
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v0, Ljava/lang/String;

    .line 476
    .line 477
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast p0, Landroid/widget/ImageView;

    .line 480
    .line 481
    check-cast p1, Landroid/graphics/Bitmap;

    .line 482
    .line 483
    invoke-static {v0, p0, p1}, Lm00;->X(Ljava/lang/String;Landroid/widget/ImageView;Landroid/graphics/Bitmap;)Lna1;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    return-object p0

    .line 488
    :pswitch_11
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v0, Ljava/lang/String;

    .line 491
    .line 492
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast p0, Lm00;

    .line 495
    .line 496
    check-cast p1, Landroid/graphics/Bitmap;

    .line 497
    .line 498
    invoke-static {v0, p0, p1}, Lm00;->Q(Ljava/lang/String;Lm00;Landroid/graphics/Bitmap;)Lna1;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    return-object p0

    .line 503
    :pswitch_12
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Lhy;

    .line 506
    .line 507
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast p0, Lgy;

    .line 510
    .line 511
    check-cast p1, Ljava/lang/Throwable;

    .line 512
    .line 513
    iget-object p1, v0, Lhy;->f:Landroid/os/Handler;

    .line 514
    .line 515
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 516
    .line 517
    .line 518
    sget-object p0, Lna1;->a:Lna1;

    .line 519
    .line 520
    return-object p0

    .line 521
    :pswitch_13
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, Lxg0;

    .line 524
    .line 525
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast p0, Lf30;

    .line 528
    .line 529
    check-cast p1, Ljava/lang/Throwable;

    .line 530
    .line 531
    invoke-virtual {v0, p0}, Lxg0;->c(Lf30;)V

    .line 532
    .line 533
    .line 534
    sget-object p0, Lna1;->a:Lna1;

    .line 535
    .line 536
    return-object p0

    .line 537
    :pswitch_14
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v0, Leb;

    .line 540
    .line 541
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast p0, Lyj;

    .line 544
    .line 545
    check-cast p1, Ljava/lang/Throwable;

    .line 546
    .line 547
    iget-object p1, v0, Leb;->a:Lsh0;

    .line 548
    .line 549
    invoke-virtual {p1, p0}, Lsh0;->j(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    sget-object p0, Lna1;->a:Lna1;

    .line 553
    .line 554
    return-object p0

    .line 555
    :pswitch_15
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v0, Lwm0;

    .line 558
    .line 559
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 560
    .line 561
    move-object v3, p0

    .line 562
    check-cast v3, Lpf1;

    .line 563
    .line 564
    move-object v1, p1

    .line 565
    check-cast v1, Ld60;

    .line 566
    .line 567
    invoke-virtual {v1}, Ld60;->a()V

    .line 568
    .line 569
    .line 570
    iget-object v2, v0, Lwm0;->a:Ld6;

    .line 571
    .line 572
    const/4 v5, 0x0

    .line 573
    const/16 v6, 0x3c

    .line 574
    .line 575
    const/4 v4, 0x0

    .line 576
    invoke-static/range {v1 .. v6}, Luq;->h0(Luq;Ld6;Lpf1;FLs41;I)V

    .line 577
    .line 578
    .line 579
    sget-object p0, Lna1;->a:Lna1;

    .line 580
    .line 581
    return-object p0

    .line 582
    :pswitch_16
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 583
    .line 584
    move-object v2, v0

    .line 585
    check-cast v2, Ld6;

    .line 586
    .line 587
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 588
    .line 589
    move-object v3, p0

    .line 590
    check-cast v3, Lpf1;

    .line 591
    .line 592
    move-object v1, p1

    .line 593
    check-cast v1, Ld60;

    .line 594
    .line 595
    invoke-virtual {v1}, Ld60;->a()V

    .line 596
    .line 597
    .line 598
    const/4 v5, 0x0

    .line 599
    const/16 v6, 0x3c

    .line 600
    .line 601
    const/4 v4, 0x0

    .line 602
    invoke-static/range {v1 .. v6}, Luq;->h0(Luq;Ld6;Lpf1;FLs41;I)V

    .line 603
    .line 604
    .line 605
    sget-object p0, Lna1;->a:Lna1;

    .line 606
    .line 607
    return-object p0

    .line 608
    :pswitch_17
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v0, Ln9;

    .line 611
    .line 612
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast p0, Lo9;

    .line 615
    .line 616
    check-cast p1, Lfu0;

    .line 617
    .line 618
    sget-object p1, Lna1;->a:Lna1;

    .line 619
    .line 620
    iget-object v1, v0, Ln9;->r:Ld81;

    .line 621
    .line 622
    if-eqz v1, :cond_9

    .line 623
    .line 624
    invoke-virtual {v1}, Ld81;->b()V

    .line 625
    .line 626
    .line 627
    :cond_9
    iput-object v2, v0, Ln9;->r:Ld81;

    .line 628
    .line 629
    iget-object v0, p0, Lo9;->b:Log;

    .line 630
    .line 631
    if-eqz v0, :cond_d

    .line 632
    .line 633
    :cond_a
    invoke-virtual {v0}, Lj40;->N()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-virtual {v0, v1, p1}, Lj40;->h0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    sget-object v3, Ls91;->l:Lzr;

    .line 642
    .line 643
    if-ne v1, v3, :cond_b

    .line 644
    .line 645
    goto :goto_6

    .line 646
    :cond_b
    sget-object v3, Ls91;->m:Lzr;

    .line 647
    .line 648
    if-ne v1, v3, :cond_c

    .line 649
    .line 650
    goto :goto_6

    .line 651
    :cond_c
    sget-object v3, Ls91;->n:Lzr;

    .line 652
    .line 653
    if-eq v1, v3, :cond_a

    .line 654
    .line 655
    :cond_d
    :goto_6
    iput-object v2, p0, Lo9;->b:Log;

    .line 656
    .line 657
    return-object p1

    .line 658
    :pswitch_18
    iget-object v0, p0, Lc;->e:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v0, Lxg0;

    .line 661
    .line 662
    iget-object p0, p0, Lc;->f:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast p0, Lis0;

    .line 665
    .line 666
    check-cast p1, Ljava/lang/Throwable;

    .line 667
    .line 668
    invoke-virtual {v0, p0}, Lxg0;->c(Lf30;)V

    .line 669
    .line 670
    .line 671
    sget-object p0, Lna1;->a:Lna1;

    .line 672
    .line 673
    return-object p0

    .line 674
    nop

    .line 675
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
