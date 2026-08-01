.class public final Lcf0;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Ljava/util/Set;

.field public final synthetic β:Lz81;

.field public final synthetic γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic δ:Z

.field public final synthetic ε:Z

.field public final synthetic ζ:Ln5;

.field public final synthetic η:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic θ:Lcom/example/dyhelper/MainHook;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lz81;Ljava/util/concurrent/atomic/AtomicBoolean;ZZLn5;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/example/dyhelper/MainHook;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcf0;->α:Ljava/util/Set;

    .line 2
    .line 3
    iput-object p2, p0, Lcf0;->β:Lz81;

    .line 4
    .line 5
    iput-object p3, p0, Lcf0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    iput-boolean p4, p0, Lcf0;->δ:Z

    .line 8
    .line 9
    iput-boolean p5, p0, Lcf0;->ε:Z

    .line 10
    .line 11
    iput-object p6, p0, Lcf0;->ζ:Ln5;

    .line 12
    .line 13
    iput-object p7, p0, Lcf0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    iput-object p8, p0, Lcf0;->θ:Lcom/example/dyhelper/MainHook;

    .line 16
    .line 17
    invoke-direct {p0}, Lm01;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v3, Ls62;->α:Ls62;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lk01;->γ:[Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    aget-object v0, v0, v4

    .line 14
    .line 15
    instance-of v5, v0, Landroid/content/Context;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    check-cast v0, Landroid/content/Context;

    .line 21
    .line 22
    move-object v5, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v5, v6

    .line 25
    :goto_0
    if-nez v5, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object v0, v2, Lcf0;->α:Ljava/util/Set;

    .line 29
    .line 30
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    move-object v7, v3

    .line 39
    iget-object v3, v2, Lcf0;->β:Lz81;

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, v3, Lz81;->α:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v3, "DYHelper: \u8df3\u8fc7\u975e\u76ee\u6807 Context attach, context="

    .line 52
    .line 53
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, ", lppkg="

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    iget-object v0, v2, Lcf0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    const/4 v8, 0x1

    .line 78
    invoke-virtual {v0, v4, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const-string v9, "DYHelper"

    .line 83
    .line 84
    if-nez v0, :cond_3

    .line 85
    .line 86
    const-string v0, "attach-stage already initialized, skip duplicate"

    .line 87
    .line 88
    invoke-static {v9, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    :try_start_0
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    new-instance v10, Leo1;

    .line 99
    .line 100
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    move-object v0, v10

    .line 104
    :goto_1
    instance-of v10, v0, Leo1;

    .line 105
    .line 106
    if-eqz v10, :cond_4

    .line 107
    .line 108
    move-object v0, v6

    .line 109
    :cond_4
    check-cast v0, Ljava/lang/ClassLoader;

    .line 110
    .line 111
    if-nez v0, :cond_5

    .line 112
    .line 113
    iget-object v0, v3, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 114
    .line 115
    :cond_5
    move-object v10, v0

    .line 116
    iget-object v11, v3, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 117
    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iput-object v10, v3, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 122
    .line 123
    :try_start_1
    const-class v0, Landroid/app/Application;

    .line 124
    .line 125
    const-string v12, "onCreate"

    .line 126
    .line 127
    new-instance v13, Loj0;

    .line 128
    .line 129
    const/16 v14, 0x13

    .line 130
    .line 131
    invoke-direct {v13, v14}, Loj0;-><init>(I)V

    .line 132
    .line 133
    .line 134
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    invoke-static {v0, v12, v13}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    :try_start_2
    const-string v12, "ModuleContextProvider init \u5931\u8d25"

    .line 144
    .line 145
    invoke-static {v9, v12, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 146
    .line 147
    .line 148
    :goto_2
    move-object v12, v7

    .line 149
    goto :goto_3

    .line 150
    :catchall_2
    move-exception v0

    .line 151
    new-instance v12, Leo1;

    .line 152
    .line 153
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-static {v12}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    const-string v12, "attach-stage \u66f4\u65b0\u6a21\u5757\u5bbf\u4e3b\u4e0a\u4e0b\u6587\u5931\u8d25"

    .line 163
    .line 164
    invoke-static {v9, v12, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    iget-boolean v0, v2, Lcf0;->δ:Z

    .line 168
    .line 169
    const-wide/32 v12, 0x5f49d

    .line 170
    .line 171
    .line 172
    invoke-static {v5, v0, v12, v13}, Lx;->γ(Landroid/content/Context;ZJ)Z

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    iget-boolean v0, v2, Lcf0;->ε:Z

    .line 177
    .line 178
    const-wide/32 v13, 0x5f5c9

    .line 179
    .line 180
    .line 181
    invoke-static {v5, v0, v13, v14}, Lx;->γ(Landroid/content/Context;ZJ)Z

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v10}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    if-eq v11, v10, :cond_7

    .line 198
    .line 199
    move v10, v8

    .line 200
    goto :goto_4

    .line 201
    :cond_7
    move v10, v4

    .line 202
    :goto_4
    const-string v11, "@"

    .line 203
    .line 204
    const-string v15, ", replacedEarlyLoader="

    .line 205
    .line 206
    const-string v8, "attach-stage \u5bbf\u4e3b\u73af\u5883\u5df2\u786e\u8ba4 loader="

    .line 207
    .line 208
    invoke-static {v14, v8, v0, v11, v15}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const-string v8, ", use3903Branch="

    .line 213
    .line 214
    const-string v11, ", use390601Branch="

    .line 215
    .line 216
    invoke-static {v0, v10, v8, v12, v11}, Lnx;->Δ(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const/4 v8, 0x4

    .line 227
    invoke-static {v9, v0, v6, v8, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 231
    .line 232
    invoke-static {v5}, Los;->ο(Landroid/content/Context;)Lks;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iget-object v10, v0, Lks;->γ:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    if-eqz v11, :cond_8

    .line 243
    .line 244
    const-string v10, "unknown"

    .line 245
    .line 246
    :cond_8
    iget-object v11, v0, Lks;->α:Ljava/lang/String;

    .line 247
    .line 248
    iget-wide v14, v0, Lks;->β:J

    .line 249
    .line 250
    const-string v0, ", versionName="

    .line 251
    .line 252
    const-string v6, ", versionCode="

    .line 253
    .line 254
    const-string v8, "host version, package="

    .line 255
    .line 256
    invoke-static {v8, v11, v0, v10, v6}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, Lze0;

    .line 271
    .line 272
    invoke-direct {v0, v1, v5, v4}, Lze0;-><init>(Lk01;Landroid/content/Context;I)V

    .line 273
    .line 274
    .line 275
    iget-object v6, v2, Lcf0;->ζ:Ln5;

    .line 276
    .line 277
    const-string v8, "BlacklistVerifier"

    .line 278
    .line 279
    invoke-virtual {v6, v8, v0}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 280
    .line 281
    .line 282
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 283
    .line 284
    invoke-virtual {v0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_9

    .line 289
    .line 290
    const-string v0, "DYHelper: all attach-stage features disabled by blacklist"

    .line 291
    .line 292
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_9
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 297
    .line 298
    instance-of v8, v0, Landroid/app/Application;

    .line 299
    .line 300
    if-eqz v8, :cond_a

    .line 301
    .line 302
    check-cast v0, Landroid/app/Application;

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_a
    const/4 v0, 0x0

    .line 306
    :goto_5
    if-eqz v0, :cond_b

    .line 307
    .line 308
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-nez v0, :cond_c

    .line 313
    .line 314
    :cond_b
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-nez v0, :cond_c

    .line 319
    .line 320
    move-object v0, v5

    .line 321
    :cond_c
    :try_start_3
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 322
    .line 323
    .line 324
    goto :goto_6

    .line 325
    :catchall_3
    move-exception v0

    .line 326
    new-instance v7, Leo1;

    .line 327
    .line 328
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 329
    .line 330
    .line 331
    :goto_6
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    if-eqz v0, :cond_d

    .line 336
    .line 337
    const-string v7, "attach-stage \u521d\u59cb\u5316\u914d\u7f6e\u5931\u8d25"

    .line 338
    .line 339
    invoke-static {v9, v7, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    :cond_d
    :try_start_4
    iget-object v7, v2, Lcf0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    const/4 v8, 0x1

    .line 348
    invoke-virtual {v7, v4, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 349
    .line 350
    .line 351
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 352
    if-nez v0, :cond_e

    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_e
    :try_start_5
    invoke-static {v3, v6, v12, v13}, Lkn0;->Δ(Lz81;Ln5;ZZ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 356
    .line 357
    .line 358
    const-string v0, "\u5df2\u4f7f\u7528 attach \u540e\u5bbf\u4e3b ClassLoader \u5b89\u88c5\u5ef6\u8fdf Hook"

    .line 359
    .line 360
    const/4 v4, 0x4

    .line 361
    const/4 v7, 0x0

    .line 362
    invoke-static {v9, v0, v7, v4, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    sget v0, Loe0;->α:I

    .line 366
    .line 367
    const/4 v8, 0x1

    .line 368
    goto :goto_8

    .line 369
    :catchall_4
    move-exception v0

    .line 370
    :try_start_6
    invoke-virtual {v7, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 371
    .line 372
    .line 373
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 374
    :catchall_5
    move-exception v0

    .line 375
    const-string v7, "attach-stage \u5ef6\u8fdf Hook \u5b89\u88c5\u5931\u8d25"

    .line 376
    .line 377
    invoke-static {v9, v7, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    :goto_7
    new-instance v0, Laf0;

    .line 381
    .line 382
    invoke-direct {v0, v3, v12, v13, v4}, Laf0;-><init>(Lz81;ZZI)V

    .line 383
    .line 384
    .line 385
    const-string v4, "CleanModeHookAttachRetry"

    .line 386
    .line 387
    invoke-virtual {v6, v4, v0}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 388
    .line 389
    .line 390
    new-instance v0, Lwe0;

    .line 391
    .line 392
    const/4 v8, 0x1

    .line 393
    invoke-direct {v0, v3, v12, v8}, Lwe0;-><init>(Lz81;ZI)V

    .line 394
    .line 395
    .line 396
    const-string v4, "TopTabFilterHookAttachRetry"

    .line 397
    .line 398
    invoke-virtual {v6, v4, v0}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 399
    .line 400
    .line 401
    :goto_8
    new-instance v0, Lze0;

    .line 402
    .line 403
    invoke-direct {v0, v1, v5, v8}, Lze0;-><init>(Lk01;Landroid/content/Context;I)V

    .line 404
    .line 405
    .line 406
    const-string v4, "BetaNotice"

    .line 407
    .line 408
    invoke-virtual {v6, v4, v0}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 409
    .line 410
    .line 411
    new-instance v0, Lxe0;

    .line 412
    .line 413
    const/4 v4, 0x2

    .line 414
    invoke-direct {v0, v5, v4}, Lxe0;-><init>(Landroid/content/Context;I)V

    .line 415
    .line 416
    .line 417
    const-string v4, "BetaVerifier"

    .line 418
    .line 419
    invoke-virtual {v6, v4, v0}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 420
    .line 421
    .line 422
    new-instance v0, Lbf0;

    .line 423
    .line 424
    move-object v4, v6

    .line 425
    iget-object v6, v2, Lcf0;->θ:Lcom/example/dyhelper/MainHook;

    .line 426
    .line 427
    move v5, v12

    .line 428
    invoke-direct/range {v0 .. v6}, Lbf0;-><init>(Lk01;Lcf0;Lz81;Ln5;ZLcom/example/dyhelper/MainHook;)V

    .line 429
    .line 430
    .line 431
    const-string v1, "DyDexKitManager"

    .line 432
    .line 433
    invoke-virtual {v4, v1, v0}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 434
    .line 435
    .line 436
    return-void
.end method
