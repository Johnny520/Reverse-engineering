.class public abstract Lt7;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Landroid/os/Handler;

.field public static volatile γ:Lm7;

.field public static volatile δ:Lny0;

.field public static ε:Lp7;

.field public static ζ:Z

.field public static η:Z

.field public static final θ:Ln7;

.field public static final ι:Ln7;

.field public static final κ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt7;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lt7;->β:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Ln7;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lt7;->θ:Ln7;

    .line 27
    .line 28
    new-instance v0, Ln7;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lt7;->ι:Ln7;

    .line 35
    .line 36
    const-string v7, "auto_scroll_article_dwell_seconds"

    .line 37
    .line 38
    const-string v8, "auto_scroll_touch_restart_enabled"

    .line 39
    .line 40
    const-string v2, "auto_scroll_next_enabled"

    .line 41
    .line 42
    const-string v3, "auto_pause_on_complete_enabled"

    .line 43
    .line 44
    const-string v4, "auto_scroll_image_enabled"

    .line 45
    .line 46
    const-string v5, "auto_scroll_image_dwell_seconds"

    .line 47
    .line 48
    const-string v6, "auto_scroll_article_enabled"

    .line 49
    .line 50
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lt7;->κ:Ljava/util/Set;

    .line 59
    .line 60
    return-void
.end method

.method public static α(Lp7;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lp7;->ζ:Lν;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v1, Lt7;->β:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lp7;->ζ:Lν;

    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public static β(Lmq;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lt7;->ε:Lp7;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Lp7;->ε:Loq;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget v3, v2, Loq;->α:I

    .line 12
    .line 13
    packed-switch v3, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v2, v2, Loq;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_0
    iget-object v2, v2, Loq;->β:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    :goto_0
    const/4 v2, 0x0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iput-object v2, v0, Lp7;->ε:Loq;

    .line 35
    .line 36
    :cond_1
    invoke-static {v0}, Lt7;->α(Lp7;)V

    .line 37
    .line 38
    .line 39
    sput-object v2, Lt7;->ε:Lp7;

    .line 40
    .line 41
    sput-object v2, Lt7;->γ:Lm7;

    .line 42
    .line 43
    if-eqz v1, :cond_18

    .line 44
    .line 45
    const-string v0, "auto_scroll_next_enabled"

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    const-string v0, "auto_pause_on_complete_enabled"

    .line 55
    .line 56
    invoke-static {v0, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_18

    .line 61
    .line 62
    :cond_2
    sget-object v0, Lpq;->α:Lpq;

    .line 63
    .line 64
    invoke-static {}, Lpq;->β()Lkq;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    goto/16 :goto_e

    .line 71
    .line 72
    :cond_3
    iget-object v0, v4, Lkq;->δ:Lmq;

    .line 73
    .line 74
    iget-wide v5, v0, Lmq;->δ:J

    .line 75
    .line 76
    iget-wide v7, v1, Lmq;->δ:J

    .line 77
    .line 78
    cmp-long v0, v5, v7

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    goto/16 :goto_e

    .line 83
    .line 84
    :cond_4
    new-instance v5, Lp7;

    .line 85
    .line 86
    iget-object v6, v1, Lmq;->α:Ljava/lang/String;

    .line 87
    .line 88
    sget-object v0, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 89
    .line 90
    iget-object v9, v4, Lkq;->β:Ljava/lang/Object;

    .line 91
    .line 92
    sget-object v0, Lr00;->ι:Lrz;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    invoke-virtual {v0}, Lμ;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-eqz v11, :cond_5

    .line 101
    .line 102
    move v0, v3

    .line 103
    goto/16 :goto_9

    .line 104
    .line 105
    :cond_5
    invoke-virtual {v0}, Lχ;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_13

    .line 114
    .line 115
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lr00;

    .line 120
    .line 121
    sget-object v12, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 122
    .line 123
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v12

    .line 127
    const-string v13, "@"

    .line 128
    .line 129
    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    if-nez v14, :cond_6

    .line 134
    .line 135
    move-object v10, v2

    .line 136
    goto :goto_5

    .line 137
    :cond_6
    invoke-static {v14}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 138
    .line 139
    .line 140
    move-result v15

    .line 141
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    new-instance v10, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    sget-object v3, Ls00;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 174
    .line 175
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    check-cast v10, Ljava/lang/reflect/Field;

    .line 180
    .line 181
    if-eqz v10, :cond_7

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_7
    sget-object v10, Ls00;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 185
    .line 186
    invoke-virtual {v10, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-eqz v13, :cond_8

    .line 191
    .line 192
    :goto_2
    const/4 v10, 0x0

    .line 193
    goto :goto_5

    .line 194
    :cond_8
    sget-object v13, Lox;->α:Ljava/lang/Object;

    .line 195
    .line 196
    iget-object v13, v0, Lr00;->ε:Lkx;

    .line 197
    .line 198
    invoke-static {v13, v14}, Lox;->ρ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 199
    .line 200
    .line 201
    move-result-object v13

    .line 202
    if-eqz v13, :cond_a

    .line 203
    .line 204
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    invoke-virtual {v14, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    if-eqz v14, :cond_9

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_9
    const/4 v13, 0x0

    .line 216
    :goto_3
    if-eqz v13, :cond_a

    .line 217
    .line 218
    move-object v0, v13

    .line 219
    goto :goto_4

    .line 220
    :cond_a
    invoke-static {v12, v0}, Ls00;->β(Ljava/lang/Class;Lr00;)Ljava/lang/reflect/Field;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :goto_4
    if-nez v0, :cond_b

    .line 225
    .line 226
    invoke-virtual {v10, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_b
    const/4 v10, 0x1

    .line 231
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-object v10, v0

    .line 238
    :goto_5
    if-nez v10, :cond_d

    .line 239
    .line 240
    :cond_c
    const/4 v0, 0x0

    .line 241
    goto :goto_8

    .line 242
    :cond_d
    :try_start_0
    invoke-virtual {v10, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    goto :goto_6

    .line 247
    :catchall_0
    move-exception v0

    .line 248
    new-instance v2, Leo1;

    .line 249
    .line 250
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    move-object v0, v2

    .line 254
    :goto_6
    instance-of v2, v0, Leo1;

    .line 255
    .line 256
    if-eqz v2, :cond_e

    .line 257
    .line 258
    const/4 v0, 0x0

    .line 259
    :cond_e
    instance-of v2, v0, Ljava/lang/Boolean;

    .line 260
    .line 261
    if-eqz v2, :cond_f

    .line 262
    .line 263
    check-cast v0, Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    goto :goto_8

    .line 270
    :cond_f
    instance-of v2, v0, Ljava/lang/Number;

    .line 271
    .line 272
    if-eqz v2, :cond_11

    .line 273
    .line 274
    check-cast v0, Ljava/lang/Number;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_c

    .line 281
    .line 282
    :cond_10
    :goto_7
    const/4 v0, 0x1

    .line 283
    goto :goto_8

    .line 284
    :cond_11
    instance-of v2, v0, Ljava/lang/String;

    .line 285
    .line 286
    if-eqz v2, :cond_c

    .line 287
    .line 288
    const-string v2, "1"

    .line 289
    .line 290
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-nez v2, :cond_10

    .line 295
    .line 296
    check-cast v0, Ljava/lang/String;

    .line 297
    .line 298
    const-string v2, "true"

    .line 299
    .line 300
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_c

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :goto_8
    if-eqz v0, :cond_12

    .line 308
    .line 309
    const/4 v0, 0x1

    .line 310
    goto :goto_9

    .line 311
    :cond_12
    const/4 v2, 0x0

    .line 312
    const/4 v3, 0x0

    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_13
    const/4 v0, 0x0

    .line 316
    :goto_9
    invoke-direct {v5, v7, v8, v6, v0}, Lp7;-><init>(JLjava/lang/String;Z)V

    .line 317
    .line 318
    .line 319
    sput-object v5, Lt7;->ε:Lp7;

    .line 320
    .line 321
    sget-object v0, Lpq;->α:Lpq;

    .line 322
    .line 323
    iget-object v2, v4, Lkq;->β:Ljava/lang/Object;

    .line 324
    .line 325
    iget-object v1, v1, Lmq;->α:Ljava/lang/String;

    .line 326
    .line 327
    new-instance v3, Lθ;

    .line 328
    .line 329
    const/4 v4, 0x3

    .line 330
    invoke-direct {v3, v4, v5}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 334
    .line 335
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-direct {v4, v6}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    new-instance v6, Lwa;

    .line 341
    .line 342
    const/4 v7, 0x7

    .line 343
    invoke-direct {v6, v4, v7, v3}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    if-nez v1, :cond_14

    .line 347
    .line 348
    invoke-virtual {v0, v2}, Lpq;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    if-nez v1, :cond_14

    .line 353
    .line 354
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    const-string v1, "identity:"

    .line 359
    .line 360
    invoke-static {v1, v0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    :cond_14
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 365
    .line 366
    .line 367
    move-result-wide v7

    .line 368
    sget-object v3, Lpq;->ζ:Ljava/lang/Object;

    .line 369
    .line 370
    monitor-enter v3

    .line 371
    :try_start_1
    sget-object v0, Lpq;->η:Lnq;

    .line 372
    .line 373
    invoke-virtual {v0, v1}, Lnq;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, Liq;

    .line 378
    .line 379
    if-eqz v0, :cond_16

    .line 380
    .line 381
    iget-wide v9, v0, Liq;->β:J

    .line 382
    .line 383
    sub-long/2addr v7, v9

    .line 384
    const-wide/32 v9, 0x493e0

    .line 385
    .line 386
    .line 387
    cmp-long v7, v7, v9

    .line 388
    .line 389
    if-gtz v7, :cond_15

    .line 390
    .line 391
    goto :goto_a

    .line 392
    :cond_15
    const/4 v0, 0x0

    .line 393
    :goto_a
    if-eqz v0, :cond_16

    .line 394
    .line 395
    iget-object v0, v0, Liq;->α:Lf8;

    .line 396
    .line 397
    invoke-virtual {v6, v0}, Lwa;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    new-instance v0, Loq;

    .line 401
    .line 402
    const/4 v1, 0x0

    .line 403
    invoke-direct {v0, v4, v1}, Loq;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 404
    .line 405
    .line 406
    monitor-exit v3

    .line 407
    goto :goto_c

    .line 408
    :catchall_1
    move-exception v0

    .line 409
    goto :goto_d

    .line 410
    :cond_16
    :try_start_2
    sget-object v0, Lpq;->θ:Ljava/util/HashMap;

    .line 411
    .line 412
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v7

    .line 416
    check-cast v7, Ljq;

    .line 417
    .line 418
    if-eqz v7, :cond_17

    .line 419
    .line 420
    iget-object v0, v7, Ljq;->β:Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_17
    new-instance v7, Ljq;

    .line 427
    .line 428
    const/4 v10, 0x1

    .line 429
    new-array v8, v10, [La80;

    .line 430
    .line 431
    const/16 v16, 0x0

    .line 432
    .line 433
    aput-object v6, v8, v16

    .line 434
    .line 435
    invoke-static {v8}, Lyh;->г([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    invoke-direct {v7, v2, v6}, Ljq;-><init>(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    sget-object v0, Lpq;->ε:Landroid/os/Handler;

    .line 446
    .line 447
    new-instance v2, Lea;

    .line 448
    .line 449
    const/4 v6, 0x2

    .line 450
    invoke-direct {v2, v1, v6}, Lea;-><init>(Ljava/lang/String;I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 454
    .line 455
    .line 456
    :goto_b
    monitor-exit v3

    .line 457
    new-instance v0, Loq;

    .line 458
    .line 459
    const/4 v10, 0x1

    .line 460
    invoke-direct {v0, v4, v10}, Loq;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 461
    .line 462
    .line 463
    :goto_c
    iput-object v0, v5, Lp7;->ε:Loq;

    .line 464
    .line 465
    return-void

    .line 466
    :goto_d
    monitor-exit v3

    .line 467
    throw v0

    .line 468
    :cond_18
    :goto_e
    return-void

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static γ(Lm7;)Z
    .locals 4

    .line 1
    const-string v0, "auto_scroll_image_enabled"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v2, "auto_scroll_article_enabled"

    .line 9
    .line 10
    invoke-static {v2, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq p0, v3, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    if-ne p0, v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    return v2

    .line 39
    :cond_2
    return v0

    .line 40
    :cond_3
    :goto_0
    return v1
.end method

.method public static δ(Lp70;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lr0;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-direct {v0, v1, p0}, Lr0;-><init>(ILp70;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lt7;->β:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static ε(Lp7;)V
    .locals 5

    .line 1
    sget-object v0, Lt7;->ε:Lp7;

    .line 2
    .line 3
    if-ne v0, p0, :cond_8

    .line 4
    .line 5
    iget-boolean v0, p0, Lp7;->θ:Z

    .line 6
    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iget-boolean v0, p0, Lp7;->η:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    sget-boolean v0, Lt7;->ζ:Z

    .line 16
    .line 17
    if-eqz v0, :cond_8

    .line 18
    .line 19
    sget-boolean v0, Lt7;->η:Z

    .line 20
    .line 21
    if-nez v0, :cond_8

    .line 22
    .line 23
    const-string v0, "auto_scroll_next_enabled"

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    iget-object v0, p0, Lp7;->δ:Lm7;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    invoke-static {v0}, Lt7;->γ(Lm7;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    const-string v1, "auto_scroll_image_dwell_seconds"

    .line 46
    .line 47
    const/16 v2, 0xa

    .line 48
    .line 49
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :catchall_0
    const-string v1, "auto_scroll_article_dwell_seconds"

    .line 58
    .line 59
    const/16 v3, 0x14

    .line 60
    .line 61
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v4, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    :catchall_1
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    const/4 v4, 0x3

    .line 77
    if-eq v0, v1, :cond_6

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    if-eq v0, v1, :cond_5

    .line 81
    .line 82
    if-ne v0, v4, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-static {}, Lγ;->κ()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_5
    const/4 v0, 0x5

    .line 90
    const/16 v1, 0x78

    .line 91
    .line 92
    invoke-static {v3, v0, v1}, Lj81;->μ(III)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    goto :goto_0

    .line 97
    :cond_6
    const/16 v0, 0x3c

    .line 98
    .line 99
    invoke-static {v2, v4, v0}, Lj81;->μ(III)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    :goto_0
    int-to-long v0, v0

    .line 104
    const-wide/16 v2, 0x3e8

    .line 105
    .line 106
    mul-long/2addr v0, v2

    .line 107
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    goto :goto_2

    .line 112
    :cond_7
    :goto_1
    const/4 v0, 0x0

    .line 113
    :goto_2
    if-eqz v0, :cond_8

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    invoke-static {p0}, Lt7;->α(Lp7;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Lν;

    .line 123
    .line 124
    const/4 v3, 0x3

    .line 125
    invoke-direct {v2, v3, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iput-object v2, p0, Lp7;->ζ:Lν;

    .line 129
    .line 130
    sget-object p0, Lt7;->β:Landroid/os/Handler;

    .line 131
    .line 132
    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 133
    .line 134
    .line 135
    :cond_8
    :goto_3
    return-void
.end method
