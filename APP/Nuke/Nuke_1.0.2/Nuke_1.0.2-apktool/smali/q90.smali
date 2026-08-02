.class public final synthetic Lq90;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Class;)V
    .locals 0

    .line 10
    iput p1, p0, Lq90;->h:I

    iput-object p2, p0, Lq90;->i:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Lwp2;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lq90;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lq90;->i:Ljava/lang/Class;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lq90;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, Lq90;->i:Ljava/lang/Class;

    .line 8
    .line 9
    check-cast p1, Ljg3;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 18
    .line 19
    iget-object v0, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_d

    .line 28
    .line 29
    :cond_0
    iget-object p0, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 30
    .line 31
    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p0, Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljg3;->a()[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v3, v0}, Lmg;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v5, v0, Landroid/view/MotionEvent;

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    check-cast v0, Landroid/view/MotionEvent;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v0, v4

    .line 54
    :goto_0
    if-nez v0, :cond_2

    .line 55
    .line 56
    goto/16 :goto_d

    .line 57
    .line 58
    :cond_2
    sget-object v5, Lfx2;->d:Lfx2;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const v5, 0x79080061

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    instance-of v7, v6, Lex2;

    .line 71
    .line 72
    if-eqz v7, :cond_3

    .line 73
    .line 74
    check-cast v6, Lex2;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move-object v6, v4

    .line 78
    :goto_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    const/4 v8, 0x0

    .line 83
    if-eqz v7, :cond_14

    .line 84
    .line 85
    if-eq v7, v2, :cond_f

    .line 86
    .line 87
    const/4 v9, 0x3

    .line 88
    if-eq v7, v1, :cond_4

    .line 89
    .line 90
    if-eq v7, v9, :cond_f

    .line 91
    .line 92
    goto/16 :goto_c

    .line 93
    .line 94
    :cond_4
    if-nez v6, :cond_5

    .line 95
    .line 96
    goto/16 :goto_c

    .line 97
    .line 98
    :cond_5
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    iget v5, v6, Lex2;->a:F

    .line 103
    .line 104
    sub-float/2addr v1, v5

    .line 105
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    iget v7, v6, Lex2;->b:F

    .line 110
    .line 111
    sub-float/2addr v5, v7

    .line 112
    iget-boolean v7, v6, Lex2;->e:Z

    .line 113
    .line 114
    if-nez v7, :cond_7

    .line 115
    .line 116
    cmpg-float v7, v1, v8

    .line 117
    .line 118
    if-gez v7, :cond_7

    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    iget v10, v6, Lex2;->c:I

    .line 125
    .line 126
    int-to-float v10, v10

    .line 127
    cmpl-float v7, v7, v10

    .line 128
    .line 129
    if-lez v7, :cond_7

    .line 130
    .line 131
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    cmpl-float v5, v7, v5

    .line 140
    .line 141
    if-lez v5, :cond_7

    .line 142
    .line 143
    iput-boolean v2, v6, Lex2;->e:Z

    .line 144
    .line 145
    invoke-static {v0}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0, v9}, Landroid/view/MotionEvent;->setAction(I)V

    .line 150
    .line 151
    .line 152
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-static {p1, v5}, Lig3;->b(Ljg3;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 169
    .line 170
    .line 171
    :cond_6
    invoke-static {p0, v2}, Lfx2;->s(Landroid/view/View;Z)V

    .line 172
    .line 173
    .line 174
    invoke-static {p0}, Lfx2;->q(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :catchall_0
    move-exception p0

    .line 179
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 180
    .line 181
    .line 182
    throw p0

    .line 183
    :cond_7
    :goto_2
    iget-boolean v0, v6, Lex2;->e:Z

    .line 184
    .line 185
    if-nez v0, :cond_8

    .line 186
    .line 187
    goto/16 :goto_c

    .line 188
    .line 189
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 198
    .line 199
    const/high16 v5, 0x42200000    # 40.0f

    .line 200
    .line 201
    mul-float/2addr v0, v5

    .line 202
    iget-boolean v5, v6, Lex2;->f:Z

    .line 203
    .line 204
    if-nez v5, :cond_18

    .line 205
    .line 206
    neg-float v5, v0

    .line 207
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 208
    .line 209
    mul-float/2addr v7, v5

    .line 210
    invoke-static {v1, v7, v8}, Lci0;->C(FFF)F

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    cmpl-float v0, v1, v0

    .line 222
    .line 223
    if-ltz v0, :cond_18

    .line 224
    .line 225
    iput-boolean v2, v6, Lex2;->f:Z

    .line 226
    .line 227
    invoke-virtual {p0, v5}, Landroid/view/View;->setTranslationX(F)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v3}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 231
    .line 232
    .line 233
    invoke-static {p0}, Lfx2;->q(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    const v0, 0x79080060

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    if-nez p0, :cond_9

    .line 244
    .line 245
    sget-object p0, Lfx2;->h:Ljava/lang/String;

    .line 246
    .line 247
    const-string v0, "Unable to quote message: bound MsgInfo is missing"

    .line 248
    .line 249
    invoke-static {p0, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_b

    .line 253
    .line 254
    :cond_9
    sget-object v0, Lfx2;->j:Ljava/lang/Object;

    .line 255
    .line 256
    if-nez v0, :cond_a

    .line 257
    .line 258
    sget-object p0, Lfx2;->h:Ljava/lang/String;

    .line 259
    .line 260
    const-string v0, "Unable to quote message: ChatFooter is not ready"

    .line 261
    .line 262
    invoke-static {p0, v0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto/16 :goto_b

    .line 266
    .line 267
    :cond_a
    new-instance v1, Ldx2;

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-direct {v1, v3, v5}, Ldx2;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 278
    .line 279
    .line 280
    :try_start_1
    sget-object v3, Lfx2;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 281
    .line 282
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    if-nez v5, :cond_c

    .line 287
    .line 288
    invoke-static {v0, p0}, Lfx2;->r(Ljava/lang/Object;Ljava/lang/Object;)Lcx2;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v3, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-nez v1, :cond_b

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_b
    move-object v5, v1

    .line 300
    goto :goto_3

    .line 301
    :catchall_1
    move-exception v0

    .line 302
    goto :goto_4

    .line 303
    :cond_c
    :goto_3
    check-cast v5, Lcx2;

    .line 304
    .line 305
    iget-boolean v1, v5, Lcx2;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 306
    .line 307
    iget-object v3, v5, Lcx2;->a:Ljava/lang/reflect/Method;

    .line 308
    .line 309
    if-eqz v1, :cond_d

    .line 310
    .line 311
    :try_start_2
    filled-new-array {p0, v4}, [Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v3, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    goto :goto_5

    .line 320
    :cond_d
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-virtual {v3, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 328
    goto :goto_5

    .line 329
    :goto_4
    new-instance v1, Lx92;

    .line 330
    .line 331
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    move-object v0, v1

    .line 335
    :goto_5
    nop

    .line 336
    instance-of v1, v0, Lx92;

    .line 337
    .line 338
    if-nez v1, :cond_e

    .line 339
    .line 340
    sget-object v1, Lfx2;->d:Lfx2;

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    sget-object v1, Lfx2;->h:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    const-string v3, "Quoted message: type="

    .line 356
    .line 357
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-static {v1, p0}, Lhg3;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :cond_e
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    if-eqz p0, :cond_18

    .line 369
    .line 370
    sget-object v0, Lfx2;->d:Lfx2;

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    sget-object v0, Lfx2;->h:Ljava/lang/String;

    .line 376
    .line 377
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    const-string v1, "Unable to quote message: "

    .line 382
    .line 383
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    invoke-static {v0, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_b

    .line 391
    .line 392
    :cond_f
    if-nez v6, :cond_10

    .line 393
    .line 394
    goto/16 :goto_c

    .line 395
    .line 396
    :cond_10
    invoke-virtual {p0, v5, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    if-eqz v0, :cond_11

    .line 404
    .line 405
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 406
    .line 407
    .line 408
    :cond_11
    iget-object v0, v6, Lex2;->d:Ljava/lang/Boolean;

    .line 409
    .line 410
    if-eqz v0, :cond_12

    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    invoke-static {p0, v0}, Lfx2;->s(Landroid/view/View;Z)V

    .line 417
    .line 418
    .line 419
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    cmpg-float v0, v0, v8

    .line 424
    .line 425
    if-nez v0, :cond_13

    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_13
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    invoke-virtual {p0, v8}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    const-wide/16 v0, 0xc8

    .line 437
    .line 438
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 443
    .line 444
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 452
    .line 453
    .line 454
    :goto_6
    iget-boolean v3, v6, Lex2;->e:Z

    .line 455
    .line 456
    goto/16 :goto_c

    .line 457
    .line 458
    :cond_14
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 463
    .line 464
    .line 465
    invoke-virtual {p0, v8}, Landroid/view/View;->setTranslationX(F)V

    .line 466
    .line 467
    .line 468
    new-instance v1, Lex2;

    .line 469
    .line 470
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    invoke-static {v6}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    invoke-virtual {v6}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    const-class v7, Ljava/lang/Boolean;

    .line 491
    .line 492
    :try_start_3
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    invoke-virtual {v8}, Ln4;->r()Lhi0;

    .line 497
    .line 498
    .line 499
    move-result-object v8

    .line 500
    invoke-static {v7}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 501
    .line 502
    .line 503
    move-result-object v9

    .line 504
    invoke-static {v9}, Lp40;->A(Lbt;)Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    move-result-object v9

    .line 508
    if-nez v9, :cond_15

    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_15
    move-object v7, v9

    .line 512
    :goto_7
    iput-object v7, v8, Lhi0;->g:Ljava/lang/Class;

    .line 513
    .line 514
    invoke-virtual {v8}, Lhi0;->c()Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    invoke-static {v7}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    check-cast v7, Lpi0;

    .line 523
    .line 524
    invoke-virtual {v7}, Lpi0;->g0()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    instance-of v8, v7, Ljava/lang/Boolean;

    .line 529
    .line 530
    if-eqz v8, :cond_16

    .line 531
    .line 532
    check-cast v7, Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 533
    .line 534
    goto :goto_9

    .line 535
    :catchall_2
    move-exception v7

    .line 536
    goto :goto_8

    .line 537
    :cond_16
    move-object v7, v4

    .line 538
    goto :goto_9

    .line 539
    :goto_8
    new-instance v8, Lx92;

    .line 540
    .line 541
    invoke-direct {v8, v7}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    move-object v7, v8

    .line 545
    :goto_9
    nop

    .line 546
    instance-of v8, v7, Lx92;

    .line 547
    .line 548
    if-eqz v8, :cond_17

    .line 549
    .line 550
    goto :goto_a

    .line 551
    :cond_17
    move-object v4, v7

    .line 552
    :goto_a
    check-cast v4, Ljava/lang/Boolean;

    .line 553
    .line 554
    invoke-direct {v1, v2, v0, v6, v4}, Lex2;-><init>(FFILjava/lang/Boolean;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {p0, v5, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    move v2, v3

    .line 561
    :cond_18
    :goto_b
    move v3, v2

    .line 562
    :goto_c
    if-eqz v3, :cond_19

    .line 563
    .line 564
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 565
    .line 566
    invoke-virtual {p1, p0}, Ljg3;->b(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    :cond_19
    :goto_d
    sget-object p0, La83;->a:La83;

    .line 570
    .line 571
    return-object p0

    .line 572
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    iget-object p1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 576
    .line 577
    invoke-static {}, Ltp0;->y()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    const-string v5, "com.tencent.mm.plugin.setting.ui.setting.SettingsUI.onCreate"

    .line 582
    .line 583
    invoke-static {v0, v5, v3}, Lpv2;->h0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-nez v0, :cond_1a

    .line 588
    .line 589
    goto/16 :goto_12

    .line 590
    .line 591
    :cond_1a
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 592
    .line 593
    if-eqz v0, :cond_1b

    .line 594
    .line 595
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0}, Ln4;->r()Lhi0;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    const-class v5, Ljava/util/LinkedList;

    .line 604
    .line 605
    iput-object v5, v0, Lhi0;->g:Ljava/lang/Class;

    .line 606
    .line 607
    invoke-virtual {v0}, Lzf1;->b()V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0}, Lhi0;->c()Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    check-cast v0, Lpi0;

    .line 619
    .line 620
    if-eqz v0, :cond_1b

    .line 621
    .line 622
    invoke-virtual {v0}, Lpi0;->g0()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    goto :goto_e

    .line 627
    :cond_1b
    move-object v0, v4

    .line 628
    :goto_e
    instance-of v5, v0, Ljava/util/LinkedList;

    .line 629
    .line 630
    if-eqz v5, :cond_1c

    .line 631
    .line 632
    check-cast v0, Ljava/util/LinkedList;

    .line 633
    .line 634
    goto :goto_f

    .line 635
    :cond_1c
    move-object v0, v4

    .line 636
    :goto_f
    if-eqz v0, :cond_22

    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-ne v0, v2, :cond_1d

    .line 643
    .line 644
    goto/16 :goto_12

    .line 645
    .line 646
    :cond_1d
    sget-object v0, Lup0;->k:Landroid/app/Activity;

    .line 647
    .line 648
    if-eqz v0, :cond_21

    .line 649
    .line 650
    const-class v5, Landroid/content/Context;

    .line 651
    .line 652
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    invoke-virtual {p0, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    invoke-virtual {v5}, Ln4;->v()Lsg1;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 677
    .line 678
    iput-object v6, v5, Lsg1;->C:Ljava/lang/Class;

    .line 679
    .line 680
    const-class v6, Ljava/lang/String;

    .line 681
    .line 682
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    invoke-virtual {v5, v6}, Lsg1;->d([Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v5}, Lzf1;->b()V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v5}, Lsg1;->c()Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    invoke-static {v5}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v5

    .line 700
    check-cast v5, Lzg1;

    .line 701
    .line 702
    const-string v6, "nuke_entry"

    .line 703
    .line 704
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    invoke-virtual {v5, v6}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    sget-object v5, Lr91;->d:Lr91;

    .line 712
    .line 713
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    sget-object v5, Lr91;->f:Lhx2;

    .line 717
    .line 718
    invoke-virtual {v5}, Lhx2;->getValue()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    check-cast v5, Ljava/lang/reflect/Method;

    .line 723
    .line 724
    const-string v6, "Nuke"

    .line 725
    .line 726
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v6

    .line 730
    invoke-virtual {v5, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 734
    .line 735
    if-eqz v5, :cond_1f

    .line 736
    .line 737
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    if-eqz v5, :cond_1f

    .line 746
    .line 747
    array-length v6, v5

    .line 748
    move v7, v3

    .line 749
    :goto_10
    if-ge v7, v6, :cond_1f

    .line 750
    .line 751
    aget-object v8, v5, v7

    .line 752
    .line 753
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    move-result-object v9

    .line 757
    array-length v10, v9

    .line 758
    if-ne v10, v1, :cond_1e

    .line 759
    .line 760
    aget-object v10, v9, v3

    .line 761
    .line 762
    invoke-static {v10, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    move-result v10

    .line 766
    if-eqz v10, :cond_1e

    .line 767
    .line 768
    aget-object v9, v9, v2

    .line 769
    .line 770
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 771
    .line 772
    invoke-static {v9, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    move-result v9

    .line 776
    if-eqz v9, :cond_1e

    .line 777
    .line 778
    move-object v4, v8

    .line 779
    goto :goto_11

    .line 780
    :cond_1e
    add-int/lit8 v7, v7, 0x1

    .line 781
    .line 782
    goto :goto_10

    .line 783
    :cond_1f
    :goto_11
    if-eqz v4, :cond_20

    .line 784
    .line 785
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 786
    .line 787
    .line 788
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 789
    .line 790
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 791
    .line 792
    .line 793
    move-result-object p1

    .line 794
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object p1

    .line 798
    invoke-virtual {v4, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    const-string p0, "\u65e7\u7248\u8bbe\u7f6e\u5165\u53e3\u6dfb\u52a0\u6210\u529f"

    .line 802
    .line 803
    invoke-static {p0}, Lwp2;->m(Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    goto :goto_12

    .line 807
    :cond_20
    const-string p0, "\u627e\u4e0d\u5230\u65e7\u7248 Preference \u6dfb\u52a0\u65b9\u6cd5"

    .line 808
    .line 809
    invoke-static {p0}, Lwp2;->m(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    goto :goto_12

    .line 813
    :cond_21
    const-string p0, "hostAct"

    .line 814
    .line 815
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    throw v4

    .line 819
    :cond_22
    :goto_12
    sget-object p0, La83;->a:La83;

    .line 820
    .line 821
    return-object p0

    .line 822
    :pswitch_1
    sget-object v0, Lr90;->d:Lr90;

    .line 823
    .line 824
    sget-object v1, La83;->a:La83;

    .line 825
    .line 826
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    iget-object p1, p1, Ljg3;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 830
    .line 831
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 832
    .line 833
    if-nez p1, :cond_23

    .line 834
    .line 835
    goto :goto_14

    .line 836
    :cond_23
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    invoke-static {p1, p0}, Lr90;->r(Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 840
    .line 841
    .line 842
    move-object p1, v1

    .line 843
    goto :goto_13

    .line 844
    :catchall_3
    move-exception p0

    .line 845
    new-instance p1, Lx92;

    .line 846
    .line 847
    invoke-direct {p1, p0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 848
    .line 849
    .line 850
    :goto_13
    invoke-static {p1}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 851
    .line 852
    .line 853
    move-result-object p0

    .line 854
    if-eqz p0, :cond_24

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    sget-object p1, Lr90;->h:Ljava/lang/String;

    .line 860
    .line 861
    invoke-static {p0}, Lfg1;->Q(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object p0

    .line 865
    const-string v0, "Unable to inject contact ID entry: "

    .line 866
    .line 867
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object p0

    .line 871
    invoke-static {p1, p0}, Lhg3;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    :cond_24
    :goto_14
    return-object v1

    .line 875
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
