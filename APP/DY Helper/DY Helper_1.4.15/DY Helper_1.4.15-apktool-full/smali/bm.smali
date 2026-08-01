.class public final Lbm;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/ClassLoader;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/ClassLoader;Z)V
    .locals 0

    .line 47
    iput p1, p0, Lbm;->α:I

    iput-object p2, p0, Lbm;->β:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lm01;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbm;->α:I

    .line 2
    .line 3
    sparse-switch p2, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p2, Lcm;->α:Ljava/util/Set;

    .line 7
    .line 8
    iput-object p1, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    invoke-direct {p0}, Lm01;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :sswitch_0
    sget-object p2, Lc82;->α:Lc82;

    .line 15
    .line 16
    iput-object p1, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    invoke-direct {p0}, Lm01;-><init>()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_1
    sget-object p2, Lo22;->α:Lo22;

    .line 23
    .line 24
    iput-object p1, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    invoke-direct {p0}, Lm01;-><init>()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :sswitch_2
    sget-object p2, Lsh1;->α:Lsh1;

    .line 31
    .line 32
    iput-object p1, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 33
    .line 34
    invoke-direct {p0}, Lm01;-><init>()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :sswitch_3
    sget-object p2, Lo20;->α:Ljava/util/Set;

    .line 39
    .line 40
    iput-object p1, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    invoke-direct {p0}, Lm01;-><init>()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_3
        0x8 -> :sswitch_2
        0x9 -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lbm;->α:I

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/16 v6, 0xa

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x4

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    :pswitch_0
    invoke-super/range {p0 .. p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v2, Lc82;->α:Lc82;

    .line 27
    .line 28
    iget-object v1, v1, Lk01;->ε:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v0, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :try_start_0
    invoke-virtual {v2, v1, v0}, Lc82;->γ(Ljava/lang/Object;Ljava/lang/ClassLoader;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    new-instance v1, Leo1;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v1

    .line 48
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    sget-object v1, Lc82;->α:Lc82;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "Feed \u89e3\u7801\u7ed3\u679c\u8fc7\u6ee4\u5931\u8d25: "

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lc82;->ο(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_1
    return-void

    .line 78
    :pswitch_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v1, v1, Lk01;->ε:Ljava/lang/Object;

    .line 82
    .line 83
    instance-of v2, v1, Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    move-object v10, v1

    .line 88
    check-cast v10, Ljava/lang/String;

    .line 89
    .line 90
    :cond_2
    if-nez v10, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-static {v10, v6}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-eqz v1, :cond_7

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v1

    .line 103
    const-wide/16 v3, 0x0

    .line 104
    .line 105
    cmp-long v5, v1, v3

    .line 106
    .line 107
    if-gtz v5, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    sget-wide v5, Le72;->α:J

    .line 111
    .line 112
    cmp-long v3, v5, v3

    .line 113
    .line 114
    if-gtz v3, :cond_5

    .line 115
    .line 116
    const-string v0, "User.getUid()"

    .line 117
    .line 118
    invoke-static {v1, v2, v0}, Le72;->β(JLjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    sget-wide v3, Le72;->α:J

    .line 123
    .line 124
    cmp-long v1, v1, v3

    .line 125
    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    sget-object v1, Le72;->γ:Ljava/util/ArrayList;

    .line 129
    .line 130
    iget-object v0, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    sget-wide v3, Le72;->β:J

    .line 137
    .line 138
    sub-long v3, v1, v3

    .line 139
    .line 140
    const-wide/16 v5, 0x5dc

    .line 141
    .line 142
    cmp-long v3, v3, v5

    .line 143
    .line 144
    if-gez v3, :cond_6

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    sput-wide v1, Le72;->β:J

    .line 148
    .line 149
    new-instance v1, Ljava/lang/Thread;

    .line 150
    .line 151
    new-instance v2, Loj;

    .line 152
    .line 153
    const/16 v3, 0x9

    .line 154
    .line 155
    invoke-direct {v2, v0, v3}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 156
    .line 157
    .line 158
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 162
    .line 163
    .line 164
    :cond_7
    :goto_2
    return-void

    .line 165
    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v1, Ljava/lang/Thread;

    .line 169
    .line 170
    iget-object v0, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 171
    .line 172
    new-instance v2, Loj;

    .line 173
    .line 174
    invoke-direct {v2, v0, v6}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 175
    .line 176
    .line 177
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget-object v1, v1, Lk01;->ε:Ljava/lang/Object;

    .line 188
    .line 189
    if-nez v1, :cond_8

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_8
    sget-object v2, Lo22;->α:Lo22;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iget-object v0, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 199
    .line 200
    sget-object v2, Lo22;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_9

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_9
    sget-object v2, Lo22;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-nez v2, :cond_a

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_a
    sget-object v2, Lo22;->χ:Landroid/os/Handler;

    .line 227
    .line 228
    new-instance v3, Lii0;

    .line 229
    .line 230
    const/16 v4, 0x1b

    .line 231
    .line 232
    invoke-direct {v3, v1, v4, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 236
    .line 237
    .line 238
    :goto_3
    return-void

    .line 239
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    sget-object v2, Lsh1;->α:Lsh1;

    .line 243
    .line 244
    iget-object v2, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 245
    .line 246
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 247
    .line 248
    const-string v0, "auto_scroll_next_enabled"

    .line 249
    .line 250
    invoke-static {v0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    const-string v0, "auto_pause_on_complete_enabled"

    .line 255
    .line 256
    invoke-static {v0, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    if-nez v6, :cond_b

    .line 261
    .line 262
    if-nez v11, :cond_b

    .line 263
    .line 264
    goto/16 :goto_12

    .line 265
    .line 266
    :cond_b
    sget-object v0, Lt7;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 267
    .line 268
    sget-object v0, Lt7;->γ:Lm7;

    .line 269
    .line 270
    if-nez v0, :cond_c

    .line 271
    .line 272
    move v0, v4

    .line 273
    goto :goto_4

    .line 274
    :cond_c
    sget-object v12, Ls7;->α:[I

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    aget v0, v12, v0

    .line 281
    .line 282
    :goto_4
    if-eq v0, v4, :cond_f

    .line 283
    .line 284
    if-eq v0, v7, :cond_e

    .line 285
    .line 286
    if-eq v0, v8, :cond_e

    .line 287
    .line 288
    if-eq v0, v3, :cond_f

    .line 289
    .line 290
    if-ne v0, v9, :cond_d

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_d
    invoke-static {}, Lγ;->κ()V

    .line 294
    .line 295
    .line 296
    goto/16 :goto_12

    .line 297
    .line 298
    :cond_e
    const-string v0, "ignore play completed for non-video selection"

    .line 299
    .line 300
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_12

    .line 304
    .line 305
    :cond_f
    :goto_5
    if-nez v1, :cond_10

    .line 306
    .line 307
    goto/16 :goto_d

    .line 308
    .line 309
    :cond_10
    move v0, v5

    .line 310
    :goto_6
    array-length v3, v1

    .line 311
    if-ge v0, v3, :cond_12

    .line 312
    .line 313
    add-int/lit8 v3, v0, 0x1

    .line 314
    .line 315
    :try_start_1
    aget-object v0, v1, v0
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 316
    .line 317
    instance-of v4, v0, Ljava/lang/String;

    .line 318
    .line 319
    if-eqz v4, :cond_11

    .line 320
    .line 321
    move-object v4, v0

    .line 322
    check-cast v4, Ljava/lang/CharSequence;

    .line 323
    .line 324
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-nez v4, :cond_11

    .line 329
    .line 330
    move-object v10, v0

    .line 331
    check-cast v10, Ljava/lang/String;

    .line 332
    .line 333
    goto/16 :goto_d

    .line 334
    .line 335
    :cond_11
    move v0, v3

    .line 336
    goto :goto_6

    .line 337
    :catch_0
    move-exception v0

    .line 338
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v1

    .line 348
    :cond_12
    move v0, v5

    .line 349
    :goto_7
    array-length v3, v1

    .line 350
    if-ge v0, v3, :cond_1d

    .line 351
    .line 352
    add-int/lit8 v3, v0, 0x1

    .line 353
    .line 354
    :try_start_2
    aget-object v4, v1, v0
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 355
    .line 356
    if-nez v4, :cond_14

    .line 357
    .line 358
    :cond_13
    :goto_8
    move v0, v3

    .line 359
    goto :goto_7

    .line 360
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    const-string v8, "Param"

    .line 369
    .line 370
    invoke-static {v0, v8, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-nez v8, :cond_15

    .line 375
    .line 376
    const-string v8, "Completed"

    .line 377
    .line 378
    invoke-static {v0, v8, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    if-nez v8, :cond_15

    .line 383
    .line 384
    const-string v8, "Play"

    .line 385
    .line 386
    invoke-static {v0, v8, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-nez v0, :cond_15

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_15
    const-string v0, "getAwemeId"

    .line 394
    .line 395
    const-string v8, "getAid"

    .line 396
    .line 397
    const-string v12, "getId"

    .line 398
    .line 399
    const-string v13, "getVideoId"

    .line 400
    .line 401
    filled-new-array {v0, v8, v12, v13}, [Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    :cond_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_18

    .line 418
    .line 419
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Ljava/lang/String;

    .line 424
    .line 425
    :try_start_3
    new-array v12, v5, [Ljava/lang/Object;

    .line 426
    .line 427
    invoke-static {v4, v0, v12}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 431
    goto :goto_9

    .line 432
    :catchall_1
    move-exception v0

    .line 433
    new-instance v12, Leo1;

    .line 434
    .line 435
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 436
    .line 437
    .line 438
    move-object v0, v12

    .line 439
    :goto_9
    instance-of v12, v0, Leo1;

    .line 440
    .line 441
    if-eqz v12, :cond_17

    .line 442
    .line 443
    move-object v0, v10

    .line 444
    :cond_17
    instance-of v12, v0, Ljava/lang/String;

    .line 445
    .line 446
    if-eqz v12, :cond_16

    .line 447
    .line 448
    move-object v12, v0

    .line 449
    check-cast v12, Ljava/lang/CharSequence;

    .line 450
    .line 451
    invoke-static {v12}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 452
    .line 453
    .line 454
    move-result v12

    .line 455
    if-nez v12, :cond_16

    .line 456
    .line 457
    move-object v10, v0

    .line 458
    check-cast v10, Ljava/lang/String;

    .line 459
    .line 460
    goto :goto_d

    .line 461
    :cond_18
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 466
    .line 467
    .line 468
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 469
    goto :goto_a

    .line 470
    :catchall_2
    move-exception v0

    .line 471
    new-instance v8, Leo1;

    .line 472
    .line 473
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 474
    .line 475
    .line 476
    move-object v0, v8

    .line 477
    :goto_a
    instance-of v8, v0, Leo1;

    .line 478
    .line 479
    if-eqz v8, :cond_19

    .line 480
    .line 481
    move-object v0, v10

    .line 482
    :cond_19
    move-object v8, v0

    .line 483
    check-cast v8, [Ljava/lang/reflect/Field;

    .line 484
    .line 485
    if-nez v8, :cond_1a

    .line 486
    .line 487
    goto/16 :goto_8

    .line 488
    .line 489
    :cond_1a
    array-length v12, v8

    .line 490
    move v13, v5

    .line 491
    :goto_b
    if-ge v13, v12, :cond_13

    .line 492
    .line 493
    aget-object v0, v8, v13

    .line 494
    .line 495
    :try_start_5
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 502
    goto :goto_c

    .line 503
    :catchall_3
    move-exception v0

    .line 504
    new-instance v14, Leo1;

    .line 505
    .line 506
    invoke-direct {v14, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 507
    .line 508
    .line 509
    move-object v0, v14

    .line 510
    :goto_c
    instance-of v14, v0, Leo1;

    .line 511
    .line 512
    if-eqz v14, :cond_1b

    .line 513
    .line 514
    move-object v0, v10

    .line 515
    :cond_1b
    instance-of v14, v0, Ljava/lang/String;

    .line 516
    .line 517
    if-eqz v14, :cond_1c

    .line 518
    .line 519
    move-object v14, v0

    .line 520
    check-cast v14, Ljava/lang/CharSequence;

    .line 521
    .line 522
    invoke-static {v14}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 523
    .line 524
    .line 525
    move-result v14

    .line 526
    if-nez v14, :cond_1c

    .line 527
    .line 528
    move-object v10, v0

    .line 529
    check-cast v10, Ljava/lang/String;

    .line 530
    .line 531
    goto :goto_d

    .line 532
    :cond_1c
    add-int/lit8 v13, v13, 0x1

    .line 533
    .line 534
    goto :goto_b

    .line 535
    :catch_1
    move-exception v0

    .line 536
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 537
    .line 538
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    throw v1

    .line 546
    :cond_1d
    :goto_d
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 547
    .line 548
    .line 549
    move-result-wide v0

    .line 550
    sget-object v3, Lsh1;->μ:Ljava/lang/Object;

    .line 551
    .line 552
    monitor-enter v3

    .line 553
    :try_start_6
    sget-wide v12, Lsh1;->ν:J

    .line 554
    .line 555
    sub-long v12, v0, v12

    .line 556
    .line 557
    const-wide/16 v14, 0x4b0

    .line 558
    .line 559
    cmp-long v4, v12, v14

    .line 560
    .line 561
    if-gez v4, :cond_1e

    .line 562
    .line 563
    move v4, v7

    .line 564
    goto :goto_e

    .line 565
    :cond_1e
    move v4, v5

    .line 566
    :goto_e
    if-eqz v10, :cond_1f

    .line 567
    .line 568
    sget-object v8, Lsh1;->ξ:Ljava/lang/String;

    .line 569
    .line 570
    invoke-virtual {v10, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v8

    .line 574
    if-eqz v8, :cond_1f

    .line 575
    .line 576
    goto :goto_f

    .line 577
    :catchall_4
    move-exception v0

    .line 578
    goto :goto_13

    .line 579
    :cond_1f
    move v7, v5

    .line 580
    :goto_f
    if-eqz v4, :cond_21

    .line 581
    .line 582
    if-nez v7, :cond_20

    .line 583
    .line 584
    if-eqz v10, :cond_20

    .line 585
    .line 586
    sget-object v4, Lsh1;->ξ:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 587
    .line 588
    if-nez v4, :cond_21

    .line 589
    .line 590
    :cond_20
    monitor-exit v3

    .line 591
    goto :goto_12

    .line 592
    :cond_21
    :try_start_7
    sput-wide v0, Lsh1;->ν:J

    .line 593
    .line 594
    sput-object v10, Lsh1;->ξ:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 595
    .line 596
    monitor-exit v3

    .line 597
    sget-object v0, Lsh1;->η:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v11, :cond_23

    .line 604
    .line 605
    if-eqz v6, :cond_22

    .line 606
    .line 607
    sget-object v1, Lsh1;->β:Landroid/os/Handler;

    .line 608
    .line 609
    new-instance v3, Loj;

    .line 610
    .line 611
    const/16 v4, 0x8

    .line 612
    .line 613
    invoke-direct {v3, v2, v4}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 617
    .line 618
    .line 619
    goto :goto_11

    .line 620
    :cond_22
    new-array v1, v9, [J

    .line 621
    .line 622
    fill-array-data v1, :array_0

    .line 623
    .line 624
    .line 625
    move v3, v5

    .line 626
    :goto_10
    if-ge v3, v9, :cond_23

    .line 627
    .line 628
    aget-wide v7, v1, v3

    .line 629
    .line 630
    sget-object v4, Lsh1;->β:Landroid/os/Handler;

    .line 631
    .line 632
    new-instance v10, Loj;

    .line 633
    .line 634
    const/4 v12, 0x5

    .line 635
    invoke-direct {v10, v2, v12}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v4, v10, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 639
    .line 640
    .line 641
    add-int/lit8 v3, v3, 0x1

    .line 642
    .line 643
    goto :goto_10

    .line 644
    :cond_23
    :goto_11
    if-nez v6, :cond_24

    .line 645
    .line 646
    goto :goto_12

    .line 647
    :cond_24
    const-string v1, "auto_scroll_delay_ms"

    .line 648
    .line 649
    const/16 v3, 0x320

    .line 650
    .line 651
    :try_start_8
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 652
    .line 653
    .line 654
    move-result-object v4

    .line 655
    invoke-interface {v4, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 656
    .line 657
    .line 658
    move-result v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 659
    :catchall_5
    const/16 v1, 0x1388

    .line 660
    .line 661
    invoke-static {v3, v5, v1}, Lj81;->μ(III)I

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    int-to-long v3, v1

    .line 666
    sget-object v1, Lsh1;->β:Landroid/os/Handler;

    .line 667
    .line 668
    new-instance v5, Lrh1;

    .line 669
    .line 670
    invoke-direct {v5, v0, v2, v11}, Lrh1;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v1, v5, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 674
    .line 675
    .line 676
    :goto_12
    return-void

    .line 677
    :goto_13
    monitor-exit v3

    .line 678
    throw v0

    .line 679
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    sget-boolean v1, Lkn0;->θ:Z

    .line 683
    .line 684
    if-eqz v1, :cond_25

    .line 685
    .line 686
    sget v1, Lkn0;->ι:I

    .line 687
    .line 688
    if-gtz v1, :cond_26

    .line 689
    .line 690
    :cond_25
    sget-object v1, Lq20;->α:Ljava/util/Set;

    .line 691
    .line 692
    iget-object v0, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 693
    .line 694
    invoke-static {v0}, Lq20;->ε(Ljava/lang/ClassLoader;)V

    .line 695
    .line 696
    .line 697
    :cond_26
    return-void

    .line 698
    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    sget-object v1, Lq20;->α:Ljava/util/Set;

    .line 702
    .line 703
    iget-object v1, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 704
    .line 705
    invoke-static {v1}, Lq20;->α(Ljava/lang/ClassLoader;)V

    .line 706
    .line 707
    .line 708
    sget-boolean v1, Lkn0;->θ:Z

    .line 709
    .line 710
    if-eqz v1, :cond_27

    .line 711
    .line 712
    sget v1, Lkn0;->ι:I

    .line 713
    .line 714
    if-gtz v1, :cond_28

    .line 715
    .line 716
    :cond_27
    iget-object v0, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 717
    .line 718
    invoke-static {v0}, Lq20;->ε(Ljava/lang/ClassLoader;)V

    .line 719
    .line 720
    .line 721
    :cond_28
    return-void

    .line 722
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    sget-object v2, Lo20;->α:Ljava/util/Set;

    .line 726
    .line 727
    iget-object v13, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 728
    .line 729
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 730
    .line 731
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 732
    .line 733
    const-string v1, "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF250DFFBABD94A01BAE8D13E20B0745AD541F739E610490C00DB97E203B7A27453B359A1B6E0ACFDBE2FBAE339F5D0679"

    .line 734
    .line 735
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    invoke-static {v13, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    new-instance v2, Lcc;

    .line 744
    .line 745
    invoke-direct {v2, v8, v1}, Lcc;-><init>(ILjava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    invoke-static {v2, v0}, Lh62;->Ν(Le80;Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v14

    .line 752
    if-nez v14, :cond_29

    .line 753
    .line 754
    goto/16 :goto_1a

    .line 755
    .line 756
    :cond_29
    new-instance v1, Lig;

    .line 757
    .line 758
    const/16 v2, 0xf

    .line 759
    .line 760
    invoke-direct {v1, v2}, Lig;-><init>(I)V

    .line 761
    .line 762
    .line 763
    invoke-static {v1, v14}, Lh62;->Ν(Le80;Ljava/lang/Object;)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v15

    .line 767
    new-instance v1, Lig;

    .line 768
    .line 769
    const/16 v2, 0xb

    .line 770
    .line 771
    invoke-direct {v1, v2}, Lig;-><init>(I)V

    .line 772
    .line 773
    .line 774
    invoke-static {v1, v0}, Lh62;->Ν(Le80;Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    if-eqz v0, :cond_2b

    .line 779
    .line 780
    instance-of v1, v0, Landroid/view/View;

    .line 781
    .line 782
    if-eqz v1, :cond_2a

    .line 783
    .line 784
    check-cast v0, Landroid/view/View;

    .line 785
    .line 786
    goto :goto_14

    .line 787
    :cond_2a
    move-object v0, v10

    .line 788
    :goto_14
    if-eqz v0, :cond_2b

    .line 789
    .line 790
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    move-object v12, v0

    .line 795
    goto :goto_15

    .line 796
    :cond_2b
    move-object v12, v10

    .line 797
    :goto_15
    new-instance v11, Lpv0;

    .line 798
    .line 799
    invoke-static {v14}, Lh62;->Ο(Ljava/lang/Object;)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v16

    .line 803
    invoke-direct/range {v11 .. v16}, Lpv0;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 804
    .line 805
    .line 806
    :try_start_9
    sget-object v0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 807
    .line 808
    if-nez v15, :cond_2d

    .line 809
    .line 810
    :cond_2c
    move-object v0, v10

    .line 811
    goto :goto_16

    .line 812
    :cond_2d
    invoke-static {v15}, Lb10;->υ(Ljava/lang/Object;)Lf8;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    if-eqz v0, :cond_2c

    .line 817
    .line 818
    iget-object v0, v0, Lf8;->ζ:Lh8;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 819
    .line 820
    goto :goto_16

    .line 821
    :catchall_6
    move-exception v0

    .line 822
    new-instance v1, Leo1;

    .line 823
    .line 824
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 825
    .line 826
    .line 827
    move-object v0, v1

    .line 828
    :goto_16
    instance-of v1, v0, Leo1;

    .line 829
    .line 830
    if-eqz v1, :cond_2e

    .line 831
    .line 832
    goto :goto_17

    .line 833
    :cond_2e
    move-object v10, v0

    .line 834
    :goto_17
    check-cast v10, Lh8;

    .line 835
    .line 836
    if-nez v10, :cond_2f

    .line 837
    .line 838
    goto :goto_18

    .line 839
    :cond_2f
    sget-object v0, Ln20;->α:[I

    .line 840
    .line 841
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 842
    .line 843
    .line 844
    move-result v1

    .line 845
    aget v4, v0, v1

    .line 846
    .line 847
    :goto_18
    if-eq v4, v7, :cond_31

    .line 848
    .line 849
    if-eq v4, v8, :cond_31

    .line 850
    .line 851
    if-eq v4, v3, :cond_30

    .line 852
    .line 853
    sget-object v0, Lmv0;->ζ:Lmv0;

    .line 854
    .line 855
    goto :goto_19

    .line 856
    :cond_30
    sget-object v0, Lmv0;->θ:Lmv0;

    .line 857
    .line 858
    goto :goto_19

    .line 859
    :cond_31
    sget-object v0, Lmv0;->η:Lmv0;

    .line 860
    .line 861
    :goto_19
    sget-object v1, Lxv0;->α:Lxv0;

    .line 862
    .line 863
    invoke-virtual {v1, v0, v11}, Lxv0;->α(Lmv0;Lqv0;)Ljava/util/List;

    .line 864
    .line 865
    .line 866
    :goto_1a
    return-void

    .line 867
    :pswitch_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    sget-object v2, Lcm;->α:Ljava/util/Set;

    .line 871
    .line 872
    iget-object v13, v0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 873
    .line 874
    const-string v2, "rc1ad4955cc6c3a73"

    .line 875
    .line 876
    iget-object v0, v1, Lk01;->ε:Ljava/lang/Object;

    .line 877
    .line 878
    iget-object v1, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 879
    .line 880
    invoke-static {v0}, Lh62;->к(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    move-result v3

    .line 884
    if-eqz v3, :cond_32

    .line 885
    .line 886
    check-cast v0, Ljava/util/List;

    .line 887
    .line 888
    move-object v3, v0

    .line 889
    goto :goto_1b

    .line 890
    :cond_32
    move-object v3, v10

    .line 891
    :goto_1b
    if-nez v3, :cond_33

    .line 892
    .line 893
    goto/16 :goto_20

    .line 894
    .line 895
    :cond_33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    invoke-static {v5, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v14

    .line 902
    if-nez v14, :cond_34

    .line 903
    .line 904
    goto/16 :goto_20

    .line 905
    .line 906
    :cond_34
    invoke-static {v7, v1}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v15

    .line 910
    invoke-static {v14}, Lh62;->Κ(Ljava/lang/Object;)Landroid/content/Context;

    .line 911
    .line 912
    .line 913
    move-result-object v12

    .line 914
    invoke-static {v14}, Lh62;->Ι(Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v16

    .line 918
    new-instance v0, Lig;

    .line 919
    .line 920
    const/16 v1, 0x10

    .line 921
    .line 922
    invoke-direct {v0, v1}, Lig;-><init>(I)V

    .line 923
    .line 924
    .line 925
    invoke-static {v0, v14}, Lh62;->Ν(Le80;Ljava/lang/Object;)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v17

    .line 929
    invoke-static {v14}, Lh62;->Ο(Ljava/lang/Object;)Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v18

    .line 933
    new-instance v11, Lov0;

    .line 934
    .line 935
    invoke-direct/range {v11 .. v18}, Lov0;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    sget-object v0, Lxv0;->α:Lxv0;

    .line 939
    .line 940
    sget-object v1, Lmv0;->ε:Lmv0;

    .line 941
    .line 942
    invoke-virtual {v0, v1, v11}, Lxv0;->α(Lmv0;Lqv0;)Ljava/util/List;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    if-eqz v1, :cond_35

    .line 951
    .line 952
    goto :goto_20

    .line 953
    :cond_35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    :cond_36
    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    if-eqz v0, :cond_38

    .line 962
    .line 963
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    move-object v4, v0

    .line 968
    check-cast v4, Lnv0;

    .line 969
    .line 970
    sget-object v0, Lcm;->α:Ljava/util/Set;

    .line 971
    .line 972
    :try_start_a
    invoke-static {v13, v4, v14, v15}, Lcm;->δ(Ljava/lang/ClassLoader;Lnv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    invoke-static {v13, v3, v0, v4}, Lcm;->α(Ljava/lang/ClassLoader;Ljava/util/List;Ljava/lang/Object;Lnv0;)Z

    .line 977
    .line 978
    .line 979
    move-result v0

    .line 980
    if-nez v0, :cond_37

    .line 981
    .line 982
    iget-object v0, v4, Lnv0;->α:Ljava/lang/String;

    .line 983
    .line 984
    new-instance v5, Ljava/lang/StringBuilder;

    .line 985
    .line 986
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 987
    .line 988
    .line 989
    const-string v6, "skip comment action, panel container not found id="

    .line 990
    .line 991
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    invoke-static {v2, v0, v10, v9, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1002
    .line 1003
    .line 1004
    goto :goto_1d

    .line 1005
    :catchall_7
    move-exception v0

    .line 1006
    goto :goto_1e

    .line 1007
    :cond_37
    :goto_1d
    sget-object v0, Ls62;->α:Ls62;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 1008
    .line 1009
    goto :goto_1f

    .line 1010
    :goto_1e
    new-instance v5, Leo1;

    .line 1011
    .line 1012
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1013
    .line 1014
    .line 1015
    move-object v0, v5

    .line 1016
    :goto_1f
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    if-eqz v0, :cond_36

    .line 1021
    .line 1022
    iget-object v4, v4, Lnv0;->α:Ljava/lang/String;

    .line 1023
    .line 1024
    const-string v5, "create comment action failed id="

    .line 1025
    .line 1026
    invoke-static {v5, v4, v2, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1027
    .line 1028
    .line 1029
    goto :goto_1c

    .line 1030
    :cond_38
    :goto_20
    return-void

    .line 1031
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    :array_0
    .array-data 8
        0x0
        0x78
        0x15e
        0x320
    .end array-data
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 12

    .line 1
    iget v0, p0, Lbm;->α:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lp20;->α:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lq20;->α:Ljava/util/Set;

    .line 22
    .line 23
    iget-object p0, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 24
    .line 25
    invoke-static {p0}, Lq20;->α(Ljava/lang/ClassLoader;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, p1, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 33
    .line 34
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v0, v3

    .line 42
    :goto_0
    sget-object v1, Lq20;->α:Ljava/util/Set;

    .line 43
    .line 44
    iget-object v1, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 45
    .line 46
    invoke-static {p1, v1}, Lq20;->β(Lk01;Ljava/lang/ClassLoader;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    sget v1, Lkn0;->ι:I

    .line 54
    .line 55
    sget-object v4, Lp20;->α:Ljava/util/Set;

    .line 56
    .line 57
    iget-object v4, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 58
    .line 59
    if-gtz v1, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-static {v4}, Lq20;->γ([Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    if-nez v5, :cond_4

    .line 67
    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    new-array v4, v2, [Ljava/lang/Object;

    .line 71
    .line 72
    :cond_3
    new-instance v2, Ll20;

    .line 73
    .line 74
    const/4 v5, 0x5

    .line 75
    invoke-direct {v2, v5}, Ll20;-><init>(I)V

    .line 76
    .line 77
    .line 78
    const/16 v5, 0x1e

    .line 79
    .line 80
    const-string v6, "|"

    .line 81
    .line 82
    invoke-static {v4, v6, v3, v2, v5}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const-string v4, "anon:"

    .line 87
    .line 88
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    :cond_4
    sget-object v2, Lp20;->α:Ljava/util/Set;

    .line 93
    .line 94
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-lt v4, v1, :cond_7

    .line 106
    .line 107
    :goto_1
    if-eqz v0, :cond_6

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_6
    invoke-static {v3}, Lq20;->ζ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p1, p0}, Lk01;->α(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object p0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {p0}, Lq20;->γ([Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    new-instance p1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v0, "skip engine preload by count="

    .line 129
    .line 130
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v0, " key="

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, Lq20;->κ(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :goto_2
    iget-object p0, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 156
    .line 157
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 158
    .line 159
    invoke-static {p0, p1}, Lq20;->δ(Ljava/lang/ClassLoader;[Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :goto_3
    return-void

    .line 163
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    sget-object v0, Lq20;->α:Ljava/util/Set;

    .line 167
    .line 168
    iget-object v0, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 169
    .line 170
    invoke-static {p1, v0}, Lq20;->β(Lk01;Ljava/lang/ClassLoader;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    goto/16 :goto_a

    .line 177
    .line 178
    :cond_8
    iget-object v0, p1, Lk01;->α:Ljava/lang/reflect/Executable;

    .line 179
    .line 180
    instance-of v4, v0, Ljava/lang/reflect/Method;

    .line 181
    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    check-cast v0, Ljava/lang/reflect/Method;

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_9
    move-object v0, v3

    .line 188
    :goto_4
    iget-object v4, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 189
    .line 190
    sget v5, Lkn0;->ι:I

    .line 191
    .line 192
    if-eqz v4, :cond_10

    .line 193
    .line 194
    if-gtz v5, :cond_a

    .line 195
    .line 196
    goto/16 :goto_9

    .line 197
    .line 198
    :cond_a
    array-length v6, v4

    .line 199
    :goto_5
    if-ge v2, v6, :cond_10

    .line 200
    .line 201
    aget-object v7, v4, v2

    .line 202
    .line 203
    instance-of v8, v7, Ljava/util/List;

    .line 204
    .line 205
    if-eqz v8, :cond_b

    .line 206
    .line 207
    check-cast v7, Ljava/util/List;

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_b
    move-object v7, v3

    .line 211
    :goto_6
    if-nez v7, :cond_c

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_c
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-le v8, v5, :cond_f

    .line 219
    .line 220
    new-instance v8, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-static {v7, v5}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 227
    .line 228
    .line 229
    aput-object v8, v4, v2

    .line 230
    .line 231
    if-eqz v0, :cond_d

    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    goto :goto_7

    .line 238
    :cond_d
    move-object v9, v3

    .line 239
    :goto_7
    const-string v10, "insertPreloadMedia"

    .line 240
    .line 241
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-eqz v9, :cond_e

    .line 246
    .line 247
    array-length v9, v4

    .line 248
    if-lt v9, v1, :cond_e

    .line 249
    .line 250
    const/4 v9, 0x2

    .line 251
    aget-object v10, v4, v9

    .line 252
    .line 253
    instance-of v11, v10, Ljava/lang/Integer;

    .line 254
    .line 255
    if-eqz v11, :cond_e

    .line 256
    .line 257
    check-cast v10, Ljava/lang/Integer;

    .line 258
    .line 259
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    aput-object v10, v4, v9

    .line 272
    .line 273
    :cond_e
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 278
    .line 279
    .line 280
    move-result v8

    .line 281
    new-instance v9, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v10, "trim preload media list "

    .line 284
    .line 285
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string v7, " -> "

    .line 292
    .line 293
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    invoke-static {v7}, Lq20;->κ(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    :cond_f
    :goto_8
    add-int/lit8 v2, v2, 0x1

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_10
    :goto_9
    sget-object v0, Lq20;->α:Ljava/util/Set;

    .line 310
    .line 311
    iget-object p0, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 312
    .line 313
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {p0, p1}, Lq20;->δ(Ljava/lang/ClassLoader;[Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :goto_a
    return-void

    .line 319
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    sget-object v0, Lq20;->α:Ljava/util/Set;

    .line 323
    .line 324
    iget-object p0, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 325
    .line 326
    invoke-static {p1, p0}, Lq20;->β(Lk01;Ljava/lang/ClassLoader;)Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_11

    .line 331
    .line 332
    goto :goto_b

    .line 333
    :cond_11
    iget-object p1, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 334
    .line 335
    invoke-static {p0, p1}, Lq20;->δ(Ljava/lang/ClassLoader;[Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :goto_b
    return-void

    .line 339
    :pswitch_5
    const-string v0, "re42d48bb5ac13a6f"

    .line 340
    .line 341
    iget-object p0, p0, Lbm;->β:Ljava/lang/ClassLoader;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-static {}, Ld00;->β()Z

    .line 347
    .line 348
    .line 349
    move-result v4

    .line 350
    const/4 v5, 0x1

    .line 351
    const-wide/16 v6, 0x0

    .line 352
    .line 353
    if-eqz v4, :cond_12

    .line 354
    .line 355
    sget-object v4, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 358
    .line 359
    .line 360
    move-result-wide v8

    .line 361
    cmp-long v4, v8, v6

    .line 362
    .line 363
    if-lez v4, :cond_12

    .line 364
    .line 365
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 366
    .line 367
    .line 368
    move-result-wide v10

    .line 369
    cmp-long v4, v10, v8

    .line 370
    .line 371
    if-gtz v4, :cond_12

    .line 372
    .line 373
    move v4, v5

    .line 374
    goto :goto_c

    .line 375
    :cond_12
    move v4, v2

    .line 376
    :goto_c
    if-nez v4, :cond_13

    .line 377
    .line 378
    const-string v8, "key_ads_instant_reward"

    .line 379
    .line 380
    invoke-static {v8, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    if-nez v8, :cond_13

    .line 385
    .line 386
    goto :goto_d

    .line 387
    :cond_13
    :try_start_0
    iget-object v8, p1, Lk01;->β:Ljava/lang/Object;

    .line 388
    .line 389
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-static {v8, p0}, Ld00;->α(Ljava/lang/Object;Ljava/lang/ClassLoader;)V

    .line 393
    .line 394
    .line 395
    const-string v9, "X.C19417310qO"

    .line 396
    .line 397
    invoke-static {p0, v9}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    new-array v9, v2, [Ljava/lang/Object;

    .line 402
    .line 403
    invoke-static {p0, v9}, Lqe0;->μ(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    const-string v9, "executeReward"

    .line 408
    .line 409
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    invoke-static {v8, v9, p0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    const-string p0, "closeFragment"

    .line 417
    .line 418
    if-nez v4, :cond_14

    .line 419
    .line 420
    const-string v4, "key_ads_force_reward"

    .line 421
    .line 422
    invoke-static {v4, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-eqz v4, :cond_15

    .line 427
    .line 428
    :cond_14
    move v2, v5

    .line 429
    :cond_15
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-static {v8, p0, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    sget-object p0, Ld00;->α:Ljava/util/concurrent/atomic/AtomicLong;

    .line 441
    .line 442
    invoke-virtual {p0, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {p1, v3}, Lk01;->α(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    const-string p0, "\u5c0f\u6e38\u620f\u6fc0\u52b1\u5e7f\u544a\u5df2\u6309\u5b8c\u6210\u72b6\u6001\u5173\u95ed"

    .line 449
    .line 450
    invoke-static {v0, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 451
    .line 452
    .line 453
    goto :goto_d

    .line 454
    :catchall_0
    move-exception p0

    .line 455
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    const-string p1, "\u5c0f\u6e38\u620f\u6fc0\u52b1\u5e7f\u544a\u5373\u65f6\u5b8c\u6210\u5931\u8d25\uff0c\u7ee7\u7eed\u5bbf\u4e3b\u6d41\u7a0b: "

    .line 460
    .line 461
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-static {v0, p0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    :goto_d
    return-void

    .line 469
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
