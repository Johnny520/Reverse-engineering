.class public final Ls2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls2;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2;->c:Ljava/lang/Object;

    iput-object p2, p0, Ls2;->d:Ljava/lang/Object;

    iput-object p3, p0, Ls2;->b:Ljava/lang/String;

    iput-object p4, p0, Ls2;->e:Ljava/lang/Object;

    iput-object p5, p0, Ls2;->f:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;[Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ls2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls2;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Ls2;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ls2;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Ls2;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Ls2;->f:Ljava/io/Serializable;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ls2;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ls2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/app/Activity;

    .line 11
    .line 12
    const-string v5, ""

    .line 13
    .line 14
    :try_start_0
    invoke-static {v0}, Ls6;->v(Landroid/app/Activity;)Landroid/widget/EditText;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :catchall_0
    :goto_1
    move-object v10, v5

    .line 34
    sget-object v0, Loc;->a:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    const-wide/16 v7, 0x0

    .line 41
    .line 42
    const-wide/16 v11, 0x898

    .line 43
    .line 44
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    add-long/2addr v7, v5

    .line 49
    sget-wide v5, Loc;->e:J

    .line 50
    .line 51
    cmp-long v0, v7, v5

    .line 52
    .line 53
    if-lez v0, :cond_2

    .line 54
    .line 55
    sput-wide v7, Loc;->e:J

    .line 56
    .line 57
    :cond_2
    iget-object v0, v1, Ls2;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Landroid/view/View;

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    sget-object v0, Lv6;->a:[Ljava/lang/String;

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    sget-object v5, Lv6;->b:Ljava/util/Map;

    .line 67
    .line 68
    monitor-enter v5

    .line 69
    :try_start_1
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Lu6;

    .line 74
    .line 75
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 76
    if-nez v6, :cond_4

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    iget-object v5, v6, Lu6;->a:Ljava/lang/ref/WeakReference;

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    :goto_2
    if-eqz v5, :cond_6

    .line 87
    .line 88
    iget-object v6, v6, Lu6;->b:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-nez v6, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    :try_start_2
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v6, v5, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    instance-of v5, v0, Ljava/lang/Boolean;

    .line 102
    .line 103
    if-eqz v5, :cond_6

    .line 104
    .line 105
    check-cast v0, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    iget-object v0, v1, Ls2;->c:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v6, v0

    .line 116
    check-cast v6, Landroid/app/Activity;

    .line 117
    .line 118
    iget-object v7, v1, Ls2;->b:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v0, v1, Ls2;->e:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v8, v0

    .line 123
    check-cast v8, Ljava/lang/String;

    .line 124
    .line 125
    iget-object v0, v1, Ls2;->f:Ljava/io/Serializable;

    .line 126
    .line 127
    move-object v9, v0

    .line 128
    check-cast v9, Ljava/lang/String;

    .line 129
    .line 130
    const-string v11, "native-long-click"

    .line 131
    .line 132
    invoke-static/range {v6 .. v11}, Ls6;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_c

    .line 136
    .line 137
    :catchall_1
    move-exception v0

    .line 138
    const-string v5, "group-avatar"

    .line 139
    .line 140
    const-string v6, "invoke-original-long-click"

    .line 141
    .line 142
    invoke-static {v5, v6, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :cond_6
    :goto_3
    iget-object v0, v1, Ls2;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Landroid/app/Activity;

    .line 148
    .line 149
    invoke-static {v0}, Ls6;->v(Landroid/app/Activity;)Landroid/widget/EditText;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    iget-object v0, v1, Ls2;->c:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v12, v0

    .line 156
    check-cast v12, Landroid/app/Activity;

    .line 157
    .line 158
    iget-object v14, v1, Ls2;->b:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v0, v1, Ls2;->e:Ljava/lang/Object;

    .line 161
    .line 162
    move-object v15, v0

    .line 163
    check-cast v15, Ljava/lang/String;

    .line 164
    .line 165
    iget-object v0, v1, Ls2;->f:Ljava/io/Serializable;

    .line 166
    .line 167
    move-object/from16 v17, v0

    .line 168
    .line 169
    check-cast v17, Ljava/lang/String;

    .line 170
    .line 171
    const-class v5, Ljava/lang/Boolean;

    .line 172
    .line 173
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 174
    .line 175
    new-instance v7, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-static {v7, v13}, Ls6;->d(Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    if-eqz v13, :cond_7

    .line 184
    .line 185
    :try_start_3
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const/4 v8, 0x0

    .line 190
    :goto_4
    if-eqz v0, :cond_7

    .line 191
    .line 192
    add-int/lit8 v9, v8, 0x1

    .line 193
    .line 194
    const/4 v11, 0x5

    .line 195
    if-ge v8, v11, :cond_7

    .line 196
    .line 197
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    instance-of v8, v0, Landroid/view/View;

    .line 201
    .line 202
    if-eqz v8, :cond_7

    .line 203
    .line 204
    check-cast v0, Landroid/view/View;

    .line 205
    .line 206
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 207
    .line 208
    .line 209
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 210
    move v8, v9

    .line 211
    goto :goto_4

    .line 212
    :catchall_2
    :cond_7
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    invoke-static {v12}, Ls6;->H(Landroid/app/Activity;)Ljava/lang/ClassLoader;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Ls6;->f(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v7, v0}, Ls6;->d(Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v12, v15}, Ls6;->i0(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v16

    .line 230
    new-instance v8, Ljava/util/HashSet;

    .line 231
    .line 232
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 233
    .line 234
    .line 235
    const/4 v9, 0x0

    .line 236
    :goto_5
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-ge v9, v0, :cond_14

    .line 241
    .line 242
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-nez v0, :cond_8

    .line 247
    .line 248
    const/16 v19, 0x0

    .line 249
    .line 250
    goto/16 :goto_b

    .line 251
    .line 252
    :cond_8
    new-instance v11, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v18

    .line 261
    const/16 v19, 0x0

    .line 262
    .line 263
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string v3, "@"

    .line 271
    .line 272
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    if-nez v3, :cond_9

    .line 291
    .line 292
    goto/16 :goto_b

    .line 293
    .line 294
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-static {v3}, Ls6;->e(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    move/from16 v11, v19

    .line 303
    .line 304
    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-ge v11, v4, :cond_f

    .line 309
    .line 310
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    check-cast v4, Ljava/lang/reflect/Method;

    .line 315
    .line 316
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 317
    .line 318
    .line 319
    move-result v20

    .line 320
    invoke-static/range {v20 .. v20}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 321
    .line 322
    .line 323
    move-result v20

    .line 324
    if-nez v20, :cond_a

    .line 325
    .line 326
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 327
    .line 328
    .line 329
    move-result v20

    .line 330
    invoke-static/range {v20 .. v20}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 331
    .line 332
    .line 333
    move-result v20

    .line 334
    if-eqz v20, :cond_b

    .line 335
    .line 336
    :cond_a
    move-object/from16 v21, v3

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    move-object/from16 v21, v3

    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    const-string v3, " "

    .line 354
    .line 355
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-static {v4}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 370
    .line 371
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const-string v3, "at"

    .line 376
    .line 377
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-nez v3, :cond_c

    .line 382
    .line 383
    const-string v3, "mention"

    .line 384
    .line 385
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-nez v2, :cond_c

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_c
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 397
    .line 398
    if-eq v2, v3, :cond_d

    .line 399
    .line 400
    if-eq v2, v6, :cond_d

    .line 401
    .line 402
    if-eq v2, v5, :cond_d

    .line 403
    .line 404
    goto :goto_7

    .line 405
    :cond_d
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    move-result-object v22

    .line 409
    const-string v25, ""

    .line 410
    .line 411
    const-string v26, "1"

    .line 412
    .line 413
    const-string v27, "1"

    .line 414
    .line 415
    const-string v28, "n"

    .line 416
    .line 417
    const/16 v23, 0x0

    .line 418
    .line 419
    const/16 v24, 0x0

    .line 420
    .line 421
    invoke-static/range {v22 .. v28}, Ls6;->S([Ljava/lang/Class;Landroid/app/Activity;Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    if-eqz v2, :cond_e

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_e
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 429
    .line 430
    move-object/from16 v3, v21

    .line 431
    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :cond_f
    const/4 v4, 0x0

    .line 435
    :goto_8
    if-nez v4, :cond_10

    .line 436
    .line 437
    goto/16 :goto_b

    .line 438
    .line 439
    :cond_10
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v11

    .line 443
    invoke-static/range {v11 .. v17}, Ls6;->S([Ljava/lang/Class;Landroid/app/Activity;Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    if-nez v2, :cond_11

    .line 448
    .line 449
    goto/16 :goto_b

    .line 450
    .line 451
    :cond_11
    const/4 v3, 0x1

    .line 452
    :try_start_4
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v4, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    if-eq v3, v6, :cond_12

    .line 464
    .line 465
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    if-ne v3, v5, :cond_13

    .line 470
    .line 471
    goto :goto_9

    .line 472
    :catchall_3
    move-exception v0

    .line 473
    goto :goto_a

    .line 474
    :cond_12
    :goto_9
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-virtual {v3, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v2

    .line 480
    if-nez v2, :cond_13

    .line 481
    .line 482
    goto :goto_b

    .line 483
    :cond_13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 484
    .line 485
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 486
    .line 487
    .line 488
    const-string v3, "group action native mention invoked class="

    .line 489
    .line 490
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    const-string v0, " method="

    .line 505
    .line 506
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    invoke-static {v4}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 521
    .line 522
    .line 523
    iget-object v0, v1, Ls2;->c:Ljava/lang/Object;

    .line 524
    .line 525
    move-object v6, v0

    .line 526
    check-cast v6, Landroid/app/Activity;

    .line 527
    .line 528
    iget-object v7, v1, Ls2;->b:Ljava/lang/String;

    .line 529
    .line 530
    iget-object v0, v1, Ls2;->e:Ljava/lang/Object;

    .line 531
    .line 532
    move-object v8, v0

    .line 533
    check-cast v8, Ljava/lang/String;

    .line 534
    .line 535
    iget-object v0, v1, Ls2;->f:Ljava/io/Serializable;

    .line 536
    .line 537
    move-object v9, v0

    .line 538
    check-cast v9, Ljava/lang/String;

    .line 539
    .line 540
    const-string v11, "native-reflect"

    .line 541
    .line 542
    invoke-static/range {v6 .. v11}, Ls6;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    goto :goto_c

    .line 546
    :goto_a
    invoke-static {v0}, Ls6;->C0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    new-instance v2, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    const-string v3, "group action native mention failed method="

    .line 553
    .line 554
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-static {v4}, Ls6;->R(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    const-string v3, " reason="

    .line 565
    .line 566
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    const-string v3, ": "

    .line 581
    .line 582
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    :goto_b
    add-int/lit8 v9, v9, 0x1

    .line 600
    .line 601
    goto/16 :goto_5

    .line 602
    .line 603
    :cond_14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 604
    .line 605
    const-string v2, "group action failed type=\u827e\u7279 reason=native mention entry unresolved groupUin="

    .line 606
    .line 607
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    iget-object v2, v1, Ls2;->b:Ljava/lang/String;

    .line 611
    .line 612
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    const-string v2, " targetUin="

    .line 616
    .line 617
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    iget-object v1, v1, Ls2;->e:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v1, Ljava/lang/String;

    .line 623
    .line 624
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    const-string v0, "\u672a\u627e\u5230 QQ \u539f\u751f\u827e\u7279\u5165\u53e3"

    .line 635
    .line 636
    invoke-static {v0}, Ls6;->y0(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    :goto_c
    return-void

    .line 640
    :catchall_4
    move-exception v0

    .line 641
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 642
    throw v0

    .line 643
    :pswitch_0
    const/16 v19, 0x0

    .line 644
    .line 645
    iget-object v0, v1, Ls2;->c:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, [Ljava/lang/Object;

    .line 648
    .line 649
    :try_start_6
    iget-object v2, v1, Ls2;->b:Ljava/lang/String;

    .line 650
    .line 651
    const-class v3, Lorg/luckypray/dexkit/DexKitBridge;

    .line 652
    .line 653
    sget-object v4, Lorg/luckypray/dexkit/DexKitBridge;->Companion:Lorg/luckypray/dexkit/DexKitBridge$Companion;

    .line 654
    .line 655
    const-string v4, "create"

    .line 656
    .line 657
    const-class v5, Ljava/lang/String;

    .line 658
    .line 659
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    move-result-object v5

    .line 663
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    const/4 v4, 0x1

    .line 668
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 669
    .line 670
    .line 671
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    const/4 v4, 0x0

    .line 676
    invoke-virtual {v3, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    aput-object v2, v0, v19

    .line 681
    .line 682
    iget-object v3, v1, Ls2;->d:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 685
    .line 686
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 687
    .line 688
    .line 689
    move-result v3

    .line 690
    if-eqz v3, :cond_15

    .line 691
    .line 692
    invoke-static {v2}, Lt2;->g(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    const/16 v18, 0x0

    .line 696
    .line 697
    aput-object v18, v0, v19

    .line 698
    .line 699
    goto :goto_e

    .line 700
    :catchall_5
    move-exception v0

    .line 701
    goto :goto_d

    .line 702
    :cond_15
    iget-object v0, v1, Ls2;->e:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v0, Landroid/content/Context;

    .line 705
    .line 706
    invoke-static {v0, v2}, Lt2;->a(Landroid/content/Context;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 707
    .line 708
    .line 709
    goto :goto_e

    .line 710
    :goto_d
    iget-object v1, v1, Ls2;->f:Ljava/io/Serializable;

    .line 711
    .line 712
    check-cast v1, [Ljava/lang/Throwable;

    .line 713
    .line 714
    aput-object v0, v1, v19

    .line 715
    .line 716
    :goto_e
    return-void

    .line 717
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
