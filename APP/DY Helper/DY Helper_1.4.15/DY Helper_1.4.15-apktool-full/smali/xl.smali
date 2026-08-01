.class public final Lxl;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iput v0, p0, Lxl;->α:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lm01;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 9
    iput p1, p0, Lxl;->α:I

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 11

    .line 1
    iget v0, p0, Lxl;->α:I

    .line 2
    .line 3
    const-string v1, "hide_comment_input_bar_enabled"

    .line 4
    .line 5
    const-string v2, "force_legacy_comment_panel_enabled"

    .line 6
    .line 7
    const-class v3, Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "DYHelper:DurationAlert"

    .line 10
    .line 11
    const/4 v5, 0x4

    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    :pswitch_0
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object p0, Ld72;->α:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->clear()V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    sput-object v10, Lb10;->γ:Ljava/lang/String;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object p0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    sput-boolean v9, Lb10;->β:Z

    .line 43
    .line 44
    sget-object p0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 45
    .line 46
    sput-object v10, Lb10;->γ:Ljava/lang/String;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 53
    .line 54
    sput-boolean v9, Lb10;->β:Z

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 61
    .line 62
    sput-boolean v8, Lb10;->β:Z

    .line 63
    .line 64
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, Lb10;->α(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 77
    .line 78
    aget-object p0, p0, v9

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p0, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    sget-object v0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 90
    .line 91
    sput-boolean p0, Lb10;->β:Z

    .line 92
    .line 93
    if-eqz p0, :cond_0

    .line 94
    .line 95
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, Lb10;->α(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_0
    return-void

    .line 104
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 108
    .line 109
    aget-object p0, p0, v9

    .line 110
    .line 111
    if-nez p0, :cond_1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    sget-object p1, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 115
    .line 116
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p1, Lpq;->α:Lpq;

    .line 120
    .line 121
    const-string v0, "profile_aweme_change"

    .line 122
    .line 123
    invoke-virtual {p1, v0, p0, p0, v10}, Lpq;->γ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    :goto_0
    return-void

    .line 127
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 131
    .line 132
    if-eqz p0, :cond_f

    .line 133
    .line 134
    sget-object p1, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const-string v0, "Aweme"

    .line 145
    .line 146
    invoke-static {p1, v0, v9}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_2

    .line 151
    .line 152
    move p1, v8

    .line 153
    goto :goto_4

    .line 154
    :cond_2
    :try_start_0
    const-string p1, "aid"

    .line 155
    .line 156
    invoke-static {p0, p1}, Lb10;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-nez p1, :cond_3

    .line 161
    .line 162
    const-string p1, "awemeId"

    .line 163
    .line 164
    invoke-static {p0, p1}, Lb10;->σ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-nez p1, :cond_3

    .line 169
    .line 170
    const-string p1, "video"

    .line 171
    .line 172
    invoke-static {p0, p1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-eqz p1, :cond_4

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :catchall_0
    move-exception v0

    .line 180
    move-object p1, v0

    .line 181
    goto :goto_2

    .line 182
    :cond_3
    :goto_1
    move v9, v8

    .line 183
    :cond_4
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    goto :goto_3

    .line 188
    :goto_2
    new-instance v0, Leo1;

    .line 189
    .line 190
    invoke-direct {v0, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    move-object p1, v0

    .line 194
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 195
    .line 196
    instance-of v1, p1, Leo1;

    .line 197
    .line 198
    if-eqz v1, :cond_5

    .line 199
    .line 200
    move-object p1, v0

    .line 201
    :cond_5
    check-cast p1, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    :goto_4
    if-eqz p1, :cond_6

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_6
    move-object p0, v10

    .line 211
    :goto_5
    if-eqz p0, :cond_f

    .line 212
    .line 213
    sget-object p1, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 214
    .line 215
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    sget-object p1, Lpq;->α:Lpq;

    .line 219
    .line 220
    const-string v0, "detail_getter"

    .line 221
    .line 222
    invoke-virtual {p1, v0, p0, p0, v10}, Lpq;->γ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    sget-boolean p1, Lb10;->δ:Z

    .line 226
    .line 227
    if-eqz p1, :cond_7

    .line 228
    .line 229
    goto/16 :goto_a

    .line 230
    .line 231
    :cond_7
    sput-boolean v8, Lb10;->δ:Z

    .line 232
    .line 233
    :try_start_1
    const-string p1, "music"

    .line 234
    .line 235
    invoke-static {p0, p1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    if-nez p0, :cond_8

    .line 240
    .line 241
    const-string p0, "music=null"

    .line 242
    .line 243
    goto/16 :goto_9

    .line 244
    .line 245
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v0, "Music fields:\n"

    .line 248
    .line 249
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :goto_6
    if-eqz v0, :cond_e

    .line 257
    .line 258
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_e

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v1}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    :goto_7
    invoke-virtual {v1}, Lτ;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-eqz v2, :cond_d

    .line 277
    .line 278
    invoke-virtual {v1}, Lτ;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    check-cast v2, Ljava/lang/reflect/Field;

    .line 283
    .line 284
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    if-nez v4, :cond_9

    .line 292
    .line 293
    const-string v4, "null"

    .line 294
    .line 295
    goto/16 :goto_8

    .line 296
    .line 297
    :cond_9
    instance-of v5, v4, Ljava/util/List;

    .line 298
    .line 299
    if-eqz v5, :cond_a

    .line 300
    .line 301
    move-object v5, v4

    .line 302
    check-cast v5, Ljava/util/List;

    .line 303
    .line 304
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    check-cast v4, Ljava/lang/Iterable;

    .line 309
    .line 310
    const/4 v6, 0x2

    .line 311
    invoke-static {v4, v6}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    new-instance v6, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    const-string v7, "List("

    .line 321
    .line 322
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    const-string v5, ")"

    .line 329
    .line 330
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    goto :goto_8

    .line 341
    :cond_a
    instance-of v5, v4, Ljava/lang/String;

    .line 342
    .line 343
    if-eqz v5, :cond_c

    .line 344
    .line 345
    move-object v5, v4

    .line 346
    check-cast v5, Ljava/lang/String;

    .line 347
    .line 348
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    const/16 v6, 0x50

    .line 353
    .line 354
    if-le v5, v6, :cond_b

    .line 355
    .line 356
    check-cast v4, Ljava/lang/String;

    .line 357
    .line 358
    invoke-static {v4, v6}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    new-instance v5, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v4, "..."

    .line 371
    .line 372
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    goto :goto_8

    .line 380
    :cond_b
    check-cast v4, Ljava/lang/String;

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    new-instance v6, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string v5, "@"

    .line 404
    .line 405
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    :goto_8
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v5

    .line 419
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    new-instance v6, Ljava/lang/StringBuilder;

    .line 424
    .line 425
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 426
    .line 427
    .line 428
    const-string v7, "  "

    .line 429
    .line 430
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    const-string v5, "."

    .line 437
    .line 438
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    const-string v2, " = "

    .line 445
    .line 446
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    const/16 v2, 0xa

    .line 460
    .line 461
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    goto/16 :goto_7

    .line 465
    .line 466
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    goto/16 :goto_6

    .line 471
    .line 472
    :cond_e
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 476
    goto :goto_9

    .line 477
    :catchall_1
    move-exception v0

    .line 478
    move-object p0, v0

    .line 479
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    const-string p1, "dump failed: "

    .line 484
    .line 485
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    :goto_9
    const-string p1, "DYHelper: "

    .line 490
    .line 491
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    :cond_f
    :goto_a
    return-void

    .line 499
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 503
    .line 504
    invoke-virtual {p0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 512
    .line 513
    invoke-static {}, Ld00;->β()Z

    .line 514
    .line 515
    .line 516
    move-result p0

    .line 517
    if-eqz p0, :cond_10

    .line 518
    .line 519
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 520
    .line 521
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 522
    .line 523
    .line 524
    move-result-wide v0

    .line 525
    const-wide/32 v2, 0x493e0

    .line 526
    .line 527
    .line 528
    add-long/2addr v0, v2

    .line 529
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 530
    .line 531
    .line 532
    :cond_10
    return-void

    .line 533
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 537
    .line 538
    invoke-static {}, Ld00;->β()Z

    .line 539
    .line 540
    .line 541
    move-result p0

    .line 542
    if-eqz p0, :cond_1f

    .line 543
    .line 544
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 545
    .line 546
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 547
    .line 548
    .line 549
    move-result-wide v0

    .line 550
    cmp-long p0, v0, v6

    .line 551
    .line 552
    if-lez p0, :cond_1f

    .line 553
    .line 554
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 555
    .line 556
    .line 557
    move-result-wide v2

    .line 558
    cmp-long p0, v2, v0

    .line 559
    .line 560
    if-gtz p0, :cond_1f

    .line 561
    .line 562
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 563
    .line 564
    instance-of v0, p0, Ljava/lang/Number;

    .line 565
    .line 566
    if-eqz v0, :cond_11

    .line 567
    .line 568
    check-cast p0, Ljava/lang/Number;

    .line 569
    .line 570
    goto :goto_b

    .line 571
    :cond_11
    move-object p0, v10

    .line 572
    :goto_b
    if-nez p0, :cond_12

    .line 573
    .line 574
    goto/16 :goto_10

    .line 575
    .line 576
    :cond_12
    :try_start_2
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 577
    .line 578
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 579
    .line 580
    const-string v1, "getInspireTime"

    .line 581
    .line 582
    new-array v2, v9, [Ljava/lang/Object;

    .line 583
    .line 584
    invoke-static {v0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    instance-of v1, v0, Ljava/lang/Number;

    .line 589
    .line 590
    if-eqz v1, :cond_13

    .line 591
    .line 592
    check-cast v0, Ljava/lang/Number;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 593
    .line 594
    goto :goto_d

    .line 595
    :catchall_2
    move-exception v0

    .line 596
    goto :goto_c

    .line 597
    :cond_13
    move-object v0, v10

    .line 598
    goto :goto_d

    .line 599
    :goto_c
    new-instance v1, Leo1;

    .line 600
    .line 601
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 602
    .line 603
    .line 604
    move-object v0, v1

    .line 605
    :goto_d
    instance-of v1, v0, Leo1;

    .line 606
    .line 607
    if-eqz v1, :cond_14

    .line 608
    .line 609
    goto :goto_e

    .line 610
    :cond_14
    move-object v10, v0

    .line 611
    :goto_e
    check-cast v10, Ljava/lang/Number;

    .line 612
    .line 613
    if-nez v10, :cond_15

    .line 614
    .line 615
    goto/16 :goto_10

    .line 616
    .line 617
    :cond_15
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 618
    .line 619
    .line 620
    move-result-wide v0

    .line 621
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 622
    .line 623
    .line 624
    move-result-wide v2

    .line 625
    const-wide/16 v4, 0x1

    .line 626
    .line 627
    cmp-long v6, v2, v4

    .line 628
    .line 629
    if-gez v6, :cond_16

    .line 630
    .line 631
    move-wide v2, v4

    .line 632
    :cond_16
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 633
    .line 634
    .line 635
    move-result-wide v0

    .line 636
    sget-object v2, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 637
    .line 638
    instance-of v2, p0, Ljava/lang/Integer;

    .line 639
    .line 640
    if-eqz v2, :cond_18

    .line 641
    .line 642
    const-wide/32 v2, 0x7fffffff

    .line 643
    .line 644
    .line 645
    cmp-long p0, v0, v2

    .line 646
    .line 647
    if-lez p0, :cond_17

    .line 648
    .line 649
    move-wide v0, v2

    .line 650
    :cond_17
    long-to-int p0, v0

    .line 651
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 652
    .line 653
    .line 654
    move-result-object p0

    .line 655
    goto :goto_f

    .line 656
    :cond_18
    instance-of v2, p0, Ljava/lang/Short;

    .line 657
    .line 658
    if-eqz v2, :cond_1a

    .line 659
    .line 660
    const-wide/16 v2, 0x7fff

    .line 661
    .line 662
    cmp-long p0, v0, v2

    .line 663
    .line 664
    if-lez p0, :cond_19

    .line 665
    .line 666
    move-wide v0, v2

    .line 667
    :cond_19
    long-to-int p0, v0

    .line 668
    int-to-short p0, p0

    .line 669
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 670
    .line 671
    .line 672
    move-result-object p0

    .line 673
    goto :goto_f

    .line 674
    :cond_1a
    instance-of v2, p0, Ljava/lang/Byte;

    .line 675
    .line 676
    if-eqz v2, :cond_1c

    .line 677
    .line 678
    const-wide/16 v2, 0x7f

    .line 679
    .line 680
    cmp-long p0, v0, v2

    .line 681
    .line 682
    if-lez p0, :cond_1b

    .line 683
    .line 684
    move-wide v0, v2

    .line 685
    :cond_1b
    long-to-int p0, v0

    .line 686
    int-to-byte p0, p0

    .line 687
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 688
    .line 689
    .line 690
    move-result-object p0

    .line 691
    goto :goto_f

    .line 692
    :cond_1c
    instance-of v2, p0, Ljava/lang/Float;

    .line 693
    .line 694
    if-eqz v2, :cond_1d

    .line 695
    .line 696
    long-to-float p0, v0

    .line 697
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 698
    .line 699
    .line 700
    move-result-object p0

    .line 701
    goto :goto_f

    .line 702
    :cond_1d
    instance-of p0, p0, Ljava/lang/Double;

    .line 703
    .line 704
    if-eqz p0, :cond_1e

    .line 705
    .line 706
    long-to-double v0, v0

    .line 707
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 708
    .line 709
    .line 710
    move-result-object p0

    .line 711
    goto :goto_f

    .line 712
    :cond_1e
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 713
    .line 714
    .line 715
    move-result-object p0

    .line 716
    :goto_f
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    :cond_1f
    :goto_10
    return-void

    .line 720
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 724
    .line 725
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    check-cast p0, Landroid/app/Activity;

    .line 729
    .line 730
    sget-object p1, Lyw;->α:Landroid/os/Handler;

    .line 731
    .line 732
    invoke-static {p0}, Lyw;->γ(Landroid/app/Activity;)Z

    .line 733
    .line 734
    .line 735
    move-result p0

    .line 736
    if-nez p0, :cond_20

    .line 737
    .line 738
    goto :goto_11

    .line 739
    :cond_20
    sget-wide p0, Lyw;->θ:J

    .line 740
    .line 741
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 742
    .line 743
    .line 744
    move-result-wide v0

    .line 745
    sput-wide v0, Lyw;->θ:J

    .line 746
    .line 747
    sget-boolean v0, Lyw;->ι:Z

    .line 748
    .line 749
    if-eqz v0, :cond_21

    .line 750
    .line 751
    const-string p0, "[\u89e6\u6478] \u7528\u6237\u64cd\u4f5c\uff0c\u53d6\u6d88\u7a7a\u95f2\u9000\u51fa\u5012\u8ba1\u65f6"

    .line 752
    .line 753
    invoke-static {v4, p0, v10, v5, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    invoke-static {}, Lyw;->ε()V

    .line 757
    .line 758
    .line 759
    goto :goto_11

    .line 760
    :cond_21
    cmp-long p0, p0, v6

    .line 761
    .line 762
    if-nez p0, :cond_22

    .line 763
    .line 764
    const-string p0, "[\u89e6\u6478] \u9996\u6b21\u89e6\u6478\uff0c\u7a7a\u95f2\u8ba1\u65f6\u5f00\u59cb"

    .line 765
    .line 766
    invoke-static {v4, p0, v10, v5, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    :cond_22
    :goto_11
    return-void

    .line 770
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 774
    .line 775
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    check-cast p0, Landroid/app/Activity;

    .line 779
    .line 780
    sget-object p1, Lyw;->α:Landroid/os/Handler;

    .line 781
    .line 782
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    move-result-object p0

    .line 786
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object p0

    .line 790
    const-string p1, "MainActivity"

    .line 791
    .line 792
    invoke-static {p0, p1, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 793
    .line 794
    .line 795
    move-result p1

    .line 796
    if-nez p1, :cond_23

    .line 797
    .line 798
    const-string p1, "MainTabActivity"

    .line 799
    .line 800
    invoke-static {p0, p1, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 801
    .line 802
    .line 803
    move-result p1

    .line 804
    if-nez p1, :cond_23

    .line 805
    .line 806
    const-string p1, "HomePageActivity"

    .line 807
    .line 808
    invoke-static {p0, p1, v8}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 809
    .line 810
    .line 811
    move-result p0

    .line 812
    if-eqz p0, :cond_24

    .line 813
    .line 814
    :cond_23
    const-string p0, "[onDestroy] \u4e3bActivity\u9500\u6bc1\uff0c\u91cd\u7f6e\u8ba1\u65f6"

    .line 815
    .line 816
    invoke-static {v4, p0, v10, v5, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    sput-wide v6, Lyw;->β:J

    .line 820
    .line 821
    sput-wide v6, Lyw;->γ:J

    .line 822
    .line 823
    sput-wide v6, Lyw;->δ:J

    .line 824
    .line 825
    sput v9, Lyw;->ζ:I

    .line 826
    .line 827
    sput v9, Lyw;->η:I

    .line 828
    .line 829
    sput-wide v6, Lyw;->θ:J

    .line 830
    .line 831
    sput-boolean v9, Lyw;->ε:Z

    .line 832
    .line 833
    invoke-static {}, Lyw;->ε()V

    .line 834
    .line 835
    .line 836
    invoke-static {}, Lyw;->θ()V

    .line 837
    .line 838
    .line 839
    :cond_24
    return-void

    .line 840
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 844
    .line 845
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    check-cast p0, Landroid/app/Activity;

    .line 849
    .line 850
    sget-object p1, Lyw;->α:Landroid/os/Handler;

    .line 851
    .line 852
    invoke-static {p0}, Lyw;->γ(Landroid/app/Activity;)Z

    .line 853
    .line 854
    .line 855
    move-result p1

    .line 856
    if-nez p1, :cond_25

    .line 857
    .line 858
    goto :goto_12

    .line 859
    :cond_25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    move-result-object p0

    .line 863
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object p0

    .line 867
    const-string p1, "[onPause] "

    .line 868
    .line 869
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object p0

    .line 873
    invoke-static {v4, p0, v10, v5, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    sget-boolean p0, Lyw;->ε:Z

    .line 877
    .line 878
    if-nez p0, :cond_26

    .line 879
    .line 880
    goto :goto_12

    .line 881
    :cond_26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 882
    .line 883
    .line 884
    move-result-wide p0

    .line 885
    sget-wide v0, Lyw;->δ:J

    .line 886
    .line 887
    cmp-long v0, v0, v6

    .line 888
    .line 889
    if-lez v0, :cond_27

    .line 890
    .line 891
    sget-wide v0, Lyw;->γ:J

    .line 892
    .line 893
    sget-wide v2, Lyw;->δ:J

    .line 894
    .line 895
    sub-long/2addr p0, v2

    .line 896
    add-long/2addr p0, v0

    .line 897
    sput-wide p0, Lyw;->γ:J

    .line 898
    .line 899
    :cond_27
    sput-boolean v9, Lyw;->ε:Z

    .line 900
    .line 901
    invoke-static {}, Lyw;->ε()V

    .line 902
    .line 903
    .line 904
    invoke-static {}, Lyw;->θ()V

    .line 905
    .line 906
    .line 907
    :goto_12
    return-void

    .line 908
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 912
    .line 913
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    check-cast p0, Landroid/app/Activity;

    .line 917
    .line 918
    sget-object p1, Lyw;->α:Landroid/os/Handler;

    .line 919
    .line 920
    invoke-static {p0}, Lyw;->γ(Landroid/app/Activity;)Z

    .line 921
    .line 922
    .line 923
    move-result p1

    .line 924
    if-nez p1, :cond_28

    .line 925
    .line 926
    goto :goto_13

    .line 927
    :cond_28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    move-result-object p1

    .line 931
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object p1

    .line 935
    const-string v0, "[onResume] "

    .line 936
    .line 937
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object p1

    .line 941
    invoke-static {v4, p1, v10, v5, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 942
    .line 943
    .line 944
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 945
    .line 946
    .line 947
    move-result-wide v0

    .line 948
    sget-wide v2, Lyw;->β:J

    .line 949
    .line 950
    cmp-long p1, v2, v6

    .line 951
    .line 952
    if-nez p1, :cond_29

    .line 953
    .line 954
    sput-wide v0, Lyw;->β:J

    .line 955
    .line 956
    sput-wide v6, Lyw;->γ:J

    .line 957
    .line 958
    sput v9, Lyw;->ζ:I

    .line 959
    .line 960
    sput v9, Lyw;->η:I

    .line 961
    .line 962
    const-string p1, "\u65b0\u4f1a\u8bdd\u5f00\u59cb"

    .line 963
    .line 964
    invoke-static {v4, p1, v10, v5, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 965
    .line 966
    .line 967
    :cond_29
    sput-wide v0, Lyw;->δ:J

    .line 968
    .line 969
    sput-wide v0, Lyw;->θ:J

    .line 970
    .line 971
    sput-boolean v8, Lyw;->ε:Z

    .line 972
    .line 973
    invoke-static {}, Lyw;->θ()V

    .line 974
    .line 975
    .line 976
    new-instance p1, Ld1;

    .line 977
    .line 978
    invoke-direct {p1, v5, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    sput-object p1, Lyw;->μ:Ld1;

    .line 982
    .line 983
    sget-object p0, Lyw;->α:Landroid/os/Handler;

    .line 984
    .line 985
    const-wide/16 v0, 0x2710

    .line 986
    .line 987
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 988
    .line 989
    .line 990
    :goto_13
    return-void

    .line 991
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    sget-object p0, Ljm;->η:Ljava/lang/ThreadLocal;

    .line 995
    .line 996
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object p0

    .line 1000
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1001
    .line 1002
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result p0

    .line 1006
    if-nez p0, :cond_2e

    .line 1007
    .line 1008
    sget-object p0, Ljm;->α:Ljm;

    .line 1009
    .line 1010
    invoke-static {}, Ljm;->η()Z

    .line 1011
    .line 1012
    .line 1013
    move-result p0

    .line 1014
    if-nez p0, :cond_2a

    .line 1015
    .line 1016
    goto :goto_14

    .line 1017
    :cond_2a
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1018
    .line 1019
    instance-of p1, p0, Landroid/view/View;

    .line 1020
    .line 1021
    if-eqz p1, :cond_2b

    .line 1022
    .line 1023
    move-object v10, p0

    .line 1024
    check-cast v10, Landroid/view/View;

    .line 1025
    .line 1026
    :cond_2b
    if-nez v10, :cond_2c

    .line 1027
    .line 1028
    goto :goto_14

    .line 1029
    :cond_2c
    sget-object p0, Ljm;->ζ:Ljava/util/Map;

    .line 1030
    .line 1031
    invoke-interface {p0, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    move-result p0

    .line 1035
    if-nez p0, :cond_2d

    .line 1036
    .line 1037
    goto :goto_14

    .line 1038
    :cond_2d
    invoke-static {v10}, Ljm;->δ(Landroid/view/View;)V

    .line 1039
    .line 1040
    .line 1041
    :cond_2e
    :goto_14
    return-void

    .line 1042
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1043
    .line 1044
    .line 1045
    sget-object p0, Ljm;->α:Ljm;

    .line 1046
    .line 1047
    invoke-static {}, Ljm;->η()Z

    .line 1048
    .line 1049
    .line 1050
    move-result p0

    .line 1051
    if-nez p0, :cond_2f

    .line 1052
    .line 1053
    invoke-static {}, Ljm;->κ()V

    .line 1054
    .line 1055
    .line 1056
    goto :goto_16

    .line 1057
    :cond_2f
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1058
    .line 1059
    if-nez p0, :cond_30

    .line 1060
    .line 1061
    goto :goto_16

    .line 1062
    :cond_30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    move-result-object p1

    .line 1066
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1067
    .line 1068
    .line 1069
    move-result-object p1

    .line 1070
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1071
    .line 1072
    .line 1073
    invoke-static {p1}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 1074
    .line 1075
    .line 1076
    move-result-object p1

    .line 1077
    new-instance v0, Lhm;

    .line 1078
    .line 1079
    invoke-direct {v0, v8}, Lhm;-><init>(I)V

    .line 1080
    .line 1081
    .line 1082
    new-instance v1, Ly30;

    .line 1083
    .line 1084
    invoke-direct {v1, p1, v8, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1085
    .line 1086
    .line 1087
    new-instance p1, Lef;

    .line 1088
    .line 1089
    invoke-direct {p1, v5, p0}, Lef;-><init>(ILjava/lang/Object;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-static {v1, p1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 1093
    .line 1094
    .line 1095
    move-result-object p0

    .line 1096
    invoke-static {p0}, Lus1;->υ(Lss1;)Lcu;

    .line 1097
    .line 1098
    .line 1099
    move-result-object p0

    .line 1100
    invoke-virtual {p0}, Lcu;->iterator()Ljava/util/Iterator;

    .line 1101
    .line 1102
    .line 1103
    move-result-object p0

    .line 1104
    :goto_15
    move-object p1, p0

    .line 1105
    check-cast p1, Lσ;

    .line 1106
    .line 1107
    invoke-virtual {p1}, Lσ;->hasNext()Z

    .line 1108
    .line 1109
    .line 1110
    move-result v0

    .line 1111
    if-eqz v0, :cond_31

    .line 1112
    .line 1113
    invoke-virtual {p1}, Lσ;->next()Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object p1

    .line 1117
    check-cast p1, Landroid/widget/FrameLayout;

    .line 1118
    .line 1119
    sget-object v0, Ljm;->α:Ljm;

    .line 1120
    .line 1121
    invoke-static {p1}, Ljm;->δ(Landroid/view/View;)V

    .line 1122
    .line 1123
    .line 1124
    goto :goto_15

    .line 1125
    :cond_31
    :goto_16
    return-void

    .line 1126
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1127
    .line 1128
    .line 1129
    sget-object p0, Ldm;->α:Ldm;

    .line 1130
    .line 1131
    invoke-static {v2}, Ldm;->ε(Ljava/lang/String;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result p0

    .line 1135
    if-eqz p0, :cond_32

    .line 1136
    .line 1137
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1138
    .line 1139
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 1140
    .line 1141
    .line 1142
    :cond_32
    return-void

    .line 1143
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    sget-object p0, Ldm;->α:Ldm;

    .line 1147
    .line 1148
    invoke-static {v2}, Ldm;->ε(Ljava/lang/String;)Z

    .line 1149
    .line 1150
    .line 1151
    move-result p0

    .line 1152
    if-nez p0, :cond_33

    .line 1153
    .line 1154
    goto :goto_17

    .line 1155
    :cond_33
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 1156
    .line 1157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    invoke-static {v8, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object p0

    .line 1164
    instance-of v0, p0, Ljava/lang/String;

    .line 1165
    .line 1166
    if-eqz v0, :cond_34

    .line 1167
    .line 1168
    move-object v10, p0

    .line 1169
    check-cast v10, Ljava/lang/String;

    .line 1170
    .line 1171
    :cond_34
    if-nez v10, :cond_35

    .line 1172
    .line 1173
    goto :goto_17

    .line 1174
    :cond_35
    const-string p0, "comment_kmp_panel_exp_key"

    .line 1175
    .line 1176
    invoke-virtual {v10, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result p0

    .line 1180
    if-eqz p0, :cond_36

    .line 1181
    .line 1182
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1183
    .line 1184
    .line 1185
    move-result-object p0

    .line 1186
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    :cond_36
    :goto_17
    return-void

    .line 1190
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    sget-object p0, Ldm;->α:Ldm;

    .line 1194
    .line 1195
    invoke-static {v1}, Ldm;->ε(Ljava/lang/String;)Z

    .line 1196
    .line 1197
    .line 1198
    move-result p0

    .line 1199
    if-nez p0, :cond_37

    .line 1200
    .line 1201
    goto :goto_18

    .line 1202
    :cond_37
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1203
    .line 1204
    instance-of p1, p0, Landroid/view/View;

    .line 1205
    .line 1206
    if-eqz p1, :cond_38

    .line 1207
    .line 1208
    move-object v10, p0

    .line 1209
    check-cast v10, Landroid/view/View;

    .line 1210
    .line 1211
    :cond_38
    if-nez v10, :cond_39

    .line 1212
    .line 1213
    goto :goto_18

    .line 1214
    :cond_39
    sget-object p0, Lgm;->α:Ljava/util/Map;

    .line 1215
    .line 1216
    invoke-interface {p0, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result p0

    .line 1220
    if-nez p0, :cond_3a

    .line 1221
    .line 1222
    goto :goto_18

    .line 1223
    :cond_3a
    invoke-static {v10}, Lgm;->α(Landroid/view/View;)V

    .line 1224
    .line 1225
    .line 1226
    :goto_18
    return-void

    .line 1227
    :pswitch_14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1228
    .line 1229
    .line 1230
    sget-object p0, Ldm;->α:Ldm;

    .line 1231
    .line 1232
    invoke-static {v1}, Ldm;->ε(Ljava/lang/String;)Z

    .line 1233
    .line 1234
    .line 1235
    move-result p0

    .line 1236
    if-nez p0, :cond_3b

    .line 1237
    .line 1238
    goto/16 :goto_23

    .line 1239
    .line 1240
    :cond_3b
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1241
    .line 1242
    if-nez p0, :cond_3c

    .line 1243
    .line 1244
    goto/16 :goto_23

    .line 1245
    .line 1246
    :cond_3c
    sget-object p1, Lgm;->α:Ljava/util/Map;

    .line 1247
    .line 1248
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    move-result-object p1

    .line 1252
    :goto_19
    if-eqz p1, :cond_41

    .line 1253
    .line 1254
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1255
    .line 1256
    .line 1257
    move-result v0

    .line 1258
    if-nez v0, :cond_41

    .line 1259
    .line 1260
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1265
    .line 1266
    .line 1267
    new-instance v1, Ljava/util/ArrayList;

    .line 1268
    .line 1269
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1270
    .line 1271
    .line 1272
    array-length v2, v0

    .line 1273
    move v4, v9

    .line 1274
    :goto_1a
    if-ge v4, v2, :cond_3e

    .line 1275
    .line 1276
    aget-object v5, v0, v4

    .line 1277
    .line 1278
    const-class v6, Landroid/view/ViewGroup;

    .line 1279
    .line 1280
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v7

    .line 1284
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v6

    .line 1288
    if-eqz v6, :cond_3d

    .line 1289
    .line 1290
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1291
    .line 1292
    .line 1293
    :cond_3d
    add-int/lit8 v4, v4, 0x1

    .line 1294
    .line 1295
    goto :goto_1a

    .line 1296
    :cond_3e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v0

    .line 1300
    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1301
    .line 1302
    .line 1303
    move-result v2

    .line 1304
    if-eqz v2, :cond_3f

    .line 1305
    .line 1306
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v2

    .line 1310
    check-cast v2, Ljava/lang/reflect/Field;

    .line 1311
    .line 1312
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1313
    .line 1314
    .line 1315
    goto :goto_1b

    .line 1316
    :cond_3f
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1317
    .line 1318
    .line 1319
    move-result v0

    .line 1320
    if-nez v0, :cond_40

    .line 1321
    .line 1322
    goto :goto_1c

    .line 1323
    :cond_40
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 1324
    .line 1325
    .line 1326
    move-result-object p1

    .line 1327
    goto :goto_19

    .line 1328
    :cond_41
    sget-object v1, Ljz;->ε:Ljz;

    .line 1329
    .line 1330
    :goto_1c
    new-instance p1, Ljava/util/ArrayList;

    .line 1331
    .line 1332
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1333
    .line 1334
    .line 1335
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    :cond_42
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1340
    .line 1341
    .line 1342
    move-result v0

    .line 1343
    if-eqz v0, :cond_45

    .line 1344
    .line 1345
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v0

    .line 1349
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1350
    .line 1351
    :try_start_3
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 1356
    .line 1357
    if-eqz v2, :cond_43

    .line 1358
    .line 1359
    check-cast v0, Landroid/view/ViewGroup;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1360
    .line 1361
    goto :goto_1f

    .line 1362
    :catchall_3
    move-exception v0

    .line 1363
    goto :goto_1e

    .line 1364
    :cond_43
    move-object v0, v10

    .line 1365
    goto :goto_1f

    .line 1366
    :goto_1e
    new-instance v2, Leo1;

    .line 1367
    .line 1368
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1369
    .line 1370
    .line 1371
    move-object v0, v2

    .line 1372
    :goto_1f
    instance-of v2, v0, Leo1;

    .line 1373
    .line 1374
    if-eqz v2, :cond_44

    .line 1375
    .line 1376
    move-object v0, v10

    .line 1377
    :cond_44
    check-cast v0, Landroid/view/ViewGroup;

    .line 1378
    .line 1379
    if-eqz v0, :cond_42

    .line 1380
    .line 1381
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1382
    .line 1383
    .line 1384
    goto :goto_1d

    .line 1385
    :cond_45
    invoke-static {p1}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1386
    .line 1387
    .line 1388
    move-result-object p1

    .line 1389
    invoke-static {p1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1390
    .line 1391
    .line 1392
    move-result-object p1

    .line 1393
    invoke-static {p1}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v0

    .line 1397
    check-cast v0, Landroid/view/ViewGroup;

    .line 1398
    .line 1399
    if-nez v0, :cond_4b

    .line 1400
    .line 1401
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v0

    .line 1405
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1406
    .line 1407
    .line 1408
    move-result v1

    .line 1409
    if-eqz v1, :cond_4a

    .line 1410
    .line 1411
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v1

    .line 1415
    move-object v2, v1

    .line 1416
    check-cast v2, Landroid/view/ViewGroup;

    .line 1417
    .line 1418
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 1419
    .line 1420
    .line 1421
    move-result v3

    .line 1422
    if-eqz v3, :cond_46

    .line 1423
    .line 1424
    goto :goto_22

    .line 1425
    :cond_46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v3

    .line 1429
    :cond_47
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1430
    .line 1431
    .line 1432
    move-result v4

    .line 1433
    if-eqz v4, :cond_49

    .line 1434
    .line 1435
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v4

    .line 1439
    check-cast v4, Landroid/view/ViewGroup;

    .line 1440
    .line 1441
    if-eq v4, v2, :cond_47

    .line 1442
    .line 1443
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v5

    .line 1447
    :goto_21
    instance-of v6, v5, Landroid/view/View;

    .line 1448
    .line 1449
    if-eqz v6, :cond_47

    .line 1450
    .line 1451
    if-ne v5, v4, :cond_48

    .line 1452
    .line 1453
    goto :goto_20

    .line 1454
    :cond_48
    check-cast v5, Landroid/view/View;

    .line 1455
    .line 1456
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v5

    .line 1460
    goto :goto_21

    .line 1461
    :cond_49
    :goto_22
    move-object v10, v1

    .line 1462
    :cond_4a
    move-object v0, v10

    .line 1463
    check-cast v0, Landroid/view/ViewGroup;

    .line 1464
    .line 1465
    if-nez v0, :cond_4b

    .line 1466
    .line 1467
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1468
    .line 1469
    .line 1470
    move-result-object p0

    .line 1471
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1472
    .line 1473
    .line 1474
    move-result-object p0

    .line 1475
    const-string p1, "comment input container structure mismatch: "

    .line 1476
    .line 1477
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object p0

    .line 1481
    const-string p1, "rd44bdb4944a23356"

    .line 1482
    .line 1483
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1484
    .line 1485
    .line 1486
    goto :goto_23

    .line 1487
    :cond_4b
    invoke-static {v0}, Lgm;->α(Landroid/view/View;)V

    .line 1488
    .line 1489
    .line 1490
    :goto_23
    return-void

    .line 1491
    :pswitch_15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    .line 1493
    .line 1494
    sget-object p0, Lyl;->ι:Ljava/lang/ThreadLocal;

    .line 1495
    .line 1496
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object p0

    .line 1500
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1501
    .line 1502
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1503
    .line 1504
    .line 1505
    move-result p0

    .line 1506
    if-nez p0, :cond_51

    .line 1507
    .line 1508
    sget-object p0, Lyl;->α:Lyl;

    .line 1509
    .line 1510
    invoke-static {}, Lyl;->ζ()Z

    .line 1511
    .line 1512
    .line 1513
    move-result p0

    .line 1514
    if-nez p0, :cond_4c

    .line 1515
    .line 1516
    goto :goto_24

    .line 1517
    :cond_4c
    iget-object p0, p1, Lk01;->β:Ljava/lang/Object;

    .line 1518
    .line 1519
    instance-of p1, p0, Landroid/view/View;

    .line 1520
    .line 1521
    if-eqz p1, :cond_4d

    .line 1522
    .line 1523
    move-object v10, p0

    .line 1524
    check-cast v10, Landroid/view/View;

    .line 1525
    .line 1526
    :cond_4d
    if-nez v10, :cond_4e

    .line 1527
    .line 1528
    goto :goto_24

    .line 1529
    :cond_4e
    sget-object p0, Lyl;->θ:Ljava/util/Map;

    .line 1530
    .line 1531
    invoke-interface {p0, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    move-result p0

    .line 1535
    if-nez p0, :cond_4f

    .line 1536
    .line 1537
    goto :goto_24

    .line 1538
    :cond_4f
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 1539
    .line 1540
    .line 1541
    move-result p0

    .line 1542
    const/16 p1, 0x8

    .line 1543
    .line 1544
    if-ne p0, p1, :cond_50

    .line 1545
    .line 1546
    goto :goto_24

    .line 1547
    :cond_50
    const-string p0, "visibility guard"

    .line 1548
    .line 1549
    invoke-static {v10, p0}, Lyl;->δ(Landroid/view/View;Ljava/lang/String;)V

    .line 1550
    .line 1551
    .line 1552
    :cond_51
    :goto_24
    return-void

    .line 1553
    :pswitch_16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1554
    .line 1555
    .line 1556
    sget-object p0, Lyl;->α:Lyl;

    .line 1557
    .line 1558
    invoke-static {}, Lyl;->ζ()Z

    .line 1559
    .line 1560
    .line 1561
    move-result p0

    .line 1562
    if-nez p0, :cond_52

    .line 1563
    .line 1564
    invoke-static {}, Lyl;->ξ()V

    .line 1565
    .line 1566
    .line 1567
    goto :goto_27

    .line 1568
    :cond_52
    new-instance p0, Ljava/lang/Throwable;

    .line 1569
    .line 1570
    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    .line 1571
    .line 1572
    .line 1573
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 1574
    .line 1575
    .line 1576
    move-result-object p0

    .line 1577
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1578
    .line 1579
    .line 1580
    array-length v0, p0

    .line 1581
    :goto_25
    if-ge v9, v0, :cond_57

    .line 1582
    .line 1583
    aget-object v1, p0, v9

    .line 1584
    .line 1585
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v2

    .line 1589
    const-string v3, "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"

    .line 1590
    .line 1591
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v3

    .line 1595
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1596
    .line 1597
    .line 1598
    move-result v2

    .line 1599
    if-nez v2, :cond_54

    .line 1600
    .line 1601
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v1

    .line 1605
    const-string v2, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"

    .line 1606
    .line 1607
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v2

    .line 1611
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1612
    .line 1613
    .line 1614
    move-result v1

    .line 1615
    if-eqz v1, :cond_53

    .line 1616
    .line 1617
    goto :goto_26

    .line 1618
    :cond_53
    add-int/lit8 v9, v9, 0x1

    .line 1619
    .line 1620
    goto :goto_25

    .line 1621
    :cond_54
    :goto_26
    iget-object p0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 1622
    .line 1623
    instance-of p1, p0, Landroid/view/View;

    .line 1624
    .line 1625
    if-eqz p1, :cond_55

    .line 1626
    .line 1627
    move-object v10, p0

    .line 1628
    check-cast v10, Landroid/view/View;

    .line 1629
    .line 1630
    :cond_55
    if-nez v10, :cond_56

    .line 1631
    .line 1632
    goto :goto_27

    .line 1633
    :cond_56
    const-string p0, "ViewStub.inflate"

    .line 1634
    .line 1635
    invoke-static {v10, p0}, Lyl;->α(Landroid/view/View;Ljava/lang/String;)V

    .line 1636
    .line 1637
    .line 1638
    :cond_57
    :goto_27
    return-void

    .line 1639
    :pswitch_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1640
    .line 1641
    .line 1642
    sget-object p0, Lyl;->ι:Ljava/lang/ThreadLocal;

    .line 1643
    .line 1644
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1649
    .line 1650
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1651
    .line 1652
    .line 1653
    move-result v0

    .line 1654
    if-nez v0, :cond_6d

    .line 1655
    .line 1656
    sget-object v0, Lyl;->α:Lyl;

    .line 1657
    .line 1658
    invoke-static {}, Lyl;->ζ()Z

    .line 1659
    .line 1660
    .line 1661
    move-result v0

    .line 1662
    if-nez v0, :cond_58

    .line 1663
    .line 1664
    goto/16 :goto_37

    .line 1665
    .line 1666
    :cond_58
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 1667
    .line 1668
    if-nez p1, :cond_59

    .line 1669
    .line 1670
    goto/16 :goto_37

    .line 1671
    .line 1672
    :cond_59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    new-instance v1, Ljava/util/ArrayList;

    .line 1677
    .line 1678
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1679
    .line 1680
    .line 1681
    :goto_28
    if-eqz v0, :cond_5a

    .line 1682
    .line 1683
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v2

    .line 1687
    if-nez v2, :cond_5a

    .line 1688
    .line 1689
    invoke-static {v0, v1}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    goto :goto_28

    .line 1694
    :cond_5a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v0

    .line 1698
    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1699
    .line 1700
    .line 1701
    move-result v2

    .line 1702
    if-eqz v2, :cond_5b

    .line 1703
    .line 1704
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v2

    .line 1708
    check-cast v2, Ljava/lang/reflect/Field;

    .line 1709
    .line 1710
    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1711
    .line 1712
    .line 1713
    goto :goto_29

    .line 1714
    :cond_5b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v2

    .line 1718
    :cond_5c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1719
    .line 1720
    .line 1721
    move-result v0

    .line 1722
    if-eqz v0, :cond_60

    .line 1723
    .line 1724
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v0

    .line 1728
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1729
    .line 1730
    :try_start_4
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1731
    .line 1732
    .line 1733
    move-result-object v0

    .line 1734
    instance-of v3, v0, Landroid/view/View;

    .line 1735
    .line 1736
    if-eqz v3, :cond_5d

    .line 1737
    .line 1738
    check-cast v0, Landroid/view/View;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1739
    .line 1740
    goto :goto_2b

    .line 1741
    :catchall_4
    move-exception v0

    .line 1742
    goto :goto_2a

    .line 1743
    :cond_5d
    move-object v0, v10

    .line 1744
    goto :goto_2b

    .line 1745
    :goto_2a
    new-instance v3, Leo1;

    .line 1746
    .line 1747
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1748
    .line 1749
    .line 1750
    move-object v0, v3

    .line 1751
    :goto_2b
    instance-of v3, v0, Leo1;

    .line 1752
    .line 1753
    if-eqz v3, :cond_5e

    .line 1754
    .line 1755
    move-object v0, v10

    .line 1756
    :cond_5e
    move-object v7, v0

    .line 1757
    check-cast v7, Landroid/view/View;

    .line 1758
    .line 1759
    if-eqz v7, :cond_5f

    .line 1760
    .line 1761
    instance-of v0, v7, Landroid/widget/LinearLayout;

    .line 1762
    .line 1763
    if-eqz v0, :cond_5f

    .line 1764
    .line 1765
    new-instance v0, Lum1;

    .line 1766
    .line 1767
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1768
    .line 1769
    .line 1770
    new-instance v6, Lvl;

    .line 1771
    .line 1772
    invoke-direct {v6, v0, v9}, Lvl;-><init>(Lum1;I)V

    .line 1773
    .line 1774
    .line 1775
    new-instance v3, Lsm1;

    .line 1776
    .line 1777
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1778
    .line 1779
    .line 1780
    const/4 v8, 0x0

    .line 1781
    const/16 v4, 0x200

    .line 1782
    .line 1783
    const/16 v5, 0xc

    .line 1784
    .line 1785
    invoke-static/range {v3 .. v8}, Lyl;->ο(Lsm1;IILa80;Landroid/view/View;I)V

    .line 1786
    .line 1787
    .line 1788
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 1789
    .line 1790
    check-cast v0, Landroid/widget/TextView;

    .line 1791
    .line 1792
    if-eqz v0, :cond_5f

    .line 1793
    .line 1794
    goto :goto_2c

    .line 1795
    :cond_5f
    move-object v7, v10

    .line 1796
    :goto_2c
    if-eqz v7, :cond_5c

    .line 1797
    .line 1798
    goto :goto_2d

    .line 1799
    :cond_60
    move-object v7, v10

    .line 1800
    :goto_2d
    new-instance v2, Ljava/util/ArrayList;

    .line 1801
    .line 1802
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1803
    .line 1804
    .line 1805
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v3

    .line 1809
    :cond_61
    :goto_2e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1810
    .line 1811
    .line 1812
    move-result v0

    .line 1813
    if-eqz v0, :cond_64

    .line 1814
    .line 1815
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v0

    .line 1819
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1820
    .line 1821
    :try_start_5
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    instance-of v4, v0, Landroid/widget/LinearLayout;

    .line 1826
    .line 1827
    if-eqz v4, :cond_62

    .line 1828
    .line 1829
    check-cast v0, Landroid/widget/LinearLayout;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1830
    .line 1831
    goto :goto_30

    .line 1832
    :catchall_5
    move-exception v0

    .line 1833
    goto :goto_2f

    .line 1834
    :cond_62
    move-object v0, v10

    .line 1835
    goto :goto_30

    .line 1836
    :goto_2f
    new-instance v4, Leo1;

    .line 1837
    .line 1838
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1839
    .line 1840
    .line 1841
    move-object v0, v4

    .line 1842
    :goto_30
    instance-of v4, v0, Leo1;

    .line 1843
    .line 1844
    if-eqz v4, :cond_63

    .line 1845
    .line 1846
    move-object v0, v10

    .line 1847
    :cond_63
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1848
    .line 1849
    if-eqz v0, :cond_61

    .line 1850
    .line 1851
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1852
    .line 1853
    .line 1854
    goto :goto_2e

    .line 1855
    :cond_64
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v1

    .line 1859
    :cond_65
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v0

    .line 1863
    if-eqz v0, :cond_69

    .line 1864
    .line 1865
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v0

    .line 1869
    check-cast v0, Ljava/lang/reflect/Field;

    .line 1870
    .line 1871
    :try_start_6
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    instance-of v3, v0, Landroid/view/View;

    .line 1876
    .line 1877
    if-eqz v3, :cond_66

    .line 1878
    .line 1879
    check-cast v0, Landroid/view/View;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1880
    .line 1881
    goto :goto_32

    .line 1882
    :catchall_6
    move-exception v0

    .line 1883
    goto :goto_31

    .line 1884
    :cond_66
    move-object v0, v10

    .line 1885
    goto :goto_32

    .line 1886
    :goto_31
    new-instance v3, Leo1;

    .line 1887
    .line 1888
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1889
    .line 1890
    .line 1891
    move-object v0, v3

    .line 1892
    :goto_32
    instance-of v3, v0, Leo1;

    .line 1893
    .line 1894
    if-eqz v3, :cond_67

    .line 1895
    .line 1896
    move-object v0, v10

    .line 1897
    :cond_67
    check-cast v0, Landroid/view/View;

    .line 1898
    .line 1899
    if-eqz v0, :cond_68

    .line 1900
    .line 1901
    invoke-static {v0}, Lyl;->θ(Landroid/view/View;)Z

    .line 1902
    .line 1903
    .line 1904
    move-result v3

    .line 1905
    if-eqz v3, :cond_68

    .line 1906
    .line 1907
    goto :goto_33

    .line 1908
    :cond_68
    move-object v0, v10

    .line 1909
    :goto_33
    if-eqz v0, :cond_65

    .line 1910
    .line 1911
    move-object v10, v0

    .line 1912
    :cond_69
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1913
    .line 1914
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 1915
    .line 1916
    .line 1917
    if-eqz v10, :cond_6b

    .line 1918
    .line 1919
    :try_start_7
    instance-of p1, v10, Landroid/widget/Checkable;

    .line 1920
    .line 1921
    if-eqz p1, :cond_6a

    .line 1922
    .line 1923
    move-object p1, v10

    .line 1924
    check-cast p1, Landroid/widget/Checkable;

    .line 1925
    .line 1926
    invoke-interface {p1, v9}, Landroid/widget/Checkable;->setChecked(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 1927
    .line 1928
    .line 1929
    goto :goto_34

    .line 1930
    :cond_6a
    :try_start_8
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1931
    .line 1932
    .line 1933
    move-result-object p1

    .line 1934
    const-string v0, "setChecked"

    .line 1935
    .line 1936
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1937
    .line 1938
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v1

    .line 1942
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1943
    .line 1944
    .line 1945
    move-result-object p1

    .line 1946
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1947
    .line 1948
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v0

    .line 1952
    invoke-virtual {p1, v10, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 1953
    .line 1954
    .line 1955
    :catchall_7
    :cond_6b
    :goto_34
    if-eqz v10, :cond_6c

    .line 1956
    .line 1957
    :try_start_9
    invoke-virtual {v10, v9}, Landroid/view/View;->setSelected(Z)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 1958
    .line 1959
    .line 1960
    goto :goto_35

    .line 1961
    :catchall_8
    move-exception v0

    .line 1962
    move-object p1, v0

    .line 1963
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 1964
    .line 1965
    .line 1966
    throw p1

    .line 1967
    :cond_6c
    :goto_35
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 1968
    .line 1969
    .line 1970
    invoke-static {v7}, Lyh;->в(Ljava/lang/Object;)Ljava/util/List;

    .line 1971
    .line 1972
    .line 1973
    move-result-object p0

    .line 1974
    invoke-static {v2, p0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1975
    .line 1976
    .line 1977
    move-result-object p0

    .line 1978
    invoke-static {p0}, Lxh;->ｉ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1979
    .line 1980
    .line 1981
    move-result-object p0

    .line 1982
    invoke-static {p0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1983
    .line 1984
    .line 1985
    move-result-object p0

    .line 1986
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1987
    .line 1988
    .line 1989
    move-result-object p0

    .line 1990
    :goto_36
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1991
    .line 1992
    .line 1993
    move-result p1

    .line 1994
    if-eqz p1, :cond_6d

    .line 1995
    .line 1996
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1997
    .line 1998
    .line 1999
    move-result-object p1

    .line 2000
    check-cast p1, Landroid/view/View;

    .line 2001
    .line 2002
    const-string v0, "publish preview method"

    .line 2003
    .line 2004
    invoke-static {p1, v0}, Lyl;->δ(Landroid/view/View;Ljava/lang/String;)V

    .line 2005
    .line 2006
    .line 2007
    goto :goto_36

    .line 2008
    :cond_6d
    :goto_37
    return-void

    .line 2009
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 10

    .line 1
    iget v0, p0, Lxl;->α:I

    .line 2
    .line 3
    const-string v1, "hide_comment_related_search_enabled"

    .line 4
    .line 5
    const-wide/32 v2, 0x493e0

    .line 6
    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const-string v5, "re42d48bb5ac13a6f"

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :sswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v7, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of v0, p0, Landroid/view/MotionEvent;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    check-cast p0, Landroid/view/MotionEvent;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p0, v8

    .line 41
    :goto_0
    sget-object v0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    .line 43
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 44
    .line 45
    const-string v1, "primary"

    .line 46
    .line 47
    invoke-static {v0, p0, v1, v7}, Lg10;->α(Ljava/lang/Object;Landroid/view/MotionEvent;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :sswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 61
    .line 62
    invoke-static {}, Ld00;->β()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    sget-object p1, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    const-wide/16 v2, 0x0

    .line 75
    .line 76
    cmp-long p1, v0, v2

    .line 77
    .line 78
    if-lez p1, :cond_2

    .line 79
    .line 80
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    cmp-long p1, v2, v0

    .line 85
    .line 86
    if-gtz p1, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    const-string p1, "key_ads_force_reward"

    .line 90
    .line 91
    invoke-static {p1, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {p0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    aput-object p1, p0, v7

    .line 116
    .line 117
    :cond_4
    :goto_2
    return-void

    .line 118
    :sswitch_2
    const-string p0, "LJI"

    .line 119
    .line 120
    const-string v0, "LIZLLL"

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object v1, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 126
    .line 127
    const-string v1, "key_ads_forge_more_reward"

    .line 128
    .line 129
    invoke-static {v1, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_5

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_5
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v6, p1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-nez p1, :cond_6

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_6
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 149
    .line 150
    const-string v1, "LIZ"

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v2, v1}, Lqe0;->κ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1, p1, v6}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 161
    .line 162
    .line 163
    invoke-static {p1, v0}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    instance-of v2, v1, Ljava/lang/String;

    .line 168
    .line 169
    if-eqz v2, :cond_7

    .line 170
    .line 171
    check-cast v1, Ljava/lang/String;

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :catchall_0
    move-exception p0

    .line 175
    goto :goto_5

    .line 176
    :cond_7
    move-object v1, v8

    .line 177
    :goto_3
    if-eqz v1, :cond_8

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_9

    .line 184
    .line 185
    :cond_8
    const-string v1, "\u989d\u5916\u91d1\u5e01\u5956\u52b1"

    .line 186
    .line 187
    invoke-static {v0, p1, v1}, Lqe0;->ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    invoke-static {p1, p0}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    instance-of v1, v0, Ljava/lang/String;

    .line 195
    .line 196
    if-eqz v1, :cond_a

    .line 197
    .line 198
    check-cast v0, Ljava/lang/String;

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_a
    move-object v0, v8

    .line 202
    :goto_4
    if-eqz v0, :cond_b

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_c

    .line 209
    .line 210
    :cond_b
    const-string v0, "\u606d\u559c\u83b7\u5f97\u7ffb\u500d\u6743\u76ca"

    .line 211
    .line 212
    invoke-static {p0, p1, v0}, Lqe0;->ξ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    const-string p1, "\u4e0b\u4e00\u9636\u6bb5\u5956\u52b1\u53c2\u6570\u4fdd\u6301\u539f\u503c: "

    .line 221
    .line 222
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {v5, p0, v8, v4, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_c
    :goto_6
    return-void

    .line 230
    :sswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 234
    .line 235
    sget-object p1, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 236
    .line 237
    invoke-static {}, Ld00;->β()Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-nez p1, :cond_d

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v7, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    instance-of v0, p1, Ljava/lang/Integer;

    .line 252
    .line 253
    if-eqz v0, :cond_e

    .line 254
    .line 255
    check-cast p1, Ljava/lang/Integer;

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_e
    move-object p1, v8

    .line 259
    :goto_7
    if-eqz p1, :cond_12

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    invoke-static {v6, p0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    instance-of v1, v0, Ljava/lang/Integer;

    .line 270
    .line 271
    if-eqz v1, :cond_f

    .line 272
    .line 273
    move-object v8, v0

    .line 274
    check-cast v8, Ljava/lang/Integer;

    .line 275
    .line 276
    :cond_f
    if-eqz v8, :cond_12

    .line 277
    .line 278
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    sget-object v1, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 283
    .line 284
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 285
    .line 286
    .line 287
    move-result-wide v4

    .line 288
    add-long/2addr v4, v2

    .line 289
    invoke-virtual {v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 290
    .line 291
    .line 292
    int-to-long v1, p1

    .line 293
    int-to-long v3, v0

    .line 294
    const-wide/16 v5, 0x1

    .line 295
    .line 296
    cmp-long p1, v3, v5

    .line 297
    .line 298
    if-gez p1, :cond_10

    .line 299
    .line 300
    move-wide v3, v5

    .line 301
    :cond_10
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 302
    .line 303
    .line 304
    move-result-wide v0

    .line 305
    const-wide/32 v2, 0x7fffffff

    .line 306
    .line 307
    .line 308
    cmp-long p1, v0, v2

    .line 309
    .line 310
    if-lez p1, :cond_11

    .line 311
    .line 312
    move-wide v0, v2

    .line 313
    :cond_11
    long-to-int p1, v0

    .line 314
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    aput-object p1, p0, v7

    .line 319
    .line 320
    :cond_12
    :goto_8
    return-void

    .line 321
    :sswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 325
    .line 326
    invoke-static {}, Ld00;->β()Z

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    if-nez p0, :cond_13

    .line 331
    .line 332
    goto/16 :goto_a

    .line 333
    .line 334
    :cond_13
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 335
    .line 336
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 337
    .line 338
    .line 339
    move-result-wide v0

    .line 340
    add-long/2addr v0, v2

    .line 341
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 342
    .line 343
    .line 344
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 345
    .line 346
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-static {p0}, Lg7;->б([Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    sget-object p1, Ld00;->β:Ljava/util/Set;

    .line 354
    .line 355
    const-string v0, "RewardCompleteParams getter Hook \u5df2\u5b89\u88c5: "

    .line 356
    .line 357
    const-string v1, "RewardCompleteParams \u7f3a\u5c11 getWatchTime: "

    .line 358
    .line 359
    if-nez p0, :cond_14

    .line 360
    .line 361
    goto :goto_a

    .line 362
    :cond_14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    if-nez v2, :cond_15

    .line 375
    .line 376
    goto :goto_a

    .line 377
    :cond_15
    :try_start_1
    sget-object v2, Lxq0;->α:Lxq0;

    .line 378
    .line 379
    const-string v3, "getWatchTime"

    .line 380
    .line 381
    new-instance v6, Lxl;

    .line 382
    .line 383
    const/16 v9, 0xf

    .line 384
    .line 385
    invoke-direct {v6, v9, v7}, Lxl;-><init>(IB)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, p0, v3, v6}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-eqz v2, :cond_16

    .line 397
    .line 398
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-static {v5, v0, v8, v4, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    goto :goto_a

    .line 417
    :catchall_1
    move-exception v0

    .line 418
    goto :goto_9

    .line 419
    :cond_16
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v5, v0, v8, v4, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 428
    .line 429
    .line 430
    goto :goto_a

    .line 431
    :goto_9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    invoke-interface {p1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    const-string p1, "RewardCompleteParams getter Hook \u8df3\u8fc7: "

    .line 443
    .line 444
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-static {v5, p0, v8, v4, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :goto_a
    return-void

    .line 452
    :sswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    sget-object p0, Ldm;->α:Ldm;

    .line 456
    .line 457
    invoke-static {v1}, Ldm;->ε(Ljava/lang/String;)Z

    .line 458
    .line 459
    .line 460
    move-result p0

    .line 461
    if-eqz p0, :cond_17

    .line 462
    .line 463
    invoke-virtual {p1, v8}, Lk01;->α(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    :cond_17
    return-void

    .line 467
    :sswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    sget-object p0, Ldm;->α:Ldm;

    .line 471
    .line 472
    invoke-static {v1}, Ldm;->ε(Ljava/lang/String;)Z

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    if-eqz p0, :cond_18

    .line 477
    .line 478
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 479
    .line 480
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    :cond_18
    return-void

    .line 484
    nop

    .line 485
    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_6
        0x8 -> :sswitch_5
        0x10 -> :sswitch_4
        0x11 -> :sswitch_3
        0x14 -> :sswitch_2
        0x15 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method
