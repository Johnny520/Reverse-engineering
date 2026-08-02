.class public final synthetic Lw;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw;->h:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget p0, p0, Lw;->h:I

    .line 2
    .line 3
    const-string v0, "sendId"

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    const-string v2, ": "

    .line 7
    .line 8
    const-string v3, "in blacklist"

    .line 9
    .line 10
    const-string v4, "not in whitelist"

    .line 11
    .line 12
    const-class v5, Landroid/widget/Button;

    .line 13
    .line 14
    const-string v6, "SnsInfo"

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    const/4 v8, 0x1

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    sget-object v11, La83;->a:La83;

    .line 21
    .line 22
    packed-switch p0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast p1, Lcj0;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string p0, "com.tencent.mm.ui.chatting.viewitems"

    .line 31
    .line 32
    filled-new-array {p0}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iput-object p0, p1, Lcj0;->t:Ljava/util/List;

    .line 41
    .line 42
    new-instance p0, Lat;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v0, "MicroMsg.ChattingItemContainer"

    .line 48
    .line 49
    filled-new-array {v0}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 57
    .line 58
    return-object v11

    .line 59
    :pswitch_0
    check-cast p1, Ljg3;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lup0;->k:Landroid/app/Activity;

    .line 65
    .line 66
    if-eqz p0, :cond_0

    .line 67
    .line 68
    new-instance v0, Lm2;

    .line 69
    .line 70
    const/4 v1, 0x4

    .line 71
    invoke-direct {v0, v1, p1}, Lm2;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    return-object v11

    .line 78
    :cond_0
    const-string p0, "hostAct"

    .line 79
    .line 80
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v9

    .line 84
    :pswitch_1
    check-cast p1, Lhd3;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object p0, Ljr;->d:Ljr;

    .line 90
    .line 91
    iget-object p1, p1, Lhd3;->a:Lyi1;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lte;->l0(Lyi1;)Lby0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-nez p0, :cond_1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    sget-object p1, Ljr;->j:Lz52;

    .line 104
    .line 105
    iget-object v0, p0, Lby0;->d:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lz52;->a(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_2

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    sget-object p1, Ljr;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    sget-object p1, Ljr;->m:Ljava/util/concurrent/ExecutorService;

    .line 121
    .line 122
    new-instance v2, Ly;

    .line 123
    .line 124
    invoke-direct {v2, p0, v0, v1, v8}, Ly;-><init>(Lby0;JI)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    :goto_0
    return-object v11

    .line 131
    :pswitch_2
    check-cast p1, Ljg3;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    aget-object p0, p0, v10

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    check-cast p0, Ljava/lang/String;

    .line 146
    .line 147
    iget-object p1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 148
    .line 149
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    check-cast p1, Landroid/view/View;

    .line 155
    .line 156
    const-string v0, "https://jiazhang.qq.com/healthy/dist/faceRecognition/game_no.html?"

    .line 157
    .line 158
    invoke-static {p0, v0, v10}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_3

    .line 163
    .line 164
    const p0, 0x47c34f80    # 99999.0f

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationX(F)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    .line 171
    .line 172
    .line 173
    const p0, 0x3c23d70a    # 0.01f

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p0}, Landroid/view/View;->setScaleX(F)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p0}, Landroid/view/View;->setScaleY(F)V

    .line 180
    .line 181
    .line 182
    :cond_3
    return-object v11

    .line 183
    :pswitch_3
    check-cast p1, Lyy1;

    .line 184
    .line 185
    sget-object p0, Lr7;->b:Ltu2;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-static {p1, p0}, Lop0;->w(Lyy1;Le42;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, Landroid/content/Context;

    .line 195
    .line 196
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    const-string p1, "android.software.leanback"

    .line 201
    .line 202
    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-nez p0, :cond_4

    .line 207
    .line 208
    sget-object p0, Lvm;->a:Lum;

    .line 209
    .line 210
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    sget-object p0, Lum;->c:Ltm;

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_4
    sget-object p0, Lxm;->b:Lwm;

    .line 217
    .line 218
    :goto_1
    return-object p0

    .line 219
    :pswitch_4
    check-cast p1, Lrz1;

    .line 220
    .line 221
    return-object v11

    .line 222
    :pswitch_5
    check-cast p1, Lt61;

    .line 223
    .line 224
    invoke-virtual {p1}, Lt61;->a()V

    .line 225
    .line 226
    .line 227
    return-object v11

    .line 228
    :pswitch_6
    check-cast p1, Ldj0;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    const-string p0, "com.tencent.mm.app"

    .line 234
    .line 235
    filled-new-array {p0}, [Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 244
    .line 245
    new-instance p0, Lyg1;

    .line 246
    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 248
    .line 249
    .line 250
    const-string v0, "de.robv.android.xposed.XposedBridge"

    .line 251
    .line 252
    filled-new-array {v0}, [Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 260
    .line 261
    return-object v11

    .line 262
    :pswitch_7
    check-cast p1, Ljg3;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {p1, p0}, Ljg3;->b(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    return-object v11

    .line 273
    :pswitch_8
    check-cast p1, Ly03;

    .line 274
    .line 275
    sget p0, Lik;->a:I

    .line 276
    .line 277
    return-object v11

    .line 278
    :pswitch_9
    check-cast p1, Ljg3;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 284
    .line 285
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    invoke-static {v5}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-static {p1}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    if-nez p1, :cond_5

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_5
    move-object v5, p1

    .line 310
    :goto_2
    iput-object v5, p0, Lhi0;->g:Ljava/lang/Class;

    .line 311
    .line 312
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, Lpi0;

    .line 321
    .line 322
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    check-cast p0, Landroid/widget/Button;

    .line 330
    .line 331
    invoke-virtual {p0}, Landroid/view/View;->callOnClick()Z

    .line 332
    .line 333
    .line 334
    return-object v11

    .line 335
    :pswitch_a
    check-cast p1, Landroid/content/Context;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance p0, Landroid/widget/ImageView;

    .line 341
    .line 342
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 343
    .line 344
    .line 345
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 346
    .line 347
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 348
    .line 349
    .line 350
    return-object p0

    .line 351
    :pswitch_b
    check-cast p1, Lhd3;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    sget-object p0, Lii;->d:Lii;

    .line 357
    .line 358
    iget-object p1, p1, Lhd3;->a:Lyi1;

    .line 359
    .line 360
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    sget-object p0, Lii;->h:Ljava/lang/String;

    .line 364
    .line 365
    iget v0, p1, Lyi1;->e:I

    .line 366
    .line 367
    iget-object v5, p1, Lyi1;->c:Ljava/lang/String;

    .line 368
    .line 369
    const v6, 0x19000031

    .line 370
    .line 371
    .line 372
    if-ne v0, v6, :cond_11

    .line 373
    .line 374
    iget v0, p1, Lyi1;->a:I

    .line 375
    .line 376
    if-eqz v0, :cond_6

    .line 377
    .line 378
    goto/16 :goto_6

    .line 379
    .line 380
    :cond_6
    invoke-static {}, Lii;->r()Ldi;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iget-boolean v6, v0, Ldi;->b:Z

    .line 385
    .line 386
    if-eqz v6, :cond_7

    .line 387
    .line 388
    iget-object v7, v0, Ldi;->c:Ljava/util/Set;

    .line 389
    .line 390
    goto :goto_3

    .line 391
    :cond_7
    iget-object v7, v0, Ldi;->d:Ljava/util/Set;

    .line 392
    .line 393
    :goto_3
    if-eqz v6, :cond_8

    .line 394
    .line 395
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    goto :goto_4

    .line 400
    :cond_8
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    if-nez v7, :cond_9

    .line 405
    .line 406
    goto :goto_4

    .line 407
    :cond_9
    move v8, v10

    .line 408
    :goto_4
    if-nez v8, :cond_b

    .line 409
    .line 410
    if-eqz v6, :cond_a

    .line 411
    .line 412
    move-object v3, v4

    .line 413
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    const-string v0, "Skipping transfer from "

    .line 416
    .line 417
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    invoke-static {p0, p1}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    goto/16 :goto_6

    .line 437
    .line 438
    :cond_b
    :try_start_0
    invoke-static {p1}, Lii;->s(Lyi1;)Lhi;

    .line 439
    .line 440
    .line 441
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    goto :goto_5

    .line 443
    :catchall_0
    move-exception p1

    .line 444
    new-instance v2, Lx92;

    .line 445
    .line 446
    invoke-direct {v2, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 447
    .line 448
    .line 449
    move-object p1, v2

    .line 450
    :goto_5
    invoke-static {p1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    if-nez v2, :cond_10

    .line 455
    .line 456
    check-cast p1, Lhi;

    .line 457
    .line 458
    if-nez p1, :cond_c

    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_c
    iget-object v2, p1, Lhi;->d:Ljava/lang/String;

    .line 462
    .line 463
    invoke-static {}, Led3;->a()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    if-nez v4, :cond_d

    .line 472
    .line 473
    iget-object v4, p1, Lhi;->c:Ljava/lang/String;

    .line 474
    .line 475
    invoke-static {v4, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v4

    .line 479
    if-eqz v4, :cond_d

    .line 480
    .line 481
    iget-object p1, p1, Lhi;->b:Ljava/lang/String;

    .line 482
    .line 483
    const-string v0, "Skipping outgoing transfer: transferId="

    .line 484
    .line 485
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    invoke-static {p0, p1}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    goto :goto_6

    .line 493
    :cond_d
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    if-nez v4, :cond_e

    .line 498
    .line 499
    invoke-static {v2}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    if-nez v4, :cond_e

    .line 504
    .line 505
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v3

    .line 509
    if-nez v3, :cond_e

    .line 510
    .line 511
    const-string p1, "Skipping transfer addressed to "

    .line 512
    .line 513
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    invoke-static {p0, p1}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    goto :goto_6

    .line 521
    :cond_e
    sget-object p0, Lii;->j:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 522
    .line 523
    invoke-virtual {p1}, Lhi;->a()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result p0

    .line 531
    if-nez p0, :cond_f

    .line 532
    .line 533
    goto :goto_6

    .line 534
    :cond_f
    new-instance p0, Lr1;

    .line 535
    .line 536
    invoke-direct {p0, v1, v0, p1}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    const-string p1, "NukeReceiveTransferMoney"

    .line 540
    .line 541
    invoke-static {p1, p0}, Lea3;->b(Ljava/lang/String;Lxm0;)V

    .line 542
    .line 543
    .line 544
    goto :goto_6

    .line 545
    :cond_10
    invoke-static {v2}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    const-string v0, "Parse transfer failed: "

    .line 550
    .line 551
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    invoke-static {p0, p1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    :cond_11
    :goto_6
    return-object v11

    .line 559
    :pswitch_c
    check-cast p1, Landroid/content/Context;

    .line 560
    .line 561
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    new-instance p0, Landroid/widget/ImageView;

    .line 565
    .line 566
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 567
    .line 568
    .line 569
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 570
    .line 571
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 572
    .line 573
    .line 574
    return-object p0

    .line 575
    :pswitch_d
    check-cast p1, Ljg3;

    .line 576
    .line 577
    sget-object p0, Lhh;->d:Lhh;

    .line 578
    .line 579
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    iget-object p1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 583
    .line 584
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 585
    .line 586
    instance-of v0, p1, Landroid/app/Activity;

    .line 587
    .line 588
    if-eqz v0, :cond_12

    .line 589
    .line 590
    check-cast p1, Landroid/app/Activity;

    .line 591
    .line 592
    goto :goto_7

    .line 593
    :cond_12
    move-object p1, v9

    .line 594
    :goto_7
    if-nez p1, :cond_13

    .line 595
    .line 596
    goto/16 :goto_9

    .line 597
    .line 598
    :cond_13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 602
    .line 603
    .line 604
    move-result-object p0

    .line 605
    if-nez p0, :cond_14

    .line 606
    .line 607
    goto :goto_9

    .line 608
    :cond_14
    const-string v0, "Nuke.AutoReceiveRedPacket.ClickReceive"

    .line 609
    .line 610
    invoke-virtual {p0, v0, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    if-nez v0, :cond_15

    .line 615
    .line 616
    goto :goto_9

    .line 617
    :cond_15
    const-string v0, "Nuke.AutoReceiveRedPacket.ClickReceiveScheduled"

    .line 618
    .line 619
    invoke-virtual {p0, v0, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-eqz v1, :cond_16

    .line 624
    .line 625
    goto :goto_9

    .line 626
    :cond_16
    :try_start_1
    invoke-static {p1}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    invoke-virtual {v1}, Ln4;->r()Lhi0;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    invoke-virtual {v1}, Lzf1;->b()V

    .line 635
    .line 636
    .line 637
    new-instance v2, Lw;

    .line 638
    .line 639
    const/16 v3, 0xb

    .line 640
    .line 641
    invoke-direct {v2, v3}, Lw;-><init>(I)V

    .line 642
    .line 643
    .line 644
    iput-object v2, v1, Lhi0;->h:Lin0;

    .line 645
    .line 646
    invoke-virtual {v1}, Lhi0;->c()Ljava/util/List;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-static {v1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    check-cast v1, Lpi0;

    .line 655
    .line 656
    invoke-virtual {v1}, Lpi0;->g0()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    instance-of v2, v1, Landroid/widget/Button;

    .line 661
    .line 662
    if-eqz v2, :cond_17

    .line 663
    .line 664
    move-object v9, v1

    .line 665
    check-cast v9, Landroid/widget/Button;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 666
    .line 667
    goto :goto_8

    .line 668
    :catchall_1
    move-exception v1

    .line 669
    new-instance v9, Lx92;

    .line 670
    .line 671
    invoke-direct {v9, v1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 672
    .line 673
    .line 674
    :cond_17
    :goto_8
    invoke-static {v9}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    if-nez v1, :cond_19

    .line 679
    .line 680
    check-cast v9, Landroid/widget/Button;

    .line 681
    .line 682
    if-nez v9, :cond_18

    .line 683
    .line 684
    goto :goto_9

    .line 685
    :cond_18
    invoke-virtual {p0, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 686
    .line 687
    .line 688
    new-instance p0, Lzg;

    .line 689
    .line 690
    const/16 v0, 0x8

    .line 691
    .line 692
    invoke-direct {p0, p1, v9, v0, v10}, Lzg;-><init>(Landroid/app/Activity;Landroid/widget/Button;II)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v9, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 696
    .line 697
    .line 698
    goto :goto_9

    .line 699
    :cond_19
    sget-object p0, Lhh;->h:Ljava/lang/String;

    .line 700
    .line 701
    invoke-static {v1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    const-string v0, "Resolve red packet open button failed: "

    .line 706
    .line 707
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object p1

    .line 711
    invoke-static {p0, p1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    :goto_9
    return-object v11

    .line 715
    :pswitch_e
    check-cast p1, Ljg3;

    .line 716
    .line 717
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object p0

    .line 724
    invoke-static {v7, p0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object p0

    .line 728
    instance-of p1, p0, Lorg/json/JSONObject;

    .line 729
    .line 730
    if-eqz p1, :cond_1a

    .line 731
    .line 732
    check-cast p0, Lorg/json/JSONObject;

    .line 733
    .line 734
    goto :goto_a

    .line 735
    :cond_1a
    move-object p0, v9

    .line 736
    :goto_a
    if-nez p0, :cond_1b

    .line 737
    .line 738
    goto/16 :goto_d

    .line 739
    .line 740
    :cond_1b
    sget-object p1, Lhh;->d:Lhh;

    .line 741
    .line 742
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    sget-object p1, Lhh;->h:Ljava/lang/String;

    .line 746
    .line 747
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 755
    .line 756
    .line 757
    move-result v2

    .line 758
    if-eqz v2, :cond_1c

    .line 759
    .line 760
    goto/16 :goto_d

    .line 761
    .line 762
    :cond_1c
    sget-object v2, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 763
    .line 764
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    check-cast v2, Lgh;

    .line 769
    .line 770
    if-nez v2, :cond_1d

    .line 771
    .line 772
    goto/16 :goto_d

    .line 773
    .line 774
    :cond_1d
    const-string v3, "retcode"

    .line 775
    .line 776
    const/4 v4, -0x1

    .line 777
    invoke-virtual {p0, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 778
    .line 779
    .line 780
    move-result v3

    .line 781
    const-string v5, "receiveStatus"

    .line 782
    .line 783
    invoke-virtual {p0, v5, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 784
    .line 785
    .line 786
    move-result v4

    .line 787
    if-nez v3, :cond_25

    .line 788
    .line 789
    if-eq v4, v7, :cond_1e

    .line 790
    .line 791
    goto/16 :goto_e

    .line 792
    .line 793
    :cond_1e
    const-string v3, "amount"

    .line 794
    .line 795
    invoke-virtual {p0, v3, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 796
    .line 797
    .line 798
    move-result p0

    .line 799
    new-instance v3, Ljava/lang/StringBuilder;

    .line 800
    .line 801
    const-string v4, "Red packet received: sendId="

    .line 802
    .line 803
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    const-string v0, ", amount="

    .line 810
    .line 811
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-static {p1, v0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    if-gtz p0, :cond_1f

    .line 825
    .line 826
    goto :goto_d

    .line 827
    :cond_1f
    invoke-static {}, Lhh;->s()Lch;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    iget-object v0, v0, Lch;->f:Lfh;

    .line 832
    .line 833
    iget-boolean v3, v0, Lfh;->a:Z

    .line 834
    .line 835
    iget-object v0, v0, Lfh;->b:Ljava/lang/String;

    .line 836
    .line 837
    if-eqz v3, :cond_23

    .line 838
    .line 839
    invoke-static {v0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    if-eqz v3, :cond_20

    .line 844
    .line 845
    goto :goto_d

    .line 846
    :cond_20
    int-to-long v3, p0

    .line 847
    invoke-static {v3, v4, v7}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 848
    .line 849
    .line 850
    move-result-object p0

    .line 851
    invoke-virtual {p0}, Ljava/math/BigDecimal;->signum()I

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    if-nez v3, :cond_21

    .line 856
    .line 857
    new-instance p0, Ljava/math/BigDecimal;

    .line 858
    .line 859
    sget-object v3, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 860
    .line 861
    invoke-direct {p0, v3, v10}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 862
    .line 863
    .line 864
    goto :goto_b

    .line 865
    :cond_21
    invoke-virtual {p0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 866
    .line 867
    .line 868
    move-result-object p0

    .line 869
    :goto_b
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object p0

    .line 873
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    const-string v3, "$amount"

    .line 877
    .line 878
    invoke-static {v0, v3, p0}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object p0

    .line 882
    iget-object v0, v2, Lgh;->c:Ljava/lang/String;

    .line 883
    .line 884
    invoke-static {v0, p0}, Lgd3;->l(Ljava/lang/String;Ljava/lang/String;)Lso2;

    .line 885
    .line 886
    .line 887
    move-result-object p0

    .line 888
    instance-of v0, p0, Lro2;

    .line 889
    .line 890
    if-eqz v0, :cond_22

    .line 891
    .line 892
    goto :goto_c

    .line 893
    :cond_22
    instance-of v0, p0, Lqo2;

    .line 894
    .line 895
    if-eqz v0, :cond_24

    .line 896
    .line 897
    check-cast p0, Lqo2;

    .line 898
    .line 899
    iget-object v9, p0, Lqo2;->a:Ljo2;

    .line 900
    .line 901
    :goto_c
    if-eqz v9, :cond_23

    .line 902
    .line 903
    iget-object p0, v9, Ljo2;->c:Ljava/lang/String;

    .line 904
    .line 905
    const-string v0, "Red packet auto reply failed: "

    .line 906
    .line 907
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object p0

    .line 911
    invoke-static {v1, p1, p0}, Lhg3;->g(ILjava/lang/String;Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    :cond_23
    :goto_d
    move-object v9, v11

    .line 915
    goto :goto_f

    .line 916
    :cond_24
    invoke-static {}, Lc80;->s()V

    .line 917
    .line 918
    .line 919
    goto :goto_f

    .line 920
    :cond_25
    :goto_e
    new-instance p0, Ljava/lang/StringBuilder;

    .line 921
    .line 922
    const-string v1, "Red packet was not received: sendId="

    .line 923
    .line 924
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 928
    .line 929
    .line 930
    const-string v0, ", retCode="

    .line 931
    .line 932
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 933
    .line 934
    .line 935
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    const-string v0, ", receiveStatus="

    .line 939
    .line 940
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 944
    .line 945
    .line 946
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object p0

    .line 950
    invoke-static {p1, p0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    goto :goto_d

    .line 954
    :goto_f
    return-object v9

    .line 955
    :pswitch_f
    check-cast p1, Ljg3;

    .line 956
    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object p0

    .line 964
    invoke-static {v7, p0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object p0

    .line 968
    instance-of p1, p0, Lorg/json/JSONObject;

    .line 969
    .line 970
    if-eqz p1, :cond_26

    .line 971
    .line 972
    move-object v9, p0

    .line 973
    check-cast v9, Lorg/json/JSONObject;

    .line 974
    .line 975
    :cond_26
    if-nez v9, :cond_27

    .line 976
    .line 977
    goto :goto_10

    .line 978
    :cond_27
    sget-object p0, Lhh;->d:Lhh;

    .line 979
    .line 980
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object p0

    .line 987
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    invoke-static {p0}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 991
    .line 992
    .line 993
    move-result p1

    .line 994
    if-eqz p1, :cond_28

    .line 995
    .line 996
    goto :goto_10

    .line 997
    :cond_28
    sget-object p1, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 998
    .line 999
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    check-cast v0, Lgh;

    .line 1004
    .line 1005
    if-nez v0, :cond_29

    .line 1006
    .line 1007
    goto :goto_10

    .line 1008
    :cond_29
    iget v1, v0, Lgh;->i:I

    .line 1009
    .line 1010
    if-nez v1, :cond_2a

    .line 1011
    .line 1012
    goto :goto_10

    .line 1013
    :cond_2a
    const-string v1, "timingIdentifier"

    .line 1014
    .line 1015
    invoke-virtual {v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v2

    .line 1026
    if-eqz v2, :cond_2b

    .line 1027
    .line 1028
    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    sget-object p1, Lhh;->h:Ljava/lang/String;

    .line 1032
    .line 1033
    const-string v0, "Receive request returned no timingIdentifier: sendId="

    .line 1034
    .line 1035
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object p0

    .line 1039
    invoke-static {p1, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_10

    .line 1043
    :cond_2b
    iget-object p1, v0, Lgh;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1044
    .line 1045
    invoke-virtual {p1, v10, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1046
    .line 1047
    .line 1048
    move-result p1

    .line 1049
    if-nez p1, :cond_2c

    .line 1050
    .line 1051
    goto :goto_10

    .line 1052
    :cond_2c
    new-instance p1, Ls1;

    .line 1053
    .line 1054
    invoke-direct {p1, p0, v0, v1, v7}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1055
    .line 1056
    .line 1057
    const-string p0, "NukeOpenRedPacket"

    .line 1058
    .line 1059
    invoke-static {p0, p1}, Lea3;->b(Ljava/lang/String;Lxm0;)V

    .line 1060
    .line 1061
    .line 1062
    :goto_10
    return-object v11

    .line 1063
    :pswitch_10
    check-cast p1, Lhd3;

    .line 1064
    .line 1065
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    sget-object p0, Lhh;->d:Lhh;

    .line 1069
    .line 1070
    iget-object p1, p1, Lhd3;->a:Lyi1;

    .line 1071
    .line 1072
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1073
    .line 1074
    .line 1075
    sget-object p0, Lhh;->h:Ljava/lang/String;

    .line 1076
    .line 1077
    sget-object v0, Lhh;->k:Ljava/util/Set;

    .line 1078
    .line 1079
    iget v1, p1, Lyi1;->e:I

    .line 1080
    .line 1081
    iget-object v5, p1, Lyi1;->c:Ljava/lang/String;

    .line 1082
    .line 1083
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v0

    .line 1091
    if-eqz v0, :cond_36

    .line 1092
    .line 1093
    iget v0, p1, Lyi1;->a:I

    .line 1094
    .line 1095
    if-eqz v0, :cond_2d

    .line 1096
    .line 1097
    goto/16 :goto_14

    .line 1098
    .line 1099
    :cond_2d
    invoke-static {}, Lhh;->s()Lch;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    iget-boolean v1, v0, Lch;->c:Z

    .line 1104
    .line 1105
    if-eqz v1, :cond_2e

    .line 1106
    .line 1107
    iget-object v6, v0, Lch;->d:Ljava/util/Set;

    .line 1108
    .line 1109
    goto :goto_11

    .line 1110
    :cond_2e
    iget-object v6, v0, Lch;->e:Ljava/util/Set;

    .line 1111
    .line 1112
    :goto_11
    if-eqz v1, :cond_2f

    .line 1113
    .line 1114
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    move-result v8

    .line 1118
    goto :goto_12

    .line 1119
    :cond_2f
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v6

    .line 1123
    if-nez v6, :cond_30

    .line 1124
    .line 1125
    goto :goto_12

    .line 1126
    :cond_30
    move v8, v10

    .line 1127
    :goto_12
    if-nez v8, :cond_32

    .line 1128
    .line 1129
    if-eqz v1, :cond_31

    .line 1130
    .line 1131
    move-object v3, v4

    .line 1132
    :cond_31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    const-string v0, "Skipping red packet from "

    .line 1135
    .line 1136
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object p1

    .line 1152
    invoke-static {p0, p1}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1153
    .line 1154
    .line 1155
    goto :goto_14

    .line 1156
    :cond_32
    :try_start_2
    iget v1, v0, Lch;->b:I

    .line 1157
    .line 1158
    invoke-static {p1, v1}, Lhh;->w(Lyi1;I)Lgh;

    .line 1159
    .line 1160
    .line 1161
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1162
    goto :goto_13

    .line 1163
    :catchall_2
    move-exception p1

    .line 1164
    new-instance v1, Lx92;

    .line 1165
    .line 1166
    invoke-direct {v1, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1167
    .line 1168
    .line 1169
    move-object p1, v1

    .line 1170
    :goto_13
    invoke-static {p1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v1

    .line 1174
    if-nez v1, :cond_35

    .line 1175
    .line 1176
    check-cast p1, Lgh;

    .line 1177
    .line 1178
    if-nez p1, :cond_33

    .line 1179
    .line 1180
    goto :goto_14

    .line 1181
    :cond_33
    iget-object v1, p1, Lgh;->a:Ljava/lang/String;

    .line 1182
    .line 1183
    sget-object v2, Lhh;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1184
    .line 1185
    invoke-virtual {v2, v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v2

    .line 1189
    if-eqz v2, :cond_34

    .line 1190
    .line 1191
    goto :goto_14

    .line 1192
    :cond_34
    iget-object v2, p1, Lgh;->c:Ljava/lang/String;

    .line 1193
    .line 1194
    iget v3, p1, Lgh;->i:I

    .line 1195
    .line 1196
    const-string v4, ", talker="

    .line 1197
    .line 1198
    const-string v5, ", mode="

    .line 1199
    .line 1200
    const-string v6, "Detected red packet: sendId="

    .line 1201
    .line 1202
    invoke-static {v6, v1, v4, v2, v5}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v1

    .line 1206
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    invoke-static {p0, v1}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    new-instance p0, Lr1;

    .line 1217
    .line 1218
    const/4 v1, 0x5

    .line 1219
    invoke-direct {p0, v1, v0, p1}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1220
    .line 1221
    .line 1222
    const-string p1, "NukeReceiveRedPacket"

    .line 1223
    .line 1224
    invoke-static {p1, p0}, Lea3;->b(Ljava/lang/String;Lxm0;)V

    .line 1225
    .line 1226
    .line 1227
    goto :goto_14

    .line 1228
    :cond_35
    invoke-static {v1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object p1

    .line 1232
    const-string v0, "Parse red packet failed: "

    .line 1233
    .line 1234
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object p1

    .line 1238
    invoke-static {p0, p1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1239
    .line 1240
    .line 1241
    :cond_36
    :goto_14
    return-object v11

    .line 1242
    :pswitch_11
    check-cast p1, Ljava/lang/Class;

    .line 1243
    .line 1244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1248
    .line 1249
    .line 1250
    move-result p0

    .line 1251
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1252
    .line 1253
    .line 1254
    move-result-object p0

    .line 1255
    return-object p0

    .line 1256
    :pswitch_12
    check-cast p1, Ldj0;

    .line 1257
    .line 1258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    new-instance p0, Lw;

    .line 1262
    .line 1263
    const/16 v0, 0x9

    .line 1264
    .line 1265
    invoke-direct {p0, v0}, Lw;-><init>(I)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {p1, p0}, Ldj0;->c0(Lin0;)V

    .line 1269
    .line 1270
    .line 1271
    return-object v11

    .line 1272
    :pswitch_13
    check-cast p1, Lyg1;

    .line 1273
    .line 1274
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1275
    .line 1276
    .line 1277
    const-string p0, "doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s"

    .line 1278
    .line 1279
    filled-new-array {p0}, [Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object p0

    .line 1283
    invoke-virtual {p1, p0}, Lyg1;->h0([Ljava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    return-object v11

    .line 1287
    :pswitch_14
    check-cast p1, Ljg3;

    .line 1288
    .line 1289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {p1, v9}, Ljg3;->b(Ljava/lang/Object;)V

    .line 1293
    .line 1294
    .line 1295
    return-object v11

    .line 1296
    :pswitch_15
    check-cast p1, Ljg3;

    .line 1297
    .line 1298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1302
    .line 1303
    .line 1304
    move-result-object p0

    .line 1305
    invoke-static {v10, p0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object p0

    .line 1309
    instance-of v0, p0, Ljava/lang/String;

    .line 1310
    .line 1311
    if-eqz v0, :cond_37

    .line 1312
    .line 1313
    move-object v9, p0

    .line 1314
    check-cast v9, Ljava/lang/String;

    .line 1315
    .line 1316
    :cond_37
    if-nez v9, :cond_38

    .line 1317
    .line 1318
    goto :goto_16

    .line 1319
    :cond_38
    sget-object p0, Lae;->d:Lae;

    .line 1320
    .line 1321
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1322
    .line 1323
    .line 1324
    invoke-static {v9, v6, v8}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1325
    .line 1326
    .line 1327
    move-result p0

    .line 1328
    if-nez p0, :cond_39

    .line 1329
    .line 1330
    move-object p0, v9

    .line 1331
    goto :goto_15

    .line 1332
    :cond_39
    const-string p0, "(sourceType & 2 != 0 )  AND"

    .line 1333
    .line 1334
    const-string v0, ""

    .line 1335
    .line 1336
    invoke-static {v9, p0, v0}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object p0

    .line 1340
    const-string v0, "(sourceType & 2 != 0 )"

    .line 1341
    .line 1342
    const-string v1, "(1=1)"

    .line 1343
    .line 1344
    invoke-static {p0, v0, v1}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object p0

    .line 1348
    const-string v0, "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))"

    .line 1349
    .line 1350
    const-string v1, "(sourceType in (0,2,4,6,8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))"

    .line 1351
    .line 1352
    invoke-static {p0, v0, v1}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object p0

    .line 1356
    const-string v0, "WHERE SnsInfo.userName="

    .line 1357
    .line 1358
    invoke-static {p0, v0, v8}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v0

    .line 1362
    if-eqz v0, :cond_3a

    .line 1363
    .line 1364
    const-string v0, "(snsId >="

    .line 1365
    .line 1366
    const-string v1, "(1=1 or snsId >="

    .line 1367
    .line 1368
    invoke-static {p0, v0, v1}, Lwv2;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object p0

    .line 1372
    :cond_3a
    :goto_15
    invoke-virtual {p0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v0

    .line 1376
    if-nez v0, :cond_3b

    .line 1377
    .line 1378
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object p1

    .line 1382
    aput-object p0, p1, v10

    .line 1383
    .line 1384
    sget-object p0, Lae;->h:Ljava/lang/String;

    .line 1385
    .line 1386
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1387
    .line 1388
    .line 1389
    :cond_3b
    :goto_16
    return-object v11

    .line 1390
    :pswitch_16
    check-cast p1, Ljg3;

    .line 1391
    .line 1392
    sget-object p0, Lae;->d:Lae;

    .line 1393
    .line 1394
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-static {v10, v0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    instance-of v1, v0, Ljava/lang/String;

    .line 1406
    .line 1407
    if-eqz v1, :cond_3c

    .line 1408
    .line 1409
    check-cast v0, Ljava/lang/String;

    .line 1410
    .line 1411
    goto :goto_17

    .line 1412
    :cond_3c
    move-object v0, v9

    .line 1413
    :goto_17
    if-nez v0, :cond_3d

    .line 1414
    .line 1415
    goto/16 :goto_20

    .line 1416
    .line 1417
    :cond_3d
    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    if-nez v0, :cond_3e

    .line 1422
    .line 1423
    goto/16 :goto_20

    .line 1424
    .line 1425
    :cond_3e
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object p1

    .line 1429
    invoke-static {v8, p1}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object p1

    .line 1433
    instance-of v0, p1, Landroid/content/ContentValues;

    .line 1434
    .line 1435
    if-eqz v0, :cond_3f

    .line 1436
    .line 1437
    check-cast p1, Landroid/content/ContentValues;

    .line 1438
    .line 1439
    goto :goto_18

    .line 1440
    :cond_3f
    move-object p1, v9

    .line 1441
    :goto_18
    if-nez p1, :cond_40

    .line 1442
    .line 1443
    goto/16 :goto_20

    .line 1444
    .line 1445
    :cond_40
    const-string v0, "sourceType"

    .line 1446
    .line 1447
    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v1

    .line 1451
    if-eqz v1, :cond_4b

    .line 1452
    .line 1453
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1454
    .line 1455
    .line 1456
    move-result v1

    .line 1457
    if-eqz v1, :cond_41

    .line 1458
    .line 1459
    goto/16 :goto_20

    .line 1460
    .line 1461
    :cond_41
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v1

    .line 1465
    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1469
    .line 1470
    .line 1471
    sget-object p0, Lae;->h:Ljava/lang/String;

    .line 1472
    .line 1473
    const-class v0, [B

    .line 1474
    .line 1475
    const-string v1, "content"

    .line 1476
    .line 1477
    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->getAsByteArray(Ljava/lang/String;)[B

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    if-nez v2, :cond_42

    .line 1482
    .line 1483
    goto/16 :goto_20

    .line 1484
    .line 1485
    :cond_42
    :try_start_3
    sget-object v3, Lae;->j:Lhx2;

    .line 1486
    .line 1487
    invoke-virtual {v3}, Lhx2;->getValue()Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v3

    .line 1491
    check-cast v3, Ljava/lang/Class;

    .line 1492
    .line 1493
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v3

    .line 1497
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1498
    .line 1499
    .line 1500
    invoke-static {v3}, Lig1;->a(Ljava/lang/reflect/Member;)Z

    .line 1501
    .line 1502
    .line 1503
    invoke-virtual {v3, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v3

    .line 1507
    invoke-static {v3}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v4

    .line 1511
    invoke-virtual {v4}, Ln4;->v()Lsg1;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v4

    .line 1515
    invoke-virtual {v4}, Lzf1;->b()V

    .line 1516
    .line 1517
    .line 1518
    const-string v5, "parseFrom"

    .line 1519
    .line 1520
    iput-object v5, v4, Lzf1;->b:Ljava/lang/String;

    .line 1521
    .line 1522
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v5

    .line 1526
    invoke-virtual {v4, v5}, Lsg1;->d([Ljava/lang/Object;)V

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v4}, Lsg1;->c()Ljava/util/List;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v4

    .line 1533
    invoke-static {v4}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v4

    .line 1537
    check-cast v4, Lzg1;

    .line 1538
    .line 1539
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v2

    .line 1543
    invoke-virtual {v4, v2}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v2

    .line 1547
    if-nez v2, :cond_43

    .line 1548
    .line 1549
    goto :goto_19

    .line 1550
    :cond_43
    move-object v3, v2

    .line 1551
    :goto_19
    invoke-static {v3}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v2

    .line 1555
    invoke-virtual {v2}, Ln4;->r()Lhi0;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v2

    .line 1559
    invoke-virtual {v2}, Lzf1;->b()V

    .line 1560
    .line 1561
    .line 1562
    const-string v4, "ContentDesc"

    .line 1563
    .line 1564
    iput-object v4, v2, Lzf1;->b:Ljava/lang/String;

    .line 1565
    .line 1566
    invoke-virtual {v2}, Lhi0;->c()Ljava/util/List;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v2

    .line 1570
    invoke-static {v2}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v2

    .line 1574
    check-cast v2, Lpi0;

    .line 1575
    .line 1576
    invoke-virtual {v2}, Lpi0;->g0()Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v4

    .line 1580
    instance-of v5, v4, Ljava/lang/String;

    .line 1581
    .line 1582
    if-eqz v5, :cond_44

    .line 1583
    .line 1584
    check-cast v4, Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1585
    .line 1586
    goto :goto_1a

    .line 1587
    :catchall_3
    move-exception p1

    .line 1588
    goto/16 :goto_1e

    .line 1589
    .line 1590
    :cond_44
    move-object v4, v9

    .line 1591
    :goto_1a
    if-nez v4, :cond_45

    .line 1592
    .line 1593
    goto/16 :goto_1d

    .line 1594
    .line 1595
    :cond_45
    :try_start_4
    sget-object v5, Lup0;->i:Landroid/content/Context;

    .line 1596
    .line 1597
    if-eqz v5, :cond_46

    .line 1598
    .line 1599
    const v6, 0x790b003e

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v5

    .line 1606
    goto :goto_1c

    .line 1607
    :catchall_4
    move-exception v5

    .line 1608
    goto :goto_1b

    .line 1609
    :cond_46
    const-string v5, "hostContext"

    .line 1610
    .line 1611
    invoke-static {v5}, Lt11;->S(Ljava/lang/String;)V

    .line 1612
    .line 1613
    .line 1614
    throw v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1615
    :goto_1b
    :try_start_5
    new-instance v6, Lx92;

    .line 1616
    .line 1617
    invoke-direct {v6, v5}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1618
    .line 1619
    .line 1620
    move-object v5, v6

    .line 1621
    :goto_1c
    const-string v6, "(\u5df2\u5220\u9664)"

    .line 1622
    .line 1623
    instance-of v7, v5, Lx92;

    .line 1624
    .line 1625
    if-eqz v7, :cond_47

    .line 1626
    .line 1627
    move-object v5, v6

    .line 1628
    :cond_47
    check-cast v5, Ljava/lang/String;

    .line 1629
    .line 1630
    invoke-static {v4, v5, v10}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1631
    .line 1632
    .line 1633
    move-result v6

    .line 1634
    if-nez v6, :cond_48

    .line 1635
    .line 1636
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v4

    .line 1640
    invoke-virtual {v2}, Ltl;->R()V

    .line 1641
    .line 1642
    .line 1643
    iget-object v5, v2, Lpi0;->j:Ljava/lang/reflect/Field;

    .line 1644
    .line 1645
    iget-object v2, v2, Ll01;->i:Ljava/lang/Object;

    .line 1646
    .line 1647
    invoke-virtual {v5, v2, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1648
    .line 1649
    .line 1650
    :cond_48
    invoke-static {v3}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v2

    .line 1654
    invoke-virtual {v2}, Ln4;->v()Lsg1;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v2

    .line 1658
    invoke-virtual {v2}, Lzf1;->b()V

    .line 1659
    .line 1660
    .line 1661
    const-string v3, "toByteArray"

    .line 1662
    .line 1663
    iput-object v3, v2, Lzf1;->b:Ljava/lang/String;

    .line 1664
    .line 1665
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v3

    .line 1669
    iput-object v3, v2, Lsg1;->l:Ljava/lang/Integer;

    .line 1670
    .line 1671
    iput-object v0, v2, Lsg1;->C:Ljava/lang/Class;

    .line 1672
    .line 1673
    invoke-virtual {v2}, Lsg1;->c()Ljava/util/List;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v0

    .line 1677
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    check-cast v0, Lzg1;

    .line 1682
    .line 1683
    new-array v2, v10, [Ljava/lang/Object;

    .line 1684
    .line 1685
    invoke-virtual {v0, v2}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    instance-of v2, v0, [B

    .line 1690
    .line 1691
    if-eqz v2, :cond_49

    .line 1692
    .line 1693
    move-object v9, v0

    .line 1694
    check-cast v9, [B

    .line 1695
    .line 1696
    :cond_49
    if-nez v9, :cond_4a

    .line 1697
    .line 1698
    goto :goto_1d

    .line 1699
    :cond_4a
    invoke-virtual {p1, v1, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 1700
    .line 1701
    .line 1702
    const-string p1, "Marked a deleted moment for display"

    .line 1703
    .line 1704
    invoke-static {p0, p1}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1705
    .line 1706
    .line 1707
    :goto_1d
    move-object v0, v11

    .line 1708
    goto :goto_1f

    .line 1709
    :goto_1e
    new-instance v0, Lx92;

    .line 1710
    .line 1711
    invoke-direct {v0, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 1712
    .line 1713
    .line 1714
    :goto_1f
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1715
    .line 1716
    .line 1717
    move-result-object p1

    .line 1718
    if-eqz p1, :cond_4b

    .line 1719
    .line 1720
    invoke-static {p1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1721
    .line 1722
    .line 1723
    move-result-object p1

    .line 1724
    const-string v0, "Unable to mark deleted moment: "

    .line 1725
    .line 1726
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1727
    .line 1728
    .line 1729
    move-result-object p1

    .line 1730
    invoke-static {p0, p1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1731
    .line 1732
    .line 1733
    :cond_4b
    :goto_20
    return-object v11

    .line 1734
    :pswitch_17
    check-cast p1, Ljg3;

    .line 1735
    .line 1736
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object p0

    .line 1743
    invoke-static {v10, p0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    move-result-object p0

    .line 1747
    instance-of v0, p0, Ljava/lang/String;

    .line 1748
    .line 1749
    if-eqz v0, :cond_4c

    .line 1750
    .line 1751
    check-cast p0, Ljava/lang/String;

    .line 1752
    .line 1753
    goto :goto_21

    .line 1754
    :cond_4c
    move-object p0, v9

    .line 1755
    :goto_21
    if-nez p0, :cond_4d

    .line 1756
    .line 1757
    goto :goto_22

    .line 1758
    :cond_4d
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v0

    .line 1762
    invoke-static {v8, v0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v0

    .line 1766
    instance-of v1, v0, Ljava/lang/String;

    .line 1767
    .line 1768
    if-eqz v1, :cond_4e

    .line 1769
    .line 1770
    move-object v9, v0

    .line 1771
    check-cast v9, Ljava/lang/String;

    .line 1772
    .line 1773
    :cond_4e
    if-nez v9, :cond_4f

    .line 1774
    .line 1775
    goto :goto_22

    .line 1776
    :cond_4f
    invoke-virtual {p0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1777
    .line 1778
    .line 1779
    move-result p0

    .line 1780
    if-eqz p0, :cond_50

    .line 1781
    .line 1782
    const-string p0, "UPDATE SnsInfo SET sourceType = sourceType & -3 where"

    .line 1783
    .line 1784
    invoke-static {v9, p0, v8}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 1785
    .line 1786
    .line 1787
    move-result p0

    .line 1788
    if-eqz p0, :cond_50

    .line 1789
    .line 1790
    sget-object p0, Lae;->d:Lae;

    .line 1791
    .line 1792
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1793
    .line 1794
    .line 1795
    sget-object p0, Lae;->h:Ljava/lang/String;

    .line 1796
    .line 1797
    const-string v0, "Blocked deletion cleanup for a cached moment"

    .line 1798
    .line 1799
    invoke-static {p0, v0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 1800
    .line 1801
    .line 1802
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1803
    .line 1804
    invoke-virtual {p1, p0}, Ljg3;->b(Ljava/lang/Object;)V

    .line 1805
    .line 1806
    .line 1807
    :cond_50
    :goto_22
    return-object v11

    .line 1808
    :pswitch_18
    check-cast p1, Lod;

    .line 1809
    .line 1810
    instance-of p0, p1, Lvw1;

    .line 1811
    .line 1812
    xor-int/2addr p0, v8

    .line 1813
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1814
    .line 1815
    .line 1816
    move-result-object p0

    .line 1817
    return-object p0

    .line 1818
    :pswitch_19
    check-cast p1, Lzn2;

    .line 1819
    .line 1820
    sget-object p0, Lp4;->a:Luh1;

    .line 1821
    .line 1822
    return-object v11

    .line 1823
    :pswitch_1a
    check-cast p1, Landroid/content/Context;

    .line 1824
    .line 1825
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1826
    .line 1827
    .line 1828
    new-instance p0, Landroid/widget/ImageView;

    .line 1829
    .line 1830
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1831
    .line 1832
    .line 1833
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1834
    .line 1835
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1836
    .line 1837
    .line 1838
    return-object p0

    .line 1839
    :pswitch_1b
    check-cast p1, Landroid/content/Context;

    .line 1840
    .line 1841
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1842
    .line 1843
    .line 1844
    new-instance p0, Landroid/widget/ImageView;

    .line 1845
    .line 1846
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1847
    .line 1848
    .line 1849
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1850
    .line 1851
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1852
    .line 1853
    .line 1854
    return-object p0

    .line 1855
    :pswitch_1c
    check-cast p1, Lhd3;

    .line 1856
    .line 1857
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1858
    .line 1859
    .line 1860
    sget-object p0, Lb0;->d:Lb0;

    .line 1861
    .line 1862
    iget-object p1, p1, Lhd3;->a:Lyi1;

    .line 1863
    .line 1864
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1865
    .line 1866
    .line 1867
    invoke-static {p1}, Lte;->l0(Lyi1;)Lby0;

    .line 1868
    .line 1869
    .line 1870
    move-result-object p0

    .line 1871
    if-nez p0, :cond_51

    .line 1872
    .line 1873
    goto :goto_23

    .line 1874
    :cond_51
    invoke-static {}, Lb0;->q()Lnuke/module/wechat/ai/AIChatConfig;

    .line 1875
    .line 1876
    .line 1877
    move-result-object p1

    .line 1878
    invoke-static {p1}, Lb0;->r(Lnuke/module/wechat/ai/AIChatConfig;)Z

    .line 1879
    .line 1880
    .line 1881
    move-result v0

    .line 1882
    if-eqz v0, :cond_54

    .line 1883
    .line 1884
    iget-object v0, p0, Lby0;->a:Ljava/lang/String;

    .line 1885
    .line 1886
    invoke-virtual {p1, v0}, Lnuke/module/wechat/ai/AIChatConfig;->allowsTalker(Ljava/lang/String;)Z

    .line 1887
    .line 1888
    .line 1889
    move-result p1

    .line 1890
    if-nez p1, :cond_52

    .line 1891
    .line 1892
    goto :goto_23

    .line 1893
    :cond_52
    sget-object p1, Lb0;->j:Lz52;

    .line 1894
    .line 1895
    iget-object v0, p0, Lby0;->d:Ljava/lang/String;

    .line 1896
    .line 1897
    invoke-virtual {p1, v0}, Lz52;->a(Ljava/lang/String;)Z

    .line 1898
    .line 1899
    .line 1900
    move-result p1

    .line 1901
    if-nez p1, :cond_53

    .line 1902
    .line 1903
    goto :goto_23

    .line 1904
    :cond_53
    sget-object p1, Lb0;->k:Ljava/util/concurrent/atomic/AtomicLong;

    .line 1905
    .line 1906
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 1907
    .line 1908
    .line 1909
    move-result-wide v0

    .line 1910
    sget-object p1, Lb0;->l:Ljava/util/concurrent/ExecutorService;

    .line 1911
    .line 1912
    new-instance v2, Ly;

    .line 1913
    .line 1914
    invoke-direct {v2, p0, v0, v1, v10}, Ly;-><init>(Lby0;JI)V

    .line 1915
    .line 1916
    .line 1917
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1918
    .line 1919
    .line 1920
    :cond_54
    :goto_23
    return-object v11

    .line 1921
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
