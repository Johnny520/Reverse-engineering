.class public final Lak0;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Class;

.field public final synthetic γ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lak0;->α:I

    .line 3
    .line 4
    iput-object p2, p0, Lak0;->γ:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p1, p0, Lak0;->β:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-direct {p0}, Lm01;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 12
    iput p3, p0, Lak0;->α:I

    iput-object p1, p0, Lak0;->β:Ljava/lang/Class;

    iput-object p2, p0, Lak0;->γ:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lk01;)V
    .locals 14

    .line 1
    iget v0, p0, Lak0;->α:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ls62;->α:Ls62;

    .line 5
    .line 6
    iget-object v3, p0, Lak0;->γ:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    const-string v4, "rac25e39d95f0abcc"

    .line 9
    .line 10
    iget-object v5, p0, Lak0;->β:Ljava/lang/Class;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object p0, Lbe0;->α:Lbe0;

    .line 20
    .line 21
    invoke-virtual {p0}, Lbe0;->η()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto :goto_4

    .line 28
    :cond_0
    :try_start_0
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length p1, p0

    .line 34
    move v0, v6

    .line 35
    :goto_0
    if-ge v6, p1, :cond_2

    .line 36
    .line 37
    aget-object v1, p0, v6

    .line 38
    .line 39
    invoke-virtual {v5, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_1

    .line 44
    .line 45
    invoke-static {v1}, Lvd0;->δ(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    if-lez v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v1, "contact state filtered owner="

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, " removed="

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {v4, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :goto_2
    new-instance v2, Leo1;

    .line 97
    .line 98
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_3
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-eqz p0, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "contact state callback failed: "

    .line 112
    .line 113
    invoke-static {p1, p0, v4}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    :goto_4
    return-void

    .line 117
    :pswitch_0
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 118
    .line 119
    sget-object v3, Lbe0;->α:Lbe0;

    .line 120
    .line 121
    invoke-virtual {v3}, Lbe0;->η()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-nez v3, :cond_5

    .line 126
    .line 127
    goto/16 :goto_a

    .line 128
    .line 129
    :cond_5
    if-eqz v5, :cond_6

    .line 130
    .line 131
    iget-object v3, p1, Lk01;->β:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v5, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_6

    .line 138
    .line 139
    goto/16 :goto_a

    .line 140
    .line 141
    :cond_6
    iget-object v7, p0, Lak0;->γ:Ljava/lang/reflect/Method;

    .line 142
    .line 143
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    array-length p0, v0

    .line 147
    move v9, v6

    .line 148
    :goto_5
    if-ge v6, p0, :cond_d

    .line 149
    .line 150
    aget-object v3, v0, v6

    .line 151
    .line 152
    add-int/lit8 v5, v9, 0x1

    .line 153
    .line 154
    instance-of v8, v3, Ljava/util/List;

    .line 155
    .line 156
    if-eqz v8, :cond_7

    .line 157
    .line 158
    check-cast v3, Ljava/util/List;

    .line 159
    .line 160
    move-object v10, v3

    .line 161
    goto :goto_6

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    move-object p0, v0

    .line 164
    goto :goto_9

    .line 165
    :cond_7
    move-object v10, v1

    .line 166
    :goto_6
    if-nez v10, :cond_8

    .line 167
    .line 168
    goto :goto_8

    .line 169
    :cond_8
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v9, v3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Ljava/lang/Class;

    .line 181
    .line 182
    if-nez v3, :cond_9

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_9
    const-class v8, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-virtual {v3, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_a

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_a
    invoke-static {v10}, Lvd0;->ε(Ljava/util/List;)Ltd0;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    iget-object v8, v3, Ltd0;->α:Ljava/util/ArrayList;

    .line 199
    .line 200
    iget-boolean v3, v3, Ltd0;->β:Z

    .line 201
    .line 202
    if-eqz v3, :cond_b

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_b
    move-object v8, v1

    .line 206
    :goto_7
    if-nez v8, :cond_c

    .line 207
    .line 208
    sget-object v3, Llv1;->α:Llv1;

    .line 209
    .line 210
    iget-object v8, p1, Lk01;->β:Ljava/lang/Object;

    .line 211
    .line 212
    const/4 v11, 0x0

    .line 213
    const/4 v12, 0x0

    .line 214
    invoke-static/range {v7 .. v12}, Llv1;->α(Ljava/lang/reflect/Method;Ljava/lang/Object;ILjava/util/List;ZI)V

    .line 215
    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_c
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    sub-int v12, v3, v11

    .line 227
    .line 228
    new-instance v3, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 231
    .line 232
    .line 233
    aput-object v3, v0, v9

    .line 234
    .line 235
    sget-object v3, Llv1;->α:Llv1;

    .line 236
    .line 237
    iget-object v8, p1, Lk01;->β:Ljava/lang/Object;

    .line 238
    .line 239
    const/4 v11, 0x1

    .line 240
    invoke-static/range {v7 .. v12}, Llv1;->α(Ljava/lang/reflect/Method;Ljava/lang/Object;ILjava/util/List;ZI)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 241
    .line 242
    .line 243
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 244
    .line 245
    move v9, v5

    .line 246
    goto :goto_5

    .line 247
    :goto_9
    new-instance v2, Leo1;

    .line 248
    .line 249
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :cond_d
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    if-eqz p0, :cond_e

    .line 257
    .line 258
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    const-string p1, "contact select callback failed: "

    .line 263
    .line 264
    invoke-static {p1, p0, v4}, Lnx;->χ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    :cond_e
    :goto_a
    return-void

    .line 268
    :pswitch_1
    sget-object p0, Lbk0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 269
    .line 270
    const/4 p0, 0x1

    .line 271
    :try_start_2
    invoke-static {}, Lui1;->Α()Z

    .line 272
    .line 273
    .line 274
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 275
    if-nez v0, :cond_11

    .line 276
    .line 277
    :try_start_3
    const-string v0, "android.app.ActivityThread"

    .line 278
    .line 279
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    const-string v2, "currentApplication"

    .line 284
    .line 285
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v0, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    instance-of v2, v0, Landroid/app/Application;

    .line 297
    .line 298
    if-eqz v2, :cond_f

    .line 299
    .line 300
    check-cast v0, Landroid/app/Application;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 301
    .line 302
    goto :goto_c

    .line 303
    :catchall_2
    move-exception v0

    .line 304
    goto :goto_b

    .line 305
    :cond_f
    move-object v0, v1

    .line 306
    goto :goto_c

    .line 307
    :goto_b
    :try_start_4
    new-instance v2, Leo1;

    .line 308
    .line 309
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    move-object v0, v2

    .line 313
    :goto_c
    instance-of v2, v0, Leo1;

    .line 314
    .line 315
    if-eqz v2, :cond_10

    .line 316
    .line 317
    move-object v0, v1

    .line 318
    :cond_10
    check-cast v0, Landroid/app/Application;

    .line 319
    .line 320
    if-eqz v0, :cond_11

    .line 321
    .line 322
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 323
    .line 324
    .line 325
    :cond_11
    const-string v0, "im_disable_read_receipt_report"

    .line 326
    .line 327
    invoke-static {v0, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 328
    .line 329
    .line 330
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 331
    goto :goto_d

    .line 332
    :catchall_3
    move v0, v6

    .line 333
    :goto_d
    if-nez v0, :cond_12

    .line 334
    .line 335
    goto/16 :goto_17

    .line 336
    .line 337
    :cond_12
    sget-object v0, Lbk0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 338
    .line 339
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 340
    .line 341
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    if-nez v0, :cond_13

    .line 345
    .line 346
    goto :goto_f

    .line 347
    :cond_13
    new-instance v2, Ljava/util/HashSet;

    .line 348
    .line 349
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 350
    .line 351
    .line 352
    array-length v4, v0

    .line 353
    move v7, v6

    .line 354
    :goto_e
    if-ge v7, v4, :cond_14

    .line 355
    .line 356
    aget-object v8, v0, v7

    .line 357
    .line 358
    invoke-static {v8, v5, v6, v2}, Lbk0;->β(Ljava/lang/Object;Ljava/lang/Class;ILjava/util/HashSet;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    if-nez v8, :cond_15

    .line 363
    .line 364
    add-int/lit8 v7, v7, 0x1

    .line 365
    .line 366
    goto :goto_e

    .line 367
    :cond_14
    :goto_f
    move-object v8, v1

    .line 368
    :cond_15
    if-nez v8, :cond_16

    .line 369
    .line 370
    goto/16 :goto_17

    .line 371
    .line 372
    :cond_16
    sget-object v0, Lbk0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 373
    .line 374
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-static {v0}, Lbk0;->α(Ljava/lang/Class;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_18

    .line 387
    .line 388
    :cond_17
    move p0, v6

    .line 389
    goto/16 :goto_12

    .line 390
    .line 391
    :cond_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    :cond_19
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_17

    .line 400
    .line 401
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    move-object v4, v0

    .line 406
    check-cast v4, Ljava/lang/reflect/Field;

    .line 407
    .line 408
    :try_start_5
    invoke-virtual {v4, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 412
    goto :goto_11

    .line 413
    :catchall_4
    move-exception v0

    .line 414
    new-instance v5, Leo1;

    .line 415
    .line 416
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 417
    .line 418
    .line 419
    move-object v0, v5

    .line 420
    :goto_11
    instance-of v5, v0, Leo1;

    .line 421
    .line 422
    if-eqz v5, :cond_1a

    .line 423
    .line 424
    move-object v0, v1

    .line 425
    :cond_1a
    if-nez v0, :cond_1b

    .line 426
    .line 427
    goto :goto_10

    .line 428
    :cond_1b
    sget-object v5, Lbk0;->ν:Ljava/util/Set;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-nez v0, :cond_1e

    .line 443
    .line 444
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 452
    .line 453
    invoke-static {v4, v0, v4}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    sget-object v4, Lbk0;->μ:Ljava/util/Set;

    .line 458
    .line 459
    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    if-nez v4, :cond_1e

    .line 464
    .line 465
    const-string v4, "batch_mark_read"

    .line 466
    .line 467
    invoke-static {v0, v4, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 468
    .line 469
    .line 470
    move-result v4

    .line 471
    if-eqz v4, :cond_1c

    .line 472
    .line 473
    goto :goto_12

    .line 474
    :cond_1c
    const-string v4, "unread"

    .line 475
    .line 476
    invoke-static {v0, v4, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-eqz v4, :cond_1d

    .line 481
    .line 482
    goto :goto_10

    .line 483
    :cond_1d
    const-string v4, "mark"

    .line 484
    .line 485
    invoke-static {v0, v4, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 486
    .line 487
    .line 488
    move-result v4

    .line 489
    if-eqz v4, :cond_19

    .line 490
    .line 491
    const-string v4, "read"

    .line 492
    .line 493
    invoke-static {v0, v4, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 494
    .line 495
    .line 496
    move-result v4

    .line 497
    if-eqz v4, :cond_19

    .line 498
    .line 499
    const-string v4, "conversation"

    .line 500
    .line 501
    invoke-static {v0, v4, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    if-nez v4, :cond_1e

    .line 506
    .line 507
    const-string v4, "stranger"

    .line 508
    .line 509
    invoke-static {v0, v4, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    if-nez v4, :cond_1e

    .line 514
    .line 515
    const-string v4, "message"

    .line 516
    .line 517
    invoke-static {v0, v4, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-eqz v0, :cond_19

    .line 522
    .line 523
    :cond_1e
    :goto_12
    if-nez p0, :cond_1f

    .line 524
    .line 525
    goto/16 :goto_17

    .line 526
    .line 527
    :cond_1f
    sget-object p0, Lbk0;->β:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 528
    .line 529
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    const/16 v0, 0x14

    .line 534
    .line 535
    if-le p0, v0, :cond_20

    .line 536
    .line 537
    rem-int/lit8 v0, p0, 0x32

    .line 538
    .line 539
    if-nez v0, :cond_25

    .line 540
    .line 541
    :cond_20
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-static {v0}, Lbk0;->α(Ljava/lang/Class;)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    new-instance v2, Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 552
    .line 553
    .line 554
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    :cond_21
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-eqz v0, :cond_24

    .line 563
    .line 564
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    check-cast v0, Ljava/lang/reflect/Field;

    .line 569
    .line 570
    :try_start_6
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v5

    .line 574
    if-eqz v5, :cond_22

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 580
    goto :goto_15

    .line 581
    :catchall_5
    move-exception v0

    .line 582
    goto :goto_14

    .line 583
    :cond_22
    move-object v0, v1

    .line 584
    goto :goto_15

    .line 585
    :goto_14
    new-instance v5, Leo1;

    .line 586
    .line 587
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 588
    .line 589
    .line 590
    move-object v0, v5

    .line 591
    :goto_15
    instance-of v5, v0, Leo1;

    .line 592
    .line 593
    if-eqz v5, :cond_23

    .line 594
    .line 595
    move-object v0, v1

    .line 596
    :cond_23
    check-cast v0, Ljava/lang/String;

    .line 597
    .line 598
    if-eqz v0, :cond_21

    .line 599
    .line 600
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    goto :goto_13

    .line 604
    :cond_24
    const/16 v0, 0x8

    .line 605
    .line 606
    invoke-static {v2, v0}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 607
    .line 608
    .line 609
    move-result-object v7

    .line 610
    const/4 v12, 0x0

    .line 611
    const/16 v13, 0x3e

    .line 612
    .line 613
    const-string v8, ","

    .line 614
    .line 615
    const/4 v9, 0x0

    .line 616
    const/4 v10, 0x0

    .line 617
    const/4 v11, 0x0

    .line 618
    invoke-static/range {v7 .. v13}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    new-instance v2, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    const-string v4, "\u5df2\u62e6\u622a\u5df2\u8bfb\u4e0a\u62a5 #"

    .line 625
    .line 626
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    const-string p0, " fields="

    .line 633
    .line 634
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    const-string v0, "DYHelperIMPrivacyStatusHook"

    .line 645
    .line 646
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    :cond_25
    sget-object p0, Lbk0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 650
    .line 651
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 659
    .line 660
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    if-eqz v0, :cond_26

    .line 665
    .line 666
    goto/16 :goto_16

    .line 667
    .line 668
    :cond_26
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 669
    .line 670
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-eqz v0, :cond_27

    .line 675
    .line 676
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 677
    .line 678
    goto :goto_16

    .line 679
    :cond_27
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 680
    .line 681
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    if-eqz v0, :cond_28

    .line 686
    .line 687
    invoke-static {v6}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    goto :goto_16

    .line 692
    :cond_28
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 693
    .line 694
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    if-eqz v0, :cond_29

    .line 699
    .line 700
    invoke-static {v6}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    goto :goto_16

    .line 705
    :cond_29
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 706
    .line 707
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-eqz v0, :cond_2a

    .line 712
    .line 713
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    goto :goto_16

    .line 718
    :cond_2a
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 719
    .line 720
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    if-eqz v0, :cond_2b

    .line 725
    .line 726
    const-wide/16 v0, 0x0

    .line 727
    .line 728
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    goto :goto_16

    .line 733
    :cond_2b
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 734
    .line 735
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v0

    .line 739
    if-eqz v0, :cond_2c

    .line 740
    .line 741
    const/4 p0, 0x0

    .line 742
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    goto :goto_16

    .line 747
    :cond_2c
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 748
    .line 749
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    if-eqz v0, :cond_2d

    .line 754
    .line 755
    const-wide/16 v0, 0x0

    .line 756
    .line 757
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    goto :goto_16

    .line 762
    :cond_2d
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 763
    .line 764
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result p0

    .line 768
    if-eqz p0, :cond_2e

    .line 769
    .line 770
    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    :cond_2e
    :goto_16
    invoke-virtual {p1, v1}, Lk01;->α(Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    :goto_17
    return-void

    .line 778
    nop

    .line 779
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
