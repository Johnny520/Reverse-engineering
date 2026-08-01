.class public final Lpy1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lpy1;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Lm01;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Lpy1;->α:I

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 9

    .line 1
    iget v0, p0, Lpy1;->α:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "\u6355\u83b7\u9876\u680f ViewPager: "

    .line 5
    .line 6
    const-string v3, "r3912affb67f40e11"

    .line 7
    .line 8
    const-string v4, "rfe847aaa60ab2d90"

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    const-string p0, "\ud83d\udd0d \u53d1\u73b0 setPlaySpeed: "

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 27
    .line 28
    aget-object v0, v0, v7

    .line 29
    .line 30
    instance-of v1, v0, Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    check-cast v0, Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v8

    .line 38
    :goto_0
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    iget-object p1, p1, Lk01;->ε:Ljava/lang/Object;

    .line 42
    .line 43
    instance-of v1, p1, Ljava/lang/Class;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    check-cast p1, Ljava/lang/Class;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object p1, v8

    .line 51
    :goto_1
    if-nez p1, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    const-string v1, "X."

    .line 55
    .line 56
    invoke-static {v0, v1, v7}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const-string v1, "#setPlaySpeed"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v2, Ln82;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    :try_start_0
    const-string v1, "setPlaySpeed"

    .line 79
    .line 80
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {p1, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {v4, p0, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lxq0;->α:Lxq0;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v1, Lbt;

    .line 103
    .line 104
    const/4 v2, 0x6

    .line 105
    invoke-direct {v1, v0, v2}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    :catch_0
    :goto_2
    return-void

    .line 112
    :pswitch_2
    const-string p0, "after setSpeed: provider.getSpeed()="

    .line 113
    .line 114
    const-string v0, "after setSpeed: LJIJJLI.LIZ="

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v1, p1, Lk01;->β:Ljava/lang/Object;

    .line 120
    .line 121
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 122
    .line 123
    aget-object p1, p1, v7

    .line 124
    .line 125
    instance-of v2, p1, Ljava/lang/Float;

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    check-cast p1, Ljava/lang/Float;

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move-object p1, v8

    .line 133
    :goto_3
    if-eqz p1, :cond_9

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    const/high16 v2, 0x40400000    # 3.0f

    .line 140
    .line 141
    cmpg-float p1, p1, v2

    .line 142
    .line 143
    if-gtz p1, :cond_7

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    :try_start_1
    const-string p1, "LJIJJLI"

    .line 147
    .line 148
    invoke-static {v1, p1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-string v2, "LIZ"

    .line 153
    .line 154
    if-eqz p1, :cond_8

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v3, v2}, Lqe0;->κ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->getFloat(Ljava/lang/Object;)F

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    new-instance v2, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {v4, p1, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    const-string p1, "Instance receiver is null for field "

    .line 185
    .line 186
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    :catchall_0
    :goto_4
    :try_start_2
    const-string p1, "getVideoInfoProvider"

    .line 201
    .line 202
    new-array v0, v7, [Ljava/lang/Object;

    .line 203
    .line 204
    invoke-static {v1, p1, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const-string v0, "getSpeed"

    .line 209
    .line 210
    new-array v1, v7, [Ljava/lang/Object;

    .line 211
    .line 212
    invoke-static {p1, v0, v1}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    new-instance v0, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {v4, p0, v8, v5, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 229
    .line 230
    .line 231
    :catchall_1
    :cond_9
    :goto_5
    return-void

    .line 232
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    sget-object p0, Ln82;->α:[Ljava/lang/String;

    .line 236
    .line 237
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 238
    .line 239
    sget-object v0, Ln82;->γ:[Ljava/lang/Float;

    .line 240
    .line 241
    instance-of v1, p0, [F

    .line 242
    .line 243
    if-eqz v1, :cond_a

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    array-length p0, v0

    .line 249
    new-array v8, p0, [F

    .line 250
    .line 251
    :goto_6
    if-ge v7, p0, :cond_f

    .line 252
    .line 253
    aget-object v1, v0, v7

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    aput v1, v8, v7

    .line 260
    .line 261
    add-int/lit8 v7, v7, 0x1

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_a
    instance-of v1, p0, [Ljava/lang/Object;

    .line 265
    .line 266
    if-eqz v1, :cond_b

    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    const-class v1, Ljava/lang/Float;

    .line 277
    .line 278
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    if-eqz p0, :cond_f

    .line 283
    .line 284
    array-length p0, v0

    .line 285
    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    move-object v8, p0

    .line 290
    check-cast v8, [Ljava/lang/Float;

    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_b
    instance-of v1, p0, Ljava/util/List;

    .line 294
    .line 295
    if-eqz v1, :cond_f

    .line 296
    .line 297
    move-object v1, p0

    .line 298
    check-cast v1, Ljava/util/Collection;

    .line 299
    .line 300
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-nez v1, :cond_f

    .line 305
    .line 306
    check-cast p0, Ljava/lang/Iterable;

    .line 307
    .line 308
    instance-of v1, p0, Ljava/util/Collection;

    .line 309
    .line 310
    if-eqz v1, :cond_c

    .line 311
    .line 312
    move-object v1, p0

    .line 313
    check-cast v1, Ljava/util/Collection;

    .line 314
    .line 315
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_c

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_c
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    :cond_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_e

    .line 331
    .line 332
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    instance-of v1, v1, Ljava/lang/Float;

    .line 337
    .line 338
    if-nez v1, :cond_d

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_e
    :goto_7
    invoke-static {v0}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    :cond_f
    :goto_8
    if-eqz v8, :cond_10

    .line 346
    .line 347
    invoke-virtual {p1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_10
    return-void

    .line 351
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    sget-wide p0, Ll82;->ι:J

    .line 355
    .line 356
    sget-object v0, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 359
    .line 360
    .line 361
    move-result-wide v0

    .line 362
    cmp-long p0, p0, v0

    .line 363
    .line 364
    if-nez p0, :cond_11

    .line 365
    .line 366
    goto :goto_9

    .line 367
    :cond_11
    sget-object p0, Ll82;->ζ:Landroid/os/Handler;

    .line 368
    .line 369
    new-instance p1, Lfb0;

    .line 370
    .line 371
    const/16 v0, 0x17

    .line 372
    .line 373
    invoke-direct {p1, v0}, Lfb0;-><init>(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 377
    .line 378
    .line 379
    :goto_9
    return-void

    .line 380
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 384
    .line 385
    if-eqz p0, :cond_12

    .line 386
    .line 387
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-static {p1}, Ll82;->γ(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    if-eqz p1, :cond_12

    .line 396
    .line 397
    invoke-static {p1, p0}, Ll82;->β(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    :cond_12
    sget-object p0, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 401
    .line 402
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 403
    .line 404
    .line 405
    move-result-wide p0

    .line 406
    const-wide/high16 v0, -0x8000000000000000L

    .line 407
    .line 408
    sput-wide v0, Ll82;->ι:J

    .line 409
    .line 410
    sput-wide p0, Ll82;->θ:J

    .line 411
    .line 412
    new-array v0, v5, [J

    .line 413
    .line 414
    fill-array-data v0, :array_0

    .line 415
    .line 416
    .line 417
    :goto_a
    if-ge v7, v5, :cond_13

    .line 418
    .line 419
    aget-wide v1, v0, v7

    .line 420
    .line 421
    sget-object v3, Ll82;->ζ:Landroid/os/Handler;

    .line 422
    .line 423
    new-instance v4, Lh82;

    .line 424
    .line 425
    invoke-direct {v4, p0, p1}, Lh82;-><init>(J)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 429
    .line 430
    .line 431
    add-int/lit8 v7, v7, 0x1

    .line 432
    .line 433
    goto :goto_a

    .line 434
    :cond_13
    return-void

    .line 435
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    sget-object p0, Lbe0;->α:Lbe0;

    .line 439
    .line 440
    invoke-virtual {p0}, Lbe0;->η()Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_14

    .line 445
    .line 446
    goto/16 :goto_e

    .line 447
    .line 448
    :cond_14
    :try_start_3
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 449
    .line 450
    instance-of v0, p1, Landroid/app/Activity;

    .line 451
    .line 452
    if-eqz v0, :cond_15

    .line 453
    .line 454
    move-object v8, p1

    .line 455
    check-cast v8, Landroid/app/Activity;

    .line 456
    .line 457
    goto :goto_b

    .line 458
    :catchall_2
    move-exception v0

    .line 459
    move-object p0, v0

    .line 460
    goto :goto_c

    .line 461
    :cond_15
    :goto_b
    if-nez v8, :cond_16

    .line 462
    .line 463
    goto :goto_e

    .line 464
    :cond_16
    sget-object p1, Lc72;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 465
    .line 466
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    sget-object v0, Lc72;->β:[Ljava/lang/String;

    .line 471
    .line 472
    invoke-static {p1, v0}, Lc72;->β(Landroid/content/Intent;[Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    sget-object v1, Lc72;->γ:[Ljava/lang/String;

    .line 477
    .line 478
    invoke-static {p1, v1}, Lc72;->β(Landroid/content/Intent;[Ljava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    invoke-virtual {p0, v0, p1}, Lbe0;->κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 483
    .line 484
    .line 485
    move-result p0

    .line 486
    if-nez p0, :cond_17

    .line 487
    .line 488
    goto :goto_e

    .line 489
    :cond_17
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    if-eqz p0, :cond_18

    .line 494
    .line 495
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    if-eqz p0, :cond_18

    .line 500
    .line 501
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 502
    .line 503
    .line 504
    :cond_18
    new-instance p0, Le71;

    .line 505
    .line 506
    const/16 p1, 0x13

    .line 507
    .line 508
    invoke-direct {p0, v8, p1}, Le71;-><init>(Landroid/app/Activity;I)V

    .line 509
    .line 510
    .line 511
    invoke-static {v8, p0}, Lpd2;->Φ(Landroid/app/Activity;Le71;)Z

    .line 512
    .line 513
    .line 514
    move-result p0

    .line 515
    if-nez p0, :cond_19

    .line 516
    .line 517
    invoke-virtual {v8}, Landroid/app/Activity;->isFinishing()Z

    .line 518
    .line 519
    .line 520
    move-result p0

    .line 521
    if-nez p0, :cond_19

    .line 522
    .line 523
    invoke-virtual {v8}, Landroid/app/Activity;->isDestroyed()Z

    .line 524
    .line 525
    .line 526
    move-result p0

    .line 527
    if-nez p0, :cond_19

    .line 528
    .line 529
    invoke-virtual {v8}, Landroid/app/Activity;->finish()V

    .line 530
    .line 531
    .line 532
    :cond_19
    sget-object p0, Ls62;->α:Ls62;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 533
    .line 534
    goto :goto_d

    .line 535
    :goto_c
    new-instance p1, Leo1;

    .line 536
    .line 537
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 538
    .line 539
    .line 540
    move-object p0, p1

    .line 541
    :goto_d
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 542
    .line 543
    .line 544
    move-result-object p0

    .line 545
    if-eqz p0, :cond_1a

    .line 546
    .line 547
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object p0

    .line 551
    const-string p1, "profile navigation callback failed: "

    .line 552
    .line 553
    invoke-static {p1, p0, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    :cond_1a
    :goto_e
    return-void

    .line 557
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    sget-object p0, Lbe0;->α:Lbe0;

    .line 561
    .line 562
    invoke-virtual {p0}, Lbe0;->η()Z

    .line 563
    .line 564
    .line 565
    move-result p0

    .line 566
    if-nez p0, :cond_1b

    .line 567
    .line 568
    goto :goto_12

    .line 569
    :cond_1b
    :try_start_4
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 570
    .line 571
    instance-of v0, p0, Ljava/util/List;

    .line 572
    .line 573
    if-eqz v0, :cond_1c

    .line 574
    .line 575
    move-object v8, p0

    .line 576
    check-cast v8, Ljava/util/List;

    .line 577
    .line 578
    goto :goto_f

    .line 579
    :catchall_3
    move-exception v0

    .line 580
    move-object p0, v0

    .line 581
    goto :goto_10

    .line 582
    :cond_1c
    :goto_f
    if-nez v8, :cond_1d

    .line 583
    .line 584
    goto :goto_12

    .line 585
    :cond_1d
    invoke-static {v8}, Lvd0;->η(Ljava/util/List;)Ljava/util/ArrayList;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    if-ge v0, v1, :cond_1e

    .line 598
    .line 599
    new-instance v0, Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {p1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    :cond_1e
    sget-object p0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 608
    .line 609
    goto :goto_11

    .line 610
    :goto_10
    new-instance p1, Leo1;

    .line 611
    .line 612
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 613
    .line 614
    .line 615
    move-object p0, p1

    .line 616
    :goto_11
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 617
    .line 618
    .line 619
    move-result-object p0

    .line 620
    if-eqz p0, :cond_1f

    .line 621
    .line 622
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object p0

    .line 626
    const-string p1, "mention callback failed: "

    .line 627
    .line 628
    invoke-static {p1, p0, v3}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    :cond_1f
    :goto_12
    return-void

    .line 632
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    sget-object p0, Ll52;->α:Ll52;

    .line 636
    .line 637
    invoke-static {}, Ll52;->ο()Z

    .line 638
    .line 639
    .line 640
    move-result p0

    .line 641
    if-nez p0, :cond_20

    .line 642
    .line 643
    goto :goto_13

    .line 644
    :cond_20
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 645
    .line 646
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    invoke-static {v7, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    instance-of p1, p0, Ljava/lang/Integer;

    .line 654
    .line 655
    if-eqz p1, :cond_21

    .line 656
    .line 657
    move-object v8, p0

    .line 658
    check-cast v8, Ljava/lang/Integer;

    .line 659
    .line 660
    :cond_21
    if-eqz v8, :cond_22

    .line 661
    .line 662
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 663
    .line 664
    .line 665
    move-result p0

    .line 666
    sget-object p1, Ll52;->μ:Ljava/util/Set;

    .line 667
    .line 668
    invoke-interface {p1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result p1

    .line 672
    if-nez p1, :cond_22

    .line 673
    .line 674
    sput p0, Ll52;->ν:I

    .line 675
    .line 676
    :cond_22
    :goto_13
    return-void

    .line 677
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 681
    .line 682
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    array-length v0, p0

    .line 686
    move v3, v7

    .line 687
    :goto_14
    if-ge v3, v0, :cond_24

    .line 688
    .line 689
    aget-object v4, p0, v3

    .line 690
    .line 691
    sget-object v5, Ll52;->α:Ll52;

    .line 692
    .line 693
    invoke-static {v4}, Ll52;->ν(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    if-eqz v5, :cond_23

    .line 698
    .line 699
    goto :goto_15

    .line 700
    :cond_23
    add-int/lit8 v3, v3, 0x1

    .line 701
    .line 702
    goto :goto_14

    .line 703
    :cond_24
    move-object v4, v8

    .line 704
    :goto_15
    if-eqz v4, :cond_25

    .line 705
    .line 706
    sget-object p0, Ll52;->α:Ll52;

    .line 707
    .line 708
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 709
    .line 710
    invoke-direct {p0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    sput-object p0, Ll52;->ο:Ljava/lang/ref/WeakReference;

    .line 714
    .line 715
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    move-result-object p0

    .line 719
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object p0

    .line 723
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object p0

    .line 727
    const-string v0, "ra3f49bce40b36580"

    .line 728
    .line 729
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    :cond_25
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 733
    .line 734
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    array-length p1, p0

    .line 738
    move v0, v7

    .line 739
    :goto_16
    if-ge v0, p1, :cond_2f

    .line 740
    .line 741
    aget-object v2, p0, v0

    .line 742
    .line 743
    sget-object v3, Ll52;->α:Ll52;

    .line 744
    .line 745
    instance-of v3, v2, Ljava/util/List;

    .line 746
    .line 747
    if-eqz v3, :cond_26

    .line 748
    .line 749
    move-object v3, v2

    .line 750
    check-cast v3, Ljava/util/List;

    .line 751
    .line 752
    goto :goto_17

    .line 753
    :cond_26
    move-object v3, v8

    .line 754
    :goto_17
    if-nez v3, :cond_27

    .line 755
    .line 756
    goto :goto_1a

    .line 757
    :cond_27
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 758
    .line 759
    .line 760
    move-result v4

    .line 761
    if-eqz v4, :cond_28

    .line 762
    .line 763
    goto :goto_1a

    .line 764
    :cond_28
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 765
    .line 766
    .line 767
    move-result v4

    .line 768
    if-eqz v4, :cond_29

    .line 769
    .line 770
    move v4, v7

    .line 771
    goto :goto_19

    .line 772
    :cond_29
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    move v4, v7

    .line 777
    :cond_2a
    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 778
    .line 779
    .line 780
    move-result v5

    .line 781
    if-eqz v5, :cond_2c

    .line 782
    .line 783
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    instance-of v5, v5, Landroid/view/View;

    .line 788
    .line 789
    if-eqz v5, :cond_2a

    .line 790
    .line 791
    add-int/lit8 v4, v4, 0x1

    .line 792
    .line 793
    if-ltz v4, :cond_2b

    .line 794
    .line 795
    goto :goto_18

    .line 796
    :cond_2b
    invoke-static {}, Lyh;->ф()V

    .line 797
    .line 798
    .line 799
    throw v8

    .line 800
    :cond_2c
    :goto_19
    if-lt v4, v1, :cond_2d

    .line 801
    .line 802
    move v3, v6

    .line 803
    goto :goto_1b

    .line 804
    :cond_2d
    :goto_1a
    move v3, v7

    .line 805
    :goto_1b
    if-eqz v3, :cond_2e

    .line 806
    .line 807
    goto :goto_1c

    .line 808
    :cond_2e
    add-int/lit8 v0, v0, 0x1

    .line 809
    .line 810
    goto :goto_16

    .line 811
    :cond_2f
    move-object v2, v8

    .line 812
    :goto_1c
    instance-of p0, v2, Ljava/util/List;

    .line 813
    .line 814
    if-eqz p0, :cond_30

    .line 815
    .line 816
    move-object v8, v2

    .line 817
    check-cast v8, Ljava/util/List;

    .line 818
    .line 819
    :cond_30
    if-eqz v8, :cond_32

    .line 820
    .line 821
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 822
    .line 823
    .line 824
    move-result p0

    .line 825
    if-eqz p0, :cond_31

    .line 826
    .line 827
    goto :goto_1d

    .line 828
    :cond_31
    move v6, v7

    .line 829
    :cond_32
    :goto_1d
    if-nez v6, :cond_33

    .line 830
    .line 831
    sget-object p0, Ll52;->α:Ll52;

    .line 832
    .line 833
    invoke-static {v8}, Ll52;->α(Ljava/util/List;)V

    .line 834
    .line 835
    .line 836
    :cond_33
    return-void

    .line 837
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    sget-object p0, Lm52;->α:Lm52;

    .line 841
    .line 842
    invoke-static {}, Lm52;->ο()Z

    .line 843
    .line 844
    .line 845
    move-result p0

    .line 846
    if-nez p0, :cond_34

    .line 847
    .line 848
    goto :goto_1e

    .line 849
    :cond_34
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 850
    .line 851
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    invoke-static {v7, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object p0

    .line 858
    instance-of p1, p0, Ljava/lang/Integer;

    .line 859
    .line 860
    if-eqz p1, :cond_35

    .line 861
    .line 862
    move-object v8, p0

    .line 863
    check-cast v8, Ljava/lang/Integer;

    .line 864
    .line 865
    :cond_35
    if-eqz v8, :cond_36

    .line 866
    .line 867
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 868
    .line 869
    .line 870
    move-result p0

    .line 871
    sget-object p1, Lm52;->μ:Ljava/util/Set;

    .line 872
    .line 873
    invoke-interface {p1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result p1

    .line 877
    if-nez p1, :cond_36

    .line 878
    .line 879
    sput p0, Lm52;->ν:I

    .line 880
    .line 881
    :cond_36
    :goto_1e
    return-void

    .line 882
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 886
    .line 887
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    array-length v0, p0

    .line 891
    move v3, v7

    .line 892
    :goto_1f
    if-ge v3, v0, :cond_38

    .line 893
    .line 894
    aget-object v4, p0, v3

    .line 895
    .line 896
    sget-object v5, Lm52;->α:Lm52;

    .line 897
    .line 898
    invoke-static {v4}, Lm52;->ν(Ljava/lang/Object;)Z

    .line 899
    .line 900
    .line 901
    move-result v5

    .line 902
    if-eqz v5, :cond_37

    .line 903
    .line 904
    goto :goto_20

    .line 905
    :cond_37
    add-int/lit8 v3, v3, 0x1

    .line 906
    .line 907
    goto :goto_1f

    .line 908
    :cond_38
    move-object v4, v8

    .line 909
    :goto_20
    if-eqz v4, :cond_39

    .line 910
    .line 911
    sget-object p0, Lm52;->α:Lm52;

    .line 912
    .line 913
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 914
    .line 915
    invoke-direct {p0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    sput-object p0, Lm52;->ο:Ljava/lang/ref/WeakReference;

    .line 919
    .line 920
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    move-result-object p0

    .line 924
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object p0

    .line 928
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object p0

    .line 932
    const-string v0, "r14983b95b84acb5"

    .line 933
    .line 934
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 935
    .line 936
    .line 937
    :cond_39
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 938
    .line 939
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    array-length p1, p0

    .line 943
    move v0, v7

    .line 944
    :goto_21
    if-ge v0, p1, :cond_43

    .line 945
    .line 946
    aget-object v2, p0, v0

    .line 947
    .line 948
    sget-object v3, Lm52;->α:Lm52;

    .line 949
    .line 950
    instance-of v3, v2, Ljava/util/List;

    .line 951
    .line 952
    if-eqz v3, :cond_3a

    .line 953
    .line 954
    move-object v3, v2

    .line 955
    check-cast v3, Ljava/util/List;

    .line 956
    .line 957
    goto :goto_22

    .line 958
    :cond_3a
    move-object v3, v8

    .line 959
    :goto_22
    if-nez v3, :cond_3b

    .line 960
    .line 961
    goto :goto_25

    .line 962
    :cond_3b
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 963
    .line 964
    .line 965
    move-result v4

    .line 966
    if-eqz v4, :cond_3c

    .line 967
    .line 968
    goto :goto_25

    .line 969
    :cond_3c
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 970
    .line 971
    .line 972
    move-result v4

    .line 973
    if-eqz v4, :cond_3d

    .line 974
    .line 975
    move v4, v7

    .line 976
    goto :goto_24

    .line 977
    :cond_3d
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    move v4, v7

    .line 982
    :cond_3e
    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 983
    .line 984
    .line 985
    move-result v5

    .line 986
    if-eqz v5, :cond_40

    .line 987
    .line 988
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v5

    .line 992
    instance-of v5, v5, Landroid/view/View;

    .line 993
    .line 994
    if-eqz v5, :cond_3e

    .line 995
    .line 996
    add-int/lit8 v4, v4, 0x1

    .line 997
    .line 998
    if-ltz v4, :cond_3f

    .line 999
    .line 1000
    goto :goto_23

    .line 1001
    :cond_3f
    invoke-static {}, Lyh;->ф()V

    .line 1002
    .line 1003
    .line 1004
    throw v8

    .line 1005
    :cond_40
    :goto_24
    if-lt v4, v1, :cond_41

    .line 1006
    .line 1007
    move v3, v6

    .line 1008
    goto :goto_26

    .line 1009
    :cond_41
    :goto_25
    move v3, v7

    .line 1010
    :goto_26
    if-eqz v3, :cond_42

    .line 1011
    .line 1012
    goto :goto_27

    .line 1013
    :cond_42
    add-int/lit8 v0, v0, 0x1

    .line 1014
    .line 1015
    goto :goto_21

    .line 1016
    :cond_43
    move-object v2, v8

    .line 1017
    :goto_27
    instance-of p0, v2, Ljava/util/List;

    .line 1018
    .line 1019
    if-eqz p0, :cond_44

    .line 1020
    .line 1021
    move-object v8, v2

    .line 1022
    check-cast v8, Ljava/util/List;

    .line 1023
    .line 1024
    :cond_44
    if-eqz v8, :cond_46

    .line 1025
    .line 1026
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 1027
    .line 1028
    .line 1029
    move-result p0

    .line 1030
    if-eqz p0, :cond_45

    .line 1031
    .line 1032
    goto :goto_28

    .line 1033
    :cond_45
    move v6, v7

    .line 1034
    :cond_46
    :goto_28
    if-nez v6, :cond_47

    .line 1035
    .line 1036
    sget-object p0, Lm52;->α:Lm52;

    .line 1037
    .line 1038
    invoke-static {v8}, Lm52;->α(Ljava/util/List;)V

    .line 1039
    .line 1040
    .line 1041
    :cond_47
    return-void

    .line 1042
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    invoke-static {}, Lo22;->ο()Z

    .line 1046
    .line 1047
    .line 1048
    move-result p0

    .line 1049
    if-eqz p0, :cond_48

    .line 1050
    .line 1051
    goto :goto_29

    .line 1052
    :cond_48
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 1053
    .line 1054
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1055
    .line 1056
    .line 1057
    invoke-static {v7, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object p0

    .line 1061
    instance-of p1, p0, Landroid/view/View;

    .line 1062
    .line 1063
    if-eqz p1, :cond_49

    .line 1064
    .line 1065
    move-object v8, p0

    .line 1066
    check-cast v8, Landroid/view/View;

    .line 1067
    .line 1068
    :cond_49
    if-nez v8, :cond_4a

    .line 1069
    .line 1070
    goto :goto_29

    .line 1071
    :cond_4a
    sget-object p0, Lo22;->ι:Ljava/util/Set;

    .line 1072
    .line 1073
    invoke-interface {p0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1074
    .line 1075
    .line 1076
    move-result p0

    .line 1077
    if-nez p0, :cond_4b

    .line 1078
    .line 1079
    goto :goto_29

    .line 1080
    :cond_4b
    invoke-static {v8}, Lo22;->δ(Landroid/view/View;)V

    .line 1081
    .line 1082
    .line 1083
    :goto_29
    return-void

    .line 1084
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    invoke-static {}, Lo22;->ο()Z

    .line 1088
    .line 1089
    .line 1090
    move-result p0

    .line 1091
    if-eqz p0, :cond_4c

    .line 1092
    .line 1093
    goto :goto_2a

    .line 1094
    :cond_4c
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1095
    .line 1096
    instance-of p1, p0, Landroid/view/View;

    .line 1097
    .line 1098
    if-eqz p1, :cond_4d

    .line 1099
    .line 1100
    move-object v8, p0

    .line 1101
    check-cast v8, Landroid/view/View;

    .line 1102
    .line 1103
    :cond_4d
    if-nez v8, :cond_4e

    .line 1104
    .line 1105
    goto :goto_2a

    .line 1106
    :cond_4e
    sget-object p0, Lo22;->ι:Ljava/util/Set;

    .line 1107
    .line 1108
    invoke-interface {p0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result p0

    .line 1112
    if-nez p0, :cond_4f

    .line 1113
    .line 1114
    goto :goto_2a

    .line 1115
    :cond_4f
    invoke-static {v8}, Lo22;->δ(Landroid/view/View;)V

    .line 1116
    .line 1117
    .line 1118
    :goto_2a
    return-void

    .line 1119
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    invoke-static {}, Lo22;->ο()Z

    .line 1123
    .line 1124
    .line 1125
    move-result p0

    .line 1126
    if-eqz p0, :cond_50

    .line 1127
    .line 1128
    goto :goto_2b

    .line 1129
    :cond_50
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1130
    .line 1131
    instance-of p1, p0, Landroid/view/View;

    .line 1132
    .line 1133
    if-eqz p1, :cond_51

    .line 1134
    .line 1135
    move-object v8, p0

    .line 1136
    check-cast v8, Landroid/view/View;

    .line 1137
    .line 1138
    :cond_51
    if-nez v8, :cond_52

    .line 1139
    .line 1140
    goto :goto_2b

    .line 1141
    :cond_52
    sget-object p0, Lo22;->ι:Ljava/util/Set;

    .line 1142
    .line 1143
    invoke-interface {p0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result p0

    .line 1147
    if-nez p0, :cond_53

    .line 1148
    .line 1149
    goto :goto_2b

    .line 1150
    :cond_53
    invoke-static {v8}, Lo22;->δ(Landroid/view/View;)V

    .line 1151
    .line 1152
    .line 1153
    :goto_2b
    return-void

    .line 1154
    :pswitch_f
    sget-object p0, Lo22;->α:Lo22;

    .line 1155
    .line 1156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 1160
    .line 1161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1162
    .line 1163
    .line 1164
    invoke-static {v6, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    instance-of v1, v0, Ljava/lang/String;

    .line 1169
    .line 1170
    if-eqz v1, :cond_54

    .line 1171
    .line 1172
    move-object v8, v0

    .line 1173
    check-cast v8, Ljava/lang/String;

    .line 1174
    .line 1175
    :cond_54
    if-nez v8, :cond_55

    .line 1176
    .line 1177
    goto :goto_2c

    .line 1178
    :cond_55
    invoke-static {v8}, Lo22;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    if-nez v0, :cond_56

    .line 1183
    .line 1184
    goto :goto_2c

    .line 1185
    :cond_56
    iget-object p1, p1, Lk01;->ε:Ljava/lang/Object;

    .line 1186
    .line 1187
    const-string v1, "factory"

    .line 1188
    .line 1189
    invoke-virtual {p0, p1, v0, v1}, Lo22;->Α(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 1190
    .line 1191
    .line 1192
    :goto_2c
    return-void

    .line 1193
    :pswitch_10
    sget-object p0, Lo22;->α:Lo22;

    .line 1194
    .line 1195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 1199
    .line 1200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1201
    .line 1202
    .line 1203
    invoke-static {v6, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    instance-of v1, v0, Ljava/lang/String;

    .line 1208
    .line 1209
    if-eqz v1, :cond_57

    .line 1210
    .line 1211
    move-object v8, v0

    .line 1212
    check-cast v8, Ljava/lang/String;

    .line 1213
    .line 1214
    :cond_57
    if-nez v8, :cond_58

    .line 1215
    .line 1216
    goto :goto_2d

    .line 1217
    :cond_58
    invoke-static {v8}, Lo22;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    if-nez v0, :cond_59

    .line 1222
    .line 1223
    goto :goto_2d

    .line 1224
    :cond_59
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 1225
    .line 1226
    const-string v1, "constructor"

    .line 1227
    .line 1228
    invoke-virtual {p0, p1, v0, v1}, Lo22;->Α(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    :goto_2d
    return-void

    .line 1232
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1233
    .line 1234
    .line 1235
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1236
    .line 1237
    instance-of p1, p0, Landroid/app/Activity;

    .line 1238
    .line 1239
    if-eqz p1, :cond_5a

    .line 1240
    .line 1241
    move-object v8, p0

    .line 1242
    check-cast v8, Landroid/app/Activity;

    .line 1243
    .line 1244
    :cond_5a
    if-nez v8, :cond_5b

    .line 1245
    .line 1246
    goto :goto_2e

    .line 1247
    :cond_5b
    sget-object p0, Lo22;->α:Lo22;

    .line 1248
    .line 1249
    invoke-static {}, Lo22;->ζ()Ljava/util/Set;

    .line 1250
    .line 1251
    .line 1252
    move-result-object p1

    .line 1253
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 1254
    .line 1255
    .line 1256
    move-result p1

    .line 1257
    if-eqz p1, :cond_5c

    .line 1258
    .line 1259
    goto :goto_2e

    .line 1260
    :cond_5c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1261
    .line 1262
    .line 1263
    move-result-wide v0

    .line 1264
    const-wide/16 v2, 0x2710

    .line 1265
    .line 1266
    add-long/2addr v0, v2

    .line 1267
    invoke-virtual {p0}, Lo22;->ξ()V

    .line 1268
    .line 1269
    .line 1270
    sget-object p0, Lo22;->ψ:Landroid/os/Handler;

    .line 1271
    .line 1272
    sget-object p1, Lo22;->φ:Ljava/lang/Object;

    .line 1273
    .line 1274
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1275
    .line 1276
    .line 1277
    new-instance p1, Ln22;

    .line 1278
    .line 1279
    invoke-direct {p1, v0, v1, v8}, Ln22;-><init>(JLandroid/app/Activity;)V

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1283
    .line 1284
    .line 1285
    const-string p0, "r50fc0a33274d5298"

    .line 1286
    .line 1287
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1288
    .line 1289
    .line 1290
    :goto_2e
    return-void

    .line 1291
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1292
    .line 1293
    .line 1294
    :try_start_5
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 1295
    .line 1296
    if-nez p0, :cond_5d

    .line 1297
    .line 1298
    goto :goto_2f

    .line 1299
    :cond_5d
    sget-object v0, Lry1;->α:Lry1;

    .line 1300
    .line 1301
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 1302
    .line 1303
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    invoke-static {p1, p0}, Lry1;->α(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 1307
    .line 1308
    .line 1309
    goto :goto_2f

    .line 1310
    :catchall_4
    move-exception v0

    .line 1311
    move-object p0, v0

    .line 1312
    sget-object p1, Lry1;->α:Lry1;

    .line 1313
    .line 1314
    const-string p1, "processConversationSpark \u5f02\u5e38"

    .line 1315
    .line 1316
    invoke-static {p1, p0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1317
    .line 1318
    .line 1319
    :goto_2f
    return-void

    .line 1320
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1321
    .line 1322
    .line 1323
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1324
    .line 1325
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 1326
    .line 1327
    instance-of v1, p0, Ljava/util/Map;

    .line 1328
    .line 1329
    if-eqz v1, :cond_5e

    .line 1330
    .line 1331
    check-cast p0, Ljava/util/Map;

    .line 1332
    .line 1333
    move-object v1, p0

    .line 1334
    goto :goto_30

    .line 1335
    :cond_5e
    move-object v1, v8

    .line 1336
    :goto_30
    if-nez v1, :cond_5f

    .line 1337
    .line 1338
    goto :goto_33

    .line 1339
    :cond_5f
    const-string p0, "a:consecutive_chat_data"

    .line 1340
    .line 1341
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    instance-of v3, v2, Ljava/lang/String;

    .line 1346
    .line 1347
    if-eqz v3, :cond_60

    .line 1348
    .line 1349
    check-cast v2, Ljava/lang/String;

    .line 1350
    .line 1351
    goto :goto_31

    .line 1352
    :cond_60
    move-object v2, v8

    .line 1353
    :goto_31
    if-nez v2, :cond_61

    .line 1354
    .line 1355
    goto :goto_33

    .line 1356
    :cond_61
    sget-object v3, Lry1;->α:Lry1;

    .line 1357
    .line 1358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1359
    .line 1360
    .line 1361
    const-string v3, "getConversationId"

    .line 1362
    .line 1363
    invoke-static {v0, v3}, Lry1;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v3

    .line 1367
    instance-of v4, v3, Ljava/lang/String;

    .line 1368
    .line 1369
    if-eqz v4, :cond_62

    .line 1370
    .line 1371
    check-cast v3, Ljava/lang/String;

    .line 1372
    .line 1373
    goto :goto_32

    .line 1374
    :cond_62
    move-object v3, v8

    .line 1375
    :goto_32
    if-nez v3, :cond_63

    .line 1376
    .line 1377
    goto :goto_33

    .line 1378
    :cond_63
    sget-object v4, Lry1;->σ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 1379
    .line 1380
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 1381
    .line 1382
    .line 1383
    move-result-wide v4

    .line 1384
    invoke-static {v4, v5, v3}, Lry1;->Ж(JLjava/lang/String;)J

    .line 1385
    .line 1386
    .line 1387
    move-result-wide v4

    .line 1388
    invoke-static/range {v0 .. v5}, Lry1;->ζ(Ljava/lang/Object;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    if-nez v0, :cond_64

    .line 1393
    .line 1394
    goto :goto_33

    .line 1395
    :cond_64
    instance-of v2, v1, Llo0;

    .line 1396
    .line 1397
    if-eqz v2, :cond_65

    .line 1398
    .line 1399
    instance-of v2, v1, Lpo0;

    .line 1400
    .line 1401
    if-eqz v2, :cond_66

    .line 1402
    .line 1403
    :cond_65
    move-object v8, v1

    .line 1404
    :cond_66
    if-nez v8, :cond_67

    .line 1405
    .line 1406
    goto :goto_33

    .line 1407
    :cond_67
    invoke-interface {v8, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {p1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 1411
    .line 1412
    .line 1413
    :goto_33
    return-void

    .line 1414
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1415
    .line 1416
    .line 1417
    sget-object p0, Lry1;->ψ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1418
    .line 1419
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    if-nez v0, :cond_68

    .line 1424
    .line 1425
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 1426
    .line 1427
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 1428
    .line 1429
    .line 1430
    sget-object p0, Lry1;->α:Lry1;

    .line 1431
    .line 1432
    invoke-virtual {p0}, Lry1;->ο()V

    .line 1433
    .line 1434
    .line 1435
    const-string p0, "\u5df2\u6355\u83b7 SendMsgHandler \u5b9e\u4f8b"

    .line 1436
    .line 1437
    invoke-static {p0}, Lry1;->щ(Ljava/lang/String;)V

    .line 1438
    .line 1439
    .line 1440
    :cond_68
    return-void

    .line 1441
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    :array_0
    .array-data 8
        0x0
        0x78
        0x168
        0x320
    .end array-data
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lpy1;->α:I

    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const-wide/16 v7, 0x5dc

    .line 9
    .line 10
    const-string v9, "\u8df3\u8fc7\u9690\u85cf\u9876\u680f\u9875\u5931\u8d25: ViewPager \u4e3a\u7a7a position="

    .line 11
    .line 12
    const-string v10, ")"

    .line 13
    .line 14
    const/high16 v11, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const-string v12, "rfe847aaa60ab2d90"

    .line 17
    .line 18
    const/4 v13, -0x1

    .line 19
    const/4 v14, 0x4

    .line 20
    const/4 v15, 0x0

    .line 21
    const/16 v16, 0x0

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const-wide/16 v17, 0xfa

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    sget-object v2, Lya2;->ζ:Lya2;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lib2;->τ()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_0
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_1
    invoke-static {v0}, Lib2;->Β(Ljava/lang/Object;)Lab2;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_2
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 69
    .line 70
    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    new-instance v6, Lw6;

    .line 78
    .line 79
    invoke-direct {v6}, Lw6;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    new-instance v8, Ll91;

    .line 87
    .line 88
    invoke-direct {v8, v0, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v8}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_3
    invoke-virtual {v6}, Lw6;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_9

    .line 102
    .line 103
    invoke-virtual {v6}, Lw6;->removeFirst()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ll91;

    .line 108
    .line 109
    iget-object v7, v0, Ll91;->ε:Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    const/4 v0, 0x2

    .line 120
    if-ge v8, v0, :cond_3

    .line 121
    .line 122
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lib2;->δ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    :cond_4
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Ljava/lang/reflect/Field;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-nez v10, :cond_4

    .line 155
    .line 156
    :try_start_0
    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    goto :goto_1

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    new-instance v10, Leo1;

    .line 163
    .line 164
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    move-object v0, v10

    .line 168
    :goto_1
    instance-of v10, v0, Leo1;

    .line 169
    .line 170
    if-eqz v10, :cond_5

    .line 171
    .line 172
    move-object v0, v15

    .line 173
    :cond_5
    if-nez v0, :cond_6

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_6
    sget-object v10, Lib2;->α:Lib2;

    .line 177
    .line 178
    instance-of v10, v0, Ljava/lang/String;

    .line 179
    .line 180
    if-nez v10, :cond_4

    .line 181
    .line 182
    instance-of v10, v0, Ljava/lang/Number;

    .line 183
    .line 184
    if-nez v10, :cond_4

    .line 185
    .line 186
    instance-of v10, v0, Ljava/lang/Boolean;

    .line 187
    .line 188
    if-nez v10, :cond_4

    .line 189
    .line 190
    instance-of v10, v0, Ljava/lang/CharSequence;

    .line 191
    .line 192
    if-nez v10, :cond_4

    .line 193
    .line 194
    instance-of v10, v0, Ljava/lang/Class;

    .line 195
    .line 196
    if-nez v10, :cond_4

    .line 197
    .line 198
    instance-of v10, v0, Landroid/content/Context;

    .line 199
    .line 200
    if-nez v10, :cond_4

    .line 201
    .line 202
    instance-of v10, v0, Landroid/view/View;

    .line 203
    .line 204
    if-nez v10, :cond_4

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-virtual {v10}, Ljava/lang/Class;->isEnum()Z

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-nez v10, :cond_4

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-nez v10, :cond_4

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    const-string v11, "java."

    .line 235
    .line 236
    invoke-static {v10, v11, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-nez v10, :cond_4

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    const-string v11, "android."

    .line 251
    .line 252
    invoke-static {v10, v11, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    if-eqz v10, :cond_7

    .line 257
    .line 258
    goto :goto_0

    .line 259
    :cond_7
    invoke-static {v0}, Lib2;->Β(Ljava/lang/Object;)Lab2;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    if-eqz v10, :cond_8

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_8
    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-eqz v10, :cond_4

    .line 271
    .line 272
    add-int/lit8 v10, v8, 0x1

    .line 273
    .line 274
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    new-instance v11, Ll91;

    .line 279
    .line 280
    invoke-direct {v11, v0, v10}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6, v11}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_9
    move-object v0, v15

    .line 289
    :goto_2
    if-nez v0, :cond_a

    .line 290
    .line 291
    goto/16 :goto_6

    .line 292
    .line 293
    :cond_a
    invoke-static {v0}, Lib2;->Β(Ljava/lang/Object;)Lab2;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    if-nez v4, :cond_b

    .line 298
    .line 299
    goto/16 :goto_6

    .line 300
    .line 301
    :cond_b
    iget-object v6, v4, Lab2;->ε:Ljava/io/File;

    .line 302
    .line 303
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    const/16 v7, 0x5c

    .line 311
    .line 312
    const/16 v8, 0x2f

    .line 313
    .line 314
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    iget-object v4, v4, Lab2;->α:Ljava/lang/Object;

    .line 322
    .line 323
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    const-string v7, "/comment/"

    .line 332
    .line 333
    invoke-static {v6, v7, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-nez v7, :cond_e

    .line 338
    .line 339
    const-string v7, "comment"

    .line 340
    .line 341
    invoke-static {v6, v7, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-nez v8, :cond_e

    .line 346
    .line 347
    invoke-static {v4, v7, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    if-eqz v7, :cond_c

    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_c
    const-string v7, "/im/"

    .line 355
    .line 356
    invoke-static {v6, v7, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    if-nez v7, :cond_d

    .line 361
    .line 362
    const-string v7, "im_"

    .line 363
    .line 364
    invoke-static {v6, v7, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    if-nez v7, :cond_d

    .line 369
    .line 370
    const-string v7, "/audio"

    .line 371
    .line 372
    invoke-static {v6, v7, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    if-nez v6, :cond_d

    .line 377
    .line 378
    const-string v6, "~79E5B19C89B3C3BDFA87D5FC28F4667EC8FACC5D1EBC6A59BA9DEDCE"

    .line 379
    .line 380
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    invoke-static {v4, v6, v5}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-nez v5, :cond_d

    .line 389
    .line 390
    const-string v5, "audio"

    .line 391
    .line 392
    invoke-static {v4, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-eqz v3, :cond_f

    .line 397
    .line 398
    :cond_d
    sget-object v15, Lya2;->η:Lya2;

    .line 399
    .line 400
    goto :goto_4

    .line 401
    :cond_e
    :goto_3
    move-object v15, v2

    .line 402
    :cond_f
    :goto_4
    if-nez v15, :cond_10

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_10
    if-ne v15, v2, :cond_11

    .line 406
    .line 407
    const-string v2, "comment-runnable"

    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_11
    const-string v2, "im-runnable"

    .line 411
    .line 412
    :goto_5
    invoke-static {v1, v15, v0, v2}, Lib2;->λ(Lk01;Lya2;Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    :goto_6
    return-void

    .line 416
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    iget-object v0, v1, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 420
    .line 421
    instance-of v2, v0, Ljava/lang/reflect/Method;

    .line 422
    .line 423
    if-eqz v2, :cond_12

    .line 424
    .line 425
    check-cast v0, Ljava/lang/reflect/Method;

    .line 426
    .line 427
    goto :goto_7

    .line 428
    :cond_12
    move-object v0, v15

    .line 429
    :goto_7
    if-eqz v0, :cond_13

    .line 430
    .line 431
    sget-object v2, Ll82;->α:Ll82;

    .line 432
    .line 433
    iget-object v2, v1, Lk01;->β:Ljava/lang/Object;

    .line 434
    .line 435
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-static {v0, v2}, Ll82;->β(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :cond_13
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 442
    .line 443
    aget-object v0, v0, v5

    .line 444
    .line 445
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    check-cast v0, Ljava/lang/Float;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    new-instance v1, Ljava/lang/StringBuilder;

    .line 455
    .line 456
    const-string v2, "\u25b6 SimPlayer.setSpeed("

    .line 457
    .line 458
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-static {v12, v0, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget-object v0, v1, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 479
    .line 480
    instance-of v2, v0, Ljava/lang/reflect/Method;

    .line 481
    .line 482
    if-eqz v2, :cond_14

    .line 483
    .line 484
    check-cast v0, Ljava/lang/reflect/Method;

    .line 485
    .line 486
    goto :goto_8

    .line 487
    :cond_14
    move-object v0, v15

    .line 488
    :goto_8
    if-eqz v0, :cond_15

    .line 489
    .line 490
    sget-object v2, Ll82;->α:Ll82;

    .line 491
    .line 492
    iget-object v2, v1, Lk01;->β:Ljava/lang/Object;

    .line 493
    .line 494
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-static {v0, v2}, Ll82;->β(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    :cond_15
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 501
    .line 502
    aget-object v0, v0, v5

    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    check-cast v0, Ljava/lang/Float;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    new-instance v1, Ljava/lang/StringBuilder;

    .line 514
    .line 515
    const-string v2, "\u25b6 FeedPlayerWrapper.setSpeed("

    .line 516
    .line 517
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-static {v12, v0, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    instance-of v2, v1, Ljava/lang/Float;

    .line 547
    .line 548
    if-eqz v2, :cond_17

    .line 549
    .line 550
    check-cast v1, Ljava/lang/Number;

    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    const v3, 0x3dcccccd    # 0.1f

    .line 557
    .line 558
    .line 559
    cmpg-float v2, v2, v3

    .line 560
    .line 561
    const/high16 v4, 0x41200000    # 10.0f

    .line 562
    .line 563
    if-ltz v2, :cond_16

    .line 564
    .line 565
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    cmpl-float v2, v2, v4

    .line 570
    .line 571
    if-lez v2, :cond_17

    .line 572
    .line 573
    :cond_16
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    invoke-static {v1, v3, v4}, Lj81;->λ(FFF)F

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    aput-object v1, v0, v5

    .line 586
    .line 587
    :cond_17
    return-void

    .line 588
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-static {}, Ln82;->α()Z

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    if-eqz v0, :cond_18

    .line 596
    .line 597
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 598
    .line 599
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    :cond_18
    return-void

    .line 603
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    invoke-static {}, Ln82;->α()Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_19

    .line 611
    .line 612
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    :cond_19
    return-void

    .line 620
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 624
    .line 625
    invoke-virtual {v1, v0}, Lk01;->α(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_8
    const-string v2, ": "

    .line 630
    .line 631
    const-string v4, "Native extended speed enabled for "

    .line 632
    .line 633
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    if-nez v0, :cond_1a

    .line 646
    .line 647
    goto/16 :goto_c

    .line 648
    .line 649
    :cond_1a
    :try_start_1
    const-string v6, "getSpeed"

    .line 650
    .line 651
    new-array v5, v5, [Ljava/lang/Object;

    .line 652
    .line 653
    invoke-static {v0, v6, v5}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    instance-of v5, v0, Ljava/lang/Number;

    .line 658
    .line 659
    if-eqz v5, :cond_1b

    .line 660
    .line 661
    check-cast v0, Ljava/lang/Number;

    .line 662
    .line 663
    goto :goto_9

    .line 664
    :catchall_1
    move-exception v0

    .line 665
    goto :goto_a

    .line 666
    :cond_1b
    move-object v0, v15

    .line 667
    :goto_9
    if-eqz v0, :cond_1c

    .line 668
    .line 669
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 674
    .line 675
    .line 676
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 677
    goto :goto_b

    .line 678
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    const-string v6, "Read PlaybackParams speed ERR: "

    .line 691
    .line 692
    invoke-static {v6, v5, v2, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-static {v12, v0, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    :cond_1c
    move-object v0, v15

    .line 700
    :goto_b
    if-eqz v0, :cond_1e

    .line 701
    .line 702
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 707
    .line 708
    .line 709
    move-result v5

    .line 710
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 711
    .line 712
    .line 713
    cmpg-float v5, v5, v6

    .line 714
    .line 715
    if-gtz v5, :cond_1e

    .line 716
    .line 717
    const/high16 v5, 0x40400000    # 3.0f

    .line 718
    .line 719
    cmpg-float v5, v0, v5

    .line 720
    .line 721
    if-gtz v5, :cond_1d

    .line 722
    .line 723
    goto :goto_c

    .line 724
    :cond_1d
    :try_start_2
    sget-object v5, Lqe0;->α:Ljava/lang/Object;

    .line 725
    .line 726
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 727
    .line 728
    const-string v5, "setIntOption"

    .line 729
    .line 730
    const/16 v6, 0x102

    .line 731
    .line 732
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 737
    .line 738
    .line 739
    move-result-object v3

    .line 740
    filled-new-array {v6, v3}, [Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    invoke-static {v1, v5, v3}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    new-instance v1, Ljava/lang/StringBuilder;

    .line 748
    .line 749
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    const-string v0, "x"

    .line 756
    .line 757
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-static {v12, v0, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 765
    .line 766
    .line 767
    goto :goto_c

    .line 768
    :catchall_2
    move-exception v0

    .line 769
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    const-string v3, "Enable native extended speed ERR: "

    .line 782
    .line 783
    invoke-static {v3, v1, v2, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-static {v12, v0, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 788
    .line 789
    .line 790
    :cond_1e
    :goto_c
    return-void

    .line 791
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 792
    .line 793
    .line 794
    sget-object v0, Ll82;->γ:Ljava/lang/ThreadLocal;

    .line 795
    .line 796
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 801
    .line 802
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    move-result v0

    .line 806
    if-nez v0, :cond_28

    .line 807
    .line 808
    sget-wide v6, Ll82;->ι:J

    .line 809
    .line 810
    sget-object v0, Ll82;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 811
    .line 812
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 813
    .line 814
    .line 815
    move-result-wide v8

    .line 816
    cmp-long v0, v6, v8

    .line 817
    .line 818
    if-nez v0, :cond_1f

    .line 819
    .line 820
    goto/16 :goto_12

    .line 821
    .line 822
    :cond_1f
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 823
    .line 824
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    invoke-static {v0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    if-nez v2, :cond_20

    .line 832
    .line 833
    goto/16 :goto_12

    .line 834
    .line 835
    :cond_20
    const-string v0, "LIZIZ"

    .line 836
    .line 837
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    move-result-object v4

    .line 841
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getFloat(Ljava/lang/Object;)F

    .line 849
    .line 850
    .line 851
    move-result v0

    .line 852
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 853
    .line 854
    .line 855
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 856
    goto :goto_d

    .line 857
    :catchall_3
    move-exception v0

    .line 858
    new-instance v4, Leo1;

    .line 859
    .line 860
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 861
    .line 862
    .line 863
    move-object v0, v4

    .line 864
    :goto_d
    instance-of v4, v0, Leo1;

    .line 865
    .line 866
    if-eqz v4, :cond_21

    .line 867
    .line 868
    move-object v0, v15

    .line 869
    :cond_21
    check-cast v0, Ljava/lang/Float;

    .line 870
    .line 871
    if-eqz v0, :cond_28

    .line 872
    .line 873
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    cmpg-float v0, v0, v11

    .line 878
    .line 879
    if-nez v0, :cond_28

    .line 880
    .line 881
    const-string v0, "LIZ"

    .line 882
    .line 883
    invoke-static {v2, v0}, Ll82;->ζ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v4

    .line 887
    if-nez v4, :cond_22

    .line 888
    .line 889
    goto :goto_12

    .line 890
    :cond_22
    const-string v6, "default"

    .line 891
    .line 892
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v4

    .line 896
    if-nez v4, :cond_23

    .line 897
    .line 898
    goto :goto_12

    .line 899
    :cond_23
    invoke-static {}, Ll82;->ε()Ljava/lang/Float;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    if-eqz v4, :cond_28

    .line 904
    .line 905
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 906
    .line 907
    .line 908
    move-result v6

    .line 909
    cmpg-float v6, v6, v11

    .line 910
    .line 911
    if-nez v6, :cond_24

    .line 912
    .line 913
    goto :goto_12

    .line 914
    :cond_24
    const-class v6, Ljava/lang/String;

    .line 915
    .line 916
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    move-result-object v7

    .line 920
    invoke-static {v2, v0}, Ll82;->ζ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    if-nez v0, :cond_25

    .line 925
    .line 926
    move-object v0, v15

    .line 927
    goto :goto_10

    .line 928
    :cond_25
    const-string v8, "LIZJ"

    .line 929
    .line 930
    invoke-static {v2, v8}, Ll82;->ζ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    if-nez v2, :cond_26

    .line 935
    .line 936
    const-string v2, ""

    .line 937
    .line 938
    goto :goto_e

    .line 939
    :catchall_4
    move-exception v0

    .line 940
    goto :goto_f

    .line 941
    :cond_26
    :goto_e
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 942
    .line 943
    filled-new-array {v8, v6, v6}, [Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    move-result-object v6

    .line 947
    invoke-virtual {v7, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 948
    .line 949
    .line 950
    move-result-object v6

    .line 951
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 952
    .line 953
    .line 954
    filled-new-array {v4, v0, v2}, [Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-virtual {v6, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 962
    goto :goto_10

    .line 963
    :goto_f
    new-instance v2, Leo1;

    .line 964
    .line 965
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 966
    .line 967
    .line 968
    move-object v0, v2

    .line 969
    :goto_10
    instance-of v2, v0, Leo1;

    .line 970
    .line 971
    if-eqz v2, :cond_27

    .line 972
    .line 973
    goto :goto_11

    .line 974
    :cond_27
    move-object v15, v0

    .line 975
    :goto_11
    if-eqz v15, :cond_28

    .line 976
    .line 977
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 978
    .line 979
    aput-object v15, v0, v5

    .line 980
    .line 981
    :cond_28
    :goto_12
    return-void

    .line 982
    :pswitch_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    sget-object v0, Ll52;->α:Ll52;

    .line 986
    .line 987
    invoke-static {}, Ll52;->ο()Z

    .line 988
    .line 989
    .line 990
    move-result v0

    .line 991
    if-nez v0, :cond_29

    .line 992
    .line 993
    goto/16 :goto_1a

    .line 994
    .line 995
    :cond_29
    invoke-static {}, Lx9;->ι()Z

    .line 996
    .line 997
    .line 998
    move-result v0

    .line 999
    if-nez v0, :cond_2a

    .line 1000
    .line 1001
    goto/16 :goto_1a

    .line 1002
    .line 1003
    :cond_2a
    invoke-static {}, Ll52;->δ()V

    .line 1004
    .line 1005
    .line 1006
    invoke-static {}, Ll52;->σ()V

    .line 1007
    .line 1008
    .line 1009
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v10

    .line 1013
    sget-wide v19, Ll52;->τ:J

    .line 1014
    .line 1015
    cmp-long v0, v10, v19

    .line 1016
    .line 1017
    if-gez v0, :cond_2b

    .line 1018
    .line 1019
    goto/16 :goto_1a

    .line 1020
    .line 1021
    :cond_2b
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1022
    .line 1023
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    instance-of v2, v0, Ljava/lang/Integer;

    .line 1031
    .line 1032
    if-eqz v2, :cond_2c

    .line 1033
    .line 1034
    check-cast v0, Ljava/lang/Integer;

    .line 1035
    .line 1036
    goto :goto_13

    .line 1037
    :cond_2c
    move-object v0, v15

    .line 1038
    :goto_13
    if-eqz v0, :cond_3b

    .line 1039
    .line 1040
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1041
    .line 1042
    .line 1043
    move-result v2

    .line 1044
    sget-object v4, Ll52;->μ:Ljava/util/Set;

    .line 1045
    .line 1046
    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    if-nez v0, :cond_2d

    .line 1051
    .line 1052
    goto/16 :goto_1a

    .line 1053
    .line 1054
    :cond_2d
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1055
    .line 1056
    invoke-static {v0}, Ll52;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    if-nez v0, :cond_2e

    .line 1061
    .line 1062
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1063
    .line 1064
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    const-string v1, "ra3f49bce40b36580"

    .line 1075
    .line 1076
    invoke-static {v1, v0, v15}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1077
    .line 1078
    .line 1079
    goto/16 :goto_1a

    .line 1080
    .line 1081
    :cond_2e
    sget-object v4, Ll52;->λ:Ljava/lang/Object;

    .line 1082
    .line 1083
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1084
    .line 1085
    .line 1086
    move-result v4

    .line 1087
    if-gtz v4, :cond_30

    .line 1088
    .line 1089
    :cond_2f
    move-object v4, v15

    .line 1090
    goto/16 :goto_19

    .line 1091
    .line 1092
    :cond_30
    sget-object v5, Ll52;->μ:Ljava/util/Set;

    .line 1093
    .line 1094
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1095
    .line 1096
    .line 1097
    move-result-wide v19

    .line 1098
    sget v6, Ll52;->ρ:I

    .line 1099
    .line 1100
    if-eqz v6, :cond_31

    .line 1101
    .line 1102
    sget-wide v21, Ll52;->σ:J

    .line 1103
    .line 1104
    sub-long v19, v19, v21

    .line 1105
    .line 1106
    cmp-long v6, v19, v7

    .line 1107
    .line 1108
    if-gtz v6, :cond_31

    .line 1109
    .line 1110
    sget v13, Ll52;->ρ:I

    .line 1111
    .line 1112
    goto :goto_15

    .line 1113
    :cond_31
    sget v6, Ll52;->ν:I

    .line 1114
    .line 1115
    if-gez v6, :cond_33

    .line 1116
    .line 1117
    :cond_32
    :goto_14
    move v13, v3

    .line 1118
    goto :goto_15

    .line 1119
    :cond_33
    sget v6, Ll52;->ν:I

    .line 1120
    .line 1121
    if-le v2, v6, :cond_34

    .line 1122
    .line 1123
    goto :goto_14

    .line 1124
    :cond_34
    sget v6, Ll52;->ν:I

    .line 1125
    .line 1126
    if-ge v2, v6, :cond_32

    .line 1127
    .line 1128
    :goto_15
    add-int v6, v2, v13

    .line 1129
    .line 1130
    :goto_16
    if-ltz v6, :cond_36

    .line 1131
    .line 1132
    if-ge v6, v4, :cond_36

    .line 1133
    .line 1134
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v7

    .line 1138
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v7

    .line 1142
    if-nez v7, :cond_35

    .line 1143
    .line 1144
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v6

    .line 1148
    goto :goto_17

    .line 1149
    :cond_35
    add-int/2addr v6, v13

    .line 1150
    goto :goto_16

    .line 1151
    :cond_36
    move-object v6, v15

    .line 1152
    :goto_17
    if-eqz v6, :cond_37

    .line 1153
    .line 1154
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 1155
    .line 1156
    .line 1157
    move-result v4

    .line 1158
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v4

    .line 1162
    goto :goto_19

    .line 1163
    :cond_37
    sub-int v6, v2, v13

    .line 1164
    .line 1165
    neg-int v7, v13

    .line 1166
    :goto_18
    if-ltz v6, :cond_2f

    .line 1167
    .line 1168
    if-ge v6, v4, :cond_2f

    .line 1169
    .line 1170
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v8

    .line 1174
    invoke-interface {v5, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v8

    .line 1178
    if-nez v8, :cond_38

    .line 1179
    .line 1180
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v4

    .line 1184
    goto :goto_19

    .line 1185
    :cond_38
    add-int/2addr v6, v7

    .line 1186
    goto :goto_18

    .line 1187
    :goto_19
    if-eqz v4, :cond_3b

    .line 1188
    .line 1189
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1190
    .line 1191
    .line 1192
    move-result v4

    .line 1193
    invoke-static {v0}, Ll52;->κ(Ljava/lang/Object;)I

    .line 1194
    .line 1195
    .line 1196
    move-result v5

    .line 1197
    if-ltz v4, :cond_3b

    .line 1198
    .line 1199
    if-ge v4, v5, :cond_3b

    .line 1200
    .line 1201
    invoke-virtual {v1, v15}, Lk01;->α(Ljava/lang/Object;)V

    .line 1202
    .line 1203
    .line 1204
    sput v4, Ll52;->ν:I

    .line 1205
    .line 1206
    add-long v10, v10, v17

    .line 1207
    .line 1208
    sput-wide v10, Ll52;->τ:J

    .line 1209
    .line 1210
    instance-of v1, v0, Landroid/view/View;

    .line 1211
    .line 1212
    if-eqz v1, :cond_39

    .line 1213
    .line 1214
    move-object v15, v0

    .line 1215
    check-cast v15, Landroid/view/View;

    .line 1216
    .line 1217
    :cond_39
    new-instance v1, Lh52;

    .line 1218
    .line 1219
    invoke-direct {v1, v0, v4, v2, v3}, Lh52;-><init>(Ljava/lang/Object;III)V

    .line 1220
    .line 1221
    .line 1222
    if-eqz v15, :cond_3a

    .line 1223
    .line 1224
    new-instance v0, Lν;

    .line 1225
    .line 1226
    const/16 v2, 0x1c

    .line 1227
    .line 1228
    invoke-direct {v0, v2, v1}, Lν;-><init>(ILjava/lang/Object;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v15, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1232
    .line 1233
    .line 1234
    goto :goto_1a

    .line 1235
    :cond_3a
    invoke-virtual {v1}, Lh52;->invoke()Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    :cond_3b
    :goto_1a
    return-void

    .line 1239
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1240
    .line 1241
    .line 1242
    sget-object v0, Ll52;->α:Ll52;

    .line 1243
    .line 1244
    invoke-static {}, Ll52;->ο()Z

    .line 1245
    .line 1246
    .line 1247
    move-result v0

    .line 1248
    if-nez v0, :cond_3c

    .line 1249
    .line 1250
    goto/16 :goto_1d

    .line 1251
    .line 1252
    :cond_3c
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1253
    .line 1254
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1255
    .line 1256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1257
    .line 1258
    .line 1259
    array-length v2, v1

    .line 1260
    if-lt v2, v4, :cond_3d

    .line 1261
    .line 1262
    aget-object v2, v1, v5

    .line 1263
    .line 1264
    instance-of v4, v2, Ljava/lang/Integer;

    .line 1265
    .line 1266
    if-eqz v4, :cond_3d

    .line 1267
    .line 1268
    aget-object v4, v1, v3

    .line 1269
    .line 1270
    instance-of v4, v4, Ljava/lang/Float;

    .line 1271
    .line 1272
    if-eqz v4, :cond_3d

    .line 1273
    .line 1274
    check-cast v2, Ljava/lang/Integer;

    .line 1275
    .line 1276
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1277
    .line 1278
    .line 1279
    move-result v2

    .line 1280
    aget-object v1, v1, v3

    .line 1281
    .line 1282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1283
    .line 1284
    .line 1285
    check-cast v1, Ljava/lang/Float;

    .line 1286
    .line 1287
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1288
    .line 1289
    .line 1290
    move-result v1

    .line 1291
    goto :goto_1b

    .line 1292
    :cond_3d
    array-length v2, v1

    .line 1293
    if-lt v2, v14, :cond_43

    .line 1294
    .line 1295
    aget-object v2, v1, v5

    .line 1296
    .line 1297
    instance-of v4, v2, Ljava/lang/Float;

    .line 1298
    .line 1299
    if-eqz v4, :cond_43

    .line 1300
    .line 1301
    aget-object v4, v1, v3

    .line 1302
    .line 1303
    instance-of v4, v4, Ljava/lang/Integer;

    .line 1304
    .line 1305
    if-eqz v4, :cond_43

    .line 1306
    .line 1307
    check-cast v2, Ljava/lang/Float;

    .line 1308
    .line 1309
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 1310
    .line 1311
    .line 1312
    move-result v2

    .line 1313
    aget-object v1, v1, v3

    .line 1314
    .line 1315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1316
    .line 1317
    .line 1318
    check-cast v1, Ljava/lang/Integer;

    .line 1319
    .line 1320
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1321
    .line 1322
    .line 1323
    move-result v1

    .line 1324
    move/from16 v23, v2

    .line 1325
    .line 1326
    move v2, v1

    .line 1327
    move/from16 v1, v23

    .line 1328
    .line 1329
    :goto_1b
    cmpg-float v4, v1, v16

    .line 1330
    .line 1331
    if-lez v4, :cond_43

    .line 1332
    .line 1333
    cmpl-float v1, v1, v11

    .line 1334
    .line 1335
    if-ltz v1, :cond_3e

    .line 1336
    .line 1337
    goto :goto_1d

    .line 1338
    :cond_3e
    invoke-static {v0}, Ll52;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0

    .line 1342
    if-nez v0, :cond_3f

    .line 1343
    .line 1344
    goto :goto_1d

    .line 1345
    :cond_3f
    invoke-static {v0}, Ll52;->λ(Ljava/lang/Object;)I

    .line 1346
    .line 1347
    .line 1348
    move-result v0

    .line 1349
    if-ne v0, v2, :cond_40

    .line 1350
    .line 1351
    move v13, v3

    .line 1352
    goto :goto_1c

    .line 1353
    :cond_40
    if-le v0, v2, :cond_41

    .line 1354
    .line 1355
    goto :goto_1c

    .line 1356
    :cond_41
    move v13, v5

    .line 1357
    :goto_1c
    if-nez v13, :cond_42

    .line 1358
    .line 1359
    goto :goto_1d

    .line 1360
    :cond_42
    sput v13, Ll52;->ρ:I

    .line 1361
    .line 1362
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1363
    .line 1364
    .line 1365
    move-result-wide v0

    .line 1366
    sput-wide v0, Ll52;->σ:J

    .line 1367
    .line 1368
    :cond_43
    :goto_1d
    return-void

    .line 1369
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1370
    .line 1371
    .line 1372
    sget-object v0, Lm52;->α:Lm52;

    .line 1373
    .line 1374
    invoke-static {}, Lm52;->ο()Z

    .line 1375
    .line 1376
    .line 1377
    move-result v0

    .line 1378
    if-nez v0, :cond_44

    .line 1379
    .line 1380
    goto/16 :goto_25

    .line 1381
    .line 1382
    :cond_44
    invoke-static {}, Lx9;->ι()Z

    .line 1383
    .line 1384
    .line 1385
    move-result v0

    .line 1386
    if-nez v0, :cond_45

    .line 1387
    .line 1388
    goto/16 :goto_25

    .line 1389
    .line 1390
    :cond_45
    invoke-static {}, Lm52;->δ()V

    .line 1391
    .line 1392
    .line 1393
    invoke-static {}, Lm52;->σ()V

    .line 1394
    .line 1395
    .line 1396
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1397
    .line 1398
    .line 1399
    move-result-wide v10

    .line 1400
    sget-wide v19, Lm52;->τ:J

    .line 1401
    .line 1402
    cmp-long v0, v10, v19

    .line 1403
    .line 1404
    if-gez v0, :cond_46

    .line 1405
    .line 1406
    goto/16 :goto_25

    .line 1407
    .line 1408
    :cond_46
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1409
    .line 1410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1411
    .line 1412
    .line 1413
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v0

    .line 1417
    instance-of v2, v0, Ljava/lang/Integer;

    .line 1418
    .line 1419
    if-eqz v2, :cond_47

    .line 1420
    .line 1421
    check-cast v0, Ljava/lang/Integer;

    .line 1422
    .line 1423
    goto :goto_1e

    .line 1424
    :cond_47
    move-object v0, v15

    .line 1425
    :goto_1e
    if-eqz v0, :cond_56

    .line 1426
    .line 1427
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1428
    .line 1429
    .line 1430
    move-result v2

    .line 1431
    sget-object v4, Lm52;->μ:Ljava/util/Set;

    .line 1432
    .line 1433
    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1434
    .line 1435
    .line 1436
    move-result v0

    .line 1437
    if-nez v0, :cond_48

    .line 1438
    .line 1439
    goto/16 :goto_25

    .line 1440
    .line 1441
    :cond_48
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1442
    .line 1443
    invoke-static {v0}, Lm52;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v0

    .line 1447
    if-nez v0, :cond_49

    .line 1448
    .line 1449
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1450
    .line 1451
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    const-string v1, "r14983b95b84acb5"

    .line 1462
    .line 1463
    invoke-static {v1, v0, v15}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1464
    .line 1465
    .line 1466
    goto/16 :goto_25

    .line 1467
    .line 1468
    :cond_49
    sget-object v4, Lm52;->λ:Ljava/lang/Object;

    .line 1469
    .line 1470
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1471
    .line 1472
    .line 1473
    move-result v4

    .line 1474
    if-gtz v4, :cond_4b

    .line 1475
    .line 1476
    :cond_4a
    move-object v3, v15

    .line 1477
    goto/16 :goto_24

    .line 1478
    .line 1479
    :cond_4b
    sget-object v6, Lm52;->μ:Ljava/util/Set;

    .line 1480
    .line 1481
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1482
    .line 1483
    .line 1484
    move-result-wide v19

    .line 1485
    sget v9, Lm52;->ρ:I

    .line 1486
    .line 1487
    if-eqz v9, :cond_4c

    .line 1488
    .line 1489
    sget-wide v21, Lm52;->σ:J

    .line 1490
    .line 1491
    sub-long v19, v19, v21

    .line 1492
    .line 1493
    cmp-long v7, v19, v7

    .line 1494
    .line 1495
    if-gtz v7, :cond_4c

    .line 1496
    .line 1497
    sget v13, Lm52;->ρ:I

    .line 1498
    .line 1499
    goto :goto_20

    .line 1500
    :cond_4c
    sget v7, Lm52;->ν:I

    .line 1501
    .line 1502
    if-gez v7, :cond_4e

    .line 1503
    .line 1504
    :cond_4d
    :goto_1f
    move v13, v3

    .line 1505
    goto :goto_20

    .line 1506
    :cond_4e
    sget v7, Lm52;->ν:I

    .line 1507
    .line 1508
    if-le v2, v7, :cond_4f

    .line 1509
    .line 1510
    goto :goto_1f

    .line 1511
    :cond_4f
    sget v7, Lm52;->ν:I

    .line 1512
    .line 1513
    if-ge v2, v7, :cond_4d

    .line 1514
    .line 1515
    :goto_20
    add-int v3, v2, v13

    .line 1516
    .line 1517
    :goto_21
    if-ltz v3, :cond_51

    .line 1518
    .line 1519
    if-ge v3, v4, :cond_51

    .line 1520
    .line 1521
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v7

    .line 1525
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v7

    .line 1529
    if-nez v7, :cond_50

    .line 1530
    .line 1531
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v3

    .line 1535
    goto :goto_22

    .line 1536
    :cond_50
    add-int/2addr v3, v13

    .line 1537
    goto :goto_21

    .line 1538
    :cond_51
    move-object v3, v15

    .line 1539
    :goto_22
    if-eqz v3, :cond_52

    .line 1540
    .line 1541
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1542
    .line 1543
    .line 1544
    move-result v3

    .line 1545
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v3

    .line 1549
    goto :goto_24

    .line 1550
    :cond_52
    sub-int v3, v2, v13

    .line 1551
    .line 1552
    neg-int v7, v13

    .line 1553
    :goto_23
    if-ltz v3, :cond_4a

    .line 1554
    .line 1555
    if-ge v3, v4, :cond_4a

    .line 1556
    .line 1557
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v8

    .line 1561
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1562
    .line 1563
    .line 1564
    move-result v8

    .line 1565
    if-nez v8, :cond_53

    .line 1566
    .line 1567
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v3

    .line 1571
    goto :goto_24

    .line 1572
    :cond_53
    add-int/2addr v3, v7

    .line 1573
    goto :goto_23

    .line 1574
    :goto_24
    if-eqz v3, :cond_56

    .line 1575
    .line 1576
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1577
    .line 1578
    .line 1579
    move-result v3

    .line 1580
    invoke-static {v0}, Lm52;->κ(Ljava/lang/Object;)I

    .line 1581
    .line 1582
    .line 1583
    move-result v4

    .line 1584
    if-ltz v3, :cond_56

    .line 1585
    .line 1586
    if-ge v3, v4, :cond_56

    .line 1587
    .line 1588
    invoke-virtual {v1, v15}, Lk01;->α(Ljava/lang/Object;)V

    .line 1589
    .line 1590
    .line 1591
    sput v3, Lm52;->ν:I

    .line 1592
    .line 1593
    add-long v10, v10, v17

    .line 1594
    .line 1595
    sput-wide v10, Lm52;->τ:J

    .line 1596
    .line 1597
    instance-of v1, v0, Landroid/view/View;

    .line 1598
    .line 1599
    if-eqz v1, :cond_54

    .line 1600
    .line 1601
    move-object v15, v0

    .line 1602
    check-cast v15, Landroid/view/View;

    .line 1603
    .line 1604
    :cond_54
    new-instance v1, Lh52;

    .line 1605
    .line 1606
    invoke-direct {v1, v0, v3, v2, v5}, Lh52;-><init>(Ljava/lang/Object;III)V

    .line 1607
    .line 1608
    .line 1609
    if-eqz v15, :cond_55

    .line 1610
    .line 1611
    new-instance v0, Lν;

    .line 1612
    .line 1613
    const/16 v2, 0x1b

    .line 1614
    .line 1615
    invoke-direct {v0, v2, v1}, Lν;-><init>(ILjava/lang/Object;)V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v15, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1619
    .line 1620
    .line 1621
    goto :goto_25

    .line 1622
    :cond_55
    invoke-virtual {v1}, Lh52;->invoke()Ljava/lang/Object;

    .line 1623
    .line 1624
    .line 1625
    :cond_56
    :goto_25
    return-void

    .line 1626
    :pswitch_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1627
    .line 1628
    .line 1629
    sget-object v0, Lm52;->α:Lm52;

    .line 1630
    .line 1631
    invoke-static {}, Lm52;->ο()Z

    .line 1632
    .line 1633
    .line 1634
    move-result v0

    .line 1635
    if-nez v0, :cond_57

    .line 1636
    .line 1637
    goto/16 :goto_28

    .line 1638
    .line 1639
    :cond_57
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1640
    .line 1641
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1642
    .line 1643
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    array-length v2, v1

    .line 1647
    if-lt v2, v4, :cond_58

    .line 1648
    .line 1649
    aget-object v2, v1, v5

    .line 1650
    .line 1651
    instance-of v4, v2, Ljava/lang/Integer;

    .line 1652
    .line 1653
    if-eqz v4, :cond_58

    .line 1654
    .line 1655
    aget-object v4, v1, v3

    .line 1656
    .line 1657
    instance-of v4, v4, Ljava/lang/Float;

    .line 1658
    .line 1659
    if-eqz v4, :cond_58

    .line 1660
    .line 1661
    check-cast v2, Ljava/lang/Integer;

    .line 1662
    .line 1663
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1664
    .line 1665
    .line 1666
    move-result v2

    .line 1667
    aget-object v1, v1, v3

    .line 1668
    .line 1669
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1670
    .line 1671
    .line 1672
    check-cast v1, Ljava/lang/Float;

    .line 1673
    .line 1674
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1675
    .line 1676
    .line 1677
    move-result v1

    .line 1678
    goto :goto_26

    .line 1679
    :cond_58
    array-length v2, v1

    .line 1680
    if-lt v2, v14, :cond_5e

    .line 1681
    .line 1682
    aget-object v2, v1, v5

    .line 1683
    .line 1684
    instance-of v4, v2, Ljava/lang/Float;

    .line 1685
    .line 1686
    if-eqz v4, :cond_5e

    .line 1687
    .line 1688
    aget-object v4, v1, v3

    .line 1689
    .line 1690
    instance-of v4, v4, Ljava/lang/Integer;

    .line 1691
    .line 1692
    if-eqz v4, :cond_5e

    .line 1693
    .line 1694
    check-cast v2, Ljava/lang/Float;

    .line 1695
    .line 1696
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 1697
    .line 1698
    .line 1699
    move-result v2

    .line 1700
    aget-object v1, v1, v3

    .line 1701
    .line 1702
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1703
    .line 1704
    .line 1705
    check-cast v1, Ljava/lang/Integer;

    .line 1706
    .line 1707
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1708
    .line 1709
    .line 1710
    move-result v1

    .line 1711
    move/from16 v23, v2

    .line 1712
    .line 1713
    move v2, v1

    .line 1714
    move/from16 v1, v23

    .line 1715
    .line 1716
    :goto_26
    cmpg-float v4, v1, v16

    .line 1717
    .line 1718
    if-lez v4, :cond_5e

    .line 1719
    .line 1720
    cmpl-float v1, v1, v11

    .line 1721
    .line 1722
    if-ltz v1, :cond_59

    .line 1723
    .line 1724
    goto :goto_28

    .line 1725
    :cond_59
    invoke-static {v0}, Lm52;->τ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v0

    .line 1729
    if-nez v0, :cond_5a

    .line 1730
    .line 1731
    goto :goto_28

    .line 1732
    :cond_5a
    invoke-static {v0}, Lm52;->λ(Ljava/lang/Object;)I

    .line 1733
    .line 1734
    .line 1735
    move-result v0

    .line 1736
    if-ne v0, v2, :cond_5b

    .line 1737
    .line 1738
    move v13, v3

    .line 1739
    goto :goto_27

    .line 1740
    :cond_5b
    if-le v0, v2, :cond_5c

    .line 1741
    .line 1742
    goto :goto_27

    .line 1743
    :cond_5c
    move v13, v5

    .line 1744
    :goto_27
    if-nez v13, :cond_5d

    .line 1745
    .line 1746
    goto :goto_28

    .line 1747
    :cond_5d
    sput v13, Lm52;->ρ:I

    .line 1748
    .line 1749
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1750
    .line 1751
    .line 1752
    move-result-wide v0

    .line 1753
    sput-wide v0, Lm52;->σ:J

    .line 1754
    .line 1755
    :cond_5e
    :goto_28
    return-void

    .line 1756
    :pswitch_e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1757
    .line 1758
    .line 1759
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1760
    .line 1761
    invoke-static {}, Lo22;->ο()Z

    .line 1762
    .line 1763
    .line 1764
    move-result v1

    .line 1765
    if-eqz v1, :cond_5f

    .line 1766
    .line 1767
    goto :goto_2a

    .line 1768
    :cond_5f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1769
    .line 1770
    .line 1771
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v1

    .line 1775
    instance-of v2, v1, Landroid/view/View;

    .line 1776
    .line 1777
    if-eqz v2, :cond_60

    .line 1778
    .line 1779
    move-object v15, v1

    .line 1780
    check-cast v15, Landroid/view/View;

    .line 1781
    .line 1782
    :cond_60
    if-nez v15, :cond_61

    .line 1783
    .line 1784
    goto :goto_2a

    .line 1785
    :cond_61
    sget-object v1, Lo22;->ι:Ljava/util/Set;

    .line 1786
    .line 1787
    invoke-interface {v1, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1788
    .line 1789
    .line 1790
    move-result v1

    .line 1791
    if-nez v1, :cond_62

    .line 1792
    .line 1793
    goto :goto_2a

    .line 1794
    :cond_62
    array-length v1, v0

    .line 1795
    move v2, v5

    .line 1796
    :goto_29
    if-ge v5, v1, :cond_64

    .line 1797
    .line 1798
    aget-object v4, v0, v5

    .line 1799
    .line 1800
    add-int/lit8 v6, v2, 0x1

    .line 1801
    .line 1802
    instance-of v7, v4, Landroid/view/ViewGroup$LayoutParams;

    .line 1803
    .line 1804
    if-eqz v7, :cond_63

    .line 1805
    .line 1806
    move-object v7, v4

    .line 1807
    check-cast v7, Landroid/view/ViewGroup$LayoutParams;

    .line 1808
    .line 1809
    invoke-static {v15, v7, v3}, Lo22;->Β(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;Z)V

    .line 1810
    .line 1811
    .line 1812
    invoke-static {v7}, Lo22;->Μ(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1813
    .line 1814
    .line 1815
    aput-object v4, v0, v2

    .line 1816
    .line 1817
    :cond_63
    add-int/lit8 v5, v5, 0x1

    .line 1818
    .line 1819
    move v2, v6

    .line 1820
    goto :goto_29

    .line 1821
    :cond_64
    invoke-static {v15}, Lo22;->δ(Landroid/view/View;)V

    .line 1822
    .line 1823
    .line 1824
    :goto_2a
    return-void

    .line 1825
    :pswitch_f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1826
    .line 1827
    .line 1828
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1829
    .line 1830
    invoke-static {}, Lo22;->ο()Z

    .line 1831
    .line 1832
    .line 1833
    move-result v2

    .line 1834
    if-eqz v2, :cond_65

    .line 1835
    .line 1836
    goto :goto_2c

    .line 1837
    :cond_65
    iget-object v1, v1, Lk01;->β:Ljava/lang/Object;

    .line 1838
    .line 1839
    instance-of v2, v1, Landroid/view/View;

    .line 1840
    .line 1841
    if-eqz v2, :cond_66

    .line 1842
    .line 1843
    check-cast v1, Landroid/view/View;

    .line 1844
    .line 1845
    goto :goto_2b

    .line 1846
    :cond_66
    move-object v1, v15

    .line 1847
    :goto_2b
    if-nez v1, :cond_67

    .line 1848
    .line 1849
    goto :goto_2c

    .line 1850
    :cond_67
    sget-object v2, Lo22;->ι:Ljava/util/Set;

    .line 1851
    .line 1852
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1853
    .line 1854
    .line 1855
    move-result v2

    .line 1856
    if-nez v2, :cond_68

    .line 1857
    .line 1858
    goto :goto_2c

    .line 1859
    :cond_68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1860
    .line 1861
    .line 1862
    invoke-static {v5, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1863
    .line 1864
    .line 1865
    move-result-object v2

    .line 1866
    instance-of v4, v2, Landroid/view/ViewGroup$LayoutParams;

    .line 1867
    .line 1868
    if-eqz v4, :cond_69

    .line 1869
    .line 1870
    move-object v15, v2

    .line 1871
    check-cast v15, Landroid/view/ViewGroup$LayoutParams;

    .line 1872
    .line 1873
    :cond_69
    if-nez v15, :cond_6a

    .line 1874
    .line 1875
    new-instance v15, Landroid/view/ViewGroup$LayoutParams;

    .line 1876
    .line 1877
    invoke-direct {v15, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1878
    .line 1879
    .line 1880
    :cond_6a
    invoke-static {v1, v15, v3}, Lo22;->Β(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;Z)V

    .line 1881
    .line 1882
    .line 1883
    invoke-static {v15}, Lo22;->Μ(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1884
    .line 1885
    .line 1886
    aput-object v15, v0, v5

    .line 1887
    .line 1888
    :goto_2c
    return-void

    .line 1889
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1890
    .line 1891
    .line 1892
    invoke-static {}, Lo22;->ο()Z

    .line 1893
    .line 1894
    .line 1895
    move-result v0

    .line 1896
    if-eqz v0, :cond_6b

    .line 1897
    .line 1898
    goto :goto_2d

    .line 1899
    :cond_6b
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 1900
    .line 1901
    instance-of v2, v0, Landroid/view/View;

    .line 1902
    .line 1903
    if-eqz v2, :cond_6c

    .line 1904
    .line 1905
    move-object v15, v0

    .line 1906
    check-cast v15, Landroid/view/View;

    .line 1907
    .line 1908
    :cond_6c
    if-nez v15, :cond_6d

    .line 1909
    .line 1910
    goto :goto_2d

    .line 1911
    :cond_6d
    sget-object v0, Lo22;->ι:Ljava/util/Set;

    .line 1912
    .line 1913
    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v0

    .line 1917
    if-nez v0, :cond_6e

    .line 1918
    .line 1919
    goto :goto_2d

    .line 1920
    :cond_6e
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 1921
    .line 1922
    const/16 v1, 0x8

    .line 1923
    .line 1924
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v1

    .line 1928
    aput-object v1, v0, v5

    .line 1929
    .line 1930
    :goto_2d
    return-void

    .line 1931
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
