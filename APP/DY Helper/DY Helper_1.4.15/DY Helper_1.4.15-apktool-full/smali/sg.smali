.class public final Lsg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ld30;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lsg;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final γ(Landroid/app/Activity;Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    iget p0, p0, Lsg;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledDoubleTapSlop()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-float p0, p0

    .line 27
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p0, v0

    .line 34
    new-instance v0, Leo1;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, v0

    .line 40
    :goto_0
    const/high16 v0, 0x42f00000    # 120.0f

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    instance-of v3, p0, Leo1;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    move-object p0, v0

    .line 51
    :cond_1
    check-cast p0, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    sget-object v3, Lg10;->η:Ljava/lang/Object;

    .line 58
    .line 59
    monitor-enter v3

    .line 60
    :try_start_1
    sget-object v0, Lg10;->κ:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-nez v4, :cond_2

    .line 67
    .line 68
    new-instance v4, Lh10;

    .line 69
    .line 70
    sget-wide v5, Lg10;->α:J

    .line 71
    .line 72
    invoke-direct {v4, v5, v6}, Lh10;-><init>(J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p1, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_1
    move-exception v0

    .line 80
    move-object p0, v0

    .line 81
    goto :goto_4

    .line 82
    :cond_2
    :goto_1
    check-cast v4, Lh10;

    .line 83
    .line 84
    sget-object p1, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 85
    .line 86
    new-instance v5, Lj10;

    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getDownTime()J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 93
    .line 94
    .line 95
    move-result-wide v8

    .line 96
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    invoke-direct/range {v5 .. v11}, Lj10;-><init>(JJFF)V

    .line 105
    .line 106
    .line 107
    iget-object p1, v4, Lh10;->β:Lj10;

    .line 108
    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    const-wide v6, 0x7fffffffffffffffL

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    iget-wide v6, p1, Lj10;->β:J

    .line 118
    .line 119
    sub-long v6, v8, v6

    .line 120
    .line 121
    :goto_2
    if-eqz p1, :cond_5

    .line 122
    .line 123
    const-wide/16 v8, 0x1

    .line 124
    .line 125
    cmp-long p2, v8, v6

    .line 126
    .line 127
    if-gtz p2, :cond_5

    .line 128
    .line 129
    iget-wide v8, v4, Lh10;->α:J

    .line 130
    .line 131
    cmp-long p2, v6, v8

    .line 132
    .line 133
    if-gtz p2, :cond_5

    .line 134
    .line 135
    const/4 p2, 0x0

    .line 136
    cmpg-float v0, p0, p2

    .line 137
    .line 138
    if-gez v0, :cond_4

    .line 139
    .line 140
    move p0, p2

    .line 141
    :cond_4
    iget p2, p1, Lj10;->γ:F

    .line 142
    .line 143
    sub-float/2addr v10, p2

    .line 144
    iget p1, p1, Lj10;->δ:F

    .line 145
    .line 146
    sub-float/2addr v11, p1

    .line 147
    mul-float/2addr v10, v10

    .line 148
    mul-float/2addr v11, v11

    .line 149
    add-float/2addr v11, v10

    .line 150
    mul-float/2addr p0, p0

    .line 151
    cmpg-float p0, v11, p0

    .line 152
    .line 153
    if-gtz p0, :cond_5

    .line 154
    .line 155
    move-object v2, v5

    .line 156
    :cond_5
    iput-object v2, v4, Lh10;->γ:Lj10;

    .line 157
    .line 158
    iput-object v5, v4, Lh10;->β:Lj10;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 159
    .line 160
    monitor-exit v3

    .line 161
    :goto_3
    return v1

    .line 162
    :goto_4
    monitor-exit v3

    .line 163
    throw p0

    .line 164
    :pswitch_0
    sget-object p0, Lug;->α:Ltg;

    .line 165
    .line 166
    invoke-static {}, Ltg;->Μ()Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    const/4 v0, 0x5

    .line 171
    const/4 v3, 0x3

    .line 172
    const/4 v4, 0x1

    .line 173
    if-eqz p0, :cond_10

    .line 174
    .line 175
    sget-boolean p0, Lug;->σ:Z

    .line 176
    .line 177
    if-eqz p0, :cond_10

    .line 178
    .line 179
    sget-object p0, Lug;->μ:La;

    .line 180
    .line 181
    iget-object p0, p0, La;->β:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 184
    .line 185
    if-eqz p0, :cond_10

    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    if-nez p0, :cond_6

    .line 192
    .line 193
    goto/16 :goto_5

    .line 194
    .line 195
    :cond_6
    if-ne p0, p1, :cond_10

    .line 196
    .line 197
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-eqz p0, :cond_f

    .line 202
    .line 203
    const-wide/16 v5, 0x0

    .line 204
    .line 205
    if-eq p0, v4, :cond_c

    .line 206
    .line 207
    const/4 v2, 0x2

    .line 208
    if-eq p0, v2, :cond_9

    .line 209
    .line 210
    if-eq p0, v3, :cond_8

    .line 211
    .line 212
    if-eq p0, v0, :cond_7

    .line 213
    .line 214
    const/4 v2, 0x6

    .line 215
    if-eq p0, v2, :cond_7

    .line 216
    .line 217
    goto/16 :goto_6

    .line 218
    .line 219
    :cond_7
    sput-boolean v4, Lug;->Ζ:Z

    .line 220
    .line 221
    goto/16 :goto_6

    .line 222
    .line 223
    :cond_8
    invoke-static {}, Ltg;->з()V

    .line 224
    .line 225
    .line 226
    goto/16 :goto_6

    .line 227
    .line 228
    :cond_9
    sget-wide v7, Lug;->Γ:J

    .line 229
    .line 230
    cmp-long p0, v7, v5

    .line 231
    .line 232
    if-gtz p0, :cond_a

    .line 233
    .line 234
    goto/16 :goto_6

    .line 235
    .line 236
    :cond_a
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    sget v5, Lug;->Δ:F

    .line 249
    .line 250
    sub-float/2addr v2, v5

    .line 251
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    int-to-float p0, p0

    .line 256
    cmpl-float v2, v2, p0

    .line 257
    .line 258
    if-gtz v2, :cond_b

    .line 259
    .line 260
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    sget v5, Lug;->Ε:F

    .line 265
    .line 266
    sub-float/2addr v2, v5

    .line 267
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    cmpl-float p0, v2, p0

    .line 272
    .line 273
    if-lez p0, :cond_11

    .line 274
    .line 275
    :cond_b
    sput-boolean v4, Lug;->Ζ:Z

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_c
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 279
    .line 280
    .line 281
    move-result-wide v7

    .line 282
    sget-wide v9, Lug;->Γ:J

    .line 283
    .line 284
    sub-long/2addr v7, v9

    .line 285
    cmp-long p0, v9, v5

    .line 286
    .line 287
    if-lez p0, :cond_e

    .line 288
    .line 289
    sget-boolean p0, Lug;->Ζ:Z

    .line 290
    .line 291
    if-nez p0, :cond_e

    .line 292
    .line 293
    cmp-long p0, v5, v7

    .line 294
    .line 295
    if-gtz p0, :cond_e

    .line 296
    .line 297
    const-wide/16 v5, 0x191

    .line 298
    .line 299
    cmp-long p0, v7, v5

    .line 300
    .line 301
    if-gez p0, :cond_e

    .line 302
    .line 303
    sget-object p0, Lpq;->α:Lpq;

    .line 304
    .line 305
    invoke-static {}, Lpq;->β()Lkq;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    if-eqz p0, :cond_d

    .line 310
    .line 311
    iget-object p0, p0, Lkq;->δ:Lmq;

    .line 312
    .line 313
    iget-wide v5, p0, Lmq;->δ:J

    .line 314
    .line 315
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    :cond_d
    if-eqz v2, :cond_e

    .line 320
    .line 321
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 322
    .line 323
    .line 324
    move-result-wide v5

    .line 325
    sput-wide v5, Lug;->Η:J

    .line 326
    .line 327
    sput-object v2, Lug;->Θ:Ljava/lang/Long;

    .line 328
    .line 329
    const-string p0, "rf9ef3362bd85f5b5"

    .line 330
    .line 331
    new-instance v5, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    const-string v6, "r49a9992dee2eb0ce"

    .line 334
    .line 335
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-static {p0, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :cond_e
    invoke-static {}, Ltg;->з()V

    .line 349
    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_f
    invoke-static {}, Ltg;->θ()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    .line 356
    .line 357
    .line 358
    move-result-wide v5

    .line 359
    sput-wide v5, Lug;->Γ:J

    .line 360
    .line 361
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 362
    .line 363
    .line 364
    move-result p0

    .line 365
    sput p0, Lug;->Δ:F

    .line 366
    .line 367
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 368
    .line 369
    .line 370
    move-result p0

    .line 371
    sput p0, Lug;->Ε:F

    .line 372
    .line 373
    sput-boolean v1, Lug;->Ζ:Z

    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_10
    :goto_5
    invoke-static {}, Ltg;->з()V

    .line 377
    .line 378
    .line 379
    :cond_11
    :goto_6
    invoke-static {}, Ltg;->Μ()Z

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    if-nez p0, :cond_12

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_12
    sget-boolean p0, Lug;->τ:Z

    .line 387
    .line 388
    if-nez p0, :cond_13

    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_13
    sget-boolean p0, Lug;->ν:Z

    .line 392
    .line 393
    if-nez p0, :cond_14

    .line 394
    .line 395
    sget-boolean p0, Lug;->σ:Z

    .line 396
    .line 397
    if-nez p0, :cond_14

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_14
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 401
    .line 402
    invoke-direct {p0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    sput-object p0, Lug;->η:Ljava/lang/ref/WeakReference;

    .line 406
    .line 407
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 408
    .line 409
    .line 410
    move-result p0

    .line 411
    if-eqz p0, :cond_16

    .line 412
    .line 413
    if-eq p0, v4, :cond_15

    .line 414
    .line 415
    if-eq p0, v3, :cond_15

    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_15
    invoke-static {}, Ltg;->η()V

    .line 419
    .line 420
    .line 421
    new-instance p0, Ls0;

    .line 422
    .line 423
    invoke-direct {p0, v0}, Ls0;-><init>(I)V

    .line 424
    .line 425
    .line 426
    sput-object p0, Lug;->Υ:Ls0;

    .line 427
    .line 428
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 429
    .line 430
    sget-object p1, Lug;->Υ:Ls0;

    .line 431
    .line 432
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    const-wide/16 v2, 0x258

    .line 436
    .line 437
    invoke-virtual {p0, p1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 438
    .line 439
    .line 440
    goto :goto_7

    .line 441
    :cond_16
    invoke-static {}, Ltg;->η()V

    .line 442
    .line 443
    .line 444
    sput-boolean v4, Lug;->φ:Z

    .line 445
    .line 446
    invoke-static {v4}, Ltg;->α(Z)V

    .line 447
    .line 448
    .line 449
    :goto_7
    return v1

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
