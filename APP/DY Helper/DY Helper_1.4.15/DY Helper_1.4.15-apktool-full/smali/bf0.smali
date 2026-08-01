.class public final synthetic Lbf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lf8;ZLjava/lang/String;Lfv;)V
    .locals 1

    .line 18
    const/4 v0, 0x2

    iput v0, p0, Lbf0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf0;->η:Ljava/lang/Object;

    iput-object p2, p0, Lbf0;->θ:Ljava/lang/Object;

    iput-boolean p3, p0, Lbf0;->ζ:Z

    iput-object p4, p0, Lbf0;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lbf0;->κ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroid/app/Activity;Lf8;ZLjava/lang/String;)V
    .locals 1

    .line 19
    const/4 v0, 0x1

    iput v0, p0, Lbf0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf0;->η:Ljava/lang/Object;

    iput-object p2, p0, Lbf0;->θ:Ljava/lang/Object;

    iput-object p3, p0, Lbf0;->ι:Ljava/lang/Object;

    iput-boolean p4, p0, Lbf0;->ζ:Z

    iput-object p5, p0, Lbf0;->κ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lk01;Lcf0;Lz81;Ln5;ZLcom/example/dyhelper/MainHook;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput p2, p0, Lbf0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbf0;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lbf0;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lbf0;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p5, p0, Lbf0;->ζ:Z

    .line 14
    .line 15
    iput-object p6, p0, Lbf0;->κ:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method private final β()Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lbf0;->η:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lk01;

    .line 6
    .line 7
    iget-object v2, v0, Lbf0;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lz81;

    .line 10
    .line 11
    iget-object v3, v0, Lbf0;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ln5;

    .line 14
    .line 15
    iget-boolean v4, v0, Lbf0;->ζ:Z

    .line 16
    .line 17
    iget-object v0, v0, Lbf0;->κ:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, v0

    .line 20
    check-cast v5, Lcom/example/dyhelper/MainHook;

    .line 21
    .line 22
    iget-object v0, v1, Lk01;->β:Ljava/lang/Object;

    .line 23
    .line 24
    instance-of v1, v0, Landroid/app/Application;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Landroid/app/Application;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, "DYHelper: Application not available, skipping DyDexKitManager init"

    .line 35
    .line 36
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_30

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    :cond_2
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    const-string v0, ""

    .line 57
    .line 58
    :cond_3
    iget-object v7, v2, Lz81;->α:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    const/4 v9, 0x1

    .line 65
    const/4 v10, 0x0

    .line 66
    if-nez v8, :cond_4

    .line 67
    .line 68
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-nez v8, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-nez v8, :cond_4

    .line 79
    .line 80
    iget-object v8, v2, Lz81;->β:Ljava/lang/String;

    .line 81
    .line 82
    const-string v11, "initFromLoadPackage skipped: package mismatch, context="

    .line 83
    .line 84
    const-string v12, ", lppkg="

    .line 85
    .line 86
    const-string v13, ", process="

    .line 87
    .line 88
    invoke-static {v11, v0, v12, v7, v13}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_a

    .line 103
    .line 104
    :cond_4
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_5

    .line 109
    .line 110
    move-object v12, v7

    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move-object v12, v0

    .line 113
    :goto_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :try_start_0
    invoke-virtual {v0, v12, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    goto :goto_2

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    new-instance v7, Leo1;

    .line 124
    .line 125
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object v0, v7

    .line 129
    :goto_2
    instance-of v7, v0, Leo1;

    .line 130
    .line 131
    if-eqz v7, :cond_6

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    :cond_6
    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    if-eqz v7, :cond_7

    .line 141
    .line 142
    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 143
    .line 144
    if-nez v7, :cond_9

    .line 145
    .line 146
    :cond_7
    iget-object v7, v2, Lz81;->δ:Landroid/content/pm/ApplicationInfo;

    .line 147
    .line 148
    if-eqz v7, :cond_8

    .line 149
    .line 150
    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_8
    const/4 v7, 0x0

    .line 154
    :goto_3
    if-nez v7, :cond_9

    .line 155
    .line 156
    const-string v7, ""

    .line 157
    .line 158
    :cond_9
    const-wide/16 v13, 0x0

    .line 159
    .line 160
    if-eqz v0, :cond_a

    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 163
    .line 164
    .line 165
    move-result-wide v15

    .line 166
    goto :goto_4

    .line 167
    :cond_a
    move-wide v15, v13

    .line 168
    :goto_4
    if-eqz v0, :cond_b

    .line 169
    .line 170
    iget-object v8, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_b
    const/4 v8, 0x0

    .line 174
    :goto_5
    if-nez v8, :cond_c

    .line 175
    .line 176
    const-string v8, ""

    .line 177
    .line 178
    :cond_c
    if-eqz v0, :cond_d

    .line 179
    .line 180
    iget-wide v13, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 181
    .line 182
    :goto_6
    move-wide/from16 v17, v13

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_d
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 186
    .line 187
    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 191
    .line 192
    .line 193
    move-result-wide v17

    .line 194
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 195
    .line 196
    .line 197
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 198
    goto :goto_7

    .line 199
    :catchall_1
    move-exception v0

    .line 200
    new-instance v11, Leo1;

    .line 201
    .line 202
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    move-object v0, v11

    .line 206
    :goto_7
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    instance-of v13, v0, Leo1;

    .line 211
    .line 212
    if-eqz v13, :cond_e

    .line 213
    .line 214
    move-object v0, v11

    .line 215
    :cond_e
    check-cast v0, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 218
    .line 219
    .line 220
    move-result-wide v13

    .line 221
    goto :goto_6

    .line 222
    :goto_8
    iget-object v0, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 223
    .line 224
    if-nez v0, :cond_f

    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    if-nez v11, :cond_10

    .line 238
    .line 239
    move-object v11, v1

    .line 240
    :cond_10
    new-instance v13, Lpx;

    .line 241
    .line 242
    move-wide/from16 v19, v15

    .line 243
    .line 244
    move-object/from16 v16, v7

    .line 245
    .line 246
    move-object v7, v11

    .line 247
    move-object v11, v13

    .line 248
    move-wide/from16 v13, v19

    .line 249
    .line 250
    move-object v15, v8

    .line 251
    invoke-direct/range {v11 .. v18}, Lpx;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V

    .line 252
    .line 253
    .line 254
    sget-object v8, Lox;->α:Ljava/lang/Object;

    .line 255
    .line 256
    monitor-enter v8

    .line 257
    :try_start_2
    sget-object v6, Lox;->ε:Lpx;

    .line 258
    .line 259
    if-eqz v6, :cond_11

    .line 260
    .line 261
    invoke-virtual {v6, v11}, Lpx;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-nez v6, :cond_11

    .line 266
    .line 267
    sget-object v6, Lox;->α:Ljava/lang/Object;

    .line 268
    .line 269
    invoke-static {}, Lox;->β()V

    .line 270
    .line 271
    .line 272
    const-string v6, "meta changed"

    .line 273
    .line 274
    invoke-static {v6}, Lox;->γ(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    goto :goto_9

    .line 278
    :catchall_2
    move-exception v0

    .line 279
    goto/16 :goto_31

    .line 280
    .line 281
    :cond_11
    :goto_9
    sput-object v16, Lox;->ζ:Ljava/lang/String;

    .line 282
    .line 283
    sput-object v0, Lox;->η:Ljava/lang/ClassLoader;

    .line 284
    .line 285
    sput-object v11, Lox;->ε:Lpx;

    .line 286
    .line 287
    new-instance v0, Ljx;

    .line 288
    .line 289
    invoke-direct {v0, v7, v10}, Ljx;-><init>(Landroid/content/Context;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v11}, Ljx;->α(Lpx;)V

    .line 293
    .line 294
    .line 295
    sput-object v0, Lox;->δ:Ljx;

    .line 296
    .line 297
    sget-object v0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 298
    .line 299
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 300
    .line 301
    .line 302
    monitor-exit v8

    .line 303
    const-string v0, "init ok, host="

    .line 304
    .line 305
    const-string v6, "/"

    .line 306
    .line 307
    invoke-static {v0, v12, v13, v14, v6}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const-string v6, "/"

    .line 312
    .line 313
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    const-string v6, ", module=60/1.4.15"

    .line 320
    .line 321
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, Lox;->ξ(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    :goto_a
    invoke-static {}, Lui1;->Α()Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-nez v0, :cond_12

    .line 336
    .line 337
    invoke-static {v1}, Lui1;->π(Landroid/content/Context;)V

    .line 338
    .line 339
    .line 340
    :cond_12
    const-string v0, "FeedGestureHookConfig"

    .line 341
    .line 342
    new-instance v6, Lve0;

    .line 343
    .line 344
    const/4 v7, 0x6

    .line 345
    invoke-direct {v6, v2, v7}, Lve0;-><init>(Lz81;I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v0, v6}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 349
    .line 350
    .line 351
    const-string v0, "FeedDoubleTapLikeBlockHook"

    .line 352
    .line 353
    new-instance v6, Lve0;

    .line 354
    .line 355
    const/4 v8, 0x2

    .line 356
    invoke-direct {v6, v2, v8}, Lve0;-><init>(Lz81;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3, v0, v6}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 360
    .line 361
    .line 362
    const-string v0, "FeedRightDislikeButtonHook"

    .line 363
    .line 364
    new-instance v6, Lve0;

    .line 365
    .line 366
    const/4 v11, 0x3

    .line 367
    invoke-direct {v6, v2, v11}, Lve0;-><init>(Lz81;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3, v0, v6}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 371
    .line 372
    .line 373
    const-string v0, "FeedRightControlsHideHook"

    .line 374
    .line 375
    new-instance v6, Lwe0;

    .line 376
    .line 377
    invoke-direct {v6, v2, v4, v10}, Lwe0;-><init>(Lz81;ZI)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3, v0, v6}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 381
    .line 382
    .line 383
    const-string v0, "CommentControlOpacityHook"

    .line 384
    .line 385
    new-instance v6, Lve0;

    .line 386
    .line 387
    const/4 v12, 0x4

    .line 388
    invoke-direct {v6, v2, v12}, Lve0;-><init>(Lz81;I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3, v0, v6}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 392
    .line 393
    .line 394
    sget-object v0, Lyl;->α:Lyl;

    .line 395
    .line 396
    const-string v6, "comment_keyboard_entrance_hide"

    .line 397
    .line 398
    sget-object v13, Lyl;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 399
    .line 400
    invoke-virtual {v13, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 401
    .line 402
    .line 403
    move-result v13

    .line 404
    const/4 v14, 0x5

    .line 405
    if-nez v13, :cond_13

    .line 406
    .line 407
    goto :goto_b

    .line 408
    :cond_13
    sget-object v13, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 409
    .line 410
    new-instance v13, Lul;

    .line 411
    .line 412
    invoke-direct {v13, v14}, Lul;-><init>(I)V

    .line 413
    .line 414
    .line 415
    invoke-static {v6, v13}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 416
    .line 417
    .line 418
    new-instance v13, Lul;

    .line 419
    .line 420
    invoke-direct {v13, v7}, Lul;-><init>(I)V

    .line 421
    .line 422
    .line 423
    invoke-static {v6, v13}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 424
    .line 425
    .line 426
    const-string v6, "r931d7e30ef229d29"

    .line 427
    .line 428
    const-string v13, "DexKit prewarm provider registered"

    .line 429
    .line 430
    invoke-static {v6, v13}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    :goto_b
    iget-object v6, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 434
    .line 435
    invoke-virtual {v0, v6}, Lyl;->ε(Ljava/lang/ClassLoader;)V

    .line 436
    .line 437
    .line 438
    sget-object v0, Ljm;->α:Ljm;

    .line 439
    .line 440
    const-string v6, "comment_search_entry_hide"

    .line 441
    .line 442
    invoke-static {}, Ljm;->η()Z

    .line 443
    .line 444
    .line 445
    move-result v13

    .line 446
    const/16 v15, 0x1d

    .line 447
    .line 448
    const/16 v14, 0x1c

    .line 449
    .line 450
    if-nez v13, :cond_14

    .line 451
    .line 452
    goto :goto_c

    .line 453
    :cond_14
    sget-object v13, Ljm;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 454
    .line 455
    invoke-virtual {v13, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 456
    .line 457
    .line 458
    move-result v13

    .line 459
    if-nez v13, :cond_15

    .line 460
    .line 461
    goto :goto_c

    .line 462
    :cond_15
    sget-object v13, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 463
    .line 464
    new-instance v13, Lul;

    .line 465
    .line 466
    invoke-direct {v13, v14}, Lul;-><init>(I)V

    .line 467
    .line 468
    .line 469
    invoke-static {v6, v13}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 470
    .line 471
    .line 472
    new-instance v13, Lul;

    .line 473
    .line 474
    invoke-direct {v13, v15}, Lul;-><init>(I)V

    .line 475
    .line 476
    .line 477
    invoke-static {v6, v13}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 478
    .line 479
    .line 480
    const-string v6, "DexKit prewarm provider registered"

    .line 481
    .line 482
    const-string v13, "rb57159a7dbcb5c6"

    .line 483
    .line 484
    invoke-static {v13, v6}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    :goto_c
    iget-object v6, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 488
    .line 489
    invoke-virtual {v0, v6}, Ljm;->ε(Ljava/lang/ClassLoader;)V

    .line 490
    .line 491
    .line 492
    const/16 v0, 0x12

    .line 493
    .line 494
    const/16 v6, 0x1b

    .line 495
    .line 496
    if-eqz v4, :cond_18

    .line 497
    .line 498
    sget-object v13, Laf;->α:Laf;

    .line 499
    .line 500
    const-string v7, "chapter_ad_skip_3903"

    .line 501
    .line 502
    sget-object v8, Laf;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 503
    .line 504
    invoke-virtual {v8, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 505
    .line 506
    .line 507
    move-result v8

    .line 508
    if-nez v8, :cond_16

    .line 509
    .line 510
    goto :goto_d

    .line 511
    :cond_16
    sget-object v8, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 512
    .line 513
    new-instance v8, Lwe;

    .line 514
    .line 515
    invoke-direct {v8, v11}, Lwe;-><init>(I)V

    .line 516
    .line 517
    .line 518
    invoke-static {v7, v8}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 519
    .line 520
    .line 521
    new-instance v8, Lwe;

    .line 522
    .line 523
    invoke-direct {v8, v12}, Lwe;-><init>(I)V

    .line 524
    .line 525
    .line 526
    invoke-static {v7, v8}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 527
    .line 528
    .line 529
    const-string v7, "DexKit prewarm provider registered"

    .line 530
    .line 531
    invoke-static {v7}, Laf;->η(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    :goto_d
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 535
    .line 536
    invoke-virtual {v13, v7}, Laf;->ε(Ljava/lang/ClassLoader;)V

    .line 537
    .line 538
    .line 539
    sget-object v7, Lm82;->α:Lm82;

    .line 540
    .line 541
    const-string v8, "video_speed_3903"

    .line 542
    .line 543
    sget-object v11, Lm82;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 544
    .line 545
    invoke-virtual {v11, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    if-nez v11, :cond_17

    .line 550
    .line 551
    goto :goto_e

    .line 552
    :cond_17
    sget-object v11, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 553
    .line 554
    new-instance v11, Lj72;

    .line 555
    .line 556
    const/16 v13, 0x11

    .line 557
    .line 558
    invoke-direct {v11, v13}, Lj72;-><init>(I)V

    .line 559
    .line 560
    .line 561
    invoke-static {v8, v11}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 562
    .line 563
    .line 564
    new-instance v11, Lj72;

    .line 565
    .line 566
    invoke-direct {v11, v0}, Lj72;-><init>(I)V

    .line 567
    .line 568
    .line 569
    invoke-static {v8, v11}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 570
    .line 571
    .line 572
    const-string v8, "DexKit prewarm provider registered"

    .line 573
    .line 574
    invoke-static {v8}, Lm82;->ζ(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    :goto_e
    iget-object v8, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 578
    .line 579
    invoke-virtual {v7, v8}, Lm82;->γ(Ljava/lang/ClassLoader;)V

    .line 580
    .line 581
    .line 582
    goto :goto_10

    .line 583
    :cond_18
    sget-object v7, Lbf;->α:Lbf;

    .line 584
    .line 585
    const-string v8, "chapter_ad_skip"

    .line 586
    .line 587
    sget-object v11, Lbf;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 588
    .line 589
    invoke-virtual {v11, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 590
    .line 591
    .line 592
    move-result v11

    .line 593
    if-nez v11, :cond_19

    .line 594
    .line 595
    goto :goto_f

    .line 596
    :cond_19
    sget-object v11, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 597
    .line 598
    new-instance v11, Ln7;

    .line 599
    .line 600
    invoke-direct {v11, v6}, Ln7;-><init>(I)V

    .line 601
    .line 602
    .line 603
    invoke-static {v8, v11}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 604
    .line 605
    .line 606
    new-instance v11, Ln7;

    .line 607
    .line 608
    invoke-direct {v11, v14}, Ln7;-><init>(I)V

    .line 609
    .line 610
    .line 611
    invoke-static {v8, v11}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 612
    .line 613
    .line 614
    const-string v8, "DexKit prewarm provider registered"

    .line 615
    .line 616
    invoke-static {v8}, Lbf;->ζ(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    :goto_f
    iget-object v8, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 620
    .line 621
    invoke-virtual {v7, v8}, Lbf;->δ(Ljava/lang/ClassLoader;)V

    .line 622
    .line 623
    .line 624
    :goto_10
    sget-object v7, Lhf0;->α:Lhf0;

    .line 625
    .line 626
    const-string v8, "feed_long_press_speed_resolver"

    .line 627
    .line 628
    sget-object v11, Lm20;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 629
    .line 630
    invoke-virtual {v11, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 631
    .line 632
    .line 633
    move-result v11

    .line 634
    if-nez v11, :cond_1a

    .line 635
    .line 636
    goto :goto_11

    .line 637
    :cond_1a
    sget-object v11, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 638
    .line 639
    new-instance v11, Lq00;

    .line 640
    .line 641
    const/16 v13, 0x1a

    .line 642
    .line 643
    invoke-direct {v11, v13}, Lq00;-><init>(I)V

    .line 644
    .line 645
    .line 646
    invoke-static {v8, v11}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 647
    .line 648
    .line 649
    new-instance v11, Lq00;

    .line 650
    .line 651
    invoke-direct {v11, v6}, Lq00;-><init>(I)V

    .line 652
    .line 653
    .line 654
    invoke-static {v8, v11}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 655
    .line 656
    .line 657
    :goto_11
    invoke-virtual {v7, v2}, Lhf0;->α(Lz81;)V

    .line 658
    .line 659
    .line 660
    const-string v7, "DYHelper: BravoPublishHideResolver \u521d\u59cb\u5316\u914d\u7f6e\u6210\u529f"

    .line 661
    .line 662
    invoke-static {v7}, Lux;->ρ(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    const-string v7, "DYHelper: DyDexKitManager init success, starting CommentBookmarkHook init"

    .line 666
    .line 667
    invoke-static {v7}, Lux;->ρ(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    const-string v7, "DYHelper: Registering DexKit prewarm providers"

    .line 671
    .line 672
    invoke-static {v7}, Lux;->ρ(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    sget-object v7, Lst;->α:Lst;

    .line 676
    .line 677
    const-string v8, "display_name_resolver"

    .line 678
    .line 679
    sget-object v11, Lst;->ν:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 680
    .line 681
    invoke-virtual {v11, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 682
    .line 683
    .line 684
    move-result v11

    .line 685
    const/16 v13, 0xc

    .line 686
    .line 687
    const/16 v6, 0xd

    .line 688
    .line 689
    if-nez v11, :cond_1b

    .line 690
    .line 691
    goto :goto_12

    .line 692
    :cond_1b
    sget-object v11, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 693
    .line 694
    new-instance v11, Lhm;

    .line 695
    .line 696
    invoke-direct {v11, v13}, Lhm;-><init>(I)V

    .line 697
    .line 698
    .line 699
    invoke-static {v8, v11}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 700
    .line 701
    .line 702
    new-instance v11, Lhm;

    .line 703
    .line 704
    invoke-direct {v11, v6}, Lhm;-><init>(I)V

    .line 705
    .line 706
    .line 707
    invoke-static {v8, v11}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 708
    .line 709
    .line 710
    const-string v8, "r398844d0f2b2fd7c"

    .line 711
    .line 712
    const-string v11, "DisplayNameResolver DexKit \u9884\u70ed\u4efb\u52a1\u5df2\u6ce8\u518c"

    .line 713
    .line 714
    invoke-static {v8, v11}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    :goto_12
    sget-object v8, Lvh0;->α:Lvh0;

    .line 718
    .line 719
    const-string v8, "im_conversation_catalog_resolver"

    .line 720
    .line 721
    sget-object v11, Lci0;->λ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 722
    .line 723
    invoke-virtual {v11, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 724
    .line 725
    .line 726
    move-result v11

    .line 727
    const/16 v12, 0xf

    .line 728
    .line 729
    const/16 v0, 0xe

    .line 730
    .line 731
    if-nez v11, :cond_1c

    .line 732
    .line 733
    goto :goto_13

    .line 734
    :cond_1c
    sget-object v11, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 735
    .line 736
    new-instance v11, Lsh0;

    .line 737
    .line 738
    invoke-direct {v11, v0}, Lsh0;-><init>(I)V

    .line 739
    .line 740
    .line 741
    invoke-static {v8, v11}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 742
    .line 743
    .line 744
    new-instance v11, Lsh0;

    .line 745
    .line 746
    invoke-direct {v11, v12}, Lsh0;-><init>(I)V

    .line 747
    .line 748
    .line 749
    invoke-static {v8, v11}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 750
    .line 751
    .line 752
    const-string v8, "rf41ec7c6342b5bdc"

    .line 753
    .line 754
    const-string v11, "IMConversationCatalog DexKit \u9884\u70ed\u4efb\u52a1\u5df2\u6ce8\u518c"

    .line 755
    .line 756
    invoke-static {v8, v11}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    :goto_13
    sget-object v8, Lwi0;->α:Lwi0;

    .line 760
    .line 761
    const-string v11, "im_conversation_delete_host"

    .line 762
    .line 763
    sget-object v12, Lwi0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 764
    .line 765
    invoke-virtual {v12, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 766
    .line 767
    .line 768
    move-result v12

    .line 769
    if-nez v12, :cond_1d

    .line 770
    .line 771
    goto :goto_14

    .line 772
    :cond_1d
    sget-object v12, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 773
    .line 774
    new-instance v12, Lsh0;

    .line 775
    .line 776
    invoke-direct {v12, v14}, Lsh0;-><init>(I)V

    .line 777
    .line 778
    .line 779
    invoke-static {v11, v12}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 780
    .line 781
    .line 782
    new-instance v12, Lsh0;

    .line 783
    .line 784
    invoke-direct {v12, v15}, Lsh0;-><init>(I)V

    .line 785
    .line 786
    .line 787
    invoke-static {v11, v12}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 788
    .line 789
    .line 790
    const-string v11, "r542b803b7817851a"

    .line 791
    .line 792
    const-string v12, "\u4f1a\u8bdd\u5220\u9664 DexKit \u9884\u70ed\u4efb\u52a1\u5df2\u6ce8\u518c"

    .line 793
    .line 794
    invoke-static {v11, v12}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    :goto_14
    sget-object v11, Lfk1;->α:Lfk1;

    .line 798
    .line 799
    const-string v12, "quick_share_contact_resolver"

    .line 800
    .line 801
    sget-object v15, Lfk1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 802
    .line 803
    invoke-virtual {v15, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 804
    .line 805
    .line 806
    move-result v15

    .line 807
    if-nez v15, :cond_1e

    .line 808
    .line 809
    goto :goto_15

    .line 810
    :cond_1e
    sget-object v15, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 811
    .line 812
    new-instance v15, Lli1;

    .line 813
    .line 814
    invoke-direct {v15, v13}, Lli1;-><init>(I)V

    .line 815
    .line 816
    .line 817
    invoke-static {v12, v15}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 818
    .line 819
    .line 820
    new-instance v15, Lli1;

    .line 821
    .line 822
    invoke-direct {v15, v6}, Lli1;-><init>(I)V

    .line 823
    .line 824
    .line 825
    invoke-static {v12, v15}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 826
    .line 827
    .line 828
    :goto_15
    sget-object v12, Leu;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 829
    .line 830
    const-string v12, "douyin_duration_reminder_block"

    .line 831
    .line 832
    sget-object v15, Leu;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 833
    .line 834
    invoke-virtual {v15, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 835
    .line 836
    .line 837
    move-result v15

    .line 838
    if-nez v15, :cond_1f

    .line 839
    .line 840
    goto :goto_16

    .line 841
    :cond_1f
    sget-object v15, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 842
    .line 843
    new-instance v15, Lhm;

    .line 844
    .line 845
    const/16 v13, 0x12

    .line 846
    .line 847
    invoke-direct {v15, v13}, Lhm;-><init>(I)V

    .line 848
    .line 849
    .line 850
    invoke-static {v12, v15}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 851
    .line 852
    .line 853
    new-instance v13, Lhm;

    .line 854
    .line 855
    const/16 v15, 0x13

    .line 856
    .line 857
    invoke-direct {v13, v15}, Lhm;-><init>(I)V

    .line 858
    .line 859
    .line 860
    invoke-static {v12, v13}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 861
    .line 862
    .line 863
    const-string v12, "DexKit prewarm provider registered"

    .line 864
    .line 865
    invoke-static {v12}, Leu;->γ(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    :goto_16
    const-string v12, "gesture_enabled"

    .line 869
    .line 870
    invoke-static {v12, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 871
    .line 872
    .line 873
    move-result v12

    .line 874
    if-nez v12, :cond_21

    .line 875
    .line 876
    const-string v12, "feed_double_tap_like_block_enabled"

    .line 877
    .line 878
    invoke-static {v12, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 879
    .line 880
    .line 881
    move-result v12

    .line 882
    if-eqz v12, :cond_20

    .line 883
    .line 884
    goto :goto_17

    .line 885
    :cond_20
    const-string v0, "DYHelper: \u53cc\u51fb\u5165\u53e3\u4f9d\u8d56\u529f\u80fd\u5173\u95ed\uff0c\u8df3\u8fc7 DexKit \u9884\u70ed\u6ce8\u518c"

    .line 886
    .line 887
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    goto :goto_18

    .line 891
    :cond_21
    :goto_17
    const-string v12, "feed_double_tap_resolver"

    .line 892
    .line 893
    sget-object v13, Lc10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 894
    .line 895
    invoke-virtual {v13, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 896
    .line 897
    .line 898
    move-result v13

    .line 899
    if-nez v13, :cond_22

    .line 900
    .line 901
    goto :goto_18

    .line 902
    :cond_22
    sget-object v13, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 903
    .line 904
    new-instance v13, Lq00;

    .line 905
    .line 906
    invoke-direct {v13, v6}, Lq00;-><init>(I)V

    .line 907
    .line 908
    .line 909
    invoke-static {v12, v13}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 910
    .line 911
    .line 912
    new-instance v13, Lq00;

    .line 913
    .line 914
    invoke-direct {v13, v0}, Lq00;-><init>(I)V

    .line 915
    .line 916
    .line 917
    invoke-static {v12, v13}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 918
    .line 919
    .line 920
    :goto_18
    const-string v0, "feed_current_aweme_resolver"

    .line 921
    .line 922
    sget-object v12, Lu00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 923
    .line 924
    invoke-virtual {v12, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 925
    .line 926
    .line 927
    move-result v12

    .line 928
    if-nez v12, :cond_23

    .line 929
    .line 930
    goto :goto_19

    .line 931
    :cond_23
    sget-object v12, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 932
    .line 933
    new-instance v12, Lq00;

    .line 934
    .line 935
    invoke-direct {v12, v9}, Lq00;-><init>(I)V

    .line 936
    .line 937
    .line 938
    invoke-static {v0, v12}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 939
    .line 940
    .line 941
    new-instance v12, Lq00;

    .line 942
    .line 943
    const/4 v13, 0x2

    .line 944
    invoke-direct {v12, v13}, Lq00;-><init>(I)V

    .line 945
    .line 946
    .line 947
    invoke-static {v0, v12}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 948
    .line 949
    .line 950
    :goto_19
    sget-object v0, Lp00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 951
    .line 952
    sget-object v0, Lp00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 953
    .line 954
    invoke-virtual {v0, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    const/16 v12, 0x18

    .line 959
    .line 960
    if-nez v0, :cond_24

    .line 961
    .line 962
    goto :goto_1a

    .line 963
    :cond_24
    sget-object v0, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 964
    .line 965
    const-string v0, "feed_ad_panel_detector"

    .line 966
    .line 967
    new-instance v13, Lhm;

    .line 968
    .line 969
    invoke-direct {v13, v12}, Lhm;-><init>(I)V

    .line 970
    .line 971
    .line 972
    invoke-static {v0, v13}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 973
    .line 974
    .line 975
    :goto_1a
    const-string v0, "feed_video_model_resolver"

    .line 976
    .line 977
    sget-object v13, Lh30;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 978
    .line 979
    invoke-virtual {v13, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 980
    .line 981
    .line 982
    move-result v13

    .line 983
    const/16 v15, 0x15

    .line 984
    .line 985
    if-nez v13, :cond_25

    .line 986
    .line 987
    goto :goto_1b

    .line 988
    :cond_25
    sget-object v13, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 989
    .line 990
    new-instance v13, Ls20;

    .line 991
    .line 992
    invoke-direct {v13, v15}, Ls20;-><init>(I)V

    .line 993
    .line 994
    .line 995
    invoke-static {v0, v13}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 996
    .line 997
    .line 998
    new-instance v13, Ls20;

    .line 999
    .line 1000
    const/16 v12, 0x16

    .line 1001
    .line 1002
    invoke-direct {v13, v12}, Ls20;-><init>(I)V

    .line 1003
    .line 1004
    .line 1005
    invoke-static {v0, v13}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1006
    .line 1007
    .line 1008
    :goto_1b
    const/16 v0, 0xa

    .line 1009
    .line 1010
    if-eqz v4, :cond_27

    .line 1011
    .line 1012
    const-string v4, "feed_right_controls_resolver"

    .line 1013
    .line 1014
    sget-object v12, Lb30;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1015
    .line 1016
    invoke-virtual {v12, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v12

    .line 1020
    if-nez v12, :cond_26

    .line 1021
    .line 1022
    goto :goto_1c

    .line 1023
    :cond_26
    sget-object v12, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1024
    .line 1025
    new-instance v12, Ls20;

    .line 1026
    .line 1027
    const/16 v13, 0x9

    .line 1028
    .line 1029
    invoke-direct {v12, v13}, Ls20;-><init>(I)V

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v4, v12}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1033
    .line 1034
    .line 1035
    new-instance v12, Ls20;

    .line 1036
    .line 1037
    invoke-direct {v12, v0}, Ls20;-><init>(I)V

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v4, v12}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1041
    .line 1042
    .line 1043
    :cond_27
    :goto_1c
    const-string v4, "feed_enable_preload"

    .line 1044
    .line 1045
    invoke-static {v4, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v4

    .line 1049
    if-eqz v4, :cond_28

    .line 1050
    .line 1051
    const-string v4, "feed_preload_count"

    .line 1052
    .line 1053
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v12

    .line 1057
    const/4 v13, 0x2

    .line 1058
    invoke-interface {v12, v4, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1059
    .line 1060
    .line 1061
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1062
    goto :goto_1d

    .line 1063
    :catchall_3
    const/4 v4, 0x2

    .line 1064
    :goto_1d
    if-lez v4, :cond_28

    .line 1065
    .line 1066
    move v4, v9

    .line 1067
    goto :goto_1e

    .line 1068
    :cond_28
    move v4, v10

    .line 1069
    :goto_1e
    if-eqz v4, :cond_29

    .line 1070
    .line 1071
    sget-object v4, Lq20;->α:Ljava/util/Set;

    .line 1072
    .line 1073
    sget-object v4, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1074
    .line 1075
    const-string v4, "feed_preload_control"

    .line 1076
    .line 1077
    new-instance v12, Ll20;

    .line 1078
    .line 1079
    const/4 v13, 0x6

    .line 1080
    invoke-direct {v12, v13}, Ll20;-><init>(I)V

    .line 1081
    .line 1082
    .line 1083
    invoke-static {v4, v12}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v12, Ll20;

    .line 1087
    .line 1088
    invoke-direct {v12, v6}, Ll20;-><init>(I)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v4, v12}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1092
    .line 1093
    .line 1094
    goto :goto_1f

    .line 1095
    :cond_29
    const-string v4, "DYHelper: FeedPreloadControlHook \u9884\u52a0\u8f7d\u63a7\u5236\u5173\u95ed\uff0c\u8df3\u8fc7 DexKit \u9884\u70ed\u6ce8\u518c"

    .line 1096
    .line 1097
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    :goto_1f
    const-string v4, "offline_cache_count_enabled"

    .line 1101
    .line 1102
    invoke-static {v4, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v4

    .line 1106
    const-string v6, "offline_cache_count"

    .line 1107
    .line 1108
    const/16 v12, 0x64

    .line 1109
    .line 1110
    :try_start_4
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v13

    .line 1114
    invoke-interface {v13, v6, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1115
    .line 1116
    .line 1117
    move-result v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1118
    goto :goto_20

    .line 1119
    :catchall_4
    move v6, v12

    .line 1120
    :goto_20
    const/16 v13, 0x1f4

    .line 1121
    .line 1122
    invoke-static {v6, v0, v13}, Lj81;->μ(III)I

    .line 1123
    .line 1124
    .line 1125
    const/16 v6, 0x14

    .line 1126
    .line 1127
    if-eqz v4, :cond_2a

    .line 1128
    .line 1129
    sget-object v4, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1130
    .line 1131
    sget-object v4, Ll41;->α:Ll41;

    .line 1132
    .line 1133
    sget-object v4, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1134
    .line 1135
    const-string v4, "offline_cache_count"

    .line 1136
    .line 1137
    new-instance v0, Lsv0;

    .line 1138
    .line 1139
    invoke-direct {v0, v6}, Lsv0;-><init>(I)V

    .line 1140
    .line 1141
    .line 1142
    invoke-static {v4, v0}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1143
    .line 1144
    .line 1145
    new-instance v0, Lsv0;

    .line 1146
    .line 1147
    invoke-direct {v0, v15}, Lsv0;-><init>(I)V

    .line 1148
    .line 1149
    .line 1150
    invoke-static {v4, v0}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1151
    .line 1152
    .line 1153
    goto :goto_21

    .line 1154
    :cond_2a
    const-string v0, "DYHelper: \u79bb\u7ebf\u7f13\u5b58\u6570\u91cf\u8986\u76d6\u5173\u95ed\uff0c\u8df3\u8fc7 DexKit \u9884\u70ed\u6ce8\u518c"

    .line 1155
    .line 1156
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    :goto_21
    invoke-static {}, Lui1;->ψ()Z

    .line 1160
    .line 1161
    .line 1162
    move-result v0

    .line 1163
    if-eqz v0, :cond_2d

    .line 1164
    .line 1165
    const-string v0, "feed_follow_confirm"

    .line 1166
    .line 1167
    sget-object v4, Ln10;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1168
    .line 1169
    invoke-virtual {v4, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v4

    .line 1173
    if-nez v4, :cond_2b

    .line 1174
    .line 1175
    goto :goto_22

    .line 1176
    :cond_2b
    invoke-static {}, Lui1;->ψ()Z

    .line 1177
    .line 1178
    .line 1179
    move-result v4

    .line 1180
    if-nez v4, :cond_2c

    .line 1181
    .line 1182
    const-string v0, "r965f1b33b90ef5ec"

    .line 1183
    .line 1184
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    goto :goto_22

    .line 1188
    :cond_2c
    sget-object v4, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1189
    .line 1190
    new-instance v4, Lq00;

    .line 1191
    .line 1192
    invoke-direct {v4, v6}, Lq00;-><init>(I)V

    .line 1193
    .line 1194
    .line 1195
    invoke-static {v0, v4}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1196
    .line 1197
    .line 1198
    new-instance v4, Lq00;

    .line 1199
    .line 1200
    invoke-direct {v4, v15}, Lq00;-><init>(I)V

    .line 1201
    .line 1202
    .line 1203
    invoke-static {v0, v4}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1204
    .line 1205
    .line 1206
    goto :goto_22

    .line 1207
    :cond_2d
    const-string v0, "DYHelper: FeedFollowConfirmHook \u5173\u95ed\uff0c\u8df3\u8fc7 DexKit \u9884\u70ed\u6ce8\u518c"

    .line 1208
    .line 1209
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1210
    .line 1211
    .line 1212
    :goto_22
    sget-object v0, Lp81;->α:Lp81;

    .line 1213
    .line 1214
    const-string v4, "original_not_interested_action"

    .line 1215
    .line 1216
    sget-object v6, Lp81;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1217
    .line 1218
    invoke-virtual {v6, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v6

    .line 1222
    if-nez v6, :cond_2e

    .line 1223
    .line 1224
    goto :goto_23

    .line 1225
    :cond_2e
    sget-object v6, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1226
    .line 1227
    new-instance v6, Lf71;

    .line 1228
    .line 1229
    invoke-direct {v6, v9}, Lf71;-><init>(I)V

    .line 1230
    .line 1231
    .line 1232
    invoke-static {v4, v6}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1233
    .line 1234
    .line 1235
    new-instance v6, Lf71;

    .line 1236
    .line 1237
    const/4 v15, 0x2

    .line 1238
    invoke-direct {v6, v15}, Lf71;-><init>(I)V

    .line 1239
    .line 1240
    .line 1241
    invoke-static {v4, v6}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1242
    .line 1243
    .line 1244
    :goto_23
    sget-object v4, Ltu0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1245
    .line 1246
    const-string v4, "live_room_audience_exact_count"

    .line 1247
    .line 1248
    sget-object v6, Ltu0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1249
    .line 1250
    invoke-virtual {v6, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1251
    .line 1252
    .line 1253
    move-result v6

    .line 1254
    const/16 v15, 0x10

    .line 1255
    .line 1256
    if-nez v6, :cond_2f

    .line 1257
    .line 1258
    goto :goto_24

    .line 1259
    :cond_2f
    const-string v6, "live_room_audience_exact_count_enabled"

    .line 1260
    .line 1261
    invoke-static {v6, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v6

    .line 1265
    if-nez v6, :cond_30

    .line 1266
    .line 1267
    const-string v4, "r201db4a1a9306270"

    .line 1268
    .line 1269
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_24

    .line 1273
    :cond_30
    sget-object v6, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1274
    .line 1275
    new-instance v6, Lgp0;

    .line 1276
    .line 1277
    const/16 v13, 0xf

    .line 1278
    .line 1279
    invoke-direct {v6, v13}, Lgp0;-><init>(I)V

    .line 1280
    .line 1281
    .line 1282
    invoke-static {v4, v6}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1283
    .line 1284
    .line 1285
    new-instance v6, Lgp0;

    .line 1286
    .line 1287
    invoke-direct {v6, v15}, Lgp0;-><init>(I)V

    .line 1288
    .line 1289
    .line 1290
    invoke-static {v4, v6}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1291
    .line 1292
    .line 1293
    :goto_24
    sget-object v4, Lmi1;->α:Lmi1;

    .line 1294
    .line 1295
    const-string v6, "comment_precise_time"

    .line 1296
    .line 1297
    sget-object v13, Lmi1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1298
    .line 1299
    invoke-virtual {v13, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v13

    .line 1303
    if-nez v13, :cond_31

    .line 1304
    .line 1305
    goto :goto_25

    .line 1306
    :cond_31
    const-string v13, "precise_time_enabled"

    .line 1307
    .line 1308
    invoke-static {v13, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1309
    .line 1310
    .line 1311
    move-result v13

    .line 1312
    if-nez v13, :cond_32

    .line 1313
    .line 1314
    const-string v6, "rb95bed5e6997b6c3"

    .line 1315
    .line 1316
    const-string v13, "feature disabled, skip prewarm provider"

    .line 1317
    .line 1318
    const/4 v14, 0x4

    .line 1319
    const/4 v15, 0x0

    .line 1320
    invoke-static {v6, v13, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1321
    .line 1322
    .line 1323
    goto :goto_25

    .line 1324
    :cond_32
    sget-object v13, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1325
    .line 1326
    new-instance v13, Lcf1;

    .line 1327
    .line 1328
    const/16 v15, 0x1b

    .line 1329
    .line 1330
    invoke-direct {v13, v15}, Lcf1;-><init>(I)V

    .line 1331
    .line 1332
    .line 1333
    invoke-static {v6, v13}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1334
    .line 1335
    .line 1336
    new-instance v13, Lcf1;

    .line 1337
    .line 1338
    invoke-direct {v13, v14}, Lcf1;-><init>(I)V

    .line 1339
    .line 1340
    .line 1341
    invoke-static {v6, v13}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1342
    .line 1343
    .line 1344
    :goto_25
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;

    .line 1345
    .line 1346
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/LongPressBookmarkActions;->registerAll()V

    .line 1347
    .line 1348
    .line 1349
    const-string v6, "comment_panel_hook_enabled"

    .line 1350
    .line 1351
    invoke-static {v6, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v6

    .line 1355
    const/16 v13, 0x19

    .line 1356
    .line 1357
    if-nez v6, :cond_33

    .line 1358
    .line 1359
    const-string v6, "r29fd1f5135ecd17"

    .line 1360
    .line 1361
    const-string v14, "disabled, skip prewarm provider"

    .line 1362
    .line 1363
    const/4 v12, 0x0

    .line 1364
    const/4 v15, 0x4

    .line 1365
    invoke-static {v6, v14, v12, v15, v12}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_26

    .line 1369
    :cond_33
    const-string v6, "long_press_panel_resolver"

    .line 1370
    .line 1371
    sget-object v12, Luv0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1372
    .line 1373
    invoke-virtual {v12, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v12

    .line 1377
    if-nez v12, :cond_34

    .line 1378
    .line 1379
    goto :goto_26

    .line 1380
    :cond_34
    sget-object v12, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1381
    .line 1382
    new-instance v12, Lgp0;

    .line 1383
    .line 1384
    invoke-direct {v12, v13}, Lgp0;-><init>(I)V

    .line 1385
    .line 1386
    .line 1387
    invoke-static {v6, v12}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1388
    .line 1389
    .line 1390
    new-instance v12, Lsv0;

    .line 1391
    .line 1392
    invoke-direct {v12, v10}, Lsv0;-><init>(I)V

    .line 1393
    .line 1394
    .line 1395
    invoke-static {v6, v12}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1396
    .line 1397
    .line 1398
    :goto_26
    iget-object v6, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1399
    .line 1400
    invoke-static {v6}, Ljx0;->Γ(Ljava/lang/ClassLoader;)V

    .line 1401
    .line 1402
    .line 1403
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;

    .line 1404
    .line 1405
    invoke-virtual {v6}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->registerDexKitPrewarmProvider()V

    .line 1406
    .line 1407
    .line 1408
    sget-object v12, Lql;->α:Lql;

    .line 1409
    .line 1410
    sget-object v12, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1411
    .line 1412
    const-string v12, "comment_similar_emoji_download"

    .line 1413
    .line 1414
    new-instance v14, Lwj;

    .line 1415
    .line 1416
    const/16 v15, 0x18

    .line 1417
    .line 1418
    invoke-direct {v14, v15}, Lwj;-><init>(I)V

    .line 1419
    .line 1420
    .line 1421
    invoke-static {v12, v14}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1422
    .line 1423
    .line 1424
    new-instance v14, Lwj;

    .line 1425
    .line 1426
    invoke-direct {v14, v13}, Lwj;-><init>(I)V

    .line 1427
    .line 1428
    .line 1429
    invoke-static {v12, v14}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1430
    .line 1431
    .line 1432
    const-string v12, "comment_audio_download"

    .line 1433
    .line 1434
    sget-object v13, Lfj;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1435
    .line 1436
    invoke-virtual {v13, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1437
    .line 1438
    .line 1439
    move-result v13

    .line 1440
    if-nez v13, :cond_35

    .line 1441
    .line 1442
    goto :goto_27

    .line 1443
    :cond_35
    new-instance v13, Lgh;

    .line 1444
    .line 1445
    const/16 v14, 0xb

    .line 1446
    .line 1447
    invoke-direct {v13, v14}, Lgh;-><init>(I)V

    .line 1448
    .line 1449
    .line 1450
    invoke-static {v12, v13}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1451
    .line 1452
    .line 1453
    new-instance v13, Lgh;

    .line 1454
    .line 1455
    const/16 v14, 0xc

    .line 1456
    .line 1457
    invoke-direct {v13, v14}, Lgh;-><init>(I)V

    .line 1458
    .line 1459
    .line 1460
    invoke-static {v12, v13}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1461
    .line 1462
    .line 1463
    :goto_27
    const-string v12, "DYHelper: All DexKit prewarm providers registered"

    .line 1464
    .line 1465
    invoke-static {v12}, Lux;->ρ(Ljava/lang/String;)V

    .line 1466
    .line 1467
    .line 1468
    const-string v12, "DYHelper: Starting individual Hook initializations"

    .line 1469
    .line 1470
    invoke-static {v12}, Lux;->ρ(Ljava/lang/String;)V

    .line 1471
    .line 1472
    .line 1473
    iget-object v12, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1474
    .line 1475
    invoke-virtual {v7, v12}, Lst;->σ(Ljava/lang/ClassLoader;)V

    .line 1476
    .line 1477
    .line 1478
    const-string v12, "DYHelper: DisplayNameResolver.init completed"

    .line 1479
    .line 1480
    invoke-static {v12}, Lux;->ρ(Ljava/lang/String;)V

    .line 1481
    .line 1482
    .line 1483
    iget-object v12, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1484
    .line 1485
    sput-object v12, Lvh0;->υ:Ljava/lang/ClassLoader;

    .line 1486
    .line 1487
    iget-object v12, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1488
    .line 1489
    invoke-virtual {v7, v12}, Lst;->σ(Ljava/lang/ClassLoader;)V

    .line 1490
    .line 1491
    .line 1492
    sget-object v7, Lci0;->α:Lci0;

    .line 1493
    .line 1494
    iget-object v12, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1495
    .line 1496
    invoke-virtual {v7, v12}, Lci0;->η(Ljava/lang/ClassLoader;)V

    .line 1497
    .line 1498
    .line 1499
    const-string v7, "DYHelper: IMConversationCatalog.init completed"

    .line 1500
    .line 1501
    invoke-static {v7}, Lux;->ρ(Ljava/lang/String;)V

    .line 1502
    .line 1503
    .line 1504
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1505
    .line 1506
    invoke-virtual {v8, v7}, Lwi0;->η(Ljava/lang/ClassLoader;)V

    .line 1507
    .line 1508
    .line 1509
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1510
    .line 1511
    invoke-virtual {v11, v7, v10}, Lfk1;->α(Ljava/lang/ClassLoader;Z)V

    .line 1512
    .line 1513
    .line 1514
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1515
    .line 1516
    invoke-static {v7}, Leu;->α(Ljava/lang/ClassLoader;)V

    .line 1517
    .line 1518
    .line 1519
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1520
    .line 1521
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1522
    .line 1523
    .line 1524
    invoke-static {}, Lg30;->values()[Lg30;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v8

    .line 1528
    array-length v11, v8

    .line 1529
    move v12, v10

    .line 1530
    :goto_28
    if-ge v12, v11, :cond_36

    .line 1531
    .line 1532
    aget-object v13, v8, v12

    .line 1533
    .line 1534
    invoke-static {v13, v7, v10}, Lh30;->δ(Lg30;Ljava/lang/ClassLoader;Z)V

    .line 1535
    .line 1536
    .line 1537
    add-int/lit8 v12, v12, 0x1

    .line 1538
    .line 1539
    goto :goto_28

    .line 1540
    :cond_36
    invoke-static {v7, v10}, Lh30;->ε(Ljava/lang/ClassLoader;Z)V

    .line 1541
    .line 1542
    .line 1543
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1544
    .line 1545
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1546
    .line 1547
    .line 1548
    invoke-static {v7, v10}, Lu00;->β(Ljava/lang/ClassLoader;Z)V

    .line 1549
    .line 1550
    .line 1551
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1552
    .line 1553
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1554
    .line 1555
    .line 1556
    invoke-static {v7, v10}, Lp00;->β(Ljava/lang/ClassLoader;Z)V

    .line 1557
    .line 1558
    .line 1559
    const-string v7, "feed_enable_preload"

    .line 1560
    .line 1561
    invoke-static {v7, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1562
    .line 1563
    .line 1564
    move-result v7

    .line 1565
    if-eqz v7, :cond_37

    .line 1566
    .line 1567
    const-string v7, "feed_preload_count"

    .line 1568
    .line 1569
    :try_start_5
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1573
    const/4 v13, 0x2

    .line 1574
    :try_start_6
    invoke-interface {v8, v7, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1575
    .line 1576
    .line 1577
    move-result v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1578
    goto :goto_29

    .line 1579
    :catchall_5
    const/4 v13, 0x2

    .line 1580
    :catchall_6
    move v8, v13

    .line 1581
    :goto_29
    if-lez v8, :cond_37

    .line 1582
    .line 1583
    move v7, v9

    .line 1584
    goto :goto_2a

    .line 1585
    :cond_37
    move v7, v10

    .line 1586
    :goto_2a
    if-eqz v7, :cond_38

    .line 1587
    .line 1588
    sget-object v7, Lq20;->α:Ljava/util/Set;

    .line 1589
    .line 1590
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1591
    .line 1592
    invoke-static {v7}, Lq20;->ι(Ljava/lang/ClassLoader;)V

    .line 1593
    .line 1594
    .line 1595
    goto :goto_2b

    .line 1596
    :cond_38
    const-string v7, "DYHelper: FeedPreloadControlHook \u9884\u52a0\u8f7d\u63a7\u5236\u5173\u95ed\uff0c\u8df3\u8fc7\u521d\u59cb\u5316"

    .line 1597
    .line 1598
    invoke-static {v7}, Lux;->ρ(Ljava/lang/String;)V

    .line 1599
    .line 1600
    .line 1601
    :goto_2b
    const-string v7, "offline_cache_count_enabled"

    .line 1602
    .line 1603
    invoke-static {v7, v10}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1604
    .line 1605
    .line 1606
    move-result v7

    .line 1607
    const-string v8, "offline_cache_count"

    .line 1608
    .line 1609
    :try_start_7
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 1613
    const/16 v12, 0x64

    .line 1614
    .line 1615
    :try_start_8
    invoke-interface {v11, v8, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1616
    .line 1617
    .line 1618
    move-result v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 1619
    :catchall_7
    :goto_2c
    const/16 v8, 0x1f4

    .line 1620
    .line 1621
    const/16 v11, 0xa

    .line 1622
    .line 1623
    goto :goto_2d

    .line 1624
    :catchall_8
    const/16 v12, 0x64

    .line 1625
    .line 1626
    goto :goto_2c

    .line 1627
    :goto_2d
    invoke-static {v12, v11, v8}, Lj81;->μ(III)I

    .line 1628
    .line 1629
    .line 1630
    if-eqz v7, :cond_39

    .line 1631
    .line 1632
    sget-object v7, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1633
    .line 1634
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1635
    .line 1636
    invoke-static {v7}, Lm41;->β(Ljava/lang/ClassLoader;)V

    .line 1637
    .line 1638
    .line 1639
    goto :goto_2e

    .line 1640
    :cond_39
    const-string v7, "DYHelper: \u79bb\u7ebf\u7f13\u5b58\u6570\u91cf\u8986\u76d6\u5173\u95ed\uff0c\u8df3\u8fc7\u521d\u59cb\u5316"

    .line 1641
    .line 1642
    invoke-static {v7}, Lux;->ρ(Ljava/lang/String;)V

    .line 1643
    .line 1644
    .line 1645
    :goto_2e
    invoke-static {}, Lui1;->ψ()Z

    .line 1646
    .line 1647
    .line 1648
    move-result v7

    .line 1649
    if-eqz v7, :cond_3a

    .line 1650
    .line 1651
    sget-object v7, Ln10;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1652
    .line 1653
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1654
    .line 1655
    invoke-static {v7}, Ln10;->γ(Ljava/lang/ClassLoader;)V

    .line 1656
    .line 1657
    .line 1658
    goto :goto_2f

    .line 1659
    :cond_3a
    const-string v7, "DYHelper: FeedFollowConfirmHook \u5173\u95ed\uff0c\u8df3\u8fc7\u521d\u59cb\u5316"

    .line 1660
    .line 1661
    invoke-static {v7}, Lux;->ρ(Ljava/lang/String;)V

    .line 1662
    .line 1663
    .line 1664
    :goto_2f
    iget-object v7, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1665
    .line 1666
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1667
    .line 1668
    .line 1669
    invoke-virtual {v0, v7, v10}, Lp81;->ο(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v0, v7, v10}, Lp81;->π(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 1673
    .line 1674
    .line 1675
    iget-object v0, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1676
    .line 1677
    invoke-static {v0}, Ltu0;->α(Ljava/lang/ClassLoader;)V

    .line 1678
    .line 1679
    .line 1680
    const-string v0, "DYHelper: LiveRoomAudienceExactCountHook.init completed"

    .line 1681
    .line 1682
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1683
    .line 1684
    .line 1685
    iget-object v0, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1686
    .line 1687
    invoke-virtual {v4, v0}, Lmi1;->η(Ljava/lang/ClassLoader;)V

    .line 1688
    .line 1689
    .line 1690
    const-string v0, "DYHelper: PreciseTimeHook.init completed"

    .line 1691
    .line 1692
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1693
    .line 1694
    .line 1695
    const-string v0, "DYHelper: ====== Starting CommentBookmarkHook initialization ======"

    .line 1696
    .line 1697
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1698
    .line 1699
    .line 1700
    const-string v0, "DYHelper: Calling CommentBookmarkHook.onHostContext"

    .line 1701
    .line 1702
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1703
    .line 1704
    .line 1705
    invoke-virtual {v6, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->onHostContext(Landroid/content/Context;)V

    .line 1706
    .line 1707
    .line 1708
    const-string v0, "DYHelper: CommentBookmarkHook.onHostContext completed"

    .line 1709
    .line 1710
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1711
    .line 1712
    .line 1713
    const-string v0, "DYHelper: Calling CommentBookmarkActiveQuery.init"

    .line 1714
    .line 1715
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1716
    .line 1717
    .line 1718
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;

    .line 1719
    .line 1720
    iget-object v4, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1721
    .line 1722
    invoke-virtual {v0, v1, v4}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->init(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    .line 1723
    .line 1724
    .line 1725
    const-string v4, "DYHelper: CommentBookmarkActiveQuery.init completed"

    .line 1726
    .line 1727
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    const-string v4, "DYHelper: Calling CommentBookmarkActiveQuery.scheduleAutoScanIfNeeded"

    .line 1731
    .line 1732
    invoke-static {v4}, Lux;->ρ(Ljava/lang/String;)V

    .line 1733
    .line 1734
    .line 1735
    invoke-virtual {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkActiveQuery;->scheduleAutoScanIfNeeded()V

    .line 1736
    .line 1737
    .line 1738
    const-string v0, "DYHelper: CommentBookmarkActiveQuery.scheduleAutoScanIfNeeded completed"

    .line 1739
    .line 1740
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1741
    .line 1742
    .line 1743
    const-string v0, "DYHelper: Calling CommentBookmarkHook.init with allowDexKitScan=false"

    .line 1744
    .line 1745
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1746
    .line 1747
    .line 1748
    iget-object v0, v2, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1749
    .line 1750
    invoke-virtual {v6, v0, v10}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkHook;->init(Ljava/lang/ClassLoader;Z)V

    .line 1751
    .line 1752
    .line 1753
    const-string v0, "DYHelper: CommentBookmarkHook.init completed"

    .line 1754
    .line 1755
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1756
    .line 1757
    .line 1758
    const-string v0, "DYHelper: ====== Starting ProfileBookmark initialization ======"

    .line 1759
    .line 1760
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1761
    .line 1762
    .line 1763
    const-string v0, "ProfileBookmarkStore"

    .line 1764
    .line 1765
    new-instance v4, Lxe0;

    .line 1766
    .line 1767
    invoke-direct {v4, v1, v10}, Lxe0;-><init>(Landroid/content/Context;I)V

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v3, v0, v4}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1771
    .line 1772
    .line 1773
    const-string v0, "ProbeNotifier"

    .line 1774
    .line 1775
    new-instance v4, Lxe0;

    .line 1776
    .line 1777
    invoke-direct {v4, v1, v9}, Lxe0;-><init>(Landroid/content/Context;I)V

    .line 1778
    .line 1779
    .line 1780
    invoke-virtual {v3, v0, v4}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1781
    .line 1782
    .line 1783
    const-string v0, "ProfileBookmarkActiveQuery"

    .line 1784
    .line 1785
    new-instance v4, Lye0;

    .line 1786
    .line 1787
    invoke-direct {v4, v1, v2, v10}, Lye0;-><init>(Landroid/content/Context;Lz81;I)V

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual {v3, v0, v4}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1791
    .line 1792
    .line 1793
    const-string v0, "ProfileBookmarkProfileHook"

    .line 1794
    .line 1795
    new-instance v4, Lye0;

    .line 1796
    .line 1797
    invoke-direct {v4, v1, v2, v9}, Lye0;-><init>(Landroid/content/Context;Lz81;I)V

    .line 1798
    .line 1799
    .line 1800
    invoke-virtual {v3, v0, v4}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1801
    .line 1802
    .line 1803
    const-string v0, "DYHelper: ====== ProfileBookmark initialization END ======"

    .line 1804
    .line 1805
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1806
    .line 1807
    .line 1808
    const-string v0, "DYHelper: Initializing diagnostic probes"

    .line 1809
    .line 1810
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1811
    .line 1812
    .line 1813
    const-string v0, "CmtReplyDetailProbeHook"

    .line 1814
    .line 1815
    new-instance v1, Lve0;

    .line 1816
    .line 1817
    const/4 v4, 0x5

    .line 1818
    invoke-direct {v1, v2, v4}, Lve0;-><init>(Lz81;I)V

    .line 1819
    .line 1820
    .line 1821
    invoke-virtual {v3, v0, v1}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1822
    .line 1823
    .line 1824
    const-string v0, "DYHelper: CmtReplyDetailProbeHook initialized"

    .line 1825
    .line 1826
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1827
    .line 1828
    .line 1829
    const-string v0, "CommentRouterTraceHook"

    .line 1830
    .line 1831
    new-instance v1, Lve0;

    .line 1832
    .line 1833
    invoke-direct {v1, v2, v10}, Lve0;-><init>(Lz81;I)V

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v3, v0, v1}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1837
    .line 1838
    .line 1839
    const-string v0, "DYHelper: CommentRouterTraceHook initialized"

    .line 1840
    .line 1841
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1842
    .line 1843
    .line 1844
    const-string v0, "DYHelper: ====== CommentBookmarkHook initialization END ======"

    .line 1845
    .line 1846
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1847
    .line 1848
    .line 1849
    const-string v0, "BottomBarManager"

    .line 1850
    .line 1851
    new-instance v1, Lp3;

    .line 1852
    .line 1853
    const/16 v4, 0x10

    .line 1854
    .line 1855
    invoke-direct {v1, v2, v4, v5}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v3, v0, v1}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1859
    .line 1860
    .line 1861
    const-string v0, "LiquidGlassBottomBarAttachRetry"

    .line 1862
    .line 1863
    new-instance v1, Lve0;

    .line 1864
    .line 1865
    invoke-direct {v1, v2, v9}, Lve0;-><init>(Lz81;I)V

    .line 1866
    .line 1867
    .line 1868
    invoke-virtual {v3, v0, v1}, Ln5;->Υ(Ljava/lang/String;Lp70;)V

    .line 1869
    .line 1870
    .line 1871
    sget v0, Lix;->α:I

    .line 1872
    .line 1873
    invoke-static {v2}, Lix;->η(Lz81;)V

    .line 1874
    .line 1875
    .line 1876
    sget v0, Loe0;->α:I

    .line 1877
    .line 1878
    :goto_30
    sget-object v0, Ls62;->α:Ls62;

    .line 1879
    .line 1880
    return-object v0

    .line 1881
    :goto_31
    monitor-exit v8

    .line 1882
    throw v0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lbf0;->ε:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lbf0;->η:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Landroid/content/Context;

    .line 12
    .line 13
    iget-object v0, v1, Lbf0;->θ:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v12, v0

    .line 16
    check-cast v12, Lf8;

    .line 17
    .line 18
    iget-object v0, v1, Lbf0;->ι:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v7, v0

    .line 21
    check-cast v7, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, v1, Lbf0;->κ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lfv;

    .line 26
    .line 27
    sget-object v2, Lqy0;->α:Lqy0;

    .line 28
    .line 29
    invoke-static {}, Lqy0;->г()Llu;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v12, v4}, Lkn0;->ν(Lf8;Llu;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v13

    .line 37
    iget-object v14, v12, Lf8;->θ:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {}, Lqy0;->г()Llu;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v12, v4}, Lkn0;->π(Lf8;Llu;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v15

    .line 47
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_2b

    .line 52
    .line 53
    new-instance v4, Ljava/io/File;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const-string v6, "dyhelper_livephoto"

    .line 60
    .line 61
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_0

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 71
    .line 72
    .line 73
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-static {v3, v12}, Lqy0;->ζ(Landroid/content/Context;Lf8;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    if-nez v0, :cond_1

    .line 83
    .line 84
    sget-object v0, Ljy0;->ι:Ljy0;

    .line 85
    .line 86
    invoke-static {v2, v3, v12, v0, v6}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_1
    move-object v6, v0

    .line 91
    iget-object v0, v6, Lfv;->β:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v0}, Lpu0;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    const-string v0, "live_photo_motion_photo_format"

    .line 98
    .line 99
    const/4 v9, 0x1

    .line 100
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 101
    .line 102
    .line 103
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    if-eqz v10, :cond_2

    .line 105
    .line 106
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    invoke-interface {v10, v0, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    :try_start_2
    invoke-static {v9, v3, v0}, Lqy0;->с(ILandroid/content/Context;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    invoke-static {v9, v3, v0}, Lqy0;->с(ILandroid/content/Context;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    :catchall_1
    :goto_0
    sget-object v0, Lou0;->η:Lrk0;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lou0;->values()[Lou0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    array-length v10, v0

    .line 131
    const/4 v11, 0x0

    .line 132
    :goto_1
    const/16 v17, 0x0

    .line 133
    .line 134
    if-ge v11, v10, :cond_4

    .line 135
    .line 136
    move-object/from16 v18, v0

    .line 137
    .line 138
    aget-object v0, v18, v11

    .line 139
    .line 140
    move-object/from16 v19, v6

    .line 141
    .line 142
    iget v6, v0, Lou0;->ε:I

    .line 143
    .line 144
    if-ne v6, v9, :cond_3

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 148
    .line 149
    move-object/from16 v0, v18

    .line 150
    .line 151
    move-object/from16 v6, v19

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    move-object/from16 v19, v6

    .line 155
    .line 156
    move-object/from16 v0, v17

    .line 157
    .line 158
    :goto_2
    if-nez v0, :cond_5

    .line 159
    .line 160
    sget-object v0, Lou0;->θ:Lou0;

    .line 161
    .line 162
    :cond_5
    move-object v6, v0

    .line 163
    if-eqz v7, :cond_6

    .line 164
    .line 165
    :try_start_3
    const-string v0, "\u6b63\u5728\u4e0b\u8f7d\u89c6\u9891"

    .line 166
    .line 167
    const/4 v10, 0x0

    .line 168
    invoke-static {v10, v3, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :catchall_2
    move-exception v0

    .line 173
    move-object v13, v5

    .line 174
    :goto_3
    move-object/from16 v2, v17

    .line 175
    .line 176
    goto/16 :goto_26

    .line 177
    .line 178
    :cond_6
    const/4 v10, 0x0

    .line 179
    :goto_4
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v16

    .line 183
    move v0, v10

    .line 184
    move-object/from16 v18, v17

    .line 185
    .line 186
    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 190
    move-object/from16 v20, v8

    .line 191
    .line 192
    iget-boolean v8, v1, Lbf0;->ζ:Z

    .line 193
    .line 194
    move-object/from16 v21, v12

    .line 195
    .line 196
    const-string v12, " \u5931\u8d25: "

    .line 197
    .line 198
    move-object/from16 v22, v13

    .line 199
    .line 200
    const-string v13, ", candidate="

    .line 201
    .line 202
    move-object/from16 v23, v15

    .line 203
    .line 204
    const-string v15, ", url="

    .line 205
    .line 206
    const-string v1, ".mp4"

    .line 207
    .line 208
    move-object/from16 v24, v12

    .line 209
    .line 210
    sget-object v12, Lpu0;->α:Lpu0;

    .line 211
    .line 212
    move-object/from16 v25, v12

    .line 213
    .line 214
    const-string v12, "/"

    .line 215
    .line 216
    move-object/from16 v26, v3

    .line 217
    .line 218
    const-string v3, "DYHelper"

    .line 219
    .line 220
    if-eqz v11, :cond_7

    .line 221
    .line 222
    add-int/lit8 v11, v0, 0x1

    .line 223
    .line 224
    :try_start_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Ljava/lang/String;

    .line 229
    .line 230
    const-string v9, "dyhelper_lp_video_"

    .line 231
    .line 232
    invoke-static {v9, v1, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_d

    .line 237
    .line 238
    .line 239
    :try_start_5
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_b

    .line 243
    move-object/from16 v29, v4

    .line 244
    .line 245
    :try_start_6
    invoke-static {v2, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    move-object/from16 v30, v0

    .line 250
    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_a

    .line 254
    .line 255
    .line 256
    move-object/from16 v31, v2

    .line 257
    .line 258
    :try_start_7
    const-string v2, "[LIVEPHOTO-MERGE-VIDEO] awemeId="

    .line 259
    .line 260
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v3, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v4, Ljava/io/FileOutputStream;

    .line 292
    .line 293
    invoke-direct {v4, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_9

    .line 294
    .line 295
    .line 296
    move-object v2, v6

    .line 297
    :try_start_8
    invoke-virtual/range {v31 .. v31}, Lqy0;->ж()I

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    new-instance v10, Ljava/lang/StringBuilder;

    .line 306
    .line 307
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 308
    .line 309
    .line 310
    move-object/from16 v32, v2

    .line 311
    .line 312
    :try_start_9
    const-string v2, "\u52a8\u56fe\u5408\u5e76\u89c6\u9891 "

    .line 313
    .line 314
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    new-instance v10, Lig;

    .line 331
    .line 332
    const/16 v2, 0x14

    .line 333
    .line 334
    invoke-direct {v10, v2}, Lig;-><init>(I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 335
    .line 336
    .line 337
    move v2, v11

    .line 338
    :try_start_a
    new-instance v11, Lig;

    .line 339
    .line 340
    move-object/from16 v33, v0

    .line 341
    .line 342
    const/16 v0, 0x15

    .line 343
    .line 344
    invoke-direct {v11, v0}, Lig;-><init>(I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 345
    .line 346
    .line 347
    move-object/from16 v27, v13

    .line 348
    .line 349
    move-object v13, v5

    .line 350
    move-object/from16 v5, v26

    .line 351
    .line 352
    move-object/from16 v26, v27

    .line 353
    .line 354
    move-object/from16 v34, v9

    .line 355
    .line 356
    move-object/from16 v28, v14

    .line 357
    .line 358
    move-object/from16 v35, v19

    .line 359
    .line 360
    move-object/from16 v36, v20

    .line 361
    .line 362
    move-object/from16 v37, v32

    .line 363
    .line 364
    const/16 v27, 0x1

    .line 365
    .line 366
    move-object/from16 v19, v1

    .line 367
    .line 368
    move v1, v2

    .line 369
    move-object v14, v3

    .line 370
    move-object v9, v7

    .line 371
    move-object/from16 v20, v15

    .line 372
    .line 373
    move-object/from16 v15, v29

    .line 374
    .line 375
    move-object/from16 v3, v30

    .line 376
    .line 377
    move-object/from16 v2, v31

    .line 378
    .line 379
    move-object/from16 v7, v33

    .line 380
    .line 381
    :try_start_b
    invoke-virtual/range {v2 .. v11}, Lqy0;->Τ(Ljava/lang/String;Ljava/io/FileOutputStream;Landroid/content/Context;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 382
    .line 383
    .line 384
    move-object v10, v2

    .line 385
    move-object v0, v3

    .line 386
    move-object v3, v5

    .line 387
    move v6, v8

    .line 388
    move-object v7, v9

    .line 389
    :try_start_c
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 390
    .line 391
    .line 392
    move-object/from16 v11, v25

    .line 393
    .line 394
    move-object/from16 v2, v34

    .line 395
    .line 396
    :try_start_d
    invoke-virtual {v11, v2, v0}, Lpu0;->Σ(Ljava/io/File;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 397
    .line 398
    .line 399
    move-object v1, v2

    .line 400
    :goto_6
    move-object/from16 v5, v24

    .line 401
    .line 402
    goto/16 :goto_e

    .line 403
    .line 404
    :catchall_3
    move-exception v0

    .line 405
    :goto_7
    move-object/from16 v18, v0

    .line 406
    .line 407
    goto/16 :goto_c

    .line 408
    .line 409
    :catchall_4
    move-exception v0

    .line 410
    :goto_8
    move-object/from16 v2, v34

    .line 411
    .line 412
    goto :goto_7

    .line 413
    :catchall_5
    move-exception v0

    .line 414
    move-object v10, v2

    .line 415
    move-object v3, v5

    .line 416
    move-object v7, v9

    .line 417
    goto :goto_8

    .line 418
    :catchall_6
    move-exception v0

    .line 419
    move v1, v2

    .line 420
    move-object v13, v5

    .line 421
    move-object v2, v9

    .line 422
    :goto_9
    move-object/from16 v28, v14

    .line 423
    .line 424
    move-object/from16 v35, v19

    .line 425
    .line 426
    move-object/from16 v36, v20

    .line 427
    .line 428
    move-object/from16 v15, v29

    .line 429
    .line 430
    move-object/from16 v10, v31

    .line 431
    .line 432
    move-object/from16 v37, v32

    .line 433
    .line 434
    :goto_a
    const/16 v27, 0x1

    .line 435
    .line 436
    move-object v14, v3

    .line 437
    move-object/from16 v3, v26

    .line 438
    .line 439
    goto :goto_7

    .line 440
    :catchall_7
    move-exception v0

    .line 441
    move-object v13, v5

    .line 442
    move-object v2, v9

    .line 443
    move v1, v11

    .line 444
    goto :goto_9

    .line 445
    :catchall_8
    move-exception v0

    .line 446
    move-object/from16 v37, v2

    .line 447
    .line 448
    move-object v13, v5

    .line 449
    :goto_b
    move-object v2, v9

    .line 450
    move v1, v11

    .line 451
    move-object/from16 v28, v14

    .line 452
    .line 453
    move-object/from16 v35, v19

    .line 454
    .line 455
    move-object/from16 v36, v20

    .line 456
    .line 457
    move-object/from16 v15, v29

    .line 458
    .line 459
    move-object/from16 v10, v31

    .line 460
    .line 461
    goto :goto_a

    .line 462
    :catchall_9
    move-exception v0

    .line 463
    move-object v13, v5

    .line 464
    move-object/from16 v37, v6

    .line 465
    .line 466
    goto :goto_b

    .line 467
    :catchall_a
    move-exception v0

    .line 468
    move-object v10, v2

    .line 469
    move-object v13, v5

    .line 470
    move-object/from16 v37, v6

    .line 471
    .line 472
    move-object v2, v9

    .line 473
    move v1, v11

    .line 474
    move-object/from16 v28, v14

    .line 475
    .line 476
    move-object/from16 v35, v19

    .line 477
    .line 478
    move-object/from16 v36, v20

    .line 479
    .line 480
    move-object/from16 v15, v29

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :catchall_b
    move-exception v0

    .line 484
    move-object v10, v2

    .line 485
    move-object v15, v4

    .line 486
    move-object v13, v5

    .line 487
    move-object/from16 v37, v6

    .line 488
    .line 489
    move-object v2, v9

    .line 490
    move v1, v11

    .line 491
    move-object/from16 v28, v14

    .line 492
    .line 493
    move-object/from16 v35, v19

    .line 494
    .line 495
    move-object/from16 v36, v20

    .line 496
    .line 497
    goto :goto_a

    .line 498
    :goto_c
    :try_start_e
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 499
    .line 500
    .line 501
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    new-instance v4, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 512
    .line 513
    .line 514
    const-string v5, "[LIVEPHOTO-MERGE-VIDEO-RETRY] \u5019\u9009 "

    .line 515
    .line 516
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    move-object/from16 v5, v24

    .line 529
    .line 530
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    move v0, v1

    .line 544
    move-object v2, v10

    .line 545
    move-object v5, v13

    .line 546
    move-object v4, v15

    .line 547
    move-object/from16 v12, v21

    .line 548
    .line 549
    move-object/from16 v13, v22

    .line 550
    .line 551
    move-object/from16 v15, v23

    .line 552
    .line 553
    move/from16 v9, v27

    .line 554
    .line 555
    move-object/from16 v14, v28

    .line 556
    .line 557
    move-object/from16 v19, v35

    .line 558
    .line 559
    move-object/from16 v8, v36

    .line 560
    .line 561
    move-object/from16 v6, v37

    .line 562
    .line 563
    const/4 v10, 0x0

    .line 564
    move-object/from16 v1, p0

    .line 565
    .line 566
    goto/16 :goto_5

    .line 567
    .line 568
    :catchall_c
    move-exception v0

    .line 569
    goto/16 :goto_3

    .line 570
    .line 571
    :catchall_d
    move-exception v0

    .line 572
    move-object v13, v5

    .line 573
    :goto_d
    move-object/from16 v3, v26

    .line 574
    .line 575
    goto/16 :goto_3

    .line 576
    .line 577
    :cond_7
    move-object v10, v2

    .line 578
    move-object/from16 v37, v6

    .line 579
    .line 580
    move v6, v8

    .line 581
    move/from16 v27, v9

    .line 582
    .line 583
    move-object/from16 v28, v14

    .line 584
    .line 585
    move-object/from16 v35, v19

    .line 586
    .line 587
    move-object/from16 v36, v20

    .line 588
    .line 589
    move-object/from16 v11, v25

    .line 590
    .line 591
    move-object/from16 v19, v1

    .line 592
    .line 593
    move-object v14, v3

    .line 594
    move-object/from16 v20, v15

    .line 595
    .line 596
    move-object/from16 v3, v26

    .line 597
    .line 598
    move-object v15, v4

    .line 599
    move-object/from16 v26, v13

    .line 600
    .line 601
    move-object v13, v5

    .line 602
    move-object/from16 v1, v17

    .line 603
    .line 604
    goto/16 :goto_6

    .line 605
    .line 606
    :goto_e
    if-nez v1, :cond_9

    .line 607
    .line 608
    new-instance v0, Ljava/lang/Exception;

    .line 609
    .line 610
    if-eqz v18, :cond_8

    .line 611
    .line 612
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    goto :goto_f

    .line 617
    :cond_8
    move-object/from16 v1, v17

    .line 618
    .line 619
    :goto_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 622
    .line 623
    .line 624
    const-string v4, "\u5408\u5e76\u52a8\u56fe\u5931\u8d25\uff1a\u89c6\u9891\u5168\u90e8\u5019\u9009\u4e0b\u8f7d\u5931\u8d25: "

    .line 625
    .line 626
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    throw v0

    .line 640
    :cond_9
    if-eqz v7, :cond_a

    .line 641
    .line 642
    const-string v0, "\u6b63\u5728\u51c6\u5907\u9759\u6001\u56fe"

    .line 643
    .line 644
    const/16 v2, 0x37

    .line 645
    .line 646
    invoke-static {v2, v3, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    :cond_a
    const-string v0, "dyhelper_lp_img_"

    .line 650
    .line 651
    const-string v2, ".jpg"

    .line 652
    .line 653
    invoke-static {v0, v2, v15}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    const-string v4, ""

    .line 661
    .line 662
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->isEmpty()Z

    .line 663
    .line 664
    .line 665
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 666
    const-wide/16 v23, 0x0

    .line 667
    .line 668
    if-nez v0, :cond_e

    .line 669
    .line 670
    :try_start_f
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 671
    .line 672
    .line 673
    move-result-object v8

    .line 674
    move-object/from16 v16, v17

    .line 675
    .line 676
    const/4 v0, 0x0

    .line 677
    const/4 v9, 0x0

    .line 678
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 679
    .line 680
    .line 681
    move-result v18

    .line 682
    if-eqz v18, :cond_d

    .line 683
    .line 684
    move-object/from16 p0, v4

    .line 685
    .line 686
    add-int/lit8 v4, v0, 0x1

    .line 687
    .line 688
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    check-cast v0, Ljava/lang/String;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_19

    .line 693
    .line 694
    :try_start_10
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 695
    .line 696
    .line 697
    move-result v18

    .line 698
    if-eqz v18, :cond_b

    .line 699
    .line 700
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_e

    .line 701
    .line 702
    .line 703
    :catchall_e
    :cond_b
    move/from16 v18, v6

    .line 704
    .line 705
    :try_start_11
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    .line 706
    .line 707
    .line 708
    move-result v6
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_16

    .line 709
    move-object/from16 v25, v8

    .line 710
    .line 711
    :try_start_12
    invoke-static {v10, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v8
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_15

    .line 715
    move/from16 v29, v9

    .line 716
    .line 717
    :try_start_13
    new-instance v9, Ljava/lang/StringBuilder;

    .line 718
    .line 719
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_14

    .line 720
    .line 721
    .line 722
    move-object/from16 v30, v11

    .line 723
    .line 724
    :try_start_14
    const-string v11, "[LIVEPHOTO-MERGE-IMG] awemeId="

    .line 725
    .line 726
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_13

    .line 727
    .line 728
    .line 729
    move-object/from16 v11, v28

    .line 730
    .line 731
    :try_start_15
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_12

    .line 732
    .line 733
    .line 734
    move-object/from16 v28, v13

    .line 735
    .line 736
    move-object/from16 v13, v26

    .line 737
    .line 738
    :try_start_16
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_11

    .line 748
    .line 749
    .line 750
    move-object/from16 v6, v20

    .line 751
    .line 752
    :try_start_17
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v8

    .line 762
    invoke-static {v14, v8}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v10, v2, v0}, Lqy0;->Ζ(Ljava/io/File;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 772
    .line 773
    .line 774
    move-result v8

    .line 775
    if-eqz v8, :cond_c

    .line 776
    .line 777
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 778
    .line 779
    .line 780
    move-result-wide v8
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_10

    .line 781
    cmp-long v8, v8, v23

    .line 782
    .line 783
    if-lez v8, :cond_c

    .line 784
    .line 785
    :try_start_18
    invoke-static {v10, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v4
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_f

    .line 789
    move/from16 v9, v27

    .line 790
    .line 791
    goto/16 :goto_16

    .line 792
    .line 793
    :catchall_f
    move-exception v0

    .line 794
    move-object/from16 v16, v0

    .line 795
    .line 796
    move/from16 v9, v27

    .line 797
    .line 798
    goto :goto_15

    .line 799
    :catchall_10
    move-exception v0

    .line 800
    :goto_11
    move-object/from16 v16, v0

    .line 801
    .line 802
    move/from16 v9, v29

    .line 803
    .line 804
    goto :goto_15

    .line 805
    :cond_c
    :try_start_19
    new-instance v0, Ljava/lang/Exception;

    .line 806
    .line 807
    const-string v8, "JPEG \u8f93\u51fa\u4e3a\u7a7a"

    .line 808
    .line 809
    invoke-direct {v0, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    throw v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    .line 813
    :catchall_11
    move-exception v0

    .line 814
    move-object/from16 v6, v20

    .line 815
    .line 816
    goto :goto_11

    .line 817
    :catchall_12
    move-exception v0

    .line 818
    move-object/from16 v28, v13

    .line 819
    .line 820
    move-object/from16 v6, v20

    .line 821
    .line 822
    :goto_12
    move-object/from16 v13, v26

    .line 823
    .line 824
    goto :goto_11

    .line 825
    :catchall_13
    move-exception v0

    .line 826
    :goto_13
    move-object/from16 v6, v20

    .line 827
    .line 828
    move-object/from16 v11, v28

    .line 829
    .line 830
    move-object/from16 v28, v13

    .line 831
    .line 832
    goto :goto_12

    .line 833
    :catchall_14
    move-exception v0

    .line 834
    move-object/from16 v30, v11

    .line 835
    .line 836
    goto :goto_13

    .line 837
    :catchall_15
    move-exception v0

    .line 838
    :goto_14
    move/from16 v29, v9

    .line 839
    .line 840
    move-object/from16 v30, v11

    .line 841
    .line 842
    move-object/from16 v6, v20

    .line 843
    .line 844
    move-object/from16 v11, v28

    .line 845
    .line 846
    move-object/from16 v28, v13

    .line 847
    .line 848
    move-object/from16 v13, v26

    .line 849
    .line 850
    move-object/from16 v16, v0

    .line 851
    .line 852
    goto :goto_15

    .line 853
    :catchall_16
    move-exception v0

    .line 854
    move-object/from16 v25, v8

    .line 855
    .line 856
    goto :goto_14

    .line 857
    :goto_15
    :try_start_1a
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_17

    .line 858
    .line 859
    .line 860
    :catchall_17
    :try_start_1b
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v8

    .line 868
    move/from16 v20, v9

    .line 869
    .line 870
    new-instance v9, Ljava/lang/StringBuilder;

    .line 871
    .line 872
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 873
    .line 874
    .line 875
    move-object/from16 v26, v13

    .line 876
    .line 877
    const-string v13, "[LIVEPHOTO-MERGE-IMG-RETRY] \u9759\u6001\u56fe\u5019\u9009 "

    .line 878
    .line 879
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_18

    .line 902
    .line 903
    .line 904
    move v0, v4

    .line 905
    move/from16 v9, v20

    .line 906
    .line 907
    move-object/from16 v8, v25

    .line 908
    .line 909
    move-object/from16 v13, v28

    .line 910
    .line 911
    move-object/from16 v4, p0

    .line 912
    .line 913
    move-object/from16 v20, v6

    .line 914
    .line 915
    move-object/from16 v28, v11

    .line 916
    .line 917
    move/from16 v6, v18

    .line 918
    .line 919
    move-object/from16 v11, v30

    .line 920
    .line 921
    goto/16 :goto_10

    .line 922
    .line 923
    :catchall_18
    move-exception v0

    .line 924
    move-object/from16 v2, v17

    .line 925
    .line 926
    move-object/from16 v13, v28

    .line 927
    .line 928
    goto/16 :goto_26

    .line 929
    .line 930
    :catchall_19
    move-exception v0

    .line 931
    move-object/from16 v28, v13

    .line 932
    .line 933
    goto/16 :goto_3

    .line 934
    .line 935
    :cond_d
    move-object/from16 p0, v4

    .line 936
    .line 937
    move/from16 v18, v6

    .line 938
    .line 939
    move/from16 v29, v9

    .line 940
    .line 941
    move-object/from16 v30, v11

    .line 942
    .line 943
    move-object/from16 v6, v20

    .line 944
    .line 945
    move-object/from16 v11, v28

    .line 946
    .line 947
    move-object/from16 v28, v13

    .line 948
    .line 949
    goto :goto_16

    .line 950
    :cond_e
    move-object/from16 p0, v4

    .line 951
    .line 952
    move/from16 v18, v6

    .line 953
    .line 954
    move-object/from16 v30, v11

    .line 955
    .line 956
    move-object/from16 v6, v20

    .line 957
    .line 958
    move-object/from16 v11, v28

    .line 959
    .line 960
    move-object/from16 v28, v13

    .line 961
    .line 962
    :try_start_1c
    const-string v0, "[LIVEPHOTO-MERGE-IMG-SKIP] \u6ca1\u6709\u9759\u6001\u56fe\u5019\u9009\uff0c\u51c6\u5907\u4f7f\u7528\u89c6\u9891\u9996\u5e27"

    .line 963
    .line 964
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_22

    .line 965
    .line 966
    .line 967
    move-object/from16 v4, p0

    .line 968
    .line 969
    move-object/from16 v16, v17

    .line 970
    .line 971
    const/4 v9, 0x0

    .line 972
    :goto_16
    if-nez v9, :cond_13

    .line 973
    .line 974
    if-eqz v7, :cond_f

    .line 975
    .line 976
    :try_start_1d
    const-string v0, "\u9759\u6001\u56fe\u4e0d\u53ef\u7528\uff0c\u4f7f\u7528\u89c6\u9891\u9996\u5e27"

    .line 977
    .line 978
    const/16 v4, 0x3c

    .line 979
    .line 980
    invoke-static {v4, v3, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_18

    .line 981
    .line 982
    .line 983
    :cond_f
    :try_start_1e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    invoke-static {v1, v2}, Lqy0;->φ(Ljava/io/File;Ljava/io/File;)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 990
    .line 991
    .line 992
    move-result v0

    .line 993
    if-eqz v0, :cond_10

    .line 994
    .line 995
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 996
    .line 997
    .line 998
    move-result-wide v4

    .line 999
    cmp-long v0, v4, v23

    .line 1000
    .line 1001
    if-lez v0, :cond_10

    .line 1002
    .line 1003
    const-string v4, "video-frame"

    .line 1004
    .line 1005
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 1006
    .line 1007
    .line 1008
    move-result-wide v8

    .line 1009
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1012
    .line 1013
    .line 1014
    const-string v5, "[LIVEPHOTO-MERGE-IMG-FRAME] awemeId="

    .line 1015
    .line 1016
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    .line 1022
    const-string v5, ", \u4f7f\u7528\u89c6\u9891\u9996\u5e27\u751f\u6210\u9759\u6001\u56fe, size="

    .line 1023
    .line 1024
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_18

    .line 1038
    :catchall_1a
    move-exception v0

    .line 1039
    goto :goto_17

    .line 1040
    :cond_10
    new-instance v0, Ljava/lang/Exception;

    .line 1041
    .line 1042
    const-string v1, "\u89c6\u9891\u9996\u5e27 JPEG \u8f93\u51fa\u4e3a\u7a7a"

    .line 1043
    .line 1044
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1a

    .line 1048
    :goto_17
    if-eqz v16, :cond_11

    .line 1049
    .line 1050
    :try_start_1f
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    if-nez v1, :cond_12

    .line 1055
    .line 1056
    :cond_11
    const-string v1, "\u6ca1\u6709\u9759\u6001\u56fe\u5019\u9009"

    .line 1057
    .line 1058
    :cond_12
    new-instance v2, Ljava/lang/Exception;

    .line 1059
    .line 1060
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1065
    .line 1066
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1067
    .line 1068
    .line 1069
    const-string v5, "\u5408\u5e76\u52a8\u56fe\u5931\u8d25\uff1a\u9759\u6001\u56fe\u7247\u5168\u90e8\u5019\u9009\u4e0d\u53ef\u7528\uff0c\u4e14\u89c6\u9891\u9996\u5e27\u515c\u5e95\u5931\u8d25\u3002\n\u56fe\u7247\u9519\u8bef\uff1a"

    .line 1070
    .line 1071
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    .line 1077
    const-string v1, "\n\u9996\u5e27\u9519\u8bef\uff1a"

    .line 1078
    .line 1079
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1090
    .line 1091
    .line 1092
    throw v2
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_18

    .line 1093
    :cond_13
    :goto_18
    :try_start_20
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 1094
    .line 1095
    .line 1096
    move-result-wide v8

    .line 1097
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1100
    .line 1101
    .line 1102
    const-string v5, "[LIVEPHOTO-MERGE-IMG-READY] awemeId="

    .line 1103
    .line 1104
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    .line 1110
    const-string v5, ", size="

    .line 1111
    .line 1112
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1116
    .line 1117
    .line 1118
    const-string v5, ", source="

    .line 1119
    .line 1120
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual/range {v21 .. v21}, Lf8;->δ()Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    if-eqz v0, :cond_14

    .line 1138
    .line 1139
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v4
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_22

    .line 1143
    if-eqz v4, :cond_15

    .line 1144
    .line 1145
    :cond_14
    move-object v12, v2

    .line 1146
    move-object/from16 v31, v10

    .line 1147
    .line 1148
    move/from16 v6, v18

    .line 1149
    .line 1150
    move-object/from16 v13, v28

    .line 1151
    .line 1152
    move-object v10, v1

    .line 1153
    move-object/from16 v28, v11

    .line 1154
    .line 1155
    move-object/from16 v11, v19

    .line 1156
    .line 1157
    goto/16 :goto_1f

    .line 1158
    .line 1159
    :cond_15
    if-eqz v7, :cond_16

    .line 1160
    .line 1161
    :try_start_21
    const-string v4, "\u6b63\u5728\u4e0b\u8f7d\u97f3\u9891"

    .line 1162
    .line 1163
    const/16 v5, 0x42

    .line 1164
    .line 1165
    invoke-static {v5, v3, v7, v4}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_18

    .line 1166
    .line 1167
    .line 1168
    :cond_16
    :try_start_22
    const-string v4, "dyhelper_lp_audio_"
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_22

    .line 1169
    .line 1170
    :try_start_23
    const-string v5, ".mp3"

    .line 1171
    .line 1172
    const-string v8, ".flac"

    .line 1173
    .line 1174
    const-string v9, ".wav"

    .line 1175
    .line 1176
    const-string v12, ".ogg"

    .line 1177
    .line 1178
    const-string v13, ".m4a"

    .line 1179
    .line 1180
    move-object/from16 p0, v1

    .line 1181
    .line 1182
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1183
    .line 1184
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1189
    .line 1190
    .line 1191
    move-object/from16 v16, v2

    .line 1192
    .line 1193
    const-string v2, ".aac"
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_21

    .line 1194
    .line 1195
    move-object/from16 v26, v3

    .line 1196
    .line 1197
    const/4 v3, 0x0

    .line 1198
    :try_start_24
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v20

    .line 1202
    if-eqz v20, :cond_17

    .line 1203
    .line 1204
    move-object v5, v2

    .line 1205
    :goto_19
    move-object/from16 v2, v19

    .line 1206
    .line 1207
    goto :goto_1a

    .line 1208
    :cond_17
    invoke-static {v1, v13, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v2

    .line 1212
    if-eqz v2, :cond_18

    .line 1213
    .line 1214
    move-object v5, v13

    .line 1215
    goto :goto_19

    .line 1216
    :cond_18
    move-object/from16 v2, v19

    .line 1217
    .line 1218
    invoke-static {v1, v2, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v19

    .line 1222
    if-eqz v19, :cond_19

    .line 1223
    .line 1224
    move-object v5, v13

    .line 1225
    goto :goto_1a

    .line 1226
    :cond_19
    invoke-static {v1, v12, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v13

    .line 1230
    if-eqz v13, :cond_1a

    .line 1231
    .line 1232
    move-object v5, v12

    .line 1233
    goto :goto_1a

    .line 1234
    :cond_1a
    invoke-static {v1, v9, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1235
    .line 1236
    .line 1237
    move-result v12

    .line 1238
    if-eqz v12, :cond_1b

    .line 1239
    .line 1240
    move-object v5, v9

    .line 1241
    goto :goto_1a

    .line 1242
    :cond_1b
    invoke-static {v1, v8, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1243
    .line 1244
    .line 1245
    move-result v9

    .line 1246
    if-eqz v9, :cond_1c

    .line 1247
    .line 1248
    move-object v5, v8

    .line 1249
    goto :goto_1a

    .line 1250
    :cond_1c
    invoke-static {v1, v5, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1251
    .line 1252
    .line 1253
    move-result v1

    .line 1254
    if-eqz v1, :cond_1d

    .line 1255
    .line 1256
    goto :goto_1a

    .line 1257
    :cond_1d
    const-string v5, ".audio"
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_20

    .line 1258
    .line 1259
    :goto_1a
    :try_start_25
    invoke-static {v4, v5, v15}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v12
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_1f

    .line 1263
    move-object/from16 v13, v28

    .line 1264
    .line 1265
    :try_start_26
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_1e

    .line 1266
    .line 1267
    .line 1268
    :try_start_27
    invoke-static {v10, v0}, Lqy0;->ю(Lqy0;Ljava/lang/String;)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v1

    .line 1272
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1273
    .line 1274
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1275
    .line 1276
    .line 1277
    const-string v4, "[LIVEPHOTO-MERGE-AUDIO] awemeId="

    .line 1278
    .line 1279
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v1

    .line 1295
    invoke-static {v14, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_1d

    .line 1296
    .line 1297
    .line 1298
    move-object/from16 v19, v2

    .line 1299
    .line 1300
    :try_start_28
    new-instance v2, Ljava/io/FileOutputStream;

    .line 1301
    .line 1302
    invoke-direct {v2, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v10}, Lqy0;->ж()I

    .line 1306
    .line 1307
    .line 1308
    move-result v4

    .line 1309
    const-string v5, "\u52a8\u56fe\u97f3\u9891"

    .line 1310
    .line 1311
    new-instance v8, Lig;

    .line 1312
    .line 1313
    const/16 v1, 0x16

    .line 1314
    .line 1315
    invoke-direct {v8, v1}, Lig;-><init>(I)V

    .line 1316
    .line 1317
    .line 1318
    new-instance v9, Lig;

    .line 1319
    .line 1320
    const/16 v1, 0x17

    .line 1321
    .line 1322
    invoke-direct {v9, v1}, Lig;-><init>(I)V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_1c

    .line 1323
    .line 1324
    .line 1325
    move-object v1, v0

    .line 1326
    move-object/from16 v31, v10

    .line 1327
    .line 1328
    move-object/from16 v28, v11

    .line 1329
    .line 1330
    move/from16 v6, v18

    .line 1331
    .line 1332
    move-object/from16 v11, v19

    .line 1333
    .line 1334
    move-object/from16 v3, v26

    .line 1335
    .line 1336
    move-object/from16 v10, p0

    .line 1337
    .line 1338
    move-object/from16 p0, v12

    .line 1339
    .line 1340
    move-object/from16 v12, v16

    .line 1341
    .line 1342
    :try_start_29
    invoke-static/range {v1 .. v9}, Lqy0;->Ο(Ljava/lang/String;Ljava/io/OutputStream;Landroid/content/Context;ILjava/lang/String;ZLjava/lang/String;Le80;Le80;)V

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    .line 1346
    .line 1347
    .line 1348
    move-result-wide v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_1b

    .line 1349
    cmp-long v0, v0, v23

    .line 1350
    .line 1351
    if-lez v0, :cond_1e

    .line 1352
    .line 1353
    move-object/from16 v0, p0

    .line 1354
    .line 1355
    goto :goto_20

    .line 1356
    :catchall_1b
    move-exception v0

    .line 1357
    goto :goto_1c

    .line 1358
    :catchall_1c
    move-exception v0

    .line 1359
    move-object/from16 v31, v10

    .line 1360
    .line 1361
    move-object/from16 v28, v11

    .line 1362
    .line 1363
    move/from16 v6, v18

    .line 1364
    .line 1365
    move-object/from16 v11, v19

    .line 1366
    .line 1367
    move-object/from16 v3, v26

    .line 1368
    .line 1369
    move-object/from16 v10, p0

    .line 1370
    .line 1371
    :goto_1b
    move-object/from16 p0, v12

    .line 1372
    .line 1373
    move-object/from16 v12, v16

    .line 1374
    .line 1375
    goto :goto_1c

    .line 1376
    :catchall_1d
    move-exception v0

    .line 1377
    move-object/from16 v31, v10

    .line 1378
    .line 1379
    move-object/from16 v28, v11

    .line 1380
    .line 1381
    move/from16 v6, v18

    .line 1382
    .line 1383
    move-object/from16 v3, v26

    .line 1384
    .line 1385
    move-object/from16 v10, p0

    .line 1386
    .line 1387
    move-object v11, v2

    .line 1388
    goto :goto_1b

    .line 1389
    :goto_1c
    :try_start_2a
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->delete()Z

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1397
    .line 1398
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1399
    .line 1400
    .line 1401
    const-string v2, "[LIVEPHOTO-MERGE-AUDIO-SKIP] \u97f3\u9891\u4e0b\u8f7d\u5931\u8d25\uff0c\u7ee7\u7eed\u65e0\u97f3\u9891\u5408\u6210: "

    .line 1402
    .line 1403
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1414
    .line 1415
    .line 1416
    :cond_1e
    :goto_1d
    move-object/from16 v0, v17

    .line 1417
    .line 1418
    goto :goto_20

    .line 1419
    :catchall_1e
    move-exception v0

    .line 1420
    goto/16 :goto_d

    .line 1421
    .line 1422
    :catchall_1f
    move-exception v0

    .line 1423
    move-object/from16 v3, v26

    .line 1424
    .line 1425
    :goto_1e
    move-object/from16 v13, v28

    .line 1426
    .line 1427
    goto/16 :goto_3

    .line 1428
    .line 1429
    :catchall_20
    move-exception v0

    .line 1430
    move-object/from16 v3, v26

    .line 1431
    .line 1432
    goto :goto_1e

    .line 1433
    :catchall_21
    move-exception v0

    .line 1434
    goto :goto_1e

    .line 1435
    :catchall_22
    move-exception v0

    .line 1436
    goto :goto_1e

    .line 1437
    :goto_1f
    const-string v0, "[LIVEPHOTO-MERGE-AUDIO-SKIP] \u672a\u627e\u5230\u97f3\u9891\u94fe\u63a5\uff0c\u7ee7\u7eed\u65e0\u97f3\u9891\u5408\u6210"

    .line 1438
    .line 1439
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1440
    .line 1441
    .line 1442
    goto :goto_1d

    .line 1443
    :goto_20
    if-eqz v7, :cond_1f

    .line 1444
    .line 1445
    const-string v1, "\u6b63\u5728\u5408\u5e76\u97f3\u89c6\u9891"

    .line 1446
    .line 1447
    const/16 v2, 0x50

    .line 1448
    .line 1449
    invoke-static {v2, v3, v7, v1}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1450
    .line 1451
    .line 1452
    :cond_1f
    if-eqz v0, :cond_22

    .line 1453
    .line 1454
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 1455
    .line 1456
    .line 1457
    move-result v1

    .line 1458
    if-eqz v1, :cond_22

    .line 1459
    .line 1460
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 1461
    .line 1462
    .line 1463
    move-result-wide v1

    .line 1464
    cmp-long v1, v1, v23

    .line 1465
    .line 1466
    if-lez v1, :cond_22

    .line 1467
    .line 1468
    const-string v1, "dyhelper_lp_mux_"

    .line 1469
    .line 1470
    invoke-static {v1, v11, v15}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v1

    .line 1474
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_c

    .line 1475
    .line 1476
    .line 1477
    :try_start_2b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1478
    .line 1479
    .line 1480
    move-object/from16 v11, v30

    .line 1481
    .line 1482
    invoke-virtual {v11, v10, v0, v1}, Lpu0;->Ν(Ljava/io/File;Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    if-eqz v0, :cond_20

    .line 1487
    .line 1488
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 1489
    .line 1490
    .line 1491
    move-result-wide v4

    .line 1492
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1493
    .line 1494
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1495
    .line 1496
    .line 1497
    const-string v8, "[LIVEPHOTO-MERGE-MUX] \u97f3\u89c6\u9891\u5408\u5e76\u6210\u529f, size="

    .line 1498
    .line 1499
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v2

    .line 1509
    invoke-static {v14, v2}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1510
    .line 1511
    .line 1512
    move-object v1, v0

    .line 1513
    goto :goto_23

    .line 1514
    :catchall_23
    move-exception v0

    .line 1515
    goto :goto_22

    .line 1516
    :cond_20
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1517
    .line 1518
    .line 1519
    const-string v0, "[LIVEPHOTO-MERGE-MUX-SKIP] \u97f3\u9891\u683c\u5f0f\u4e0d\u652f\u6301 MP4 \u5c01\u88c5\u6216\u5408\u5e76\u5931\u8d25\uff0c\u4f7f\u7528\u539f\u89c6\u9891"

    .line 1520
    .line 1521
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_23

    .line 1522
    .line 1523
    .line 1524
    :cond_21
    :goto_21
    move-object v1, v10

    .line 1525
    goto :goto_23

    .line 1526
    :goto_22
    :try_start_2c
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1527
    .line 1528
    .line 1529
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v0

    .line 1533
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1534
    .line 1535
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1536
    .line 1537
    .line 1538
    const-string v2, "[LIVEPHOTO-MERGE-MUX-EXCEPTION] \u97f3\u9891\u5408\u5e76\u5f02\u5e38\uff0c\u964d\u7ea7\u4e3a\u65e0\u58f0\u52a8\u56fe: "

    .line 1539
    .line 1540
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1551
    .line 1552
    .line 1553
    goto :goto_21

    .line 1554
    :cond_22
    if-eqz v0, :cond_21

    .line 1555
    .line 1556
    const-string v0, "[LIVEPHOTO-MERGE-AUDIO-EMPTY] \u97f3\u9891\u6587\u4ef6\u4e3a\u7a7a\uff0c\u4f7f\u7528\u539f\u89c6\u9891"

    .line 1557
    .line 1558
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1559
    .line 1560
    .line 1561
    goto :goto_21

    .line 1562
    :goto_23
    if-eqz v7, :cond_23

    .line 1563
    .line 1564
    const-string v0, "\u6b63\u5728\u751f\u6210\u52a8\u6001\u7167\u7247"

    .line 1565
    .line 1566
    const/16 v2, 0x58

    .line 1567
    .line 1568
    invoke-static {v2, v3, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1569
    .line 1570
    .line 1571
    :cond_23
    move-object/from16 v2, v35

    .line 1572
    .line 1573
    iget-object v0, v2, Lfv;->α:Ljava/lang/String;

    .line 1574
    .line 1575
    const-string v2, "image/jpeg"

    .line 1576
    .line 1577
    sget-object v4, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 1578
    .line 1579
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1580
    .line 1581
    .line 1582
    move-object/from16 v5, v36

    .line 1583
    .line 1584
    invoke-static {v3, v0, v5, v2, v4}, Lqy0;->χ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v2
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_c

    .line 1588
    :try_start_2d
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v4
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_24

    .line 1596
    if-eqz v4, :cond_28

    .line 1597
    .line 1598
    :try_start_2e
    new-instance v0, Lnu0;

    .line 1599
    .line 1600
    move-object/from16 v8, v37

    .line 1601
    .line 1602
    invoke-direct {v0, v8}, Lnu0;-><init>(Lou0;)V

    .line 1603
    .line 1604
    .line 1605
    invoke-static {v12, v1, v4, v0}, Lpu0;->Φ(Ljava/io/File;Ljava/io/File;Ljava/io/OutputStream;Lnu0;)V
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_26

    .line 1606
    .line 1607
    .line 1608
    :try_start_2f
    invoke-interface {v4}, Ljava/io/Closeable;->close()V

    .line 1609
    .line 1610
    .line 1611
    invoke-static {v3, v2}, Lqy0;->д(Landroid/content/Context;Landroid/net/Uri;)V

    .line 1612
    .line 1613
    .line 1614
    if-eqz v7, :cond_24

    .line 1615
    .line 1616
    const-string v0, "\u52a8\u6001\u7167\u7247\u751f\u6210\u5b8c\u6210"

    .line 1617
    .line 1618
    const/16 v1, 0x64

    .line 1619
    .line 1620
    invoke-static {v1, v3, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1621
    .line 1622
    .line 1623
    goto :goto_24

    .line 1624
    :catchall_24
    move-exception v0

    .line 1625
    goto/16 :goto_26

    .line 1626
    .line 1627
    :cond_24
    :goto_24
    if-eqz v6, :cond_25

    .line 1628
    .line 1629
    const-string v0, "notification"

    .line 1630
    .line 1631
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v0

    .line 1635
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1636
    .line 1637
    .line 1638
    check-cast v0, Landroid/app/NotificationManager;

    .line 1639
    .line 1640
    invoke-virtual/range {v31 .. v31}, Lqy0;->ж()I

    .line 1641
    .line 1642
    .line 1643
    move-result v1

    .line 1644
    new-instance v4, Lx31;

    .line 1645
    .line 1646
    invoke-direct {v4, v3}, Lx31;-><init>(Landroid/content/Context;)V

    .line 1647
    .line 1648
    .line 1649
    iget-object v6, v4, Lx31;->ξ:Landroid/app/Notification;

    .line 1650
    .line 1651
    const v7, 0x1080082

    .line 1652
    .line 1653
    .line 1654
    iput v7, v6, Landroid/app/Notification;->icon:I

    .line 1655
    .line 1656
    const-string v6, "\u52a8\u56fe\u5408\u5e76\u5b8c\u6210"

    .line 1657
    .line 1658
    invoke-static {v6}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v6

    .line 1662
    iput-object v6, v4, Lx31;->ε:Ljava/lang/CharSequence;

    .line 1663
    .line 1664
    invoke-static {v5}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v6

    .line 1668
    iput-object v6, v4, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 1669
    .line 1670
    const/16 v6, 0x10

    .line 1671
    .line 1672
    invoke-virtual {v4, v6}, Lx31;->γ(I)V

    .line 1673
    .line 1674
    .line 1675
    const/4 v6, 0x1

    .line 1676
    iput-boolean v6, v4, Lx31;->ο:Z

    .line 1677
    .line 1678
    invoke-virtual {v4}, Lx31;->α()Landroid/app/Notification;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v4

    .line 1682
    invoke-virtual {v0, v1, v4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 1683
    .line 1684
    .line 1685
    :cond_25
    iget-object v0, v8, Lou0;->ζ:Ljava/lang/String;

    .line 1686
    .line 1687
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1688
    .line 1689
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1690
    .line 1691
    .line 1692
    const-string v4, "[LIVEPHOTO-MERGE-DONE] awemeId="

    .line 1693
    .line 1694
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1695
    .line 1696
    .line 1697
    move-object/from16 v11, v28

    .line 1698
    .line 1699
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1700
    .line 1701
    .line 1702
    const-string v4, ", file="

    .line 1703
    .line 1704
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1705
    .line 1706
    .line 1707
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1708
    .line 1709
    .line 1710
    const-string v4, ", format="

    .line 1711
    .line 1712
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v0

    .line 1722
    invoke-static {v14, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1723
    .line 1724
    .line 1725
    invoke-static {v5}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v0
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_24

    .line 1729
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    :catchall_25
    :cond_26
    :goto_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v2

    .line 1737
    if-eqz v2, :cond_27

    .line 1738
    .line 1739
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v2

    .line 1743
    check-cast v2, Ljava/io/File;

    .line 1744
    .line 1745
    :try_start_30
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 1746
    .line 1747
    .line 1748
    move-result v3

    .line 1749
    if-eqz v3, :cond_26

    .line 1750
    .line 1751
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_25

    .line 1752
    .line 1753
    .line 1754
    goto :goto_25

    .line 1755
    :cond_27
    return-object v0

    .line 1756
    :catchall_26
    move-exception v0

    .line 1757
    move-object v1, v0

    .line 1758
    :try_start_31
    throw v1
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_27

    .line 1759
    :catchall_27
    move-exception v0

    .line 1760
    :try_start_32
    invoke-static {v4, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1761
    .line 1762
    .line 1763
    throw v0

    .line 1764
    :cond_28
    new-instance v0, Ljava/lang/Exception;

    .line 1765
    .line 1766
    const-string v1, "\u65e0\u6cd5\u6253\u5f00 Motion Photo \u8f93\u51fa\u6d41"

    .line 1767
    .line 1768
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1769
    .line 1770
    .line 1771
    throw v0
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_24

    .line 1772
    :goto_26
    :try_start_33
    invoke-static {v3, v2}, Lqy0;->ω(Landroid/content/Context;Landroid/net/Uri;)V

    .line 1773
    .line 1774
    .line 1775
    throw v0
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_28

    .line 1776
    :catchall_28
    move-exception v0

    .line 1777
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v1

    .line 1781
    :catchall_29
    :cond_29
    :goto_27
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1782
    .line 1783
    .line 1784
    move-result v2

    .line 1785
    if-eqz v2, :cond_2a

    .line 1786
    .line 1787
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v2

    .line 1791
    check-cast v2, Ljava/io/File;

    .line 1792
    .line 1793
    :try_start_34
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 1794
    .line 1795
    .line 1796
    move-result v3

    .line 1797
    if-eqz v3, :cond_29

    .line 1798
    .line 1799
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_29

    .line 1800
    .line 1801
    .line 1802
    goto :goto_27

    .line 1803
    :cond_2a
    throw v0

    .line 1804
    :cond_2b
    new-instance v0, Ljava/lang/Exception;

    .line 1805
    .line 1806
    const-string v1, "\u5408\u5e76\u52a8\u56fe\u5931\u8d25\uff1a\u672a\u627e\u5230\u53ef\u76f4\u63a5\u4fdd\u5b58\u7684 MP4 \u89c6\u9891\u8d44\u6e90"

    .line 1807
    .line 1808
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1809
    .line 1810
    .line 1811
    throw v0

    .line 1812
    :pswitch_0
    iget-object v0, v1, Lbf0;->η:Ljava/lang/Object;

    .line 1813
    .line 1814
    move-object v2, v0

    .line 1815
    check-cast v2, Ljava/util/List;

    .line 1816
    .line 1817
    iget-object v0, v1, Lbf0;->θ:Ljava/lang/Object;

    .line 1818
    .line 1819
    move-object v4, v0

    .line 1820
    check-cast v4, Landroid/app/Activity;

    .line 1821
    .line 1822
    iget-object v0, v1, Lbf0;->ι:Ljava/lang/Object;

    .line 1823
    .line 1824
    move-object v5, v0

    .line 1825
    check-cast v5, Lf8;

    .line 1826
    .line 1827
    iget-object v0, v1, Lbf0;->κ:Ljava/lang/Object;

    .line 1828
    .line 1829
    move-object v8, v0

    .line 1830
    check-cast v8, Ljava/lang/String;

    .line 1831
    .line 1832
    sget-object v3, Lqy0;->α:Lqy0;

    .line 1833
    .line 1834
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v9

    .line 1838
    const/4 v10, 0x0

    .line 1839
    move v0, v10

    .line 1840
    move v11, v0

    .line 1841
    :goto_28
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1842
    .line 1843
    .line 1844
    move-result v6

    .line 1845
    const-string v7, "\u9009\u62e9\u4e0b\u8f7d"

    .line 1846
    .line 1847
    const-string v12, "/"

    .line 1848
    .line 1849
    if-eqz v6, :cond_30

    .line 1850
    .line 1851
    const/4 v6, 0x1

    .line 1852
    add-int/lit8 v13, v0, 0x1

    .line 1853
    .line 1854
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v0

    .line 1858
    move-object v14, v0

    .line 1859
    check-cast v14, Lzy0;

    .line 1860
    .line 1861
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1862
    .line 1863
    .line 1864
    move-result v0

    .line 1865
    new-instance v15, Ljava/lang/StringBuilder;

    .line 1866
    .line 1867
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 1868
    .line 1869
    .line 1870
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1871
    .line 1872
    .line 1873
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1877
    .line 1878
    .line 1879
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v0

    .line 1883
    mul-int/lit8 v12, v13, 0x64

    .line 1884
    .line 1885
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1886
    .line 1887
    .line 1888
    move-result v15

    .line 1889
    div-int/2addr v12, v15

    .line 1890
    invoke-static {v12, v4, v7, v0}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1891
    .line 1892
    .line 1893
    :try_start_35
    iget-object v0, v14, Lzy0;->α:Laz0;

    .line 1894
    .line 1895
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1896
    .line 1897
    .line 1898
    move-result v0
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_2b

    .line 1899
    iget-boolean v7, v1, Lbf0;->ζ:Z

    .line 1900
    .line 1901
    if-eqz v0, :cond_2e

    .line 1902
    .line 1903
    if-eq v0, v6, :cond_2d

    .line 1904
    .line 1905
    const/4 v6, 0x2

    .line 1906
    if-eq v0, v6, :cond_2d

    .line 1907
    .line 1908
    const/4 v6, 0x3

    .line 1909
    if-ne v0, v6, :cond_2c

    .line 1910
    .line 1911
    move-object v6, v14

    .line 1912
    :try_start_36
    invoke-virtual/range {v3 .. v8}, Lqy0;->Ν(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z

    .line 1913
    .line 1914
    .line 1915
    move-result v0

    .line 1916
    goto :goto_2a

    .line 1917
    :catchall_2a
    move-exception v0

    .line 1918
    goto :goto_29

    .line 1919
    :cond_2c
    move-object v6, v14

    .line 1920
    new-instance v0, Lpm;

    .line 1921
    .line 1922
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1923
    .line 1924
    .line 1925
    throw v0

    .line 1926
    :cond_2d
    move-object v6, v14

    .line 1927
    invoke-virtual/range {v3 .. v8}, Lqy0;->Λ(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v0

    .line 1931
    goto :goto_2a

    .line 1932
    :cond_2e
    move-object v6, v14

    .line 1933
    invoke-virtual/range {v3 .. v8}, Lqy0;->Μ(Landroid/content/Context;Lf8;Lzy0;ZLjava/lang/String;)Z

    .line 1934
    .line 1935
    .line 1936
    move-result v0
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_2a

    .line 1937
    goto :goto_2a

    .line 1938
    :catchall_2b
    move-exception v0

    .line 1939
    move-object v6, v14

    .line 1940
    :goto_29
    iget-object v7, v6, Lzy0;->δ:Ljava/lang/String;

    .line 1941
    .line 1942
    iget-object v6, v6, Lzy0;->ε:Ljava/lang/String;

    .line 1943
    .line 1944
    const-string v12, " "

    .line 1945
    .line 1946
    const-string v14, " \u5931\u8d25"

    .line 1947
    .line 1948
    const-string v15, "[SELECT-DL-FAIL] "

    .line 1949
    .line 1950
    invoke-static {v15, v7, v12, v6, v14}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v6

    .line 1954
    const-string v7, "DYHelper"

    .line 1955
    .line 1956
    invoke-static {v7, v6, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1957
    .line 1958
    .line 1959
    move v0, v10

    .line 1960
    :goto_2a
    if-eqz v0, :cond_2f

    .line 1961
    .line 1962
    add-int/lit8 v11, v11, 0x1

    .line 1963
    .line 1964
    :cond_2f
    move v0, v13

    .line 1965
    goto :goto_28

    .line 1966
    :cond_30
    const/16 v0, 0x64

    .line 1967
    .line 1968
    const-string v1, "\u4e0b\u8f7d\u5b8c\u6210"

    .line 1969
    .line 1970
    invoke-static {v0, v4, v7, v1}, Lqy0;->в(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1971
    .line 1972
    .line 1973
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1974
    .line 1975
    .line 1976
    move-result v0

    .line 1977
    const-string v3, "\u5df2\u5b8c\u6210 "

    .line 1978
    .line 1979
    const-string v5, " \u9879"

    .line 1980
    .line 1981
    invoke-static {v3, v11, v12, v0, v5}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v0

    .line 1985
    invoke-static {v4, v1, v0, v7}, Lqy0;->Е(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1986
    .line 1987
    .line 1988
    new-instance v0, Lgs;

    .line 1989
    .line 1990
    const/4 v1, 0x3

    .line 1991
    invoke-direct {v0, v11, v1, v4, v2}, Lgs;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 1992
    .line 1993
    .line 1994
    invoke-virtual {v4, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1995
    .line 1996
    .line 1997
    sget-object v0, Ls62;->α:Ls62;

    .line 1998
    .line 1999
    return-object v0

    .line 2000
    :pswitch_1
    invoke-direct {v1}, Lbf0;->β()Ljava/lang/Object;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v0

    .line 2004
    return-object v0

    .line 2005
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
