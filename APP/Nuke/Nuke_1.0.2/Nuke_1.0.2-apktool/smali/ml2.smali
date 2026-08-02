.class public final synthetic Lml2;
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
    iput p1, p0, Lml2;->h:I

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
    .locals 13

    .line 1
    iget p0, p0, Lml2;->h:I

    .line 2
    .line 3
    const-wide v0, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v2, 0x20

    .line 9
    .line 10
    const-class v3, Lnuke/ui/HomeActivity;

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    const-class v5, Ljava/util/List;

    .line 15
    .line 16
    const-string v6, "com.tencent.mm.plugin.sns.storage.SnsSqliteDB"

    .line 17
    .line 18
    const-string v7, "com.tencent.mm.plugin.sns.storage"

    .line 19
    .line 20
    const/4 v8, 0x5

    .line 21
    const/4 v9, 0x2

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    packed-switch p0, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljg3;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {v12, p0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-nez p0, :cond_0

    .line 42
    .line 43
    goto/16 :goto_4

    .line 44
    .line 45
    :cond_0
    sget-object v0, Ljs;->d:Ljs;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Ljs;->j(Ljava/lang/Object;)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_1
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v11, v0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    instance-of v1, v0, Ljava/lang/Integer;

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    check-cast v0, Ljava/lang/Integer;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move-object v0, v10

    .line 73
    :goto_0
    if-eqz v0, :cond_7

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-object p1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 80
    .line 81
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 82
    .line 83
    if-nez p1, :cond_3

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_3
    :try_start_0
    invoke-static {p1}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ln4;->r()Lhi0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object v5, p1, Lhi0;->g:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {p1}, Lhi0;->c()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lpi0;

    .line 105
    .line 106
    invoke-virtual {p1}, Lpi0;->g0()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    instance-of v1, p1, Ljava/util/List;

    .line 111
    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    goto :goto_1

    .line 119
    :cond_4
    move-object p1, v10

    .line 120
    goto :goto_2

    .line 121
    :goto_1
    new-instance v1, Lx92;

    .line 122
    .line 123
    invoke-direct {v1, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    move-object p1, v1

    .line 127
    :goto_2
    nop

    .line 128
    instance-of v1, p1, Lx92;

    .line 129
    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    move-object v10, p1

    .line 134
    :goto_3
    check-cast v10, Ljava/util/List;

    .line 135
    .line 136
    if-nez v10, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    const p1, 0x79080060

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v10}, Ldu;->r0(ILjava/util/List;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_4
    sget-object p0, La83;->a:La83;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_0
    check-cast p1, Ljg3;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 158
    .line 159
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 160
    .line 161
    instance-of p1, p0, Landroid/view/View;

    .line 162
    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    move-object v10, p0

    .line 166
    check-cast v10, Landroid/view/View;

    .line 167
    .line 168
    :cond_8
    if-eqz v10, :cond_9

    .line 169
    .line 170
    invoke-virtual {v10, v11}, Landroid/view/View;->setClickable(Z)V

    .line 171
    .line 172
    .line 173
    :cond_9
    sget-object p0, La83;->a:La83;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_1
    check-cast p1, Ljg3;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 182
    .line 183
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 184
    .line 185
    if-nez p0, :cond_a

    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_a
    :try_start_1
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p0}, Ln4;->r()Lhi0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    sget-object p1, Lfx2;->d:Lfx2;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    sget-object p1, Lfx2;->l:Lhx2;

    .line 202
    .line 203
    invoke-virtual {p1}, Lhx2;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    check-cast p1, Ljava/lang/Class;

    .line 208
    .line 209
    iput-object p1, p0, Lhi0;->g:Ljava/lang/Class;

    .line 210
    .line 211
    invoke-virtual {p0}, Lhi0;->c()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    check-cast p0, Lpi0;

    .line 220
    .line 221
    invoke-virtual {p0}, Lpi0;->g0()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 225
    goto :goto_5

    .line 226
    :catchall_1
    move-exception p0

    .line 227
    new-instance p1, Lx92;

    .line 228
    .line 229
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    move-object p0, p1

    .line 233
    :goto_5
    invoke-static {p0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-eqz p1, :cond_b

    .line 238
    .line 239
    sget-object v0, Lfx2;->d:Lfx2;

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    sget-object v0, Lfx2;->h:Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {p1}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    const-string v1, "Unable to resolve ChatFooter: "

    .line 251
    .line 252
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {v0, p1}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :cond_b
    instance-of p1, p0, Lx92;

    .line 260
    .line 261
    if-eqz p1, :cond_c

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_c
    move-object v10, p0

    .line 265
    :goto_6
    sput-object v10, Lfx2;->j:Ljava/lang/Object;

    .line 266
    .line 267
    :goto_7
    sget-object p0, La83;->a:La83;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_2
    check-cast p1, Ljg3;

    .line 271
    .line 272
    sget-object p0, La83;->a:La83;

    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    sget-object v0, Lbx2;->d:Lbx2;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    sget-object v0, Lbx2;->j:Lhx2;

    .line 283
    .line 284
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Ljava/lang/Class;

    .line 289
    .line 290
    iget-object v1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 291
    .line 292
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 293
    .line 294
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-nez v0, :cond_d

    .line 299
    .line 300
    goto/16 :goto_d

    .line 301
    .line 302
    :cond_d
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    check-cast v0, Landroid/view/View;

    .line 308
    .line 309
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    aget-object v1, v1, v12

    .line 314
    .line 315
    instance-of v2, v1, Landroid/view/MotionEvent;

    .line 316
    .line 317
    if-eqz v2, :cond_e

    .line 318
    .line 319
    check-cast v1, Landroid/view/MotionEvent;

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_e
    move-object v1, v10

    .line 323
    :goto_8
    if-nez v1, :cond_f

    .line 324
    .line 325
    goto/16 :goto_d

    .line 326
    .line 327
    :cond_f
    const v2, 0x7908005f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    instance-of v4, v3, Lax2;

    .line 335
    .line 336
    if-eqz v4, :cond_10

    .line 337
    .line 338
    check-cast v3, Lax2;

    .line 339
    .line 340
    goto :goto_9

    .line 341
    :cond_10
    move-object v3, v10

    .line 342
    :goto_9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    const/4 v5, 0x0

    .line 347
    if-eqz v4, :cond_19

    .line 348
    .line 349
    if-eq v4, v11, :cond_15

    .line 350
    .line 351
    const/4 v6, 0x3

    .line 352
    if-eq v4, v9, :cond_11

    .line 353
    .line 354
    if-eq v4, v6, :cond_15

    .line 355
    .line 356
    :goto_a
    move v11, v12

    .line 357
    goto/16 :goto_c

    .line 358
    .line 359
    :cond_11
    if-nez v3, :cond_12

    .line 360
    .line 361
    goto :goto_a

    .line 362
    :cond_12
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    iget v4, v3, Lax2;->a:F

    .line 367
    .line 368
    sub-float/2addr v2, v4

    .line 369
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    iget v7, v3, Lax2;->b:F

    .line 374
    .line 375
    sub-float/2addr v4, v7

    .line 376
    iget-boolean v7, v3, Lax2;->d:Z

    .line 377
    .line 378
    if-nez v7, :cond_13

    .line 379
    .line 380
    cmpg-float v7, v2, v5

    .line 381
    .line 382
    if-gez v7, :cond_13

    .line 383
    .line 384
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    iget v8, v3, Lax2;->c:I

    .line 389
    .line 390
    int-to-float v8, v8

    .line 391
    cmpl-float v7, v7, v8

    .line 392
    .line 393
    if-lez v7, :cond_13

    .line 394
    .line 395
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 396
    .line 397
    .line 398
    move-result v7

    .line 399
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    cmpl-float v4, v7, v4

    .line 404
    .line 405
    if-lez v4, :cond_13

    .line 406
    .line 407
    iput-boolean v11, v3, Lax2;->d:Z

    .line 408
    .line 409
    invoke-static {v1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->setAction(I)V

    .line 414
    .line 415
    .line 416
    :try_start_2
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-static {p1, v4}, Lig3;->b(Ljg3;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    if-eqz v1, :cond_13

    .line 431
    .line 432
    invoke-interface {v1, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 433
    .line 434
    .line 435
    goto :goto_b

    .line 436
    :catchall_2
    move-exception p0

    .line 437
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 438
    .line 439
    .line 440
    throw p0

    .line 441
    :cond_13
    :goto_b
    iget-boolean v1, v3, Lax2;->d:Z

    .line 442
    .line 443
    if-eqz v1, :cond_14

    .line 444
    .line 445
    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 450
    .line 451
    .line 452
    :cond_14
    iget-boolean v11, v3, Lax2;->d:Z

    .line 453
    .line 454
    goto/16 :goto_c

    .line 455
    .line 456
    :cond_15
    if-nez v3, :cond_16

    .line 457
    .line 458
    goto :goto_a

    .line 459
    :cond_16
    invoke-virtual {v0, v2, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    iget-boolean v2, v3, Lax2;->d:Z

    .line 463
    .line 464
    if-nez v2, :cond_17

    .line 465
    .line 466
    goto :goto_a

    .line 467
    :cond_17
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    iget v4, v3, Lax2;->a:F

    .line 472
    .line 473
    sub-float/2addr v2, v4

    .line 474
    iget v3, v3, Lax2;->c:I

    .line 475
    .line 476
    int-to-float v3, v3

    .line 477
    const/high16 v4, 0x40800000    # 4.0f

    .line 478
    .line 479
    mul-float/2addr v3, v4

    .line 480
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 489
    .line 490
    const/high16 v6, 0x42900000    # 72.0f

    .line 491
    .line 492
    mul-float/2addr v4, v6

    .line 493
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-ne v1, v11, :cond_18

    .line 502
    .line 503
    neg-float v1, v3

    .line 504
    cmpg-float v1, v2, v1

    .line 505
    .line 506
    if-gtz v1, :cond_18

    .line 507
    .line 508
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    int-to-float v2, v2

    .line 517
    neg-float v2, v2

    .line 518
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    const-wide/16 v2, 0xc8

    .line 523
    .line 524
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    new-instance v2, Lct2;

    .line 529
    .line 530
    invoke-direct {v2, v0, v11}, Lct2;-><init>(Landroid/view/View;I)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 538
    .line 539
    .line 540
    goto :goto_c

    .line 541
    :cond_18
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    const-wide/16 v1, 0xb4

    .line 550
    .line 551
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 556
    .line 557
    .line 558
    goto :goto_c

    .line 559
    :cond_19
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v5}, Landroid/view/View;->setTranslationX(F)V

    .line 567
    .line 568
    .line 569
    new-instance v3, Lax2;

    .line 570
    .line 571
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 572
    .line 573
    .line 574
    move-result v4

    .line 575
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    invoke-static {v5}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    invoke-direct {v3, v4, v1, v5}, Lax2;-><init>(FFI)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    goto/16 :goto_a

    .line 598
    .line 599
    :goto_c
    if-eqz v11, :cond_1a

    .line 600
    .line 601
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 602
    .line 603
    invoke-virtual {p1, v0}, Ljg3;->b(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    :cond_1a
    :goto_d
    return-object p0

    .line 607
    :pswitch_3
    check-cast p1, Lgd;

    .line 608
    .line 609
    sget-object p0, La83;->a:La83;

    .line 610
    .line 611
    return-object p0

    .line 612
    :pswitch_4
    check-cast p1, Lzn2;

    .line 613
    .line 614
    sget-object p0, Lxn2;->a:[Lv41;

    .line 615
    .line 616
    sget-object p0, Lvn2;->m:Lyn2;

    .line 617
    .line 618
    sget-object v0, Lxn2;->a:[Lv41;

    .line 619
    .line 620
    aget-object v0, v0, v8

    .line 621
    .line 622
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 623
    .line 624
    invoke-interface {p1, p0, v0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    sget-object p0, La83;->a:La83;

    .line 628
    .line 629
    return-object p0

    .line 630
    :pswitch_5
    check-cast p1, Ldj0;

    .line 631
    .line 632
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    filled-new-array {v7}, [Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 640
    .line 641
    .line 642
    move-result-object p0

    .line 643
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 644
    .line 645
    new-instance p0, Lyg1;

    .line 646
    .line 647
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 648
    .line 649
    .line 650
    const-string v0, "update"

    .line 651
    .line 652
    filled-new-array {v6, v0}, [Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    sget-object v0, La83;->a:La83;

    .line 660
    .line 661
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 662
    .line 663
    return-object v0

    .line 664
    :pswitch_6
    check-cast p1, Ldj0;

    .line 665
    .line 666
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    filled-new-array {v7}, [Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object p0

    .line 673
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 674
    .line 675
    .line 676
    move-result-object p0

    .line 677
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 678
    .line 679
    new-instance p0, Lml2;

    .line 680
    .line 681
    const/16 v0, 0x15

    .line 682
    .line 683
    invoke-direct {p0, v0}, Lml2;-><init>(I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1, p0}, Ldj0;->c0(Lin0;)V

    .line 687
    .line 688
    .line 689
    sget-object p0, La83;->a:La83;

    .line 690
    .line 691
    return-object p0

    .line 692
    :pswitch_7
    check-cast p1, Lyg1;

    .line 693
    .line 694
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    invoke-virtual {p1, v9}, Lyg1;->d0(I)V

    .line 698
    .line 699
    .line 700
    const-string p0, "rawQuery"

    .line 701
    .line 702
    filled-new-array {v6, p0}, [Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    invoke-virtual {p1, p0}, Lyg1;->h0([Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    sget-object p0, La83;->a:La83;

    .line 710
    .line 711
    return-object p0

    .line 712
    :pswitch_8
    check-cast p1, Ldj0;

    .line 713
    .line 714
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    filled-new-array {v7}, [Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object p0

    .line 721
    invoke-static {p0}, Lmg;->t0([Ljava/lang/Object;)Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object p0

    .line 725
    iput-object p0, p1, Ldj0;->t:Ljava/util/List;

    .line 726
    .line 727
    new-instance p0, Lyg1;

    .line 728
    .line 729
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 730
    .line 731
    .line 732
    invoke-virtual {p0, v9}, Lyg1;->d0(I)V

    .line 733
    .line 734
    .line 735
    const-string v0, "execSQL"

    .line 736
    .line 737
    filled-new-array {v6, v0}, [Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    sget-object v0, La83;->a:La83;

    .line 745
    .line 746
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 747
    .line 748
    return-object v0

    .line 749
    :pswitch_9
    check-cast p1, Lbs2;

    .line 750
    .line 751
    sget-object p0, Lds2;->a:Lml2;

    .line 752
    .line 753
    sget-object p0, La83;->a:La83;

    .line 754
    .line 755
    return-object p0

    .line 756
    :pswitch_a
    check-cast p1, Ldj0;

    .line 757
    .line 758
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    new-instance p0, Lyg1;

    .line 762
    .line 763
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 764
    .line 765
    .line 766
    const-string v0, "MicroMsg.ResourceHelper"

    .line 767
    .line 768
    const-string v1, "get string, resId %d, but context is null"

    .line 769
    .line 770
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    sget-object v0, La83;->a:La83;

    .line 778
    .line 779
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 780
    .line 781
    return-object v0

    .line 782
    :pswitch_b
    check-cast p1, Ldj0;

    .line 783
    .line 784
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    new-instance p0, Lyg1;

    .line 788
    .line 789
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 790
    .line 791
    .line 792
    sget-object v0, Lwp2;->d:Lwp2;

    .line 793
    .line 794
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    invoke-static {}, Lwp2;->j()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {p0, v0}, Lyg1;->b0(Ljava/lang/Class;)V

    .line 802
    .line 803
    .line 804
    const-string v0, "SettingGroup_Main_Other_Plugin"

    .line 805
    .line 806
    filled-new-array {v0}, [Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {p0, v0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    sget-object v0, La83;->a:La83;

    .line 814
    .line 815
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 816
    .line 817
    return-object v0

    .line 818
    :pswitch_c
    check-cast p1, Ldj0;

    .line 819
    .line 820
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    new-instance p0, Lyg1;

    .line 824
    .line 825
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 826
    .line 827
    .line 828
    sget-object v0, Lwp2;->d:Lwp2;

    .line 829
    .line 830
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    invoke-static {}, Lwp2;->j()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {p0, v0}, Lyg1;->b0(Ljava/lang/Class;)V

    .line 838
    .line 839
    .line 840
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 841
    .line 842
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    invoke-virtual {p0, v0}, Lyg1;->f0(Ljava/lang/Class;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {p0, v12}, Lyg1;->d0(I)V

    .line 849
    .line 850
    .line 851
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    new-array v1, v11, [Ljava/lang/Number;

    .line 856
    .line 857
    aput-object v0, v1, v12

    .line 858
    .line 859
    invoke-virtual {p0, v1}, Lyg1;->i0([Ljava/lang/Number;)V

    .line 860
    .line 861
    .line 862
    sget-object v0, La83;->a:La83;

    .line 863
    .line 864
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 865
    .line 866
    return-object v0

    .line 867
    :pswitch_d
    check-cast p1, Ldj0;

    .line 868
    .line 869
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    new-instance p0, Lyg1;

    .line 873
    .line 874
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 875
    .line 876
    .line 877
    new-instance v0, Lat;

    .line 878
    .line 879
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 880
    .line 881
    .line 882
    new-instance v1, Llv2;

    .line 883
    .line 884
    const-string v2, "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo"

    .line 885
    .line 886
    invoke-direct {v1, v2, v8}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 887
    .line 888
    .line 889
    iput-object v1, v0, Lat;->t:Llv2;

    .line 890
    .line 891
    iput-object v0, p0, Lyg1;->v:Lat;

    .line 892
    .line 893
    invoke-virtual {p0, v12}, Lyg1;->d0(I)V

    .line 894
    .line 895
    .line 896
    const-class v0, Ljava/lang/Integer;

    .line 897
    .line 898
    invoke-virtual {p0, v0}, Lyg1;->f0(Ljava/lang/Class;)V

    .line 899
    .line 900
    .line 901
    sget-object v0, La83;->a:La83;

    .line 902
    .line 903
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 904
    .line 905
    return-object v0

    .line 906
    :pswitch_e
    check-cast p1, Ldj0;

    .line 907
    .line 908
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    new-instance p0, Lml2;

    .line 912
    .line 913
    const/16 v0, 0xc

    .line 914
    .line 915
    invoke-direct {p0, v0}, Lml2;-><init>(I)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {p1, p0}, Ldj0;->c0(Lin0;)V

    .line 919
    .line 920
    .line 921
    sget-object p0, La83;->a:La83;

    .line 922
    .line 923
    return-object p0

    .line 924
    :pswitch_f
    check-cast p1, Lah1;

    .line 925
    .line 926
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    new-instance p0, Lyg1;

    .line 930
    .line 931
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 932
    .line 933
    .line 934
    const-string v0, "size"

    .line 935
    .line 936
    invoke-virtual {p0, v0}, Lyg1;->g0(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    sget-object v0, La83;->a:La83;

    .line 940
    .line 941
    iget-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 942
    .line 943
    if-nez v1, :cond_1b

    .line 944
    .line 945
    new-instance v1, Ljava/util/ArrayList;

    .line 946
    .line 947
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 948
    .line 949
    .line 950
    :cond_1b
    iput-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 951
    .line 952
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    new-instance p0, Lyg1;

    .line 956
    .line 957
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 958
    .line 959
    .line 960
    const-string v1, "get"

    .line 961
    .line 962
    invoke-virtual {p0, v1}, Lyg1;->g0(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    iget-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 966
    .line 967
    if-nez v1, :cond_1c

    .line 968
    .line 969
    new-instance v1, Ljava/util/ArrayList;

    .line 970
    .line 971
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 972
    .line 973
    .line 974
    :cond_1c
    iput-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 975
    .line 976
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    new-instance p0, Lyg1;

    .line 980
    .line 981
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 982
    .line 983
    .line 984
    const-string v1, "iterator"

    .line 985
    .line 986
    invoke-virtual {p0, v1}, Lyg1;->g0(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    iget-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 990
    .line 991
    if-nez v1, :cond_1d

    .line 992
    .line 993
    new-instance v1, Ljava/util/ArrayList;

    .line 994
    .line 995
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 996
    .line 997
    .line 998
    :cond_1d
    iput-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 999
    .line 1000
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    new-instance p0, Lyg1;

    .line 1004
    .line 1005
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1006
    .line 1007
    .line 1008
    const-string v1, "next"

    .line 1009
    .line 1010
    invoke-virtual {p0, v1}, Lyg1;->g0(Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    iget-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 1014
    .line 1015
    if-nez v1, :cond_1e

    .line 1016
    .line 1017
    new-instance v1, Ljava/util/ArrayList;

    .line 1018
    .line 1019
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1020
    .line 1021
    .line 1022
    :cond_1e
    iput-object v1, p1, Lah1;->t:Ljava/util/List;

    .line 1023
    .line 1024
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    return-object v0

    .line 1028
    :pswitch_10
    check-cast p1, Lyg1;

    .line 1029
    .line 1030
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    new-instance p0, Lat;

    .line 1034
    .line 1035
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1036
    .line 1037
    .line 1038
    const-string v0, "List has more than one element."

    .line 1039
    .line 1040
    const-string v1, "List is empty."

    .line 1041
    .line 1042
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 1047
    .line 1048
    .line 1049
    sget-object v0, La83;->a:La83;

    .line 1050
    .line 1051
    iput-object p0, p1, Lyg1;->v:Lat;

    .line 1052
    .line 1053
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1054
    .line 1055
    .line 1056
    move-result-object p0

    .line 1057
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    new-array v2, v9, [Ljava/lang/Number;

    .line 1062
    .line 1063
    aput-object p0, v2, v12

    .line 1064
    .line 1065
    aput-object v1, v2, v11

    .line 1066
    .line 1067
    invoke-virtual {p1, v2}, Lyg1;->i0([Ljava/lang/Number;)V

    .line 1068
    .line 1069
    .line 1070
    const-string p0, "<this>"

    .line 1071
    .line 1072
    filled-new-array {p0}, [Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p0

    .line 1076
    invoke-virtual {p1, p0}, Lyg1;->j0([Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    const-class p0, Ljava/lang/Iterable;

    .line 1080
    .line 1081
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    move-result-object p0

    .line 1085
    invoke-virtual {p1, p0}, Lyg1;->e0([Ljava/lang/Class;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {p1, v5}, Lyg1;->f0(Ljava/lang/Class;)V

    .line 1089
    .line 1090
    .line 1091
    new-instance p0, Lml2;

    .line 1092
    .line 1093
    const/16 v1, 0xd

    .line 1094
    .line 1095
    invoke-direct {p0, v1}, Lml2;-><init>(I)V

    .line 1096
    .line 1097
    .line 1098
    new-instance v1, Lah1;

    .line 1099
    .line 1100
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {p0, v1}, Lml2;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    iput-object v1, p1, Lyg1;->A:Lah1;

    .line 1107
    .line 1108
    return-object v0

    .line 1109
    :pswitch_11
    check-cast p1, Lcj0;

    .line 1110
    .line 1111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    new-instance p0, Lat;

    .line 1115
    .line 1116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1117
    .line 1118
    .line 1119
    const-string v0, "SettingLocation(parentGroup="

    .line 1120
    .line 1121
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v0, La83;->a:La83;

    .line 1129
    .line 1130
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 1131
    .line 1132
    return-object v0

    .line 1133
    :pswitch_12
    check-cast p1, Lcj0;

    .line 1134
    .line 1135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    new-instance p0, Lat;

    .line 1139
    .line 1140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1141
    .line 1142
    .line 1143
    const-string v0, "MicroMsg.SettingDataFactory"

    .line 1144
    .line 1145
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    invoke-virtual {p0, v0}, Lat;->d0([Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    sget-object v0, La83;->a:La83;

    .line 1153
    .line 1154
    iput-object p0, p1, Lcj0;->u:Lat;

    .line 1155
    .line 1156
    return-object v0

    .line 1157
    :pswitch_13
    check-cast p1, Lcj0;

    .line 1158
    .line 1159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    new-instance p0, Lml2;

    .line 1163
    .line 1164
    const/4 v0, 0x7

    .line 1165
    invoke-direct {p0, v0}, Lml2;-><init>(I)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {p1, p0}, Lcj0;->c0(Lin0;)V

    .line 1169
    .line 1170
    .line 1171
    sget-object p0, La83;->a:La83;

    .line 1172
    .line 1173
    return-object p0

    .line 1174
    :pswitch_14
    check-cast p1, Lyg1;

    .line 1175
    .line 1176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    .line 1178
    .line 1179
    new-instance p0, Llv2;

    .line 1180
    .line 1181
    const-string v0, "<init>"

    .line 1182
    .line 1183
    invoke-direct {p0, v0, v8}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 1184
    .line 1185
    .line 1186
    iput-object p0, p1, Lyg1;->t:Llv2;

    .line 1187
    .line 1188
    const-string p0, "androidx.appcompat.app.AppCompatActivity"

    .line 1189
    .line 1190
    filled-new-array {p0}, [Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object p0

    .line 1194
    new-instance v0, Lix1;

    .line 1195
    .line 1196
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    sget-object v1, Lbe0;->h:Lbe0;

    .line 1200
    .line 1201
    new-instance v2, Ljava/util/ArrayList;

    .line 1202
    .line 1203
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1204
    .line 1205
    .line 1206
    iput-object v2, v0, Lix1;->t:Ljava/util/List;

    .line 1207
    .line 1208
    aget-object p0, p0, v12

    .line 1209
    .line 1210
    if-eqz p0, :cond_1f

    .line 1211
    .line 1212
    new-instance v10, Lhx1;

    .line 1213
    .line 1214
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 1215
    .line 1216
    .line 1217
    new-instance v1, Lat;

    .line 1218
    .line 1219
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1220
    .line 1221
    .line 1222
    new-instance v2, Llv2;

    .line 1223
    .line 1224
    invoke-direct {v2, p0, v8}, Llv2;-><init>(Ljava/lang/String;I)V

    .line 1225
    .line 1226
    .line 1227
    iput-object v2, v1, Lat;->t:Llv2;

    .line 1228
    .line 1229
    iput-object v1, v10, Lhx1;->t:Lat;

    .line 1230
    .line 1231
    :cond_1f
    iget-object p0, v0, Lix1;->t:Ljava/util/List;

    .line 1232
    .line 1233
    if-nez p0, :cond_20

    .line 1234
    .line 1235
    new-instance p0, Ljava/util/ArrayList;

    .line 1236
    .line 1237
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 1238
    .line 1239
    .line 1240
    :cond_20
    iput-object p0, v0, Lix1;->t:Ljava/util/List;

    .line 1241
    .line 1242
    invoke-interface {p0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1243
    .line 1244
    .line 1245
    iput-object v0, p1, Lyg1;->x:Lix1;

    .line 1246
    .line 1247
    sget-object p0, La83;->a:La83;

    .line 1248
    .line 1249
    return-object p0

    .line 1250
    :pswitch_15
    check-cast p1, Lat;

    .line 1251
    .line 1252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1253
    .line 1254
    .line 1255
    const-string p0, "context"

    .line 1256
    .line 1257
    const-string v0, "intent"

    .line 1258
    .line 1259
    const-string v1, ""

    .line 1260
    .line 1261
    const-string v2, "activity"

    .line 1262
    .line 1263
    filled-new-array {v1, v2, p0, v0}, [Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object p0

    .line 1267
    invoke-virtual {p1, p0}, Lat;->d0([Ljava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    new-instance p0, Lml2;

    .line 1271
    .line 1272
    invoke-direct {p0, v4}, Lml2;-><init>(I)V

    .line 1273
    .line 1274
    .line 1275
    new-instance v0, Lyg1;

    .line 1276
    .line 1277
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1278
    .line 1279
    .line 1280
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1281
    .line 1282
    .line 1283
    iget-object p0, p1, Lat;->v:Lah1;

    .line 1284
    .line 1285
    if-nez p0, :cond_21

    .line 1286
    .line 1287
    new-instance p0, Lah1;

    .line 1288
    .line 1289
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1290
    .line 1291
    .line 1292
    :cond_21
    iput-object p0, p1, Lat;->v:Lah1;

    .line 1293
    .line 1294
    iget-object v1, p0, Lah1;->t:Ljava/util/List;

    .line 1295
    .line 1296
    if-nez v1, :cond_22

    .line 1297
    .line 1298
    new-instance v1, Ljava/util/ArrayList;

    .line 1299
    .line 1300
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1301
    .line 1302
    .line 1303
    :cond_22
    iput-object v1, p0, Lah1;->t:Ljava/util/List;

    .line 1304
    .line 1305
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1306
    .line 1307
    .line 1308
    new-instance p0, Lat;

    .line 1309
    .line 1310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1311
    .line 1312
    .line 1313
    const-string v0, "com.tencent.mm.plugin.newtips.model"

    .line 1314
    .line 1315
    const/4 v1, 0x4

    .line 1316
    invoke-static {p0, v0, v1}, Lat;->b0(Lat;Ljava/lang/String;I)V

    .line 1317
    .line 1318
    .line 1319
    sget-object v0, La83;->a:La83;

    .line 1320
    .line 1321
    iget-object v1, p1, Lat;->u:Lk11;

    .line 1322
    .line 1323
    if-nez v1, :cond_23

    .line 1324
    .line 1325
    new-instance v1, Lk11;

    .line 1326
    .line 1327
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1328
    .line 1329
    .line 1330
    :cond_23
    iput-object v1, p1, Lat;->u:Lk11;

    .line 1331
    .line 1332
    iget-object p1, v1, Lk11;->t:Ljava/util/List;

    .line 1333
    .line 1334
    if-nez p1, :cond_24

    .line 1335
    .line 1336
    new-instance p1, Ljava/util/ArrayList;

    .line 1337
    .line 1338
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1339
    .line 1340
    .line 1341
    :cond_24
    iput-object p1, v1, Lk11;->t:Ljava/util/List;

    .line 1342
    .line 1343
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1344
    .line 1345
    .line 1346
    return-object v0

    .line 1347
    :pswitch_16
    check-cast p1, Ljg3;

    .line 1348
    .line 1349
    sget-object p0, La83;->a:La83;

    .line 1350
    .line 1351
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    aget-object v0, v0, v12

    .line 1359
    .line 1360
    check-cast v0, Landroid/widget/AdapterView;

    .line 1361
    .line 1362
    if-nez v0, :cond_25

    .line 1363
    .line 1364
    goto :goto_e

    .line 1365
    :cond_25
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    aget-object v1, v1, v9

    .line 1370
    .line 1371
    check-cast v1, Ljava/lang/Integer;

    .line 1372
    .line 1373
    if-eqz v1, :cond_29

    .line 1374
    .line 1375
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    if-nez v0, :cond_26

    .line 1380
    .line 1381
    goto :goto_e

    .line 1382
    :cond_26
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    const-string v2, "getItem"

    .line 1391
    .line 1392
    iput-object v2, v0, Lzf1;->b:Ljava/lang/String;

    .line 1393
    .line 1394
    invoke-virtual {v0}, Lzf1;->b()V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    check-cast v0, Lzg1;

    .line 1406
    .line 1407
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v1

    .line 1411
    invoke-virtual {v0, v1}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v0

    .line 1415
    if-eqz v0, :cond_29

    .line 1416
    .line 1417
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    const-string v1, "Nuke"

    .line 1422
    .line 1423
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1424
    .line 1425
    .line 1426
    move-result v0

    .line 1427
    if-eqz v0, :cond_29

    .line 1428
    .line 1429
    sget-object v0, Lup0;->k:Landroid/app/Activity;

    .line 1430
    .line 1431
    const-string v1, "hostAct"

    .line 1432
    .line 1433
    if-eqz v0, :cond_28

    .line 1434
    .line 1435
    new-instance v2, Landroid/content/Intent;

    .line 1436
    .line 1437
    sget-object v4, Lup0;->k:Landroid/app/Activity;

    .line 1438
    .line 1439
    if-eqz v4, :cond_27

    .line 1440
    .line 1441
    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {p1, v10}, Ljg3;->b(Ljava/lang/Object;)V

    .line 1448
    .line 1449
    .line 1450
    goto :goto_e

    .line 1451
    :cond_27
    invoke-static {v1}, Lt11;->S(Ljava/lang/String;)V

    .line 1452
    .line 1453
    .line 1454
    throw v10

    .line 1455
    :cond_28
    invoke-static {v1}, Lt11;->S(Ljava/lang/String;)V

    .line 1456
    .line 1457
    .line 1458
    throw v10

    .line 1459
    :cond_29
    :goto_e
    return-object p0

    .line 1460
    :pswitch_17
    check-cast p1, Landroid/app/Activity;

    .line 1461
    .line 1462
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1463
    .line 1464
    .line 1465
    new-instance p0, Landroid/content/Intent;

    .line 1466
    .line 1467
    invoke-direct {p0, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {p1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1471
    .line 1472
    .line 1473
    sget-object p0, La83;->a:La83;

    .line 1474
    .line 1475
    return-object p0

    .line 1476
    :pswitch_18
    check-cast p1, Ldj0;

    .line 1477
    .line 1478
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1479
    .line 1480
    .line 1481
    new-instance p0, Lyg1;

    .line 1482
    .line 1483
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1484
    .line 1485
    .line 1486
    invoke-static {p0, v4}, Lyg1;->c0(Lyg1;I)V

    .line 1487
    .line 1488
    .line 1489
    const-class v0, Ljava/lang/Class;

    .line 1490
    .line 1491
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    invoke-virtual {p0, v0}, Lyg1;->e0([Ljava/lang/Class;)V

    .line 1496
    .line 1497
    .line 1498
    const-string v0, "calling getService(...)"

    .line 1499
    .line 1500
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    invoke-virtual {p0, v0}, Lyg1;->h0([Ljava/lang/String;)V

    .line 1505
    .line 1506
    .line 1507
    sget-object v0, La83;->a:La83;

    .line 1508
    .line 1509
    iput-object p0, p1, Ldj0;->u:Lyg1;

    .line 1510
    .line 1511
    return-object v0

    .line 1512
    :pswitch_19
    check-cast p1, Lkd;

    .line 1513
    .line 1514
    iget p0, p1, Lkd;->a:F

    .line 1515
    .line 1516
    iget p1, p1, Lkd;->b:F

    .line 1517
    .line 1518
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1519
    .line 1520
    .line 1521
    move-result p0

    .line 1522
    int-to-long v3, p0

    .line 1523
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1524
    .line 1525
    .line 1526
    move-result p0

    .line 1527
    int-to-long p0, p0

    .line 1528
    shl-long v2, v3, v2

    .line 1529
    .line 1530
    and-long/2addr p0, v0

    .line 1531
    or-long/2addr p0, v2

    .line 1532
    new-instance v0, Lrs1;

    .line 1533
    .line 1534
    invoke-direct {v0, p0, p1}, Lrs1;-><init>(J)V

    .line 1535
    .line 1536
    .line 1537
    return-object v0

    .line 1538
    :pswitch_1a
    check-cast p1, Lrs1;

    .line 1539
    .line 1540
    iget-wide v3, p1, Lrs1;->a:J

    .line 1541
    .line 1542
    const-wide v5, 0x7fffffff7fffffffL

    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    and-long/2addr v5, v3

    .line 1548
    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    cmp-long p0, v5, v7

    .line 1554
    .line 1555
    if-eqz p0, :cond_2a

    .line 1556
    .line 1557
    new-instance p0, Lkd;

    .line 1558
    .line 1559
    shr-long v2, v3, v2

    .line 1560
    .line 1561
    long-to-int v2, v2

    .line 1562
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1563
    .line 1564
    .line 1565
    move-result v2

    .line 1566
    iget-wide v3, p1, Lrs1;->a:J

    .line 1567
    .line 1568
    and-long/2addr v0, v3

    .line 1569
    long-to-int p1, v0

    .line 1570
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1571
    .line 1572
    .line 1573
    move-result p1

    .line 1574
    invoke-direct {p0, v2, p1}, Lkd;-><init>(FF)V

    .line 1575
    .line 1576
    .line 1577
    goto :goto_f

    .line 1578
    :cond_2a
    sget-object p0, Lin2;->a:Lkd;

    .line 1579
    .line 1580
    :goto_f
    return-object p0

    .line 1581
    :pswitch_1b
    check-cast p1, Lw12;

    .line 1582
    .line 1583
    xor-int/lit8 p0, v12, 0x1

    .line 1584
    .line 1585
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1586
    .line 1587
    .line 1588
    move-result-object p0

    .line 1589
    return-object p0

    .line 1590
    :pswitch_1c
    check-cast p1, Ljava/lang/Integer;

    .line 1591
    .line 1592
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 1593
    .line 1594
    .line 1595
    move-result p0

    .line 1596
    new-instance p1, Lnl2;

    .line 1597
    .line 1598
    invoke-direct {p1, p0}, Lnl2;-><init>(I)V

    .line 1599
    .line 1600
    .line 1601
    return-object p1

    .line 1602
    nop

    .line 1603
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
